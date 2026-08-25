package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes2.dex */
public class MarkEnforcingInputStream extends java.io.FilterInputStream {
    private static final int END_OF_STREAM = -1;
    private static final int UNSET = Integer.MIN_VALUE;
    private int availableBytes;

    public MarkEnforcingInputStream(@androidx.annotation.NonNull java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.availableBytes = r1
            return
    }

    private long getBytesToRead(long r5) {
            r4 = this;
            int r0 = r4.availableBytes
            if (r0 != 0) goto L7
            r5 = -1
            return r5
        L7:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L11
            long r1 = (long) r0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L11
            long r5 = (long) r0
        L11:
            return r5
    }

    private void updateAvailableBytesAfterRead(long r5) {
            r4 = this;
            int r0 = r4.availableBytes
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L11
            r1 = -1
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L11
            long r0 = (long) r0
            long r0 = r0 - r5
            int r5 = (int) r0
            r4.availableBytes = r5
        L11:
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
            r2 = this;
            int r0 = r2.availableBytes
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto Lb
            int r0 = super.available()
            goto L13
        Lb:
            int r1 = super.available()
            int r0 = java.lang.Math.min(r0, r1)
        L13:
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r1) {
            r0 = this;
            monitor-enter(r0)
            super.mark(r1)     // Catch: java.lang.Throwable -> L8
            r0.availableBytes = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r7 = this;
            r0 = 1
            long r2 = r7.getBytesToRead(r0)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto Le
            r0 = -1
            return r0
        Le:
            int r2 = super.read()
            r7.updateAvailableBytesAfterRead(r0)
            return r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@androidx.annotation.NonNull byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            long r0 = (long) r5
            long r0 = r2.getBytesToRead(r0)
            int r5 = (int) r0
            r0 = -1
            if (r5 != r0) goto La
            return r0
        La:
            int r3 = super.read(r3, r4, r5)
            long r4 = (long) r3
            r2.updateAvailableBytesAfterRead(r4)
            return r3
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            super.reset()     // Catch: java.lang.Throwable -> La
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.availableBytes = r0     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return
        La:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long r4) throws java.io.IOException {
            r3 = this;
            long r4 = r3.getBytesToRead(r4)
            r0 = -1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            r4 = 0
            return r4
        Ld:
            long r4 = super.skip(r4)
            r3.updateAvailableBytesAfterRead(r4)
            return r4
    }
}
