package com.google.android.material.motion;

/* JADX INFO: loaded from: classes.dex */
public class MotionUtils {
    private static final java.lang.String EASING_TYPE_CUBIC_BEZIER = "cubic-bezier";
    private static final java.lang.String EASING_TYPE_FORMAT_END = ")";
    private static final java.lang.String EASING_TYPE_FORMAT_START = "(";
    private static final java.lang.String EASING_TYPE_PATH = "path";

    private MotionUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static float getLegacyControlPoint(java.lang.String[] r2, int r3) {
            r2 = r2[r3]
            float r2 = java.lang.Float.parseFloat(r2)
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L12
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 > 0) goto L12
            return r2
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Motion easing control point value must be between 0 and 1; instead got: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    private static java.lang.String getLegacyEasingContent(java.lang.String r1, java.lang.String r2) {
            int r2 = r2.length()
            int r2 = r2 + 1
            int r0 = r1.length()
            int r0 = r0 + (-1)
            java.lang.String r1 = r1.substring(r2, r0)
            return r1
    }

    private static android.animation.TimeInterpolator getLegacyThemeInterpolator(java.lang.String r4) {
            java.lang.String r0 = "cubic-bezier"
            boolean r1 = isLegacyEasingType(r4, r0)
            if (r1 == 0) goto L43
            java.lang.String r4 = getLegacyEasingContent(r4, r0)
            java.lang.String r0 = ","
            java.lang.String[] r4 = r4.split(r0)
            int r0 = r4.length
            r1 = 4
            if (r0 != r1) goto L2f
            r0 = 0
            float r0 = getLegacyControlPoint(r4, r0)
            r1 = 1
            float r1 = getLegacyControlPoint(r4, r1)
            r2 = 2
            float r2 = getLegacyControlPoint(r4, r2)
            r3 = 3
            float r4 = getLegacyControlPoint(r4, r3)
            android.view.animation.Interpolator r4 = androidx.core.view.animation.PathInterpolatorCompat.create(r0, r1, r2, r4)
            return r4
        L2f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r4 = r4.length
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L43:
            java.lang.String r0 = "path"
            boolean r1 = isLegacyEasingType(r4, r0)
            if (r1 == 0) goto L58
            java.lang.String r4 = getLegacyEasingContent(r4, r0)
            android.graphics.Path r4 = androidx.core.graphics.PathParser.createPathFromPathData(r4)
            android.view.animation.Interpolator r4 = androidx.core.view.animation.PathInterpolatorCompat.create(r4)
            return r4
        L58:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid motion easing type: "
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4)
            r0.<init>(r4)
            throw r0
    }

    private static boolean isLegacyEasingAttribute(java.lang.String r1) {
            java.lang.String r0 = "cubic-bezier"
            boolean r0 = isLegacyEasingType(r1, r0)
            if (r0 != 0) goto L13
            java.lang.String r0 = "path"
            boolean r1 = isLegacyEasingType(r1, r0)
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            return r1
    }

    private static boolean isLegacyEasingType(java.lang.String r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "("
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L21
            java.lang.String r2 = ")"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L21
            r1 = 1
            goto L22
        L21:
            r1 = 0
        L22:
            return r1
    }

    public static int resolveThemeDuration(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.AttrRes int r1, int r2) {
            int r0 = com.google.android.material.resources.MaterialAttributes.resolveInteger(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.animation.TimeInterpolator resolveThemeInterpolator(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.AttrRes int r4, @androidx.annotation.NonNull android.animation.TimeInterpolator r5) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r3.getTheme()
            r2 = 1
            boolean r4 = r1.resolveAttribute(r4, r0, r2)
            if (r4 != 0) goto L11
            return r5
        L11:
            int r4 = r0.type
            r5 = 3
            if (r4 != r5) goto L2e
            java.lang.CharSequence r4 = r0.string
            java.lang.String r4 = java.lang.String.valueOf(r4)
            boolean r5 = isLegacyEasingAttribute(r4)
            if (r5 == 0) goto L27
            android.animation.TimeInterpolator r3 = getLegacyThemeInterpolator(r4)
            return r3
        L27:
            int r4 = r0.resourceId
            android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r3, r4)
            return r3
        L2e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes."
            r3.<init>(r4)
            throw r3
    }
}
