package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes.dex */
public class PlayerControlView extends android.widget.FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private long[] adGroupTimesMs;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final com.google.android.exoplayer2.ui.PlayerControlView.ComponentListener componentListener;
    private long currentBufferedPosition;
    private long currentPosition;
    private long currentWindowOffset;

    @androidx.annotation.Nullable
    private final android.widget.TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;

    @androidx.annotation.Nullable
    private final android.view.View fastForwardButton;
    private final java.lang.StringBuilder formatBuilder;
    private final java.util.Formatter formatter;
    private final java.lang.Runnable hideAction;
    private long hideAtMs;
    private boolean isAttachedToWindow;
    private boolean multiWindowTimeBar;

    @androidx.annotation.Nullable
    private final android.view.View nextButton;

    @androidx.annotation.Nullable
    private final android.view.View pauseButton;
    private final com.google.android.exoplayer2.Timeline.Period period;

    @androidx.annotation.Nullable
    private final android.view.View playButton;
    private boolean[] playedAdGroups;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Player player;

    @androidx.annotation.Nullable
    private final android.widget.TextView positionView;

    @androidx.annotation.Nullable
    private final android.view.View previousButton;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.ui.PlayerControlView.ProgressUpdateListener progressUpdateListener;
    private final java.lang.String repeatAllButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatAllButtonDrawable;
    private final java.lang.String repeatOffButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatOffButtonDrawable;
    private final java.lang.String repeatOneButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatOneButtonDrawable;

    @androidx.annotation.Nullable
    private final android.widget.ImageView repeatToggleButton;
    private int repeatToggleModes;

    @androidx.annotation.Nullable
    private final android.view.View rewindButton;
    private boolean scrubbing;
    private boolean showFastForwardButton;
    private boolean showMultiWindowTimeBar;
    private boolean showNextButton;
    private boolean showPreviousButton;
    private boolean showRewindButton;
    private boolean showShuffleButton;
    private int showTimeoutMs;

    @androidx.annotation.Nullable
    private final android.widget.ImageView shuffleButton;
    private final android.graphics.drawable.Drawable shuffleOffButtonDrawable;
    private final java.lang.String shuffleOffContentDescription;
    private final android.graphics.drawable.Drawable shuffleOnButtonDrawable;
    private final java.lang.String shuffleOnContentDescription;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.ui.TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final java.lang.Runnable updateProgressAction;
    private final java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener> visibilityListeners;

    @androidx.annotation.Nullable
    private final android.view.View vrButton;
    private final com.google.android.exoplayer2.Timeline.Window window;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerControlView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @androidx.annotation.RequiresApi(21)
    public static final class Api21 {
        private Api21() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean isAccessibilityFocused(android.view.View r0) {
                boolean r0 = r0.isAccessibilityFocused()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class ComponentListener implements com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.ui.TimeBar.OnScrubListener, android.view.View.OnClickListener {
        public final /* synthetic */ com.google.android.exoplayer2.ui.PlayerControlView this$0;

        private ComponentListener(com.google.android.exoplayer2.ui.PlayerControlView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ ComponentListener(com.google.android.exoplayer2.ui.PlayerControlView r1, com.google.android.exoplayer2.ui.PlayerControlView.AnonymousClass1 r2) {
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

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.google.android.exoplayer2.ui.PlayerControlView r0 = r2.this$0
                com.google.android.exoplayer2.Player r0 = com.google.android.exoplayer2.ui.PlayerControlView.access$1100(r0)
                if (r0 != 0) goto L9
                return
            L9:
                com.google.android.exoplayer2.ui.PlayerControlView r1 = r2.this$0
                android.view.View r1 = com.google.android.exoplayer2.ui.PlayerControlView.access$1300(r1)
                if (r1 != r3) goto L16
                r0.seekToNext()
                goto L88
            L16:
                com.google.android.exoplayer2.ui.PlayerControlView r1 = r2.this$0
                android.view.View r1 = com.google.android.exoplayer2.ui.PlayerControlView.access$1400(r1)
                if (r1 != r3) goto L22
                r0.seekToPrevious()
                goto L88
            L22:
                com.google.android.exoplayer2.ui.PlayerControlView r1 = r2.this$0
                android.view.View r1 = com.google.android.exoplayer2.ui.PlayerControlView.access$1500(r1)
                if (r1 != r3) goto L35
                int r3 = r0.getPlaybackState()
                r1 = 4
                if (r3 == r1) goto L88
                r0.seekForward()
                goto L88
            L35:
                com.google.android.exoplayer2.ui.PlayerControlView r1 = r2.this$0
                android.view.View r1 = com.google.android.exoplayer2.ui.PlayerControlView.access$1600(r1)
                if (r1 != r3) goto L41
                r0.seekBack()
                goto L88
            L41:
                com.google.android.exoplayer2.ui.PlayerControlView r1 = r2.this$0
                android.view.View r1 = com.google.android.exoplayer2.ui.PlayerControlView.access$1700(r1)
                if (r1 != r3) goto L4f
                com.google.android.exoplayer2.ui.PlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.ui.PlayerControlView.access$1800(r3, r0)
                goto L88
            L4f:
                com.google.android.exoplayer2.ui.PlayerControlView r1 = r2.this$0
                android.view.View r1 = com.google.android.exoplayer2.ui.PlayerControlView.access$1900(r1)
                if (r1 != r3) goto L5d
                com.google.android.exoplayer2.ui.PlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.ui.PlayerControlView.access$2000(r3, r0)
                goto L88
            L5d:
                com.google.android.exoplayer2.ui.PlayerControlView r1 = r2.this$0
                android.widget.ImageView r1 = com.google.android.exoplayer2.ui.PlayerControlView.access$2100(r1)
                if (r1 != r3) goto L77
                int r3 = r0.getRepeatMode()
                com.google.android.exoplayer2.ui.PlayerControlView r1 = r2.this$0
                int r1 = com.google.android.exoplayer2.ui.PlayerControlView.access$2200(r1)
                int r3 = com.google.android.exoplayer2.util.RepeatModeUtil.getNextRepeatMode(r3, r1)
                r0.setRepeatMode(r3)
                goto L88
            L77:
                com.google.android.exoplayer2.ui.PlayerControlView r1 = r2.this$0
                android.widget.ImageView r1 = com.google.android.exoplayer2.ui.PlayerControlView.access$2300(r1)
                if (r1 != r3) goto L88
                boolean r3 = r0.getShuffleModeEnabled()
                r3 = r3 ^ 1
                r0.setShuffleModeEnabled(r3)
            L88:
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
        public void onEvents(com.google.android.exoplayer2.Player r2, com.google.android.exoplayer2.Player.Events r3) {
                r1 = this;
                r2 = 2
                int[] r0 = new int[r2]
                r0 = {x005e: FILL_ARRAY_DATA , data: [4, 5} // fill-array
                boolean r0 = r3.containsAny(r0)
                if (r0 == 0) goto L11
                com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.this$0
                com.google.android.exoplayer2.ui.PlayerControlView.access$100(r0)
            L11:
                r0 = 3
                int[] r0 = new int[r0]
                r0 = {x0066: FILL_ARRAY_DATA , data: [4, 5, 7} // fill-array
                boolean r0 = r3.containsAny(r0)
                if (r0 == 0) goto L22
                com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.this$0
                com.google.android.exoplayer2.ui.PlayerControlView.access$200(r0)
            L22:
                r0 = 8
                boolean r0 = r3.contains(r0)
                if (r0 == 0) goto L2f
                com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.this$0
                com.google.android.exoplayer2.ui.PlayerControlView.access$300(r0)
            L2f:
                r0 = 9
                boolean r0 = r3.contains(r0)
                if (r0 == 0) goto L3c
                com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.this$0
                com.google.android.exoplayer2.ui.PlayerControlView.access$400(r0)
            L3c:
                r0 = 5
                int[] r0 = new int[r0]
                r0 = {x0070: FILL_ARRAY_DATA , data: [8, 9, 11, 0, 13} // fill-array
                boolean r0 = r3.containsAny(r0)
                if (r0 == 0) goto L4d
                com.google.android.exoplayer2.ui.PlayerControlView r0 = r1.this$0
                com.google.android.exoplayer2.ui.PlayerControlView.access$500(r0)
            L4d:
                int[] r2 = new int[r2]
                r2 = {x007e: FILL_ARRAY_DATA , data: [11, 0} // fill-array
                boolean r2 = r3.containsAny(r2)
                if (r2 == 0) goto L5d
                com.google.android.exoplayer2.ui.PlayerControlView r2 = r1.this$0
                com.google.android.exoplayer2.ui.PlayerControlView.access$600(r2)
            L5d:
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
        public final /* synthetic */ void onPlaybackStateChanged(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackStateChanged(r0, r1)
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

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubMove(com.google.android.exoplayer2.ui.TimeBar r3, long r4) {
                r2 = this;
                com.google.android.exoplayer2.ui.PlayerControlView r3 = r2.this$0
                android.widget.TextView r3 = com.google.android.exoplayer2.ui.PlayerControlView.access$800(r3)
                if (r3 == 0) goto L21
                com.google.android.exoplayer2.ui.PlayerControlView r3 = r2.this$0
                android.widget.TextView r3 = com.google.android.exoplayer2.ui.PlayerControlView.access$800(r3)
                com.google.android.exoplayer2.ui.PlayerControlView r0 = r2.this$0
                java.lang.StringBuilder r0 = com.google.android.exoplayer2.ui.PlayerControlView.access$900(r0)
                com.google.android.exoplayer2.ui.PlayerControlView r1 = r2.this$0
                java.util.Formatter r1 = com.google.android.exoplayer2.ui.PlayerControlView.access$1000(r1)
                java.lang.String r4 = com.google.android.exoplayer2.util.Util.getStringForTime(r0, r1, r4)
                r3.setText(r4)
            L21:
                return
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStart(com.google.android.exoplayer2.ui.TimeBar r3, long r4) {
                r2 = this;
                com.google.android.exoplayer2.ui.PlayerControlView r3 = r2.this$0
                r0 = 1
                com.google.android.exoplayer2.ui.PlayerControlView.access$702(r3, r0)
                com.google.android.exoplayer2.ui.PlayerControlView r3 = r2.this$0
                android.widget.TextView r3 = com.google.android.exoplayer2.ui.PlayerControlView.access$800(r3)
                if (r3 == 0) goto L27
                com.google.android.exoplayer2.ui.PlayerControlView r3 = r2.this$0
                android.widget.TextView r3 = com.google.android.exoplayer2.ui.PlayerControlView.access$800(r3)
                com.google.android.exoplayer2.ui.PlayerControlView r0 = r2.this$0
                java.lang.StringBuilder r0 = com.google.android.exoplayer2.ui.PlayerControlView.access$900(r0)
                com.google.android.exoplayer2.ui.PlayerControlView r1 = r2.this$0
                java.util.Formatter r1 = com.google.android.exoplayer2.ui.PlayerControlView.access$1000(r1)
                java.lang.String r4 = com.google.android.exoplayer2.util.Util.getStringForTime(r0, r1, r4)
                r3.setText(r4)
            L27:
                return
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStop(com.google.android.exoplayer2.ui.TimeBar r2, long r3, boolean r5) {
                r1 = this;
                com.google.android.exoplayer2.ui.PlayerControlView r2 = r1.this$0
                r0 = 0
                com.google.android.exoplayer2.ui.PlayerControlView.access$702(r2, r0)
                if (r5 != 0) goto L19
                com.google.android.exoplayer2.ui.PlayerControlView r2 = r1.this$0
                com.google.android.exoplayer2.Player r2 = com.google.android.exoplayer2.ui.PlayerControlView.access$1100(r2)
                if (r2 == 0) goto L19
                com.google.android.exoplayer2.ui.PlayerControlView r2 = r1.this$0
                com.google.android.exoplayer2.Player r5 = com.google.android.exoplayer2.ui.PlayerControlView.access$1100(r2)
                com.google.android.exoplayer2.ui.PlayerControlView.access$1200(r2, r5, r3)
            L19:
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

    public interface ProgressUpdateListener {
        void onProgressUpdate(long r1, long r3);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface VisibilityListener {
        void onVisibilityChange(int r1);
    }

    public static /* synthetic */ void $r8$lambda$EPQn3wIJfHsmBxsRaGVq7MNXq9U(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            r0.updateProgress()
            return
    }

    static {
            java.lang.String r0 = "goog.exo.ui"
            com.google.android.exoplayer2.ExoPlayerLibraryInfo.registerModule(r0)
            return
    }

    public PlayerControlView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public PlayerControlView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public PlayerControlView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3, r2)
            return
    }

    public PlayerControlView(android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9, @androidx.annotation.Nullable android.util.AttributeSet r10) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            int r8 = com.google.android.exoplayer2.ui.R.layout.exo_player_control_view
            r0 = 5000(0x1388, float:7.006E-42)
            r6.showTimeoutMs = r0
            r0 = 0
            r6.repeatToggleModes = r0
            r1 = 200(0xc8, float:2.8E-43)
            r6.timeBarMinUpdateIntervalMs = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.hideAtMs = r1
            r3 = 1
            r6.showRewindButton = r3
            r6.showFastForwardButton = r3
            r6.showPreviousButton = r3
            r6.showNextButton = r3
            r6.showShuffleButton = r0
            if (r10 == 0) goto L8c
            android.content.res.Resources$Theme r4 = r7.getTheme()
            int[] r5 = com.google.android.exoplayer2.ui.R.styleable.PlayerControlView
            android.content.res.TypedArray r9 = r4.obtainStyledAttributes(r10, r5, r9, r0)
            int r4 = com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_show_timeout     // Catch: java.lang.Throwable -> L87
            int r5 = r6.showTimeoutMs     // Catch: java.lang.Throwable -> L87
            int r4 = r9.getInt(r4, r5)     // Catch: java.lang.Throwable -> L87
            r6.showTimeoutMs = r4     // Catch: java.lang.Throwable -> L87
            int r4 = com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_controller_layout_id     // Catch: java.lang.Throwable -> L87
            int r8 = r9.getResourceId(r4, r8)     // Catch: java.lang.Throwable -> L87
            int r4 = r6.repeatToggleModes     // Catch: java.lang.Throwable -> L87
            int r4 = getRepeatToggleModes(r9, r4)     // Catch: java.lang.Throwable -> L87
            r6.repeatToggleModes = r4     // Catch: java.lang.Throwable -> L87
            int r4 = com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_show_rewind_button     // Catch: java.lang.Throwable -> L87
            boolean r5 = r6.showRewindButton     // Catch: java.lang.Throwable -> L87
            boolean r4 = r9.getBoolean(r4, r5)     // Catch: java.lang.Throwable -> L87
            r6.showRewindButton = r4     // Catch: java.lang.Throwable -> L87
            int r4 = com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_show_fastforward_button     // Catch: java.lang.Throwable -> L87
            boolean r5 = r6.showFastForwardButton     // Catch: java.lang.Throwable -> L87
            boolean r4 = r9.getBoolean(r4, r5)     // Catch: java.lang.Throwable -> L87
            r6.showFastForwardButton = r4     // Catch: java.lang.Throwable -> L87
            int r4 = com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_show_previous_button     // Catch: java.lang.Throwable -> L87
            boolean r5 = r6.showPreviousButton     // Catch: java.lang.Throwable -> L87
            boolean r4 = r9.getBoolean(r4, r5)     // Catch: java.lang.Throwable -> L87
            r6.showPreviousButton = r4     // Catch: java.lang.Throwable -> L87
            int r4 = com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_show_next_button     // Catch: java.lang.Throwable -> L87
            boolean r5 = r6.showNextButton     // Catch: java.lang.Throwable -> L87
            boolean r4 = r9.getBoolean(r4, r5)     // Catch: java.lang.Throwable -> L87
            r6.showNextButton = r4     // Catch: java.lang.Throwable -> L87
            int r4 = com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_show_shuffle_button     // Catch: java.lang.Throwable -> L87
            boolean r5 = r6.showShuffleButton     // Catch: java.lang.Throwable -> L87
            boolean r4 = r9.getBoolean(r4, r5)     // Catch: java.lang.Throwable -> L87
            r6.showShuffleButton = r4     // Catch: java.lang.Throwable -> L87
            int r4 = com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_time_bar_min_update_interval     // Catch: java.lang.Throwable -> L87
            int r5 = r6.timeBarMinUpdateIntervalMs     // Catch: java.lang.Throwable -> L87
            int r4 = r9.getInt(r4, r5)     // Catch: java.lang.Throwable -> L87
            r6.setTimeBarMinUpdateInterval(r4)     // Catch: java.lang.Throwable -> L87
            r9.recycle()
            goto L8c
        L87:
            r7 = move-exception
            r9.recycle()
            throw r7
        L8c:
            java.util.concurrent.CopyOnWriteArrayList r9 = new java.util.concurrent.CopyOnWriteArrayList
            r9.<init>()
            r6.visibilityListeners = r9
            com.google.android.exoplayer2.Timeline$Period r9 = new com.google.android.exoplayer2.Timeline$Period
            r9.<init>()
            r6.period = r9
            com.google.android.exoplayer2.Timeline$Window r9 = new com.google.android.exoplayer2.Timeline$Window
            r9.<init>()
            r6.window = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r6.formatBuilder = r9
            java.util.Formatter r4 = new java.util.Formatter
            java.util.Locale r5 = java.util.Locale.getDefault()
            r4.<init>(r9, r5)
            r6.formatter = r4
            long[] r9 = new long[r0]
            r6.adGroupTimesMs = r9
            boolean[] r9 = new boolean[r0]
            r6.playedAdGroups = r9
            long[] r9 = new long[r0]
            r6.extraAdGroupTimesMs = r9
            boolean[] r9 = new boolean[r0]
            r6.extraPlayedAdGroups = r9
            com.google.android.exoplayer2.ui.PlayerControlView$ComponentListener r9 = new com.google.android.exoplayer2.ui.PlayerControlView$ComponentListener
            r4 = 0
            r9.<init>(r6, r4)
            r6.componentListener = r9
            com.google.android.exoplayer2.ui.PlayerControlView$$ExternalSyntheticLambda0 r5 = new com.google.android.exoplayer2.ui.PlayerControlView$$ExternalSyntheticLambda0
            r5.<init>(r6, r0)
            r6.updateProgressAction = r5
            com.google.android.exoplayer2.ui.PlayerControlView$$ExternalSyntheticLambda0 r5 = new com.google.android.exoplayer2.ui.PlayerControlView$$ExternalSyntheticLambda0
            r5.<init>(r6, r3)
            r6.hideAction = r5
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r7)
            r3.inflate(r8, r6)
            r8 = 262144(0x40000, float:3.67342E-40)
            r6.setDescendantFocusability(r8)
            int r8 = com.google.android.exoplayer2.ui.R.id.exo_progress
            android.view.View r3 = r6.findViewById(r8)
            com.google.android.exoplayer2.ui.TimeBar r3 = (com.google.android.exoplayer2.ui.TimeBar) r3
            int r5 = com.google.android.exoplayer2.ui.R.id.exo_progress_placeholder
            android.view.View r5 = r6.findViewById(r5)
            if (r3 == 0) goto Lf8
            r6.timeBar = r3
            goto L11e
        Lf8:
            if (r5 == 0) goto L11c
            com.google.android.exoplayer2.ui.DefaultTimeBar r3 = new com.google.android.exoplayer2.ui.DefaultTimeBar
            r3.<init>(r7, r4, r0, r10)
            r3.setId(r8)
            android.view.ViewGroup$LayoutParams r8 = r5.getLayoutParams()
            r3.setLayoutParams(r8)
            android.view.ViewParent r8 = r5.getParent()
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r10 = r8.indexOfChild(r5)
            r8.removeView(r5)
            r8.addView(r3, r10)
            r6.timeBar = r3
            goto L11e
        L11c:
            r6.timeBar = r4
        L11e:
            int r8 = com.google.android.exoplayer2.ui.R.id.exo_duration
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r6.durationView = r8
            int r8 = com.google.android.exoplayer2.ui.R.id.exo_position
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r6.positionView = r8
            com.google.android.exoplayer2.ui.TimeBar r8 = r6.timeBar
            if (r8 == 0) goto L139
            r8.addListener(r9)
        L139:
            int r8 = com.google.android.exoplayer2.ui.R.id.exo_play
            android.view.View r8 = r6.findViewById(r8)
            r6.playButton = r8
            if (r8 == 0) goto L146
            r8.setOnClickListener(r9)
        L146:
            int r8 = com.google.android.exoplayer2.ui.R.id.exo_pause
            android.view.View r8 = r6.findViewById(r8)
            r6.pauseButton = r8
            if (r8 == 0) goto L153
            r8.setOnClickListener(r9)
        L153:
            int r8 = com.google.android.exoplayer2.ui.R.id.exo_prev
            android.view.View r8 = r6.findViewById(r8)
            r6.previousButton = r8
            if (r8 == 0) goto L160
            r8.setOnClickListener(r9)
        L160:
            int r8 = com.google.android.exoplayer2.ui.R.id.exo_next
            android.view.View r8 = r6.findViewById(r8)
            r6.nextButton = r8
            if (r8 == 0) goto L16d
            r8.setOnClickListener(r9)
        L16d:
            int r8 = com.google.android.exoplayer2.ui.R.id.exo_rew
            android.view.View r8 = r6.findViewById(r8)
            r6.rewindButton = r8
            if (r8 == 0) goto L17a
            r8.setOnClickListener(r9)
        L17a:
            int r8 = com.google.android.exoplayer2.ui.R.id.exo_ffwd
            android.view.View r8 = r6.findViewById(r8)
            r6.fastForwardButton = r8
            if (r8 == 0) goto L187
            r8.setOnClickListener(r9)
        L187:
            int r8 = com.google.android.exoplayer2.ui.R.id.exo_repeat_toggle
            android.view.View r8 = r6.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r6.repeatToggleButton = r8
            if (r8 == 0) goto L196
            r8.setOnClickListener(r9)
        L196:
            int r8 = com.google.android.exoplayer2.ui.R.id.exo_shuffle
            android.view.View r8 = r6.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r6.shuffleButton = r8
            if (r8 == 0) goto L1a5
            r8.setOnClickListener(r9)
        L1a5:
            int r8 = com.google.android.exoplayer2.ui.R.id.exo_vr
            android.view.View r8 = r6.findViewById(r8)
            r6.vrButton = r8
            r6.setShowVrButton(r0)
            r6.updateButton(r0, r0, r8)
            android.content.res.Resources r8 = r7.getResources()
            int r9 = com.google.android.exoplayer2.ui.R.integer.exo_media_button_opacity_percentage_enabled
            int r9 = r8.getInteger(r9)
            float r9 = (float) r9
            r10 = 1120403456(0x42c80000, float:100.0)
            float r9 = r9 / r10
            r6.buttonAlphaEnabled = r9
            int r9 = com.google.android.exoplayer2.ui.R.integer.exo_media_button_opacity_percentage_disabled
            int r9 = r8.getInteger(r9)
            float r9 = (float) r9
            float r9 = r9 / r10
            r6.buttonAlphaDisabled = r9
            int r9 = com.google.android.exoplayer2.ui.R.drawable.exo_controls_repeat_off
            android.graphics.drawable.Drawable r9 = com.google.android.exoplayer2.util.Util.getDrawable(r7, r8, r9)
            r6.repeatOffButtonDrawable = r9
            int r9 = com.google.android.exoplayer2.ui.R.drawable.exo_controls_repeat_one
            android.graphics.drawable.Drawable r9 = com.google.android.exoplayer2.util.Util.getDrawable(r7, r8, r9)
            r6.repeatOneButtonDrawable = r9
            int r9 = com.google.android.exoplayer2.ui.R.drawable.exo_controls_repeat_all
            android.graphics.drawable.Drawable r9 = com.google.android.exoplayer2.util.Util.getDrawable(r7, r8, r9)
            r6.repeatAllButtonDrawable = r9
            int r9 = com.google.android.exoplayer2.ui.R.drawable.exo_controls_shuffle_on
            android.graphics.drawable.Drawable r9 = com.google.android.exoplayer2.util.Util.getDrawable(r7, r8, r9)
            r6.shuffleOnButtonDrawable = r9
            int r9 = com.google.android.exoplayer2.ui.R.drawable.exo_controls_shuffle_off
            android.graphics.drawable.Drawable r7 = com.google.android.exoplayer2.util.Util.getDrawable(r7, r8, r9)
            r6.shuffleOffButtonDrawable = r7
            int r7 = com.google.android.exoplayer2.ui.R.string.exo_controls_repeat_off_description
            java.lang.String r7 = r8.getString(r7)
            r6.repeatOffButtonContentDescription = r7
            int r7 = com.google.android.exoplayer2.ui.R.string.exo_controls_repeat_one_description
            java.lang.String r7 = r8.getString(r7)
            r6.repeatOneButtonContentDescription = r7
            int r7 = com.google.android.exoplayer2.ui.R.string.exo_controls_repeat_all_description
            java.lang.String r7 = r8.getString(r7)
            r6.repeatAllButtonContentDescription = r7
            int r7 = com.google.android.exoplayer2.ui.R.string.exo_controls_shuffle_on_description
            java.lang.String r7 = r8.getString(r7)
            r6.shuffleOnContentDescription = r7
            int r7 = com.google.android.exoplayer2.ui.R.string.exo_controls_shuffle_off_description
            java.lang.String r7 = r8.getString(r7)
            r6.shuffleOffContentDescription = r7
            r6.currentPosition = r1
            r6.currentBufferedPosition = r1
            return
    }

    public static /* synthetic */ void access$100(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            r0.updatePlayPauseButton()
            return
    }

    public static /* synthetic */ java.util.Formatter access$1000(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            java.util.Formatter r0 = r0.formatter
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.Player access$1100(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            com.google.android.exoplayer2.Player r0 = r0.player
            return r0
    }

    public static /* synthetic */ void access$1200(com.google.android.exoplayer2.ui.PlayerControlView r0, com.google.android.exoplayer2.Player r1, long r2) {
            r0.seekToTimeBarPosition(r1, r2)
            return
    }

    public static /* synthetic */ android.view.View access$1300(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            android.view.View r0 = r0.nextButton
            return r0
    }

    public static /* synthetic */ android.view.View access$1400(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            android.view.View r0 = r0.previousButton
            return r0
    }

    public static /* synthetic */ android.view.View access$1500(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            android.view.View r0 = r0.fastForwardButton
            return r0
    }

    public static /* synthetic */ android.view.View access$1600(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            android.view.View r0 = r0.rewindButton
            return r0
    }

    public static /* synthetic */ android.view.View access$1700(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            android.view.View r0 = r0.playButton
            return r0
    }

    public static /* synthetic */ void access$1800(com.google.android.exoplayer2.ui.PlayerControlView r0, com.google.android.exoplayer2.Player r1) {
            r0.dispatchPlay(r1)
            return
    }

    public static /* synthetic */ android.view.View access$1900(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            android.view.View r0 = r0.pauseButton
            return r0
    }

    public static /* synthetic */ void access$200(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            r0.updateProgress()
            return
    }

    public static /* synthetic */ void access$2000(com.google.android.exoplayer2.ui.PlayerControlView r0, com.google.android.exoplayer2.Player r1) {
            r0.dispatchPause(r1)
            return
    }

    public static /* synthetic */ android.widget.ImageView access$2100(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            android.widget.ImageView r0 = r0.repeatToggleButton
            return r0
    }

    public static /* synthetic */ int access$2200(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            int r0 = r0.repeatToggleModes
            return r0
    }

    public static /* synthetic */ android.widget.ImageView access$2300(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            android.widget.ImageView r0 = r0.shuffleButton
            return r0
    }

    public static /* synthetic */ void access$300(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            r0.updateRepeatModeButton()
            return
    }

    public static /* synthetic */ void access$400(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            r0.updateShuffleButton()
            return
    }

    public static /* synthetic */ void access$500(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            r0.updateNavigation()
            return
    }

    public static /* synthetic */ void access$600(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            r0.updateTimeline()
            return
    }

    public static /* synthetic */ boolean access$702(com.google.android.exoplayer2.ui.PlayerControlView r0, boolean r1) {
            r0.scrubbing = r1
            return r1
    }

    public static /* synthetic */ android.widget.TextView access$800(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            android.widget.TextView r0 = r0.positionView
            return r0
    }

    public static /* synthetic */ java.lang.StringBuilder access$900(com.google.android.exoplayer2.ui.PlayerControlView r0) {
            java.lang.StringBuilder r0 = r0.formatBuilder
            return r0
    }

    private static boolean canShowMultiWindowTimeBar(com.google.android.exoplayer2.Timeline r8, com.google.android.exoplayer2.Timeline.Window r9) {
            int r0 = r8.getWindowCount()
            r1 = 0
            r2 = 100
            if (r0 <= r2) goto La
            return r1
        La:
            int r0 = r8.getWindowCount()
            r2 = 0
        Lf:
            if (r2 >= r0) goto L24
            com.google.android.exoplayer2.Timeline$Window r3 = r8.getWindow(r2, r9)
            long r3 = r3.durationUs
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L21
            return r1
        L21:
            int r2 = r2 + 1
            goto Lf
        L24:
            r8 = 1
            return r8
    }

    private void dispatchPause(com.google.android.exoplayer2.Player r1) {
            r0 = this;
            r1.pause()
            return
    }

    private void dispatchPlay(com.google.android.exoplayer2.Player r4) {
            r3 = this;
            int r0 = r4.getPlaybackState()
            r1 = 1
            if (r0 != r1) goto Lb
            r4.prepare()
            goto L1a
        Lb:
            r1 = 4
            if (r0 != r1) goto L1a
            int r0 = r4.getCurrentMediaItemIndex()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.seekTo(r4, r0, r1)
        L1a:
            r4.play()
            return
    }

    private void dispatchPlayPause(com.google.android.exoplayer2.Player r3) {
            r2 = this;
            int r0 = r3.getPlaybackState()
            r1 = 1
            if (r0 == r1) goto L15
            r1 = 4
            if (r0 == r1) goto L15
            boolean r0 = r3.getPlayWhenReady()
            if (r0 != 0) goto L11
            goto L15
        L11:
            r2.dispatchPause(r3)
            goto L18
        L15:
            r2.dispatchPlay(r3)
        L18:
            return
    }

    private static int getRepeatToggleModes(android.content.res.TypedArray r1, int r2) {
            int r0 = com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_repeat_toggle_modes
            int r1 = r1.getInt(r0, r2)
            return r1
    }

    private void hideAfterTimeout() {
            r5 = this;
            java.lang.Runnable r0 = r5.hideAction
            r5.removeCallbacks(r0)
            int r0 = r5.showTimeoutMs
            if (r0 <= 0) goto L1e
            long r0 = android.os.SystemClock.uptimeMillis()
            int r2 = r5.showTimeoutMs
            long r3 = (long) r2
            long r0 = r0 + r3
            r5.hideAtMs = r0
            boolean r0 = r5.isAttachedToWindow
            if (r0 == 0) goto L25
            java.lang.Runnable r0 = r5.hideAction
            long r1 = (long) r2
            r5.postDelayed(r0, r1)
            goto L25
        L1e:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.hideAtMs = r0
        L25:
            return
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int r1) {
            r0 = 90
            if (r1 == r0) goto L23
            r0 = 89
            if (r1 == r0) goto L23
            r0 = 85
            if (r1 == r0) goto L23
            r0 = 79
            if (r1 == r0) goto L23
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 == r0) goto L23
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 == r0) goto L23
            r0 = 87
            if (r1 == r0) goto L23
            r0 = 88
            if (r1 != r0) goto L21
            goto L23
        L21:
            r1 = 0
            goto L24
        L23:
            r1 = 1
        L24:
            return r1
    }

    private void requestPlayPauseAccessibilityFocus() {
            r3 = this;
            boolean r0 = r3.shouldShowPauseButton()
            r1 = 8
            if (r0 != 0) goto L10
            android.view.View r2 = r3.playButton
            if (r2 == 0) goto L10
            r2.sendAccessibilityEvent(r1)
            goto L19
        L10:
            if (r0 == 0) goto L19
            android.view.View r0 = r3.pauseButton
            if (r0 == 0) goto L19
            r0.sendAccessibilityEvent(r1)
        L19:
            return
    }

    private void requestPlayPauseFocus() {
            r2 = this;
            boolean r0 = r2.shouldShowPauseButton()
            if (r0 != 0) goto Le
            android.view.View r1 = r2.playButton
            if (r1 == 0) goto Le
            r1.requestFocus()
            goto L17
        Le:
            if (r0 == 0) goto L17
            android.view.View r0 = r2.pauseButton
            if (r0 == 0) goto L17
            r0.requestFocus()
        L17:
            return
    }

    private void seekTo(com.google.android.exoplayer2.Player r1, int r2, long r3) {
            r0 = this;
            r1.seekTo(r2, r3)
            return
    }

    private void seekToTimeBarPosition(com.google.android.exoplayer2.Player r7, long r8) {
            r6 = this;
            com.google.android.exoplayer2.Timeline r0 = r7.getCurrentTimeline()
            boolean r1 = r6.multiWindowTimeBar
            if (r1 == 0) goto L2c
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L2c
            int r1 = r0.getWindowCount()
            r2 = 0
        L13:
            com.google.android.exoplayer2.Timeline$Window r3 = r6.window
            com.google.android.exoplayer2.Timeline$Window r3 = r0.getWindow(r2, r3)
            long r3 = r3.getDurationMs()
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto L22
            goto L30
        L22:
            int r5 = r1 + (-1)
            if (r2 != r5) goto L28
            r8 = r3
            goto L30
        L28:
            long r8 = r8 - r3
            int r2 = r2 + 1
            goto L13
        L2c:
            int r2 = r7.getCurrentMediaItemIndex()
        L30:
            r6.seekTo(r7, r2, r8)
            r6.updateProgress()
            return
    }

    private boolean shouldShowPauseButton() {
            r3 = this;
            com.google.android.exoplayer2.Player r0 = r3.player
            r1 = 1
            if (r0 == 0) goto L1d
            int r0 = r0.getPlaybackState()
            r2 = 4
            if (r0 == r2) goto L1d
            com.google.android.exoplayer2.Player r0 = r3.player
            int r0 = r0.getPlaybackState()
            if (r0 == r1) goto L1d
            com.google.android.exoplayer2.Player r0 = r3.player
            boolean r0 = r0.getPlayWhenReady()
            if (r0 == 0) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            return r1
    }

    private void updateAll() {
            r0 = this;
            r0.updatePlayPauseButton()
            r0.updateNavigation()
            r0.updateRepeatModeButton()
            r0.updateShuffleButton()
            r0.updateTimeline()
            return
    }

    private void updateButton(boolean r1, boolean r2, @androidx.annotation.Nullable android.view.View r3) {
            r0 = this;
            if (r3 != 0) goto L3
            return
        L3:
            r3.setEnabled(r2)
            if (r2 == 0) goto Lb
            float r2 = r0.buttonAlphaEnabled
            goto Ld
        Lb:
            float r2 = r0.buttonAlphaDisabled
        Ld:
            r3.setAlpha(r2)
            if (r1 == 0) goto L14
            r1 = 0
            goto L16
        L14:
            r1 = 8
        L16:
            r3.setVisibility(r1)
            return
    }

    private void updateNavigation() {
            r8 = this;
            boolean r0 = r8.isVisible()
            if (r0 == 0) goto L57
            boolean r0 = r8.isAttachedToWindow
            if (r0 != 0) goto Lb
            goto L57
        Lb:
            com.google.android.exoplayer2.Player r0 = r8.player
            r1 = 0
            if (r0 == 0) goto L30
            r1 = 5
            boolean r1 = r0.isCommandAvailable(r1)
            r2 = 7
            boolean r2 = r0.isCommandAvailable(r2)
            r3 = 11
            boolean r3 = r0.isCommandAvailable(r3)
            r4 = 12
            boolean r4 = r0.isCommandAvailable(r4)
            r5 = 9
            boolean r0 = r0.isCommandAvailable(r5)
            r7 = r2
            r2 = r1
            r1 = r7
            goto L34
        L30:
            r0 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L34:
            boolean r5 = r8.showPreviousButton
            android.view.View r6 = r8.previousButton
            r8.updateButton(r5, r1, r6)
            boolean r1 = r8.showRewindButton
            android.view.View r5 = r8.rewindButton
            r8.updateButton(r1, r3, r5)
            boolean r1 = r8.showFastForwardButton
            android.view.View r3 = r8.fastForwardButton
            r8.updateButton(r1, r4, r3)
            boolean r1 = r8.showNextButton
            android.view.View r3 = r8.nextButton
            r8.updateButton(r1, r0, r3)
            com.google.android.exoplayer2.ui.TimeBar r0 = r8.timeBar
            if (r0 == 0) goto L57
            r0.setEnabled(r2)
        L57:
            return
    }

    private void updatePlayPauseButton() {
            r9 = this;
            boolean r0 = r9.isVisible()
            if (r0 == 0) goto L7d
            boolean r0 = r9.isAttachedToWindow
            if (r0 != 0) goto Lc
            goto L7d
        Lc:
            boolean r0 = r9.shouldShowPauseButton()
            android.view.View r1 = r9.playButton
            r2 = 8
            r3 = 21
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L46
            if (r0 == 0) goto L24
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            r1 = r1 | r5
            int r6 = com.google.android.exoplayer2.util.Util.SDK_INT
            if (r6 >= r3) goto L2c
            r6 = r1
            goto L39
        L2c:
            if (r0 == 0) goto L38
            android.view.View r6 = r9.playButton
            boolean r6 = com.google.android.exoplayer2.ui.PlayerControlView.Api21.isAccessibilityFocused(r6)
            if (r6 == 0) goto L38
            r6 = 1
            goto L39
        L38:
            r6 = 0
        L39:
            r6 = r6 | r5
            android.view.View r7 = r9.playButton
            if (r0 == 0) goto L41
            r8 = 8
            goto L42
        L41:
            r8 = 0
        L42:
            r7.setVisibility(r8)
            goto L48
        L46:
            r1 = 0
            r6 = 0
        L48:
            android.view.View r7 = r9.pauseButton
            if (r7 == 0) goto L73
            if (r0 != 0) goto L56
            boolean r7 = r7.isFocused()
            if (r7 == 0) goto L56
            r7 = 1
            goto L57
        L56:
            r7 = 0
        L57:
            r1 = r1 | r7
            int r7 = com.google.android.exoplayer2.util.Util.SDK_INT
            if (r7 >= r3) goto L5e
            r4 = r1
            goto L6a
        L5e:
            if (r0 != 0) goto L69
            android.view.View r3 = r9.pauseButton
            boolean r3 = com.google.android.exoplayer2.ui.PlayerControlView.Api21.isAccessibilityFocused(r3)
            if (r3 == 0) goto L69
            goto L6a
        L69:
            r4 = 0
        L6a:
            r6 = r6 | r4
            android.view.View r3 = r9.pauseButton
            if (r0 == 0) goto L70
            r2 = 0
        L70:
            r3.setVisibility(r2)
        L73:
            if (r1 == 0) goto L78
            r9.requestPlayPauseFocus()
        L78:
            if (r6 == 0) goto L7d
            r9.requestPlayPauseAccessibilityFocus()
        L7d:
            return
    }

    private void updateProgress() {
            r12 = this;
            boolean r0 = r12.isVisible()
            if (r0 == 0) goto Lb4
            boolean r0 = r12.isAttachedToWindow
            if (r0 != 0) goto Lc
            goto Lb4
        Lc:
            com.google.android.exoplayer2.Player r0 = r12.player
            r1 = 0
            if (r0 == 0) goto L21
            long r1 = r12.currentWindowOffset
            long r3 = r0.getContentPosition()
            long r1 = r1 + r3
            long r3 = r12.currentWindowOffset
            long r5 = r0.getContentBufferedPosition()
            long r3 = r3 + r5
            goto L22
        L21:
            r3 = r1
        L22:
            long r5 = r12.currentPosition
            r7 = 0
            r8 = 1
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 == 0) goto L2c
            r5 = 1
            goto L2d
        L2c:
            r5 = 0
        L2d:
            long r9 = r12.currentBufferedPosition
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r6 == 0) goto L34
            r7 = 1
        L34:
            r12.currentPosition = r1
            r12.currentBufferedPosition = r3
            android.widget.TextView r6 = r12.positionView
            if (r6 == 0) goto L4d
            boolean r9 = r12.scrubbing
            if (r9 != 0) goto L4d
            if (r5 == 0) goto L4d
            java.lang.StringBuilder r9 = r12.formatBuilder
            java.util.Formatter r10 = r12.formatter
            java.lang.String r9 = com.google.android.exoplayer2.util.Util.getStringForTime(r9, r10, r1)
            r6.setText(r9)
        L4d:
            com.google.android.exoplayer2.ui.TimeBar r6 = r12.timeBar
            if (r6 == 0) goto L59
            r6.setPosition(r1)
            com.google.android.exoplayer2.ui.TimeBar r6 = r12.timeBar
            r6.setBufferedPosition(r3)
        L59:
            com.google.android.exoplayer2.ui.PlayerControlView$ProgressUpdateListener r6 = r12.progressUpdateListener
            if (r6 == 0) goto L64
            if (r5 != 0) goto L61
            if (r7 == 0) goto L64
        L61:
            r6.onProgressUpdate(r1, r3)
        L64:
            java.lang.Runnable r3 = r12.updateProgressAction
            r12.removeCallbacks(r3)
            if (r0 != 0) goto L6d
            r3 = 1
            goto L71
        L6d:
            int r3 = r0.getPlaybackState()
        L71:
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto Laa
            boolean r6 = r0.isPlaying()
            if (r6 == 0) goto Laa
            com.google.android.exoplayer2.ui.TimeBar r3 = r12.timeBar
            if (r3 == 0) goto L84
            long r6 = r3.getPreferredUpdateDelay()
            goto L85
        L84:
            r6 = r4
        L85:
            long r1 = r1 % r4
            long r1 = r4 - r1
            long r1 = java.lang.Math.min(r6, r1)
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.getPlaybackParameters()
            float r0 = r0.speed
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L9a
            float r1 = (float) r1
            float r1 = r1 / r0
            long r4 = (long) r1
        L9a:
            r6 = r4
            int r0 = r12.timeBarMinUpdateIntervalMs
            long r8 = (long) r0
            r10 = 1000(0x3e8, double:4.94E-321)
            long r0 = com.google.android.exoplayer2.util.Util.constrainValue(r6, r8, r10)
            java.lang.Runnable r2 = r12.updateProgressAction
            r12.postDelayed(r2, r0)
            goto Lb4
        Laa:
            r0 = 4
            if (r3 == r0) goto Lb4
            if (r3 == r8) goto Lb4
            java.lang.Runnable r0 = r12.updateProgressAction
            r12.postDelayed(r0, r4)
        Lb4:
            return
    }

    private void updateRepeatModeButton() {
            r4 = this;
            boolean r0 = r4.isVisible()
            if (r0 == 0) goto L6f
            boolean r0 = r4.isAttachedToWindow
            if (r0 == 0) goto L6f
            android.widget.ImageView r0 = r4.repeatToggleButton
            if (r0 != 0) goto Lf
            goto L6f
        Lf:
            int r1 = r4.repeatToggleModes
            r2 = 0
            if (r1 != 0) goto L18
            r4.updateButton(r2, r2, r0)
            return
        L18:
            com.google.android.exoplayer2.Player r1 = r4.player
            r3 = 1
            if (r1 != 0) goto L2f
            r4.updateButton(r3, r2, r0)
            android.widget.ImageView r0 = r4.repeatToggleButton
            android.graphics.drawable.Drawable r1 = r4.repeatOffButtonDrawable
            r0.setImageDrawable(r1)
            android.widget.ImageView r0 = r4.repeatToggleButton
            java.lang.String r1 = r4.repeatOffButtonContentDescription
            r0.setContentDescription(r1)
            return
        L2f:
            r4.updateButton(r3, r3, r0)
            int r0 = r1.getRepeatMode()
            if (r0 == 0) goto L5c
            if (r0 == r3) goto L4d
            r1 = 2
            if (r0 == r1) goto L3e
            goto L6a
        L3e:
            android.widget.ImageView r0 = r4.repeatToggleButton
            android.graphics.drawable.Drawable r1 = r4.repeatAllButtonDrawable
            r0.setImageDrawable(r1)
            android.widget.ImageView r0 = r4.repeatToggleButton
            java.lang.String r1 = r4.repeatAllButtonContentDescription
            r0.setContentDescription(r1)
            goto L6a
        L4d:
            android.widget.ImageView r0 = r4.repeatToggleButton
            android.graphics.drawable.Drawable r1 = r4.repeatOneButtonDrawable
            r0.setImageDrawable(r1)
            android.widget.ImageView r0 = r4.repeatToggleButton
            java.lang.String r1 = r4.repeatOneButtonContentDescription
            r0.setContentDescription(r1)
            goto L6a
        L5c:
            android.widget.ImageView r0 = r4.repeatToggleButton
            android.graphics.drawable.Drawable r1 = r4.repeatOffButtonDrawable
            r0.setImageDrawable(r1)
            android.widget.ImageView r0 = r4.repeatToggleButton
            java.lang.String r1 = r4.repeatOffButtonContentDescription
            r0.setContentDescription(r1)
        L6a:
            android.widget.ImageView r0 = r4.repeatToggleButton
            r0.setVisibility(r2)
        L6f:
            return
    }

    private void updateShuffleButton() {
            r4 = this;
            boolean r0 = r4.isVisible()
            if (r0 == 0) goto L52
            boolean r0 = r4.isAttachedToWindow
            if (r0 == 0) goto L52
            android.widget.ImageView r0 = r4.shuffleButton
            if (r0 != 0) goto Lf
            goto L52
        Lf:
            com.google.android.exoplayer2.Player r1 = r4.player
            boolean r2 = r4.showShuffleButton
            r3 = 0
            if (r2 != 0) goto L1a
            r4.updateButton(r3, r3, r0)
            goto L52
        L1a:
            r2 = 1
            if (r1 != 0) goto L2f
            r4.updateButton(r2, r3, r0)
            android.widget.ImageView r0 = r4.shuffleButton
            android.graphics.drawable.Drawable r1 = r4.shuffleOffButtonDrawable
            r0.setImageDrawable(r1)
            android.widget.ImageView r0 = r4.shuffleButton
            java.lang.String r1 = r4.shuffleOffContentDescription
            r0.setContentDescription(r1)
            goto L52
        L2f:
            r4.updateButton(r2, r2, r0)
            android.widget.ImageView r0 = r4.shuffleButton
            boolean r2 = r1.getShuffleModeEnabled()
            if (r2 == 0) goto L3d
            android.graphics.drawable.Drawable r2 = r4.shuffleOnButtonDrawable
            goto L3f
        L3d:
            android.graphics.drawable.Drawable r2 = r4.shuffleOffButtonDrawable
        L3f:
            r0.setImageDrawable(r2)
            android.widget.ImageView r0 = r4.shuffleButton
            boolean r1 = r1.getShuffleModeEnabled()
            if (r1 == 0) goto L4d
            java.lang.String r1 = r4.shuffleOnContentDescription
            goto L4f
        L4d:
            java.lang.String r1 = r4.shuffleOffContentDescription
        L4f:
            r0.setContentDescription(r1)
        L52:
            return
    }

    private void updateTimeline() {
            r22 = this;
            r0 = r22
            com.google.android.exoplayer2.Player r1 = r0.player
            if (r1 != 0) goto L7
            return
        L7:
            boolean r2 = r0.showMultiWindowTimeBar
            r4 = 1
            if (r2 == 0) goto L1a
            com.google.android.exoplayer2.Timeline r2 = r1.getCurrentTimeline()
            com.google.android.exoplayer2.Timeline$Window r5 = r0.window
            boolean r2 = canShowMultiWindowTimeBar(r2, r5)
            if (r2 == 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            r0.multiWindowTimeBar = r2
            r5 = 0
            r0.currentWindowOffset = r5
            com.google.android.exoplayer2.Timeline r2 = r1.getCurrentTimeline()
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto Leb
            int r1 = r1.getCurrentMediaItemIndex()
            boolean r7 = r0.multiWindowTimeBar
            if (r7 == 0) goto L35
            r8 = 0
            goto L36
        L35:
            r8 = r1
        L36:
            if (r7 == 0) goto L3e
            int r7 = r2.getWindowCount()
            int r7 = r7 - r4
            goto L3f
        L3e:
            r7 = r1
        L3f:
            r9 = r5
            r11 = 0
        L41:
            if (r8 > r7) goto Le9
            if (r8 != r1) goto L4b
            long r12 = com.google.android.exoplayer2.util.Util.usToMs(r9)
            r0.currentWindowOffset = r12
        L4b:
            com.google.android.exoplayer2.Timeline$Window r12 = r0.window
            r2.getWindow(r8, r12)
            com.google.android.exoplayer2.Timeline$Window r12 = r0.window
            long r13 = r12.durationUs
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 != 0) goto L65
            boolean r1 = r0.multiWindowTimeBar
            r1 = r1 ^ r4
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            goto Le9
        L65:
            int r12 = r12.firstPeriodIndex
        L67:
            com.google.android.exoplayer2.Timeline$Window r13 = r0.window
            int r14 = r13.lastPeriodIndex
            if (r12 > r14) goto Ldf
            com.google.android.exoplayer2.Timeline$Period r13 = r0.period
            r2.getPeriod(r12, r13)
            com.google.android.exoplayer2.Timeline$Period r13 = r0.period
            int r13 = r13.getRemovedAdGroupCount()
            com.google.android.exoplayer2.Timeline$Period r14 = r0.period
            int r14 = r14.getAdGroupCount()
        L7e:
            if (r13 >= r14) goto Ld9
            com.google.android.exoplayer2.Timeline$Period r4 = r0.period
            long r18 = r4.getAdGroupTimeUs(r13)
            r20 = -9223372036854775808
            int r4 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r4 != 0) goto L97
            com.google.android.exoplayer2.Timeline$Period r4 = r0.period
            long r3 = r4.durationUs
            int r18 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r18 != 0) goto L95
            goto Ld3
        L95:
            r18 = r3
        L97:
            com.google.android.exoplayer2.Timeline$Period r3 = r0.period
            long r3 = r3.getPositionInWindowUs()
            long r3 = r3 + r18
            int r18 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r18 < 0) goto Ld3
            long[] r5 = r0.adGroupTimesMs
            int r6 = r5.length
            if (r11 != r6) goto Lbe
            int r6 = r5.length
            if (r6 != 0) goto Lad
            r6 = 1
            goto Lb0
        Lad:
            int r6 = r5.length
            int r6 = r6 * 2
        Lb0:
            long[] r5 = java.util.Arrays.copyOf(r5, r6)
            r0.adGroupTimesMs = r5
            boolean[] r5 = r0.playedAdGroups
            boolean[] r5 = java.util.Arrays.copyOf(r5, r6)
            r0.playedAdGroups = r5
        Lbe:
            long[] r5 = r0.adGroupTimesMs
            long r3 = r3 + r9
            long r3 = com.google.android.exoplayer2.util.Util.usToMs(r3)
            r5[r11] = r3
            boolean[] r3 = r0.playedAdGroups
            com.google.android.exoplayer2.Timeline$Period r4 = r0.period
            boolean r4 = r4.hasPlayedAdGroup(r13)
            r3[r11] = r4
            int r11 = r11 + 1
        Ld3:
            int r13 = r13 + 1
            r4 = 1
            r5 = 0
            goto L7e
        Ld9:
            int r12 = r12 + 1
            r4 = 1
            r5 = 0
            goto L67
        Ldf:
            long r3 = r13.durationUs
            long r9 = r9 + r3
            int r8 = r8 + 1
            r4 = 1
            r5 = 0
            goto L41
        Le9:
            r5 = r9
            goto Lee
        Leb:
            r5 = 0
            r11 = 0
        Lee:
            long r1 = com.google.android.exoplayer2.util.Util.usToMs(r5)
            android.widget.TextView r3 = r0.durationView
            if (r3 == 0) goto L101
            java.lang.StringBuilder r4 = r0.formatBuilder
            java.util.Formatter r5 = r0.formatter
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.getStringForTime(r4, r5, r1)
            r3.setText(r4)
        L101:
            com.google.android.exoplayer2.ui.TimeBar r3 = r0.timeBar
            if (r3 == 0) goto L138
            r3.setDuration(r1)
            long[] r1 = r0.extraAdGroupTimesMs
            int r1 = r1.length
            int r2 = r11 + r1
            long[] r3 = r0.adGroupTimesMs
            int r4 = r3.length
            if (r2 <= r4) goto L120
            long[] r3 = java.util.Arrays.copyOf(r3, r2)
            r0.adGroupTimesMs = r3
            boolean[] r3 = r0.playedAdGroups
            boolean[] r3 = java.util.Arrays.copyOf(r3, r2)
            r0.playedAdGroups = r3
        L120:
            long[] r3 = r0.extraAdGroupTimesMs
            long[] r4 = r0.adGroupTimesMs
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r4, r11, r1)
            boolean[] r3 = r0.extraPlayedAdGroups
            boolean[] r4 = r0.playedAdGroups
            java.lang.System.arraycopy(r3, r5, r4, r11, r1)
            com.google.android.exoplayer2.ui.TimeBar r1 = r0.timeBar
            long[] r3 = r0.adGroupTimesMs
            boolean[] r4 = r0.playedAdGroups
            r1.setAdGroupTimesMs(r3, r4, r2)
        L138:
            r22.updateProgress()
            return
    }

    public void addVisibilityListener(com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener r2) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.ui.PlayerControlView$VisibilityListener> r0 = r1.visibilityListeners
            r0.add(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = r1.dispatchMediaKeyEvent(r2)
            if (r0 != 0) goto Lf
            boolean r2 = super.dispatchKeyEvent(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    public boolean dispatchMediaKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            int r0 = r4.getKeyCode()
            com.google.android.exoplayer2.Player r1 = r3.player
            if (r1 == 0) goto L60
            boolean r2 = isHandledMediaKey(r0)
            if (r2 != 0) goto Lf
            goto L60
        Lf:
            int r2 = r4.getAction()
            if (r2 != 0) goto L5e
            r2 = 90
            if (r0 != r2) goto L24
            int r4 = r1.getPlaybackState()
            r0 = 4
            if (r4 == r0) goto L5e
            r1.seekForward()
            goto L5e
        L24:
            r2 = 89
            if (r0 != r2) goto L2c
            r1.seekBack()
            goto L5e
        L2c:
            int r4 = r4.getRepeatCount()
            if (r4 != 0) goto L5e
            r4 = 79
            if (r0 == r4) goto L5b
            r4 = 85
            if (r0 == r4) goto L5b
            r4 = 87
            if (r0 == r4) goto L57
            r4 = 88
            if (r0 == r4) goto L53
            r4 = 126(0x7e, float:1.77E-43)
            if (r0 == r4) goto L4f
            r4 = 127(0x7f, float:1.78E-43)
            if (r0 == r4) goto L4b
            goto L5e
        L4b:
            r3.dispatchPause(r1)
            goto L5e
        L4f:
            r3.dispatchPlay(r1)
            goto L5e
        L53:
            r1.seekToPrevious()
            goto L5e
        L57:
            r1.seekToNext()
            goto L5e
        L5b:
            r3.dispatchPlayPause(r1)
        L5e:
            r4 = 1
            return r4
        L60:
            r4 = 0
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            int r0 = r3.getAction()
            if (r0 != 0) goto Lc
            java.lang.Runnable r0 = r2.hideAction
            r2.removeCallbacks(r0)
            goto L16
        Lc:
            int r0 = r3.getAction()
            r1 = 1
            if (r0 != r1) goto L16
            r2.hideAfterTimeout()
        L16:
            boolean r3 = super.dispatchTouchEvent(r3)
            return r3
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.Player getPlayer() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            return r0
    }

    public int getRepeatToggleModes() {
            r1 = this;
            int r0 = r1.repeatToggleModes
            return r0
    }

    public boolean getShowShuffleButton() {
            r1 = this;
            boolean r0 = r1.showShuffleButton
            return r0
    }

    public int getShowTimeoutMs() {
            r1 = this;
            int r0 = r1.showTimeoutMs
            return r0
    }

    public boolean getShowVrButton() {
            r1 = this;
            android.view.View r0 = r1.vrButton
            if (r0 == 0) goto Lc
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void hide() {
            r3 = this;
            boolean r0 = r3.isVisible()
            if (r0 == 0) goto L36
            r0 = 8
            r3.setVisibility(r0)
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.ui.PlayerControlView$VisibilityListener> r0 = r3.visibilityListeners
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.ui.PlayerControlView$VisibilityListener r1 = (com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener) r1
            int r2 = r3.getVisibility()
            r1.onVisibilityChange(r2)
            goto L11
        L25:
            java.lang.Runnable r0 = r3.updateProgressAction
            r3.removeCallbacks(r0)
            java.lang.Runnable r0 = r3.hideAction
            r3.removeCallbacks(r0)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.hideAtMs = r0
        L36:
            return
    }

    public boolean isVisible() {
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r5 = this;
            super.onAttachedToWindow()
            r0 = 1
            r5.isAttachedToWindow = r0
            long r0 = r5.hideAtMs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L26
            long r2 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L20
            r5.hide()
            goto L2f
        L20:
            java.lang.Runnable r2 = r5.hideAction
            r5.postDelayed(r2, r0)
            goto L2f
        L26:
            boolean r0 = r5.isVisible()
            if (r0 == 0) goto L2f
            r5.hideAfterTimeout()
        L2f:
            r5.updateAll()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r1.isAttachedToWindow = r0
            java.lang.Runnable r0 = r1.updateProgressAction
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.hideAction
            r1.removeCallbacks(r0)
            return
    }

    public void removeVisibilityListener(com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.ui.PlayerControlView$VisibilityListener> r0 = r1.visibilityListeners
            r0.remove(r2)
            return
    }

    public void setExtraAdGroupMarkers(@androidx.annotation.Nullable long[] r4, @androidx.annotation.Nullable boolean[] r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Lc
            long[] r4 = new long[r0]
            r3.extraAdGroupTimesMs = r4
            boolean[] r4 = new boolean[r0]
            r3.extraPlayedAdGroups = r4
            goto L1e
        Lc:
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            boolean[] r5 = (boolean[]) r5
            int r1 = r4.length
            int r2 = r5.length
            if (r1 != r2) goto L17
            r0 = 1
        L17:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r3.extraAdGroupTimesMs = r4
            r3.extraPlayedAdGroups = r5
        L1e:
            r3.updateTimeline()
            return
    }

    public void setPlayer(@androidx.annotation.Nullable com.google.android.exoplayer2.Player r5) {
            r4 = this;
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
            if (r5 == 0) goto L20
            android.os.Looper r0 = r5.getApplicationLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L1f
            goto L20
        L1f:
            r2 = 0
        L20:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            com.google.android.exoplayer2.Player r0 = r4.player
            if (r0 != r5) goto L28
            return
        L28:
            if (r0 == 0) goto L2f
            com.google.android.exoplayer2.ui.PlayerControlView$ComponentListener r1 = r4.componentListener
            r0.removeListener(r1)
        L2f:
            r4.player = r5
            if (r5 == 0) goto L38
            com.google.android.exoplayer2.ui.PlayerControlView$ComponentListener r0 = r4.componentListener
            r5.addListener(r0)
        L38:
            r4.updateAll()
            return
    }

    public void setProgressUpdateListener(@androidx.annotation.Nullable com.google.android.exoplayer2.ui.PlayerControlView.ProgressUpdateListener r1) {
            r0 = this;
            r0.progressUpdateListener = r1
            return
    }

    public void setRepeatToggleModes(int r4) {
            r3 = this;
            r3.repeatToggleModes = r4
            com.google.android.exoplayer2.Player r0 = r3.player
            if (r0 == 0) goto L2a
            int r0 = r0.getRepeatMode()
            if (r4 != 0) goto L15
            if (r0 == 0) goto L15
            com.google.android.exoplayer2.Player r4 = r3.player
            r0 = 0
            r4.setRepeatMode(r0)
            goto L2a
        L15:
            r1 = 2
            r2 = 1
            if (r4 != r2) goto L21
            if (r0 != r1) goto L21
            com.google.android.exoplayer2.Player r4 = r3.player
            r4.setRepeatMode(r2)
            goto L2a
        L21:
            if (r4 != r1) goto L2a
            if (r0 != r2) goto L2a
            com.google.android.exoplayer2.Player r4 = r3.player
            r4.setRepeatMode(r1)
        L2a:
            r3.updateRepeatModeButton()
            return
    }

    public void setShowFastForwardButton(boolean r1) {
            r0 = this;
            r0.showFastForwardButton = r1
            r0.updateNavigation()
            return
    }

    public void setShowMultiWindowTimeBar(boolean r1) {
            r0 = this;
            r0.showMultiWindowTimeBar = r1
            r0.updateTimeline()
            return
    }

    public void setShowNextButton(boolean r1) {
            r0 = this;
            r0.showNextButton = r1
            r0.updateNavigation()
            return
    }

    public void setShowPreviousButton(boolean r1) {
            r0 = this;
            r0.showPreviousButton = r1
            r0.updateNavigation()
            return
    }

    public void setShowRewindButton(boolean r1) {
            r0 = this;
            r0.showRewindButton = r1
            r0.updateNavigation()
            return
    }

    public void setShowShuffleButton(boolean r1) {
            r0 = this;
            r0.showShuffleButton = r1
            r0.updateShuffleButton()
            return
    }

    public void setShowTimeoutMs(int r1) {
            r0 = this;
            r0.showTimeoutMs = r1
            boolean r1 = r0.isVisible()
            if (r1 == 0) goto Lb
            r0.hideAfterTimeout()
        Lb:
            return
    }

    public void setShowVrButton(boolean r2) {
            r1 = this;
            android.view.View r0 = r1.vrButton
            if (r0 == 0) goto Ld
            if (r2 == 0) goto L8
            r2 = 0
            goto La
        L8:
            r2 = 8
        La:
            r0.setVisibility(r2)
        Ld:
            return
    }

    public void setTimeBarMinUpdateInterval(int r3) {
            r2 = this;
            r0 = 16
            r1 = 1000(0x3e8, float:1.401E-42)
            int r3 = com.google.android.exoplayer2.util.Util.constrainValue(r3, r0, r1)
            r2.timeBarMinUpdateIntervalMs = r3
            return
    }

    public void setVrButtonListener(@androidx.annotation.Nullable android.view.View.OnClickListener r3) {
            r2 = this;
            android.view.View r0 = r2.vrButton
            if (r0 == 0) goto L15
            r0.setOnClickListener(r3)
            boolean r0 = r2.getShowVrButton()
            if (r3 == 0) goto Lf
            r3 = 1
            goto L10
        Lf:
            r3 = 0
        L10:
            android.view.View r1 = r2.vrButton
            r2.updateButton(r0, r3, r1)
        L15:
            return
    }

    public void show() {
            r3 = this;
            boolean r0 = r3.isVisible()
            if (r0 != 0) goto L2d
            r0 = 0
            r3.setVisibility(r0)
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.ui.PlayerControlView$VisibilityListener> r0 = r3.visibilityListeners
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.ui.PlayerControlView$VisibilityListener r1 = (com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener) r1
            int r2 = r3.getVisibility()
            r1.onVisibilityChange(r2)
            goto L10
        L24:
            r3.updateAll()
            r3.requestPlayPauseFocus()
            r3.requestPlayPauseAccessibilityFocus()
        L2d:
            r3.hideAfterTimeout()
            return
    }
}
