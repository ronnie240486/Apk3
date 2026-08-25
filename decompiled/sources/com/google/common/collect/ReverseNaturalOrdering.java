package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class ReverseNaturalOrdering extends com.google.common.collect.Ordering<java.lang.Comparable<?>> implements java.io.Serializable {
    public static final com.google.common.collect.ReverseNaturalOrdering INSTANCE = null;
    private static final long serialVersionUID = 0;

    static {
            com.google.common.collect.ReverseNaturalOrdering r0 = new com.google.common.collect.ReverseNaturalOrdering
            r0.<init>()
            com.google.common.collect.ReverseNaturalOrdering.INSTANCE = r0
            return
    }

    private ReverseNaturalOrdering() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.Object readResolve() {
            r1 = this;
            com.google.common.collect.ReverseNaturalOrdering r0 = com.google.common.collect.ReverseNaturalOrdering.INSTANCE
            return r0
    }

    public int compare(java.lang.Comparable<?> r1, java.lang.Comparable<?> r2) {
            r0 = this;
            com.google.common.base.Preconditions.checkNotNull(r1)
            if (r1 != r2) goto L7
            r1 = 0
            return r1
        L7:
            int r1 = r2.compareTo(r1)
            return r1
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r1 = r0.compare(r1, r2)
            return r1
    }

    public <E extends java.lang.Comparable<?>> E max(E r2, E r3) {
            r1 = this;
            com.google.common.collect.NaturalOrdering r0 = com.google.common.collect.NaturalOrdering.INSTANCE
            java.lang.Object r2 = r0.min(r2, r3)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            return r2
    }

    public <E extends java.lang.Comparable<?>> E max(E r2, E r3, E r4, E... r5) {
            r1 = this;
            com.google.common.collect.NaturalOrdering r0 = com.google.common.collect.NaturalOrdering.INSTANCE
            java.lang.Object r2 = r0.min(r2, r3, r4, r5)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends java.lang.Comparable<?>> E max(java.lang.Iterable<E> r2) {
            r1 = this;
            com.google.common.collect.NaturalOrdering r0 = com.google.common.collect.NaturalOrdering.INSTANCE
            java.lang.Object r2 = r0.min(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends java.lang.Comparable<?>> E max(java.util.Iterator<E> r2) {
            r1 = this;
            com.google.common.collect.NaturalOrdering r0 = com.google.common.collect.NaturalOrdering.INSTANCE
            java.lang.Object r2 = r0.min(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ java.lang.Object max(java.lang.Iterable r1) {
            r0 = this;
            java.lang.Comparable r1 = r0.max(r1)
            return r1
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ java.lang.Object max(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            java.lang.Comparable r1 = r0.max(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ java.lang.Object max(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object[] r4) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            java.lang.Comparable[] r4 = (java.lang.Comparable[]) r4
            java.lang.Comparable r1 = r0.max(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ java.lang.Object max(java.util.Iterator r1) {
            r0 = this;
            java.lang.Comparable r1 = r0.max(r1)
            return r1
    }

    public <E extends java.lang.Comparable<?>> E min(E r2, E r3) {
            r1 = this;
            com.google.common.collect.NaturalOrdering r0 = com.google.common.collect.NaturalOrdering.INSTANCE
            java.lang.Object r2 = r0.max(r2, r3)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            return r2
    }

    public <E extends java.lang.Comparable<?>> E min(E r2, E r3, E r4, E... r5) {
            r1 = this;
            com.google.common.collect.NaturalOrdering r0 = com.google.common.collect.NaturalOrdering.INSTANCE
            java.lang.Object r2 = r0.max(r2, r3, r4, r5)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends java.lang.Comparable<?>> E min(java.lang.Iterable<E> r2) {
            r1 = this;
            com.google.common.collect.NaturalOrdering r0 = com.google.common.collect.NaturalOrdering.INSTANCE
            java.lang.Object r2 = r0.max(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends java.lang.Comparable<?>> E min(java.util.Iterator<E> r2) {
            r1 = this;
            com.google.common.collect.NaturalOrdering r0 = com.google.common.collect.NaturalOrdering.INSTANCE
            java.lang.Object r2 = r0.max(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ java.lang.Object min(java.lang.Iterable r1) {
            r0 = this;
            java.lang.Comparable r1 = r0.min(r1)
            return r1
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ java.lang.Object min(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            java.lang.Comparable r1 = r0.min(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ java.lang.Object min(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object[] r4) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            java.lang.Comparable[] r4 = (java.lang.Comparable[]) r4
            java.lang.Comparable r1 = r0.min(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.common.collect.Ordering
    public /* bridge */ /* synthetic */ java.lang.Object min(java.util.Iterator r1) {
            r0 = this;
            java.lang.Comparable r1 = r0.min(r1)
            return r1
    }

    @Override // com.google.common.collect.Ordering
    public <S extends java.lang.Comparable<?>> com.google.common.collect.Ordering<S> reverse() {
            r1 = this;
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Ordering.natural().reverse()"
            return r0
    }
}
