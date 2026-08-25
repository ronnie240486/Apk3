package com.google.android.gms.common.wrappers;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class InstantApps {
    private static android.content.Context zza;

    @androidx.annotation.Nullable
    private static java.lang.Boolean zzb;

    public InstantApps() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static synchronized boolean isInstantApp(@androidx.annotation.NonNull android.content.Context r4) {
            java.lang.Class<com.google.android.gms.common.wrappers.InstantApps> r0 = com.google.android.gms.common.wrappers.InstantApps.class
            monitor-enter(r0)
            android.content.Context r1 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L4c
            android.content.Context r2 = com.google.android.gms.common.wrappers.InstantApps.zza     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L18
            java.lang.Boolean r3 = com.google.android.gms.common.wrappers.InstantApps.zzb     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L18
            if (r2 == r1) goto L12
            goto L18
        L12:
            boolean r4 = r3.booleanValue()     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r0)
            return r4
        L18:
            r2 = 0
            com.google.android.gms.common.wrappers.InstantApps.zzb = r2     // Catch: java.lang.Throwable -> L4c
            boolean r2 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L30
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L4c
            boolean r4 = r4.isInstantApp()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.common.wrappers.InstantApps.zzb = r4     // Catch: java.lang.Throwable -> L4c
            goto L42
        L30:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L3e java.lang.Throwable -> L4c
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r2)     // Catch: java.lang.ClassNotFoundException -> L3e java.lang.Throwable -> L4c
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.ClassNotFoundException -> L3e java.lang.Throwable -> L4c
            com.google.android.gms.common.wrappers.InstantApps.zzb = r4     // Catch: java.lang.ClassNotFoundException -> L3e java.lang.Throwable -> L4c
            goto L42
        L3e:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.common.wrappers.InstantApps.zzb = r4     // Catch: java.lang.Throwable -> L4c
        L42:
            com.google.android.gms.common.wrappers.InstantApps.zza = r1     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r4 = com.google.android.gms.common.wrappers.InstantApps.zzb     // Catch: java.lang.Throwable -> L4c
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r0)
            return r4
        L4c:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }
}
