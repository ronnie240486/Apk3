package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes2.dex */
final class ReusableBufferedOutputStream extends java.io.BufferedOutputStream {
    private boolean closed;

    public ReusableBufferedOutputStream(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ReusableBufferedOutputStream(java.io.OutputStream r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.closed = r0
            r2.flush()     // Catch: java.lang.Throwable -> L8
            r0 = 0
            goto L9
        L8:
            r0 = move-exception
        L9:
            java.io.OutputStream r1 = r2.out     // Catch: java.lang.Throwable -> Lf
            r1.close()     // Catch: java.lang.Throwable -> Lf
            goto L13
        Lf:
            r1 = move-exception
            if (r0 != 0) goto L13
            r0 = r1
        L13:
            if (r0 == 0) goto L18
            com.google.android.exoplayer2.util.Util.sneakyThrow(r0)
        L18:
            return
    }

    public void reset(java.io.OutputStream r2) {
            r1 = this;
            boolean r0 = r1.closed
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r1.out = r2
            r2 = 0
            r1.count = r2
            r1.closed = r2
            return
    }
}
