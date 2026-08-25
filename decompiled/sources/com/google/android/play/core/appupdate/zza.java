package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zza {
    private static com.google.android.play.core.appupdate.zzaa zza;

    public static synchronized com.google.android.play.core.appupdate.zzaa zza(android.content.Context r3) {
            java.lang.Class<com.google.android.play.core.appupdate.zza> r0 = com.google.android.play.core.appupdate.zza.class
            monitor-enter(r0)
            com.google.android.play.core.appupdate.zzaa r1 = com.google.android.play.core.appupdate.zza.zza     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L1f
            com.google.android.play.core.appupdate.zzy r1 = new com.google.android.play.core.appupdate.zzy     // Catch: java.lang.Throwable -> L23
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L23
            com.google.android.play.core.appupdate.zzh r2 = new com.google.android.play.core.appupdate.zzh     // Catch: java.lang.Throwable -> L23
            android.content.Context r3 = com.google.android.play.core.internal.zzce.zza(r3)     // Catch: java.lang.Throwable -> L23
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L23
            r1.zza(r2)     // Catch: java.lang.Throwable -> L23
            com.google.android.play.core.appupdate.zzaa r3 = r1.zzb()     // Catch: java.lang.Throwable -> L23
            com.google.android.play.core.appupdate.zza.zza = r3     // Catch: java.lang.Throwable -> L23
        L1f:
            com.google.android.play.core.appupdate.zzaa r3 = com.google.android.play.core.appupdate.zza.zza     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)
            return r3
        L23:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }
}
