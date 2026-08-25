package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes2.dex */
public final class LatmReader implements com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader {
    private static final int INITIAL_BUFFER_SIZE = 1024;
    private static final int STATE_FINDING_SYNC_1 = 0;
    private static final int STATE_FINDING_SYNC_2 = 1;
    private static final int STATE_READING_HEADER = 2;
    private static final int STATE_READING_SAMPLE = 3;
    private static final int SYNC_BYTE_FIRST = 86;
    private static final int SYNC_BYTE_SECOND = 224;
    private int audioMuxVersionA;
    private int bytesRead;
    private int channelCount;

    @androidx.annotation.Nullable
    private java.lang.String codecs;
    private com.google.android.exoplayer2.Format format;
    private java.lang.String formatId;
    private int frameLengthType;

    @androidx.annotation.Nullable
    private final java.lang.String language;
    private int numSubframes;
    private long otherDataLenBits;
    private boolean otherDataPresent;
    private com.google.android.exoplayer2.extractor.TrackOutput output;
    private final com.google.android.exoplayer2.util.ParsableBitArray sampleBitArray;
    private final com.google.android.exoplayer2.util.ParsableByteArray sampleDataBuffer;
    private long sampleDurationUs;
    private int sampleRateHz;
    private int sampleSize;
    private int secondHeaderByte;
    private int state;
    private boolean streamMuxRead;
    private long timeUs;

    public LatmReader(@androidx.annotation.Nullable java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r2.language = r3
            com.google.android.exoplayer2.util.ParsableByteArray r3 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0 = 1024(0x400, float:1.435E-42)
            r3.<init>(r0)
            r2.sampleDataBuffer = r3
            com.google.android.exoplayer2.util.ParsableBitArray r0 = new com.google.android.exoplayer2.util.ParsableBitArray
            byte[] r3 = r3.getData()
            r0.<init>(r3)
            r2.sampleBitArray = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.timeUs = r0
            return
    }

