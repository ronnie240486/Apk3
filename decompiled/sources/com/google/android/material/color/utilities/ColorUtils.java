package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class ColorUtils {
    public static final double[][] SRGB_TO_XYZ = null;
    public static final double[] WHITE_POINT_D65 = null;
    public static final double[][] XYZ_TO_SRGB = null;

    static {
            r0 = 3
            double[][] r1 = new double[r0][]
            double[] r2 = new double[r0]
            r2 = {x003e: FILL_ARRAY_DATA , data: [4601099658084187286, 4600113940642081913, 4595671593572523358} // fill-array
            r3 = 0
            r1[r3] = r2
            double[] r2 = new double[r0]
            r2 = {x004e: FILL_ARRAY_DATA , data: [4596827742536767164, 4604617168452267173, 4589866978952703325} // fill-array
            r4 = 1
            r1[r4] = r2
            double[] r2 = new double[r0]
            r2 = {x005e: FILL_ARRAY_DATA , data: [4581226238680505381, 4593251078828733646, 4606735164339439408} // fill-array
            r5 = 2
            r1[r5] = r2
            com.google.android.material.color.utilities.ColorUtils.SRGB_TO_XYZ = r1
            double[][] r1 = new double[r0][]
            double[] r2 = new double[r0]
            r2 = {x006e: FILL_ARRAY_DATA , data: [4614481352003851051, -4613768189078959972, -4620713868155266156} // fill-array
            r1[r3] = r2
            double[] r2 = new double[r0]
            r2 = {x007e: FILL_ARRAY_DATA , data: [-4616467532924249468, 4611127055713859613, 4586151092215141223} // fill-array
            r1[r4] = r2
            double[] r2 = new double[r0]
            r2 = {x008e: FILL_ARRAY_DATA , data: [4588176642817648367, -4626855754417856510, 4607439934226439676} // fill-array
            r1[r5] = r2
            com.google.android.material.color.utilities.ColorUtils.XYZ_TO_SRGB = r1
            double[] r0 = new double[r0]
            r0 = {x009e: FILL_ARRAY_DATA , data: [4636388754964724318, 4636737291354636288, 4637362376909166477} // fill-array
            com.google.android.material.color.utilities.ColorUtils.WHITE_POINT_D65 = r0
            return
    }

    private ColorUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int alphaFromArgb(int r0) {
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    public static int argbFromLab(double r9, double r11, double r13) {
            double[] r0 = com.google.android.material.color.utilities.ColorUtils.WHITE_POINT_D65
            r1 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r9 = r9 + r1
            r1 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r9 = r9 / r1
            r1 = 4647503709213818880(0x407f400000000000, double:500.0)
            double r11 = r11 / r1
            double r11 = r11 + r9
            r1 = 4641240890982006784(0x4069000000000000, double:200.0)
            double r13 = r13 / r1
            double r13 = r9 - r13
            double r11 = labInvf(r11)
            double r9 = labInvf(r9)
            double r13 = labInvf(r13)
            r1 = 0
            r1 = r0[r1]
            double r3 = r11 * r1
            r11 = 1
            r11 = r0[r11]
            double r5 = r9 * r11
            r9 = 2
            r9 = r0[r9]
            double r7 = r13 * r9
            int r9 = argbFromXyz(r3, r5, r7)
            return r9
    }

    public static int argbFromLinrgb(double[] r4) {
            r0 = 0
            r0 = r4[r0]
            int r0 = delinearized(r0)
            r1 = 1
            r1 = r4[r1]
            int r1 = delinearized(r1)
            r2 = 2
            r2 = r4[r2]
            int r4 = delinearized(r2)
            int r4 = argbFromRgb(r0, r1, r4)
            return r4
    }

    public static int argbFromLstar(double r0) {
            double r0 = yFromLstar(r0)
            int r0 = delinearized(r0)
            int r0 = argbFromRgb(r0, r0, r0)
            return r0
    }

    public static int argbFromRgb(int r1, int r2, int r3) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 | r0
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            r2 = r3 & 255(0xff, float:3.57E-43)
            r1 = r1 | r2
            return r1
    }

    public static int argbFromXyz(double r12, double r14, double r16) {
            double[][] r0 = com.google.android.material.color.utilities.ColorUtils.XYZ_TO_SRGB
            r1 = 0
            r2 = r0[r1]
            r3 = r2[r1]
            double r3 = r3 * r12
            r2 = r0[r1]
            r5 = 1
            r6 = r2[r5]
            double r6 = r6 * r14
            double r6 = r6 + r3
            r2 = r0[r1]
            r3 = 2
            r8 = r2[r3]
            double r8 = r8 * r16
            double r8 = r8 + r6
            r2 = r0[r5]
            r6 = r2[r1]
            double r6 = r6 * r12
            r2 = r0[r5]
            r10 = r2[r5]
            double r10 = r10 * r14
            double r10 = r10 + r6
            r2 = r0[r5]
            r6 = r2[r3]
            double r6 = r6 * r16
            double r6 = r6 + r10
            r2 = r0[r3]
            r1 = r2[r1]
            double r1 = r1 * r12
            r4 = r0[r3]
            r10 = r4[r5]
            double r10 = r10 * r14
            double r10 = r10 + r1
            r0 = r0[r3]
            r1 = r0[r3]
            double r1 = r1 * r16
            double r1 = r1 + r10
            int r0 = delinearized(r8)
            int r3 = delinearized(r6)
            int r1 = delinearized(r1)
            int r0 = argbFromRgb(r0, r3, r1)
            return r0
    }

    public static int blueFromArgb(int r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    public static int delinearized(double r4) {
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 / r0
            r0 = 4569365555819558681(0x3f69a5c37387b719, double:0.0031308)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L14
            r0 = 4623462931452961751(0x4029d70a3d70a3d7, double:12.92)
            double r4 = r4 * r0
            goto L2a
        L14:
            r0 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            r2 = 4601177619296856747(0x3fdaaaaaaaaaaaab, double:0.4166666666666667)
            double r4 = java.lang.Math.pow(r4, r2)
            double r4 = r4 * r0
            r0 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            double r4 = r4 - r0
        L2a:
            r0 = 0
            r1 = 255(0xff, float:3.57E-43)
            r2 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r4 = r4 * r2
            long r4 = java.lang.Math.round(r4)
            int r5 = (int) r4
            int r4 = com.google.android.material.color.utilities.MathUtils.clampInt(r0, r1, r5)
            return r4
    }

    public static int greenFromArgb(int r0) {
            int r0 = r0 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    public static boolean isOpaque(int r1) {
            int r1 = alphaFromArgb(r1)
            r0 = 255(0xff, float:3.57E-43)
            if (r1 < r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public static double labF(double r3) {
            r0 = 4576259018578689238(0x3f822354d28f7cd6, double:0.008856451679035631)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L13
            r0 = 4599676419421066581(0x3fd5555555555555, double:0.3333333333333333)
            double r3 = java.lang.Math.pow(r3, r0)
            return r3
        L13:
            r0 = 4651156694067819558(0x408c3a5ed097b426, double:903.2962962962963)
            double r3 = r3 * r0
            r0 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r3 = r3 + r0
            r0 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r3 = r3 / r0
            return r3
    }

    public static double[] labFromArgb(int r20) {
            int r0 = redFromArgb(r20)
            double r0 = linearized(r0)
            int r2 = greenFromArgb(r20)
            double r2 = linearized(r2)
            int r4 = blueFromArgb(r20)
            double r4 = linearized(r4)
            double[][] r6 = com.google.android.material.color.utilities.ColorUtils.SRGB_TO_XYZ
            r7 = 0
            r8 = r6[r7]
            r9 = r8[r7]
            double r9 = r9 * r0
            r8 = r6[r7]
            r11 = 1
            r12 = r8[r11]
            double r12 = r12 * r2
            double r12 = r12 + r9
            r8 = r6[r7]
            r9 = 2
            r14 = r8[r9]
            double r14 = r14 * r4
            double r14 = r14 + r12
            r8 = r6[r11]
            r12 = r8[r7]
            double r12 = r12 * r0
            r8 = r6[r11]
            r16 = r8[r11]
            double r16 = r16 * r2
            double r16 = r16 + r12
            r8 = r6[r11]
            r12 = r8[r9]
            double r12 = r12 * r4
            double r12 = r12 + r16
            r8 = r6[r9]
            r16 = r8[r7]
            double r16 = r16 * r0
            r0 = r6[r9]
            r18 = r0[r11]
            double r18 = r18 * r2
            double r18 = r18 + r16
            r0 = r6[r9]
            r1 = r0[r9]
            double r1 = r1 * r4
            double r1 = r1 + r18
            double[] r0 = com.google.android.material.color.utilities.ColorUtils.WHITE_POINT_D65
            r3 = r0[r7]
            double r14 = r14 / r3
            r3 = r0[r11]
            double r12 = r12 / r3
            r3 = r0[r9]
            double r1 = r1 / r3
            double r3 = labF(r14)
            double r5 = labF(r12)
            double r0 = labF(r1)
            r12 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r12 = r12 * r5
            r14 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r12 = r12 - r14
            double r3 = r3 - r5
            r14 = 4647503709213818880(0x407f400000000000, double:500.0)
            double r3 = r3 * r14
            double r5 = r5 - r0
            r0 = 4641240890982006784(0x4069000000000000, double:200.0)
            double r5 = r5 * r0
            r0 = 3
            double[] r0 = new double[r0]
            r0[r7] = r12
            r0[r11] = r3
            r0[r9] = r5
            return r0
    }

    public static double labInvf(double r5) {
            double r0 = r5 * r5
            double r0 = r0 * r5
            r2 = 4576259018578689238(0x3f822354d28f7cd6, double:0.008856451679035631)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Le
            return r0
        Le:
            r0 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r5 = r5 * r0
            r0 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r5 = r5 - r0
            r0 = 4651156694067819558(0x408c3a5ed097b426, double:903.2962962962963)
            double r5 = r5 / r0
            return r5
    }

    public static double linearized(int r6) {
            double r0 = (double) r6
            r2 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r0 = r0 / r2
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            r4 = 4585990271170090765(0x3fa4b5daa07d970d, double:0.040449936)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L1b
            r4 = 4623462931452961751(0x4029d70a3d70a3d7, double:12.92)
            double r0 = r0 / r4
        L18:
            double r0 = r0 * r2
            return r0
        L1b:
            r4 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            double r0 = r0 + r4
            r4 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            double r0 = r0 / r4
            r4 = 4612586738352862003(0x4003333333333333, double:2.4)
            double r0 = java.lang.Math.pow(r0, r4)
            goto L18
    }

    public static double lstarFromArgb(int r4) {
            double[] r4 = xyzFromArgb(r4)
            r0 = 1
            r0 = r4[r0]
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 / r2
            double r0 = labF(r0)
            r2 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r0 = r0 * r2
            r2 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r0 = r0 - r2
            return r0
    }

    public static int redFromArgb(int r0) {
            int r0 = r0 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    public static double[] whitePointD65() {
            double[] r0 = com.google.android.material.color.utilities.ColorUtils.WHITE_POINT_D65
            return r0
    }

    public static double[] xyzFromArgb(int r7) {
            int r0 = redFromArgb(r7)
            double r0 = linearized(r0)
            int r2 = greenFromArgb(r7)
            double r2 = linearized(r2)
            int r7 = blueFromArgb(r7)
            double r4 = linearized(r7)
            r7 = 3
            double[] r7 = new double[r7]
            r6 = 0
            r7[r6] = r0
            r0 = 1
            r7[r0] = r2
            r0 = 2
            r7[r0] = r4
            double[][] r0 = com.google.android.material.color.utilities.ColorUtils.SRGB_TO_XYZ
            double[] r7 = com.google.android.material.color.utilities.MathUtils.matrixMultiply(r7, r0)
            return r7
    }

    public static double yFromLstar(double r2) {
            r0 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r2 = r2 + r0
            r0 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r2 = r2 / r0
            double r2 = labInvf(r2)
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r0
            return r2
    }
}
