package org.bson.io;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OutputBuffer extends java.io.OutputStream implements org.bson.io.BsonOutput {
    public OutputBuffer() {
            r0 = this;
            r0.<init>()
            return
    }

    private int writeCharacters(java.lang.String r8, boolean r9) {
            r7 = this;
            int r0 = r8.length()
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            r4 = 1
            if (r2 >= r0) goto L94
            int r5 = java.lang.Character.codePointAt(r8, r2)
            if (r9 == 0) goto L2a
            if (r5 == 0) goto L13
            goto L2a
        L13:
            org.bson.BsonSerializationException r9 = new org.bson.BsonSerializationException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r0[r4] = r8
            java.lang.String r8 = "BSON cstring '%s' is not valid because it contains a null character at index %d"
            java.lang.String r8 = java.lang.String.format(r8, r0)
            r9.<init>(r8)
            throw r9
        L2a:
            r4 = 128(0x80, float:1.8E-43)
            if (r5 >= r4) goto L35
            byte r4 = (byte) r5
            r7.write(r4)
            int r3 = r3 + 1
            goto L8d
        L35:
            r6 = 2048(0x800, float:2.87E-42)
            if (r5 >= r6) goto L4b
            int r6 = r5 >> 6
            int r6 = r6 + 192
            byte r6 = (byte) r6
            r7.write(r6)
            r6 = r5 & 63
            int r6 = r6 + r4
            byte r4 = (byte) r6
            r7.write(r4)
            int r3 = r3 + 2
            goto L8d
        L4b:
            r6 = 65536(0x10000, float:9.1835E-41)
            if (r5 >= r6) goto L6a
            int r6 = r5 >> 12
            int r6 = r6 + 224
            byte r6 = (byte) r6
            r7.write(r6)
            int r6 = r5 >> 6
            r6 = r6 & 63
            int r6 = r6 + r4
            byte r6 = (byte) r6
            r7.write(r6)
            r6 = r5 & 63
            int r6 = r6 + r4
            byte r4 = (byte) r6
            r7.write(r4)
            int r3 = r3 + 3
            goto L8d
        L6a:
            int r6 = r5 >> 18
            int r6 = r6 + 240
            byte r6 = (byte) r6
            r7.write(r6)
            int r6 = r5 >> 12
            r6 = r6 & 63
            int r6 = r6 + r4
            byte r6 = (byte) r6
            r7.write(r6)
            int r6 = r5 >> 6
            r6 = r6 & 63
            int r6 = r6 + r4
            byte r6 = (byte) r6
            r7.write(r6)
            r6 = r5 & 63
            int r6 = r6 + r4
            byte r4 = (byte) r6
            r7.write(r4)
            int r3 = r3 + 4
        L8d:
            int r4 = java.lang.Character.charCount(r5)
            int r2 = r2 + r4
            goto L7
        L94:
            r7.write(r1)
            int r3 = r3 + r4
            return r3
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable, org.bson.io.BsonOutput
    public void close() {
            r0 = this;
            return
    }

    public abstract java.util.List<org.bson.ByteBuf> getByteBuffers();

    public abstract int pipe(java.io.OutputStream r1) throws java.io.IOException;

    public int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    public byte[] toByteArray() {
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L11
            int r1 = r3.size()     // Catch: java.io.IOException -> L11
            r0.<init>(r1)     // Catch: java.io.IOException -> L11
            r3.pipe(r0)     // Catch: java.io.IOException -> L11
            byte[] r0 = r0.toByteArray()     // Catch: java.io.IOException -> L11
            return r0
        L11:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "should be impossible"
            r1.<init>(r2, r0)
            throw r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " size: "
            r0.append(r1)
            int r1 = r2.size()
            r0.append(r1)
            java.lang.String r1 = " pos: "
            r0.append(r1)
            int r1 = r2.getPosition()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public abstract void truncateToPosition(int r1);

    @Override // java.io.OutputStream
    public void write(int r1) {
            r0 = this;
            r0.writeByte(r1)
            return
    }

    public abstract void write(int r1, int r2);

    @Override // java.io.OutputStream
    public void write(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.write(r3, r1, r0)
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.writeBytes(r1, r2, r3)
            return
    }

    @Override // org.bson.io.BsonOutput
    public void writeBytes(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.writeBytes(r3, r1, r0)
            return
    }

    @Override // org.bson.io.BsonOutput
    public void writeCString(java.lang.String r2) {
            r1 = this;
            r0 = 1
            r1.writeCharacters(r2, r0)
            return
    }

    @Override // org.bson.io.BsonOutput
    public void writeDouble(double r1) {
            r0 = this;
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r0.writeLong(r1)
            return
    }

    public void writeInt(int r1) {
            r0 = this;
            r0.writeInt32(r1)
            return
    }

    @Override // org.bson.io.BsonOutput
    public void writeInt32(int r2) {
            r1 = this;
            int r0 = r2 >> 0
            r1.write(r0)
            int r0 = r2 >> 8
            r1.write(r0)
            int r0 = r2 >> 16
            r1.write(r0)
            int r2 = r2 >> 24
            r1.write(r2)
            return
    }

    @Override // org.bson.io.BsonOutput
    public void writeInt32(int r3, int r4) {
            r2 = this;
            int r0 = r4 >> 0
            r2.write(r3, r0)
            int r0 = r3 + 1
            int r1 = r4 >> 8
            r2.write(r0, r1)
            int r0 = r3 + 2
            int r1 = r4 >> 16
            r2.write(r0, r1)
            int r3 = r3 + 3
            int r4 = r4 >> 24
            r2.write(r3, r4)
            return
    }

    @Override // org.bson.io.BsonOutput
    public void writeInt64(long r5) {
            r4 = this;
            r0 = 0
            long r0 = r5 >> r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            int r1 = (int) r0
            byte r0 = (byte) r1
            r4.write(r0)
            r0 = 8
            long r0 = r5 >> r0
            long r0 = r0 & r2
            int r1 = (int) r0
            byte r0 = (byte) r1
            r4.write(r0)
            r0 = 16
            long r0 = r5 >> r0
            long r0 = r0 & r2
            int r1 = (int) r0
            byte r0 = (byte) r1
            r4.write(r0)
            r0 = 24
            long r0 = r5 >> r0
            long r0 = r0 & r2
            int r1 = (int) r0
            byte r0 = (byte) r1
            r4.write(r0)
            r0 = 32
            long r0 = r5 >> r0
            long r0 = r0 & r2
            int r1 = (int) r0
            byte r0 = (byte) r1
            r4.write(r0)
            r0 = 40
            long r0 = r5 >> r0
            long r0 = r0 & r2
            int r1 = (int) r0
            byte r0 = (byte) r1
            r4.write(r0)
            r0 = 48
            long r0 = r5 >> r0
            long r0 = r0 & r2
            int r1 = (int) r0
            byte r0 = (byte) r1
            r4.write(r0)
            r0 = 56
            long r5 = r5 >> r0
            long r5 = r5 & r2
            int r6 = (int) r5
            byte r5 = (byte) r6
            r4.write(r5)
            return
    }

    public void writeLong(long r1) {
            r0 = this;
            r0.writeInt64(r1)
            return
    }

    @Override // org.bson.io.BsonOutput
    public void writeObjectId(org.bson.types.ObjectId r1) {
            r0 = this;
            byte[] r1 = r1.toByteArray()
            r0.write(r1)
            return
    }

    @Override // org.bson.io.BsonOutput
    public void writeString(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.writeInt(r0)
            int r2 = r1.writeCharacters(r2, r0)
            int r0 = r1.getPosition()
            int r0 = r0 - r2
            int r0 = r0 + (-4)
            r1.writeInt32(r0, r2)
            return
    }
}
