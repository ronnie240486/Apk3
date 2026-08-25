package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes3.dex */
public final class H263Reader implements com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader {
    private static final float[] PIXEL_WIDTH_HEIGHT_RATIO_BY_ASPECT_RATIO_INFO = null;
    private static final int START_CODE_VALUE_GROUP_OF_VOP = 179;
    private static final int START_CODE_VALUE_MAX_VIDEO_OBJECT = 31;
    private static final int START_CODE_VALUE_UNSET = -1;
    private static final int START_CODE_VALUE_USER_DATA = 178;
    private static final int START_CODE_VALUE_VISUAL_OBJECT = 181;
    private static final int START_CODE_VALUE_VISUAL_OBJECT_SEQUENCE = 176;
    private static final int START_CODE_VALUE_VOP = 182;
    private static final java.lang.String TAG = "H263Reader";
    private static final int VIDEO_OBJECT_LAYER_SHAPE_RECTANGULAR = 0;
    private final com.google.android.exoplayer2.extractor.ts.H263Reader.CsdBuffer csdBuffer;
    private java.lang.String formatId;
    private boolean hasOutputFormat;
    private com.google.android.exoplayer2.extractor.TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private com.google.android.exoplayer2.extractor.ts.H263Reader.SampleReader sampleReader;
    private long totalBytesWritten;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer userData;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.util.ParsableByteArray userDataParsable;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.extractor.ts.UserDataReader userDataReader;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class CsdBuffer {
        private static final byte[] START_CODE = null;
        private static final int STATE_EXPECT_VIDEO_OBJECT_LAYER_START = 3;
        private static final int STATE_EXPECT_VIDEO_OBJECT_START = 2;
        private static final int STATE_EXPECT_VISUAL_OBJECT_START = 1;
        private static final int STATE_SKIP_TO_VISUAL_OBJECT_SEQUENCE_START = 0;
        private static final int STATE_WAIT_FOR_VOP_START = 4;
        public byte[] data;
        private boolean isFilling;
        public int length;
        private int state;
        public int volStartPosition;

        static {
                r0 = 3
                byte[] r0 = new byte[r0]
                r0 = {x000a: FILL_ARRAY_DATA , data: [0, 0, 1} // fill-array
                com.google.android.exoplayer2.extractor.ts.H263Reader.CsdBuffer.START_CODE = r0
                return
        }

        public CsdBuffer(int r1) {
                r0 = this;
                r0.<init>()
                byte[] r1 = new byte[r1]
                r0.data = r1
                return
        }

        public void onData(byte[] r5, int r6, int r7) {
                r4 = this;
                boolean r0 = r4.isFilling
                if (r0 != 0) goto L5
                return
            L5:
                int r7 = r7 - r6
                byte[] r0 = r4.data
                int r1 = r0.length
                int r2 = r4.length
                int r3 = r2 + r7
                if (r1 >= r3) goto L18
                int r2 = r2 + r7
                int r2 = r2 * 2
                byte[] r0 = java.util.Arrays.copyOf(r0, r2)
                r4.data = r0
            L18:
                byte[] r0 = r4.data
                int r1 = r4.length
                java.lang.System.arraycopy(r5, r6, r0, r1, r7)
                int r5 = r4.length
                int r5 = r5 + r7
                r4.length = r5
                return
        }

        public boolean onStartCode(int r9, int r10) {
                r8 = this;
                int r0 = r8.state
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L59
                r3 = 181(0xb5, float:2.54E-43)
                r4 = 2
                java.lang.String r5 = "Unexpected start code value"
                java.lang.String r6 = "H263Reader"
                if (r0 == r2) goto L4d
                r7 = 3
                if (r0 == r4) goto L3f
                r4 = 4
                if (r0 == r7) goto L2b
                if (r0 != r4) goto L25
                r0 = 179(0xb3, float:2.51E-43)
                if (r9 == r0) goto L1d
                if (r9 != r3) goto L61
            L1d:
                int r9 = r8.length
                int r9 = r9 - r10
                r8.length = r9
                r8.isFilling = r1
                return r2
            L25:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>()
                throw r9
            L2b:
                r9 = r9 & 240(0xf0, float:3.36E-43)
                r10 = 32
                if (r9 == r10) goto L38
                com.google.android.exoplayer2.util.Log.w(r6, r5)
                r8.reset()
                goto L61
            L38:
                int r9 = r8.length
                r8.volStartPosition = r9
                r8.state = r4
                goto L61
            L3f:
                r10 = 31
                if (r9 <= r10) goto L4a
                com.google.android.exoplayer2.util.Log.w(r6, r5)
                r8.reset()
                goto L61
            L4a:
                r8.state = r7
                goto L61
            L4d:
                if (r9 == r3) goto L56
                com.google.android.exoplayer2.util.Log.w(r6, r5)
                r8.reset()
                goto L61
            L56:
                r8.state = r4
                goto L61
            L59:
                r10 = 176(0xb0, float:2.47E-43)
                if (r9 != r10) goto L61
                r8.state = r2
                r8.isFilling = r2
            L61:
                byte[] r9 = com.google.android.exoplayer2.extractor.ts.H263Reader.CsdBuffer.START_CODE
                int r10 = r9.length
                r8.onData(r9, r1, r10)
                return r1
        }

        public void reset() {
                r1 = this;
                r0 = 0
                r1.isFilling = r0
                r1.length = r0
                r1.state = r0
                return
        }
    }

    public static final class SampleReader {
        private static final int OFFSET_VOP_CODING_TYPE = 1;
        private static final int VOP_CODING_TYPE_INTRA = 0;
        private boolean lookingForVopCodingType;
        private final com.google.android.exoplayer2.extractor.TrackOutput output;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;
        private int startCodeValue;
        private int vopBytesRead;

        public SampleReader(com.google.android.exoplayer2.extractor.TrackOutput r1) {
                r0 = this;
                r0.<init>()
                r0.output = r1
                return
        }

        public void onData(byte[] r3, int r4, int r5) {
                r2 = this;
                boolean r0 = r2.lookingForVopCodingType
                if (r0 == 0) goto L20
                int r0 = r4 + 1
                int r1 = r2.vopBytesRead
                int r0 = r0 - r1
                if (r0 >= r5) goto L1c
                r3 = r3[r0]
                r3 = r3 & 192(0xc0, float:2.69E-43)
                int r3 = r3 >> 6
                r4 = 0
                if (r3 != 0) goto L16
                r3 = 1
                goto L17
            L16:
                r3 = 0
            L17:
                r2.sampleIsKeyframe = r3
                r2.lookingForVopCodingType = r4
                goto L20
            L1c:
                int r5 = r5 - r4
                int r5 = r5 + r1
                r2.vopBytesRead = r5
            L20:
                return
        }

        public void onDataEnd(long r8, int r10, boolean r11) {
                r7 = this;
                int r0 = r7.startCodeValue
                r1 = 182(0xb6, float:2.55E-43)
                if (r0 != r1) goto L25
                if (r11 == 0) goto L25
                boolean r11 = r7.readingSample
                if (r11 == 0) goto L25
                long r1 = r7.sampleTimeUs
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r11 == 0) goto L25
                long r3 = r7.samplePosition
                long r3 = r8 - r3
                int r4 = (int) r3
                boolean r3 = r7.sampleIsKeyframe
                com.google.android.exoplayer2.extractor.TrackOutput r0 = r7.output
                r6 = 0
                r5 = r10
                r0.sampleMetadata(r1, r3, r4, r5, r6)
            L25:
                int r10 = r7.startCodeValue
                r11 = 179(0xb3, float:2.51E-43)
                if (r10 == r11) goto L2d
                r7.samplePosition = r8
            L2d:
                return
        }

        public void onStartCode(int r5, long r6) {
                r4 = this;
                r4.startCodeValue = r5
                r0 = 0
                r4.sampleIsKeyframe = r0
                r1 = 1
                r2 = 182(0xb6, float:2.55E-43)
                if (r5 == r2) goto L11
                r3 = 179(0xb3, float:2.51E-43)
                if (r5 != r3) goto Lf
                goto L11
            Lf:
                r3 = 0
                goto L12
            L11:
                r3 = 1
            L12:
                r4.readingSample = r3
                if (r5 != r2) goto L17
                goto L18
            L17:
                r1 = 0
            L18:
                r4.lookingForVopCodingType = r1
                r4.vopBytesRead = r0
                r4.sampleTimeUs = r6
                return
        }

        public void reset() {
                r1 = this;
                r0 = 0
                r1.readingSample = r0
                r1.lookingForVopCodingType = r0
                r1.sampleIsKeyframe = r0
                r0 = -1
                r1.startCodeValue = r0
                return
        }
    }

