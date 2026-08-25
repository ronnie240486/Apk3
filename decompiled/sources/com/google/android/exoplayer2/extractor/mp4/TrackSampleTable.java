package com.google.android.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
final class TrackSampleTable {
    public final long durationUs;
    public final int[] flags;
    public final int maximumSize;
    public final long[] offsets;
    public final int sampleCount;
    public final int[] sizes;
    public final long[] timestampsUs;
    public final com.google.android.exoplayer2.extractor.mp4.Track track;

    public TrackSampleTable(com.google.android.exoplayer2.extractor.mp4.Track r5, long[] r6, int[] r7, int r8, long[] r9, int[] r10, long r11) {
            r4 = this;
            r4.<init>()
            int r0 = r7.length
            int r1 = r9.length
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            int r0 = r6.length
            int r1 = r9.length
            if (r0 != r1) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            int r0 = r10.length
            int r1 = r9.length
            if (r0 != r1) goto L1e
            r2 = 1
        L1e:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            r4.track = r5
            r4.offsets = r6
            r4.sizes = r7
            r4.maximumSize = r8
            r4.timestampsUs = r9
            r4.flags = r10
            r4.durationUs = r11
            int r5 = r6.length
            r4.sampleCount = r5
            int r5 = r10.length
            if (r5 <= 0) goto L3e
            int r5 = r10.length
            int r5 = r5 - r3
            r6 = r10[r5]
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = r6 | r7
            r10[r5] = r6
        L3e:
            return
    }

    public int getIndexOfEarlierOrEqualSynchronizationSample(long r4) {
            r3 = this;
            long[] r0 = r3.timestampsUs
            r1 = 1
            r2 = 0
            int r4 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r0, r4, r1, r2)
        L8:
            if (r4 < 0) goto L15
            int[] r5 = r3.flags
            r5 = r5[r4]
            r5 = r5 & r1
            if (r5 == 0) goto L12
            return r4
        L12:
            int r4 = r4 + (-1)
            goto L8
        L15:
            r4 = -1
            return r4
    }

    public int getIndexOfLaterOrEqualSynchronizationSample(long r4) {
            r3 = this;
            long[] r0 = r3.timestampsUs
            r1 = 1
            r2 = 0
            int r4 = com.google.android.exoplayer2.util.Util.binarySearchCeil(r0, r4, r1, r2)
        L8:
            long[] r5 = r3.timestampsUs
            int r5 = r5.length
            if (r4 >= r5) goto L18
            int[] r5 = r3.flags
            r5 = r5[r4]
            r5 = r5 & r1
            if (r5 == 0) goto L15
            return r4
        L15:
            int r4 = r4 + 1
            goto L8
        L18:
            r4 = -1
            return r4
    }
}
