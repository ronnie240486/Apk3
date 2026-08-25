package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaac implements com.google.android.gms.tasks.OnCompleteListener {
    public final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zaa;
    public final /* synthetic */ com.google.android.gms.common.api.internal.zaad zab;

    public zaac(com.google.android.gms.common.api.internal.zaad r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@androidx.annotation.NonNull com.google.android.gms.tasks.Task r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zaad r2 = r1.zab
            java.util.Map r2 = com.google.android.gms.common.api.internal.zaad.zab(r2)
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zaa
            r2.remove(r0)
            return
    }
}
