package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class TopKSelector<T> {
    private final T[] buffer;
    private int bufferSize;
    private final java.util.Comparator<? super T> comparator;
    private final int k;

    @javax.annotation.CheckForNull
    private T threshold;

    private TopKSelector(java.util.Comparator<? super T> r4, int r5) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "comparator"
            java.lang.Object r4 = com.google.common.base.Preconditions.checkNotNull(r4, r0)
            java.util.Comparator r4 = (java.util.Comparator) r4
            r3.comparator = r4
            r3.k = r5
            r4 = 1
            r0 = 0
            if (r5 < 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            java.lang.String r2 = "k (%s) must be >= 0"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r5)
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 > r1) goto L21
            goto L22
        L21:
            r4 = 0
        L22:
            java.lang.String r1 = "k (%s) must be <= Integer.MAX_VALUE / 2"
            com.google.common.base.Preconditions.checkArgument(r4, r1, r5)
            r4 = 2
            int r4 = com.google.common.math.IntMath.checkedMultiply(r5, r4)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r3.buffer = r4
            r3.bufferSize = r0
            r4 = 0
            r3.threshold = r4
            return
    }

    public static <T extends java.lang.Comparable<? super T>> com.google.common.collect.TopKSelector<T> greatest(int r1) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.TopKSelector r1 = greatest(r1, r0)
            return r1
    }

    public static <T> com.google.common.collect.TopKSelector<T> greatest(int r1, java.util.Comparator<? super T> r2) {
            com.google.common.collect.TopKSelector r0 = new com.google.common.collect.TopKSelector
            com.google.common.collect.Ordering r2 = com.google.common.collect.Ordering.from(r2)
            com.google.common.collect.Ordering r2 = r2.reverse()
            r0.<init>(r2, r1)
            return r0
    }

    public static <T extends java.lang.Comparable<? super T>> com.google.common.collect.TopKSelector<T> least(int r1) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.TopKSelector r1 = least(r1, r0)
            return r1
    }

    public static <T> com.google.common.collect.TopKSelector<T> least(int r1, java.util.Comparator<? super T> r2) {
            com.google.common.collect.TopKSelector r0 = new com.google.common.collect.TopKSelector
            r0.<init>(r2, r1)
            return r0
    }

    private int partition(int r4, int r5, int r6) {
            r3 = this;
            T[] r0 = r3.buffer
            r1 = r0[r6]
            r2 = r0[r5]
            r0[r6] = r2
            r6 = r4
        L9:
            if (r4 >= r5) goto L1f
            java.util.Comparator<? super T> r0 = r3.comparator
            T[] r2 = r3.buffer
            r2 = r2[r4]
            int r0 = r0.compare(r2, r1)
            if (r0 >= 0) goto L1c
            r3.swap(r6, r4)
            int r6 = r6 + 1
        L1c:
            int r4 = r4 + 1
            goto L9
        L1f:
            T[] r4 = r3.buffer
            r0 = r4[r6]
            r4[r5] = r0
            r4[r6] = r1
            return r6
    }

    private void swap(int r4, int r5) {
            r3 = this;
            T[] r0 = r3.buffer
            r1 = r0[r4]
            r2 = r0[r5]
            r0[r4] = r2
            r0[r5] = r1
            return
    }

    private void trim() {
            r7 = this;
            int r0 = r7.k
            int r0 = r0 * 2
            int r0 = r0 + (-1)
            int r1 = r0 + 0
            java.math.RoundingMode r2 = java.math.RoundingMode.CEILING
            int r1 = com.google.common.math.IntMath.log2(r1, r2)
            int r1 = r1 * 3
            r2 = 0
            r3 = 0
            r4 = 0
        L13:
            if (r2 >= r0) goto L3d
            int r5 = r2 + r0
            int r5 = r5 + 1
            int r5 = r5 >>> 1
            int r5 = r7.partition(r2, r0, r5)
            int r6 = r7.k
            if (r5 <= r6) goto L27
            int r5 = r5 + (-1)
            r0 = r5
            goto L30
        L27:
            if (r5 >= r6) goto L3d
            int r2 = r2 + 1
            int r2 = java.lang.Math.max(r5, r2)
            r4 = r5
        L30:
            int r3 = r3 + 1
            if (r3 < r1) goto L13
            T[] r1 = r7.buffer
            int r0 = r0 + 1
            java.util.Comparator<? super T> r3 = r7.comparator
            java.util.Arrays.sort(r1, r2, r0, r3)
        L3d:
            int r0 = r7.k
            r7.bufferSize = r0
            T[] r0 = r7.buffer
            r0 = r0[r4]
            r7.threshold = r0
        L47:
            int r4 = r4 + 1
            int r0 = r7.k
            if (r4 >= r0) goto L62
            java.util.Comparator<? super T> r0 = r7.comparator
            T[] r1 = r7.buffer
            r1 = r1[r4]
            T r2 = r7.threshold
            int r0 = r0.compare(r1, r2)
            if (r0 <= 0) goto L61
            T[] r0 = r7.buffer
            r0 = r0[r4]
            r7.threshold = r0
        L61:
            goto L47
        L62:
            return
    }

    public void offer(@com.google.common.collect.ParametricNullness T r4) {
            r3 = this;
            int r0 = r3.k
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r3.bufferSize
            if (r1 != 0) goto L14
            T[] r0 = r3.buffer
            r1 = 0
            r0[r1] = r4
            r3.threshold = r4
            r4 = 1
            r3.bufferSize = r4
            goto L48
        L14:
            if (r1 >= r0) goto L2b
            T[] r0 = r3.buffer
            int r2 = r1 + 1
            r3.bufferSize = r2
            r0[r1] = r4
            java.util.Comparator<? super T> r0 = r3.comparator
            T r1 = r3.threshold
            int r0 = r0.compare(r4, r1)
            if (r0 <= 0) goto L48
            r3.threshold = r4
            goto L48
        L2b:
            java.util.Comparator<? super T> r0 = r3.comparator
            T r1 = r3.threshold
            int r0 = r0.compare(r4, r1)
            if (r0 >= 0) goto L48
            T[] r0 = r3.buffer
            int r1 = r3.bufferSize
            int r2 = r1 + 1
            r3.bufferSize = r2
            r0[r1] = r4
            int r4 = r3.k
            int r4 = r4 * 2
            if (r2 != r4) goto L48
            r3.trim()
        L48:
            return
    }

    public void offerAll(java.lang.Iterable<? extends T> r1) {
            r0 = this;
            java.util.Iterator r1 = r1.iterator()
            r0.offerAll(r1)
            return
    }

    public void offerAll(java.util.Iterator<? extends T> r2) {
            r1 = this;
        L0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Le
            java.lang.Object r0 = r2.next()
            r1.offer(r0)
            goto L0
        Le:
            return
    }

    public java.util.List<T> topK() {
            r4 = this;
            T[] r0 = r4.buffer
            int r1 = r4.bufferSize
            java.util.Comparator<? super T> r2 = r4.comparator
            r3 = 0
            java.util.Arrays.sort(r0, r3, r1, r2)
            int r0 = r4.bufferSize
            int r1 = r4.k
            if (r0 <= r1) goto L23
            T[] r0 = r4.buffer
            int r2 = r0.length
            r3 = 0
            java.util.Arrays.fill(r0, r1, r2, r3)
            int r0 = r4.k
            r4.bufferSize = r0
            T[] r1 = r4.buffer
            int r0 = r0 + (-1)
            r0 = r1[r0]
            r4.threshold = r0
        L23:
            T[] r0 = r4.buffer
            int r1 = r4.bufferSize
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }
}
