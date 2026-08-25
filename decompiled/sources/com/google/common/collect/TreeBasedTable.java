package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public class TreeBasedTable<R, C, V> extends com.google.common.collect.StandardRowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;
    private final java.util.Comparator<? super C> columnComparator;



    /* JADX INFO: loaded from: classes.dex */
    public static class Factory<C, V> implements com.google.common.base.Supplier<java.util.TreeMap<C, V>>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final java.util.Comparator<? super C> comparator;

        public Factory(java.util.Comparator<? super C> r1) {
                r0 = this;
                r0.<init>()
                r0.comparator = r1
                return
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ java.lang.Object get() {
                r1 = this;
                java.util.TreeMap r0 = r1.get()
                return r0
        }

        @Override // com.google.common.base.Supplier
        public java.util.TreeMap<C, V> get() {
                r2 = this;
                java.util.TreeMap r0 = new java.util.TreeMap
                java.util.Comparator<? super C> r1 = r2.comparator
                r0.<init>(r1)
                return r0
        }
    }

    public class TreeRow extends com.google.common.collect.StandardTable<R, C, V>.Row implements java.util.SortedMap<C, V> {

        @javax.annotation.CheckForNull
        public final C lowerBound;
        public final /* synthetic */ com.google.common.collect.TreeBasedTable this$0;

        @javax.annotation.CheckForNull
        public final C upperBound;

        @javax.annotation.CheckForNull
        public transient java.util.SortedMap<C, V> wholeRow;

        public TreeRow(com.google.common.collect.TreeBasedTable r1, @javax.annotation.CheckForNull R r2, @javax.annotation.CheckForNull C r3, C r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                r0.lowerBound = r3
                r0.upperBound = r4
                if (r3 == 0) goto L16
                if (r4 == 0) goto L16
                int r1 = r0.compare(r3, r4)
                if (r1 > 0) goto L14
                goto L16
            L14:
                r1 = 0
                goto L17
            L16:
                r1 = 1
            L17:
                com.google.common.base.Preconditions.checkArgument(r1)
                return
        }

        @Override // java.util.SortedMap
        public java.util.Comparator<? super C> comparator() {
                r1 = this;
                com.google.common.collect.TreeBasedTable r0 = r1.this$0
                java.util.Comparator r0 = r0.columnComparator()
                return r0
        }

        public final int compare(java.lang.Object r2, java.lang.Object r3) {
                r1 = this;
                java.util.Comparator r0 = r1.comparator()
                int r2 = r0.compare(r2, r3)
                return r2
        }

        @Override // com.google.common.collect.StandardTable.Row
        @javax.annotation.CheckForNull
        public final java.util.Map computeBackingRowMap() {
                r2 = this;
                r2.updateWholeRowField()
                java.util.SortedMap<C, V> r0 = r2.wholeRow
                if (r0 == 0) goto L18
                C r1 = r2.lowerBound
                if (r1 == 0) goto Lf
                java.util.SortedMap r0 = r0.tailMap(r1)
            Lf:
                C r1 = r2.upperBound
                if (r1 == 0) goto L19
                java.util.SortedMap r0 = r0.headMap(r1)
                goto L19
            L18:
                r0 = 0
            L19:
                return r0
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r1.rangeContains(r2)
                if (r0 == 0) goto Le
                boolean r2 = super.containsKey(r2)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }

        @Override // java.util.SortedMap
        public C firstKey() {
                r1 = this;
                r1.updateBackingRowMapField()
                java.util.Map<C, V> r0 = r1.backingRowMap
                if (r0 == 0) goto Le
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                java.lang.Object r0 = r0.firstKey()
                return r0
            Le:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<C, V> headMap(C r5) {
                r4 = this;
                java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r5)
                boolean r0 = r4.rangeContains(r0)
                com.google.common.base.Preconditions.checkArgument(r0)
                com.google.common.collect.TreeBasedTable$TreeRow r0 = new com.google.common.collect.TreeBasedTable$TreeRow
                com.google.common.collect.TreeBasedTable r1 = r4.this$0
                R r2 = r4.rowKey
                C r3 = r4.lowerBound
                r0.<init>(r1, r2, r3, r5)
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public /* bridge */ /* synthetic */ java.util.Set keySet() {
                r1 = this;
                java.util.SortedSet r0 = r1.keySet()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public java.util.SortedSet<C> keySet() {
                r1 = this;
                com.google.common.collect.Maps$SortedKeySet r0 = new com.google.common.collect.Maps$SortedKeySet
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.SortedMap
        public C lastKey() {
                r1 = this;
                r1.updateBackingRowMapField()
                java.util.Map<C, V> r0 = r1.backingRowMap
                if (r0 == 0) goto Le
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                java.lang.Object r0 = r0.lastKey()
                return r0
            Le:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.collect.StandardTable.Row
        public final void maintainEmptyInvariant() {
                r2 = this;
                r2.updateWholeRowField()
                java.util.SortedMap<C, V> r0 = r2.wholeRow
                if (r0 == 0) goto L1b
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L1b
                com.google.common.collect.TreeBasedTable r0 = r2.this$0
                java.util.Map<R, java.util.Map<C, V>> r0 = r0.backingMap
                R r1 = r2.rowKey
                r0.remove(r1)
                r0 = 0
                r2.wholeRow = r0
                r2.backingRowMap = r0
            L1b:
                return
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V put(C r2, V r3) {
                r1 = this;
                java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r2)
                boolean r0 = r1.rangeContains(r0)
                com.google.common.base.Preconditions.checkArgument(r0)
                java.lang.Object r2 = super.put(r2, r3)
                return r2
        }

        public final boolean rangeContains(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                if (r2 == 0) goto L18
                C r0 = r1.lowerBound
                if (r0 == 0) goto Lc
                int r0 = r1.compare(r0, r2)
                if (r0 > 0) goto L18
            Lc:
                C r0 = r1.upperBound
                if (r0 == 0) goto L16
                int r2 = r1.compare(r0, r2)
                if (r2 <= 0) goto L18
            L16:
                r2 = 1
                goto L19
            L18:
                r2 = 0
            L19:
                return r2
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<C, V> subMap(C r4, C r5) {
                r3 = this;
                java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r4)
                boolean r0 = r3.rangeContains(r0)
                if (r0 == 0) goto L16
                java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r5)
                boolean r0 = r3.rangeContains(r0)
                if (r0 == 0) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                com.google.common.base.Preconditions.checkArgument(r0)
                com.google.common.collect.TreeBasedTable$TreeRow r0 = new com.google.common.collect.TreeBasedTable$TreeRow
                com.google.common.collect.TreeBasedTable r1 = r3.this$0
                R r2 = r3.rowKey
                r0.<init>(r1, r2, r4, r5)
                return r0
        }

        @Override // java.util.SortedMap
        public java.util.SortedMap<C, V> tailMap(C r5) {
                r4 = this;
                java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r5)
                boolean r0 = r4.rangeContains(r0)
                com.google.common.base.Preconditions.checkArgument(r0)
                com.google.common.collect.TreeBasedTable$TreeRow r0 = new com.google.common.collect.TreeBasedTable$TreeRow
                com.google.common.collect.TreeBasedTable r1 = r4.this$0
                R r2 = r4.rowKey
                C r3 = r4.upperBound
                r0.<init>(r1, r2, r5, r3)
                return r0
        }

        public final void updateWholeRowField() {
                r2 = this;
                java.util.SortedMap<C, V> r0 = r2.wholeRow
                if (r0 == 0) goto L16
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L24
                com.google.common.collect.TreeBasedTable r0 = r2.this$0
                java.util.Map<R, java.util.Map<C, V>> r0 = r0.backingMap
                R r1 = r2.rowKey
                boolean r0 = r0.containsKey(r1)
                if (r0 == 0) goto L24
            L16:
                com.google.common.collect.TreeBasedTable r0 = r2.this$0
                java.util.Map<R, java.util.Map<C, V>> r0 = r0.backingMap
                R r1 = r2.rowKey
                java.lang.Object r0 = r0.get(r1)
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                r2.wholeRow = r0
            L24:
                return
        }
    }

    public TreeBasedTable(java.util.Comparator<? super R> r2, java.util.Comparator<? super C> r3) {
            r1 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r2)
            com.google.common.collect.TreeBasedTable$Factory r2 = new com.google.common.collect.TreeBasedTable$Factory
            r2.<init>(r3)
            r1.<init>(r0, r2)
            r1.columnComparator = r3
            return
    }

    public static <R extends java.lang.Comparable, C extends java.lang.Comparable, V> com.google.common.collect.TreeBasedTable<R, C, V> create() {
            com.google.common.collect.TreeBasedTable r0 = new com.google.common.collect.TreeBasedTable
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.Ordering r2 = com.google.common.collect.Ordering.natural()
            r0.<init>(r1, r2)
            return r0
    }

    public static <R, C, V> com.google.common.collect.TreeBasedTable<R, C, V> create(com.google.common.collect.TreeBasedTable<R, C, ? extends V> r3) {
            com.google.common.collect.TreeBasedTable r0 = new com.google.common.collect.TreeBasedTable
            java.util.Comparator r1 = r3.rowComparator()
            java.util.Comparator r2 = r3.columnComparator()
            r0.<init>(r1, r2)
            r0.putAll(r3)
            return r0
    }

    public static <R, C, V> com.google.common.collect.TreeBasedTable<R, C, V> create(java.util.Comparator<? super R> r1, java.util.Comparator<? super C> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.TreeBasedTable r0 = new com.google.common.collect.TreeBasedTable
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Set cellSet() {
            r1 = this;
            java.util.Set r0 = super.cellSet()
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ void clear() {
            r0 = this;
            super.clear()
            return
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map column(java.lang.Object r1) {
            r0 = this;
            java.util.Map r1 = super.column(r1)
            return r1
    }

    @java.lang.Deprecated
    public java.util.Comparator<? super C> columnComparator() {
            r1 = this;
            java.util.Comparator<? super C> r0 = r1.columnComparator
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Set columnKeySet() {
            r1 = this;
            java.util.Set r0 = super.columnKeySet()
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map columnMap() {
            r1 = this;
            java.util.Map r0 = super.columnMap()
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean contains(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            boolean r1 = super.contains(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsColumn(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.containsColumn(r1)
            return r1
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsRow(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.containsRow(r1)
            return r1
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.containsValue(r1)
            return r1
    }

    @Override // com.google.common.collect.StandardTable
    public final java.util.Iterator<C> createColumnKeyIterator() {
            r3 = this;
            java.util.Comparator r0 = r3.columnComparator()
            java.util.Map<R, java.util.Map<C, V>> r1 = r3.backingMap
            java.util.Collection r1 = r1.values()
            com.google.common.collect.TreeBasedTable$1 r2 = new com.google.common.collect.TreeBasedTable$1
            r2.<init>()
            java.lang.Iterable r1 = com.google.common.collect.Iterables.transform(r1, r2)
            com.google.common.collect.UnmodifiableIterator r1 = com.google.common.collect.Iterators.mergeSorted(r1, r0)
            com.google.common.collect.TreeBasedTable$2 r2 = new com.google.common.collect.TreeBasedTable$2
            r2.<init>(r1, r0)
            return r2
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = super.get(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean isEmpty() {
            r1 = this;
            boolean r0 = super.isEmpty()
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            java.lang.Object r1 = super.put(r1, r2, r3)
            return r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ void putAll(com.google.common.collect.Table r1) {
            r0 = this;
            super.putAll(r1)
            return
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ java.lang.Object remove(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = super.remove(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map row(java.lang.Object r1) {
            r0 = this;
            java.util.SortedMap r1 = r0.row(r1)
            return r1
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public java.util.SortedMap<C, V> row(R r3) {
            r2 = this;
            com.google.common.collect.TreeBasedTable$TreeRow r0 = new com.google.common.collect.TreeBasedTable$TreeRow
            r1 = 0
            r0.<init>(r2, r3, r1, r1)
            return r0
    }

    @java.lang.Deprecated
    public java.util.Comparator<? super R> rowComparator() {
            r1 = this;
            java.util.SortedSet r0 = r1.rowKeySet()
            java.util.Comparator r0 = r0.comparator()
            java.util.Objects.requireNonNull(r0)
            java.util.Comparator r0 = (java.util.Comparator) r0
            return r0
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Set rowKeySet() {
            r1 = this;
            java.util.SortedSet r0 = r1.rowKeySet()
            return r0
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public java.util.SortedSet<R> rowKeySet() {
            r1 = this;
            java.util.SortedSet r0 = super.rowKeySet()
            return r0
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map rowMap() {
            r1 = this;
            java.util.SortedMap r0 = r1.rowMap()
            return r0
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.Table
    public java.util.SortedMap<R, java.util.Map<C, V>> rowMap() {
            r1 = this;
            java.util.SortedMap r0 = super.rowMap()
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int size() {
            r1 = this;
            int r0 = super.size()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            java.util.Collection r0 = super.values()
            return r0
    }
}
