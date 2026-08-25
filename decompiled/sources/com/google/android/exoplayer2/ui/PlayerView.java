package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class PlayerView extends android.widget.FrameLayout implements com.google.android.exoplayer2.ui.AdViewProvider {
    public static final int SHOW_BUFFERING_ALWAYS = 2;
    public static final int SHOW_BUFFERING_NEVER = 0;
    public static final int SHOW_BUFFERING_WHEN_PLAYING = 1;
    private static final int SURFACE_TYPE_NONE = 0;
    private static final int SURFACE_TYPE_SPHERICAL_GL_SURFACE_VIEW = 3;
    private static final int SURFACE_TYPE_SURFACE_VIEW = 1;
    private static final int SURFACE_TYPE_TEXTURE_VIEW = 2;
    private static final int SURFACE_TYPE_VIDEO_DECODER_GL_SURFACE_VIEW = 4;

    @androidx.annotation.Nullable
    private final android.widget.FrameLayout adOverlayFrameLayout;

    @androidx.annotation.Nullable
    private final android.widget.ImageView artworkView;

    @androidx.annotation.Nullable
    private final android.view.View bufferingView;
    private final com.google.android.exoplayer2.ui.PlayerView.ComponentListener componentListener;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.ui.AspectRatioFrameLayout contentFrame;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.ui.PlayerControlView controller;
    private boolean controllerAutoShow;
    private boolean controllerHideDuringAds;
    private boolean controllerHideOnTouch;
    private int controllerShowTimeoutMs;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener controllerVisibilityListener;

    @androidx.annotation.Nullable
    private java.lang.CharSequence customErrorMessage;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable defaultArtwork;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.util.ErrorMessageProvider<? super com.google.android.exoplayer2.PlaybackException> errorMessageProvider;

    @androidx.annotation.Nullable
    private final android.widget.TextView errorMessageView;
    private boolean isTouching;
    private boolean keepContentOnPlayerReset;

    @androidx.annotation.Nullable
    private final android.widget.FrameLayout overlayFrameLayout;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Player player;
    private int showBuffering;

    @androidx.annotation.Nullable
    private final android.view.View shutterView;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.ui.SubtitleView subtitleView;

    @androidx.annotation.Nullable
    private final android.view.View surfaceView;
    private final boolean surfaceViewIgnoresVideoAspectRatio;
    private int textureViewRotation;
    private boolean useArtwork;
    private boolean useController;

    public final class ComponentListener implements com.google.android.exoplayer2.Player.Listener, android.view.View.OnLayoutChangeListener, android.view.View.OnClickListener, com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener {

        @androidx.annotation.Nullable
        private java.lang.Object lastPeriodUidWithTracks;
        private final com.google.android.exoplayer2.Timeline.Period period;
        public final /* synthetic */ com.google.android.exoplayer2.ui.PlayerView this$0;

        public ComponentListener(com.google.android.exoplayer2.ui.PlayerView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.google.android.exoplayer2.Timeline$Period r1 = new com.google.android.exoplayer2.Timeline$Period
                r1.<init>()
                r0.period = r1
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onAudioAttributesChanged(com.google.android.exoplayer2.audio.AudioAttributes r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onAudioAttributesChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onAudioSessionIdChanged(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onAudioSessionIdChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onAvailableCommandsChanged(com.google.android.exoplayer2.Player.Commands r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onAvailableCommandsChanged(r0, r1)
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.google.android.exoplayer2.ui.PlayerView r1 = r0.this$0
                com.google.android.exoplayer2.ui.PlayerView.access$1200(r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onCues(com.google.android.exoplayer2.text.CueGroup r2) {
                r1 = this;
                com.google.android.exoplayer2.ui.PlayerView r0 = r1.this$0
                com.google.android.exoplayer2.ui.SubtitleView r0 = com.google.android.exoplayer2.ui.PlayerView.access$000(r0)
                if (r0 == 0) goto L13
                com.google.android.exoplayer2.ui.PlayerView r0 = r1.this$0
                com.google.android.exoplayer2.ui.SubtitleView r0 = com.google.android.exoplayer2.ui.PlayerView.access$000(r0)
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> r2 = r2.cues
                r0.setCues(r2)
            L13:
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onCues(java.util.List r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onCues(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onDeviceInfoChanged(com.google.android.exoplayer2.DeviceInfo r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onDeviceInfoChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onDeviceVolumeChanged(int r1, boolean r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onDeviceVolumeChanged(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onEvents(com.google.android.exoplayer2.Player r1, com.google.android.exoplayer2.Player.Events r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onEvents(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onIsLoadingChanged(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onIsLoadingChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onIsPlayingChanged(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onIsPlayingChanged(r0, r1)
                return
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
                r0 = this;
                android.view.TextureView r1 = (android.view.TextureView) r1
                com.google.android.exoplayer2.ui.PlayerView r2 = r0.this$0
                int r2 = com.google.android.exoplayer2.ui.PlayerView.access$1000(r2)
                com.google.android.exoplayer2.ui.PlayerView.access$1100(r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onLoadingChanged(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onLoadingChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(long r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onMaxSeekToPreviousPositionChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onMediaItemTransition(com.google.android.exoplayer2.MediaItem r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onMediaItemTransition(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onMediaMetadataChanged(com.google.android.exoplayer2.MediaMetadata r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onMediaMetadataChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onMetadata(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayWhenReadyChanged(boolean r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.ui.PlayerView r1 = r0.this$0
                com.google.android.exoplayer2.ui.PlayerView.access$500(r1)
                com.google.android.exoplayer2.ui.PlayerView r1 = r0.this$0
                com.google.android.exoplayer2.ui.PlayerView.access$700(r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlaybackParametersChanged(com.google.android.exoplayer2.PlaybackParameters r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackParametersChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int r1) {
                r0 = this;
                com.google.android.exoplayer2.ui.PlayerView r1 = r0.this$0
                com.google.android.exoplayer2.ui.PlayerView.access$500(r1)
                com.google.android.exoplayer2.ui.PlayerView r1 = r0.this$0
                com.google.android.exoplayer2.ui.PlayerView.access$600(r1)
                com.google.android.exoplayer2.ui.PlayerView r1 = r0.this$0
                com.google.android.exoplayer2.ui.PlayerView.access$700(r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlayerError(com.google.android.exoplayer2.PlaybackException r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerError(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlayerErrorChanged(com.google.android.exoplayer2.PlaybackException r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerErrorChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlayerStateChanged(boolean r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerStateChanged(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlaylistMetadataChanged(com.google.android.exoplayer2.MediaMetadata r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaylistMetadataChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPositionDiscontinuity(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPositionDiscontinuity(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPositionDiscontinuity(com.google.android.exoplayer2.Player.PositionInfo r1, com.google.android.exoplayer2.Player.PositionInfo r2, int r3) {
                r0 = this;
                com.google.android.exoplayer2.ui.PlayerView r1 = r0.this$0
                boolean r1 = com.google.android.exoplayer2.ui.PlayerView.access$800(r1)
                if (r1 == 0) goto L15
                com.google.android.exoplayer2.ui.PlayerView r1 = r0.this$0
                boolean r1 = com.google.android.exoplayer2.ui.PlayerView.access$900(r1)
                if (r1 == 0) goto L15
                com.google.android.exoplayer2.ui.PlayerView r1 = r0.this$0
                r1.hideController()
            L15:
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onRenderedFirstFrame() {
                r2 = this;
                com.google.android.exoplayer2.ui.PlayerView r0 = r2.this$0
                android.view.View r0 = com.google.android.exoplayer2.ui.PlayerView.access$200(r0)
                if (r0 == 0) goto L12
                com.google.android.exoplayer2.ui.PlayerView r0 = r2.this$0
                android.view.View r0 = com.google.android.exoplayer2.ui.PlayerView.access$200(r0)
                r1 = 4
                r0.setVisibility(r1)
            L12:
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onRepeatModeChanged(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onRepeatModeChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onSeekBackIncrementChanged(long r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekBackIncrementChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onSeekForwardIncrementChanged(long r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekForwardIncrementChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onSeekProcessed() {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekProcessed(r0)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onShuffleModeEnabledChanged(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onShuffleModeEnabledChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onSkipSilenceEnabledChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onSurfaceSizeChanged(int r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onSurfaceSizeChanged(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onTimelineChanged(com.google.android.exoplayer2.Timeline r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onTimelineChanged(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onTrackSelectionParametersChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onTracksChanged(com.google.android.exoplayer2.Tracks r5) {
                r4 = this;
                com.google.android.exoplayer2.ui.PlayerView r5 = r4.this$0
                com.google.android.exoplayer2.Player r5 = com.google.android.exoplayer2.ui.PlayerView.access$300(r5)
                java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
                com.google.android.exoplayer2.Player r5 = (com.google.android.exoplayer2.Player) r5
                com.google.android.exoplayer2.Timeline r0 = r5.getCurrentTimeline()
                boolean r1 = r0.isEmpty()
                r2 = 0
                if (r1 == 0) goto L1a
                r4.lastPeriodUidWithTracks = r2
                goto L50
            L1a:
                com.google.android.exoplayer2.Tracks r1 = r5.getCurrentTracks()
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L34
                int r5 = r5.getCurrentPeriodIndex()
                com.google.android.exoplayer2.Timeline$Period r1 = r4.period
                r2 = 1
                com.google.android.exoplayer2.Timeline$Period r5 = r0.getPeriod(r5, r1, r2)
                java.lang.Object r5 = r5.uid
                r4.lastPeriodUidWithTracks = r5
                goto L50
            L34:
                java.lang.Object r1 = r4.lastPeriodUidWithTracks
                if (r1 == 0) goto L50
                int r1 = r0.getIndexOfPeriod(r1)
                r3 = -1
                if (r1 == r3) goto L4e
                com.google.android.exoplayer2.Timeline$Period r3 = r4.period
                com.google.android.exoplayer2.Timeline$Period r0 = r0.getPeriod(r1, r3)
                int r0 = r0.windowIndex
                int r5 = r5.getCurrentMediaItemIndex()
                if (r5 != r0) goto L4e
                return
            L4e:
                r4.lastPeriodUidWithTracks = r2
            L50:
                com.google.android.exoplayer2.ui.PlayerView r5 = r4.this$0
                com.google.android.exoplayer2.ui.PlayerView.access$400(r5)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onVideoSizeChanged(com.google.android.exoplayer2.video.VideoSize r1) {
                r0 = this;
                com.google.android.exoplayer2.ui.PlayerView r1 = r0.this$0
                com.google.android.exoplayer2.ui.PlayerView.access$100(r1)
                return
        }

        @Override // com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener
        public void onVisibilityChange(int r1) {
                r0 = this;
                com.google.android.exoplayer2.ui.PlayerView r1 = r0.this$0
                com.google.android.exoplayer2.ui.PlayerView.access$1300(r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onVolumeChanged(float r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onVolumeChanged(r0, r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ShowBuffering {
    }

    public PlayerView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public PlayerView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public PlayerView(android.content.Context r21, @androidx.annotation.Nullable android.util.AttributeSet r22, int r23) {
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            r20.<init>(r21, r22, r23)
            com.google.android.exoplayer2.ui.PlayerView$ComponentListener r3 = new com.google.android.exoplayer2.ui.PlayerView$ComponentListener
            r3.<init>(r1)
            r1.componentListener = r3
            boolean r4 = r20.isInEditMode()
            r5 = 0
            r6 = 0
            if (r4 == 0) goto L4c
            r1.contentFrame = r5
            r1.shutterView = r5
            r1.surfaceView = r5
            r1.surfaceViewIgnoresVideoAspectRatio = r6
            r1.artworkView = r5
            r1.subtitleView = r5
            r1.bufferingView = r5
            r1.errorMessageView = r5
            r1.controller = r5
            r1.adOverlayFrameLayout = r5
            r1.overlayFrameLayout = r5
            android.widget.ImageView r2 = new android.widget.ImageView
            r2.<init>(r0)
            int r3 = com.google.android.exoplayer2.util.Util.SDK_INT
            r4 = 23
            if (r3 < r4) goto L41
            android.content.res.Resources r3 = r20.getResources()
            configureEditModeLogoV23(r0, r3, r2)
            goto L48
        L41:
            android.content.res.Resources r3 = r20.getResources()
            configureEditModeLogo(r0, r3, r2)
        L48:
            r1.addView(r2)
            return
        L4c:
            int r4 = com.google.android.exoplayer2.ui.R.layout.exo_player_view
            r7 = 5000(0x1388, float:7.006E-42)
            r8 = 1
            if (r2 == 0) goto Lda
            android.content.res.Resources$Theme r9 = r21.getTheme()
            int[] r10 = com.google.android.exoplayer2.ui.R.styleable.PlayerView
            r11 = r23
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r2, r10, r11, r6)
            int r10 = com.google.android.exoplayer2.ui.R.styleable.PlayerView_shutter_background_color     // Catch: java.lang.Throwable -> Ld5
            boolean r11 = r9.hasValue(r10)     // Catch: java.lang.Throwable -> Ld5
            int r10 = r9.getColor(r10, r6)     // Catch: java.lang.Throwable -> Ld5
            int r12 = com.google.android.exoplayer2.ui.R.styleable.PlayerView_player_layout_id     // Catch: java.lang.Throwable -> Ld5
            int r4 = r9.getResourceId(r12, r4)     // Catch: java.lang.Throwable -> Ld5
            int r12 = com.google.android.exoplayer2.ui.R.styleable.PlayerView_use_artwork     // Catch: java.lang.Throwable -> Ld5
            boolean r12 = r9.getBoolean(r12, r8)     // Catch: java.lang.Throwable -> Ld5
            int r13 = com.google.android.exoplayer2.ui.R.styleable.PlayerView_default_artwork     // Catch: java.lang.Throwable -> Ld5
            int r13 = r9.getResourceId(r13, r6)     // Catch: java.lang.Throwable -> Ld5
            int r14 = com.google.android.exoplayer2.ui.R.styleable.PlayerView_use_controller     // Catch: java.lang.Throwable -> Ld5
            boolean r14 = r9.getBoolean(r14, r8)     // Catch: java.lang.Throwable -> Ld5
            int r15 = com.google.android.exoplayer2.ui.R.styleable.PlayerView_surface_type     // Catch: java.lang.Throwable -> Ld5
            int r15 = r9.getInt(r15, r8)     // Catch: java.lang.Throwable -> Ld5
            int r5 = com.google.android.exoplayer2.ui.R.styleable.PlayerView_resize_mode     // Catch: java.lang.Throwable -> Ld5
            int r5 = r9.getInt(r5, r6)     // Catch: java.lang.Throwable -> Ld5
            int r6 = com.google.android.exoplayer2.ui.R.styleable.PlayerView_show_timeout     // Catch: java.lang.Throwable -> Ld5
            int r7 = r9.getInt(r6, r7)     // Catch: java.lang.Throwable -> Ld5
            int r6 = com.google.android.exoplayer2.ui.R.styleable.PlayerView_hide_on_touch     // Catch: java.lang.Throwable -> Ld5
            boolean r6 = r9.getBoolean(r6, r8)     // Catch: java.lang.Throwable -> Ld5
            r23 = r4
            int r4 = com.google.android.exoplayer2.ui.R.styleable.PlayerView_auto_show     // Catch: java.lang.Throwable -> Ld5
            boolean r4 = r9.getBoolean(r4, r8)     // Catch: java.lang.Throwable -> Ld5
            int r8 = com.google.android.exoplayer2.ui.R.styleable.PlayerView_show_buffering     // Catch: java.lang.Throwable -> Ld5
            r17 = r4
            r4 = 0
            int r8 = r9.getInteger(r8, r4)     // Catch: java.lang.Throwable -> Ld5
            int r4 = com.google.android.exoplayer2.ui.R.styleable.PlayerView_keep_content_on_player_reset     // Catch: java.lang.Throwable -> Ld5
            r18 = r5
            boolean r5 = r1.keepContentOnPlayerReset     // Catch: java.lang.Throwable -> Ld5
            boolean r4 = r9.getBoolean(r4, r5)     // Catch: java.lang.Throwable -> Ld5
            r1.keepContentOnPlayerReset = r4     // Catch: java.lang.Throwable -> Ld5
            int r4 = com.google.android.exoplayer2.ui.R.styleable.PlayerView_hide_during_ads     // Catch: java.lang.Throwable -> Ld5
            r5 = 1
            boolean r4 = r9.getBoolean(r4, r5)     // Catch: java.lang.Throwable -> Ld5
            r9.recycle()
            r9 = r6
            r5 = r17
            r6 = r18
            r17 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r15
            r19 = r4
            r4 = r23
            r23 = r7
            r7 = r19
            goto Le8
        Ld5:
            r0 = move-exception
            r9.recycle()
            throw r0
        Lda:
            r23 = 5000(0x1388, float:7.006E-42)
            r5 = 1
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 1
            r10 = 1
            r11 = 0
            r12 = 0
            r13 = 1
            r14 = 0
            r17 = 1
        Le8:
            android.view.LayoutInflater r15 = android.view.LayoutInflater.from(r21)
            r15.inflate(r4, r1)
            r4 = 262144(0x40000, float:3.67342E-40)
            r1.setDescendantFocusability(r4)
            int r4 = com.google.android.exoplayer2.ui.R.id.exo_content_frame
            android.view.View r4 = r1.findViewById(r4)
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r4 = (com.google.android.exoplayer2.ui.AspectRatioFrameLayout) r4
            r1.contentFrame = r4
            if (r4 == 0) goto L103
            setResizeModeRaw(r4, r6)
        L103:
            int r6 = com.google.android.exoplayer2.ui.R.id.exo_shutter
            android.view.View r6 = r1.findViewById(r6)
            r1.shutterView = r6
            if (r6 == 0) goto L112
            if (r12 == 0) goto L112
            r6.setBackgroundColor(r11)
        L112:
            if (r4 == 0) goto L1a1
            if (r10 == 0) goto L1a1
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r11 = -1
            r6.<init>(r11, r11)
            r11 = 2
            if (r10 == r11) goto L182
            r11 = 3
            if (r10 == r11) goto L157
            r11 = 4
            if (r10 == r11) goto L12d
            android.view.SurfaceView r10 = new android.view.SurfaceView
            r10.<init>(r0)
            r1.surfaceView = r10
            goto L189
        L12d:
            java.lang.String r10 = "com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView"
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Exception -> L14d
            r11 = 1
            java.lang.Class[] r12 = new java.lang.Class[r11]     // Catch: java.lang.Exception -> L14d
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            r16 = 0
            r12[r16] = r15     // Catch: java.lang.Exception -> L14d
            java.lang.reflect.Constructor r10 = r10.getConstructor(r12)     // Catch: java.lang.Exception -> L14d
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch: java.lang.Exception -> L14d
            r12[r16] = r0     // Catch: java.lang.Exception -> L14d
            java.lang.Object r10 = r10.newInstance(r12)     // Catch: java.lang.Exception -> L14d
            android.view.View r10 = (android.view.View) r10     // Catch: java.lang.Exception -> L14d
            r1.surfaceView = r10     // Catch: java.lang.Exception -> L14d
            goto L189
        L14d:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "video_decoder_gl_surface_view requires an ExoPlayer dependency"
            r2.<init>(r3, r0)
            throw r2
        L157:
            java.lang.String r10 = "com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView"
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Exception -> L178
            r11 = 1
            java.lang.Class[] r12 = new java.lang.Class[r11]     // Catch: java.lang.Exception -> L178
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            r16 = 0
            r12[r16] = r15     // Catch: java.lang.Exception -> L178
            java.lang.reflect.Constructor r10 = r10.getConstructor(r12)     // Catch: java.lang.Exception -> L178
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch: java.lang.Exception -> L178
            r12[r16] = r0     // Catch: java.lang.Exception -> L178
            java.lang.Object r10 = r10.newInstance(r12)     // Catch: java.lang.Exception -> L178
            android.view.View r10 = (android.view.View) r10     // Catch: java.lang.Exception -> L178
            r1.surfaceView = r10     // Catch: java.lang.Exception -> L178
            r10 = 1
            goto L18a
        L178:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "spherical_gl_surface_view requires an ExoPlayer dependency"
            r2.<init>(r3, r0)
            throw r2
        L182:
            android.view.TextureView r10 = new android.view.TextureView
            r10.<init>(r0)
            r1.surfaceView = r10
        L189:
            r10 = 0
        L18a:
            android.view.View r11 = r1.surfaceView
            r11.setLayoutParams(r6)
            android.view.View r6 = r1.surfaceView
            r6.setOnClickListener(r3)
            android.view.View r6 = r1.surfaceView
            r11 = 0
            r6.setClickable(r11)
            android.view.View r6 = r1.surfaceView
            r4.addView(r6, r11)
            r4 = r10
            goto L1a5
        L1a1:
            r4 = 0
            r1.surfaceView = r4
            r4 = 0
        L1a5:
            r1.surfaceViewIgnoresVideoAspectRatio = r4
            int r4 = com.google.android.exoplayer2.ui.R.id.exo_ad_overlay
            android.view.View r4 = r1.findViewById(r4)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r1.adOverlayFrameLayout = r4
            int r4 = com.google.android.exoplayer2.ui.R.id.exo_overlay
            android.view.View r4 = r1.findViewById(r4)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r1.overlayFrameLayout = r4
            int r4 = com.google.android.exoplayer2.ui.R.id.exo_artwork
            android.view.View r4 = r1.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1.artworkView = r4
            if (r13 == 0) goto L1cb
            if (r4 == 0) goto L1cb
            r4 = 1
            goto L1cc
        L1cb:
            r4 = 0
        L1cc:
            r1.useArtwork = r4
            if (r14 == 0) goto L1da
            android.content.Context r4 = r20.getContext()
            android.graphics.drawable.Drawable r4 = androidx.core.content.ContextCompat.getDrawable(r4, r14)
            r1.defaultArtwork = r4
        L1da:
            int r4 = com.google.android.exoplayer2.ui.R.id.exo_subtitles
            android.view.View r4 = r1.findViewById(r4)
            com.google.android.exoplayer2.ui.SubtitleView r4 = (com.google.android.exoplayer2.ui.SubtitleView) r4
            r1.subtitleView = r4
            if (r4 == 0) goto L1ec
            r4.setUserDefaultStyle()
            r4.setUserDefaultTextSize()
        L1ec:
            int r4 = com.google.android.exoplayer2.ui.R.id.exo_buffering
            android.view.View r4 = r1.findViewById(r4)
            r1.bufferingView = r4
            r6 = 8
            if (r4 == 0) goto L1fb
            r4.setVisibility(r6)
        L1fb:
            r1.showBuffering = r8
            int r4 = com.google.android.exoplayer2.ui.R.id.exo_error_message
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1.errorMessageView = r4
            if (r4 == 0) goto L20c
            r4.setVisibility(r6)
        L20c:
            int r4 = com.google.android.exoplayer2.ui.R.id.exo_controller
            android.view.View r6 = r1.findViewById(r4)
            com.google.android.exoplayer2.ui.PlayerControlView r6 = (com.google.android.exoplayer2.ui.PlayerControlView) r6
            int r8 = com.google.android.exoplayer2.ui.R.id.exo_controller_placeholder
            android.view.View r8 = r1.findViewById(r8)
            if (r6 == 0) goto L220
            r1.controller = r6
            r10 = 0
            goto L24a
        L220:
            if (r8 == 0) goto L246
            com.google.android.exoplayer2.ui.PlayerControlView r6 = new com.google.android.exoplayer2.ui.PlayerControlView
            r10 = 0
            r11 = 0
            r6.<init>(r0, r11, r10, r2)
            r1.controller = r6
            r6.setId(r4)
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r6.setLayoutParams(r0)
            android.view.ViewParent r0 = r8.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.indexOfChild(r8)
            r0.removeView(r8)
            r0.addView(r6, r2)
            goto L24a
        L246:
            r10 = 0
            r11 = 0
            r1.controller = r11
        L24a:
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            if (r0 == 0) goto L251
            r4 = r23
            goto L252
        L251:
            r4 = 0
        L252:
            r1.controllerShowTimeoutMs = r4
            r1.controllerHideOnTouch = r9
            r1.controllerAutoShow = r5
            r1.controllerHideDuringAds = r7
            if (r17 == 0) goto L260
            if (r0 == 0) goto L260
            r6 = 1
            goto L261
        L260:
            r6 = 0
        L261:
            r1.useController = r6
            if (r0 == 0) goto L26d
            r0.hide()
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            r0.addVisibilityListener(r3)
        L26d:
            if (r17 == 0) goto L273
            r0 = 1
            r1.setClickable(r0)
        L273:
            r20.updateContentDescription()
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.ui.SubtitleView access$000(com.google.android.exoplayer2.ui.PlayerView r0) {
            com.google.android.exoplayer2.ui.SubtitleView r0 = r0.subtitleView
            return r0
    }

    public static /* synthetic */ void access$100(com.google.android.exoplayer2.ui.PlayerView r0) {
            r0.updateAspectRatio()
            return
    }

    public static /* synthetic */ int access$1000(com.google.android.exoplayer2.ui.PlayerView r0) {
            int r0 = r0.textureViewRotation
            return r0
    }

    public static /* synthetic */ void access$1100(android.view.TextureView r0, int r1) {
            applyTextureViewRotation(r0, r1)
            return
    }

    public static /* synthetic */ void access$1200(com.google.android.exoplayer2.ui.PlayerView r0) {
            r0.toggleControllerVisibility()
            return
    }

    public static /* synthetic */ void access$1300(com.google.android.exoplayer2.ui.PlayerView r0) {
            r0.updateContentDescription()
            return
    }

    public static /* synthetic */ android.view.View access$200(com.google.android.exoplayer2.ui.PlayerView r0) {
            android.view.View r0 = r0.shutterView
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.Player access$300(com.google.android.exoplayer2.ui.PlayerView r0) {
            com.google.android.exoplayer2.Player r0 = r0.player
            return r0
    }

    public static /* synthetic */ void access$400(com.google.android.exoplayer2.ui.PlayerView r1) {
            r0 = 0
            r1.updateForCurrentTrackSelections(r0)
            return
    }

    public static /* synthetic */ void access$500(com.google.android.exoplayer2.ui.PlayerView r0) {
            r0.updateBuffering()
            return
    }

    public static /* synthetic */ void access$600(com.google.android.exoplayer2.ui.PlayerView r0) {
            r0.updateErrorMessage()
            return
    }

    public static /* synthetic */ void access$700(com.google.android.exoplayer2.ui.PlayerView r0) {
            r0.updateControllerVisibility()
            return
    }

    public static /* synthetic */ boolean access$800(com.google.android.exoplayer2.ui.PlayerView r0) {
            boolean r0 = r0.isPlayingAd()
            return r0
    }

    public static /* synthetic */ boolean access$900(com.google.android.exoplayer2.ui.PlayerView r0) {
            boolean r0 = r0.controllerHideDuringAds
            return r0
    }

    private static void applyTextureViewRotation(android.view.TextureView r6, int r7) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r6.getWidth()
            float r1 = (float) r1
            int r2 = r6.getHeight()
            float r2 = (float) r2
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 == 0) goto L3e
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L3e
            if (r7 == 0) goto L3e
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r1 / r4
            float r4 = r2 / r4
            float r7 = (float) r7
            r0.postRotate(r7, r5, r4)
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>(r3, r3, r1, r2)
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r0.mapRect(r3, r7)
            float r7 = r3.width()
            float r1 = r1 / r7
            float r7 = r3.height()
            float r2 = r2 / r7
            r0.postScale(r1, r2, r5, r4)
        L3e:
            r6.setTransform(r0)
            return
    }

    private void closeShutter() {
            r2 = this;
            android.view.View r0 = r2.shutterView
            if (r0 == 0) goto L8
            r1 = 0
            r0.setVisibility(r1)
        L8:
            return
    }

    private static void configureEditModeLogo(android.content.Context r1, android.content.res.Resources r2, android.widget.ImageView r3) {
            int r0 = com.google.android.exoplayer2.ui.R.drawable.exo_edit_mode_logo
            android.graphics.drawable.Drawable r1 = com.google.android.exoplayer2.util.Util.getDrawable(r1, r2, r0)
            r3.setImageDrawable(r1)
            int r1 = com.google.android.exoplayer2.ui.R.color.exo_edit_mode_background_color
            int r1 = r2.getColor(r1)
            r3.setBackgroundColor(r1)
            return
    }

    @androidx.annotation.RequiresApi(23)
    private static void configureEditModeLogoV23(android.content.Context r1, android.content.res.Resources r2, android.widget.ImageView r3) {
            int r0 = com.google.android.exoplayer2.ui.R.drawable.exo_edit_mode_logo
            android.graphics.drawable.Drawable r1 = com.google.android.exoplayer2.util.Util.getDrawable(r1, r2, r0)
            r3.setImageDrawable(r1)
            int r1 = com.google.android.exoplayer2.ui.R.color.exo_edit_mode_background_color
            r0 = 0
            int r1 = r2.getColor(r1, r0)
            r3.setBackgroundColor(r1)
            return
    }

    private void hideArtwork() {
            r2 = this;
            android.widget.ImageView r0 = r2.artworkView
            if (r0 == 0) goto L10
            r1 = 17170445(0x106000d, float:2.461195E-38)
            r0.setImageResource(r1)
            android.widget.ImageView r0 = r2.artworkView
            r1 = 4
            r0.setVisibility(r1)
        L10:
            return
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    private boolean isDpadKey(int r2) {
            r1 = this;
            r0 = 19
            if (r2 == r0) goto L27
            r0 = 270(0x10e, float:3.78E-43)
            if (r2 == r0) goto L27
            r0 = 22
            if (r2 == r0) goto L27
            r0 = 271(0x10f, float:3.8E-43)
            if (r2 == r0) goto L27
            r0 = 20
            if (r2 == r0) goto L27
            r0 = 269(0x10d, float:3.77E-43)
            if (r2 == r0) goto L27
            r0 = 21
            if (r2 == r0) goto L27
            r0 = 268(0x10c, float:3.76E-43)
            if (r2 == r0) goto L27
            r0 = 23
            if (r2 != r0) goto L25
            goto L27
        L25:
            r2 = 0
            goto L28
        L27:
            r2 = 1
        L28:
            return r2
    }

    private boolean isPlayingAd() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            if (r0 == 0) goto L14
            boolean r0 = r0.isPlayingAd()
            if (r0 == 0) goto L14
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.getPlayWhenReady()
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    private void maybeShowController(boolean r3) {
            r2 = this;
            boolean r0 = r2.isPlayingAd()
            if (r0 == 0) goto Lb
            boolean r0 = r2.controllerHideDuringAds
            if (r0 == 0) goto Lb
            return
        Lb:
            boolean r0 = r2.useController()
            if (r0 == 0) goto L31
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r2.controller
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L23
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r2.controller
            int r0 = r0.getShowTimeoutMs()
            if (r0 > 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            boolean r1 = r2.shouldShowControllerIndefinitely()
            if (r3 != 0) goto L2e
            if (r0 != 0) goto L2e
            if (r1 == 0) goto L31
        L2e:
            r2.showController(r1)
        L31:
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"artworkView"})
    private boolean setArtworkFromMediaMetadata(com.google.android.exoplayer2.MediaMetadata r3) {
            r2 = this;
            byte[] r3 = r3.artworkData
            r0 = 0
            if (r3 != 0) goto L6
            return r0
        L6:
            int r1 = r3.length
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r3, r0, r1)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r2.getResources()
            r0.<init>(r1, r3)
            boolean r3 = r2.setDrawableArtwork(r0)
            return r3
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"artworkView"})
    private boolean setDrawableArtwork(@androidx.annotation.Nullable android.graphics.drawable.Drawable r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L25
            int r1 = r4.getIntrinsicWidth()
            int r2 = r4.getIntrinsicHeight()
            if (r1 <= 0) goto L25
            if (r2 <= 0) goto L25
            float r1 = (float) r1
            float r2 = (float) r2
            float r1 = r1 / r2
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r2 = r3.contentFrame
            if (r2 == 0) goto L19
            r2.setAspectRatio(r1)
        L19:
            android.widget.ImageView r1 = r3.artworkView
            r1.setImageDrawable(r4)
            android.widget.ImageView r4 = r3.artworkView
            r4.setVisibility(r0)
            r4 = 1
            return r4
        L25:
            return r0
    }

    private static void setResizeModeRaw(com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0, int r1) {
            r0.setResizeMode(r1)
            return
    }

    private boolean shouldShowControllerIndefinitely() {
            r3 = this;
            com.google.android.exoplayer2.Player r0 = r3.player
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.getPlaybackState()
            boolean r2 = r3.controllerAutoShow
            if (r2 == 0) goto L1c
            if (r0 == r1) goto L1d
            r2 = 4
            if (r0 == r2) goto L1d
            com.google.android.exoplayer2.Player r0 = r3.player
            boolean r0 = r0.getPlayWhenReady()
            if (r0 != 0) goto L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
    }

    private void showController(boolean r2) {
            r1 = this;
            boolean r0 = r1.useController()
            if (r0 != 0) goto L7
            return
        L7:
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            if (r2 == 0) goto Ld
            r2 = 0
            goto Lf
        Ld:
            int r2 = r1.controllerShowTimeoutMs
        Lf:
            r0.setShowTimeoutMs(r2)
            com.google.android.exoplayer2.ui.PlayerControlView r2 = r1.controller
            r2.show()
            return
    }

    public static void switchTargetView(com.google.android.exoplayer2.Player r0, @androidx.annotation.Nullable com.google.android.exoplayer2.ui.PlayerView r1, @androidx.annotation.Nullable com.google.android.exoplayer2.ui.PlayerView r2) {
            if (r1 != r2) goto L3
            return
        L3:
            if (r2 == 0) goto L8
            r2.setPlayer(r0)
        L8:
            if (r1 == 0) goto Le
            r0 = 0
            r1.setPlayer(r0)
        Le:
            return
    }

    private void toggleControllerVisibility() {
            r1 = this;
            boolean r0 = r1.useController()
            if (r0 == 0) goto L21
            com.google.android.exoplayer2.Player r0 = r1.player
            if (r0 != 0) goto Lb
            goto L21
        Lb:
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            boolean r0 = r0.isVisible()
            if (r0 != 0) goto L18
            r0 = 1
            r1.maybeShowController(r0)
            goto L21
        L18:
            boolean r0 = r1.controllerHideOnTouch
            if (r0 == 0) goto L21
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            r0.hide()
        L21:
            return
    }

    private void updateAspectRatio() {
            r5 = this;
            com.google.android.exoplayer2.Player r0 = r5.player
            if (r0 == 0) goto L9
            com.google.android.exoplayer2.video.VideoSize r0 = r0.getVideoSize()
            goto Lb
        L9:
            com.google.android.exoplayer2.video.VideoSize r0 = com.google.android.exoplayer2.video.VideoSize.UNKNOWN
        Lb:
            int r1 = r0.width
            int r2 = r0.height
            int r3 = r0.unappliedRotationDegrees
            r4 = 0
            if (r2 == 0) goto L1f
            if (r1 != 0) goto L17
            goto L1f
        L17:
            float r1 = (float) r1
            float r0 = r0.pixelWidthHeightRatio
            float r1 = r1 * r0
            float r0 = (float) r2
            float r1 = r1 / r0
            goto L20
        L1f:
            r1 = 0
        L20:
            android.view.View r0 = r5.surfaceView
            boolean r2 = r0 instanceof android.view.TextureView
            if (r2 == 0) goto L53
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 <= 0) goto L36
            r2 = 90
            if (r3 == r2) goto L32
            r2 = 270(0x10e, float:3.78E-43)
            if (r3 != r2) goto L36
        L32:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r1
            r1 = r2
        L36:
            int r2 = r5.textureViewRotation
            if (r2 == 0) goto L3f
            com.google.android.exoplayer2.ui.PlayerView$ComponentListener r2 = r5.componentListener
            r0.removeOnLayoutChangeListener(r2)
        L3f:
            r5.textureViewRotation = r3
            if (r3 == 0) goto L4a
            android.view.View r0 = r5.surfaceView
            com.google.android.exoplayer2.ui.PlayerView$ComponentListener r2 = r5.componentListener
            r0.addOnLayoutChangeListener(r2)
        L4a:
            android.view.View r0 = r5.surfaceView
            android.view.TextureView r0 = (android.view.TextureView) r0
            int r2 = r5.textureViewRotation
            applyTextureViewRotation(r0, r2)
        L53:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = r5.contentFrame
            boolean r2 = r5.surfaceViewIgnoresVideoAspectRatio
            if (r2 == 0) goto L5a
            goto L5b
        L5a:
            r4 = r1
        L5b:
            if (r0 == 0) goto L60
            r0.setAspectRatio(r4)
        L60:
            return
    }

    private void updateBuffering() {
            r4 = this;
            android.view.View r0 = r4.bufferingView
            if (r0 == 0) goto L2b
            com.google.android.exoplayer2.Player r0 = r4.player
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L20
            int r0 = r0.getPlaybackState()
            r3 = 2
            if (r0 != r3) goto L20
            int r0 = r4.showBuffering
            if (r0 == r3) goto L21
            if (r0 != r1) goto L20
            com.google.android.exoplayer2.Player r0 = r4.player
            boolean r0 = r0.getPlayWhenReady()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            android.view.View r0 = r4.bufferingView
            if (r1 == 0) goto L26
            goto L28
        L26:
            r2 = 8
        L28:
            r0.setVisibility(r2)
        L2b:
            return
    }

    private void updateContentDescription() {
            r3 = this;
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r3.controller
            r1 = 0
            if (r0 == 0) goto L30
            boolean r2 = r3.useController
            if (r2 != 0) goto La
            goto L30
        La:
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L22
            boolean r0 = r3.controllerHideOnTouch
            if (r0 == 0) goto L1e
            android.content.res.Resources r0 = r3.getResources()
            int r1 = com.google.android.exoplayer2.ui.R.string.exo_controls_hide
            java.lang.String r1 = r0.getString(r1)
        L1e:
            r3.setContentDescription(r1)
            goto L33
        L22:
            android.content.res.Resources r0 = r3.getResources()
            int r1 = com.google.android.exoplayer2.ui.R.string.exo_controls_show
            java.lang.String r0 = r0.getString(r1)
            r3.setContentDescription(r0)
            goto L33
        L30:
            r3.setContentDescription(r1)
        L33:
            return
    }

    private void updateControllerVisibility() {
            r1 = this;
            boolean r0 = r1.isPlayingAd()
            if (r0 == 0) goto Le
            boolean r0 = r1.controllerHideDuringAds
            if (r0 == 0) goto Le
            r1.hideController()
            goto L12
        Le:
            r0 = 0
            r1.maybeShowController(r0)
        L12:
            return
    }

    private void updateErrorMessage() {
            r3 = this;
            android.widget.TextView r0 = r3.errorMessageView
            if (r0 == 0) goto L3c
            java.lang.CharSequence r1 = r3.customErrorMessage
            r2 = 0
            if (r1 == 0) goto L12
            r0.setText(r1)
            android.widget.TextView r0 = r3.errorMessageView
            r0.setVisibility(r2)
            return
        L12:
            com.google.android.exoplayer2.Player r0 = r3.player
            if (r0 == 0) goto L1b
            com.google.android.exoplayer2.PlaybackException r0 = r0.getPlayerError()
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L35
            com.google.android.exoplayer2.util.ErrorMessageProvider<? super com.google.android.exoplayer2.PlaybackException> r1 = r3.errorMessageProvider
            if (r1 == 0) goto L35
            android.util.Pair r0 = r1.getErrorMessage(r0)
            java.lang.Object r0 = r0.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            android.widget.TextView r1 = r3.errorMessageView
            r1.setText(r0)
            android.widget.TextView r0 = r3.errorMessageView
            r0.setVisibility(r2)
            goto L3c
        L35:
            android.widget.TextView r0 = r3.errorMessageView
            r1 = 8
            r0.setVisibility(r1)
        L3c:
            return
    }

    private void updateForCurrentTrackSelections(boolean r3) {
            r2 = this;
            com.google.android.exoplayer2.Player r0 = r2.player
            if (r0 == 0) goto L50
            r1 = 30
            boolean r1 = r0.isCommandAvailable(r1)
            if (r1 == 0) goto L50
            com.google.android.exoplayer2.Tracks r1 = r0.getCurrentTracks()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L17
            goto L50
        L17:
            if (r3 == 0) goto L20
            boolean r3 = r2.keepContentOnPlayerReset
            if (r3 != 0) goto L20
            r2.closeShutter()
        L20:
            com.google.android.exoplayer2.Tracks r3 = r0.getCurrentTracks()
            r1 = 2
            boolean r3 = r3.isTypeSelected(r1)
            if (r3 == 0) goto L2f
            r2.hideArtwork()
            return
        L2f:
            r2.closeShutter()
            boolean r3 = r2.useArtwork()
            if (r3 == 0) goto L4c
            com.google.android.exoplayer2.MediaMetadata r3 = r0.getMediaMetadata()
            boolean r3 = r2.setArtworkFromMediaMetadata(r3)
            if (r3 == 0) goto L43
            return
        L43:
            android.graphics.drawable.Drawable r3 = r2.defaultArtwork
            boolean r3 = r2.setDrawableArtwork(r3)
            if (r3 == 0) goto L4c
            return
        L4c:
            r2.hideArtwork()
            return
        L50:
            boolean r3 = r2.keepContentOnPlayerReset
            if (r3 != 0) goto L5a
            r2.hideArtwork()
            r2.closeShutter()
        L5a:
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    private boolean useArtwork() {
            r1 = this;
            boolean r0 = r1.useArtwork
            if (r0 == 0) goto Lb
            android.widget.ImageView r0 = r1.artworkView
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"controller"}, result = true)
    private boolean useController() {
            r1 = this;
            boolean r0 = r1.useController
            if (r0 == 0) goto Lb
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r5) {
            r4 = this;
            com.google.android.exoplayer2.Player r0 = r4.player
            if (r0 == 0) goto Lf
            boolean r0 = r0.isPlayingAd()
            if (r0 == 0) goto Lf
            boolean r5 = super.dispatchKeyEvent(r5)
            return r5
        Lf:
            int r0 = r5.getKeyCode()
            boolean r0 = r4.isDpadKey(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2d
            boolean r3 = r4.useController()
            if (r3 == 0) goto L2d
            com.google.android.exoplayer2.ui.PlayerControlView r3 = r4.controller
            boolean r3 = r3.isVisible()
            if (r3 != 0) goto L2d
            r4.maybeShowController(r2)
            goto L49
        L2d:
            boolean r3 = r4.dispatchMediaKeyEvent(r5)
            if (r3 != 0) goto L46
            boolean r5 = super.dispatchKeyEvent(r5)
            if (r5 == 0) goto L3a
            goto L46
        L3a:
            if (r0 == 0) goto L4a
            boolean r5 = r4.useController()
            if (r5 == 0) goto L4a
            r4.maybeShowController(r2)
            goto L4a
        L46:
            r4.maybeShowController(r2)
        L49:
            r1 = 1
        L4a:
            return r1
    }

    public boolean dispatchMediaKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = r1.useController()
            if (r0 == 0) goto L10
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            boolean r2 = r0.dispatchMediaKeyEvent(r2)
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    @Override // com.google.android.exoplayer2.ui.AdViewProvider
    public java.util.List<com.google.android.exoplayer2.ui.AdOverlayInfo> getAdOverlayInfos() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.widget.FrameLayout r1 = r5.overlayFrameLayout
            if (r1 == 0) goto L14
            com.google.android.exoplayer2.ui.AdOverlayInfo r2 = new com.google.android.exoplayer2.ui.AdOverlayInfo
            r3 = 4
            java.lang.String r4 = "Transparent overlay does not impact viewability"
            r2.<init>(r1, r3, r4)
            r0.add(r2)
        L14:
            com.google.android.exoplayer2.ui.PlayerControlView r1 = r5.controller
            if (r1 == 0) goto L21
            com.google.android.exoplayer2.ui.AdOverlayInfo r2 = new com.google.android.exoplayer2.ui.AdOverlayInfo
            r3 = 1
            r2.<init>(r1, r3)
            r0.add(r2)
        L21:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.ui.AdViewProvider
    public android.view.ViewGroup getAdViewGroup() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.adOverlayFrameLayout
            java.lang.String r1 = "exo_ad_overlay must be present for ad playback"
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0, r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            return r0
    }

    public boolean getControllerAutoShow() {
            r1 = this;
            boolean r0 = r1.controllerAutoShow
            return r0
    }

    public boolean getControllerHideOnTouch() {
            r1 = this;
            boolean r0 = r1.controllerHideOnTouch
            return r0
    }

    public int getControllerShowTimeoutMs() {
            r1 = this;
            int r0 = r1.controllerShowTimeoutMs
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getDefaultArtwork() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.defaultArtwork
            return r0
    }

    @androidx.annotation.Nullable
    public android.widget.FrameLayout getOverlayFrameLayout() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.overlayFrameLayout
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.Player getPlayer() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            return r0
    }

    public int getResizeMode() {
            r1 = this;
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = r1.contentFrame
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = r1.contentFrame
            int r0 = r0.getResizeMode()
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.ui.SubtitleView getSubtitleView() {
            r1 = this;
            com.google.android.exoplayer2.ui.SubtitleView r0 = r1.subtitleView
            return r0
    }

    public boolean getUseArtwork() {
            r1 = this;
            boolean r0 = r1.useArtwork
            return r0
    }

    public boolean getUseController() {
            r1 = this;
            boolean r0 = r1.useController
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.View getVideoSurfaceView() {
            r1 = this;
            android.view.View r0 = r1.surfaceView
            return r0
    }

    public void hideController() {
            r1 = this;
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            if (r0 == 0) goto L7
            r0.hide()
        L7:
            return
    }

    public boolean isControllerVisible() {
            r1 = this;
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            if (r0 == 0) goto Lc
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void onPause() {
            r2 = this;
            android.view.View r0 = r2.surfaceView
            boolean r1 = r0 instanceof android.opengl.GLSurfaceView
            if (r1 == 0) goto Lb
            android.opengl.GLSurfaceView r0 = (android.opengl.GLSurfaceView) r0
            r0.onPause()
        Lb:
            return
    }

    public void onResume() {
            r2 = this;
            android.view.View r0 = r2.surfaceView
            boolean r1 = r0 instanceof android.opengl.GLSurfaceView
            if (r1 == 0) goto Lb
            android.opengl.GLSurfaceView r0 = (android.opengl.GLSurfaceView) r0
            r0.onResume()
        Lb:
            return
    }

    @Override // android.view.View
    public boolean onTrackballEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = r0.useController()
            if (r1 == 0) goto L10
            com.google.android.exoplayer2.Player r1 = r0.player
            if (r1 != 0) goto Lb
            goto L10
        Lb:
            r1 = 1
            r0.maybeShowController(r1)
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    public boolean performClick() {
            r1 = this;
            r1.toggleControllerVisibility()
            boolean r0 = super.performClick()
            return r0
    }

    public void setAspectRatioListener(@androidx.annotation.Nullable com.google.android.exoplayer2.ui.AspectRatioFrameLayout.AspectRatioListener r2) {
            r1 = this;
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = r1.contentFrame
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = r1.contentFrame
            r0.setAspectRatioListener(r2)
            return
    }

    public void setControllerAutoShow(boolean r1) {
            r0 = this;
            r0.controllerAutoShow = r1
            return
    }

    public void setControllerHideDuringAds(boolean r1) {
            r0 = this;
            r0.controllerHideDuringAds = r1
            return
    }

    public void setControllerHideOnTouch(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            r1.controllerHideOnTouch = r2
            r1.updateContentDescription()
            return
    }

    public void setControllerShowTimeoutMs(int r2) {
            r1 = this;
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            r1.controllerShowTimeoutMs = r2
            com.google.android.exoplayer2.ui.PlayerControlView r2 = r1.controller
            boolean r2 = r2.isVisible()
            if (r2 == 0) goto L12
            r1.showController()
        L12:
            return
    }

    public void setControllerVisibilityListener(@androidx.annotation.Nullable com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener r3) {
            r2 = this;
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r2.controller
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.ui.PlayerControlView$VisibilityListener r0 = r2.controllerVisibilityListener
            if (r0 != r3) goto La
            return
        La:
            if (r0 == 0) goto L11
            com.google.android.exoplayer2.ui.PlayerControlView r1 = r2.controller
            r1.removeVisibilityListener(r0)
        L11:
            r2.controllerVisibilityListener = r3
            if (r3 == 0) goto L1a
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r2.controller
            r0.addVisibilityListener(r3)
        L1a:
            return
    }

    public void setCustomErrorMessage(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.errorMessageView
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r1.customErrorMessage = r2
            r1.updateErrorMessage()
            return
    }

    public void setDefaultArtwork(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.defaultArtwork
            if (r0 == r2) goto La
            r1.defaultArtwork = r2
            r2 = 0
            r1.updateForCurrentTrackSelections(r2)
        La:
            return
    }

    public void setErrorMessageProvider(@androidx.annotation.Nullable com.google.android.exoplayer2.util.ErrorMessageProvider<? super com.google.android.exoplayer2.PlaybackException> r2) {
            r1 = this;
            com.google.android.exoplayer2.util.ErrorMessageProvider<? super com.google.android.exoplayer2.PlaybackException> r0 = r1.errorMessageProvider
            if (r0 == r2) goto L9
            r1.errorMessageProvider = r2
            r1.updateErrorMessage()
        L9:
            return
    }

    public void setExtraAdGroupMarkers(@androidx.annotation.Nullable long[] r2, @androidx.annotation.Nullable boolean[] r3) {
            r1 = this;
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            r0.setExtraAdGroupMarkers(r2, r3)
            return
    }

    public void setKeepContentOnPlayerReset(boolean r2) {
            r1 = this;
            boolean r0 = r1.keepContentOnPlayerReset
            if (r0 == r2) goto La
            r1.keepContentOnPlayerReset = r2
            r2 = 0
            r1.updateForCurrentTrackSelections(r2)
        La:
            return
    }

    public void setPlayer(@androidx.annotation.Nullable com.google.android.exoplayer2.Player r7) {
            r6 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            if (r7 == 0) goto L21
            android.os.Looper r0 = r7.getApplicationLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L1f
            goto L21
        L1f:
            r0 = 0
            goto L22
        L21:
            r0 = 1
        L22:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            com.google.android.exoplayer2.Player r0 = r6.player
            if (r0 != r7) goto L2a
            return
        L2a:
            r1 = 27
            if (r0 == 0) goto L4e
            com.google.android.exoplayer2.ui.PlayerView$ComponentListener r4 = r6.componentListener
            r0.removeListener(r4)
            boolean r4 = r0.isCommandAvailable(r1)
            if (r4 == 0) goto L4e
            android.view.View r4 = r6.surfaceView
            boolean r5 = r4 instanceof android.view.TextureView
            if (r5 == 0) goto L45
            android.view.TextureView r4 = (android.view.TextureView) r4
            r0.clearVideoTextureView(r4)
            goto L4e
        L45:
            boolean r5 = r4 instanceof android.view.SurfaceView
            if (r5 == 0) goto L4e
            android.view.SurfaceView r4 = (android.view.SurfaceView) r4
            r0.clearVideoSurfaceView(r4)
        L4e:
            com.google.android.exoplayer2.ui.SubtitleView r0 = r6.subtitleView
            if (r0 == 0) goto L56
            r4 = 0
            r0.setCues(r4)
        L56:
            r6.player = r7
            boolean r0 = r6.useController()
            if (r0 == 0) goto L63
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r6.controller
            r0.setPlayer(r7)
        L63:
            r6.updateBuffering()
            r6.updateErrorMessage()
            r6.updateForCurrentTrackSelections(r2)
            if (r7 == 0) goto Lac
            boolean r0 = r7.isCommandAvailable(r1)
            if (r0 == 0) goto L8c
            android.view.View r0 = r6.surfaceView
            boolean r1 = r0 instanceof android.view.TextureView
            if (r1 == 0) goto L80
            android.view.TextureView r0 = (android.view.TextureView) r0
            r7.setVideoTextureView(r0)
            goto L89
        L80:
            boolean r1 = r0 instanceof android.view.SurfaceView
            if (r1 == 0) goto L89
            android.view.SurfaceView r0 = (android.view.SurfaceView) r0
            r7.setVideoSurfaceView(r0)
        L89:
            r6.updateAspectRatio()
        L8c:
            com.google.android.exoplayer2.ui.SubtitleView r0 = r6.subtitleView
            if (r0 == 0) goto La3
            r0 = 28
            boolean r0 = r7.isCommandAvailable(r0)
            if (r0 == 0) goto La3
            com.google.android.exoplayer2.ui.SubtitleView r0 = r6.subtitleView
            com.google.android.exoplayer2.text.CueGroup r1 = r7.getCurrentCues()
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> r1 = r1.cues
            r0.setCues(r1)
        La3:
            com.google.android.exoplayer2.ui.PlayerView$ComponentListener r0 = r6.componentListener
            r7.addListener(r0)
            r6.maybeShowController(r3)
            goto Laf
        Lac:
            r6.hideController()
        Laf:
            return
    }

    public void setRepeatToggleModes(int r2) {
            r1 = this;
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            r0.setRepeatToggleModes(r2)
            return
    }

    public void setResizeMode(int r2) {
            r1 = this;
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = r1.contentFrame
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = r1.contentFrame
            r0.setResizeMode(r2)
            return
    }

    public void setShowBuffering(int r2) {
            r1 = this;
            int r0 = r1.showBuffering
            if (r0 == r2) goto L9
            r1.showBuffering = r2
            r1.updateBuffering()
        L9:
            return
    }

    public void setShowFastForwardButton(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            r0.setShowFastForwardButton(r2)
            return
    }

    public void setShowMultiWindowTimeBar(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            r0.setShowMultiWindowTimeBar(r2)
            return
    }

    public void setShowNextButton(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            r0.setShowNextButton(r2)
            return
    }

    public void setShowPreviousButton(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            r0.setShowPreviousButton(r2)
            return
    }

    public void setShowRewindButton(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            r0.setShowRewindButton(r2)
            return
    }

    public void setShowShuffleButton(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.controller
            r0.setShowShuffleButton(r2)
            return
    }

    public void setShutterBackgroundColor(int r2) {
            r1 = this;
            android.view.View r0 = r1.shutterView
            if (r0 == 0) goto L7
            r0.setBackgroundColor(r2)
        L7:
            return
    }

    public void setUseArtwork(boolean r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto La
            android.widget.ImageView r1 = r2.artworkView
            if (r1 == 0) goto L8
            goto La
        L8:
            r1 = 0
            goto Lb
        La:
            r1 = 1
        Lb:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            boolean r1 = r2.useArtwork
            if (r1 == r3) goto L17
            r2.useArtwork = r3
            r2.updateForCurrentTrackSelections(r0)
        L17:
            return
    }

    public void setUseController(boolean r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == 0) goto Lb
            com.google.android.exoplayer2.ui.PlayerControlView r2 = r3.controller
            if (r2 == 0) goto L9
            goto Lb
        L9:
            r2 = 0
            goto Lc
        Lb:
            r2 = 1
        Lc:
            com.google.android.exoplayer2.util.Assertions.checkState(r2)
            if (r4 != 0) goto L17
            boolean r2 = r3.hasOnClickListeners()
            if (r2 == 0) goto L18
        L17:
            r0 = 1
        L18:
            r3.setClickable(r0)
            boolean r0 = r3.useController
            if (r0 != r4) goto L20
            return
        L20:
            r3.useController = r4
            boolean r4 = r3.useController()
            if (r4 == 0) goto L30
            com.google.android.exoplayer2.ui.PlayerControlView r4 = r3.controller
            com.google.android.exoplayer2.Player r0 = r3.player
            r4.setPlayer(r0)
            goto L3d
        L30:
            com.google.android.exoplayer2.ui.PlayerControlView r4 = r3.controller
            if (r4 == 0) goto L3d
            r4.hide()
            com.google.android.exoplayer2.ui.PlayerControlView r4 = r3.controller
            r0 = 0
            r4.setPlayer(r0)
        L3d:
            r3.updateContentDescription()
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            super.setVisibility(r3)
            android.view.View r0 = r2.surfaceView
            boolean r1 = r0 instanceof android.view.SurfaceView
            if (r1 == 0) goto Lc
            r0.setVisibility(r3)
        Lc:
            return
    }

    public void showController() {
            r1 = this;
            boolean r0 = r1.shouldShowControllerIndefinitely()
            r1.showController(r0)
            return
    }
}
