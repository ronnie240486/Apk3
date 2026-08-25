package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdr extends java.io.InputStream {
    private final java.util.Enumeration zza;

    @androidx.annotation.Nullable
    private java.io.InputStream zzb;

    public zzdr(java.util.Enumeration r1) throws java.io.IOException {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zza()
            return
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
            r1 = this;
            super.close()
            java.io.InputStream r0 = r1.zzb
            if (r0 == 0) goto Ld
            r0.close()
            r0 = 0
            r1.zzb = r0
        Ld:
            return
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
            r2 = this;
        L0:
            java.io.InputStream r0 = r2.zzb
            r1 = -1
            if (r0 == 0) goto L10
            int r0 = r0.read()
            if (r0 == r1) goto Lc
            return r0
        Lc:
            r2.zza()
            goto L0
        L10:
            return r1
    }

    @Override // java.io.InputStream
    public final int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.zzb
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.Objects.requireNonNull(r3)
            if (r4 < 0) goto L26
            if (r5 < 0) goto L26
            int r0 = r3.length
            int r0 = r0 - r4
            if (r5 > r0) goto L26
            if (r5 == 0) goto L24
        L13:
            java.io.InputStream r0 = r2.zzb
            int r0 = r0.read(r3, r4, r5)
            if (r0 <= 0) goto L1c
            return r0
        L1c:
            r2.zza()
            java.io.InputStream r0 = r2.zzb
            if (r0 != 0) goto L13
            return r1
        L24:
            r3 = 0
            return r3
        L26:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>()
            throw r3
    }

    public final void zza() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.zzb
            if (r0 == 0) goto L7
            r0.close()
        L7:
            java.util.Enumeration r0 = r2.zza
            boolean r0 = r0.hasMoreElements()
            if (r0 == 0) goto L1f
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.util.Enumeration r1 = r2.zza
            java.lang.Object r1 = r1.nextElement()
            java.io.File r1 = (java.io.File) r1
            r0.<init>(r1)
        L1c:
            r2.zzb = r0
            return
        L1f:
            r0 = 0
            goto L1c
    }
}
