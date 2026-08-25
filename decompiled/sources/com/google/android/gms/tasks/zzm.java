package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zzm implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.tasks.Task zza;
    public final /* synthetic */ com.google.android.gms.tasks.zzn zzb;

    public zzm(com.google.android.gms.tasks.zzn r1, com.google.android.gms.tasks.Task r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.tasks.zzn r0 = r3.zzb
            java.lang.Object r0 = com.google.android.gms.tasks.zzn.zzb(r0)
            monitor-enter(r0)
            com.google.android.gms.tasks.zzn r1 = r3.zzb     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.tasks.OnSuccessListener r2 = com.google.android.gms.tasks.zzn.zza(r1)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L1c
            com.google.android.gms.tasks.OnSuccessListener r1 = com.google.android.gms.tasks.zzn.zza(r1)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.tasks.Task r2 = r3.zza     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r2.getResult()     // Catch: java.lang.Throwable -> L1e
            r1.onSuccess(r2)     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }
}
