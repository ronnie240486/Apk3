package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.errorprone.annotations.DoNotMock("Use ImmutableTable, HashBasedTable, or another implementation")
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface Table<R, C, V> {

    /* JADX INFO: loaded from: classes2.dex */
    public interface Cell<R, C, V> {
        boolean equals(@javax.annotation.CheckForNull java.lang.Object r1);

        @com.google.common.collect.ParametricNullness
        C getColumnKey();

        @com.google.common.collect.ParametricNullness
        R getRowKey();

        @com.google.common.collect.ParametricNullness
        V getValue();

        int hashCode();
    }

    java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet();

    void clear();

    java.util.Map<R, V> column(@com.google.common.collect.ParametricNullness C r1);

    java.util.Set<C> columnKeySet();

    java.util.Map<C, java.util.Map<R, V>> columnMap();

    boolean contains(@javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("R") java.lang.Object r1, @javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("C") java.lang.Object r2);

    boolean containsColumn(@javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("C") java.lang.Object r1);

    boolean containsRow(@javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("R") java.lang.Object r1);

    boolean containsValue(@javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("V") java.lang.Object r1);

    boolean equals(@javax.annotation.CheckForNull java.lang.Object r1);

    @javax.annotation.CheckForNull
    V get(@javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("R") java.lang.Object r1, @javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("C") java.lang.Object r2);

    int hashCode();

    boolean isEmpty();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    V put(@com.google.common.collect.ParametricNullness R r1, @com.google.common.collect.ParametricNullness C r2, @com.google.common.collect.ParametricNullness V r3);

    void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    V remove(@javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("R") java.lang.Object r1, @javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("C") java.lang.Object r2);

    java.util.Map<C, V> row(@com.google.common.collect.ParametricNullness R r1);

    java.util.Set<R> rowKeySet();

    java.util.Map<R, java.util.Map<C, V>> rowMap();

    int size();

    java.util.Collection<V> values();
}
