package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zzc implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.tasks.Task zza;
    public final /* synthetic */ com.google.android.gms.tasks.zzd zzb;

    public zzc(com.google.android.gms.tasks.zzd r1, com.google.android.gms.tasks.Task r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.tasks.Task r0 = r2.zza
            boolean r0 = r0.isCanceled()
            if (r0 == 0) goto L12
            com.google.android.gms.tasks.zzd r0 = r2.zzb
            com.google.android.gms.tasks.zzw r0 = com.google.android.gms.tasks.zzd.zzb(r0)
            r0.zzc()
            return
        L12:
            com.google.android.gms.tasks.zzd r0 = r2.zzb     // Catch: java.lang.Exception -> L28 com.google.android.gms.tasks.RuntimeExecutionException -> L33
            com.google.android.gms.tasks.Continuation r0 = com.google.android.gms.tasks.zzd.zza(r0)     // Catch: java.lang.Exception -> L28 com.google.android.gms.tasks.RuntimeExecutionException -> L33
            com.google.android.gms.tasks.Task r1 = r2.zza     // Catch: java.lang.Exception -> L28 com.google.android.gms.tasks.RuntimeExecutionException -> L33
            java.lang.Object r0 = r0.then(r1)     // Catch: java.lang.Exception -> L28 com.google.android.gms.tasks.RuntimeExecutionException -> L33
            com.google.android.gms.tasks.zzd r1 = r2.zzb
            com.google.android.gms.tasks.zzw r1 = com.google.android.gms.tasks.zzd.zzb(r1)
            r1.zzb(r0)
            return
        L28:
            r0 = move-exception
            com.google.android.gms.tasks.zzd r1 = r2.zzb
            com.google.android.gms.tasks.zzw r1 = com.google.android.gms.tasks.zzd.zzb(r1)
            r1.zza(r0)
            return
        L33:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.Exception
            if (r1 == 0) goto L4c
            com.google.android.gms.tasks.zzd r1 = r2.zzb
            com.google.android.gms.tasks.zzw r1 = com.google.android.gms.tasks.zzd.zzb(r1)
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Exception r0 = (java.lang.Exception) r0
            r1.zza(r0)
            return
        L4c:
            com.google.android.gms.tasks.zzd r1 = r2.zzb
            com.google.android.gms.tasks.zzw r1 = com.google.android.gms.tasks.zzd.zzb(r1)
            r1.zza(r0)
            return
    }
}
