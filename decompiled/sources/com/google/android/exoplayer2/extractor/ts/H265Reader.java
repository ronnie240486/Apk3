package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes2.dex */
public final class H265Reader implements com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader {
    private static final int AUD_NUT = 35;
    private static final int BLA_W_LP = 16;
    private static final int CRA_NUT = 21;
    private static final int PPS_NUT = 34;
    private static final int PREFIX_SEI_NUT = 39;
    private static final int RASL_R = 9;
    private static final int SPS_NUT = 33;
    private static final int SUFFIX_SEI_NUT = 40;
    private static final java.lang.String TAG = "H265Reader";
    private static final int VPS_NUT = 32;
    private java.lang.String formatId;
    private boolean hasOutputFormat;
    private com.google.android.exoplayer2.extractor.TrackOutput output;
    private long pesTimeUs;
    private final com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer pps;
    private final boolean[] prefixFlags;
    private final com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer prefixSei;
    private com.google.android.exoplayer2.extractor.ts.H265Reader.SampleReader sampleReader;
    private final com.google.android.exoplayer2.extractor.ts.SeiReader seiReader;
    private final com.google.android.exoplayer2.util.ParsableByteArray seiWrapper;
    private final com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer sps;
    private final com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer suffixSei;
    private long totalBytesWritten;
    private final com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer vps;

    /* JADX INFO: loaded from: classes.dex */
    public static final class SampleReader {
        private static final int FIRST_SLICE_FLAG_OFFSET = 2;
        private boolean isFirstPrefixNalUnit;
        private boolean isFirstSlice;
        private boolean lookingForFirstSliceFlag;
        private int nalUnitBytesRead;
        private boolean nalUnitHasKeyframeData;
        private long nalUnitPosition;
        private long nalUnitTimeUs;
        private final com.google.android.exoplayer2.extractor.TrackOutput output;
        private boolean readingPrefix;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;

        public SampleReader(com.google.android.exoplayer2.extractor.TrackOutput r1) {
                r0 = this;
                r0.<init>()
                r0.output = r1
                return
        }

        private static boolean isPrefixNalUnit(int r1) {
                r0 = 32
                if (r0 > r1) goto L8
                r0 = 35
                if (r1 <= r0) goto Lc
            L8:
                r0 = 39
                if (r1 != r0) goto Le
            Lc:
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                return r1
        }

        private static boolean isVclBodyNalUnit(int r1) {
                r0 = 32
                if (r1 < r0) goto Lb
                r0 = 40
                if (r1 != r0) goto L9
                goto Lb
            L9:
                r1 = 0
                goto Lc
            Lb:
                r1 = 1
            Lc:
                return r1
        }

        private void outputSample(int r9) {
                r8 = this;
                long r1 = r8.sampleTimeUs
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r0 != 0) goto Lc
                return
            Lc:
                boolean r3 = r8.sampleIsKeyframe
                long r4 = r8.nalUnitPosition
                long r6 = r8.samplePosition
                long r4 = r4 - r6
                int r4 = (int) r4
                com.google.android.exoplayer2.extractor.TrackOutput r0 = r8.output
                r6 = 0
                r5 = r9
                r0.sampleMetadata(r1, r3, r4, r5, r6)
                return
        }

        public void endNalUnit(long r3, int r5, boolean r6) {
                r2 = this;
                boolean r0 = r2.readingPrefix
                if (r0 == 0) goto L10
                boolean r0 = r2.isFirstSlice
                if (r0 == 0) goto L10
                boolean r3 = r2.nalUnitHasKeyframeData
                r2.sampleIsKeyframe = r3
                r3 = 0
                r2.readingPrefix = r3
                goto L35
            L10:
                boolean r0 = r2.isFirstPrefixNalUnit
                if (r0 != 0) goto L18
                boolean r0 = r2.isFirstSlice
                if (r0 == 0) goto L35
            L18:
                if (r6 == 0) goto L26
                boolean r6 = r2.readingSample
                if (r6 == 0) goto L26
                long r0 = r2.nalUnitPosition
                long r3 = r3 - r0
                int r4 = (int) r3
                int r5 = r5 + r4
                r2.outputSample(r5)
            L26:
                long r3 = r2.nalUnitPosition
                r2.samplePosition = r3
                long r3 = r2.nalUnitTimeUs
                r2.sampleTimeUs = r3
                boolean r3 = r2.nalUnitHasKeyframeData
                r2.sampleIsKeyframe = r3
                r3 = 1
                r2.readingSample = r3
            L35:
                return
        }

