package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes2.dex */
final class StyledPlayerControlViewLayoutManager {
    private static final long ANIMATION_INTERVAL_MS = 2000;
    private static final long DURATION_FOR_HIDING_ANIMATION_MS = 250;
    private static final long DURATION_FOR_SHOWING_ANIMATION_MS = 250;
    private static final int UX_STATE_ALL_VISIBLE = 0;
    private static final int UX_STATE_ANIMATING_HIDE = 3;
    private static final int UX_STATE_ANIMATING_SHOW = 4;
    private static final int UX_STATE_NONE_VISIBLE = 2;
    private static final int UX_STATE_ONLY_PROGRESS_VISIBLE = 1;
    private boolean animationEnabled;

    @androidx.annotation.Nullable
    private final android.view.ViewGroup basicControls;

    @androidx.annotation.Nullable
    private final android.view.ViewGroup bottomBar;

    @androidx.annotation.Nullable
    private final android.view.ViewGroup centerControls;

    @androidx.annotation.Nullable
    private final android.view.View controlsBackground;

    @androidx.annotation.Nullable
    private final android.view.ViewGroup extraControls;

    @androidx.annotation.Nullable
    private final android.view.ViewGroup extraControlsScrollView;
    private final android.animation.AnimatorSet hideAllBarsAnimator;
    private final java.lang.Runnable hideAllBarsRunnable;
    private final java.lang.Runnable hideControllerRunnable;
    private final android.animation.AnimatorSet hideMainBarAnimator;
    private final java.lang.Runnable hideMainBarRunnable;
    private final android.animation.AnimatorSet hideProgressBarAnimator;
    private final java.lang.Runnable hideProgressBarRunnable;
    private boolean isMinimalMode;

    @androidx.annotation.Nullable
    private final android.view.ViewGroup minimalControls;
    private boolean needToShowBars;
    private final android.view.View.OnLayoutChangeListener onLayoutChangeListener;
    private final android.animation.ValueAnimator overflowHideAnimator;
    private final android.animation.ValueAnimator overflowShowAnimator;

    @androidx.annotation.Nullable
    private final android.view.View overflowShowButton;
    private final com.google.android.exoplayer2.ui.StyledPlayerControlView playerControlView;
    private final android.animation.AnimatorSet showAllBarsAnimator;
    private final java.lang.Runnable showAllBarsRunnable;
    private final android.animation.AnimatorSet showMainBarAnimator;
    private final java.util.List<android.view.View> shownButtons;

    @androidx.annotation.Nullable
    private final android.view.View timeBar;

    @androidx.annotation.Nullable
    private final android.view.ViewGroup timeView;
    private int uxState;










    public static /* synthetic */ void $r8$lambda$0VsVklQz4qFTXkhePiUPYh2Z8k4(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0) {
            r0.updateLayoutForSizeChange()
            return
    }

