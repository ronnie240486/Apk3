package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Sets {





    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.Sets$5, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public class AnonymousClass5<E> extends java.util.AbstractSet<java.util.Set<E>> {
        public final /* synthetic */ com.google.common.collect.ImmutableMap val$index;
        public final /* synthetic */ int val$size;

        /* JADX INFO: renamed from: com.google.common.collect.Sets$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: classes3.dex */
        public class AnonymousClass1 extends com.google.common.collect.AbstractIterator<java.util.Set<E>> {
            public final java.util.BitSet bits;
            public final /* synthetic */ com.google.common.collect.Sets.AnonymousClass5 this$0;


            public AnonymousClass1(com.google.common.collect.Sets.AnonymousClass5 r2) {
                    r1 = this;
                    r1.this$0 = r2
                    r1.<init>()
                    java.util.BitSet r0 = new java.util.BitSet
                    com.google.common.collect.ImmutableMap r2 = r2.val$index
                    int r2 = r2.size()
                    r0.<init>(r2)
                    r1.bits = r0
                    return
            }

            @Override // com.google.common.collect.AbstractIterator
            @javax.annotation.CheckForNull
            public final java.lang.Object computeNext() {
                    r4 = this;
                    java.util.BitSet r0 = r4.bits
                    boolean r0 = r0.isEmpty()
                    r1 = 0
                    if (r0 == 0) goto L13
                    java.util.BitSet r0 = r4.bits
                    com.google.common.collect.Sets$5 r2 = r4.this$0
                    int r2 = r2.val$size
                    r0.set(r1, r2)
                    goto L41
                L13:
                    java.util.BitSet r0 = r4.bits
                    int r0 = r0.nextSetBit(r1)
                    java.util.BitSet r2 = r4.bits
                    int r2 = r2.nextClearBit(r0)
                    com.google.common.collect.Sets$5 r3 = r4.this$0
                    com.google.common.collect.ImmutableMap r3 = r3.val$index
                    int r3 = r3.size()
                    if (r2 != r3) goto L2e
                    r4.endOfData()
                    r0 = 0
                    goto L4f
                L2e:
                    java.util.BitSet r3 = r4.bits
                    int r0 = r2 - r0
                    int r0 = r0 + (-1)
                    r3.set(r1, r0)
                    java.util.BitSet r1 = r4.bits
                    r1.clear(r0, r2)
                    java.util.BitSet r0 = r4.bits
                    r0.set(r2)
                L41:
                    java.util.BitSet r0 = r4.bits
                    java.lang.Object r0 = r0.clone()
                    java.util.BitSet r0 = (java.util.BitSet) r0
                    com.google.common.collect.Sets$5$1$1 r1 = new com.google.common.collect.Sets$5$1$1
                    r1.<init>(r4, r0)
                    r0 = r1
                L4f:
                    return r0
            }
        }

        public AnonymousClass5(int r1, com.google.common.collect.ImmutableMap r2) {
                r0 = this;
                r0.val$size = r1
                r0.val$index = r2
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Set
                r1 = 0
                if (r0 == 0) goto L1c
                java.util.Set r4 = (java.util.Set) r4
                int r0 = r4.size()
                int r2 = r3.val$size
                if (r0 != r2) goto L1c
                com.google.common.collect.ImmutableMap r0 = r3.val$index
                com.google.common.collect.ImmutableSet r0 = r0.keySet()
                boolean r4 = r0.containsAll(r4)
                if (r4 == 0) goto L1c
                r1 = 1
            L1c:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Set<E>> iterator() {
                r1 = this;
                com.google.common.collect.Sets$5$1 r0 = new com.google.common.collect.Sets$5$1
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r2 = this;
                com.google.common.collect.ImmutableMap r0 = r2.val$index
                int r0 = r0.size()
                int r1 = r2.val$size
                int r0 = com.google.common.math.IntMath.binomial(r0, r1)
                return r0
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
                r4 = this;
                com.google.common.collect.ImmutableMap r0 = r4.val$index
                com.google.common.collect.ImmutableSet r0 = r0.keySet()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r4.val$size
                int r2 = r0.length()
                int r2 = r2 + 32
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Sets.combinations("
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = ", "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = ")"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                return r0
        }
    }

    public static final class CartesianSet<E> extends com.google.common.collect.ForwardingCollection<java.util.List<E>> implements java.util.Set<java.util.List<E>> {
        private final transient com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableSet<E>> axes;
        private final transient com.google.common.collect.CartesianList<E> delegate;


        private CartesianSet(com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableSet<E>> r1, com.google.common.collect.CartesianList<E> r2) {
                r0 = this;
                r0.<init>()
                r0.axes = r1
                r0.delegate = r2
                return
        }

        public static <E> java.util.Set<java.util.List<E>> create(java.util.List<? extends java.util.Set<? extends E>> r3) {
                com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r3 = r3.iterator()
            Ld:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L2c
                java.lang.Object r1 = r3.next()
                java.util.Set r1 = (java.util.Set) r1
                com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.copyOf(r1)
                boolean r2 = r1.isEmpty()
                if (r2 == 0) goto L28
                com.google.common.collect.ImmutableSet r3 = com.google.common.collect.ImmutableSet.of()
                return r3
            L28:
                r0.add(r1)
                goto Ld
            L2c:
                com.google.common.collect.ImmutableList r3 = r0.build()
                com.google.common.collect.Sets$CartesianSet$1 r0 = new com.google.common.collect.Sets$CartesianSet$1
                r0.<init>(r3)
                com.google.common.collect.Sets$CartesianSet r1 = new com.google.common.collect.Sets$CartesianSet
                com.google.common.collect.CartesianList r2 = new com.google.common.collect.CartesianList
                r2.<init>(r0)
                r1.<init>(r3, r2)
                return r1
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof java.util.List
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.List r5 = (java.util.List) r5
                int r0 = r5.size()
                com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableSet<E>> r2 = r4.axes
                int r2 = r2.size()
                if (r0 == r2) goto L15
                return r1
            L15:
                java.util.Iterator r5 = r5.iterator()
                r0 = 0
            L1a:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L36
                java.lang.Object r2 = r5.next()
                com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableSet<E>> r3 = r4.axes
                java.lang.Object r3 = r3.get(r0)
                com.google.common.collect.ImmutableSet r3 = (com.google.common.collect.ImmutableSet) r3
                boolean r2 = r3.contains(r2)
                if (r2 != 0) goto L33
                return r1
            L33:
                int r0 = r0 + 1
                goto L1a
            L36:
                r5 = 1
                return r5
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                com.google.common.collect.CartesianList<E> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Collection<java.util.List<E>> delegate() {
                r1 = this;
                com.google.common.collect.CartesianList<E> r0 = r1.delegate
                return r0
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.collect.Sets.CartesianSet
                if (r0 == 0) goto Lf
                com.google.common.collect.Sets$CartesianSet r2 = (com.google.common.collect.Sets.CartesianSet) r2
                com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableSet<E>> r0 = r1.axes
                com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableSet<E>> r2 = r2.axes
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                boolean r2 = super.equals(r2)
                return r2
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
                r6 = this;
                int r0 = r6.size()
                r1 = 1
                int r0 = r0 - r1
                r2 = 0
            L7:
                com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableSet<E>> r3 = r6.axes
                int r3 = r3.size()
                if (r2 >= r3) goto L16
                int r0 = r0 * 31
                int r0 = ~r0
                int r0 = ~r0
                int r2 = r2 + 1
                goto L7
            L16:
                com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableSet<E>> r2 = r6.axes
                com.google.common.collect.UnmodifiableIterator r2 = r2.iterator()
            L1c:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L3d
                java.lang.Object r3 = r2.next()
                java.util.Set r3 = (java.util.Set) r3
                int r1 = r1 * 31
                int r4 = r6.size()
                int r5 = r3.size()
                int r4 = r4 / r5
                int r3 = r3.hashCode()
                int r3 = r3 * r4
                int r3 = r3 + r1
                int r1 = ~r3
                int r1 = ~r1
                goto L1c
            L3d:
                int r1 = r1 + r0
                int r0 = ~r1
                int r0 = ~r0
                return r0
        }
    }

    @com.google.common.annotations.GwtIncompatible
    public static class DescendingSet<E> extends com.google.common.collect.ForwardingNavigableSet<E> {
        private final java.util.NavigableSet<E> forward;

        public DescendingSet(java.util.NavigableSet<E> r1) {
                r0 = this;
                r0.<init>()
                r0.forward = r1
                return
        }

        private static <T> com.google.common.collect.Ordering<T> reverse(java.util.Comparator<T> r0) {
                com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.from(r0)
                com.google.common.collect.Ordering r0 = r0.reverse()
                return r0
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E ceiling(@com.google.common.collect.ParametricNullness E r2) {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                java.lang.Object r2 = r0.floor(r2)
                return r2
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public java.util.Comparator<? super E> comparator() {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                java.util.Comparator r0 = r0.comparator()
                if (r0 != 0) goto L11
                com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
                com.google.common.collect.Ordering r0 = r0.reverse()
                return r0
            L11:
                com.google.common.collect.Ordering r0 = reverse(r0)
                return r0
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                return r0
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Collection delegate() {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                return r0
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.NavigableSet<E> delegate() {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                return r0
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Set delegate() {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                return r0
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.SortedSet delegate() {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                return r0
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public java.util.Iterator<E> descendingIterator() {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                java.util.Iterator r0 = r0.iterator()
                return r0
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public java.util.NavigableSet<E> descendingSet() {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                return r0
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public E first() {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                java.lang.Object r0 = r0.last()
                return r0
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E floor(@com.google.common.collect.ParametricNullness E r2) {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                java.lang.Object r2 = r0.ceiling(r2)
                return r2
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public java.util.NavigableSet<E> headSet(@com.google.common.collect.ParametricNullness E r2, boolean r3) {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                java.util.NavigableSet r2 = r0.tailSet(r2, r3)
                java.util.NavigableSet r2 = r2.descendingSet()
                return r2
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public java.util.SortedSet<E> headSet(@com.google.common.collect.ParametricNullness E r2) {
                r1 = this;
                r0 = 0
                java.util.NavigableSet r2 = r1.headSet(r2, r0)
                return r2
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E higher(@com.google.common.collect.ParametricNullness E r2) {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                java.lang.Object r2 = r0.lower(r2)
                return r2
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                java.util.Iterator r0 = r0.descendingIterator()
                return r0
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public E last() {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                java.lang.Object r0 = r0.first()
                return r0
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E lower(@com.google.common.collect.ParametricNullness E r2) {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                java.lang.Object r2 = r0.higher(r2)
                return r2
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollFirst() {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                java.lang.Object r0 = r0.pollLast()
                return r0
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollLast() {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                java.lang.Object r0 = r0.pollFirst()
                return r0
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public java.util.NavigableSet<E> subSet(@com.google.common.collect.ParametricNullness E r2, boolean r3, @com.google.common.collect.ParametricNullness E r4, boolean r5) {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                java.util.NavigableSet r2 = r0.subSet(r4, r5, r2, r3)
                java.util.NavigableSet r2 = r2.descendingSet()
                return r2
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public java.util.SortedSet<E> subSet(@com.google.common.collect.ParametricNullness E r3, @com.google.common.collect.ParametricNullness E r4) {
                r2 = this;
                r0 = 1
                r1 = 0
                java.util.NavigableSet r3 = r2.subSet(r3, r0, r4, r1)
                return r3
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public java.util.NavigableSet<E> tailSet(@com.google.common.collect.ParametricNullness E r2, boolean r3) {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.forward
                java.util.NavigableSet r2 = r0.headSet(r2, r3)
                java.util.NavigableSet r2 = r2.descendingSet()
                return r2
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public java.util.SortedSet<E> tailSet(@com.google.common.collect.ParametricNullness E r2) {
                r1 = this;
                r0 = 1
                java.util.NavigableSet r2 = r1.tailSet(r2, r0)
                return r2
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
                r1 = this;
                java.lang.Object[] r0 = r1.standardToArray()
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] r1) {
                r0 = this;
                java.lang.Object[] r1 = com.google.common.collect.ObjectArrays.toArrayImpl(r0, r1)
                return r1
        }

        @Override // com.google.common.collect.ForwardingObject
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.standardToString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.GwtIncompatible
    public static class FilteredNavigableSet<E> extends com.google.common.collect.Sets.FilteredSortedSet<E> implements java.util.NavigableSet<E> {
        public FilteredNavigableSet(java.util.NavigableSet<E> r1, com.google.common.base.Predicate<? super E> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E ceiling(@com.google.common.collect.ParametricNullness E r3) {
                r2 = this;
                java.util.Collection<E> r0 = r2.unfiltered
                java.util.NavigableSet r0 = (java.util.NavigableSet) r0
                r1 = 1
                java.util.NavigableSet r3 = r0.tailSet(r3, r1)
                com.google.common.base.Predicate<? super E> r0 = r2.predicate
                r1 = 0
                java.lang.Object r3 = com.google.common.collect.Iterables.find(r3, r0, r1)
                return r3
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<E> descendingIterator() {
                r2 = this;
                java.util.Collection<E> r0 = r2.unfiltered
                java.util.NavigableSet r0 = (java.util.NavigableSet) r0
                java.util.Iterator r0 = r0.descendingIterator()
                com.google.common.base.Predicate<? super E> r1 = r2.predicate
                com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.filter(r0, r1)
                return r0
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> descendingSet() {
                r2 = this;
                java.util.Collection<E> r0 = r2.unfiltered
                java.util.NavigableSet r0 = (java.util.NavigableSet) r0
                java.util.NavigableSet r0 = r0.descendingSet()
                com.google.common.base.Predicate<? super E> r1 = r2.predicate
                java.util.NavigableSet r0 = com.google.common.collect.Sets.filter(r0, r1)
                return r0
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E floor(@com.google.common.collect.ParametricNullness E r3) {
                r2 = this;
                java.util.Collection<E> r0 = r2.unfiltered
                java.util.NavigableSet r0 = (java.util.NavigableSet) r0
                r1 = 1
                java.util.NavigableSet r3 = r0.headSet(r3, r1)
                java.util.Iterator r3 = r3.descendingIterator()
                com.google.common.base.Predicate<? super E> r0 = r2.predicate
                r1 = 0
                java.lang.Object r3 = com.google.common.collect.Iterators.find(r3, r0, r1)
                return r3
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> headSet(@com.google.common.collect.ParametricNullness E r2, boolean r3) {
                r1 = this;
                java.util.Collection<E> r0 = r1.unfiltered
                java.util.NavigableSet r0 = (java.util.NavigableSet) r0
                java.util.NavigableSet r2 = r0.headSet(r2, r3)
                com.google.common.base.Predicate<? super E> r3 = r1.predicate
                java.util.NavigableSet r2 = com.google.common.collect.Sets.filter(r2, r3)
                return r2
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E higher(@com.google.common.collect.ParametricNullness E r3) {
                r2 = this;
                java.util.Collection<E> r0 = r2.unfiltered
                java.util.NavigableSet r0 = (java.util.NavigableSet) r0
                r1 = 0
                java.util.NavigableSet r3 = r0.tailSet(r3, r1)
                com.google.common.base.Predicate<? super E> r0 = r2.predicate
                r1 = 0
                java.lang.Object r3 = com.google.common.collect.Iterables.find(r3, r0, r1)
                return r3
        }

        @Override // com.google.common.collect.Sets.FilteredSortedSet, java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public E last() {
                r2 = this;
                java.util.Collection<E> r0 = r2.unfiltered
                java.util.NavigableSet r0 = (java.util.NavigableSet) r0
                java.util.Iterator r0 = r0.descendingIterator()
                com.google.common.base.Predicate<? super E> r1 = r2.predicate
                java.lang.Object r0 = com.google.common.collect.Iterators.find(r0, r1)
                return r0
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E lower(@com.google.common.collect.ParametricNullness E r3) {
                r2 = this;
                java.util.Collection<E> r0 = r2.unfiltered
                java.util.NavigableSet r0 = (java.util.NavigableSet) r0
                r1 = 0
                java.util.NavigableSet r3 = r0.headSet(r3, r1)
                java.util.Iterator r3 = r3.descendingIterator()
                com.google.common.base.Predicate<? super E> r0 = r2.predicate
                r1 = 0
                java.lang.Object r3 = com.google.common.collect.Iterators.find(r3, r0, r1)
                return r3
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollFirst() {
                r2 = this;
                java.util.Collection<E> r0 = r2.unfiltered
                java.util.NavigableSet r0 = (java.util.NavigableSet) r0
                com.google.common.base.Predicate<? super E> r1 = r2.predicate
                java.lang.Object r0 = com.google.common.collect.Iterables.removeFirstMatching(r0, r1)
                return r0
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollLast() {
                r2 = this;
                java.util.Collection<E> r0 = r2.unfiltered
                java.util.NavigableSet r0 = (java.util.NavigableSet) r0
                java.util.NavigableSet r0 = r0.descendingSet()
                com.google.common.base.Predicate<? super E> r1 = r2.predicate
                java.lang.Object r0 = com.google.common.collect.Iterables.removeFirstMatching(r0, r1)
                return r0
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> subSet(@com.google.common.collect.ParametricNullness E r2, boolean r3, @com.google.common.collect.ParametricNullness E r4, boolean r5) {
                r1 = this;
                java.util.Collection<E> r0 = r1.unfiltered
                java.util.NavigableSet r0 = (java.util.NavigableSet) r0
                java.util.NavigableSet r2 = r0.subSet(r2, r3, r4, r5)
                com.google.common.base.Predicate<? super E> r3 = r1.predicate
                java.util.NavigableSet r2 = com.google.common.collect.Sets.filter(r2, r3)
                return r2
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> tailSet(@com.google.common.collect.ParametricNullness E r2, boolean r3) {
                r1 = this;
                java.util.Collection<E> r0 = r1.unfiltered
                java.util.NavigableSet r0 = (java.util.NavigableSet) r0
                java.util.NavigableSet r2 = r0.tailSet(r2, r3)
                com.google.common.base.Predicate<? super E> r3 = r1.predicate
                java.util.NavigableSet r2 = com.google.common.collect.Sets.filter(r2, r3)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class FilteredSet<E> extends com.google.common.collect.Collections2.FilteredCollection<E> implements java.util.Set<E> {
        public FilteredSet(java.util.Set<E> r1, com.google.common.base.Predicate<? super E> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                boolean r1 = com.google.common.collect.Sets.equalsImpl(r0, r1)
                return r1
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
                r1 = this;
                int r0 = com.google.common.collect.Sets.hashCodeImpl(r1)
                return r0
        }
    }

    public static class FilteredSortedSet<E> extends com.google.common.collect.Sets.FilteredSet<E> implements java.util.SortedSet<E> {
        public FilteredSortedSet(java.util.SortedSet<E> r1, com.google.common.base.Predicate<? super E> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.SortedSet
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super E> comparator() {
                r1 = this;
                java.util.Collection<E> r0 = r1.unfiltered
                java.util.SortedSet r0 = (java.util.SortedSet) r0
                java.util.Comparator r0 = r0.comparator()
                return r0
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public E first() {
                r2 = this;
                java.util.Collection<E> r0 = r2.unfiltered
                java.util.Iterator r0 = r0.iterator()
                com.google.common.base.Predicate<? super E> r1 = r2.predicate
                java.lang.Object r0 = com.google.common.collect.Iterators.find(r0, r1)
                return r0
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> headSet(@com.google.common.collect.ParametricNullness E r3) {
                r2 = this;
                com.google.common.collect.Sets$FilteredSortedSet r0 = new com.google.common.collect.Sets$FilteredSortedSet
                java.util.Collection<E> r1 = r2.unfiltered
                java.util.SortedSet r1 = (java.util.SortedSet) r1
                java.util.SortedSet r3 = r1.headSet(r3)
                com.google.common.base.Predicate<? super E> r1 = r2.predicate
                r0.<init>(r3, r1)
                return r0
        }

        @com.google.common.collect.ParametricNullness
        public E last() {
                r3 = this;
                java.util.Collection<E> r0 = r3.unfiltered
                java.util.SortedSet r0 = (java.util.SortedSet) r0
            L4:
                java.lang.Object r1 = r0.last()
                com.google.common.base.Predicate<? super E> r2 = r3.predicate
                boolean r2 = r2.apply(r1)
                if (r2 == 0) goto L11
                return r1
            L11:
                java.util.SortedSet r0 = r0.headSet(r1)
                goto L4
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> subSet(@com.google.common.collect.ParametricNullness E r3, @com.google.common.collect.ParametricNullness E r4) {
                r2 = this;
                com.google.common.collect.Sets$FilteredSortedSet r0 = new com.google.common.collect.Sets$FilteredSortedSet
                java.util.Collection<E> r1 = r2.unfiltered
                java.util.SortedSet r1 = (java.util.SortedSet) r1
                java.util.SortedSet r3 = r1.subSet(r3, r4)
                com.google.common.base.Predicate<? super E> r4 = r2.predicate
                r0.<init>(r3, r4)
                return r0
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> tailSet(@com.google.common.collect.ParametricNullness E r3) {
                r2 = this;
                com.google.common.collect.Sets$FilteredSortedSet r0 = new com.google.common.collect.Sets$FilteredSortedSet
                java.util.Collection<E> r1 = r2.unfiltered
                java.util.SortedSet r1 = (java.util.SortedSet) r1
                java.util.SortedSet r3 = r1.tailSet(r3)
                com.google.common.base.Predicate<? super E> r1 = r2.predicate
                r0.<init>(r3, r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class ImprovedAbstractSet<E> extends java.util.AbstractSet<E> {
        public ImprovedAbstractSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> r1) {
                r0 = this;
                boolean r1 = com.google.common.collect.Sets.removeAllImpl(r0, r1)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = super.retainAll(r1)
                return r1
        }
    }

    public static final class PowerSet<E> extends java.util.AbstractSet<java.util.Set<E>> {
        public final com.google.common.collect.ImmutableMap<E, java.lang.Integer> inputSet;


        public PowerSet(java.util.Set<E> r4) {
                r3 = this;
                r3.<init>()
                int r0 = r4.size()
                r1 = 30
                if (r0 > r1) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                int r1 = r4.size()
                java.lang.String r2 = "Too many elements to create power set: %s > 30"
                com.google.common.base.Preconditions.checkArgument(r0, r2, r1)
                com.google.common.collect.ImmutableMap r4 = com.google.common.collect.Maps.indexMap(r4)
                r3.inputSet = r4
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.util.Set
                if (r0 == 0) goto L11
                java.util.Set r2 = (java.util.Set) r2
                com.google.common.collect.ImmutableMap<E, java.lang.Integer> r0 = r1.inputSet
                com.google.common.collect.ImmutableSet r0 = r0.keySet()
                boolean r2 = r0.containsAll(r2)
                return r2
            L11:
                r2 = 0
                return r2
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.collect.Sets.PowerSet
                if (r0 == 0) goto L17
                com.google.common.collect.Sets$PowerSet r2 = (com.google.common.collect.Sets.PowerSet) r2
                com.google.common.collect.ImmutableMap<E, java.lang.Integer> r0 = r1.inputSet
                com.google.common.collect.ImmutableSet r0 = r0.keySet()
                com.google.common.collect.ImmutableMap<E, java.lang.Integer> r2 = r2.inputSet
                com.google.common.collect.ImmutableSet r2 = r2.keySet()
                boolean r2 = r0.equals(r2)
                return r2
            L17:
                boolean r2 = super.equals(r2)
                return r2
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
                r2 = this;
                com.google.common.collect.ImmutableMap<E, java.lang.Integer> r0 = r2.inputSet
                com.google.common.collect.ImmutableSet r0 = r0.keySet()
                int r0 = r0.hashCode()
                com.google.common.collect.ImmutableMap<E, java.lang.Integer> r1 = r2.inputSet
                int r1 = r1.size()
                int r1 = r1 + (-1)
                int r0 = r0 << r1
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Set<E>> iterator() {
                r2 = this;
                com.google.common.collect.Sets$PowerSet$1 r0 = new com.google.common.collect.Sets$PowerSet$1
                int r1 = r2.size()
                r0.<init>(r2, r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r2 = this;
                com.google.common.collect.ImmutableMap<E, java.lang.Integer> r0 = r2.inputSet
                int r0 = r0.size()
                r1 = 1
                int r0 = r1 << r0
                return r0
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
                r4 = this;
                com.google.common.collect.ImmutableMap<E, java.lang.Integer> r0 = r4.inputSet
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 10
                java.lang.String r2 = "powerSet("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    public static abstract class SetView<E> extends java.util.AbstractSet<E> {
        private SetView() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ SetView(com.google.common.collect.Sets.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
        @java.lang.Deprecated
        public final boolean add(@com.google.common.collect.ParametricNullness E r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
        @java.lang.Deprecated
        public final boolean addAll(java.util.Collection<? extends E> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
        @java.lang.Deprecated
        public final void clear() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public <S extends java.util.Set<E>> S copyInto(S r1) {
                r0 = this;
                r1.addAll(r0)
                return r1
        }

        public com.google.common.collect.ImmutableSet<E> immutableCopy() {
                r1 = this;
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.copyOf(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract com.google.common.collect.UnmodifiableIterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
        @java.lang.Deprecated
        public final boolean remove(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
        @java.lang.Deprecated
        public final boolean removeAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
        @java.lang.Deprecated
        public final boolean retainAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class SubSet<E> extends java.util.AbstractSet<E> {
        private final com.google.common.collect.ImmutableMap<E, java.lang.Integer> inputSet;
        private final int mask;


        public SubSet(com.google.common.collect.ImmutableMap<E, java.lang.Integer> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.inputSet = r1
                r0.mask = r2
                return
        }

        public static /* synthetic */ com.google.common.collect.ImmutableMap access$100(com.google.common.collect.Sets.SubSet r0) {
                com.google.common.collect.ImmutableMap<E, java.lang.Integer> r0 = r0.inputSet
                return r0
        }

        public static /* synthetic */ int access$200(com.google.common.collect.Sets.SubSet r0) {
                int r0 = r0.mask
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                com.google.common.collect.ImmutableMap<E, java.lang.Integer> r0 = r2.inputSet
                java.lang.Object r3 = r0.get(r3)
                java.lang.Integer r3 = (java.lang.Integer) r3
                r0 = 1
                if (r3 == 0) goto L17
                int r1 = r2.mask
                int r3 = r3.intValue()
                int r3 = r0 << r3
                r3 = r3 & r1
                if (r3 == 0) goto L17
                goto L18
            L17:
                r0 = 0
            L18:
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
                r1 = this;
                com.google.common.collect.Sets$SubSet$1 r0 = new com.google.common.collect.Sets$SubSet$1
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                int r0 = r1.mask
                int r0 = java.lang.Integer.bitCount(r0)
                return r0
        }
    }

    public static final class UnmodifiableNavigableSet<E> extends com.google.common.collect.ForwardingSortedSet<E> implements java.util.NavigableSet<E>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.util.NavigableSet<E> delegate;

        @javax.annotation.CheckForNull
        private transient com.google.common.collect.Sets.UnmodifiableNavigableSet<E> descendingSet;
        private final java.util.SortedSet<E> unmodifiableDelegate;

        public UnmodifiableNavigableSet(java.util.NavigableSet<E> r2) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.util.NavigableSet r0 = (java.util.NavigableSet) r0
                r1.delegate = r0
                java.util.SortedSet r2 = java.util.Collections.unmodifiableSortedSet(r2)
                r1.unmodifiableDelegate = r2
                return
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E ceiling(@com.google.common.collect.ParametricNullness E r2) {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.delegate
                java.lang.Object r2 = r0.ceiling(r2)
                return r2
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                java.util.SortedSet<E> r0 = r1.unmodifiableDelegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Collection delegate() {
                r1 = this;
                java.util.SortedSet<E> r0 = r1.unmodifiableDelegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Set delegate() {
                r1 = this;
                java.util.SortedSet<E> r0 = r1.unmodifiableDelegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.SortedSet<E> delegate() {
                r1 = this;
                java.util.SortedSet<E> r0 = r1.unmodifiableDelegate
                return r0
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<E> descendingIterator() {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.delegate
                java.util.Iterator r0 = r0.descendingIterator()
                com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.unmodifiableIterator(r0)
                return r0
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> descendingSet() {
                r2 = this;
                com.google.common.collect.Sets$UnmodifiableNavigableSet<E> r0 = r2.descendingSet
                if (r0 != 0) goto L13
                com.google.common.collect.Sets$UnmodifiableNavigableSet r0 = new com.google.common.collect.Sets$UnmodifiableNavigableSet
                java.util.NavigableSet<E> r1 = r2.delegate
                java.util.NavigableSet r1 = r1.descendingSet()
                r0.<init>(r1)
                r2.descendingSet = r0
                r0.descendingSet = r2
            L13:
                return r0
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E floor(@com.google.common.collect.ParametricNullness E r2) {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.delegate
                java.lang.Object r2 = r0.floor(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> headSet(@com.google.common.collect.ParametricNullness E r2, boolean r3) {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.delegate
                java.util.NavigableSet r2 = r0.headSet(r2, r3)
                java.util.NavigableSet r2 = com.google.common.collect.Sets.unmodifiableNavigableSet(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E higher(@com.google.common.collect.ParametricNullness E r2) {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.delegate
                java.lang.Object r2 = r0.higher(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E lower(@com.google.common.collect.ParametricNullness E r2) {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.delegate
                java.lang.Object r2 = r0.lower(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollFirst() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollLast() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> subSet(@com.google.common.collect.ParametricNullness E r2, boolean r3, @com.google.common.collect.ParametricNullness E r4, boolean r5) {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.delegate
                java.util.NavigableSet r2 = r0.subSet(r2, r3, r4, r5)
                java.util.NavigableSet r2 = com.google.common.collect.Sets.unmodifiableNavigableSet(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> tailSet(@com.google.common.collect.ParametricNullness E r2, boolean r3) {
                r1 = this;
                java.util.NavigableSet<E> r0 = r1.delegate
                java.util.NavigableSet r2 = r0.tailSet(r2, r3)
                java.util.NavigableSet r2 = com.google.common.collect.Sets.unmodifiableNavigableSet(r2)
                return r2
        }
    }

    private Sets() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <B> java.util.Set<java.util.List<B>> cartesianProduct(java.util.List<? extends java.util.Set<? extends B>> r0) {
            java.util.Set r0 = com.google.common.collect.Sets.CartesianSet.create(r0)
            return r0
    }

    @java.lang.SafeVarargs
    public static <B> java.util.Set<java.util.List<B>> cartesianProduct(java.util.Set<? extends B>... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Set r0 = cartesianProduct(r0)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <E> java.util.Set<java.util.Set<E>> combinations(java.util.Set<E> r3, int r4) {
            com.google.common.collect.ImmutableMap r3 = com.google.common.collect.Maps.indexMap(r3)
            java.lang.String r0 = "size"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r4, r0)
            int r0 = r3.size()
            if (r4 > r0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            int r1 = r3.size()
            java.lang.String r2 = "size (%s) must be <= set.size() (%s)"
            com.google.common.base.Preconditions.checkArgument(r0, r2, r4, r1)
            if (r4 != 0) goto L28
            com.google.common.collect.ImmutableSet r3 = com.google.common.collect.ImmutableSet.of()
            com.google.common.collect.ImmutableSet r3 = com.google.common.collect.ImmutableSet.of(r3)
            return r3
        L28:
            int r0 = r3.size()
            if (r4 != r0) goto L37
            com.google.common.collect.ImmutableSet r3 = r3.keySet()
            com.google.common.collect.ImmutableSet r3 = com.google.common.collect.ImmutableSet.of(r3)
            return r3
        L37:
            com.google.common.collect.Sets$5 r0 = new com.google.common.collect.Sets$5
            r0.<init>(r4, r3)
            return r0
    }

    public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> complementOf(java.util.Collection<E> r2) {
            boolean r0 = r2 instanceof java.util.EnumSet
            if (r0 == 0) goto Lb
            java.util.EnumSet r2 = (java.util.EnumSet) r2
            java.util.EnumSet r2 = java.util.EnumSet.complementOf(r2)
            return r2
        Lb:
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            java.lang.String r1 = "collection is empty; use the other version of this method"
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            java.util.Iterator r0 = r2.iterator()
            java.lang.Object r0 = r0.next()
            java.lang.Enum r0 = (java.lang.Enum) r0
            java.lang.Class r0 = r0.getDeclaringClass()
            java.util.EnumSet r2 = makeComplementByHand(r2, r0)
            return r2
    }

    public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> complementOf(java.util.Collection<E> r1, java.lang.Class<E> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            boolean r0 = r1 instanceof java.util.EnumSet
            if (r0 == 0) goto Le
            java.util.EnumSet r1 = (java.util.EnumSet) r1
            java.util.EnumSet r1 = java.util.EnumSet.complementOf(r1)
            goto L12
        Le:
            java.util.EnumSet r1 = makeComplementByHand(r1, r2)
        L12:
            return r1
    }

    public static <E> com.google.common.collect.Sets.SetView<E> difference(java.util.Set<E> r1, java.util.Set<?> r2) {
            java.lang.String r0 = "set1"
            com.google.common.base.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "set2"
            com.google.common.base.Preconditions.checkNotNull(r2, r0)
            com.google.common.collect.Sets$3 r0 = new com.google.common.collect.Sets$3
            r0.<init>(r1, r2)
            return r0
    }

    public static boolean equalsImpl(java.util.Set<?> r4, @javax.annotation.CheckForNull java.lang.Object r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L1e
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L1e
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L1e
            if (r1 != r3) goto L1c
            boolean r4 = r4.containsAll(r5)     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
        L1e:
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.NavigableSet<E> filter(java.util.NavigableSet<E> r1, com.google.common.base.Predicate<? super E> r2) {
            boolean r0 = r1 instanceof com.google.common.collect.Sets.FilteredSet
            if (r0 == 0) goto L16
            com.google.common.collect.Sets$FilteredSet r1 = (com.google.common.collect.Sets.FilteredSet) r1
            com.google.common.base.Predicate<? super E> r0 = r1.predicate
            com.google.common.base.Predicate r2 = com.google.common.base.Predicates.and(r0, r2)
            com.google.common.collect.Sets$FilteredNavigableSet r0 = new com.google.common.collect.Sets$FilteredNavigableSet
            java.util.Collection<E> r1 = r1.unfiltered
            java.util.NavigableSet r1 = (java.util.NavigableSet) r1
            r0.<init>(r1, r2)
            return r0
        L16:
            com.google.common.collect.Sets$FilteredNavigableSet r0 = new com.google.common.collect.Sets$FilteredNavigableSet
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.NavigableSet r1 = (java.util.NavigableSet) r1
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Predicate r2 = (com.google.common.base.Predicate) r2
            r0.<init>(r1, r2)
            return r0
    }

    public static <E> java.util.Set<E> filter(java.util.Set<E> r1, com.google.common.base.Predicate<? super E> r2) {
            boolean r0 = r1 instanceof java.util.SortedSet
            if (r0 == 0) goto Lb
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            java.util.SortedSet r1 = filter(r1, r2)
            return r1
        Lb:
            boolean r0 = r1 instanceof com.google.common.collect.Sets.FilteredSet
            if (r0 == 0) goto L21
            com.google.common.collect.Sets$FilteredSet r1 = (com.google.common.collect.Sets.FilteredSet) r1
            com.google.common.base.Predicate<? super E> r0 = r1.predicate
            com.google.common.base.Predicate r2 = com.google.common.base.Predicates.and(r0, r2)
            com.google.common.collect.Sets$FilteredSet r0 = new com.google.common.collect.Sets$FilteredSet
            java.util.Collection<E> r1 = r1.unfiltered
            java.util.Set r1 = (java.util.Set) r1
            r0.<init>(r1, r2)
            return r0
        L21:
            com.google.common.collect.Sets$FilteredSet r0 = new com.google.common.collect.Sets$FilteredSet
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Predicate r2 = (com.google.common.base.Predicate) r2
            r0.<init>(r1, r2)
            return r0
    }

    public static <E> java.util.SortedSet<E> filter(java.util.SortedSet<E> r1, com.google.common.base.Predicate<? super E> r2) {
            boolean r0 = r1 instanceof com.google.common.collect.Sets.FilteredSet
            if (r0 == 0) goto L16
            com.google.common.collect.Sets$FilteredSet r1 = (com.google.common.collect.Sets.FilteredSet) r1
            com.google.common.base.Predicate<? super E> r0 = r1.predicate
            com.google.common.base.Predicate r2 = com.google.common.base.Predicates.and(r0, r2)
            com.google.common.collect.Sets$FilteredSortedSet r0 = new com.google.common.collect.Sets$FilteredSortedSet
            java.util.Collection<E> r1 = r1.unfiltered
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            r0.<init>(r1, r2)
            return r0
        L16:
            com.google.common.collect.Sets$FilteredSortedSet r0 = new com.google.common.collect.Sets$FilteredSortedSet
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Predicate r2 = (com.google.common.base.Predicate) r2
            r0.<init>(r1, r2)
            return r0
    }

    public static int hashCodeImpl(java.util.Set<?> r3) {
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
            r1 = 0
        L6:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r3.next()
            if (r2 == 0) goto L17
            int r2 = r2.hashCode()
            goto L18
        L17:
            r2 = 0
        L18:
            int r1 = r1 + r2
            int r1 = ~r1
            int r1 = ~r1
            goto L6
        L1c:
            return r1
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E extends java.lang.Enum<E>> com.google.common.collect.ImmutableSet<E> immutableEnumSet(E r0, E... r1) {
            java.util.EnumSet r0 = java.util.EnumSet.of(r0, r1)
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableEnumSet.asImmutable(r0)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E extends java.lang.Enum<E>> com.google.common.collect.ImmutableSet<E> immutableEnumSet(java.lang.Iterable<E> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.ImmutableEnumSet
            if (r0 == 0) goto L7
            com.google.common.collect.ImmutableEnumSet r1 = (com.google.common.collect.ImmutableEnumSet) r1
            return r1
        L7:
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L21
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L18
            com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.of()
            return r1
        L18:
            java.util.EnumSet r1 = java.util.EnumSet.copyOf(r1)
            com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableEnumSet.asImmutable(r1)
            return r1
        L21:
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r1.next()
            java.lang.Enum r0 = (java.lang.Enum) r0
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            com.google.common.collect.Iterators.addAll(r0, r1)
            com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableEnumSet.asImmutable(r0)
            return r1
        L3d:
            com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.of()
            return r1
    }

    public static <E> com.google.common.collect.Sets.SetView<E> intersection(java.util.Set<E> r1, java.util.Set<?> r2) {
            java.lang.String r0 = "set1"
            com.google.common.base.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "set2"
            com.google.common.base.Preconditions.checkNotNull(r2, r0)
            com.google.common.collect.Sets$2 r0 = new com.google.common.collect.Sets$2
            r0.<init>(r1, r2)
            return r0
    }

    private static <E extends java.lang.Enum<E>> java.util.EnumSet<E> makeComplementByHand(java.util.Collection<E> r0, java.lang.Class<E> r1) {
            java.util.EnumSet r1 = java.util.EnumSet.allOf(r1)
            r1.removeAll(r0)
            return r1
    }

    public static <E> java.util.Set<E> newConcurrentHashSet() {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            return r0
    }

    public static <E> java.util.Set<E> newConcurrentHashSet(java.lang.Iterable<? extends E> r1) {
            java.util.Set r0 = newConcurrentHashSet()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.CopyOnWriteArraySet<E> newCopyOnWriteArraySet() {
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.CopyOnWriteArraySet<E> newCopyOnWriteArraySet(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L7
            java.util.Collection r1 = (java.util.Collection) r1
            goto Lb
        L7:
            java.util.ArrayList r1 = com.google.common.collect.Lists.newArrayList(r1)
        Lb:
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>(r1)
            return r0
    }

    public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> newEnumSet(java.lang.Iterable<E> r0, java.lang.Class<E> r1) {
            java.util.EnumSet r1 = java.util.EnumSet.noneOf(r1)
            com.google.common.collect.Iterables.addAll(r1, r0)
            return r1
    }

    public static <E> java.util.HashSet<E> newHashSet() {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            return r0
    }

    public static <E> java.util.HashSet<E> newHashSet(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lc
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            goto L14
        Lc:
            java.util.Iterator r1 = r1.iterator()
            java.util.HashSet r0 = newHashSet(r1)
        L14:
            return r0
    }

    public static <E> java.util.HashSet<E> newHashSet(java.util.Iterator<? extends E> r1) {
            java.util.HashSet r0 = newHashSet()
            com.google.common.collect.Iterators.addAll(r0, r1)
            return r0
    }

    public static <E> java.util.HashSet<E> newHashSet(E... r1) {
            int r0 = r1.length
            java.util.HashSet r0 = newHashSetWithExpectedSize(r0)
            java.util.Collections.addAll(r0, r1)
            return r0
    }

    public static <E> java.util.HashSet<E> newHashSetWithExpectedSize(int r1) {
            java.util.HashSet r0 = new java.util.HashSet
            int r1 = com.google.common.collect.Maps.capacity(r1)
            r0.<init>(r1)
            return r0
    }

    public static <E> java.util.Set<E> newIdentityHashSet() {
            java.util.IdentityHashMap r0 = com.google.common.collect.Maps.newIdentityHashMap()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            return r0
    }

    public static <E> java.util.LinkedHashSet<E> newLinkedHashSet() {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            return r0
    }

    public static <E> java.util.LinkedHashSet<E> newLinkedHashSet(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lc
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            return r0
        Lc:
            java.util.LinkedHashSet r0 = newLinkedHashSet()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    public static <E> java.util.LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int r1) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = com.google.common.collect.Maps.capacity(r1)
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public static <E> java.util.Set<E> newSetFromMap(java.util.Map<E, java.lang.Boolean> r0) {
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            return r0
    }

    public static <E extends java.lang.Comparable> java.util.TreeSet<E> newTreeSet() {
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            return r0
    }

    public static <E extends java.lang.Comparable> java.util.TreeSet<E> newTreeSet(java.lang.Iterable<? extends E> r1) {
            java.util.TreeSet r0 = newTreeSet()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    public static <E> java.util.TreeSet<E> newTreeSet(java.util.Comparator<? super E> r1) {
            java.util.TreeSet r0 = new java.util.TreeSet
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Comparator r1 = (java.util.Comparator) r1
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = false)
    public static <E> java.util.Set<java.util.Set<E>> powerSet(java.util.Set<E> r1) {
            com.google.common.collect.Sets$PowerSet r0 = new com.google.common.collect.Sets$PowerSet
            r0.<init>(r1)
            return r0
    }

    public static boolean removeAllImpl(java.util.Set<?> r2, java.util.Collection<?> r3) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            boolean r0 = r3 instanceof com.google.common.collect.Multiset
            if (r0 == 0) goto Ld
            com.google.common.collect.Multiset r3 = (com.google.common.collect.Multiset) r3
            java.util.Set r3 = r3.elementSet()
        Ld:
            boolean r0 = r3 instanceof java.util.Set
            if (r0 == 0) goto L24
            int r0 = r3.size()
            int r1 = r2.size()
            if (r0 <= r1) goto L24
            java.util.Iterator r2 = r2.iterator()
            boolean r2 = com.google.common.collect.Iterators.removeAll(r2, r3)
            return r2
        L24:
            java.util.Iterator r3 = r3.iterator()
            boolean r2 = removeAllImpl(r2, r3)
            return r2
    }

    public static boolean removeAllImpl(java.util.Set<?> r2, java.util.Iterator<?> r3) {
            r0 = 0
        L1:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L11
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.remove(r1)
            r0 = r0 | r1
            goto L1
        L11:
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static <K extends java.lang.Comparable<? super K>> java.util.NavigableSet<K> subSet(java.util.NavigableSet<K> r6, com.google.common.collect.Range<K> r7) {
            java.util.Comparator r0 = r6.comparator()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L39
            java.util.Comparator r0 = r6.comparator()
            com.google.common.collect.Ordering r3 = com.google.common.collect.Ordering.natural()
            if (r0 == r3) goto L39
            boolean r0 = r7.hasLowerBound()
            if (r0 == 0) goto L39
            boolean r0 = r7.hasUpperBound()
            if (r0 == 0) goto L39
            java.util.Comparator r0 = r6.comparator()
            java.lang.Comparable r3 = r7.lowerEndpoint()
            java.lang.Comparable r4 = r7.upperEndpoint()
            int r0 = r0.compare(r3, r4)
            if (r0 > 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            java.lang.String r3 = "set is using a custom comparator which is inconsistent with the natural ordering."
            com.google.common.base.Preconditions.checkArgument(r0, r3)
        L39:
            boolean r0 = r7.hasLowerBound()
            if (r0 == 0) goto L65
            boolean r0 = r7.hasUpperBound()
            if (r0 == 0) goto L65
            java.lang.Comparable r0 = r7.lowerEndpoint()
            com.google.common.collect.BoundType r3 = r7.lowerBoundType()
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.CLOSED
            if (r3 != r4) goto L53
            r3 = 1
            goto L54
        L53:
            r3 = 0
        L54:
            java.lang.Comparable r5 = r7.upperEndpoint()
            com.google.common.collect.BoundType r7 = r7.upperBoundType()
            if (r7 != r4) goto L5f
            goto L60
        L5f:
            r1 = 0
        L60:
            java.util.NavigableSet r6 = r6.subSet(r0, r3, r5, r1)
            return r6
        L65:
            boolean r0 = r7.hasLowerBound()
            if (r0 == 0) goto L7e
            java.lang.Comparable r0 = r7.lowerEndpoint()
            com.google.common.collect.BoundType r7 = r7.lowerBoundType()
            com.google.common.collect.BoundType r3 = com.google.common.collect.BoundType.CLOSED
            if (r7 != r3) goto L78
            goto L79
        L78:
            r1 = 0
        L79:
            java.util.NavigableSet r6 = r6.tailSet(r0, r1)
            return r6
        L7e:
            boolean r0 = r7.hasUpperBound()
            if (r0 == 0) goto L97
            java.lang.Comparable r0 = r7.upperEndpoint()
            com.google.common.collect.BoundType r7 = r7.upperBoundType()
            com.google.common.collect.BoundType r3 = com.google.common.collect.BoundType.CLOSED
            if (r7 != r3) goto L91
            goto L92
        L91:
            r1 = 0
        L92:
            java.util.NavigableSet r6 = r6.headSet(r0, r1)
            return r6
        L97:
            java.lang.Object r6 = com.google.common.base.Preconditions.checkNotNull(r6)
            java.util.NavigableSet r6 = (java.util.NavigableSet) r6
            return r6
    }

    public static <E> com.google.common.collect.Sets.SetView<E> symmetricDifference(java.util.Set<? extends E> r1, java.util.Set<? extends E> r2) {
            java.lang.String r0 = "set1"
            com.google.common.base.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "set2"
            com.google.common.base.Preconditions.checkNotNull(r2, r0)
            com.google.common.collect.Sets$4 r0 = new com.google.common.collect.Sets$4
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.NavigableSet<E> synchronizedNavigableSet(java.util.NavigableSet<E> r2) {
            com.google.common.collect.Synchronized$SynchronizedNavigableSet r0 = new com.google.common.collect.Synchronized$SynchronizedNavigableSet
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static <E> com.google.common.collect.Sets.SetView<E> union(java.util.Set<? extends E> r1, java.util.Set<? extends E> r2) {
            java.lang.String r0 = "set1"
            com.google.common.base.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "set2"
            com.google.common.base.Preconditions.checkNotNull(r2, r0)
            com.google.common.collect.Sets$1 r0 = new com.google.common.collect.Sets$1
            r0.<init>(r1, r2)
            return r0
    }

    public static <E> java.util.NavigableSet<E> unmodifiableNavigableSet(java.util.NavigableSet<E> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.ImmutableCollection
            if (r0 != 0) goto Lf
            boolean r0 = r1 instanceof com.google.common.collect.Sets.UnmodifiableNavigableSet
            if (r0 == 0) goto L9
            goto Lf
        L9:
            com.google.common.collect.Sets$UnmodifiableNavigableSet r0 = new com.google.common.collect.Sets$UnmodifiableNavigableSet
            r0.<init>(r1)
            return r0
        Lf:
            return r1
    }
}
