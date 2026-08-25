package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes2.dex */
public class HyperSpline {
    public double[][] mCtl;
    public androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[][] mCurve;
    public double[] mCurveLength;
    public int mDimensionality;
    public int mPoints;
    public double mTotalLength;

    public static class Cubic {
        public double mA;
        public double mB;
        public double mC;
        public double mD;

        public Cubic(double r1, double r3, double r5, double r7) {
                r0 = this;
                r0.<init>()
                r0.mA = r1
                r0.mB = r3
                r0.mC = r5
                r0.mD = r7
                return
        }

        public double eval(double r5) {
                r4 = this;
                double r0 = r4.mD
                double r0 = r0 * r5
                double r2 = r4.mC
                double r0 = r0 + r2
                double r0 = r0 * r5
                double r2 = r4.mB
                double r0 = r0 + r2
                double r0 = r0 * r5
                double r5 = r4.mA
                double r0 = r0 + r5
                return r0
        }

        public double vel(double r7) {
                r6 = this;
                double r0 = r6.mD
                r2 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r0 = r0 * r2
                double r0 = r0 * r7
                double r2 = r6.mC
                r4 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r2 = r2 * r4
                double r2 = r2 + r0
                double r2 = r2 * r7
                double r7 = r6.mB
                double r2 = r2 + r7
                return r2
        }
    }

    public HyperSpline() {
            r0 = this;
            r0.<init>()
            return
    }

    public HyperSpline(double[][] r1) {
            r0 = this;
            r0.<init>()
            r0.setup(r1)
            return
    }

