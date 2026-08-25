package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zacy implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.common.api.Result zaa;
    public final /* synthetic */ com.google.android.gms.common.api.internal.zada zab;

    public zacy(com.google.android.gms.common.api.internal.zada r1, com.google.android.gms.common.api.Result r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    @androidx.annotation.WorkerThread
    public final void run() {
            r5 = this;
            java.lang.ThreadLocal<java.lang.Boolean> r0 = com.google.android.gms.common.api.internal.BasePendingResult.zaa     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46
            r0.set(r1)     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46
            com.google.android.gms.common.api.internal.zada r1 = r5.zab     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46
            com.google.android.gms.common.api.ResultTransform r1 = com.google.android.gms.common.api.internal.zada.zaa(r1)     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46
            com.google.android.gms.common.api.ResultTransform r1 = (com.google.android.gms.common.api.ResultTransform) r1     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46
            com.google.android.gms.common.api.Result r2 = r5.zaa     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46
            com.google.android.gms.common.api.PendingResult r1 = r1.onSuccess(r2)     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46
            com.google.android.gms.common.api.internal.zada r2 = r5.zab     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46
            com.google.android.gms.common.api.internal.zacz r3 = com.google.android.gms.common.api.internal.zada.zab(r2)     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46
            com.google.android.gms.common.api.internal.zacz r2 = com.google.android.gms.common.api.internal.zada.zab(r2)     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46
            r4 = 0
            android.os.Message r1 = r2.obtainMessage(r4, r1)     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46
            r3.sendMessage(r1)     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.set(r1)
            com.google.android.gms.common.api.Result r0 = r5.zaa
            com.google.android.gms.common.api.internal.zada.zaf(r0)
            com.google.android.gms.common.api.internal.zada r0 = r5.zab
            java.lang.ref.WeakReference r0 = com.google.android.gms.common.api.internal.zada.zae(r0)
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.GoogleApiClient r0 = (com.google.android.gms.common.api.GoogleApiClient) r0
            if (r0 == 0) goto L78
            goto L73
        L44:
            r0 = move-exception
            goto L79
        L46:
            r0 = move-exception
            com.google.android.gms.common.api.internal.zada r1 = r5.zab     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.common.api.internal.zacz r2 = com.google.android.gms.common.api.internal.zada.zab(r1)     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.common.api.internal.zacz r1 = com.google.android.gms.common.api.internal.zada.zab(r1)     // Catch: java.lang.Throwable -> L44
            r3 = 1
            android.os.Message r0 = r1.obtainMessage(r3, r0)     // Catch: java.lang.Throwable -> L44
            r2.sendMessage(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.ThreadLocal<java.lang.Boolean> r0 = com.google.android.gms.common.api.internal.BasePendingResult.zaa
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.set(r1)
            com.google.android.gms.common.api.Result r0 = r5.zaa
            com.google.android.gms.common.api.internal.zada.zaf(r0)
            com.google.android.gms.common.api.internal.zada r0 = r5.zab
            java.lang.ref.WeakReference r0 = com.google.android.gms.common.api.internal.zada.zae(r0)
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.GoogleApiClient r0 = (com.google.android.gms.common.api.GoogleApiClient) r0
            if (r0 == 0) goto L78
        L73:
            com.google.android.gms.common.api.internal.zada r1 = r5.zab
            r0.zap(r1)
        L78:
            return
        L79:
            java.lang.ThreadLocal<java.lang.Boolean> r1 = com.google.android.gms.common.api.internal.BasePendingResult.zaa
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.set(r2)
            com.google.android.gms.common.api.Result r1 = r5.zaa
            com.google.android.gms.common.api.internal.zada.zaf(r1)
            com.google.android.gms.common.api.internal.zada r1 = r5.zab
            java.lang.ref.WeakReference r1 = com.google.android.gms.common.api.internal.zada.zae(r1)
            java.lang.Object r1 = r1.get()
            com.google.android.gms.common.api.GoogleApiClient r1 = (com.google.android.gms.common.api.GoogleApiClient) r1
            if (r1 != 0) goto L94
            goto L99
        L94:
            com.google.android.gms.common.api.internal.zada r2 = r5.zab
            r1.zap(r2)
        L99:
            throw r0
    }
}
