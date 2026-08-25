package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class AdtsReader implements com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader {
    private static final int CRC_SIZE = 2;
    private static final int HEADER_SIZE = 5;
    private static final int ID3_HEADER_SIZE = 10;
    private static final byte[] ID3_IDENTIFIER = null;
    private static final int ID3_SIZE_OFFSET = 6;
    private static final int MATCH_STATE_FF = 512;
    private static final int MATCH_STATE_I = 768;
    private static final int MATCH_STATE_ID = 1024;
    private static final int MATCH_STATE_START = 256;
    private static final int MATCH_STATE_VALUE_SHIFT = 8;
    private static final int STATE_CHECKING_ADTS_HEADER = 1;
    private static final int STATE_FINDING_SAMPLE = 0;
    private static final int STATE_READING_ADTS_HEADER = 3;
    private static final int STATE_READING_ID3_HEADER = 2;
    private static final int STATE_READING_SAMPLE = 4;
    private static final java.lang.String TAG = "AdtsReader";
    private static final int VERSION_UNSET = -1;
    private final com.google.android.exoplayer2.util.ParsableBitArray adtsScratch;
    private int bytesRead;
    private int currentFrameVersion;
    private com.google.android.exoplayer2.extractor.TrackOutput currentOutput;
    private long currentSampleDuration;
    private final boolean exposeId3;
    private int firstFrameSampleRateIndex;
    private int firstFrameVersion;
    private java.lang.String formatId;
    private boolean foundFirstFrame;
    private boolean hasCrc;
    private boolean hasOutputFormat;
    private final com.google.android.exoplayer2.util.ParsableByteArray id3HeaderBuffer;
    private com.google.android.exoplayer2.extractor.TrackOutput id3Output;

    @androidx.annotation.Nullable
    private final java.lang.String language;
    private int matchState;
    private com.google.android.exoplayer2.extractor.TrackOutput output;
    private long sampleDurationUs;
    private int sampleSize;
    private int state;
    private long timeUs;

    static {
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [73, 68, 51} // fill-array
            com.google.android.exoplayer2.extractor.ts.AdtsReader.ID3_IDENTIFIER = r0
            return
    }

    public AdtsReader(boolean r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AdtsReader(boolean r4, @androidx.annotation.Nullable java.lang.String r5) {
            r3 = this;
            r3.<init>()
            com.google.android.exoplayer2.util.ParsableBitArray r0 = new com.google.android.exoplayer2.util.ParsableBitArray
            r1 = 7
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
            r3.adtsScratch = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            byte[] r1 = com.google.android.exoplayer2.extractor.ts.AdtsReader.ID3_IDENTIFIER
            r2 = 10
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            r0.<init>(r1)
            r3.id3HeaderBuffer = r0
            r3.setFindingSampleState()
            r0 = -1
            r3.firstFrameVersion = r0
            r3.firstFrameSampleRateIndex = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.sampleDurationUs = r0
            r3.timeUs = r0
            r3.exposeId3 = r4
            r3.language = r5
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"output", "currentOutput", "id3Output"})
    private void assertTracksCreated() {
            r1 = this;
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r1.output
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r1.currentOutput
            com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r1.id3Output
            com.google.android.exoplayer2.util.Util.castNonNull(r0)
            return
    }

    private void checkAdtsHeader(com.google.android.exoplayer2.util.ParsableByteArray r4) {
            r3 = this;
            int r0 = r4.bytesLeft()
            if (r0 != 0) goto L7
            return
        L7:
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r3.adtsScratch
            byte[] r0 = r0.data
            r1 = 0
            byte[] r2 = r4.getData()
            int r4 = r4.getPosition()
            r4 = r2[r4]
            r0[r1] = r4
            com.google.android.exoplayer2.util.ParsableBitArray r4 = r3.adtsScratch
            r0 = 2
            r4.setPosition(r0)
            com.google.android.exoplayer2.util.ParsableBitArray r4 = r3.adtsScratch
            r0 = 4
            int r4 = r4.readBits(r0)
            int r0 = r3.firstFrameSampleRateIndex
            r1 = -1
            if (r0 == r1) goto L30
            if (r4 == r0) goto L30
            r3.resetSync()
            return
        L30:
            boolean r0 = r3.foundFirstFrame
            if (r0 != 0) goto L3d
            r0 = 1
            r3.foundFirstFrame = r0
            int r0 = r3.currentFrameVersion
            r3.firstFrameVersion = r0
            r3.firstFrameSampleRateIndex = r4
        L3d:
            r3.setReadingAdtsHeaderState()
            return
    }

    private boolean checkSyncPositionValid(com.google.android.exoplayer2.util.ParsableByteArray r9, int r10) {
            r8 = this;
            int r0 = r10 + 1
            r9.setPosition(r0)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r8.adtsScratch
            byte[] r0 = r0.data
            r1 = 1
            boolean r0 = r8.tryRead(r9, r0, r1)
            r2 = 0
            if (r0 != 0) goto L12
            return r2
        L12:
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r8.adtsScratch
            r3 = 4
            r0.setPosition(r3)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r8.adtsScratch
            int r0 = r0.readBits(r1)
            int r4 = r8.firstFrameVersion
            r5 = -1
            if (r4 == r5) goto L26
            if (r0 == r4) goto L26
            return r2
        L26:
            int r4 = r8.firstFrameSampleRateIndex
            r6 = 2
            if (r4 == r5) goto L4b
            com.google.android.exoplayer2.util.ParsableBitArray r4 = r8.adtsScratch
            byte[] r4 = r4.data
            boolean r4 = r8.tryRead(r9, r4, r1)
            if (r4 != 0) goto L36
            return r1
        L36:
            com.google.android.exoplayer2.util.ParsableBitArray r4 = r8.adtsScratch
            r4.setPosition(r6)
            com.google.android.exoplayer2.util.ParsableBitArray r4 = r8.adtsScratch
            int r4 = r4.readBits(r3)
            int r7 = r8.firstFrameSampleRateIndex
            if (r4 == r7) goto L46
            return r2
        L46:
            int r4 = r10 + 2
            r9.setPosition(r4)
        L4b:
            com.google.android.exoplayer2.util.ParsableBitArray r4 = r8.adtsScratch
            byte[] r4 = r4.data
            boolean r3 = r8.tryRead(r9, r4, r3)
            if (r3 != 0) goto L56
            return r1
        L56:
            com.google.android.exoplayer2.util.ParsableBitArray r3 = r8.adtsScratch
            r4 = 14
            r3.setPosition(r4)
            com.google.android.exoplayer2.util.ParsableBitArray r3 = r8.adtsScratch
            r4 = 13
            int r3 = r3.readBits(r4)
            r4 = 7
            if (r3 >= r4) goto L69
            return r2
        L69:
            byte[] r4 = r9.getData()
            int r9 = r9.limit()
            int r10 = r10 + r3
            if (r10 < r9) goto L75
            return r1
        L75:
            r3 = r4[r10]
            if (r3 != r5) goto L90
            int r10 = r10 + r1
            if (r10 != r9) goto L7d
            return r1
        L7d:
            r9 = r4[r10]
            boolean r9 = r8.isAdtsSyncBytes(r5, r9)
            if (r9 == 0) goto L8e
            r9 = r4[r10]
            r9 = r9 & 8
            int r9 = r9 >> 3
            if (r9 != r0) goto L8e
            goto L8f
        L8e:
            r1 = 0
        L8f:
            return r1
        L90:
            r0 = r4[r10]
            r3 = 73
            if (r0 == r3) goto L97
            return r2
        L97:
            int r0 = r10 + 1
            if (r0 != r9) goto L9c
            return r1
        L9c:
            r0 = r4[r0]
            r3 = 68
            if (r0 == r3) goto La3
            return r2
        La3:
            int r10 = r10 + r6
            if (r10 != r9) goto La7
            return r1
        La7:
            r9 = r4[r10]
            r10 = 51
            if (r9 != r10) goto Lae
            goto Laf
        Lae:
            r1 = 0
        Laf:
            return r1
    }

    private boolean continueRead(com.google.android.exoplayer2.util.ParsableByteArray r3, byte[] r4, int r5) {
            r2 = this;
            int r0 = r3.bytesLeft()
            int r1 = r2.bytesRead
            int r1 = r5 - r1
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r2.bytesRead
            r3.readBytes(r4, r1, r0)
            int r3 = r2.bytesRead
            int r3 = r3 + r0
            r2.bytesRead = r3
            if (r3 != r5) goto L1a
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            return r3
    }

    private void findNextSample(com.google.android.exoplayer2.util.ParsableByteArray r8) {
            r7 = this;
            byte[] r0 = r8.getData()
            int r1 = r8.getPosition()
            int r2 = r8.limit()
        Lc:
            if (r1 >= r2) goto L7c
            int r3 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r4 = r7.matchState
            r5 = 512(0x200, float:7.17E-43)
            if (r4 != r5) goto L4b
            byte r4 = (byte) r1
            r6 = -1
            boolean r4 = r7.isAdtsSyncBytes(r6, r4)
            if (r4 == 0) goto L4b
            boolean r4 = r7.foundFirstFrame
            if (r4 != 0) goto L2e
            int r4 = r3 + (-2)
            boolean r4 = r7.checkSyncPositionValid(r8, r4)
            if (r4 == 0) goto L4b
        L2e:
            r0 = r1 & 8
            int r0 = r0 >> 3
            r7.currentFrameVersion = r0
            r0 = 1
            r1 = r1 & r0
            if (r1 != 0) goto L39
            goto L3a
        L39:
            r0 = 0
        L3a:
            r7.hasCrc = r0
            boolean r0 = r7.foundFirstFrame
            if (r0 != 0) goto L44
            r7.setCheckingAdtsHeaderState()
            goto L47
        L44:
            r7.setReadingAdtsHeaderState()
        L47:
            r8.setPosition(r3)
            return
        L4b:
            int r4 = r7.matchState
            r1 = r1 | r4
            r6 = 329(0x149, float:4.61E-43)
            if (r1 == r6) goto L76
            r6 = 511(0x1ff, float:7.16E-43)
            if (r1 == r6) goto L73
            r5 = 836(0x344, float:1.171E-42)
            if (r1 == r5) goto L6e
            r5 = 1075(0x433, float:1.506E-42)
            if (r1 == r5) goto L67
            r1 = 256(0x100, float:3.59E-43)
            if (r4 == r1) goto L7a
            r7.matchState = r1
            int r3 = r3 + (-1)
            goto L7a
        L67:
            r7.setReadingId3HeaderState()
            r8.setPosition(r3)
            return
        L6e:
            r1 = 1024(0x400, float:1.435E-42)
            r7.matchState = r1
            goto L7a
        L73:
            r7.matchState = r5
            goto L7a
        L76:
            r1 = 768(0x300, float:1.076E-42)
            r7.matchState = r1
        L7a:
            r1 = r3
            goto Lc
        L7c:
            r8.setPosition(r1)
            return
    }

    private boolean isAdtsSyncBytes(byte r1, byte r2) {
            r0 = this;
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1 = r1 | r2
            boolean r1 = isAdtsSyncWord(r1)
            return r1
    }

    public static boolean isAdtsSyncWord(int r1) {
            r0 = 65526(0xfff6, float:9.1821E-41)
            r1 = r1 & r0
            r0 = 65520(0xfff0, float:9.1813E-41)
            if (r1 != r0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void parseAdtsHeader() throws com.google.android.exoplayer2.ParserException {
            r8 = this;
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r8.adtsScratch
            r1 = 0
            r0.setPosition(r1)
            boolean r0 = r8.hasOutputFormat
            r1 = 5
            r2 = 2
            if (r0 != 0) goto L8e
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r8.adtsScratch
            int r0 = r0.readBits(r2)
            r3 = 1
            int r0 = r0 + r3
            if (r0 == r2) goto L32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Detected audio object type: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ", but assuming AAC LC."
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "AdtsReader"
            com.google.android.exoplayer2.util.Log.w(r4, r0)
            r0 = 2
        L32:
            com.google.android.exoplayer2.util.ParsableBitArray r4 = r8.adtsScratch
            r4.skipBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r4 = r8.adtsScratch
            r5 = 3
            int r4 = r4.readBits(r5)
            int r5 = r8.firstFrameSampleRateIndex
            byte[] r0 = com.google.android.exoplayer2.audio.AacUtil.buildAudioSpecificConfig(r0, r5, r4)
            com.google.android.exoplayer2.audio.AacUtil$Config r4 = com.google.android.exoplayer2.audio.AacUtil.parseAudioSpecificConfig(r0)
            com.google.android.exoplayer2.Format$Builder r5 = new com.google.android.exoplayer2.Format$Builder
            r5.<init>()
            java.lang.String r6 = r8.formatId
            com.google.android.exoplayer2.Format$Builder r5 = r5.setId(r6)
            java.lang.String r6 = "audio/mp4a-latm"
            com.google.android.exoplayer2.Format$Builder r5 = r5.setSampleMimeType(r6)
            java.lang.String r6 = r4.codecs
            com.google.android.exoplayer2.Format$Builder r5 = r5.setCodecs(r6)
            int r6 = r4.channelCount
            com.google.android.exoplayer2.Format$Builder r5 = r5.setChannelCount(r6)
            int r4 = r4.sampleRateHz
            com.google.android.exoplayer2.Format$Builder r4 = r5.setSampleRate(r4)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            com.google.android.exoplayer2.Format$Builder r0 = r4.setInitializationData(r0)
            java.lang.String r4 = r8.language
            com.google.android.exoplayer2.Format$Builder r0 = r0.setLanguage(r4)
            com.google.android.exoplayer2.Format r0 = r0.build()
            r4 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r6 = r0.sampleRate
            long r6 = (long) r6
            long r4 = r4 / r6
            r8.sampleDurationUs = r4
            com.google.android.exoplayer2.extractor.TrackOutput r4 = r8.output
            r4.format(r0)
            r8.hasOutputFormat = r3
            goto L95
        L8e:
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r8.adtsScratch
            r3 = 10
            r0.skipBits(r3)
        L95:
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r8.adtsScratch
            r3 = 4
            r0.skipBits(r3)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r8.adtsScratch
            r3 = 13
            int r0 = r0.readBits(r3)
            int r0 = r0 - r2
            int r0 = r0 - r1
            boolean r1 = r8.hasCrc
            if (r1 == 0) goto Lab
            int r0 = r0 + (-2)
        Lab:
            r6 = r0
            com.google.android.exoplayer2.extractor.TrackOutput r2 = r8.output
            long r3 = r8.sampleDurationUs
            r5 = 0
            r1 = r8
            r1.setReadingSampleState(r2, r3, r5, r6)
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"id3Output"})
    private void parseId3Header() {
            r9 = this;
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r9.id3Output
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r9.id3HeaderBuffer
            r2 = 10
            r0.sampleData(r1, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r9.id3HeaderBuffer
            r1 = 6
            r0.setPosition(r1)
            com.google.android.exoplayer2.extractor.TrackOutput r4 = r9.id3Output
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r9.id3HeaderBuffer
            int r0 = r0.readSynchSafeInt()
            int r8 = r0 + 10
            r5 = 0
            r7 = 10
            r3 = r9
            r3.setReadingSampleState(r4, r5, r7, r8)
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"currentOutput"})
    private void readSample(com.google.android.exoplayer2.util.ParsableByteArray r8) {
            r7 = this;
            int r0 = r8.bytesLeft()
            int r1 = r7.sampleSize
            int r2 = r7.bytesRead
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r7.currentOutput
            r1.sampleData(r8, r0)
            int r8 = r7.bytesRead
            int r8 = r8 + r0
            r7.bytesRead = r8
            int r4 = r7.sampleSize
            if (r8 != r4) goto L38
            long r1 = r7.timeUs
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 == 0) goto L35
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r7.currentOutput
            r3 = 1
            r5 = 0
            r6 = 0
            r0.sampleMetadata(r1, r3, r4, r5, r6)
            long r0 = r7.timeUs
            long r2 = r7.currentSampleDuration
            long r0 = r0 + r2
            r7.timeUs = r0
        L35:
            r7.setFindingSampleState()
        L38:
            return
    }

    private void resetSync() {
            r1 = this;
            r0 = 0
            r1.foundFirstFrame = r0
            r1.setFindingSampleState()
            return
    }

    private void setCheckingAdtsHeaderState() {
            r1 = this;
            r0 = 1
            r1.state = r0
            r0 = 0
            r1.bytesRead = r0
            return
    }

    private void setFindingSampleState() {
            r1 = this;
            r0 = 0
            r1.state = r0
            r1.bytesRead = r0
            r0 = 256(0x100, float:3.59E-43)
            r1.matchState = r0
            return
    }

    private void setReadingAdtsHeaderState() {
            r1 = this;
            r0 = 3
            r1.state = r0
            r0 = 0
            r1.bytesRead = r0
            return
    }

    private void setReadingId3HeaderState() {
            r2 = this;
            r0 = 2
            r2.state = r0
            byte[] r0 = com.google.android.exoplayer2.extractor.ts.AdtsReader.ID3_IDENTIFIER
            int r0 = r0.length
            r2.bytesRead = r0
            r0 = 0
            r2.sampleSize = r0
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r2.id3HeaderBuffer
            r1.setPosition(r0)
            return
    }

    private void setReadingSampleState(com.google.android.exoplayer2.extractor.TrackOutput r2, long r3, int r5, int r6) {
            r1 = this;
            r0 = 4
            r1.state = r0
            r1.bytesRead = r5
            r1.currentOutput = r2
            r1.currentSampleDuration = r3
            r1.sampleSize = r6
            return
    }

    private boolean tryRead(com.google.android.exoplayer2.util.ParsableByteArray r3, byte[] r4, int r5) {
            r2 = this;
            int r0 = r3.bytesLeft()
            r1 = 0
            if (r0 >= r5) goto L8
            return r1
        L8:
            r3.readBytes(r4, r1, r5)
            r3 = 1
            return r3
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(com.google.android.exoplayer2.util.ParsableByteArray r3) throws com.google.android.exoplayer2.ParserException {
            r2 = this;
            r2.assertTracksCreated()
        L3:
            int r0 = r3.bytesLeft()
            if (r0 <= 0) goto L52
            int r0 = r2.state
            if (r0 == 0) goto L4e
            r1 = 1
            if (r0 == r1) goto L4a
            r1 = 2
            if (r0 == r1) goto L38
            r1 = 3
            if (r0 == r1) goto L23
            r1 = 4
            if (r0 != r1) goto L1d
            r2.readSample(r3)
            goto L3
        L1d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L23:
            boolean r0 = r2.hasCrc
            if (r0 == 0) goto L29
            r0 = 7
            goto L2a
        L29:
            r0 = 5
        L2a:
            com.google.android.exoplayer2.util.ParsableBitArray r1 = r2.adtsScratch
            byte[] r1 = r1.data
            boolean r0 = r2.continueRead(r3, r1, r0)
            if (r0 == 0) goto L3
            r2.parseAdtsHeader()
            goto L3
        L38:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r2.id3HeaderBuffer
            byte[] r0 = r0.getData()
            r1 = 10
            boolean r0 = r2.continueRead(r3, r0, r1)
            if (r0 == 0) goto L3
            r2.parseId3Header()
            goto L3
        L4a:
            r2.checkAdtsHeader(r3)
            goto L3
        L4e:
            r2.findNextSample(r3)
            goto L3
        L52:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(com.google.android.exoplayer2.extractor.ExtractorOutput r3, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator r4) {
            r2 = this;
            r4.generateNewId()
            java.lang.String r0 = r4.getFormatId()
            r2.formatId = r0
            int r0 = r4.getTrackId()
            r1 = 1
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r3.track(r0, r1)
            r2.output = r0
            r2.currentOutput = r0
            boolean r0 = r2.exposeId3
            if (r0 == 0) goto L43
            r4.generateNewId()
            int r0 = r4.getTrackId()
            r1 = 5
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r3.track(r0, r1)
            r2.id3Output = r3
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            java.lang.String r4 = r4.getFormatId()
            com.google.android.exoplayer2.Format$Builder r4 = r0.setId(r4)
            java.lang.String r0 = "application/id3"
            com.google.android.exoplayer2.Format$Builder r4 = r4.setSampleMimeType(r0)
            com.google.android.exoplayer2.Format r4 = r4.build()
            r3.format(r4)
            goto L4a
        L43:
            com.google.android.exoplayer2.extractor.DummyTrackOutput r3 = new com.google.android.exoplayer2.extractor.DummyTrackOutput
            r3.<init>()
            r2.id3Output = r3
        L4a:
            return
    }

    public long getSampleDurationUs() {
            r2 = this;
            long r0 = r2.sampleDurationUs
            return r0
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
            r2.timeUs = r3
        Lb:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.timeUs = r0
            r2.resetSync()
            return
    }
}
