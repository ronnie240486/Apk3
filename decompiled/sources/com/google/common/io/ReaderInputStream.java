package com.google.common.io;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
final class ReaderInputStream extends java.io.InputStream {
    private java.nio.ByteBuffer byteBuffer;
    private java.nio.CharBuffer charBuffer;
    private boolean doneFlushing;
    private boolean draining;
    private final java.nio.charset.CharsetEncoder encoder;
    private boolean endOfInput;
    private final java.io.Reader reader;
    private final byte[] singleByte;

    public ReaderInputStream(java.io.Reader r3, java.nio.charset.Charset r4) {
            r2 = this;
            java.nio.charset.CharsetEncoder r4 = r4.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r4 = r4.onMalformedInput(r0)
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r4 = r4.onUnmappableCharacter(r0)
            r2.<init>()
            r0 = 1
            byte[] r1 = new byte[r0]
            r2.singleByte = r1
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.io.Reader r3 = (java.io.Reader) r3
            r2.reader = r3
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r4)
            java.nio.charset.CharsetEncoder r3 = (java.nio.charset.CharsetEncoder) r3
            r2.encoder = r3
            java.lang.String r3 = "bufferSize must be positive: %s"
            r1 = 8192(0x2000, float:1.148E-41)
            com.google.common.base.Preconditions.checkArgument(r0, r3, r1)
            r4.reset()
            java.nio.CharBuffer r3 = java.nio.CharBuffer.allocate(r1)
            r2.charBuffer = r3
            r3.flip()
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r1)
            r2.byteBuffer = r3
            return
    }

    private static int availableCapacity(java.nio.Buffer r1) {
            int r0 = r1.capacity()
            int r1 = r1.limit()
            int r0 = r0 - r1
            return r0
    }

    private int drain(byte[] r2, int r3, int r4) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.byteBuffer
            int r0 = r0.remaining()
            int r4 = java.lang.Math.min(r4, r0)
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.get(r2, r3, r4)
            return r4
    }

    private static java.nio.CharBuffer grow(java.nio.CharBuffer r2) {
            char[] r0 = r2.array()
            int r1 = r2.capacity()
            int r1 = r1 * 2
            char[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.CharBuffer r0 = java.nio.CharBuffer.wrap(r0)
            int r1 = r2.position()
            r0.position(r1)
            int r2 = r2.limit()
            r0.limit(r2)
            return r0
    }

    private void readMoreChars() throws java.io.IOException {
            r4 = this;
            java.nio.CharBuffer r0 = r4.charBuffer
            int r0 = availableCapacity(r0)
            if (r0 != 0) goto L22
            java.nio.CharBuffer r0 = r4.charBuffer
            int r0 = r0.position()
            if (r0 <= 0) goto L1a
            java.nio.CharBuffer r0 = r4.charBuffer
            java.nio.CharBuffer r0 = r0.compact()
            r0.flip()
            goto L22
        L1a:
            java.nio.CharBuffer r0 = r4.charBuffer
            java.nio.CharBuffer r0 = grow(r0)
            r4.charBuffer = r0
        L22:
            java.nio.CharBuffer r0 = r4.charBuffer
            int r0 = r0.limit()
            java.io.Reader r1 = r4.reader
            java.nio.CharBuffer r2 = r4.charBuffer
            char[] r2 = r2.array()
            java.nio.CharBuffer r3 = r4.charBuffer
            int r3 = availableCapacity(r3)
            int r1 = r1.read(r2, r0, r3)
            r2 = -1
            if (r1 != r2) goto L41
            r0 = 1
            r4.endOfInput = r0
            goto L47
        L41:
            java.nio.CharBuffer r2 = r4.charBuffer
            int r0 = r0 + r1
            r2.limit(r0)
        L47:
            return
    }

    private void startDraining(boolean r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.flip()
            if (r2 == 0) goto L1e
            java.nio.ByteBuffer r2 = r1.byteBuffer
            int r2 = r2.remaining()
            if (r2 != 0) goto L1e
            java.nio.ByteBuffer r2 = r1.byteBuffer
            int r2 = r2.capacity()
            int r2 = r2 * 2
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r1.byteBuffer = r2
            goto L21
        L1e:
            r2 = 1
            r1.draining = r2
        L21:
            return
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.Reader r0 = r1.reader
            r0.close()
            return
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.singleByte
            int r0 = r2.read(r0)
            r1 = 1
            if (r0 != r1) goto L13
            byte[] r0 = r2.singleByte
            r1 = 0
            r0 = r0[r1]
            int r0 = com.google.common.primitives.UnsignedBytes.toInt(r0)
            goto L14
        L13:
            r0 = -1
        L14:
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r8, int r9, int r10) throws java.io.IOException {
            r7 = this;
            int r0 = r9 + r10
            int r1 = r8.length
            com.google.common.base.Preconditions.checkPositionIndexes(r9, r0, r1)
            r0 = 0
            if (r10 != 0) goto La
            return r0
        La:
            boolean r1 = r7.endOfInput
            r2 = 0
        Ld:
            boolean r3 = r7.draining
            if (r3 == 0) goto L2e
            int r3 = r9 + r2
            int r4 = r10 - r2
            int r3 = r7.drain(r8, r3, r4)
            int r2 = r2 + r3
            if (r2 == r10) goto L29
            boolean r3 = r7.doneFlushing
            if (r3 == 0) goto L21
            goto L29
        L21:
            r7.draining = r0
            java.nio.ByteBuffer r3 = r7.byteBuffer
            r3.clear()
            goto L2e
        L29:
            if (r2 <= 0) goto L2c
            goto L2d
        L2c:
            r2 = -1
        L2d:
            return r2
        L2e:
            boolean r3 = r7.doneFlushing
            if (r3 == 0) goto L35
            java.nio.charset.CoderResult r3 = java.nio.charset.CoderResult.UNDERFLOW
            goto L4c
        L35:
            if (r1 == 0) goto L40
            java.nio.charset.CharsetEncoder r3 = r7.encoder
            java.nio.ByteBuffer r4 = r7.byteBuffer
            java.nio.charset.CoderResult r3 = r3.flush(r4)
            goto L4c
        L40:
            java.nio.charset.CharsetEncoder r3 = r7.encoder
            java.nio.CharBuffer r4 = r7.charBuffer
            java.nio.ByteBuffer r5 = r7.byteBuffer
            boolean r6 = r7.endOfInput
            java.nio.charset.CoderResult r3 = r3.encode(r4, r5, r6)
        L4c:
            boolean r4 = r3.isOverflow()
            r5 = 1
            if (r4 == 0) goto L57
            r7.startDraining(r5)
            goto Ld
        L57:
            boolean r4 = r3.isUnderflow()
            if (r4 == 0) goto L6f
            if (r1 == 0) goto L65
            r7.doneFlushing = r5
            r7.startDraining(r0)
            goto Ld
        L65:
            boolean r3 = r7.endOfInput
            if (r3 == 0) goto L6b
            r1 = 1
            goto L2e
        L6b:
            r7.readMoreChars()
            goto L2e
        L6f:
            boolean r4 = r3.isError()
            if (r4 == 0) goto L2e
            r3.throwException()
            return r0
    }
}
