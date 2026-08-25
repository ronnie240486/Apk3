package com.google.android.material.progressindicator;

import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* JADX INFO: loaded from: classes.dex */
abstract class DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> {
    public com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange drawable;
    public S spec;

    public DrawingDelegate(S r1) {
            r0 = this;
            r0.<init>()
            r0.spec = r1
            return
    }

    public abstract void adjustCanvas(@androidx.annotation.NonNull android.graphics.Canvas r1, @androidx.annotation.NonNull android.graphics.Rect r2, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r3);

    public abstract void fillIndicator(@androidx.annotation.NonNull android.graphics.Canvas r1, @androidx.annotation.NonNull android.graphics.Paint r2, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r3, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r4, @androidx.annotation.ColorInt int r5);

    public abstract void fillTrack(@androidx.annotation.NonNull android.graphics.Canvas r1, @androidx.annotation.NonNull android.graphics.Paint r2);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();
}
