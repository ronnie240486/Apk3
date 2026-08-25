package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable(containerOf = {"R", "C", "V"})
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class DenseImmutableTable<R, C, V> extends com.google.common.collect.RegularImmutableTable<R, C, V> {
    private final int[] cellColumnIndices;
    private final int[] cellRowIndices;
    private final int[] columnCounts;
    private final com.google.common.collect.ImmutableMap<C, java.lang.Integer> columnKeyToIndex;
    private final com.google.common.collect.ImmutableMap<C, com.google.common.collect.ImmutableMap<R, V>> columnMap;
    private final int[] rowCounts;
    private final com.google.common.collect.ImmutableMap<R, java.lang.Integer> rowKeyToIndex;
    private final com.google.common.collect.ImmutableMap<R, com.google.common.collect.ImmutableMap<C, V>> rowMap;
    private final V[][] values;

    /* JADX INFO: renamed from: com.google.common.collect.DenseImmutableTable$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public final class Column extends com.google.common.collect.DenseImmutableTable.ImmutableArrayMap<R, V> {
        private final int columnIndex;
        public final /* synthetic */ com.google.common.collect.DenseImmutableTable this$0;

        public Column(com.google.common.collect.DenseImmutableTable r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                int[] r1 = com.google.common.collect.DenseImmutableTable.access$500(r1)
                r1 = r1[r2]
                r0.<init>(r1)
                r0.columnIndex = r2
                return
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        @javax.annotation.CheckForNull
        public final V getValue(int r2) {
                r1 = this;
                com.google.common.collect.DenseImmutableTable r0 = r1.this$0
                java.lang.Object[][] r0 = com.google.common.collect.DenseImmutableTable.access$400(r0)
                r2 = r0[r2]
                int r0 = r1.columnIndex
                r2 = r2[r0]
                return r2
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean isPartialView() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final com.google.common.collect.ImmutableMap<R, java.lang.Integer> keyToIndex() {
                r1 = this;
                com.google.common.collect.DenseImmutableTable r0 = r1.this$0
                com.google.common.collect.ImmutableMap r0 = com.google.common.collect.DenseImmutableTable.access$600(r0)
                return r0
        }
    }

    public final class ColumnMap extends com.google.common.collect.DenseImmutableTable.ImmutableArrayMap<C, com.google.common.collect.ImmutableMap<R, V>> {
        public final /* synthetic */ com.google.common.collect.DenseImmutableTable this$0;

        private ColumnMap(com.google.common.collect.DenseImmutableTable r1) {
                r0 = this;
                r0.this$0 = r1
                int[] r1 = com.google.common.collect.DenseImmutableTable.access$500(r1)
                int r1 = r1.length
                r0.<init>(r1)
                return
        }

        public /* synthetic */ ColumnMap(com.google.common.collect.DenseImmutableTable r1, com.google.common.collect.DenseImmutableTable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final java.lang.Object getValue(int r3) {
                r2 = this;
                com.google.common.collect.DenseImmutableTable$Column r0 = new com.google.common.collect.DenseImmutableTable$Column
                com.google.common.collect.DenseImmutableTable r1 = r2.this$0
                r0.<init>(r1, r3)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean isPartialView() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final com.google.common.collect.ImmutableMap<C, java.lang.Integer> keyToIndex() {
                r1 = this;
                com.google.common.collect.DenseImmutableTable r0 = r1.this$0
                com.google.common.collect.ImmutableMap r0 = com.google.common.collect.DenseImmutableTable.access$300(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class ImmutableArrayMap<K, V> extends com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap<K, V> {
        private final int size;


        public ImmutableArrayMap(int r1) {
                r0 = this;
                r0.<init>()
                r0.size = r1
                return
        }

        private boolean isFull() {
                r2 = this;
                int r0 = r2.size
                com.google.common.collect.ImmutableMap r1 = r2.keyToIndex()
                int r1 = r1.size()
                if (r0 != r1) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public final com.google.common.collect.ImmutableSet<K> createKeySet() {
                r1 = this;
                boolean r0 = r1.isFull()
                if (r0 == 0) goto Lf
                com.google.common.collect.ImmutableMap r0 = r1.keyToIndex()
                com.google.common.collect.ImmutableSet r0 = r0.keySet()
                goto L14
            Lf:
                com.google.common.collect.ImmutableMapKeySet r0 = new com.google.common.collect.ImmutableMapKeySet
                r0.<init>(r1)
            L14:
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public final com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> entryIterator() {
                r1 = this;
                com.google.common.collect.DenseImmutableTable$ImmutableArrayMap$1 r0 = new com.google.common.collect.DenseImmutableTable$ImmutableArrayMap$1
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.ImmutableMap r0 = r1.keyToIndex()
                java.lang.Object r2 = r0.get(r2)
                java.lang.Integer r2 = (java.lang.Integer) r2
                if (r2 != 0) goto Le
                r2 = 0
                goto L16
            Le:
                int r2 = r2.intValue()
                java.lang.Object r2 = r1.getValue(r2)
            L16:
                return r2
        }

        @javax.annotation.CheckForNull
        public abstract V getValue(int r1);

        public abstract com.google.common.collect.ImmutableMap<K, java.lang.Integer> keyToIndex();

        @Override // java.util.Map
        public int size() {
                r1 = this;
                int r0 = r1.size
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public final class Row extends com.google.common.collect.DenseImmutableTable.ImmutableArrayMap<C, V> {
        private final int rowIndex;
        public final /* synthetic */ com.google.common.collect.DenseImmutableTable this$0;

        public Row(com.google.common.collect.DenseImmutableTable r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                int[] r1 = com.google.common.collect.DenseImmutableTable.access$200(r1)
                r1 = r1[r2]
                r0.<init>(r1)
                r0.rowIndex = r2
                return
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        @javax.annotation.CheckForNull
        public final V getValue(int r3) {
                r2 = this;
                com.google.common.collect.DenseImmutableTable r0 = r2.this$0
                java.lang.Object[][] r0 = com.google.common.collect.DenseImmutableTable.access$400(r0)
                int r1 = r2.rowIndex
                r0 = r0[r1]
                r3 = r0[r3]
                return r3
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean isPartialView() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final com.google.common.collect.ImmutableMap<C, java.lang.Integer> keyToIndex() {
                r1 = this;
                com.google.common.collect.DenseImmutableTable r0 = r1.this$0
                com.google.common.collect.ImmutableMap r0 = com.google.common.collect.DenseImmutableTable.access$300(r0)
                return r0
        }
    }

    public final class RowMap extends com.google.common.collect.DenseImmutableTable.ImmutableArrayMap<R, com.google.common.collect.ImmutableMap<C, V>> {
        public final /* synthetic */ com.google.common.collect.DenseImmutableTable this$0;

        private RowMap(com.google.common.collect.DenseImmutableTable r1) {
                r0 = this;
                r0.this$0 = r1
                int[] r1 = com.google.common.collect.DenseImmutableTable.access$200(r1)
                int r1 = r1.length
                r0.<init>(r1)
                return
        }

        public /* synthetic */ RowMap(com.google.common.collect.DenseImmutableTable r1, com.google.common.collect.DenseImmutableTable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final java.lang.Object getValue(int r3) {
                r2 = this;
                com.google.common.collect.DenseImmutableTable$Row r0 = new com.google.common.collect.DenseImmutableTable$Row
                com.google.common.collect.DenseImmutableTable r1 = r2.this$0
                r0.<init>(r1, r3)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean isPartialView() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final com.google.common.collect.ImmutableMap<R, java.lang.Integer> keyToIndex() {
                r1 = this;
                com.google.common.collect.DenseImmutableTable r0 = r1.this$0
                com.google.common.collect.ImmutableMap r0 = com.google.common.collect.DenseImmutableTable.access$600(r0)
                return r0
        }
    }

    public DenseImmutableTable(com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R, C, V>> r13, com.google.common.collect.ImmutableSet<R> r14, com.google.common.collect.ImmutableSet<C> r15) {
            r12 = this;
            r12.<init>()
            int r0 = r14.size()
            int r1 = r15.size()
            r2 = 2
            int[] r2 = new int[r2]
            r3 = 1
            r2[r3] = r1
            r1 = 0
            r2[r1] = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r2)
            java.lang.Object[][] r0 = (java.lang.Object[][]) r0
            r12.values = r0
            com.google.common.collect.ImmutableMap r14 = com.google.common.collect.Maps.indexMap(r14)
            r12.rowKeyToIndex = r14
            com.google.common.collect.ImmutableMap r15 = com.google.common.collect.Maps.indexMap(r15)
            r12.columnKeyToIndex = r15
            int r14 = r14.size()
            int[] r14 = new int[r14]
            r12.rowCounts = r14
            int r14 = r15.size()
            int[] r14 = new int[r14]
            r12.columnCounts = r14
            int r14 = r13.size()
            int[] r14 = new int[r14]
            int r15 = r13.size()
            int[] r15 = new int[r15]
            r0 = 0
        L47:
            int r2 = r13.size()
            if (r0 >= r2) goto Lac
            java.lang.Object r2 = r13.get(r0)
            com.google.common.collect.Table$Cell r2 = (com.google.common.collect.Table.Cell) r2
            java.lang.Object r6 = r2.getRowKey()
            java.lang.Object r7 = r2.getColumnKey()
            com.google.common.collect.ImmutableMap<R, java.lang.Integer> r4 = r12.rowKeyToIndex
            java.lang.Object r4 = r4.get(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.util.Objects.requireNonNull(r4)
            int r10 = r4.intValue()
            com.google.common.collect.ImmutableMap<C, java.lang.Integer> r4 = r12.columnKeyToIndex
            java.lang.Object r4 = r4.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.util.Objects.requireNonNull(r4)
            int r11 = r4.intValue()
            V[][] r4 = r12.values
            r4 = r4[r10]
            r9 = r4[r11]
            java.lang.Object r8 = r2.getValue()
            if (r9 != 0) goto L87
            r4 = 1
            goto L88
        L87:
            r4 = 0
        L88:
            java.lang.String r5 = "Duplicate key: (row=%s, column=%s), values: [%s, %s]."
            com.google.common.base.Preconditions.checkArgument(r4, r5, r6, r7, r8, r9)
            V[][] r4 = r12.values
            r4 = r4[r10]
            java.lang.Object r2 = r2.getValue()
            r4[r11] = r2
            int[] r2 = r12.rowCounts
            r4 = r2[r10]
            int r4 = r4 + r3
            r2[r10] = r4
            int[] r2 = r12.columnCounts
            r4 = r2[r11]
            int r4 = r4 + r3
            r2[r11] = r4
            r14[r0] = r10
            r15[r0] = r11
            int r0 = r0 + 1
            goto L47
        Lac:
            r12.cellRowIndices = r14
            r12.cellColumnIndices = r15
            com.google.common.collect.DenseImmutableTable$RowMap r13 = new com.google.common.collect.DenseImmutableTable$RowMap
            r14 = 0
            r13.<init>(r12, r14)
            r12.rowMap = r13
            com.google.common.collect.DenseImmutableTable$ColumnMap r13 = new com.google.common.collect.DenseImmutableTable$ColumnMap
            r13.<init>(r12, r14)
            r12.columnMap = r13
            return
    }

    public static /* synthetic */ int[] access$200(com.google.common.collect.DenseImmutableTable r0) {
            int[] r0 = r0.rowCounts
            return r0
    }

    public static /* synthetic */ com.google.common.collect.ImmutableMap access$300(com.google.common.collect.DenseImmutableTable r0) {
            com.google.common.collect.ImmutableMap<C, java.lang.Integer> r0 = r0.columnKeyToIndex
            return r0
    }

    public static /* synthetic */ java.lang.Object[][] access$400(com.google.common.collect.DenseImmutableTable r0) {
            V[][] r0 = r0.values
            return r0
    }

    public static /* synthetic */ int[] access$500(com.google.common.collect.DenseImmutableTable r0) {
            int[] r0 = r0.columnCounts
            return r0
    }

    public static /* synthetic */ com.google.common.collect.ImmutableMap access$600(com.google.common.collect.DenseImmutableTable r0) {
            com.google.common.collect.ImmutableMap<R, java.lang.Integer> r0 = r0.rowKeyToIndex
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<C, java.util.Map<R, V>> columnMap() {
            r1 = this;
            com.google.common.collect.ImmutableMap<C, com.google.common.collect.ImmutableMap<R, V>> r0 = r1.columnMap
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.copyOf(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map columnMap() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.columnMap()
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r1 = this;
            com.google.common.collect.ImmutableMap<R, java.lang.Integer> r0 = r1.rowKeyToIndex
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            com.google.common.collect.ImmutableMap<C, java.lang.Integer> r0 = r1.columnKeyToIndex
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r2 == 0) goto L24
            if (r3 != 0) goto L15
            goto L24
        L15:
            V[][] r0 = r1.values
            int r2 = r2.intValue()
            r2 = r0[r2]
            int r3 = r3.intValue()
            r2 = r2[r3]
            goto L25
        L24:
            r2 = 0
        L25:
            return r2
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public final com.google.common.collect.Table.Cell<R, C, V> getCell(int r5) {
            r4 = this;
            int[] r0 = r4.cellRowIndices
            r0 = r0[r5]
            int[] r1 = r4.cellColumnIndices
            r5 = r1[r5]
            com.google.common.collect.ImmutableSet r1 = r4.rowKeySet()
            com.google.common.collect.ImmutableList r1 = r1.asList()
            java.lang.Object r1 = r1.get(r0)
            com.google.common.collect.ImmutableSet r2 = r4.columnKeySet()
            com.google.common.collect.ImmutableList r2 = r2.asList()
            java.lang.Object r2 = r2.get(r5)
            V[][] r3 = r4.values
            r0 = r3[r0]
            r5 = r0[r5]
            java.util.Objects.requireNonNull(r5)
            com.google.common.collect.Table$Cell r5 = com.google.common.collect.ImmutableTable.cellOf(r1, r2, r5)
            return r5
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public final V getValue(int r3) {
            r2 = this;
            V[][] r0 = r2.values
            int[] r1 = r2.cellRowIndices
            r1 = r1[r3]
            r0 = r0[r1]
            int[] r1 = r2.cellColumnIndices
            r3 = r1[r3]
            r3 = r0[r3]
            java.util.Objects.requireNonNull(r3)
            return r3
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<R, java.util.Map<C, V>> rowMap() {
            r1 = this;
            com.google.common.collect.ImmutableMap<R, com.google.common.collect.ImmutableMap<C, V>> r0 = r1.rowMap
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.copyOf(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map rowMap() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.rowMap()
            return r0
    }

    @Override // com.google.common.collect.Table
    public int size() {
            r1 = this;
            int[] r0 = r1.cellRowIndices
            int r0 = r0.length
            return r0
    }
}
