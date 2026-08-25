package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public class MonotonicCurveFit extends androidx.constraintlayout.core.motion.utils.CurveFit {
    private static final java.lang.String TAG = "MonotonicCurveFit";
    private boolean mExtrapolate;
    public double[] mSlopeTemp;
    private double[] mT;
    private double[][] mTangent;
    private double[][] mY;

    public MonotonicCurveFit(double[] r23, double[][] r24) {
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.Class<double> r3 = double.class
            r22.<init>()
            r4 = 1
            r0.mExtrapolate = r4
            int r5 = r1.length
            r6 = 0
            r7 = r2[r6]
            int r7 = r7.length
            double[] r8 = new double[r7]
            r0.mSlopeTemp = r8
            int r8 = r5 + (-1)
            r9 = 2
            int[] r10 = new int[r9]
            r10[r4] = r7
            r10[r6] = r8
            java.lang.Object r10 = java.lang.reflect.Array.newInstance(r3, r10)
            double[][] r10 = (double[][]) r10
            int[] r11 = new int[r9]
            r11[r4] = r7
            r11[r6] = r5
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r11)
            double[][] r3 = (double[][]) r3
            r4 = 0
        L33:
            if (r4 >= r7) goto L7d
            r11 = 0
        L36:
            if (r11 >= r8) goto L70
            int r12 = r11 + 1
            r13 = r1[r12]
            r15 = r1[r11]
            double r13 = r13 - r15
            r15 = r10[r11]
            r16 = r2[r12]
            r17 = r16[r4]
            r16 = r2[r11]
            r19 = r16[r4]
            double r17 = r17 - r19
            double r17 = r17 / r13
            r15[r4] = r17
            if (r11 != 0) goto L5a
            r13 = r3[r11]
            r11 = r10[r11]
            r14 = r11[r4]
            r13[r4] = r14
            goto L6e
        L5a:
            r13 = r3[r11]
            int r14 = r11 + (-1)
            r14 = r10[r14]
            r15 = r14[r4]
            r11 = r10[r11]
            r17 = r11[r4]
            double r15 = r15 + r17
            r17 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r15 = r15 * r17
            r13[r4] = r15
        L6e:
            r11 = r12
            goto L36
        L70:
            r11 = r3[r8]
            int r12 = r5 + (-2)
            r12 = r10[r12]
            r13 = r12[r4]
            r11[r4] = r13
            int r4 = r4 + 1
            goto L33
        L7d:
            r4 = 0
        L7e:
            if (r4 >= r8) goto Ld9
            r5 = 0
        L81:
            if (r5 >= r7) goto Ld6
            r9 = r10[r4]
            r11 = r9[r5]
            r13 = 0
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 != 0) goto L98
            r9 = r3[r4]
            r9[r5] = r13
            int r9 = r4 + 1
            r9 = r3[r9]
            r9[r5] = r13
            goto Ld3
        L98:
            r9 = r3[r4]
            r11 = r9[r5]
            r9 = r10[r4]
            r13 = r9[r5]
            double r11 = r11 / r13
            int r9 = r4 + 1
            r13 = r3[r9]
            r14 = r13[r5]
            r13 = r10[r4]
            r16 = r13[r5]
            double r14 = r14 / r16
            double r16 = java.lang.Math.hypot(r11, r14)
            r18 = 4621256167635550208(0x4022000000000000, double:9.0)
            int r13 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r13 <= 0) goto Ld3
            r18 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r18 = r18 / r16
            r13 = r3[r4]
            double r11 = r11 * r18
            r16 = r10[r4]
            r20 = r16[r5]
            double r11 = r11 * r20
            r13[r5] = r11
            r9 = r3[r9]
            double r18 = r18 * r14
            r11 = r10[r4]
            r12 = r11[r5]
            double r18 = r18 * r12
            r9[r5] = r18
        Ld3:
            int r5 = r5 + 1
            goto L81
        Ld6:
            int r4 = r4 + 1
            goto L7e
        Ld9:
            r0.mT = r1
            r0.mY = r2
            r0.mTangent = r3
            return
    }

    public static androidx.constraintlayout.core.motion.utils.MonotonicCurveFit buildWave(java.lang.String r8) {
            int r0 = r8.length()
            int r0 = r0 / 2
            double[] r0 = new double[r0]
            r1 = 40
            int r1 = r8.indexOf(r1)
            int r1 = r1 + 1
            r2 = 44
            int r3 = r8.indexOf(r2, r1)
            r4 = 0
        L17:
            r5 = -1
            if (r3 == r5) goto L32
            java.lang.String r1 = r8.substring(r1, r3)
            java.lang.String r1 = r1.trim()
            int r5 = r4 + 1
            double r6 = java.lang.Double.parseDouble(r1)
            r0[r4] = r6
            int r1 = r3 + 1
            int r3 = r8.indexOf(r2, r1)
            r4 = r5
            goto L17
        L32:
            r2 = 41
            int r2 = r8.indexOf(r2, r1)
            java.lang.String r8 = r8.substring(r1, r2)
            java.lang.String r8 = r8.trim()
            int r1 = r4 + 1
            double r2 = java.lang.Double.parseDouble(r8)
            r0[r4] = r2
            double[] r8 = java.util.Arrays.copyOf(r0, r1)
            androidx.constraintlayout.core.motion.utils.MonotonicCurveFit r8 = buildWave(r8)
            return r8
    }

    private static androidx.constraintlayout.core.motion.utils.MonotonicCurveFit buildWave(double[] r18) {
            r0 = r18
            int r1 = r0.length
            int r1 = r1 * 3
            r2 = 2
            int r1 = r1 - r2
            int r3 = r0.length
            r4 = 1
            int r3 = r3 - r4
            double r5 = (double) r3
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r7 / r5
            int[] r2 = new int[r2]
            r2[r4] = r4
            r4 = 0
            r2[r4] = r1
            java.lang.Class<double> r9 = double.class
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r9, r2)
            double[][] r2 = (double[][]) r2
            double[] r1 = new double[r1]
            r9 = 0
        L21:
            int r10 = r0.length
            if (r9 >= r10) goto L51
            r10 = r0[r9]
            int r12 = r9 + r3
            r13 = r2[r12]
            r13[r4] = r10
            double r13 = (double) r9
            double r13 = r13 * r5
            r1[r12] = r13
            if (r9 <= 0) goto L4e
            int r12 = r3 * 2
            int r12 = r12 + r9
            r15 = r2[r12]
            double r16 = r10 + r7
            r15[r4] = r16
            double r15 = r13 + r7
            r1[r12] = r15
            int r12 = r9 + (-1)
            r15 = r2[r12]
            double r10 = r10 - r7
            double r10 = r10 - r5
            r15[r4] = r10
            r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r13 = r13 + r10
            double r13 = r13 - r5
            r1[r12] = r13
        L4e:
            int r9 = r9 + 1
            goto L21
        L51:
            androidx.constraintlayout.core.motion.utils.MonotonicCurveFit r0 = new androidx.constraintlayout.core.motion.utils.MonotonicCurveFit
            r0.<init>(r1, r2)
            return r0
    }

    private static double diff(double r10, double r12, double r14, double r16, double r18, double r20) {
            double r0 = r12 * r12
            r2 = -4604930618986332160(0xc018000000000000, double:-6.0)
            double r2 = r2 * r0
            double r2 = r2 * r16
            r4 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r6 = r12 * r4
            double r8 = r6 * r16
            double r8 = r8 + r2
            double r4 = r4 * r0
            double r4 = r4 * r14
            double r4 = r4 + r8
            double r6 = r6 * r14
            double r4 = r4 - r6
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r2 = r2 * r10
            double r6 = r2 * r20
            double r6 = r6 * r0
            double r6 = r6 + r4
            double r2 = r2 * r18
            double r2 = r2 * r0
            double r2 = r2 + r6
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 * r10
            double r0 = r0 * r20
            double r0 = r0 * r12
            double r2 = r2 - r0
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r0 = r0 * r10
            double r0 = r0 * r18
            double r0 = r0 * r12
            double r2 = r2 - r0
            double r0 = r10 * r18
            double r0 = r0 + r2
            return r0
    }

    private static double interpolate(double r12, double r14, double r16, double r18, double r20, double r22) {
            double r0 = r14 * r14
            double r2 = r0 * r14
            r4 = -4611686018427387904(0xc000000000000000, double:-2.0)
            double r4 = r4 * r2
            double r4 = r4 * r18
            r6 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r6 = r6 * r0
            double r8 = r6 * r18
            double r8 = r8 + r4
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r2 * r4
            double r10 = r10 * r16
            double r10 = r10 + r8
            double r6 = r6 * r16
            double r10 = r10 - r6
            double r10 = r10 + r16
            double r6 = r12 * r22
            double r8 = r6 * r2
            double r8 = r8 + r10
            double r10 = r12 * r20
            double r2 = r2 * r10
            double r2 = r2 + r8
            double r6 = r6 * r0
            double r2 = r2 - r6
            double r4 = r4 * r12
            double r4 = r4 * r20
            double r4 = r4 * r0
            double r2 = r2 - r4
            double r10 = r10 * r14
            double r10 = r10 + r2
            return r10
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double r23, int r25) {
            r22 = this;
            r0 = r22
            r1 = r25
            double[] r2 = r0.mT
            int r3 = r2.length
            boolean r4 = r0.mExtrapolate
            r5 = 0
            if (r4 == 0) goto L42
            r6 = r2[r5]
            int r4 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r4 > 0) goto L26
            double[][] r3 = r0.mY
            r3 = r3[r5]
            r6 = r3[r1]
            r3 = r2[r5]
            double r3 = r23 - r3
            r8 = r2[r5]
            double r1 = r0.getSlope(r8, r1)
            double r1 = r1 * r3
            double r1 = r1 + r6
            return r1
        L26:
            int r4 = r3 + (-1)
            r6 = r2[r4]
            int r8 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r8 < 0) goto L5e
            double[][] r3 = r0.mY
            r3 = r3[r4]
            r5 = r3[r1]
            r7 = r2[r4]
            double r7 = r23 - r7
            r3 = r2[r4]
            double r1 = r0.getSlope(r3, r1)
            double r1 = r1 * r7
            double r1 = r1 + r5
            return r1
        L42:
            r6 = r2[r5]
            int r4 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r4 > 0) goto L4f
            double[][] r2 = r0.mY
            r2 = r2[r5]
            r1 = r2[r1]
            return r1
        L4f:
            int r4 = r3 + (-1)
            r6 = r2[r4]
            int r2 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r2 < 0) goto L5e
            double[][] r2 = r0.mY
            r2 = r2[r4]
            r1 = r2[r1]
            return r1
        L5e:
            int r2 = r3 + (-1)
            if (r5 >= r2) goto La0
            double[] r2 = r0.mT
            r6 = r2[r5]
            int r4 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r4 != 0) goto L71
            double[][] r2 = r0.mY
            r2 = r2[r5]
            r1 = r2[r1]
            return r1
        L71:
            int r4 = r5 + 1
            r6 = r2[r4]
            int r8 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r8 >= 0) goto L9e
            r6 = r2[r4]
            r8 = r2[r5]
            double r10 = r6 - r8
            r6 = r2[r5]
            double r2 = r23 - r6
            double r12 = r2 / r10
            double[][] r2 = r0.mY
            r3 = r2[r5]
            r14 = r3[r1]
            r2 = r2[r4]
            r16 = r2[r1]
            double[][] r2 = r0.mTangent
            r3 = r2[r5]
            r18 = r3[r1]
            r2 = r2[r4]
            r20 = r2[r1]
            double r1 = interpolate(r10, r12, r14, r16, r18, r20)
            return r1
        L9e:
            r5 = r4
            goto L5e
        La0:
            r1 = 0
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double r24, double[] r26) {
            r23 = this;
            r0 = r23
            double[] r1 = r0.mT
            int r2 = r1.length
            double[][] r3 = r0.mY
            r4 = 0
            r3 = r3[r4]
            int r3 = r3.length
            boolean r5 = r0.mExtrapolate
            if (r5 == 0) goto L62
            r5 = r1[r4]
            int r7 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r7 > 0) goto L38
            r5 = r1[r4]
            double[] r1 = r0.mSlopeTemp
            r0.getSlope(r5, r1)
            r1 = 0
        L1d:
            if (r1 >= r3) goto L37
            double[][] r2 = r0.mY
            r2 = r2[r4]
            r5 = r2[r1]
            double[] r2 = r0.mT
            r7 = r2[r4]
            double r7 = r24 - r7
            double[] r2 = r0.mSlopeTemp
            r9 = r2[r1]
            double r7 = r7 * r9
            double r7 = r7 + r5
            r26[r1] = r7
            int r1 = r1 + 1
            goto L1d
        L37:
            return
        L38:
            int r5 = r2 + (-1)
            r6 = r1[r5]
            int r8 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r8 < 0) goto L8d
            r6 = r1[r5]
            double[] r1 = r0.mSlopeTemp
            r0.getSlope(r6, r1)
        L47:
            if (r4 >= r3) goto L61
            double[][] r1 = r0.mY
            r1 = r1[r5]
            r6 = r1[r4]
            double[] r1 = r0.mT
            r8 = r1[r5]
            double r1 = r24 - r8
            double[] r8 = r0.mSlopeTemp
            r9 = r8[r4]
            double r1 = r1 * r9
            double r1 = r1 + r6
            r26[r4] = r1
            int r4 = r4 + 1
            goto L47
        L61:
            return
        L62:
            r5 = r1[r4]
            int r7 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r7 > 0) goto L77
            r1 = 0
        L69:
            if (r1 >= r3) goto L76
            double[][] r2 = r0.mY
            r2 = r2[r4]
            r5 = r2[r1]
            r26[r1] = r5
            int r1 = r1 + 1
            goto L69
        L76:
            return
        L77:
            int r5 = r2 + (-1)
            r6 = r1[r5]
            int r1 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r1 < 0) goto L8d
        L7f:
            if (r4 >= r3) goto L8c
            double[][] r1 = r0.mY
            r1 = r1[r5]
            r6 = r1[r4]
            r26[r4] = r6
            int r4 = r4 + 1
            goto L7f
        L8c:
            return
        L8d:
            r1 = 0
        L8e:
            int r5 = r2 + (-1)
            if (r1 >= r5) goto Le0
            double[] r5 = r0.mT
            r6 = r5[r1]
            int r5 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r5 != 0) goto La8
            r5 = 0
        L9b:
            if (r5 >= r3) goto La8
            double[][] r6 = r0.mY
            r6 = r6[r1]
            r7 = r6[r5]
            r26[r5] = r7
            int r5 = r5 + 1
            goto L9b
        La8:
            double[] r5 = r0.mT
            int r6 = r1 + 1
            r7 = r5[r6]
            int r9 = (r24 > r7 ? 1 : (r24 == r7 ? 0 : -1))
            if (r9 >= 0) goto Lde
            r7 = r5[r6]
            r9 = r5[r1]
            double r7 = r7 - r9
            r9 = r5[r1]
            double r9 = r24 - r9
            double r9 = r9 / r7
        Lbc:
            if (r4 >= r3) goto Ldd
            double[][] r2 = r0.mY
            r5 = r2[r1]
            r15 = r5[r4]
            r2 = r2[r6]
            r17 = r2[r4]
            double[][] r2 = r0.mTangent
            r5 = r2[r1]
            r19 = r5[r4]
            r2 = r2[r6]
            r21 = r2[r4]
            r11 = r7
            r13 = r9
            double r11 = interpolate(r11, r13, r15, r17, r19, r21)
            r26[r4] = r11
            int r4 = r4 + 1
            goto Lbc
        Ldd:
            return
        Lde:
            r1 = r6
            goto L8e
        Le0:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double r24, float[] r26) {
            r23 = this;
            r0 = r23
            double[] r1 = r0.mT
            int r2 = r1.length
            double[][] r3 = r0.mY
            r4 = 0
            r3 = r3[r4]
            int r3 = r3.length
            boolean r5 = r0.mExtrapolate
            if (r5 == 0) goto L64
            r5 = r1[r4]
            int r7 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r7 > 0) goto L39
            r5 = r1[r4]
            double[] r1 = r0.mSlopeTemp
            r0.getSlope(r5, r1)
            r1 = 0
        L1d:
            if (r1 >= r3) goto L38
            double[][] r2 = r0.mY
            r2 = r2[r4]
            r5 = r2[r1]
            double[] r2 = r0.mT
            r7 = r2[r4]
            double r7 = r24 - r7
            double[] r2 = r0.mSlopeTemp
            r9 = r2[r1]
            double r7 = r7 * r9
            double r7 = r7 + r5
            float r2 = (float) r7
            r26[r1] = r2
            int r1 = r1 + 1
            goto L1d
        L38:
            return
        L39:
            int r5 = r2 + (-1)
            r6 = r1[r5]
            int r8 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r8 < 0) goto L91
            r6 = r1[r5]
            double[] r1 = r0.mSlopeTemp
            r0.getSlope(r6, r1)
        L48:
            if (r4 >= r3) goto L63
            double[][] r1 = r0.mY
            r1 = r1[r5]
            r6 = r1[r4]
            double[] r1 = r0.mT
            r8 = r1[r5]
            double r1 = r24 - r8
            double[] r8 = r0.mSlopeTemp
            r9 = r8[r4]
            double r1 = r1 * r9
            double r1 = r1 + r6
            float r1 = (float) r1
            r26[r4] = r1
            int r4 = r4 + 1
            goto L48
        L63:
            return
        L64:
            r5 = r1[r4]
            int r7 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r7 > 0) goto L7a
            r1 = 0
        L6b:
            if (r1 >= r3) goto L79
            double[][] r2 = r0.mY
            r2 = r2[r4]
            r5 = r2[r1]
            float r2 = (float) r5
            r26[r1] = r2
            int r1 = r1 + 1
            goto L6b
        L79:
            return
        L7a:
            int r5 = r2 + (-1)
            r6 = r1[r5]
            int r1 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r1 < 0) goto L91
        L82:
            if (r4 >= r3) goto L90
            double[][] r1 = r0.mY
            r1 = r1[r5]
            r6 = r1[r4]
            float r1 = (float) r6
            r26[r4] = r1
            int r4 = r4 + 1
            goto L82
        L90:
            return
        L91:
            r1 = 0
        L92:
            int r5 = r2 + (-1)
            if (r1 >= r5) goto Le6
            double[] r5 = r0.mT
            r6 = r5[r1]
            int r5 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r5 != 0) goto Lad
            r5 = 0
        L9f:
            if (r5 >= r3) goto Lad
            double[][] r6 = r0.mY
            r6 = r6[r1]
            r7 = r6[r5]
            float r6 = (float) r7
            r26[r5] = r6
            int r5 = r5 + 1
            goto L9f
        Lad:
            double[] r5 = r0.mT
            int r6 = r1 + 1
            r7 = r5[r6]
            int r9 = (r24 > r7 ? 1 : (r24 == r7 ? 0 : -1))
            if (r9 >= 0) goto Le4
            r7 = r5[r6]
            r9 = r5[r1]
            double r7 = r7 - r9
            r9 = r5[r1]
            double r9 = r24 - r9
            double r9 = r9 / r7
        Lc1:
            if (r4 >= r3) goto Le3
            double[][] r2 = r0.mY
            r5 = r2[r1]
            r15 = r5[r4]
            r2 = r2[r6]
            r17 = r2[r4]
            double[][] r2 = r0.mTangent
            r5 = r2[r1]
            r19 = r5[r4]
            r2 = r2[r6]
            r21 = r2[r4]
            r11 = r7
            r13 = r9
            double r11 = interpolate(r11, r13, r15, r17, r19, r21)
            float r2 = (float) r11
            r26[r4] = r2
            int r4 = r4 + 1
            goto Lc1
        Le3:
            return
        Le4:
            r1 = r6
            goto L92
        Le6:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double r24, int r26) {
            r23 = this;
            r0 = r23
            double[] r1 = r0.mT
            int r2 = r1.length
            r3 = 0
            r4 = r1[r3]
            int r6 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1))
            if (r6 >= 0) goto Lf
            r4 = r1[r3]
            goto L1c
        Lf:
            int r4 = r2 + (-1)
            r5 = r1[r4]
            int r7 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r7 < 0) goto L1a
            r4 = r1[r4]
            goto L1c
        L1a:
            r4 = r24
        L1c:
            int r1 = r2 + (-1)
            if (r3 >= r1) goto L51
            double[] r1 = r0.mT
            int r6 = r3 + 1
            r7 = r1[r6]
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 > 0) goto L4f
            r7 = r1[r6]
            r9 = r1[r3]
            double r7 = r7 - r9
            r9 = r1[r3]
            double r4 = r4 - r9
            double r13 = r4 / r7
            double[][] r1 = r0.mY
            r2 = r1[r3]
            r15 = r2[r26]
            r1 = r1[r6]
            r17 = r1[r26]
            double[][] r1 = r0.mTangent
            r2 = r1[r3]
            r19 = r2[r26]
            r1 = r1[r6]
            r21 = r1[r26]
            r11 = r7
            double r1 = diff(r11, r13, r15, r17, r19, r21)
            double r1 = r1 / r7
            return r1
        L4f:
            r3 = r6
            goto L1c
        L51:
            r1 = 0
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double r26, double[] r28) {
            r25 = this;
            r0 = r25
            double[] r1 = r0.mT
            int r2 = r1.length
            double[][] r3 = r0.mY
            r4 = 0
            r3 = r3[r4]
            int r3 = r3.length
            r5 = r1[r4]
            int r7 = (r26 > r5 ? 1 : (r26 == r5 ? 0 : -1))
            if (r7 > 0) goto L14
            r5 = r1[r4]
            goto L21
        L14:
            int r5 = r2 + (-1)
            r6 = r1[r5]
            int r8 = (r26 > r6 ? 1 : (r26 == r6 ? 0 : -1))
            if (r8 < 0) goto L1f
            r5 = r1[r5]
            goto L21
        L1f:
            r5 = r26
        L21:
            r1 = 0
        L22:
            int r7 = r2 + (-1)
            if (r1 >= r7) goto L5d
            double[] r7 = r0.mT
            int r8 = r1 + 1
            r9 = r7[r8]
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 > 0) goto L5b
            r9 = r7[r8]
            r11 = r7[r1]
            double r9 = r9 - r11
            r11 = r7[r1]
            double r5 = r5 - r11
            double r5 = r5 / r9
        L39:
            if (r4 >= r3) goto L5d
            double[][] r2 = r0.mY
            r7 = r2[r1]
            r17 = r7[r4]
            r2 = r2[r8]
            r19 = r2[r4]
            double[][] r2 = r0.mTangent
            r7 = r2[r1]
            r21 = r7[r4]
            r2 = r2[r8]
            r23 = r2[r4]
            r13 = r9
            r15 = r5
            double r11 = diff(r13, r15, r17, r19, r21, r23)
            double r11 = r11 / r9
            r28[r4] = r11
            int r4 = r4 + 1
            goto L39
        L5b:
            r1 = r8
            goto L22
        L5d:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
            r1 = this;
            double[] r0 = r1.mT
            return r0
    }
}
