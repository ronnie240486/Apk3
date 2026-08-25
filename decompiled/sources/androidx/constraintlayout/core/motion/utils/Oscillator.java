package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public class Oscillator {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int CUSTOM = 7;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static java.lang.String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;
    public double PI2;
    public double[] mArea;
    public androidx.constraintlayout.core.motion.utils.MonotonicCurveFit mCustomCurve;
    private boolean mNormalized;
    public float[] mPeriod;
    public double[] mPosition;
    public int mType;

    public Oscillator() {
            r3 = this;
            r3.<init>()
            r0 = 0
            float[] r1 = new float[r0]
            r3.mPeriod = r1
            double[] r1 = new double[r0]
            r3.mPosition = r1
            r1 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            r3.PI2 = r1
            r3.mNormalized = r0
            return
    }

    public void addPoint(double r5, float r7) {
            r4 = this;
            float[] r0 = r4.mPeriod
            int r0 = r0.length
            int r0 = r0 + 1
            double[] r1 = r4.mPosition
            int r1 = java.util.Arrays.binarySearch(r1, r5)
            if (r1 >= 0) goto L10
            int r1 = -r1
            int r1 = r1 + (-1)
        L10:
            double[] r2 = r4.mPosition
            double[] r2 = java.util.Arrays.copyOf(r2, r0)
            r4.mPosition = r2
            float[] r2 = r4.mPeriod
            float[] r2 = java.util.Arrays.copyOf(r2, r0)
            r4.mPeriod = r2
            double[] r2 = new double[r0]
            r4.mArea = r2
            double[] r2 = r4.mPosition
            int r3 = r1 + 1
            int r0 = r0 - r1
            int r0 = r0 + (-1)
            java.lang.System.arraycopy(r2, r1, r2, r3, r0)
            double[] r0 = r4.mPosition
            r0[r1] = r5
            float[] r5 = r4.mPeriod
            r5[r1] = r7
            r5 = 0
            r4.mNormalized = r5
            return
    }

    public final double getP(double r11) {
            r10 = this;
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2 = 0
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 >= 0) goto La
            r11 = r2
            goto Lf
        La:
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 <= 0) goto Lf
            r11 = r0
        Lf:
            double[] r4 = r10.mPosition
            int r4 = java.util.Arrays.binarySearch(r4, r11)
            if (r4 <= 0) goto L18
            goto L54
        L18:
            if (r4 == 0) goto L53
            int r0 = -r4
            int r0 = r0 + (-1)
            float[] r1 = r10.mPeriod
            r2 = r1[r0]
            int r3 = r0 + (-1)
            r4 = r1[r3]
            float r2 = r2 - r4
            double r4 = (double) r2
            double[] r2 = r10.mPosition
            r6 = r2[r0]
            r8 = r2[r3]
            double r6 = r6 - r8
            double r4 = r4 / r6
            double[] r0 = r10.mArea
            r6 = r0[r3]
            r0 = r1[r3]
            double r0 = (double) r0
            r8 = r2[r3]
            double r8 = r8 * r4
            double r0 = r0 - r8
            r8 = r2[r3]
            double r8 = r11 - r8
            double r8 = r8 * r0
            double r8 = r8 + r6
            double r11 = r11 * r11
            r0 = r2[r3]
            r6 = r2[r3]
            double r0 = r0 * r6
            double r11 = r11 - r0
            double r11 = r11 * r4
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r11 = r11 / r0
            double r0 = r11 + r8
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
    }

    public double getSlope(double r20, double r22, double r24) {
            r19 = this;
            r0 = r19
            double r1 = r19.getP(r20)
            double r1 = r1 + r22
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            int r7 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r7 > 0) goto L16
            r7 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            goto L22
        L16:
            int r7 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r7 < 0) goto L20
            r7 = 4607182409792818153(0x3feffffde7210be9, double:0.999999)
            goto L22
        L20:
            r7 = r20
        L22:
            double[] r9 = r0.mPosition
            int r9 = java.util.Arrays.binarySearch(r9, r7)
            if (r9 <= 0) goto L2b
            goto L4f
        L2b:
            if (r9 == 0) goto L4f
            int r9 = -r9
            int r9 = r9 + (-1)
            float[] r10 = r0.mPeriod
            r11 = r10[r9]
            int r12 = r9 + (-1)
            r13 = r10[r12]
            float r11 = r11 - r13
            double r13 = (double) r11
            double[] r11 = r0.mPosition
            r15 = r11[r9]
            r17 = r11[r12]
            double r15 = r15 - r17
            double r13 = r13 / r15
            double r7 = r7 * r13
            r9 = r10[r12]
            double r9 = (double) r9
            r15 = r11[r12]
            double r13 = r13 * r15
            double r9 = r9 - r13
            double r9 = r9 + r7
            goto L50
        L4f:
            r9 = r5
        L50:
            double r9 = r9 + r24
            int r7 = r0.mType
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            r13 = 4616189618054758400(0x4010000000000000, double:4.0)
            switch(r7) {
                case 1: goto La0;
                case 2: goto L90;
                case 3: goto L8d;
                case 4: goto L89;
                case 5: goto L7b;
                case 6: goto L71;
                case 7: goto L68;
                default: goto L5b;
            }
        L5b:
            double r3 = r0.PI2
            double r9 = r9 * r3
            double r3 = r3 * r1
            double r1 = java.lang.Math.cos(r3)
            double r1 = r1 * r9
            return r1
        L68:
            androidx.constraintlayout.core.motion.utils.MonotonicCurveFit r5 = r0.mCustomCurve
            double r1 = r1 % r3
            r3 = 0
            double r1 = r5.getSlope(r1, r3)
            return r1
        L71:
            double r9 = r9 * r13
            double r1 = r1 * r13
            double r1 = r1 + r11
            double r1 = r1 % r13
            double r1 = r1 - r11
            double r1 = r1 * r9
            return r1
        L7b:
            double r3 = r0.PI2
            double r5 = -r3
            double r5 = r5 * r9
            double r3 = r3 * r1
            double r1 = java.lang.Math.sin(r3)
            double r1 = r1 * r5
            return r1
        L89:
            double r1 = -r9
            double r1 = r1 * r11
            return r1
        L8d:
            double r9 = r9 * r11
            return r9
        L90:
            double r9 = r9 * r13
            double r1 = r1 * r13
            r3 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r1 = r1 + r3
            double r1 = r1 % r13
            double r1 = r1 - r11
            double r1 = java.lang.Math.signum(r1)
            double r1 = r1 * r9
            return r1
        La0:
            return r5
    }

    public double getValue(double r8, double r10) {
            r7 = this;
            double r8 = r7.getP(r8)
            double r8 = r8 + r10
            int r0 = r7.mType
            r1 = 4616189618054758400(0x4010000000000000, double:4.0)
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            switch(r0) {
                case 1: goto L4f;
                case 2: goto L45;
                case 3: goto L3f;
                case 4: goto L3a;
                case 5: goto L30;
                case 6: goto L22;
                case 7: goto L19;
                default: goto L10;
            }
        L10:
            double r10 = r7.PI2
            double r10 = r10 * r8
            double r8 = java.lang.Math.sin(r10)
            return r8
        L19:
            androidx.constraintlayout.core.motion.utils.MonotonicCurveFit r10 = r7.mCustomCurve
            double r8 = r8 % r5
            r11 = 0
            double r8 = r10.getPos(r8, r11)
            return r8
        L22:
            double r8 = r8 * r1
            double r8 = r8 % r1
            double r8 = r8 - r3
            double r8 = java.lang.Math.abs(r8)
            double r8 = r5 - r8
            double r8 = r8 * r8
        L2e:
            double r5 = r5 - r8
            return r5
        L30:
            double r0 = r7.PI2
            double r10 = r10 + r8
            double r10 = r10 * r0
            double r8 = java.lang.Math.cos(r10)
            return r8
        L3a:
            double r8 = r8 * r3
            double r8 = r8 + r5
            double r8 = r8 % r3
            goto L2e
        L3f:
            double r8 = r8 * r3
            double r8 = r8 + r5
            double r8 = r8 % r3
            double r8 = r8 - r5
            return r8
        L45:
            double r8 = r8 * r1
            double r8 = r8 + r5
            double r8 = r8 % r1
            double r8 = r8 - r3
            double r8 = java.lang.Math.abs(r8)
            goto L2e
        L4f:
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r8 = r8 % r5
            double r10 = r10 - r8
            double r8 = java.lang.Math.signum(r10)
            return r8
    }

    public void normalize() {
            r17 = this;
            r0 = r17
            r1 = 0
            r2 = 0
            r5 = r2
            r4 = 0
        L7:
            float[] r7 = r0.mPeriod
            int r8 = r7.length
            if (r4 >= r8) goto L13
            r7 = r7[r4]
            double r7 = (double) r7
            double r5 = r5 + r7
            int r4 = r4 + 1
            goto L7
        L13:
            r4 = 1
            r8 = r2
            r7 = 1
        L16:
            float[] r10 = r0.mPeriod
            int r11 = r10.length
            r12 = 1073741824(0x40000000, float:2.0)
            if (r7 >= r11) goto L33
            int r11 = r7 + (-1)
            r13 = r10[r11]
            r10 = r10[r7]
            float r13 = r13 + r10
            float r13 = r13 / r12
            double[] r10 = r0.mPosition
            r14 = r10[r7]
            r11 = r10[r11]
            double r14 = r14 - r11
            double r10 = (double) r13
            double r14 = r14 * r10
            double r8 = r8 + r14
            int r7 = r7 + 1
            goto L16
        L33:
            r7 = 0
        L34:
            float[] r10 = r0.mPeriod
            int r11 = r10.length
            if (r7 >= r11) goto L46
            r11 = r10[r7]
            double r13 = (double) r11
            double r15 = r5 / r8
            double r13 = r13 * r15
            float r11 = (float) r13
            r10[r7] = r11
            int r7 = r7 + 1
            goto L34
        L46:
            double[] r5 = r0.mArea
            r5[r1] = r2
            r1 = 1
        L4b:
            float[] r2 = r0.mPeriod
            int r3 = r2.length
            if (r1 >= r3) goto L6c
            int r3 = r1 + (-1)
            r5 = r2[r3]
            r2 = r2[r1]
            float r5 = r5 + r2
            float r5 = r5 / r12
            double[] r2 = r0.mPosition
            r6 = r2[r1]
            r8 = r2[r3]
            double r6 = r6 - r8
            double[] r2 = r0.mArea
            r8 = r2[r3]
            double r10 = (double) r5
            double r6 = r6 * r10
            double r6 = r6 + r8
            r2[r1] = r6
            int r1 = r1 + 1
            goto L4b
        L6c:
            r0.mNormalized = r4
            return
    }

    public void setType(int r1, java.lang.String r2) {
            r0 = this;
            r0.mType = r1
            if (r2 == 0) goto La
            androidx.constraintlayout.core.motion.utils.MonotonicCurveFit r1 = androidx.constraintlayout.core.motion.utils.MonotonicCurveFit.buildWave(r2)
            r0.mCustomCurve = r1
        La:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "pos ="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            double[] r1 = r2.mPosition
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = " period="
            r0.append(r1)
            float[] r1 = r2.mPeriod
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
