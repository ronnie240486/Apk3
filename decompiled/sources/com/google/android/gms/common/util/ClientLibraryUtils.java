package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class ClientLibraryUtils {
    private ClientLibraryUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int getClientVersion(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2) {
            android.content.pm.PackageInfo r1 = getPackageInfo(r1, r2)
            r2 = -1
            if (r1 == 0) goto L17
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo
            if (r1 != 0) goto Lc
            goto L17
        Lc:
            android.os.Bundle r1 = r1.metaData
            if (r1 == 0) goto L17
            java.lang.String r0 = "com.google.android.gms.version"
            int r1 = r1.getInt(r0, r2)
            return r1
        L17:
            return r2
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.content.pm.PackageInfo getPackageInfo(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2) {
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb
            r0 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isPackageSide() {
            r0 = 0
            return r0
    }
}
