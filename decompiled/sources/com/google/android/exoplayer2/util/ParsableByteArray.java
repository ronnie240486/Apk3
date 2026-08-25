package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class ParsableByteArray {
    private static final char[] CR_AND_LF = null;
    private static final char[] LF = null;
    private static final com.google.common.collect.ImmutableSet<java.nio.charset.Charset> SUPPORTED_CHARSETS_FOR_READLINE = null;
    private byte[] data;
    private int limit;
    private int position;

    static {
            r0 = 2
            char[] r0 = new char[r0]
            r0 = {x0024: FILL_ARRAY_DATA , data: [13, 10} // fill-array
            com.google.android.exoplayer2.util.ParsableByteArray.CR_AND_LF = r0
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r2 = 10
            r0[r1] = r2
            com.google.android.exoplayer2.util.ParsableByteArray.LF = r0
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.US_ASCII
            java.nio.charset.Charset r1 = com.google.common.base.Charsets.UTF_8
            java.nio.charset.Charset r2 = com.google.common.base.Charsets.UTF_16
            java.nio.charset.Charset r3 = com.google.common.base.Charsets.UTF_16BE
            java.nio.charset.Charset r4 = com.google.common.base.Charsets.UTF_16LE
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of(r0, r1, r2, r3, r4)
            com.google.android.exoplayer2.util.ParsableByteArray.SUPPORTED_CHARSETS_FOR_READLINE = r0
            return
    }

    public ParsableByteArray() {
            r1 = this;
            r1.<init>()
            byte[] r0 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
            r1.data = r0
            return
    }

    public ParsableByteArray(int r2) {
            r1 = this;
            r1.<init>()
            byte[] r0 = new byte[r2]
            r1.data = r0
            r1.limit = r2
            return
    }

    public ParsableByteArray(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            int r1 = r1.length
            r0.limit = r1
            return
    }

    public ParsableByteArray(byte[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            r0.limit = r2
            return
    }

    private int findNextLineTerminator(java.nio.charset.Charset r5) {
            r4 = this;
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_8
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L43
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.US_ASCII
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L11
            goto L43
        L11:
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_16
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L41
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L41
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L2a
            goto L41
        L2a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported charset: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L41:
            r0 = 2
            goto L44
        L43:
            r0 = 1
        L44:
            int r1 = r4.position
        L46:
            int r2 = r4.limit
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto La5
            java.nio.charset.Charset r2 = com.google.common.base.Charsets.UTF_8
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L5e
            java.nio.charset.Charset r2 = com.google.common.base.Charsets.US_ASCII
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L69
        L5e:
            byte[] r2 = r4.data
            r2 = r2[r1]
            boolean r2 = com.google.android.exoplayer2.util.Util.isLinebreak(r2)
            if (r2 == 0) goto L69
            return r1
        L69:
            java.nio.charset.Charset r2 = com.google.common.base.Charsets.UTF_16
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L79
            java.nio.charset.Charset r2 = com.google.common.base.Charsets.UTF_16BE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8a
        L79:
            byte[] r2 = r4.data
            r3 = r2[r1]
            if (r3 != 0) goto L8a
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = com.google.android.exoplayer2.util.Util.isLinebreak(r2)
            if (r2 == 0) goto L8a
            return r1
        L8a:
            java.nio.charset.Charset r2 = com.google.common.base.Charsets.UTF_16LE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto La3
            byte[] r2 = r4.data
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto La3
            r2 = r2[r1]
            boolean r2 = com.google.android.exoplayer2.util.Util.isLinebreak(r2)
            if (r2 == 0) goto La3
            return r1
        La3:
            int r1 = r1 + r0
            goto L46
        La5:
            return r2
    }

    private char readCharacterIfInList(java.nio.charset.Charset r7, char[] r8) {
            r6 = this;
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_8
            boolean r0 = r7.equals(r0)
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 != 0) goto L13
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.US_ASCII
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L2a
        L13:
            int r0 = r6.bytesLeft()
            if (r0 < r3) goto L2a
            byte[] r7 = r6.data
            int r0 = r6.position
            r7 = r7[r0]
            int r7 = com.google.common.primitives.UnsignedBytes.toInt(r7)
            long r4 = (long) r7
            char r7 = com.google.common.primitives.Chars.checkedCast(r4)
            r2 = 1
            goto L6a
        L2a:
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_16
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L3a
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_16BE
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L4e
        L3a:
            int r0 = r6.bytesLeft()
            if (r0 < r2) goto L4e
            byte[] r7 = r6.data
            int r0 = r6.position
            r4 = r7[r0]
            int r0 = r0 + r3
            r7 = r7[r0]
            char r7 = com.google.common.primitives.Chars.fromBytes(r4, r7)
            goto L6a
        L4e:
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_16LE
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L7b
            int r7 = r6.bytesLeft()
            if (r7 < r2) goto L7b
            byte[] r7 = r6.data
            int r0 = r6.position
            int r3 = r0 + 1
            r3 = r7[r3]
            r7 = r7[r0]
            char r7 = com.google.common.primitives.Chars.fromBytes(r3, r7)
        L6a:
            boolean r8 = com.google.common.primitives.Chars.contains(r8, r7)
            if (r8 == 0) goto L7b
            int r8 = r6.position
            int r8 = r8 + r2
            r6.position = r8
            long r7 = (long) r7
            char r7 = com.google.common.primitives.Chars.checkedCast(r7)
            return r7
        L7b:
            return r1
    }

    private void skipLineTerminator(java.nio.charset.Charset r3) {
            r2 = this;
            char[] r0 = com.google.android.exoplayer2.util.ParsableByteArray.CR_AND_LF
            char r0 = r2.readCharacterIfInList(r3, r0)
            r1 = 13
            if (r0 != r1) goto Lf
            char[] r0 = com.google.android.exoplayer2.util.ParsableByteArray.LF
            r2.readCharacterIfInList(r3, r0)
        Lf:
            return
    }

    public int bytesLeft() {
            r2 = this;
            int r0 = r2.limit
            int r1 = r2.position
            int r0 = r0 - r1
            return r0
    }

    public int capacity() {
            r1 = this;
            byte[] r0 = r1.data
            int r0 = r0.length
            return r0
    }

    public void ensureCapacity(int r2) {
            r1 = this;
            int r0 = r1.capacity()
            if (r2 <= r0) goto Le
            byte[] r0 = r1.data
            byte[] r2 = java.util.Arrays.copyOf(r0, r2)
            r1.data = r2
        Le:
            return
    }

    public byte[] getData() {
            r1 = this;
            byte[] r0 = r1.data
            return r0
    }

    public int getPosition() {
            r1 = this;
            int r0 = r1.position
            return r0
    }

    public int limit() {
            r1 = this;
            int r0 = r1.limit
            return r0
    }

    public char peekChar() {
            r3 = this;
            byte[] r0 = r3.data
            int r1 = r3.position
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            int r1 = r1 + 1
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r2
            char r0 = (char) r0
            return r0
    }

    public int peekUnsignedByte() {
            r2 = this;
            byte[] r0 = r2.data
            int r1 = r2.position
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    public void readBytes(com.google.android.exoplayer2.util.ParsableBitArray r3, int r4) {
            r2 = this;
            byte[] r0 = r3.data
            r1 = 0
            r2.readBytes(r0, r1, r4)
            r3.setPosition(r1)
            return
    }

    public void readBytes(java.nio.ByteBuffer r3, int r4) {
            r2 = this;
            byte[] r0 = r2.data
            int r1 = r2.position
            r3.put(r0, r1, r4)
            int r3 = r2.position
            int r3 = r3 + r4
            r2.position = r3
            return
    }

    public void readBytes(byte[] r3, int r4, int r5) {
            r2 = this;
            byte[] r0 = r2.data
            int r1 = r2.position
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            int r3 = r2.position
            int r3 = r3 + r5
            r2.position = r3
            return
    }

    @androidx.annotation.Nullable
    public java.lang.String readDelimiterTerminatedString(char r4) {
            r3 = this;
            int r0 = r3.bytesLeft()
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            int r0 = r3.position
        La:
            int r1 = r3.limit
            if (r0 >= r1) goto L17
            byte[] r1 = r3.data
            r1 = r1[r0]
            if (r1 == r4) goto L17
            int r0 = r0 + 1
            goto La
        L17:
            byte[] r4 = r3.data
            int r1 = r3.position
            int r2 = r0 - r1
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.fromUtf8Bytes(r4, r1, r2)
            r3.position = r0
            int r1 = r3.limit
            if (r0 >= r1) goto L2b
            int r0 = r0 + 1
            r3.position = r0
        L2b:
            return r4
    }

    public double readDouble() {
            r2 = this;
            long r0 = r2.readLong()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    public float readFloat() {
            r1 = this;
            int r0 = r1.readInt()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    public int readInt() {
            r4 = this;
            byte[] r0 = r4.data
            int r1 = r4.position
            int r2 = r1 + 1
            r4.position = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            int r3 = r2 + 1
            r4.position = r3
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r1 = r1 | r2
            int r2 = r3 + 1
            r4.position = r2
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r1 = r1 | r3
            int r3 = r2 + 1
            r4.position = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            return r0
    }

    public int readInt24() {
            r4 = this;
            byte[] r0 = r4.data
            int r1 = r4.position
            int r2 = r1 + 1
            r4.position = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            int r1 = r1 >> 8
            int r3 = r2 + 1
            r4.position = r3
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r2 = r3 + 1
            r4.position = r2
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String readLine() {
            r1 = this;
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_8
            java.lang.String r0 = r1.readLine(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String readLine(java.nio.charset.Charset r4) {
            r3 = this;
            com.google.common.collect.ImmutableSet<java.nio.charset.Charset> r0 = com.google.android.exoplayer2.util.ParsableByteArray.SUPPORTED_CHARSETS_FOR_READLINE
            boolean r0 = r0.contains(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported charset: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r1)
            int r0 = r3.bytesLeft()
            if (r0 != 0) goto L22
            r4 = 0
            return r4
        L22:
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.US_ASCII
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L2d
            r3.readUtfCharsetFromBom()
        L2d:
            int r0 = r3.findNextLineTerminator(r4)
            int r1 = r3.position
            int r0 = r0 - r1
            java.lang.String r0 = r3.readString(r0, r4)
            int r1 = r3.position
            int r2 = r3.limit
            if (r1 != r2) goto L3f
            return r0
        L3f:
            r3.skipLineTerminator(r4)
            return r0
    }

    public int readLittleEndianInt() {
            r4 = this;
            byte[] r0 = r4.data
            int r1 = r4.position
            int r2 = r1 + 1
            r4.position = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r4.position = r3
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r2 = r3 + 1
            r4.position = r2
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r1 = r1 | r3
            int r3 = r2 + 1
            r4.position = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r0 = r0 | r1
            return r0
    }

    public int readLittleEndianInt24() {
            r4 = this;
            byte[] r0 = r4.data
            int r1 = r4.position
            int r2 = r1 + 1
            r4.position = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r4.position = r3
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r2 = r3 + 1
            r4.position = r2
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            r0 = r0 | r1
            return r0
    }

    public long readLittleEndianLong() {
            r9 = this;
            byte[] r0 = r9.data
            int r1 = r9.position
            int r2 = r1 + 1
            r9.position = r2
            r1 = r0[r1]
            long r3 = (long) r1
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            int r1 = r2 + 1
            r9.position = r1
            r2 = r0[r2]
            long r7 = (long) r2
            long r7 = r7 & r5
            r2 = 8
            long r7 = r7 << r2
            long r2 = r3 | r7
            int r4 = r1 + 1
            r9.position = r4
            r1 = r0[r1]
            long r7 = (long) r1
            long r7 = r7 & r5
            r1 = 16
            long r7 = r7 << r1
            long r1 = r2 | r7
            int r3 = r4 + 1
            r9.position = r3
            r4 = r0[r4]
            long r7 = (long) r4
            long r7 = r7 & r5
            r4 = 24
            long r7 = r7 << r4
            long r1 = r1 | r7
            int r4 = r3 + 1
            r9.position = r4
            r3 = r0[r3]
            long r7 = (long) r3
            long r7 = r7 & r5
            r3 = 32
            long r7 = r7 << r3
            long r1 = r1 | r7
            int r3 = r4 + 1
            r9.position = r3
            r4 = r0[r4]
            long r7 = (long) r4
            long r7 = r7 & r5
            r4 = 40
            long r7 = r7 << r4
            long r1 = r1 | r7
            int r4 = r3 + 1
            r9.position = r4
            r3 = r0[r3]
            long r7 = (long) r3
            long r7 = r7 & r5
            r3 = 48
            long r7 = r7 << r3
            long r1 = r1 | r7
            int r3 = r4 + 1
            r9.position = r3
            r0 = r0[r4]
            long r3 = (long) r0
            long r3 = r3 & r5
            r0 = 56
            long r3 = r3 << r0
            long r0 = r1 | r3
            return r0
    }

    public short readLittleEndianShort() {
            r4 = this;
            byte[] r0 = r4.data
            int r1 = r4.position
            int r2 = r1 + 1
            r4.position = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r4.position = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r0 | r1
            short r0 = (short) r0
            return r0
    }

    public long readLittleEndianUnsignedInt() {
            r9 = this;
            byte[] r0 = r9.data
            int r1 = r9.position
            int r2 = r1 + 1
            r9.position = r2
            r1 = r0[r1]
            long r3 = (long) r1
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            int r1 = r2 + 1
            r9.position = r1
            r2 = r0[r2]
            long r7 = (long) r2
            long r7 = r7 & r5
            r2 = 8
            long r7 = r7 << r2
            long r2 = r3 | r7
            int r4 = r1 + 1
            r9.position = r4
            r1 = r0[r1]
            long r7 = (long) r1
            long r7 = r7 & r5
            r1 = 16
            long r7 = r7 << r1
            long r1 = r2 | r7
            int r3 = r4 + 1
            r9.position = r3
            r0 = r0[r4]
            long r3 = (long) r0
            long r3 = r3 & r5
            r0 = 24
            long r3 = r3 << r0
            long r0 = r1 | r3
            return r0
    }

    public int readLittleEndianUnsignedInt24() {
            r4 = this;
            byte[] r0 = r4.data
            int r1 = r4.position
            int r2 = r1 + 1
            r4.position = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r4.position = r3
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r2 = r3 + 1
            r4.position = r2
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            r0 = r0 | r1
            return r0
    }

    public int readLittleEndianUnsignedIntToInt() {
            r3 = this;
            int r0 = r3.readLittleEndianInt()
            if (r0 < 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Top bit not zero: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0)
            r1.<init>(r0)
            throw r1
    }

    public int readLittleEndianUnsignedShort() {
            r4 = this;
            byte[] r0 = r4.data
            int r1 = r4.position
            int r2 = r1 + 1
            r4.position = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r4.position = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r0 | r1
            return r0
    }

    public long readLong() {
            r9 = this;
            byte[] r0 = r9.data
            int r1 = r9.position
            int r2 = r1 + 1
            r9.position = r2
            r1 = r0[r1]
            long r3 = (long) r1
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            r1 = 56
            long r3 = r3 << r1
            int r1 = r2 + 1
            r9.position = r1
            r2 = r0[r2]
            long r7 = (long) r2
            long r7 = r7 & r5
            r2 = 48
            long r7 = r7 << r2
            long r2 = r3 | r7
            int r4 = r1 + 1
            r9.position = r4
            r1 = r0[r1]
            long r7 = (long) r1
            long r7 = r7 & r5
            r1 = 40
            long r7 = r7 << r1
            long r1 = r2 | r7
            int r3 = r4 + 1
            r9.position = r3
            r4 = r0[r4]
            long r7 = (long) r4
            long r7 = r7 & r5
            r4 = 32
            long r7 = r7 << r4
            long r1 = r1 | r7
            int r4 = r3 + 1
            r9.position = r4
            r3 = r0[r3]
            long r7 = (long) r3
            long r7 = r7 & r5
            r3 = 24
            long r7 = r7 << r3
            long r1 = r1 | r7
            int r3 = r4 + 1
            r9.position = r3
            r4 = r0[r4]
            long r7 = (long) r4
            long r7 = r7 & r5
            r4 = 16
            long r7 = r7 << r4
            long r1 = r1 | r7
            int r4 = r3 + 1
            r9.position = r4
            r3 = r0[r3]
            long r7 = (long) r3
            long r7 = r7 & r5
            r3 = 8
            long r7 = r7 << r3
            long r1 = r1 | r7
            int r3 = r4 + 1
            r9.position = r3
            r0 = r0[r4]
            long r3 = (long) r0
            long r3 = r3 & r5
            long r0 = r1 | r3
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String readNullTerminatedString() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.readDelimiterTerminatedString(r0)
            return r0
    }

    public java.lang.String readNullTerminatedString(int r4) {
            r3 = this;
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            int r0 = r3.position
            int r1 = r0 + r4
            int r1 = r1 + (-1)
            int r2 = r3.limit
            if (r1 >= r2) goto L18
            byte[] r2 = r3.data
            r1 = r2[r1]
            if (r1 != 0) goto L18
            int r1 = r4 + (-1)
            goto L19
        L18:
            r1 = r4
        L19:
            byte[] r2 = r3.data
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.fromUtf8Bytes(r2, r0, r1)
            int r1 = r3.position
            int r1 = r1 + r4
            r3.position = r1
            return r0
    }

    public short readShort() {
            r4 = this;
            byte[] r0 = r4.data
            int r1 = r4.position
            int r2 = r1 + 1
            r4.position = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r3 = r2 + 1
            r4.position = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            short r0 = (short) r0
            return r0
    }

    public java.lang.String readString(int r2) {
            r1 = this;
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_8
            java.lang.String r2 = r1.readString(r2, r0)
            return r2
    }

    public java.lang.String readString(int r4, java.nio.charset.Charset r5) {
            r3 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r3.data
            int r2 = r3.position
            r0.<init>(r1, r2, r4, r5)
            int r5 = r3.position
            int r5 = r5 + r4
            r3.position = r5
            return r0
    }

    public int readSynchSafeInt() {
            r4 = this;
            int r0 = r4.readUnsignedByte()
            int r1 = r4.readUnsignedByte()
            int r2 = r4.readUnsignedByte()
            int r3 = r4.readUnsignedByte()
            int r0 = r0 << 21
            int r1 = r1 << 14
            r0 = r0 | r1
            int r1 = r2 << 7
            r0 = r0 | r1
            r0 = r0 | r3
            return r0
    }

    public int readUnsignedByte() {
            r3 = this;
            byte[] r0 = r3.data
            int r1 = r3.position
            int r2 = r1 + 1
            r3.position = r2
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    public int readUnsignedFixedPoint1616() {
            r4 = this;
            byte[] r0 = r4.data
            int r1 = r4.position
            int r2 = r1 + 1
            r4.position = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r3 = r2 + 1
            r4.position = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            int r3 = r3 + 2
            r4.position = r3
            return r0
    }

    public long readUnsignedInt() {
            r9 = this;
            byte[] r0 = r9.data
            int r1 = r9.position
            int r2 = r1 + 1
            r9.position = r2
            r1 = r0[r1]
            long r3 = (long) r1
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            r1 = 24
            long r3 = r3 << r1
            int r1 = r2 + 1
            r9.position = r1
            r2 = r0[r2]
            long r7 = (long) r2
            long r7 = r7 & r5
            r2 = 16
            long r7 = r7 << r2
            long r2 = r3 | r7
            int r4 = r1 + 1
            r9.position = r4
            r1 = r0[r1]
            long r7 = (long) r1
            long r7 = r7 & r5
            r1 = 8
            long r7 = r7 << r1
            long r1 = r2 | r7
            int r3 = r4 + 1
            r9.position = r3
            r0 = r0[r4]
            long r3 = (long) r0
            long r3 = r3 & r5
            long r0 = r1 | r3
            return r0
    }

    public int readUnsignedInt24() {
            r4 = this;
            byte[] r0 = r4.data
            int r1 = r4.position
            int r2 = r1 + 1
            r4.position = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            int r3 = r2 + 1
            r4.position = r3
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r2 = r3 + 1
            r4.position = r2
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            return r0
    }

    public int readUnsignedIntToInt() {
            r3 = this;
            int r0 = r3.readInt()
            if (r0 < 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Top bit not zero: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0)
            r1.<init>(r0)
            throw r1
    }

    public long readUnsignedLongToLong() {
            r5 = this;
            long r0 = r5.readLong()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto Lb
            return r0
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Top bit not zero: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0)
            r2.<init>(r0)
            throw r2
    }

    public int readUnsignedShort() {
            r4 = this;
            byte[] r0 = r4.data
            int r1 = r4.position
            int r2 = r1 + 1
            r4.position = r2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r3 = r2 + 1
            r4.position = r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            return r0
    }

    public long readUtf8EncodedLong() {
            r12 = this;
            byte[] r0 = r12.data
            int r1 = r12.position
            r0 = r0[r1]
            long r0 = (long) r0
            r2 = 7
            r3 = 7
        L9:
            r4 = 6
            r5 = 1
            if (r3 < 0) goto L25
            int r6 = r5 << r3
            long r7 = (long) r6
            long r7 = r7 & r0
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L22
            if (r3 >= r4) goto L1e
            int r6 = r6 - r5
            long r6 = (long) r6
            long r0 = r0 & r6
            int r2 = r2 - r3
            goto L26
        L1e:
            if (r3 != r2) goto L25
            r2 = 1
            goto L26
        L22:
            int r3 = r3 + (-1)
            goto L9
        L25:
            r2 = 0
        L26:
            if (r2 == 0) goto L51
        L28:
            if (r5 >= r2) goto L4b
            byte[] r3 = r12.data
            int r6 = r12.position
            int r6 = r6 + r5
            r3 = r3[r6]
            r6 = r3 & 192(0xc0, float:2.69E-43)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 != r7) goto L3f
            long r0 = r0 << r4
            r3 = r3 & 63
            long r6 = (long) r3
            long r0 = r0 | r6
            int r5 = r5 + 1
            goto L28
        L3f:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r3 = "Invalid UTF-8 sequence continuation byte: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0)
            r2.<init>(r0)
            throw r2
        L4b:
            int r3 = r12.position
            int r3 = r3 + r2
            r12.position = r3
            return r0
        L51:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r3 = "Invalid UTF-8 sequence first byte: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0)
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.Nullable
    public java.nio.charset.Charset readUtfCharsetFromBom() {
            r6 = this;
            int r0 = r6.bytesLeft()
            r1 = 3
            if (r0 < r1) goto L27
            byte[] r0 = r6.data
            int r2 = r6.position
            r3 = r0[r2]
            r4 = -17
            if (r3 != r4) goto L27
            int r3 = r2 + 1
            r3 = r0[r3]
            r4 = -69
            if (r3 != r4) goto L27
            int r3 = r2 + 2
            r0 = r0[r3]
            r3 = -65
            if (r0 != r3) goto L27
            int r2 = r2 + r1
            r6.position = r2
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_8
            return r0
        L27:
            int r0 = r6.bytesLeft()
            r1 = 2
            if (r0 < r1) goto L54
            byte[] r0 = r6.data
            int r2 = r6.position
            r3 = r0[r2]
            r4 = -1
            r5 = -2
            if (r3 != r5) goto L44
            int r3 = r2 + 1
            r3 = r0[r3]
            if (r3 != r4) goto L44
            int r2 = r2 + r1
            r6.position = r2
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_16BE
            return r0
        L44:
            r3 = r0[r2]
            if (r3 != r4) goto L54
            int r3 = r2 + 1
            r0 = r0[r3]
            if (r0 != r5) goto L54
            int r2 = r2 + r1
            r6.position = r2
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_16LE
            return r0
        L54:
            r0 = 0
            return r0
    }

    public void reset(int r2) {
            r1 = this;
            int r0 = r1.capacity()
            if (r0 >= r2) goto L9
            byte[] r0 = new byte[r2]
            goto Lb
        L9:
            byte[] r0 = r1.data
        Lb:
            r1.reset(r0, r2)
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
            r0.limit = r2
            r1 = 0
            r0.position = r1
            return
    }

    public void setLimit(int r2) {
            r1 = this;
            if (r2 < 0) goto L9
            byte[] r0 = r1.data
            int r0 = r0.length
            if (r2 > r0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r1.limit = r2
            return
    }

    public void setPosition(int r2) {
            r1 = this;
            if (r2 < 0) goto L8
            int r0 = r1.limit
            if (r2 > r0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r1.position = r2
            return
    }

    public void skipBytes(int r2) {
            r1 = this;
            int r0 = r1.position
            int r0 = r0 + r2
            r1.setPosition(r0)
            return
    }
}
