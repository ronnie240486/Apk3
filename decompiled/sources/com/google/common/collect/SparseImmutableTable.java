package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.errorprone.annotations.Immutable(containerOf = {"R", "C", "V"})
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class SparseImmutableTable<R, C, V> extends com.google.common.collect.RegularImmutableTable<R, C, V> {
    public static final com.google.common.collect.ImmutableTable<java.lang.Object, java.lang.Object, java.lang.Object> EMPTY = null;
    private final int[] cellColumnInRowIndices;
    private final int[] cellRowIndices;
    private final com.google.common.collect.ImmutableMap<C, com.google.common.collect.ImmutableMap<R, V>> columnMap;
    private final com.google.common.collect.ImmutableMap<R, com.google.common.collect.ImmutableMap<C, V>> rowMap;

    static {
            com.google.common.collect.SparseImmutableTable r0 = new com.google.common.collect.SparseImmutableTable
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            com.google.common.collect.ImmutableSet r2 = com.google.common.collect.ImmutableSet.of()
            com.google.common.collect.ImmutableSet r3 = com.google.common.collect.ImmutableSet.of()
            r0.<init>(r1, r2, r3)
            com.google.common.collect.SparseImmutableTable.EMPTY = r0
            return
    }

    public SparseImmutableTable(com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R, C, V>> r19, com.google.common.collect.ImmutableSet<R> r20, com.google.common.collect.ImmutableSet<C> r21) {
            r18 = this;
            r0 = r18
            r18.<init>()
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.Maps.indexMap(r20)
            java.util.LinkedHashMap r2 = com.google.common.collect.Maps.newLinkedHashMap()
            com.google.common.collect.UnmodifiableIterator r3 = r20.iterator()
        L11:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L24
            java.lang.Object r4 = r3.next()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            r2.put(r4, r5)
            goto L11
        L24:
            java.util.LinkedHashMap r3 = com.google.common.collect.Maps.newLinkedHashMap()
            com.google.common.collect.UnmodifiableIterator r4 = r21.iterator()
        L2c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3f
            java.lang.Object r5 = r4.next()
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            r3.put(r5, r6)
            goto L2c
        L3f:
            int r4 = r19.size()
            int[] r4 = new int[r4]
            int r5 = r19.size()
            int[] r5 = new int[r5]
            r7 = 0
        L4c:
            int r8 = r19.size()
            if (r7 >= r8) goto Lb0
            r8 = r19
            java.lang.Object r9 = r8.get(r7)
            com.google.common.collect.Table$Cell r9 = (com.google.common.collect.Table.Cell) r9
            java.lang.Object r15 = r9.getRowKey()
            java.lang.Object r14 = r9.getColumnKey()
            java.lang.Object r9 = r9.getValue()
            java.lang.Object r10 = r1.get(r15)
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.util.Objects.requireNonNull(r10)
            int r10 = r10.intValue()
            r4[r7] = r10
            java.lang.Object r10 = r2.get(r15)
            java.util.Map r10 = (java.util.Map) r10
            java.util.Objects.requireNonNull(r10)
            java.util.Map r10 = (java.util.Map) r10
            int r11 = r10.size()
            r5[r7] = r11
            java.lang.Object r16 = r10.put(r14, r9)
            if (r16 != 0) goto L8e
            r10 = 1
            goto L8f
        L8e:
            r10 = 0
        L8f:
            java.lang.String r11 = "Duplicate key: (row=%s, column=%s), values: [%s, %s]."
            r12 = r15
            r13 = r14
            r6 = r14
            r14 = r9
            r17 = r1
            r1 = r15
            r15 = r16
            com.google.common.base.Preconditions.checkArgument(r10, r11, r12, r13, r14, r15)
            java.lang.Object r6 = r3.get(r6)
            java.util.Map r6 = (java.util.Map) r6
            java.util.Objects.requireNonNull(r6)
            java.util.Map r6 = (java.util.Map) r6
            r6.put(r1, r9)
            int r7 = r7 + 1
            r1 = r17
            goto L4c
        Lb0:
            r0.cellRowIndices = r4
            r0.cellColumnInRowIndices = r5
            com.google.common.collect.ImmutableMap$Builder r1 = new com.google.common.collect.ImmutableMap$Builder
            int r4 = r2.size()
            r1.<init>(r4)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        Lc5:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Le3
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            java.util.Map r4 = (java.util.Map) r4
            com.google.common.collect.ImmutableMap r4 = com.google.common.collect.ImmutableMap.copyOf(r4)
            r1.put(r5, r4)
            goto Lc5
        Le3:
            com.google.common.collect.ImmutableMap r1 = r1.build()
            r0.rowMap = r1
            com.google.common.collect.ImmutableMap$Builder r1 = new com.google.common.collect.ImmutableMap$Builder
            int r2 = r3.size()
            r1.<init>(r2)
            java.util.Set r2 = r3.entrySet()
            java.util.Iterator r2 = r2.iterator()
        Lfa:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L118
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.util.Map r3 = (java.util.Map) r3
            com.google.common.collect.ImmutableMap r3 = com.google.common.collect.ImmutableMap.copyOf(r3)
            r1.put(r4, r3)
            goto Lfa
        L118:
            com.google.common.collect.ImmutableMap r1 = r1.build()
            r0.columnMap = r1
            return
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

    @Override // com.google.common.collect.RegularImmutableTable
    public final com.google.common.collect.Table.Cell<R, C, V> getCell(int r4) {
            r3 = this;
            int[] r0 = r3.cellRowIndices
            r0 = r0[r4]
            com.google.common.collect.ImmutableMap<R, com.google.common.collect.ImmutableMap<C, V>> r1 = r3.rowMap
            com.google.common.collect.ImmutableSet r1 = r1.entrySet()
            com.google.common.collect.ImmutableList r1 = r1.asList()
            java.lang.Object r0 = r1.get(r0)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            com.google.common.collect.ImmutableMap r1 = (com.google.common.collect.ImmutableMap) r1
            int[] r2 = r3.cellColumnInRowIndices
            r4 = r2[r4]
            com.google.common.collect.ImmutableSet r1 = r1.entrySet()
            com.google.common.collect.ImmutableList r1 = r1.asList()
            java.lang.Object r4 = r1.get(r4)
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r0.getKey()
            java.lang.Object r1 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            com.google.common.collect.Table$Cell r4 = com.google.common.collect.ImmutableTable.cellOf(r0, r1, r4)
            return r4
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public final V getValue(int r3) {
            r2 = this;
            int[] r0 = r2.cellRowIndices
            r0 = r0[r3]
            com.google.common.collect.ImmutableMap<R, com.google.common.collect.ImmutableMap<C, V>> r1 = r2.rowMap
            com.google.common.collect.ImmutableCollection r1 = r1.values()
            com.google.common.collect.ImmutableList r1 = r1.asList()
            java.lang.Object r0 = r1.get(r0)
            com.google.common.collect.ImmutableMap r0 = (com.google.common.collect.ImmutableMap) r0
            int[] r1 = r2.cellColumnInRowIndices
            r3 = r1[r3]
            com.google.common.collect.ImmutableCollection r0 = r0.values()
            com.google.common.collect.ImmutableList r0 = r0.asList()
            java.lang.Object r3 = r0.get(r3)
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
