package com.google.android.material.search;

/* JADX INFO: loaded from: classes2.dex */
class SearchViewAnimationHelper {
    private static final float CONTENT_FROM_SCALE = 0.95f;
    private static final long HIDE_CLEAR_BUTTON_ALPHA_DURATION_MS = 42;
    private static final long HIDE_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 0;
    private static final long HIDE_CONTENT_ALPHA_DURATION_MS = 83;
    private static final long HIDE_CONTENT_ALPHA_START_DELAY_MS = 0;
    private static final long HIDE_CONTENT_SCALE_DURATION_MS = 250;
    private static final long HIDE_DURATION_MS = 250;
    private static final long HIDE_TRANSLATE_DURATION_MS = 300;
    private static final long SHOW_CLEAR_BUTTON_ALPHA_DURATION_MS = 50;
    private static final long SHOW_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 250;
    private static final long SHOW_CONTENT_ALPHA_DURATION_MS = 150;
    private static final long SHOW_CONTENT_ALPHA_START_DELAY_MS = 75;
    private static final long SHOW_CONTENT_SCALE_DURATION_MS = 300;
    private static final long SHOW_DURATION_MS = 300;
    private static final long SHOW_TRANSLATE_DURATION_MS = 350;
    private static final long SHOW_TRANSLATE_KEYBOARD_START_DELAY_MS = 150;
    private final android.widget.ImageButton clearButton;
    private final com.google.android.material.internal.TouchObserverFrameLayout contentContainer;
    private final android.view.View divider;
    private final androidx.appcompat.widget.Toolbar dummyToolbar;
    private final android.widget.EditText editText;
    private final android.widget.FrameLayout headerContainer;
    private final com.google.android.material.internal.ClippableRoundedCornerLayout rootView;
    private final android.view.View scrim;
    private com.google.android.material.search.SearchBar searchBar;
    private final android.widget.TextView searchPrefix;
    private final com.google.android.material.search.SearchView searchView;
    private final androidx.appcompat.widget.Toolbar toolbar;
    private final android.widget.FrameLayout toolbarContainer;






