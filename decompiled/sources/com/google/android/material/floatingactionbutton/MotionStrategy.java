package com.google.android.material.floatingactionbutton;

/* JADX INFO: loaded from: classes2.dex */
interface MotionStrategy {
    void addAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r1);

    android.animation.AnimatorSet createAnimator();

    com.google.android.material.animation.MotionSpec getCurrentMotionSpec();

    @androidx.annotation.AnimatorRes
    int getDefaultMotionSpecResource();

    java.util.List<android.animation.Animator.AnimatorListener> getListeners();

    @androidx.annotation.Nullable
    com.google.android.material.animation.MotionSpec getMotionSpec();

    void onAnimationCancel();

    void onAnimationEnd();

    void onAnimationStart(android.animation.Animator r1);

    void onChange(@androidx.annotation.Nullable com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r1);

    void performNow();

    void removeAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r1);

    void setMotionSpec(@androidx.annotation.Nullable com.google.android.material.animation.MotionSpec r1);

    boolean shouldCancel();
}
