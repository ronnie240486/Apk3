package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class DetailsParallaxDrawable extends androidx.leanback.graphics.CompositeDrawable {
    private android.graphics.drawable.Drawable mBottomDrawable;

    public DetailsParallaxDrawable(android.content.Context r8, androidx.leanback.widget.DetailsParallax r9) {
            r7 = this;
            r7.<init>()
            android.content.res.Resources r0 = r8.getResources()
            int r1 = androidx.leanback.R.dimen.lb_details_cover_drawable_parallax_movement
            int r0 = r0.getDimensionPixelSize(r1)
            int r0 = -r0
            androidx.leanback.graphics.FitWidthBitmapDrawable r4 = new androidx.leanback.graphics.FitWidthBitmapDrawable
            r4.<init>()
            androidx.leanback.widget.ParallaxTarget$PropertyValuesHolderTarget r6 = new androidx.leanback.widget.ParallaxTarget$PropertyValuesHolderTarget
            r1 = 2
            int[] r1 = new int[r1]
            r2 = 0
            r1[r2] = r2
            r2 = 1
            r1[r2] = r0
            java.lang.String r0 = "verticalOffset"
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofInt(r0, r1)
            r6.<init>(r4, r0)
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            r5.<init>()
            r1 = r7
            r2 = r8
            r3 = r9
            r1.init(r2, r3, r4, r5, r6)
            return
    }

    public DetailsParallaxDrawable(android.content.Context r1, androidx.leanback.widget.DetailsParallax r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4, androidx.leanback.widget.ParallaxTarget r5) {
            r0 = this;
            r0.<init>()
            r0.init(r1, r2, r3, r4, r5)
            return
    }

    public DetailsParallaxDrawable(android.content.Context r7, androidx.leanback.widget.DetailsParallax r8, android.graphics.drawable.Drawable r9, androidx.leanback.widget.ParallaxTarget r10) {
            r6 = this;
            r6.<init>()
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            r4.<init>()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.init(r1, r2, r3, r4, r5)
            return
    }

    private static int getDefaultBackgroundColor(android.content.Context r4) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int r2 = androidx.leanback.R.attr.defaultBrandColorDark
            r3 = 1
            boolean r1 = r1.resolveAttribute(r2, r0, r3)
            if (r1 == 0) goto L1d
            android.content.res.Resources r4 = r4.getResources()
            int r0 = r0.resourceId
            int r4 = r4.getColor(r0)
            return r4
        L1d:
            android.content.res.Resources r4 = r4.getResources()
            int r0 = androidx.leanback.R.color.lb_default_brand_color_dark
            int r4 = r4.getColor(r0)
            return r4
    }

    public android.graphics.drawable.Drawable getBottomDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mBottomDrawable
            return r0
    }

    public android.graphics.drawable.Drawable getCoverDrawable() {
            r1 = this;
            r0 = 0
            androidx.leanback.graphics.CompositeDrawable$ChildDrawable r0 = r1.getChildAt(r0)
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    @androidx.annotation.ColorInt
    public int getSolidColor() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mBottomDrawable
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            int r0 = r0.getColor()
            return r0
    }

    public final void init(android.content.Context r5, androidx.leanback.widget.DetailsParallax r6, android.graphics.drawable.Drawable r7, android.graphics.drawable.Drawable r8, androidx.leanback.widget.ParallaxTarget r9) {
            r4 = this;
            boolean r0 = r8 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L14
            r0 = r8
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            int r1 = r0.getColor()
            if (r1 != 0) goto L14
            int r1 = getDefaultBackgroundColor(r5)
            r0.setColor(r1)
        L14:
            r4.addChildDrawable(r7)
            r4.mBottomDrawable = r8
            r4.addChildDrawable(r8)
            androidx.leanback.widget.Parallax$IntProperty r7 = r6.getOverviewRowTop()
            androidx.leanback.widget.Parallax$IntProperty r8 = r6.getOverviewRowBottom()
            android.content.res.Resources r0 = r5.getResources()
            int r1 = androidx.leanback.R.dimen.lb_details_v2_align_pos_for_actions
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r5 = r5.getResources()
            int r1 = androidx.leanback.R.dimen.lb_details_v2_align_pos_for_description
            int r5 = r5.getDimensionPixelSize(r1)
            r1 = 2
            androidx.leanback.widget.Parallax$PropertyMarkerValue[] r2 = new androidx.leanback.widget.Parallax.PropertyMarkerValue[r1]
            androidx.leanback.widget.Parallax$PropertyMarkerValue r0 = r7.atAbsolute(r0)
            r3 = 0
            r2[r3] = r0
            androidx.leanback.widget.Parallax$PropertyMarkerValue r5 = r7.atAbsolute(r5)
            r0 = 1
            r2[r0] = r5
            androidx.leanback.widget.ParallaxEffect r5 = r6.addEffect(r2)
            r5.target(r9)
            androidx.leanback.widget.Parallax$PropertyMarkerValue[] r5 = new androidx.leanback.widget.Parallax.PropertyMarkerValue[r1]
            androidx.leanback.widget.Parallax$PropertyMarkerValue r9 = r8.atMax()
            r5[r3] = r9
            androidx.leanback.widget.Parallax$PropertyMarkerValue r8 = r8.atMin()
            r5[r0] = r8
            androidx.leanback.widget.ParallaxEffect r5 = r6.addEffect(r5)
            androidx.leanback.graphics.CompositeDrawable$ChildDrawable r8 = r4.getChildAt(r0)
            android.util.Property<androidx.leanback.graphics.CompositeDrawable$ChildDrawable, java.lang.Integer> r9 = androidx.leanback.graphics.CompositeDrawable.ChildDrawable.TOP_ABSOLUTE
            r5.target(r8, r9)
            androidx.leanback.widget.Parallax$PropertyMarkerValue[] r5 = new androidx.leanback.widget.Parallax.PropertyMarkerValue[r1]
            androidx.leanback.widget.Parallax$PropertyMarkerValue r8 = r7.atMax()
            r5[r3] = r8
            androidx.leanback.widget.Parallax$PropertyMarkerValue r7 = r7.atMin()
            r5[r0] = r7
            androidx.leanback.widget.ParallaxEffect r5 = r6.addEffect(r5)
            androidx.leanback.graphics.CompositeDrawable$ChildDrawable r6 = r4.getChildAt(r3)
            android.util.Property<androidx.leanback.graphics.CompositeDrawable$ChildDrawable, java.lang.Integer> r7 = androidx.leanback.graphics.CompositeDrawable.ChildDrawable.BOTTOM_ABSOLUTE
            r5.target(r6, r7)
            return
    }

    public void setSolidColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mBottomDrawable
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            r0.setColor(r2)
            return
    }
}
