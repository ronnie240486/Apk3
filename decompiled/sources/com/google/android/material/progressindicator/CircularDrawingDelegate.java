package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes2.dex */
final class CircularDrawingDelegate extends com.google.android.material.progressindicator.DrawingDelegate<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> {
    private float adjustedRadius;
    private int arcDirectionFactor;
    private float displayedCornerRadius;
    private float displayedTrackThickness;

    public CircularDrawingDelegate(@androidx.annotation.NonNull com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.arcDirectionFactor = r1
            return
    }

    private void drawRoundedEnd(android.graphics.Canvas r3, android.graphics.Paint r4, float r5, float r6, float r7) {
            r2 = this;
            r3.save()
            r3.rotate(r7)
            android.graphics.RectF r7 = new android.graphics.RectF
            float r0 = r2.adjustedRadius
            r1 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r1
            float r1 = r0 - r5
            float r0 = r0 + r5
            float r5 = -r6
            r7.<init>(r1, r6, r0, r5)
            r3.drawRoundRect(r7, r6, r6, r4)
            r3.restore()
            return
    }

    private int getSize() {
            r2 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r2.spec
            r1 = r0
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            int r1 = r1.indicatorSize
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            int r0 = r0.indicatorInset
            int r0 = r0 * 2
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@androidx.annotation.NonNull android.graphics.Canvas r8, @androidx.annotation.NonNull android.graphics.Rect r9, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r10) {
            r7 = this;
            int r0 = r9.width()
            float r0 = (float) r0
            int r1 = r7.getPreferredWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
            int r1 = r9.height()
            float r1 = (float) r1
            int r2 = r7.getPreferredHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r7.spec
            r3 = r2
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r3 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r3
            int r3 = r3.indicatorSize
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r2 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r2
            int r2 = r2.indicatorInset
            float r2 = (float) r2
            float r3 = r3 + r2
            float r2 = r3 * r0
            float r5 = r3 * r1
            int r6 = r9.left
            float r6 = (float) r6
            float r2 = r2 + r6
            int r9 = r9.top
            float r9 = (float) r9
            float r5 = r5 + r9
            r8.translate(r2, r5)
            r8.scale(r0, r1)
            r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r8.rotate(r9)
            float r9 = -r3
            r8.clipRect(r9, r9, r3, r3)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r7.spec
            r9 = r8
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r9 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r9
            int r9 = r9.indicatorDirection
            r0 = 1
            if (r9 != 0) goto L4e
            r9 = 1
            goto L4f
        L4e:
            r9 = -1
        L4f:
            r7.arcDirectionFactor = r9
            r9 = r8
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r9 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r9
            int r9 = r9.trackThickness
            float r9 = (float) r9
            float r9 = r9 * r10
            r7.displayedTrackThickness = r9
            r9 = r8
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r9 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r9
            int r9 = r9.trackCornerRadius
            float r9 = (float) r9
            float r9 = r9 * r10
            r7.displayedCornerRadius = r9
            r9 = r8
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r9 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r9
            int r9 = r9.indicatorSize
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r8
            int r8 = r8.trackThickness
            int r9 = r9 - r8
            float r8 = (float) r9
            float r8 = r8 / r4
            r7.adjustedRadius = r8
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r8 = r7.drawable
            boolean r8 = r8.isShowing()
            r9 = 1065353216(0x3f800000, float:1.0)
            r1 = 2
            if (r8 == 0) goto L86
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r8
            int r8 = r8.showAnimationBehavior
            if (r8 == r1) goto L96
        L86:
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r8 = r7.drawable
            boolean r8 = r8.isHiding()
            if (r8 == 0) goto La7
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r8
            int r8 = r8.hideAnimationBehavior
            if (r8 != r0) goto La7
        L96:
            float r8 = r7.adjustedRadius
            float r9 = r9 - r10
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r10 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r10 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r10
            int r10 = r10.trackThickness
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 / r4
            float r9 = r9 + r8
            r7.adjustedRadius = r9
            goto Ld7
        La7:
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r8 = r7.drawable
            boolean r8 = r8.isShowing()
            if (r8 == 0) goto Lb7
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r8
            int r8 = r8.showAnimationBehavior
            if (r8 == r0) goto Lc7
        Lb7:
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r8 = r7.drawable
            boolean r8 = r8.isHiding()
            if (r8 == 0) goto Ld7
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r8
            int r8 = r8.hideAnimationBehavior
            if (r8 != r1) goto Ld7
        Lc7:
            float r8 = r7.adjustedRadius
            float r9 = r9 - r10
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r10 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r10 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r10
            int r10 = r10.trackThickness
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 / r4
            float r8 = r8 - r9
            r7.adjustedRadius = r8
        Ld7:
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void fillIndicator(@androidx.annotation.NonNull android.graphics.Canvas r12, @androidx.annotation.NonNull android.graphics.Paint r13, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r14, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r15, @androidx.annotation.ColorInt int r16) {
            r11 = this;
            r6 = r11
            r7 = r13
            int r0 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r13.setStyle(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            r13.setStrokeCap(r0)
            r0 = 1
            r13.setAntiAlias(r0)
            r0 = r16
            r13.setColor(r0)
            float r0 = r6.displayedTrackThickness
            r13.setStrokeWidth(r0)
            r8 = 1135869952(0x43b40000, float:360.0)
            float r0 = r14 * r8
            int r1 = r6.arcDirectionFactor
            float r2 = (float) r1
            float r9 = r0 * r2
            int r0 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r0 < 0) goto L2f
            float r0 = r15 - r14
            goto L33
        L2f:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r15
            float r0 = r0 - r14
        L33:
            float r0 = r0 * r8
            float r1 = (float) r1
            float r0 = r0 * r1
            r10 = r0
            android.graphics.RectF r1 = new android.graphics.RectF
            float r0 = r6.adjustedRadius
            float r2 = -r0
            float r3 = -r0
            r1.<init>(r2, r3, r0, r0)
            r4 = 0
            r0 = r12
            r2 = r9
            r3 = r10
            r5 = r13
            r0.drawArc(r1, r2, r3, r4, r5)
            float r0 = r6.displayedCornerRadius
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L72
            float r0 = java.lang.Math.abs(r10)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L72
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r13.setStyle(r0)
            float r3 = r6.displayedTrackThickness
            float r4 = r6.displayedCornerRadius
            r0 = r11
            r1 = r12
            r2 = r13
            r5 = r9
            r0.drawRoundedEnd(r1, r2, r3, r4, r5)
            float r3 = r6.displayedTrackThickness
            float r4 = r6.displayedCornerRadius
            float r5 = r9 + r10
            r0.drawRoundedEnd(r1, r2, r3, r4, r5)
        L72:
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void fillTrack(@androidx.annotation.NonNull android.graphics.Canvas r8, @androidx.annotation.NonNull android.graphics.Paint r9) {
            r7 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            int r0 = r0.trackColor
            com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r1 = r7.drawable
            int r1 = r1.getAlpha()
            int r0 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r0, r1)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r9.setStyle(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.BUTT
            r9.setStrokeCap(r1)
            r1 = 1
            r9.setAntiAlias(r1)
            r9.setColor(r0)
            float r0 = r7.displayedTrackThickness
            r9.setStrokeWidth(r0)
            android.graphics.RectF r2 = new android.graphics.RectF
            float r0 = r7.adjustedRadius
            float r1 = -r0
            float r3 = -r0
            r2.<init>(r1, r3, r0, r0)
            r3 = 0
            r4 = 1135869952(0x43b40000, float:360.0)
            r5 = 0
            r1 = r8
            r6 = r9
            r1.drawArc(r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }
}
