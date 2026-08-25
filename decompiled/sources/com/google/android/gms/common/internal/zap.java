package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zap implements com.google.android.gms.common.api.PendingResult.StatusListener {
    public final /* synthetic */ com.google.android.gms.common.api.PendingResult zaa;
    public final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zab;
    public final /* synthetic */ com.google.android.gms.common.internal.PendingResultUtil.ResultConverter zac;
    public final /* synthetic */ com.google.android.gms.common.internal.zas zad;

    public zap(com.google.android.gms.common.api.PendingResult r1, com.google.android.gms.tasks.TaskCompletionSource r2, com.google.android.gms.common.internal.PendingResultUtil.ResultConverter r3, com.google.android.gms.common.internal.zas r4) {
            r0 = this;
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.zad = r4
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(com.google.android.gms.common.api.Status r4) {
            r3 = this;
            boolean r0 = r4.isSuccess()
            if (r0 == 0) goto L1c
            com.google.android.gms.common.api.PendingResult r4 = r3.zaa
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 0
            com.google.android.gms.common.api.Result r4 = r4.await(r1, r0)
            com.google.android.gms.tasks.TaskCompletionSource r0 = r3.zab
            com.google.android.gms.common.internal.PendingResultUtil$ResultConverter r1 = r3.zac
            java.lang.Object r4 = r1.convert(r4)
            r0.setResult(r4)
            return
        L1c:
            com.google.android.gms.tasks.TaskCompletionSource r0 = r3.zab
            com.google.android.gms.common.api.ApiException r4 = com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(r4)
            r0.setException(r4)
            return
    }
}
