package org.bson.io;

/* JADX INFO: loaded from: classes3.dex */
public class ByteBufferBsonInput implements org.bson.io.BsonInput {
    private static final java.lang.String[] ONE_BYTE_ASCII_STRINGS = null;
    private static final java.nio.charset.Charset UTF8_CHARSET = null;
    private org.bson.ByteBuf buffer;
    private int mark;


    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            org.bson.io.ByteBufferBsonInput.UTF8_CHARSET = r0
            r0 = 128(0x80, float:1.8E-43)
            java.lang.String[] r0 = new java.lang.String[r0]
            org.bson.io.ByteBufferBsonInput.ONE_BYTE_ASCII_STRINGS = r0
            r0 = 0
        Lf:
            java.lang.String[] r1 = org.bson.io.ByteBufferBsonInput.ONE_BYTE_ASCII_STRINGS
            int r2 = r1.length
            if (r0 >= r2) goto L1e
            char r2 = (char) r0
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1[r0] = r2
            int r0 = r0 + 1
            goto Lf
        L1e:
            return
    }

    public ByteBufferBsonInput(org.bson.ByteBuf r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mark = r0
            if (r2 == 0) goto L10
            r1.buffer = r2
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            return
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "buffer can not be null"
            r2.<init>(r0)
            throw r2
    }

    public static /* synthetic */ org.bson.ByteBuf access$000(org.bson.io.ByteBufferBsonInput r0) {
            org.bson.ByteBuf r0 = r0.buffer
            return r0
    }

    public static /* synthetic */ void access$100(org.bson.io.ByteBufferBsonInput r0) {
            r0.ensureOpen()
            return
    }

    private void ensureAvailable(int r4) {
            r3 = this;
            org.bson.ByteBuf r0 = r3.buffer
            int r0 = r0.remaining()
            if (r0 < r4) goto L9
            return
        L9:
            org.bson.BsonSerializationException r0 = new org.bson.BsonSerializationException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            r4 = 1
            org.bson.ByteBuf r2 = r3.buffer
            int r2 = r2.remaining()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r4] = r2
            java.lang.String r4 = "While decoding a BSON document %d bytes were required, but only %d remain"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    private void ensureOpen() {
            r2 = this;
            org.bson.ByteBuf r0 = r2.buffer
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stream is closed"
            r0.<init>(r1)
            throw r0
    }

    private java.lang.String readString(int r3) {
            r2 = this;
            java.lang.String r0 = "Found a BSON string that is not null-terminated"
            r1 = 2
            if (r3 != r1) goto L27
            byte r3 = r2.readByte()
            byte r1 = r2.readByte()
            if (r1 != 0) goto L21
            if (r3 >= 0) goto L1c
            java.nio.charset.Charset r3 = org.bson.io.ByteBufferBsonInput.UTF8_CHARSET
            java.nio.charset.CharsetDecoder r3 = r3.newDecoder()
            java.lang.String r3 = r3.replacement()
            return r3
        L1c:
            java.lang.String[] r0 = org.bson.io.ByteBufferBsonInput.ONE_BYTE_ASCII_STRINGS
            r3 = r0[r3]
            return r3
        L21:
            org.bson.BsonSerializationException r3 = new org.bson.BsonSerializationException
            r3.<init>(r0)
            throw r3
        L27:
            int r3 = r3 + (-1)
            byte[] r3 = new byte[r3]
            r2.readBytes(r3)
            byte r1 = r2.readByte()
            if (r1 != 0) goto L3c
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = org.bson.io.ByteBufferBsonInput.UTF8_CHARSET
            r0.<init>(r3, r1)
            return r0
        L3c:
            org.bson.BsonSerializationException r3 = new org.bson.BsonSerializationException
            r3.<init>(r0)
            throw r3
    }

    private void readUntilNullByte() {
            r1 = this;
        L0:
            byte r0 = r1.readByte()
            if (r0 == 0) goto L7
            goto L0
        L7:
            return
    }

    @Override // org.bson.io.BsonInput, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            org.bson.ByteBuf r0 = r1.buffer
            r0.release()
            r0 = 0
            r1.buffer = r0
            return
    }

    @Override // org.bson.io.BsonInput
    public org.bson.io.BsonInputMark getMark(int r1) {
            r0 = this;
            org.bson.io.ByteBufferBsonInput$1 r1 = new org.bson.io.ByteBufferBsonInput$1
            r1.<init>(r0)
            return r1
    }

    @Override // org.bson.io.BsonInput
    public int getPosition() {
            r1 = this;
            r1.ensureOpen()
            org.bson.ByteBuf r0 = r1.buffer
            int r0 = r0.position()
            return r0
    }

    @Override // org.bson.io.BsonInput
    public boolean hasRemaining() {
            r1 = this;
            r1.ensureOpen()
            org.bson.ByteBuf r0 = r1.buffer
            boolean r0 = r0.hasRemaining()
            return r0
    }

    @Override // org.bson.io.BsonInput
    @java.lang.Deprecated
    public void mark(int r1) {
            r0 = this;
            r0.ensureOpen()
            org.bson.ByteBuf r1 = r0.buffer
            int r1 = r1.position()
            r0.mark = r1
            return
    }

    @Override // org.bson.io.BsonInput
    public byte readByte() {
            r1 = this;
            r1.ensureOpen()
            r0 = 1
            r1.ensureAvailable(r0)
            org.bson.ByteBuf r0 = r1.buffer
            byte r0 = r0.get()
            return r0
    }

    @Override // org.bson.io.BsonInput
    public void readBytes(byte[] r2) {
            r1 = this;
            r1.ensureOpen()
            int r0 = r2.length
            r1.ensureAvailable(r0)
            org.bson.ByteBuf r0 = r1.buffer
            r0.get(r2)
            return
    }

    @Override // org.bson.io.BsonInput
    public void readBytes(byte[] r2, int r3, int r4) {
            r1 = this;
            r1.ensureOpen()
            r1.ensureAvailable(r4)
            org.bson.ByteBuf r0 = r1.buffer
            r0.get(r2, r3, r4)
            return
    }

    @Override // org.bson.io.BsonInput
    public java.lang.String readCString() {
            r3 = this;
            r3.ensureOpen()
            org.bson.ByteBuf r0 = r3.buffer
            int r0 = r0.position()
            r3.readUntilNullByte()
            org.bson.ByteBuf r1 = r3.buffer
            int r1 = r1.position()
            int r1 = r1 - r0
            org.bson.ByteBuf r2 = r3.buffer
            r2.position(r0)
            java.lang.String r0 = r3.readString(r1)
            return r0
    }

    @Override // org.bson.io.BsonInput
    public double readDouble() {
            r2 = this;
            r2.ensureOpen()
            r0 = 8
            r2.ensureAvailable(r0)
            org.bson.ByteBuf r0 = r2.buffer
            double r0 = r0.getDouble()
            return r0
    }

    @Override // org.bson.io.BsonInput
    public int readInt32() {
            r1 = this;
            r1.ensureOpen()
            r0 = 4
            r1.ensureAvailable(r0)
            org.bson.ByteBuf r0 = r1.buffer
            int r0 = r0.getInt()
            return r0
    }

    @Override // org.bson.io.BsonInput
    public long readInt64() {
            r2 = this;
            r2.ensureOpen()
            r0 = 8
            r2.ensureAvailable(r0)
            org.bson.ByteBuf r0 = r2.buffer
            long r0 = r0.getLong()
            return r0
    }

    @Override // org.bson.io.BsonInput
    public org.bson.types.ObjectId readObjectId() {
            r2 = this;
            r2.ensureOpen()
            r0 = 12
            byte[] r0 = new byte[r0]
            r2.readBytes(r0)
            org.bson.types.ObjectId r1 = new org.bson.types.ObjectId
            r1.<init>(r0)
            return r1
    }

    @Override // org.bson.io.BsonInput
    public java.lang.String readString() {
            r4 = this;
            r4.ensureOpen()
            int r0 = r4.readInt32()
            if (r0 <= 0) goto Le
            java.lang.String r0 = r4.readString(r0)
            return r0
        Le:
            org.bson.BsonSerializationException r1 = new org.bson.BsonSerializationException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            java.lang.String r0 = "While decoding a BSON string found a size that is not a positive number: %d"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
    }

    @Override // org.bson.io.BsonInput
    @java.lang.Deprecated
    public void reset() {
            r2 = this;
            r2.ensureOpen()
            int r0 = r2.mark
            r1 = -1
            if (r0 == r1) goto Le
            org.bson.ByteBuf r1 = r2.buffer
            r1.position(r0)
            return
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Mark not set"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.io.BsonInput
    public void skip(int r3) {
            r2 = this;
            r2.ensureOpen()
            org.bson.ByteBuf r0 = r2.buffer
            int r1 = r0.position()
            int r1 = r1 + r3
            r0.position(r1)
            return
    }

    @Override // org.bson.io.BsonInput
    public void skipCString() {
            r0 = this;
            r0.ensureOpen()
            r0.readUntilNullByte()
            return
    }
}
