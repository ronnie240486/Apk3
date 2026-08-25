package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class RectEvaluator implements android.animation.TypeEvaluator<android.graphics.Rect> {
    private final android.graphics.Rect rect;

    public RectEvaluator(@androidx.annotation.NonNull android.graphics.Rect r1) {
            r0 = this;
            r0.<init>()
            r0.rect = r1
            return
    }

    /* JADX INFO: renamed from: evaluate, reason: avoid collision after fix types in other method */
    public android.graphics.Rect evaluate2(float r5, @androidx.annotation.NonNull android.graphics.Rect r6, @androidx.annotation.NonNull android.graphics.Rect r7) {
            r4 = this;
            int r0 = r6.left
            int r1 = r7.left
            int r1 = r1 - r0
            float r1 = (float) r1
            float r1 = r1 * r5
            int r1 = (int) r1
            int r0 = r0 + r1
            int r1 = r6.top
            int r2 = r7.top
            int r2 = r2 - r1
            float r2 = (float) r2
            float r2 = r2 * r5
            int r2 = (int) r2
            int r1 = r1 + r2
            int r2 = r6.right
            int r3 = r7.right
            int r3 = r3 - r2
            float r3 = (float) r3
            float r3 = r3 * r5
            int r3 = (int) r3
            int r2 = r2 + r3
            int r6 = r6.bottom
            int r7 = r7.bottom
            int r7 = r7 - r6
            float r7 = (float) r7
            float r7 = r7 * r5
            int r5 = (int) r7
            int r6 = r6 + r5
            android.graphics.Rect r5 = r4.rect
            r5.set(r0, r1, r2, r6)
            android.graphics.Rect r5 = r4.rect
            return r5
    }

    @Override // android.animation.TypeEvaluator
    public /* bridge */ /* synthetic */ android.graphics.Rect evaluate(float r1, @androidx.annotation.NonNull android.graphics.Rect r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
            r0 = this;
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            android.graphics.Rect r1 = r0.evaluate2(r1, r2, r3)
            return r1
    }
}
