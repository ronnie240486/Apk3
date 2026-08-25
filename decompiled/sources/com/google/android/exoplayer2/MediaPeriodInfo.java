package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
final class MediaPeriodInfo {
    public final long durationUs;
    public final long endPositionUs;
    public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId id;
    public final boolean isFinal;
    public final boolean isFollowedByTransitionToSameStream;
    public final boolean isLastInTimelinePeriod;
    public final boolean isLastInTimelineWindow;
    public final long requestedContentPositionUs;
    public final long startPositionUs;

    public MediaPeriodInfo(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r9, long r10, long r12, long r14, long r16, boolean r18, boolean r19, boolean r20, boolean r21) {
            r8 = this;
            r0 = r8
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r8.<init>()
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L15
            if (r2 == 0) goto L13
            goto L15
        L13:
            r7 = 0
            goto L16
        L15:
            r7 = 1
        L16:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r7)
            if (r3 == 0) goto L20
            if (r2 == 0) goto L1e
            goto L20
        L1e:
            r7 = 0
            goto L21
        L20:
            r7 = 1
        L21:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r7)
            if (r1 == 0) goto L2c
            if (r2 != 0) goto L2d
            if (r3 != 0) goto L2d
            if (r4 != 0) goto L2d
        L2c:
            r5 = 1
        L2d:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r5)
            r5 = r9
            r0.id = r5
            r5 = r10
            r0.startPositionUs = r5
            r5 = r12
            r0.requestedContentPositionUs = r5
            r5 = r14
            r0.endPositionUs = r5
            r5 = r16
            r0.durationUs = r5
            r0.isFollowedByTransitionToSameStream = r1
            r0.isLastInTimelinePeriod = r2
            r0.isLastInTimelineWindow = r3
            r0.isFinal = r4
            return
    }

    public com.google.android.exoplayer2.MediaPeriodInfo copyWithRequestedContentPositionUs(long r18) {
            r17 = this;
            r0 = r17
            long r1 = r0.requestedContentPositionUs
            int r3 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r3 != 0) goto La
            r1 = r0
            goto L24
        La:
            com.google.android.exoplayer2.MediaPeriodInfo r1 = new com.google.android.exoplayer2.MediaPeriodInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r0.id
            long r5 = r0.startPositionUs
            long r9 = r0.endPositionUs
            long r11 = r0.durationUs
            boolean r13 = r0.isFollowedByTransitionToSameStream
            boolean r14 = r0.isLastInTimelinePeriod
            boolean r15 = r0.isLastInTimelineWindow
            boolean r2 = r0.isFinal
            r3 = r1
            r7 = r18
            r16 = r2
            r3.<init>(r4, r5, r7, r9, r11, r13, r14, r15, r16)
        L24:
            return r1
    }

    public com.google.android.exoplayer2.MediaPeriodInfo copyWithStartPositionUs(long r18) {
            r17 = this;
            r0 = r17
            long r1 = r0.startPositionUs
            int r3 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r3 != 0) goto La
            r1 = r0
            goto L24
        La:
            com.google.android.exoplayer2.MediaPeriodInfo r1 = new com.google.android.exoplayer2.MediaPeriodInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r0.id
            long r7 = r0.requestedContentPositionUs
            long r9 = r0.endPositionUs
            long r11 = r0.durationUs
            boolean r13 = r0.isFollowedByTransitionToSameStream
            boolean r14 = r0.isLastInTimelinePeriod
            boolean r15 = r0.isLastInTimelineWindow
            boolean r2 = r0.isFinal
            r3 = r1
            r5 = r18
            r16 = r2
            r3.<init>(r4, r5, r7, r9, r11, r13, r14, r15, r16)
        L24:
            return r1
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L57
            java.lang.Class<com.google.android.exoplayer2.MediaPeriodInfo> r2 = com.google.android.exoplayer2.MediaPeriodInfo.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L57
        L10:
            com.google.android.exoplayer2.MediaPeriodInfo r8 = (com.google.android.exoplayer2.MediaPeriodInfo) r8
            long r2 = r7.startPositionUs
            long r4 = r8.startPositionUs
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L55
            long r2 = r7.requestedContentPositionUs
            long r4 = r8.requestedContentPositionUs
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L55
            long r2 = r7.endPositionUs
            long r4 = r8.endPositionUs
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L55
            long r2 = r7.durationUs
            long r4 = r8.durationUs
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L55
            boolean r2 = r7.isFollowedByTransitionToSameStream
            boolean r3 = r8.isFollowedByTransitionToSameStream
            if (r2 != r3) goto L55
            boolean r2 = r7.isLastInTimelinePeriod
            boolean r3 = r8.isLastInTimelinePeriod
            if (r2 != r3) goto L55
            boolean r2 = r7.isLastInTimelineWindow
            boolean r3 = r8.isLastInTimelineWindow
            if (r2 != r3) goto L55
            boolean r2 = r7.isFinal
            boolean r3 = r8.isFinal
            if (r2 != r3) goto L55
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r7.id
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r8 = r8.id
            boolean r8 = com.google.android.exoplayer2.util.Util.areEqual(r2, r8)
            if (r8 == 0) goto L55
            goto L56
        L55:
            r0 = 0
        L56:
            return r0
        L57:
            return r1
    }

    public int hashCode() {
            r3 = this;
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r3.id
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            long r1 = r3.startPositionUs
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r3.requestedContentPositionUs
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r3.endPositionUs
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r3.durationUs
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r1 = r3.isFollowedByTransitionToSameStream
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r3.isLastInTimelinePeriod
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r3.isLastInTimelineWindow
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r3.isFinal
            int r0 = r0 + r1
            return r0
    }
}
