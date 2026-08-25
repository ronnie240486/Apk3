package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes2.dex */
public class ArcCurveFit extends androidx.constraintlayout.core.motion.utils.CurveFit {
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    public androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] mArcs;
    private boolean mExtrapolate;
    private final double[] mTime;

    /* JADX INFO: loaded from: classes.dex */
    public static class Arc {
        private static final double EPSILON = 0.001d;
        private static final java.lang.String TAG = "Arc";
        private static double[] ourPercent;
        public boolean linear;
        public double mArcDistance;
        public double mArcVelocity;
        public double mEllipseA;
        public double mEllipseB;
        public double mEllipseCenterX;
        public double mEllipseCenterY;
        public double[] mLut;
        public double mOneOverDeltaTime;
        public double mTime1;
        public double mTime2;
        public double mTmpCosAngle;
        public double mTmpSinAngle;
        public boolean mVertical;
        public double mX1;
        public double mX2;
        public double mY1;
        public double mY2;

        static {
                r0 = 91
                double[] r0 = new double[r0]
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc.ourPercent = r0
                return
        }

        public Arc(int r21, double r22, double r24, double r26, double r28, double r30, double r32) {
                r20 = this;
                r9 = r20
                r0 = r21
                r1 = r22
                r3 = r24
                r5 = r26
                r7 = r28
                r10 = r30
                r12 = r32
                r20.<init>()
                r14 = 0
                r9.linear = r14
                r15 = 1
                if (r0 != r15) goto L1a
                r14 = 1
            L1a:
                r9.mVertical = r14
                r9.mTime1 = r1
                r9.mTime2 = r3
                r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r1 = r3 - r1
                double r1 = r16 / r1
                r9.mOneOverDeltaTime = r1
                r1 = 3
                if (r1 != r0) goto L2d
                r9.linear = r15
            L2d:
                double r0 = r10 - r5
                double r2 = r12 - r7
                boolean r4 = r9.linear
                if (r4 != 0) goto L8b
                double r16 = java.lang.Math.abs(r0)
                r18 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                int r4 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
                if (r4 < 0) goto L8b
                double r16 = java.lang.Math.abs(r2)
                int r4 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
                if (r4 >= 0) goto L4b
                goto L8b
            L4b:
                r4 = 101(0x65, float:1.42E-43)
                double[] r4 = new double[r4]
                r9.mLut = r4
                boolean r4 = r9.mVertical
                if (r4 == 0) goto L57
                r14 = -1
                goto L58
            L57:
                r14 = 1
            L58:
                double r12 = (double) r14
                double r0 = r0 * r12
                r9.mEllipseA = r0
                if (r4 == 0) goto L60
                goto L61
            L60:
                r15 = -1
            L61:
                double r0 = (double) r15
                double r2 = r2 * r0
                r9.mEllipseB = r2
                if (r4 == 0) goto L6a
                r0 = r10
                goto L6b
            L6a:
                r0 = r5
            L6b:
                r9.mEllipseCenterX = r0
                if (r4 == 0) goto L71
                r0 = r7
                goto L73
            L71:
                r0 = r32
            L73:
                r9.mEllipseCenterY = r0
                r0 = r20
                r1 = r26
                r3 = r28
                r5 = r30
                r7 = r32
                r0.buildTable(r1, r3, r5, r7)
                double r0 = r9.mArcDistance
                double r2 = r9.mOneOverDeltaTime
                double r0 = r0 * r2
                r9.mArcVelocity = r0
                return
            L8b:
                r9.linear = r15
                r9.mX1 = r5
                r9.mX2 = r10
                r9.mY1 = r7
                r4 = r32
                r9.mY2 = r4
                double r4 = java.lang.Math.hypot(r2, r0)
                r9.mArcDistance = r4
                double r6 = r9.mOneOverDeltaTime
                double r4 = r4 * r6
                r9.mArcVelocity = r4
                double r4 = r9.mTime2
                double r6 = r9.mTime1
                double r10 = r4 - r6
                double r0 = r0 / r10
                r9.mEllipseCenterX = r0
                double r4 = r4 - r6
                double r2 = r2 / r4
                r9.mEllipseCenterY = r2
                return
        }

        private void buildTable(double r21, double r23, double r25, double r27) {
                r20 = this;
                r0 = r20
                double r1 = r25 - r21
                double r3 = r23 - r27
                r8 = 0
                r9 = 0
                r11 = 0
                r13 = 0
            Ld:
                double[] r15 = androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc.ourPercent
                int r5 = r15.length
                if (r8 >= r5) goto L4f
                r16 = 4636033603912859648(0x4056800000000000, double:90.0)
                double r6 = (double) r8
                double r6 = r6 * r16
                int r5 = r15.length
                int r5 = r5 + (-1)
                r24 = r9
                double r9 = (double) r5
                double r6 = r6 / r9
                double r5 = java.lang.Math.toRadians(r6)
                double r9 = java.lang.Math.sin(r5)
                double r5 = java.lang.Math.cos(r5)
                double r9 = r9 * r1
                double r5 = r5 * r3
                if (r8 <= 0) goto L43
                double r11 = r9 - r11
                double r13 = r5 - r13
                double r11 = java.lang.Math.hypot(r11, r13)
                r13 = r24
                double r11 = r11 + r13
                double[] r7 = androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc.ourPercent
                r7[r8] = r11
                goto L46
            L43:
                r13 = r24
                r11 = r13
            L46:
                int r8 = r8 + 1
                r13 = r5
                r18 = r9
                r9 = r11
                r11 = r18
                goto Ld
            L4f:
                r13 = r9
                r0.mArcDistance = r13
                r1 = 0
            L53:
                double[] r2 = androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc.ourPercent
                int r3 = r2.length
                if (r1 >= r3) goto L60
                r3 = r2[r1]
                double r3 = r3 / r13
                r2[r1] = r3
                int r1 = r1 + 1
                goto L53
            L60:
                r5 = 0
            L61:
                double[] r1 = r0.mLut
                int r2 = r1.length
                if (r5 >= r2) goto Lad
                double r2 = (double) r5
                int r1 = r1.length
                int r1 = r1 + (-1)
                double r6 = (double) r1
                double r2 = r2 / r6
                double[] r1 = androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc.ourPercent
                int r1 = java.util.Arrays.binarySearch(r1, r2)
                if (r1 < 0) goto L83
                double[] r2 = r0.mLut
                double r3 = (double) r1
                double[] r1 = androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc.ourPercent
                int r1 = r1.length
                int r1 = r1 + (-1)
                double r6 = (double) r1
                double r3 = r3 / r6
                r2[r5] = r3
                r6 = 0
                goto Laa
            L83:
                r4 = -1
                if (r1 != r4) goto L8d
                double[] r1 = r0.mLut
                r6 = 0
                r1[r5] = r6
                goto Laa
            L8d:
                r6 = 0
                int r1 = -r1
                int r4 = r1 + (-2)
                int r1 = r1 + (-1)
                double r8 = (double) r4
                double[] r10 = androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc.ourPercent
                r11 = r10[r4]
                double r2 = r2 - r11
                r11 = r10[r1]
                r13 = r10[r4]
                double r11 = r11 - r13
                double r2 = r2 / r11
                double r2 = r2 + r8
                int r1 = r10.length
                int r1 = r1 + (-1)
                double r8 = (double) r1
                double r2 = r2 / r8
                double[] r1 = r0.mLut
                r1[r5] = r2
            Laa:
                int r5 = r5 + 1
                goto L61
            Lad:
                return
        }

        public final double getDX() {
                r6 = this;
                double r0 = r6.mEllipseA
                double r2 = r6.mTmpCosAngle
                double r0 = r0 * r2
                double r2 = r6.mEllipseB
                double r2 = -r2
                double r4 = r6.mTmpSinAngle
                double r2 = r2 * r4
                double r4 = r6.mArcVelocity
                double r2 = java.lang.Math.hypot(r0, r2)
                double r4 = r4 / r2
                boolean r2 = r6.mVertical
                if (r2 == 0) goto L19
                double r0 = -r0
            L19:
                double r0 = r0 * r4
                return r0
        }

        public final double getDY() {
                r6 = this;
                double r0 = r6.mEllipseA
                double r2 = r6.mTmpCosAngle
                double r0 = r0 * r2
                double r2 = r6.mEllipseB
                double r2 = -r2
                double r4 = r6.mTmpSinAngle
                double r2 = r2 * r4
                double r4 = r6.mArcVelocity
                double r0 = java.lang.Math.hypot(r0, r2)
                double r4 = r4 / r0
                boolean r0 = r6.mVertical
                if (r0 == 0) goto L1c
                double r0 = -r2
                double r0 = r0 * r4
                goto L1e
            L1c:
                double r0 = r2 * r4
            L1e:
                return r0
        }

        public double getLinearDX(double r1) {
                r0 = this;
                double r1 = r0.mEllipseCenterX
                return r1
        }

        public double getLinearDY(double r1) {
                r0 = this;
                double r1 = r0.mEllipseCenterY
                return r1
        }

        public double getLinearX(double r5) {
                r4 = this;
                double r0 = r4.mTime1
                double r5 = r5 - r0
                double r0 = r4.mOneOverDeltaTime
                double r5 = r5 * r0
                double r0 = r4.mX1
                double r2 = r4.mX2
                double r2 = r2 - r0
                double r2 = r2 * r5
                double r2 = r2 + r0
                return r2
        }

        public double getLinearY(double r5) {
                r4 = this;
                double r0 = r4.mTime1
                double r5 = r5 - r0
                double r0 = r4.mOneOverDeltaTime
                double r5 = r5 * r0
                double r0 = r4.mY1
                double r2 = r4.mY2
                double r2 = r2 - r0
                double r2 = r2 * r5
                double r2 = r2 + r0
                return r2
        }

        public final double getX() {
                r6 = this;
                double r0 = r6.mEllipseCenterX
                double r2 = r6.mEllipseA
                double r4 = r6.mTmpSinAngle
                double r2 = r2 * r4
                double r2 = r2 + r0
                return r2
        }

        public final double getY() {
                r6 = this;
                double r0 = r6.mEllipseCenterY
                double r2 = r6.mEllipseB
                double r4 = r6.mTmpCosAngle
                double r2 = r2 * r4
                double r2 = r2 + r0
                return r2
        }

        public final void setPoint(double r11) {
                r10 = this;
                boolean r0 = r10.mVertical
                if (r0 == 0) goto L8
                double r0 = r10.mTime2
                double r0 = r0 - r11
                goto Lc
            L8:
                double r0 = r10.mTime1
                double r0 = r11 - r0
            Lc:
                double r11 = r10.mOneOverDeltaTime
                double r0 = r0 * r11
                r11 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 > 0) goto L1c
                goto L3b
            L1c:
                r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L23
                goto L3b
            L23:
                double[] r2 = r10.mLut
                int r3 = r2.length
                int r3 = r3 + (-1)
                double r3 = (double) r3
                double r0 = r0 * r3
                int r3 = (int) r0
                double r4 = (double) r3
                double r0 = r0 - r4
                r4 = r2[r3]
                int r6 = r3 + 1
                r6 = r2[r6]
                r8 = r2[r3]
                double r6 = r6 - r8
                double r6 = r6 * r0
                double r2 = r6 + r4
            L3b:
                double r2 = r2 * r11
                double r11 = java.lang.Math.sin(r2)
                r10.mTmpSinAngle = r11
                double r11 = java.lang.Math.cos(r2)
                r10.mTmpCosAngle = r11
                return
        }
    }

    public ArcCurveFit(int[] r25, double[] r26, double[][] r27) {
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r2 = 1
            r0.mExtrapolate = r2
            r0.mTime = r1
            int r3 = r1.length
            int r3 = r3 - r2
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[r3]
            r0.mArcs = r3
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 1
        L16:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r7 = r0.mArcs
            int r8 = r7.length
            if (r4 >= r8) goto L59
            r8 = r25[r4]
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L35
            if (r8 == r2) goto L32
            if (r8 == r10) goto L2f
            if (r8 == r9) goto L28
            goto L36
        L28:
            if (r5 != r2) goto L2c
            r5 = 2
            goto L2d
        L2c:
            r5 = 1
        L2d:
            r6 = r5
            goto L36
        L2f:
            r5 = 2
            r6 = 2
            goto L36
        L32:
            r5 = 1
            r6 = 1
            goto L36
        L35:
            r6 = 3
        L36:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc r22 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r3]
            r8 = r27[r4]
            r16 = r8[r2]
            r8 = r27[r23]
            r18 = r8[r3]
            r8 = r27[r23]
            r20 = r8[r2]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L16
        L59:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double r7, int r9) {
            r6 = this;
            boolean r0 = r6.mExtrapolate
            r1 = 0
            if (r0 == 0) goto Laf
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r6.mArcs
            r2 = r0[r1]
            double r2 = r2.mTime1
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto L73
            r2 = r0[r1]
            double r2 = r2.mTime1
            r4 = r0[r1]
            double r4 = r4.mTime1
            double r7 = r7 - r4
            r4 = r0[r1]
            boolean r4 = r4.linear
            if (r4 == 0) goto L44
            if (r9 != 0) goto L32
            r9 = r0[r1]
            double r4 = r9.getLinearX(r2)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r1]
            double r0 = r9.getLinearDX(r2)
            double r7 = r7 * r0
            double r7 = r7 + r4
            return r7
        L32:
            r9 = r0[r1]
            double r4 = r9.getLinearY(r2)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r1]
            double r0 = r9.getLinearDY(r2)
            double r7 = r7 * r0
            double r7 = r7 + r4
            return r7
        L44:
            r0 = r0[r1]
            r0.setPoint(r2)
            if (r9 != 0) goto L5f
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r1]
            double r2 = r9.getX()
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r1]
            double r0 = r9.getDX()
            double r7 = r7 * r0
            double r7 = r7 + r2
            return r7
        L5f:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r1]
            double r2 = r9.getY()
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r1]
            double r0 = r9.getDY()
            double r7 = r7 * r0
            double r7 = r7 + r2
            return r7
        L73:
            int r2 = r0.length
            int r2 = r2 + (-1)
            r2 = r0[r2]
            double r2 = r2.mTime2
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 <= 0) goto Ld0
            int r1 = r0.length
            int r1 = r1 + (-1)
            r1 = r0[r1]
            double r1 = r1.mTime2
            double r7 = r7 - r1
            int r3 = r0.length
            int r3 = r3 + (-1)
            if (r9 != 0) goto L9d
            r9 = r0[r3]
            double r4 = r9.getLinearX(r1)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r3]
            double r0 = r9.getLinearDX(r1)
            double r7 = r7 * r0
            double r7 = r7 + r4
            return r7
        L9d:
            r9 = r0[r3]
            double r4 = r9.getLinearY(r1)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r3]
            double r0 = r9.getLinearDY(r1)
            double r7 = r7 * r0
            double r7 = r7 + r4
            return r7
        Laf:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r6.mArcs
            r2 = r0[r1]
            double r2 = r2.mTime1
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lbe
            r7 = r0[r1]
            double r7 = r7.mTime1
            goto Ld0
        Lbe:
            int r2 = r0.length
            int r2 = r2 + (-1)
            r2 = r0[r2]
            double r2 = r2.mTime2
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 <= 0) goto Ld0
            int r7 = r0.length
            int r7 = r7 + (-1)
            r7 = r0[r7]
            double r7 = r7.mTime2
        Ld0:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r6.mArcs
            int r2 = r0.length
            if (r1 >= r2) goto L10f
            r2 = r0[r1]
            double r2 = r2.mTime2
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 > 0) goto L10c
            r2 = r0[r1]
            boolean r2 = r2.linear
            if (r2 == 0) goto Lf3
            if (r9 != 0) goto Lec
            r9 = r0[r1]
            double r7 = r9.getLinearX(r7)
            return r7
        Lec:
            r9 = r0[r1]
            double r7 = r9.getLinearY(r7)
            return r7
        Lf3:
            r0 = r0[r1]
            r0.setPoint(r7)
            if (r9 != 0) goto L103
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r7 = r6.mArcs
            r7 = r7[r1]
            double r7 = r7.getX()
            return r7
        L103:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r7 = r6.mArcs
            r7 = r7[r1]
            double r7 = r7.getY()
            return r7
        L10c:
            int r1 = r1 + 1
            goto Ld0
        L10f:
            r7 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r7
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double r11, double[] r13) {
            r10 = this;
            boolean r0 = r10.mExtrapolate
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Leb
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r3 = r0[r2]
            double r3 = r3.mTime1
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 >= 0) goto L78
            r3 = r0[r2]
            double r3 = r3.mTime1
            r5 = r0[r2]
            double r5 = r5.mTime1
            double r11 = r11 - r5
            r5 = r0[r2]
            boolean r5 = r5.linear
            if (r5 == 0) goto L48
            r0 = r0[r2]
            double r5 = r0.getLinearX(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r7 = r0.getLinearDX(r3)
            double r7 = r7 * r11
            double r7 = r7 + r5
            r13[r2] = r7
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r5 = r0.getLinearY(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r2 = r0.getLinearDY(r3)
            double r11 = r11 * r2
            double r11 = r11 + r5
            r13[r1] = r11
            goto L77
        L48:
            r0 = r0[r2]
            r0.setPoint(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r3 = r0.getX()
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r5 = r0.getDX()
            double r5 = r5 * r11
            double r5 = r5 + r3
            r13[r2] = r5
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r3 = r0.getY()
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r5 = r0.getDY()
            double r11 = r11 * r5
            double r11 = r11 + r3
            r13[r1] = r11
        L77:
            return
        L78:
            int r3 = r0.length
            int r3 = r3 - r1
            r3 = r0[r3]
            double r3 = r3.mTime2
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 <= 0) goto L109
            int r3 = r0.length
            int r3 = r3 - r1
            r3 = r0[r3]
            double r3 = r3.mTime2
            double r5 = r11 - r3
            int r7 = r0.length
            int r7 = r7 - r1
            r8 = r0[r7]
            boolean r8 = r8.linear
            if (r8 == 0) goto Lbb
            r11 = r0[r7]
            double r11 = r11.getLinearX(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r7]
            double r8 = r0.getLinearDX(r3)
            double r8 = r8 * r5
            double r8 = r8 + r11
            r13[r2] = r8
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r7]
            double r11 = r11.getLinearY(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r7]
            double r2 = r0.getLinearDY(r3)
            double r5 = r5 * r2
            double r5 = r5 + r11
            r13[r1] = r5
            goto Lea
        Lbb:
            r0 = r0[r7]
            r0.setPoint(r11)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r7]
            double r11 = r11.getX()
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r7]
            double r3 = r0.getDX()
            double r3 = r3 * r5
            double r3 = r3 + r11
            r13[r2] = r3
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r7]
            double r11 = r11.getY()
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r7]
            double r2 = r0.getDY()
            double r5 = r5 * r2
            double r5 = r5 + r11
            r13[r1] = r5
        Lea:
            return
        Leb:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r3 = r0[r2]
            double r3 = r3.mTime1
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lf9
            r11 = r0[r2]
            double r11 = r11.mTime1
        Lf9:
            int r3 = r0.length
            int r3 = r3 - r1
            r3 = r0[r3]
            double r3 = r3.mTime2
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 <= 0) goto L109
            int r11 = r0.length
            int r11 = r11 - r1
            r11 = r0[r11]
            double r11 = r11.mTime2
        L109:
            r0 = 0
        L10a:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = r10.mArcs
            int r4 = r3.length
            if (r0 >= r4) goto L14d
            r4 = r3[r0]
            double r4 = r4.mTime2
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 > 0) goto L14a
            r4 = r3[r0]
            boolean r4 = r4.linear
            if (r4 == 0) goto L130
            r3 = r3[r0]
            double r3 = r3.getLinearX(r11)
            r13[r2] = r3
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r2 = r10.mArcs
            r0 = r2[r0]
            double r11 = r0.getLinearY(r11)
            r13[r1] = r11
            return
        L130:
            r3 = r3[r0]
            r3.setPoint(r11)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r0]
            double r11 = r11.getX()
            r13[r2] = r11
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r0]
            double r11 = r11.getY()
            r13[r1] = r11
            return
        L14a:
            int r0 = r0 + 1
            goto L10a
        L14d:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double r11, float[] r13) {
            r10 = this;
            boolean r0 = r10.mExtrapolate
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Ldd
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r3 = r0[r2]
            double r3 = r3.mTime1
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 >= 0) goto L7c
            r3 = r0[r2]
            double r3 = r3.mTime1
            r5 = r0[r2]
            double r5 = r5.mTime1
            double r11 = r11 - r5
            r5 = r0[r2]
            boolean r5 = r5.linear
            if (r5 == 0) goto L4a
            r0 = r0[r2]
            double r5 = r0.getLinearX(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r7 = r0.getLinearDX(r3)
            double r7 = r7 * r11
            double r7 = r7 + r5
            float r0 = (float) r7
            r13[r2] = r0
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r5 = r0.getLinearY(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r2 = r0.getLinearDY(r3)
            double r11 = r11 * r2
            double r11 = r11 + r5
            float r11 = (float) r11
            r13[r1] = r11
            goto L7b
        L4a:
            r0 = r0[r2]
            r0.setPoint(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r3 = r0.getX()
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r5 = r0.getDX()
            double r5 = r5 * r11
            double r5 = r5 + r3
            float r0 = (float) r5
            r13[r2] = r0
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r3 = r0.getY()
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r5 = r0.getDY()
            double r11 = r11 * r5
            double r11 = r11 + r3
            float r11 = (float) r11
            r13[r1] = r11
        L7b:
            return
        L7c:
            int r3 = r0.length
            int r3 = r3 - r1
            r3 = r0[r3]
            double r3 = r3.mTime2
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 <= 0) goto Lfc
            int r3 = r0.length
            int r3 = r3 - r1
            r3 = r0[r3]
            double r3 = r3.mTime2
            double r5 = r11 - r3
            int r7 = r0.length
            int r7 = r7 - r1
            r8 = r0[r7]
            boolean r8 = r8.linear
            if (r8 == 0) goto Lc1
            r11 = r0[r7]
            double r11 = r11.getLinearX(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r7]
            double r8 = r0.getLinearDX(r3)
            double r8 = r8 * r5
            double r8 = r8 + r11
            float r11 = (float) r8
            r13[r2] = r11
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r7]
            double r11 = r11.getLinearY(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r7]
            double r2 = r0.getLinearDY(r3)
            double r5 = r5 * r2
            double r5 = r5 + r11
            float r11 = (float) r5
            r13[r1] = r11
            goto Ldc
        Lc1:
            r0 = r0[r7]
            r0.setPoint(r11)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r7]
            double r11 = r11.getX()
            float r11 = (float) r11
            r13[r2] = r11
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r7]
            double r11 = r11.getY()
            float r11 = (float) r11
            r13[r1] = r11
        Ldc:
            return
        Ldd:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r3 = r0[r2]
            double r3 = r3.mTime1
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lec
            r11 = r0[r2]
            double r11 = r11.mTime1
            goto Lfc
        Lec:
            int r3 = r0.length
            int r3 = r3 - r1
            r3 = r0[r3]
            double r3 = r3.mTime2
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 <= 0) goto Lfc
            int r11 = r0.length
            int r11 = r11 - r1
            r11 = r0[r11]
            double r11 = r11.mTime2
        Lfc:
            r0 = 0
        Lfd:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = r10.mArcs
            int r4 = r3.length
            if (r0 >= r4) goto L144
            r4 = r3[r0]
            double r4 = r4.mTime2
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 > 0) goto L141
            r4 = r3[r0]
            boolean r4 = r4.linear
            if (r4 == 0) goto L125
            r3 = r3[r0]
            double r3 = r3.getLinearX(r11)
            float r3 = (float) r3
            r13[r2] = r3
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r2 = r10.mArcs
            r0 = r2[r0]
            double r11 = r0.getLinearY(r11)
            float r11 = (float) r11
            r13[r1] = r11
            return
        L125:
            r3 = r3[r0]
            r3.setPoint(r11)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r0]
            double r11 = r11.getX()
            float r11 = (float) r11
            r13[r2] = r11
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r0]
            double r11 = r11.getY()
            float r11 = (float) r11
            r13[r1] = r11
            return
        L141:
            int r0 = r0 + 1
            goto Lfd
        L144:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double r6, int r8) {
            r5 = this;
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r5.mArcs
            r1 = 0
            r2 = r0[r1]
            double r2 = r2.mTime1
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lf
            r6 = r0[r1]
            double r6 = r6.mTime1
        Lf:
            int r2 = r0.length
            int r2 = r2 + (-1)
            r2 = r0[r2]
            double r2 = r2.mTime2
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 <= 0) goto L21
            int r6 = r0.length
            int r6 = r6 + (-1)
            r6 = r0[r6]
            double r6 = r6.mTime2
        L21:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r5.mArcs
            int r2 = r0.length
            if (r1 >= r2) goto L60
            r2 = r0[r1]
            double r2 = r2.mTime2
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 > 0) goto L5d
            r2 = r0[r1]
            boolean r2 = r2.linear
            if (r2 == 0) goto L44
            if (r8 != 0) goto L3d
            r8 = r0[r1]
            double r6 = r8.getLinearDX(r6)
            return r6
        L3d:
            r8 = r0[r1]
            double r6 = r8.getLinearDY(r6)
            return r6
        L44:
            r0 = r0[r1]
            r0.setPoint(r6)
            if (r8 != 0) goto L54
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r6 = r5.mArcs
            r6 = r6[r1]
            double r6 = r6.getDX()
            return r6
        L54:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r6 = r5.mArcs
            r6 = r6[r1]
            double r6 = r6.getDY()
            return r6
        L5d:
            int r1 = r1 + 1
            goto L21
        L60:
            r6 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r6
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double r8, double[] r10) {
            r7 = this;
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r7.mArcs
            r1 = 0
            r2 = r0[r1]
            double r2 = r2.mTime1
            r4 = 1
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 >= 0) goto L11
            r8 = r0[r1]
            double r8 = r8.mTime1
            goto L21
        L11:
            int r2 = r0.length
            int r2 = r2 - r4
            r2 = r0[r2]
            double r2 = r2.mTime2
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 <= 0) goto L21
            int r8 = r0.length
            int r8 = r8 - r4
            r8 = r0[r8]
            double r8 = r8.mTime2
        L21:
            r0 = 0
        L22:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r2 = r7.mArcs
            int r3 = r2.length
            if (r0 >= r3) goto L65
            r3 = r2[r0]
            double r5 = r3.mTime2
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 > 0) goto L62
            r3 = r2[r0]
            boolean r3 = r3.linear
            if (r3 == 0) goto L48
            r2 = r2[r0]
            double r2 = r2.getLinearDX(r8)
            r10[r1] = r2
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r1 = r7.mArcs
            r0 = r1[r0]
            double r8 = r0.getLinearDY(r8)
            r10[r4] = r8
            return
        L48:
            r2 = r2[r0]
            r2.setPoint(r8)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r8 = r7.mArcs
            r8 = r8[r0]
            double r8 = r8.getDX()
            r10[r1] = r8
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r8 = r7.mArcs
            r8 = r8[r0]
            double r8 = r8.getDY()
            r10[r4] = r8
            return
        L62:
            int r0 = r0 + 1
            goto L22
        L65:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
            r1 = this;
            double[] r0 = r1.mTime
            return r0
    }
}
