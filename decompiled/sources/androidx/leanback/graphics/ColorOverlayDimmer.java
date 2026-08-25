package androidx.leanback.graphics;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorOverlayDimmer {
    private final float mActiveLevel;
    private int mAlpha;
    private float mAlphaFloat;
    private final float mDimmedLevel;
    private final android.graphics.Paint mPaint;

    private ColorOverlayDimmer(int r5, float r6, float r7) {
            r4 = this;
            r4.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lb
            r6 = 1065353216(0x3f800000, float:1.0)
        Lb:
            r1 = 0
            int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r2 >= 0) goto L11
            r6 = 0
        L11:
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L17
            r7 = 1065353216(0x3f800000, float:1.0)
        L17:
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 >= 0) goto L1c
            goto L1d
        L1c:
            r1 = r7
        L1d:
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r4.mPaint = r7
            int r2 = android.graphics.Color.red(r5)
            int r3 = android.graphics.Color.green(r5)
            int r5 = android.graphics.Color.blue(r5)
            int r5 = android.graphics.Color.rgb(r2, r3, r5)
            r7.setColor(r5)
            r4.mActiveLevel = r6
            r4.mDimmedLevel = r1
            r4.setActiveLevel(r0)
            return
    }

    public static androidx.leanback.graphics.ColorOverlayDimmer createColorOverlayDimmer(int r1, float r2, float r3) {
            androidx.leanback.graphics.ColorOverlayDimmer r0 = new androidx.leanback.graphics.ColorOverlayDimmer
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static androidx.leanback.graphics.ColorOverlayDimmer createDefault(android.content.Context r7) {
            int[] r0 = androidx.leanback.R.styleable.LeanbackTheme
            android.content.res.TypedArray r0 = r7.obtainStyledAttributes(r0)
            int r1 = androidx.leanback.R.styleable.LeanbackTheme_overlayDimMaskColor
            android.content.res.Resources r2 = r7.getResources()
            int r3 = androidx.leanback.R.color.lb_view_dim_mask_color
            int r2 = r2.getColor(r3)
            int r1 = r0.getColor(r1, r2)
            int r2 = androidx.leanback.R.styleable.LeanbackTheme_overlayDimActiveLevel
            android.content.res.Resources r3 = r7.getResources()
            int r4 = androidx.leanback.R.fraction.lb_view_active_level
            r5 = 1
            r6 = 0
            float r3 = r3.getFraction(r4, r5, r6)
            float r2 = r0.getFraction(r2, r5, r5, r3)
            int r3 = androidx.leanback.R.styleable.LeanbackTheme_overlayDimDimmedLevel
            android.content.res.Resources r7 = r7.getResources()
            int r4 = androidx.leanback.R.fraction.lb_view_dimmed_level
            float r7 = r7.getFraction(r4, r5, r5)
            float r7 = r0.getFraction(r3, r5, r5, r7)
            r0.recycle()
            androidx.leanback.graphics.ColorOverlayDimmer r0 = new androidx.leanback.graphics.ColorOverlayDimmer
            r0.<init>(r1, r2, r7)
            return r0
    }

    public int applyToColor(int r5) {
            r4 = this;
            float r0 = r4.mAlphaFloat
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            int r0 = android.graphics.Color.alpha(r5)
            int r2 = android.graphics.Color.red(r5)
            float r2 = (float) r2
            float r2 = r2 * r1
            int r2 = (int) r2
            int r3 = android.graphics.Color.green(r5)
            float r3 = (float) r3
            float r3 = r3 * r1
            int r3 = (int) r3
            int r5 = android.graphics.Color.blue(r5)
            float r5 = (float) r5
            float r5 = r5 * r1
            int r5 = (int) r5
            int r5 = android.graphics.Color.argb(r0, r2, r3, r5)
            return r5
    }

    public void drawColorOverlay(android.graphics.Canvas r8, android.view.View r9, boolean r10) {
            r7 = this;
            r8.save()
            int r0 = r9.getLeft()
            float r0 = (float) r0
            float r1 = r9.getTranslationX()
            float r1 = r1 + r0
            int r0 = r9.getTop()
            float r0 = (float) r0
            float r2 = r9.getTranslationY()
            float r2 = r2 + r0
            r8.translate(r1, r2)
            android.graphics.Matrix r0 = r9.getMatrix()
            r8.concat(r0)
            float r0 = -r1
            float r1 = -r2
            r8.translate(r0, r1)
            if (r10 == 0) goto L43
            int r10 = r9.getLeft()
            float r1 = (float) r10
            int r10 = r9.getTop()
            float r2 = (float) r10
            int r10 = r9.getRight()
            float r3 = (float) r10
            int r9 = r9.getBottom()
            float r4 = (float) r9
            android.graphics.Paint r5 = r7.mPaint
            r0 = r8
            r0.drawRect(r1, r2, r3, r4, r5)
            goto L71
        L43:
            int r10 = r9.getLeft()
            int r0 = r9.getPaddingLeft()
            int r0 = r0 + r10
            float r2 = (float) r0
            int r10 = r9.getTop()
            int r0 = r9.getPaddingTop()
            int r0 = r0 + r10
            float r3 = (float) r0
            int r10 = r9.getRight()
            int r0 = r9.getPaddingRight()
            int r10 = r10 - r0
            float r4 = (float) r10
            int r10 = r9.getBottom()
            int r9 = r9.getPaddingBottom()
            int r10 = r10 - r9
            float r5 = (float) r10
            android.graphics.Paint r6 = r7.mPaint
            r1 = r8
            r1.drawRect(r2, r3, r4, r5, r6)
        L71:
            r8.restore()
            return
    }

    public int getAlpha() {
            r1 = this;
            int r0 = r1.mAlpha
            return r0
    }

    public float getAlphaFloat() {
            r1 = this;
            float r0 = r1.mAlphaFloat
            return r0
    }

    public android.graphics.Paint getPaint() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            return r0
    }

    public boolean needsDraw() {
            r1 = this;
            int r0 = r1.mAlpha
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void setActiveLevel(float r3) {
            r2 = this;
            float r0 = r2.mDimmedLevel
            float r1 = r2.mActiveLevel
            float r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r3, r0)
            r2.mAlphaFloat = r3
            r0 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r0
            int r3 = (int) r3
            r2.mAlpha = r3
            android.graphics.Paint r0 = r2.mPaint
            r0.setAlpha(r3)
            return
    }
}
