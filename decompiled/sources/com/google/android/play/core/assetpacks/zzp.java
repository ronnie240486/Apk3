package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzp {
    private final android.content.Context zza;

    public zzp(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @androidx.annotation.Nullable
    public static java.lang.String zzb(android.content.Context r3) {
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r1.getApplicationInfo(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            android.os.Bundle r3 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            if (r3 != 0) goto L14
            return r0
        L14:
            java.lang.String r0 = "local_testing_dir"
            java.lang.String r3 = r3.getString(r0)
            return r3
        L1b:
            return r0
    }

    public final android.content.Context zza() {
            r1 = this;
            android.content.Context r0 = r1.zza
            return r0
    }
}
