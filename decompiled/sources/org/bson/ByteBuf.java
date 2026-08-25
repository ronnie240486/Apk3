package org.bson;

/* JADX INFO: loaded from: classes.dex */
public interface ByteBuf {
    byte[] array();

    java.nio.ByteBuffer asNIO();

    org.bson.ByteBuf asReadOnly();

    int capacity();

    org.bson.ByteBuf clear();

    org.bson.ByteBuf duplicate();

    org.bson.ByteBuf flip();

    byte get();

    byte get(int r1);

    org.bson.ByteBuf get(int r1, byte[] r2);

    org.bson.ByteBuf get(int r1, byte[] r2, int r3, int r4);

    org.bson.ByteBuf get(byte[] r1);

    org.bson.ByteBuf get(byte[] r1, int r2, int r3);

    double getDouble();

    double getDouble(int r1);

    int getInt();

    int getInt(int r1);

    long getLong();

    long getLong(int r1);

    int getReferenceCount();

    boolean hasRemaining();

    int limit();

    org.bson.ByteBuf limit(int r1);

    org.bson.ByteBuf order(java.nio.ByteOrder r1);

    int position();

    org.bson.ByteBuf position(int r1);

    org.bson.ByteBuf put(byte r1);

    org.bson.ByteBuf put(int r1, byte r2);

    org.bson.ByteBuf put(byte[] r1, int r2, int r3);

    void release();

    int remaining();

    org.bson.ByteBuf retain();
}
