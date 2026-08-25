package com.google.common.primitives;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible(serializable = true)
public final class UnsignedLong extends java.lang.Number implements java.lang.Comparable<com.google.common.primitives.UnsignedLong> {
    public static final com.google.common.primitives.UnsignedLong MAX_VALUE = null;
    public static final com.google.common.primitives.UnsignedLong ONE = null;
    private static final long UNSIGNED_MASK = Long.MAX_VALUE;
    public static final com.google.common.primitives.UnsignedLong ZERO = null;
    private final long value;

    static {
            com.google.common.primitives.UnsignedLong r0 = new com.google.common.primitives.UnsignedLong
            r1 = 0
            r0.<init>(r1)
            com.google.common.primitives.UnsignedLong.ZERO = r0
            com.google.common.primitives.UnsignedLong r0 = new com.google.common.primitives.UnsignedLong
            r1 = 1
            r0.<init>(r1)
            com.google.common.primitives.UnsignedLong.ONE = r0
            com.google.common.primitives.UnsignedLong r0 = new com.google.common.primitives.UnsignedLong
            r1 = -1
            r0.<init>(r1)
            com.google.common.primitives.UnsignedLong.MAX_VALUE = r0
            return
    }

    private UnsignedLong(long r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public static com.google.common.primitives.UnsignedLong fromLongBits(long r1) {
            com.google.common.primitives.UnsignedLong r0 = new com.google.common.primitives.UnsignedLong
            r0.<init>(r1)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static com.google.common.primitives.UnsignedLong valueOf(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            java.lang.String r1 = "value (%s) is outside the range for an unsigned long value"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
            com.google.common.primitives.UnsignedLong r3 = fromLongBits(r3)
            return r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static com.google.common.primitives.UnsignedLong valueOf(java.lang.String r1) {
            r0 = 10
            com.google.common.primitives.UnsignedLong r1 = valueOf(r1, r0)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static com.google.common.primitives.UnsignedLong valueOf(java.lang.String r0, int r1) {
            long r0 = com.google.common.primitives.UnsignedLongs.parseUnsignedLong(r0, r1)
            com.google.common.primitives.UnsignedLong r0 = fromLongBits(r0)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static com.google.common.primitives.UnsignedLong valueOf(java.math.BigInteger r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.signum()
            if (r0 < 0) goto L13
            int r0 = r2.bitLength()
            r1 = 64
            if (r0 > r1) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            java.lang.String r1 = "value (%s) is outside the range for an unsigned long value"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2)
            long r0 = r2.longValue()
            com.google.common.primitives.UnsignedLong r2 = fromLongBits(r0)
            return r2
    }

    public java.math.BigInteger bigIntegerValue() {
            r6 = this;
            long r0 = r6.value
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r0 = r0 & r2
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            long r1 = r6.value
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L1a
            r1 = 63
            java.math.BigInteger r0 = r0.setBit(r1)
        L1a:
            return r0
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.google.common.primitives.UnsignedLong r5) {
            r4 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            long r0 = r4.value
            long r2 = r5.value
            int r5 = com.google.common.primitives.UnsignedLongs.compare(r0, r2)
            return r5
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.google.common.primitives.UnsignedLong r1) {
            r0 = this;
            com.google.common.primitives.UnsignedLong r1 = (com.google.common.primitives.UnsignedLong) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public com.google.common.primitives.UnsignedLong dividedBy(com.google.common.primitives.UnsignedLong r5) {
            r4 = this;
            long r0 = r4.value
            java.lang.Object r5 = com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.primitives.UnsignedLong r5 = (com.google.common.primitives.UnsignedLong) r5
            long r2 = r5.value
            long r0 = com.google.common.primitives.UnsignedLongs.divide(r0, r2)
            com.google.common.primitives.UnsignedLong r5 = fromLongBits(r0)
            return r5
    }

    @Override // java.lang.Number
    public double doubleValue() {
            r6 = this;
            long r0 = r6.value
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto La
            double r0 = (double) r0
            return r0
        La:
            r2 = 1
            long r2 = r0 >>> r2
            r4 = 1
            long r0 = r0 & r4
            long r0 = r0 | r2
            double r0 = (double) r0
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 * r2
            return r0
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof com.google.common.primitives.UnsignedLong
            r1 = 0
            if (r0 == 0) goto L10
            com.google.common.primitives.UnsignedLong r7 = (com.google.common.primitives.UnsignedLong) r7
            long r2 = r6.value
            long r4 = r7.value
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L10
            r1 = 1
        L10:
            return r1
    }

    @Override // java.lang.Number
    public float floatValue() {
            r6 = this;
            long r0 = r6.value
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto La
            float r0 = (float) r0
            return r0
        La:
            r2 = 1
            long r2 = r0 >>> r2
            r4 = 1
            long r0 = r0 & r4
            long r0 = r0 | r2
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r1
            return r0
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.value
            int r0 = com.google.common.primitives.Longs.hashCode(r0)
            return r0
    }

    @Override // java.lang.Number
    public int intValue() {
            r2 = this;
            long r0 = r2.value
            int r1 = (int) r0
            return r1
    }

    @Override // java.lang.Number
    public long longValue() {
            r2 = this;
            long r0 = r2.value
            return r0
    }

    public com.google.common.primitives.UnsignedLong minus(com.google.common.primitives.UnsignedLong r5) {
            r4 = this;
            long r0 = r4.value
            java.lang.Object r5 = com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.primitives.UnsignedLong r5 = (com.google.common.primitives.UnsignedLong) r5
            long r2 = r5.value
            long r0 = r0 - r2
            com.google.common.primitives.UnsignedLong r5 = fromLongBits(r0)
            return r5
    }

    public com.google.common.primitives.UnsignedLong mod(com.google.common.primitives.UnsignedLong r5) {
            r4 = this;
            long r0 = r4.value
            java.lang.Object r5 = com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.primitives.UnsignedLong r5 = (com.google.common.primitives.UnsignedLong) r5
            long r2 = r5.value
            long r0 = com.google.common.primitives.UnsignedLongs.remainder(r0, r2)
            com.google.common.primitives.UnsignedLong r5 = fromLongBits(r0)
            return r5
    }

    public com.google.common.primitives.UnsignedLong plus(com.google.common.primitives.UnsignedLong r5) {
            r4 = this;
            long r0 = r4.value
            java.lang.Object r5 = com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.primitives.UnsignedLong r5 = (com.google.common.primitives.UnsignedLong) r5
            long r2 = r5.value
            long r0 = r0 + r2
            com.google.common.primitives.UnsignedLong r5 = fromLongBits(r0)
            return r5
    }

    public com.google.common.primitives.UnsignedLong times(com.google.common.primitives.UnsignedLong r5) {
            r4 = this;
            long r0 = r4.value
            java.lang.Object r5 = com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.primitives.UnsignedLong r5 = (com.google.common.primitives.UnsignedLong) r5
            long r2 = r5.value
            long r0 = r0 * r2
            com.google.common.primitives.UnsignedLong r5 = fromLongBits(r0)
            return r5
    }

    public java.lang.String toString() {
            r2 = this;
            long r0 = r2.value
            java.lang.String r0 = com.google.common.primitives.UnsignedLongs.toString(r0)
            return r0
    }

    public java.lang.String toString(int r3) {
            r2 = this;
            long r0 = r2.value
            java.lang.String r3 = com.google.common.primitives.UnsignedLongs.toString(r0, r3)
            return r3
    }
}
