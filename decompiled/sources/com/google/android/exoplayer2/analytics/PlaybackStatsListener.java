package com.google.android.exoplayer2.analytics;

/* JADX INFO: loaded from: classes3.dex */
public final class PlaybackStatsListener implements com.google.android.exoplayer2.analytics.AnalyticsListener, com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener {

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format audioFormat;
    private long bandwidthBytes;
    private long bandwidthTimeMs;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.analytics.PlaybackStatsListener.Callback callback;
    private long discontinuityFromPositionMs;

    @androidx.annotation.Nullable
    private java.lang.String discontinuityFromSession;
    private int discontinuityReason;
    private int droppedFrames;
    private com.google.android.exoplayer2.analytics.PlaybackStats finishedPlaybackStats;
    private final boolean keepHistory;

    @androidx.annotation.Nullable
    private java.lang.Exception nonFatalException;
    private final com.google.android.exoplayer2.Timeline.Period period;
    private final java.util.Map<java.lang.String, com.google.android.exoplayer2.analytics.PlaybackStatsListener.PlaybackStatsTracker> playbackStatsTrackers;
    private final com.google.android.exoplayer2.analytics.PlaybackSessionManager sessionManager;
    private final java.util.Map<java.lang.String, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime> sessionStartEventTimes;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format videoFormat;
    private com.google.android.exoplayer2.video.VideoSize videoSize;

    /* JADX INFO: loaded from: classes.dex */
    public interface Callback {
        void onPlaybackStatsReady(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.analytics.PlaybackStats r2);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class PlaybackStatsTracker {
        private long audioFormatBitrateTimeProduct;
        private final java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndFormat> audioFormatHistory;
        private long audioFormatTimeMs;
        private long audioUnderruns;
        private long bandwidthBytes;
        private long bandwidthTimeMs;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.Format currentAudioFormat;
        private float currentPlaybackSpeed;
        private int currentPlaybackState;
        private long currentPlaybackStateStartTimeMs;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.Format currentVideoFormat;
        private long droppedFrames;
        private int fatalErrorCount;
        private final java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndException> fatalErrorHistory;
        private long firstReportedTimeMs;
        private boolean hasBeenReady;
        private boolean hasEnded;
        private boolean hasFatalError;
        private long initialAudioFormatBitrate;
        private long initialVideoFormatBitrate;
        private int initialVideoFormatHeight;
        private final boolean isAd;
        private boolean isForeground;
        private boolean isInterruptedByAd;
        private boolean isJoinTimeInvalid;
        private boolean isSeeking;
        private final boolean keepHistory;
        private long lastAudioFormatStartTimeMs;
        private long lastRebufferStartTimeMs;
        private long lastVideoFormatStartTimeMs;
        private long maxRebufferTimeMs;
        private final java.util.List<long[]> mediaTimeHistory;
        private int nonFatalErrorCount;
        private final java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndException> nonFatalErrorHistory;
        private int pauseBufferCount;
        private int pauseCount;
        private final long[] playbackStateDurationsMs;
        private final java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndPlaybackState> playbackStateHistory;
        private int rebufferCount;
        private int seekCount;
        private boolean startedLoading;
        private long videoFormatBitrateTimeMs;
        private long videoFormatBitrateTimeProduct;
        private long videoFormatHeightTimeMs;
        private long videoFormatHeightTimeProduct;
        private final java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndFormat> videoFormatHistory;

        public PlaybackStatsTracker(boolean r3, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r4) {
                r2 = this;
                r2.<init>()
                r2.keepHistory = r3
                r0 = 16
                long[] r0 = new long[r0]
                r2.playbackStateDurationsMs = r0
                if (r3 == 0) goto L13
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                goto L17
            L13:
                java.util.List r0 = java.util.Collections.emptyList()
            L17:
                r2.playbackStateHistory = r0
                if (r3 == 0) goto L21
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                goto L25
            L21:
                java.util.List r0 = java.util.Collections.emptyList()
            L25:
                r2.mediaTimeHistory = r0
                if (r3 == 0) goto L2f
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                goto L33
            L2f:
                java.util.List r0 = java.util.Collections.emptyList()
            L33:
                r2.videoFormatHistory = r0
                if (r3 == 0) goto L3d
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                goto L41
            L3d:
                java.util.List r0 = java.util.Collections.emptyList()
            L41:
                r2.audioFormatHistory = r0
                if (r3 == 0) goto L4b
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                goto L4f
            L4b:
                java.util.List r0 = java.util.Collections.emptyList()
            L4f:
                r2.fatalErrorHistory = r0
                if (r3 == 0) goto L59
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                goto L5d
            L59:
                java.util.List r3 = java.util.Collections.emptyList()
            L5d:
                r2.nonFatalErrorHistory = r3
                r3 = 0
                r2.currentPlaybackState = r3
                long r0 = r4.realtimeMs
                r2.currentPlaybackStateStartTimeMs = r0
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r2.firstReportedTimeMs = r0
                r2.maxRebufferTimeMs = r0
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r4.mediaPeriodId
                if (r4 == 0) goto L7a
                boolean r4 = r4.isAd()
                if (r4 == 0) goto L7a
                r3 = 1
            L7a:
                r2.isAd = r3
                r3 = -1
                r2.initialAudioFormatBitrate = r3
                r2.initialVideoFormatBitrate = r3
                r3 = -1
                r2.initialVideoFormatHeight = r3
                r3 = 1065353216(0x3f800000, float:1.0)
                r2.currentPlaybackSpeed = r3
                return
        }

        private long[] guessMediaTimeBasedOnElapsedRealtime(long r8) {
                r7 = this;
                java.util.List<long[]> r0 = r7.mediaTimeHistory
                int r1 = r0.size()
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object r0 = r0.get(r1)
                long[] r0 = (long[]) r0
                r1 = 0
                r3 = r0[r1]
                r5 = r0[r2]
                long r3 = r8 - r3
                float r0 = (float) r3
                float r3 = r7.currentPlaybackSpeed
                float r0 = r0 * r3
                long r3 = (long) r0
                long r5 = r5 + r3
                r0 = 2
                long[] r0 = new long[r0]
                r0[r1] = r8
                r0[r2] = r5
                return r0
        }

        private static boolean isInvalidJoinTransition(int r4, int r5) {
                r0 = 14
                r1 = 0
                r2 = 2
                r3 = 1
                if (r4 == r3) goto Lc
                if (r4 == r2) goto Lc
                if (r4 == r0) goto Lc
                return r1
            Lc:
                if (r5 == r3) goto L21
                if (r5 == r2) goto L21
                if (r5 == r0) goto L21
                r4 = 3
                if (r5 == r4) goto L21
                r4 = 4
                if (r5 == r4) goto L21
                r4 = 9
                if (r5 == r4) goto L21
                r4 = 11
                if (r5 == r4) goto L21
                r1 = 1
            L21:
                return r1
        }

        private static boolean isPausedState(int r1) {
                r0 = 4
                if (r1 == r0) goto L9
                r0 = 7
                if (r1 != r0) goto L7
                goto L9
            L7:
                r1 = 0
                goto La
            L9:
                r1 = 1
            La:
                return r1
        }

        private static boolean isReadyState(int r1) {
                r0 = 3
                if (r1 == r0) goto Ld
                r0 = 4
                if (r1 == r0) goto Ld
                r0 = 9
                if (r1 != r0) goto Lb
                goto Ld
            Lb:
                r1 = 0
                goto Le
            Ld:
                r1 = 1
            Le:
                return r1
        }

        private static boolean isRebufferingState(int r1) {
                r0 = 6
                if (r1 == r0) goto Ld
                r0 = 7
                if (r1 == r0) goto Ld
                r0 = 10
                if (r1 != r0) goto Lb
                goto Ld
            Lb:
                r1 = 0
                goto Le
            Ld:
                r1 = 1
            Le:
                return r1
        }

        private void maybeRecordAudioFormatTime(long r8) {
                r7 = this;
                int r0 = r7.currentPlaybackState
                r1 = 3
                if (r0 != r1) goto L25
                com.google.android.exoplayer2.Format r0 = r7.currentAudioFormat
                if (r0 == 0) goto L25
                int r0 = r0.bitrate
                r1 = -1
                if (r0 == r1) goto L25
                long r1 = r7.lastAudioFormatStartTimeMs
                long r1 = r8 - r1
                float r1 = (float) r1
                float r2 = r7.currentPlaybackSpeed
                float r1 = r1 * r2
                long r1 = (long) r1
                long r3 = r7.audioFormatTimeMs
                long r3 = r3 + r1
                r7.audioFormatTimeMs = r3
                long r3 = r7.audioFormatBitrateTimeProduct
                long r5 = (long) r0
                long r1 = r1 * r5
                long r1 = r1 + r3
                r7.audioFormatBitrateTimeProduct = r1
            L25:
                r7.lastAudioFormatStartTimeMs = r8
                return
        }

        private void maybeRecordVideoFormatTime(long r10) {
                r9 = this;
                int r0 = r9.currentPlaybackState
                r1 = 3
                if (r0 != r1) goto L36
                com.google.android.exoplayer2.Format r0 = r9.currentVideoFormat
                if (r0 == 0) goto L36
                long r1 = r9.lastVideoFormatStartTimeMs
                long r1 = r10 - r1
                float r1 = (float) r1
                float r2 = r9.currentPlaybackSpeed
                float r1 = r1 * r2
                long r1 = (long) r1
                int r3 = r0.height
                r4 = -1
                if (r3 == r4) goto L25
                long r5 = r9.videoFormatHeightTimeMs
                long r5 = r5 + r1
                r9.videoFormatHeightTimeMs = r5
                long r5 = r9.videoFormatHeightTimeProduct
                long r7 = (long) r3
                long r7 = r7 * r1
                long r7 = r7 + r5
                r9.videoFormatHeightTimeProduct = r7
            L25:
                int r0 = r0.bitrate
                if (r0 == r4) goto L36
                long r3 = r9.videoFormatBitrateTimeMs
                long r3 = r3 + r1
                r9.videoFormatBitrateTimeMs = r3
                long r3 = r9.videoFormatBitrateTimeProduct
                long r5 = (long) r0
                long r1 = r1 * r5
                long r1 = r1 + r3
                r9.videoFormatBitrateTimeProduct = r1
            L36:
                r9.lastVideoFormatStartTimeMs = r10
                return
        }

        private void maybeUpdateAudioFormat(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r6, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r7) {
                r5 = this;
                com.google.android.exoplayer2.Format r0 = r5.currentAudioFormat
                boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r7)
                if (r0 == 0) goto L9
                return
            L9:
                long r0 = r6.realtimeMs
                r5.maybeRecordAudioFormatTime(r0)
                if (r7 == 0) goto L20
                long r0 = r5.initialAudioFormatBitrate
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L20
                int r0 = r7.bitrate
                r1 = -1
                if (r0 == r1) goto L20
                long r0 = (long) r0
                r5.initialAudioFormatBitrate = r0
            L20:
                r5.currentAudioFormat = r7
                boolean r0 = r5.keepHistory
                if (r0 == 0) goto L30
                java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndFormat> r0 = r5.audioFormatHistory
                com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndFormat r1 = new com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndFormat
                r1.<init>(r6, r7)
                r0.add(r1)
            L30:
                return
        }

