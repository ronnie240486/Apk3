package com.flextv.livestore.activities;

/* JADX INFO: loaded from: classes.dex */
public class LiveChannelActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener, android.view.View.OnFocusChangeListener {
    public android.widget.Button btn_catch_up;
    public android.widget.Button btn_fav;
    public android.widget.Button btn_search;
    public java.util.List<com.flextv.livestore.models.CategoryModel> categoryModels;
    public java.lang.String categoryName;
    public int category_pos;
    public com.flextv.livestore.adapter.RecyclerLiveChannelAdapter channelAdapter;
    public android.widget.ImageView channel_image;
    public java.lang.String channel_name;
    public int channel_pos;
    public java.lang.String content_url;
    public com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
    public com.flextv.livestore.adapter.EpgRecyclerAdapter epgAdapter;
    public io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> epgChannels;
    public java.util.List<com.flextv.livestore.models.CatchUpEpg> epgEventList;
    public com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 epgTicker;
    public int epgTime;
    public int error_count;
    public android.widget.EditText et_search;
    public com.flextv.livestore.apps.FocusStatus focusStatus;
    public android.os.Handler handler;
    public com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2 hideInfoTicker;
    public int hide_time;
    public android.widget.ImageButton image_audio;
    public android.widget.ImageView image_def;
    public android.widget.ImageButton image_epg;
    public android.widget.ImageButton image_fav;
    public android.widget.ImageButton image_lock;
    public android.widget.ImageButton image_search;
    public android.widget.ImageButton image_series;
    public android.widget.ImageButton image_subtitle;
    public android.widget.ImageButton image_vod;
    public boolean is_full;
    public java.lang.String key;
    public com.flextv.livestore.models.EPGChannel keySelChannel;
    public com.flextv.livestore.dlgfragment.LockDlgFragment lockDlgFragment;
    public androidx.constraintlayout.widget.ConstraintLayout ly_actions;
    public androidx.constraintlayout.widget.ConstraintLayout ly_buttons;
    public androidx.constraintlayout.widget.ConstraintLayout ly_control;
    public androidx.constraintlayout.widget.ConstraintLayout ly_surface;
    public androidx.constraintlayout.widget.ConstraintLayout main_lay;
    public com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2 moveTicker;
    public int move_pos;
    public int move_time;
    public com.google.android.exoplayer2.ExoPlayer player;
    public com.google.android.exoplayer2.ui.StyledPlayerView playerView;
    public int pre_channel_pos;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public com.flextv.livestore.view.LiveVerticalGridView recycler_channel;
    public androidx.recyclerview.widget.RecyclerView recycler_epg;
    public com.flextv.livestore.dlgfragment.LiveSearchDlgFragment searchDlgFragment;
    public android.widget.SeekBar seekBar;
    public com.flextv.livestore.models.EPGChannel selectedChannel;
    public androidx.activity.result.ActivityResultLauncher<android.content.Intent> someActivityResultLauncher;
    public java.lang.String stream_id;
    public com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters;
    public com.google.android.exoplayer2.trackselection.DefaultTrackSelector trackSelector;
    public android.widget.TextView txt_audio;
    public android.widget.TextView txt_bottom_series;
    public android.widget.TextView txt_channel_name;
    public android.widget.TextView txt_current_program;
    public android.widget.TextView txt_current_time;
    public android.widget.TextView txt_epg;
    public android.widget.TextView txt_fav;
    public android.widget.TextView txt_group;
    public android.widget.TextView txt_home;
    public android.widget.TextView txt_left;
    public android.widget.TextView txt_live;
    public android.widget.TextView txt_lock;
    public android.widget.TextView txt_movie;
    public android.widget.TextView txt_name;
    public android.widget.TextView txt_next_program;
    public android.widget.TextView txt_next_time;
    public android.widget.TextView txt_num;
    public android.widget.TextView txt_resolution;
    public android.widget.TextView txt_right;
    public android.widget.TextView txt_search;
    public android.widget.TextView txt_series;
    public android.widget.TextView txt_subtitle;
    public android.widget.TextView txt_vod;
    public com.flextv.livestore.models.WordModels wordModels;






    /* JADX INFO: renamed from: com.flextv.livestore.activities.LiveChannelActivity$6, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass6 {
        public static final /* synthetic */ int[] $SwitchMap$com$flextv$livestore$apps$FocusStatus = null;

