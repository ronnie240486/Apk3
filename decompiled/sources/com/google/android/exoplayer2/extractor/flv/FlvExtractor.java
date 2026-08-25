package com.google.android.exoplayer2.extractor.flv;

/* JADX INFO: loaded from: classes2.dex */
public final class FlvExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory FACTORY = null;
    private static final int FLV_HEADER_SIZE = 9;
    private static final int FLV_TAG = 4607062;
    private static final int FLV_TAG_HEADER_SIZE = 11;
    private static final int STATE_READING_FLV_HEADER = 1;
    private static final int STATE_READING_TAG_DATA = 4;
    private static final int STATE_READING_TAG_HEADER = 3;
    private static final int STATE_SKIPPING_TO_TAG_HEADER = 2;
    private static final int TAG_TYPE_AUDIO = 8;
    private static final int TAG_TYPE_SCRIPT_DATA = 18;
    private static final int TAG_TYPE_VIDEO = 9;
    private com.google.android.exoplayer2.extractor.flv.AudioTagPayloadReader audioReader;
    private int bytesToNextTagHeader;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private final com.google.android.exoplayer2.util.ParsableByteArray headerBuffer;
    private long mediaTagTimestampOffsetUs;
    private final com.google.android.exoplayer2.extractor.flv.ScriptTagPayloadReader metadataReader;
    private boolean outputFirstSample;
    private boolean outputSeekMap;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch;
    private int state;
    private final com.google.android.exoplayer2.util.ParsableByteArray tagData;
    private int tagDataSize;
    private final com.google.android.exoplayer2.util.ParsableByteArray tagHeaderBuffer;
    private long tagTimestampUs;
    private int tagType;
    private com.google.android.exoplayer2.extractor.flv.VideoTagPayloadReader videoReader;

    public static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] $r8$lambda$uGPIR_OZmcT4Rba70dWWmnPAxgs() {
            com.google.android.exoplayer2.extractor.Extractor[] r0 = lambda$static$0()
            return r0
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$2
            com.google.android.exoplayer2.extractor.flv.FlvExtractor.FACTORY = r0
            return
    }

    public FlvExtractor() {
            r2 = this;
            r2.<init>()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 4
            r0.<init>(r1)
            r2.scratch = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 9
            r0.<init>(r1)
            r2.headerBuffer = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 11
            r0.<init>(r1)
            r2.tagHeaderBuffer = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>()
            r2.tagData = r0
            com.google.android.exoplayer2.extractor.flv.ScriptTagPayloadReader r0 = new com.google.android.exoplayer2.extractor.flv.ScriptTagPayloadReader
            r0.<init>()
            r2.metadataReader = r0
            r0 = 1
            r2.state = r0
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    private void ensureReadyForMediaOutput() {
            r4 = this;
            boolean r0 = r4.outputSeekMap
            if (r0 != 0) goto L16
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r4.extractorOutput
            com.google.android.exoplayer2.extractor.SeekMap$Unseekable r1 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r2)
            r0.seekMap(r1)
            r0 = 1
            r4.outputSeekMap = r0
        L16:
            return
    }

    private long getCurrentTimestampUs() {
            r5 = this;
            boolean r0 = r5.outputFirstSample
            if (r0 == 0) goto La
            long r0 = r5.mediaTagTimestampOffsetUs
            long r2 = r5.tagTimestampUs
            long r0 = r0 + r2
            goto L1e
        La:
            com.google.android.exoplayer2.extractor.flv.ScriptTagPayloadReader r0 = r5.metadataReader
            long r0 = r0.getDurationUs()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1c
            r0 = 0
            goto L1e
        L1c:
            long r0 = r5.tagTimestampUs
        L1e:
            return r0
    }

    private static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
            r0 = 1
            com.google.android.exoplayer2.extractor.Extractor[] r0 = new com.google.android.exoplayer2.extractor.Extractor[r0]
            com.google.android.exoplayer2.extractor.flv.FlvExtractor r1 = new com.google.android.exoplayer2.extractor.flv.FlvExtractor
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            return r0
    }

    private com.google.android.exoplayer2.util.ParsableByteArray prepareTagData(com.google.android.exoplayer2.extractor.ExtractorInput r5) throws java.io.IOException {
            r4 = this;
            int r0 = r4.tagDataSize
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r4.tagData
            int r1 = r1.capacity()
            r2 = 0
            if (r0 <= r1) goto L1f
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.tagData
            int r1 = r0.capacity()
            int r1 = r1 * 2
            int r3 = r4.tagDataSize
            int r1 = java.lang.Math.max(r1, r3)
            byte[] r1 = new byte[r1]
            r0.reset(r1, r2)
            goto L24
        L1f:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.tagData
            r0.setPosition(r2)
        L24:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.tagData
            int r1 = r4.tagDataSize
            r0.setLimit(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.tagData
            byte[] r0 = r0.getData()
            int r1 = r4.tagDataSize
            r5.readFully(r0, r2, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r4.tagData
            return r5
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    private boolean readFlvHeader(com.google.android.exoplayer2.extractor.ExtractorInput r7) throws java.io.IOException {
            r6 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.headerBuffer
            byte[] r0 = r0.getData()
            r1 = 0
            r2 = 9
            r3 = 1
            boolean r7 = r7.readFully(r0, r1, r2, r3)
            if (r7 != 0) goto L11
            return r1
        L11:
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.headerBuffer
            r7.setPosition(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.headerBuffer
            r0 = 4
            r7.skipBytes(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.headerBuffer
            int r7 = r7.readUnsignedByte()
            r4 = r7 & 4
            if (r4 == 0) goto L28
            r4 = 1
            goto L29
        L28:
            r4 = 0
        L29:
            r7 = r7 & r3
            if (r7 == 0) goto L2d
            r1 = 1
        L2d:
            if (r4 == 0) goto L42
            com.google.android.exoplayer2.extractor.flv.AudioTagPayloadReader r7 = r6.audioReader
            if (r7 != 0) goto L42
            com.google.android.exoplayer2.extractor.flv.AudioTagPayloadReader r7 = new com.google.android.exoplayer2.extractor.flv.AudioTagPayloadReader
            com.google.android.exoplayer2.extractor.ExtractorOutput r4 = r6.extractorOutput
            r5 = 8
            com.google.android.exoplayer2.extractor.TrackOutput r4 = r4.track(r5, r3)
            r7.<init>(r4)
            r6.audioReader = r7
        L42:
            r7 = 2
            if (r1 == 0) goto L56
            com.google.android.exoplayer2.extractor.flv.VideoTagPayloadReader r1 = r6.videoReader
            if (r1 != 0) goto L56
            com.google.android.exoplayer2.extractor.flv.VideoTagPayloadReader r1 = new com.google.android.exoplayer2.extractor.flv.VideoTagPayloadReader
            com.google.android.exoplayer2.extractor.ExtractorOutput r4 = r6.extractorOutput
            com.google.android.exoplayer2.extractor.TrackOutput r4 = r4.track(r2, r7)
            r1.<init>(r4)
            r6.videoReader = r1
        L56:
            com.google.android.exoplayer2.extractor.ExtractorOutput r1 = r6.extractorOutput
            r1.endTracks()
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r6.headerBuffer
            int r1 = r1.readInt()
            int r1 = r1 - r2
            int r1 = r1 + r0
            r6.bytesToNextTagHeader = r1
            r6.state = r7
            return r3
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    private boolean readTagData(com.google.android.exoplayer2.extractor.ExtractorInput r10) throws java.io.IOException {
            r9 = this;
            long r0 = r9.getCurrentTimestampUs()
            int r2 = r9.tagType
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L24
            com.google.android.exoplayer2.extractor.flv.AudioTagPayloadReader r7 = r9.audioReader
            if (r7 == 0) goto L24
            r9.ensureReadyForMediaOutput()
            com.google.android.exoplayer2.extractor.flv.AudioTagPayloadReader r2 = r9.audioReader
            com.google.android.exoplayer2.util.ParsableByteArray r10 = r9.prepareTagData(r10)
            boolean r5 = r2.consume(r10, r0)
        L22:
            r10 = 1
            goto L75
        L24:
            r7 = 9
            if (r2 != r7) goto L3a
            com.google.android.exoplayer2.extractor.flv.VideoTagPayloadReader r7 = r9.videoReader
            if (r7 == 0) goto L3a
            r9.ensureReadyForMediaOutput()
            com.google.android.exoplayer2.extractor.flv.VideoTagPayloadReader r2 = r9.videoReader
            com.google.android.exoplayer2.util.ParsableByteArray r10 = r9.prepareTagData(r10)
            boolean r5 = r2.consume(r10, r0)
            goto L22
        L3a:
            r7 = 18
            if (r2 != r7) goto L6f
            boolean r2 = r9.outputSeekMap
            if (r2 != 0) goto L6f
            com.google.android.exoplayer2.extractor.flv.ScriptTagPayloadReader r2 = r9.metadataReader
            com.google.android.exoplayer2.util.ParsableByteArray r10 = r9.prepareTagData(r10)
            boolean r5 = r2.consume(r10, r0)
            com.google.android.exoplayer2.extractor.flv.ScriptTagPayloadReader r10 = r9.metadataReader
            long r0 = r10.getDurationUs()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L22
            com.google.android.exoplayer2.extractor.ExtractorOutput r10 = r9.extractorOutput
            com.google.android.exoplayer2.extractor.IndexSeekMap r2 = new com.google.android.exoplayer2.extractor.IndexSeekMap
            com.google.android.exoplayer2.extractor.flv.ScriptTagPayloadReader r7 = r9.metadataReader
            long[] r7 = r7.getKeyFrameTagPositions()
            com.google.android.exoplayer2.extractor.flv.ScriptTagPayloadReader r8 = r9.metadataReader
            long[] r8 = r8.getKeyFrameTimesUs()
            r2.<init>(r7, r8, r0)
            r10.seekMap(r2)
            r9.outputSeekMap = r6
            goto L22
        L6f:
            int r0 = r9.tagDataSize
            r10.skipFully(r0)
            r10 = 0
        L75:
            boolean r0 = r9.outputFirstSample
            if (r0 != 0) goto L8f
            if (r5 == 0) goto L8f
            r9.outputFirstSample = r6
            com.google.android.exoplayer2.extractor.flv.ScriptTagPayloadReader r0 = r9.metadataReader
            long r0 = r0.getDurationUs()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L8b
            long r0 = r9.tagTimestampUs
            long r0 = -r0
            goto L8d
        L8b:
            r0 = 0
        L8d:
            r9.mediaTagTimestampOffsetUs = r0
        L8f:
            r0 = 4
            r9.bytesToNextTagHeader = r0
            r0 = 2
            r9.state = r0
            return r10
    }

    private boolean readTagHeader(com.google.android.exoplayer2.extractor.ExtractorInput r7) throws java.io.IOException {
            r6 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.tagHeaderBuffer
            byte[] r0 = r0.getData()
            r1 = 0
            r2 = 11
            r3 = 1
            boolean r7 = r7.readFully(r0, r1, r2, r3)
            if (r7 != 0) goto L11
            return r1
        L11:
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.tagHeaderBuffer
            r7.setPosition(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.tagHeaderBuffer
            int r7 = r7.readUnsignedByte()
            r6.tagType = r7
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.tagHeaderBuffer
            int r7 = r7.readUnsignedInt24()
            r6.tagDataSize = r7
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.tagHeaderBuffer
            int r7 = r7.readUnsignedInt24()
            long r0 = (long) r7
            r6.tagTimestampUs = r0
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.tagHeaderBuffer
            int r7 = r7.readUnsignedByte()
            int r7 = r7 << 24
            long r0 = (long) r7
            long r4 = r6.tagTimestampUs
            long r0 = r0 | r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            r6.tagTimestampUs = r0
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.tagHeaderBuffer
            r0 = 3
            r7.skipBytes(r0)
            r7 = 4
            r6.state = r7
            return r3
    }

    private void skipToTagHeader(com.google.android.exoplayer2.extractor.ExtractorInput r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.bytesToNextTagHeader
            r2.skipFully(r0)
            r2 = 0
            r1.bytesToNextTagHeader = r2
            r2 = 3
            r1.state = r2
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r1) {
            r0 = this;
            r0.extractorOutput = r1
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r3, com.google.android.exoplayer2.extractor.PositionHolder r4) throws java.io.IOException {
            r2 = this;
            com.google.android.exoplayer2.extractor.ExtractorOutput r4 = r2.extractorOutput
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r4)
        L5:
            int r4 = r2.state
            r0 = 1
            r1 = -1
            if (r4 == r0) goto L2d
            r0 = 2
            if (r4 == r0) goto L29
            r0 = 3
            if (r4 == r0) goto L22
            r0 = 4
            if (r4 != r0) goto L1c
            boolean r4 = r2.readTagData(r3)
            if (r4 == 0) goto L5
            r3 = 0
            return r3
        L1c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L22:
            boolean r4 = r2.readTagHeader(r3)
            if (r4 != 0) goto L5
            return r1
        L29:
            r2.skipToTagHeader(r3)
            goto L5
        L2d:
            boolean r4 = r2.readFlvHeader(r3)
            if (r4 != 0) goto L5
            return r1
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
            r0 = 0
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 != 0) goto Ld
            r3 = 1
            r2.state = r3
            r2.outputFirstSample = r5
            goto L10
        Ld:
            r3 = 3
            r2.state = r3
        L10:
            r2.bytesToNextTagHeader = r5
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
            r3 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            byte[] r0 = r0.getData()
            r1 = 0
            r2 = 3
            r4.peekFully(r0, r1, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            r0.setPosition(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            int r0 = r0.readUnsignedInt24()
            r2 = 4607062(0x464c56, float:6.455869E-39)
            if (r0 == r2) goto L1c
            return r1
        L1c:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            byte[] r0 = r0.getData()
            r2 = 2
            r4.peekFully(r0, r1, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            r0.setPosition(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            int r0 = r0.readUnsignedShort()
            r0 = r0 & 250(0xfa, float:3.5E-43)
            if (r0 == 0) goto L36
            return r1
        L36:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            byte[] r0 = r0.getData()
            r2 = 4
            r4.peekFully(r0, r1, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            r0.setPosition(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            int r0 = r0.readInt()
            r4.resetPeekPosition()
            r4.advancePeekPosition(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            byte[] r0 = r0.getData()
            r4.peekFully(r0, r1, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r3.scratch
            r4.setPosition(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r3.scratch
            int r4 = r4.readInt()
            if (r4 != 0) goto L68
            r1 = 1
        L68:
            return r1
    }
}
