package com.google.android.material.animation;

/* JADX INFO: loaded from: classes.dex */
public class MatrixEvaluator implements android.animation.TypeEvaluator<android.graphics.Matrix> {
    private final float[] tempEndValues;
    private final android.graphics.Matrix tempMatrix;
    private final float[] tempStartValues;

    public MatrixEvaluator() {
            r2 = this;
            r2.<init>()
            r0 = 9
            float[] r1 = new float[r0]
            r2.tempStartValues = r1
            float[] r0 = new float[r0]
            r2.tempEndValues = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.tempMatrix = r0
            return
    }

    @androidx.annotation.NonNull
    /* JADX INFO: renamed from: evaluate, reason: avoid collision after fix types in other method */
    public android.graphics.Matrix evaluate2(float r4, @androidx.annotation.NonNull android.graphics.Matrix r5, @androidx.annotation.NonNull android.graphics.Matrix r6) {
            r3 = this;
            float[] r0 = r3.tempStartValues
            r5.getValues(r0)
            float[] r5 = r3.tempEndValues
            r6.getValues(r5)
            r5 = 0
        Lb:
            r6 = 9
            if (r5 >= r6) goto L22
            float[] r6 = r3.tempEndValues
            r0 = r6[r5]
            float[] r1 = r3.tempStartValues
            r2 = r1[r5]
            float r0 = r0 - r2
            r1 = r1[r5]
            float r0 = r0 * r4
            float r0 = r0 + r1
            r6[r5] = r0
            int r5 = r5 + 1
            goto Lb
        L22:
            android.graphics.Matrix r4 = r3.tempMatrix
            float[] r5 = r3.tempEndValues
            r4.setValues(r5)
            android.graphics.Matrix r4 = r3.tempMatrix
            return r4
    }

    @Override // android.animation.TypeEvaluator
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ android.graphics.Matrix evaluate(float r1, @androidx.annotation.NonNull android.graphics.Matrix r2, @androidx.annotation.NonNull android.graphics.Matrix r3) {
            r0 = this;
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            android.graphics.Matrix r3 = (android.graphics.Matrix) r3
            android.graphics.Matrix r1 = r0.evaluate2(r1, r2, r3)
            return r1
    }
}
