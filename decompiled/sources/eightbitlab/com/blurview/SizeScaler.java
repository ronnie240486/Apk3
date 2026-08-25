package eightbitlab.com.blurview;

/* JADX INFO: loaded from: classes2.dex */
public class SizeScaler {
    private static final int ROUNDING_VALUE = 64;
    private final float scaleFactor;

    public static class Size {
        public final int height;
        public final float scaleFactor;
        public final int width;

        public Size(int r1, int r2, float r3) {
                r0 = this;
                r0.<init>()
                r0.width = r1
                r0.height = r2
                r0.scaleFactor = r3
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L2f
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L12
                goto L2f
            L12:
                eightbitlab.com.blurview.SizeScaler$Size r5 = (eightbitlab.com.blurview.SizeScaler.Size) r5
                int r2 = r4.width
                int r3 = r5.width
                if (r2 == r3) goto L1b
                return r1
            L1b:
                int r2 = r4.height
                int r3 = r5.height
                if (r2 == r3) goto L22
                return r1
            L22:
                float r5 = r5.scaleFactor
                float r2 = r4.scaleFactor
                int r5 = java.lang.Float.compare(r5, r2)
                if (r5 != 0) goto L2d
                goto L2e
            L2d:
                r0 = 0
            L2e:
                return r0
            L2f:
                return r1
        }

        public int hashCode() {
                r3 = this;
                int r0 = r3.width
                int r0 = r0 * 31
                int r1 = r3.height
                int r0 = r0 + r1
                int r0 = r0 * 31
                float r1 = r3.scaleFactor
                r2 = 0
                int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r2 == 0) goto L15
                int r1 = java.lang.Float.floatToIntBits(r1)
                goto L16
            L15:
                r1 = 0
            L16:
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "Size{width="
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                int r1 = r2.width
                r0.append(r1)
                java.lang.String r1 = ", height="
                r0.append(r1)
                int r1 = r2.height
                r0.append(r1)
                java.lang.String r1 = ", scaleFactor="
                r0.append(r1)
                float r1 = r2.scaleFactor
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public SizeScaler(float r1) {
            r0 = this;
            r0.<init>()
            r0.scaleFactor = r1
            return
    }

    private int downscaleSize(float r3) {
            r2 = this;
            float r0 = r2.scaleFactor
            float r3 = r3 / r0
            double r0 = (double) r3
            double r0 = java.lang.Math.ceil(r0)
            int r3 = (int) r0
            return r3
    }

    private int roundSize(int r2) {
            r1 = this;
            int r0 = r2 % 64
            if (r0 != 0) goto L5
            return r2
        L5:
            int r2 = r2 - r0
            int r2 = r2 + 64
            return r2
    }

    public final boolean isZeroSized(int r1, int r2) {
            r0 = this;
            float r2 = (float) r2
            int r2 = r0.downscaleSize(r2)
            if (r2 == 0) goto L11
            float r1 = (float) r1
            int r1 = r0.downscaleSize(r1)
            if (r1 != 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            goto L12
        L11:
            r1 = 1
        L12:
            return r1
    }

    public final eightbitlab.com.blurview.SizeScaler.Size scale(int r4, int r5) {
            r3 = this;
            float r4 = (float) r4
            int r0 = r3.downscaleSize(r4)
            int r0 = r3.roundSize(r0)
            float r1 = (float) r0
            float r4 = r4 / r1
            float r5 = (float) r5
            float r5 = r5 / r4
            double r1 = (double) r5
            double r1 = java.lang.Math.ceil(r1)
            int r5 = (int) r1
            eightbitlab.com.blurview.SizeScaler$Size r1 = new eightbitlab.com.blurview.SizeScaler$Size
            r1.<init>(r0, r5, r4)
            return r1
    }
}
