package com.google.common.io;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public final class CountingOutputStream extends java.io.FilterOutputStream {
    private long count;

    public CountingOutputStream(java.io.OutputStream r1) {
            r0 = this;
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.io.OutputStream r1 = (java.io.OutputStream) r1
            r0.<init>(r1)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.close()
            return
    }

    public long getCount() {
            r2 = this;
            long r0 = r2.count
            return r0
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r5) throws java.io.IOException {
            r4 = this;
            java.io.OutputStream r0 = r4.out
            r0.write(r5)
            long r0 = r4.count
            r2 = 1
            long r0 = r0 + r2
            r4.count = r0
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            r0.write(r3, r4, r5)
            long r3 = r2.count
            long r0 = (long) r5
            long r3 = r3 + r0
            r2.count = r3
            return
    }
}
