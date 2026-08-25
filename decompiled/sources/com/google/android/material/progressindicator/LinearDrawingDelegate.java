package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes2.dex */
final class LinearDrawingDelegate extends com.google.android.material.progressindicator.DrawingDelegate<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> {
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float trackLength;

    public LinearDrawingDelegate(@androidx.annotation.NonNull com.google.android.material.progressindicator.LinearProgressIndicatorSpec r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1133903872(0x43960000, float:300.0)
            r0.trackLength = r1
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@androidx.annotation.NonNull android.graphics.Canvas r7, @androidx.annotation.NonNull android.graphics.Rect r8, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r9) {
            r6 = this;
            int r0 = r8.width()
            float r0 = (float) r0
            r6.trackLength = r0
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r6.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            int r0 = r0.trackThickness
            float r0 = (float) r0
            int r1 = r8.left
            float r1 = (float) r1
            int r2 = r8.width()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r2 = r2 + r1
            int r1 = r8.top
            float r1 = (float) r1
            int r4 = r8.height()
            float r4 = (float) r4
            float r4 = r4 / r3
            float r4 = r4 + r1
            int r8 = r8.height()
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r6.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r1
            int r1 = r1.trackThickness
            int r8 = r8 - r1
            float r8 = (float) r8
            float r8 = r8 / r3
            r1 = 0
            float r8 = java.lang.Math.max(r1, r8)
            float r8 = r8 + r4
            r7.translate(r2, r8)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r6.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r8
            boolean r8 = r8.drawHorizontallyInverse
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L49
            r7.scale(r2, r4)
        L49:
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r8 = r6.drawable
            boolean r8 = r8.isShowing()
            if (r8 == 0) goto L5a
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r6.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r8
            int r8 = r8.showAnimationBehavior
            r5 = 1
            if (r8 == r5) goto L6b
        L5a:
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r8 = r6.drawable
            boolean r8 = r8.isHiding()
            if (r8 == 0) goto L6e
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r6.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r8
            int r8 = r8.hideAnimationBehavior
            r5 = 2
            if (r8 != r5) goto L6e
        L6b:
            r7.scale(r4, r2)
        L6e:
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r8 = r6.drawable
            boolean r8 = r8.isShowing()
            if (r8 != 0) goto L7e
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r8 = r6.drawable
            boolean r8 = r8.isHiding()
            if (r8 == 0) goto L8d
        L7e:
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r6.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r8
            int r8 = r8.trackThickness
            float r8 = (float) r8
            float r2 = r9 - r4
            float r2 = r2 * r8
            float r2 = r2 / r3
            r7.translate(r1, r2)
        L8d:
            float r8 = r6.trackLength
            float r1 = -r8
            float r1 = r1 / r3
            float r2 = -r0
            float r2 = r2 / r3
            float r8 = r8 / r3
            float r0 = r0 / r3
            r7.clipRect(r1, r2, r8, r0)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r7 = r6.spec
            r8 = r7
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r8
            int r8 = r8.trackThickness
            float r8 = (float) r8
            float r8 = r8 * r9
            r6.displayedTrackThickness = r8
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r7 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r7
            int r7 = r7.trackCornerRadius
            float r7 = (float) r7
            float r7 = r7 * r9
            r6.displayedCornerRadius = r7
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@androidx.annotation.NonNull android.graphics.Canvas r6, @androidx.annotation.NonNull android.graphics.Paint r7, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r8, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r9, @androidx.annotation.ColorInt int r10) {
            r5 = this;
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 != 0) goto L5
            return
        L5:
            float r0 = r5.trackLength
            float r1 = -r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r3 = r5.displayedCornerRadius
            float r4 = r3 * r2
            float r4 = r0 - r4
            float r4 = r4 * r8
            float r4 = r4 + r1
            float r8 = -r0
            float r8 = r8 / r2
            float r1 = r3 * r2
            float r0 = r0 - r1
            float r0 = r0 * r9
            float r0 = r0 + r8
            float r3 = r3 * r2
            float r3 = r3 + r0
            android.graphics.Paint$Style r8 = android.graphics.Paint.Style.FILL
            r7.setStyle(r8)
            r8 = 1
            r7.setAntiAlias(r8)
            r7.setColor(r10)
            android.graphics.RectF r8 = new android.graphics.RectF
            float r9 = r5.displayedTrackThickness
            float r10 = -r9
            float r10 = r10 / r2
            float r9 = r9 / r2
            r8.<init>(r4, r10, r3, r9)
            float r9 = r5.displayedCornerRadius
            r6.drawRoundRect(r8, r9, r9, r7)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void fillTrack(@androidx.annotation.NonNull android.graphics.Canvas r7, @androidx.annotation.NonNull android.graphics.Paint r8) {
            r6 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r6.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            int r0 = r0.trackColor
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r1 = r6.drawable
            int r1 = r1.getAlpha()
            int r0 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r0, r1)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r8.setStyle(r1)
            r1 = 1
            r8.setAntiAlias(r1)
            r8.setColor(r0)
            android.graphics.RectF r0 = new android.graphics.RectF
            float r1 = r6.trackLength
            float r2 = -r1
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r4 = r6.displayedTrackThickness
            float r5 = -r4
            float r5 = r5 / r3
            float r1 = r1 / r3
            float r4 = r4 / r3
            r0.<init>(r2, r5, r1, r4)
            float r1 = r6.displayedCornerRadius
            r7.drawRoundRect(r0, r1, r1, r8)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            int r0 = r0.trackThickness
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
            r1 = this;
            r0 = -1
            return r0
    }
}
