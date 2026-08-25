package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zzs implements com.google.android.gms.tasks.OnTokenCanceledListener {
    public final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzs(com.google.android.gms.tasks.TaskCompletionSource r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zza
            com.google.android.gms.tasks.zzw r0 = com.google.android.gms.tasks.TaskCompletionSource.zza(r0)
            r0.zzc()
            return
    }
}
