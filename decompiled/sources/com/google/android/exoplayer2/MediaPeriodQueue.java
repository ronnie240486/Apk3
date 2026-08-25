package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
final class MediaPeriodQueue {
    public static final long INITIAL_RENDERER_POSITION_OFFSET_US = 1000000000000L;
    private static final int MAXIMUM_BUFFER_AHEAD_PERIODS = 100;
    private final com.google.android.exoplayer2.analytics.AnalyticsCollector analyticsCollector;
    private final com.google.android.exoplayer2.util.HandlerWrapper analyticsCollectorHandler;
    private int length;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.MediaPeriodHolder loading;
    private long nextWindowSequenceNumber;

    @androidx.annotation.Nullable
    private java.lang.Object oldFrontPeriodUid;
    private long oldFrontPeriodWindowSequenceNumber;
    private final com.google.android.exoplayer2.Timeline.Period period;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.MediaPeriodHolder playing;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.MediaPeriodHolder reading;
    private int repeatMode;
    private boolean shuffleModeEnabled;
    private final com.google.android.exoplayer2.Timeline.Window window;

    public static /* synthetic */ void $r8$lambda$mWNPMcRbVVz2oDENMZzwGKF1Dk8(com.google.android.exoplayer2.MediaPeriodQueue r0, com.google.common.collect.ImmutableList.Builder r1, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
            r0.lambda$notifyQueueUpdate$0(r1, r2)
            return
    }

    public MediaPeriodQueue(com.google.android.exoplayer2.analytics.AnalyticsCollector r1, com.google.android.exoplayer2.util.HandlerWrapper r2) {
            r0 = this;
            r0.<init>()
            r0.analyticsCollector = r1
            r0.analyticsCollectorHandler = r2
            com.google.android.exoplayer2.Timeline$Period r1 = new com.google.android.exoplayer2.Timeline$Period
            r1.<init>()
            r0.period = r1
            com.google.android.exoplayer2.Timeline$Window r1 = new com.google.android.exoplayer2.Timeline$Window
            r1.<init>()
            r0.window = r1
            return
    }

    private boolean areDurationsCompatible(long r4, long r6) {
            r3 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L10
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto Le
            goto L10
        Le:
            r4 = 0
            goto L11
        L10:
            r4 = 1
        L11:
            return r4
    }

