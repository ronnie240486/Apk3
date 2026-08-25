package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes2.dex */
public class CatchUpPlayerActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener, android.view.View.OnFocusChangeListener, android.widget.SeekBar.OnSeekBarChangeListener {
    private static final java.lang.String KEY_TRACK_SELECTION_PARAMETERS = "track_selection_parameters";
    public android.widget.ImageButton btn_back;
    public android.widget.ImageButton btn_forward;
    public android.widget.ImageButton btn_next;
    public android.widget.ImageButton btn_play;
    public android.widget.ImageButton btn_previous;
    public android.widget.ImageButton btn_rewind;
    public java.util.List<com.flextv.livestore.models.CatchUpEpg> catchUpEpgList;
    public java.lang.String content_url;
    public com.flextv.livestore.models.CatchUpEpg currentEpg;
    public com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
    public int duration;
    public com.flextv.livestore.dlgfragment.PlayErrorDlgFragment errorDlgFragment;
    public int error_count;
    public com.flextv.livestore.dlgfragment.ExitDlgFragment exitDlgFragment;
    public android.os.Handler handler;
    public androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 hideInfoTicker;
    public android.widget.ImageView image_forward;
    public android.widget.ImageView image_rewind;
    public androidx.constraintlayout.widget.ConstraintLayout ly_control;
    private final java.lang.Runnable mUpdateTimeTask;
    public int maxTime;
    public com.google.android.exoplayer2.ExoPlayer player;
    public com.google.android.exoplayer2.ui.StyledPlayerView playerView;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public int program_position;
    public android.widget.SeekBar seekBar;
    public java.lang.String stream_id;
    public com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters;
    public android.widget.TextView txt_end_time;
    public android.widget.TextView txt_name;
    public android.widget.TextView txt_start_time;
    public com.flextv.livestore.models.WordModels wordModels;





    public class PlayerEventListener implements com.google.android.exoplayer2.Player.Listener {
        public final /* synthetic */ com.flextv.livestore.activities.CatchUpPlayerActivity this$0;

