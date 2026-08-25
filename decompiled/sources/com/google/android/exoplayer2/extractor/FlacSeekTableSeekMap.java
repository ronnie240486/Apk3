package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes3.dex */
public final class FlacSeekTableSeekMap implements com.google.android.exoplayer2.extractor.SeekMap {
    private final long firstFrameOffset;
    private final com.google.android.exoplayer2.extractor.FlacStreamMetadata flacStreamMetadata;

    public FlacSeekTableSeekMap(com.google.android.exoplayer2.extractor.FlacStreamMetadata r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.flacStreamMetadata = r1
            r0.firstFrameOffset = r2
            return
    }

    private com.google.android.exoplayer2.extractor.SeekPoint getSeekPoint(long r3, long r5) {
            r2 = this;
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r0
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r0 = r2.flacStreamMetadata
            int r0 = r0.sampleRate
            long r0 = (long) r0
            long r3 = r3 / r0
            long r0 = r2.firstFrameOffset
            long r0 = r0 + r5
            com.google.android.exoplayer2.extractor.SeekPoint r5 = new com.google.android.exoplayer2.extractor.SeekPoint
            r5.<init>(r3, r0)
            return r5
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
            r2 = this;
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r0 = r2.flacStreamMetadata
            long r0 = r0.getDurationUs()
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long r10) {
            r9 = this;
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r0 = r9.flacStreamMetadata
            com.google.android.exoplayer2.extractor.FlacStreamMetadata$SeekTable r0 = r0.seekTable
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r0 = r9.flacStreamMetadata
            com.google.android.exoplayer2.extractor.FlacStreamMetadata$SeekTable r1 = r0.seekTable
            long[] r2 = r1.pointSampleNumbers
            long[] r1 = r1.pointOffsets
            long r3 = r0.getSampleNumber(r10)
            r0 = 1
            r5 = 0
            int r3 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r2, r3, r0, r5)
            r4 = 0
            r6 = -1
            if (r3 != r6) goto L20
            r7 = r4
            goto L22
        L20:
            r7 = r2[r3]
        L22:
            if (r3 != r6) goto L25
            goto L27
        L25:
            r4 = r1[r3]
        L27:
            com.google.android.exoplayer2.extractor.SeekPoint r4 = r9.getSeekPoint(r7, r4)
            long r5 = r4.timeUs
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 == 0) goto L45
            int r10 = r2.length
            int r10 = r10 - r0
            if (r3 != r10) goto L36
            goto L45
        L36:
            int r3 = r3 + r0
            r10 = r2[r3]
            r0 = r1[r3]
            com.google.android.exoplayer2.extractor.SeekPoint r10 = r9.getSeekPoint(r10, r0)
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r11 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            r11.<init>(r4, r10)
            return r11
        L45:
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r10 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            r10.<init>(r4)
            return r10
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
            r1 = this;
            r0 = 1
            return r0
    }
}