    static {
            r0 = 7
            float[] r0 = new float[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1065353216, 1065353216, 1066115817, 1063828015, 1069166220, 1067132618, 1065353216} // fill-array
            com.google.android.exoplayer2.extractor.ts.H263Reader.PIXEL_WIDTH_HEIGHT_RATIO_BY_ASPECT_RATIO_INFO = r0
            return
    }

    public H263Reader() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public H263Reader(@androidx.annotation.Nullable com.google.android.exoplayer2.extractor.ts.UserDataReader r5) {
            r4 = this;
            r4.<init>()
            r4.userDataReader = r5
            r0 = 4
            boolean[] r0 = new boolean[r0]
            r4.prefixFlags = r0
            com.google.android.exoplayer2.extractor.ts.H263Reader$CsdBuffer r0 = new com.google.android.exoplayer2.extractor.ts.H263Reader$CsdBuffer
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r4.csdBuffer = r0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.pesTimeUs = r2
            if (r5 == 0) goto L2d
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r5 = new com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer
            r0 = 178(0xb2, float:2.5E-43)
            r5.<init>(r0, r1)
            r4.userData = r5
            com.google.android.exoplayer2.util.ParsableByteArray r5 = new com.google.android.exoplayer2.util.ParsableByteArray
            r5.<init>()
            r4.userDataParsable = r5
            goto L32
        L2d:
            r5 = 0
            r4.userData = r5
            r4.userDataParsable = r5
        L32:
            return
    }

