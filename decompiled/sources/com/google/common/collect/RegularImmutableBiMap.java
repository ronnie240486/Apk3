package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class RegularImmutableBiMap<K, V> extends com.google.common.collect.ImmutableBiMap<K, V> {
    public static final com.google.common.collect.RegularImmutableBiMap<java.lang.Object, java.lang.Object> EMPTY = null;

    @com.google.common.annotations.VisibleForTesting
    public final transient java.lang.Object[] alternatingKeysAndValues;
    private final transient com.google.common.collect.RegularImmutableBiMap<V, K> inverse;

    @javax.annotation.CheckForNull
    private final transient java.lang.Object keyHashTable;
    private final transient int keyOffset;
    private final transient int size;

    static {
            com.google.common.collect.RegularImmutableBiMap r0 = new com.google.common.collect.RegularImmutableBiMap
            r0.<init>()
            com.google.common.collect.RegularImmutableBiMap.EMPTY = r0
            return
    }

    private RegularImmutableBiMap() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.keyHashTable = r0
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2.alternatingKeysAndValues = r1
            r2.keyOffset = r0
            r2.size = r0
            r2.inverse = r2
            return
    }

    private RegularImmutableBiMap(@javax.annotation.CheckForNull java.lang.Object r1, java.lang.Object[] r2, int r3, com.google.common.collect.RegularImmutableBiMap<V, K> r4) {
            r0 = this;
            r0.<init>()
            r0.keyHashTable = r1
            r0.alternatingKeysAndValues = r2
            r1 = 1
            r0.keyOffset = r1
            r0.size = r3
            r0.inverse = r4
            return
    }

    public RegularImmutableBiMap(java.lang.Object[] r3, int r4) {
            r2 = this;
            r2.<init>()
            r2.alternatingKeysAndValues = r3
            r2.size = r4
            r0 = 0
            r2.keyOffset = r0
            r1 = 2
            if (r4 < r1) goto L12
            int r1 = com.google.common.collect.ImmutableSet.chooseTableSize(r4)
            goto L13
        L12:
            r1 = 0
        L13:
            java.lang.Object r0 = com.google.common.collect.RegularImmutableMap.createHashTable(r3, r4, r1, r0)
            r2.keyHashTable = r0
            r0 = 1
            java.lang.Object r0 = com.google.common.collect.RegularImmutableMap.createHashTable(r3, r4, r1, r0)
            com.google.common.collect.RegularImmutableBiMap r1 = new com.google.common.collect.RegularImmutableBiMap
            r1.<init>(r0, r3, r4, r2)
            r2.inverse = r1
            return
    }

    @Override // com.google.common.collect.ImmutableMap
    public final com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
            r4 = this;
            com.google.common.collect.RegularImmutableMap$EntrySet r0 = new com.google.common.collect.RegularImmutableMap$EntrySet
            java.lang.Object[] r1 = r4.alternatingKeysAndValues
            int r2 = r4.keyOffset
            int r3 = r4.size
            r0.<init>(r4, r1, r2, r3)
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap
    public final com.google.common.collect.ImmutableSet<K> createKeySet() {
            r4 = this;
            com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList r0 = new com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList
            java.lang.Object[] r1 = r4.alternatingKeysAndValues
            int r2 = r4.keyOffset
            int r3 = r4.size
            r0.<init>(r1, r2, r3)
            com.google.common.collect.RegularImmutableMap$KeySet r1 = new com.google.common.collect.RegularImmutableMap$KeySet
            r1.<init>(r4, r0)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.keyHashTable
            java.lang.Object[] r1 = r4.alternatingKeysAndValues
            int r2 = r4.size
            int r3 = r4.keyOffset
            java.lang.Object r5 = com.google.common.collect.RegularImmutableMap.get(r0, r1, r2, r3, r5)
            if (r5 != 0) goto Lf
            r5 = 0
        Lf:
            return r5
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ com.google.common.collect.BiMap inverse() {
            r1 = this;
            com.google.common.collect.ImmutableBiMap r0 = r1.inverse()
            return r0
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.BiMap
    public com.google.common.collect.ImmutableBiMap<V, K> inverse() {
            r1 = this;
            com.google.common.collect.RegularImmutableBiMap<V, K> r0 = r1.inverse
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean isPartialView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
