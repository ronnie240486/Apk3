package io.realm;

/* JADX INFO: compiled from: ManagedMapManager.java */
/* JADX INFO: loaded from: classes3.dex */
class DictionaryManager<V> extends io.realm.ManagedMapManager<java.lang.String, V> {
    public DictionaryManager(io.realm.BaseRealm r1, io.realm.MapValueOperator<java.lang.String, V> r2, io.realm.TypeSelectorForMap<java.lang.String, V> r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // io.realm.ManagedMapManager
    public final io.realm.MapChangeSet<java.lang.String> changeSetFactory(long r2) {
            r1 = this;
            io.realm.StringMapChangeSet r0 = new io.realm.StringMapChangeSet
            r0.<init>(r2)
            return r0
    }

    @Override // io.realm.ManagedMapManager
    public final boolean containsKeyInternal(java.lang.Object r3) {
            r2 = this;
            java.lang.String r0 = "Null keys are not allowed when calling 'containsKey'."
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class r1 = r3.getClass()
            if (r1 != r0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L1b
            io.realm.MapValueOperator<K, V> r0 = r2.mapValueOperator
            io.realm.internal.OsMap r0 = r0.osMap
            boolean r3 = r0.containsKey(r3)
            return r3
        L1b:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            java.lang.String r0 = "Only String keys can be used with 'containsKey'."
            r3.<init>(r0)
            throw r3
    }

    @Override // io.realm.ManagedMapManager, java.util.Map
    public java.util.Set<java.util.Map.Entry<java.lang.String, V>> entrySet() {
            r1 = this;
            io.realm.MapValueOperator<K, V> r0 = r1.mapValueOperator
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // io.realm.ManagedMapManager
    public final io.realm.RealmMap freezeInternal(io.realm.internal.util.Pair r2) {
            r1 = this;
            F r2 = r2.first
            io.realm.BaseRealm r2 = (io.realm.BaseRealm) r2
            io.realm.TypeSelectorForMap<K, V> r0 = r1.typeSelectorForMap
            io.realm.RealmDictionary r2 = r0.freeze(r2)
            return r2
    }

    @Override // java.util.Map
    public V get(java.lang.Object r3) {
            r2 = this;
            java.lang.String r0 = "Null keys are not allowed when calling 'get'."
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class r1 = r3.getClass()
            if (r1 != r0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L1b
            io.realm.MapValueOperator<K, V> r0 = r2.mapValueOperator
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r0.get(r3)
            return r3
        L1b:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            java.lang.String r0 = "Only String keys can be used with 'containsKey'."
            r3.<init>(r0)
            throw r3
    }

    @Override // io.realm.ManagedMapManager, java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, @javax.annotation.Nullable java.lang.Object r2) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r0.put(r1, r2)
            return r1
    }

    public V put(java.lang.String r2, @javax.annotation.Nullable V r3) {
            r1 = this;
            java.lang.String r0 = "Null keys are not allowed."
            java.util.Objects.requireNonNull(r2, r0)
            io.realm.MapValueOperator<K, V> r0 = r1.mapValueOperator     // Catch: java.lang.IllegalStateException -> Lc
            java.lang.Object r2 = r0.put(r2, r3)     // Catch: java.lang.IllegalStateException -> Lc
            return r2
        Lc:
            r2 = move-exception
            java.lang.String r3 = r2.getMessage()
            java.util.Objects.requireNonNull(r3)
            java.lang.String r0 = "Data type mismatch"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L24
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "Cannot insert null values in a dictionary marked with '@Required'."
            r2.<init>(r3)
            throw r2
        L24:
            throw r2
    }

    @Override // io.realm.ManagedMapManager
    public final void validateMap(java.util.Map<? extends java.lang.String, ? extends V> r3) {
            r2 = this;
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "Null keys are not allowed."
            java.util.Objects.requireNonNull(r0, r1)
            goto L8
        L20:
            return
    }
}
