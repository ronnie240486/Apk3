package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zzz implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.tasks.zzw zza;
    public final /* synthetic */ java.util.concurrent.Callable zzb;

    public zzz(com.google.android.gms.tasks.zzw r1, java.util.concurrent.Callable r2) {
            r0 = this;
            r0.zza = r1
            r0.zzb = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.tasks.zzw r0 = r3.zza     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> L18
            java.util.concurrent.Callable r1 = r3.zzb     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> L18
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> L18
            r0.zzb(r1)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> L18
            return
        Lc:
            r0 = move-exception
            com.google.android.gms.tasks.zzw r1 = r3.zza
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            r1.zza(r2)
            return
        L18:
            r0 = move-exception
            com.google.android.gms.tasks.zzw r1 = r3.zza
            r1.zza(r0)
            return
    }
}
