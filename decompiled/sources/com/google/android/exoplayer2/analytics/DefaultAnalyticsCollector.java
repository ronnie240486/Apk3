package com.google.android.exoplayer2.analytics;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultAnalyticsCollector implements com.google.android.exoplayer2.analytics.AnalyticsCollector {
    private final com.google.android.exoplayer2.util.Clock clock;
    private final android.util.SparseArray<com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime> eventTimes;
    private com.google.android.exoplayer2.util.HandlerWrapper handler;
    private boolean isSeeking;
    private com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.analytics.AnalyticsListener> listeners;
    private final com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.MediaPeriodQueueTracker mediaPeriodQueueTracker;
    private final com.google.android.exoplayer2.Timeline.Period period;
    private com.google.android.exoplayer2.Player player;
    private final com.google.android.exoplayer2.Timeline.Window window;

    /* JADX INFO: loaded from: classes.dex */
    public static final class MediaPeriodQueueTracker {

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.source.MediaSource.MediaPeriodId currentPlayerMediaPeriod;
        private com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> mediaPeriodQueue;
        private com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId, com.google.android.exoplayer2.Timeline> mediaPeriodTimelines;
        private final com.google.android.exoplayer2.Timeline.Period period;
        private com.google.android.exoplayer2.source.MediaSource.MediaPeriodId playingMediaPeriod;
        private com.google.android.exoplayer2.source.MediaSource.MediaPeriodId readingMediaPeriod;

        public MediaPeriodQueueTracker(com.google.android.exoplayer2.Timeline.Period r1) {
                r0 = this;
                r0.<init>()
                r0.period = r1
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
                r0.mediaPeriodQueue = r1
                com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.of()
                r0.mediaPeriodTimelines = r1
                return
        }

        public static /* synthetic */ com.google.common.collect.ImmutableList access$000(com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.MediaPeriodQueueTracker r0) {
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r0 = r0.mediaPeriodQueue
                return r0
        }

        private void addTimelineForMediaPeriodId(com.google.common.collect.ImmutableMap.Builder<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId, com.google.android.exoplayer2.Timeline> r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4, com.google.android.exoplayer2.Timeline r5) {
                r2 = this;
                if (r4 != 0) goto L3
                return
            L3:
                java.lang.Object r0 = r4.periodUid
                int r0 = r5.getIndexOfPeriod(r0)
                r1 = -1
                if (r0 == r1) goto L10
                r3.put(r4, r5)
                goto L1d
            L10:
                com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, com.google.android.exoplayer2.Timeline> r5 = r2.mediaPeriodTimelines
                java.lang.Object r5 = r5.get(r4)
                com.google.android.exoplayer2.Timeline r5 = (com.google.android.exoplayer2.Timeline) r5
                if (r5 == 0) goto L1d
                r3.put(r4, r5)
            L1d:
                return
        }

        @androidx.annotation.Nullable
        private static com.google.android.exoplayer2.source.MediaSource.MediaPeriodId findCurrentPlayerMediaPeriodInQueue(com.google.android.exoplayer2.Player r10, com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> r11, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r12, com.google.android.exoplayer2.Timeline.Period r13) {
                com.google.android.exoplayer2.Timeline r0 = r10.getCurrentTimeline()
                int r1 = r10.getCurrentPeriodIndex()
                boolean r2 = r0.isEmpty()
                r3 = 0
                if (r2 == 0) goto L11
                r2 = r3
                goto L15
            L11:
                java.lang.Object r2 = r0.getUidOfPeriod(r1)
            L15:
                boolean r4 = r10.isPlayingAd()
                if (r4 != 0) goto L38
                boolean r4 = r0.isEmpty()
                if (r4 == 0) goto L22
                goto L38
            L22:
                com.google.android.exoplayer2.Timeline$Period r0 = r0.getPeriod(r1, r13)
                long r4 = r10.getCurrentPosition()
                long r4 = com.google.android.exoplayer2.util.Util.msToUs(r4)
                long r6 = r13.getPositionInWindowUs()
                long r4 = r4 - r6
                int r13 = r0.getAdGroupIndexAfterPositionUs(r4)
                goto L39
            L38:
                r13 = -1
            L39:
                r0 = 0
            L3a:
                int r1 = r11.size()
                if (r0 >= r1) goto L5f
                java.lang.Object r1 = r11.get(r0)
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r1
                boolean r6 = r10.isPlayingAd()
                int r7 = r10.getCurrentAdGroupIndex()
                int r8 = r10.getCurrentAdIndexInAdGroup()
                r4 = r1
                r5 = r2
                r9 = r13
                boolean r4 = isMatchingMediaPeriod(r4, r5, r6, r7, r8, r9)
                if (r4 == 0) goto L5c
                return r1
            L5c:
                int r0 = r0 + 1
                goto L3a
            L5f:
                boolean r11 = r11.isEmpty()
                if (r11 == 0) goto L7d
                if (r12 == 0) goto L7d
                boolean r6 = r10.isPlayingAd()
                int r7 = r10.getCurrentAdGroupIndex()
                int r8 = r10.getCurrentAdIndexInAdGroup()
                r4 = r12
                r5 = r2
                r9 = r13
                boolean r10 = isMatchingMediaPeriod(r4, r5, r6, r7, r8, r9)
                if (r10 == 0) goto L7d
                return r12
            L7d:
                return r3
        }

        private static boolean isMatchingMediaPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r1, @androidx.annotation.Nullable java.lang.Object r2, boolean r3, int r4, int r5, int r6) {
                java.lang.Object r0 = r1.periodUid
                boolean r2 = r0.equals(r2)
                r0 = 0
                if (r2 != 0) goto La
                return r0
            La:
                if (r3 == 0) goto L14
                int r2 = r1.adGroupIndex
                if (r2 != r4) goto L14
                int r2 = r1.adIndexInAdGroup
                if (r2 == r5) goto L1f
            L14:
                if (r3 != 0) goto L20
                int r2 = r1.adGroupIndex
                r3 = -1
                if (r2 != r3) goto L20
                int r1 = r1.nextAdGroupIndex
                if (r1 != r6) goto L20
            L1f:
                r0 = 1
            L20:
                return r0
        }

        private void updateMediaPeriodTimelines(com.google.android.exoplayer2.Timeline r4) {
                r3 = this;
                com.google.common.collect.ImmutableMap$Builder r0 = com.google.common.collect.ImmutableMap.builder()
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r1 = r3.mediaPeriodQueue
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L3a
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.playingMediaPeriod
                r3.addTimelineForMediaPeriodId(r0, r1, r4)
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.readingMediaPeriod
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r3.playingMediaPeriod
                boolean r1 = com.google.common.base.Objects.equal(r1, r2)
                if (r1 != 0) goto L20
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.readingMediaPeriod
                r3.addTimelineForMediaPeriodId(r0, r1, r4)
            L20:
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.currentPlayerMediaPeriod
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r3.playingMediaPeriod
                boolean r1 = com.google.common.base.Objects.equal(r1, r2)
                if (r1 != 0) goto L60
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.currentPlayerMediaPeriod
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r3.readingMediaPeriod
                boolean r1 = com.google.common.base.Objects.equal(r1, r2)
                if (r1 != 0) goto L60
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.currentPlayerMediaPeriod
                r3.addTimelineForMediaPeriodId(r0, r1, r4)
                goto L60
            L3a:
                r1 = 0
            L3b:
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r2 = r3.mediaPeriodQueue
                int r2 = r2.size()
                if (r1 >= r2) goto L51
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r2 = r3.mediaPeriodQueue
                java.lang.Object r2 = r2.get(r1)
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r2
                r3.addTimelineForMediaPeriodId(r0, r2, r4)
                int r1 = r1 + 1
                goto L3b
            L51:
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r1 = r3.mediaPeriodQueue
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r3.currentPlayerMediaPeriod
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L60
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.currentPlayerMediaPeriod
                r3.addTimelineForMediaPeriodId(r0, r1, r4)
            L60:
                com.google.common.collect.ImmutableMap r4 = r0.buildOrThrow()
                r3.mediaPeriodTimelines = r4
                return
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getCurrentPlayerMediaPeriod() {
                r1 = this;
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r1.currentPlayerMediaPeriod
                return r0
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getLoadingMediaPeriod() {
                r1 = this;
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r0 = r1.mediaPeriodQueue
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto La
                r0 = 0
                goto L12
            La:
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r0 = r1.mediaPeriodQueue
                java.lang.Object r0 = com.google.common.collect.Iterables.getLast(r0)
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r0
            L12:
                return r0
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.Timeline getMediaPeriodIdTimeline(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
                r1 = this;
                com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, com.google.android.exoplayer2.Timeline> r0 = r1.mediaPeriodTimelines
                java.lang.Object r2 = r0.get(r2)
                com.google.android.exoplayer2.Timeline r2 = (com.google.android.exoplayer2.Timeline) r2
                return r2
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getPlayingMediaPeriod() {
                r1 = this;
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r1.playingMediaPeriod
                return r0
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getReadingMediaPeriod() {
                r1 = this;
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r1.readingMediaPeriod
                return r0
        }

        public void onPositionDiscontinuity(com.google.android.exoplayer2.Player r4) {
                r3 = this;
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r0 = r3.mediaPeriodQueue
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.playingMediaPeriod
                com.google.android.exoplayer2.Timeline$Period r2 = r3.period
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = findCurrentPlayerMediaPeriodInQueue(r4, r0, r1, r2)
                r3.currentPlayerMediaPeriod = r4
                return
        }

        public void onQueueUpdated(java.util.List<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, com.google.android.exoplayer2.Player r4) {
                r1 = this;
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r2)
                r1.mediaPeriodQueue = r0
                boolean r0 = r2.isEmpty()
                if (r0 != 0) goto L1d
                r0 = 0
                java.lang.Object r2 = r2.get(r0)
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r2
                r1.playingMediaPeriod = r2
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r2
                r1.readingMediaPeriod = r2
            L1d:
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r1.currentPlayerMediaPeriod
                if (r2 != 0) goto L2d
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r2 = r1.mediaPeriodQueue
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r1.playingMediaPeriod
                com.google.android.exoplayer2.Timeline$Period r0 = r1.period
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = findCurrentPlayerMediaPeriodInQueue(r4, r2, r3, r0)
                r1.currentPlayerMediaPeriod = r2
            L2d:
                com.google.android.exoplayer2.Timeline r2 = r4.getCurrentTimeline()
                r1.updateMediaPeriodTimelines(r2)
                return
        }

        public void onTimelineChanged(com.google.android.exoplayer2.Player r4) {
                r3 = this;
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r0 = r3.mediaPeriodQueue
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.playingMediaPeriod
                com.google.android.exoplayer2.Timeline$Period r2 = r3.period
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = findCurrentPlayerMediaPeriodInQueue(r4, r0, r1, r2)
                r3.currentPlayerMediaPeriod = r0
                com.google.android.exoplayer2.Timeline r4 = r4.getCurrentTimeline()
                r3.updateMediaPeriodTimelines(r4)
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$3W_WU5ju0YxRbyI62nPF_VmL5V0(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.lang.Exception r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onAudioCodecError$11(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$4yfSm9_o-9ovFI635VzWE_Nvzq0, reason: not valid java name */
    public static /* synthetic */ void m186$r8$lambda$4yfSm9_o9ovFI635VzWE_Nvzq0(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, boolean r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            lambda$onDeviceVolumeChanged$60(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$5Jody8QeE0s3fpPThADOHwfcUeA(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, boolean r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onIsPlayingChanged$38(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$6w-cqYHJ0o-8Q1xTZ1zirqkmQ6E, reason: not valid java name */
    public static /* synthetic */ void m187$r8$lambda$6wcqYHJ0o8Q1xTZ1zirqkmQ6E(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.Format r1, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            lambda$onVideoInputFormatChanged$15(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$7NuGIS-xFssay_tsf4W_pDm1cGw, reason: not valid java name */
    public static /* synthetic */ void m188$r8$lambda$7NuGISxFssay_tsf4W_pDm1cGw(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, long r1, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            lambda$onSeekForwardIncrementChanged$46(r0, r1, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$7qCi01KBI5__9dONi6GjpRtM-Pc, reason: not valid java name */
    public static /* synthetic */ void m189$r8$lambda$7qCi01KBI5__9dONi6GjpRtMPc(com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector r0) {
            r0.releaseInternal()
            return
    }

    public static /* synthetic */ void $r8$lambda$9PcUfEE10y1wq2pg8zepwErgqQg(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onTrackSelectionParametersChanged$58(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$9cDI5CJcKhClEGb-M7ss9sTpw14, reason: not valid java name */
    public static /* synthetic */ void m190$r8$lambda$9cDI5CJcKhClEGbM7ss9sTpw14(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.video.VideoSize r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onVideoSizeChanged$57(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$A2Zz7oB6cKKpjdutb6jkAlQaMiY(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onRepeatModeChanged$39(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$AjPkxgSoiTph_gqjd5T0fLX2oyA(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.source.MediaLoadData r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onDownstreamFormatChanged$28(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$AtuUAVoUP6eIvypQ8S7VSA6r3ks(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, long r1, int r3, com.google.android.exoplayer2.analytics.AnalyticsListener r4) {
            lambda$onVideoFrameProcessingOffset$20(r0, r1, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$BwXNSUeyo28Z8ODlmQLe_cFnw_o(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.decoder.DecoderCounters r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onVideoDisabled$18(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$DE-UHU-2PmVnpKVL6LksbxRZhfs, reason: not valid java name */
    public static /* synthetic */ void m191$r8$lambda$DEUHU2PmVnpKVL6LksbxRZhfs(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.DeviceInfo r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onDeviceInfoChanged$59(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$ETVz_1ZtrlztJ3Z4boca9NuursA(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, boolean r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onShuffleModeEnabledChanged$40(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$H8i5eaxigAX5z13Xx0tx2vc7pbo(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, float r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onVolumeChanged$12(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$HZQLWpFWRvP-6ncDH2NKKE3LIlE, reason: not valid java name */
    public static /* synthetic */ void m192$r8$lambda$HZQLWpFWRvP6ncDH2NKKE3LIlE(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onAudioSessionIdChanged$55(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$IcDUEWV9HLvvqlI2fuIn4qTK4uA(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, boolean r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onSkipSilenceEnabledChanged$54(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$J_0K_rlutXmxPZQhmpO4oO69OrI(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.analytics.AnalyticsListener r1) {
            lambda$onDrmSessionReleased$67(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$KF5ejdvWdyFupDOS9HtrOevJ5sI(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.util.List r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onCues$51(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$L-kW7dl9SdUjzXpHRl67LaZUu-Q, reason: not valid java name */
    public static /* synthetic */ void m193$r8$lambda$LkW7dl9SdUjzXpHRl67LaZUuQ(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.PlaybackParameters r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onPlaybackParametersChanged$44(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$LG1mCVjkadAdSIiIWraD2wI1Hxw(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.MediaItem r1, int r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            lambda$onMediaItemTransition$30(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$LLwqmorKNa-vYdh5viTvRKYmDa4, reason: not valid java name */
    public static /* synthetic */ void m194$r8$lambda$LLwqmorKNavYdh5viTvRKYmDa4(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.PlaybackException r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onPlayerError$41(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$LiRVRN83WTguze2Ve3xPeEDez7A(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.MediaMetadata r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onPlaylistMetadataChanged$49(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$LmP-HW46QAQkyArhZ5_MOrM8uEE, reason: not valid java name */
    public static /* synthetic */ void m195$r8$lambda$LmPHW46QAQkyArhZ5_MOrM8uEE(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.lang.Exception r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onVideoCodecError$21(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$MVU3f5Pa6p6mi6MYnvySiNvJZDw(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.source.LoadEventInfo r1, com.google.android.exoplayer2.source.MediaLoadData r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            lambda$onLoadCompleted$24(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$MntCClo00nnS5efMb0vY_n5IRUE(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.analytics.AnalyticsListener r1) {
            lambda$releaseInternal$68(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$MuuIsPrsEMzwBEesER3eeYGrAKQ(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, long r1, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            lambda$onSeekBackIncrementChanged$45(r0, r1, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$NdBPAXdPfjuofkLwBdfhXC5LLuY(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, int r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            lambda$onSurfaceSizeChanged$22(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$QbgkE1Y9mPQW96MsF_Iq2KaWplE(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.source.MediaLoadData r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onUpstreamDiscarded$27(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$Ra2gm0EM2zPpFWo7eI17gUXR2UU(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.metadata.Metadata r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onMetadata$50(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$Sc3euoNFaSc0qTXQ1BJ-chuWXjo, reason: not valid java name */
    public static /* synthetic */ void m196$r8$lambda$Sc3euoNFaSc0qTXQ1BJchuWXjo(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onDrmSessionAcquired$62(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$Ssq3n7SqyXF5jQyR98wzLC_aXBc(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.Format r1, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            lambda$onAudioInputFormatChanged$5(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$UbkSD2LOR89Fj6o-5WOPAigui8E, reason: not valid java name */
    public static /* synthetic */ void m197$r8$lambda$UbkSD2LOR89Fj6o5WOPAigui8E(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.analytics.AnalyticsListener r1) {
            lambda$onDrmKeysLoaded$63(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Vh8fhUs3zupZ8HUCvzE4ugOkc4g(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.analytics.AnalyticsListener r1) {
            lambda$onSeekProcessed$53(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$WN9IGleVRF_Anir3pI-4AsE22yM, reason: not valid java name */
    public static /* synthetic */ void m198$r8$lambda$WN9IGleVRF_Anir3pI4AsE22yM(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.source.LoadEventInfo r1, com.google.android.exoplayer2.source.MediaLoadData r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            lambda$onLoadCanceled$25(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$Xpn20bMMnj0sZJocJOT-ENKP3-w, reason: not valid java name */
    public static /* synthetic */ void m199$r8$lambda$Xpn20bMMnj0sZJocJOTENKP3w(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, long r2, long r4, com.google.android.exoplayer2.analytics.AnalyticsListener r6) {
            lambda$onBandwidthSample$61(r0, r1, r2, r4, r6)
            return
    }

    public static /* synthetic */ void $r8$lambda$ZK4_AmILgQTSxRW19Njh1Wnnet0(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, com.google.android.exoplayer2.Player.PositionInfo r2, com.google.android.exoplayer2.Player.PositionInfo r3, com.google.android.exoplayer2.analytics.AnalyticsListener r4) {
            lambda$onPositionDiscontinuity$43(r0, r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$ZOIU5_MIMk5pqXWrc2k1FMH9ZgA(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.audio.AudioAttributes r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onAudioAttributesChanged$56(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$_2m68kfdIY-EVEkeWtL2eVzp0Kw, reason: not valid java name */
    public static /* synthetic */ void m200$r8$lambda$_2m68kfdIYEVEkeWtL2eVzp0Kw(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.source.LoadEventInfo r1, com.google.android.exoplayer2.source.MediaLoadData r2, java.io.IOException r3, boolean r4, com.google.android.exoplayer2.analytics.AnalyticsListener r5) {
            lambda$onLoadError$26(r0, r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$_hWNWhzoUNOsm5ugG-_dJjiB7SQ, reason: not valid java name */
    public static /* synthetic */ void m201$r8$lambda$_hWNWhzoUNOsm5ugG_dJjiB7SQ(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.text.CueGroup r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onCues$52(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$_xDQYmjr9lTsoa0f0ooXsXdD2M0(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.MediaMetadata r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onMediaMetadataChanged$48(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$aQPROM7dF72DvL0uB2jxj-HnAsA, reason: not valid java name */
    public static /* synthetic */ void m202$r8$lambda$aQPROM7dF72DvL0uB2jxjHnAsA(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, long r2, com.google.android.exoplayer2.analytics.AnalyticsListener r4) {
            lambda$onDroppedFrames$16(r0, r1, r2, r4)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$bXfCZULCVapttqhIJ-teakpmooQ, reason: not valid java name */
    public static /* synthetic */ void m203$r8$lambda$bXfCZULCVapttqhIJteakpmooQ(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.lang.Exception r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onAudioSinkError$10(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$ePESxtoqHvAKFhGvPrbD3Tznh0g(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.lang.String r1, long r2, long r4, com.google.android.exoplayer2.analytics.AnalyticsListener r6) {
            lambda$onAudioDecoderInitialized$4(r0, r1, r2, r4, r6)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$fIkgsua-M1QBc8sF9EID-uz9pqM, reason: not valid java name */
    public static /* synthetic */ void m204$r8$lambda$fIkgsuaM1QBc8sF9EIDuz9pqM(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.Player.Commands r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onAvailableCommandsChanged$33(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$gTOCHQfgJk-8MeJAihaDCuf3CjM, reason: not valid java name */
    public static /* synthetic */ void m205$r8$lambda$gTOCHQfgJk8MeJAihaDCuf3CjM(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.lang.String r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onVideoDecoderReleased$17(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ifz5aidqUgr1wT_-bltbVMx1AIk, reason: not valid java name */
    public static /* synthetic */ void m206$r8$lambda$ifz5aidqUgr1wT_bltbVMx1AIk(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, long r1, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            lambda$onMaxSeekToPreviousPositionChanged$47(r0, r1, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$lTPM1w4Z5pABUx_P3HWxh5vctXE(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, long r2, long r4, com.google.android.exoplayer2.analytics.AnalyticsListener r6) {
            lambda$onAudioUnderrun$7(r0, r1, r2, r4, r6)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$lY5WpyiG-j3QUc13M55xlPKs8Yc, reason: not valid java name */
    public static /* synthetic */ void m207$r8$lambda$lY5WpyiGj3QUc13M55xlPKs8Yc(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.analytics.AnalyticsListener r1) {
            lambda$onDrmKeysRemoved$66(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$lkvqeEzgj7KfOt7e4Gy4gEmedc8(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, boolean r1, int r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            lambda$onPlayWhenReadyChanged$36(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ncq4DyVAGeOIb-R9X1deT1IQd7s, reason: not valid java name */
    public static /* synthetic */ void m208$r8$lambda$ncq4DyVAGeOIbR9X1deT1IQd7s(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onPlaybackStateChanged$35(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$ngVZDNrELPlWsCVmG7J5GWL7oCA(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.Tracks r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onTracksChanged$31(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$oWhWRJSkiX8wPDOBxm69UGIrDfA(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.decoder.DecoderCounters r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onAudioDisabled$9(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$pXAYc8A6CNxzjLL0d0WgSHO0pNg(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onPlaybackSuppressionReasonChanged$37(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$png_gxpRsJhc4N3aEcHZAiZcKdE(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, boolean r1, int r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            lambda$onPlayerStateChanged$34(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$poOwK15F_cPJY2hGCVO7-cUwpzg, reason: not valid java name */
    public static /* synthetic */ void m209$r8$lambda$poOwK15F_cPJY2hGCVO7cUwpzg(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.source.LoadEventInfo r1, com.google.android.exoplayer2.source.MediaLoadData r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            lambda$onLoadStarted$23(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$pxOnINyG0tiDw-vIl59rK9pEtt8, reason: not valid java name */
    public static /* synthetic */ void m210$r8$lambda$pxOnINyG0tiDwvIl59rK9pEtt8(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.decoder.DecoderCounters r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onAudioEnabled$3(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$rXnNxHYJQdn3b3ePZAInm0rxlfM(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onTimelineChanged$29(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$s5kMgo3Ssey1sFKs6us9XFB_k_Y(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, boolean r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onIsLoadingChanged$32(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$sWkn4iHlwtwbFRkqMwXc3fWrMko(com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector r0, com.google.android.exoplayer2.Player r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2, com.google.android.exoplayer2.util.FlagSet r3) {
            r0.lambda$setPlayer$1(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$tx9Y_YHIUyJTe9NCO9PEXjYGMKg(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.util.FlagSet r1) {
            lambda$new$0(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$vusRBBslR1dtrmCT_phbth2eqfc(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.analytics.AnalyticsListener r1) {
            lambda$onDrmKeysRestored$65(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$wIYq1FQEfVm5RKenq9DGPAsg-A4, reason: not valid java name */
    public static /* synthetic */ void m211$r8$lambda$wIYq1FQEfVm5RKenq9DGPAsgA4(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, long r1, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            lambda$onAudioPositionAdvancing$6(r0, r1, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$wTUFVP_ljrRY_G0OCJLiIDeVEn8(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.decoder.DecoderCounters r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onVideoEnabled$13(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$whbF4WDkAikzAfSMY63VrlCfois(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.lang.String r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onAudioDecoderReleased$8(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$wscWH2Rsf6BPr501zad9b4YAk0w(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.lang.Object r1, long r2, com.google.android.exoplayer2.analytics.AnalyticsListener r4) {
            lambda$onRenderedFirstFrame$19(r0, r1, r2, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$xa8wb_tCFMZGxoYTizDWXrfvs4M(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.lang.Exception r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onDrmSessionManagerError$64(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$xf0eU_5DBrALUsLNOETsfHQHKdc(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.analytics.AnalyticsListener r1) {
            lambda$notifySeekStarted$2(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$yJKhKC8Ls39c64LK01PdJSmPxK0(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.lang.String r1, long r2, long r4, com.google.android.exoplayer2.analytics.AnalyticsListener r6) {
            lambda$onVideoDecoderInitialized$14(r0, r1, r2, r4, r6)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$yRsWHcEy5NVVElHVU-xHPfDxr2s, reason: not valid java name */
    public static /* synthetic */ void m212$r8$lambda$yRsWHcEy5NVVElHVUxHPfDxr2s(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.PlaybackException r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            lambda$onPlayerErrorChanged$42(r0, r1, r2)
            return
    }

    public DefaultAnalyticsCollector(com.google.android.exoplayer2.util.Clock r4) {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            com.google.android.exoplayer2.util.Clock r0 = (com.google.android.exoplayer2.util.Clock) r0
            r3.clock = r0
            com.google.android.exoplayer2.util.ListenerSet r0 = new com.google.android.exoplayer2.util.ListenerSet
            android.os.Looper r1 = com.google.android.exoplayer2.util.Util.getCurrentOrMainLooper()
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r2 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$20
            r0.<init>(r1, r4, r2)
            r3.listeners = r0
            com.google.android.exoplayer2.Timeline$Period r4 = new com.google.android.exoplayer2.Timeline$Period
            r4.<init>()
            r3.period = r4
            com.google.android.exoplayer2.Timeline$Window r0 = new com.google.android.exoplayer2.Timeline$Window
            r0.<init>()
            r3.window = r0
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$MediaPeriodQueueTracker r0 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$MediaPeriodQueueTracker
            r0.<init>(r4)
            r3.mediaPeriodQueueTracker = r0
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r3.eventTimes = r4
            return
    }

    private com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateEventTime(@androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4) {
            r3 = this;
            com.google.android.exoplayer2.Player r0 = r3.player
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            r0 = 0
            if (r4 != 0) goto La
            r1 = r0
            goto L10
        La:
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$MediaPeriodQueueTracker r1 = r3.mediaPeriodQueueTracker
            com.google.android.exoplayer2.Timeline r1 = r1.getMediaPeriodIdTimeline(r4)
        L10:
            if (r4 == 0) goto L24
            if (r1 != 0) goto L15
            goto L24
        L15:
            java.lang.Object r0 = r4.periodUid
            com.google.android.exoplayer2.Timeline$Period r2 = r3.period
            com.google.android.exoplayer2.Timeline$Period r0 = r1.getPeriodByUid(r0, r2)
            int r0 = r0.windowIndex
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r4 = r3.generateEventTime(r1, r0, r4)
            return r4
        L24:
            com.google.android.exoplayer2.Player r4 = r3.player
            int r4 = r4.getCurrentMediaItemIndex()
            com.google.android.exoplayer2.Player r1 = r3.player
            com.google.android.exoplayer2.Timeline r1 = r1.getCurrentTimeline()
            int r2 = r1.getWindowCount()
            if (r4 >= r2) goto L38
            r2 = 1
            goto L39
        L38:
            r2 = 0
        L39:
            if (r2 == 0) goto L3c
            goto L3e
        L3c:
            com.google.android.exoplayer2.Timeline r1 = com.google.android.exoplayer2.Timeline.EMPTY
        L3e:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r4 = r3.generateEventTime(r1, r4, r0)
            return r4
    }

    private com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
            r1 = this;
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$MediaPeriodQueueTracker r0 = r1.mediaPeriodQueueTracker
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.getLoadingMediaPeriod()
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r1.generateEventTime(r0)
            return r0
    }

    private com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime(int r4, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r5) {
            r3 = this;
            com.google.android.exoplayer2.Player r0 = r3.player
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L21
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$MediaPeriodQueueTracker r2 = r3.mediaPeriodQueueTracker
            com.google.android.exoplayer2.Timeline r2 = r2.getMediaPeriodIdTimeline(r5)
            if (r2 == 0) goto L12
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L1a
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r4 = r3.generateEventTime(r5)
            goto L20
        L1a:
            com.google.android.exoplayer2.Timeline r0 = com.google.android.exoplayer2.Timeline.EMPTY
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r4 = r3.generateEventTime(r0, r4, r5)
        L20:
            return r4
        L21:
            com.google.android.exoplayer2.Player r5 = r3.player
            com.google.android.exoplayer2.Timeline r5 = r5.getCurrentTimeline()
            int r2 = r5.getWindowCount()
            if (r4 >= r2) goto L2e
            goto L2f
        L2e:
            r0 = 0
        L2f:
            if (r0 == 0) goto L32
            goto L34
        L32:
            com.google.android.exoplayer2.Timeline r5 = com.google.android.exoplayer2.Timeline.EMPTY
        L34:
            r0 = 0
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r4 = r3.generateEventTime(r5, r4, r0)
            return r4
    }

    private com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
            r1 = this;
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$MediaPeriodQueueTracker r0 = r1.mediaPeriodQueueTracker
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.getPlayingMediaPeriod()
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r1.generateEventTime(r0)
            return r0
    }

    private com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
            r1 = this;
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$MediaPeriodQueueTracker r0 = r1.mediaPeriodQueueTracker
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.getReadingMediaPeriod()
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r1.generateEventTime(r0)
            return r0
    }

    private com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime getEventTimeForErrorEvent(@androidx.annotation.Nullable com.google.android.exoplayer2.PlaybackException r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.exoplayer2.ExoPlaybackException
            if (r0 == 0) goto L14
            com.google.android.exoplayer2.ExoPlaybackException r2 = (com.google.android.exoplayer2.ExoPlaybackException) r2
            com.google.android.exoplayer2.source.MediaPeriodId r2 = r2.mediaPeriodId
            if (r2 == 0) goto L14
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
            r0.<init>(r2)
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r1.generateEventTime(r0)
            return r2
        L14:
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r1.generateCurrentPlayerMediaPeriodEventTime()
            return r2
    }

    private static /* synthetic */ void lambda$new$0(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.util.FlagSet r1) {
            return
    }

    private static /* synthetic */ void lambda$notifySeekStarted$2(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.analytics.AnalyticsListener r1) {
            r1.onSeekStarted(r0)
            return
    }

    private static /* synthetic */ void lambda$onAudioAttributesChanged$56(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.audio.AudioAttributes r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onAudioAttributesChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onAudioCodecError$11(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.lang.Exception r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onAudioCodecError(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onAudioDecoderInitialized$4(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r7, java.lang.String r8, long r9, long r11, com.google.android.exoplayer2.analytics.AnalyticsListener r13) {
            r13.onAudioDecoderInitialized(r7, r8, r9)
            r0 = r13
            r1 = r7
            r2 = r8
            r3 = r11
            r5 = r9
            r0.onAudioDecoderInitialized(r1, r2, r3, r5)
            r3 = 1
            r1 = r13
            r2 = r7
            r4 = r8
            r1.onDecoderInitialized(r2, r3, r4, r5)
            return
    }

    private static /* synthetic */ void lambda$onAudioDecoderReleased$8(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.lang.String r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onAudioDecoderReleased(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onAudioDisabled$9(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onAudioDisabled(r1, r2)
            r0 = 1
            r3.onDecoderDisabled(r1, r0, r2)
            return
    }

    private static /* synthetic */ void lambda$onAudioEnabled$3(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onAudioEnabled(r1, r2)
            r0 = 1
            r3.onDecoderEnabled(r1, r0, r2)
            return
    }

    private static /* synthetic */ void lambda$onAudioInputFormatChanged$5(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.Format r1, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onAudioInputFormatChanged(r0, r1)
            r3.onAudioInputFormatChanged(r0, r1, r2)
            r2 = 1
            r3.onDecoderInputFormatChanged(r0, r2, r1)
            return
    }

    private static /* synthetic */ void lambda$onAudioPositionAdvancing$6(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, long r1, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onAudioPositionAdvancing(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onAudioSessionIdChanged$55(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onAudioSessionIdChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onAudioSinkError$10(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.lang.Exception r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onAudioSinkError(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onAudioUnderrun$7(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r7, int r8, long r9, long r11, com.google.android.exoplayer2.analytics.AnalyticsListener r13) {
            r0 = r13
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r0.onAudioUnderrun(r1, r2, r3, r5)
            return
    }

    private static /* synthetic */ void lambda$onAvailableCommandsChanged$33(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.Player.Commands r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onAvailableCommandsChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onBandwidthSample$61(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r7, int r8, long r9, long r11, com.google.android.exoplayer2.analytics.AnalyticsListener r13) {
            r0 = r13
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r0.onBandwidthEstimate(r1, r2, r3, r5)
            return
    }

    private static /* synthetic */ void lambda$onCues$51(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.util.List r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onCues(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onCues$52(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.text.CueGroup r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onCues(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onDeviceInfoChanged$59(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.DeviceInfo r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onDeviceInfoChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onDeviceVolumeChanged$60(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, boolean r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onDeviceVolumeChanged(r0, r1, r2)
            return
    }

    private static /* synthetic */ void lambda$onDownstreamFormatChanged$28(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.source.MediaLoadData r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onDownstreamFormatChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onDrmKeysLoaded$63(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.analytics.AnalyticsListener r1) {
            r1.onDrmKeysLoaded(r0)
            return
    }

    private static /* synthetic */ void lambda$onDrmKeysRemoved$66(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.analytics.AnalyticsListener r1) {
            r1.onDrmKeysRemoved(r0)
            return
    }

    private static /* synthetic */ void lambda$onDrmKeysRestored$65(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.analytics.AnalyticsListener r1) {
            r1.onDrmKeysRestored(r0)
            return
    }

    private static /* synthetic */ void lambda$onDrmSessionAcquired$62(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onDrmSessionAcquired(r0)
            r2.onDrmSessionAcquired(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onDrmSessionManagerError$64(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.lang.Exception r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onDrmSessionManagerError(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onDrmSessionReleased$67(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.analytics.AnalyticsListener r1) {
            r1.onDrmSessionReleased(r0)
            return
    }

    private static /* synthetic */ void lambda$onDroppedFrames$16(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, long r2, com.google.android.exoplayer2.analytics.AnalyticsListener r4) {
            r4.onDroppedVideoFrames(r0, r1, r2)
            return
    }

    private static /* synthetic */ void lambda$onIsLoadingChanged$32(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, boolean r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onLoadingChanged(r0, r1)
            r2.onIsLoadingChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onIsPlayingChanged$38(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, boolean r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onIsPlayingChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onLoadCanceled$25(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.source.LoadEventInfo r1, com.google.android.exoplayer2.source.MediaLoadData r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onLoadCanceled(r0, r1, r2)
            return
    }

    private static /* synthetic */ void lambda$onLoadCompleted$24(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.source.LoadEventInfo r1, com.google.android.exoplayer2.source.MediaLoadData r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onLoadCompleted(r0, r1, r2)
            return
    }

    private static /* synthetic */ void lambda$onLoadError$26(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r6, com.google.android.exoplayer2.source.LoadEventInfo r7, com.google.android.exoplayer2.source.MediaLoadData r8, java.io.IOException r9, boolean r10, com.google.android.exoplayer2.analytics.AnalyticsListener r11) {
            r0 = r11
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.onLoadError(r1, r2, r3, r4, r5)
            return
    }

    private static /* synthetic */ void lambda$onLoadStarted$23(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.source.LoadEventInfo r1, com.google.android.exoplayer2.source.MediaLoadData r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onLoadStarted(r0, r1, r2)
            return
    }

    private static /* synthetic */ void lambda$onMaxSeekToPreviousPositionChanged$47(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, long r1, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onMaxSeekToPreviousPositionChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onMediaItemTransition$30(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.MediaItem r1, int r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onMediaItemTransition(r0, r1, r2)
            return
    }

    private static /* synthetic */ void lambda$onMediaMetadataChanged$48(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.MediaMetadata r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onMediaMetadataChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onMetadata$50(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.metadata.Metadata r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onMetadata(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onPlayWhenReadyChanged$36(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, boolean r1, int r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onPlayWhenReadyChanged(r0, r1, r2)
            return
    }

    private static /* synthetic */ void lambda$onPlaybackParametersChanged$44(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.PlaybackParameters r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onPlaybackParametersChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onPlaybackStateChanged$35(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onPlaybackStateChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onPlaybackSuppressionReasonChanged$37(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onPlaybackSuppressionReasonChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onPlayerError$41(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.PlaybackException r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onPlayerError(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onPlayerErrorChanged$42(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.PlaybackException r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onPlayerErrorChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onPlayerStateChanged$34(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, boolean r1, int r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onPlayerStateChanged(r0, r1, r2)
            return
    }

    private static /* synthetic */ void lambda$onPlaylistMetadataChanged$49(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.MediaMetadata r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onPlaylistMetadataChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onPositionDiscontinuity$43(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, com.google.android.exoplayer2.Player.PositionInfo r2, com.google.android.exoplayer2.Player.PositionInfo r3, com.google.android.exoplayer2.analytics.AnalyticsListener r4) {
            r4.onPositionDiscontinuity(r0, r1)
            r4.onPositionDiscontinuity(r0, r2, r3, r1)
            return
    }

    private static /* synthetic */ void lambda$onRenderedFirstFrame$19(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.lang.Object r1, long r2, com.google.android.exoplayer2.analytics.AnalyticsListener r4) {
            r4.onRenderedFirstFrame(r0, r1, r2)
            return
    }

    private static /* synthetic */ void lambda$onRepeatModeChanged$39(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onRepeatModeChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onSeekBackIncrementChanged$45(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, long r1, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onSeekBackIncrementChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onSeekForwardIncrementChanged$46(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, long r1, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onSeekForwardIncrementChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onSeekProcessed$53(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.analytics.AnalyticsListener r1) {
            r1.onSeekProcessed(r0)
            return
    }

    private static /* synthetic */ void lambda$onShuffleModeEnabledChanged$40(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, boolean r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onShuffleModeChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onSkipSilenceEnabledChanged$54(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, boolean r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onSkipSilenceEnabledChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onSurfaceSizeChanged$22(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, int r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onSurfaceSizeChanged(r0, r1, r2)
            return
    }

    private static /* synthetic */ void lambda$onTimelineChanged$29(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, int r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onTimelineChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onTrackSelectionParametersChanged$58(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onTrackSelectionParametersChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onTracksChanged$31(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.Tracks r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onTracksChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onUpstreamDiscarded$27(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.source.MediaLoadData r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onUpstreamDiscarded(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onVideoCodecError$21(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.lang.Exception r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onVideoCodecError(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onVideoDecoderInitialized$14(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r7, java.lang.String r8, long r9, long r11, com.google.android.exoplayer2.analytics.AnalyticsListener r13) {
            r13.onVideoDecoderInitialized(r7, r8, r9)
            r0 = r13
            r1 = r7
            r2 = r8
            r3 = r11
            r5 = r9
            r0.onVideoDecoderInitialized(r1, r2, r3, r5)
            r3 = 2
            r1 = r13
            r2 = r7
            r4 = r8
            r1.onDecoderInitialized(r2, r3, r4, r5)
            return
    }

    private static /* synthetic */ void lambda$onVideoDecoderReleased$17(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, java.lang.String r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onVideoDecoderReleased(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$onVideoDisabled$18(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onVideoDisabled(r1, r2)
            r0 = 2
            r3.onDecoderDisabled(r1, r0, r2)
            return
    }

    private static /* synthetic */ void lambda$onVideoEnabled$13(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onVideoEnabled(r1, r2)
            r0 = 2
            r3.onDecoderEnabled(r1, r0, r2)
            return
    }

    private static /* synthetic */ void lambda$onVideoFrameProcessingOffset$20(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, long r1, int r3, com.google.android.exoplayer2.analytics.AnalyticsListener r4) {
            r4.onVideoFrameProcessingOffset(r0, r1, r3)
            return
    }

    private static /* synthetic */ void lambda$onVideoInputFormatChanged$15(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.Format r1, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r2, com.google.android.exoplayer2.analytics.AnalyticsListener r3) {
            r3.onVideoInputFormatChanged(r0, r1)
            r3.onVideoInputFormatChanged(r0, r1, r2)
            r2 = 2
            r3.onDecoderInputFormatChanged(r0, r2, r1)
            return
    }

    private static /* synthetic */ void lambda$onVideoSizeChanged$57(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r6, com.google.android.exoplayer2.video.VideoSize r7, com.google.android.exoplayer2.analytics.AnalyticsListener r8) {
            r8.onVideoSizeChanged(r6, r7)
            int r2 = r7.width
            int r3 = r7.height
            int r4 = r7.unappliedRotationDegrees
            float r5 = r7.pixelWidthHeightRatio
            r0 = r8
            r1 = r6
            r0.onVideoSizeChanged(r1, r2, r3, r4, r5)
            return
    }

    private static /* synthetic */ void lambda$onVolumeChanged$12(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, float r1, com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r2.onVolumeChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$releaseInternal$68(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r0, com.google.android.exoplayer2.analytics.AnalyticsListener r1) {
            r1.onPlayerReleased(r0)
            return
    }

    private /* synthetic */ void lambda$setPlayer$1(com.google.android.exoplayer2.Player r3, com.google.android.exoplayer2.analytics.AnalyticsListener r4, com.google.android.exoplayer2.util.FlagSet r5) {
            r2 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$Events r0 = new com.google.android.exoplayer2.analytics.AnalyticsListener$Events
            android.util.SparseArray<com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime> r1 = r2.eventTimes
            r0.<init>(r5, r1)
            r4.onEvents(r3, r0)
            return
    }

    private void releaseInternal() {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0
            r2 = 3
            r1.<init>(r0, r2)
            r2 = 1028(0x404, float:1.44E-42)
            r3.sendEvent(r0, r2, r1)
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.analytics.AnalyticsListener> r0 = r3.listeners
            r0.release()
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    @androidx.annotation.CallSuper
    public void addListener(com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.analytics.AnalyticsListener> r0 = r1.listeners
            r0.add(r2)
            return
    }

    public final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime() {
            r1 = this;
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$MediaPeriodQueueTracker r0 = r1.mediaPeriodQueueTracker
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.getCurrentPlayerMediaPeriod()
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r1.generateEventTime(r0)
            return r0
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"player"})
    public final com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime generateEventTime(com.google.android.exoplayer2.Timeline r18, int r19, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r20) {
            r17 = this;
            r0 = r17
            r4 = r18
            r5 = r19
            boolean r1 = r18.isEmpty()
            if (r1 == 0) goto Lf
            r1 = 0
            r6 = r1
            goto L11
        Lf:
            r6 = r20
        L11:
            com.google.android.exoplayer2.util.Clock r1 = r0.clock
            long r2 = r1.elapsedRealtime()
            com.google.android.exoplayer2.Player r1 = r0.player
            com.google.android.exoplayer2.Timeline r1 = r1.getCurrentTimeline()
            boolean r1 = r4.equals(r1)
            r7 = 1
            r8 = 0
            if (r1 == 0) goto L2f
            com.google.android.exoplayer2.Player r1 = r0.player
            int r1 = r1.getCurrentMediaItemIndex()
            if (r5 != r1) goto L2f
            r1 = 1
            goto L30
        L2f:
            r1 = 0
        L30:
            r9 = 0
            if (r6 == 0) goto L5b
            boolean r11 = r6.isAd()
            if (r11 == 0) goto L5b
            if (r1 == 0) goto L51
            com.google.android.exoplayer2.Player r1 = r0.player
            int r1 = r1.getCurrentAdGroupIndex()
            int r11 = r6.adGroupIndex
            if (r1 != r11) goto L51
            com.google.android.exoplayer2.Player r1 = r0.player
            int r1 = r1.getCurrentAdIndexInAdGroup()
            int r11 = r6.adIndexInAdGroup
            if (r1 != r11) goto L51
            goto L52
        L51:
            r7 = 0
        L52:
            if (r7 == 0) goto L75
            com.google.android.exoplayer2.Player r1 = r0.player
            long r9 = r1.getCurrentPosition()
            goto L75
        L5b:
            if (r1 == 0) goto L64
            com.google.android.exoplayer2.Player r1 = r0.player
            long r7 = r1.getContentPosition()
            goto L76
        L64:
            boolean r1 = r18.isEmpty()
            if (r1 == 0) goto L6b
            goto L75
        L6b:
            com.google.android.exoplayer2.Timeline$Window r1 = r0.window
            com.google.android.exoplayer2.Timeline$Window r1 = r4.getWindow(r5, r1)
            long r9 = r1.getDefaultPositionMs()
        L75:
            r7 = r9
        L76:
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$MediaPeriodQueueTracker r1 = r0.mediaPeriodQueueTracker
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r11 = r1.getCurrentPlayerMediaPeriod()
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r16 = new com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime
            com.google.android.exoplayer2.Player r1 = r0.player
            com.google.android.exoplayer2.Timeline r9 = r1.getCurrentTimeline()
            com.google.android.exoplayer2.Player r1 = r0.player
            int r10 = r1.getCurrentMediaItemIndex()
            com.google.android.exoplayer2.Player r1 = r0.player
            long r12 = r1.getCurrentPosition()
            com.google.android.exoplayer2.Player r1 = r0.player
            long r14 = r1.getTotalBufferedDuration()
            r1 = r16
            r4 = r18
            r5 = r19
            r1.<init>(r2, r4, r5, r6, r7, r9, r10, r11, r12, r14)
            return r16
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void notifySeekStarted() {
            r4 = this;
            boolean r0 = r4.isSeeking
            if (r0 != 0) goto L15
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r4.generateCurrentPlayerMediaPeriodEventTime()
            r1 = 1
            r4.isSeeking = r1
            r1 = -1
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0 r2 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0
            r3 = 0
            r2.<init>(r0, r3)
            r4.sendEvent(r0, r1, r2)
        L15:
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onAudioAttributesChanged(com.google.android.exoplayer2.audio.AudioAttributes r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateReadingMediaPeriodEventTime()
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1
            r2 = 8
            r1.<init>(r0, r4, r2)
            r4 = 20
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioCodecError(java.lang.Exception r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateReadingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda10 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda10
            r2 = 2
            r1.<init>(r0, r4, r2)
            r4 = 1029(0x405, float:1.442E-42)
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioDecoderInitialized(java.lang.String r11, long r12, long r14) {
            r10 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r8 = r10.generateReadingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda12 r9 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda12
            r7 = 1
            r0 = r9
            r1 = r8
            r2 = r11
            r3 = r14
            r5 = r12
            r0.<init>(r1, r2, r3, r5, r7)
            r11 = 1008(0x3f0, float:1.413E-42)
            r10.sendEvent(r8, r11, r9)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioDecoderReleased(java.lang.String r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateReadingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda11 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda11
            r2 = 1
            r1.<init>(r0, r4, r2)
            r4 = 1012(0x3f4, float:1.418E-42)
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioDisabled(com.google.android.exoplayer2.decoder.DecoderCounters r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generatePlayingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda7 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda7
            r2 = 3
            r1.<init>(r0, r4, r2)
            r4 = 1013(0x3f5, float:1.42E-42)
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioEnabled(com.google.android.exoplayer2.decoder.DecoderCounters r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateReadingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda7 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda7
            r2 = 2
            r1.<init>(r0, r4, r2)
            r4 = 1007(0x3ef, float:1.411E-42)
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioInputFormatChanged(com.google.android.exoplayer2.Format r4, @androidx.annotation.Nullable com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r5) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateReadingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda4 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda4
            r2 = 0
            r1.<init>(r0, r4, r5, r2)
            r4 = 1009(0x3f1, float:1.414E-42)
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioPositionAdvancing(long r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateReadingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda3 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda3
            r2 = 2
            r1.<init>(r0, r4, r2)
            r4 = 1010(0x3f2, float:1.415E-42)
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onAudioSessionIdChanged(int r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateReadingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda1 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda1
            r2 = 1
            r1.<init>(r0, r4, r2)
            r4 = 21
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioSinkError(java.lang.Exception r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateReadingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda10 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda10
            r2 = 1
            r1.<init>(r0, r4, r2)
            r4 = 1014(0x3f6, float:1.421E-42)
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioUnderrun(int r11, long r12, long r14) {
            r10 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r8 = r10.generateReadingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda2 r9 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda2
            r7 = 0
            r0 = r9
            r1 = r8
            r2 = r11
            r3 = r12
            r5 = r14
            r0.<init>(r1, r2, r3, r5, r7)
            r11 = 1011(0x3f3, float:1.417E-42)
            r10.sendEvent(r8, r11, r9)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onAvailableCommandsChanged(com.google.android.exoplayer2.Player.Commands r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1
            r2 = 9
            r1.<init>(r0, r4, r2)
            r4 = 13
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(int r11, long r12, long r14) {
            r10 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r8 = r10.generateLoadingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda2 r9 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda2
            r7 = 1
            r0 = r9
            r1 = r8
            r2 = r11
            r3 = r12
            r5 = r14
            r0.<init>(r1, r2, r3, r5, r7)
            r11 = 1006(0x3ee, float:1.41E-42)
            r10.sendEvent(r8, r11, r9)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onCues(com.google.android.exoplayer2.text.CueGroup r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1
            r2 = 10
            r1.<init>(r0, r4, r2)
            r4 = 27
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onCues(java.util.List<com.google.android.exoplayer2.text.Cue> r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1
            r2 = 12
            r1.<init>(r0, r4, r2)
            r4 = 27
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onDeviceInfoChanged(com.google.android.exoplayer2.DeviceInfo r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1
            r2 = 3
            r1.<init>(r0, r4, r2)
            r4 = 29
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onDeviceVolumeChanged(int r3, boolean r4) {
            r2 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r2.generateCurrentPlayerMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda14 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda14
            r1.<init>(r0, r3, r4)
            r3 = 30
            r2.sendEvent(r0, r3, r1)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, com.google.android.exoplayer2.source.MediaLoadData r4) {
            r1 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r1.generateMediaPeriodEventTime(r2, r3)
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda9 r3 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda9
            r0 = 0
            r3.<init>(r2, r4, r0)
            r4 = 1004(0x3ec, float:1.407E-42)
            r1.sendEvent(r2, r4, r3)
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysLoaded(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3) {
            r1 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r1.generateMediaPeriodEventTime(r2, r3)
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0
            r0 = 1
            r3.<init>(r2, r0)
            r0 = 1023(0x3ff, float:1.434E-42)
            r1.sendEvent(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysRemoved(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3) {
            r1 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r1.generateMediaPeriodEventTime(r2, r3)
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0
            r0 = 4
            r3.<init>(r2, r0)
            r0 = 1026(0x402, float:1.438E-42)
            r1.sendEvent(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysRestored(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3) {
            r1 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r1.generateMediaPeriodEventTime(r2, r3)
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0
            r0 = 5
            r3.<init>(r2, r0)
            r0 = 1025(0x401, float:1.436E-42)
            r1.sendEvent(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final /* synthetic */ void onDrmSessionAcquired(int r1, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
            r0 = this;
            com.google.android.exoplayer2.drm.DrmSessionEventListener.CC.$default$onDrmSessionAcquired(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionAcquired(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, int r4) {
            r1 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r1.generateMediaPeriodEventTime(r2, r3)
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda1 r3 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda1
            r0 = 4
            r3.<init>(r2, r4, r0)
            r4 = 1022(0x3fe, float:1.432E-42)
            r1.sendEvent(r2, r4, r3)
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionManagerError(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, java.lang.Exception r4) {
            r1 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r1.generateMediaPeriodEventTime(r2, r3)
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda10 r3 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda10
            r0 = 3
            r3.<init>(r2, r4, r0)
            r4 = 1024(0x400, float:1.435E-42)
            r1.sendEvent(r2, r4, r3)
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionReleased(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3) {
            r1 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r1.generateMediaPeriodEventTime(r2, r3)
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0
            r0 = 2
            r3.<init>(r2, r0)
            r0 = 1027(0x403, float:1.439E-42)
            r1.sendEvent(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onDroppedFrames(int r3, long r4) {
            r2 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r2.generatePlayingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda13 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda13
            r1.<init>(r0, r3, r4)
            r3 = 1018(0x3fa, float:1.427E-42)
            r2.sendEvent(r0, r3, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onEvents(com.google.android.exoplayer2.Player r1, com.google.android.exoplayer2.Player.Events r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onIsLoadingChanged(boolean r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda2 r1 = new com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda2
            r2 = 4
            r1.<init>(r0, r4, r2)
            r4 = 3
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onIsPlayingChanged(boolean r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda2 r1 = new com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda2
            r2 = 3
            r1.<init>(r0, r4, r2)
            r4 = 7
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCanceled(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, com.google.android.exoplayer2.source.LoadEventInfo r4, com.google.android.exoplayer2.source.MediaLoadData r5) {
            r1 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r1.generateMediaPeriodEventTime(r2, r3)
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda8 r3 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda8
            r0 = 0
            r3.<init>(r2, r4, r5, r0)
            r4 = 1002(0x3ea, float:1.404E-42)
            r1.sendEvent(r2, r4, r3)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCompleted(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, com.google.android.exoplayer2.source.LoadEventInfo r4, com.google.android.exoplayer2.source.MediaLoadData r5) {
            r1 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r1.generateMediaPeriodEventTime(r2, r3)
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda8 r3 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda8
            r0 = 2
            r3.<init>(r2, r4, r5, r0)
            r4 = 1001(0x3e9, float:1.403E-42)
            r1.sendEvent(r2, r4, r3)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadError(int r7, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r8, com.google.android.exoplayer2.source.LoadEventInfo r9, com.google.android.exoplayer2.source.MediaLoadData r10, java.io.IOException r11, boolean r12) {
            r6 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r7 = r6.generateMediaPeriodEventTime(r7, r8)
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda16 r8 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda16
            r0 = r8
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r9 = 1003(0x3eb, float:1.406E-42)
            r6.sendEvent(r7, r9, r8)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadStarted(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, com.google.android.exoplayer2.source.LoadEventInfo r4, com.google.android.exoplayer2.source.MediaLoadData r5) {
            r1 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r1.generateMediaPeriodEventTime(r2, r3)
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda8 r3 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda8
            r0 = 1
            r3.<init>(r2, r4, r5, r0)
            r4 = 1000(0x3e8, float:1.401E-42)
            r1.sendEvent(r2, r4, r3)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onLoadingChanged(boolean r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onMaxSeekToPreviousPositionChanged(long r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda3 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda3
            r2 = 1
            r1.<init>(r0, r4, r2)
            r4 = 18
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onMediaItemTransition(@androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem r3, int r4) {
            r2 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r2.generateCurrentPlayerMediaPeriodEventTime()
            com.flextv.livestore.activities.ChangePlaylistActivity$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.ChangePlaylistActivity$$ExternalSyntheticLambda0
            r1.<init>(r0, r3, r4)
            r3 = 1
            r2.sendEvent(r0, r3, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onMediaMetadataChanged(com.google.android.exoplayer2.MediaMetadata r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda5 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda5
            r2 = 0
            r1.<init>(r0, r4, r2)
            r4 = 14
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onMetadata(com.google.android.exoplayer2.metadata.Metadata r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1
            r2 = 2
            r1.<init>(r0, r4, r2)
            r4 = 28
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayWhenReadyChanged(boolean r4, int r5) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda14 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda14
            r2 = 2
            r1.<init>(r0, r4, r5, r2)
            r4 = 5
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackParametersChanged(com.google.android.exoplayer2.PlaybackParameters r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1
            r2 = 11
            r1.<init>(r0, r4, r2)
            r4 = 12
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackStateChanged(int r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda1 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda1
            r2 = 0
            r1.<init>(r0, r4, r2)
            r4 = 4
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackSuppressionReasonChanged(int r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda1 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda1
            r2 = 2
            r1.<init>(r0, r4, r2)
            r4 = 6
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayerError(com.google.android.exoplayer2.PlaybackException r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.getEventTimeForErrorEvent(r4)
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda6 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda6
            r2 = 1
            r1.<init>(r0, r4, r2)
            r4 = 10
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlayerErrorChanged(@androidx.annotation.Nullable com.google.android.exoplayer2.PlaybackException r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.getEventTimeForErrorEvent(r4)
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda6 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda6
            r2 = 0
            r1.<init>(r0, r4, r2)
            r4 = 10
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayerStateChanged(boolean r4, int r5) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda14 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda14
            r2 = 1
            r1.<init>(r0, r4, r5, r2)
            r4 = -1
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlaylistMetadataChanged(com.google.android.exoplayer2.MediaMetadata r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda5 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda5
            r2 = 1
            r1.<init>(r0, r4, r2)
            r4 = 15
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPositionDiscontinuity(int r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPositionDiscontinuity(com.google.android.exoplayer2.Player.PositionInfo r4, com.google.android.exoplayer2.Player.PositionInfo r5, int r6) {
            r3 = this;
            r0 = 1
            if (r6 != r0) goto L6
            r0 = 0
            r3.isSeeking = r0
        L6:
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$MediaPeriodQueueTracker r0 = r3.mediaPeriodQueueTracker
            com.google.android.exoplayer2.Player r1 = r3.player
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.Player r1 = (com.google.android.exoplayer2.Player) r1
            r0.onPositionDiscontinuity(r1)
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            r1 = 11
            com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda1 r2 = new com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda1
            r2.<init>(r0, r6, r4, r5)
            r3.sendEvent(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onRenderedFirstFrame() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onRenderedFirstFrame(java.lang.Object r3, long r4) {
            r2 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r2.generateReadingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda17 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda17
            r1.<init>(r0, r3, r4)
            r3 = 26
            r2.sendEvent(r0, r3, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onRepeatModeChanged(int r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda1 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda1
            r2 = 3
            r1.<init>(r0, r4, r2)
            r4 = 8
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onSeekBackIncrementChanged(long r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda3 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda3
            r2 = 3
            r1.<init>(r0, r4, r2)
            r4 = 16
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onSeekForwardIncrementChanged(long r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda3 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda3
            r2 = 0
            r1.<init>(r0, r4, r2)
            r4 = 17
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onSeekProcessed() {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0
            r2 = 6
            r1.<init>(r0, r2)
            r2 = -1
            r3.sendEvent(r0, r2, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onShuffleModeEnabledChanged(boolean r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda2 r1 = new com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda2
            r2 = 1
            r1.<init>(r0, r4, r2)
            r4 = 9
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onSkipSilenceEnabledChanged(boolean r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateReadingMediaPeriodEventTime()
            com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda2 r1 = new com.flextv.livestore.activities.AddGroupActivity$$ExternalSyntheticLambda2
            r2 = 2
            r1.<init>(r0, r4, r2)
            r4 = 23
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onSurfaceSizeChanged(int r3, int r4) {
            r2 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r2.generateReadingMediaPeriodEventTime()
            com.google.android.material.search.SearchView$$ExternalSyntheticLambda4 r1 = new com.google.android.material.search.SearchView$$ExternalSyntheticLambda4
            r1.<init>(r0, r3, r4)
            r3 = 24
            r2.sendEvent(r0, r3, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onTimelineChanged(com.google.android.exoplayer2.Timeline r3, int r4) {
            r2 = this;
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$MediaPeriodQueueTracker r3 = r2.mediaPeriodQueueTracker
            com.google.android.exoplayer2.Player r0 = r2.player
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.Player r0 = (com.google.android.exoplayer2.Player) r0
            r3.onTimelineChanged(r0)
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r3 = r2.generateCurrentPlayerMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda1 r0 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda1
            r1 = 5
            r0.<init>(r3, r4, r1)
            r4 = 0
            r2.sendEvent(r3, r4, r0)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1
            r2 = 4
            r1.<init>(r0, r4, r2)
            r4 = 19
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onTracksChanged(com.google.android.exoplayer2.Tracks r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateCurrentPlayerMediaPeriodEventTime()
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1
            r2 = 7
            r1.<init>(r0, r4, r2)
            r4 = 2
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, com.google.android.exoplayer2.source.MediaLoadData r4) {
            r1 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r1.generateMediaPeriodEventTime(r2, r3)
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda9 r3 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda9
            r0 = 1
            r3.<init>(r2, r4, r0)
            r4 = 1005(0x3ed, float:1.408E-42)
            r1.sendEvent(r2, r4, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoCodecError(java.lang.Exception r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateReadingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda10 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda10
            r2 = 0
            r1.<init>(r0, r4, r2)
            r4 = 1030(0x406, float:1.443E-42)
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoDecoderInitialized(java.lang.String r11, long r12, long r14) {
            r10 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r8 = r10.generateReadingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda12 r9 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda12
            r7 = 0
            r0 = r9
            r1 = r8
            r2 = r11
            r3 = r14
            r5 = r12
            r0.<init>(r1, r2, r3, r5, r7)
            r11 = 1016(0x3f8, float:1.424E-42)
            r10.sendEvent(r8, r11, r9)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoDecoderReleased(java.lang.String r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateReadingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda11 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda11
            r2 = 0
            r1.<init>(r0, r4, r2)
            r4 = 1019(0x3fb, float:1.428E-42)
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoDisabled(com.google.android.exoplayer2.decoder.DecoderCounters r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generatePlayingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda7 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda7
            r2 = 1
            r1.<init>(r0, r4, r2)
            r4 = 1020(0x3fc, float:1.43E-42)
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoEnabled(com.google.android.exoplayer2.decoder.DecoderCounters r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateReadingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda7 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda7
            r2 = 0
            r1.<init>(r0, r4, r2)
            r4 = 1015(0x3f7, float:1.422E-42)
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoFrameProcessingOffset(long r3, int r5) {
            r2 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r2.generatePlayingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda13 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda13
            r1.<init>(r0, r3, r5)
            r3 = 1021(0x3fd, float:1.431E-42)
            r2.sendEvent(r0, r3, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoInputFormatChanged(com.google.android.exoplayer2.Format r4, @androidx.annotation.Nullable com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r5) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateReadingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda4 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda4
            r2 = 1
            r1.<init>(r0, r4, r5, r2)
            r4 = 1017(0x3f9, float:1.425E-42)
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onVideoSizeChanged(com.google.android.exoplayer2.video.VideoSize r4) {
            r3 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r3.generateReadingMediaPeriodEventTime()
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1
            r2 = 6
            r1.<init>(r0, r4, r2)
            r4 = 25
            r3.sendEvent(r0, r4, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onVolumeChanged(float r3) {
            r2 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r2.generateReadingMediaPeriodEventTime()
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda15 r1 = new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda15
            r1.<init>(r0, r3)
            r3 = 22
            r2.sendEvent(r0, r3, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    @androidx.annotation.CallSuper
    public void release() {
            r3 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r3.handler
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.util.HandlerWrapper r0 = (com.google.android.exoplayer2.util.HandlerWrapper) r0
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r1 = new androidx.activity.ComponentDialog$$ExternalSyntheticLambda0
            r2 = 10
            r1.<init>(r3, r2)
            r0.post(r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    @androidx.annotation.CallSuper
    public void removeListener(com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r1 = this;
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.analytics.AnalyticsListener> r0 = r1.listeners
            r0.remove(r2)
            return
    }

    public final void sendEvent(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, int r3, com.google.android.exoplayer2.util.ListenerSet.Event<com.google.android.exoplayer2.analytics.AnalyticsListener> r4) {
            r1 = this;
            android.util.SparseArray<com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime> r0 = r1.eventTimes
            r0.put(r3, r2)
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.analytics.AnalyticsListener> r2 = r1.listeners
            r2.sendEvent(r3, r4)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    @androidx.annotation.CallSuper
    public void setPlayer(com.google.android.exoplayer2.Player r4, android.os.Looper r5) {
            r3 = this;
            com.google.android.exoplayer2.Player r0 = r3.player
            if (r0 == 0) goto L13
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$MediaPeriodQueueTracker r0 = r3.mediaPeriodQueueTracker
            com.google.common.collect.ImmutableList r0 = com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.MediaPeriodQueueTracker.access$000(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            com.google.android.exoplayer2.Player r0 = (com.google.android.exoplayer2.Player) r0
            r3.player = r0
            com.google.android.exoplayer2.util.Clock r0 = r3.clock
            r1 = 0
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r0.createHandler(r5, r1)
            r3.handler = r0
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.analytics.AnalyticsListener> r0 = r3.listeners
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1 r1 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1
            r2 = 5
            r1.<init>(r3, r4, r2)
            com.google.android.exoplayer2.util.ListenerSet r4 = r0.copy(r5, r1)
            r3.listeners = r4
            return
    }

    @java.lang.Deprecated
    public void setThrowsWhenUsingWrongThread(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.analytics.AnalyticsListener> r0 = r1.listeners
            r0.setThrowsWhenUsingWrongThread(r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void updateMediaPeriodQueueInfo(java.util.List<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4) {
            r2 = this;
            com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$MediaPeriodQueueTracker r0 = r2.mediaPeriodQueueTracker
            com.google.android.exoplayer2.Player r1 = r2.player
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.Player r1 = (com.google.android.exoplayer2.Player) r1
            r0.onQueueUpdated(r3, r4, r1)
            return
    }
}
