package com.google.android.material.textview;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialTextView extends androidx.appcompat.widget.AppCompatTextView {
    public MaterialTextView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialTextView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842884(0x1010084, float:2.3693928E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialTextView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4) {
            r1 = this;
            r0 = 0
            android.content.Context r2 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r2, r3, r4, r0)
            r1.<init>(r2, r3, r4)
            r1.initialize(r3, r4, r0)
            return
    }

    @java.lang.Deprecated
    public MaterialTextView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r1, r2, r3, r4)
            r0.<init>(r1, r2, r3)
            r0.initialize(r2, r3, r4)
            return
    }

    private void applyLineHeightFromViewAppearance(@androidx.annotation.NonNull android.content.res.Resources.Theme r4, int r5) {
            r3 = this;
            int[] r0 = com.google.android.material.R.styleable.MaterialTextAppearance
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
            android.content.Context r5 = r3.getContext()
            r0 = 2
            int[] r0 = new int[r0]
            int r1 = com.google.android.material.R.styleable.MaterialTextAppearance_android_lineHeight
            r2 = 0
            r0[r2] = r1
            int r1 = com.google.android.material.R.styleable.MaterialTextAppearance_lineHeight
            r2 = 1
            r0[r2] = r1
            int r5 = readFirstAvailableDimension(r5, r4, r0)
            r4.recycle()
            if (r5 < 0) goto L23
            r3.setLineHeight(r5)
        L23:
            return
    }

    private static boolean canApplyTextAppearanceLineHeight(android.content.Context r2) {
            int r0 = com.google.android.material.R.attr.textAppearanceLineHeightEnabled
            r1 = 1
            boolean r2 = com.google.android.material.resources.MaterialAttributes.resolveBoolean(r2, r0, r1)
            return r2
    }

    private static int findViewAppearanceResourceId(@androidx.annotation.NonNull android.content.res.Resources.Theme r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            int[] r0 = com.google.android.material.R.styleable.MaterialTextView
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r0, r3, r4)
            int r2 = com.google.android.material.R.styleable.MaterialTextView_android_textAppearance
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            r1.recycle()
            return r2
    }

    private void initialize(@androidx.annotation.Nullable android.util.AttributeSet r3, int r4, int r5) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            boolean r1 = canApplyTextAppearanceLineHeight(r0)
            if (r1 == 0) goto L1e
            android.content.res.Resources$Theme r1 = r0.getTheme()
            boolean r0 = viewAttrsHasLineHeight(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L1e
            int r3 = findViewAppearanceResourceId(r1, r3, r4, r5)
            r4 = -1
            if (r3 == r4) goto L1e
            r2.applyLineHeightFromViewAppearance(r1, r3)
        L1e:
            return
    }

    private static int readFirstAvailableDimension(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull android.content.res.TypedArray r5, @androidx.annotation.NonNull @androidx.annotation.StyleableRes int... r6) {
            r0 = -1
            r1 = 0
            r2 = -1
        L3:
            int r3 = r6.length
            if (r1 >= r3) goto L11
            if (r2 >= 0) goto L11
            r2 = r6[r1]
            int r2 = com.google.android.material.resources.MaterialResources.getDimensionPixelSize(r4, r5, r2, r0)
            int r1 = r1 + 1
            goto L3
        L11:
            return r2
    }

    private static boolean viewAttrsHasLineHeight(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.content.res.Resources.Theme r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4, int r5) {
            int[] r0 = com.google.android.material.R.styleable.MaterialTextView
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0, r4, r5)
            r3 = 2
            int[] r3 = new int[r3]
            int r4 = com.google.android.material.R.styleable.MaterialTextView_android_lineHeight
            r5 = 0
            r3[r5] = r4
            int r4 = com.google.android.material.R.styleable.MaterialTextView_lineHeight
            r0 = 1
            r3[r0] = r4
            int r1 = readFirstAvailableDimension(r1, r2, r3)
            r2.recycle()
            r2 = -1
            if (r1 == r2) goto L1e
            r5 = 1
        L1e:
            return r5
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@androidx.annotation.NonNull android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            boolean r0 = canApplyTextAppearanceLineHeight(r2)
            if (r0 == 0) goto L10
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r1.applyLineHeightFromViewAppearance(r2, r3)
        L10:
            return
    }
}
