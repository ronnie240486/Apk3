package com.google.common.io;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
final class CharSequenceReader extends java.io.Reader {
    private int mark;
    private int pos;

    @javax.annotation.CheckForNull
    private java.lang.CharSequence seq;

    public CharSequenceReader(java.lang.CharSequence r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.seq = r1
            return
    }

    private void checkOpen() throws java.io.IOException {
            r2 = this;
            java.lang.CharSequence r0 = r2.seq
            if (r0 == 0) goto L5
            return
        L5:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "reader closed"
            r0.<init>(r1)
            throw r0
    }

    private boolean hasRemaining() {
            r1 = this;
            int r0 = r1.remaining()
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private int remaining() {
            r2 = this;
            java.lang.CharSequence r0 = r2.seq
            java.util.Objects.requireNonNull(r0)
            java.lang.CharSequence r0 = r2.seq
            int r0 = r0.length()
            int r1 = r2.pos
            int r0 = r0 - r1
            return r0
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.seq = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // java.io.Reader
    public synchronized void mark(int r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            java.lang.String r1 = "readAheadLimit (%s) may not be negative"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3)     // Catch: java.lang.Throwable -> L14
            r2.checkOpen()     // Catch: java.lang.Throwable -> L14
            int r3 = r2.pos     // Catch: java.lang.Throwable -> L14
            r2.mark = r3     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        L14:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // java.io.Reader
    public boolean markSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.io.Reader
    public synchronized int read() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            r3.checkOpen()     // Catch: java.lang.Throwable -> L1f
            java.lang.CharSequence r0 = r3.seq     // Catch: java.lang.Throwable -> L1f
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r3.hasRemaining()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1c
            java.lang.CharSequence r0 = r3.seq     // Catch: java.lang.Throwable -> L1f
            int r1 = r3.pos     // Catch: java.lang.Throwable -> L1f
            int r2 = r1 + 1
            r3.pos = r2     // Catch: java.lang.Throwable -> L1f
            char r0 = r0.charAt(r1)     // Catch: java.lang.Throwable -> L1f
            goto L1d
        L1c:
            r0 = -1
        L1d:
            monitor-exit(r3)
            return r0
        L1f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(java.nio.CharBuffer r6) throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            com.google.common.base.Preconditions.checkNotNull(r6)     // Catch: java.lang.Throwable -> L38
            r5.checkOpen()     // Catch: java.lang.Throwable -> L38
            java.lang.CharSequence r0 = r5.seq     // Catch: java.lang.Throwable -> L38
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L38
            boolean r0 = r5.hasRemaining()     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L15
            r6 = -1
            monitor-exit(r5)
            return r6
        L15:
            int r0 = r6.remaining()     // Catch: java.lang.Throwable -> L38
            int r1 = r5.remaining()     // Catch: java.lang.Throwable -> L38
            int r0 = java.lang.Math.min(r0, r1)     // Catch: java.lang.Throwable -> L38
            r1 = 0
        L22:
            if (r1 >= r0) goto L36
            java.lang.CharSequence r2 = r5.seq     // Catch: java.lang.Throwable -> L38
            int r3 = r5.pos     // Catch: java.lang.Throwable -> L38
            int r4 = r3 + 1
            r5.pos = r4     // Catch: java.lang.Throwable -> L38
            char r2 = r2.charAt(r3)     // Catch: java.lang.Throwable -> L38
            r6.put(r2)     // Catch: java.lang.Throwable -> L38
            int r1 = r1 + 1
            goto L22
        L36:
            monitor-exit(r5)
            return r0
        L38:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @Override // java.io.Reader
    public synchronized int read(char[] r6, int r7, int r8) throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            int r0 = r7 + r8
            int r1 = r6.length     // Catch: java.lang.Throwable -> L38
            com.google.common.base.Preconditions.checkPositionIndexes(r7, r0, r1)     // Catch: java.lang.Throwable -> L38
            r5.checkOpen()     // Catch: java.lang.Throwable -> L38
            java.lang.CharSequence r0 = r5.seq     // Catch: java.lang.Throwable -> L38
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L38
            boolean r0 = r5.hasRemaining()     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L18
            r6 = -1
            monitor-exit(r5)
            return r6
        L18:
            int r0 = r5.remaining()     // Catch: java.lang.Throwable -> L38
            int r8 = java.lang.Math.min(r8, r0)     // Catch: java.lang.Throwable -> L38
            r0 = 0
        L21:
            if (r0 >= r8) goto L36
            int r1 = r7 + r0
            java.lang.CharSequence r2 = r5.seq     // Catch: java.lang.Throwable -> L38
            int r3 = r5.pos     // Catch: java.lang.Throwable -> L38
            int r4 = r3 + 1
            r5.pos = r4     // Catch: java.lang.Throwable -> L38
            char r2 = r2.charAt(r3)     // Catch: java.lang.Throwable -> L38
            r6[r1] = r2     // Catch: java.lang.Throwable -> L38
            int r0 = r0 + 1
            goto L21
        L36:
            monitor-exit(r5)
            return r8
        L38:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r1.checkOpen()     // Catch: java.lang.Throwable -> L7
            r0 = 1
            monitor-exit(r1)
            return r0
        L7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // java.io.Reader
    public synchronized void reset() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r1.checkOpen()     // Catch: java.lang.Throwable -> La
            int r0 = r1.mark     // Catch: java.lang.Throwable -> La
            r1.pos = r0     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return
        La:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // java.io.Reader
    public synchronized long skip(long r4) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.String r1 = "n (%s) may not be negative"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r4)     // Catch: java.lang.Throwable -> L24
            r3.checkOpen()     // Catch: java.lang.Throwable -> L24
            int r0 = r3.remaining()     // Catch: java.lang.Throwable -> L24
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L24
            long r4 = java.lang.Math.min(r0, r4)     // Catch: java.lang.Throwable -> L24
            int r5 = (int) r4     // Catch: java.lang.Throwable -> L24
            int r4 = r3.pos     // Catch: java.lang.Throwable -> L24
            int r4 = r4 + r5
            r3.pos = r4     // Catch: java.lang.Throwable -> L24
            long r4 = (long) r5
            monitor-exit(r3)
            return r4
        L24:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }
}
