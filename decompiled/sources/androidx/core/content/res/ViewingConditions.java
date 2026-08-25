package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
final class ViewingConditions {
    public static final androidx.core.content.res.ViewingConditions DEFAULT = null;
    private final float mAw;
    private final float mC;
    private final float mFl;
    private final float mFlRoot;
    private final float mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;
    private final float mZ;

    static {
            float[] r0 = androidx.core.content.res.CamUtils.WHITE_POINT_D65
            float r1 = androidx.core.content.res.CamUtils.yFromLStar()
            double r1 = (double) r1
            r3 = 4634156444089534796(0x404fd4bbab8b494c, double:63.66197723675813)
            double r1 = r1 * r3
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r1 = r1 / r3
            float r1 = (float) r1
            float[][] r2 = androidx.core.content.res.CamUtils.XYZ_TO_CAM16RGB
            r5 = 0
            r6 = r0[r5]
            r7 = r2[r5]
            r7 = r7[r5]
            float r6 = r6 * r7
            r7 = 1
            r8 = r0[r7]
            r9 = r2[r5]
            r9 = r9[r7]
            float r8 = r8 * r9
            float r8 = r8 + r6
            r6 = 2
            r9 = r0[r6]
            r10 = r2[r5]
            r10 = r10[r6]
            float r9 = r9 * r10
            float r9 = r9 + r8
            r8 = r0[r5]
            r10 = r2[r7]
            r10 = r10[r5]
            float r8 = r8 * r10
            r10 = r0[r7]
            r11 = r2[r7]
            r11 = r11[r7]
            float r10 = r10 * r11
            float r10 = r10 + r8
            r8 = r0[r6]
            r11 = r2[r7]
            r11 = r11[r6]
            float r8 = r8 * r11
            float r8 = r8 + r10
            r10 = r0[r5]
            r11 = r2[r6]
            r11 = r11[r5]
            float r10 = r10 * r11
            r11 = r0[r7]
            r12 = r2[r6]
            r12 = r12[r7]
            float r11 = r11 * r12
            float r11 = r11 + r10
            r10 = r0[r6]
            r2 = r2[r6]
            r2 = r2[r6]
            float r10 = r10 * r2
            float r10 = r10 + r11
            r2 = 1065353216(0x3f800000, float:1.0)
            double r11 = (double) r2
            r13 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L78
            r11 = 1060152279(0x3f30a3d7, float:0.69)
            r17 = 1060152279(0x3f30a3d7, float:0.69)
            goto L7e
        L78:
            r11 = 1059565076(0x3f27ae14, float:0.655)
            r17 = 1059565076(0x3f27ae14, float:0.655)
        L7e:
            r11 = 1049508068(0x3e8e38e4, float:0.2777778)
            float r12 = -r1
            r13 = 1109917696(0x42280000, float:42.0)
            float r12 = r12 - r13
            r13 = 1119354880(0x42b80000, float:92.0)
            float r12 = r12 / r13
            double r12 = (double) r12
            double r12 = java.lang.Math.exp(r12)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = r2 - r12
            float r11 = r11 * r2
            double r12 = (double) r11
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L9e
            r11 = 1065353216(0x3f800000, float:1.0)
            goto La5
        L9e:
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto La5
            r11 = 0
        La5:
            r12 = 3
            float[] r15 = new float[r12]
            r13 = 1120403456(0x42c80000, float:100.0)
            float r14 = r13 / r9
            float r14 = r14 * r11
            float r14 = r14 + r2
            float r14 = r14 - r11
            r15[r5] = r14
            float r14 = r13 / r8
            float r14 = r14 * r11
            float r14 = r14 + r2
            float r14 = r14 - r11
            r15[r7] = r14
            float r13 = r13 / r10
            float r13 = r13 * r11
            float r13 = r13 + r2
            float r13 = r13 - r11
            r15[r6] = r13
            r11 = 1084227584(0x40a00000, float:5.0)
            float r11 = r11 * r1
            float r11 = r11 + r2
            float r11 = r2 / r11
            float r13 = r11 * r11
            float r13 = r13 * r11
            float r13 = r13 * r11
            float r2 = r2 - r13
            float r13 = r13 * r1
            r11 = 1036831949(0x3dcccccd, float:0.1)
            float r11 = r11 * r2
            float r11 = r11 * r2
            r18 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r1 = (double) r1
            double r1 = r1 * r18
            double r1 = java.lang.Math.cbrt(r1)
            float r1 = (float) r1
            float r11 = r11 * r1
            float r1 = r11 + r13
            float r2 = androidx.core.content.res.CamUtils.yFromLStar()
            r0 = r0[r7]
            float r13 = r2 / r0
            r0 = 1069379748(0x3fbd70a4, float:1.48)
            double r6 = (double) r13
            double r2 = java.lang.Math.sqrt(r6)
            float r2 = (float) r2
            float r22 = r2 + r0
            r0 = 1060739482(0x3f39999a, float:0.725)
            r2 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r2 = java.lang.Math.pow(r6, r2)
            float r2 = (float) r2
            float r16 = r0 / r2
            float[] r0 = new float[r12]
            r2 = r15[r5]
            float r2 = r2 * r1
            float r2 = r2 * r9
            double r2 = (double) r2
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 / r6
            r11 = 4601237667291888353(0x3fdae147ae147ae1, double:0.42)
            double r2 = java.lang.Math.pow(r2, r11)
            float r2 = (float) r2
            r0[r5] = r2
            r2 = 1
            r3 = r15[r2]
            float r3 = r3 * r1
            float r3 = r3 * r8
            double r3 = (double) r3
            double r3 = r3 / r6
            double r3 = java.lang.Math.pow(r3, r11)
            float r3 = (float) r3
            r0[r2] = r3
            r3 = 2
            r4 = r15[r3]
            float r4 = r4 * r1
            float r4 = r4 * r10
            double r9 = (double) r4
            double r9 = r9 / r6
            double r6 = java.lang.Math.pow(r9, r11)
            float r4 = (float) r6
            r0[r3] = r4
            r3 = 3
            float[] r3 = new float[r3]
            r4 = r0[r5]
            r6 = 1137180672(0x43c80000, float:400.0)
            float r4 = r4 * r6
            r7 = r0[r5]
            r8 = 1104742973(0x41d90a3d, float:27.13)
            float r7 = r7 + r8
            float r4 = r4 / r7
            r3[r5] = r4
            r2 = 1
            r4 = r0[r2]
            float r4 = r4 * r6
            r7 = r0[r2]
            float r7 = r7 + r8
            float r4 = r4 / r7
            r3[r2] = r4
            r4 = 2
            r7 = r0[r4]
            float r7 = r7 * r6
            r0 = r0[r4]
            float r0 = r0 + r8
            float r7 = r7 / r0
            r3[r4] = r7
            r0 = 1073741824(0x40000000, float:2.0)
            r5 = r3[r5]
            float r5 = r5 * r0
            r0 = r3[r2]
            float r5 = r5 + r0
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            r2 = r3[r4]
            float r2 = r2 * r0
            float r2 = r2 + r5
            float r14 = r2 * r16
            androidx.core.content.res.ViewingConditions r0 = new androidx.core.content.res.ViewingConditions
            double r2 = (double) r1
            r4 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r2 = java.lang.Math.pow(r2, r4)
            float r2 = (float) r2
            r18 = 1065353216(0x3f800000, float:1.0)
            r12 = r0
            r3 = r15
            r15 = r16
            r19 = r3
            r20 = r1
            r21 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            androidx.core.content.res.ViewingConditions.DEFAULT = r0
            return
    }

