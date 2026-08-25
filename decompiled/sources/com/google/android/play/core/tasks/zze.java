package com.google.android.play.core.tasks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zze implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.play.core.tasks.Task zza;
    public final /* synthetic */ com.google.android.play.core.tasks.zzf zzb;

    public zze(com.google.android.play.core.tasks.zzf r1, com.google.android.play.core.tasks.Task r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.play.core.tasks.zzf r0 = r3.zzb
            java.lang.Object r0 = com.google.android.play.core.tasks.zzf.zzb(r0)
            monitor-enter(r0)
            com.google.android.play.core.tasks.zzf r1 = r3.zzb     // Catch: java.lang.Throwable -> L1e
            com.google.android.play.core.tasks.OnSuccessListener r2 = com.google.android.play.core.tasks.zzf.zza(r1)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L1c
            com.google.android.play.core.tasks.OnSuccessListener r1 = com.google.android.play.core.tasks.zzf.zza(r1)     // Catch: java.lang.Throwable -> L1e
            com.google.android.play.core.tasks.Task r2 = r3.zza     // Catch: java.lang.Throwable -> L1e
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
