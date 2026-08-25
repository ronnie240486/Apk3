package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public class Schlick extends androidx.constraintlayout.core.motion.utils.Easing {
    private static final boolean DEBUG = false;
    public double mS;
    public double mT;

    public Schlick(java.lang.String r6) {
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
            r5.mS = r3
            int r2 = r2 + 1
            int r0 = r6.indexOf(r1, r2)
            java.lang.String r6 = r6.substring(r2, r0)
            java.lang.String r6 = r6.trim()
            double r0 = java.lang.Double.parseDouble(r6)
            r5.mT = r0
            return
    }

    private double dfunc(double r13) {
            r12 = this;
            double r0 = r12.mT
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L19
            double r2 = r12.mS
            double r4 = r2 * r0
            double r4 = r4 * r0
            double r6 = r0 - r13
            double r6 = r6 * r2
            double r6 = r6 + r13
            double r0 = r0 - r13
            double r0 = r0 * r2
            double r0 = r0 + r13
            double r0 = r0 * r6
            double r4 = r4 / r0
            return r4
        L19:
            double r2 = r12.mS
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r0 - r4
            double r6 = r6 * r2
            double r8 = r0 - r4
            double r8 = r8 * r6
            double r6 = -r2
            double r10 = r0 - r13
            double r10 = r10 * r6
            double r10 = r10 - r13
            double r10 = r10 + r4
            double r2 = -r2
            double r0 = r0 - r13
            double r0 = r0 * r2
            double r0 = r0 - r13
            double r0 = r0 + r4
            double r0 = r0 * r10
            double r8 = r8 / r0
            return r8
    }

    private double func(double r9) {
            r8 = this;
            double r0 = r8.mT
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto L10
            double r2 = r0 * r9
            double r4 = r8.mS
            double r0 = r0 - r9
            double r0 = r0 * r4
            double r0 = r0 + r9
            double r2 = r2 / r0
            return r2
        L10:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r2 - r0
            double r6 = r9 - r2
            double r6 = r6 * r4
            double r2 = r2 - r9
            double r4 = r8.mS
            double r0 = r0 - r9
            double r0 = r0 * r4
            double r2 = r2 - r0
            double r6 = r6 / r2
            return r6
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double r1) {
            r0 = this;
            double r1 = r0.func(r1)
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double r1) {
            r0 = this;
            double r1 = r0.dfunc(r1)
            return r1
    }
}
