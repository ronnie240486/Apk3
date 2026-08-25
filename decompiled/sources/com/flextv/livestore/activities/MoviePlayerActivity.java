package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes.dex */
public class MoviePlayerActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener, android.view.View.OnFocusChangeListener, android.widget.SeekBar.OnSeekBarChangeListener, com.flextv.livestore.remote.GetSubtitleDataRequest.OnGetResponseListener, com.flextv.livestore.remote.GetSubtitleLinkRequest.OnGetLinkModelListener {
    public int audio_position;
    public android.widget.ImageButton btn_audio;
    public android.widget.ImageButton btn_back;
    public android.widget.ImageButton btn_forward;
    public android.widget.ImageButton btn_info;
    public android.widget.ImageButton btn_play;
    public android.widget.ImageButton btn_resolution;
    public android.widget.ImageButton btn_rewind;
    public android.widget.ImageButton btn_sub;
    public java.lang.String cont_url;
    public com.flextv.livestore.models.MovieModel currentMovie;
    public com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
    public java.lang.String description;
    public int duration;
    public com.flextv.livestore.dlgfragment.PlayErrorDlgFragment errorDlgFragment;
    public int error_count;
    public com.flextv.livestore.dlgfragment.ExitDlgFragment exitDlgFragment;
    public android.os.Handler handler;
    public com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda3 hideInfoTicker;
    public com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda3 hideResolutionTicker;
    public android.widget.ImageView image_forward;
    public android.widget.ImageView image_rewind;
    public com.flextv.livestore.dlgfragment.MovieInfoDlgFragment infoDlgFragment;
    public long last_position;
    public androidx.constraintlayout.widget.ConstraintLayout ly_control;
    private final java.lang.Runnable mUpdateTimeTask;
    public int maxTime;
    public java.lang.String movie_name;
    public com.google.android.exoplayer2.MediaItem playMediaItem;
    public com.google.android.exoplayer2.ExoPlayer player;
    public com.google.android.exoplayer2.ui.StyledPlayerView playerView;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public java.lang.String resolution;
    public int resolutionTime;
    public com.flextv.livestore.dlgfragment.ExitDlgFragment resumeDlgFragment;
    public android.widget.SeekBar seekBar;
    public java.lang.String stream_id;
    public com.flextv.livestore.view.SubtitleView subtitleView;
    public int subtitle_position;
    public java.lang.String tmdb_id;
    public com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters;
    public com.google.android.exoplayer2.trackselection.DefaultTrackSelector trackSelector;
    public android.widget.TextView txt_end_time;
    public android.widget.TextView txt_name;
    public android.widget.TextView txt_resolution;
    public android.widget.TextView txt_start_time;
    public com.flextv.livestore.models.WordModels wordModels;






    public class PlayerEventListener implements com.google.android.exoplayer2.Player.Listener {
        public final /* synthetic */ com.flextv.livestore.activities.MoviePlayerActivity this$0;

