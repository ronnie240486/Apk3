package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class RecyclableBufferedInputStream extends java.io.FilterInputStream {
    private volatile byte[] buf;
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;
    private int count;
    private int marklimit;
    private int markpos;
    private int pos;

    /* JADX INFO: loaded from: classes.dex */
    public static class InvalidMarkException extends java.io.IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public InvalidMarkException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public RecyclableBufferedInputStream(@androidx.annotation.NonNull java.io.InputStream r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = -1
            r1.markpos = r2
            r1.byteArrayPool = r3
            java.lang.Class<byte[]> r2 = byte[].class
            r0 = 65536(0x10000, float:9.1835E-41)
            java.lang.Object r2 = r3.get(r0, r2)
            byte[] r2 = (byte[]) r2
            r1.buf = r2
            return
    }

    private int fillbuf(java.io.InputStream r6, byte[] r7) throws java.io.IOException {
            r5 = this;
            int r0 = r5.markpos
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L57
            int r3 = r5.pos
            int r3 = r3 - r0
            int r4 = r5.marklimit
            if (r3 < r4) goto Le
            goto L57
        Le:
            if (r0 != 0) goto L36
            int r1 = r7.length
            if (r4 <= r1) goto L36
            int r1 = r5.count
            int r3 = r7.length
            if (r1 != r3) goto L36
            int r0 = r7.length
            int r0 = r0 * 2
            if (r0 <= r4) goto L1e
            goto L1f
        L1e:
            r4 = r0
        L1f:
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r5.byteArrayPool
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Object r0 = r0.get(r4, r1)
            byte[] r0 = (byte[]) r0
            int r1 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r2, r1)
            r5.buf = r0
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1 = r5.byteArrayPool
            r1.put(r7)
            r7 = r0
            goto L3d
        L36:
            if (r0 <= 0) goto L3d
            int r1 = r7.length
            int r1 = r1 - r0
            java.lang.System.arraycopy(r7, r0, r7, r2, r1)
        L3d:
            int r0 = r5.pos
            int r1 = r5.markpos
            int r0 = r0 - r1
            r5.pos = r0
            r5.markpos = r2
            r5.count = r2
            int r1 = r7.length
            int r1 = r1 - r0
            int r6 = r6.read(r7, r0, r1)
            int r7 = r5.pos
            if (r6 > 0) goto L53
            goto L54
        L53:
            int r7 = r7 + r6
        L54:
            r5.count = r7
            return r6
        L57:
            int r6 = r6.read(r7)
            if (r6 <= 0) goto L63
            r5.markpos = r1
            r5.pos = r2
            r5.count = r6
        L63:
            return r6
    }

    private static java.io.IOException streamClosed() throws java.io.IOException {
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "BufferedInputStream is closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            java.io.InputStream r0 = r3.in     // Catch: java.lang.Throwable -> L1a
            byte[] r1 = r3.buf     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L15
            if (r0 == 0) goto L15
            int r1 = r3.count     // Catch: java.lang.Throwable -> L1a
            int r2 = r3.pos     // Catch: java.lang.Throwable -> L1a
            int r1 = r1 - r2
            int r0 = r0.available()     // Catch: java.lang.Throwable -> L1a
            int r1 = r1 + r0
            monitor-exit(r3)
            return r1
        L15:
            java.io.IOException r0 = streamClosed()     // Catch: java.lang.Throwable -> L1a
            throw r0     // Catch: java.lang.Throwable -> L1a
        L1a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.buf
            r1 = 0
            if (r0 == 0) goto Le
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r3.byteArrayPool
            byte[] r2 = r3.buf
            r0.put(r2)
            r3.buf = r1
        Le:
            java.io.InputStream r0 = r3.in
            r3.in = r1
            if (r0 == 0) goto L17
            r0.close()
        L17:
            return
    }

    public synchronized void fixMarkLimit() {
            r1 = this;
            monitor-enter(r1)
            byte[] r0 = r1.buf     // Catch: java.lang.Throwable -> L8
            int r0 = r0.length     // Catch: java.lang.Throwable -> L8
            r1.marklimit = r0     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r2) {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.marklimit     // Catch: java.lang.Throwable -> Lf
            int r2 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> Lf
            r1.marklimit = r2     // Catch: java.lang.Throwable -> Lf
            int r2 = r1.pos     // Catch: java.lang.Throwable -> Lf
            r1.markpos = r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        Lf:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.buf     // Catch: java.lang.Throwable -> L3e
            java.io.InputStream r1 = r5.in     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L39
            if (r1 == 0) goto L39
            int r2 = r5.pos     // Catch: java.lang.Throwable -> L3e
            int r3 = r5.count     // Catch: java.lang.Throwable -> L3e
            r4 = -1
            if (r2 < r3) goto L18
            int r1 = r5.fillbuf(r1, r0)     // Catch: java.lang.Throwable -> L3e
            if (r1 != r4) goto L18
            monitor-exit(r5)
            return r4
        L18:
            byte[] r1 = r5.buf     // Catch: java.lang.Throwable -> L3e
            if (r0 == r1) goto L26
            byte[] r0 = r5.buf     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L21
            goto L26
        L21:
            java.io.IOException r0 = streamClosed()     // Catch: java.lang.Throwable -> L3e
            throw r0     // Catch: java.lang.Throwable -> L3e
        L26:
            int r1 = r5.count     // Catch: java.lang.Throwable -> L3e
            int r2 = r5.pos     // Catch: java.lang.Throwable -> L3e
            int r1 = r1 - r2
            if (r1 <= 0) goto L37
            int r1 = r2 + 1
            r5.pos = r1     // Catch: java.lang.Throwable -> L3e
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L3e
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L37:
            monitor-exit(r5)
            return r4
        L39:
            java.io.IOException r0 = streamClosed()     // Catch: java.lang.Throwable -> L3e
            throw r0     // Catch: java.lang.Throwable -> L3e
        L3e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@androidx.annotation.NonNull byte[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.buf     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L8b
            if (r9 != 0) goto La
            r7 = 0
            monitor-exit(r6)
            return r7
        La:
            java.io.InputStream r1 = r6.in     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L86
            int r2 = r6.pos     // Catch: java.lang.Throwable -> L90
            int r3 = r6.count     // Catch: java.lang.Throwable -> L90
            if (r2 >= r3) goto L32
            int r4 = r3 - r2
            if (r4 < r9) goto L1a
            r3 = r9
            goto L1b
        L1a:
            int r3 = r3 - r2
        L1b:
            java.lang.System.arraycopy(r0, r2, r7, r8, r3)     // Catch: java.lang.Throwable -> L90
            int r2 = r6.pos     // Catch: java.lang.Throwable -> L90
            int r2 = r2 + r3
            r6.pos = r2     // Catch: java.lang.Throwable -> L90
            if (r3 == r9) goto L30
            int r2 = r1.available()     // Catch: java.lang.Throwable -> L90
            if (r2 != 0) goto L2c
            goto L30
        L2c:
            int r8 = r8 + r3
            int r2 = r9 - r3
            goto L33
        L30:
            monitor-exit(r6)
            return r3
        L32:
            r2 = r9
        L33:
            int r3 = r6.markpos     // Catch: java.lang.Throwable -> L90
            r4 = -1
            if (r3 != r4) goto L48
            int r3 = r0.length     // Catch: java.lang.Throwable -> L90
            if (r2 < r3) goto L48
            int r3 = r1.read(r7, r8, r2)     // Catch: java.lang.Throwable -> L90
            if (r3 != r4) goto L76
            if (r2 != r9) goto L44
            goto L46
        L44:
            int r4 = r9 - r2
        L46:
            monitor-exit(r6)
            return r4
        L48:
            int r3 = r6.fillbuf(r1, r0)     // Catch: java.lang.Throwable -> L90
            if (r3 != r4) goto L55
            if (r2 != r9) goto L51
            goto L53
        L51:
            int r4 = r9 - r2
        L53:
            monitor-exit(r6)
            return r4
        L55:
            byte[] r3 = r6.buf     // Catch: java.lang.Throwable -> L90
            if (r0 == r3) goto L63
            byte[] r0 = r6.buf     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L5e
            goto L63
        L5e:
            java.io.IOException r7 = streamClosed()     // Catch: java.lang.Throwable -> L90
            throw r7     // Catch: java.lang.Throwable -> L90
        L63:
            int r3 = r6.count     // Catch: java.lang.Throwable -> L90
            int r4 = r6.pos     // Catch: java.lang.Throwable -> L90
            int r5 = r3 - r4
            if (r5 < r2) goto L6d
            r3 = r2
            goto L6e
        L6d:
            int r3 = r3 - r4
        L6e:
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch: java.lang.Throwable -> L90
            int r4 = r6.pos     // Catch: java.lang.Throwable -> L90
            int r4 = r4 + r3
            r6.pos = r4     // Catch: java.lang.Throwable -> L90
        L76:
            int r2 = r2 - r3
            if (r2 != 0) goto L7b
            monitor-exit(r6)
            return r9
        L7b:
            int r4 = r1.available()     // Catch: java.lang.Throwable -> L90
            if (r4 != 0) goto L84
            int r9 = r9 - r2
            monitor-exit(r6)
            return r9
        L84:
            int r8 = r8 + r3
            goto L33
        L86:
            java.io.IOException r7 = streamClosed()     // Catch: java.lang.Throwable -> L90
            throw r7     // Catch: java.lang.Throwable -> L90
        L8b:
            java.io.IOException r7 = streamClosed()     // Catch: java.lang.Throwable -> L90
            throw r7     // Catch: java.lang.Throwable -> L90
        L90:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public synchronized void release() {
            r2 = this;
            monitor-enter(r2)
            byte[] r0 = r2.buf     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r2.byteArrayPool     // Catch: java.lang.Throwable -> L11
            byte[] r1 = r2.buf     // Catch: java.lang.Throwable -> L11
            r0.put(r1)     // Catch: java.lang.Throwable -> L11
            r0 = 0
            r2.buf = r0     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r2)
            return
        L11:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            byte[] r0 = r3.buf     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L31
            r0 = -1
            int r1 = r3.markpos     // Catch: java.lang.Throwable -> L39
            if (r0 == r1) goto Le
            r3.pos = r1     // Catch: java.lang.Throwable -> L39
            monitor-exit(r3)
            return
        Le:
            com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream$InvalidMarkException r0 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream$InvalidMarkException     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "Mark has been invalidated, pos: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            int r2 = r3.pos     // Catch: java.lang.Throwable -> L39
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = " markLimit: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            int r2 = r3.marklimit     // Catch: java.lang.Throwable -> L39
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L39
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L39
            throw r0     // Catch: java.lang.Throwable -> L39
        L31:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = "Stream is closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L39
            throw r0     // Catch: java.lang.Throwable -> L39
        L39:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long r11) throws java.io.IOException {
            r10 = this;
            monitor-enter(r10)
            r0 = 1
            r2 = 0
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 >= 0) goto Lb
            monitor-exit(r10)
            return r2
        Lb:
            byte[] r0 = r10.buf     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L6e
            java.io.InputStream r1 = r10.in     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L69
            int r4 = r10.count     // Catch: java.lang.Throwable -> L73
            int r5 = r10.pos     // Catch: java.lang.Throwable -> L73
            int r6 = r4 - r5
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L73
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 < 0) goto L25
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L73
            long r0 = r0 + r11
            int r1 = (int) r0     // Catch: java.lang.Throwable -> L73
            r10.pos = r1     // Catch: java.lang.Throwable -> L73
            monitor-exit(r10)
            return r11
        L25:
            long r6 = (long) r4
            long r8 = (long) r5
            long r6 = r6 - r8
            r10.pos = r4     // Catch: java.lang.Throwable -> L73
            int r4 = r10.markpos     // Catch: java.lang.Throwable -> L73
            r5 = -1
            if (r4 == r5) goto L5b
            int r4 = r10.marklimit     // Catch: java.lang.Throwable -> L73
            long r8 = (long) r4     // Catch: java.lang.Throwable -> L73
            int r4 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r4 > 0) goto L5b
            int r0 = r10.fillbuf(r1, r0)     // Catch: java.lang.Throwable -> L73
            if (r0 != r5) goto L3e
            monitor-exit(r10)
            return r6
        L3e:
            int r0 = r10.count     // Catch: java.lang.Throwable -> L73
            int r1 = r10.pos     // Catch: java.lang.Throwable -> L73
            int r2 = r0 - r1
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L73
            long r4 = r11 - r6
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 < 0) goto L53
            long r0 = (long) r1     // Catch: java.lang.Throwable -> L73
            long r0 = r0 + r11
            long r0 = r0 - r6
            int r1 = (int) r0     // Catch: java.lang.Throwable -> L73
            r10.pos = r1     // Catch: java.lang.Throwable -> L73
            monitor-exit(r10)
            return r11
        L53:
            long r11 = (long) r0
            long r6 = r6 + r11
            long r11 = (long) r1
            long r6 = r6 - r11
            r10.pos = r0     // Catch: java.lang.Throwable -> L73
            monitor-exit(r10)
            return r6
        L5b:
            long r11 = r11 - r6
            long r11 = r1.skip(r11)     // Catch: java.lang.Throwable -> L73
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 <= 0) goto L66
            r10.markpos = r5     // Catch: java.lang.Throwable -> L73
        L66:
            long r6 = r6 + r11
            monitor-exit(r10)
            return r6
        L69:
            java.io.IOException r11 = streamClosed()     // Catch: java.lang.Throwable -> L73
            throw r11     // Catch: java.lang.Throwable -> L73
        L6e:
            java.io.IOException r11 = streamClosed()     // Catch: java.lang.Throwable -> L73
            throw r11     // Catch: java.lang.Throwable -> L73
        L73:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
    }
}
