package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zzg implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.tasks.zzh zza;

    public zzg(com.google.android.gms.tasks.zzh r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.tasks.zzh r0 = r3.zza
            java.lang.Object r0 = com.google.android.gms.tasks.zzh.zzb(r0)
            monitor-enter(r0)
            com.google.android.gms.tasks.zzh r1 = r3.zza     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.tasks.OnCanceledListener r2 = com.google.android.gms.tasks.zzh.zza(r1)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L16
            com.google.android.gms.tasks.OnCanceledListener r1 = com.google.android.gms.tasks.zzh.zza(r1)     // Catch: java.lang.Throwable -> L18
            r1.onCanceled()     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }
}
