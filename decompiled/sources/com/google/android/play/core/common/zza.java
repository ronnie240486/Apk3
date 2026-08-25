package com.google.android.play.core.common;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zza {
    private final java.util.Map zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb;

    public zza() {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.zza = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.zzb = r0
            return
    }

    private final synchronized void zzb() {
            r3 = this;
            monitor-enter(r3)
            java.util.Map r0 = r3.zza     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "assetOnlyUpdates"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lc
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r3)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final synchronized boolean zza(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.zzb     // Catch: java.lang.Throwable -> L23
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto Lc
            r1.zzb()     // Catch: java.lang.Throwable -> L23
        Lc:
            java.util.Map r2 = r1.zza     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "assetOnlyUpdates"
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L23
            boolean r0 = r2 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L1b
            r2 = 0
            monitor-exit(r1)
            return r2
        L1b:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L23
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r1)
            return r2
        L23:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
