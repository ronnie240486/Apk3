package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes2.dex */
public class Easing {
    private static final java.lang.String ACCELERATE = "cubic(0.4, 0.05, 0.8, 0.7)";
    private static final java.lang.String ACCELERATE_NAME = "accelerate";
    private static final java.lang.String ANTICIPATE = "cubic(0.36, 0, 0.66, -0.56)";
    private static final java.lang.String ANTICIPATE_NAME = "anticipate";
    private static final java.lang.String DECELERATE = "cubic(0.0, 0.0, 0.2, 0.95)";
    private static final java.lang.String DECELERATE_NAME = "decelerate";
    private static final java.lang.String LINEAR = "cubic(1, 1, 0, 0)";
    private static final java.lang.String LINEAR_NAME = "linear";
    public static java.lang.String[] NAMED_EASING = null;
    private static final java.lang.String OVERSHOOT = "cubic(0.34, 1.56, 0.64, 1)";
    private static final java.lang.String OVERSHOOT_NAME = "overshoot";
    private static final java.lang.String STANDARD = "cubic(0.4, 0.0, 0.2, 1)";
    private static final java.lang.String STANDARD_NAME = "standard";
    public static androidx.constraintlayout.core.motion.utils.Easing sDefault;
    public java.lang.String str;

    public static class CubicEasing extends androidx.constraintlayout.core.motion.utils.Easing {
        private static double d_error = 1.0E-4d;
        private static double error = 0.01d;
        public double x1;
        public double x2;
        public double y1;
        public double y2;

        public CubicEasing(double r1, double r3, double r5, double r7) {
                r0 = this;
                r0.<init>()
                r0.x1 = r1
                r0.y1 = r3
                r0.x2 = r5
                r0.y2 = r7
                return
        }

        public CubicEasing(java.lang.String r6) {
                r5 = this;
                r5.<init>()
                r5.str = r6
                r0 = 40
                int r0 = r6.indexOf(r0)
                r1 = 44
                int r2 = r6.indexOf(r1, r0)
                int r0 = r0 + 1
                java.lang.String r0 = r6.substring(r0, r2)
                java.lang.String r0 = r0.trim()
                double r3 = java.lang.Double.parseDouble(r0)
                r5.x1 = r3
                int r2 = r2 + 1
                int r0 = r6.indexOf(r1, r2)
                java.lang.String r2 = r6.substring(r2, r0)
                java.lang.String r2 = r2.trim()
                double r2 = java.lang.Double.parseDouble(r2)
                r5.y1 = r2
                int r0 = r0 + 1
                int r1 = r6.indexOf(r1, r0)
                java.lang.String r0 = r6.substring(r0, r1)
                java.lang.String r0 = r0.trim()
                double r2 = java.lang.Double.parseDouble(r0)
                r5.x2 = r2
                int r1 = r1 + 1
                r0 = 41
                int r0 = r6.indexOf(r0, r1)
                java.lang.String r6 = r6.substring(r1, r0)
                java.lang.String r6 = r6.trim()
                double r0 = java.lang.Double.parseDouble(r6)
                r5.y2 = r0
                return
        }

        private double getDiffX(double r13) {
                r12 = this;
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r2 = r0 - r13
                r4 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r6 = r2 * r4
                double r6 = r6 * r2
                double r8 = r12.x1
                double r6 = r6 * r8
                r10 = 4618441417868443648(0x4018000000000000, double:6.0)
                double r2 = r2 * r10
                double r2 = r2 * r13
                double r10 = r12.x2
                double r8 = r10 - r8
                double r8 = r8 * r2
                double r8 = r8 + r6
                double r4 = r4 * r13
                double r4 = r4 * r13
                double r0 = r0 - r10
                double r0 = r0 * r4
                double r0 = r0 + r8
                return r0
        }

