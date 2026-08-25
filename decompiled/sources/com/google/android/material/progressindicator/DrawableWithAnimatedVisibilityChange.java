package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes2.dex */
abstract class DrawableWithAnimatedVisibilityChange extends android.graphics.drawable.Drawable implements androidx.vectordrawable.graphics.drawable.Animatable2Compat {
    private static final boolean DEFAULT_DRAWABLE_RESTART = false;
    private static final int GROW_DURATION = 500;
    private static final android.util.Property<com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, java.lang.Float> GROW_FRACTION = null;
    private java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> animationCallbacks;
    public com.google.android.material.progressindicator.AnimatorDurationScaleProvider animatorDurationScaleProvider;
    public final com.google.android.material.progressindicator.BaseProgressIndicatorSpec baseSpec;
    public final android.content.Context context;
    private float growFraction;
    private android.animation.ValueAnimator hideAnimator;
    private boolean ignoreCallbacks;
    private androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback internalAnimationCallback;
    private float mockGrowFraction;
    private boolean mockHideAnimationRunning;
    private boolean mockShowAnimationRunning;
    public final android.graphics.Paint paint;
    private android.animation.ValueAnimator showAnimator;
    private int totalAlpha;




    static {
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$3 r0 = new com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$3
            r0.<init>()
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.GROW_FRACTION = r0
            return
    }

    public DrawableWithAnimatedVisibilityChange(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.google.android.material.progressindicator.BaseProgressIndicatorSpec r3) {
            r1 = this;
            r1.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.paint = r0
            r1.context = r2
            r1.baseSpec = r3
            com.google.android.material.progressindicator.AnimatorDurationScaleProvider r2 = new com.google.android.material.progressindicator.AnimatorDurationScaleProvider
            r2.<init>()
            r1.animatorDurationScaleProvider = r2
            r2 = 255(0xff, float:3.57E-43)
            r1.setAlpha(r2)
            return
    }

    public static /* synthetic */ void access$000(com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r0) {
            r0.dispatchAnimationStart()
            return
    }

    public static /* synthetic */ boolean access$101(com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r1) {
            r0 = 0
            boolean r1 = super.setVisible(r0, r0)
            return r1
    }

    public static /* synthetic */ void access$200(com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r0) {
            r0.dispatchAnimationEnd()
            return
    }

    private void cancelAnimatorsWithoutCallbacks(@androidx.annotation.NonNull android.animation.ValueAnimator... r5) {
            r4 = this;
            boolean r0 = r4.ignoreCallbacks
            r1 = 1
            r4.ignoreCallbacks = r1
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L11
            r3 = r5[r2]
            r3.cancel()
            int r2 = r2 + 1
            goto L7
        L11:
            r4.ignoreCallbacks = r0
            return
    }

    private void dispatchAnimationEnd() {
            r2 = this;
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r0 = r2.internalAnimationCallback
            if (r0 == 0) goto L7
            r0.onAnimationEnd(r2)
        L7:
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r2.animationCallbacks
            if (r0 == 0) goto L23
            boolean r1 = r2.ignoreCallbacks
            if (r1 != 0) goto L23
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r1 = (androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback) r1
            r1.onAnimationEnd(r2)
            goto L13
        L23:
            return
    }

    private void dispatchAnimationStart() {
            r2 = this;
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r0 = r2.internalAnimationCallback
            if (r0 == 0) goto L7
            r0.onAnimationStart(r2)
        L7:
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r2.animationCallbacks
            if (r0 == 0) goto L23
            boolean r1 = r2.ignoreCallbacks
            if (r1 != 0) goto L23
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r1 = (androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback) r1
            r1.onAnimationStart(r2)
            goto L13
        L23:
            return
    }

    private void endAnimatorsWithoutCallbacks(@androidx.annotation.NonNull android.animation.ValueAnimator... r5) {
            r4 = this;
            boolean r0 = r4.ignoreCallbacks
            r1 = 1
            r4.ignoreCallbacks = r1
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L11
            r3 = r5[r2]
            r3.end()
            int r2 = r2 + 1
            goto L7
        L11:
            r4.ignoreCallbacks = r0
            return
    }

