package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingTable<R, C, V> extends com.google.common.collect.ForwardingObject implements com.google.common.collect.Table<R, C, V> {
    public ForwardingTable() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.Table
    public java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            java.util.Set r0 = r0.cellSet()
            return r0
    }

    @Override // com.google.common.collect.Table
    public void clear() {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            r0.clear()
            return
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<R, V> column(@com.google.common.collect.ParametricNullness C r2) {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            java.util.Map r2 = r0.column(r2)
            return r2
    }

    @Override // com.google.common.collect.Table
    public java.util.Set<C> columnKeySet() {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            java.util.Set r0 = r0.columnKeySet()
            return r0
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<C, java.util.Map<R, V>> columnMap() {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            java.util.Map r0 = r0.columnMap()
            return r0
    }

    @Override // com.google.common.collect.Table
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            boolean r2 = r0.contains(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.Table
    public boolean containsColumn(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            boolean r2 = r0.containsColumn(r2)
            return r2
    }

    @Override // com.google.common.collect.Table
    public boolean containsRow(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            boolean r2 = r0.containsRow(r2)
            return r2
    }

    @Override // com.google.common.collect.Table
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract com.google.common.collect.Table<R, C, V> delegate();

    @Override // com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.Table
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto Lf
            com.google.common.collect.Table r0 = r1.delegate()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    @Override // com.google.common.collect.Table
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            java.lang.Object r2 = r0.get(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.Table
    public int hashCode() {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.common.collect.Table
    public boolean isEmpty() {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // com.google.common.collect.Table
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V put(@com.google.common.collect.ParametricNullness R r2, @com.google.common.collect.ParametricNullness C r3, @com.google.common.collect.ParametricNullness V r4) {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            java.lang.Object r2 = r0.put(r2, r3, r4)
            return r2
    }

    @Override // com.google.common.collect.Table
    public void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> r2) {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            r0.putAll(r2)
            return
    }

    @Override // com.google.common.collect.Table
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V remove(@javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            java.lang.Object r2 = r0.remove(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<C, V> row(@com.google.common.collect.ParametricNullness R r2) {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            java.util.Map r2 = r0.row(r2)
            return r2
    }

    @Override // com.google.common.collect.Table
    public java.util.Set<R> rowKeySet() {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            java.util.Set r0 = r0.rowKeySet()
            return r0
    }

    @Override // com.google.common.collect.Table
    public java.util.Map<R, java.util.Map<C, V>> rowMap() {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            java.util.Map r0 = r0.rowMap()
            return r0
    }

    @Override // com.google.common.collect.Table
    public int size() {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.common.collect.Table
    public java.util.Collection<V> values() {
            r1 = this;
            com.google.common.collect.Table r0 = r1.delegate()
            java.util.Collection r0 = r0.values()
            return r0
    }
}
