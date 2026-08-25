package com.google.android.exoplayer2.extractor.amr;

/* JADX INFO: loaded from: classes3.dex */
public final class AmrExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory FACTORY = null;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    private static final int MAX_FRAME_SIZE_BYTES = 0;
    private static final int NUM_SAME_SIZE_CONSTANT_BIT_RATE_THRESHOLD = 20;
    private static final int SAMPLE_RATE_NB = 8000;
    private static final int SAMPLE_RATE_WB = 16000;
    private static final int SAMPLE_TIME_PER_FRAME_US = 20000;
    private static final byte[] amrSignatureNb = null;
    private static final byte[] amrSignatureWb = null;
    private static final int[] frameSizeBytesByTypeNb = null;
    private static final int[] frameSizeBytesByTypeWb = null;
    private int currentSampleBytesRemaining;
    private int currentSampleSize;
    private long currentSampleTimeUs;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private long firstSamplePosition;
    private int firstSampleSize;
    private final int flags;
    private boolean hasOutputFormat;
    private boolean hasOutputSeekMap;
    private boolean isWideBand;
    private int numSamplesWithSameSize;
    private final byte[] scratch;
    private com.google.android.exoplayer2.extractor.SeekMap seekMap;
    private long timeOffsetUs;
    private com.google.android.exoplayer2.extractor.TrackOutput trackOutput;

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* JADX INFO: renamed from: $r8$lambda$-w_M83VVDu2orWPc-XnpV9hzd2g, reason: not valid java name */
    public static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] m223$r8$lambda$w_M83VVDu2orWPcXnpV9hzd2g() {
            com.google.android.exoplayer2.extractor.Extractor[] r0 = lambda$static$0()
            return r0
    }

    static {
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r0 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$29
            com.google.android.exoplayer2.extractor.amr.AmrExtractor.FACTORY = r0
            r0 = 16
            int[] r1 = new int[r0]
            r1 = {x002c: FILL_ARRAY_DATA , data: [13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1} // fill-array
            com.google.android.exoplayer2.extractor.amr.AmrExtractor.frameSizeBytesByTypeNb = r1
            int[] r0 = new int[r0]
            r0 = {x0050: FILL_ARRAY_DATA , data: [18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1} // fill-array
            com.google.android.exoplayer2.extractor.amr.AmrExtractor.frameSizeBytesByTypeWb = r0
            java.lang.String r1 = "#!AMR\n"
            byte[] r1 = com.google.android.exoplayer2.util.Util.getUtf8Bytes(r1)
            com.google.android.exoplayer2.extractor.amr.AmrExtractor.amrSignatureNb = r1
            java.lang.String r1 = "#!AMR-WB\n"
            byte[] r1 = com.google.android.exoplayer2.util.Util.getUtf8Bytes(r1)
            com.google.android.exoplayer2.extractor.amr.AmrExtractor.amrSignatureWb = r1
            r1 = 8
            r0 = r0[r1]
            com.google.android.exoplayer2.extractor.amr.AmrExtractor.MAX_FRAME_SIZE_BYTES = r0
            return
    }

    public AmrExtractor() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public AmrExtractor(int r2) {
            r1 = this;
            r1.<init>()
            r0 = r2 & 2
            if (r0 == 0) goto L9
            r2 = r2 | 1
        L9:
            r1.flags = r2
            r2 = 1
            byte[] r2 = new byte[r2]
            r1.scratch = r2
            r2 = -1
            r1.firstSampleSize = r2
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void assertInitialized() {
            r1 = this;
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r1.trackOutput
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r1.extractorOutput
            com.google.android.exoplayer2.util.Util.castNonNull(r0)
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
            int r0 = r11.firstSampleSize
            r1 = 20000(0x4e20, double:9.8813E-320)
            int r8 = getBitrateFromFrameSize(r0, r1)
            com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap r0 = new com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap
            long r6 = r11.firstSamplePosition
            int r9 = r11.firstSampleSize
            r3 = r0
            r4 = r12
            r10 = r14
            r3.<init>(r4, r6, r8, r9, r10)
            return r0
    }

    private int getFrameSizeInBytes(int r3) throws com.google.android.exoplayer2.ParserException {
            r2 = this;
            boolean r0 = r2.isValidFrameType(r3)
            if (r0 != 0) goto L2a
            java.lang.String r0 = "Illegal AMR "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            boolean r1 = r2.isWideBand
            if (r1 == 0) goto L13
            java.lang.String r1 = "WB"
            goto L15
        L13:
            java.lang.String r1 = "NB"
        L15:
            r0.append(r1)
            java.lang.String r1 = " frame type "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 0
            com.google.android.exoplayer2.ParserException r3 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r3, r0)
            throw r3
        L2a:
            boolean r0 = r2.isWideBand
            if (r0 == 0) goto L33
            int[] r0 = com.google.android.exoplayer2.extractor.amr.AmrExtractor.frameSizeBytesByTypeWb
            r3 = r0[r3]
            goto L37
        L33:
            int[] r0 = com.google.android.exoplayer2.extractor.amr.AmrExtractor.frameSizeBytesByTypeNb
            r3 = r0[r3]
        L37:
            return r3
    }

    private boolean isNarrowBandValidFrameType(int r2) {
            r1 = this;
            boolean r0 = r1.isWideBand
            if (r0 != 0) goto Le
            r0 = 12
            if (r2 < r0) goto Lc
            r0 = 14
            if (r2 <= r0) goto Le
        Lc:
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    private boolean isValidFrameType(int r2) {
            r1 = this;
            if (r2 < 0) goto L14
            r0 = 15
            if (r2 > r0) goto L14
            boolean r0 = r1.isWideBandValidFrameType(r2)
            if (r0 != 0) goto L12
            boolean r2 = r1.isNarrowBandValidFrameType(r2)
            if (r2 == 0) goto L14
        L12:
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    private boolean isWideBandValidFrameType(int r2) {
            r1 = this;
            boolean r0 = r1.isWideBand
            if (r0 == 0) goto Le
            r0 = 10
            if (r2 < r0) goto Lc
            r0 = 13
            if (r2 <= r0) goto Le
        Lc:
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    private static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
            r0 = 1
            com.google.android.exoplayer2.extractor.Extractor[] r0 = new com.google.android.exoplayer2.extractor.Extractor[r0]
            com.google.android.exoplayer2.extractor.amr.AmrExtractor r1 = new com.google.android.exoplayer2.extractor.amr.AmrExtractor
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            return r0
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput"})
    private void maybeOutputFormat() {
            r5 = this;
            boolean r0 = r5.hasOutputFormat
            if (r0 != 0) goto L37
            r0 = 1
            r5.hasOutputFormat = r0
            boolean r1 = r5.isWideBand
            if (r1 == 0) goto Le
            java.lang.String r2 = "audio/amr-wb"
            goto L10
        Le:
            java.lang.String r2 = "audio/3gpp"
        L10:
            if (r1 == 0) goto L15
            r1 = 16000(0x3e80, float:2.2421E-41)
            goto L17
        L15:
            r1 = 8000(0x1f40, float:1.121E-41)
        L17:
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r5.trackOutput
            com.google.android.exoplayer2.Format$Builder r4 = new com.google.android.exoplayer2.Format$Builder
            r4.<init>()
            com.google.android.exoplayer2.Format$Builder r2 = r4.setSampleMimeType(r2)
            int r4 = com.google.android.exoplayer2.extractor.amr.AmrExtractor.MAX_FRAME_SIZE_BYTES
            com.google.android.exoplayer2.Format$Builder r2 = r2.setMaxInputSize(r4)
            com.google.android.exoplayer2.Format$Builder r0 = r2.setChannelCount(r0)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleRate(r1)
            com.google.android.exoplayer2.Format r0 = r0.build()
            r3.format(r0)
        L37:
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    private void maybeOutputSeekMap(long r6, int r8) {
            r5 = this;
            boolean r0 = r5.hasOutputSeekMap
            if (r0 == 0) goto L5
            return
        L5:
            int r0 = r5.flags
            r1 = r0 & 1
            r2 = 1
            if (r1 == 0) goto L39
            r3 = -1
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 == 0) goto L39
            int r1 = r5.firstSampleSize
            r3 = -1
            if (r1 == r3) goto L1c
            int r4 = r5.currentSampleSize
            if (r1 == r4) goto L1c
            goto L39
        L1c:
            int r1 = r5.numSamplesWithSameSize
            r4 = 20
            if (r1 >= r4) goto L24
            if (r8 != r3) goto L4c
        L24:
            r8 = r0 & 2
            if (r8 == 0) goto L2a
            r8 = 1
            goto L2b
        L2a:
            r8 = 0
        L2b:
            com.google.android.exoplayer2.extractor.SeekMap r6 = r5.getConstantBitrateSeekMap(r6, r8)
            r5.seekMap = r6
            com.google.android.exoplayer2.extractor.ExtractorOutput r7 = r5.extractorOutput
            r7.seekMap(r6)
            r5.hasOutputSeekMap = r2
            goto L4c
        L39:
            com.google.android.exoplayer2.extractor.SeekMap$Unseekable r6 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.<init>(r7)
            r5.seekMap = r6
            com.google.android.exoplayer2.extractor.ExtractorOutput r7 = r5.extractorOutput
            r7.seekMap(r6)
            r5.hasOutputSeekMap = r2
        L4c:
            return
    }

    private static boolean peekAmrSignature(com.google.android.exoplayer2.extractor.ExtractorInput r3, byte[] r4) throws java.io.IOException {
            r3.resetPeekPosition()
            int r0 = r4.length
            byte[] r0 = new byte[r0]
            int r1 = r4.length
            r2 = 0
            r3.peekFully(r0, r2, r1)
            boolean r3 = java.util.Arrays.equals(r0, r4)
            return r3
    }

    private int peekNextSampleSize(com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
            r3 = this;
            r4.resetPeekPosition()
            byte[] r0 = r3.scratch
            r1 = 0
            r2 = 1
            r4.peekFully(r0, r1, r2)
            byte[] r4 = r3.scratch
            r4 = r4[r1]
            r0 = r4 & 131(0x83, float:1.84E-43)
            if (r0 > 0) goto L1b
            int r4 = r4 >> 3
            r4 = r4 & 15
            int r4 = r3.getFrameSizeInBytes(r4)
            return r4
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid padding bits for frame header "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 0
            com.google.android.exoplayer2.ParserException r4 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r4, r0)
            throw r4
    }

    private boolean readAmrHeader(com.google.android.exoplayer2.extractor.ExtractorInput r5) throws java.io.IOException {
            r4 = this;
            byte[] r0 = com.google.android.exoplayer2.extractor.amr.AmrExtractor.amrSignatureNb
            boolean r1 = peekAmrSignature(r5, r0)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L11
            r4.isWideBand = r2
            int r0 = r0.length
            r5.skipFully(r0)
            return r3
        L11:
            byte[] r0 = com.google.android.exoplayer2.extractor.amr.AmrExtractor.amrSignatureWb
            boolean r1 = peekAmrSignature(r5, r0)
            if (r1 == 0) goto L20
            r4.isWideBand = r3
            int r0 = r0.length
            r5.skipFully(r0)
            return r3
        L20:
            return r2
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput"})
    private int readSample(com.google.android.exoplayer2.extractor.ExtractorInput r9) throws java.io.IOException {
            r8 = this;
            int r0 = r8.currentSampleBytesRemaining
            r1 = 1
            r2 = -1
            if (r0 != 0) goto L29
            int r0 = r8.peekNextSampleSize(r9)     // Catch: java.io.EOFException -> L28
            r8.currentSampleSize = r0     // Catch: java.io.EOFException -> L28
            r8.currentSampleBytesRemaining = r0
            int r0 = r8.firstSampleSize
            if (r0 != r2) goto L1c
            long r3 = r9.getPosition()
            r8.firstSamplePosition = r3
            int r0 = r8.currentSampleSize
            r8.firstSampleSize = r0
        L1c:
            int r0 = r8.firstSampleSize
            int r3 = r8.currentSampleSize
            if (r0 != r3) goto L29
            int r0 = r8.numSamplesWithSameSize
            int r0 = r0 + r1
            r8.numSamplesWithSameSize = r0
            goto L29
        L28:
            return r2
        L29:
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r8.trackOutput
            int r3 = r8.currentSampleBytesRemaining
            int r9 = r0.sampleData(r9, r3, r1)
            if (r9 != r2) goto L34
            return r2
        L34:
            int r0 = r8.currentSampleBytesRemaining
            int r0 = r0 - r9
            r8.currentSampleBytesRemaining = r0
            r9 = 0
            if (r0 <= 0) goto L3d
            return r9
        L3d:
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r8.trackOutput
            long r2 = r8.timeOffsetUs
            long r4 = r8.currentSampleTimeUs
            long r2 = r2 + r4
            r4 = 1
            int r5 = r8.currentSampleSize
            r6 = 0
            r7 = 0
            r1.sampleMetadata(r2, r4, r5, r6, r7)
            long r0 = r8.currentSampleTimeUs
            r2 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r2
            r8.currentSampleTimeUs = r0
            return r9
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r3) {
            r2 = this;
            r2.extractorOutput = r3
            r0 = 0
            r1 = 1
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r3.track(r0, r1)
            r2.trackOutput = r0
            r3.endTracks()
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r5, com.google.android.exoplayer2.extractor.PositionHolder r6) throws java.io.IOException {
            r4 = this;
            r4.assertInitialized()
            long r0 = r5.getPosition()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L1c
            boolean r6 = r4.readAmrHeader(r5)
            if (r6 == 0) goto L14
            goto L1c
        L14:
            r5 = 0
            java.lang.String r6 = "Could not find AMR header."
            com.google.android.exoplayer2.ParserException r5 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r6, r5)
            throw r5
        L1c:
            r4.maybeOutputFormat()
            int r6 = r4.readSample(r5)
            long r0 = r5.getLength()
            r4.maybeOutputSeekMap(r0, r6)
            return r6
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long r3, long r5) {
            r2 = this;
            r5 = 0
            r2.currentSampleTimeUs = r5
            r0 = 0
            r2.currentSampleSize = r0
            r2.currentSampleBytesRemaining = r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L1c
            com.google.android.exoplayer2.extractor.SeekMap r0 = r2.seekMap
            boolean r1 = r0 instanceof com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap
            if (r1 == 0) goto L1c
            com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap r0 = (com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap) r0
            long r3 = r0.getTimeUsAtPosition(r3)
            r2.timeOffsetUs = r3
            goto L1e
        L1c:
            r2.timeOffsetUs = r5
        L1e:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r1) throws java.io.IOException {
            r0 = this;
            boolean r1 = r0.readAmrHeader(r1)
            return r1
    }
}
