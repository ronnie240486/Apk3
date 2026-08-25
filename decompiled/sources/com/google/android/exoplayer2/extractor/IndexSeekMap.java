package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes2.dex */
public final class IndexSeekMap implements com.google.android.exoplayer2.extractor.SeekMap {
    private final long durationUs;
    private final boolean isSeekable;
    private final long[] positions;
    private final long[] timesUs;

    public IndexSeekMap(long[] r9, long[] r10, long r11) {
            r8 = this;
            r8.<init>()
            int r0 = r9.length
            int r1 = r10.length
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            int r0 = r10.length
            if (r0 <= 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            r8.isSeekable = r1
            if (r1 == 0) goto L32
            r4 = r10[r3]
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L32
            int r1 = r0 + 1
            long[] r4 = new long[r1]
            r8.positions = r4
            long[] r1 = new long[r1]
            r8.timesUs = r1
            java.lang.System.arraycopy(r9, r3, r4, r2, r0)
            java.lang.System.arraycopy(r10, r3, r1, r2, r0)
            goto L36
        L32:
            r8.positions = r9
            r8.timesUs = r10
        L36:
            r8.durationUs = r11
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
            boolean r0 = r8.isSeekable
            if (r0 != 0) goto Lc
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r9 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            com.google.android.exoplayer2.extractor.SeekPoint r10 = com.google.android.exoplayer2.extractor.SeekPoint.START
            r9.<init>(r10)
            return r9
        Lc:
            long[] r0 = r8.timesUs
            r1 = 1
            int r0 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r0, r9, r1, r1)
            com.google.android.exoplayer2.extractor.SeekPoint r2 = new com.google.android.exoplayer2.extractor.SeekPoint
            long[] r3 = r8.timesUs
            r4 = r3[r0]
            long[] r3 = r8.positions
            r6 = r3[r0]
            r2.<init>(r4, r6)
            long r3 = r2.timeUs
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 == 0) goto L41
            long[] r9 = r8.timesUs
            int r9 = r9.length
            int r9 = r9 - r1
            if (r0 != r9) goto L2d
            goto L41
        L2d:
            com.google.android.exoplayer2.extractor.SeekPoint r9 = new com.google.android.exoplayer2.extractor.SeekPoint
            long[] r10 = r8.timesUs
            int r0 = r0 + r1
            r3 = r10[r0]
            long[] r10 = r8.positions
            r0 = r10[r0]
            r9.<init>(r3, r0)
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r10 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            r10.<init>(r2, r9)
            return r10
        L41:
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r9 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            r9.<init>(r2)
            return r9
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
            r1 = this;
            boolean r0 = r1.isSeekable
            return r0
    }
}
