package io.realm;

/* JADX INFO: compiled from: ManagedMapManager.java */
/* JADX INFO: loaded from: classes2.dex */
class RealmAnyValueOperator<K> extends io.realm.MapValueOperator<K, io.realm.RealmAny> {
    public RealmAnyValueOperator(io.realm.BaseRealm r7, io.realm.internal.OsMap r8, io.realm.TypeSelectorForMap<K, io.realm.RealmAny> r9) {
            r6 = this;
            java.lang.Class<io.realm.RealmAny> r1 = io.realm.RealmAny.class
            io.realm.RealmMapEntrySet$IteratorType r5 = io.realm.RealmMapEntrySet.IteratorType.MIXED
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // io.realm.MapValueOperator
    public final boolean containsValueInternal(@javax.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            boolean r0 = r4 instanceof io.realm.RealmAny
            if (r0 == 0) goto L15
            io.realm.internal.OsMap r0 = r3.osMap
            io.realm.RealmAny r4 = (io.realm.RealmAny) r4
            long r1 = r4.getNativePtr()
            boolean r4 = r0.containsRealmAnyValue(r1)
            return r4
        L15:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "This dictionary can only contain 'RealmAny' values."
            r4.<init>(r0)
            throw r4
    }

    @Override // io.realm.MapValueOperator
    public final java.util.Set<java.util.Map.Entry<K, io.realm.RealmAny>> entrySet() {
            r5 = this;
            io.realm.RealmMapEntrySet r0 = new io.realm.RealmMapEntrySet
            io.realm.BaseRealm r1 = r5.baseRealm
            io.realm.internal.OsMap r2 = r5.osMap
            io.realm.RealmMapEntrySet$IteratorType r3 = io.realm.RealmMapEntrySet.IteratorType.MIXED
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.MapValueOperator
    @javax.annotation.Nullable
    public final io.realm.RealmAny get(java.lang.Object r5) {
            r4 = this;
            io.realm.internal.OsMap r0 = r4.osMap
            long r0 = r0.getRealmAnyPtr(r5)
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto Le
            r5 = 0
            return r5
        Le:
            io.realm.internal.core.NativeRealmAny r5 = new io.realm.internal.core.NativeRealmAny
            r5.<init>(r0)
            io.realm.RealmAny r0 = new io.realm.RealmAny
            io.realm.BaseRealm r1 = r4.baseRealm
            io.realm.RealmAnyOperator r5 = io.realm.RealmAnyOperator.fromNativeRealmAny(r1, r5)
            r0.<init>(r5)
            return r0
    }

    @Override // io.realm.MapValueOperator
    @javax.annotation.Nullable
    public final /* bridge */ /* synthetic */ io.realm.RealmAny get(java.lang.Object r1) {
            r0 = this;
            io.realm.RealmAny r1 = r0.get(r1)
            return r1
    }

    @Override // io.realm.MapValueOperator
    @javax.annotation.Nullable
    public final io.realm.RealmAny put(java.lang.Object r5, @javax.annotation.Nullable io.realm.RealmAny r6) {
            r4 = this;
            io.realm.RealmAny r6 = (io.realm.RealmAny) r6
            io.realm.RealmAny r0 = r4.get(r5)
            if (r6 != 0) goto Lf
            io.realm.internal.OsMap r6 = r4.osMap
            r1 = 0
            r6.put(r5, r1)
            goto L1e
        Lf:
            io.realm.internal.OsMap r1 = r4.osMap
            io.realm.BaseRealm r2 = r4.baseRealm
            io.realm.RealmAny r6 = io.realm.CollectionUtils.copyToRealmIfNeeded(r2, r6)
            long r2 = r6.getNativePtr()
            r1.putRealmAny(r5, r2)
        L1e:
            return r0
    }
}
