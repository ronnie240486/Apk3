package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzd implements com.google.android.play.core.internal.zzc {
    private final java.nio.channels.FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzd(java.nio.channels.FileChannel r1, long r2, long r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r4
            return
    }

    @Override // com.google.android.play.core.internal.zzc
    public final long zza() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    @Override // com.google.android.play.core.internal.zzc
    public final void zzb(java.security.MessageDigest[] r9, long r10, int r12) throws java.io.IOException {
            r8 = this;
            long r0 = r8.zzb
            java.nio.channels.FileChannel r2 = r8.zza
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY
            long r4 = r0 + r10
            long r6 = (long) r12
            java.nio.MappedByteBuffer r10 = r2.map(r3, r4, r6)
            r10.load()
            int r11 = r9.length
            r12 = 0
            r0 = 0
        L13:
            if (r0 >= r11) goto L20
            r1 = r9[r0]
            r10.position(r12)
            r1.update(r10)
            int r0 = r0 + 1
            goto L13
        L20:
            return
    }
}
