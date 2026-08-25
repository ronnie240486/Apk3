package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class ReverseOrdering<T> extends com.google.common.collect.Ordering<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    public final com.google.common.collect.Ordering<? super T> forwardOrder;

    public ReverseOrdering(com.google.common.collect.Ordering<? super T> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Ordering r1 = (com.google.common.collect.Ordering) r1
            r0.forwardOrder = r1
            return
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@com.google.common.collect.ParametricNullness T r2, @com.google.common.collect.ParametricNullness T r3) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            int r2 = r0.compare(r3, r2)
            return r2
    }

    @Override // java.util.Comparator
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.common.collect.ReverseOrdering
            if (r0 == 0) goto L13
            com.google.common.collect.ReverseOrdering r2 = (com.google.common.collect.ReverseOrdering) r2
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            com.google.common.collect.Ordering<? super T> r2 = r2.forwardOrder
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            int r0 = r0.hashCode()
            int r0 = -r0
            return r0
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(java.lang.Iterable<E> r2) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            java.lang.Object r2 = r0.min(r2)
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(@com.google.common.collect.ParametricNullness E r2, @com.google.common.collect.ParametricNullness E r3) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            java.lang.Object r2 = r0.min(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(@com.google.common.collect.ParametricNullness E r2, @com.google.common.collect.ParametricNullness E r3, @com.google.common.collect.ParametricNullness E r4, E... r5) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            java.lang.Object r2 = r0.min(r2, r3, r4, r5)
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(java.util.Iterator<E> r2) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            java.lang.Object r2 = r0.min(r2)
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(java.lang.Iterable<E> r2) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            java.lang.Object r2 = r0.max(r2)
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(@com.google.common.collect.ParametricNullness E r2, @com.google.common.collect.ParametricNullness E r3) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            java.lang.Object r2 = r0.max(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(@com.google.common.collect.ParametricNullness E r2, @com.google.common.collect.ParametricNullness E r3, @com.google.common.collect.ParametricNullness E r4, E... r5) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            java.lang.Object r2 = r0.max(r2, r3, r4, r5)
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(java.util.Iterator<E> r2) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            java.lang.Object r2 = r0.max(r2)
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> com.google.common.collect.Ordering<S> reverse() {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.common.collect.Ordering<? super T> r0 = r3.forwardOrder
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            int r1 = r1 + 10
            java.lang.String r2 = ".reverse()"
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r0, r2)
            return r0
    }
}
