package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Comparators {
    private Comparators() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> boolean isInOrder(java.lang.Iterable<? extends T> r2, java.util.Comparator<T> r3) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
        L11:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            int r0 = r3.compare(r0, r1)
            if (r0 <= 0) goto L23
            r2 = 0
            return r2
        L23:
            r0 = r1
            goto L11
        L25:
            r2 = 1
            return r2
    }

    public static <T> boolean isInStrictOrder(java.lang.Iterable<? extends T> r2, java.util.Comparator<T> r3) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
        L11:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            int r0 = r3.compare(r0, r1)
            if (r0 < 0) goto L23
            r2 = 0
            return r2
        L23:
            r0 = r1
            goto L11
        L25:
            r2 = 1
            return r2
    }

    public static <T, S extends T> java.util.Comparator<java.lang.Iterable<S>> lexicographical(java.util.Comparator<T> r1) {
            com.google.common.collect.LexicographicalOrdering r0 = new com.google.common.collect.LexicographicalOrdering
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Comparator r1 = (java.util.Comparator) r1
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <T extends java.lang.Comparable<? super T>> T max(T r1, T r2) {
            int r0 = r1.compareTo(r2)
            if (r0 < 0) goto L7
            goto L8
        L7:
            r1 = r2
        L8:
            return r1
    }

    @com.google.common.collect.ParametricNullness
    @com.google.common.annotations.Beta
    public static <T> T max(@com.google.common.collect.ParametricNullness T r0, @com.google.common.collect.ParametricNullness T r1, java.util.Comparator<T> r2) {
            int r2 = r2.compare(r0, r1)
            if (r2 < 0) goto L7
            goto L8
        L7:
            r0 = r1
        L8:
            return r0
    }

    @com.google.common.annotations.Beta
    public static <T extends java.lang.Comparable<? super T>> T min(T r1, T r2) {
            int r0 = r1.compareTo(r2)
            if (r0 > 0) goto L7
            goto L8
        L7:
            r1 = r2
        L8:
            return r1
    }

    @com.google.common.collect.ParametricNullness
    @com.google.common.annotations.Beta
    public static <T> T min(@com.google.common.collect.ParametricNullness T r0, @com.google.common.collect.ParametricNullness T r1, java.util.Comparator<T> r2) {
            int r2 = r2.compare(r0, r1)
            if (r2 > 0) goto L7
            goto L8
        L7:
            r0 = r1
        L8:
            return r0
    }
}
