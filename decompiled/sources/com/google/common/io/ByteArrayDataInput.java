package com.google.common.io;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public interface ByteArrayDataInput extends java.io.DataInput {
    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean readBoolean();

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    byte readByte();

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    char readChar();

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    double readDouble();

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    float readFloat();

    @Override // java.io.DataInput
    void readFully(byte[] r1);

    @Override // java.io.DataInput
    void readFully(byte[] r1, int r2, int r3);

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    int readInt();

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    java.lang.String readLine();

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    long readLong();

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    short readShort();

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    java.lang.String readUTF();

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    int readUnsignedByte();

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    int readUnsignedShort();

    @Override // java.io.DataInput
    int skipBytes(int r1);
}
