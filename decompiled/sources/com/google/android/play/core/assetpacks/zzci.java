package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzci implements android.content.ServiceConnection {
    private final com.google.android.play.core.internal.zzag zza;
    private final java.util.List zzb;
    private final android.content.Context zzc;

    @androidx.annotation.Nullable
    private com.google.android.play.core.assetpacks.ExtractionForegroundService zzd;

    @androidx.annotation.Nullable
    private android.app.Notification zze;

    public zzci(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "ExtractionForegroundServiceConnection"
            r0.<init>(r1)
            r2.zza = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zzb = r0
            r2.zzc = r3
            return
    }

    private final void zzd() {
            r7 = this;
            java.util.List r0 = r7.zzb
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L39
            java.util.List r2 = r7.zzb     // Catch: java.lang.Throwable -> L39
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L39
            java.util.List r2 = r7.zzb     // Catch: java.lang.Throwable -> L39
            r2.clear()     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            int r0 = r1.size()
            r2 = 0
            r3 = 0
        L16:
            if (r3 >= r0) goto L38
            java.lang.Object r4 = r1.get(r3)
            com.google.android.play.core.internal.zzz r4 = (com.google.android.play.core.internal.zzz) r4
            android.os.Bundle r5 = new android.os.Bundle     // Catch: android.os.RemoteException -> L2c
            r5.<init>()     // Catch: android.os.RemoteException -> L2c
            android.os.Bundle r6 = new android.os.Bundle     // Catch: android.os.RemoteException -> L2c
            r6.<init>()     // Catch: android.os.RemoteException -> L2c
            r4.zze(r5, r6)     // Catch: android.os.RemoteException -> L2c
            goto L35
        L2c:
            com.google.android.play.core.internal.zzag r4 = r7.zza
            java.lang.String r5 = "Could not resolve Play Store service state update callback."
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r4.zzb(r5, r6)
        L35:
            int r3 = r3 + 1
            goto L16
        L38:
            return
        L39:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r1
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
            r2 = this;
            com.google.android.play.core.internal.zzag r3 = r2.zza
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Starting foreground installation service."
            r3.zza(r1, r0)
            com.google.android.play.core.assetpacks.zzch r4 = (com.google.android.play.core.assetpacks.zzch) r4
            com.google.android.play.core.assetpacks.ExtractionForegroundService r3 = r4.zza
            r2.zzd = r3
            android.app.Notification r4 = r2.zze
            r0 = -1883842196(0xffffffff8fb6d96c, float:-1.8030333E-29)
            r3.startForeground(r0, r4)
            r2.zzd()
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r1) {
            r0 = this;
            return
    }

    public final void zza(android.app.Notification r1) {
            r0 = this;
            r0.zze = r1
            return
    }

    public final void zzb() {
            r3 = this;
            com.google.android.play.core.internal.zzag r0 = r3.zza
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Stopping foreground installation service."
            r0.zza(r2, r1)
            android.content.Context r0 = r3.zzc
            r0.unbindService(r3)
            com.google.android.play.core.assetpacks.ExtractionForegroundService r0 = r3.zzd
            if (r0 == 0) goto L16
            r0.zza()
        L16:
            r3.zzd()
            return
    }

    public final void zzc(com.google.android.play.core.internal.zzz r3) {
            r2 = this;
            java.util.List r0 = r2.zzb
            monitor-enter(r0)
            java.util.List r1 = r2.zzb     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }
}
