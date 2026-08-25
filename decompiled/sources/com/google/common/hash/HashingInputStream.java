package com.google.common.hash;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.hash.ElementTypesAreNonnullByDefault
public final class HashingInputStream extends java.io.FilterInputStream {
    private final com.google.common.hash.Hasher hasher;

    public HashingInputStream(com.google.common.hash.HashFunction r1, java.io.InputStream r2) {
            r0 = this;
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.io.InputStream r2 = (java.io.InputStream) r2
            r0.<init>(r2)
            com.google.common.hash.Hasher r1 = r1.newHasher()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.hash.Hasher r1 = (com.google.common.hash.Hasher) r1
            r0.hasher = r1
            return
    }

    public com.google.common.hash.HashCode hash() {
            r1 = this;
            com.google.common.hash.Hasher r0 = r1.hasher
            com.google.common.hash.HashCode r0 = r0.hash()
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int r1) {
            r0 = this;
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int read() throws java.io.IOException {
            r3 = this;
            java.io.InputStream r0 = r3.in
            int r0 = r0.read()
            r1 = -1
            if (r0 == r1) goto Lf
            com.google.common.hash.Hasher r1 = r3.hasher
            byte r2 = (byte) r0
            r1.putByte(r2)
        Lf:
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            int r4 = r0.read(r2, r3, r4)
            r0 = -1
            if (r4 == r0) goto Le
            com.google.common.hash.Hasher r0 = r1.hasher
            r0.putBytes(r2, r3, r4)
        Le:
            return r4
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws java.io.IOException {
            r2 = this;
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "reset not supported"
            r0.<init>(r1)
            throw r0
    }
}
