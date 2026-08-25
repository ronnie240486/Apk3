package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible(serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class GeneralRange<T> implements java.io.Serializable {
    private final java.util.Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final com.google.common.collect.BoundType lowerBoundType;

    @javax.annotation.CheckForNull
    private final T lowerEndpoint;

    @javax.annotation.CheckForNull
    private transient com.google.common.collect.GeneralRange<T> reverse;
    private final com.google.common.collect.BoundType upperBoundType;

    @javax.annotation.CheckForNull
    private final T upperEndpoint;

    private GeneralRange(java.util.Comparator<? super T> r3, boolean r4, @javax.annotation.CheckForNull T r5, com.google.common.collect.BoundType r6, boolean r7, @javax.annotation.CheckForNull T r8, com.google.common.collect.BoundType r9) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Comparator r0 = (java.util.Comparator) r0
            r2.comparator = r0
            r2.hasLowerBound = r4
            r2.hasUpperBound = r7
            r2.lowerEndpoint = r5
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r6)
            com.google.common.collect.BoundType r0 = (com.google.common.collect.BoundType) r0
            r2.lowerBoundType = r0
            r2.upperEndpoint = r8
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r9)
            com.google.common.collect.BoundType r0 = (com.google.common.collect.BoundType) r0
            r2.upperBoundType = r0
            if (r4 == 0) goto L28
            r3.compare(r5, r5)
        L28:
            if (r7 == 0) goto L2d
            r3.compare(r8, r8)
        L2d:
            if (r4 == 0) goto L53
            if (r7 == 0) goto L53
            int r3 = r3.compare(r5, r8)
            r4 = 1
            r7 = 0
            if (r3 > 0) goto L3b
            r0 = 1
            goto L3c
        L3b:
            r0 = 0
        L3c:
            java.lang.String r1 = "lowerEndpoint (%s) > upperEndpoint (%s)"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r5, r8)
            if (r3 != 0) goto L53
            com.google.common.collect.BoundType r3 = com.google.common.collect.BoundType.OPEN
            if (r6 == r3) goto L49
            r5 = 1
            goto L4a
        L49:
            r5 = 0
        L4a:
            if (r9 == r3) goto L4d
            goto L4e
        L4d:
            r4 = 0
        L4e:
            r3 = r5 | r4
            com.google.common.base.Preconditions.checkArgument(r3)
        L53:
            return
    }

    public static <T> com.google.common.collect.GeneralRange<T> all(java.util.Comparator<? super T> r9) {
            com.google.common.collect.GeneralRange r8 = new com.google.common.collect.GeneralRange
            com.google.common.collect.BoundType r7 = com.google.common.collect.BoundType.OPEN
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r0 = r8
            r1 = r9
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static <T> com.google.common.collect.GeneralRange<T> downTo(java.util.Comparator<? super T> r9, @com.google.common.collect.ParametricNullness T r10, com.google.common.collect.BoundType r11) {
            com.google.common.collect.GeneralRange r8 = new com.google.common.collect.GeneralRange
            com.google.common.collect.BoundType r7 = com.google.common.collect.BoundType.OPEN
            r2 = 1
            r5 = 0
            r6 = 0
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static <T> com.google.common.collect.GeneralRange<T> upTo(java.util.Comparator<? super T> r9, @com.google.common.collect.ParametricNullness T r10, com.google.common.collect.BoundType r11) {
            com.google.common.collect.GeneralRange r8 = new com.google.common.collect.GeneralRange
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
            r2 = 0
            r3 = 0
            r5 = 1
            r0 = r8
            r1 = r9
            r6 = r10
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public final java.util.Comparator<? super T> comparator() {
            r1 = this;
            java.util.Comparator<? super T> r0 = r1.comparator
            return r0
    }

    public final boolean contains(@com.google.common.collect.ParametricNullness T r2) {
            r1 = this;
            boolean r0 = r1.tooLow(r2)
            if (r0 != 0) goto Le
            boolean r2 = r1.tooHigh(r2)
            if (r2 != 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.common.collect.GeneralRange
            r1 = 0
            if (r0 == 0) goto L46
            com.google.common.collect.GeneralRange r4 = (com.google.common.collect.GeneralRange) r4
            java.util.Comparator<? super T> r0 = r3.comparator
            java.util.Comparator<? super T> r2 = r4.comparator
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L46
            boolean r0 = r3.hasLowerBound
            boolean r2 = r4.hasLowerBound
            if (r0 != r2) goto L46
            boolean r0 = r3.hasUpperBound
            boolean r2 = r4.hasUpperBound
            if (r0 != r2) goto L46
            com.google.common.collect.BoundType r0 = r3.lowerBoundType
            com.google.common.collect.BoundType r2 = r4.lowerBoundType
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L46
            com.google.common.collect.BoundType r0 = r3.upperBoundType
            com.google.common.collect.BoundType r2 = r4.upperBoundType
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L46
            T r0 = r3.lowerEndpoint
            T r2 = r4.lowerEndpoint
            boolean r0 = com.google.common.base.Objects.equal(r0, r2)
            if (r0 == 0) goto L46
            T r0 = r3.upperEndpoint
            T r4 = r4.upperEndpoint
            boolean r4 = com.google.common.base.Objects.equal(r0, r4)
            if (r4 == 0) goto L46
            r1 = 1
        L46:
            return r1
    }

    public final com.google.common.collect.BoundType getLowerBoundType() {
            r1 = this;
            com.google.common.collect.BoundType r0 = r1.lowerBoundType
            return r0
    }

    @javax.annotation.CheckForNull
    public final T getLowerEndpoint() {
            r1 = this;
            T r0 = r1.lowerEndpoint
            return r0
    }

    public final com.google.common.collect.BoundType getUpperBoundType() {
            r1 = this;
            com.google.common.collect.BoundType r0 = r1.upperBoundType
            return r0
    }

    @javax.annotation.CheckForNull
    public final T getUpperEndpoint() {
            r1 = this;
            T r0 = r1.upperEndpoint
            return r0
    }

    public final boolean hasLowerBound() {
            r1 = this;
            boolean r0 = r1.hasLowerBound
            return r0
    }

    public final boolean hasUpperBound() {
            r1 = this;
            boolean r0 = r1.hasUpperBound
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.Comparator<? super T> r1 = r3.comparator
            r2 = 0
            r0[r2] = r1
            T r1 = r3.lowerEndpoint
            r2 = 1
            r0[r2] = r1
            r1 = 2
            com.google.common.collect.BoundType r2 = r3.lowerBoundType
            r0[r1] = r2
            r1 = 3
            T r2 = r3.upperEndpoint
            r0[r1] = r2
            r1 = 4
            com.google.common.collect.BoundType r2 = r3.upperBoundType
            r0[r1] = r2
            int r0 = com.google.common.base.Objects.hashCode(r0)
            return r0
    }

    public final com.google.common.collect.GeneralRange<T> intersect(com.google.common.collect.GeneralRange<T> r12) {
            r11 = this;
            com.google.common.base.Preconditions.checkNotNull(r12)
            java.util.Comparator<? super T> r0 = r11.comparator
            java.util.Comparator<? super T> r1 = r12.comparator
            boolean r0 = r0.equals(r1)
            com.google.common.base.Preconditions.checkArgument(r0)
            boolean r0 = r11.hasLowerBound
            T r1 = r11.lowerEndpoint
            com.google.common.collect.BoundType r2 = r11.lowerBoundType
            if (r0 != 0) goto L1d
            boolean r0 = r12.hasLowerBound
            T r1 = r12.lowerEndpoint
            com.google.common.collect.BoundType r2 = r12.lowerBoundType
            goto L37
        L1d:
            boolean r3 = r12.hasLowerBound
            if (r3 == 0) goto L37
            java.util.Comparator<? super T> r3 = r11.comparator
            T r4 = r12.lowerEndpoint
            int r3 = r3.compare(r1, r4)
            if (r3 < 0) goto L33
            if (r3 != 0) goto L37
            com.google.common.collect.BoundType r3 = r12.lowerBoundType
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
            if (r3 != r4) goto L37
        L33:
            T r1 = r12.lowerEndpoint
            com.google.common.collect.BoundType r2 = r12.lowerBoundType
        L37:
            r5 = r0
            boolean r0 = r11.hasUpperBound
            T r3 = r11.upperEndpoint
            com.google.common.collect.BoundType r4 = r11.upperBoundType
            if (r0 != 0) goto L47
            boolean r0 = r12.hasUpperBound
            T r3 = r12.upperEndpoint
            com.google.common.collect.BoundType r4 = r12.upperBoundType
            goto L61
        L47:
            boolean r6 = r12.hasUpperBound
            if (r6 == 0) goto L61
            java.util.Comparator<? super T> r6 = r11.comparator
            T r7 = r12.upperEndpoint
            int r6 = r6.compare(r3, r7)
            if (r6 > 0) goto L5d
            if (r6 != 0) goto L61
            com.google.common.collect.BoundType r6 = r12.upperBoundType
            com.google.common.collect.BoundType r7 = com.google.common.collect.BoundType.OPEN
            if (r6 != r7) goto L61
        L5d:
            T r3 = r12.upperEndpoint
            com.google.common.collect.BoundType r4 = r12.upperBoundType
        L61:
            r8 = r0
            r9 = r3
            if (r5 == 0) goto L7f
            if (r8 == 0) goto L7f
            java.util.Comparator<? super T> r12 = r11.comparator
            int r12 = r12.compare(r1, r9)
            if (r12 > 0) goto L77
            if (r12 != 0) goto L7f
            com.google.common.collect.BoundType r12 = com.google.common.collect.BoundType.OPEN
            if (r2 != r12) goto L7f
            if (r4 != r12) goto L7f
        L77:
            com.google.common.collect.BoundType r12 = com.google.common.collect.BoundType.OPEN
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.CLOSED
            r7 = r12
            r10 = r0
            r6 = r9
            goto L82
        L7f:
            r6 = r1
            r7 = r2
            r10 = r4
        L82:
            com.google.common.collect.GeneralRange r12 = new com.google.common.collect.GeneralRange
            java.util.Comparator<? super T> r4 = r11.comparator
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    public java.lang.String toString() {
            r7 = this;
            java.util.Comparator<? super T> r0 = r7.comparator
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.google.common.collect.BoundType r1 = r7.lowerBoundType
            com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.CLOSED
            if (r1 != r2) goto Lf
            r1 = 91
            goto L11
        Lf:
            r1 = 40
        L11:
            boolean r3 = r7.hasLowerBound
            if (r3 == 0) goto L18
            T r3 = r7.lowerEndpoint
            goto L1a
        L18:
            java.lang.String r3 = "-∞"
        L1a:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            boolean r4 = r7.hasUpperBound
            if (r4 == 0) goto L25
            T r4 = r7.upperEndpoint
            goto L27
        L25:
            java.lang.String r4 = "∞"
        L27:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            com.google.common.collect.BoundType r5 = r7.upperBoundType
            if (r5 != r2) goto L32
            r2 = 93
            goto L34
        L32:
            r2 = 41
        L34:
            int r5 = r0.length()
            int r5 = r5 + 4
            int r6 = r3.length()
            int r6 = r6 + r5
            int r5 = r4.length()
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r6.append(r0)
            java.lang.String r0 = ":"
            r6.append(r0)
            r6.append(r1)
            r6.append(r3)
            r0 = 44
            r6.append(r0)
            r6.append(r4)
            r6.append(r2)
            java.lang.String r0 = r6.toString()
            return r0
    }

    public final boolean tooHigh(@com.google.common.collect.ParametricNullness T r6) {
            r5 = this;
            boolean r0 = r5.hasUpperBound
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            T r0 = r5.upperEndpoint
            java.util.Comparator<? super T> r2 = r5.comparator
            int r6 = r2.compare(r6, r0)
            r0 = 1
            if (r6 <= 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            if (r6 != 0) goto L18
            r6 = 1
            goto L19
        L18:
            r6 = 0
        L19:
            com.google.common.collect.BoundType r3 = r5.upperBoundType
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
            if (r3 != r4) goto L20
            r1 = 1
        L20:
            r6 = r6 & r1
            r6 = r6 | r2
            return r6
    }

    public final boolean tooLow(@com.google.common.collect.ParametricNullness T r6) {
            r5 = this;
            boolean r0 = r5.hasLowerBound
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            T r0 = r5.lowerEndpoint
            java.util.Comparator<? super T> r2 = r5.comparator
            int r6 = r2.compare(r6, r0)
            r0 = 1
            if (r6 >= 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            if (r6 != 0) goto L18
            r6 = 1
            goto L19
        L18:
            r6 = 0
        L19:
            com.google.common.collect.BoundType r3 = r5.lowerBoundType
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
            if (r3 != r4) goto L20
            r1 = 1
        L20:
            r6 = r6 & r1
            r6 = r6 | r2
            return r6
    }
}