    private static com.google.android.exoplayer2.Format parseCsdBuffer(com.google.android.exoplayer2.extractor.ts.H263Reader.CsdBuffer r8, int r9, java.lang.String r10) {
            byte[] r0 = r8.data
            int r8 = r8.length
            byte[] r8 = java.util.Arrays.copyOf(r0, r8)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = new com.google.android.exoplayer2.util.ParsableBitArray
            r0.<init>(r8)
            r0.skipBytes(r9)
            r9 = 4
            r0.skipBytes(r9)
            r0.skipBit()
            r1 = 8
            r0.skipBits(r1)
            boolean r2 = r0.readBit()
            r3 = 3
            if (r2 == 0) goto L29
            r0.skipBits(r9)
            r0.skipBits(r3)
        L29:
            int r9 = r0.readBits(r9)
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r4 = "Invalid aspect ratio"
            java.lang.String r5 = "H263Reader"
            r6 = 15
            if (r9 != r6) goto L4a
            int r9 = r0.readBits(r1)
            int r1 = r0.readBits(r1)
            if (r1 != 0) goto L45
            com.google.android.exoplayer2.util.Log.w(r5, r4)
            goto L55
        L45:
            float r9 = (float) r9
            float r1 = (float) r1
            float r9 = r9 / r1
            r2 = r9
            goto L55
        L4a:
            float[] r1 = com.google.android.exoplayer2.extractor.ts.H263Reader.PIXEL_WIDTH_HEIGHT_RATIO_BY_ASPECT_RATIO_INFO
            int r7 = r1.length
            if (r9 >= r7) goto L52
            r2 = r1[r9]
            goto L55
        L52:
            com.google.android.exoplayer2.util.Log.w(r5, r4)
        L55:
            boolean r9 = r0.readBit()
            r1 = 2
            if (r9 == 0) goto L8c
            r0.skipBits(r1)
            r9 = 1
            r0.skipBits(r9)
            boolean r9 = r0.readBit()
            if (r9 == 0) goto L8c
            r0.skipBits(r6)
            r0.skipBit()
            r0.skipBits(r6)
            r0.skipBit()
            r0.skipBits(r6)
            r0.skipBit()
            r0.skipBits(r3)
            r9 = 11
            r0.skipBits(r9)
            r0.skipBit()
            r0.skipBits(r6)
            r0.skipBit()
        L8c:
            int r9 = r0.readBits(r1)
            if (r9 == 0) goto L97
            java.lang.String r9 = "Unhandled video object layer shape"
            com.google.android.exoplayer2.util.Log.w(r5, r9)
        L97:
            r0.skipBit()
            r9 = 16
            int r9 = r0.readBits(r9)
            r0.skipBit()
            boolean r1 = r0.readBit()
            if (r1 == 0) goto Lbe
            if (r9 != 0) goto Lb1
            java.lang.String r9 = "Invalid vop_increment_time_resolution"
            com.google.android.exoplayer2.util.Log.w(r5, r9)
            goto Lbe
        Lb1:
            int r9 = r9 + (-1)
            r1 = 0
        Lb4:
            if (r9 <= 0) goto Lbb
            int r1 = r1 + 1
            int r9 = r9 >> 1
            goto Lb4
        Lbb:
            r0.skipBits(r1)
        Lbe:
            r0.skipBit()
            r9 = 13
            int r1 = r0.readBits(r9)
            r0.skipBit()
            int r9 = r0.readBits(r9)
            r0.skipBit()
            r0.skipBit()
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            com.google.android.exoplayer2.Format$Builder r10 = r0.setId(r10)
            java.lang.String r0 = "video/mp4v-es"
            com.google.android.exoplayer2.Format$Builder r10 = r10.setSampleMimeType(r0)
            com.google.android.exoplayer2.Format$Builder r10 = r10.setWidth(r1)
            com.google.android.exoplayer2.Format$Builder r9 = r10.setHeight(r9)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setPixelWidthHeightRatio(r2)
            java.util.List r8 = java.util.Collections.singletonList(r8)
            com.google.android.exoplayer2.Format$Builder r8 = r9.setInitializationData(r8)
            com.google.android.exoplayer2.Format r8 = r8.build()
            return r8
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(com.google.android.exoplayer2.util.ParsableByteArray r14) {
            r13 = this;
            com.google.android.exoplayer2.extractor.ts.H263Reader$SampleReader r0 = r13.sampleReader
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r13.output
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            int r0 = r14.getPosition()
            int r1 = r14.limit()
            byte[] r2 = r14.getData()
            long r3 = r13.totalBytesWritten
            int r5 = r14.bytesLeft()
            long r5 = (long) r5
            long r3 = r3 + r5
            r13.totalBytesWritten = r3
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r13.output
            int r4 = r14.bytesLeft()
            r3.sampleData(r14, r4)
        L29:
            boolean[] r3 = r13.prefixFlags
            int r3 = com.google.android.exoplayer2.util.NalUnitUtil.findNalUnit(r2, r0, r1, r3)
            if (r3 != r1) goto L47
            boolean r14 = r13.hasOutputFormat
            if (r14 != 0) goto L3a
            com.google.android.exoplayer2.extractor.ts.H263Reader$CsdBuffer r14 = r13.csdBuffer
            r14.onData(r2, r0, r1)
        L3a:
            com.google.android.exoplayer2.extractor.ts.H263Reader$SampleReader r14 = r13.sampleReader
            r14.onData(r2, r0, r1)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r14 = r13.userData
            if (r14 == 0) goto L46
            r14.appendToNalUnit(r2, r0, r1)
        L46:
            return
        L47:
            byte[] r4 = r14.getData()
            int r5 = r3 + 3
            r4 = r4[r5]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r3 - r0
            boolean r7 = r13.hasOutputFormat
            r8 = 1
            r9 = 0
            if (r7 != 0) goto L84
            if (r6 <= 0) goto L60
            com.google.android.exoplayer2.extractor.ts.H263Reader$CsdBuffer r7 = r13.csdBuffer
            r7.onData(r2, r0, r3)
        L60:
            if (r6 >= 0) goto L64
            int r7 = -r6
            goto L65
        L64:
            r7 = 0
        L65:
            com.google.android.exoplayer2.extractor.ts.H263Reader$CsdBuffer r10 = r13.csdBuffer
            boolean r7 = r10.onStartCode(r4, r7)
            if (r7 == 0) goto L84
            com.google.android.exoplayer2.extractor.TrackOutput r7 = r13.output
            com.google.android.exoplayer2.extractor.ts.H263Reader$CsdBuffer r10 = r13.csdBuffer
            int r11 = r10.volStartPosition
            java.lang.String r12 = r13.formatId
            java.lang.Object r12 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r12)
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.exoplayer2.Format r10 = parseCsdBuffer(r10, r11, r12)
            r7.format(r10)
            r13.hasOutputFormat = r8
        L84:
            com.google.android.exoplayer2.extractor.ts.H263Reader$SampleReader r7 = r13.sampleReader
            r7.onData(r2, r0, r3)
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r7 = r13.userData
            if (r7 == 0) goto Ld7
            if (r6 <= 0) goto L93
            r7.appendToNalUnit(r2, r0, r3)
            goto L94
        L93:
            int r9 = -r6
        L94:
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r13.userData
            boolean r0 = r0.endNalUnit(r9)
            if (r0 == 0) goto Lc4
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r13.userData
            byte[] r6 = r0.nalData
            int r0 = r0.nalLength
            int r0 = com.google.android.exoplayer2.util.NalUnitUtil.unescapeStream(r6, r0)
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r13.userDataParsable
            java.lang.Object r6 = com.google.android.exoplayer2.util.Util.castNonNull(r6)
            com.google.android.exoplayer2.util.ParsableByteArray r6 = (com.google.android.exoplayer2.util.ParsableByteArray) r6
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r7 = r13.userData
            byte[] r7 = r7.nalData
            r6.reset(r7, r0)
            com.google.android.exoplayer2.extractor.ts.UserDataReader r0 = r13.userDataReader
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.extractor.ts.UserDataReader r0 = (com.google.android.exoplayer2.extractor.ts.UserDataReader) r0
            long r6 = r13.pesTimeUs
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r13.userDataParsable
            r0.consume(r6, r9)
        Lc4:
            r0 = 178(0xb2, float:2.5E-43)
            if (r4 != r0) goto Ld7
            byte[] r0 = r14.getData()
            int r6 = r3 + 2
            r0 = r0[r6]
            if (r0 != r8) goto Ld7
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r13.userData
            r0.startNalUnit(r4)
        Ld7:
            int r0 = r1 - r3
            long r6 = r13.totalBytesWritten
            long r8 = (long) r0
            long r6 = r6 - r8
            com.google.android.exoplayer2.extractor.ts.H263Reader$SampleReader r3 = r13.sampleReader
            boolean r8 = r13.hasOutputFormat
            r3.onDataEnd(r6, r0, r8)
            com.google.android.exoplayer2.extractor.ts.H263Reader$SampleReader r0 = r13.sampleReader
            long r6 = r13.pesTimeUs
            r0.onStartCode(r4, r6)
            r0 = r5
            goto L29
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
            com.google.android.exoplayer2.extractor.ts.H263Reader$SampleReader r1 = new com.google.android.exoplayer2.extractor.ts.H263Reader$SampleReader
            r1.<init>(r0)
            r2.sampleReader = r1
            com.google.android.exoplayer2.extractor.ts.UserDataReader r0 = r2.userDataReader
            if (r0 == 0) goto L22
            r0.createTracks(r3, r4)
        L22:
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
            boolean[] r0 = r2.prefixFlags
            com.google.android.exoplayer2.util.NalUnitUtil.clearPrefixFlags(r0)
            com.google.android.exoplayer2.extractor.ts.H263Reader$CsdBuffer r0 = r2.csdBuffer
            r0.reset()
            com.google.android.exoplayer2.extractor.ts.H263Reader$SampleReader r0 = r2.sampleReader
            if (r0 == 0) goto L11
            r0.reset()
        L11:
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r2.userData
            if (r0 == 0) goto L18
            r0.reset()
        L18:
            r0 = 0
            r2.totalBytesWritten = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.pesTimeUs = r0
            return
    }
}
