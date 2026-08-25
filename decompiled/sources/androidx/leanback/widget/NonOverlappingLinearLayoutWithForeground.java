package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
class NonOverlappingLinearLayoutWithForeground extends android.widget.LinearLayout {
    private static final int VERSION_M = 23;
    private android.graphics.drawable.Drawable mForeground;
    private boolean mForegroundBoundsChanged;
    private final android.graphics.Rect mSelfBounds;

    public NonOverlappingLinearLayoutWithForeground(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NonOverlappingLinearLayoutWithForeground(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public NonOverlappingLinearLayoutWithForeground(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r2.mSelfBounds = r5
            android.content.pm.ApplicationInfo r5 = r3.getApplicationInfo()
            int r5 = r5.targetSdkVersion
            r0 = 23
            if (r5 < r0) goto L19
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r0) goto L19
            goto L32
        L19:
            r5 = 1
            int[] r5 = new int[r5]
            r0 = 16843017(0x1010109, float:2.36943E-38)
            r1 = 0
            r5[r1] = r0
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r5)
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r1)
            if (r4 == 0) goto L2f
            r2.setForegroundCompat(r4)
        L2f:
            r3.recycle()
        L32:
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r7) {
            r6 = this;
            super.draw(r7)
            android.graphics.drawable.Drawable r0 = r6.mForeground
            if (r0 == 0) goto L2b
            boolean r1 = r6.mForegroundBoundsChanged
            if (r1 == 0) goto L28
            r1 = 0
            r6.mForegroundBoundsChanged = r1
            android.graphics.Rect r2 = r6.mSelfBounds
            int r3 = r6.getRight()
            int r4 = r6.getLeft()
            int r3 = r3 - r4
            int r4 = r6.getBottom()
            int r5 = r6.getTop()
            int r4 = r4 - r5
            r2.set(r1, r1, r3, r4)
            r0.setBounds(r2)
        L28:
            r0.draw(r7)
        L2b:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            android.graphics.drawable.Drawable r0 = r2.mForeground
            if (r0 == 0) goto L16
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L16
            android.graphics.drawable.Drawable r0 = r2.mForeground
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L16:
            return
    }

    public android.graphics.drawable.Drawable getForegroundCompat() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            android.graphics.drawable.Drawable r0 = androidx.leanback.widget.ForegroundHelper.getForeground(r2)
            return r0
        Lb:
            android.graphics.drawable.Drawable r0 = r2.mForeground
            return r0
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.mForeground
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            boolean r2 = r0.mForegroundBoundsChanged
            r1 = r1 | r2
            r0.mForegroundBoundsChanged = r1
            return
    }

    public void setForegroundCompat(android.graphics.drawable.Drawable r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            androidx.leanback.widget.ForegroundHelper.setForeground(r2, r3)
            goto L2d
        La:
            android.graphics.drawable.Drawable r0 = r2.mForeground
            if (r0 == r3) goto L2d
            r2.mForeground = r3
            r3 = 1
            r2.mForegroundBoundsChanged = r3
            r3 = 0
            r2.setWillNotDraw(r3)
            android.graphics.drawable.Drawable r3 = r2.mForeground
            r3.setCallback(r2)
            android.graphics.drawable.Drawable r3 = r2.mForeground
            boolean r3 = r3.isStateful()
            if (r3 == 0) goto L2d
            android.graphics.drawable.Drawable r3 = r2.mForeground
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L2d:
            return
    }

    @Override // android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.mForeground
            if (r2 != r0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }
}
