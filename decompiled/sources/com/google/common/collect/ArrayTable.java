package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class ArrayTable<R, C, V> extends com.google.common.collect.AbstractTable<R, C, V> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final V[][] array;
    private final com.google.common.collect.ImmutableMap<C, java.lang.Integer> columnKeyToIndex;
    private final com.google.common.collect.ImmutableList<C> columnList;

    @javax.annotation.CheckForNull
    private transient com.google.common.collect.ArrayTable<R, C, V>.ColumnMap columnMap;
    private final com.google.common.collect.ImmutableMap<R, java.lang.Integer> rowKeyToIndex;
    private final com.google.common.collect.ImmutableList<R> rowList;

    @javax.annotation.CheckForNull
    private transient com.google.common.collect.ArrayTable<R, C, V>.RowMap rowMap;




    /* JADX INFO: loaded from: classes.dex */
    public static abstract class ArrayMap<K, V> extends com.google.common.collect.Maps.IteratorBasedAbstractMap<K, V> {
        private final com.google.common.collect.ImmutableMap<K, java.lang.Integer> keyIndex;



        private ArrayMap(com.google.common.collect.ImmutableMap<K, java.lang.Integer> r1) {
                r0 = this;
                r0.<init>()
                r0.keyIndex = r1
                return
        }

        public /* synthetic */ ArrayMap(com.google.common.collect.ImmutableMap r1, com.google.common.collect.ArrayTable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.ImmutableMap<K, java.lang.Integer> r0 = r1.keyIndex
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
                r2 = this;
                com.google.common.collect.ArrayTable$ArrayMap$2 r0 = new com.google.common.collect.ArrayTable$ArrayMap$2
                int r1 = r2.size()
                r0.<init>(r2, r1)
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V get(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.ImmutableMap<K, java.lang.Integer> r0 = r1.keyIndex
                java.lang.Object r2 = r0.get(r2)
                java.lang.Integer r2 = (java.lang.Integer) r2
                if (r2 != 0) goto Lc
                r2 = 0
                return r2
            Lc:
                int r2 = r2.intValue()
                java.lang.Object r2 = r1.getValue(r2)
                return r2
        }

        public final K getKey(int r2) {
                r1 = this;
                com.google.common.collect.ImmutableMap<K, java.lang.Integer> r0 = r1.keyIndex
                com.google.common.collect.ImmutableSet r0 = r0.keySet()
                com.google.common.collect.ImmutableList r0 = r0.asList()
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        public abstract java.lang.String getKeyRole();

        @com.google.common.collect.ParametricNullness
        public abstract V getValue(int r1);

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
                r1 = this;
                com.google.common.collect.ImmutableMap<K, java.lang.Integer> r0 = r1.keyIndex
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
                r1 = this;
                com.google.common.collect.ImmutableMap<K, java.lang.Integer> r0 = r1.keyIndex
                com.google.common.collect.ImmutableSet r0 = r0.keySet()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V put(K r6, @com.google.common.collect.ParametricNullness V r7) {
                r5 = this;
                com.google.common.collect.ImmutableMap<K, java.lang.Integer> r0 = r5.keyIndex
                java.lang.Object r0 = r0.get(r6)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L13
                int r6 = r0.intValue()
                java.lang.Object r6 = r5.setValue(r6, r7)
                return r6
            L13:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r5.getKeyRole()
                java.lang.String r6 = java.lang.String.valueOf(r6)
                com.google.common.collect.ImmutableMap<K, java.lang.Integer> r1 = r5.keyIndex
                com.google.common.collect.ImmutableSet r1 = r1.keySet()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r2 = 9
                int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2)
                int r3 = r6.length()
                int r3 = r3 + r2
                int r2 = r1.length()
                int r2 = r2 + r3
                java.lang.String r3 = " "
                java.lang.String r4 = " not in "
                java.lang.StringBuilder r6 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r2, r0, r3, r6, r4)
                r6.append(r1)
                java.lang.String r6 = r6.toString()
                r7.<init>(r6)
                throw r7
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public V remove(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @com.google.common.collect.ParametricNullness
        public abstract V setValue(int r1, @com.google.common.collect.ParametricNullness V r2);

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
                r1 = this;
                com.google.common.collect.ImmutableMap<K, java.lang.Integer> r0 = r1.keyIndex
                int r0 = r0.size()
                return r0
        }
    }

    public class Column extends com.google.common.collect.ArrayTable.ArrayMap<R, V> {
        public final int columnIndex;
        public final /* synthetic */ com.google.common.collect.ArrayTable this$0;

        public Column(com.google.common.collect.ArrayTable r2, int r3) {
                r1 = this;
                r1.this$0 = r2
                com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ArrayTable.access$300(r2)
                r0 = 0
                r1.<init>(r2, r0)
                r1.columnIndex = r3
                return
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final java.lang.String getKeyRole() {
                r1 = this;
                java.lang.String r0 = "Row"
                return r0
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        @javax.annotation.CheckForNull
        public final V getValue(int r3) {
                r2 = this;
                com.google.common.collect.ArrayTable r0 = r2.this$0
                int r1 = r2.columnIndex
                java.lang.Object r3 = r0.at(r3, r1)
                return r3
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        @javax.annotation.CheckForNull
        public final V setValue(int r3, @javax.annotation.CheckForNull V r4) {
                r2 = this;
                com.google.common.collect.ArrayTable r0 = r2.this$0
                int r1 = r2.columnIndex
                java.lang.Object r3 = r0.set(r3, r1, r4)
                return r3
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class ColumnMap extends com.google.common.collect.ArrayTable.ArrayMap<C, java.util.Map<R, V>> {
        public final /* synthetic */ com.google.common.collect.ArrayTable this$0;

        private ColumnMap(com.google.common.collect.ArrayTable r2) {
                r1 = this;
                r1.this$0 = r2
                com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ArrayTable.access$600(r2)
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public /* synthetic */ ColumnMap(com.google.common.collect.ArrayTable r1, com.google.common.collect.ArrayTable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final java.lang.String getKeyRole() {
                r1 = this;
                java.lang.String r0 = "Column"
                return r0
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final java.lang.Object getValue(int r3) {
                r2 = this;
                com.google.common.collect.ArrayTable$Column r0 = new com.google.common.collect.ArrayTable$Column
                com.google.common.collect.ArrayTable r1 = r2.this$0
                r0.<init>(r1, r3)
                return r0
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                java.util.Map r1 = r0.put(r1, r2)
                return r1
        }

        @javax.annotation.CheckForNull
        public java.util.Map<R, V> put(C r1, java.util.Map<R, V> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final java.lang.Object setValue(int r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class Row extends com.google.common.collect.ArrayTable.ArrayMap<C, V> {
        public final int rowIndex;
        public final /* synthetic */ com.google.common.collect.ArrayTable this$0;

        public Row(com.google.common.collect.ArrayTable r2, int r3) {
                r1 = this;
                r1.this$0 = r2
                com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ArrayTable.access$600(r2)
                r0 = 0
                r1.<init>(r2, r0)
                r1.rowIndex = r3
                return
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final java.lang.String getKeyRole() {
                r1 = this;
                java.lang.String r0 = "Column"
                return r0
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        @javax.annotation.CheckForNull
        public final V getValue(int r3) {
                r2 = this;
                com.google.common.collect.ArrayTable r0 = r2.this$0
                int r1 = r2.rowIndex
                java.lang.Object r3 = r0.at(r1, r3)
                return r3
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        @javax.annotation.CheckForNull
        public final V setValue(int r3, @javax.annotation.CheckForNull V r4) {
                r2 = this;
                com.google.common.collect.ArrayTable r0 = r2.this$0
                int r1 = r2.rowIndex
                java.lang.Object r3 = r0.set(r1, r3, r4)
                return r3
        }
    }

    public class RowMap extends com.google.common.collect.ArrayTable.ArrayMap<R, java.util.Map<C, V>> {
        public final /* synthetic */ com.google.common.collect.ArrayTable this$0;

        private RowMap(com.google.common.collect.ArrayTable r2) {
                r1 = this;
                r1.this$0 = r2
                com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ArrayTable.access$300(r2)
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public /* synthetic */ RowMap(com.google.common.collect.ArrayTable r1, com.google.common.collect.ArrayTable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final java.lang.String getKeyRole() {
                r1 = this;
                java.lang.String r0 = "Row"
                return r0
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final java.lang.Object getValue(int r3) {
                r2 = this;
                com.google.common.collect.ArrayTable$Row r0 = new com.google.common.collect.ArrayTable$Row
                com.google.common.collect.ArrayTable r1 = r2.this$0
                r0.<init>(r1, r3)
                return r0
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                java.util.Map r1 = r0.put(r1, r2)
                return r1
        }

        @javax.annotation.CheckForNull
        public java.util.Map<C, V> put(R r1, java.util.Map<C, V> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public final java.lang.Object setValue(int r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    private ArrayTable(com.google.common.collect.ArrayTable<R, C, V> r7) {
            r6 = this;
            r6.<init>()
            com.google.common.collect.ImmutableList<R> r0 = r7.rowList
            r6.rowList = r0
            com.google.common.collect.ImmutableList<C> r1 = r7.columnList
            r6.columnList = r1
            com.google.common.collect.ImmutableMap<R, java.lang.Integer> r2 = r7.rowKeyToIndex
            r6.rowKeyToIndex = r2
            com.google.common.collect.ImmutableMap<C, java.lang.Integer> r2 = r7.columnKeyToIndex
            r6.columnKeyToIndex = r2
            int r0 = r0.size()
            int r1 = r1.size()
            r2 = 2
            int[] r2 = new int[r2]
            r3 = 1
            r2[r3] = r1
            r1 = 0
            r2[r1] = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r2)
            java.lang.Object[][] r0 = (java.lang.Object[][]) r0
            r6.array = r0
            r2 = 0
        L2f:
            com.google.common.collect.ImmutableList<R> r3 = r6.rowList
            int r3 = r3.size()
            if (r2 >= r3) goto L46
            V[][] r3 = r7.array
            r4 = r3[r2]
            r5 = r0[r2]
            r3 = r3[r2]
            int r3 = r3.length
            java.lang.System.arraycopy(r4, r1, r5, r1, r3)
            int r2 = r2 + 1
            goto L2f
        L46:
            return
    }

    private ArrayTable(com.google.common.collect.Table<R, C, ? extends V> r3) {
            r2 = this;
            java.util.Set r0 = r3.rowKeySet()
            java.util.Set r1 = r3.columnKeySet()
            r2.<init>(r0, r1)
            r2.putAll(r3)
            return
    }

    private ArrayTable(java.lang.Iterable<? extends R> r5, java.lang.Iterable<? extends C> r6) {
            r4 = this;
            r4.<init>()
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.copyOf(r5)
            r4.rowList = r5
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.copyOf(r6)
            r4.columnList = r6
            boolean r0 = r5.isEmpty()
            boolean r1 = r6.isEmpty()
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            com.google.common.base.Preconditions.checkArgument(r0)
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.Maps.indexMap(r5)
            r4.rowKeyToIndex = r0
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.Maps.indexMap(r6)
            r4.columnKeyToIndex = r0
            int r5 = r5.size()
            int r6 = r6.size()
            r0 = 2
            int[] r0 = new int[r0]
            r0[r2] = r6
            r0[r3] = r5
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r0)
            java.lang.Object[][] r5 = (java.lang.Object[][]) r5
            r4.array = r5
            r4.eraseAll()
            return
    }

    public static /* synthetic */ com.google.common.collect.Table.Cell access$000(com.google.common.collect.ArrayTable r0, int r1) {
            com.google.common.collect.Table$Cell r0 = r0.getCell(r1)
            return r0
    }

    public static /* synthetic */ com.google.common.collect.ImmutableList access$100(com.google.common.collect.ArrayTable r0) {
            com.google.common.collect.ImmutableList<C> r0 = r0.columnList
            return r0
    }

    public static /* synthetic */ com.google.common.collect.ImmutableList access$200(com.google.common.collect.ArrayTable r0) {
            com.google.common.collect.ImmutableList<R> r0 = r0.rowList
            return r0
    }

    public static /* synthetic */ com.google.common.collect.ImmutableMap access$300(com.google.common.collect.ArrayTable r0) {
            com.google.common.collect.ImmutableMap<R, java.lang.Integer> r0 = r0.rowKeyToIndex
            return r0
    }

    public static /* synthetic */ com.google.common.collect.ImmutableMap access$600(com.google.common.collect.ArrayTable r0) {
            com.google.common.collect.ImmutableMap<C, java.lang.Integer> r0 = r0.columnKeyToIndex
            return r0
    }

    public static /* synthetic */ java.lang.Object access$800(com.google.common.collect.ArrayTable r0, int r1) {
            java.lang.Object r0 = r0.getValue(r1)
            return r0
    }

    public static <R, C, V> com.google.common.collect.ArrayTable<R, C, V> create(com.google.common.collect.Table<R, C, ? extends V> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.ArrayTable
            if (r0 == 0) goto Lc
            com.google.common.collect.ArrayTable r0 = new com.google.common.collect.ArrayTable
            com.google.common.collect.ArrayTable r1 = (com.google.common.collect.ArrayTable) r1
            r0.<init>(r1)
            goto L11
        Lc:
            com.google.common.collect.ArrayTable r0 = new com.google.common.collect.ArrayTable
            r0.<init>(r1)
        L11:
            return r0
    }

    public static <R, C, V> com.google.common.collect.ArrayTable<R, C, V> create(java.lang.Iterable<? extends R> r1, java.lang.Iterable<? extends C> r2) {
            com.google.common.collect.ArrayTable r0 = new com.google.common.collect.ArrayTable
            r0.<init>(r1, r2)
            return r0
    }

    private com.google.common.collect.Table.Cell<R, C, V> getCell(int r2) {
            r1 = this;
            com.google.common.collect.ArrayTable$2 r0 = new com.google.common.collect.ArrayTable$2
            r0.<init>(r1, r2)
            return r0
    }

    @javax.annotation.CheckForNull
    private V getValue(int r3) {
            r2 = this;
            com.google.common.collect.ImmutableList<C> r0 = r2.columnList
            int r0 = r0.size()
            int r0 = r3 / r0
            com.google.common.collect.ImmutableList<C> r1 = r2.columnList
            int r1 = r1.size()
            int r3 = r3 % r1
            java.lang.Object r3 = r2.at(r0, r3)
            return r3
    }

    @javax.annotation.CheckForNull
    public V at(int r2, int r3) {
            r1 = this;
            com.google.common.collect.ImmutableList<R> r0 = r1.rowList
            int r0 = r0.size()
            com.google.common.base.Preconditions.checkElementIndex(r2, r0)
            com.google.common.collect.ImmutableList<C> r0 = r1.columnList
            int r0 = r0.size()
            com.google.common.base.Preconditions.checkElementIndex(r3, r0)
            V[][] r0 = r1.array
            r2 = r0[r2]
            r2 = r2[r3]
            return r2
    }

    @Override // com.google.common.collect.AbstractTable
    public final java.util.Iterator<com.google.common.collect.Table.Cell<R, C, V>> cellIterator() {
            r2 = this;
            com.google.common.collect.ArrayTable$1 r0 = new com.google.common.collect.ArrayTable$1
            int r1 = r2.size()
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
            r1 = this;
            java.util.Set r0 = super.cellSet()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<R, V> column(C r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.ImmutableMap<C, java.lang.Integer> r0 = r1.columnKeyToIndex
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L12
            java.util.Map r2 = java.util.Collections.emptyMap()
            return r2
        L12:
            com.google.common.collect.ArrayTable$Column r0 = new com.google.common.collect.ArrayTable$Column
            int r2 = r2.intValue()
            r0.<init>(r1, r2)
            return r0
    }

    public com.google.common.collect.ImmutableList<C> columnKeyList() {
            r1 = this;
            com.google.common.collect.ImmutableList<C> r0 = r1.columnList
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableSet<C> columnKeySet() {
            r1 = this;
            com.google.common.collect.ImmutableMap<C, java.lang.Integer> r0 = r1.columnKeyToIndex
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
    public java.util.Map<C, java.util.Map<R, V>> columnMap() {
            r2 = this;
            com.google.common.collect.ArrayTable<R, C, V>$ColumnMap r0 = r2.columnMap
            if (r0 != 0) goto Lc
            com.google.common.collect.ArrayTable$ColumnMap r0 = new com.google.common.collect.ArrayTable$ColumnMap
            r1 = 0
            r0.<init>(r2, r1)
            r2.columnMap = r0
        Lc:
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            boolean r1 = r0.containsRow(r1)
            if (r1 == 0) goto Le
            boolean r1 = r0.containsColumn(r2)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsColumn(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.ImmutableMap<C, java.lang.Integer> r0 = r1.columnKeyToIndex
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsRow(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.ImmutableMap<R, java.lang.Integer> r0 = r1.rowKeyToIndex
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r9) {
            r8 = this;
            V[][] r0 = r8.array
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L1d
            r4 = r0[r3]
            int r5 = r4.length
            r6 = 0
        Lb:
            if (r6 >= r5) goto L1a
            r7 = r4[r6]
            boolean r7 = com.google.common.base.Objects.equal(r9, r7)
            if (r7 == 0) goto L17
            r9 = 1
            return r9
        L17:
            int r6 = r6 + 1
            goto Lb
        L1a:
            int r3 = r3 + 1
            goto L5
        L1d:
            return r2
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V erase(@javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r1 = this;
            com.google.common.collect.ImmutableMap<R, java.lang.Integer> r0 = r1.rowKeyToIndex
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            com.google.common.collect.ImmutableMap<C, java.lang.Integer> r0 = r1.columnKeyToIndex
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r0 = 0
            if (r2 == 0) goto L23
            if (r3 != 0) goto L16
            goto L23
        L16:
            int r2 = r2.intValue()
            int r3 = r3.intValue()
            java.lang.Object r2 = r1.set(r2, r3, r0)
            return r2
        L23:
            return r0
    }

    public void eraseAll() {
            r5 = this;
            V[][] r0 = r5.array
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Lf
            r3 = r0[r2]
            r4 = 0
            java.util.Arrays.fill(r3, r4)
            int r2 = r2 + 1
            goto L4
        Lf:
            return
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r1 = this;
            com.google.common.collect.ImmutableMap<R, java.lang.Integer> r0 = r1.rowKeyToIndex
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            com.google.common.collect.ImmutableMap<C, java.lang.Integer> r0 = r1.columnKeyToIndex
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r2 == 0) goto L22
            if (r3 != 0) goto L15
            goto L22
        L15:
            int r2 = r2.intValue()
            int r3 = r3.intValue()
            java.lang.Object r2 = r1.at(r2, r3)
            goto L23
        L22:
            r2 = 0
        L23:
            return r2
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean isEmpty() {
            r1 = this;
            com.google.common.collect.ImmutableList<R> r0 = r1.rowList
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L13
            com.google.common.collect.ImmutableList<C> r0 = r1.columnList
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V put(R r7, C r8, @javax.annotation.CheckForNull V r9) {
            r6 = this;
            com.google.common.base.Preconditions.checkNotNull(r7)
            com.google.common.base.Preconditions.checkNotNull(r8)
            com.google.common.collect.ImmutableMap<R, java.lang.Integer> r0 = r6.rowKeyToIndex
            java.lang.Object r0 = r0.get(r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            com.google.common.collect.ImmutableList<R> r4 = r6.rowList
            java.lang.String r5 = "Row %s not in %s"
            com.google.common.base.Preconditions.checkArgument(r3, r5, r7, r4)
            com.google.common.collect.ImmutableMap<C, java.lang.Integer> r7 = r6.columnKeyToIndex
            java.lang.Object r7 = r7.get(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L27
            goto L28
        L27:
            r1 = 0
        L28:
            com.google.common.collect.ImmutableList<C> r2 = r6.columnList
            java.lang.String r3 = "Column %s not in %s"
            com.google.common.base.Preconditions.checkArgument(r1, r3, r8, r2)
            int r8 = r0.intValue()
            int r7 = r7.intValue()
            java.lang.Object r7 = r6.set(r8, r7, r9)
            return r7
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> r1) {
            r0 = this;
            super.putAll(r1)
            return
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V remove(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<C, V> row(R r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.ImmutableMap<R, java.lang.Integer> r0 = r1.rowKeyToIndex
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L12
            java.util.Map r2 = java.util.Collections.emptyMap()
            return r2
        L12:
            com.google.common.collect.ArrayTable$Row r0 = new com.google.common.collect.ArrayTable$Row
            int r2 = r2.intValue()
            r0.<init>(r1, r2)
            return r0
    }

    public com.google.common.collect.ImmutableList<R> rowKeyList() {
            r1 = this;
            com.google.common.collect.ImmutableList<R> r0 = r1.rowList
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableSet<R> rowKeySet() {
            r1 = this;
            com.google.common.collect.ImmutableMap<R, java.lang.Integer> r0 = r1.rowKeyToIndex
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
    public java.util.Map<R, java.util.Map<C, V>> rowMap() {
            r2 = this;
            com.google.common.collect.ArrayTable<R, C, V>$RowMap r0 = r2.rowMap
            if (r0 != 0) goto Lc
            com.google.common.collect.ArrayTable$RowMap r0 = new com.google.common.collect.ArrayTable$RowMap
            r1 = 0
            r0.<init>(r2, r1)
            r2.rowMap = r0
        Lc:
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V set(int r3, int r4, @javax.annotation.CheckForNull V r5) {
            r2 = this;
            com.google.common.collect.ImmutableList<R> r0 = r2.rowList
            int r0 = r0.size()
            com.google.common.base.Preconditions.checkElementIndex(r3, r0)
            com.google.common.collect.ImmutableList<C> r0 = r2.columnList
            int r0 = r0.size()
            com.google.common.base.Preconditions.checkElementIndex(r4, r0)
            V[][] r0 = r2.array
            r1 = r0[r3]
            r1 = r1[r4]
            r3 = r0[r3]
            r3[r4] = r5
            return r1
    }

    @Override // com.google.common.collect.Table
    public int size() {
            r2 = this;
            com.google.common.collect.ImmutableList<R> r0 = r2.rowList
            int r0 = r0.size()
            com.google.common.collect.ImmutableList<C> r1 = r2.columnList
            int r1 = r1.size()
            int r1 = r1 * r0
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public V[][] toArray(java.lang.Class<V> r6) {
            r5 = this;
            r0 = 2
            int[] r0 = new int[r0]
            com.google.common.collect.ImmutableList<R> r1 = r5.rowList
            int r1 = r1.size()
            r2 = 0
            r0[r2] = r1
            com.google.common.collect.ImmutableList<C> r1 = r5.columnList
            int r1 = r1.size()
            r3 = 1
            r0[r3] = r1
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r0)
            java.lang.Object[][] r6 = (java.lang.Object[][]) r6
            r0 = 0
        L1c:
            com.google.common.collect.ImmutableList<R> r1 = r5.rowList
            int r1 = r1.size()
            if (r0 >= r1) goto L33
            V[][] r1 = r5.array
            r3 = r1[r0]
            r4 = r6[r0]
            r1 = r1[r0]
            int r1 = r1.length
            java.lang.System.arraycopy(r3, r2, r4, r2, r1)
            int r0 = r0 + 1
            goto L1c
        L33:
            return r6
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = super.values()
            return r0
    }

    @Override // com.google.common.collect.AbstractTable
    public final java.util.Iterator<V> valuesIterator() {
            r2 = this;
            com.google.common.collect.ArrayTable$3 r0 = new com.google.common.collect.ArrayTable$3
            int r1 = r2.size()
            r0.<init>(r2, r1)
            return r0
    }
}
