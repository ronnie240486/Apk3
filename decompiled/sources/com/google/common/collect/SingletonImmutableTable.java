package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
class SingletonImmutableTable<R, C, V> extends com.google.common.collect.ImmutableTable<R, C, V> {
    public final C singleColumnKey;
    public final R singleRowKey;
    public final V singleValue;

    public SingletonImmutableTable(R r1, C r2, V r3) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            r0.singleRowKey = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            r0.singleColumnKey = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
            r0.singleValue = r1
            return
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<R, V> column(C r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r2 = r1.containsColumn(r2)
            if (r2 == 0) goto L12
            R r2 = r1.singleRowKey
            V r0 = r1.singleValue
            com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ImmutableMap.of(r2, r0)
            goto L16
        L12:
            com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ImmutableMap.of()
        L16:
            return r2
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map column(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableMap r1 = r0.column(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<C, java.util.Map<R, V>> columnMap() {
            r3 = this;
            C r0 = r3.singleColumnKey
            R r1 = r3.singleRowKey
            V r2 = r3.singleValue
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.of(r1, r2)
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of(r0, r1)
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ java.util.Map columnMap() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.columnMap()
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public final com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> createCellSet() {
            r3 = this;
            R r0 = r3.singleRowKey
            C r1 = r3.singleColumnKey
            V r2 = r3.singleValue
            com.google.common.collect.Table$Cell r0 = com.google.common.collect.ImmutableTable.cellOf(r0, r1, r2)
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public final java.util.Set createCellSet() {
            r3 = this;
            R r0 = r3.singleRowKey
            C r1 = r3.singleColumnKey
            V r2 = r3.singleValue
            com.google.common.collect.Table$Cell r0 = com.google.common.collect.ImmutableTable.cellOf(r0, r1, r2)
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public final com.google.common.collect.ImmutableCollection<V> createValues() {
            r1 = this;
            V r0 = r1.singleValue
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public final java.util.Collection createValues() {
            r1 = this;
            V r0 = r1.singleValue
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public com.google.common.collect.ImmutableMap<R, java.util.Map<C, V>> rowMap() {
            r3 = this;
            R r0 = r3.singleRowKey
            C r1 = r3.singleColumnKey
            V r2 = r3.singleValue
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.of(r1, r2)
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of(r0, r1)
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
            r0 = 1
            return r0
    }
}
