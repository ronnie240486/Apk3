package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class SearchOrbView extends android.widget.FrameLayout implements android.view.View.OnClickListener {
    private boolean mAttachedToWindow;
    private boolean mColorAnimationEnabled;
    private android.animation.ValueAnimator mColorAnimator;
    private final android.animation.ArgbEvaluator mColorEvaluator;
    private androidx.leanback.widget.SearchOrbView.Colors mColors;
    private final android.animation.ValueAnimator.AnimatorUpdateListener mFocusUpdateListener;
    private final float mFocusedZ;
    private final float mFocusedZoom;
    private android.widget.ImageView mIcon;
    private android.graphics.drawable.Drawable mIconDrawable;
    private android.view.View.OnClickListener mListener;
    private final int mPulseDurationMs;
    private android.view.View mRootView;
    private final int mScaleDurationMs;
    private android.view.View mSearchOrbView;
    private android.animation.ValueAnimator mShadowFocusAnimator;
    private final float mUnfocusedZ;
    private final android.animation.ValueAnimator.AnimatorUpdateListener mUpdateListener;



    /* JADX INFO: loaded from: classes3.dex */
    public static class Colors {
        private static final float BRIGHTNESS_ALPHA = 0.15f;

        @androidx.annotation.ColorInt
        public int brightColor;

        @androidx.annotation.ColorInt
        public int color;

        @androidx.annotation.ColorInt
        public int iconColor;

        public Colors(@androidx.annotation.ColorInt int r1) {
                r0 = this;
                r0.<init>(r1, r1)
                return
        }

        public Colors(@androidx.annotation.ColorInt int r2, @androidx.annotation.ColorInt int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        public Colors(@androidx.annotation.ColorInt int r1, @androidx.annotation.ColorInt int r2, @androidx.annotation.ColorInt int r3) {
                r0 = this;
                r0.<init>()
                r0.color = r1
                if (r2 != r1) goto Lb
                int r2 = getBrightColor(r1)
            Lb:
                r0.brightColor = r2
                r0.iconColor = r3
                return
        }

        public static int getBrightColor(int r5) {
                int r0 = android.graphics.Color.red(r5)
                float r0 = (float) r0
                r1 = 1062836634(0x3f59999a, float:0.85)
                float r0 = r0 * r1
                r2 = 1108934656(0x42190000, float:38.25)
                float r0 = r0 + r2
                int r0 = (int) r0
                int r3 = android.graphics.Color.green(r5)
                float r3 = (float) r3
                float r3 = r3 * r1
                float r3 = r3 + r2
                int r3 = (int) r3
                int r4 = android.graphics.Color.blue(r5)
                float r4 = (float) r4
                float r4 = r4 * r1
                float r4 = r4 + r2
                int r4 = (int) r4
                int r5 = android.graphics.Color.alpha(r5)
                float r5 = (float) r5
                float r5 = r5 * r1
                float r5 = r5 + r2
                int r5 = (int) r5
                int r5 = android.graphics.Color.argb(r5, r0, r3, r4)
                return r5
        }
    }

    public SearchOrbView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SearchOrbView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.leanback.R.attr.searchOrbViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public SearchOrbView(android.content.Context r6, android.util.AttributeSet r7, int r8) {
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.animation.ArgbEvaluator r0 = new android.animation.ArgbEvaluator
            r0.<init>()
            r5.mColorEvaluator = r0
            androidx.leanback.widget.SearchOrbView$1 r0 = new androidx.leanback.widget.SearchOrbView$1
            r0.<init>(r5)
            r5.mUpdateListener = r0
            androidx.leanback.widget.SearchOrbView$2 r0 = new androidx.leanback.widget.SearchOrbView$2
            r0.<init>(r5)
            r5.mFocusUpdateListener = r0
            android.content.res.Resources r0 = r6.getResources()
            java.lang.String r1 = "layout_inflater"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            int r2 = r5.getLayoutResourceId()
            r3 = 1
            android.view.View r1 = r1.inflate(r2, r5, r3)
            r5.mRootView = r1
            int r2 = androidx.leanback.R.id.search_orb
            android.view.View r1 = r1.findViewById(r2)
            r5.mSearchOrbView = r1
            android.view.View r1 = r5.mRootView
            int r2 = androidx.leanback.R.id.icon
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r5.mIcon = r1
            android.content.res.Resources r1 = r6.getResources()
            int r2 = androidx.leanback.R.fraction.lb_search_orb_focused_zoom
            float r1 = r1.getFraction(r2, r3, r3)
            r5.mFocusedZoom = r1
            android.content.res.Resources r1 = r6.getResources()
            int r2 = androidx.leanback.R.integer.lb_search_orb_pulse_duration_ms
            int r1 = r1.getInteger(r2)
            r5.mPulseDurationMs = r1
            android.content.res.Resources r1 = r6.getResources()
            int r2 = androidx.leanback.R.integer.lb_search_orb_scale_duration_ms
            int r1 = r1.getInteger(r2)
            r5.mScaleDurationMs = r1
            android.content.res.Resources r1 = r6.getResources()
            int r2 = androidx.leanback.R.dimen.lb_search_orb_focused_z
            int r1 = r1.getDimensionPixelSize(r2)
            float r1 = (float) r1
            r5.mFocusedZ = r1
            android.content.res.Resources r2 = r6.getResources()
            int r4 = androidx.leanback.R.dimen.lb_search_orb_unfocused_z
            int r2 = r2.getDimensionPixelSize(r4)
            float r2 = (float) r2
            r5.mUnfocusedZ = r2
            int[] r2 = androidx.leanback.R.styleable.lbSearchOrbView
            r4 = 0
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r2, r8, r4)
            int r7 = androidx.leanback.R.styleable.lbSearchOrbView_searchOrbIcon
            android.graphics.drawable.Drawable r7 = r6.getDrawable(r7)
            if (r7 != 0) goto L96
            int r7 = androidx.leanback.R.drawable.lb_ic_in_app_search
            android.graphics.drawable.Drawable r7 = r0.getDrawable(r7)
        L96:
            r5.setOrbIcon(r7)
            int r7 = androidx.leanback.R.color.lb_default_search_color
            int r7 = r0.getColor(r7)
            int r8 = androidx.leanback.R.styleable.lbSearchOrbView_searchOrbColor
            int r7 = r6.getColor(r8, r7)
            int r8 = androidx.leanback.R.styleable.lbSearchOrbView_searchOrbBrightColor
            int r8 = r6.getColor(r8, r7)
            int r0 = androidx.leanback.R.styleable.lbSearchOrbView_searchOrbIconColor
            int r0 = r6.getColor(r0, r4)
            androidx.leanback.widget.SearchOrbView$Colors r2 = new androidx.leanback.widget.SearchOrbView$Colors
            r2.<init>(r7, r8, r0)
            r5.setOrbColors(r2)
            r6.recycle()
            r5.setFocusable(r3)
            r5.setClipChildren(r4)
            r5.setOnClickListener(r5)
            r5.setSoundEffectsEnabled(r4)
            r6 = 0
            r5.setSearchOrbZ(r6)
            android.widget.ImageView r6 = r5.mIcon
            androidx.core.view.ViewCompat.setZ(r6, r1)
            return
    }

    private void startShadowFocusAnimation(boolean r3, int r4) {
            r2 = this;
            android.animation.ValueAnimator r0 = r2.mShadowFocusAnimator
            if (r0 != 0) goto L15
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x002a: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r2.mShadowFocusAnimator = r0
            android.animation.ValueAnimator$AnimatorUpdateListener r1 = r2.mFocusUpdateListener
            r0.addUpdateListener(r1)
        L15:
            if (r3 == 0) goto L1d
            android.animation.ValueAnimator r3 = r2.mShadowFocusAnimator
            r3.start()
            goto L22
        L1d:
            android.animation.ValueAnimator r3 = r2.mShadowFocusAnimator
            r3.reverse()
        L22:
            android.animation.ValueAnimator r3 = r2.mShadowFocusAnimator
            long r0 = (long) r4
            r3.setDuration(r0)
            return
    }

    private void updateColorAnimator() {
            r4 = this;
            android.animation.ValueAnimator r0 = r4.mColorAnimator
            if (r0 == 0) goto La
            r0.end()
            r0 = 0
            r4.mColorAnimator = r0
        La:
            boolean r0 = r4.mColorAnimationEnabled
            if (r0 == 0) goto L58
            boolean r0 = r4.mAttachedToWindow
            if (r0 == 0) goto L58
            android.animation.ArgbEvaluator r0 = r4.mColorEvaluator
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            androidx.leanback.widget.SearchOrbView$Colors r3 = r4.mColors
            int r3 = r3.color
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            androidx.leanback.widget.SearchOrbView$Colors r3 = r4.mColors
            int r3 = r3.brightColor
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            androidx.leanback.widget.SearchOrbView$Colors r2 = r4.mColors
            int r2 = r2.color
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r1[r3] = r2
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofObject(r0, r1)
            r4.mColorAnimator = r0
            r1 = -1
            r0.setRepeatCount(r1)
            android.animation.ValueAnimator r0 = r4.mColorAnimator
            int r1 = r4.mPulseDurationMs
            int r1 = r1 * 2
            long r1 = (long) r1
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r4.mColorAnimator
            android.animation.ValueAnimator$AnimatorUpdateListener r1 = r4.mUpdateListener
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r4.mColorAnimator
            r0.start()
        L58:
            return
    }

    public final void animateOnFocus(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L5
            float r0 = r3.mFocusedZoom
            goto L7
        L5:
            r0 = 1065353216(0x3f800000, float:1.0)
        L7:
            android.view.View r1 = r3.mRootView
            android.view.ViewPropertyAnimator r1 = r1.animate()
            android.view.ViewPropertyAnimator r1 = r1.scaleX(r0)
            android.view.ViewPropertyAnimator r0 = r1.scaleY(r0)
            int r1 = r3.mScaleDurationMs
            long r1 = (long) r1
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            r0.start()
            int r0 = r3.mScaleDurationMs
            r3.startShadowFocusAnimation(r4, r0)
            r3.enableOrbColorAnimation(r4)
            return
    }

    public void enableOrbColorAnimation(boolean r1) {
            r0 = this;
            r0.mColorAnimationEnabled = r1
            r0.updateColorAnimator()
            return
    }

    public float getFocusedZoom() {
            r1 = this;
            float r0 = r1.mFocusedZoom
            return r0
    }

    public int getLayoutResourceId() {
            r1 = this;
            int r0 = androidx.leanback.R.layout.lb_search_orb
            return r0
    }

    @androidx.annotation.ColorInt
    public int getOrbColor() {
            r1 = this;
            androidx.leanback.widget.SearchOrbView$Colors r0 = r1.mColors
            int r0 = r0.color
            return r0
    }

    public androidx.leanback.widget.SearchOrbView.Colors getOrbColors() {
            r1 = this;
            androidx.leanback.widget.SearchOrbView$Colors r0 = r1.mColors
            return r0
    }

    public android.graphics.drawable.Drawable getOrbIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mIconDrawable
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 1
            r1.mAttachedToWindow = r0
            r1.updateColorAnimator()
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            android.view.View$OnClickListener r0 = r1.mListener
            if (r0 == 0) goto L7
            r0.onClick(r2)
        L7:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            r0 = 0
            r1.mAttachedToWindow = r0
            r1.updateColorAnimator()
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
            r0 = this;
            super.onFocusChanged(r1, r2, r3)
            r0.animateOnFocus(r1)
            return
    }

    public final void scaleOrbViewOnly(float r2) {
            r1 = this;
            android.view.View r0 = r1.mSearchOrbView
            r0.setScaleX(r2)
            android.view.View r0 = r1.mSearchOrbView
            r0.setScaleY(r2)
            return
    }

    public void setOnOrbClickedListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.mListener = r1
            return
    }

    public void setOrbColor(int r3) {
            r2 = this;
            androidx.leanback.widget.SearchOrbView$Colors r0 = new androidx.leanback.widget.SearchOrbView$Colors
            r1 = 0
            r0.<init>(r3, r3, r1)
            r2.setOrbColors(r0)
            return
    }

    @java.lang.Deprecated
    public void setOrbColor(@androidx.annotation.ColorInt int r3, @androidx.annotation.ColorInt int r4) {
            r2 = this;
            androidx.leanback.widget.SearchOrbView$Colors r0 = new androidx.leanback.widget.SearchOrbView$Colors
            r1 = 0
            r0.<init>(r3, r4, r1)
            r2.setOrbColors(r0)
            return
    }

    public void setOrbColors(androidx.leanback.widget.SearchOrbView.Colors r2) {
            r1 = this;
            r1.mColors = r2
            android.widget.ImageView r0 = r1.mIcon
            int r2 = r2.iconColor
            r0.setColorFilter(r2)
            android.animation.ValueAnimator r2 = r1.mColorAnimator
            if (r2 != 0) goto L15
            androidx.leanback.widget.SearchOrbView$Colors r2 = r1.mColors
            int r2 = r2.color
            r1.setOrbViewColor(r2)
            goto L19
        L15:
            r2 = 1
            r1.enableOrbColorAnimation(r2)
        L19:
            return
    }

    public void setOrbIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.mIconDrawable = r2
            android.widget.ImageView r0 = r1.mIcon
            r0.setImageDrawable(r2)
            return
    }

    public void setOrbViewColor(int r2) {
            r1 = this;
            android.view.View r0 = r1.mSearchOrbView
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L15
            android.view.View r0 = r1.mSearchOrbView
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            r0.setColor(r2)
        L15:
            return
    }

    public void setSearchOrbZ(float r4) {
            r3 = this;
            android.view.View r0 = r3.mSearchOrbView
            float r1 = r3.mUnfocusedZ
            float r2 = r3.mFocusedZ
            float r2 = r2 - r1
            float r2 = r2 * r4
            float r2 = r2 + r1
            androidx.core.view.ViewCompat.setZ(r0, r2)
            return
    }
}
