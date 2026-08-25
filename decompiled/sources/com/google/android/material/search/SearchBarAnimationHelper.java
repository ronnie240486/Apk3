package com.google.android.material.search;

/* JADX INFO: loaded from: classes2.dex */
class SearchBarAnimationHelper {
    private static final long COLLAPSE_DURATION_MS = 250;
    private static final long COLLAPSE_FADE_IN_CHILDREN_DURATION_MS = 100;
    private static final long EXPAND_DURATION_MS = 300;
    private static final long EXPAND_FADE_OUT_CHILDREN_DURATION_MS = 75;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_DURATION_MS = 250;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_IN_START_DELAY_MS = 500;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_OUT_START_DELAY_MS = 750;
    private static final long ON_LOAD_ANIM_SECONDARY_DURATION_MS = 250;
    private static final long ON_LOAD_ANIM_SECONDARY_START_DELAY_MS = 250;
    private final java.util.Set<android.animation.AnimatorListenerAdapter> collapseAnimationListeners;
    private boolean collapsing;

    @androidx.annotation.Nullable
    private android.animation.Animator defaultCenterViewAnimator;
    private final java.util.Set<android.animation.AnimatorListenerAdapter> expandAnimationListeners;
    private boolean expanding;
    private final java.util.Set<com.google.android.material.search.SearchBar.OnLoadAnimationCallback> onLoadAnimationCallbacks;
    private boolean onLoadAnimationFadeInEnabled;
    private android.animation.Animator runningExpandOrCollapseAnimator;

    @androidx.annotation.Nullable
    private android.animation.Animator secondaryViewAnimator;







    /* JADX INFO: loaded from: classes3.dex */
    public interface OnLoadAnimationInvocation {
        void invoke(com.google.android.material.search.SearchBar.OnLoadAnimationCallback r1);
    }

