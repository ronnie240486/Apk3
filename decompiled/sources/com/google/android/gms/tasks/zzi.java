package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zzi implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.tasks.Task zza;
    public final /* synthetic */ com.google.android.gms.tasks.zzj zzb;

    public zzi(com.google.android.gms.tasks.zzj r1, com.google.android.gms.tasks.Task r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.tasks.zzj r0 = r3.zzb
            java.lang.Object r0 = com.google.android.gms.tasks.zzj.zzb(r0)
            monitor-enter(r0)
            com.google.android.gms.tasks.zzj r1 = r3.zzb     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.tasks.OnCompleteListener r2 = com.google.android.gms.tasks.zzj.zza(r1)     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L18
            com.google.android.gms.tasks.OnCompleteListener r1 = com.google.android.gms.tasks.zzj.zza(r1)     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.tasks.Task r2 = r3.zza     // Catch: java.lang.Throwable -> L1a
            r1.onComplete(r2)     // Catch: java.lang.Throwable -> L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
    }
}