    public static /* synthetic */ void $r8$lambda$CnpNsEg4DfUNVCHU5L7Emt1LsvY(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0) {
            r0.onLayoutWidthChanged()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$M0SOemxfC91i1PxYVH9CZAMN-T0, reason: not valid java name */
    public static /* synthetic */ void m267$r8$lambda$M0SOemxfC91i1PxYVH9CZAMNT0(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0, android.animation.ValueAnimator r1) {
            r0.lambda$new$1(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Uyxy2Z5tryCJnBj0GA3SSrWvvRI(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0) {
            r0.hideAllBars()
            return
    }

    public static /* synthetic */ void $r8$lambda$VKNe7w6AWMvw7j806Pu7FvZ8CcU(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0) {
            r0.hideController()
            return
    }

    public static /* synthetic */ void $r8$lambda$Vs5assiPBGhh1Xvnalr4DNIJOIQ(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0, android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.onLayoutChange(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static /* synthetic */ void $r8$lambda$Z0c6J0eVTE_HygSVCukZ8eh1z4Y(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0, android.animation.ValueAnimator r1) {
            r0.lambda$new$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$akKKMYLY_2Y8Uy3G__gXPajPJw4(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0) {
            r0.hideProgressBar()
            return
    }

    public static /* synthetic */ void $r8$lambda$bLNGlFgEeAM8s00dnj4oM6Y1JCg(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0, android.animation.ValueAnimator r1) {
            r0.lambda$new$2(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$cowlG_ChsG0MJipiWwZoUTotDpE(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0, android.view.View r1) {
            r0.onOverflowButtonClick(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$mZy_nJWmidRaMg4VLdhkc5z6g28(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0) {
            r0.hideMainBar()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$vJBNlG93jz_b-Seh008BUkzw9D4, reason: not valid java name */
    public static /* synthetic */ void m268$r8$lambda$vJBNlG93jz_bSeh008BUkzw9D4(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0) {
            r0.showAllBars()
            return
    }

    public static /* synthetic */ void $r8$lambda$w16R9T047Gf8_1zeIhVq75pS9uY(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0, android.animation.ValueAnimator r1) {
            r0.lambda$new$3(r1)
            return
    }

    public StyledPlayerControlViewLayoutManager(com.google.android.exoplayer2.ui.StyledPlayerControlView r14) {
            r13 = this;
            r13.<init>()
            r13.playerControlView = r14
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda1 r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda1
            r1 = 2
            r0.<init>(r13, r1)
            r13.showAllBarsRunnable = r0
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda1 r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda1
            r2 = 3
            r0.<init>(r13, r2)
            r13.hideAllBarsRunnable = r0
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda1 r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda1
            r3 = 4
            r0.<init>(r13, r3)
            r13.hideProgressBarRunnable = r0
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda1 r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda1
            r4 = 5
            r0.<init>(r13, r4)
            r13.hideMainBarRunnable = r0
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda1 r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda1
            r4 = 6
            r0.<init>(r13, r4)
            r13.hideControllerRunnable = r0
            com.google.android.exoplayer2.ui.StyledPlayerControlView$$ExternalSyntheticLambda1 r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$$ExternalSyntheticLambda1
            r4 = 1
            r0.<init>(r13, r4)
            r13.onLayoutChangeListener = r0
            r13.animationEnabled = r4
            r0 = 0
            r13.uxState = r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r13.shownButtons = r5
            int r5 = com.google.android.exoplayer2.ui.R.id.exo_controls_background
            android.view.View r5 = r14.findViewById(r5)
            r13.controlsBackground = r5
            int r5 = com.google.android.exoplayer2.ui.R.id.exo_center_controls
            android.view.View r5 = r14.findViewById(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r13.centerControls = r5
            int r5 = com.google.android.exoplayer2.ui.R.id.exo_minimal_controls
            android.view.View r5 = r14.findViewById(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r13.minimalControls = r5
            int r5 = com.google.android.exoplayer2.ui.R.id.exo_bottom_bar
            android.view.View r5 = r14.findViewById(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r13.bottomBar = r5
            int r6 = com.google.android.exoplayer2.ui.R.id.exo_time
            android.view.View r6 = r14.findViewById(r6)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r13.timeView = r6
            int r6 = com.google.android.exoplayer2.ui.R.id.exo_progress
            android.view.View r6 = r14.findViewById(r6)
            r13.timeBar = r6
            int r7 = com.google.android.exoplayer2.ui.R.id.exo_basic_controls
            android.view.View r7 = r14.findViewById(r7)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r13.basicControls = r7
            int r7 = com.google.android.exoplayer2.ui.R.id.exo_extra_controls
            android.view.View r7 = r14.findViewById(r7)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r13.extraControls = r7
            int r7 = com.google.android.exoplayer2.ui.R.id.exo_extra_controls_scroll_view
            android.view.View r7 = r14.findViewById(r7)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r13.extraControlsScrollView = r7
            int r7 = com.google.android.exoplayer2.ui.R.id.exo_overflow_show
            android.view.View r7 = r14.findViewById(r7)
            r13.overflowShowButton = r7
            int r8 = com.google.android.exoplayer2.ui.R.id.exo_overflow_hide
            android.view.View r8 = r14.findViewById(r8)
            if (r7 == 0) goto Lb9
            if (r8 == 0) goto Lb9
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda0 r9 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda0
            r9.<init>(r13, r0)
            r7.setOnClickListener(r9)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda0
            r0.<init>(r13, r4)
            r8.setOnClickListener(r0)
        Lb9:
            float[] r0 = new float[r1]
            r0 = {x0206: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            android.view.animation.LinearInterpolator r7 = new android.view.animation.LinearInterpolator
            r7.<init>()
            r0.setInterpolator(r7)
            com.google.android.exoplayer2.ui.DefaultTimeBar$$ExternalSyntheticLambda0 r7 = new com.google.android.exoplayer2.ui.DefaultTimeBar$$ExternalSyntheticLambda0
            r7.<init>(r13, r2)
            r0.addUpdateListener(r7)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$1 r2 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$1
            r2.<init>(r13)
            r0.addListener(r2)
            float[] r2 = new float[r1]
            r2 = {x020e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            android.view.animation.LinearInterpolator r7 = new android.view.animation.LinearInterpolator
            r7.<init>()
            r2.setInterpolator(r7)
            com.google.android.exoplayer2.ui.DefaultTimeBar$$ExternalSyntheticLambda0 r7 = new com.google.android.exoplayer2.ui.DefaultTimeBar$$ExternalSyntheticLambda0
            r7.<init>(r13, r3)
            r2.addUpdateListener(r7)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$2 r3 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$2
            r3.<init>(r13)
            r2.addListener(r3)
            android.content.res.Resources r3 = r14.getResources()
            int r7 = com.google.android.exoplayer2.ui.R.dimen.exo_styled_bottom_bar_height
            float r8 = r3.getDimension(r7)
            int r9 = com.google.android.exoplayer2.ui.R.dimen.exo_styled_progress_bar_height
            float r9 = r3.getDimension(r9)
            float r8 = r8 - r9
            float r3 = r3.getDimension(r7)
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            r13.hideMainBarAnimator = r7
            r9 = 250(0xfa, double:1.235E-321)
            r7.setDuration(r9)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$3 r11 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$3
            r11.<init>(r13, r14)
            r7.addListener(r11)
            android.animation.AnimatorSet$Builder r7 = r7.play(r0)
            r11 = 0
            android.animation.ObjectAnimator r12 = ofTranslationY(r11, r8, r6)
            android.animation.AnimatorSet$Builder r7 = r7.with(r12)
            android.animation.ObjectAnimator r12 = ofTranslationY(r11, r8, r5)
            r7.with(r12)
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            r13.hideProgressBarAnimator = r7
            r7.setDuration(r9)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$4 r12 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$4
            r12.<init>(r13, r14)
            r7.addListener(r12)
            android.animation.ObjectAnimator r12 = ofTranslationY(r8, r3, r6)
            android.animation.AnimatorSet$Builder r7 = r7.play(r12)
            android.animation.ObjectAnimator r12 = ofTranslationY(r8, r3, r5)
            r7.with(r12)
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            r13.hideAllBarsAnimator = r7
            r7.setDuration(r9)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$5 r12 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$5
            r12.<init>(r13, r14)
            r7.addListener(r12)
            android.animation.AnimatorSet$Builder r14 = r7.play(r0)
            android.animation.ObjectAnimator r0 = ofTranslationY(r11, r3, r6)
            android.animation.AnimatorSet$Builder r14 = r14.with(r0)
            android.animation.ObjectAnimator r0 = ofTranslationY(r11, r3, r5)
            r14.with(r0)
            android.animation.AnimatorSet r14 = new android.animation.AnimatorSet
            r14.<init>()
            r13.showMainBarAnimator = r14
            r14.setDuration(r9)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$6 r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$6
            r0.<init>(r13)
            r14.addListener(r0)
            android.animation.AnimatorSet$Builder r14 = r14.play(r2)
            android.animation.ObjectAnimator r0 = ofTranslationY(r8, r11, r6)
            android.animation.AnimatorSet$Builder r14 = r14.with(r0)
            android.animation.ObjectAnimator r0 = ofTranslationY(r8, r11, r5)
            r14.with(r0)
            android.animation.AnimatorSet r14 = new android.animation.AnimatorSet
            r14.<init>()
            r13.showAllBarsAnimator = r14
            r14.setDuration(r9)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$7 r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$7
            r0.<init>(r13)
            r14.addListener(r0)
            android.animation.AnimatorSet$Builder r14 = r14.play(r2)
            android.animation.ObjectAnimator r0 = ofTranslationY(r3, r11, r6)
            android.animation.AnimatorSet$Builder r14 = r14.with(r0)
            android.animation.ObjectAnimator r0 = ofTranslationY(r3, r11, r5)
            r14.with(r0)
            float[] r14 = new float[r1]
            r14 = {x0216: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r14 = android.animation.ValueAnimator.ofFloat(r14)
            r13.overflowShowAnimator = r14
            r14.setDuration(r9)
            com.google.android.exoplayer2.ui.DefaultTimeBar$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.ui.DefaultTimeBar$$ExternalSyntheticLambda0
            r0.<init>(r13, r4)
            r14.addUpdateListener(r0)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$8 r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$8
            r0.<init>(r13)
            r14.addListener(r0)
            float[] r14 = new float[r1]
            r14 = {x021e: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r14 = android.animation.ValueAnimator.ofFloat(r14)
            r13.overflowHideAnimator = r14
            r14.setDuration(r9)
            com.google.android.exoplayer2.ui.DefaultTimeBar$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.ui.DefaultTimeBar$$ExternalSyntheticLambda0
            r0.<init>(r13, r1)
            r14.addUpdateListener(r0)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$9 r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$9
            r0.<init>(r13)
            r14.addListener(r0)
            return
    }

    public static /* synthetic */ android.view.View access$000(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0) {
            android.view.View r0 = r0.timeBar
            return r0
    }

    public static /* synthetic */ boolean access$100(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0) {
            boolean r0 = r0.isMinimalMode
            return r0
    }

    public static /* synthetic */ android.view.View access$200(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0) {
            android.view.View r0 = r0.controlsBackground
            return r0
    }

    public static /* synthetic */ android.view.ViewGroup access$300(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0) {
            android.view.ViewGroup r0 = r0.centerControls
            return r0
    }

    public static /* synthetic */ android.view.ViewGroup access$400(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0) {
            android.view.ViewGroup r0 = r0.minimalControls
            return r0
    }

    public static /* synthetic */ void access$500(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0, int r1) {
            r0.setUxState(r1)
            return
    }

    public static /* synthetic */ boolean access$600(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0) {
            boolean r0 = r0.needToShowBars
            return r0
    }

    public static /* synthetic */ void access$602(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r1) {
            r0 = 0
            r1.needToShowBars = r0
            return
    }

    public static /* synthetic */ java.lang.Runnable access$700(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0) {
            java.lang.Runnable r0 = r0.showAllBarsRunnable
            return r0
    }

    public static /* synthetic */ android.view.ViewGroup access$800(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0) {
            android.view.ViewGroup r0 = r0.extraControlsScrollView
            return r0
    }

    public static /* synthetic */ android.view.ViewGroup access$900(com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0) {
            android.view.ViewGroup r0 = r0.basicControls
            return r0
    }

    private void animateOverflow(float r4) {
            r3 = this;
            android.view.ViewGroup r0 = r3.extraControlsScrollView
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L16
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r2 = r1 - r4
            float r2 = r2 * r0
            int r0 = (int) r2
            android.view.ViewGroup r2 = r3.extraControlsScrollView
            float r0 = (float) r0
            r2.setTranslationX(r0)
        L16:
            android.view.ViewGroup r0 = r3.timeView
            if (r0 == 0) goto L1f
            float r2 = r1 - r4
            r0.setAlpha(r2)
        L1f:
            android.view.ViewGroup r0 = r3.basicControls
            if (r0 == 0) goto L27
            float r1 = r1 - r4
            r0.setAlpha(r1)
        L27:
            return
    }

    private static int getHeightWithMargins(@androidx.annotation.Nullable android.view.View r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.getHeight()
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            boolean r1 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L18
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r1 = r2.topMargin
            int r2 = r2.bottomMargin
            int r1 = r1 + r2
            int r0 = r0 + r1
        L18:
            return r0
    }

    private static int getWidthWithMargins(@androidx.annotation.Nullable android.view.View r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.getWidth()
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            boolean r1 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L18
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r1 = r2.leftMargin
            int r2 = r2.rightMargin
            int r1 = r1 + r2
            int r0 = r0 + r1
        L18:
            return r0
    }

    private void hideAllBars() {
            r1 = this;
            android.animation.AnimatorSet r0 = r1.hideAllBarsAnimator
            r0.start()
            return
    }

    private void hideController() {
            r1 = this;
            r0 = 2
            r1.setUxState(r0)
            return
    }

    private void hideMainBar() {
            r3 = this;
            android.animation.AnimatorSet r0 = r3.hideMainBarAnimator
            r0.start()
            java.lang.Runnable r0 = r3.hideProgressBarRunnable
            r1 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayedRunnable(r0, r1)
            return
    }

    private void hideProgressBar() {
            r1 = this;
            android.animation.AnimatorSet r0 = r1.hideProgressBarAnimator
            r0.start()
            return
    }

    private /* synthetic */ void lambda$new$0(android.animation.ValueAnimator r2) {
            r1 = this;
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            android.view.View r0 = r1.controlsBackground
            if (r0 == 0) goto L11
            r0.setAlpha(r2)
        L11:
            android.view.ViewGroup r0 = r1.centerControls
            if (r0 == 0) goto L18
            r0.setAlpha(r2)
        L18:
            android.view.ViewGroup r0 = r1.minimalControls
            if (r0 == 0) goto L1f
            r0.setAlpha(r2)
        L1f:
            return
    }

    private /* synthetic */ void lambda$new$1(android.animation.ValueAnimator r2) {
            r1 = this;
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            android.view.View r0 = r1.controlsBackground
            if (r0 == 0) goto L11
            r0.setAlpha(r2)
        L11:
            android.view.ViewGroup r0 = r1.centerControls
            if (r0 == 0) goto L18
            r0.setAlpha(r2)
        L18:
            android.view.ViewGroup r0 = r1.minimalControls
            if (r0 == 0) goto L1f
            r0.setAlpha(r2)
        L1f:
            return
    }

    private /* synthetic */ void lambda$new$2(android.animation.ValueAnimator r1) {
            r0 = this;
            java.lang.Object r1 = r1.getAnimatedValue()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r0.animateOverflow(r1)
            return
    }

    private /* synthetic */ void lambda$new$3(android.animation.ValueAnimator r1) {
            r0 = this;
            java.lang.Object r1 = r1.getAnimatedValue()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r0.animateOverflow(r1)
            return
    }

    private static android.animation.ObjectAnimator ofTranslationY(float r2, float r3, android.view.View r4) {
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            java.lang.String r2 = "translationY"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r4, r2, r0)
            return r2
    }

    private void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0 = this;
            boolean r3 = r0.useMinimalMode()
            boolean r5 = r0.isMinimalMode
            r7 = 0
            if (r5 == r3) goto L13
            r0.isMinimalMode = r3
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda1 r3 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda1
            r3.<init>(r0, r7)
            r1.post(r3)
        L13:
            int r4 = r4 - r2
            int r8 = r8 - r6
            r2 = 1
            if (r4 == r8) goto L19
            r7 = 1
        L19:
            boolean r3 = r0.isMinimalMode
            if (r3 != 0) goto L27
            if (r7 == 0) goto L27
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda1 r3 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda1
            r3.<init>(r0, r2)
            r1.post(r3)
        L27:
            return
    }

    private void onLayoutWidthChanged() {
            r9 = this;
            android.view.ViewGroup r0 = r9.basicControls
            if (r0 == 0) goto Lda
            android.view.ViewGroup r0 = r9.extraControls
            if (r0 != 0) goto La
            goto Lda
        La:
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r9.playerControlView
            int r0 = r0.getWidth()
            com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r9.playerControlView
            int r1 = r1.getPaddingLeft()
            int r0 = r0 - r1
            com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r9.playerControlView
            int r1 = r1.getPaddingRight()
            int r0 = r0 - r1
        L1e:
            android.view.ViewGroup r1 = r9.extraControls
            int r1 = r1.getChildCount()
            r2 = 0
            r3 = 1
            if (r1 <= r3) goto L41
            android.view.ViewGroup r1 = r9.extraControls
            int r1 = r1.getChildCount()
            int r1 = r1 + (-2)
            android.view.ViewGroup r3 = r9.extraControls
            android.view.View r3 = r3.getChildAt(r1)
            android.view.ViewGroup r4 = r9.extraControls
            r4.removeViewAt(r1)
            android.view.ViewGroup r1 = r9.basicControls
            r1.addView(r3, r2)
            goto L1e
        L41:
            android.view.View r1 = r9.overflowShowButton
            if (r1 == 0) goto L4a
            r4 = 8
            r1.setVisibility(r4)
        L4a:
            android.view.ViewGroup r1 = r9.timeView
            int r1 = getWidthWithMargins(r1)
            android.view.ViewGroup r4 = r9.basicControls
            int r4 = r4.getChildCount()
            int r4 = r4 - r3
            r5 = 0
        L58:
            if (r5 >= r4) goto L68
            android.view.ViewGroup r6 = r9.basicControls
            android.view.View r6 = r6.getChildAt(r5)
            int r6 = getWidthWithMargins(r6)
            int r1 = r1 + r6
            int r5 = r5 + 1
            goto L58
        L68:
            if (r1 <= r0) goto Lbe
            android.view.View r5 = r9.overflowShowButton
            if (r5 == 0) goto L78
            r5.setVisibility(r2)
            android.view.View r5 = r9.overflowShowButton
            int r5 = getWidthWithMargins(r5)
            int r1 = r1 + r5
        L78:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
        L7e:
            if (r6 >= r4) goto L94
            android.view.ViewGroup r7 = r9.basicControls
            android.view.View r7 = r7.getChildAt(r6)
            int r8 = getWidthWithMargins(r7)
            int r1 = r1 - r8
            r5.add(r7)
            if (r1 > r0) goto L91
            goto L94
        L91:
            int r6 = r6 + 1
            goto L7e
        L94:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto Lda
            android.view.ViewGroup r0 = r9.basicControls
            int r1 = r5.size()
            r0.removeViews(r2, r1)
        La3:
            int r0 = r5.size()
            if (r2 >= r0) goto Lda
            android.view.ViewGroup r0 = r9.extraControls
            int r0 = r0.getChildCount()
            int r0 = r0 - r3
            android.view.ViewGroup r1 = r9.extraControls
            java.lang.Object r4 = r5.get(r2)
            android.view.View r4 = (android.view.View) r4
            r1.addView(r4, r0)
            int r2 = r2 + 1
            goto La3
        Lbe:
            android.view.ViewGroup r0 = r9.extraControlsScrollView
            if (r0 == 0) goto Lda
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lda
            android.animation.ValueAnimator r0 = r9.overflowHideAnimator
            boolean r0 = r0.isStarted()
            if (r0 != 0) goto Lda
            android.animation.ValueAnimator r0 = r9.overflowShowAnimator
            r0.cancel()
            android.animation.ValueAnimator r0 = r9.overflowHideAnimator
            r0.start()
        Lda:
            return
    }

    private void onOverflowButtonClick(android.view.View r3) {
            r2 = this;
            r2.resetHideCallbacks()
            int r0 = r3.getId()
            int r1 = com.google.android.exoplayer2.ui.R.id.exo_overflow_show
            if (r0 != r1) goto L11
            android.animation.ValueAnimator r3 = r2.overflowShowAnimator
            r3.start()
            goto L1e
        L11:
            int r3 = r3.getId()
            int r0 = com.google.android.exoplayer2.ui.R.id.exo_overflow_hide
            if (r3 != r0) goto L1e
            android.animation.ValueAnimator r3 = r2.overflowHideAnimator
            r3.start()
        L1e:
            return
    }

    private void postDelayedRunnable(java.lang.Runnable r4, long r5) {
            r3 = this;
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto Lb
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r3.playerControlView
            r0.postDelayed(r4, r5)
        Lb:
            return
    }

    private void setUxState(int r4) {
            r3 = this;
            int r0 = r3.uxState
            r3.uxState = r4
            r1 = 2
            if (r4 != r1) goto Lf
            com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r3.playerControlView
            r2 = 8
            r1.setVisibility(r2)
            goto L17
        Lf:
            if (r0 != r1) goto L17
            com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r3.playerControlView
            r2 = 0
            r1.setVisibility(r2)
        L17:
            if (r0 == r4) goto L1e
            com.google.android.exoplayer2.ui.StyledPlayerControlView r4 = r3.playerControlView
            r4.notifyOnVisibilityChange()
        L1e:
            return
    }

    private boolean shouldHideInMinimalMode(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            int r0 = com.google.android.exoplayer2.ui.R.id.exo_bottom_bar
            if (r2 == r0) goto L23
            int r0 = com.google.android.exoplayer2.ui.R.id.exo_prev
            if (r2 == r0) goto L23
            int r0 = com.google.android.exoplayer2.ui.R.id.exo_next
            if (r2 == r0) goto L23
            int r0 = com.google.android.exoplayer2.ui.R.id.exo_rew
            if (r2 == r0) goto L23
            int r0 = com.google.android.exoplayer2.ui.R.id.exo_rew_with_amount
            if (r2 == r0) goto L23
            int r0 = com.google.android.exoplayer2.ui.R.id.exo_ffwd
            if (r2 == r0) goto L23
            int r0 = com.google.android.exoplayer2.ui.R.id.exo_ffwd_with_amount
            if (r2 != r0) goto L21
            goto L23
        L21:
            r2 = 0
            goto L24
        L23:
            r2 = 1
        L24:
            return r2
    }

    private void showAllBars() {
            r3 = this;
            boolean r0 = r3.animationEnabled
            if (r0 != 0) goto Lc
            r0 = 0
            r3.setUxState(r0)
            r3.resetHideCallbacks()
            return
        Lc:
            int r0 = r3.uxState
            r1 = 1
            if (r0 == r1) goto L25
            r2 = 2
            if (r0 == r2) goto L1f
            r2 = 3
            if (r0 == r2) goto L1c
            r1 = 4
            if (r0 == r1) goto L1b
            goto L2a
        L1b:
            return
        L1c:
            r3.needToShowBars = r1
            goto L2a
        L1f:
            android.animation.AnimatorSet r0 = r3.showAllBarsAnimator
            r0.start()
            goto L2a
        L25:
            android.animation.AnimatorSet r0 = r3.showMainBarAnimator
            r0.start()
        L2a:
            r3.resetHideCallbacks()
            return
    }

    private void updateLayoutForSizeChange() {
            r5 = this;
            android.view.ViewGroup r0 = r5.minimalControls
            r1 = 4
            r2 = 0
            if (r0 == 0) goto L10
            boolean r3 = r5.isMinimalMode
            if (r3 == 0) goto Lc
            r3 = 0
            goto Ld
        Lc:
            r3 = 4
        Ld:
            r0.setVisibility(r3)
        L10:
            android.view.View r0 = r5.timeBar
            if (r0 == 0) goto L55
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r5.playerControlView
            android.content.res.Resources r0 = r0.getResources()
            int r3 = com.google.android.exoplayer2.ui.R.dimen.exo_styled_progress_margin_bottom
            int r0 = r0.getDimensionPixelSize(r3)
            android.view.View r3 = r5.timeBar
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            if (r3 == 0) goto L36
            boolean r4 = r5.isMinimalMode
            if (r4 == 0) goto L2f
            r0 = 0
        L2f:
            r3.bottomMargin = r0
            android.view.View r0 = r5.timeBar
            r0.setLayoutParams(r3)
        L36:
            android.view.View r0 = r5.timeBar
            boolean r3 = r0 instanceof com.google.android.exoplayer2.ui.DefaultTimeBar
            if (r3 == 0) goto L55
            com.google.android.exoplayer2.ui.DefaultTimeBar r0 = (com.google.android.exoplayer2.ui.DefaultTimeBar) r0
            boolean r3 = r5.isMinimalMode
            r4 = 1
            if (r3 == 0) goto L47
            r0.hideScrubber(r4)
            goto L55
        L47:
            int r3 = r5.uxState
            if (r3 != r4) goto L4f
            r0.hideScrubber(r2)
            goto L55
        L4f:
            r4 = 3
            if (r3 == r4) goto L55
            r0.showScrubber()
        L55:
            java.util.List<android.view.View> r0 = r5.shownButtons
            java.util.Iterator r0 = r0.iterator()
        L5b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L78
            java.lang.Object r3 = r0.next()
            android.view.View r3 = (android.view.View) r3
            boolean r4 = r5.isMinimalMode
            if (r4 == 0) goto L73
            boolean r4 = r5.shouldHideInMinimalMode(r3)
            if (r4 == 0) goto L73
            r4 = 4
            goto L74
        L73:
            r4 = 0
        L74:
            r3.setVisibility(r4)
            goto L5b
        L78:
            return
    }

    private boolean useMinimalMode() {
            r7 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r7.playerControlView
            int r0 = r0.getWidth()
            com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r7.playerControlView
            int r1 = r1.getPaddingLeft()
            int r0 = r0 - r1
            com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r7.playerControlView
            int r1 = r1.getPaddingRight()
            int r0 = r0 - r1
            com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r7.playerControlView
            int r1 = r1.getHeight()
            com.google.android.exoplayer2.ui.StyledPlayerControlView r2 = r7.playerControlView
            int r2 = r2.getPaddingBottom()
            int r1 = r1 - r2
            com.google.android.exoplayer2.ui.StyledPlayerControlView r2 = r7.playerControlView
            int r2 = r2.getPaddingTop()
            int r1 = r1 - r2
            android.view.ViewGroup r2 = r7.centerControls
            int r2 = getWidthWithMargins(r2)
            android.view.ViewGroup r3 = r7.centerControls
            r4 = 0
            if (r3 == 0) goto L3f
            int r3 = r3.getPaddingLeft()
            android.view.ViewGroup r5 = r7.centerControls
            int r5 = r5.getPaddingRight()
            int r5 = r5 + r3
            goto L40
        L3f:
            r5 = 0
        L40:
            int r2 = r2 - r5
            android.view.ViewGroup r3 = r7.centerControls
            int r3 = getHeightWithMargins(r3)
            android.view.ViewGroup r5 = r7.centerControls
            if (r5 == 0) goto L57
            int r5 = r5.getPaddingTop()
            android.view.ViewGroup r6 = r7.centerControls
            int r6 = r6.getPaddingBottom()
            int r6 = r6 + r5
            goto L58
        L57:
            r6 = 0
        L58:
            int r3 = r3 - r6
            android.view.ViewGroup r5 = r7.timeView
            int r5 = getWidthWithMargins(r5)
            android.view.View r6 = r7.overflowShowButton
            int r6 = getWidthWithMargins(r6)
            int r5 = r5 + r6
            int r2 = java.lang.Math.max(r2, r5)
            android.view.ViewGroup r5 = r7.bottomBar
            int r5 = getHeightWithMargins(r5)
            int r5 = r5 * 2
            int r5 = r5 + r3
            if (r0 <= r2) goto L77
            if (r1 > r5) goto L78
        L77:
            r4 = 1
        L78:
            return r4
    }

    public boolean getShowButton(@androidx.annotation.Nullable android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            java.util.List<android.view.View> r0 = r1.shownButtons
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public void hide() {
            r2 = this;
            int r0 = r2.uxState
            r1 = 3
            if (r0 == r1) goto L20
            r1 = 2
            if (r0 != r1) goto L9
            goto L20
        L9:
            r2.removeHideCallbacks()
            boolean r0 = r2.animationEnabled
            if (r0 != 0) goto L14
            r2.hideController()
            goto L20
        L14:
            int r0 = r2.uxState
            r1 = 1
            if (r0 != r1) goto L1d
            r2.hideProgressBar()
            goto L20
        L1d:
            r2.hideAllBars()
        L20:
            return
    }

    public void hideImmediately() {
            r2 = this;
            int r0 = r2.uxState
            r1 = 3
            if (r0 == r1) goto Lf
            r1 = 2
            if (r0 != r1) goto L9
            goto Lf
        L9:
            r2.removeHideCallbacks()
            r2.hideController()
        Lf:
            return
    }

    public boolean isAnimationEnabled() {
            r1 = this;
            boolean r0 = r1.animationEnabled
            return r0
    }

    public boolean isFullyVisible() {
            r1 = this;
            int r0 = r1.uxState
            if (r0 != 0) goto Le
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r1.playerControlView
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public void onAttachedToWindow() {
            r2 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.playerControlView
            android.view.View$OnLayoutChangeListener r1 = r2.onLayoutChangeListener
            r0.addOnLayoutChangeListener(r1)
            return
    }

    public void onDetachedFromWindow() {
            r2 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.playerControlView
            android.view.View$OnLayoutChangeListener r1 = r2.onLayoutChangeListener
            r0.removeOnLayoutChangeListener(r1)
            return
    }

    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            android.view.View r1 = r0.controlsBackground
            if (r1 == 0) goto La
            int r4 = r4 - r2
            int r5 = r5 - r3
            r2 = 0
            r1.layout(r2, r2, r4, r5)
        La:
            return
    }

    public void removeHideCallbacks() {
            r2 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.playerControlView
            java.lang.Runnable r1 = r2.hideControllerRunnable
            r0.removeCallbacks(r1)
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.playerControlView
            java.lang.Runnable r1 = r2.hideAllBarsRunnable
            r0.removeCallbacks(r1)
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.playerControlView
            java.lang.Runnable r1 = r2.hideMainBarRunnable
            r0.removeCallbacks(r1)
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.playerControlView
            java.lang.Runnable r1 = r2.hideProgressBarRunnable
            r0.removeCallbacks(r1)
            return
    }

    public void resetHideCallbacks() {
            r4 = this;
            int r0 = r4.uxState
            r1 = 3
            if (r0 != r1) goto L6
            return
        L6:
            r4.removeHideCallbacks()
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r4.playerControlView
            int r0 = r0.getShowTimeoutMs()
            if (r0 <= 0) goto L2f
            boolean r1 = r4.animationEnabled
            if (r1 != 0) goto L1c
            java.lang.Runnable r1 = r4.hideControllerRunnable
            long r2 = (long) r0
            r4.postDelayedRunnable(r1, r2)
            goto L2f
        L1c:
            int r1 = r4.uxState
            r2 = 1
            if (r1 != r2) goto L29
            java.lang.Runnable r0 = r4.hideProgressBarRunnable
            r1 = 2000(0x7d0, double:9.88E-321)
            r4.postDelayedRunnable(r0, r1)
            goto L2f
        L29:
            java.lang.Runnable r1 = r4.hideMainBarRunnable
            long r2 = (long) r0
            r4.postDelayedRunnable(r1, r2)
        L2f:
            return
    }

    public void setAnimationEnabled(boolean r1) {
            r0 = this;
            r0.animationEnabled = r1
            return
    }

    public void setShowButton(@androidx.annotation.Nullable android.view.View r1, boolean r2) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            if (r2 != 0) goto L10
            r2 = 8
            r1.setVisibility(r2)
            java.util.List<android.view.View> r2 = r0.shownButtons
            r2.remove(r1)
            return
        L10:
            boolean r2 = r0.isMinimalMode
            if (r2 == 0) goto L1f
            boolean r2 = r0.shouldHideInMinimalMode(r1)
            if (r2 == 0) goto L1f
            r2 = 4
            r1.setVisibility(r2)
            goto L23
        L1f:
            r2 = 0
            r1.setVisibility(r2)
        L23:
            java.util.List<android.view.View> r2 = r0.shownButtons
            r2.add(r1)
            return
    }

    public void show() {
            r2 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.playerControlView
            boolean r0 = r0.isVisible()
            if (r0 != 0) goto L18
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.playerControlView
            r1 = 0
            r0.setVisibility(r1)
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.playerControlView
            r0.updateAll()
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.playerControlView
            r0.requestPlayPauseFocus()
        L18:
            r2.showAllBars()
            return
    }
}
