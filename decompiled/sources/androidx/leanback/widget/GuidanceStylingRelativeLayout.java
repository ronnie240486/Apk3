package androidx.leanback.widget;

/* JADX INFO: loaded from: classes3.dex */
class GuidanceStylingRelativeLayout extends android.widget.RelativeLayout {
    private float mTitleKeylinePercent;

    public GuidanceStylingRelativeLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public GuidanceStylingRelativeLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public GuidanceStylingRelativeLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            float r1 = getKeyLinePercent(r1)
            r0.mTitleKeylinePercent = r1
            return
    }

    public static float getKeyLinePercent(android.content.Context r2) {
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int[] r0 = androidx.leanback.R.styleable.LeanbackGuidedStepTheme
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r0)
            int r0 = androidx.leanback.R.styleable.LeanbackGuidedStepTheme_guidedStepKeyline
            r1 = 1109393408(0x42200000, float:40.0)
            float r0 = r2.getFloat(r0, r1)
            r2.recycle()
            return r0
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            super.onLayout(r3, r4, r5, r6, r7)
            android.view.View r3 = r2.getRootView()
            int r4 = androidx.leanback.R.id.guidance_title
            android.view.View r3 = r3.findViewById(r4)
            android.view.View r4 = r2.getRootView()
            int r5 = androidx.leanback.R.id.guidance_breadcrumb
            android.view.View r4 = r4.findViewById(r5)
            android.view.View r5 = r2.getRootView()
            int r6 = androidx.leanback.R.id.guidance_description
            android.view.View r5 = r5.findViewById(r6)
            android.view.View r6 = r2.getRootView()
            int r7 = androidx.leanback.R.id.guidance_icon
            android.view.View r6 = r6.findViewById(r7)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            int r7 = r2.getMeasuredHeight()
            float r7 = (float) r7
            float r0 = r2.mTitleKeylinePercent
            float r7 = r7 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 / r0
            int r7 = (int) r7
            if (r3 == 0) goto L6e
            android.view.ViewParent r0 = r3.getParent()
            if (r0 != r2) goto L6e
            int r0 = r3.getBaseline()
            int r1 = r4.getMeasuredHeight()
            int r0 = r7 - r0
            int r0 = r0 - r1
            int r1 = r3.getPaddingTop()
            int r0 = r0 - r1
            int r1 = r4.getTop()
            int r0 = r0 - r1
            android.view.ViewParent r1 = r4.getParent()
            if (r1 != r2) goto L60
            r4.offsetTopAndBottom(r0)
        L60:
            r3.offsetTopAndBottom(r0)
            if (r5 == 0) goto L6e
            android.view.ViewParent r3 = r5.getParent()
            if (r3 != r2) goto L6e
            r5.offsetTopAndBottom(r0)
        L6e:
            if (r6 == 0) goto L86
            android.view.ViewParent r3 = r6.getParent()
            if (r3 != r2) goto L86
            android.graphics.drawable.Drawable r3 = r6.getDrawable()
            if (r3 == 0) goto L86
            int r3 = r6.getMeasuredHeight()
            int r3 = r3 / 2
            int r7 = r7 - r3
            r6.offsetTopAndBottom(r7)
        L86:
            return
    }
}
