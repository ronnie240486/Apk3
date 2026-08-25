package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(serializable = true)
@com.google.common.base.ElementTypesAreNonnullByDefault
final class PairwiseEquivalence<E, T extends E> extends com.google.common.base.Equivalence<java.lang.Iterable<T>> implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    public final com.google.common.base.Equivalence<E> elementEquivalence;

    public PairwiseEquivalence(com.google.common.base.Equivalence<E> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Equivalence r1 = (com.google.common.base.Equivalence) r1
            r0.elementEquivalence = r1
            return
    }

    @Override // com.google.common.base.Equivalence
    public final boolean doEquivalent(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        Lc:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L2a
            com.google.common.base.Equivalence<E> r0 = r4.elementEquivalence
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.next()
            boolean r0 = r0.equivalent(r2, r3)
            if (r0 != 0) goto Lc
            goto L37
        L2a:
            boolean r5 = r5.hasNext()
            if (r5 != 0) goto L37
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L37
            r1 = 1
        L37:
            return r1
    }

    @Override // com.google.common.base.Equivalence
    public final int doHash(java.lang.Object r4) {
            r3 = this;
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
            r0 = 78721(0x13381, float:1.10312E-40)
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r4.next()
            int r0 = r0 * 24943
            com.google.common.base.Equivalence<E> r2 = r3.elementEquivalence
            int r1 = r2.hash(r1)
            int r0 = r0 + r1
            goto L9
        L1d:
            return r0
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.common.base.PairwiseEquivalence
            if (r0 == 0) goto Lf
            com.google.common.base.PairwiseEquivalence r2 = (com.google.common.base.PairwiseEquivalence) r2
            com.google.common.base.Equivalence<E> r0 = r1.elementEquivalence
            com.google.common.base.Equivalence<E> r2 = r2.elementEquivalence
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r2 = this;
            com.google.common.base.Equivalence<E> r0 = r2.elementEquivalence
            int r0 = r0.hashCode()
            r1 = 1185147655(0x46a3eb07, float:20981.514)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.common.base.Equivalence<E> r0 = r3.elementEquivalence
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            int r1 = r1 + 11
            java.lang.String r2 = ".pairwise()"
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r0, r2)
            return r0
    }
}
