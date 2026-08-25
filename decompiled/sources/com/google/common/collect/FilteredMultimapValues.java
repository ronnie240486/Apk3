package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class FilteredMultimapValues<K, V> extends java.util.AbstractCollection<V> {

    @com.google.j2objc.annotations.Weak
    private final com.google.common.collect.FilteredMultimap<K, V> multimap;

    public FilteredMultimapValues(com.google.common.collect.FilteredMultimap<K, V> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.FilteredMultimap r1 = (com.google.common.collect.FilteredMultimap) r1
            r0.multimap = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
            r1 = this;
            com.google.common.collect.FilteredMultimap<K, V> r0 = r1.multimap
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.FilteredMultimap<K, V> r0 = r1.multimap
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<V> iterator() {
            r2 = this;
            com.google.common.collect.FilteredMultimap<K, V> r0 = r2.multimap
            java.util.Collection r0 = r0.entries()
            java.util.Iterator r0 = r0.iterator()
            com.google.common.collect.Maps$2 r1 = new com.google.common.collect.Maps$2
            r1.<init>(r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            com.google.common.collect.FilteredMultimap<K, V> r0 = r4.multimap
            com.google.common.base.Predicate r0 = r0.entryPredicate()
            com.google.common.collect.FilteredMultimap<K, V> r1 = r4.multimap
            com.google.common.collect.Multimap r1 = r1.unfiltered()
            java.util.Collection r1 = r1.entries()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r3 = r0.apply(r2)
            if (r3 == 0) goto L14
            java.lang.Object r2 = r2.getValue()
            boolean r2 = com.google.common.base.Objects.equal(r2, r5)
            if (r2 == 0) goto L14
            r1.remove()
            r5 = 1
            return r5
        L35:
            r5 = 0
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection<?> r3) {
            r2 = this;
            com.google.common.collect.FilteredMultimap<K, V> r0 = r2.multimap
            com.google.common.collect.Multimap r0 = r0.unfiltered()
            java.util.Collection r0 = r0.entries()
            com.google.common.collect.FilteredMultimap<K, V> r1 = r2.multimap
            com.google.common.base.Predicate r1 = r1.entryPredicate()
            com.google.common.base.Predicate r3 = com.google.common.base.Predicates.in(r3)
            com.google.common.base.Predicate r3 = com.google.common.collect.Maps.valuePredicateOnEntries(r3)
            com.google.common.base.Predicate r3 = com.google.common.base.Predicates.and(r1, r3)
            boolean r3 = com.google.common.collect.Iterables.removeIf(r0, r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(java.util.Collection<?> r3) {
            r2 = this;
            com.google.common.collect.FilteredMultimap<K, V> r0 = r2.multimap
            com.google.common.collect.Multimap r0 = r0.unfiltered()
            java.util.Collection r0 = r0.entries()
            com.google.common.collect.FilteredMultimap<K, V> r1 = r2.multimap
            com.google.common.base.Predicate r1 = r1.entryPredicate()
            com.google.common.base.Predicate r3 = com.google.common.base.Predicates.in(r3)
            com.google.common.base.Predicate r3 = com.google.common.base.Predicates.not(r3)
            com.google.common.base.Predicate r3 = com.google.common.collect.Maps.valuePredicateOnEntries(r3)
            com.google.common.base.Predicate r3 = com.google.common.base.Predicates.and(r1, r3)
            boolean r3 = com.google.common.collect.Iterables.removeIf(r0, r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
            r1 = this;
            com.google.common.collect.FilteredMultimap<K, V> r0 = r1.multimap
            int r0 = r0.size()
            return r0
    }
}
