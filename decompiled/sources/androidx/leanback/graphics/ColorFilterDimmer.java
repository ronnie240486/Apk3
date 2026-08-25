package androidx.leanback.graphics;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorFilterDimmer {
    private final float mActiveLevel;
    private final androidx.leanback.graphics.ColorFilterCache mColorDimmer;
    private final float mDimmedLevel;
    private android.graphics.ColorFilter mFilter;
    private final android.graphics.Paint mPaint;

    private ColorFilterDimmer(androidx.leanback.graphics.ColorFilterCache r3, float r4, float r5) {
            r2 = this;
            r2.<init>()
            r2.mColorDimmer = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 <= 0) goto Ld
            r4 = 1065353216(0x3f800000, float:1.0)
        Ld:
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto L13
            r4 = 0
        L13:
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L19
            r5 = 1065353216(0x3f800000, float:1.0)
        L19:
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 >= 0) goto L1e
            goto L1f
        L1e:
            r0 = r5
        L1f:
            r2.mActiveLevel = r4
            r2.mDimmedLevel = r0
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r2.mPaint = r3
            return
    }

    public static androidx.leanback.graphics.ColorFilterDimmer create(androidx.leanback.graphics.ColorFilterCache r1, float r2, float r3) {
            androidx.leanback.graphics.ColorFilterDimmer r0 = new androidx.leanback.graphics.ColorFilterDimmer
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static androidx.leanback.graphics.ColorFilterDimmer createDefault(android.content.Context r7) {
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
            androidx.leanback.graphics.ColorFilterDimmer r0 = new androidx.leanback.graphics.ColorFilterDimmer
            androidx.leanback.graphics.ColorFilterCache r1 = androidx.leanback.graphics.ColorFilterCache.getColorFilterCache(r1)
            r0.<init>(r1, r2, r7)
            return r0
    }

    public void applyFilterToView(android.view.View r3) {
            r2 = this;
            android.graphics.ColorFilter r0 = r2.mFilter
            if (r0 == 0) goto Lb
            r0 = 2
            android.graphics.Paint r1 = r2.mPaint
            r3.setLayerType(r0, r1)
            goto L10
        Lb:
            r0 = 0
            r1 = 0
            r3.setLayerType(r0, r1)
        L10:
            r3.invalidate()
            return
    }

    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.ColorFilter r0 = r1.mFilter
            return r0
    }

    public android.graphics.Paint getPaint() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            return r0
    }

    public void setActiveLevel(float r4) {
            r3 = this;
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto L6
            r4 = 0
        L6:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            r4 = 1065353216(0x3f800000, float:1.0)
        Le:
            androidx.leanback.graphics.ColorFilterCache r0 = r3.mColorDimmer
            float r1 = r3.mDimmedLevel
            float r2 = r3.mActiveLevel
            float r2 = r2 - r1
            float r2 = r2 * r4
            float r2 = r2 + r1
            android.graphics.ColorFilter r4 = r0.getFilterForLevel(r2)
            r3.mFilter = r4
            android.graphics.Paint r0 = r3.mPaint
            r0.setColorFilter(r4)
            return
    }
}
