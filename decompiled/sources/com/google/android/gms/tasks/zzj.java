package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zzj<TResult> implements com.google.android.gms.tasks.zzq<TResult> {
    private final java.util.concurrent.Executor zza;
    private final java.lang.Object zzb;

    @javax.annotation.concurrent.GuardedBy("mLock")
    @javax.annotation.Nullable
    private com.google.android.gms.tasks.OnCompleteListener<TResult> zzc;

    public zzj(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull com.google.android.gms.tasks.OnCompleteListener<TResult> r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzb = r0
            r1.zza = r2
            r1.zzc = r3
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.tasks.OnCompleteListener zza(com.google.android.gms.tasks.zzj r0) {
            com.google.android.gms.tasks.OnCompleteListener<TResult> r0 = r0.zzc
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.tasks.zzj r0) {
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
    public final void zzd(@androidx.annotation.NonNull com.google.android.gms.tasks.Task<TResult> r3) {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            com.google.android.gms.tasks.OnCompleteListener<TResult> r1 = r2.zzc     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.Executor r0 = r2.zza
            com.google.android.gms.tasks.zzi r1 = new com.google.android.gms.tasks.zzi
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
        L15:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }
}
