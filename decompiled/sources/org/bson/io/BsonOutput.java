package org.bson.io;

/* JADX INFO: loaded from: classes2.dex */
public interface BsonOutput extends java.io.Closeable {
    void close();

    int getPosition();

    int getSize();

    void truncateToPosition(int r1);

    void writeByte(int r1);

    void writeBytes(byte[] r1);

    void writeBytes(byte[] r1, int r2, int r3);

    void writeCString(java.lang.String r1);

    void writeDouble(double r1);

    void writeInt32(int r1);

    void writeInt32(int r1, int r2);

    void writeInt64(long r1);

    void writeObjectId(org.bson.types.ObjectId r1);

    void writeString(java.lang.String r1);
}
