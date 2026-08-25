package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.util.VisibleForTesting
@com.google.android.gms.common.annotation.KeepForSdk
public final class PlatformVersion {
    private PlatformVersion() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastHoneycomb() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastHoneycombMR1() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastIceCreamSandwich() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastIceCreamSandwichMR1() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastJellyBean() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastJellyBeanMR1() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastJellyBeanMR2() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastKitKat() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastKitKatWatch() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastLollipop() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastLollipopMR1() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastM() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastN() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastO() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastP() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastQ() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastR() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastS() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 31
            if (r0 < r2) goto L8
            return r1
        L8:
            boolean r0 = isAtLeastR()
            r2 = 0
            if (r0 != 0) goto L10
            return r2
        L10:
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            int r3 = r0.length()
            if (r3 != r1) goto L29
            char r3 = r0.charAt(r2)
            r4 = 83
            if (r3 < r4) goto L29
            char r0 = r0.charAt(r2)
            r3 = 90
            if (r0 > r3) goto L29
            return r1
        L29:
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastT() {
            boolean r0 = isAtLeastS()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            char r2 = r0.charAt(r1)
            r3 = 84
            if (r2 < r3) goto L1c
            char r0 = r0.charAt(r1)
            r2 = 90
            if (r0 > r2) goto L1c
            r0 = 1
            return r0
        L1c:
            return r1
    }
}
