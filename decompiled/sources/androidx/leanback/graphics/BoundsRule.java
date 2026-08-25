package androidx.leanback.graphics;

/* JADX INFO: loaded from: classes.dex */
public class BoundsRule {
    public androidx.leanback.graphics.BoundsRule.ValueRule bottom;
    public androidx.leanback.graphics.BoundsRule.ValueRule left;
    public androidx.leanback.graphics.BoundsRule.ValueRule right;
    public androidx.leanback.graphics.BoundsRule.ValueRule top;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class ValueRule {
        public int mAbsoluteValue;
        public float mFraction;

        public ValueRule(int r1, float r2) {
                r0 = this;
                r0.<init>()
                r0.mAbsoluteValue = r1
                r0.mFraction = r2
                return
        }

        public ValueRule(androidx.leanback.graphics.BoundsRule.ValueRule r2) {
                r1 = this;
                r1.<init>()
                float r0 = r2.mFraction
                r1.mFraction = r0
                int r2 = r2.mAbsoluteValue
                r1.mAbsoluteValue = r2
                return
        }

        public static androidx.leanback.graphics.BoundsRule.ValueRule absoluteValue(int r2) {
                androidx.leanback.graphics.BoundsRule$ValueRule r0 = new androidx.leanback.graphics.BoundsRule$ValueRule
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public static androidx.leanback.graphics.BoundsRule.ValueRule inheritFromParent(float r2) {
                androidx.leanback.graphics.BoundsRule$ValueRule r0 = new androidx.leanback.graphics.BoundsRule$ValueRule
                r1 = 0
                r0.<init>(r1, r2)
                return r0
        }

        public static androidx.leanback.graphics.BoundsRule.ValueRule inheritFromParentWithOffset(float r1, int r2) {
                androidx.leanback.graphics.BoundsRule$ValueRule r0 = new androidx.leanback.graphics.BoundsRule$ValueRule
                r0.<init>(r2, r1)
                return r0
        }

        public int getAbsoluteValue() {
                r1 = this;
                int r0 = r1.mAbsoluteValue
                return r0
        }

        public float getFraction() {
                r1 = this;
                float r0 = r1.mFraction
                return r0
        }

        public void setAbsoluteValue(int r1) {
                r0 = this;
                r0.mAbsoluteValue = r1
                return
        }

        public void setFraction(float r1) {
                r0 = this;
                r0.mFraction = r1
                return
        }
    }

    public BoundsRule() {
            r0 = this;
            r0.<init>()
            return
    }

    public BoundsRule(androidx.leanback.graphics.BoundsRule r4) {
            r3 = this;
            r3.<init>()
            androidx.leanback.graphics.BoundsRule$ValueRule r0 = r4.left
            r1 = 0
            if (r0 == 0) goto Le
            androidx.leanback.graphics.BoundsRule$ValueRule r2 = new androidx.leanback.graphics.BoundsRule$ValueRule
            r2.<init>(r0)
            goto Lf
        Le:
            r2 = r1
        Lf:
            r3.left = r2
            androidx.leanback.graphics.BoundsRule$ValueRule r0 = r4.right
            if (r0 == 0) goto L1b
            androidx.leanback.graphics.BoundsRule$ValueRule r2 = new androidx.leanback.graphics.BoundsRule$ValueRule
            r2.<init>(r0)
            goto L1c
        L1b:
            r2 = r1
        L1c:
            r3.right = r2
            androidx.leanback.graphics.BoundsRule$ValueRule r0 = r4.top
            if (r0 == 0) goto L28
            androidx.leanback.graphics.BoundsRule$ValueRule r2 = new androidx.leanback.graphics.BoundsRule$ValueRule
            r2.<init>(r0)
            goto L29
        L28:
            r2 = r1
        L29:
            r3.top = r2
            androidx.leanback.graphics.BoundsRule$ValueRule r4 = r4.bottom
            if (r4 == 0) goto L34
            androidx.leanback.graphics.BoundsRule$ValueRule r1 = new androidx.leanback.graphics.BoundsRule$ValueRule
            r1.<init>(r4)
        L34:
            r3.bottom = r1
            return
    }

    private int doCalculate(int r2, androidx.leanback.graphics.BoundsRule.ValueRule r3, int r4) {
            r1 = this;
            int r0 = r3.mAbsoluteValue
            int r2 = r2 + r0
            float r3 = r3.mFraction
            float r4 = (float) r4
            float r3 = r3 * r4
            int r3 = (int) r3
            int r2 = r2 + r3
            return r2
    }

    public void calculateBounds(android.graphics.Rect r4, android.graphics.Rect r5) {
            r3 = this;
            androidx.leanback.graphics.BoundsRule$ValueRule r0 = r3.left
            if (r0 != 0) goto L9
            int r0 = r4.left
            r5.left = r0
            goto L15
        L9:
            int r1 = r4.left
            int r2 = r4.width()
            int r0 = r3.doCalculate(r1, r0, r2)
            r5.left = r0
        L15:
            androidx.leanback.graphics.BoundsRule$ValueRule r0 = r3.right
            if (r0 != 0) goto L1e
            int r0 = r4.right
            r5.right = r0
            goto L2a
        L1e:
            int r1 = r4.left
            int r2 = r4.width()
            int r0 = r3.doCalculate(r1, r0, r2)
            r5.right = r0
        L2a:
            androidx.leanback.graphics.BoundsRule$ValueRule r0 = r3.top
            if (r0 != 0) goto L33
            int r0 = r4.top
            r5.top = r0
            goto L3f
        L33:
            int r1 = r4.top
            int r2 = r4.height()
            int r0 = r3.doCalculate(r1, r0, r2)
            r5.top = r0
        L3f:
            androidx.leanback.graphics.BoundsRule$ValueRule r0 = r3.bottom
            if (r0 != 0) goto L48
            int r4 = r4.bottom
            r5.bottom = r4
            goto L54
        L48:
            int r1 = r4.top
            int r4 = r4.height()
            int r4 = r3.doCalculate(r1, r0, r4)
            r5.bottom = r4
        L54:
            return
    }
}