        private PlayerEventListener(com.flextv.livestore.activities.CatchUpPlayerActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ PlayerEventListener(com.flextv.livestore.activities.CatchUpPlayerActivity r1, com.flextv.livestore.activities.CatchUpPlayerActivity.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
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

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onCues(com.google.android.exoplayer2.text.CueGroup r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onCues(r0, r1)
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
        public final /* synthetic */ void onPlayWhenReadyChanged(boolean r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayWhenReadyChanged(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlaybackParametersChanged(com.google.android.exoplayer2.PlaybackParameters r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackParametersChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int r2) {
                r1 = this;
                r0 = 4
                if (r2 != r0) goto L10
                com.flextv.livestore.activities.CatchUpPlayerActivity r2 = r1.this$0
                com.flextv.livestore.activities.CatchUpPlayerActivity.access$100(r2)
                com.flextv.livestore.activities.CatchUpPlayerActivity r2 = r1.this$0
                java.lang.String r0 = r2.content_url
                com.flextv.livestore.activities.CatchUpPlayerActivity.access$200(r2, r0)
                goto L42
            L10:
                r0 = 3
                if (r2 != r0) goto L27
                com.flextv.livestore.activities.CatchUpPlayerActivity r2 = r1.this$0
                r0 = 0
                r2.error_count = r0
                android.widget.ImageView r2 = r2.image_forward
                r0 = 8
                r2.setVisibility(r0)
                com.flextv.livestore.activities.CatchUpPlayerActivity r2 = r1.this$0
                android.widget.ImageView r2 = r2.image_rewind
                r2.setVisibility(r0)
                goto L42
            L27:
                r0 = 2
                if (r2 != r0) goto L42
                com.flextv.livestore.activities.CatchUpPlayerActivity r2 = r1.this$0
                androidx.constraintlayout.widget.ConstraintLayout r2 = r2.ly_control
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L42
                com.flextv.livestore.activities.CatchUpPlayerActivity r2 = r1.this$0
                android.os.Handler r0 = r2.handler
                androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r2 = r2.hideInfoTicker
                r0.removeCallbacks(r2)
                com.flextv.livestore.activities.CatchUpPlayerActivity r2 = r1.this$0
                com.flextv.livestore.activities.CatchUpPlayerActivity.access$300(r2)
            L42:
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerError(com.google.android.exoplayer2.PlaybackException r3) {
                r2 = this;
                int r3 = r3.errorCode
                r0 = 1002(0x3ea, float:1.404E-42)
                if (r3 != r0) goto L23
                com.flextv.livestore.activities.CatchUpPlayerActivity r3 = r2.this$0
                android.widget.ImageView r3 = r3.image_forward
                r0 = 8
                r3.setVisibility(r0)
                com.flextv.livestore.activities.CatchUpPlayerActivity r3 = r2.this$0
                android.widget.ImageView r3 = r3.image_rewind
                r3.setVisibility(r0)
                com.flextv.livestore.activities.CatchUpPlayerActivity r3 = r2.this$0
                com.flextv.livestore.activities.CatchUpPlayerActivity.access$100(r3)
                com.flextv.livestore.activities.CatchUpPlayerActivity r3 = r2.this$0
                java.lang.String r0 = r3.content_url
                com.flextv.livestore.activities.CatchUpPlayerActivity.access$200(r3, r0)
                goto L41
            L23:
                com.flextv.livestore.activities.CatchUpPlayerActivity r3 = r2.this$0
                int r0 = r3.error_count
                r1 = 2
                if (r0 <= r1) goto L33
                com.flextv.livestore.activities.CatchUpPlayerActivity.access$100(r3)
                com.flextv.livestore.activities.CatchUpPlayerActivity r3 = r2.this$0
                com.flextv.livestore.activities.CatchUpPlayerActivity.access$400(r3)
                goto L41
            L33:
                int r0 = r0 + 1
                r3.error_count = r0
                com.flextv.livestore.activities.CatchUpPlayerActivity.access$100(r3)
                com.flextv.livestore.activities.CatchUpPlayerActivity r3 = r2.this$0
                java.lang.String r0 = r3.content_url
                com.flextv.livestore.activities.CatchUpPlayerActivity.access$200(r3, r0)
            L41:
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
        public final /* synthetic */ void onPositionDiscontinuity(com.google.android.exoplayer2.Player.PositionInfo r1, com.google.android.exoplayer2.Player.PositionInfo r2, int r3) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPositionDiscontinuity(r0, r1, r2, r3)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onRenderedFirstFrame() {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onRenderedFirstFrame(r0)
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
        public final /* synthetic */ void onTracksChanged(com.google.android.exoplayer2.Tracks r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onTracksChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onVideoSizeChanged(com.google.android.exoplayer2.video.VideoSize r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onVideoSizeChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onVolumeChanged(float r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onVolumeChanged(r0, r1)
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$MbmHto6brvHpoNcFdvs4U8fUvs4(com.flextv.livestore.activities.CatchUpPlayerActivity r0, android.view.View r1) {
            r0.lambda$initView$1(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$x4gJvdi4Tqv-9U63mlX-srdHL0Q, reason: not valid java name */
    public static /* synthetic */ void m48$r8$lambda$x4gJvdi4Tqv9U63mlXsrdHL0Q(com.flextv.livestore.activities.CatchUpPlayerActivity r0) {
            r0.lambda$listTimer$0()
            return
    }

    static {
            java.lang.Class<com.flextv.livestore.activities.CatchUpPlayerActivity> r0 = com.flextv.livestore.activities.CatchUpPlayerActivity.class
            return
    }

    public CatchUpPlayerActivity() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.duration = r0
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            r2.handler = r1
            r2.program_position = r0
            r2.error_count = r0
            java.lang.String r0 = ""
            r2.content_url = r0
            r2.stream_id = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r2.wordModels = r0
            com.flextv.livestore.activities.CatchUpPlayerActivity$2 r0 = new com.flextv.livestore.activities.CatchUpPlayerActivity$2
            r0.<init>(r2)
            r2.mUpdateTimeTask = r0
            return
    }

    public static /* synthetic */ void access$100(com.flextv.livestore.activities.CatchUpPlayerActivity r0) {
            r0.releaseMediaPlayer()
            return
    }

    public static /* synthetic */ void access$200(com.flextv.livestore.activities.CatchUpPlayerActivity r0, java.lang.String r1) {
            r0.playVideo(r1)
            return
    }

    public static /* synthetic */ void access$300(com.flextv.livestore.activities.CatchUpPlayerActivity r0) {
            r0.listTimer()
            return
    }

    public static /* synthetic */ void access$400(com.flextv.livestore.activities.CatchUpPlayerActivity r0) {
            r0.showPlayErrorDlgFragment()
            return
    }

    public static /* synthetic */ java.lang.Runnable access$500(com.flextv.livestore.activities.CatchUpPlayerActivity r0) {
            java.lang.Runnable r0 = r0.mUpdateTimeTask
            return r0
    }

    public static /* synthetic */ void access$600(com.flextv.livestore.activities.CatchUpPlayerActivity r0, int r1) {
            r0.playCatchUp(r1)
            return
    }

    private com.google.android.exoplayer2.source.MediaSource.Factory createMediaSourceFactory() {
            r3 = this;
            com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider r0 = new com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider
            r0.<init>()
            com.google.android.exoplayer2.upstream.HttpDataSource$Factory r1 = com.flextv.livestore.utils.DemoUtil.getHttpDataSourceFactory(r3)
            r0.setDrmHttpDataSourceFactory(r1)
            com.google.android.exoplayer2.source.DefaultMediaSourceFactory r1 = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory
            r1.<init>(r3)
            com.google.android.exoplayer2.upstream.DataSource$Factory r2 = r3.dataSourceFactory
            com.google.android.exoplayer2.source.DefaultMediaSourceFactory r1 = r1.setDataSourceFactory(r2)
            com.google.android.exoplayer2.source.DefaultMediaSourceFactory r0 = r1.setDrmSessionManagerProvider(r0)
            return r0
    }

    private boolean getControlButtonFocus() {
            r1 = this;
            android.widget.ImageButton r0 = r1.btn_previous
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L2b
            android.widget.ImageButton r0 = r1.btn_rewind
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L2b
            android.widget.ImageButton r0 = r1.btn_play
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L2b
            android.widget.ImageButton r0 = r1.btn_forward
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L2b
            android.widget.ImageButton r0 = r1.btn_next
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L29
            goto L2b
        L29:
            r0 = 0
            goto L2c
        L2b:
            r0 = 1
        L2c:
            return r0
    }

    private void initView() {
            r3 = this;
            r0 = 2131428373(0x7f0b0415, float:1.8478389E38)
            android.view.View r0 = r3.findViewById(r0)
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = (com.google.android.exoplayer2.ui.AspectRatioFrameLayout) r0
            r0 = 2131428061(0x7f0b02dd, float:1.8477756E38)
            android.view.View r0 = r3.findViewById(r0)
            com.google.android.exoplayer2.ui.StyledPlayerView r0 = (com.google.android.exoplayer2.ui.StyledPlayerView) r0
            r3.playerView = r0
            r1 = 3
            r0.setResizeMode(r1)
            r0 = 2131427901(0x7f0b023d, float:1.8477431E38)
            android.view.View r0 = r3.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r3.ly_control = r0
            r0 = 2131427464(0x7f0b0088, float:1.8476545E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r3.btn_back = r0
            r0 = 2131427482(0x7f0b009a, float:1.8476581E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r3.btn_previous = r0
            r0 = 2131427486(0x7f0b009e, float:1.847659E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r3.btn_rewind = r0
            r0 = 2131427480(0x7f0b0098, float:1.8476577E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r3.btn_play = r0
            r0 = 2131427470(0x7f0b008e, float:1.8476557E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r3.btn_forward = r0
            r0 = 2131427477(0x7f0b0095, float:1.8476571E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r3.btn_next = r0
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.txt_name = r0
            r0 = 2131428345(0x7f0b03f9, float:1.8478332E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.txt_start_time = r0
            r0 = 2131428303(0x7f0b03cf, float:1.8478247E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.txt_end_time = r0
            r0 = 2131428135(0x7f0b0327, float:1.8477906E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            r3.seekBar = r0
            r0 = 2131427799(0x7f0b01d7, float:1.8477224E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.image_forward = r0
            r0 = 2131427812(0x7f0b01e4, float:1.847725E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.image_rewind = r0
            android.widget.SeekBar r0 = r3.seekBar
            r1 = 100
            r0.setMax(r1)
            android.widget.SeekBar r0 = r3.seekBar
            r0.setOnSeekBarChangeListener(r3)
            android.widget.ImageButton r0 = r3.btn_rewind
            r0.setOnClickListener(r3)
            android.widget.ImageButton r0 = r3.btn_play
            r0.setOnClickListener(r3)
            android.widget.ImageButton r0 = r3.btn_forward
            r0.setOnClickListener(r3)
            android.widget.ImageButton r0 = r3.btn_next
            r0.setOnClickListener(r3)
            android.widget.ImageButton r0 = r3.btn_previous
            r0.setOnClickListener(r3)
            android.widget.ImageButton r0 = r3.btn_back
            r0.setOnClickListener(r3)
            android.widget.ImageButton r0 = r3.btn_rewind
            r0.setOnFocusChangeListener(r3)
            android.widget.ImageButton r0 = r3.btn_play
            r0.setOnFocusChangeListener(r3)
            android.widget.ImageButton r0 = r3.btn_forward
            r0.setOnFocusChangeListener(r3)
            android.widget.ImageButton r0 = r3.btn_next
            r0.setOnFocusChangeListener(r3)
            android.widget.ImageButton r0 = r3.btn_previous
            r0.setOnFocusChangeListener(r3)
            android.widget.ImageButton r0 = r3.btn_back
            r0.setOnFocusChangeListener(r3)
            com.google.android.exoplayer2.ui.StyledPlayerView r0 = r3.playerView
            android.view.View r0 = r0.getVideoSurfaceView()
            com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0
            r2 = 2
            r1.<init>(r3, r2)
            r0.setOnClickListener(r1)
            return
    }

    private /* synthetic */ void lambda$initView$1(android.view.View r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.ly_control
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 != r0) goto L1b
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.ly_control
            r0 = 0
            r2.setVisibility(r0)
            android.os.Handler r2 = r1.handler
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r0 = r1.hideInfoTicker
            r2.removeCallbacks(r0)
            r1.listTimer()
            goto L20
        L1b:
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.ly_control
            r2.setVisibility(r0)
        L20:
            return
    }

    private /* synthetic */ void lambda$listTimer$0() {
            r2 = this;
            int r0 = r2.maxTime
            r1 = 1
            if (r0 >= r1) goto Ld
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.ly_control
            r1 = 8
            r0.setVisibility(r1)
            return
        Ld:
            r2.runNextTicker()
            return
    }

    private void listTimer() {
            r2 = this;
            r0 = 10
            r2.maxTime = r0
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r0 = new androidx.activity.ComponentDialog$$ExternalSyntheticLambda0
            r1 = 4
            r0.<init>(r2, r1)
            r2.hideInfoTicker = r0
            r0.run()
            return
    }

    private void playCatchUp(int r5) {
            r4 = this;
            java.util.List<com.flextv.livestore.models.CatchUpEpg> r0 = r4.catchUpEpgList
            java.lang.Object r5 = r0.get(r5)
            com.flextv.livestore.models.CatchUpEpg r5 = (com.flextv.livestore.models.CatchUpEpg) r5
            r4.currentEpg = r5
            android.widget.TextView r0 = r4.txt_name
            java.lang.String r5 = r5.getTitle()
            java.lang.String r5 = com.flextv.livestore.utils.Utils.decode64String(r5)
            r0.setText(r5)
            com.flextv.livestore.models.CatchUpEpg r5 = r4.currentEpg
            com.flextv.livestore.helper.PreferenceHelper r0 = r4.preferenceHelper
            java.lang.String r0 = r0.getSharedPreferenceServerUrl()
            com.flextv.livestore.helper.PreferenceHelper r1 = r4.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceUsername()
            com.flextv.livestore.helper.PreferenceHelper r2 = r4.preferenceHelper
            java.lang.String r2 = r2.getSharedPreferencePassword()
            java.lang.String r3 = r4.stream_id
            java.lang.String r5 = r5.getUrl(r0, r1, r2, r3)
            r4.content_url = r5
            r4.releaseMediaPlayer()
            androidx.constraintlayout.widget.ConstraintLayout r5 = r4.ly_control
            r0 = 0
            r5.setVisibility(r0)
            java.lang.String r5 = r4.content_url
            r4.playVideo(r5)
            r4.listTimer()
            return
    }

    private void playVideo(java.lang.String r5) {
            r4 = this;
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            if (r0 == 0) goto L7
            r0.release()
        L7:
            android.net.Uri r0 = android.net.Uri.parse(r5)
            java.lang.String r1 = ""
            int r0 = com.google.android.exoplayer2.util.Util.inferContentType(r0, r1)
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.getAdaptiveMimeTypeForContentType(r0)
            com.google.android.exoplayer2.MediaItem$Builder r1 = new com.google.android.exoplayer2.MediaItem$Builder
            r1.<init>()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            com.google.android.exoplayer2.MediaItem$Builder r5 = r1.setUri(r5)
            com.google.android.exoplayer2.MediaMetadata$Builder r2 = new com.google.android.exoplayer2.MediaMetadata$Builder
            r2.<init>()
            java.lang.String r3 = "title"
            com.google.android.exoplayer2.MediaMetadata$Builder r2 = r2.setTitle(r3)
            com.google.android.exoplayer2.MediaMetadata r2 = r2.build()
            com.google.android.exoplayer2.MediaItem$Builder r5 = r5.setMediaMetadata(r2)
            r5.setMimeType(r0)
            com.google.android.exoplayer2.MediaItem r5 = r1.build()
            com.google.android.exoplayer2.ExoPlayer$Builder r0 = new com.google.android.exoplayer2.ExoPlayer$Builder
            r0.<init>(r4)
            com.google.android.exoplayer2.source.MediaSource$Factory r1 = r4.createMediaSourceFactory()
            com.google.android.exoplayer2.ExoPlayer$Builder r0 = r0.setMediaSourceFactory(r1)
            r1 = 0
            r4.setRenderersFactory(r0, r1)
            com.google.android.exoplayer2.ExoPlayer r0 = r0.build()
            r4.player = r0
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1 = r4.trackSelectionParameters
            r0.setTrackSelectionParameters(r1)
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            com.flextv.livestore.activities.CatchUpPlayerActivity$PlayerEventListener r1 = new com.flextv.livestore.activities.CatchUpPlayerActivity$PlayerEventListener
            r2 = 0
            r1.<init>(r4, r2)
            r0.addListener(r1)
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            com.google.android.exoplayer2.util.EventLogger r1 = new com.google.android.exoplayer2.util.EventLogger
            r1.<init>()
            r0.addAnalyticsListener(r1)
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            com.google.android.exoplayer2.audio.AudioAttributes r1 = com.google.android.exoplayer2.audio.AudioAttributes.DEFAULT
            r2 = 1
            r0.setAudioAttributes(r1, r2)
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            r0.setPlayWhenReady(r2)
            com.google.android.exoplayer2.ui.StyledPlayerView r0 = r4.playerView
            com.google.android.exoplayer2.ExoPlayer r1 = r4.player
            r0.setPlayer(r1)
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            r0.setMediaItem(r5)
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            r5.prepare()
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            r5.play()
            android.os.Handler r5 = r4.handler
            java.lang.Runnable r0 = r4.mUpdateTimeTask
            r5.removeCallbacks(r0)
            r4.updateProgressBar()
            return
    }

    private void releaseMediaPlayer() {
            r2 = this;
            com.google.android.exoplayer2.ExoPlayer r0 = r2.player
            if (r0 != 0) goto L5
            return
        L5:
            r0.stop()
            com.google.android.exoplayer2.ExoPlayer r0 = r2.player
            r0.release()
            r0 = 0
            r2.player = r0
            com.google.android.exoplayer2.ui.StyledPlayerView r1 = r2.playerView
            r1.setPlayer(r0)
            return
    }

    private void runNextTicker() {
            r4 = this;
            int r0 = r4.maxTime
            int r0 = r0 + (-1)
            r4.maxTime = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            android.os.Handler r2 = r4.handler
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r3 = r4.hideInfoTicker
            r2.postAtTime(r3, r0)
            return
    }

    private void seekToForward() {
            r10 = this;
            com.google.android.exoplayer2.ExoPlayer r0 = r10.player
            if (r0 == 0) goto L3c
            long r0 = r0.getCurrentPosition()
            com.google.android.exoplayer2.ExoPlayer r2 = r10.player
            long r2 = r2.getDuration()
            int r4 = r10.duration
            int r4 = r4 + 30
            r10.duration = r4
            long r5 = (long) r4
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 >= 0) goto L26
            com.google.android.exoplayer2.ExoPlayer r0 = r10.player
            r4 = 30
            long r2 = r2 - r4
            r0.seekTo(r2)
            goto L2f
        L26:
            com.google.android.exoplayer2.ExoPlayer r2 = r10.player
            long r3 = (long) r4
            long r3 = r3 * r7
            long r3 = r3 + r0
            r2.seekTo(r3)
        L2f:
            r0 = 0
            r10.duration = r0
            android.os.Handler r0 = r10.handler
            java.lang.Runnable r1 = r10.mUpdateTimeTask
            r0.removeCallbacks(r1)
            r10.updateProgressBar()
        L3c:
            return
    }

    private void seekToRewind() {
            r8 = this;
            com.google.android.exoplayer2.ExoPlayer r0 = r8.player
            if (r0 == 0) goto L35
            long r0 = r0.getCurrentPosition()
            int r2 = r8.duration
            int r2 = r2 + 30
            r8.duration = r2
            long r3 = (long) r2
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 >= 0) goto L1f
            com.google.android.exoplayer2.ExoPlayer r0 = r8.player
            r1 = 1
            r0.seekTo(r1)
            goto L28
        L1f:
            long r2 = (long) r2
            long r2 = r2 * r5
            long r0 = r0 - r2
            com.google.android.exoplayer2.ExoPlayer r2 = r8.player
            r2.seekTo(r0)
        L28:
            r0 = 0
            r8.duration = r0
            android.os.Handler r0 = r8.handler
            java.lang.Runnable r1 = r8.mUpdateTimeTask
            r0.removeCallbacks(r1)
            r8.updateProgressBar()
        L35:
            return
    }

    private void setRenderersFactory(com.google.android.exoplayer2.ExoPlayer.Builder r1, boolean r2) {
            r0 = this;
            com.google.android.exoplayer2.RenderersFactory r2 = com.flextv.livestore.utils.DemoUtil.buildRenderersFactory(r0, r2)
            r1.setRenderersFactory(r2)
            return
    }

    private void showExitDlgFragment() {
            r6 = this;
            androidx.fragment.app.FragmentManager r0 = r6.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_exit"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r0)
            return
        L15:
            com.flextv.livestore.models.WordModels r1 = r6.wordModels
            java.lang.String r1 = r1.getStop_playback()
            com.flextv.livestore.models.WordModels r3 = r6.wordModels
            java.lang.String r3 = r3.getPlayback_description()
            com.flextv.livestore.models.WordModels r4 = r6.wordModels
            java.lang.String r4 = r4.getStr_yes()
            com.flextv.livestore.models.WordModels r5 = r6.wordModels
            java.lang.String r5 = r5.getNo()
            com.flextv.livestore.dlgfragment.ExitDlgFragment r1 = com.flextv.livestore.dlgfragment.ExitDlgFragment.newInstance(r1, r3, r4, r5)
            r6.exitDlgFragment = r1
            com.flextv.livestore.activities.CatchUpPlayerActivity$4 r3 = new com.flextv.livestore.activities.CatchUpPlayerActivity$4
            r3.<init>(r6)
            r1.setOkButtonClickListener(r3)
            com.flextv.livestore.dlgfragment.ExitDlgFragment r1 = r6.exitDlgFragment
            r1.show(r0, r2)
            return
    }

    private void showPlayErrorDlgFragment() {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_error"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r0)
            return
        L15:
            com.flextv.livestore.models.WordModels r1 = r5.wordModels
            java.lang.String r1 = r1.getPlay_back_error()
            com.flextv.livestore.models.WordModels r3 = r5.wordModels
            java.lang.String r3 = r3.getPlay_back_error_description()
            r4 = 0
            com.flextv.livestore.dlgfragment.PlayErrorDlgFragment r1 = com.flextv.livestore.dlgfragment.PlayErrorDlgFragment.newInstance(r1, r3, r4)
            r5.errorDlgFragment = r1
            com.flextv.livestore.activities.CatchUpPlayerActivity$3 r3 = new com.flextv.livestore.activities.CatchUpPlayerActivity$3
            r3.<init>(r5)
            r1.setOkButtonClickListener(r3)
            com.flextv.livestore.dlgfragment.PlayErrorDlgFragment r1 = r5.errorDlgFragment
            r1.show(r0, r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
            r5 = this;
            int r0 = r6.getAction()
            if (r0 != 0) goto Lf5
            int r0 = r6.getKeyCode()
            r1 = 4
            r2 = 8
            r3 = 0
            r4 = 1
            if (r0 == r1) goto Le3
            r1 = 85
            if (r0 == r1) goto Lbd
            r1 = 89
            if (r0 == r1) goto La3
            r1 = 90
            if (r0 == r1) goto L92
            switch(r0) {
                case 19: goto L78;
                case 20: goto L3f;
                case 21: goto La3;
                case 22: goto L92;
                case 23: goto L22;
                default: goto L20;
            }
        L20:
            goto Lf5
        L22:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != r2) goto Lf5
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.ly_control
            r6.setVisibility(r3)
            android.widget.ImageButton r6 = r5.btn_play
            r6.requestFocus()
            android.os.Handler r6 = r5.handler
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r0 = r5.hideInfoTicker
            r6.removeCallbacks(r0)
            r5.listTimer()
            return r4
        L3f:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L5c
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.ly_control
            r6.setVisibility(r3)
            android.widget.ImageButton r6 = r5.btn_play
            r6.requestFocus()
            android.os.Handler r6 = r5.handler
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r0 = r5.hideInfoTicker
            r6.removeCallbacks(r0)
            r5.listTimer()
            return r4
        L5c:
            android.widget.ImageButton r0 = r5.btn_back
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L6a
            android.widget.SeekBar r6 = r5.seekBar
            r6.requestFocus()
            return r4
        L6a:
            android.widget.SeekBar r0 = r5.seekBar
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lf5
            android.widget.ImageButton r6 = r5.btn_play
            r6.requestFocus()
            return r4
        L78:
            boolean r0 = r5.getControlButtonFocus()
            if (r0 == 0) goto L84
            android.widget.SeekBar r6 = r5.seekBar
            r6.requestFocus()
            return r4
        L84:
            android.widget.SeekBar r0 = r5.seekBar
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lf5
            android.widget.ImageButton r6 = r5.btn_back
            r6.requestFocus()
            return r4
        L92:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != r2) goto Lf5
            android.widget.ImageView r0 = r5.image_forward
            r0.setVisibility(r3)
            r5.seekToForward()
            goto Lf5
        La3:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != r2) goto Lb4
            android.widget.ImageView r0 = r5.image_rewind
            r0.setVisibility(r3)
            r5.seekToRewind()
            goto Lf5
        Lb4:
            android.widget.ImageButton r0 = r5.btn_previous
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lf5
            return r4
        Lbd:
            com.google.android.exoplayer2.ExoPlayer r0 = r5.player
            if (r0 == 0) goto Lf5
            boolean r0 = r0.getPlayWhenReady()
            if (r0 == 0) goto Ld5
            com.google.android.exoplayer2.ExoPlayer r0 = r5.player
            r0.setPlayWhenReady(r3)
            android.widget.ImageButton r0 = r5.btn_play
            r1 = 2131231027(0x7f080133, float:1.8078123E38)
            r0.setImageResource(r1)
            goto Lf5
        Ld5:
            com.google.android.exoplayer2.ExoPlayer r0 = r5.player
            r0.setPlayWhenReady(r4)
            android.widget.ImageButton r0 = r5.btn_play
            r1 = 2131231026(0x7f080132, float:1.8078121E38)
            r0.setImageResource(r1)
            goto Lf5
        Le3:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.ly_control
            int r6 = r6.getVisibility()
            if (r6 != 0) goto Lf1
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.ly_control
            r6.setVisibility(r2)
            return r4
        Lf1:
            r5.showExitDlgFragment()
            return r3
        Lf5:
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 1
            switch(r3) {
                case 2131427464: goto L6b;
                case 2131427470: goto L5d;
                case 2131427477: goto L49;
                case 2131427480: goto L22;
                case 2131427482: goto L17;
                case 2131427486: goto L9;
                default: goto L8;
            }
        L8:
            goto L6e
        L9:
            android.os.Handler r3 = r2.handler
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r0 = r2.hideInfoTicker
            r3.removeCallbacks(r0)
            r2.listTimer()
            r2.seekToRewind()
            goto L6e
        L17:
            int r3 = r2.program_position
            if (r3 <= 0) goto L6e
            int r3 = r3 - r0
            r2.program_position = r3
            r2.playCatchUp(r3)
            goto L6e
        L22:
            com.google.android.exoplayer2.ExoPlayer r3 = r2.player
            if (r3 == 0) goto L6e
            boolean r3 = r3.getPlayWhenReady()
            if (r3 == 0) goto L3b
            com.google.android.exoplayer2.ExoPlayer r3 = r2.player
            r0 = 0
            r3.setPlayWhenReady(r0)
            android.widget.ImageButton r3 = r2.btn_play
            r0 = 2131231027(0x7f080133, float:1.8078123E38)
            r3.setImageResource(r0)
            goto L6e
        L3b:
            com.google.android.exoplayer2.ExoPlayer r3 = r2.player
            r3.setPlayWhenReady(r0)
            android.widget.ImageButton r3 = r2.btn_play
            r0 = 2131231026(0x7f080132, float:1.8078121E38)
            r3.setImageResource(r0)
            goto L6e
        L49:
            int r3 = r2.program_position
            java.util.List<com.flextv.livestore.models.CatchUpEpg> r1 = r2.catchUpEpgList
            int r1 = r1.size()
            int r1 = r1 - r0
            if (r3 >= r1) goto L6e
            int r3 = r2.program_position
            int r3 = r3 + r0
            r2.program_position = r3
            r2.playCatchUp(r3)
            goto L6e
        L5d:
            android.os.Handler r3 = r2.handler
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r0 = r2.hideInfoTicker
            r3.removeCallbacks(r0)
            r2.listTimer()
            r2.seekToForward()
            goto L6e
        L6b:
            r2.showExitDlgFragment()
        L6e:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            r0 = 2131623966(0x7f0e001e, float:1.8875098E38)
            r2.setContentView(r0)
            com.flextv.livestore.utils.Utils.FullScreenCall(r2)
            com.flextv.livestore.helper.PreferenceHelper r0 = new com.flextv.livestore.helper.PreferenceHelper
            r0.<init>(r2)
            r2.preferenceHelper = r0
            com.flextv.livestore.models.WordModels r0 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r2)
            r2.wordModels = r0
            r2.initView()
            com.google.android.exoplayer2.upstream.DataSource$Factory r0 = com.flextv.livestore.utils.DemoUtil.getDataSourceFactory(r2)
            r2.dataSourceFactory = r0
            if (r3 == 0) goto L32
            java.lang.String r0 = "track_selection_parameters"
            android.os.Bundle r3 = r3.getBundle(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r3 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.fromBundle(r3)
            r2.trackSelectionParameters = r3
            goto L3d
        L32:
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r3 = new com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder
            r3.<init>(r2)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r3 = r3.build()
            r2.trackSelectionParameters = r3
        L3d:
            android.content.Intent r3 = r2.getIntent()
            r0 = 0
            java.lang.String r1 = "position"
            int r3 = r3.getIntExtra(r1, r0)
            r2.program_position = r3
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r0 = "stream_id"
            java.lang.String r3 = r3.getStringExtra(r0)
            r2.stream_id = r3
            com.google.gson.Gson r3 = new com.google.gson.Gson
            r3.<init>()
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "epg_model"
            java.lang.String r0 = r0.getStringExtra(r1)
            com.flextv.livestore.activities.CatchUpPlayerActivity$1 r1 = new com.flextv.livestore.activities.CatchUpPlayerActivity$1
            r1.<init>()
            java.lang.reflect.Type r1 = r1.getType()
            java.lang.Object r3 = r3.fromJson(r0, r1)
            java.util.List r3 = (java.util.List) r3
            r2.catchUpEpgList = r3
            int r3 = r2.program_position
            r2.playCatchUp(r3)
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto Lc
            android.os.Handler r1 = r0.handler
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r2 = r0.hideInfoTicker
            r1.removeCallbacks(r2)
            r0.listTimer()
        Lc:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar r3, int r4, boolean r5) {
            r2 = this;
            com.google.android.exoplayer2.ExoPlayer r0 = r2.player
            if (r0 == 0) goto L39
            if (r5 == 0) goto L39
            android.os.Handler r5 = r2.handler
            java.lang.Runnable r0 = r2.mUpdateTimeTask
            r5.removeCallbacks(r0)
            r3.setProgress(r4)
            com.google.android.exoplayer2.ExoPlayer r3 = r2.player
            long r0 = r3.getDuration()
            long r3 = (long) r4
            long r0 = r0 * r3
            r3 = 100
            long r0 = r0 / r3
            int r3 = (int) r0
            com.google.android.exoplayer2.ExoPlayer r4 = r2.player
            long r0 = (long) r3
            r4.seekTo(r0)
            android.widget.TextView r3 = r2.txt_start_time
            java.lang.String r4 = ""
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            java.lang.String r5 = com.flextv.livestore.utils.Utils.milliSecondsToTimer(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.setText(r4)
        L39:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar r1) {
            r0 = this;
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar r4) {
            r3 = this;
            com.google.android.exoplayer2.ExoPlayer r0 = r3.player
            if (r0 == 0) goto L3e
            int r0 = r4.getId()
            r1 = 2131428135(0x7f0b0327, float:1.8477906E38)
            if (r0 != r1) goto L3e
            android.os.Handler r0 = r3.handler
            java.lang.Runnable r1 = r3.mUpdateTimeTask
            r0.removeCallbacks(r1)
            com.google.android.exoplayer2.ExoPlayer r0 = r3.player
            long r0 = r0.getDuration()
            int r4 = r4.getProgress()
            int r4 = com.flextv.livestore.utils.Utils.progressToTimer(r4, r0)
            com.google.android.exoplayer2.ExoPlayer r0 = r3.player
            long r1 = (long) r4
            r0.seekTo(r1)
            android.widget.TextView r4 = r3.txt_start_time
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = com.flextv.livestore.utils.Utils.milliSecondsToTimer(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.setText(r0)
        L3e:
            return
    }

    public void updateProgressBar() {
            r4 = this;
            android.os.Handler r0 = r4.handler
            java.lang.Runnable r1 = r4.mUpdateTimeTask
            r2 = 100
            r0.postDelayed(r1, r2)
            return
    }
}
