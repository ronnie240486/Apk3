package com.google.android.exoplayer2.extractor.mp3;

/* JADX INFO: loaded from: classes3.dex */
final class MlltSeeker implements com.google.android.exoplayer2.extractor.mp3.Seeker {
    private final long durationUs;
    private final long[] referencePositions;
    private final long[] referenceTimesMs;

    private MlltSeeker(long[] r3, long[] r4, long r5) {
            r2 = this;
            r2.<init>()
            r2.referencePositions = r3
            r2.referenceTimesMs = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 == 0) goto L11
            goto L1a
        L11:
            int r3 = r4.length
            int r3 = r3 + (-1)
            r3 = r4[r3]
            long r5 = com.google.android.exoplayer2.util.Util.msToUs(r3)
        L1a:
            r2.durationUs = r5
            return
    }

    public static com.google.android.exoplayer2.extractor.mp3.MlltSeeker create(long r9, com.google.android.exoplayer2.metadata.id3.MlltFrame r11, long r12) {
            int[] r0 = r11.bytesDeviations
            int r0 = r0.length
            int r1 = r0 + 1
            long[] r2 = new long[r1]
            long[] r1 = new long[r1]
            r3 = 0
            r2[r3] = r9
            r4 = 0
            r1[r3] = r4
            r3 = 1
        L11:
            if (r3 > r0) goto L2e
            int r6 = r11.bytesBetweenReference
            int[] r7 = r11.bytesDeviations
            int r8 = r3 + (-1)
            r7 = r7[r8]
            int r6 = r6 + r7
            long r6 = (long) r6
            long r9 = r9 + r6
            int r6 = r11.millisecondsBetweenReference
            int[] r7 = r11.millisecondsDeviations
            r7 = r7[r8]
            int r6 = r6 + r7
            long r6 = (long) r6
            long r4 = r4 + r6
            r2[r3] = r9
            r1[r3] = r4
            int r3 = r3 + 1
            goto L11
        L2e:
            com.google.android.exoplayer2.extractor.mp3.MlltSeeker r9 = new com.google.android.exoplayer2.extractor.mp3.MlltSeeker
            r9.<init>(r2, r1, r12)
            return r9
    }

    private static android.util.Pair<java.lang.Long, java.lang.Long> linearlyInterpolate(long r10, long[] r12, long[] r13) {
            r0 = 1
            int r1 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r12, r10, r0, r0)
            r2 = r12[r1]
            r4 = r13[r1]
            int r1 = r1 + r0
            int r0 = r12.length
            if (r1 != r0) goto L1a
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            java.lang.Long r11 = java.lang.Long.valueOf(r4)
            android.util.Pair r10 = android.util.Pair.create(r10, r11)
            return r10
        L1a:
            r6 = r12[r1]
            r12 = r13[r1]
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L25
            r0 = 0
            goto L2b
        L25:
            double r0 = (double) r10
            double r8 = (double) r2
            double r0 = r0 - r8
            long r6 = r6 - r2
            double r2 = (double) r6
            double r0 = r0 / r2
        L2b:
            long r12 = r12 - r4
            double r12 = (double) r12
            double r0 = r0 * r12
            long r12 = (long) r0
            long r12 = r12 + r4
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Long r11 = java.lang.Long.valueOf(r12)
            android.util.Pair r10 = android.util.Pair.create(r10, r11)
            return r10
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
            r2 = this;
            r0 = -1
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
            r2 = this;
            long r0 = r2.durationUs
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long r7) {
            r6 = this;
            long r4 = r6.durationUs
            r2 = 0
            r0 = r7
            long r7 = com.google.android.exoplayer2.util.Util.constrainValue(r0, r2, r4)
            long r7 = com.google.android.exoplayer2.util.Util.usToMs(r7)
            long[] r0 = r6.referenceTimesMs
            long[] r1 = r6.referencePositions
            android.util.Pair r7 = linearlyInterpolate(r7, r0, r1)
            java.lang.Object r8 = r7.first
            java.lang.Long r8 = (java.lang.Long) r8
            long r0 = r8.longValue()
            long r0 = com.google.android.exoplayer2.util.Util.msToUs(r0)
            java.lang.Object r7 = r7.second
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r2 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            com.google.android.exoplayer2.extractor.SeekPoint r3 = new com.google.android.exoplayer2.extractor.SeekPoint
            r3.<init>(r0, r7)
            r2.<init>(r3)
            return r2
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long r3) {
            r2 = this;
            long[] r0 = r2.referencePositions
            long[] r1 = r2.referenceTimesMs
            android.util.Pair r3 = linearlyInterpolate(r3, r0, r1)
            java.lang.Object r3 = r3.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            long r3 = com.google.android.exoplayer2.util.Util.msToUs(r3)
            return r3
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
            r1 = this;
            r0 = 1
            return r0
    }
}
