package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
abstract class zaav implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zab;

    public /* synthetic */ zaav(com.google.android.gms.common.api.internal.zaaw r1) {
            r0 = this;
            r0.zab = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    @androidx.annotation.WorkerThread
    public final void run() {
            r2 = this;
            com.google.android.gms.common.api.internal.zaaw r0 = r2.zab
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaw.zap(r0)
            r0.lock()
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L23 java.lang.RuntimeException -> L25
            if (r0 == 0) goto L19
            com.google.android.gms.common.api.internal.zaaw r0 = r2.zab
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaw.zap(r0)
        L15:
            r0.unlock()
            return
        L19:
            r2.zaa()     // Catch: java.lang.Throwable -> L23 java.lang.RuntimeException -> L25
            com.google.android.gms.common.api.internal.zaaw r0 = r2.zab
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaw.zap(r0)
            goto L15
        L23:
            r0 = move-exception
            goto L36
        L25:
            r0 = move-exception
            com.google.android.gms.common.api.internal.zaaw r1 = r2.zab     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.common.api.internal.zabi r1 = com.google.android.gms.common.api.internal.zaaw.zak(r1)     // Catch: java.lang.Throwable -> L23
            r1.zam(r0)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.common.api.internal.zaaw r0 = r2.zab
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaw.zap(r0)
            goto L15
        L36:
            com.google.android.gms.common.api.internal.zaaw r1 = r2.zab
            java.util.concurrent.locks.Lock r1 = com.google.android.gms.common.api.internal.zaaw.zap(r1)
            r1.unlock()
            throw r0
    }

    @androidx.annotation.WorkerThread
    public abstract void zaa();
}