    public static /* synthetic */ void $r8$lambda$2I8f9dhWFZQCPYrRMzZyxkZ3meI(android.view.View r0, android.animation.ValueAnimator r1) {
            lambda$getFadeOutChildrenAnimator$2(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$Y1iO95GaSHXK4-hoCpYUkNRMEoA, reason: not valid java name */
    public static /* synthetic */ void m285$r8$lambda$Y1iO95GaSHXK4hoCpYUkNRMEoA(com.google.android.material.search.SearchBarAnimationHelper r0, com.google.android.material.search.SearchBar r1, android.view.View r2, com.google.android.material.appbar.AppBarLayout r3, boolean r4) {
            r0.lambda$startExpandAnimation$0(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$yH4S7Qv4k33maxvHB6qlvi3s1xU(com.google.android.material.shape.MaterialShapeDrawable r0, android.view.View r1, android.animation.ValueAnimator r2) {
            lambda$getExpandedViewBackgroundUpdateListener$1(r0, r1, r2)
            return
    }

    public SearchBarAnimationHelper() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.onLoadAnimationCallbacks = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.expandAnimationListeners = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.collapseAnimationListeners = r0
            r0 = 1
            r1.onLoadAnimationFadeInEnabled = r0
            r0 = 0
            r1.runningExpandOrCollapseAnimator = r0
            return
    }

    public static /* synthetic */ void access$000(com.google.android.material.search.SearchBarAnimationHelper r0, com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation r1) {
            r0.dispatchOnLoadAnimation(r1)
            return
    }

    public static /* synthetic */ void access$102(com.google.android.material.search.SearchBarAnimationHelper r1) {
            r0 = 0
            r1.expanding = r0
            return
    }

    public static /* synthetic */ void access$202(com.google.android.material.search.SearchBarAnimationHelper r1) {
            r0 = 0
            r1.runningExpandOrCollapseAnimator = r0
            return
    }

    public static /* synthetic */ void access$302(com.google.android.material.search.SearchBarAnimationHelper r1) {
            r0 = 0
            r1.collapsing = r0
            return
    }

    private void dispatchOnLoadAnimation(com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation r3) {
            r2 = this;
            java.util.Set<com.google.android.material.search.SearchBar$OnLoadAnimationCallback> r0 = r2.onLoadAnimationCallbacks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.material.search.SearchBar$OnLoadAnimationCallback r1 = (com.google.android.material.search.SearchBar.OnLoadAnimationCallback) r1
            r3.invoke(r1)
            goto L6
        L16:
            return
    }

    private android.animation.Animator getCollapseAnimator(com.google.android.material.search.SearchBar r3, android.view.View r4, com.google.android.material.appbar.AppBarLayout r5) {
            r2 = this;
            com.google.android.material.internal.ExpandCollapseAnimationHelper r4 = r2.getExpandCollapseAnimationHelper(r3, r4, r5)
            r0 = 250(0xfa, double:1.235E-321)
            com.google.android.material.internal.ExpandCollapseAnimationHelper r4 = r4.setDuration(r0)
            com.google.android.material.search.SearchBarAnimationHelper$6 r5 = new com.google.android.material.search.SearchBarAnimationHelper$6
            r5.<init>(r2, r3)
            com.google.android.material.internal.ExpandCollapseAnimationHelper r3 = r4.addListener(r5)
            android.animation.Animator r3 = r3.getCollapseAnimator()
            return r3
    }

    private android.animation.Animator getDefaultCenterViewAnimator(@androidx.annotation.Nullable android.view.View r13) {
            r12 = this;
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0062: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r2 = 1
            android.view.View[] r3 = new android.view.View[r2]
            r4 = 0
            r3[r4] = r13
            com.google.android.material.internal.MultiViewUpdateListener r3 = com.google.android.material.internal.MultiViewUpdateListener.alphaListener(r3)
            r1.addUpdateListener(r3)
            android.animation.TimeInterpolator r3 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            r1.setInterpolator(r3)
            boolean r5 = r12.onLoadAnimationFadeInEnabled
            r6 = 250(0xfa, double:1.235E-321)
            r8 = 0
            if (r5 == 0) goto L26
            r10 = r6
            goto L27
        L26:
            r10 = r8
        L27:
            r1.setDuration(r10)
            boolean r5 = r12.onLoadAnimationFadeInEnabled
            if (r5 == 0) goto L30
            r8 = 500(0x1f4, double:2.47E-321)
        L30:
            r1.setStartDelay(r8)
            float[] r5 = new float[r0]
            r5 = {x006a: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r5)
            android.view.View[] r8 = new android.view.View[r2]
            r8[r4] = r13
            com.google.android.material.internal.MultiViewUpdateListener r13 = com.google.android.material.internal.MultiViewUpdateListener.alphaListener(r8)
            r5.addUpdateListener(r13)
            r5.setInterpolator(r3)
            r5.setDuration(r6)
            r6 = 750(0x2ee, double:3.705E-321)
            r5.setStartDelay(r6)
            android.animation.AnimatorSet r13 = new android.animation.AnimatorSet
            r13.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r0[r4] = r1
            r0[r2] = r5
            r13.playSequentially(r0)
            return r13
    }

    private java.util.List<android.view.View> getEndAnchoredViews(android.view.View r6) {
            r5 = this;
            boolean r0 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = r6 instanceof android.view.ViewGroup
            if (r2 == 0) goto L2c
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r2 = 0
        L10:
            int r3 = r6.getChildCount()
            if (r2 >= r3) goto L2c
            android.view.View r3 = r6.getChildAt(r2)
            if (r0 != 0) goto L20
            boolean r4 = r3 instanceof androidx.appcompat.widget.ActionMenuView
            if (r4 != 0) goto L26
        L20:
            if (r0 == 0) goto L29
            boolean r4 = r3 instanceof androidx.appcompat.widget.ActionMenuView
            if (r4 != 0) goto L29
        L26:
            r1.add(r3)
        L29:
            int r2 = r2 + 1
            goto L10
        L2c:
            return r1
    }

    private android.animation.Animator getExpandAnimator(com.google.android.material.search.SearchBar r3, android.view.View r4, @androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout r5) {
            r2 = this;
            com.google.android.material.internal.ExpandCollapseAnimationHelper r4 = r2.getExpandCollapseAnimationHelper(r3, r4, r5)
            r0 = 300(0x12c, double:1.48E-321)
            com.google.android.material.internal.ExpandCollapseAnimationHelper r4 = r4.setDuration(r0)
            com.google.android.material.search.SearchBarAnimationHelper$4 r5 = new com.google.android.material.search.SearchBarAnimationHelper$4
            r5.<init>(r2, r3)
            com.google.android.material.internal.ExpandCollapseAnimationHelper r3 = r4.addListener(r5)
            android.animation.Animator r3 = r3.getExpandAnimator()
            return r3
    }

    private com.google.android.material.internal.ExpandCollapseAnimationHelper getExpandCollapseAnimationHelper(com.google.android.material.search.SearchBar r2, android.view.View r3, @androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout r4) {
            r1 = this;
            com.google.android.material.internal.ExpandCollapseAnimationHelper r0 = new com.google.android.material.internal.ExpandCollapseAnimationHelper
            r0.<init>(r2, r3)
            android.animation.ValueAnimator$AnimatorUpdateListener r2 = r1.getExpandedViewBackgroundUpdateListener(r2, r3)
            com.google.android.material.internal.ExpandCollapseAnimationHelper r2 = r0.setAdditionalUpdateListener(r2)
            if (r4 == 0) goto L14
            int r4 = r4.getTop()
            goto L15
        L14:
            r4 = 0
        L15:
            com.google.android.material.internal.ExpandCollapseAnimationHelper r2 = r2.setCollapsedViewOffsetY(r4)
            java.util.List r3 = r1.getEndAnchoredViews(r3)
            com.google.android.material.internal.ExpandCollapseAnimationHelper r2 = r2.addEndAnchoredViews(r3)
            return r2
    }

    private android.animation.ValueAnimator.AnimatorUpdateListener getExpandedViewBackgroundUpdateListener(com.google.android.material.search.SearchBar r3, android.view.View r4) {
            r2 = this;
            android.content.Context r0 = r4.getContext()
            com.google.android.material.shape.MaterialShapeDrawable r0 = com.google.android.material.shape.MaterialShapeDrawable.createWithElevationOverlay(r0)
            float r1 = r3.getCornerSize()
            r0.setCornerSize(r1)
            float r3 = androidx.core.view.ViewCompat.getElevation(r3)
            r0.setElevation(r3)
            com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda1 r3 = new com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda1
            r3.<init>(r0, r4)
            return r3
    }

    private java.util.List<android.view.View> getFadeChildren(com.google.android.material.search.SearchBar r3) {
            r2 = this;
            java.util.List r0 = com.google.android.material.internal.ViewUtils.getChildren(r3)
            android.view.View r1 = r3.getCenterView()
            if (r1 == 0) goto L11
            android.view.View r3 = r3.getCenterView()
            r0.remove(r3)
        L11:
            return r0
    }

    private android.animation.Animator getFadeInChildrenAnimator(com.google.android.material.search.SearchBar r4) {
            r3 = this;
            java.util.List r4 = r3.getFadeChildren(r4)
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            com.google.android.material.internal.MultiViewUpdateListener r4 = com.google.android.material.internal.MultiViewUpdateListener.alphaListener(r4)
            r0.addUpdateListener(r4)
            r1 = 100
            r0.setDuration(r1)
            android.animation.TimeInterpolator r4 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            r0.setInterpolator(r4)
            return r0
    }

    private android.animation.Animator getFadeOutChildrenAnimator(com.google.android.material.search.SearchBar r3, android.view.View r4) {
            r2 = this;
            java.util.List r3 = r2.getFadeChildren(r3)
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x002a: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            com.google.android.material.internal.MultiViewUpdateListener r3 = com.google.android.material.internal.MultiViewUpdateListener.alphaListener(r3)
            r0.addUpdateListener(r3)
            com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda0 r3 = new com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda0
            r1 = 0
            r3.<init>(r4, r1)
            r0.addUpdateListener(r3)
            r3 = 75
            r0.setDuration(r3)
            android.animation.TimeInterpolator r3 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            r0.setInterpolator(r3)
            return r0
    }

    private android.animation.Animator getSecondaryActionMenuItemAnimator(@androidx.annotation.Nullable android.view.View r4) {
            r3 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0022: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r1 = 1
            android.view.View[] r1 = new android.view.View[r1]
            r2 = 0
            r1[r2] = r4
            com.google.android.material.internal.MultiViewUpdateListener r4 = com.google.android.material.internal.MultiViewUpdateListener.alphaListener(r1)
            r0.addUpdateListener(r4)
            android.animation.TimeInterpolator r4 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            r0.setInterpolator(r4)
            r1 = 250(0xfa, double:1.235E-321)
            r0.setDuration(r1)
            return r0
    }

    private android.animation.Animator getSecondaryViewAnimator(android.widget.TextView r4, @androidx.annotation.Nullable android.view.View r5) {
            r3 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r1 = 250(0xfa, double:1.235E-321)
            r0.setStartDelay(r1)
            android.animation.Animator r4 = r3.getTextViewAnimator(r4)
            r0.play(r4)
            if (r5 == 0) goto L1a
            android.animation.Animator r4 = r3.getSecondaryActionMenuItemAnimator(r5)
            r0.play(r4)
        L1a:
            return r0
    }

    private android.animation.Animator getTextViewAnimator(android.widget.TextView r4) {
            r3 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0022: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r1 = 1
            android.view.View[] r1 = new android.view.View[r1]
            r2 = 0
            r1[r2] = r4
            com.google.android.material.internal.MultiViewUpdateListener r4 = com.google.android.material.internal.MultiViewUpdateListener.alphaListener(r1)
            r0.addUpdateListener(r4)
            android.animation.TimeInterpolator r4 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            r0.setInterpolator(r4)
            r1 = 250(0xfa, double:1.235E-321)
            r0.setDuration(r1)
            return r0
    }

    private static /* synthetic */ void lambda$getExpandedViewBackgroundUpdateListener$1(com.google.android.material.shape.MaterialShapeDrawable r1, android.view.View r2, android.animation.ValueAnimator r3) {
            float r3 = r3.getAnimatedFraction()
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r0 - r3
            r1.setInterpolation(r3)
            androidx.core.view.ViewCompat.setBackground(r2, r1)
            r2.setAlpha(r0)
            return
    }

    private static /* synthetic */ void lambda$getFadeOutChildrenAnimator$2(android.view.View r0, android.animation.ValueAnimator r1) {
            r1 = 0
            r0.setAlpha(r1)
            return
    }

    private /* synthetic */ void lambda$startExpandAnimation$0(com.google.android.material.search.SearchBar r3, android.view.View r4, com.google.android.material.appbar.AppBarLayout r5, boolean r6) {
            r2 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            android.animation.Animator r1 = r2.getFadeOutChildrenAnimator(r3, r4)
            android.animation.Animator r3 = r2.getExpandAnimator(r3, r4, r5)
            r4 = 2
            android.animation.Animator[] r4 = new android.animation.Animator[r4]
            r5 = 0
            r4[r5] = r1
            r5 = 1
            r4[r5] = r3
            r0.playSequentially(r4)
            com.google.android.material.search.SearchBarAnimationHelper$3 r3 = new com.google.android.material.search.SearchBarAnimationHelper$3
            r3.<init>(r2)
            r0.addListener(r3)
            java.util.Set<android.animation.AnimatorListenerAdapter> r3 = r2.expandAnimationListeners
            java.util.Iterator r3 = r3.iterator()
        L27:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L37
            java.lang.Object r4 = r3.next()
            android.animation.AnimatorListenerAdapter r4 = (android.animation.AnimatorListenerAdapter) r4
            r0.addListener(r4)
            goto L27
        L37:
            if (r6 == 0) goto L3e
            r3 = 0
            r0.setDuration(r3)
        L3e:
            r0.start()
            r2.runningExpandOrCollapseAnimator = r0
            return
    }

    public final void addCollapseAnimationListener(@androidx.annotation.NonNull android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            java.util.Set<android.animation.AnimatorListenerAdapter> r0 = r1.collapseAnimationListeners
            r0.add(r2)
            return
    }

    public final void addExpandAnimationListener(@androidx.annotation.NonNull android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            java.util.Set<android.animation.AnimatorListenerAdapter> r0 = r1.expandAnimationListeners
            r0.add(r2)
            return
    }

    public final void addOnLoadAnimationCallback(com.google.android.material.search.SearchBar.OnLoadAnimationCallback r2) {
            r1 = this;
            java.util.Set<com.google.android.material.search.SearchBar$OnLoadAnimationCallback> r0 = r1.onLoadAnimationCallbacks
            r0.add(r2)
            return
    }

    public final boolean isCollapsing() {
            r1 = this;
            boolean r0 = r1.collapsing
            return r0
    }

    public final boolean isExpanding() {
            r1 = this;
            boolean r0 = r1.expanding
            return r0
    }

    public final boolean isOnLoadAnimationFadeInEnabled() {
            r1 = this;
            boolean r0 = r1.onLoadAnimationFadeInEnabled
            return r0
    }

    public final boolean removeCollapseAnimationListener(@androidx.annotation.NonNull android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            java.util.Set<android.animation.AnimatorListenerAdapter> r0 = r1.collapseAnimationListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    public final boolean removeExpandAnimationListener(@androidx.annotation.NonNull android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            java.util.Set<android.animation.AnimatorListenerAdapter> r0 = r1.expandAnimationListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    public final boolean removeOnLoadAnimationCallback(com.google.android.material.search.SearchBar.OnLoadAnimationCallback r2) {
            r1 = this;
            java.util.Set<com.google.android.material.search.SearchBar$OnLoadAnimationCallback> r0 = r1.onLoadAnimationCallbacks
            boolean r2 = r0.remove(r2)
            return r2
    }

    public final void setOnLoadAnimationFadeInEnabled(boolean r1) {
            r0 = this;
            r0.onLoadAnimationFadeInEnabled = r1
            return
    }

    public final void startCollapseAnimation(com.google.android.material.search.SearchBar r4, android.view.View r5, @androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout r6, boolean r7) {
            r3 = this;
            boolean r0 = r3.expanding
            if (r0 == 0) goto Lb
            android.animation.Animator r0 = r3.runningExpandOrCollapseAnimator
            if (r0 == 0) goto Lb
            r0.cancel()
        Lb:
            r0 = 1
            r3.collapsing = r0
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.animation.Animator r5 = r3.getCollapseAnimator(r4, r5, r6)
            android.animation.Animator r4 = r3.getFadeInChildrenAnimator(r4)
            r6 = 2
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r2 = 0
            r6[r2] = r5
            r6[r0] = r4
            r1.playSequentially(r6)
            com.google.android.material.search.SearchBarAnimationHelper$5 r4 = new com.google.android.material.search.SearchBarAnimationHelper$5
            r4.<init>(r3)
            r1.addListener(r4)
            java.util.Set<android.animation.AnimatorListenerAdapter> r4 = r3.collapseAnimationListeners
            java.util.Iterator r4 = r4.iterator()
        L34:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r5 = r4.next()
            android.animation.AnimatorListenerAdapter r5 = (android.animation.AnimatorListenerAdapter) r5
            r1.addListener(r5)
            goto L34
        L44:
            if (r7 == 0) goto L4b
            r4 = 0
            r1.setDuration(r4)
        L4b:
            r1.start()
            r3.runningExpandOrCollapseAnimator = r1
            return
    }

    public final void startExpandAnimation(com.google.android.material.search.SearchBar r8, android.view.View r9, @androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout r10, boolean r11) {
            r7 = this;
            boolean r0 = r7.collapsing
            if (r0 == 0) goto Lb
            android.animation.Animator r0 = r7.runningExpandOrCollapseAnimator
            if (r0 == 0) goto Lb
            r0.cancel()
        Lb:
            r0 = 1
            r7.expanding = r0
            r0 = 4
            r9.setVisibility(r0)
            com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda3 r0 = new com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda3
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r9.post(r0)
            return
    }

    public final void startOnLoadAnimation(com.google.android.material.search.SearchBar r5) {
            r4 = this;
            com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda2 r0 = com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda2.INSTANCE
            r4.dispatchOnLoadAnimation(r0)
            android.widget.TextView r0 = r5.getTextView()
            android.view.View r1 = r5.getCenterView()
            android.view.View r5 = com.google.android.material.internal.ToolbarUtils.getSecondaryActionMenuItemView(r5)
            android.animation.Animator r2 = r4.getSecondaryViewAnimator(r0, r5)
            com.google.android.material.search.SearchBarAnimationHelper$1 r3 = new com.google.android.material.search.SearchBarAnimationHelper$1
            r3.<init>(r4)
            r2.addListener(r3)
            r4.secondaryViewAnimator = r2
            r3 = 0
            r0.setAlpha(r3)
            if (r5 == 0) goto L28
            r5.setAlpha(r3)
        L28:
            boolean r5 = r1 instanceof com.google.android.material.animation.AnimatableView
            if (r5 == 0) goto L37
            com.google.android.material.animation.AnimatableView r1 = (com.google.android.material.animation.AnimatableView) r1
            com.google.android.material.search.SearchBar$$ExternalSyntheticLambda0 r5 = new com.google.android.material.search.SearchBar$$ExternalSyntheticLambda0
            r5.<init>(r2)
            r1.startAnimation(r5)
            goto L55
        L37:
            if (r1 == 0) goto L52
            r1.setAlpha(r3)
            r5 = 0
            r1.setVisibility(r5)
            android.animation.Animator r5 = r4.getDefaultCenterViewAnimator(r1)
            r4.defaultCenterViewAnimator = r5
            com.google.android.material.search.SearchBarAnimationHelper$2 r0 = new com.google.android.material.search.SearchBarAnimationHelper$2
            r0.<init>(r1, r2)
            r5.addListener(r0)
            r5.start()
            goto L55
        L52:
            r2.start()
        L55:
            return
    }

    public final void stopOnLoadAnimation(com.google.android.material.search.SearchBar r2) {
            r1 = this;
            android.animation.Animator r0 = r1.secondaryViewAnimator
            if (r0 == 0) goto L7
            r0.end()
        L7:
            android.animation.Animator r0 = r1.defaultCenterViewAnimator
            if (r0 == 0) goto Le
            r0.end()
        Le:
            android.view.View r2 = r2.getCenterView()
            boolean r0 = r2 instanceof com.google.android.material.animation.AnimatableView
            if (r0 == 0) goto L1c
            r0 = r2
            com.google.android.material.animation.AnimatableView r0 = (com.google.android.material.animation.AnimatableView) r0
            r0.stopAnimation()
        L1c:
            if (r2 == 0) goto L22
            r0 = 0
            r2.setAlpha(r0)
        L22:
            return
    }
}
