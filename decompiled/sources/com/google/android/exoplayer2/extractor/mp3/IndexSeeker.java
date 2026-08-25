package com.google.android.exoplayer2.extractor.mp3;

/* JADX INFO: loaded from: classes2.dex */
final class IndexSeeker implements com.google.android.exoplayer2.extractor.mp3.Seeker {
    private final long dataEndPosition;
    private long durationUs;
    private final com.google.android.exoplayer2.util.LongArray positions;
    private final com.google.android.exoplayer2.util.LongArray timesUs;

    public IndexSeeker(long r1, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.durationUs = r1
            r0.dataEndPosition = r5
            com.google.android.exoplayer2.util.LongArray r1 = new com.google.android.exoplayer2.util.LongArray
            r1.<init>()
            r0.timesUs = r1
            com.google.android.exoplayer2.util.LongArray r2 = new com.google.android.exoplayer2.util.LongArray
            r2.<init>()
            r0.positions = r2
            r5 = 0
            r1.add(r5)
            r2.add(r3)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
            r2 = this;
            long r0 = r2.dataEndPosition
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
            r2 = this;
            long r0 = r2.durationUs
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long r8) {
            r7 = this;
            com.google.android.exoplayer2.util.LongArray r0 = r7.timesUs
            r1 = 1
            int r0 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r0, r8, r1, r1)
            com.google.android.exoplayer2.extractor.SeekPoint r2 = new com.google.android.exoplayer2.extractor.SeekPoint
            com.google.android.exoplayer2.util.LongArray r3 = r7.timesUs
            long r3 = r3.get(r0)
            com.google.android.exoplayer2.util.LongArray r5 = r7.positions
            long r5 = r5.get(r0)
            r2.<init>(r3, r5)
            long r3 = r2.timeUs
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 == 0) goto L40
            com.google.android.exoplayer2.util.LongArray r8 = r7.timesUs
            int r8 = r8.size()
            int r8 = r8 - r1
            if (r0 != r8) goto L28
            goto L40
        L28:
            com.google.android.exoplayer2.extractor.SeekPoint r8 = new com.google.android.exoplayer2.extractor.SeekPoint
            com.google.android.exoplayer2.util.LongArray r9 = r7.timesUs
            int r0 = r0 + r1
            long r3 = r9.get(r0)
            com.google.android.exoplayer2.util.LongArray r9 = r7.positions
            long r0 = r9.get(r0)
            r8.<init>(r3, r0)
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r9 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            r9.<init>(r2, r8)
            return r9
        L40:
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r8 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            r8.<init>(r2)
            return r8
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long r3) {
            r2 = this;
            com.google.android.exoplayer2.util.LongArray r0 = r2.positions
            r1 = 1
            int r3 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r0, r3, r1, r1)
            com.google.android.exoplayer2.util.LongArray r4 = r2.timesUs
            long r3 = r4.get(r3)
            return r3
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean isTimeUsInIndex(long r5) {
            r4 = this;
            com.google.android.exoplayer2.util.LongArray r0 = r4.timesUs
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
            long r0 = r0.get(r1)
            long r5 = r5 - r0
            r0 = 100000(0x186a0, double:4.94066E-319)
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 >= 0) goto L15
            goto L16
        L15:
            r2 = 0
        L16:
            return r2
    }

    public void maybeAddSeekPoint(long r2, long r4) {
            r1 = this;
            boolean r0 = r1.isTimeUsInIndex(r2)
            if (r0 == 0) goto L7
            return
        L7:
            com.google.android.exoplayer2.util.LongArray r0 = r1.timesUs
            r0.add(r2)
            com.google.android.exoplayer2.util.LongArray r2 = r1.positions
            r2.add(r4)
            return
    }

    public final void setDurationUs(long r1) {
            r0 = this;
            r0.durationUs = r1
            return
    }
}