    /* JADX INFO: renamed from: $r8$lambda$Z1-IpSvBz1A0UFDUBqPbMGBVQYc, reason: not valid java name */
    public static /* synthetic */ void m288$r8$lambda$Z1IpSvBz1A0UFDUBqPbMGBVQYc(androidx.appcompat.graphics.drawable.DrawerArrowDrawable r0, android.animation.ValueAnimator r1) {
            lambda$addDrawerArrowDrawableAnimatorIfNeeded$3(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$av9zrSrr2s25eROn1dI8YE7LRaw(com.google.android.material.search.SearchViewAnimationHelper r0, float r1, android.graphics.Rect r2, android.animation.ValueAnimator r3) {
            r0.lambda$getRootViewAnimator$2(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$dUmgJgHGRv_1TrnG_rLo7h18BfI(com.google.android.material.search.SearchViewAnimationHelper r0) {
            r0.lambda$startShowAnimationExpand$0()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$vIDpQzdq85GEYIUPmWfoi-QqvEQ, reason: not valid java name */
    public static /* synthetic */ void m289$r8$lambda$vIDpQzdq85GEYIUPmWfoiQqvEQ(com.google.android.material.internal.FadeThroughDrawable r0, android.animation.ValueAnimator r1) {
            lambda$addFadeThroughDrawableAnimatorIfNeeded$4(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$wybCWNxxo7ogggXT535_C5NdcUQ(com.google.android.material.search.SearchViewAnimationHelper r0) {
            r0.lambda$startShowAnimationTranslate$1()
            return
    }

    public SearchViewAnimationHelper(com.google.android.material.search.SearchView r2) {
            r1 = this;
            r1.<init>()
            r1.searchView = r2
            android.view.View r0 = r2.scrim
            r1.scrim = r0
            com.google.android.material.internal.ClippableRoundedCornerLayout r0 = r2.rootView
            r1.rootView = r0
            android.widget.FrameLayout r0 = r2.headerContainer
            r1.headerContainer = r0
            android.widget.FrameLayout r0 = r2.toolbarContainer
            r1.toolbarContainer = r0
            com.google.android.material.appbar.MaterialToolbar r0 = r2.toolbar
            r1.toolbar = r0
            androidx.appcompat.widget.Toolbar r0 = r2.dummyToolbar
            r1.dummyToolbar = r0
            android.widget.TextView r0 = r2.searchPrefix
            r1.searchPrefix = r0
            android.widget.EditText r0 = r2.editText
            r1.editText = r0
            android.widget.ImageButton r0 = r2.clearButton
            r1.clearButton = r0
            android.view.View r0 = r2.divider
            r1.divider = r0
            com.google.android.material.internal.TouchObserverFrameLayout r2 = r2.contentContainer
            r1.contentContainer = r2
            return
    }

    public static /* synthetic */ com.google.android.material.search.SearchView access$000(com.google.android.material.search.SearchViewAnimationHelper r0) {
            com.google.android.material.search.SearchView r0 = r0.searchView
            return r0
    }

    public static /* synthetic */ com.google.android.material.internal.ClippableRoundedCornerLayout access$100(com.google.android.material.search.SearchViewAnimationHelper r0) {
            com.google.android.material.internal.ClippableRoundedCornerLayout r0 = r0.rootView
            return r0
    }

    public static /* synthetic */ void access$200(com.google.android.material.search.SearchViewAnimationHelper r0, float r1) {
            r0.setContentViewsAlpha(r1)
            return
    }

    public static /* synthetic */ com.google.android.material.search.SearchBar access$300(com.google.android.material.search.SearchViewAnimationHelper r0) {
            com.google.android.material.search.SearchBar r0 = r0.searchBar
            return r0
    }

    private void addActionMenuViewAnimatorIfNeeded(android.animation.AnimatorSet r9) {
            r8 = this;
            androidx.appcompat.widget.Toolbar r0 = r8.toolbar
            androidx.appcompat.widget.ActionMenuView r0 = com.google.android.material.internal.ToolbarUtils.getActionMenuView(r0)
            if (r0 != 0) goto L9
            return
        L9:
            r1 = 2
            float[] r2 = new float[r1]
            int r3 = r8.getFromTranslationXEnd(r0)
            float r3 = (float) r3
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r5 = 0
            r2[r3] = r5
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            android.view.View[] r6 = new android.view.View[r3]
            r6[r4] = r0
            com.google.android.material.internal.MultiViewUpdateListener r6 = com.google.android.material.internal.MultiViewUpdateListener.translationXListener(r6)
            r2.addUpdateListener(r6)
            float[] r6 = new float[r1]
            int r7 = r8.getFromTranslationY()
            float r7 = (float) r7
            r6[r4] = r7
            r6[r3] = r5
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r6)
            android.view.View[] r6 = new android.view.View[r3]
            r6[r4] = r0
            com.google.android.material.internal.MultiViewUpdateListener r0 = com.google.android.material.internal.MultiViewUpdateListener.translationYListener(r6)
            r5.addUpdateListener(r0)
            android.animation.Animator[] r0 = new android.animation.Animator[r1]
            r0[r4] = r2
            r0[r3] = r5
            r9.playTogether(r0)
            return
    }

    private void addBackButtonProgressAnimatorIfNeeded(android.animation.AnimatorSet r3) {
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.toolbar
            android.widget.ImageButton r0 = com.google.android.material.internal.ToolbarUtils.getNavigationIconButton(r0)
            if (r0 != 0) goto L9
            return
        L9:
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.unwrap(r0)
            com.google.android.material.search.SearchView r1 = r2.searchView
            boolean r1 = r1.isAnimatedNavigationIcon()
            if (r1 == 0) goto L20
            r2.addDrawerArrowDrawableAnimatorIfNeeded(r3, r0)
            r2.addFadeThroughDrawableAnimatorIfNeeded(r3, r0)
            goto L23
        L20:
            r2.setFullDrawableProgressIfNeeded(r0)
        L23:
            return
    }

    private void addBackButtonTranslationAnimatorIfNeeded(android.animation.AnimatorSet r9) {
            r8 = this;
            androidx.appcompat.widget.Toolbar r0 = r8.toolbar
            android.widget.ImageButton r0 = com.google.android.material.internal.ToolbarUtils.getNavigationIconButton(r0)
            if (r0 != 0) goto L9
            return
        L9:
            r1 = 2
            float[] r2 = new float[r1]
            int r3 = r8.getFromTranslationXStart(r0)
            float r3 = (float) r3
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r5 = 0
            r2[r3] = r5
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            android.view.View[] r6 = new android.view.View[r3]
            r6[r4] = r0
            com.google.android.material.internal.MultiViewUpdateListener r6 = com.google.android.material.internal.MultiViewUpdateListener.translationXListener(r6)
            r2.addUpdateListener(r6)
            float[] r6 = new float[r1]
            int r7 = r8.getFromTranslationY()
            float r7 = (float) r7
            r6[r4] = r7
            r6[r3] = r5
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r6)
            android.view.View[] r6 = new android.view.View[r3]
            r6[r4] = r0
            com.google.android.material.internal.MultiViewUpdateListener r0 = com.google.android.material.internal.MultiViewUpdateListener.translationYListener(r6)
            r5.addUpdateListener(r0)
            android.animation.Animator[] r0 = new android.animation.Animator[r1]
            r0[r4] = r2
            r0[r3] = r5
            r9.playTogether(r0)
            return
    }

    private void addDrawerArrowDrawableAnimatorIfNeeded(android.animation.AnimatorSet r4, android.graphics.drawable.Drawable r5) {
            r3 = this;
            boolean r0 = r5 instanceof androidx.appcompat.graphics.drawable.DrawerArrowDrawable
            if (r0 == 0) goto L21
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r5 = (androidx.appcompat.graphics.drawable.DrawerArrowDrawable) r5
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0022: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda0 r2 = new com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda0
            r2.<init>(r5, r0)
            r1.addUpdateListener(r2)
            r5 = 1
            android.animation.Animator[] r5 = new android.animation.Animator[r5]
            r0 = 0
            r5[r0] = r1
            r4.playTogether(r5)
        L21:
            return
    }

    private void addFadeThroughDrawableAnimatorIfNeeded(android.animation.AnimatorSet r4, android.graphics.drawable.Drawable r5) {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.material.internal.FadeThroughDrawable
            if (r0 == 0) goto L21
            com.google.android.material.internal.FadeThroughDrawable r5 = (com.google.android.material.internal.FadeThroughDrawable) r5
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0022: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda0 r1 = new com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda0
            r2 = 1
            r1.<init>(r5, r2)
            r0.addUpdateListener(r1)
            android.animation.Animator[] r5 = new android.animation.Animator[r2]
            r1 = 0
            r5[r1] = r0
            r4.playTogether(r5)
        L21:
            return
    }

    private android.graphics.Rect calculateFromClipBounds() {
            r6 = this;
            r0 = 2
            int[] r1 = new int[r0]
            com.google.android.material.search.SearchBar r2 = r6.searchBar
            r2.getLocationOnScreen(r1)
            r2 = 0
            r3 = r1[r2]
            r4 = 1
            r1 = r1[r4]
            int[] r0 = new int[r0]
            com.google.android.material.internal.ClippableRoundedCornerLayout r5 = r6.rootView
            r5.getLocationOnScreen(r0)
            r2 = r0[r2]
            r0 = r0[r4]
            int r3 = r3 - r2
            int r1 = r1 - r0
            com.google.android.material.search.SearchBar r0 = r6.searchBar
            int r0 = r0.getWidth()
            int r0 = r0 + r3
            com.google.android.material.search.SearchBar r2 = r6.searchBar
            int r2 = r2.getHeight()
            int r2 = r2 + r1
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r3, r1, r0, r2)
            return r4
    }

    private android.animation.Animator getActionMenuViewsAlphaAnimator(boolean r4) {
            r3 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x003a: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            if (r4 == 0) goto Lf
            r1 = 300(0x12c, double:1.48E-321)
            goto L11
        Lf:
            r1 = 250(0xfa, double:1.235E-321)
        L11:
            r0.setDuration(r1)
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r4 = com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(r4, r1)
            r0.setInterpolator(r4)
            com.google.android.material.search.SearchView r4 = r3.searchView
            boolean r4 = r4.isMenuItemsAnimated()
            if (r4 == 0) goto L39
            androidx.appcompat.widget.Toolbar r4 = r3.dummyToolbar
            androidx.appcompat.widget.ActionMenuView r4 = com.google.android.material.internal.ToolbarUtils.getActionMenuView(r4)
            androidx.appcompat.widget.Toolbar r1 = r3.toolbar
            androidx.appcompat.widget.ActionMenuView r1 = com.google.android.material.internal.ToolbarUtils.getActionMenuView(r1)
            com.google.android.material.internal.FadeThroughUpdateListener r2 = new com.google.android.material.internal.FadeThroughUpdateListener
            r2.<init>(r4, r1)
            r0.addUpdateListener(r2)
        L39:
            return r0
    }

    private android.animation.Animator getButtonsAnimator(boolean r4) {
            r3 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r3.addBackButtonTranslationAnimatorIfNeeded(r0)
            r3.addBackButtonProgressAnimatorIfNeeded(r0)
            r3.addActionMenuViewAnimatorIfNeeded(r0)
            if (r4 == 0) goto L13
            r1 = 300(0x12c, double:1.48E-321)
            goto L15
        L13:
            r1 = 250(0xfa, double:1.235E-321)
        L15:
            r0.setDuration(r1)
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r4 = com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(r4, r1)
            r0.setInterpolator(r4)
            return r0
    }

    private android.animation.Animator getClearButtonAnimator(boolean r4) {
            r3 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0038: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            if (r4 == 0) goto Lf
            r1 = 50
            goto L11
        Lf:
            r1 = 42
        L11:
            r0.setDuration(r1)
            if (r4 == 0) goto L19
            r1 = 250(0xfa, double:1.235E-321)
            goto L1b
        L19:
            r1 = 0
        L1b:
            r0.setStartDelay(r1)
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            android.animation.TimeInterpolator r4 = com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(r4, r1)
            r0.setInterpolator(r4)
            r4 = 1
            android.view.View[] r4 = new android.view.View[r4]
            r1 = 0
            android.widget.ImageButton r2 = r3.clearButton
            r4[r1] = r2
            com.google.android.material.internal.MultiViewUpdateListener r4 = com.google.android.material.internal.MultiViewUpdateListener.alphaListener(r4)
            r0.addUpdateListener(r4)
            return r0
    }

    private android.animation.Animator getContentAlphaAnimator(boolean r5) {
            r4 = this;
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x003c: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            if (r5 == 0) goto Lf
            r2 = 150(0x96, double:7.4E-322)
            goto L11
        Lf:
            r2 = 83
        L11:
            r1.setDuration(r2)
            if (r5 == 0) goto L19
            r2 = 75
            goto L1b
        L19:
            r2 = 0
        L1b:
            r1.setStartDelay(r2)
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            android.animation.TimeInterpolator r5 = com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(r5, r2)
            r1.setInterpolator(r5)
            android.view.View[] r5 = new android.view.View[r0]
            r0 = 0
            android.view.View r2 = r4.divider
            r5[r0] = r2
            r0 = 1
            com.google.android.material.internal.TouchObserverFrameLayout r2 = r4.contentContainer
            r5[r0] = r2
            com.google.android.material.internal.MultiViewUpdateListener r5 = com.google.android.material.internal.MultiViewUpdateListener.alphaListener(r5)
            r1.addUpdateListener(r5)
            return r1
    }

    private android.animation.Animator getContentAnimator(boolean r5) {
            r4 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r1 = 3
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            android.animation.Animator r2 = r4.getContentAlphaAnimator(r5)
            r3 = 0
            r1[r3] = r2
            android.animation.Animator r2 = r4.getDividerAnimator(r5)
            r3 = 1
            r1[r3] = r2
            android.animation.Animator r5 = r4.getContentScaleAnimator(r5)
            r2 = 2
            r1[r2] = r5
            r0.playTogether(r1)
            return r0
    }

    private android.animation.Animator getContentScaleAnimator(boolean r4) {
            r3 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x002e: FILL_ARRAY_DATA , data: [1064514355, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            if (r4 == 0) goto Lf
            r1 = 300(0x12c, double:1.48E-321)
            goto L11
        Lf:
            r1 = 250(0xfa, double:1.235E-321)
        L11:
            r0.setDuration(r1)
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r4 = com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(r4, r1)
            r0.setInterpolator(r4)
            r4 = 1
            android.view.View[] r4 = new android.view.View[r4]
            r1 = 0
            com.google.android.material.internal.TouchObserverFrameLayout r2 = r3.contentContainer
            r4[r1] = r2
            com.google.android.material.internal.MultiViewUpdateListener r4 = com.google.android.material.internal.MultiViewUpdateListener.scaleListener(r4)
            r0.addUpdateListener(r4)
            return r0
    }

    private android.animation.Animator getDividerAnimator(boolean r7) {
            r6 = this;
            com.google.android.material.internal.TouchObserverFrameLayout r0 = r6.contentContainer
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r1 = 1028443344(0x3d4cccd0, float:0.050000012)
            float r0 = r0 * r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 0
            r3 = 1
            r1[r3] = r0
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r1)
            if (r7 == 0) goto L22
            r4 = 300(0x12c, double:1.48E-321)
            goto L24
        L22:
            r4 = 250(0xfa, double:1.235E-321)
        L24:
            r0.setDuration(r4)
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r7 = com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(r7, r1)
            r0.setInterpolator(r7)
            android.view.View[] r7 = new android.view.View[r3]
            android.view.View r1 = r6.divider
            r7[r2] = r1
            com.google.android.material.internal.MultiViewUpdateListener r7 = com.google.android.material.internal.MultiViewUpdateListener.translationYListener(r7)
            r0.addUpdateListener(r7)
            return r0
    }

    private android.animation.Animator getDummyToolbarAnimator(boolean r3) {
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.dummyToolbar
            r1 = 0
            android.animation.Animator r3 = r2.getTranslationAnimator(r3, r1, r0)
            return r3
    }

    private android.animation.Animator getEditTextAnimator(boolean r3) {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            r1 = 1
            android.animation.Animator r3 = r2.getTranslationAnimator(r3, r1, r0)
            return r3
    }

    private android.animation.AnimatorSet getExpandCollapseAnimatorSet(boolean r5) {
            r4 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r1 = 10
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            android.animation.Animator r2 = r4.getScrimAlphaAnimator(r5)
            r3 = 0
            r1[r3] = r2
            android.animation.Animator r2 = r4.getRootViewAnimator(r5)
            r3 = 1
            r1[r3] = r2
            android.animation.Animator r2 = r4.getClearButtonAnimator(r5)
            r3 = 2
            r1[r3] = r2
            android.animation.Animator r2 = r4.getContentAnimator(r5)
            r3 = 3
            r1[r3] = r2
            android.animation.Animator r2 = r4.getButtonsAnimator(r5)
            r3 = 4
            r1[r3] = r2
            android.animation.Animator r2 = r4.getHeaderContainerAnimator(r5)
            r3 = 5
            r1[r3] = r2
            android.animation.Animator r2 = r4.getDummyToolbarAnimator(r5)
            r3 = 6
            r1[r3] = r2
            android.animation.Animator r2 = r4.getActionMenuViewsAlphaAnimator(r5)
            r3 = 7
            r1[r3] = r2
            android.animation.Animator r2 = r4.getEditTextAnimator(r5)
            r3 = 8
            r1[r3] = r2
            android.animation.Animator r2 = r4.getSearchPrefixAnimator(r5)
            r3 = 9
            r1[r3] = r2
            r0.playTogether(r1)
            com.google.android.material.search.SearchViewAnimationHelper$5 r1 = new com.google.android.material.search.SearchViewAnimationHelper$5
            r1.<init>(r4, r5)
            r0.addListener(r1)
            return r0
    }

    private int getFromTranslationXEnd(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r3 = androidx.core.view.MarginLayoutParamsCompat.getMarginEnd(r3)
            com.google.android.material.search.SearchBar r0 = r2.searchBar
            boolean r0 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r0)
            if (r0 == 0) goto L1a
            com.google.android.material.search.SearchBar r0 = r2.searchBar
            int r0 = r0.getLeft()
            int r0 = r0 - r3
            goto L28
        L1a:
            com.google.android.material.search.SearchBar r0 = r2.searchBar
            int r0 = r0.getRight()
            com.google.android.material.search.SearchView r1 = r2.searchView
            int r1 = r1.getWidth()
            int r0 = r0 - r1
            int r0 = r0 + r3
        L28:
            return r0
    }

    private int getFromTranslationXStart(android.view.View r4) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r4 = androidx.core.view.MarginLayoutParamsCompat.getMarginStart(r4)
            com.google.android.material.search.SearchBar r0 = r3.searchBar
            int r0 = androidx.core.view.ViewCompat.getPaddingStart(r0)
            com.google.android.material.search.SearchBar r1 = r3.searchBar
            boolean r1 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r1)
            if (r1 == 0) goto L28
            com.google.android.material.search.SearchBar r1 = r3.searchBar
            int r1 = r1.getWidth()
            com.google.android.material.search.SearchBar r2 = r3.searchBar
            int r2 = r2.getRight()
            int r1 = r1 - r2
            int r1 = r1 + r4
            int r1 = r1 - r0
            goto L30
        L28:
            com.google.android.material.search.SearchBar r1 = r3.searchBar
            int r1 = r1.getLeft()
            int r1 = r1 - r4
            int r1 = r1 + r0
        L30:
            return r1
    }

    private int getFromTranslationY() {
            r3 = this;
            android.widget.FrameLayout r0 = r3.toolbarContainer
            int r0 = r0.getTop()
            android.widget.FrameLayout r1 = r3.toolbarContainer
            int r1 = r1.getBottom()
            int r1 = r1 + r0
            int r1 = r1 / 2
            com.google.android.material.search.SearchBar r0 = r3.searchBar
            int r0 = r0.getTop()
            com.google.android.material.search.SearchBar r2 = r3.searchBar
            int r2 = r2.getBottom()
            int r2 = r2 + r0
            int r2 = r2 / 2
            int r2 = r2 - r1
            return r2
    }

    private android.animation.Animator getHeaderContainerAnimator(boolean r3) {
            r2 = this;
            android.widget.FrameLayout r0 = r2.headerContainer
            r1 = 0
            android.animation.Animator r3 = r2.getTranslationAnimator(r3, r1, r0)
            return r3
    }

    private android.animation.Animator getRootViewAnimator(boolean r8) {
            r7 = this;
            com.google.android.material.search.SearchView r0 = r7.searchView
            android.graphics.Rect r0 = com.google.android.material.internal.ViewUtils.calculateRectFromBounds(r0)
            android.graphics.Rect r1 = r7.calculateFromClipBounds()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r1)
            com.google.android.material.search.SearchBar r3 = r7.searchBar
            float r3 = r3.getCornerSize()
            com.google.android.material.internal.RectEvaluator r4 = new com.google.android.material.internal.RectEvaluator
            r4.<init>(r2)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r1
            r1 = 1
            r5[r1] = r0
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofObject(r4, r5)
            com.google.android.material.search.SearchViewAnimationHelper$$ExternalSyntheticLambda0 r1 = new com.google.android.material.search.SearchViewAnimationHelper$$ExternalSyntheticLambda0
            r1.<init>(r7, r3, r2)
            r0.addUpdateListener(r1)
            if (r8 == 0) goto L34
            r1 = 300(0x12c, double:1.48E-321)
            goto L36
        L34:
            r1 = 250(0xfa, double:1.235E-321)
        L36:
            r0.setDuration(r1)
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r8 = com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(r8, r1)
            r0.setInterpolator(r8)
            return r0
    }

