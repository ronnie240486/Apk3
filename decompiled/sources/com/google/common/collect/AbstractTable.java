package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractTable<R, C, V> implements com.google.common.collect.Table<R, C, V> {

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Collection<V> values;


    public class CellSet extends java.util.AbstractSet<com.google.common.collect.Table.Cell<R, C, V>> {
        public final /* synthetic */ com.google.common.collect.AbstractTable this$0;

        public CellSet(com.google.common.collect.AbstractTable r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.collect.AbstractTable r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.collect.Table.Cell
                r1 = 0
                if (r0 == 0) goto L30
                com.google.common.collect.Table$Cell r4 = (com.google.common.collect.Table.Cell) r4
                com.google.common.collect.AbstractTable r0 = r3.this$0
                java.util.Map r0 = r0.rowMap()
                java.lang.Object r2 = r4.getRowKey()
                java.lang.Object r0 = com.google.common.collect.Maps.safeGet(r0, r2)
                java.util.Map r0 = (java.util.Map) r0
                if (r0 == 0) goto L30
                java.util.Set r0 = r0.entrySet()
                java.lang.Object r2 = r4.getColumnKey()
                java.lang.Object r4 = r4.getValue()
                java.util.Map$Entry r4 = com.google.common.collect.Maps.immutableEntry(r2, r4)
                boolean r4 = com.google.common.collect.Collections2.safeContains(r0, r4)
                if (r4 == 0) goto L30
                r1 = 1
            L30:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<com.google.common.collect.Table.Cell<R, C, V>> iterator() {
                r1 = this;
                com.google.common.collect.AbstractTable r0 = r1.this$0
                java.util.Iterator r0 = r0.cellIterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.collect.Table.Cell
                r1 = 0
                if (r0 == 0) goto L35
                com.google.common.collect.Table$Cell r4 = (com.google.common.collect.Table.Cell) r4
                com.google.common.collect.AbstractTable r0 = r3.this$0
                java.util.Map r0 = r0.rowMap()
                java.lang.Object r2 = r4.getRowKey()
                java.lang.Object r0 = com.google.common.collect.Maps.safeGet(r0, r2)
                java.util.Map r0 = (java.util.Map) r0
                if (r0 == 0) goto L35
                java.util.Set r0 = r0.entrySet()
                java.lang.Object r2 = r4.getColumnKey()
                java.lang.Object r4 = r4.getValue()
                java.util.Map$Entry r4 = com.google.common.collect.Maps.immutableEntry(r2, r4)
                com.google.common.base.Preconditions.checkNotNull(r0)
                boolean r4 = r0.remove(r4)     // Catch: java.lang.Throwable -> L31
                goto L32
            L31:
                r4 = 0
            L32:
                if (r4 == 0) goto L35
                r1 = 1
            L35:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.AbstractTable r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    public class Values extends java.util.AbstractCollection<V> {
        public final /* synthetic */ com.google.common.collect.AbstractTable this$0;

        public Values(com.google.common.collect.AbstractTable r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r1 = this;
                com.google.common.collect.AbstractTable r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.AbstractTable r0 = r1.this$0
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r1 = this;
                com.google.common.collect.AbstractTable r0 = r1.this$0
                java.util.Iterator r0 = r0.valuesIterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                com.google.common.collect.AbstractTable r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    public AbstractTable() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.util.Iterator<com.google.common.collect.Table.Cell<R, C, V>> cellIterator();

    @Override // com.google.common.collect.Table
    public java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
            r1 = this;
            java.util.Set<com.google.common.collect.Table$Cell<R, C, V>> r0 = r1.cellSet
            if (r0 != 0) goto La
            java.util.Set r0 = r1.createCellSet()
            r1.cellSet = r0
        La:
            return r0
    }

    @Override // com.google.common.collect.Table
    public void clear() {
            r1 = this;
            java.util.Set r0 = r1.cellSet()
            java.util.Iterator r0 = r0.iterator()
            com.google.common.collect.Iterators.clear(r0)
            return
    }

    @Override // com.google.common.collect.Table
    public java.util.Set<C> columnKeySet() {
            r1 = this;
            java.util.Map r0 = r1.columnMap()
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // com.google.common.collect.Table
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r1 = this;
            java.util.Map r0 = r1.rowMap()
            java.lang.Object r2 = com.google.common.collect.Maps.safeGet(r0, r2)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L14
            boolean r2 = com.google.common.collect.Maps.safeContainsKey(r2, r3)
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    @Override // com.google.common.collect.Table
    public boolean containsColumn(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.columnMap()
            boolean r2 = com.google.common.collect.Maps.safeContainsKey(r0, r2)
            return r2
    }

    @Override // com.google.common.collect.Table
    public boolean containsRow(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.rowMap()
            boolean r2 = com.google.common.collect.Maps.safeContainsKey(r0, r2)
            return r2
    }

    @Override // com.google.common.collect.Table
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r3) {
            r2 = this;
            java.util.Map r0 = r2.rowMap()
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.util.Map r1 = (java.util.Map) r1
            boolean r1 = r1.containsValue(r3)
            if (r1 == 0) goto Lc
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
    }

    public java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> createCellSet() {
            r1 = this;
            com.google.common.collect.AbstractTable$CellSet r0 = new com.google.common.collect.AbstractTable$CellSet
            r0.<init>(r1)
            return r0
    }

    public java.util.Collection<V> createValues() {
            r1 = this;
            com.google.common.collect.AbstractTable$Values r0 = new com.google.common.collect.AbstractTable$Values
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.Table
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            goto L18
        L4:
            boolean r0 = r2 instanceof com.google.common.collect.Table
            if (r0 == 0) goto L17
            com.google.common.collect.Table r2 = (com.google.common.collect.Table) r2
            java.util.Set r0 = r1.cellSet()
            java.util.Set r2 = r2.cellSet()
            boolean r2 = r0.equals(r2)
            goto L18
        L17:
            r2 = 0
        L18:
            return r2
    }

    @Override // com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r1 = this;
            java.util.Map r0 = r1.rowMap()
            java.lang.Object r2 = com.google.common.collect.Maps.safeGet(r0, r2)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            java.lang.Object r2 = com.google.common.collect.Maps.safeGet(r2, r3)
        L12:
            return r2
    }

    @Override // com.google.common.collect.Table
    public int hashCode() {
            r1 = this;
            java.util.Set r0 = r1.cellSet()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.common.collect.Table
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // com.google.common.collect.Table
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V put(@com.google.common.collect.ParametricNullness R r1, @com.google.common.collect.ParametricNullness C r2, @com.google.common.collect.ParametricNullness V r3) {
            r0 = this;
            java.util.Map r1 = r0.row(r1)
            java.lang.Object r1 = r1.put(r2, r3)
            return r1
    }

    @Override // com.google.common.collect.Table
    public void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> r4) {
            r3 = this;
            java.util.Set r4 = r4.cellSet()
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r4.next()
            com.google.common.collect.Table$Cell r0 = (com.google.common.collect.Table.Cell) r0
            java.lang.Object r1 = r0.getRowKey()
            java.lang.Object r2 = r0.getColumnKey()
            java.lang.Object r0 = r0.getValue()
            r3.put(r1, r2, r0)
            goto L8
        L24:
            return
    }

    @Override // com.google.common.collect.Table
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V remove(@javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r1 = this;
            java.util.Map r0 = r1.rowMap()
            java.lang.Object r2 = com.google.common.collect.Maps.safeGet(r0, r2)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            java.lang.Object r2 = com.google.common.collect.Maps.safeRemove(r2, r3)
        L12:
            return r2
    }

    @Override // com.google.common.collect.Table
    public java.util.Set<R> rowKeySet() {
            r1 = this;
            java.util.Map r0 = r1.rowMap()
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.Map r0 = r1.rowMap()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.common.collect.Table
    public java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection<V> r0 = r1.values
            if (r0 != 0) goto La
            java.util.Collection r0 = r1.createValues()
            r1.values = r0
        La:
            return r0
    }

    public java.util.Iterator<V> valuesIterator() {
            r2 = this;
            com.google.common.collect.AbstractTable$1 r0 = new com.google.common.collect.AbstractTable$1
            java.util.Set r1 = r2.cellSet()
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            return r0
    }
}
