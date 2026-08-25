package io.realm;

/* JADX INFO: compiled from: ManagedListOperator.java */
/* JADX INFO: loaded from: classes.dex */
final class RealmModelListOperator<T> extends io.realm.ManagedListOperator<T> {

    @javax.annotation.Nullable
    private final java.lang.String className;

    public RealmModelListOperator(io.realm.BaseRealm r1, io.realm.internal.OsList r2, @javax.annotation.Nullable java.lang.Class<T> r3, @javax.annotation.Nullable java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.className = r4
            return
    }

    @Override // io.realm.ManagedListOperator
    public void appendValue(java.lang.Object r5) {
            r4 = this;
            r0 = r5
            io.realm.RealmModel r0 = (io.realm.RealmModel) r0
            io.realm.BaseRealm r1 = r4.realm
            java.lang.String r2 = r4.className
            java.lang.String r3 = "list"
            boolean r1 = io.realm.CollectionUtils.checkCanObjectBeCopied(r1, r0, r2, r3)
            io.realm.BaseRealm r2 = r4.realm
            boolean r2 = io.realm.CollectionUtils.isEmbedded(r2, r0)
            if (r2 == 0) goto L2f
            boolean r5 = r5 instanceof io.realm.DynamicRealmObject
            if (r5 != 0) goto L27
            io.realm.internal.OsList r5 = r4.osList
            long r1 = r5.createAndAddEmbeddedObject()
            io.realm.BaseRealm r5 = r4.realm
            io.realm.Realm r5 = (io.realm.Realm) r5
            io.realm.CollectionUtils.updateEmbeddedObject(r5, r0, r1)
            goto L4a
        L27:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Embedded objects are not supported by RealmLists of DynamicRealmObjects yet."
            r5.<init>(r0)
            throw r5
        L2f:
            if (r1 == 0) goto L37
            io.realm.BaseRealm r5 = r4.realm
            io.realm.RealmModel r0 = io.realm.CollectionUtils.copyToRealm(r5, r0)
        L37:
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            io.realm.internal.OsList r5 = r4.osList
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getObjectKey()
            r5.addRow(r0)
        L4a:
            return
    }

    @Override // io.realm.ManagedListOperator
    public final void checkValidValue(@javax.annotation.Nullable java.lang.Object r6) {
            r5 = this;
            if (r6 == 0) goto L28
            boolean r0 = r6 instanceof io.realm.RealmModel
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.ENGLISH
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = "java.lang.String"
            r2[r3] = r4
            r3 = 1
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r2[r3] = r6
            java.lang.String r6 = "Unacceptable value type. Acceptable: %1$s, actual: %2$s ."
            java.lang.String r6 = java.lang.String.format(r1, r6, r2)
            r0.<init>(r6)
            throw r0
        L28:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "RealmList does not accept null values."
            r6.<init>(r0)
            throw r6
    }

    @Override // io.realm.ManagedListOperator
    public boolean forRealmModel() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.realm.ManagedListOperator
    public T get(int r7) {
            r6 = this;
            io.realm.BaseRealm r0 = r6.realm
            java.lang.Class<T> r1 = r6.clazz
            java.lang.String r2 = r6.className
            io.realm.internal.OsList r3 = r6.osList
            long r4 = (long) r7
            io.realm.internal.UncheckedRow r7 = r3.getUncheckedRow(r4)
            io.realm.RealmModel r7 = r0.get(r1, r2, r7)
            return r7
    }

    @Override // io.realm.ManagedListOperator
    public final void insertNull(int r2) {
            r1 = this;
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "Should not reach here."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.realm.ManagedListOperator
    public void insertValue(int r6, java.lang.Object r7) {
            r5 = this;
            r5.checkInsertIndex(r6)
            r0 = r7
            io.realm.RealmModel r0 = (io.realm.RealmModel) r0
            io.realm.BaseRealm r1 = r5.realm
            java.lang.String r2 = r5.className
            java.lang.String r3 = "list"
            boolean r1 = io.realm.CollectionUtils.checkCanObjectBeCopied(r1, r0, r2, r3)
            io.realm.BaseRealm r2 = r5.realm
            boolean r2 = io.realm.CollectionUtils.isEmbedded(r2, r0)
            if (r2 == 0) goto L33
            boolean r7 = r7 instanceof io.realm.DynamicRealmObject
            if (r7 != 0) goto L2b
            io.realm.internal.OsList r7 = r5.osList
            long r1 = (long) r6
            long r6 = r7.createAndAddEmbeddedObject(r1)
            io.realm.BaseRealm r1 = r5.realm
            io.realm.Realm r1 = (io.realm.Realm) r1
            io.realm.CollectionUtils.updateEmbeddedObject(r1, r0, r6)
            goto L4f
        L2b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Embedded objects are not supported by RealmLists of DynamicRealmObjects yet."
            r6.<init>(r7)
            throw r6
        L33:
            if (r1 == 0) goto L3b
            io.realm.BaseRealm r7 = r5.realm
            io.realm.RealmModel r0 = io.realm.CollectionUtils.copyToRealm(r7, r0)
        L3b:
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            io.realm.internal.OsList r7 = r5.osList
            long r1 = (long) r6
            io.realm.ProxyState r6 = r0.realmGet$proxyState()
            io.realm.internal.Row r6 = r6.getRow$realm()
            long r3 = r6.getObjectKey()
            r7.insertRow(r1, r3)
        L4f:
            return
    }

    @Override // io.realm.ManagedListOperator
    public final void setNull(int r2) {
            r1 = this;
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "Should not reach here."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.realm.ManagedListOperator
    public final void setValue(int r6, java.lang.Object r7) {
            r5 = this;
            r0 = r7
            io.realm.RealmModel r0 = (io.realm.RealmModel) r0
            io.realm.BaseRealm r1 = r5.realm
            java.lang.String r2 = r5.className
            java.lang.String r3 = "list"
            boolean r1 = io.realm.CollectionUtils.checkCanObjectBeCopied(r1, r0, r2, r3)
            io.realm.BaseRealm r2 = r5.realm
            boolean r2 = io.realm.CollectionUtils.isEmbedded(r2, r0)
            if (r2 == 0) goto L30
            boolean r7 = r7 instanceof io.realm.DynamicRealmObject
            if (r7 != 0) goto L28
            io.realm.internal.OsList r7 = r5.osList
            long r1 = (long) r6
            long r6 = r7.createAndSetEmbeddedObject(r1)
            io.realm.BaseRealm r1 = r5.realm
            io.realm.Realm r1 = (io.realm.Realm) r1
            io.realm.CollectionUtils.updateEmbeddedObject(r1, r0, r6)
            goto L4c
        L28:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Embedded objects are not supported by RealmLists of DynamicRealmObjects yet."
            r6.<init>(r7)
            throw r6
        L30:
            if (r1 == 0) goto L38
            io.realm.BaseRealm r7 = r5.realm
            io.realm.RealmModel r0 = io.realm.CollectionUtils.copyToRealm(r7, r0)
        L38:
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            io.realm.internal.OsList r7 = r5.osList
            long r1 = (long) r6
            io.realm.ProxyState r6 = r0.realmGet$proxyState()
            io.realm.internal.Row r6 = r6.getRow$realm()
            long r3 = r6.getObjectKey()
            r7.setRow(r1, r3)
        L4c:
            return
    }
}
