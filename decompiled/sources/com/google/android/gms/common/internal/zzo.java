package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzo implements android.content.ServiceConnection, com.google.android.gms.common.internal.zzs {
    public final /* synthetic */ com.google.android.gms.common.internal.zzr zza;
    private final java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> zzb;
    private int zzc;
    private boolean zzd;

    @androidx.annotation.Nullable
    private android.os.IBinder zze;
    private final com.google.android.gms.common.internal.zzn zzf;
    private android.content.ComponentName zzg;

    public zzo(com.google.android.gms.common.internal.zzr r1, com.google.android.gms.common.internal.zzn r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzf = r2
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzb = r1
            r1 = 2
            r0.zzc = r1
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
            r4 = this;
            com.google.android.gms.common.internal.zzr r0 = r4.zza
            java.util.HashMap r0 = com.google.android.gms.common.internal.zzr.zzh(r0)
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzr r1 = r4.zza     // Catch: java.lang.Throwable -> L35
            android.os.Handler r1 = com.google.android.gms.common.internal.zzr.zzf(r1)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.common.internal.zzn r2 = r4.zzf     // Catch: java.lang.Throwable -> L35
            r3 = 1
            r1.removeMessages(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.zze = r6     // Catch: java.lang.Throwable -> L35
            r4.zzg = r5     // Catch: java.lang.Throwable -> L35
            java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> r1 = r4.zzb     // Catch: java.lang.Throwable -> L35
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L35
        L21:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L35
            android.content.ServiceConnection r2 = (android.content.ServiceConnection) r2     // Catch: java.lang.Throwable -> L35
            r2.onServiceConnected(r5, r6)     // Catch: java.lang.Throwable -> L35
            goto L21
        L31:
            r4.zzc = r3     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return
        L35:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r5
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r5) {
            r4 = this;
            com.google.android.gms.common.internal.zzr r0 = r4.zza
            java.util.HashMap r0 = com.google.android.gms.common.internal.zzr.zzh(r0)
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzr r1 = r4.zza     // Catch: java.lang.Throwable -> L37
            android.os.Handler r1 = com.google.android.gms.common.internal.zzr.zzf(r1)     // Catch: java.lang.Throwable -> L37
            r2 = 1
            com.google.android.gms.common.internal.zzn r3 = r4.zzf     // Catch: java.lang.Throwable -> L37
            r1.removeMessages(r2, r3)     // Catch: java.lang.Throwable -> L37
            r1 = 0
            r4.zze = r1     // Catch: java.lang.Throwable -> L37
            r4.zzg = r5     // Catch: java.lang.Throwable -> L37
            java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> r1 = r4.zzb     // Catch: java.lang.Throwable -> L37
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L37
        L22:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L37
            android.content.ServiceConnection r2 = (android.content.ServiceConnection) r2     // Catch: java.lang.Throwable -> L37
            r2.onServiceDisconnected(r5)     // Catch: java.lang.Throwable -> L37
            goto L22
        L32:
            r5 = 2
            r4.zzc = r5     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return
        L37:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r5
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public final android.content.ComponentName zzb() {
            r1 = this;
            android.content.ComponentName r0 = r1.zzg
            return r0
    }

    @androidx.annotation.Nullable
    public final android.os.IBinder zzc() {
            r1 = this;
            android.os.IBinder r0 = r1.zze
            return r0
    }

    public final void zzd(android.content.ServiceConnection r1, android.content.ServiceConnection r2, java.lang.String r3) {
            r0 = this;
            java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> r3 = r0.zzb
            r3.put(r1, r2)
            return
    }

    public final void zze(java.lang.String r9, @androidx.annotation.Nullable java.util.concurrent.Executor r10) {
            r8 = this;
            r0 = 3
            r8.zzc = r0
            com.google.android.gms.common.internal.zzr r0 = r8.zza
            com.google.android.gms.common.stats.ConnectionTracker r1 = com.google.android.gms.common.internal.zzr.zzg(r0)
            android.content.Context r2 = com.google.android.gms.common.internal.zzr.zze(r0)
            com.google.android.gms.common.internal.zzn r3 = r8.zzf
            android.content.Context r0 = com.google.android.gms.common.internal.zzr.zze(r0)
            android.content.Intent r4 = r3.zzc(r0)
            com.google.android.gms.common.internal.zzn r0 = r8.zzf
            int r6 = r0.zza()
            r3 = r9
            r5 = r8
            r7 = r10
            boolean r9 = r1.zza(r2, r3, r4, r5, r6, r7)
            r8.zzd = r9
            if (r9 == 0) goto L45
            com.google.android.gms.common.internal.zzr r9 = r8.zza
            android.os.Handler r9 = com.google.android.gms.common.internal.zzr.zzf(r9)
            com.google.android.gms.common.internal.zzn r10 = r8.zzf
            r0 = 1
            android.os.Message r9 = r9.obtainMessage(r0, r10)
            com.google.android.gms.common.internal.zzr r10 = r8.zza
            android.os.Handler r10 = com.google.android.gms.common.internal.zzr.zzf(r10)
            com.google.android.gms.common.internal.zzr r0 = r8.zza
            long r0 = com.google.android.gms.common.internal.zzr.zzd(r0)
            r10.sendMessageDelayed(r9, r0)
            return
        L45:
            r9 = 2
            r8.zzc = r9
            com.google.android.gms.common.internal.zzr r9 = r8.zza     // Catch: java.lang.IllegalArgumentException -> L55
            com.google.android.gms.common.stats.ConnectionTracker r10 = com.google.android.gms.common.internal.zzr.zzg(r9)     // Catch: java.lang.IllegalArgumentException -> L55
            android.content.Context r9 = com.google.android.gms.common.internal.zzr.zze(r9)     // Catch: java.lang.IllegalArgumentException -> L55
            r10.unbindService(r9, r8)     // Catch: java.lang.IllegalArgumentException -> L55
        L55:
            return
    }

    public final void zzf(android.content.ServiceConnection r1, java.lang.String r2) {
            r0 = this;
            java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> r2 = r0.zzb
            r2.remove(r1)
            return
    }

    public final void zzg(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.common.internal.zzr r3 = r2.zza
            android.os.Handler r3 = com.google.android.gms.common.internal.zzr.zzf(r3)
            com.google.android.gms.common.internal.zzn r0 = r2.zzf
            r1 = 1
            r3.removeMessages(r1, r0)
            com.google.android.gms.common.internal.zzr r3 = r2.zza
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.internal.zzr.zzg(r3)
            android.content.Context r3 = com.google.android.gms.common.internal.zzr.zze(r3)
            r0.unbindService(r3, r2)
            r3 = 0
            r2.zzd = r3
            r3 = 2
            r2.zzc = r3
            return
    }

    public final boolean zzh(android.content.ServiceConnection r2) {
            r1 = this;
            java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> r0 = r1.zzb
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    public final boolean zzi() {
            r1 = this;
            java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> r0 = r1.zzb
            boolean r0 = r0.isEmpty()
            return r0
    }

    public final boolean zzj() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }
}
