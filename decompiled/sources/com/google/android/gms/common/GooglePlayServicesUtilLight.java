package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
public class GooglePlayServicesUtilLight {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    @com.google.android.gms.common.util.VisibleForTesting
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.util.concurrent.atomic.AtomicBoolean sCanceledAvailabilityNotification = null;

    @com.google.android.gms.common.util.VisibleForTesting
    public static boolean zza;
    private static boolean zzb;
    private static final java.util.concurrent.atomic.AtomicBoolean zzc = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            com.google.android.gms.common.GooglePlayServicesUtilLight.sCanceledAvailabilityNotification = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            com.google.android.gms.common.GooglePlayServicesUtilLight.zzc = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public GooglePlayServicesUtilLight() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static void cancelAvailabilityErrorNotifications(@androidx.annotation.NonNull android.content.Context r2) {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.sCanceledAvailabilityNotification
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto La
            return
        La:
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.SecurityException -> L19
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2     // Catch: java.lang.SecurityException -> L19
            if (r2 == 0) goto L19
            r0 = 10436(0x28c4, float:1.4624E-41)
            r2.cancel(r0)     // Catch: java.lang.SecurityException -> L19
        L19:
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static void enableUsingApkIndependentContext() {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.zzc
            r1 = 1
            r0.set(r1)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static void ensurePlayServicesAvailable(@androidx.annotation.NonNull android.content.Context r2, int r3) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            int r3 = r0.isGooglePlayServicesAvailable(r2, r3)
            if (r3 == 0) goto L3c
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            java.lang.String r1 = "e"
            android.content.Intent r2 = r0.getErrorResolutionIntent(r2, r3, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 57
            r0.<init>(r1)
            java.lang.String r1 = "GooglePlayServices not available due to error "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GooglePlayServicesUtil"
            android.util.Log.e(r1, r0)
            if (r2 != 0) goto L34
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r2 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException
            r2.<init>(r3)
            throw r2
        L34:
            com.google.android.gms.common.GooglePlayServicesRepairableException r0 = new com.google.android.gms.common.GooglePlayServicesRepairableException
            java.lang.String r1 = "Google Play Services not available"
            r0.<init>(r3, r1, r2)
            throw r0
        L3c:
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static int getApkVersion(@androidx.annotation.NonNull android.content.Context r2) {
            r0 = 0
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            java.lang.String r1 = "com.google.android.gms"
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            int r2 = r2.versionCode
            return r2
        Le:
            java.lang.String r2 = "GooglePlayServicesUtil"
            java.lang.String r1 = "Google Play services is missing."
            android.util.Log.w(r2, r1)
            return r0
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static int getClientVersion(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = 1
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            java.lang.String r0 = r1.getPackageName()
            int r1 = com.google.android.gms.common.util.ClientLibraryUtils.getClientVersion(r1, r0)
            return r1
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static android.app.PendingIntent getErrorPendingIntent(int r1, @androidx.annotation.NonNull android.content.Context r2, int r3) {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            android.app.PendingIntent r1 = r0.getErrorResolutionPendingIntent(r2, r1, r3)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.util.VisibleForTesting
    @java.lang.Deprecated
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String getErrorString(int r0) {
            java.lang.String r0 = com.google.android.gms.common.ConnectionResult.zza(r0)
            return r0
    }

    @java.lang.Deprecated
    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.content.Intent getGooglePlayServicesAvailabilityRecoveryIntent(int r2) {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            r1 = 0
            android.content.Intent r2 = r0.getErrorResolutionIntent(r1, r2, r1)
            return r2
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.content.Context getRemoteContext(@androidx.annotation.NonNull android.content.Context r2) {
            java.lang.String r0 = "com.google.android.gms"
            r1 = 3
            android.content.Context r2 = r2.createPackageContext(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8
            return r2
        L8:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.content.res.Resources getRemoteResource(@androidx.annotation.NonNull android.content.Context r1) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb
            java.lang.String r0 = "com.google.android.gms"
            android.content.res.Resources r1 = r1.getResourcesForApplication(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean honorsDebugCertificates(@androidx.annotation.NonNull android.content.Context r5) {
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.zza
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L3b
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r5)     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            java.lang.String r3 = "com.google.android.gms"
            r4 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r4)     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            com.google.android.gms.common.GoogleSignatureVerifier.getInstance(r5)     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            if (r0 == 0) goto L26
            boolean r5 = com.google.android.gms.common.GoogleSignatureVerifier.zzb(r0, r1)     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            if (r5 != 0) goto L26
            boolean r5 = com.google.android.gms.common.GoogleSignatureVerifier.zzb(r0, r2)     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            if (r5 == 0) goto L26
            com.google.android.gms.common.GooglePlayServicesUtilLight.zzb = r2     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            goto L28
        L26:
            com.google.android.gms.common.GooglePlayServicesUtilLight.zzb = r1     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
        L28:
            com.google.android.gms.common.GooglePlayServicesUtilLight.zza = r2
            goto L3b
        L2b:
            r5 = move-exception
            goto L38
        L2d:
            r5 = move-exception
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r3 = "Cannot find Google Play services package name."
            android.util.Log.w(r0, r3, r5)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.common.GooglePlayServicesUtilLight.zza = r2
            goto L3b
        L38:
            com.google.android.gms.common.GooglePlayServicesUtilLight.zza = r2
            throw r5
        L3b:
            boolean r5 = com.google.android.gms.common.GooglePlayServicesUtilLight.zzb
            if (r5 != 0) goto L47
            boolean r5 = com.google.android.gms.common.util.DeviceProperties.isUserBuild()
            if (r5 != 0) goto L46
            goto L47
        L46:
            return r1
        L47:
            return r2
    }

    @com.google.android.gms.common.internal.HideFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(@androidx.annotation.NonNull android.content.Context r1) {
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            int r1 = isGooglePlayServicesAvailable(r1, r0)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(@androidx.annotation.NonNull android.content.Context r10, int r11) {
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r10.getResources()     // Catch: java.lang.Throwable -> Lc
            int r2 = com.google.android.gms.common.R.string.common_google_play_services_unknown_issue     // Catch: java.lang.Throwable -> Lc
            r1.getString(r2)     // Catch: java.lang.Throwable -> Lc
            goto L11
        Lc:
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L11:
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L3d
            java.util.concurrent.atomic.AtomicBoolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.zzc
            boolean r1 = r1.get()
            if (r1 == 0) goto L26
            goto L3d
        L26:
            int r1 = com.google.android.gms.common.internal.zzag.zza(r10)
            if (r1 == 0) goto L37
            int r3 = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            if (r1 != r3) goto L31
            goto L3d
        L31:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r10.<init>(r1)
            throw r10
        L37:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L3d:
            boolean r1 = com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(r10)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L4d
            boolean r1 = com.google.android.gms.common.util.DeviceProperties.zzb(r10)
            if (r1 != 0) goto L4d
            r1 = 1
            goto L4e
        L4d:
            r1 = 0
        L4e:
            if (r11 < 0) goto L52
            r5 = 1
            goto L53
        L52:
            r5 = 0
        L53:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r5)
            java.lang.String r5 = r10.getPackageName()
            android.content.pm.PackageManager r6 = r10.getPackageManager()
            r7 = 9
            if (r1 == 0) goto L7c
            java.lang.String r8 = "com.android.vending"
            r9 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r8 = r6.getPackageInfo(r8, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6b
            goto L7d
        L6b:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires the Google Play Store, but it is missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L78:
            r3 = 9
            goto L13d
        L7c:
            r8 = 0
        L7d:
            r9 = 64
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r2, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L130
            com.google.android.gms.common.GoogleSignatureVerifier.getInstance(r10)
            boolean r10 = com.google.android.gms.common.GoogleSignatureVerifier.zzb(r9, r3)
            if (r10 != 0) goto L9a
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but their signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L78
        L9a:
            if (r1 == 0) goto Lb3
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            boolean r10 = com.google.android.gms.common.GoogleSignatureVerifier.zzb(r8, r3)
            if (r10 != 0) goto Lb3
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L78
        Lb3:
            if (r1 == 0) goto Ld3
            if (r8 == 0) goto Ld3
            android.content.pm.Signature[] r10 = r8.signatures
            r10 = r10[r4]
            android.content.pm.Signature[] r1 = r9.signatures
            r1 = r1[r4]
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto Ld3
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L78
        Ld3:
            int r10 = r9.versionCode
            int r10 = com.google.android.gms.common.util.zza.zza(r10)
            int r1 = com.google.android.gms.common.util.zza.zza(r11)
            if (r10 >= r1) goto L111
            int r10 = r9.versionCode
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 82
            r2.<init>(r1)
            java.lang.String r1 = "Google Play services out of date for "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = ".  Requires "
            r2.append(r1)
            r2.append(r11)
            java.lang.String r11 = " but found "
            r2.append(r11)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            android.util.Log.w(r0, r10)
            r3 = 2
            goto L13d
        L111:
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo
            if (r10 != 0) goto L129
            android.content.pm.ApplicationInfo r10 = r6.getApplicationInfo(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L11a
            goto L129
        L11a:
            r10 = move-exception
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r1 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r11 = r11.concat(r1)
            android.util.Log.wtf(r0, r11, r10)
            goto L13d
        L129:
            boolean r10 = r10.enabled
            if (r10 != 0) goto L12f
            r3 = 3
            goto L13d
        L12f:
            return r4
        L130:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but they are missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L13d:
            return r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static boolean isGooglePlayServicesUid(@androidx.annotation.NonNull android.content.Context r0, int r1) {
            boolean r0 = com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(r0, r1)
            return r0
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static boolean isPlayServicesPossiblyUpdating(@androidx.annotation.NonNull android.content.Context r2, int r3) {
            r0 = 1
            r1 = 18
            if (r3 != r1) goto L6
            return r0
        L6:
            if (r3 != r0) goto Lf
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = zza(r2, r3)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static boolean isPlayStorePossiblyUpdating(@androidx.annotation.NonNull android.content.Context r1, int r2) {
            r0 = 9
            if (r2 != r0) goto Lb
            java.lang.String r2 = "com.android.vending"
            boolean r1 = zza(r1, r2)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(18)
    public static boolean isRestrictedUserProfile(@androidx.annotation.NonNull android.content.Context r1) {
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            if (r0 == 0) goto L2e
            java.lang.String r0 = "user"
            java.lang.Object r0 = r1.getSystemService(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.os.UserManager r0 = (android.os.UserManager) r0
            java.lang.String r1 = r1.getPackageName()
            android.os.Bundle r1 = r0.getApplicationRestrictions(r1)
            if (r1 == 0) goto L2e
            java.lang.String r0 = "restricted_profile"
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "true"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L2e
            r1 = 1
            return r1
        L2e:
            r1 = 0
            return r1
    }

    @com.google.android.gms.common.util.VisibleForTesting
    @java.lang.Deprecated
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isSidewinderDevice(@androidx.annotation.NonNull android.content.Context r0) {
            boolean r0 = com.google.android.gms.common.util.DeviceProperties.isSidewinder(r0)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static boolean isUserRecoverableError(int r2) {
            r0 = 1
            if (r2 == r0) goto Lf
            r1 = 2
            if (r2 == r1) goto Lf
            r1 = 3
            if (r2 == r1) goto Lf
            r1 = 9
            if (r2 == r1) goto Lf
            r2 = 0
            return r2
        Lf:
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(19)
    @java.lang.Deprecated
    public static boolean uidHasPackageName(@androidx.annotation.NonNull android.content.Context r0, int r1, @androidx.annotation.NonNull java.lang.String r2) {
            boolean r0 = com.google.android.gms.common.util.UidVerifier.uidHasPackageName(r0, r1, r2)
            return r0
    }

    @android.annotation.TargetApi(21)
    public static boolean zza(android.content.Context r5, java.lang.String r6) {
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r6.equals(r0)
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.Exception -> L35
            android.content.pm.PackageInstaller r1 = r1.getPackageInstaller()     // Catch: java.lang.Exception -> L35
            java.util.List r1 = r1.getAllSessions()     // Catch: java.lang.Exception -> L35
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L36
            java.lang.Object r4 = r1.next()
            android.content.pm.PackageInstaller$SessionInfo r4 = (android.content.pm.PackageInstaller.SessionInfo) r4
            java.lang.String r4 = r4.getAppPackageName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L1e
            return r2
        L35:
            return r3
        L36:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r4 = 8192(0x2000, float:1.148E-41)
            android.content.pm.ApplicationInfo r6 = r1.getApplicationInfo(r6, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            if (r0 == 0) goto L45
            boolean r5 = r6.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            return r5
        L45:
            boolean r6 = r6.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            if (r6 == 0) goto L50
            boolean r5 = isRestrictedUserProfile(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            if (r5 != 0) goto L50
            return r2
        L50:
            return r3
    }
}
