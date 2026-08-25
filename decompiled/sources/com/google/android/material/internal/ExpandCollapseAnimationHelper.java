package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class ExpandCollapseAnimationHelper {

    @androidx.annotation.Nullable
    private android.animation.ValueAnimator.AnimatorUpdateListener additionalUpdateListener;
    private final android.view.View collapsedView;
    private int collapsedViewOffsetY;
    private long duration;
    private final java.util.List<android.view.View> endAnchoredViews;
    private final android.view.View expandedView;
    private int expandedViewOffsetY;
    private final java.util.List<android.animation.AnimatorListenerAdapter> listeners;



    public static /* synthetic */ void $r8$lambda$PhjrFv1MAxh6Fwygg9NCQItD7gQ(com.google.android.material.internal.ExpandCollapseAnimationHelper r0, android.graphics.Rect r1, android.animation.ValueAnimator r2) {
            r0.lambda$getExpandCollapseAnimator$0(r1, r2)
            return
    }

    public ExpandCollapseAnimationHelper(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.view.View r2) {
            r0 = this;
            r0.<init>()
            r0.collapsedView = r1
            r0.expandedView = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.listeners = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.endAnchoredViews = r1
            return
    }

    public static /* synthetic */ android.view.View access$000(com.google.android.material.internal.ExpandCollapseAnimationHelper r0) {
            android.view.View r0 = r0.expandedView
            return r0
    }

    private void addListeners(android.animation.Animator r2, java.util.List<android.animation.AnimatorListenerAdapter> r3) {
            r1 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r3.next()
            android.animation.AnimatorListenerAdapter r0 = (android.animation.AnimatorListenerAdapter) r0
            r2.addListener(r0)
            goto L4
        L14:
            return
    }

    private android.animation.AnimatorSet getAnimatorSet(boolean r5) {
            r4 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r1 = 3
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            android.animation.Animator r2 = r4.getExpandCollapseAnimator(r5)
            r3 = 0
            r1[r3] = r2
            android.animation.Animator r2 = r4.getExpandedViewChildrenAlphaAnimator(r5)
            r3 = 1
            r1[r3] = r2
            android.animation.Animator r5 = r4.getEndAnchoredViewsTranslateAnimator(r5)
            r2 = 2
            r1[r2] = r5
            r0.playTogether(r1)
            return r0
    }

    private android.animation.Animator getEndAnchoredViewsTranslateAnimator(boolean r4) {
            r3 = this;
            android.view.View r0 = r3.expandedView
            int r0 = r0.getLeft()
            android.view.View r1 = r3.collapsedView
            int r1 = r1.getLeft()
            int r0 = r0 - r1
            android.view.View r1 = r3.collapsedView
            int r1 = r1.getRight()
            android.view.View r2 = r3.expandedView
            int r2 = r2.getRight()
            int r1 = r1 - r2
            int r1 = r1 + r0
            r0 = 2
            float[] r0 = new float[r0]
            float r1 = (float) r1
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r2 = 0
            r0[r1] = r2
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            java.util.List<android.view.View> r1 = r3.endAnchoredViews
            com.google.android.material.internal.MultiViewUpdateListener r1 = com.google.android.material.internal.MultiViewUpdateListener.translationXListener(r1)
            r0.addUpdateListener(r1)
            long r1 = r3.duration
            r0.setDuration(r1)
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r4 = com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(r4, r1)
            r0.setInterpolator(r4)
            return r0
    }

    private android.animation.Animator getExpandCollapseAnimator(boolean r8) {
            r7 = this;
            android.view.View r0 = r7.collapsedView
            int r1 = r7.collapsedViewOffsetY
            android.graphics.Rect r0 = com.google.android.material.internal.ViewUtils.calculateRectFromBounds(r0, r1)
            android.view.View r1 = r7.expandedView
            int r2 = r7.expandedViewOffsetY
            android.graphics.Rect r1 = com.google.android.material.internal.ViewUtils.calculateRectFromBounds(r1, r2)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r0)
            com.google.android.material.internal.RectEvaluator r3 = new com.google.android.material.internal.RectEvaluator
            r3.<init>(r2)
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofObject(r3, r5)
            com.google.android.material.appbar.AppBarLayout$$ExternalSyntheticLambda0 r1 = new com.google.android.material.appbar.AppBarLayout$$ExternalSyntheticLambda0
            r1.<init>(r7, r2, r4)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator$AnimatorUpdateListener r1 = r7.additionalUpdateListener
            if (r1 == 0) goto L36
            r0.addUpdateListener(r1)
        L36:
            long r1 = r7.duration
            r0.setDuration(r1)
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r8 = com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(r8, r1)
            r0.setInterpolator(r8)
            return r0
    }

    private android.animation.Animator getExpandedViewChildrenAlphaAnimator(boolean r5) {
            r4 = this;
            android.view.View r0 = r4.expandedView
            java.util.List r0 = com.google.android.material.internal.ViewUtils.getChildren(r0)
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x0026: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            com.google.android.material.internal.MultiViewUpdateListener r0 = com.google.android.material.internal.MultiViewUpdateListener.alphaListener(r0)
            r1.addUpdateListener(r0)
            long r2 = r4.duration
            r1.setDuration(r2)
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            android.animation.TimeInterpolator r5 = com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(r5, r0)
            r1.setInterpolator(r5)
            return r1
    }

    private /* synthetic */ void lambda$getExpandCollapseAnimator$0(android.graphics.Rect r1, android.animation.ValueAnimator r2) {
            r0 = this;
            android.view.View r2 = r0.expandedView
            com.google.android.material.internal.ViewUtils.setBoundsFromRect(r2, r1)
            return
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.ExpandCollapseAnimationHelper addEndAnchoredViews(@androidx.annotation.NonNull java.util.Collection<android.view.View> r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.endAnchoredViews
            r0.addAll(r2)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.ExpandCollapseAnimationHelper addEndAnchoredViews(@androidx.annotation.NonNull android.view.View... r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.endAnchoredViews
            java.util.Collections.addAll(r0, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.ExpandCollapseAnimationHelper addListener(@androidx.annotation.NonNull android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            java.util.List<android.animation.AnimatorListenerAdapter> r0 = r1.listeners
            r0.add(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public android.animation.Animator getCollapseAnimator() {
            r2 = this;
            r0 = 0
            android.animation.AnimatorSet r0 = r2.getAnimatorSet(r0)
            com.google.android.material.internal.ExpandCollapseAnimationHelper$2 r1 = new com.google.android.material.internal.ExpandCollapseAnimationHelper$2
            r1.<init>(r2)
            r0.addListener(r1)
            java.util.List<android.animation.AnimatorListenerAdapter> r1 = r2.listeners
            r2.addListeners(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public android.animation.Animator getExpandAnimator() {
            r2 = this;
            r0 = 1
            android.animation.AnimatorSet r0 = r2.getAnimatorSet(r0)
            com.google.android.material.internal.ExpandCollapseAnimationHelper$1 r1 = new com.google.android.material.internal.ExpandCollapseAnimationHelper$1
            r1.<init>(r2)
            r0.addListener(r1)
            java.util.List<android.animation.AnimatorListenerAdapter> r1 = r2.listeners
            r2.addListeners(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.ExpandCollapseAnimationHelper setAdditionalUpdateListener(@androidx.annotation.Nullable android.animation.ValueAnimator.AnimatorUpdateListener r1) {
            r0 = this;
            r0.additionalUpdateListener = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.ExpandCollapseAnimationHelper setCollapsedViewOffsetY(int r1) {
            r0 = this;
            r0.collapsedViewOffsetY = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.ExpandCollapseAnimationHelper setDuration(long r1) {
            r0 = this;
            r0.duration = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.ExpandCollapseAnimationHelper setExpandedViewOffsetY(int r1) {
            r0 = this;
            r0.expandedViewOffsetY = r1
            return r0
    }
}
