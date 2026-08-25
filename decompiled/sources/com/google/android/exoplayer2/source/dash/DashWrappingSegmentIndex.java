package com.google.android.exoplayer2.source.dash;

/* JADX INFO: loaded from: classes.dex */
public final class DashWrappingSegmentIndex implements com.google.android.exoplayer2.source.dash.DashSegmentIndex {
    private final com.google.android.exoplayer2.extractor.ChunkIndex chunkIndex;
    private final long timeOffsetUs;

    public DashWrappingSegmentIndex(com.google.android.exoplayer2.extractor.ChunkIndex r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.chunkIndex = r1
            r0.timeOffsetUs = r2
            return
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getAvailableSegmentCount(long r1, long r3) {
            r0 = this;
            com.google.android.exoplayer2.extractor.ChunkIndex r1 = r0.chunkIndex
            int r1 = r1.length
            long r1 = (long) r1
            return r1
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getDurationUs(long r1, long r3) {
            r0 = this;
            com.google.android.exoplayer2.extractor.ChunkIndex r3 = r0.chunkIndex
            long[] r3 = r3.durationsUs
            int r2 = (int) r1
            r1 = r3[r2]
            return r1
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getFirstAvailableSegmentNum(long r1, long r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getFirstSegmentNum() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getNextSegmentAvailableTimeUs(long r1, long r3) {
            r0 = this;
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r1
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getSegmentCount(long r1) {
            r0 = this;
            com.google.android.exoplayer2.extractor.ChunkIndex r1 = r0.chunkIndex
            int r1 = r1.length
            long r1 = (long) r1
            return r1
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getSegmentNum(long r3, long r5) {
            r2 = this;
            com.google.android.exoplayer2.extractor.ChunkIndex r5 = r2.chunkIndex
            long r0 = r2.timeOffsetUs
            long r3 = r3 + r0
            int r3 = r5.getChunkIndex(r3)
            long r3 = (long) r3
            return r3
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public com.google.android.exoplayer2.source.dash.manifest.RangedUri getSegmentUrl(long r8) {
            r7 = this;
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r6 = new com.google.android.exoplayer2.source.dash.manifest.RangedUri
            com.google.android.exoplayer2.extractor.ChunkIndex r0 = r7.chunkIndex
            long[] r1 = r0.offsets
            int r9 = (int) r8
            r2 = r1[r9]
            int[] r8 = r0.sizes
            r8 = r8[r9]
            long r4 = (long) r8
            r1 = 0
            r0 = r6
            r0.<init>(r1, r2, r4)
            return r6
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getTimeUs(long r3) {
            r2 = this;
            com.google.android.exoplayer2.extractor.ChunkIndex r0 = r2.chunkIndex
            long[] r0 = r0.timesUs
            int r4 = (int) r3
            r3 = r0[r4]
            long r0 = r2.timeOffsetUs
            long r3 = r3 - r0
            return r3
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public boolean isExplicit() {
            r1 = this;
            r0 = 1
            return r0
    }
}
