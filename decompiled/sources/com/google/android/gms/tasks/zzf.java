package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zzf<TResult, TContinuationResult> implements com.google.android.gms.tasks.OnSuccessListener<TContinuationResult>, com.google.android.gms.tasks.OnFailureListener, com.google.android.gms.tasks.OnCanceledListener, com.google.android.gms.tasks.zzq {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.tasks.Continuation<TResult, com.google.android.gms.tasks.Task<TContinuationResult>> zzb;
    private final com.google.android.gms.tasks.zzw<TContinuationResult> zzc;

    public zzf(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull com.google.android.gms.tasks.Continuation<TResult, com.google.android.gms.tasks.Task<TContinuationResult>> r2, @androidx.annotation.NonNull com.google.android.gms.tasks.zzw<TContinuationResult> r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.tasks.Continuation zza(com.google.android.gms.tasks.zzf r0) {
            com.google.android.gms.tasks.Continuation<TResult, com.google.android.gms.tasks.Task<TContinuationResult>> r0 = r0.zzb
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.tasks.zzw zzb(com.google.android.gms.tasks.zzf r0) {
            com.google.android.gms.tasks.zzw<TContinuationResult> r0 = r0.zzc
            return r0
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
            r1 = this;
            com.google.android.gms.tasks.zzw<TContinuationResult> r0 = r1.zzc
            r0.zzc()
            return
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@androidx.annotation.NonNull java.lang.Exception r2) {
            r1 = this;
            com.google.android.gms.tasks.zzw<TContinuationResult> r0 = r1.zzc
            r0.zza(r2)
            return
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult r2) {
            r1 = this;
            com.google.android.gms.tasks.zzw<TContinuationResult> r0 = r1.zzc
            r0.zzb(r2)
            return
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(@androidx.annotation.NonNull com.google.android.gms.tasks.Task<TResult> r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.zza
            com.google.android.gms.tasks.zze r1 = new com.google.android.gms.tasks.zze
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }
}
