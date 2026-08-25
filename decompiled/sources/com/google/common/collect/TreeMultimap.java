package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public class TreeMultimap<K, V> extends com.google.common.collect.AbstractSortedKeySortedSetMultimap<K, V> {

    @com.google.common.annotations.GwtIncompatible
    private static final long serialVersionUID = 0;
    private transient java.util.Comparator<? super K> keyComparator;
    private transient java.util.Comparator<? super V> valueComparator;

    public TreeMultimap(java.util.Comparator<? super K> r2, java.util.Comparator<? super V> r3) {
            r1 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r2)
            r1.<init>(r0)
            r1.keyComparator = r2
            r1.valueComparator = r3
            return
    }

    private TreeMultimap(java.util.Comparator<? super K> r1, java.util.Comparator<? super V> r2, com.google.common.collect.Multimap<? extends K, ? extends V> r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.putAll(r3)
            return
    }

    public static <K extends java.lang.Comparable, V extends java.lang.Comparable> com.google.common.collect.TreeMultimap<K, V> create() {
            com.google.common.collect.TreeMultimap r0 = new com.google.common.collect.TreeMultimap
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.Ordering r2 = com.google.common.collect.Ordering.natural()
            r0.<init>(r1, r2)
            return r0
    }

    public static <K extends java.lang.Comparable, V extends java.lang.Comparable> com.google.common.collect.TreeMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> r3) {
            com.google.common.collect.TreeMultimap r0 = new com.google.common.collect.TreeMultimap
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.Ordering r2 = com.google.common.collect.Ordering.natural()
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <K, V> com.google.common.collect.TreeMultimap<K, V> create(java.util.Comparator<? super K> r1, java.util.Comparator<? super V> r2) {
            com.google.common.collect.TreeMultimap r0 = new com.google.common.collect.TreeMultimap
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Comparator r1 = (java.util.Comparator) r1
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.Comparator r2 = (java.util.Comparator) r2
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    private void readObject(java.io.ObjectInputStream r3) throws java.io.IOException, java.lang.ClassNotFoundException {
            r2 = this;
            r3.defaultReadObject()
            java.lang.Object r0 = r3.readObject()
            java.util.Comparator r0 = (java.util.Comparator) r0
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0)
            java.util.Comparator r0 = (java.util.Comparator) r0
            r2.keyComparator = r0
            java.lang.Object r0 = r3.readObject()
            java.util.Comparator r0 = (java.util.Comparator) r0
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0)
            java.util.Comparator r0 = (java.util.Comparator) r0
            r2.valueComparator = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator<? super K> r1 = r2.keyComparator
            r0.<init>(r1)
            r2.setMap(r0)
            int r0 = r3.readInt()
            com.google.common.collect.Serialization.populateMultimap(r2, r3, r0)
            return
    }

    @com.google.common.annotations.GwtIncompatible
    private void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
            r1 = this;
            r2.defaultWriteObject()
            java.util.Comparator r0 = r1.keyComparator()
            r2.writeObject(r0)
            java.util.Comparator r0 = r1.valueComparator()
            r2.writeObject(r0)
            com.google.common.collect.Serialization.writeMultimap(r1, r2)
            return
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Map asMap() {
            r1 = this;
            java.util.NavigableMap r0 = r1.asMap()
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.NavigableMap<K, java.util.Collection<V>> asMap() {
            r1 = this;
            java.util.SortedMap r0 = super.asMap()
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.SortedMap asMap() {
            r1 = this;
            java.util.NavigableMap r0 = r1.asMap()
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

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    public final java.util.Map<K, java.util.Collection<V>> createAsMap() {
            r1 = this;
            java.util.Map r0 = r1.createMaybeNavigableAsMap()
            return r0
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final java.util.Collection<V> createCollection(@com.google.common.collect.ParametricNullness K r2) {
            r1 = this;
            if (r2 != 0) goto L9
            java.util.Comparator r0 = r1.keyComparator()
            r0.compare(r2, r2)
        L9:
            java.util.Collection r2 = r1.createCollection()
            return r2
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final java.util.SortedSet<V> createCollection() {
            r2 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Comparator<? super V> r1 = r2.valueComparator
            r0.<init>(r1)
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

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.common.annotations.GwtIncompatible
    public /* bridge */ /* synthetic */ java.util.Collection get(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
            r0 = this;
            java.util.NavigableSet r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.common.annotations.GwtIncompatible
    public java.util.NavigableSet<V> get(@com.google.common.collect.ParametricNullness K r1) {
            r0 = this;
            java.util.SortedSet r1 = super.get(r1)
            java.util.NavigableSet r1 = (java.util.NavigableSet) r1
            return r1
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.common.annotations.GwtIncompatible
    public /* bridge */ /* synthetic */ java.util.Set get(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
            r0 = this;
            java.util.NavigableSet r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.common.annotations.GwtIncompatible
    public /* bridge */ /* synthetic */ java.util.SortedSet get(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
            r0 = this;
            java.util.NavigableSet r1 = r0.get(r1)
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

    @java.lang.Deprecated
    public java.util.Comparator<? super K> keyComparator() {
            r1 = this;
            java.util.Comparator<? super K> r0 = r1.keyComparator
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.NavigableSet<K> keySet() {
            r1 = this;
            java.util.SortedSet r0 = super.keySet()
            java.util.NavigableSet r0 = (java.util.NavigableSet) r0
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set keySet() {
            r1 = this;
            java.util.NavigableSet r0 = r1.keySet()
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.SortedSet keySet() {
            r1 = this;
            java.util.NavigableSet r0 = r1.keySet()
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

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.SortedSet removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.util.SortedSet r1 = super.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.SortedSet replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            java.util.SortedSet r1 = super.replaceValues(r1, r2)
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

    @Override // com.google.common.collect.SortedSetMultimap
    public java.util.Comparator<? super V> valueComparator() {
            r1 = this;
            java.util.Comparator<? super V> r0 = r1.valueComparator
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            java.util.Collection r0 = super.values()
            return r0
    }
}
