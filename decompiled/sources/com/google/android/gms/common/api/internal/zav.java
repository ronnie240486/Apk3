package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zav implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.common.api.internal.zaaa zaa;

    public zav(com.google.android.gms.common.api.internal.zaaa r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.common.api.internal.zaaa r0 = r2.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaa.zaj(r0)
            r0.lock()
            com.google.android.gms.common.api.internal.zaaa r0 = r2.zaa     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.api.internal.zaaa.zap(r0)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.api.internal.zaaa r0 = r2.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaa.zaj(r0)
            r0.unlock()
            return
        L18:
            r0 = move-exception
            com.google.android.gms.common.api.internal.zaaa r1 = r2.zaa
            java.util.concurrent.locks.Lock r1 = com.google.android.gms.common.api.internal.zaaa.zaj(r1)
            r1.unlock()
            throw r0
    }
}
