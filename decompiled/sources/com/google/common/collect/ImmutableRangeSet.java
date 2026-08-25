package com.google.common.collect;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class ImmutableRangeSet<C extends java.lang.Comparable> extends com.google.common.collect.AbstractRangeSet<C> implements java.io.Serializable {
    private static final com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>> ALL = null;
    private static final com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>> EMPTY = null;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableRangeSet<C> complement;
    private final transient com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> ranges;


    public final class AsSet extends com.google.common.collect.ImmutableSortedSet<C> {
        private final com.google.common.collect.DiscreteDomain<C> domain;

        @javax.annotation.CheckForNull
        private transient java.lang.Integer size;
        public final /* synthetic */ com.google.common.collect.ImmutableRangeSet this$0;



        public AsSet(com.google.common.collect.ImmutableRangeSet r1, com.google.common.collect.DiscreteDomain<C> r2) {
                r0 = this;
                r0.this$0 = r1
                com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
                r0.<init>(r1)
                r0.domain = r2
                return
        }

        public static /* synthetic */ com.google.common.collect.DiscreteDomain access$100(com.google.common.collect.ImmutableRangeSet.AsSet r0) {
                com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r0 = r0.domain
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                r0 = 0
                if (r3 != 0) goto L4
                return r0
            L4:
                java.lang.Comparable r3 = (java.lang.Comparable) r3     // Catch: java.lang.ClassCastException -> Ld
                com.google.common.collect.ImmutableRangeSet r1 = r2.this$0     // Catch: java.lang.ClassCastException -> Ld
                boolean r3 = r1.contains(r3)     // Catch: java.lang.ClassCastException -> Ld
                return r3
            Ld:
                return r0
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final com.google.common.collect.ImmutableSortedSet<C> createDescendingSet() {
                r1 = this;
                com.google.common.collect.DescendingImmutableSortedSet r0 = new com.google.common.collect.DescendingImmutableSortedSet
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        @com.google.common.annotations.GwtIncompatible("NavigableSet")
        public com.google.common.collect.UnmodifiableIterator<C> descendingIterator() {
                r1 = this;
                com.google.common.collect.ImmutableRangeSet$AsSet$2 r0 = new com.google.common.collect.ImmutableRangeSet$AsSet$2
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        @com.google.common.annotations.GwtIncompatible("NavigableSet")
        public /* bridge */ /* synthetic */ java.util.Iterator descendingIterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableIterator r0 = r1.descendingIterator()
                return r0
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final com.google.common.collect.ImmutableSortedSet headSetImpl(java.lang.Object r1, boolean r2) {
                r0 = this;
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.forBoolean(r2)
                com.google.common.collect.Range r1 = com.google.common.collect.Range.upTo(r1, r2)
                com.google.common.collect.ImmutableSortedSet r1 = r0.subSet(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
                r1 = this;
                com.google.common.collect.ImmutableRangeSet r0 = r1.this$0
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableRangeSet.access$000(r0)
                boolean r0 = r0.isPartialView()
                return r0
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<C> iterator() {
                r1 = this;
                com.google.common.collect.ImmutableRangeSet$AsSet$1 r0 = new com.google.common.collect.ImmutableRangeSet$AsSet$1
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r6 = this;
                java.lang.Integer r0 = r6.size
                if (r0 != 0) goto L39
                r0 = 0
                com.google.common.collect.ImmutableRangeSet r2 = r6.this$0
                com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableRangeSet.access$000(r2)
                com.google.common.collect.UnmodifiableIterator r2 = r2.iterator()
            L10:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L2f
                java.lang.Object r3 = r2.next()
                com.google.common.collect.Range r3 = (com.google.common.collect.Range) r3
                com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r4 = r6.domain
                com.google.common.collect.ContiguousSet r3 = com.google.common.collect.ContiguousSet.create(r3, r4)
                int r3 = r3.size()
                long r3 = (long) r3
                long r0 = r0 + r3
                r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 < 0) goto L10
            L2f:
                int r0 = com.google.common.primitives.Ints.saturatedCast(r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r6.size = r0
            L39:
                int r0 = r0.intValue()
                return r0
        }

        public final com.google.common.collect.ImmutableSortedSet<C> subSet(com.google.common.collect.Range<C> r2) {
                r1 = this;
                com.google.common.collect.ImmutableRangeSet r0 = r1.this$0
                com.google.common.collect.ImmutableRangeSet r2 = r0.subRangeSet(r2)
                com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r0 = r1.domain
                com.google.common.collect.ImmutableSortedSet r2 = r2.asSet(r0)
                return r2
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final com.google.common.collect.ImmutableSortedSet subSetImpl(java.lang.Object r2, boolean r3, java.lang.Object r4, boolean r5) {
                r1 = this;
                java.lang.Comparable r2 = (java.lang.Comparable) r2
                java.lang.Comparable r4 = (java.lang.Comparable) r4
                if (r3 != 0) goto L15
                if (r5 != 0) goto L15
                int r0 = com.google.common.collect.Range.$r8$clinit
                int r0 = r2.compareTo(r4)
                if (r0 != 0) goto L15
                com.google.common.collect.ImmutableSortedSet r2 = com.google.common.collect.ImmutableSortedSet.of()
                goto L25
            L15:
                com.google.common.collect.BoundType r3 = com.google.common.collect.BoundType.forBoolean(r3)
                com.google.common.collect.BoundType r5 = com.google.common.collect.BoundType.forBoolean(r5)
                com.google.common.collect.Range r2 = com.google.common.collect.Range.range(r2, r3, r4, r5)
                com.google.common.collect.ImmutableSortedSet r2 = r1.subSet(r2)
            L25:
                return r2
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final com.google.common.collect.ImmutableSortedSet tailSetImpl(java.lang.Object r1, boolean r2) {
                r0 = this;
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.forBoolean(r2)
                com.google.common.collect.Range r1 = com.google.common.collect.Range.downTo(r1, r2)
                com.google.common.collect.ImmutableSortedSet r1 = r0.subSet(r1)
                return r1
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
                r1 = this;
                com.google.common.collect.ImmutableRangeSet r0 = r1.this$0
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableRangeSet.access$000(r0)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class AsSetSerializedForm<C extends java.lang.Comparable> implements java.io.Serializable {
        private final com.google.common.collect.DiscreteDomain<C> domain;
        private final com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> ranges;
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class Builder<C extends java.lang.Comparable<?>> {
        private final java.util.List<com.google.common.collect.Range<C>> ranges;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList()
                r1.ranges = r0
                return
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableRangeSet.Builder<C> add(com.google.common.collect.Range<C> r3) {
                r2 = this;
                boolean r0 = r3.isEmpty()
                r0 = r0 ^ 1
                java.lang.String r1 = "range must not be empty, but was %s"
                com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
                java.util.List<com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r2.ranges
                r0.add(r3)
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableRangeSet.Builder<C> addAll(com.google.common.collect.RangeSet<C> r1) {
                r0 = this;
                java.util.Set r1 = r1.asRanges()
                com.google.common.collect.ImmutableRangeSet$Builder r1 = r0.addAll(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableRangeSet.Builder<C> addAll(java.lang.Iterable<com.google.common.collect.Range<C>> r2) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L14
                java.lang.Object r0 = r2.next()
                com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
                r1.add(r0)
                goto L4
            L14:
                return r1
        }

        public com.google.common.collect.ImmutableRangeSet<C> build() {
                r6 = this;
                com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
                java.util.List<com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r1 = r6.ranges
                int r1 = r1.size()
                r0.<init>(r1)
                java.util.List<com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r1 = r6.ranges
                int r2 = com.google.common.collect.Range.$r8$clinit
                com.google.common.collect.Ordering<com.google.common.collect.Range<?>> r2 = com.google.common.collect.Range.RangeLexOrdering.INSTANCE
                java.util.Collections.sort(r1, r2)
                java.util.List<com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r1 = r6.ranges
                java.util.Iterator r1 = r1.iterator()
                com.google.common.collect.PeekingIterator r1 = com.google.common.collect.Iterators.peekingIterator(r1)
            L1e:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L58
                java.lang.Object r2 = r1.next()
                com.google.common.collect.Range r2 = (com.google.common.collect.Range) r2
            L2a:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L54
                java.lang.Object r3 = r1.peek()
                com.google.common.collect.Range r3 = (com.google.common.collect.Range) r3
                boolean r4 = r2.isConnected(r3)
                if (r4 == 0) goto L54
                com.google.common.collect.Range r4 = r2.intersection(r3)
                boolean r4 = r4.isEmpty()
                java.lang.String r5 = "Overlapping ranges not permitted but found %s overlapping %s"
                com.google.common.base.Preconditions.checkArgument(r4, r5, r2, r3)
                java.lang.Object r3 = r1.next()
                com.google.common.collect.Range r3 = (com.google.common.collect.Range) r3
                com.google.common.collect.Range r2 = r2.span(r3)
                goto L2a
            L54:
                r0.add(r2)
                goto L1e
            L58:
                com.google.common.collect.ImmutableList r0 = r0.build()
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L67
                com.google.common.collect.ImmutableRangeSet r0 = com.google.common.collect.ImmutableRangeSet.of()
                return r0
            L67:
                int r1 = r0.size()
                r2 = 1
                if (r1 != r2) goto L83
                java.lang.Object r1 = com.google.common.collect.Iterables.getOnlyElement(r0)
                com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
                com.google.common.collect.Range r2 = com.google.common.collect.Range.all()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L83
                com.google.common.collect.ImmutableRangeSet r0 = com.google.common.collect.ImmutableRangeSet.all()
                return r0
            L83:
                com.google.common.collect.ImmutableRangeSet r1 = new com.google.common.collect.ImmutableRangeSet
                r1.<init>(r0)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class ComplementRanges extends com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> {
        private final boolean positiveBoundedAbove;
        private final boolean positiveBoundedBelow;
        private final int size;
        public final /* synthetic */ com.google.common.collect.ImmutableRangeSet this$0;

        public ComplementRanges(com.google.common.collect.ImmutableRangeSet r3) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableRangeSet.access$000(r3)
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
                boolean r0 = r0.hasLowerBound()
                r2.positiveBoundedBelow = r0
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableRangeSet.access$000(r3)
                java.lang.Object r1 = com.google.common.collect.Iterables.getLast(r1)
                com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
                boolean r1 = r1.hasUpperBound()
                r2.positiveBoundedAbove = r1
                com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableRangeSet.access$000(r3)
                int r3 = r3.size()
                int r3 = r3 + (-1)
                if (r0 == 0) goto L34
                int r3 = r3 + 1
            L34:
                if (r1 == 0) goto L38
                int r3 = r3 + 1
            L38:
                r2.size = r3
                return
        }

        @Override // java.util.List
        public com.google.common.collect.Range<C> get(int r4) {
                r3 = this;
                int r0 = r3.size
                com.google.common.base.Preconditions.checkElementIndex(r4, r0)
                boolean r0 = r3.positiveBoundedBelow
                if (r0 == 0) goto L21
                if (r4 != 0) goto L10
                com.google.common.collect.Cut$BelowAll r0 = com.google.common.collect.Cut.BelowAll.access$000()
                goto L2f
            L10:
                com.google.common.collect.ImmutableRangeSet r0 = r3.this$0
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableRangeSet.access$000(r0)
                int r1 = r4 + (-1)
                java.lang.Object r0 = r0.get(r1)
                com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
                com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.upperBound
                goto L2f
            L21:
                com.google.common.collect.ImmutableRangeSet r0 = r3.this$0
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableRangeSet.access$000(r0)
                java.lang.Object r0 = r0.get(r4)
                com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
                com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.upperBound
            L2f:
                boolean r1 = r3.positiveBoundedAbove
                if (r1 == 0) goto L3e
                int r1 = r3.size
                int r1 = r1 + (-1)
                if (r4 != r1) goto L3e
                com.google.common.collect.Cut$AboveAll r4 = com.google.common.collect.Cut.AboveAll.access$100()
                goto L51
            L3e:
                com.google.common.collect.ImmutableRangeSet r1 = r3.this$0
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableRangeSet.access$000(r1)
                boolean r2 = r3.positiveBoundedBelow
                r2 = r2 ^ 1
                int r4 = r4 + r2
                java.lang.Object r4 = r1.get(r4)
                com.google.common.collect.Range r4 = (com.google.common.collect.Range) r4
                com.google.common.collect.Cut<C extends java.lang.Comparable> r4 = r4.lowerBound
            L51:
                com.google.common.collect.Range r4 = com.google.common.collect.Range.create(r0, r4)
                return r4
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                com.google.common.collect.Range r1 = r0.get(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                int r0 = r1.size
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class SerializedForm<C extends java.lang.Comparable> implements java.io.Serializable {
        private final com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> ranges;
    }

    static {
            com.google.common.collect.ImmutableRangeSet r0 = new com.google.common.collect.ImmutableRangeSet
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            r0.<init>(r1)
            com.google.common.collect.ImmutableRangeSet.EMPTY = r0
            com.google.common.collect.ImmutableRangeSet r0 = new com.google.common.collect.ImmutableRangeSet
            com.google.common.collect.Range r1 = com.google.common.collect.Range.all()
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r1)
            r0.<init>(r1)
            com.google.common.collect.ImmutableRangeSet.ALL = r0
            return
    }

    public ImmutableRangeSet(com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> r1) {
            r0 = this;
            r0.<init>()
            r0.ranges = r1
            return
    }

    private ImmutableRangeSet(com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> r1, com.google.common.collect.ImmutableRangeSet<C> r2) {
            r0 = this;
            r0.<init>()
            r0.ranges = r1
            r0.complement = r2
            return
    }

    public static /* synthetic */ com.google.common.collect.ImmutableList access$000(com.google.common.collect.ImmutableRangeSet r0) {
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r0 = r0.ranges
            return r0
    }

    public static <C extends java.lang.Comparable> com.google.common.collect.ImmutableRangeSet<C> all() {
            com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>> r0 = com.google.common.collect.ImmutableRangeSet.ALL
            return r0
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.ImmutableRangeSet.Builder<C> builder() {
            com.google.common.collect.ImmutableRangeSet$Builder r0 = new com.google.common.collect.ImmutableRangeSet$Builder
            r0.<init>()
            return r0
    }

    public static <C extends java.lang.Comparable> com.google.common.collect.ImmutableRangeSet<C> copyOf(com.google.common.collect.RangeSet<C> r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Le
            com.google.common.collect.ImmutableRangeSet r2 = of()
            return r2
        Le:
            com.google.common.collect.Range r0 = com.google.common.collect.Range.all()
            boolean r0 = r2.encloses(r0)
            if (r0 == 0) goto L1b
            com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>> r2 = com.google.common.collect.ImmutableRangeSet.ALL
            return r2
        L1b:
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableRangeSet
            if (r0 == 0) goto L2b
            r0 = r2
            com.google.common.collect.ImmutableRangeSet r0 = (com.google.common.collect.ImmutableRangeSet) r0
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r1 = r0.ranges
            boolean r1 = r1.isPartialView()
            if (r1 != 0) goto L2b
            return r0
        L2b:
            com.google.common.collect.ImmutableRangeSet r0 = new com.google.common.collect.ImmutableRangeSet
            java.util.Set r2 = r2.asRanges()
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf(r2)
            r0.<init>(r2)
            return r0
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.ImmutableRangeSet<C> copyOf(java.lang.Iterable<com.google.common.collect.Range<C>> r1) {
            com.google.common.collect.ImmutableRangeSet$Builder r0 = new com.google.common.collect.ImmutableRangeSet$Builder
            r0.<init>()
            com.google.common.collect.ImmutableRangeSet$Builder r1 = r0.addAll(r1)
            com.google.common.collect.ImmutableRangeSet r1 = r1.build()
            return r1
    }

    private com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> intersectRanges(com.google.common.collect.Range<C> r7) {
            r6 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r0 = r6.ranges
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5f
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto Lf
            goto L5f
        Lf:
            com.google.common.collect.Range r0 = r6.span()
            boolean r0 = r7.encloses(r0)
            if (r0 == 0) goto L1c
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r7 = r6.ranges
            return r7
        L1c:
            boolean r0 = r7.hasLowerBound()
            if (r0 == 0) goto L33
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r0 = r6.ranges
            int r1 = com.google.common.collect.Range.$r8$clinit
            com.google.common.collect.Range$UpperBoundFn r1 = com.google.common.collect.Range.UpperBoundFn.INSTANCE
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r7.lowerBound
            com.google.common.collect.SortedLists$KeyPresentBehavior r3 = com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_AFTER
            com.google.common.collect.SortedLists$KeyAbsentBehavior r4 = com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER
            int r0 = com.google.common.collect.SortedLists.binarySearch(r0, r1, r2, r3, r4)
            goto L34
        L33:
            r0 = 0
        L34:
            boolean r1 = r7.hasUpperBound()
            if (r1 == 0) goto L4b
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r1 = r6.ranges
            int r2 = com.google.common.collect.Range.$r8$clinit
            com.google.common.collect.Range$LowerBoundFn r2 = com.google.common.collect.Range.LowerBoundFn.INSTANCE
            com.google.common.collect.Cut<C extends java.lang.Comparable> r3 = r7.upperBound
            com.google.common.collect.SortedLists$KeyPresentBehavior r4 = com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_PRESENT
            com.google.common.collect.SortedLists$KeyAbsentBehavior r5 = com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER
            int r1 = com.google.common.collect.SortedLists.binarySearch(r1, r2, r3, r4, r5)
            goto L51
        L4b:
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r1 = r6.ranges
            int r1 = r1.size()
        L51:
            int r1 = r1 - r0
            if (r1 != 0) goto L59
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.of()
            return r7
        L59:
            com.google.common.collect.ImmutableRangeSet$1 r2 = new com.google.common.collect.ImmutableRangeSet$1
            r2.<init>(r6, r1, r0, r7)
            return r2
        L5f:
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.of()
            return r7
    }

    public static <C extends java.lang.Comparable> com.google.common.collect.ImmutableRangeSet<C> of() {
            com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>> r0 = com.google.common.collect.ImmutableRangeSet.EMPTY
            return r0
    }

    public static <C extends java.lang.Comparable> com.google.common.collect.ImmutableRangeSet<C> of(com.google.common.collect.Range<C> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Le
            com.google.common.collect.ImmutableRangeSet r1 = of()
            return r1
        Le:
            com.google.common.collect.Range r0 = com.google.common.collect.Range.all()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1b
            com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>> r1 = com.google.common.collect.ImmutableRangeSet.ALL
            return r1
        L1b:
            com.google.common.collect.ImmutableRangeSet r0 = new com.google.common.collect.ImmutableRangeSet
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r1)
            r0.<init>(r1)
            return r0
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.ImmutableRangeSet<C> unionOf(java.lang.Iterable<com.google.common.collect.Range<C>> r0) {
            com.google.common.collect.TreeRangeSet r0 = com.google.common.collect.TreeRangeSet.create(r0)
            com.google.common.collect.ImmutableRangeSet r0 = copyOf(r0)
            return r0
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public void add(com.google.common.collect.Range<C> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public void addAll(com.google.common.collect.RangeSet<C> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public void addAll(java.lang.Iterable<com.google.common.collect.Range<C>> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.RangeSet
    public com.google.common.collect.ImmutableSet<com.google.common.collect.Range<C>> asDescendingSetOfRanges() {
            r3 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r0 = r3.ranges
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of()
            return r0
        Ld:
            com.google.common.collect.RegularImmutableSortedSet r0 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r1 = r3.ranges
            com.google.common.collect.ImmutableList r1 = r1.reverse()
            com.google.common.collect.Ordering<com.google.common.collect.Range<?>> r2 = com.google.common.collect.Range.RangeLexOrdering.INSTANCE
            com.google.common.collect.Ordering r2 = r2.reverse()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ java.util.Set asDescendingSetOfRanges() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.asDescendingSetOfRanges()
            return r0
    }

    @Override // com.google.common.collect.RangeSet
    public com.google.common.collect.ImmutableSet<com.google.common.collect.Range<C>> asRanges() {
            r3 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r0 = r3.ranges
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of()
            return r0
        Ld:
            com.google.common.collect.RegularImmutableSortedSet r0 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r1 = r3.ranges
            com.google.common.collect.Ordering<com.google.common.collect.Range<?>> r2 = com.google.common.collect.Range.RangeLexOrdering.INSTANCE
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ java.util.Set asRanges() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.asRanges()
            return r0
    }

    public com.google.common.collect.ImmutableSortedSet<C> asSet(com.google.common.collect.DiscreteDomain<C> r3) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Le
            com.google.common.collect.ImmutableSortedSet r3 = com.google.common.collect.ImmutableSortedSet.of()
            return r3
        Le:
            com.google.common.collect.Range r0 = r2.span()
            com.google.common.collect.Range r0 = r0.canonical(r3)
            boolean r1 = r0.hasLowerBound()
            if (r1 == 0) goto L34
            boolean r0 = r0.hasUpperBound()
            if (r0 != 0) goto L2e
            r3.maxValue()     // Catch: java.util.NoSuchElementException -> L26
            goto L2e
        L26:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Neither the DiscreteDomain nor this range set are bounded above"
            r3.<init>(r0)
            throw r3
        L2e:
            com.google.common.collect.ImmutableRangeSet$AsSet r0 = new com.google.common.collect.ImmutableRangeSet$AsSet
            r0.<init>(r2, r3)
            return r0
        L34:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Neither the DiscreteDomain nor this range set are bounded below"
            r3.<init>(r0)
            throw r3
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void clear() {
            r0 = this;
            super.clear()
            return
    }

    @Override // com.google.common.collect.RangeSet
    public com.google.common.collect.ImmutableRangeSet<C> complement() {
            r2 = this;
            com.google.common.collect.ImmutableRangeSet<C extends java.lang.Comparable> r0 = r2.complement
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r0 = r2.ranges
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>> r0 = com.google.common.collect.ImmutableRangeSet.ALL
            r2.complement = r0
            return r0
        L12:
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r0 = r2.ranges
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L35
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r0 = r2.ranges
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            com.google.common.collect.Range r1 = com.google.common.collect.Range.all()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            com.google.common.collect.ImmutableRangeSet r0 = of()
            r2.complement = r0
            return r0
        L35:
            com.google.common.collect.ImmutableRangeSet$ComplementRanges r0 = new com.google.common.collect.ImmutableRangeSet$ComplementRanges
            r0.<init>(r2)
            com.google.common.collect.ImmutableRangeSet r1 = new com.google.common.collect.ImmutableRangeSet
            r1.<init>(r0, r2)
            r2.complement = r1
            return r1
    }

    @Override // com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ com.google.common.collect.RangeSet complement() {
            r1 = this;
            com.google.common.collect.ImmutableRangeSet r0 = r1.complement()
            return r0
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    public com.google.common.collect.ImmutableRangeSet<C> difference(com.google.common.collect.RangeSet<C> r2) {
            r1 = this;
            com.google.common.collect.TreeRangeSet r0 = com.google.common.collect.TreeRangeSet.create(r1)
            r0.removeAll(r2)
            com.google.common.collect.ImmutableRangeSet r2 = copyOf(r0)
            return r2
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean encloses(com.google.common.collect.Range<C> r7) {
            r6 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r0 = r6.ranges
            int r1 = com.google.common.collect.Range.$r8$clinit
            com.google.common.collect.Range$LowerBoundFn r1 = com.google.common.collect.Range.LowerBoundFn.INSTANCE
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r7.lowerBound
            com.google.common.collect.Ordering r3 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.SortedLists$KeyPresentBehavior r4 = com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT
            com.google.common.collect.SortedLists$KeyAbsentBehavior r5 = com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_LOWER
            int r0 = com.google.common.collect.SortedLists.binarySearch(r0, r1, r2, r3, r4, r5)
            r1 = -1
            if (r0 == r1) goto L27
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r1 = r6.ranges
            java.lang.Object r0 = r1.get(r0)
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            boolean r7 = r0.encloses(r7)
            if (r7 == 0) goto L27
            r7 = 1
            goto L28
        L27:
            r7 = 0
        L28:
            return r7
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(com.google.common.collect.RangeSet r1) {
            r0 = this;
            boolean r1 = super.enclosesAll(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(java.lang.Iterable r1) {
            r0 = this;
            boolean r1 = super.enclosesAll(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    public com.google.common.collect.ImmutableRangeSet<C> intersection(com.google.common.collect.RangeSet<C> r2) {
            r1 = this;
            com.google.common.collect.TreeRangeSet r0 = com.google.common.collect.TreeRangeSet.create(r1)
            com.google.common.collect.RangeSet r2 = r2.complement()
            r0.removeAll(r2)
            com.google.common.collect.ImmutableRangeSet r2 = copyOf(r0)
            return r2
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean intersects(com.google.common.collect.Range<C> r7) {
            r6 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r0 = r6.ranges
            int r1 = com.google.common.collect.Range.$r8$clinit
            com.google.common.collect.Range$LowerBoundFn r1 = com.google.common.collect.Range.LowerBoundFn.INSTANCE
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r7.lowerBound
            com.google.common.collect.Ordering r3 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.SortedLists$KeyPresentBehavior r4 = com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT
            com.google.common.collect.SortedLists$KeyAbsentBehavior r5 = com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER
            int r0 = com.google.common.collect.SortedLists.binarySearch(r0, r1, r2, r3, r4, r5)
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r1 = r6.ranges
            int r1 = r1.size()
            r2 = 1
            if (r0 >= r1) goto L3e
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r1 = r6.ranges
            java.lang.Object r1 = r1.get(r0)
            com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
            boolean r1 = r1.isConnected(r7)
            if (r1 == 0) goto L3e
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r1 = r6.ranges
            java.lang.Object r1 = r1.get(r0)
            com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
            com.google.common.collect.Range r1 = r1.intersection(r7)
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L3e
            return r2
        L3e:
            if (r0 <= 0) goto L62
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r1 = r6.ranges
            int r0 = r0 - r2
            java.lang.Object r1 = r1.get(r0)
            com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
            boolean r1 = r1.isConnected(r7)
            if (r1 == 0) goto L62
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r1 = r6.ranges
            java.lang.Object r0 = r1.get(r0)
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            com.google.common.collect.Range r7 = r0.intersection(r7)
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L62
            goto L63
        L62:
            r2 = 0
        L63:
            return r2
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean isEmpty() {
            r1 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r0 = r1.ranges
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @javax.annotation.CheckForNull
    public com.google.common.collect.Range<C> rangeContaining(C r7) {
            r6 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r0 = r6.ranges
            int r1 = com.google.common.collect.Range.$r8$clinit
            com.google.common.collect.Range$LowerBoundFn r1 = com.google.common.collect.Range.LowerBoundFn.INSTANCE
            com.google.common.collect.Cut$BelowValue r2 = new com.google.common.collect.Cut$BelowValue
            r2.<init>(r7)
            com.google.common.collect.Ordering r3 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.SortedLists$KeyPresentBehavior r4 = com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT
            com.google.common.collect.SortedLists$KeyAbsentBehavior r5 = com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_LOWER
            int r0 = com.google.common.collect.SortedLists.binarySearch(r0, r1, r2, r3, r4, r5)
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L2a
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r1 = r6.ranges
            java.lang.Object r0 = r1.get(r0)
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            boolean r7 = r0.contains(r7)
            if (r7 == 0) goto L2a
            r2 = r0
        L2a:
            return r2
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public void remove(com.google.common.collect.Range<C> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public void removeAll(com.google.common.collect.RangeSet<C> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public void removeAll(java.lang.Iterable<com.google.common.collect.Range<C>> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.RangeSet
    public com.google.common.collect.Range<C> span() {
            r3 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r0 = r3.ranges
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L28
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r0 = r3.ranges
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.lowerBound
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<C extends java.lang.Comparable>> r1 = r3.ranges
            int r2 = r1.size()
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.get(r2)
            com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.upperBound
            com.google.common.collect.Range r0 = com.google.common.collect.Range.create(r0, r1)
            return r0
        L28:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.RangeSet
    public com.google.common.collect.ImmutableRangeSet<C> subRangeSet(com.google.common.collect.Range<C> r3) {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L21
            com.google.common.collect.Range r0 = r2.span()
            boolean r1 = r3.encloses(r0)
            if (r1 == 0) goto L11
            return r2
        L11:
            boolean r0 = r3.isConnected(r0)
            if (r0 == 0) goto L21
            com.google.common.collect.ImmutableRangeSet r0 = new com.google.common.collect.ImmutableRangeSet
            com.google.common.collect.ImmutableList r3 = r2.intersectRanges(r3)
            r0.<init>(r3)
            return r0
        L21:
            com.google.common.collect.ImmutableRangeSet r3 = of()
            return r3
    }

    @Override // com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ com.google.common.collect.RangeSet subRangeSet(com.google.common.collect.Range r1) {
            r0 = this;
            com.google.common.collect.ImmutableRangeSet r1 = r0.subRangeSet(r1)
            return r1
    }

    public com.google.common.collect.ImmutableRangeSet<C> union(com.google.common.collect.RangeSet<C> r2) {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.asRanges()
            java.util.Set r2 = r2.asRanges()
            java.lang.Iterable r2 = com.google.common.collect.Iterables.concat(r0, r2)
            com.google.common.collect.ImmutableRangeSet r2 = unionOf(r2)
            return r2
    }
}