        private double getDiffY(double r13) {
                r12 = this;
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r2 = r0 - r13
                r4 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r6 = r2 * r4
                double r6 = r6 * r2
                double r8 = r12.y1
                double r6 = r6 * r8
                r10 = 4618441417868443648(0x4018000000000000, double:6.0)
                double r2 = r2 * r10
                double r2 = r2 * r13
                double r10 = r12.y2
                double r8 = r10 - r8
                double r8 = r8 * r2
                double r8 = r8 + r6
                double r4 = r4 * r13
                double r4 = r4 * r13
                double r0 = r0 - r10
                double r0 = r0 * r4
                double r0 = r0 + r8
                return r0
        }

        private double getX(double r7) {
                r6 = this;
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r0 = r0 - r7
                r2 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r2 = r2 * r0
                double r0 = r0 * r2
                double r0 = r0 * r7
                double r2 = r2 * r7
                double r2 = r2 * r7
                double r4 = r7 * r7
                double r4 = r4 * r7
                double r7 = r6.x1
                double r7 = r7 * r0
                double r0 = r6.x2
                double r0 = r0 * r2
                double r0 = r0 + r7
                double r0 = r0 + r4
                return r0
        }

        private double getY(double r7) {
                r6 = this;
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r0 = r0 - r7
                r2 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r2 = r2 * r0
                double r0 = r0 * r2
                double r0 = r0 * r7
                double r2 = r2 * r7
                double r2 = r2 * r7
                double r4 = r7 * r7
                double r4 = r4 * r7
                double r7 = r6.y1
                double r7 = r7 * r0
                double r0 = r6.y2
                double r0 = r0 * r2
                double r0 = r0 + r7
                double r0 = r0 + r4
                return r0
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double get(double r10) {
                r9 = this;
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 > 0) goto L7
                return r0
            L7:
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 < 0) goto Le
                return r0
            Le:
                r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                r2 = r0
                r4 = r2
            L12:
                double r6 = androidx.constraintlayout.core.motion.utils.Easing.CubicEasing.error
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 <= 0) goto L26
                double r6 = r9.getX(r4)
                double r2 = r2 * r0
                int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r8 >= 0) goto L24
                double r4 = r4 + r2
                goto L12
            L24:
                double r4 = r4 - r2
                goto L12
            L26:
                double r0 = r4 - r2
                double r6 = r9.getX(r0)
                double r4 = r4 + r2
                double r2 = r9.getX(r4)
                double r0 = r9.getY(r0)
                double r4 = r9.getY(r4)
                double r4 = r4 - r0
                double r10 = r10 - r6
                double r10 = r10 * r4
                double r2 = r2 - r6
                double r10 = r10 / r2
                double r10 = r10 + r0
                return r10
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double getDiff(double r10) {
                r9 = this;
                r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                r2 = r0
                r4 = r2
            L4:
                double r6 = androidx.constraintlayout.core.motion.utils.Easing.CubicEasing.d_error
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 <= 0) goto L18
                double r6 = r9.getX(r4)
                double r2 = r2 * r0
                int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r8 >= 0) goto L16
                double r4 = r4 + r2
                goto L4
            L16:
                double r4 = r4 - r2
                goto L4
            L18:
                double r10 = r4 - r2
                double r0 = r9.getX(r10)
                double r4 = r4 + r2
                double r2 = r9.getX(r4)
                double r10 = r9.getY(r10)
                double r4 = r9.getY(r4)
                double r4 = r4 - r10
                double r2 = r2 - r0
                double r4 = r4 / r2
                return r4
        }
    }

    static {
            androidx.constraintlayout.core.motion.utils.Easing r0 = new androidx.constraintlayout.core.motion.utils.Easing
            r0.<init>()
            androidx.constraintlayout.core.motion.utils.Easing.sDefault = r0
            java.lang.String r0 = "standard"
            java.lang.String r1 = "accelerate"
            java.lang.String r2 = "decelerate"
            java.lang.String r3 = "linear"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING = r0
            return
    }

    public Easing() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "identity"
            r1.str = r0
            return
    }

    public static androidx.constraintlayout.core.motion.utils.Easing getInterpolator(java.lang.String r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "cubic"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L12
            androidx.constraintlayout.core.motion.utils.Easing$CubicEasing r0 = new androidx.constraintlayout.core.motion.utils.Easing$CubicEasing
            r0.<init>(r2)
            return r0
        L12:
            java.lang.String r0 = "spline"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L21
            androidx.constraintlayout.core.motion.utils.StepCurve r0 = new androidx.constraintlayout.core.motion.utils.StepCurve
            r0.<init>(r2)
            return r0
        L21:
            java.lang.String r0 = "Schlick"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L2f
            androidx.constraintlayout.core.motion.utils.Schlick r0 = new androidx.constraintlayout.core.motion.utils.Schlick
            r0.<init>(r2)
            return r0
        L2f:
            r2.hashCode()
            r0 = -1
            int r1 = r2.hashCode()
            switch(r1) {
                case -1354466595: goto L73;
                case -1263948740: goto L68;
                case -1197605014: goto L5d;
                case -1102672091: goto L52;
                case -749065269: goto L47;
                case 1312628413: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L7d
        L3b:
            java.lang.String r1 = "standard"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L45
            goto L7d
        L45:
            r0 = 5
            goto L7d
        L47:
            java.lang.String r1 = "overshoot"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L50
            goto L7d
        L50:
            r0 = 4
            goto L7d
        L52:
            java.lang.String r1 = "linear"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L5b
            goto L7d
        L5b:
            r0 = 3
            goto L7d
        L5d:
            java.lang.String r1 = "anticipate"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L66
            goto L7d
        L66:
            r0 = 2
            goto L7d
        L68:
            java.lang.String r1 = "decelerate"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L71
            goto L7d
        L71:
            r0 = 1
            goto L7d
        L73:
            java.lang.String r1 = "accelerate"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L7c
            goto L7d
        L7c:
            r0 = 0
        L7d:
            switch(r0) {
                case 0: goto Lc4;
                case 1: goto Lbc;
                case 2: goto Lb4;
                case 3: goto Lac;
                case 4: goto La4;
                case 5: goto L9c;
                default: goto L80;
            }
        L80:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.String r0 = "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String[] r1 = androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.println(r0)
            androidx.constraintlayout.core.motion.utils.Easing r2 = androidx.constraintlayout.core.motion.utils.Easing.sDefault
            return r2
        L9c:
            androidx.constraintlayout.core.motion.utils.Easing$CubicEasing r2 = new androidx.constraintlayout.core.motion.utils.Easing$CubicEasing
            java.lang.String r0 = "cubic(0.4, 0.0, 0.2, 1)"
            r2.<init>(r0)
            return r2
        La4:
            androidx.constraintlayout.core.motion.utils.Easing$CubicEasing r2 = new androidx.constraintlayout.core.motion.utils.Easing$CubicEasing
            java.lang.String r0 = "cubic(0.34, 1.56, 0.64, 1)"
            r2.<init>(r0)
            return r2
        Lac:
            androidx.constraintlayout.core.motion.utils.Easing$CubicEasing r2 = new androidx.constraintlayout.core.motion.utils.Easing$CubicEasing
            java.lang.String r0 = "cubic(1, 1, 0, 0)"
            r2.<init>(r0)
            return r2
        Lb4:
            androidx.constraintlayout.core.motion.utils.Easing$CubicEasing r2 = new androidx.constraintlayout.core.motion.utils.Easing$CubicEasing
            java.lang.String r0 = "cubic(0.36, 0, 0.66, -0.56)"
            r2.<init>(r0)
            return r2
        Lbc:
            androidx.constraintlayout.core.motion.utils.Easing$CubicEasing r2 = new androidx.constraintlayout.core.motion.utils.Easing$CubicEasing
            java.lang.String r0 = "cubic(0.0, 0.0, 0.2, 0.95)"
            r2.<init>(r0)
            return r2
        Lc4:
            androidx.constraintlayout.core.motion.utils.Easing$CubicEasing r2 = new androidx.constraintlayout.core.motion.utils.Easing$CubicEasing
            java.lang.String r0 = "cubic(0.4, 0.05, 0.8, 0.7)"
            r2.<init>(r0)
            return r2
    }

    public double get(double r1) {
            r0 = this;
            return r1
    }

    public double getDiff(double r1) {
            r0 = this;
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.str
            return r0
    }
}
