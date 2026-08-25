package com.google.android.material.internal;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class ReversableAnimatedValueInterpolator implements android.animation.TimeInterpolator {
    private final android.animation.TimeInterpolator sourceInterpolator;

    public ReversableAnimatedValueInterpolator(@androidx.annotation.NonNull android.animation.TimeInterpolator r1) {
            r0 = this;
            r0.<init>()
            r0.sourceInterpolator = r1
            return
    }

    @androidx.annotation.NonNull
    public static android.animation.TimeInterpolator of(boolean r0, @androidx.annotation.NonNull android.animation.TimeInterpolator r1) {
            if (r0 == 0) goto L3
            return r1
        L3:
            com.google.android.material.internal.ReversableAnimatedValueInterpolator r0 = new com.google.android.material.internal.ReversableAnimatedValueInterpolator
            r0.<init>(r1)
            return r0
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float r2) {
            r1 = this;
            android.animation.TimeInterpolator r0 = r1.sourceInterpolator
            float r2 = r0.getInterpolation(r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r2
            return r0
    }
}
