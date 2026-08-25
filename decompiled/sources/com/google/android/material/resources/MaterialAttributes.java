package com.google.android.material.resources;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialAttributes {
    public MaterialAttributes() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.util.TypedValue resolve(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.AttrRes int r3) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r1 = 1
            boolean r2 = r2.resolveAttribute(r3, r0, r1)
            if (r2 == 0) goto L11
            return r0
        L11:
            r2 = 0
            return r2
    }

    public static boolean resolveBoolean(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.AttrRes int r2, boolean r3) {
            android.util.TypedValue r1 = resolve(r1, r2)
            if (r1 == 0) goto L13
            int r2 = r1.type
            r0 = 18
            if (r2 != r0) goto L13
            int r1 = r1.data
            if (r1 == 0) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            return r3
    }

    public static boolean resolveBooleanOrThrow(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.AttrRes int r1, @androidx.annotation.NonNull java.lang.String r2) {
            int r0 = resolveOrThrow(r0, r1, r2)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @androidx.annotation.Px
    public static int resolveDimension(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.AttrRes int r3, @androidx.annotation.DimenRes int r4) {
            android.util.TypedValue r3 = resolve(r2, r3)
            if (r3 == 0) goto L1a
            int r0 = r3.type
            r1 = 5
            if (r0 == r1) goto Lc
            goto L1a
        Lc:
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r3.getDimension(r2)
        L18:
            int r2 = (int) r2
            return r2
        L1a:
            android.content.res.Resources r2 = r2.getResources()
            float r2 = r2.getDimension(r4)
            goto L18
    }

    public static int resolveInteger(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.AttrRes int r2, int r3) {
            android.util.TypedValue r1 = resolve(r1, r2)
            if (r1 == 0) goto Le
            int r2 = r1.type
            r0 = 16
            if (r2 != r0) goto Le
            int r3 = r1.data
        Le:
            return r3
    }

    @androidx.annotation.Px
    public static int resolveMinimumAccessibleTouchTarget(@androidx.annotation.NonNull android.content.Context r2) {
            int r0 = com.google.android.material.R.attr.minTouchTargetSize
            int r1 = com.google.android.material.R.dimen.mtrl_min_touch_target_size
            int r2 = resolveDimension(r2, r0, r1)
            return r2
    }

    public static int resolveOrThrow(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.AttrRes int r1, @androidx.annotation.NonNull java.lang.String r2) {
            android.util.TypedValue r0 = resolveTypedValueOrThrow(r0, r1, r2)
            int r0 = r0.data
            return r0
    }

    public static int resolveOrThrow(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.AttrRes int r1) {
            android.util.TypedValue r0 = resolveTypedValueOrThrow(r0, r1)
            int r0 = r0.data
            return r0
    }

    @androidx.annotation.NonNull
    public static android.util.TypedValue resolveTypedValueOrThrow(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.AttrRes int r4, @androidx.annotation.NonNull java.lang.String r5) {
            android.util.TypedValue r0 = resolve(r3, r4)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r4)
            r1[r5] = r3
            java.lang.String r3 = "%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant)."
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    @androidx.annotation.NonNull
    public static android.util.TypedValue resolveTypedValueOrThrow(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.AttrRes int r2) {
            android.content.Context r0 = r1.getContext()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            android.util.TypedValue r1 = resolveTypedValueOrThrow(r0, r2, r1)
            return r1
    }
}
