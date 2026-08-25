package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class HashMultimap<K, V> extends com.google.common.collect.HashMultimapGwtSerializationDependencies<K, V> {
    private static final int DEFAULT_VALUES_PER_KEY = 2;

    @com.google.common.annotations.GwtIncompatible
    private static final long serialVersionUID = 0;

    @com.google.common.annotations.VisibleForTesting
    public transient int expectedValuesPerKey;

    private HashMultimap() {
            r2 = this;
            r0 = 12
            r1 = 2
            r2.<init>(r0, r1)
            return
    }

    private HashMultimap(int r1, int r2) {
            r0 = this;
            com.google.common.collect.CompactHashMap r1 = com.google.common.collect.CompactHashMap.createWithExpectedSize(r1)
            r0.<init>(r1)
            r1 = 2
            r0.expectedValuesPerKey = r1
            if (r2 < 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            com.google.common.base.Preconditions.checkArgument(r1)
            r0.expectedValuesPerKey = r2
            return
    }

    private HashMultimap(com.google.common.collect.Multimap<? extends K, ? extends V> r2) {
            r1 = this;
            java.util.Set r0 = r2.keySet()
            int r0 = r0.size()
            com.google.common.collect.CompactHashMap r0 = com.google.common.collect.CompactHashMap.createWithExpectedSize(r0)
            r1.<init>(r0)
            r0 = 2
            r1.expectedValuesPerKey = r0
            r1.putAll(r2)
            return
    }

    public static <K, V> com.google.common.collect.HashMultimap<K, V> create() {
            com.google.common.collect.HashMultimap r0 = new com.google.common.collect.HashMultimap
            r0.<init>()
            return r0
    }

    public static <K, V> com.google.common.collect.HashMultimap<K, V> create(int r1, int r2) {
            com.google.common.collect.HashMultimap r0 = new com.google.common.collect.HashMultimap
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> com.google.common.collect.HashMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> r1) {
            com.google.common.collect.HashMultimap r0 = new com.google.common.collect.HashMultimap
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    private void readObject(java.io.ObjectInputStream r3) throws java.io.IOException, java.lang.ClassNotFoundException {
            r2 = this;
            r3.defaultReadObject()
            r0 = 2
            r2.expectedValuesPerKey = r0
            int r0 = r3.readInt()
            r1 = 12
            com.google.common.collect.CompactHashMap r1 = com.google.common.collect.CompactHashMap.createWithExpectedSize(r1)
            r2.setMap(r1)
            com.google.common.collect.Serialization.populateMultimap(r2, r3, r0)
            return
    }

    @com.google.common.annotations.GwtIncompatible
    private void writeObject(java.io.ObjectOutputStream r1) throws java.io.IOException {
            r0 = this;
            r1.defaultWriteObject()
            com.google.common.collect.Serialization.writeMultimap(r0, r1)
            return
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Map asMap() {
            r1 = this;
            java.util.Map r0 = super.asMap()
            return r0
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ void clear() {
            r0 = this;
            super.clear()
            return
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            boolean r1 = super.containsEntry(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.containsKey(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.containsValue(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final java.util.Collection createCollection() {
            r1 = this;
            int r0 = r1.expectedValuesPerKey
            com.google.common.collect.CompactHashSet r0 = com.google.common.collect.CompactHashSet.createWithExpectedSize(r0)
            return r0
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final java.util.Set<V> createCollection() {
            r1 = this;
            int r0 = r1.expectedValuesPerKey
            com.google.common.collect.CompactHashSet r0 = com.google.common.collect.CompactHashSet.createWithExpectedSize(r0)
            return r0
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set entries() {
            r1 = this;
            java.util.Set r0 = super.entries()
            return r0
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Set get(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.get(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
            r1 = this;
            boolean r0 = super.isEmpty()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set keySet() {
            r1 = this;
            java.util.Set r0 = super.keySet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset keys() {
            r1 = this;
            com.google.common.collect.Multiset r0 = super.keys()
            return r0
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean put(@com.google.common.collect.ParametricNullness java.lang.Object r1, @com.google.common.collect.ParametricNullness java.lang.Object r2) {
            r0 = this;
            boolean r1 = super.put(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(com.google.common.collect.Multimap r1) {
            r0 = this;
            boolean r1 = super.putAll(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            boolean r1 = super.putAll(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            boolean r1 = super.remove(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.Set removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.Set replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            java.util.Set r1 = super.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int size() {
            r1 = this;
            int r0 = super.size()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            java.util.Collection r0 = super.values()
            return r0
    }
}
