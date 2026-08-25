package com.google.android.material.progressindicator;

import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* JADX INFO: loaded from: classes2.dex */
public final class IndeterminateDrawable<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> extends com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange {
    private com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> animatorDelegate;
    private com.google.android.material.progressindicator.DrawingDelegate<S> drawingDelegate;

    public IndeterminateDrawable(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2, @androidx.annotation.NonNull com.google.android.material.progressindicator.DrawingDelegate<S> r3, @androidx.annotation.NonNull com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.drawingDelegate = r3
            r3.drawable = r0
            r0.animatorDelegate = r4
            r4.drawable = r0
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.progressindicator.IndeterminateDrawable<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> createCircularDrawable(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull com.google.android.material.progressindicator.CircularProgressIndicatorSpec r4) {
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = new com.google.android.material.progressindicator.IndeterminateDrawable
            com.google.android.material.progressindicator.CircularDrawingDelegate r1 = new com.google.android.material.progressindicator.CircularDrawingDelegate
            r1.<init>(r4)
            com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate r2 = new com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate
            r2.<init>(r4)
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.progressindicator.IndeterminateDrawable<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> createLinearDrawable(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull com.google.android.material.progressindicator.LinearProgressIndicatorSpec r4) {
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = new com.google.android.material.progressindicator.IndeterminateDrawable
            com.google.android.material.progressindicator.LinearDrawingDelegate r1 = new com.google.android.material.progressindicator.LinearDrawingDelegate
            r1.<init>(r4)
            int r2 = r4.indeterminateAnimationType
            if (r2 != 0) goto L11
            com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate r2 = new com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate
            r2.<init>(r4)
            goto L16
        L11:
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r2 = new com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate
            r2.<init>(r3, r4)
        L16:
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
            r0 = this;
            super.clearAnimationCallbacks()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r11) {
            r10 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r1 = r10.getBounds()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L5a
            boolean r1 = r10.isVisible()
            if (r1 == 0) goto L5a
            boolean r0 = r11.getClipBounds(r0)
            if (r0 != 0) goto L1c
            goto L5a
        L1c:
            r11.save()
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r10.drawingDelegate
            android.graphics.Rect r1 = r10.getBounds()
            float r2 = r10.getGrowFraction()
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r3 = r0.spec
            r3.validateSpec()
            r0.adjustCanvas(r11, r1, r2)
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r10.drawingDelegate
            android.graphics.Paint r1 = r10.paint
            r0.fillTrack(r11, r1)
            r0 = 0
        L39:
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r1 = r10.animatorDelegate
            int[] r2 = r1.segmentColors
            int r3 = r2.length
            if (r0 >= r3) goto L57
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r4 = r10.drawingDelegate
            android.graphics.Paint r6 = r10.paint
            float[] r1 = r1.segmentPositions
            int r3 = r0 * 2
            r7 = r1[r3]
            int r3 = r3 + 1
            r8 = r1[r3]
            r9 = r2[r0]
            r5 = r11
            r4.fillIndicator(r5, r6, r7, r8, r9)
            int r0 = r0 + 1
            goto L39
        L57:
            r11.restore()
        L5a:
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
            r1 = this;
            int r0 = super.getAlpha()
            return r0
    }

    @androidx.annotation.NonNull
    public final com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> getAnimatorDelegate() {
            r1 = this;
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r0 = r1.animatorDelegate
            return r0
    }

    @androidx.annotation.NonNull
    public final com.google.android.material.progressindicator.DrawingDelegate<S> getDrawingDelegate() {
            r1 = this;
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r1.drawingDelegate
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r1.drawingDelegate
            int r0 = r0.getPreferredHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            com.google.android.material.progressindicator.DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> r0 = r1.drawingDelegate
            int r0 = r0.getPreferredWidth()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
            r1 = this;
            int r0 = super.getOpacity()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean hideNow() {
            r1 = this;
            boolean r0 = super.hideNow()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isHiding() {
            r1 = this;
            boolean r0 = super.isHiding()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
            r1 = this;
            boolean r0 = super.isRunning()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isShowing() {
            r1 = this;
            boolean r0 = super.isShowing()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void registerAnimationCallback(@androidx.annotation.NonNull androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1) {
            r0 = this;
            super.registerAnimationCallback(r1)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int r1) {
            r0 = this;
            super.setAlpha(r1)
            return
    }

    public final void setAnimatorDelegate(@androidx.annotation.NonNull com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r1) {
            r0 = this;
            r0.animatorDelegate = r1
            r1.drawable = r0
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@androidx.annotation.Nullable android.graphics.ColorFilter r1) {
            r0 = this;
            super.setColorFilter(r1)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean r1, boolean r2) {
            r0 = this;
            boolean r1 = super.setVisible(r1, r2)
            return r1
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean setVisible(boolean r1, boolean r2, boolean r3) {
            r0 = this;
            boolean r1 = super.setVisible(r1, r2, r3)
            return r1
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final boolean setVisibleInternal(boolean r3, boolean r4, boolean r5) {
            r2 = this;
            boolean r4 = super.setVisibleInternal(r3, r4, r5)
            boolean r0 = r2.isRunning()
            if (r0 != 0) goto Lf
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r0 = r2.animatorDelegate
            r0.cancelAnimatorImmediately()
        Lf:
            com.google.android.material.progressindicator.AnimatorDurationScaleProvider r0 = r2.animatorDurationScaleProvider
            android.content.Context r1 = r2.context
            android.content.ContentResolver r1 = r1.getContentResolver()
            float r0 = r0.getSystemAnimatorDurationScale(r1)
            if (r3 == 0) goto L2f
            if (r5 != 0) goto L2a
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 22
            if (r3 > r5) goto L2f
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2f
        L2a:
            com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> r3 = r2.animatorDelegate
            r3.startAnimator()
        L2f:
            return r4
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
            r0 = this;
            super.start()
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
            r0 = this;
            super.stop()
            return
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(@androidx.annotation.NonNull androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1) {
            r0 = this;
            boolean r1 = super.unregisterAnimationCallback(r1)
            return r1
    }
}
