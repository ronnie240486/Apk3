package com.bumptech.glide.disklrucache;

/* JADX INFO: loaded from: classes2.dex */
class StrictLineReader implements java.io.Closeable {
    private static final byte CR = 13;
    private static final byte LF = 10;
    private byte[] buf;
    private final java.nio.charset.Charset charset;
    private int end;
    private final java.io.InputStream in;
    private int pos;


    public StrictLineReader(java.io.InputStream r2, int r3, java.nio.charset.Charset r4) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L2a
            if (r4 == 0) goto L2a
            if (r3 < 0) goto L22
            java.nio.charset.Charset r0 = com.bumptech.glide.disklrucache.Util.US_ASCII
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1a
            r1.in = r2
            r1.charset = r4
            byte[] r2 = new byte[r3]
            r1.buf = r2
            return
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Unsupported encoding"
            r2.<init>(r3)
            throw r2
        L22:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "capacity <= 0"
            r2.<init>(r3)
            throw r2
        L2a:
            r2 = 0
            throw r2
    }

    public StrictLineReader(java.io.InputStream r2, java.nio.charset.Charset r3) {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r0, r3)
            return
    }

    public static /* synthetic */ java.nio.charset.Charset access$000(com.bumptech.glide.disklrucache.StrictLineReader r0) {
            java.nio.charset.Charset r0 = r0.charset
            return r0
    }

    private void fillBuf() throws java.io.IOException {
            r4 = this;
            java.io.InputStream r0 = r4.in
            byte[] r1 = r4.buf
            int r2 = r1.length
            r3 = 0
            int r0 = r0.read(r1, r3, r2)
            r1 = -1
            if (r0 == r1) goto L12
            r4.pos = r3
            r4.end = r0
            return
        L12:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            monitor-enter(r0)
            byte[] r1 = r2.buf     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto Lf
            r1 = 0
            r2.buf = r1     // Catch: java.lang.Throwable -> L11
            java.io.InputStream r1 = r2.in     // Catch: java.lang.Throwable -> L11
            r1.close()     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    public boolean hasUnterminatedLine() {
            r2 = this;
            int r0 = r2.end
            r1 = -1
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public java.lang.String readLine() throws java.io.IOException {
            r7 = this;
            java.io.InputStream r0 = r7.in
            monitor-enter(r0)
            byte[] r1 = r7.buf     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L7f
            int r1 = r7.pos     // Catch: java.lang.Throwable -> L87
            int r2 = r7.end     // Catch: java.lang.Throwable -> L87
            if (r1 < r2) goto L10
            r7.fillBuf()     // Catch: java.lang.Throwable -> L87
        L10:
            int r1 = r7.pos     // Catch: java.lang.Throwable -> L87
        L12:
            int r2 = r7.end     // Catch: java.lang.Throwable -> L87
            r3 = 10
            if (r1 == r2) goto L41
            byte[] r2 = r7.buf     // Catch: java.lang.Throwable -> L87
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L87
            if (r4 != r3) goto L3e
            int r3 = r7.pos     // Catch: java.lang.Throwable -> L87
            if (r1 == r3) goto L2b
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L87
            r6 = 13
            if (r5 != r6) goto L2b
            goto L2c
        L2b:
            r4 = r1
        L2c:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L87
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.charset     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L87
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L87
            int r1 = r1 + 1
            r7.pos = r1     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            return r5
        L3e:
            int r1 = r1 + 1
            goto L12
        L41:
            com.bumptech.glide.disklrucache.StrictLineReader$1 r1 = new com.bumptech.glide.disklrucache.StrictLineReader$1     // Catch: java.lang.Throwable -> L87
            int r2 = r7.end     // Catch: java.lang.Throwable -> L87
            int r4 = r7.pos     // Catch: java.lang.Throwable -> L87
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L87
        L4d:
            byte[] r2 = r7.buf     // Catch: java.lang.Throwable -> L87
            int r4 = r7.pos     // Catch: java.lang.Throwable -> L87
            int r5 = r7.end     // Catch: java.lang.Throwable -> L87
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L87
            r2 = -1
            r7.end = r2     // Catch: java.lang.Throwable -> L87
            r7.fillBuf()     // Catch: java.lang.Throwable -> L87
            int r2 = r7.pos     // Catch: java.lang.Throwable -> L87
        L5f:
            int r4 = r7.end     // Catch: java.lang.Throwable -> L87
            if (r2 == r4) goto L4d
            byte[] r4 = r7.buf     // Catch: java.lang.Throwable -> L87
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L87
            if (r5 != r3) goto L7c
            int r3 = r7.pos     // Catch: java.lang.Throwable -> L87
            if (r2 == r3) goto L72
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L87
        L72:
            int r2 = r2 + 1
            r7.pos = r2     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            return r1
        L7c:
            int r2 = r2 + 1
            goto L5f
        L7f:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L87
            throw r1     // Catch: java.lang.Throwable -> L87
        L87:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            throw r1
    }
}
