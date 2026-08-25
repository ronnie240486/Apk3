package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes2.dex */
public class LinearCurveFit extends androidx.constraintlayout.core.motion.utils.CurveFit {
    private static final java.lang.String TAG = "LinearCurveFit";
    private boolean mExtrapolate;
    public double[] mSlopeTemp;
    private double[] mT;
    private double mTotalLength;
    private double[][] mY;

    public LinearCurveFit(double[] r14, double[][] r15) {
            r13 = this;
            r13.<init>()
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r13.mTotalLength = r0
            r0 = 1
            r13.mExtrapolate = r0
            int r0 = r14.length
            r0 = 0
            r1 = r15[r0]
            int r1 = r1.length
            double[] r2 = new double[r1]
            r13.mSlopeTemp = r2
            r13.mT = r14
            r13.mY = r15
            r2 = 2
            if (r1 <= r2) goto L3a
            r1 = 0
            r4 = r1
            r6 = r4
            r3 = 0
        L1f:
            int r8 = r14.length
            if (r3 >= r8) goto L38
            r8 = r15[r3]
            r9 = r8[r0]
            r8 = r15[r3]
            r11 = r8[r0]
            if (r3 <= 0) goto L33
            double r4 = r9 - r4
            double r6 = r11 - r6
            java.lang.Math.hypot(r4, r6)
        L33:
            int r3 = r3 + 1
            r4 = r9
            r6 = r11
            goto L1f
        L38:
            r13.mTotalLength = r1
        L3a:
            return
    }