    private static long latmGetValue(com.google.android.exoplayer2.util.ParsableBitArray r2) {
            r0 = 2
            int r0 = r2.readBits(r0)
            int r0 = r0 + 1
            int r0 = r0 * 8
            int r2 = r2.readBits(r0)
            long r0 = (long) r2
            return r0
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void parseAudioMuxElement(com.google.android.exoplayer2.util.ParsableBitArray r3) throws com.google.android.exoplayer2.ParserException {
            r2 = this;
            boolean r0 = r3.readBit()
            if (r0 != 0) goto Ld
            r0 = 1
            r2.streamMuxRead = r0
            r2.parseStreamMuxConfig(r3)
            goto L12
        Ld:
            boolean r0 = r2.streamMuxRead
            if (r0 != 0) goto L12
            return
        L12:
            int r0 = r2.audioMuxVersionA
            r1 = 0
            if (r0 != 0) goto L32
            int r0 = r2.numSubframes
            if (r0 != 0) goto L2d
            int r0 = r2.parsePayloadLengthInfo(r3)
            r2.parsePayloadMux(r3, r0)
            boolean r0 = r2.otherDataPresent
            if (r0 == 0) goto L2c
            long r0 = r2.otherDataLenBits
            int r1 = (int) r0
            r3.skipBits(r1)
        L2c:
            return
        L2d:
            com.google.android.exoplayer2.ParserException r3 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r1, r1)
            throw r3
        L32:
            com.google.android.exoplayer2.ParserException r3 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r1, r1)
            throw r3
    }

    private int parseAudioSpecificConfig(com.google.android.exoplayer2.util.ParsableBitArray r4) throws com.google.android.exoplayer2.ParserException {
            r3 = this;
            int r0 = r4.bitsLeft()
            r1 = 1
            com.google.android.exoplayer2.audio.AacUtil$Config r1 = com.google.android.exoplayer2.audio.AacUtil.parseAudioSpecificConfig(r4, r1)
            java.lang.String r2 = r1.codecs
            r3.codecs = r2
            int r2 = r1.sampleRateHz
            r3.sampleRateHz = r2
            int r1 = r1.channelCount
            r3.channelCount = r1
            int r4 = r4.bitsLeft()
            int r0 = r0 - r4
            return r0
    }

    private void parseFrameLength(com.google.android.exoplayer2.util.ParsableBitArray r5) {
            r4 = this;
            r0 = 3
            int r1 = r5.readBits(r0)
            r4.frameLengthType = r1
            if (r1 == 0) goto L2f
            r2 = 1
            if (r1 == r2) goto L29
            r3 = 6
            if (r1 == r0) goto L25
            r0 = 4
            if (r1 == r0) goto L25
            r0 = 5
            if (r1 == r0) goto L25
            if (r1 == r3) goto L21
            r0 = 7
            if (r1 != r0) goto L1b
            goto L21
        L1b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L21:
            r5.skipBits(r2)
            goto L34
        L25:
            r5.skipBits(r3)
            goto L34
        L29:
            r0 = 9
            r5.skipBits(r0)
            goto L34
        L2f:
            r0 = 8
            r5.skipBits(r0)
        L34:
            return
    }

    private int parsePayloadLengthInfo(com.google.android.exoplayer2.util.ParsableBitArray r4) throws com.google.android.exoplayer2.ParserException {
            r3 = this;
            int r0 = r3.frameLengthType
            if (r0 != 0) goto L11
            r0 = 0
        L5:
            r1 = 8
            int r1 = r4.readBits(r1)
            int r0 = r0 + r1
            r2 = 255(0xff, float:3.57E-43)
            if (r1 == r2) goto L5
            return r0
        L11:
            r4 = 0
            com.google.android.exoplayer2.ParserException r4 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r4, r4)
            throw r4
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void parsePayloadMux(com.google.android.exoplayer2.util.ParsableBitArray r9, int r10) {
            r8 = this;
            int r0 = r9.getPosition()
            r1 = r0 & 7
            if (r1 != 0) goto L10
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r8.sampleDataBuffer
            int r0 = r0 >> 3
            r9.setPosition(r0)
            goto L21
        L10:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r8.sampleDataBuffer
            byte[] r0 = r0.getData()
            int r1 = r10 * 8
            r2 = 0
            r9.readBits(r0, r2, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r8.sampleDataBuffer
            r9.setPosition(r2)
        L21:
            com.google.android.exoplayer2.extractor.TrackOutput r9 = r8.output
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r8.sampleDataBuffer
            r9.sampleData(r0, r10)
            long r2 = r8.timeUs
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 == 0) goto L43
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r8.output
            r4 = 1
            r6 = 0
            r7 = 0
            r5 = r10
            r1.sampleMetadata(r2, r4, r5, r6, r7)
            long r9 = r8.timeUs
            long r0 = r8.sampleDurationUs
            long r9 = r9 + r0
            r8.timeUs = r9
        L43:
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void parseStreamMuxConfig(com.google.android.exoplayer2.util.ParsableBitArray r9) throws com.google.android.exoplayer2.ParserException {
            r8 = this;
            r0 = 1
            int r1 = r9.readBits(r0)
            r2 = 0
            if (r1 != r0) goto Ld
            int r3 = r9.readBits(r0)
            goto Le
        Ld:
            r3 = 0
        Le:
            r8.audioMuxVersionA = r3
            r4 = 0
            if (r3 != 0) goto Le2
            if (r1 != r0) goto L18
            latmGetValue(r9)
        L18:
            boolean r3 = r9.readBit()
            if (r3 == 0) goto Ldd
            r3 = 6
            int r3 = r9.readBits(r3)
            r8.numSubframes = r3
            r3 = 4
            int r3 = r9.readBits(r3)
            r5 = 3
            int r5 = r9.readBits(r5)
            if (r3 != 0) goto Ld8
            if (r5 != 0) goto Ld8
            r3 = 8
            if (r1 != 0) goto L98
            int r4 = r9.getPosition()
            int r5 = r8.parseAudioSpecificConfig(r9)
            r9.setPosition(r4)
            int r4 = r5 + 7
            int r4 = r4 / r3
            byte[] r4 = new byte[r4]
            r9.readBits(r4, r2, r5)
            com.google.android.exoplayer2.Format$Builder r2 = new com.google.android.exoplayer2.Format$Builder
            r2.<init>()
            java.lang.String r5 = r8.formatId
            com.google.android.exoplayer2.Format$Builder r2 = r2.setId(r5)
            java.lang.String r5 = "audio/mp4a-latm"
            com.google.android.exoplayer2.Format$Builder r2 = r2.setSampleMimeType(r5)
            java.lang.String r5 = r8.codecs
            com.google.android.exoplayer2.Format$Builder r2 = r2.setCodecs(r5)
            int r5 = r8.channelCount
            com.google.android.exoplayer2.Format$Builder r2 = r2.setChannelCount(r5)
            int r5 = r8.sampleRateHz
            com.google.android.exoplayer2.Format$Builder r2 = r2.setSampleRate(r5)
            java.util.List r4 = java.util.Collections.singletonList(r4)
            com.google.android.exoplayer2.Format$Builder r2 = r2.setInitializationData(r4)
            java.lang.String r4 = r8.language
            com.google.android.exoplayer2.Format$Builder r2 = r2.setLanguage(r4)
            com.google.android.exoplayer2.Format r2 = r2.build()
            com.google.android.exoplayer2.Format r4 = r8.format
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto La5
            r8.format = r2
            r4 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r6 = r2.sampleRate
            long r6 = (long) r6
            long r4 = r4 / r6
            r8.sampleDurationUs = r4
            com.google.android.exoplayer2.extractor.TrackOutput r4 = r8.output
            r4.format(r2)
            goto La5
        L98:
            long r4 = latmGetValue(r9)
            int r2 = (int) r4
            int r4 = r8.parseAudioSpecificConfig(r9)
            int r2 = r2 - r4
            r9.skipBits(r2)
        La5:
            r8.parseFrameLength(r9)
            boolean r2 = r9.readBit()
            r8.otherDataPresent = r2
            r4 = 0
            r8.otherDataLenBits = r4
            if (r2 == 0) goto Lce
            if (r1 != r0) goto Lbd
            long r0 = latmGetValue(r9)
            r8.otherDataLenBits = r0
            goto Lce
        Lbd:
            boolean r0 = r9.readBit()
            long r1 = r8.otherDataLenBits
            long r1 = r1 << r3
            int r4 = r9.readBits(r3)
            long r4 = (long) r4
            long r1 = r1 + r4
            r8.otherDataLenBits = r1
            if (r0 != 0) goto Lbd
        Lce:
            boolean r0 = r9.readBit()
            if (r0 == 0) goto Ld7
            r9.skipBits(r3)
        Ld7:
            return
        Ld8:
            com.google.android.exoplayer2.ParserException r9 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r4, r4)
            throw r9
        Ldd:
            com.google.android.exoplayer2.ParserException r9 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r4, r4)
            throw r9
        Le2:
            com.google.android.exoplayer2.ParserException r9 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r4, r4)
            throw r9
    }

    private void resetBufferForSize(int r2) {
            r1 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r1.sampleDataBuffer
            r0.reset(r2)
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r1.sampleBitArray
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r1.sampleDataBuffer
            byte[] r0 = r0.getData()
            r2.reset(r0)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(com.google.android.exoplayer2.util.ParsableByteArray r7) throws com.google.android.exoplayer2.ParserException {
            r6 = this;
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r6.output
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
        L5:
            int r0 = r7.bytesLeft()
            if (r0 <= 0) goto L8b
            int r0 = r6.state
            r1 = 86
            r2 = 1
            if (r0 == 0) goto L81
            r3 = 2
            r4 = 0
            if (r0 == r2) goto L6d
            r1 = 3
            if (r0 == r3) goto L4d
            if (r0 != r1) goto L47
            int r0 = r7.bytesLeft()
            int r1 = r6.sampleSize
            int r2 = r6.bytesRead
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
            com.google.android.exoplayer2.util.ParsableBitArray r1 = r6.sampleBitArray
            byte[] r1 = r1.data
            int r2 = r6.bytesRead
            r7.readBytes(r1, r2, r0)
            int r1 = r6.bytesRead
            int r1 = r1 + r0
            r6.bytesRead = r1
            int r0 = r6.sampleSize
            if (r1 != r0) goto L5
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r6.sampleBitArray
            r0.setPosition(r4)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r6.sampleBitArray
            r6.parseAudioMuxElement(r0)
            r6.state = r4
            goto L5
        L47:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L4d:
            int r0 = r6.secondHeaderByte
            r0 = r0 & (-225(0xffffffffffffff1f, float:NaN))
            int r0 = r0 << 8
            int r2 = r7.readUnsignedByte()
            r0 = r0 | r2
            r6.sampleSize = r0
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r6.sampleDataBuffer
            byte[] r2 = r2.getData()
            int r2 = r2.length
            if (r0 <= r2) goto L68
            int r0 = r6.sampleSize
            r6.resetBufferForSize(r0)
        L68:
            r6.bytesRead = r4
            r6.state = r1
            goto L5
        L6d:
            int r0 = r7.readUnsignedByte()
            r2 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r2 != r5) goto L7c
            r6.secondHeaderByte = r0
            r6.state = r3
            goto L5
        L7c:
            if (r0 == r1) goto L5
            r6.state = r4
            goto L5
        L81:
            int r0 = r7.readUnsignedByte()
            if (r0 != r1) goto L5
            r6.state = r2
            goto L5
        L8b:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(com.google.android.exoplayer2.extractor.ExtractorOutput r3, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator r4) {
            r2 = this;
            r4.generateNewId()
            int r0 = r4.getTrackId()
            r1 = 1
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r3.track(r0, r1)
            r2.output = r3
            java.lang.String r3 = r4.getFormatId()
            r2.formatId = r3
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
            r2.timeUs = r3
        Lb:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
            r3 = this;
            r0 = 0
            r3.state = r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.timeUs = r1
            r3.streamMuxRead = r0
            return
    }
}
