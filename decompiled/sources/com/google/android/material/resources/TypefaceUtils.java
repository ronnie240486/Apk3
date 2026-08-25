package com.google.android.material.resources;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class TypefaceUtils {
    private TypefaceUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.graphics.Typeface maybeCopyWithFontWeightAdjustment(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.NonNull android.graphics.Typeface r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.graphics.Typeface r0 = maybeCopyWithFontWeightAdjustment(r0, r1)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.Typeface maybeCopyWithFontWeightAdjustment(@androidx.annotation.NonNull android.content.res.Configuration r2, @androidx.annotation.NonNull android.graphics.Typeface r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L28
            int r0 = r2.fontWeightAdjustment
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L28
            if (r0 == 0) goto L28
            if (r3 == 0) goto L28
            int r0 = r3.getWeight()
            int r2 = r2.fontWeightAdjustment
            int r0 = r0 + r2
            r2 = 1
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = androidx.core.math.MathUtils.clamp(r0, r2, r1)
            boolean r0 = r3.isItalic()
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r3, r2, r0)
            return r2
        L28:
            r2 = 0
            return r2
    }
}
