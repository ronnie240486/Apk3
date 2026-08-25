package io.realm;

/* JADX INFO: compiled from: ManagedMapManager.java */
/* JADX INFO: loaded from: classes.dex */
class RealmModelValueOperator<K, V> extends io.realm.MapValueOperator<K, V> {
    public RealmModelValueOperator(io.realm.BaseRealm r7, io.realm.internal.OsMap r8, io.realm.TypeSelectorForMap<K, V> r9) {
            r6 = this;
            java.lang.Class<io.realm.RealmModel> r1 = io.realm.RealmModel.class
            io.realm.RealmMapEntrySet$IteratorType r5 = io.realm.RealmMapEntrySet.IteratorType.OBJECT
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // io.realm.MapValueOperator
    public final boolean containsValue(@javax.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto L17
            java.lang.Class<io.realm.RealmModel> r0 = io.realm.RealmModel.class
            java.lang.Class r1 = r3.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto Lf
            goto L17
        Lf:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            java.lang.String r0 = "Only RealmModel values can be used with 'containsValue'."
            r3.<init>(r0)
            throw r3
        L17:
            boolean r3 = r2.containsValueInternal(r3)
            return r3
    }

    @Override // io.realm.MapValueOperator
    public final boolean containsValueInternal(@javax.annotation.Nullable java.lang.Object r6) {
            r5 = this;
            if (r6 != 0) goto La
            io.realm.internal.OsMap r6 = r5.osMap
            r0 = 0
            boolean r6 = r6.containsPrimitiveValue(r0)
            return r6
        La:
            boolean r0 = r6 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L2b
            io.realm.internal.RealmObjectProxy r6 = (io.realm.internal.RealmObjectProxy) r6
            io.realm.ProxyState r6 = r6.realmGet$proxyState()
            io.realm.internal.Row r6 = r6.getRow$realm()
            io.realm.internal.Table r0 = r6.getTable()
            long r0 = r0.getNativePtr()
            io.realm.internal.OsMap r2 = r5.osMap
            long r3 = r6.getObjectKey()
            boolean r6 = r2.containsRealmModel(r3, r0)
            return r6
        L2b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only managed models can be contained in this dictionary."
            r6.<init>(r0)
            throw r6
    }

    @Override // io.realm.MapValueOperator
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r5 = this;
            io.realm.RealmMapEntrySet r0 = new io.realm.RealmMapEntrySet
            io.realm.BaseRealm r1 = r5.baseRealm
            io.realm.internal.OsMap r2 = r5.osMap
            io.realm.RealmMapEntrySet$IteratorType r3 = io.realm.RealmMapEntrySet.IteratorType.OBJECT
            io.realm.TypeSelectorForMap<K, V> r4 = r5.typeSelectorForMap
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // io.realm.MapValueOperator
    @javax.annotation.Nullable
    public final V get(java.lang.Object r5) {
            r4 = this;
            io.realm.internal.OsMap r0 = r4.osMap
            long r0 = r0.getModelRowKey(r5)
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto Le
            r5 = 0
            return r5
        Le:
            io.realm.TypeSelectorForMap<K, V> r5 = r4.typeSelectorForMap
            io.realm.BaseRealm r2 = r4.baseRealm
            java.lang.Object r5 = r5.getRealmModel(r2, r0)
            return r5
    }

    @Override // io.realm.MapValueOperator
    @javax.annotation.Nullable
    public final V put(K r4, @javax.annotation.Nullable V r5) {
            r3 = this;
            io.realm.TypeSelectorForMap<K, V> r0 = r3.typeSelectorForMap
            io.realm.BaseRealm r1 = r3.baseRealm
            io.realm.internal.OsMap r2 = r3.osMap
            java.lang.Object r4 = r0.putRealmModel(r1, r2, r4, r5)
            return r4
    }
}
