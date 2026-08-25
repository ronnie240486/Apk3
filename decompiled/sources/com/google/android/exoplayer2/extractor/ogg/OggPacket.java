package com.google.android.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes2.dex */
final class OggPacket {
    private int currentSegmentIndex;
    private final com.google.android.exoplayer2.util.ParsableByteArray packetArray;
    private final com.google.android.exoplayer2.extractor.ogg.OggPageHeader pageHeader;
    private boolean populated;
    private int segmentCount;

    public OggPacket() {
            r3 = this;
            r3.<init>()
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = new com.google.android.exoplayer2.extractor.ogg.OggPageHeader
            r0.<init>()
            r3.pageHeader = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 65025(0xfe01, float:9.112E-41)
            byte[] r1 = new byte[r1]
            r2 = 0
            r0.<init>(r1, r2)
            r3.packetArray = r0
            r0 = -1
            r3.currentSegmentIndex = r0
            return
    }

    private int calculatePacketSize(int r6) {
            r5 = this;
            r0 = 0
            r5.segmentCount = r0
        L3:
            int r1 = r5.segmentCount
            int r2 = r6 + r1
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r3 = r5.pageHeader
            int r4 = r3.pageSegmentCount
            if (r2 >= r4) goto L1b
            int[] r2 = r3.laces
            int r3 = r1 + 1
            r5.segmentCount = r3
            int r1 = r1 + r6
            r1 = r2[r1]
            int r0 = r0 + r1
            r2 = 255(0xff, float:3.57E-43)
            if (r1 == r2) goto L3
        L1b:
            return r0
    }

    public com.google.android.exoplayer2.extractor.ogg.OggPageHeader getPageHeader() {
            r1 = this;
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = r1.pageHeader
            return r0
    }

    public com.google.android.exoplayer2.util.ParsableByteArray getPayload() {
            r1 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r1.packetArray
            return r0
    }

    public boolean populate(com.google.android.exoplayer2.extractor.ExtractorInput r7) throws java.io.IOException {
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkState(r2)
            boolean r2 = r6.populated
            if (r2 == 0) goto L15
            r6.populated = r1
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r6.packetArray
            r2.reset(r1)
        L15:
            boolean r2 = r6.populated
            if (r2 != 0) goto La4
            int r2 = r6.currentSegmentIndex
            if (r2 >= 0) goto L54
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r2 = r6.pageHeader
            boolean r2 = r2.skipToNextPage(r7)
            if (r2 == 0) goto L53
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r2 = r6.pageHeader
            boolean r2 = r2.populate(r7, r0)
            if (r2 != 0) goto L2e
            goto L53
        L2e:
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r2 = r6.pageHeader
            int r3 = r2.headerSize
            int r2 = r2.type
            r2 = r2 & r0
            if (r2 != r0) goto L48
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r6.packetArray
            int r2 = r2.limit()
            if (r2 != 0) goto L48
            int r2 = r6.calculatePacketSize(r1)
            int r3 = r3 + r2
            int r2 = r6.segmentCount
            int r2 = r2 + r1
            goto L49
        L48:
            r2 = 0
        L49:
            boolean r3 = com.google.android.exoplayer2.extractor.ExtractorUtil.skipFullyQuietly(r7, r3)
            if (r3 != 0) goto L50
            return r1
        L50:
            r6.currentSegmentIndex = r2
            goto L54
        L53:
            return r1
        L54:
            int r2 = r6.currentSegmentIndex
            int r2 = r6.calculatePacketSize(r2)
            int r3 = r6.currentSegmentIndex
            int r4 = r6.segmentCount
            int r3 = r3 + r4
            if (r2 <= 0) goto L99
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r6.packetArray
            int r5 = r4.limit()
            int r5 = r5 + r2
            r4.ensureCapacity(r5)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r6.packetArray
            byte[] r4 = r4.getData()
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r6.packetArray
            int r5 = r5.limit()
            boolean r4 = com.google.android.exoplayer2.extractor.ExtractorUtil.readFullyQuietly(r7, r4, r5, r2)
            if (r4 != 0) goto L7e
            return r1
        L7e:
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r6.packetArray
            int r5 = r4.limit()
            int r5 = r5 + r2
            r4.setLimit(r5)
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r2 = r6.pageHeader
            int[] r2 = r2.laces
            int r4 = r3 + (-1)
            r2 = r2[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r2 == r4) goto L96
            r2 = 1
            goto L97
        L96:
            r2 = 0
        L97:
            r6.populated = r2
        L99:
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r2 = r6.pageHeader
            int r2 = r2.pageSegmentCount
            if (r3 != r2) goto La0
            r3 = -1
        La0:
            r6.currentSegmentIndex = r3
            goto L15
        La4:
            return r0
    }

    public void reset() {
            r2 = this;
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = r2.pageHeader
            r0.reset()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r2.packetArray
            r1 = 0
            r0.reset(r1)
            r0 = -1
            r2.currentSegmentIndex = r0
            r2.populated = r1
            return
    }

    public void trimPayload() {
            r4 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.packetArray
            byte[] r0 = r0.getData()
            int r0 = r0.length
            r1 = 65025(0xfe01, float:9.112E-41)
            if (r0 != r1) goto Ld
            return
        Ld:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.packetArray
            byte[] r2 = r0.getData()
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r4.packetArray
            int r3 = r3.limit()
            int r1 = java.lang.Math.max(r1, r3)
            byte[] r1 = java.util.Arrays.copyOf(r2, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r4.packetArray
            int r2 = r2.limit()
            r0.reset(r1, r2)
            return
    }
}
