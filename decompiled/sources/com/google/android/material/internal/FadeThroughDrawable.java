package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class FadeThroughDrawable extends android.graphics.drawable.Drawable {
    private final float[] alphas;
    private final android.graphics.drawable.Drawable fadeInDrawable;
    private final android.graphics.drawable.Drawable fadeOutDrawable;
    private float progress;

    public FadeThroughDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1, @androidx.annotation.NonNull android.graphics.drawable.Drawable r2) {
            r0 = this;
            r0.<init>()
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            android.graphics.drawable.Drawable r1 = r1.newDrawable()
            android.graphics.drawable.Drawable r1 = r1.mutate()
            r0.fadeOutDrawable = r1
            android.graphics.drawable.Drawable$ConstantState r1 = r2.getConstantState()
            android.graphics.drawable.Drawable r1 = r1.newDrawable()
            android.graphics.drawable.Drawable r1 = r1.mutate()
            r0.fadeInDrawable = r1
            r2 = 0
            r1.setAlpha(r2)
            r1 = 2
            float[] r1 = new float[r1]
            r0.alphas = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.fadeOutDrawable
            r0.draw(r2)
            android.graphics.drawable.Drawable r0 = r1.fadeInDrawable
            r0.draw(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.fadeOutDrawable
            int r0 = r0.getIntrinsicHeight()
            android.graphics.drawable.Drawable r1 = r2.fadeInDrawable
            int r1 = r1.getIntrinsicHeight()
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.fadeOutDrawable
            int r0 = r0.getIntrinsicWidth()
            android.graphics.drawable.Drawable r1 = r2.fadeInDrawable
            int r1 = r1.getIntrinsicWidth()
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.fadeOutDrawable
            int r0 = r0.getMinimumHeight()
            android.graphics.drawable.Drawable r1 = r2.fadeInDrawable
            int r1 = r1.getMinimumHeight()
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.fadeOutDrawable
            int r0 = r0.getMinimumWidth()
            android.graphics.drawable.Drawable r1 = r2.fadeInDrawable
            int r1 = r1.getMinimumWidth()
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.fadeOutDrawable
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L13
            android.graphics.drawable.Drawable r0 = r1.fadeInDrawable
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r4) {
            r3 = this;
            float r0 = r3.progress
            r1 = 0
            r2 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L14
            android.graphics.drawable.Drawable r0 = r3.fadeOutDrawable
            r0.setAlpha(r4)
            android.graphics.drawable.Drawable r4 = r3.fadeInDrawable
            r4.setAlpha(r1)
            goto L1e
        L14:
            android.graphics.drawable.Drawable r0 = r3.fadeOutDrawable
            r0.setAlpha(r1)
            android.graphics.drawable.Drawable r0 = r3.fadeInDrawable
            r0.setAlpha(r4)
        L1e:
            r3.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            super.setBounds(r2, r3, r4, r5)
            android.graphics.drawable.Drawable r0 = r1.fadeOutDrawable
            r0.setBounds(r2, r3, r4, r5)
            android.graphics.drawable.Drawable r0 = r1.fadeInDrawable
            r0.setBounds(r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@androidx.annotation.Nullable android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.fadeOutDrawable
            r0.setColorFilter(r2)
            android.graphics.drawable.Drawable r0 = r1.fadeInDrawable
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }

    public void setProgress(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r4) {
            r3 = this;
            float r0 = r3.progress
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L2c
            r3.progress = r4
            float[] r0 = r3.alphas
            com.google.android.material.internal.FadeThroughUtils.calculateFadeOutAndInAlphas(r4, r0)
            android.graphics.drawable.Drawable r4 = r3.fadeOutDrawable
            float[] r0 = r3.alphas
            r1 = 0
            r0 = r0[r1]
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r4.setAlpha(r0)
            android.graphics.drawable.Drawable r4 = r3.fadeInDrawable
            float[] r0 = r3.alphas
            r2 = 1
            r0 = r0[r2]
            float r0 = r0 * r1
            int r0 = (int) r0
            r4.setAlpha(r0)
            r3.invalidateSelf()
        L2c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.fadeOutDrawable
            boolean r0 = r0.setState(r3)
            android.graphics.drawable.Drawable r1 = r2.fadeInDrawable
            boolean r3 = r1.setState(r3)
            if (r0 != 0) goto L13
            if (r3 == 0) goto L11
            goto L13
        L11:
            r3 = 0
            goto L14
        L13:
            r3 = 1
        L14:
            return r3
    }
}