    private android.animation.Animator getScrimAlphaAnimator(boolean r5) {
            r4 = this;
            if (r5 == 0) goto L5
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            goto L7
        L5:
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
        L7:
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x0032: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            if (r5 == 0) goto L16
            r2 = 300(0x12c, double:1.48E-321)
            goto L18
        L16:
            r2 = 250(0xfa, double:1.235E-321)
        L18:
            r1.setDuration(r2)
            android.animation.TimeInterpolator r5 = com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(r5, r0)
            r1.setInterpolator(r5)
            r5 = 1
            android.view.View[] r5 = new android.view.View[r5]
            r0 = 0
            android.view.View r2 = r4.scrim
            r5[r0] = r2
            com.google.android.material.internal.MultiViewUpdateListener r5 = com.google.android.material.internal.MultiViewUpdateListener.alphaListener(r5)
            r1.addUpdateListener(r5)
            return r1
    }

    private android.animation.Animator getSearchPrefixAnimator(boolean r3) {
            r2 = this;
            android.widget.TextView r0 = r2.searchPrefix
            r1 = 1
            android.animation.Animator r3 = r2.getTranslationAnimator(r3, r1, r0)
            return r3
    }

    private android.animation.AnimatorSet getTranslateAnimatorSet(boolean r5) {
            r4 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r1 = 1
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            android.animation.Animator r2 = r4.getTranslationYAnimator()
            r3 = 0
            r1[r3] = r2
            r0.playTogether(r1)
            r4.addBackButtonProgressAnimatorIfNeeded(r0)
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r1 = com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(r5, r1)
            r0.setInterpolator(r1)
            if (r5 == 0) goto L23
            r1 = 350(0x15e, double:1.73E-321)
            goto L25
        L23:
            r1 = 300(0x12c, double:1.48E-321)
        L25:
            r0.setDuration(r1)
            return r0
    }

