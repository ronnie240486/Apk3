package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes3.dex */
public final class BufferedOutputStream extends java.io.OutputStream {
    private com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool;
    private byte[] buffer;
    private int index;

    @androidx.annotation.NonNull
    private final java.io.OutputStream out;

    public BufferedOutputStream(@androidx.annotation.NonNull java.io.OutputStream r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) {
            r1 = this;
            r1.<init>()
            r1.out = r2
            r1.arrayPool = r3
            java.lang.Class<byte[]> r2 = byte[].class
            r0 = 65536(0x10000, float:9.1835E-41)
            java.lang.Object r2 = r3.get(r0, r2)
            byte[] r2 = (byte[]) r2
            r1.buffer = r2
            return
    }

    private void flushBuffer() throws java.io.IOException {
            r4 = this;
            int r0 = r4.index
            if (r0 <= 0) goto Le
            java.io.OutputStream r1 = r4.out
            byte[] r2 = r4.buffer
            r3 = 0
            r1.write(r2, r3, r0)
            r4.index = r3
        Le:
            return
    }

    private void maybeFlushBuffer() throws java.io.IOException {
            r2 = this;
            int r0 = r2.index
            byte[] r1 = r2.buffer
            int r1 = r1.length
            if (r0 != r1) goto La
            r2.flushBuffer()
        La:
            return
    }

    private void release() {
            r2 = this;
            byte[] r0 = r2.buffer
            if (r0 == 0) goto Lc
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1 = r2.arrayPool
            r1.put(r0)
            r0 = 0
            r2.buffer = r0
        Lc:
            return
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            r2.flush()     // Catch: java.lang.Throwable -> Lc
            java.io.OutputStream r0 = r2.out
            r0.close()
            r2.release()
            return
        Lc:
            r0 = move-exception
            java.io.OutputStream r1 = r2.out
            r1.close()
            throw r0
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            r1.flushBuffer()
            java.io.OutputStream r0 = r1.out
            r0.flush()
            return
    }

    @Override // java.io.OutputStream
    public void write(int r4) throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.buffer
            int r1 = r3.index
            int r2 = r1 + 1
            r3.index = r2
            byte r4 = (byte) r4
            r0[r1] = r4
            r3.maybeFlushBuffer()
            return
    }

    @Override // java.io.OutputStream
    public void write(@androidx.annotation.NonNull byte[] r3) throws java.io.IOException {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.write(r3, r1, r0)
            return
    }

    @Override // java.io.OutputStream
    public void write(@androidx.annotation.NonNull byte[] r6, int r7, int r8) throws java.io.IOException {
            r5 = this;
            r0 = 0
        L1:
            int r1 = r8 - r0
            int r2 = r7 + r0
            int r3 = r5.index
            if (r3 != 0) goto L14
            byte[] r4 = r5.buffer
            int r4 = r4.length
            if (r1 < r4) goto L14
            java.io.OutputStream r7 = r5.out
            r7.write(r6, r2, r1)
            return
        L14:
            byte[] r4 = r5.buffer
            int r4 = r4.length
            int r4 = r4 - r3
            int r1 = java.lang.Math.min(r1, r4)
            byte[] r3 = r5.buffer
            int r4 = r5.index
            java.lang.System.arraycopy(r6, r2, r3, r4, r1)
            int r2 = r5.index
            int r2 = r2 + r1
            r5.index = r2
            int r0 = r0 + r1
            r5.maybeFlushBuffer()
            if (r0 < r8) goto L1
            return
    }
}
