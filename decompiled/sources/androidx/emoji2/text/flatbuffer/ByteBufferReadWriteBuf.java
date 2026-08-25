package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes2.dex */
public class ByteBufferReadWriteBuf implements androidx.emoji2.text.flatbuffer.ReadWriteBuf {
    private final java.nio.ByteBuffer buffer;

    public ByteBufferReadWriteBuf(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.<init>()
            r1.buffer = r2
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte[] data() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            byte[] r0 = r0.array()
            return r0
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            byte r2 = r0.get(r2)
            return r2
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public boolean getBoolean(int r1) {
            r0 = this;
            byte r1 = r0.get(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buffer
            double r0 = r0.getDouble(r3)
            return r0
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            float r2 = r0.getFloat(r2)
            return r2
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            int r2 = r0.getInt(r2)
            return r2
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buffer
            long r0 = r0.getLong(r3)
            return r0
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            short r2 = r0.getShort(r2)
            return r2
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public java.lang.String getString(int r2, int r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            java.lang.String r2 = androidx.emoji2.text.flatbuffer.Utf8Safe.decodeUtf8Buffer(r0, r2, r3)
            return r2
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf, androidx.emoji2.text.flatbuffer.ReadBuf
    public int limit() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            int r0 = r0.limit()
            return r0
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            r0.put(r2)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte[] r2, int r3, int r4) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            r0.put(r2, r3, r4)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putBoolean(boolean r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            r0.put(r2)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putDouble(double r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            r0.putDouble(r2)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putFloat(float r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            r0.putFloat(r2)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putInt(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            r0.putInt(r2)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putLong(long r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            r0.putLong(r2)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putShort(short r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            r0.putShort(r2)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public boolean requestCapacity(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            int r0 = r0.limit()
            if (r2 > r0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int r2, byte r3) {
            r1 = this;
            int r0 = r2 + 1
            r1.requestCapacity(r0)
            java.nio.ByteBuffer r0 = r1.buffer
            r0.put(r2, r3)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int r3, byte[] r4, int r5, int r6) {
            r2 = this;
            int r0 = r6 - r5
            int r0 = r0 + r3
            r2.requestCapacity(r0)
            java.nio.ByteBuffer r0 = r2.buffer
            int r0 = r0.position()
            java.nio.ByteBuffer r1 = r2.buffer
            r1.position(r3)
            java.nio.ByteBuffer r3 = r2.buffer
            r3.put(r4, r5, r6)
            java.nio.ByteBuffer r3 = r2.buffer
            r3.position(r0)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setBoolean(int r1, boolean r2) {
            r0 = this;
            r0.set(r1, r2)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setDouble(int r2, double r3) {
            r1 = this;
            int r0 = r2 + 8
            r1.requestCapacity(r0)
            java.nio.ByteBuffer r0 = r1.buffer
            r0.putDouble(r2, r3)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setFloat(int r2, float r3) {
            r1 = this;
            int r0 = r2 + 4
            r1.requestCapacity(r0)
            java.nio.ByteBuffer r0 = r1.buffer
            r0.putFloat(r2, r3)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setInt(int r2, int r3) {
            r1 = this;
            int r0 = r2 + 4
            r1.requestCapacity(r0)
            java.nio.ByteBuffer r0 = r1.buffer
            r0.putInt(r2, r3)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setLong(int r2, long r3) {
            r1 = this;
            int r0 = r2 + 8
            r1.requestCapacity(r0)
            java.nio.ByteBuffer r0 = r1.buffer
            r0.putLong(r2, r3)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setShort(int r2, short r3) {
            r1 = this;
            int r0 = r2 + 2
            r1.requestCapacity(r0)
            java.nio.ByteBuffer r0 = r1.buffer
            r0.putShort(r2, r3)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int writePosition() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            int r0 = r0.position()
            return r0
    }
}
