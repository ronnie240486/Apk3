package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class NaturalOrdering extends com.google.common.collect.Ordering<java.lang.Comparable<?>> implements java.io.Serializable {
    public static final com.google.common.collect.NaturalOrdering INSTANCE = null;
    private static final long serialVersionUID = 0;

    @javax.annotation.CheckForNull
    private transient com.google.common.collect.Ordering<java.lang.Comparable<?>> nullsFirst;

    @javax.annotation.CheckForNull
    private transient com.google.common.collect.Ordering<java.lang.Comparable<?>> nullsLast;

    static {
            com.google.common.collect.NaturalOrdering r0 = new com.google.common.collect.NaturalOrdering
            r0.<init>()
            com.google.common.collect.NaturalOrdering.INSTANCE = r0
            return
    }

    private NaturalOrdering() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.Object readResolve() {
            r1 = this;
            com.google.common.collect.NaturalOrdering r0 = com.google.common.collect.NaturalOrdering.INSTANCE
            return r0
    }

    public int compare(java.lang.Comparable<?> r1, java.lang.Comparable<?> r2) {
            r0 = this;
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r1 = r1.compareTo(r2)
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

    @Override // com.google.common.collect.Ordering
    public <S extends java.lang.Comparable<?>> com.google.common.collect.Ordering<S> nullsFirst() {
            r1 = this;
            com.google.common.collect.Ordering<java.lang.Comparable<?>> r0 = r1.nullsFirst
            if (r0 != 0) goto La
            com.google.common.collect.Ordering r0 = super.nullsFirst()
            r1.nullsFirst = r0
        La:
            return r0
    }

    @Override // com.google.common.collect.Ordering
    public <S extends java.lang.Comparable<?>> com.google.common.collect.Ordering<S> nullsLast() {
            r1 = this;
            com.google.common.collect.Ordering<java.lang.Comparable<?>> r0 = r1.nullsLast
            if (r0 != 0) goto La
            com.google.common.collect.Ordering r0 = super.nullsLast()
            r1.nullsLast = r0
        La:
            return r0
    }

    @Override // com.google.common.collect.Ordering
    public <S extends java.lang.Comparable<?>> com.google.common.collect.Ordering<S> reverse() {
            r1 = this;
            com.google.common.collect.ReverseNaturalOrdering r0 = com.google.common.collect.ReverseNaturalOrdering.INSTANCE
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Ordering.natural()"
            return r0
    }
}
