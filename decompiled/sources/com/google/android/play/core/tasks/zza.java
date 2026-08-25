package com.google.android.play.core.tasks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zza implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.play.core.tasks.Task zza;
    public final /* synthetic */ com.google.android.play.core.tasks.zzb zzb;

    public zza(com.google.android.play.core.tasks.zzb r1, com.google.android.play.core.tasks.Task r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.play.core.tasks.zzb r0 = r3.zzb
            java.lang.Object r0 = com.google.android.play.core.tasks.zzb.zzb(r0)
            monitor-enter(r0)
            com.google.android.play.core.tasks.zzb r1 = r3.zzb     // Catch: java.lang.Throwable -> L1a
            com.google.android.play.core.tasks.OnCompleteListener r2 = com.google.android.play.core.tasks.zzb.zza(r1)     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L18
            com.google.android.play.core.tasks.OnCompleteListener r1 = com.google.android.play.core.tasks.zzb.zza(r1)     // Catch: java.lang.Throwable -> L1a
            com.google.android.play.core.tasks.Task r2 = r3.zza     // Catch: java.lang.Throwable -> L1a
            r1.onComplete(r2)     // Catch: java.lang.Throwable -> L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
    }
}
