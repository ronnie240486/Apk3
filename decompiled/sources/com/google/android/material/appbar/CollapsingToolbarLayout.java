package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes3.dex */
public class CollapsingToolbarLayout extends android.widget.FrameLayout {
    private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
    private static final int DEF_STYLE_RES = 0;
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE = 0;

    @androidx.annotation.NonNull
    public final com.google.android.material.internal.CollapsingTextHelper collapsingTextHelper;
    private boolean collapsingTitleEnabled;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable contentScrim;
    public int currentOffset;
    private boolean drawCollapsingTitle;
    private android.view.View dummyView;

    @androidx.annotation.NonNull
    public final com.google.android.material.elevation.ElevationOverlayProvider elevationOverlayProvider;
    private int expandedMarginBottom;
    private int expandedMarginEnd;
    private int expandedMarginStart;
    private int expandedMarginTop;
    private int extraMultilineHeight;
    private boolean extraMultilineHeightEnabled;
    private boolean forceApplySystemWindowInsetTop;

    @androidx.annotation.Nullable
    public androidx.core.view.WindowInsetsCompat lastInsets;
    private com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener onOffsetChangedListener;
    private boolean refreshToolbar;
    private int scrimAlpha;
    private long scrimAnimationDuration;
    private final android.animation.TimeInterpolator scrimAnimationFadeInInterpolator;
    private final android.animation.TimeInterpolator scrimAnimationFadeOutInterpolator;
    private android.animation.ValueAnimator scrimAnimator;
    private int scrimVisibleHeightTrigger;
    private boolean scrimsAreShown;

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable statusBarScrim;
    private int titleCollapseMode;
    private final android.graphics.Rect tmpRect;

    @androidx.annotation.Nullable
    private android.view.ViewGroup toolbar;

    @androidx.annotation.Nullable
    private android.view.View toolbarDirectChild;
    private int toolbarId;
    private int topInsetApplied;