        public void readNalUnitData(byte[] r3, int r4, int r5) {
                r2 = this;
                boolean r0 = r2.lookingForFirstSliceFlag
                if (r0 == 0) goto L1e
                int r0 = r4 + 2
                int r1 = r2.nalUnitBytesRead
                int r0 = r0 - r1
                if (r0 >= r5) goto L1a
                r3 = r3[r0]
                r3 = r3 & 128(0x80, float:1.8E-43)
                r4 = 0
                if (r3 == 0) goto L14
                r3 = 1
                goto L15
            L14:
                r3 = 0
            L15:
                r2.isFirstSlice = r3
                r2.lookingForFirstSliceFlag = r4
                goto L1e
            L1a:
                int r5 = r5 - r4
                int r5 = r5 + r1
                r2.nalUnitBytesRead = r5
            L1e:
                return
        }

        public void reset() {
                r1 = this;
                r0 = 0
                r1.lookingForFirstSliceFlag = r0
                r1.isFirstSlice = r0
                r1.isFirstPrefixNalUnit = r0
                r1.readingSample = r0
                r1.readingPrefix = r0
                return
        }

        public void startNalUnit(long r2, int r4, int r5, long r6, boolean r8) {
                r1 = this;
                r0 = 0
                r1.isFirstSlice = r0
                r1.isFirstPrefixNalUnit = r0
                r1.nalUnitTimeUs = r6
                r1.nalUnitBytesRead = r0
                r1.nalUnitPosition = r2
                boolean r2 = isVclBodyNalUnit(r5)
                r3 = 1
                if (r2 != 0) goto L2e
                boolean r2 = r1.readingSample
                if (r2 == 0) goto L21
                boolean r2 = r1.readingPrefix
                if (r2 != 0) goto L21
                if (r8 == 0) goto L1f
                r1.outputSample(r4)
            L1f:
                r1.readingSample = r0
            L21:
                boolean r2 = isPrefixNalUnit(r5)
                if (r2 == 0) goto L2e
                boolean r2 = r1.readingPrefix
                r2 = r2 ^ r3
                r1.isFirstPrefixNalUnit = r2
                r1.readingPrefix = r3
            L2e:
                r2 = 16
                if (r5 < r2) goto L38
                r2 = 21
                if (r5 > r2) goto L38
                r2 = 1
                goto L39
            L38:
                r2 = 0
            L39:
                r1.nalUnitHasKeyframeData = r2
                if (r2 != 0) goto L41
                r2 = 9
                if (r5 > r2) goto L42
            L41:
                r0 = 1
            L42:
                r1.lookingForFirstSliceFlag = r0
                return
        }
    }

    public H265Reader(com.google.android.exoplayer2.extractor.ts.SeiReader r3) {
            r2 = this;
            r2.<init>()
            r2.seiReader = r3
            r3 = 3
            boolean[] r3 = new boolean[r3]
            r2.prefixFlags = r3
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r3 = new com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer
            r0 = 32
            r1 = 128(0x80, float:1.8E-43)
            r3.<init>(r0, r1)
            r2.vps = r3
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r3 = new com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer
            r0 = 33
            r3.<init>(r0, r1)
            r2.sps = r3
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r3 = new com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer
            r0 = 34
            r3.<init>(r0, r1)
            r2.pps = r3
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r3 = new com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer
            r0 = 39
            r3.<init>(r0, r1)
            r2.prefixSei = r3
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r3 = new com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer
            r0 = 40
            r3.<init>(r0, r1)
            r2.suffixSei = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.pesTimeUs = r0
            com.google.android.exoplayer2.util.ParsableByteArray r3 = new com.google.android.exoplayer2.util.ParsableByteArray
            r3.<init>()
            r2.seiWrapper = r3
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"output", "sampleReader"})
    private void assertTracksCreated() {
            r1 = this;
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r1.output
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.extractor.ts.H265Reader$SampleReader r0 = r1.sampleReader
            com.google.android.exoplayer2.util.Util.castNonNull(r0)
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output", "sampleReader"})
    private void endNalUnit(long r3, int r5, int r6, long r7) {
            r2 = this;
            com.google.android.exoplayer2.extractor.ts.H265Reader$SampleReader r0 = r2.sampleReader
            boolean r1 = r2.hasOutputFormat
            r0.endNalUnit(r3, r5, r1)
            boolean r3 = r2.hasOutputFormat
            if (r3 != 0) goto L46
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r3 = r2.vps
            r3.endNalUnit(r6)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r3 = r2.sps
            r3.endNalUnit(r6)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r3 = r2.pps
            r3.endNalUnit(r6)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r3 = r2.vps
            boolean r3 = r3.isCompleted()
            if (r3 == 0) goto L46
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r3 = r2.sps
            boolean r3 = r3.isCompleted()
            if (r3 == 0) goto L46
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r3 = r2.pps
            boolean r3 = r3.isCompleted()
            if (r3 == 0) goto L46
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r2.output
            java.lang.String r4 = r2.formatId
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r5 = r2.vps
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r2.sps
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r1 = r2.pps
            com.google.android.exoplayer2.Format r4 = parseMediaFormat(r4, r5, r0, r1)
            r3.format(r4)
            r3 = 1
            r2.hasOutputFormat = r3
        L46:
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r3 = r2.prefixSei
            boolean r3 = r3.endNalUnit(r6)
            r4 = 5
            if (r3 == 0) goto L6e
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r3 = r2.prefixSei
            byte[] r5 = r3.nalData
            int r3 = r3.nalLength
            int r3 = com.google.android.exoplayer2.util.NalUnitUtil.unescapeStream(r5, r3)
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r2.seiWrapper
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r2.prefixSei
            byte[] r0 = r0.nalData
            r5.reset(r0, r3)
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r2.seiWrapper
            r3.skipBytes(r4)
            com.google.android.exoplayer2.extractor.ts.SeiReader r3 = r2.seiReader
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r2.seiWrapper
            r3.consume(r7, r5)
        L6e:
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r3 = r2.suffixSei
            boolean r3 = r3.endNalUnit(r6)
            if (r3 == 0) goto L95
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r3 = r2.suffixSei
            byte[] r5 = r3.nalData
            int r3 = r3.nalLength
            int r3 = com.google.android.exoplayer2.util.NalUnitUtil.unescapeStream(r5, r3)
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r2.seiWrapper
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r6 = r2.suffixSei
            byte[] r6 = r6.nalData
            r5.reset(r6, r3)
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r2.seiWrapper
            r3.skipBytes(r4)
            com.google.android.exoplayer2.extractor.ts.SeiReader r3 = r2.seiReader
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r2.seiWrapper
            r3.consume(r7, r4)
        L95:
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleReader"})
    private void nalUnitData(byte[] r2, int r3, int r4) {
            r1 = this;
            com.google.android.exoplayer2.extractor.ts.H265Reader$SampleReader r0 = r1.sampleReader
            r0.readNalUnitData(r2, r3, r4)
            boolean r0 = r1.hasOutputFormat
            if (r0 != 0) goto L18
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r1.vps
            r0.appendToNalUnit(r2, r3, r4)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r1.sps
            r0.appendToNalUnit(r2, r3, r4)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r1.pps
            r0.appendToNalUnit(r2, r3, r4)
        L18:
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r1.prefixSei
            r0.appendToNalUnit(r2, r3, r4)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r1.suffixSei
            r0.appendToNalUnit(r2, r3, r4)
            return
    }

    private static com.google.android.exoplayer2.Format parseMediaFormat(@androidx.annotation.Nullable java.lang.String r20, com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r21, com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r22, com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r23) {
            r0 = r21
            r1 = r22
            r2 = r23
            int r3 = r0.nalLength
            int r4 = r1.nalLength
            int r4 = r4 + r3
            int r5 = r2.nalLength
            int r4 = r4 + r5
            byte[] r4 = new byte[r4]
            byte[] r5 = r0.nalData
            r6 = 0
            java.lang.System.arraycopy(r5, r6, r4, r6, r3)
            byte[] r3 = r1.nalData
            int r5 = r0.nalLength
            int r7 = r1.nalLength
            java.lang.System.arraycopy(r3, r6, r4, r5, r7)
            byte[] r3 = r2.nalData
            int r0 = r0.nalLength
            int r5 = r1.nalLength
            int r0 = r0 + r5
            int r2 = r2.nalLength
            java.lang.System.arraycopy(r3, r6, r4, r0, r2)
            com.google.android.exoplayer2.util.ParsableNalUnitBitArray r0 = new com.google.android.exoplayer2.util.ParsableNalUnitBitArray
            byte[] r2 = r1.nalData
            int r1 = r1.nalLength
            r0.<init>(r2, r6, r1)
            r1 = 44
            r0.skipBits(r1)
            r1 = 3
            int r2 = r0.readBits(r1)
            r0.skipBit()
            r3 = 2
            int r5 = r0.readBits(r3)
            boolean r6 = r0.readBit()
            r7 = 5
            int r7 = r0.readBits(r7)
            r8 = 0
            r9 = 0
        L51:
            r10 = 32
            r11 = 1
            if (r8 >= r10) goto L62
            boolean r10 = r0.readBit()
            if (r10 == 0) goto L5f
            int r10 = r11 << r8
            r9 = r9 | r10
        L5f:
            int r8 = r8 + 1
            goto L51
        L62:
            r8 = 6
            int[] r10 = new int[r8]
            r12 = 0
        L66:
            r13 = 8
            if (r12 >= r8) goto L73
            int r13 = r0.readBits(r13)
            r10[r12] = r13
            int r12 = r12 + 1
            goto L66
        L73:
            int r12 = r0.readBits(r13)
            r8 = 0
            r14 = 0
        L79:
            if (r8 >= r2) goto L8e
            boolean r15 = r0.readBit()
            if (r15 == 0) goto L83
            int r14 = r14 + 89
        L83:
            boolean r15 = r0.readBit()
            if (r15 == 0) goto L8b
            int r14 = r14 + 8
        L8b:
            int r8 = r8 + 1
            goto L79
        L8e:
            r0.skipBits(r14)
            if (r2 <= 0) goto L9a
            int r8 = 8 - r2
            int r8 = r8 * 2
            r0.skipBits(r8)
        L9a:
            r0.readUnsignedExpGolombCodedInt()
            int r8 = r0.readUnsignedExpGolombCodedInt()
            if (r8 != r1) goto La6
            r0.skipBit()
        La6:
            int r1 = r0.readUnsignedExpGolombCodedInt()
            int r14 = r0.readUnsignedExpGolombCodedInt()
            boolean r15 = r0.readBit()
            if (r15 == 0) goto Lde
            int r15 = r0.readUnsignedExpGolombCodedInt()
            int r16 = r0.readUnsignedExpGolombCodedInt()
            int r17 = r0.readUnsignedExpGolombCodedInt()
            int r18 = r0.readUnsignedExpGolombCodedInt()
            if (r8 == r11) goto Lcc
            if (r8 != r3) goto Lc9
            goto Lcc
        Lc9:
            r19 = 1
            goto Lce
        Lcc:
            r19 = 2
        Lce:
            if (r8 != r11) goto Ld2
            r8 = 2
            goto Ld3
        Ld2:
            r8 = 1
        Ld3:
            int r15 = r15 + r16
            int r15 = r15 * r19
            int r1 = r1 - r15
            int r17 = r17 + r18
            int r17 = r17 * r8
            int r14 = r14 - r17
        Lde:
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            int r8 = r0.readUnsignedExpGolombCodedInt()
            boolean r15 = r0.readBit()
            if (r15 == 0) goto Lf0
            r15 = 0
            goto Lf1
        Lf0:
            r15 = r2
        Lf1:
            if (r15 > r2) goto Lff
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            int r15 = r15 + 1
            goto Lf1
        Lff:
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            boolean r2 = r0.readBit()
            if (r2 == 0) goto L120
            boolean r2 = r0.readBit()
            if (r2 == 0) goto L120
            skipScalingList(r0)
        L120:
            r0.skipBits(r3)
            boolean r2 = r0.readBit()
            if (r2 == 0) goto L135
            r0.skipBits(r13)
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
            r0.skipBit()
        L135:
            skipShortTermRefPicSets(r0)
            boolean r2 = r0.readBit()
            r13 = 4
            if (r2 == 0) goto L14f
            r2 = 0
        L140:
            int r15 = r0.readUnsignedExpGolombCodedInt()
            if (r2 >= r15) goto L14f
            int r15 = r8 + 4
            int r15 = r15 + r11
            r0.skipBits(r15)
            int r2 = r2 + 1
            goto L140
        L14f:
            r0.skipBits(r3)
            r2 = 1065353216(0x3f800000, float:1.0)
            boolean r3 = r0.readBit()
            if (r3 == 0) goto L1bf
            boolean r3 = r0.readBit()
            if (r3 == 0) goto L18b
            r3 = 8
            int r3 = r0.readBits(r3)
            r8 = 255(0xff, float:3.57E-43)
            if (r3 != r8) goto L17c
            r3 = 16
            int r8 = r0.readBits(r3)
            int r3 = r0.readBits(r3)
            if (r8 == 0) goto L18b
            if (r3 == 0) goto L18b
            float r2 = (float) r8
            float r3 = (float) r3
            float r2 = r2 / r3
            goto L18b
        L17c:
            float[] r8 = com.google.android.exoplayer2.util.NalUnitUtil.ASPECT_RATIO_IDC_VALUES
            int r11 = r8.length
            if (r3 >= r11) goto L184
            r2 = r8[r3]
            goto L18b
        L184:
            java.lang.String r8 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r11 = "H265Reader"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r8, r3, r11)
        L18b:
            boolean r3 = r0.readBit()
            if (r3 == 0) goto L194
            r0.skipBit()
        L194:
            boolean r3 = r0.readBit()
            if (r3 == 0) goto L1a8
            r0.skipBits(r13)
            boolean r3 = r0.readBit()
            if (r3 == 0) goto L1a8
            r3 = 24
            r0.skipBits(r3)
        L1a8:
            boolean r3 = r0.readBit()
            if (r3 == 0) goto L1b4
            r0.readUnsignedExpGolombCodedInt()
            r0.readUnsignedExpGolombCodedInt()
        L1b4:
            r0.skipBit()
            boolean r0 = r0.readBit()
            if (r0 == 0) goto L1bf
            int r14 = r14 * 2
        L1bf:
            r8 = r9
            r9 = r10
            r10 = r12
            java.lang.String r0 = com.google.android.exoplayer2.util.CodecSpecificDataUtil.buildHevcCodecString(r5, r6, r7, r8, r9, r10)
            com.google.android.exoplayer2.Format$Builder r3 = new com.google.android.exoplayer2.Format$Builder
            r3.<init>()
            r5 = r20
            com.google.android.exoplayer2.Format$Builder r3 = r3.setId(r5)
            java.lang.String r5 = "video/hevc"
            com.google.android.exoplayer2.Format$Builder r3 = r3.setSampleMimeType(r5)
            com.google.android.exoplayer2.Format$Builder r0 = r3.setCodecs(r0)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setWidth(r1)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setHeight(r14)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setPixelWidthHeightRatio(r2)
            java.util.List r1 = java.util.Collections.singletonList(r4)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setInitializationData(r1)
            com.google.android.exoplayer2.Format r0 = r0.build()
            return r0
    }

    private static void skipScalingList(com.google.android.exoplayer2.util.ParsableNalUnitBitArray r7) {
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

    private static void skipShortTermRefPicSets(com.google.android.exoplayer2.util.ParsableNalUnitBitArray r8) {
            int r0 = r8.readUnsignedExpGolombCodedInt()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L8:
            if (r2 >= r0) goto L4d
            if (r2 == 0) goto L10
            boolean r3 = r8.readBit()
        L10:
            if (r3 == 0) goto L27
            r8.skipBit()
            r8.readUnsignedExpGolombCodedInt()
            r5 = 0
        L19:
            if (r5 > r4) goto L4a
            boolean r6 = r8.readBit()
            if (r6 == 0) goto L24
            r8.skipBit()
        L24:
            int r5 = r5 + 1
            goto L19
        L27:
            int r4 = r8.readUnsignedExpGolombCodedInt()
            int r5 = r8.readUnsignedExpGolombCodedInt()
            int r6 = r4 + r5
            r7 = 0
        L32:
            if (r7 >= r4) goto L3d
            r8.readUnsignedExpGolombCodedInt()
            r8.skipBit()
            int r7 = r7 + 1
            goto L32
        L3d:
            r4 = 0
        L3e:
            if (r4 >= r5) goto L49
            r8.readUnsignedExpGolombCodedInt()
            r8.skipBit()
            int r4 = r4 + 1
            goto L3e
        L49:
            r4 = r6
        L4a:
            int r2 = r2 + 1
            goto L8
        L4d:
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleReader"})
    private void startNalUnit(long r9, int r11, int r12, long r13) {
            r8 = this;
            com.google.android.exoplayer2.extractor.ts.H265Reader$SampleReader r0 = r8.sampleReader
            boolean r7 = r8.hasOutputFormat
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r0.startNalUnit(r1, r3, r4, r5, r7)
            boolean r9 = r8.hasOutputFormat
            if (r9 != 0) goto L1e
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r9 = r8.vps
            r9.startNalUnit(r12)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r9 = r8.sps
            r9.startNalUnit(r12)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r9 = r8.pps
            r9.startNalUnit(r12)
        L1e:
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r9 = r8.prefixSei
            r9.startNalUnit(r12)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r9 = r8.suffixSei
            r9.startNalUnit(r12)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(com.google.android.exoplayer2.util.ParsableByteArray r17) {
            r16 = this;
            r7 = r16
            r16.assertTracksCreated()
        L5:
            int r0 = r17.bytesLeft()
            if (r0 <= 0) goto L65
            int r0 = r17.getPosition()
            int r8 = r17.limit()
            byte[] r9 = r17.getData()
            long r1 = r7.totalBytesWritten
            int r3 = r17.bytesLeft()
            long r3 = (long) r3
            long r1 = r1 + r3
            r7.totalBytesWritten = r1
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r7.output
            int r2 = r17.bytesLeft()
            r10 = r17
            r1.sampleData(r10, r2)
        L2c:
            if (r0 >= r8) goto L5
            boolean[] r1 = r7.prefixFlags
            int r11 = com.google.android.exoplayer2.util.NalUnitUtil.findNalUnit(r9, r0, r8, r1)
            if (r11 != r8) goto L3a
            r7.nalUnitData(r9, r0, r8)
            return
        L3a:
            int r12 = com.google.android.exoplayer2.util.NalUnitUtil.getH265NalUnitType(r9, r11)
            int r1 = r11 - r0
            if (r1 <= 0) goto L45
            r7.nalUnitData(r9, r0, r11)
        L45:
            int r13 = r8 - r11
            long r2 = r7.totalBytesWritten
            long r4 = (long) r13
            long r14 = r2 - r4
            if (r1 >= 0) goto L51
            int r0 = -r1
            r4 = r0
            goto L53
        L51:
            r0 = 0
            r4 = 0
        L53:
            long r5 = r7.pesTimeUs
            r0 = r16
            r1 = r14
            r3 = r13
            r0.endNalUnit(r1, r3, r4, r5)
            long r5 = r7.pesTimeUs
            r4 = r12
            r0.startNalUnit(r1, r3, r4, r5)
            int r0 = r11 + 3
            goto L2c
        L65:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(com.google.android.exoplayer2.extractor.ExtractorOutput r3, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator r4) {
            r2 = this;
            r4.generateNewId()
            java.lang.String r0 = r4.getFormatId()
            r2.formatId = r0
            int r0 = r4.getTrackId()
            r1 = 2
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r3.track(r0, r1)
            r2.output = r0
            com.google.android.exoplayer2.extractor.ts.H265Reader$SampleReader r1 = new com.google.android.exoplayer2.extractor.ts.H265Reader$SampleReader
            r1.<init>(r0)
            r2.sampleReader = r1
            com.google.android.exoplayer2.extractor.ts.SeiReader r0 = r2.seiReader
            r0.createTracks(r3, r4)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long r3, int r5) {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto Lb
            r2.pesTimeUs = r3
        Lb:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
            r2 = this;
            r0 = 0
            r2.totalBytesWritten = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.pesTimeUs = r0
            boolean[] r0 = r2.prefixFlags
            com.google.android.exoplayer2.util.NalUnitUtil.clearPrefixFlags(r0)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r2.vps
            r0.reset()
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r2.sps
            r0.reset()
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r2.pps
            r0.reset()
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r2.prefixSei
            r0.reset()
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r2.suffixSei
            r0.reset()
            com.google.android.exoplayer2.extractor.ts.H265Reader$SampleReader r0 = r2.sampleReader
            if (r0 == 0) goto L30
            r0.reset()
        L30:
            return
    }
}
