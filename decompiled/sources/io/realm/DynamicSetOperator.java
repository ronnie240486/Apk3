package io.realm;

/* JADX INFO: compiled from: SetValueOperator.java */
/* JADX INFO: loaded from: classes.dex */
class DynamicSetOperator extends io.realm.SetValueOperator<io.realm.DynamicRealmObject> {
    public DynamicSetOperator(io.realm.BaseRealm r1, io.realm.internal.OsSet r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private void checkValidCollection(java.util.Collection<? extends io.realm.DynamicRealmObject> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.next()
            io.realm.DynamicRealmObject r0 = (io.realm.DynamicRealmObject) r0
            r1.checkValidObject(r0)
            goto L4
        L14:
            return
    }

    private void checkValidObject(io.realm.RealmModel r2) {
            r1 = this;
            java.lang.String r0 = "This set does not permit null values."
            java.util.Objects.requireNonNull(r2, r0)
            boolean r0 = io.realm.RealmObject.isValid(r2)
            if (r0 == 0) goto L28
            boolean r0 = io.realm.RealmObject.isManaged(r2)
            if (r0 == 0) goto L28
            io.realm.internal.RealmObjectProxy r2 = (io.realm.internal.RealmObjectProxy) r2
            io.realm.ProxyState r2 = r2.realmGet$proxyState()
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            io.realm.BaseRealm r0 = r1.baseRealm
            if (r2 != r0) goto L20
            return
        L20:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "'value' belongs to a different Realm."
            r2.<init>(r0)
            throw r2
        L28:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "'value' is not a valid managed object."
            r2.<init>(r0)
            throw r2
    }

    private io.realm.DynamicRealmObject getManagedObject(io.realm.DynamicRealmObject r4) {
            r3 = this;
            java.lang.String r0 = "This set does not permit null values."
            java.util.Objects.requireNonNull(r4, r0)
            io.realm.BaseRealm r0 = r3.baseRealm
            java.lang.String r1 = r3.className
            java.lang.String r2 = "set"
            boolean r0 = io.realm.CollectionUtils.checkCanObjectBeCopied(r0, r4, r1, r2)
            if (r0 == 0) goto L18
            io.realm.BaseRealm r0 = r3.baseRealm
            io.realm.RealmModel r4 = io.realm.CollectionUtils.copyToRealm(r0, r4)
        L18:
            io.realm.DynamicRealmObject r4 = (io.realm.DynamicRealmObject) r4
            return r4
    }

    @Override // io.realm.SetValueOperator
    public final boolean add(io.realm.DynamicRealmObject r4) {
            r3 = this;
            io.realm.DynamicRealmObject r4 = (io.realm.DynamicRealmObject) r4
            io.realm.DynamicRealmObject r4 = r3.getManagedObject(r4)
            io.realm.ProxyState r4 = r4.realmGet$proxyState()
            io.realm.internal.Row r4 = r4.getRow$realm()
            io.realm.internal.OsSet r0 = r3.osSet
            long r1 = r4.getObjectKey()
            boolean r4 = r0.addRow(r1)
            return r4
    }

    @Override // io.realm.SetValueOperator
    public final boolean addAllInternal(java.util.Collection<? extends io.realm.DynamicRealmObject> r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r3.next()
            io.realm.DynamicRealmObject r1 = (io.realm.DynamicRealmObject) r1
            io.realm.DynamicRealmObject r1 = r2.getManagedObject(r1)
            r0.add(r1)
            goto Ld
        L21:
            io.realm.internal.core.NativeRealmAnyCollection r3 = io.realm.internal.core.NativeRealmAnyCollection.newRealmModelCollection(r0)
            io.realm.internal.OsSet r0 = r2.osSet
            io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.ADD_ALL
            boolean r3 = r0.collectionFunnel(r3, r1)
            return r3
    }

    @Override // io.realm.SetValueOperator
    public final boolean containsAllInternal(java.util.Collection<?> r3) {
            r2 = this;
            r2.checkValidCollection(r3)
            io.realm.internal.core.NativeRealmAnyCollection r3 = io.realm.internal.core.NativeRealmAnyCollection.newRealmModelCollection(r3)
            io.realm.internal.OsSet r0 = r2.osSet
            io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.CONTAINS_ALL
            boolean r3 = r0.collectionFunnel(r3, r1)
            return r3
    }

    @Override // io.realm.SetValueOperator
    public final boolean containsInternal(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            io.realm.RealmModel r0 = (io.realm.RealmModel) r0
            r3.checkValidObject(r0)
            io.realm.internal.RealmObjectProxy r4 = (io.realm.internal.RealmObjectProxy) r4
            io.realm.ProxyState r4 = r4.realmGet$proxyState()
            io.realm.internal.Row r4 = r4.getRow$realm()
            io.realm.internal.OsSet r0 = r3.osSet
            long r1 = r4.getObjectKey()
            boolean r4 = r0.containsRow(r1)
            return r4
    }

    @Override // io.realm.SetValueOperator
    public final boolean removeAllInternal(java.util.Collection<?> r3) {
            r2 = this;
            r2.checkValidCollection(r3)
            io.realm.internal.core.NativeRealmAnyCollection r3 = io.realm.internal.core.NativeRealmAnyCollection.newRealmModelCollection(r3)
            io.realm.internal.OsSet r0 = r2.osSet
            io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.REMOVE_ALL
            boolean r3 = r0.collectionFunnel(r3, r1)
            return r3
    }

    @Override // io.realm.SetValueOperator
    public final boolean removeInternal(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            io.realm.RealmModel r0 = (io.realm.RealmModel) r0
            r3.checkValidObject(r0)
            io.realm.internal.RealmObjectProxy r4 = (io.realm.internal.RealmObjectProxy) r4
            io.realm.ProxyState r4 = r4.realmGet$proxyState()
            io.realm.internal.Row r4 = r4.getRow$realm()
            io.realm.internal.OsSet r0 = r3.osSet
            long r1 = r4.getObjectKey()
            boolean r4 = r0.removeRow(r1)
            return r4
    }

    @Override // io.realm.SetValueOperator
    public final boolean retainAllInternal(java.util.Collection<?> r3) {
            r2 = this;
            r2.checkValidCollection(r3)
            io.realm.internal.core.NativeRealmAnyCollection r3 = io.realm.internal.core.NativeRealmAnyCollection.newRealmModelCollection(r3)
            io.realm.internal.OsSet r0 = r2.osSet
            io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.RETAIN_ALL
            boolean r3 = r0.collectionFunnel(r3, r1)
            return r3
    }

    @Override // io.realm.SetValueOperator
    public final io.realm.RealmQuery<io.realm.DynamicRealmObject> where() {
            r4 = this;
            io.realm.RealmQuery r0 = new io.realm.RealmQuery
            io.realm.BaseRealm r1 = r4.baseRealm
            io.realm.internal.OsSet r2 = r4.osSet
            java.lang.Class<E> r3 = r4.valueClass
            r0.<init>(r1, r2, r3)
            return r0
    }
}
