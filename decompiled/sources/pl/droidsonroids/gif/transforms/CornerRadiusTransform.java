package pl.droidsonroids.gif.transforms;

/* JADX INFO: loaded from: classes2.dex */
public class CornerRadiusTransform implements pl.droidsonroids.gif.transforms.Transform {
    private float mCornerRadius;
    private final android.graphics.RectF mDstRectF;
    private android.graphics.Shader mShader;

    public CornerRadiusTransform(@androidx.annotation.FloatRange(from = 0.0d) float r2) {
            r1 = this;
            r1.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.mDstRectF = r0
            r1.setCornerRadiusSafely(r2)
            return
    }

    private void setCornerRadiusSafely(@androidx.annotation.FloatRange(from = 0.0d) float r2) {
            r1 = this;
            r0 = 0
            float r2 = java.lang.Math.max(r0, r2)
            float r0 = r1.mCornerRadius
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L10
            r1.mCornerRadius = r2
            r2 = 0
            r1.mShader = r2
        L10:
            return
    }

    @androidx.annotation.NonNull
    public android.graphics.RectF getBounds() {
            r1 = this;
            android.graphics.RectF r0 = r1.mDstRectF
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d)
    public float getCornerRadius() {
            r1 = this;
            float r0 = r1.mCornerRadius
            return r0
    }

    @Override // pl.droidsonroids.gif.transforms.Transform
    public void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.RectF r0 = r1.mDstRectF
            r0.set(r2)
            r2 = 0
            r1.mShader = r2
            return
    }

    @Override // pl.droidsonroids.gif.transforms.Transform
    public void onDraw(android.graphics.Canvas r4, android.graphics.Paint r5, android.graphics.Bitmap r6) {
            r3 = this;
            float r0 = r3.mCornerRadius
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Le
            r0 = 0
            android.graphics.RectF r1 = r3.mDstRectF
            r4.drawBitmap(r6, r0, r1, r5)
            return
        Le:
            android.graphics.Shader r0 = r3.mShader
            if (r0 != 0) goto L49
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            r0.<init>(r6, r1, r1)
            r3.mShader = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            android.graphics.RectF r1 = r3.mDstRectF
            float r2 = r1.left
            float r1 = r1.top
            r0.setTranslate(r2, r1)
            android.graphics.RectF r1 = r3.mDstRectF
            float r1 = r1.width()
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            android.graphics.RectF r2 = r3.mDstRectF
            float r2 = r2.height()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r2 = r2 / r6
            r0.preScale(r1, r2)
            android.graphics.Shader r6 = r3.mShader
            r6.setLocalMatrix(r0)
        L49:
            android.graphics.Shader r6 = r3.mShader
            r5.setShader(r6)
            android.graphics.RectF r6 = r3.mDstRectF
            float r0 = r3.mCornerRadius
            r4.drawRoundRect(r6, r0, r0, r5)
            return
    }

    public void setCornerRadius(@androidx.annotation.FloatRange(from = 0.0d) float r1) {
            r0 = this;
            r0.setCornerRadiusSafely(r1)
            return
    }
}