    private boolean canKeepMediaPeriodHolder(com.google.android.exoplayer2.MediaPeriodInfo r6, com.google.android.exoplayer2.MediaPeriodInfo r7) {
            r5 = this;
            long r0 = r6.startPositionUs
            long r2 = r7.startPositionUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L14
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r6 = r6.id
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r7 = r7.id
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L14
            r6 = 1
            goto L15
        L14:
            r6 = 0
        L15:
            return r6
    }

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.MediaPeriodInfo getFirstMediaPeriodInfo(com.google.android.exoplayer2.PlaybackInfo r8) {
            r7 = this;
            com.google.android.exoplayer2.Timeline r1 = r8.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r8.periodId
            long r3 = r8.requestedContentPositionUs
            long r5 = r8.positionUs
            r0 = r7
            com.google.android.exoplayer2.MediaPeriodInfo r8 = r0.getMediaPeriodInfo(r1, r2, r3, r5)
            return r8
    }

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.MediaPeriodInfo getFollowingMediaPeriodInfo(com.google.android.exoplayer2.Timeline r20, com.google.android.exoplayer2.MediaPeriodHolder r21, long r22) {
            r19 = this;
            r9 = r19
            r8 = r20
            r10 = r21
            com.google.android.exoplayer2.MediaPeriodInfo r11 = r10.info
            long r0 = r21.getRendererOffset()
            long r2 = r11.durationUs
            long r0 = r0 + r2
            long r6 = r0 - r22
            boolean r0 = r11.isLastInTimelinePeriod
            r13 = -1
            r14 = 1
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = 0
            if (r0 == 0) goto Lef
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r11.id
            java.lang.Object r0 = r0.periodUid
            int r1 = r8.getIndexOfPeriod(r0)
            com.google.android.exoplayer2.Timeline$Period r2 = r9.period
            com.google.android.exoplayer2.Timeline$Window r3 = r9.window
            int r0 = r9.repeatMode
            boolean r5 = r9.shuffleModeEnabled
            r4 = r0
            r0 = r20
            int r0 = r0.getNextPeriodIndex(r1, r2, r3, r4, r5)
            if (r0 != r13) goto L38
            return r17
        L38:
            com.google.android.exoplayer2.Timeline$Period r1 = r9.period
            com.google.android.exoplayer2.Timeline$Period r1 = r8.getPeriod(r0, r1, r14)
            int r3 = r1.windowIndex
            com.google.android.exoplayer2.Timeline$Period r1 = r9.period
            java.lang.Object r1 = r1.uid
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r11.id
            long r4 = r2.windowSequenceNumber
            com.google.android.exoplayer2.Timeline$Window r2 = r9.window
            com.google.android.exoplayer2.Timeline$Window r2 = r8.getWindow(r3, r2)
            int r2 = r2.firstPeriodIndex
            if (r2 != r0) goto L99
            com.google.android.exoplayer2.Timeline$Window r1 = r9.window
            com.google.android.exoplayer2.Timeline$Period r2 = r9.period
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            long r6 = java.lang.Math.max(r12, r6)
            r0 = r20
            android.util.Pair r0 = r0.getPeriodPositionUs(r1, r2, r3, r4, r6)
            if (r0 != 0) goto L6e
            return r17
        L6e:
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r21.getNext()
            if (r0 == 0) goto L8d
            java.lang.Object r2 = r0.uid
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L8d
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r0.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.id
            long r2 = r0.windowSequenceNumber
            goto L94
        L8d:
            long r2 = r9.nextWindowSequenceNumber
            r6 = 1
            long r6 = r6 + r2
            r9.nextWindowSequenceNumber = r6
        L94:
            r12 = r4
            r17 = r15
            r4 = r2
            goto L9d
        L99:
            r12 = 0
            r17 = r12
        L9d:
            com.google.android.exoplayer2.Timeline$Window r6 = r9.window
            com.google.android.exoplayer2.Timeline$Period r7 = r9.period
            r0 = r20
            r2 = r12
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = resolveMediaPeriodIdForAds(r0, r1, r2, r4, r6, r7)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto Le3
            long r0 = r11.requestedContentPositionUs
            int r3 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r3 == 0) goto Le3
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r11.id
            java.lang.Object r0 = r0.periodUid
            com.google.android.exoplayer2.Timeline$Period r1 = r9.period
            com.google.android.exoplayer2.Timeline$Period r0 = r8.getPeriodByUid(r0, r1)
            int r0 = r0.getAdGroupCount()
            if (r0 <= 0) goto Lcf
            com.google.android.exoplayer2.Timeline$Period r0 = r9.period
            int r1 = r0.getRemovedAdGroupCount()
            boolean r0 = r0.isServerSideInsertedAdGroup(r1)
            if (r0 == 0) goto Lcf
            goto Ld0
        Lcf:
            r14 = 0
        Ld0:
            boolean r0 = r2.isAd()
            if (r0 == 0) goto Ldd
            if (r14 == 0) goto Ldd
            long r0 = r11.requestedContentPositionUs
            r3 = r0
            r5 = r12
            goto Le6
        Ldd:
            if (r14 == 0) goto Le3
            long r0 = r11.requestedContentPositionUs
            r5 = r0
            goto Le4
        Le3:
            r5 = r12
        Le4:
            r3 = r17
        Le6:
            r0 = r19
            r1 = r20
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r0.getMediaPeriodInfo(r1, r2, r3, r5)
            return r0
        Lef:
            r0 = -1
            r12 = 0
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r10 = r11.id
            java.lang.Object r1 = r10.periodUid
            com.google.android.exoplayer2.Timeline$Period r2 = r9.period
            r8.getPeriodByUid(r1, r2)
            boolean r1 = r10.isAd()
            if (r1 == 0) goto L16b
            int r3 = r10.adGroupIndex
            com.google.android.exoplayer2.Timeline$Period r1 = r9.period
            int r1 = r1.getAdCountInAdGroup(r3)
            if (r1 != r0) goto L10c
            return r17
        L10c:
            com.google.android.exoplayer2.Timeline$Period r0 = r9.period
            int r2 = r10.adIndexInAdGroup
            int r4 = r0.getNextAdIndexToPlay(r3, r2)
            if (r4 >= r1) goto L126
            java.lang.Object r2 = r10.periodUid
            long r5 = r11.requestedContentPositionUs
            long r10 = r10.windowSequenceNumber
            r0 = r19
            r1 = r20
            r7 = r10
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r0.getMediaPeriodInfoForAd(r1, r2, r3, r4, r5, r7)
            return r0
        L126:
            long r0 = r11.requestedContentPositionUs
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 != 0) goto L14c
            com.google.android.exoplayer2.Timeline$Window r1 = r9.window
            com.google.android.exoplayer2.Timeline$Period r2 = r9.period
            int r3 = r2.windowIndex
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r6 = java.lang.Math.max(r12, r6)
            r0 = r20
            android.util.Pair r0 = r0.getPeriodPositionUs(r1, r2, r3, r4, r6)
            if (r0 != 0) goto L144
            return r17
        L144:
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
        L14c:
            java.lang.Object r2 = r10.periodUid
            int r3 = r10.adGroupIndex
            long r2 = r9.getMinStartPositionAfterAdGroupUs(r8, r2, r3)
            java.lang.Object r4 = r10.periodUid
            long r5 = java.lang.Math.max(r2, r0)
            long r11 = r11.requestedContentPositionUs
            long r13 = r10.windowSequenceNumber
            r0 = r19
            r1 = r20
            r2 = r4
            r3 = r5
            r5 = r11
            r7 = r13
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r0.getMediaPeriodInfoForContent(r1, r2, r3, r5, r7)
            return r0
        L16b:
            com.google.android.exoplayer2.Timeline$Period r0 = r9.period
            int r1 = r10.nextAdGroupIndex
            int r4 = r0.getFirstAdIndexToPlay(r1)
            com.google.android.exoplayer2.Timeline$Period r0 = r9.period
            int r1 = r10.nextAdGroupIndex
            boolean r0 = r0.isServerSideInsertedAdGroup(r1)
            if (r0 == 0) goto L18a
            com.google.android.exoplayer2.Timeline$Period r0 = r9.period
            int r1 = r10.nextAdGroupIndex
            int r0 = r0.getAdState(r1, r4)
            r1 = 3
            if (r0 != r1) goto L18a
            r12 = 1
            goto L18b
        L18a:
            r12 = 0
        L18b:
            com.google.android.exoplayer2.Timeline$Period r0 = r9.period
            int r1 = r10.nextAdGroupIndex
            int r0 = r0.getAdCountInAdGroup(r1)
            if (r4 == r0) goto L1aa
            if (r12 == 0) goto L198
            goto L1aa
        L198:
            java.lang.Object r2 = r10.periodUid
            int r3 = r10.nextAdGroupIndex
            long r5 = r11.durationUs
            long r10 = r10.windowSequenceNumber
            r0 = r19
            r1 = r20
            r7 = r10
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r0.getMediaPeriodInfoForAd(r1, r2, r3, r4, r5, r7)
            return r0
        L1aa:
            java.lang.Object r0 = r10.periodUid
            int r1 = r10.nextAdGroupIndex
            long r3 = r9.getMinStartPositionAfterAdGroupUs(r8, r0, r1)
            java.lang.Object r2 = r10.periodUid
            long r5 = r11.durationUs
            long r10 = r10.windowSequenceNumber
            r0 = r19
            r1 = r20
            r7 = r10
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r0.getMediaPeriodInfoForContent(r1, r2, r3, r5, r7)
            return r0
    }

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.MediaPeriodInfo getMediaPeriodInfo(com.google.android.exoplayer2.Timeline r13, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r14, long r15, long r17) {
            r12 = this;
            r0 = r14
            java.lang.Object r1 = r0.periodUid
            r11 = r12
            com.google.android.exoplayer2.Timeline$Period r2 = r11.period
            r3 = r13
            r13.getPeriodByUid(r1, r2)
            boolean r1 = r14.isAd()
            if (r1 == 0) goto L20
            java.lang.Object r4 = r0.periodUid
            int r5 = r0.adGroupIndex
            int r6 = r0.adIndexInAdGroup
            long r9 = r0.windowSequenceNumber
            r2 = r12
            r3 = r13
            r7 = r15
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r2.getMediaPeriodInfoForAd(r3, r4, r5, r6, r7, r9)
            return r0
        L20:
            java.lang.Object r4 = r0.periodUid
            long r9 = r0.windowSequenceNumber
            r2 = r12
            r3 = r13
            r5 = r17
            r7 = r15
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r2.getMediaPeriodInfoForContent(r3, r4, r5, r7, r9)
            return r0
    }

    private com.google.android.exoplayer2.MediaPeriodInfo getMediaPeriodInfoForAd(com.google.android.exoplayer2.Timeline r19, java.lang.Object r20, int r21, int r22, long r23, long r25) {
            r18 = this;
            r0 = r18
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r7 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
            r1 = r7
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r25
            r1.<init>(r2, r3, r4, r5)
            java.lang.Object r1 = r7.periodUid
            com.google.android.exoplayer2.Timeline$Period r2 = r0.period
            r3 = r19
            com.google.android.exoplayer2.Timeline$Period r1 = r3.getPeriodByUid(r1, r2)
            int r2 = r7.adGroupIndex
            int r3 = r7.adIndexInAdGroup
            long r9 = r1.getAdDurationUs(r2, r3)
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            r2 = r21
            int r1 = r1.getFirstAdIndexToPlay(r2)
            r2 = 0
            if (r4 != r1) goto L35
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            long r4 = r1.getAdResumePositionUs()
            goto L36
        L35:
            r4 = r2
        L36:
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            int r6 = r7.adGroupIndex
            boolean r11 = r1.isServerSideInsertedAdGroup(r6)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r1 == 0) goto L55
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 < 0) goto L55
            r4 = 1
            long r4 = r9 - r4
            long r1 = java.lang.Math.max(r2, r4)
            r3 = r1
            goto L56
        L55:
            r3 = r4
        L56:
            com.google.android.exoplayer2.MediaPeriodInfo r15 = new com.google.android.exoplayer2.MediaPeriodInfo
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = 0
            r16 = 0
            r17 = 0
            r1 = r15
            r2 = r7
            r5 = r23
            r7 = r12
            r12 = r14
            r13 = r16
            r14 = r17
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
    }

    private com.google.android.exoplayer2.MediaPeriodInfo getMediaPeriodInfoForContent(com.google.android.exoplayer2.Timeline r25, java.lang.Object r26, long r27, long r29, long r31) {
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            com.google.android.exoplayer2.Timeline$Period r5 = r0.period
            r1.getPeriodByUid(r2, r5)
            com.google.android.exoplayer2.Timeline$Period r5 = r0.period
            int r5 = r5.getAdGroupIndexAfterPositionUs(r3)
            r6 = 1
            r7 = -1
            r8 = 0
            if (r5 != r7) goto L2d
            com.google.android.exoplayer2.Timeline$Period r9 = r0.period
            int r9 = r9.getAdGroupCount()
            if (r9 <= 0) goto L4c
            com.google.android.exoplayer2.Timeline$Period r9 = r0.period
            int r10 = r9.getRemovedAdGroupCount()
            boolean r9 = r9.isServerSideInsertedAdGroup(r10)
            if (r9 == 0) goto L4c
            goto L4a
        L2d:
            com.google.android.exoplayer2.Timeline$Period r9 = r0.period
            boolean r9 = r9.isServerSideInsertedAdGroup(r5)
            if (r9 == 0) goto L4c
            com.google.android.exoplayer2.Timeline$Period r9 = r0.period
            long r9 = r9.getAdGroupTimeUs(r5)
            com.google.android.exoplayer2.Timeline$Period r11 = r0.period
            long r12 = r11.durationUs
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 != 0) goto L4c
            boolean r9 = r11.hasPlayedAdGroup(r5)
            if (r9 == 0) goto L4c
            r5 = -1
        L4a:
            r9 = 1
            goto L4d
        L4c:
            r9 = 0
        L4d:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r11 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
            r12 = r31
            r11.<init>(r2, r12, r5)
            boolean r2 = r0.isLastInPeriod(r11)
            boolean r22 = r0.isLastInWindow(r1, r11)
            boolean r23 = r0.isLastInTimeline(r1, r11, r2)
            if (r5 == r7) goto L6d
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            boolean r1 = r1.isServerSideInsertedAdGroup(r5)
            if (r1 == 0) goto L6d
            r20 = 1
            goto L6f
        L6d:
            r20 = 0
        L6f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r7) goto L7f
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            long r14 = r1.getAdGroupTimeUs(r5)
        L7c:
            r16 = r14
            goto L88
        L7f:
            if (r9 == 0) goto L86
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            long r14 = r1.durationUs
            goto L7c
        L86:
            r16 = r12
        L88:
            int r1 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r1 == 0) goto L96
            r14 = -9223372036854775808
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r1 != 0) goto L93
            goto L96
        L93:
            r18 = r16
            goto L9c
        L96:
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            long r14 = r1.durationUs
            r18 = r14
        L9c:
            int r1 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r1 == 0) goto Lb3
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 < 0) goto Lb3
            if (r23 != 0) goto Laa
            if (r9 != 0) goto La9
            goto Laa
        La9:
            r6 = 0
        Laa:
            r3 = 0
            long r5 = (long) r6
            long r5 = r18 - r5
            long r3 = java.lang.Math.max(r3, r5)
        Lb3:
            r12 = r3
            com.google.android.exoplayer2.MediaPeriodInfo r1 = new com.google.android.exoplayer2.MediaPeriodInfo
            r10 = r1
            r14 = r29
            r21 = r2
            r10.<init>(r11, r12, r14, r16, r18, r20, r21, r22, r23)
            return r1
    }

    private long getMinStartPositionAfterAdGroupUs(com.google.android.exoplayer2.Timeline r4, java.lang.Object r5, int r6) {
            r3 = this;
            com.google.android.exoplayer2.Timeline$Period r0 = r3.period
            r4.getPeriodByUid(r5, r0)
            com.google.android.exoplayer2.Timeline$Period r4 = r3.period
            long r4 = r4.getAdGroupTimeUs(r6)
            r0 = -9223372036854775808
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L16
            com.google.android.exoplayer2.Timeline$Period r4 = r3.period
            long r4 = r4.durationUs
            return r4
        L16:
            com.google.android.exoplayer2.Timeline$Period r0 = r3.period
            long r0 = r0.getContentResumeOffsetUs(r6)
            long r0 = r0 + r4
            return r0
    }

    private boolean isLastInPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
            r1 = this;
            boolean r0 = r2.isAd()
            if (r0 != 0) goto Ld
            int r2 = r2.nextAdGroupIndex
            r0 = -1
            if (r2 != r0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            return r2
    }

    private boolean isLastInTimeline(com.google.android.exoplayer2.Timeline r7, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r8, boolean r9) {
            r6 = this;
            java.lang.Object r8 = r8.periodUid
            int r1 = r7.getIndexOfPeriod(r8)
            com.google.android.exoplayer2.Timeline$Period r8 = r6.period
            com.google.android.exoplayer2.Timeline$Period r8 = r7.getPeriod(r1, r8)
            int r8 = r8.windowIndex
            com.google.android.exoplayer2.Timeline$Window r0 = r6.window
            com.google.android.exoplayer2.Timeline$Window r8 = r7.getWindow(r8, r0)
            boolean r8 = r8.isDynamic
            if (r8 != 0) goto L2b
            com.google.android.exoplayer2.Timeline$Period r2 = r6.period
            com.google.android.exoplayer2.Timeline$Window r3 = r6.window
            int r4 = r6.repeatMode
            boolean r5 = r6.shuffleModeEnabled
            r0 = r7
            boolean r7 = r0.isLastPeriod(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L2b
            if (r9 == 0) goto L2b
            r7 = 1
            goto L2c
        L2b:
            r7 = 0
        L2c:
            return r7
    }

    private boolean isLastInWindow(com.google.android.exoplayer2.Timeline r4, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r5) {
            r3 = this;
            boolean r0 = r3.isLastInPeriod(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Object r0 = r5.periodUid
            com.google.android.exoplayer2.Timeline$Period r2 = r3.period
            com.google.android.exoplayer2.Timeline$Period r0 = r4.getPeriodByUid(r0, r2)
            int r0 = r0.windowIndex
            java.lang.Object r5 = r5.periodUid
            int r5 = r4.getIndexOfPeriod(r5)
            com.google.android.exoplayer2.Timeline$Window r2 = r3.window
            com.google.android.exoplayer2.Timeline$Window r4 = r4.getWindow(r0, r2)
            int r4 = r4.lastPeriodIndex
            if (r4 != r5) goto L23
            r1 = 1
        L23:
            return r1
    }

    private /* synthetic */ void lambda$notifyQueueUpdate$0(com.google.common.collect.ImmutableList.Builder r2, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3) {
            r1 = this;
            com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = r1.analyticsCollector
            com.google.common.collect.ImmutableList r2 = r2.build()
            r0.updateMediaPeriodQueueInfo(r2, r3)
            return
    }

    private void notifyQueueUpdate() {
            r5 = this;
            com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r5.playing
        L6:
            if (r1 == 0) goto L14
            com.google.android.exoplayer2.MediaPeriodInfo r2 = r1.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.id
            r0.add(r2)
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r1.getNext()
            goto L6
        L14:
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r5.reading
            if (r1 != 0) goto L1a
            r1 = 0
            goto L1e
        L1a:
            com.google.android.exoplayer2.MediaPeriodInfo r1 = r1.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.id
        L1e:
            com.google.android.exoplayer2.util.HandlerWrapper r2 = r5.analyticsCollectorHandler
            com.google.android.exoplayer2.MediaPeriodQueue$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.MediaPeriodQueue$$ExternalSyntheticLambda0
            r4 = 0
            r3.<init>(r5, r0, r1, r4)
            r2.post(r3)
            return
    }

    private static com.google.android.exoplayer2.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(com.google.android.exoplayer2.Timeline r7, java.lang.Object r8, long r9, long r11, com.google.android.exoplayer2.Timeline.Window r13, com.google.android.exoplayer2.Timeline.Period r14) {
            r7.getPeriodByUid(r8, r14)
            int r0 = r14.windowIndex
            r7.getWindow(r0, r13)
            int r0 = r7.getIndexOfPeriod(r8)
            r2 = r8
        Ld:
            long r3 = r14.durationUs
            r8 = -1
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L3e
            int r1 = r14.getAdGroupCount()
            if (r1 <= 0) goto L3e
            int r1 = r14.getRemovedAdGroupCount()
            boolean r1 = r14.isServerSideInsertedAdGroup(r1)
            if (r1 == 0) goto L3e
            int r1 = r14.getAdGroupIndexForPositionUs(r5)
            if (r1 != r8) goto L3e
            int r1 = r0 + 1
            int r3 = r13.lastPeriodIndex
            if (r0 >= r3) goto L3e
            r8 = 1
            r7.getPeriod(r1, r14, r8)
            java.lang.Object r8 = r14.uid
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            r0 = r1
            goto Ld
        L3e:
            r7.getPeriodByUid(r2, r14)
            int r3 = r14.getAdGroupIndexForPositionUs(r9)
            if (r3 != r8) goto L51
            int r7 = r14.getAdGroupIndexAfterPositionUs(r9)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r8 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
            r8.<init>(r2, r11, r7)
            return r8
        L51:
            int r4 = r14.getFirstAdIndexToPlay(r3)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r7 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
            r1 = r7
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            return r7
    }

    private long resolvePeriodIndexToWindowSequenceNumber(com.google.android.exoplayer2.Timeline r6, java.lang.Object r7) {
            r5 = this;
            com.google.android.exoplayer2.Timeline$Period r0 = r5.period
            com.google.android.exoplayer2.Timeline$Period r0 = r6.getPeriodByUid(r7, r0)
            int r0 = r0.windowIndex
            java.lang.Object r1 = r5.oldFrontPeriodUid
            r2 = -1
            if (r1 == 0) goto L20
            int r1 = r6.getIndexOfPeriod(r1)
            if (r1 == r2) goto L20
            com.google.android.exoplayer2.Timeline$Period r3 = r5.period
            com.google.android.exoplayer2.Timeline$Period r1 = r6.getPeriod(r1, r3)
            int r1 = r1.windowIndex
            if (r1 != r0) goto L20
            long r6 = r5.oldFrontPeriodWindowSequenceNumber
            return r6
        L20:
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r5.playing
        L22:
            if (r1 == 0) goto L38
            java.lang.Object r3 = r1.uid
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L33
            com.google.android.exoplayer2.MediaPeriodInfo r6 = r1.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r6 = r6.id
            long r6 = r6.windowSequenceNumber
            return r6
        L33:
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r1.getNext()
            goto L22
        L38:
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r5.playing
        L3a:
            if (r1 == 0) goto L5a
            java.lang.Object r3 = r1.uid
            int r3 = r6.getIndexOfPeriod(r3)
            if (r3 == r2) goto L55
            com.google.android.exoplayer2.Timeline$Period r4 = r5.period
            com.google.android.exoplayer2.Timeline$Period r3 = r6.getPeriod(r3, r4)
            int r3 = r3.windowIndex
            if (r3 != r0) goto L55
            com.google.android.exoplayer2.MediaPeriodInfo r6 = r1.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r6 = r6.id
            long r6 = r6.windowSequenceNumber
            return r6
        L55:
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r1.getNext()
            goto L3a
        L5a:
            long r0 = r5.nextWindowSequenceNumber
            r2 = 1
            long r2 = r2 + r0
            r5.nextWindowSequenceNumber = r2
            com.google.android.exoplayer2.MediaPeriodHolder r6 = r5.playing
            if (r6 != 0) goto L69
            r5.oldFrontPeriodUid = r7
            r5.oldFrontPeriodWindowSequenceNumber = r0
        L69:
            return r0
    }

    private boolean updateForPlaybackModeChange(com.google.android.exoplayer2.Timeline r9) {
            r8 = this;
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r8.playing
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r2 = r0.uid
            int r2 = r9.getIndexOfPeriod(r2)
            r3 = r2
        Ld:
            com.google.android.exoplayer2.Timeline$Period r4 = r8.period
            com.google.android.exoplayer2.Timeline$Window r5 = r8.window
            int r6 = r8.repeatMode
            boolean r7 = r8.shuffleModeEnabled
            r2 = r9
            int r3 = r2.getNextPeriodIndex(r3, r4, r5, r6, r7)
        L1a:
            com.google.android.exoplayer2.MediaPeriodHolder r2 = r0.getNext()
            if (r2 == 0) goto L2b
            com.google.android.exoplayer2.MediaPeriodInfo r2 = r0.info
            boolean r2 = r2.isLastInTimelinePeriod
            if (r2 != 0) goto L2b
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getNext()
            goto L1a
        L2b:
            com.google.android.exoplayer2.MediaPeriodHolder r2 = r0.getNext()
            r4 = -1
            if (r3 == r4) goto L40
            if (r2 != 0) goto L35
            goto L40
        L35:
            java.lang.Object r4 = r2.uid
            int r4 = r9.getIndexOfPeriod(r4)
            if (r4 == r3) goto L3e
            goto L40
        L3e:
            r0 = r2
            goto Ld
        L40:
            boolean r2 = r8.removeAfter(r0)
            com.google.android.exoplayer2.MediaPeriodInfo r3 = r0.info
            com.google.android.exoplayer2.MediaPeriodInfo r9 = r8.getUpdatedMediaPeriodInfo(r9, r3)
            r0.info = r9
            r9 = r2 ^ 1
            return r9
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.MediaPeriodHolder advancePlayingPeriod() {
            r3 = this;
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r3.playing
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.exoplayer2.MediaPeriodHolder r2 = r3.reading
            if (r0 != r2) goto L10
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getNext()
            r3.reading = r0
        L10:
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r3.playing
            r0.release()
            int r0 = r3.length
            int r0 = r0 + (-1)
            r3.length = r0
            if (r0 != 0) goto L2d
            r3.loading = r1
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r3.playing
            java.lang.Object r1 = r0.uid
            r3.oldFrontPeriodUid = r1
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r0.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.id
            long r0 = r0.windowSequenceNumber
            r3.oldFrontPeriodWindowSequenceNumber = r0
        L2d:
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r3.playing
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getNext()
            r3.playing = r0
            r3.notifyQueueUpdate()
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r3.playing
            return r0
    }

    public com.google.android.exoplayer2.MediaPeriodHolder advanceReadingPeriod() {
            r1 = this;
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r1.reading
            if (r0 == 0) goto Lc
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getNext()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r1.reading
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getNext()
            r1.reading = r0
            r1.notifyQueueUpdate()
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r1.reading
            return r0
    }

    public void clear() {
            r3 = this;
            int r0 = r3.length
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r3.playing
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.MediaPeriodHolder r0 = (com.google.android.exoplayer2.MediaPeriodHolder) r0
            java.lang.Object r1 = r0.uid
            r3.oldFrontPeriodUid = r1
            com.google.android.exoplayer2.MediaPeriodInfo r1 = r0.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.id
            long r1 = r1.windowSequenceNumber
            r3.oldFrontPeriodWindowSequenceNumber = r1
        L19:
            if (r0 == 0) goto L23
            r0.release()
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getNext()
            goto L19
        L23:
            r0 = 0
            r3.playing = r0
            r3.loading = r0
            r3.reading = r0
            r0 = 0
            r3.length = r0
            r3.notifyQueueUpdate()
            return
    }

    public com.google.android.exoplayer2.MediaPeriodHolder enqueueNextMediaPeriodHolder(com.google.android.exoplayer2.RendererCapabilities[] r13, com.google.android.exoplayer2.trackselection.TrackSelector r14, com.google.android.exoplayer2.upstream.Allocator r15, com.google.android.exoplayer2.MediaSourceList r16, com.google.android.exoplayer2.MediaPeriodInfo r17, com.google.android.exoplayer2.trackselection.TrackSelectorResult r18) {
            r12 = this;
            r0 = r12
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r0.loading
            if (r1 != 0) goto Ld
            r1 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r10 = r17
            goto L1d
        Ld:
            long r1 = r1.getRendererOffset()
            com.google.android.exoplayer2.MediaPeriodHolder r3 = r0.loading
            com.google.android.exoplayer2.MediaPeriodInfo r3 = r3.info
            long r3 = r3.durationUs
            long r1 = r1 + r3
            r10 = r17
            long r3 = r10.startPositionUs
            long r1 = r1 - r3
        L1d:
            r5 = r1
            com.google.android.exoplayer2.MediaPeriodHolder r1 = new com.google.android.exoplayer2.MediaPeriodHolder
            r3 = r1
            r4 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            r3.<init>(r4, r5, r7, r8, r9, r10, r11)
            com.google.android.exoplayer2.MediaPeriodHolder r2 = r0.loading
            if (r2 == 0) goto L35
            r2.setNext(r1)
            goto L39
        L35:
            r0.playing = r1
            r0.reading = r1
        L39:
            r2 = 0
            r0.oldFrontPeriodUid = r2
            r0.loading = r1
            int r2 = r0.length
            int r2 = r2 + 1
            r0.length = r2
            r12.notifyQueueUpdate()
            return r1
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.MediaPeriodHolder getLoadingPeriod() {
            r1 = this;
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r1.loading
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.MediaPeriodInfo getNextMediaPeriodInfo(long r2, com.google.android.exoplayer2.PlaybackInfo r4) {
            r1 = this;
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r1.loading
            if (r0 != 0) goto L9
            com.google.android.exoplayer2.MediaPeriodInfo r2 = r1.getFirstMediaPeriodInfo(r4)
            goto Lf
        L9:
            com.google.android.exoplayer2.Timeline r4 = r4.timeline
            com.google.android.exoplayer2.MediaPeriodInfo r2 = r1.getFollowingMediaPeriodInfo(r4, r0, r2)
        Lf:
            return r2
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.MediaPeriodHolder getPlayingPeriod() {
            r1 = this;
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r1.playing
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.MediaPeriodHolder getReadingPeriod() {
            r1 = this;
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r1.reading
            return r0
    }

    public com.google.android.exoplayer2.MediaPeriodInfo getUpdatedMediaPeriodInfo(com.google.android.exoplayer2.Timeline r19, com.google.android.exoplayer2.MediaPeriodInfo r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r2.id
            boolean r12 = r0.isLastInPeriod(r3)
            boolean r13 = r0.isLastInWindow(r1, r3)
            boolean r14 = r0.isLastInTimeline(r1, r3, r12)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r2.id
            java.lang.Object r4 = r4.periodUid
            com.google.android.exoplayer2.Timeline$Period r5 = r0.period
            r1.getPeriodByUid(r4, r5)
            boolean r1 = r3.isAd()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L35
            int r1 = r3.nextAdGroupIndex
            if (r1 != r4) goto L2e
            goto L35
        L2e:
            com.google.android.exoplayer2.Timeline$Period r7 = r0.period
            long r7 = r7.getAdGroupTimeUs(r1)
            goto L36
        L35:
            r7 = r5
        L36:
            boolean r1 = r3.isAd()
            if (r1 == 0) goto L48
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            int r5 = r3.adGroupIndex
            int r6 = r3.adIndexInAdGroup
            long r5 = r1.getAdDurationUs(r5, r6)
        L46:
            r9 = r5
            goto L5c
        L48:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            long r5 = r1.getDurationUs()
            goto L46
        L5c:
            boolean r1 = r3.isAd()
            if (r1 == 0) goto L6c
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            int r4 = r3.adGroupIndex
            boolean r1 = r1.isServerSideInsertedAdGroup(r4)
            r11 = r1
            goto L7d
        L6c:
            int r1 = r3.nextAdGroupIndex
            if (r1 == r4) goto L7b
            com.google.android.exoplayer2.Timeline$Period r4 = r0.period
            boolean r1 = r4.isServerSideInsertedAdGroup(r1)
            if (r1 == 0) goto L7b
            r1 = 1
            r11 = 1
            goto L7d
        L7b:
            r1 = 0
            r11 = 0
        L7d:
            com.google.android.exoplayer2.MediaPeriodInfo r15 = new com.google.android.exoplayer2.MediaPeriodInfo
            long r4 = r2.startPositionUs
            long r1 = r2.requestedContentPositionUs
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
    }

    public boolean isLoading(com.google.android.exoplayer2.source.MediaPeriod r2) {
            r1 = this;
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r1.loading
            if (r0 == 0) goto La
            com.google.android.exoplayer2.source.MediaPeriod r0 = r0.mediaPeriod
            if (r0 != r2) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    public void reevaluateBuffer(long r2) {
            r1 = this;
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r1.loading
            if (r0 == 0) goto L7
            r0.reevaluateBuffer(r2)
        L7:
            return
    }

    public boolean removeAfter(com.google.android.exoplayer2.MediaPeriodHolder r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkState(r2)
            com.google.android.exoplayer2.MediaPeriodHolder r2 = r3.loading
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L13
            return r1
        L13:
            r3.loading = r4
        L15:
            com.google.android.exoplayer2.MediaPeriodHolder r2 = r4.getNext()
            if (r2 == 0) goto L31
            com.google.android.exoplayer2.MediaPeriodHolder r4 = r4.getNext()
            com.google.android.exoplayer2.MediaPeriodHolder r2 = r3.reading
            if (r4 != r2) goto L28
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r3.playing
            r3.reading = r1
            r1 = 1
        L28:
            r4.release()
            int r2 = r3.length
            int r2 = r2 - r0
            r3.length = r2
            goto L15
        L31:
            com.google.android.exoplayer2.MediaPeriodHolder r4 = r3.loading
            r0 = 0
            r4.setNext(r0)
            r3.notifyQueueUpdate()
            return r1
    }

    public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(com.google.android.exoplayer2.Timeline r9, java.lang.Object r10, long r11) {
            r8 = this;
            long r4 = r8.resolvePeriodIndexToWindowSequenceNumber(r9, r10)
            com.google.android.exoplayer2.Timeline$Window r6 = r8.window
            com.google.android.exoplayer2.Timeline$Period r7 = r8.period
            r0 = r9
            r1 = r10
            r2 = r11
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r9 = resolveMediaPeriodIdForAds(r0, r1, r2, r4, r6, r7)
            return r9
    }

    public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange(com.google.android.exoplayer2.Timeline r11, java.lang.Object r12, long r13) {
            r10 = this;
            long r4 = r10.resolvePeriodIndexToWindowSequenceNumber(r11, r12)
            com.google.android.exoplayer2.Timeline$Period r0 = r10.period
            r11.getPeriodByUid(r12, r0)
            com.google.android.exoplayer2.Timeline$Period r0 = r10.period
            int r0 = r0.windowIndex
            com.google.android.exoplayer2.Timeline$Window r1 = r10.window
            r11.getWindow(r0, r1)
            int r0 = r11.getIndexOfPeriod(r12)
            r1 = 0
            r2 = 0
        L18:
            com.google.android.exoplayer2.Timeline$Window r3 = r10.window
            int r3 = r3.firstPeriodIndex
            if (r0 < r3) goto L54
            com.google.android.exoplayer2.Timeline$Period r3 = r10.period
            r6 = 1
            r11.getPeriod(r0, r3, r6)
            com.google.android.exoplayer2.Timeline$Period r3 = r10.period
            int r3 = r3.getAdGroupCount()
            if (r3 <= 0) goto L2d
            goto L2e
        L2d:
            r6 = 0
        L2e:
            r2 = r2 | r6
            com.google.android.exoplayer2.Timeline$Period r3 = r10.period
            long r7 = r3.durationUs
            int r3 = r3.getAdGroupIndexForPositionUs(r7)
            r7 = -1
            if (r3 == r7) goto L42
            com.google.android.exoplayer2.Timeline$Period r12 = r10.period
            java.lang.Object r12 = r12.uid
            java.lang.Object r12 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r12)
        L42:
            if (r2 == 0) goto L51
            if (r6 == 0) goto L54
            com.google.android.exoplayer2.Timeline$Period r3 = r10.period
            long r6 = r3.durationUs
            r8 = 0
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 == 0) goto L51
            goto L54
        L51:
            int r0 = r0 + (-1)
            goto L18
        L54:
            r1 = r12
            com.google.android.exoplayer2.Timeline$Window r6 = r10.window
            com.google.android.exoplayer2.Timeline$Period r7 = r10.period
            r0 = r11
            r2 = r13
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r11 = resolveMediaPeriodIdForAds(r0, r1, r2, r4, r6, r7)
            return r11
    }

    public boolean shouldLoadNextMediaPeriod() {
            r5 = this;
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r5.loading
            if (r0 == 0) goto L28
            com.google.android.exoplayer2.MediaPeriodInfo r1 = r0.info
            boolean r1 = r1.isFinal
            if (r1 != 0) goto L26
            boolean r0 = r0.isFullyBuffered()
            if (r0 == 0) goto L26
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r5.loading
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r0.info
            long r0 = r0.durationUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L26
            int r0 = r5.length
            r1 = 100
            if (r0 >= r1) goto L26
            goto L28
        L26:
            r0 = 0
            goto L29
        L28:
            r0 = 1
        L29:
            return r0
    }

    public boolean updateQueuedPeriods(com.google.android.exoplayer2.Timeline r9, long r10, long r12) {
            r8 = this;
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r8.playing
            r1 = 0
        L3:
            r2 = 1
            if (r0 == 0) goto L7d
            com.google.android.exoplayer2.MediaPeriodInfo r3 = r0.info
            if (r1 != 0) goto Lf
            com.google.android.exoplayer2.MediaPeriodInfo r1 = r8.getUpdatedMediaPeriodInfo(r9, r3)
            goto L28
        Lf:
            com.google.android.exoplayer2.MediaPeriodInfo r4 = r8.getFollowingMediaPeriodInfo(r9, r1, r10)
            if (r4 != 0) goto L1b
            boolean r9 = r8.removeAfter(r1)
            r9 = r9 ^ r2
            return r9
        L1b:
            boolean r5 = r8.canKeepMediaPeriodHolder(r3, r4)
            if (r5 != 0) goto L27
            boolean r9 = r8.removeAfter(r1)
            r9 = r9 ^ r2
            return r9
        L27:
            r1 = r4
        L28:
            long r4 = r3.requestedContentPositionUs
            com.google.android.exoplayer2.MediaPeriodInfo r4 = r1.copyWithRequestedContentPositionUs(r4)
            r0.info = r4
            long r3 = r3.durationUs
            long r5 = r1.durationUs
            boolean r3 = r8.areDurationsCompatible(r3, r5)
            if (r3 != 0) goto L75
            r0.updateClipping()
            long r9 = r1.durationUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 != 0) goto L4e
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L52
        L4e:
            long r9 = r0.toRendererTime(r9)
        L52:
            com.google.android.exoplayer2.MediaPeriodHolder r11 = r8.reading
            r1 = 0
            if (r0 != r11) goto L69
            com.google.android.exoplayer2.MediaPeriodInfo r11 = r0.info
            boolean r11 = r11.isFollowedByTransitionToSameStream
            if (r11 != 0) goto L69
            r3 = -9223372036854775808
            int r11 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r11 < 0) goto L69
        L67:
            r9 = 1
            goto L6a
        L69:
            r9 = 0
        L6a:
            boolean r10 = r8.removeAfter(r0)
            if (r10 != 0) goto L73
            if (r9 != 0) goto L73
            goto L74
        L73:
            r2 = 0
        L74:
            return r2
        L75:
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r0.getNext()
            r7 = r1
            r1 = r0
            r0 = r7
            goto L3
        L7d:
            return r2
    }

    public boolean updateRepeatMode(com.google.android.exoplayer2.Timeline r1, int r2) {
            r0 = this;
            r0.repeatMode = r2
            boolean r1 = r0.updateForPlaybackModeChange(r1)
            return r1
    }

    public boolean updateShuffleModeEnabled(com.google.android.exoplayer2.Timeline r1, boolean r2) {
            r0 = this;
            r0.shuffleModeEnabled = r2
            boolean r1 = r0.updateForPlaybackModeChange(r1)
            return r1
    }
}
