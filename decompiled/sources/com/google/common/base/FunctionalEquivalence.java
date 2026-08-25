package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
final class FunctionalEquivalence<F, T> extends com.google.common.base.Equivalence<F> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final com.google.common.base.Function<? super F, ? extends T> function;
    private final com.google.common.base.Equivalence<T> resultEquivalence;

    public FunctionalEquivalence(com.google.common.base.Function<? super F, ? extends T> r1, com.google.common.base.Equivalence<T> r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Function r1 = (com.google.common.base.Function) r1
            r0.function = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Equivalence r1 = (com.google.common.base.Equivalence) r1
            r0.resultEquivalence = r1
            return
    }

    @Override // com.google.common.base.Equivalence
    public final boolean doEquivalent(F r3, F r4) {
            r2 = this;
            com.google.common.base.Equivalence<T> r0 = r2.resultEquivalence
            com.google.common.base.Function<? super F, ? extends T> r1 = r2.function
            java.lang.Object r3 = r1.apply(r3)
            com.google.common.base.Function<? super F, ? extends T> r1 = r2.function
            java.lang.Object r4 = r1.apply(r4)
            boolean r3 = r0.equivalent(r3, r4)
            return r3
    }

    @Override // com.google.common.base.Equivalence
    public final int doHash(F r3) {
            r2 = this;
            com.google.common.base.Equivalence<T> r0 = r2.resultEquivalence
            com.google.common.base.Function<? super F, ? extends T> r1 = r2.function
            java.lang.Object r3 = r1.apply(r3)
            int r3 = r0.hash(r3)
            return r3
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.common.base.FunctionalEquivalence
            r2 = 0
            if (r1 == 0) goto L22
            com.google.common.base.FunctionalEquivalence r5 = (com.google.common.base.FunctionalEquivalence) r5
            com.google.common.base.Function<? super F, ? extends T> r1 = r4.function
            com.google.common.base.Function<? super F, ? extends T> r3 = r5.function
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L20
            com.google.common.base.Equivalence<T> r1 = r4.resultEquivalence
            com.google.common.base.Equivalence<T> r5 = r5.resultEquivalence
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L20
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
        L22:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.common.base.Function<? super F, ? extends T> r1 = r3.function
            r2 = 0
            r0[r2] = r1
            com.google.common.base.Equivalence<T> r1 = r3.resultEquivalence
            r2 = 1
            r0[r2] = r1
            int r0 = com.google.common.base.Objects.hashCode(r0)
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            com.google.common.base.Equivalence<T> r0 = r5.resultEquivalence
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.google.common.base.Function<? super F, ? extends T> r1 = r5.function
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r0.length()
            int r2 = r2 + 13
            int r3 = r1.length()
            int r3 = r3 + r2
            java.lang.String r2 = ".onResultOf("
            java.lang.String r4 = ")"
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r2, r1, r4)
            return r0
    }
}
