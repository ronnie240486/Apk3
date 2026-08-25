package com.google.common.collect;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ContiguousSet<C extends java.lang.Comparable> extends com.google.common.collect.ImmutableSortedSet<C> {
    public final com.google.common.collect.DiscreteDomain<C> domain;

    public ContiguousSet(com.google.common.collect.DiscreteDomain<C> r2) {
            r1 = this;
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            r1.<init>(r0)
            r1.domain = r2
            return
    }

    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet.Builder<E> builder() {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @com.google.common.annotations.Beta
    public static com.google.common.collect.ContiguousSet<java.lang.Integer> closed(int r0, int r1) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.common.collect.Range r0 = com.google.common.collect.Range.closed(r0, r1)
            com.google.common.collect.DiscreteDomain r1 = com.google.common.collect.DiscreteDomain.integers()
            com.google.common.collect.ContiguousSet r0 = create(r0, r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static com.google.common.collect.ContiguousSet<java.lang.Long> closed(long r0, long r2) {
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            com.google.common.collect.Range r0 = com.google.common.collect.Range.closed(r0, r1)
            com.google.common.collect.DiscreteDomain r1 = com.google.common.collect.DiscreteDomain.longs()
            com.google.common.collect.ContiguousSet r0 = create(r0, r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static com.google.common.collect.ContiguousSet<java.lang.Integer> closedOpen(int r0, int r1) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.common.collect.Range r0 = com.google.common.collect.Range.closedOpen(r0, r1)
            com.google.common.collect.DiscreteDomain r1 = com.google.common.collect.DiscreteDomain.integers()
            com.google.common.collect.ContiguousSet r0 = create(r0, r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static com.google.common.collect.ContiguousSet<java.lang.Long> closedOpen(long r0, long r2) {
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            com.google.common.collect.Range r0 = com.google.common.collect.Range.closedOpen(r0, r1)
            com.google.common.collect.DiscreteDomain r1 = com.google.common.collect.DiscreteDomain.longs()
            com.google.common.collect.ContiguousSet r0 = create(r0, r1)
            return r0
    }

    public static <C extends java.lang.Comparable> com.google.common.collect.ContiguousSet<C> create(com.google.common.collect.Range<C> r3, com.google.common.collect.DiscreteDomain<C> r4) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.base.Preconditions.checkNotNull(r4)
            boolean r0 = r3.hasLowerBound()     // Catch: java.util.NoSuchElementException -> L61
            if (r0 != 0) goto L19
            java.lang.Comparable r0 = r4.minValue()     // Catch: java.util.NoSuchElementException -> L61
            com.google.common.collect.Range r0 = com.google.common.collect.Range.atLeast(r0)     // Catch: java.util.NoSuchElementException -> L61
            com.google.common.collect.Range r0 = r3.intersection(r0)     // Catch: java.util.NoSuchElementException -> L61
            goto L1a
        L19:
            r0 = r3
        L1a:
            boolean r1 = r3.hasUpperBound()     // Catch: java.util.NoSuchElementException -> L61
            if (r1 != 0) goto L2c
            java.lang.Comparable r1 = r4.maxValue()     // Catch: java.util.NoSuchElementException -> L61
            com.google.common.collect.Range r1 = com.google.common.collect.Range.atMost(r1)     // Catch: java.util.NoSuchElementException -> L61
            com.google.common.collect.Range r0 = r0.intersection(r1)     // Catch: java.util.NoSuchElementException -> L61
        L2c:
            boolean r1 = r0.isEmpty()
            r2 = 1
            if (r1 == 0) goto L34
            goto L53
        L34:
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r3.lowerBound
            java.lang.Comparable r1 = r1.leastValueAbove(r4)
            java.util.Objects.requireNonNull(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            com.google.common.collect.Cut<C extends java.lang.Comparable> r3 = r3.upperBound
            java.lang.Comparable r3 = r3.greatestValueBelow(r4)
            java.util.Objects.requireNonNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = r1.compareTo(r3)
            if (r3 <= 0) goto L51
            goto L53
        L51:
            r3 = 0
            r2 = 0
        L53:
            if (r2 == 0) goto L5b
            com.google.common.collect.EmptyContiguousSet r3 = new com.google.common.collect.EmptyContiguousSet
            r3.<init>(r4)
            goto L60
        L5b:
            com.google.common.collect.RegularContiguousSet r3 = new com.google.common.collect.RegularContiguousSet
            r3.<init>(r0, r4)
        L60:
            return r3
        L61:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @com.google.common.annotations.GwtIncompatible
    public com.google.common.collect.ImmutableSortedSet<C> createDescendingSet() {
            r1 = this;
            com.google.common.collect.DescendingImmutableSortedSet r0 = new com.google.common.collect.DescendingImmutableSortedSet
            r0.<init>(r1)
            return r0
    }

    public com.google.common.collect.ContiguousSet<C> headSet(C r2) {
            r1 = this;
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r0 = 0
            com.google.common.collect.ContiguousSet r2 = r1.headSetImpl(r2, r0)
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    public com.google.common.collect.ContiguousSet<C> headSet(C r1, boolean r2) {
            r0 = this;
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            com.google.common.collect.ContiguousSet r1 = r0.headSetImpl(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSortedSet headSet(java.lang.Object r1) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            com.google.common.collect.ContiguousSet r1 = r0.headSet(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @com.google.common.annotations.GwtIncompatible
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSortedSet headSet(java.lang.Object r1, boolean r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            com.google.common.collect.ContiguousSet r1 = r0.headSet(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @com.google.common.annotations.GwtIncompatible
    public /* bridge */ /* synthetic */ java.util.NavigableSet headSet(java.lang.Object r1, boolean r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            com.google.common.collect.ContiguousSet r1 = r0.headSet(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ java.util.SortedSet headSet(java.lang.Object r1) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            com.google.common.collect.ContiguousSet r1 = r0.headSet(r1)
            return r1
    }

    public abstract com.google.common.collect.ContiguousSet<C> headSetImpl(C r1, boolean r2);

    @Override // com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSortedSet headSetImpl(java.lang.Object r1, boolean r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            com.google.common.collect.ContiguousSet r1 = r0.headSetImpl(r1, r2)
            return r1
    }

    public abstract com.google.common.collect.ContiguousSet<C> intersection(com.google.common.collect.ContiguousSet<C> r1);

    public abstract com.google.common.collect.Range<C> range();

    public abstract com.google.common.collect.Range<C> range(com.google.common.collect.BoundType r1, com.google.common.collect.BoundType r2);

    public com.google.common.collect.ContiguousSet<C> subSet(C r4, C r5) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.base.Preconditions.checkNotNull(r5)
            java.util.Comparator r0 = r3.comparator()
            int r0 = r0.compare(r4, r5)
            r1 = 1
            r2 = 0
            if (r0 > 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            com.google.common.base.Preconditions.checkArgument(r0)
            com.google.common.collect.ContiguousSet r4 = r3.subSetImpl(r4, r1, r5, r2)
            return r4
    }

    @com.google.common.annotations.GwtIncompatible
    public com.google.common.collect.ContiguousSet<C> subSet(C r2, boolean r3, C r4, boolean r5) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r4)
            java.util.Comparator r0 = r1.comparator()
            int r0 = r0.compare(r2, r4)
            if (r0 > 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            com.google.common.base.Preconditions.checkArgument(r0)
            com.google.common.collect.ContiguousSet r2 = r1.subSetImpl(r2, r3, r4, r5)
            return r2
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSortedSet subSet(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            com.google.common.collect.ContiguousSet r1 = r0.subSet(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @com.google.common.annotations.GwtIncompatible
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSortedSet subSet(java.lang.Object r1, boolean r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            com.google.common.collect.ContiguousSet r1 = r0.subSet(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @com.google.common.annotations.GwtIncompatible
    public /* bridge */ /* synthetic */ java.util.NavigableSet subSet(java.lang.Object r1, boolean r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            com.google.common.collect.ContiguousSet r1 = r0.subSet(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ java.util.SortedSet subSet(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            com.google.common.collect.ContiguousSet r1 = r0.subSet(r1, r2)
            return r1
    }

    public abstract com.google.common.collect.ContiguousSet<C> subSetImpl(C r1, boolean r2, C r3, boolean r4);

    @Override // com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSortedSet subSetImpl(java.lang.Object r1, boolean r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            com.google.common.collect.ContiguousSet r1 = r0.subSetImpl(r1, r2, r3, r4)
            return r1
    }

    public com.google.common.collect.ContiguousSet<C> tailSet(C r2) {
            r1 = this;
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r0 = 1
            com.google.common.collect.ContiguousSet r2 = r1.tailSetImpl(r2, r0)
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    public com.google.common.collect.ContiguousSet<C> tailSet(C r1, boolean r2) {
            r0 = this;
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            com.google.common.collect.ContiguousSet r1 = r0.tailSetImpl(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSortedSet tailSet(java.lang.Object r1) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            com.google.common.collect.ContiguousSet r1 = r0.tailSet(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @com.google.common.annotations.GwtIncompatible
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSortedSet tailSet(java.lang.Object r1, boolean r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            com.google.common.collect.ContiguousSet r1 = r0.tailSet(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @com.google.common.annotations.GwtIncompatible
    public /* bridge */ /* synthetic */ java.util.NavigableSet tailSet(java.lang.Object r1, boolean r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            com.google.common.collect.ContiguousSet r1 = r0.tailSet(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ java.util.SortedSet tailSet(java.lang.Object r1) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            com.google.common.collect.ContiguousSet r1 = r0.tailSet(r1)
            return r1
    }

    public abstract com.google.common.collect.ContiguousSet<C> tailSetImpl(C r1, boolean r2);

    @Override // com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSortedSet tailSetImpl(java.lang.Object r1, boolean r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            com.google.common.collect.ContiguousSet r1 = r0.tailSetImpl(r1, r2)
            return r1
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r1 = this;
            com.google.common.collect.Range r0 = r1.range()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
