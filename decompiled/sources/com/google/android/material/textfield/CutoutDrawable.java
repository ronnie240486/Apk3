package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes2.dex */
class CutoutDrawable extends com.google.android.material.shape.MaterialShapeDrawable {
    public static final /* synthetic */ int $r8$clinit = 0;

    @androidx.annotation.NonNull
    public final android.graphics.RectF cutoutBounds;

    /* JADX INFO: renamed from: com.google.android.material.textfield.CutoutDrawable$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class ImplApi14 extends com.google.android.material.textfield.CutoutDrawable {
        private android.graphics.Paint cutoutPaint;
        private int savedLayer;

        private android.graphics.Paint getCutoutPaint() {
                r3 = this;
                android.graphics.Paint r0 = r3.cutoutPaint
                if (r0 != 0) goto L23
                android.graphics.Paint r0 = new android.graphics.Paint
                r1 = 1
                r0.<init>(r1)
                r3.cutoutPaint = r0
                android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
                r0.setStyle(r1)
                android.graphics.Paint r0 = r3.cutoutPaint
                r1 = -1
                r0.setColor(r1)
                android.graphics.Paint r0 = r3.cutoutPaint
                android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
                android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST_OUT
                r1.<init>(r2)
                r0.setXfermode(r1)
            L23:
                android.graphics.Paint r0 = r3.cutoutPaint
                return r0
        }

        private void postDraw(@androidx.annotation.NonNull android.graphics.Canvas r2) {
                r1 = this;
                android.graphics.drawable.Drawable$Callback r0 = r1.getCallback()
                boolean r0 = r1.useHardwareLayer(r0)
                if (r0 != 0) goto Lf
                int r0 = r1.savedLayer
                r2.restoreToCount(r0)
            Lf:
                return
        }

        private void preDraw(@androidx.annotation.NonNull android.graphics.Canvas r3) {
                r2 = this;
                android.graphics.drawable.Drawable$Callback r0 = r2.getCallback()
                boolean r1 = r2.useHardwareLayer(r0)
                if (r1 == 0) goto L18
                android.view.View r0 = (android.view.View) r0
                int r3 = r0.getLayerType()
                r1 = 2
                if (r3 == r1) goto L1b
                r3 = 0
                r0.setLayerType(r1, r3)
                goto L1b
            L18:
                r2.saveCanvasLayer(r3)
            L1b:
                return
        }

        private void saveCanvasLayer(@androidx.annotation.NonNull android.graphics.Canvas r7) {
                r6 = this;
                r1 = 0
                r2 = 0
                int r0 = r7.getWidth()
                float r3 = (float) r0
                int r0 = r7.getHeight()
                float r4 = (float) r0
                r5 = 0
                r0 = r7
                int r7 = r0.saveLayer(r1, r2, r3, r4, r5)
                r6.savedLayer = r7
                return
        }

        private boolean useHardwareLayer(android.graphics.drawable.Drawable.Callback r1) {
                r0 = this;
                boolean r1 = r1 instanceof android.view.View
                return r1
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public void draw(@androidx.annotation.NonNull android.graphics.Canvas r1) {
                r0 = this;
                r0.preDraw(r1)
                super.draw(r1)
                r0.postDraw(r1)
                return
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public final void drawStrokeShape(@androidx.annotation.NonNull android.graphics.Canvas r3) {
                r2 = this;
                super.drawStrokeShape(r3)
                android.graphics.RectF r0 = r2.cutoutBounds
                android.graphics.Paint r1 = r2.getCutoutPaint()
                r3.drawRect(r0, r1)
                return
        }
    }

    @android.annotation.TargetApi(18)
    public static class ImplApi18 extends com.google.android.material.textfield.CutoutDrawable {
        public ImplApi18(@androidx.annotation.Nullable com.google.android.material.shape.ShapeAppearanceModel r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public final void drawStrokeShape(@androidx.annotation.NonNull android.graphics.Canvas r3) {
                r2 = this;
                android.graphics.RectF r0 = r2.cutoutBounds
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Lc
                super.drawStrokeShape(r3)
                goto L28
            Lc:
                r3.save()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 < r1) goto L1b
                android.graphics.RectF r0 = r2.cutoutBounds
                r3.clipOutRect(r0)
                goto L22
            L1b:
                android.graphics.RectF r0 = r2.cutoutBounds
                android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
                r3.clipRect(r0, r1)
            L22:
                super.drawStrokeShape(r3)
                r3.restore()
            L28:
                return
        }
    }

    private CutoutDrawable(@androidx.annotation.Nullable com.google.android.material.shape.ShapeAppearanceModel r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L8
        L3:
            com.google.android.material.shape.ShapeAppearanceModel r1 = new com.google.android.material.shape.ShapeAppearanceModel
            r1.<init>()
        L8:
            r0.<init>(r1)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.cutoutBounds = r1
            return
    }

    public /* synthetic */ CutoutDrawable(com.google.android.material.shape.ShapeAppearanceModel r1, com.google.android.material.textfield.CutoutDrawable.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public final void setCutout(float r3, float r4, float r5, float r6) {
            r2 = this;
            android.graphics.RectF r0 = r2.cutoutBounds
            float r1 = r0.left
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L1a
            float r1 = r0.top
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L1a
            float r1 = r0.right
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L1a
            float r1 = r0.bottom
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 == 0) goto L20
        L1a:
            r0.set(r3, r4, r5, r6)
            r2.invalidateSelf()
        L20:
            return
    }
}
