package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;

    @androidx.annotation.NonNull
    public int[] indicatorColors;
    public int showAnimationBehavior;

    @androidx.annotation.ColorInt
    public int trackColor;

    @androidx.annotation.Px
    public int trackCornerRadius;

    @androidx.annotation.Px
    public int trackThickness;

    public BaseProgressIndicatorSpec(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.Nullable android.util.AttributeSet r10, @androidx.annotation.AttrRes int r11, @androidx.annotation.StyleRes int r12) {
            r8 = this;
            r8.<init>()
            r0 = 0
            int[] r1 = new int[r0]
            r8.indicatorColors = r1
            android.content.res.Resources r1 = r9.getResources()
            int r2 = com.google.android.material.R.dimen.mtrl_progress_track_thickness
            int r1 = r1.getDimensionPixelSize(r2)
            int[] r4 = com.google.android.material.R.styleable.BaseProgressIndicator
            int[] r7 = new int[r0]
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            android.content.res.TypedArray r10 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r2, r3, r4, r5, r6, r7)
            int r11 = com.google.android.material.R.styleable.BaseProgressIndicator_trackThickness
            int r11 = com.google.android.material.resources.MaterialResources.getDimensionPixelSize(r9, r10, r11, r1)
            r8.trackThickness = r11
            int r11 = com.google.android.material.R.styleable.BaseProgressIndicator_trackCornerRadius
            int r11 = com.google.android.material.resources.MaterialResources.getDimensionPixelSize(r9, r10, r11, r0)
            int r12 = r8.trackThickness
            int r12 = r12 / 2
            int r11 = java.lang.Math.min(r11, r12)
            r8.trackCornerRadius = r11
            int r11 = com.google.android.material.R.styleable.BaseProgressIndicator_showAnimationBehavior
            int r11 = r10.getInt(r11, r0)
            r8.showAnimationBehavior = r11
            int r11 = com.google.android.material.R.styleable.BaseProgressIndicator_hideAnimationBehavior
            int r11 = r10.getInt(r11, r0)
            r8.hideAnimationBehavior = r11
            r8.loadIndicatorColors(r9, r10)
            r8.loadTrackColor(r9, r10)
            r10.recycle()
            return
    }

    private void loadIndicatorColors(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.NonNull android.content.res.TypedArray r7) {
            r5 = this;
            int r0 = com.google.android.material.R.styleable.BaseProgressIndicator_indicatorColor
            boolean r1 = r7.hasValue(r0)
            r2 = 0
            r3 = -1
            r4 = 1
            if (r1 != 0) goto L18
            int[] r7 = new int[r4]
            int r0 = com.google.android.material.R.attr.colorPrimary
            int r6 = com.google.android.material.color.MaterialColors.getColor(r6, r0, r3)
            r7[r2] = r6
            r5.indicatorColors = r7
            return
        L18:
            android.util.TypedValue r1 = r7.peekValue(r0)
            int r1 = r1.type
            if (r1 == r4) goto L2b
            int[] r6 = new int[r4]
            int r7 = r7.getColor(r0, r3)
            r6[r2] = r7
            r5.indicatorColors = r6
            return
        L2b:
            android.content.res.Resources r6 = r6.getResources()
            int r7 = r7.getResourceId(r0, r3)
            int[] r6 = r6.getIntArray(r7)
            r5.indicatorColors = r6
            int r6 = r6.length
            if (r6 == 0) goto L3d
            return
        L3d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "indicatorColors cannot be empty when indicatorColor is not used."
            r6.<init>(r7)
            throw r6
    }

    private void loadTrackColor(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull android.content.res.TypedArray r4) {
            r2 = this;
            int r0 = com.google.android.material.R.styleable.BaseProgressIndicator_trackColor
            boolean r1 = r4.hasValue(r0)
            if (r1 == 0) goto L10
            r3 = -1
            int r3 = r4.getColor(r0, r3)
            r2.trackColor = r3
            return
        L10:
            int[] r4 = r2.indicatorColors
            r0 = 0
            r4 = r4[r0]
            r2.trackColor = r4
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r4 = 1
            int[] r4 = new int[r4]
            r1 = 16842803(0x1010033, float:2.36937E-38)
            r4[r0] = r1
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4)
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            float r4 = r3.getFloat(r0, r4)
            r3.recycle()
            r3 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 * r3
            int r3 = (int) r4
            int r4 = r2.trackColor
            int r3 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r4, r3)
            r2.trackColor = r3
            return
    }

    public boolean isHideAnimationEnabled() {
            r1 = this;
            int r0 = r1.hideAnimationBehavior
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isShowAnimationEnabled() {
            r1 = this;
            int r0 = r1.showAnimationBehavior
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public abstract void validateSpec();
}
