package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class H262Reader implements com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader {
    private static final double[] FRAME_RATE_VALUES = null;
    private static final int START_EXTENSION = 181;
    private static final int START_GROUP = 184;
    private static final int START_PICTURE = 0;
    private static final int START_SEQUENCE_HEADER = 179;
    private static final int START_USER_DATA = 178;
    private final com.google.android.exoplayer2.extractor.ts.H262Reader.CsdBuffer csdBuffer;
    private java.lang.String formatId;
    private long frameDurationUs;
    private boolean hasOutputFormat;
    private com.google.android.exoplayer2.extractor.TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private boolean sampleHasPicture;
    private boolean sampleIsKeyframe;
    private long samplePosition;
    private long sampleTimeUs;
    private boolean startedFirstSample;
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
        public byte[] data;
        private boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

        static {
                r0 = 3
                byte[] r0 = new byte[r0]
                r0 = {x000a: FILL_ARRAY_DATA , data: [0, 0, 1} // fill-array
                com.google.android.exoplayer2.extractor.ts.H262Reader.CsdBuffer.START_CODE = r0
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

        public boolean onStartCode(int r4, int r5) {
                r3 = this;
                boolean r0 = r3.isFilling
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L19
                int r0 = r3.length
                int r0 = r0 - r5
                r3.length = r0
                int r5 = r3.sequenceExtensionPosition
                if (r5 != 0) goto L16
                r5 = 181(0xb5, float:2.54E-43)
                if (r4 != r5) goto L16
                r3.sequenceExtensionPosition = r0
                goto L1f
            L16:
                r3.isFilling = r2
                return r1
            L19:
                r5 = 179(0xb3, float:2.51E-43)
                if (r4 != r5) goto L1f
                r3.isFilling = r1
            L1f:
                byte[] r4 = com.google.android.exoplayer2.extractor.ts.H262Reader.CsdBuffer.START_CODE
                int r5 = r4.length
                r3.onData(r4, r2, r5)
                return r2
        }

        public void reset() {
                r1 = this;
                r0 = 0
                r1.isFilling = r0
                r1.length = r0
                r1.sequenceExtensionPosition = r0
                return
        }
    }

    static {
            r0 = 8
            double[] r0 = new double[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [4627441868472394375, 4627448617123184640, 4627730092099895296, 4629129031169960744, 4629137466983448576, 4632233691727265792, 4633632630797331240, 4633641066610819072} // fill-array
            com.google.android.exoplayer2.extractor.ts.H262Reader.FRAME_RATE_VALUES = r0
            return
    }

    public H262Reader() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public H262Reader(@androidx.annotation.Nullable com.google.android.exoplayer2.extractor.ts.UserDataReader r3) {
            r2 = this;
            r2.<init>()
            r2.userDataReader = r3
            r0 = 4
            boolean[] r0 = new boolean[r0]
            r2.prefixFlags = r0
            com.google.android.exoplayer2.extractor.ts.H262Reader$CsdBuffer r0 = new com.google.android.exoplayer2.extractor.ts.H262Reader$CsdBuffer
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.csdBuffer = r0
            if (r3 == 0) goto L26
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r3 = new com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer
            r0 = 178(0xb2, float:2.5E-43)
            r3.<init>(r0, r1)
            r2.userData = r3
            com.google.android.exoplayer2.util.ParsableByteArray r3 = new com.google.android.exoplayer2.util.ParsableByteArray
            r3.<init>()
            r2.userDataParsable = r3
            goto L2b
        L26:
            r3 = 0
            r2.userData = r3
            r2.userDataParsable = r3
        L2b:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.pesTimeUs = r0
            r2.sampleTimeUs = r0
            return
    }

    private static android.util.Pair<com.google.android.exoplayer2.Format, java.lang.Long> parseCsdBuffer(com.google.android.exoplayer2.extractor.ts.H262Reader.CsdBuffer r8, java.lang.String r9) {
            byte[] r0 = r8.data
            int r1 = r8.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3d
            r7 = 3
            if (r6 == r7) goto L37
            if (r6 == r1) goto L31
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L31:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L42
        L37:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L42
        L3d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L42:
            float r6 = (float) r6
            float r1 = r1 / r6
        L44:
            com.google.android.exoplayer2.Format$Builder r6 = new com.google.android.exoplayer2.Format$Builder
            r6.<init>()
            com.google.android.exoplayer2.Format$Builder r9 = r6.setId(r9)
            java.lang.String r6 = "video/mpeg2"
            com.google.android.exoplayer2.Format$Builder r9 = r9.setSampleMimeType(r6)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setWidth(r2)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setHeight(r4)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setPixelWidthHeightRatio(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setInitializationData(r1)
            com.google.android.exoplayer2.Format r9 = r9.build()
            r1 = 0
            r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + (-1)
            if (r4 < 0) goto L9e
            double[] r5 = com.google.android.exoplayer2.extractor.ts.H262Reader.FRAME_RATE_VALUES
            int r6 = r5.length
            if (r4 >= r6) goto L9e
            r1 = r5[r4]
            int r8 = r8.sequenceExtensionPosition
            int r8 = r8 + 9
            r4 = r0[r8]
            r4 = r4 & 96
            int r3 = r4 >> 5
            r8 = r0[r8]
            r8 = r8 & 31
            if (r3 == r8) goto L97
            double r3 = (double) r3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L97:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L9e:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(com.google.android.exoplayer2.util.ParsableByteArray r21) {
            r20 = this;
            r0 = r20
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r0.output
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r1)
            int r1 = r21.getPosition()
            int r2 = r21.limit()
            byte[] r3 = r21.getData()
            long r4 = r0.totalBytesWritten
            int r6 = r21.bytesLeft()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.totalBytesWritten = r4
            com.google.android.exoplayer2.extractor.TrackOutput r4 = r0.output
            int r5 = r21.bytesLeft()
            r6 = r21
            r4.sampleData(r6, r5)
        L28:
            boolean[] r4 = r0.prefixFlags
            int r4 = com.google.android.exoplayer2.util.NalUnitUtil.findNalUnit(r3, r1, r2, r4)
            if (r4 != r2) goto L41
            boolean r4 = r0.hasOutputFormat
            if (r4 != 0) goto L39
            com.google.android.exoplayer2.extractor.ts.H262Reader$CsdBuffer r4 = r0.csdBuffer
            r4.onData(r3, r1, r2)
        L39:
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r4 = r0.userData
            if (r4 == 0) goto L40
            r4.appendToNalUnit(r3, r1, r2)
        L40:
            return
        L41:
            byte[] r5 = r21.getData()
            int r7 = r4 + 3
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.hasOutputFormat
            r10 = 0
            r11 = 1
            if (r9 != 0) goto L8a
            if (r8 <= 0) goto L5a
            com.google.android.exoplayer2.extractor.ts.H262Reader$CsdBuffer r9 = r0.csdBuffer
            r9.onData(r3, r1, r4)
        L5a:
            if (r8 >= 0) goto L5e
            int r9 = -r8
            goto L5f
        L5e:
            r9 = 0
        L5f:
            com.google.android.exoplayer2.extractor.ts.H262Reader$CsdBuffer r12 = r0.csdBuffer
            boolean r9 = r12.onStartCode(r5, r9)
            if (r9 == 0) goto L8a
            com.google.android.exoplayer2.extractor.ts.H262Reader$CsdBuffer r9 = r0.csdBuffer
            java.lang.String r12 = r0.formatId
            java.lang.Object r12 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r12)
            java.lang.String r12 = (java.lang.String) r12
            android.util.Pair r9 = parseCsdBuffer(r9, r12)
            com.google.android.exoplayer2.extractor.TrackOutput r12 = r0.output
            java.lang.Object r13 = r9.first
            com.google.android.exoplayer2.Format r13 = (com.google.android.exoplayer2.Format) r13
            r12.format(r13)
            java.lang.Object r9 = r9.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            r0.frameDurationUs = r12
            r0.hasOutputFormat = r11
        L8a:
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r9 = r0.userData
            if (r9 == 0) goto Ld9
            if (r8 <= 0) goto L95
            r9.appendToNalUnit(r3, r1, r4)
            r1 = 0
            goto L96
        L95:
            int r1 = -r8
        L96:
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r8 = r0.userData
            boolean r1 = r8.endNalUnit(r1)
            if (r1 == 0) goto Lc6
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r1 = r0.userData
            byte[] r8 = r1.nalData
            int r1 = r1.nalLength
            int r1 = com.google.android.exoplayer2.util.NalUnitUtil.unescapeStream(r8, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r0.userDataParsable
            java.lang.Object r8 = com.google.android.exoplayer2.util.Util.castNonNull(r8)
            com.google.android.exoplayer2.util.ParsableByteArray r8 = (com.google.android.exoplayer2.util.ParsableByteArray) r8
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r9 = r0.userData
            byte[] r9 = r9.nalData
            r8.reset(r9, r1)
            com.google.android.exoplayer2.extractor.ts.UserDataReader r1 = r0.userDataReader
            java.lang.Object r1 = com.google.android.exoplayer2.util.Util.castNonNull(r1)
            com.google.android.exoplayer2.extractor.ts.UserDataReader r1 = (com.google.android.exoplayer2.extractor.ts.UserDataReader) r1
            long r8 = r0.sampleTimeUs
            com.google.android.exoplayer2.util.ParsableByteArray r12 = r0.userDataParsable
            r1.consume(r8, r12)
        Lc6:
            r1 = 178(0xb2, float:2.5E-43)
            if (r5 != r1) goto Ld9
            byte[] r1 = r21.getData()
            int r8 = r4 + 2
            r1 = r1[r8]
            if (r1 != r11) goto Ld9
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r1 = r0.userData
            r1.startNalUnit(r5)
        Ld9:
            if (r5 == 0) goto Le7
            r1 = 179(0xb3, float:2.51E-43)
            if (r5 != r1) goto Le0
            goto Le7
        Le0:
            r1 = 184(0xb8, float:2.58E-43)
            if (r5 != r1) goto L145
            r0.sampleIsKeyframe = r11
            goto L145
        Le7:
            int r1 = r2 - r4
            boolean r4 = r0.sampleHasPicture
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L112
            boolean r4 = r0.hasOutputFormat
            if (r4 == 0) goto L112
            long r13 = r0.sampleTimeUs
            int r4 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r4 == 0) goto L112
            boolean r15 = r0.sampleIsKeyframe
            long r11 = r0.totalBytesWritten
            r19 = r5
            long r4 = r0.samplePosition
            long r11 = r11 - r4
            int r4 = (int) r11
            int r16 = r4 - r1
            com.google.android.exoplayer2.extractor.TrackOutput r12 = r0.output
            r18 = 0
            r17 = r1
            r12.sampleMetadata(r13, r15, r16, r17, r18)
            goto L114
        L112:
            r19 = r5
        L114:
            boolean r4 = r0.startedFirstSample
            if (r4 == 0) goto L11f
            boolean r4 = r0.sampleHasPicture
            if (r4 == 0) goto L11d
            goto L11f
        L11d:
            r1 = 1
            goto L140
        L11f:
            long r4 = r0.totalBytesWritten
            long r11 = (long) r1
            long r4 = r4 - r11
            r0.samplePosition = r4
            long r4 = r0.pesTimeUs
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L12c
            goto L137
        L12c:
            long r4 = r0.sampleTimeUs
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L136
            long r11 = r0.frameDurationUs
            long r4 = r4 + r11
            goto L137
        L136:
            r4 = r8
        L137:
            r0.sampleTimeUs = r4
            r0.sampleIsKeyframe = r10
            r0.pesTimeUs = r8
            r1 = 1
            r0.startedFirstSample = r1
        L140:
            if (r19 != 0) goto L143
            r10 = 1
        L143:
            r0.sampleHasPicture = r10
        L145:
            r1 = r7
            goto L28
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
            com.google.android.exoplayer2.extractor.ts.UserDataReader r0 = r2.userDataReader
            if (r0 == 0) goto L1b
            r0.createTracks(r3, r4)
        L1b:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long r1, int r3) {
            r0 = this;
            r0.pesTimeUs = r1
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
            r2 = this;
            boolean[] r0 = r2.prefixFlags
            com.google.android.exoplayer2.util.NalUnitUtil.clearPrefixFlags(r0)
            com.google.android.exoplayer2.extractor.ts.H262Reader$CsdBuffer r0 = r2.csdBuffer
            r0.reset()
            com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer r0 = r2.userData
            if (r0 == 0) goto L11
            r0.reset()
        L11:
            r0 = 0
            r2.totalBytesWritten = r0
            r0 = 0
            r2.startedFirstSample = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.pesTimeUs = r0
            r2.sampleTimeUs = r0
            return
    }
}
