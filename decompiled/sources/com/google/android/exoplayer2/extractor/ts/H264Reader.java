package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes3.dex */
public final class H264Reader implements com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader {
    private final boolean allowNonIdrKeyframes;
    private final boolean detectAccessUnits;
    private java.lang.String formatId;
    private boolean hasOutputFormat;
    private com.google.android.exoplayer2.extractor.TrackOutput output;
    private long pesTimeUs;
    private final com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer pps;
    private final boolean[] prefixFlags;
    private boolean randomAccessIndicator;
    private com.google.android.exoplayer2.extractor.ts.H264Reader.SampleReader sampleReader;
    private final com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer sei;
    private final com.google.android.exoplayer2.extractor.ts.SeiReader seiReader;
    private final com.google.android.exoplayer2.util.ParsableByteArray seiWrapper;
    private final com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer sps;
    private long totalBytesWritten;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.H264Reader$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class SampleReader {
        private static final int DEFAULT_BUFFER_SIZE = 128;
        private final boolean allowNonIdrKeyframes;
        private final com.google.android.exoplayer2.util.ParsableNalUnitBitArray bitArray;
        private byte[] buffer;
        private int bufferLength;
        private final boolean detectAccessUnits;
        private boolean isFilling;
        private long nalUnitStartPosition;
        private long nalUnitTimeUs;
        private int nalUnitType;
        private final com.google.android.exoplayer2.extractor.TrackOutput output;
        private final android.util.SparseArray<com.google.android.exoplayer2.util.NalUnitUtil.PpsData> pps;
        private com.google.android.exoplayer2.extractor.ts.H264Reader.SampleReader.SliceHeaderData previousSliceHeader;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;
        private com.google.android.exoplayer2.extractor.ts.H264Reader.SampleReader.SliceHeaderData sliceHeader;
        private final android.util.SparseArray<com.google.android.exoplayer2.util.NalUnitUtil.SpsData> sps;

        /* JADX INFO: loaded from: classes.dex */
        public static final class SliceHeaderData {
            private static final int SLICE_TYPE_ALL_I = 7;
            private static final int SLICE_TYPE_I = 2;
            private boolean bottomFieldFlag;
            private boolean bottomFieldFlagPresent;
            private int deltaPicOrderCnt0;
            private int deltaPicOrderCnt1;
            private int deltaPicOrderCntBottom;
            private boolean fieldPicFlag;
            private int frameNum;
            private boolean hasSliceType;
            private boolean idrPicFlag;
            private int idrPicId;
            private boolean isComplete;
            private int nalRefIdc;
            private int picOrderCntLsb;
            private int picParameterSetId;
            private int sliceType;

            @androidx.annotation.Nullable
            private com.google.android.exoplayer2.util.NalUnitUtil.SpsData spsData;

            private SliceHeaderData() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ SliceHeaderData(com.google.android.exoplayer2.extractor.ts.H264Reader.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public static /* synthetic */ boolean access$100(com.google.android.exoplayer2.extractor.ts.H264Reader.SampleReader.SliceHeaderData r0, com.google.android.exoplayer2.extractor.ts.H264Reader.SampleReader.SliceHeaderData r1) {
                    boolean r0 = r0.isFirstVclNalUnitOfPicture(r1)
                    return r0
            }

            private boolean isFirstVclNalUnitOfPicture(com.google.android.exoplayer2.extractor.ts.H264Reader.SampleReader.SliceHeaderData r7) {
                    r6 = this;
                    boolean r0 = r6.isComplete
                    r1 = 0
                    if (r0 != 0) goto L6
                    return r1
                L6:
                    boolean r0 = r7.isComplete
                    r2 = 1
                    if (r0 != 0) goto Lc
                    return r2
                Lc:
                    com.google.android.exoplayer2.util.NalUnitUtil$SpsData r0 = r6.spsData
                    java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
                    com.google.android.exoplayer2.util.NalUnitUtil$SpsData r0 = (com.google.android.exoplayer2.util.NalUnitUtil.SpsData) r0
                    com.google.android.exoplayer2.util.NalUnitUtil$SpsData r3 = r7.spsData
                    java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r3)
                    com.google.android.exoplayer2.util.NalUnitUtil$SpsData r3 = (com.google.android.exoplayer2.util.NalUnitUtil.SpsData) r3
                    int r4 = r6.frameNum
                    int r5 = r7.frameNum
                    if (r4 != r5) goto L7a
                    int r4 = r6.picParameterSetId
                    int r5 = r7.picParameterSetId
                    if (r4 != r5) goto L7a
                    boolean r4 = r6.fieldPicFlag
                    boolean r5 = r7.fieldPicFlag
                    if (r4 != r5) goto L7a
                    boolean r4 = r6.bottomFieldFlagPresent
                    if (r4 == 0) goto L3c
                    boolean r4 = r7.bottomFieldFlagPresent
                    if (r4 == 0) goto L3c
                    boolean r4 = r6.bottomFieldFlag
                    boolean r5 = r7.bottomFieldFlag
                    if (r4 != r5) goto L7a
                L3c:
                    int r4 = r6.nalRefIdc
                    int r5 = r7.nalRefIdc
                    if (r4 == r5) goto L46
                    if (r4 == 0) goto L7a
                    if (r5 == 0) goto L7a
                L46:
                    int r0 = r0.picOrderCountType
                    if (r0 != 0) goto L5a
                    int r4 = r3.picOrderCountType
                    if (r4 != 0) goto L5a
                    int r4 = r6.picOrderCntLsb
                    int r5 = r7.picOrderCntLsb
                    if (r4 != r5) goto L7a
                    int r4 = r6.deltaPicOrderCntBottom
                    int r5 = r7.deltaPicOrderCntBottom
                    if (r4 != r5) goto L7a
                L5a:
                    if (r0 != r2) goto L6c
                    int r0 = r3.picOrderCountType
                    if (r0 != r2) goto L6c
                    int r0 = r6.deltaPicOrderCnt0
                    int r3 = r7.deltaPicOrderCnt0
                    if (r0 != r3) goto L7a
                    int r0 = r6.deltaPicOrderCnt1
                    int r3 = r7.deltaPicOrderCnt1
                    if (r0 != r3) goto L7a
                L6c:
                    boolean r0 = r6.idrPicFlag
                    boolean r3 = r7.idrPicFlag
                    if (r0 != r3) goto L7a
                    if (r0 == 0) goto L7b
                    int r0 = r6.idrPicId
                    int r7 = r7.idrPicId
                    if (r0 == r7) goto L7b
                L7a:
                    r1 = 1
                L7b:
                    return r1
            }

            public void clear() {
                    r1 = this;
                    r0 = 0
                    r1.hasSliceType = r0
                    r1.isComplete = r0
                    return
            }

            public boolean isISlice() {
                    r2 = this;
                    boolean r0 = r2.hasSliceType
                    if (r0 == 0) goto Le
                    int r0 = r2.sliceType
                    r1 = 7
                    if (r0 == r1) goto Lc
                    r1 = 2
                    if (r0 != r1) goto Le
                Lc:
                    r0 = 1
                    goto Lf
                Le:
                    r0 = 0
                Lf:
                    return r0
            }

            public void setAll(com.google.android.exoplayer2.util.NalUnitUtil.SpsData r1, int r2, int r3, int r4, int r5, boolean r6, boolean r7, boolean r8, boolean r9, int r10, int r11, int r12, int r13, int r14) {
                    r0 = this;
                    r0.spsData = r1
                    r0.nalRefIdc = r2
                    r0.sliceType = r3
                    r0.frameNum = r4
                    r0.picParameterSetId = r5
                    r0.fieldPicFlag = r6
                    r0.bottomFieldFlagPresent = r7
                    r0.bottomFieldFlag = r8
                    r0.idrPicFlag = r9
                    r0.idrPicId = r10
                    r0.picOrderCntLsb = r11
                    r0.deltaPicOrderCntBottom = r12
                    r0.deltaPicOrderCnt0 = r13
                    r0.deltaPicOrderCnt1 = r14
                    r1 = 1
                    r0.isComplete = r1
                    r0.hasSliceType = r1
                    return
            }

            public void setSliceType(int r1) {
                    r0 = this;
                    r0.sliceType = r1
                    r1 = 1
                    r0.hasSliceType = r1
                    return
            }
        }

        public SampleReader(com.google.android.exoplayer2.extractor.TrackOutput r1, boolean r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.output = r1
                r0.allowNonIdrKeyframes = r2
                r0.detectAccessUnits = r3
                android.util.SparseArray r1 = new android.util.SparseArray
                r1.<init>()
                r0.sps = r1
                android.util.SparseArray r1 = new android.util.SparseArray
                r1.<init>()
                r0.pps = r1
                com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader$SliceHeaderData r1 = new com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader$SliceHeaderData
                r2 = 0
                r1.<init>(r2)
                r0.previousSliceHeader = r1
                com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader$SliceHeaderData r1 = new com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader$SliceHeaderData
                r1.<init>(r2)
                r0.sliceHeader = r1
                r1 = 128(0x80, float:1.8E-43)
                byte[] r1 = new byte[r1]
                r0.buffer = r1
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r2 = new com.google.android.exoplayer2.util.ParsableNalUnitBitArray
                r3 = 0
                r2.<init>(r1, r3, r3)
                r0.bitArray = r2
                r0.reset()
                return
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
                long r4 = r8.nalUnitStartPosition
                long r6 = r8.samplePosition
                long r4 = r4 - r6
                int r4 = (int) r4
                com.google.android.exoplayer2.extractor.TrackOutput r0 = r8.output
                r6 = 0
                r5 = r9
                r0.sampleMetadata(r1, r3, r4, r5, r6)
                return
        }

        public void appendToNalUnit(byte[] r24, int r25, int r26) {
                r23 = this;
                r0 = r23
                r1 = r25
                boolean r2 = r0.isFilling
                if (r2 != 0) goto L9
                return
            L9:
                int r2 = r26 - r1
                byte[] r3 = r0.buffer
                int r4 = r3.length
                int r5 = r0.bufferLength
                int r6 = r5 + r2
                r7 = 2
                if (r4 >= r6) goto L1e
                int r5 = r5 + r2
                int r5 = r5 * 2
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.buffer = r3
            L1e:
                byte[] r3 = r0.buffer
                int r4 = r0.bufferLength
                r5 = r24
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.bufferLength
                int r1 = r1 + r2
                r0.bufferLength = r1
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r2 = r0.bitArray
                byte[] r3 = r0.buffer
                r4 = 0
                r2.reset(r3, r4, r1)
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r1 = r0.bitArray
                r2 = 8
                boolean r1 = r1.canReadBits(r2)
                if (r1 != 0) goto L3f
                return
            L3f:
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r1 = r0.bitArray
                r1.skipBit()
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r1 = r0.bitArray
                int r10 = r1.readBits(r7)
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r1 = r0.bitArray
                r2 = 5
                r1.skipBits(r2)
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r1 = r0.bitArray
                boolean r1 = r1.canReadExpGolombCodedNum()
                if (r1 != 0) goto L59
                return
            L59:
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r1 = r0.bitArray
                r1.readUnsignedExpGolombCodedInt()
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r1 = r0.bitArray
                boolean r1 = r1.canReadExpGolombCodedNum()
                if (r1 != 0) goto L67
                return
            L67:
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r1 = r0.bitArray
                int r11 = r1.readUnsignedExpGolombCodedInt()
                boolean r1 = r0.detectAccessUnits
                if (r1 != 0) goto L79
                r0.isFilling = r4
                com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader$SliceHeaderData r1 = r0.sliceHeader
                r1.setSliceType(r11)
                return
            L79:
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r1 = r0.bitArray
                boolean r1 = r1.canReadExpGolombCodedNum()
                if (r1 != 0) goto L82
                return
            L82:
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r1 = r0.bitArray
                int r13 = r1.readUnsignedExpGolombCodedInt()
                android.util.SparseArray<com.google.android.exoplayer2.util.NalUnitUtil$PpsData> r1 = r0.pps
                int r1 = r1.indexOfKey(r13)
                if (r1 >= 0) goto L93
                r0.isFilling = r4
                return
            L93:
                android.util.SparseArray<com.google.android.exoplayer2.util.NalUnitUtil$PpsData> r1 = r0.pps
                java.lang.Object r1 = r1.get(r13)
                com.google.android.exoplayer2.util.NalUnitUtil$PpsData r1 = (com.google.android.exoplayer2.util.NalUnitUtil.PpsData) r1
                android.util.SparseArray<com.google.android.exoplayer2.util.NalUnitUtil$SpsData> r3 = r0.sps
                int r5 = r1.seqParameterSetId
                java.lang.Object r3 = r3.get(r5)
                r9 = r3
                com.google.android.exoplayer2.util.NalUnitUtil$SpsData r9 = (com.google.android.exoplayer2.util.NalUnitUtil.SpsData) r9
                boolean r3 = r9.separateColorPlaneFlag
                if (r3 == 0) goto Lb8
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r3 = r0.bitArray
                boolean r3 = r3.canReadBits(r7)
                if (r3 != 0) goto Lb3
                return
            Lb3:
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r3 = r0.bitArray
                r3.skipBits(r7)
            Lb8:
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r3 = r0.bitArray
                int r5 = r9.frameNumLength
                boolean r3 = r3.canReadBits(r5)
                if (r3 != 0) goto Lc3
                return
            Lc3:
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r3 = r0.bitArray
                int r5 = r9.frameNumLength
                int r12 = r3.readBits(r5)
                boolean r3 = r9.frameMbsOnlyFlag
                r5 = 1
                if (r3 != 0) goto Lf7
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r3 = r0.bitArray
                boolean r3 = r3.canReadBits(r5)
                if (r3 != 0) goto Ld9
                return
            Ld9:
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r3 = r0.bitArray
                boolean r3 = r3.readBit()
                if (r3 == 0) goto Lf5
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r6 = r0.bitArray
                boolean r6 = r6.canReadBits(r5)
                if (r6 != 0) goto Lea
                return
            Lea:
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r6 = r0.bitArray
                boolean r6 = r6.readBit()
                r14 = r3
                r16 = r6
                r15 = 1
                goto Lfb
            Lf5:
                r14 = r3
                goto Lf8
            Lf7:
                r14 = 0
            Lf8:
                r15 = 0
                r16 = 0
            Lfb:
                int r3 = r0.nalUnitType
                if (r3 != r2) goto L102
                r17 = 1
                goto L104
            L102:
                r17 = 0
            L104:
                if (r17 == 0) goto L118
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r2 = r0.bitArray
                boolean r2 = r2.canReadExpGolombCodedNum()
                if (r2 != 0) goto L10f
                return
            L10f:
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r2 = r0.bitArray
                int r2 = r2.readUnsignedExpGolombCodedInt()
                r18 = r2
                goto L11a
            L118:
                r18 = 0
            L11a:
                int r2 = r9.picOrderCountType
                if (r2 != 0) goto L14e
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r2 = r0.bitArray
                int r3 = r9.picOrderCntLsbLength
                boolean r2 = r2.canReadBits(r3)
                if (r2 != 0) goto L129
                return
            L129:
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r2 = r0.bitArray
                int r3 = r9.picOrderCntLsbLength
                int r2 = r2.readBits(r3)
                boolean r1 = r1.bottomFieldPicOrderInFramePresentFlag
                if (r1 == 0) goto L14b
                if (r14 != 0) goto L14b
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r1 = r0.bitArray
                boolean r1 = r1.canReadExpGolombCodedNum()
                if (r1 != 0) goto L140
                return
            L140:
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r1 = r0.bitArray
                int r1 = r1.readSignedExpGolombCodedInt()
                r20 = r1
                r19 = r2
                goto L18c
            L14b:
                r19 = r2
                goto L18a
            L14e:
                if (r2 != r5) goto L188
                boolean r2 = r9.deltaPicOrderAlwaysZeroFlag
                if (r2 != 0) goto L188
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r2 = r0.bitArray
                boolean r2 = r2.canReadExpGolombCodedNum()
                if (r2 != 0) goto L15d
                return
            L15d:
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r2 = r0.bitArray
                int r2 = r2.readSignedExpGolombCodedInt()
                boolean r1 = r1.bottomFieldPicOrderInFramePresentFlag
                if (r1 == 0) goto L181
                if (r14 != 0) goto L181
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r1 = r0.bitArray
                boolean r1 = r1.canReadExpGolombCodedNum()
                if (r1 != 0) goto L172
                return
            L172:
                com.google.android.exoplayer2.util.ParsableNalUnitBitArray r1 = r0.bitArray
                int r1 = r1.readSignedExpGolombCodedInt()
                r22 = r1
                r21 = r2
                r19 = 0
                r20 = 0
                goto L190
            L181:
                r21 = r2
                r19 = 0
                r20 = 0
                goto L18e
            L188:
                r19 = 0
            L18a:
                r20 = 0
            L18c:
                r21 = 0
            L18e:
                r22 = 0
            L190:
                com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader$SliceHeaderData r8 = r0.sliceHeader
                r8.setAll(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.isFilling = r4
                return
        }

        public boolean endNalUnit(long r6, int r8, boolean r9, boolean r10) {
                r5 = this;
                int r0 = r5.nalUnitType
                r1 = 0
                r2 = 1
                r3 = 9
                if (r0 == r3) goto L16
                boolean r0 = r5.detectAccessUnits
                if (r0 == 0) goto L30
                com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader$SliceHeaderData r0 = r5.sliceHeader
                com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader$SliceHeaderData r3 = r5.previousSliceHeader
                boolean r0 = com.google.android.exoplayer2.extractor.ts.H264Reader.SampleReader.SliceHeaderData.access$100(r0, r3)
                if (r0 == 0) goto L30
            L16:
                if (r9 == 0) goto L24
                boolean r9 = r5.readingSample
                if (r9 == 0) goto L24
                long r3 = r5.nalUnitStartPosition
                long r6 = r6 - r3
                int r7 = (int) r6
                int r8 = r8 + r7
                r5.outputSample(r8)
            L24:
                long r6 = r5.nalUnitStartPosition
                r5.samplePosition = r6
                long r6 = r5.nalUnitTimeUs
                r5.sampleTimeUs = r6
                r5.sampleIsKeyframe = r1
                r5.readingSample = r2
            L30:
                boolean r6 = r5.allowNonIdrKeyframes
                if (r6 == 0) goto L3a
                com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader$SliceHeaderData r6 = r5.sliceHeader
                boolean r10 = r6.isISlice()
            L3a:
                boolean r6 = r5.sampleIsKeyframe
                int r7 = r5.nalUnitType
                r8 = 5
                if (r7 == r8) goto L45
                if (r10 == 0) goto L46
                if (r7 != r2) goto L46
            L45:
                r1 = 1
            L46:
                r6 = r6 | r1
                r5.sampleIsKeyframe = r6
                return r6
        }

        public boolean needsSpsPps() {
                r1 = this;
                boolean r0 = r1.detectAccessUnits
                return r0
        }

        public void putPps(com.google.android.exoplayer2.util.NalUnitUtil.PpsData r3) {
                r2 = this;
                android.util.SparseArray<com.google.android.exoplayer2.util.NalUnitUtil$PpsData> r0 = r2.pps
                int r1 = r3.picParameterSetId
                r0.append(r1, r3)
                return
        }

        public void putSps(com.google.android.exoplayer2.util.NalUnitUtil.SpsData r3) {
                r2 = this;
                android.util.SparseArray<com.google.android.exoplayer2.util.NalUnitUtil$SpsData> r0 = r2.sps
                int r1 = r3.seqParameterSetId
                r0.append(r1, r3)
                return
        }

        public void reset() {
                r1 = this;
                r0 = 0
                r1.isFilling = r0
                r1.readingSample = r0
                com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader$SliceHeaderData r0 = r1.sliceHeader
                r0.clear()
                return
        }

        public void startNalUnit(long r1, int r3, long r4) {
                r0 = this;
                r0.nalUnitType = r3
                r0.nalUnitTimeUs = r4
                r0.nalUnitStartPosition = r1
                boolean r1 = r0.allowNonIdrKeyframes
                r2 = 1
                if (r1 == 0) goto Ld
                if (r3 == r2) goto L19
            Ld:
                boolean r1 = r0.detectAccessUnits
                if (r1 == 0) goto L29
                r1 = 5
                if (r3 == r1) goto L19
                if (r3 == r2) goto L19
                r1 = 2
                if (r3 != r1) goto L29
            L19:
                com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader$SliceHeaderData r1 = r0.previousSliceHeader
                com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader$SliceHeaderData r3 = r0.sliceHeader
                r0.previousSliceHeader = r3
                r0.sliceHeader = r1
                r1.clear()
                r1 = 0
                r0.bufferLength = r1
                r0.isFilling = r2
            L29:
                return
        }
    }

    public H264Reader(com.google.android.exoplayer2.extractor.ts.SeiReader r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.seiReader = r1
            r0.allowNonIdrKeyframes = r2
            r0.detectAccessUnits = r3
            r1 = 3
            boolean[] r1 = new boolean[r1]
            r0.prefixFlags = r1
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r1 = new com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer
            r2 = 7
            r3 = 128(0x80, float:1.8E-43)
            r1.<init>(r2, r3)
            r0.sps = r1
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r1 = new com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer
            r2 = 8
            r1.<init>(r2, r3)
            r0.pps = r1
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r1 = new com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer
            r2 = 6
            r1.<init>(r2, r3)
            r0.sei = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.pesTimeUs = r1
            com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1.<init>()
            r0.seiWrapper = r1
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"output", "sampleReader"})
    private void assertTracksCreated() {
            r1 = this;
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r1.output
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader r0 = r1.sampleReader
            com.google.android.exoplayer2.util.Util.castNonNull(r0)
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output", "sampleReader"})
    private void endNalUnit(long r8, int r10, int r11, long r12) {
            r7 = this;
            boolean r0 = r7.hasOutputFormat
            if (r0 == 0) goto Lc
            com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader r0 = r7.sampleReader
            boolean r0 = r0.needsSpsPps()
            if (r0 == 0) goto Lee
        Lc:
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r7.sps
            r0.endNalUnit(r11)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r7.pps
            r0.endNalUnit(r11)
            boolean r0 = r7.hasOutputFormat
            r1 = 3
            if (r0 != 0) goto Lb5
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r7.sps
            boolean r0 = r0.isCompleted()
            if (r0 == 0) goto Lee
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r7.pps
            boolean r0 = r0.isCompleted()
            if (r0 == 0) goto Lee
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r2 = r7.sps
            byte[] r3 = r2.nalData
            int r2 = r2.nalLength
            byte[] r2 = java.util.Arrays.copyOf(r3, r2)
            r0.add(r2)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r2 = r7.pps
            byte[] r3 = r2.nalData
            int r2 = r2.nalLength
            byte[] r2 = java.util.Arrays.copyOf(r3, r2)
            r0.add(r2)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r2 = r7.sps
            byte[] r3 = r2.nalData
            int r2 = r2.nalLength
            com.google.android.exoplayer2.util.NalUnitUtil$SpsData r2 = com.google.android.exoplayer2.util.NalUnitUtil.parseSpsNalUnit(r3, r1, r2)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r3 = r7.pps
            byte[] r4 = r3.nalData
            int r3 = r3.nalLength
            com.google.android.exoplayer2.util.NalUnitUtil$PpsData r1 = com.google.android.exoplayer2.util.NalUnitUtil.parsePpsNalUnit(r4, r1, r3)
            int r3 = r2.profileIdc
            int r4 = r2.constraintsFlagsAndReservedZero2Bits
            int r5 = r2.levelIdc
            java.lang.String r3 = com.google.android.exoplayer2.util.CodecSpecificDataUtil.buildAvcCodecString(r3, r4, r5)
            com.google.android.exoplayer2.extractor.TrackOutput r4 = r7.output
            com.google.android.exoplayer2.Format$Builder r5 = new com.google.android.exoplayer2.Format$Builder
            r5.<init>()
            java.lang.String r6 = r7.formatId
            com.google.android.exoplayer2.Format$Builder r5 = r5.setId(r6)
            java.lang.String r6 = "video/avc"
            com.google.android.exoplayer2.Format$Builder r5 = r5.setSampleMimeType(r6)
            com.google.android.exoplayer2.Format$Builder r3 = r5.setCodecs(r3)
            int r5 = r2.width
            com.google.android.exoplayer2.Format$Builder r3 = r3.setWidth(r5)
            int r5 = r2.height
            com.google.android.exoplayer2.Format$Builder r3 = r3.setHeight(r5)
            float r5 = r2.pixelWidthHeightRatio
            com.google.android.exoplayer2.Format$Builder r3 = r3.setPixelWidthHeightRatio(r5)
            com.google.android.exoplayer2.Format$Builder r0 = r3.setInitializationData(r0)
            com.google.android.exoplayer2.Format r0 = r0.build()
            r4.format(r0)
            r0 = 1
            r7.hasOutputFormat = r0
            com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader r0 = r7.sampleReader
            r0.putSps(r2)
            com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader r0 = r7.sampleReader
            r0.putPps(r1)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r7.sps
            r0.reset()
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r7.pps
            r0.reset()
            goto Lee
        Lb5:
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r7.sps
            boolean r0 = r0.isCompleted()
            if (r0 == 0) goto Ld2
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r7.sps
            byte[] r2 = r0.nalData
            int r0 = r0.nalLength
            com.google.android.exoplayer2.util.NalUnitUtil$SpsData r0 = com.google.android.exoplayer2.util.NalUnitUtil.parseSpsNalUnit(r2, r1, r0)
            com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader r1 = r7.sampleReader
            r1.putSps(r0)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r7.sps
            r0.reset()
            goto Lee
        Ld2:
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r7.pps
            boolean r0 = r0.isCompleted()
            if (r0 == 0) goto Lee
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r7.pps
            byte[] r2 = r0.nalData
            int r0 = r0.nalLength
            com.google.android.exoplayer2.util.NalUnitUtil$PpsData r0 = com.google.android.exoplayer2.util.NalUnitUtil.parsePpsNalUnit(r2, r1, r0)
            com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader r1 = r7.sampleReader
            r1.putPps(r0)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r7.pps
            r0.reset()
        Lee:
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r7.sei
            boolean r11 = r0.endNalUnit(r11)
            if (r11 == 0) goto L116
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r11 = r7.sei
            byte[] r0 = r11.nalData
            int r11 = r11.nalLength
            int r11 = com.google.android.exoplayer2.util.NalUnitUtil.unescapeStream(r0, r11)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.seiWrapper
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r1 = r7.sei
            byte[] r1 = r1.nalData
            r0.reset(r1, r11)
            com.google.android.exoplayer2.util.ParsableByteArray r11 = r7.seiWrapper
            r0 = 4
            r11.setPosition(r0)
            com.google.android.exoplayer2.extractor.ts.SeiReader r11 = r7.seiReader
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.seiWrapper
            r11.consume(r12, r0)
        L116:
            com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader r1 = r7.sampleReader
            boolean r5 = r7.hasOutputFormat
            boolean r6 = r7.randomAccessIndicator
            r2 = r8
            r4 = r10
            boolean r8 = r1.endNalUnit(r2, r4, r5, r6)
            if (r8 == 0) goto L127
            r8 = 0
            r7.randomAccessIndicator = r8
        L127:
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleReader"})
    private void nalUnitData(byte[] r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.hasOutputFormat
            if (r0 == 0) goto Lc
            com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader r0 = r1.sampleReader
            boolean r0 = r0.needsSpsPps()
            if (r0 == 0) goto L16
        Lc:
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r1.sps
            r0.appendToNalUnit(r2, r3, r4)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r1.pps
            r0.appendToNalUnit(r2, r3, r4)
        L16:
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r1.sei
            r0.appendToNalUnit(r2, r3, r4)
            com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader r0 = r1.sampleReader
            r0.appendToNalUnit(r2, r3, r4)
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleReader"})
    private void startNalUnit(long r8, int r10, long r11) {
            r7 = this;
            boolean r0 = r7.hasOutputFormat
            if (r0 == 0) goto Lc
            com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader r0 = r7.sampleReader
            boolean r0 = r0.needsSpsPps()
            if (r0 == 0) goto L16
        Lc:
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r7.sps
            r0.startNalUnit(r10)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r7.pps
            r0.startNalUnit(r10)
        L16:
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r7.sei
            r0.startNalUnit(r10)
            com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader r1 = r7.sampleReader
            r2 = r8
            r4 = r10
            r5 = r11
            r1.startNalUnit(r2, r4, r5)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(com.google.android.exoplayer2.util.ParsableByteArray r15) {
            r14 = this;
            r14.assertTracksCreated()
            int r0 = r15.getPosition()
            int r1 = r15.limit()
            byte[] r2 = r15.getData()
            long r3 = r14.totalBytesWritten
            int r5 = r15.bytesLeft()
            long r5 = (long) r5
            long r3 = r3 + r5
            r14.totalBytesWritten = r3
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r14.output
            int r4 = r15.bytesLeft()
            r3.sampleData(r15, r4)
        L22:
            boolean[] r15 = r14.prefixFlags
            int r15 = com.google.android.exoplayer2.util.NalUnitUtil.findNalUnit(r2, r0, r1, r15)
            if (r15 != r1) goto L2e
            r14.nalUnitData(r2, r0, r1)
            return
        L2e:
            int r6 = com.google.android.exoplayer2.util.NalUnitUtil.getNalUnitType(r2, r15)
            int r3 = r15 - r0
            if (r3 <= 0) goto L39
            r14.nalUnitData(r2, r0, r15)
        L39:
            int r10 = r1 - r15
            long r4 = r14.totalBytesWritten
            long r7 = (long) r10
            long r4 = r4 - r7
            if (r3 >= 0) goto L44
            int r0 = -r3
            r11 = r0
            goto L46
        L44:
            r0 = 0
            r11 = 0
        L46:
            long r12 = r14.pesTimeUs
            r7 = r14
            r8 = r4
            r7.endNalUnit(r8, r10, r11, r12)
            long r7 = r14.pesTimeUs
            r3 = r14
            r3.startNalUnit(r4, r6, r7)
            int r0 = r15 + 3
            goto L22
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(com.google.android.exoplayer2.extractor.ExtractorOutput r5, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator r6) {
            r4 = this;
            r6.generateNewId()
            java.lang.String r0 = r6.getFormatId()
            r4.formatId = r0
            int r0 = r6.getTrackId()
            r1 = 2
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r5.track(r0, r1)
            r4.output = r0
            com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader r1 = new com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader
            boolean r2 = r4.allowNonIdrKeyframes
            boolean r3 = r4.detectAccessUnits
            r1.<init>(r0, r2, r3)
            r4.sampleReader = r1
            com.google.android.exoplayer2.extractor.ts.SeiReader r0 = r4.seiReader
            r0.createTracks(r5, r6)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long r4, int r6) {
            r3 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto Lb
            r3.pesTimeUs = r4
        Lb:
            boolean r4 = r3.randomAccessIndicator
            r5 = r6 & 2
            if (r5 == 0) goto L13
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            r4 = r4 | r5
            r3.randomAccessIndicator = r4
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
            r2 = this;
            r0 = 0
            r2.totalBytesWritten = r0
            r0 = 0
            r2.randomAccessIndicator = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.pesTimeUs = r0
            boolean[] r0 = r2.prefixFlags
            com.google.android.exoplayer2.util.NalUnitUtil.clearPrefixFlags(r0)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r2.sps
            r0.reset()
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r2.pps
            r0.reset()
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r2.sei
            r0.reset()
            com.google.android.exoplayer2.extractor.ts.H264Reader$SampleReader r0 = r2.sampleReader
            if (r0 == 0) goto L29
            r0.reset()
        L29:
            return
    }
}
