package com.google.common.hash;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.hash.ElementTypesAreNonnullByDefault
public final class HashingOutputStream extends java.io.FilterOutputStream {
    private final com.google.common.hash.Hasher hasher;

    public HashingOutputStream(com.google.common.hash.HashFunction r1, java.io.OutputStream r2) {
            r0 = this;
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.io.OutputStream r2 = (java.io.OutputStream) r2
            r0.<init>(r2)
            com.google.common.hash.Hasher r1 = r1.newHasher()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.hash.Hasher r1 = (com.google.common.hash.Hasher) r1
            r0.hasher = r1
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.close()
            return
    }

    public com.google.common.hash.HashCode hash() {
            r1 = this;
            com.google.common.hash.Hasher r0 = r1.hasher
            com.google.common.hash.HashCode r0 = r0.hash()
            return r0
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            com.google.common.hash.Hasher r0 = r2.hasher
            byte r1 = (byte) r3
            r0.putByte(r1)
            java.io.OutputStream r0 = r2.out
            r0.write(r3)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            com.google.common.hash.Hasher r0 = r1.hasher
            r0.putBytes(r2, r3, r4)
            java.io.OutputStream r0 = r1.out
            r0.write(r2, r3, r4)
            return
    }
}
