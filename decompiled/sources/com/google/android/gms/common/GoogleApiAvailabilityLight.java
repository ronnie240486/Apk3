package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
public class GoogleApiAvailabilityLight {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zza = null;

    static {
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE = r0
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = new com.google.android.gms.common.GoogleApiAvailabilityLight
            r0.<init>()
            com.google.android.gms.common.GoogleApiAvailabilityLight.zza = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public GoogleApiAvailabilityLight() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.GoogleApiAvailabilityLight getInstance() {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.zza
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void cancelAvailabilityErrorNotifications(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            com.google.android.gms.common.GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(r1)
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public int getApkVersion(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            int r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.getApkVersion(r1)
            return r1
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public int getClientVersion(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            int r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.getClientVersion(r1)
            return r1
    }

    @java.lang.Deprecated
    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.content.Intent getErrorResolutionIntent(int r2) {
            r1 = this;
            r0 = 0
            android.content.Intent r2 = r1.getErrorResolutionIntent(r0, r2, r0)
            return r2
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.content.Intent getErrorResolutionIntent(@androidx.annotation.Nullable android.content.Context r4, int r5, @androidx.annotation.Nullable java.lang.String r6) {
            r3 = this;
            r0 = 1
            java.lang.String r1 = "com.google.android.gms"
            if (r5 == r0) goto L12
            r0 = 2
            if (r5 == r0) goto L12
            r4 = 3
            if (r5 == r4) goto Ld
            r4 = 0
            return r4
        Ld:
            android.content.Intent r4 = com.google.android.gms.common.internal.zzt.zzc(r1)
            return r4
        L12:
            if (r4 == 0) goto L20
            boolean r5 = com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(r4)
            if (r5 != 0) goto L1b
            goto L20
        L1b:
            android.content.Intent r4 = com.google.android.gms.common.internal.zzt.zza()
            return r4
        L20:
            java.lang.String r5 = "gcore_"
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            r5.append(r0)
            java.lang.String r0 = "-"
            r5.append(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L39
            r5.append(r6)
        L39:
            r5.append(r0)
            if (r4 == 0) goto L45
            java.lang.String r6 = r4.getPackageName()
            r5.append(r6)
        L45:
            r5.append(r0)
            if (r4 == 0) goto L5c
            com.google.android.gms.common.wrappers.PackageManagerWrapper r6 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            r0 = 0
            android.content.pm.PackageInfo r4 = r6.getPackageInfo(r4, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            int r4 = r4.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            r5.append(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
        L5c:
            java.lang.String r4 = r5.toString()
            android.content.Intent r4 = com.google.android.gms.common.internal.zzt.zzb(r1, r4)
            return r4
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.app.PendingIntent getErrorResolutionPendingIntent(@androidx.annotation.NonNull android.content.Context r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            android.app.PendingIntent r2 = r1.getErrorResolutionPendingIntent(r2, r3, r4, r0)
            return r2
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.app.PendingIntent getErrorResolutionPendingIntent(@androidx.annotation.NonNull android.content.Context r2, int r3, int r4, @androidx.annotation.Nullable java.lang.String r5) {
            r1 = this;
            android.content.Intent r3 = r1.getErrorResolutionIntent(r2, r3, r5)
            if (r3 != 0) goto L8
            r2 = 0
            return r2
        L8:
            int r5 = com.google.android.gms.internal.common.zzd.zza
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r5 = r5 | r0
            android.app.PendingIntent r2 = com.google.android.gms.internal.common.zzd.zza(r2, r4, r3, r5)
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getErrorString(int r1) {
            r0 = this;
            java.lang.String r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.getErrorString(r1)
            return r1
    }

    @com.google.android.gms.common.internal.HideFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public int isGooglePlayServicesAvailable(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            int r2 = r1.isGooglePlayServicesAvailable(r2, r0)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int isGooglePlayServicesAvailable(@androidx.annotation.NonNull android.content.Context r1, int r2) {
            r0 = this;
            int r2 = com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(r1, r2)
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(r1, r2)
            if (r1 == 0) goto Ld
            r1 = 18
            return r1
        Ld:
            return r2
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isPlayServicesPossiblyUpdating(@androidx.annotation.NonNull android.content.Context r1, int r2) {
            r0 = this;
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(r1, r2)
            return r1
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isPlayStorePossiblyUpdating(@androidx.annotation.NonNull android.content.Context r1, int r2) {
            r0 = this;
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(r1, r2)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isUninstalledAppPossiblyUpdating(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2) {
            r0 = this;
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.zza(r1, r2)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isUserResolvableError(int r1) {
            r0 = this;
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isUserRecoverableError(r1)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void verifyGooglePlayServicesIsAvailable(@androidx.annotation.NonNull android.content.Context r1, int r2) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
            r0 = this;
            com.google.android.gms.common.GooglePlayServicesUtilLight.ensurePlayServicesAvailable(r1, r2)
            return
    }
}
