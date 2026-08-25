package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes.dex */
public class PoolingByteArrayOutputStream extends java.io.ByteArrayOutputStream {
    private static final int DEFAULT_SIZE = 256;
    private final com.android.volley.toolbox.ByteArrayPool mPool;

    public PoolingByteArrayOutputStream(com.android.volley.toolbox.ByteArrayPool r2) {
            r1 = this;
            r0 = 256(0x100, float:3.59E-43)
            r1.<init>(r2, r0)
            return
    }

    public PoolingByteArrayOutputStream(com.android.volley.toolbox.ByteArrayPool r2, int r3) {
            r1 = this;
            r1.<init>()
            r1.mPool = r2
            r0 = 256(0x100, float:3.59E-43)
            int r3 = java.lang.Math.max(r3, r0)
            byte[] r2 = r2.getBuf(r3)
            r1.buf = r2
            return
    }

    private void expand(int r4) {
            r3 = this;
            int r0 = r3.count
            int r1 = r0 + r4
            byte[] r2 = r3.buf
            int r2 = r2.length
            if (r1 > r2) goto La
            return
        La:
            com.android.volley.toolbox.ByteArrayPool r1 = r3.mPool
            int r0 = r0 + r4
            int r0 = r0 * 2
            byte[] r4 = r1.getBuf(r0)
            byte[] r0 = r3.buf
            int r1 = r3.count
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            com.android.volley.toolbox.ByteArrayPool r0 = r3.mPool
            byte[] r1 = r3.buf
            r0.returnBuf(r1)
            r3.buf = r4
            return
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            com.android.volley.toolbox.ByteArrayPool r0 = r2.mPool
            byte[] r1 = r2.buf
            r0.returnBuf(r1)
            r0 = 0
            r2.buf = r0
            super.close()
            return
    }

    public void finalize() {
            r2 = this;
            com.android.volley.toolbox.ByteArrayPool r0 = r2.mPool
            byte[] r1 = r2.buf
            r0.returnBuf(r1)
            return
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int r2) {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.expand(r0)     // Catch: java.lang.Throwable -> La
            super.write(r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return
        La:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] r1, int r2, int r3) {
            r0 = this;
            monitor-enter(r0)
            r0.expand(r3)     // Catch: java.lang.Throwable -> L9
            super.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