    private void maybeInitializeAnimators() {
            r5 = this;
            android.animation.ValueAnimator r0 = r5.showAnimator
            r1 = 500(0x1f4, double:2.47E-321)
            r3 = 2
            if (r0 != 0) goto L23
            android.util.Property<com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, java.lang.Float> r0 = com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.GROW_FRACTION
            float[] r4 = new float[r3]
            r4 = {x0044: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r5, r0, r4)
            r5.showAnimator = r0
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r5.showAnimator
            android.animation.TimeInterpolator r4 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            r0.setInterpolator(r4)
            android.animation.ValueAnimator r0 = r5.showAnimator
            r5.setShowAnimator(r0)
        L23:
            android.animation.ValueAnimator r0 = r5.hideAnimator
            if (r0 != 0) goto L43
            android.util.Property<com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, java.lang.Float> r0 = com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.GROW_FRACTION
            float[] r3 = new float[r3]
            r3 = {x004c: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r5, r0, r3)
            r5.hideAnimator = r0
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r5.hideAnimator
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r5.hideAnimator
            r5.setHideAnimator(r0)
        L43:
            return
    }

    private void setHideAnimator(@androidx.annotation.NonNull android.animation.ValueAnimator r2) {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.hideAnimator
            if (r0 == 0) goto L13
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto Lb
            goto L13
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot set hideAnimator while the current hideAnimator is running."
            r2.<init>(r0)
            throw r2
        L13:
            r1.hideAnimator = r2
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$2 r0 = new com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$2
            r0.<init>(r1)
            r2.addListener(r0)
            return
    }

    private void setShowAnimator(@androidx.annotation.NonNull android.animation.ValueAnimator r2) {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.showAnimator
            if (r0 == 0) goto L13
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto Lb
            goto L13
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot set showAnimator while the current showAnimator is running."
            r2.<init>(r0)
            throw r2
        L13:
            r1.showAnimator = r2
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$1 r0 = new com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$1
            r0.<init>(r1)
            r2.addListener(r0)
            return
    }

    public void clearAnimationCallbacks() {
            r1 = this;
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.animationCallbacks
            r0.clear()
            r0 = 0
            r1.animationCallbacks = r0
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            int r0 = r1.totalAlpha
            return r0
    }

    public final float getGrowFraction() {
            r1 = this;
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.baseSpec
            boolean r0 = r0.isShowAnimationEnabled()
            if (r0 != 0) goto L13
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.baseSpec
            boolean r0 = r0.isHideAnimationEnabled()
            if (r0 != 0) goto L13
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        L13:
            boolean r0 = r1.mockHideAnimationRunning
            if (r0 != 0) goto L1f
            boolean r0 = r1.mockShowAnimationRunning
            if (r0 == 0) goto L1c
            goto L1f
        L1c:
            float r0 = r1.growFraction
            return r0
        L1f:
            float r0 = r1.mockGrowFraction
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    public boolean hideNow() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.setVisible(r0, r0, r0)
            return r0
    }

    public boolean isHiding() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.hideAnimator
            if (r0 == 0) goto La
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto Le
        La:
            boolean r0 = r1.mockHideAnimationRunning
            if (r0 == 0) goto L10
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public boolean isRunning() {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 != 0) goto Lf
            boolean r0 = r1.isHiding()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    public boolean isShowing() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.showAnimator
            if (r0 == 0) goto La
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto Le
        La:
            boolean r0 = r1.mockShowAnimationRunning
            if (r0 == 0) goto L10
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public void registerAnimationCallback(@androidx.annotation.NonNull androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r2) {
            r1 = this;
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.animationCallbacks
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.animationCallbacks = r0
        Lb:
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.animationCallbacks
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L18
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.animationCallbacks
            r0.add(r2)
        L18:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r1) {
            r0 = this;
            r0.totalAlpha = r1
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@androidx.annotation.Nullable android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.paint
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }

