package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class CompoundOrdering<T> extends com.google.common.collect.Ordering<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    public final java.util.Comparator<? super T>[] comparators;

    public CompoundOrdering(java.lang.Iterable<? extends java.util.Comparator<? super T>> r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            java.util.Comparator[] r0 = new java.util.Comparator[r0]
            java.lang.Object[] r2 = com.google.common.collect.Iterables.toArray(r2, r0)
            java.util.Comparator[] r2 = (java.util.Comparator[]) r2
            r1.comparators = r2
            return
    }

    public CompoundOrdering(java.util.Comparator<? super T> r3, java.util.Comparator<? super T> r4) {
            r2 = this;
            r2.<init>()
            r0 = 2
            java.util.Comparator[] r0 = new java.util.Comparator[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r2.comparators = r0
            return
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@com.google.common.collect.ParametricNullness T r5, @com.google.common.collect.ParametricNullness T r6) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            java.util.Comparator<? super T>[] r2 = r4.comparators
            int r3 = r2.length
            if (r1 >= r3) goto L13
            r2 = r2[r1]
            int r2 = r2.compare(r5, r6)
            if (r2 == 0) goto L10
            return r2
        L10:
            int r1 = r1 + 1
            goto L2
        L13:
            return r0
    }

    @Override // java.util.Comparator
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.common.collect.CompoundOrdering
            if (r0 == 0) goto L13
            com.google.common.collect.CompoundOrdering r2 = (com.google.common.collect.CompoundOrdering) r2
            java.util.Comparator<? super T>[] r0 = r1.comparators
            java.util.Comparator<? super T>[] r2 = r2.comparators
            boolean r2 = java.util.Arrays.equals(r0, r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.Comparator<? super T>[] r0 = r1.comparators
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.util.Comparator<? super T>[] r0 = r4.comparators
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r1 = 19
            int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1)
            java.lang.String r2 = "Ordering.compound("
            java.lang.String r3 = ")"
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
            return r0
    }
}
