package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class AllEqualOrdering extends com.google.common.collect.Ordering<java.lang.Object> implements java.io.Serializable {
    public static final com.google.common.collect.AllEqualOrdering INSTANCE = null;
    private static final long serialVersionUID = 0;

    static {
            com.google.common.collect.AllEqualOrdering r0 = new com.google.common.collect.AllEqualOrdering
            r0.<init>()
            com.google.common.collect.AllEqualOrdering.INSTANCE = r0
            return
    }

    public AllEqualOrdering() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.Object readResolve() {
            r1 = this;
            com.google.common.collect.AllEqualOrdering r0 = com.google.common.collect.AllEqualOrdering.INSTANCE
            return r0
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.common.collect.Ordering
    public <E> com.google.common.collect.ImmutableList<E> immutableSortedCopy(java.lang.Iterable<E> r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r1)
            return r1
    }

    @Override // com.google.common.collect.Ordering
    public <S> com.google.common.collect.Ordering<S> reverse() {
            r0 = this;
            return r0
    }

    @Override // com.google.common.collect.Ordering
    public <E> java.util.List<E> sortedCopy(java.lang.Iterable<E> r1) {
            r0 = this;
            java.util.ArrayList r1 = com.google.common.collect.Lists.newArrayList(r1)
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Ordering.allEqual()"
            return r0
    }
}
