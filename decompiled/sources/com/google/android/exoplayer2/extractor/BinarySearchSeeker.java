package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes.dex */
public abstract class BinarySearchSeeker {
    private static final long MAX_SKIP_BYTES = 262144;
    private final int minimumSearchRange;
    public final com.google.android.exoplayer2.extractor.BinarySearchSeeker.BinarySearchSeekMap seekMap;

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams seekOperationParams;
    public final com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker timestampSeeker;

    public static class BinarySearchSeekMap implements com.google.android.exoplayer2.extractor.SeekMap {
        private final long approxBytesPerFrame;
        private final long ceilingBytePosition;
        private final long ceilingTimePosition;
        private final long durationUs;
        private final long floorBytePosition;
        private final long floorTimePosition;
        private final com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter seekTimestampConverter;

        public BinarySearchSeekMap(com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter r1, long r2, long r4, long r6, long r8, long r10, long r12) {
                r0 = this;
                r0.<init>()
                r0.seekTimestampConverter = r1
                r0.durationUs = r2
                r0.floorTimePosition = r4
                r0.ceilingTimePosition = r6
                r0.floorBytePosition = r8
                r0.ceilingBytePosition = r10
                r0.approxBytesPerFrame = r12
                return
        }

        public static /* synthetic */ long access$1000(com.google.android.exoplayer2.extractor.BinarySearchSeeker.BinarySearchSeekMap r2) {
                long r0 = r2.floorTimePosition
                return r0
        }

        public static /* synthetic */ long access$1100(com.google.android.exoplayer2.extractor.BinarySearchSeeker.BinarySearchSeekMap r2) {
                long r0 = r2.ceilingTimePosition
                return r0
        }

        public static /* synthetic */ long access$1200(com.google.android.exoplayer2.extractor.BinarySearchSeeker.BinarySearchSeekMap r2) {
                long r0 = r2.floorBytePosition
                return r0
        }

        public static /* synthetic */ long access$1300(com.google.android.exoplayer2.extractor.BinarySearchSeeker.BinarySearchSeekMap r2) {
                long r0 = r2.ceilingBytePosition
                return r0
        }

        public static /* synthetic */ long access$1400(com.google.android.exoplayer2.extractor.BinarySearchSeeker.BinarySearchSeekMap r2) {
                long r0 = r2.approxBytesPerFrame
                return r0
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
                r2 = this;
                long r0 = r2.durationUs
                return r0
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long r14) {
                r13 = this;
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$SeekTimestampConverter r0 = r13.seekTimestampConverter
                long r1 = r0.timeUsToTargetTime(r14)
                long r3 = r13.floorTimePosition
                long r5 = r13.ceilingTimePosition
                long r7 = r13.floorBytePosition
                long r9 = r13.ceilingBytePosition
                long r11 = r13.approxBytesPerFrame
                long r0 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams.calculateNextSearchBytePosition(r1, r3, r5, r7, r9, r11)
                com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r2 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
                com.google.android.exoplayer2.extractor.SeekPoint r3 = new com.google.android.exoplayer2.extractor.SeekPoint
                r3.<init>(r14, r0)
                r2.<init>(r3)
                return r2
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
                r1 = this;
                r0 = 1
                return r0
        }

