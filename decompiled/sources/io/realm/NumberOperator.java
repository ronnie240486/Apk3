package io.realm;

/* JADX INFO: compiled from: SetValueOperator.java */
/* JADX INFO: loaded from: classes2.dex */
class NumberOperator extends io.realm.SetValueOperator<java.lang.Number> {
    public NumberOperator(io.realm.BaseRealm r1, io.realm.internal.OsSet r2, java.lang.Class<java.lang.Number> r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // io.realm.SetValueOperator
    public final boolean add(@javax.annotation.Nullable java.lang.Number r4) {
            r3 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 != 0) goto Lc
            io.realm.internal.OsSet r4 = r3.osSet
            r0 = 0
            boolean r4 = r4.add(r0)
            goto L1a
        Lc:
            io.realm.internal.OsSet r0 = r3.osSet
            long r1 = r4.longValue()
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            boolean r4 = r0.add(r4)
        L1a:
            return r4
    }

    @Override // io.realm.SetValueOperator
    public final boolean addAllInternal(java.util.Collection<? extends java.lang.Number> r3) {
            r2 = this;
            io.realm.internal.core.NativeRealmAnyCollection r3 = io.realm.internal.core.NativeRealmAnyCollection.newIntegerCollection(r3)
            io.realm.internal.OsSet r0 = r2.osSet
            io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.ADD_ALL
            boolean r3 = r0.collectionFunnel(r3, r1)
            return r3
    }

    @Override // io.realm.SetValueOperator
    public final boolean containsAllInternal(java.util.Collection<?> r3) {
            r2 = this;
            io.realm.internal.core.NativeRealmAnyCollection r3 = io.realm.internal.core.NativeRealmAnyCollection.newIntegerCollection(r3)
            io.realm.internal.OsSet r0 = r2.osSet
            io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.CONTAINS_ALL
            boolean r3 = r0.collectionFunnel(r3, r1)
            return r3
    }

    @Override // io.realm.SetValueOperator
    public final boolean containsInternal(@javax.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto Le
        L4:
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
        Le:
            io.realm.internal.OsSet r0 = r2.osSet
            boolean r3 = r0.contains(r3)
            return r3
    }

    @Override // io.realm.SetValueOperator
    public final boolean removeAllInternal(java.util.Collection<?> r3) {
            r2 = this;
            io.realm.internal.core.NativeRealmAnyCollection r3 = io.realm.internal.core.NativeRealmAnyCollection.newIntegerCollection(r3)
            io.realm.internal.OsSet r0 = r2.osSet
            io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.REMOVE_ALL
            boolean r3 = r0.collectionFunnel(r3, r1)
            return r3
    }

    @Override // io.realm.SetValueOperator
    public final boolean removeInternal(@javax.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto La
            io.realm.internal.OsSet r4 = r3.osSet
            r0 = 0
            boolean r4 = r4.remove(r0)
            return r4
        La:
            io.realm.internal.OsSet r0 = r3.osSet
            java.lang.Number r4 = (java.lang.Number) r4
            long r1 = r4.longValue()
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            boolean r4 = r0.remove(r4)
            return r4
    }

    @Override // io.realm.SetValueOperator
    public final boolean retainAllInternal(java.util.Collection<?> r3) {
            r2 = this;
            io.realm.internal.core.NativeRealmAnyCollection r3 = io.realm.internal.core.NativeRealmAnyCollection.newIntegerCollection(r3)
            io.realm.internal.OsSet r0 = r2.osSet
            io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.RETAIN_ALL
            boolean r3 = r0.collectionFunnel(r3, r1)
            return r3
    }
}