        private PlayerEventListener(com.flextv.livestore.activities.MoviePlayerActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ PlayerEventListener(com.flextv.livestore.activities.MoviePlayerActivity r1, com.flextv.livestore.activities.MoviePlayerActivity.AnonymousClass1 r2) {
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
                com.flextv.livestore.activities.MoviePlayerActivity r4 = r3.this$0
                com.flextv.livestore.activities.MoviePlayerActivity.access$200(r4)
                com.flextv.livestore.activities.MoviePlayerActivity r4 = r3.this$0
                java.lang.String r0 = r4.cont_url
                r1 = 0
                com.flextv.livestore.activities.MoviePlayerActivity.access$300(r4, r0, r1)
                goto L44
            L12:
                r0 = 3
                if (r4 != r0) goto L29
                com.flextv.livestore.activities.MoviePlayerActivity r4 = r3.this$0
                r0 = 0
                r4.error_count = r0
                android.widget.ImageView r4 = r4.image_forward
                r0 = 8
                r4.setVisibility(r0)
                com.flextv.livestore.activities.MoviePlayerActivity r4 = r3.this$0
                android.widget.ImageView r4 = r4.image_rewind
                r4.setVisibility(r0)
                goto L44
            L29:
                r0 = 2
                if (r4 != r0) goto L44
                com.flextv.livestore.activities.MoviePlayerActivity r4 = r3.this$0
                androidx.constraintlayout.widget.ConstraintLayout r4 = r4.ly_control
                int r4 = r4.getVisibility()
                if (r4 != 0) goto L44
                com.flextv.livestore.activities.MoviePlayerActivity r4 = r3.this$0
                android.os.Handler r0 = r4.handler
                com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda3 r4 = r4.hideInfoTicker
                r0.removeCallbacks(r4)
                com.flextv.livestore.activities.MoviePlayerActivity r4 = r3.this$0
                com.flextv.livestore.activities.MoviePlayerActivity.access$400(r4)
            L44:
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
                if (r5 != r2) goto L25
                com.flextv.livestore.activities.MoviePlayerActivity r5 = r4.this$0
                android.widget.ImageView r5 = r5.image_forward
                r2 = 8
                r5.setVisibility(r2)
                com.flextv.livestore.activities.MoviePlayerActivity r5 = r4.this$0
                android.widget.ImageView r5 = r5.image_rewind
                r5.setVisibility(r2)
                com.flextv.livestore.activities.MoviePlayerActivity r5 = r4.this$0
                com.flextv.livestore.activities.MoviePlayerActivity.access$200(r5)
                com.flextv.livestore.activities.MoviePlayerActivity r5 = r4.this$0
                java.lang.String r2 = r5.cont_url
                com.flextv.livestore.activities.MoviePlayerActivity.access$300(r5, r2, r0)
                goto L43
            L25:
                com.flextv.livestore.activities.MoviePlayerActivity r5 = r4.this$0
                int r2 = r5.error_count
                r3 = 3
                if (r2 <= r3) goto L35
                com.flextv.livestore.activities.MoviePlayerActivity.access$200(r5)
                com.flextv.livestore.activities.MoviePlayerActivity r5 = r4.this$0
                com.flextv.livestore.activities.MoviePlayerActivity.access$500(r5)
                goto L43
            L35:
                int r2 = r2 + 1
                r5.error_count = r2
                com.flextv.livestore.activities.MoviePlayerActivity.access$200(r5)
                com.flextv.livestore.activities.MoviePlayerActivity r5 = r4.this$0
                java.lang.String r2 = r5.cont_url
                com.flextv.livestore.activities.MoviePlayerActivity.access$300(r5, r2, r0)
            L43:
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

    public static /* synthetic */ void $r8$lambda$4AYq7vUQrYToPJ8T6Idt_SKh18M(com.flextv.livestore.activities.MoviePlayerActivity r0, java.util.List r1, java.util.List r2, int r3) {
            r0.lambda$showOpenSubtitleDlgFragment$6(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$UpPfQ4fbO3F_f_H1CP2ntv1QimI(com.flextv.livestore.activities.MoviePlayerActivity r0) {
            r0.lambda$releaseMediaPlayer$0()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ZaKVQHyf91jgnfN7ToGOl-QEK-I, reason: not valid java name */
    public static /* synthetic */ void m63$r8$lambda$ZaKVQHyf91jgnfN7ToGOlQEKI(com.flextv.livestore.activities.MoviePlayerActivity r0) {
            r0.lambda$releaseMediaPlayer$1()
            return
    }

    public static /* synthetic */ void $r8$lambda$iAdV3hboU9SDIR72I1rGlr_IJg4(com.flextv.livestore.activities.MoviePlayerActivity r0) {
            r0.lambda$resolutionTimer$3()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$o6wJ-vSwopXR8WyjG5WL-EDHcXo, reason: not valid java name */
    public static /* synthetic */ void m64$r8$lambda$o6wJvSwopXR8WyjG5WLEDHcXo(com.flextv.livestore.activities.MoviePlayerActivity r0, java.util.List r1, com.google.android.exoplayer2.source.TrackGroupArray r2, int r3, int r4) {
            r0.lambda$showSubTitleTrackDlgFragment$5(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$sVmlndjuQE27gR1mq5BElVRh58A(com.flextv.livestore.activities.MoviePlayerActivity r0, java.util.List r1, com.google.android.exoplayer2.source.TrackGroupArray r2, int r3, int r4) {
            r0.lambda$showAudioTrackDlgFragment$4(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$vBrnhzpJhfqSldWYXTmZcDmWDnw(com.flextv.livestore.activities.MoviePlayerActivity r0) {
            r0.lambda$listTimer$2()
            return
    }

    static {
            java.lang.Class<com.flextv.livestore.activities.MoviePlayerActivity> r0 = com.flextv.livestore.activities.MoviePlayerActivity.class
            return
    }

    public MoviePlayerActivity() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.cont_url = r0
            r2.movie_name = r0
            r2.tmdb_id = r0
            r2.stream_id = r0
            r0 = 0
            r2.last_position = r0
            r0 = 0
            r2.error_count = r0
            r2.duration = r0
            r1 = -1
            r2.subtitle_position = r1
            r2.audio_position = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.handler = r0
            java.lang.String r0 = "1920x1080"
            r2.resolution = r0
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r2.wordModels = r0
            com.flextv.livestore.activities.MoviePlayerActivity$2 r0 = new com.flextv.livestore.activities.MoviePlayerActivity$2
            r0.<init>(r2)
            r2.mUpdateTimeTask = r0
            return
    }

    public static /* synthetic */ java.lang.Runnable access$100(com.flextv.livestore.activities.MoviePlayerActivity r0) {
            java.lang.Runnable r0 = r0.mUpdateTimeTask
            return r0
    }

    public static /* synthetic */ void access$200(com.flextv.livestore.activities.MoviePlayerActivity r0) {
            r0.releaseMediaPlayer()
            return
    }

    public static /* synthetic */ void access$300(com.flextv.livestore.activities.MoviePlayerActivity r0, java.lang.String r1, long r2) {
            r0.playVideo(r1, r2)
            return
    }

    public static /* synthetic */ void access$400(com.flextv.livestore.activities.MoviePlayerActivity r0) {
            r0.listTimer()
            return
    }

    public static /* synthetic */ void access$500(com.flextv.livestore.activities.MoviePlayerActivity r0) {
            r0.showPlayErrorDlgFragment()
            return
    }

    private void applySubtitleSelection(com.google.android.exoplayer2.source.TrackGroupArray r5, int r6, int r7, int r8) {
            r4 = this;
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder
            r0.<init>()
            r1 = -1
            if (r7 == r1) goto L1a
            if (r8 != r1) goto Lb
            goto L1a
        Lb:
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride r1 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride
            r2 = 1
            int[] r2 = new int[r2]
            r3 = 0
            r2[r3] = r8
            r1.<init>(r7, r2)
            r0.setSelectionOverride(r6, r5, r1)
            goto L1d
        L1a:
            r0.clearSelectionOverrides(r6)
        L1d:
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r5 = r0.build()
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r6 = r4.trackSelector
            r6.setParameters(r5)
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

    private void downloadSubtitleFromApi(int r5) {
            r4 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r4.preferenceHelper
            com.flextv.livestore.models.SubTitleUserModel r0 = r0.getSharedPreferenceSubtitleUserModel()
            if (r0 == 0) goto L2b
            com.flextv.livestore.helper.PreferenceHelper r0 = r4.preferenceHelper
            com.flextv.livestore.models.SubTitleUserModel r0 = r0.getSharedPreferenceSubtitleUserModel()
            java.lang.String r0 = r0.getToken()
            com.flextv.livestore.remote.GetSubtitleLinkRequest r1 = new com.flextv.livestore.remote.GetSubtitleLinkRequest
            r2 = 1000(0x3e8, float:1.401E-42)
            r1.<init>(r4, r2)
            org.json.JSONObject r5 = com.flextv.livestore.utils.Security.getFileData(r5)
            java.lang.String r2 = com.flextv.livestore.apps.Constants.SUBTITLE_DOWNLOAD
            java.lang.String r3 = com.flextv.livestore.apps.Constants.API_KEY
            java.lang.String r3 = r3.trim()
            r1.getResponse(r5, r2, r3, r0)
            r1.setOnGetLinkModelListener(r4)
        L2b:
            return
    }

    private boolean getControlButtonFocus() {
            r1 = this;
            android.widget.ImageButton r0 = r1.btn_rewind
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L1b
            android.widget.ImageButton r0 = r1.btn_play
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L1b
            android.widget.ImageButton r0 = r1.btn_forward
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            return r0
    }

    private boolean getFeatureButtonFocus() {
            r1 = this;
            android.widget.ImageButton r0 = r1.btn_info
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L23
            android.widget.ImageButton r0 = r1.btn_audio
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L23
            android.widget.ImageButton r0 = r1.btn_sub
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L23
            android.widget.ImageButton r0 = r1.btn_resolution
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L21
            goto L23
        L21:
            r0 = 0
            goto L24
        L23:
            r0 = 1
        L24:
            return r0
    }

    private void getOpenSubtitleFromApi() {
            r3 = this;
            com.flextv.livestore.remote.GetSubtitleDataRequest r0 = new com.flextv.livestore.remote.GetSubtitleDataRequest
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.<init>(r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.flextv.livestore.apps.Constants.SUBTITLE_SEARCH
            r1.append(r2)
            java.lang.String r2 = r3.tmdb_id
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = com.flextv.livestore.apps.Constants.API_KEY
            r0.getResponse(r1, r2)
            r0.setOnGetResponseListener(r3)
            return
    }

    private void getSubtitleTrackFromVideo() {
            r9 = this;
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0 = r9.trackSelector
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo r0 = r0.getCurrentMappedTrackInfo()
            r1 = 1
            if (r0 == 0) goto L71
            r2 = 3
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r0.getTrackGroups(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = 0
        L18:
            int r5 = r0.length
            if (r4 >= r5) goto L42
            com.google.android.exoplayer2.source.TrackGroup r5 = r0.get(r4)
            r6 = 0
        L21:
            int r7 = r5.length
            if (r6 >= r7) goto L3f
            com.google.android.exoplayer2.Format r7 = r5.getFormat(r6)
            java.lang.String r8 = r7.language
            if (r8 == 0) goto L3c
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L3c
            java.lang.String r7 = r7.language
            java.lang.String r7 = com.flextv.livestore.utils.Utils.getLanguageNameFromCode(r7)
            r2.add(r7)
        L3c:
            int r6 = r6 + 1
            goto L21
        L3f:
            int r4 = r4 + 1
            goto L18
        L42:
            java.lang.String r3 = "None"
            r2.add(r3)
            int r3 = r2.size()
            if (r3 <= r1) goto L51
            r9.showSubTitleTrackDlgFragment(r0, r2)
            goto L90
        L51:
            java.lang.String r0 = r9.tmdb_id
            if (r0 == 0) goto L5f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5f
            r9.getOpenSubtitleFromApi()
            goto L90
        L5f:
            android.content.Context r0 = r9.getApplicationContext()
            com.flextv.livestore.models.WordModels r2 = r9.wordModels
            java.lang.String r2 = r2.getNo_subtitle()
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
            goto L90
        L71:
            java.lang.String r0 = r9.tmdb_id
            if (r0 == 0) goto L7f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L7f
            r9.getOpenSubtitleFromApi()
            goto L90
        L7f:
            android.content.Context r0 = r9.getApplicationContext()
            com.flextv.livestore.models.WordModels r2 = r9.wordModels
            java.lang.String r2 = r2.getNo_subtitle()
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
        L90:
            return
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
            r0 = 2131428220(0x7f0b037c, float:1.8478078E38)
            android.view.View r0 = r9.findViewById(r0)
            com.flextv.livestore.view.SubtitleView r0 = (com.flextv.livestore.view.SubtitleView) r0
            r9.subtitleView = r0
            r1 = 8
            r0.setVisibility(r1)
            com.google.android.exoplayer2.ui.CaptionStyleCompat r0 = new com.google.android.exoplayer2.ui.CaptionStyleCompat
            com.flextv.livestore.helper.PreferenceHelper r1 = r9.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceSubtitleColor()
            int r3 = android.graphics.Color.parseColor(r1)
            com.flextv.livestore.helper.PreferenceHelper r1 = r9.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceSubtitleBgColor()
            int r4 = android.graphics.Color.parseColor(r1)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.google.android.exoplayer2.ui.StyledPlayerView r1 = r9.playerView
            com.google.android.exoplayer2.ui.SubtitleView r1 = r1.getSubtitleView()
            com.flextv.livestore.helper.PreferenceHelper r2 = r9.preferenceHelper
            int r2 = r2.getSharedPreferenceSubtitleSize()
            float r2 = (float) r2
            r3 = 3
            r1.setFixedTextSize(r3, r2)
            com.google.android.exoplayer2.ui.StyledPlayerView r1 = r9.playerView
            com.google.android.exoplayer2.ui.SubtitleView r1 = r1.getSubtitleView()
            r1.setStyle(r0)
            com.flextv.livestore.view.SubtitleView r0 = r9.subtitleView
            com.flextv.livestore.helper.PreferenceHelper r1 = r9.preferenceHelper
            int r1 = r1.getSharedPreferenceSubtitleSize()
            float r1 = (float) r1
            r0.setTextSize(r3, r1)
            com.flextv.livestore.view.SubtitleView r0 = r9.subtitleView
            com.flextv.livestore.helper.PreferenceHelper r1 = r9.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceSubtitleBgColor()
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setBackgroundColor(r1)
            com.flextv.livestore.view.SubtitleView r0 = r9.subtitleView
            com.flextv.livestore.helper.PreferenceHelper r1 = r9.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceSubtitleColor()
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            r0 = 2131427901(0x7f0b023d, float:1.8477431E38)
            android.view.View r0 = r9.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r9.ly_control = r0
            r0 = 2131427464(0x7f0b0088, float:1.8476545E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r9.btn_back = r0
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
            r0 = 2131428345(0x7f0b03f9, float:1.8478332E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.txt_start_time = r0
            r0 = 2131428303(0x7f0b03cf, float:1.8478247E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.txt_end_time = r0
            r0 = 2131427799(0x7f0b01d7, float:1.8477224E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.image_forward = r0
            r0 = 2131427812(0x7f0b01e4, float:1.847725E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.image_rewind = r0
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.txt_name = r0
            r0 = 2131428338(0x7f0b03f2, float:1.8478318E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.txt_resolution = r0
            r0 = 2131428135(0x7f0b0327, float:1.8477906E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            r9.seekBar = r0
            r1 = 100
            r0.setMax(r1)
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
            android.widget.ImageButton r0 = r9.btn_rewind
            r0.setOnFocusChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_play
            r0.setOnFocusChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_forward
            r0.setOnFocusChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_info
            r0.setOnFocusChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_sub
            r0.setOnFocusChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_audio
            r0.setOnFocusChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_resolution
            r0.setOnFocusChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_back
            r0.setOnFocusChangeListener(r9)
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

    private /* synthetic */ void lambda$resolutionTimer$3() {
            r2 = this;
            int r0 = r2.resolutionTime
            r1 = 1
            if (r0 >= r1) goto Ld
            android.widget.TextView r0 = r2.txt_resolution
            r1 = 8
            r0.setVisibility(r1)
            return
        Ld:
            r2.runNextResolutionTicker()
            return
    }

    private /* synthetic */ void lambda$showAudioTrackDlgFragment$4(java.util.List r3, com.google.android.exoplayer2.source.TrackGroupArray r4, int r5, int r6) {
            r2 = this;
            r2.audio_position = r6
            int r3 = r3.size()
            int r3 = r3 + (-1)
            if (r6 != r3) goto L13
            com.google.android.exoplayer2.ExoPlayer r3 = r2.player
            if (r3 == 0) goto L34
            r4 = 0
            r3.setVolume(r4)
            goto L34
        L13:
            r3 = 0
            r0 = r6
            r6 = 0
        L16:
            int r1 = r4.length
            if (r3 >= r1) goto L28
            com.google.android.exoplayer2.source.TrackGroup r1 = r4.get(r3)
            int r1 = r1.length
            if (r0 < r1) goto L28
            int r0 = r0 - r1
            int r6 = r6 + 1
            int r3 = r3 + 1
            goto L16
        L28:
            com.google.android.exoplayer2.ExoPlayer r3 = r2.player
            if (r3 == 0) goto L31
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.setVolume(r1)
        L31:
            r2.applySubtitleSelection(r4, r5, r6, r0)
        L34:
            return
    }

    private /* synthetic */ void lambda$showOpenSubtitleDlgFragment$6(java.util.List r2, java.util.List r3, int r4) {
            r1 = this;
            r1.subtitle_position = r4
            int r2 = r2.size()
            r0 = 1
            int r2 = r2 - r0
            if (r4 != r2) goto L11
            r2 = 0
            r3 = 3
            r4 = -1
            r1.applySubtitleSelection(r2, r3, r4, r4)
            goto L57
        L11:
            int r2 = r1.subtitle_position
            java.lang.Object r2 = r3.get(r2)
            com.flextv.livestore.models.SubtitleModel$DataModel r2 = (com.flextv.livestore.models.SubtitleModel.DataModel) r2
            com.flextv.livestore.models.SubtitleModel$AttributesModel r2 = r2.getAttributesModel()
            java.util.List r2 = r2.getFileModels()
            int r2 = r2.size()
            if (r2 <= 0) goto L46
            int r2 = r1.subtitle_position
            java.lang.Object r2 = r3.get(r2)
            com.flextv.livestore.models.SubtitleModel$DataModel r2 = (com.flextv.livestore.models.SubtitleModel.DataModel) r2
            com.flextv.livestore.models.SubtitleModel$AttributesModel r2 = r2.getAttributesModel()
            java.util.List r2 = r2.getFileModels()
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.flextv.livestore.models.SubtitleModel$FileModel r2 = (com.flextv.livestore.models.SubtitleModel.FileModel) r2
            int r2 = r2.getFile_id()
            r1.downloadSubtitleFromApi(r2)
            goto L57
        L46:
            android.content.Context r2 = r1.getApplicationContext()
            com.flextv.livestore.models.WordModels r3 = r1.wordModels
            java.lang.String r3 = r3.getNo_subtitle()
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
            r2.show()
        L57:
            return
    }

    private /* synthetic */ void lambda$showSubTitleTrackDlgFragment$5(java.util.List r3, com.google.android.exoplayer2.source.TrackGroupArray r4, int r5, int r6) {
            r2 = this;
            r2.subtitle_position = r6
            int r3 = r3.size()
            int r3 = r3 + (-1)
            if (r6 != r3) goto Lf
            r3 = -1
            r2.applySubtitleSelection(r4, r5, r3, r3)
            goto L27
        Lf:
            r3 = 0
            r0 = r6
            r6 = 0
        L12:
            int r1 = r4.length
            if (r3 >= r1) goto L24
            com.google.android.exoplayer2.source.TrackGroup r1 = r4.get(r3)
            int r1 = r1.length
            if (r0 < r1) goto L24
            int r0 = r0 - r1
            int r6 = r6 + 1
            int r3 = r3 + 1
            goto L12
        L24:
            r2.applySubtitleSelection(r4, r5, r6, r0)
        L27:
            return
    }

    private void listTimer() {
            r2 = this;
            r0 = 10
            r2.maxTime = r0
            com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda3 r0 = new com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda3
            r1 = 1
            r0.<init>(r2, r1)
            r2.hideInfoTicker = r0
            r0.run()
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
            r4.playMediaItem = r5
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r5 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector
            r5.<init>(r4)
            r4.trackSelector = r5
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0 = r4.trackSelectionParameters
            r5.setParameters(r0)
            com.google.android.exoplayer2.ExoPlayer$Builder r5 = new com.google.android.exoplayer2.ExoPlayer$Builder
            r5.<init>(r4)
            com.google.android.exoplayer2.source.MediaSource$Factory r0 = r4.createMediaSourceFactory()
            com.google.android.exoplayer2.ExoPlayer$Builder r5 = r5.setMediaSourceFactory(r0)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0 = r4.trackSelector
            com.google.android.exoplayer2.ExoPlayer$Builder r5 = r5.setTrackSelector(r0)
            r0 = 1
            r4.setRenderersFactory(r5, r0)
            com.google.android.exoplayer2.ExoPlayer r5 = r5.build()
            r4.player = r5
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1 = r4.trackSelectionParameters
            r5.setTrackSelectionParameters(r1)
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            com.flextv.livestore.activities.MoviePlayerActivity$PlayerEventListener r1 = new com.flextv.livestore.activities.MoviePlayerActivity$PlayerEventListener
            r2 = 0
            r1.<init>(r4, r2)
            r5.addListener(r1)
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            com.google.android.exoplayer2.util.EventLogger r1 = new com.google.android.exoplayer2.util.EventLogger
            r1.<init>()
            r5.addAnalyticsListener(r1)
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            com.flextv.livestore.activities.MoviePlayerActivity$1 r1 = new com.flextv.livestore.activities.MoviePlayerActivity$1
            r1.<init>(r4)
            r5.addAnalyticsListener(r1)
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            com.google.android.exoplayer2.audio.AudioAttributes r1 = com.google.android.exoplayer2.audio.AudioAttributes.DEFAULT
            r5.setAudioAttributes(r1, r0)
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            r5.setPlayWhenReady(r0)
            com.google.android.exoplayer2.ui.StyledPlayerView r5 = r4.playerView
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            r5.setPlayer(r0)
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            com.google.android.exoplayer2.MediaItem r0 = r4.playMediaItem
            r5.setMediaItem(r0)
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            r5.prepare()
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            r5.play()
            r0 = 0
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 <= 0) goto Lbb
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            r5.seekTo(r6)
        Lbb:
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
            com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda2 r10 = new com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda2
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
            com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda2 r1 = new com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda2
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

    private void resolutionTimer() {
            r2 = this;
            r0 = 2
            r2.resolutionTime = r0
            com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda3 r0 = new com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda3
            r1 = 0
            r0.<init>(r2, r1)
            r2.hideResolutionTicker = r0
            r0.run()
            return
    }

    private void runNextResolutionTicker() {
            r4 = this;
            int r0 = r4.resolutionTime
            int r0 = r0 + (-1)
            r4.resolutionTime = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            android.os.Handler r2 = r4.handler
            com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda3 r3 = r4.hideResolutionTicker
            r2.postAtTime(r3, r0)
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
            com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda3 r3 = r4.hideInfoTicker
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
            r11 = this;
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0 = r11.trackSelector
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo r0 = r0.getCurrentMappedTrackInfo()
            if (r0 == 0) goto L63
            r1 = 1
            com.google.android.exoplayer2.source.TrackGroupArray r5 = r0.getTrackGroups(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L16:
            int r2 = r5.length
            if (r1 >= r2) goto L36
            com.google.android.exoplayer2.source.TrackGroup r2 = r5.get(r1)
            r3 = 0
        L1f:
            int r4 = r2.length
            if (r3 >= r4) goto L33
            com.google.android.exoplayer2.Format r4 = r2.getFormat(r3)
            java.lang.String r4 = r4.language
            java.lang.String r4 = com.flextv.livestore.utils.Utils.getLanguageNameFromCode(r4)
            r0.add(r4)
            int r3 = r3 + 1
            goto L1f
        L33:
            int r1 = r1 + 1
            goto L16
        L36:
            java.lang.String r1 = "None"
            r0.add(r1)
            androidx.fragment.app.FragmentManager r1 = r11.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r2 = r1.beginTransaction()
            java.lang.String r8 = "fragment_audio"
            androidx.fragment.app.Fragment r3 = r1.findFragmentByTag(r8)
            if (r3 == 0) goto L50
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r3, r0)
            return
        L50:
            int r9 = r11.audio_position
            com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda1 r10 = new com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda1
            r7 = 1
            r6 = 1
            r2 = r10
            r3 = r11
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            com.flextv.livestore.dlgfragment.AudioTrackDlgFragment r0 = com.flextv.livestore.dlgfragment.AudioTrackDlgFragment.newInstance(r11, r0, r9, r10)
            r0.show(r1, r8)
        L63:
            return
    }

    private void showDefaultAudioTrackDlgFragment() {
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
            com.flextv.livestore.activities.MoviePlayerActivity$4 r3 = new com.flextv.livestore.activities.MoviePlayerActivity$4
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

    private void showOpenSubtitleDlgFragment(java.util.List<com.flextv.livestore.models.SubtitleModel.DataModel> r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            com.flextv.livestore.models.SubtitleModel$DataModel r2 = (com.flextv.livestore.models.SubtitleModel.DataModel) r2
            com.flextv.livestore.models.SubtitleModel$AttributesModel r2 = r2.getAttributesModel()
            java.lang.String r2 = r2.getLanguage()
            java.lang.String r2 = com.flextv.livestore.utils.Utils.getLanguageNameFromCode(r2)
            r0.add(r2)
            goto L9
        L25:
            java.lang.String r1 = "None"
            r0.add(r1)
            androidx.fragment.app.FragmentManager r1 = r6.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r2 = r1.beginTransaction()
            java.lang.String r3 = "fragment_subtitle"
            androidx.fragment.app.Fragment r4 = r1.findFragmentByTag(r3)
            if (r4 == 0) goto L3f
            r7 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r4, r7)
            return
        L3f:
            int r2 = r6.subtitle_position
            com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda0
            r5 = 0
            r4.<init>(r6, r0, r7, r5)
            com.flextv.livestore.dlgfragment.SubtitleTrackDlgFragment r7 = com.flextv.livestore.dlgfragment.SubtitleTrackDlgFragment.newInstance(r6, r0, r2, r4)
            r7.show(r1, r3)
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
            com.flextv.livestore.activities.MoviePlayerActivity$5 r3 = new com.flextv.livestore.activities.MoviePlayerActivity$5
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
            com.flextv.livestore.activities.MoviePlayerActivity$3 r3 = new com.flextv.livestore.activities.MoviePlayerActivity$3
            r3.<init>(r6, r7)
            r1.setOkButtonClickListener(r3)
            com.flextv.livestore.dlgfragment.ExitDlgFragment r7 = r6.resumeDlgFragment
            r7.show(r0, r2)
            return
    }

    private void showSubTitleTrackDlgFragment(com.google.android.exoplayer2.source.TrackGroupArray r11, java.util.List<java.lang.String> r12) {
            r10 = this;
            androidx.fragment.app.FragmentManager r0 = r10.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_subtitle"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r11 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r11)
            return
        L15:
            int r1 = r10.subtitle_position
            com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda1 r9 = new com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda1
            r8 = 0
            r7 = 3
            r3 = r9
            r4 = r10
            r5 = r12
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            com.flextv.livestore.dlgfragment.SubtitleTrackDlgFragment r11 = com.flextv.livestore.dlgfragment.SubtitleTrackDlgFragment.newInstance(r10, r12, r1, r9)
            r11.show(r0, r2)
            return
    }

    @Override // com.flextv.livestore.remote.GetSubtitleLinkRequest.OnGetLinkModelListener
    public void OnGetLinkModelResult(org.json.JSONObject r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L32
            com.google.gson.Gson r3 = new com.google.gson.Gson
            r3.<init>()
            java.lang.String r2 = r2.toString()
            java.lang.Class<com.flextv.livestore.models.SubtitleLinkModel> r0 = com.flextv.livestore.models.SubtitleLinkModel.class
            java.lang.Object r2 = r3.fromJson(r2, r0)
            com.flextv.livestore.models.SubtitleLinkModel r2 = (com.flextv.livestore.models.SubtitleLinkModel) r2
            com.google.android.exoplayer2.ExoPlayer r3 = r1.player
            if (r3 == 0) goto L44
            com.google.android.exoplayer2.MediaItem r3 = r1.playMediaItem
            if (r3 == 0) goto L44
            com.flextv.livestore.view.SubtitleView r3 = r1.subtitleView
            r0 = 0
            r3.setVisibility(r0)
            com.flextv.livestore.view.SubtitleView r3 = r1.subtitleView
            com.google.android.exoplayer2.ExoPlayer r0 = r1.player
            r3.setPlayer(r0)
            com.flextv.livestore.view.SubtitleView r3 = r1.subtitleView
            java.lang.String r2 = r2.getLink()
            r3.setSubSource(r2)
            goto L44
        L32:
            android.content.Context r2 = r1.getApplicationContext()
            com.flextv.livestore.models.WordModels r3 = r1.wordModels
            java.lang.String r3 = r3.getNo_subtitle()
            r0 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
            r2.show()
        L44:
            return
    }

    @Override // com.flextv.livestore.remote.GetSubtitleDataRequest.OnGetResponseListener
    public void OnGetResponseResult(org.json.JSONObject r3, int r4) {
            r2 = this;
            r4 = 1
            if (r3 == 0) goto L4e
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L3c
            r0.<init>()     // Catch: java.lang.Exception -> L3c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L3c
            java.lang.Class<com.flextv.livestore.models.SubtitleModel> r1 = com.flextv.livestore.models.SubtitleModel.class
            java.lang.Object r3 = r0.fromJson(r3, r1)     // Catch: java.lang.Exception -> L3c
            com.flextv.livestore.models.SubtitleModel r3 = (com.flextv.livestore.models.SubtitleModel) r3     // Catch: java.lang.Exception -> L3c
            java.util.List r0 = r3.getDataModels()     // Catch: java.lang.Exception -> L3c
            int r0 = r0.size()     // Catch: java.lang.Exception -> L3c
            if (r0 <= 0) goto L2a
            java.util.List r3 = r3.getDataModels()     // Catch: java.lang.Exception -> L3c
            java.util.List r3 = com.flextv.livestore.helper.GetSharedInfo.getUniqueSubtitleModels(r3)     // Catch: java.lang.Exception -> L3c
            r2.showOpenSubtitleDlgFragment(r3)     // Catch: java.lang.Exception -> L3c
            goto L5f
        L2a:
            android.content.Context r3 = r2.getApplicationContext()     // Catch: java.lang.Exception -> L3c
            com.flextv.livestore.models.WordModels r0 = r2.wordModels     // Catch: java.lang.Exception -> L3c
            java.lang.String r0 = r0.getNo_subtitle()     // Catch: java.lang.Exception -> L3c
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r4)     // Catch: java.lang.Exception -> L3c
            r3.show()     // Catch: java.lang.Exception -> L3c
            goto L5f
        L3c:
            android.content.Context r3 = r2.getApplicationContext()
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getNo_subtitle()
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r4)
            r3.show()
            goto L5f
        L4e:
            android.content.Context r3 = r2.getApplicationContext()
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getNo_subtitle()
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r4)
            r3.show()
        L5f:
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
            r5 = this;
            int r0 = r6.getAction()
            if (r0 != 0) goto L114
            int r0 = r6.getKeyCode()
            r1 = 4
            r2 = 8
            r3 = 1
            if (r0 == r1) goto Lf2
            r1 = 85
            r4 = 0
            if (r0 == r1) goto Lcc
            r1 = 89
            if (r0 == r1) goto Lbb
            r1 = 90
            if (r0 == r1) goto Laa
            switch(r0) {
                case 19: goto L84;
                case 20: goto L3f;
                case 21: goto Lbb;
                case 22: goto Laa;
                case 23: goto L22;
                default: goto L20;
            }
        L20:
            goto L114
        L22:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L114
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.ly_control
            r6.setVisibility(r4)
            android.widget.ImageButton r6 = r5.btn_play
            r6.requestFocus()
            android.os.Handler r6 = r5.handler
            com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda3 r0 = r5.hideInfoTicker
            r6.removeCallbacks(r0)
            r5.listTimer()
            return r3
        L3f:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L5c
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.ly_control
            r6.setVisibility(r4)
            android.widget.ImageButton r6 = r5.btn_play
            r6.requestFocus()
            android.os.Handler r6 = r5.handler
            com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda3 r0 = r5.hideInfoTicker
            r6.removeCallbacks(r0)
            r5.listTimer()
            return r3
        L5c:
            android.widget.ImageButton r0 = r5.btn_back
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L6a
            android.widget.SeekBar r6 = r5.seekBar
            r6.requestFocus()
            return r3
        L6a:
            android.widget.SeekBar r0 = r5.seekBar
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L78
            android.widget.ImageButton r6 = r5.btn_play
            r6.requestFocus()
            return r3
        L78:
            boolean r0 = r5.getControlButtonFocus()
            if (r0 == 0) goto L114
            android.widget.ImageButton r6 = r5.btn_info
            r6.requestFocus()
            return r3
        L84:
            boolean r0 = r5.getFeatureButtonFocus()
            if (r0 == 0) goto L90
            android.widget.ImageButton r6 = r5.btn_play
            r6.requestFocus()
            return r3
        L90:
            boolean r0 = r5.getControlButtonFocus()
            if (r0 == 0) goto L9c
            android.widget.SeekBar r6 = r5.seekBar
            r6.requestFocus()
            return r3
        L9c:
            android.widget.SeekBar r0 = r5.seekBar
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L114
            android.widget.ImageButton r6 = r5.btn_back
            r6.requestFocus()
            return r3
        Laa:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L114
            android.widget.ImageView r0 = r5.image_forward
            r0.setVisibility(r4)
            r5.seekToForward()
            goto L114
        Lbb:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L114
            android.widget.ImageView r0 = r5.image_rewind
            r0.setVisibility(r4)
            r5.seekToRewind()
            goto L114
        Lcc:
            com.google.android.exoplayer2.ExoPlayer r0 = r5.player
            if (r0 == 0) goto L114
            boolean r0 = r0.getPlayWhenReady()
            if (r0 == 0) goto Le4
            com.google.android.exoplayer2.ExoPlayer r0 = r5.player
            r0.setPlayWhenReady(r4)
            android.widget.ImageButton r0 = r5.btn_play
            r1 = 2131231027(0x7f080133, float:1.8078123E38)
            r0.setImageResource(r1)
            goto L114
        Le4:
            com.google.android.exoplayer2.ExoPlayer r0 = r5.player
            r0.setPlayWhenReady(r3)
            android.widget.ImageButton r0 = r5.btn_play
            r1 = 2131231026(0x7f080132, float:1.8078121E38)
            r0.setImageResource(r1)
            goto L114
        Lf2:
            com.flextv.livestore.dlgfragment.MovieInfoDlgFragment r6 = r5.infoDlgFragment
            if (r6 == 0) goto L102
            boolean r6 = r6.isAdded()
            if (r6 == 0) goto L102
            com.flextv.livestore.dlgfragment.MovieInfoDlgFragment r6 = r5.infoDlgFragment
            r6.dismiss()
            return r3
        L102:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.ly_control
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L110
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.ly_control
            r6.setVisibility(r2)
            return r3
        L110:
            r5.showExitDlgFragment()
            return r3
        L114:
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r4) {
            r3 = this;
            int r4 = r4.getId()
            r0 = 0
            switch(r4) {
                case 2131427463: goto Lbc;
                case 2131427464: goto Lb8;
                case 2131427470: goto Laa;
                case 2131427474: goto L89;
                case 2131427480: goto L62;
                case 2131427484: goto L1e;
                case 2131427486: goto Lf;
                case 2131427489: goto La;
                default: goto L8;
            }
        L8:
            goto Lbf
        La:
            r3.getSubtitleTrackFromVideo()
            goto Lbf
        Lf:
            android.os.Handler r4 = r3.handler
            com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda3 r0 = r3.hideInfoTicker
            r4.removeCallbacks(r0)
            r3.listTimer()
            r3.seekToRewind()
            goto Lbf
        L1e:
            com.google.android.exoplayer2.ExoPlayer r4 = r3.player
            if (r4 == 0) goto Lbf
            boolean r4 = r4.getPlayWhenReady()
            if (r4 == 0) goto Lbf
            com.google.android.exoplayer2.ui.StyledPlayerView r4 = r3.playerView
            int r4 = r4.getResizeMode()
            r1 = 3
            if (r4 != r1) goto L42
            com.google.android.exoplayer2.ui.StyledPlayerView r4 = r3.playerView
            r4.setResizeMode(r0)
            android.widget.TextView r4 = r3.txt_resolution
            com.flextv.livestore.models.WordModels r1 = r3.wordModels
            java.lang.String r1 = r1.getFit_screen()
            r4.setText(r1)
            goto L52
        L42:
            com.google.android.exoplayer2.ui.StyledPlayerView r4 = r3.playerView
            r4.setResizeMode(r1)
            android.widget.TextView r4 = r3.txt_resolution
            com.flextv.livestore.models.WordModels r1 = r3.wordModels
            java.lang.String r1 = r1.getFill_screen()
            r4.setText(r1)
        L52:
            android.widget.TextView r4 = r3.txt_resolution
            r4.setVisibility(r0)
            android.os.Handler r4 = r3.handler
            com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda3 r0 = r3.hideResolutionTicker
            r4.removeCallbacks(r0)
            r3.resolutionTimer()
            goto Lbf
        L62:
            com.google.android.exoplayer2.ExoPlayer r4 = r3.player
            if (r4 == 0) goto Lbf
            boolean r4 = r4.getPlayWhenReady()
            if (r4 == 0) goto L7a
            com.google.android.exoplayer2.ExoPlayer r4 = r3.player
            r4.setPlayWhenReady(r0)
            android.widget.ImageButton r4 = r3.btn_play
            r0 = 2131231027(0x7f080133, float:1.8078123E38)
            r4.setImageResource(r0)
            goto Lbf
        L7a:
            com.google.android.exoplayer2.ExoPlayer r4 = r3.player
            r0 = 1
            r4.setPlayWhenReady(r0)
            android.widget.ImageButton r4 = r3.btn_play
            r0 = 2131231026(0x7f080132, float:1.8078121E38)
            r4.setImageResource(r0)
            goto Lbf
        L89:
            com.flextv.livestore.dlgfragment.MovieInfoDlgFragment r4 = r3.infoDlgFragment
            if (r4 == 0) goto L9a
            boolean r4 = r4.isAdded()
            if (r4 != 0) goto L94
            goto L9a
        L94:
            com.flextv.livestore.dlgfragment.MovieInfoDlgFragment r4 = r3.infoDlgFragment
            r4.dismiss()
            goto Lbf
        L9a:
            java.lang.String r4 = r3.movie_name
            java.lang.String r0 = r3.description
            com.flextv.livestore.models.MovieModel r1 = r3.currentMovie
            java.lang.String r1 = r1.getStream_icon()
            java.lang.String r2 = r3.resolution
            r3.showInfoDlgFragment(r4, r0, r1, r2)
            goto Lbf
        Laa:
            android.os.Handler r4 = r3.handler
            com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda3 r0 = r3.hideInfoTicker
            r4.removeCallbacks(r0)
            r3.listTimer()
            r3.seekToForward()
            goto Lbf
        Lb8:
            r3.showExitDlgFragment()
            goto Lbf
        Lbc:
            r3.showDefaultAudioTrackDlgFragment()
        Lbf:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r5) {
            r4 = this;
            super.onCreate(r5)
            r5 = 2131623980(0x7f0e002c, float:1.8875127E38)
            r4.setContentView(r5)
            com.flextv.livestore.utils.Utils.FullScreenCall(r4)
            com.flextv.livestore.helper.PreferenceHelper r5 = new com.flextv.livestore.helper.PreferenceHelper
            r5.<init>(r4)
            r4.preferenceHelper = r5
            com.flextv.livestore.models.WordModels r5 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r4)
            r4.wordModels = r5
            r4.initView()
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "description"
            java.lang.String r5 = r5.getStringExtra(r0)
            r4.description = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "name"
            java.lang.String r5 = r5.getStringExtra(r0)
            r4.movie_name = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "tmdb_id"
            java.lang.String r5 = r5.getStringExtra(r0)
            r4.tmdb_id = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "stream_id"
            java.lang.String r5 = r5.getStringExtra(r0)
            r4.stream_id = r5
            com.flextv.livestore.helper.PreferenceHelper r5 = r4.preferenceHelper
            boolean r5 = r5.getSharedPreferenceISM3U()
            if (r5 == 0) goto L63
            com.flextv.livestore.helper.RealmController r5 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r0 = r4.movie_name
            com.flextv.livestore.models.MovieModel r5 = r5.getMovieByName(r0)
            r4.currentMovie = r5
            goto L84
        L63:
            java.lang.String r5 = r4.stream_id
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L78
            com.flextv.livestore.helper.RealmController r5 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r0 = r4.movie_name
            com.flextv.livestore.models.MovieModel r5 = r5.getMovieByName(r0)
            r4.currentMovie = r5
            goto L84
        L78:
            com.flextv.livestore.helper.RealmController r5 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r0 = r4.stream_id
            com.flextv.livestore.models.MovieModel r5 = r5.getMovieById(r0)
            r4.currentMovie = r5
        L84:
            java.lang.String r5 = r4.tmdb_id
            if (r5 == 0) goto L8e
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L96
        L8e:
            com.flextv.livestore.models.MovieModel r5 = r4.currentMovie
            java.lang.String r5 = r5.getTmdb_id()
            r4.tmdb_id = r5
        L96:
            android.widget.TextView r5 = r4.txt_name
            java.lang.String r0 = r4.movie_name
            r5.setText(r0)
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
            if (r5 == 0) goto Lcc
            com.flextv.livestore.models.MovieModel r5 = r4.currentMovie
            java.lang.String r5 = r5.getUrl()
            r4.cont_url = r5
            goto Lf0
        Lcc:
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
        Lf0:
            com.flextv.livestore.models.MovieModel r5 = r4.currentMovie
            long r0 = r5.getTime()
            r4.last_position = r0
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L104
            java.lang.String r5 = r4.cont_url
            r4.showResumeDlgFragment(r5)
            goto L112
        L104:
            androidx.constraintlayout.widget.ConstraintLayout r5 = r4.ly_control
            r0 = 0
            r5.setVisibility(r0)
            java.lang.String r5 = r4.cont_url
            r4.playVideo(r5, r2)
            r4.listTimer()
        L112:
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto Lc
            android.os.Handler r1 = r0.handler
            com.flextv.livestore.activities.MoviePlayerActivity$$ExternalSyntheticLambda3 r2 = r0.hideInfoTicker
            r1.removeCallbacks(r2)
            r0.listTimer()
        Lc:
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
    public void onProgressChanged(android.widget.SeekBar r3, int r4, boolean r5) {
            r2 = this;
            com.google.android.exoplayer2.ExoPlayer r0 = r2.player
            if (r0 == 0) goto L32
            if (r5 == 0) goto L32
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
        L32:
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

    public void updateProgressBar() {
            r4 = this;
            android.os.Handler r0 = r4.handler
            java.lang.Runnable r1 = r4.mUpdateTimeTask
            r2 = 100
            r0.postDelayed(r1, r2)
            return
    }
}