        private void maybeUpdateMaxRebufferTimeMs(long r6) {
                r5 = this;
                int r0 = r5.currentPlaybackState
                boolean r0 = isRebufferingState(r0)
                if (r0 == 0) goto L1c
                long r0 = r5.lastRebufferStartTimeMs
                long r6 = r6 - r0
                long r0 = r5.maxRebufferTimeMs
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L1a
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 <= 0) goto L1c
            L1a:
                r5.maxRebufferTimeMs = r6
            L1c:
                return
        }

        private void maybeUpdateMediaTimeHistory(long r10, long r12) {
                r9 = this;
                boolean r0 = r9.keepHistory
                if (r0 != 0) goto L5
                return
            L5:
                int r0 = r9.currentPlaybackState
                r1 = 3
                r2 = 0
                r3 = 2
                r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r6 = 1
                if (r0 == r1) goto L3d
                int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
                if (r0 != 0) goto L17
                return
            L17:
                java.util.List<long[]> r0 = r9.mediaTimeHistory
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L3d
                java.util.List<long[]> r0 = r9.mediaTimeHistory
                int r1 = r0.size()
                int r1 = r1 - r6
                java.lang.Object r0 = r0.get(r1)
                long[] r0 = (long[]) r0
                r7 = r0[r6]
                int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r0 == 0) goto L3d
                java.util.List<long[]> r0 = r9.mediaTimeHistory
                long[] r1 = new long[r3]
                r1[r2] = r10
                r1[r6] = r7
                r0.add(r1)
            L3d:
                int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
                if (r0 == 0) goto L4d
                java.util.List<long[]> r0 = r9.mediaTimeHistory
                long[] r1 = new long[r3]
                r1[r2] = r10
                r1[r6] = r12
                r0.add(r1)
                goto L5e
            L4d:
                java.util.List<long[]> r12 = r9.mediaTimeHistory
                boolean r12 = r12.isEmpty()
                if (r12 != 0) goto L5e
                java.util.List<long[]> r12 = r9.mediaTimeHistory
                long[] r10 = r9.guessMediaTimeBasedOnElapsedRealtime(r10)
                r12.add(r10)
            L5e:
                return
        }

        private void maybeUpdateVideoFormat(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r7, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r8) {
                r6 = this;
                com.google.android.exoplayer2.Format r0 = r6.currentVideoFormat
                boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r8)
                if (r0 == 0) goto L9
                return
            L9:
                long r0 = r7.realtimeMs
                r6.maybeRecordVideoFormatTime(r0)
                if (r8 == 0) goto L2a
                int r0 = r6.initialVideoFormatHeight
                r1 = -1
                if (r0 != r1) goto L1b
                int r0 = r8.height
                if (r0 == r1) goto L1b
                r6.initialVideoFormatHeight = r0
            L1b:
                long r2 = r6.initialVideoFormatBitrate
                r4 = -1
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L2a
                int r0 = r8.bitrate
                if (r0 == r1) goto L2a
                long r0 = (long) r0
                r6.initialVideoFormatBitrate = r0
            L2a:
                r6.currentVideoFormat = r8
                boolean r0 = r6.keepHistory
                if (r0 == 0) goto L3a
                java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndFormat> r0 = r6.videoFormatHistory
                com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndFormat r1 = new com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndFormat
                r1.<init>(r7, r8)
                r0.add(r1)
            L3a:
                return
        }

        private int resolveNewPlaybackState(com.google.android.exoplayer2.Player r6) {
                r5 = this;
                int r0 = r6.getPlaybackState()
                boolean r1 = r5.isSeeking
                if (r1 == 0) goto Le
                boolean r1 = r5.isForeground
                if (r1 == 0) goto Le
                r6 = 5
                return r6
            Le:
                boolean r1 = r5.hasFatalError
                if (r1 == 0) goto L15
                r6 = 13
                return r6
            L15:
                boolean r1 = r5.isForeground
                if (r1 != 0) goto L1c
                boolean r6 = r5.startedLoading
                return r6
            L1c:
                boolean r1 = r5.isInterruptedByAd
                r2 = 14
                if (r1 == 0) goto L23
                return r2
            L23:
                r1 = 4
                if (r0 != r1) goto L29
                r6 = 11
                return r6
            L29:
                r3 = 1
                r4 = 2
                if (r0 != r4) goto L4c
                int r0 = r5.currentPlaybackState
                if (r0 == 0) goto L4b
                if (r0 == r3) goto L4b
                if (r0 == r4) goto L4b
                if (r0 != r2) goto L38
                goto L4b
            L38:
                boolean r0 = r6.getPlayWhenReady()
                if (r0 != 0) goto L40
                r6 = 7
                return r6
            L40:
                int r6 = r6.getPlaybackSuppressionReason()
                if (r6 == 0) goto L49
                r6 = 10
                goto L4a
            L49:
                r6 = 6
            L4a:
                return r6
            L4b:
                return r4
            L4c:
                r2 = 3
                if (r0 != r2) goto L5f
                boolean r0 = r6.getPlayWhenReady()
                if (r0 != 0) goto L56
                return r1
            L56:
                int r6 = r6.getPlaybackSuppressionReason()
                if (r6 == 0) goto L5e
                r2 = 9
            L5e:
                return r2
            L5f:
                if (r0 != r3) goto L68
                int r6 = r5.currentPlaybackState
                if (r6 == 0) goto L68
                r6 = 12
                return r6
            L68:
                int r6 = r5.currentPlaybackState
                return r6
        }

        private void updatePlaybackState(int r11, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r12) {
                r10 = this;
                long r0 = r12.realtimeMs
                long r2 = r10.currentPlaybackStateStartTimeMs
                r4 = 0
                r5 = 1
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 < 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                long r0 = r12.realtimeMs
                long r2 = r10.currentPlaybackStateStartTimeMs
                long r2 = r0 - r2
                long[] r6 = r10.playbackStateDurationsMs
                int r7 = r10.currentPlaybackState
                r8 = r6[r7]
                long r8 = r8 + r2
                r6[r7] = r8
                long r2 = r10.firstReportedTimeMs
                r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r6 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r6 != 0) goto L2c
                r10.firstReportedTimeMs = r0
            L2c:
                boolean r0 = r10.isJoinTimeInvalid
                boolean r1 = isInvalidJoinTransition(r7, r11)
                r0 = r0 | r1
                r10.isJoinTimeInvalid = r0
                boolean r0 = r10.hasBeenReady
                boolean r1 = isReadyState(r11)
                r0 = r0 | r1
                r10.hasBeenReady = r0
                boolean r0 = r10.hasEnded
                r1 = 11
                if (r11 != r1) goto L45
                r4 = 1
            L45:
                r0 = r0 | r4
                r10.hasEnded = r0
                int r0 = r10.currentPlaybackState
                boolean r0 = isPausedState(r0)
                if (r0 != 0) goto L5b
                boolean r0 = isPausedState(r11)
                if (r0 == 0) goto L5b
                int r0 = r10.pauseCount
                int r0 = r0 + r5
                r10.pauseCount = r0
            L5b:
                r0 = 5
                if (r11 != r0) goto L63
                int r0 = r10.seekCount
                int r0 = r0 + r5
                r10.seekCount = r0
            L63:
                int r0 = r10.currentPlaybackState
                boolean r0 = isRebufferingState(r0)
                if (r0 != 0) goto L7a
                boolean r0 = isRebufferingState(r11)
                if (r0 == 0) goto L7a
                int r0 = r10.rebufferCount
                int r0 = r0 + r5
                r10.rebufferCount = r0
                long r0 = r12.realtimeMs
                r10.lastRebufferStartTimeMs = r0
            L7a:
                int r0 = r10.currentPlaybackState
                boolean r0 = isRebufferingState(r0)
                if (r0 == 0) goto L8e
                int r0 = r10.currentPlaybackState
                r1 = 7
                if (r0 == r1) goto L8e
                if (r11 != r1) goto L8e
                int r0 = r10.pauseBufferCount
                int r0 = r0 + r5
                r10.pauseBufferCount = r0
            L8e:
                long r0 = r12.realtimeMs
                r10.maybeUpdateMaxRebufferTimeMs(r0)
                r10.currentPlaybackState = r11
                long r0 = r12.realtimeMs
                r10.currentPlaybackStateStartTimeMs = r0
                boolean r0 = r10.keepHistory
                if (r0 == 0) goto La7
                java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndPlaybackState> r0 = r10.playbackStateHistory
                com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndPlaybackState r1 = new com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndPlaybackState
                r1.<init>(r12, r11)
                r0.add(r1)
            La7:
                return
        }

        public com.google.android.exoplayer2.analytics.PlaybackStats build(boolean r68) {
                r67 = this;
                r0 = r67
                long[] r1 = r0.playbackStateDurationsMs
                java.util.List<long[]> r2 = r0.mediaTimeHistory
                r3 = 0
                if (r68 != 0) goto L48
                long r1 = android.os.SystemClock.elapsedRealtime()
                long[] r5 = r0.playbackStateDurationsMs
                r6 = 16
                long[] r5 = java.util.Arrays.copyOf(r5, r6)
                long r6 = r0.currentPlaybackStateStartTimeMs
                long r6 = r1 - r6
                long r6 = java.lang.Math.max(r3, r6)
                int r8 = r0.currentPlaybackState
                r9 = r5[r8]
                long r9 = r9 + r6
                r5[r8] = r9
                r0.maybeUpdateMaxRebufferTimeMs(r1)
                r0.maybeRecordVideoFormatTime(r1)
                r0.maybeRecordAudioFormatTime(r1)
                java.util.ArrayList r6 = new java.util.ArrayList
                java.util.List<long[]> r7 = r0.mediaTimeHistory
                r6.<init>(r7)
                boolean r7 = r0.keepHistory
                if (r7 == 0) goto L45
                int r7 = r0.currentPlaybackState
                r8 = 3
                if (r7 != r8) goto L45
                long[] r1 = r0.guessMediaTimeBasedOnElapsedRealtime(r1)
                r6.add(r1)
            L45:
                r9 = r5
                r11 = r6
                goto L4a
            L48:
                r9 = r1
                r11 = r2
            L4a:
                boolean r1 = r0.isJoinTimeInvalid
                r5 = 1
                if (r1 != 0) goto L56
                boolean r1 = r0.hasBeenReady
                if (r1 != 0) goto L54
                goto L56
            L54:
                r1 = 0
                goto L57
            L56:
                r1 = 1
            L57:
                if (r1 == 0) goto L5f
                r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                goto L62
            L5f:
                r6 = 2
                r6 = r9[r6]
            L62:
                r18 = r6
                r6 = r9[r5]
                int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r8 <= 0) goto L6d
                r17 = 1
                goto L6f
            L6d:
                r17 = 0
            L6f:
                if (r68 == 0) goto L74
                java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndFormat> r3 = r0.videoFormatHistory
                goto L7b
            L74:
                java.util.ArrayList r3 = new java.util.ArrayList
                java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndFormat> r4 = r0.videoFormatHistory
                r3.<init>(r4)
            L7b:
                r28 = r3
                if (r68 == 0) goto L82
                java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndFormat> r3 = r0.audioFormatHistory
                goto L89
            L82:
                java.util.ArrayList r3 = new java.util.ArrayList
                java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndFormat> r4 = r0.audioFormatHistory
                r3.<init>(r4)
            L89:
                r29 = r3
                com.google.android.exoplayer2.analytics.PlaybackStats r3 = new com.google.android.exoplayer2.analytics.PlaybackStats
                if (r68 == 0) goto L92
                java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndPlaybackState> r4 = r0.playbackStateHistory
                goto L99
            L92:
                java.util.ArrayList r4 = new java.util.ArrayList
                java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndPlaybackState> r6 = r0.playbackStateHistory
                r4.<init>(r6)
            L99:
                r10 = r4
                long r12 = r0.firstReportedTimeMs
                boolean r14 = r0.isForeground
                boolean r4 = r0.hasBeenReady
                r15 = r4 ^ 1
                boolean r4 = r0.hasEnded
                r20 = r1 ^ 1
                int r1 = r0.pauseCount
                int r6 = r0.pauseBufferCount
                int r7 = r0.seekCount
                int r2 = r0.rebufferCount
                r22 = r6
                long r5 = r0.maxRebufferTimeMs
                boolean r8 = r0.isAd
                r25 = r8
                r24 = r9
                long r8 = r0.videoFormatHeightTimeMs
                r26 = r8
                long r8 = r0.videoFormatHeightTimeProduct
                r30 = r8
                long r8 = r0.videoFormatBitrateTimeMs
                r32 = r8
                long r8 = r0.videoFormatBitrateTimeProduct
                r34 = r8
                long r8 = r0.audioFormatTimeMs
                r36 = r8
                long r8 = r0.audioFormatBitrateTimeProduct
                r38 = r8
                int r8 = r0.initialVideoFormatHeight
                r9 = -1
                r40 = r8
                if (r8 != r9) goto Lda
                r42 = 0
                goto Ldc
            Lda:
                r42 = 1
            Ldc:
                long r8 = r0.initialVideoFormatBitrate
                r43 = -1
                int r41 = (r8 > r43 ? 1 : (r8 == r43 ? 0 : -1))
                r46 = r8
                if (r41 != 0) goto Le9
                r45 = 0
                goto Leb
            Le9:
                r45 = 1
            Leb:
                long r8 = r0.initialAudioFormatBitrate
                int r41 = (r8 > r43 ? 1 : (r8 == r43 ? 0 : -1))
                r43 = r8
                if (r41 != 0) goto Lf6
                r48 = 0
                goto Lf8
            Lf6:
                r48 = 1
            Lf8:
                long r8 = r0.bandwidthTimeMs
                r49 = r8
                long r8 = r0.bandwidthBytes
                r51 = r8
                long r8 = r0.droppedFrames
                r53 = r8
                long r8 = r0.audioUnderruns
                r55 = r8
                int r8 = r0.fatalErrorCount
                if (r8 <= 0) goto L10f
                r58 = 1
                goto L111
            L10f:
                r58 = 0
            L111:
                int r9 = r0.nonFatalErrorCount
                r60 = r9
                java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndException> r9 = r0.fatalErrorHistory
                r61 = r9
                java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndException> r9 = r0.nonFatalErrorHistory
                r62 = r9
                r41 = r7
                r7 = r3
                r59 = r8
                r63 = r53
                r65 = r55
                r8 = 1
                r53 = r49
                r55 = r51
                r51 = r43
                r49 = r46
                r43 = r38
                r46 = r40
                r38 = r36
                r36 = r34
                r34 = r32
                r32 = r30
                r30 = r26
                r27 = r25
                r9 = r24
                r16 = r4
                r21 = r1
                r23 = r41
                r24 = r2
                r25 = r5
                r40 = r43
                r43 = r45
                r44 = r46
                r45 = r49
                r47 = r48
                r48 = r51
                r50 = r53
                r52 = r55
                r54 = r63
                r56 = r65
                r7.<init>(r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30, r32, r34, r36, r38, r40, r42, r43, r44, r45, r47, r48, r50, r52, r54, r56, r58, r59, r60, r61, r62)
                return r3
        }

        public void onEvents(com.google.android.exoplayer2.Player r15, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r16, boolean r17, long r18, boolean r20, int r21, boolean r22, boolean r23, @androidx.annotation.Nullable com.google.android.exoplayer2.PlaybackException r24, @androidx.annotation.Nullable java.lang.Exception r25, long r26, long r28, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r30, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r31, @androidx.annotation.Nullable com.google.android.exoplayer2.video.VideoSize r32) {
                r14 = this;
                r0 = r14
                r1 = r16
                r2 = r18
                r4 = r24
                r5 = r25
                r6 = r30
                r7 = r31
                r8 = r32
                r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r11 = 1
                int r12 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                if (r12 == 0) goto L20
                long r12 = r1.realtimeMs
                r14.maybeUpdateMediaTimeHistory(r12, r2)
                r0.isSeeking = r11
            L20:
                int r2 = r15.getPlaybackState()
                r3 = 2
                r12 = 0
                if (r2 == r3) goto L2a
                r0.isSeeking = r12
            L2a:
                int r2 = r15.getPlaybackState()
                if (r2 == r11) goto L35
                r13 = 4
                if (r2 == r13) goto L35
                if (r20 == 0) goto L37
            L35:
                r0.isInterruptedByAd = r12
            L37:
                if (r4 == 0) goto L4f
                r0.hasFatalError = r11
                int r2 = r0.fatalErrorCount
                int r2 = r2 + r11
                r0.fatalErrorCount = r2
                boolean r2 = r0.keepHistory
                if (r2 == 0) goto L57
                java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndException> r2 = r0.fatalErrorHistory
                com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndException r12 = new com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndException
                r12.<init>(r1, r4)
                r2.add(r12)
                goto L57
            L4f:
                com.google.android.exoplayer2.PlaybackException r2 = r15.getPlayerError()
                if (r2 != 0) goto L57
                r0.hasFatalError = r12
            L57:
                boolean r2 = r0.isForeground
                if (r2 == 0) goto L76
                boolean r2 = r0.isInterruptedByAd
                if (r2 != 0) goto L76
                com.google.android.exoplayer2.Tracks r2 = r15.getCurrentTracks()
                boolean r3 = r2.isTypeSelected(r3)
                r4 = 0
                if (r3 != 0) goto L6d
                r14.maybeUpdateVideoFormat(r1, r4)
            L6d:
                boolean r2 = r2.isTypeSelected(r11)
                if (r2 != 0) goto L76
                r14.maybeUpdateAudioFormat(r1, r4)
            L76:
                if (r6 == 0) goto L7b
                r14.maybeUpdateVideoFormat(r1, r6)
            L7b:
                if (r7 == 0) goto L80
                r14.maybeUpdateAudioFormat(r1, r7)
            L80:
                com.google.android.exoplayer2.Format r2 = r0.currentVideoFormat
                if (r2 == 0) goto La2
                int r3 = r2.height
                r4 = -1
                if (r3 != r4) goto La2
                if (r8 == 0) goto La2
                com.google.android.exoplayer2.Format$Builder r2 = r2.buildUpon()
                int r3 = r8.width
                com.google.android.exoplayer2.Format$Builder r2 = r2.setWidth(r3)
                int r3 = r8.height
                com.google.android.exoplayer2.Format$Builder r2 = r2.setHeight(r3)
                com.google.android.exoplayer2.Format r2 = r2.build()
                r14.maybeUpdateVideoFormat(r1, r2)
            La2:
                if (r23 == 0) goto La6
                r0.startedLoading = r11
            La6:
                if (r22 == 0) goto Laf
                long r2 = r0.audioUnderruns
                r6 = 1
                long r2 = r2 + r6
                r0.audioUnderruns = r2
            Laf:
                long r2 = r0.droppedFrames
                r4 = r21
                long r6 = (long) r4
                long r2 = r2 + r6
                r0.droppedFrames = r2
                long r2 = r0.bandwidthTimeMs
                long r2 = r2 + r26
                r0.bandwidthTimeMs = r2
                long r2 = r0.bandwidthBytes
                long r2 = r2 + r28
                r0.bandwidthBytes = r2
                if (r5 == 0) goto Ld8
                int r2 = r0.nonFatalErrorCount
                int r2 = r2 + r11
                r0.nonFatalErrorCount = r2
                boolean r2 = r0.keepHistory
                if (r2 == 0) goto Ld8
                java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndException> r2 = r0.nonFatalErrorHistory
                com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndException r3 = new com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndException
                r3.<init>(r1, r5)
                r2.add(r3)
            Ld8:
                int r2 = r14.resolveNewPlaybackState(r15)
                com.google.android.exoplayer2.PlaybackParameters r3 = r15.getPlaybackParameters()
                float r3 = r3.speed
                int r4 = r0.currentPlaybackState
                if (r4 != r2) goto Lec
                float r4 = r0.currentPlaybackSpeed
                int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r4 == 0) goto Lff
            Lec:
                long r4 = r1.realtimeMs
                if (r17 == 0) goto Lf2
                long r9 = r1.eventPlaybackPositionMs
            Lf2:
                r14.maybeUpdateMediaTimeHistory(r4, r9)
                long r4 = r1.realtimeMs
                r14.maybeRecordVideoFormatTime(r4)
                long r4 = r1.realtimeMs
                r14.maybeRecordAudioFormatTime(r4)
            Lff:
                r0.currentPlaybackSpeed = r3
                int r3 = r0.currentPlaybackState
                if (r3 == r2) goto L108
                r14.updatePlaybackState(r2, r1)
            L108:
                return
        }

        public void onFinished(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r5, boolean r6, long r7) {
                r4 = this;
                int r0 = r4.currentPlaybackState
                r1 = 11
                if (r0 == r1) goto Lb
                if (r6 == 0) goto L9
                goto Lb
            L9:
                r1 = 15
            Lb:
                long r2 = r5.realtimeMs
                r4.maybeUpdateMediaTimeHistory(r2, r7)
                long r6 = r5.realtimeMs
                r4.maybeRecordVideoFormatTime(r6)
                long r6 = r5.realtimeMs
                r4.maybeRecordAudioFormatTime(r6)
                r4.updatePlaybackState(r1, r5)
                return
        }

        public void onForeground() {
                r1 = this;
                r0 = 1
                r1.isForeground = r0
                return
        }

        public void onInterruptedByAd() {
                r1 = this;
                r0 = 1
                r1.isInterruptedByAd = r0
                r0 = 0
                r1.isSeeking = r0
                return
        }
    }

    public PlaybackStatsListener(boolean r1, @androidx.annotation.Nullable com.google.android.exoplayer2.analytics.PlaybackStatsListener.Callback r2) {
            r0 = this;
            r0.<init>()
            r0.callback = r2
            r0.keepHistory = r1
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager r1 = new com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager
            r1.<init>()
            r0.sessionManager = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.playbackStatsTrackers = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.sessionStartEventTimes = r2
            com.google.android.exoplayer2.analytics.PlaybackStats r2 = com.google.android.exoplayer2.analytics.PlaybackStats.EMPTY
            r0.finishedPlaybackStats = r2
            com.google.android.exoplayer2.Timeline$Period r2 = new com.google.android.exoplayer2.Timeline$Period
            r2.<init>()
            r0.period = r2
            com.google.android.exoplayer2.video.VideoSize r2 = com.google.android.exoplayer2.video.VideoSize.UNKNOWN
            r0.videoSize = r2
            r1.setListener(r0)
            return
    }

    private android.util.Pair<com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime, java.lang.Boolean> findBestEventTime(com.google.android.exoplayer2.analytics.AnalyticsListener.Events r24, java.lang.String r25) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = 0
            r4 = 0
            r5 = r4
            r4 = 0
        La:
            int r6 = r24.size()
            if (r3 >= r6) goto L33
            int r6 = r1.get(r3)
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r6 = r1.getEventTime(r6)
            com.google.android.exoplayer2.analytics.PlaybackSessionManager r7 = r0.sessionManager
            boolean r7 = r7.belongsToSession(r6, r2)
            if (r5 == 0) goto L2e
            if (r7 == 0) goto L24
            if (r4 == 0) goto L2e
        L24:
            if (r7 != r4) goto L30
            long r8 = r6.realtimeMs
            long r10 = r5.realtimeMs
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L30
        L2e:
            r5 = r6
            r4 = r7
        L30:
            int r3 = r3 + 1
            goto La
        L33:
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            if (r4 != 0) goto L9f
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r5.mediaPeriodId
            if (r1 == 0) goto L9f
            boolean r1 = r1.isAd()
            if (r1 == 0) goto L9f
            com.google.android.exoplayer2.Timeline r1 = r5.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r5.mediaPeriodId
            java.lang.Object r3 = r3.periodUid
            com.google.android.exoplayer2.Timeline$Period r4 = r0.period
            com.google.android.exoplayer2.Timeline$Period r1 = r1.getPeriodByUid(r3, r4)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r5.mediaPeriodId
            int r3 = r3.adGroupIndex
            long r3 = r1.getAdGroupTimeUs(r3)
            r6 = -9223372036854775808
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 != 0) goto L60
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            long r3 = r1.durationUs
        L60:
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            long r6 = r1.getPositionInWindowUs()
            long r6 = r6 + r3
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r1 = new com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime
            long r9 = r5.realtimeMs
            com.google.android.exoplayer2.Timeline r11 = r5.timeline
            int r12 = r5.windowIndex
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r13 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r5.mediaPeriodId
            java.lang.Object r4 = r3.periodUid
            long r14 = r3.windowSequenceNumber
            int r3 = r3.adGroupIndex
            r13.<init>(r4, r14, r3)
            long r14 = com.google.android.exoplayer2.util.Util.usToMs(r6)
            com.google.android.exoplayer2.Timeline r3 = r5.timeline
            int r4 = r5.currentWindowIndex
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r6 = r5.currentMediaPeriodId
            long r7 = r5.currentPlaybackPositionMs
            r18 = r6
            long r5 = r5.totalBufferedDurationMs
            r19 = r7
            r8 = r1
            r16 = r3
            r17 = r4
            r21 = r5
            r8.<init>(r9, r11, r12, r13, r14, r16, r17, r18, r19, r21)
            com.google.android.exoplayer2.analytics.PlaybackSessionManager r3 = r0.sessionManager
            boolean r4 = r3.belongsToSession(r1, r2)
            r5 = r1
        L9f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            android.util.Pair r1 = android.util.Pair.create(r5, r1)
            return r1
    }

    private boolean hasEvent(com.google.android.exoplayer2.analytics.AnalyticsListener.Events r2, java.lang.String r3, int r4) {
            r1 = this;
            boolean r0 = r2.contains(r4)
            if (r0 == 0) goto L14
            com.google.android.exoplayer2.analytics.PlaybackSessionManager r0 = r1.sessionManager
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r2.getEventTime(r4)
            boolean r2 = r0.belongsToSession(r2, r3)
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    private void maybeAddSessions(com.google.android.exoplayer2.analytics.AnalyticsListener.Events r5) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r5.size()
            if (r0 >= r1) goto L2b
            int r1 = r5.get(r0)
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r5.getEventTime(r1)
            if (r1 != 0) goto L17
            com.google.android.exoplayer2.analytics.PlaybackSessionManager r1 = r4.sessionManager
            r1.updateSessionsWithTimelineChange(r2)
            goto L28
        L17:
            r3 = 11
            if (r1 != r3) goto L23
            com.google.android.exoplayer2.analytics.PlaybackSessionManager r1 = r4.sessionManager
            int r3 = r4.discontinuityReason
            r1.updateSessionsWithDiscontinuity(r2, r3)
            goto L28
        L23:
            com.google.android.exoplayer2.analytics.PlaybackSessionManager r1 = r4.sessionManager
            r1.updateSessions(r2)
        L28:
            int r0 = r0 + 1
            goto L1
        L2b:
            return
    }

    public com.google.android.exoplayer2.analytics.PlaybackStats getCombinedPlaybackStats() {
            r6 = this;
            java.util.Map<java.lang.String, com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker> r0 = r6.playbackStatsTrackers
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 + r1
            com.google.android.exoplayer2.analytics.PlaybackStats[] r0 = new com.google.android.exoplayer2.analytics.PlaybackStats[r0]
            com.google.android.exoplayer2.analytics.PlaybackStats r2 = r6.finishedPlaybackStats
            r3 = 0
            r0[r3] = r2
            java.util.Map<java.lang.String, com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker> r2 = r6.playbackStatsTrackers
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r2.next()
            com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker r4 = (com.google.android.exoplayer2.analytics.PlaybackStatsListener.PlaybackStatsTracker) r4
            int r5 = r1 + 1
            com.google.android.exoplayer2.analytics.PlaybackStats r4 = r4.build(r3)
            r0[r1] = r4
            r1 = r5
            goto L19
        L2f:
            com.google.android.exoplayer2.analytics.PlaybackStats r0 = com.google.android.exoplayer2.analytics.PlaybackStats.merge(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.analytics.PlaybackStats getPlaybackStats() {
            r3 = this;
            com.google.android.exoplayer2.analytics.PlaybackSessionManager r0 = r3.sessionManager
            java.lang.String r0 = r0.getActiveSessionId()
            r1 = 0
            if (r0 != 0) goto Lb
            r0 = r1
            goto L13
        Lb:
            java.util.Map<java.lang.String, com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker> r2 = r3.playbackStatsTrackers
            java.lang.Object r0 = r2.get(r0)
            com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker r0 = (com.google.android.exoplayer2.analytics.PlaybackStatsListener.PlaybackStatsTracker) r0
        L13:
            if (r0 != 0) goto L16
            goto L1b
        L16:
            r1 = 0
            com.google.android.exoplayer2.analytics.PlaybackStats r1 = r0.build(r1)
        L1b:
            return r1
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onAdPlaybackStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            java.util.Map<java.lang.String, com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker> r1 = r0.playbackStatsTrackers
            java.lang.Object r1 = r1.get(r2)
            com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker r1 = (com.google.android.exoplayer2.analytics.PlaybackStatsListener.PlaybackStatsTracker) r1
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker r1 = (com.google.android.exoplayer2.analytics.PlaybackStatsListener.PlaybackStatsTracker) r1
            r1.onInterruptedByAd()
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioAttributesChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.audio.AudioAttributes r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioAttributesChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioCodecError(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioDecoderInitialized(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3, long r5) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioDecoderInitialized(r0, r1, r2, r3, r5)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioDecoderReleased(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioDisabled(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioEnabled(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioInputFormatChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioInputFormatChanged(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioPositionAdvancing(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioPositionAdvancing(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioSessionIdChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioSessionIdChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioSinkError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioSinkError(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioUnderrun(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, long r3, long r5) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioUnderrun(r0, r1, r2, r3, r5)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAvailableCommandsChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Player.Commands r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAvailableCommandsChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onBandwidthEstimate(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, long r3, long r5) {
            r0 = this;
            long r1 = (long) r2
            r0.bandwidthTimeMs = r1
            r0.bandwidthBytes = r3
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onCues(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.text.CueGroup r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onCues(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onCues(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.util.List r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onCues(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDecoderDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, com.google.android.exoplayer2.decoder.DecoderCounters r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDecoderDisabled(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDecoderEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, com.google.android.exoplayer2.decoder.DecoderCounters r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDecoderEnabled(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, java.lang.String r3, long r4) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDecoderInitialized(r0, r1, r2, r3, r4)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDecoderInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, com.google.android.exoplayer2.Format r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDecoderInputFormatChanged(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDeviceInfoChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.DeviceInfo r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDeviceInfoChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDeviceVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, boolean r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDeviceVolumeChanged(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
            r1 = this;
            int r2 = r3.trackType
            r0 = 2
            if (r2 == r0) goto L10
            if (r2 != 0) goto L8
            goto L10
        L8:
            r0 = 1
            if (r2 != r0) goto L14
            com.google.android.exoplayer2.Format r2 = r3.trackFormat
            r1.audioFormat = r2
            goto L14
        L10:
            com.google.android.exoplayer2.Format r2 = r3.trackFormat
            r1.videoFormat = r2
        L14:
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmKeysLoaded(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmKeysLoaded(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmKeysRemoved(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmKeysRemoved(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmKeysRestored(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmKeysRestored(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionAcquired(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmSessionAcquired(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionAcquired(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmSessionAcquired(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionManagerError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2) {
            r0 = this;
            r0.nonFatalException = r2
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmSessionReleased(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDroppedVideoFrames(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, long r3) {
            r0 = this;
            r0.droppedFrames = r2
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onEvents(com.google.android.exoplayer2.Player r30, com.google.android.exoplayer2.analytics.AnalyticsListener.Events r31) {
            r29 = this;
            r0 = r29
            r1 = r31
            int r2 = r31.size()
            if (r2 != 0) goto Lb
            return
        Lb:
            r0.maybeAddSessions(r1)
            java.util.Map<java.lang.String, com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker> r2 = r0.playbackStatsTrackers
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lf2
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            android.util.Pair r5 = r0.findBestEventTime(r1, r3)
            java.util.Map<java.lang.String, com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker> r6 = r0.playbackStatsTrackers
            java.lang.Object r6 = r6.get(r3)
            r7 = r6
            com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker r7 = (com.google.android.exoplayer2.analytics.PlaybackStatsListener.PlaybackStatsTracker) r7
            r6 = 11
            boolean r13 = r0.hasEvent(r1, r3, r6)
            r6 = 1018(0x3fa, float:1.427E-42)
            boolean r6 = r0.hasEvent(r1, r3, r6)
            r8 = 1011(0x3f3, float:1.417E-42)
            boolean r15 = r0.hasEvent(r1, r3, r8)
            r8 = 1000(0x3e8, float:1.401E-42)
            boolean r16 = r0.hasEvent(r1, r3, r8)
            r8 = 10
            boolean r8 = r0.hasEvent(r1, r3, r8)
            r9 = 1003(0x3eb, float:1.406E-42)
            boolean r9 = r0.hasEvent(r1, r3, r9)
            if (r9 != 0) goto L62
            r9 = 1024(0x400, float:1.435E-42)
            boolean r9 = r0.hasEvent(r1, r3, r9)
            if (r9 == 0) goto L60
            goto L62
        L60:
            r9 = 0
            goto L63
        L62:
            r9 = 1
        L63:
            r11 = 1006(0x3ee, float:1.41E-42)
            boolean r11 = r0.hasEvent(r1, r3, r11)
            r12 = 1004(0x3ec, float:1.407E-42)
            boolean r12 = r0.hasEvent(r1, r3, r12)
            r14 = 25
            boolean r14 = r0.hasEvent(r1, r3, r14)
            java.lang.Object r10 = r5.first
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r10 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r10
            java.lang.Object r5 = r5.second
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.String r4 = r0.discontinuityFromSession
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L8c
            long r3 = r0.discontinuityFromPositionMs
            goto L91
        L8c:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L91:
            if (r6 == 0) goto L98
            int r6 = r0.droppedFrames
            r17 = r6
            goto L9a
        L98:
            r17 = 0
        L9a:
            if (r8 == 0) goto La1
            com.google.android.exoplayer2.PlaybackException r6 = r30.getPlayerError()
            goto La2
        La1:
            r6 = 0
        La2:
            if (r9 == 0) goto La9
            java.lang.Exception r8 = r0.nonFatalException
            r19 = r8
            goto Lab
        La9:
            r19 = 0
        Lab:
            if (r11 == 0) goto Lb2
            long r8 = r0.bandwidthTimeMs
            r22 = r8
            goto Lb4
        Lb2:
            r22 = 0
        Lb4:
            if (r11 == 0) goto Lbb
            long r8 = r0.bandwidthBytes
            r24 = r8
            goto Lbd
        Lbb:
            r24 = 0
        Lbd:
            if (r12 == 0) goto Lc4
            com.google.android.exoplayer2.Format r8 = r0.videoFormat
            r26 = r8
            goto Lc6
        Lc4:
            r26 = 0
        Lc6:
            if (r12 == 0) goto Lcd
            com.google.android.exoplayer2.Format r8 = r0.audioFormat
            r27 = r8
            goto Lcf
        Lcd:
            r27 = 0
        Lcf:
            if (r14 == 0) goto Ld6
            com.google.android.exoplayer2.video.VideoSize r8 = r0.videoSize
            r28 = r8
            goto Ld8
        Ld6:
            r28 = 0
        Ld8:
            r8 = r30
            r9 = r10
            r10 = r5
            r11 = r3
            r14 = r17
            r17 = r6
            r18 = r19
            r19 = r22
            r21 = r24
            r23 = r26
            r24 = r27
            r25 = r28
            r7.onEvents(r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r21, r23, r24, r25)
            goto L18
        Lf2:
            r3 = 0
            r0.videoFormat = r3
            r0.audioFormat = r3
            r0.discontinuityFromSession = r3
            r2 = 1028(0x404, float:1.44E-42)
            boolean r3 = r1.contains(r2)
            if (r3 == 0) goto L10a
            com.google.android.exoplayer2.analytics.PlaybackSessionManager r3 = r0.sessionManager
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r1 = r1.getEventTime(r2)
            r3.finishAllSessions(r1)
        L10a:
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onIsLoadingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onIsLoadingChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onIsPlayingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onIsPlayingChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadCanceled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onLoadCanceled(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadCompleted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onLoadCompleted(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3, java.io.IOException r4, boolean r5) {
            r0 = this;
            r0.nonFatalException = r4
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onLoadStarted(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onLoadingChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onMaxSeekToPreviousPositionChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onMediaItemTransition(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.MediaItem r2, int r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onMediaItemTransition(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onMediaMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.MediaMetadata r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onMediaMetadataChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onMetadata(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.metadata.Metadata r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onMetadata(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayWhenReadyChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2, int r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlayWhenReadyChanged(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaybackParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.PlaybackParameters r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlaybackParametersChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaybackStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlaybackStateChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlaybackSuppressionReasonChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.PlaybackException r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlayerError(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerErrorChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.PlaybackException r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlayerErrorChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlayerReleased(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2, int r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlayerStateChanged(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaylistMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.MediaMetadata r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlaylistMetadataChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPositionDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPositionDiscontinuity(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Player.PositionInfo r2, com.google.android.exoplayer2.Player.PositionInfo r3, int r4) {
            r0 = this;
            java.lang.String r1 = r0.discontinuityFromSession
            if (r1 != 0) goto L10
            com.google.android.exoplayer2.analytics.PlaybackSessionManager r1 = r0.sessionManager
            java.lang.String r1 = r1.getActiveSessionId()
            r0.discontinuityFromSession = r1
            long r1 = r2.positionMs
            r0.discontinuityFromPositionMs = r1
        L10:
            r0.discontinuityReason = r4
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onRenderedFirstFrame(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Object r2, long r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onRenderedFirstFrame(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onRepeatModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onRepeatModeChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekBackIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSeekBackIncrementChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekForwardIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSeekForwardIncrementChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekProcessed(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSeekProcessed(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSeekStarted(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionActive(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2) {
            r0 = this;
            java.util.Map<java.lang.String, com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker> r1 = r0.playbackStatsTrackers
            java.lang.Object r1 = r1.get(r2)
            com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker r1 = (com.google.android.exoplayer2.analytics.PlaybackStatsListener.PlaybackStatsTracker) r1
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker r1 = (com.google.android.exoplayer2.analytics.PlaybackStatsListener.PlaybackStatsTracker) r1
            r1.onForeground()
            return
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionCreated(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r3, java.lang.String r4) {
            r2 = this;
            com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker r0 = new com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker
            boolean r1 = r2.keepHistory
            r0.<init>(r1, r3)
            java.util.Map<java.lang.String, com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker> r1 = r2.playbackStatsTrackers
            r1.put(r4, r0)
            java.util.Map<java.lang.String, com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime> r0 = r2.sessionStartEventTimes
            r0.put(r4, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionFinished(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r5, java.lang.String r6, boolean r7) {
            r4 = this;
            java.util.Map<java.lang.String, com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker> r0 = r4.playbackStatsTrackers
            java.lang.Object r0 = r0.remove(r6)
            com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker r0 = (com.google.android.exoplayer2.analytics.PlaybackStatsListener.PlaybackStatsTracker) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.analytics.PlaybackStatsListener$PlaybackStatsTracker r0 = (com.google.android.exoplayer2.analytics.PlaybackStatsListener.PlaybackStatsTracker) r0
            java.util.Map<java.lang.String, com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime> r1 = r4.sessionStartEventTimes
            java.lang.Object r1 = r1.remove(r6)
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r1 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r1
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r1 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r1
            java.lang.String r2 = r4.discontinuityFromSession
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L27
            long r2 = r4.discontinuityFromPositionMs
            goto L2c
        L27:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L2c:
            r0.onFinished(r5, r7, r2)
            r5 = 1
            com.google.android.exoplayer2.analytics.PlaybackStats r6 = r0.build(r5)
            r7 = 2
            com.google.android.exoplayer2.analytics.PlaybackStats[] r7 = new com.google.android.exoplayer2.analytics.PlaybackStats[r7]
            r0 = 0
            com.google.android.exoplayer2.analytics.PlaybackStats r2 = r4.finishedPlaybackStats
            r7[r0] = r2
            r7[r5] = r6
            com.google.android.exoplayer2.analytics.PlaybackStats r5 = com.google.android.exoplayer2.analytics.PlaybackStats.merge(r7)
            r4.finishedPlaybackStats = r5
            com.google.android.exoplayer2.analytics.PlaybackStatsListener$Callback r5 = r4.callback
            if (r5 == 0) goto L4b
            r5.onPlaybackStatsReady(r1, r6)
        L4b:
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onShuffleModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onShuffleModeChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onSkipSilenceEnabledChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSkipSilenceEnabledChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onSurfaceSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, int r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSurfaceSizeChanged(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onTimelineChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onTimelineChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onTrackSelectionParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onTrackSelectionParametersChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onTracksChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Tracks r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onTracksChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onUpstreamDiscarded(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.MediaLoadData r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onUpstreamDiscarded(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoCodecError(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoDecoderInitialized(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3, long r5) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoDecoderInitialized(r0, r1, r2, r3, r5)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoDecoderReleased(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoDisabled(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoEnabled(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoFrameProcessingOffset(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2, int r4) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoFrameProcessingOffset(r0, r1, r2, r4)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoInputFormatChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoInputFormatChanged(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, int r3, int r4, float r5) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoSizeChanged(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.video.VideoSize r2) {
            r0 = this;
            r0.videoSize = r2
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, float r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVolumeChanged(r0, r1, r2)
            return
    }
}
