package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
class GuidedActionsRelativeLayout extends android.widget.RelativeLayout {
    private boolean mInOverride;
    private androidx.leanback.widget.GuidedActionsRelativeLayout.InterceptKeyEventListener mInterceptKeyEventListener;
    private float mKeyLinePercent;

    /* JADX INFO: loaded from: classes2.dex */
    public interface InterceptKeyEventListener {
        boolean onInterceptKeyEvent(android.view.KeyEvent r1);
    }

    public GuidedActionsRelativeLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public GuidedActionsRelativeLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public GuidedActionsRelativeLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 0
            r0.mInOverride = r2
            float r1 = androidx.leanback.widget.GuidanceStylingRelativeLayout.getKeyLinePercent(r1)
            r0.mKeyLinePercent = r1
            return
    }

    private void init() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = androidx.leanback.R.styleable.LeanbackGuidedStepTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            int r1 = androidx.leanback.R.styleable.LeanbackGuidedStepTheme_guidedStepKeyline
            r2 = 1109393408(0x42200000, float:40.0)
            float r1 = r0.getFloat(r1, r2)
            r3.mKeyLinePercent = r1
            r0.recycle()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            androidx.leanback.widget.GuidedActionsRelativeLayout$InterceptKeyEventListener r0 = r1.mInterceptKeyEventListener
            if (r0 == 0) goto Lc
            boolean r0 = r0.onInterceptKeyEvent(r2)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            boolean r2 = super.dispatchKeyEvent(r2)
            return r2
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r1 = 0
            r0.mInOverride = r1
            return
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int r4, int r5) {
            r3 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 <= 0) goto L2e
            int r1 = androidx.leanback.R.id.guidedactions_sub_list
            android.view.View r1 = r3.findViewById(r1)
            if (r1 == 0) goto L2e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.topMargin
            if (r2 >= 0) goto L1f
            boolean r2 = r3.mInOverride
            if (r2 != 0) goto L1f
            r2 = 1
            r3.mInOverride = r2
        L1f:
            boolean r2 = r3.mInOverride
            if (r2 == 0) goto L2e
            float r2 = r3.mKeyLinePercent
            float r0 = (float) r0
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r0
            int r0 = (int) r2
            r1.topMargin = r0
        L2e:
            super.onMeasure(r4, r5)
            return
    }

    public void setInterceptKeyEventListener(androidx.leanback.widget.GuidedActionsRelativeLayout.InterceptKeyEventListener r1) {
            r0 = this;
            r0.mInterceptKeyEventListener = r1
            return
    }
}
