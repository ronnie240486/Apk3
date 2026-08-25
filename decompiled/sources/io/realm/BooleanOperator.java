package io.realm;

/* JADX INFO: compiled from: SetValueOperator.java */
/* JADX INFO: loaded from: classes2.dex */
class BooleanOperator extends io.realm.SetValueOperator<java.lang.Boolean> {
    public BooleanOperator(io.realm.BaseRealm r2, io.realm.internal.OsSet r3) {
            r1 = this;
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            r1.<init>(r2, r3, r0)
            return
    }

    @Override // io.realm.SetValueOperator
    public final boolean add(@javax.annotation.Nullable java.lang.Boolean r2) {
            r1 = this;
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            io.realm.internal.OsSet r0 = r1.osSet
            boolean r2 = r0.add(r2)
            return r2
    }

    @Override // io.realm.SetValueOperator
    public final boolean addAllInternal(java.util.Collection<? extends java.lang.Boolean> r3) {
            r2 = this;
            io.realm.internal.core.NativeRealmAnyCollection r3 = io.realm.internal.core.NativeRealmAnyCollection.newBooleanCollection(r3)
            io.realm.internal.OsSet r0 = r2.osSet
            io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.ADD_ALL
            boolean r3 = r0.collectionFunnel(r3, r1)
            return r3
    }

    @Override // io.realm.SetValueOperator
    public final boolean containsAllInternal(java.util.Collection<?> r3) {
            r2 = this;
            io.realm.internal.core.NativeRealmAnyCollection r3 = io.realm.internal.core.NativeRealmAnyCollection.newBooleanCollection(r3)
            io.realm.internal.OsSet r0 = r2.osSet
            io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.CONTAINS_ALL
            boolean r3 = r0.collectionFunnel(r3, r1)
            return r3
    }

    @Override // io.realm.SetValueOperator
    public final boolean containsInternal(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            io.realm.internal.OsSet r0 = r1.osSet
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // io.realm.SetValueOperator
    public final boolean removeAllInternal(java.util.Collection<?> r3) {
            r2 = this;
            io.realm.internal.core.NativeRealmAnyCollection r3 = io.realm.internal.core.NativeRealmAnyCollection.newBooleanCollection(r3)
            io.realm.internal.OsSet r0 = r2.osSet
            io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.REMOVE_ALL
            boolean r3 = r0.collectionFunnel(r3, r1)
            return r3
    }

    @Override // io.realm.SetValueOperator
    public final boolean removeInternal(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            io.realm.internal.OsSet r0 = r1.osSet
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r0.remove(r2)
            return r2
    }

    @Override // io.realm.SetValueOperator
    public final boolean retainAllInternal(java.util.Collection<?> r3) {
            r2 = this;
            io.realm.internal.core.NativeRealmAnyCollection r3 = io.realm.internal.core.NativeRealmAnyCollection.newBooleanCollection(r3)
            io.realm.internal.OsSet r0 = r2.osSet
            io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.RETAIN_ALL
            boolean r3 = r0.collectionFunnel(r3, r1)
            return r3
    }
}
