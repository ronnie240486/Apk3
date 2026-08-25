package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class CodecSpecificDataUtil {
    private static final int EXTENDED_PAR = 15;
    private static final java.lang.String[] HEVC_GENERAL_PROFILE_SPACE_STRINGS = null;
    private static final byte[] NAL_START_CODE = null;
    private static final int RECTANGULAR = 0;
    private static final int VISUAL_OBJECT_LAYER = 1;
    private static final int VISUAL_OBJECT_LAYER_START = 32;

    static {
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [0, 0, 0, 1} // fill-array
            com.google.android.exoplayer2.util.CodecSpecificDataUtil.NAL_START_CODE = r0
            java.lang.String r0 = ""
            java.lang.String r1 = "A"
            java.lang.String r2 = "B"
            java.lang.String r3 = "C"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            com.google.android.exoplayer2.util.CodecSpecificDataUtil.HEVC_GENERAL_PROFILE_SPACE_STRINGS = r0
            return
    }

    private CodecSpecificDataUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String buildAvcCodecString(int r2, int r3, int r4) {
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1 = 0
            r0[r1] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r3 = 1
            r0[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r3 = 2
            r0[r3] = r2
            java.lang.String r2 = "avc1.%02X%02X%02X"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
    }

    public static java.util.List<byte[]> buildCea708InitializationData(boolean r2) {
            r0 = 0
            r1 = 1
            if (r2 == 0) goto L9
            byte[] r2 = new byte[r1]
            r2[r0] = r1
            goto Ld
        L9:
            byte[] r2 = new byte[r1]
            r2[r0] = r0
        Ld:
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
    }

    public static java.lang.String buildHevcCodecString(int r3, boolean r4, int r5, int r6, int[] r7, int r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String[] r2 = com.google.android.exoplayer2.util.CodecSpecificDataUtil.HEVC_GENERAL_PROFILE_SPACE_STRINGS
            r3 = r2[r3]
            r2 = 0
            r1[r2] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r5 = 1
            r1[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r6 = 2
            r1[r6] = r3
            if (r4 == 0) goto L1f
            r3 = 72
            goto L21
        L1f:
            r3 = 76
        L21:
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r4 = 3
            r1[r4] = r3
            r3 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r1[r3] = r4
            java.lang.String r3 = "hvc1.%s%d.%X.%c%d"
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.formatInvariant(r3, r1)
            r0.<init>(r3)
            int r3 = r7.length
        L39:
            if (r3 <= 0) goto L44
            int r4 = r3 + (-1)
            r4 = r7[r4]
            if (r4 != 0) goto L44
            int r3 = r3 + (-1)
            goto L39
        L44:
            r4 = 0
        L45:
            if (r4 >= r3) goto L5d
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r8 = r7[r4]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r2] = r8
            java.lang.String r8 = ".%02X"
            java.lang.String r6 = java.lang.String.format(r8, r6)
            r0.append(r6)
            int r4 = r4 + 1
            goto L45
        L5d:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static byte[] buildNalUnit(byte[] r4, int r5, int r6) {
            byte[] r0 = com.google.android.exoplayer2.util.CodecSpecificDataUtil.NAL_START_CODE
            int r1 = r0.length
            int r1 = r1 + r6
            byte[] r1 = new byte[r1]
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int r0 = r0.length
            java.lang.System.arraycopy(r4, r5, r1, r0, r6)
            return r1
    }

    private static int findNalStartCode(byte[] r2, int r3) {
            int r0 = r2.length
            byte[] r1 = com.google.android.exoplayer2.util.CodecSpecificDataUtil.NAL_START_CODE
            int r1 = r1.length
            int r0 = r0 - r1
        L5:
            if (r3 > r0) goto L11
            boolean r1 = isNalStartCode(r2, r3)
            if (r1 == 0) goto Le
            return r3
        Le:
            int r3 = r3 + 1
            goto L5
        L11:
            r2 = -1
            return r2
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getVideoResolutionFromMpeg4VideoConfig(byte[] r7) {
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>(r7)
            r1 = 0
            r2 = 0
        L7:
            int r3 = r2 + 3
            int r4 = r7.length
            r5 = 2
            r6 = 1
            if (r3 >= r4) goto L2a
            int r4 = r0.readUnsignedInt24()
            if (r4 != r6) goto L1f
            r3 = r7[r3]
            r3 = r3 & 240(0xf0, float:3.36E-43)
            r4 = 32
            if (r3 == r4) goto L1d
            goto L1f
        L1d:
            r0 = 1
            goto L2b
        L1f:
            int r3 = r0.getPosition()
            int r3 = r3 - r5
            r0.setPosition(r3)
            int r2 = r2 + 1
            goto L7
        L2a:
            r0 = 0
        L2b:
            java.lang.String r3 = "Invalid input: VOL not found."
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r3)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = new com.google.android.exoplayer2.util.ParsableBitArray
            r0.<init>(r7)
            r7 = 4
            int r2 = r2 + r7
            r3 = 8
            int r2 = r2 * 8
            r0.skipBits(r2)
            r0.skipBits(r6)
            r0.skipBits(r3)
            boolean r2 = r0.readBit()
            if (r2 == 0) goto L51
            r0.skipBits(r7)
            r2 = 3
            r0.skipBits(r2)
        L51:
            int r7 = r0.readBits(r7)
            r2 = 15
            if (r7 != r2) goto L5f
            r0.skipBits(r3)
            r0.skipBits(r3)
        L5f:
            boolean r7 = r0.readBit()
            if (r7 == 0) goto L76
            r0.skipBits(r5)
            r0.skipBits(r6)
            boolean r7 = r0.readBit()
            if (r7 == 0) goto L76
            r7 = 79
            r0.skipBits(r7)
        L76:
            int r7 = r0.readBits(r5)
            if (r7 != 0) goto L7e
            r7 = 1
            goto L7f
        L7e:
            r7 = 0
        L7f:
            java.lang.String r2 = "Only supports rectangular video object layer shape."
            com.google.android.exoplayer2.util.Assertions.checkArgument(r7, r2)
            boolean r7 = r0.readBit()
            com.google.android.exoplayer2.util.Assertions.checkArgument(r7)
            r7 = 16
            int r7 = r0.readBits(r7)
            boolean r2 = r0.readBit()
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            boolean r2 = r0.readBit()
            if (r2 == 0) goto Lb2
            if (r7 <= 0) goto La2
            r2 = 1
            goto La3
        La2:
            r2 = 0
        La3:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            int r7 = r7 + (-1)
        La8:
            if (r7 <= 0) goto Laf
            int r1 = r1 + 1
            int r7 = r7 >> 1
            goto La8
        Laf:
            r0.skipBits(r1)
        Lb2:
            boolean r7 = r0.readBit()
            com.google.android.exoplayer2.util.Assertions.checkArgument(r7)
            r7 = 13
            int r1 = r0.readBits(r7)
            boolean r2 = r0.readBit()
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            int r7 = r0.readBits(r7)
            boolean r2 = r0.readBit()
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            r0.skipBits(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            android.util.Pair r7 = android.util.Pair.create(r0, r7)
            return r7
    }

    private static boolean isNalStartCode(byte[] r4, int r5) {
            int r0 = r4.length
            int r0 = r0 - r5
            byte[] r1 = com.google.android.exoplayer2.util.CodecSpecificDataUtil.NAL_START_CODE
            int r1 = r1.length
            r2 = 0
            if (r0 > r1) goto L9
            return r2
        L9:
            r0 = 0
        La:
            byte[] r1 = com.google.android.exoplayer2.util.CodecSpecificDataUtil.NAL_START_CODE
            int r3 = r1.length
            if (r0 >= r3) goto L1b
            int r3 = r5 + r0
            r3 = r4[r3]
            r1 = r1[r0]
            if (r3 == r1) goto L18
            return r2
        L18:
            int r0 = r0 + 1
            goto La
        L1b:
            r4 = 1
            return r4
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> parseAlacAudioSpecificConfig(byte[] r2) {
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>(r2)
            r2 = 9
            r0.setPosition(r2)
            int r2 = r0.readUnsignedByte()
            r1 = 20
            r0.setPosition(r1)
            int r0 = r0.readUnsignedIntToInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.util.Pair r2 = android.util.Pair.create(r0, r2)
            return r2
    }

    public static boolean parseCea708InitializationData(java.util.List<byte[]> r3) {
            int r0 = r3.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1c
            java.lang.Object r0 = r3.get(r1)
            byte[] r0 = (byte[]) r0
            int r0 = r0.length
            if (r0 != r2) goto L1c
            java.lang.Object r3 = r3.get(r1)
            byte[] r3 = (byte[]) r3
            r3 = r3[r1]
            if (r3 != r2) goto L1c
            r1 = 1
        L1c:
            return r1
    }

    @androidx.annotation.Nullable
    public static byte[][] splitNalUnits(byte[] r7) {
            r0 = 0
            boolean r1 = isNalStartCode(r7, r0)
            if (r1 != 0) goto L9
            r7 = 0
            return r7
        L9:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        Lf:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.add(r3)
            byte[] r3 = com.google.android.exoplayer2.util.CodecSpecificDataUtil.NAL_START_CODE
            int r3 = r3.length
            int r2 = r2 + r3
            int r2 = findNalStartCode(r7, r2)
            r3 = -1
            if (r2 != r3) goto Lf
            int r2 = r1.size()
            byte[][] r2 = new byte[r2][]
            r3 = 0
        L28:
            int r4 = r1.size()
            if (r3 >= r4) goto L59
            java.lang.Object r4 = r1.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r5 = r1.size()
            int r5 = r5 + (-1)
            if (r3 >= r5) goto L4d
            int r5 = r3 + 1
            java.lang.Object r5 = r1.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L4e
        L4d:
            int r5 = r7.length
        L4e:
            int r5 = r5 - r4
            byte[] r6 = new byte[r5]
            java.lang.System.arraycopy(r7, r4, r6, r0, r5)
            r2[r3] = r6
            int r3 = r3 + 1
            goto L28
        L59:
            return r2
    }
}
