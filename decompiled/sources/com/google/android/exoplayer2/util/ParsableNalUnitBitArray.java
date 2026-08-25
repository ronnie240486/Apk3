package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class ParsableNalUnitBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    private byte[] data;

    public ParsableNalUnitBitArray(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.reset(r1, r2, r3)
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

    private int readExpGolombCodeNum() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            boolean r2 = r4.readBit()
            if (r2 != 0) goto Lb
            int r1 = r1 + 1
            goto L2
        Lb:
            r2 = 1
            int r3 = r2 << r1
            int r3 = r3 - r2
            if (r1 <= 0) goto L15
            int r0 = r4.readBits(r1)
        L15:
            int r3 = r3 + r0
            return r3
    }

    private boolean shouldSkipByte(int r5) {
            r4 = this;
            r0 = 1
            r1 = 2
            if (r1 > r5) goto L1b
            int r1 = r4.byteLimit
            if (r5 >= r1) goto L1b
            byte[] r1 = r4.data
            r2 = r1[r5]
            r3 = 3
            if (r2 != r3) goto L1b
            int r2 = r5 + (-2)
            r2 = r1[r2]
            if (r2 != 0) goto L1b
            int r5 = r5 - r0
            r5 = r1[r5]
            if (r5 != 0) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    public boolean canReadBits(int r5) {
            r4 = this;
            int r0 = r4.byteOffset
            int r1 = r5 / 8
            int r2 = r0 + r1
            int r3 = r4.bitOffset
            int r3 = r3 + r5
            int r1 = r1 * 8
            int r3 = r3 - r1
            r5 = 7
            if (r3 <= r5) goto L13
            int r2 = r2 + 1
            int r3 = r3 + (-8)
        L13:
            r5 = 1
        L14:
            int r0 = r0 + r5
            if (r0 > r2) goto L26
            int r1 = r4.byteLimit
            if (r2 >= r1) goto L26
            boolean r1 = r4.shouldSkipByte(r0)
            if (r1 == 0) goto L14
            int r2 = r2 + 1
            int r0 = r0 + 2
            goto L14
        L26:
            int r0 = r4.byteLimit
            if (r2 < r0) goto L30
            if (r2 != r0) goto L2f
            if (r3 != 0) goto L2f
            goto L30
        L2f:
            r5 = 0
        L30:
            return r5
    }

    public boolean canReadExpGolombCodedNum() {
            r7 = this;
            int r0 = r7.byteOffset
            int r1 = r7.bitOffset
            r2 = 0
            r3 = 0
        L6:
            int r4 = r7.byteOffset
            int r5 = r7.byteLimit
            if (r4 >= r5) goto L15
            boolean r4 = r7.readBit()
            if (r4 != 0) goto L15
            int r3 = r3 + 1
            goto L6
        L15:
            int r4 = r7.byteOffset
            int r5 = r7.byteLimit
            r6 = 1
            if (r4 != r5) goto L1e
            r4 = 1
            goto L1f
        L1e:
            r4 = 0
        L1f:
            r7.byteOffset = r0
            r7.bitOffset = r1
            if (r4 != 0) goto L2f
            int r3 = r3 * 2
            int r3 = r3 + r6
            boolean r0 = r7.canReadBits(r3)
            if (r0 == 0) goto L2f
            r2 = 1
        L2f:
            return r2
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

    public int readBits(int r10) {
            r9 = this;
            int r0 = r9.bitOffset
            int r0 = r0 + r10
            r9.bitOffset = r0
            r0 = 0
            r1 = 0
        L7:
            int r2 = r9.bitOffset
            r3 = 2
            r4 = 1
            r5 = 8
            if (r2 <= r5) goto L2c
            int r2 = r2 + (-8)
            r9.bitOffset = r2
            byte[] r5 = r9.data
            int r6 = r9.byteOffset
            r5 = r5[r6]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r5 << r2
            r1 = r1 | r2
            int r2 = r6 + 1
            boolean r2 = r9.shouldSkipByte(r2)
            if (r2 == 0) goto L27
            goto L28
        L27:
            r3 = 1
        L28:
            int r6 = r6 + r3
            r9.byteOffset = r6
            goto L7
        L2c:
            byte[] r6 = r9.data
            int r7 = r9.byteOffset
            r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r8 = 8 - r2
            int r6 = r6 >> r8
            r1 = r1 | r6
            r6 = -1
            int r10 = 32 - r10
            int r10 = r6 >>> r10
            r10 = r10 & r1
            if (r2 != r5) goto L4f
            r9.bitOffset = r0
            int r0 = r7 + 1
            boolean r0 = r9.shouldSkipByte(r0)
            if (r0 == 0) goto L4b
            goto L4c
        L4b:
            r3 = 1
        L4c:
            int r7 = r7 + r3
            r9.byteOffset = r7
        L4f:
            r9.assertValidOffset()
            return r10
    }

    public int readSignedExpGolombCodedInt() {
            r3 = this;
            int r0 = r3.readExpGolombCodeNum()
            int r1 = r0 % 2
            r2 = 1
            if (r1 != 0) goto Lb
            r1 = -1
            goto Lc
        Lb:
            r1 = 1
        Lc:
            int r0 = r0 + r2
            int r0 = r0 / 2
            int r0 = r0 * r1
            return r0
    }

    public int readUnsignedExpGolombCodedInt() {
            r1 = this;
            int r0 = r1.readExpGolombCodeNum()
            return r0
    }

    public void reset(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.data = r1
            r0.byteOffset = r2
            r0.byteLimit = r3
            r1 = 0
            r0.bitOffset = r1
            r0.assertValidOffset()
            return
    }

    public void skipBit() {
            r3 = this;
            int r0 = r3.bitOffset
            r1 = 1
            int r0 = r0 + r1
            r3.bitOffset = r0
            r2 = 8
            if (r0 != r2) goto L1b
            r0 = 0
            r3.bitOffset = r0
            int r0 = r3.byteOffset
            int r2 = r0 + 1
            boolean r2 = r3.shouldSkipByte(r2)
            if (r2 == 0) goto L18
            r1 = 2
        L18:
            int r0 = r0 + r1
            r3.byteOffset = r0
        L1b:
            r3.assertValidOffset()
            return
    }

    public void skipBits(int r5) {
            r4 = this;
            int r0 = r4.byteOffset
            int r1 = r5 / 8
            int r2 = r0 + r1
            r4.byteOffset = r2
            int r3 = r4.bitOffset
            int r1 = r1 * 8
            int r5 = r5 - r1
            int r5 = r5 + r3
            r4.bitOffset = r5
            r1 = 7
            if (r5 <= r1) goto L1b
            int r2 = r2 + 1
            r4.byteOffset = r2
            int r5 = r5 + (-8)
            r4.bitOffset = r5
        L1b:
            int r0 = r0 + 1
            int r5 = r4.byteOffset
            if (r0 > r5) goto L30
            boolean r5 = r4.shouldSkipByte(r0)
            if (r5 == 0) goto L1b
            int r5 = r4.byteOffset
            int r5 = r5 + 1
            r4.byteOffset = r5
            int r0 = r0 + 2
            goto L1b
        L30:
            r4.assertValidOffset()
            return
    }
}
