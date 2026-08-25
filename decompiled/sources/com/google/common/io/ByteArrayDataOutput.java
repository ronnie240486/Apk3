package com.google.common.io;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public interface ByteArrayDataOutput extends java.io.DataOutput {
    byte[] toByteArray();

    @Override // java.io.DataOutput
    void write(int r1);

    @Override // java.io.DataOutput
    void write(byte[] r1);

    @Override // java.io.DataOutput
    void write(byte[] r1, int r2, int r3);

    @Override // java.io.DataOutput
    void writeBoolean(boolean r1);

    @Override // java.io.DataOutput
    void writeByte(int r1);

    @Override // java.io.DataOutput
    @java.lang.Deprecated
    void writeBytes(java.lang.String r1);

    @Override // java.io.DataOutput
    void writeChar(int r1);

    @Override // java.io.DataOutput
    void writeChars(java.lang.String r1);

    @Override // java.io.DataOutput
    void writeDouble(double r1);

    @Override // java.io.DataOutput
    void writeFloat(float r1);

    @Override // java.io.DataOutput
    void writeInt(int r1);

    @Override // java.io.DataOutput
    void writeLong(long r1);

    @Override // java.io.DataOutput
    void writeShort(int r1);

    @Override // java.io.DataOutput
    void writeUTF(java.lang.String r1);
}
