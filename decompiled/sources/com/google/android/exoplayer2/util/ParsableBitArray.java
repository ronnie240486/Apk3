package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class ParsableBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    public byte[] data;

    public ParsableBitArray() {
            r1 = this;
            r1.<init>()
            byte[] r0 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
            r1.data = r0
            return
    }

    public ParsableBitArray(byte[] r2) {
            r1 = this;
            int r0 = r2.length
            r1.<init>(r2, r0)
            return
    }

    public ParsableBitArray(byte[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            r0.byteLimit = r2
            return
    }

    private void assertValidOffset() {
            r2 = this;
            int r0 = r2.byteOffset
            if (r0 < 0) goto L10
            int r1 = r2.byteLimit
            if (r0 < r1) goto Le
            if (r0 != r1) goto L10
            int r0 = r2.bitOffset
            if (r0 != 0) goto L10
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            return
    }

    public int bitsLeft() {
            r2 = this;
            int r0 = r2.byteLimit
            int r1 = r2.byteOffset
            int r0 = r0 - r1
            int r0 = r0 * 8
            int r1 = r2.bitOffset
            int r0 = r0 - r1
            return r0
    }

    public void byteAlign() {
            r1 = this;
            int r0 = r1.bitOffset
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r1.bitOffset = r0
            int r0 = r1.byteOffset
            int r0 = r0 + 1
            r1.byteOffset = r0
            r1.assertValidOffset()
            return
    }

    public int getBytePosition() {
            r1 = this;
            int r0 = r1.bitOffset
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            int r0 = r1.byteOffset
            return r0
    }

    public int getPosition() {
            r2 = this;
            int r0 = r2.byteOffset
            int r0 = r0 * 8
            int r1 = r2.bitOffset
            int r0 = r0 + r1
            return r0
    }

    public void putInt(int r9, int r10) {
            r8 = this;
            r0 = 1
            r1 = 32
            if (r10 >= r1) goto L9
            int r1 = r0 << r10
            int r1 = r1 - r0
            r9 = r9 & r1
        L9:
            int r1 = r8.bitOffset
            r2 = 8
            int r1 = 8 - r1
            int r1 = java.lang.Math.min(r1, r10)
            int r3 = r8.bitOffset
            int r4 = 8 - r3
            int r4 = r4 - r1
            r5 = 65280(0xff00, float:9.1477E-41)
            int r3 = r5 >> r3
            int r5 = r0 << r4
            int r5 = r5 - r0
            r3 = r3 | r5
            byte[] r5 = r8.data
            int r6 = r8.byteOffset
            r7 = r5[r6]
            r3 = r3 & r7
            byte r3 = (byte) r3
            r5[r6] = r3
            int r1 = r10 - r1
            int r3 = r9 >>> r1
            r7 = r5[r6]
            int r3 = r3 << r4
            r3 = r3 | r7
            byte r3 = (byte) r3
            r5[r6] = r3
            int r6 = r6 + r0
        L37:
            if (r1 <= r2) goto L48
            byte[] r3 = r8.data
            int r4 = r6 + 1
            int r5 = r1 + (-8)
            int r5 = r9 >>> r5
            byte r5 = (byte) r5
            r3[r6] = r5
            int r1 = r1 + (-8)
            r6 = r4
            goto L37
        L48:
            int r2 = 8 - r1
            byte[] r3 = r8.data
            r4 = r3[r6]
            int r5 = r0 << r2
            int r5 = r5 - r0
            r4 = r4 & r5
            byte r4 = (byte) r4
            r3[r6] = r4
            int r1 = r0 << r1
            int r1 = r1 - r0
            r9 = r9 & r1
            r0 = r3[r6]
            int r9 = r9 << r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r3[r6] = r9
            r8.skipBits(r10)
            r8.assertValidOffset()
            return
    }

    public boolean readBit() {
            r3 = this;
            byte[] r0 = r3.data
            int r1 = r3.byteOffset
            r0 = r0[r1]
            int r1 = r3.bitOffset
            r2 = 128(0x80, float:1.8E-43)
            int r1 = r2 >> r1
            r0 = r0 & r1
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            r3.skipBit()
            return r0
    }

    public int readBits(int r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            int r1 = r7.bitOffset
            int r1 = r1 + r8
            r7.bitOffset = r1
            r1 = 0
        La:
            int r2 = r7.bitOffset
            r3 = 8
            if (r2 <= r3) goto L24
            int r2 = r2 + (-8)
            r7.bitOffset = r2
            byte[] r3 = r7.data
            int r4 = r7.byteOffset
            int r5 = r4 + 1
            r7.byteOffset = r5
            r3 = r3[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r3 << r2
            r1 = r1 | r2
            goto La
        L24:
            byte[] r4 = r7.data
            int r5 = r7.byteOffset
            r4 = r4[r5]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r6 = 8 - r2
            int r4 = r4 >> r6
            r1 = r1 | r4
            r4 = -1
            int r8 = 32 - r8
            int r8 = r4 >>> r8
            r8 = r8 & r1
            if (r2 != r3) goto L3e
            r7.bitOffset = r0
            int r5 = r5 + 1
            r7.byteOffset = r5
        L3e:
            r7.assertValidOffset()
            return r8
    }

    public void readBits(byte[] r8, int r9, int r10) {
            r7 = this;
            int r0 = r10 >> 3
            int r0 = r0 + r9
        L3:
            r1 = 255(0xff, float:3.57E-43)
            r2 = 8
            if (r9 >= r0) goto L27
            byte[] r3 = r7.data
            int r4 = r7.byteOffset
            int r5 = r4 + 1
            r7.byteOffset = r5
            r4 = r3[r4]
            int r6 = r7.bitOffset
            int r4 = r4 << r6
            byte r4 = (byte) r4
            r8[r9] = r4
            r4 = r8[r9]
            r3 = r3[r5]
            r1 = r1 & r3
            int r2 = r2 - r6
            int r1 = r1 >> r2
            r1 = r1 | r4
            byte r1 = (byte) r1
            r8[r9] = r1
            int r9 = r9 + 1
            goto L3
        L27:
            r9 = r10 & 7
            if (r9 != 0) goto L2c
            return
        L2c:
            r10 = r8[r0]
            int r3 = r1 >> r9
            r10 = r10 & r3
            byte r10 = (byte) r10
            r8[r0] = r10
            int r10 = r7.bitOffset
            int r3 = r10 + r9
            if (r3 <= r2) goto L4f
            r3 = r8[r0]
            byte[] r4 = r7.data
            int r5 = r7.byteOffset
            int r6 = r5 + 1
            r7.byteOffset = r6
            r4 = r4[r5]
            r4 = r4 & r1
            int r4 = r4 << r10
            r3 = r3 | r4
            byte r3 = (byte) r3
            r8[r0] = r3
            int r10 = r10 - r2
            r7.bitOffset = r10
        L4f:
            int r10 = r7.bitOffset
            int r10 = r10 + r9
            r7.bitOffset = r10
            byte[] r3 = r7.data
            int r4 = r7.byteOffset
            r3 = r3[r4]
            r1 = r1 & r3
            int r3 = 8 - r10
            int r1 = r1 >> r3
            r3 = r8[r0]
            int r9 = 8 - r9
            int r9 = r1 << r9
            byte r9 = (byte) r9
            r9 = r9 | r3
            byte r9 = (byte) r9
            r8[r0] = r9
            if (r10 != r2) goto L72
            r8 = 0
            r7.bitOffset = r8
            int r4 = r4 + 1
            r7.byteOffset = r4
        L72:
            r7.assertValidOffset()
            return
    }

    public long readBitsToLong(int r3) {
            r2 = this;
            r0 = 32
            if (r3 > r0) goto Ld
            int r3 = r2.readBits(r3)
            long r0 = com.google.android.exoplayer2.util.Util.toUnsignedLong(r3)
            return r0
        Ld:
            int r3 = r3 - r0
            int r3 = r2.readBits(r3)
            int r0 = r2.readBits(r0)
            long r0 = com.google.android.exoplayer2.util.Util.toLong(r3, r0)
            return r0
    }

    public void readBytes(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.bitOffset
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            byte[] r0 = r2.data
            int r1 = r2.byteOffset
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            int r3 = r2.byteOffset
            int r3 = r3 + r5
            r2.byteOffset = r3
            r2.assertValidOffset()
            return
    }

    public java.lang.String readBytesAsString(int r2) {
            r1 = this;
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_8
            java.lang.String r2 = r1.readBytesAsString(r2, r0)
            return r2
    }

    public java.lang.String readBytesAsString(int r3, java.nio.charset.Charset r4) {
            r2 = this;
            byte[] r0 = new byte[r3]
            r1 = 0
            r2.readBytes(r0, r1, r3)
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0, r4)
            return r3
    }

    public void reset(com.google.android.exoplayer2.util.ParsableByteArray r3) {
            r2 = this;
            byte[] r0 = r3.getData()
            int r1 = r3.limit()
            r2.reset(r0, r1)
            int r3 = r3.getPosition()
            int r3 = r3 * 8
            r2.setPosition(r3)
            return
    }

    public void reset(byte[] r2) {
            r1 = this;
            int r0 = r2.length
            r1.reset(r2, r0)
            return
    }

    public void reset(byte[] r1, int r2) {
            r0 = this;
            r0.data = r1
            r1 = 0
            r0.byteOffset = r1
            r0.bitOffset = r1
            r0.byteLimit = r2
            return
    }

    public void setPosition(int r2) {
            r1 = this;
            int r0 = r2 / 8
            r1.byteOffset = r0
            int r0 = r0 * 8
            int r2 = r2 - r0
            r1.bitOffset = r2
            r1.assertValidOffset()
            return
    }

    public void skipBit() {
            r2 = this;
            int r0 = r2.bitOffset
            int r0 = r0 + 1
            r2.bitOffset = r0
            r1 = 8
            if (r0 != r1) goto L13
            r0 = 0
            r2.bitOffset = r0
            int r0 = r2.byteOffset
            int r0 = r0 + 1
            r2.byteOffset = r0
        L13:
            r2.assertValidOffset()
            return
    }

    public void skipBits(int r4) {
            r3 = this;
            int r0 = r4 / 8
            int r1 = r3.byteOffset
            int r1 = r1 + r0
            r3.byteOffset = r1
            int r2 = r3.bitOffset
            int r0 = r0 * 8
            int r4 = r4 - r0
            int r4 = r4 + r2
            r3.bitOffset = r4
            r0 = 7
            if (r4 <= r0) goto L1a
            int r1 = r1 + 1
            r3.byteOffset = r1
            int r4 = r4 + (-8)
            r3.bitOffset = r4
        L1a:
            r3.assertValidOffset()
            return
    }

    public void skipBytes(int r2) {
            r1 = this;
            int r0 = r1.bitOffset
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            int r0 = r1.byteOffset
            int r0 = r0 + r2
            r1.byteOffset = r0
            r1.assertValidOffset()
            return
    }
}
