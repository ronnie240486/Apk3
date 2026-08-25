package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public final class UidVerifier {
    private UidVerifier() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isGooglePlayServicesUid(@androidx.annotation.NonNull android.content.Context r3, int r4) {
            java.lang.String r0 = "com.google.android.gms"
            boolean r4 = uidHasPackageName(r3, r4, r0)
            r1 = 0
            if (r4 != 0) goto La
            return r1
        La:
            android.content.pm.PackageManager r4 = r3.getPackageManager()
            r2 = 64
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1d
            com.google.android.gms.common.GoogleSignatureVerifier r3 = com.google.android.gms.common.GoogleSignatureVerifier.getInstance(r3)
            boolean r3 = r3.isGooglePublicSignedPackage(r4)
            return r3
        L1d:
            r3 = 3
            java.lang.String r4 = "UidVerifier"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L2b
            java.lang.String r3 = "Package manager can't find google play services package, defaulting to false"
            android.util.Log.d(r4, r3)
        L2b:
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(19)
    public static boolean uidHasPackageName(@androidx.annotation.NonNull android.content.Context r0, int r1, @androidx.annotation.NonNull java.lang.String r2) {
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)
            boolean r0 = r0.zza(r1, r2)
            return r0
    }
}
