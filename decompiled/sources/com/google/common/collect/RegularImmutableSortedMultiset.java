package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class RegularImmutableSortedMultiset<E> extends com.google.common.collect.ImmutableSortedMultiset<E> {
    public static final com.google.common.collect.ImmutableSortedMultiset<java.lang.Comparable> NATURAL_EMPTY_MULTISET = null;
    private static final long[] ZERO_CUMULATIVE_COUNTS = null;
    private final transient long[] cumulativeCounts;

    @com.google.common.annotations.VisibleForTesting
    public final transient com.google.common.collect.RegularImmutableSortedSet<E> elementSet;
    private final transient int length;
    private final transient int offset;

    static {
            r0 = 1
            long[] r0 = new long[r0]
            r1 = 0
            r2 = 0
            r0[r1] = r2
            com.google.common.collect.RegularImmutableSortedMultiset.ZERO_CUMULATIVE_COUNTS = r0
            com.google.common.collect.RegularImmutableSortedMultiset r0 = new com.google.common.collect.RegularImmutableSortedMultiset
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            r0.<init>(r1)
            com.google.common.collect.RegularImmutableSortedMultiset.NATURAL_EMPTY_MULTISET = r0
            return
    }

    public RegularImmutableSortedMultiset(com.google.common.collect.RegularImmutableSortedSet<E> r1, long[] r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.elementSet = r1
            r0.cumulativeCounts = r2
            r0.offset = r3
            r0.length = r4
            return
    }

    public RegularImmutableSortedMultiset(java.util.Comparator<? super E> r1) {
            r0 = this;
            r0.<init>()
            com.google.common.collect.RegularImmutableSortedSet r1 = com.google.common.collect.ImmutableSortedSet.emptySet(r1)
            r0.elementSet = r1
            long[] r1 = com.google.common.collect.RegularImmutableSortedMultiset.ZERO_CUMULATIVE_COUNTS
            r0.cumulativeCounts = r1
            r1 = 0
            r0.offset = r1
            r0.length = r1
            return
    }

    private int getCount(int r7) {
            r6 = this;
            long[] r0 = r6.cumulativeCounts
            int r1 = r6.offset
            int r2 = r1 + r7
            int r2 = r2 + 1
            r2 = r0[r2]
            int r1 = r1 + r7
            r4 = r0[r1]
            long r2 = r2 - r4
            int r7 = (int) r2
            return r7
    }

    @Override // com.google.common.collect.Multiset
    public int count(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            com.google.common.collect.RegularImmutableSortedSet<E> r0 = r3.elementSet
            java.util.Objects.requireNonNull(r0)
            r1 = -1
            if (r4 != 0) goto L9
            goto L14
        L9:
            com.google.common.collect.ImmutableList<E> r2 = r0.elements     // Catch: java.lang.ClassCastException -> L14
            java.util.Comparator<? super E> r0 = r0.comparator     // Catch: java.lang.ClassCastException -> L14
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L14
            if (r4 < 0) goto L14
            r1 = r4
        L14:
            if (r1 < 0) goto L1b
            int r4 = r3.getCount(r1)
            goto L1c
        L1b:
            r4 = 0
        L1c:
            return r4
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSet elementSet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public com.google.common.collect.ImmutableSortedSet<E> elementSet() {
            r1 = this;
            com.google.common.collect.RegularImmutableSortedSet<E> r0 = r1.elementSet
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.NavigableSet elementSet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.SortedSet elementSet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> firstEntry() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0 = 0
            com.google.common.collect.Multiset$Entry r0 = r1.getEntry(r0)
        Ld:
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final com.google.common.collect.Multiset.Entry<E> getEntry(int r2) {
            r1 = this;
            com.google.common.collect.RegularImmutableSortedSet<E> r0 = r1.elementSet
            com.google.common.collect.ImmutableList r0 = r0.asList()
            java.lang.Object r0 = r0.get(r2)
            int r2 = r1.getCount(r2)
            com.google.common.collect.Multiset$Entry r2 = com.google.common.collect.Multisets.immutableEntry(r0, r2)
            return r2
    }

    public final com.google.common.collect.ImmutableSortedMultiset<E> getSubMultiset(int r5, int r6) {
            r4 = this;
            int r0 = r4.length
            com.google.common.base.Preconditions.checkPositionIndexes(r5, r6, r0)
            if (r5 != r6) goto L10
            java.util.Comparator r5 = r4.comparator()
            com.google.common.collect.ImmutableSortedMultiset r5 = com.google.common.collect.ImmutableSortedMultiset.emptyMultiset(r5)
            return r5
        L10:
            if (r5 != 0) goto L17
            int r0 = r4.length
            if (r6 != r0) goto L17
            return r4
        L17:
            com.google.common.collect.RegularImmutableSortedSet<E> r0 = r4.elementSet
            com.google.common.collect.RegularImmutableSortedSet r0 = r0.getSubSet(r5, r6)
            com.google.common.collect.RegularImmutableSortedMultiset r1 = new com.google.common.collect.RegularImmutableSortedMultiset
            long[] r2 = r4.cumulativeCounts
            int r3 = r4.offset
            int r3 = r3 + r5
            int r6 = r6 - r5
            r1.<init>(r0, r2, r3, r6)
            return r1
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> headMultiset(E r4, com.google.common.collect.BoundType r5) {
            r3 = this;
            com.google.common.collect.RegularImmutableSortedSet<E> r0 = r3.elementSet
            java.lang.Object r5 = com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED
            r2 = 0
            if (r5 != r1) goto Ld
            r5 = 1
            goto Le
        Ld:
            r5 = 0
        Le:
            int r4 = r0.headIndex(r4, r5)
            com.google.common.collect.ImmutableSortedMultiset r4 = r3.getSubMultiset(r2, r4)
            return r4
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset headMultiset(java.lang.Object r1, com.google.common.collect.BoundType r2) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMultiset r1 = r0.headMultiset(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean isPartialView() {
            r3 = this;
            int r0 = r3.offset
            r1 = 1
            if (r0 > 0) goto Lf
            int r0 = r3.length
            long[] r2 = r3.cumulativeCounts
            int r2 = r2.length
            int r2 = r2 - r1
            if (r0 >= r2) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> lastEntry() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto L10
        L8:
            int r0 = r1.length
            int r0 = r0 + (-1)
            com.google.common.collect.Multiset$Entry r0 = r1.getEntry(r0)
        L10:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
            r6 = this;
            long[] r0 = r6.cumulativeCounts
            int r1 = r6.offset
            int r2 = r6.length
            int r2 = r2 + r1
            r2 = r0[r2]
            r4 = r0[r1]
            long r2 = r2 - r4
            int r0 = com.google.common.primitives.Ints.saturatedCast(r2)
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> tailMultiset(E r3, com.google.common.collect.BoundType r4) {
            r2 = this;
            com.google.common.collect.RegularImmutableSortedSet<E> r0 = r2.elementSet
            java.lang.Object r4 = com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED
            if (r4 != r1) goto Lc
            r4 = 1
            goto Ld
        Lc:
            r4 = 0
        Ld:
            int r3 = r0.tailIndex(r3, r4)
            int r4 = r2.length
            com.google.common.collect.ImmutableSortedMultiset r3 = r2.getSubMultiset(r3, r4)
            return r3
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset tailMultiset(java.lang.Object r1, com.google.common.collect.BoundType r2) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMultiset r1 = r0.tailMultiset(r1, r2)
            return r1
    }
}
