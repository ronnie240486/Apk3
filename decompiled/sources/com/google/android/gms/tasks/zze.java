package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zze implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.tasks.Task zza;
    public final /* synthetic */ com.google.android.gms.tasks.zzf zzb;

    public zze(com.google.android.gms.tasks.zzf r1, com.google.android.gms.tasks.Task r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.tasks.zzf r0 = r3.zzb     // Catch: java.lang.Exception -> L2f com.google.android.gms.tasks.RuntimeExecutionException -> L3a
            com.google.android.gms.tasks.Continuation r0 = com.google.android.gms.tasks.zzf.zza(r0)     // Catch: java.lang.Exception -> L2f com.google.android.gms.tasks.RuntimeExecutionException -> L3a
            com.google.android.gms.tasks.Task r1 = r3.zza     // Catch: java.lang.Exception -> L2f com.google.android.gms.tasks.RuntimeExecutionException -> L3a
            java.lang.Object r0 = r0.then(r1)     // Catch: java.lang.Exception -> L2f com.google.android.gms.tasks.RuntimeExecutionException -> L3a
            com.google.android.gms.tasks.Task r0 = (com.google.android.gms.tasks.Task) r0     // Catch: java.lang.Exception -> L2f com.google.android.gms.tasks.RuntimeExecutionException -> L3a
            if (r0 != 0) goto L1d
            com.google.android.gms.tasks.zzf r0 = r3.zzb
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Continuation returned null"
            r1.<init>(r2)
            r0.onFailure(r1)
            return
        L1d:
            java.util.concurrent.Executor r1 = com.google.android.gms.tasks.TaskExecutors.zza
            com.google.android.gms.tasks.zzf r2 = r3.zzb
            r0.addOnSuccessListener(r1, r2)
            com.google.android.gms.tasks.zzf r2 = r3.zzb
            r0.addOnFailureListener(r1, r2)
            com.google.android.gms.tasks.zzf r2 = r3.zzb
            r0.addOnCanceledListener(r1, r2)
            return
        L2f:
            r0 = move-exception
            com.google.android.gms.tasks.zzf r1 = r3.zzb
            com.google.android.gms.tasks.zzw r1 = com.google.android.gms.tasks.zzf.zzb(r1)
            r1.zza(r0)
            return
        L3a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.Exception
            if (r1 == 0) goto L53
            com.google.android.gms.tasks.zzf r1 = r3.zzb
            com.google.android.gms.tasks.zzw r1 = com.google.android.gms.tasks.zzf.zzb(r1)
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Exception r0 = (java.lang.Exception) r0
            r1.zza(r0)
            return
        L53:
            com.google.android.gms.tasks.zzf r1 = r3.zzb
            com.google.android.gms.tasks.zzw r1 = com.google.android.gms.tasks.zzf.zzb(r1)
            r1.zza(r0)
            return
    }
}
