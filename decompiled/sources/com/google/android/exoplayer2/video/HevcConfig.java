package com.google.android.exoplayer2.video;

/* JADX INFO: loaded from: classes2.dex */
public final class HevcConfig {
    private static final int SPS_NAL_UNIT_TYPE = 33;

    @androidx.annotation.Nullable
    public final java.lang.String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final java.util.List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    private HevcConfig(java.util.List<byte[]> r1, int r2, int r3, int r4, float r5, @androidx.annotation.Nullable java.lang.String r6, int r7, int r8, int r9) {
            r0 = this;
            r0.<init>()
            r0.initializationData = r1
            r0.nalUnitLengthFieldLength = r2
            r0.width = r3
            r0.height = r4
            r0.pixelWidthHeightRatio = r5
            r0.codecs = r6
            r0.colorSpace = r7
            r0.colorRange = r8
            r0.colorTransfer = r9
            return
    }

    public static com.google.android.exoplayer2.video.HevcConfig parse(com.google.android.exoplayer2.util.ParsableByteArray r30) throws com.google.android.exoplayer2.ParserException {
            r0 = r30
            r1 = 21
            r0.skipBytes(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            int r1 = r30.readUnsignedByte()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            r1 = r1 & 3
            int r2 = r30.readUnsignedByte()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            int r3 = r30.getPosition()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            r4 = 0
            r5 = 0
            r6 = 0
        L18:
            r7 = 1
            if (r5 >= r2) goto L35
            r0.skipBytes(r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            int r7 = r30.readUnsignedShort()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            r8 = 0
        L23:
            if (r8 >= r7) goto L32
            int r9 = r30.readUnsignedShort()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            int r10 = r9 + 4
            int r6 = r6 + r10
            r0.skipBytes(r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            int r8 = r8 + 1
            goto L23
        L32:
            int r5 = r5 + 1
            goto L18
        L35:
            r0.setPosition(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            byte[] r3 = new byte[r6]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            r5 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r9 = -1
            r16 = r8
            r5 = 0
            r8 = 0
            r13 = -1
            r14 = -1
            r15 = 1065353216(0x3f800000, float:1.0)
            r17 = -1
            r18 = -1
            r19 = -1
        L4c:
            if (r5 >= r2) goto Lde
            int r9 = r30.readUnsignedByte()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            r9 = r9 & 63
            int r10 = r30.readUnsignedShort()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            r11 = 0
        L59:
            if (r11 >= r10) goto Ld6
            int r12 = r30.readUnsignedShort()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            byte[] r7 = com.google.android.exoplayer2.util.NalUnitUtil.NAL_START_CODE     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            r20 = r2
            int r2 = r7.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            java.lang.System.arraycopy(r7, r4, r3, r8, r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            int r2 = r7.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            int r8 = r8 + r2
            byte[] r2 = r30.getData()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            int r7 = r30.getPosition()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            java.lang.System.arraycopy(r2, r7, r3, r8, r12)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            r2 = 33
            if (r9 != r2) goto Lc3
            if (r11 != 0) goto Lc3
            int r2 = r8 + r12
            com.google.android.exoplayer2.util.NalUnitUtil$H265SpsData r2 = com.google.android.exoplayer2.util.NalUnitUtil.parseH265SpsNalUnit(r3, r8, r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            int r13 = r2.width     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            int r14 = r2.height     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            int r7 = r2.colorSpace     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            int r15 = r2.colorRange     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            int r4 = r2.colorTransfer     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            r16 = r4
            float r4 = r2.pixelWidthHeightRatio     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            r17 = r4
            int r4 = r2.generalProfileSpace     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            r18 = r7
            boolean r7 = r2.generalTierFlag     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            r27 = r9
            int r9 = r2.generalProfileIdc     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            r28 = r10
            int r10 = r2.generalProfileCompatibilityFlags     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            r19 = r13
            int[] r13 = r2.constraintBytes     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            int r2 = r2.generalLevelIdc     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            r21 = r4
            r22 = r7
            r23 = r9
            r24 = r10
            r25 = r13
            r26 = r2
            java.lang.String r2 = com.google.android.exoplayer2.util.CodecSpecificDataUtil.buildHevcCodecString(r21, r22, r23, r24, r25, r26)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            r13 = r19
            r19 = r16
            r16 = r2
            r29 = r18
            r18 = r15
            r15 = r17
            r17 = r29
            goto Lc7
        Lc3:
            r27 = r9
            r28 = r10
        Lc7:
            int r8 = r8 + r12
            r0.skipBytes(r12)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            int r11 = r11 + 1
            r2 = r20
            r9 = r27
            r10 = r28
            r4 = 0
            r7 = 1
            goto L59
        Ld6:
            r20 = r2
            int r5 = r5 + 1
            r4 = 0
            r7 = 1
            goto L4c
        Lde:
            if (r6 != 0) goto Le5
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            goto Le9
        Le5:
            java.util.List r0 = java.util.Collections.singletonList(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
        Le9:
            r11 = r0
            com.google.android.exoplayer2.video.HevcConfig r0 = new com.google.android.exoplayer2.video.HevcConfig     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            r2 = 1
            int r12 = r1 + 1
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf4
            return r0
        Lf4:
            r0 = move-exception
            java.lang.String r1 = "Error parsing HEVC config"
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r1, r0)
            throw r0
    }
}
