package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzb implements com.google.android.play.core.internal.zzc {
    private final java.nio.ByteBuffer zza;

    public zzb(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.<init>()
            java.nio.ByteBuffer r1 = r1.slice()
            r0.zza = r1
            return
    }

    @Override // com.google.android.play.core.internal.zzc
    public final long zza() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.zza
            int r0 = r0.capacity()
            long r0 = (long) r0
            return r0
    }

    @Override // com.google.android.play.core.internal.zzc
    public final void zzb(java.security.MessageDigest[] r3, long r4, int r6) throws java.io.IOException {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.zza
            monitor-enter(r0)
            java.nio.ByteBuffer r1 = r2.zza     // Catch: java.lang.Throwable -> L27
            int r5 = (int) r4     // Catch: java.lang.Throwable -> L27
            r1.position(r5)     // Catch: java.lang.Throwable -> L27
            java.nio.ByteBuffer r4 = r2.zza     // Catch: java.lang.Throwable -> L27
            int r5 = r5 + r6
            r4.limit(r5)     // Catch: java.lang.Throwable -> L27
            java.nio.ByteBuffer r4 = r2.zza     // Catch: java.lang.Throwable -> L27
            java.nio.ByteBuffer r4 = r4.slice()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            int r5 = r3.length
            r6 = 0
            r0 = 0
        L19:
            if (r0 >= r5) goto L26
            r1 = r3[r0]
            r4.position(r6)
            r1.update(r4)
            int r0 = r0 + 1
            goto L19
        L26:
            return
        L27:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r3
    }
}
