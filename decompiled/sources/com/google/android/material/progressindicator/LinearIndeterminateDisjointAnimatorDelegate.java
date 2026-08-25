package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes2.dex */
final class LinearIndeterminateDisjointAnimatorDelegate extends com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> {
    private static final android.util.Property<com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate, java.lang.Float> ANIMATION_FRACTION = null;
    private static final int[] DELAY_TO_MOVE_SEGMENT_ENDS = null;
    private static final int[] DURATION_TO_MOVE_SEGMENT_ENDS = null;
    private static final int TOTAL_DURATION_IN_MS = 1800;
    private float animationFraction;
    private android.animation.ObjectAnimator animator;
    public androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animatorCompleteCallback;
    private final com.google.android.material.progressindicator.BaseProgressIndicatorSpec baseSpec;
    private android.animation.ObjectAnimator completeEndAnimator;
    private boolean dirtyColors;
    private int indicatorColorIndex;
    private final android.view.animation.Interpolator[] interpolatorArray;




    static {
            r0 = 4
            int[] r1 = new int[r0]
            r1 = {x0018: FILL_ARRAY_DATA , data: [533, 567, 850, 750} // fill-array
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.DURATION_TO_MOVE_SEGMENT_ENDS = r1
            int[] r0 = new int[r0]
            r0 = {x0024: FILL_ARRAY_DATA , data: [1267, 1000, 333, 0} // fill-array
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.DELAY_TO_MOVE_SEGMENT_ENDS = r0
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$3 r0 = new com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$3
            r0.<init>()
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.ANIMATION_FRACTION = r0
            return
    }

    public LinearIndeterminateDisjointAnimatorDelegate(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull com.google.android.material.progressindicator.LinearProgressIndicatorSpec r5) {
            r3 = this;
            r0 = 2
            r3.<init>(r0)
            r1 = 0
            r3.indicatorColorIndex = r1
            r2 = 0
            r3.animatorCompleteCallback = r2
            r3.baseSpec = r5
            r5 = 4
            android.view.animation.Interpolator[] r5 = new android.view.animation.Interpolator[r5]
            int r2 = com.google.android.material.R.anim.linear_indeterminate_line1_head_interpolator
            android.view.animation.Interpolator r2 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r4, r2)
            r5[r1] = r2
            int r1 = com.google.android.material.R.anim.linear_indeterminate_line1_tail_interpolator
            android.view.animation.Interpolator r1 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r4, r1)
            r2 = 1
            r5[r2] = r1
            int r1 = com.google.android.material.R.anim.linear_indeterminate_line2_head_interpolator
            android.view.animation.Interpolator r1 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r4, r1)
            r5[r0] = r1
            int r0 = com.google.android.material.R.anim.linear_indeterminate_line2_tail_interpolator
            android.view.animation.Interpolator r4 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r4, r0)
            r0 = 3
            r5[r0] = r4
            r3.interpolatorArray = r5
            return
    }

    public static /* synthetic */ int access$000(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0) {
            int r0 = r0.indicatorColorIndex
            return r0
    }

    public static /* synthetic */ int access$002(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0, int r1) {
            r0.indicatorColorIndex = r1
            return r1
    }

    public static /* synthetic */ com.google.android.material.progressindicator.BaseProgressIndicatorSpec access$100(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0) {
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r0.baseSpec
            return r0
    }

    public static /* synthetic */ void access$202(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r1) {
            r0 = 1
            r1.dirtyColors = r0
            return
    }

    public static /* synthetic */ float access$300(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0) {
            float r0 = r0.getAnimationFraction()
            return r0
    }

    private float getAnimationFraction() {
            r1 = this;
            float r0 = r1.animationFraction
            return r0
    }

    private void maybeInitializeAnimators() {
            r7 = this;
            android.animation.ObjectAnimator r0 = r7.animator
            r1 = 0
            r2 = 1800(0x708, double:8.893E-321)
            if (r0 != 0) goto L2d
            android.util.Property<com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate, java.lang.Float> r0 = com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.ANIMATION_FRACTION
            r4 = 2
            float[] r4 = new float[r4]
            r4 = {x0054: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r0, r4)
            r7.animator = r0
            r0.setDuration(r2)
            android.animation.ObjectAnimator r0 = r7.animator
            r0.setInterpolator(r1)
            android.animation.ObjectAnimator r0 = r7.animator
            r4 = -1
            r0.setRepeatCount(r4)
            android.animation.ObjectAnimator r0 = r7.animator
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$1 r4 = new com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$1
            r4.<init>(r7)
            r0.addListener(r4)
        L2d:
            android.animation.ObjectAnimator r0 = r7.completeEndAnimator
            if (r0 != 0) goto L53
            android.util.Property<com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate, java.lang.Float> r0 = com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.ANIMATION_FRACTION
            r4 = 1
            float[] r4 = new float[r4]
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r4[r5] = r6
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r0, r4)
            r7.completeEndAnimator = r0
            r0.setDuration(r2)
            android.animation.ObjectAnimator r0 = r7.completeEndAnimator
            r0.setInterpolator(r1)
            android.animation.ObjectAnimator r0 = r7.completeEndAnimator
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$2 r1 = new com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$2
            r1.<init>(r7)
            r0.addListener(r1)
        L53:
            return
    }

    private void maybeUpdateSegmentColors() {
            r3 = this;
            boolean r0 = r3.dirtyColors
            if (r0 == 0) goto L1e
            int[] r0 = r3.segmentColors
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r3.baseSpec
            int[] r1 = r1.indicatorColors
            int r2 = r3.indicatorColorIndex
            r1 = r1[r2]
            com.google.android.material.progressindicator.IndeterminateDrawable r2 = r3.drawable
            int r2 = r2.getAlpha()
            int r1 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r1, r2)
            java.util.Arrays.fill(r0, r1)
            r0 = 0
            r3.dirtyColors = r0
        L1e:
            return
    }

    private void updateSegmentPositions(int r6) {
            r5 = this;
            r0 = 0
        L1:
            r1 = 4
            if (r0 >= r1) goto L2b
            int[] r1 = com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.DELAY_TO_MOVE_SEGMENT_ENDS
            r1 = r1[r0]
            int[] r2 = com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.DURATION_TO_MOVE_SEGMENT_ENDS
            r2 = r2[r0]
            int r1 = r6 - r1
            float r1 = (float) r1
            float r2 = (float) r2
            float r1 = r1 / r2
            android.view.animation.Interpolator[] r2 = r5.interpolatorArray
            r2 = r2[r0]
            float r1 = r2.getInterpolation(r1)
            float[] r2 = r5.segmentPositions
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r4, r1)
            float r1 = java.lang.Math.max(r3, r1)
            r2[r0] = r1
            int r0 = r0 + 1
            goto L1
        L2b:
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void cancelAnimatorImmediately() {
            r1 = this;
            android.animation.ObjectAnimator r0 = r1.animator
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
            r0 = this;
            r0.resetPropertiesForNewStart()
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(@androidx.annotation.NonNull androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1) {
            r0 = this;
            r0.animatorCompleteCallback = r1
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void requestCancelAnimatorAfterCurrentCycle() {
            r4 = this;
            android.animation.ObjectAnimator r0 = r4.completeEndAnimator
            if (r0 == 0) goto L3a
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto Lb
            goto L3a
        Lb:
            r4.cancelAnimatorImmediately()
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = r4.drawable
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L3a
            android.animation.ObjectAnimator r0 = r4.completeEndAnimator
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            float r3 = r4.animationFraction
            r1[r2] = r3
            r2 = 1
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            r0.setFloatValues(r1)
            android.animation.ObjectAnimator r0 = r4.completeEndAnimator
            r1 = 1155596288(0x44e10000, float:1800.0)
            float r2 = r4.animationFraction
            float r3 = r3 - r2
            float r3 = r3 * r1
            long r1 = (long) r3
            r0.setDuration(r1)
            android.animation.ObjectAnimator r0 = r4.completeEndAnimator
            r0.start()
        L3a:
            return
    }

    @androidx.annotation.VisibleForTesting
    public final void resetPropertiesForNewStart() {
            r3 = this;
            r0 = 0
            r3.indicatorColorIndex = r0
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r3.baseSpec
            int[] r1 = r1.indicatorColors
            r1 = r1[r0]
            com.google.android.material.progressindicator.IndeterminateDrawable r2 = r3.drawable
            int r2 = r2.getAlpha()
            int r1 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r1, r2)
            int[] r2 = r3.segmentColors
            r2[r0] = r1
            r0 = 1
            r2[r0] = r1
            return
    }

    @androidx.annotation.VisibleForTesting
    public final void setAnimationFraction(float r2) {
            r1 = this;
            r1.animationFraction = r2
            r0 = 1155596288(0x44e10000, float:1800.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            r1.updateSegmentPositions(r2)
            r1.maybeUpdateSegmentColors()
            com.google.android.material.progressindicator.IndeterminateDrawable r2 = r1.drawable
            r2.invalidateSelf()
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void startAnimator() {
            r1 = this;
            r1.maybeInitializeAnimators()
            r1.resetPropertiesForNewStart()
            android.animation.ObjectAnimator r0 = r1.animator
            r0.start()
            return
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
            r1 = this;
            r0 = 0
            r1.animatorCompleteCallback = r0
            return
    }
}
