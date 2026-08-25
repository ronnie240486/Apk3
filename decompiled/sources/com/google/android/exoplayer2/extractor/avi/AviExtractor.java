package com.google.android.exoplayer2.extractor.avi;

/* JADX INFO: loaded from: classes2.dex */
public final class AviExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    private static final int AVIIF_KEYFRAME = 16;
    public static final int FOURCC_AVI_ = 541677121;
    public static final int FOURCC_JUNK = 1263424842;
    public static final int FOURCC_LIST = 1414744396;
    public static final int FOURCC_RIFF = 1179011410;
    public static final int FOURCC_auds = 1935963489;
    public static final int FOURCC_avih = 1751742049;
    public static final int FOURCC_hdrl = 1819436136;
    public static final int FOURCC_idx1 = 829973609;
    public static final int FOURCC_movi = 1769369453;
    public static final int FOURCC_strf = 1718776947;
    public static final int FOURCC_strh = 1752331379;
    public static final int FOURCC_strl = 1819440243;
    public static final int FOURCC_strn = 1852994675;
    public static final int FOURCC_txts = 1937012852;
    public static final int FOURCC_vids = 1935960438;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_FINDING_IDX1_HEADER = 4;
    private static final int STATE_FINDING_MOVI_HEADER = 3;
    private static final int STATE_READING_HDRL_BODY = 2;
    private static final int STATE_READING_HDRL_HEADER = 1;
    private static final int STATE_READING_IDX1_BODY = 5;
    private static final int STATE_READING_SAMPLES = 6;
    private static final int STATE_SKIPPING_TO_HDRL = 0;
    private static final java.lang.String TAG = "AviExtractor";
    private com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk aviHeader;
    private final com.google.android.exoplayer2.extractor.avi.AviExtractor.ChunkHeaderHolder chunkHeaderHolder;
    private com.google.android.exoplayer2.extractor.avi.ChunkReader[] chunkReaders;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.avi.ChunkReader currentChunkReader;
    private long durationUs;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private int hdrlSize;
    private int idx1BodySize;
    private long moviEnd;
    private long moviStart;
    private long pendingReposition;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch;
    private boolean seekMapHasBeenOutput;
    private int state;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.avi.AviExtractor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public class AviSeekMap implements com.google.android.exoplayer2.extractor.SeekMap {
        private final long durationUs;
        public final /* synthetic */ com.google.android.exoplayer2.extractor.avi.AviExtractor this$0;

        public AviSeekMap(com.google.android.exoplayer2.extractor.avi.AviExtractor r1, long r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.durationUs = r2
                return
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
                r2 = this;
                long r0 = r2.durationUs
                return r0
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long r9) {
                r8 = this;
                com.google.android.exoplayer2.extractor.avi.AviExtractor r0 = r8.this$0
                com.google.android.exoplayer2.extractor.avi.ChunkReader[] r0 = com.google.android.exoplayer2.extractor.avi.AviExtractor.access$100(r0)
                r1 = 0
                r0 = r0[r1]
                com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r0 = r0.getSeekPoints(r9)
                r1 = 1
            Le:
                com.google.android.exoplayer2.extractor.avi.AviExtractor r2 = r8.this$0
                com.google.android.exoplayer2.extractor.avi.ChunkReader[] r2 = com.google.android.exoplayer2.extractor.avi.AviExtractor.access$100(r2)
                int r2 = r2.length
                if (r1 >= r2) goto L33
                com.google.android.exoplayer2.extractor.avi.AviExtractor r2 = r8.this$0
                com.google.android.exoplayer2.extractor.avi.ChunkReader[] r2 = com.google.android.exoplayer2.extractor.avi.AviExtractor.access$100(r2)
                r2 = r2[r1]
                com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r2 = r2.getSeekPoints(r9)
                com.google.android.exoplayer2.extractor.SeekPoint r3 = r2.first
                long r3 = r3.position
                com.google.android.exoplayer2.extractor.SeekPoint r5 = r0.first
                long r5 = r5.position
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 >= 0) goto L30
                r0 = r2
            L30:
                int r1 = r1 + 1
                goto Le
            L33:
                return r0
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ChunkHeaderHolder {
        public int chunkType;
        public int listType;
        public int size;

        private ChunkHeaderHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ ChunkHeaderHolder(com.google.android.exoplayer2.extractor.avi.AviExtractor.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public void populateFrom(com.google.android.exoplayer2.util.ParsableByteArray r2) {
                r1 = this;
                int r0 = r2.readLittleEndianInt()
                r1.chunkType = r0
                int r2 = r2.readLittleEndianInt()
                r1.size = r2
                r2 = 0
                r1.listType = r2
                return
        }

        public void populateWithListHeaderFrom(com.google.android.exoplayer2.util.ParsableByteArray r3) throws com.google.android.exoplayer2.ParserException {
                r2 = this;
                r2.populateFrom(r3)
                int r0 = r2.chunkType
                r1 = 1414744396(0x5453494c, float:3.6298713E12)
                if (r0 != r1) goto L11
                int r3 = r3.readLittleEndianInt()
                r2.listType = r3
                return
            L11:
                java.lang.String r3 = "LIST expected, found: "
                java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
                int r0 = r2.chunkType
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                r0 = 0
                com.google.android.exoplayer2.ParserException r3 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r3, r0)
                throw r3
        }
    }

    public AviExtractor() {
            r2 = this;
            r2.<init>()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 12
            r0.<init>(r1)
            r2.scratch = r0
            com.google.android.exoplayer2.extractor.avi.AviExtractor$ChunkHeaderHolder r0 = new com.google.android.exoplayer2.extractor.avi.AviExtractor$ChunkHeaderHolder
            r1 = 0
            r0.<init>(r1)
            r2.chunkHeaderHolder = r0
            com.google.android.exoplayer2.extractor.DummyExtractorOutput r0 = new com.google.android.exoplayer2.extractor.DummyExtractorOutput
            r0.<init>()
            r2.extractorOutput = r0
            r0 = 0
            com.google.android.exoplayer2.extractor.avi.ChunkReader[] r0 = new com.google.android.exoplayer2.extractor.avi.ChunkReader[r0]
            r2.chunkReaders = r0
            r0 = -1
            r2.moviStart = r0
            r2.moviEnd = r0
            r0 = -1
            r2.hdrlSize = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.durationUs = r0
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.extractor.avi.ChunkReader[] access$100(com.google.android.exoplayer2.extractor.avi.AviExtractor r0) {
            com.google.android.exoplayer2.extractor.avi.ChunkReader[] r0 = r0.chunkReaders
            return r0
    }

    private static void alignInputToEvenPosition(com.google.android.exoplayer2.extractor.ExtractorInput r5) throws java.io.IOException {
            long r0 = r5.getPosition()
            r2 = 1
            long r0 = r0 & r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            r0 = 1
            r5.skipFully(r0)
        Lf:
            return
    }

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.avi.ChunkReader getChunkReader(int r6) {
            r5 = this;
            com.google.android.exoplayer2.extractor.avi.ChunkReader[] r0 = r5.chunkReaders
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            boolean r4 = r3.handlesChunkId(r6)
            if (r4 == 0) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L4
        L12:
            r6 = 0
            return r6
    }

    private void parseHdrlBody(com.google.android.exoplayer2.util.ParsableByteArray r7) throws java.io.IOException {
            r6 = this;
            r0 = 1819436136(0x6c726468, float:1.1721368E27)
            com.google.android.exoplayer2.extractor.avi.ListChunk r7 = com.google.android.exoplayer2.extractor.avi.ListChunk.parseFrom(r0, r7)
            int r1 = r7.getType()
            r2 = 0
            if (r1 != r0) goto L6c
            java.lang.Class<com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk> r0 = com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk.class
            com.google.android.exoplayer2.extractor.avi.AviChunk r0 = r7.getChild(r0)
            com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk r0 = (com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk) r0
            if (r0 == 0) goto L65
            r6.aviHeader = r0
            int r1 = r0.totalFrames
            long r1 = (long) r1
            int r0 = r0.frameDurationUs
            long r3 = (long) r0
            long r1 = r1 * r3
            r6.durationUs = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.extractor.avi.AviChunk> r7 = r7.children
            com.google.common.collect.UnmodifiableIterator r7 = r7.iterator()
            r1 = 0
            r2 = 0
        L31:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r7.next()
            com.google.android.exoplayer2.extractor.avi.AviChunk r3 = (com.google.android.exoplayer2.extractor.avi.AviChunk) r3
            int r4 = r3.getType()
            r5 = 1819440243(0x6c727473, float:1.17243986E27)
            if (r4 != r5) goto L31
            com.google.android.exoplayer2.extractor.avi.ListChunk r3 = (com.google.android.exoplayer2.extractor.avi.ListChunk) r3
            int r4 = r2 + 1
            com.google.android.exoplayer2.extractor.avi.ChunkReader r2 = r6.processStreamList(r3, r2)
            if (r2 == 0) goto L53
            r0.add(r2)
        L53:
            r2 = r4
            goto L31
        L55:
            com.google.android.exoplayer2.extractor.avi.ChunkReader[] r7 = new com.google.android.exoplayer2.extractor.avi.ChunkReader[r1]
            java.lang.Object[] r7 = r0.toArray(r7)
            com.google.android.exoplayer2.extractor.avi.ChunkReader[] r7 = (com.google.android.exoplayer2.extractor.avi.ChunkReader[]) r7
            r6.chunkReaders = r7
            com.google.android.exoplayer2.extractor.ExtractorOutput r7 = r6.extractorOutput
            r7.endTracks()
            return
        L65:
            java.lang.String r7 = "AviHeader not found"
            com.google.android.exoplayer2.ParserException r7 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r7, r2)
            throw r7
        L6c:
            java.lang.String r0 = "Unexpected header list type "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r7 = r7.getType()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.google.android.exoplayer2.ParserException r7 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r7, r2)
            throw r7
    }

    private void parseIdx1Body(com.google.android.exoplayer2.util.ParsableByteArray r8) {
            r7 = this;
            long r0 = r7.peekSeekOffset(r8)
        L4:
            int r2 = r8.bytesLeft()
            r3 = 16
            if (r2 < r3) goto L2e
            int r2 = r8.readLittleEndianInt()
            int r4 = r8.readLittleEndianInt()
            int r5 = r8.readLittleEndianInt()
            long r5 = (long) r5
            long r5 = r5 + r0
            r8.readLittleEndianInt()
            com.google.android.exoplayer2.extractor.avi.ChunkReader r2 = r7.getChunkReader(r2)
            if (r2 != 0) goto L24
            goto L4
        L24:
            r4 = r4 & r3
            if (r4 != r3) goto L2a
            r2.appendKeyFrameToIndex(r5)
        L2a:
            r2.incrementIndexChunkCount()
            goto L4
        L2e:
            com.google.android.exoplayer2.extractor.avi.ChunkReader[] r8 = r7.chunkReaders
            int r0 = r8.length
            r1 = 0
        L32:
            if (r1 >= r0) goto L3c
            r2 = r8[r1]
            r2.compactIndex()
            int r1 = r1 + 1
            goto L32
        L3c:
            r8 = 1
            r7.seekMapHasBeenOutput = r8
            com.google.android.exoplayer2.extractor.ExtractorOutput r8 = r7.extractorOutput
            com.google.android.exoplayer2.extractor.avi.AviExtractor$AviSeekMap r0 = new com.google.android.exoplayer2.extractor.avi.AviExtractor$AviSeekMap
            long r1 = r7.durationUs
            r0.<init>(r7, r1)
            r8.seekMap(r0)
            return
    }

    private long peekSeekOffset(com.google.android.exoplayer2.util.ParsableByteArray r9) {
            r8 = this;
            int r0 = r9.bytesLeft()
            r1 = 0
            r3 = 16
            if (r0 >= r3) goto Lb
            return r1
        Lb:
            int r0 = r9.getPosition()
            r3 = 8
            r9.skipBytes(r3)
            int r3 = r9.readLittleEndianInt()
            long r3 = (long) r3
            long r5 = r8.moviStart
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L20
            goto L23
        L20:
            r1 = 8
            long r1 = r1 + r5
        L23:
            r9.setPosition(r0)
            return r1
    }

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.avi.ChunkReader processStreamList(com.google.android.exoplayer2.extractor.avi.ListChunk r14, int r15) {
            r13 = this;
            java.lang.Class<com.google.android.exoplayer2.extractor.avi.AviStreamHeaderChunk> r0 = com.google.android.exoplayer2.extractor.avi.AviStreamHeaderChunk.class
            com.google.android.exoplayer2.extractor.avi.AviChunk r0 = r14.getChild(r0)
            com.google.android.exoplayer2.extractor.avi.AviStreamHeaderChunk r0 = (com.google.android.exoplayer2.extractor.avi.AviStreamHeaderChunk) r0
            java.lang.Class<com.google.android.exoplayer2.extractor.avi.StreamFormatChunk> r1 = com.google.android.exoplayer2.extractor.avi.StreamFormatChunk.class
            com.google.android.exoplayer2.extractor.avi.AviChunk r1 = r14.getChild(r1)
            com.google.android.exoplayer2.extractor.avi.StreamFormatChunk r1 = (com.google.android.exoplayer2.extractor.avi.StreamFormatChunk) r1
            java.lang.String r2 = "AviExtractor"
            r3 = 0
            if (r0 != 0) goto L1b
            java.lang.String r14 = "Missing Stream Header"
            com.google.android.exoplayer2.util.Log.w(r2, r14)
            return r3
        L1b:
            if (r1 != 0) goto L23
            java.lang.String r14 = "Missing Stream Format"
            com.google.android.exoplayer2.util.Log.w(r2, r14)
            return r3
        L23:
            long r11 = r0.getDurationUs()
            com.google.android.exoplayer2.Format r1 = r1.format
            com.google.android.exoplayer2.Format$Builder r2 = r1.buildUpon()
            r2.setId(r15)
            int r4 = r0.suggestedBufferSize
            if (r4 == 0) goto L37
            r2.setMaxInputSize(r4)
        L37:
            java.lang.Class<com.google.android.exoplayer2.extractor.avi.StreamNameChunk> r4 = com.google.android.exoplayer2.extractor.avi.StreamNameChunk.class
            com.google.android.exoplayer2.extractor.avi.AviChunk r14 = r14.getChild(r4)
            com.google.android.exoplayer2.extractor.avi.StreamNameChunk r14 = (com.google.android.exoplayer2.extractor.avi.StreamNameChunk) r14
            if (r14 == 0) goto L46
            java.lang.String r14 = r14.name
            r2.setLabel(r14)
        L46:
            java.lang.String r14 = r1.sampleMimeType
            int r6 = com.google.android.exoplayer2.util.MimeTypes.getTrackType(r14)
            r14 = 1
            if (r6 == r14) goto L54
            r14 = 2
            if (r6 != r14) goto L53
            goto L54
        L53:
            return r3
        L54:
            com.google.android.exoplayer2.extractor.ExtractorOutput r14 = r13.extractorOutput
            com.google.android.exoplayer2.extractor.TrackOutput r10 = r14.track(r15, r6)
            com.google.android.exoplayer2.Format r14 = r2.build()
            r10.format(r14)
            com.google.android.exoplayer2.extractor.avi.ChunkReader r14 = new com.google.android.exoplayer2.extractor.avi.ChunkReader
            int r9 = r0.length
            r4 = r14
            r5 = r15
            r7 = r11
            r4.<init>(r5, r6, r7, r9, r10)
            r13.durationUs = r11
            return r14
    }

    private int readMoviChunks(com.google.android.exoplayer2.extractor.ExtractorInput r8) throws java.io.IOException {
            r7 = this;
            long r0 = r8.getPosition()
            long r2 = r7.moviEnd
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto Lc
            r8 = -1
            return r8
        Lc:
            com.google.android.exoplayer2.extractor.avi.ChunkReader r0 = r7.currentChunkReader
            r1 = 0
            if (r0 == 0) goto L1b
            boolean r8 = r0.onChunkData(r8)
            if (r8 == 0) goto L86
            r8 = 0
            r7.currentChunkReader = r8
            goto L86
        L1b:
            alignInputToEvenPosition(r8)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.scratch
            byte[] r0 = r0.getData()
            r2 = 12
            r8.peekFully(r0, r1, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.scratch
            r0.setPosition(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.scratch
            int r0 = r0.readLittleEndianInt()
            r3 = 1414744396(0x5453494c, float:3.6298713E12)
            r4 = 8
            if (r0 != r3) goto L55
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.scratch
            r0.setPosition(r4)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.scratch
            int r0 = r0.readLittleEndianInt()
            r3 = 1769369453(0x69766f6d, float:1.8620122E25)
            if (r0 != r3) goto L4c
            goto L4e
        L4c:
            r2 = 8
        L4e:
            r8.skipFully(r2)
            r8.resetPeekPosition()
            return r1
        L55:
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r7.scratch
            int r2 = r2.readLittleEndianInt()
            r3 = 1263424842(0x4b4e554a, float:1.352225E7)
            if (r0 != r3) goto L6c
            long r3 = r8.getPosition()
            long r5 = (long) r2
            long r3 = r3 + r5
            r5 = 8
            long r3 = r3 + r5
            r7.pendingReposition = r3
            return r1
        L6c:
            r8.skipFully(r4)
            r8.resetPeekPosition()
            com.google.android.exoplayer2.extractor.avi.ChunkReader r0 = r7.getChunkReader(r0)
            if (r0 != 0) goto L81
            long r3 = r8.getPosition()
            long r5 = (long) r2
            long r3 = r3 + r5
            r7.pendingReposition = r3
            return r1
        L81:
            r0.onChunkStart(r2)
            r7.currentChunkReader = r0
        L86:
            return r1
    }

    private boolean resolvePendingReposition(com.google.android.exoplayer2.extractor.ExtractorInput r10, com.google.android.exoplayer2.extractor.PositionHolder r11) throws java.io.IOException {
            r9 = this;
            long r0 = r9.pendingReposition
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L25
            long r0 = r10.getPosition()
            long r4 = r9.pendingReposition
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 < 0) goto L21
            r6 = 262144(0x40000, double:1.295163E-318)
            long r6 = r6 + r0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L1b
            goto L21
        L1b:
            long r4 = r4 - r0
            int r11 = (int) r4
            r10.skipFully(r11)
            goto L25
        L21:
            r11.position = r4
            r10 = 1
            goto L26
        L25:
            r10 = 0
        L26:
            r9.pendingReposition = r2
            return r10
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r3) {
            r2 = this;
            r0 = 0
            r2.state = r0
            r2.extractorOutput = r3
            r0 = -1
            r2.pendingReposition = r0
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r13, com.google.android.exoplayer2.extractor.PositionHolder r14) throws java.io.IOException {
            r12 = this;
            boolean r14 = r12.resolvePendingReposition(r13, r14)
            r0 = 1
            if (r14 == 0) goto L8
            return r0
        L8:
            int r14 = r12.state
            r1 = 0
            r2 = 6
            r3 = 4
            r4 = 12
            r5 = 0
            switch(r14) {
                case 0: goto L157;
                case 1: goto L11b;
                case 2: goto L105;
                case 3: goto L68;
                case 4: goto L38;
                case 5: goto L1e;
                case 6: goto L19;
                default: goto L13;
            }
        L13:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            r13.<init>()
            throw r13
        L19:
            int r13 = r12.readMoviChunks(r13)
            return r13
        L1e:
            com.google.android.exoplayer2.util.ParsableByteArray r14 = new com.google.android.exoplayer2.util.ParsableByteArray
            int r0 = r12.idx1BodySize
            r14.<init>(r0)
            byte[] r0 = r14.getData()
            int r1 = r12.idx1BodySize
            r13.readFully(r0, r5, r1)
            r12.parseIdx1Body(r14)
            r12.state = r2
            long r13 = r12.moviStart
            r12.pendingReposition = r13
            return r5
        L38:
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r12.scratch
            byte[] r14 = r14.getData()
            r0 = 8
            r13.readFully(r14, r5, r0)
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r12.scratch
            r14.setPosition(r5)
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r12.scratch
            int r14 = r14.readLittleEndianInt()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r12.scratch
            int r0 = r0.readLittleEndianInt()
            r1 = 829973609(0x31786469, float:3.6145826E-9)
            if (r14 != r1) goto L5f
            r13 = 5
            r12.state = r13
            r12.idx1BodySize = r0
            goto L67
        L5f:
            long r13 = r13.getPosition()
            long r0 = (long) r0
            long r13 = r13 + r0
            r12.pendingReposition = r13
        L67:
            return r5
        L68:
            long r6 = r12.moviStart
            r8 = -1
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 == 0) goto L7d
            long r6 = r13.getPosition()
            long r8 = r12.moviStart
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 == 0) goto L7d
            r12.pendingReposition = r8
            return r5
        L7d:
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r12.scratch
            byte[] r14 = r14.getData()
            r13.peekFully(r14, r5, r4)
            r13.resetPeekPosition()
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r12.scratch
            r14.setPosition(r5)
            com.google.android.exoplayer2.extractor.avi.AviExtractor$ChunkHeaderHolder r14 = r12.chunkHeaderHolder
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r12.scratch
            r14.populateFrom(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r12.scratch
            int r14 = r14.readLittleEndianInt()
            com.google.android.exoplayer2.extractor.avi.AviExtractor$ChunkHeaderHolder r1 = r12.chunkHeaderHolder
            int r1 = r1.chunkType
            r6 = 1179011410(0x46464952, float:12690.33)
            if (r1 != r6) goto La8
            r13.skipFully(r4)
            return r5
        La8:
            r4 = 1414744396(0x5453494c, float:3.6298713E12)
            r6 = 8
            if (r1 != r4) goto Lf7
            r1 = 1769369453(0x69766f6d, float:1.8620122E25)
            if (r14 == r1) goto Lb5
            goto Lf7
        Lb5:
            long r8 = r13.getPosition()
            r12.moviStart = r8
            com.google.android.exoplayer2.extractor.avi.AviExtractor$ChunkHeaderHolder r14 = r12.chunkHeaderHolder
            int r14 = r14.size
            long r10 = (long) r14
            long r8 = r8 + r10
            long r8 = r8 + r6
            r12.moviEnd = r8
            boolean r14 = r12.seekMapHasBeenOutput
            if (r14 != 0) goto Leb
            com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk r14 = r12.aviHeader
            java.lang.Object r14 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r14)
            com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk r14 = (com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk) r14
            boolean r14 = r14.hasIndex()
            if (r14 == 0) goto Ldd
            r12.state = r3
            long r13 = r12.moviEnd
            r12.pendingReposition = r13
            return r5
        Ldd:
            com.google.android.exoplayer2.extractor.ExtractorOutput r14 = r12.extractorOutput
            com.google.android.exoplayer2.extractor.SeekMap$Unseekable r1 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
            long r3 = r12.durationUs
            r1.<init>(r3)
            r14.seekMap(r1)
            r12.seekMapHasBeenOutput = r0
        Leb:
            long r13 = r13.getPosition()
            r0 = 12
            long r13 = r13 + r0
            r12.pendingReposition = r13
            r12.state = r2
            return r5
        Lf7:
            long r13 = r13.getPosition()
            com.google.android.exoplayer2.extractor.avi.AviExtractor$ChunkHeaderHolder r0 = r12.chunkHeaderHolder
            int r0 = r0.size
            long r0 = (long) r0
            long r13 = r13 + r0
            long r13 = r13 + r6
            r12.pendingReposition = r13
            return r5
        L105:
            int r14 = r12.hdrlSize
            int r14 = r14 - r3
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>(r14)
            byte[] r1 = r0.getData()
            r13.readFully(r1, r5, r14)
            r12.parseHdrlBody(r0)
            r13 = 3
            r12.state = r13
            return r5
        L11b:
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r12.scratch
            byte[] r14 = r14.getData()
            r13.readFully(r14, r5, r4)
            com.google.android.exoplayer2.util.ParsableByteArray r13 = r12.scratch
            r13.setPosition(r5)
            com.google.android.exoplayer2.extractor.avi.AviExtractor$ChunkHeaderHolder r13 = r12.chunkHeaderHolder
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r12.scratch
            r13.populateWithListHeaderFrom(r14)
            com.google.android.exoplayer2.extractor.avi.AviExtractor$ChunkHeaderHolder r13 = r12.chunkHeaderHolder
            int r14 = r13.listType
            r0 = 1819436136(0x6c726468, float:1.1721368E27)
            if (r14 != r0) goto L141
            int r13 = r13.size
            r12.hdrlSize = r13
            r13 = 2
            r12.state = r13
            return r5
        L141:
            java.lang.String r13 = "hdrl expected, found: "
            java.lang.StringBuilder r13 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r13)
            com.google.android.exoplayer2.extractor.avi.AviExtractor$ChunkHeaderHolder r14 = r12.chunkHeaderHolder
            int r14 = r14.listType
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.google.android.exoplayer2.ParserException r13 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r13, r1)
            throw r13
        L157:
            boolean r14 = r12.sniff(r13)
            if (r14 == 0) goto L163
            r13.skipFully(r4)
            r12.state = r0
            return r5
        L163:
            java.lang.String r13 = "AVI Header List not found"
            com.google.android.exoplayer2.ParserException r13 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r13, r1)
            throw r13
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long r4, long r6) {
            r3 = this;
            r6 = -1
            r3.pendingReposition = r6
            r6 = 0
            r3.currentChunkReader = r6
            com.google.android.exoplayer2.extractor.avi.ChunkReader[] r6 = r3.chunkReaders
            int r7 = r6.length
            r0 = 0
            r1 = 0
        Lc:
            if (r1 >= r7) goto L16
            r2 = r6[r1]
            r2.seekToPosition(r4)
            int r1 = r1 + 1
            goto Lc
        L16:
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L28
            com.google.android.exoplayer2.extractor.avi.ChunkReader[] r4 = r3.chunkReaders
            int r4 = r4.length
            if (r4 != 0) goto L24
            r3.state = r0
            goto L27
        L24:
            r4 = 3
            r3.state = r4
        L27:
            return
        L28:
            r4 = 6
            r3.state = r4
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
            r3 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            byte[] r0 = r0.getData()
            r1 = 0
            r2 = 12
            r4.peekFully(r0, r1, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r3.scratch
            r4.setPosition(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r3.scratch
            int r4 = r4.readLittleEndianInt()
            r0 = 1179011410(0x46464952, float:12690.33)
            if (r4 == r0) goto L1d
            return r1
        L1d:
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r3.scratch
            r0 = 4
            r4.skipBytes(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r3.scratch
            int r4 = r4.readLittleEndianInt()
            r0 = 541677121(0x20495641, float:1.7053901E-19)
            if (r4 != r0) goto L2f
            r1 = 1
        L2f:
            return r1
    }
}