        public long timeUsToTargetTime(long r2) {
                r1 = this;
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$SeekTimestampConverter r0 = r1.seekTimestampConverter
                long r2 = r0.timeUsToTargetTime(r2)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class DefaultSeekTimestampConverter implements com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter {
        public DefaultSeekTimestampConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
        public long timeUsToTargetTime(long r1) {
                r0 = this;
                return r1
        }
    }

    public static class SeekOperationParams {
        private final long approxBytesPerFrame;
        private long ceilingBytePosition;
        private long ceilingTimePosition;
        private long floorBytePosition;
        private long floorTimePosition;
        private long nextSearchBytePosition;
        private final long seekTimeUs;
        private final long targetTimePosition;

        public SeekOperationParams(long r1, long r3, long r5, long r7, long r9, long r11, long r13) {
                r0 = this;
                r0.<init>()
                r0.seekTimeUs = r1
                r0.targetTimePosition = r3
                r0.floorTimePosition = r5
                r0.ceilingTimePosition = r7
                r0.floorBytePosition = r9
                r0.ceilingBytePosition = r11
                r0.approxBytesPerFrame = r13
                long r1 = calculateNextSearchBytePosition(r3, r5, r7, r9, r11, r13)
                r0.nextSearchBytePosition = r1
                return
        }

        public static /* synthetic */ long access$000(com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams r2) {
                long r0 = r2.getSeekTimeUs()
                return r0
        }

        public static /* synthetic */ long access$100(com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams r2) {
                long r0 = r2.getFloorBytePosition()
                return r0
        }

        public static /* synthetic */ long access$200(com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams r2) {
                long r0 = r2.getCeilingBytePosition()
                return r0
        }

        public static /* synthetic */ long access$300(com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams r2) {
                long r0 = r2.getNextSearchBytePosition()
                return r0
        }

        public static /* synthetic */ long access$400(com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams r2) {
                long r0 = r2.getTargetTimePosition()
                return r0
        }

        public static /* synthetic */ void access$800(com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams r0, long r1, long r3) {
                r0.updateSeekCeiling(r1, r3)
                return
        }

        public static /* synthetic */ void access$900(com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams r0, long r1, long r3) {
                r0.updateSeekFloor(r1, r3)
                return
        }

        public static long calculateNextSearchBytePosition(long r7, long r9, long r11, long r13, long r15, long r17) {
                r0 = 1
                long r2 = r13 + r0
                int r4 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
                if (r4 >= 0) goto L2e
                long r2 = r9 + r0
                int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r4 < 0) goto Lf
                goto L2e
            Lf:
                long r2 = r7 - r9
                long r4 = r15 - r13
                float r4 = (float) r4
                long r5 = r11 - r9
                float r5 = (float) r5
                float r4 = r4 / r5
                float r2 = (float) r2
                float r2 = r2 * r4
                long r2 = (long) r2
                r4 = 20
                long r4 = r2 / r4
                long r2 = r2 + r13
                long r2 = r2 - r17
                long r2 = r2 - r4
                long r0 = r15 - r0
                r7 = r2
                r9 = r13
                r11 = r0
                long r0 = com.google.android.exoplayer2.util.Util.constrainValue(r7, r9, r11)
                return r0
            L2e:
                return r13
        }

        private long getCeilingBytePosition() {
                r2 = this;
                long r0 = r2.ceilingBytePosition
                return r0
        }

        private long getFloorBytePosition() {
                r2 = this;
                long r0 = r2.floorBytePosition
                return r0
        }

        private long getNextSearchBytePosition() {
                r2 = this;
                long r0 = r2.nextSearchBytePosition
                return r0
        }

        private long getSeekTimeUs() {
                r2 = this;
                long r0 = r2.seekTimeUs
                return r0
        }

        private long getTargetTimePosition() {
                r2 = this;
                long r0 = r2.targetTimePosition
                return r0
        }

        private void updateNextSearchBytePosition() {
                r12 = this;
                long r0 = r12.targetTimePosition
                long r2 = r12.floorTimePosition
                long r4 = r12.ceilingTimePosition
                long r6 = r12.floorBytePosition
                long r8 = r12.ceilingBytePosition
                long r10 = r12.approxBytesPerFrame
                long r0 = calculateNextSearchBytePosition(r0, r2, r4, r6, r8, r10)
                r12.nextSearchBytePosition = r0
                return
        }

        private void updateSeekCeiling(long r1, long r3) {
                r0 = this;
                r0.ceilingTimePosition = r1
                r0.ceilingBytePosition = r3
                r0.updateNextSearchBytePosition()
                return
        }

        private void updateSeekFloor(long r1, long r3) {
                r0 = this;
                r0.floorTimePosition = r1
                r0.floorBytePosition = r3
                r0.updateNextSearchBytePosition()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface SeekTimestampConverter {
        long timeUsToTargetTime(long r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class TimestampSearchResult {
        public static final com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult NO_TIMESTAMP_IN_RANGE_RESULT = null;
        public static final int TYPE_NO_TIMESTAMP = -3;
        public static final int TYPE_POSITION_OVERESTIMATED = -1;
        public static final int TYPE_POSITION_UNDERESTIMATED = -2;
        public static final int TYPE_TARGET_TIMESTAMP_FOUND = 0;
        private final long bytePositionToUpdate;
        private final long timestampToUpdate;
        private final int type;

        static {
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r6 = new com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult
                r1 = -3
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r4 = -1
                r0 = r6
                r0.<init>(r1, r2, r4)
                com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT = r6
                return
        }

        private TimestampSearchResult(int r1, long r2, long r4) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                r0.timestampToUpdate = r2
                r0.bytePositionToUpdate = r4
                return
        }

        public static /* synthetic */ int access$500(com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult r0) {
                int r0 = r0.type
                return r0
        }

        public static /* synthetic */ long access$600(com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult r2) {
                long r0 = r2.timestampToUpdate
                return r0
        }

        public static /* synthetic */ long access$700(com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult r2) {
                long r0 = r2.bytePositionToUpdate
                return r0
        }

        public static com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult overestimatedResult(long r7, long r9) {
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r6 = new com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult
                r1 = -1
                r0 = r6
                r2 = r7
                r4 = r9
                r0.<init>(r1, r2, r4)
                return r6
        }

        public static com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult targetFoundResult(long r7) {
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r6 = new com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult
                r1 = 0
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r0 = r6
                r4 = r7
                r0.<init>(r1, r2, r4)
                return r6
        }

        public static com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult underestimatedResult(long r7, long r9) {
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r6 = new com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult
                r1 = -2
                r0 = r6
                r2 = r7
                r4 = r9
                r0.<init>(r1, r2, r4)
                return r6
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface TimestampSeeker {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSeeker$-CC, reason: invalid class name */
        /* JADX INFO: loaded from: classes2.dex */
        public final /* synthetic */ class CC {
            public static void $default$onSeekFinished(com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker r0) {
                    return
            }
        }

        void onSeekFinished();

        com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult searchForTimestamp(com.google.android.exoplayer2.extractor.ExtractorInput r1, long r2) throws java.io.IOException;
    }

    public BinarySearchSeeker(com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter r17, com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker r18, long r19, long r21, long r23, long r25, long r27, int r29) {
            r16 = this;
            r0 = r16
            r16.<init>()
            r1 = r18
            r0.timestampSeeker = r1
            r1 = r29
            r0.minimumSearchRange = r1
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$BinarySearchSeekMap r15 = new com.google.android.exoplayer2.extractor.BinarySearchSeeker$BinarySearchSeekMap
            r5 = 0
            r1 = r15
            r2 = r17
            r3 = r19
            r7 = r21
            r9 = r23
            r11 = r25
            r13 = r27
            r1.<init>(r2, r3, r5, r7, r9, r11, r13)
            r0.seekMap = r15
            return
    }

    public final com.google.android.exoplayer2.extractor.SeekMap getSeekMap() {
            r1 = this;
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$BinarySearchSeekMap r0 = r1.seekMap
            return r0
    }

    public int handlePendingSeek(com.google.android.exoplayer2.extractor.ExtractorInput r11, com.google.android.exoplayer2.extractor.PositionHolder r12) throws java.io.IOException {
            r10 = this;
        L0:
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$SeekOperationParams r0 = r10.seekOperationParams
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$SeekOperationParams r0 = (com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams) r0
            long r1 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams.access$100(r0)
            long r3 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams.access$200(r0)
            long r5 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams.access$300(r0)
            long r3 = r3 - r1
            int r7 = r10.minimumSearchRange
            long r7 = (long) r7
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 > 0) goto L24
            r10.markSeekOperationFinished()
            int r11 = r10.seekToPosition(r11, r1, r12)
            return r11
        L24:
            boolean r1 = r10.skipInputUntilPosition(r11, r5)
            if (r1 != 0) goto L2f
            int r11 = r10.seekToPosition(r11, r5, r12)
            return r11
        L2f:
            r11.resetPeekPosition()
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSeeker r1 = r10.timestampSeeker
            long r2 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams.access$400(r0)
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r1 = r1.searchForTimestamp(r11, r2)
            int r2 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.access$500(r1)
            r3 = -3
            if (r2 == r3) goto L80
            r3 = -2
            if (r2 == r3) goto L74
            r3 = -1
            if (r2 == r3) goto L68
            if (r2 != 0) goto L60
            long r2 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.access$700(r1)
            r10.skipInputUntilPosition(r11, r2)
            int r0 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.TYPE_TARGET_TIMESTAMP_FOUND
            r10.markSeekOperationFinished()
            long r0 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.access$700(r1)
            int r11 = r10.seekToPosition(r11, r0, r12)
            return r11
        L60:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Invalid case"
            r11.<init>(r12)
            throw r11
        L68:
            long r2 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.access$600(r1)
            long r4 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.access$700(r1)
            com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams.access$800(r0, r2, r4)
            goto L0
        L74:
            long r2 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.access$600(r1)
            long r4 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.access$700(r1)
            com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams.access$900(r0, r2, r4)
            goto L0
        L80:
            r10.markSeekOperationFinished()
            int r11 = r10.seekToPosition(r11, r5, r12)
            return r11
    }

    public final boolean isSeeking() {
            r1 = this;
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$SeekOperationParams r0 = r1.seekOperationParams
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final void markSeekOperationFinished() {
            r1 = this;
            r0 = 0
            r1.seekOperationParams = r0
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSeeker r0 = r1.timestampSeeker
            r0.onSeekFinished()
            return
    }

    public final int seekToPosition(com.google.android.exoplayer2.extractor.ExtractorInput r3, long r4, com.google.android.exoplayer2.extractor.PositionHolder r6) {
            r2 = this;
            long r0 = r3.getPosition()
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 != 0) goto La
            r3 = 0
            return r3
        La:
            r6.position = r4
            r3 = 1
            return r3
    }

    public final void setSeekTargetUs(long r19) {
            r18 = this;
            r0 = r18
            r2 = r19
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$SeekOperationParams r1 = r0.seekOperationParams
            if (r1 == 0) goto L11
            long r4 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekOperationParams.access$000(r1)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L11
            return
        L11:
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$SeekOperationParams r14 = new com.google.android.exoplayer2.extractor.BinarySearchSeeker$SeekOperationParams
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$BinarySearchSeekMap r1 = r0.seekMap
            long r4 = r1.timeUsToTargetTime(r2)
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$BinarySearchSeekMap r1 = r0.seekMap
            long r6 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.BinarySearchSeekMap.access$1000(r1)
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$BinarySearchSeekMap r1 = r0.seekMap
            long r8 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.BinarySearchSeekMap.access$1100(r1)
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$BinarySearchSeekMap r1 = r0.seekMap
            long r10 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.BinarySearchSeekMap.access$1200(r1)
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$BinarySearchSeekMap r1 = r0.seekMap
            long r12 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.BinarySearchSeekMap.access$1300(r1)
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$BinarySearchSeekMap r1 = r0.seekMap
            long r15 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.BinarySearchSeekMap.access$1400(r1)
            r1 = r14
            r2 = r19
            r17 = r14
            r14 = r15
            r1.<init>(r2, r4, r6, r8, r10, r12, r14)
            r1 = r17
            r0.seekOperationParams = r1
            return
    }

    public final boolean skipInputUntilPosition(com.google.android.exoplayer2.extractor.ExtractorInput r4, long r5) throws java.io.IOException {
            r3 = this;
            long r0 = r4.getPosition()
            long r5 = r5 - r0
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L18
            r0 = 262144(0x40000, double:1.295163E-318)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L18
            int r6 = (int) r5
            r4.skipFully(r6)
            r4 = 1
            return r4
        L18:
            r4 = 0
            return r4
    }
}
