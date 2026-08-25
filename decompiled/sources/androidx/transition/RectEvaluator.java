package androidx.transition;

/* JADX INFO: loaded from: classes2.dex */
class RectEvaluator implements android.animation.TypeEvaluator<android.graphics.Rect> {
    private android.graphics.Rect mRect;

    public RectEvaluator() {
            r0 = this;
            r0.<init>()
            return
    }

    public RectEvaluator(android.graphics.Rect r1) {
            r0 = this;
            r0.<init>()
            r0.mRect = r1
            return
    }

    /* JADX INFO: renamed from: evaluate, reason: avoid collision after fix types in other method */
    public android.graphics.Rect evaluate2(float r5, android.graphics.Rect r6, android.graphics.Rect r7) {
            r4 = this;
            int r0 = r6.left
            int r1 = r7.left
            int r1 = r1 - r0
            float r1 = (float) r1
            float r1 = r1 * r5
            int r1 = (int) r1
            int r0 = r0 + r1
            int r1 = r6.top
            int r2 = r7.top
            int r2 = r2 - r1
            float r2 = (float) r2
            float r2 = r2 * r5
            int r2 = (int) r2
            int r1 = r1 + r2
            int r2 = r6.right
            int r3 = r7.right
            int r3 = r3 - r2
            float r3 = (float) r3
            float r3 = r3 * r5
            int r3 = (int) r3
            int r2 = r2 + r3
            int r6 = r6.bottom
            int r7 = r7.bottom
            int r7 = r7 - r6
            float r7 = (float) r7
            float r7 = r7 * r5
            int r5 = (int) r7
            int r6 = r6 + r5
            android.graphics.Rect r5 = r4.mRect
            if (r5 != 0) goto L32
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r0, r1, r2, r6)
            return r5
        L32:
            r5.set(r0, r1, r2, r6)
            android.graphics.Rect r5 = r4.mRect
            return r5
    }

    @Override // android.animation.TypeEvaluator
    public /* bridge */ /* synthetic */ android.graphics.Rect evaluate(float r1, android.graphics.Rect r2, android.graphics.Rect r3) {
            r0 = this;
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            android.graphics.Rect r1 = r0.evaluate2(r1, r2, r3)
            return r1
    }
}
