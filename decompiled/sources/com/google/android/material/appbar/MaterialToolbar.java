package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialToolbar extends androidx.appcompat.widget.Toolbar {
    private static final int DEF_STYLE_RES = 0;
    private static final android.widget.ImageView.ScaleType[] LOGO_SCALE_TYPE_ARRAY = null;

    @androidx.annotation.Nullable
    private java.lang.Boolean logoAdjustViewBounds;

    @androidx.annotation.Nullable
    private android.widget.ImageView.ScaleType logoScaleType;

    @androidx.annotation.Nullable
    private java.lang.Integer navigationIconTint;
    private boolean subtitleCentered;
    private boolean titleCentered;

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_Toolbar
            com.google.android.material.appbar.MaterialToolbar.DEF_STYLE_RES = r0
            r0 = 8
            android.widget.ImageView$ScaleType[] r0 = new android.widget.ImageView.ScaleType[r0]
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX
            r2 = 0
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
            r2 = 1
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START
            r2 = 2
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r2 = 3
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END
            r2 = 4
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            r2 = 5
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r2 = 6
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r2 = 7
            r0[r2] = r1
            com.google.android.material.appbar.MaterialToolbar.LOGO_SCALE_TYPE_ARRAY = r0
            return
    }

    public MaterialToolbar(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialToolbar(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.toolbarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialToolbar(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.Nullable android.util.AttributeSet r9, int r10) {
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.DEF_STYLE_RES
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialToolbar
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.R.styleable.MaterialToolbar_navigationIconTint
            boolean r0 = r9.hasValue(r10)
            r1 = -1
            if (r0 == 0) goto L29
            int r10 = r9.getColor(r10, r1)
            r7.setNavigationIconTint(r10)
        L29:
            int r10 = com.google.android.material.R.styleable.MaterialToolbar_titleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.titleCentered = r10
            int r10 = com.google.android.material.R.styleable.MaterialToolbar_subtitleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.subtitleCentered = r10
            int r10 = com.google.android.material.R.styleable.MaterialToolbar_logoScaleType
            int r10 = r9.getInt(r10, r1)
            if (r10 < 0) goto L4a
            android.widget.ImageView$ScaleType[] r0 = com.google.android.material.appbar.MaterialToolbar.LOGO_SCALE_TYPE_ARRAY
            int r1 = r0.length
            if (r10 >= r1) goto L4a
            r10 = r0[r10]
            r7.logoScaleType = r10
        L4a:
            int r10 = com.google.android.material.R.styleable.MaterialToolbar_logoAdjustViewBounds
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L5c
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.logoAdjustViewBounds = r10
        L5c:
            r9.recycle()
            r7.initBackground(r8)
            return
    }

    private android.util.Pair<java.lang.Integer, java.lang.Integer> calculateTitleBoundLimits(@androidx.annotation.Nullable android.widget.TextView r8, @androidx.annotation.Nullable android.widget.TextView r9) {
            r7 = this;
            int r0 = r7.getMeasuredWidth()
            int r1 = r0 / 2
            int r2 = r7.getPaddingLeft()
            int r3 = r7.getPaddingRight()
            int r0 = r0 - r3
            r3 = 0
        L10:
            int r4 = r7.getChildCount()
            if (r3 >= r4) goto L49
            android.view.View r4 = r7.getChildAt(r3)
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 == r6) goto L46
            if (r4 == r8) goto L46
            if (r4 == r9) goto L46
            int r5 = r4.getRight()
            if (r5 >= r1) goto L36
            int r5 = r4.getRight()
            if (r5 <= r2) goto L36
            int r2 = r4.getRight()
        L36:
            int r5 = r4.getLeft()
            if (r5 <= r1) goto L46
            int r5 = r4.getLeft()
            if (r5 >= r0) goto L46
            int r0 = r4.getLeft()
        L46:
            int r3 = r3 + 1
            goto L10
        L49:
            android.util.Pair r8 = new android.util.Pair
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.<init>(r9, r0)
            return r8
    }

    private void initBackground(android.content.Context r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            if (r0 == 0) goto Lb
            boolean r1 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r1 != 0) goto Lb
            return
        Lb:
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            r1.<init>()
            if (r0 == 0) goto L19
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            int r0 = r0.getColor()
            goto L1a
        L19:
            r0 = 0
        L1a:
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.setFillColor(r0)
            r1.initializeElevationOverlay(r3)
            float r3 = androidx.core.view.ViewCompat.getElevation(r2)
            r1.setElevation(r3)
            androidx.core.view.ViewCompat.setBackground(r2, r1)
            return
    }

    private void layoutTitleCenteredHorizontally(android.view.View r5, android.util.Pair<java.lang.Integer, java.lang.Integer> r6) {
            r4 = this;
            int r0 = r4.getMeasuredWidth()
            int r1 = r5.getMeasuredWidth()
            int r0 = r0 / 2
            int r2 = r1 / 2
            int r0 = r0 - r2
            int r1 = r1 + r0
            java.lang.Object r2 = r6.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = r2 - r0
            r3 = 0
            int r2 = java.lang.Math.max(r2, r3)
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = r1 - r6
            int r6 = java.lang.Math.max(r6, r3)
            int r6 = java.lang.Math.max(r2, r6)
            if (r6 <= 0) goto L41
            int r0 = r0 + r6
            int r1 = r1 - r6
            int r6 = r1 - r0
            r2 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r2)
            int r2 = r5.getMeasuredHeightAndState()
            r5.measure(r6, r2)
        L41:
            int r6 = r5.getTop()
            int r2 = r5.getBottom()
            r5.layout(r0, r6, r1, r2)
            return
    }

    private void maybeCenterTitleViews() {
            r4 = this;
            boolean r0 = r4.titleCentered
            if (r0 != 0) goto L9
            boolean r0 = r4.subtitleCentered
            if (r0 != 0) goto L9
            return
        L9:
            android.widget.TextView r0 = com.google.android.material.internal.ToolbarUtils.getTitleTextView(r4)
            android.widget.TextView r1 = com.google.android.material.internal.ToolbarUtils.getSubtitleTextView(r4)
            if (r0 != 0) goto L16
            if (r1 != 0) goto L16
            return
        L16:
            android.util.Pair r2 = r4.calculateTitleBoundLimits(r0, r1)
            boolean r3 = r4.titleCentered
            if (r3 == 0) goto L23
            if (r0 == 0) goto L23
            r4.layoutTitleCenteredHorizontally(r0, r2)
        L23:
            boolean r0 = r4.subtitleCentered
            if (r0 == 0) goto L2c
            if (r1 == 0) goto L2c
            r4.layoutTitleCenteredHorizontally(r1, r2)
        L2c:
            return
    }

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable maybeTintNavigationIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L17
            java.lang.Integer r0 = r1.navigationIconTint
            if (r0 == 0) goto L17
            android.graphics.drawable.Drawable r2 = r2.mutate()
            android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.DrawableCompat.wrap(r2)
            java.lang.Integer r0 = r1.navigationIconTint
            int r0 = r0.intValue()
            androidx.core.graphics.drawable.DrawableCompat.setTint(r2, r0)
        L17:
            return r2
    }

    private void updateLogoImageView() {
            r2 = this;
            android.widget.ImageView r0 = com.google.android.material.internal.ToolbarUtils.getLogoImageView(r2)
            if (r0 == 0) goto L18
            java.lang.Boolean r1 = r2.logoAdjustViewBounds
            if (r1 == 0) goto L11
            boolean r1 = r1.booleanValue()
            r0.setAdjustViewBounds(r1)
        L11:
            android.widget.ImageView$ScaleType r1 = r2.logoScaleType
            if (r1 == 0) goto L18
            r0.setScaleType(r1)
        L18:
            return
    }

    public void clearNavigationIconTint() {
            r3 = this;
            r0 = 0
            r3.navigationIconTint = r0
            android.graphics.drawable.Drawable r1 = r3.getNavigationIcon()
            if (r1 == 0) goto L17
            android.graphics.drawable.Drawable r2 = r1.mutate()
            android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.DrawableCompat.wrap(r2)
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r2, r0)
            r3.setNavigationIcon(r1)
        L17:
            return
    }

    @androidx.annotation.Nullable
    public android.widget.ImageView.ScaleType getLogoScaleType() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = r1.logoScaleType
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.ColorInt
    public java.lang.Integer getNavigationIconTint() {
            r1 = this;
            java.lang.Integer r0 = r1.navigationIconTint
            return r0
    }

    public boolean isLogoAdjustViewBounds() {
            r1 = this;
            java.lang.Boolean r0 = r1.logoAdjustViewBounds
            if (r0 == 0) goto Lc
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean isSubtitleCentered() {
            r1 = this;
            boolean r0 = r1.subtitleCentered
            return r0
    }

    public boolean isTitleCentered() {
            r1 = this;
            boolean r0 = r1.titleCentered
            return r0
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r0)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r0.maybeCenterTitleViews()
            r0.updateLogoImageView()
            return
    }

    @Override // android.view.View
    @androidx.annotation.RequiresApi(21)
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            com.google.android.material.shape.MaterialShapeUtils.setElevation(r0, r1)
            return
    }

    public void setLogoAdjustViewBounds(boolean r2) {
            r1 = this;
            java.lang.Boolean r0 = r1.logoAdjustViewBounds
            if (r0 == 0) goto La
            boolean r0 = r0.booleanValue()
            if (r0 == r2) goto L13
        La:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.logoAdjustViewBounds = r2
            r1.requestLayout()
        L13:
            return
    }

    public void setLogoScaleType(@androidx.annotation.NonNull android.widget.ImageView.ScaleType r2) {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = r1.logoScaleType
            if (r0 == r2) goto L9
            r1.logoScaleType = r2
            r1.requestLayout()
        L9:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r0.maybeTintNavigationIcon(r1)
            super.setNavigationIcon(r1)
            return
    }

    public void setNavigationIconTint(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.navigationIconTint = r1
            android.graphics.drawable.Drawable r1 = r0.getNavigationIcon()
            if (r1 == 0) goto Lf
            r0.setNavigationIcon(r1)
        Lf:
            return
    }

    public void setSubtitleCentered(boolean r2) {
            r1 = this;
            boolean r0 = r1.subtitleCentered
            if (r0 == r2) goto L9
            r1.subtitleCentered = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setTitleCentered(boolean r2) {
            r1 = this;
            boolean r0 = r1.titleCentered
            if (r0 == r2) goto L9
            r1.titleCentered = r2
            r1.requestLayout()
        L9:
            return
    }
}
