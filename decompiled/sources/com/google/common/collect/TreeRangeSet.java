package com.google.common.collect;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public class TreeRangeSet<C extends java.lang.Comparable<?>> extends com.google.common.collect.AbstractRangeSet<C> implements java.io.Serializable {

    @javax.annotation.CheckForNull
    private transient java.util.Set<com.google.common.collect.Range<C>> asDescendingSetOfRanges;

    @javax.annotation.CheckForNull
    private transient java.util.Set<com.google.common.collect.Range<C>> asRanges;

    @javax.annotation.CheckForNull
    private transient com.google.common.collect.RangeSet<C> complement;

    @com.google.common.annotations.VisibleForTesting
    public final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> rangesByLowerBound;

    /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public final class AsRanges extends com.google.common.collect.ForwardingCollection<com.google.common.collect.Range<C>> implements java.util.Set<com.google.common.collect.Range<C>> {
        public final java.util.Collection<com.google.common.collect.Range<C>> delegate;

        public AsRanges(java.util.Collection<com.google.common.collect.Range<C>> r1) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                return
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                java.util.Collection<com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Collection<com.google.common.collect.Range<C>> delegate() {
                r1 = this;
                java.util.Collection<com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r1.delegate
                return r0
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

    public final class Complement extends com.google.common.collect.TreeRangeSet<C> {
        public final /* synthetic */ com.google.common.collect.TreeRangeSet this$0;

        public Complement(com.google.common.collect.TreeRangeSet r2) {
                r1 = this;
                r1.this$0 = r2
                com.google.common.collect.TreeRangeSet$ComplementRangesByLowerBound r0 = new com.google.common.collect.TreeRangeSet$ComplementRangesByLowerBound
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r2 = r2.rangesByLowerBound
                r0.<init>(r2)
                r2 = 0
                r1.<init>(r0, r2)
                return
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void add(com.google.common.collect.Range<C> r2) {
                r1 = this;
                com.google.common.collect.TreeRangeSet r0 = r1.this$0
                r0.remove(r2)
                return
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public com.google.common.collect.RangeSet<C> complement() {
                r1 = this;
                com.google.common.collect.TreeRangeSet r0 = r1.this$0
                return r0
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean contains(C r2) {
                r1 = this;
                com.google.common.collect.TreeRangeSet r0 = r1.this$0
                boolean r2 = r0.contains(r2)
                r2 = r2 ^ 1
                return r2
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void remove(com.google.common.collect.Range<C> r2) {
                r1 = this;
                com.google.common.collect.TreeRangeSet r0 = r1.this$0
                r0.add(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class ComplementRangesByLowerBound<C extends java.lang.Comparable<?>> extends com.google.common.collect.AbstractNavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> {
        private final com.google.common.collect.Range<com.google.common.collect.Cut<C>> complementLowerBoundWindow;
        private final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> positiveRangesByLowerBound;
        private final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> positiveRangesByUpperBound;



        public ComplementRangesByLowerBound(java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> r2) {
                r1 = this;
                com.google.common.collect.Range r0 = com.google.common.collect.Range.all()
                r1.<init>(r2, r0)
                return
        }

        private ComplementRangesByLowerBound(java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> r2, com.google.common.collect.Range<com.google.common.collect.Cut<C>> r3) {
                r1 = this;
                r1.<init>()
                r1.positiveRangesByLowerBound = r2
                com.google.common.collect.TreeRangeSet$RangesByUpperBound r0 = new com.google.common.collect.TreeRangeSet$RangesByUpperBound
                r0.<init>(r2)
                r1.positiveRangesByUpperBound = r0
                r1.complementLowerBoundWindow = r3
                return
        }

        public static /* synthetic */ com.google.common.collect.Range access$100(com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound r0) {
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r0.complementLowerBoundWindow
                return r0
        }

        private java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Range<com.google.common.collect.Cut<C>> r3) {
                r2 = this;
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r2.complementLowerBoundWindow
                boolean r0 = r0.isConnected(r3)
                if (r0 != 0) goto Ld
                com.google.common.collect.ImmutableSortedMap r3 = com.google.common.collect.ImmutableSortedMap.of()
                return r3
            Ld:
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r2.complementLowerBoundWindow
                com.google.common.collect.Range r3 = r3.intersection(r0)
                com.google.common.collect.TreeRangeSet$ComplementRangesByLowerBound r0 = new com.google.common.collect.TreeRangeSet$ComplementRangesByLowerBound
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r1 = r2.positiveRangesByLowerBound
                r0.<init>(r1, r3)
                return r0
        }

        @Override // java.util.SortedMap
        public java.util.Comparator<? super com.google.common.collect.Cut<C>> comparator() {
                r1 = this;
                com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.Range r1 = r0.get(r1)
                if (r1 == 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public final java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> descendingEntryIterator() {
                r3 = this;
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r3.complementLowerBoundWindow
                boolean r0 = r0.hasUpperBound()
                if (r0 == 0) goto L11
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r3.complementLowerBoundWindow
                java.lang.Comparable r0 = r0.upperEndpoint()
                com.google.common.collect.Cut r0 = (com.google.common.collect.Cut) r0
                goto L15
            L11:
                com.google.common.collect.Cut$AboveAll r0 = com.google.common.collect.Cut.AboveAll.access$100()
            L15:
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r1 = r3.complementLowerBoundWindow
                boolean r1 = r1.hasUpperBound()
                if (r1 == 0) goto L29
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r1 = r3.complementLowerBoundWindow
                com.google.common.collect.BoundType r1 = r1.upperBoundType()
                com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.CLOSED
                if (r1 != r2) goto L29
                r1 = 1
                goto L2a
            L29:
                r1 = 0
            L2a:
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r2 = r3.positiveRangesByUpperBound
                java.util.NavigableMap r0 = r2.headMap(r0, r1)
                java.util.NavigableMap r0 = r0.descendingMap()
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.PeekingIterator r0 = com.google.common.collect.Iterators.peekingIterator(r0)
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L6e
                java.lang.Object r1 = r0.peek()
                com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.upperBound
                com.google.common.collect.Cut$AboveAll r2 = com.google.common.collect.Cut.AboveAll.access$100()
                if (r1 != r2) goto L5d
                java.lang.Object r1 = r0.next()
                com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.lowerBound
                goto L93
            L5d:
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r1 = r3.positiveRangesByLowerBound
                java.lang.Object r2 = r0.peek()
                com.google.common.collect.Range r2 = (com.google.common.collect.Range) r2
                com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r2.upperBound
                java.lang.Object r1 = r1.higherKey(r2)
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                goto L93
            L6e:
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r1 = r3.complementLowerBoundWindow
                com.google.common.collect.Cut$BelowAll r2 = com.google.common.collect.Cut.BelowAll.access$000()
                boolean r1 = r1.contains(r2)
                if (r1 == 0) goto La3
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r1 = r3.positiveRangesByLowerBound
                com.google.common.collect.Cut$BelowAll r2 = com.google.common.collect.Cut.BelowAll.access$000()
                boolean r1 = r1.containsKey(r2)
                if (r1 == 0) goto L87
                goto La3
            L87:
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r1 = r3.positiveRangesByLowerBound
                com.google.common.collect.Cut$BelowAll r2 = com.google.common.collect.Cut.BelowAll.access$000()
                java.lang.Object r1 = r1.higherKey(r2)
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
            L93:
                com.google.common.collect.Cut$AboveAll r2 = com.google.common.collect.Cut.AboveAll.access$100()
                java.lang.Object r1 = com.google.common.base.MoreObjects.firstNonNull(r1, r2)
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                com.google.common.collect.TreeRangeSet$ComplementRangesByLowerBound$2 r2 = new com.google.common.collect.TreeRangeSet$ComplementRangesByLowerBound$2
                r2.<init>(r3, r1, r0)
                return r2
            La3:
                com.google.common.collect.UnmodifiableListIterator<java.lang.Object> r0 = com.google.common.collect.Iterators.ArrayItr.EMPTY
                return r0
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> entryIterator() {
                r4 = this;
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r4.complementLowerBoundWindow
                boolean r0 = r0.hasLowerBound()
                if (r0 == 0) goto L28
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r4.positiveRangesByUpperBound
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r1 = r4.complementLowerBoundWindow
                java.lang.Comparable r1 = r1.lowerEndpoint()
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r2 = r4.complementLowerBoundWindow
                com.google.common.collect.BoundType r2 = r2.lowerBoundType()
                com.google.common.collect.BoundType r3 = com.google.common.collect.BoundType.CLOSED
                if (r2 != r3) goto L1e
                r2 = 1
                goto L1f
            L1e:
                r2 = 0
            L1f:
                java.util.NavigableMap r0 = r0.tailMap(r1, r2)
                java.util.Collection r0 = r0.values()
                goto L2e
            L28:
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r4.positiveRangesByUpperBound
                java.util.Collection r0 = r0.values()
            L2e:
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.PeekingIterator r0 = com.google.common.collect.Iterators.peekingIterator(r0)
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r1 = r4.complementLowerBoundWindow
                com.google.common.collect.Cut$BelowAll r2 = com.google.common.collect.Cut.BelowAll.access$000()
                boolean r1 = r1.contains(r2)
                if (r1 == 0) goto L5b
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L56
                java.lang.Object r1 = r0.peek()
                com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.lowerBound
                com.google.common.collect.Cut$BelowAll r2 = com.google.common.collect.Cut.BelowAll.access$000()
                if (r1 == r2) goto L5b
            L56:
                com.google.common.collect.Cut$BelowAll r1 = com.google.common.collect.Cut.BelowAll.access$000()
                goto L69
            L5b:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L6f
                java.lang.Object r1 = r0.next()
                com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.upperBound
            L69:
                com.google.common.collect.TreeRangeSet$ComplementRangesByLowerBound$1 r2 = new com.google.common.collect.TreeRangeSet$ComplementRangesByLowerBound$1
                r2.<init>(r4, r1, r0)
                return r2
            L6f:
                com.google.common.collect.UnmodifiableListIterator<java.lang.Object> r0 = com.google.common.collect.Iterators.ArrayItr.EMPTY
                return r0
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public com.google.common.collect.Range<C> get(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.collect.Cut
                r1 = 0
                if (r0 == 0) goto L25
                com.google.common.collect.Cut r4 = (com.google.common.collect.Cut) r4     // Catch: java.lang.ClassCastException -> L25
                r0 = 1
                java.util.NavigableMap r0 = r3.tailMap(r4, r0)     // Catch: java.lang.ClassCastException -> L25
                java.util.Map$Entry r0 = r0.firstEntry()     // Catch: java.lang.ClassCastException -> L25
                if (r0 == 0) goto L25
                java.lang.Object r2 = r0.getKey()     // Catch: java.lang.ClassCastException -> L25
                com.google.common.collect.Cut r2 = (com.google.common.collect.Cut) r2     // Catch: java.lang.ClassCastException -> L25
                boolean r4 = r2.equals(r4)     // Catch: java.lang.ClassCastException -> L25
                if (r4 == 0) goto L25
                java.lang.Object r4 = r0.getValue()     // Catch: java.lang.ClassCastException -> L25
                com.google.common.collect.Range r4 = (com.google.common.collect.Range) r4     // Catch: java.lang.ClassCastException -> L25
                return r4
            L25:
                return r1
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public /* bridge */ /* synthetic */ java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.Range r1 = r0.get(r1)
                return r1
        }

        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> headMap(com.google.common.collect.Cut<C> r1, boolean r2) {
                r0 = this;
                com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.forBoolean(r2)
                com.google.common.collect.Range r1 = com.google.common.collect.Range.upTo(r1, r2)
                java.util.NavigableMap r1 = r0.subMap(r1)
                return r1
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ java.util.NavigableMap headMap(java.lang.Object r1, boolean r2) {
                r0 = this;
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                java.util.NavigableMap r1 = r0.headMap(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
                r1 = this;
                java.util.Iterator r0 = r1.entryIterator()
                int r0 = com.google.common.collect.Iterators.size(r0)
                return r0
        }

        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Cut<C> r1, boolean r2, com.google.common.collect.Cut<C> r3, boolean r4) {
                r0 = this;
                com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.forBoolean(r2)
                com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.forBoolean(r4)
                com.google.common.collect.Range r1 = com.google.common.collect.Range.range(r1, r2, r3, r4)
                java.util.NavigableMap r1 = r0.subMap(r1)
                return r1
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ java.util.NavigableMap subMap(java.lang.Object r1, boolean r2, java.lang.Object r3, boolean r4) {
                r0 = this;
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                com.google.common.collect.Cut r3 = (com.google.common.collect.Cut) r3
                java.util.NavigableMap r1 = r0.subMap(r1, r2, r3, r4)
                return r1
        }

        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> tailMap(com.google.common.collect.Cut<C> r1, boolean r2) {
                r0 = this;
                com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.forBoolean(r2)
                com.google.common.collect.Range r1 = com.google.common.collect.Range.downTo(r1, r2)
                java.util.NavigableMap r1 = r0.subMap(r1)
                return r1
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ java.util.NavigableMap tailMap(java.lang.Object r1, boolean r2) {
                r0 = this;
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                java.util.NavigableMap r1 = r0.tailMap(r1, r2)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.VisibleForTesting
    public static final class RangesByUpperBound<C extends java.lang.Comparable<?>> extends com.google.common.collect.AbstractNavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> {
        private final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> rangesByLowerBound;
        private final com.google.common.collect.Range<com.google.common.collect.Cut<C>> upperBoundWindow;



        public RangesByUpperBound(java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> r1) {
                r0 = this;
                r0.<init>()
                r0.rangesByLowerBound = r1
                com.google.common.collect.Range r1 = com.google.common.collect.Range.all()
                r0.upperBoundWindow = r1
                return
        }

        private RangesByUpperBound(java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> r1, com.google.common.collect.Range<com.google.common.collect.Cut<C>> r2) {
                r0 = this;
                r0.<init>()
                r0.rangesByLowerBound = r1
                r0.upperBoundWindow = r2
                return
        }

        public static /* synthetic */ com.google.common.collect.Range access$000(com.google.common.collect.TreeRangeSet.RangesByUpperBound r0) {
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r0.upperBoundWindow
                return r0
        }

        private java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Range<com.google.common.collect.Cut<C>> r4) {
                r3 = this;
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r3.upperBoundWindow
                boolean r0 = r4.isConnected(r0)
                if (r0 == 0) goto L16
                com.google.common.collect.TreeRangeSet$RangesByUpperBound r0 = new com.google.common.collect.TreeRangeSet$RangesByUpperBound
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r1 = r3.rangesByLowerBound
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r2 = r3.upperBoundWindow
                com.google.common.collect.Range r4 = r4.intersection(r2)
                r0.<init>(r1, r4)
                return r0
            L16:
                com.google.common.collect.ImmutableSortedMap r4 = com.google.common.collect.ImmutableSortedMap.of()
                return r4
        }

        @Override // java.util.SortedMap
        public java.util.Comparator<? super com.google.common.collect.Cut<C>> comparator() {
                r1 = this;
                com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.Range r1 = r0.get(r1)
                if (r1 == 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public final java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> descendingEntryIterator() {
                r3 = this;
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r3.upperBoundWindow
                boolean r0 = r0.hasUpperBound()
                if (r0 == 0) goto L20
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r3.rangesByLowerBound
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r1 = r3.upperBoundWindow
                java.lang.Comparable r1 = r1.upperEndpoint()
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                r2 = 0
                java.util.NavigableMap r0 = r0.headMap(r1, r2)
                java.util.NavigableMap r0 = r0.descendingMap()
                java.util.Collection r0 = r0.values()
                goto L2a
            L20:
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r3.rangesByLowerBound
                java.util.NavigableMap r0 = r0.descendingMap()
                java.util.Collection r0 = r0.values()
            L2a:
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.PeekingIterator r0 = com.google.common.collect.Iterators.peekingIterator(r0)
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L4d
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r1 = r3.upperBoundWindow
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.upperBound
                java.lang.Object r2 = r0.peek()
                com.google.common.collect.Range r2 = (com.google.common.collect.Range) r2
                com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r2.upperBound
                boolean r1 = r1.isLessThan(r2)
                if (r1 == 0) goto L4d
                r0.next()
            L4d:
                com.google.common.collect.TreeRangeSet$RangesByUpperBound$2 r1 = new com.google.common.collect.TreeRangeSet$RangesByUpperBound$2
                r1.<init>(r3, r0)
                return r1
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> entryIterator() {
                r3 = this;
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r3.upperBoundWindow
                boolean r0 = r0.hasLowerBound()
                if (r0 != 0) goto L13
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r3.rangesByLowerBound
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
                goto L6c
            L13:
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r3.rangesByLowerBound
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r1 = r3.upperBoundWindow
                java.lang.Comparable r1 = r1.lowerEndpoint()
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                java.util.Map$Entry r0 = r0.lowerEntry(r1)
                if (r0 != 0) goto L2e
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r3.rangesByLowerBound
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
                goto L6c
            L2e:
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r1 = r3.upperBoundWindow
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.lowerBound
                java.lang.Object r2 = r0.getValue()
                com.google.common.collect.Range r2 = (com.google.common.collect.Range) r2
                com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r2.upperBound
                boolean r1 = r1.isLessThan(r2)
                r2 = 1
                if (r1 == 0) goto L56
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r1 = r3.rangesByLowerBound
                java.lang.Object r0 = r0.getKey()
                com.google.common.collect.Cut r0 = (com.google.common.collect.Cut) r0
                java.util.NavigableMap r0 = r1.tailMap(r0, r2)
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
                goto L6c
            L56:
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r3.rangesByLowerBound
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r1 = r3.upperBoundWindow
                java.lang.Comparable r1 = r1.lowerEndpoint()
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                java.util.NavigableMap r0 = r0.tailMap(r1, r2)
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            L6c:
                com.google.common.collect.TreeRangeSet$RangesByUpperBound$1 r1 = new com.google.common.collect.TreeRangeSet$RangesByUpperBound$1
                r1.<init>(r3, r0)
                return r1
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public com.google.common.collect.Range<C> get(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.collect.Cut
                r1 = 0
                if (r0 == 0) goto L2d
                com.google.common.collect.Cut r4 = (com.google.common.collect.Cut) r4     // Catch: java.lang.ClassCastException -> L2d
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r3.upperBoundWindow     // Catch: java.lang.ClassCastException -> L2d
                boolean r0 = r0.contains(r4)     // Catch: java.lang.ClassCastException -> L2d
                if (r0 != 0) goto L10
                return r1
            L10:
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r3.rangesByLowerBound     // Catch: java.lang.ClassCastException -> L2d
                java.util.Map$Entry r0 = r0.lowerEntry(r4)     // Catch: java.lang.ClassCastException -> L2d
                if (r0 == 0) goto L2d
                java.lang.Object r2 = r0.getValue()     // Catch: java.lang.ClassCastException -> L2d
                com.google.common.collect.Range r2 = (com.google.common.collect.Range) r2     // Catch: java.lang.ClassCastException -> L2d
                com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r2.upperBound     // Catch: java.lang.ClassCastException -> L2d
                boolean r4 = r2.equals(r4)     // Catch: java.lang.ClassCastException -> L2d
                if (r4 == 0) goto L2d
                java.lang.Object r4 = r0.getValue()     // Catch: java.lang.ClassCastException -> L2d
                com.google.common.collect.Range r4 = (com.google.common.collect.Range) r4     // Catch: java.lang.ClassCastException -> L2d
                return r4
            L2d:
                return r1
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public /* bridge */ /* synthetic */ java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.Range r1 = r0.get(r1)
                return r1
        }

        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> headMap(com.google.common.collect.Cut<C> r1, boolean r2) {
                r0 = this;
                com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.forBoolean(r2)
                com.google.common.collect.Range r1 = com.google.common.collect.Range.upTo(r1, r2)
                java.util.NavigableMap r1 = r0.subMap(r1)
                return r1
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ java.util.NavigableMap headMap(java.lang.Object r1, boolean r2) {
                r0 = this;
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                java.util.NavigableMap r1 = r0.headMap(r1, r2)
                return r1
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
                r2 = this;
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r2.upperBoundWindow
                com.google.common.collect.Range r1 = com.google.common.collect.Range.all()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L13
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r2.rangesByLowerBound
                boolean r0 = r0.isEmpty()
                goto L20
            L13:
                java.util.Iterator r0 = r2.entryIterator()
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L1f
                r0 = 1
                goto L20
            L1f:
                r0 = 0
            L20:
                return r0
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
                r2 = this;
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r2.upperBoundWindow
                com.google.common.collect.Range r1 = com.google.common.collect.Range.all()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L13
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r2.rangesByLowerBound
                int r0 = r0.size()
                return r0
            L13:
                java.util.Iterator r0 = r2.entryIterator()
                int r0 = com.google.common.collect.Iterators.size(r0)
                return r0
        }

        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Cut<C> r1, boolean r2, com.google.common.collect.Cut<C> r3, boolean r4) {
                r0 = this;
                com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.forBoolean(r2)
                com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.forBoolean(r4)
                com.google.common.collect.Range r1 = com.google.common.collect.Range.range(r1, r2, r3, r4)
                java.util.NavigableMap r1 = r0.subMap(r1)
                return r1
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ java.util.NavigableMap subMap(java.lang.Object r1, boolean r2, java.lang.Object r3, boolean r4) {
                r0 = this;
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                com.google.common.collect.Cut r3 = (com.google.common.collect.Cut) r3
                java.util.NavigableMap r1 = r0.subMap(r1, r2, r3, r4)
                return r1
        }

        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> tailMap(com.google.common.collect.Cut<C> r1, boolean r2) {
                r0 = this;
                com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.forBoolean(r2)
                com.google.common.collect.Range r1 = com.google.common.collect.Range.downTo(r1, r2)
                java.util.NavigableMap r1 = r0.subMap(r1)
                return r1
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ java.util.NavigableMap tailMap(java.lang.Object r1, boolean r2) {
                r0 = this;
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                java.util.NavigableMap r1 = r0.tailMap(r1, r2)
                return r1
        }
    }

    public final class SubRangeSet extends com.google.common.collect.TreeRangeSet<C> {
        private final com.google.common.collect.Range<C> restriction;
        public final /* synthetic */ com.google.common.collect.TreeRangeSet this$0;

        public SubRangeSet(com.google.common.collect.TreeRangeSet r4, com.google.common.collect.Range<C> r5) {
                r3 = this;
                r3.this$0 = r4
                com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound r0 = new com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound
                com.google.common.collect.Range r1 = com.google.common.collect.Range.all()
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r4 = r4.rangesByLowerBound
                r2 = 0
                r0.<init>(r1, r5, r4, r2)
                r3.<init>(r0, r2)
                r3.restriction = r5
                return
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void add(com.google.common.collect.Range<C> r4) {
                r3 = this;
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r3.restriction
                boolean r0 = r0.encloses(r4)
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r1 = r3.restriction
                java.lang.String r2 = "Cannot add range %s to subRangeSet(%s)"
                com.google.common.base.Preconditions.checkArgument(r0, r2, r4, r1)
                com.google.common.collect.TreeRangeSet r0 = r3.this$0
                r0.add(r4)
                return
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void clear() {
                r2 = this;
                com.google.common.collect.TreeRangeSet r0 = r2.this$0
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r1 = r2.restriction
                r0.remove(r1)
                return
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean contains(C r2) {
                r1 = this;
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r1.restriction
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto L12
                com.google.common.collect.TreeRangeSet r0 = r1.this$0
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean encloses(com.google.common.collect.Range<C> r3) {
                r2 = this;
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r2.restriction
                boolean r0 = r0.isEmpty()
                r1 = 0
                if (r0 != 0) goto L26
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r2.restriction
                boolean r0 = r0.encloses(r3)
                if (r0 == 0) goto L26
                com.google.common.collect.TreeRangeSet r0 = r2.this$0
                com.google.common.collect.Range r3 = com.google.common.collect.TreeRangeSet.access$600(r0, r3)
                if (r3 == 0) goto L26
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r2.restriction
                com.google.common.collect.Range r3 = r3.intersection(r0)
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L26
                r1 = 1
            L26:
                return r1
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        @javax.annotation.CheckForNull
        public com.google.common.collect.Range<C> rangeContaining(C r3) {
                r2 = this;
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r2.restriction
                boolean r0 = r0.contains(r3)
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                com.google.common.collect.TreeRangeSet r0 = r2.this$0
                com.google.common.collect.Range r3 = r0.rangeContaining(r3)
                if (r3 != 0) goto L13
                goto L19
            L13:
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r2.restriction
                com.google.common.collect.Range r1 = r3.intersection(r0)
            L19:
                return r1
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void remove(com.google.common.collect.Range<C> r3) {
                r2 = this;
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r2.restriction
                boolean r0 = r3.isConnected(r0)
                if (r0 == 0) goto L13
                com.google.common.collect.TreeRangeSet r0 = r2.this$0
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r1 = r2.restriction
                com.google.common.collect.Range r3 = r3.intersection(r1)
                r0.remove(r3)
            L13:
                return
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public com.google.common.collect.RangeSet<C> subRangeSet(com.google.common.collect.Range<C> r3) {
                r2 = this;
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r2.restriction
                boolean r0 = r3.encloses(r0)
                if (r0 == 0) goto L9
                return r2
            L9:
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r2.restriction
                boolean r0 = r3.isConnected(r0)
                if (r0 == 0) goto L1d
                com.google.common.collect.TreeRangeSet$SubRangeSet r0 = new com.google.common.collect.TreeRangeSet$SubRangeSet
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r1 = r2.restriction
                com.google.common.collect.Range r3 = r1.intersection(r3)
                r0.<init>(r2, r3)
                return r0
            L1d:
                com.google.common.collect.ImmutableRangeSet r3 = com.google.common.collect.ImmutableRangeSet.of()
                return r3
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SubRangeSetRangesByLowerBound<C extends java.lang.Comparable<?>> extends com.google.common.collect.AbstractNavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> {
        private final com.google.common.collect.Range<com.google.common.collect.Cut<C>> lowerBoundWindow;
        private final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> rangesByLowerBound;
        private final java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> rangesByUpperBound;
        private final com.google.common.collect.Range<C> restriction;



        private SubRangeSetRangesByLowerBound(com.google.common.collect.Range<com.google.common.collect.Cut<C>> r1, com.google.common.collect.Range<C> r2, java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> r3) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
                r0.lowerBoundWindow = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
                r0.restriction = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
                java.util.NavigableMap r1 = (java.util.NavigableMap) r1
                r0.rangesByLowerBound = r1
                com.google.common.collect.TreeRangeSet$RangesByUpperBound r1 = new com.google.common.collect.TreeRangeSet$RangesByUpperBound
                r1.<init>(r3)
                r0.rangesByUpperBound = r1
                return
        }

        public /* synthetic */ SubRangeSetRangesByLowerBound(com.google.common.collect.Range r1, com.google.common.collect.Range r2, java.util.NavigableMap r3, com.google.common.collect.TreeRangeSet.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static /* synthetic */ com.google.common.collect.Range access$300(com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound r0) {
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r0.restriction
                return r0
        }

        public static /* synthetic */ com.google.common.collect.Range access$400(com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound r0) {
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r0.lowerBoundWindow
                return r0
        }

        private java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Range<com.google.common.collect.Cut<C>> r4) {
                r3 = this;
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r3.lowerBoundWindow
                boolean r0 = r4.isConnected(r0)
                if (r0 != 0) goto Ld
                com.google.common.collect.ImmutableSortedMap r4 = com.google.common.collect.ImmutableSortedMap.of()
                return r4
            Ld:
                com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound r0 = new com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r1 = r3.lowerBoundWindow
                com.google.common.collect.Range r4 = r1.intersection(r4)
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r1 = r3.restriction
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r2 = r3.rangesByLowerBound
                r0.<init>(r4, r1, r2)
                return r0
        }

        @Override // java.util.SortedMap
        public java.util.Comparator<? super com.google.common.collect.Cut<C>> comparator() {
                r1 = this;
                com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.Range r1 = r0.get(r1)
                if (r1 == 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public final java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> descendingEntryIterator() {
                r4 = this;
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r4.restriction
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Lb
                com.google.common.collect.UnmodifiableListIterator<java.lang.Object> r0 = com.google.common.collect.Iterators.ArrayItr.EMPTY
                return r0
            Lb:
                com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r1 = r4.lowerBoundWindow
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.upperBound
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r2 = r4.restriction
                com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r2.upperBound
                com.google.common.collect.Cut$BelowValue r3 = new com.google.common.collect.Cut$BelowValue
                r3.<init>(r2)
                java.lang.Object r0 = r0.min(r1, r3)
                com.google.common.collect.Cut r0 = (com.google.common.collect.Cut) r0
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r1 = r4.rangesByLowerBound
                java.lang.Comparable r2 = r0.endpoint()
                com.google.common.collect.Cut r2 = (com.google.common.collect.Cut) r2
                com.google.common.collect.BoundType r0 = r0.typeAsUpperBound()
                com.google.common.collect.BoundType r3 = com.google.common.collect.BoundType.CLOSED
                if (r0 != r3) goto L34
                r0 = 1
                goto L35
            L34:
                r0 = 0
            L35:
                java.util.NavigableMap r0 = r1.headMap(r2, r0)
                java.util.NavigableMap r0 = r0.descendingMap()
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound$2 r1 = new com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound$2
                r1.<init>(r4, r0)
                return r1
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final java.util.Iterator<java.util.Map.Entry<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>>> entryIterator() {
                r5 = this;
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r5.restriction
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Lb
                com.google.common.collect.UnmodifiableListIterator<java.lang.Object> r0 = com.google.common.collect.Iterators.ArrayItr.EMPTY
                return r0
            Lb:
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r5.lowerBoundWindow
                com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.upperBound
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r1 = r5.restriction
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.lowerBound
                boolean r0 = r0.isLessThan(r1)
                if (r0 == 0) goto L1c
                com.google.common.collect.UnmodifiableListIterator<java.lang.Object> r0 = com.google.common.collect.Iterators.ArrayItr.EMPTY
                return r0
            L1c:
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r5.lowerBoundWindow
                com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.lowerBound
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r1 = r5.restriction
                com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.lowerBound
                boolean r0 = r0.isLessThan(r1)
                r1 = 0
                if (r0 == 0) goto L3e
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r5.rangesByUpperBound
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r2 = r5.restriction
                com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r2.lowerBound
                java.util.NavigableMap r0 = r0.tailMap(r2, r1)
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
                goto L61
            L3e:
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r5.rangesByLowerBound
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r2 = r5.lowerBoundWindow
                com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r2.lowerBound
                java.lang.Comparable r2 = r2.endpoint()
                com.google.common.collect.Cut r2 = (com.google.common.collect.Cut) r2
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r3 = r5.lowerBoundWindow
                com.google.common.collect.BoundType r3 = r3.lowerBoundType()
                com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.CLOSED
                if (r3 != r4) goto L55
                r1 = 1
            L55:
                java.util.NavigableMap r0 = r0.tailMap(r2, r1)
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            L61:
                com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r2 = r5.lowerBoundWindow
                com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r2.upperBound
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r3 = r5.restriction
                com.google.common.collect.Cut<C extends java.lang.Comparable> r3 = r3.upperBound
                com.google.common.collect.Cut$BelowValue r4 = new com.google.common.collect.Cut$BelowValue
                r4.<init>(r3)
                java.lang.Object r1 = r1.min(r2, r4)
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound$1 r2 = new com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound$1
                r2.<init>(r5, r0, r1)
                return r2
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public com.google.common.collect.Range<C> get(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.collect.Cut
                r1 = 0
                if (r0 == 0) goto L64
                com.google.common.collect.Cut r4 = (com.google.common.collect.Cut) r4     // Catch: java.lang.ClassCastException -> L64
                com.google.common.collect.Range<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>> r0 = r3.lowerBoundWindow     // Catch: java.lang.ClassCastException -> L64
                boolean r0 = r0.contains(r4)     // Catch: java.lang.ClassCastException -> L64
                if (r0 == 0) goto L64
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r3.restriction     // Catch: java.lang.ClassCastException -> L64
                com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.lowerBound     // Catch: java.lang.ClassCastException -> L64
                int r0 = r4.compareTo(r0)     // Catch: java.lang.ClassCastException -> L64
                if (r0 < 0) goto L64
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r3.restriction     // Catch: java.lang.ClassCastException -> L64
                com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.upperBound     // Catch: java.lang.ClassCastException -> L64
                int r0 = r4.compareTo(r0)     // Catch: java.lang.ClassCastException -> L64
                if (r0 < 0) goto L24
                goto L64
            L24:
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r3.restriction     // Catch: java.lang.ClassCastException -> L64
                com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.lowerBound     // Catch: java.lang.ClassCastException -> L64
                boolean r0 = r4.equals(r0)     // Catch: java.lang.ClassCastException -> L64
                if (r0 == 0) goto L53
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r3.rangesByLowerBound     // Catch: java.lang.ClassCastException -> L64
                java.util.Map$Entry r4 = r0.floorEntry(r4)     // Catch: java.lang.ClassCastException -> L64
                if (r4 != 0) goto L38
                r4 = r1
                goto L3c
            L38:
                java.lang.Object r4 = r4.getValue()     // Catch: java.lang.ClassCastException -> L64
            L3c:
                com.google.common.collect.Range r4 = (com.google.common.collect.Range) r4     // Catch: java.lang.ClassCastException -> L64
                if (r4 == 0) goto L64
                com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r4.upperBound     // Catch: java.lang.ClassCastException -> L64
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r2 = r3.restriction     // Catch: java.lang.ClassCastException -> L64
                com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r2.lowerBound     // Catch: java.lang.ClassCastException -> L64
                int r0 = r0.compareTo(r2)     // Catch: java.lang.ClassCastException -> L64
                if (r0 <= 0) goto L64
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r3.restriction     // Catch: java.lang.ClassCastException -> L64
                com.google.common.collect.Range r4 = r4.intersection(r0)     // Catch: java.lang.ClassCastException -> L64
                return r4
            L53:
                java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r3.rangesByLowerBound     // Catch: java.lang.ClassCastException -> L64
                java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.ClassCastException -> L64
                com.google.common.collect.Range r4 = (com.google.common.collect.Range) r4     // Catch: java.lang.ClassCastException -> L64
                if (r4 == 0) goto L64
                com.google.common.collect.Range<C extends java.lang.Comparable<?>> r0 = r3.restriction     // Catch: java.lang.ClassCastException -> L64
                com.google.common.collect.Range r4 = r4.intersection(r0)     // Catch: java.lang.ClassCastException -> L64
                return r4
            L64:
                return r1
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public /* bridge */ /* synthetic */ java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.Range r1 = r0.get(r1)
                return r1
        }

        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> headMap(com.google.common.collect.Cut<C> r1, boolean r2) {
                r0 = this;
                com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.forBoolean(r2)
                com.google.common.collect.Range r1 = com.google.common.collect.Range.upTo(r1, r2)
                java.util.NavigableMap r1 = r0.subMap(r1)
                return r1
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ java.util.NavigableMap headMap(java.lang.Object r1, boolean r2) {
                r0 = this;
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                java.util.NavigableMap r1 = r0.headMap(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
                r1 = this;
                java.util.Iterator r0 = r1.entryIterator()
                int r0 = com.google.common.collect.Iterators.size(r0)
                return r0
        }

        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> subMap(com.google.common.collect.Cut<C> r1, boolean r2, com.google.common.collect.Cut<C> r3, boolean r4) {
                r0 = this;
                com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.forBoolean(r2)
                com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.forBoolean(r4)
                com.google.common.collect.Range r1 = com.google.common.collect.Range.range(r1, r2, r3, r4)
                java.util.NavigableMap r1 = r0.subMap(r1)
                return r1
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ java.util.NavigableMap subMap(java.lang.Object r1, boolean r2, java.lang.Object r3, boolean r4) {
                r0 = this;
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                com.google.common.collect.Cut r3 = (com.google.common.collect.Cut) r3
                java.util.NavigableMap r1 = r0.subMap(r1, r2, r3, r4)
                return r1
        }

        public java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> tailMap(com.google.common.collect.Cut<C> r1, boolean r2) {
                r0 = this;
                com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.forBoolean(r2)
                com.google.common.collect.Range r1 = com.google.common.collect.Range.downTo(r1, r2)
                java.util.NavigableMap r1 = r0.subMap(r1)
                return r1
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ java.util.NavigableMap tailMap(java.lang.Object r1, boolean r2) {
                r0 = this;
                com.google.common.collect.Cut r1 = (com.google.common.collect.Cut) r1
                java.util.NavigableMap r1 = r0.tailMap(r1, r2)
                return r1
        }
    }

    private TreeRangeSet(java.util.NavigableMap<com.google.common.collect.Cut<C>, com.google.common.collect.Range<C>> r1) {
            r0 = this;
            r0.<init>()
            r0.rangesByLowerBound = r1
            return
    }

    public /* synthetic */ TreeRangeSet(java.util.NavigableMap r1, com.google.common.collect.TreeRangeSet.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ com.google.common.collect.Range access$600(com.google.common.collect.TreeRangeSet r0, com.google.common.collect.Range r1) {
            com.google.common.collect.Range r0 = r0.rangeEnclosing(r1)
            return r0
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.TreeRangeSet<C> create() {
            com.google.common.collect.TreeRangeSet r0 = new com.google.common.collect.TreeRangeSet
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            r0.<init>(r1)
            return r0
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.TreeRangeSet<C> create(com.google.common.collect.RangeSet<C> r1) {
            com.google.common.collect.TreeRangeSet r0 = create()
            r0.addAll(r1)
            return r0
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.TreeRangeSet<C> create(java.lang.Iterable<com.google.common.collect.Range<C>> r1) {
            com.google.common.collect.TreeRangeSet r0 = create()
            r0.addAll(r1)
            return r0
    }

    @javax.annotation.CheckForNull
    private com.google.common.collect.Range<C> rangeEnclosing(com.google.common.collect.Range<C> r3) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r2.rangesByLowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r3.lowerBound
            java.util.Map$Entry r0 = r0.floorEntry(r1)
            if (r0 == 0) goto L20
            java.lang.Object r1 = r0.getValue()
            com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
            boolean r3 = r1.encloses(r3)
            if (r3 == 0) goto L20
            java.lang.Object r3 = r0.getValue()
            com.google.common.collect.Range r3 = (com.google.common.collect.Range) r3
            goto L21
        L20:
            r3 = 0
        L21:
            return r3
    }

    private void replaceRangeWithSameLowerBound(com.google.common.collect.Range<C> r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Le
            java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r2.rangesByLowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r3 = r3.lowerBound
            r0.remove(r3)
            goto L15
        Le:
            java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r2.rangesByLowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r3.lowerBound
            r0.put(r1, r3)
        L15:
            return
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public void add(com.google.common.collect.Range<C> r4) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto La
            return
        La:
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r4.lowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r4 = r4.upperBound
            java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r1 = r3.rangesByLowerBound
            java.util.Map$Entry r1 = r1.lowerEntry(r0)
            if (r1 == 0) goto L30
            java.lang.Object r1 = r1.getValue()
            com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r1.upperBound
            int r2 = r2.compareTo(r0)
            if (r2 < 0) goto L30
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r1.upperBound
            int r0 = r0.compareTo(r4)
            if (r0 < 0) goto L2e
            com.google.common.collect.Cut<C extends java.lang.Comparable> r4 = r1.upperBound
        L2e:
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r1.lowerBound
        L30:
            java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r1 = r3.rangesByLowerBound
            java.util.Map$Entry r1 = r1.floorEntry(r4)
            if (r1 == 0) goto L48
            java.lang.Object r1 = r1.getValue()
            com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r1.upperBound
            int r2 = r2.compareTo(r4)
            if (r2 < 0) goto L48
            com.google.common.collect.Cut<C extends java.lang.Comparable> r4 = r1.upperBound
        L48:
            java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r1 = r3.rangesByLowerBound
            java.util.SortedMap r1 = r1.subMap(r0, r4)
            r1.clear()
            com.google.common.collect.Range r4 = com.google.common.collect.Range.create(r0, r4)
            r3.replaceRangeWithSameLowerBound(r4)
            return
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(com.google.common.collect.RangeSet r1) {
            r0 = this;
            super.addAll(r1)
            return
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(java.lang.Iterable r1) {
            r0 = this;
            super.addAll(r1)
            return
    }

    @Override // com.google.common.collect.RangeSet
    public java.util.Set<com.google.common.collect.Range<C>> asDescendingSetOfRanges() {
            r2 = this;
            java.util.Set<com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r2.asDescendingSetOfRanges
            if (r0 != 0) goto L15
            com.google.common.collect.TreeRangeSet$AsRanges r0 = new com.google.common.collect.TreeRangeSet$AsRanges
            java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r1 = r2.rangesByLowerBound
            java.util.NavigableMap r1 = r1.descendingMap()
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            r2.asDescendingSetOfRanges = r0
        L15:
            return r0
    }

    @Override // com.google.common.collect.RangeSet
    public java.util.Set<com.google.common.collect.Range<C>> asRanges() {
            r2 = this;
            java.util.Set<com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r2.asRanges
            if (r0 != 0) goto L11
            com.google.common.collect.TreeRangeSet$AsRanges r0 = new com.google.common.collect.TreeRangeSet$AsRanges
            java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r1 = r2.rangesByLowerBound
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            r2.asRanges = r0
        L11:
            return r0
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void clear() {
            r0 = this;
            super.clear()
            return
    }

    @Override // com.google.common.collect.RangeSet
    public com.google.common.collect.RangeSet<C> complement() {
            r1 = this;
            com.google.common.collect.RangeSet<C extends java.lang.Comparable<?>> r0 = r1.complement
            if (r0 != 0) goto Lb
            com.google.common.collect.TreeRangeSet$Complement r0 = new com.google.common.collect.TreeRangeSet$Complement
            r0.<init>(r1)
            r1.complement = r0
        Lb:
            return r0
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean encloses(com.google.common.collect.Range<C> r3) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r2.rangesByLowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r3.lowerBound
            java.util.Map$Entry r0 = r0.floorEntry(r1)
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.getValue()
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            boolean r3 = r0.encloses(r3)
            if (r3 == 0) goto L1b
            r3 = 1
            goto L1c
        L1b:
            r3 = 0
        L1c:
            return r3
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

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean intersects(com.google.common.collect.Range<C> r4) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r3.rangesByLowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r4.lowerBound
            java.util.Map$Entry r0 = r0.ceilingEntry(r1)
            r1 = 1
            if (r0 == 0) goto L2b
            java.lang.Object r2 = r0.getValue()
            com.google.common.collect.Range r2 = (com.google.common.collect.Range) r2
            boolean r2 = r2.isConnected(r4)
            if (r2 == 0) goto L2b
            java.lang.Object r0 = r0.getValue()
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            com.google.common.collect.Range r0 = r0.intersection(r4)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2b
            return r1
        L2b:
            java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r3.rangesByLowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r4.lowerBound
            java.util.Map$Entry r0 = r0.lowerEntry(r2)
            if (r0 == 0) goto L52
            java.lang.Object r2 = r0.getValue()
            com.google.common.collect.Range r2 = (com.google.common.collect.Range) r2
            boolean r2 = r2.isConnected(r4)
            if (r2 == 0) goto L52
            java.lang.Object r0 = r0.getValue()
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            com.google.common.collect.Range r4 = r0.intersection(r4)
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L52
            goto L53
        L52:
            r1 = 0
        L53:
            return r1
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean isEmpty() {
            r1 = this;
            boolean r0 = super.isEmpty()
            return r0
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @javax.annotation.CheckForNull
    public com.google.common.collect.Range<C> rangeContaining(C r3) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r2.rangesByLowerBound
            com.google.common.collect.Cut$BelowValue r1 = new com.google.common.collect.Cut$BelowValue
            r1.<init>(r3)
            java.util.Map$Entry r0 = r0.floorEntry(r1)
            if (r0 == 0) goto L23
            java.lang.Object r1 = r0.getValue()
            com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L23
            java.lang.Object r3 = r0.getValue()
            com.google.common.collect.Range r3 = (com.google.common.collect.Range) r3
            return r3
        L23:
            r3 = 0
            return r3
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public void remove(com.google.common.collect.Range<C> r4) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto La
            return
        La:
            java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r3.rangesByLowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r4.lowerBound
            java.util.Map$Entry r0 = r0.lowerEntry(r1)
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r0.getValue()
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r0.upperBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r4.lowerBound
            int r1 = r1.compareTo(r2)
            if (r1 < 0) goto L4a
            boolean r1 = r4.hasUpperBound()
            if (r1 == 0) goto L3f
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r0.upperBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r4.upperBound
            int r1 = r1.compareTo(r2)
            if (r1 < 0) goto L3f
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r4.upperBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r0.upperBound
            com.google.common.collect.Range r1 = com.google.common.collect.Range.create(r1, r2)
            r3.replaceRangeWithSameLowerBound(r1)
        L3f:
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.lowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r4.lowerBound
            com.google.common.collect.Range r0 = com.google.common.collect.Range.create(r0, r1)
            r3.replaceRangeWithSameLowerBound(r0)
        L4a:
            java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r3.rangesByLowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r4.upperBound
            java.util.Map$Entry r0 = r0.floorEntry(r1)
            if (r0 == 0) goto L75
            java.lang.Object r0 = r0.getValue()
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            boolean r1 = r4.hasUpperBound()
            if (r1 == 0) goto L75
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r0.upperBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r4.upperBound
            int r1 = r1.compareTo(r2)
            if (r1 < 0) goto L75
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r4.upperBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.upperBound
            com.google.common.collect.Range r0 = com.google.common.collect.Range.create(r1, r0)
            r3.replaceRangeWithSameLowerBound(r0)
        L75:
            java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r3.rangesByLowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r4.lowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r4 = r4.upperBound
            java.util.SortedMap r4 = r0.subMap(r1, r4)
            r4.clear()
            return
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(com.google.common.collect.RangeSet r1) {
            r0 = this;
            super.removeAll(r1)
            return
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(java.lang.Iterable r1) {
            r0 = this;
            super.removeAll(r1)
            return
    }

    @Override // com.google.common.collect.RangeSet
    public com.google.common.collect.Range<C> span() {
            r2 = this;
            java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r0 = r2.rangesByLowerBound
            java.util.Map$Entry r0 = r0.firstEntry()
            java.util.NavigableMap<com.google.common.collect.Cut<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r1 = r2.rangesByLowerBound
            java.util.Map$Entry r1 = r1.lastEntry()
            if (r0 == 0) goto L25
            if (r1 == 0) goto L25
            java.lang.Object r0 = r0.getValue()
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.lowerBound
            java.lang.Object r1 = r1.getValue()
            com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.upperBound
            com.google.common.collect.Range r0 = com.google.common.collect.Range.create(r0, r1)
            return r0
        L25:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.RangeSet
    public com.google.common.collect.RangeSet<C> subRangeSet(com.google.common.collect.Range<C> r2) {
            r1 = this;
            com.google.common.collect.Range r0 = com.google.common.collect.Range.all()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lc
            r0 = r1
            goto L11
        Lc:
            com.google.common.collect.TreeRangeSet$SubRangeSet r0 = new com.google.common.collect.TreeRangeSet$SubRangeSet
            r0.<init>(r1, r2)
        L11:
            return r0
    }
}
