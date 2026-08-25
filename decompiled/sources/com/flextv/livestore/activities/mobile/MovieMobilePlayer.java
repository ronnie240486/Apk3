package com.flextv.livestore.activities.mobile;

/* JADX INFO: loaded from: classes3.dex */
public class MovieMobilePlayer extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener, android.widget.SeekBar.OnSeekBarChangeListener {
    private static final java.lang.String KEY_TRACK_SELECTION_PARAMETERS = "track_selection_parameters";
    public android.media.AudioManager audioManager;
    public android.widget.SeekBar brightSeekBar;
    public android.widget.ImageButton btn_audio;
    public android.widget.ImageButton btn_back;
    public android.widget.ImageButton btn_fav;
    public android.widget.ImageButton btn_forward;
    public android.widget.ImageButton btn_info;
    public android.widget.ImageButton btn_play;
    public android.widget.ImageButton btn_resolution;
    public android.widget.ImageButton btn_rewind;
    public android.widget.ImageButton btn_sub;
    public java.lang.String category_name;
    public java.lang.String cont_url;
    public com.flextv.livestore.models.MovieModel currentMovie;
    public com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
    public java.lang.String description;
    public int duration;
    public com.flextv.livestore.dlgfragment.PlayErrorDlgFragment errorDlgFragment;
    public int error_count;
    public com.flextv.livestore.dlgfragment.ExitDlgFragment exitDlgFragment;
    public android.os.Handler handler;
    public androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 hideInfoTicker;
    public com.flextv.livestore.dlgfragment.MovieInfoDlgFragment infoDlgFragment;
    public boolean is_fav;
    public boolean is_system_setting;
    public long last_position;
    public androidx.constraintlayout.widget.ConstraintLayout ly_control;
    private final java.lang.Runnable mUpdateTimeTask;
    public int maxTime;
    public java.lang.String movie_name;
    public android.app.PictureInPictureParams.Builder pictureInPictureParams;
    public com.google.android.exoplayer2.ExoPlayer player;
    public com.google.android.exoplayer2.ui.StyledPlayerView playerView;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public java.lang.String resolution;
    public com.flextv.livestore.dlgfragment.ExitDlgFragment resumeDlgFragment;
    public android.widget.SeekBar seekBar;
    public java.lang.String stream_id;
    public java.lang.String tmdb_id;
    public com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters;
    public com.google.android.exoplayer2.trackselection.DefaultTrackSelector trackSelector;
    public android.widget.TextView txt_end_time;
    public android.widget.TextView txt_name;
    public android.widget.TextView txt_start_time;
    public android.view.View viewClick;
    public int volumeLevel;
    public android.widget.SeekBar volumeSeekBar;
    public com.flextv.livestore.models.WordModels wordModels;






    /* JADX INFO: loaded from: classes2.dex */
    public class PlayerEventListener implements com.google.android.exoplayer2.Player.Listener {
        public final /* synthetic */ com.flextv.livestore.activities.mobile.MovieMobilePlayer this$0;

