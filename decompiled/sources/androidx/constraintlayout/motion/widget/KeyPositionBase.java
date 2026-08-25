package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
abstract class KeyPositionBase extends androidx.constraintlayout.motion.widget.Key {
    public int mCurveFit;

    public KeyPositionBase() {
            r1 = this;
            r1.<init>()
            int r0 = androidx.constraintlayout.motion.widget.Key.UNSET
            r1.mCurveFit = r0
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void getAttributeNames(java.util.HashSet<java.lang.String> r1) {
            r0 = this;
            return
    }

    public abstract boolean intersects(int r1, int r2, android.graphics.RectF r3, android.graphics.RectF r4, float r5, float r6);

    public abstract void positionAttributes(android.view.View r1, android.graphics.RectF r2, android.graphics.RectF r3, float r4, float r5, java.lang.String[] r6, float[] r7);
}
