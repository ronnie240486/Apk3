package org.bson;

/* JADX INFO: loaded from: classes.dex */
public class ByteBufNIO implements org.bson.ByteBuf {
    private java.nio.ByteBuffer buf;
    private final java.util.concurrent.atomic.AtomicInteger referenceCount;

    public ByteBufNIO(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            r2.referenceCount = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r3 = r3.order(r0)
            r2.buf = r3
            return
    }

    @Override // org.bson.ByteBuf
    public byte[] array() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            byte[] r0 = r0.array()
            return r0
    }

    @Override // org.bson.ByteBuf
    public java.nio.ByteBuffer asNIO() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            return r0
    }

    @Override // org.bson.ByteBuf
    public org.bson.ByteBuf asReadOnly() {
            r2 = this;
            org.bson.ByteBufNIO r0 = new org.bson.ByteBufNIO
            java.nio.ByteBuffer r1 = r2.buf
            java.nio.ByteBuffer r1 = r1.asReadOnlyBuffer()
            r0.<init>(r1)
            return r0
    }

    @Override // org.bson.ByteBuf
    public int capacity() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            int r0 = r0.capacity()
            return r0
    }

    @Override // org.bson.ByteBuf
    public org.bson.ByteBuf clear() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            r0.clear()
            return r1
    }

    @Override // org.bson.ByteBuf
    public org.bson.ByteBuf duplicate() {
            r2 = this;
            org.bson.ByteBufNIO r0 = new org.bson.ByteBufNIO
            java.nio.ByteBuffer r1 = r2.buf
            java.nio.ByteBuffer r1 = r1.duplicate()
            r0.<init>(r1)
            return r0
    }

    @Override // org.bson.ByteBuf
    public org.bson.ByteBuf flip() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            r0.flip()
            return r1
    }

    @Override // org.bson.ByteBuf
    public byte get() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            byte r0 = r0.get()
            return r0
    }

    @Override // org.bson.ByteBuf
    public byte get(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            byte r2 = r0.get(r2)
            return r2
    }

    @Override // org.bson.ByteBuf
    public org.bson.ByteBuf get(int r3, byte[] r4) {
            r2 = this;
            int r0 = r4.length
            r1 = 0
            org.bson.ByteBuf r3 = r2.get(r3, r4, r1, r0)
            return r3
    }

    @Override // org.bson.ByteBuf
    public org.bson.ByteBuf get(int r5, byte[] r6, int r7, int r8) {
            r4 = this;
            r0 = 0
        L1:
            if (r0 >= r8) goto L12
            int r1 = r7 + r0
            java.nio.ByteBuffer r2 = r4.buf
            int r3 = r5 + r0
            byte r2 = r2.get(r3)
            r6[r1] = r2
            int r0 = r0 + 1
            goto L1
        L12:
            return r4
    }

    @Override // org.bson.ByteBuf
    public org.bson.ByteBuf get(byte[] r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            r0.get(r2)
            return r1
    }

    @Override // org.bson.ByteBuf
    public org.bson.ByteBuf get(byte[] r2, int r3, int r4) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            r0.get(r2, r3, r4)
            return r1
    }

    @Override // org.bson.ByteBuf
    public double getDouble() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buf
            double r0 = r0.getDouble()
            return r0
    }

    @Override // org.bson.ByteBuf
    public double getDouble(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buf
            double r0 = r0.getDouble(r3)
            return r0
    }

    @Override // org.bson.ByteBuf
    public int getInt() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            int r0 = r0.getInt()
            return r0
    }

    @Override // org.bson.ByteBuf
    public int getInt(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            int r2 = r0.getInt(r2)
            return r2
    }

    @Override // org.bson.ByteBuf
    public long getLong() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buf
            long r0 = r0.getLong()
            return r0
    }

    @Override // org.bson.ByteBuf
    public long getLong(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buf
            long r0 = r0.getLong(r3)
            return r0
    }

    @Override // org.bson.ByteBuf
    public int getReferenceCount() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.referenceCount
            int r0 = r0.get()
            return r0
    }

    @Override // org.bson.ByteBuf
    public boolean hasRemaining() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            boolean r0 = r0.hasRemaining()
            return r0
    }

    @Override // org.bson.ByteBuf
    public int limit() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            int r0 = r0.limit()
            return r0
    }

    @Override // org.bson.ByteBuf
    public org.bson.ByteBuf limit(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            r0.limit(r2)
            return r1
    }

    @Override // org.bson.ByteBuf
    public org.bson.ByteBuf order(java.nio.ByteOrder r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            r0.order(r2)
            return r1
    }

    @Override // org.bson.ByteBuf
    public int position() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            int r0 = r0.position()
            return r0
    }

    @Override // org.bson.ByteBuf
    public org.bson.ByteBuf position(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            r0.position(r2)
            return r1
    }

    @Override // org.bson.ByteBuf
    public org.bson.ByteBuf put(byte r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            r0.put(r2)
            return r1
    }

    @Override // org.bson.ByteBuf
    public org.bson.ByteBuf put(int r2, byte r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            r0.put(r2, r3)
            return r1
    }

    @Override // org.bson.ByteBuf
    public org.bson.ByteBuf put(byte[] r2, int r3, int r4) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            r0.put(r2, r3, r4)
            return r1
    }

    @Override // org.bson.ByteBuf
    public void release() {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.referenceCount
            int r0 = r0.decrementAndGet()
            if (r0 < 0) goto L14
            java.util.concurrent.atomic.AtomicInteger r0 = r2.referenceCount
            int r0 = r0.get()
            if (r0 != 0) goto L13
            r0 = 0
            r2.buf = r0
        L13:
            return
        L14:
            java.util.concurrent.atomic.AtomicInteger r0 = r2.referenceCount
            r0.incrementAndGet()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attempted to decrement the reference count below 0"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.ByteBuf
    public int remaining() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buf
            int r0 = r0.remaining()
            return r0
    }

    @Override // org.bson.ByteBuf
    public /* bridge */ /* synthetic */ org.bson.ByteBuf retain() {
            r1 = this;
            org.bson.ByteBufNIO r0 = r1.retain()
            return r0
    }

    @Override // org.bson.ByteBuf
    public org.bson.ByteBufNIO retain() {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.referenceCount
            int r0 = r0.incrementAndGet()
            r1 = 1
            if (r0 == r1) goto La
            return r2
        La:
            java.util.concurrent.atomic.AtomicInteger r0 = r2.referenceCount
            r0.decrementAndGet()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attempted to increment the reference count when it is already 0"
            r0.<init>(r1)
            throw r0
    }
}
