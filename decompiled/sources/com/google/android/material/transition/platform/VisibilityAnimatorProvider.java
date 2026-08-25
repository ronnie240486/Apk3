package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(21)
public interface VisibilityAnimatorProvider {
    @androidx.annotation.Nullable
    android.animation.Animator createAppear(@androidx.annotation.NonNull android.view.ViewGroup r1, @androidx.annotation.NonNull android.view.View r2);

    @androidx.annotation.Nullable
    android.animation.Animator createDisappear(@androidx.annotation.NonNull android.view.ViewGroup r1, @androidx.annotation.NonNull android.view.View r2);
}
