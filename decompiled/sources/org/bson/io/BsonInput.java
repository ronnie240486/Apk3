package org.bson.io;

/* JADX INFO: loaded from: classes3.dex */
public interface BsonInput extends java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    org.bson.io.BsonInputMark getMark(int r1);

    int getPosition();

    boolean hasRemaining();

    @java.lang.Deprecated
    void mark(int r1);

    byte readByte();

    void readBytes(byte[] r1);

    void readBytes(byte[] r1, int r2, int r3);

    java.lang.String readCString();

    double readDouble();

    int readInt32();

    long readInt64();

    org.bson.types.ObjectId readObjectId();

    java.lang.String readString();

    @java.lang.Deprecated
    void reset();

    void skip(int r1);

    void skipCString();
}
