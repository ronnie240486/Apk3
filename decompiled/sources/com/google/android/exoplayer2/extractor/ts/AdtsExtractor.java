package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class AdtsExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory FACTORY = null;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    private static final int MAX_PACKET_SIZE = 2048;
    private static final int MAX_SNIFF_BYTES = 8192;
    private static final int NUM_FRAMES_FOR_AVERAGE_FRAME_SIZE = 1000;
    private int averageFrameSize;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private long firstFramePosition;
    private long firstSampleTimestampUs;
    private final int flags;
    private boolean hasCalculatedAverageFrameSize;
    private boolean hasOutputSeekMap;
    private final com.google.android.exoplayer2.util.ParsableByteArray packetBuffer;
    private final com.google.android.exoplayer2.extractor.ts.AdtsReader reader;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch;
    private final com.google.android.exoplayer2.util.ParsableBitArray scratchBits;
    private boolean startedPacket;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] $r8$lambda$RRZPZ_dt0w4tptcNvg0s35Qja4c() {
            com.google.android.exoplayer2.extractor.Extractor[] r0 = lambda$static$0()
            return r0
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$11
            com.google.android.exoplayer2.extractor.ts.AdtsExtractor.FACTORY = r0
            return
    }

    public AdtsExtractor() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public AdtsExtractor(int r3) {
            r2 = this;
            r2.<init>()
            r0 = r3 & 2
            if (r0 == 0) goto L9
            r3 = r3 | 1
        L9:
            r2.flags = r3
            com.google.android.exoplayer2.extractor.ts.AdtsReader r3 = new com.google.android.exoplayer2.extractor.ts.AdtsReader
            r0 = 1
            r3.<init>(r0)
            r2.reader = r3
            com.google.android.exoplayer2.util.ParsableByteArray r3 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0 = 2048(0x800, float:2.87E-42)
            r3.<init>(r0)
            r2.packetBuffer = r3
            r3 = -1
            r2.averageFrameSize = r3
            r0 = -1
            r2.firstFramePosition = r0
            com.google.android.exoplayer2.util.ParsableByteArray r3 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0 = 10
            r3.<init>(r0)
            r2.scratch = r3
            com.google.android.exoplayer2.util.ParsableBitArray r0 = new com.google.android.exoplayer2.util.ParsableBitArray
            byte[] r3 = r3.getData()
            r0.<init>(r3)
            r2.scratchBits = r0
            return
    }

    private void calculateAverageFrameSize(com.google.android.exoplayer2.extractor.ExtractorInput r10) throws java.io.IOException {
            r9 = this;
            boolean r0 = r9.hasCalculatedAverageFrameSize
            if (r0 == 0) goto L5
            return
        L5:
            r0 = -1
            r9.averageFrameSize = r0
            r10.resetPeekPosition()
            long r1 = r10.getPosition()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L18
            r9.peekId3Header(r10)
        L18:
            r1 = 0
            r2 = 0
        L1a:
            r5 = 1
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r9.scratch     // Catch: java.io.EOFException -> L76
            byte[] r6 = r6.getData()     // Catch: java.io.EOFException -> L76
            r7 = 2
            boolean r6 = r10.peekFully(r6, r1, r7, r5)     // Catch: java.io.EOFException -> L76
            if (r6 == 0) goto L76
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r9.scratch     // Catch: java.io.EOFException -> L76
            r6.setPosition(r1)     // Catch: java.io.EOFException -> L76
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r9.scratch     // Catch: java.io.EOFException -> L76
            int r6 = r6.readUnsignedShort()     // Catch: java.io.EOFException -> L76
            boolean r6 = com.google.android.exoplayer2.extractor.ts.AdtsReader.isAdtsSyncWord(r6)     // Catch: java.io.EOFException -> L76
            if (r6 != 0) goto L3a
            goto L77
        L3a:
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r9.scratch     // Catch: java.io.EOFException -> L76
            byte[] r6 = r6.getData()     // Catch: java.io.EOFException -> L76
            r7 = 4
            boolean r6 = r10.peekFully(r6, r1, r7, r5)     // Catch: java.io.EOFException -> L76
            if (r6 != 0) goto L48
            goto L76
        L48:
            com.google.android.exoplayer2.util.ParsableBitArray r6 = r9.scratchBits     // Catch: java.io.EOFException -> L76
            r7 = 14
            r6.setPosition(r7)     // Catch: java.io.EOFException -> L76
            com.google.android.exoplayer2.util.ParsableBitArray r6 = r9.scratchBits     // Catch: java.io.EOFException -> L76
            r7 = 13
            int r6 = r6.readBits(r7)     // Catch: java.io.EOFException -> L76
            r7 = 6
            if (r6 <= r7) goto L6c
            long r7 = (long) r6     // Catch: java.io.EOFException -> L76
            long r3 = r3 + r7
            int r2 = r2 + 1
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r7) goto L63
            goto L6b
        L63:
            int r6 = r6 + (-6)
            boolean r6 = r10.advancePeekPosition(r6, r5)     // Catch: java.io.EOFException -> L76
            if (r6 != 0) goto L1a
        L6b:
            goto L76
        L6c:
            r9.hasCalculatedAverageFrameSize = r5     // Catch: java.io.EOFException -> L76
            java.lang.String r1 = "Malformed ADTS stream"
            r6 = 0
            com.google.android.exoplayer2.ParserException r1 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r1, r6)     // Catch: java.io.EOFException -> L76
            throw r1     // Catch: java.io.EOFException -> L76
        L76:
            r1 = r2
        L77:
            r10.resetPeekPosition()
            if (r1 <= 0) goto L82
            long r0 = (long) r1
            long r3 = r3 / r0
            int r10 = (int) r3
            r9.averageFrameSize = r10
            goto L84
        L82:
            r9.averageFrameSize = r0
        L84:
            r9.hasCalculatedAverageFrameSize = r5
            return
    }

    private static int getBitrateFromFrameSize(int r4, long r5) {
            long r0 = (long) r4
            r2 = 8
            long r0 = r0 * r2
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            long r0 = r0 / r5
            int r4 = (int) r0
            return r4
    }

    private com.google.android.exoplayer2.extractor.SeekMap getConstantBitrateSeekMap(long r12, boolean r14) {
            r11 = this;
            int r0 = r11.averageFrameSize
            com.google.android.exoplayer2.extractor.ts.AdtsReader r1 = r11.reader
            long r1 = r1.getSampleDurationUs()
            int r8 = getBitrateFromFrameSize(r0, r1)
            com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap r0 = new com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap
            long r6 = r11.firstFramePosition
            int r9 = r11.averageFrameSize
            r3 = r0
            r4 = r12
            r10 = r14
            r3.<init>(r4, r6, r8, r9, r10)
            return r0
    }

    private static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
            r0 = 1
            com.google.android.exoplayer2.extractor.Extractor[] r0 = new com.google.android.exoplayer2.extractor.Extractor[r0]
            com.google.android.exoplayer2.extractor.ts.AdtsExtractor r1 = new com.google.android.exoplayer2.extractor.ts.AdtsExtractor
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            return r0
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    private void maybeOutputSeekMap(long r9, boolean r11) {
            r8 = this;
            boolean r0 = r8.hasOutputSeekMap
            if (r0 == 0) goto L5
            return
        L5:
            int r0 = r8.flags
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 == 0) goto L12
            int r0 = r8.averageFrameSize
            if (r0 <= 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L27
            com.google.android.exoplayer2.extractor.ts.AdtsReader r5 = r8.reader
            long r5 = r5.getSampleDurationUs()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L27
            if (r11 != 0) goto L27
            return
        L27:
            if (r0 == 0) goto L44
            com.google.android.exoplayer2.extractor.ts.AdtsReader r11 = r8.reader
            long r5 = r11.getSampleDurationUs()
            int r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r11 == 0) goto L44
            com.google.android.exoplayer2.extractor.ExtractorOutput r11 = r8.extractorOutput
            int r0 = r8.flags
            r0 = r0 & 2
            if (r0 == 0) goto L3c
            r2 = 1
        L3c:
            com.google.android.exoplayer2.extractor.SeekMap r9 = r8.getConstantBitrateSeekMap(r9, r2)
            r11.seekMap(r9)
            goto L4e
        L44:
            com.google.android.exoplayer2.extractor.ExtractorOutput r9 = r8.extractorOutput
            com.google.android.exoplayer2.extractor.SeekMap$Unseekable r10 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
            r10.<init>(r3)
            r9.seekMap(r10)
        L4e:
            r8.hasOutputSeekMap = r1
            return
    }

    private int peekId3Header(com.google.android.exoplayer2.extractor.ExtractorInput r7) throws java.io.IOException {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r6.scratch
            byte[] r2 = r2.getData()
            r3 = 10
            r7.peekFully(r2, r0, r3)
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r6.scratch
            r2.setPosition(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r6.scratch
            int r2 = r2.readUnsignedInt24()
            r3 = 4801587(0x494433, float:6.728456E-39)
            if (r2 == r3) goto L2f
            r7.resetPeekPosition()
            r7.advancePeekPosition(r1)
            long r2 = r6.firstFramePosition
            r4 = -1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L2e
            long r2 = (long) r1
            r6.firstFramePosition = r2
        L2e:
            return r1
        L2f:
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r6.scratch
            r3 = 3
            r2.skipBytes(r3)
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r6.scratch
            int r2 = r2.readSynchSafeInt()
            int r3 = r2 + 10
            int r1 = r1 + r3
            r7.advancePeekPosition(r2)
            goto L2
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r5) {
            r4 = this;
            r4.extractorOutput = r5
            com.google.android.exoplayer2.extractor.ts.AdtsReader r0 = r4.reader
            com.google.android.exoplayer2.extractor.ts.TsPayloadReader$TrackIdGenerator r1 = new com.google.android.exoplayer2.extractor.ts.TsPayloadReader$TrackIdGenerator
            r2 = 0
            r3 = 1
            r1.<init>(r2, r3)
            r0.createTracks(r5, r1)
            r5.endTracks()
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r8, com.google.android.exoplayer2.extractor.PositionHolder r9) throws java.io.IOException {
            r7 = this;
            com.google.android.exoplayer2.extractor.ExtractorOutput r9 = r7.extractorOutput
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r9)
            long r0 = r8.getLength()
            int r9 = r7.flags
            r2 = r9 & 2
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1d
            r9 = r9 & r3
            if (r9 == 0) goto L1b
            r5 = -1
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 == 0) goto L1b
            goto L1d
        L1b:
            r9 = 0
            goto L1e
        L1d:
            r9 = 1
        L1e:
            if (r9 == 0) goto L23
            r7.calculateAverageFrameSize(r8)
        L23:
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r7.packetBuffer
            byte[] r9 = r9.getData()
            r2 = 2048(0x800, float:2.87E-42)
            int r8 = r8.read(r9, r4, r2)
            r9 = -1
            if (r8 != r9) goto L34
            r2 = 1
            goto L35
        L34:
            r2 = 0
        L35:
            r7.maybeOutputSeekMap(r0, r2)
            if (r2 == 0) goto L3b
            return r9
        L3b:
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r7.packetBuffer
            r9.setPosition(r4)
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r7.packetBuffer
            r9.setLimit(r8)
            boolean r8 = r7.startedPacket
            if (r8 != 0) goto L53
            com.google.android.exoplayer2.extractor.ts.AdtsReader r8 = r7.reader
            long r0 = r7.firstSampleTimestampUs
            r9 = 4
            r8.packetStarted(r0, r9)
            r7.startedPacket = r3
        L53:
            com.google.android.exoplayer2.extractor.ts.AdtsReader r8 = r7.reader
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r7.packetBuffer
            r8.consume(r9)
            return r4
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long r1, long r3) {
            r0 = this;
            r1 = 0
            r0.startedPacket = r1
            com.google.android.exoplayer2.extractor.ts.AdtsReader r1 = r0.reader
            r1.seek()
            r0.firstSampleTimestampUs = r3
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r9) throws java.io.IOException {
            r8 = this;
            int r0 = r8.peekId3Header(r9)
            r1 = 0
            r3 = r0
            r2 = 0
            r4 = 0
        L8:
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r8.scratch
            byte[] r5 = r5.getData()
            r6 = 2
            r9.peekFully(r5, r1, r6)
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r8.scratch
            r5.setPosition(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r8.scratch
            int r5 = r5.readUnsignedShort()
            boolean r5 = com.google.android.exoplayer2.extractor.ts.AdtsReader.isAdtsSyncWord(r5)
            if (r5 != 0) goto L2e
            int r3 = r3 + 1
            r9.resetPeekPosition()
            r9.advancePeekPosition(r3)
        L2b:
            r2 = 0
            r4 = 0
            goto L62
        L2e:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L38
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L38
            return r5
        L38:
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r8.scratch
            byte[] r5 = r5.getData()
            r9.peekFully(r5, r1, r6)
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r8.scratchBits
            r6 = 14
            r5.setPosition(r6)
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r8.scratchBits
            r6 = 13
            int r5 = r5.readBits(r6)
            r6 = 6
            if (r5 > r6) goto L5c
            int r3 = r3 + 1
            r9.resetPeekPosition()
            r9.advancePeekPosition(r3)
            goto L2b
        L5c:
            int r6 = r5 + (-6)
            r9.advancePeekPosition(r6)
            int r4 = r4 + r5
        L62:
            int r5 = r3 - r0
            r6 = 8192(0x2000, float:1.148E-41)
            if (r5 < r6) goto L8
            return r1
    }
}
