package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface RowSortedTable<R, C, V> extends com.google.common.collect.Table<R, C, V> {

    /* JADX INFO: renamed from: com.google.common.collect.RowSortedTable$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public final /* synthetic */ class CC<R, C, V> {
        public static /* bridge */ /* synthetic */ java.util.Set $default$rowKeySet(com.google.common.collect.RowSortedTable r0) {
                java.util.SortedSet r0 = r0.rowKeySet()
                return r0
        }

        public static /* bridge */ /* synthetic */ java.util.Map $default$rowMap(com.google.common.collect.RowSortedTable r0) {
                java.util.SortedMap r0 = r0.rowMap()
                return r0
        }
    }

    @Override // com.google.common.collect.Table
    /* bridge */ /* synthetic */ java.util.Set rowKeySet();

    @Override // com.google.common.collect.Table
    java.util.SortedSet<R> rowKeySet();

    @Override // com.google.common.collect.Table
    /* bridge */ /* synthetic */ java.util.Map rowMap();

    @Override // com.google.common.collect.Table
    java.util.SortedMap<R, java.util.Map<C, V>> rowMap();
}
