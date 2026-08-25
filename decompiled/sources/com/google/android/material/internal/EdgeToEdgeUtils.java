package com.google.android.material.internal;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class EdgeToEdgeUtils {
    private static final int EDGE_TO_EDGE_BAR_ALPHA = 128;

    private EdgeToEdgeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void applyEdgeToEdge(@androidx.annotation.NonNull android.view.Window r1, boolean r2) {
            r0 = 0
            applyEdgeToEdge(r1, r2, r0, r0)
            return
    }

    public static void applyEdgeToEdge(@androidx.annotation.NonNull android.view.Window r5, boolean r6, @androidx.annotation.Nullable @androidx.annotation.ColorInt java.lang.Integer r7, @androidx.annotation.Nullable @androidx.annotation.ColorInt java.lang.Integer r8) {
            r0 = 0
            r1 = 1
            if (r7 == 0) goto Ld
            int r2 = r7.intValue()
            if (r2 != 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            if (r8 == 0) goto L16
            int r3 = r8.intValue()
            if (r3 != 0) goto L17
        L16:
            r0 = 1
        L17:
            if (r2 != 0) goto L1b
            if (r0 == 0) goto L34
        L1b:
            android.content.Context r1 = r5.getContext()
            r3 = 16842801(0x1010031, float:2.3693695E-38)
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r1 = com.google.android.material.color.MaterialColors.getColor(r1, r3, r4)
            if (r2 == 0) goto L2e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
        L2e:
            if (r0 == 0) goto L34
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
        L34:
            r0 = r6 ^ 1
            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(r5, r0)
            android.content.Context r0 = r5.getContext()
            int r0 = getStatusBarColor(r0, r6)
            android.content.Context r1 = r5.getContext()
            int r6 = getNavigationBarColor(r1, r6)
            r5.setStatusBarColor(r0)
            r5.setNavigationBarColor(r6)
            int r7 = r7.intValue()
            boolean r7 = com.google.android.material.color.MaterialColors.isColorLight(r7)
            boolean r7 = isUsingLightSystemBar(r0, r7)
            setLightStatusBar(r5, r7)
            int r7 = r8.intValue()
            boolean r7 = com.google.android.material.color.MaterialColors.isColorLight(r7)
            boolean r6 = isUsingLightSystemBar(r6, r7)
            setLightNavigationBar(r5, r6)
            return
    }

    @android.annotation.TargetApi(21)
    private static int getNavigationBarColor(android.content.Context r4, boolean r5) {
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = 16843858(0x1010452, float:2.3696658E-38)
            if (r5 == 0) goto L18
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 27
            if (r2 >= r3) goto L18
            int r4 = com.google.android.material.color.MaterialColors.getColor(r4, r1, r0)
            r5 = 128(0x80, float:1.8E-43)
            int r4 = androidx.core.graphics.ColorUtils.setAlphaComponent(r4, r5)
            return r4
        L18:
            if (r5 == 0) goto L1c
            r4 = 0
            return r4
        L1c:
            int r4 = com.google.android.material.color.MaterialColors.getColor(r4, r1, r0)
            return r4
    }

    @android.annotation.TargetApi(21)
    private static int getStatusBarColor(android.content.Context r4, boolean r5) {
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = 16843857(0x1010451, float:2.3696655E-38)
            if (r5 == 0) goto L18
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 >= r3) goto L18
            int r4 = com.google.android.material.color.MaterialColors.getColor(r4, r1, r0)
            r5 = 128(0x80, float:1.8E-43)
            int r4 = androidx.core.graphics.ColorUtils.setAlphaComponent(r4, r5)
            return r4
        L18:
            if (r5 == 0) goto L1c
            r4 = 0
            return r4
        L1c:
            int r4 = com.google.android.material.color.MaterialColors.getColor(r4, r1, r0)
            return r4
    }

    private static boolean isUsingLightSystemBar(int r1, boolean r2) {
            boolean r0 = com.google.android.material.color.MaterialColors.isColorLight(r1)
            if (r0 != 0) goto Ld
            if (r1 != 0) goto Lb
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            goto Le
        Ld:
            r1 = 1
        Le:
            return r1
    }

    public static void setLightNavigationBar(@androidx.annotation.NonNull android.view.Window r1, boolean r2) {
            android.view.View r0 = r1.getDecorView()
            androidx.core.view.WindowInsetsControllerCompat r1 = androidx.core.view.WindowCompat.getInsetsController(r1, r0)
            r1.setAppearanceLightNavigationBars(r2)
            return
    }

    public static void setLightStatusBar(@androidx.annotation.NonNull android.view.Window r1, boolean r2) {
            android.view.View r0 = r1.getDecorView()
            androidx.core.view.WindowInsetsControllerCompat r1 = androidx.core.view.WindowCompat.getInsetsController(r1, r0)
            r1.setAppearanceLightStatusBars(r2)
            return
    }
}
