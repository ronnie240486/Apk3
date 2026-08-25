package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class ComparatorOrdering<T> extends com.google.common.collect.Ordering<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    public final java.util.Comparator<T> comparator;

    public ComparatorOrdering(java.util.Comparator<T> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Comparator r1 = (java.util.Comparator) r1
            r0.comparator = r1
            return
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@com.google.common.collect.ParametricNullness T r2, @com.google.common.collect.ParametricNullness T r3) {
            r1 = this;
            java.util.Comparator<T> r0 = r1.comparator
            int r2 = r0.compare(r2, r3)
            return r2
    }

    @Override // java.util.Comparator
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.common.collect.ComparatorOrdering
            if (r0 == 0) goto L13
            com.google.common.collect.ComparatorOrdering r2 = (com.google.common.collect.ComparatorOrdering) r2
            java.util.Comparator<T> r0 = r1.comparator
            java.util.Comparator<T> r2 = r2.comparator
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.Comparator<T> r0 = r1.comparator
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.Comparator<T> r0 = r1.comparator
            java.lang.String r0 = r0.toString()
            return r0
    }
}
