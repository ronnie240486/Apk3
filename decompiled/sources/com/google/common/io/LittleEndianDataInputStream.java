package com.google.common.io;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
public final class LittleEndianDataInputStream extends java.io.FilterInputStream implements java.io.DataInput {
    public LittleEndianDataInputStream(java.io.InputStream r1) {
            r0 = this;
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.io.InputStream r1 = (java.io.InputStream) r1
            r0.<init>(r1)
            return
    }

    private byte readAndCheckByte() throws java.io.IOException, java.io.EOFException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            int r0 = r0.read()
            r1 = -1
            if (r1 == r0) goto Lb
            byte r0 = (byte) r0
            return r0
        Lb:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean readBoolean() throws java.io.IOException {
            r1 = this;
            int r0 = r1.readUnsignedByte()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public byte readByte() throws java.io.IOException {
            r1 = this;
            int r0 = r1.readUnsignedByte()
            byte r0 = (byte) r0
            return r0
    }

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public char readChar() throws java.io.IOException {
            r1 = this;
            int r0 = r1.readUnsignedShort()
            char r0 = (char) r0
            return r0
    }

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public double readDouble() throws java.io.IOException {
            r2 = this;
            long r0 = r2.readLong()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public float readFloat() throws java.io.IOException {
            r1 = this;
            int r0 = r1.readInt()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    @Override // java.io.DataInput
    public void readFully(byte[] r1) throws java.io.IOException {
            r0 = this;
            com.google.common.io.ByteStreams.readFully(r0, r1)
            return
    }

    @Override // java.io.DataInput
    public void readFully(byte[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            com.google.common.io.ByteStreams.readFully(r0, r1, r2, r3)
            return
    }

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int readInt() throws java.io.IOException {
            r4 = this;
            byte r0 = r4.readAndCheckByte()
            byte r1 = r4.readAndCheckByte()
            byte r2 = r4.readAndCheckByte()
            byte r3 = r4.readAndCheckByte()
            int r0 = com.google.common.primitives.Ints.fromBytes(r3, r2, r1, r0)
            return r0
    }

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    public java.lang.String readLine() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "readLine is not supported"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public long readLong() throws java.io.IOException {
            r8 = this;
            byte r7 = r8.readAndCheckByte()
            byte r6 = r8.readAndCheckByte()
            byte r5 = r8.readAndCheckByte()
            byte r4 = r8.readAndCheckByte()
            byte r3 = r8.readAndCheckByte()
            byte r2 = r8.readAndCheckByte()
            byte r1 = r8.readAndCheckByte()
            byte r0 = r8.readAndCheckByte()
            long r0 = com.google.common.primitives.Longs.fromBytes(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public short readShort() throws java.io.IOException {
            r1 = this;
            int r0 = r1.readUnsignedShort()
            short r0 = (short) r0
            return r0
    }

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.lang.String readUTF() throws java.io.IOException {
            r2 = this;
            java.io.DataInputStream r0 = new java.io.DataInputStream
            java.io.InputStream r1 = r2.in
            r0.<init>(r1)
            java.lang.String r0 = r0.readUTF()
            return r0
    }

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int readUnsignedByte() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            int r0 = r0.read()
            if (r0 < 0) goto L9
            return r0
        L9:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int readUnsignedShort() throws java.io.IOException {
            r3 = this;
            byte r0 = r3.readAndCheckByte()
            byte r1 = r3.readAndCheckByte()
            r2 = 0
            int r0 = com.google.common.primitives.Ints.fromBytes(r2, r2, r1, r0)
            return r0
    }

    @Override // java.io.DataInput
    public int skipBytes(int r4) throws java.io.IOException {
            r3 = this;
            java.io.InputStream r0 = r3.in
            long r1 = (long) r4
            long r0 = r0.skip(r1)
            int r4 = (int) r0
            return r4
    }
}
