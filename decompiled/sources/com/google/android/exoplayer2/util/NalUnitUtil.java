package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class NalUnitUtil {
    public static final float[] ASPECT_RATIO_IDC_VALUES = null;
    public static final int EXTENDED_SAR = 255;
    private static final int H264_NAL_UNIT_TYPE_SEI = 6;
    private static final int H264_NAL_UNIT_TYPE_SPS = 7;
    private static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    public static final byte[] NAL_START_CODE = null;
    public static final int NAL_UNIT_TYPE_AUD = 9;
    public static final int NAL_UNIT_TYPE_IDR = 5;
    public static final int NAL_UNIT_TYPE_NON_IDR = 1;
    public static final int NAL_UNIT_TYPE_PARTITION_A = 2;
    public static final int NAL_UNIT_TYPE_PPS = 8;
    public static final int NAL_UNIT_TYPE_SEI = 6;
    public static final int NAL_UNIT_TYPE_SPS = 7;
    private static final java.lang.String TAG = "NalUnitUtil";
    private static int[] scratchEscapePositions;
    private static final java.lang.Object scratchEscapePositionsLock = null;

    /* JADX INFO: loaded from: classes.dex */
    public static final class H265SpsData {
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int[] constraintBytes;
        public final int generalLevelIdc;
        public final int generalProfileCompatibilityFlags;
        public final int generalProfileIdc;
        public final int generalProfileSpace;
        public final boolean generalTierFlag;
        public final int height;
        public final float pixelWidthHeightRatio;
        public final int seqParameterSetId;
        public final int width;

        public H265SpsData(int r1, boolean r2, int r3, int r4, int[] r5, int r6, int r7, int r8, int r9, float r10, int r11, int r12, int r13) {
                r0 = this;
                r0.<init>()
                r0.generalProfileSpace = r1
                r0.generalTierFlag = r2
                r0.generalProfileIdc = r3
                r0.generalProfileCompatibilityFlags = r4
                r0.constraintBytes = r5
                r0.generalLevelIdc = r6
                r0.seqParameterSetId = r7
                r0.width = r8
                r0.height = r9
                r0.pixelWidthHeightRatio = r10
                r0.colorSpace = r11
                r0.colorRange = r12
                r0.colorTransfer = r13
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.picParameterSetId = r1
                r0.seqParameterSetId = r2
                r0.bottomFieldPicOrderInFramePresentFlag = r3
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SpsData {
        public final int constraintsFlagsAndReservedZero2Bits;
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int levelIdc;
        public final int maxNumRefFrames;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthHeightRatio;
        public final int profileIdc;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int r1, int r2, int r3, int r4, int r5, int r6, int r7, float r8, boolean r9, boolean r10, int r11, int r12, int r13, boolean r14) {
                r0 = this;
                r0.<init>()
                r0.profileIdc = r1
                r0.constraintsFlagsAndReservedZero2Bits = r2
                r0.levelIdc = r3
                r0.seqParameterSetId = r4
                r0.maxNumRefFrames = r5
                r0.width = r6
                r0.height = r7
                r0.pixelWidthHeightRatio = r8
                r0.separateColorPlaneFlag = r9
                r0.frameMbsOnlyFlag = r10
                r0.frameNumLength = r11
                r0.picOrderCountType = r12
                r0.picOrderCntLsbLength = r13
                r0.deltaPicOrderAlwaysZeroFlag = r14
                return
        }
    }

    static {
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [0, 0, 0, 1} // fill-array
            com.google.android.exoplayer2.util.NalUnitUtil.NAL_START_CODE = r0
            r0 = 17
            float[] r0 = new float[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [1065353216, 1065353216, 1066115817, 1063828015, 1069166220, 1067132618, 1074504425, 1072216623, 1077554828, 1075521226, 1070691421, 1068403619, 1073233424, 1070521954, 1068149419, 1069547520, 1073741824} // fill-array
            com.google.android.exoplayer2.util.NalUnitUtil.ASPECT_RATIO_IDC_VALUES = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.exoplayer2.util.NalUnitUtil.scratchEscapePositionsLock = r0
            r0 = 10
            int[] r0 = new int[r0]
            com.google.android.exoplayer2.util.NalUnitUtil.scratchEscapePositions = r0
            return
    }

    private NalUnitUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void clearPrefixFlags(boolean[] r2) {
            r0 = 0
            r2[r0] = r0
            r1 = 1
            r2[r1] = r0
            r1 = 2
            r2[r1] = r0
            return
    }

    public static void discardToSps(java.nio.ByteBuffer r9) {
            int r0 = r9.position()
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            int r4 = r2 + 1
            if (r4 >= r0) goto L3b
            byte r5 = r9.get(r2)
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 3
            if (r3 != r6) goto L32
            r7 = 1
            if (r5 != r7) goto L36
            byte r7 = r9.get(r4)
            r7 = r7 & 31
            r8 = 7
            if (r7 != r8) goto L36
            java.nio.ByteBuffer r3 = r9.duplicate()
            int r2 = r2 - r6
            r3.position(r2)
            r3.limit(r0)
            r9.position(r1)
            r9.put(r3)
            return
        L32:
            if (r5 != 0) goto L36
            int r3 = r3 + 1
        L36:
            if (r5 == 0) goto L39
            r3 = 0
        L39:
            r2 = r4
            goto L7
        L3b:
            r9.clear()
            return
    }

    public static int findNalUnit(byte[] r7, int r8, int r9, boolean[] r10) {
            int r0 = r9 - r8
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            com.google.android.exoplayer2.util.Assertions.checkState(r3)
            if (r0 != 0) goto Lf
            return r9
        Lf:
            boolean r3 = r10[r1]
            if (r3 == 0) goto L19
            clearPrefixFlags(r10)
            int r8 = r8 + (-3)
            return r8
        L19:
            r3 = 2
            if (r0 <= r2) goto L29
            boolean r4 = r10[r2]
            if (r4 == 0) goto L29
            r4 = r7[r8]
            if (r4 != r2) goto L29
            clearPrefixFlags(r10)
            int r8 = r8 - r3
            return r8
        L29:
            if (r0 <= r3) goto L3e
            boolean r4 = r10[r3]
            if (r4 == 0) goto L3e
            r4 = r7[r8]
            if (r4 != 0) goto L3e
            int r4 = r8 + 1
            r4 = r7[r4]
            if (r4 != r2) goto L3e
            clearPrefixFlags(r10)
            int r8 = r8 - r2
            return r8
        L3e:
            int r4 = r9 + (-1)
            int r8 = r8 + r3
        L41:
            if (r8 >= r4) goto L63
            r5 = r7[r8]
            r5 = r5 & 254(0xfe, float:3.56E-43)
            if (r5 == 0) goto L4a
            goto L60
        L4a:
            int r5 = r8 + (-2)
            r6 = r7[r5]
            if (r6 != 0) goto L5e
            int r6 = r8 + (-1)
            r6 = r7[r6]
            if (r6 != 0) goto L5e
            r6 = r7[r8]
            if (r6 != r2) goto L5e
            clearPrefixFlags(r10)
            return r5
        L5e:
            int r8 = r8 + (-2)
        L60:
            int r8 = r8 + 3
            goto L41
        L63:
            if (r0 <= r3) goto L78
            int r8 = r9 + (-3)
            r8 = r7[r8]
            if (r8 != 0) goto L76
            int r8 = r9 + (-2)
            r8 = r7[r8]
            if (r8 != 0) goto L76
            r8 = r7[r4]
            if (r8 != r2) goto L76
            goto L91
        L76:
            r8 = 0
            goto L92
        L78:
            if (r0 != r3) goto L89
            boolean r8 = r10[r3]
            if (r8 == 0) goto L76
            int r8 = r9 + (-2)
            r8 = r7[r8]
            if (r8 != 0) goto L76
            r8 = r7[r4]
            if (r8 != r2) goto L76
            goto L91
        L89:
            boolean r8 = r10[r2]
            if (r8 == 0) goto L76
            r8 = r7[r4]
            if (r8 != r2) goto L76
        L91:
            r8 = 1
        L92:
            r10[r1] = r8
            if (r0 <= r2) goto La1
            int r8 = r9 + (-2)
            r8 = r7[r8]
            if (r8 != 0) goto Lab
            r8 = r7[r4]
            if (r8 != 0) goto Lab
            goto La9
        La1:
            boolean r8 = r10[r3]
            if (r8 == 0) goto Lab
            r8 = r7[r4]
            if (r8 != 0) goto Lab
        La9:
            r8 = 1
            goto Lac
        Lab:
            r8 = 0
        Lac:
            r10[r2] = r8
            r7 = r7[r4]
            if (r7 != 0) goto Lb3
            r1 = 1
        Lb3:
            r10[r3] = r1
            return r9
    }

    private static int findNextUnescapeIndex(byte[] r2, int r3, int r4) {
        L0:
            int r0 = r4 + (-2)
            if (r3 >= r0) goto L19
            r0 = r2[r3]
            if (r0 != 0) goto L16
            int r0 = r3 + 1
            r0 = r2[r0]
            if (r0 != 0) goto L16
            int r0 = r3 + 2
            r0 = r2[r0]
            r1 = 3
            if (r0 != r1) goto L16
            return r3
        L16:
            int r3 = r3 + 1
            goto L0
        L19:
            return r4
    }

    public static int getH265NalUnitType(byte[] r0, int r1) {
            int r1 = r1 + 3
            r0 = r0[r1]
            r0 = r0 & 126(0x7e, float:1.77E-43)
            int r0 = r0 >> 1
            return r0
    }

    public static int getNalUnitType(byte[] r0, int r1) {
            int r1 = r1 + 3
            r0 = r0[r1]
            r0 = r0 & 31
            return r0
    }

    public static boolean isNalUnitSei(@androidx.annotation.Nullable java.lang.String r3, byte r4) {
            java.lang.String r0 = "video/avc"
            boolean r0 = r0.equals(r3)
            r1 = 1
            if (r0 == 0) goto Lf
            r0 = r4 & 31
            r2 = 6
            if (r0 == r2) goto L21
        Lf:
            java.lang.String r0 = "video/hevc"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L20
            r3 = r4 & 126(0x7e, float:1.77E-43)
            int r3 = r3 >> r1
            r4 = 39
            if (r3 != r4) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    public static com.google.android.exoplayer2.util.NalUnitUtil.H265SpsData parseH265SpsNalUnit(byte[] r0, int r1, int r2) {
            int r1 = r1 + 2
            com.google.android.exoplayer2.util.NalUnitUtil$H265SpsData r0 = parseH265SpsNalUnitPayload(r0, r1, r2)
            return r0
    }

    public static com.google.android.exoplayer2.util.NalUnitUtil.H265SpsData parseH265SpsNalUnitPayload(byte[] r21, int r22, int r23) {
            com.google.android.exoplayer2.util.ParsableNalUnitBitArray r0 = new com.google.android.exoplayer2.util.ParsableNalUnitBitArray
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3)
            r1 = 4
            r0.skipBits(r1)
            r1 = 3
            int r2 = r0.readBits(r1)
            r0.skipBit()
            r3 = 2
            int r5 = r0.readBits(r3)
            boolean r6 = r0.readBit()
            r4 = 5
            int r7 = r0.readBits(r4)
            r4 = 0
            r8 = 0
            r9 = 0
        L28:
            r4 = 32
            r10 = 1
            if (r8 >= r4) goto L39
            boolean r4 = r0.readBit()
            if (r4 == 0) goto L36
            int r4 = r10 << r8
            r9 = r9 | r4
        L36:
            int r8 = r8 + 1
            goto L28
        L39:
            r4 = 6
            int[] r11 = new int[r4]
            r8 = 0
        L3d:
            r12 = 8
            if (r8 >= r4) goto L4a
            int r12 = r0.readBits(r12)
            r11[r8] = r12
            int r8 = r8 + 1
            goto L3d
        L4a:
            int r13 = r0.readBits(r12)
            r4 = 0
            r8 = 0
        L50:
            if (r4 >= r2) goto L65
            boolean r14 = r0.readBit()
            if (r14 == 0) goto L5a
            int r8 = r8 + 89
        L5a:
            boolean r14 = r0.readBit()
            if (r14 == 0) goto L62
            int r8 = r8 + 8
        L62:
            int r4 = r4 + 1
            goto L50
        L65:
            r0.skipBits(r8)
            if (r2 <= 0) goto L71
            int r4 = 8 - r2
            int r4 = r4 * 2
            r0.skipBits(r4)
        L71:
            int r14 = r0.readUnsignedExpGolombCodedInt()
            int r4 = r0.readUnsignedExpGolombCodedInt()
            if (r4 != r1) goto L7e
            r0.skipBit()
        L7e:
            int r8 = r0.readUnsignedExpGolombCodedInt()
            int r15 = r0.readUnsignedExpGolombCodedInt()
            boolean r16 = r0.readBit()
            if (r16 == 0) goto Lb7
            int r16 = r0.readUnsignedExpGolombCodedInt()
            int r17 = r0.readUnsignedExpGolombCodedInt()
            int r18 = r0.readUnsignedExpGolombCodedInt()
            int r19 = r0.readUnsignedExpGolombCodedInt()
            if (r4 == r10) goto La4
            if (r4 != r3) goto La1
            goto La4
        La1:
            r20 = 1
            goto La6
        La4:
            r20 = 2
        La6:
            if (r4 != r10) goto Laa
            r4 = 2
            goto Lab
        Laa:
            r4 = 1
        Lab:
            int r16 = r16 + r17
            int r16 = r16 * r20
            int r8 = r8 - r16
            int r18 = r18 + r19
            int r18 = r18 * r4
            int r15 = r15 - r18
        Lb7:
            r4 = r15
            r15 = r8
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            int r8 = r0.readUnsignedExpGolombCodedInt()
            boolean r16 = r0.readBit()
            if (r16 == 0) goto Lcc
            r16 = 0
            goto Lce
        Lcc:
            r16 = r2
        Lce:
            r1 = r16
        Ld0:
            if (r1 > r2) goto Lde
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            int r1 = r1 + 1
            goto Ld0
        Lde:
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            boolean r1 = r0.readBit()
            if (r1 == 0) goto Lff
            boolean r1 = r0.readBit()
            if (r1 == 0) goto Lff
            skipH265ScalingList(r0)
        Lff:
            r0.skipBits(r3)
            boolean r1 = r0.readBit()
            if (r1 == 0) goto L114
            r0.skipBits(r12)
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            r0.skipBit()
        L114:
            skipShortTermReferencePictureSets(r0)
            boolean r1 = r0.readBit()
            if (r1 == 0) goto L12d
            r1 = 0
        L11e:
            int r2 = r0.readUnsignedExpGolombCodedInt()
            if (r1 >= r2) goto L12d
            int r2 = r8 + 4
            int r2 = r2 + r10
            r0.skipBits(r2)
            int r1 = r1 + 1
            goto L11e
        L12d:
            r0.skipBits(r3)
            boolean r1 = r0.readBit()
            r2 = -1
            if (r1 == 0) goto L1bc
            boolean r1 = r0.readBit()
            if (r1 == 0) goto L166
            int r1 = r0.readBits(r12)
            r8 = 255(0xff, float:3.57E-43)
            if (r1 != r8) goto L157
            r1 = 16
            int r8 = r0.readBits(r1)
            int r1 = r0.readBits(r1)
            if (r8 == 0) goto L166
            if (r1 == 0) goto L166
            float r8 = (float) r8
            float r1 = (float) r1
            float r8 = r8 / r1
            goto L168
        L157:
            float[] r8 = com.google.android.exoplayer2.util.NalUnitUtil.ASPECT_RATIO_IDC_VALUES
            int r10 = r8.length
            if (r1 >= r10) goto L15f
            r8 = r8[r1]
            goto L168
        L15f:
            java.lang.String r8 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r10 = "NalUnitUtil"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r8, r1, r10)
        L166:
            r8 = 1065353216(0x3f800000, float:1.0)
        L168:
            boolean r1 = r0.readBit()
            if (r1 == 0) goto L171
            r0.skipBit()
        L171:
            boolean r1 = r0.readBit()
            if (r1 == 0) goto L19c
            r1 = 3
            r0.skipBits(r1)
            boolean r1 = r0.readBit()
            boolean r10 = r0.readBit()
            if (r10 == 0) goto L19c
            int r2 = r0.readBits(r12)
            int r10 = r0.readBits(r12)
            r0.skipBits(r12)
            int r2 = com.google.android.exoplayer2.video.ColorInfo.isoColorPrimariesToColorSpace(r2)
            if (r1 == 0) goto L197
            r3 = 1
        L197:
            int r1 = com.google.android.exoplayer2.video.ColorInfo.isoTransferCharacteristicsToColorTransfer(r10)
            goto L19e
        L19c:
            r1 = -1
            r3 = -1
        L19e:
            boolean r10 = r0.readBit()
            if (r10 == 0) goto L1aa
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
        L1aa:
            r0.skipBit()
            boolean r0 = r0.readBit()
            if (r0 == 0) goto L1b5
            int r4 = r4 * 2
        L1b5:
            r17 = r1
            r16 = r3
            r0 = r4
            r1 = r8
            goto L1c7
        L1bc:
            r0 = -1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = -1
            r3 = -1
            r0 = r4
            r2 = -1
            r16 = -1
            r17 = -1
        L1c7:
            com.google.android.exoplayer2.util.NalUnitUtil$H265SpsData r3 = new com.google.android.exoplayer2.util.NalUnitUtil$H265SpsData
            r4 = r3
            r8 = r9
            r9 = r11
            r10 = r13
            r11 = r14
            r12 = r15
            r13 = r0
            r14 = r1
            r15 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r3
    }

    public static com.google.android.exoplayer2.util.NalUnitUtil.PpsData parsePpsNalUnit(byte[] r0, int r1, int r2) {
            int r1 = r1 + 1
            com.google.android.exoplayer2.util.NalUnitUtil$PpsData r0 = parsePpsNalUnitPayload(r0, r1, r2)
            return r0
    }

    public static com.google.android.exoplayer2.util.NalUnitUtil.PpsData parsePpsNalUnitPayload(byte[] r1, int r2, int r3) {
            com.google.android.exoplayer2.util.ParsableNalUnitBitArray r0 = new com.google.android.exoplayer2.util.ParsableNalUnitBitArray
            r0.<init>(r1, r2, r3)
            int r1 = r0.readUnsignedExpGolombCodedInt()
            int r2 = r0.readUnsignedExpGolombCodedInt()
            r0.skipBit()
            boolean r3 = r0.readBit()
            com.google.android.exoplayer2.util.NalUnitUtil$PpsData r0 = new com.google.android.exoplayer2.util.NalUnitUtil$PpsData
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.google.android.exoplayer2.util.NalUnitUtil.SpsData parseSpsNalUnit(byte[] r0, int r1, int r2) {
            int r1 = r1 + 1
            com.google.android.exoplayer2.util.NalUnitUtil$SpsData r0 = parseSpsNalUnitPayload(r0, r1, r2)
            return r0
    }

    public static com.google.android.exoplayer2.util.NalUnitUtil.SpsData parseSpsNalUnitPayload(byte[] r20, int r21, int r22) {
            com.google.android.exoplayer2.util.ParsableNalUnitBitArray r0 = new com.google.android.exoplayer2.util.ParsableNalUnitBitArray
            r1 = r20
            r2 = r21
            r3 = r22
            r0.<init>(r1, r2, r3)
            r1 = 8
            int r3 = r0.readBits(r1)
            int r4 = r0.readBits(r1)
            int r5 = r0.readBits(r1)
            int r6 = r0.readUnsignedExpGolombCodedInt()
            r1 = 3
            r2 = 1
            r7 = 100
            if (r3 == r7) goto L4c
            r7 = 110(0x6e, float:1.54E-43)
            if (r3 == r7) goto L4c
            r7 = 122(0x7a, float:1.71E-43)
            if (r3 == r7) goto L4c
            r7 = 244(0xf4, float:3.42E-43)
            if (r3 == r7) goto L4c
            r7 = 44
            if (r3 == r7) goto L4c
            r7 = 83
            if (r3 == r7) goto L4c
            r7 = 86
            if (r3 == r7) goto L4c
            r7 = 118(0x76, float:1.65E-43)
            if (r3 == r7) goto L4c
            r7 = 128(0x80, float:1.8E-43)
            if (r3 == r7) goto L4c
            r7 = 138(0x8a, float:1.93E-43)
            if (r3 != r7) goto L48
            goto L4c
        L48:
            r1 = 1
            r7 = 0
            r11 = 0
            goto L87
        L4c:
            int r7 = r0.readUnsignedExpGolombCodedInt()
            if (r7 != r1) goto L57
            boolean r8 = r0.readBit()
            goto L58
        L57:
            r8 = 0
        L58:
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            r0.skipBit()
            boolean r9 = r0.readBit()
            if (r9 == 0) goto L85
            if (r7 == r1) goto L6c
            r1 = 8
            goto L6e
        L6c:
            r1 = 12
        L6e:
            r9 = 0
        L6f:
            if (r9 >= r1) goto L85
            boolean r10 = r0.readBit()
            if (r10 == 0) goto L82
            r10 = 6
            if (r9 >= r10) goto L7d
            r10 = 16
            goto L7f
        L7d:
            r10 = 64
        L7f:
            skipScalingList(r0, r10)
        L82:
            int r9 = r9 + 1
            goto L6f
        L85:
            r1 = r7
            r11 = r8
        L87:
            int r7 = r0.readUnsignedExpGolombCodedInt()
            int r13 = r7 + 4
            int r14 = r0.readUnsignedExpGolombCodedInt()
            if (r14 != 0) goto L9c
            int r7 = r0.readUnsignedExpGolombCodedInt()
            int r7 = r7 + 4
            r20 = r3
            goto Lc3
        L9c:
            if (r14 != r2) goto Lc0
            boolean r7 = r0.readBit()
            r0.readSignedExpGolombCodedInt()
            r0.readSignedExpGolombCodedInt()
            int r8 = r0.readUnsignedExpGolombCodedInt()
            long r8 = (long) r8
            r10 = 0
            r20 = r3
        Lb0:
            long r2 = (long) r10
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 >= 0) goto Lbb
            r0.readUnsignedExpGolombCodedInt()
            int r10 = r10 + 1
            goto Lb0
        Lbb:
            r2 = 0
            r16 = r7
            r15 = 0
            goto Lc7
        Lc0:
            r20 = r3
            r7 = 0
        Lc3:
            r2 = 0
            r15 = r7
            r16 = 0
        Lc7:
            int r7 = r0.readUnsignedExpGolombCodedInt()
            r0.skipBit()
            int r2 = r0.readUnsignedExpGolombCodedInt()
            r3 = 1
            int r2 = r2 + r3
            int r8 = r0.readUnsignedExpGolombCodedInt()
            int r8 = r8 + r3
            boolean r12 = r0.readBit()
            int r9 = 2 - r12
            int r9 = r9 * r8
            if (r12 != 0) goto Le6
            r0.skipBit()
        Le6:
            r0.skipBit()
            int r2 = r2 * 16
            int r9 = r9 * 16
            boolean r8 = r0.readBit()
            if (r8 == 0) goto L125
            int r8 = r0.readUnsignedExpGolombCodedInt()
            int r10 = r0.readUnsignedExpGolombCodedInt()
            int r17 = r0.readUnsignedExpGolombCodedInt()
            int r18 = r0.readUnsignedExpGolombCodedInt()
            if (r1 != 0) goto L108
            int r1 = 2 - r12
            goto L11b
        L108:
            r3 = 3
            if (r1 != r3) goto L10f
            r3 = 1
            r19 = 1
            goto L112
        L10f:
            r3 = 1
            r19 = 2
        L112:
            if (r1 != r3) goto L115
            r3 = 2
        L115:
            int r1 = 2 - r12
            int r1 = r1 * r3
            r3 = r19
        L11b:
            int r8 = r8 + r10
            int r8 = r8 * r3
            int r2 = r2 - r8
            int r17 = r17 + r18
            int r17 = r17 * r1
            int r9 = r9 - r17
        L125:
            r8 = r2
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r0.readBit()
            if (r2 == 0) goto L161
            boolean r2 = r0.readBit()
            if (r2 == 0) goto L161
            r2 = 8
            int r2 = r0.readBits(r2)
            r3 = 255(0xff, float:3.57E-43)
            if (r2 != r3) goto L151
            r2 = 16
            int r3 = r0.readBits(r2)
            int r0 = r0.readBits(r2)
            if (r3 == 0) goto L14f
            if (r0 == 0) goto L14f
            float r1 = (float) r3
            float r0 = (float) r0
            float r1 = r1 / r0
        L14f:
            r10 = r1
            goto L165
        L151:
            float[] r0 = com.google.android.exoplayer2.util.NalUnitUtil.ASPECT_RATIO_IDC_VALUES
            int r1 = r0.length
            if (r2 >= r1) goto L15a
            r0 = r0[r2]
            r10 = r0
            goto L165
        L15a:
            java.lang.String r0 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r1 = "NalUnitUtil"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r0, r2, r1)
        L161:
            r0 = 1065353216(0x3f800000, float:1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
        L165:
            com.google.android.exoplayer2.util.NalUnitUtil$SpsData r0 = new com.google.android.exoplayer2.util.NalUnitUtil$SpsData
            r2 = r0
            r3 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
    }

    private static void skipH265ScalingList(com.google.android.exoplayer2.util.ParsableNalUnitBitArray r7) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 4
            if (r1 >= r2) goto L36
            r3 = 0
        L6:
            r4 = 6
            if (r3 >= r4) goto L33
            boolean r4 = r7.readBit()
            r5 = 1
            if (r4 != 0) goto L14
            r7.readUnsignedExpGolombCodedInt()
            goto L2d
        L14:
            r4 = 64
            int r6 = r1 << 1
            int r6 = r6 + r2
            int r6 = r5 << r6
            int r4 = java.lang.Math.min(r4, r6)
            if (r1 <= r5) goto L24
            r7.readSignedExpGolombCodedInt()
        L24:
            r6 = 0
        L25:
            if (r6 >= r4) goto L2d
            r7.readSignedExpGolombCodedInt()
            int r6 = r6 + 1
            goto L25
        L2d:
            r4 = 3
            if (r1 != r4) goto L31
            r5 = 3
        L31:
            int r3 = r3 + r5
            goto L6
        L33:
            int r1 = r1 + 1
            goto L2
        L36:
            return
    }

    private static void skipScalingList(com.google.android.exoplayer2.util.ParsableNalUnitBitArray r3, int r4) {
            r0 = 8
            r1 = 0
            r1 = 8
            r2 = 0
        L6:
            if (r2 >= r4) goto L1a
            if (r0 == 0) goto L13
            int r0 = r3.readSignedExpGolombCodedInt()
            int r0 = r0 + r1
            int r0 = r0 + 256
            int r0 = r0 % 256
        L13:
            if (r0 != 0) goto L16
            goto L17
        L16:
            r1 = r0
        L17:
            int r2 = r2 + 1
            goto L6
        L1a:
            return
    }

    private static void skipShortTermReferencePictureSets(com.google.android.exoplayer2.util.ParsableNalUnitBitArray r19) {
            int r0 = r19.readUnsignedExpGolombCodedInt()
            r1 = 0
            int[] r2 = new int[r1]
            int[] r3 = new int[r1]
            r4 = -1
            r5 = -1
            r6 = 0
        Lc:
            if (r6 >= r0) goto L100
            r7 = 1
            if (r6 == 0) goto L19
            boolean r8 = r19.readBit()
            if (r8 == 0) goto L19
            r8 = 1
            goto L1a
        L19:
            r8 = 0
        L1a:
            if (r8 == 0) goto Lc6
            int r8 = r4 + r5
            boolean r9 = r19.readBit()
            int r10 = r19.readUnsignedExpGolombCodedInt()
            int r10 = r10 + r7
            int r9 = r9 * 2
            int r9 = 1 - r9
            int r9 = r9 * r10
            int r10 = r8 + 1
            boolean[] r11 = new boolean[r10]
            r12 = 0
        L32:
            if (r12 > r8) goto L46
            boolean r13 = r19.readBit()
            if (r13 != 0) goto L41
            boolean r13 = r19.readBit()
            r11[r12] = r13
            goto L43
        L41:
            r11[r12] = r7
        L43:
            int r12 = r12 + 1
            goto L32
        L46:
            int[] r7 = new int[r10]
            int[] r10 = new int[r10]
            int r12 = r5 + (-1)
            r13 = 0
        L4d:
            if (r12 < 0) goto L62
            r14 = r3[r12]
            int r14 = r14 + r9
            if (r14 >= 0) goto L5f
            int r15 = r4 + r12
            boolean r15 = r11[r15]
            if (r15 == 0) goto L5f
            int r15 = r13 + 1
            r7[r13] = r14
            r13 = r15
        L5f:
            int r12 = r12 + (-1)
            goto L4d
        L62:
            if (r9 >= 0) goto L6d
            boolean r12 = r11[r8]
            if (r12 == 0) goto L6d
            int r12 = r13 + 1
            r7[r13] = r9
            r13 = r12
        L6d:
            r12 = 0
        L6e:
            if (r12 >= r4) goto L81
            r14 = r2[r12]
            int r14 = r14 + r9
            if (r14 >= 0) goto L7e
            boolean r15 = r11[r12]
            if (r15 == 0) goto L7e
            int r15 = r13 + 1
            r7[r13] = r14
            r13 = r15
        L7e:
            int r12 = r12 + 1
            goto L6e
        L81:
            int[] r7 = java.util.Arrays.copyOf(r7, r13)
            int r12 = r4 + (-1)
            r14 = 0
        L88:
            if (r12 < 0) goto L9c
            r15 = r2[r12]
            int r15 = r15 + r9
            if (r15 <= 0) goto L99
            boolean r16 = r11[r12]
            if (r16 == 0) goto L99
            int r16 = r14 + 1
            r10[r14] = r15
            r14 = r16
        L99:
            int r12 = r12 + (-1)
            goto L88
        L9c:
            if (r9 <= 0) goto La7
            boolean r2 = r11[r8]
            if (r2 == 0) goto La7
            int r2 = r14 + 1
            r10[r14] = r9
            r14 = r2
        La7:
            r2 = 0
        La8:
            if (r2 >= r5) goto Lbd
            r8 = r3[r2]
            int r8 = r8 + r9
            if (r8 <= 0) goto Lba
            int r12 = r4 + r2
            boolean r12 = r11[r12]
            if (r12 == 0) goto Lba
            int r12 = r14 + 1
            r10[r14] = r8
            r14 = r12
        Lba:
            int r2 = r2 + 1
            goto La8
        Lbd:
            int[] r2 = java.util.Arrays.copyOf(r10, r14)
            r3 = r2
            r2 = r7
            r4 = r13
            r5 = r14
            goto Lfc
        Lc6:
            int r2 = r19.readUnsignedExpGolombCodedInt()
            int r3 = r19.readUnsignedExpGolombCodedInt()
            int[] r4 = new int[r2]
            r5 = 0
        Ld1:
            if (r5 >= r2) goto Le0
            int r8 = r19.readUnsignedExpGolombCodedInt()
            int r8 = r8 + r7
            r4[r5] = r8
            r19.skipBit()
            int r5 = r5 + 1
            goto Ld1
        Le0:
            int[] r5 = new int[r3]
            r8 = 0
        Le3:
            if (r8 >= r3) goto Lf2
            int r9 = r19.readUnsignedExpGolombCodedInt()
            int r9 = r9 + r7
            r5[r8] = r9
            r19.skipBit()
            int r8 = r8 + 1
            goto Le3
        Lf2:
            r17 = r4
            r4 = r2
            r2 = r17
            r18 = r5
            r5 = r3
            r3 = r18
        Lfc:
            int r6 = r6 + 1
            goto Lc
        L100:
            return
    }

    public static int unescapeStream(byte[] r8, int r9) {
            java.lang.Object r0 = com.google.android.exoplayer2.util.NalUnitUtil.scratchEscapePositionsLock
            monitor-enter(r0)
            r1 = 0
            r2 = 0
            r3 = 0
        L6:
            if (r2 >= r9) goto L28
            int r2 = findNextUnescapeIndex(r8, r2, r9)     // Catch: java.lang.Throwable -> L26
            if (r2 >= r9) goto L6
            int[] r4 = com.google.android.exoplayer2.util.NalUnitUtil.scratchEscapePositions     // Catch: java.lang.Throwable -> L26
            int r5 = r4.length     // Catch: java.lang.Throwable -> L26
            if (r5 > r3) goto L1c
            int r5 = r4.length     // Catch: java.lang.Throwable -> L26
            int r5 = r5 * 2
            int[] r4 = java.util.Arrays.copyOf(r4, r5)     // Catch: java.lang.Throwable -> L26
            com.google.android.exoplayer2.util.NalUnitUtil.scratchEscapePositions = r4     // Catch: java.lang.Throwable -> L26
        L1c:
            int[] r4 = com.google.android.exoplayer2.util.NalUnitUtil.scratchEscapePositions     // Catch: java.lang.Throwable -> L26
            int r5 = r3 + 1
            r4[r3] = r2     // Catch: java.lang.Throwable -> L26
            int r2 = r2 + 3
            r3 = r5
            goto L6
        L26:
            r8 = move-exception
            goto L4c
        L28:
            int r9 = r9 - r3
            r2 = 0
            r4 = 0
            r5 = 0
        L2c:
            if (r2 >= r3) goto L45
            int[] r6 = com.google.android.exoplayer2.util.NalUnitUtil.scratchEscapePositions     // Catch: java.lang.Throwable -> L26
            r6 = r6[r2]     // Catch: java.lang.Throwable -> L26
            int r6 = r6 - r5
            java.lang.System.arraycopy(r8, r5, r8, r4, r6)     // Catch: java.lang.Throwable -> L26
            int r4 = r4 + r6
            int r7 = r4 + 1
            r8[r4] = r1     // Catch: java.lang.Throwable -> L26
            int r4 = r7 + 1
            r8[r7] = r1     // Catch: java.lang.Throwable -> L26
            int r6 = r6 + 3
            int r5 = r5 + r6
            int r2 = r2 + 1
            goto L2c
        L45:
            int r1 = r9 - r4
            java.lang.System.arraycopy(r8, r5, r8, r4, r1)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return r9
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r8
    }
}
