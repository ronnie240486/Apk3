package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class ViewingConditions {
    public static final com.google.android.material.color.utilities.ViewingConditions DEFAULT = null;
    private final double aw;
    private final double c;
    private final double fl;
    private final double flRoot;
    private final double n;
    private final double nbb;
    private final double nc;
    private final double ncb;
    private final double[] rgbD;
    private final double z;

    static {
            r0 = 3
            double[] r1 = new double[r0]
            double[] r2 = com.google.android.material.color.utilities.ColorUtils.whitePointD65()
            r3 = 0
            r4 = r2[r3]
            r1[r3] = r4
            double[] r2 = com.google.android.material.color.utilities.ColorUtils.whitePointD65()
            r4 = 1
            r5 = r2[r4]
            r1[r4] = r5
            double[] r2 = com.google.android.material.color.utilities.ColorUtils.whitePointD65()
            r5 = 2
            r6 = r2[r5]
            r1[r5] = r6
            r6 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r8 = com.google.android.material.color.utilities.ColorUtils.yFromLstar(r6)
            r10 = 4634156444089534796(0x404fd4bbab8b494c, double:63.66197723675813)
            double r8 = r8 * r10
            r10 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r8 = r8 / r10
            double[][] r2 = com.google.android.material.color.utilities.Cam16.XYZ_TO_CAM16RGB
            r12 = r1[r3]
            r14 = r2[r3]
            r15 = r14[r3]
            double r12 = r12 * r15
            r14 = r1[r4]
            r16 = r2[r3]
            r17 = r16[r4]
            double r14 = r14 * r17
            double r14 = r14 + r12
            r12 = r1[r5]
            r16 = r2[r3]
            r17 = r16[r5]
            double r12 = r12 * r17
            double r12 = r12 + r14
            r14 = r1[r3]
            r16 = r2[r4]
            r17 = r16[r3]
            double r14 = r14 * r17
            r16 = r1[r4]
            r18 = r2[r4]
            r19 = r18[r4]
            double r16 = r16 * r19
            double r16 = r16 + r14
            r14 = r1[r5]
            r18 = r2[r4]
            r19 = r18[r5]
            double r14 = r14 * r19
            double r14 = r14 + r16
            r16 = r1[r3]
            r18 = r2[r5]
            r19 = r18[r3]
            double r16 = r16 * r19
            r18 = r1[r4]
            r20 = r2[r5]
            r21 = r20[r4]
            double r18 = r18 * r21
            double r18 = r18 + r16
            r16 = r1[r5]
            r2 = r2[r5]
            r20 = r2[r5]
            double r16 = r16 * r20
            double r16 = r16 + r18
            r29 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r18 = 4603489467105573601(0x3fe2e147ae147ae1, double:0.59)
            r20 = 4604390187031047700(0x3fe6147ae147ae14, double:0.69)
            r22 = 4607182418800017406(0x3feffffffffffffe, double:0.9999999999999998)
            double r27 = com.google.android.material.color.utilities.MathUtils.lerp(r18, r20, r22)
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r20 = 4598675619503873138(0x3fd1c71c71c71c72, double:0.2777777777777778)
            double r6 = -r8
            r24 = 4631107791820423168(0x4045000000000000, double:42.0)
            double r6 = r6 - r24
            r24 = 4636174341401214976(0x4057000000000000, double:92.0)
            double r6 = r6 / r24
            double r6 = java.lang.Math.exp(r6)
            double r6 = r6 * r20
            double r6 = r18 - r6
            double r35 = r6 * r29
            r31 = 0
            r33 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = com.google.android.material.color.utilities.MathUtils.clampDouble(r31, r33, r35)
            double[] r2 = new double[r0]
            r31 = r2
            double r20 = r10 / r12
            double r20 = r20 * r6
            double r20 = r20 + r18
            double r20 = r20 - r6
            r2[r3] = r20
            double r20 = r10 / r14
            double r20 = r20 * r6
            double r20 = r20 + r18
            double r20 = r20 - r6
            r2[r4] = r20
            double r20 = r10 / r16
            double r20 = r20 * r6
            double r20 = r20 + r18
            double r20 = r20 - r6
            r2[r5] = r20
            r6 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r6 = r6 * r8
            double r20 = r6 + r18
            double r20 = r18 / r20
            double r24 = r20 * r20
            double r24 = r24 * r20
            double r24 = r24 * r20
            double r18 = r18 - r24
            double r24 = r24 * r8
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r8 = r8 * r18
            double r8 = r8 * r18
            double r6 = java.lang.Math.cbrt(r6)
            double r6 = r6 * r8
            double r6 = r6 + r24
            r32 = r6
            r8 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r8 = com.google.android.material.color.utilities.ColorUtils.yFromLstar(r8)
            r18 = r1[r4]
            double r8 = r8 / r18
            r19 = r8
            r21 = 4609344146621155246(0x3ff7ae147ae147ae, double:1.48)
            double r23 = java.lang.Math.sqrt(r8)
            double r36 = r23 + r21
            r21 = 4604705439004963635(0x3fe7333333333333, double:0.725)
            r4 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r4 = java.lang.Math.pow(r8, r4)
            double r21 = r21 / r4
            r23 = r21
            r25 = r21
            double[] r4 = new double[r0]
            r8 = r2[r3]
            double r8 = r8 * r6
            double r8 = r8 * r12
            double r8 = r8 / r10
            r12 = 4601237667291888353(0x3fdae147ae147ae1, double:0.42)
            double r8 = java.lang.Math.pow(r8, r12)
            r4[r3] = r8
            r1 = 1
            r8 = r2[r1]
            double r8 = r8 * r6
            double r8 = r8 * r14
            double r8 = r8 / r10
            double r8 = java.lang.Math.pow(r8, r12)
            r4[r1] = r8
            r5 = 2
            r8 = r2[r5]
            double r8 = r8 * r6
            double r8 = r8 * r16
            double r8 = r8 / r10
            double r8 = java.lang.Math.pow(r8, r12)
            r4[r5] = r8
            double[] r0 = new double[r0]
            r8 = r4[r3]
            r10 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r8 = r8 * r10
            r12 = r4[r3]
            r14 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r12 = r12 + r14
            double r8 = r8 / r12
            r0[r3] = r8
            r1 = 1
            r8 = r4[r1]
            double r8 = r8 * r10
            r12 = r4[r1]
            double r12 = r12 + r14
            double r8 = r8 / r12
            r0[r1] = r8
            r2 = 2
            r8 = r4[r2]
            double r8 = r8 * r10
            r10 = r4[r2]
            double r10 = r10 + r14
            double r8 = r8 / r10
            r0[r2] = r8
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            r8 = r0[r3]
            double r8 = r8 * r4
            r3 = r0[r1]
            double r8 = r8 + r3
            r3 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            r1 = r0[r2]
            double r1 = r1 * r3
            double r1 = r1 + r8
            double r21 = r21 * r1
            com.google.android.material.color.utilities.ViewingConditions r0 = new com.google.android.material.color.utilities.ViewingConditions
            r18 = r0
            r1 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r34 = java.lang.Math.pow(r6, r1)
            r18.<init>(r19, r21, r23, r25, r27, r29, r31, r32, r34, r36)
            com.google.android.material.color.utilities.ViewingConditions.DEFAULT = r0
            return
    }

    private ViewingConditions(double r4, double r6, double r8, double r10, double r12, double r14, double[] r16, double r17, double r19, double r21) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.n = r1
            r1 = r6
            r0.aw = r1
            r1 = r8
            r0.nbb = r1
            r1 = r10
            r0.ncb = r1
            r1 = r12
            r0.c = r1
            r1 = r14
            r0.nc = r1
            r1 = r16
            r0.rgbD = r1
            r1 = r17
            r0.fl = r1
            r1 = r19
            r0.flRoot = r1
            r1 = r21
            r0.z = r1
            return
    }

    public double getAw() {
            r2 = this;
            double r0 = r2.aw
            return r0
    }

    public final double getC() {
            r2 = this;
            double r0 = r2.c
            return r0
    }

    public final double getFl() {
            r2 = this;
            double r0 = r2.fl
            return r0
    }

    public double getFlRoot() {
            r2 = this;
            double r0 = r2.flRoot
            return r0
    }

    public double getN() {
            r2 = this;
            double r0 = r2.n
            return r0
    }

    public double getNbb() {
            r2 = this;
            double r0 = r2.nbb
            return r0
    }

    public final double getNc() {
            r2 = this;
            double r0 = r2.nc
            return r0
    }

    public final double getNcb() {
            r2 = this;
            double r0 = r2.ncb
            return r0
    }

    public double[] getRgbD() {
            r1 = this;
            double[] r0 = r1.rgbD
            return r0
    }

    public final double getZ() {
            r2 = this;
            double r0 = r2.z
            return r0
    }
}
