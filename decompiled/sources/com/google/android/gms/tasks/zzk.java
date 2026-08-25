package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zzk implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.tasks.Task zza;
    public final /* synthetic */ com.google.android.gms.tasks.zzl zzb;

    public zzk(com.google.android.gms.tasks.zzl r1, com.google.android.gms.tasks.Task r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.tasks.zzl r0 = r3.zzb
            java.lang.Object r0 = com.google.android.gms.tasks.zzl.zzb(r0)
            monitor-enter(r0)
            com.google.android.gms.tasks.zzl r1 = r3.zzb     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.tasks.OnFailureListener r2 = com.google.android.gms.tasks.zzl.zza(r1)     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L22
            com.google.android.gms.tasks.OnFailureListener r1 = com.google.android.gms.tasks.zzl.zza(r1)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.tasks.Task r2 = r3.zza     // Catch: java.lang.Throwable -> L24
            java.lang.Exception r2 = r2.getException()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.Exception r2 = (java.lang.Exception) r2     // Catch: java.lang.Throwable -> L24
            r1.onFailure(r2)     // Catch: java.lang.Throwable -> L24
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r1
    }
}
