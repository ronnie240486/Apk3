package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class SortedMultisets {

    public static class ElementSet<E> extends com.google.common.collect.Multisets.ElementSet<E> implements java.util.SortedSet<E> {

        @com.google.j2objc.annotations.Weak
        private final com.google.common.collect.SortedMultiset<E> multiset;

        public ElementSet(com.google.common.collect.SortedMultiset<E> r1) {
                r0 = this;
                r0.<init>()
                r0.multiset = r1
                return
        }

        @Override // java.util.SortedSet
        public java.util.Comparator<? super E> comparator() {
                r1 = this;
                com.google.common.collect.SortedMultiset<E> r0 = r1.multiset
                java.util.Comparator r0 = r0.comparator()
                return r0
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public E first() {
                r1 = this;
                com.google.common.collect.SortedMultiset<E> r0 = r1.multiset
                com.google.common.collect.Multiset$Entry r0 = r0.firstEntry()
                java.lang.Object r0 = com.google.common.collect.SortedMultisets.access$000(r0)
                return r0
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> headSet(@com.google.common.collect.ParametricNullness E r3) {
                r2 = this;
                com.google.common.collect.SortedMultiset<E> r0 = r2.multiset
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN
                com.google.common.collect.SortedMultiset r3 = r0.headMultiset(r3, r1)
                java.util.NavigableSet r3 = r3.elementSet()
                return r3
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
                r2 = this;
                com.google.common.collect.SortedMultiset<E> r0 = r2.multiset
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.Multisets$5 r1 = new com.google.common.collect.Multisets$5
                r1.<init>(r0)
                return r1
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public E last() {
                r1 = this;
                com.google.common.collect.SortedMultiset<E> r0 = r1.multiset
                com.google.common.collect.Multiset$Entry r0 = r0.lastEntry()
                java.lang.Object r0 = com.google.common.collect.SortedMultisets.access$000(r0)
                return r0
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        public final com.google.common.collect.Multiset multiset() {
                r1 = this;
                com.google.common.collect.SortedMultiset<E> r0 = r1.multiset
                return r0
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        public final com.google.common.collect.SortedMultiset<E> multiset() {
                r1 = this;
                com.google.common.collect.SortedMultiset<E> r0 = r1.multiset
                return r0
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> subSet(@com.google.common.collect.ParametricNullness E r4, @com.google.common.collect.ParametricNullness E r5) {
                r3 = this;
                com.google.common.collect.SortedMultiset<E> r0 = r3.multiset
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED
                com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.OPEN
                com.google.common.collect.SortedMultiset r4 = r0.subMultiset(r4, r1, r5, r2)
                java.util.NavigableSet r4 = r4.elementSet()
                return r4
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> tailSet(@com.google.common.collect.ParametricNullness E r3) {
                r2 = this;
                com.google.common.collect.SortedMultiset<E> r0 = r2.multiset
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED
                com.google.common.collect.SortedMultiset r3 = r0.tailMultiset(r3, r1)
                java.util.NavigableSet r3 = r3.elementSet()
                return r3
        }
    }

    @com.google.common.annotations.GwtIncompatible
    public static class NavigableElementSet<E> extends com.google.common.collect.SortedMultisets.ElementSet<E> implements java.util.NavigableSet<E> {
        public NavigableElementSet(com.google.common.collect.SortedMultiset<E> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E ceiling(@com.google.common.collect.ParametricNullness E r3) {
                r2 = this;
                com.google.common.collect.SortedMultiset r0 = r2.multiset()
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED
                com.google.common.collect.SortedMultiset r3 = r0.tailMultiset(r3, r1)
                com.google.common.collect.Multiset$Entry r3 = r3.firstEntry()
                java.lang.Object r3 = com.google.common.collect.SortedMultisets.access$100(r3)
                return r3
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<E> descendingIterator() {
                r1 = this;
                java.util.NavigableSet r0 = r1.descendingSet()
                java.util.Iterator r0 = r0.iterator()
                return r0
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> descendingSet() {
                r2 = this;
                com.google.common.collect.SortedMultisets$NavigableElementSet r0 = new com.google.common.collect.SortedMultisets$NavigableElementSet
                com.google.common.collect.SortedMultiset r1 = r2.multiset()
                com.google.common.collect.SortedMultiset r1 = r1.descendingMultiset()
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E floor(@com.google.common.collect.ParametricNullness E r3) {
                r2 = this;
                com.google.common.collect.SortedMultiset r0 = r2.multiset()
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED
                com.google.common.collect.SortedMultiset r3 = r0.headMultiset(r3, r1)
                com.google.common.collect.Multiset$Entry r3 = r3.lastEntry()
                java.lang.Object r3 = com.google.common.collect.SortedMultisets.access$100(r3)
                return r3
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> headSet(@com.google.common.collect.ParametricNullness E r3, boolean r4) {
                r2 = this;
                com.google.common.collect.SortedMultisets$NavigableElementSet r0 = new com.google.common.collect.SortedMultisets$NavigableElementSet
                com.google.common.collect.SortedMultiset r1 = r2.multiset()
                com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.forBoolean(r4)
                com.google.common.collect.SortedMultiset r3 = r1.headMultiset(r3, r4)
                r0.<init>(r3)
                return r0
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E higher(@com.google.common.collect.ParametricNullness E r3) {
                r2 = this;
                com.google.common.collect.SortedMultiset r0 = r2.multiset()
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN
                com.google.common.collect.SortedMultiset r3 = r0.tailMultiset(r3, r1)
                com.google.common.collect.Multiset$Entry r3 = r3.firstEntry()
                java.lang.Object r3 = com.google.common.collect.SortedMultisets.access$100(r3)
                return r3
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E lower(@com.google.common.collect.ParametricNullness E r3) {
                r2 = this;
                com.google.common.collect.SortedMultiset r0 = r2.multiset()
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN
                com.google.common.collect.SortedMultiset r3 = r0.headMultiset(r3, r1)
                com.google.common.collect.Multiset$Entry r3 = r3.lastEntry()
                java.lang.Object r3 = com.google.common.collect.SortedMultisets.access$100(r3)
                return r3
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollFirst() {
                r1 = this;
                com.google.common.collect.SortedMultiset r0 = r1.multiset()
                com.google.common.collect.Multiset$Entry r0 = r0.pollFirstEntry()
                java.lang.Object r0 = com.google.common.collect.SortedMultisets.access$100(r0)
                return r0
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public E pollLast() {
                r1 = this;
                com.google.common.collect.SortedMultiset r0 = r1.multiset()
                com.google.common.collect.Multiset$Entry r0 = r0.pollLastEntry()
                java.lang.Object r0 = com.google.common.collect.SortedMultisets.access$100(r0)
                return r0
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> subSet(@com.google.common.collect.ParametricNullness E r3, boolean r4, @com.google.common.collect.ParametricNullness E r5, boolean r6) {
                r2 = this;
                com.google.common.collect.SortedMultisets$NavigableElementSet r0 = new com.google.common.collect.SortedMultisets$NavigableElementSet
                com.google.common.collect.SortedMultiset r1 = r2.multiset()
                com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.forBoolean(r4)
                com.google.common.collect.BoundType r6 = com.google.common.collect.BoundType.forBoolean(r6)
                com.google.common.collect.SortedMultiset r3 = r1.subMultiset(r3, r4, r5, r6)
                r0.<init>(r3)
                return r0
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> tailSet(@com.google.common.collect.ParametricNullness E r3, boolean r4) {
                r2 = this;
                com.google.common.collect.SortedMultisets$NavigableElementSet r0 = new com.google.common.collect.SortedMultisets$NavigableElementSet
                com.google.common.collect.SortedMultiset r1 = r2.multiset()
                com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.forBoolean(r4)
                com.google.common.collect.SortedMultiset r3 = r1.tailMultiset(r3, r4)
                r0.<init>(r3)
                return r0
        }
    }

    private SortedMultisets() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.Object access$000(com.google.common.collect.Multiset.Entry r0) {
            java.lang.Object r0 = getElementOrThrow(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object access$100(com.google.common.collect.Multiset.Entry r0) {
            java.lang.Object r0 = getElementOrNull(r0)
            return r0
    }

    @javax.annotation.CheckForNull
    private static <E> E getElementOrNull(@javax.annotation.CheckForNull com.google.common.collect.Multiset.Entry<E> r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            java.lang.Object r0 = r0.getElement()
        L8:
            return r0
    }

    private static <E> E getElementOrThrow(@javax.annotation.CheckForNull com.google.common.collect.Multiset.Entry<E> r0) {
            if (r0 == 0) goto L7
            java.lang.Object r0 = r0.getElement()
            return r0
        L7:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
