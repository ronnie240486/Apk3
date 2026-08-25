package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
abstract class zabg {
    private final com.google.android.gms.common.api.internal.zabf zaa;

    public zabg(com.google.android.gms.common.api.internal.zabf r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    public abstract void zaa();

    public final void zab(com.google.android.gms.common.api.internal.zabi r3) {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zabi.zah(r3)
            r0.lock()
            com.google.android.gms.common.api.internal.zabf r0 = com.google.android.gms.common.api.internal.zabi.zag(r3)     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.api.internal.zabf r1 = r2.zaa     // Catch: java.lang.Throwable -> L1f
            if (r0 == r1) goto L17
            java.util.concurrent.locks.Lock r3 = com.google.android.gms.common.api.internal.zabi.zah(r3)
        L13:
            r3.unlock()
            return
        L17:
            r2.zaa()     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.locks.Lock r3 = com.google.android.gms.common.api.internal.zabi.zah(r3)
            goto L13
        L1f:
            r0 = move-exception
            java.util.concurrent.locks.Lock r3 = com.google.android.gms.common.api.internal.zabi.zah(r3)
            r3.unlock()
            throw r0
    }
}
