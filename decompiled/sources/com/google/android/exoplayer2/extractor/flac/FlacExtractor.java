package com.google.android.exoplayer2.extractor.flac;

/* JADX INFO: loaded from: classes.dex */
public final class FlacExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    private static final int BUFFER_LENGTH = 32768;
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory FACTORY = null;
    public static final int FLAG_DISABLE_ID3_METADATA = 1;
    private static final int SAMPLE_NUMBER_UNKNOWN = -1;
    private static final int STATE_GET_FRAME_START_MARKER = 4;
    private static final int STATE_GET_STREAM_MARKER_AND_INFO_BLOCK_BYTES = 1;
    private static final int STATE_READ_FRAMES = 5;
    private static final int STATE_READ_ID3_METADATA = 0;
    private static final int STATE_READ_METADATA_BLOCKS = 3;
    private static final int STATE_READ_STREAM_MARKER = 2;
    private com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker binarySearchSeeker;
    private final com.google.android.exoplayer2.util.ParsableByteArray buffer;
    private int currentFrameBytesWritten;
    private long currentFrameFirstSampleNumber;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private com.google.android.exoplayer2.extractor.FlacStreamMetadata flacStreamMetadata;
    private int frameStartMarker;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.metadata.Metadata id3Metadata;
    private final boolean id3MetadataDisabled;
    private int minFrameSize;
    private final com.google.android.exoplayer2.extractor.FlacFrameReader.SampleNumberHolder sampleNumberHolder;
    private int state;
    private final byte[] streamMarkerAndInfoBlock;
    private com.google.android.exoplayer2.extractor.TrackOutput trackOutput;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] $r8$lambda$fh3RYYIyjNVY7ZLQFS_1oTiu7io() {
            com.google.android.exoplayer2.extractor.Extractor[] r0 = lambda$static$0()
            return r0
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$1
            com.google.android.exoplayer2.extractor.flac.FlacExtractor.FACTORY = r0
            return
    }

    public FlacExtractor() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public FlacExtractor(int r4) {
            r3 = this;
            r3.<init>()
            r0 = 42
            byte[] r0 = new byte[r0]
            r3.streamMarkerAndInfoBlock = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 32768(0x8000, float:4.5918E-41)
            byte[] r1 = new byte[r1]
            r2 = 0
            r0.<init>(r1, r2)
            r3.buffer = r0
            r0 = 1
            r4 = r4 & r0
            if (r4 == 0) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            r3.id3MetadataDisabled = r0
            com.google.android.exoplayer2.extractor.FlacFrameReader$SampleNumberHolder r4 = new com.google.android.exoplayer2.extractor.FlacFrameReader$SampleNumberHolder
            r4.<init>()
            r3.sampleNumberHolder = r4
            r3.state = r2
            return
    }

    private long findFrame(com.google.android.exoplayer2.util.ParsableByteArray r5, boolean r6) {
            r4 = this;
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r0 = r4.flacStreamMetadata
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            int r0 = r5.getPosition()
        L9:
            int r1 = r5.limit()
            int r1 = r1 + (-16)
            if (r0 > r1) goto L2b
            r5.setPosition(r0)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r1 = r4.flacStreamMetadata
            int r2 = r4.frameStartMarker
            com.google.android.exoplayer2.extractor.FlacFrameReader$SampleNumberHolder r3 = r4.sampleNumberHolder
            boolean r1 = com.google.android.exoplayer2.extractor.FlacFrameReader.checkAndReadFrameHeader(r5, r1, r2, r3)
            if (r1 == 0) goto L28
            r5.setPosition(r0)
            com.google.android.exoplayer2.extractor.FlacFrameReader$SampleNumberHolder r5 = r4.sampleNumberHolder
            long r5 = r5.sampleNumber
            return r5
        L28:
            int r0 = r0 + 1
            goto L9
        L2b:
            if (r6 == 0) goto L67
        L2d:
            int r6 = r5.limit()
            int r1 = r4.minFrameSize
            int r6 = r6 - r1
            if (r0 > r6) goto L5f
            r5.setPosition(r0)
            r6 = 0
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r1 = r4.flacStreamMetadata     // Catch: java.lang.IndexOutOfBoundsException -> L45
            int r2 = r4.frameStartMarker     // Catch: java.lang.IndexOutOfBoundsException -> L45
            com.google.android.exoplayer2.extractor.FlacFrameReader$SampleNumberHolder r3 = r4.sampleNumberHolder     // Catch: java.lang.IndexOutOfBoundsException -> L45
            boolean r1 = com.google.android.exoplayer2.extractor.FlacFrameReader.checkAndReadFrameHeader(r5, r1, r2, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L45
            goto L46
        L45:
            r1 = 0
        L46:
            int r2 = r5.getPosition()
            int r3 = r5.limit()
            if (r2 <= r3) goto L51
            goto L52
        L51:
            r6 = r1
        L52:
            if (r6 == 0) goto L5c
            r5.setPosition(r0)
            com.google.android.exoplayer2.extractor.FlacFrameReader$SampleNumberHolder r5 = r4.sampleNumberHolder
            long r5 = r5.sampleNumber
            return r5
        L5c:
            int r0 = r0 + 1
            goto L2d
        L5f:
            int r6 = r5.limit()
            r5.setPosition(r6)
            goto L6a
        L67:
            r5.setPosition(r0)
        L6a:
            r5 = -1
            return r5
    }

    private void getFrameStartMarker(com.google.android.exoplayer2.extractor.ExtractorInput r6) throws java.io.IOException {
            r5 = this;
            int r0 = com.google.android.exoplayer2.extractor.FlacMetadataReader.getFrameStartMarker(r6)
            r5.frameStartMarker = r0
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r5.extractorOutput
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = (com.google.android.exoplayer2.extractor.ExtractorOutput) r0
            long r1 = r6.getPosition()
            long r3 = r6.getLength()
            com.google.android.exoplayer2.extractor.SeekMap r6 = r5.getSeekMap(r1, r3)
            r0.seekMap(r6)
            r6 = 5
            r5.state = r6
            return
    }

    private com.google.android.exoplayer2.extractor.SeekMap getSeekMap(long r9, long r11) {
            r8 = this;
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r0 = r8.flacStreamMetadata
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r2 = r8.flacStreamMetadata
            com.google.android.exoplayer2.extractor.FlacStreamMetadata$SeekTable r0 = r2.seekTable
            if (r0 == 0) goto L11
            com.google.android.exoplayer2.extractor.FlacSeekTableSeekMap r11 = new com.google.android.exoplayer2.extractor.FlacSeekTableSeekMap
            r11.<init>(r2, r9)
            return r11
        L11:
            r0 = -1
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 == 0) goto L30
            long r0 = r2.totalSamples
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L30
            com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker r0 = new com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker
            int r3 = r8.frameStartMarker
            r1 = r0
            r4 = r9
            r6 = r11
            r1.<init>(r2, r3, r4, r6)
            r8.binarySearchSeeker = r0
            com.google.android.exoplayer2.extractor.SeekMap r9 = r0.getSeekMap()
            return r9
        L30:
            com.google.android.exoplayer2.extractor.SeekMap$Unseekable r9 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
            long r10 = r2.getDurationUs()
            r9.<init>(r10)
            return r9
    }

    private void getStreamMarkerAndInfoBlockBytes(com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.streamMarkerAndInfoBlock
            int r1 = r0.length
            r2 = 0
            r4.peekFully(r0, r2, r1)
            r4.resetPeekPosition()
            r4 = 2
            r3.state = r4
            return
    }

    private static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
            r0 = 1
            com.google.android.exoplayer2.extractor.Extractor[] r0 = new com.google.android.exoplayer2.extractor.Extractor[r0]
            com.google.android.exoplayer2.extractor.flac.FlacExtractor r1 = new com.google.android.exoplayer2.extractor.flac.FlacExtractor
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            return r0
    }

    private void outputSampleMetadata() {
            r11 = this;
            long r0 = r11.currentFrameFirstSampleNumber
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r2 = r11.flacStreamMetadata
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r2 = (com.google.android.exoplayer2.extractor.FlacStreamMetadata) r2
            int r2 = r2.sampleRate
            long r2 = (long) r2
            long r5 = r0 / r2
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r11.trackOutput
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            r4 = r0
            com.google.android.exoplayer2.extractor.TrackOutput r4 = (com.google.android.exoplayer2.extractor.TrackOutput) r4
            int r8 = r11.currentFrameBytesWritten
            r7 = 1
            r9 = 0
            r10 = 0
            r4.sampleMetadata(r5, r7, r8, r9, r10)
            return
    }

    private int readFrames(com.google.android.exoplayer2.extractor.ExtractorInput r7, com.google.android.exoplayer2.extractor.PositionHolder r8) throws java.io.IOException {
            r6 = this;
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r6.trackOutput
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r0 = r6.flacStreamMetadata
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker r0 = r6.binarySearchSeeker
            if (r0 == 0) goto L1b
            boolean r0 = r0.isSeeking()
            if (r0 == 0) goto L1b
            com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker r0 = r6.binarySearchSeeker
            int r7 = r0.handlePendingSeek(r7, r8)
            return r7
        L1b:
            long r0 = r6.currentFrameFirstSampleNumber
            r2 = -1
            r8 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2d
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r0 = r6.flacStreamMetadata
            long r0 = com.google.android.exoplayer2.extractor.FlacFrameReader.getFirstSampleNumber(r7, r0)
            r6.currentFrameFirstSampleNumber = r0
            return r8
        L2d:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.buffer
            int r0 = r0.limit()
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 >= r1) goto L5e
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r6.buffer
            byte[] r4 = r4.getData()
            int r1 = r1 - r0
            int r7 = r7.read(r4, r0, r1)
            r1 = -1
            if (r7 != r1) goto L48
            r4 = 1
            goto L49
        L48:
            r4 = 0
        L49:
            if (r4 != 0) goto L52
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r6.buffer
            int r0 = r0 + r7
            r1.setLimit(r0)
            goto L5f
        L52:
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.buffer
            int r7 = r7.bytesLeft()
            if (r7 != 0) goto L5f
            r6.outputSampleMetadata()
            return r1
        L5e:
            r4 = 0
        L5f:
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.buffer
            int r7 = r7.getPosition()
            int r0 = r6.currentFrameBytesWritten
            int r1 = r6.minFrameSize
            if (r0 >= r1) goto L79
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r6.buffer
            int r1 = r1 - r0
            int r0 = r5.bytesLeft()
            int r0 = java.lang.Math.min(r1, r0)
            r5.skipBytes(r0)
        L79:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.buffer
            long r0 = r6.findFrame(r0, r4)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r6.buffer
            int r4 = r4.getPosition()
            int r4 = r4 - r7
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r6.buffer
            r5.setPosition(r7)
            com.google.android.exoplayer2.extractor.TrackOutput r7 = r6.trackOutput
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r6.buffer
            r7.sampleData(r5, r4)
            int r7 = r6.currentFrameBytesWritten
            int r7 = r7 + r4
            r6.currentFrameBytesWritten = r7
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto La2
            r6.outputSampleMetadata()
            r6.currentFrameBytesWritten = r8
            r6.currentFrameFirstSampleNumber = r0
        La2:
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.buffer
            int r7 = r7.bytesLeft()
            r0 = 16
            if (r7 >= r0) goto Ld1
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.buffer
            int r7 = r7.bytesLeft()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.buffer
            byte[] r0 = r0.getData()
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r6.buffer
            int r1 = r1.getPosition()
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r6.buffer
            byte[] r2 = r2.getData()
            java.lang.System.arraycopy(r0, r1, r2, r8, r7)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.buffer
            r0.setPosition(r8)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.buffer
            r0.setLimit(r7)
        Ld1:
            return r8
    }

    private void readId3Metadata(com.google.android.exoplayer2.extractor.ExtractorInput r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.id3MetadataDisabled
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.exoplayer2.metadata.Metadata r3 = com.google.android.exoplayer2.extractor.FlacMetadataReader.readId3Metadata(r3, r0)
            r2.id3Metadata = r3
            r2.state = r1
            return
    }

    private void readMetadataBlocks(com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
            r3 = this;
            com.google.android.exoplayer2.extractor.FlacMetadataReader$FlacStreamMetadataHolder r0 = new com.google.android.exoplayer2.extractor.FlacMetadataReader$FlacStreamMetadataHolder
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r1 = r3.flacStreamMetadata
            r0.<init>(r1)
            r1 = 0
        L8:
            if (r1 != 0) goto L19
            boolean r1 = com.google.android.exoplayer2.extractor.FlacMetadataReader.readMetadataBlock(r4, r0)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r2 = r0.flacStreamMetadata
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r2 = (com.google.android.exoplayer2.extractor.FlacStreamMetadata) r2
            r3.flacStreamMetadata = r2
            goto L8
        L19:
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r4 = r3.flacStreamMetadata
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r4 = r3.flacStreamMetadata
            int r4 = r4.minFrameSize
            r0 = 6
            int r4 = java.lang.Math.max(r4, r0)
            r3.minFrameSize = r4
            com.google.android.exoplayer2.extractor.TrackOutput r4 = r3.trackOutput
            java.lang.Object r4 = com.google.android.exoplayer2.util.Util.castNonNull(r4)
            com.google.android.exoplayer2.extractor.TrackOutput r4 = (com.google.android.exoplayer2.extractor.TrackOutput) r4
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r0 = r3.flacStreamMetadata
            byte[] r1 = r3.streamMarkerAndInfoBlock
            com.google.android.exoplayer2.metadata.Metadata r2 = r3.id3Metadata
            com.google.android.exoplayer2.Format r0 = r0.getFormat(r1, r2)
            r4.format(r0)
            r4 = 4
            r3.state = r4
            return
    }

    private void readStreamMarker(com.google.android.exoplayer2.extractor.ExtractorInput r1) throws java.io.IOException {
            r0 = this;
            com.google.android.exoplayer2.extractor.FlacMetadataReader.readStreamMarker(r1)
            r1 = 3
            r0.state = r1
            return
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
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r4, com.google.android.exoplayer2.extractor.PositionHolder r5) throws java.io.IOException {
            r3 = this;
            int r0 = r3.state
            r1 = 0
            if (r0 == 0) goto L2f
            r2 = 1
            if (r0 == r2) goto L2b
            r2 = 2
            if (r0 == r2) goto L27
            r2 = 3
            if (r0 == r2) goto L23
            r2 = 4
            if (r0 == r2) goto L1f
            r1 = 5
            if (r0 != r1) goto L19
            int r4 = r3.readFrames(r4, r5)
            return r4
        L19:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
        L1f:
            r3.getFrameStartMarker(r4)
            return r1
        L23:
            r3.readMetadataBlocks(r4)
            return r1
        L27:
            r3.readStreamMarker(r4)
            return r1
        L2b:
            r3.getStreamMarkerAndInfoBlockBytes(r4)
            return r1
        L2f:
            r3.readId3Metadata(r4)
            return r1
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long r5, long r7) {
            r4 = this;
            r0 = 0
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto La
            r4.state = r0
            goto L11
        La:
            com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker r5 = r4.binarySearchSeeker
            if (r5 == 0) goto L11
            r5.setSeekTargetUs(r7)
        L11:
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 != 0) goto L16
            goto L18
        L16:
            r1 = -1
        L18:
            r4.currentFrameFirstSampleNumber = r1
            r4.currentFrameBytesWritten = r0
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r4.buffer
            r5.reset(r0)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            com.google.android.exoplayer2.extractor.FlacMetadataReader.peekId3Metadata(r2, r0)
            boolean r2 = com.google.android.exoplayer2.extractor.FlacMetadataReader.checkAndPeekStreamMarker(r2)
            return r2
    }
}
