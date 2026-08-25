package org.bson.io;

/* JADX INFO: loaded from: classes2.dex */
public class BasicOutputBuffer extends org.bson.io.OutputBuffer {
    private byte[] buffer;
    private int position;

    public BasicOutputBuffer() {
            r1 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1.<init>(r0)
            return
    }

    public BasicOutputBuffer(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            r1.buffer = r0
            byte[] r2 = new byte[r2]
            r1.buffer = r2
            return
    }

    private void ensure(int r4) {
            r3 = this;
            int r0 = r3.position
            int r4 = r4 + r0
            byte[] r1 = r3.buffer
            int r2 = r1.length
            if (r4 > r2) goto L9
            return
        L9:
            int r2 = r1.length
            int r2 = r2 * 2
            if (r2 >= r4) goto L10
            int r2 = r4 + 128
        L10:
            byte[] r4 = new byte[r2]
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r4, r2, r0)
            r3.buffer = r4
            return
    }

    private void ensureOpen() {
            r2 = this;
            byte[] r0 = r2.buffer
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The output is closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.io.OutputBuffer, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable, org.bson.io.BsonOutput
    public void close() {
            r1 = this;
            r0 = 0
            r1.buffer = r0
            return
    }

    @Override // org.bson.io.OutputBuffer
    public java.util.List<org.bson.ByteBuf> getByteBuffers() {
            r5 = this;
            r5.ensureOpen()
            r0 = 1
            org.bson.ByteBuf[] r0 = new org.bson.ByteBuf[r0]
            org.bson.ByteBufNIO r1 = new org.bson.ByteBufNIO
            byte[] r2 = r5.buffer
            int r3 = r5.position
            r4 = 0
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2, r4, r3)
            java.nio.ByteBuffer r2 = r2.duplicate()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            r1.<init>(r2)
            r0[r4] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    public byte[] getInternalBuffer() {
            r1 = this;
            byte[] r0 = r1.buffer
            return r0
    }

    @Override // org.bson.io.BsonOutput
    public int getPosition() {
            r1 = this;
            r1.ensureOpen()
            int r0 = r1.position
            return r0
    }

    @Override // org.bson.io.BsonOutput
    public int getSize() {
            r1 = this;
            r1.ensureOpen()
            int r0 = r1.position
            return r0
    }

    @Override // org.bson.io.OutputBuffer
    public int pipe(java.io.OutputStream r4) throws java.io.IOException {
            r3 = this;
            r3.ensureOpen()
            byte[] r0 = r3.buffer
            int r1 = r3.position
            r2 = 0
            r4.write(r0, r2, r1)
            int r4 = r3.position
            return r4
    }

    @Override // org.bson.io.OutputBuffer, org.bson.io.BsonOutput
    public void truncateToPosition(int r2) {
            r1 = this;
            r1.ensureOpen()
            int r0 = r1.position
            if (r2 > r0) goto Lc
            if (r2 < 0) goto Lc
            r1.position = r2
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    @Override // org.bson.io.OutputBuffer
    public final void write(int r5, int r6) {
            r4 = this;
            r4.ensureOpen()
            r0 = 0
            r1 = 1
            if (r5 < 0) goto L32
            int r2 = r4.position
            int r2 = r2 - r1
            if (r5 > r2) goto L14
            byte[] r0 = r4.buffer
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r0[r5] = r6
            return
        L14:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r4.position
            int r3 = r3 - r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r0] = r3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r1] = r5
            java.lang.String r5 = "position must be <= %d but was %d"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r6.<init>(r5)
            throw r6
        L32:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r0] = r5
            java.lang.String r5 = "position must be >= 0 but was %d"
            java.lang.String r5 = java.lang.String.format(r5, r1)
            r6.<init>(r5)
            throw r6
    }

    @Override // org.bson.io.OutputBuffer, java.io.OutputStream
    public void write(byte[] r3) {
            r2 = this;
            r2.ensureOpen()
            int r0 = r3.length
            r1 = 0
            r2.write(r3, r1, r0)
            return
    }

    @Override // org.bson.io.BsonOutput
    public void writeByte(int r4) {
            r3 = this;
            r3.ensureOpen()
            r0 = 1
            r3.ensure(r0)
            byte[] r0 = r3.buffer
            int r1 = r3.position
            int r2 = r1 + 1
            r3.position = r2
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r0[r1] = r4
            return
    }

    @Override // org.bson.io.BsonOutput
    public void writeBytes(byte[] r3, int r4, int r5) {
            r2 = this;
            r2.ensureOpen()
            r2.ensure(r5)
            byte[] r0 = r2.buffer
            int r1 = r2.position
            java.lang.System.arraycopy(r3, r4, r0, r1, r5)
            int r3 = r2.position
            int r3 = r3 + r5
            r2.position = r3
            return
    }
}
