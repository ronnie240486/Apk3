package com.flextv.livestore.activities.mobile;

/* JADX INFO: loaded from: classes.dex */
public class LiveChannelMobileActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener, android.widget.SeekBar.OnSeekBarChangeListener {
    public android.media.AudioManager audioManager;
    public android.widget.SeekBar bright_seekbar;
    public android.widget.ImageButton btn_back;
    public android.widget.Button btn_catch_up;
    public android.widget.Button btn_fav;
    public android.widget.ImageButton btn_full_epg;
    public android.widget.ImageButton btn_full_fav;
    public android.widget.ImageButton btn_full_search;
    public android.widget.ImageButton btn_lock;
    public android.widget.ImageButton btn_next;
    public android.widget.ImageButton btn_play;
    public android.widget.ImageButton btn_previous;
    public android.widget.ImageButton btn_resolution;
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
    public android.os.Handler handler;
    public androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 hideInfoTicker;
    public int hide_time;
    public android.widget.ImageView image_def;
    public boolean is_full;
    public boolean is_system_setting;
    public com.flextv.livestore.dlgfragment.LockDlgFragment lockDlgFragment;
    public androidx.constraintlayout.widget.ConstraintLayout ly_control;
    public androidx.constraintlayout.widget.ConstraintLayout ly_surface;
    public androidx.constraintlayout.widget.ConstraintLayout main_lay;
    public com.google.android.exoplayer2.ExoPlayer player;
    public com.google.android.exoplayer2.ui.StyledPlayerView playerView;
    public int pre_channel_pos;
    public com.flextv.livestore.helper.PreferenceHelper preferenceHelper;
    public androidx.recyclerview.widget.RecyclerView recycler_channel;
    public androidx.recyclerview.widget.RecyclerView recycler_epg;
    public com.flextv.livestore.dlgfragment.LiveSearchDlgFragment searchDlgFragment;
    public android.widget.SeekBar seekBar;
    public com.flextv.livestore.models.EPGChannel selectedChannel;
    public androidx.activity.result.ActivityResultLauncher<android.content.Intent> someActivityResultLauncher;
    public java.lang.String stream_id;
    public com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters;
    public android.widget.TextView txt_back;
    public android.widget.TextView txt_channel_name;
    public android.widget.TextView txt_current_program;
    public android.widget.TextView txt_current_time;
    public android.widget.TextView txt_group;
    public android.widget.TextView txt_home;
    public android.widget.TextView txt_live;
    public android.widget.TextView txt_movie;
    public android.widget.TextView txt_name;
    public android.widget.TextView txt_next_program;
    public android.widget.TextView txt_next_time;
    public android.widget.TextView txt_resolution;
    public android.widget.TextView txt_series;
    public android.view.View view_click;
    public int volumeLevel;
    public android.widget.SeekBar volume_seekbar;
    public com.flextv.livestore.models.WordModels wordModels;





    /* JADX INFO: loaded from: classes2.dex */
    public class PlayerEventListener implements com.google.android.exoplayer2.Player.Listener {
        public final /* synthetic */ com.flextv.livestore.activities.mobile.LiveChannelMobileActivity this$0;

