package com.google.android.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes.dex */
final class OggPageHeader {
    private static final int CAPTURE_PATTERN = 1332176723;
    private static final int CAPTURE_PATTERN_SIZE = 4;
    public static final int EMPTY_PAGE_HEADER_SIZE = 27;
    public static final int MAX_PAGE_PAYLOAD = 65025;
    public static final int MAX_PAGE_SIZE = 65307;
    public static final int MAX_SEGMENT_COUNT = 255;
    public int bodySize;
    public long granulePosition;
    public int headerSize;
    public final int[] laces;
    public long pageChecksum;
    public int pageSegmentCount;
    public long pageSequenceNumber;
    public int revision;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch;
    public long streamSerialNumber;
    public int type;

    public OggPageHeader() {
            r2 = this;
            r2.<init>()
            r0 = 255(0xff, float:3.57E-43)
            int[] r1 = new int[r0]
            r2.laces = r1
            com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1.<init>(r0)
            r2.scratch = r1
            return
    }

    public boolean populate(com.google.android.exoplayer2.extractor.ExtractorInput r7, boolean r8) throws java.io.IOException {
            r6 = this;
            r6.reset()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.scratch
            r1 = 27
            r0.reset(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.scratch
            byte[] r0 = r0.getData()
            r2 = 0
            boolean r0 = com.google.android.exoplayer2.extractor.ExtractorUtil.peekFullyQuietly(r7, r0, r2, r1, r8)
            if (r0 == 0) goto L9f
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.scratch
            long r0 = r0.readUnsignedInt()
            r3 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L26
            goto L9f
        L26:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.scratch
            int r0 = r0.readUnsignedByte()
            r6.revision = r0
            if (r0 == 0) goto L3b
            if (r8 == 0) goto L33
            return r2
        L33:
            java.lang.String r7 = "unsupported bit stream revision"
            com.google.android.exoplayer2.ParserException r7 = com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature(r7)
            throw r7
        L3b:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.scratch
            int r0 = r0.readUnsignedByte()
            r6.type = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.scratch
            long r0 = r0.readLittleEndianLong()
            r6.granulePosition = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.scratch
            long r0 = r0.readLittleEndianUnsignedInt()
            r6.streamSerialNumber = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.scratch
            long r0 = r0.readLittleEndianUnsignedInt()
            r6.pageSequenceNumber = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.scratch
            long r0 = r0.readLittleEndianUnsignedInt()
            r6.pageChecksum = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.scratch
            int r0 = r0.readUnsignedByte()
            r6.pageSegmentCount = r0
            int r1 = r0 + 27
            r6.headerSize = r1
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r6.scratch
            r1.reset(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.scratch
            byte[] r0 = r0.getData()
            int r1 = r6.pageSegmentCount
            boolean r7 = com.google.android.exoplayer2.extractor.ExtractorUtil.peekFullyQuietly(r7, r0, r2, r1, r8)
            if (r7 != 0) goto L83
            return r2
        L83:
            int r7 = r6.pageSegmentCount
            if (r2 >= r7) goto L9d
            int[] r7 = r6.laces
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r6.scratch
            int r8 = r8.readUnsignedByte()
            r7[r2] = r8
            int r7 = r6.bodySize
            int[] r8 = r6.laces
            r8 = r8[r2]
            int r7 = r7 + r8
            r6.bodySize = r7
            int r2 = r2 + 1
            goto L83
        L9d:
            r7 = 1
            return r7
        L9f:
            return r2
    }

    public void reset() {
            r3 = this;
            r0 = 0
            r3.revision = r0
            r3.type = r0
            r1 = 0
            r3.granulePosition = r1
            r3.streamSerialNumber = r1
            r3.pageSequenceNumber = r1
            r3.pageChecksum = r1
            r3.pageSegmentCount = r0
            r3.headerSize = r0
            r3.bodySize = r0
            return
    }

    public boolean skipToNextPage(com.google.android.exoplayer2.extractor.ExtractorInput r3) throws java.io.IOException {
            r2 = this;
            r0 = -1
            boolean r3 = r2.skipToNextPage(r3, r0)
            return r3
    }

    public boolean skipToNextPage(com.google.android.exoplayer2.extractor.ExtractorInput r9, long r10) throws java.io.IOException {
            r8 = this;
            long r0 = r9.getPosition()
            long r2 = r9.getPeekPosition()
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r8.scratch
            r1 = 4
            r0.reset(r1)
        L1a:
            r2 = -1
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r2 = r9.getPosition()
            r6 = 4
            long r2 = r2 + r6
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 >= 0) goto L51
        L2b:
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r8.scratch
            byte[] r2 = r2.getData()
            boolean r2 = com.google.android.exoplayer2.extractor.ExtractorUtil.peekFullyQuietly(r9, r2, r4, r1, r5)
            if (r2 == 0) goto L51
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r8.scratch
            r0.setPosition(r4)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r8.scratch
            long r2 = r0.readUnsignedInt()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r9.resetPeekPosition()
            return r5
        L4d:
            r9.skipFully(r5)
            goto L1a
        L51:
            if (r0 == 0) goto L5b
            long r1 = r9.getPosition()
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 >= 0) goto L63
        L5b:
            int r1 = r9.skip(r5)
            r2 = -1
            if (r1 == r2) goto L63
            goto L51
        L63:
            return r4
    }
}
