package com.google.android.material.animation;

/* JADX INFO: loaded from: classes.dex */
public interface AnimatableView {

    /* JADX INFO: loaded from: classes2.dex */
    public interface Listener {
        void onAnimationEnd();
    }

    void startAnimation(@androidx.annotation.NonNull com.google.android.material.animation.AnimatableView.Listener r1);

    void stopAnimation();
}
