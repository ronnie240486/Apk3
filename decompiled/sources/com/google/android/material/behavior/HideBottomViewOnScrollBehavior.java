package com.google.android.material.behavior;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> {
    private static final int DEFAULT_ENTER_ANIMATION_DURATION_MS = 225;
    private static final int DEFAULT_EXIT_ANIMATION_DURATION_MS = 175;
    private static final int ENTER_ANIM_DURATION_ATTR = 0;
    private static final int ENTER_EXIT_ANIM_EASING_ATTR = 0;
    private static final int EXIT_ANIM_DURATION_ATTR = 0;
    public static final int STATE_SCROLLED_DOWN = 1;
    public static final int STATE_SCROLLED_UP = 2;
    private int additionalHiddenOffsetY;

    @androidx.annotation.Nullable
    private android.view.ViewPropertyAnimator currentAnimator;

    @com.google.android.material.behavior.HideBottomViewOnScrollBehavior.ScrollState
    private int currentState;
    private int enterAnimDuration;
    private android.animation.TimeInterpolator enterAnimInterpolator;
    private int exitAnimDuration;
    private android.animation.TimeInterpolator exitAnimInterpolator;
    private int height;

    @androidx.annotation.NonNull
    private final java.util.LinkedHashSet<com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener> onScrollStateChangedListeners;


    /* JADX INFO: loaded from: classes.dex */
    public interface OnScrollStateChangedListener {
        void onStateChanged(@androidx.annotation.NonNull android.view.View r1, @com.google.android.material.behavior.HideBottomViewOnScrollBehavior.ScrollState int r2);
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ScrollState {
    }

    static {
            int r0 = com.google.android.material.R.attr.motionDurationLong2
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior.ENTER_ANIM_DURATION_ATTR = r0
            int r0 = com.google.android.material.R.attr.motionDurationMedium4
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior.EXIT_ANIM_DURATION_ATTR = r0
            int r0 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior.ENTER_EXIT_ANIM_EASING_ATTR = r0
            return
    }

    public HideBottomViewOnScrollBehavior() {
            r2 = this;
            r2.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r2.onScrollStateChangedListeners = r0
            r0 = 0
            r2.height = r0
            r1 = 2
            r2.currentState = r1
            r2.additionalHiddenOffsetY = r0
            return
    }

    public HideBottomViewOnScrollBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.onScrollStateChangedListeners = r1
            r1 = 0
            r0.height = r1
            r2 = 2
            r0.currentState = r2
            r0.additionalHiddenOffsetY = r1
            return
    }

    public static /* synthetic */ void access$002(com.google.android.material.behavior.HideBottomViewOnScrollBehavior r1) {
            r0 = 0
            r1.currentAnimator = r0
            return
    }

    private void animateChildTo(@androidx.annotation.NonNull V r1, int r2, long r3, android.animation.TimeInterpolator r5) {
            r0 = this;
            android.view.ViewPropertyAnimator r1 = r1.animate()
            float r2 = (float) r2
            android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r5)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r3)
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior$1 r2 = new com.google.android.material.behavior.HideBottomViewOnScrollBehavior$1
            r2.<init>(r0)
            android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
            r0.currentAnimator = r1
            return
    }

    private void updateCurrentState(@androidx.annotation.NonNull V r3, @com.google.android.material.behavior.HideBottomViewOnScrollBehavior.ScrollState int r4) {
            r2 = this;
            r2.currentState = r4
            java.util.LinkedHashSet<com.google.android.material.behavior.HideBottomViewOnScrollBehavior$OnScrollStateChangedListener> r4 = r2.onScrollStateChangedListeners
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r4.next()
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior$OnScrollStateChangedListener r0 = (com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener) r0
            int r1 = r2.currentState
            r0.onStateChanged(r3, r1)
            goto L8
        L1a:
            return
    }

    public void addOnScrollStateChangedListener(@androidx.annotation.NonNull com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.behavior.HideBottomViewOnScrollBehavior$OnScrollStateChangedListener> r0 = r1.onScrollStateChangedListeners
            r0.add(r2)
            return
    }

    public void clearOnScrollStateChangedListeners() {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.behavior.HideBottomViewOnScrollBehavior$OnScrollStateChangedListener> r0 = r1.onScrollStateChangedListeners
            r0.clear()
            return
    }

    public boolean isScrolledDown() {
            r2 = this;
            int r0 = r2.currentState
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public boolean isScrolledUp() {
            r2 = this;
            int r0 = r2.currentState
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r4, @androidx.annotation.NonNull V r5, int r6) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r5.getMeasuredHeight()
            int r0 = r0.bottomMargin
            int r1 = r1 + r0
            r3.height = r1
            android.content.Context r0 = r5.getContext()
            int r1 = com.google.android.material.behavior.HideBottomViewOnScrollBehavior.ENTER_ANIM_DURATION_ATTR
            r2 = 225(0xe1, float:3.15E-43)
            int r0 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r0, r1, r2)
            r3.enterAnimDuration = r0
            android.content.Context r0 = r5.getContext()
            int r1 = com.google.android.material.behavior.HideBottomViewOnScrollBehavior.EXIT_ANIM_DURATION_ATTR
            r2 = 175(0xaf, float:2.45E-43)
            int r0 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r0, r1, r2)
            r3.exitAnimDuration = r0
            android.content.Context r0 = r5.getContext()
            int r1 = com.google.android.material.behavior.HideBottomViewOnScrollBehavior.ENTER_EXIT_ANIM_EASING_ATTR
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r0 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r0, r1, r2)
            r3.enterAnimInterpolator = r0
            android.content.Context r0 = r5.getContext()
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR
            android.animation.TimeInterpolator r0 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r0, r1, r2)
            r3.exitAnimInterpolator = r0
            boolean r4 = super.onLayoutChild(r4, r5, r6)
            return r4
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, int r4, int r5, int r6, int r7, int r8, @androidx.annotation.NonNull int[] r9) {
            r0 = this;
            if (r5 <= 0) goto L6
            r0.slideDown(r2)
            goto Lb
        L6:
            if (r5 >= 0) goto Lb
            r0.slideUp(r2)
        Lb:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, int r5, int r6) {
            r0 = this;
            r1 = 2
            if (r5 != r1) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            return r1
    }

    public void removeOnScrollStateChangedListener(@androidx.annotation.NonNull com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.behavior.HideBottomViewOnScrollBehavior$OnScrollStateChangedListener> r0 = r1.onScrollStateChangedListeners
            r0.remove(r2)
            return
    }

    public void setAdditionalHiddenOffsetY(@androidx.annotation.NonNull V r3, @androidx.annotation.Dimension int r4) {
            r2 = this;
            r2.additionalHiddenOffsetY = r4
            int r0 = r2.currentState
            r1 = 1
            if (r0 != r1) goto Le
            int r0 = r2.height
            int r0 = r0 + r4
            float r4 = (float) r0
            r3.setTranslationY(r4)
        Le:
            return
    }

    public void slideDown(@androidx.annotation.NonNull V r2) {
            r1 = this;
            r0 = 1
            r1.slideDown(r2, r0)
            return
    }

    public void slideDown(@androidx.annotation.NonNull V r9, boolean r10) {
            r8 = this;
            boolean r0 = r8.isScrolledDown()
            if (r0 == 0) goto L7
            return
        L7:
            android.view.ViewPropertyAnimator r0 = r8.currentAnimator
            if (r0 == 0) goto L11
            r0.cancel()
            r9.clearAnimation()
        L11:
            r0 = 1
            r8.updateCurrentState(r9, r0)
            int r0 = r8.height
            int r1 = r8.additionalHiddenOffsetY
            int r4 = r0 + r1
            if (r10 == 0) goto L28
            int r10 = r8.exitAnimDuration
            long r5 = (long) r10
            android.animation.TimeInterpolator r7 = r8.exitAnimInterpolator
            r2 = r8
            r3 = r9
            r2.animateChildTo(r3, r4, r5, r7)
            goto L2c
        L28:
            float r10 = (float) r4
            r9.setTranslationY(r10)
        L2c:
            return
    }

    public void slideUp(@androidx.annotation.NonNull V r2) {
            r1 = this;
            r0 = 1
            r1.slideUp(r2, r0)
            return
    }

    public void slideUp(@androidx.annotation.NonNull V r7, boolean r8) {
            r6 = this;
            boolean r0 = r6.isScrolledUp()
            if (r0 == 0) goto L7
            return
        L7:
            android.view.ViewPropertyAnimator r0 = r6.currentAnimator
            if (r0 == 0) goto L11
            r0.cancel()
            r7.clearAnimation()
        L11:
            r0 = 2
            r6.updateCurrentState(r7, r0)
            r0 = 0
            if (r8 == 0) goto L24
            int r8 = r6.enterAnimDuration
            long r3 = (long) r8
            android.animation.TimeInterpolator r5 = r6.enterAnimInterpolator
            r2 = 0
            r0 = r6
            r1 = r7
            r0.animateChildTo(r1, r2, r3, r5)
            goto L28
        L24:
            float r8 = (float) r0
            r7.setTranslationY(r8)
        L28:
            return
    }
}
