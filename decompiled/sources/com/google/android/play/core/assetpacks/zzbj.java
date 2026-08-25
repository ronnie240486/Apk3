package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbj extends java.io.InputStream {
    private final java.io.InputStream zza;
    private long zzb;

    public zzbj(java.io.InputStream r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
            r2 = this;
            super.close()
            java.io.InputStream r0 = r2.zza
            r0.close()
            r0 = 0
            r2.zzb = r0
            return
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
            r5 = this;
            long r0 = r5.zzb
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto La
            r0 = -1
            return r0
        La:
            r2 = -1
            long r0 = r0 + r2
            r5.zzb = r0
            java.io.InputStream r0 = r5.zza
            int r0 = r0.read()
            return r0
    }

    @Override // java.io.InputStream
    public final int read(byte[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            long r0 = r6.zzb
            r2 = -1
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto La
            return r2
        La:
            long r3 = (long) r9
            long r0 = java.lang.Math.min(r3, r0)
            java.io.InputStream r9 = r6.zza
            int r1 = (int) r0
            int r7 = r9.read(r7, r8, r1)
            if (r7 == r2) goto L1e
            long r8 = r6.zzb
            long r0 = (long) r7
            long r8 = r8 - r0
            r6.zzb = r8
        L1e:
            return r7
    }
}
