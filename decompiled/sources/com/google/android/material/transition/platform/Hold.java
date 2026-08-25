package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(21)
public final class Hold extends android.transition.Visibility {
    public Hold() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.transition.Visibility
    @androidx.annotation.NonNull
    public android.animation.Animator onAppear(@androidx.annotation.NonNull android.view.ViewGroup r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable android.transition.TransitionValues r3, @androidx.annotation.Nullable android.transition.TransitionValues r4) {
            r0 = this;
            r1 = 1
            float[] r1 = new float[r1]
            r2 = 0
            r3 = 0
            r1[r2] = r3
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            return r1
    }

    @Override // android.transition.Visibility
    @androidx.annotation.NonNull
    public android.animation.Animator onDisappear(@androidx.annotation.NonNull android.view.ViewGroup r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable android.transition.TransitionValues r3, @androidx.annotation.Nullable android.transition.TransitionValues r4) {
            r0 = this;
            r1 = 1
            float[] r1 = new float[r1]
            r2 = 0
            r3 = 0
            r1[r2] = r3
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            return r1
    }
}
