package com.google.android.play.core.tasks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzm<ResultT> extends com.google.android.play.core.tasks.Task<ResultT> {
    private final java.lang.Object zza;
    private final com.google.android.play.core.tasks.zzh zzb;

    @androidx.annotation.GuardedBy("lock")
    private boolean zzc;

    @androidx.annotation.GuardedBy("lock")
    private java.lang.Object zzd;

    @androidx.annotation.GuardedBy("lock")
    private java.lang.Exception zze;

    public zzm() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            com.google.android.play.core.tasks.zzh r0 = new com.google.android.play.core.tasks.zzh
            r0.<init>()
            r1.zzb = r0
            return
    }

    @androidx.annotation.GuardedBy("lock")
    private final void zze() {
            r2 = this;
            boolean r0 = r2.zzc
            java.lang.String r1 = "Task is not yet complete"
            com.google.android.play.core.internal.zzci.zzb(r0, r1)
            return
    }

    @androidx.annotation.GuardedBy("lock")
    private final void zzf() {
            r2 = this;
            boolean r0 = r2.zzc
            r0 = r0 ^ 1
            java.lang.String r1 = "Task is already complete"
            com.google.android.play.core.internal.zzci.zzb(r0, r1)
            return
    }

    private final void zzg() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            boolean r1 = r2.zzc     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            com.google.android.play.core.tasks.zzh r0 = r2.zzb
            r0.zzb(r2)
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    @Override // com.google.android.play.core.tasks.Task
    public final com.google.android.play.core.tasks.Task<ResultT> addOnCompleteListener(com.google.android.play.core.tasks.OnCompleteListener<ResultT> r4) {
            r3 = this;
            java.util.concurrent.Executor r0 = com.google.android.play.core.tasks.TaskExecutors.MAIN_THREAD
            com.google.android.play.core.tasks.zzh r1 = r3.zzb
            com.google.android.play.core.tasks.zzb r2 = new com.google.android.play.core.tasks.zzb
            r2.<init>(r0, r4)
            r1.zza(r2)
            r3.zzg()
            return r3
    }

    @Override // com.google.android.play.core.tasks.Task
    public final com.google.android.play.core.tasks.Task<ResultT> addOnCompleteListener(java.util.concurrent.Executor r3, com.google.android.play.core.tasks.OnCompleteListener<ResultT> r4) {
            r2 = this;
            com.google.android.play.core.tasks.zzh r0 = r2.zzb
            com.google.android.play.core.tasks.zzb r1 = new com.google.android.play.core.tasks.zzb
            r1.<init>(r3, r4)
            r0.zza(r1)
            r2.zzg()
            return r2
    }

    @Override // com.google.android.play.core.tasks.Task
    public final com.google.android.play.core.tasks.Task<ResultT> addOnFailureListener(com.google.android.play.core.tasks.OnFailureListener r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = com.google.android.play.core.tasks.TaskExecutors.MAIN_THREAD
            r1.addOnFailureListener(r0, r2)
            return r1
    }

    @Override // com.google.android.play.core.tasks.Task
    public final com.google.android.play.core.tasks.Task<ResultT> addOnFailureListener(java.util.concurrent.Executor r3, com.google.android.play.core.tasks.OnFailureListener r4) {
            r2 = this;
            com.google.android.play.core.tasks.zzh r0 = r2.zzb
            com.google.android.play.core.tasks.zzd r1 = new com.google.android.play.core.tasks.zzd
            r1.<init>(r3, r4)
            r0.zza(r1)
            r2.zzg()
            return r2
    }

    @Override // com.google.android.play.core.tasks.Task
    public final com.google.android.play.core.tasks.Task<ResultT> addOnSuccessListener(com.google.android.play.core.tasks.OnSuccessListener<? super ResultT> r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = com.google.android.play.core.tasks.TaskExecutors.MAIN_THREAD
            r1.addOnSuccessListener(r0, r2)
            return r1
    }

    @Override // com.google.android.play.core.tasks.Task
    public final com.google.android.play.core.tasks.Task<ResultT> addOnSuccessListener(java.util.concurrent.Executor r3, com.google.android.play.core.tasks.OnSuccessListener<? super ResultT> r4) {
            r2 = this;
            com.google.android.play.core.tasks.zzh r0 = r2.zzb
            com.google.android.play.core.tasks.zzf r1 = new com.google.android.play.core.tasks.zzf
            r1.<init>(r3, r4)
            r0.zza(r1)
            r2.zzg()
            return r2
    }

    @Override // com.google.android.play.core.tasks.Task
    @androidx.annotation.Nullable
    public final java.lang.Exception getException() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            java.lang.Exception r1 = r2.zze     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // com.google.android.play.core.tasks.Task
    public final ResultT getResult() {
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            r3.zze()     // Catch: java.lang.Throwable -> L14
            java.lang.Exception r1 = r3.zze     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto Le
            java.lang.Object r1 = r3.zzd     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r1
        Le:
            com.google.android.play.core.tasks.RuntimeExecutionException r2 = new com.google.android.play.core.tasks.RuntimeExecutionException     // Catch: java.lang.Throwable -> L14
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L14
            throw r2     // Catch: java.lang.Throwable -> L14
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    @Override // com.google.android.play.core.tasks.Task
    public final <X extends java.lang.Throwable> ResultT getResult(java.lang.Class<X> r3) throws java.lang.Throwable {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            r2.zze()     // Catch: java.lang.Throwable -> L25
            java.lang.Exception r1 = r2.zze     // Catch: java.lang.Throwable -> L25
            boolean r1 = r3.isInstance(r1)     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L1c
            java.lang.Exception r3 = r2.zze     // Catch: java.lang.Throwable -> L25
            if (r3 != 0) goto L16
            java.lang.Object r3 = r2.zzd     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return r3
        L16:
            com.google.android.play.core.tasks.RuntimeExecutionException r1 = new com.google.android.play.core.tasks.RuntimeExecutionException     // Catch: java.lang.Throwable -> L25
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L25
            throw r1     // Catch: java.lang.Throwable -> L25
        L1c:
            java.lang.Exception r1 = r2.zze     // Catch: java.lang.Throwable -> L25
            java.lang.Object r3 = r3.cast(r1)     // Catch: java.lang.Throwable -> L25
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Throwable -> L25
            throw r3     // Catch: java.lang.Throwable -> L25
        L25:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r3
    }

    @Override // com.google.android.play.core.tasks.Task
    public final boolean isComplete() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            boolean r1 = r2.zzc     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // com.google.android.play.core.tasks.Task
    public final boolean isSuccessful() {
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            boolean r1 = r3.zzc     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            if (r1 == 0) goto Ld
            java.lang.Exception r1 = r3.zze     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto Ld
            r2 = 1
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r2
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public final void zza(java.lang.Exception r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            r2.zzf()     // Catch: java.lang.Throwable -> L12
            r1 = 1
            r2.zzc = r1     // Catch: java.lang.Throwable -> L12
            r2.zze = r3     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            com.google.android.play.core.tasks.zzh r3 = r2.zzb
            r3.zzb(r2)
            return
        L12:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    public final void zzb(java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            r2.zzf()     // Catch: java.lang.Throwable -> L12
            r1 = 1
            r2.zzc = r1     // Catch: java.lang.Throwable -> L12
            r2.zzd = r3     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            com.google.android.play.core.tasks.zzh r3 = r2.zzb
            r3.zzb(r2)
            return
        L12:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    public final boolean zzc(java.lang.Exception r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            boolean r1 = r2.zzc     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            r3 = 0
            return r3
        La:
            r1 = 1
            r2.zzc = r1     // Catch: java.lang.Throwable -> L16
            r2.zze = r3     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            com.google.android.play.core.tasks.zzh r3 = r2.zzb
            r3.zzb(r2)
            return r1
        L16:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3
    }

    public final boolean zzd(java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            boolean r1 = r2.zzc     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            r3 = 0
            return r3
        La:
            r1 = 1
            r2.zzc = r1     // Catch: java.lang.Throwable -> L16
            r2.zzd = r3     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            com.google.android.play.core.tasks.zzh r3 = r2.zzb
            r3.zzb(r2)
            return r1
        L16:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3
    }
}
