package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzed {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private final android.content.Context zzb;
    private int zzc;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "PackageStateCache"
            r0.<init>(r1)
            com.google.android.play.core.assetpacks.zzed.zza = r0
            return
    }

    public zzed(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.zzc = r0
            r1.zzb = r2
            return
    }

    public final synchronized int zza() {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.zzc     // Catch: java.lang.Throwable -> L29
            r1 = -1
            if (r0 != r1) goto L25
            r0 = 0
            android.content.Context r1 = r3.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1c java.lang.Throwable -> L29
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1c java.lang.Throwable -> L29
            android.content.Context r2 = r3.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1c java.lang.Throwable -> L29
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1c java.lang.Throwable -> L29
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1c java.lang.Throwable -> L29
            int r1 = r1.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1c java.lang.Throwable -> L29
            r3.zzc = r1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1c java.lang.Throwable -> L29
            goto L25
        L1c:
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.assetpacks.zzed.zza     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "The current version of the app could not be retrieved"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L29
            r1.zzb(r2, r0)     // Catch: java.lang.Throwable -> L29
        L25:
            int r0 = r3.zzc     // Catch: java.lang.Throwable -> L29
            monitor-exit(r3)
            return r0
        L29:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }
}
