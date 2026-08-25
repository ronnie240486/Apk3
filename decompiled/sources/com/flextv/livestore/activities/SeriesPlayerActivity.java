package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesPlayerActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener, android.view.View.OnFocusChangeListener, android.widget.SeekBar.OnSeekBarChangeListener, com.flextv.livestore.remote.GetSubtitleDataRequest.OnGetResponseListener, com.flextv.livestore.remote.GetSubtitleLinkRequest.OnGetLinkModelListener {
    public com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter adapter;
    public int audio_position;
    public android.widget.ImageButton btn_audio;
    public android.widget.ImageButton btn_back;
    public android.widget.ImageButton btn_forward;
    public android.widget.ImageButton btn_next;
    public android.widget.ImageButton btn_play;
    public android.widget.ImageButton btn_previous;
    public android.widget.ImageButton btn_resolution;
    public android.widget.ImageButton btn_rewind;
    public android.widget.ImageButton btn_sub;
    public android.widget.ImageButton btn_title_setting;
    public java.lang.String contentUrl;
    public com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
    public int duration;
    public java.util.List<com.flextv.livestore.models.EpisodeModel> episodeModels;
    public int episode_focused_position;
    public int episode_position;
    public com.flextv.livestore.dlgfragment.PlayErrorDlgFragment errorDlgFragment;
    public int error_count;
    public com.flextv.livestore.dlgfragment.ExitDlgFragment exitDlgFragment;
    public android.os.Handler handler;
    public com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda1 hideInfoTicker;
    public com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda1 hideResolutionTicker;
    public android.widget.ImageView image_forward;
    public android.widget.ImageView image_rewind;
    public long last_position;
    public androidx.constraintlayout.widget.ConstraintLayout ly_control;
    private final java.lang.Runnable mUpdateTimeTask;
    public int maxTime;
    public java.lang.String name;
    public com.google.android.exoplayer2.ExoPlayer player;
    public com.google.android.exoplayer2.ui.StyledPlayerView playerView;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public androidx.recyclerview.widget.RecyclerView recyclerEpisodes;
    public int resolutionTime;
    public com.flextv.livestore.dlgfragment.ExitDlgFragment resumeDlgFragment;
    public java.lang.String resume_key;
    public java.lang.String season_name;
    public int season_pos;
    public android.widget.SeekBar seekBar;
    public java.lang.String series_name;
    public com.flextv.livestore.view.SubtitleView subtitleView;
    public int subtitle_position;
    public java.lang.String tmdb_id;
    public com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters;
    public com.google.android.exoplayer2.trackselection.DefaultTrackSelector trackSelector;
    public android.widget.TextView txt_end_time;
    public android.widget.TextView txt_name;
    public android.widget.TextView txt_resolution;
    public android.widget.TextView txt_season;
    public android.widget.TextView txt_start_time;
    public com.flextv.livestore.models.WordModels wordModels;





    /* JADX INFO: loaded from: classes.dex */
    public class PlayerEventListener implements com.google.android.exoplayer2.Player.Listener {
        public final /* synthetic */ com.flextv.livestore.activities.SeriesPlayerActivity this$0;

        private PlayerEventListener(com.flextv.livestore.activities.SeriesPlayerActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ PlayerEventListener(com.flextv.livestore.activities.SeriesPlayerActivity r1, com.flextv.livestore.activities.SeriesPlayerActivity.AnonymousClass1 r2) {
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
                if (r2 != r0) goto Le
                com.flextv.livestore.activities.SeriesPlayerActivity r2 = r1.this$0
                r2.releasePlayer()
                com.flextv.livestore.activities.SeriesPlayerActivity r2 = r1.this$0
                com.flextv.livestore.activities.SeriesPlayerActivity.access$400(r2)
                goto L40
            Le:
                r0 = 3
                if (r2 != r0) goto L25
                com.flextv.livestore.activities.SeriesPlayerActivity r2 = r1.this$0
                r0 = 0
                r2.error_count = r0
                android.widget.ImageView r2 = r2.image_rewind
                r0 = 8
                r2.setVisibility(r0)
                com.flextv.livestore.activities.SeriesPlayerActivity r2 = r1.this$0
                android.widget.ImageView r2 = r2.image_forward
                r2.setVisibility(r0)
                goto L40
            L25:
                r0 = 2
                if (r2 != r0) goto L40
                com.flextv.livestore.activities.SeriesPlayerActivity r2 = r1.this$0
                androidx.constraintlayout.widget.ConstraintLayout r2 = r2.ly_control
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L40
                com.flextv.livestore.activities.SeriesPlayerActivity r2 = r1.this$0
                android.os.Handler r0 = r2.handler
                com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda1 r2 = r2.hideInfoTicker
                r0.removeCallbacks(r2)
                com.flextv.livestore.activities.SeriesPlayerActivity r2 = r1.this$0
                com.flextv.livestore.activities.SeriesPlayerActivity.access$100(r2)
            L40:
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerError(@androidx.annotation.NonNull com.google.android.exoplayer2.PlaybackException r4) {
                r3 = this;
                int r4 = r4.errorCode
                r0 = 1002(0x3ea, float:1.404E-42)
                if (r4 != r0) goto L2f
                com.flextv.livestore.activities.SeriesPlayerActivity r4 = r3.this$0
                android.widget.ImageView r4 = r4.image_forward
                r0 = 8
                r4.setVisibility(r0)
                com.flextv.livestore.activities.SeriesPlayerActivity r4 = r3.this$0
                android.widget.ImageView r4 = r4.image_rewind
                r4.setVisibility(r0)
                com.flextv.livestore.activities.SeriesPlayerActivity r4 = r3.this$0
                r4.releasePlayer()
                com.flextv.livestore.activities.SeriesPlayerActivity r4 = r3.this$0
                java.lang.String r0 = r4.resume_key
                long r0 = com.flextv.livestore.activities.SeriesPlayerActivity.access$500(r4, r0)
                r4.last_position = r0
                com.flextv.livestore.activities.SeriesPlayerActivity r4 = r3.this$0
                java.lang.String r0 = r4.contentUrl
                long r1 = r4.last_position
                com.flextv.livestore.activities.SeriesPlayerActivity.access$000(r4, r0, r1)
                goto L4f
            L2f:
                com.flextv.livestore.activities.SeriesPlayerActivity r4 = r3.this$0
                int r0 = r4.error_count
                r1 = 3
                if (r0 <= r1) goto L3f
                r4.releasePlayer()
                com.flextv.livestore.activities.SeriesPlayerActivity r4 = r3.this$0
                com.flextv.livestore.activities.SeriesPlayerActivity.access$600(r4)
                goto L4f
            L3f:
                int r0 = r0 + 1
                r4.error_count = r0
                r4.releasePlayer()
                com.flextv.livestore.activities.SeriesPlayerActivity r4 = r3.this$0
                java.lang.String r0 = r4.contentUrl
                r1 = 0
                com.flextv.livestore.activities.SeriesPlayerActivity.access$000(r4, r0, r1)
            L4f:
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

    /* JADX INFO: renamed from: $r8$lambda$YUoH0C2aKhGHF-DicuZToqR6dvs, reason: not valid java name */
    public static /* synthetic */ void m72$r8$lambda$YUoH0C2aKhGHFDicuZToqR6dvs(com.flextv.livestore.activities.SeriesPlayerActivity r0, java.util.List r1, com.google.android.exoplayer2.source.TrackGroupArray r2, int r3, int r4) {
            r0.lambda$showAudioTrackDlgFragment$3(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m63peXoe86VFGSvqpVvhJwHKmuU(com.flextv.livestore.activities.SeriesPlayerActivity r0, com.flextv.livestore.models.EpisodeModel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            kotlin.Unit r0 = r0.lambda$onCreate$0(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$n-4gl3s6phjW07Gx7Fj5RC6wjx0, reason: not valid java name */
    public static /* synthetic */ void m73$r8$lambda$n4gl3s6phjW07Gx7Fj5RC6wjx0(com.flextv.livestore.activities.SeriesPlayerActivity r0, java.util.List r1, java.util.List r2, int r3) {
            r0.lambda$showOpenSubtitleDlgFragment$5(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$oJOygNc7E4huwacxOK34umnWv2w(com.flextv.livestore.activities.SeriesPlayerActivity r0) {
            r0.lambda$resolutionTimer$2()
            return
    }

    public static /* synthetic */ void $r8$lambda$vRGcnSqDt9riiM3o1HDByuipBo4(com.flextv.livestore.activities.SeriesPlayerActivity r0) {
            r0.lambda$listTimer$1()
            return
    }

    public static /* synthetic */ void $r8$lambda$vcT10wEHAA2Ys5V2zb4x9GmbUAY(com.flextv.livestore.activities.SeriesPlayerActivity r0, java.util.List r1, com.google.android.exoplayer2.source.TrackGroupArray r2, int r3, int r4) {
            r0.lambda$showSubTitleTrackDlgFragment$4(r1, r2, r3, r4)
            return
    }

    static {
            java.lang.Class<com.flextv.livestore.activities.SeriesPlayerActivity> r0 = com.flextv.livestore.activities.SeriesPlayerActivity.class
            return
    }

    public SeriesPlayerActivity() {
            r2 = this;
            r2.<init>()
            com.flextv.livestore.models.WordModels r0 = new com.flextv.livestore.models.WordModels
            r0.<init>()
            r2.wordModels = r0
            java.lang.String r0 = ""
            r2.name = r0
            r2.contentUrl = r0
            r2.series_name = r0
            r2.season_name = r0
            r2.tmdb_id = r0
            r0 = 0
            r2.last_position = r0
            r0 = 0
            r2.error_count = r0
            r2.duration = r0
            r2.episode_focused_position = r0
            r1 = -1
            r2.subtitle_position = r1
            r2.audio_position = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.handler = r0
            com.flextv.livestore.activities.SeriesPlayerActivity$4 r0 = new com.flextv.livestore.activities.SeriesPlayerActivity$4
            r0.<init>(r2)
            r2.mUpdateTimeTask = r0
            return
    }

    public static /* synthetic */ void access$000(com.flextv.livestore.activities.SeriesPlayerActivity r0, java.lang.String r1, long r2) {
            r0.playVideo(r1, r2)
            return
    }

    public static /* synthetic */ void access$100(com.flextv.livestore.activities.SeriesPlayerActivity r0) {
            r0.listTimer()
            return
    }

    public static /* synthetic */ void access$200(com.flextv.livestore.activities.SeriesPlayerActivity r0, int r1) {
            r0.playEpisode(r1)
            return
    }

    public static /* synthetic */ void access$400(com.flextv.livestore.activities.SeriesPlayerActivity r0) {
            r0.playNextEpisode()
            return
    }

    public static /* synthetic */ long access$500(com.flextv.livestore.activities.SeriesPlayerActivity r0, java.lang.String r1) {
            long r0 = r0.getLastPosition(r1)
            return r0
    }

    public static /* synthetic */ void access$600(com.flextv.livestore.activities.SeriesPlayerActivity r0) {
            r0.showPlayErrorDlgFragment()
            return
    }

    public static /* synthetic */ java.lang.Runnable access$700(com.flextv.livestore.activities.SeriesPlayerActivity r0) {
            java.lang.Runnable r0 = r0.mUpdateTimeTask
            return r0
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

    private void checkAddedRecent(java.lang.String r3) {
            r2 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceSeriesResumeModel()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            com.flextv.livestore.models.ResumeModel r1 = (com.flextv.livestore.models.ResumeModel) r1
            java.lang.String r1 = r1.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto La
            r0.remove()
            goto La
        L24:
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

    private boolean getFeatureButtonsFocus() {
            r1 = this;
            android.widget.ImageButton r0 = r1.btn_audio
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L23
            android.widget.ImageButton r0 = r1.btn_sub
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L23
            android.widget.ImageButton r0 = r1.btn_resolution
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L23
            android.widget.ImageButton r0 = r1.btn_title_setting
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

    private long getLastPosition(java.lang.String r4) {
            r3 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r3.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceSeriesResumeModel()
            r1 = 0
        L7:
            int r2 = r0.size()
            if (r1 >= r2) goto L2b
            java.lang.Object r2 = r0.get(r1)
            com.flextv.livestore.models.ResumeModel r2 = (com.flextv.livestore.models.ResumeModel) r2
            java.lang.String r2 = r2.getName()
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L28
            java.lang.Object r4 = r0.get(r1)
            com.flextv.livestore.models.ResumeModel r4 = (com.flextv.livestore.models.ResumeModel) r4
            long r0 = r4.getLast_position()
            return r0
        L28:
            int r1 = r1 + 1
            goto L7
        L2b:
            r0 = 0
            return r0
    }

    private void getOpenSubtitleFromApi() {
            r4 = this;
            com.flextv.livestore.remote.GetSubtitleDataRequest r0 = new com.flextv.livestore.remote.GetSubtitleDataRequest
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.<init>(r4, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.flextv.livestore.apps.Constants.EPISODE_SUBTITLE_SEARCH
            r1.append(r2)
            java.lang.String r2 = r4.tmdb_id
            r1.append(r2)
            java.lang.String r2 = "&season_number="
            r1.append(r2)
            java.util.List<com.flextv.livestore.models.EpisodeModel> r2 = r4.episodeModels
            int r3 = r4.episode_position
            java.lang.Object r2 = r2.get(r3)
            com.flextv.livestore.models.EpisodeModel r2 = (com.flextv.livestore.models.EpisodeModel) r2
            int r2 = r2.getSeason()
            r1.append(r2)
            java.lang.String r2 = "&episode_number="
            r1.append(r2)
            java.util.List<com.flextv.livestore.models.EpisodeModel> r2 = r4.episodeModels
            int r3 = r4.episode_position
            java.lang.Object r2 = r2.get(r3)
            com.flextv.livestore.models.EpisodeModel r2 = (com.flextv.livestore.models.EpisodeModel) r2
            java.lang.String r2 = r2.getEpisode_num()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = com.flextv.livestore.apps.Constants.API_KEY
            r0.getResponse(r1, r2)
            r0.setOnGetResponseListener(r4)
            return
    }

    private void getSubtitleTrackFromVideo() {
            r8 = this;
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0 = r8.trackSelector
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo r0 = r0.getCurrentMappedTrackInfo()
            r1 = 1
            if (r0 == 0) goto L67
            r2 = 3
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r0.getTrackGroups(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = 0
        L18:
            int r5 = r0.length
            if (r4 >= r5) goto L38
            com.google.android.exoplayer2.source.TrackGroup r5 = r0.get(r4)
            r6 = 0
        L21:
            int r7 = r5.length
            if (r6 >= r7) goto L35
            com.google.android.exoplayer2.Format r7 = r5.getFormat(r6)
            java.lang.String r7 = r7.language
            java.lang.String r7 = com.flextv.livestore.utils.Utils.getLanguageNameFromCode(r7)
            r2.add(r7)
            int r6 = r6 + 1
            goto L21
        L35:
            int r4 = r4 + 1
            goto L18
        L38:
            java.lang.String r3 = "None"
            r2.add(r3)
            int r3 = r2.size()
            if (r3 <= r1) goto L47
            r8.showSubTitleTrackDlgFragment(r0, r2)
            goto L86
        L47:
            java.lang.String r0 = r8.tmdb_id
            if (r0 == 0) goto L55
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L55
            r8.getOpenSubtitleFromApi()
            goto L86
        L55:
            android.content.Context r0 = r8.getApplicationContext()
            com.flextv.livestore.models.WordModels r2 = r8.wordModels
            java.lang.String r2 = r2.getNo_subtitle()
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
            goto L86
        L67:
            java.lang.String r0 = r8.tmdb_id
            if (r0 == 0) goto L75
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L75
            r8.getOpenSubtitleFromApi()
            goto L86
        L75:
            android.content.Context r0 = r8.getApplicationContext()
            com.flextv.livestore.models.WordModels r2 = r8.wordModels
            java.lang.String r2 = r2.getNo_subtitle()
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
        L86:
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
            r1.setStyle(r0)
            com.google.android.exoplayer2.ui.StyledPlayerView r0 = r9.playerView
            com.google.android.exoplayer2.ui.SubtitleView r0 = r0.getSubtitleView()
            com.flextv.livestore.helper.PreferenceHelper r1 = r9.preferenceHelper
            int r1 = r1.getSharedPreferenceSubtitleSize()
            float r1 = (float) r1
            r2 = 3
            r0.setFixedTextSize(r2, r1)
            com.flextv.livestore.view.SubtitleView r0 = r9.subtitleView
            com.flextv.livestore.helper.PreferenceHelper r1 = r9.preferenceHelper
            int r1 = r1.getSharedPreferenceSubtitleSize()
            float r1 = (float) r1
            r0.setTextSize(r2, r1)
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
            r0 = 2131427482(0x7f0b009a, float:1.8476581E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r9.btn_previous = r0
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
            r9.btn_next = r0
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
            r0 = 2131427490(0x7f0b00a2, float:1.8476598E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r9.btn_title_setting = r0
            r0 = 2131428338(0x7f0b03f2, float:1.8478318E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.txt_resolution = r0
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
            r0 = 2131428341(0x7f0b03f5, float:1.8478324E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.txt_season = r0
            r0 = 2131427779(0x7f0b01c3, float:1.8477184E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 2131427812(0x7f0b01e4, float:1.847725E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.image_rewind = r0
            r0 = 2131427799(0x7f0b01d7, float:1.8477224E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.image_forward = r0
            r0 = 2131428079(0x7f0b02ef, float:1.8477792E38)
            android.view.View r0 = r9.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r9.recyclerEpisodes = r0
            r0 = 2131428135(0x7f0b0327, float:1.8477906E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            r9.seekBar = r0
            r1 = 100
            r0.setMax(r1)
            android.widget.SeekBar r0 = r9.seekBar
            r0.setOnSeekBarChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_back
            r0.setOnClickListener(r9)
            android.widget.ImageButton r0 = r9.btn_rewind
            r0.setOnClickListener(r9)
            android.widget.ImageButton r0 = r9.btn_play
            r0.setOnClickListener(r9)
            android.widget.ImageButton r0 = r9.btn_forward
            r0.setOnClickListener(r9)
            android.widget.ImageButton r0 = r9.btn_sub
            r0.setOnClickListener(r9)
            android.widget.ImageButton r0 = r9.btn_audio
            r0.setOnClickListener(r9)
            android.widget.ImageButton r0 = r9.btn_title_setting
            r0.setOnClickListener(r9)
            android.widget.ImageButton r0 = r9.btn_resolution
            r0.setOnClickListener(r9)
            android.widget.ImageButton r0 = r9.btn_back
            r0.setOnFocusChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_rewind
            r0.setOnFocusChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_play
            r0.setOnFocusChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_forward
            r0.setOnFocusChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_sub
            r0.setOnFocusChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_audio
            r0.setOnFocusChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_resolution
            r0.setOnFocusChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_title_setting
            r0.setOnFocusChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_next
            r0.setOnFocusChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_previous
            r0.setOnFocusChangeListener(r9)
            android.widget.ImageButton r0 = r9.btn_next
            r0.setOnClickListener(r9)
            android.widget.ImageButton r0 = r9.btn_previous
            r0.setOnClickListener(r9)
            return
    }

    private /* synthetic */ void lambda$listTimer$1() {
            r2 = this;
            int r0 = r2.maxTime
            r1 = 1
            if (r0 >= r1) goto L11
            r0 = 0
            r2.showEpisodes(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.ly_control
            r1 = 8
            r0.setVisibility(r1)
            return
        L11:
            r2.runNextTicker()
            return
    }

    private /* synthetic */ kotlin.Unit lambda$onCreate$0(com.flextv.livestore.models.EpisodeModel r1, java.lang.Integer r2, java.lang.Boolean r3) {
            r0 = this;
            boolean r1 = r3.booleanValue()
            if (r1 == 0) goto L26
            int r1 = r0.episode_position
            int r3 = r2.intValue()
            if (r1 == r3) goto L36
            r0.releasePlayer()
            int r1 = r2.intValue()
            r0.episode_position = r1
            r0.playEpisode(r1)
            r1 = 0
            r0.showEpisodes(r1)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r0.ly_control
            r2 = 8
            r1.setVisibility(r2)
            goto L36
        L26:
            int r1 = r2.intValue()
            r0.episode_focused_position = r1
            android.os.Handler r1 = r0.handler
            com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda1 r2 = r0.hideInfoTicker
            r1.removeCallbacks(r2)
            r0.listTimer()
        L36:
            r1 = 0
            return r1
    }

    private /* synthetic */ void lambda$resolutionTimer$2() {
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

    private /* synthetic */ void lambda$showAudioTrackDlgFragment$3(java.util.List r3, com.google.android.exoplayer2.source.TrackGroupArray r4, int r5, int r6) {
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

    private /* synthetic */ void lambda$showOpenSubtitleDlgFragment$5(java.util.List r2, java.util.List r3, int r4) {
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

    private /* synthetic */ void lambda$showSubTitleTrackDlgFragment$4(java.util.List r3, com.google.android.exoplayer2.source.TrackGroupArray r4, int r5, int r6) {
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
            com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda1 r0 = new com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda1
            r1 = 1
            r0.<init>(r2, r1)
            r2.hideInfoTicker = r0
            r0.run()
            return
    }

    private void playEpisode(int r7) {
            r6 = this;
            android.widget.SeekBar r0 = r6.seekBar
            r1 = 0
            r0.setProgress(r1)
            java.util.List<com.flextv.livestore.models.EpisodeModel> r0 = r6.episodeModels
            java.lang.Object r0 = r0.get(r7)
            com.flextv.livestore.models.EpisodeModel r0 = (com.flextv.livestore.models.EpisodeModel) r0
            java.lang.String r0 = r0.getTitle()
            r6.name = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r6.series_name
            r0.append(r2)
            java.lang.String r2 = r6.season_name
            r0.append(r2)
            java.lang.String r2 = r6.name
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6.resume_key = r0
            android.widget.TextView r0 = r6.txt_name
            java.lang.String r2 = r6.name
            r0.setText(r2)
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper
            boolean r0 = r0.getSharedPreferenceISM3U()
            if (r0 == 0) goto L4c
            java.util.List<com.flextv.livestore.models.EpisodeModel> r0 = r6.episodeModels
            java.lang.Object r7 = r0.get(r7)
            com.flextv.livestore.models.EpisodeModel r7 = (com.flextv.livestore.models.EpisodeModel) r7
            java.lang.String r7 = r7.getUrl()
            r6.contentUrl = r7
            goto L7c
        L4c:
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper
            java.lang.String r0 = r0.getSharedPreferenceServerUrl()
            com.flextv.livestore.helper.PreferenceHelper r2 = r6.preferenceHelper
            java.lang.String r2 = r2.getSharedPreferenceUsername()
            com.flextv.livestore.helper.PreferenceHelper r3 = r6.preferenceHelper
            java.lang.String r3 = r3.getSharedPreferencePassword()
            java.util.List<com.flextv.livestore.models.EpisodeModel> r4 = r6.episodeModels
            java.lang.Object r4 = r4.get(r7)
            com.flextv.livestore.models.EpisodeModel r4 = (com.flextv.livestore.models.EpisodeModel) r4
            java.lang.String r4 = r4.getId()
            java.util.List<com.flextv.livestore.models.EpisodeModel> r5 = r6.episodeModels
            java.lang.Object r7 = r5.get(r7)
            com.flextv.livestore.models.EpisodeModel r7 = (com.flextv.livestore.models.EpisodeModel) r7
            java.lang.String r7 = r7.getContainer_extension()
            java.lang.String r7 = com.flextv.livestore.helper.GetSharedInfo.getEpisodeUrl(r0, r2, r3, r4, r7)
            r6.contentUrl = r7
        L7c:
            java.lang.String r7 = r6.resume_key
            long r2 = r6.getLastPosition(r7)
            r6.last_position = r2
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L98
            androidx.constraintlayout.widget.ConstraintLayout r7 = r6.ly_control
            r0 = 8
            r7.setVisibility(r0)
            r6.showEpisodes(r1)
            r6.showResumeDlgFragment()
            goto Lb6
        L98:
            androidx.constraintlayout.widget.ConstraintLayout r7 = r6.ly_control
            r7.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r7 = r6.recyclerEpisodes
            r7.setFocusable(r1)
            android.widget.ImageButton r7 = r6.btn_play
            r7.requestFocus()
            java.lang.String r7 = r6.contentUrl
            r6.playVideo(r7, r4)
            android.os.Handler r7 = r6.handler
            com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda1 r0 = r6.hideInfoTicker
            r7.removeCallbacks(r0)
            r6.listTimer()
        Lb6:
            return
    }

    private void playNextEpisode() {
            r2 = this;
            int r0 = r2.episode_position
            java.util.List<com.flextv.livestore.models.EpisodeModel> r1 = r2.episodeModels
            int r1 = r1.size()
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L1a
            int r0 = r2.episode_position
            int r0 = r0 + 1
            r2.episode_position = r0
            r2.releasePlayer()
            int r0 = r2.episode_position
            r2.playEpisode(r0)
        L1a:
            return
    }

    private void playPreviousEpisode() {
            r1 = this;
            int r0 = r1.episode_position
            if (r0 <= 0) goto L10
            int r0 = r0 + (-1)
            r1.episode_position = r0
            r1.releasePlayer()
            int r0 = r1.episode_position
            r1.playEpisode(r0)
        L10:
            return
    }

    private void playVideo(java.lang.String r5, long r6) {
            r4 = this;
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L7
            r0.release()     // Catch: java.lang.Exception -> Lb9
        L7:
            android.net.Uri r0 = android.net.Uri.parse(r5)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r1 = ""
            int r0 = com.google.android.exoplayer2.util.Util.inferContentType(r0, r1)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.getAdaptiveMimeTypeForContentType(r0)     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.MediaItem$Builder r1 = new com.google.android.exoplayer2.MediaItem$Builder     // Catch: java.lang.Exception -> Lb9
            r1.<init>()     // Catch: java.lang.Exception -> Lb9
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.MediaItem$Builder r5 = r1.setUri(r5)     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.MediaMetadata$Builder r2 = new com.google.android.exoplayer2.MediaMetadata$Builder     // Catch: java.lang.Exception -> Lb9
            r2.<init>()     // Catch: java.lang.Exception -> Lb9
            java.lang.String r3 = "title"
            com.google.android.exoplayer2.MediaMetadata$Builder r2 = r2.setTitle(r3)     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.MediaMetadata r2 = r2.build()     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.MediaItem$Builder r5 = r5.setMediaMetadata(r2)     // Catch: java.lang.Exception -> Lb9
            r5.setMimeType(r0)     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.MediaItem r5 = r1.build()     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.Tracks r0 = com.google.android.exoplayer2.Tracks.EMPTY     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector     // Catch: java.lang.Exception -> Lb9
            r0.<init>(r4)     // Catch: java.lang.Exception -> Lb9
            r4.trackSelector = r0     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1 = r4.trackSelectionParameters     // Catch: java.lang.Exception -> Lb9
            r0.setParameters(r1)     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.ExoPlayer$Builder r0 = new com.google.android.exoplayer2.ExoPlayer$Builder     // Catch: java.lang.Exception -> Lb9
            r0.<init>(r4)     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.source.MediaSource$Factory r1 = r4.createMediaSourceFactory()     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.ExoPlayer$Builder r0 = r0.setMediaSourceFactory(r1)     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r1 = r4.trackSelector     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.ExoPlayer$Builder r0 = r0.setTrackSelector(r1)     // Catch: java.lang.Exception -> Lb9
            r1 = 1
            r4.setRenderersFactory(r0, r1)     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.ExoPlayer r0 = r0.build()     // Catch: java.lang.Exception -> Lb9
            r4.player = r0     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2 = r4.trackSelectionParameters     // Catch: java.lang.Exception -> Lb9
            r0.setTrackSelectionParameters(r2)     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player     // Catch: java.lang.Exception -> Lb9
            com.flextv.livestore.activities.SeriesPlayerActivity$PlayerEventListener r2 = new com.flextv.livestore.activities.SeriesPlayerActivity$PlayerEventListener     // Catch: java.lang.Exception -> Lb9
            r3 = 0
            r2.<init>(r4, r3)     // Catch: java.lang.Exception -> Lb9
            r0.addListener(r2)     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.util.EventLogger r2 = new com.google.android.exoplayer2.util.EventLogger     // Catch: java.lang.Exception -> Lb9
            r2.<init>()     // Catch: java.lang.Exception -> Lb9
            r0.addAnalyticsListener(r2)     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.audio.AudioAttributes r2 = com.google.android.exoplayer2.audio.AudioAttributes.DEFAULT     // Catch: java.lang.Exception -> Lb9
            r0.setAudioAttributes(r2, r1)     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player     // Catch: java.lang.Exception -> Lb9
            r0.setPlayWhenReady(r1)     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.ui.StyledPlayerView r0 = r4.playerView     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.ExoPlayer r1 = r4.player     // Catch: java.lang.Exception -> Lb9
            r0.setPlayer(r1)     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player     // Catch: java.lang.Exception -> Lb9
            r0.setMediaItem(r5)     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player     // Catch: java.lang.Exception -> Lb9
            r5.prepare()     // Catch: java.lang.Exception -> Lb9
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player     // Catch: java.lang.Exception -> Lb9
            r5.play()     // Catch: java.lang.Exception -> Lb9
            r0 = 0
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 == 0) goto Laf
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player     // Catch: java.lang.Exception -> Lb9
            r5.seekTo(r6)     // Catch: java.lang.Exception -> Lb9
        Laf:
            android.os.Handler r5 = r4.handler     // Catch: java.lang.Exception -> Lb9
            java.lang.Runnable r6 = r4.mUpdateTimeTask     // Catch: java.lang.Exception -> Lb9
            r5.removeCallbacks(r6)     // Catch: java.lang.Exception -> Lb9
            r4.updateProgressBar()     // Catch: java.lang.Exception -> Lb9
        Lb9:
            return
    }

    private void resolutionTimer() {
            r2 = this;
            r0 = 2
            r2.resolutionTime = r0
            com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda1 r0 = new com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda1
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
            com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda1 r3 = r4.hideResolutionTicker
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
            com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda1 r3 = r4.hideInfoTicker
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
            com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda0 r10 = new com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda0
            r7 = 0
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

    private void showEpisodes(boolean r5) {
            r4 = this;
            androidx.constraintlayout.widget.ConstraintSet r0 = new androidx.constraintlayout.widget.ConstraintSet
            r0.<init>()
            androidx.constraintlayout.widget.ConstraintLayout r1 = r4.ly_control
            r0.clone(r1)
            r1 = 2131427766(0x7f0b01b6, float:1.8477158E38)
            r2 = 2131427765(0x7f0b01b5, float:1.8477155E38)
            if (r5 == 0) goto L1d
            r3 = 1061158912(0x3f400000, float:0.75)
            r0.setGuidelinePercent(r2, r3)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setGuidelinePercent(r1, r2)
            goto L29
        L1d:
            r3 = 1063675494(0x3f666666, float:0.9)
            r0.setGuidelinePercent(r2, r3)
            r2 = 1066611507(0x3f933333, float:1.15)
            r0.setGuidelinePercent(r1, r2)
        L29:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r4.ly_control
            android.transition.TransitionManager.beginDelayedTransition(r1)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r4.ly_control
            r0.applyTo(r1)
            if (r5 == 0) goto L4f
            androidx.recyclerview.widget.RecyclerView r5 = r4.recyclerEpisodes
            r0 = 1
            r5.setFocusable(r0)
            com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter r5 = r4.adapter
            int r0 = r4.episode_position
            r5.setSelectedPosition(r0)
            androidx.recyclerview.widget.RecyclerView r5 = r4.recyclerEpisodes
            r5.requestFocus()
            androidx.recyclerview.widget.RecyclerView r5 = r4.recyclerEpisodes
            int r0 = r4.episode_position
            r5.scrollToPosition(r0)
            goto L5a
        L4f:
            androidx.recyclerview.widget.RecyclerView r5 = r4.recyclerEpisodes
            r0 = 0
            r5.setFocusable(r0)
            android.widget.ImageButton r5 = r4.btn_play
            r5.requestFocus()
        L5a:
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
            com.flextv.livestore.activities.SeriesPlayerActivity$2 r3 = new com.flextv.livestore.activities.SeriesPlayerActivity$2
            r3.<init>(r6)
            r1.setOkButtonClickListener(r3)
            com.flextv.livestore.dlgfragment.ExitDlgFragment r1 = r6.exitDlgFragment
            r1.show(r0, r2)
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
            r5 = 1
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
            r4 = 0
            com.flextv.livestore.dlgfragment.PlayErrorDlgFragment r1 = com.flextv.livestore.dlgfragment.PlayErrorDlgFragment.newInstance(r1, r3, r4)
            r5.errorDlgFragment = r1
            com.flextv.livestore.activities.SeriesPlayerActivity$3 r3 = new com.flextv.livestore.activities.SeriesPlayerActivity$3
            r3.<init>(r5)
            r1.setOkButtonClickListener(r3)
            com.flextv.livestore.dlgfragment.PlayErrorDlgFragment r1 = r5.errorDlgFragment
            r1.show(r0, r2)
            return
    }

    private void showResumeDlgFragment() {
            r6 = this;
            androidx.fragment.app.FragmentManager r0 = r6.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_resume"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r0)
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
            com.flextv.livestore.activities.SeriesPlayerActivity$1 r3 = new com.flextv.livestore.activities.SeriesPlayerActivity$1
            r3.<init>(r6)
            r1.setOkButtonClickListener(r3)
            com.flextv.livestore.dlgfragment.ExitDlgFragment r1 = r6.resumeDlgFragment
            r1.show(r0, r2)
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
            com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda0 r9 = new com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda0
            r8 = 1
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
            if (r2 == 0) goto L2e
            com.google.gson.Gson r3 = new com.google.gson.Gson
            r3.<init>()
            java.lang.String r2 = r2.toString()
            java.lang.Class<com.flextv.livestore.models.SubtitleLinkModel> r0 = com.flextv.livestore.models.SubtitleLinkModel.class
            java.lang.Object r2 = r3.fromJson(r2, r0)
            com.flextv.livestore.models.SubtitleLinkModel r2 = (com.flextv.livestore.models.SubtitleLinkModel) r2
            com.google.android.exoplayer2.ExoPlayer r3 = r1.player
            if (r3 == 0) goto L40
            com.flextv.livestore.view.SubtitleView r3 = r1.subtitleView
            r0 = 0
            r3.setVisibility(r0)
            com.flextv.livestore.view.SubtitleView r3 = r1.subtitleView
            com.google.android.exoplayer2.ExoPlayer r0 = r1.player
            r3.setPlayer(r0)
            com.flextv.livestore.view.SubtitleView r3 = r1.subtitleView
            java.lang.String r2 = r2.getLink()
            r3.setSubSource(r2)
            goto L40
        L2e:
            android.content.Context r2 = r1.getApplicationContext()
            com.flextv.livestore.models.WordModels r3 = r1.wordModels
            java.lang.String r3 = r3.getNo_subtitle()
            r0 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
            r2.show()
        L40:
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
            if (r0 != 0) goto L186
            int r0 = r6.getKeyCode()
            r1 = 4
            r2 = 8
            r3 = 0
            r4 = 1
            if (r0 == r1) goto L171
            r1 = 85
            if (r0 == r1) goto L14b
            r1 = 89
            if (r0 == r1) goto L124
            r1 = 90
            if (r0 == r1) goto Le6
            switch(r0) {
                case 19: goto L8f;
                case 20: goto L3f;
                case 21: goto L124;
                case 22: goto Le6;
                case 23: goto L22;
                default: goto L20;
            }
        L20:
            goto L186
        L22:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L186
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.ly_control
            r6.setVisibility(r3)
            android.widget.ImageButton r6 = r5.btn_play
            r6.requestFocus()
            android.os.Handler r6 = r5.handler
            com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda1 r0 = r5.hideInfoTicker
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
            com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda1 r0 = r5.hideInfoTicker
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
            if (r0 == 0) goto L78
            android.widget.ImageButton r6 = r5.btn_play
            r6.requestFocus()
            return r4
        L78:
            boolean r0 = r5.getControlButtonFocus()
            if (r0 == 0) goto L84
            android.widget.ImageButton r6 = r5.btn_sub
            r6.requestFocus()
            return r4
        L84:
            boolean r0 = r5.getFeatureButtonsFocus()
            if (r0 == 0) goto L186
            r5.showEpisodes(r4)
            goto L186
        L8f:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != 0) goto La5
            android.widget.SeekBar r0 = r5.seekBar
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto La5
            android.widget.ImageButton r6 = r5.btn_back
            r6.requestFocus()
            return r4
        La5:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lb9
            boolean r0 = r5.getControlButtonFocus()
            if (r0 == 0) goto Lb9
            android.widget.SeekBar r6 = r5.seekBar
            r6.requestFocus()
            return r4
        Lb9:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lcd
            boolean r0 = r5.getFeatureButtonsFocus()
            if (r0 == 0) goto Lcd
            android.widget.ImageButton r6 = r5.btn_play
            r6.requestFocus()
            return r4
        Lcd:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L186
            androidx.recyclerview.widget.RecyclerView r0 = r5.recyclerEpisodes
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L186
            r5.showEpisodes(r3)
            android.widget.ImageButton r6 = r5.btn_sub
            r6.requestFocus()
            return r4
        Le6:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lf7
            android.widget.ImageButton r0 = r5.btn_next
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lf7
            return r4
        Lf7:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L113
            androidx.recyclerview.widget.RecyclerView r0 = r5.recyclerEpisodes
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L113
            int r0 = r5.episode_focused_position
            java.util.List<com.flextv.livestore.models.EpisodeModel> r1 = r5.episodeModels
            int r1 = r1.size()
            int r1 = r1 - r4
            if (r0 != r1) goto L113
            return r4
        L113:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L186
            r5.seekToForward()
            android.widget.ImageView r0 = r5.image_forward
            r0.setVisibility(r3)
            goto L186
        L124:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L135
            r5.seekToRewind()
            android.widget.ImageView r0 = r5.image_rewind
            r0.setVisibility(r3)
            goto L186
        L135:
            androidx.recyclerview.widget.RecyclerView r0 = r5.recyclerEpisodes
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L142
            int r0 = r5.episode_focused_position
            if (r0 != 0) goto L142
            return r4
        L142:
            android.widget.ImageButton r0 = r5.btn_previous
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L186
            return r4
        L14b:
            com.google.android.exoplayer2.ExoPlayer r0 = r5.player
            if (r0 == 0) goto L186
            boolean r0 = r0.getPlayWhenReady()
            if (r0 == 0) goto L163
            com.google.android.exoplayer2.ExoPlayer r0 = r5.player
            r0.setPlayWhenReady(r3)
            android.widget.ImageButton r0 = r5.btn_play
            r1 = 2131231027(0x7f080133, float:1.8078123E38)
            r0.setImageResource(r1)
            goto L186
        L163:
            com.google.android.exoplayer2.ExoPlayer r0 = r5.player
            r0.setPlayWhenReady(r4)
            android.widget.ImageButton r0 = r5.btn_play
            r1 = 2131231026(0x7f080132, float:1.8078121E38)
            r0.setImageResource(r1)
            goto L186
        L171:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.ly_control
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L182
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.ly_control
            r6.setVisibility(r2)
            r5.showEpisodes(r3)
            return r4
        L182:
            r5.showExitDlgFragment()
            return r4
        L186:
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 0
            switch(r3) {
                case 2131427463: goto La3;
                case 2131427464: goto L9f;
                case 2131427470: goto L91;
                case 2131427477: goto L8d;
                case 2131427480: goto L66;
                case 2131427482: goto L62;
                case 2131427484: goto L1e;
                case 2131427486: goto Lf;
                case 2131427489: goto La;
                default: goto L8;
            }
        L8:
            goto La6
        La:
            r2.getSubtitleTrackFromVideo()
            goto La6
        Lf:
            android.os.Handler r3 = r2.handler
            com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda1 r0 = r2.hideInfoTicker
            r3.removeCallbacks(r0)
            r2.listTimer()
            r2.seekToRewind()
            goto La6
        L1e:
            com.google.android.exoplayer2.ExoPlayer r3 = r2.player
            if (r3 == 0) goto La6
            boolean r3 = r3.getPlayWhenReady()
            if (r3 == 0) goto La6
            com.google.android.exoplayer2.ui.StyledPlayerView r3 = r2.playerView
            int r3 = r3.getResizeMode()
            r1 = 3
            if (r3 != r1) goto L42
            com.google.android.exoplayer2.ui.StyledPlayerView r3 = r2.playerView
            r3.setResizeMode(r0)
            android.widget.TextView r3 = r2.txt_resolution
            com.flextv.livestore.models.WordModels r1 = r2.wordModels
            java.lang.String r1 = r1.getFit_screen()
            r3.setText(r1)
            goto L52
        L42:
            com.google.android.exoplayer2.ui.StyledPlayerView r3 = r2.playerView
            r3.setResizeMode(r1)
            android.widget.TextView r3 = r2.txt_resolution
            com.flextv.livestore.models.WordModels r1 = r2.wordModels
            java.lang.String r1 = r1.getFill_screen()
            r3.setText(r1)
        L52:
            android.widget.TextView r3 = r2.txt_resolution
            r3.setVisibility(r0)
            android.os.Handler r3 = r2.handler
            com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda1 r0 = r2.hideResolutionTicker
            r3.removeCallbacks(r0)
            r2.resolutionTimer()
            goto La6
        L62:
            r2.playPreviousEpisode()
            goto La6
        L66:
            com.google.android.exoplayer2.ExoPlayer r3 = r2.player
            if (r3 == 0) goto La6
            boolean r3 = r3.getPlayWhenReady()
            if (r3 == 0) goto L7e
            com.google.android.exoplayer2.ExoPlayer r3 = r2.player
            r3.setPlayWhenReady(r0)
            android.widget.ImageButton r3 = r2.btn_play
            r0 = 2131231027(0x7f080133, float:1.8078123E38)
            r3.setImageResource(r0)
            goto La6
        L7e:
            com.google.android.exoplayer2.ExoPlayer r3 = r2.player
            r0 = 1
            r3.setPlayWhenReady(r0)
            android.widget.ImageButton r3 = r2.btn_play
            r0 = 2131231026(0x7f080132, float:1.8078121E38)
            r3.setImageResource(r0)
            goto La6
        L8d:
            r2.playNextEpisode()
            goto La6
        L91:
            android.os.Handler r3 = r2.handler
            com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda1 r0 = r2.hideInfoTicker
            r3.removeCallbacks(r0)
            r2.listTimer()
            r2.seekToForward()
            goto La6
        L9f:
            r2.showExitDlgFragment()
            goto La6
        La3:
            r2.showDefaultAudioTrackDlgFragment()
        La6:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r6) {
            r5 = this;
            super.onCreate(r6)
            r6 = 2131623987(0x7f0e0033, float:1.887514E38)
            r5.setContentView(r6)
            com.flextv.livestore.utils.Utils.FullScreenCall(r5)
            com.flextv.livestore.helper.PreferenceHelper r6 = new com.flextv.livestore.helper.PreferenceHelper
            r6.<init>(r5)
            r5.preferenceHelper = r6
            com.flextv.livestore.models.WordModels r6 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r5)
            r5.wordModels = r6
            r5.initView()
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "position"
            r1 = 0
            int r6 = r6.getIntExtra(r0, r1)
            r5.episode_position = r6
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "season_pos"
            int r6 = r6.getIntExtra(r0, r1)
            r5.season_pos = r6
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "series_name"
            java.lang.String r6 = r6.getStringExtra(r0)
            r5.series_name = r6
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "season_name"
            java.lang.String r6 = r6.getStringExtra(r0)
            r5.season_name = r6
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "tmdb_id"
            java.lang.String r6 = r6.getStringExtra(r0)
            r5.tmdb_id = r6
            com.flextv.livestore.helper.PreferenceHelper r6 = r5.preferenceHelper
            boolean r6 = r6.getSharedPreferenceISM3U()
            if (r6 == 0) goto L74
            com.flextv.livestore.helper.RealmController r6 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r0 = r5.series_name
            java.lang.String r2 = r5.season_name
            java.util.List r6 = r6.getEpisodesBySeason(r0, r2)
            r5.episodeModels = r6
            goto L7c
        L74:
            com.flextv.livestore.helper.PreferenceHelper r6 = r5.preferenceHelper
            java.util.List r6 = r6.getSharedPreferenceEpisodeModels()
            r5.episodeModels = r6
        L7c:
            android.widget.TextView r6 = r5.txt_season
            java.lang.String r0 = r5.season_name
            r6.setText(r0)
            com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter r6 = new com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = -1
            com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3 r3 = new com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda3
            r4 = 6
            r3.<init>(r5, r4)
            r6.<init>(r5, r0, r2, r3)
            r5.adapter = r6
            java.util.List<com.flextv.livestore.models.EpisodeModel> r0 = r5.episodeModels
            int r2 = r5.season_pos
            r6.setEpisodes(r0, r2)
            androidx.recyclerview.widget.RecyclerView r6 = r5.recyclerEpisodes
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r5, r1, r1)
            r6.setLayoutManager(r0)
            androidx.recyclerview.widget.RecyclerView r6 = r5.recyclerEpisodes
            r0 = 1
            r6.setHasFixedSize(r0)
            androidx.recyclerview.widget.RecyclerView r6 = r5.recyclerEpisodes
            com.flextv.livestore.adapter.EpisodeHorizontalRecyclerAdapter r1 = r5.adapter
            r6.setAdapter(r1)
            com.google.android.exoplayer2.upstream.DataSource$Factory r6 = com.flextv.livestore.utils.DemoUtil.getDataSourceFactory(r5)
            r5.dataSourceFactory = r6
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r6 = new com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder
            r6.<init>(r5)
            r1 = 3
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.preferenceHelper
            boolean r2 = r2.getSharedPreferenceSubtitleEnable()
            r0 = r0 ^ r2
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r6 = r6.setTrackTypeDisabled(r1, r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r6 = r6.build()
            r5.trackSelectionParameters = r6
            int r6 = r5.episode_position
            r5.playEpisode(r6)
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto Lc
            android.os.Handler r1 = r0.handler
            com.flextv.livestore.activities.SeriesPlayerActivity$$ExternalSyntheticLambda1 r2 = r0.hideInfoTicker
            r1.removeCallbacks(r2)
            r0.listTimer()
        Lc:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
            r2 = this;
            super.onPause()
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 > r1) goto L13
            com.google.android.exoplayer2.ui.StyledPlayerView r0 = r2.playerView
            if (r0 == 0) goto L10
            r0.onPause()
        L10:
            r2.releasePlayer()
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
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 <= r1) goto L13
            com.google.android.exoplayer2.ui.StyledPlayerView r0 = r2.playerView
            if (r0 == 0) goto L10
            r0.onPause()
        L10:
            r2.releasePlayer()
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

    public void releasePlayer() {
            r5 = this;
            com.google.android.exoplayer2.ExoPlayer r0 = r5.player
            if (r0 == 0) goto L6d
            java.lang.String r0 = r5.resume_key
            r5.checkAddedRecent(r0)
            com.google.android.exoplayer2.ExoPlayer r0 = r5.player
            long r0 = r0.getCurrentPosition()
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L60
            com.google.android.exoplayer2.ExoPlayer r0 = r5.player
            long r0 = r0.getCurrentPosition()
            r2 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 + r2
            com.google.android.exoplayer2.ExoPlayer r2 = r5.player
            long r2 = r2.getDuration()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L60
            com.flextv.livestore.models.ResumeModel r0 = new com.flextv.livestore.models.ResumeModel
            r0.<init>()
            java.lang.String r1 = r5.resume_key
            r0.setName(r1)
            com.google.android.exoplayer2.ExoPlayer r1 = r5.player
            long r1 = r1.getCurrentPosition()
            r0.setLast_position(r1)
            com.google.android.exoplayer2.ExoPlayer r1 = r5.player
            long r1 = r1.getCurrentPosition()
            r3 = 100
            long r1 = r1 * r3
            com.google.android.exoplayer2.ExoPlayer r3 = r5.player
            long r3 = r3.getDuration()
            long r1 = r1 / r3
            int r2 = (int) r1
            r0.setPro(r2)
            com.flextv.livestore.helper.PreferenceHelper r1 = r5.preferenceHelper
            java.util.List r1 = r1.getSharedPreferenceSeriesResumeModel()
            r2 = 0
            r1.add(r2, r0)
            com.flextv.livestore.helper.PreferenceHelper r0 = r5.preferenceHelper
            r0.setSharedPreferenceSeriesResumeModel(r1)
        L60:
            com.google.android.exoplayer2.ExoPlayer r0 = r5.player
            r0.stop()
            com.google.android.exoplayer2.ExoPlayer r0 = r5.player
            r0.release()
            r0 = 0
            r5.player = r0
        L6d:
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
