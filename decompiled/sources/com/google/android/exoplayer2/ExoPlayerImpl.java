package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
final class ExoPlayerImpl extends com.google.android.exoplayer2.BasePlayer implements com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent, com.google.android.exoplayer2.ExoPlayer.VideoComponent, com.google.android.exoplayer2.ExoPlayer.TextComponent, com.google.android.exoplayer2.ExoPlayer.DeviceComponent {
    private static final java.lang.String TAG = "ExoPlayerImpl";
    private final com.google.android.exoplayer2.analytics.AnalyticsCollector analyticsCollector;
    private final android.content.Context applicationContext;
    private final android.os.Looper applicationLooper;
    private com.google.android.exoplayer2.audio.AudioAttributes audioAttributes;
    private final com.google.android.exoplayer2.AudioBecomingNoisyManager audioBecomingNoisyManager;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.decoder.DecoderCounters audioDecoderCounters;
    private final com.google.android.exoplayer2.AudioFocusManager audioFocusManager;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format audioFormat;
    private final java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener> audioOffloadListeners;
    private int audioSessionId;
    private com.google.android.exoplayer2.Player.Commands availableCommands;
    private final com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.video.spherical.CameraMotionListener cameraMotionListener;
    private final com.google.android.exoplayer2.util.Clock clock;
    private final com.google.android.exoplayer2.ExoPlayerImpl.ComponentListener componentListener;
    private final com.google.android.exoplayer2.util.ConditionVariable constructorFinished;
    private com.google.android.exoplayer2.text.CueGroup currentCueGroup;
    private final long detachSurfaceTimeoutMs;
    private com.google.android.exoplayer2.DeviceInfo deviceInfo;
    public final com.google.android.exoplayer2.trackselection.TrackSelectorResult emptyTrackSelectorResult;
    private boolean foregroundMode;
    private final com.google.android.exoplayer2.ExoPlayerImpl.FrameMetadataListener frameMetadataListener;
    private boolean hasNotifiedFullWrongThreadWarning;
    private final com.google.android.exoplayer2.ExoPlayerImplInternal internalPlayer;
    private boolean isPriorityTaskManagerRegistered;

    @androidx.annotation.Nullable
    private android.media.AudioTrack keepSessionIdAudioTrack;
    private final com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player.Listener> listeners;
    private int maskingPeriodIndex;
    private int maskingWindowIndex;
    private long maskingWindowPositionMs;
    private com.google.android.exoplayer2.MediaMetadata mediaMetadata;
    private final com.google.android.exoplayer2.source.MediaSource.Factory mediaSourceFactory;
    private final java.util.List<com.google.android.exoplayer2.ExoPlayerImpl.MediaSourceHolderSnapshot> mediaSourceHolderSnapshots;

    @androidx.annotation.Nullable
    private android.view.Surface ownedSurface;
    private boolean pauseAtEndOfMediaItems;
    private boolean pendingDiscontinuity;
    private int pendingDiscontinuityReason;
    private int pendingOperationAcks;
    private int pendingPlayWhenReadyChangeReason;
    private final com.google.android.exoplayer2.Timeline.Period period;
    public final com.google.android.exoplayer2.Player.Commands permanentAvailableCommands;
    private com.google.android.exoplayer2.PlaybackInfo playbackInfo;
    private final com.google.android.exoplayer2.util.HandlerWrapper playbackInfoUpdateHandler;
    private final com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private boolean playerReleased;
    private com.google.android.exoplayer2.MediaMetadata playlistMetadata;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager;
    private final com.google.android.exoplayer2.Renderer[] renderers;
    private int repeatMode;
    private final long seekBackIncrementMs;
    private final long seekForwardIncrementMs;
    private com.google.android.exoplayer2.SeekParameters seekParameters;
    private boolean shuffleModeEnabled;
    private com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder;
    private boolean skipSilenceEnabled;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView sphericalGLSurfaceView;
    private com.google.android.exoplayer2.MediaMetadata staticAndDynamicMediaMetadata;
    private final com.google.android.exoplayer2.StreamVolumeManager streamVolumeManager;

    @androidx.annotation.Nullable
    private android.view.SurfaceHolder surfaceHolder;
    private boolean surfaceHolderSurfaceIsVideoOutput;
    private com.google.android.exoplayer2.util.Size surfaceSize;

    @androidx.annotation.Nullable
    private android.view.TextureView textureView;
    private boolean throwsWhenUsingWrongThread;
    private final com.google.android.exoplayer2.trackselection.TrackSelector trackSelector;
    private final boolean useLazyPreparation;
    private int videoChangeFrameRateStrategy;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.decoder.DecoderCounters videoDecoderCounters;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format videoFormat;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.video.VideoFrameMetadataListener videoFrameMetadataListener;

