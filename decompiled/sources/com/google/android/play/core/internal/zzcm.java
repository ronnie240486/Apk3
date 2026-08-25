package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcm implements java.io.Closeable {
    public zzcm() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract long zza();

    public abstract java.io.InputStream zzb(long r1, long r3) throws java.io.IOException;

    public final synchronized java.io.InputStream zzc() throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            long r2 = r4.zza()     // Catch: java.lang.Throwable -> Ld
            java.io.InputStream r0 = r4.zzb(r0, r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r4)
            return r0
        Ld:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }
}
