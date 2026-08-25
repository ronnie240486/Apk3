package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class RegularImmutableTable<R, C, V> extends com.google.common.collect.ImmutableTable<R, C, V> {


    /* JADX INFO: loaded from: classes2.dex */
    public final class CellSet extends com.google.common.collect.IndexedImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> {
        public final /* synthetic */ com.google.common.collect.RegularImmutableTable this$0;

        private CellSet(com.google.common.collect.RegularImmutableTable r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ CellSet(com.google.common.collect.RegularImmutableTable r1, com.google.common.collect.RegularImmutableTable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof com.google.common.collect.Table.Cell
                r1 = 0
                if (r0 == 0) goto L22
                com.google.common.collect.Table$Cell r5 = (com.google.common.collect.Table.Cell) r5
                com.google.common.collect.RegularImmutableTable r0 = r4.this$0
                java.lang.Object r2 = r5.getRowKey()
                java.lang.Object r3 = r5.getColumnKey()
                java.lang.Object r0 = r0.get(r2, r3)
                if (r0 == 0) goto L22
                java.lang.Object r5 = r5.getValue()
                boolean r5 = r0.equals(r5)
                if (r5 == 0) goto L22
                r1 = 1
            L22:
                return r1
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public final java.lang.Object get(int r2) {
                r1 = this;
                com.google.common.collect.RegularImmutableTable r0 = r1.this$0
                com.google.common.collect.Table$Cell r2 = r0.getCell(r2)
                return r2
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.RegularImmutableTable r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class Values extends com.google.common.collect.ImmutableList<V> {
        public final /* synthetic */ com.google.common.collect.RegularImmutableTable this$0;

        private Values(com.google.common.collect.RegularImmutableTable r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ Values(com.google.common.collect.RegularImmutableTable r1, com.google.common.collect.RegularImmutableTable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.List
        public V get(int r2) {
                r1 = this;
                com.google.common.collect.RegularImmutableTable r0 = r1.this$0
                java.lang.Object r2 = r0.getValue(r2)
                return r2
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
                com.google.common.collect.RegularImmutableTable r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    public RegularImmutableTable() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <R, C, V> com.google.common.collect.RegularImmutableTable<R, C, V> forCells(java.util.List<com.google.common.collect.Table.Cell<R, C, V>> r1, @javax.annotation.CheckForNull java.util.Comparator<? super R> r2, @javax.annotation.CheckForNull java.util.Comparator<? super C> r3) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            if (r2 != 0) goto L7
            if (r3 == 0) goto Lf
        L7:
            com.google.common.collect.RegularImmutableTable$1 r0 = new com.google.common.collect.RegularImmutableTable$1
            r0.<init>(r2, r3)
            java.util.Collections.sort(r1, r0)
        Lf:
            com.google.common.collect.RegularImmutableTable r1 = forCellsInternal(r1, r2, r3)
            return r1
    }

    private static <R, C, V> com.google.common.collect.RegularImmutableTable<R, C, V> forCellsInternal(java.lang.Iterable<com.google.common.collect.Table.Cell<R, C, V>> r7, @javax.annotation.CheckForNull java.util.Comparator<? super R> r8, @javax.annotation.CheckForNull java.util.Comparator<? super C> r9) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf(r7)
            java.util.Iterator r7 = r7.iterator()
        L12:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r7.next()
            com.google.common.collect.Table$Cell r3 = (com.google.common.collect.Table.Cell) r3
            java.lang.Object r4 = r3.getRowKey()
            r0.add(r4)
            java.lang.Object r3 = r3.getColumnKey()
            r1.add(r3)
            goto L12
        L2d:
            if (r8 != 0) goto L34
            com.google.common.collect.ImmutableSet r7 = com.google.common.collect.ImmutableSet.copyOf(r0)
            goto L3c
        L34:
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.sortedCopyOf(r8, r0)
            com.google.common.collect.ImmutableSet r7 = com.google.common.collect.ImmutableSet.copyOf(r7)
        L3c:
            if (r9 != 0) goto L43
            com.google.common.collect.ImmutableSet r8 = com.google.common.collect.ImmutableSet.copyOf(r1)
            goto L4b
        L43:
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.sortedCopyOf(r9, r1)
            com.google.common.collect.ImmutableSet r8 = com.google.common.collect.ImmutableSet.copyOf(r8)
        L4b:
            int r9 = r2.size()
            long r0 = (long) r9
            int r9 = r7.size()
            long r3 = (long) r9
            int r9 = r8.size()
            long r5 = (long) r9
            long r3 = r3 * r5
            r5 = 2
            long r3 = r3 / r5
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 <= 0) goto L69
            com.google.common.collect.DenseImmutableTable r9 = new com.google.common.collect.DenseImmutableTable
            r9.<init>(r2, r7, r8)
            goto L6e
        L69:
            com.google.common.collect.SparseImmutableTable r9 = new com.google.common.collect.SparseImmutableTable
            r9.<init>(r2, r7, r8)
        L6e:
            return r9
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public final com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> createCellSet() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of()
            goto L11
        Lb:
            com.google.common.collect.RegularImmutableTable$CellSet r0 = new com.google.common.collect.RegularImmutableTable$CellSet
            r1 = 0
            r0.<init>(r2, r1)
        L11:
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public final java.util.Set createCellSet() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of()
            goto L11
        Lb:
            com.google.common.collect.RegularImmutableTable$CellSet r0 = new com.google.common.collect.RegularImmutableTable$CellSet
            r1 = 0
            r0.<init>(r2, r1)
        L11:
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public final com.google.common.collect.ImmutableCollection<V> createValues() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            goto L11
        Lb:
            com.google.common.collect.RegularImmutableTable$Values r0 = new com.google.common.collect.RegularImmutableTable$Values
            r1 = 0
            r0.<init>(r2, r1)
        L11:
            return r0
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public final java.util.Collection createValues() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            goto L11
        Lb:
            com.google.common.collect.RegularImmutableTable$Values r0 = new com.google.common.collect.RegularImmutableTable$Values
            r1 = 0
            r0.<init>(r2, r1)
        L11:
            return r0
    }

    public abstract com.google.common.collect.Table.Cell<R, C, V> getCell(int r1);

    public abstract V getValue(int r1);
}
