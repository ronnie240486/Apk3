package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzr extends com.google.android.gms.common.internal.GmsClientSupervisor {

    @javax.annotation.concurrent.GuardedBy("connectionStatus")
    private final java.util.HashMap<com.google.android.gms.common.internal.zzn, com.google.android.gms.common.internal.zzo> zzb;
    private final android.content.Context zzc;
    private volatile android.os.Handler zzd;
    private final com.google.android.gms.common.internal.zzq zze;
    private final com.google.android.gms.common.stats.ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;

    public zzr(android.content.Context r2, android.os.Looper r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzb = r0
            com.google.android.gms.common.internal.zzq r0 = new com.google.android.gms.common.internal.zzq
            r0.<init>(r1)
            r1.zze = r0
            android.content.Context r2 = r2.getApplicationContext()
            r1.zzc = r2
            com.google.android.gms.internal.common.zzi r2 = new com.google.android.gms.internal.common.zzi
            r2.<init>(r3, r0)
            r1.zzd = r2
            com.google.android.gms.common.stats.ConnectionTracker r2 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()
            r1.zzf = r2
            r2 = 5000(0x1388, double:2.4703E-320)
            r1.zzg = r2
            r2 = 300000(0x493e0, double:1.482197E-318)
            r1.zzh = r2
            return
    }

    public static /* bridge */ /* synthetic */ long zzd(com.google.android.gms.common.internal.zzr r2) {
            long r0 = r2.zzh
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.Context zze(com.google.android.gms.common.internal.zzr r0) {
            android.content.Context r0 = r0.zzc
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.Handler zzf(com.google.android.gms.common.internal.zzr r0) {
            android.os.Handler r0 = r0.zzd
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.stats.ConnectionTracker zzg(com.google.android.gms.common.internal.zzr r0) {
            com.google.android.gms.common.stats.ConnectionTracker r0 = r0.zzf
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.HashMap zzh(com.google.android.gms.common.internal.zzr r0) {
            java.util.HashMap<com.google.android.gms.common.internal.zzn, com.google.android.gms.common.internal.zzo> r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void zza(com.google.android.gms.common.internal.zzn r4, android.content.ServiceConnection r5, java.lang.String r6) {
            r3 = this;
            java.lang.String r0 = "ServiceConnection must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)
            java.util.HashMap<com.google.android.gms.common.internal.zzn, com.google.android.gms.common.internal.zzo> r0 = r3.zzb
            monitor-enter(r0)
            java.util.HashMap<com.google.android.gms.common.internal.zzn, com.google.android.gms.common.internal.zzo> r1 = r3.zzb     // Catch: java.lang.Throwable -> L73
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L73
            com.google.android.gms.common.internal.zzo r1 = (com.google.android.gms.common.internal.zzo) r1     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L52
            boolean r2 = r1.zzh(r5)     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto L31
            r1.zzf(r5, r6)     // Catch: java.lang.Throwable -> L73
            boolean r5 = r1.zzi()     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L2f
            android.os.Handler r5 = r3.zzd     // Catch: java.lang.Throwable -> L73
            r6 = 0
            android.os.Message r4 = r5.obtainMessage(r6, r4)     // Catch: java.lang.Throwable -> L73
            android.os.Handler r5 = r3.zzd     // Catch: java.lang.Throwable -> L73
            long r1 = r3.zzg     // Catch: java.lang.Throwable -> L73
            r5.sendMessageDelayed(r4, r1)     // Catch: java.lang.Throwable -> L73
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            return
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L73
            int r6 = r4.length()     // Catch: java.lang.Throwable -> L73
            int r6 = r6 + 76
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = "Trying to unbind a GmsServiceConnection  that was not bound before.  config="
            r1.append(r6)     // Catch: java.lang.Throwable -> L73
            r1.append(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L73
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L73
            throw r5     // Catch: java.lang.Throwable -> L73
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L73
            int r6 = r4.length()     // Catch: java.lang.Throwable -> L73
            int r6 = r6 + 50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = "Nonexistent connection status for service config: "
            r1.append(r6)     // Catch: java.lang.Throwable -> L73
            r1.append(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L73
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L73
            throw r5     // Catch: java.lang.Throwable -> L73
        L73:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            throw r4
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final boolean zzc(com.google.android.gms.common.internal.zzn r5, android.content.ServiceConnection r6, java.lang.String r7, @androidx.annotation.Nullable java.util.concurrent.Executor r8) {
            r4 = this;
            java.lang.String r0 = "ServiceConnection must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r0)
            java.util.HashMap<com.google.android.gms.common.internal.zzn, com.google.android.gms.common.internal.zzo> r0 = r4.zzb
            monitor-enter(r0)
            java.util.HashMap<com.google.android.gms.common.internal.zzn, com.google.android.gms.common.internal.zzo> r1 = r4.zzb     // Catch: java.lang.Throwable -> L73
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L73
            com.google.android.gms.common.internal.zzo r1 = (com.google.android.gms.common.internal.zzo) r1     // Catch: java.lang.Throwable -> L73
            if (r1 != 0) goto L23
            com.google.android.gms.common.internal.zzo r1 = new com.google.android.gms.common.internal.zzo     // Catch: java.lang.Throwable -> L73
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L73
            r1.zzd(r6, r6, r7)     // Catch: java.lang.Throwable -> L73
            r1.zze(r7, r8)     // Catch: java.lang.Throwable -> L73
            java.util.HashMap<com.google.android.gms.common.internal.zzn, com.google.android.gms.common.internal.zzo> r6 = r4.zzb     // Catch: java.lang.Throwable -> L73
            r6.put(r5, r1)     // Catch: java.lang.Throwable -> L73
            goto L4c
        L23:
            android.os.Handler r2 = r4.zzd     // Catch: java.lang.Throwable -> L73
            r3 = 0
            r2.removeMessages(r3, r5)     // Catch: java.lang.Throwable -> L73
            boolean r2 = r1.zzh(r6)     // Catch: java.lang.Throwable -> L73
            if (r2 != 0) goto L52
            r1.zzd(r6, r6, r7)     // Catch: java.lang.Throwable -> L73
            int r5 = r1.zza()     // Catch: java.lang.Throwable -> L73
            r2 = 1
            if (r5 == r2) goto L41
            r6 = 2
            if (r5 == r6) goto L3d
            goto L4c
        L3d:
            r1.zze(r7, r8)     // Catch: java.lang.Throwable -> L73
            goto L4c
        L41:
            android.content.ComponentName r5 = r1.zzb()     // Catch: java.lang.Throwable -> L73
            android.os.IBinder r7 = r1.zzc()     // Catch: java.lang.Throwable -> L73
            r6.onServiceConnected(r5, r7)     // Catch: java.lang.Throwable -> L73
        L4c:
            boolean r5 = r1.zzj()     // Catch: java.lang.Throwable -> L73
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            return r5
        L52:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L73
            int r7 = r5.length()     // Catch: java.lang.Throwable -> L73
            int r7 = r7 + 81
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L73
            java.lang.String r7 = "Trying to bind a GmsServiceConnection that was already connected before.  config="
            r8.append(r7)     // Catch: java.lang.Throwable -> L73
            r8.append(r5)     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> L73
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L73
            throw r6     // Catch: java.lang.Throwable -> L73
        L73:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            throw r5
    }

    public final void zzi(android.os.Looper r4) {
            r3 = this;
            java.util.HashMap<com.google.android.gms.common.internal.zzn, com.google.android.gms.common.internal.zzo> r0 = r3.zzb
            monitor-enter(r0)
            com.google.android.gms.internal.common.zzi r1 = new com.google.android.gms.internal.common.zzi     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.common.internal.zzq r2 = r3.zze     // Catch: java.lang.Throwable -> Le
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> Le
            r3.zzd = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r4
    }
}