    private android.animation.Animator getTranslationAnimator(boolean r7, boolean r8, android.view.View r9) {
            r6 = this;
            if (r8 == 0) goto L7
            int r8 = r6.getFromTranslationXStart(r9)
            goto Lb
        L7:
            int r8 = r6.getFromTranslationXEnd(r9)
        Lb:
            r0 = 2
            float[] r1 = new float[r0]
            float r8 = (float) r8
            r2 = 0
            r1[r2] = r8
            r8 = 1
            r3 = 0
            r1[r8] = r3
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            android.view.View[] r4 = new android.view.View[r8]
            r4[r2] = r9
            com.google.android.material.internal.MultiViewUpdateListener r4 = com.google.android.material.internal.MultiViewUpdateListener.translationXListener(r4)
            r1.addUpdateListener(r4)
            float[] r4 = new float[r0]
            int r5 = r6.getFromTranslationY()
            float r5 = (float) r5
            r4[r2] = r5
            r4[r8] = r3
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r4)
            android.view.View[] r4 = new android.view.View[r8]
            r4[r2] = r9
            com.google.android.material.internal.MultiViewUpdateListener r9 = com.google.android.material.internal.MultiViewUpdateListener.translationYListener(r4)
            r3.addUpdateListener(r9)
            android.animation.AnimatorSet r9 = new android.animation.AnimatorSet
            r9.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r0[r2] = r1
            r0[r8] = r3
            r9.playTogether(r0)
            if (r7 == 0) goto L52
            r0 = 300(0x12c, double:1.48E-321)
            goto L54
        L52:
            r0 = 250(0xfa, double:1.235E-321)
        L54:
            r9.setDuration(r0)
            android.animation.TimeInterpolator r8 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r7 = com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(r7, r8)
            r9.setInterpolator(r7)
            return r9
    }

    private android.animation.Animator getTranslationYAnimator() {
            r4 = this;
            r0 = 2
            float[] r0 = new float[r0]
            com.google.android.material.internal.ClippableRoundedCornerLayout r1 = r4.rootView
            int r1 = r1.getHeight()
            float r1 = (float) r1
            r2 = 0
            r0[r2] = r1
            r1 = 0
            r3 = 1
            r0[r3] = r1
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            android.view.View[] r1 = new android.view.View[r3]
            com.google.android.material.internal.ClippableRoundedCornerLayout r3 = r4.rootView
            r1[r2] = r3
            com.google.android.material.internal.MultiViewUpdateListener r1 = com.google.android.material.internal.MultiViewUpdateListener.translationYListener(r1)
            r0.addUpdateListener(r1)
            return r0
    }

    private static /* synthetic */ void lambda$addDrawerArrowDrawableAnimatorIfNeeded$3(androidx.appcompat.graphics.drawable.DrawerArrowDrawable r0, android.animation.ValueAnimator r1) {
            float r1 = r1.getAnimatedFraction()
            r0.setProgress(r1)
            return
    }

    private static /* synthetic */ void lambda$addFadeThroughDrawableAnimatorIfNeeded$4(com.google.android.material.internal.FadeThroughDrawable r0, android.animation.ValueAnimator r1) {
            float r1 = r1.getAnimatedFraction()
            r0.setProgress(r1)
            return
    }

    private /* synthetic */ void lambda$getRootViewAnimator$2(float r2, android.graphics.Rect r3, android.animation.ValueAnimator r4) {
            r1 = this;
            float r4 = r4.getAnimatedFraction()
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r4
            float r0 = r0 * r2
            com.google.android.material.internal.ClippableRoundedCornerLayout r2 = r1.rootView
            r2.updateClipBoundsAndCornerRadius(r3, r0)
            return
    }

    private /* synthetic */ void lambda$startShowAnimationExpand$0() {
            r2 = this;
            r0 = 1
            android.animation.AnimatorSet r0 = r2.getExpandCollapseAnimatorSet(r0)
            com.google.android.material.search.SearchViewAnimationHelper$1 r1 = new com.google.android.material.search.SearchViewAnimationHelper$1
            r1.<init>(r2)
            r0.addListener(r1)
            r0.start()
            return
    }

    private /* synthetic */ void lambda$startShowAnimationTranslate$1() {
            r2 = this;
            com.google.android.material.internal.ClippableRoundedCornerLayout r0 = r2.rootView
            int r1 = r0.getHeight()
            float r1 = (float) r1
            r0.setTranslationY(r1)
            r0 = 1
            android.animation.AnimatorSet r0 = r2.getTranslateAnimatorSet(r0)
            com.google.android.material.search.SearchViewAnimationHelper$3 r1 = new com.google.android.material.search.SearchViewAnimationHelper$3
            r1.<init>(r2)
            r0.addListener(r1)
            r0.start()
            return
    }

    private void setActionMenuViewAlphaIfNeeded(float r2) {
            r1 = this;
            com.google.android.material.search.SearchView r0 = r1.searchView
            boolean r0 = r0.isMenuItemsAnimated()
            if (r0 == 0) goto L13
            androidx.appcompat.widget.Toolbar r0 = r1.toolbar
            androidx.appcompat.widget.ActionMenuView r0 = com.google.android.material.internal.ToolbarUtils.getActionMenuView(r0)
            if (r0 == 0) goto L13
            r0.setAlpha(r2)
        L13:
            return
    }

    private void setContentViewsAlpha(float r2) {
            r1 = this;
            android.widget.ImageButton r0 = r1.clearButton
            r0.setAlpha(r2)
            android.view.View r0 = r1.divider
            r0.setAlpha(r2)
            com.google.android.material.internal.TouchObserverFrameLayout r0 = r1.contentContainer
            r0.setAlpha(r2)
            r1.setActionMenuViewAlphaIfNeeded(r2)
            return
    }

    private void setFullDrawableProgressIfNeeded(android.graphics.drawable.Drawable r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.appcompat.graphics.drawable.DrawerArrowDrawable
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto Lc
            r0 = r3
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r0 = (androidx.appcompat.graphics.drawable.DrawerArrowDrawable) r0
            r0.setProgress(r1)
        Lc:
            boolean r0 = r3 instanceof com.google.android.material.internal.FadeThroughDrawable
            if (r0 == 0) goto L15
            com.google.android.material.internal.FadeThroughDrawable r3 = (com.google.android.material.internal.FadeThroughDrawable) r3
            r3.setProgress(r1)
        L15:
            return
    }

    private void setMenuItemsNotClickable(androidx.appcompat.widget.Toolbar r4) {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r4 = com.google.android.material.internal.ToolbarUtils.getActionMenuView(r4)
            if (r4 == 0) goto L1e
            r0 = 0
            r1 = 0
        L8:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L1e
            android.view.View r2 = r4.getChildAt(r1)
            r2.setClickable(r0)
            r2.setFocusable(r0)
            r2.setFocusableInTouchMode(r0)
            int r1 = r1 + 1
            goto L8
        L1e:
            return
    }

    private void setUpDummyToolbarIfNeeded() {
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.dummyToolbar
            android.view.Menu r0 = r0.getMenu()
            if (r0 == 0) goto Lb
            r0.clear()
        Lb:
            com.google.android.material.search.SearchBar r0 = r2.searchBar
            int r0 = r0.getMenuResId()
            r1 = -1
            if (r0 == r1) goto L33
            com.google.android.material.search.SearchView r0 = r2.searchView
            boolean r0 = r0.isMenuItemsAnimated()
            if (r0 == 0) goto L33
            androidx.appcompat.widget.Toolbar r0 = r2.dummyToolbar
            com.google.android.material.search.SearchBar r1 = r2.searchBar
            int r1 = r1.getMenuResId()
            r0.inflateMenu(r1)
            androidx.appcompat.widget.Toolbar r0 = r2.dummyToolbar
            r2.setMenuItemsNotClickable(r0)
            androidx.appcompat.widget.Toolbar r0 = r2.dummyToolbar
            r1 = 0
            r0.setVisibility(r1)
            goto L3a
        L33:
            androidx.appcompat.widget.Toolbar r0 = r2.dummyToolbar
            r1 = 8
            r0.setVisibility(r1)
        L3a:
            return
    }

    private void startHideAnimationCollapse() {
            r2 = this;
            com.google.android.material.search.SearchView r0 = r2.searchView
            boolean r0 = r0.isAdjustNothingSoftInputMode()
            if (r0 == 0) goto Ld
            com.google.android.material.search.SearchView r0 = r2.searchView
            r0.clearFocusAndHideKeyboard()
        Ld:
            r0 = 0
            android.animation.AnimatorSet r0 = r2.getExpandCollapseAnimatorSet(r0)
            com.google.android.material.search.SearchViewAnimationHelper$2 r1 = new com.google.android.material.search.SearchViewAnimationHelper$2
            r1.<init>(r2)
            r0.addListener(r1)
            r0.start()
            return
    }

    private void startHideAnimationTranslate() {
            r2 = this;
            com.google.android.material.search.SearchView r0 = r2.searchView
            boolean r0 = r0.isAdjustNothingSoftInputMode()
            if (r0 == 0) goto Ld
            com.google.android.material.search.SearchView r0 = r2.searchView
            r0.clearFocusAndHideKeyboard()
        Ld:
            r0 = 0
            android.animation.AnimatorSet r0 = r2.getTranslateAnimatorSet(r0)
            com.google.android.material.search.SearchViewAnimationHelper$4 r1 = new com.google.android.material.search.SearchViewAnimationHelper$4
            r1.<init>(r2)
            r0.addListener(r1)
            r0.start()
            return
    }

    private void startShowAnimationExpand() {
            r3 = this;
            com.google.android.material.search.SearchView r0 = r3.searchView
            boolean r0 = r0.isAdjustNothingSoftInputMode()
            if (r0 == 0) goto Ld
            com.google.android.material.search.SearchView r0 = r3.searchView
            r0.requestFocusAndShowKeyboardIfNeeded()
        Ld:
            com.google.android.material.search.SearchView r0 = r3.searchView
            com.google.android.material.search.SearchView$TransitionState r1 = com.google.android.material.search.SearchView.TransitionState.SHOWING
            r0.setTransitionState(r1)
            r3.setUpDummyToolbarIfNeeded()
            android.widget.EditText r0 = r3.editText
            com.google.android.material.search.SearchBar r1 = r3.searchBar
            java.lang.CharSequence r1 = r1.getText()
            r0.setText(r1)
            android.widget.EditText r0 = r3.editText
            android.text.Editable r1 = r0.getText()
            int r1 = r1.length()
            r0.setSelection(r1)
            com.google.android.material.internal.ClippableRoundedCornerLayout r0 = r3.rootView
            r1 = 4
            r0.setVisibility(r1)
            com.google.android.material.internal.ClippableRoundedCornerLayout r0 = r3.rootView
            com.google.android.material.search.SearchBar$$ExternalSyntheticLambda1 r1 = new com.google.android.material.search.SearchBar$$ExternalSyntheticLambda1
            r2 = 1
            r1.<init>(r3, r2)
            r0.post(r1)
            return
    }

    private void startShowAnimationTranslate() {
            r5 = this;
            com.google.android.material.search.SearchView r0 = r5.searchView
            boolean r0 = r0.isAdjustNothingSoftInputMode()
            r1 = 2
            if (r0 == 0) goto L18
            com.google.android.material.search.SearchView r0 = r5.searchView
            java.util.Objects.requireNonNull(r0)
            com.google.android.material.search.SearchView$$ExternalSyntheticLambda5 r2 = new com.google.android.material.search.SearchView$$ExternalSyntheticLambda5
            r2.<init>(r0, r1)
            r3 = 150(0x96, double:7.4E-322)
            r0.postDelayed(r2, r3)
        L18:
            com.google.android.material.internal.ClippableRoundedCornerLayout r0 = r5.rootView
            r2 = 4
            r0.setVisibility(r2)
            com.google.android.material.internal.ClippableRoundedCornerLayout r0 = r5.rootView
            com.google.android.material.search.SearchBar$$ExternalSyntheticLambda1 r2 = new com.google.android.material.search.SearchBar$$ExternalSyntheticLambda1
            r2.<init>(r5, r1)
            r0.post(r2)
            return
    }

    public final void hide() {
            r1 = this;
            com.google.android.material.search.SearchBar r0 = r1.searchBar
            if (r0 == 0) goto L8
            r1.startHideAnimationCollapse()
            goto Lb
        L8:
            r1.startHideAnimationTranslate()
        Lb:
            return
    }

    public final void setSearchBar(com.google.android.material.search.SearchBar r1) {
            r0 = this;
            r0.searchBar = r1
            return
    }

    public final void show() {
            r1 = this;
            com.google.android.material.search.SearchBar r0 = r1.searchBar
            if (r0 == 0) goto L8
            r1.startShowAnimationExpand()
            goto Lb
        L8:
            r1.startShowAnimationTranslate()
        Lb:
            return
    }
}
