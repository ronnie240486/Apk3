package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class FadeThroughUpdateListener implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final float[] alphas;

    @androidx.annotation.Nullable
    private final android.view.View fadeInView;

    @androidx.annotation.Nullable
    private final android.view.View fadeOutView;

    public FadeThroughUpdateListener(@androidx.annotation.Nullable android.view.View r1, @androidx.annotation.Nullable android.view.View r2) {
            r0 = this;
            r0.<init>()
            r0.fadeOutView = r1
            r0.fadeInView = r2
            r1 = 2
            float[] r1 = new float[r1]
            r0.alphas = r1
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@androidx.annotation.NonNull android.animation.ValueAnimator r3) {
            r2 = this;
            java.lang.Object r3 = r3.getAnimatedValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            float[] r0 = r2.alphas
            com.google.android.material.internal.FadeThroughUtils.calculateFadeOutAndInAlphas(r3, r0)
            android.view.View r3 = r2.fadeOutView
            if (r3 == 0) goto L1b
            float[] r0 = r2.alphas
            r1 = 0
            r0 = r0[r1]
            r3.setAlpha(r0)
        L1b:
            android.view.View r3 = r2.fadeInView
            if (r3 == 0) goto L27
            float[] r0 = r2.alphas
            r1 = 1
            r0 = r0[r1]
            r3.setAlpha(r0)
        L27:
            return
    }
}
