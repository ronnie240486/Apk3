package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends com.google.android.exoplayer2.Player {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        @androidx.annotation.Nullable
        public static /* bridge */ /* synthetic */ com.google.android.exoplayer2.PlaybackException $default$getPlayerError(com.google.android.exoplayer2.ExoPlayer r0) {
                com.google.android.exoplayer2.ExoPlaybackException r0 = r0.getPlayerError()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.Deprecated
    public interface AudioComponent {
        @java.lang.Deprecated
        void clearAuxEffectInfo();

        @java.lang.Deprecated
        com.google.android.exoplayer2.audio.AudioAttributes getAudioAttributes();

        @java.lang.Deprecated
        int getAudioSessionId();

        @java.lang.Deprecated
        boolean getSkipSilenceEnabled();

        @java.lang.Deprecated
        float getVolume();

        @java.lang.Deprecated
        void setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes r1, boolean r2);

        @java.lang.Deprecated
        void setAudioSessionId(int r1);

        @java.lang.Deprecated
        void setAuxEffectInfo(com.google.android.exoplayer2.audio.AuxEffectInfo r1);

        @java.lang.Deprecated
        void setSkipSilenceEnabled(boolean r1);

        @java.lang.Deprecated
        void setVolume(float r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface AudioOffloadListener {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$AudioOffloadListener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onExperimentalOffloadSchedulingEnabledChanged(com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener r0, boolean r1) {
                    return
            }

            public static void $default$onExperimentalOffloadedPlayback(com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener r0, boolean r1) {
                    return
            }

            public static void $default$onExperimentalSleepingForOffloadChanged(com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener r0, boolean r1) {
                    return
            }
        }

        void onExperimentalOffloadSchedulingEnabledChanged(boolean r1);

        void onExperimentalOffloadedPlayback(boolean r1);

        void onExperimentalSleepingForOffloadChanged(boolean r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Builder {
        public com.google.common.base.Function<com.google.android.exoplayer2.util.Clock, com.google.android.exoplayer2.analytics.AnalyticsCollector> analyticsCollectorFunction;
        public com.google.android.exoplayer2.audio.AudioAttributes audioAttributes;
        public com.google.common.base.Supplier<com.google.android.exoplayer2.upstream.BandwidthMeter> bandwidthMeterSupplier;
        public boolean buildCalled;
        public com.google.android.exoplayer2.util.Clock clock;
        public final android.content.Context context;
        public long detachSurfaceTimeoutMs;
        public long foregroundModeTimeoutMs;
        public boolean handleAudioBecomingNoisy;
        public boolean handleAudioFocus;
        public com.google.android.exoplayer2.LivePlaybackSpeedControl livePlaybackSpeedControl;
        public com.google.common.base.Supplier<com.google.android.exoplayer2.LoadControl> loadControlSupplier;
        public android.os.Looper looper;
        public com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory> mediaSourceFactorySupplier;
        public boolean pauseAtEndOfMediaItems;

        @androidx.annotation.Nullable
        public android.os.Looper playbackLooper;

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager;
        public long releaseTimeoutMs;
        public com.google.common.base.Supplier<com.google.android.exoplayer2.RenderersFactory> renderersFactorySupplier;
        public long seekBackIncrementMs;
        public long seekForwardIncrementMs;
        public com.google.android.exoplayer2.SeekParameters seekParameters;
        public boolean skipSilenceEnabled;
        public com.google.common.base.Supplier<com.google.android.exoplayer2.trackselection.TrackSelector> trackSelectorSupplier;
        public boolean useLazyPreparation;
        public boolean usePlatformDiagnostics;
        public int videoChangeFrameRateStrategy;
        public int videoScalingMode;
        public int wakeMode;

        /* JADX INFO: renamed from: $r8$lambda$-20PXyNKLUvSsFndoLKShjDf3xg, reason: not valid java name */
        public static /* synthetic */ com.google.android.exoplayer2.RenderersFactory m148$r8$lambda$20PXyNKLUvSsFndoLKShjDf3xg(com.google.android.exoplayer2.RenderersFactory r0) {
                com.google.android.exoplayer2.RenderersFactory r0 = lambda$new$6(r0)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsCollector $r8$lambda$0AeKkPPzXtGRyaZfObakkNvDQxU(com.google.android.exoplayer2.analytics.AnalyticsCollector r0, com.google.android.exoplayer2.util.Clock r1) {
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = lambda$new$13(r0, r1)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory $r8$lambda$4MJxRma5YZbnV5wJNhmepv4FhNA(android.content.Context r0) {
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = lambda$new$3(r0)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory $r8$lambda$AbdGeuic6Ij7iyVMd3YeZb6E_JE(com.google.android.exoplayer2.source.MediaSource.Factory r0) {
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = lambda$setMediaSourceFactory$17(r0)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$BYXub_ihc_-ya6fF9TdbhhGDr50, reason: not valid java name */
        public static /* synthetic */ com.google.android.exoplayer2.upstream.BandwidthMeter m149$r8$lambda$BYXub_ihc_ya6fF9TdbhhGDr50(android.content.Context r0) {
                com.google.android.exoplayer2.upstream.BandwidthMeter r0 = lambda$new$15(r0)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$C-5Ffb4z3uoaL1oyuSYPz9pS68g, reason: not valid java name */
        public static /* synthetic */ com.google.android.exoplayer2.LoadControl m150$r8$lambda$C5Ffb4z3uoaL1oyuSYPz9pS68g(com.google.android.exoplayer2.LoadControl r0) {
                com.google.android.exoplayer2.LoadControl r0 = lambda$new$11(r0)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory $r8$lambda$FVGxm2JpOVcFlwB1cAh714eUqVk(com.google.android.exoplayer2.source.MediaSource.Factory r0) {
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = lambda$new$7(r0)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$GuxE-cacedVlImHD8iDdMDOpFJ4, reason: not valid java name */
        public static /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelector m151$r8$lambda$GuxEcacedVlImHD8iDdMDOpFJ4(com.google.android.exoplayer2.trackselection.TrackSelector r0) {
                com.google.android.exoplayer2.trackselection.TrackSelector r0 = lambda$setTrackSelector$18(r0)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.RenderersFactory $r8$lambda$Hq25N4QETpUymWCg70DLpzhHWhs(android.content.Context r0) {
                com.google.android.exoplayer2.RenderersFactory r0 = lambda$new$0(r0)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.RenderersFactory $r8$lambda$Iqf1h2yL4j8lAvHKbYQzK_Rux9k(com.google.android.exoplayer2.RenderersFactory r0) {
                com.google.android.exoplayer2.RenderersFactory r0 = lambda$setRenderersFactory$16(r0)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory $r8$lambda$RkxSve2SE5dmiz3L8pZhHD8VZVo(com.google.android.exoplayer2.source.MediaSource.Factory r0) {
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = lambda$new$9(r0)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$VJChOQKhf8DO5Hd-j4AFJoKd82c, reason: not valid java name */
        public static /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelector m152$r8$lambda$VJChOQKhf8DO5Hdj4AFJoKd82c(android.content.Context r0) {
                com.google.android.exoplayer2.trackselection.TrackSelector r0 = lambda$new$14(r0)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.RenderersFactory $r8$lambda$_vjDsacr1VX7EACpX86I7y_s60A(com.google.android.exoplayer2.RenderersFactory r0) {
                com.google.android.exoplayer2.RenderersFactory r0 = lambda$new$8(r0)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.RenderersFactory $r8$lambda$cE0gQaOEGre8JbWgQcbqLA9QzwU(android.content.Context r0) {
                com.google.android.exoplayer2.RenderersFactory r0 = lambda$new$4(r0)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory $r8$lambda$e_2tsONkqdjzUsK3INiS4v5FnJ4(android.content.Context r0) {
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = lambda$new$1(r0)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$jomvW7jCElzwjkby_I-IEkKNkNU, reason: not valid java name */
        public static /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelector m153$r8$lambda$jomvW7jCElzwjkby_IIEkKNkNU(com.google.android.exoplayer2.trackselection.TrackSelector r0) {
                com.google.android.exoplayer2.trackselection.TrackSelector r0 = lambda$new$10(r0)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.upstream.BandwidthMeter $r8$lambda$oo3zkIBuSRHGKH5Wllevbv6E0zQ(com.google.android.exoplayer2.upstream.BandwidthMeter r0) {
                com.google.android.exoplayer2.upstream.BandwidthMeter r0 = lambda$setBandwidthMeter$20(r0)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsCollector $r8$lambda$s5j7alwVn_rzwe5oRzZvhRkrx14(com.google.android.exoplayer2.analytics.AnalyticsCollector r0, com.google.android.exoplayer2.util.Clock r1) {
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = lambda$setAnalyticsCollector$21(r0, r1)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.upstream.BandwidthMeter $r8$lambda$vV2ws6spu9HrllkAonla3cX5pAE(com.google.android.exoplayer2.upstream.BandwidthMeter r0) {
                com.google.android.exoplayer2.upstream.BandwidthMeter r0 = lambda$new$12(r0)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$wgX52bOwJN_SxWy-wq4KmaBRPbk, reason: not valid java name */
        public static /* synthetic */ com.google.android.exoplayer2.RenderersFactory m154$r8$lambda$wgX52bOwJN_SxWywq4KmaBRPbk(com.google.android.exoplayer2.RenderersFactory r0) {
                com.google.android.exoplayer2.RenderersFactory r0 = lambda$new$2(r0)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.LoadControl $r8$lambda$xZaK9DjLoRNdBWtrqbwfHJduMcE(com.google.android.exoplayer2.LoadControl r0) {
                com.google.android.exoplayer2.LoadControl r0 = lambda$setLoadControl$19(r0)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory $r8$lambda$xaIUF2R5Kj_Z3uEuTnshj59N0mk(com.google.android.exoplayer2.source.MediaSource.Factory r0) {
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = lambda$new$5(r0)
                return r0
        }

        public Builder(android.content.Context r4) {
                r3 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda2 r0 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda2
                r1 = 2
                r0.<init>(r4, r1)
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda2 r1 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda2
                r2 = 3
                r1.<init>(r4, r2)
                r3.<init>(r4, r0, r1)
                return
        }

        public Builder(android.content.Context r4, com.google.android.exoplayer2.RenderersFactory r5) {
                r3 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda4 r0 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda4
                r1 = 2
                r0.<init>(r5, r1)
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda2 r1 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda2
                r2 = 5
                r1.<init>(r4, r2)
                r3.<init>(r4, r0, r1)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
                return
        }

        public Builder(android.content.Context r4, com.google.android.exoplayer2.RenderersFactory r5, com.google.android.exoplayer2.source.MediaSource.Factory r6) {
                r3 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda4 r0 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda4
                r1 = 1
                r0.<init>(r5, r1)
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda5 r1 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda5
                r2 = 2
                r1.<init>(r6, r2)
                r3.<init>(r4, r0, r1)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
                return
        }

        public Builder(android.content.Context r9, com.google.android.exoplayer2.RenderersFactory r10, com.google.android.exoplayer2.source.MediaSource.Factory r11, com.google.android.exoplayer2.trackselection.TrackSelector r12, com.google.android.exoplayer2.LoadControl r13, com.google.android.exoplayer2.upstream.BandwidthMeter r14, com.google.android.exoplayer2.analytics.AnalyticsCollector r15) {
                r8 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda4 r2 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda4
                r0 = 3
                r2.<init>(r10, r0)
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda5 r3 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda5
                r3.<init>(r11, r0)
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda6 r4 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda6
                r0 = 1
                r4.<init>(r12, r0)
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda3 r5 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda3
                r5.<init>(r13, r0)
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda7 r6 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda7
                r6.<init>(r14, r0)
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda0 r7 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda0
                r7.<init>(r15, r0)
                r0 = r8
                r1 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r10)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r11)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r12)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r14)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r15)
                return
        }

        public Builder(android.content.Context r4, com.google.android.exoplayer2.source.MediaSource.Factory r5) {
                r3 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda2 r0 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda2
                r1 = 4
                r0.<init>(r4, r1)
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda5 r1 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda5
                r2 = 1
                r1.<init>(r5, r2)
                r3.<init>(r4, r0, r1)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
                return
        }

        private Builder(android.content.Context r9, com.google.common.base.Supplier<com.google.android.exoplayer2.RenderersFactory> r10, com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory> r11) {
                r8 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda2 r4 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda2
                r0 = 0
                r4.<init>(r9, r0)
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda8 r5 = com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda8.INSTANCE
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda2 r6 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda2
                r0 = 1
                r6.<init>(r9, r0)
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda1 r7 = com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda1.INSTANCE
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        private Builder(android.content.Context r1, com.google.common.base.Supplier<com.google.android.exoplayer2.RenderersFactory> r2, com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory> r3, com.google.common.base.Supplier<com.google.android.exoplayer2.trackselection.TrackSelector> r4, com.google.common.base.Supplier<com.google.android.exoplayer2.LoadControl> r5, com.google.common.base.Supplier<com.google.android.exoplayer2.upstream.BandwidthMeter> r6, com.google.common.base.Function<com.google.android.exoplayer2.util.Clock, com.google.android.exoplayer2.analytics.AnalyticsCollector> r7) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                android.content.Context r1 = (android.content.Context) r1
                r0.context = r1
                r0.renderersFactorySupplier = r2
                r0.mediaSourceFactorySupplier = r3
                r0.trackSelectorSupplier = r4
                r0.loadControlSupplier = r5
                r0.bandwidthMeterSupplier = r6
                r0.analyticsCollectorFunction = r7
                android.os.Looper r1 = com.google.android.exoplayer2.util.Util.getCurrentOrMainLooper()
                r0.looper = r1
                com.google.android.exoplayer2.audio.AudioAttributes r1 = com.google.android.exoplayer2.audio.AudioAttributes.DEFAULT
                r0.audioAttributes = r1
                r1 = 0
                r0.wakeMode = r1
                r2 = 1
                r0.videoScalingMode = r2
                r0.videoChangeFrameRateStrategy = r1
                r0.useLazyPreparation = r2
                com.google.android.exoplayer2.SeekParameters r1 = com.google.android.exoplayer2.SeekParameters.DEFAULT
                r0.seekParameters = r1
                r3 = 5000(0x1388, double:2.4703E-320)
                r0.seekBackIncrementMs = r3
                r3 = 15000(0x3a98, double:7.411E-320)
                r0.seekForwardIncrementMs = r3
                com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl$Builder r1 = new com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl$Builder
                r1.<init>()
                com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl r1 = r1.build()
                r0.livePlaybackSpeedControl = r1
                com.google.android.exoplayer2.util.Clock r1 = com.google.android.exoplayer2.util.Clock.DEFAULT
                r0.clock = r1
                r3 = 500(0x1f4, double:2.47E-321)
                r0.releaseTimeoutMs = r3
                r3 = 2000(0x7d0, double:9.88E-321)
                r0.detachSurfaceTimeoutMs = r3
                r0.usePlatformDiagnostics = r2
                return
        }

        private static /* synthetic */ com.google.android.exoplayer2.RenderersFactory lambda$new$0(android.content.Context r1) {
                com.google.android.exoplayer2.DefaultRenderersFactory r0 = new com.google.android.exoplayer2.DefaultRenderersFactory
                r0.<init>(r1)
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory lambda$new$1(android.content.Context r2) {
                com.google.android.exoplayer2.source.DefaultMediaSourceFactory r0 = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory
                com.google.android.exoplayer2.extractor.DefaultExtractorsFactory r1 = new com.google.android.exoplayer2.extractor.DefaultExtractorsFactory
                r1.<init>()
                r0.<init>(r2, r1)
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelector lambda$new$10(com.google.android.exoplayer2.trackselection.TrackSelector r0) {
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.LoadControl lambda$new$11(com.google.android.exoplayer2.LoadControl r0) {
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.upstream.BandwidthMeter lambda$new$12(com.google.android.exoplayer2.upstream.BandwidthMeter r0) {
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsCollector lambda$new$13(com.google.android.exoplayer2.analytics.AnalyticsCollector r0, com.google.android.exoplayer2.util.Clock r1) {
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelector lambda$new$14(android.content.Context r1) {
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector
                r0.<init>(r1)
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.upstream.BandwidthMeter lambda$new$15(android.content.Context r0) {
                com.google.android.exoplayer2.upstream.DefaultBandwidthMeter r0 = com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.getSingletonInstance(r0)
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.RenderersFactory lambda$new$2(com.google.android.exoplayer2.RenderersFactory r0) {
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory lambda$new$3(android.content.Context r2) {
                com.google.android.exoplayer2.source.DefaultMediaSourceFactory r0 = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory
                com.google.android.exoplayer2.extractor.DefaultExtractorsFactory r1 = new com.google.android.exoplayer2.extractor.DefaultExtractorsFactory
                r1.<init>()
                r0.<init>(r2, r1)
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.RenderersFactory lambda$new$4(android.content.Context r1) {
                com.google.android.exoplayer2.DefaultRenderersFactory r0 = new com.google.android.exoplayer2.DefaultRenderersFactory
                r0.<init>(r1)
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory lambda$new$5(com.google.android.exoplayer2.source.MediaSource.Factory r0) {
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.RenderersFactory lambda$new$6(com.google.android.exoplayer2.RenderersFactory r0) {
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory lambda$new$7(com.google.android.exoplayer2.source.MediaSource.Factory r0) {
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.RenderersFactory lambda$new$8(com.google.android.exoplayer2.RenderersFactory r0) {
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory lambda$new$9(com.google.android.exoplayer2.source.MediaSource.Factory r0) {
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsCollector lambda$setAnalyticsCollector$21(com.google.android.exoplayer2.analytics.AnalyticsCollector r0, com.google.android.exoplayer2.util.Clock r1) {
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.upstream.BandwidthMeter lambda$setBandwidthMeter$20(com.google.android.exoplayer2.upstream.BandwidthMeter r0) {
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.LoadControl lambda$setLoadControl$19(com.google.android.exoplayer2.LoadControl r0) {
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory lambda$setMediaSourceFactory$17(com.google.android.exoplayer2.source.MediaSource.Factory r0) {
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.RenderersFactory lambda$setRenderersFactory$16(com.google.android.exoplayer2.RenderersFactory r0) {
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelector lambda$setTrackSelector$18(com.google.android.exoplayer2.trackselection.TrackSelector r0) {
                return r0
        }

        public com.google.android.exoplayer2.ExoPlayer build() {
                r2 = this;
                boolean r0 = r2.buildCalled
                r1 = 1
                r0 = r0 ^ r1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r2.buildCalled = r1
                com.google.android.exoplayer2.ExoPlayerImpl r0 = new com.google.android.exoplayer2.ExoPlayerImpl
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder experimentalSetForegroundModeTimeoutMs(long r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r1.foregroundModeTimeoutMs = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setAnalyticsCollector(com.google.android.exoplayer2.analytics.AnalyticsCollector r3) {
                r2 = this;
                boolean r0 = r2.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda0
                r1 = 0
                r0.<init>(r3, r1)
                r2.analyticsCollectorFunction = r0
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes r2, boolean r3) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
                com.google.android.exoplayer2.audio.AudioAttributes r2 = (com.google.android.exoplayer2.audio.AudioAttributes) r2
                r1.audioAttributes = r2
                r1.handleAudioFocus = r3
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setBandwidthMeter(com.google.android.exoplayer2.upstream.BandwidthMeter r3) {
                r2 = this;
                boolean r0 = r2.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda7 r0 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda7
                r1 = 0
                r0.<init>(r3, r1)
                r2.bandwidthMeterSupplier = r0
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @androidx.annotation.VisibleForTesting
        public com.google.android.exoplayer2.ExoPlayer.Builder setClock(com.google.android.exoplayer2.util.Clock r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r1.clock = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setDetachSurfaceTimeoutMs(long r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r1.detachSurfaceTimeoutMs = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setHandleAudioBecomingNoisy(boolean r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r1.handleAudioBecomingNoisy = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setLivePlaybackSpeedControl(com.google.android.exoplayer2.LivePlaybackSpeedControl r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
                com.google.android.exoplayer2.LivePlaybackSpeedControl r2 = (com.google.android.exoplayer2.LivePlaybackSpeedControl) r2
                r1.livePlaybackSpeedControl = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setLoadControl(com.google.android.exoplayer2.LoadControl r3) {
                r2 = this;
                boolean r0 = r2.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda3 r0 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda3
                r1 = 0
                r0.<init>(r3, r1)
                r2.loadControlSupplier = r0
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setLooper(android.os.Looper r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
                r1.looper = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setMediaSourceFactory(com.google.android.exoplayer2.source.MediaSource.Factory r3) {
                r2 = this;
                boolean r0 = r2.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda5 r0 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda5
                r1 = 0
                r0.<init>(r3, r1)
                r2.mediaSourceFactorySupplier = r0
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setPauseAtEndOfMediaItems(boolean r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r1.pauseAtEndOfMediaItems = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setPlaybackLooper(android.os.Looper r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r1.playbackLooper = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setPriorityTaskManager(@androidx.annotation.Nullable com.google.android.exoplayer2.util.PriorityTaskManager r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r1.priorityTaskManager = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setReleaseTimeoutMs(long r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r1.releaseTimeoutMs = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setRenderersFactory(com.google.android.exoplayer2.RenderersFactory r3) {
                r2 = this;
                boolean r0 = r2.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda4 r0 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda4
                r1 = 0
                r0.<init>(r3, r1)
                r2.renderersFactorySupplier = r0
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setSeekBackIncrementMs(@androidx.annotation.IntRange(from = 1) long r5) {
                r4 = this;
                r0 = 1
                r1 = 0
                int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r3 <= 0) goto L9
                r1 = 1
                goto La
            L9:
                r1 = 0
            La:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
                boolean r1 = r4.buildCalled
                r0 = r0 ^ r1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r4.seekBackIncrementMs = r5
                return r4
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setSeekForwardIncrementMs(@androidx.annotation.IntRange(from = 1) long r5) {
                r4 = this;
                r0 = 1
                r1 = 0
                int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r3 <= 0) goto L9
                r1 = 1
                goto La
            L9:
                r1 = 0
            La:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
                boolean r1 = r4.buildCalled
                r0 = r0 ^ r1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r4.seekForwardIncrementMs = r5
                return r4
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setSeekParameters(com.google.android.exoplayer2.SeekParameters r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
                com.google.android.exoplayer2.SeekParameters r2 = (com.google.android.exoplayer2.SeekParameters) r2
                r1.seekParameters = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setSkipSilenceEnabled(boolean r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r1.skipSilenceEnabled = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setTrackSelector(com.google.android.exoplayer2.trackselection.TrackSelector r3) {
                r2 = this;
                boolean r0 = r2.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda6 r0 = new com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda6
                r1 = 0
                r0.<init>(r3, r1)
                r2.trackSelectorSupplier = r0
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setUseLazyPreparation(boolean r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r1.useLazyPreparation = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setUsePlatformDiagnostics(boolean r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r1.usePlatformDiagnostics = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setVideoChangeFrameRateStrategy(int r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r1.videoChangeFrameRateStrategy = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setVideoScalingMode(int r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r1.videoScalingMode = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ExoPlayer.Builder setWakeMode(int r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r1.wakeMode = r2
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.Deprecated
    public interface DeviceComponent {
        @java.lang.Deprecated
        void decreaseDeviceVolume();

        @java.lang.Deprecated
        com.google.android.exoplayer2.DeviceInfo getDeviceInfo();

        @java.lang.Deprecated
        int getDeviceVolume();

        @java.lang.Deprecated
        void increaseDeviceVolume();

        @java.lang.Deprecated
        boolean isDeviceMuted();

        @java.lang.Deprecated
        void setDeviceMuted(boolean r1);

        @java.lang.Deprecated
        void setDeviceVolume(int r1);
    }

    @java.lang.Deprecated
    public interface TextComponent {
        @java.lang.Deprecated
        com.google.android.exoplayer2.text.CueGroup getCurrentCues();
    }

    @java.lang.Deprecated
    public interface VideoComponent {
        @java.lang.Deprecated
        void clearCameraMotionListener(com.google.android.exoplayer2.video.spherical.CameraMotionListener r1);

        @java.lang.Deprecated
        void clearVideoFrameMetadataListener(com.google.android.exoplayer2.video.VideoFrameMetadataListener r1);

        @java.lang.Deprecated
        void clearVideoSurface();

        @java.lang.Deprecated
        void clearVideoSurface(@androidx.annotation.Nullable android.view.Surface r1);

        @java.lang.Deprecated
        void clearVideoSurfaceHolder(@androidx.annotation.Nullable android.view.SurfaceHolder r1);

        @java.lang.Deprecated
        void clearVideoSurfaceView(@androidx.annotation.Nullable android.view.SurfaceView r1);

        @java.lang.Deprecated
        void clearVideoTextureView(@androidx.annotation.Nullable android.view.TextureView r1);

        @java.lang.Deprecated
        int getVideoChangeFrameRateStrategy();

        @java.lang.Deprecated
        int getVideoScalingMode();

        @java.lang.Deprecated
        com.google.android.exoplayer2.video.VideoSize getVideoSize();

        @java.lang.Deprecated
        void setCameraMotionListener(com.google.android.exoplayer2.video.spherical.CameraMotionListener r1);

        @java.lang.Deprecated
        void setVideoChangeFrameRateStrategy(int r1);

        @java.lang.Deprecated
        void setVideoFrameMetadataListener(com.google.android.exoplayer2.video.VideoFrameMetadataListener r1);

        @java.lang.Deprecated
        void setVideoScalingMode(int r1);

        @java.lang.Deprecated
        void setVideoSurface(@androidx.annotation.Nullable android.view.Surface r1);

        @java.lang.Deprecated
        void setVideoSurfaceHolder(@androidx.annotation.Nullable android.view.SurfaceHolder r1);

        @java.lang.Deprecated
        void setVideoSurfaceView(@androidx.annotation.Nullable android.view.SurfaceView r1);

        @java.lang.Deprecated
        void setVideoTextureView(@androidx.annotation.Nullable android.view.TextureView r1);
    }

    void addAnalyticsListener(com.google.android.exoplayer2.analytics.AnalyticsListener r1);

    void addAudioOffloadListener(com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener r1);

    void addMediaSource(int r1, com.google.android.exoplayer2.source.MediaSource r2);

    void addMediaSource(com.google.android.exoplayer2.source.MediaSource r1);

    void addMediaSources(int r1, java.util.List<com.google.android.exoplayer2.source.MediaSource> r2);

    void addMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> r1);

    void clearAuxEffectInfo();

    void clearCameraMotionListener(com.google.android.exoplayer2.video.spherical.CameraMotionListener r1);

    void clearVideoFrameMetadataListener(com.google.android.exoplayer2.video.VideoFrameMetadataListener r1);

    com.google.android.exoplayer2.PlayerMessage createMessage(com.google.android.exoplayer2.PlayerMessage.Target r1);

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean r1);

    com.google.android.exoplayer2.analytics.AnalyticsCollector getAnalyticsCollector();

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    com.google.android.exoplayer2.ExoPlayer.AudioComponent getAudioComponent();

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.decoder.DecoderCounters getAudioDecoderCounters();

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.Format getAudioFormat();

    int getAudioSessionId();

    com.google.android.exoplayer2.util.Clock getClock();

    @java.lang.Deprecated
    com.google.android.exoplayer2.source.TrackGroupArray getCurrentTrackGroups();

    @java.lang.Deprecated
    com.google.android.exoplayer2.trackselection.TrackSelectionArray getCurrentTrackSelections();

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    com.google.android.exoplayer2.ExoPlayer.DeviceComponent getDeviceComponent();

    boolean getPauseAtEndOfMediaItems();

    android.os.Looper getPlaybackLooper();

    @Override // com.google.android.exoplayer2.Player
    @androidx.annotation.Nullable
    com.google.android.exoplayer2.ExoPlaybackException getPlayerError();

    @Override // com.google.android.exoplayer2.Player
    @androidx.annotation.Nullable
    /* bridge */ /* synthetic */ com.google.android.exoplayer2.PlaybackException getPlayerError();

    com.google.android.exoplayer2.Renderer getRenderer(int r1);

    int getRendererCount();

    int getRendererType(int r1);

    com.google.android.exoplayer2.SeekParameters getSeekParameters();

    boolean getSkipSilenceEnabled();

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    com.google.android.exoplayer2.ExoPlayer.TextComponent getTextComponent();

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.trackselection.TrackSelector getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    com.google.android.exoplayer2.ExoPlayer.VideoComponent getVideoComponent();

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.decoder.DecoderCounters getVideoDecoderCounters();

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.Format getVideoFormat();

    int getVideoScalingMode();

    boolean isTunnelingEnabled();

    @java.lang.Deprecated
    void prepare(com.google.android.exoplayer2.source.MediaSource r1);

    @java.lang.Deprecated
    void prepare(com.google.android.exoplayer2.source.MediaSource r1, boolean r2, boolean r3);

    void removeAnalyticsListener(com.google.android.exoplayer2.analytics.AnalyticsListener r1);

    void removeAudioOffloadListener(com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener r1);

    @java.lang.Deprecated
    void retry();

    void setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes r1, boolean r2);

    void setAudioSessionId(int r1);

    void setAuxEffectInfo(com.google.android.exoplayer2.audio.AuxEffectInfo r1);

    void setCameraMotionListener(com.google.android.exoplayer2.video.spherical.CameraMotionListener r1);

    void setForegroundMode(boolean r1);

    void setHandleAudioBecomingNoisy(boolean r1);

    @java.lang.Deprecated
    void setHandleWakeLock(boolean r1);

    void setMediaSource(com.google.android.exoplayer2.source.MediaSource r1);

    void setMediaSource(com.google.android.exoplayer2.source.MediaSource r1, long r2);

    void setMediaSource(com.google.android.exoplayer2.source.MediaSource r1, boolean r2);

    void setMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> r1);

    void setMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> r1, int r2, long r3);

    void setMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> r1, boolean r2);

    void setPauseAtEndOfMediaItems(boolean r1);

    @androidx.annotation.RequiresApi(23)
    void setPreferredAudioDevice(@androidx.annotation.Nullable android.media.AudioDeviceInfo r1);

    void setPriorityTaskManager(@androidx.annotation.Nullable com.google.android.exoplayer2.util.PriorityTaskManager r1);

    void setSeekParameters(@androidx.annotation.Nullable com.google.android.exoplayer2.SeekParameters r1);

    void setShuffleOrder(com.google.android.exoplayer2.source.ShuffleOrder r1);

    void setSkipSilenceEnabled(boolean r1);

    void setVideoChangeFrameRateStrategy(int r1);

    void setVideoFrameMetadataListener(com.google.android.exoplayer2.video.VideoFrameMetadataListener r1);

    void setVideoScalingMode(int r1);

    void setWakeMode(int r1);
}
