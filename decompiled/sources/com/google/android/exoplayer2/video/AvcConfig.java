package com.google.android.exoplayer2.video;

/* JADX INFO: loaded from: classes2.dex */
public final class AvcConfig {

    @androidx.annotation.Nullable
    public final java.lang.String codecs;
    public final int height;
    public final java.util.List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    private AvcConfig(java.util.List<byte[]> r1, int r2, int r3, int r4, float r5, @androidx.annotation.Nullable java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.initializationData = r1
            r0.nalUnitLengthFieldLength = r2
            r0.width = r3
            r0.height = r4
            r0.pixelWidthHeightRatio = r5
            r0.codecs = r6
            return
    }

    private static byte[] buildNalUnitForChild(com.google.android.exoplayer2.util.ParsableByteArray r2) {
            int r0 = r2.readUnsignedShort()
            int r1 = r2.getPosition()
            r2.skipBytes(r0)
            byte[] r2 = r2.getData()
            byte[] r2 = com.google.android.exoplayer2.util.CodecSpecificDataUtil.buildNalUnit(r2, r1, r0)
            return r2
    }

    public static com.google.android.exoplayer2.video.AvcConfig parse(com.google.android.exoplayer2.util.ParsableByteArray r9) throws com.google.android.exoplayer2.ParserException {
            r0 = 4
            r9.skipBytes(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            int r0 = r9.readUnsignedByte()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            r1 = 3
            r0 = r0 & r1
            int r4 = r0 + 1
            if (r4 == r1) goto L6f
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            r3.<init>()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            int r0 = r9.readUnsignedByte()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            r0 = r0 & 31
            r1 = 0
            r2 = 0
        L1b:
            if (r2 >= r0) goto L27
            byte[] r5 = buildNalUnitForChild(r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            r3.add(r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            int r2 = r2 + 1
            goto L1b
        L27:
            int r2 = r9.readUnsignedByte()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            r5 = 0
        L2c:
            if (r5 >= r2) goto L38
            byte[] r6 = buildNalUnitForChild(r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            r3.add(r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            int r5 = r5 + 1
            goto L2c
        L38:
            r9 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r5 = -1
            if (r0 <= 0) goto L64
            java.lang.Object r9 = r3.get(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            byte[] r9 = (byte[]) r9     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            java.lang.Object r0 = r3.get(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            byte[] r0 = (byte[]) r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            int r9 = r9.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            com.google.android.exoplayer2.util.NalUnitUtil$SpsData r9 = com.google.android.exoplayer2.util.NalUnitUtil.parseSpsNalUnit(r0, r4, r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            int r0 = r9.width     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            int r1 = r9.height     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            float r2 = r9.pixelWidthHeightRatio     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            int r5 = r9.profileIdc     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            int r6 = r9.constraintsFlagsAndReservedZero2Bits     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            int r9 = r9.levelIdc     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            java.lang.String r9 = com.google.android.exoplayer2.util.CodecSpecificDataUtil.buildAvcCodecString(r5, r6, r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            r8 = r9
            r5 = r0
            r6 = r1
            r7 = r2
            goto L68
        L64:
            r8 = r2
            r6 = -1
            r7 = 1065353216(0x3f800000, float:1.0)
        L68:
            com.google.android.exoplayer2.video.AvcConfig r9 = new com.google.android.exoplayer2.video.AvcConfig     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            return r9
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            r9.<init>()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
            throw r9     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L75
        L75:
            r9 = move-exception
            java.lang.String r0 = "Error parsing AVC config"
            com.google.android.exoplayer2.ParserException r9 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r9)
            throw r9
    }
}
