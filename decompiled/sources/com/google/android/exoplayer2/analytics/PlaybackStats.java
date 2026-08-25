package com.google.android.exoplayer2.analytics;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaybackStats {
    public static final com.google.android.exoplayer2.analytics.PlaybackStats EMPTY = null;
    public static final int PLAYBACK_STATE_ABANDONED = 15;
    public static final int PLAYBACK_STATE_BUFFERING = 6;
    public static final int PLAYBACK_STATE_ENDED = 11;
    public static final int PLAYBACK_STATE_FAILED = 13;
    public static final int PLAYBACK_STATE_INTERRUPTED_BY_AD = 14;
    public static final int PLAYBACK_STATE_JOINING_BACKGROUND = 1;
    public static final int PLAYBACK_STATE_JOINING_FOREGROUND = 2;
    public static final int PLAYBACK_STATE_NOT_STARTED = 0;
    public static final int PLAYBACK_STATE_PAUSED = 4;
    public static final int PLAYBACK_STATE_PAUSED_BUFFERING = 7;
    public static final int PLAYBACK_STATE_PLAYING = 3;
    public static final int PLAYBACK_STATE_SEEKING = 5;
    public static final int PLAYBACK_STATE_STOPPED = 12;
    public static final int PLAYBACK_STATE_SUPPRESSED = 9;
    public static final int PLAYBACK_STATE_SUPPRESSED_BUFFERING = 10;
    public final int abandonedBeforeReadyCount;
    public final int adPlaybackCount;
    public final java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndFormat> audioFormatHistory;
    public final int backgroundJoiningCount;
    public final int endedCount;
    public final int fatalErrorCount;
    public final java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndException> fatalErrorHistory;
    public final int fatalErrorPlaybackCount;
    public final long firstReportedTimeMs;
    public final int foregroundPlaybackCount;
    public final int initialAudioFormatBitrateCount;
    public final int initialVideoFormatBitrateCount;
    public final int initialVideoFormatHeightCount;
    public final long maxRebufferTimeMs;
    public final java.util.List<long[]> mediaTimeHistory;
    public final int nonFatalErrorCount;
    public final java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndException> nonFatalErrorHistory;
    public final int playbackCount;
    private final long[] playbackStateDurationsMs;
    public final java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndPlaybackState> playbackStateHistory;
    public final long totalAudioFormatBitrateTimeProduct;
    public final long totalAudioFormatTimeMs;
    public final long totalAudioUnderruns;
    public final long totalBandwidthBytes;
    public final long totalBandwidthTimeMs;
    public final long totalDroppedFrames;
    public final long totalInitialAudioFormatBitrate;
    public final long totalInitialVideoFormatBitrate;
    public final int totalInitialVideoFormatHeight;
    public final int totalPauseBufferCount;
    public final int totalPauseCount;
    public final int totalRebufferCount;
    public final int totalSeekCount;
    public final long totalValidJoinTimeMs;
    public final long totalVideoFormatBitrateTimeMs;
    public final long totalVideoFormatBitrateTimeProduct;
    public final long totalVideoFormatHeightTimeMs;
    public final long totalVideoFormatHeightTimeProduct;
    public final int validJoinTimeCount;
    public final java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndFormat> videoFormatHistory;

    /* JADX INFO: loaded from: classes.dex */
    public static final class EventTimeAndException {
        public final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime;
        public final java.lang.Exception exception;

        public EventTimeAndException(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2) {
                r0 = this;
                r0.<init>()
                r0.eventTime = r1
                r0.exception = r2
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
                r3 = this;
                if (r3 != r4) goto L4
                r4 = 1
                return r4
            L4:
                r0 = 0
                if (r4 == 0) goto L26
                java.lang.Class<com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndException> r1 = com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndException.class
                java.lang.Class r2 = r4.getClass()
                if (r1 == r2) goto L10
                goto L26
            L10:
                com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndException r4 = (com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndException) r4
                com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r1 = r3.eventTime
                com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r4.eventTime
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L1d
                return r0
            L1d:
                java.lang.Exception r0 = r3.exception
                java.lang.Exception r4 = r4.exception
                boolean r4 = r0.equals(r4)
                return r4
            L26:
                return r0
        }

        public int hashCode() {
                r2 = this;
                com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r2.eventTime
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.Exception r1 = r2.exception
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }
    }

    public static final class EventTimeAndFormat {
        public final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.Format format;

        public EventTimeAndFormat(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r2) {
                r0 = this;
                r0.<init>()
                r0.eventTime = r1
                r0.format = r2
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L2d
                java.lang.Class<com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndFormat> r2 = com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndFormat.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L2d
            L10:
                com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndFormat r5 = (com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndFormat) r5
                com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r4.eventTime
                com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r3 = r5.eventTime
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L1d
                return r1
            L1d:
                com.google.android.exoplayer2.Format r2 = r4.format
                com.google.android.exoplayer2.Format r5 = r5.format
                if (r2 == 0) goto L28
                boolean r0 = r2.equals(r5)
                goto L2c
            L28:
                if (r5 != 0) goto L2b
                goto L2c
            L2b:
                r0 = 0
            L2c:
                return r0
            L2d:
                return r1
        }

        public int hashCode() {
                r2 = this;
                com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r2.eventTime
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                com.google.android.exoplayer2.Format r1 = r2.format
                if (r1 == 0) goto L11
                int r1 = r1.hashCode()
                goto L12
            L11:
                r1 = 0
            L12:
                int r0 = r0 + r1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class EventTimeAndPlaybackState {
        public final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime;
        public final int playbackState;

        public EventTimeAndPlaybackState(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.eventTime = r1
                r0.playbackState = r2
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
                r3 = this;
                if (r3 != r4) goto L4
                r4 = 1
                return r4
            L4:
                r0 = 0
                if (r4 == 0) goto L22
                java.lang.Class<com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndPlaybackState> r1 = com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndPlaybackState.class
                java.lang.Class r2 = r4.getClass()
                if (r1 == r2) goto L10
                goto L22
            L10:
                com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndPlaybackState r4 = (com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndPlaybackState) r4
                int r1 = r3.playbackState
                int r2 = r4.playbackState
                if (r1 == r2) goto L19
                return r0
            L19:
                com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.eventTime
                com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r4 = r4.eventTime
                boolean r4 = r0.equals(r4)
                return r4
            L22:
                return r0
        }

        public int hashCode() {
                r2 = this;
                com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r2.eventTime
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int r1 = r2.playbackState
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            r0 = 0
            com.google.android.exoplayer2.analytics.PlaybackStats[] r0 = new com.google.android.exoplayer2.analytics.PlaybackStats[r0]
            com.google.android.exoplayer2.analytics.PlaybackStats r0 = merge(r0)
            com.google.android.exoplayer2.analytics.PlaybackStats.EMPTY = r0
            return
    }

    public PlaybackStats(int r4, long[] r5, java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndPlaybackState> r6, java.util.List<long[]> r7, long r8, int r10, int r11, int r12, int r13, long r14, int r16, int r17, int r18, int r19, int r20, long r21, int r23, java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndFormat> r24, java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndFormat> r25, long r26, long r28, long r30, long r32, long r34, long r36, int r38, int r39, int r40, long r41, int r43, long r44, long r46, long r48, long r50, long r52, int r54, int r55, int r56, java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndException> r57, java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndException> r58) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.playbackCount = r1
            r1 = r5
            r0.playbackStateDurationsMs = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r6)
            r0.playbackStateHistory = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r7)
            r0.mediaTimeHistory = r1
            r1 = r8
            r0.firstReportedTimeMs = r1
            r1 = r10
            r0.foregroundPlaybackCount = r1
            r1 = r11
            r0.abandonedBeforeReadyCount = r1
            r1 = r12
            r0.endedCount = r1
            r1 = r13
            r0.backgroundJoiningCount = r1
            r1 = r14
            r0.totalValidJoinTimeMs = r1
            r1 = r16
            r0.validJoinTimeCount = r1
            r1 = r17
            r0.totalPauseCount = r1
            r1 = r18
            r0.totalPauseBufferCount = r1
            r1 = r19
            r0.totalSeekCount = r1
            r1 = r20
            r0.totalRebufferCount = r1
            r1 = r21
            r0.maxRebufferTimeMs = r1
            r1 = r23
            r0.adPlaybackCount = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r24)
            r0.videoFormatHistory = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r25)
            r0.audioFormatHistory = r1
            r1 = r26
            r0.totalVideoFormatHeightTimeMs = r1
            r1 = r28
            r0.totalVideoFormatHeightTimeProduct = r1
            r1 = r30
            r0.totalVideoFormatBitrateTimeMs = r1
            r1 = r32
            r0.totalVideoFormatBitrateTimeProduct = r1
            r1 = r34
            r0.totalAudioFormatTimeMs = r1
            r1 = r36
            r0.totalAudioFormatBitrateTimeProduct = r1
            r1 = r38
            r0.initialVideoFormatHeightCount = r1
            r1 = r39
            r0.initialVideoFormatBitrateCount = r1
            r1 = r40
            r0.totalInitialVideoFormatHeight = r1
            r1 = r41
            r0.totalInitialVideoFormatBitrate = r1
            r1 = r43
            r0.initialAudioFormatBitrateCount = r1
            r1 = r44
            r0.totalInitialAudioFormatBitrate = r1
            r1 = r46
            r0.totalBandwidthTimeMs = r1
            r1 = r48
            r0.totalBandwidthBytes = r1
            r1 = r50
            r0.totalDroppedFrames = r1
            r1 = r52
            r0.totalAudioUnderruns = r1
            r1 = r54
            r0.fatalErrorPlaybackCount = r1
            r1 = r55
            r0.fatalErrorCount = r1
            r1 = r56
            r0.nonFatalErrorCount = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r57)
            r0.fatalErrorHistory = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r58)
            r0.nonFatalErrorHistory = r1
            return
    }

    public static com.google.android.exoplayer2.analytics.PlaybackStats merge(com.google.android.exoplayer2.analytics.PlaybackStats... r66) {
            r0 = r66
            r1 = 16
            long[] r4 = new long[r1]
            int r2 = r0.length
            r9 = 0
            r27 = r9
            r29 = r27
            r31 = r29
            r33 = r31
            r35 = r33
            r37 = r35
            r46 = r37
            r48 = r46
            r50 = r48
            r52 = r50
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r25 = 0
            r26 = 0
            r39 = 0
            r40 = 0
            r41 = -1
            r43 = 0
            r44 = -1
            r54 = 0
            r55 = 0
            r58 = -1
            r59 = 0
        L51:
            if (r11 >= r2) goto L156
            r3 = r0[r11]
            int r7 = r3.playbackCount
            int r9 = r9 + r7
            r7 = 0
        L59:
            if (r7 >= r1) goto L68
            r62 = r4[r7]
            long[] r8 = r3.playbackStateDurationsMs
            r64 = r8[r7]
            long r62 = r62 + r64
            r4[r7] = r62
            int r7 = r7 + 1
            goto L59
        L68:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r60 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r60 != 0) goto L76
            long r12 = r3.firstReportedTimeMs
            r63 = r2
            goto L82
        L76:
            r63 = r2
            long r1 = r3.firstReportedTimeMs
            int r64 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r64 == 0) goto L82
            long r12 = java.lang.Math.min(r12, r1)
        L82:
            int r1 = r3.foregroundPlaybackCount
            int r10 = r10 + r1
            int r1 = r3.abandonedBeforeReadyCount
            int r14 = r14 + r1
            int r1 = r3.endedCount
            int r15 = r15 + r1
            int r1 = r3.backgroundJoiningCount
            int r16 = r16 + r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r7 != 0) goto L9d
            long r7 = r3.totalValidJoinTimeMs
            r17 = r7
            goto La5
        L9d:
            long r7 = r3.totalValidJoinTimeMs
            int r64 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r64 == 0) goto La5
            long r17 = r17 + r7
        La5:
            int r1 = r3.validJoinTimeCount
            int r19 = r19 + r1
            int r1 = r3.totalPauseCount
            int r20 = r20 + r1
            int r1 = r3.totalPauseBufferCount
            int r21 = r21 + r1
            int r1 = r3.totalSeekCount
            int r22 = r22 + r1
            int r1 = r3.totalRebufferCount
            int r25 = r25 + r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 != 0) goto Lc5
            long r5 = r3.maxRebufferTimeMs
            goto Lcf
        Lc5:
            long r7 = r3.maxRebufferTimeMs
            int r60 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r60 == 0) goto Lcf
            long r5 = java.lang.Math.max(r5, r7)
        Lcf:
            int r7 = r3.adPlaybackCount
            int r26 = r26 + r7
            long r7 = r3.totalVideoFormatHeightTimeMs
            long r27 = r27 + r7
            long r7 = r3.totalVideoFormatHeightTimeProduct
            long r29 = r29 + r7
            long r7 = r3.totalVideoFormatBitrateTimeMs
            long r31 = r31 + r7
            long r7 = r3.totalVideoFormatBitrateTimeProduct
            long r33 = r33 + r7
            long r7 = r3.totalAudioFormatTimeMs
            long r35 = r35 + r7
            long r7 = r3.totalAudioFormatBitrateTimeProduct
            long r37 = r37 + r7
            int r7 = r3.initialVideoFormatHeightCount
            int r39 = r39 + r7
            int r7 = r3.initialVideoFormatBitrateCount
            int r40 = r40 + r7
            r7 = r58
            r8 = -1
            if (r7 != r8) goto Lfb
            int r7 = r3.totalInitialVideoFormatHeight
            goto L102
        Lfb:
            int r1 = r3.totalInitialVideoFormatHeight
            if (r1 == r8) goto L102
            int r58 = r7 + r1
            goto L104
        L102:
            r58 = r7
        L104:
            r1 = -1
            int r7 = (r41 > r1 ? 1 : (r41 == r1 ? 0 : -1))
            if (r7 != 0) goto L111
            r23 = r9
            long r8 = r3.totalInitialVideoFormatBitrate
            r41 = r8
            goto L11b
        L111:
            r23 = r9
            long r7 = r3.totalInitialVideoFormatBitrate
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 == 0) goto L11b
            long r41 = r41 + r7
        L11b:
            int r7 = r3.initialAudioFormatBitrateCount
            int r43 = r43 + r7
            int r7 = (r44 > r1 ? 1 : (r44 == r1 ? 0 : -1))
            if (r7 != 0) goto L128
            long r7 = r3.totalInitialAudioFormatBitrate
            r44 = r7
            goto L130
        L128:
            long r7 = r3.totalInitialAudioFormatBitrate
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 == 0) goto L130
            long r44 = r44 + r7
        L130:
            long r7 = r3.totalBandwidthTimeMs
            long r46 = r46 + r7
            long r7 = r3.totalBandwidthBytes
            long r48 = r48 + r7
            long r7 = r3.totalDroppedFrames
            long r50 = r50 + r7
            long r7 = r3.totalAudioUnderruns
            long r52 = r52 + r7
            int r7 = r3.fatalErrorPlaybackCount
            int r54 = r54 + r7
            int r7 = r3.fatalErrorCount
            int r55 = r55 + r7
            int r3 = r3.nonFatalErrorCount
            int r59 = r59 + r3
            int r11 = r11 + 1
            r9 = r23
            r2 = r63
            r1 = 16
            goto L51
        L156:
            r7 = r58
            com.google.android.exoplayer2.analytics.PlaybackStats r0 = new com.google.android.exoplayer2.analytics.PlaybackStats
            r2 = r0
            java.util.List r1 = java.util.Collections.emptyList()
            r60 = r5
            r5 = r1
            java.util.List r6 = java.util.Collections.emptyList()
            java.util.List r23 = java.util.Collections.emptyList()
            java.util.List r24 = java.util.Collections.emptyList()
            java.util.List r56 = java.util.Collections.emptyList()
            java.util.List r57 = java.util.Collections.emptyList()
            r3 = r9
            r7 = r12
            r9 = r10
            r10 = r14
            r11 = r15
            r12 = r16
            r13 = r17
            r15 = r19
            r16 = r20
            r17 = r21
            r18 = r22
            r19 = r25
            r20 = r60
            r22 = r26
            r25 = r27
            r27 = r29
            r29 = r31
            r31 = r33
            r33 = r35
            r35 = r37
            r37 = r39
            r38 = r40
            r39 = r58
            r40 = r41
            r42 = r43
            r43 = r44
            r45 = r46
            r47 = r48
            r49 = r50
            r51 = r52
            r53 = r54
            r54 = r55
            r55 = r59
            r2.<init>(r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25, r27, r29, r31, r33, r35, r37, r38, r39, r40, r42, r43, r45, r47, r49, r51, r53, r54, r55, r56, r57)
            return r0
    }

    public float getAbandonedBeforeReadyRatio() {
            r3 = this;
            int r0 = r3.abandonedBeforeReadyCount
            int r1 = r3.playbackCount
            int r2 = r3.foregroundPlaybackCount
            int r1 = r1 - r2
            int r0 = r0 - r1
            if (r2 != 0) goto Lc
            r0 = 0
            goto Lf
        Lc:
            float r0 = (float) r0
            float r1 = (float) r2
            float r0 = r0 / r1
        Lf:
            return r0
    }

    public float getAudioUnderrunRate() {
            r5 = this;
            long r0 = r5.getTotalPlayTimeMs()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r0 = 0
            goto L16
        Lc:
            r2 = 1148846080(0x447a0000, float:1000.0)
            long r3 = r5.totalAudioUnderruns
            float r3 = (float) r3
            float r3 = r3 * r2
            float r0 = (float) r0
            float r0 = r3 / r0
        L16:
            return r0
    }

    public float getDroppedFramesRate() {
            r5 = this;
            long r0 = r5.getTotalPlayTimeMs()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r0 = 0
            goto L16
        Lc:
            r2 = 1148846080(0x447a0000, float:1000.0)
            long r3 = r5.totalDroppedFrames
            float r3 = (float) r3
            float r3 = r3 * r2
            float r0 = (float) r0
            float r0 = r3 / r0
        L16:
            return r0
    }

    public float getEndedRatio() {
            r2 = this;
            int r0 = r2.foregroundPlaybackCount
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            int r1 = r2.endedCount
            float r1 = (float) r1
            float r0 = (float) r0
            float r0 = r1 / r0
        Lc:
            return r0
    }

    public float getFatalErrorRate() {
            r5 = this;
            long r0 = r5.getTotalPlayTimeMs()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r0 = 0
            goto L16
        Lc:
            r2 = 1148846080(0x447a0000, float:1000.0)
            int r3 = r5.fatalErrorCount
            float r3 = (float) r3
            float r3 = r3 * r2
            float r0 = (float) r0
            float r0 = r3 / r0
        L16:
            return r0
    }

    public float getFatalErrorRatio() {
            r2 = this;
            int r0 = r2.foregroundPlaybackCount
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            int r1 = r2.fatalErrorPlaybackCount
            float r1 = (float) r1
            float r0 = (float) r0
            float r0 = r1 / r0
        Lc:
            return r0
    }

    public float getJoinTimeRatio() {
            r5 = this;
            long r0 = r5.getTotalPlayAndWaitTimeMs()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r0 = 0
            goto L14
        Lc:
            long r2 = r5.getTotalJoinTimeMs()
            float r2 = (float) r2
            float r0 = (float) r0
            float r0 = r2 / r0
        L14:
            return r0
    }

    public int getMeanAudioFormatBitrate() {
            r5 = this;
            long r0 = r5.totalAudioFormatTimeMs
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = -1
            goto Le
        La:
            long r2 = r5.totalAudioFormatBitrateTimeProduct
            long r2 = r2 / r0
            int r0 = (int) r2
        Le:
            return r0
    }

    public int getMeanBandwidth() {
            r6 = this;
            long r0 = r6.totalBandwidthTimeMs
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = -1
            goto L12
        La:
            long r2 = r6.totalBandwidthBytes
            r4 = 8000(0x1f40, double:3.9525E-320)
            long r2 = r2 * r4
            long r2 = r2 / r0
            int r0 = (int) r2
        L12:
            return r0
    }

    public long getMeanElapsedTimeMs() {
            r4 = this;
            int r0 = r4.playbackCount
            if (r0 != 0) goto La
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L12
        La:
            long r0 = r4.getTotalElapsedTimeMs()
            int r2 = r4.playbackCount
            long r2 = (long) r2
            long r0 = r0 / r2
        L12:
            return r0
    }

    public int getMeanInitialAudioFormatBitrate() {
            r5 = this;
            int r0 = r5.initialAudioFormatBitrateCount
            if (r0 != 0) goto L6
            r0 = -1
            goto Lb
        L6:
            long r1 = r5.totalInitialAudioFormatBitrate
            long r3 = (long) r0
            long r1 = r1 / r3
            int r0 = (int) r1
        Lb:
            return r0
    }

    public int getMeanInitialVideoFormatBitrate() {
            r5 = this;
            int r0 = r5.initialVideoFormatBitrateCount
            if (r0 != 0) goto L6
            r0 = -1
            goto Lb
        L6:
            long r1 = r5.totalInitialVideoFormatBitrate
            long r3 = (long) r0
            long r1 = r1 / r3
            int r0 = (int) r1
        Lb:
            return r0
    }

    public int getMeanInitialVideoFormatHeight() {
            r2 = this;
            int r0 = r2.initialVideoFormatHeightCount
            if (r0 != 0) goto L6
            r0 = -1
            goto La
        L6:
            int r1 = r2.totalInitialVideoFormatHeight
            int r0 = r1 / r0
        La:
            return r0
    }

    public long getMeanJoinTimeMs() {
            r5 = this;
            int r0 = r5.validJoinTimeCount
            if (r0 != 0) goto La
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto Lf
        La:
            long r1 = r5.totalValidJoinTimeMs
            long r3 = (long) r0
            long r0 = r1 / r3
        Lf:
            return r0
    }

    public float getMeanNonFatalErrorCount() {
            r2 = this;
            int r0 = r2.foregroundPlaybackCount
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            int r1 = r2.nonFatalErrorCount
            float r1 = (float) r1
            float r0 = (float) r0
            float r0 = r1 / r0
        Lc:
            return r0
    }

    public float getMeanPauseBufferCount() {
            r2 = this;
            int r0 = r2.foregroundPlaybackCount
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            int r1 = r2.totalPauseBufferCount
            float r1 = (float) r1
            float r0 = (float) r0
            float r0 = r1 / r0
        Lc:
            return r0
    }

    public float getMeanPauseCount() {
            r2 = this;
            int r0 = r2.foregroundPlaybackCount
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            int r1 = r2.totalPauseCount
            float r1 = (float) r1
            float r0 = (float) r0
            float r0 = r1 / r0
        Lc:
            return r0
    }

    public long getMeanPausedTimeMs() {
            r4 = this;
            int r0 = r4.foregroundPlaybackCount
            if (r0 != 0) goto La
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L12
        La:
            long r0 = r4.getTotalPausedTimeMs()
            int r2 = r4.foregroundPlaybackCount
            long r2 = (long) r2
            long r0 = r0 / r2
        L12:
            return r0
    }

    public long getMeanPlayAndWaitTimeMs() {
            r4 = this;
            int r0 = r4.foregroundPlaybackCount
            if (r0 != 0) goto La
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L12
        La:
            long r0 = r4.getTotalPlayAndWaitTimeMs()
            int r2 = r4.foregroundPlaybackCount
            long r2 = (long) r2
            long r0 = r0 / r2
        L12:
            return r0
    }

    public long getMeanPlayTimeMs() {
            r4 = this;
            int r0 = r4.foregroundPlaybackCount
            if (r0 != 0) goto La
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L12
        La:
            long r0 = r4.getTotalPlayTimeMs()
            int r2 = r4.foregroundPlaybackCount
            long r2 = (long) r2
            long r0 = r0 / r2
        L12:
            return r0
    }

    public float getMeanRebufferCount() {
            r2 = this;
            int r0 = r2.foregroundPlaybackCount
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            int r1 = r2.totalRebufferCount
            float r1 = (float) r1
            float r0 = (float) r0
            float r0 = r1 / r0
        Lc:
            return r0
    }

    public long getMeanRebufferTimeMs() {
            r4 = this;
            int r0 = r4.foregroundPlaybackCount
            if (r0 != 0) goto La
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L12
        La:
            long r0 = r4.getTotalRebufferTimeMs()
            int r2 = r4.foregroundPlaybackCount
            long r2 = (long) r2
            long r0 = r0 / r2
        L12:
            return r0
    }

    public float getMeanSeekCount() {
            r2 = this;
            int r0 = r2.foregroundPlaybackCount
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            int r1 = r2.totalSeekCount
            float r1 = (float) r1
            float r0 = (float) r0
            float r0 = r1 / r0
        Lc:
            return r0
    }

    public long getMeanSeekTimeMs() {
            r4 = this;
            int r0 = r4.foregroundPlaybackCount
            if (r0 != 0) goto La
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L12
        La:
            long r0 = r4.getTotalSeekTimeMs()
            int r2 = r4.foregroundPlaybackCount
            long r2 = (long) r2
            long r0 = r0 / r2
        L12:
            return r0
    }

    public long getMeanSingleRebufferTimeMs() {
            r4 = this;
            int r0 = r4.totalRebufferCount
            if (r0 != 0) goto La
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L1a
        La:
            r0 = 6
            long r0 = r4.getPlaybackStateDurationMs(r0)
            r2 = 7
            long r2 = r4.getPlaybackStateDurationMs(r2)
            long r2 = r2 + r0
            int r0 = r4.totalRebufferCount
            long r0 = (long) r0
            long r0 = r2 / r0
        L1a:
            return r0
    }

    public long getMeanSingleSeekTimeMs() {
            r4 = this;
            int r0 = r4.totalSeekCount
            if (r0 != 0) goto La
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L12
        La:
            long r0 = r4.getTotalSeekTimeMs()
            int r2 = r4.totalSeekCount
            long r2 = (long) r2
            long r0 = r0 / r2
        L12:
            return r0
    }

    public float getMeanTimeBetweenFatalErrors() {
            r2 = this;
            float r0 = r2.getFatalErrorRate()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r0
            return r1
    }

    public float getMeanTimeBetweenNonFatalErrors() {
            r2 = this;
            float r0 = r2.getNonFatalErrorRate()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r0
            return r1
    }

    public float getMeanTimeBetweenRebuffers() {
            r2 = this;
            float r0 = r2.getRebufferRate()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r0
            return r1
    }

    public int getMeanVideoFormatBitrate() {
            r5 = this;
            long r0 = r5.totalVideoFormatBitrateTimeMs
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = -1
            goto Le
        La:
            long r2 = r5.totalVideoFormatBitrateTimeProduct
            long r2 = r2 / r0
            int r0 = (int) r2
        Le:
            return r0
    }

    public int getMeanVideoFormatHeight() {
            r5 = this;
            long r0 = r5.totalVideoFormatHeightTimeMs
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = -1
            goto Le
        La:
            long r2 = r5.totalVideoFormatHeightTimeProduct
            long r2 = r2 / r0
            int r0 = (int) r2
        Le:
            return r0
    }

    public long getMeanWaitTimeMs() {
            r4 = this;
            int r0 = r4.foregroundPlaybackCount
            if (r0 != 0) goto La
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L12
        La:
            long r0 = r4.getTotalWaitTimeMs()
            int r2 = r4.foregroundPlaybackCount
            long r2 = (long) r2
            long r0 = r0 / r2
        L12:
            return r0
    }

    public long getMediaTimeMsAtRealtimeMs(long r12) {
            r11 = this;
            java.util.List<long[]> r0 = r11.mediaTimeHistory
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r12
        Le:
            r0 = 0
            r1 = 0
        L10:
            java.util.List<long[]> r2 = r11.mediaTimeHistory
            int r2 = r2.size()
            if (r1 >= r2) goto L29
            java.util.List<long[]> r2 = r11.mediaTimeHistory
            java.lang.Object r2 = r2.get(r1)
            long[] r2 = (long[]) r2
            r3 = r2[r0]
            int r2 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r2 > 0) goto L29
            int r1 = r1 + 1
            goto L10
        L29:
            r2 = 1
            if (r1 != 0) goto L37
            java.util.List<long[]> r12 = r11.mediaTimeHistory
            java.lang.Object r12 = r12.get(r0)
            long[] r12 = (long[]) r12
            r0 = r12[r2]
            return r0
        L37:
            java.util.List<long[]> r3 = r11.mediaTimeHistory
            int r3 = r3.size()
            if (r1 != r3) goto L4f
            java.util.List<long[]> r12 = r11.mediaTimeHistory
            int r13 = r12.size()
            int r13 = r13 - r2
            java.lang.Object r12 = r12.get(r13)
            long[] r12 = (long[]) r12
            r0 = r12[r2]
            return r0
        L4f:
            java.util.List<long[]> r3 = r11.mediaTimeHistory
            int r4 = r1 + (-1)
            java.lang.Object r3 = r3.get(r4)
            long[] r3 = (long[]) r3
            r5 = r3[r0]
            java.util.List<long[]> r3 = r11.mediaTimeHistory
            java.lang.Object r3 = r3.get(r4)
            long[] r3 = (long[]) r3
            r7 = r3[r2]
            java.util.List<long[]> r3 = r11.mediaTimeHistory
            java.lang.Object r3 = r3.get(r1)
            long[] r3 = (long[]) r3
            r9 = r3[r0]
            java.util.List<long[]> r0 = r11.mediaTimeHistory
            java.lang.Object r0 = r0.get(r1)
            long[] r0 = (long[]) r0
            r1 = r0[r2]
            long r9 = r9 - r5
            r3 = 0
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L81
            return r7
        L81:
            long r12 = r12 - r5
            float r12 = (float) r12
            float r13 = (float) r9
            float r12 = r12 / r13
            long r1 = r1 - r7
            float r13 = (float) r1
            float r13 = r13 * r12
            long r12 = (long) r13
            long r7 = r7 + r12
            return r7
    }

    public float getNonFatalErrorRate() {
            r5 = this;
            long r0 = r5.getTotalPlayTimeMs()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r0 = 0
            goto L16
        Lc:
            r2 = 1148846080(0x447a0000, float:1000.0)
            int r3 = r5.nonFatalErrorCount
            float r3 = (float) r3
            float r3 = r3 * r2
            float r0 = (float) r0
            float r0 = r3 / r0
        L16:
            return r0
    }

    public int getPlaybackStateAtTime(long r7) {
            r6 = this;
            java.util.List<com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndPlaybackState> r0 = r6.playbackStateHistory
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r0.next()
            com.google.android.exoplayer2.analytics.PlaybackStats$EventTimeAndPlaybackState r2 = (com.google.android.exoplayer2.analytics.PlaybackStats.EventTimeAndPlaybackState) r2
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r3 = r2.eventTime
            long r3 = r3.realtimeMs
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 <= 0) goto L1c
            goto L1f
        L1c:
            int r1 = r2.playbackState
            goto L7
        L1f:
            return r1
    }

    public long getPlaybackStateDurationMs(int r4) {
            r3 = this;
            long[] r0 = r3.playbackStateDurationsMs
            r1 = r0[r4]
            return r1
    }

    public float getRebufferRate() {
            r5 = this;
            long r0 = r5.getTotalPlayTimeMs()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r0 = 0
            goto L16
        Lc:
            r2 = 1148846080(0x447a0000, float:1000.0)
            int r3 = r5.totalRebufferCount
            float r3 = (float) r3
            float r3 = r3 * r2
            float r0 = (float) r0
            float r0 = r3 / r0
        L16:
            return r0
    }

    public float getRebufferTimeRatio() {
            r5 = this;
            long r0 = r5.getTotalPlayAndWaitTimeMs()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r0 = 0
            goto L14
        Lc:
            long r2 = r5.getTotalRebufferTimeMs()
            float r2 = (float) r2
            float r0 = (float) r0
            float r0 = r2 / r0
        L14:
            return r0
    }

    public float getSeekTimeRatio() {
            r5 = this;
            long r0 = r5.getTotalPlayAndWaitTimeMs()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r0 = 0
            goto L14
        Lc:
            long r2 = r5.getTotalSeekTimeMs()
            float r2 = (float) r2
            float r0 = (float) r0
            float r0 = r2 / r0
        L14:
            return r0
    }

    public long getTotalElapsedTimeMs() {
            r6 = this;
            r0 = 0
            r2 = 0
        L3:
            r3 = 16
            if (r2 >= r3) goto Lf
            long[] r3 = r6.playbackStateDurationsMs
            r4 = r3[r2]
            long r0 = r0 + r4
            int r2 = r2 + 1
            goto L3
        Lf:
            return r0
    }

    public long getTotalJoinTimeMs() {
            r2 = this;
            r0 = 2
            long r0 = r2.getPlaybackStateDurationMs(r0)
            return r0
    }

    public long getTotalPausedTimeMs() {
            r4 = this;
            r0 = 4
            long r0 = r4.getPlaybackStateDurationMs(r0)
            r2 = 7
            long r2 = r4.getPlaybackStateDurationMs(r2)
            long r2 = r2 + r0
            return r2
    }

    public long getTotalPlayAndWaitTimeMs() {
            r4 = this;
            long r0 = r4.getTotalPlayTimeMs()
            long r2 = r4.getTotalWaitTimeMs()
            long r2 = r2 + r0
            return r2
    }

    public long getTotalPlayTimeMs() {
            r2 = this;
            r0 = 3
            long r0 = r2.getPlaybackStateDurationMs(r0)
            return r0
    }

    public long getTotalRebufferTimeMs() {
            r2 = this;
            r0 = 6
            long r0 = r2.getPlaybackStateDurationMs(r0)
            return r0
    }

    public long getTotalSeekTimeMs() {
            r2 = this;
            r0 = 5
            long r0 = r2.getPlaybackStateDurationMs(r0)
            return r0
    }

    public long getTotalWaitTimeMs() {
            r4 = this;
            r0 = 2
            long r0 = r4.getPlaybackStateDurationMs(r0)
            r2 = 6
            long r2 = r4.getPlaybackStateDurationMs(r2)
            long r2 = r2 + r0
            r0 = 5
            long r0 = r4.getPlaybackStateDurationMs(r0)
            long r0 = r0 + r2
            return r0
    }

    public float getWaitTimeRatio() {
            r5 = this;
            long r0 = r5.getTotalPlayAndWaitTimeMs()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r0 = 0
            goto L14
        Lc:
            long r2 = r5.getTotalWaitTimeMs()
            float r2 = (float) r2
            float r0 = (float) r0
            float r0 = r2 / r0
        L14:
            return r0
    }
}