        static {
                com.flextv.livestore.apps.FocusStatus[] r0 = com.flextv.livestore.apps.FocusStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.flextv.livestore.activities.LiveChannelActivity.AnonymousClass6.$SwitchMap$com$flextv$livestore$apps$FocusStatus = r0
                com.flextv.livestore.apps.FocusStatus r1 = com.flextv.livestore.apps.FocusStatus.first     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.flextv.livestore.activities.LiveChannelActivity.AnonymousClass6.$SwitchMap$com$flextv$livestore$apps$FocusStatus     // Catch: java.lang.NoSuchFieldError -> L1d
                com.flextv.livestore.apps.FocusStatus r1 = com.flextv.livestore.apps.FocusStatus.second     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.flextv.livestore.activities.LiveChannelActivity.AnonymousClass6.$SwitchMap$com$flextv$livestore$apps$FocusStatus     // Catch: java.lang.NoSuchFieldError -> L28
                com.flextv.livestore.apps.FocusStatus r1 = com.flextv.livestore.apps.FocusStatus.third     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public class PlayerEventListener implements com.google.android.exoplayer2.Player.Listener {
        public final /* synthetic */ com.flextv.livestore.activities.LiveChannelActivity this$0;

        private PlayerEventListener(com.flextv.livestore.activities.LiveChannelActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ PlayerEventListener(com.flextv.livestore.activities.LiveChannelActivity r1, com.flextv.livestore.activities.LiveChannelActivity.AnonymousClass1 r2) {
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
                com.flextv.livestore.activities.LiveChannelActivity r2 = r1.this$0
                com.flextv.livestore.activities.LiveChannelActivity.access$900(r2)
                com.flextv.livestore.activities.LiveChannelActivity r2 = r1.this$0
                java.lang.String r0 = r2.content_url
                com.flextv.livestore.activities.LiveChannelActivity.access$1000(r2, r0)
                goto L18
            L10:
                r0 = 3
                if (r2 != r0) goto L18
                com.flextv.livestore.activities.LiveChannelActivity r2 = r1.this$0
                r0 = 0
                r2.error_count = r0
            L18:
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
                if (r3 != r0) goto L13
                com.flextv.livestore.activities.LiveChannelActivity r3 = r2.this$0
                com.flextv.livestore.activities.LiveChannelActivity.access$900(r3)
                com.flextv.livestore.activities.LiveChannelActivity r3 = r2.this$0
                java.lang.String r0 = r3.content_url
                com.flextv.livestore.activities.LiveChannelActivity.access$1000(r3, r0)
                goto L34
            L13:
                com.flextv.livestore.activities.LiveChannelActivity r3 = r2.this$0
                int r0 = r3.error_count
                r1 = 3
                if (r0 <= r1) goto L26
                com.flextv.livestore.activities.LiveChannelActivity.access$900(r3)
                com.flextv.livestore.activities.LiveChannelActivity r3 = r2.this$0
                android.widget.ImageView r3 = r3.image_def
                r0 = 0
                r3.setVisibility(r0)
                goto L34
            L26:
                int r0 = r0 + 1
                r3.error_count = r0
                com.flextv.livestore.activities.LiveChannelActivity.access$900(r3)
                com.flextv.livestore.activities.LiveChannelActivity r3 = r2.this$0
                java.lang.String r0 = r3.content_url
                com.flextv.livestore.activities.LiveChannelActivity.access$1000(r3, r0)
            L34:
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

    public static /* synthetic */ void $r8$lambda$C9Naf1vpjmYQntabwSQAt2uAMYE(com.flextv.livestore.activities.LiveChannelActivity r0, com.flextv.livestore.models.EPGChannel r1) {
            r0.lambda$showSearchDlgFragment$1(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$QAA5MGA9I-AzIcQPImRWNsicCi4, reason: not valid java name */
    public static /* synthetic */ void m58$r8$lambda$QAA5MGA9IAzIcQPImRWNsicCi4(com.flextv.livestore.activities.LiveChannelActivity r0) {
            r0.lambda$moveTimer$7()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$iWo-LsL4WMCXLWxxtbh5FvuLOgM, reason: not valid java name */
    public static /* synthetic */ void m59$r8$lambda$iWoLsL4WMCXLWxxtbh5FvuLOgM(com.flextv.livestore.activities.LiveChannelActivity r0, androidx.activity.result.ActivityResult r1) {
            r0.lambda$new$8(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$jrCAlrugFZCx9kNfbgTzPxpzWOs(com.flextv.livestore.activities.LiveChannelActivity r0, java.lang.String r1) {
            r0.lambda$epgTimer$3(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$p0R4FM77G9PDOV6fA3THVqmtSuA(com.flextv.livestore.activities.LiveChannelActivity r0) {
            r0.lambda$mInfoHideTimer$6()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$pJ0ViEHx-xntMgfGYtoKv-FwBPc, reason: not valid java name */
    public static /* synthetic */ void m60$r8$lambda$pJ0ViEHxxntMgfGYtoKvFwBPc(com.flextv.livestore.activities.LiveChannelActivity r0) {
            r0.lambda$playSelectedChannel$2()
            return
    }

    public static /* synthetic */ void $r8$lambda$pJlrf1bZqKBjW4vCqxJ3YyVaHmA(com.flextv.livestore.activities.LiveChannelActivity r0, int r1) {
            r0.lambda$controlFav$4(r1)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r2TFOdpuITad7VuvXT7uYSuwpsk(com.flextv.livestore.activities.LiveChannelActivity r0, com.flextv.livestore.models.EPGChannel r1, java.lang.Integer r2, java.lang.Boolean r3, java.lang.Boolean r4) {
            kotlin.Unit r0 = r0.lambda$onCreate$0(r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$vhRB9AbuprF_luFId4l49ItSgKE(com.flextv.livestore.activities.LiveChannelActivity r0, int r1) {
            r0.lambda$controlLock$5(r1)
            return
    }

    static {
            java.lang.Class<com.flextv.livestore.activities.LiveChannelActivity> r0 = com.flextv.livestore.activities.LiveChannelActivity.class
            return
    }

    public LiveChannelActivity() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.category_pos = r0
            r2.channel_pos = r0
            r2.pre_channel_pos = r0
            r2.move_pos = r0
            r2.error_count = r0
            java.lang.String r1 = ""
            r2.stream_id = r1
            r2.key = r1
            r2.is_full = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.handler = r0
            r2.categoryName = r1
            com.flextv.livestore.apps.FocusStatus r0 = com.flextv.livestore.apps.FocusStatus.second
            r2.focusStatus = r0
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r0.<init>()
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda0
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r0 = r2.registerForActivityResult(r0, r1)
            r2.someActivityResultLauncher = r0
            return
    }

    public static /* synthetic */ void access$000(com.flextv.livestore.activities.LiveChannelActivity r0, com.flextv.livestore.models.EPGChannel r1) {
            r0.playSelectedChannel(r1)
            return
    }

    public static /* synthetic */ void access$100(com.flextv.livestore.activities.LiveChannelActivity r0, java.lang.String r1) {
            r0.epgTimer(r1)
            return
    }

    public static /* synthetic */ void access$1000(com.flextv.livestore.activities.LiveChannelActivity r0, java.lang.String r1) {
            r0.playVideo(r1)
            return
    }

    public static /* synthetic */ void access$1100(com.flextv.livestore.activities.LiveChannelActivity r0, java.lang.String r1) {
            r0.searchChannelsInCategory(r1)
            return
    }

    public static /* synthetic */ void access$200(com.flextv.livestore.activities.LiveChannelActivity r0, java.util.List r1) {
            r0.showEpgInfo(r1)
            return
    }

    public static /* synthetic */ void access$300(com.flextv.livestore.activities.LiveChannelActivity r0, int r1) {
            r0.changeChannelInfo(r1)
            return
    }

    public static /* synthetic */ void access$400(com.flextv.livestore.activities.LiveChannelActivity r0) {
            r0.mInfoHideTimer()
            return
    }

    public static /* synthetic */ void access$500(com.flextv.livestore.activities.LiveChannelActivity r0, java.lang.String r1) {
            r0.getShortEpg(r1)
            return
    }

    public static /* synthetic */ void access$600(com.flextv.livestore.activities.LiveChannelActivity r0, com.flextv.livestore.models.EPGChannel r1, int r2) {
            r0.controlLock(r1, r2)
            return
    }

    public static /* synthetic */ void access$700(com.flextv.livestore.activities.LiveChannelActivity r0, boolean r1) {
            r0.showLockImageIcon(r1)
            return
    }

    public static /* synthetic */ void access$900(com.flextv.livestore.activities.LiveChannelActivity r0) {
            r0.releaseMediaPlayer()
            return
    }

    private void changeChannelInfo(int r4) {
            r3 = this;
            android.widget.TextView r0 = r3.txt_group
            java.lang.String r1 = r3.categoryName
            r0.setText(r1)
            android.widget.TextView r0 = r3.txt_channel_name
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r2 = r3.epgChannels
            java.lang.Object r2 = r2.get(r4)
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            java.lang.String r2 = r2.getNum()
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r2 = r3.epgChannels
            java.lang.Object r2 = r2.get(r4)
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r3.epgChannels
            java.lang.Object r4 = r0.get(r4)
            com.flextv.livestore.models.EPGChannel r4 = (com.flextv.livestore.models.EPGChannel) r4
            java.lang.String r4 = r4.getStream_icon()
            r0 = 2131230987(0x7f08010b, float:1.8078042E38)
            if (r4 == 0) goto L63
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L63
            com.bumptech.glide.RequestManager r1 = com.bumptech.glide.Glide.with(r3)
            com.bumptech.glide.RequestBuilder r4 = r1.load(r4)
            com.bumptech.glide.request.BaseRequestOptions r4 = r4.error(r0)
            com.bumptech.glide.RequestBuilder r4 = (com.bumptech.glide.RequestBuilder) r4
            android.widget.ImageView r0 = r3.channel_image
            r4.into(r0)
            goto L7a
        L63:
            com.bumptech.glide.RequestManager r4 = com.bumptech.glide.Glide.with(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.bumptech.glide.RequestBuilder r4 = r4.load(r1)
            com.bumptech.glide.request.BaseRequestOptions r4 = r4.error(r0)
            com.bumptech.glide.RequestBuilder r4 = (com.bumptech.glide.RequestBuilder) r4
            android.widget.ImageView r0 = r3.channel_image
            r4.into(r0)
        L7a:
            return
    }

    private void controlFav(com.flextv.livestore.models.EPGChannel r5, int r6) {
            r4 = this;
            if (r5 == 0) goto L2e
            java.util.List<java.lang.String> r0 = com.flextv.livestore.apps.Constants.xxx_live_categories
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r4.categoryModels
            int r2 = r4.category_pos
            java.lang.Object r1 = r1.get(r2)
            com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
            java.lang.String r1 = r1.getId()
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L2e
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r1 = r5.getName()
            boolean r5 = r5.is_favorite()
            r2 = 1
            r5 = r5 ^ r2
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda1 r3 = new com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda1
            r3.<init>(r4, r6, r2)
            r0.addToFavChannels(r1, r5, r3)
        L2e:
            return
    }

    private void controlLock(com.flextv.livestore.models.EPGChannel r5, int r6) {
            r4 = this;
            if (r5 == 0) goto L2f
            java.util.List<java.lang.String> r0 = com.flextv.livestore.apps.Constants.xxx_live_categories
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r4.categoryModels
            int r2 = r4.category_pos
            java.lang.Object r1 = r1.get(r2)
            com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
            java.lang.String r1 = r1.getId()
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L2f
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            java.lang.String r1 = r5.getName()
            boolean r5 = r5.is_locked()
            r5 = r5 ^ 1
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda1 r2 = new com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda1
            r3 = 0
            r2.<init>(r4, r6, r3)
            r0.addToLockChannels(r1, r5, r2)
        L2f:
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

    private void epgTimer(java.lang.String r3) {
            r2 = this;
            r0 = 1
            r2.epgTime = r0
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0
            r1 = 4
            r0.<init>(r2, r3, r1)
            r2.epgTicker = r0
            r0.run()
            return
    }

    private void findAndShowChannel() {
            r2 = this;
            int r0 = r2.move_pos
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            int r1 = r1.getAllEpgChannelSize()
            int r1 = r1 + (-1)
            if (r0 <= r1) goto L22
            android.widget.TextView r0 = r2.txt_num
            java.lang.String r1 = ""
            r0.setText(r1)
            r2.key = r1
            r0 = 0
            r2.move_pos = r0
            android.os.Handler r0 = r2.handler
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2 r1 = r2.moveTicker
            r0.removeCallbacks(r1)
            goto L33
        L22:
            android.widget.TextView r0 = r2.txt_num
            java.lang.String r1 = r2.key
            r0.setText(r1)
            android.os.Handler r0 = r2.handler
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2 r1 = r2.moveTicker
            r0.removeCallbacks(r1)
            r2.moveTimer()
        L33:
            return
    }

    private void findChannelInfo() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r2 = r4.epgChannels
            int r2 = r2.size()
            if (r1 >= r2) goto L2d
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r2 = r4.epgChannels
            java.lang.Object r2 = r2.get(r1)
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            java.lang.String r2 = r2.getNum()
            int r2 = java.lang.Integer.parseInt(r2)
            int r3 = r4.move_pos
            if (r2 != r3) goto L2a
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r2 = r4.epgChannels
            java.lang.Object r2 = r2.get(r1)
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            r4.keySelChannel = r2
            r4.channel_pos = r1
        L2a:
            int r1 = r1 + 1
            goto L2
        L2d:
            com.flextv.livestore.models.EPGChannel r1 = r4.keySelChannel
            r2 = 8
            java.lang.String r3 = ""
            if (r1 != 0) goto L4f
            r4.key = r3
            android.widget.TextView r1 = r4.txt_num
            r1.setText(r3)
            android.widget.TextView r1 = r4.txt_num
            r1.setVisibility(r2)
            com.flextv.livestore.models.WordModels r1 = r4.wordModels
            java.lang.String r1 = r1.getNo_channels()
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r1, r0)
            r0.show()
            goto Lae
        L4f:
            r4.key = r3
            android.widget.TextView r1 = r4.txt_num
            r1.setText(r3)
            android.widget.TextView r1 = r4.txt_num
            r1.setVisibility(r2)
            com.flextv.livestore.models.EPGChannel r1 = r4.keySelChannel
            java.lang.String r1 = r1.getCategory_id()
            com.flextv.livestore.models.EPGChannel r3 = r4.keySelChannel
            java.lang.String r3 = r3.getCategory_name()
            boolean r1 = r4.isAdultChannel(r1, r3)
            if (r1 == 0) goto L76
            com.flextv.livestore.models.EPGChannel r0 = r4.keySelChannel
            int r1 = r4.channel_pos
            r2 = 2
            r4.showChannelLockDlgFragment(r0, r1, r2)
            goto Lae
        L76:
            com.flextv.livestore.models.EPGChannel r1 = r4.keySelChannel
            r4.playSelectedChannel(r1)
            com.flextv.livestore.view.LiveVerticalGridView r1 = r4.recycler_channel
            int r3 = r4.channel_pos
            r1.setSelectedPosition(r3)
            android.os.Handler r1 = r4.handler
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r3 = r4.epgTicker
            r1.removeCallbacks(r3)
            java.lang.String r1 = r4.stream_id
            r4.getShortEpg(r1)
            int r1 = r4.channel_pos
            r4.changeChannelInfo(r1)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r4.ly_control
            int r1 = r1.getVisibility()
            if (r1 != r2) goto La4
            boolean r1 = r4.is_full
            if (r1 == 0) goto La4
            androidx.constraintlayout.widget.ConstraintLayout r1 = r4.ly_control
            r1.setVisibility(r0)
        La4:
            android.os.Handler r0 = r4.handler
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2 r1 = r4.hideInfoTicker
            r0.removeCallbacks(r1)
            r4.mInfoHideTimer()
        Lae:
            return
    }

    private int getRealChannelPosition(com.flextv.livestore.models.EPGChannel r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r1 = r5.epgChannels
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L9:
            int r3 = r0.size()
            if (r2 >= r3) goto L27
            java.lang.Object r3 = r0.get(r2)
            com.flextv.livestore.models.EPGChannel r3 = (com.flextv.livestore.models.EPGChannel) r3
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = r6.getName()
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L24
            return r2
        L24:
            int r2 = r2 + 1
            goto L9
        L27:
            return r1
    }

    private void getShortEpg(java.lang.String r4) {
            r3 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r3.preferenceHelper     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = r0.getSharedPreferenceServerUrl()     // Catch: java.lang.Exception -> L23
            com.flextv.livestore.remote.APIService r0 = com.flextv.livestore.remote.RetroClass.getAPIService(r0)     // Catch: java.lang.Exception -> L23
            com.flextv.livestore.helper.PreferenceHelper r1 = r3.preferenceHelper     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = r1.getSharedPreferenceUsername()     // Catch: java.lang.Exception -> L23
            com.flextv.livestore.helper.PreferenceHelper r2 = r3.preferenceHelper     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = r2.getSharedPreferencePassword()     // Catch: java.lang.Exception -> L23
            retrofit2.Call r4 = r0.get_short_epg(r1, r2, r4)     // Catch: java.lang.Exception -> L23
            com.flextv.livestore.activities.LiveChannelActivity$3 r0 = new com.flextv.livestore.activities.LiveChannelActivity$3     // Catch: java.lang.Exception -> L23
            r0.<init>(r3)     // Catch: java.lang.Exception -> L23
            r4.enqueue(r0)     // Catch: java.lang.Exception -> L23
            goto L27
        L23:
            r4 = 0
            r3.showEpgInfo(r4)
        L27:
            return
    }

    private void goToCatchupActivity() {
            r2 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            boolean r0 = r0.getSharedPreferenceISM3U()
            if (r0 == 0) goto L17
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getNo_epg_avaliable()
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            goto L32
        L17:
            com.flextv.livestore.models.EPGChannel r0 = r2.selectedChannel
            if (r0 == 0) goto L32
            r2.releaseMediaPlayer()
            com.flextv.livestore.models.EPGChannel r0 = r2.selectedChannel
            java.lang.String r0 = r0.getName()
            com.flextv.livestore.apps.LTVApp.channelName = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.CatchUpActivity> r1 = com.flextv.livestore.activities.CatchUpActivity.class
            r0.<init>(r2, r1)
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r1 = r2.someActivityResultLauncher
            r1.launch(r0)
        L32:
            return
    }

    private void goToSearchActivity() {
            r3 = this;
            r3.releaseMediaPlayer()
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.flextv.livestore.activities.SearchActivity> r1 = com.flextv.livestore.activities.SearchActivity.class
            r0.<init>(r3, r1)
            java.lang.String r1 = "is_live"
            r2 = 1
            r0.putExtra(r1, r2)
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r1 = r3.someActivityResultLauncher
            r1.launch(r0)
            return
    }

    private void goToSeriesActivity() {
            r3 = this;
            r3.releaseMediaPlayer()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "is_changed"
            java.lang.String r2 = "series"
            r0.putExtra(r1, r2)
            r1 = -1
            r3.setResult(r1, r0)
            r3.finish()
            return
    }

    private void goToVodActivity() {
            r3 = this;
            r3.releaseMediaPlayer()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "is_changed"
            java.lang.String r2 = "movie"
            r0.putExtra(r1, r2)
            r1 = -1
            r3.setResult(r1, r0)
            r3.finish()
            return
    }

    private void initView() {
            r10 = this;
            r0 = 2131427707(0x7f0b017b, float:1.8477038E38)
            android.view.View r0 = r10.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r10.main_lay = r0
            r0 = 2131428061(0x7f0b02dd, float:1.8477756E38)
            android.view.View r0 = r10.findViewById(r0)
            com.google.android.exoplayer2.ui.StyledPlayerView r0 = (com.google.android.exoplayer2.ui.StyledPlayerView) r0
            r10.playerView = r0
            r1 = 3
            r0.setResizeMode(r1)
            com.google.android.exoplayer2.ui.StyledPlayerView r0 = r10.playerView
            com.google.android.exoplayer2.ui.SubtitleView r0 = r0.getSubtitleView()
            r2 = 0
            r0.setApplyEmbeddedStyles(r2)
            com.google.android.exoplayer2.ui.CaptionStyleCompat r0 = new com.google.android.exoplayer2.ui.CaptionStyleCompat
            com.flextv.livestore.helper.PreferenceHelper r3 = r10.preferenceHelper
            java.lang.String r3 = r3.getSharedPreferenceSubtitleColor()
            int r4 = android.graphics.Color.parseColor(r3)
            com.flextv.livestore.helper.PreferenceHelper r3 = r10.preferenceHelper
            java.lang.String r3 = r3.getSharedPreferenceSubtitleBgColor()
            int r5 = android.graphics.Color.parseColor(r3)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.google.android.exoplayer2.ui.StyledPlayerView r3 = r10.playerView
            com.google.android.exoplayer2.ui.SubtitleView r3 = r3.getSubtitleView()
            com.flextv.livestore.helper.PreferenceHelper r4 = r10.preferenceHelper
            int r4 = r4.getSharedPreferenceSubtitleSize()
            float r4 = (float) r4
            r3.setFixedTextSize(r1, r4)
            com.google.android.exoplayer2.ui.StyledPlayerView r1 = r10.playerView
            com.google.android.exoplayer2.ui.SubtitleView r1 = r1.getSubtitleView()
            r1.setStyle(r0)
            r0 = 2131428328(0x7f0b03e8, float:1.8478297E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_num = r0
            r0 = 2131428313(0x7f0b03d9, float:1.8478267E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_home = r0
            r0 = 2131428316(0x7f0b03dc, float:1.8478273E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_live = r0
            r0 = 2131428322(0x7f0b03e2, float:1.8478285E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_movie = r0
            r0 = 2131428343(0x7f0b03f7, float:1.8478328E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_series = r0
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_name = r0
            r0 = 2131427629(0x7f0b012d, float:1.847688E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r10.et_search = r0
            r0 = 2131428075(0x7f0b02eb, float:1.8477784E38)
            android.view.View r0 = r10.findViewById(r0)
            com.flextv.livestore.view.LiveVerticalGridView r0 = (com.flextv.livestore.view.LiveVerticalGridView) r0
            r10.recycler_channel = r0
            r0 = 2131427925(0x7f0b0255, float:1.847748E38)
            android.view.View r0 = r10.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r10.ly_surface = r0
            r0 = 2131428078(0x7f0b02ee, float:1.847779E38)
            android.view.View r0 = r10.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r10.recycler_epg = r0
            r0 = 2131427469(0x7f0b008d, float:1.8476555E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r10.btn_fav = r0
            r0 = 2131427466(0x7f0b008a, float:1.847655E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r10.btn_catch_up = r0
            r0 = 2131427487(0x7f0b009f, float:1.8476592E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r10.btn_search = r0
            r0 = 2131428314(0x7f0b03da, float:1.847827E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_left = r0
            r0 = 2131428339(0x7f0b03f3, float:1.847832E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_right = r0
            r0 = 2131428304(0x7f0b03d0, float:1.8478249E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_epg = r0
            r0 = 2131428317(0x7f0b03dd, float:1.8478275E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_lock = r0
            r0 = 2131428355(0x7f0b0403, float:1.8478352E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_vod = r0
            r0 = 2131428340(0x7f0b03f4, float:1.8478322E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_search = r0
            r0 = 2131428285(0x7f0b03bd, float:1.847821E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_bottom_series = r0
            r0 = 2131428308(0x7f0b03d4, float:1.8478257E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_fav = r0
            r0 = 2131428348(0x7f0b03fc, float:1.8478338E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_subtitle = r0
            r0 = 2131428283(0x7f0b03bb, float:1.8478206E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_audio = r0
            android.widget.TextView r0 = r10.txt_left
            com.flextv.livestore.models.WordModels r1 = r10.wordModels
            java.lang.String r1 = r1.getPrevious_channel()
            r0.setText(r1)
            android.widget.TextView r0 = r10.txt_right
            com.flextv.livestore.models.WordModels r1 = r10.wordModels
            java.lang.String r1 = r1.getNext_channel()
            r0.setText(r1)
            android.widget.TextView r0 = r10.txt_home
            com.flextv.livestore.models.WordModels r1 = r10.wordModels
            java.lang.String r1 = r1.getHome()
            r0.setText(r1)
            android.widget.TextView r0 = r10.txt_live
            com.flextv.livestore.models.WordModels r1 = r10.wordModels
            java.lang.String r1 = r1.getLive_tv()
            r0.setText(r1)
            android.widget.TextView r0 = r10.txt_movie
            com.flextv.livestore.models.WordModels r1 = r10.wordModels
            java.lang.String r1 = r1.getMovies()
            r0.setText(r1)
            android.widget.TextView r0 = r10.txt_series
            com.flextv.livestore.models.WordModels r1 = r10.wordModels
            java.lang.String r1 = r1.getSeries()
            r0.setText(r1)
            android.widget.Button r0 = r10.btn_catch_up
            com.flextv.livestore.models.WordModels r1 = r10.wordModels
            java.lang.String r1 = r1.getCatch_up()
            r0.setText(r1)
            android.widget.Button r0 = r10.btn_search
            com.flextv.livestore.models.WordModels r1 = r10.wordModels
            java.lang.String r1 = r1.getSearch()
            r0.setText(r1)
            android.widget.Button r0 = r10.btn_fav
            com.flextv.livestore.models.WordModels r1 = r10.wordModels
            java.lang.String r1 = r1.getAdd_to_favorite()
            r0.setText(r1)
            android.widget.TextView r0 = r10.txt_epg
            com.flextv.livestore.models.WordModels r1 = r10.wordModels
            java.lang.String r1 = r1.getEpg()
            r0.setText(r1)
            android.widget.TextView r0 = r10.txt_lock
            com.flextv.livestore.models.WordModels r1 = r10.wordModels
            java.lang.String r1 = r1.getLock()
            r0.setText(r1)
            android.widget.TextView r0 = r10.txt_vod
            com.flextv.livestore.models.WordModels r1 = r10.wordModels
            java.lang.String r1 = r1.getMovies()
            r0.setText(r1)
            android.widget.TextView r0 = r10.txt_search
            com.flextv.livestore.models.WordModels r1 = r10.wordModels
            java.lang.String r1 = r1.getSearch()
            r0.setText(r1)
            android.widget.TextView r0 = r10.txt_bottom_series
            com.flextv.livestore.models.WordModels r1 = r10.wordModels
            java.lang.String r1 = r1.getSeries()
            r0.setText(r1)
            android.widget.TextView r0 = r10.txt_fav
            com.flextv.livestore.models.WordModels r1 = r10.wordModels
            java.lang.String r1 = r1.getFavorite()
            r0.setText(r1)
            android.widget.TextView r0 = r10.txt_subtitle
            com.flextv.livestore.models.WordModels r1 = r10.wordModels
            java.lang.String r1 = r1.getSubtitle()
            r0.setText(r1)
            android.widget.TextView r0 = r10.txt_audio
            com.flextv.livestore.models.WordModels r1 = r10.wordModels
            java.lang.String r1 = r1.getAudio_track()
            r0.setText(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r10.recycler_channel
            r1 = 1
            r0.setNumColumns(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r10.recycler_channel
            r0.setLoop(r2)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r10.recycler_channel
            r0.setPreserveFocusAfterLayout(r1)
            android.view.View[] r0 = new android.view.View[r1]
            r1 = 0
            r0[r2] = r1
            com.flextv.livestore.view.LiveVerticalGridView r1 = r10.recycler_channel
            com.flextv.livestore.activities.LiveChannelActivity$4 r2 = new com.flextv.livestore.activities.LiveChannelActivity$4
            r2.<init>(r0)
            r1.setOnChildViewHolderSelectedListener(r2)
            r0 = 2131427901(0x7f0b023d, float:1.8477431E38)
            android.view.View r0 = r10.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r10.ly_control = r0
            r0 = 2131427894(0x7f0b0236, float:1.8477417E38)
            android.view.View r0 = r10.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r10.ly_buttons = r0
            r0 = 2131427888(0x7f0b0230, float:1.8477405E38)
            android.view.View r0 = r10.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r10.ly_actions = r0
            r0 = 2131427903(0x7f0b023f, float:1.8477435E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 2131427929(0x7f0b0259, float:1.8477488E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 2131427920(0x7f0b0250, float:1.847747E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 2131427905(0x7f0b0241, float:1.847744E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 2131427918(0x7f0b024e, float:1.8477466E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 2131427923(0x7f0b0253, float:1.8477476E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 2131427890(0x7f0b0232, float:1.847741E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 2131427910(0x7f0b0246, float:1.847745E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 2131427795(0x7f0b01d3, float:1.8477216E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r10.image_epg = r0
            r0 = 2131427824(0x7f0b01f0, float:1.8477275E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r10.image_vod = r0
            r0 = 2131427816(0x7f0b01e8, float:1.8477259E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r10.image_series = r0
            r0 = 2131427818(0x7f0b01ea, float:1.8477263E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r10.image_subtitle = r0
            r0 = 2131427780(0x7f0b01c4, float:1.8477186E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r10.image_audio = r0
            r0 = 2131427804(0x7f0b01dc, float:1.8477235E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r10.image_lock = r0
            r0 = 2131427798(0x7f0b01d6, float:1.8477222E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r10.image_fav = r0
            r0 = 2131427815(0x7f0b01e7, float:1.8477257E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r10.image_search = r0
            r0 = 2131428135(0x7f0b0327, float:1.8477906E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            r10.seekBar = r0
            r0 = 2131428297(0x7f0b03c9, float:1.8478235E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_current_time = r0
            r0 = 2131428296(0x7f0b03c8, float:1.8478232E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_current_program = r0
            r0 = 2131428326(0x7f0b03e6, float:1.8478293E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_next_time = r0
            r0 = 2131428325(0x7f0b03e5, float:1.8478291E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_next_program = r0
            r0 = 2131428310(0x7f0b03d6, float:1.847826E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_group = r0
            r0 = 2131428291(0x7f0b03c3, float:1.8478222E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_channel_name = r0
            r0 = 2131428338(0x7f0b03f2, float:1.8478318E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_resolution = r0
            r0 = 2131427514(0x7f0b00ba, float:1.8476646E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r10.channel_image = r0
            r0 = 2131427792(0x7f0b01d0, float:1.847721E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r10.image_def = r0
            android.widget.ImageButton r0 = r10.image_epg
            r0.setOnFocusChangeListener(r10)
            android.widget.ImageButton r0 = r10.image_vod
            r0.setOnFocusChangeListener(r10)
            android.widget.ImageButton r0 = r10.image_series
            r0.setOnFocusChangeListener(r10)
            android.widget.ImageButton r0 = r10.image_fav
            r0.setOnFocusChangeListener(r10)
            android.widget.ImageButton r0 = r10.image_search
            r0.setOnFocusChangeListener(r10)
            android.widget.ImageButton r0 = r10.image_subtitle
            r0.setOnFocusChangeListener(r10)
            android.widget.ImageButton r0 = r10.image_audio
            r0.setOnFocusChangeListener(r10)
            android.widget.ImageButton r0 = r10.image_lock
            r0.setOnFocusChangeListener(r10)
            android.widget.ImageButton r0 = r10.image_epg
            r0.setOnClickListener(r10)
            android.widget.ImageButton r0 = r10.image_vod
            r0.setOnClickListener(r10)
            android.widget.ImageButton r0 = r10.image_series
            r0.setOnClickListener(r10)
            android.widget.ImageButton r0 = r10.image_fav
            r0.setOnClickListener(r10)
            android.widget.ImageButton r0 = r10.image_search
            r0.setOnClickListener(r10)
            android.widget.ImageButton r0 = r10.image_subtitle
            r0.setOnClickListener(r10)
            android.widget.ImageButton r0 = r10.image_lock
            r0.setOnClickListener(r10)
            android.widget.TextView r0 = r10.txt_live
            r0.setOnClickListener(r10)
            android.widget.TextView r0 = r10.txt_home
            r0.setOnClickListener(r10)
            android.widget.TextView r0 = r10.txt_series
            r0.setOnClickListener(r10)
            android.widget.TextView r0 = r10.txt_movie
            r0.setOnClickListener(r10)
            android.widget.Button r0 = r10.btn_fav
            r0.setOnClickListener(r10)
            android.widget.Button r0 = r10.btn_catch_up
            r0.setOnClickListener(r10)
            android.widget.Button r0 = r10.btn_search
            r0.setOnClickListener(r10)
            android.widget.ImageButton r0 = r10.image_audio
            r0.setOnClickListener(r10)
            android.widget.EditText r0 = r10.et_search
            com.flextv.livestore.activities.LiveChannelActivity$5 r1 = new com.flextv.livestore.activities.LiveChannelActivity$5
            r1.<init>(r10)
            r0.addTextChangedListener(r1)
            return
    }

    private boolean isAdultChannel(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r1.preferenceHelper
            boolean r0 = r0.getSharedPreferenceISM3U()
            if (r0 == 0) goto L26
            java.lang.String r2 = "adult"
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L24
            java.lang.String r2 = "xxx"
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L24
            java.lang.String r2 = "porn"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L22
            goto L24
        L22:
            r2 = 0
            goto L25
        L24:
            r2 = 1
        L25:
            return r2
        L26:
            java.util.List<java.lang.String> r3 = com.flextv.livestore.apps.Constants.xxx_live_categories
            boolean r2 = r3.contains(r2)
            return r2
    }

    private /* synthetic */ void lambda$controlFav$4(int r5) {
            r4 = this;
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r4.categoryModels
            int r1 = r4.category_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = "fav_id"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1c
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r0 = r4.channelAdapter
            r0.notifyItemChanged(r5)
            goto L44
        L1c:
            com.flextv.livestore.helper.RealmController r5 = com.flextv.livestore.helper.RealmController.with()
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r4.categoryModels
            int r1 = r4.category_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            com.flextv.livestore.helper.PreferenceHelper r1 = r4.preferenceHelper
            boolean r1 = r1.getSharedPreferenceISM3U()
            com.flextv.livestore.helper.PreferenceHelper r2 = r4.preferenceHelper
            int r2 = r2.getSharedPreferenceLiveOrder()
            java.lang.String r3 = ""
            io.realm.RealmResults r5 = r5.getLiveChannelsByCategory(r0, r3, r1, r2)
            r4.epgChannels = r5
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r0 = r4.channelAdapter
            r1 = 0
            r0.updateData(r5, r1)
        L44:
            com.flextv.livestore.helper.PreferenceHelper r5 = r4.preferenceHelper
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            java.util.List r0 = r0.getFavChannelNames()
            r5.setSharedPreferenceLiveFavChannels(r0)
            return
    }

    private /* synthetic */ void lambda$controlLock$5(int r5) {
            r4 = this;
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r4.categoryModels
            int r1 = r4.category_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = "lock_id"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1c
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r0 = r4.channelAdapter
            r0.notifyItemChanged(r5)
            goto L44
        L1c:
            com.flextv.livestore.helper.RealmController r5 = com.flextv.livestore.helper.RealmController.with()
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r4.categoryModels
            int r1 = r4.category_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            com.flextv.livestore.helper.PreferenceHelper r1 = r4.preferenceHelper
            boolean r1 = r1.getSharedPreferenceISM3U()
            com.flextv.livestore.helper.PreferenceHelper r2 = r4.preferenceHelper
            int r2 = r2.getSharedPreferenceLiveOrder()
            java.lang.String r3 = ""
            io.realm.RealmResults r5 = r5.getLiveChannelsByCategory(r0, r3, r1, r2)
            r4.epgChannels = r5
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r0 = r4.channelAdapter
            r1 = 0
            r0.updateData(r5, r1)
        L44:
            com.flextv.livestore.helper.PreferenceHelper r5 = r4.preferenceHelper
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            java.util.List r0 = r0.getLockChannelNames()
            r5.setSharedPreferenceLiveLockChannels(r0)
            return
    }

    private /* synthetic */ void lambda$epgTimer$3(java.lang.String r2) {
            r1 = this;
            int r0 = r1.epgTime
            if (r0 != 0) goto L8
            r1.getShortEpg(r2)
            return
        L8:
            r1.runNextEpgTicker()
            return
    }

    private /* synthetic */ void lambda$mInfoHideTimer$6() {
            r2 = this;
            int r0 = r2.hide_time
            if (r0 != 0) goto L1b
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.ly_control
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L1b
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.ly_control
            r1 = 8
            r0.setVisibility(r1)
            com.flextv.livestore.apps.FocusStatus r0 = com.flextv.livestore.apps.FocusStatus.second
            r2.focusStatus = r0
            r0 = 0
            r2.showAndHideActionsButtons(r0)
        L1b:
            r2.moveNexHideTicker()
            return
    }

    private /* synthetic */ void lambda$moveTimer$7() {
            r2 = this;
            android.os.Handler r0 = r2.handler
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2 r1 = r2.moveTicker
            r0.removeCallbacks(r1)
            int r0 = r2.move_time
            if (r0 != 0) goto Le
            r2.findChannelInfo()
        Le:
            r2.moveNextTicker()
            return
    }

    private /* synthetic */ void lambda$new$8(androidx.activity.result.ActivityResult r7) {
            r6 = this;
            int r0 = r7.getResultCode()
            r1 = -1
            if (r0 != r1) goto Lc0
            android.content.Intent r7 = r7.getData()
            if (r7 == 0) goto Lc0
            java.lang.String r0 = "is_changed"
            java.lang.String r7 = r7.getStringExtra(r0)
            java.lang.String r0 = "from_search"
            boolean r7 = r7.equalsIgnoreCase(r0)
            r0 = 0
            if (r7 == 0) goto Lac
            r7 = 1
            r6.is_full = r7
            r6.setFull()
            com.flextv.livestore.helper.PreferenceHelper r1 = r6.preferenceHelper
            int r1 = r1.getSharedPreferenceCategoryPos()
            r6.category_pos = r1
            com.flextv.livestore.helper.PreferenceHelper r1 = r6.preferenceHelper
            int r1 = r1.getSharedPreferenceChannelPos()
            r6.channel_pos = r1
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            java.util.List<com.flextv.livestore.models.CategoryModel> r2 = r6.categoryModels
            int r3 = r6.category_pos
            java.lang.Object r2 = r2.get(r3)
            com.flextv.livestore.models.CategoryModel r2 = (com.flextv.livestore.models.CategoryModel) r2
            com.flextv.livestore.helper.PreferenceHelper r3 = r6.preferenceHelper
            boolean r3 = r3.getSharedPreferenceISM3U()
            com.flextv.livestore.helper.PreferenceHelper r4 = r6.preferenceHelper
            int r4 = r4.getSharedPreferenceLiveOrder()
            java.lang.String r5 = ""
            io.realm.RealmResults r1 = r1.getLiveChannelsByCategory(r2, r5, r3, r4)
            r6.epgChannels = r1
            int r2 = r6.channel_pos
            int r1 = r1.size()
            int r1 = r1 - r7
            if (r2 <= r1) goto L5f
            r6.channel_pos = r0
        L5f:
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r7 = r6.channelAdapter
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r1 = r6.epgChannels
            int r2 = r6.channel_pos
            r7.updateData(r1, r2)
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r7 = r6.epgChannels
            int r1 = r6.channel_pos
            java.lang.Object r7 = r7.get(r1)
            com.flextv.livestore.models.EPGChannel r7 = (com.flextv.livestore.models.EPGChannel) r7
            r6.selectedChannel = r7
            com.flextv.livestore.helper.PreferenceHelper r7 = r6.preferenceHelper
            boolean r7 = r7.getSharedPreferenceISM3U()
            if (r7 != 0) goto L8d
            android.os.Handler r7 = r6.handler
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r1 = r6.epgTicker
            r7.removeCallbacks(r1)
            com.flextv.livestore.models.EPGChannel r7 = r6.selectedChannel
            java.lang.String r7 = r7.getStream_id()
            r6.epgTimer(r7)
            goto L91
        L8d:
            r7 = 0
            r6.showEpgInfo(r7)
        L91:
            com.flextv.livestore.models.EPGChannel r7 = r6.selectedChannel
            java.lang.String r7 = r7.getName()
            r6.channel_name = r7
            android.widget.TextView r1 = r6.txt_name
            r1.setText(r7)
            com.flextv.livestore.models.EPGChannel r7 = r6.selectedChannel
            boolean r7 = r7.is_favorite()
            r6.showFavImageIcon(r7)
            int r7 = r6.channel_pos
            r6.changeChannelInfo(r7)
        Lac:
            com.flextv.livestore.models.EPGChannel r7 = r6.selectedChannel
            r6.playSelectedChannel(r7)
            r6.setFocusButtons(r0)
            com.flextv.livestore.view.LiveVerticalGridView r7 = r6.recycler_channel
            r7.requestFocus()
            com.flextv.livestore.view.LiveVerticalGridView r7 = r6.recycler_channel
            int r0 = r6.channel_pos
            r7.setSelectedPosition(r0)
        Lc0:
            return
    }

    private /* synthetic */ kotlin.Unit lambda$onCreate$0(com.flextv.livestore.models.EPGChannel r3, java.lang.Integer r4, java.lang.Boolean r5, java.lang.Boolean r6) {
            r2 = this;
            int r0 = r4.intValue()
            r2.pre_channel_pos = r0
            boolean r5 = r5.booleanValue()
            r0 = 0
            if (r5 == 0) goto La8
            boolean r5 = r2.is_full
            if (r5 != 0) goto Lf2
            java.lang.String r5 = r2.stream_id
            java.lang.String r6 = r3.getStream_id()
            boolean r5 = r5.equalsIgnoreCase(r6)
            r6 = 0
            if (r5 == 0) goto L3f
            java.util.List<com.flextv.livestore.models.CategoryModel> r3 = r2.categoryModels
            int r4 = r2.category_pos
            java.lang.Object r3 = r3.get(r4)
            com.flextv.livestore.models.CategoryModel r3 = (com.flextv.livestore.models.CategoryModel) r3
            java.lang.String r3 = r3.getId()
            java.lang.String r4 = "resume_id"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L37
            r2.channel_pos = r6
        L37:
            r3 = 1
            r2.is_full = r3
            r2.setFull()
            goto Lf2
        L3f:
            java.util.List<com.flextv.livestore.models.CategoryModel> r5 = r2.categoryModels
            int r1 = r2.category_pos
            java.lang.Object r5 = r5.get(r1)
            com.flextv.livestore.models.CategoryModel r5 = (com.flextv.livestore.models.CategoryModel) r5
            java.lang.String r5 = r5.getId()
            java.lang.String r1 = "all_id"
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 == 0) goto L6c
            java.lang.String r5 = r3.getCategory_id()
            java.lang.String r1 = r3.getCategory_name()
            boolean r5 = r2.isAdultChannel(r5, r1)
            if (r5 == 0) goto L6c
            int r4 = r4.intValue()
            r2.showChannelLockDlgFragment(r3, r4, r6)
            goto Lf2
        L6c:
            java.lang.String r5 = r3.getCategory_id()
            java.lang.String r1 = r3.getCategory_name()
            boolean r5 = r2.isAdultChannel(r5, r1)
            if (r5 != 0) goto L9e
            java.util.List<com.flextv.livestore.models.CategoryModel> r5 = r2.categoryModels
            int r1 = r2.category_pos
            java.lang.Object r5 = r5.get(r1)
            com.flextv.livestore.models.CategoryModel r5 = (com.flextv.livestore.models.CategoryModel) r5
            java.lang.String r5 = r5.getId()
            java.lang.String r1 = "lock_id"
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 != 0) goto L9e
            boolean r5 = r3.is_locked()
            if (r5 == 0) goto L9e
            int r4 = r4.intValue()
            r2.showChannelLockDlgFragment(r3, r4, r6)
            goto Lf2
        L9e:
            int r4 = r4.intValue()
            r2.channel_pos = r4
            r2.playSelectedChannel(r3)
            goto Lf2
        La8:
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto Lbd
            int r4 = r4.intValue()
            r2.controlFav(r3, r4)
            boolean r3 = r3.is_favorite()
            r2.showFavImageIcon(r3)
            goto Lf2
        Lbd:
            boolean r4 = r2.is_full
            if (r4 != 0) goto Lf2
            com.flextv.livestore.helper.PreferenceHelper r4 = r2.preferenceHelper
            boolean r4 = r4.getSharedPreferenceISM3U()
            if (r4 != 0) goto Ld8
            android.os.Handler r4 = r2.handler
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r5 = r2.epgTicker
            r4.removeCallbacks(r5)
            java.lang.String r4 = r3.getStream_id()
            r2.epgTimer(r4)
            goto Ldb
        Ld8:
            r2.showEpgInfo(r0)
        Ldb:
            java.lang.String r4 = r3.getName()
            r2.channel_name = r4
            android.widget.TextView r5 = r2.txt_name
            r5.setText(r4)
            boolean r3 = r3.is_favorite()
            r2.showFavImageIcon(r3)
            int r3 = r2.pre_channel_pos
            r2.changeChannelInfo(r3)
        Lf2:
            return r0
    }

    private /* synthetic */ void lambda$playSelectedChannel$2() {
            r2 = this;
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r2.categoryModels
            int r1 = r2.category_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = "resume_id"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L2e
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r0 = r2.channelAdapter
            r0.notifyDataSetChanged()
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r0 = r2.channelAdapter
            r1 = 0
            r0.setSelectedPosition(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r2.recycler_channel
            r0.scrollToPosition(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r2.recycler_channel
            r0.setSelectedPosition(r1)
            r2.channel_pos = r1
        L2e:
            return
    }

    private /* synthetic */ void lambda$showSearchDlgFragment$1(com.flextv.livestore.models.EPGChannel r6) {
            r5 = this;
            r5.releaseMediaPlayer()
            android.widget.EditText r0 = r5.et_search
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L75
            int r0 = r5.category_pos
            r2 = 4
            java.lang.String r3 = ""
            if (r0 <= r2) goto L56
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.preferenceHelper
            java.util.List r2 = r2.getSharedPreferenceMyGroupCategory()
            int r2 = r2.size()
            int r2 = r2 + 5
            if (r0 >= r2) goto L56
            com.flextv.livestore.helper.PreferenceHelper r0 = r5.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceMyGroupCategory()
            int r0 = r0.size()
            if (r0 <= 0) goto L70
            com.flextv.livestore.helper.PreferenceHelper r0 = r5.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceMyGroupCategory()
            int r2 = r5.category_pos
            int r2 = r2 + (-5)
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.preferenceHelper
            java.util.List r0 = r2.getSharedPreferenceMyGroupChannels(r0)
            com.flextv.livestore.helper.RealmController r2 = com.flextv.livestore.helper.RealmController.with()
            io.realm.RealmResults r0 = r2.getEpgChannelsByNameArray(r0, r3)
            r5.epgChannels = r0
            goto L70
        L56:
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            java.util.List<com.flextv.livestore.models.CategoryModel> r2 = r5.categoryModels
            int r4 = r5.category_pos
            java.lang.Object r2 = r2.get(r4)
            com.flextv.livestore.models.CategoryModel r2 = (com.flextv.livestore.models.CategoryModel) r2
            com.flextv.livestore.helper.PreferenceHelper r4 = r5.preferenceHelper
            boolean r4 = r4.getSharedPreferenceISM3U()
            io.realm.RealmResults r0 = r0.getLiveChannelsByCategory(r2, r3, r4, r1)
            r5.epgChannels = r0
        L70:
            android.widget.EditText r0 = r5.et_search
            r0.setText(r3)
        L75:
            int r0 = r5.getRealChannelPosition(r6)
            r5.channel_pos = r0
            com.flextv.livestore.view.LiveVerticalGridView r2 = r5.recycler_channel
            r2.setSelectedPosition(r0)
            r5.playSelectedChannel(r6)
            com.flextv.livestore.helper.PreferenceHelper r6 = r5.preferenceHelper
            boolean r6 = r6.getSharedPreferenceISM3U()
            if (r6 == 0) goto L90
            r6 = 0
            r5.showEpgInfo(r6)
            goto L95
        L90:
            java.lang.String r6 = r5.stream_id
            r5.getShortEpg(r6)
        L95:
            int r6 = r5.channel_pos
            r5.changeChannelInfo(r6)
            com.flextv.livestore.models.EPGChannel r6 = r5.selectedChannel
            boolean r6 = r6.is_favorite()
            r5.showFavImageIcon(r6)
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.ly_control
            r6.setVisibility(r1)
            android.os.Handler r6 = r5.handler
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2 r0 = r5.hideInfoTicker
            r6.removeCallbacks(r0)
            r5.mInfoHideTimer()
            return
    }

    private void mInfoHideTimer() {
            r2 = this;
            r0 = 10
            r2.hide_time = r0
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2 r0 = new com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2
            r1 = 1
            r0.<init>(r2, r1)
            r2.hideInfoTicker = r0
            r0.run()
            return
    }

    private void moveNexHideTicker() {
            r4 = this;
            int r0 = r4.hide_time
            int r0 = r0 + (-1)
            r4.hide_time = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            android.os.Handler r2 = r4.handler
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2 r3 = r4.hideInfoTicker
            r2.postAtTime(r3, r0)
            return
    }

    private void moveNextTicker() {
            r4 = this;
            int r0 = r4.move_time
            int r0 = r0 + (-1)
            r4.move_time = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            android.os.Handler r2 = r4.handler
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2 r3 = r4.moveTicker
            r2.postAtTime(r3, r0)
            return
    }

    private void moveTimer() {
            r2 = this;
            r0 = 2
            r2.move_time = r0
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2 r0 = new com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2
            r1 = 0
            r0.<init>(r2, r1)
            r2.moveTicker = r0
            r0.run()
            return
    }

    private void playNextChannel() {
            r5 = this;
            int r0 = r5.channel_pos
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r1 = r5.epgChannels
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            if (r0 >= r1) goto L13
            int r0 = r5.channel_pos
            int r0 = r0 + r2
            r5.channel_pos = r0
            goto L15
        L13:
            r5.channel_pos = r3
        L15:
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r5.categoryModels
            int r1 = r5.category_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = "all_id"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L5e
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r5.epgChannels
            int r1 = r5.channel_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            java.lang.String r0 = r0.getCategory_id()
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r1 = r5.epgChannels
            int r4 = r5.channel_pos
            java.lang.Object r1 = r1.get(r4)
            com.flextv.livestore.models.EPGChannel r1 = (com.flextv.livestore.models.EPGChannel) r1
            java.lang.String r1 = r1.getCategory_name()
            boolean r0 = r5.isAdultChannel(r0, r1)
            if (r0 == 0) goto L5e
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r5.epgChannels
            int r1 = r5.channel_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            int r1 = r5.channel_pos
            r5.showChannelLockDlgFragment(r0, r1, r2)
            goto L108
        L5e:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r5.epgChannels
            int r1 = r5.channel_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            java.lang.String r0 = r0.getCategory_id()
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r1 = r5.epgChannels
            int r4 = r5.channel_pos
            java.lang.Object r1 = r1.get(r4)
            com.flextv.livestore.models.EPGChannel r1 = (com.flextv.livestore.models.EPGChannel) r1
            java.lang.String r1 = r1.getCategory_name()
            boolean r0 = r5.isAdultChannel(r0, r1)
            if (r0 != 0) goto Lb6
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r5.categoryModels
            int r1 = r5.category_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = "lock_id"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Lb6
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r5.epgChannels
            int r1 = r5.channel_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            boolean r0 = r0.is_locked()
            if (r0 == 0) goto Lb6
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r5.epgChannels
            int r1 = r5.channel_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            int r1 = r5.channel_pos
            r5.showChannelLockDlgFragment(r0, r1, r2)
            goto L108
        Lb6:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r5.epgChannels
            int r1 = r5.channel_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            r5.playSelectedChannel(r0)
            com.flextv.livestore.helper.PreferenceHelper r0 = r5.preferenceHelper
            boolean r0 = r0.getSharedPreferenceISM3U()
            if (r0 != 0) goto Ld8
            android.os.Handler r0 = r5.handler
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r1 = r5.epgTicker
            r0.removeCallbacks(r1)
            java.lang.String r0 = r5.stream_id
            r5.epgTimer(r0)
            goto Ldc
        Ld8:
            r0 = 0
            r5.showEpgInfo(r0)
        Ldc:
            int r0 = r5.channel_pos
            r5.changeChannelInfo(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto Lf0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            r0.setVisibility(r3)
        Lf0:
            android.os.Handler r0 = r5.handler
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2 r1 = r5.hideInfoTicker
            r0.removeCallbacks(r1)
            r5.mInfoHideTimer()
            android.widget.TextView r0 = r5.txt_name
            java.lang.String r1 = r5.channel_name
            r0.setText(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r5.recycler_channel
            int r1 = r5.channel_pos
            r0.setSelectedPosition(r1)
        L108:
            return
    }

    private void playPreviousChannel() {
            r4 = this;
            int r0 = r4.channel_pos
            r1 = 1
            if (r0 <= 0) goto L9
            int r0 = r0 - r1
            r4.channel_pos = r0
            goto L12
        L9:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r4.epgChannels
            int r0 = r0.size()
            int r0 = r0 - r1
            r4.channel_pos = r0
        L12:
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r4.categoryModels
            int r2 = r4.category_pos
            java.lang.Object r0 = r0.get(r2)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r2 = "all_id"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L5b
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r4.epgChannels
            int r2 = r4.channel_pos
            java.lang.Object r0 = r0.get(r2)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            java.lang.String r0 = r0.getCategory_id()
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r2 = r4.epgChannels
            int r3 = r4.channel_pos
            java.lang.Object r2 = r2.get(r3)
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            java.lang.String r2 = r2.getCategory_name()
            boolean r0 = r4.isAdultChannel(r0, r2)
            if (r0 == 0) goto L5b
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r4.epgChannels
            int r2 = r4.channel_pos
            java.lang.Object r0 = r0.get(r2)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            int r2 = r4.channel_pos
            r4.showChannelLockDlgFragment(r0, r2, r1)
            goto L106
        L5b:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r4.epgChannels
            int r2 = r4.channel_pos
            java.lang.Object r0 = r0.get(r2)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            java.lang.String r0 = r0.getCategory_id()
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r2 = r4.epgChannels
            int r3 = r4.channel_pos
            java.lang.Object r2 = r2.get(r3)
            com.flextv.livestore.models.EPGChannel r2 = (com.flextv.livestore.models.EPGChannel) r2
            java.lang.String r2 = r2.getCategory_name()
            boolean r0 = r4.isAdultChannel(r0, r2)
            if (r0 != 0) goto Lb3
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r4.categoryModels
            int r2 = r4.category_pos
            java.lang.Object r0 = r0.get(r2)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r2 = "lock_id"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto Lb3
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r4.epgChannels
            int r2 = r4.channel_pos
            java.lang.Object r0 = r0.get(r2)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            boolean r0 = r0.is_locked()
            if (r0 == 0) goto Lb3
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r4.epgChannels
            int r2 = r4.channel_pos
            java.lang.Object r0 = r0.get(r2)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            int r2 = r4.channel_pos
            r4.showChannelLockDlgFragment(r0, r2, r1)
            goto L106
        Lb3:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r4.epgChannels
            int r1 = r4.channel_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            r4.playSelectedChannel(r0)
            com.flextv.livestore.helper.PreferenceHelper r0 = r4.preferenceHelper
            boolean r0 = r0.getSharedPreferenceISM3U()
            if (r0 != 0) goto Ld5
            android.os.Handler r0 = r4.handler
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r1 = r4.epgTicker
            r0.removeCallbacks(r1)
            java.lang.String r0 = r4.stream_id
            r4.epgTimer(r0)
            goto Ld9
        Ld5:
            r0 = 0
            r4.showEpgInfo(r0)
        Ld9:
            int r0 = r4.channel_pos
            r4.changeChannelInfo(r0)
            android.widget.TextView r0 = r4.txt_name
            java.lang.String r1 = r4.channel_name
            r0.setText(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r4.ly_control
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto Lf5
            androidx.constraintlayout.widget.ConstraintLayout r0 = r4.ly_control
            r1 = 0
            r0.setVisibility(r1)
        Lf5:
            android.os.Handler r0 = r4.handler
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2 r1 = r4.hideInfoTicker
            r0.removeCallbacks(r1)
            r4.mInfoHideTimer()
            com.flextv.livestore.view.LiveVerticalGridView r0 = r4.recycler_channel
            int r1 = r4.channel_pos
            r0.setSelectedPosition(r1)
        L106:
            return
    }

    private void playSelectedChannel(com.flextv.livestore.models.EPGChannel r5) {
            r4 = this;
            if (r5 == 0) goto La8
            com.flextv.livestore.helper.PreferenceHelper r0 = r4.preferenceHelper
            int r1 = r4.category_pos
            r0.setSharedPreferenceCategoryPos(r1)
            com.flextv.livestore.helper.PreferenceHelper r0 = r4.preferenceHelper
            int r1 = r4.channel_pos
            r0.setSharedPreferenceChannelPos(r1)
            r4.selectedChannel = r5
            java.lang.String r0 = r5.getStream_id()
            r4.stream_id = r0
            com.flextv.livestore.models.EPGChannel r0 = r4.selectedChannel
            java.lang.String r0 = r0.getName()
            r4.channel_name = r0
            com.flextv.livestore.models.EPGChannel r0 = r4.selectedChannel
            boolean r0 = r0.is_favorite()
            r4.showFavImageIcon(r0)
            boolean r5 = r5.is_locked()
            r4.showLockImageIcon(r5)
            com.flextv.livestore.helper.PreferenceHelper r5 = r4.preferenceHelper
            boolean r5 = r5.getSharedPreferenceISM3U()
            if (r5 == 0) goto L41
            com.flextv.livestore.models.EPGChannel r5 = r4.selectedChannel
            java.lang.String r5 = r5.getUrl()
            r4.content_url = r5
            goto L61
        L41:
            com.flextv.livestore.helper.PreferenceHelper r5 = r4.preferenceHelper
            java.lang.String r5 = r5.getSharedPreferenceServerUrl()
            com.flextv.livestore.helper.PreferenceHelper r0 = r4.preferenceHelper
            java.lang.String r0 = r0.getSharedPreferenceUsername()
            com.flextv.livestore.helper.PreferenceHelper r1 = r4.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferencePassword()
            java.lang.String r2 = r4.stream_id
            com.flextv.livestore.helper.PreferenceHelper r3 = r4.preferenceHelper
            java.lang.String r3 = r3.getSharedPreferenceLiveStreamFormat()
            java.lang.String r5 = com.flextv.livestore.helper.GetSharedInfo.getLiveChannelUrl(r5, r0, r1, r2, r3)
            r4.content_url = r5
        L61:
            java.util.List<java.lang.String> r5 = com.flextv.livestore.apps.Constants.xxx_live_categories
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r4.categoryModels
            int r1 = r4.category_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            java.lang.String r0 = r0.getId()
            boolean r5 = r5.contains(r0)
            r0 = 1
            if (r5 != 0) goto L9d
            com.flextv.livestore.models.EPGChannel r5 = r4.selectedChannel
            java.lang.String r5 = r5.getCategory_id()
            com.flextv.livestore.models.EPGChannel r1 = r4.selectedChannel
            java.lang.String r1 = r1.getCategory_name()
            boolean r5 = r4.isAdultChannel(r5, r1)
            if (r5 != 0) goto L9d
            com.flextv.livestore.helper.RealmController r5 = com.flextv.livestore.helper.RealmController.with()
            com.flextv.livestore.models.EPGChannel r1 = r4.selectedChannel
            java.lang.String r1 = r1.getName()
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda0
            r2.<init>(r4)
            r5.addToRecentChannels(r1, r0, r2)
            goto La0
        L9d:
            r4.showLockImageIcon(r0)
        La0:
            r4.releaseMediaPlayer()
            java.lang.String r5 = r4.content_url
            r4.playVideo(r5)
        La8:
            return
    }

    private void playVideo(java.lang.String r5) {
            r4 = this;
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            if (r0 == 0) goto L7
            r0.release()
        L7:
            android.widget.ImageView r0 = r4.image_def
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L16
            android.widget.ImageView r0 = r4.image_def
            r1 = 8
            r0.setVisibility(r1)
        L16:
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
            com.flextv.livestore.activities.LiveChannelActivity$2 r2 = new com.flextv.livestore.activities.LiveChannelActivity$2
            r2.<init>(r4)
            r0.addAnalyticsListener(r2)
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            com.flextv.livestore.activities.LiveChannelActivity$PlayerEventListener r2 = new com.flextv.livestore.activities.LiveChannelActivity$PlayerEventListener
            r3 = 0
            r2.<init>(r4, r3)
            r0.addListener(r2)
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            com.google.android.exoplayer2.util.EventLogger r2 = new com.google.android.exoplayer2.util.EventLogger
            r2.<init>()
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

    private void runNextEpgTicker() {
            r4 = this;
            int r0 = r4.epgTime
            int r0 = r0 + (-1)
            r4.epgTime = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 500(0x1f4, double:2.47E-321)
            long r0 = r0 + r2
            android.os.Handler r2 = r4.handler
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r3 = r4.epgTicker
            r2.postAtTime(r3, r0)
            return
    }

    private void saveChannelPosition() {
            r2 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = r2.preferenceHelper
            int r1 = r2.channel_pos
            r0.setSharedPreferenceCategoryPos(r1)
            return
    }

    private void searchChannelsInCategory(java.lang.String r5) {
            r4 = this;
            int r0 = r4.category_pos
            r1 = 4
            if (r0 <= r1) goto L40
            com.flextv.livestore.helper.PreferenceHelper r1 = r4.preferenceHelper
            java.util.List r1 = r1.getSharedPreferenceMyGroupCategory()
            int r1 = r1.size()
            int r1 = r1 + 5
            if (r0 >= r1) goto L40
            com.flextv.livestore.helper.PreferenceHelper r0 = r4.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceMyGroupCategory()
            int r0 = r0.size()
            if (r0 <= 0) goto L60
            com.flextv.livestore.helper.PreferenceHelper r0 = r4.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceMyGroupCategory()
            int r1 = r4.category_pos
            int r1 = r1 + (-5)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            com.flextv.livestore.helper.PreferenceHelper r1 = r4.preferenceHelper
            java.util.List r0 = r1.getSharedPreferenceMyGroupChannels(r0)
            com.flextv.livestore.helper.RealmController r1 = com.flextv.livestore.helper.RealmController.with()
            io.realm.RealmResults r5 = r1.getEpgChannelsByNameArray(r0, r5)
            r4.epgChannels = r5
            goto L60
        L40:
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r4.categoryModels
            int r2 = r4.category_pos
            java.lang.Object r1 = r1.get(r2)
            com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
            com.flextv.livestore.helper.PreferenceHelper r2 = r4.preferenceHelper
            boolean r2 = r2.getSharedPreferenceISM3U()
            com.flextv.livestore.helper.PreferenceHelper r3 = r4.preferenceHelper
            int r3 = r3.getSharedPreferenceLiveOrder()
            io.realm.RealmResults r5 = r0.getLiveChannelsByCategory(r1, r5, r2, r3)
            r4.epgChannels = r5
        L60:
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r5 = r4.channelAdapter
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r4.epgChannels
            r1 = -1
            r5.updateData(r0, r1)
            com.flextv.livestore.view.LiveVerticalGridView r5 = r4.recycler_channel
            r0 = 0
            r5.setSelectedPosition(r0)
            com.flextv.livestore.view.LiveVerticalGridView r5 = r4.recycler_channel
            r5.scrollToPosition(r0)
            return
    }

    private void setCurrentEpgEvent(java.util.List<com.flextv.livestore.models.CatchUpEpg> r11) {
            r10 = this;
            java.lang.String r0 = ""
            r1 = 0
            if (r11 == 0) goto La0
            int r2 = r11.size()
            if (r2 <= 0) goto La0
            android.widget.TextView r2 = r10.txt_current_program
            java.lang.Object r3 = r11.get(r1)
            com.flextv.livestore.models.CatchUpEpg r3 = (com.flextv.livestore.models.CatchUpEpg) r3
            java.lang.String r3 = r3.getTitle()
            java.lang.String r3 = com.flextv.livestore.utils.Utils.decode64String(r3)
            r2.setText(r3)
            android.widget.TextView r2 = r10.txt_current_time
            java.lang.String r3 = com.flextv.livestore.helper.GetSharedInfo.getCurrentTimeFormat(r10)
            java.lang.Object r4 = r11.get(r1)
            com.flextv.livestore.models.CatchUpEpg r4 = (com.flextv.livestore.models.CatchUpEpg) r4
            java.lang.String r4 = r4.getStart()
            java.lang.String r5 = "yyyy-MM-dd HH:mm:ss"
            java.util.Date r4 = com.flextv.livestore.utils.Utils.getDateFromString(r5, r4)
            long r6 = r4.getTime()
            long r8 = com.flextv.livestore.apps.LTVApp.SEVER_OFFSET
            long r6 = r6 + r8
            java.lang.String r3 = com.flextv.livestore.utils.Utils.getDateFromMillisecond(r3, r6)
            r2.setText(r3)
            android.widget.SeekBar r2 = r10.seekBar
            java.lang.Object r1 = r11.get(r1)
            com.flextv.livestore.models.CatchUpEpg r1 = (com.flextv.livestore.models.CatchUpEpg) r1
            int r1 = r1.getProgress()
            r2.setProgress(r1)
            int r1 = r11.size()
            r2 = 1
            if (r1 <= r2) goto L8f
            android.widget.TextView r0 = r10.txt_next_program
            java.lang.Object r1 = r11.get(r2)
            com.flextv.livestore.models.CatchUpEpg r1 = (com.flextv.livestore.models.CatchUpEpg) r1
            java.lang.String r1 = r1.getTitle()
            java.lang.String r1 = com.flextv.livestore.utils.Utils.decode64String(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r10.txt_next_time
            java.lang.String r1 = com.flextv.livestore.helper.GetSharedInfo.getCurrentTimeFormat(r10)
            java.lang.Object r11 = r11.get(r2)
            com.flextv.livestore.models.CatchUpEpg r11 = (com.flextv.livestore.models.CatchUpEpg) r11
            java.lang.String r11 = r11.getStart()
            java.util.Date r11 = com.flextv.livestore.utils.Utils.getDateFromString(r5, r11)
            long r2 = r11.getTime()
            long r4 = com.flextv.livestore.apps.LTVApp.SEVER_OFFSET
            long r2 = r2 + r4
            java.lang.String r11 = com.flextv.livestore.utils.Utils.getDateFromMillisecond(r1, r2)
            r0.setText(r11)
            goto Lc5
        L8f:
            android.widget.TextView r11 = r10.txt_next_time
            r11.setText(r0)
            android.widget.TextView r11 = r10.txt_next_program
            com.flextv.livestore.models.WordModels r0 = r10.wordModels
            java.lang.String r0 = r0.getNo_information()
            r11.setText(r0)
            goto Lc5
        La0:
            android.widget.TextView r11 = r10.txt_current_time
            com.flextv.livestore.models.WordModels r2 = r10.wordModels
            java.lang.String r2 = r2.getNo_information()
            r11.setText(r2)
            android.widget.TextView r11 = r10.txt_current_program
            r11.setText(r0)
            android.widget.SeekBar r11 = r10.seekBar
            r11.setProgress(r1)
            android.widget.TextView r11 = r10.txt_next_time
            r11.setText(r0)
            android.widget.TextView r11 = r10.txt_next_program
            com.flextv.livestore.models.WordModels r0 = r10.wordModels
            java.lang.String r0 = r0.getNo_information()
            r11.setText(r0)
        Lc5:
            return
    }

    private void setFocusButtons(boolean r2) {
            r1 = this;
            android.widget.Button r0 = r1.btn_catch_up
            r0.setFocusable(r2)
            android.widget.Button r0 = r1.btn_fav
            r0.setFocusable(r2)
            android.widget.Button r0 = r1.btn_search
            r0.setFocusable(r2)
            return
    }

    private void setFocusTopView(boolean r2) {
            r1 = this;
            android.widget.TextView r0 = r1.txt_home
            r0.setFocusable(r2)
            android.widget.TextView r0 = r1.txt_live
            r0.setFocusable(r2)
            android.widget.TextView r0 = r1.txt_movie
            r0.setFocusable(r2)
            android.widget.TextView r0 = r1.txt_series
            r0.setFocusable(r2)
            android.widget.EditText r0 = r1.et_search
            r0.setFocusable(r2)
            return
    }

    private void setFull() {
            r9 = this;
            boolean r0 = r9.is_full
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L3d
            android.widget.Button r0 = r9.btn_catch_up
            r0.setVisibility(r1)
            android.widget.Button r0 = r9.btn_fav
            r0.setVisibility(r1)
            android.widget.Button r0 = r9.btn_search
            r0.setVisibility(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r9.recycler_channel
            r0.setVisibility(r1)
            androidx.constraintlayout.widget.ConstraintLayout r4 = r9.ly_surface
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r9
            r3.setMargins(r4, r5, r6, r7, r8)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r9.ly_control
            int r0 = r0.getVisibility()
            if (r0 != r1) goto L32
            androidx.constraintlayout.widget.ConstraintLayout r0 = r9.ly_control
            r0.setVisibility(r2)
        L32:
            android.os.Handler r0 = r9.handler
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2 r1 = r9.hideInfoTicker
            r0.removeCallbacks(r1)
            r9.mInfoHideTimer()
            goto L7a
        L3d:
            r8 = 0
            androidx.constraintlayout.widget.ConstraintLayout r4 = r9.ly_surface
            r3 = r9
            r5 = r8
            r6 = r8
            r7 = r8
            r3.setMargins(r4, r5, r6, r7, r8)
            android.widget.Button r0 = r9.btn_catch_up
            r0.setVisibility(r2)
            android.widget.Button r0 = r9.btn_fav
            r0.setVisibility(r2)
            android.widget.Button r0 = r9.btn_search
            r0.setVisibility(r2)
            android.os.Handler r0 = r9.handler
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2 r3 = r9.hideInfoTicker
            r0.removeCallbacks(r3)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r9.ly_control
            r0.setVisibility(r1)
            r9.showAndHideActionsButtons(r2)
            com.flextv.livestore.apps.FocusStatus r0 = com.flextv.livestore.apps.FocusStatus.second
            r9.focusStatus = r0
            com.flextv.livestore.view.LiveVerticalGridView r0 = r9.recycler_channel
            r0.setVisibility(r2)
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r0 = r9.channelAdapter
            int r1 = r9.channel_pos
            r0.setSelectedPosition(r1)
            com.flextv.livestore.view.LiveVerticalGridView r0 = r9.recycler_channel
            r0.requestFocus()
        L7a:
            androidx.constraintlayout.widget.ConstraintSet r0 = new androidx.constraintlayout.widget.ConstraintSet
            r0.<init>()
            androidx.constraintlayout.widget.ConstraintLayout r1 = r9.main_lay
            r0.clone(r1)
            boolean r1 = r9.is_full
            r2 = 2131427766(0x7f0b01b6, float:1.8477158E38)
            r3 = 2131427765(0x7f0b01b5, float:1.8477155E38)
            r4 = 2131428368(0x7f0b0410, float:1.8478379E38)
            if (r1 == 0) goto L9e
            r1 = 0
            r0.setGuidelinePercent(r4, r1)
            r0.setGuidelinePercent(r3, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setGuidelinePercent(r2, r1)
            goto Laf
        L9e:
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setGuidelinePercent(r4, r1)
            r1 = 1036831949(0x3dcccccd, float:0.1)
            r0.setGuidelinePercent(r3, r1)
            r1 = 1058642330(0x3f19999a, float:0.6)
            r0.setGuidelinePercent(r2, r1)
        Laf:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r9.main_lay
            r0.applyTo(r1)
            return
    }

    private void setMargins(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L14
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.setMargins(r3, r4, r5, r6)
            r2.requestLayout()
        L14:
            return
    }

    private void setRenderersFactory(com.google.android.exoplayer2.ExoPlayer.Builder r1, boolean r2) {
            r0 = this;
            com.google.android.exoplayer2.RenderersFactory r2 = com.flextv.livestore.utils.DemoUtil.buildRenderersFactory(r0, r2)
            r1.setRenderersFactory(r2)
            return
    }

    private void showAndHideActionsButtons(boolean r3) {
            r2 = this;
            r0 = 0
            r1 = 8
            if (r3 == 0) goto L15
            androidx.constraintlayout.widget.ConstraintLayout r3 = r2.ly_buttons
            r3.setVisibility(r0)
            androidx.constraintlayout.widget.ConstraintLayout r3 = r2.ly_actions
            r3.setVisibility(r1)
            android.widget.ImageButton r3 = r2.image_epg
            r3.requestFocus()
            goto L1f
        L15:
            androidx.constraintlayout.widget.ConstraintLayout r3 = r2.ly_buttons
            r3.setVisibility(r1)
            androidx.constraintlayout.widget.ConstraintLayout r3 = r2.ly_actions
            r3.setVisibility(r0)
        L1f:
            return
    }

    private void showAudioTrack() {
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

    private void showChannelLockDlgFragment(com.flextv.livestore.models.EPGChannel r5, int r6, int r7) {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_channel_lock"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r5 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r5)
            return
        L15:
            com.flextv.livestore.helper.PreferenceHelper r1 = r4.preferenceHelper
            java.lang.String r1 = r1.getSharedPreferenceParentPassword()
            com.flextv.livestore.dlgfragment.LockDlgFragment r1 = com.flextv.livestore.dlgfragment.LockDlgFragment.newInstance(r1)
            r4.lockDlgFragment = r1
            com.flextv.livestore.activities.LiveChannelActivity$1 r3 = new com.flextv.livestore.activities.LiveChannelActivity$1
            r3.<init>(r4, r7, r6, r5)
            r1.setOnPinEventListener(r3)
            com.flextv.livestore.dlgfragment.LockDlgFragment r5 = r4.lockDlgFragment
            r5.show(r0, r2)
            return
    }

    private void showEpgInfo(java.util.List<com.flextv.livestore.models.CatchUpEpg> r2) {
            r1 = this;
            if (r2 == 0) goto L12
            int r0 = r2.size()
            if (r0 != 0) goto L9
            goto L12
        L9:
            com.flextv.livestore.adapter.EpgRecyclerAdapter r0 = r1.epgAdapter
            r0.setEpgList(r2)
            r1.setCurrentEpgEvent(r2)
            goto L24
        L12:
            com.flextv.livestore.adapter.EpgRecyclerAdapter r2 = r1.epgAdapter
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.setEpgList(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.setCurrentEpgEvent(r2)
        L24:
            return
    }

    private void showFavImageIcon(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Le
            android.widget.Button r2 = r1.btn_fav
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getRemove_favorites()
            r2.setText(r0)
            goto L19
        Le:
            android.widget.Button r2 = r1.btn_fav
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            java.lang.String r0 = r0.getAdd_to_favorite()
            r2.setText(r0)
        L19:
            return
    }

    private void showLockImageIcon(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.widget.ImageButton r2 = r1.image_lock
            r0 = 2131231015(0x7f080127, float:1.80781E38)
            r2.setImageResource(r0)
            goto L13
        Lb:
            android.widget.ImageButton r2 = r1.image_lock
            r0 = 2131231014(0x7f080126, float:1.8078097E38)
            r2.setImageResource(r0)
        L13:
            return
    }

    private void showSearchDlgFragment() {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r0.beginTransaction()
            java.lang.String r2 = "fragment_search"
            androidx.fragment.app.Fragment r3 = r0.findFragmentByTag(r2)
            if (r3 == 0) goto L15
            r0 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r0)
            return
        L15:
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r5.categoryModels
            int r3 = r5.category_pos
            java.lang.Object r1 = r1.get(r3)
            com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
            int r3 = r5.category_pos
            com.flextv.livestore.helper.PreferenceHelper r4 = r5.preferenceHelper
            boolean r4 = r4.getSharedPreferenceISM3U()
            com.flextv.livestore.dlgfragment.LiveSearchDlgFragment r1 = com.flextv.livestore.dlgfragment.LiveSearchDlgFragment.newInstance(r5, r1, r3, r4)
            r5.searchDlgFragment = r1
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda0 r3 = new com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda0
            r3.<init>(r5)
            r1.setSelectCurrentChannelListener(r3)
            com.flextv.livestore.dlgfragment.LiveSearchDlgFragment r1 = r5.searchDlgFragment
            r1.show(r0, r2)
            return
    }

    private void showSubtitleTrack() {
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
    public boolean dispatchKeyEvent(android.view.KeyEvent r8) {
            r7 = this;
            int r0 = r8.getAction()
            if (r0 != 0) goto L3e3
            int r0 = r8.getKeyCode()
            r1 = 4
            r2 = 8
            r3 = 1
            r4 = 0
            if (r0 == r1) goto L3b7
            r1 = 82
            if (r0 == r1) goto L3b3
            r1 = 84
            if (r0 == r1) goto L3af
            r1 = 89
            r5 = 10
            if (r0 == r1) goto L39e
            r1 = 90
            if (r0 == r1) goto L383
            r1 = 135(0x87, float:1.89E-43)
            if (r0 == r1) goto L30a
            r1 = 136(0x88, float:1.9E-43)
            if (r0 == r1) goto L305
            r1 = 166(0xa6, float:2.33E-43)
            if (r0 == r1) goto L2fc
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 == r1) goto L2f3
            switch(r0) {
                case 7: goto L19f;
                case 8: goto L178;
                case 9: goto L151;
                case 10: goto L12a;
                case 11: goto L103;
                case 12: goto Ldc;
                case 13: goto Lb5;
                case 14: goto L8e;
                case 15: goto L67;
                case 16: goto L40;
                default: goto L36;
            }
        L36:
            r1 = 3
            r5 = 2
            switch(r0) {
                case 19: goto L2a0;
                case 20: goto L232;
                case 21: goto L209;
                case 22: goto L1e0;
                case 23: goto L1ce;
                default: goto L3b;
            }
        L3b:
            switch(r0) {
                case 183: goto L3b3;
                case 184: goto L3af;
                case 185: goto L30a;
                case 186: goto L305;
                default: goto L3e;
            }
        L3e:
            goto L3e3
        L40:
            android.widget.TextView r0 = r7.txt_num
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L4d
            android.widget.TextView r0 = r7.txt_num
            r0.setVisibility(r4)
        L4d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.key
            java.lang.String r2 = "9"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            r7.key = r0
            int r0 = java.lang.Integer.parseInt(r0)
            r7.move_pos = r0
            r7.findAndShowChannel()
            goto L3e3
        L67:
            android.widget.TextView r0 = r7.txt_num
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L74
            android.widget.TextView r0 = r7.txt_num
            r0.setVisibility(r4)
        L74:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.key
            java.lang.String r2 = "8"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            r7.key = r0
            int r0 = java.lang.Integer.parseInt(r0)
            r7.move_pos = r0
            r7.findAndShowChannel()
            goto L3e3
        L8e:
            android.widget.TextView r0 = r7.txt_num
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L9b
            android.widget.TextView r0 = r7.txt_num
            r0.setVisibility(r4)
        L9b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.key
            java.lang.String r2 = "7"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            r7.key = r0
            int r0 = java.lang.Integer.parseInt(r0)
            r7.move_pos = r0
            r7.findAndShowChannel()
            goto L3e3
        Lb5:
            android.widget.TextView r0 = r7.txt_num
            int r0 = r0.getVisibility()
            if (r0 != r2) goto Lc2
            android.widget.TextView r0 = r7.txt_num
            r0.setVisibility(r4)
        Lc2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.key
            java.lang.String r2 = "6"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            r7.key = r0
            int r0 = java.lang.Integer.parseInt(r0)
            r7.move_pos = r0
            r7.findAndShowChannel()
            goto L3e3
        Ldc:
            android.widget.TextView r0 = r7.txt_num
            int r0 = r0.getVisibility()
            if (r0 != r2) goto Le9
            android.widget.TextView r0 = r7.txt_num
            r0.setVisibility(r4)
        Le9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.key
            java.lang.String r2 = "5"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            r7.key = r0
            int r0 = java.lang.Integer.parseInt(r0)
            r7.move_pos = r0
            r7.findAndShowChannel()
            goto L3e3
        L103:
            android.widget.TextView r0 = r7.txt_num
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L110
            android.widget.TextView r0 = r7.txt_num
            r0.setVisibility(r4)
        L110:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.key
            java.lang.String r2 = "4"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            r7.key = r0
            int r0 = java.lang.Integer.parseInt(r0)
            r7.move_pos = r0
            r7.findAndShowChannel()
            goto L3e3
        L12a:
            android.widget.TextView r0 = r7.txt_num
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L137
            android.widget.TextView r0 = r7.txt_num
            r0.setVisibility(r4)
        L137:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.key
            java.lang.String r2 = "3"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            r7.key = r0
            int r0 = java.lang.Integer.parseInt(r0)
            r7.move_pos = r0
            r7.findAndShowChannel()
            goto L3e3
        L151:
            android.widget.TextView r0 = r7.txt_num
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L15e
            android.widget.TextView r0 = r7.txt_num
            r0.setVisibility(r4)
        L15e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.key
            java.lang.String r2 = "2"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            r7.key = r0
            int r0 = java.lang.Integer.parseInt(r0)
            r7.move_pos = r0
            r7.findAndShowChannel()
            goto L3e3
        L178:
            android.widget.TextView r0 = r7.txt_num
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L185
            android.widget.TextView r0 = r7.txt_num
            r0.setVisibility(r4)
        L185:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.key
            java.lang.String r2 = "1"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            r7.key = r0
            int r0 = java.lang.Integer.parseInt(r0)
            r7.move_pos = r0
            r7.findAndShowChannel()
            goto L3e3
        L19f:
            android.widget.TextView r0 = r7.txt_num
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L1ac
            android.widget.TextView r0 = r7.txt_num
            r0.setVisibility(r4)
        L1ac:
            java.lang.String r0 = r7.key
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3e3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.key
            java.lang.String r2 = "0"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            r7.key = r0
            int r0 = java.lang.Integer.parseInt(r0)
            r7.move_pos = r0
            r7.findAndShowChannel()
            goto L3e3
        L1ce:
            boolean r0 = r7.is_full
            if (r0 == 0) goto L3e3
            androidx.constraintlayout.widget.ConstraintLayout r0 = r7.ly_control
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L3e3
            r7.is_full = r4
            r7.setFull()
            return r3
        L1e0:
            boolean r0 = r7.is_full
            if (r0 != 0) goto L1f5
            com.flextv.livestore.view.LiveVerticalGridView r0 = r7.recycler_channel
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L3e3
            r7.setFocusButtons(r3)
            android.widget.Button r8 = r7.btn_catch_up
            r8.requestFocus()
            return r3
        L1f5:
            com.flextv.livestore.apps.FocusStatus r0 = r7.focusStatus
            com.flextv.livestore.apps.FocusStatus r1 = com.flextv.livestore.apps.FocusStatus.second
            if (r0 != r1) goto L200
            r7.playNextChannel()
            goto L3e3
        L200:
            android.widget.ImageButton r0 = r7.image_audio
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L3e3
            return r3
        L209:
            boolean r0 = r7.is_full
            if (r0 != 0) goto L21e
            android.widget.Button r0 = r7.btn_catch_up
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L3e3
            r7.setFocusButtons(r4)
            com.flextv.livestore.view.LiveVerticalGridView r8 = r7.recycler_channel
            r8.requestFocus()
            return r3
        L21e:
            com.flextv.livestore.apps.FocusStatus r0 = r7.focusStatus
            com.flextv.livestore.apps.FocusStatus r1 = com.flextv.livestore.apps.FocusStatus.second
            if (r0 != r1) goto L229
            r7.playPreviousChannel()
            goto L3e3
        L229:
            android.widget.ImageButton r0 = r7.image_epg
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L3e3
            return r3
        L232:
            boolean r0 = r7.is_full
            if (r0 == 0) goto L26f
            androidx.constraintlayout.widget.ConstraintLayout r0 = r7.ly_control
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L24f
            androidx.constraintlayout.widget.ConstraintLayout r0 = r7.ly_control
            r0.setVisibility(r4)
            android.os.Handler r0 = r7.handler
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2 r1 = r7.hideInfoTicker
            r0.removeCallbacks(r1)
            r7.mInfoHideTimer()
            goto L3e3
        L24f:
            int[] r0 = com.flextv.livestore.activities.LiveChannelActivity.AnonymousClass6.$SwitchMap$com$flextv$livestore$apps$FocusStatus
            com.flextv.livestore.apps.FocusStatus r2 = r7.focusStatus
            int r2 = r2.ordinal()
            r0 = r0[r2]
            if (r0 == r3) goto L26a
            if (r0 == r5) goto L262
            if (r0 == r1) goto L261
            goto L3e3
        L261:
            return r3
        L262:
            com.flextv.livestore.apps.FocusStatus r8 = com.flextv.livestore.apps.FocusStatus.third
            r7.focusStatus = r8
            r7.showAndHideActionsButtons(r3)
            return r3
        L26a:
            com.flextv.livestore.apps.FocusStatus r8 = com.flextv.livestore.apps.FocusStatus.second
            r7.focusStatus = r8
            return r3
        L26f:
            android.widget.TextView r0 = r7.txt_home
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L297
            android.widget.TextView r0 = r7.txt_live
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L297
            android.widget.TextView r0 = r7.txt_movie
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L297
            android.widget.TextView r0 = r7.txt_series
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L297
            android.widget.EditText r0 = r7.et_search
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L3e3
        L297:
            r7.setFocusTopView(r4)
            com.flextv.livestore.view.LiveVerticalGridView r8 = r7.recycler_channel
            r8.requestFocus()
            return r3
        L2a0:
            boolean r0 = r7.is_full
            if (r0 == 0) goto L2c5
            int[] r0 = com.flextv.livestore.activities.LiveChannelActivity.AnonymousClass6.$SwitchMap$com$flextv$livestore$apps$FocusStatus
            com.flextv.livestore.apps.FocusStatus r6 = r7.focusStatus
            int r6 = r6.ordinal()
            r0 = r0[r6]
            if (r0 == r3) goto L2bf
            if (r0 == r5) goto L2bf
            if (r0 == r1) goto L2b6
            goto L3e3
        L2b6:
            com.flextv.livestore.apps.FocusStatus r0 = com.flextv.livestore.apps.FocusStatus.second
            r7.focusStatus = r0
            r7.showAndHideActionsButtons(r4)
            goto L3e3
        L2bf:
            androidx.constraintlayout.widget.ConstraintLayout r8 = r7.ly_control
            r8.setVisibility(r2)
            return r3
        L2c5:
            com.flextv.livestore.view.LiveVerticalGridView r0 = r7.recycler_channel
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L2da
            int r0 = r7.pre_channel_pos
            if (r0 != 0) goto L2da
            r7.setFocusTopView(r3)
            android.widget.TextView r8 = r7.txt_live
            r8.requestFocus()
            return r3
        L2da:
            android.widget.Button r0 = r7.btn_catch_up
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L2f2
            android.widget.Button r0 = r7.btn_fav
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L2f2
            android.widget.Button r0 = r7.btn_search
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L3e3
        L2f2:
            return r3
        L2f3:
            boolean r0 = r7.is_full
            if (r0 == 0) goto L3e3
            r7.playPreviousChannel()
            goto L3e3
        L2fc:
            boolean r0 = r7.is_full
            if (r0 == 0) goto L3e3
            r7.playNextChannel()
            goto L3e3
        L305:
            r7.showSearchDlgFragment()
            goto L3e3
        L30a:
            boolean r0 = r7.is_full
            if (r0 == 0) goto L347
            com.flextv.livestore.models.EPGChannel r0 = r7.selectedChannel
            if (r0 == 0) goto L3e3
            int r1 = r7.channel_pos
            r7.controlFav(r0, r1)
            com.flextv.livestore.models.EPGChannel r0 = r7.selectedChannel
            boolean r0 = r0.is_favorite()
            r0 = r0 ^ r3
            r7.showFavImageIcon(r0)
            com.flextv.livestore.models.EPGChannel r0 = r7.selectedChannel
            boolean r0 = r0.is_favorite()
            if (r0 == 0) goto L338
            com.flextv.livestore.models.WordModels r0 = r7.wordModels
            java.lang.String r0 = r0.getChannel_added_to_fav()
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r0, r4)
            r0.show()
            goto L3e3
        L338:
            com.flextv.livestore.models.WordModels r0 = r7.wordModels
            java.lang.String r0 = r0.getChannel_removed_from_fav()
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r0, r4)
            r0.show()
            goto L3e3
        L347:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r7.epgChannels
            int r1 = r7.pre_channel_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            if (r0 == 0) goto L3e3
            int r1 = r7.channel_pos
            r7.controlFav(r0, r1)
            boolean r1 = r0.is_favorite()
            r1 = r1 ^ r3
            r7.showFavImageIcon(r1)
            boolean r0 = r0.is_favorite()
            if (r0 == 0) goto L375
            com.flextv.livestore.models.WordModels r0 = r7.wordModels
            java.lang.String r0 = r0.getChannel_added_to_fav()
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r0, r4)
            r0.show()
            goto L3e3
        L375:
            com.flextv.livestore.models.WordModels r0 = r7.wordModels
            java.lang.String r0 = r0.getChannel_removed_from_fav()
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r0, r4)
            r0.show()
            goto L3e3
        L383:
            boolean r0 = r7.is_full
            if (r0 != 0) goto L3e3
            int r0 = r7.pre_channel_pos
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r1 = r7.epgChannels
            int r1 = r1.size()
            int r1 = r1 + (-11)
            if (r0 >= r1) goto L3e3
            int r0 = r7.pre_channel_pos
            int r0 = r0 + r5
            r7.pre_channel_pos = r0
            com.flextv.livestore.view.LiveVerticalGridView r1 = r7.recycler_channel
            r1.setSelectedPosition(r0)
            goto L3e3
        L39e:
            boolean r0 = r7.is_full
            if (r0 != 0) goto L3e3
            int r0 = r7.pre_channel_pos
            if (r0 <= r5) goto L3e3
            int r0 = r0 - r5
            r7.pre_channel_pos = r0
            com.flextv.livestore.view.LiveVerticalGridView r1 = r7.recycler_channel
            r1.setSelectedPosition(r0)
            goto L3e3
        L3af:
            r7.goToSeriesActivity()
            goto L3e3
        L3b3:
            r7.goToVodActivity()
            goto L3e3
        L3b7:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r7.ly_control
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L3cc
            androidx.constraintlayout.widget.ConstraintLayout r8 = r7.ly_control
            r8.setVisibility(r2)
            r7.showAndHideActionsButtons(r4)
            com.flextv.livestore.apps.FocusStatus r8 = com.flextv.livestore.apps.FocusStatus.second
            r7.focusStatus = r8
            return r3
        L3cc:
            boolean r0 = r7.is_full
            if (r0 == 0) goto L3d6
            r7.is_full = r4
            r7.setFull()
            return r3
        L3d6:
            com.flextv.livestore.models.EPGChannel r0 = r7.selectedChannel
            if (r0 == 0) goto L3dd
            r7.saveChannelPosition()
        L3dd:
            r7.releaseMediaPlayer()
            r7.finish()
        L3e3:
            boolean r8 = super.dispatchKeyEvent(r8)
            return r8
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 0
            switch(r3) {
                case 2131427466: goto L153;
                case 2131427469: goto L10f;
                case 2131427487: goto L10b;
                case 2131427780: goto L107;
                case 2131427795: goto L153;
                case 2131427798: goto Lcf;
                case 2131427804: goto L62;
                case 2131427815: goto L4f;
                case 2131427816: goto L4a;
                case 2131427818: goto L45;
                case 2131427824: goto L40;
                case 2131428313: goto La;
                case 2131428322: goto L40;
                case 2131428343: goto L4a;
                default: goto L8;
            }
        L8:
            goto L156
        La:
            r2.releaseMediaPlayer()
            java.util.List<com.flextv.livestore.models.CategoryModel> r3 = r2.categoryModels
            int r0 = r2.category_pos
            java.lang.Object r3 = r3.get(r0)
            com.flextv.livestore.models.CategoryModel r3 = (com.flextv.livestore.models.CategoryModel) r3
            java.lang.String r3 = r3.getId()
            java.lang.String r0 = "resume_id"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L2b
            com.flextv.livestore.models.EPGChannel r3 = r2.selectedChannel
            if (r3 == 0) goto L2b
            r2.saveChannelPosition()
        L2b:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r0 = "is_changed"
            java.lang.String r1 = "home"
            r3.putExtra(r0, r1)
            r0 = -1
            r2.setResult(r0, r3)
            r2.finish()
            goto L156
        L40:
            r2.goToVodActivity()
            goto L156
        L45:
            r2.showSubtitleTrack()
            goto L156
        L4a:
            r2.goToSeriesActivity()
            goto L156
        L4f:
            androidx.constraintlayout.widget.ConstraintLayout r3 = r2.ly_control
            r1 = 8
            r3.setVisibility(r1)
            com.flextv.livestore.apps.FocusStatus r3 = com.flextv.livestore.apps.FocusStatus.second
            r2.focusStatus = r3
            r2.showAndHideActionsButtons(r0)
            r2.showSearchDlgFragment()
            goto L156
        L62:
            com.flextv.livestore.models.EPGChannel r3 = r2.selectedChannel
            if (r3 == 0) goto L156
            java.lang.String r3 = r3.getCategory_id()
            com.flextv.livestore.models.EPGChannel r1 = r2.selectedChannel
            java.lang.String r1 = r1.getCategory_name()
            boolean r3 = r2.isAdultChannel(r3, r1)
            if (r3 == 0) goto L85
            com.flextv.livestore.models.WordModels r3 = r2.wordModels
            java.lang.String r3 = r3.getChannel_locked_default()
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            goto L156
        L85:
            com.flextv.livestore.models.EPGChannel r3 = r2.selectedChannel
            boolean r3 = r3.is_locked()
            if (r3 == 0) goto L97
            com.flextv.livestore.models.EPGChannel r3 = r2.selectedChannel
            int r0 = r2.channel_pos
            r1 = 3
            r2.showChannelLockDlgFragment(r3, r0, r1)
            goto L156
        L97:
            com.flextv.livestore.models.EPGChannel r3 = r2.selectedChannel
            int r1 = r2.channel_pos
            r2.controlLock(r3, r1)
            com.flextv.livestore.models.EPGChannel r3 = r2.selectedChannel
            boolean r3 = r3.is_locked()
            r3 = r3 ^ 1
            r2.showLockImageIcon(r3)
            com.flextv.livestore.models.EPGChannel r3 = r2.selectedChannel
            boolean r3 = r3.is_locked()
            if (r3 == 0) goto Lc0
            com.flextv.livestore.models.WordModels r3 = r2.wordModels
            java.lang.String r3 = r3.getChannel_unlocked()
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            goto L156
        Lc0:
            com.flextv.livestore.models.WordModels r3 = r2.wordModels
            java.lang.String r3 = r3.getChannel_locked()
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            goto L156
        Lcf:
            com.flextv.livestore.models.EPGChannel r3 = r2.selectedChannel
            if (r3 == 0) goto L156
            int r1 = r2.channel_pos
            r2.controlFav(r3, r1)
            com.flextv.livestore.models.EPGChannel r3 = r2.selectedChannel
            boolean r3 = r3.is_favorite()
            r3 = r3 ^ 1
            r2.showFavImageIcon(r3)
            com.flextv.livestore.models.EPGChannel r3 = r2.selectedChannel
            boolean r3 = r3.is_favorite()
            if (r3 == 0) goto Lf9
            com.flextv.livestore.models.WordModels r3 = r2.wordModels
            java.lang.String r3 = r3.getChannel_removed_from_fav()
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            goto L156
        Lf9:
            com.flextv.livestore.models.WordModels r3 = r2.wordModels
            java.lang.String r3 = r3.getChannel_added_to_fav()
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            goto L156
        L107:
            r2.showAudioTrack()
            goto L156
        L10b:
            r2.goToSearchActivity()
            goto L156
        L10f:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r3 = r2.epgChannels
            int r3 = r3.size()
            if (r3 <= 0) goto L156
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r3 = r2.epgChannels
            int r1 = r2.pre_channel_pos
            java.lang.Object r3 = r3.get(r1)
            com.flextv.livestore.models.EPGChannel r3 = (com.flextv.livestore.models.EPGChannel) r3
            if (r3 == 0) goto L156
            int r1 = r2.pre_channel_pos
            r2.controlFav(r3, r1)
            boolean r1 = r3.is_favorite()
            r1 = r1 ^ 1
            r2.showFavImageIcon(r1)
            boolean r3 = r3.is_favorite()
            if (r3 == 0) goto L145
            com.flextv.livestore.models.WordModels r3 = r2.wordModels
            java.lang.String r3 = r3.getChannel_removed_from_fav()
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            goto L156
        L145:
            com.flextv.livestore.models.WordModels r3 = r2.wordModels
            java.lang.String r3 = r3.getChannel_added_to_fav()
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r0)
            r3.show()
            goto L156
        L153:
            r2.goToCatchupActivity()
        L156:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r7) {
            r6 = this;
            super.onCreate(r7)
            r7 = 2131623972(0x7f0e0024, float:1.887511E38)
            r6.setContentView(r7)
            com.flextv.livestore.utils.Utils.FullScreenCall(r6)
            com.flextv.livestore.helper.PreferenceHelper r7 = new com.flextv.livestore.helper.PreferenceHelper
            r7.<init>(r6)
            r6.preferenceHelper = r7
            com.flextv.livestore.models.WordModels r7 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r6)
            r6.wordModels = r7
            r6.initView()
            com.google.android.exoplayer2.upstream.DataSource$Factory r7 = com.flextv.livestore.utils.DemoUtil.getDataSourceFactory(r6)
            r6.dataSourceFactory = r7
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r7 = new com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder
            r7.<init>(r6)
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper
            boolean r0 = r0.getSharedPreferenceSubtitleEnable()
            r1 = 1
            r0 = r0 ^ r1
            r2 = 3
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r7 = r7.setTrackTypeDisabled(r2, r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r7 = r7.build()
            r6.trackSelectionParameters = r7
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r0 = "is_full"
            r2 = 0
            boolean r7 = r7.getBooleanExtra(r0, r2)
            r6.is_full = r7
            com.flextv.livestore.helper.PreferenceHelper r7 = r6.preferenceHelper
            java.util.List r7 = r7.getSharedPreferenceInvisibleLiveCategories()
            com.flextv.livestore.apps.Constants.getLiveGroupModels(r7, r6)
            java.util.List<com.flextv.livestore.models.CategoryModel> r7 = com.flextv.livestore.apps.LTVApp.live_categories_filter
            r6.categoryModels = r7
            com.flextv.livestore.helper.PreferenceHelper r7 = r6.preferenceHelper
            int r7 = r7.getSharedPreferenceCategoryPos()
            r6.category_pos = r7
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r6.categoryModels
            int r0 = r0.size()
            int r0 = r0 - r1
            if (r7 <= r0) goto L67
            r6.category_pos = r1
        L67:
            int r7 = r6.category_pos
            r0 = 4
            java.lang.String r3 = ""
            if (r7 <= r0) goto La9
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceMyGroupCategory()
            int r0 = r0.size()
            int r0 = r0 + 5
            if (r7 >= r0) goto La9
            com.flextv.livestore.helper.PreferenceHelper r7 = r6.preferenceHelper
            java.util.List r7 = r7.getSharedPreferenceMyGroupCategory()
            int r7 = r7.size()
            if (r7 <= 0) goto Lc9
            com.flextv.livestore.helper.PreferenceHelper r7 = r6.preferenceHelper
            java.util.List r7 = r7.getSharedPreferenceMyGroupCategory()
            int r0 = r6.category_pos
            int r0 = r0 + (-5)
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            com.flextv.livestore.helper.PreferenceHelper r0 = r6.preferenceHelper
            java.util.List r7 = r0.getSharedPreferenceMyGroupChannels(r7)
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            io.realm.RealmResults r7 = r0.getEpgChannelsByNameArray(r7, r3)
            r6.epgChannels = r7
            goto Lc9
        La9:
            com.flextv.livestore.helper.RealmController r7 = com.flextv.livestore.helper.RealmController.with()
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r6.categoryModels
            int r4 = r6.category_pos
            java.lang.Object r0 = r0.get(r4)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            com.flextv.livestore.helper.PreferenceHelper r4 = r6.preferenceHelper
            boolean r4 = r4.getSharedPreferenceISM3U()
            com.flextv.livestore.helper.PreferenceHelper r5 = r6.preferenceHelper
            int r5 = r5.getSharedPreferenceLiveOrder()
            io.realm.RealmResults r7 = r7.getLiveChannelsByCategory(r0, r3, r4, r5)
            r6.epgChannels = r7
        Lc9:
            r6.channel_pos = r2
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r7 = new com.flextv.livestore.adapter.RecyclerLiveChannelAdapter
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r6.epgChannels
            com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda4 r3 = new com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda4
            r4 = 2
            r3.<init>(r6, r4)
            r7.<init>(r6, r0, r2, r3)
            r6.channelAdapter = r7
            com.flextv.livestore.view.LiveVerticalGridView r0 = r6.recycler_channel
            r0.setAdapter(r7)
            r6.setFocusTopView(r2)
            r6.setFocusButtons(r2)
            com.flextv.livestore.adapter.EpgRecyclerAdapter r7 = new com.flextv.livestore.adapter.EpgRecyclerAdapter
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.<init>(r6, r0)
            r6.epgAdapter = r7
            androidx.recyclerview.widget.RecyclerView r7 = r6.recycler_epg
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r6)
            r7.setLayoutManager(r0)
            androidx.recyclerview.widget.RecyclerView r7 = r6.recycler_epg
            com.flextv.livestore.adapter.EpgRecyclerAdapter r0 = r6.epgAdapter
            r7.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r7 = r6.recycler_epg
            r7.setFocusable(r2)
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r7 = r6.epgChannels
            int r7 = r7.size()
            if (r7 <= 0) goto L1e0
            r6.setFull()
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r7 = r6.epgChannels
            int r0 = r6.channel_pos
            java.lang.Object r7 = r7.get(r0)
            com.flextv.livestore.models.EPGChannel r7 = (com.flextv.livestore.models.EPGChannel) r7
            java.lang.String r7 = r7.getCategory_id()
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r6.epgChannels
            int r3 = r6.channel_pos
            java.lang.Object r0 = r0.get(r3)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            java.lang.String r0 = r0.getCategory_name()
            boolean r7 = r6.isAdultChannel(r7, r0)
            if (r7 == 0) goto L136
            r6.channel_pos = r2
        L136:
            java.util.List<com.flextv.livestore.models.CategoryModel> r7 = r6.categoryModels
            int r0 = r6.category_pos
            java.lang.Object r7 = r7.get(r0)
            com.flextv.livestore.models.CategoryModel r7 = (com.flextv.livestore.models.CategoryModel) r7
            java.lang.String r7 = r7.getId()
            java.lang.String r0 = "lock_id"
            boolean r7 = r7.equalsIgnoreCase(r0)
            if (r7 != 0) goto L16c
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r7 = r6.epgChannels
            int r0 = r6.channel_pos
            java.lang.Object r7 = r7.get(r0)
            com.flextv.livestore.models.EPGChannel r7 = (com.flextv.livestore.models.EPGChannel) r7
            boolean r7 = r7.is_locked()
            if (r7 == 0) goto L16c
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r7 = r6.epgChannels
            int r0 = r6.channel_pos
            java.lang.Object r7 = r7.get(r0)
            com.flextv.livestore.models.EPGChannel r7 = (com.flextv.livestore.models.EPGChannel) r7
            int r0 = r6.channel_pos
            r6.showChannelLockDlgFragment(r7, r0, r1)
            goto L1e0
        L16c:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r7 = r6.epgChannels
            int r0 = r6.channel_pos
            java.lang.Object r7 = r7.get(r0)
            com.flextv.livestore.models.EPGChannel r7 = (com.flextv.livestore.models.EPGChannel) r7
            r6.playSelectedChannel(r7)
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r7 = r6.epgChannels
            int r0 = r6.channel_pos
            java.lang.Object r7 = r7.get(r0)
            com.flextv.livestore.models.EPGChannel r7 = (com.flextv.livestore.models.EPGChannel) r7
            java.lang.String r7 = r7.getStream_id()
            r6.stream_id = r7
            com.flextv.livestore.helper.PreferenceHelper r7 = r6.preferenceHelper
            boolean r7 = r7.getSharedPreferenceISM3U()
            if (r7 != 0) goto L19e
            android.os.Handler r7 = r6.handler
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r0 = r6.epgTicker
            r7.removeCallbacks(r0)
            java.lang.String r7 = r6.stream_id
            r6.epgTimer(r7)
            goto L1a2
        L19e:
            r7 = 0
            r6.showEpgInfo(r7)
        L1a2:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r7 = r6.epgChannels
            int r0 = r6.channel_pos
            java.lang.Object r7 = r7.get(r0)
            com.flextv.livestore.models.EPGChannel r7 = (com.flextv.livestore.models.EPGChannel) r7
            java.lang.String r7 = r7.getName()
            r6.channel_name = r7
            android.widget.TextView r0 = r6.txt_name
            r0.setText(r7)
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r7 = r6.epgChannels
            int r0 = r6.channel_pos
            java.lang.Object r7 = r7.get(r0)
            com.flextv.livestore.models.EPGChannel r7 = (com.flextv.livestore.models.EPGChannel) r7
            boolean r7 = r7.is_favorite()
            r6.showFavImageIcon(r7)
            int r7 = r6.channel_pos
            r6.changeChannelInfo(r7)
            com.flextv.livestore.view.LiveVerticalGridView r7 = r6.recycler_channel
            r7.requestFocus()
            com.flextv.livestore.view.LiveVerticalGridView r7 = r6.recycler_channel
            int r0 = r6.channel_pos
            r7.setSelectedPosition(r0)
            com.flextv.livestore.view.LiveVerticalGridView r7 = r6.recycler_channel
            int r0 = r6.channel_pos
            r7.scrollToPosition(r0)
        L1e0:
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto Lc
            android.os.Handler r1 = r0.handler
            com.flextv.livestore.activities.LiveChannelActivity$$ExternalSyntheticLambda2 r2 = r0.hideInfoTicker
            r1.removeCallbacks(r2)
            r0.mInfoHideTimer()
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
            r2.releaseMediaPlayer()
        L13:
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
            r2.releaseMediaPlayer()
        L13:
            return
    }
}
