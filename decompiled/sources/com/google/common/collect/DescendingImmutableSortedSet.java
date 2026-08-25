package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class DescendingImmutableSortedSet<E> extends com.google.common.collect.ImmutableSortedSet<E> {
    private final com.google.common.collect.ImmutableSortedSet<E> forward;

    public DescendingImmutableSortedSet(com.google.common.collect.ImmutableSortedSet<E> r2) {
            r1 = this;
            java.util.Comparator r0 = r2.comparator()
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.from(r0)
            com.google.common.collect.Ordering r0 = r0.reverse()
            r1.<init>(r0)
            r1.forward = r2
            return
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E ceiling(E r2) {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet<E> r0 = r1.forward
            java.lang.Object r2 = r0.floor(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet<E> r0 = r1.forward
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @com.google.common.annotations.GwtIncompatible("NavigableSet")
    public final com.google.common.collect.ImmutableSortedSet<E> createDescendingSet() {
            r2 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "should never be called"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @com.google.common.annotations.GwtIncompatible("NavigableSet")
    public com.google.common.collect.UnmodifiableIterator<E> descendingIterator() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet<E> r0 = r1.forward
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @com.google.common.annotations.GwtIncompatible("NavigableSet")
    public /* bridge */ /* synthetic */ java.util.Iterator descendingIterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.descendingIterator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @com.google.common.annotations.GwtIncompatible("NavigableSet")
    public com.google.common.collect.ImmutableSortedSet<E> descendingSet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet<E> r0 = r1.forward
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @com.google.common.annotations.GwtIncompatible("NavigableSet")
    public /* bridge */ /* synthetic */ java.util.NavigableSet descendingSet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.descendingSet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E floor(E r2) {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet<E> r0 = r1.forward
            java.lang.Object r2 = r0.ceiling(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final com.google.common.collect.ImmutableSortedSet<E> headSetImpl(E r2, boolean r3) {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet<E> r0 = r1.forward
            com.google.common.collect.ImmutableSortedSet r2 = r0.tailSet(r2, r3)
            com.google.common.collect.ImmutableSortedSet r2 = r2.descendingSet()
            return r2
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E higher(E r2) {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet<E> r0 = r1.forward
            java.lang.Object r2 = r0.lower(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean isPartialView() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet<E> r0 = r1.forward
            boolean r0 = r0.isPartialView()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet<E> r0 = r1.forward
            com.google.common.collect.UnmodifiableIterator r0 = r0.descendingIterator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E lower(E r2) {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet<E> r0 = r1.forward
            java.lang.Object r2 = r0.higher(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet<E> r0 = r1.forward
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final com.google.common.collect.ImmutableSortedSet<E> subSetImpl(E r2, boolean r3, E r4, boolean r5) {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet<E> r0 = r1.forward
            com.google.common.collect.ImmutableSortedSet r2 = r0.subSet(r4, r5, r2, r3)
            com.google.common.collect.ImmutableSortedSet r2 = r2.descendingSet()
            return r2
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final com.google.common.collect.ImmutableSortedSet<E> tailSetImpl(E r2, boolean r3) {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet<E> r0 = r1.forward
            com.google.common.collect.ImmutableSortedSet r2 = r0.headSet(r2, r3)
            com.google.common.collect.ImmutableSortedSet r2 = r2.descendingSet()
            return r2
    }
}
