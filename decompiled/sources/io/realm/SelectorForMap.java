package io.realm;

/* JADX INFO: compiled from: TypeSelectorForMap.java */
/* JADX INFO: loaded from: classes2.dex */
class SelectorForMap<K, V> extends io.realm.TypeSelectorForMap<K, V> {
    public final java.lang.Class<K> keyClass;
    public final java.lang.Class<V> valueClass;

    public SelectorForMap(io.realm.BaseRealm r2, io.realm.internal.OsMap r3, java.lang.Class r4) {
            r1 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1.<init>(r2, r3)
            r1.keyClass = r0
            r1.valueClass = r4
            return
    }

    private <T> io.realm.RealmResults<T> produceResults(io.realm.BaseRealm r4, io.realm.internal.util.Pair<io.realm.internal.Table, java.lang.Long> r5, boolean r6, java.lang.Class<T> r7) {
            r3 = this;
            S r5 = r5.second
            java.lang.Long r5 = (java.lang.Long) r5
            io.realm.internal.OsSharedRealm r0 = r4.sharedRealm
            long r1 = r5.longValue()
            io.realm.internal.OsResults r5 = io.realm.internal.OsResults.createFromMap(r0, r1)
            io.realm.RealmResults r0 = new io.realm.RealmResults
            r0.<init>(r4, r5, r7, r6)
            return r0
    }

    @Override // io.realm.TypeSelectorForMap
    public io.realm.RealmDictionary<V> freeze(io.realm.BaseRealm r4) {
            r3 = this;
            io.realm.RealmDictionary r0 = new io.realm.RealmDictionary
            io.realm.internal.OsMap r1 = r3.osMap
            java.lang.Class<V> r2 = r3.valueClass
            r0.<init>(r4, r1, r2)
            return r0
    }

    @Override // io.realm.TypeSelectorForMap
    public final java.lang.Class<V> getValueClass() {
            r1 = this;
            java.lang.Class<V> r0 = r1.valueClass
            return r0
    }

    @Override // io.realm.TypeSelectorForMap
    public final java.lang.String getValueClassName() {
            r1 = this;
            java.lang.Class<V> r0 = r1.valueClass
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    @Override // io.realm.TypeSelectorForMap
    public java.util.Collection<V> getValues() {
            r4 = this;
            java.lang.Class<V> r0 = r4.valueClass
            boolean r0 = io.realm.CollectionUtils.isClassForRealmModel(r0)
            r0 = r0 ^ 1
            io.realm.BaseRealm r1 = r4.baseRealm
            io.realm.internal.OsMap r2 = r4.osMap
            io.realm.internal.util.Pair r2 = r2.tableAndValuePtrs()
            java.lang.Class<V> r3 = r4.valueClass
            io.realm.RealmResults r0 = r4.produceResults(r1, r2, r0, r3)
            return r0
    }

    @Override // io.realm.TypeSelectorForMap
    public java.util.Set<K> keySet() {
            r5 = this;
            java.util.HashSet r0 = new java.util.HashSet
            io.realm.BaseRealm r1 = r5.baseRealm
            io.realm.internal.OsMap r2 = r5.osMap
            io.realm.internal.util.Pair r2 = r2.tableAndKeyPtrs()
            java.lang.Class<K> r3 = r5.keyClass
            r4 = 1
            io.realm.RealmResults r1 = r5.produceResults(r1, r2, r4, r3)
            r0.<init>(r1)
            return r0
    }
}
