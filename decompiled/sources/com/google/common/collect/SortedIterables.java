package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class SortedIterables {
    private SortedIterables() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <E> java.util.Comparator<? super E> comparator(java.util.SortedSet<E> r0) {
            java.util.Comparator r0 = r0.comparator()
            if (r0 != 0) goto La
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
        La:
            return r0
    }

    public static boolean hasSameComparator(java.util.Comparator<?> r1, java.lang.Iterable<?> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r2 instanceof java.util.SortedSet
            if (r0 == 0) goto L11
            java.util.SortedSet r2 = (java.util.SortedSet) r2
            java.util.Comparator r2 = comparator(r2)
            goto L1b
        L11:
            boolean r0 = r2 instanceof com.google.common.collect.SortedIterable
            if (r0 == 0) goto L20
            com.google.common.collect.SortedIterable r2 = (com.google.common.collect.SortedIterable) r2
            java.util.Comparator r2 = r2.comparator()
        L1b:
            boolean r1 = r1.equals(r2)
            return r1
        L20:
            r1 = 0
            return r1
    }
}
