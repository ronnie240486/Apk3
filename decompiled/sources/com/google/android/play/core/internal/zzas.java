package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzas {
    private static final java.util.Map zza = null;
    private final android.content.Context zzb;
    private final com.google.android.play.core.internal.zzag zzc;
    private final java.lang.String zzd;
    private final java.util.List zze;

    @androidx.annotation.GuardedBy("attachedRemoteTasksLock")
    private final java.util.Set zzf;
    private final java.lang.Object zzg;
    private boolean zzh;
    private final android.content.Intent zzi;
    private final com.google.android.play.core.internal.zzan zzj;
    private final java.lang.ref.WeakReference zzk;
    private final android.os.IBinder.DeathRecipient zzl;

    @androidx.annotation.GuardedBy("attachedRemoteTasksLock")
    private final java.util.concurrent.atomic.AtomicInteger zzm;

    @androidx.annotation.Nullable
    private android.content.ServiceConnection zzn;

    @androidx.annotation.Nullable
    private android.os.IInterface zzo;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.play.core.internal.zzas.zza = r0
            return
    }

    public zzas(android.content.Context r2, com.google.android.play.core.internal.zzag r3, java.lang.String r4, android.content.Intent r5, com.google.android.play.core.internal.zzan r6, @androidx.annotation.Nullable com.google.android.play.core.internal.zzam r7) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r1.zze = r7
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r1.zzf = r7
            java.lang.Object r7 = new java.lang.Object
            r7.<init>()
            r1.zzg = r7
            com.google.android.play.core.internal.zzai r7 = new com.google.android.play.core.internal.zzai
            r7.<init>(r1)
            r1.zzl = r7
            java.util.concurrent.atomic.AtomicInteger r7 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 0
            r7.<init>(r0)
            r1.zzm = r7
            r1.zzb = r2
            r1.zzc = r3
            r1.zzd = r4
            r1.zzi = r5
            r1.zzj = r6
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r3 = 0
            r2.<init>(r3)
            r1.zzk = r2
            return
    }

    public static /* bridge */ /* synthetic */ android.content.Context zza(com.google.android.play.core.internal.zzas r0) {
            android.content.Context r0 = r0.zzb
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.ServiceConnection zzb(com.google.android.play.core.internal.zzas r0) {
            android.content.ServiceConnection r0 = r0.zzn
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.IInterface zzd(com.google.android.play.core.internal.zzas r0) {
            android.os.IInterface r0 = r0.zzo
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.internal.zzag zzf(com.google.android.play.core.internal.zzas r0) {
            com.google.android.play.core.internal.zzag r0 = r0.zzc
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.internal.zzan zzg(com.google.android.play.core.internal.zzas r0) {
            com.google.android.play.core.internal.zzan r0 = r0.zzj
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.List zzh(com.google.android.play.core.internal.zzas r0) {
            java.util.List r0 = r0.zze
            return r0
    }

    public static /* synthetic */ void zzi(com.google.android.play.core.internal.zzas r4) {
            com.google.android.play.core.internal.zzag r0 = r4.zzc
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "reportBinderDeath"
            r0.zzd(r3, r2)
            java.lang.ref.WeakReference r0 = r4.zzk
            java.lang.Object r0 = r0.get()
            com.google.android.play.core.internal.zzam r0 = (com.google.android.play.core.internal.zzam) r0
            if (r0 == 0) goto L22
            com.google.android.play.core.internal.zzag r2 = r4.zzc
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "calling onBinderDied"
            r2.zzd(r3, r1)
            r0.zza()
            goto L4f
        L22:
            com.google.android.play.core.internal.zzag r0 = r4.zzc
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r4.zzd
            r2[r1] = r3
            java.lang.String r1 = "%s : Binder has died."
            r0.zzd(r1, r2)
            java.util.List r0 = r4.zze
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            com.google.android.play.core.internal.zzah r1 = (com.google.android.play.core.internal.zzah) r1
            android.os.RemoteException r2 = r4.zzt()
            r1.zzc(r2)
            goto L36
        L4a:
            java.util.List r0 = r4.zze
            r0.clear()
        L4f:
            r4.zzu()
            return
    }

    public static /* bridge */ /* synthetic */ void zzj(com.google.android.play.core.internal.zzas r1) {
            r0 = 0
            r1.zzn = r0
            return
    }

    public static /* bridge */ /* synthetic */ void zzk(com.google.android.play.core.internal.zzas r1) {
            r0 = 0
            r1.zzh = r0
            return
    }

    public static /* bridge */ /* synthetic */ void zzl(com.google.android.play.core.internal.zzas r0, android.os.IInterface r1) {
            r0.zzo = r1
            return
    }

    public static /* bridge */ /* synthetic */ void zzm(com.google.android.play.core.internal.zzas r0) {
            r0.zzu()
            return
    }

    public static /* bridge */ /* synthetic */ void zzn(com.google.android.play.core.internal.zzas r4, com.google.android.play.core.internal.zzah r5) {
            android.os.IInterface r0 = r4.zzo
            r1 = 0
            if (r0 != 0) goto L57
            boolean r0 = r4.zzh
            if (r0 != 0) goto L57
            com.google.android.play.core.internal.zzag r0 = r4.zzc
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Initiate binding to the service."
            r0.zzd(r3, r2)
            java.util.List r0 = r4.zze
            r0.add(r5)
            com.google.android.play.core.internal.zzar r5 = new com.google.android.play.core.internal.zzar
            r5.<init>(r4)
            r4.zzn = r5
            r0 = 1
            r4.zzh = r0
            android.content.Context r2 = r4.zzb
            android.content.Intent r3 = r4.zzi
            boolean r5 = r2.bindService(r3, r5, r0)
            if (r5 != 0) goto L56
            com.google.android.play.core.internal.zzag r5 = r4.zzc
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "Failed to bind to the service."
            r5.zzd(r2, r0)
            r4.zzh = r1
            java.util.List r5 = r4.zze
            java.util.Iterator r5 = r5.iterator()
        L3c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r5.next()
            com.google.android.play.core.internal.zzah r0 = (com.google.android.play.core.internal.zzah) r0
            com.google.android.play.core.internal.zzat r1 = new com.google.android.play.core.internal.zzat
            r1.<init>()
            r0.zzc(r1)
            goto L3c
        L51:
            java.util.List r4 = r4.zze
            r4.clear()
        L56:
            return
        L57:
            boolean r0 = r4.zzh
            if (r0 == 0) goto L6a
            com.google.android.play.core.internal.zzag r0 = r4.zzc
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Waiting to bind to the service."
            r0.zzd(r2, r1)
            java.util.List r4 = r4.zze
            r4.add(r5)
            return
        L6a:
            r5.run()
            return
    }

    public static /* bridge */ /* synthetic */ void zzo(com.google.android.play.core.internal.zzas r4) {
            com.google.android.play.core.internal.zzag r0 = r4.zzc
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "linkToDeath"
            r0.zzd(r3, r2)
            android.os.IInterface r0 = r4.zzo     // Catch: android.os.RemoteException -> L16
            android.os.IBinder r0 = r0.asBinder()     // Catch: android.os.RemoteException -> L16
            android.os.IBinder$DeathRecipient r2 = r4.zzl     // Catch: android.os.RemoteException -> L16
            r0.linkToDeath(r2, r1)     // Catch: android.os.RemoteException -> L16
            return
        L16:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r4 = r4.zzc
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "linkToDeath failed"
            r4.zzc(r0, r2, r1)
            return
    }

    public static /* bridge */ /* synthetic */ void zzp(com.google.android.play.core.internal.zzas r4) {
            com.google.android.play.core.internal.zzag r0 = r4.zzc
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "unlinkToDeath"
            r0.zzd(r3, r2)
            android.os.IInterface r0 = r4.zzo
            android.os.IBinder r0 = r0.asBinder()
            android.os.IBinder$DeathRecipient r4 = r4.zzl
            r0.unlinkToDeath(r4, r1)
            return
    }

    private final android.os.RemoteException zzt() {
            r3 = this;
            android.os.RemoteException r0 = new android.os.RemoteException
            java.lang.String r1 = r3.zzd
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " : Binder has died."
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            return r0
    }

    private final void zzu() {
            r4 = this;
            java.lang.Object r0 = r4.zzg
            monitor-enter(r0)
            java.util.Set r1 = r4.zzf     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L24
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L24
            com.google.android.play.core.tasks.zzi r2 = (com.google.android.play.core.tasks.zzi) r2     // Catch: java.lang.Throwable -> L24
            android.os.RemoteException r3 = r4.zzt()     // Catch: java.lang.Throwable -> L24
            r2.zzd(r3)     // Catch: java.lang.Throwable -> L24
            goto L9
        L1d:
            java.util.Set r1 = r4.zzf     // Catch: java.lang.Throwable -> L24
            r1.clear()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r1
    }

    public final android.os.Handler zzc() {
            r4 = this;
            java.util.Map r0 = com.google.android.play.core.internal.zzas.zza
            monitor-enter(r0)
            java.lang.String r1 = r4.zzd     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L25
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r4.zzd     // Catch: java.lang.Throwable -> L2f
            r3 = 10
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L2f
            r1.start()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r4.zzd     // Catch: java.lang.Throwable -> L2f
            android.os.Handler r3 = new android.os.Handler     // Catch: java.lang.Throwable -> L2f
            android.os.Looper r1 = r1.getLooper()     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L2f
        L25:
            java.lang.String r1 = r4.zzd     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L2f
            android.os.Handler r1 = (android.os.Handler) r1     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return r1
        L2f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r1
    }

    @androidx.annotation.Nullable
    public final android.os.IInterface zze() {
            r1 = this;
            android.os.IInterface r0 = r1.zzo
            return r0
    }

    public final void zzq(com.google.android.play.core.internal.zzah r4, @androidx.annotation.Nullable com.google.android.play.core.tasks.zzi r5) {
            r3 = this;
            java.lang.Object r0 = r3.zzg
            monitor-enter(r0)
            java.util.Set r1 = r3.zzf     // Catch: java.lang.Throwable -> L3f
            r1.add(r5)     // Catch: java.lang.Throwable -> L3f
            com.google.android.play.core.tasks.Task r1 = r5.zza()     // Catch: java.lang.Throwable -> L3f
            com.google.android.play.core.internal.zzaj r2 = new com.google.android.play.core.internal.zzaj     // Catch: java.lang.Throwable -> L3f
            r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> L3f
            r1.addOnCompleteListener(r2)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r5 = r3.zzg
            monitor-enter(r5)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.zzm     // Catch: java.lang.Throwable -> L3c
            int r0 = r0.getAndIncrement()     // Catch: java.lang.Throwable -> L3c
            if (r0 <= 0) goto L2a
            com.google.android.play.core.internal.zzag r0 = r3.zzc     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "Already connected to the service."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3c
            r0.zza(r1, r2)     // Catch: java.lang.Throwable -> L3c
        L2a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            com.google.android.play.core.internal.zzak r5 = new com.google.android.play.core.internal.zzak
            com.google.android.play.core.tasks.zzi r0 = r4.zzb()
            r5.<init>(r3, r0, r4)
            android.os.Handler r4 = r3.zzc()
            r4.post(r5)
            return
        L3c:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            throw r4
        L3f:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r4
    }

    public final /* synthetic */ void zzr(com.google.android.play.core.tasks.zzi r3) {
            r2 = this;
            java.lang.Object r0 = r2.zzg
            monitor-enter(r0)
            java.util.Set r1 = r2.zzf     // Catch: java.lang.Throwable -> La
            r1.remove(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public final void zzs(com.google.android.play.core.tasks.zzi r4) {
            r3 = this;
            java.lang.Object r0 = r3.zzg
            monitor-enter(r0)
            java.util.Set r1 = r3.zzf     // Catch: java.lang.Throwable -> L39
            r1.remove(r4)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            java.lang.Object r4 = r3.zzg
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.zzm     // Catch: java.lang.Throwable -> L36
            int r0 = r0.get()     // Catch: java.lang.Throwable -> L36
            if (r0 <= 0) goto L28
            java.util.concurrent.atomic.AtomicInteger r0 = r3.zzm     // Catch: java.lang.Throwable -> L36
            int r0 = r0.decrementAndGet()     // Catch: java.lang.Throwable -> L36
            if (r0 <= 0) goto L28
            com.google.android.play.core.internal.zzag r0 = r3.zzc     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "Leaving the connection open for other ongoing calls."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L36
            r0.zzd(r1, r2)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            return
        L28:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            com.google.android.play.core.internal.zzal r4 = new com.google.android.play.core.internal.zzal
            r4.<init>(r3)
            android.os.Handler r0 = r3.zzc()
            r0.post(r4)
            return
        L36:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        L39:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r4
    }
}
