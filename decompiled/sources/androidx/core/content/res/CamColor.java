package androidx.core.content.res;

/* JADX INFO: loaded from: classes3.dex */
class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;
    private final float mJ;
    private final float mJstar;
    private final float mM;
    private final float mQ;
    private final float mS;

    public CamColor(float r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9) {
            r0 = this;
            r0.<init>()
            r0.mHue = r1
            r0.mChroma = r2
            r0.mJ = r3
            r0.mQ = r4
            r0.mM = r5
            r0.mS = r6
            r0.mJstar = r7
            r0.mAstar = r8
            r0.mBstar = r9
            return
    }

    @androidx.annotation.Nullable
    private static androidx.core.content.res.CamColor findCamByJ(@androidx.annotation.FloatRange(from = 0.0d, to = 360.0d) float r19, @androidx.annotation.FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float r20, @androidx.annotation.FloatRange(from = 0.0d, to = 100.0d) float r21) {
            r0 = r19
            r1 = 1148846080(0x447a0000, float:1000.0)
            r2 = 1120403456(0x42c80000, float:100.0)
            r4 = 0
            r5 = r4
            r4 = 1148846080(0x447a0000, float:1000.0)
            r6 = 0
            r7 = 1120403456(0x42c80000, float:100.0)
        Ld:
            float r8 = r6 - r7
            float r8 = java.lang.Math.abs(r8)
            r9 = 1008981770(0x3c23d70a, float:0.01)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto Le5
            float r8 = r7 - r6
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            float r8 = r8 + r6
            r9 = r20
            androidx.core.content.res.CamColor r10 = fromJch(r8, r9, r0)
            java.util.Objects.requireNonNull(r10)
            androidx.core.content.res.ViewingConditions r11 = androidx.core.content.res.ViewingConditions.DEFAULT
            int r10 = r10.viewed(r11)
            int r11 = android.graphics.Color.red(r10)
            float r11 = androidx.core.content.res.CamUtils.linearized(r11)
            int r12 = android.graphics.Color.green(r10)
            float r12 = androidx.core.content.res.CamUtils.linearized(r12)
            int r13 = android.graphics.Color.blue(r10)
            float r13 = androidx.core.content.res.CamUtils.linearized(r13)
            float[][] r14 = androidx.core.content.res.CamUtils.SRGB_TO_XYZ
            r15 = 1
            r16 = r14[r15]
            r17 = 0
            r16 = r16[r17]
            float r11 = r11 * r16
            r16 = r14[r15]
            r16 = r16[r15]
            float r12 = r12 * r16
            float r12 = r12 + r11
            r11 = r14[r15]
            r14 = 2
            r11 = r11[r14]
            float r13 = r13 * r11
            float r13 = r13 + r12
            float r13 = r13 / r2
            r11 = 1007753895(0x3c111aa7, float:0.008856452)
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 > 0) goto L6f
            r11 = 1147261687(0x4461d2f7, float:903.2963)
            float r13 = r13 * r11
            goto L7d
        L6f:
            double r11 = (double) r13
            double r11 = java.lang.Math.cbrt(r11)
            float r11 = (float) r11
            r12 = 1122500608(0x42e80000, float:116.0)
            float r11 = r11 * r12
            r12 = 1098907648(0x41800000, float:16.0)
            float r13 = r11 - r12
        L7d:
            float r11 = r21 - r13
            float r11 = java.lang.Math.abs(r11)
            r12 = 1045220557(0x3e4ccccd, float:0.2)
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 >= 0) goto Lce
            androidx.core.content.res.CamColor r10 = fromColor(r10)
            float r12 = r10.mJ
            float r14 = r10.mChroma
            androidx.core.content.res.CamColor r12 = fromJch(r12, r14, r0)
            float r14 = r10.mJstar
            float r15 = r12.mJstar
            float r14 = r14 - r15
            float r15 = r10.mAstar
            float r2 = r12.mAstar
            float r15 = r15 - r2
            float r2 = r10.mBstar
            float r12 = r12.mBstar
            float r2 = r2 - r12
            float r14 = r14 * r14
            float r15 = r15 * r15
            float r15 = r15 + r14
            float r2 = r2 * r2
            float r2 = r2 + r15
            double r14 = (double) r2
            double r14 = java.lang.Math.sqrt(r14)
            r17 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            r12 = r4
            r3 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r3 = java.lang.Math.pow(r14, r3)
            double r3 = r3 * r17
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 > 0) goto Lcf
            r4 = r3
            r5 = r10
            r1 = r11
            goto Ld0
        Lce:
            r12 = r4
        Lcf:
            r4 = r12
        Ld0:
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 != 0) goto Lda
            int r3 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r3 != 0) goto Lda
            goto Le5
        Lda:
            int r3 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r3 >= 0) goto Le0
            r6 = r8
            goto Le1
        Le0:
            r7 = r8
        Le1:
            r2 = 1120403456(0x42c80000, float:100.0)
            goto Ld
        Le5:
            return r5
    }

    @androidx.annotation.NonNull
    public static androidx.core.content.res.CamColor fromColor(@androidx.annotation.ColorInt int r25) {
            androidx.core.content.res.ViewingConditions r0 = androidx.core.content.res.ViewingConditions.DEFAULT
            int r1 = android.graphics.Color.red(r25)
            float r1 = androidx.core.content.res.CamUtils.linearized(r1)
            int r2 = android.graphics.Color.green(r25)
            float r2 = androidx.core.content.res.CamUtils.linearized(r2)
            int r3 = android.graphics.Color.blue(r25)
            float r3 = androidx.core.content.res.CamUtils.linearized(r3)
            float[][] r4 = androidx.core.content.res.CamUtils.SRGB_TO_XYZ
            r5 = 0
            r6 = r4[r5]
            r6 = r6[r5]
            float r6 = r6 * r1
            r7 = r4[r5]
            r8 = 1
            r7 = r7[r8]
            float r7 = r7 * r2
            float r7 = r7 + r6
            r6 = r4[r5]
            r9 = 2
            r6 = r6[r9]
            float r6 = r6 * r3
            float r6 = r6 + r7
            r7 = r4[r8]
            r7 = r7[r5]
            float r7 = r7 * r1
            r10 = r4[r8]
            r10 = r10[r8]
            float r10 = r10 * r2
            float r10 = r10 + r7
            r7 = r4[r8]
            r7 = r7[r9]
            float r7 = r7 * r3
            float r7 = r7 + r10
            r10 = r4[r9]
            r10 = r10[r5]
            float r1 = r1 * r10
            r10 = r4[r9]
            r10 = r10[r8]
            float r2 = r2 * r10
            float r2 = r2 + r1
            r1 = r4[r9]
            r1 = r1[r9]
            float r3 = r3 * r1
            float r3 = r3 + r2
            r1 = 3
            float[] r1 = new float[r1]
            r1[r5] = r6
            r1[r8] = r7
            r1[r9] = r3
            float[][] r2 = androidx.core.content.res.CamUtils.XYZ_TO_CAM16RGB
            r3 = r1[r5]
            r4 = r2[r5]
            r4 = r4[r5]
            float r3 = r3 * r4
            r4 = r1[r8]
            r6 = r2[r5]
            r6 = r6[r8]
            float r4 = r4 * r6
            float r4 = r4 + r3
            r3 = r1[r9]
            r6 = r2[r5]
            r6 = r6[r9]
            float r3 = r3 * r6
            float r3 = r3 + r4
            r4 = r1[r5]
            r6 = r2[r8]
            r6 = r6[r5]
            float r4 = r4 * r6
            r6 = r1[r8]
            r7 = r2[r8]
            r7 = r7[r8]
            float r6 = r6 * r7
            float r6 = r6 + r4
            r4 = r1[r9]
            r7 = r2[r8]
            r7 = r7[r9]
            float r4 = r4 * r7
            float r4 = r4 + r6
            r6 = r1[r5]
            r7 = r2[r9]
            r7 = r7[r5]
            float r6 = r6 * r7
            r7 = r1[r8]
            r10 = r2[r9]
            r10 = r10[r8]
            float r7 = r7 * r10
            float r7 = r7 + r6
            r1 = r1[r9]
            r2 = r2[r9]
            r2 = r2[r9]
            float r1 = r1 * r2
            float r1 = r1 + r7
            float[] r2 = r0.getRgbD()
            r2 = r2[r5]
            float r2 = r2 * r3
            float[] r3 = r0.getRgbD()
            r3 = r3[r8]
            float r3 = r3 * r4
            float[] r4 = r0.getRgbD()
            r4 = r4[r9]
            float r4 = r4 * r1
            float r1 = r0.getFl()
            float r5 = java.lang.Math.abs(r2)
            float r5 = r5 * r1
            double r5 = (double) r5
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 / r7
            r9 = 4601237667291888353(0x3fdae147ae147ae1, double:0.42)
            double r5 = java.lang.Math.pow(r5, r9)
            float r1 = (float) r5
            float r5 = r0.getFl()
            float r6 = java.lang.Math.abs(r3)
            float r6 = r6 * r5
            double r5 = (double) r6
            double r5 = r5 / r7
            double r5 = java.lang.Math.pow(r5, r9)
            float r5 = (float) r5
            float r6 = r0.getFl()
            float r11 = java.lang.Math.abs(r4)
            float r11 = r11 * r6
            double r11 = (double) r11
            double r11 = r11 / r7
            double r9 = java.lang.Math.pow(r11, r9)
            float r6 = (float) r9
            float r2 = java.lang.Math.signum(r2)
            r9 = 1137180672(0x43c80000, float:400.0)
            float r2 = r2 * r9
            float r2 = r2 * r1
            r10 = 1104742973(0x41d90a3d, float:27.13)
            float r1 = r1 + r10
            float r2 = r2 / r1
            float r1 = java.lang.Math.signum(r3)
            float r1 = r1 * r9
            float r1 = r1 * r5
            float r5 = r5 + r10
            float r1 = r1 / r5
            float r3 = java.lang.Math.signum(r4)
            float r3 = r3 * r9
            float r3 = r3 * r6
            float r6 = r6 + r10
            float r3 = r3 / r6
            r4 = 4622382067542392832(0x4026000000000000, double:11.0)
            double r9 = (double) r2
            double r9 = r9 * r4
            r4 = -4600427019358961664(0xc028000000000000, double:-12.0)
            double r11 = (double) r1
            double r11 = r11 * r4
            double r11 = r11 + r9
            double r4 = (double) r3
            double r11 = r11 + r4
            float r6 = (float) r11
            r9 = 1093664768(0x41300000, float:11.0)
            float r6 = r6 / r9
            float r9 = r2 + r1
            double r9 = (double) r9
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 * r11
            double r9 = r9 - r4
            float r4 = (float) r9
            r5 = 1091567616(0x41100000, float:9.0)
            float r4 = r4 / r5
            r5 = 1101004800(0x41a00000, float:20.0)
            float r9 = r2 * r5
            float r1 = r1 * r5
            float r9 = r9 + r1
            r10 = 1101529088(0x41a80000, float:21.0)
            float r10 = r10 * r3
            float r10 = r10 + r9
            float r10 = r10 / r5
            r9 = 1109393408(0x42200000, float:40.0)
            float r2 = r2 * r9
            float r2 = r2 + r1
            float r2 = r2 + r3
            float r2 = r2 / r5
            double r13 = (double) r4
            double r7 = (double) r6
            double r7 = java.lang.Math.atan2(r13, r7)
            float r1 = (float) r7
            r3 = 1127481344(0x43340000, float:180.0)
            float r1 = r1 * r3
            r5 = 1078530011(0x40490fdb, float:3.1415927)
            float r1 = r1 / r5
            r7 = 0
            r8 = 1135869952(0x43b40000, float:360.0)
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 >= 0) goto L172
            float r1 = r1 + r8
            goto L177
        L172:
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 < 0) goto L177
            float r1 = r1 - r8
        L177:
            float r5 = r5 * r1
            float r5 = r5 / r3
            float r3 = r0.getNbb()
            float r2 = r2 * r3
            float r3 = r0.getAw()
            float r2 = r2 / r3
            double r2 = (double) r2
            float r7 = r0.getC()
            float r9 = r0.getZ()
            float r7 = r7 * r9
            double r13 = (double) r7
            double r2 = java.lang.Math.pow(r2, r13)
            float r2 = (float) r2
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r3
            float r7 = r0.getC()
            r9 = 1082130432(0x40800000, float:4.0)
            float r7 = r9 / r7
            float r3 = r2 / r3
            double r13 = (double) r3
            double r13 = java.lang.Math.sqrt(r13)
            float r3 = (float) r13
            float r7 = r7 * r3
            float r3 = r0.getAw()
            float r3 = r3 + r9
            float r3 = r3 * r7
            float r7 = r0.getFlRoot()
            float r19 = r3 * r7
            double r13 = (double) r1
            r15 = 4626362123713081508(0x403423d70a3d70a4, double:20.14)
            int r3 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r3 >= 0) goto L1c5
            float r8 = r8 + r1
            goto L1c6
        L1c5:
            r8 = r1
        L1c6:
            r3 = 1048576000(0x3e800000, float:0.25)
            double r7 = (double) r8
            r13 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r7 = r7 * r13
            r13 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r7 = r7 / r13
            double r7 = r7 + r11
            double r7 = java.lang.Math.cos(r7)
            r11 = 4615739258092021350(0x400e666666666666, double:3.8)
            double r7 = r7 + r11
            float r7 = (float) r7
            float r7 = r7 * r3
            r3 = 1164993142(0x45706276, float:3846.1538)
            float r7 = r7 * r3
            float r3 = r0.getNc()
            float r7 = r7 * r3
            float r3 = r0.getNcb()
            float r7 = r7 * r3
            float r6 = r6 * r6
            float r4 = r4 * r4
            float r4 = r4 + r6
            double r3 = (double) r4
            double r3 = java.lang.Math.sqrt(r3)
            float r3 = (float) r3
            float r7 = r7 * r3
            r3 = 1050421494(0x3e9c28f6, float:0.305)
            float r10 = r10 + r3
            float r7 = r7 / r10
            r3 = 4610064722561534525(0x3ffa3d70a3d70a3d, double:1.64)
            r10 = 4598895795485655695(0x3fd28f5c28f5c28f, double:0.29)
            float r6 = r0.getN()
            double r12 = (double) r6
            double r10 = java.lang.Math.pow(r10, r12)
            double r3 = r3 - r10
            r10 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            double r3 = java.lang.Math.pow(r3, r10)
            float r3 = (float) r3
            double r6 = (double) r7
            r10 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r6 = java.lang.Math.pow(r6, r10)
            float r4 = (float) r6
            float r3 = r3 * r4
            double r6 = (double) r2
            r10 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r6 = r6 / r10
            double r6 = java.lang.Math.sqrt(r6)
            float r4 = (float) r6
            float r17 = r3 * r4
            float r4 = r0.getFlRoot()
            float r20 = r17 * r4
            r4 = 1112014848(0x42480000, float:50.0)
            float r6 = r0.getC()
            float r3 = r3 * r6
            float r0 = r0.getAw()
            float r0 = r0 + r9
            float r3 = r3 / r0
            double r6 = (double) r3
            double r6 = java.lang.Math.sqrt(r6)
            float r0 = (float) r6
            float r21 = r0 * r4
            r0 = 1071225242(0x3fd9999a, float:1.7)
            float r0 = r0 * r2
            r3 = 1004888130(0x3be56042, float:0.007)
            float r3 = r3 * r2
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r4
            float r22 = r0 / r3
            r0 = 1110405192(0x422f7048, float:43.85965)
            r3 = 1018873617(0x3cbac711, float:0.0228)
            float r3 = r3 * r20
            float r3 = r3 + r4
            double r3 = (double) r3
            double r3 = java.lang.Math.log(r3)
            float r3 = (float) r3
            float r3 = r3 * r0
            double r4 = (double) r5
            double r6 = java.lang.Math.cos(r4)
            float r0 = (float) r6
            float r23 = r3 * r0
            double r4 = java.lang.Math.sin(r4)
            float r0 = (float) r4
            float r24 = r3 * r0
            androidx.core.content.res.CamColor r0 = new androidx.core.content.res.CamColor
            r15 = r0
            r16 = r1
            r18 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
    }

    @androidx.annotation.NonNull
    private static androidx.core.content.res.CamColor fromJch(@androidx.annotation.FloatRange(from = 0.0d, to = 100.0d) float r1, @androidx.annotation.FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float r2, @androidx.annotation.FloatRange(from = 0.0d, to = 360.0d) float r3) {
            androidx.core.content.res.ViewingConditions r0 = androidx.core.content.res.ViewingConditions.DEFAULT
            androidx.core.content.res.CamColor r1 = fromJchInFrame(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    private static androidx.core.content.res.CamColor fromJchInFrame(@androidx.annotation.FloatRange(from = 0.0d, to = 100.0d) float r13, @androidx.annotation.FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float r14, @androidx.annotation.FloatRange(from = 0.0d, to = 360.0d) float r15, androidx.core.content.res.ViewingConditions r16) {
            r3 = r13
            float r0 = r16.getC()
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r1 / r0
            double r4 = (double) r3
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 / r6
            double r6 = java.lang.Math.sqrt(r4)
            float r2 = (float) r6
            float r0 = r0 * r2
            float r2 = r16.getAw()
            float r2 = r2 + r1
            float r2 = r2 * r0
            float r0 = r16.getFlRoot()
            float r6 = r2 * r0
            float r0 = r16.getFlRoot()
            float r7 = r14 * r0
            double r4 = java.lang.Math.sqrt(r4)
            float r0 = (float) r4
            float r0 = r14 / r0
            float r2 = r16.getC()
            float r0 = r0 * r2
            float r2 = r16.getAw()
            float r2 = r2 + r1
            float r0 = r0 / r2
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            r1 = 1112014848(0x42480000, float:50.0)
            float r8 = r0 * r1
            r0 = 1078530011(0x40490fdb, float:3.1415927)
            float r0 = r0 * r15
            r1 = 1127481344(0x43340000, float:180.0)
            float r0 = r0 / r1
            r1 = 1071225242(0x3fd9999a, float:1.7)
            float r1 = r1 * r3
            r2 = 1004888130(0x3be56042, float:0.007)
            float r2 = r2 * r3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 + r4
            float r9 = r1 / r2
            double r1 = (double) r7
            r4 = 4582228873984682964(0x3f9758e219652bd4, double:0.0228)
            double r1 = r1 * r4
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r1 = r1 + r4
            double r1 = java.lang.Math.log(r1)
            float r1 = (float) r1
            r2 = 1110405192(0x422f7048, float:43.85965)
            float r1 = r1 * r2
            double r4 = (double) r0
            double r10 = java.lang.Math.cos(r4)
            float r0 = (float) r10
            float r10 = r1 * r0
            double r4 = java.lang.Math.sin(r4)
            float r0 = (float) r4
            float r11 = r1 * r0
            androidx.core.content.res.CamColor r12 = new androidx.core.content.res.CamColor
            r0 = r12
            r1 = r15
            r2 = r14
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r12
    }

    public static int toColor(@androidx.annotation.FloatRange(from = 0.0d, to = 360.0d) float r7, @androidx.annotation.FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float r8, @androidx.annotation.FloatRange(from = 0.0d, to = 100.0d) float r9) {
            androidx.core.content.res.ViewingConditions r0 = androidx.core.content.res.ViewingConditions.DEFAULT
            double r1 = (double) r8
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L69
            int r1 = java.lang.Math.round(r9)
            double r1 = (double) r1
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L69
            int r1 = java.lang.Math.round(r9)
            double r1 = (double) r1
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L20
            goto L69
        L20:
            r1 = 0
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 >= 0) goto L27
            r7 = 0
            goto L2d
        L27:
            r2 = 1135869952(0x43b40000, float:360.0)
            float r7 = java.lang.Math.min(r2, r7)
        L2d:
            r2 = 0
            r3 = 1
            r1 = r8
            r3 = r2
            r2 = 0
            r4 = 1
        L33:
            float r5 = r2 - r8
            float r5 = java.lang.Math.abs(r5)
            r6 = 1053609165(0x3ecccccd, float:0.4)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L5d
            androidx.core.content.res.CamColor r5 = findCamByJ(r7, r1, r9)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L52
            if (r5 == 0) goto L4f
            int r7 = r5.viewed(r0)
            goto L6d
        L4f:
            r1 = 0
            r4 = 0
            goto L58
        L52:
            if (r5 != 0) goto L56
            r8 = r1
            goto L58
        L56:
            r2 = r1
            r3 = r5
        L58:
            float r1 = r8 - r2
            float r1 = r1 / r6
            float r1 = r1 + r2
            goto L33
        L5d:
            if (r3 != 0) goto L64
            int r7 = androidx.core.content.res.CamUtils.intFromLStar(r9)
            goto L6d
        L64:
            int r7 = r3.viewed(r0)
            goto L6d
        L69:
            int r7 = androidx.core.content.res.CamUtils.intFromLStar(r9)
        L6d:
            return r7
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false)
    public final float getChroma() {
            r1 = this;
            float r0 = r1.mChroma
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = 360.0d, toInclusive = false)
    public final float getHue() {
            r1 = this;
            float r0 = r1.mHue
            return r0
    }

    @androidx.annotation.ColorInt
    public final int viewed(@androidx.annotation.NonNull androidx.core.content.res.ViewingConditions r17) {
            r16 = this;
            r0 = r16
            float r1 = r0.mChroma
            double r2 = (double) r1
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L1d
            float r2 = r0.mJ
            double r2 = (double) r2
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L15
            goto L1d
        L15:
            double r2 = r2 / r4
            double r2 = java.lang.Math.sqrt(r2)
            float r2 = (float) r2
            float r1 = r1 / r2
            goto L1e
        L1d:
            r1 = 0
        L1e:
            double r1 = (double) r1
            r8 = 4610064722561534525(0x3ffa3d70a3d70a3d, double:1.64)
            r10 = 4598895795485655695(0x3fd28f5c28f5c28f, double:0.29)
            float r3 = r17.getN()
            double r12 = (double) r3
            double r10 = java.lang.Math.pow(r10, r12)
            double r8 = r8 - r10
            r10 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            double r8 = java.lang.Math.pow(r8, r10)
            double r1 = r1 / r8
            r8 = 4607682818758614130(0x3ff1c71c71c71c72, double:1.1111111111111112)
            double r1 = java.lang.Math.pow(r1, r8)
            float r1 = (float) r1
            float r2 = r0.mHue
            r3 = 1078530011(0x40490fdb, float:3.1415927)
            float r2 = r2 * r3
            r3 = 1127481344(0x43340000, float:180.0)
            float r2 = r2 / r3
            r3 = 1048576000(0x3e800000, float:0.25)
            double r8 = (double) r2
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r10 + r8
            double r10 = java.lang.Math.cos(r10)
            r12 = 4615739258092021350(0x400e666666666666, double:3.8)
            double r10 = r10 + r12
            float r2 = (float) r10
            float r2 = r2 * r3
            float r3 = r17.getAw()
            float r10 = r0.mJ
            double r10 = (double) r10
            double r10 = r10 / r4
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            float r12 = r17.getC()
            double r12 = (double) r12
            double r4 = r4 / r12
            float r12 = r17.getZ()
            double r12 = (double) r12
            double r4 = r4 / r12
            double r4 = java.lang.Math.pow(r10, r4)
            float r4 = (float) r4
            float r3 = r3 * r4
            r4 = 1164993142(0x45706276, float:3846.1538)
            float r2 = r2 * r4
            float r4 = r17.getNc()
            float r2 = r2 * r4
            float r4 = r17.getNcb()
            float r2 = r2 * r4
            float r4 = r17.getNbb()
            float r3 = r3 / r4
            double r4 = java.lang.Math.sin(r8)
            float r4 = (float) r4
            double r8 = java.lang.Math.cos(r8)
            float r5 = (float) r8
            r8 = 1050421494(0x3e9c28f6, float:0.305)
            float r8 = r8 + r3
            r9 = 1102577664(0x41b80000, float:23.0)
            float r8 = r8 * r9
            float r8 = r8 * r1
            float r2 = r2 * r9
            r9 = 1093664768(0x41300000, float:11.0)
            float r9 = r9 * r1
            float r9 = r9 * r5
            float r9 = r9 + r2
            r2 = 1121452032(0x42d80000, float:108.0)
            float r1 = r1 * r2
            float r1 = r1 * r4
            float r1 = r1 + r9
            float r8 = r8 / r1
            float r5 = r5 * r8
            float r8 = r8 * r4
            r1 = 1139146752(0x43e60000, float:460.0)
            float r3 = r3 * r1
            r1 = 1138851840(0x43e18000, float:451.0)
            float r1 = r1 * r5
            float r1 = r1 + r3
            r2 = 1133510656(0x43900000, float:288.0)
            float r2 = r2 * r8
            float r2 = r2 + r1
            r1 = 1152344064(0x44af6000, float:1403.0)
            float r2 = r2 / r1
            r4 = 1147060224(0x445ec000, float:891.0)
            float r4 = r4 * r5
            float r4 = r3 - r4
            r9 = 1132625920(0x43828000, float:261.0)
            float r9 = r9 * r8
            float r4 = r4 - r9
            float r4 = r4 / r1
            r9 = 1130102784(0x435c0000, float:220.0)
            float r5 = r5 * r9
            float r3 = r3 - r5
            r5 = 1170530304(0x45c4e000, float:6300.0)
            float r8 = r8 * r5
            float r3 = r3 - r8
            float r3 = r3 / r1
            float r1 = java.lang.Math.abs(r2)
            double r8 = (double) r1
            r10 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r8 = r8 * r10
            float r1 = java.lang.Math.abs(r2)
            double r12 = (double) r1
            r14 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r12 = r14 - r12
            double r8 = r8 / r12
            double r8 = java.lang.Math.max(r6, r8)
            float r1 = (float) r8
            float r2 = java.lang.Math.signum(r2)
            float r5 = r17.getFl()
            r8 = 1120403456(0x42c80000, float:100.0)
            float r5 = r8 / r5
            float r5 = r5 * r2
            double r1 = (double) r1
            r12 = 4612543846927839427(0x40030c30c30c30c3, double:2.380952380952381)
            double r1 = java.lang.Math.pow(r1, r12)
            float r1 = (float) r1
            float r5 = r5 * r1
            float r1 = java.lang.Math.abs(r4)
            double r1 = (double) r1
            double r1 = r1 * r10
            float r9 = java.lang.Math.abs(r4)
            double r10 = (double) r9
            double r9 = r14 - r10
            double r1 = r1 / r9
            double r1 = java.lang.Math.max(r6, r1)
            float r1 = (float) r1
            float r2 = java.lang.Math.signum(r4)
            float r4 = r17.getFl()
            float r4 = r8 / r4
            float r4 = r4 * r2
            double r1 = (double) r1
            double r1 = java.lang.Math.pow(r1, r12)
            float r1 = (float) r1
            float r4 = r4 * r1
            float r1 = java.lang.Math.abs(r3)
            double r1 = (double) r1
            r9 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r1 = r1 * r9
            float r9 = java.lang.Math.abs(r3)
            double r9 = (double) r9
            double r14 = r14 - r9
            double r1 = r1 / r14
            double r1 = java.lang.Math.max(r6, r1)
            float r1 = (float) r1
            float r2 = java.lang.Math.signum(r3)
            float r3 = r17.getFl()
            float r8 = r8 / r3
            float r8 = r8 * r2
            double r1 = (double) r1
            double r1 = java.lang.Math.pow(r1, r12)
            float r1 = (float) r1
            float r8 = r8 * r1
            float[] r1 = r17.getRgbD()
            r2 = 0
            r1 = r1[r2]
            float r5 = r5 / r1
            float[] r1 = r17.getRgbD()
            r3 = 1
            r1 = r1[r3]
            float r4 = r4 / r1
            float[] r1 = r17.getRgbD()
            r6 = 2
            r1 = r1[r6]
            float r8 = r8 / r1
            float[][] r1 = androidx.core.content.res.CamUtils.CAM16RGB_TO_XYZ
            r7 = r1[r2]
            r7 = r7[r2]
            float r7 = r7 * r5
            r9 = r1[r2]
            r9 = r9[r3]
            float r9 = r9 * r4
            float r9 = r9 + r7
            r7 = r1[r2]
            r7 = r7[r6]
            float r7 = r7 * r8
            float r7 = r7 + r9
            r9 = r1[r3]
            r9 = r9[r2]
            float r9 = r9 * r5
            r10 = r1[r3]
            r10 = r10[r3]
            float r10 = r10 * r4
            float r10 = r10 + r9
            r9 = r1[r3]
            r9 = r9[r6]
            float r9 = r9 * r8
            float r9 = r9 + r10
            r10 = r1[r6]
            r2 = r10[r2]
            float r5 = r5 * r2
            r2 = r1[r6]
            r2 = r2[r3]
            float r4 = r4 * r2
            float r4 = r4 + r5
            r1 = r1[r6]
            r1 = r1[r6]
            float r8 = r8 * r1
            float r8 = r8 + r4
            double r1 = (double) r7
            double r3 = (double) r9
            double r5 = (double) r8
            int r1 = androidx.core.graphics.ColorUtils.XYZToColor(r1, r3, r5)
            return r1
    }
}
