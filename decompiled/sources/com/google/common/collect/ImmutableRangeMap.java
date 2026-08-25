package com.google.common.collect;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public class ImmutableRangeMap<K extends java.lang.Comparable<?>, V> implements com.google.common.collect.RangeMap<K, V>, java.io.Serializable {
    private static final com.google.common.collect.ImmutableRangeMap<java.lang.Comparable<?>, java.lang.Object> EMPTY = null;
    private static final long serialVersionUID = 0;
    private final transient com.google.common.collect.ImmutableList<com.google.common.collect.Range<K>> ranges;
    private final transient com.google.common.collect.ImmutableList<V> values;



    /* JADX INFO: loaded from: classes2.dex */
    @com.google.errorprone.annotations.DoNotMock
    public static final class Builder<K extends java.lang.Comparable<?>, V> {
        private final java.util.List<java.util.Map.Entry<com.google.common.collect.Range<K>, V>> entries;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList()
                r1.entries = r0
                return
        }

        public com.google.common.collect.ImmutableRangeMap<K, V> build() {
                r6 = this;
                java.util.List<java.util.Map$Entry<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V>> r0 = r6.entries
                int r1 = com.google.common.collect.Range.$r8$clinit
                com.google.common.collect.Ordering<com.google.common.collect.Range<?>> r1 = com.google.common.collect.Range.RangeLexOrdering.INSTANCE
                com.google.common.collect.Ordering r1 = r1.onKeys()
                java.util.Collections.sort(r0, r1)
                com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
                java.util.List<java.util.Map$Entry<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V>> r1 = r6.entries
                int r1 = r1.size()
                r0.<init>(r1)
                com.google.common.collect.ImmutableList$Builder r1 = new com.google.common.collect.ImmutableList$Builder
                java.util.List<java.util.Map$Entry<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V>> r2 = r6.entries
                int r2 = r2.size()
                r1.<init>(r2)
                r2 = 0
            L24:
                java.util.List<java.util.Map$Entry<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V>> r3 = r6.entries
                int r3 = r3.size()
                if (r2 >= r3) goto L93
                java.util.List<java.util.Map$Entry<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V>> r3 = r6.entries
                java.lang.Object r3 = r3.get(r2)
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r3 = r3.getKey()
                com.google.common.collect.Range r3 = (com.google.common.collect.Range) r3
                if (r2 <= 0) goto L7e
                java.util.List<java.util.Map$Entry<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V>> r4 = r6.entries
                int r5 = r2 + (-1)
                java.lang.Object r4 = r4.get(r5)
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r4 = r4.getKey()
                com.google.common.collect.Range r4 = (com.google.common.collect.Range) r4
                boolean r5 = r3.isConnected(r4)
                if (r5 == 0) goto L7e
                com.google.common.collect.Range r5 = r3.intersection(r4)
                boolean r5 = r5.isEmpty()
                if (r5 == 0) goto L5d
                goto L7e
            L5d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = java.lang.String.valueOf(r4)
                java.lang.String r2 = java.lang.String.valueOf(r3)
                int r3 = r1.length()
                int r3 = r3 + 47
                int r4 = r2.length()
                int r4 = r4 + r3
                java.lang.String r3 = "Overlapping ranges: range "
                java.lang.String r5 = " overlaps with entry "
                java.lang.String r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r3, r1, r5, r2)
                r0.<init>(r1)
                throw r0
            L7e:
                r0.add(r3)
                java.util.List<java.util.Map$Entry<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V>> r3 = r6.entries
                java.lang.Object r3 = r3.get(r2)
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r3 = r3.getValue()
                r1.add(r3)
                int r2 = r2 + 1
                goto L24
            L93:
                com.google.common.collect.ImmutableRangeMap r2 = new com.google.common.collect.ImmutableRangeMap
                com.google.common.collect.ImmutableList r0 = r0.build()
                com.google.common.collect.ImmutableList r1 = r1.build()
                r2.<init>(r0, r1)
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableRangeMap.Builder<K, V> put(com.google.common.collect.Range<K> r3, V r4) {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                com.google.common.base.Preconditions.checkNotNull(r4)
                boolean r0 = r3.isEmpty()
                r0 = r0 ^ 1
                java.lang.String r1 = "Range must not be empty, but was %s"
                com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
                java.util.List<java.util.Map$Entry<com.google.common.collect.Range<K extends java.lang.Comparable<?>>, V>> r0 = r2.entries
                java.util.Map$Entry r3 = com.google.common.collect.Maps.immutableEntry(r3, r4)
                r0.add(r3)
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableRangeMap.Builder<K, V> putAll(com.google.common.collect.RangeMap<K, ? extends V> r3) {
                r2 = this;
                java.util.Map r3 = r3.asMapOfRanges()
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            Lc:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L26
                java.lang.Object r0 = r3.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
                java.lang.Object r0 = r0.getValue()
                r2.put(r1, r0)
                goto Lc
            L26:
                return r2
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class SerializedForm<K extends java.lang.Comparable<?>, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>, V> mapOfRanges;
    }

    static {
            com.google.common.collect.ImmutableRangeMap r0 = new com.google.common.collect.ImmutableRangeMap
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
            r0.<init>(r1, r2)
            com.google.common.collect.ImmutableRangeMap.EMPTY = r0
            return
    }

    public ImmutableRangeMap(com.google.common.collect.ImmutableList<com.google.common.collect.Range<K>> r1, com.google.common.collect.ImmutableList<V> r2) {
            r0 = this;
            r0.<init>()
            r0.ranges = r1
            r0.values = r2
            return
    }

    public static /* synthetic */ com.google.common.collect.ImmutableList access$000(com.google.common.collect.ImmutableRangeMap r0) {
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r0.ranges
            return r0
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableRangeMap.Builder<K, V> builder() {
            com.google.common.collect.ImmutableRangeMap$Builder r0 = new com.google.common.collect.ImmutableRangeMap$Builder
            r0.<init>()
            return r0
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableRangeMap<K, V> copyOf(com.google.common.collect.RangeMap<K, ? extends V> r4) {
            boolean r0 = r4 instanceof com.google.common.collect.ImmutableRangeMap
            if (r0 == 0) goto L7
            com.google.common.collect.ImmutableRangeMap r4 = (com.google.common.collect.ImmutableRangeMap) r4
            return r4
        L7:
            java.util.Map r4 = r4.asMapOfRanges()
            com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
            int r1 = r4.size()
            r0.<init>(r1)
            com.google.common.collect.ImmutableList$Builder r1 = new com.google.common.collect.ImmutableList$Builder
            int r2 = r4.size()
            r1.<init>(r2)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L25:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.common.collect.Range r3 = (com.google.common.collect.Range) r3
            r0.add(r3)
            java.lang.Object r2 = r2.getValue()
            r1.add(r2)
            goto L25
        L42:
            com.google.common.collect.ImmutableRangeMap r4 = new com.google.common.collect.ImmutableRangeMap
            com.google.common.collect.ImmutableList r0 = r0.build()
            com.google.common.collect.ImmutableList r1 = r1.build()
            r4.<init>(r0, r1)
            return r4
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableRangeMap<K, V> of() {
            com.google.common.collect.ImmutableRangeMap<java.lang.Comparable<?>, java.lang.Object> r0 = com.google.common.collect.ImmutableRangeMap.EMPTY
            return r0
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableRangeMap<K, V> of(com.google.common.collect.Range<K> r1, V r2) {
            com.google.common.collect.ImmutableRangeMap r0 = new com.google.common.collect.ImmutableRangeMap
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r1)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>, V> asDescendingMapOfRanges() {
            r3 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r3.ranges
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of()
            return r0
        Ld:
            com.google.common.collect.RegularImmutableSortedSet r0 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r1 = r3.ranges
            com.google.common.collect.ImmutableList r1 = r1.reverse()
            int r2 = com.google.common.collect.Range.$r8$clinit
            com.google.common.collect.Ordering<com.google.common.collect.Range<?>> r2 = com.google.common.collect.Range.RangeLexOrdering.INSTANCE
            com.google.common.collect.Ordering r2 = r2.reverse()
            r0.<init>(r1, r2)
            com.google.common.collect.ImmutableSortedMap r1 = new com.google.common.collect.ImmutableSortedMap
            com.google.common.collect.ImmutableList<V> r2 = r3.values
            com.google.common.collect.ImmutableList r2 = r2.reverse()
            r1.<init>(r0, r2)
            return r1
    }

    @Override // com.google.common.collect.RangeMap
    public /* bridge */ /* synthetic */ java.util.Map asDescendingMapOfRanges() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.asDescendingMapOfRanges()
            return r0
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>, V> asMapOfRanges() {
            r3 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r3.ranges
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of()
            return r0
        Ld:
            com.google.common.collect.RegularImmutableSortedSet r0 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r1 = r3.ranges
            int r2 = com.google.common.collect.Range.$r8$clinit
            com.google.common.collect.Ordering<com.google.common.collect.Range<?>> r2 = com.google.common.collect.Range.RangeLexOrdering.INSTANCE
            r0.<init>(r1, r2)
            com.google.common.collect.ImmutableSortedMap r1 = new com.google.common.collect.ImmutableSortedMap
            com.google.common.collect.ImmutableList<V> r2 = r3.values
            r1.<init>(r0, r2)
            return r1
    }

    @Override // com.google.common.collect.RangeMap
    public /* bridge */ /* synthetic */ java.util.Map asMapOfRanges() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.asMapOfRanges()
            return r0
    }

    @Override // com.google.common.collect.RangeMap
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.RangeMap
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.common.collect.RangeMap
            if (r0 == 0) goto L13
            com.google.common.collect.RangeMap r2 = (com.google.common.collect.RangeMap) r2
            com.google.common.collect.ImmutableMap r0 = r1.asMapOfRanges()
            java.util.Map r2 = r2.asMapOfRanges()
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // com.google.common.collect.RangeMap
    @javax.annotation.CheckForNull
    public V get(K r6) {
            r5 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r5.ranges
            int r1 = com.google.common.collect.Range.$r8$clinit
            com.google.common.collect.Range$LowerBoundFn r1 = com.google.common.collect.Range.LowerBoundFn.INSTANCE
            com.google.common.collect.Cut$BelowValue r2 = new com.google.common.collect.Cut$BelowValue
            r2.<init>(r6)
            com.google.common.collect.SortedLists$KeyPresentBehavior r3 = com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT
            com.google.common.collect.SortedLists$KeyAbsentBehavior r4 = com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_LOWER
            int r0 = com.google.common.collect.SortedLists.binarySearch(r0, r1, r2, r3, r4)
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L18
            return r2
        L18:
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r1 = r5.ranges
            java.lang.Object r1 = r1.get(r0)
            com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
            boolean r6 = r1.contains(r6)
            if (r6 == 0) goto L2c
            com.google.common.collect.ImmutableList<V> r6 = r5.values
            java.lang.Object r2 = r6.get(r0)
        L2c:
            return r2
    }

    @Override // com.google.common.collect.RangeMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<com.google.common.collect.Range<K>, V> getEntry(K r6) {
            r5 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r5.ranges
            int r1 = com.google.common.collect.Range.$r8$clinit
            com.google.common.collect.Range$LowerBoundFn r1 = com.google.common.collect.Range.LowerBoundFn.INSTANCE
            com.google.common.collect.Cut$BelowValue r2 = new com.google.common.collect.Cut$BelowValue
            r2.<init>(r6)
            com.google.common.collect.SortedLists$KeyPresentBehavior r3 = com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT
            com.google.common.collect.SortedLists$KeyAbsentBehavior r4 = com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_LOWER
            int r0 = com.google.common.collect.SortedLists.binarySearch(r0, r1, r2, r3, r4)
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L18
            return r2
        L18:
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r1 = r5.ranges
            java.lang.Object r1 = r1.get(r0)
            com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
            boolean r6 = r1.contains(r6)
            if (r6 == 0) goto L30
            com.google.common.collect.ImmutableList<V> r6 = r5.values
            java.lang.Object r6 = r6.get(r0)
            java.util.Map$Entry r2 = com.google.common.collect.Maps.immutableEntry(r1, r6)
        L30:
            return r2
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.asMapOfRanges()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.common.collect.RangeMap
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final void put(com.google.common.collect.Range<K> r1, V r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.RangeMap
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final void putAll(com.google.common.collect.RangeMap<K, V> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.RangeMap
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final void putCoalescing(com.google.common.collect.Range<K> r1, V r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.RangeMap
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final void remove(com.google.common.collect.Range<K> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.Range<K> span() {
            r3 = this;
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r3.ranges
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L28
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r3.ranges
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r1 = r3.ranges
            int r2 = r1.size()
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.get(r2)
            com.google.common.collect.Range r1 = (com.google.common.collect.Range) r1
            com.google.common.collect.Cut<C extends java.lang.Comparable> r0 = r0.lowerBound
            com.google.common.collect.Cut<C extends java.lang.Comparable> r1 = r1.upperBound
            com.google.common.collect.Range r0 = com.google.common.collect.Range.create(r0, r1)
            return r0
        L28:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.RangeMap
    public com.google.common.collect.ImmutableRangeMap<K, V> subRangeMap(com.google.common.collect.Range<K> r7) {
            r6 = this;
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r7)
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            com.google.common.collect.ImmutableRangeMap r7 = of()
            return r7
        L11:
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r6.ranges
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5a
            com.google.common.collect.Range r0 = r6.span()
            boolean r0 = r7.encloses(r0)
            if (r0 == 0) goto L24
            goto L5a
        L24:
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r0 = r6.ranges
            int r1 = com.google.common.collect.Range.$r8$clinit
            com.google.common.collect.Range$UpperBoundFn r1 = com.google.common.collect.Range.UpperBoundFn.INSTANCE
            com.google.common.collect.Cut<C extends java.lang.Comparable> r2 = r7.lowerBound
            com.google.common.collect.SortedLists$KeyPresentBehavior r3 = com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_AFTER
            com.google.common.collect.SortedLists$KeyAbsentBehavior r4 = com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER
            int r0 = com.google.common.collect.SortedLists.binarySearch(r0, r1, r2, r3, r4)
            com.google.common.collect.ImmutableList<com.google.common.collect.Range<K extends java.lang.Comparable<?>>> r1 = r6.ranges
            com.google.common.collect.Range$LowerBoundFn r2 = com.google.common.collect.Range.LowerBoundFn.INSTANCE
            com.google.common.collect.Cut<C extends java.lang.Comparable> r3 = r7.upperBound
            com.google.common.collect.SortedLists$KeyPresentBehavior r5 = com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT
            int r1 = com.google.common.collect.SortedLists.binarySearch(r1, r2, r3, r5, r4)
            if (r0 < r1) goto L47
            com.google.common.collect.ImmutableRangeMap r7 = of()
            return r7
        L47:
            int r2 = r1 - r0
            com.google.common.collect.ImmutableRangeMap$1 r3 = new com.google.common.collect.ImmutableRangeMap$1
            r3.<init>(r6, r2, r0, r7)
            com.google.common.collect.ImmutableRangeMap$2 r2 = new com.google.common.collect.ImmutableRangeMap$2
            com.google.common.collect.ImmutableList<V> r4 = r6.values
            com.google.common.collect.ImmutableList r0 = r4.subList(r0, r1)
            r2.<init>(r3, r0, r7, r6)
            return r2
        L5a:
            return r6
    }

    @Override // com.google.common.collect.RangeMap
    public /* bridge */ /* synthetic */ com.google.common.collect.RangeMap subRangeMap(com.google.common.collect.Range r1) {
            r0 = this;
            com.google.common.collect.ImmutableRangeMap r1 = r0.subRangeMap(r1)
            return r1
    }

    @Override // com.google.common.collect.RangeMap
    public java.lang.String toString() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.asMapOfRanges()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
