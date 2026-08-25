package com.google.common.math;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
final class DoubleUtils {
    private DoubleUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static double bigToDouble(java.math.BigInteger r14) {
            java.math.BigInteger r0 = r14.abs()
            int r1 = r0.bitLength()
            r2 = 1
            int r1 = r1 - r2
            r3 = 63
            if (r1 >= r3) goto L14
            long r0 = r14.longValue()
            double r0 = (double) r0
            return r0
        L14:
            r3 = 1023(0x3ff, float:1.434E-42)
            if (r1 <= r3) goto L22
            int r14 = r14.signum()
            double r0 = (double) r14
            r2 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            double r0 = r0 * r2
            return r0
        L22:
            int r4 = r1 + (-52)
            int r4 = r4 - r2
            java.math.BigInteger r5 = r0.shiftRight(r4)
            long r5 = r5.longValue()
            long r7 = r5 >> r2
            r9 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r7 = r7 & r9
            r9 = 1
            long r5 = r5 & r9
            r11 = 0
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 == 0) goto L4b
            long r5 = r7 & r9
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 != 0) goto L4c
            int r0 = r0.getLowestSetBit()
            if (r0 >= r4) goto L4b
            goto L4c
        L4b:
            r2 = 0
        L4c:
            if (r2 == 0) goto L4f
            long r7 = r7 + r9
        L4f:
            int r1 = r1 + r3
            long r0 = (long) r1
            r2 = 52
            long r0 = r0 << r2
            long r0 = r0 + r7
            int r14 = r14.signum()
            long r2 = (long) r14
            r4 = -9223372036854775808
            long r2 = r2 & r4
            long r0 = r0 | r2
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    public static double ensureNonNegative(double r2) {
            boolean r0 = java.lang.Double.isNaN(r2)
            r0 = r0 ^ 1
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = 0
            double r2 = java.lang.Math.max(r2, r0)
            return r2
    }

    public static long getSignificand(double r3) {
            boolean r0 = isFinite(r3)
            java.lang.String r1 = "not a normal value"
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            int r0 = java.lang.Math.getExponent(r3)
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            r1 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r3 = r3 & r1
            r1 = -1023(0xfffffffffffffc01, float:NaN)
            if (r0 != r1) goto L1e
            r0 = 1
            long r3 = r3 << r0
            goto L21
        L1e:
            r0 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r3 = r3 | r0
        L21:
            return r3
    }

    public static boolean isFinite(double r0) {
            int r0 = java.lang.Math.getExponent(r0)
            r1 = 1023(0x3ff, float:1.434E-42)
            if (r0 > r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public static double nextDown(double r0) {
            double r0 = -r0
            double r0 = java.lang.Math.nextUp(r0)
            double r0 = -r0
            return r0
    }
}