    /* JADX INFO: loaded from: classes.dex */
    public static class LayoutParams extends android.widget.FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;
        private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5f;
        public int collapseMode;
        public float parallaxMult;

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.collapseMode = r1
                r1 = 1056964608(0x3f000000, float:0.5)
                r0.parallaxMult = r1
                return
        }

        public LayoutParams(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r1 = 0
                r0.collapseMode = r1
                r1 = 1056964608(0x3f000000, float:0.5)
                r0.parallaxMult = r1
                return
        }

        public LayoutParams(android.content.Context r4, android.util.AttributeSet r5) {
                r3 = this;
                r3.<init>(r4, r5)
                r0 = 0
                r3.collapseMode = r0
                r1 = 1056964608(0x3f000000, float:0.5)
                r3.parallaxMult = r1
                int[] r2 = com.google.android.material.R.styleable.CollapsingToolbarLayout_Layout
                android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2)
                int r5 = com.google.android.material.R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode
                int r5 = r4.getInt(r5, r0)
                r3.collapseMode = r5
                int r5 = com.google.android.material.R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier
                float r5 = r4.getFloat(r5, r1)
                r3.setParallaxMultiplier(r5)
                r4.recycle()
                return
        }

        public LayoutParams(@androidx.annotation.NonNull android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.collapseMode = r1
                r1 = 1056964608(0x3f000000, float:0.5)
                r0.parallaxMult = r1
                return
        }

        public LayoutParams(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.collapseMode = r1
                r1 = 1056964608(0x3f000000, float:0.5)
                r0.parallaxMult = r1
                return
        }

        @androidx.annotation.RequiresApi(19)
        public LayoutParams(@androidx.annotation.NonNull android.widget.FrameLayout.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.collapseMode = r1
                r1 = 1056964608(0x3f000000, float:0.5)
                r0.parallaxMult = r1
                return
        }

        @androidx.annotation.RequiresApi(19)
        public LayoutParams(@androidx.annotation.NonNull com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.collapseMode = r0
                r0 = 1056964608(0x3f000000, float:0.5)
                r1.parallaxMult = r0
                int r0 = r2.collapseMode
                r1.collapseMode = r0
                float r2 = r2.parallaxMult
                r1.parallaxMult = r2
                return
        }

        public int getCollapseMode() {
                r1 = this;
                int r0 = r1.collapseMode
                return r0
        }

        public float getParallaxMultiplier() {
                r1 = this;
                float r0 = r1.parallaxMult
                return r0
        }

        public void setCollapseMode(int r1) {
                r0 = this;
                r0.collapseMode = r1
                return
        }

        public void setParallaxMultiplier(float r1) {
                r0 = this;
                r0.parallaxMult = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OffsetUpdateListener implements com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener {
        public final /* synthetic */ com.google.android.material.appbar.CollapsingToolbarLayout this$0;

        public OffsetUpdateListener(com.google.android.material.appbar.CollapsingToolbarLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(com.google.android.material.appbar.AppBarLayout r9, int r10) {
                r8 = this;
                com.google.android.material.appbar.CollapsingToolbarLayout r9 = r8.this$0
                r9.currentOffset = r10
                androidx.core.view.WindowInsetsCompat r9 = r9.lastInsets
                r0 = 0
                if (r9 == 0) goto Le
                int r9 = r9.getSystemWindowInsetTop()
                goto Lf
            Le:
                r9 = 0
            Lf:
                com.google.android.material.appbar.CollapsingToolbarLayout r1 = r8.this$0
                int r1 = r1.getChildCount()
                r2 = 0
            L16:
                if (r2 >= r1) goto L50
                com.google.android.material.appbar.CollapsingToolbarLayout r3 = r8.this$0
                android.view.View r3 = r3.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
                com.google.android.material.appbar.CollapsingToolbarLayout$LayoutParams r4 = (com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams) r4
                com.google.android.material.appbar.ViewOffsetHelper r5 = com.google.android.material.appbar.CollapsingToolbarLayout.getViewOffsetHelper(r3)
                int r6 = r4.collapseMode
                r7 = 1
                if (r6 == r7) goto L3f
                r3 = 2
                if (r6 == r3) goto L31
                goto L4d
            L31:
                int r3 = -r10
                float r3 = (float) r3
                float r4 = r4.parallaxMult
                float r3 = r3 * r4
                int r3 = java.lang.Math.round(r3)
                r5.setTopAndBottomOffset(r3)
                goto L4d
            L3f:
                int r4 = -r10
                com.google.android.material.appbar.CollapsingToolbarLayout r6 = r8.this$0
                int r3 = r6.getMaxOffsetForPinChild(r3)
                int r3 = androidx.core.math.MathUtils.clamp(r4, r0, r3)
                r5.setTopAndBottomOffset(r3)
            L4d:
                int r2 = r2 + 1
                goto L16
            L50:
                com.google.android.material.appbar.CollapsingToolbarLayout r0 = r8.this$0
                r0.updateScrimVisibility()
                com.google.android.material.appbar.CollapsingToolbarLayout r0 = r8.this$0
                android.graphics.drawable.Drawable r1 = r0.statusBarScrim
                if (r1 == 0) goto L60
                if (r9 <= 0) goto L60
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(r0)
            L60:
                com.google.android.material.appbar.CollapsingToolbarLayout r0 = r8.this$0
                int r0 = r0.getHeight()
                com.google.android.material.appbar.CollapsingToolbarLayout r1 = r8.this$0
                int r1 = androidx.core.view.ViewCompat.getMinimumHeight(r1)
                int r1 = r0 - r1
                int r1 = r1 - r9
                com.google.android.material.appbar.CollapsingToolbarLayout r9 = r8.this$0
                int r9 = r9.getScrimVisibleHeightTrigger()
                int r0 = r0 - r9
                com.google.android.material.appbar.CollapsingToolbarLayout r9 = r8.this$0
                com.google.android.material.internal.CollapsingTextHelper r9 = r9.collapsingTextHelper
                r2 = 1065353216(0x3f800000, float:1.0)
                float r0 = (float) r0
                float r3 = (float) r1
                float r0 = r0 / r3
                float r0 = java.lang.Math.min(r2, r0)
                r9.setFadeModeStartFraction(r0)
                com.google.android.material.appbar.CollapsingToolbarLayout r9 = r8.this$0
                com.google.android.material.internal.CollapsingTextHelper r0 = r9.collapsingTextHelper
                int r9 = r9.currentOffset
                int r9 = r9 + r1
                r0.setCurrentOffsetY(r9)
                com.google.android.material.appbar.CollapsingToolbarLayout r9 = r8.this$0
                com.google.android.material.internal.CollapsingTextHelper r9 = r9.collapsingTextHelper
                int r10 = java.lang.Math.abs(r10)
                float r10 = (float) r10
                float r10 = r10 / r3
                r9.setExpansionFraction(r10)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(23)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TitleCollapseMode {
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_Design_CollapsingToolbar
            com.google.android.material.appbar.CollapsingToolbarLayout.DEF_STYLE_RES = r0
            return
    }

    public CollapsingToolbarLayout(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CollapsingToolbarLayout(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.collapsingToolbarLayoutStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public CollapsingToolbarLayout(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12, int r13) {
            r10 = this;
            int r4 = com.google.android.material.appbar.CollapsingToolbarLayout.DEF_STYLE_RES
            android.content.Context r11 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = 1
            r10.refreshToolbar = r11
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.tmpRect = r0
            r6 = -1
            r10.scrimVisibleHeightTrigger = r6
            r7 = 0
            r10.topInsetApplied = r7
            r10.extraMultilineHeight = r7
            android.content.Context r8 = r10.getContext()
            com.google.android.material.internal.CollapsingTextHelper r9 = new com.google.android.material.internal.CollapsingTextHelper
            r9.<init>(r10)
            r10.collapsingTextHelper = r9
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.DECELERATE_INTERPOLATOR
            r9.setTextSizeInterpolator(r0)
            r9.setRtlTextDirectionHeuristicsEnabled(r7)
            com.google.android.material.elevation.ElevationOverlayProvider r0 = new com.google.android.material.elevation.ElevationOverlayProvider
            r0.<init>(r8)
            r10.elevationOverlayProvider = r0
            int[] r2 = com.google.android.material.R.styleable.CollapsingToolbarLayout
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r13 = com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleGravity
            r0 = 8388691(0x800053, float:1.175506E-38)
            int r13 = r12.getInt(r13, r0)
            r9.setExpandedTextGravity(r13)
            int r13 = com.google.android.material.R.styleable.CollapsingToolbarLayout_collapsedTitleGravity
            r0 = 8388627(0x800013, float:1.175497E-38)
            int r13 = r12.getInt(r13, r0)
            r9.setCollapsedTextGravity(r13)
            int r13 = com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMargin
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.expandedMarginBottom = r13
            r10.expandedMarginEnd = r13
            r10.expandedMarginTop = r13
            r10.expandedMarginStart = r13
            int r13 = com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L74
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.expandedMarginStart = r13
        L74:
            int r13 = com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L82
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.expandedMarginEnd = r13
        L82:
            int r13 = com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L90
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.expandedMarginTop = r13
        L90:
            int r13 = com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L9e
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.expandedMarginBottom = r13
        L9e:
            int r13 = com.google.android.material.R.styleable.CollapsingToolbarLayout_titleEnabled
            boolean r13 = r12.getBoolean(r13, r11)
            r10.collapsingTitleEnabled = r13
            int r13 = com.google.android.material.R.styleable.CollapsingToolbarLayout_title
            java.lang.CharSequence r13 = r12.getText(r13)
            r10.setTitle(r13)
            int r13 = com.google.android.material.R.style.TextAppearance_Design_CollapsingToolbar_Expanded
            r9.setExpandedTextAppearance(r13)
            int r13 = androidx.appcompat.R.style.TextAppearance_AppCompat_Widget_ActionBar_Title
            r9.setCollapsedTextAppearance(r13)
            int r13 = com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto Lc8
            int r13 = r12.getResourceId(r13, r7)
            r9.setExpandedTextAppearance(r13)
        Lc8:
            int r13 = com.google.android.material.R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto Ld7
            int r13 = r12.getResourceId(r13, r7)
            r9.setCollapsedTextAppearance(r13)
        Ld7:
            int r13 = com.google.android.material.R.styleable.CollapsingToolbarLayout_titleTextEllipsize
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto Lea
            int r13 = r12.getInt(r13, r6)
            android.text.TextUtils$TruncateAt r13 = r10.convertEllipsizeToTruncateAt(r13)
            r10.setTitleEllipsize(r13)
        Lea:
            int r13 = com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleTextColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto Lf9
            android.content.res.ColorStateList r13 = com.google.android.material.resources.MaterialResources.getColorStateList(r8, r12, r13)
            r9.setExpandedTextColor(r13)
        Lf9:
            int r13 = com.google.android.material.R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L108
            android.content.res.ColorStateList r13 = com.google.android.material.resources.MaterialResources.getColorStateList(r8, r12, r13)
            r9.setCollapsedTextColor(r13)
        L108:
            int r13 = com.google.android.material.R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger
            int r13 = r12.getDimensionPixelSize(r13, r6)
            r10.scrimVisibleHeightTrigger = r13
            int r13 = com.google.android.material.R.styleable.CollapsingToolbarLayout_maxLines
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L11f
            int r11 = r12.getInt(r13, r11)
            r9.setMaxLines(r11)
        L11f:
            int r11 = com.google.android.material.R.styleable.CollapsingToolbarLayout_titlePositionInterpolator
            boolean r13 = r12.hasValue(r11)
            if (r13 == 0) goto L132
            int r11 = r12.getResourceId(r11, r7)
            android.view.animation.Interpolator r11 = android.view.animation.AnimationUtils.loadInterpolator(r8, r11)
            r9.setPositionInterpolator(r11)
        L132:
            int r11 = com.google.android.material.R.styleable.CollapsingToolbarLayout_scrimAnimationDuration
            r13 = 600(0x258, float:8.41E-43)
            int r11 = r12.getInt(r11, r13)
            long r0 = (long) r11
            r10.scrimAnimationDuration = r0
            int r11 = com.google.android.material.R.attr.motionEasingStandardInterpolator
            android.animation.TimeInterpolator r13 = com.google.android.material.animation.AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR
            android.animation.TimeInterpolator r13 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r8, r11, r13)
            r10.scrimAnimationFadeInInterpolator = r13
            android.animation.TimeInterpolator r13 = com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r11 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r8, r11, r13)
            r10.scrimAnimationFadeOutInterpolator = r11
            int r11 = com.google.android.material.R.styleable.CollapsingToolbarLayout_contentScrim
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setContentScrim(r11)
            int r11 = com.google.android.material.R.styleable.CollapsingToolbarLayout_statusBarScrim
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarScrim(r11)
            int r11 = com.google.android.material.R.styleable.CollapsingToolbarLayout_titleCollapseMode
            int r11 = r12.getInt(r11, r7)
            r10.setTitleCollapseMode(r11)
            int r11 = com.google.android.material.R.styleable.CollapsingToolbarLayout_toolbarId
            int r11 = r12.getResourceId(r11, r6)
            r10.toolbarId = r11
            int r11 = com.google.android.material.R.styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop
            boolean r11 = r12.getBoolean(r11, r7)
            r10.forceApplySystemWindowInsetTop = r11
            int r11 = com.google.android.material.R.styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled
            boolean r11 = r12.getBoolean(r11, r7)
            r10.extraMultilineHeightEnabled = r11
            r12.recycle()
            r10.setWillNotDraw(r7)
            com.google.android.material.appbar.CollapsingToolbarLayout$1 r11 = new com.google.android.material.appbar.CollapsingToolbarLayout$1
            r11.<init>(r10)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r10, r11)
            return
    }

    private void animateScrim(int r5) {
            r4 = this;
            r4.ensureToolbar()
            android.animation.ValueAnimator r0 = r4.scrimAnimator
            if (r0 != 0) goto L25
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            r4.scrimAnimator = r0
            int r1 = r4.scrimAlpha
            if (r5 <= r1) goto L15
            android.animation.TimeInterpolator r1 = r4.scrimAnimationFadeInInterpolator
            goto L17
        L15:
            android.animation.TimeInterpolator r1 = r4.scrimAnimationFadeOutInterpolator
        L17:
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r4.scrimAnimator
            com.google.android.material.appbar.CollapsingToolbarLayout$2 r1 = new com.google.android.material.appbar.CollapsingToolbarLayout$2
            r1.<init>(r4)
            r0.addUpdateListener(r1)
            goto L30
        L25:
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L30
            android.animation.ValueAnimator r0 = r4.scrimAnimator
            r0.cancel()
        L30:
            android.animation.ValueAnimator r0 = r4.scrimAnimator
            long r1 = r4.scrimAnimationDuration
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r4.scrimAnimator
            r1 = 2
            int[] r1 = new int[r1]
            r2 = 0
            int r3 = r4.scrimAlpha
            r1[r2] = r3
            r2 = 1
            r1[r2] = r5
            r0.setIntValues(r1)
            android.animation.ValueAnimator r5 = r4.scrimAnimator
            r5.start()
            return
    }

    private android.text.TextUtils.TruncateAt convertEllipsizeToTruncateAt(int r2) {
            r1 = this;
            if (r2 == 0) goto L11
            r0 = 1
            if (r2 == r0) goto Le
            r0 = 3
            if (r2 == r0) goto Lb
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            return r2
        Lb:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MARQUEE
            return r2
        Le:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            return r2
        L11:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
            return r2
    }

    private void disableLiftOnScrollIfNeeded(com.google.android.material.appbar.AppBarLayout r2) {
            r1 = this;
            boolean r0 = r1.isTitleCollapseFadeMode()
            if (r0 == 0) goto La
            r0 = 0
            r2.setLiftOnScroll(r0)
        La:
            return
    }

    private void ensureToolbar() {
            r6 = this;
            boolean r0 = r6.refreshToolbar
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r6.toolbar = r0
            r6.toolbarDirectChild = r0
            int r1 = r6.toolbarId
            r2 = -1
            if (r1 == r2) goto L1f
            android.view.View r1 = r6.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.toolbar = r1
            if (r1 == 0) goto L1f
            android.view.View r1 = r6.findDirectChild(r1)
            r6.toolbarDirectChild = r1
        L1f:
            android.view.ViewGroup r1 = r6.toolbar
            r2 = 0
            if (r1 != 0) goto L3e
            int r1 = r6.getChildCount()
            r3 = 0
        L29:
            if (r3 >= r1) goto L3c
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = isToolbar(r4)
            if (r5 == 0) goto L39
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L3c
        L39:
            int r3 = r3 + 1
            goto L29
        L3c:
            r6.toolbar = r0
        L3e:
            r6.updateDummyView()
            r6.refreshToolbar = r2
            return
    }

    @androidx.annotation.NonNull
    private android.view.View findDirectChild(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == r2) goto L14
            if (r0 == 0) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto Lf
            r3 = r0
            android.view.View r3 = (android.view.View) r3
        Lf:
            android.view.ViewParent r0 = r0.getParent()
            goto L4
        L14:
            return r3
    }

    private static int getHeightWithMargins(@androidx.annotation.NonNull android.view.View r2) {
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L15
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r2 = r2.getMeasuredHeight()
            int r1 = r0.topMargin
            int r2 = r2 + r1
            int r0 = r0.bottomMargin
            int r2 = r2 + r0
            return r2
        L15:
            int r2 = r2.getMeasuredHeight()
            return r2
    }

    private static java.lang.CharSequence getToolbarTitle(android.view.View r1) {
            boolean r0 = r1 instanceof androidx.appcompat.widget.Toolbar
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            java.lang.CharSequence r1 = r1.getTitle()
            return r1
        Lb:
            boolean r0 = r1 instanceof android.widget.Toolbar
            if (r0 == 0) goto L16
            android.widget.Toolbar r1 = (android.widget.Toolbar) r1
            java.lang.CharSequence r1 = r1.getTitle()
            return r1
        L16:
            r1 = 0
            return r1
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.appbar.ViewOffsetHelper getViewOffsetHelper(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = com.google.android.material.R.id.view_offset_helper
            java.lang.Object r1 = r2.getTag(r0)
            com.google.android.material.appbar.ViewOffsetHelper r1 = (com.google.android.material.appbar.ViewOffsetHelper) r1
            if (r1 != 0) goto L12
            com.google.android.material.appbar.ViewOffsetHelper r1 = new com.google.android.material.appbar.ViewOffsetHelper
            r1.<init>(r2)
            r2.setTag(r0, r1)
        L12:
            return r1
    }

    private boolean isTitleCollapseFadeMode() {
            r2 = this;
            int r0 = r2.titleCollapseMode
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    private static boolean isToolbar(android.view.View r1) {
            boolean r0 = r1 instanceof androidx.appcompat.widget.Toolbar
            if (r0 != 0) goto Lb
            boolean r1 = r1 instanceof android.widget.Toolbar
            if (r1 == 0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    private boolean isToolbarChild(android.view.View r4) {
            r3 = this;
            android.view.View r0 = r3.toolbarDirectChild
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lc
            if (r0 != r3) goto L9
            goto Lc
        L9:
            if (r4 != r0) goto L11
            goto L12
        Lc:
            android.view.ViewGroup r0 = r3.toolbar
            if (r4 != r0) goto L11
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    private void updateCollapsedBounds(boolean r10) {
            r9 = this;
            android.view.View r0 = r9.toolbarDirectChild
            if (r0 == 0) goto L5
            goto L7
        L5:
            android.view.ViewGroup r0 = r9.toolbar
        L7:
            int r0 = r9.getMaxOffsetForPinChild(r0)
            android.view.View r1 = r9.dummyView
            android.graphics.Rect r2 = r9.tmpRect
            com.google.android.material.internal.DescendantOffsetUtils.getDescendantRect(r9, r1, r2)
            android.view.ViewGroup r1 = r9.toolbar
            boolean r2 = r1 instanceof androidx.appcompat.widget.Toolbar
            r3 = 0
            if (r2 == 0) goto L2c
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            int r3 = r1.getTitleMarginStart()
            int r2 = r1.getTitleMarginEnd()
            int r4 = r1.getTitleMarginTop()
            int r1 = r1.getTitleMarginBottom()
            goto L4c
        L2c:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r2 < r4) goto L49
            boolean r2 = r1 instanceof android.widget.Toolbar
            if (r2 == 0) goto L49
            android.widget.Toolbar r1 = (android.widget.Toolbar) r1
            int r3 = r1.getTitleMarginStart()
            int r2 = r1.getTitleMarginEnd()
            int r4 = r1.getTitleMarginTop()
            int r1 = r1.getTitleMarginBottom()
            goto L4c
        L49:
            r1 = 0
            r2 = 0
            r4 = 0
        L4c:
            com.google.android.material.internal.CollapsingTextHelper r5 = r9.collapsingTextHelper
            android.graphics.Rect r6 = r9.tmpRect
            int r7 = r6.left
            if (r10 == 0) goto L56
            r8 = r2
            goto L57
        L56:
            r8 = r3
        L57:
            int r7 = r7 + r8
            int r8 = r6.top
            int r8 = r8 + r0
            int r8 = r8 + r4
            int r4 = r6.right
            if (r10 == 0) goto L61
            goto L62
        L61:
            r3 = r2
        L62:
            int r4 = r4 - r3
            int r10 = r6.bottom
            int r10 = r10 + r0
            int r10 = r10 - r1
            r5.setCollapsedBounds(r7, r8, r4, r10)
            return
    }

    private void updateContentDescriptionFromTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getTitle()
            r1.setContentDescription(r0)
            return
    }

    private void updateContentScrimBounds(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2, int r3, int r4) {
            r1 = this;
            android.view.ViewGroup r0 = r1.toolbar
            r1.updateContentScrimBounds(r2, r0, r3, r4)
            return
    }

    private void updateContentScrimBounds(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2, @androidx.annotation.Nullable android.view.View r3, int r4, int r5) {
            r1 = this;
            boolean r0 = r1.isTitleCollapseFadeMode()
            if (r0 == 0) goto L10
            if (r3 == 0) goto L10
            boolean r0 = r1.collapsingTitleEnabled
            if (r0 == 0) goto L10
            int r5 = r3.getBottom()
        L10:
            r3 = 0
            r2.setBounds(r3, r3, r4, r5)
            return
    }

    private void updateDummyView() {
            r3 = this;
            boolean r0 = r3.collapsingTitleEnabled
            if (r0 != 0) goto L17
            android.view.View r0 = r3.dummyView
            if (r0 == 0) goto L17
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L17
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r3.dummyView
            r0.removeView(r1)
        L17:
            boolean r0 = r3.collapsingTitleEnabled
            if (r0 == 0) goto L3e
            android.view.ViewGroup r0 = r3.toolbar
            if (r0 == 0) goto L3e
            android.view.View r0 = r3.dummyView
            if (r0 != 0) goto L2e
            android.view.View r0 = new android.view.View
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.dummyView = r0
        L2e:
            android.view.View r0 = r3.dummyView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L3e
            android.view.ViewGroup r0 = r3.toolbar
            android.view.View r1 = r3.dummyView
            r2 = -1
            r0.addView(r1, r2, r2)
        L3e:
            return
    }

    private void updateTextBounds(int r6, int r7, int r8, int r9, boolean r10) {
            r5 = this;
            boolean r0 = r5.collapsingTitleEnabled
            if (r0 == 0) goto L50
            android.view.View r0 = r5.dummyView
            if (r0 == 0) goto L50
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1a
            android.view.View r0 = r5.dummyView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            r5.drawCollapsingTitle = r0
            if (r0 != 0) goto L21
            if (r10 == 0) goto L50
        L21:
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r5)
            if (r0 != r2) goto L28
            r1 = 1
        L28:
            r5.updateCollapsedBounds(r1)
            com.google.android.material.internal.CollapsingTextHelper r0 = r5.collapsingTextHelper
            if (r1 == 0) goto L32
            int r2 = r5.expandedMarginEnd
            goto L34
        L32:
            int r2 = r5.expandedMarginStart
        L34:
            android.graphics.Rect r3 = r5.tmpRect
            int r3 = r3.top
            int r4 = r5.expandedMarginTop
            int r3 = r3 + r4
            int r8 = r8 - r6
            if (r1 == 0) goto L41
            int r6 = r5.expandedMarginStart
            goto L43
        L41:
            int r6 = r5.expandedMarginEnd
        L43:
            int r8 = r8 - r6
            int r9 = r9 - r7
            int r6 = r5.expandedMarginBottom
            int r9 = r9 - r6
            r0.setExpandedBounds(r2, r3, r8, r9)
            com.google.android.material.internal.CollapsingTextHelper r6 = r5.collapsingTextHelper
            r6.recalculate(r10)
        L50:
            return
    }

    private void updateTitleFromToolbarIfNeeded() {
            r1 = this;
            android.view.ViewGroup r0 = r1.toolbar
            if (r0 == 0) goto L1d
            boolean r0 = r1.collapsingTitleEnabled
            if (r0 == 0) goto L1d
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1d
            android.view.ViewGroup r0 = r1.toolbar
            java.lang.CharSequence r0 = getToolbarTitle(r0)
            r1.setTitle(r0)
        L1d:
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams
            return r1
    }

    @Override // android.view.View
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r7) {
            r6 = this;
            super.draw(r7)
            r6.ensureToolbar()
            android.view.ViewGroup r0 = r6.toolbar
            if (r0 != 0) goto L20
            android.graphics.drawable.Drawable r0 = r6.contentScrim
            if (r0 == 0) goto L20
            int r1 = r6.scrimAlpha
            if (r1 <= 0) goto L20
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r1 = r6.scrimAlpha
            r0.setAlpha(r1)
            android.graphics.drawable.Drawable r0 = r6.contentScrim
            r0.draw(r7)
        L20:
            boolean r0 = r6.collapsingTitleEnabled
            if (r0 == 0) goto L67
            boolean r0 = r6.drawCollapsingTitle
            if (r0 == 0) goto L67
            android.view.ViewGroup r0 = r6.toolbar
            if (r0 == 0) goto L62
            android.graphics.drawable.Drawable r0 = r6.contentScrim
            if (r0 == 0) goto L62
            int r0 = r6.scrimAlpha
            if (r0 <= 0) goto L62
            boolean r0 = r6.isTitleCollapseFadeMode()
            if (r0 == 0) goto L62
            com.google.android.material.internal.CollapsingTextHelper r0 = r6.collapsingTextHelper
            float r0 = r0.getExpansionFraction()
            com.google.android.material.internal.CollapsingTextHelper r1 = r6.collapsingTextHelper
            float r1 = r1.getFadeModeThresholdFraction()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L62
            int r0 = r7.save()
            android.graphics.drawable.Drawable r1 = r6.contentScrim
            android.graphics.Rect r1 = r1.getBounds()
            android.graphics.Region$Op r2 = android.graphics.Region.Op.DIFFERENCE
            r7.clipRect(r1, r2)
            com.google.android.material.internal.CollapsingTextHelper r1 = r6.collapsingTextHelper
            r1.draw(r7)
            r7.restoreToCount(r0)
            goto L67
        L62:
            com.google.android.material.internal.CollapsingTextHelper r0 = r6.collapsingTextHelper
            r0.draw(r7)
        L67:
            android.graphics.drawable.Drawable r0 = r6.statusBarScrim
            if (r0 == 0) goto L9b
            int r0 = r6.scrimAlpha
            if (r0 <= 0) goto L9b
            androidx.core.view.WindowInsetsCompat r0 = r6.lastInsets
            r1 = 0
            if (r0 == 0) goto L79
            int r0 = r0.getSystemWindowInsetTop()
            goto L7a
        L79:
            r0 = 0
        L7a:
            if (r0 <= 0) goto L9b
            android.graphics.drawable.Drawable r2 = r6.statusBarScrim
            int r3 = r6.currentOffset
            int r3 = -r3
            int r4 = r6.getWidth()
            int r5 = r6.currentOffset
            int r0 = r0 - r5
            r2.setBounds(r1, r3, r4, r0)
            android.graphics.drawable.Drawable r0 = r6.statusBarScrim
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r1 = r6.scrimAlpha
            r0.setAlpha(r1)
            android.graphics.drawable.Drawable r0 = r6.statusBarScrim
            r0.draw(r7)
        L9b:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(android.graphics.Canvas r6, android.view.View r7, long r8) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.contentScrim
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2f
            int r0 = r5.scrimAlpha
            if (r0 <= 0) goto L2f
            boolean r0 = r5.isToolbarChild(r7)
            if (r0 == 0) goto L2f
            android.graphics.drawable.Drawable r0 = r5.contentScrim
            int r3 = r5.getWidth()
            int r4 = r5.getHeight()
            r5.updateContentScrimBounds(r0, r7, r3, r4)
            android.graphics.drawable.Drawable r0 = r5.contentScrim
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r5.scrimAlpha
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r5.contentScrim
            r0.draw(r6)
            r0 = 1
            goto L30
        L2f:
            r0 = 0
        L30:
            boolean r6 = super.drawChild(r6, r7, r8)
            if (r6 != 0) goto L3a
            if (r0 == 0) goto L39
            goto L3a
        L39:
            r1 = 0
        L3a:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r4 = this;
            super.drawableStateChanged()
            int[] r0 = r4.getDrawableState()
            android.graphics.drawable.Drawable r1 = r4.statusBarScrim
            r2 = 0
            if (r1 == 0) goto L17
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L17
            boolean r1 = r1.setState(r0)
            r2 = r2 | r1
        L17:
            android.graphics.drawable.Drawable r1 = r4.contentScrim
            if (r1 == 0) goto L26
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L26
            boolean r1 = r1.setState(r0)
            r2 = r2 | r1
        L26:
            com.google.android.material.internal.CollapsingTextHelper r1 = r4.collapsingTextHelper
            if (r1 == 0) goto L2f
            boolean r0 = r1.setState(r0)
            r2 = r2 | r0
        L2f:
            if (r2 == 0) goto L34
            r4.invalidate()
        L34:
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            com.google.android.material.appbar.CollapsingToolbarLayout$LayoutParams r0 = new com.google.android.material.appbar.CollapsingToolbarLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            com.google.android.material.appbar.CollapsingToolbarLayout$LayoutParams r0 = new com.google.android.material.appbar.CollapsingToolbarLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            android.widget.FrameLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            com.google.android.material.appbar.CollapsingToolbarLayout$LayoutParams r0 = new com.google.android.material.appbar.CollapsingToolbarLayout$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            com.google.android.material.appbar.CollapsingToolbarLayout$LayoutParams r0 = new com.google.android.material.appbar.CollapsingToolbarLayout$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    public int getCollapsedTitleGravity() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            int r0 = r0.getCollapsedTextGravity()
            return r0
    }

    public float getCollapsedTitleTextSize() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            float r0 = r0.getCollapsedTextSize()
            return r0
    }

    @androidx.annotation.NonNull
    public android.graphics.Typeface getCollapsedTitleTypeface() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            android.graphics.Typeface r0 = r0.getCollapsedTypeface()
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getContentScrim() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.contentScrim
            return r0
    }

    public int getExpandedTitleGravity() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            int r0 = r0.getExpandedTextGravity()
            return r0
    }

    public int getExpandedTitleMarginBottom() {
            r1 = this;
            int r0 = r1.expandedMarginBottom
            return r0
    }

    public int getExpandedTitleMarginEnd() {
            r1 = this;
            int r0 = r1.expandedMarginEnd
            return r0
    }

    public int getExpandedTitleMarginStart() {
            r1 = this;
            int r0 = r1.expandedMarginStart
            return r0
    }

    public int getExpandedTitleMarginTop() {
            r1 = this;
            int r0 = r1.expandedMarginTop
            return r0
    }

    public float getExpandedTitleTextSize() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            float r0 = r0.getExpandedTextSize()
            return r0
    }

    @androidx.annotation.NonNull
    public android.graphics.Typeface getExpandedTitleTypeface() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            android.graphics.Typeface r0 = r0.getExpandedTypeface()
            return r0
    }

    @androidx.annotation.RequiresApi(23)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            int r0 = r0.getHyphenationFrequency()
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public int getLineCount() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            int r0 = r0.getLineCount()
            return r0
    }

    @androidx.annotation.RequiresApi(23)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            float r0 = r0.getLineSpacingAdd()
            return r0
    }

    @androidx.annotation.RequiresApi(23)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            float r0 = r0.getLineSpacingMultiplier()
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            int r0 = r0.getMaxLines()
            return r0
    }

    public final int getMaxOffsetForPinChild(@androidx.annotation.NonNull android.view.View r4) {
            r3 = this;
            com.google.android.material.appbar.ViewOffsetHelper r0 = getViewOffsetHelper(r4)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            com.google.android.material.appbar.CollapsingToolbarLayout$LayoutParams r1 = (com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams) r1
            int r2 = r3.getHeight()
            int r0 = r0.getLayoutTop()
            int r2 = r2 - r0
            int r4 = r4.getHeight()
            int r2 = r2 - r4
            int r4 = r1.bottomMargin
            int r2 = r2 - r4
            return r2
    }

    public int getScrimAlpha() {
            r1 = this;
            int r0 = r1.scrimAlpha
            return r0
    }

    public long getScrimAnimationDuration() {
            r2 = this;
            long r0 = r2.scrimAnimationDuration
            return r0
    }

    public int getScrimVisibleHeightTrigger() {
            r2 = this;
            int r0 = r2.scrimVisibleHeightTrigger
            if (r0 < 0) goto Lb
            int r1 = r2.topInsetApplied
            int r0 = r0 + r1
            int r1 = r2.extraMultilineHeight
            int r0 = r0 + r1
            return r0
        Lb:
            androidx.core.view.WindowInsetsCompat r0 = r2.lastInsets
            if (r0 == 0) goto L14
            int r0 = r0.getSystemWindowInsetTop()
            goto L15
        L14:
            r0 = 0
        L15:
            int r1 = androidx.core.view.ViewCompat.getMinimumHeight(r2)
            if (r1 <= 0) goto L27
            int r1 = r1 * 2
            int r1 = r1 + r0
            int r0 = r2.getHeight()
            int r0 = java.lang.Math.min(r1, r0)
            return r0
        L27:
            int r0 = r2.getHeight()
            int r0 = r0 / 3
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getStatusBarScrim() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.statusBarScrim
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getTitle() {
            r1 = this;
            boolean r0 = r1.collapsingTitleEnabled
            if (r0 == 0) goto Lb
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            java.lang.CharSequence r0 = r0.getText()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public int getTitleCollapseMode() {
            r1 = this;
            int r0 = r1.titleCollapseMode
            return r0
    }

    @androidx.annotation.Nullable
    public android.animation.TimeInterpolator getTitlePositionInterpolator() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            android.animation.TimeInterpolator r0 = r0.getPositionInterpolator()
            return r0
    }

    @androidx.annotation.NonNull
    public android.text.TextUtils.TruncateAt getTitleTextEllipsize() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            android.text.TextUtils$TruncateAt r0 = r0.getTitleTextEllipsize()
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isExtraMultilineHeightEnabled() {
            r1 = this;
            boolean r0 = r1.extraMultilineHeightEnabled
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isForceApplySystemWindowInsetTop() {
            r1 = this;
            boolean r0 = r1.forceApplySystemWindowInsetTop
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRtlTextDirectionHeuristicsEnabled() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            boolean r0 = r0.isRtlTextDirectionHeuristicsEnabled()
            return r0
    }

    public boolean isTitleEnabled() {
            r1 = this;
            boolean r0 = r1.collapsingTitleEnabled
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof com.google.android.material.appbar.AppBarLayout
            if (r1 == 0) goto L2a
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r2.disableLiftOnScrollIfNeeded(r0)
            boolean r1 = androidx.core.view.ViewCompat.getFitsSystemWindows(r0)
            androidx.core.view.ViewCompat.setFitsSystemWindows(r2, r1)
            com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener r1 = r2.onOffsetChangedListener
            if (r1 != 0) goto L22
            com.google.android.material.appbar.CollapsingToolbarLayout$OffsetUpdateListener r1 = new com.google.android.material.appbar.CollapsingToolbarLayout$OffsetUpdateListener
            r1.<init>(r2)
            r2.onOffsetChangedListener = r1
        L22:
            com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener r1 = r2.onOffsetChangedListener
            r0.addOnOffsetChangedListener(r1)
            androidx.core.view.ViewCompat.requestApplyInsets(r2)
        L2a:
            return
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@androidx.annotation.NonNull android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.maybeUpdateFontWeightAdjustment(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r3 = this;
            android.view.ViewParent r0 = r3.getParent()
            com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener r1 = r3.onOffsetChangedListener
            if (r1 == 0) goto L11
            boolean r2 = r0 instanceof com.google.android.material.appbar.AppBarLayout
            if (r2 == 0) goto L11
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0.removeOnOffsetChangedListener(r1)
        L11:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
            r8 = this;
            super.onLayout(r9, r10, r11, r12, r13)
            androidx.core.view.WindowInsetsCompat r9 = r8.lastInsets
            r0 = 0
            if (r9 == 0) goto L29
            int r9 = r9.getSystemWindowInsetTop()
            int r1 = r8.getChildCount()
            r2 = 0
        L11:
            if (r2 >= r1) goto L29
            android.view.View r3 = r8.getChildAt(r2)
            boolean r4 = androidx.core.view.ViewCompat.getFitsSystemWindows(r3)
            if (r4 != 0) goto L26
            int r4 = r3.getTop()
            if (r4 >= r9) goto L26
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r9)
        L26:
            int r2 = r2 + 1
            goto L11
        L29:
            int r9 = r8.getChildCount()
            r1 = 0
        L2e:
            if (r1 >= r9) goto L3e
            android.view.View r2 = r8.getChildAt(r1)
            com.google.android.material.appbar.ViewOffsetHelper r2 = getViewOffsetHelper(r2)
            r2.onViewLayout()
            int r1 = r1 + 1
            goto L2e
        L3e:
            r7 = 0
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.updateTextBounds(r3, r4, r5, r6, r7)
            r8.updateTitleFromToolbarIfNeeded()
            r8.updateScrimVisibility()
            int r9 = r8.getChildCount()
        L51:
            if (r0 >= r9) goto L61
            android.view.View r10 = r8.getChildAt(r0)
            com.google.android.material.appbar.ViewOffsetHelper r10 = getViewOffsetHelper(r10)
            r10.applyOffsets()
            int r0 = r0 + 1
            goto L51
        L61:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r9, int r10) {
            r8 = this;
            r8.ensureToolbar()
            super.onMeasure(r9, r10)
            int r10 = android.view.View.MeasureSpec.getMode(r10)
            androidx.core.view.WindowInsetsCompat r0 = r8.lastInsets
            if (r0 == 0) goto L13
            int r0 = r0.getSystemWindowInsetTop()
            goto L14
        L13:
            r0 = 0
        L14:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == 0) goto L1c
            boolean r10 = r8.forceApplySystemWindowInsetTop
            if (r10 == 0) goto L2c
        L1c:
            if (r0 <= 0) goto L2c
            r8.topInsetApplied = r0
            int r10 = r8.getMeasuredHeight()
            int r10 = r10 + r0
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r1)
            super.onMeasure(r9, r10)
        L2c:
            boolean r10 = r8.extraMultilineHeightEnabled
            if (r10 == 0) goto L70
            com.google.android.material.internal.CollapsingTextHelper r10 = r8.collapsingTextHelper
            int r10 = r10.getMaxLines()
            r0 = 1
            if (r10 <= r0) goto L70
            r8.updateTitleFromToolbarIfNeeded()
            r3 = 0
            r4 = 0
            int r5 = r8.getMeasuredWidth()
            int r6 = r8.getMeasuredHeight()
            r7 = 1
            r2 = r8
            r2.updateTextBounds(r3, r4, r5, r6, r7)
            com.google.android.material.internal.CollapsingTextHelper r10 = r8.collapsingTextHelper
            int r10 = r10.getExpandedLineCount()
            if (r10 <= r0) goto L70
            com.google.android.material.internal.CollapsingTextHelper r2 = r8.collapsingTextHelper
            float r2 = r2.getExpandedTextFullHeight()
            int r2 = java.lang.Math.round(r2)
            int r10 = r10 - r0
            int r10 = r10 * r2
            r8.extraMultilineHeight = r10
            int r10 = r8.getMeasuredHeight()
            int r0 = r8.extraMultilineHeight
            int r10 = r10 + r0
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r1)
            super.onMeasure(r9, r10)
        L70:
            android.view.ViewGroup r9 = r8.toolbar
            if (r9 == 0) goto L8a
            android.view.View r10 = r8.toolbarDirectChild
            if (r10 == 0) goto L83
            if (r10 != r8) goto L7b
            goto L83
        L7b:
            int r9 = getHeightWithMargins(r10)
            r8.setMinimumHeight(r9)
            goto L8a
        L83:
            int r9 = getHeightWithMargins(r9)
            r8.setMinimumHeight(r9)
        L8a:
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            android.graphics.drawable.Drawable r3 = r0.contentScrim
            if (r3 == 0) goto La
            r0.updateContentScrimBounds(r3, r1, r2)
        La:
            return
    }

    public void setCollapsedTitleGravity(int r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setCollapsedTextGravity(r2)
            return
    }

    public void setCollapsedTitleTextAppearance(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setCollapsedTextAppearance(r2)
            return
    }

    public void setCollapsedTitleTextColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setCollapsedTitleTextColor(r1)
            return
    }

    public void setCollapsedTitleTextColor(@androidx.annotation.NonNull android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setCollapsedTextColor(r2)
            return
    }

    public void setCollapsedTitleTextSize(float r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setCollapsedTextSize(r2)
            return
    }

    public void setCollapsedTitleTypeface(@androidx.annotation.Nullable android.graphics.Typeface r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setCollapsedTypeface(r2)
            return
    }

    public void setContentScrim(@androidx.annotation.Nullable android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.contentScrim
            if (r0 == r3) goto L2e
            r1 = 0
            if (r0 == 0) goto La
            r0.setCallback(r1)
        La:
            if (r3 == 0) goto L10
            android.graphics.drawable.Drawable r1 = r3.mutate()
        L10:
            r2.contentScrim = r1
            if (r1 == 0) goto L2b
            int r3 = r2.getWidth()
            int r0 = r2.getHeight()
            r2.updateContentScrimBounds(r1, r3, r0)
            android.graphics.drawable.Drawable r3 = r2.contentScrim
            r3.setCallback(r2)
            android.graphics.drawable.Drawable r3 = r2.contentScrim
            int r0 = r2.scrimAlpha
            r3.setAlpha(r0)
        L2b:
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r2)
        L2e:
            return
    }

    public void setContentScrimColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setContentScrim(r0)
            return
    }

    public void setContentScrimResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            r1.setContentScrim(r2)
            return
    }

    public void setExpandedTitleColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setExpandedTitleTextColor(r1)
            return
    }

    public void setExpandedTitleGravity(int r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setExpandedTextGravity(r2)
            return
    }

    public void setExpandedTitleMargin(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.expandedMarginStart = r1
            r0.expandedMarginTop = r2
            r0.expandedMarginEnd = r3
            r0.expandedMarginBottom = r4
            r0.requestLayout()
            return
    }

    public void setExpandedTitleMarginBottom(int r1) {
            r0 = this;
            r0.expandedMarginBottom = r1
            r0.requestLayout()
            return
    }

    public void setExpandedTitleMarginEnd(int r1) {
            r0 = this;
            r0.expandedMarginEnd = r1
            r0.requestLayout()
            return
    }

    public void setExpandedTitleMarginStart(int r1) {
            r0 = this;
            r0.expandedMarginStart = r1
            r0.requestLayout()
            return
    }

    public void setExpandedTitleMarginTop(int r1) {
            r0 = this;
            r0.expandedMarginTop = r1
            r0.requestLayout()
            return
    }

    public void setExpandedTitleTextAppearance(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setExpandedTextAppearance(r2)
            return
    }

    public void setExpandedTitleTextColor(@androidx.annotation.NonNull android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setExpandedTextColor(r2)
            return
    }

    public void setExpandedTitleTextSize(float r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setExpandedTextSize(r2)
            return
    }

    public void setExpandedTitleTypeface(@androidx.annotation.Nullable android.graphics.Typeface r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setExpandedTypeface(r2)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean r1) {
            r0 = this;
            r0.extraMultilineHeightEnabled = r1
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean r1) {
            r0 = this;
            r0.forceApplySystemWindowInsetTop = r1
            return
    }

    @androidx.annotation.RequiresApi(23)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setHyphenationFrequency(int r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setHyphenationFrequency(r2)
            return
    }

    @androidx.annotation.RequiresApi(23)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingAdd(float r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setLineSpacingAdd(r2)
            return
    }

    @androidx.annotation.RequiresApi(23)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@androidx.annotation.FloatRange(from = 0.0d) float r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setLineSpacingMultiplier(r2)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setMaxLines(r2)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setRtlTextDirectionHeuristicsEnabled(r2)
            return
    }

    public void setScrimAlpha(int r2) {
            r1 = this;
            int r0 = r1.scrimAlpha
            if (r2 == r0) goto L14
            android.graphics.drawable.Drawable r0 = r1.contentScrim
            if (r0 == 0) goto Lf
            android.view.ViewGroup r0 = r1.toolbar
            if (r0 == 0) goto Lf
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r0)
        Lf:
            r1.scrimAlpha = r2
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r1)
        L14:
            return
    }

    public void setScrimAnimationDuration(@androidx.annotation.IntRange(from = 0) long r1) {
            r0 = this;
            r0.scrimAnimationDuration = r1
            return
    }

    public void setScrimVisibleHeightTrigger(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            int r0 = r1.scrimVisibleHeightTrigger
            if (r0 == r2) goto L9
            r1.scrimVisibleHeightTrigger = r2
            r1.updateScrimVisibility()
        L9:
            return
    }

    public void setScrimsShown(boolean r2) {
            r1 = this;
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r1)
            if (r0 == 0) goto Le
            boolean r0 = r1.isInEditMode()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            r1.setScrimsShown(r2, r0)
            return
    }

    public void setScrimsShown(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.scrimsAreShown
            if (r0 == r3) goto L1a
            r0 = 255(0xff, float:3.57E-43)
            r1 = 0
            if (r4 == 0) goto L11
            if (r3 == 0) goto Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            r2.animateScrim(r0)
            goto L18
        L11:
            if (r3 == 0) goto L14
            goto L15
        L14:
            r0 = 0
        L15:
            r2.setScrimAlpha(r0)
        L18:
            r2.scrimsAreShown = r3
        L1a:
            return
    }

    @androidx.annotation.RequiresApi(23)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setStaticLayoutBuilderConfigurer(@androidx.annotation.Nullable com.google.android.material.appbar.CollapsingToolbarLayout.StaticLayoutBuilderConfigurer r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setStaticLayoutBuilderConfigurer(r2)
            return
    }

    public void setStatusBarScrim(@androidx.annotation.Nullable android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.statusBarScrim
            if (r0 == r3) goto L4a
            r1 = 0
            if (r0 == 0) goto La
            r0.setCallback(r1)
        La:
            if (r3 == 0) goto L10
            android.graphics.drawable.Drawable r1 = r3.mutate()
        L10:
            r2.statusBarScrim = r1
            if (r1 == 0) goto L47
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L23
            android.graphics.drawable.Drawable r3 = r2.statusBarScrim
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L23:
            android.graphics.drawable.Drawable r3 = r2.statusBarScrim
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r3, r0)
            android.graphics.drawable.Drawable r3 = r2.statusBarScrim
            int r0 = r2.getVisibility()
            r1 = 0
            if (r0 != 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r3 = r2.statusBarScrim
            r3.setCallback(r2)
            android.graphics.drawable.Drawable r3 = r2.statusBarScrim
            int r0 = r2.scrimAlpha
            r3.setAlpha(r0)
        L47:
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r2)
        L4a:
            return
    }

    public void setStatusBarScrimColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setStatusBarScrim(r0)
            return
    }

    public void setStatusBarScrimResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            r1.setStatusBarScrim(r2)
            return
    }

    public void setTitle(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setText(r2)
            r1.updateContentDescriptionFromTitle()
            return
    }

    public void setTitleCollapseMode(int r3) {
            r2 = this;
            r2.titleCollapseMode = r3
            boolean r3 = r2.isTitleCollapseFadeMode()
            com.google.android.material.internal.CollapsingTextHelper r0 = r2.collapsingTextHelper
            r0.setFadeModeEnabled(r3)
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof com.google.android.material.appbar.AppBarLayout
            if (r1 == 0) goto L18
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r2.disableLiftOnScrollIfNeeded(r0)
        L18:
            if (r3 == 0) goto L31
            android.graphics.drawable.Drawable r3 = r2.contentScrim
            if (r3 != 0) goto L31
            android.content.res.Resources r3 = r2.getResources()
            int r0 = com.google.android.material.R.dimen.design_appbar_elevation
            float r3 = r3.getDimension(r0)
            com.google.android.material.elevation.ElevationOverlayProvider r0 = r2.elevationOverlayProvider
            int r3 = r0.compositeOverlayWithThemeSurfaceColorIfNeeded(r3)
            r2.setContentScrimColor(r3)
        L31:
            return
    }

    public void setTitleEllipsize(@androidx.annotation.NonNull android.text.TextUtils.TruncateAt r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setTitleTextEllipsize(r2)
            return
    }

    public void setTitleEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.collapsingTitleEnabled
            if (r2 == r0) goto Lf
            r1.collapsingTitleEnabled = r2
            r1.updateContentDescriptionFromTitle()
            r1.updateDummyView()
            r1.requestLayout()
        Lf:
            return
    }

    public void setTitlePositionInterpolator(@androidx.annotation.Nullable android.animation.TimeInterpolator r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setPositionInterpolator(r2)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            super.setVisibility(r3)
            r0 = 0
            if (r3 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            android.graphics.drawable.Drawable r1 = r2.statusBarScrim
            if (r1 == 0) goto L18
            boolean r1 = r1.isVisible()
            if (r1 == r3) goto L18
            android.graphics.drawable.Drawable r1 = r2.statusBarScrim
            r1.setVisible(r3, r0)
        L18:
            android.graphics.drawable.Drawable r1 = r2.contentScrim
            if (r1 == 0) goto L27
            boolean r1 = r1.isVisible()
            if (r1 == r3) goto L27
            android.graphics.drawable.Drawable r1 = r2.contentScrim
            r1.setVisible(r3, r0)
        L27:
            return
    }

    public final void updateScrimVisibility() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.contentScrim
            if (r0 != 0) goto L8
            android.graphics.drawable.Drawable r0 = r2.statusBarScrim
            if (r0 == 0) goto L1b
        L8:
            int r0 = r2.getHeight()
            int r1 = r2.currentOffset
            int r0 = r0 + r1
            int r1 = r2.getScrimVisibleHeightTrigger()
            if (r0 >= r1) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            r2.setScrimsShown(r0)
        L1b:
            return
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.contentScrim
            if (r2 == r0) goto L11
            android.graphics.drawable.Drawable r0 = r1.statusBarScrim
            if (r2 != r0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }
}
