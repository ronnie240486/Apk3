package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes2.dex */
public final class ExceptionPassthroughInputStream extends java.io.InputStream {

    @androidx.annotation.GuardedBy("POOL")
    private static final java.util.Queue<com.bumptech.glide.util.ExceptionPassthroughInputStream> POOL = null;
    private java.io.IOException exception;
    private java.io.InputStream wrapped;

    static {
            r0 = 0
            java.util.Queue r0 = com.bumptech.glide.util.Util.createQueue(r0)
            com.bumptech.glide.util.ExceptionPassthroughInputStream.POOL = r0
            return
    }

    public ExceptionPassthroughInputStream() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.util.ExceptionPassthroughInputStream obtain(@androidx.annotation.NonNull java.io.InputStream r2) {
            java.util.Queue<com.bumptech.glide.util.ExceptionPassthroughInputStream> r0 = com.bumptech.glide.util.ExceptionPassthroughInputStream.POOL
            monitor-enter(r0)
            java.lang.Object r1 = r0.poll()     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.util.ExceptionPassthroughInputStream r1 = (com.bumptech.glide.util.ExceptionPassthroughInputStream) r1     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L11
            com.bumptech.glide.util.ExceptionPassthroughInputStream r1 = new com.bumptech.glide.util.ExceptionPassthroughInputStream
            r1.<init>()
        L11:
            r1.wrapped = r2
            return r1
        L14:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.wrapped
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.wrapped
            r0.close()
            return
    }

    @androidx.annotation.Nullable
    public java.io.IOException getException() {
            r1 = this;
            java.io.IOException r0 = r1.exception
            return r0
    }

    @Override // java.io.InputStream
    public void mark(int r2) {
            r1 = this;
            java.io.InputStream r0 = r1.wrapped
            r0.mark(r2)
            return
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            java.io.InputStream r0 = r1.wrapped
            boolean r0 = r0.markSupported()
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.wrapped     // Catch: java.io.IOException -> L7
            int r0 = r0.read()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            r1.exception = r0
            throw r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r2) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.wrapped     // Catch: java.io.IOException -> L7
            int r2 = r0.read(r2)     // Catch: java.io.IOException -> L7
            return r2
        L7:
            r2 = move-exception
            r1.exception = r2
            throw r2
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.wrapped     // Catch: java.io.IOException -> L7
            int r2 = r0.read(r2, r3, r4)     // Catch: java.io.IOException -> L7
            return r2
        L7:
            r2 = move-exception
            r1.exception = r2
            throw r2
    }

    public void release() {
            r2 = this;
            r0 = 0
            r2.exception = r0
            r2.wrapped = r0
            java.util.Queue<com.bumptech.glide.util.ExceptionPassthroughInputStream> r0 = com.bumptech.glide.util.ExceptionPassthroughInputStream.POOL
            monitor-enter(r0)
            r0.offer(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.wrapped     // Catch: java.lang.Throwable -> L8
            r0.reset()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // java.io.InputStream
    public long skip(long r2) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.wrapped     // Catch: java.io.IOException -> L7
            long r2 = r0.skip(r2)     // Catch: java.io.IOException -> L7
            return r2
        L7:
            r2 = move-exception
            r1.exception = r2
            throw r2
    }
}
