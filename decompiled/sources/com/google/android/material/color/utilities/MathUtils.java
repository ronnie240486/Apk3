package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class MathUtils {
    private MathUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static double clampDouble(double r1, double r3, double r5) {
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r1
        L5:
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto La
            return r3
        La:
            return r5
    }

    public static int clampInt(int r0, int r1, int r2) {
            if (r2 >= r0) goto L3
            return r0
        L3:
            if (r2 <= r1) goto L6
            return r1
        L6:
            return r2
    }

    public static double differenceDegrees(double r0, double r2) {
            double r0 = r0 - r2
            double r0 = java.lang.Math.abs(r0)
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r0 = r0 - r2
            double r0 = java.lang.Math.abs(r0)
            double r2 = r2 - r0
            return r2
    }

    public static double lerp(double r2, double r4, double r6) {
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r6
            double r0 = r0 * r2
            double r6 = r6 * r4
            double r6 = r6 + r0
            return r6
    }

    public static double[] matrixMultiply(double[] r14, double[][] r15) {
            r0 = 0
            r1 = r14[r0]
            r3 = r15[r0]
            r4 = r3[r0]
            double r1 = r1 * r4
            r3 = 1
            r4 = r14[r3]
            r6 = r15[r0]
            r7 = r6[r3]
            double r4 = r4 * r7
            double r4 = r4 + r1
            r1 = 2
            r6 = r14[r1]
            r2 = r15[r0]
            r8 = r2[r1]
            double r6 = r6 * r8
            double r6 = r6 + r4
            r4 = r14[r0]
            r2 = r15[r3]
            r8 = r2[r0]
            double r4 = r4 * r8
            r8 = r14[r3]
            r2 = r15[r3]
            r10 = r2[r3]
            double r8 = r8 * r10
            double r8 = r8 + r4
            r4 = r14[r1]
            r2 = r15[r3]
            r10 = r2[r1]
            double r4 = r4 * r10
            double r4 = r4 + r8
            r8 = r14[r0]
            r2 = r15[r1]
            r10 = r2[r0]
            double r8 = r8 * r10
            r10 = r14[r3]
            r2 = r15[r1]
            r12 = r2[r3]
            double r10 = r10 * r12
            double r10 = r10 + r8
            r8 = r14[r1]
            r14 = r15[r1]
            r12 = r14[r1]
            double r8 = r8 * r12
            double r8 = r8 + r10
            r14 = 3
            double[] r14 = new double[r14]
            r14[r0] = r6
            r14[r3] = r4
            r14[r1] = r8
            return r14
    }

    public static double rotationDirection(double r1, double r3) {
            double r3 = r3 - r1
            double r1 = sanitizeDegreesDouble(r3)
            r3 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L11
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L13
        L11:
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L13:
            return r1
    }

    public static double sanitizeDegreesDouble(double r5) {
            r0 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r5 = r5 % r0
            r2 = 0
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 >= 0) goto Ld
            double r5 = r5 + r0
        Ld:
            return r5
    }

    public static int sanitizeDegreesInt(int r0) {
            int r0 = r0 % 360
            if (r0 >= 0) goto L6
            int r0 = r0 + 360
        L6:
            return r0
    }

    public static int signum(double r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8
            r3 = -1
            return r3
        L8:
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto Le
            r3 = 0
            return r3
        Le:
            r3 = 1
            return r3
    }
}