    private ViewingConditions(float r1, float r2, float r3, float r4, float r5, float r6, float[] r7, float r8, float r9, float r10) {
            r0 = this;
            r0.<init>()
            r0.mN = r1
            r0.mAw = r2
            r0.mNbb = r3
            r0.mNcb = r4
            r0.mC = r5
            r0.mNc = r6
            r0.mRgbD = r7
            r0.mFl = r8
            r0.mFlRoot = r9
            r0.mZ = r10
            return
    }

    public final float getAw() {
            r1 = this;
            float r0 = r1.mAw
            return r0
    }

    public final float getC() {
            r1 = this;
            float r0 = r1.mC
            return r0
    }

    public final float getFl() {
            r1 = this;
            float r0 = r1.mFl
            return r0
    }

    public final float getFlRoot() {
            r1 = this;
            float r0 = r1.mFlRoot
            return r0
    }

    public final float getN() {
            r1 = this;
            float r0 = r1.mN
            return r0
    }

    public final float getNbb() {
            r1 = this;
            float r0 = r1.mNbb
            return r0
    }

    public final float getNc() {
            r1 = this;
            float r0 = r1.mNc
            return r0
    }

    public final float getNcb() {
            r1 = this;
            float r0 = r1.mNcb
            return r0
    }

    @androidx.annotation.NonNull
    public final float[] getRgbD() {
            r1 = this;
            float[] r0 = r1.mRgbD
            return r0
    }

    public final float getZ() {
            r1 = this;
            float r0 = r1.mZ
            return r0
    }
}
