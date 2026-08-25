package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzu {
    private static com.google.android.play.core.splitinstall.zzp zza;

    public static synchronized com.google.android.play.core.splitinstall.zzp zza(android.content.Context r3) {
            java.lang.Class<com.google.android.play.core.splitinstall.zzu> r0 = com.google.android.play.core.splitinstall.zzu.class
            monitor-enter(r0)
            com.google.android.play.core.splitinstall.zzp r1 = com.google.android.play.core.splitinstall.zzu.zza     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L1f
            com.google.android.play.core.splitinstall.zzc r1 = new com.google.android.play.core.splitinstall.zzc     // Catch: java.lang.Throwable -> L23
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L23
            com.google.android.play.core.splitinstall.zzac r2 = new com.google.android.play.core.splitinstall.zzac     // Catch: java.lang.Throwable -> L23
            android.content.Context r3 = com.google.android.play.core.internal.zzce.zza(r3)     // Catch: java.lang.Throwable -> L23
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L23
            r1.zza(r2)     // Catch: java.lang.Throwable -> L23
            com.google.android.play.core.splitinstall.zzp r3 = r1.zzb()     // Catch: java.lang.Throwable -> L23
            com.google.android.play.core.splitinstall.zzu.zza = r3     // Catch: java.lang.Throwable -> L23
        L1f:
            com.google.android.play.core.splitinstall.zzp r3 = com.google.android.play.core.splitinstall.zzu.zza     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)
            return r3
        L23:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }
}
