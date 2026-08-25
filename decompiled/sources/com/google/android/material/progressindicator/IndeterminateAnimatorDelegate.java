package com.google.android.material.progressindicator;

import android.animation.Animator;

/* JADX INFO: loaded from: classes.dex */
abstract class IndeterminateAnimatorDelegate<T extends android.animation.Animator> {
    public com.google.android.material.progressindicator.IndeterminateDrawable drawable;
    public final int[] segmentColors;
    public final float[] segmentPositions;

    public IndeterminateAnimatorDelegate(int r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2 * 2
            float[] r0 = new float[r0]
            r1.segmentPositions = r0
            int[] r2 = new int[r2]
            r1.segmentColors = r2
            return
    }

    public abstract void cancelAnimatorImmediately();

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(@androidx.annotation.NonNull androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1);

    public abstract void requestCancelAnimatorAfterCurrentCycle();

    public abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();
}
