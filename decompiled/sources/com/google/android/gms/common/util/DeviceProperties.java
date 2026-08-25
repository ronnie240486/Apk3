package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public final class DeviceProperties {

    @androidx.annotation.Nullable
    private static java.lang.Boolean zza;

    @androidx.annotation.Nullable
    private static java.lang.Boolean zzb;

    @androidx.annotation.Nullable
    private static java.lang.Boolean zzc;

    @androidx.annotation.Nullable
    private static java.lang.Boolean zzd;

    @androidx.annotation.Nullable
    private static java.lang.Boolean zze;

    @androidx.annotation.Nullable
    private static java.lang.Boolean zzf;

    @androidx.annotation.Nullable
    private static java.lang.Boolean zzg;

    @androidx.annotation.Nullable
    private static java.lang.Boolean zzh;

    @androidx.annotation.Nullable
    private static java.lang.Boolean zzi;

    @androidx.annotation.Nullable
    private static java.lang.Boolean zzj;

    @androidx.annotation.Nullable
    private static java.lang.Boolean zzk;

    @androidx.annotation.Nullable
    private static java.lang.Boolean zzl;

    private DeviceProperties() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAuto(@androidx.annotation.NonNull android.content.Context r2) {
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzi
            if (r0 != 0) goto L1e
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            r1 = 0
            if (r0 == 0) goto L18
            java.lang.String r0 = "android.hardware.type.automotive"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L18
            r1 = 1
        L18:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zzi = r2
        L1e:
            java.lang.Boolean r2 = com.google.android.gms.common.util.DeviceProperties.zzi
            boolean r2 = r2.booleanValue()
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isBstar(@androidx.annotation.NonNull android.content.Context r2) {
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzl
            if (r0 != 0) goto L1e
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastR()
            r1 = 0
            if (r0 == 0) goto L18
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "com.google.android.play.feature.HPE_EXPERIENCE"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L18
            r1 = 1
        L18:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zzl = r2
        L1e:
            java.lang.Boolean r2 = com.google.android.gms.common.util.DeviceProperties.zzl
            boolean r2 = r2.booleanValue()
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isLatchsky(@androidx.annotation.NonNull android.content.Context r2) {
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzf
            if (r0 != 0) goto L20
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "com.google.android.feature.services_updater"
            boolean r0 = r2.hasSystemFeature(r0)
            r1 = 0
            if (r0 == 0) goto L1a
            java.lang.String r0 = "cn.google.services"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L1a
            r1 = 1
        L1a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zzf = r2
        L20:
            java.lang.Boolean r2 = com.google.android.gms.common.util.DeviceProperties.zzf
            boolean r2 = r2.booleanValue()
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isPhone(@androidx.annotation.NonNull android.content.Context r3) {
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zza
            if (r0 != 0) goto L68
            boolean r0 = isTablet(r3)
            r1 = 0
            if (r0 != 0) goto L62
            boolean r0 = isWearable(r3)
            if (r0 != 0) goto L62
            boolean r0 = zzb(r3)
            if (r0 != 0) goto L62
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzh
            if (r0 != 0) goto L2b
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            java.lang.String r2 = "org.chromium.arc"
            boolean r0 = r0.hasSystemFeature(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.DeviceProperties.zzh = r0
        L2b:
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzh
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L62
            boolean r0 = isAuto(r3)
            if (r0 != 0) goto L62
            boolean r0 = isTv(r3)
            if (r0 != 0) goto L62
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzk
            if (r0 != 0) goto L53
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            java.lang.String r2 = "com.google.android.feature.AMATI_EXPERIENCE"
            boolean r0 = r0.hasSystemFeature(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.DeviceProperties.zzk = r0
        L53:
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzk
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L62
            boolean r3 = isBstar(r3)
            if (r3 != 0) goto L62
            r1 = 1
        L62:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zza = r3
        L68:
            java.lang.Boolean r3 = com.google.android.gms.common.util.DeviceProperties.zza
            boolean r3 = r3.booleanValue()
            return r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isSevenInchTablet(@androidx.annotation.NonNull android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            boolean r0 = zzc(r0)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(21)
    public static boolean isSidewinder(@androidx.annotation.NonNull android.content.Context r0) {
            boolean r0 = zza(r0)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isTablet(@androidx.annotation.NonNull android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            boolean r0 = isTablet(r0)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isTablet(@androidx.annotation.NonNull android.content.res.Resources r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.Boolean r1 = com.google.android.gms.common.util.DeviceProperties.zzb
            if (r1 != 0) goto L23
            android.content.res.Configuration r1 = r4.getConfiguration()
            int r1 = r1.screenLayout
            r1 = r1 & 15
            r2 = 3
            r3 = 1
            if (r1 <= r2) goto L16
        L14:
            r0 = 1
            goto L1d
        L16:
            boolean r4 = zzc(r4)
            if (r4 == 0) goto L1d
            goto L14
        L1d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.DeviceProperties.zzb = r4
        L23:
            java.lang.Boolean r4 = com.google.android.gms.common.util.DeviceProperties.zzb
            boolean r4 = r4.booleanValue()
            return r4
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isTv(@androidx.annotation.NonNull android.content.Context r2) {
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzj
            if (r0 != 0) goto L29
            java.lang.String r0 = "com.google.android.tv"
            boolean r0 = r2.hasSystemFeature(r0)
            r1 = 1
            if (r0 != 0) goto L23
            java.lang.String r0 = "android.hardware.type.television"
            boolean r0 = r2.hasSystemFeature(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "android.software.leanback"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L22
            goto L23
        L22:
            r1 = 0
        L23:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zzj = r2
        L29:
            java.lang.Boolean r2 = com.google.android.gms.common.util.DeviceProperties.zzj
            boolean r2 = r2.booleanValue()
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isUserBuild() {
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            java.lang.String r0 = android.os.Build.TYPE
            java.lang.String r1 = "user"
            boolean r0 = r1.equals(r0)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(20)
    public static boolean isWearable(@androidx.annotation.NonNull android.content.Context r2) {
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzd
            if (r0 != 0) goto L1e
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKatWatch()
            r1 = 0
            if (r0 == 0) goto L18
            java.lang.String r0 = "android.hardware.type.watch"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L18
            r1 = 1
        L18:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zzd = r2
        L1e:
            java.lang.Boolean r2 = com.google.android.gms.common.util.DeviceProperties.zzd
            boolean r2 = r2.booleanValue()
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(26)
    public static boolean isWearableWithoutPlayStore(@androidx.annotation.NonNull android.content.Context r3) {
            boolean r0 = isWearable(r3)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1c
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastN()
            if (r0 == 0) goto L1d
            boolean r3 = zza(r3)
            if (r3 == 0) goto L1c
            boolean r3 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            if (r3 == 0) goto L1b
            goto L1c
        L1b:
            return r1
        L1c:
            r1 = 0
        L1d:
            return r1
    }

    @android.annotation.TargetApi(21)
    public static boolean zza(@androidx.annotation.NonNull android.content.Context r2) {
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zze
            if (r0 != 0) goto L1e
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()
            r1 = 0
            if (r0 == 0) goto L18
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "cn.google"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L18
            r1 = 1
        L18:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zze = r2
        L1e:
            java.lang.Boolean r2 = com.google.android.gms.common.util.DeviceProperties.zze
            boolean r2 = r2.booleanValue()
            return r2
    }

    public static boolean zzb(@androidx.annotation.NonNull android.content.Context r2) {
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzg
            if (r0 != 0) goto L25
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            java.lang.String r1 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r1)
            r1 = 1
            if (r0 != 0) goto L1f
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "android.hardware.type.embedded"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zzg = r2
        L25:
            java.lang.Boolean r2 = com.google.android.gms.common.util.DeviceProperties.zzg
            boolean r2 = r2.booleanValue()
            return r2
    }

    public static boolean zzc(@androidx.annotation.NonNull android.content.res.Resources r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.Boolean r1 = com.google.android.gms.common.util.DeviceProperties.zzc
            if (r1 != 0) goto L20
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r1 = r3.screenLayout
            r1 = r1 & 15
            r2 = 3
            if (r1 > r2) goto L1a
            int r3 = r3.smallestScreenWidthDp
            r1 = 600(0x258, float:8.41E-43)
            if (r3 < r1) goto L1a
            r0 = 1
        L1a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.DeviceProperties.zzc = r3
        L20:
            java.lang.Boolean r3 = com.google.android.gms.common.util.DeviceProperties.zzc
            boolean r3 = r3.booleanValue()
            return r3
    }
}