        private PlayerEventListener(com.flextv.livestore.activities.mobile.MovieMobilePlayer r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ PlayerEventListener(com.flextv.livestore.activities.mobile.MovieMobilePlayer r1, com.flextv.livestore.activities.mobile.MovieMobilePlayer.AnonymousClass1 r2) {
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
        public void onPlaybackStateChanged(int r4) {
                r3 = this;
                r0 = 4
                if (r4 != r0) goto L12
                com.flextv.livestore.activities.mobile.MovieMobilePlayer r4 = r3.this$0
                com.flextv.livestore.activities.mobile.MovieMobilePlayer.access$200(r4)
                com.flextv.livestore.activities.mobile.MovieMobilePlayer r4 = r3.this$0
                java.lang.String r0 = r4.cont_url
                r1 = 0
                com.flextv.livestore.activities.mobile.MovieMobilePlayer.access$300(r4, r0, r1)
                goto L36
            L12:
                r0 = 3
                if (r4 != r0) goto L1b
                com.flextv.livestore.activities.mobile.MovieMobilePlayer r4 = r3.this$0
                r0 = 0
                r4.error_count = r0
                goto L36
            L1b:
                r0 = 2
                if (r4 != r0) goto L36
                com.flextv.livestore.activities.mobile.MovieMobilePlayer r4 = r3.this$0
                androidx.constraintlayout.widget.ConstraintLayout r4 = r4.ly_control
                int r4 = r4.getVisibility()
                if (r4 != 0) goto L36
                com.flextv.livestore.activities.mobile.MovieMobilePlayer r4 = r3.this$0
                android.os.Handler r0 = r4.handler
                androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r4 = r4.hideInfoTicker
                r0.removeCallbacks(r4)
                com.flextv.livestore.activities.mobile.MovieMobilePlayer r4 = r3.this$0
                com.flextv.livestore.activities.mobile.MovieMobilePlayer.access$400(r4)
            L36:
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerError(com.google.android.exoplayer2.PlaybackException r5) {
                r4 = this;
                int r5 = r5.errorCode
                r0 = 0
                r2 = 1002(0x3ea, float:1.404E-42)
                if (r5 != r2) goto L15
                com.flextv.livestore.activities.mobile.MovieMobilePlayer r5 = r4.this$0
                com.flextv.livestore.activities.mobile.MovieMobilePlayer.access$200(r5)
                com.flextv.livestore.activities.mobile.MovieMobilePlayer r5 = r4.this$0
                java.lang.String r2 = r5.cont_url
                com.flextv.livestore.activities.mobile.MovieMobilePlayer.access$300(r5, r2, r0)
                goto L33
            L15:
                com.flextv.livestore.activities.mobile.MovieMobilePlayer r5 = r4.this$0
                int r2 = r5.error_count
                r3 = 3
                if (r2 <= r3) goto L25
                com.flextv.livestore.activities.mobile.MovieMobilePlayer.access$200(r5)
                com.flextv.livestore.activities.mobile.MovieMobilePlayer r5 = r4.this$0
                com.flextv.livestore.activities.mobile.MovieMobilePlayer.access$500(r5)
                goto L33
            L25:
                int r2 = r2 + 1
                r5.error_count = r2
                com.flextv.livestore.activities.mobile.MovieMobilePlayer.access$200(r5)
                com.flextv.livestore.activities.mobile.MovieMobilePlayer r5 = r4.this$0
                java.lang.String r2 = r5.cont_url
                com.flextv.livestore.activities.mobile.MovieMobilePlayer.access$300(r5, r2, r0)
            L33:
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

    public static /* synthetic */ void $r8$lambda$1HtTPq3JagGFSmbVIz27gRmLhVE(com.flextv.livestore.activities.mobile.MovieMobilePlayer r0, android.view.View r1) {
            r0.lambda$initView$3(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Cse_0B5thWDGC3k4IwDSpDHsH_o(com.flextv.livestore.activities.mobile.MovieMobilePlayer r0) {
            r0.lambda$onClick$5()
            return
    }

    public static /* synthetic */ void $r8$lambda$HdZ_F3Ze03SZzsFD0mjCMrBvVq4(com.flextv.livestore.activities.mobile.MovieMobilePlayer r0) {
            r0.lambda$releaseMediaPlayer$1()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$V-k1clhxg4ieokHs6cEoIyq3IUI, reason: not valid java name */
    public static /* synthetic */ void m87$r8$lambda$Vk1clhxg4ieokHs6cEoIyq3IUI(com.flextv.livestore.activities.mobile.MovieMobilePlayer r0) {
            r0.lambda$listTimer$2()
            return
    }

    public static /* synthetic */ void $r8$lambda$br4v65fX7ZoSRFhImUkVm4NfAGo(com.flextv.livestore.activities.mobile.MovieMobilePlayer r0) {
            r0.lambda$onClick$4()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ot2LGtCiY8lTMWpxX7Eo9-siXjc, reason: not valid java name */
    public static /* synthetic */ void m88$r8$lambda$ot2LGtCiY8lTMWpxX7Eo9siXjc(com.flextv.livestore.activities.mobile.MovieMobilePlayer r0) {
            r0.lambda$releaseMediaPlayer$0()
            return
    }

    static {
            java.lang.Class<com.flextv.livestore.activities.mobile.MovieMobilePlayer> r0 = com.flextv.livestore.activities.mobile.MovieMobilePlayer.class
            return
    }

    public MovieMobilePlayer() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.cont_url = r0
            r2.movie_name = r0
            r2.category_name = r0
            r2.tmdb_id = r0
            r2.stream_id = r0
            r0 = 0
            r2.last_position = r0
            r0 = 0
            r2.error_count = r0
            r2.duration = r0
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            r2.handler = r1
            java.lang.String r1 = "1920x1080"
            r2.resolution = r1
            r2.is_system_setting = r0
            r2.is_fav = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r2.wordModels = r0
            com.flextv.livestore.activities.mobile.MovieMobilePlayer$2 r0 = new com.flextv.livestore.activities.mobile.MovieMobilePlayer$2
            r0.<init>(r2)
            r2.mUpdateTimeTask = r0
            return
    }

    public static /* synthetic */ java.lang.Runnable access$100(com.flextv.livestore.activities.mobile.MovieMobilePlayer r0) {
            java.lang.Runnable r0 = r0.mUpdateTimeTask
            return r0
    }

    public static /* synthetic */ void access$200(com.flextv.livestore.activities.mobile.MovieMobilePlayer r0) {
            r0.releaseMediaPlayer()
            return
    }

    public static /* synthetic */ void access$300(com.flextv.livestore.activities.mobile.MovieMobilePlayer r0, java.lang.String r1, long r2) {
            r0.playVideo(r1, r2)
            return
    }

    public static /* synthetic */ void access$400(com.flextv.livestore.activities.mobile.MovieMobilePlayer r0) {
            r0.listTimer()
            return
    }

    public static /* synthetic */ void access$500(com.flextv.livestore.activities.mobile.MovieMobilePlayer r0) {
            r0.showPlayErrorDlgFragment()
            return
    }

    private boolean checkAdultMovies(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "xxx"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L1c
            java.lang.String r0 = "porn"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L1c
            java.lang.String r0 = "adult"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L1a
            goto L1c
        L1a:
            r2 = 0
            goto L1d
        L1c:
            r2 = 1
        L1d:
            return r2
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

    private void initView() {
            r9 = this;
            r0 = 2131428373(0x7f0b0415, float:1.8478389E38)
            android.view.View r0 = r9.findViewById(r0)
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = (com.google.android.exoplayer2.ui.AspectRatioFrameLayout) r0
            r0 = 2131428061(0x7f0b02dd, float:1.8477756E38)
            android.view.View r0 = r9.findViewById(r0)
            com.google.android.exoplayer2.ui.StyledPlayerView r0 = (com.google.android.exoplayer2.ui.StyledPlayerView) r0
            r9.playerView = r0
            com.google.android.exoplayer2.ui.SubtitleView r0 = r0.getSubtitleView()
            r1 = 0
            r0.setApplyEmbeddedStyles(r1)
            com.google.android.exoplayer2.ui.CaptionStyleCompat r0 = new com.google.android.exoplayer2.ui.CaptionStyleCompat
            com.flextv.livestore.helper.PreferenceHelper r2 = r9.preferenceHelper
            java.lang.String r2 = r2.getSharedPreferenceSubtitleColor()
            int r3 = android.graphics.Color.parseColor(r2)
            com.flextv.livestore.helper.PreferenceHelper r2 = r9.preferenceHelper
            java.lang.String r2 = r2.getSharedPreferenceSubtitleBgColor()
            int r4 = android.graphics.Color.parseColor(r2)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.google.android.exoplayer2.ui.StyledPlayerView r2 = r9.playerView
            com.google.android.exoplayer2.ui.SubtitleView r2 = r2.getSubtitleView()
            com.flextv.livestore.helper.PreferenceHelper r3 = r9.preferenceHelper
            int r3 = r3.getSharedPreferenceSubtitleSize()
            float r3 = (float) r3
            r4 = 3
            r2.setFixedTextSize(r4, r3)
            com.google.android.exoplayer2.ui.StyledPlayerView r2 = r9.playerView
            com.google.android.exoplayer2.ui.SubtitleView r2 = r2.getSubtitleView()
            r2.setStyle(r0)
            r0 = 2131428377(0x7f0b0419, float:1.8478397E38)
            android.view.View r0 = r9.findViewById(r0)
            r9.viewClick = r0
            r0 = 2131427901(0x7f0b023d, float:1.8477431E38)
            android.view.View r0 = r9.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r9.ly_control = r0
            r0 = 2131427464(0x7f0b0088, float:1.8476545E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r9.btn_back = r0
            r0 = 2131427482(0x7f0b009a, float:1.8476581E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r0 = 2131427486(0x7f0b009e, float:1.847659E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r9.btn_rewind = r0
            r0 = 2131427480(0x7f0b0098, float:1.8476577E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r9.btn_play = r0
            r0 = 2131427470(0x7f0b008e, float:1.8476557E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r9.btn_forward = r0
            r0 = 2131427477(0x7f0b0095, float:1.8476571E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r0 = 2131427474(0x7f0b0092, float:1.8476565E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r9.btn_info = r0
            r0 = 2131427489(0x7f0b00a1, float:1.8476596E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r9.btn_sub = r0
            r0 = 2131427463(0x7f0b0087, float:1.8476543E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r9.btn_audio = r0
            r0 = 2131427484(0x7f0b009c, float:1.8476586E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r9.btn_resolution = r0
            r0 = 2131427469(0x7f0b008d, float:1.8476555E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r9.btn_fav = r0
            r0 = 2131428345(0x7f0b03f9, float:1.8478332E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.txt_start_time = r0
            r0 = 2131428303(0x7f0b03cf, float:1.8478247E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.txt_end_time = r0
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.txt_name = r0
            r0 = 2131428135(0x7f0b0327, float:1.8477906E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            r9.seekBar = r0
            r2 = 100
            r0.setMax(r2)
            android.widget.SeekBar r0 = r9.seekBar
            r0.setOnSeekBarChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_rewind
            r0.setOnClickListener(r9)
            android.widget.ImageButton r0 = r9.btn_play
            r0.setOnClickListener(r9)
            android.widget.ImageButton r0 = r9.btn_forward
            r0.setOnClickListener(r9)
            android.widget.ImageButton r0 = r9.btn_info
            r0.setOnClickListener(r9)
            android.widget.ImageButton r0 = r9.btn_sub
            r0.setOnClickListener(r9)
            android.widget.ImageButton r0 = r9.btn_audio
            r0.setOnClickListener(r9)
            android.widget.ImageButton r0 = r9.btn_back
            r0.setOnClickListener(r9)
            android.widget.ImageButton r0 = r9.btn_resolution
            r0.setOnClickListener(r9)
            android.widget.ImageButton r0 = r9.btn_fav
            r0.setOnClickListener(r9)
            android.view.View r0 = r9.viewClick
            r0.setOnClickListener(r9)
            com.google.android.exoplayer2.ui.StyledPlayerView r0 = r9.playerView
            android.view.View r0 = r0.getVideoSurfaceView()
            com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0 r3 = new com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0
            r5 = 7
            r3.<init>(r9, r5)
            r0.setOnClickListener(r3)
            r0 = 2131428387(0x7f0b0423, float:1.8478417E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            r9.volumeSeekBar = r0
            r0.setOnSeekBarChangeListener(r9)
            java.lang.String r0 = "audio"
            java.lang.Object r0 = r9.getSystemService(r0)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r9.audioManager = r0
            android.widget.SeekBar r0 = r9.volumeSeekBar
            r0.setMax(r2)
            android.media.AudioManager r0 = r9.audioManager
            int r0 = r0.getStreamVolume(r4)
            r9.volumeLevel = r0
            android.media.AudioManager r0 = r9.audioManager
            int r0 = r0.getStreamMaxVolume(r4)
            int r2 = r9.volumeLevel
            float r2 = (float) r2
            float r0 = (float) r0
            float r2 = r2 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r0
            int r0 = (int) r2
            android.widget.SeekBar r2 = r9.volumeSeekBar
            r2.setProgress(r0)
            r0 = 2131427450(0x7f0b007a, float:1.8476517E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            r9.brightSeekBar = r0
            r2 = 255(0xff, float:3.57E-43)
            r0.setMax(r2)
            android.content.ContentResolver r0 = r9.getContentResolver()
            java.lang.String r2 = "screen_brightness"
            int r0 = android.provider.Settings.System.getInt(r0, r2, r1)
            android.widget.SeekBar r1 = r9.brightSeekBar
            r1.setProgress(r0)
            android.widget.SeekBar r0 = r9.brightSeekBar
            r0.setOnSeekBarChangeListener(r9)
            return
    }

    private /* synthetic */ void lambda$initView$3(android.view.View r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.ly_control
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 != r0) goto L13
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.ly_control
            r0 = 0
            r2.setVisibility(r0)
            r1.listTimer()
        L13:
            return
    }

    private /* synthetic */ void lambda$listTimer$2() {
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

    private /* synthetic */ void lambda$onClick$4() {
            r2 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            java.util.List r1 = r1.getFavMovieNames()
            r0.setSharedPreferenceVodFavNames(r1)
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getMovie_is_removed_from_fav()
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            return
    }

    private /* synthetic */ void lambda$onClick$5() {
            r2 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            java.util.List r1 = r1.getFavMovieNames()
            r0.setSharedPreferenceVodFavNames(r1)
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getMovie_is_added_to_fav()
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            return
    }

    private /* synthetic */ void lambda$releaseMediaPlayer$0() {
            r2 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            java.util.List r1 = r1.getResumeMovies()
            r0.setSharedPreferenceResumeModel(r1)
            return
    }

    private /* synthetic */ void lambda$releaseMediaPlayer$1() {
            r2 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            java.util.List r1 = r1.getResumeMovies()
            r0.setSharedPreferenceResumeModel(r1)
            return
    }

    private void listTimer() {
            r2 = this;
            r0 = 10
            r2.maxTime = r0
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r0 = new androidx.activity.ComponentDialog$$ExternalSyntheticLambda0
            r1 = 7
            r0.<init>(r2, r1)
            r2.hideInfoTicker = r0
            r0.run()
            return
    }

    private void pictureInPictureMode() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L1d
            android.util.Rational r0 = new android.util.Rational
            r1 = 16
            r2 = 9
            r0.<init>(r1, r2)
            android.app.PictureInPictureParams$Builder r1 = r3.pictureInPictureParams
            r1.setAspectRatio(r0)
            android.app.PictureInPictureParams$Builder r0 = r3.pictureInPictureParams
            android.app.PictureInPictureParams r0 = r0.build()
            r3.enterPictureInPictureMode(r0)
        L1d:
            return
    }

    private void playVideo(java.lang.String r5, long r6) {
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
            com.google.android.exoplayer2.Tracks r0 = com.google.android.exoplayer2.Tracks.EMPTY
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector
            r0.<init>(r4)
            r4.trackSelector = r0
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1 = r4.trackSelectionParameters
            r0.setParameters(r1)
            com.google.android.exoplayer2.ExoPlayer$Builder r0 = new com.google.android.exoplayer2.ExoPlayer$Builder
            r0.<init>(r4)
            com.google.android.exoplayer2.source.MediaSource$Factory r1 = r4.createMediaSourceFactory()
            com.google.android.exoplayer2.ExoPlayer$Builder r0 = r0.setMediaSourceFactory(r1)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r1 = r4.trackSelector
            com.google.android.exoplayer2.ExoPlayer$Builder r0 = r0.setTrackSelector(r1)
            r1 = 1
            r4.setRenderersFactory(r0, r1)
            com.google.android.exoplayer2.ExoPlayer r0 = r0.build()
            r4.player = r0
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2 = r4.trackSelectionParameters
            r0.setTrackSelectionParameters(r2)
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            com.flextv.livestore.activities.mobile.MovieMobilePlayer$PlayerEventListener r2 = new com.flextv.livestore.activities.mobile.MovieMobilePlayer$PlayerEventListener
            r3 = 0
            r2.<init>(r4, r3)
            r0.addListener(r2)
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            com.google.android.exoplayer2.util.EventLogger r2 = new com.google.android.exoplayer2.util.EventLogger
            r2.<init>()
            r0.addAnalyticsListener(r2)
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            com.flextv.livestore.activities.mobile.MovieMobilePlayer$1 r2 = new com.flextv.livestore.activities.mobile.MovieMobilePlayer$1
            r2.<init>(r4)
            r0.addAnalyticsListener(r2)
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            com.google.android.exoplayer2.audio.AudioAttributes r2 = com.google.android.exoplayer2.audio.AudioAttributes.DEFAULT
            r0.setAudioAttributes(r2, r1)
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            r0.setPlayWhenReady(r1)
            com.google.android.exoplayer2.ui.StyledPlayerView r0 = r4.playerView
            com.google.android.exoplayer2.ExoPlayer r1 = r4.player
            r0.setPlayer(r1)
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            r0.setMediaItem(r5)
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            r5.prepare()
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            r5.play()
            r0 = 0
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 <= 0) goto Lb9
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            r5.seekTo(r6)
        Lb9:
            android.os.Handler r5 = r4.handler
            java.lang.Runnable r6 = r4.mUpdateTimeTask
            r5.removeCallbacks(r6)
            r4.updateProgressBar()
            return
    }

    private void releaseMediaPlayer() {
            r19 = this;
            r0 = r19
            com.google.android.exoplayer2.ExoPlayer r1 = r0.player
            if (r1 != 0) goto L7
            return
        L7:
            long r1 = r1.getCurrentPosition()
            r3 = 120000(0x1d4c0, double:5.9288E-319)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L51
            com.google.android.exoplayer2.ExoPlayer r1 = r0.player
            long r1 = r1.getCurrentPosition()
            r3 = 60000(0xea60, double:2.9644E-319)
            long r1 = r1 + r3
            com.google.android.exoplayer2.ExoPlayer r3 = r0.player
            long r3 = r3.getDuration()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L51
            com.google.android.exoplayer2.ExoPlayer r1 = r0.player
            long r1 = r1.getCurrentPosition()
            r3 = 100
            long r1 = r1 * r3
            com.google.android.exoplayer2.ExoPlayer r3 = r0.player
            long r3 = r3.getDuration()
            long r1 = r1 / r3
            int r9 = (int) r1
            com.flextv.livestore.helper.RealmController r3 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r4 = r0.movie_name
            java.lang.String r5 = r0.tmdb_id
            r6 = 1
            com.google.android.exoplayer2.ExoPlayer r1 = r0.player
            long r7 = r1.getCurrentPosition()
            com.flextv.livestore.activities.mobile.MovieMobilePlayer$$ExternalSyntheticLambda0 r10 = new com.flextv.livestore.activities.mobile.MovieMobilePlayer$$ExternalSyntheticLambda0
            r1 = 0
            r10.<init>(r0, r1)
            r3.addPositionToMovies(r4, r5, r6, r7, r9, r10)
            goto L69
        L51:
            com.flextv.livestore.helper.RealmController r11 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r12 = r0.movie_name
            java.lang.String r13 = r0.tmdb_id
            r14 = 0
            r15 = 0
            r17 = 0
            com.flextv.livestore.activities.mobile.MovieMobilePlayer$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.mobile.MovieMobilePlayer$$ExternalSyntheticLambda0
            r2 = 1
            r1.<init>(r0, r2)
            r18 = r1
            r11.addPositionToMovies(r12, r13, r14, r15, r17, r18)
        L69:
            com.google.android.exoplayer2.ExoPlayer r1 = r0.player
            r1.stop()
            com.google.android.exoplayer2.ExoPlayer r1 = r0.player
            r1.release()
            r1 = 0
            r0.player = r1
            com.google.android.exoplayer2.ui.StyledPlayerView r2 = r0.playerView
            r2.setPlayer(r1)
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
            int r4 = r4 + 10
            r10.duration = r4
            long r5 = (long) r4
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 >= 0) goto L26
            com.google.android.exoplayer2.ExoPlayer r0 = r10.player
            r4 = 10
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
            int r2 = r2 + 10
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

    private void showAudioTrackDlgFragment() {
            r6 = this;
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0 = r6.trackSelector
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo r0 = r0.getCurrentMappedTrackInfo()
            r1 = 1
            if (r0 == 0) goto L3b
            com.flextv.livestore.models.WordModels r2 = r6.wordModels
            java.lang.String r2 = r2.getAudio_track()
            int r3 = r0.getRendererType(r1)
            r4 = 0
            r5 = 2
            if (r3 == r5) goto L25
            if (r3 != r1) goto L23
            int r0 = r0.getTypeSupport(r5)
            if (r0 != 0) goto L23
            goto L25
        L23:
            r0 = 0
            goto L26
        L25:
            r0 = 1
        L26:
            com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder r3 = new com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder
            com.google.android.exoplayer2.ExoPlayer r5 = r6.player
            r3.<init>(r6, r2, r5, r1)
            r3.setAllowAdaptiveSelections(r0)
            r3.setShowDisableOption(r4)
            android.app.Dialog r0 = r3.build()
            r0.show()
            goto L4c
        L3b:
            android.content.Context r0 = r6.getApplicationContext()
            com.flextv.livestore.models.WordModels r2 = r6.wordModels
            java.lang.String r2 = r2.getNo_audio()
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
        L4c:
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
            com.flextv.livestore.activities.mobile.MovieMobilePlayer$4 r3 = new com.flextv.livestore.activities.mobile.MovieMobilePlayer$4
            r3.<init>(r6)
            r1.setOkButtonClickListener(r3)
            com.flextv.livestore.dlgfragment.ExitDlgFragment r1 = r6.exitDlgFragment
            r1.show(r0, r2)
            return
    }

    private void showInfoDlgFragment(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_info"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r5 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r5)
            return
        L15:
            com.flextv.livestore.dlgfragment.MovieInfoDlgFragment r5 = com.flextv.livestore.dlgfragment.MovieInfoDlgFragment.newInstance(r5, r6, r7, r8)
            r4.infoDlgFragment = r5
            r5.show(r0, r2)
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
            r4 = 1
            com.flextv.livestore.dlgfragment.PlayErrorDlgFragment r1 = com.flextv.livestore.dlgfragment.PlayErrorDlgFragment.newInstance(r1, r3, r4)
            r5.errorDlgFragment = r1
            com.flextv.livestore.activities.mobile.MovieMobilePlayer$5 r3 = new com.flextv.livestore.activities.mobile.MovieMobilePlayer$5
            r3.<init>(r5)
            r1.setOkButtonClickListener(r3)
            com.flextv.livestore.dlgfragment.PlayErrorDlgFragment r1 = r5.errorDlgFragment
            r1.show(r0, r2)
            return
    }

    private void showResumeDlgFragment(java.lang.String r7) {
            r6 = this;
            androidx.fragment.app.FragmentManager r0 = r6.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_resume"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r7 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r7)
            return
        L15:
            com.flextv.livestore.models.WordModels r1 = r6.wordModels
            java.lang.String r1 = r1.getResume()
            com.flextv.livestore.models.WordModels r3 = r6.wordModels
            java.lang.String r3 = r3.getResume_plyaback_from_ast_position()
            com.flextv.livestore.models.WordModels r4 = r6.wordModels
            java.lang.String r4 = r4.getStr_yes()
            com.flextv.livestore.models.WordModels r5 = r6.wordModels
            java.lang.String r5 = r5.getNo()
            com.flextv.livestore.dlgfragment.ExitDlgFragment r1 = com.flextv.livestore.dlgfragment.ExitDlgFragment.newInstance(r1, r3, r4, r5)
            r6.resumeDlgFragment = r1
            com.flextv.livestore.activities.mobile.MovieMobilePlayer$3 r3 = new com.flextv.livestore.activities.mobile.MovieMobilePlayer$3
            r3.<init>(r6, r7)
            r1.setOkButtonClickListener(r3)
            com.flextv.livestore.dlgfragment.ExitDlgFragment r7 = r6.resumeDlgFragment
            r7.show(r0, r2)
            return
    }

    private void showSubTitleTrackDlgFragment() {
            r6 = this;
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0 = r6.trackSelector
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo r0 = r0.getCurrentMappedTrackInfo()
            r1 = 1
            if (r0 == 0) goto L36
            com.flextv.livestore.models.WordModels r2 = r6.wordModels
            java.lang.String r2 = r2.getSubtitle()
            r3 = 3
            int r4 = r0.getRendererType(r3)
            r5 = 2
            if (r4 == r5) goto L24
            if (r4 != r3) goto L23
            int r0 = r0.getTypeSupport(r5)
            if (r0 != 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder r0 = new com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder
            com.google.android.exoplayer2.ExoPlayer r4 = r6.player
            r0.<init>(r6, r2, r4, r3)
            r0.setAllowAdaptiveSelections(r1)
            android.app.Dialog r0 = r0.build()
            r0.show()
            goto L47
        L36:
            android.content.Context r0 = r6.getApplicationContext()
            com.flextv.livestore.models.WordModels r2 = r6.wordModels
            java.lang.String r2 = r2.getNo_subtitle()
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
        L47:
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            int r0 = r3.getAction()
            if (r0 != 0) goto Lf
            int r0 = r3.getKeyCode()
            r1 = 4
            if (r0 != r1) goto Lf
            r3 = 1
            return r3
        Lf:
            boolean r3 = super.dispatchKeyEvent(r3)
            return r3
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r5) {
            r4 = this;
            int r5 = r5.getId()
            r0 = 3
            r1 = 1
            r2 = 0
            switch(r5) {
                case 2131427463: goto L11a;
                case 2131427464: goto L116;
                case 2131427469: goto Lb1;
                case 2131427470: goto La3;
                case 2131427474: goto L80;
                case 2131427480: goto L58;
                case 2131427484: goto L38;
                case 2131427486: goto L29;
                case 2131427489: goto L24;
                case 2131428377: goto Lc;
                default: goto La;
            }
        La:
            goto L11d
        Lc:
            androidx.constraintlayout.widget.ConstraintLayout r5 = r4.ly_control
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L11d
            android.os.Handler r5 = r4.handler
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r0 = r4.hideInfoTicker
            r5.removeCallbacks(r0)
            androidx.constraintlayout.widget.ConstraintLayout r5 = r4.ly_control
            r0 = 8
            r5.setVisibility(r0)
            goto L11d
        L24:
            r4.showSubTitleTrackDlgFragment()
            goto L11d
        L29:
            android.os.Handler r5 = r4.handler
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r0 = r4.hideInfoTicker
            r5.removeCallbacks(r0)
            r4.listTimer()
            r4.seekToRewind()
            goto L11d
        L38:
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            if (r5 == 0) goto L11d
            boolean r5 = r5.getPlayWhenReady()
            if (r5 == 0) goto L11d
            com.google.android.exoplayer2.ui.StyledPlayerView r5 = r4.playerView
            int r5 = r5.getResizeMode()
            if (r5 != r0) goto L51
            com.google.android.exoplayer2.ui.StyledPlayerView r5 = r4.playerView
            r5.setResizeMode(r2)
            goto L11d
        L51:
            com.google.android.exoplayer2.ui.StyledPlayerView r5 = r4.playerView
            r5.setResizeMode(r0)
            goto L11d
        L58:
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            if (r5 == 0) goto L11d
            boolean r5 = r5.getPlayWhenReady()
            if (r5 == 0) goto L71
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            r5.setPlayWhenReady(r2)
            android.widget.ImageButton r5 = r4.btn_play
            r0 = 2131231027(0x7f080133, float:1.8078123E38)
            r5.setImageResource(r0)
            goto L11d
        L71:
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            r5.setPlayWhenReady(r1)
            android.widget.ImageButton r5 = r4.btn_play
            r0 = 2131231026(0x7f080132, float:1.8078121E38)
            r5.setImageResource(r0)
            goto L11d
        L80:
            com.flextv.livestore.dlgfragment.MovieInfoDlgFragment r5 = r4.infoDlgFragment
            if (r5 == 0) goto L92
            boolean r5 = r5.isAdded()
            if (r5 != 0) goto L8b
            goto L92
        L8b:
            com.flextv.livestore.dlgfragment.MovieInfoDlgFragment r5 = r4.infoDlgFragment
            r5.dismiss()
            goto L11d
        L92:
            java.lang.String r5 = r4.movie_name
            java.lang.String r0 = r4.description
            com.flextv.livestore.models.MovieModel r1 = r4.currentMovie
            java.lang.String r1 = r1.getStream_icon()
            java.lang.String r2 = r4.resolution
            r4.showInfoDlgFragment(r5, r0, r1, r2)
            goto L11d
        La3:
            android.os.Handler r5 = r4.handler
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r0 = r4.hideInfoTicker
            r5.removeCallbacks(r0)
            r4.listTimer()
            r4.seekToForward()
            goto L11d
        Lb1:
            java.lang.String r5 = r4.category_name
            boolean r5 = r4.checkAdultMovies(r5)
            if (r5 == 0) goto Lc7
            com.flextv.livestore.models.WordModels r5 = r4.wordModels
            java.lang.String r5 = r5.getCant_add_this_movie()
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r2)
            r5.show()
            goto L11d
        Lc7:
            boolean r5 = r4.is_fav
            if (r5 == 0) goto Lf1
            r4.is_fav = r2
            android.widget.ImageButton r5 = r4.btn_fav
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131099775(0x7f06007f, float:1.7811913E38)
            int r0 = r0.getColor(r1)
            r5.setColorFilter(r0)
            com.flextv.livestore.helper.RealmController r5 = com.flextv.livestore.helper.RealmController.with()
            com.flextv.livestore.models.MovieModel r0 = r4.currentMovie
            java.lang.String r0 = r0.getName()
            com.flextv.livestore.activities.mobile.MovieMobilePlayer$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.mobile.MovieMobilePlayer$$ExternalSyntheticLambda0
            r3 = 2
            r1.<init>(r4, r3)
            r5.addToFavMovie(r0, r2, r1)
            goto L11d
        Lf1:
            r4.is_fav = r1
            android.widget.ImageButton r5 = r4.btn_fav
            android.content.res.Resources r2 = r4.getResources()
            r3 = 2131100408(0x7f0602f8, float:1.7813197E38)
            int r2 = r2.getColor(r3)
            r5.setColorFilter(r2)
            com.flextv.livestore.helper.RealmController r5 = com.flextv.livestore.helper.RealmController.with()
            com.flextv.livestore.models.MovieModel r2 = r4.currentMovie
            java.lang.String r2 = r2.getName()
            com.flextv.livestore.activities.mobile.MovieMobilePlayer$$ExternalSyntheticLambda0 r3 = new com.flextv.livestore.activities.mobile.MovieMobilePlayer$$ExternalSyntheticLambda0
            r3.<init>(r4, r0)
            r5.addToFavMovie(r2, r1, r3)
            goto L11d
        L116:
            r4.showExitDlgFragment()
            goto L11d
        L11a:
            r4.showAudioTrackDlgFragment()
        L11d:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r5) {
            r4 = this;
            super.onCreate(r5)
            r5 = 2131623979(0x7f0e002b, float:1.8875125E38)
            r4.setContentView(r5)
            com.flextv.livestore.utils.Utils.FullScreenCall(r4)
            com.flextv.livestore.helper.PreferenceHelper r5 = new com.flextv.livestore.helper.PreferenceHelper
            r5.<init>(r4)
            r4.preferenceHelper = r5
            com.flextv.livestore.models.WordModels r5 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r4)
            r4.wordModels = r5
            r4.initView()
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r5 < r0) goto L29
            android.app.PictureInPictureParams$Builder r5 = new android.app.PictureInPictureParams$Builder
            r5.<init>()
            r4.pictureInPictureParams = r5
        L29:
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "description"
            java.lang.String r5 = r5.getStringExtra(r0)
            r4.description = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "name"
            java.lang.String r5 = r5.getStringExtra(r0)
            r4.movie_name = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "category_name"
            java.lang.String r5 = r5.getStringExtra(r0)
            r4.category_name = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "stream_id"
            java.lang.String r5 = r5.getStringExtra(r0)
            r4.stream_id = r5
            com.flextv.livestore.helper.PreferenceHelper r5 = r4.preferenceHelper
            boolean r5 = r5.getSharedPreferenceISM3U()
            if (r5 == 0) goto L6f
            com.flextv.livestore.helper.RealmController r5 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r0 = r4.movie_name
            com.flextv.livestore.models.MovieModel r5 = r5.getMovieByName(r0)
            r4.currentMovie = r5
            goto L90
        L6f:
            java.lang.String r5 = r4.stream_id
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L84
            com.flextv.livestore.helper.RealmController r5 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r0 = r4.movie_name
            com.flextv.livestore.models.MovieModel r5 = r5.getMovieByName(r0)
            r4.currentMovie = r5
            goto L90
        L84:
            com.flextv.livestore.helper.RealmController r5 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r0 = r4.stream_id
            com.flextv.livestore.models.MovieModel r5 = r5.getMovieById(r0)
            r4.currentMovie = r5
        L90:
            com.flextv.livestore.models.MovieModel r5 = r4.currentMovie
            boolean r5 = r5.isIs_favorite()
            r4.is_fav = r5
            android.widget.TextView r5 = r4.txt_name
            java.lang.String r0 = r4.movie_name
            r5.setText(r0)
            boolean r5 = r4.is_fav
            if (r5 == 0) goto Lb4
            android.widget.ImageButton r5 = r4.btn_fav
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131100408(0x7f0602f8, float:1.7813197E38)
            int r0 = r0.getColor(r1)
            r5.setColorFilter(r0)
            goto Lc4
        Lb4:
            android.widget.ImageButton r5 = r4.btn_fav
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131099775(0x7f06007f, float:1.7811913E38)
            int r0 = r0.getColor(r1)
            r5.setColorFilter(r0)
        Lc4:
            com.google.android.exoplayer2.upstream.DataSource$Factory r5 = com.flextv.livestore.utils.DemoUtil.getDataSourceFactory(r4)
            r4.dataSourceFactory = r5
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r5 = new com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder
            r5.<init>(r4)
            r0 = 3
            com.flextv.livestore.helper.PreferenceHelper r1 = r4.preferenceHelper
            boolean r1 = r1.getSharedPreferenceSubtitleEnable()
            r1 = r1 ^ 1
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r5 = r5.setTrackTypeDisabled(r0, r1)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r5 = r5.build()
            r4.trackSelectionParameters = r5
            com.flextv.livestore.helper.PreferenceHelper r5 = r4.preferenceHelper
            boolean r5 = r5.getSharedPreferenceISM3U()
            if (r5 == 0) goto Lf3
            com.flextv.livestore.models.MovieModel r5 = r4.currentMovie
            java.lang.String r5 = r5.getUrl()
            r4.cont_url = r5
            goto L117
        Lf3:
            com.flextv.livestore.helper.PreferenceHelper r5 = r4.preferenceHelper
            java.lang.String r5 = r5.getSharedPreferenceServerUrl()
            com.flextv.livestore.helper.PreferenceHelper r0 = r4.preferenceHelper
            java.lang.String r0 = r0.getSharedPreferenceUsername()
            com.flextv.livestore.helper.PreferenceHelper r1 = r4.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferencePassword()
            com.flextv.livestore.models.MovieModel r2 = r4.currentMovie
            java.lang.String r2 = r2.getStream_id()
            com.flextv.livestore.models.MovieModel r3 = r4.currentMovie
            java.lang.String r3 = r3.getExtension()
            java.lang.String r5 = com.flextv.livestore.helper.GetSharedInfo.getMovieUrl(r5, r0, r1, r2, r3)
            r4.cont_url = r5
        L117:
            com.flextv.livestore.models.MovieModel r5 = r4.currentMovie
            long r0 = r5.getTime()
            r4.last_position = r0
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L12b
            java.lang.String r5 = r4.cont_url
            r4.showResumeDlgFragment(r5)
            goto L139
        L12b:
            androidx.constraintlayout.widget.ConstraintLayout r5 = r4.ly_control
            r0 = 0
            r5.setVisibility(r0)
            java.lang.String r5 = r4.cont_url
            r4.playVideo(r5, r2)
            r4.listTimer()
        L139:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
            r2 = this;
            super.onPause()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 > r1) goto L13
            com.google.android.exoplayer2.ui.StyledPlayerView r0 = r2.playerView
            if (r0 == 0) goto L10
            r0.onPause()
        L10:
            r2.releaseMediaPlayer()
        L13:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar r4, int r5, boolean r6) {
            r3 = this;
            int r0 = r4.getId()
            r1 = 2131427450(0x7f0b007a, float:1.8476517E38)
            r2 = 0
            if (r0 == r1) goto L62
            r1 = 2131428135(0x7f0b0327, float:1.8477906E38)
            if (r0 == r1) goto L28
            r4 = 2131428387(0x7f0b0423, float:1.8478417E38)
            if (r0 == r4) goto L16
            goto Lbd
        L16:
            android.media.AudioManager r4 = r3.audioManager
            r6 = 3
            int r4 = r4.getStreamMaxVolume(r6)
            int r4 = r4 * r5
            int r4 = r4 / 100
            android.media.AudioManager r5 = r3.audioManager
            r5.setStreamVolume(r6, r4, r2)
            goto Lbd
        L28:
            com.google.android.exoplayer2.ExoPlayer r0 = r3.player
            if (r0 == 0) goto Lbd
            if (r6 == 0) goto Lbd
            android.os.Handler r6 = r3.handler
            java.lang.Runnable r0 = r3.mUpdateTimeTask
            r6.removeCallbacks(r0)
            r4.setProgress(r5)
            com.google.android.exoplayer2.ExoPlayer r4 = r3.player
            long r0 = r4.getDuration()
            long r4 = (long) r5
            long r0 = r0 * r4
            r4 = 100
            long r0 = r0 / r4
            int r4 = (int) r0
            com.google.android.exoplayer2.ExoPlayer r5 = r3.player
            long r0 = (long) r4
            r5.seekTo(r0)
            android.widget.TextView r4 = r3.txt_start_time
            java.lang.String r5 = ""
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.String r6 = com.flextv.livestore.utils.Utils.milliSecondsToTimer(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.setText(r5)
            goto Lbd
        L62:
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r4 < r6) goto Lbd
            boolean r4 = android.provider.Settings.System.canWrite(r3)
            if (r4 != 0) goto L98
            boolean r4 = r3.is_system_setting
            if (r4 != 0) goto Lbd
            r4 = 1
            r3.is_system_setting = r4
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.settings.action.MANAGE_WRITE_SETTINGS"
            r4.<init>(r5)
            java.lang.String r5 = "package:"
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.String r6 = r3.getPackageName()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r4.setData(r5)
            r3.startActivity(r4)
            goto Lbd
        L98:
            android.content.ContentResolver r4 = r3.getContentResolver()
            java.lang.String r6 = "screen_brightness_mode"
            android.provider.Settings.System.putInt(r4, r6, r2)
            android.content.ContentResolver r4 = r3.getContentResolver()
            java.lang.String r6 = "screen_brightness"
            android.provider.Settings.System.putInt(r4, r6, r5)
            android.view.Window r4 = r3.getWindow()
            android.view.WindowManager$LayoutParams r6 = r4.getAttributes()
            float r5 = (float) r5
            r0 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r0
            r6.screenBrightness = r5
            r4.setAttributes(r6)
        Lbd:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
            r2 = this;
            super.onStop()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 <= r1) goto L13
            com.google.android.exoplayer2.ui.StyledPlayerView r0 = r2.playerView
            if (r0 == 0) goto L10
            r0.onPause()
        L10:
            r2.releaseMediaPlayer()
        L13:
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

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
            r0 = this;
            super.onUserLeaveHint()
            r0.releaseMediaPlayer()
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