    @androidx.annotation.Nullable
    private java.lang.Object videoOutput;
    private int videoScalingMode;
    private com.google.android.exoplayer2.video.VideoSize videoSize;
    private float volume;
    private final com.google.android.exoplayer2.WakeLockManager wakeLockManager;
    private final com.google.android.exoplayer2.WifiLockManager wifiLockManager;
    private final com.google.android.exoplayer2.Player wrappingPlayer;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayerImpl$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @androidx.annotation.RequiresApi(31)
    public static final class Api31 {
        private Api31() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static com.google.android.exoplayer2.analytics.PlayerId registerMediaMetricsListener(android.content.Context r0, com.google.android.exoplayer2.ExoPlayerImpl r1, boolean r2) {
                com.google.android.exoplayer2.analytics.MediaMetricsListener r0 = com.google.android.exoplayer2.analytics.MediaMetricsListener.create(r0)
                if (r0 != 0) goto L15
                java.lang.String r0 = "ExoPlayerImpl"
                java.lang.String r1 = "MediaMetricsService unavailable."
                com.google.android.exoplayer2.util.Log.w(r0, r1)
                com.google.android.exoplayer2.analytics.PlayerId r0 = new com.google.android.exoplayer2.analytics.PlayerId
                android.media.metrics.LogSessionId r1 = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE
                r0.<init>(r1)
                return r0
            L15:
                if (r2 == 0) goto L1a
                r1.addAnalyticsListener(r0)
            L1a:
                com.google.android.exoplayer2.analytics.PlayerId r1 = new com.google.android.exoplayer2.analytics.PlayerId
                android.media.metrics.LogSessionId r0 = r0.getLogSessionId()
                r1.<init>(r0)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public final class ComponentListener implements com.google.android.exoplayer2.video.VideoRendererEventListener, com.google.android.exoplayer2.audio.AudioRendererEventListener, com.google.android.exoplayer2.text.TextOutput, com.google.android.exoplayer2.metadata.MetadataOutput, android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener, com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener, com.google.android.exoplayer2.AudioFocusManager.PlayerControl, com.google.android.exoplayer2.AudioBecomingNoisyManager.EventListener, com.google.android.exoplayer2.StreamVolumeManager.Listener, com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener {
        public final /* synthetic */ com.google.android.exoplayer2.ExoPlayerImpl this$0;

        public static /* synthetic */ void $r8$lambda$HZOAricevDNUKKb0KBxzZasKe6E(com.google.android.exoplayer2.metadata.Metadata r0, com.google.android.exoplayer2.Player.Listener r1) {
                lambda$onMetadata$5(r0, r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$HdX8-5j9fh3Z_9KCQsK59i6Md_s, reason: not valid java name */
        public static /* synthetic */ void m161$r8$lambda$HdX85j9fh3Z_9KCQsK59i6Md_s(com.google.android.exoplayer2.video.VideoSize r0, com.google.android.exoplayer2.Player.Listener r1) {
                lambda$onVideoSizeChanged$0(r0, r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$UU2WiJJ71Y1L68zo-wM_jDDvneY, reason: not valid java name */
        public static /* synthetic */ void m162$r8$lambda$UU2WiJJ71Y1L68zowM_jDDvneY(int r0, boolean r1, com.google.android.exoplayer2.Player.Listener r2) {
                lambda$onStreamVolumeChanged$7(r0, r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$_a-BFihSlC5RQW56p-fQ8lB5y8w, reason: not valid java name */
        public static /* synthetic */ void m163$r8$lambda$_aBFihSlC5RQW56pfQ8lB5y8w(com.google.android.exoplayer2.text.CueGroup r0, com.google.android.exoplayer2.Player.Listener r1) {
                lambda$onCues$3(r0, r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$gctp5ihBvE1rmNFbswaKePXtqGQ(java.util.List r0, com.google.android.exoplayer2.Player.Listener r1) {
                lambda$onCues$2(r0, r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$pitVMvVzVidceF16ApRaB1pYLrY(com.google.android.exoplayer2.ExoPlayerImpl.ComponentListener r0, com.google.android.exoplayer2.Player.Listener r1) {
                r0.lambda$onMetadata$4(r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$sUcxyD-utLXGRaEs9oeNwJmrpLs, reason: not valid java name */
        public static /* synthetic */ void m164$r8$lambda$sUcxyDutLXGRaEs9oeNwJmrpLs(com.google.android.exoplayer2.DeviceInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
                lambda$onStreamTypeChanged$6(r0, r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$tyDvBM9tdSObJtQb09IfdDl7BMk(boolean r0, com.google.android.exoplayer2.Player.Listener r1) {
                lambda$onSkipSilenceEnabledChanged$1(r0, r1)
                return
        }

        private ComponentListener(com.google.android.exoplayer2.ExoPlayerImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ ComponentListener(com.google.android.exoplayer2.ExoPlayerImpl r1, com.google.android.exoplayer2.ExoPlayerImpl.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void lambda$onCues$2(java.util.List r0, com.google.android.exoplayer2.Player.Listener r1) {
                r1.onCues(r0)
                return
        }

        private static /* synthetic */ void lambda$onCues$3(com.google.android.exoplayer2.text.CueGroup r0, com.google.android.exoplayer2.Player.Listener r1) {
                r1.onCues(r0)
                return
        }

        private /* synthetic */ void lambda$onMetadata$4(com.google.android.exoplayer2.Player.Listener r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.MediaMetadata r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$1500(r0)
                r2.onMediaMetadataChanged(r0)
                return
        }

        private static /* synthetic */ void lambda$onMetadata$5(com.google.android.exoplayer2.metadata.Metadata r0, com.google.android.exoplayer2.Player.Listener r1) {
                r1.onMetadata(r0)
                return
        }

        private static /* synthetic */ void lambda$onSkipSilenceEnabledChanged$1(boolean r0, com.google.android.exoplayer2.Player.Listener r1) {
                r1.onSkipSilenceEnabledChanged(r0)
                return
        }

        private static /* synthetic */ void lambda$onStreamTypeChanged$6(com.google.android.exoplayer2.DeviceInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
                r1.onDeviceInfoChanged(r0)
                return
        }

        private static /* synthetic */ void lambda$onStreamVolumeChanged$7(int r0, boolean r1, com.google.android.exoplayer2.Player.Listener r2) {
                r2.onDeviceVolumeChanged(r0, r1)
                return
        }

        private static /* synthetic */ void lambda$onVideoSizeChanged$0(com.google.android.exoplayer2.video.VideoSize r0, com.google.android.exoplayer2.Player.Listener r1) {
                r1.onVideoSizeChanged(r0)
                return
        }

        @Override // com.google.android.exoplayer2.AudioFocusManager.PlayerControl
        public void executePlayerCommand(int r4) {
                r3 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r3.this$0
                boolean r0 = r0.getPlayWhenReady()
                com.google.android.exoplayer2.ExoPlayerImpl r1 = r3.this$0
                int r2 = com.google.android.exoplayer2.ExoPlayerImpl.access$2100(r0, r4)
                com.google.android.exoplayer2.ExoPlayerImpl.access$2200(r1, r0, r4, r2)
                return
        }

        @Override // com.google.android.exoplayer2.AudioBecomingNoisyManager.EventListener
        public void onAudioBecomingNoisy() {
                r4 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r4.this$0
                r1 = 0
                r2 = -1
                r3 = 3
                com.google.android.exoplayer2.ExoPlayerImpl.access$2200(r0, r1, r2, r3)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioCodecError(java.lang.Exception r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r0.onAudioCodecError(r2)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDecoderInitialized(java.lang.String r8, long r9, long r11) {
                r7 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r7.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r1 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r2 = r8
                r3 = r9
                r5 = r11
                r1.onAudioDecoderInitialized(r2, r3, r5)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDecoderReleased(java.lang.String r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r0.onAudioDecoderReleased(r2)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDisabled(com.google.android.exoplayer2.decoder.DecoderCounters r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r0.onAudioDisabled(r2)
                com.google.android.exoplayer2.ExoPlayerImpl r2 = r1.this$0
                r0 = 0
                com.google.android.exoplayer2.ExoPlayerImpl.access$1002(r2, r0)
                com.google.android.exoplayer2.ExoPlayerImpl r2 = r1.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$902(r2, r0)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioEnabled(com.google.android.exoplayer2.decoder.DecoderCounters r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$902(r0, r2)
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r0.onAudioEnabled(r2)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public final /* synthetic */ void onAudioInputFormatChanged(com.google.android.exoplayer2.Format r1) {
                r0 = this;
                com.google.android.exoplayer2.audio.AudioRendererEventListener.CC.$default$onAudioInputFormatChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioInputFormatChanged(com.google.android.exoplayer2.Format r2, @androidx.annotation.Nullable com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r3) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$1002(r0, r2)
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r0.onAudioInputFormatChanged(r2, r3)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioPositionAdvancing(long r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r0.onAudioPositionAdvancing(r2)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioSinkError(java.lang.Exception r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r0.onAudioSinkError(r2)
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioUnderrun(int r8, long r9, long r11) {
                r7 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r7.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r1 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r2 = r8
                r3 = r9
                r5 = r11
                r1.onAudioUnderrun(r2, r3, r5)
                return
        }

        @Override // com.google.android.exoplayer2.text.TextOutput
        public void onCues(com.google.android.exoplayer2.text.CueGroup r4) {
                r3 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r3.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$1202(r0, r4)
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r3.this$0
                com.google.android.exoplayer2.util.ListenerSet r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$700(r0)
                com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9 r1 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9
                r2 = 6
                r1.<init>(r4, r2)
                r4 = 27
                r0.sendEvent(r4, r1)
                return
        }

        @Override // com.google.android.exoplayer2.text.TextOutput
        public void onCues(java.util.List<com.google.android.exoplayer2.text.Cue> r4) {
                r3 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r3.this$0
                com.google.android.exoplayer2.util.ListenerSet r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$700(r0)
                com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9 r1 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9
                r2 = 4
                r1.<init>(r4, r2)
                r4 = 27
                r0.sendEvent(r4, r1)
                return
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onDroppedFrames(int r2, long r3) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r0.onDroppedFrames(r2, r3)
                return
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
        public final /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener.CC.$default$onExperimentalOffloadSchedulingEnabledChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
        public final /* synthetic */ void onExperimentalOffloadedPlayback(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener.CC.$default$onExperimentalOffloadedPlayback(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
        public void onExperimentalSleepingForOffloadChanged(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r1 = r0.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$2600(r1)
                return
        }

        @Override // com.google.android.exoplayer2.metadata.MetadataOutput
        public void onMetadata(com.google.android.exoplayer2.metadata.Metadata r5) {
                r4 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r4.this$0
                com.google.android.exoplayer2.MediaMetadata r1 = com.google.android.exoplayer2.ExoPlayerImpl.access$1300(r0)
                com.google.android.exoplayer2.MediaMetadata$Builder r1 = r1.buildUpon()
                com.google.android.exoplayer2.MediaMetadata$Builder r1 = r1.populateFromMetadata(r5)
                com.google.android.exoplayer2.MediaMetadata r1 = r1.build()
                com.google.android.exoplayer2.ExoPlayerImpl.access$1302(r0, r1)
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r4.this$0
                com.google.android.exoplayer2.MediaMetadata r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$1400(r0)
                com.google.android.exoplayer2.ExoPlayerImpl r1 = r4.this$0
                com.google.android.exoplayer2.MediaMetadata r1 = com.google.android.exoplayer2.ExoPlayerImpl.access$1500(r1)
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L3d
                com.google.android.exoplayer2.ExoPlayerImpl r1 = r4.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$1502(r1, r0)
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r4.this$0
                com.google.android.exoplayer2.util.ListenerSet r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$700(r0)
                r1 = 14
                com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9 r2 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9
                r3 = 2
                r2.<init>(r4, r3)
                r0.queueEvent(r1, r2)
            L3d:
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r4.this$0
                com.google.android.exoplayer2.util.ListenerSet r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$700(r0)
                r1 = 28
                com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9 r2 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9
                r3 = 3
                r2.<init>(r5, r3)
                r0.queueEvent(r1, r2)
                com.google.android.exoplayer2.ExoPlayerImpl r5 = r4.this$0
                com.google.android.exoplayer2.util.ListenerSet r5 = com.google.android.exoplayer2.ExoPlayerImpl.access$700(r5)
                r5.flushEvents()
                return
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onRenderedFirstFrame(java.lang.Object r2, long r3) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r0.onRenderedFirstFrame(r2, r3)
                com.google.android.exoplayer2.ExoPlayerImpl r3 = r1.this$0
                java.lang.Object r3 = com.google.android.exoplayer2.ExoPlayerImpl.access$800(r3)
                if (r3 != r2) goto L1e
                com.google.android.exoplayer2.ExoPlayerImpl r2 = r1.this$0
                com.google.android.exoplayer2.util.ListenerSet r2 = com.google.android.exoplayer2.ExoPlayerImpl.access$700(r2)
                r3 = 26
                com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r4 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$5
                r2.sendEvent(r3, r4)
            L1e:
                return
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onSkipSilenceEnabledChanged(boolean r5) {
                r4 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r4.this$0
                boolean r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$1100(r0)
                if (r0 != r5) goto L9
                return
            L9:
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r4.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$1102(r0, r5)
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r4.this$0
                com.google.android.exoplayer2.util.ListenerSet r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$700(r0)
                r1 = 23
                com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda6 r2 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda6
                r3 = 2
                r2.<init>(r5, r3)
                r0.sendEvent(r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.Listener
        public void onStreamTypeChanged(int r5) {
                r4 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r5 = r4.this$0
                com.google.android.exoplayer2.StreamVolumeManager r5 = com.google.android.exoplayer2.ExoPlayerImpl.access$2300(r5)
                com.google.android.exoplayer2.DeviceInfo r5 = com.google.android.exoplayer2.ExoPlayerImpl.access$2400(r5)
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r4.this$0
                com.google.android.exoplayer2.DeviceInfo r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$2500(r0)
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L2c
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r4.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$2502(r0, r5)
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r4.this$0
                com.google.android.exoplayer2.util.ListenerSet r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$700(r0)
                r1 = 29
                com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9 r2 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9
                r3 = 5
                r2.<init>(r5, r3)
                r0.sendEvent(r1, r2)
            L2c:
                return
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.Listener
        public void onStreamVolumeChanged(int r3, boolean r4) {
                r2 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r2.this$0
                com.google.android.exoplayer2.util.ListenerSet r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$700(r0)
                com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda0
                r1.<init>(r3, r4)
                r3 = 30
                r0.sendEvent(r3, r1)
                return
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r2, int r3, int r4) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$1900(r0, r2)
                com.google.android.exoplayer2.ExoPlayerImpl r2 = r1.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$1800(r2, r3, r4)
                return
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r2 = r1.this$0
                r0 = 0
                com.google.android.exoplayer2.ExoPlayerImpl.access$1700(r2, r0)
                com.google.android.exoplayer2.ExoPlayerImpl r2 = r1.this$0
                r0 = 0
                com.google.android.exoplayer2.ExoPlayerImpl.access$1800(r2, r0, r0)
                r2 = 1
                return r2
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture r1, int r2, int r3) {
                r0 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r1 = r0.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$1800(r1, r2, r3)
                return
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r1) {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoCodecError(java.lang.Exception r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r0.onVideoCodecError(r2)
                return
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDecoderInitialized(java.lang.String r8, long r9, long r11) {
                r7 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r7.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r1 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r2 = r8
                r3 = r9
                r5 = r11
                r1.onVideoDecoderInitialized(r2, r3, r5)
                return
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDecoderReleased(java.lang.String r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r0.onVideoDecoderReleased(r2)
                return
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDisabled(com.google.android.exoplayer2.decoder.DecoderCounters r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r0.onVideoDisabled(r2)
                com.google.android.exoplayer2.ExoPlayerImpl r2 = r1.this$0
                r0 = 0
                com.google.android.exoplayer2.ExoPlayerImpl.access$502(r2, r0)
                com.google.android.exoplayer2.ExoPlayerImpl r2 = r1.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$302(r2, r0)
                return
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoEnabled(com.google.android.exoplayer2.decoder.DecoderCounters r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$302(r0, r2)
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r0.onVideoEnabled(r2)
                return
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoFrameProcessingOffset(long r2, int r4) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r0.onVideoFrameProcessingOffset(r2, r4)
                return
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public final /* synthetic */ void onVideoInputFormatChanged(com.google.android.exoplayer2.Format r1) {
                r0 = this;
                com.google.android.exoplayer2.video.VideoRendererEventListener.CC.$default$onVideoInputFormatChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoInputFormatChanged(com.google.android.exoplayer2.Format r2, @androidx.annotation.Nullable com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r3) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$502(r0, r2)
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$400(r0)
                r0.onVideoInputFormatChanged(r2, r3)
                return
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoSizeChanged(com.google.android.exoplayer2.video.VideoSize r4) {
                r3 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r3.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$602(r0, r4)
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r3.this$0
                com.google.android.exoplayer2.util.ListenerSet r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$700(r0)
                com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9 r1 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9
                r2 = 7
                r1.<init>(r4, r2)
                r4 = 25
                r0.sendEvent(r4, r1)
                return
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceCreated(android.view.Surface r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$1700(r0, r2)
                return
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceDestroyed(android.view.Surface r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r2 = r1.this$0
                r0 = 0
                com.google.android.exoplayer2.ExoPlayerImpl.access$1700(r2, r0)
                return
        }

        @Override // com.google.android.exoplayer2.AudioFocusManager.PlayerControl
        public void setVolumeMultiplier(float r1) {
                r0 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r1 = r0.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$2000(r1)
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(android.view.SurfaceHolder r1, int r2, int r3, int r4) {
                r0 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r1 = r0.this$0
                com.google.android.exoplayer2.ExoPlayerImpl.access$1800(r1, r3, r4)
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(android.view.SurfaceHolder r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                boolean r0 = com.google.android.exoplayer2.ExoPlayerImpl.access$1600(r0)
                if (r0 == 0) goto L11
                com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.this$0
                android.view.Surface r2 = r2.getSurface()
                com.google.android.exoplayer2.ExoPlayerImpl.access$1700(r0, r2)
            L11:
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(android.view.SurfaceHolder r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayerImpl r2 = r1.this$0
                boolean r2 = com.google.android.exoplayer2.ExoPlayerImpl.access$1600(r2)
                if (r2 == 0) goto Le
                com.google.android.exoplayer2.ExoPlayerImpl r2 = r1.this$0
                r0 = 0
                com.google.android.exoplayer2.ExoPlayerImpl.access$1700(r2, r0)
            Le:
                com.google.android.exoplayer2.ExoPlayerImpl r2 = r1.this$0
                r0 = 0
                com.google.android.exoplayer2.ExoPlayerImpl.access$1800(r2, r0, r0)
                return
        }
    }

    public static final class FrameMetadataListener implements com.google.android.exoplayer2.video.VideoFrameMetadataListener, com.google.android.exoplayer2.video.spherical.CameraMotionListener, com.google.android.exoplayer2.PlayerMessage.Target {
        public static final int MSG_SET_CAMERA_MOTION_LISTENER = 8;
        public static final int MSG_SET_SPHERICAL_SURFACE_VIEW = 10000;
        public static final int MSG_SET_VIDEO_FRAME_METADATA_LISTENER = 7;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.video.spherical.CameraMotionListener cameraMotionListener;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.video.spherical.CameraMotionListener internalCameraMotionListener;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.video.VideoFrameMetadataListener internalVideoFrameMetadataListener;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.video.VideoFrameMetadataListener videoFrameMetadataListener;

        private FrameMetadataListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ FrameMetadataListener(com.google.android.exoplayer2.ExoPlayerImpl.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.exoplayer2.PlayerMessage.Target
        public void handleMessage(int r2, @androidx.annotation.Nullable java.lang.Object r3) {
                r1 = this;
                r0 = 7
                if (r2 == r0) goto L28
                r0 = 8
                if (r2 == r0) goto L23
                r0 = 10000(0x2710, float:1.4013E-41)
                if (r2 == r0) goto Lc
                goto L2c
            Lc:
                com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView r3 = (com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView) r3
                if (r3 != 0) goto L16
                r2 = 0
                r1.internalVideoFrameMetadataListener = r2
                r1.internalCameraMotionListener = r2
                goto L2c
            L16:
                com.google.android.exoplayer2.video.VideoFrameMetadataListener r2 = r3.getVideoFrameMetadataListener()
                r1.internalVideoFrameMetadataListener = r2
                com.google.android.exoplayer2.video.spherical.CameraMotionListener r2 = r3.getCameraMotionListener()
                r1.internalCameraMotionListener = r2
                goto L2c
            L23:
                com.google.android.exoplayer2.video.spherical.CameraMotionListener r3 = (com.google.android.exoplayer2.video.spherical.CameraMotionListener) r3
                r1.cameraMotionListener = r3
                goto L2c
            L28:
                com.google.android.exoplayer2.video.VideoFrameMetadataListener r3 = (com.google.android.exoplayer2.video.VideoFrameMetadataListener) r3
                r1.videoFrameMetadataListener = r3
            L2c:
                return
        }

        @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
        public void onCameraMotion(long r2, float[] r4) {
                r1 = this;
                com.google.android.exoplayer2.video.spherical.CameraMotionListener r0 = r1.internalCameraMotionListener
                if (r0 == 0) goto L7
                r0.onCameraMotion(r2, r4)
            L7:
                com.google.android.exoplayer2.video.spherical.CameraMotionListener r0 = r1.cameraMotionListener
                if (r0 == 0) goto Le
                r0.onCameraMotion(r2, r4)
            Le:
                return
        }

        @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
        public void onCameraMotionReset() {
                r1 = this;
                com.google.android.exoplayer2.video.spherical.CameraMotionListener r0 = r1.internalCameraMotionListener
                if (r0 == 0) goto L7
                r0.onCameraMotionReset()
            L7:
                com.google.android.exoplayer2.video.spherical.CameraMotionListener r0 = r1.cameraMotionListener
                if (r0 == 0) goto Le
                r0.onCameraMotionReset()
            Le:
                return
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameMetadataListener
        public void onVideoFrameAboutToBeRendered(long r9, long r11, com.google.android.exoplayer2.Format r13, @androidx.annotation.Nullable android.media.MediaFormat r14) {
                r8 = this;
                com.google.android.exoplayer2.video.VideoFrameMetadataListener r0 = r8.internalVideoFrameMetadataListener
                if (r0 == 0) goto Lb
                r1 = r9
                r3 = r11
                r5 = r13
                r6 = r14
                r0.onVideoFrameAboutToBeRendered(r1, r3, r5, r6)
            Lb:
                com.google.android.exoplayer2.video.VideoFrameMetadataListener r1 = r8.videoFrameMetadataListener
                if (r1 == 0) goto L16
                r2 = r9
                r4 = r11
                r6 = r13
                r7 = r14
                r1.onVideoFrameAboutToBeRendered(r2, r4, r6, r7)
            L16:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class MediaSourceHolderSnapshot implements com.google.android.exoplayer2.MediaSourceInfoHolder {
        private com.google.android.exoplayer2.Timeline timeline;
        private final java.lang.Object uid;

        public MediaSourceHolderSnapshot(java.lang.Object r1, com.google.android.exoplayer2.Timeline r2) {
                r0 = this;
                r0.<init>()
                r0.uid = r1
                r0.timeline = r2
                return
        }

        public static /* synthetic */ com.google.android.exoplayer2.Timeline access$202(com.google.android.exoplayer2.ExoPlayerImpl.MediaSourceHolderSnapshot r0, com.google.android.exoplayer2.Timeline r1) {
                r0.timeline = r1
                return r1
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public com.google.android.exoplayer2.Timeline getTimeline() {
                r1 = this;
                com.google.android.exoplayer2.Timeline r0 = r1.timeline
                return r0
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public java.lang.Object getUid() {
                r1 = this;
                java.lang.Object r0 = r1.uid
                return r0
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$-WBngl4De8sjkk-X-v8fJ5kqblA, reason: not valid java name */
    public static /* synthetic */ void m155$r8$lambda$WBngl4De8sjkkXv8fJ5kqblA(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$setTrackSelectionParameters$6(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$4-ODH6SgCaE7a2MHWdNxAf25uF0, reason: not valid java name */
    public static /* synthetic */ void m156$r8$lambda$4ODH6SgCaE7a2MHWdNxAf25uF0(boolean r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$setShuffleModeEnabled$4(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$6OVtL2ByZP7uX5DHJZE8DEuKqxg(com.google.android.exoplayer2.PlaybackInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updatePlaybackInfo$15(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$FaN7Odt_OJn5xWFlmhnR2OmiNMg(com.google.android.exoplayer2.ExoPlayerImpl r0, com.google.android.exoplayer2.Player.Listener r1, com.google.android.exoplayer2.util.FlagSet r2) {
            r0.lambda$new$0(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$I901JsR_QLuK0LV35Btc2XRv63U(float r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$setVolume$10(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$JMZYE8BS5JrcRcMWt4XwV6R1ihc(com.google.android.exoplayer2.PlaybackInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updatePlaybackInfo$21(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$KI01NQgkBscS_W9aEJjB4RBqq08(boolean r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$setSkipSilenceEnabled$11(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$KoC5v59mX1T0a1kRs8oYEUinRxU(com.google.android.exoplayer2.PlaybackInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updatePlaybackInfo$17(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$LEzBBscn-_l3k3Wp16Yiv1NbVFo, reason: not valid java name */
    public static /* synthetic */ void m157$r8$lambda$LEzBBscn_l3k3Wp16Yiv1NbVFo(int r0, int r1, com.google.android.exoplayer2.Player.Listener r2) {
            lambda$maybeNotifySurfaceSizeChanged$27(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$P8O734lk3GR2QjgJThoJC1FyTNc(com.google.android.exoplayer2.PlaybackInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updatePlaybackInfo$23(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$PTaOVsV5oHrtgPSYcAJzF8qpPJk(com.google.android.exoplayer2.PlaybackInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updatePlaybackInfo$25(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Q2FCXw0oBKQUBwxN9rxfq490veY(com.google.android.exoplayer2.PlaybackInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updatePlaybackInfo$24(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$UGonDv6BAUvUZhnH6JcBbtzOfRs(com.google.android.exoplayer2.PlaybackInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updatePlaybackInfo$16(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$ZvZZ5dY_PSUTkrxZ4N2V_kASjtc(com.google.android.exoplayer2.PlaybackInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updatePlaybackInfo$20(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$_fDKcLMFsI6W3dqufi3IgX6ZgeE(com.google.android.exoplayer2.ExoPlayerImpl r0, com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate r1) {
            r0.lambda$new$2(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$algpPrtD-ZKm0JDTv21lpQ8EQzI, reason: not valid java name */
    public static /* synthetic */ void m158$r8$lambda$algpPrtDZKm0JDTv21lpQ8EQzI(int r0, com.google.android.exoplayer2.Player.PositionInfo r1, com.google.android.exoplayer2.Player.PositionInfo r2, com.google.android.exoplayer2.Player.Listener r3) {
            lambda$updatePlaybackInfo$13(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$cBuHNsZypGkQ1KYotO__eto6EPQ(com.google.android.exoplayer2.audio.AudioAttributes r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$setAudioAttributes$8(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$fcumvguftdMoxBsAkjCH0Vaqgrk(int r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$setAudioSessionId$9(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$gxZyoFETB7c7E7EoPjPOW1X1BrY(com.google.android.exoplayer2.MediaMetadata r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updatePlaybackInfo$18(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$hYDMtEQJ0aCOwH1qaXaj1gkqUZ8(com.google.android.exoplayer2.ExoPlayerImpl r0, com.google.android.exoplayer2.Player.Listener r1) {
            r0.lambda$updateAvailableCommands$26(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$iJjdqrTFCQkiWSJ0NMBcwsriO2M(int r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$setRepeatMode$3(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$iOATGEkasG8901G_1NGIbMM62eM(com.google.android.exoplayer2.ExoPlayerImpl r0, com.google.android.exoplayer2.Player.Listener r1) {
            r0.lambda$setPlaylistMetadata$7(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$kGyD8wJ-zq1Xdi0qkdvChl0sF3I, reason: not valid java name */
    public static /* synthetic */ void m159$r8$lambda$kGyD8wJzq1Xdi0qkdvChl0sF3I(com.google.android.exoplayer2.MediaItem r0, int r1, com.google.android.exoplayer2.Player.Listener r2) {
            lambda$updatePlaybackInfo$14(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$kYui6b1Cm83Kk3TclWz2vbRb_gQ(com.google.android.exoplayer2.PlaybackInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updatePlaybackInfo$19(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$mCYQfy342yJtmHOPlWY2PP6AubE(com.google.android.exoplayer2.PlaybackInfo r0, int r1, com.google.android.exoplayer2.Player.Listener r2) {
            lambda$updatePlaybackInfo$12(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$mmvudecqiJgKISRfILg_QG9WU-M, reason: not valid java name */
    public static /* synthetic */ void m160$r8$lambda$mmvudecqiJgKISRfILg_QG9WUM(com.google.android.exoplayer2.Player.Listener r0) {
            lambda$release$5(r0)
            return
    }

    public static /* synthetic */ void $r8$lambda$nOBJYkeEQ2uz3sBKLToLWmzrgZk(com.google.android.exoplayer2.ExoPlayerImpl r0, com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate r1) {
            r0.lambda$new$1(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$xPRvbbAFEXpRipm4zHUUlaXa8_c(com.google.android.exoplayer2.PlaybackInfo r0, int r1, com.google.android.exoplayer2.Player.Listener r2) {
            lambda$updatePlaybackInfo$22(r0, r1, r2)
            return
    }

    static {
            java.lang.String r0 = "goog.exo.exoplayer"
            com.google.android.exoplayer2.ExoPlayerLibraryInfo.registerModule(r0)
            return
    }

    @android.annotation.SuppressLint({"HandlerLeak"})
    public ExoPlayerImpl(com.google.android.exoplayer2.ExoPlayer.Builder r40, @androidx.annotation.Nullable com.google.android.exoplayer2.Player r41) {
            r39 = this;
            r1 = r39
            r0 = r40
            r39.<init>()
            com.google.android.exoplayer2.util.ConditionVariable r2 = new com.google.android.exoplayer2.util.ConditionVariable
            r2.<init>()
            r1.constructorFinished = r2
            java.lang.String r3 = "ExoPlayerImpl"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L349
            r4.<init>()     // Catch: java.lang.Throwable -> L349
            java.lang.String r5 = "Init "
            r4.append(r5)     // Catch: java.lang.Throwable -> L349
            int r5 = java.lang.System.identityHashCode(r39)     // Catch: java.lang.Throwable -> L349
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.Throwable -> L349
            r4.append(r5)     // Catch: java.lang.Throwable -> L349
            java.lang.String r5 = " ["
            r4.append(r5)     // Catch: java.lang.Throwable -> L349
            java.lang.String r5 = "ExoPlayerLib/2.18.6"
            r4.append(r5)     // Catch: java.lang.Throwable -> L349
            java.lang.String r5 = "] ["
            r4.append(r5)     // Catch: java.lang.Throwable -> L349
            java.lang.String r5 = com.google.android.exoplayer2.util.Util.DEVICE_DEBUG_INFO     // Catch: java.lang.Throwable -> L349
            r4.append(r5)     // Catch: java.lang.Throwable -> L349
            java.lang.String r5 = "]"
            r4.append(r5)     // Catch: java.lang.Throwable -> L349
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.util.Log.i(r3, r4)     // Catch: java.lang.Throwable -> L349
            android.content.Context r3 = r0.context     // Catch: java.lang.Throwable -> L349
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L349
            r1.applicationContext = r3     // Catch: java.lang.Throwable -> L349
            com.google.common.base.Function<com.google.android.exoplayer2.util.Clock, com.google.android.exoplayer2.analytics.AnalyticsCollector> r4 = r0.analyticsCollectorFunction     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.util.Clock r5 = r0.clock     // Catch: java.lang.Throwable -> L349
            java.lang.Object r4 = r4.apply(r5)     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.analytics.AnalyticsCollector r4 = (com.google.android.exoplayer2.analytics.AnalyticsCollector) r4     // Catch: java.lang.Throwable -> L349
            r1.analyticsCollector = r4     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.util.PriorityTaskManager r5 = r0.priorityTaskManager     // Catch: java.lang.Throwable -> L349
            r1.priorityTaskManager = r5     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.audio.AudioAttributes r5 = r0.audioAttributes     // Catch: java.lang.Throwable -> L349
            r1.audioAttributes = r5     // Catch: java.lang.Throwable -> L349
            int r5 = r0.videoScalingMode     // Catch: java.lang.Throwable -> L349
            r1.videoScalingMode = r5     // Catch: java.lang.Throwable -> L349
            int r5 = r0.videoChangeFrameRateStrategy     // Catch: java.lang.Throwable -> L349
            r1.videoChangeFrameRateStrategy = r5     // Catch: java.lang.Throwable -> L349
            boolean r5 = r0.skipSilenceEnabled     // Catch: java.lang.Throwable -> L349
            r1.skipSilenceEnabled = r5     // Catch: java.lang.Throwable -> L349
            long r5 = r0.detachSurfaceTimeoutMs     // Catch: java.lang.Throwable -> L349
            r1.detachSurfaceTimeoutMs = r5     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener r15 = new com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener     // Catch: java.lang.Throwable -> L349
            r14 = 0
            r15.<init>(r1, r14)     // Catch: java.lang.Throwable -> L349
            r1.componentListener = r15     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.ExoPlayerImpl$FrameMetadataListener r13 = new com.google.android.exoplayer2.ExoPlayerImpl$FrameMetadataListener     // Catch: java.lang.Throwable -> L349
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L349
            r1.frameMetadataListener = r13     // Catch: java.lang.Throwable -> L349
            android.os.Handler r6 = new android.os.Handler     // Catch: java.lang.Throwable -> L349
            android.os.Looper r5 = r0.looper     // Catch: java.lang.Throwable -> L349
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L349
            com.google.common.base.Supplier<com.google.android.exoplayer2.RenderersFactory> r5 = r0.renderersFactorySupplier     // Catch: java.lang.Throwable -> L349
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L349
            r7 = r5
            com.google.android.exoplayer2.RenderersFactory r7 = (com.google.android.exoplayer2.RenderersFactory) r7     // Catch: java.lang.Throwable -> L349
            r8 = r6
            r9 = r15
            r10 = r15
            r11 = r15
            r12 = r15
            com.google.android.exoplayer2.Renderer[] r7 = r7.createRenderers(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L349
            r1.renderers = r7     // Catch: java.lang.Throwable -> L349
            int r5 = r7.length     // Catch: java.lang.Throwable -> L349
            r12 = 0
            if (r5 <= 0) goto La1
            r5 = 1
            goto La2
        La1:
            r5 = 0
        La2:
            com.google.android.exoplayer2.util.Assertions.checkState(r5)     // Catch: java.lang.Throwable -> L349
            com.google.common.base.Supplier<com.google.android.exoplayer2.trackselection.TrackSelector> r5 = r0.trackSelectorSupplier     // Catch: java.lang.Throwable -> L349
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L349
            r10 = r5
            com.google.android.exoplayer2.trackselection.TrackSelector r10 = (com.google.android.exoplayer2.trackselection.TrackSelector) r10     // Catch: java.lang.Throwable -> L349
            r1.trackSelector = r10     // Catch: java.lang.Throwable -> L349
            com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource$Factory> r5 = r0.mediaSourceFactorySupplier     // Catch: java.lang.Throwable -> L349
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.source.MediaSource$Factory r5 = (com.google.android.exoplayer2.source.MediaSource.Factory) r5     // Catch: java.lang.Throwable -> L349
            r1.mediaSourceFactory = r5     // Catch: java.lang.Throwable -> L349
            com.google.common.base.Supplier<com.google.android.exoplayer2.upstream.BandwidthMeter> r5 = r0.bandwidthMeterSupplier     // Catch: java.lang.Throwable -> L349
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L349
            r9 = r5
            com.google.android.exoplayer2.upstream.BandwidthMeter r9 = (com.google.android.exoplayer2.upstream.BandwidthMeter) r9     // Catch: java.lang.Throwable -> L349
            r1.bandwidthMeter = r9     // Catch: java.lang.Throwable -> L349
            boolean r5 = r0.useLazyPreparation     // Catch: java.lang.Throwable -> L349
            r1.useLazyPreparation = r5     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.SeekParameters r5 = r0.seekParameters     // Catch: java.lang.Throwable -> L349
            r1.seekParameters = r5     // Catch: java.lang.Throwable -> L349
            r16 = r15
            long r14 = r0.seekBackIncrementMs     // Catch: java.lang.Throwable -> L349
            r1.seekBackIncrementMs = r14     // Catch: java.lang.Throwable -> L349
            long r14 = r0.seekForwardIncrementMs     // Catch: java.lang.Throwable -> L349
            r1.seekForwardIncrementMs = r14     // Catch: java.lang.Throwable -> L349
            boolean r5 = r0.pauseAtEndOfMediaItems     // Catch: java.lang.Throwable -> L349
            r1.pauseAtEndOfMediaItems = r5     // Catch: java.lang.Throwable -> L349
            android.os.Looper r15 = r0.looper     // Catch: java.lang.Throwable -> L349
            r1.applicationLooper = r15     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.util.Clock r14 = r0.clock     // Catch: java.lang.Throwable -> L349
            r1.clock = r14     // Catch: java.lang.Throwable -> L349
            if (r41 != 0) goto Le7
            r5 = r1
            goto Le9
        Le7:
            r5 = r41
        Le9:
            r1.wrappingPlayer = r5     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.util.ListenerSet r8 = new com.google.android.exoplayer2.util.ListenerSet     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda10 r11 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda10     // Catch: java.lang.Throwable -> L349
            r11.<init>(r1, r12)     // Catch: java.lang.Throwable -> L349
            r8.<init>(r15, r14, r11)     // Catch: java.lang.Throwable -> L349
            r1.listeners = r8     // Catch: java.lang.Throwable -> L349
            java.util.concurrent.CopyOnWriteArraySet r8 = new java.util.concurrent.CopyOnWriteArraySet     // Catch: java.lang.Throwable -> L349
            r8.<init>()     // Catch: java.lang.Throwable -> L349
            r1.audioOffloadListeners = r8     // Catch: java.lang.Throwable -> L349
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L349
            r8.<init>()     // Catch: java.lang.Throwable -> L349
            r1.mediaSourceHolderSnapshots = r8     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.source.ShuffleOrder$DefaultShuffleOrder r8 = new com.google.android.exoplayer2.source.ShuffleOrder$DefaultShuffleOrder     // Catch: java.lang.Throwable -> L349
            r8.<init>(r12)     // Catch: java.lang.Throwable -> L349
            r1.shuffleOrder = r8     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r8 = new com.google.android.exoplayer2.trackselection.TrackSelectorResult     // Catch: java.lang.Throwable -> L349
            int r11 = r7.length     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.RendererConfiguration[] r11 = new com.google.android.exoplayer2.RendererConfiguration[r11]     // Catch: java.lang.Throwable -> L349
            int r12 = r7.length     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r12 = new com.google.android.exoplayer2.trackselection.ExoTrackSelection[r12]     // Catch: java.lang.Throwable -> L349
            r20 = r6
            com.google.android.exoplayer2.Tracks r6 = com.google.android.exoplayer2.Tracks.EMPTY     // Catch: java.lang.Throwable -> L349
            r21 = r9
            r9 = 0
            r8.<init>(r11, r12, r6, r9)     // Catch: java.lang.Throwable -> L349
            r1.emptyTrackSelectorResult = r8     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.Timeline$Period r6 = new com.google.android.exoplayer2.Timeline$Period     // Catch: java.lang.Throwable -> L349
            r6.<init>()     // Catch: java.lang.Throwable -> L349
            r1.period = r6     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.Player$Commands$Builder r6 = new com.google.android.exoplayer2.Player$Commands$Builder     // Catch: java.lang.Throwable -> L349
            r6.<init>()     // Catch: java.lang.Throwable -> L349
            r12 = 21
            int[] r9 = new int[r12]     // Catch: java.lang.Throwable -> L349
            r11 = 1
            r19 = 0
            r9[r19] = r11     // Catch: java.lang.Throwable -> L349
            r12 = 2
            r9[r11] = r12     // Catch: java.lang.Throwable -> L349
            r11 = 3
            r9[r12] = r11     // Catch: java.lang.Throwable -> L349
            r22 = 13
            r9[r11] = r22     // Catch: java.lang.Throwable -> L349
            r23 = 14
            r24 = r2
            r2 = 4
            r9[r2] = r23     // Catch: java.lang.Throwable -> L349
            r25 = 15
            r2 = 5
            r9[r2] = r25     // Catch: java.lang.Throwable -> L349
            r26 = 16
            r2 = 6
            r9[r2] = r26     // Catch: java.lang.Throwable -> L349
            r27 = 17
            r2 = 7
            r9[r2] = r27     // Catch: java.lang.Throwable -> L349
            r28 = 18
            r2 = 8
            r9[r2] = r28     // Catch: java.lang.Throwable -> L349
            r29 = 19
            r2 = 9
            r9[r2] = r29     // Catch: java.lang.Throwable -> L349
            r11 = 31
            r2 = 10
            r9[r2] = r11     // Catch: java.lang.Throwable -> L349
            r30 = 11
            r31 = 20
            r9[r30] = r31     // Catch: java.lang.Throwable -> L349
            r30 = 12
            r32 = 30
            r9[r30] = r32     // Catch: java.lang.Throwable -> L349
            r30 = 21
            r9[r22] = r30     // Catch: java.lang.Throwable -> L349
            r22 = 22
            r9[r23] = r22     // Catch: java.lang.Throwable -> L349
            r22 = 23
            r9[r25] = r22     // Catch: java.lang.Throwable -> L349
            r22 = 24
            r9[r26] = r22     // Catch: java.lang.Throwable -> L349
            r22 = 25
            r9[r27] = r22     // Catch: java.lang.Throwable -> L349
            r22 = 26
            r9[r28] = r22     // Catch: java.lang.Throwable -> L349
            r22 = 27
            r9[r29] = r22     // Catch: java.lang.Throwable -> L349
            r22 = 28
            r9[r31] = r22     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.Player$Commands$Builder r6 = r6.addAll(r9)     // Catch: java.lang.Throwable -> L349
            r9 = 29
            boolean r12 = r10.isSetParametersSupported()     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.Player$Commands$Builder r6 = r6.addIf(r9, r12)     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.Player$Commands r6 = r6.build()     // Catch: java.lang.Throwable -> L349
            r1.permanentAvailableCommands = r6     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.Player$Commands$Builder r9 = new com.google.android.exoplayer2.Player$Commands$Builder     // Catch: java.lang.Throwable -> L349
            r9.<init>()     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.Player$Commands$Builder r6 = r9.addAll(r6)     // Catch: java.lang.Throwable -> L349
            r9 = 4
            com.google.android.exoplayer2.Player$Commands$Builder r6 = r6.add(r9)     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.Player$Commands$Builder r6 = r6.add(r2)     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.Player$Commands r6 = r6.build()     // Catch: java.lang.Throwable -> L349
            r1.availableCommands = r6     // Catch: java.lang.Throwable -> L349
            r12 = 0
            com.google.android.exoplayer2.util.HandlerWrapper r6 = r14.createHandler(r15, r12)     // Catch: java.lang.Throwable -> L349
            r1.playbackInfoUpdateHandler = r6     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda10 r9 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda10     // Catch: java.lang.Throwable -> L349
            r6 = 1
            r9.<init>(r1, r6)     // Catch: java.lang.Throwable -> L349
            r1.playbackInfoUpdateListener = r9     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.PlaybackInfo r6 = com.google.android.exoplayer2.PlaybackInfo.createDummy(r8)     // Catch: java.lang.Throwable -> L349
            r1.playbackInfo = r6     // Catch: java.lang.Throwable -> L349
            r4.setPlayer(r5, r15)     // Catch: java.lang.Throwable -> L349
            int r6 = com.google.android.exoplayer2.util.Util.SDK_INT     // Catch: java.lang.Throwable -> L349
            if (r6 >= r11) goto L1e1
            com.google.android.exoplayer2.analytics.PlayerId r5 = new com.google.android.exoplayer2.analytics.PlayerId     // Catch: java.lang.Throwable -> L349
            r5.<init>()     // Catch: java.lang.Throwable -> L349
            goto L1e7
        L1e1:
            boolean r5 = r0.usePlatformDiagnostics     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.analytics.PlayerId r5 = com.google.android.exoplayer2.ExoPlayerImpl.Api31.registerMediaMetricsListener(r3, r1, r5)     // Catch: java.lang.Throwable -> L349
        L1e7:
            r22 = r5
            com.google.android.exoplayer2.ExoPlayerImplInternal r11 = new com.google.android.exoplayer2.ExoPlayerImplInternal     // Catch: java.lang.Throwable -> L349
            com.google.common.base.Supplier<com.google.android.exoplayer2.LoadControl> r5 = r0.loadControlSupplier     // Catch: java.lang.Throwable -> L349
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L349
            r17 = r5
            com.google.android.exoplayer2.LoadControl r17 = (com.google.android.exoplayer2.LoadControl) r17     // Catch: java.lang.Throwable -> L349
            int r5 = r1.repeatMode     // Catch: java.lang.Throwable -> L349
            boolean r12 = r1.shuffleModeEnabled     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.SeekParameters r2 = r1.seekParameters     // Catch: java.lang.Throwable -> L349
            r26 = r15
            com.google.android.exoplayer2.LivePlaybackSpeedControl r15 = r0.livePlaybackSpeedControl     // Catch: java.lang.Throwable -> L349
            r28 = r2
            r27 = r3
            long r2 = r0.releaseTimeoutMs     // Catch: java.lang.Throwable -> L349
            r31 = r2
            boolean r2 = r1.pauseAtEndOfMediaItems     // Catch: java.lang.Throwable -> L349
            android.os.Looper r3 = r0.playbackLooper     // Catch: java.lang.Throwable -> L349
            r29 = r5
            r5 = r11
            r0 = r6
            r33 = r20
            r18 = 1
            r6 = r7
            r7 = r10
            r34 = r21
            r21 = r9
            r9 = r17
            r35 = r10
            r10 = r34
            r36 = r0
            r0 = r11
            r11 = r29
            r17 = 0
            r37 = r13
            r13 = r4
            r20 = r14
            r29 = r17
            r14 = r28
            r38 = r16
            r16 = r31
            r18 = r2
            r19 = r26
            r23 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L349
            r1.internalPlayer = r0     // Catch: java.lang.Throwable -> L349
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.volume = r2     // Catch: java.lang.Throwable -> L349
            r2 = 0
            r1.repeatMode = r2     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.MediaMetadata r3 = com.google.android.exoplayer2.MediaMetadata.EMPTY     // Catch: java.lang.Throwable -> L349
            r1.mediaMetadata = r3     // Catch: java.lang.Throwable -> L349
            r1.playlistMetadata = r3     // Catch: java.lang.Throwable -> L349
            r1.staticAndDynamicMediaMetadata = r3     // Catch: java.lang.Throwable -> L349
            r3 = -1
            r1.maskingWindowIndex = r3     // Catch: java.lang.Throwable -> L349
            r3 = r36
            r5 = 21
            if (r3 >= r5) goto L25d
            int r3 = r1.initializeKeepSessionIdAudioTrack(r2)     // Catch: java.lang.Throwable -> L349
            r1.audioSessionId = r3     // Catch: java.lang.Throwable -> L349
            goto L263
        L25d:
            int r3 = com.google.android.exoplayer2.util.Util.generateAudioSessionIdV21(r27)     // Catch: java.lang.Throwable -> L349
            r1.audioSessionId = r3     // Catch: java.lang.Throwable -> L349
        L263:
            com.google.android.exoplayer2.text.CueGroup r3 = com.google.android.exoplayer2.text.CueGroup.EMPTY_TIME_ZERO     // Catch: java.lang.Throwable -> L349
            r1.currentCueGroup = r3     // Catch: java.lang.Throwable -> L349
            r3 = 1
            r1.throwsWhenUsingWrongThread = r3     // Catch: java.lang.Throwable -> L349
            r1.addListener(r4)     // Catch: java.lang.Throwable -> L349
            android.os.Handler r5 = new android.os.Handler     // Catch: java.lang.Throwable -> L349
            r6 = r26
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L349
            r6 = r34
            r6.addEventListener(r5, r4)     // Catch: java.lang.Throwable -> L349
            r4 = r38
            r1.addAudioOffloadListener(r4)     // Catch: java.lang.Throwable -> L349
            r5 = r40
            long r6 = r5.foregroundModeTimeoutMs     // Catch: java.lang.Throwable -> L349
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L28b
            r0.experimentalSetForegroundModeTimeoutMs(r6)     // Catch: java.lang.Throwable -> L349
        L28b:
            com.google.android.exoplayer2.AudioBecomingNoisyManager r0 = new com.google.android.exoplayer2.AudioBecomingNoisyManager     // Catch: java.lang.Throwable -> L349
            android.content.Context r6 = r5.context     // Catch: java.lang.Throwable -> L349
            r7 = r33
            r0.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L349
            r1.audioBecomingNoisyManager = r0     // Catch: java.lang.Throwable -> L349
            boolean r6 = r5.handleAudioBecomingNoisy     // Catch: java.lang.Throwable -> L349
            r0.setEnabled(r6)     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.AudioFocusManager r0 = new com.google.android.exoplayer2.AudioFocusManager     // Catch: java.lang.Throwable -> L349
            android.content.Context r6 = r5.context     // Catch: java.lang.Throwable -> L349
            r0.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L349
            r1.audioFocusManager = r0     // Catch: java.lang.Throwable -> L349
            boolean r6 = r5.handleAudioFocus     // Catch: java.lang.Throwable -> L349
            if (r6 == 0) goto L2ab
            com.google.android.exoplayer2.audio.AudioAttributes r14 = r1.audioAttributes     // Catch: java.lang.Throwable -> L349
            goto L2ad
        L2ab:
            r14 = r29
        L2ad:
            r0.setAudioAttributes(r14)     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.StreamVolumeManager r0 = new com.google.android.exoplayer2.StreamVolumeManager     // Catch: java.lang.Throwable -> L349
            android.content.Context r6 = r5.context     // Catch: java.lang.Throwable -> L349
            r0.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L349
            r1.streamVolumeManager = r0     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.audio.AudioAttributes r4 = r1.audioAttributes     // Catch: java.lang.Throwable -> L349
            int r4 = r4.usage     // Catch: java.lang.Throwable -> L349
            int r4 = com.google.android.exoplayer2.util.Util.getStreamTypeForAudioUsage(r4)     // Catch: java.lang.Throwable -> L349
            r0.setStreamType(r4)     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.WakeLockManager r4 = new com.google.android.exoplayer2.WakeLockManager     // Catch: java.lang.Throwable -> L349
            android.content.Context r6 = r5.context     // Catch: java.lang.Throwable -> L349
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L349
            r1.wakeLockManager = r4     // Catch: java.lang.Throwable -> L349
            int r6 = r5.wakeMode     // Catch: java.lang.Throwable -> L349
            if (r6 == 0) goto L2d3
            r12 = 1
            goto L2d4
        L2d3:
            r12 = 0
        L2d4:
            r4.setEnabled(r12)     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.WifiLockManager r4 = new com.google.android.exoplayer2.WifiLockManager     // Catch: java.lang.Throwable -> L349
            android.content.Context r6 = r5.context     // Catch: java.lang.Throwable -> L349
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L349
            r1.wifiLockManager = r4     // Catch: java.lang.Throwable -> L349
            int r5 = r5.wakeMode     // Catch: java.lang.Throwable -> L349
            r6 = 2
            if (r5 != r6) goto L2e7
            r12 = 1
            goto L2e8
        L2e7:
            r12 = 0
        L2e8:
            r4.setEnabled(r12)     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.DeviceInfo r0 = createDeviceInfo(r0)     // Catch: java.lang.Throwable -> L349
            r1.deviceInfo = r0     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.video.VideoSize r0 = com.google.android.exoplayer2.video.VideoSize.UNKNOWN     // Catch: java.lang.Throwable -> L349
            r1.videoSize = r0     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.util.Size r0 = com.google.android.exoplayer2.util.Size.UNKNOWN     // Catch: java.lang.Throwable -> L349
            r1.surfaceSize = r0     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.audio.AudioAttributes r0 = r1.audioAttributes     // Catch: java.lang.Throwable -> L349
            r5 = r35
            r5.setAudioAttributes(r0)     // Catch: java.lang.Throwable -> L349
            int r0 = r1.audioSessionId     // Catch: java.lang.Throwable -> L349
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L349
            r2 = 10
            r1.sendRendererMessage(r3, r2, r0)     // Catch: java.lang.Throwable -> L349
            int r0 = r1.audioSessionId     // Catch: java.lang.Throwable -> L349
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L349
            r1.sendRendererMessage(r6, r2, r0)     // Catch: java.lang.Throwable -> L349
            com.google.android.exoplayer2.audio.AudioAttributes r0 = r1.audioAttributes     // Catch: java.lang.Throwable -> L349
            r2 = 3
            r1.sendRendererMessage(r3, r2, r0)     // Catch: java.lang.Throwable -> L349
            int r0 = r1.videoScalingMode     // Catch: java.lang.Throwable -> L349
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L349
            r2 = 4
            r1.sendRendererMessage(r6, r2, r0)     // Catch: java.lang.Throwable -> L349
            int r0 = r1.videoChangeFrameRateStrategy     // Catch: java.lang.Throwable -> L349
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L349
            r2 = 5
            r1.sendRendererMessage(r6, r2, r0)     // Catch: java.lang.Throwable -> L349
            boolean r0 = r1.skipSilenceEnabled     // Catch: java.lang.Throwable -> L349
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L349
            r2 = 9
            r1.sendRendererMessage(r3, r2, r0)     // Catch: java.lang.Throwable -> L349
            r0 = r37
            r2 = 7
            r1.sendRendererMessage(r6, r2, r0)     // Catch: java.lang.Throwable -> L349
            r2 = 8
            r3 = 6
            r1.sendRendererMessage(r3, r2, r0)     // Catch: java.lang.Throwable -> L349
            r24.open()
            return
        L349:
            r0 = move-exception
            com.google.android.exoplayer2.util.ConditionVariable r2 = r1.constructorFinished
            r2.open()
            throw r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.Format access$1002(com.google.android.exoplayer2.ExoPlayerImpl r0, com.google.android.exoplayer2.Format r1) {
            r0.audioFormat = r1
            return r1
    }

    public static /* synthetic */ boolean access$1100(com.google.android.exoplayer2.ExoPlayerImpl r0) {
            boolean r0 = r0.skipSilenceEnabled
            return r0
    }

    public static /* synthetic */ boolean access$1102(com.google.android.exoplayer2.ExoPlayerImpl r0, boolean r1) {
            r0.skipSilenceEnabled = r1
            return r1
    }

    public static /* synthetic */ com.google.android.exoplayer2.text.CueGroup access$1202(com.google.android.exoplayer2.ExoPlayerImpl r0, com.google.android.exoplayer2.text.CueGroup r1) {
            r0.currentCueGroup = r1
            return r1
    }

    public static /* synthetic */ com.google.android.exoplayer2.MediaMetadata access$1300(com.google.android.exoplayer2.ExoPlayerImpl r0) {
            com.google.android.exoplayer2.MediaMetadata r0 = r0.staticAndDynamicMediaMetadata
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.MediaMetadata access$1302(com.google.android.exoplayer2.ExoPlayerImpl r0, com.google.android.exoplayer2.MediaMetadata r1) {
            r0.staticAndDynamicMediaMetadata = r1
            return r1
    }

    public static /* synthetic */ com.google.android.exoplayer2.MediaMetadata access$1400(com.google.android.exoplayer2.ExoPlayerImpl r0) {
            com.google.android.exoplayer2.MediaMetadata r0 = r0.buildUpdatedMediaMetadata()
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.MediaMetadata access$1500(com.google.android.exoplayer2.ExoPlayerImpl r0) {
            com.google.android.exoplayer2.MediaMetadata r0 = r0.mediaMetadata
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.MediaMetadata access$1502(com.google.android.exoplayer2.ExoPlayerImpl r0, com.google.android.exoplayer2.MediaMetadata r1) {
            r0.mediaMetadata = r1
            return r1
    }

    public static /* synthetic */ boolean access$1600(com.google.android.exoplayer2.ExoPlayerImpl r0) {
            boolean r0 = r0.surfaceHolderSurfaceIsVideoOutput
            return r0
    }

    public static /* synthetic */ void access$1700(com.google.android.exoplayer2.ExoPlayerImpl r0, java.lang.Object r1) {
            r0.setVideoOutputInternal(r1)
            return
    }

    public static /* synthetic */ void access$1800(com.google.android.exoplayer2.ExoPlayerImpl r0, int r1, int r2) {
            r0.maybeNotifySurfaceSizeChanged(r1, r2)
            return
    }

    public static /* synthetic */ void access$1900(com.google.android.exoplayer2.ExoPlayerImpl r0, android.graphics.SurfaceTexture r1) {
            r0.setSurfaceTextureInternal(r1)
            return
    }

    public static /* synthetic */ void access$2000(com.google.android.exoplayer2.ExoPlayerImpl r0) {
            r0.sendVolumeToRenderers()
            return
    }

    public static /* synthetic */ int access$2100(boolean r0, int r1) {
            int r0 = getPlayWhenReadyChangeReason(r0, r1)
            return r0
    }

    public static /* synthetic */ void access$2200(com.google.android.exoplayer2.ExoPlayerImpl r0, boolean r1, int r2, int r3) {
            r0.updatePlayWhenReady(r1, r2, r3)
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.StreamVolumeManager access$2300(com.google.android.exoplayer2.ExoPlayerImpl r0) {
            com.google.android.exoplayer2.StreamVolumeManager r0 = r0.streamVolumeManager
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.DeviceInfo access$2400(com.google.android.exoplayer2.StreamVolumeManager r0) {
            com.google.android.exoplayer2.DeviceInfo r0 = createDeviceInfo(r0)
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.DeviceInfo access$2500(com.google.android.exoplayer2.ExoPlayerImpl r0) {
            com.google.android.exoplayer2.DeviceInfo r0 = r0.deviceInfo
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.DeviceInfo access$2502(com.google.android.exoplayer2.ExoPlayerImpl r0, com.google.android.exoplayer2.DeviceInfo r1) {
            r0.deviceInfo = r1
            return r1
    }

    public static /* synthetic */ void access$2600(com.google.android.exoplayer2.ExoPlayerImpl r0) {
            r0.updateWakeAndWifiLock()
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.decoder.DecoderCounters access$302(com.google.android.exoplayer2.ExoPlayerImpl r0, com.google.android.exoplayer2.decoder.DecoderCounters r1) {
            r0.videoDecoderCounters = r1
            return r1
    }

    public static /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsCollector access$400(com.google.android.exoplayer2.ExoPlayerImpl r0) {
            com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = r0.analyticsCollector
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.Format access$502(com.google.android.exoplayer2.ExoPlayerImpl r0, com.google.android.exoplayer2.Format r1) {
            r0.videoFormat = r1
            return r1
    }

    public static /* synthetic */ com.google.android.exoplayer2.video.VideoSize access$602(com.google.android.exoplayer2.ExoPlayerImpl r0, com.google.android.exoplayer2.video.VideoSize r1) {
            r0.videoSize = r1
            return r1
    }

    public static /* synthetic */ com.google.android.exoplayer2.util.ListenerSet access$700(com.google.android.exoplayer2.ExoPlayerImpl r0) {
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r0.listeners
            return r0
    }

    public static /* synthetic */ java.lang.Object access$800(com.google.android.exoplayer2.ExoPlayerImpl r0) {
            java.lang.Object r0 = r0.videoOutput
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.decoder.DecoderCounters access$902(com.google.android.exoplayer2.ExoPlayerImpl r0, com.google.android.exoplayer2.decoder.DecoderCounters r1) {
            r0.audioDecoderCounters = r1
            return r1
    }

    private java.util.List<com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> addMediaSourceHolders(int r8, java.util.List<com.google.android.exoplayer2.source.MediaSource> r9) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r9.size()
            if (r1 >= r2) goto L33
            com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder r2 = new com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder
            java.lang.Object r3 = r9.get(r1)
            com.google.android.exoplayer2.source.MediaSource r3 = (com.google.android.exoplayer2.source.MediaSource) r3
            boolean r4 = r7.useLazyPreparation
            r2.<init>(r3, r4)
            r0.add(r2)
            java.util.List<com.google.android.exoplayer2.ExoPlayerImpl$MediaSourceHolderSnapshot> r3 = r7.mediaSourceHolderSnapshots
            int r4 = r1 + r8
            com.google.android.exoplayer2.ExoPlayerImpl$MediaSourceHolderSnapshot r5 = new com.google.android.exoplayer2.ExoPlayerImpl$MediaSourceHolderSnapshot
            java.lang.Object r6 = r2.uid
            com.google.android.exoplayer2.source.MaskingMediaSource r2 = r2.mediaSource
            com.google.android.exoplayer2.Timeline r2 = r2.getTimeline()
            r5.<init>(r6, r2)
            r3.add(r4, r5)
            int r1 = r1 + 1
            goto L6
        L33:
            com.google.android.exoplayer2.source.ShuffleOrder r9 = r7.shuffleOrder
            int r1 = r0.size()
            com.google.android.exoplayer2.source.ShuffleOrder r8 = r9.cloneAndInsert(r8, r1)
            r7.shuffleOrder = r8
            return r0
    }

    private com.google.android.exoplayer2.MediaMetadata buildUpdatedMediaMetadata() {
            r3 = this;
            com.google.android.exoplayer2.Timeline r0 = r3.getCurrentTimeline()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            com.google.android.exoplayer2.MediaMetadata r0 = r3.staticAndDynamicMediaMetadata
            return r0
        Ld:
            int r1 = r3.getCurrentMediaItemIndex()
            com.google.android.exoplayer2.Timeline$Window r2 = r3.window
            com.google.android.exoplayer2.Timeline$Window r0 = r0.getWindow(r1, r2)
            com.google.android.exoplayer2.MediaItem r0 = r0.mediaItem
            com.google.android.exoplayer2.MediaMetadata r1 = r3.staticAndDynamicMediaMetadata
            com.google.android.exoplayer2.MediaMetadata$Builder r1 = r1.buildUpon()
            com.google.android.exoplayer2.MediaMetadata r0 = r0.mediaMetadata
            com.google.android.exoplayer2.MediaMetadata$Builder r0 = r1.populate(r0)
            com.google.android.exoplayer2.MediaMetadata r0 = r0.build()
            return r0
    }

    private static com.google.android.exoplayer2.DeviceInfo createDeviceInfo(com.google.android.exoplayer2.StreamVolumeManager r3) {
            com.google.android.exoplayer2.DeviceInfo r0 = new com.google.android.exoplayer2.DeviceInfo
            int r1 = r3.getMinVolume()
            int r3 = r3.getMaxVolume()
            r2 = 0
            r0.<init>(r2, r1, r3)
            return r0
    }

    private com.google.android.exoplayer2.Timeline createMaskingTimeline() {
            r3 = this;
            com.google.android.exoplayer2.PlaylistTimeline r0 = new com.google.android.exoplayer2.PlaylistTimeline
            java.util.List<com.google.android.exoplayer2.ExoPlayerImpl$MediaSourceHolderSnapshot> r1 = r3.mediaSourceHolderSnapshots
            com.google.android.exoplayer2.source.ShuffleOrder r2 = r3.shuffleOrder
            r0.<init>(r1, r2)
            return r0
    }

    private java.util.List<com.google.android.exoplayer2.source.MediaSource> createMediaSources(java.util.List<com.google.android.exoplayer2.MediaItem> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.size()
            if (r1 >= r2) goto L1e
            com.google.android.exoplayer2.source.MediaSource$Factory r2 = r4.mediaSourceFactory
            java.lang.Object r3 = r5.get(r1)
            com.google.android.exoplayer2.MediaItem r3 = (com.google.android.exoplayer2.MediaItem) r3
            com.google.android.exoplayer2.source.MediaSource r2 = r2.createMediaSource(r3)
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L1e:
            return r0
    }

    private com.google.android.exoplayer2.PlayerMessage createMessageInternal(com.google.android.exoplayer2.PlayerMessage.Target r10) {
            r9 = this;
            int r0 = r9.getCurrentWindowIndexInternal()
            com.google.android.exoplayer2.PlayerMessage r8 = new com.google.android.exoplayer2.PlayerMessage
            com.google.android.exoplayer2.ExoPlayerImplInternal r2 = r9.internalPlayer
            com.google.android.exoplayer2.PlaybackInfo r1 = r9.playbackInfo
            com.google.android.exoplayer2.Timeline r4 = r1.timeline
            r1 = -1
            if (r0 != r1) goto L12
            r0 = 0
            r5 = 0
            goto L13
        L12:
            r5 = r0
        L13:
            com.google.android.exoplayer2.util.Clock r6 = r9.clock
            android.os.Looper r7 = r2.getPlaybackLooper()
            r1 = r8
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
    }

    private android.util.Pair<java.lang.Boolean, java.lang.Integer> evaluateMediaItemTransitionReason(com.google.android.exoplayer2.PlaybackInfo r7, com.google.android.exoplayer2.PlaybackInfo r8, boolean r9, int r10, boolean r11, boolean r12) {
            r6 = this;
            com.google.android.exoplayer2.Timeline r0 = r8.timeline
            com.google.android.exoplayer2.Timeline r1 = r7.timeline
            boolean r2 = r1.isEmpty()
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            if (r2 == 0) goto L1d
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1d
            android.util.Pair r7 = new android.util.Pair
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r7.<init>(r8, r3)
            return r7
        L1d:
            boolean r2 = r1.isEmpty()
            boolean r4 = r0.isEmpty()
            r5 = 3
            if (r2 == r4) goto L34
            android.util.Pair r7 = new android.util.Pair
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.<init>(r8, r9)
            return r7
        L34:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r8.periodId
            java.lang.Object r2 = r2.periodUid
            com.google.android.exoplayer2.Timeline$Period r4 = r6.period
            com.google.android.exoplayer2.Timeline$Period r2 = r0.getPeriodByUid(r2, r4)
            int r2 = r2.windowIndex
            com.google.android.exoplayer2.Timeline$Window r4 = r6.window
            com.google.android.exoplayer2.Timeline$Window r0 = r0.getWindow(r2, r4)
            java.lang.Object r0 = r0.uid
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r7.periodId
            java.lang.Object r2 = r2.periodUid
            com.google.android.exoplayer2.Timeline$Period r4 = r6.period
            com.google.android.exoplayer2.Timeline$Period r2 = r1.getPeriodByUid(r2, r4)
            int r2 = r2.windowIndex
            com.google.android.exoplayer2.Timeline$Window r4 = r6.window
            com.google.android.exoplayer2.Timeline$Window r1 = r1.getWindow(r2, r4)
            java.lang.Object r1 = r1.uid
            boolean r0 = r0.equals(r1)
            r1 = 2
            r2 = 1
            if (r0 != 0) goto L84
            if (r9 == 0) goto L6a
            if (r10 != 0) goto L6a
            r5 = 1
            goto L72
        L6a:
            if (r9 == 0) goto L70
            if (r10 != r2) goto L70
            r5 = 2
            goto L72
        L70:
            if (r11 == 0) goto L7e
        L72:
            android.util.Pair r7 = new android.util.Pair
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.<init>(r8, r9)
            return r7
        L7e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L84:
            if (r9 == 0) goto La1
            if (r10 != 0) goto La1
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r8 = r8.periodId
            long r4 = r8.windowSequenceNumber
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r7 = r7.periodId
            long r7 = r7.windowSequenceNumber
            int r11 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r11 >= 0) goto La1
            android.util.Pair r7 = new android.util.Pair
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r9 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.<init>(r8, r9)
            return r7
        La1:
            if (r9 == 0) goto Lb3
            if (r10 != r2) goto Lb3
            if (r12 == 0) goto Lb3
            android.util.Pair r7 = new android.util.Pair
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            r7.<init>(r8, r9)
            return r7
        Lb3:
            android.util.Pair r7 = new android.util.Pair
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r7.<init>(r8, r3)
            return r7
    }

    private long getCurrentPositionUsInternal(com.google.android.exoplayer2.PlaybackInfo r5) {
            r4 = this;
            com.google.android.exoplayer2.Timeline r0 = r5.timeline
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            long r0 = r4.maskingWindowPositionMs
            long r0 = com.google.android.exoplayer2.util.Util.msToUs(r0)
            return r0
        Lf:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r5.periodId
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L1a
            long r0 = r5.positionUs
            return r0
        L1a:
            com.google.android.exoplayer2.Timeline r0 = r5.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r5.periodId
            long r2 = r5.positionUs
            long r0 = r4.periodPositionUsToWindowPositionUs(r0, r1, r2)
            return r0
    }

    private int getCurrentWindowIndexInternal() {
            r3 = this;
            com.google.android.exoplayer2.PlaybackInfo r0 = r3.playbackInfo
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            int r0 = r3.maskingWindowIndex
            return r0
        Ld:
            com.google.android.exoplayer2.PlaybackInfo r0 = r3.playbackInfo
            com.google.android.exoplayer2.Timeline r1 = r0.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.periodId
            java.lang.Object r0 = r0.periodUid
            com.google.android.exoplayer2.Timeline$Period r2 = r3.period
            com.google.android.exoplayer2.Timeline$Period r0 = r1.getPeriodByUid(r0, r2)
            int r0 = r0.windowIndex
            return r0
    }

    @androidx.annotation.Nullable
    private android.util.Pair<java.lang.Object, java.lang.Long> getPeriodPositionUsAfterTimelineChanged(com.google.android.exoplayer2.Timeline r14, com.google.android.exoplayer2.Timeline r15) {
            r13 = this;
            long r0 = r13.getContentPosition()
            boolean r2 = r14.isEmpty()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = -1
            if (r2 != 0) goto L64
            boolean r2 = r15.isEmpty()
            if (r2 == 0) goto L17
            goto L64
        L17:
            int r9 = r13.getCurrentMediaItemIndex()
            com.google.android.exoplayer2.Timeline$Window r7 = r13.window
            com.google.android.exoplayer2.Timeline$Period r8 = r13.period
            long r10 = com.google.android.exoplayer2.util.Util.msToUs(r0)
            r6 = r14
            android.util.Pair r0 = r6.getPeriodPositionUs(r7, r8, r9, r10)
            java.lang.Object r1 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r10 = r1.first
            int r1 = r15.getIndexOfPeriod(r10)
            if (r1 == r5) goto L37
            return r0
        L37:
            com.google.android.exoplayer2.Timeline$Window r6 = r13.window
            com.google.android.exoplayer2.Timeline$Period r7 = r13.period
            int r8 = r13.repeatMode
            boolean r9 = r13.shuffleModeEnabled
            r11 = r14
            r12 = r15
            java.lang.Object r14 = com.google.android.exoplayer2.ExoPlayerImplInternal.resolveSubsequentPeriod(r6, r7, r8, r9, r10, r11, r12)
            if (r14 == 0) goto L5f
            com.google.android.exoplayer2.Timeline$Period r0 = r13.period
            r15.getPeriodByUid(r14, r0)
            com.google.android.exoplayer2.Timeline$Period r14 = r13.period
            int r14 = r14.windowIndex
            com.google.android.exoplayer2.Timeline$Window r0 = r13.window
            com.google.android.exoplayer2.Timeline$Window r0 = r15.getWindow(r14, r0)
            long r0 = r0.getDefaultPositionMs()
            android.util.Pair r14 = r13.maskWindowPositionMsOrGetPeriodPositionUs(r15, r14, r0)
            return r14
        L5f:
            android.util.Pair r14 = r13.maskWindowPositionMsOrGetPeriodPositionUs(r15, r5, r3)
            return r14
        L64:
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L72
            boolean r14 = r15.isEmpty()
            if (r14 == 0) goto L72
            r14 = 1
            goto L73
        L72:
            r14 = 0
        L73:
            if (r14 == 0) goto L76
            goto L7a
        L76:
            int r5 = r13.getCurrentWindowIndexInternal()
        L7a:
            if (r14 == 0) goto L7d
            r0 = r3
        L7d:
            android.util.Pair r14 = r13.maskWindowPositionMsOrGetPeriodPositionUs(r15, r5, r0)
            return r14
    }

    private static int getPlayWhenReadyChangeReason(boolean r1, int r2) {
            r0 = 1
            if (r1 == 0) goto L6
            if (r2 == r0) goto L6
            r0 = 2
        L6:
            return r0
    }

    private com.google.android.exoplayer2.Player.PositionInfo getPositionInfo(long r14) {
            r13 = this;
            int r2 = r13.getCurrentMediaItemIndex()
            com.google.android.exoplayer2.PlaybackInfo r0 = r13.playbackInfo
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L3a
            com.google.android.exoplayer2.PlaybackInfo r0 = r13.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r0.periodId
            java.lang.Object r1 = r1.periodUid
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            com.google.android.exoplayer2.Timeline$Period r3 = r13.period
            r0.getPeriodByUid(r1, r3)
            com.google.android.exoplayer2.PlaybackInfo r0 = r13.playbackInfo
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            int r0 = r0.getIndexOfPeriod(r1)
            com.google.android.exoplayer2.PlaybackInfo r3 = r13.playbackInfo
            com.google.android.exoplayer2.Timeline r3 = r3.timeline
            com.google.android.exoplayer2.Timeline$Window r4 = r13.window
            com.google.android.exoplayer2.Timeline$Window r3 = r3.getWindow(r2, r4)
            java.lang.Object r3 = r3.uid
            com.google.android.exoplayer2.Timeline$Window r4 = r13.window
            com.google.android.exoplayer2.MediaItem r4 = r4.mediaItem
            r5 = r0
            r12 = r4
            r4 = r1
            r1 = r3
            r3 = r12
            goto L3e
        L3a:
            r0 = -1
            r3 = r1
            r4 = r3
            r5 = -1
        L3e:
            long r6 = com.google.android.exoplayer2.util.Util.usToMs(r14)
            com.google.android.exoplayer2.Player$PositionInfo r14 = new com.google.android.exoplayer2.Player$PositionInfo
            com.google.android.exoplayer2.PlaybackInfo r15 = r13.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r15 = r15.periodId
            boolean r15 = r15.isAd()
            if (r15 == 0) goto L59
            com.google.android.exoplayer2.PlaybackInfo r15 = r13.playbackInfo
            long r8 = getRequestedContentPositionUs(r15)
            long r8 = com.google.android.exoplayer2.util.Util.usToMs(r8)
            goto L5a
        L59:
            r8 = r6
        L5a:
            com.google.android.exoplayer2.PlaybackInfo r15 = r13.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r15 = r15.periodId
            int r10 = r15.adGroupIndex
            int r11 = r15.adIndexInAdGroup
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11)
            return r14
    }

    private com.google.android.exoplayer2.Player.PositionInfo getPreviousPositionInfo(int r22, com.google.android.exoplayer2.PlaybackInfo r23, int r24) {
            r21 = this;
            r0 = r21
            r1 = r23
            com.google.android.exoplayer2.Timeline$Period r2 = new com.google.android.exoplayer2.Timeline$Period
            r2.<init>()
            com.google.android.exoplayer2.Timeline r3 = r1.timeline
            boolean r3 = r3.isEmpty()
            r4 = -1
            r5 = 0
            if (r3 != 0) goto L38
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r1.periodId
            java.lang.Object r5 = r3.periodUid
            com.google.android.exoplayer2.Timeline r3 = r1.timeline
            r3.getPeriodByUid(r5, r2)
            int r3 = r2.windowIndex
            com.google.android.exoplayer2.Timeline r6 = r1.timeline
            int r6 = r6.getIndexOfPeriod(r5)
            com.google.android.exoplayer2.Timeline r7 = r1.timeline
            com.google.android.exoplayer2.Timeline$Window r8 = r0.window
            com.google.android.exoplayer2.Timeline$Window r7 = r7.getWindow(r3, r8)
            java.lang.Object r7 = r7.uid
            com.google.android.exoplayer2.Timeline$Window r8 = r0.window
            com.google.android.exoplayer2.MediaItem r8 = r8.mediaItem
            r11 = r3
            r13 = r5
            r14 = r6
            r10 = r7
            r12 = r8
            goto L3e
        L38:
            r11 = r24
            r10 = r5
            r12 = r10
            r13 = r12
            r14 = -1
        L3e:
            if (r22 != 0) goto L6b
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r1.periodId
            boolean r3 = r3.isAd()
            if (r3 == 0) goto L57
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r1.periodId
            int r4 = r3.adGroupIndex
            int r3 = r3.adIndexInAdGroup
            long r2 = r2.getAdDurationUs(r4, r3)
            long r4 = getRequestedContentPositionUs(r23)
            goto L80
        L57:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r1.periodId
            int r3 = r3.nextAdGroupIndex
            if (r3 == r4) goto L64
            com.google.android.exoplayer2.PlaybackInfo r2 = r0.playbackInfo
            long r2 = getRequestedContentPositionUs(r2)
            goto L7f
        L64:
            long r3 = r2.positionInWindowUs
            long r5 = r2.durationUs
            long r2 = r3 + r5
            goto L7f
        L6b:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r1.periodId
            boolean r3 = r3.isAd()
            if (r3 == 0) goto L7a
            long r2 = r1.positionUs
            long r4 = getRequestedContentPositionUs(r23)
            goto L80
        L7a:
            long r2 = r2.positionInWindowUs
            long r4 = r1.positionUs
            long r2 = r2 + r4
        L7f:
            r4 = r2
        L80:
            com.google.android.exoplayer2.Player$PositionInfo r6 = new com.google.android.exoplayer2.Player$PositionInfo
            long r15 = com.google.android.exoplayer2.util.Util.usToMs(r2)
            long r17 = com.google.android.exoplayer2.util.Util.usToMs(r4)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.periodId
            int r2 = r1.adGroupIndex
            int r1 = r1.adIndexInAdGroup
            r9 = r6
            r19 = r2
            r20 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r17, r19, r20)
            return r6
    }

    private static long getRequestedContentPositionUs(com.google.android.exoplayer2.PlaybackInfo r7) {
            com.google.android.exoplayer2.Timeline$Window r0 = new com.google.android.exoplayer2.Timeline$Window
            r0.<init>()
            com.google.android.exoplayer2.Timeline$Period r1 = new com.google.android.exoplayer2.Timeline$Period
            r1.<init>()
            com.google.android.exoplayer2.Timeline r2 = r7.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r7.periodId
            java.lang.Object r3 = r3.periodUid
            r2.getPeriodByUid(r3, r1)
            long r2 = r7.requestedContentPositionUs
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L2b
            com.google.android.exoplayer2.Timeline r7 = r7.timeline
            int r1 = r1.windowIndex
            com.google.android.exoplayer2.Timeline$Window r7 = r7.getWindow(r1, r0)
            long r0 = r7.getDefaultPositionUs()
            goto L32
        L2b:
            long r0 = r1.getPositionInWindowUs()
            long r2 = r7.requestedContentPositionUs
            long r0 = r0 + r2
        L32:
            return r0
    }

    private void handlePlaybackInfo(com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate r12) {
            r11 = this;
            int r1 = r11.pendingOperationAcks
            int r2 = r12.operationAcks
            int r1 = r1 - r2
            r11.pendingOperationAcks = r1
            boolean r2 = r12.positionDiscontinuity
            r3 = 1
            if (r2 == 0) goto L12
            int r2 = r12.discontinuityReason
            r11.pendingDiscontinuityReason = r2
            r11.pendingDiscontinuity = r3
        L12:
            boolean r2 = r12.hasPlayWhenReadyChangeReason
            if (r2 == 0) goto L1a
            int r2 = r12.playWhenReadyChangeReason
            r11.pendingPlayWhenReadyChangeReason = r2
        L1a:
            if (r1 != 0) goto Ld2
            com.google.android.exoplayer2.PlaybackInfo r1 = r12.playbackInfo
            com.google.android.exoplayer2.Timeline r1 = r1.timeline
            com.google.android.exoplayer2.PlaybackInfo r2 = r11.playbackInfo
            com.google.android.exoplayer2.Timeline r2 = r2.timeline
            boolean r2 = r2.isEmpty()
            r4 = 0
            if (r2 != 0) goto L3a
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L3a
            r2 = -1
            r11.maskingWindowIndex = r2
            r5 = 0
            r11.maskingWindowPositionMs = r5
            r11.maskingPeriodIndex = r4
        L3a:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L74
            r2 = r1
            com.google.android.exoplayer2.PlaylistTimeline r2 = (com.google.android.exoplayer2.PlaylistTimeline) r2
            java.util.List r2 = r2.getChildTimelines()
            int r5 = r2.size()
            java.util.List<com.google.android.exoplayer2.ExoPlayerImpl$MediaSourceHolderSnapshot> r6 = r11.mediaSourceHolderSnapshots
            int r6 = r6.size()
            if (r5 != r6) goto L55
            r5 = 1
            goto L56
        L55:
            r5 = 0
        L56:
            com.google.android.exoplayer2.util.Assertions.checkState(r5)
            r5 = 0
        L5a:
            int r6 = r2.size()
            if (r5 >= r6) goto L74
            java.util.List<com.google.android.exoplayer2.ExoPlayerImpl$MediaSourceHolderSnapshot> r6 = r11.mediaSourceHolderSnapshots
            java.lang.Object r6 = r6.get(r5)
            com.google.android.exoplayer2.ExoPlayerImpl$MediaSourceHolderSnapshot r6 = (com.google.android.exoplayer2.ExoPlayerImpl.MediaSourceHolderSnapshot) r6
            java.lang.Object r7 = r2.get(r5)
            com.google.android.exoplayer2.Timeline r7 = (com.google.android.exoplayer2.Timeline) r7
            com.google.android.exoplayer2.ExoPlayerImpl.MediaSourceHolderSnapshot.access$202(r6, r7)
            int r5 = r5 + 1
            goto L5a
        L74:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r2 = r11.pendingDiscontinuity
            if (r2 == 0) goto Lc0
            com.google.android.exoplayer2.PlaybackInfo r2 = r12.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.periodId
            com.google.android.exoplayer2.PlaybackInfo r7 = r11.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r7 = r7.periodId
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L99
            com.google.android.exoplayer2.PlaybackInfo r2 = r12.playbackInfo
            long r7 = r2.discontinuityStartPositionUs
            com.google.android.exoplayer2.PlaybackInfo r2 = r11.playbackInfo
            long r9 = r2.positionUs
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L98
            goto L99
        L98:
            r3 = 0
        L99:
            if (r3 == 0) goto Lbd
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lb7
            com.google.android.exoplayer2.PlaybackInfo r2 = r12.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.periodId
            boolean r2 = r2.isAd()
            if (r2 == 0) goto Lac
            goto Lb7
        Lac:
            com.google.android.exoplayer2.PlaybackInfo r2 = r12.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r5 = r2.periodId
            long r6 = r2.discontinuityStartPositionUs
            long r1 = r11.periodPositionUsToWindowPositionUs(r1, r5, r6)
            goto Lbb
        Lb7:
            com.google.android.exoplayer2.PlaybackInfo r1 = r12.playbackInfo
            long r1 = r1.discontinuityStartPositionUs
        Lbb:
            r7 = r1
            goto Lbe
        Lbd:
            r7 = r5
        Lbe:
            r5 = r3
            goto Lc2
        Lc0:
            r7 = r5
            r5 = 0
        Lc2:
            r11.pendingDiscontinuity = r4
            com.google.android.exoplayer2.PlaybackInfo r1 = r12.playbackInfo
            r2 = 1
            int r3 = r11.pendingPlayWhenReadyChangeReason
            r4 = 0
            int r6 = r11.pendingDiscontinuityReason
            r9 = -1
            r10 = 0
            r0 = r11
            r0.updatePlaybackInfo(r1, r2, r3, r4, r5, r6, r7, r9, r10)
        Ld2:
            return
    }

    private int initializeKeepSessionIdAudioTrack(int r10) {
            r9 = this;
            android.media.AudioTrack r0 = r9.keepSessionIdAudioTrack
            if (r0 == 0) goto L12
            int r0 = r0.getAudioSessionId()
            if (r0 == r10) goto L12
            android.media.AudioTrack r0 = r9.keepSessionIdAudioTrack
            r0.release()
            r0 = 0
            r9.keepSessionIdAudioTrack = r0
        L12:
            android.media.AudioTrack r0 = r9.keepSessionIdAudioTrack
            if (r0 != 0) goto L26
            r3 = 4000(0xfa0, float:5.605E-42)
            r4 = 4
            r5 = 2
            r6 = 2
            android.media.AudioTrack r0 = new android.media.AudioTrack
            r2 = 3
            r7 = 0
            r1 = r0
            r8 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.keepSessionIdAudioTrack = r0
        L26:
            android.media.AudioTrack r10 = r9.keepSessionIdAudioTrack
            int r10 = r10.getAudioSessionId()
            return r10
    }

    private static boolean isPlaying(com.google.android.exoplayer2.PlaybackInfo r2) {
            int r0 = r2.playbackState
            r1 = 3
            if (r0 != r1) goto Lf
            boolean r0 = r2.playWhenReady
            if (r0 == 0) goto Lf
            int r2 = r2.playbackSuppressionReason
            if (r2 != 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    private static /* synthetic */ void lambda$maybeNotifySurfaceSizeChanged$27(int r0, int r1, com.google.android.exoplayer2.Player.Listener r2) {
            r2.onSurfaceSizeChanged(r0, r1)
            return
    }

    private /* synthetic */ void lambda$new$0(com.google.android.exoplayer2.Player.Listener r3, com.google.android.exoplayer2.util.FlagSet r4) {
            r2 = this;
            com.google.android.exoplayer2.Player r0 = r2.wrappingPlayer
            com.google.android.exoplayer2.Player$Events r1 = new com.google.android.exoplayer2.Player$Events
            r1.<init>(r4)
            r3.onEvents(r0, r1)
            return
    }

    private /* synthetic */ void lambda$new$1(com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate r1) {
            r0 = this;
            r0.handlePlaybackInfo(r1)
            return
    }

    private /* synthetic */ void lambda$new$2(com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate r4) {
            r3 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r3.playbackInfoUpdateHandler
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda11 r1 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda11
            r2 = 0
            r1.<init>(r3, r4, r2)
            r0.post(r1)
            return
    }

    private static /* synthetic */ void lambda$release$5(com.google.android.exoplayer2.Player.Listener r2) {
            com.google.android.exoplayer2.ExoTimeoutException r0 = new com.google.android.exoplayer2.ExoTimeoutException
            r1 = 1
            r0.<init>(r1)
            r1 = 1003(0x3eb, float:1.406E-42)
            com.google.android.exoplayer2.ExoPlaybackException r0 = com.google.android.exoplayer2.ExoPlaybackException.createForUnexpected(r0, r1)
            r2.onPlayerError(r0)
            return
    }

    private static /* synthetic */ void lambda$setAudioAttributes$8(com.google.android.exoplayer2.audio.AudioAttributes r0, com.google.android.exoplayer2.Player.Listener r1) {
            r1.onAudioAttributesChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$setAudioSessionId$9(int r0, com.google.android.exoplayer2.Player.Listener r1) {
            r1.onAudioSessionIdChanged(r0)
            return
    }

    private /* synthetic */ void lambda$setPlaylistMetadata$7(com.google.android.exoplayer2.Player.Listener r2) {
            r1 = this;
            com.google.android.exoplayer2.MediaMetadata r0 = r1.playlistMetadata
            r2.onPlaylistMetadataChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$setRepeatMode$3(int r0, com.google.android.exoplayer2.Player.Listener r1) {
            r1.onRepeatModeChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$setShuffleModeEnabled$4(boolean r0, com.google.android.exoplayer2.Player.Listener r1) {
            r1.onShuffleModeEnabledChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$setSkipSilenceEnabled$11(boolean r0, com.google.android.exoplayer2.Player.Listener r1) {
            r1.onSkipSilenceEnabledChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$setTrackSelectionParameters$6(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0, com.google.android.exoplayer2.Player.Listener r1) {
            r1.onTrackSelectionParametersChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$setVolume$10(float r0, com.google.android.exoplayer2.Player.Listener r1) {
            r1.onVolumeChanged(r0)
            return
    }

    private /* synthetic */ void lambda$updateAvailableCommands$26(com.google.android.exoplayer2.Player.Listener r2) {
            r1 = this;
            com.google.android.exoplayer2.Player$Commands r0 = r1.availableCommands
            r2.onAvailableCommandsChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$12(com.google.android.exoplayer2.PlaybackInfo r0, int r1, com.google.android.exoplayer2.Player.Listener r2) {
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            r2.onTimelineChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$13(int r0, com.google.android.exoplayer2.Player.PositionInfo r1, com.google.android.exoplayer2.Player.PositionInfo r2, com.google.android.exoplayer2.Player.Listener r3) {
            r3.onPositionDiscontinuity(r0)
            r3.onPositionDiscontinuity(r1, r2, r0)
            return
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$14(com.google.android.exoplayer2.MediaItem r0, int r1, com.google.android.exoplayer2.Player.Listener r2) {
            r2.onMediaItemTransition(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$15(com.google.android.exoplayer2.PlaybackInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
            com.google.android.exoplayer2.ExoPlaybackException r0 = r0.playbackError
            r1.onPlayerErrorChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$16(com.google.android.exoplayer2.PlaybackInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
            com.google.android.exoplayer2.ExoPlaybackException r0 = r0.playbackError
            r1.onPlayerError(r0)
            return
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$17(com.google.android.exoplayer2.PlaybackInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r0 = r0.trackSelectorResult
            com.google.android.exoplayer2.Tracks r0 = r0.tracks
            r1.onTracksChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$18(com.google.android.exoplayer2.MediaMetadata r0, com.google.android.exoplayer2.Player.Listener r1) {
            r1.onMediaMetadataChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$19(com.google.android.exoplayer2.PlaybackInfo r1, com.google.android.exoplayer2.Player.Listener r2) {
            boolean r0 = r1.isLoading
            r2.onLoadingChanged(r0)
            boolean r1 = r1.isLoading
            r2.onIsLoadingChanged(r1)
            return
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$20(com.google.android.exoplayer2.PlaybackInfo r1, com.google.android.exoplayer2.Player.Listener r2) {
            boolean r0 = r1.playWhenReady
            int r1 = r1.playbackState
            r2.onPlayerStateChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$21(com.google.android.exoplayer2.PlaybackInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
            int r0 = r0.playbackState
            r1.onPlaybackStateChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$22(com.google.android.exoplayer2.PlaybackInfo r0, int r1, com.google.android.exoplayer2.Player.Listener r2) {
            boolean r0 = r0.playWhenReady
            r2.onPlayWhenReadyChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$23(com.google.android.exoplayer2.PlaybackInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
            int r0 = r0.playbackSuppressionReason
            r1.onPlaybackSuppressionReasonChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$24(com.google.android.exoplayer2.PlaybackInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
            boolean r0 = isPlaying(r0)
            r1.onIsPlayingChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$25(com.google.android.exoplayer2.PlaybackInfo r0, com.google.android.exoplayer2.Player.Listener r1) {
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.playbackParameters
            r1.onPlaybackParametersChanged(r0)
            return
    }

    private com.google.android.exoplayer2.PlaybackInfo maskTimelineAndPosition(com.google.android.exoplayer2.PlaybackInfo r20, com.google.android.exoplayer2.Timeline r21, @androidx.annotation.Nullable android.util.Pair<java.lang.Object, java.lang.Long> r22) {
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            boolean r3 = r21.isEmpty()
            r4 = 1
            if (r3 != 0) goto L12
            if (r2 == 0) goto L10
            goto L12
        L10:
            r3 = 0
            goto L13
        L12:
            r3 = 1
        L13:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r3)
            r3 = r20
            com.google.android.exoplayer2.Timeline r5 = r3.timeline
            com.google.android.exoplayer2.PlaybackInfo r6 = r20.copyWithTimeline(r21)
            boolean r3 = r21.isEmpty()
            if (r3 == 0) goto L4a
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = com.google.android.exoplayer2.PlaybackInfo.getDummyPeriodForEmptyTimeline()
            long r2 = r0.maskingWindowPositionMs
            long r12 = com.google.android.exoplayer2.util.Util.msToUs(r2)
            r14 = 0
            com.google.android.exoplayer2.source.TrackGroupArray r16 = com.google.android.exoplayer2.source.TrackGroupArray.EMPTY
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r2 = r0.emptyTrackSelectorResult
            com.google.common.collect.ImmutableList r18 = com.google.common.collect.ImmutableList.of()
            r7 = r1
            r8 = r12
            r10 = r12
            r17 = r2
            com.google.android.exoplayer2.PlaybackInfo r2 = r6.copyWithNewPosition(r7, r8, r10, r12, r14, r16, r17, r18)
            com.google.android.exoplayer2.PlaybackInfo r1 = r2.copyWithLoadingMediaPeriodId(r1)
            long r2 = r1.positionUs
            r1.bufferedPositionUs = r2
            return r1
        L4a:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r6.periodId
            java.lang.Object r3 = r3.periodUid
            java.lang.Object r7 = com.google.android.exoplayer2.util.Util.castNonNull(r22)
            android.util.Pair r7 = (android.util.Pair) r7
            java.lang.Object r7 = r7.first
            boolean r7 = r3.equals(r7)
            r7 = r7 ^ r4
            if (r7 == 0) goto L65
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r8 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
            java.lang.Object r9 = r2.first
            r8.<init>(r9)
            goto L67
        L65:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r8 = r6.periodId
        L67:
            r14 = r8
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r12 = r2.longValue()
            long r8 = r19.getContentPosition()
            long r8 = com.google.android.exoplayer2.util.Util.msToUs(r8)
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L89
            com.google.android.exoplayer2.Timeline$Period r2 = r0.period
            com.google.android.exoplayer2.Timeline$Period r2 = r5.getPeriodByUid(r3, r2)
            long r2 = r2.getPositionInWindowUs()
            long r8 = r8 - r2
        L89:
            if (r7 != 0) goto L12d
            int r2 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r2 >= 0) goto L91
            goto L12d
        L91:
            if (r2 != 0) goto Lf5
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r6.loadingMediaPeriodId
            java.lang.Object r2 = r2.periodUid
            int r2 = r1.getIndexOfPeriod(r2)
            r3 = -1
            if (r2 == r3) goto Lb2
            com.google.android.exoplayer2.Timeline$Period r3 = r0.period
            com.google.android.exoplayer2.Timeline$Period r2 = r1.getPeriod(r2, r3)
            int r2 = r2.windowIndex
            java.lang.Object r3 = r14.periodUid
            com.google.android.exoplayer2.Timeline$Period r4 = r0.period
            com.google.android.exoplayer2.Timeline$Period r3 = r1.getPeriodByUid(r3, r4)
            int r3 = r3.windowIndex
            if (r2 == r3) goto Lf1
        Lb2:
            java.lang.Object r2 = r14.periodUid
            com.google.android.exoplayer2.Timeline$Period r3 = r0.period
            r1.getPeriodByUid(r2, r3)
            boolean r1 = r14.isAd()
            if (r1 == 0) goto Lca
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            int r2 = r14.adGroupIndex
            int r3 = r14.adIndexInAdGroup
            long r1 = r1.getAdDurationUs(r2, r3)
            goto Lce
        Lca:
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            long r1 = r1.durationUs
        Lce:
            long r8 = r6.positionUs
            long r10 = r6.positionUs
            long r12 = r6.discontinuityStartPositionUs
            long r3 = r6.positionUs
            long r3 = r1 - r3
            com.google.android.exoplayer2.source.TrackGroupArray r5 = r6.trackGroups
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r15 = r6.trackSelectorResult
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r7 = r6.staticMetadata
            r18 = r7
            r7 = r14
            r0 = r14
            r17 = r15
            r14 = r3
            r16 = r5
            com.google.android.exoplayer2.PlaybackInfo r3 = r6.copyWithNewPosition(r7, r8, r10, r12, r14, r16, r17, r18)
            com.google.android.exoplayer2.PlaybackInfo r6 = r3.copyWithLoadingMediaPeriodId(r0)
            r6.bufferedPositionUs = r1
        Lf1:
            r0 = r19
            goto L166
        Lf5:
            r0 = r14
            boolean r1 = r0.isAd()
            r1 = r1 ^ r4
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            r1 = 0
            long r3 = r6.totalBufferedDurationUs
            long r7 = r12 - r8
            long r3 = r3 - r7
            long r14 = java.lang.Math.max(r1, r3)
            long r1 = r6.bufferedPositionUs
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r6.loadingMediaPeriodId
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r6.periodId
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L117
            long r1 = r12 + r14
        L117:
            com.google.android.exoplayer2.source.TrackGroupArray r3 = r6.trackGroups
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r4 = r6.trackSelectorResult
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r5 = r6.staticMetadata
            r7 = r0
            r8 = r12
            r10 = r12
            r16 = r3
            r17 = r4
            r18 = r5
            com.google.android.exoplayer2.PlaybackInfo r6 = r6.copyWithNewPosition(r7, r8, r10, r12, r14, r16, r17, r18)
            r6.bufferedPositionUs = r1
            goto Lf1
        L12d:
            r0 = r14
            boolean r1 = r0.isAd()
            r1 = r1 ^ r4
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            r14 = 0
            if (r7 == 0) goto L13d
            com.google.android.exoplayer2.source.TrackGroupArray r1 = com.google.android.exoplayer2.source.TrackGroupArray.EMPTY
            goto L13f
        L13d:
            com.google.android.exoplayer2.source.TrackGroupArray r1 = r6.trackGroups
        L13f:
            r16 = r1
            r1 = r0
            r0 = r19
            if (r7 == 0) goto L149
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r2 = r0.emptyTrackSelectorResult
            goto L14b
        L149:
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r2 = r6.trackSelectorResult
        L14b:
            r17 = r2
            if (r7 == 0) goto L154
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
            goto L156
        L154:
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r2 = r6.staticMetadata
        L156:
            r18 = r2
            r7 = r1
            r8 = r12
            r10 = r12
            r2 = r12
            com.google.android.exoplayer2.PlaybackInfo r4 = r6.copyWithNewPosition(r7, r8, r10, r12, r14, r16, r17, r18)
            com.google.android.exoplayer2.PlaybackInfo r6 = r4.copyWithLoadingMediaPeriodId(r1)
            r6.bufferedPositionUs = r2
        L166:
            return r6
    }

    @androidx.annotation.Nullable
    private android.util.Pair<java.lang.Object, java.lang.Long> maskWindowPositionMsOrGetPeriodPositionUs(com.google.android.exoplayer2.Timeline r7, int r8, long r9) {
            r6 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L1a
            r6.maskingWindowIndex = r8
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L13
            r9 = 0
        L13:
            r6.maskingWindowPositionMs = r9
            r7 = 0
            r6.maskingPeriodIndex = r7
            r7 = 0
            return r7
        L1a:
            r0 = -1
            if (r8 == r0) goto L23
            int r0 = r7.getWindowCount()
            if (r8 < r0) goto L33
        L23:
            boolean r8 = r6.shuffleModeEnabled
            int r8 = r7.getFirstWindowIndex(r8)
            com.google.android.exoplayer2.Timeline$Window r9 = r6.window
            com.google.android.exoplayer2.Timeline$Window r9 = r7.getWindow(r8, r9)
            long r9 = r9.getDefaultPositionMs()
        L33:
            r3 = r8
            com.google.android.exoplayer2.Timeline$Window r1 = r6.window
            com.google.android.exoplayer2.Timeline$Period r2 = r6.period
            long r4 = com.google.android.exoplayer2.util.Util.msToUs(r9)
            r0 = r7
            android.util.Pair r7 = r0.getPeriodPositionUs(r1, r2, r3, r4)
            return r7
    }

    private void maybeNotifySurfaceSizeChanged(int r4, int r5) {
            r3 = this;
            com.google.android.exoplayer2.util.Size r0 = r3.surfaceSize
            int r0 = r0.getWidth()
            if (r4 != r0) goto L10
            com.google.android.exoplayer2.util.Size r0 = r3.surfaceSize
            int r0 = r0.getHeight()
            if (r5 == r0) goto L23
        L10:
            com.google.android.exoplayer2.util.Size r0 = new com.google.android.exoplayer2.util.Size
            r0.<init>(r4, r5)
            r3.surfaceSize = r0
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r3.listeners
            r1 = 24
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda8 r2 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda8
            r2.<init>(r4, r5)
            r0.sendEvent(r1, r2)
        L23:
            return
    }

    private long periodPositionUsToWindowPositionUs(com.google.android.exoplayer2.Timeline r2, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, long r4) {
            r1 = this;
            java.lang.Object r3 = r3.periodUid
            com.google.android.exoplayer2.Timeline$Period r0 = r1.period
            r2.getPeriodByUid(r3, r0)
            com.google.android.exoplayer2.Timeline$Period r2 = r1.period
            long r2 = r2.getPositionInWindowUs()
            long r2 = r2 + r4
            return r2
    }

    private com.google.android.exoplayer2.PlaybackInfo removeMediaItemsInternal(int r7, int r8) {
            r6 = this;
            int r0 = r6.getCurrentMediaItemIndex()
            com.google.android.exoplayer2.Timeline r1 = r6.getCurrentTimeline()
            java.util.List<com.google.android.exoplayer2.ExoPlayerImpl$MediaSourceHolderSnapshot> r2 = r6.mediaSourceHolderSnapshots
            int r2 = r2.size()
            int r3 = r6.pendingOperationAcks
            r4 = 1
            int r3 = r3 + r4
            r6.pendingOperationAcks = r3
            r6.removeMediaSourceHolders(r7, r8)
            com.google.android.exoplayer2.Timeline r3 = r6.createMaskingTimeline()
            com.google.android.exoplayer2.PlaybackInfo r5 = r6.playbackInfo
            android.util.Pair r1 = r6.getPeriodPositionUsAfterTimelineChanged(r1, r3)
            com.google.android.exoplayer2.PlaybackInfo r1 = r6.maskTimelineAndPosition(r5, r3, r1)
            int r3 = r1.playbackState
            r5 = 4
            if (r3 == r4) goto L39
            if (r3 == r5) goto L39
            if (r7 >= r8) goto L39
            if (r8 != r2) goto L39
            com.google.android.exoplayer2.Timeline r2 = r1.timeline
            int r2 = r2.getWindowCount()
            if (r0 < r2) goto L39
            goto L3a
        L39:
            r4 = 0
        L3a:
            if (r4 == 0) goto L40
            com.google.android.exoplayer2.PlaybackInfo r1 = r1.copyWithPlaybackState(r5)
        L40:
            com.google.android.exoplayer2.ExoPlayerImplInternal r0 = r6.internalPlayer
            com.google.android.exoplayer2.source.ShuffleOrder r2 = r6.shuffleOrder
            r0.removeMediaSources(r7, r8, r2)
            return r1
    }

    private void removeMediaSourceHolders(int r3, int r4) {
            r2 = this;
            int r0 = r4 + (-1)
        L2:
            if (r0 < r3) goto Lc
            java.util.List<com.google.android.exoplayer2.ExoPlayerImpl$MediaSourceHolderSnapshot> r1 = r2.mediaSourceHolderSnapshots
            r1.remove(r0)
            int r0 = r0 + (-1)
            goto L2
        Lc:
            com.google.android.exoplayer2.source.ShuffleOrder r0 = r2.shuffleOrder
            com.google.android.exoplayer2.source.ShuffleOrder r3 = r0.cloneAndRemove(r3, r4)
            r2.shuffleOrder = r3
            return
    }

    private void removeSurfaceCallbacks() {
            r3 = this;
            com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView r0 = r3.sphericalGLSurfaceView
            r1 = 0
            if (r0 == 0) goto L21
            com.google.android.exoplayer2.ExoPlayerImpl$FrameMetadataListener r0 = r3.frameMetadataListener
            com.google.android.exoplayer2.PlayerMessage r0 = r3.createMessageInternal(r0)
            r2 = 10000(0x2710, float:1.4013E-41)
            com.google.android.exoplayer2.PlayerMessage r0 = r0.setType(r2)
            com.google.android.exoplayer2.PlayerMessage r0 = r0.setPayload(r1)
            r0.send()
            com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView r0 = r3.sphericalGLSurfaceView
            com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener r2 = r3.componentListener
            r0.removeVideoSurfaceListener(r2)
            r3.sphericalGLSurfaceView = r1
        L21:
            android.view.TextureView r0 = r3.textureView
            if (r0 == 0) goto L3c
            android.view.TextureView$SurfaceTextureListener r0 = r0.getSurfaceTextureListener()
            com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener r2 = r3.componentListener
            if (r0 == r2) goto L35
            java.lang.String r0 = "ExoPlayerImpl"
            java.lang.String r2 = "SurfaceTextureListener already unset or replaced."
            com.google.android.exoplayer2.util.Log.w(r0, r2)
            goto L3a
        L35:
            android.view.TextureView r0 = r3.textureView
            r0.setSurfaceTextureListener(r1)
        L3a:
            r3.textureView = r1
        L3c:
            android.view.SurfaceHolder r0 = r3.surfaceHolder
            if (r0 == 0) goto L47
            com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener r2 = r3.componentListener
            r0.removeCallback(r2)
            r3.surfaceHolder = r1
        L47:
            return
    }

    private void sendRendererMessage(int r6, int r7, @androidx.annotation.Nullable java.lang.Object r8) {
            r5 = this;
            com.google.android.exoplayer2.Renderer[] r0 = r5.renderers
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L20
            r3 = r0[r2]
            int r4 = r3.getTrackType()
            if (r4 != r6) goto L1d
            com.google.android.exoplayer2.PlayerMessage r3 = r5.createMessageInternal(r3)
            com.google.android.exoplayer2.PlayerMessage r3 = r3.setType(r7)
            com.google.android.exoplayer2.PlayerMessage r3 = r3.setPayload(r8)
            r3.send()
        L1d:
            int r2 = r2 + 1
            goto L4
        L20:
            return
    }

    private void sendVolumeToRenderers() {
            r3 = this;
            float r0 = r3.volume
            com.google.android.exoplayer2.AudioFocusManager r1 = r3.audioFocusManager
            float r1 = r1.getVolumeMultiplier()
            float r0 = r0 * r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = 1
            r2 = 2
            r3.sendRendererMessage(r1, r2, r0)
            return
    }

    private void setMediaSourcesInternal(java.util.List<com.google.android.exoplayer2.source.MediaSource> r19, int r20, long r21, boolean r23) {
            r18 = this;
            r11 = r18
            r0 = r20
            int r1 = r18.getCurrentWindowIndexInternal()
            long r2 = r18.getCurrentPosition()
            int r4 = r11.pendingOperationAcks
            r5 = 1
            int r4 = r4 + r5
            r11.pendingOperationAcks = r4
            java.util.List<com.google.android.exoplayer2.ExoPlayerImpl$MediaSourceHolderSnapshot> r4 = r11.mediaSourceHolderSnapshots
            boolean r4 = r4.isEmpty()
            r6 = 0
            if (r4 != 0) goto L24
            java.util.List<com.google.android.exoplayer2.ExoPlayerImpl$MediaSourceHolderSnapshot> r4 = r11.mediaSourceHolderSnapshots
            int r4 = r4.size()
            r11.removeMediaSourceHolders(r6, r4)
        L24:
            r4 = r19
            java.util.List r13 = r11.addMediaSourceHolders(r6, r4)
            com.google.android.exoplayer2.Timeline r4 = r18.createMaskingTimeline()
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L43
            int r7 = r4.getWindowCount()
            if (r0 >= r7) goto L3b
            goto L43
        L3b:
            com.google.android.exoplayer2.IllegalSeekPositionException r1 = new com.google.android.exoplayer2.IllegalSeekPositionException
            r7 = r21
            r1.<init>(r4, r0, r7)
            throw r1
        L43:
            r7 = r21
            r9 = -1
            if (r23 == 0) goto L55
            boolean r0 = r11.shuffleModeEnabled
            int r0 = r4.getFirstWindowIndex(r0)
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = r0
            goto L5c
        L55:
            if (r0 != r9) goto L5a
            r14 = r1
            r1 = r2
            goto L5c
        L5a:
            r14 = r0
            r1 = r7
        L5c:
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo
            android.util.Pair r3 = r11.maskWindowPositionMsOrGetPeriodPositionUs(r4, r14, r1)
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.maskTimelineAndPosition(r0, r4, r3)
            int r3 = r0.playbackState
            if (r14 == r9) goto L7c
            if (r3 == r5) goto L7c
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L7b
            int r3 = r4.getWindowCount()
            if (r14 < r3) goto L79
            goto L7b
        L79:
            r3 = 2
            goto L7c
        L7b:
            r3 = 4
        L7c:
            com.google.android.exoplayer2.PlaybackInfo r3 = r0.copyWithPlaybackState(r3)
            com.google.android.exoplayer2.ExoPlayerImplInternal r12 = r11.internalPlayer
            long r15 = com.google.android.exoplayer2.util.Util.msToUs(r1)
            com.google.android.exoplayer2.source.ShuffleOrder r0 = r11.shuffleOrder
            r17 = r0
            r12.setMediaSources(r13, r14, r15, r17)
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.periodId
            java.lang.Object r0 = r0.periodUid
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.periodId
            java.lang.Object r1 = r1.periodUid
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La8
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La8
            goto La9
        La8:
            r5 = 0
        La9:
            r2 = 0
            r4 = 1
            r6 = 0
            r7 = 4
            long r8 = r11.getCurrentPositionUsInternal(r3)
            r10 = -1
            r12 = 0
            r0 = r18
            r1 = r3
            r3 = r4
            r4 = r6
            r6 = r7
            r7 = r8
            r9 = r10
            r10 = r12
            r0.updatePlaybackInfo(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            return
    }

    private void setNonVideoOutputSurfaceHolderInternal(android.view.SurfaceHolder r3) {
            r2 = this;
            r0 = 0
            r2.surfaceHolderSurfaceIsVideoOutput = r0
            r2.surfaceHolder = r3
            com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener r1 = r2.componentListener
            r3.addCallback(r1)
            android.view.SurfaceHolder r3 = r2.surfaceHolder
            android.view.Surface r3 = r3.getSurface()
            if (r3 == 0) goto L2a
            boolean r3 = r3.isValid()
            if (r3 == 0) goto L2a
            android.view.SurfaceHolder r3 = r2.surfaceHolder
            android.graphics.Rect r3 = r3.getSurfaceFrame()
            int r0 = r3.width()
            int r3 = r3.height()
            r2.maybeNotifySurfaceSizeChanged(r0, r3)
            goto L2d
        L2a:
            r2.maybeNotifySurfaceSizeChanged(r0, r0)
        L2d:
            return
    }

    private void setSurfaceTextureInternal(android.graphics.SurfaceTexture r2) {
            r1 = this;
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r2)
            r1.setVideoOutputInternal(r0)
            r1.ownedSurface = r0
            return
    }

    private void setVideoOutputInternal(@androidx.annotation.Nullable java.lang.Object r10) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.exoplayer2.Renderer[] r1 = r9.renderers
            int r2 = r1.length
            r3 = 0
            r4 = 0
        La:
            r5 = 1
            if (r4 >= r2) goto L2c
            r6 = r1[r4]
            int r7 = r6.getTrackType()
            r8 = 2
            if (r7 != r8) goto L29
            com.google.android.exoplayer2.PlayerMessage r6 = r9.createMessageInternal(r6)
            com.google.android.exoplayer2.PlayerMessage r5 = r6.setType(r5)
            com.google.android.exoplayer2.PlayerMessage r5 = r5.setPayload(r10)
            com.google.android.exoplayer2.PlayerMessage r5 = r5.send()
            r0.add(r5)
        L29:
            int r4 = r4 + 1
            goto La
        L2c:
            java.lang.Object r1 = r9.videoOutput
            if (r1 == 0) goto L5f
            if (r1 == r10) goto L5f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.util.concurrent.TimeoutException -> L48 java.lang.InterruptedException -> L4a
        L36:
            boolean r1 = r0.hasNext()     // Catch: java.util.concurrent.TimeoutException -> L48 java.lang.InterruptedException -> L4a
            if (r1 == 0) goto L51
            java.lang.Object r1 = r0.next()     // Catch: java.util.concurrent.TimeoutException -> L48 java.lang.InterruptedException -> L4a
            com.google.android.exoplayer2.PlayerMessage r1 = (com.google.android.exoplayer2.PlayerMessage) r1     // Catch: java.util.concurrent.TimeoutException -> L48 java.lang.InterruptedException -> L4a
            long r6 = r9.detachSurfaceTimeoutMs     // Catch: java.util.concurrent.TimeoutException -> L48 java.lang.InterruptedException -> L4a
            r1.blockUntilDelivered(r6)     // Catch: java.util.concurrent.TimeoutException -> L48 java.lang.InterruptedException -> L4a
            goto L36
        L48:
            goto L52
        L4a:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L51:
            r5 = 0
        L52:
            java.lang.Object r0 = r9.videoOutput
            android.view.Surface r1 = r9.ownedSurface
            if (r0 != r1) goto L60
            r1.release()
            r0 = 0
            r9.ownedSurface = r0
            goto L60
        L5f:
            r5 = 0
        L60:
            r9.videoOutput = r10
            if (r5 == 0) goto L73
            com.google.android.exoplayer2.ExoTimeoutException r10 = new com.google.android.exoplayer2.ExoTimeoutException
            r0 = 3
            r10.<init>(r0)
            r0 = 1003(0x3eb, float:1.406E-42)
            com.google.android.exoplayer2.ExoPlaybackException r10 = com.google.android.exoplayer2.ExoPlaybackException.createForUnexpected(r10, r0)
            r9.stopInternal(r3, r10)
        L73:
            return
    }

    private void stopInternal(boolean r14, @androidx.annotation.Nullable com.google.android.exoplayer2.ExoPlaybackException r15) {
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L13
            java.util.List<com.google.android.exoplayer2.ExoPlayerImpl$MediaSourceHolderSnapshot> r14 = r13.mediaSourceHolderSnapshots
            int r14 = r14.size()
            com.google.android.exoplayer2.PlaybackInfo r14 = r13.removeMediaItemsInternal(r0, r14)
            r1 = 0
            com.google.android.exoplayer2.PlaybackInfo r14 = r14.copyWithPlaybackError(r1)
            goto L23
        L13:
            com.google.android.exoplayer2.PlaybackInfo r14 = r13.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r14.periodId
            com.google.android.exoplayer2.PlaybackInfo r14 = r14.copyWithLoadingMediaPeriodId(r1)
            long r1 = r14.positionUs
            r14.bufferedPositionUs = r1
            r1 = 0
            r14.totalBufferedDurationUs = r1
        L23:
            r1 = 1
            com.google.android.exoplayer2.PlaybackInfo r14 = r14.copyWithPlaybackState(r1)
            if (r15 == 0) goto L2e
            com.google.android.exoplayer2.PlaybackInfo r14 = r14.copyWithPlaybackError(r15)
        L2e:
            r3 = r14
            int r14 = r13.pendingOperationAcks
            int r14 = r14 + r1
            r13.pendingOperationAcks = r14
            com.google.android.exoplayer2.ExoPlayerImplInternal r14 = r13.internalPlayer
            r14.stop()
            com.google.android.exoplayer2.Timeline r14 = r3.timeline
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L4d
            com.google.android.exoplayer2.PlaybackInfo r14 = r13.playbackInfo
            com.google.android.exoplayer2.Timeline r14 = r14.timeline
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L4d
            r7 = 1
            goto L4e
        L4d:
            r7 = 0
        L4e:
            r4 = 0
            r5 = 1
            r6 = 0
            r8 = 4
            long r9 = r13.getCurrentPositionUsInternal(r3)
            r11 = -1
            r12 = 0
            r2 = r13
            r2.updatePlaybackInfo(r3, r4, r5, r6, r7, r8, r9, r11, r12)
            return
    }

    private void updateAvailableCommands() {
            r4 = this;
            com.google.android.exoplayer2.Player$Commands r0 = r4.availableCommands
            com.google.android.exoplayer2.Player r1 = r4.wrappingPlayer
            com.google.android.exoplayer2.Player$Commands r2 = r4.permanentAvailableCommands
            com.google.android.exoplayer2.Player$Commands r1 = com.google.android.exoplayer2.util.Util.getAvailableCommands(r1, r2)
            r4.availableCommands = r1
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1f
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r4.listeners
            r1 = 13
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda10 r2 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda10
            r3 = 3
            r2.<init>(r4, r3)
            r0.queueEvent(r1, r2)
        L1f:
            return
    }

    private void updatePlayWhenReady(boolean r12, int r13, int r14) {
            r11 = this;
            r1 = 0
            r2 = 1
            if (r12 == 0) goto L9
            r3 = -1
            if (r13 == r3) goto L9
            r3 = 1
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto Lf
            if (r13 == r2) goto Lf
            r1 = 1
        Lf:
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo
            boolean r4 = r0.playWhenReady
            if (r4 != r3) goto L1a
            int r4 = r0.playbackSuppressionReason
            if (r4 != r1) goto L1a
            return
        L1a:
            int r4 = r11.pendingOperationAcks
            int r4 = r4 + r2
            r11.pendingOperationAcks = r4
            com.google.android.exoplayer2.PlaybackInfo r2 = r0.copyWithPlayWhenReady(r3, r1)
            com.google.android.exoplayer2.ExoPlayerImplInternal r0 = r11.internalPlayer
            r0.setPlayWhenReady(r3, r1)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 5
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            r10 = 0
            r0 = r11
            r1 = r2
            r2 = r3
            r3 = r14
            r0.updatePlaybackInfo(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            return
    }

    private void updatePlaybackInfo(com.google.android.exoplayer2.PlaybackInfo r17, int r18, int r19, boolean r20, boolean r21, int r22, long r23, int r25, boolean r26) {
            r16 = this;
            r7 = r16
            r8 = r17
            r9 = r22
            com.google.android.exoplayer2.PlaybackInfo r10 = r7.playbackInfo
            r7.playbackInfo = r8
            com.google.android.exoplayer2.Timeline r0 = r10.timeline
            com.google.android.exoplayer2.Timeline r1 = r8.timeline
            boolean r0 = r0.equals(r1)
            r11 = 1
            r12 = r0 ^ 1
            r0 = r16
            r1 = r17
            r2 = r10
            r3 = r21
            r4 = r22
            r5 = r12
            r6 = r26
            android.util.Pair r0 = r0.evaluateMediaItemTransitionReason(r1, r2, r3, r4, r5, r6)
            java.lang.Object r1 = r0.first
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.google.android.exoplayer2.MediaMetadata r2 = r7.mediaMetadata
            r3 = 0
            if (r1 == 0) goto L5e
            com.google.android.exoplayer2.Timeline r4 = r8.timeline
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L5a
            com.google.android.exoplayer2.Timeline r3 = r8.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r8.periodId
            java.lang.Object r4 = r4.periodUid
            com.google.android.exoplayer2.Timeline$Period r5 = r7.period
            com.google.android.exoplayer2.Timeline$Period r3 = r3.getPeriodByUid(r4, r5)
            int r3 = r3.windowIndex
            com.google.android.exoplayer2.Timeline r4 = r8.timeline
            com.google.android.exoplayer2.Timeline$Window r5 = r7.window
            com.google.android.exoplayer2.Timeline$Window r3 = r4.getWindow(r3, r5)
            com.google.android.exoplayer2.MediaItem r3 = r3.mediaItem
        L5a:
            com.google.android.exoplayer2.MediaMetadata r4 = com.google.android.exoplayer2.MediaMetadata.EMPTY
            r7.staticAndDynamicMediaMetadata = r4
        L5e:
            if (r1 != 0) goto L6a
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r4 = r10.staticMetadata
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r5 = r8.staticMetadata
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L80
        L6a:
            com.google.android.exoplayer2.MediaMetadata r2 = r7.staticAndDynamicMediaMetadata
            com.google.android.exoplayer2.MediaMetadata$Builder r2 = r2.buildUpon()
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r4 = r8.staticMetadata
            com.google.android.exoplayer2.MediaMetadata$Builder r2 = r2.populateFromMetadata(r4)
            com.google.android.exoplayer2.MediaMetadata r2 = r2.build()
            r7.staticAndDynamicMediaMetadata = r2
            com.google.android.exoplayer2.MediaMetadata r2 = r16.buildUpdatedMediaMetadata()
        L80:
            com.google.android.exoplayer2.MediaMetadata r4 = r7.mediaMetadata
            boolean r4 = r2.equals(r4)
            r4 = r4 ^ r11
            r7.mediaMetadata = r2
            boolean r2 = r10.playWhenReady
            boolean r5 = r8.playWhenReady
            r6 = 0
            if (r2 == r5) goto L92
            r2 = 1
            goto L93
        L92:
            r2 = 0
        L93:
            int r5 = r10.playbackState
            int r13 = r8.playbackState
            if (r5 == r13) goto L9b
            r5 = 1
            goto L9c
        L9b:
            r5 = 0
        L9c:
            if (r5 != 0) goto La0
            if (r2 == 0) goto La3
        La0:
            r16.updateWakeAndWifiLock()
        La3:
            boolean r13 = r10.isLoading
            boolean r14 = r8.isLoading
            if (r13 == r14) goto Lab
            r13 = 1
            goto Lac
        Lab:
            r13 = 0
        Lac:
            if (r13 == 0) goto Lb1
            r7.updatePriorityTaskManagerForIsLoadingChange(r14)
        Lb1:
            if (r12 == 0) goto Lbf
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r12 = r7.listeners
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda5 r14 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda5
            r15 = r18
            r14.<init>(r8, r15, r6)
            r12.queueEvent(r6, r14)
        Lbf:
            if (r21 == 0) goto Ldc
            r12 = r25
            com.google.android.exoplayer2.Player$PositionInfo r12 = r7.getPreviousPositionInfo(r9, r10, r12)
            r14 = r23
            com.google.android.exoplayer2.Player$PositionInfo r14 = r7.getPositionInfo(r14)
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r15 = r7.listeners
            r11 = 11
            r26 = r2
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda1 r2 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda1
            r2.<init>(r9, r12, r14, r6)
            r15.queueEvent(r11, r2)
            goto Lde
        Ldc:
            r26 = r2
        Lde:
            if (r1 == 0) goto Leb
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r1 = r7.listeners
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda2 r2 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda2
            r2.<init>(r3, r0, r6)
            r0 = 1
            r1.queueEvent(r0, r2)
        Leb:
            com.google.android.exoplayer2.ExoPlaybackException r0 = r10.playbackError
            com.google.android.exoplayer2.ExoPlaybackException r1 = r8.playbackError
            r2 = 4
            if (r0 == r1) goto L10c
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r7.listeners
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4 r1 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4
            r1.<init>(r8, r6)
            r3 = 10
            r0.queueEvent(r3, r1)
            com.google.android.exoplayer2.ExoPlaybackException r0 = r8.playbackError
            if (r0 == 0) goto L10c
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r7.listeners
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4 r1 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4
            r1.<init>(r8, r2)
            r0.queueEvent(r3, r1)
        L10c:
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r0 = r10.trackSelectorResult
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r1 = r8.trackSelectorResult
            r3 = 5
            r9 = 2
            if (r0 == r1) goto L125
            com.google.android.exoplayer2.trackselection.TrackSelector r0 = r7.trackSelector
            java.lang.Object r1 = r1.info
            r0.onSelectionActivated(r1)
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r7.listeners
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4 r1 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4
            r1.<init>(r8, r3)
            r0.queueEvent(r9, r1)
        L125:
            if (r4 == 0) goto L135
            com.google.android.exoplayer2.MediaMetadata r0 = r7.mediaMetadata
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r1 = r7.listeners
            r4 = 14
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda3 r11 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda3
            r11.<init>(r0, r6)
            r1.queueEvent(r4, r11)
        L135:
            r0 = 6
            r1 = 3
            if (r13 == 0) goto L143
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r4 = r7.listeners
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4 r6 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4
            r6.<init>(r8, r0)
            r4.queueEvent(r1, r6)
        L143:
            r4 = 7
            r6 = -1
            if (r5 != 0) goto L149
            if (r26 == 0) goto L153
        L149:
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r11 = r7.listeners
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4 r12 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4
            r12.<init>(r8, r4)
            r11.queueEvent(r6, r12)
        L153:
            if (r5 == 0) goto L161
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r5 = r7.listeners
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4 r11 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4
            r12 = 8
            r11.<init>(r8, r12)
            r5.queueEvent(r2, r11)
        L161:
            if (r26 == 0) goto L171
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r2 = r7.listeners
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda5 r5 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda5
            r11 = r19
            r12 = 1
            r5.<init>(r8, r11, r12)
            r2.queueEvent(r3, r5)
            goto L172
        L171:
            r12 = 1
        L172:
            int r2 = r10.playbackSuppressionReason
            int r3 = r8.playbackSuppressionReason
            if (r2 == r3) goto L182
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r2 = r7.listeners
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4 r3 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4
            r3.<init>(r8, r12)
            r2.queueEvent(r0, r3)
        L182:
            boolean r0 = isPlaying(r10)
            boolean r2 = isPlaying(r17)
            if (r0 == r2) goto L196
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r7.listeners
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4 r2 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4
            r2.<init>(r8, r9)
            r0.queueEvent(r4, r2)
        L196:
            com.google.android.exoplayer2.PlaybackParameters r0 = r10.playbackParameters
            com.google.android.exoplayer2.PlaybackParameters r2 = r8.playbackParameters
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1ac
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r7.listeners
            r2 = 12
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4 r3 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4
            r3.<init>(r8, r1)
            r0.queueEvent(r2, r3)
        L1ac:
            if (r20 == 0) goto L1b5
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r7.listeners
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r1 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$4
            r0.queueEvent(r6, r1)
        L1b5:
            r16.updateAvailableCommands()
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r7.listeners
            r0.flushEvents()
            boolean r0 = r10.sleepingForOffload
            boolean r1 = r8.sleepingForOffload
            if (r0 == r1) goto L1db
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.ExoPlayer$AudioOffloadListener> r0 = r7.audioOffloadListeners
            java.util.Iterator r0 = r0.iterator()
        L1c9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1db
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.ExoPlayer$AudioOffloadListener r1 = (com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener) r1
            boolean r2 = r8.sleepingForOffload
            r1.onExperimentalSleepingForOffloadChanged(r2)
            goto L1c9
        L1db:
            return
    }

    private void updatePriorityTaskManagerForIsLoadingChange(boolean r4) {
            r3 = this;
            com.google.android.exoplayer2.util.PriorityTaskManager r0 = r3.priorityTaskManager
            if (r0 == 0) goto L1d
            r1 = 0
            if (r4 == 0) goto L12
            boolean r2 = r3.isPriorityTaskManagerRegistered
            if (r2 != 0) goto L12
            r0.add(r1)
            r4 = 1
            r3.isPriorityTaskManagerRegistered = r4
            goto L1d
        L12:
            if (r4 != 0) goto L1d
            boolean r4 = r3.isPriorityTaskManagerRegistered
            if (r4 == 0) goto L1d
            r0.remove(r1)
            r3.isPriorityTaskManagerRegistered = r1
        L1d:
            return
    }

    private void updateWakeAndWifiLock() {
            r5 = this;
            int r0 = r5.getPlaybackState()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L35
            r3 = 2
            if (r0 == r3) goto L18
            r3 = 3
            if (r0 == r3) goto L18
            r1 = 4
            if (r0 != r1) goto L12
            goto L35
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L18:
            boolean r0 = r5.experimentalIsSleepingForOffload()
            com.google.android.exoplayer2.WakeLockManager r3 = r5.wakeLockManager
            boolean r4 = r5.getPlayWhenReady()
            if (r4 == 0) goto L27
            if (r0 != 0) goto L27
            goto L28
        L27:
            r1 = 0
        L28:
            r3.setStayAwake(r1)
            com.google.android.exoplayer2.WifiLockManager r0 = r5.wifiLockManager
            boolean r1 = r5.getPlayWhenReady()
            r0.setStayAwake(r1)
            goto L3f
        L35:
            com.google.android.exoplayer2.WakeLockManager r0 = r5.wakeLockManager
            r0.setStayAwake(r2)
            com.google.android.exoplayer2.WifiLockManager r0 = r5.wifiLockManager
            r0.setStayAwake(r2)
        L3f:
            return
    }

    private void verifyApplicationThread() {
            r4 = this;
            com.google.android.exoplayer2.util.ConditionVariable r0 = r4.constructorFinished
            r0.blockUninterruptible()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Looper r1 = r4.getApplicationLooper()
            java.lang.Thread r1 = r1.getThread()
            if (r0 == r1) goto L53
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r0[r1] = r2
            android.os.Looper r1 = r4.getApplicationLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.String r1 = r1.getName()
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.formatInvariant(r1, r0)
            boolean r1 = r4.throwsWhenUsingWrongThread
            if (r1 != 0) goto L4d
            boolean r1 = r4.hasNotifiedFullWrongThreadWarning
            if (r1 == 0) goto L40
            r1 = 0
            goto L45
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
        L45:
            java.lang.String r3 = "ExoPlayerImpl"
            com.google.android.exoplayer2.util.Log.w(r3, r0, r1)
            r4.hasNotifiedFullWrongThreadWarning = r2
            goto L53
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L53:
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAnalyticsListener(com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r1 = this;
            com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = r1.analyticsCollector
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.analytics.AnalyticsListener r2 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r2
            r0.addListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAudioOffloadListener(com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.ExoPlayer$AudioOffloadListener> r0 = r1.audioOffloadListeners
            r0.add(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void addListener(com.google.android.exoplayer2.Player.Listener r2) {
            r1 = this;
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r1.listeners
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            r0.add(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItems(int r1, java.util.List<com.google.android.exoplayer2.MediaItem> r2) {
            r0 = this;
            r0.verifyApplicationThread()
            java.util.List r2 = r0.createMediaSources(r2)
            r0.addMediaSources(r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(int r1, com.google.android.exoplayer2.source.MediaSource r2) {
            r0 = this;
            r0.verifyApplicationThread()
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r0.addMediaSources(r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(com.google.android.exoplayer2.source.MediaSource r1) {
            r0 = this;
            r0.verifyApplicationThread()
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.addMediaSources(r1)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(int r13, java.util.List<com.google.android.exoplayer2.source.MediaSource> r14) {
            r12 = this;
            r12.verifyApplicationThread()
            r1 = 1
            if (r13 < 0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            java.util.List<com.google.android.exoplayer2.ExoPlayerImpl$MediaSourceHolderSnapshot> r2 = r12.mediaSourceHolderSnapshots
            int r2 = r2.size()
            int r0 = java.lang.Math.min(r13, r2)
            com.google.android.exoplayer2.Timeline r2 = r12.getCurrentTimeline()
            int r3 = r12.pendingOperationAcks
            int r3 = r3 + r1
            r12.pendingOperationAcks = r3
            java.util.List r1 = r12.addMediaSourceHolders(r0, r14)
            com.google.android.exoplayer2.Timeline r3 = r12.createMaskingTimeline()
            com.google.android.exoplayer2.PlaybackInfo r4 = r12.playbackInfo
            android.util.Pair r2 = r12.getPeriodPositionUsAfterTimelineChanged(r2, r3)
            com.google.android.exoplayer2.PlaybackInfo r2 = r12.maskTimelineAndPosition(r4, r3, r2)
            com.google.android.exoplayer2.ExoPlayerImplInternal r3 = r12.internalPlayer
            com.google.android.exoplayer2.source.ShuffleOrder r4 = r12.shuffleOrder
            r3.addMediaSources(r0, r1, r4)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 5
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = -1
            r11 = 0
            r0 = r12
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r9 = r10
            r10 = r11
            r0.updatePlaybackInfo(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> r2) {
            r1 = this;
            r1.verifyApplicationThread()
            java.util.List<com.google.android.exoplayer2.ExoPlayerImpl$MediaSourceHolderSnapshot> r0 = r1.mediaSourceHolderSnapshots
            int r0 = r0.size()
            r1.addMediaSources(r0, r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void clearAuxEffectInfo() {
            r3 = this;
            r3.verifyApplicationThread()
            com.google.android.exoplayer2.audio.AuxEffectInfo r0 = new com.google.android.exoplayer2.audio.AuxEffectInfo
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            r3.setAuxEffectInfo(r0)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearCameraMotionListener(com.google.android.exoplayer2.video.spherical.CameraMotionListener r2) {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.video.spherical.CameraMotionListener r0 = r1.cameraMotionListener
            if (r0 == r2) goto L8
            return
        L8:
            com.google.android.exoplayer2.ExoPlayerImpl$FrameMetadataListener r2 = r1.frameMetadataListener
            com.google.android.exoplayer2.PlayerMessage r2 = r1.createMessageInternal(r2)
            r0 = 8
            com.google.android.exoplayer2.PlayerMessage r2 = r2.setType(r0)
            r0 = 0
            com.google.android.exoplayer2.PlayerMessage r2 = r2.setPayload(r0)
            r2.send()
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoFrameMetadataListener(com.google.android.exoplayer2.video.VideoFrameMetadataListener r2) {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.video.VideoFrameMetadataListener r0 = r1.videoFrameMetadataListener
            if (r0 == r2) goto L8
            return
        L8:
            com.google.android.exoplayer2.ExoPlayerImpl$FrameMetadataListener r2 = r1.frameMetadataListener
            com.google.android.exoplayer2.PlayerMessage r2 = r1.createMessageInternal(r2)
            r0 = 7
            com.google.android.exoplayer2.PlayerMessage r2 = r2.setType(r0)
            r0 = 0
            com.google.android.exoplayer2.PlayerMessage r2 = r2.setPayload(r0)
            r2.send()
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurface() {
            r1 = this;
            r1.verifyApplicationThread()
            r1.removeSurfaceCallbacks()
            r0 = 0
            r1.setVideoOutputInternal(r0)
            r0 = 0
            r1.maybeNotifySurfaceSizeChanged(r0, r0)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurface(@androidx.annotation.Nullable android.view.Surface r2) {
            r1 = this;
            r1.verifyApplicationThread()
            if (r2 == 0) goto Lc
            java.lang.Object r0 = r1.videoOutput
            if (r2 != r0) goto Lc
            r1.clearVideoSurface()
        Lc:
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurfaceHolder(@androidx.annotation.Nullable android.view.SurfaceHolder r2) {
            r1 = this;
            r1.verifyApplicationThread()
            if (r2 == 0) goto Lc
            android.view.SurfaceHolder r0 = r1.surfaceHolder
            if (r2 != r0) goto Lc
            r1.clearVideoSurface()
        Lc:
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurfaceView(@androidx.annotation.Nullable android.view.SurfaceView r1) {
            r0 = this;
            r0.verifyApplicationThread()
            if (r1 != 0) goto L7
            r1 = 0
            goto Lb
        L7:
            android.view.SurfaceHolder r1 = r1.getHolder()
        Lb:
            r0.clearVideoSurfaceHolder(r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoTextureView(@androidx.annotation.Nullable android.view.TextureView r2) {
            r1 = this;
            r1.verifyApplicationThread()
            if (r2 == 0) goto Lc
            android.view.TextureView r0 = r1.textureView
            if (r2 != r0) goto Lc
            r1.clearVideoSurface()
        Lc:
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.PlayerMessage createMessage(com.google.android.exoplayer2.PlayerMessage.Target r1) {
            r0 = this;
            r0.verifyApplicationThread()
            com.google.android.exoplayer2.PlayerMessage r1 = r0.createMessageInternal(r1)
            return r1
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void decreaseDeviceVolume() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.StreamVolumeManager r0 = r1.streamVolumeManager
            r0.decreaseVolume()
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean experimentalIsSleepingForOffload() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            boolean r0 = r0.sleepingForOffload
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void experimentalSetOffloadSchedulingEnabled(boolean r3) {
            r2 = this;
            r2.verifyApplicationThread()
            com.google.android.exoplayer2.ExoPlayerImplInternal r0 = r2.internalPlayer
            r0.experimentalSetOffloadSchedulingEnabled(r3)
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.ExoPlayer$AudioOffloadListener> r0 = r2.audioOffloadListeners
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.ExoPlayer$AudioOffloadListener r1 = (com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener) r1
            r1.onExperimentalOffloadSchedulingEnabledChanged(r3)
            goto Le
        L1e:
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.analytics.AnalyticsCollector getAnalyticsCollector() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = r1.analyticsCollector
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public android.os.Looper getApplicationLooper() {
            r1 = this;
            android.os.Looper r0 = r1.applicationLooper
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public com.google.android.exoplayer2.audio.AudioAttributes getAudioAttributes() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.audio.AudioAttributes r0 = r1.audioAttributes
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public com.google.android.exoplayer2.ExoPlayer.AudioComponent getAudioComponent() {
            r0 = this;
            r0.verifyApplicationThread()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.decoder.DecoderCounters getAudioDecoderCounters() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.decoder.DecoderCounters r0 = r1.audioDecoderCounters
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.Format getAudioFormat() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.Format r0 = r1.audioFormat
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public int getAudioSessionId() {
            r1 = this;
            r1.verifyApplicationThread()
            int r0 = r1.audioSessionId
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.Player.Commands getAvailableCommands() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.Player$Commands r0 = r1.availableCommands
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getBufferedPosition() {
            r2 = this;
            r2.verifyApplicationThread()
            boolean r0 = r2.isPlayingAd()
            if (r0 == 0) goto L23
            com.google.android.exoplayer2.PlaybackInfo r0 = r2.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r0.loadingMediaPeriodId
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.periodId
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
            com.google.android.exoplayer2.PlaybackInfo r0 = r2.playbackInfo
            long r0 = r0.bufferedPositionUs
            long r0 = com.google.android.exoplayer2.util.Util.usToMs(r0)
            goto L22
        L1e:
            long r0 = r2.getDuration()
        L22:
            return r0
        L23:
            long r0 = r2.getContentBufferedPosition()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.util.Clock getClock() {
            r1 = this;
            com.google.android.exoplayer2.util.Clock r0 = r1.clock
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentBufferedPosition() {
            r6 = this;
            r6.verifyApplicationThread()
            com.google.android.exoplayer2.PlaybackInfo r0 = r6.playbackInfo
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            long r0 = r6.maskingWindowPositionMs
            return r0
        L10:
            com.google.android.exoplayer2.PlaybackInfo r0 = r6.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r0.loadingMediaPeriodId
            long r1 = r1.windowSequenceNumber
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.periodId
            long r3 = r3.windowSequenceNumber
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L2f
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            int r1 = r6.getCurrentMediaItemIndex()
            com.google.android.exoplayer2.Timeline$Window r2 = r6.window
            com.google.android.exoplayer2.Timeline$Window r0 = r0.getWindow(r1, r2)
            long r0 = r0.getDurationMs()
            return r0
        L2f:
            long r0 = r0.bufferedPositionUs
            com.google.android.exoplayer2.PlaybackInfo r2 = r6.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.loadingMediaPeriodId
            boolean r2 = r2.isAd()
            if (r2 == 0) goto L5d
            com.google.android.exoplayer2.PlaybackInfo r0 = r6.playbackInfo
            com.google.android.exoplayer2.Timeline r1 = r0.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.loadingMediaPeriodId
            java.lang.Object r0 = r0.periodUid
            com.google.android.exoplayer2.Timeline$Period r2 = r6.period
            com.google.android.exoplayer2.Timeline$Period r0 = r1.getPeriodByUid(r0, r2)
            com.google.android.exoplayer2.PlaybackInfo r1 = r6.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.loadingMediaPeriodId
            int r1 = r1.adGroupIndex
            long r1 = r0.getAdGroupTimeUs(r1)
            r3 = -9223372036854775808
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L5c
            long r0 = r0.durationUs
            goto L5d
        L5c:
            r0 = r1
        L5d:
            com.google.android.exoplayer2.PlaybackInfo r2 = r6.playbackInfo
            com.google.android.exoplayer2.Timeline r3 = r2.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.loadingMediaPeriodId
            long r0 = r6.periodPositionUsToWindowPositionUs(r3, r2, r0)
            long r0 = com.google.android.exoplayer2.util.Util.usToMs(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentPosition() {
            r6 = this;
            r6.verifyApplicationThread()
            boolean r0 = r6.isPlayingAd()
            if (r0 == 0) goto L44
            com.google.android.exoplayer2.PlaybackInfo r0 = r6.playbackInfo
            com.google.android.exoplayer2.Timeline r1 = r0.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.periodId
            java.lang.Object r0 = r0.periodUid
            com.google.android.exoplayer2.Timeline$Period r2 = r6.period
            r1.getPeriodByUid(r0, r2)
            com.google.android.exoplayer2.PlaybackInfo r0 = r6.playbackInfo
            long r1 = r0.requestedContentPositionUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L34
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            int r1 = r6.getCurrentMediaItemIndex()
            com.google.android.exoplayer2.Timeline$Window r2 = r6.window
            com.google.android.exoplayer2.Timeline$Window r0 = r0.getWindow(r1, r2)
            long r0 = r0.getDefaultPositionMs()
            goto L43
        L34:
            com.google.android.exoplayer2.Timeline$Period r0 = r6.period
            long r0 = r0.getPositionInWindowMs()
            com.google.android.exoplayer2.PlaybackInfo r2 = r6.playbackInfo
            long r2 = r2.requestedContentPositionUs
            long r2 = com.google.android.exoplayer2.util.Util.usToMs(r2)
            long r0 = r0 + r2
        L43:
            return r0
        L44:
            long r0 = r6.getCurrentPosition()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdGroupIndex() {
            r1 = this;
            r1.verifyApplicationThread()
            boolean r0 = r1.isPlayingAd()
            if (r0 == 0) goto L10
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.periodId
            int r0 = r0.adGroupIndex
            goto L11
        L10:
            r0 = -1
        L11:
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdIndexInAdGroup() {
            r1 = this;
            r1.verifyApplicationThread()
            boolean r0 = r1.isPlayingAd()
            if (r0 == 0) goto L10
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.periodId
            int r0 = r0.adIndexInAdGroup
            goto L11
        L10:
            r0 = -1
        L11:
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.TextComponent
    public com.google.android.exoplayer2.text.CueGroup getCurrentCues() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.text.CueGroup r0 = r1.currentCueGroup
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentMediaItemIndex() {
            r2 = this;
            r2.verifyApplicationThread()
            int r0 = r2.getCurrentWindowIndexInternal()
            r1 = -1
            if (r0 != r1) goto Lb
            r0 = 0
        Lb:
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentPeriodIndex() {
            r2 = this;
            r2.verifyApplicationThread()
            com.google.android.exoplayer2.PlaybackInfo r0 = r2.playbackInfo
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            int r0 = r2.maskingPeriodIndex
            return r0
        L10:
            com.google.android.exoplayer2.PlaybackInfo r0 = r2.playbackInfo
            com.google.android.exoplayer2.Timeline r1 = r0.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.periodId
            java.lang.Object r0 = r0.periodUid
            int r0 = r1.getIndexOfPeriod(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentPosition() {
            r2 = this;
            r2.verifyApplicationThread()
            com.google.android.exoplayer2.PlaybackInfo r0 = r2.playbackInfo
            long r0 = r2.getCurrentPositionUsInternal(r0)
            long r0 = com.google.android.exoplayer2.util.Util.usToMs(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.Timeline getCurrentTimeline() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.source.TrackGroupArray getCurrentTrackGroups() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r0.trackGroups
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.trackselection.TrackSelectionArray getCurrentTrackSelections() {
            r2 = this;
            r2.verifyApplicationThread()
            com.google.android.exoplayer2.trackselection.TrackSelectionArray r0 = new com.google.android.exoplayer2.trackselection.TrackSelectionArray
            com.google.android.exoplayer2.PlaybackInfo r1 = r2.playbackInfo
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r1 = r1.trackSelectorResult
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r1 = r1.selections
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.Tracks getCurrentTracks() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r0 = r0.trackSelectorResult
            com.google.android.exoplayer2.Tracks r0 = r0.tracks
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public com.google.android.exoplayer2.ExoPlayer.DeviceComponent getDeviceComponent() {
            r0 = this;
            r0.verifyApplicationThread()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public com.google.android.exoplayer2.DeviceInfo getDeviceInfo() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.DeviceInfo r0 = r1.deviceInfo
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public int getDeviceVolume() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.StreamVolumeManager r0 = r1.streamVolumeManager
            int r0 = r0.getVolume()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
            r4 = this;
            r4.verifyApplicationThread()
            boolean r0 = r4.isPlayingAd()
            if (r0 == 0) goto L25
            com.google.android.exoplayer2.PlaybackInfo r0 = r4.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r0.periodId
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            java.lang.Object r2 = r1.periodUid
            com.google.android.exoplayer2.Timeline$Period r3 = r4.period
            r0.getPeriodByUid(r2, r3)
            com.google.android.exoplayer2.Timeline$Period r0 = r4.period
            int r2 = r1.adGroupIndex
            int r1 = r1.adIndexInAdGroup
            long r0 = r0.getAdDurationUs(r2, r1)
            long r0 = com.google.android.exoplayer2.util.Util.usToMs(r0)
            return r0
        L25:
            long r0 = r4.getContentDuration()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getMaxSeekToPreviousPosition() {
            r2 = this;
            r2.verifyApplicationThread()
            r0 = 3000(0xbb8, double:1.482E-320)
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.MediaMetadata getMediaMetadata() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.MediaMetadata r0 = r1.mediaMetadata
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
            r1 = this;
            r1.verifyApplicationThread()
            boolean r0 = r1.pauseAtEndOfMediaItems
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getPlayWhenReady() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            boolean r0 = r0.playWhenReady
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public android.os.Looper getPlaybackLooper() {
            r1 = this;
            com.google.android.exoplayer2.ExoPlayerImplInternal r0 = r1.internalPlayer
            android.os.Looper r0 = r0.getPlaybackLooper()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.playbackParameters
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackState() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            int r0 = r0.playbackState
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackSuppressionReason() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            int r0 = r0.playbackSuppressionReason
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.ExoPlaybackException getPlayerError() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.ExoPlaybackException r0 = r0.playbackError
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.PlaybackException getPlayerError() {
            r1 = this;
            com.google.android.exoplayer2.ExoPlaybackException r0 = r1.getPlayerError()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.MediaMetadata getPlaylistMetadata() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.MediaMetadata r0 = r1.playlistMetadata
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.Renderer getRenderer(int r2) {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.Renderer[] r0 = r1.renderers
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererCount() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.Renderer[] r0 = r1.renderers
            int r0 = r0.length
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererType(int r2) {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.Renderer[] r0 = r1.renderers
            r2 = r0[r2]
            int r2 = r2.getTrackType()
            return r2
    }

    @Override // com.google.android.exoplayer2.Player
    public int getRepeatMode() {
            r1 = this;
            r1.verifyApplicationThread()
            int r0 = r1.repeatMode
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekBackIncrement() {
            r2 = this;
            r2.verifyApplicationThread()
            long r0 = r2.seekBackIncrementMs
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekForwardIncrement() {
            r2 = this;
            r2.verifyApplicationThread()
            long r0 = r2.seekForwardIncrementMs
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.SeekParameters getSeekParameters() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.SeekParameters r0 = r1.seekParameters
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getShuffleModeEnabled() {
            r1 = this;
            r1.verifyApplicationThread()
            boolean r0 = r1.shuffleModeEnabled
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public boolean getSkipSilenceEnabled() {
            r1 = this;
            r1.verifyApplicationThread()
            boolean r0 = r1.skipSilenceEnabled
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.util.Size getSurfaceSize() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.util.Size r0 = r1.surfaceSize
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public com.google.android.exoplayer2.ExoPlayer.TextComponent getTextComponent() {
            r0 = this;
            r0.verifyApplicationThread()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getTotalBufferedDuration() {
            r2 = this;
            r2.verifyApplicationThread()
            com.google.android.exoplayer2.PlaybackInfo r0 = r2.playbackInfo
            long r0 = r0.totalBufferedDurationUs
            long r0 = com.google.android.exoplayer2.util.Util.usToMs(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.trackselection.TrackSelectionParameters getTrackSelectionParameters() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.trackselection.TrackSelector r0 = r1.trackSelector
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0 = r0.getParameters()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.trackselection.TrackSelector getTrackSelector() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.trackselection.TrackSelector r0 = r1.trackSelector
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public int getVideoChangeFrameRateStrategy() {
            r1 = this;
            r1.verifyApplicationThread()
            int r0 = r1.videoChangeFrameRateStrategy
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public com.google.android.exoplayer2.ExoPlayer.VideoComponent getVideoComponent() {
            r0 = this;
            r0.verifyApplicationThread()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.decoder.DecoderCounters getVideoDecoderCounters() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.decoder.DecoderCounters r0 = r1.videoDecoderCounters
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.Format getVideoFormat() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.Format r0 = r1.videoFormat
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public int getVideoScalingMode() {
            r1 = this;
            r1.verifyApplicationThread()
            int r0 = r1.videoScalingMode
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public com.google.android.exoplayer2.video.VideoSize getVideoSize() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.video.VideoSize r0 = r1.videoSize
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public float getVolume() {
            r1 = this;
            r1.verifyApplicationThread()
            float r0 = r1.volume
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void increaseDeviceVolume() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.StreamVolumeManager r0 = r1.streamVolumeManager
            r0.increaseVolume()
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public boolean isDeviceMuted() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.StreamVolumeManager r0 = r1.streamVolumeManager
            boolean r0 = r0.isMuted()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isLoading() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            boolean r0 = r0.isLoading
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlayingAd() {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.periodId
            boolean r0 = r0.isAd()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean isTunnelingEnabled() {
            r5 = this;
            r5.verifyApplicationThread()
            com.google.android.exoplayer2.PlaybackInfo r0 = r5.playbackInfo
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r0 = r0.trackSelectorResult
            com.google.android.exoplayer2.RendererConfiguration[] r0 = r0.rendererConfigurations
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L1b
            r4 = r0[r3]
            if (r4 == 0) goto L18
            boolean r4 = r4.tunneling
            if (r4 == 0) goto L18
            r0 = 1
            return r0
        L18:
            int r3 = r3 + 1
            goto Lc
        L1b:
            return r2
    }

    @Override // com.google.android.exoplayer2.Player
    public void moveMediaItems(int r14, int r15, int r16) {
            r13 = this;
            r11 = r13
            r0 = r14
            r1 = r15
            r2 = r16
            r13.verifyApplicationThread()
            r3 = 1
            if (r0 < 0) goto L11
            if (r0 > r1) goto L11
            if (r2 < 0) goto L11
            r4 = 1
            goto L12
        L11:
            r4 = 0
        L12:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r4)
            java.util.List<com.google.android.exoplayer2.ExoPlayerImpl$MediaSourceHolderSnapshot> r4 = r11.mediaSourceHolderSnapshots
            int r4 = r4.size()
            int r1 = java.lang.Math.min(r15, r4)
            int r5 = r1 - r0
            int r5 = r4 - r5
            int r2 = java.lang.Math.min(r2, r5)
            if (r0 >= r4) goto L69
            if (r0 == r1) goto L69
            if (r0 != r2) goto L2e
            goto L69
        L2e:
            com.google.android.exoplayer2.Timeline r4 = r13.getCurrentTimeline()
            int r5 = r11.pendingOperationAcks
            int r5 = r5 + r3
            r11.pendingOperationAcks = r5
            java.util.List<com.google.android.exoplayer2.ExoPlayerImpl$MediaSourceHolderSnapshot> r3 = r11.mediaSourceHolderSnapshots
            com.google.android.exoplayer2.util.Util.moveItems(r3, r14, r1, r2)
            com.google.android.exoplayer2.Timeline r3 = r13.createMaskingTimeline()
            com.google.android.exoplayer2.PlaybackInfo r5 = r11.playbackInfo
            android.util.Pair r4 = r13.getPeriodPositionUsAfterTimelineChanged(r4, r3)
            com.google.android.exoplayer2.PlaybackInfo r3 = r13.maskTimelineAndPosition(r5, r3, r4)
            com.google.android.exoplayer2.ExoPlayerImplInternal r4 = r11.internalPlayer
            com.google.android.exoplayer2.source.ShuffleOrder r5 = r11.shuffleOrder
            r4.moveMediaSources(r14, r1, r2, r5)
            r2 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 5
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = -1
            r12 = 0
            r0 = r13
            r1 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r9 = r10
            r10 = r12
            r0.updatePlaybackInfo(r1, r2, r3, r4, r5, r6, r7, r9, r10)
        L69:
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void prepare() {
            r15 = this;
            r15.verifyApplicationThread()
            boolean r0 = r15.getPlayWhenReady()
            com.google.android.exoplayer2.AudioFocusManager r1 = r15.audioFocusManager
            r2 = 2
            int r1 = r1.updateAudioFocus(r0, r2)
            int r3 = getPlayWhenReadyChangeReason(r0, r1)
            r15.updatePlayWhenReady(r0, r1, r3)
            com.google.android.exoplayer2.PlaybackInfo r0 = r15.playbackInfo
            int r1 = r0.playbackState
            r3 = 1
            if (r1 == r3) goto L1d
            return
        L1d:
            r1 = 0
            com.google.android.exoplayer2.PlaybackInfo r0 = r0.copyWithPlaybackError(r1)
            com.google.android.exoplayer2.Timeline r1 = r0.timeline
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2b
            r2 = 4
        L2b:
            com.google.android.exoplayer2.PlaybackInfo r5 = r0.copyWithPlaybackState(r2)
            int r0 = r15.pendingOperationAcks
            int r0 = r0 + r3
            r15.pendingOperationAcks = r0
            com.google.android.exoplayer2.ExoPlayerImplInternal r0 = r15.internalPlayer
            r0.prepare()
            r6 = 1
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 5
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = -1
            r14 = 0
            r4 = r15
            r4.updatePlaybackInfo(r5, r6, r7, r8, r9, r10, r11, r13, r14)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @java.lang.Deprecated
    public void prepare(com.google.android.exoplayer2.source.MediaSource r1) {
            r0 = this;
            r0.verifyApplicationThread()
            r0.setMediaSource(r1)
            r0.prepare()
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @java.lang.Deprecated
    public void prepare(com.google.android.exoplayer2.source.MediaSource r1, boolean r2, boolean r3) {
            r0 = this;
            r0.verifyApplicationThread()
            r0.setMediaSource(r1, r2)
            r0.prepare()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void release() {
            r6 = this;
            java.lang.String r0 = "Release "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " ["
            r0.append(r1)
            java.lang.String r1 = "ExoPlayerLib/2.18.6"
            r0.append(r1)
            java.lang.String r1 = "] ["
            r0.append(r1)
            java.lang.String r2 = com.google.android.exoplayer2.util.Util.DEVICE_DEBUG_INFO
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = com.google.android.exoplayer2.ExoPlayerLibraryInfo.registeredModules()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExoPlayerImpl"
            com.google.android.exoplayer2.util.Log.i(r1, r0)
            r6.verifyApplicationThread()
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 0
            r2 = 21
            if (r0 >= r2) goto L50
            android.media.AudioTrack r0 = r6.keepSessionIdAudioTrack
            if (r0 == 0) goto L50
            r0.release()
            r6.keepSessionIdAudioTrack = r1
        L50:
            com.google.android.exoplayer2.AudioBecomingNoisyManager r0 = r6.audioBecomingNoisyManager
            r2 = 0
            r0.setEnabled(r2)
            com.google.android.exoplayer2.StreamVolumeManager r0 = r6.streamVolumeManager
            r0.release()
            com.google.android.exoplayer2.WakeLockManager r0 = r6.wakeLockManager
            r0.setStayAwake(r2)
            com.google.android.exoplayer2.WifiLockManager r0 = r6.wifiLockManager
            r0.setStayAwake(r2)
            com.google.android.exoplayer2.AudioFocusManager r0 = r6.audioFocusManager
            r0.release()
            com.google.android.exoplayer2.ExoPlayerImplInternal r0 = r6.internalPlayer
            boolean r0 = r0.release()
            if (r0 != 0) goto L7b
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r6.listeners
            r3 = 10
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r4 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$1
            r0.sendEvent(r3, r4)
        L7b:
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r6.listeners
            r0.release()
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r6.playbackInfoUpdateHandler
            r0.removeCallbacksAndMessages(r1)
            com.google.android.exoplayer2.upstream.BandwidthMeter r0 = r6.bandwidthMeter
            com.google.android.exoplayer2.analytics.AnalyticsCollector r3 = r6.analyticsCollector
            r0.removeEventListener(r3)
            com.google.android.exoplayer2.PlaybackInfo r0 = r6.playbackInfo
            r3 = 1
            com.google.android.exoplayer2.PlaybackInfo r0 = r0.copyWithPlaybackState(r3)
            r6.playbackInfo = r0
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r0.periodId
            com.google.android.exoplayer2.PlaybackInfo r0 = r0.copyWithLoadingMediaPeriodId(r4)
            r6.playbackInfo = r0
            long r4 = r0.positionUs
            r0.bufferedPositionUs = r4
            com.google.android.exoplayer2.PlaybackInfo r0 = r6.playbackInfo
            r4 = 0
            r0.totalBufferedDurationUs = r4
            com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = r6.analyticsCollector
            r0.release()
            com.google.android.exoplayer2.trackselection.TrackSelector r0 = r6.trackSelector
            r0.release()
            r6.removeSurfaceCallbacks()
            android.view.Surface r0 = r6.ownedSurface
            if (r0 == 0) goto Lbd
            r0.release()
            r6.ownedSurface = r1
        Lbd:
            boolean r0 = r6.isPriorityTaskManagerRegistered
            if (r0 == 0) goto Lce
            com.google.android.exoplayer2.util.PriorityTaskManager r0 = r6.priorityTaskManager
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.util.PriorityTaskManager r0 = (com.google.android.exoplayer2.util.PriorityTaskManager) r0
            r0.remove(r2)
            r6.isPriorityTaskManagerRegistered = r2
        Lce:
            com.google.android.exoplayer2.text.CueGroup r0 = com.google.android.exoplayer2.text.CueGroup.EMPTY_TIME_ZERO
            r6.currentCueGroup = r0
            r6.playerReleased = r3
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAnalyticsListener(com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = r1.analyticsCollector
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.analytics.AnalyticsListener r2 = (com.google.android.exoplayer2.analytics.AnalyticsListener) r2
            r0.removeListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAudioOffloadListener(com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener r2) {
            r1 = this;
            r1.verifyApplicationThread()
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.ExoPlayer$AudioOffloadListener> r0 = r1.audioOffloadListeners
            r0.remove(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeListener(com.google.android.exoplayer2.Player.Listener r2) {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r1.listeners
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            r0.remove(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeMediaItems(int r14, int r15) {
            r13 = this;
            r13.verifyApplicationThread()
            r0 = 1
            if (r14 < 0) goto La
            if (r15 < r14) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            java.util.List<com.google.android.exoplayer2.ExoPlayerImpl$MediaSourceHolderSnapshot> r1 = r13.mediaSourceHolderSnapshots
            int r1 = r1.size()
            int r15 = java.lang.Math.min(r15, r1)
            if (r14 >= r1) goto L3f
            if (r14 != r15) goto L1d
            goto L3f
        L1d:
            com.google.android.exoplayer2.PlaybackInfo r3 = r13.removeMediaItemsInternal(r14, r15)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r14 = r3.periodId
            java.lang.Object r14 = r14.periodUid
            com.google.android.exoplayer2.PlaybackInfo r15 = r13.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r15 = r15.periodId
            java.lang.Object r15 = r15.periodUid
            boolean r14 = r14.equals(r15)
            r7 = r14 ^ 1
            r4 = 0
            r5 = 1
            r6 = 0
            r8 = 4
            long r9 = r13.getCurrentPositionUsInternal(r3)
            r11 = -1
            r12 = 0
            r2 = r13
            r2.updatePlaybackInfo(r3, r4, r5, r6, r7, r8, r9, r11, r12)
        L3f:
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @java.lang.Deprecated
    public void retry() {
            r0 = this;
            r0.verifyApplicationThread()
            r0.prepare()
            return
    }

    @Override // com.google.android.exoplayer2.BasePlayer
    public void seekTo(int r13, long r14, int r16, boolean r17) {
            r12 = this;
            r11 = r12
            r0 = r13
            r12.verifyApplicationThread()
            r1 = 1
            if (r0 < 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            com.google.android.exoplayer2.analytics.AnalyticsCollector r2 = r11.analyticsCollector
            r2.notifySeekStarted()
            com.google.android.exoplayer2.PlaybackInfo r2 = r11.playbackInfo
            com.google.android.exoplayer2.Timeline r2 = r2.timeline
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L24
            int r3 = r2.getWindowCount()
            if (r0 < r3) goto L24
            return
        L24:
            int r3 = r11.pendingOperationAcks
            int r3 = r3 + r1
            r11.pendingOperationAcks = r3
            boolean r3 = r12.isPlayingAd()
            if (r3 == 0) goto L47
            java.lang.String r0 = "ExoPlayerImpl"
            java.lang.String r2 = "seekTo ignored because an ad is playing"
            com.google.android.exoplayer2.util.Log.w(r0, r2)
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r0 = new com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate
            com.google.android.exoplayer2.PlaybackInfo r2 = r11.playbackInfo
            r0.<init>(r2)
            r0.incrementPendingOperationAcks(r1)
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdateListener r1 = r11.playbackInfoUpdateListener
            r1.onPlaybackInfoUpdate(r0)
            return
        L47:
            int r3 = r12.getPlaybackState()
            if (r3 != r1) goto L4e
            goto L4f
        L4e:
            r1 = 2
        L4f:
            int r9 = r12.getCurrentMediaItemIndex()
            com.google.android.exoplayer2.PlaybackInfo r3 = r11.playbackInfo
            com.google.android.exoplayer2.PlaybackInfo r1 = r3.copyWithPlaybackState(r1)
            r3 = r14
            android.util.Pair r5 = r12.maskWindowPositionMsOrGetPeriodPositionUs(r2, r13, r14)
            com.google.android.exoplayer2.PlaybackInfo r1 = r12.maskTimelineAndPosition(r1, r2, r5)
            com.google.android.exoplayer2.ExoPlayerImplInternal r5 = r11.internalPlayer
            long r3 = com.google.android.exoplayer2.util.Util.msToUs(r14)
            r5.seekTo(r2, r13, r3)
            r2 = 0
            r3 = 1
            r4 = 1
            r5 = 1
            r6 = 1
            long r7 = r12.getCurrentPositionUsInternal(r1)
            r0 = r12
            r10 = r17
            r0.updatePlaybackInfo(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes r5, boolean r6) {
            r4 = this;
            r4.verifyApplicationThread()
            boolean r0 = r4.playerReleased
            if (r0 == 0) goto L8
            return
        L8:
            com.google.android.exoplayer2.audio.AudioAttributes r0 = r4.audioAttributes
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r5)
            if (r0 != 0) goto L2f
            r4.audioAttributes = r5
            r0 = 1
            r1 = 3
            r4.sendRendererMessage(r0, r1, r5)
            com.google.android.exoplayer2.StreamVolumeManager r0 = r4.streamVolumeManager
            int r1 = r5.usage
            int r1 = com.google.android.exoplayer2.util.Util.getStreamTypeForAudioUsage(r1)
            r0.setStreamType(r1)
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r4.listeners
            r1 = 20
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9 r2 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9
            r3 = 0
            r2.<init>(r5, r3)
            r0.queueEvent(r1, r2)
        L2f:
            com.google.android.exoplayer2.AudioFocusManager r0 = r4.audioFocusManager
            if (r6 == 0) goto L35
            r6 = r5
            goto L36
        L35:
            r6 = 0
        L36:
            r0.setAudioAttributes(r6)
            com.google.android.exoplayer2.trackselection.TrackSelector r6 = r4.trackSelector
            r6.setAudioAttributes(r5)
            boolean r5 = r4.getPlayWhenReady()
            com.google.android.exoplayer2.AudioFocusManager r6 = r4.audioFocusManager
            int r0 = r4.getPlaybackState()
            int r6 = r6.updateAudioFocus(r5, r0)
            int r0 = getPlayWhenReadyChangeReason(r5, r6)
            r4.updatePlayWhenReady(r5, r6, r0)
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r5 = r4.listeners
            r5.flushEvents()
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAudioSessionId(int r6) {
            r5 = this;
            r5.verifyApplicationThread()
            int r0 = r5.audioSessionId
            if (r0 != r6) goto L8
            return
        L8:
            r0 = 0
            r1 = 21
            if (r6 != 0) goto L1d
            int r6 = com.google.android.exoplayer2.util.Util.SDK_INT
            if (r6 >= r1) goto L16
            int r6 = r5.initializeKeepSessionIdAudioTrack(r0)
            goto L24
        L16:
            android.content.Context r6 = r5.applicationContext
            int r6 = com.google.android.exoplayer2.util.Util.generateAudioSessionIdV21(r6)
            goto L24
        L1d:
            int r2 = com.google.android.exoplayer2.util.Util.SDK_INT
            if (r2 >= r1) goto L24
            r5.initializeKeepSessionIdAudioTrack(r6)
        L24:
            r5.audioSessionId = r6
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r4 = 10
            r5.sendRendererMessage(r2, r4, r3)
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r5.sendRendererMessage(r2, r4, r3)
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r2 = r5.listeners
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda0
            r3.<init>(r6, r0)
            r2.sendEvent(r1, r3)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAuxEffectInfo(com.google.android.exoplayer2.audio.AuxEffectInfo r3) {
            r2 = this;
            r2.verifyApplicationThread()
            r0 = 1
            r1 = 6
            r2.sendRendererMessage(r0, r1, r3)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setCameraMotionListener(com.google.android.exoplayer2.video.spherical.CameraMotionListener r3) {
            r2 = this;
            r2.verifyApplicationThread()
            r2.cameraMotionListener = r3
            com.google.android.exoplayer2.ExoPlayerImpl$FrameMetadataListener r0 = r2.frameMetadataListener
            com.google.android.exoplayer2.PlayerMessage r0 = r2.createMessageInternal(r0)
            r1 = 8
            com.google.android.exoplayer2.PlayerMessage r0 = r0.setType(r1)
            com.google.android.exoplayer2.PlayerMessage r3 = r0.setPayload(r3)
            r3.send()
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void setDeviceMuted(boolean r2) {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.StreamVolumeManager r0 = r1.streamVolumeManager
            r0.setMuted(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void setDeviceVolume(int r2) {
            r1 = this;
            r1.verifyApplicationThread()
            com.google.android.exoplayer2.StreamVolumeManager r0 = r1.streamVolumeManager
            r0.setVolume(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setForegroundMode(boolean r3) {
            r2 = this;
            r2.verifyApplicationThread()
            boolean r0 = r2.foregroundMode
            if (r0 == r3) goto L21
            r2.foregroundMode = r3
            com.google.android.exoplayer2.ExoPlayerImplInternal r0 = r2.internalPlayer
            boolean r3 = r0.setForegroundMode(r3)
            if (r3 != 0) goto L21
            r3 = 0
            com.google.android.exoplayer2.ExoTimeoutException r0 = new com.google.android.exoplayer2.ExoTimeoutException
            r1 = 2
            r0.<init>(r1)
            r1 = 1003(0x3eb, float:1.406E-42)
            com.google.android.exoplayer2.ExoPlaybackException r0 = com.google.android.exoplayer2.ExoPlaybackException.createForUnexpected(r0, r1)
            r2.stopInternal(r3, r0)
        L21:
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean r2) {
            r1 = this;
            r1.verifyApplicationThread()
            boolean r0 = r1.playerReleased
            if (r0 == 0) goto L8
            return
        L8:
            com.google.android.exoplayer2.AudioBecomingNoisyManager r0 = r1.audioBecomingNoisyManager
            r0.setEnabled(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setHandleWakeLock(boolean r1) {
            r0 = this;
            r0.verifyApplicationThread()
            r0.setWakeMode(r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> r1, int r2, long r3) {
            r0 = this;
            r0.verifyApplicationThread()
            java.util.List r1 = r0.createMediaSources(r1)
            r0.setMediaSources(r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> r1, boolean r2) {
            r0 = this;
            r0.verifyApplicationThread()
            java.util.List r1 = r0.createMediaSources(r1)
            r0.setMediaSources(r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(com.google.android.exoplayer2.source.MediaSource r1) {
            r0 = this;
            r0.verifyApplicationThread()
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.setMediaSources(r1)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(com.google.android.exoplayer2.source.MediaSource r2, long r3) {
            r1 = this;
            r1.verifyApplicationThread()
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r0 = 0
            r1.setMediaSources(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(com.google.android.exoplayer2.source.MediaSource r1, boolean r2) {
            r0 = this;
            r0.verifyApplicationThread()
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.setMediaSources(r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> r2) {
            r1 = this;
            r1.verifyApplicationThread()
            r0 = 1
            r1.setMediaSources(r2, r0)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> r7, int r8, long r9) {
            r6 = this;
            r6.verifyApplicationThread()
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.setMediaSourcesInternal(r1, r2, r3, r5)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> r7, boolean r8) {
            r6 = this;
            r6.verifyApplicationThread()
            r2 = -1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r6
            r1 = r7
            r5 = r8
            r0.setMediaSourcesInternal(r1, r2, r3, r5)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean r2) {
            r1 = this;
            r1.verifyApplicationThread()
            boolean r0 = r1.pauseAtEndOfMediaItems
            if (r0 != r2) goto L8
            return
        L8:
            r1.pauseAtEndOfMediaItems = r2
            com.google.android.exoplayer2.ExoPlayerImplInternal r0 = r1.internalPlayer
            r0.setPauseAtEndOfWindow(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlayWhenReady(boolean r3) {
            r2 = this;
            r2.verifyApplicationThread()
            com.google.android.exoplayer2.AudioFocusManager r0 = r2.audioFocusManager
            int r1 = r2.getPlaybackState()
            int r0 = r0.updateAudioFocus(r3, r1)
            int r1 = getPlayWhenReadyChangeReason(r3, r0)
            r2.updatePlayWhenReady(r3, r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r13) {
            r12 = this;
            r12.verifyApplicationThread()
            if (r13 != 0) goto L7
            com.google.android.exoplayer2.PlaybackParameters r13 = com.google.android.exoplayer2.PlaybackParameters.DEFAULT
        L7:
            com.google.android.exoplayer2.PlaybackInfo r0 = r12.playbackInfo
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.playbackParameters
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L12
            return
        L12:
            com.google.android.exoplayer2.PlaybackInfo r0 = r12.playbackInfo
            com.google.android.exoplayer2.PlaybackInfo r2 = r0.copyWithPlaybackParameters(r13)
            int r0 = r12.pendingOperationAcks
            int r0 = r0 + 1
            r12.pendingOperationAcks = r0
            com.google.android.exoplayer2.ExoPlayerImplInternal r0 = r12.internalPlayer
            r0.setPlaybackParameters(r13)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 5
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = -1
            r11 = 0
            r1 = r12
            r1.updatePlaybackInfo(r2, r3, r4, r5, r6, r7, r8, r10, r11)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaylistMetadata(com.google.android.exoplayer2.MediaMetadata r4) {
            r3 = this;
            r3.verifyApplicationThread()
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            com.google.android.exoplayer2.MediaMetadata r0 = r3.playlistMetadata
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            return
        Lf:
            r3.playlistMetadata = r4
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r4 = r3.listeners
            r0 = 15
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda10 r1 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda10
            r2 = 2
            r1.<init>(r3, r2)
            r4.sendEvent(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @androidx.annotation.RequiresApi(23)
    public void setPreferredAudioDevice(@androidx.annotation.Nullable android.media.AudioDeviceInfo r3) {
            r2 = this;
            r2.verifyApplicationThread()
            r0 = 1
            r1 = 12
            r2.sendRendererMessage(r0, r1, r3)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPriorityTaskManager(@androidx.annotation.Nullable com.google.android.exoplayer2.util.PriorityTaskManager r3) {
            r2 = this;
            r2.verifyApplicationThread()
            com.google.android.exoplayer2.util.PriorityTaskManager r0 = r2.priorityTaskManager
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r3)
            if (r0 == 0) goto Lc
            return
        Lc:
            boolean r0 = r2.isPriorityTaskManagerRegistered
            r1 = 0
            if (r0 == 0) goto L1c
            com.google.android.exoplayer2.util.PriorityTaskManager r0 = r2.priorityTaskManager
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.util.PriorityTaskManager r0 = (com.google.android.exoplayer2.util.PriorityTaskManager) r0
            r0.remove(r1)
        L1c:
            if (r3 == 0) goto L2b
            boolean r0 = r2.isLoading()
            if (r0 == 0) goto L2b
            r3.add(r1)
            r0 = 1
            r2.isPriorityTaskManagerRegistered = r0
            goto L2d
        L2b:
            r2.isPriorityTaskManagerRegistered = r1
        L2d:
            r2.priorityTaskManager = r3
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setRepeatMode(int r5) {
            r4 = this;
            r4.verifyApplicationThread()
            int r0 = r4.repeatMode
            if (r0 == r5) goto L23
            r4.repeatMode = r5
            com.google.android.exoplayer2.ExoPlayerImplInternal r0 = r4.internalPlayer
            r0.setRepeatMode(r5)
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r4.listeners
            r1 = 8
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda0 r2 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda0
            r3 = 1
            r2.<init>(r5, r3)
            r0.queueEvent(r1, r2)
            r4.updateAvailableCommands()
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r5 = r4.listeners
            r5.flushEvents()
        L23:
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setSeekParameters(@androidx.annotation.Nullable com.google.android.exoplayer2.SeekParameters r2) {
            r1 = this;
            r1.verifyApplicationThread()
            if (r2 != 0) goto L7
            com.google.android.exoplayer2.SeekParameters r2 = com.google.android.exoplayer2.SeekParameters.DEFAULT
        L7:
            com.google.android.exoplayer2.SeekParameters r0 = r1.seekParameters
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L16
            r1.seekParameters = r2
            com.google.android.exoplayer2.ExoPlayerImplInternal r0 = r1.internalPlayer
            r0.setSeekParameters(r2)
        L16:
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setShuffleModeEnabled(boolean r5) {
            r4 = this;
            r4.verifyApplicationThread()
            boolean r0 = r4.shuffleModeEnabled
            if (r0 == r5) goto L23
            r4.shuffleModeEnabled = r5
            com.google.android.exoplayer2.ExoPlayerImplInternal r0 = r4.internalPlayer
            r0.setShuffleModeEnabled(r5)
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r4.listeners
            r1 = 9
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda6 r2 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda6
            r3 = 1
            r2.<init>(r5, r3)
            r0.queueEvent(r1, r2)
            r4.updateAvailableCommands()
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r5 = r4.listeners
            r5.flushEvents()
        L23:
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setShuffleOrder(com.google.android.exoplayer2.source.ShuffleOrder r15) {
            r14 = this;
            r14.verifyApplicationThread()
            r14.shuffleOrder = r15
            com.google.android.exoplayer2.Timeline r0 = r14.createMaskingTimeline()
            com.google.android.exoplayer2.PlaybackInfo r1 = r14.playbackInfo
            int r2 = r14.getCurrentMediaItemIndex()
            long r3 = r14.getCurrentPosition()
            android.util.Pair r2 = r14.maskWindowPositionMsOrGetPeriodPositionUs(r0, r2, r3)
            com.google.android.exoplayer2.PlaybackInfo r4 = r14.maskTimelineAndPosition(r1, r0, r2)
            int r0 = r14.pendingOperationAcks
            int r0 = r0 + 1
            r14.pendingOperationAcks = r0
            com.google.android.exoplayer2.ExoPlayerImplInternal r0 = r14.internalPlayer
            r0.setShuffleOrder(r15)
            r5 = 0
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 5
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = -1
            r13 = 0
            r3 = r14
            r3.updatePlaybackInfo(r4, r5, r6, r7, r8, r9, r10, r12, r13)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setSkipSilenceEnabled(boolean r5) {
            r4 = this;
            r4.verifyApplicationThread()
            boolean r0 = r4.skipSilenceEnabled
            if (r0 != r5) goto L8
            return
        L8:
            r4.skipSilenceEnabled = r5
            r0 = 1
            r1 = 9
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            r4.sendRendererMessage(r0, r1, r2)
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r4.listeners
            r1 = 23
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda6 r2 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda6
            r3 = 0
            r2.<init>(r5, r3)
            r0.sendEvent(r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setTrackSelectionParameters(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r5) {
            r4 = this;
            r4.verifyApplicationThread()
            com.google.android.exoplayer2.trackselection.TrackSelector r0 = r4.trackSelector
            boolean r0 = r0.isSetParametersSupported()
            if (r0 == 0) goto L2a
            com.google.android.exoplayer2.trackselection.TrackSelector r0 = r4.trackSelector
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0 = r0.getParameters()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L18
            goto L2a
        L18:
            com.google.android.exoplayer2.trackselection.TrackSelector r0 = r4.trackSelector
            r0.setParameters(r5)
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r4.listeners
            r1 = 19
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9 r2 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9
            r3 = 1
            r2.<init>(r5, r3)
            r0.sendEvent(r1, r2)
        L2a:
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoChangeFrameRateStrategy(int r3) {
            r2 = this;
            r2.verifyApplicationThread()
            int r0 = r2.videoChangeFrameRateStrategy
            if (r0 != r3) goto L8
            return
        L8:
            r2.videoChangeFrameRateStrategy = r3
            r0 = 2
            r1 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.sendRendererMessage(r0, r1, r3)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoFrameMetadataListener(com.google.android.exoplayer2.video.VideoFrameMetadataListener r3) {
            r2 = this;
            r2.verifyApplicationThread()
            r2.videoFrameMetadataListener = r3
            com.google.android.exoplayer2.ExoPlayerImpl$FrameMetadataListener r0 = r2.frameMetadataListener
            com.google.android.exoplayer2.PlayerMessage r0 = r2.createMessageInternal(r0)
            r1 = 7
            com.google.android.exoplayer2.PlayerMessage r0 = r0.setType(r1)
            com.google.android.exoplayer2.PlayerMessage r3 = r0.setPayload(r3)
            r3.send()
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoScalingMode(int r3) {
            r2 = this;
            r2.verifyApplicationThread()
            r2.videoScalingMode = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0 = 2
            r1 = 4
            r2.sendRendererMessage(r0, r1, r3)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurface(@androidx.annotation.Nullable android.view.Surface r1) {
            r0 = this;
            r0.verifyApplicationThread()
            r0.removeSurfaceCallbacks()
            r0.setVideoOutputInternal(r1)
            if (r1 != 0) goto Ld
            r1 = 0
            goto Le
        Ld:
            r1 = -1
        Le:
            r0.maybeNotifySurfaceSizeChanged(r1, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurfaceHolder(@androidx.annotation.Nullable android.view.SurfaceHolder r3) {
            r2 = this;
            r2.verifyApplicationThread()
            if (r3 != 0) goto L9
            r2.clearVideoSurface()
            goto L3d
        L9:
            r2.removeSurfaceCallbacks()
            r0 = 1
            r2.surfaceHolderSurfaceIsVideoOutput = r0
            r2.surfaceHolder = r3
            com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener r0 = r2.componentListener
            r3.addCallback(r0)
            android.view.Surface r0 = r3.getSurface()
            if (r0 == 0) goto L35
            boolean r1 = r0.isValid()
            if (r1 == 0) goto L35
            r2.setVideoOutputInternal(r0)
            android.graphics.Rect r3 = r3.getSurfaceFrame()
            int r0 = r3.width()
            int r3 = r3.height()
            r2.maybeNotifySurfaceSizeChanged(r0, r3)
            goto L3d
        L35:
            r3 = 0
            r2.setVideoOutputInternal(r3)
            r3 = 0
            r2.maybeNotifySurfaceSizeChanged(r3, r3)
        L3d:
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurfaceView(@androidx.annotation.Nullable android.view.SurfaceView r3) {
            r2 = this;
            r2.verifyApplicationThread()
            boolean r0 = r3 instanceof com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer
            if (r0 == 0) goto L15
            r2.removeSurfaceCallbacks()
            r2.setVideoOutputInternal(r3)
            android.view.SurfaceHolder r3 = r3.getHolder()
            r2.setNonVideoOutputSurfaceHolderInternal(r3)
            goto L59
        L15:
            boolean r0 = r3 instanceof com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView
            if (r0 == 0) goto L4e
            r2.removeSurfaceCallbacks()
            r0 = r3
            com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView r0 = (com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView) r0
            r2.sphericalGLSurfaceView = r0
            com.google.android.exoplayer2.ExoPlayerImpl$FrameMetadataListener r0 = r2.frameMetadataListener
            com.google.android.exoplayer2.PlayerMessage r0 = r2.createMessageInternal(r0)
            r1 = 10000(0x2710, float:1.4013E-41)
            com.google.android.exoplayer2.PlayerMessage r0 = r0.setType(r1)
            com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView r1 = r2.sphericalGLSurfaceView
            com.google.android.exoplayer2.PlayerMessage r0 = r0.setPayload(r1)
            r0.send()
            com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView r0 = r2.sphericalGLSurfaceView
            com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener r1 = r2.componentListener
            r0.addVideoSurfaceListener(r1)
            com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView r0 = r2.sphericalGLSurfaceView
            android.view.Surface r0 = r0.getVideoSurface()
            r2.setVideoOutputInternal(r0)
            android.view.SurfaceHolder r3 = r3.getHolder()
            r2.setNonVideoOutputSurfaceHolderInternal(r3)
            goto L59
        L4e:
            if (r3 != 0) goto L52
            r3 = 0
            goto L56
        L52:
            android.view.SurfaceHolder r3 = r3.getHolder()
        L56:
            r2.setVideoSurfaceHolder(r3)
        L59:
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoTextureView(@androidx.annotation.Nullable android.view.TextureView r3) {
            r2 = this;
            r2.verifyApplicationThread()
            if (r3 != 0) goto L9
            r2.clearVideoSurface()
            goto L45
        L9:
            r2.removeSurfaceCallbacks()
            r2.textureView = r3
            android.view.TextureView$SurfaceTextureListener r0 = r3.getSurfaceTextureListener()
            if (r0 == 0) goto L1b
            java.lang.String r0 = "ExoPlayerImpl"
            java.lang.String r1 = "Replacing existing SurfaceTextureListener."
            com.google.android.exoplayer2.util.Log.w(r0, r1)
        L1b:
            com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener r0 = r2.componentListener
            r3.setSurfaceTextureListener(r0)
            boolean r0 = r3.isAvailable()
            r1 = 0
            if (r0 == 0) goto L2c
            android.graphics.SurfaceTexture r0 = r3.getSurfaceTexture()
            goto L2d
        L2c:
            r0 = r1
        L2d:
            if (r0 != 0) goto L37
            r2.setVideoOutputInternal(r1)
            r3 = 0
            r2.maybeNotifySurfaceSizeChanged(r3, r3)
            goto L45
        L37:
            r2.setSurfaceTextureInternal(r0)
            int r0 = r3.getWidth()
            int r3 = r3.getHeight()
            r2.maybeNotifySurfaceSizeChanged(r0, r3)
        L45:
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setVolume(float r4) {
            r3 = this;
            r3.verifyApplicationThread()
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r4 = com.google.android.exoplayer2.util.Util.constrainValue(r4, r0, r1)
            float r0 = r3.volume
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L11
            return
        L11:
            r3.volume = r4
            r3.sendVolumeToRenderers()
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r3.listeners
            r1 = 22
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda7 r2 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda7
            r2.<init>(r4)
            r0.sendEvent(r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setWakeMode(int r3) {
            r2 = this;
            r2.verifyApplicationThread()
            r0 = 0
            if (r3 == 0) goto L23
            r1 = 1
            if (r3 == r1) goto L18
            r0 = 2
            if (r3 == r0) goto Ld
            goto L2d
        Ld:
            com.google.android.exoplayer2.WakeLockManager r3 = r2.wakeLockManager
            r3.setEnabled(r1)
            com.google.android.exoplayer2.WifiLockManager r3 = r2.wifiLockManager
            r3.setEnabled(r1)
            goto L2d
        L18:
            com.google.android.exoplayer2.WakeLockManager r3 = r2.wakeLockManager
            r3.setEnabled(r1)
            com.google.android.exoplayer2.WifiLockManager r3 = r2.wifiLockManager
            r3.setEnabled(r0)
            goto L2d
        L23:
            com.google.android.exoplayer2.WakeLockManager r3 = r2.wakeLockManager
            r3.setEnabled(r0)
            com.google.android.exoplayer2.WifiLockManager r3 = r2.wifiLockManager
            r3.setEnabled(r0)
        L2d:
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop() {
            r1 = this;
            r1.verifyApplicationThread()
            r0 = 0
            r1.stop(r0)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop(boolean r4) {
            r3 = this;
            r3.verifyApplicationThread()
            com.google.android.exoplayer2.AudioFocusManager r0 = r3.audioFocusManager
            boolean r1 = r3.getPlayWhenReady()
            r2 = 1
            r0.updateAudioFocus(r1, r2)
            r0 = 0
            r3.stopInternal(r4, r0)
            com.google.android.exoplayer2.text.CueGroup r4 = new com.google.android.exoplayer2.text.CueGroup
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            com.google.android.exoplayer2.PlaybackInfo r1 = r3.playbackInfo
            long r1 = r1.positionUs
            r4.<init>(r0, r1)
            r3.currentCueGroup = r4
            return
    }
}
