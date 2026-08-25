package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class RegularImmutableSortedSet<E> extends com.google.common.collect.ImmutableSortedSet<E> {
    public static final com.google.common.collect.RegularImmutableSortedSet<java.lang.Comparable> NATURAL_EMPTY_SET = null;

    @com.google.common.annotations.VisibleForTesting
    public final transient com.google.common.collect.ImmutableList<E> elements;

    static {
            com.google.common.collect.RegularImmutableSortedSet r0 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            com.google.common.collect.Ordering r2 = com.google.common.collect.Ordering.natural()
            r0.<init>(r1, r2)
            com.google.common.collect.RegularImmutableSortedSet.NATURAL_EMPTY_SET = r0
            return
    }

    public RegularImmutableSortedSet(com.google.common.collect.ImmutableList<E> r1, java.util.Comparator<? super E> r2) {
            r0 = this;
            r0.<init>(r2)
            r0.elements = r1
            return
    }

    private int unsafeBinarySearch(java.lang.Object r3) throws java.lang.ClassCastException {
            r2 = this;
            com.google.common.collect.ImmutableList<E> r0 = r2.elements
            java.util.Comparator<? super E> r1 = r2.comparator
            int r3 = java.util.Collections.binarySearch(r0, r3, r1)
            return r3
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public com.google.common.collect.ImmutableList<E> asList() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E ceiling(E r2) {
            r1 = this;
            r0 = 1
            int r2 = r1.tailIndex(r2, r0)
            int r0 = r1.size()
            if (r2 != r0) goto Ld
            r2 = 0
            goto L13
        Ld:
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            java.lang.Object r2 = r0.get(r2)
        L13:
            return r2
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            r0 = 0
            if (r2 == 0) goto Lb
            int r2 = r1.unsafeBinarySearch(r2)     // Catch: java.lang.ClassCastException -> Lb
            if (r2 < 0) goto Lb
            r0 = 1
        Lb:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection<?> r7) {
            r6 = this;
            boolean r0 = r7 instanceof com.google.common.collect.Multiset
            if (r0 == 0) goto La
            com.google.common.collect.Multiset r7 = (com.google.common.collect.Multiset) r7
            java.util.Set r7 = r7.elementSet()
        La:
            java.util.Comparator r0 = r6.comparator()
            boolean r0 = com.google.common.collect.SortedIterables.hasSameComparator(r0, r7)
            if (r0 == 0) goto L59
            int r0 = r7.size()
            r1 = 1
            if (r0 > r1) goto L1c
            goto L59
        L1c:
            com.google.common.collect.UnmodifiableIterator r0 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 != 0) goto L2c
            return r3
        L2c:
            java.lang.Object r2 = r7.next()
            java.lang.Object r4 = r0.next()
        L34:
            java.util.Comparator<? super E> r5 = r6.comparator     // Catch: java.lang.Throwable -> L58
            int r5 = r5.compare(r4, r2)     // Catch: java.lang.Throwable -> L58
            if (r5 >= 0) goto L48
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r4 != 0) goto L43
            return r3
        L43:
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L58
            goto L34
        L48:
            if (r5 != 0) goto L56
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r2 != 0) goto L51
            return r1
        L51:
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L58
            goto L34
        L56:
            if (r5 <= 0) goto L34
        L58:
            return r3
        L59:
            boolean r7 = super.containsAll(r7)
            return r7
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(java.lang.Object[] r2, int r3) {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            int r2 = r0.copyIntoArray(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final com.google.common.collect.ImmutableSortedSet<E> createDescendingSet() {
            r3 = this;
            java.util.Comparator<? super E> r0 = r3.comparator
            java.util.Comparator r0 = java.util.Collections.reverseOrder(r0)
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L11
            com.google.common.collect.RegularImmutableSortedSet r0 = com.google.common.collect.ImmutableSortedSet.emptySet(r0)
            goto L1d
        L11:
            com.google.common.collect.RegularImmutableSortedSet r1 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList<E> r2 = r3.elements
            com.google.common.collect.ImmutableList r2 = r2.reverse()
            r1.<init>(r2, r0)
            r0 = r1
        L1d:
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @com.google.common.annotations.GwtIncompatible
    public com.google.common.collect.UnmodifiableIterator<E> descendingIterator() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            com.google.common.collect.ImmutableList r0 = r0.reverse()
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
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
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Set r7 = (java.util.Set) r7
            int r1 = r6.size()
            int r3 = r7.size()
            if (r1 == r3) goto L17
            return r2
        L17:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L1e
            return r0
        L1e:
            java.util.Comparator<? super E> r1 = r6.comparator
            boolean r1 = com.google.common.collect.SortedIterables.hasSameComparator(r1, r7)
            if (r1 == 0) goto L49
            java.util.Iterator r7 = r7.iterator()
            com.google.common.collect.UnmodifiableIterator r1 = r6.iterator()     // Catch: java.lang.Throwable -> L48
        L2e:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L47
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L48
            java.lang.Object r4 = r7.next()     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L46
            java.util.Comparator<? super E> r5 = r6.comparator     // Catch: java.lang.Throwable -> L48
            int r3 = r5.compare(r3, r4)     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L2e
        L46:
            return r2
        L47:
            return r0
        L48:
            return r2
        L49:
            boolean r7 = r6.containsAll(r7)
            return r7
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E first() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Le
            com.google.common.collect.ImmutableList<E> r0 = r2.elements
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            return r0
        Le:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E floor(E r2) {
            r1 = this;
            r0 = 1
            int r2 = r1.headIndex(r2, r0)
            int r2 = r2 - r0
            r0 = -1
            if (r2 != r0) goto Lb
            r2 = 0
            goto L11
        Lb:
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            java.lang.Object r2 = r0.get(r2)
        L11:
            return r2
    }

    public final com.google.common.collect.RegularImmutableSortedSet<E> getSubSet(int r3, int r4) {
            r2 = this;
            if (r3 != 0) goto L9
            int r0 = r2.size()
            if (r4 != r0) goto L9
            return r2
        L9:
            if (r3 >= r4) goto L19
            com.google.common.collect.RegularImmutableSortedSet r0 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList<E> r1 = r2.elements
            com.google.common.collect.ImmutableList r3 = r1.subList(r3, r4)
            java.util.Comparator<? super E> r4 = r2.comparator
            r0.<init>(r3, r4)
            return r0
        L19:
            java.util.Comparator<? super E> r3 = r2.comparator
            com.google.common.collect.RegularImmutableSortedSet r3 = com.google.common.collect.ImmutableSortedSet.emptySet(r3)
            return r3
    }

    public final int headIndex(E r3, boolean r4) {
            r2 = this;
            com.google.common.collect.ImmutableList<E> r0 = r2.elements
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Comparator r1 = r2.comparator()
            int r3 = java.util.Collections.binarySearch(r0, r3, r1)
            if (r3 < 0) goto L15
            if (r4 == 0) goto L14
            int r3 = r3 + 1
        L14:
            return r3
        L15:
            int r3 = ~r3
            return r3
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final com.google.common.collect.ImmutableSortedSet<E> headSetImpl(E r1, boolean r2) {
            r0 = this;
            int r1 = r0.headIndex(r1, r2)
            r2 = 0
            com.google.common.collect.RegularImmutableSortedSet r1 = r0.getSubSet(r2, r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E higher(E r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.tailIndex(r2, r0)
            int r0 = r1.size()
            if (r2 != r0) goto Ld
            r2 = 0
            goto L13
        Ld:
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            java.lang.Object r2 = r0.get(r2)
        L13:
            return r2
    }

    @Override // com.google.common.collect.ImmutableCollection
    @javax.annotation.CheckForNull
    public final java.lang.Object[] internalArray() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            java.lang.Object[] r0 = r0.internalArray()
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int internalArrayEnd() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            int r0 = r0.internalArrayEnd()
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int internalArrayStart() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            int r0 = r0.internalArrayStart()
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean isPartialView() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            boolean r0 = r0.isPartialView()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E last() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L13
            com.google.common.collect.ImmutableList<E> r0 = r2.elements
            int r1 = r2.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            return r0
        L13:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E lower(E r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.headIndex(r2, r0)
            int r2 = r2 + (-1)
            r0 = -1
            if (r2 != r0) goto Lc
            r2 = 0
            goto L12
        Lc:
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            java.lang.Object r2 = r0.get(r2)
        L12:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            com.google.common.collect.ImmutableList<E> r0 = r1.elements
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final com.google.common.collect.ImmutableSortedSet<E> subSetImpl(E r1, boolean r2, E r3, boolean r4) {
            r0 = this;
            int r1 = r0.tailIndex(r1, r2)
            int r2 = r0.size()
            com.google.common.collect.RegularImmutableSortedSet r1 = r0.getSubSet(r1, r2)
            int r2 = r1.headIndex(r3, r4)
            r3 = 0
            com.google.common.collect.RegularImmutableSortedSet r1 = r1.getSubSet(r3, r2)
            return r1
    }

    public final int tailIndex(E r3, boolean r4) {
            r2 = this;
            com.google.common.collect.ImmutableList<E> r0 = r2.elements
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Comparator r1 = r2.comparator()
            int r3 = java.util.Collections.binarySearch(r0, r3, r1)
            if (r3 < 0) goto L16
            if (r4 == 0) goto L13
            goto L15
        L13:
            int r3 = r3 + 1
        L15:
            return r3
        L16:
            int r3 = ~r3
            return r3
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final com.google.common.collect.ImmutableSortedSet<E> tailSetImpl(E r1, boolean r2) {
            r0 = this;
            int r1 = r0.tailIndex(r1, r2)
            int r2 = r0.size()
            com.google.common.collect.RegularImmutableSortedSet r1 = r0.getSubSet(r1, r2)
            return r1
    }
}
