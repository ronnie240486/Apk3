package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zzh<TResult> implements com.google.android.gms.tasks.zzq<TResult> {
    private final java.util.concurrent.Executor zza;
    private final java.lang.Object zzb;

    @javax.annotation.concurrent.GuardedBy("mLock")
    @javax.annotation.Nullable
    private com.google.android.gms.tasks.OnCanceledListener zzc;

    public zzh(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull com.google.android.gms.tasks.OnCanceledListener r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzb = r0
            r1.zza = r2
            r1.zzc = r3
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.tasks.OnCanceledListener zza(com.google.android.gms.tasks.zzh r0) {
            com.google.android.gms.tasks.OnCanceledListener r0 = r0.zzc
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.tasks.zzh r0) {
            java.lang.Object r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            r1 = 0
            r2.zzc = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(@androidx.annotation.NonNull com.google.android.gms.tasks.Task<TResult> r2) {
            r1 = this;
            boolean r2 = r2.isCanceled()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.zzb
            monitor-enter(r2)
            com.google.android.gms.tasks.OnCanceledListener r0 = r1.zzc     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto Lf
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            return
        Lf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            java.util.concurrent.Executor r2 = r1.zza
            com.google.android.gms.tasks.zzg r0 = new com.google.android.gms.tasks.zzg
            r0.<init>(r1)
            r2.execute(r0)
            return
        L1b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r0
        L1e:
            return
    }
}
