package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes2.dex */
public final class VorbisBitArray {
    private int bitOffset;
    private final int byteLimit;
    private int byteOffset;
    private final byte[] data;

    public VorbisBitArray(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            int r1 = r1.length
            r0.byteLimit = r1
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

    public int getPosition() {
            r2 = this;
            int r0 = r2.byteOffset
            int r0 = r0 * 8
            int r1 = r2.bitOffset
            int r0 = r0 + r1
            return r0
    }

    public boolean readBit() {
            r2 = this;
            byte[] r0 = r2.data
            int r1 = r2.byteOffset
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r2.bitOffset
            int r0 = r0 >> r1
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            r2.skipBits(r1)
            return r0
    }

    public int readBits(int r7) {
            r6 = this;
            int r0 = r6.byteOffset
            int r1 = r6.bitOffset
            int r1 = 8 - r1
            int r1 = java.lang.Math.min(r7, r1)
            byte[] r2 = r6.data
            int r3 = r0 + 1
            r0 = r2[r0]
            r2 = 255(0xff, float:3.57E-43)
            r0 = r0 & r2
            int r4 = r6.bitOffset
            int r0 = r0 >> r4
            int r4 = 8 - r1
            int r4 = r2 >> r4
            r0 = r0 & r4
        L1b:
            if (r1 >= r7) goto L2a
            byte[] r4 = r6.data
            int r5 = r3 + 1
            r3 = r4[r3]
            r3 = r3 & r2
            int r3 = r3 << r1
            r0 = r0 | r3
            int r1 = r1 + 8
            r3 = r5
            goto L1b
        L2a:
            r1 = -1
            int r2 = 32 - r7
            int r1 = r1 >>> r2
            r0 = r0 & r1
            r6.skipBits(r7)
            return r0
    }

    public void reset() {
            r1 = this;
            r0 = 0
            r1.byteOffset = r0
            r1.bitOffset = r0
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
}
