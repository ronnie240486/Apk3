package com.google.android.material.transition;

/* JADX INFO: loaded from: classes.dex */
public interface VisibilityAnimatorProvider {
    @androidx.annotation.Nullable
    android.animation.Animator createAppear(@androidx.annotation.NonNull android.view.ViewGroup r1, @androidx.annotation.NonNull android.view.View r2);

    @androidx.annotation.Nullable
    android.animation.Animator createDisappear(@androidx.annotation.NonNull android.view.ViewGroup r1, @androidx.annotation.NonNull android.view.View r2);
}
