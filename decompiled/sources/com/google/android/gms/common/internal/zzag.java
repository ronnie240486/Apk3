package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzag {
    private static final java.lang.Object zza = null;

    @javax.annotation.concurrent.GuardedBy("sLock")
    private static boolean zzb;

    @androidx.annotation.Nullable
    private static java.lang.String zzc;
    private static int zzd;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.internal.zzag.zza = r0
            return
    }

    public static int zza(android.content.Context r0) {
            zzc(r0)
            int r0 = com.google.android.gms.common.internal.zzag.zzd
            return r0
    }

    @androidx.annotation.Nullable
    public static java.lang.String zzb(android.content.Context r0) {
            zzc(r0)
            java.lang.String r0 = com.google.android.gms.common.internal.zzag.zzc
            return r0
    }

    private static void zzc(android.content.Context r3) {
            java.lang.Object r0 = com.google.android.gms.common.internal.zzag.zza
            monitor-enter(r0)
            boolean r1 = com.google.android.gms.common.internal.zzag.zzb     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return
        L9:
            r1 = 1
            com.google.android.gms.common.internal.zzag.zzb = r1     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: java.lang.Throwable -> L3b
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31 java.lang.Throwable -> L3b
            android.os.Bundle r3 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31 java.lang.Throwable -> L3b
            if (r3 != 0) goto L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return
        L20:
            java.lang.String r1 = "com.google.app.id"
            java.lang.String r1 = r3.getString(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31 java.lang.Throwable -> L3b
            com.google.android.gms.common.internal.zzag.zzc = r1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31 java.lang.Throwable -> L3b
            java.lang.String r1 = "com.google.android.gms.version"
            int r3 = r3.getInt(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31 java.lang.Throwable -> L3b
            com.google.android.gms.common.internal.zzag.zzd = r3     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31 java.lang.Throwable -> L3b
            goto L39
        L31:
            r3 = move-exception
            java.lang.String r1 = "MetadataValueReader"
            java.lang.String r2 = "This should never happen."
            android.util.Log.wtf(r1, r2, r3)     // Catch: java.lang.Throwable -> L3b
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return
        L3b:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r3
    }
}