    public final void setGrowFraction(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r2) {
            r1 = this;
            float r0 = r1.growFraction
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.growFraction = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            r0 = 1
            boolean r2 = r1.setVisible(r2, r3, r0)
            return r2
    }

    public boolean setVisible(boolean r3, boolean r4, boolean r5) {
            r2 = this;
            com.google.android.material.progressindicator.AnimatorDurationScaleProvider r0 = r2.animatorDurationScaleProvider
            android.content.Context r1 = r2.context
            android.content.ContentResolver r1 = r1.getContentResolver()
            float r0 = r0.getSystemAnimatorDurationScale(r1)
            if (r5 == 0) goto L15
            r5 = 0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            boolean r3 = r2.setVisibleInternal(r3, r4, r5)
            return r3
    }

    public boolean setVisibleInternal(boolean r5, boolean r6, boolean r7) {
            r4 = this;
            r4.maybeInitializeAnimators()
            boolean r0 = r4.isVisible()
            r1 = 0
            if (r0 != 0) goto Ld
            if (r5 != 0) goto Ld
            return r1
        Ld:
            if (r5 == 0) goto L12
            android.animation.ValueAnimator r0 = r4.showAnimator
            goto L14
        L12:
            android.animation.ValueAnimator r0 = r4.hideAnimator
        L14:
            if (r5 == 0) goto L19
            android.animation.ValueAnimator r2 = r4.hideAnimator
            goto L1b
        L19:
            android.animation.ValueAnimator r2 = r4.showAnimator
        L1b:
            r3 = 1
            if (r7 != 0) goto L41
            boolean r6 = r2.isRunning()
            if (r6 == 0) goto L2b
            android.animation.ValueAnimator[] r6 = new android.animation.ValueAnimator[r3]
            r6[r1] = r2
            r4.cancelAnimatorsWithoutCallbacks(r6)
        L2b:
            boolean r6 = r0.isRunning()
            if (r6 == 0) goto L35
            r0.end()
            goto L3c
        L35:
            android.animation.ValueAnimator[] r6 = new android.animation.ValueAnimator[r3]
            r6[r1] = r0
            r4.endAnimatorsWithoutCallbacks(r6)
        L3c:
            boolean r5 = super.setVisible(r5, r1)
            return r5
        L41:
            if (r7 == 0) goto L4a
            boolean r7 = r0.isRunning()
            if (r7 == 0) goto L4a
            return r1
        L4a:
            if (r5 == 0) goto L55
            boolean r7 = super.setVisible(r5, r1)
            if (r7 == 0) goto L53
            goto L55
        L53:
            r7 = 0
            goto L56
        L55:
            r7 = 1
        L56:
            if (r5 == 0) goto L5f
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r5 = r4.baseSpec
            boolean r5 = r5.isShowAnimationEnabled()
            goto L65
        L5f:
            com.google.android.material.progressindicator.BaseProgressIndicatorSpec r5 = r4.baseSpec
            boolean r5 = r5.isHideAnimationEnabled()
        L65:
            if (r5 != 0) goto L6f
            android.animation.ValueAnimator[] r5 = new android.animation.ValueAnimator[r3]
            r5[r1] = r0
            r4.endAnimatorsWithoutCallbacks(r5)
            return r7
        L6f:
            if (r6 != 0) goto L7c
            boolean r5 = r0.isPaused()
            if (r5 != 0) goto L78
            goto L7c
        L78:
            r0.resume()
            goto L7f
        L7c:
            r0.start()
        L7f:
            return r7
    }

    public void start() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.setVisibleInternal(r0, r0, r1)
            return
    }

    public void stop() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.setVisibleInternal(r0, r1, r0)
            return
    }

    public boolean unregisterAnimationCallback(@androidx.annotation.NonNull androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r2) {
            r1 = this;
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.animationCallbacks
            if (r0 == 0) goto L1c
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L1c
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.animationCallbacks
            r0.remove(r2)
            java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r2 = r1.animationCallbacks
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1a
            r2 = 0
            r1.animationCallbacks = r2
        L1a:
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }
}
