package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zab implements com.google.android.gms.common.api.PendingResult.StatusListener {
    public final /* synthetic */ com.google.android.gms.common.api.Batch zaa;

    public zab(com.google.android.gms.common.api.Batch r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(com.google.android.gms.common.api.Status r5) {
            r4 = this;
            com.google.android.gms.common.api.Batch r0 = r4.zaa
            java.lang.Object r0 = com.google.android.gms.common.api.Batch.zab(r0)
            monitor-enter(r0)
            com.google.android.gms.common.api.Batch r1 = r4.zaa     // Catch: java.lang.Throwable -> L65
            boolean r1 = r1.isCanceled()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            return
        L11:
            boolean r1 = r5.isCanceled()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L1d
            com.google.android.gms.common.api.Batch r5 = r4.zaa     // Catch: java.lang.Throwable -> L65
            com.google.android.gms.common.api.Batch.zad(r5)     // Catch: java.lang.Throwable -> L65
            goto L28
        L1d:
            boolean r5 = r5.isSuccess()     // Catch: java.lang.Throwable -> L65
            if (r5 != 0) goto L28
            com.google.android.gms.common.api.Batch r5 = r4.zaa     // Catch: java.lang.Throwable -> L65
            com.google.android.gms.common.api.Batch.zac(r5)     // Catch: java.lang.Throwable -> L65
        L28:
            com.google.android.gms.common.api.Batch r5 = r4.zaa     // Catch: java.lang.Throwable -> L65
            int r1 = com.google.android.gms.common.api.Batch.zaa(r5)     // Catch: java.lang.Throwable -> L65
            int r1 = r1 + (-1)
            com.google.android.gms.common.api.Batch.zae(r5, r1)     // Catch: java.lang.Throwable -> L65
            com.google.android.gms.common.api.Batch r5 = r4.zaa     // Catch: java.lang.Throwable -> L65
            int r1 = com.google.android.gms.common.api.Batch.zaa(r5)     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L63
            boolean r1 = com.google.android.gms.common.api.Batch.zah(r5)     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L45
            com.google.android.gms.common.api.Batch.zaf(r5)     // Catch: java.lang.Throwable -> L65
            goto L63
        L45:
            boolean r5 = com.google.android.gms.common.api.Batch.zag(r5)     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L53
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status     // Catch: java.lang.Throwable -> L65
            r1 = 13
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L65
            goto L55
        L53:
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.RESULT_SUCCESS     // Catch: java.lang.Throwable -> L65
        L55:
            com.google.android.gms.common.api.Batch r1 = r4.zaa     // Catch: java.lang.Throwable -> L65
            com.google.android.gms.common.api.BatchResult r2 = new com.google.android.gms.common.api.BatchResult     // Catch: java.lang.Throwable -> L65
            com.google.android.gms.common.api.PendingResult[] r3 = com.google.android.gms.common.api.Batch.zai(r1)     // Catch: java.lang.Throwable -> L65
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L65
            r1.setResult(r2)     // Catch: java.lang.Throwable -> L65
        L63:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            return
        L65:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            throw r5
    }
}
