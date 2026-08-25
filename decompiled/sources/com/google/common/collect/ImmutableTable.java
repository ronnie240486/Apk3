package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableTable<R, C, V> extends com.google.common.collect.AbstractTable<R, C, V> implements java.io.Serializable {

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.errorprone.annotations.DoNotMock
    public static final class Builder<R, C, V> {
        private final java.util.List<com.google.common.collect.Table.Cell<R, C, V>> cells;

        @javax.annotation.CheckForNull
        private java.util.Comparator<? super C> columnComparator;

        @javax.annotation.CheckForNull
        private java.util.Comparator<? super R> rowComparator;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList()
                r1.cells = r0
                return
        }

        public com.google.common.collect.ImmutableTable<R, C, V> build() {
                r1 = this;
                com.google.common.collect.ImmutableTable r0 = r1.buildOrThrow()
                return r0
        }

        public com.google.common.collect.ImmutableTable<R, C, V> buildOrThrow() {
                r4 = this;
                java.util.List<com.google.common.collect.Table$Cell<R, C, V>> r0 = r4.cells
                int r0 = r0.size()
                if (r0 == 0) goto L30
                r1 = 1
                if (r0 == r1) goto L16
                java.util.List<com.google.common.collect.Table$Cell<R, C, V>> r0 = r4.cells
                java.util.Comparator<? super R> r1 = r4.rowComparator
                java.util.Comparator<? super C> r2 = r4.columnComparator
                com.google.common.collect.RegularImmutableTable r0 = com.google.common.collect.RegularImmutableTable.forCells(r0, r1, r2)
                return r0
            L16:
                com.google.common.collect.SingletonImmutableTable r0 = new com.google.common.collect.SingletonImmutableTable
                java.util.List<com.google.common.collect.Table$Cell<R, C, V>> r1 = r4.cells
                java.lang.Object r1 = com.google.common.collect.Iterables.getOnlyElement(r1)
                com.google.common.collect.Table$Cell r1 = (com.google.common.collect.Table.Cell) r1
                java.lang.Object r2 = r1.getRowKey()
                java.lang.Object r3 = r1.getColumnKey()
                java.lang.Object r1 = r1.getValue()
                r0.<init>(r2, r3, r1)
                return r0
            L30:
                com.google.common.collect.ImmutableTable r0 = com.google.common.collect.ImmutableTable.of()
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableTable.Builder<R, C, V> orderColumnsBy(java.util.Comparator<? super C> r2) {
                r1 = this;
                java.lang.String r0 = "columnComparator"
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2, r0)
                java.util.Comparator r2 = (java.util.Comparator) r2
                r1.columnComparator = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableTable.Builder<R, C, V> orderRowsBy(java.util.Comparator<? super R> r2) {
                r1 = this;
                java.lang.String r0 = "rowComparator"
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2, r0)
                java.util.Comparator r2 = (java.util.Comparator) r2
                r1.rowComparator = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableTable.Builder<R, C, V> put(com.google.common.collect.Table.Cell<? extends R, ? extends C, ? extends V> r3) {
                r2 = this;
                boolean r0 = r3 instanceof com.google.common.collect.Tables.ImmutableCell
                if (r0 == 0) goto L27
                java.lang.Object r0 = r3.getRowKey()
                java.lang.String r1 = "row"
                com.google.common.base.Preconditions.checkNotNull(r0, r1)
                java.lang.Object r0 = r3.getColumnKey()
                java.lang.String r1 = "column"
                com.google.common.base.Preconditions.checkNotNull(r0, r1)
                java.lang.Object r0 = r3.getValue()
                java.lang.String r1 = "value"
                com.google.common.base.Preconditions.checkNotNull(r0, r1)
                java.util.List<com.google.common.collect.Table$Cell<R, C, V>> r0 = r2.cells
                r0.add(r3)
                goto L36
            L27:
                java.lang.Object r0 = r3.getRowKey()
                java.lang.Object r1 = r3.getColumnKey()
                java.lang.Object r3 = r3.getValue()
                r2.put(r0, r1, r3)
            L36:
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableTable.Builder<R, C, V> put(R r2, C r3, V r4) {
                r1 = this;
                java.util.List<com.google.common.collect.Table$Cell<R, C, V>> r0 = r1.cells
                com.google.common.collect.Table$Cell r2 = com.google.common.collect.ImmutableTable.cellOf(r2, r3, r4)
                r0.add(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableTable.Builder<R, C, V> putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> r2) {
                r1 = this;
                java.util.Set r2 = r2.cellSet()
                java.util.Iterator r2 = r2.iterator()
            L8:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L18
                java.lang.Object r0 = r2.next()
                com.google.common.collect.Table$Cell r0 = (com.google.common.collect.Table.Cell) r0
                r1.put(r0)
                goto L8
            L18:
                return r1
        }
    }

    public static final class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final int[] cellColumnIndices;
        private final int[] cellRowIndices;
        private final java.lang.Object[] cellValues;
        private final java.lang.Object[] columnKeys;
        private final java.lang.Object[] rowKeys;

        private SerializedForm(java.lang.Object[] r1, java.lang.Object[] r2, java.lang.Object[] r3, int[] r4, int[] r5) {
                r0 = this;
                r0.<init>()
                r0.rowKeys = r1
                r0.columnKeys = r2
                r0.cellValues = r3
                r0.cellRowIndices = r4
                r0.cellColumnIndices = r5
                return
        }
    }

    public ImmutableTable() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <R, C, V> com.google.common.collect.ImmutableTable.Builder<R, C, V> builder() {
            com.google.common.collect.ImmutableTable$Builder r0 = new com.google.common.collect.ImmutableTable$Builder
            r0.<init>()
            return r0
    }

    public static <R, C, V> com.google.common.collect.Table.Cell<R, C, V> cellOf(R r1, C r2, V r3) {
            java.lang.String r0 = "rowKey"
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "columnKey"
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "value"
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3, r0)
            com.google.common.collect.Table$Cell r1 = com.google.common.collect.Tables.immutableCell(r1, r2, r3)
            return r1
    }

    public static <R, C, V> com.google.common.collect.ImmutableTable<R, C, V> copyOf(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> r2) {
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableTable
            if (r0 == 0) goto L7
            com.google.common.collect.ImmutableTable r2 = (com.google.common.collect.ImmutableTable) r2
            return r2
        L7:
            java.util.Set r2 = r2.cellSet()
            com.google.common.collect.ImmutableTable$Builder r0 = builder()
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r2.next()
            com.google.common.collect.Table$Cell r1 = (com.google.common.collect.Table.Cell) r1
            r0.put(r1)
            goto L13
        L23:
            com.google.common.collect.ImmutableTable r2 = r0.build()
            return r2
    }

    public static <R, C, V> com.google.common.collect.ImmutableTable<R, C, V> of() {
            com.google.common.collect.ImmutableTable<java.lang.Object, java.lang.Object, java.lang.Object> r0 = com.google.common.collect.SparseImmutableTable.EMPTY
            return r0
    }

    public static <R, C, V> com.google.common.collect.ImmutableTable<R, C, V> of(R r1, C r2, V r3) {
            com.google.common.collect.SingletonImmutableTable r0 = new com.google.common.collect.SingletonImmutableTable
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.common.collect.AbstractTable
    public final java.util.Iterator cellIterator() {
            r2 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "should never be called"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
            r1 = this;
            java.util.Set r0 = super.cellSet()
            com.google.common.collect.ImmutableSet r0 = (com.google.common.collect.ImmutableSet) r0
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Set cellSet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.cellSet()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<R, V> column(C r2) {
            r1 = this;
            java.lang.String r0 = "columnKey"
            com.google.common.base.Preconditions.checkNotNull(r2, r0)
            com.google.common.collect.ImmutableMap r0 = r1.columnMap()
            java.lang.Object r2 = r0.get(r2)
            com.google.common.collect.ImmutableMap r2 = (com.google.common.collect.ImmutableMap) r2
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of()
            java.lang.Object r2 = com.google.common.base.MoreObjects.firstNonNull(r2, r0)
            com.google.common.collect.ImmutableMap r2 = (com.google.common.collect.ImmutableMap) r2
            return r2
    }

    @Override // com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map column(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableMap r1 = r0.column(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableSet<C> columnKeySet() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.columnMap()
            com.google.common.collect.ImmutableSet r0 = r0.keySet()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Set columnKeySet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.columnKeySet()
            return r0
    }

    @Override // com.google.common.collect.Table
    public abstract com.google.common.collect.ImmutableMap<C, java.util.Map<R, V>> columnMap();

    @Override // com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map columnMap() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.columnMap()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1, r2)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsColumn(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.containsColumn(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsRow(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.containsRow(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.values()
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // com.google.common.collect.AbstractTable
    public abstract com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> createCellSet();

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ java.util.Set createCellSet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.createCellSet()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable
    public abstract com.google.common.collect.ImmutableCollection<V> createValues();

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ java.util.Collection createValues() {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.createValues()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
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

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean isEmpty() {
            r1 = this;
            boolean r0 = super.isEmpty()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final V put(R r1, C r2, V r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final V remove(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<C, V> row(R r2) {
            r1 = this;
            java.lang.String r0 = "rowKey"
            com.google.common.base.Preconditions.checkNotNull(r2, r0)
            com.google.common.collect.ImmutableMap r0 = r1.rowMap()
            java.lang.Object r2 = r0.get(r2)
            com.google.common.collect.ImmutableMap r2 = (com.google.common.collect.ImmutableMap) r2
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of()
            java.lang.Object r2 = com.google.common.base.MoreObjects.firstNonNull(r2, r0)
            com.google.common.collect.ImmutableMap r2 = (com.google.common.collect.ImmutableMap) r2
            return r2
    }

    @Override // com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map row(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableMap r1 = r0.row(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableSet<R> rowKeySet() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.rowMap()
            com.google.common.collect.ImmutableSet r0 = r0.keySet()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Set rowKeySet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.rowKeySet()
            return r0
    }

    @Override // com.google.common.collect.Table
    public abstract com.google.common.collect.ImmutableMap<R, java.util.Map<C, V>> rowMap();

    @Override // com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map rowMap() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.rowMap()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableCollection<V> values() {
            r1 = this;
            java.util.Collection r0 = super.values()
            com.google.common.collect.ImmutableCollection r0 = (com.google.common.collect.ImmutableCollection) r0
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.values()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable
    public final java.util.Iterator<V> valuesIterator() {
            r2 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "should never be called"
            r0.<init>(r1)
            throw r0
    }
}
