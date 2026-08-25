package com.google.android.material.color;

/* JADX INFO: loaded from: classes.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;

    private MaterialColors() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.ColorInt
    public static int compositeARGBWithAlpha(@androidx.annotation.ColorInt int r1, @androidx.annotation.IntRange(from = 0, to = 255) int r2) {
            int r0 = android.graphics.Color.alpha(r1)
            int r0 = r0 * r2
            int r0 = r0 / 255
            int r1 = androidx.core.graphics.ColorUtils.setAlphaComponent(r1, r0)
            return r1
    }

    @androidx.annotation.ColorInt
    public static int getColor(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.AttrRes int r1, @androidx.annotation.ColorInt int r2) {
            android.util.TypedValue r1 = com.google.android.material.resources.MaterialAttributes.resolve(r0, r1)
            if (r1 == 0) goto Lb
            int r0 = resolveColor(r0, r1)
            return r0
        Lb:
            return r2
    }

    @androidx.annotation.ColorInt
    public static int getColor(android.content.Context r0, @androidx.annotation.AttrRes int r1, java.lang.String r2) {
            android.util.TypedValue r1 = com.google.android.material.resources.MaterialAttributes.resolveTypedValueOrThrow(r0, r1, r2)
            int r0 = resolveColor(r0, r1)
            return r0
    }

    @androidx.annotation.ColorInt
    public static int getColor(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.AttrRes int r2) {
            android.content.Context r0 = r1.getContext()
            android.util.TypedValue r1 = com.google.android.material.resources.MaterialAttributes.resolveTypedValueOrThrow(r1, r2)
            int r1 = resolveColor(r0, r1)
            return r1
    }

    @androidx.annotation.ColorInt
    public static int getColor(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.AttrRes int r1, @androidx.annotation.ColorInt int r2) {
            android.content.Context r0 = r0.getContext()
            int r0 = getColor(r0, r1, r2)
            return r0
    }

    @androidx.annotation.ColorInt
    private static int getColorRole(@androidx.annotation.ColorInt int r2, @androidx.annotation.IntRange(from = 0, to = 100) int r3) {
            com.google.android.material.color.utilities.Hct r2 = com.google.android.material.color.utilities.Hct.fromInt(r2)
            double r0 = (double) r3
            r2.setTone(r0)
            int r2 = r2.toInt()
            return r2
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.color.ColorRoles getColorRoles(@androidx.annotation.ColorInt int r4, boolean r5) {
            r0 = 90
            if (r5 == 0) goto L20
            com.google.android.material.color.ColorRoles r5 = new com.google.android.material.color.ColorRoles
            r1 = 40
            int r1 = getColorRole(r4, r1)
            r2 = 100
            int r2 = getColorRole(r4, r2)
            int r0 = getColorRole(r4, r0)
            r3 = 10
            int r4 = getColorRole(r4, r3)
            r5.<init>(r1, r2, r0, r4)
            goto L3b
        L20:
            com.google.android.material.color.ColorRoles r5 = new com.google.android.material.color.ColorRoles
            r1 = 80
            int r1 = getColorRole(r4, r1)
            r2 = 20
            int r2 = getColorRole(r4, r2)
            r3 = 30
            int r3 = getColorRole(r4, r3)
            int r4 = getColorRole(r4, r0)
            r5.<init>(r1, r2, r3, r4)
        L3b:
            return r5
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.color.ColorRoles getColorRoles(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.ColorInt int r3) {
            int r0 = com.google.android.material.R.attr.isLightTheme
            r1 = 1
            boolean r2 = com.google.android.material.resources.MaterialAttributes.resolveBoolean(r2, r0, r1)
            com.google.android.material.color.ColorRoles r2 = getColorRoles(r3, r2)
            return r2
    }

    @androidx.annotation.NonNull
    public static android.content.res.ColorStateList getColorStateList(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.AttrRes int r1, @androidx.annotation.NonNull android.content.res.ColorStateList r2) {
            android.util.TypedValue r1 = com.google.android.material.resources.MaterialAttributes.resolve(r0, r1)
            if (r1 == 0) goto Lb
            android.content.res.ColorStateList r0 = resolveColorStateList(r0, r1)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            r2 = r0
        L10:
            return r2
    }

    @androidx.annotation.Nullable
    public static android.content.res.ColorStateList getColorStateListOrNull(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.AttrRes int r3) {
            android.util.TypedValue r3 = com.google.android.material.resources.MaterialAttributes.resolve(r2, r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            int r1 = r3.resourceId
            if (r1 == 0) goto L11
            android.content.res.ColorStateList r2 = androidx.core.content.ContextCompat.getColorStateList(r2, r1)
            return r2
        L11:
            int r2 = r3.data
            if (r2 == 0) goto L1a
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            return r2
        L1a:
            return r0
    }

    @androidx.annotation.ColorInt
    public static int harmonize(@androidx.annotation.ColorInt int r0, @androidx.annotation.ColorInt int r1) {
            int r0 = com.google.android.material.color.utilities.Blend.harmonize(r0, r1)
            return r0
    }

    @androidx.annotation.ColorInt
    public static int harmonizeWithPrimary(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.ColorInt int r3) {
            int r0 = com.google.android.material.R.attr.colorPrimary
            java.lang.Class<com.google.android.material.color.MaterialColors> r1 = com.google.android.material.color.MaterialColors.class
            java.lang.String r1 = r1.getCanonicalName()
            int r2 = getColor(r2, r0, r1)
            int r2 = harmonize(r3, r2)
            return r2
    }

    public static boolean isColorLight(@androidx.annotation.ColorInt int r4) {
            if (r4 == 0) goto Le
            double r0 = androidx.core.graphics.ColorUtils.calculateLuminance(r4)
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Le
            r4 = 1
            goto Lf
        Le:
            r4 = 0
        Lf:
            return r4
    }

    @androidx.annotation.ColorInt
    public static int layer(@androidx.annotation.ColorInt int r0, @androidx.annotation.ColorInt int r1) {
            int r0 = androidx.core.graphics.ColorUtils.compositeColors(r1, r0)
            return r0
    }

    @androidx.annotation.ColorInt
    public static int layer(@androidx.annotation.ColorInt int r1, @androidx.annotation.ColorInt int r2, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r3) {
            int r0 = android.graphics.Color.alpha(r2)
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = java.lang.Math.round(r0)
            int r2 = androidx.core.graphics.ColorUtils.setAlphaComponent(r2, r3)
            int r1 = layer(r1, r2)
            return r1
    }

    @androidx.annotation.ColorInt
    public static int layer(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.AttrRes int r2, @androidx.annotation.AttrRes int r3) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = layer(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.ColorInt
    public static int layer(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.AttrRes int r1, @androidx.annotation.AttrRes int r2, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r3) {
            int r1 = getColor(r0, r1)
            int r0 = getColor(r0, r2)
            int r0 = layer(r1, r0, r3)
            return r0
    }

    private static int resolveColor(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.util.TypedValue r2) {
            int r0 = r2.resourceId
            if (r0 == 0) goto L9
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r0)
            return r1
        L9:
            int r1 = r2.data
            return r1
    }

    private static android.content.res.ColorStateList resolveColorStateList(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.util.TypedValue r2) {
            int r0 = r2.resourceId
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r1 = androidx.core.content.ContextCompat.getColorStateList(r1, r0)
            return r1
        L9:
            int r1 = r2.data
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            return r1
    }
}
