package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public class TaskCompletionSource<TResult> {
    private final com.google.android.gms.tasks.zzw<TResult> zza;

    public TaskCompletionSource() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw
            r0.<init>()
            r1.zza = r0
            return
    }

    public TaskCompletionSource(@androidx.annotation.NonNull com.google.android.gms.tasks.CancellationToken r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw
            r0.<init>()
            r1.zza = r0
            com.google.android.gms.tasks.zzs r0 = new com.google.android.gms.tasks.zzs
            r0.<init>(r1)
            r2.onCanceledRequested(r0)
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.tasks.zzw zza(com.google.android.gms.tasks.TaskCompletionSource r0) {
            com.google.android.gms.tasks.zzw<TResult> r0 = r0.zza
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.tasks.Task<TResult> getTask() {
            r1 = this;
            com.google.android.gms.tasks.zzw<TResult> r0 = r1.zza
            return r0
    }

    public void setException(@androidx.annotation.NonNull java.lang.Exception r2) {
            r1 = this;
            com.google.android.gms.tasks.zzw<TResult> r0 = r1.zza
            r0.zza(r2)
            return
    }

    public void setResult(@androidx.annotation.Nullable TResult r2) {
            r1 = this;
            com.google.android.gms.tasks.zzw<TResult> r0 = r1.zza
            r0.zzb(r2)
            return
    }

    public boolean trySetException(@androidx.annotation.NonNull java.lang.Exception r2) {
            r1 = this;
            com.google.android.gms.tasks.zzw<TResult> r0 = r1.zza
            boolean r2 = r0.zzd(r2)
            return r2
    }

    public boolean trySetResult(@androidx.annotation.Nullable TResult r2) {
            r1 = this;
            com.google.android.gms.tasks.zzw<TResult> r0 = r1.zza
            boolean r2 = r0.zze(r2)
            return r2
    }
}
