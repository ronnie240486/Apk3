package io.realm;

/* JADX INFO: compiled from: SetValueOperator.java */
/* JADX INFO: loaded from: classes2.dex */
class RealmAnySetOperator extends io.realm.SetValueOperator<io.realm.RealmAny> {
    public RealmAnySetOperator(io.realm.BaseRealm r2, io.realm.internal.OsSet r3) {
            r1 = this;
            java.lang.Class<io.realm.RealmAny> r0 = io.realm.RealmAny.class
            r1.<init>(r2, r3, r0)
            return
    }

    private void checkValidObject(io.realm.RealmAny r3) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.baseRealm     // Catch: java.lang.IllegalArgumentException -> L6
            r3.checkValidObject(r0)     // Catch: java.lang.IllegalArgumentException -> L6
            return
        L6:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "RealmAny collection contains unmanaged objects."
            r0.<init>(r1, r3)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    private io.realm.RealmAny getManagedRealmAny(@javax.annotation.Nullable io.realm.RealmAny r4) {
            r3 = this;
            if (r4 != 0) goto L7
            io.realm.RealmAny r4 = io.realm.RealmAny.nullValue()
            goto L32
        L7:
            io.realm.RealmAny$Type r0 = r4.getType()
            io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.OBJECT
            if (r0 != r1) goto L32
            java.lang.Class<io.realm.RealmModel> r0 = io.realm.RealmModel.class
            io.realm.RealmModel r4 = r4.asRealmModel(r0)
            io.realm.BaseRealm r0 = r3.baseRealm
            java.lang.Class<E> r1 = r3.valueClass
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "set"
            boolean r0 = io.realm.CollectionUtils.checkCanObjectBeCopied(r0, r4, r1, r2)
            if (r0 == 0) goto L2c
            io.realm.BaseRealm r0 = r3.baseRealm
            io.realm.RealmModel r4 = io.realm.CollectionUtils.copyToRealm(r0, r4)
        L2c:
            io.realm.internal.RealmObjectProxy r4 = (io.realm.internal.RealmObjectProxy) r4
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
        L32:
            return r4
    }

    @org.jetbrains.annotations.NotNull
    private io.realm.internal.core.NativeRealmAnyCollection getNativeRealmAnyCollection(java.util.Collection<? extends io.realm.RealmAny> r6) {
            r5 = this;
            int r0 = r6.size()
            long[] r0 = new long[r0]
            int r1 = r6.size()
            boolean[] r1 = new boolean[r1]
            java.util.Iterator r6 = r6.iterator()
            r2 = 0
        L11:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r6.next()
            io.realm.RealmAny r3 = (io.realm.RealmAny) r3
            if (r3 == 0) goto L2b
            r5.checkValidObject(r3)
            long r3 = r3.getNativePtr()
            r0[r2] = r3
            r3 = 1
            r1[r2] = r3
        L2b:
            int r2 = r2 + 1
            goto L11
        L2e:
            io.realm.internal.core.NativeRealmAnyCollection r6 = io.realm.internal.core.NativeRealmAnyCollection.newRealmAnyCollection(r0, r1)
            return r6
    }

    @Override // io.realm.SetValueOperator
    public final boolean add(@javax.annotation.Nullable io.realm.RealmAny r4) {
            r3 = this;
            io.realm.RealmAny r4 = (io.realm.RealmAny) r4
            io.realm.RealmAny r4 = r3.getManagedRealmAny(r4)
            io.realm.internal.OsSet r0 = r3.osSet
            long r1 = r4.getNativePtr()
            boolean r4 = r0.addRealmAny(r1)
            return r4
    }

    @Override // io.realm.SetValueOperator
    public final boolean addAllInternal(java.util.Collection<? extends io.realm.RealmAny> r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r3.next()
            io.realm.RealmAny r1 = (io.realm.RealmAny) r1
            io.realm.RealmAny r1 = r2.getManagedRealmAny(r1)
            r0.add(r1)
            goto Ld
        L21:
            io.realm.internal.core.NativeRealmAnyCollection r3 = r2.getNativeRealmAnyCollection(r0)
            io.realm.internal.OsSet r0 = r2.osSet
            io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.ADD_ALL
            boolean r3 = r0.collectionFunnel(r3, r1)
            return r3
    }

    @Override // io.realm.SetValueOperator
    public final boolean containsAllInternal(java.util.Collection<?> r3) {
            r2 = this;
            io.realm.internal.core.NativeRealmAnyCollection r3 = r2.getNativeRealmAnyCollection(r3)
            io.realm.internal.OsSet r0 = r2.osSet
            io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.CONTAINS_ALL
            boolean r3 = r0.collectionFunnel(r3, r1)
            return r3
    }

    @Override // io.realm.SetValueOperator
    public final boolean containsInternal(@javax.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L7
            io.realm.RealmAny r4 = io.realm.RealmAny.nullValue()
            goto L9
        L7:
            io.realm.RealmAny r4 = (io.realm.RealmAny) r4
        L9:
            r3.checkValidObject(r4)
            io.realm.internal.OsSet r0 = r3.osSet
            long r1 = r4.getNativePtr()
            boolean r4 = r0.containsRealmAny(r1)
            return r4
    }

    @Override // io.realm.SetValueOperator
    public final boolean removeAllInternal(java.util.Collection<?> r3) {
            r2 = this;
            io.realm.internal.core.NativeRealmAnyCollection r3 = r2.getNativeRealmAnyCollection(r3)
            io.realm.internal.OsSet r0 = r2.osSet
            io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.REMOVE_ALL
            boolean r3 = r0.collectionFunnel(r3, r1)
            return r3
    }

    @Override // io.realm.SetValueOperator
    public final boolean removeInternal(@javax.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L7
            io.realm.RealmAny r4 = io.realm.RealmAny.nullValue()
            goto L9
        L7:
            io.realm.RealmAny r4 = (io.realm.RealmAny) r4
        L9:
            r3.checkValidObject(r4)
            io.realm.internal.OsSet r0 = r3.osSet
            long r1 = r4.getNativePtr()
            boolean r4 = r0.removeRealmAny(r1)
            return r4
    }

    @Override // io.realm.SetValueOperator
    public final boolean retainAllInternal(java.util.Collection<?> r3) {
            r2 = this;
            io.realm.internal.core.NativeRealmAnyCollection r3 = r2.getNativeRealmAnyCollection(r3)
            io.realm.internal.OsSet r0 = r2.osSet
            io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.RETAIN_ALL
            boolean r3 = r0.collectionFunnel(r3, r1)
            return r3
    }
}