        private PlayerEventListener(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ PlayerEventListener(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r1, com.flextv.livestore.activities.mobile.LiveChannelMobileActivity.AnonymousClass1 r2) {
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
                com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r2 = r1.this$0
                com.flextv.livestore.activities.mobile.LiveChannelMobileActivity.access$1000(r2)
                com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r2 = r1.this$0
                java.lang.String r0 = r2.content_url
                com.flextv.livestore.activities.mobile.LiveChannelMobileActivity.access$1100(r2, r0)
                goto L18
            L10:
                r0 = 3
                if (r2 != r0) goto L18
                com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r2 = r1.this$0
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
                com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r3 = r2.this$0
                com.flextv.livestore.activities.mobile.LiveChannelMobileActivity.access$1000(r3)
                com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r3 = r2.this$0
                java.lang.String r0 = r3.content_url
                com.flextv.livestore.activities.mobile.LiveChannelMobileActivity.access$1100(r3, r0)
                goto L34
            L13:
                com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r3 = r2.this$0
                int r0 = r3.error_count
                r1 = 3
                if (r0 <= r1) goto L26
                com.flextv.livestore.activities.mobile.LiveChannelMobileActivity.access$1000(r3)
                com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r3 = r2.this$0
                android.widget.ImageView r3 = r3.image_def
                r0 = 0
                r3.setVisibility(r0)
                goto L34
            L26:
                int r0 = r0 + 1
                r3.error_count = r0
                com.flextv.livestore.activities.mobile.LiveChannelMobileActivity.access$1000(r3)
                com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r3 = r2.this$0
                java.lang.String r0 = r3.content_url
                com.flextv.livestore.activities.mobile.LiveChannelMobileActivity.access$1100(r3, r0)
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

    public static /* synthetic */ void $r8$lambda$3ic9_15xMeYOqeuiZm98UjcWM8w(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0) {
            r0.lambda$mInfoHideTimer$6()
            return
    }

    public static /* synthetic */ void $r8$lambda$60GlNBY34p7wSHn8U0qsEpCbW1w(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0, java.lang.String r1) {
            r0.lambda$epgTimer$3(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$7_tb4DLF3mwjf3ApCSpifo-O-No, reason: not valid java name */
    public static /* synthetic */ void m81$r8$lambda$7_tb4DLF3mwjf3ApCSpifoONo(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0, androidx.activity.result.ActivityResult r1) {
            r0.lambda$new$7(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$O9teDMwgvHQZOa8ipZnH7j8aDRQ(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0, int r1) {
            r0.lambda$controlFav$4(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$PQRGdOlHtibDZ9nQxt0FlJ5AB6Y(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0, int r1) {
            r0.lambda$controlLock$5(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$c_uj51BGZ6dqTKUx1n4nP_Pj7UM(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0, com.flextv.livestore.models.EPGChannel r1) {
            r0.lambda$showSearchDlgFragment$1(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$lfdebpX3uXwZ8g4BoV6leHBzGtE(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0, android.view.View r1) {
            r0.lambda$initView$8(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$tMxPjZ6-iUGSHce6GAZRGwsCU0E, reason: not valid java name */
    public static /* synthetic */ void m82$r8$lambda$tMxPjZ6iUGSHce6GAZRGwsCU0E(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0) {
            r0.lambda$playSelectedChannel$2()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$vJKk_V-Snl5cb1n0xsFKTuGi9Bk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m83$r8$lambda$vJKk_VSnl5cb1n0xsFKTuGi9Bk(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0, com.flextv.livestore.models.EPGChannel r1, java.lang.Integer r2, java.lang.Boolean r3, java.lang.Boolean r4) {
            kotlin.Unit r0 = r0.lambda$onCreate$0(r1, r2, r3, r4)
            return r0
    }

    static {
            java.lang.Class<com.flextv.livestore.activities.mobile.LiveChannelMobileActivity> r0 = com.flextv.livestore.activities.mobile.LiveChannelMobileActivity.class
            return
    }

    public LiveChannelMobileActivity() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.category_pos = r0
            r3.channel_pos = r0
            r3.pre_channel_pos = r0
            r3.error_count = r0
            java.lang.String r1 = ""
            r3.stream_id = r1
            r3.is_full = r0
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r3.handler = r2
            r3.categoryName = r1
            r3.is_system_setting = r0
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r0.<init>()
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.mobile.LiveChannelMobileActivity$$ExternalSyntheticLambda0
            r1.<init>(r3)
            androidx.activity.result.ActivityResultLauncher r0 = r3.registerForActivityResult(r0, r1)
            r3.someActivityResultLauncher = r0
            return
    }

    public static /* synthetic */ void access$000(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0, com.flextv.livestore.models.EPGChannel r1) {
            r0.playSelectedChannel(r1)
            return
    }

    public static /* synthetic */ void access$100(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0, java.lang.String r1) {
            r0.epgTimer(r1)
            return
    }

    public static /* synthetic */ void access$1000(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0) {
            r0.releaseMediaPlayer()
            return
    }

    public static /* synthetic */ void access$1100(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0, java.lang.String r1) {
            r0.playVideo(r1)
            return
    }

    public static /* synthetic */ void access$1200(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0, java.lang.String r1) {
            r0.searchChannelsInCategory(r1)
            return
    }

    public static /* synthetic */ void access$200(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0, java.util.List r1) {
            r0.showEpgInfo(r1)
            return
    }

    public static /* synthetic */ void access$300(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0, boolean r1) {
            r0.showFavImageIcon(r1)
            return
    }

    public static /* synthetic */ void access$400(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0, int r1) {
            r0.changeChannelInfo(r1)
            return
    }

    public static /* synthetic */ void access$500(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0) {
            r0.mInfoHideTimer()
            return
    }

    public static /* synthetic */ void access$600(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0, java.lang.String r1) {
            r0.getShortEpg(r1)
            return
    }

    public static /* synthetic */ void access$700(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0, com.flextv.livestore.models.EPGChannel r1, int r2) {
            r0.controlLock(r1, r2)
            return
    }

    public static /* synthetic */ void access$800(com.flextv.livestore.activities.mobile.LiveChannelMobileActivity r0, boolean r1) {
            r0.showLockImageIcon(r1)
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
            boolean r5 = r5.is_favorite()
            r5 = r5 ^ 1
            com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda0 r2 = new com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda0
            r3 = 2
            r2.<init>(r4, r6, r3)
            r0.addToFavChannels(r1, r5, r2)
        L2f:
            return
    }

    private void controlLock(com.flextv.livestore.models.EPGChannel r5, int r6) {
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
            boolean r5 = r5.is_locked()
            r2 = 1
            r5 = r5 ^ r2
            com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda0 r3 = new com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda0
            r3.<init>(r4, r6, r2)
            r0.addToLockChannels(r1, r5, r3)
        L2e:
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
            r1 = 5
            r0.<init>(r2, r3, r1)
            r2.epgTicker = r0
            r0.run()
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
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity$3 r0 = new com.flextv.livestore.activities.mobile.LiveChannelMobileActivity$3     // Catch: java.lang.Exception -> L23
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
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r3.categoryModels
            int r1 = r3.category_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = "resume_id"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1e
            com.flextv.livestore.models.EPGChannel r0 = r3.selectedChannel
            if (r0 == 0) goto L1e
            r3.saveCategoryAndChannelPosition()
        L1e:
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
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r3.categoryModels
            int r1 = r3.category_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = "resume_id"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1e
            com.flextv.livestore.models.EPGChannel r0 = r3.selectedChannel
            if (r0 == 0) goto L1e
            r3.saveCategoryAndChannelPosition()
        L1e:
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
            com.google.android.exoplayer2.ui.StyledPlayerView r3 = r10.playerView
            com.google.android.exoplayer2.ui.SubtitleView r3 = r3.getSubtitleView()
            r3.setStyle(r0)
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
            r0 = 2131428284(0x7f0b03bc, float:1.8478208E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_back = r0
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
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
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
            android.widget.TextView r0 = r10.txt_home
            com.flextv.livestore.models.WordModels r3 = r10.wordModels
            java.lang.String r3 = r3.getHome()
            r0.setText(r3)
            android.widget.TextView r0 = r10.txt_live
            com.flextv.livestore.models.WordModels r3 = r10.wordModels
            java.lang.String r3 = r3.getLive_tv()
            r0.setText(r3)
            android.widget.TextView r0 = r10.txt_movie
            com.flextv.livestore.models.WordModels r3 = r10.wordModels
            java.lang.String r3 = r3.getMovies()
            r0.setText(r3)
            android.widget.TextView r0 = r10.txt_series
            com.flextv.livestore.models.WordModels r3 = r10.wordModels
            java.lang.String r3 = r3.getSeries()
            r0.setText(r3)
            android.widget.TextView r0 = r10.txt_back
            com.flextv.livestore.models.WordModels r3 = r10.wordModels
            java.lang.String r3 = r3.getBack()
            r0.setText(r3)
            android.widget.Button r0 = r10.btn_catch_up
            com.flextv.livestore.models.WordModels r3 = r10.wordModels
            java.lang.String r3 = r3.getCatch_up()
            r0.setText(r3)
            android.widget.Button r0 = r10.btn_search
            com.flextv.livestore.models.WordModels r3 = r10.wordModels
            java.lang.String r3 = r3.getSearch()
            r0.setText(r3)
            android.widget.Button r0 = r10.btn_fav
            com.flextv.livestore.models.WordModels r3 = r10.wordModels
            java.lang.String r3 = r3.getAdd_to_favorite()
            r0.setText(r3)
            r0 = 2131427901(0x7f0b023d, float:1.8477431E38)
            android.view.View r0 = r10.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r10.ly_control = r0
            r0 = 2131428135(0x7f0b0327, float:1.8477906E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            r10.seekBar = r0
            r3 = 100
            r0.setMax(r3)
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
            r0 = 2131427514(0x7f0b00ba, float:1.8476646E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r10.channel_image = r0
            r0 = 2131427792(0x7f0b01d0, float:1.847721E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r10.image_def = r0
            r0 = 2131427471(0x7f0b008f, float:1.847656E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r10.btn_full_epg = r0
            r0 = 2131427464(0x7f0b0088, float:1.8476545E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r10.btn_back = r0
            r0 = 2131427472(0x7f0b0090, float:1.8476561E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r10.btn_full_fav = r0
            r0 = 2131427473(0x7f0b0091, float:1.8476563E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r10.btn_full_search = r0
            r0 = 2131427475(0x7f0b0093, float:1.8476567E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r10.btn_lock = r0
            r0 = 2131427484(0x7f0b009c, float:1.8476586E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r10.btn_resolution = r0
            r0 = 2131428338(0x7f0b03f2, float:1.8478318E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.txt_resolution = r0
            r0 = 2131427917(0x7f0b024d, float:1.8477464E38)
            android.view.View r0 = r10.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0 = 2131428377(0x7f0b0419, float:1.8478397E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.view_click = r0
            r0 = 2131427477(0x7f0b0095, float:1.8476571E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r10.btn_next = r0
            r0 = 2131427480(0x7f0b0098, float:1.8476577E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r10.btn_play = r0
            r0 = 2131427482(0x7f0b009a, float:1.8476581E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r10.btn_previous = r0
            r0 = 2131428387(0x7f0b0423, float:1.8478417E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            r10.volume_seekbar = r0
            r0 = 2131427450(0x7f0b007a, float:1.8476517E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            r10.bright_seekbar = r0
            android.widget.SeekBar r0 = r10.volume_seekbar
            r0.setOnSeekBarChangeListener(r10)
            java.lang.String r0 = "audio"
            java.lang.Object r0 = r10.getSystemService(r0)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r10.audioManager = r0
            android.widget.SeekBar r0 = r10.volume_seekbar
            r0.setMax(r3)
            android.media.AudioManager r0 = r10.audioManager
            int r0 = r0.getStreamVolume(r1)
            r10.volumeLevel = r0
            android.media.AudioManager r0 = r10.audioManager
            int r0 = r0.getStreamMaxVolume(r1)
            int r1 = r10.volumeLevel
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            android.widget.SeekBar r1 = r10.volume_seekbar
            r1.setProgress(r0)
            android.widget.SeekBar r0 = r10.bright_seekbar
            r0.setOnSeekBarChangeListener(r10)
            android.widget.SeekBar r0 = r10.bright_seekbar
            r1 = 255(0xff, float:3.57E-43)
            r0.setMax(r1)
            android.content.ContentResolver r0 = r10.getContentResolver()
            java.lang.String r1 = "screen_brightness"
            int r0 = android.provider.Settings.System.getInt(r0, r1, r2)
            android.widget.SeekBar r1 = r10.bright_seekbar
            r1.setProgress(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.ly_surface
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
            android.widget.TextView r0 = r10.txt_back
            r0.setOnClickListener(r10)
            android.widget.ImageButton r0 = r10.btn_lock
            r0.setOnClickListener(r10)
            android.widget.ImageButton r0 = r10.btn_full_epg
            r0.setOnClickListener(r10)
            android.widget.ImageButton r0 = r10.btn_full_search
            r0.setOnClickListener(r10)
            android.widget.ImageButton r0 = r10.btn_full_fav
            r0.setOnClickListener(r10)
            android.widget.ImageButton r0 = r10.btn_resolution
            r0.setOnClickListener(r10)
            android.widget.ImageButton r0 = r10.btn_back
            r0.setOnClickListener(r10)
            android.widget.ImageButton r0 = r10.btn_next
            r0.setOnClickListener(r10)
            android.widget.ImageButton r0 = r10.btn_play
            r0.setOnClickListener(r10)
            android.widget.ImageButton r0 = r10.btn_previous
            r0.setOnClickListener(r10)
            android.view.View r0 = r10.view_click
            r0.setOnClickListener(r10)
            android.widget.EditText r0 = r10.et_search
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity$4 r1 = new com.flextv.livestore.activities.mobile.LiveChannelMobileActivity$4
            r1.<init>(r10)
            r0.addTextChangedListener(r1)
            com.google.android.exoplayer2.ui.StyledPlayerView r0 = r10.playerView
            android.view.View r0 = r0.getVideoSurfaceView()
            com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.activities.SearchActivity$$ExternalSyntheticLambda0
            r2 = 5
            r1.<init>(r10, r2)
            r0.setOnClickListener(r1)
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
            r1 = -1
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

    private /* synthetic */ void lambda$initView$8(android.view.View r2) {
            r1 = this;
            boolean r2 = r1.is_full
            if (r2 == 0) goto L1f
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.ly_control
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 != r0) goto L25
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.ly_control
            r0 = 0
            r2.setVisibility(r0)
            android.os.Handler r2 = r1.handler
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r0 = r1.hideInfoTicker
            r2.removeCallbacks(r0)
            r1.mInfoHideTimer()
            goto L25
        L1f:
            r2 = 1
            r1.is_full = r2
            r1.setFull()
        L25:
            return
    }

    private /* synthetic */ void lambda$mInfoHideTimer$6() {
            r2 = this;
            int r0 = r2.hide_time
            if (r0 != 0) goto L13
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.ly_control
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L13
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.ly_control
            r1 = 8
            r0.setVisibility(r1)
        L13:
            r2.moveNexHideTicker()
            return
    }

    private /* synthetic */ void lambda$new$7(androidx.activity.result.ActivityResult r6) {
            r5 = this;
            int r0 = r6.getResultCode()
            r1 = -1
            if (r0 != r1) goto Lbd
            android.content.Intent r6 = r6.getData()
            if (r6 == 0) goto Lbd
            java.lang.String r0 = "is_changed"
            java.lang.String r6 = r6.getStringExtra(r0)
            java.lang.String r0 = "from_search"
            boolean r6 = r6.equalsIgnoreCase(r0)
            if (r6 == 0) goto Lac
            r6 = 1
            r5.is_full = r6
            r5.setFull()
            com.flextv.livestore.helper.PreferenceHelper r0 = r5.preferenceHelper
            int r0 = r0.getSharedPreferenceCategoryPos()
            r5.category_pos = r0
            com.flextv.livestore.helper.PreferenceHelper r0 = r5.preferenceHelper
            int r0 = r0.getSharedPreferenceChannelPos()
            r5.channel_pos = r0
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r5.categoryModels
            int r2 = r5.category_pos
            java.lang.Object r1 = r1.get(r2)
            com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.preferenceHelper
            boolean r2 = r2.getSharedPreferenceISM3U()
            com.flextv.livestore.helper.PreferenceHelper r3 = r5.preferenceHelper
            int r3 = r3.getSharedPreferenceLiveOrder()
            java.lang.String r4 = ""
            io.realm.RealmResults r0 = r0.getLiveChannelsByCategory(r1, r4, r2, r3)
            r5.epgChannels = r0
            int r1 = r5.channel_pos
            int r0 = r0.size()
            int r0 = r0 - r6
            if (r1 <= r0) goto L5f
            r6 = 0
            r5.channel_pos = r6
        L5f:
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r6 = r5.channelAdapter
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r5.epgChannels
            int r1 = r5.channel_pos
            r6.updateData(r0, r1)
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r6 = r5.epgChannels
            int r0 = r5.channel_pos
            java.lang.Object r6 = r6.get(r0)
            com.flextv.livestore.models.EPGChannel r6 = (com.flextv.livestore.models.EPGChannel) r6
            r5.selectedChannel = r6
            com.flextv.livestore.helper.PreferenceHelper r6 = r5.preferenceHelper
            boolean r6 = r6.getSharedPreferenceISM3U()
            if (r6 != 0) goto L8d
            android.os.Handler r6 = r5.handler
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r0 = r5.epgTicker
            r6.removeCallbacks(r0)
            com.flextv.livestore.models.EPGChannel r6 = r5.selectedChannel
            java.lang.String r6 = r6.getStream_id()
            r5.epgTimer(r6)
            goto L91
        L8d:
            r6 = 0
            r5.showEpgInfo(r6)
        L91:
            com.flextv.livestore.models.EPGChannel r6 = r5.selectedChannel
            java.lang.String r6 = r6.getName()
            r5.channel_name = r6
            android.widget.TextView r0 = r5.txt_name
            r0.setText(r6)
            com.flextv.livestore.models.EPGChannel r6 = r5.selectedChannel
            boolean r6 = r6.is_favorite()
            r5.showFavImageIcon(r6)
            int r6 = r5.channel_pos
            r5.changeChannelInfo(r6)
        Lac:
            com.flextv.livestore.models.EPGChannel r6 = r5.selectedChannel
            r5.playSelectedChannel(r6)
            androidx.recyclerview.widget.RecyclerView r6 = r5.recycler_channel
            r6.requestFocus()
            androidx.recyclerview.widget.RecyclerView r6 = r5.recycler_channel
            int r0 = r5.channel_pos
            r6.scrollToPosition(r0)
        Lbd:
            return
    }

    private /* synthetic */ kotlin.Unit lambda$onCreate$0(com.flextv.livestore.models.EPGChannel r3, java.lang.Integer r4, java.lang.Boolean r5, java.lang.Boolean r6) {
            r2 = this;
            int r0 = r4.intValue()
            r2.pre_channel_pos = r0
            boolean r5 = r5.booleanValue()
            r0 = 0
            if (r5 == 0) goto Lda
            boolean r5 = r2.is_full
            if (r5 != 0) goto L124
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
            goto L124
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
            goto L124
        L6c:
            java.lang.String r5 = r3.getCategory_id()
            java.lang.String r1 = r3.getCategory_name()
            boolean r5 = r2.isAdultChannel(r5, r1)
            if (r5 != 0) goto L9f
            java.util.List<com.flextv.livestore.models.CategoryModel> r5 = r2.categoryModels
            int r1 = r2.category_pos
            java.lang.Object r5 = r5.get(r1)
            com.flextv.livestore.models.CategoryModel r5 = (com.flextv.livestore.models.CategoryModel) r5
            java.lang.String r5 = r5.getId()
            java.lang.String r1 = "lock_id"
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 != 0) goto L9f
            boolean r5 = r3.is_locked()
            if (r5 == 0) goto L9f
            int r4 = r4.intValue()
            r2.showChannelLockDlgFragment(r3, r4, r6)
            goto L124
        L9f:
            int r4 = r4.intValue()
            r2.channel_pos = r4
            r2.playSelectedChannel(r3)
            com.flextv.livestore.helper.PreferenceHelper r4 = r2.preferenceHelper
            boolean r4 = r4.getSharedPreferenceISM3U()
            if (r4 != 0) goto Lbf
            android.os.Handler r4 = r2.handler
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r5 = r2.epgTicker
            r4.removeCallbacks(r5)
            java.lang.String r4 = r3.getStream_id()
            r2.epgTimer(r4)
            goto Lc2
        Lbf:
            r2.showEpgInfo(r0)
        Lc2:
            java.lang.String r4 = r3.getName()
            r2.channel_name = r4
            android.widget.TextView r5 = r2.txt_name
            r5.setText(r4)
            boolean r3 = r3.is_favorite()
            r2.showFavImageIcon(r3)
            int r3 = r2.channel_pos
            r2.changeChannelInfo(r3)
            goto L124
        Lda:
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto Lef
            int r4 = r4.intValue()
            r2.controlFav(r3, r4)
            boolean r3 = r3.is_favorite()
            r2.showFavImageIcon(r3)
            goto L124
        Lef:
            boolean r4 = r2.is_full
            if (r4 != 0) goto L124
            com.flextv.livestore.helper.PreferenceHelper r4 = r2.preferenceHelper
            boolean r4 = r4.getSharedPreferenceISM3U()
            if (r4 != 0) goto L10a
            android.os.Handler r4 = r2.handler
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r5 = r2.epgTicker
            r4.removeCallbacks(r5)
            java.lang.String r4 = r3.getStream_id()
            r2.epgTimer(r4)
            goto L10d
        L10a:
            r2.showEpgInfo(r0)
        L10d:
            java.lang.String r4 = r3.getName()
            r2.channel_name = r4
            android.widget.TextView r5 = r2.txt_name
            r5.setText(r4)
            boolean r3 = r3.is_favorite()
            r2.showFavImageIcon(r3)
            int r3 = r2.pre_channel_pos
            r2.changeChannelInfo(r3)
        L124:
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
            if (r0 == 0) goto L29
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r0 = r2.channelAdapter
            r0.notifyDataSetChanged()
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r0 = r2.channelAdapter
            r1 = 0
            r0.setSelectedPosition(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.recycler_channel
            r0.scrollToPosition(r1)
            r2.channel_pos = r1
        L29:
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
            androidx.recyclerview.widget.RecyclerView r2 = r5.recycler_channel
            r2.scrollToPosition(r0)
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
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r0 = r5.hideInfoTicker
            r6.removeCallbacks(r0)
            r5.mInfoHideTimer()
            return
    }

    private void mInfoHideTimer() {
            r2 = this;
            r0 = 10
            r2.hide_time = r0
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r0 = new androidx.activity.ComponentDialog$$ExternalSyntheticLambda0
            r1 = 5
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
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r3 = r4.hideInfoTicker
            r2.postAtTime(r3, r0)
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
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r5.epgChannels
            int r0 = r0.size()
            if (r0 <= 0) goto L11a
            int r0 = r5.channel_pos
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r1 = r5.epgChannels
            int r1 = r1.size()
            if (r0 >= r1) goto L11a
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r5.categoryModels
            int r1 = r5.category_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = "all_id"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L70
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
            if (r0 == 0) goto L70
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r5.epgChannels
            int r1 = r5.channel_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            int r1 = r5.channel_pos
            r5.showChannelLockDlgFragment(r0, r1, r2)
            goto L11a
        L70:
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
            if (r0 != 0) goto Lc8
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r5.categoryModels
            int r1 = r5.category_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = "lock_id"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Lc8
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r5.epgChannels
            int r1 = r5.channel_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            boolean r0 = r0.is_locked()
            if (r0 == 0) goto Lc8
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r5.epgChannels
            int r1 = r5.channel_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            int r1 = r5.channel_pos
            r5.showChannelLockDlgFragment(r0, r1, r2)
            goto L11a
        Lc8:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r5.epgChannels
            int r1 = r5.channel_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            r5.playSelectedChannel(r0)
            com.flextv.livestore.helper.PreferenceHelper r0 = r5.preferenceHelper
            boolean r0 = r0.getSharedPreferenceISM3U()
            if (r0 != 0) goto Lea
            android.os.Handler r0 = r5.handler
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r1 = r5.epgTicker
            r0.removeCallbacks(r1)
            java.lang.String r0 = r5.stream_id
            r5.epgTimer(r0)
            goto Lee
        Lea:
            r0 = 0
            r5.showEpgInfo(r0)
        Lee:
            int r0 = r5.channel_pos
            r5.changeChannelInfo(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L102
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            r0.setVisibility(r3)
        L102:
            android.os.Handler r0 = r5.handler
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r1 = r5.hideInfoTicker
            r0.removeCallbacks(r1)
            r5.mInfoHideTimer()
            android.widget.TextView r0 = r5.txt_name
            java.lang.String r1 = r5.channel_name
            r0.setText(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r5.recycler_channel
            int r1 = r5.channel_pos
            r0.scrollToPosition(r1)
        L11a:
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
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r4.epgChannels
            int r0 = r0.size()
            if (r0 <= 0) goto L118
            int r0 = r4.channel_pos
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r2 = r4.epgChannels
            int r2 = r2.size()
            if (r0 >= r2) goto L118
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r4.categoryModels
            int r2 = r4.category_pos
            java.lang.Object r0 = r0.get(r2)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r2 = "all_id"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L6d
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
            if (r0 == 0) goto L6d
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r4.epgChannels
            int r2 = r4.channel_pos
            java.lang.Object r0 = r0.get(r2)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            int r2 = r4.channel_pos
            r4.showChannelLockDlgFragment(r0, r2, r1)
            goto L118
        L6d:
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
            if (r0 != 0) goto Lc5
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r4.categoryModels
            int r2 = r4.category_pos
            java.lang.Object r0 = r0.get(r2)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r2 = "lock_id"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto Lc5
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r4.epgChannels
            int r2 = r4.channel_pos
            java.lang.Object r0 = r0.get(r2)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            boolean r0 = r0.is_locked()
            if (r0 == 0) goto Lc5
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r4.epgChannels
            int r2 = r4.channel_pos
            java.lang.Object r0 = r0.get(r2)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            int r2 = r4.channel_pos
            r4.showChannelLockDlgFragment(r0, r2, r1)
            goto L118
        Lc5:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r4.epgChannels
            int r1 = r4.channel_pos
            java.lang.Object r0 = r0.get(r1)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            r4.playSelectedChannel(r0)
            com.flextv.livestore.helper.PreferenceHelper r0 = r4.preferenceHelper
            boolean r0 = r0.getSharedPreferenceISM3U()
            if (r0 != 0) goto Le7
            android.os.Handler r0 = r4.handler
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r1 = r4.epgTicker
            r0.removeCallbacks(r1)
            java.lang.String r0 = r4.stream_id
            r4.epgTimer(r0)
            goto Leb
        Le7:
            r0 = 0
            r4.showEpgInfo(r0)
        Leb:
            int r0 = r4.channel_pos
            r4.changeChannelInfo(r0)
            android.widget.TextView r0 = r4.txt_name
            java.lang.String r1 = r4.channel_name
            r0.setText(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r4.ly_control
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L107
            androidx.constraintlayout.widget.ConstraintLayout r0 = r4.ly_control
            r1 = 0
            r0.setVisibility(r1)
        L107:
            android.os.Handler r0 = r4.handler
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r1 = r4.hideInfoTicker
            r0.removeCallbacks(r1)
            r4.mInfoHideTimer()
            androidx.recyclerview.widget.RecyclerView r0 = r4.recycler_channel
            int r1 = r4.channel_pos
            r0.scrollToPosition(r1)
        L118:
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
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.activities.mobile.LiveChannelMobileActivity$$ExternalSyntheticLambda0
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
            com.google.android.exoplayer2.ExoPlayer$Builder r0 = new com.google.android.exoplayer2.ExoPlayer$Builder
            r0.<init>(r4)
            com.google.android.exoplayer2.source.MediaSource$Factory r1 = r4.createMediaSourceFactory()
            com.google.android.exoplayer2.ExoPlayer$Builder r0 = r0.setMediaSourceFactory(r1)
            r1 = 1
            r4.setRenderersFactory(r0, r1)
            com.google.android.exoplayer2.ExoPlayer r0 = r0.build()
            r4.player = r0
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2 = r4.trackSelectionParameters
            r0.setTrackSelectionParameters(r2)
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity$2 r2 = new com.flextv.livestore.activities.mobile.LiveChannelMobileActivity$2
            r2.<init>(r4)
            r0.addAnalyticsListener(r2)
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity$PlayerEventListener r2 = new com.flextv.livestore.activities.mobile.LiveChannelMobileActivity$PlayerEventListener
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

    private void saveCategoryAndChannelPosition() {
            r5 = this;
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            java.util.List<com.flextv.livestore.models.CategoryModel> r1 = r5.categoryModels
            int r2 = r5.category_pos
            java.lang.Object r1 = r1.get(r2)
            com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
            com.flextv.livestore.helper.PreferenceHelper r2 = r5.preferenceHelper
            boolean r2 = r2.getSharedPreferenceISM3U()
            com.flextv.livestore.helper.PreferenceHelper r3 = r5.preferenceHelper
            int r3 = r3.getSharedPreferenceLiveOrder()
            java.lang.String r4 = ""
            io.realm.RealmResults r0 = r0.getLiveChannelsByCategory(r1, r4, r2, r3)
            r1 = 0
            r2 = 0
        L22:
            int r3 = r0.size()
            if (r2 >= r3) goto L43
            com.flextv.livestore.models.EPGChannel r3 = r5.selectedChannel
            java.lang.String r3 = r3.getName()
            java.lang.Object r4 = r0.get(r2)
            com.flextv.livestore.models.EPGChannel r4 = (com.flextv.livestore.models.EPGChannel) r4
            java.lang.String r4 = r4.getName()
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L40
            r1 = r2
            goto L43
        L40:
            int r2 = r2 + 1
            goto L22
        L43:
            com.flextv.livestore.helper.PreferenceHelper r0 = r5.preferenceHelper
            r0.setSharedPreferenceChannelPos(r1)
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
            androidx.recyclerview.widget.RecyclerView r5 = r4.recycler_channel
            r0 = 0
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

    private void setFull() {
            r5 = this;
            boolean r0 = r5.is_full
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L33
            android.widget.Button r0 = r5.btn_catch_up
            r0.setVisibility(r2)
            android.widget.Button r0 = r5.btn_fav
            r0.setVisibility(r2)
            android.widget.Button r0 = r5.btn_search
            r0.setVisibility(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r5.recycler_channel
            r0.setVisibility(r2)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L28
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            r0.setVisibility(r1)
        L28:
            android.os.Handler r0 = r5.handler
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r1 = r5.hideInfoTicker
            r0.removeCallbacks(r1)
            r5.mInfoHideTimer()
            goto L5f
        L33:
            android.widget.Button r0 = r5.btn_catch_up
            r0.setVisibility(r1)
            android.widget.Button r0 = r5.btn_fav
            r0.setVisibility(r1)
            android.widget.Button r0 = r5.btn_search
            r0.setVisibility(r1)
            android.os.Handler r0 = r5.handler
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r3 = r5.hideInfoTicker
            r0.removeCallbacks(r3)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.ly_control
            r0.setVisibility(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r5.recycler_channel
            r0.setVisibility(r1)
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r0 = r5.channelAdapter
            int r1 = r5.channel_pos
            r0.setSelectedPosition(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r5.recycler_channel
            r0.requestFocus()
        L5f:
            androidx.constraintlayout.widget.ConstraintSet r0 = new androidx.constraintlayout.widget.ConstraintSet
            r0.<init>()
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.main_lay
            r0.clone(r1)
            boolean r1 = r5.is_full
            r2 = 2131427766(0x7f0b01b6, float:1.8477158E38)
            r3 = 2131427765(0x7f0b01b5, float:1.8477155E38)
            r4 = 2131428368(0x7f0b0410, float:1.8478379E38)
            if (r1 == 0) goto L83
            r1 = 0
            r0.setGuidelinePercent(r4, r1)
            r0.setGuidelinePercent(r3, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setGuidelinePercent(r2, r1)
            goto L94
        L83:
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setGuidelinePercent(r4, r1)
            r1 = 1036831949(0x3dcccccd, float:0.1)
            r0.setGuidelinePercent(r3, r1)
            r1 = 1058642330(0x3f19999a, float:0.6)
            r0.setGuidelinePercent(r2, r1)
        L94:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.main_lay
            r0.applyTo(r1)
            return
    }

    private void setRenderersFactory(com.google.android.exoplayer2.ExoPlayer.Builder r1, boolean r2) {
            r0 = this;
            com.google.android.exoplayer2.RenderersFactory r2 = com.flextv.livestore.utils.DemoUtil.buildRenderersFactory(r0, r2)
            r1.setRenderersFactory(r2)
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
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity$1 r3 = new com.flextv.livestore.activities.mobile.LiveChannelMobileActivity$1
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

    private void showFavImageIcon(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L1e
            android.widget.Button r3 = r2.btn_fav
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getRemove_favorites()
            r3.setText(r0)
            android.widget.ImageButton r3 = r2.btn_full_fav
            android.content.res.Resources r0 = r2.getResources()
            r1 = 2131100408(0x7f0602f8, float:1.7813197E38)
            int r0 = r0.getColor(r1)
            r3.setColorFilter(r0)
            goto L39
        L1e:
            android.widget.Button r3 = r2.btn_fav
            com.flextv.livestore.models.WordModels r0 = r2.wordModels
            java.lang.String r0 = r0.getAdd_to_favorite()
            r3.setText(r0)
            android.widget.ImageButton r3 = r2.btn_full_fav
            android.content.res.Resources r0 = r2.getResources()
            r1 = 2131100407(0x7f0602f7, float:1.7813195E38)
            int r0 = r0.getColor(r1)
            r3.setColorFilter(r0)
        L39:
            return
    }

    private void showLockImageIcon(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.widget.ImageButton r2 = r1.btn_lock
            r0 = 2131231015(0x7f080127, float:1.80781E38)
            r2.setImageResource(r0)
            goto L13
        Lb:
            android.widget.ImageButton r2 = r1.btn_lock
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
            com.flextv.livestore.activities.mobile.LiveChannelMobileActivity$$ExternalSyntheticLambda0 r3 = new com.flextv.livestore.activities.mobile.LiveChannelMobileActivity$$ExternalSyntheticLambda0
            r3.<init>(r5)
            r1.setSelectCurrentChannelListener(r3)
            com.flextv.livestore.dlgfragment.LiveSearchDlgFragment r1 = r5.searchDlgFragment
            r1.show(r0, r2)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r5) {
            r4 = this;
            int r5 = r5.getId()
            java.lang.String r0 = "resume_id"
            r1 = 8
            r2 = 1
            r3 = 0
            switch(r5) {
                case 2131427464: goto L184;
                case 2131427466: goto L180;
                case 2131427469: goto L149;
                case 2131427471: goto L180;
                case 2131427472: goto L149;
                case 2131427473: goto L140;
                case 2131427475: goto Ld5;
                case 2131427477: goto Ld0;
                case 2131427480: goto La8;
                case 2131427482: goto La3;
                case 2131427484: goto L82;
                case 2131427487: goto L13c;
                case 2131428284: goto L62;
                case 2131428313: goto L2f;
                case 2131428316: goto L62;
                case 2131428322: goto L2a;
                case 2131428343: goto L25;
                case 2131428377: goto L10;
                default: goto Le;
            }
        Le:
            goto L189
        L10:
            androidx.constraintlayout.widget.ConstraintLayout r5 = r4.ly_control
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L189
            android.os.Handler r5 = r4.handler
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r0 = r4.hideInfoTicker
            r5.removeCallbacks(r0)
            androidx.constraintlayout.widget.ConstraintLayout r5 = r4.ly_control
            r5.setVisibility(r1)
            return
        L25:
            r4.goToSeriesActivity()
            goto L189
        L2a:
            r4.goToVodActivity()
            goto L189
        L2f:
            r4.releaseMediaPlayer()
            java.util.List<com.flextv.livestore.models.CategoryModel> r5 = r4.categoryModels
            int r1 = r4.category_pos
            java.lang.Object r5 = r5.get(r1)
            com.flextv.livestore.models.CategoryModel r5 = (com.flextv.livestore.models.CategoryModel) r5
            java.lang.String r5 = r5.getId()
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L4d
            com.flextv.livestore.models.EPGChannel r5 = r4.selectedChannel
            if (r5 == 0) goto L4d
            r4.saveCategoryAndChannelPosition()
        L4d:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r0 = "is_changed"
            java.lang.String r1 = "home"
            r5.putExtra(r0, r1)
            r0 = -1
            r4.setResult(r0, r5)
            r4.finish()
            goto L184
        L62:
            java.util.List<com.flextv.livestore.models.CategoryModel> r5 = r4.categoryModels
            int r1 = r4.category_pos
            java.lang.Object r5 = r5.get(r1)
            com.flextv.livestore.models.CategoryModel r5 = (com.flextv.livestore.models.CategoryModel) r5
            java.lang.String r5 = r5.getId()
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L7d
            com.flextv.livestore.models.EPGChannel r5 = r4.selectedChannel
            if (r5 == 0) goto L7d
            r4.saveCategoryAndChannelPosition()
        L7d:
            r4.finish()
            goto L189
        L82:
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            if (r5 == 0) goto L189
            boolean r5 = r5.getPlayWhenReady()
            if (r5 == 0) goto L189
            com.google.android.exoplayer2.ui.StyledPlayerView r5 = r4.playerView
            int r5 = r5.getResizeMode()
            r0 = 3
            if (r5 != r0) goto L9c
            com.google.android.exoplayer2.ui.StyledPlayerView r5 = r4.playerView
            r5.setResizeMode(r3)
            goto L189
        L9c:
            com.google.android.exoplayer2.ui.StyledPlayerView r5 = r4.playerView
            r5.setResizeMode(r0)
            goto L189
        La3:
            r4.playPreviousChannel()
            goto L189
        La8:
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            if (r5 == 0) goto L189
            boolean r5 = r5.getPlayWhenReady()
            if (r5 == 0) goto Lc1
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            r5.setPlayWhenReady(r3)
            android.widget.ImageButton r5 = r4.btn_play
            r0 = 2131231027(0x7f080133, float:1.8078123E38)
            r5.setImageResource(r0)
            goto L189
        Lc1:
            com.google.android.exoplayer2.ExoPlayer r5 = r4.player
            r5.setPlayWhenReady(r2)
            android.widget.ImageButton r5 = r4.btn_play
            r0 = 2131231026(0x7f080132, float:1.8078121E38)
            r5.setImageResource(r0)
            goto L189
        Ld0:
            r4.playNextChannel()
            goto L189
        Ld5:
            com.flextv.livestore.models.EPGChannel r5 = r4.selectedChannel
            if (r5 == 0) goto L13c
            java.lang.String r5 = r5.getCategory_id()
            com.flextv.livestore.models.EPGChannel r0 = r4.selectedChannel
            java.lang.String r0 = r0.getCategory_name()
            boolean r5 = r4.isAdultChannel(r5, r0)
            if (r5 == 0) goto Lf7
            com.flextv.livestore.models.WordModels r5 = r4.wordModels
            java.lang.String r5 = r5.getChannel_locked_default()
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r3)
            r5.show()
            goto L13c
        Lf7:
            com.flextv.livestore.models.EPGChannel r5 = r4.selectedChannel
            boolean r5 = r5.is_locked()
            if (r5 == 0) goto L108
            com.flextv.livestore.models.EPGChannel r5 = r4.selectedChannel
            int r0 = r4.channel_pos
            r1 = 4
            r4.showChannelLockDlgFragment(r5, r0, r1)
            goto L13c
        L108:
            com.flextv.livestore.models.EPGChannel r5 = r4.selectedChannel
            int r0 = r4.channel_pos
            r4.controlLock(r5, r0)
            com.flextv.livestore.models.EPGChannel r5 = r4.selectedChannel
            boolean r5 = r5.is_locked()
            r5 = r5 ^ r2
            r4.showLockImageIcon(r5)
            com.flextv.livestore.models.EPGChannel r5 = r4.selectedChannel
            boolean r5 = r5.is_locked()
            if (r5 == 0) goto L12f
            com.flextv.livestore.models.WordModels r5 = r4.wordModels
            java.lang.String r5 = r5.getChannel_unlocked()
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r3)
            r5.show()
            goto L13c
        L12f:
            com.flextv.livestore.models.WordModels r5 = r4.wordModels
            java.lang.String r5 = r5.getChannel_locked()
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r3)
            r5.show()
        L13c:
            r4.goToSearchActivity()
            goto L189
        L140:
            androidx.constraintlayout.widget.ConstraintLayout r5 = r4.ly_control
            r5.setVisibility(r1)
            r4.showSearchDlgFragment()
            goto L189
        L149:
            com.flextv.livestore.models.EPGChannel r5 = r4.selectedChannel
            if (r5 == 0) goto L189
            int r0 = r4.channel_pos
            r4.controlFav(r5, r0)
            com.flextv.livestore.models.EPGChannel r5 = r4.selectedChannel
            boolean r5 = r5.is_favorite()
            r5 = r5 ^ r2
            r4.showFavImageIcon(r5)
            com.flextv.livestore.models.EPGChannel r5 = r4.selectedChannel
            boolean r5 = r5.is_favorite()
            if (r5 == 0) goto L172
            com.flextv.livestore.models.WordModels r5 = r4.wordModels
            java.lang.String r5 = r5.getChannel_removed_from_fav()
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r3)
            r5.show()
            goto L189
        L172:
            com.flextv.livestore.models.WordModels r5 = r4.wordModels
            java.lang.String r5 = r5.getChannel_added_to_fav()
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r3)
            r5.show()
            goto L189
        L180:
            r4.goToCatchupActivity()
            goto L189
        L184:
            r4.is_full = r3
            r4.setFull()
        L189:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r8) {
            r7 = this;
            super.onCreate(r8)
            r8 = 2131623973(0x7f0e0025, float:1.8875113E38)
            r7.setContentView(r8)
            com.flextv.livestore.utils.Utils.FullScreenCall(r7)
            com.flextv.livestore.helper.PreferenceHelper r8 = new com.flextv.livestore.helper.PreferenceHelper
            r8.<init>(r7)
            r7.preferenceHelper = r8
            com.flextv.livestore.models.WordModels r8 = com.flextv.livestore.helper.GetSharedInfo.getWordModel(r7)
            r7.wordModels = r8
            r7.initView()
            com.google.android.exoplayer2.upstream.DataSource$Factory r8 = com.flextv.livestore.utils.DemoUtil.getDataSourceFactory(r7)
            r7.dataSourceFactory = r8
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r8 = new com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder
            r8.<init>(r7)
            com.flextv.livestore.helper.PreferenceHelper r0 = r7.preferenceHelper
            boolean r0 = r0.getSharedPreferenceSubtitleEnable()
            r1 = 1
            r0 = r0 ^ r1
            r2 = 3
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r8 = r8.setTrackTypeDisabled(r2, r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r8 = r8.build()
            r7.trackSelectionParameters = r8
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r0 = "is_full"
            r3 = 0
            boolean r8 = r8.getBooleanExtra(r0, r3)
            r7.is_full = r8
            com.flextv.livestore.helper.PreferenceHelper r8 = r7.preferenceHelper
            java.util.List r8 = r8.getSharedPreferenceInvisibleLiveCategories()
            com.flextv.livestore.apps.Constants.getLiveGroupModels(r8, r7)
            java.util.List<com.flextv.livestore.models.CategoryModel> r8 = com.flextv.livestore.apps.LTVApp.live_categories_filter
            r7.categoryModels = r8
            com.flextv.livestore.helper.PreferenceHelper r8 = r7.preferenceHelper
            int r8 = r8.getSharedPreferenceCategoryPos()
            r7.category_pos = r8
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r7.categoryModels
            int r0 = r0.size()
            int r0 = r0 - r1
            if (r8 <= r0) goto L67
            r7.category_pos = r1
        L67:
            int r8 = r7.category_pos
            r0 = 4
            java.lang.String r4 = ""
            if (r8 <= r0) goto La9
            com.flextv.livestore.helper.PreferenceHelper r0 = r7.preferenceHelper
            java.util.List r0 = r0.getSharedPreferenceMyGroupCategory()
            int r0 = r0.size()
            int r0 = r0 + 5
            if (r8 >= r0) goto La9
            com.flextv.livestore.helper.PreferenceHelper r8 = r7.preferenceHelper
            java.util.List r8 = r8.getSharedPreferenceMyGroupCategory()
            int r8 = r8.size()
            if (r8 <= 0) goto Lc9
            com.flextv.livestore.helper.PreferenceHelper r8 = r7.preferenceHelper
            java.util.List r8 = r8.getSharedPreferenceMyGroupCategory()
            int r0 = r7.category_pos
            int r0 = r0 + (-5)
            java.lang.Object r8 = r8.get(r0)
            java.lang.String r8 = (java.lang.String) r8
            com.flextv.livestore.helper.PreferenceHelper r0 = r7.preferenceHelper
            java.util.List r8 = r0.getSharedPreferenceMyGroupChannels(r8)
            com.flextv.livestore.helper.RealmController r0 = com.flextv.livestore.helper.RealmController.with()
            io.realm.RealmResults r8 = r0.getEpgChannelsByNameArray(r8, r4)
            r7.epgChannels = r8
            goto Lc9
        La9:
            com.flextv.livestore.helper.RealmController r8 = com.flextv.livestore.helper.RealmController.with()
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = r7.categoryModels
            int r5 = r7.category_pos
            java.lang.Object r0 = r0.get(r5)
            com.flextv.livestore.models.CategoryModel r0 = (com.flextv.livestore.models.CategoryModel) r0
            com.flextv.livestore.helper.PreferenceHelper r5 = r7.preferenceHelper
            boolean r5 = r5.getSharedPreferenceISM3U()
            com.flextv.livestore.helper.PreferenceHelper r6 = r7.preferenceHelper
            int r6 = r6.getSharedPreferenceLiveOrder()
            io.realm.RealmResults r8 = r8.getLiveChannelsByCategory(r0, r4, r5, r6)
            r7.epgChannels = r8
        Lc9:
            r7.channel_pos = r3
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r8 = new com.flextv.livestore.adapter.RecyclerLiveChannelAdapter
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r7.epgChannels
            com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda4 r4 = new com.flextv.livestore.activities.LiveActivity$$ExternalSyntheticLambda4
            r4.<init>(r7, r2)
            r8.<init>(r7, r0, r3, r4)
            r7.channelAdapter = r8
            androidx.recyclerview.widget.RecyclerView r8 = r7.recycler_channel
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r7)
            r8.setLayoutManager(r0)
            androidx.recyclerview.widget.RecyclerView r8 = r7.recycler_channel
            com.flextv.livestore.adapter.RecyclerLiveChannelAdapter r0 = r7.channelAdapter
            r8.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r8 = r7.recycler_channel
            r8.requestFocus()
            androidx.recyclerview.widget.RecyclerView r8 = r7.recycler_channel
            int r0 = r7.channel_pos
            r8.scrollToPosition(r0)
            com.flextv.livestore.adapter.EpgRecyclerAdapter r8 = new com.flextv.livestore.adapter.EpgRecyclerAdapter
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.<init>(r7, r0)
            r7.epgAdapter = r8
            androidx.recyclerview.widget.RecyclerView r8 = r7.recycler_epg
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r7)
            r8.setLayoutManager(r0)
            androidx.recyclerview.widget.RecyclerView r8 = r7.recycler_epg
            com.flextv.livestore.adapter.EpgRecyclerAdapter r0 = r7.epgAdapter
            r8.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r8 = r7.recycler_epg
            r8.setFocusable(r3)
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r8 = r7.epgChannels
            int r8 = r8.size()
            if (r8 <= 0) goto L1de
            r7.setFull()
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r8 = r7.epgChannels
            int r0 = r7.channel_pos
            java.lang.Object r8 = r8.get(r0)
            com.flextv.livestore.models.EPGChannel r8 = (com.flextv.livestore.models.EPGChannel) r8
            java.lang.String r8 = r8.getCategory_id()
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r0 = r7.epgChannels
            int r2 = r7.channel_pos
            java.lang.Object r0 = r0.get(r2)
            com.flextv.livestore.models.EPGChannel r0 = (com.flextv.livestore.models.EPGChannel) r0
            java.lang.String r0 = r0.getCategory_name()
            boolean r8 = r7.isAdultChannel(r8, r0)
            if (r8 == 0) goto L147
            r7.channel_pos = r3
        L147:
            java.util.List<com.flextv.livestore.models.CategoryModel> r8 = r7.categoryModels
            int r0 = r7.category_pos
            java.lang.Object r8 = r8.get(r0)
            com.flextv.livestore.models.CategoryModel r8 = (com.flextv.livestore.models.CategoryModel) r8
            java.lang.String r8 = r8.getId()
            java.lang.String r0 = "lock_id"
            boolean r8 = r8.equalsIgnoreCase(r0)
            if (r8 != 0) goto L17d
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r8 = r7.epgChannels
            int r0 = r7.channel_pos
            java.lang.Object r8 = r8.get(r0)
            com.flextv.livestore.models.EPGChannel r8 = (com.flextv.livestore.models.EPGChannel) r8
            boolean r8 = r8.is_locked()
            if (r8 == 0) goto L17d
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r8 = r7.epgChannels
            int r0 = r7.channel_pos
            java.lang.Object r8 = r8.get(r0)
            com.flextv.livestore.models.EPGChannel r8 = (com.flextv.livestore.models.EPGChannel) r8
            int r0 = r7.channel_pos
            r7.showChannelLockDlgFragment(r8, r0, r1)
            goto L1de
        L17d:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r8 = r7.epgChannels
            int r0 = r7.channel_pos
            java.lang.Object r8 = r8.get(r0)
            com.flextv.livestore.models.EPGChannel r8 = (com.flextv.livestore.models.EPGChannel) r8
            r7.playSelectedChannel(r8)
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r8 = r7.epgChannels
            int r0 = r7.channel_pos
            java.lang.Object r8 = r8.get(r0)
            com.flextv.livestore.models.EPGChannel r8 = (com.flextv.livestore.models.EPGChannel) r8
            java.lang.String r8 = r8.getStream_id()
            r7.stream_id = r8
            com.flextv.livestore.helper.PreferenceHelper r8 = r7.preferenceHelper
            boolean r8 = r8.getSharedPreferenceISM3U()
            if (r8 != 0) goto L1af
            android.os.Handler r8 = r7.handler
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r0 = r7.epgTicker
            r8.removeCallbacks(r0)
            java.lang.String r8 = r7.stream_id
            r7.epgTimer(r8)
            goto L1b3
        L1af:
            r8 = 0
            r7.showEpgInfo(r8)
        L1b3:
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r8 = r7.epgChannels
            int r0 = r7.channel_pos
            java.lang.Object r8 = r8.get(r0)
            com.flextv.livestore.models.EPGChannel r8 = (com.flextv.livestore.models.EPGChannel) r8
            java.lang.String r8 = r8.getName()
            r7.channel_name = r8
            android.widget.TextView r0 = r7.txt_name
            r0.setText(r8)
            io.realm.RealmResults<com.flextv.livestore.models.EPGChannel> r8 = r7.epgChannels
            int r0 = r7.channel_pos
            java.lang.Object r8 = r8.get(r0)
            com.flextv.livestore.models.EPGChannel r8 = (com.flextv.livestore.models.EPGChannel) r8
            boolean r8 = r8.is_favorite()
            r7.showFavImageIcon(r8)
            int r8 = r7.channel_pos
            r7.changeChannelInfo(r8)
        L1de:
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

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar r2, int r3, boolean r4) {
            r1 = this;
            if (r4 == 0) goto L7e
            int r2 = r2.getId()
            r4 = 2131427450(0x7f0b007a, float:1.8476517E38)
            r0 = 0
            if (r2 == r4) goto L23
            r4 = 2131428387(0x7f0b0423, float:1.8478417E38)
            if (r2 == r4) goto L12
            goto L7e
        L12:
            android.media.AudioManager r2 = r1.audioManager
            r4 = 3
            int r2 = r2.getStreamMaxVolume(r4)
            int r2 = r2 * r3
            int r2 = r2 / 100
            android.media.AudioManager r3 = r1.audioManager
            r3.setStreamVolume(r4, r2, r0)
            goto L7e
        L23:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r2 < r4) goto L7e
            boolean r2 = android.provider.Settings.System.canWrite(r1)
            if (r2 != 0) goto L59
            boolean r2 = r1.is_system_setting
            if (r2 != 0) goto L7e
            r2 = 1
            r1.is_system_setting = r2
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.settings.action.MANAGE_WRITE_SETTINGS"
            r2.<init>(r3)
            java.lang.String r3 = "package:"
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.String r4 = r1.getPackageName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r2.setData(r3)
            r1.startActivity(r2)
            goto L7e
        L59:
            android.content.ContentResolver r2 = r1.getContentResolver()
            java.lang.String r4 = "screen_brightness_mode"
            android.provider.Settings.System.putInt(r2, r4, r0)
            android.content.ContentResolver r2 = r1.getContentResolver()
            java.lang.String r4 = "screen_brightness"
            android.provider.Settings.System.putInt(r2, r4, r3)
            android.view.Window r2 = r1.getWindow()
            android.view.WindowManager$LayoutParams r4 = r2.getAttributes()
            float r3 = (float) r3
            r0 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 / r0
            r4.screenBrightness = r3
            r2.setAttributes(r4)
        L7e:
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
            r2.releaseMediaPlayer()
        L13:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar r1) {
            r0 = this;
            return
    }
}
