package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public final class RootTelemetryConfigManager {

    @androidx.annotation.Nullable
    private static com.google.android.gms.common.internal.RootTelemetryConfigManager zza;
    private static final com.google.android.gms.common.internal.RootTelemetryConfiguration zzb = null;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.internal.RootTelemetryConfiguration zzc;

    static {
            com.google.android.gms.common.internal.RootTelemetryConfiguration r6 = new com.google.android.gms.common.internal.RootTelemetryConfiguration
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.common.internal.RootTelemetryConfigManager.zzb = r6
            return
    }

    private RootTelemetryConfigManager() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static synchronized com.google.android.gms.common.internal.RootTelemetryConfigManager getInstance() {
            java.lang.Class<com.google.android.gms.common.internal.RootTelemetryConfigManager> r0 = com.google.android.gms.common.internal.RootTelemetryConfigManager.class
            monitor-enter(r0)
            com.google.android.gms.common.internal.RootTelemetryConfigManager r1 = com.google.android.gms.common.internal.RootTelemetryConfigManager.zza     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            com.google.android.gms.common.internal.RootTelemetryConfigManager r1 = new com.google.android.gms.common.internal.RootTelemetryConfigManager     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.common.internal.RootTelemetryConfigManager.zza = r1     // Catch: java.lang.Throwable -> L12
        Le:
            com.google.android.gms.common.internal.RootTelemetryConfigManager r1 = com.google.android.gms.common.internal.RootTelemetryConfigManager.zza     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.internal.RootTelemetryConfiguration getConfig() {
            r1 = this;
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r1.zzc
            return r0
    }

    @com.google.android.gms.common.util.VisibleForTesting
    public final synchronized void zza(@androidx.annotation.Nullable com.google.android.gms.common.internal.RootTelemetryConfiguration r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L9
            com.google.android.gms.common.internal.RootTelemetryConfiguration r3 = com.google.android.gms.common.internal.RootTelemetryConfigManager.zzb     // Catch: java.lang.Throwable -> L1e
            r2.zzc = r3     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)
            return
        L9:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r2.zzc     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1a
            int r0 = r0.getVersion()     // Catch: java.lang.Throwable -> L1e
            int r1 = r3.getVersion()     // Catch: java.lang.Throwable -> L1e
            if (r0 >= r1) goto L18
            goto L1a
        L18:
            monitor-exit(r2)
            return
        L1a:
            r2.zzc = r3     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)
            return
        L1e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
