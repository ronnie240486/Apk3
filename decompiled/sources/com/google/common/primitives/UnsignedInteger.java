package com.google.common.primitives;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible(emulated = true)
public final class UnsignedInteger extends java.lang.Number implements java.lang.Comparable<com.google.common.primitives.UnsignedInteger> {
    public static final com.google.common.primitives.UnsignedInteger MAX_VALUE = null;
    public static final com.google.common.primitives.UnsignedInteger ONE = null;
    public static final com.google.common.primitives.UnsignedInteger ZERO = null;
    private final int value;

    static {
            r0 = 0
            com.google.common.primitives.UnsignedInteger r0 = fromIntBits(r0)
            com.google.common.primitives.UnsignedInteger.ZERO = r0
            r0 = 1
            com.google.common.primitives.UnsignedInteger r0 = fromIntBits(r0)
            com.google.common.primitives.UnsignedInteger.ONE = r0
            r0 = -1
            com.google.common.primitives.UnsignedInteger r0 = fromIntBits(r0)
            com.google.common.primitives.UnsignedInteger.MAX_VALUE = r0
            return
    }

    private UnsignedInteger(int r1) {
            r0 = this;
            r0.<init>()
            r1 = r1 & (-1)
            r0.value = r1
            return
    }

    public static com.google.common.primitives.UnsignedInteger fromIntBits(int r1) {
            com.google.common.primitives.UnsignedInteger r0 = new com.google.common.primitives.UnsignedInteger
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.primitives.UnsignedInteger valueOf(long r3) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.lang.String r1 = "value (%s) is outside the range for an unsigned integer value"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
            int r4 = (int) r3
            com.google.common.primitives.UnsignedInteger r3 = fromIntBits(r4)
            return r3
    }

    public static com.google.common.primitives.UnsignedInteger valueOf(java.lang.String r1) {
            r0 = 10
            com.google.common.primitives.UnsignedInteger r1 = valueOf(r1, r0)
            return r1
    }

    public static com.google.common.primitives.UnsignedInteger valueOf(java.lang.String r0, int r1) {
            int r0 = com.google.common.primitives.UnsignedInts.parseUnsignedInt(r0, r1)
            com.google.common.primitives.UnsignedInteger r0 = fromIntBits(r0)
            return r0
    }

    public static com.google.common.primitives.UnsignedInteger valueOf(java.math.BigInteger r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.signum()
            if (r0 < 0) goto L13
            int r0 = r2.bitLength()
            r1 = 32
            if (r0 > r1) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            java.lang.String r1 = "value (%s) is outside the range for an unsigned integer value"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2)
            int r2 = r2.intValue()
            com.google.common.primitives.UnsignedInteger r2 = fromIntBits(r2)
            return r2
    }

    public java.math.BigInteger bigIntegerValue() {
            r2 = this;
            long r0 = r2.longValue()
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.google.common.primitives.UnsignedInteger r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r1.value
            int r2 = r2.value
            int r2 = com.google.common.primitives.UnsignedInts.compare(r0, r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.google.common.primitives.UnsignedInteger r1) {
            r0 = this;
            com.google.common.primitives.UnsignedInteger r1 = (com.google.common.primitives.UnsignedInteger) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public com.google.common.primitives.UnsignedInteger dividedBy(com.google.common.primitives.UnsignedInteger r2) {
            r1 = this;
            int r0 = r1.value
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.primitives.UnsignedInteger r2 = (com.google.common.primitives.UnsignedInteger) r2
            int r2 = r2.value
            int r2 = com.google.common.primitives.UnsignedInts.divide(r0, r2)
            com.google.common.primitives.UnsignedInteger r2 = fromIntBits(r2)
            return r2
    }

    @Override // java.lang.Number
    public double doubleValue() {
            r2 = this;
            long r0 = r2.longValue()
            double r0 = (double) r0
            return r0
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.common.primitives.UnsignedInteger
            r1 = 0
            if (r0 == 0) goto Le
            com.google.common.primitives.UnsignedInteger r3 = (com.google.common.primitives.UnsignedInteger) r3
            int r0 = r2.value
            int r3 = r3.value
            if (r0 != r3) goto Le
            r1 = 1
        Le:
            return r1
    }

    @Override // java.lang.Number
    public float floatValue() {
            r2 = this;
            long r0 = r2.longValue()
            float r0 = (float) r0
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.value
            return r0
    }

    @Override // java.lang.Number
    public int intValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }

    @Override // java.lang.Number
    public long longValue() {
            r2 = this;
            int r0 = r2.value
            long r0 = com.google.common.primitives.UnsignedInts.toLong(r0)
            return r0
    }

    public com.google.common.primitives.UnsignedInteger minus(com.google.common.primitives.UnsignedInteger r2) {
            r1 = this;
            int r0 = r1.value
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.primitives.UnsignedInteger r2 = (com.google.common.primitives.UnsignedInteger) r2
            int r2 = r2.value
            int r0 = r0 - r2
            com.google.common.primitives.UnsignedInteger r2 = fromIntBits(r0)
            return r2
    }

    public com.google.common.primitives.UnsignedInteger mod(com.google.common.primitives.UnsignedInteger r2) {
            r1 = this;
            int r0 = r1.value
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.primitives.UnsignedInteger r2 = (com.google.common.primitives.UnsignedInteger) r2
            int r2 = r2.value
            int r2 = com.google.common.primitives.UnsignedInts.remainder(r0, r2)
            com.google.common.primitives.UnsignedInteger r2 = fromIntBits(r2)
            return r2
    }

    public com.google.common.primitives.UnsignedInteger plus(com.google.common.primitives.UnsignedInteger r2) {
            r1 = this;
            int r0 = r1.value
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.primitives.UnsignedInteger r2 = (com.google.common.primitives.UnsignedInteger) r2
            int r2 = r2.value
            int r0 = r0 + r2
            com.google.common.primitives.UnsignedInteger r2 = fromIntBits(r0)
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    public com.google.common.primitives.UnsignedInteger times(com.google.common.primitives.UnsignedInteger r2) {
            r1 = this;
            int r0 = r1.value
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.primitives.UnsignedInteger r2 = (com.google.common.primitives.UnsignedInteger) r2
            int r2 = r2.value
            int r0 = r0 * r2
            com.google.common.primitives.UnsignedInteger r2 = fromIntBits(r0)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            r0 = 10
            java.lang.String r0 = r1.toString(r0)
            return r0
    }

    public java.lang.String toString(int r2) {
            r1 = this;
            int r0 = r1.value
            java.lang.String r2 = com.google.common.primitives.UnsignedInts.toString(r0, r2)
            return r2
    }
}
