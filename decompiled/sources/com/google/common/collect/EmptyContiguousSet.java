package com.google.common.collect;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class EmptyContiguousSet<C extends java.lang.Comparable> extends com.google.common.collect.ContiguousSet<C> {

    /* JADX INFO: renamed from: com.google.common.collect.EmptyContiguousSet$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.GwtIncompatible
    public static final class SerializedForm<C extends java.lang.Comparable> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.DiscreteDomain<C> domain;

        private SerializedForm(com.google.common.collect.DiscreteDomain<C> r1) {
                r0 = this;
                r0.<init>()
                r0.domain = r1
                return
        }

        private java.lang.Object readResolve() {
                r2 = this;
                com.google.common.collect.EmptyContiguousSet r0 = new com.google.common.collect.EmptyContiguousSet
                com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r1 = r2.domain
                r0.<init>(r1)
                return r0
        }
    }

    public EmptyContiguousSet(com.google.common.collect.DiscreteDomain<C> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public com.google.common.collect.ImmutableList<C> asList() {
            r1 = this;
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    @com.google.common.annotations.GwtIncompatible
    public final com.google.common.collect.ImmutableSortedSet<C> createDescendingSet() {
            r1 = this;
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.Ordering r0 = r0.reverse()
            com.google.common.collect.RegularImmutableSortedSet r0 = com.google.common.collect.ImmutableSortedSet.emptySet(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @com.google.common.annotations.GwtIncompatible
    public com.google.common.collect.UnmodifiableIterator<C> descendingIterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableListIterator<java.lang.Object> r0 = com.google.common.collect.Iterators.ArrayItr.EMPTY
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @com.google.common.annotations.GwtIncompatible
    public /* bridge */ /* synthetic */ java.util.Iterator descendingIterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.descendingIterator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Set
            if (r0 == 0) goto Lb
            java.util.Set r2 = (java.util.Set) r2
            boolean r2 = r2.isEmpty()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C first() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ java.lang.Object first() {
            r1 = this;
            java.lang.Comparable r0 = r1.first()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.common.collect.ContiguousSet
    public final com.google.common.collect.ContiguousSet<C> headSetImpl(C r1, boolean r2) {
            r0 = this;
            return r0
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public final com.google.common.collect.ImmutableSortedSet headSetImpl(java.lang.Object r1, boolean r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            return r0
    }

    @Override // com.google.common.collect.ContiguousSet
    public com.google.common.collect.ContiguousSet<C> intersection(com.google.common.collect.ContiguousSet<C> r1) {
            r0 = this;
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean isPartialView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<C> iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableListIterator<java.lang.Object> r0 = com.google.common.collect.Iterators.ArrayItr.EMPTY
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C last() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ java.lang.Object last() {
            r1 = this;
            java.lang.Comparable r0 = r1.last()
            return r0
    }

    @Override // com.google.common.collect.ContiguousSet
    public com.google.common.collect.Range<C> range() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.ContiguousSet
    public com.google.common.collect.Range<C> range(com.google.common.collect.BoundType r1, com.google.common.collect.BoundType r2) {
            r0 = this;
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.common.collect.ContiguousSet
    public final com.google.common.collect.ContiguousSet<C> subSetImpl(C r1, boolean r2, C r3, boolean r4) {
            r0 = this;
            return r0
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public final com.google.common.collect.ImmutableSortedSet subSetImpl(java.lang.Object r1, boolean r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            return r0
    }

    @Override // com.google.common.collect.ContiguousSet
    public final com.google.common.collect.ContiguousSet<C> tailSetImpl(C r1, boolean r2) {
            r0 = this;
            return r0
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public final com.google.common.collect.ImmutableSortedSet tailSetImpl(java.lang.Object r1, boolean r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            return r0
    }

    @Override // com.google.common.collect.ContiguousSet, java.util.AbstractCollection
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "[]"
            return r0
    }
}
