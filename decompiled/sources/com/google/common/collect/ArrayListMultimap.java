package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class ArrayListMultimap<K, V> extends com.google.common.collect.ArrayListMultimapGwtSerializationDependencies<K, V> {
    private static final int DEFAULT_VALUES_PER_KEY = 3;

    @com.google.common.annotations.GwtIncompatible
    private static final long serialVersionUID = 0;

    @com.google.common.annotations.VisibleForTesting
    public transient int expectedValuesPerKey;

    private ArrayListMultimap() {
            r2 = this;
            r0 = 12
            r1 = 3
            r2.<init>(r0, r1)
            return
    }

    private ArrayListMultimap(int r1, int r2) {
            r0 = this;
            com.google.common.collect.CompactHashMap r1 = com.google.common.collect.CompactHashMap.createWithExpectedSize(r1)
            r0.<init>(r1)
            java.lang.String r1 = "expectedValuesPerKey"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r2, r1)
            r0.expectedValuesPerKey = r2
            return
    }

    private ArrayListMultimap(com.google.common.collect.Multimap<? extends K, ? extends V> r3) {
            r2 = this;
            java.util.Set r0 = r3.keySet()
            int r0 = r0.size()
            boolean r1 = r3 instanceof com.google.common.collect.ArrayListMultimap
            if (r1 == 0) goto L12
            r1 = r3
            com.google.common.collect.ArrayListMultimap r1 = (com.google.common.collect.ArrayListMultimap) r1
            int r1 = r1.expectedValuesPerKey
            goto L13
        L12:
            r1 = 3
        L13:
            r2.<init>(r0, r1)
            r2.putAll(r3)
            return
    }

    public static <K, V> com.google.common.collect.ArrayListMultimap<K, V> create() {
            com.google.common.collect.ArrayListMultimap r0 = new com.google.common.collect.ArrayListMultimap
            r0.<init>()
            return r0
    }

    public static <K, V> com.google.common.collect.ArrayListMultimap<K, V> create(int r1, int r2) {
            com.google.common.collect.ArrayListMultimap r0 = new com.google.common.collect.ArrayListMultimap
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> com.google.common.collect.ArrayListMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> r1) {
            com.google.common.collect.ArrayListMultimap r0 = new com.google.common.collect.ArrayListMultimap
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    private void readObject(java.io.ObjectInputStream r3) throws java.io.IOException, java.lang.ClassNotFoundException {
            r2 = this;
            r3.defaultReadObject()
            r0 = 3
            r2.expectedValuesPerKey = r0
            int r0 = r3.readInt()
            com.google.common.collect.CompactHashMap r1 = com.google.common.collect.CompactHashMap.create()
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

    @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
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

    @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final java.util.Collection createCollection() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.expectedValuesPerKey
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final java.util.List<V> createCollection() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.expectedValuesPerKey
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection entries() {
            r1 = this;
            java.util.Collection r0 = super.entries()
            return r0
    }

    @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.List get(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
            r0 = this;
            java.util.List r1 = super.get(r1)
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

    @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
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

    @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.List removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.util.List r1 = super.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.List replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            java.util.List r1 = super.replaceValues(r1, r2)
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

    @java.lang.Deprecated
    public void trimToSize() {
            r2 = this;
            java.util.Map r0 = r2.backingMap()
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.trimToSize()
            goto Lc
        L1e:
            return
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            java.util.Collection r0 = super.values()
            return r0
    }
}
