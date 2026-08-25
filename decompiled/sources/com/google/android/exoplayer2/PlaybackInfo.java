package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
final class PlaybackInfo {
    private static final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId PLACEHOLDER_MEDIA_PERIOD_ID = null;
    public volatile long bufferedPositionUs;
    public final long discontinuityStartPositionUs;
    public final boolean isLoading;
    public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId loadingMediaPeriodId;
    public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId periodId;
    public final boolean playWhenReady;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.ExoPlaybackException playbackError;
    public final com.google.android.exoplayer2.PlaybackParameters playbackParameters;
    public final int playbackState;
    public final int playbackSuppressionReason;
    public volatile long positionUs;
    public final long requestedContentPositionUs;
    public final boolean sleepingForOffload;
    public final java.util.List<com.google.android.exoplayer2.metadata.Metadata> staticMetadata;
    public final com.google.android.exoplayer2.Timeline timeline;
    public volatile long totalBufferedDurationUs;
    public final com.google.android.exoplayer2.source.TrackGroupArray trackGroups;
    public final com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult;

    static {
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.<init>(r1)
            com.google.android.exoplayer2.PlaybackInfo.PLACEHOLDER_MEDIA_PERIOD_ID = r0
            return
    }

    public PlaybackInfo(com.google.android.exoplayer2.Timeline r4, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r5, long r6, long r8, int r10, @androidx.annotation.Nullable com.google.android.exoplayer2.ExoPlaybackException r11, boolean r12, com.google.android.exoplayer2.source.TrackGroupArray r13, com.google.android.exoplayer2.trackselection.TrackSelectorResult r14, java.util.List<com.google.android.exoplayer2.metadata.Metadata> r15, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r16, boolean r17, int r18, com.google.android.exoplayer2.PlaybackParameters r19, long r20, long r22, long r24, boolean r26) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.timeline = r1
            r1 = r5
            r0.periodId = r1
            r1 = r6
            r0.requestedContentPositionUs = r1
            r1 = r8
            r0.discontinuityStartPositionUs = r1
            r1 = r10
            r0.playbackState = r1
            r1 = r11
            r0.playbackError = r1
            r1 = r12
            r0.isLoading = r1
            r1 = r13
            r0.trackGroups = r1
            r1 = r14
            r0.trackSelectorResult = r1
            r1 = r15
            r0.staticMetadata = r1
            r1 = r16
            r0.loadingMediaPeriodId = r1
            r1 = r17
            r0.playWhenReady = r1
            r1 = r18
            r0.playbackSuppressionReason = r1
            r1 = r19
            r0.playbackParameters = r1
            r1 = r20
            r0.bufferedPositionUs = r1
            r1 = r22
            r0.totalBufferedDurationUs = r1
            r1 = r24
            r0.positionUs = r1
            r1 = r26
            r0.sleepingForOffload = r1
            return
    }

    public static com.google.android.exoplayer2.PlaybackInfo createDummy(com.google.android.exoplayer2.trackselection.TrackSelectorResult r25) {
            r11 = r25
            com.google.android.exoplayer2.PlaybackInfo r24 = new com.google.android.exoplayer2.PlaybackInfo
            r0 = r24
            com.google.android.exoplayer2.Timeline r1 = com.google.android.exoplayer2.Timeline.EMPTY
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r13 = com.google.android.exoplayer2.PlaybackInfo.PLACEHOLDER_MEDIA_PERIOD_ID
            r2 = r13
            com.google.android.exoplayer2.source.TrackGroupArray r10 = com.google.android.exoplayer2.source.TrackGroupArray.EMPTY
            com.google.common.collect.ImmutableList r12 = com.google.common.collect.ImmutableList.of()
            com.google.android.exoplayer2.PlaybackParameters r16 = com.google.android.exoplayer2.PlaybackParameters.DEFAULT
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r23)
            return r24
    }

    public static com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getDummyPeriodForEmptyTimeline() {
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = com.google.android.exoplayer2.PlaybackInfo.PLACEHOLDER_MEDIA_PERIOD_ID
            return r0
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.PlaybackInfo copyWithIsLoading(boolean r28) {
            r27 = this;
            r0 = r27
            r10 = r28
            com.google.android.exoplayer2.PlaybackInfo r25 = new com.google.android.exoplayer2.PlaybackInfo
            r1 = r25
            com.google.android.exoplayer2.Timeline r2 = r0.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.periodId
            long r4 = r0.requestedContentPositionUs
            long r6 = r0.discontinuityStartPositionUs
            int r8 = r0.playbackState
            com.google.android.exoplayer2.ExoPlaybackException r9 = r0.playbackError
            com.google.android.exoplayer2.source.TrackGroupArray r11 = r0.trackGroups
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r12 = r0.trackSelectorResult
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r13 = r0.staticMetadata
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r14 = r0.loadingMediaPeriodId
            boolean r15 = r0.playWhenReady
            r28 = r1
            int r1 = r0.playbackSuppressionReason
            r16 = r1
            com.google.android.exoplayer2.PlaybackParameters r1 = r0.playbackParameters
            r17 = r1
            r26 = r2
            long r1 = r0.bufferedPositionUs
            r18 = r1
            long r1 = r0.totalBufferedDurationUs
            r20 = r1
            long r1 = r0.positionUs
            r22 = r1
            boolean r1 = r0.sleepingForOffload
            r24 = r1
            r1 = r28
            r2 = r26
            r1.<init>(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r24)
            return r25
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.PlaybackInfo copyWithLoadingMediaPeriodId(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r28) {
            r27 = this;
            r0 = r27
            r14 = r28
            com.google.android.exoplayer2.PlaybackInfo r25 = new com.google.android.exoplayer2.PlaybackInfo
            r1 = r25
            com.google.android.exoplayer2.Timeline r2 = r0.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.periodId
            long r4 = r0.requestedContentPositionUs
            long r6 = r0.discontinuityStartPositionUs
            int r8 = r0.playbackState
            com.google.android.exoplayer2.ExoPlaybackException r9 = r0.playbackError
            boolean r10 = r0.isLoading
            com.google.android.exoplayer2.source.TrackGroupArray r11 = r0.trackGroups
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r12 = r0.trackSelectorResult
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r13 = r0.staticMetadata
            boolean r15 = r0.playWhenReady
            r28 = r1
            int r1 = r0.playbackSuppressionReason
            r16 = r1
            com.google.android.exoplayer2.PlaybackParameters r1 = r0.playbackParameters
            r17 = r1
            r26 = r2
            long r1 = r0.bufferedPositionUs
            r18 = r1
            long r1 = r0.totalBufferedDurationUs
            r20 = r1
            long r1 = r0.positionUs
            r22 = r1
            boolean r1 = r0.sleepingForOffload
            r24 = r1
            r1 = r28
            r2 = r26
            r1.<init>(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r24)
            return r25
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.PlaybackInfo copyWithNewPosition(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r27, long r28, long r30, long r32, long r34, com.google.android.exoplayer2.source.TrackGroupArray r36, com.google.android.exoplayer2.trackselection.TrackSelectorResult r37, java.util.List<com.google.android.exoplayer2.metadata.Metadata> r38) {
            r26 = this;
            r0 = r26
            r3 = r27
            r22 = r28
            r4 = r30
            r6 = r32
            r20 = r34
            r11 = r36
            r12 = r37
            r13 = r38
            com.google.android.exoplayer2.PlaybackInfo r25 = new com.google.android.exoplayer2.PlaybackInfo
            r1 = r25
            com.google.android.exoplayer2.Timeline r2 = r0.timeline
            int r8 = r0.playbackState
            com.google.android.exoplayer2.ExoPlaybackException r9 = r0.playbackError
            boolean r10 = r0.isLoading
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r14 = r0.loadingMediaPeriodId
            boolean r15 = r0.playWhenReady
            r27 = r1
            int r1 = r0.playbackSuppressionReason
            r16 = r1
            com.google.android.exoplayer2.PlaybackParameters r1 = r0.playbackParameters
            r17 = r1
            r28 = r2
            long r1 = r0.bufferedPositionUs
            r18 = r1
            boolean r1 = r0.sleepingForOffload
            r24 = r1
            r1 = r27
            r2 = r28
            r1.<init>(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r24)
            return r25
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.PlaybackInfo copyWithPlayWhenReady(boolean r27, int r28) {
            r26 = this;
            r0 = r26
            r15 = r27
            r16 = r28
            com.google.android.exoplayer2.PlaybackInfo r25 = new com.google.android.exoplayer2.PlaybackInfo
            r1 = r25
            com.google.android.exoplayer2.Timeline r2 = r0.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.periodId
            long r4 = r0.requestedContentPositionUs
            long r6 = r0.discontinuityStartPositionUs
            int r8 = r0.playbackState
            com.google.android.exoplayer2.ExoPlaybackException r9 = r0.playbackError
            boolean r10 = r0.isLoading
            com.google.android.exoplayer2.source.TrackGroupArray r11 = r0.trackGroups
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r12 = r0.trackSelectorResult
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r13 = r0.staticMetadata
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r14 = r0.loadingMediaPeriodId
            r27 = r1
            com.google.android.exoplayer2.PlaybackParameters r1 = r0.playbackParameters
            r17 = r1
            r28 = r2
            long r1 = r0.bufferedPositionUs
            r18 = r1
            long r1 = r0.totalBufferedDurationUs
            r20 = r1
            long r1 = r0.positionUs
            r22 = r1
            boolean r1 = r0.sleepingForOffload
            r24 = r1
            r1 = r27
            r2 = r28
            r1.<init>(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r24)
            return r25
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.PlaybackInfo copyWithPlaybackError(@androidx.annotation.Nullable com.google.android.exoplayer2.ExoPlaybackException r28) {
            r27 = this;
            r0 = r27
            r9 = r28
            com.google.android.exoplayer2.PlaybackInfo r25 = new com.google.android.exoplayer2.PlaybackInfo
            r1 = r25
            com.google.android.exoplayer2.Timeline r2 = r0.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.periodId
            long r4 = r0.requestedContentPositionUs
            long r6 = r0.discontinuityStartPositionUs
            int r8 = r0.playbackState
            boolean r10 = r0.isLoading
            com.google.android.exoplayer2.source.TrackGroupArray r11 = r0.trackGroups
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r12 = r0.trackSelectorResult
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r13 = r0.staticMetadata
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r14 = r0.loadingMediaPeriodId
            boolean r15 = r0.playWhenReady
            r28 = r1
            int r1 = r0.playbackSuppressionReason
            r16 = r1
            com.google.android.exoplayer2.PlaybackParameters r1 = r0.playbackParameters
            r17 = r1
            r26 = r2
            long r1 = r0.bufferedPositionUs
            r18 = r1
            long r1 = r0.totalBufferedDurationUs
            r20 = r1
            long r1 = r0.positionUs
            r22 = r1
            boolean r1 = r0.sleepingForOffload
            r24 = r1
            r1 = r28
            r2 = r26
            r1.<init>(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r24)
            return r25
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.PlaybackInfo copyWithPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r28) {
            r27 = this;
            r0 = r27
            r17 = r28
            com.google.android.exoplayer2.PlaybackInfo r25 = new com.google.android.exoplayer2.PlaybackInfo
            r1 = r25
            com.google.android.exoplayer2.Timeline r2 = r0.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.periodId
            long r4 = r0.requestedContentPositionUs
            long r6 = r0.discontinuityStartPositionUs
            int r8 = r0.playbackState
            com.google.android.exoplayer2.ExoPlaybackException r9 = r0.playbackError
            boolean r10 = r0.isLoading
            com.google.android.exoplayer2.source.TrackGroupArray r11 = r0.trackGroups
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r12 = r0.trackSelectorResult
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r13 = r0.staticMetadata
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r14 = r0.loadingMediaPeriodId
            boolean r15 = r0.playWhenReady
            r28 = r1
            int r1 = r0.playbackSuppressionReason
            r16 = r1
            r26 = r2
            long r1 = r0.bufferedPositionUs
            r18 = r1
            long r1 = r0.totalBufferedDurationUs
            r20 = r1
            long r1 = r0.positionUs
            r22 = r1
            boolean r1 = r0.sleepingForOffload
            r24 = r1
            r1 = r28
            r2 = r26
            r1.<init>(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r24)
            return r25
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.PlaybackInfo copyWithPlaybackState(int r28) {
            r27 = this;
            r0 = r27
            r8 = r28
            com.google.android.exoplayer2.PlaybackInfo r25 = new com.google.android.exoplayer2.PlaybackInfo
            r1 = r25
            com.google.android.exoplayer2.Timeline r2 = r0.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.periodId
            long r4 = r0.requestedContentPositionUs
            long r6 = r0.discontinuityStartPositionUs
            com.google.android.exoplayer2.ExoPlaybackException r9 = r0.playbackError
            boolean r10 = r0.isLoading
            com.google.android.exoplayer2.source.TrackGroupArray r11 = r0.trackGroups
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r12 = r0.trackSelectorResult
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r13 = r0.staticMetadata
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r14 = r0.loadingMediaPeriodId
            boolean r15 = r0.playWhenReady
            r28 = r1
            int r1 = r0.playbackSuppressionReason
            r16 = r1
            com.google.android.exoplayer2.PlaybackParameters r1 = r0.playbackParameters
            r17 = r1
            r26 = r2
            long r1 = r0.bufferedPositionUs
            r18 = r1
            long r1 = r0.totalBufferedDurationUs
            r20 = r1
            long r1 = r0.positionUs
            r22 = r1
            boolean r1 = r0.sleepingForOffload
            r24 = r1
            r1 = r28
            r2 = r26
            r1.<init>(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r24)
            return r25
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.PlaybackInfo copyWithSleepingForOffload(boolean r28) {
            r27 = this;
            r0 = r27
            r24 = r28
            com.google.android.exoplayer2.PlaybackInfo r25 = new com.google.android.exoplayer2.PlaybackInfo
            r1 = r25
            com.google.android.exoplayer2.Timeline r2 = r0.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.periodId
            long r4 = r0.requestedContentPositionUs
            long r6 = r0.discontinuityStartPositionUs
            int r8 = r0.playbackState
            com.google.android.exoplayer2.ExoPlaybackException r9 = r0.playbackError
            boolean r10 = r0.isLoading
            com.google.android.exoplayer2.source.TrackGroupArray r11 = r0.trackGroups
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r12 = r0.trackSelectorResult
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r13 = r0.staticMetadata
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r14 = r0.loadingMediaPeriodId
            boolean r15 = r0.playWhenReady
            r28 = r1
            int r1 = r0.playbackSuppressionReason
            r16 = r1
            com.google.android.exoplayer2.PlaybackParameters r1 = r0.playbackParameters
            r17 = r1
            r26 = r2
            long r1 = r0.bufferedPositionUs
            r18 = r1
            long r1 = r0.totalBufferedDurationUs
            r20 = r1
            long r1 = r0.positionUs
            r22 = r1
            r1 = r28
            r2 = r26
            r1.<init>(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r24)
            return r25
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.PlaybackInfo copyWithTimeline(com.google.android.exoplayer2.Timeline r28) {
            r27 = this;
            r0 = r27
            r2 = r28
            com.google.android.exoplayer2.PlaybackInfo r25 = new com.google.android.exoplayer2.PlaybackInfo
            r1 = r25
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.periodId
            long r4 = r0.requestedContentPositionUs
            long r6 = r0.discontinuityStartPositionUs
            int r8 = r0.playbackState
            com.google.android.exoplayer2.ExoPlaybackException r9 = r0.playbackError
            boolean r10 = r0.isLoading
            com.google.android.exoplayer2.source.TrackGroupArray r11 = r0.trackGroups
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r12 = r0.trackSelectorResult
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r13 = r0.staticMetadata
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r14 = r0.loadingMediaPeriodId
            boolean r15 = r0.playWhenReady
            r28 = r1
            int r1 = r0.playbackSuppressionReason
            r16 = r1
            com.google.android.exoplayer2.PlaybackParameters r1 = r0.playbackParameters
            r17 = r1
            r26 = r2
            long r1 = r0.bufferedPositionUs
            r18 = r1
            long r1 = r0.totalBufferedDurationUs
            r20 = r1
            long r1 = r0.positionUs
            r22 = r1
            boolean r1 = r0.sleepingForOffload
            r24 = r1
            r1 = r28
            r2 = r26
            r1.<init>(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r24)
            return r25
    }
}