    private double getLength2D(double r22) {
            r21 = this;
            r0 = r21
            double r1 = r0.mTotalLength
            boolean r1 = java.lang.Double.isNaN(r1)
            r2 = 0
            if (r1 == 0) goto Ld
            return r2
        Ld:
            double[] r1 = r0.mT
            int r4 = r1.length
            r5 = 0
            r6 = r1[r5]
            int r8 = (r22 > r6 ? 1 : (r22 == r6 ? 0 : -1))
            if (r8 > 0) goto L18
            return r2
        L18:
            r6 = 1
            int r4 = r4 - r6
            r7 = r1[r4]
            int r1 = (r22 > r7 ? 1 : (r22 == r7 ? 0 : -1))
            if (r1 < 0) goto L23
            double r1 = r0.mTotalLength
            return r1
        L23:
            r7 = r2
            r9 = r7
            r11 = r9
            r1 = 0
        L27:
            if (r1 >= r4) goto L88
            double[][] r13 = r0.mY
            r14 = r13[r1]
            r15 = r14[r5]
            r13 = r13[r1]
            r17 = r13[r6]
            if (r1 <= 0) goto L3e
            double r9 = r15 - r9
            double r11 = r17 - r11
            double r9 = java.lang.Math.hypot(r9, r11)
            double r7 = r7 + r9
        L3e:
            double[] r9 = r0.mT
            r10 = r9[r1]
            int r12 = (r22 > r10 ? 1 : (r22 == r10 ? 0 : -1))
            if (r12 != 0) goto L47
            return r7
        L47:
            int r10 = r1 + 1
            r11 = r9[r10]
            int r13 = (r22 > r11 ? 1 : (r22 == r11 ? 0 : -1))
            if (r13 >= 0) goto L83
            r2 = r9[r10]
            r11 = r9[r1]
            double r2 = r2 - r11
            r11 = r9[r1]
            double r11 = r22 - r11
            double r11 = r11 / r2
            double[][] r2 = r0.mY
            r3 = r2[r1]
            r13 = r3[r5]
            r3 = r2[r10]
            r4 = r3[r5]
            r1 = r2[r1]
            r19 = r1[r6]
            r1 = r2[r10]
            r2 = r1[r6]
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = r9 - r11
            double r19 = r19 * r9
            double r2 = r2 * r11
            double r2 = r2 + r19
            double r1 = r17 - r2
            double r13 = r13 * r9
            double r4 = r4 * r11
            double r4 = r4 + r13
            double r3 = r15 - r4
            double r1 = java.lang.Math.hypot(r1, r3)
            double r1 = r1 + r7
            return r1
        L83:
            r1 = r10
            r9 = r15
            r11 = r17
            goto L27
        L88:
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double r9, int r11) {
            r8 = this;
            double[] r0 = r8.mT
            int r1 = r0.length
            boolean r2 = r8.mExtrapolate
            r3 = 0
            if (r2 == 0) goto L3c
            r4 = r0[r3]
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 > 0) goto L21
            double[][] r1 = r8.mY
            r1 = r1[r3]
            r4 = r1[r11]
            r1 = r0[r3]
            double r9 = r9 - r1
            r1 = r0[r3]
            double r0 = r8.getSlope(r1, r11)
            double r0 = r0 * r9
            double r0 = r0 + r4
            return r0
        L21:
            int r2 = r1 + (-1)
            r4 = r0[r2]
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 < 0) goto L58
            double[][] r1 = r8.mY
            r1 = r1[r2]
            r3 = r1[r11]
            r5 = r0[r2]
            double r9 = r9 - r5
            r1 = r0[r2]
            double r0 = r8.getSlope(r1, r11)
            double r0 = r0 * r9
            double r0 = r0 + r3
            return r0
        L3c:
            r4 = r0[r3]
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 > 0) goto L49
            double[][] r9 = r8.mY
            r9 = r9[r3]
            r10 = r9[r11]
            return r10
        L49:
            int r2 = r1 + (-1)
            r4 = r0[r2]
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 < 0) goto L58
            double[][] r9 = r8.mY
            r9 = r9[r2]
            r10 = r9[r11]
            return r10
        L58:
            int r0 = r1 + (-1)
            if (r3 >= r0) goto L91
            double[] r0 = r8.mT
            r4 = r0[r3]
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 != 0) goto L6b
            double[][] r9 = r8.mY
            r9 = r9[r3]
            r10 = r9[r11]
            return r10
        L6b:
            int r2 = r3 + 1
            r4 = r0[r2]
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 >= 0) goto L8f
            r4 = r0[r2]
            r6 = r0[r3]
            double r4 = r4 - r6
            r6 = r0[r3]
            double r9 = r9 - r6
            double r9 = r9 / r4
            double[][] r0 = r8.mY
            r1 = r0[r3]
            r3 = r1[r11]
            r0 = r0[r2]
            r1 = r0[r11]
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r5 - r9
            double r5 = r5 * r3
            double r1 = r1 * r9
            double r1 = r1 + r5
            return r1
        L8f:
            r3 = r2
            goto L58
        L91:
            r9 = 0
            return r9
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double r13, double[] r15) {
            r12 = this;
            double[] r0 = r12.mT
            int r1 = r0.length
            double[][] r2 = r12.mY
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            boolean r4 = r12.mExtrapolate
            if (r4 == 0) goto L60
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L36
            r4 = r0[r3]
            double[] r0 = r12.mSlopeTemp
            r12.getSlope(r4, r0)
            r0 = 0
        L1b:
            if (r0 >= r2) goto L35
            double[][] r1 = r12.mY
            r1 = r1[r3]
            r4 = r1[r0]
            double[] r1 = r12.mT
            r6 = r1[r3]
            double r6 = r13 - r6
            double[] r1 = r12.mSlopeTemp
            r8 = r1[r0]
            double r6 = r6 * r8
            double r6 = r6 + r4
            r15[r0] = r6
            int r0 = r0 + 1
            goto L1b
        L35:
            return
        L36:
            int r4 = r1 + (-1)
            r5 = r0[r4]
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 < 0) goto L8b
            r5 = r0[r4]
            double[] r0 = r12.mSlopeTemp
            r12.getSlope(r5, r0)
        L45:
            if (r3 >= r2) goto L5f
            double[][] r0 = r12.mY
            r0 = r0[r4]
            r5 = r0[r3]
            double[] r0 = r12.mT
            r7 = r0[r4]
            double r0 = r13 - r7
            double[] r7 = r12.mSlopeTemp
            r8 = r7[r3]
            double r0 = r0 * r8
            double r0 = r0 + r5
            r15[r3] = r0
            int r3 = r3 + 1
            goto L45
        L5f:
            return
        L60:
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L75
            r13 = 0
        L67:
            if (r13 >= r2) goto L74
            double[][] r14 = r12.mY
            r14 = r14[r3]
            r0 = r14[r13]
            r15[r13] = r0
            int r13 = r13 + 1
            goto L67
        L74:
            return
        L75:
            int r4 = r1 + (-1)
            r5 = r0[r4]
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 < 0) goto L8b
        L7d:
            if (r3 >= r2) goto L8a
            double[][] r13 = r12.mY
            r13 = r13[r4]
            r0 = r13[r3]
            r15[r3] = r0
            int r3 = r3 + 1
            goto L7d
        L8a:
            return
        L8b:
            r0 = 0
        L8c:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto Ld5
            double[] r4 = r12.mT
            r5 = r4[r0]
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 != 0) goto La6
            r4 = 0
        L99:
            if (r4 >= r2) goto La6
            double[][] r5 = r12.mY
            r5 = r5[r0]
            r6 = r5[r4]
            r15[r4] = r6
            int r4 = r4 + 1
            goto L99
        La6:
            double[] r4 = r12.mT
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 >= 0) goto Ld3
            r6 = r4[r5]
            r8 = r4[r0]
            double r6 = r6 - r8
            r8 = r4[r0]
            double r13 = r13 - r8
            double r13 = r13 / r6
        Lb9:
            if (r3 >= r2) goto Ld2
            double[][] r1 = r12.mY
            r4 = r1[r0]
            r6 = r4[r3]
            r1 = r1[r5]
            r8 = r1[r3]
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 - r13
            double r10 = r10 * r6
            double r8 = r8 * r13
            double r8 = r8 + r10
            r15[r3] = r8
            int r3 = r3 + 1
            goto Lb9
        Ld2:
            return
        Ld3:
            r0 = r5
            goto L8c
        Ld5:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double r13, float[] r15) {
            r12 = this;
            double[] r0 = r12.mT
            int r1 = r0.length
            double[][] r2 = r12.mY
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            boolean r4 = r12.mExtrapolate
            if (r4 == 0) goto L62
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L37
            r4 = r0[r3]
            double[] r0 = r12.mSlopeTemp
            r12.getSlope(r4, r0)
            r0 = 0
        L1b:
            if (r0 >= r2) goto L36
            double[][] r1 = r12.mY
            r1 = r1[r3]
            r4 = r1[r0]
            double[] r1 = r12.mT
            r6 = r1[r3]
            double r6 = r13 - r6
            double[] r1 = r12.mSlopeTemp
            r8 = r1[r0]
            double r6 = r6 * r8
            double r6 = r6 + r4
            float r1 = (float) r6
            r15[r0] = r1
            int r0 = r0 + 1
            goto L1b
        L36:
            return
        L37:
            int r4 = r1 + (-1)
            r5 = r0[r4]
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 < 0) goto L8f
            r5 = r0[r4]
            double[] r0 = r12.mSlopeTemp
            r12.getSlope(r5, r0)
        L46:
            if (r3 >= r2) goto L61
            double[][] r0 = r12.mY
            r0 = r0[r4]
            r5 = r0[r3]
            double[] r0 = r12.mT
            r7 = r0[r4]
            double r0 = r13 - r7
            double[] r7 = r12.mSlopeTemp
            r8 = r7[r3]
            double r0 = r0 * r8
            double r0 = r0 + r5
            float r0 = (float) r0
            r15[r3] = r0
            int r3 = r3 + 1
            goto L46
        L61:
            return
        L62:
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L78
            r13 = 0
        L69:
            if (r13 >= r2) goto L77
            double[][] r14 = r12.mY
            r14 = r14[r3]
            r0 = r14[r13]
            float r14 = (float) r0
            r15[r13] = r14
            int r13 = r13 + 1
            goto L69
        L77:
            return
        L78:
            int r4 = r1 + (-1)
            r5 = r0[r4]
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 < 0) goto L8f
        L80:
            if (r3 >= r2) goto L8e
            double[][] r13 = r12.mY
            r13 = r13[r4]
            r0 = r13[r3]
            float r13 = (float) r0
            r15[r3] = r13
            int r3 = r3 + 1
            goto L80
        L8e:
            return
        L8f:
            r0 = 0
        L90:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto Ldb
            double[] r4 = r12.mT
            r5 = r4[r0]
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 != 0) goto Lab
            r4 = 0
        L9d:
            if (r4 >= r2) goto Lab
            double[][] r5 = r12.mY
            r5 = r5[r0]
            r6 = r5[r4]
            float r5 = (float) r6
            r15[r4] = r5
            int r4 = r4 + 1
            goto L9d
        Lab:
            double[] r4 = r12.mT
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 >= 0) goto Ld9
            r6 = r4[r5]
            r8 = r4[r0]
            double r6 = r6 - r8
            r8 = r4[r0]
            double r13 = r13 - r8
            double r13 = r13 / r6
        Lbe:
            if (r3 >= r2) goto Ld8
            double[][] r1 = r12.mY
            r4 = r1[r0]
            r6 = r4[r3]
            r1 = r1[r5]
            r8 = r1[r3]
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 - r13
            double r10 = r10 * r6
            double r8 = r8 * r13
            double r8 = r8 + r10
            float r1 = (float) r8
            r15[r3] = r1
            int r3 = r3 + 1
            goto Lbe
        Ld8:
            return
        Ld9:
            r0 = r5
            goto L90
        Ldb:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double r8, int r10) {
            r7 = this;
            double[] r0 = r7.mT
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto Ld
            r8 = r0[r2]
            goto L17
        Ld:
            int r3 = r1 + (-1)
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 < 0) goto L17
            r8 = r0[r3]
        L17:
            int r0 = r1 + (-1)
            if (r2 >= r0) goto L3b
            double[] r0 = r7.mT
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L39
            r8 = r0[r3]
            r4 = r0[r2]
            double r8 = r8 - r4
            r4 = r0[r2]
            double[][] r0 = r7.mY
            r1 = r0[r2]
            r4 = r1[r10]
            r0 = r0[r3]
            r1 = r0[r10]
            double r1 = r1 - r4
            double r1 = r1 / r8
            return r1
        L39:
            r2 = r3
            goto L17
        L3b:
            r8 = 0
            return r8
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double r11, double[] r13) {
            r10 = this;
            double[] r0 = r10.mT
            int r1 = r0.length
            double[][] r2 = r10.mY
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 > 0) goto L12
            r11 = r0[r3]
            goto L1c
        L12:
            int r4 = r1 + (-1)
            r5 = r0[r4]
            int r7 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r7 < 0) goto L1c
            r11 = r0[r4]
        L1c:
            r0 = 0
        L1d:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto L47
            double[] r4 = r10.mT
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 > 0) goto L45
            r11 = r4[r5]
            r6 = r4[r0]
            double r11 = r11 - r6
            r6 = r4[r0]
        L32:
            if (r3 >= r2) goto L47
            double[][] r1 = r10.mY
            r4 = r1[r0]
            r6 = r4[r3]
            r1 = r1[r5]
            r8 = r1[r3]
            double r8 = r8 - r6
            double r8 = r8 / r11
            r13[r3] = r8
            int r3 = r3 + 1
            goto L32
        L45:
            r0 = r5
            goto L1d
        L47:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
            r1 = this;
            double[] r0 = r1.mT
            return r0
    }
}
