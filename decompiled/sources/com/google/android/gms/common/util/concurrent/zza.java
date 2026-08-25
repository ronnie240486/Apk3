package com.google.android.gms.common.util.concurrent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zza implements java.lang.Runnable {
    private final java.lang.Runnable zza;

    public zza(java.lang.Runnable r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            r0 = 0
            android.os.Process.setThreadPriority(r0)
            java.lang.Runnable r0 = r1.zza
            r0.run()
            return
    }
}
