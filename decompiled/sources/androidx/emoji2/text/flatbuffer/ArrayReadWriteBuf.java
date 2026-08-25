package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes2.dex */
public class ArrayReadWriteBuf implements androidx.emoji2.text.flatbuffer.ReadWriteBuf {
    private byte[] buffer;
    private int writePos;

    public ArrayReadWriteBuf() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public ArrayReadWriteBuf(int r1) {
            r0 = this;
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
            return
    }

    public ArrayReadWriteBuf(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.buffer = r1
            r1 = 0
            r0.writePos = r1
            return
    }

    public ArrayReadWriteBuf(byte[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.buffer = r1
            r0.writePos = r2
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte[] data() {
            r1 = this;
            byte[] r0 = r1.buffer
            return r0
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int r2) {
            r1 = this;
            byte[] r0 = r1.buffer
            r2 = r0[r2]
            return r2
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public boolean getBoolean(int r2) {
            r1 = this;
            byte[] r0 = r1.buffer
            r2 = r0[r2]
            if (r2 == 0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            return r2
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int r3) {
            r2 = this;
            long r0 = r2.getLong(r3)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int r1) {
            r0 = this;
            int r1 = r0.getInt(r1)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int r4) {
            r3 = this;
            byte[] r0 = r3.buffer
            int r1 = r4 + 3
            r1 = r0[r1]
            int r1 = r1 << 24
            int r2 = r4 + 2
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r1 = r1 | r2
            int r2 = r4 + 1
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            r4 = r0[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r1
            return r4
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int r9) {
            r8 = this;
            byte[] r0 = r8.buffer
            int r1 = r9 + 1
            r9 = r0[r9]
            long r2 = (long) r9
            r4 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r4
            int r9 = r1 + 1
            r1 = r0[r1]
            long r6 = (long) r1
            long r6 = r6 & r4
            r1 = 8
            long r6 = r6 << r1
            long r1 = r2 | r6
            int r3 = r9 + 1
            r9 = r0[r9]
            long r6 = (long) r9
            long r6 = r6 & r4
            r9 = 16
            long r6 = r6 << r9
            long r1 = r1 | r6
            int r9 = r3 + 1
            r3 = r0[r3]
            long r6 = (long) r3
            long r6 = r6 & r4
            r3 = 24
            long r6 = r6 << r3
            long r1 = r1 | r6
            int r3 = r9 + 1
            r9 = r0[r9]
            long r6 = (long) r9
            long r6 = r6 & r4
            r9 = 32
            long r6 = r6 << r9
            long r1 = r1 | r6
            int r9 = r3 + 1
            r3 = r0[r3]
            long r6 = (long) r3
            long r6 = r6 & r4
            r3 = 40
            long r6 = r6 << r3
            long r1 = r1 | r6
            int r3 = r9 + 1
            r9 = r0[r9]
            long r6 = (long) r9
            long r4 = r4 & r6
            r9 = 48
            long r4 = r4 << r9
            long r1 = r1 | r4
            r9 = r0[r3]
            long r3 = (long) r9
            r9 = 56
            long r3 = r3 << r9
            long r0 = r1 | r3
            return r0
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int r3) {
            r2 = this;
            byte[] r0 = r2.buffer
            int r1 = r3 + 1
            r1 = r0[r1]
            int r1 = r1 << 8
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r1
            short r3 = (short) r3
            return r3
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public java.lang.String getString(int r2, int r3) {
            r1 = this;
            byte[] r0 = r1.buffer
            java.lang.String r2 = androidx.emoji2.text.flatbuffer.Utf8Safe.decodeUtf8Array(r0, r2, r3)
            return r2
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf, androidx.emoji2.text.flatbuffer.ReadBuf
    public int limit() {
            r1 = this;
            int r0 = r1.writePos
            return r0
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte r2) {
            r1 = this;
            int r0 = r1.writePos
            r1.set(r0, r2)
            int r2 = r1.writePos
            int r2 = r2 + 1
            r1.writePos = r2
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte[] r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.writePos
            r1.set(r0, r2, r3, r4)
            int r2 = r1.writePos
            int r2 = r2 + r4
            r1.writePos = r2
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putBoolean(boolean r2) {
            r1 = this;
            int r0 = r1.writePos
            r1.setBoolean(r0, r2)
            int r2 = r1.writePos
            int r2 = r2 + 1
            r1.writePos = r2
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putDouble(double r2) {
            r1 = this;
            int r0 = r1.writePos
            r1.setDouble(r0, r2)
            int r2 = r1.writePos
            int r2 = r2 + 8
            r1.writePos = r2
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putFloat(float r2) {
            r1 = this;
            int r0 = r1.writePos
            r1.setFloat(r0, r2)
            int r2 = r1.writePos
            int r2 = r2 + 4
            r1.writePos = r2
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putInt(int r2) {
            r1 = this;
            int r0 = r1.writePos
            r1.setInt(r0, r2)
            int r2 = r1.writePos
            int r2 = r2 + 4
            r1.writePos = r2
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putLong(long r2) {
            r1 = this;
            int r0 = r1.writePos
            r1.setLong(r0, r2)
            int r2 = r1.writePos
            int r2 = r2 + 8
            r1.writePos = r2
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putShort(short r2) {
            r1 = this;
            int r0 = r1.writePos
            r1.setShort(r0, r2)
            int r2 = r1.writePos
            int r2 = r2 + 2
            r1.writePos = r2
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public boolean requestCapacity(int r4) {
            r3 = this;
            byte[] r0 = r3.buffer
            int r1 = r0.length
            r2 = 1
            if (r1 <= r4) goto L7
            return r2
        L7:
            int r4 = r0.length
            int r1 = r4 >> 1
            int r4 = r4 + r1
            byte[] r4 = java.util.Arrays.copyOf(r0, r4)
            r3.buffer = r4
            return r2
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int r2, byte r3) {
            r1 = this;
            int r0 = r2 + 1
            r1.requestCapacity(r0)
            byte[] r0 = r1.buffer
            r0[r2] = r3
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            int r0 = r5 - r4
            int r0 = r0 + r2
            r1.requestCapacity(r0)
            byte[] r0 = r1.buffer
            java.lang.System.arraycopy(r3, r4, r0, r2, r5)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setBoolean(int r1, boolean r2) {
            r0 = this;
            r0.set(r1, r2)
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setDouble(int r5, double r6) {
            r4 = this;
            int r0 = r5 + 8
            r4.requestCapacity(r0)
            long r6 = java.lang.Double.doubleToRawLongBits(r6)
            int r0 = (int) r6
            byte[] r1 = r4.buffer
            int r2 = r5 + 1
            r3 = r0 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1[r5] = r3
            int r5 = r2 + 1
            int r3 = r0 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r5 + 1
            int r3 = r0 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1[r5] = r3
            int r5 = r2 + 1
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1[r2] = r0
            r0 = 32
            long r6 = r6 >> r0
            int r7 = (int) r6
            int r6 = r5 + 1
            r0 = r7 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1[r5] = r0
            int r5 = r6 + 1
            int r0 = r7 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1[r6] = r0
            int r6 = r5 + 1
            int r0 = r7 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1[r5] = r0
            int r5 = r7 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r1[r6] = r5
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setFloat(int r4, float r5) {
            r3 = this;
            int r0 = r4 + 4
            r3.requestCapacity(r0)
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            byte[] r0 = r3.buffer
            int r1 = r4 + 1
            r2 = r5 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r4] = r2
            int r4 = r1 + 1
            int r2 = r5 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r4 + 1
            int r2 = r5 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r4] = r2
            int r4 = r5 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r0[r1] = r4
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setInt(int r4, int r5) {
            r3 = this;
            int r0 = r4 + 4
            r3.requestCapacity(r0)
            byte[] r0 = r3.buffer
            int r1 = r4 + 1
            r2 = r5 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r4] = r2
            int r4 = r1 + 1
            int r2 = r5 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r4 + 1
            int r2 = r5 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r4] = r2
            int r4 = r5 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r0[r1] = r4
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setLong(int r5, long r6) {
            r4 = this;
            int r0 = r5 + 8
            r4.requestCapacity(r0)
            int r0 = (int) r6
            byte[] r1 = r4.buffer
            int r2 = r5 + 1
            r3 = r0 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1[r5] = r3
            int r5 = r2 + 1
            int r3 = r0 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r5 + 1
            int r3 = r0 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1[r5] = r3
            int r5 = r2 + 1
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1[r2] = r0
            r0 = 32
            long r6 = r6 >> r0
            int r7 = (int) r6
            int r6 = r5 + 1
            r0 = r7 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1[r5] = r0
            int r5 = r6 + 1
            int r0 = r7 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1[r6] = r0
            int r6 = r5 + 1
            int r0 = r7 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1[r5] = r0
            int r5 = r7 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r1[r6] = r5
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setShort(int r4, short r5) {
            r3 = this;
            int r0 = r4 + 2
            r3.requestCapacity(r0)
            byte[] r0 = r3.buffer
            int r1 = r4 + 1
            r2 = r5 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r4] = r2
            int r4 = r5 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r0[r1] = r4
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int writePosition() {
            r1 = this;
            int r0 = r1.writePos
            return r0
    }
}