    public double approxLength(androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[] r15) {
            r14 = this;
            int r0 = r15.length
            int r0 = r15.length
            double[] r0 = new double[r0]
            r1 = 0
            r3 = r1
            r5 = r3
        L8:
            r7 = 0
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 >= 0) goto L34
            r8 = r1
        L10:
            int r10 = r15.length
            if (r7 >= r10) goto L24
            r10 = r0[r7]
            r12 = r15[r7]
            double r12 = r12.eval(r3)
            r0[r7] = r12
            double r10 = r10 - r12
            double r10 = r10 * r10
            double r8 = r8 + r10
            int r7 = r7 + 1
            goto L10
        L24:
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 <= 0) goto L2d
            double r7 = java.lang.Math.sqrt(r8)
            double r5 = r5 + r7
        L2d:
            r7 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r3 = r3 + r7
            goto L8
        L34:
            int r3 = r15.length
            if (r7 >= r3) goto L48
            r3 = r0[r7]
            r10 = r15[r7]
            double r10 = r10.eval(r8)
            r0[r7] = r10
            double r3 = r3 - r10
            double r3 = r3 * r3
            double r1 = r1 + r3
            int r7 = r7 + 1
            goto L34
        L48:
            double r0 = java.lang.Math.sqrt(r1)
            double r0 = r0 + r5
            return r0
    }

    public double getPos(double r6, int r8) {
            r5 = this;
            double r0 = r5.mTotalLength
            double r6 = r6 * r0
            r0 = 0
        L5:
            double[] r1 = r5.mCurveLength
            int r2 = r1.length
            int r2 = r2 + (-1)
            if (r0 >= r2) goto L18
            r2 = r1[r0]
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L18
            r2 = r1[r0]
            double r6 = r6 - r2
            int r0 = r0 + 1
            goto L5
        L18:
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[][] r2 = r5.mCurve
            r8 = r2[r8]
            r8 = r8[r0]
            r0 = r1[r0]
            double r6 = r6 / r0
            double r6 = r8.eval(r6)
            return r6
    }

    public void getPos(double r7, double[] r9) {
            r6 = this;
            double r0 = r6.mTotalLength
            double r7 = r7 * r0
            r0 = 0
            r1 = 0
        L6:
            double[] r2 = r6.mCurveLength
            int r3 = r2.length
            int r3 = r3 + (-1)
            if (r1 >= r3) goto L19
            r3 = r2[r1]
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 >= 0) goto L19
            r3 = r2[r1]
            double r7 = r7 - r3
            int r1 = r1 + 1
            goto L6
        L19:
            int r2 = r9.length
            if (r0 >= r2) goto L31
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[][] r2 = r6.mCurve
            r2 = r2[r0]
            r2 = r2[r1]
            double[] r3 = r6.mCurveLength
            r4 = r3[r1]
            double r3 = r7 / r4
            double r2 = r2.eval(r3)
            r9[r0] = r2
            int r0 = r0 + 1
            goto L19
        L31:
            return
    }

    public void getPos(double r7, float[] r9) {
            r6 = this;
            double r0 = r6.mTotalLength
            double r7 = r7 * r0
            r0 = 0
            r1 = 0
        L6:
            double[] r2 = r6.mCurveLength
            int r3 = r2.length
            int r3 = r3 + (-1)
            if (r1 >= r3) goto L19
            r3 = r2[r1]
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 >= 0) goto L19
            r3 = r2[r1]
            double r7 = r7 - r3
            int r1 = r1 + 1
            goto L6
        L19:
            int r2 = r9.length
            if (r0 >= r2) goto L32
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[][] r2 = r6.mCurve
            r2 = r2[r0]
            r2 = r2[r1]
            double[] r3 = r6.mCurveLength
            r4 = r3[r1]
            double r3 = r7 / r4
            double r2 = r2.eval(r3)
            float r2 = (float) r2
            r9[r0] = r2
            int r0 = r0 + 1
            goto L19
        L32:
            return
    }

    public void getVelocity(double r7, double[] r9) {
            r6 = this;
            double r0 = r6.mTotalLength
            double r7 = r7 * r0
            r0 = 0
            r1 = 0
        L6:
            double[] r2 = r6.mCurveLength
            int r3 = r2.length
            int r3 = r3 + (-1)
            if (r1 >= r3) goto L19
            r3 = r2[r1]
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 >= 0) goto L19
            r3 = r2[r1]
            double r7 = r7 - r3
            int r1 = r1 + 1
            goto L6
        L19:
            int r2 = r9.length
            if (r0 >= r2) goto L31
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[][] r2 = r6.mCurve
            r2 = r2[r0]
            r2 = r2[r1]
            double[] r3 = r6.mCurveLength
            r4 = r3[r1]
            double r3 = r7 / r4
            double r2 = r2.vel(r3)
            r9[r0] = r2
            int r0 = r0 + 1
            goto L19
        L31:
            return
    }

    public void setup(double[][] r28) {
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = 0
            r3 = r1[r2]
            int r3 = r3.length
            r0.mDimensionality = r3
            int r4 = r1.length
            r0.mPoints = r4
            r5 = 2
            int[] r5 = new int[r5]
            r6 = 1
            r5[r6] = r4
            r5[r2] = r3
            java.lang.Class<double> r3 = double.class
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r5)
            double[][] r3 = (double[][]) r3
            r0.mCtl = r3
            int r3 = r0.mDimensionality
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[][] r3 = new androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[r3][]
            r0.mCurve = r3
            r3 = 0
        L26:
            int r4 = r0.mDimensionality
            if (r3 >= r4) goto L3f
            r4 = 0
        L2b:
            int r5 = r0.mPoints
            if (r4 >= r5) goto L3c
            double[][] r5 = r0.mCtl
            r5 = r5[r3]
            r7 = r1[r4]
            r8 = r7[r3]
            r5[r4] = r8
            int r4 = r4 + 1
            goto L2b
        L3c:
            int r3 = r3 + 1
            goto L26
        L3f:
            r1 = 0
        L40:
            int r3 = r0.mDimensionality
            if (r1 >= r3) goto L10c
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[][] r3 = r0.mCurve
            double[][] r4 = r0.mCtl
            r5 = r4[r1]
            int r5 = r5.length
            r4 = r4[r1]
            double[] r7 = new double[r5]
            double[] r8 = new double[r5]
            double[] r9 = new double[r5]
            int r5 = r5 + (-1)
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r7[r2] = r10
            r10 = 1
        L5a:
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r10 >= r5) goto L6b
            r13 = 4616189618054758400(0x4010000000000000, double:4.0)
            int r15 = r10 + (-1)
            r15 = r7[r15]
            double r13 = r13 - r15
            double r11 = r11 / r13
            r7[r10] = r11
            int r10 = r10 + 1
            goto L5a
        L6b:
            int r10 = r5 + (-1)
            r13 = r7[r10]
            r15 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = r15 - r13
            double r11 = r11 / r13
            r7[r5] = r11
            r11 = r4[r6]
            r13 = r4[r2]
            double r11 = r11 - r13
            r13 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r11 = r11 * r13
            r17 = r7[r2]
            double r11 = r11 * r17
            r8[r2] = r11
            r11 = 1
        L86:
            if (r11 >= r5) goto La0
            int r12 = r11 + 1
            r17 = r4[r12]
            int r19 = r11 + (-1)
            r20 = r4[r19]
            double r17 = r17 - r20
            double r17 = r17 * r13
            r19 = r8[r19]
            double r17 = r17 - r19
            r19 = r7[r11]
            double r17 = r17 * r19
            r8[r11] = r17
            r11 = r12
            goto L86
        La0:
            r11 = r4[r5]
            r17 = r4[r10]
            double r11 = r11 - r17
            double r11 = r11 * r13
            r17 = r8[r10]
            double r11 = r11 - r17
            r17 = r7[r5]
            double r11 = r11 * r17
            r8[r5] = r11
            r11 = r8[r5]
            r9[r5] = r11
        Lb6:
            if (r10 < 0) goto Lc9
            r11 = r8[r10]
            r17 = r7[r10]
            int r19 = r10 + 1
            r19 = r9[r19]
            double r17 = r17 * r19
            double r11 = r11 - r17
            r9[r10] = r11
            int r10 = r10 + (-1)
            goto Lb6
        Lc9:
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[] r7 = new androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[r5]
            r8 = 0
        Lcc:
            if (r8 >= r5) goto L106
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic r10 = new androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic
            r11 = r4[r8]
            float r11 = (float) r11
            double r11 = (double) r11
            r20 = r9[r8]
            int r26 = r8 + 1
            r17 = r4[r26]
            r22 = r4[r8]
            double r17 = r17 - r22
            double r17 = r17 * r13
            r22 = r9[r8]
            double r22 = r22 * r15
            double r17 = r17 - r22
            r22 = r9[r26]
            double r22 = r17 - r22
            r17 = r4[r8]
            r24 = r4[r26]
            double r17 = r17 - r24
            double r17 = r17 * r15
            r24 = r9[r8]
            double r17 = r17 + r24
            r24 = r9[r26]
            double r24 = r17 + r24
            r17 = r10
            r18 = r11
            r17.<init>(r18, r20, r22, r24)
            r7[r8] = r10
            r8 = r26
            goto Lcc
        L106:
            r3[r1] = r7
            int r1 = r1 + 1
            goto L40
        L10c:
            int r1 = r0.mPoints
            int r1 = r1 - r6
            double[] r1 = new double[r1]
            r0.mCurveLength = r1
            r4 = 0
            r0.mTotalLength = r4
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[] r1 = new androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[r3]
            r3 = 0
        L11a:
            double[] r4 = r0.mCurveLength
            int r4 = r4.length
            if (r3 >= r4) goto L13f
            r4 = 0
        L120:
            int r5 = r0.mDimensionality
            if (r4 >= r5) goto L12f
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[][] r5 = r0.mCurve
            r5 = r5[r4]
            r5 = r5[r3]
            r1[r4] = r5
            int r4 = r4 + 1
            goto L120
        L12f:
            double r4 = r0.mTotalLength
            double[] r6 = r0.mCurveLength
            double r7 = r0.approxLength(r1)
            r6[r3] = r7
            double r4 = r4 + r7
            r0.mTotalLength = r4
            int r3 = r3 + 1
            goto L11a
        L13f:
            return
    }
}
