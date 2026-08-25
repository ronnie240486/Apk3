package androidx.core.math;

/* JADX INFO: loaded from: classes.dex */
public class MathUtils {
    private MathUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int addExact(int r1, int r2) {
            int r0 = r1 + r2
            r1 = r1 ^ r0
            r2 = r2 ^ r0
            r1 = r1 & r2
            if (r1 < 0) goto L8
            return r0
        L8:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r2 = "integer overflow"
            r1.<init>(r2)
            throw r1
    }

    public static long addExact(long r3, long r5) {
            long r0 = r3 + r5
            long r3 = r3 ^ r0
            long r5 = r5 ^ r0
            long r3 = r3 & r5
            r5 = 0
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto Lc
            return r0
        Lc:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r4 = "long overflow"
            r3.<init>(r4)
            throw r3
    }

    public static double clamp(double r1, double r3, double r5) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r3
        L5:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto La
            return r5
        La:
            return r1
    }

    public static float clamp(float r1, float r2, float r3) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r2
        L5:
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 <= 0) goto La
            return r3
        La:
            return r1
    }

    public static int clamp(int r0, int r1, int r2) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            if (r0 <= r2) goto L6
            return r2
        L6:
            return r0
    }

    public static long clamp(long r1, long r3, long r5) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r3
        L5:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto La
            return r5
        La:
            return r1
    }

    public static int decrementExact(int r1) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L7
            int r1 = r1 + (-1)
            return r1
        L7:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "integer overflow"
            r1.<init>(r0)
            throw r1
    }

    public static long decrementExact(long r3) {
            r0 = -9223372036854775808
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto La
            r0 = 1
            long r3 = r3 - r0
            return r3
        La:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r4 = "long overflow"
            r3.<init>(r4)
            throw r3
    }

    public static int incrementExact(int r1) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L8
            int r1 = r1 + 1
            return r1
        L8:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "integer overflow"
            r1.<init>(r0)
            throw r1
    }

    public static long incrementExact(long r3) {
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto Ld
            r0 = 1
            long r3 = r3 + r0
            return r3
        Ld:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r4 = "long overflow"
            r3.<init>(r4)
            throw r3
    }

    public static int multiplyExact(int r4, int r5) {
            long r0 = (long) r4
            long r4 = (long) r5
            long r0 = r0 * r4
            int r4 = (int) r0
            long r2 = (long) r4
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 != 0) goto Lb
            return r4
        Lb:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "integer overflow"
            r4.<init>(r5)
            throw r4
    }

    public static long multiplyExact(long r7, long r9) {
            long r0 = r7 * r9
            long r2 = java.lang.Math.abs(r7)
            long r4 = java.lang.Math.abs(r9)
            long r2 = r2 | r4
            r4 = 31
            long r2 = r2 >>> r4
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L33
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 == 0) goto L1e
            long r2 = r0 / r9
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L2b
        L1e:
            r2 = -9223372036854775808
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 != 0) goto L33
            r7 = -1
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 == 0) goto L2b
            goto L33
        L2b:
            java.lang.ArithmeticException r7 = new java.lang.ArithmeticException
            java.lang.String r8 = "long overflow"
            r7.<init>(r8)
            throw r7
        L33:
            return r0
    }

    public static int negateExact(int r1) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L6
            int r1 = -r1
            return r1
        L6:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "integer overflow"
            r1.<init>(r0)
            throw r1
    }

    public static long negateExact(long r3) {
            r0 = -9223372036854775808
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L8
            long r3 = -r3
            return r3
        L8:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r4 = "long overflow"
            r3.<init>(r4)
            throw r3
    }

    public static int subtractExact(int r1, int r2) {
            int r0 = r1 - r2
            r2 = r2 ^ r1
            r1 = r1 ^ r0
            r1 = r1 & r2
            if (r1 < 0) goto L8
            return r0
        L8:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r2 = "integer overflow"
            r1.<init>(r2)
            throw r1
    }

    public static long subtractExact(long r3, long r5) {
            long r0 = r3 - r5
            long r5 = r5 ^ r3
            long r3 = r3 ^ r0
            long r3 = r3 & r5
            r5 = 0
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto Lc
            return r0
        Lc:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r4 = "long overflow"
            r3.<init>(r4)
            throw r3
    }

    public static int toIntExact(long r4) {
            int r0 = (int) r4
            long r1 = (long) r0
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 != 0) goto L7
            return r0
        L7:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "integer overflow"
            r4.<init>(r5)
            throw r4
    }
}
