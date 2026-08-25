package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes.dex */
public class StyledPlayerControlView extends android.widget.FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final float[] PLAYBACK_SPEEDS = null;
    private static final int SETTINGS_AUDIO_TRACK_SELECTION_POSITION = 1;
    private static final int SETTINGS_PLAYBACK_SPEED_POSITION = 0;
    private long[] adGroupTimesMs;

    @androidx.annotation.Nullable
    private final android.view.View audioTrackButton;
    private final com.google.android.exoplayer2.ui.StyledPlayerControlView.AudioTrackSelectionAdapter audioTrackSelectionAdapter;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final com.google.android.exoplayer2.ui.StyledPlayerControlView.ComponentListener componentListener;
    private final com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager controlViewLayoutManager;
    private long currentWindowOffset;

    @androidx.annotation.Nullable
    private final android.widget.TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;

    @androidx.annotation.Nullable
    private final android.view.View fastForwardButton;

    @androidx.annotation.Nullable
    private final android.widget.TextView fastForwardButtonTextView;
    private final java.lang.StringBuilder formatBuilder;
    private final java.util.Formatter formatter;

    @androidx.annotation.Nullable
    private final android.widget.ImageView fullScreenButton;
    private final java.lang.String fullScreenEnterContentDescription;
    private final android.graphics.drawable.Drawable fullScreenEnterDrawable;
    private final java.lang.String fullScreenExitContentDescription;
    private final android.graphics.drawable.Drawable fullScreenExitDrawable;
    private boolean isAttachedToWindow;
    private boolean isFullScreen;

    @androidx.annotation.Nullable
    private final android.widget.ImageView minimalFullScreenButton;
    private boolean multiWindowTimeBar;
    private boolean needToHideBars;

    @androidx.annotation.Nullable
    private final android.view.View nextButton;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.ui.StyledPlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener;
    private final com.google.android.exoplayer2.Timeline.Period period;

    @androidx.annotation.Nullable
    private final android.view.View playPauseButton;
    private final com.google.android.exoplayer2.ui.StyledPlayerControlView.PlaybackSpeedAdapter playbackSpeedAdapter;

    @androidx.annotation.Nullable
    private final android.view.View playbackSpeedButton;
    private boolean[] playedAdGroups;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Player player;

    @androidx.annotation.Nullable
    private final android.widget.TextView positionView;

    @androidx.annotation.Nullable
    private final android.view.View previousButton;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.ui.StyledPlayerControlView.ProgressUpdateListener progressUpdateListener;
    private final java.lang.String repeatAllButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatAllButtonDrawable;
    private final java.lang.String repeatOffButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatOffButtonDrawable;
    private final java.lang.String repeatOneButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatOneButtonDrawable;

    @androidx.annotation.Nullable
    private final android.widget.ImageView repeatToggleButton;
    private int repeatToggleModes;
    private final android.content.res.Resources resources;

    @androidx.annotation.Nullable
    private final android.view.View rewindButton;

    @androidx.annotation.Nullable
    private final android.widget.TextView rewindButtonTextView;
    private boolean scrubbing;
    private final com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingsAdapter settingsAdapter;

    @androidx.annotation.Nullable
    private final android.view.View settingsButton;
    private final androidx.recyclerview.widget.RecyclerView settingsView;
    private final android.widget.PopupWindow settingsWindow;
    private final int settingsWindowMargin;
    private boolean showMultiWindowTimeBar;
    private int showTimeoutMs;

    @androidx.annotation.Nullable
    private final android.widget.ImageView shuffleButton;
    private final android.graphics.drawable.Drawable shuffleOffButtonDrawable;
    private final java.lang.String shuffleOffContentDescription;
    private final android.graphics.drawable.Drawable shuffleOnButtonDrawable;
    private final java.lang.String shuffleOnContentDescription;

    @androidx.annotation.Nullable
    private final android.widget.ImageView subtitleButton;
    private final android.graphics.drawable.Drawable subtitleOffButtonDrawable;
    private final java.lang.String subtitleOffContentDescription;
    private final android.graphics.drawable.Drawable subtitleOnButtonDrawable;
    private final java.lang.String subtitleOnContentDescription;
    private final com.google.android.exoplayer2.ui.StyledPlayerControlView.TextTrackSelectionAdapter textTrackSelectionAdapter;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.ui.TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final com.google.android.exoplayer2.ui.TrackNameProvider trackNameProvider;
    private final java.lang.Runnable updateProgressAction;
    private final java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.ui.StyledPlayerControlView.VisibilityListener> visibilityListeners;

    @androidx.annotation.Nullable
    private final android.view.View vrButton;
    private final com.google.android.exoplayer2.Timeline.Window window;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public final class AudioTrackSelectionAdapter extends com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter {
        public final /* synthetic */ com.google.android.exoplayer2.ui.StyledPlayerControlView this$0;

        /* JADX INFO: renamed from: $r8$lambda$pqvoHakFH23j-akaLsw-4ioLGV0, reason: not valid java name */
        public static /* synthetic */ void m264$r8$lambda$pqvoHakFH23jakaLsw4ioLGV0(com.google.android.exoplayer2.ui.StyledPlayerControlView.AudioTrackSelectionAdapter r0, android.view.View r1) {
                r0.lambda$onBindViewHolderAtZeroPosition$0(r1)
                return
        }

        private AudioTrackSelectionAdapter(com.google.android.exoplayer2.ui.StyledPlayerControlView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        public /* synthetic */ AudioTrackSelectionAdapter(com.google.android.exoplayer2.ui.StyledPlayerControlView r1, com.google.android.exoplayer2.ui.StyledPlayerControlView.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private boolean hasSelectionOverride(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r5) {
                r4 = this;
                r0 = 0
                r1 = 0
            L2:
                java.util.List<com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInformation> r2 = r4.tracks
                int r2 = r2.size()
                if (r1 >= r2) goto L25
                java.util.List<com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInformation> r2 = r4.tracks
                java.lang.Object r2 = r2.get(r1)
                com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInformation r2 = (com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation) r2
                com.google.android.exoplayer2.Tracks$Group r2 = r2.trackGroup
                com.google.android.exoplayer2.source.TrackGroup r2 = r2.getMediaTrackGroup()
                com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r3 = r5.overrides
                boolean r2 = r3.containsKey(r2)
                if (r2 == 0) goto L22
                r5 = 1
                return r5
            L22:
                int r1 = r1 + 1
                goto L2
            L25:
                return r0
        }

        private /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(android.view.View r4) {
                r3 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView r4 = r3.this$0
                com.google.android.exoplayer2.Player r4 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r4)
                if (r4 == 0) goto L60
                com.google.android.exoplayer2.ui.StyledPlayerControlView r4 = r3.this$0
                com.google.android.exoplayer2.Player r4 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r4)
                r0 = 29
                boolean r4 = r4.isCommandAvailable(r0)
                if (r4 != 0) goto L17
                goto L60
            L17:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r4 = r3.this$0
                com.google.android.exoplayer2.Player r4 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r4)
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters r4 = r4.getTrackSelectionParameters()
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r3.this$0
                com.google.android.exoplayer2.Player r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r0)
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.Player r0 = (com.google.android.exoplayer2.Player) r0
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r4 = r4.buildUpon()
                r1 = 1
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r4 = r4.clearOverridesOfType(r1)
                r2 = 0
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r4 = r4.setTrackTypeDisabled(r1, r2)
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters r4 = r4.build()
                r0.setTrackSelectionParameters(r4)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r4 = r3.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingsAdapter r4 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$2900(r4)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r3.this$0
                android.content.res.Resources r0 = r0.getResources()
                int r2 = com.google.android.exoplayer2.ui.R.string.exo_track_selection_auto
                java.lang.String r0 = r0.getString(r2)
                r4.setSubTextAtPosition(r1, r0)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r4 = r3.this$0
                android.widget.PopupWindow r4 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$4200(r4)
                r4.dismiss()
            L60:
                return
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void init(java.util.List<com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation> r5) {
                r4 = this;
                r4.tracks = r5
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r4.this$0
                com.google.android.exoplayer2.Player r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r0)
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                com.google.android.exoplayer2.Player r0 = (com.google.android.exoplayer2.Player) r0
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0 = r0.getTrackSelectionParameters()
                boolean r1 = r5.isEmpty()
                r2 = 1
                if (r1 == 0) goto L2f
                com.google.android.exoplayer2.ui.StyledPlayerControlView r5 = r4.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingsAdapter r5 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$2900(r5)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r4.this$0
                android.content.res.Resources r0 = r0.getResources()
                int r1 = com.google.android.exoplayer2.ui.R.string.exo_track_selection_none
                java.lang.String r0 = r0.getString(r1)
                r5.setSubTextAtPosition(r2, r0)
                goto L6d
            L2f:
                boolean r0 = r4.hasSelectionOverride(r0)
                if (r0 != 0) goto L4b
                com.google.android.exoplayer2.ui.StyledPlayerControlView r5 = r4.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingsAdapter r5 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$2900(r5)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r4.this$0
                android.content.res.Resources r0 = r0.getResources()
                int r1 = com.google.android.exoplayer2.ui.R.string.exo_track_selection_auto
                java.lang.String r0 = r0.getString(r1)
                r5.setSubTextAtPosition(r2, r0)
                goto L6d
            L4b:
                r0 = 0
            L4c:
                int r1 = r5.size()
                if (r0 >= r1) goto L6d
                java.lang.Object r1 = r5.get(r0)
                com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInformation r1 = (com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation) r1
                boolean r3 = r1.isSelected()
                if (r3 == 0) goto L6a
                com.google.android.exoplayer2.ui.StyledPlayerControlView r5 = r4.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingsAdapter r5 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$2900(r5)
                java.lang.String r0 = r1.trackName
                r5.setSubTextAtPosition(r2, r0)
                goto L6d
            L6a:
                int r0 = r0 + 1
                goto L4c
            L6d:
                return
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder r3) {
                r2 = this;
                android.widget.TextView r0 = r3.textView
                int r1 = com.google.android.exoplayer2.ui.R.string.exo_track_selection_auto
                r0.setText(r1)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.this$0
                com.google.android.exoplayer2.Player r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r0)
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                com.google.android.exoplayer2.Player r0 = (com.google.android.exoplayer2.Player) r0
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0 = r0.getTrackSelectionParameters()
                boolean r0 = r2.hasSelectionOverride(r0)
                android.view.View r1 = r3.checkView
                if (r0 == 0) goto L21
                r0 = 4
                goto L22
            L21:
                r0 = 0
            L22:
                r1.setVisibility(r0)
                android.view.View r3 = r3.itemView
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingViewHolder$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingViewHolder$$ExternalSyntheticLambda0
                r1 = 1
                r0.<init>(r2, r1)
                r3.setOnClickListener(r0)
                return
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(java.lang.String r3) {
                r2 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingsAdapter r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$2900(r0)
                r1 = 1
                r0.setSubTextAtPosition(r1, r3)
                return
        }
    }

    public final class ComponentListener implements com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.ui.TimeBar.OnScrubListener, android.view.View.OnClickListener, android.widget.PopupWindow.OnDismissListener {
        public final /* synthetic */ com.google.android.exoplayer2.ui.StyledPlayerControlView this$0;

        private ComponentListener(com.google.android.exoplayer2.ui.StyledPlayerControlView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ ComponentListener(com.google.android.exoplayer2.ui.StyledPlayerControlView r1, com.google.android.exoplayer2.ui.StyledPlayerControlView.AnonymousClass1 r2) {
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
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.this$0
                com.google.android.exoplayer2.Player r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r0)
                if (r0 != 0) goto L9
                return
            L9:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1500(r1)
                r1.resetHideCallbacks()
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                android.view.View r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1900(r1)
                if (r1 != r3) goto L27
                r3 = 9
                boolean r3 = r0.isCommandAvailable(r3)
                if (r3 == 0) goto L13c
                r0.seekToNext()
                goto L13c
            L27:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                android.view.View r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$2000(r1)
                if (r1 != r3) goto L3b
                r3 = 7
                boolean r3 = r0.isCommandAvailable(r3)
                if (r3 == 0) goto L13c
                r0.seekToPrevious()
                goto L13c
            L3b:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                android.view.View r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$2100(r1)
                if (r1 != r3) goto L57
                int r3 = r0.getPlaybackState()
                r1 = 4
                if (r3 == r1) goto L13c
                r3 = 12
                boolean r3 = r0.isCommandAvailable(r3)
                if (r3 == 0) goto L13c
                r0.seekForward()
                goto L13c
            L57:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                android.view.View r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$2200(r1)
                if (r1 != r3) goto L6c
                r3 = 11
                boolean r3 = r0.isCommandAvailable(r3)
                if (r3 == 0) goto L13c
                r0.seekBack()
                goto L13c
            L6c:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                android.view.View r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$2300(r1)
                if (r1 != r3) goto L7b
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$2400(r3, r0)
                goto L13c
            L7b:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                android.widget.ImageView r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$2500(r1)
                if (r1 != r3) goto L9e
                r3 = 15
                boolean r3 = r0.isCommandAvailable(r3)
                if (r3 == 0) goto L13c
                int r3 = r0.getRepeatMode()
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                int r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$2600(r1)
                int r3 = com.google.android.exoplayer2.util.RepeatModeUtil.getNextRepeatMode(r3, r1)
                r0.setRepeatMode(r3)
                goto L13c
            L9e:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                android.widget.ImageView r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$2700(r1)
                if (r1 != r3) goto Lb9
                r3 = 14
                boolean r3 = r0.isCommandAvailable(r3)
                if (r3 == 0) goto L13c
                boolean r3 = r0.getShuffleModeEnabled()
                r3 = r3 ^ 1
                r0.setShuffleModeEnabled(r3)
                goto L13c
            Lb9:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.this$0
                android.view.View r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$2800(r0)
                if (r0 != r3) goto Lda
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r3 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1500(r3)
                r3.removeHideCallbacks()
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingsAdapter r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$2900(r3)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                android.view.View r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$2800(r1)
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$3000(r3, r0, r1)
                goto L13c
            Lda:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.this$0
                android.view.View r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$3100(r0)
                if (r0 != r3) goto Lfb
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r3 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1500(r3)
                r3.removeHideCallbacks()
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView$PlaybackSpeedAdapter r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$3200(r3)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                android.view.View r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$3100(r1)
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$3000(r3, r0, r1)
                goto L13c
            Lfb:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.this$0
                android.view.View r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$3300(r0)
                if (r0 != r3) goto L11c
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r3 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1500(r3)
                r3.removeHideCallbacks()
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView$AudioTrackSelectionAdapter r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$3400(r3)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                android.view.View r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$3300(r1)
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$3000(r3, r0, r1)
                goto L13c
            L11c:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.this$0
                android.widget.ImageView r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$3500(r0)
                if (r0 != r3) goto L13c
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r3 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1500(r3)
                r3.removeHideCallbacks()
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView$TextTrackSelectionAdapter r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$3600(r3)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                android.widget.ImageView r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$3500(r1)
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$3000(r3, r0, r1)
            L13c:
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

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
                r1 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r1.this$0
                boolean r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1800(r0)
                if (r0 == 0) goto L11
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r1.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1500(r0)
                r0.resetHideCallbacks()
            L11:
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onEvents(com.google.android.exoplayer2.Player r3, com.google.android.exoplayer2.Player.Events r4) {
                r2 = this;
                r3 = 3
                int[] r0 = new int[r3]
                r0 = {x0086: FILL_ARRAY_DATA , data: [4, 5, 13} // fill-array
                boolean r0 = r4.containsAny(r0)
                if (r0 == 0) goto L11
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$300(r0)
            L11:
                r0 = 4
                int[] r0 = new int[r0]
                r0 = {x0090: FILL_ARRAY_DATA , data: [4, 5, 7, 13} // fill-array
                boolean r0 = r4.containsAny(r0)
                if (r0 == 0) goto L22
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$400(r0)
            L22:
                r0 = 2
                int[] r1 = new int[r0]
                r1 = {x009c: FILL_ARRAY_DATA , data: [8, 13} // fill-array
                boolean r1 = r4.containsAny(r1)
                if (r1 == 0) goto L33
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$500(r1)
            L33:
                int[] r1 = new int[r0]
                r1 = {x00a4: FILL_ARRAY_DATA , data: [9, 13} // fill-array
                boolean r1 = r4.containsAny(r1)
                if (r1 == 0) goto L43
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$600(r1)
            L43:
                r1 = 7
                int[] r1 = new int[r1]
                r1 = {x00ac: FILL_ARRAY_DATA , data: [8, 9, 11, 0, 16, 17, 13} // fill-array
                boolean r1 = r4.containsAny(r1)
                if (r1 == 0) goto L54
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$700(r1)
            L54:
                int[] r3 = new int[r3]
                r3 = {x00be: FILL_ARRAY_DATA , data: [11, 0, 13} // fill-array
                boolean r3 = r4.containsAny(r3)
                if (r3 == 0) goto L64
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$800(r3)
            L64:
                int[] r3 = new int[r0]
                r3 = {x00c8: FILL_ARRAY_DATA , data: [12, 13} // fill-array
                boolean r3 = r4.containsAny(r3)
                if (r3 == 0) goto L74
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$900(r3)
            L74:
                int[] r3 = new int[r0]
                r3 = {x00d0: FILL_ARRAY_DATA , data: [2, 13} // fill-array
                boolean r3 = r4.containsAny(r3)
                if (r3 == 0) goto L84
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1000(r3)
            L84:
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
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                android.widget.TextView r3 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1200(r3)
                if (r3 == 0) goto L21
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                android.widget.TextView r3 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1200(r3)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.this$0
                java.lang.StringBuilder r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1300(r0)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                java.util.Formatter r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1400(r1)
                java.lang.String r4 = com.google.android.exoplayer2.util.Util.getStringForTime(r0, r1, r4)
                r3.setText(r4)
            L21:
                return
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStart(com.google.android.exoplayer2.ui.TimeBar r3, long r4) {
                r2 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                r0 = 1
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1102(r3, r0)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                android.widget.TextView r3 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1200(r3)
                if (r3 == 0) goto L27
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                android.widget.TextView r3 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1200(r3)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.this$0
                java.lang.StringBuilder r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1300(r0)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r2.this$0
                java.util.Formatter r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1400(r1)
                java.lang.String r4 = com.google.android.exoplayer2.util.Util.getStringForTime(r0, r1, r4)
                r3.setText(r4)
            L27:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r3 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1500(r3)
                r3.removeHideCallbacks()
                return
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStop(com.google.android.exoplayer2.ui.TimeBar r2, long r3, boolean r5) {
                r1 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView r2 = r1.this$0
                r0 = 0
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1102(r2, r0)
                if (r5 != 0) goto L19
                com.google.android.exoplayer2.ui.StyledPlayerControlView r2 = r1.this$0
                com.google.android.exoplayer2.Player r2 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r2)
                if (r2 == 0) goto L19
                com.google.android.exoplayer2.ui.StyledPlayerControlView r2 = r1.this$0
                com.google.android.exoplayer2.Player r5 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r2)
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1700(r2, r5, r3)
            L19:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r2 = r1.this$0
                com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r2 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1500(r2)
                r2.resetHideCallbacks()
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

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.Deprecated
    public interface OnFullScreenModeChangedListener {
        void onFullScreenModeChanged(boolean r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class PlaybackSpeedAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder> {
        private final java.lang.String[] playbackSpeedTexts;
        private final float[] playbackSpeeds;
        private int selectedIndex;
        public final /* synthetic */ com.google.android.exoplayer2.ui.StyledPlayerControlView this$0;

        /* JADX INFO: renamed from: $r8$lambda$-Vx7I-r8cNKyI4OIc6ntkPbOXYA, reason: not valid java name */
        public static /* synthetic */ void m265$r8$lambda$Vx7Ir8cNKyI4OIc6ntkPbOXYA(com.google.android.exoplayer2.ui.StyledPlayerControlView.PlaybackSpeedAdapter r0, int r1, android.view.View r2) {
                r0.lambda$onBindViewHolder$0(r1, r2)
                return
        }

        public PlaybackSpeedAdapter(com.google.android.exoplayer2.ui.StyledPlayerControlView r1, java.lang.String[] r2, float[] r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.playbackSpeedTexts = r2
                r0.playbackSpeeds = r3
                return
        }

        private /* synthetic */ void lambda$onBindViewHolder$0(int r2, android.view.View r3) {
                r1 = this;
                int r3 = r1.selectedIndex
                if (r2 == r3) goto Ld
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r1.this$0
                float[] r0 = r1.playbackSpeeds
                r2 = r0[r2]
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$4100(r3, r2)
            Ld:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r2 = r1.this$0
                android.widget.PopupWindow r2 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$4200(r2)
                r2.dismiss()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
                r1 = this;
                java.lang.String[] r0 = r1.playbackSpeedTexts
                int r0 = r0.length
                return r0
        }

        public java.lang.String getSelectedText() {
                r2 = this;
                java.lang.String[] r0 = r2.playbackSpeedTexts
                int r1 = r2.selectedIndex
                r0 = r0[r1]
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SubSettingViewHolder r1 = (com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder) r1
                r0.onBindViewHolder(r1, r2)
                return
        }

        public void onBindViewHolder(com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder r4, int r5) {
                r3 = this;
                java.lang.String[] r0 = r3.playbackSpeedTexts
                int r1 = r0.length
                if (r5 >= r1) goto Lc
                android.widget.TextView r1 = r4.textView
                r0 = r0[r5]
                r1.setText(r0)
            Lc:
                int r0 = r3.selectedIndex
                r1 = 0
                if (r5 != r0) goto L1d
                android.view.View r0 = r4.itemView
                r2 = 1
                r0.setSelected(r2)
                android.view.View r0 = r4.checkView
                r0.setVisibility(r1)
                goto L28
            L1d:
                android.view.View r0 = r4.itemView
                r0.setSelected(r1)
                android.view.View r0 = r4.checkView
                r1 = 4
                r0.setVisibility(r1)
            L28:
                android.view.View r4 = r4.itemView
                com.google.android.exoplayer2.ui.StyledPlayerControlView$PlaybackSpeedAdapter$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$PlaybackSpeedAdapter$$ExternalSyntheticLambda0
                r0.<init>(r3, r5)
                r4.setOnClickListener(r0)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SubSettingViewHolder r1 = r0.onCreateViewHolder(r1, r2)
                return r1
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder onCreateViewHolder(android.view.ViewGroup r3, int r4) {
                r2 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView r4 = r2.this$0
                android.content.Context r4 = r4.getContext()
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                int r0 = com.google.android.exoplayer2.ui.R.layout.exo_styled_sub_settings_list_item
                r1 = 0
                android.view.View r3 = r4.inflate(r0, r3, r1)
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SubSettingViewHolder r4 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$SubSettingViewHolder
                r4.<init>(r3)
                return r4
        }

        public void updateSelectedIndex(float r6) {
                r5 = this;
                r0 = 0
                r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
                r1 = 0
                r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            L8:
                float[] r3 = r5.playbackSpeeds
                int r4 = r3.length
                if (r0 >= r4) goto L1e
                r3 = r3[r0]
                float r3 = r6 - r3
                float r3 = java.lang.Math.abs(r3)
                int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r4 >= 0) goto L1b
                r1 = r0
                r2 = r3
            L1b:
                int r0 = r0 + 1
                goto L8
            L1e:
                r5.selectedIndex = r1
                return
        }
    }

    public interface ProgressUpdateListener {
        void onProgressUpdate(long r1, long r3);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class SettingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView iconView;
        private final android.widget.TextView mainTextView;
        private final android.widget.TextView subTextView;
        public final /* synthetic */ com.google.android.exoplayer2.ui.StyledPlayerControlView this$0;

        /* JADX INFO: renamed from: $r8$lambda$ADkzLrF5UC-EMDSG997fZB1ITB0, reason: not valid java name */
        public static /* synthetic */ void m266$r8$lambda$ADkzLrF5UCEMDSG997fZB1ITB0(com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder r0, android.view.View r1) {
                r0.lambda$new$0(r1)
                return
        }

        public SettingViewHolder(com.google.android.exoplayer2.ui.StyledPlayerControlView r2, android.view.View r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>(r3)
                int r2 = com.google.android.exoplayer2.util.Util.SDK_INT
                r0 = 26
                if (r2 >= r0) goto Lf
                r2 = 1
                r3.setFocusable(r2)
            Lf:
                int r2 = com.google.android.exoplayer2.ui.R.id.exo_main_text
                android.view.View r2 = r3.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r1.mainTextView = r2
                int r2 = com.google.android.exoplayer2.ui.R.id.exo_sub_text
                android.view.View r2 = r3.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r1.subTextView = r2
                int r2 = com.google.android.exoplayer2.ui.R.id.exo_icon
                android.view.View r2 = r3.findViewById(r2)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r1.iconView = r2
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingViewHolder$$ExternalSyntheticLambda0 r2 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingViewHolder$$ExternalSyntheticLambda0
                r0 = 0
                r2.<init>(r1, r0)
                r3.setOnClickListener(r2)
                return
        }

        public static /* synthetic */ android.widget.TextView access$3700(com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder r0) {
                android.widget.TextView r0 = r0.mainTextView
                return r0
        }

        public static /* synthetic */ android.widget.TextView access$3800(com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder r0) {
                android.widget.TextView r0 = r0.subTextView
                return r0
        }

        public static /* synthetic */ android.widget.ImageView access$3900(com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder r0) {
                android.widget.ImageView r0 = r0.iconView
                return r0
        }

        private /* synthetic */ void lambda$new$0(android.view.View r2) {
                r1 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView r2 = r1.this$0
                int r0 = r1.getAdapterPosition()
                com.google.android.exoplayer2.ui.StyledPlayerControlView.access$4000(r2, r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SettingsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder> {
        private final android.graphics.drawable.Drawable[] iconIds;
        private final java.lang.String[] mainTexts;
        private final java.lang.String[] subTexts;
        public final /* synthetic */ com.google.android.exoplayer2.ui.StyledPlayerControlView this$0;

        public SettingsAdapter(com.google.android.exoplayer2.ui.StyledPlayerControlView r1, java.lang.String[] r2, android.graphics.drawable.Drawable[] r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mainTexts = r2
                int r1 = r2.length
                java.lang.String[] r1 = new java.lang.String[r1]
                r0.subTexts = r1
                r0.iconIds = r3
                return
        }

        private boolean shouldShowSetting(int r4) {
                r3 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r3.this$0
                com.google.android.exoplayer2.Player r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r0)
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                if (r4 == 0) goto L2e
                r0 = 1
                if (r4 == r0) goto L10
                return r0
            L10:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r4 = r3.this$0
                com.google.android.exoplayer2.Player r4 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r4)
                r2 = 30
                boolean r4 = r4.isCommandAvailable(r2)
                if (r4 == 0) goto L2d
                com.google.android.exoplayer2.ui.StyledPlayerControlView r4 = r3.this$0
                com.google.android.exoplayer2.Player r4 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r4)
                r2 = 29
                boolean r4 = r4.isCommandAvailable(r2)
                if (r4 == 0) goto L2d
                r1 = 1
            L2d:
                return r1
            L2e:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r4 = r3.this$0
                com.google.android.exoplayer2.Player r4 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r4)
                r0 = 13
                boolean r4 = r4.isCommandAvailable(r0)
                return r4
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
                r1 = this;
                java.lang.String[] r0 = r1.mainTexts
                int r0 = r0.length
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        public boolean hasSettingsToShow() {
                r3 = this;
                r0 = 1
                boolean r1 = r3.shouldShowSetting(r0)
                r2 = 0
                if (r1 != 0) goto L10
                boolean r1 = r3.shouldShowSetting(r2)
                if (r1 == 0) goto Lf
                goto L10
            Lf:
                r0 = 0
            L10:
                return r0
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingViewHolder r1 = (com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder) r1
                r0.onBindViewHolder(r1, r2)
                return
        }

        public void onBindViewHolder(com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder r5, int r6) {
                r4 = this;
                boolean r0 = r4.shouldShowSetting(r6)
                if (r0 == 0) goto L13
                android.view.View r0 = r5.itemView
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
                r2 = -1
                r3 = -2
                r1.<init>(r2, r3)
                r0.setLayoutParams(r1)
                goto L1e
            L13:
                android.view.View r0 = r5.itemView
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
                r2 = 0
                r1.<init>(r2, r2)
                r0.setLayoutParams(r1)
            L1e:
                android.widget.TextView r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder.access$3700(r5)
                java.lang.String[] r1 = r4.mainTexts
                r1 = r1[r6]
                r0.setText(r1)
                java.lang.String[] r0 = r4.subTexts
                r0 = r0[r6]
                r1 = 8
                if (r0 != 0) goto L39
                android.widget.TextView r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder.access$3800(r5)
                r0.setVisibility(r1)
                goto L44
            L39:
                android.widget.TextView r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder.access$3800(r5)
                java.lang.String[] r2 = r4.subTexts
                r2 = r2[r6]
                r0.setText(r2)
            L44:
                android.graphics.drawable.Drawable[] r0 = r4.iconIds
                r0 = r0[r6]
                if (r0 != 0) goto L52
                android.widget.ImageView r5 = com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder.access$3900(r5)
                r5.setVisibility(r1)
                goto L5d
            L52:
                android.widget.ImageView r5 = com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder.access$3900(r5)
                android.graphics.drawable.Drawable[] r0 = r4.iconIds
                r6 = r0[r6]
                r5.setImageDrawable(r6)
            L5d:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingViewHolder r1 = r0.onCreateViewHolder(r1, r2)
                return r1
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder onCreateViewHolder(android.view.ViewGroup r3, int r4) {
                r2 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView r4 = r2.this$0
                android.content.Context r4 = r4.getContext()
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                int r0 = com.google.android.exoplayer2.ui.R.layout.exo_styled_settings_list_item
                r1 = 0
                android.view.View r3 = r4.inflate(r0, r3, r1)
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingViewHolder r4 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingViewHolder
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.this$0
                r4.<init>(r0, r3)
                return r4
        }

        public void setSubTextAtPosition(int r2, java.lang.String r3) {
                r1 = this;
                java.lang.String[] r0 = r1.subTexts
                r0[r2] = r3
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class SubSettingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public final android.view.View checkView;
        public final android.widget.TextView textView;

        public SubSettingViewHolder(android.view.View r3) {
                r2 = this;
                r2.<init>(r3)
                int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
                r1 = 26
                if (r0 >= r1) goto Ld
                r0 = 1
                r3.setFocusable(r0)
            Ld:
                int r0 = com.google.android.exoplayer2.ui.R.id.exo_text
                android.view.View r0 = r3.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r2.textView = r0
                int r0 = com.google.android.exoplayer2.ui.R.id.exo_check
                android.view.View r3 = r3.findViewById(r0)
                r2.checkView = r3
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class TextTrackSelectionAdapter extends com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter {
        public final /* synthetic */ com.google.android.exoplayer2.ui.StyledPlayerControlView this$0;

        public static /* synthetic */ void $r8$lambda$uMwX70AwZEMrSXo0fgYYbjR5mGs(com.google.android.exoplayer2.ui.StyledPlayerControlView.TextTrackSelectionAdapter r0, android.view.View r1) {
                r0.lambda$onBindViewHolderAtZeroPosition$0(r1)
                return
        }

        private TextTrackSelectionAdapter(com.google.android.exoplayer2.ui.StyledPlayerControlView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        public /* synthetic */ TextTrackSelectionAdapter(com.google.android.exoplayer2.ui.StyledPlayerControlView r1, com.google.android.exoplayer2.ui.StyledPlayerControlView.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(android.view.View r3) {
                r2 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.Player r3 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r3)
                if (r3 == 0) goto L44
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.Player r3 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r3)
                r0 = 29
                boolean r3 = r3.isCommandAvailable(r0)
                if (r3 == 0) goto L44
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                com.google.android.exoplayer2.Player r3 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r3)
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters r3 = r3.getTrackSelectionParameters()
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r2.this$0
                com.google.android.exoplayer2.Player r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r0)
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r3 = r3.buildUpon()
                r1 = 3
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r3 = r3.clearOverridesOfType(r1)
                r1 = -3
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r3 = r3.setIgnoredTextSelectionFlags(r1)
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters r3 = r3.build()
                r0.setTrackSelectionParameters(r3)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                android.widget.PopupWindow r3 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$4200(r3)
                r3.dismiss()
            L44:
                return
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void init(java.util.List<com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation> r4) {
                r3 = this;
                r0 = 0
                r1 = 0
            L2:
                int r2 = r4.size()
                if (r1 >= r2) goto L19
                java.lang.Object r2 = r4.get(r1)
                com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInformation r2 = (com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation) r2
                boolean r2 = r2.isSelected()
                if (r2 == 0) goto L16
                r0 = 1
                goto L19
            L16:
                int r1 = r1 + 1
                goto L2
            L19:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r3.this$0
                android.widget.ImageView r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$3500(r1)
                if (r1 == 0) goto L4f
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r3.this$0
                android.widget.ImageView r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$3500(r1)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r2 = r3.this$0
                if (r0 == 0) goto L30
                android.graphics.drawable.Drawable r2 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$4300(r2)
                goto L34
            L30:
                android.graphics.drawable.Drawable r2 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$4400(r2)
            L34:
                r1.setImageDrawable(r2)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r1 = r3.this$0
                android.widget.ImageView r1 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$3500(r1)
                if (r0 == 0) goto L46
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r3.this$0
                java.lang.String r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$4500(r0)
                goto L4c
            L46:
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r3.this$0
                java.lang.String r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$4600(r0)
            L4c:
                r1.setContentDescription(r0)
            L4f:
                r3.tracks = r4
                return
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SubSettingViewHolder r1 = (com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder) r1
                r0.onBindViewHolder(r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onBindViewHolder(com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder r2, int r3) {
                r1 = this;
                super.onBindViewHolder(r2, r3)
                if (r3 <= 0) goto L1d
                java.util.List<com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInformation> r0 = r1.tracks
                int r3 = r3 + (-1)
                java.lang.Object r3 = r0.get(r3)
                com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInformation r3 = (com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation) r3
                android.view.View r2 = r2.checkView
                boolean r3 = r3.isSelected()
                if (r3 == 0) goto L19
                r3 = 0
                goto L1a
            L19:
                r3 = 4
            L1a:
                r2.setVisibility(r3)
            L1d:
                return
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder r4) {
                r3 = this;
                android.widget.TextView r0 = r4.textView
                int r1 = com.google.android.exoplayer2.ui.R.string.exo_track_selection_none
                r0.setText(r1)
                r0 = 0
                r1 = 0
            L9:
                java.util.List<com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInformation> r2 = r3.tracks
                int r2 = r2.size()
                if (r1 >= r2) goto L24
                java.util.List<com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInformation> r2 = r3.tracks
                java.lang.Object r2 = r2.get(r1)
                com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInformation r2 = (com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation) r2
                boolean r2 = r2.isSelected()
                if (r2 == 0) goto L21
                r1 = 0
                goto L25
            L21:
                int r1 = r1 + 1
                goto L9
            L24:
                r1 = 1
            L25:
                android.view.View r2 = r4.checkView
                if (r1 == 0) goto L2a
                goto L2b
            L2a:
                r0 = 4
            L2b:
                r2.setVisibility(r0)
                android.view.View r4 = r4.itemView
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingViewHolder$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingViewHolder$$ExternalSyntheticLambda0
                r1 = 2
                r0.<init>(r3, r1)
                r4.setOnClickListener(r0)
                return
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(java.lang.String r1) {
                r0 = this;
                return
        }
    }

    public static final class TrackInformation {
        public final com.google.android.exoplayer2.Tracks.Group trackGroup;
        public final int trackIndex;
        public final java.lang.String trackName;

        public TrackInformation(com.google.android.exoplayer2.Tracks r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                com.google.common.collect.ImmutableList r1 = r1.getGroups()
                java.lang.Object r1 = r1.get(r2)
                com.google.android.exoplayer2.Tracks$Group r1 = (com.google.android.exoplayer2.Tracks.Group) r1
                r0.trackGroup = r1
                r0.trackIndex = r3
                r0.trackName = r4
                return
        }

        public boolean isSelected() {
                r2 = this;
                com.google.android.exoplayer2.Tracks$Group r0 = r2.trackGroup
                int r1 = r2.trackIndex
                boolean r0 = r0.isTrackSelected(r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public abstract class TrackSelectionAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder> {
        public final /* synthetic */ com.google.android.exoplayer2.ui.StyledPlayerControlView this$0;
        public java.util.List<com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation> tracks;

        public static /* synthetic */ void $r8$lambda$N6e8lmwjlhz7bBugfEK7h2ZIuLU(com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter r0, com.google.android.exoplayer2.Player r1, com.google.android.exoplayer2.source.TrackGroup r2, com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation r3, android.view.View r4) {
                r0.lambda$onBindViewHolder$0(r1, r2, r3, r4)
                return
        }

        public TrackSelectionAdapter(com.google.android.exoplayer2.ui.StyledPlayerControlView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.tracks = r1
                return
        }

        private /* synthetic */ void lambda$onBindViewHolder$0(com.google.android.exoplayer2.Player r3, com.google.android.exoplayer2.source.TrackGroup r4, com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation r5, android.view.View r6) {
                r2 = this;
                r6 = 29
                boolean r6 = r3.isCommandAvailable(r6)
                if (r6 != 0) goto L9
                return
            L9:
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters r6 = r3.getTrackSelectionParameters()
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r6 = r6.buildUpon()
                com.google.android.exoplayer2.trackselection.TrackSelectionOverride r0 = new com.google.android.exoplayer2.trackselection.TrackSelectionOverride
                int r1 = r5.trackIndex
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r1)
                r0.<init>(r4, r1)
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r4 = r6.setOverrideForType(r0)
                com.google.android.exoplayer2.Tracks$Group r6 = r5.trackGroup
                int r6 = r6.getType()
                r0 = 0
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r4 = r4.setTrackTypeDisabled(r6, r0)
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters r4 = r4.build()
                r3.setTrackSelectionParameters(r4)
                java.lang.String r3 = r5.trackName
                r2.onTrackSelection(r3)
                com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r2.this$0
                android.widget.PopupWindow r3 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$4200(r3)
                r3.dismiss()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
                r1 = this;
                java.util.List<com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInformation> r0 = r1.tracks
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto La
                r0 = 0
                goto L12
            La:
                java.util.List<com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInformation> r0 = r1.tracks
                int r0 = r0.size()
                int r0 = r0 + 1
            L12:
                return r0
        }

        public abstract void init(java.util.List<com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation> r1);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SubSettingViewHolder r1 = (com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder) r1
                r0.onBindViewHolder(r1, r2)
                return
        }

        public void onBindViewHolder(com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder r7, int r8) {
                r6 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = r6.this$0
                com.google.android.exoplayer2.Player r0 = com.google.android.exoplayer2.ui.StyledPlayerControlView.access$1600(r0)
                if (r0 != 0) goto L9
                return
            L9:
                if (r8 != 0) goto Lf
                r6.onBindViewHolderAtZeroPosition(r7)
                goto L4e
            Lf:
                java.util.List<com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInformation> r1 = r6.tracks
                r2 = 1
                int r8 = r8 - r2
                java.lang.Object r8 = r1.get(r8)
                com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInformation r8 = (com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation) r8
                com.google.android.exoplayer2.Tracks$Group r1 = r8.trackGroup
                com.google.android.exoplayer2.source.TrackGroup r1 = r1.getMediaTrackGroup()
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters r3 = r0.getTrackSelectionParameters()
                com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r3 = r3.overrides
                java.lang.Object r3 = r3.get(r1)
                r4 = 0
                if (r3 == 0) goto L33
                boolean r3 = r8.isSelected()
                if (r3 == 0) goto L33
                goto L34
            L33:
                r2 = 0
            L34:
                android.widget.TextView r3 = r7.textView
                java.lang.String r5 = r8.trackName
                r3.setText(r5)
                android.view.View r3 = r7.checkView
                if (r2 == 0) goto L40
                goto L41
            L40:
                r4 = 4
            L41:
                r3.setVisibility(r4)
                android.view.View r7 = r7.itemView
                com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackSelectionAdapter$$ExternalSyntheticLambda0 r2 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackSelectionAdapter$$ExternalSyntheticLambda0
                r2.<init>(r6, r0, r1, r8)
                r7.setOnClickListener(r2)
            L4e:
                return
        }

        public abstract void onBindViewHolderAtZeroPosition(com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder r1);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SubSettingViewHolder r1 = r0.onCreateViewHolder(r1, r2)
                return r1
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder onCreateViewHolder(android.view.ViewGroup r3, int r4) {
                r2 = this;
                com.google.android.exoplayer2.ui.StyledPlayerControlView r4 = r2.this$0
                android.content.Context r4 = r4.getContext()
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                int r0 = com.google.android.exoplayer2.ui.R.layout.exo_styled_sub_settings_list_item
                r1 = 0
                android.view.View r3 = r4.inflate(r0, r3, r1)
                com.google.android.exoplayer2.ui.StyledPlayerControlView$SubSettingViewHolder r4 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$SubSettingViewHolder
                r4.<init>(r3)
                return r4
        }

        public abstract void onTrackSelection(java.lang.String r1);
    }

    @java.lang.Deprecated
    public interface VisibilityListener {
        void onVisibilityChange(int r1);
    }

    public static /* synthetic */ void $r8$lambda$VIUC90akgliKObyZnsLjDCSGVvY(com.google.android.exoplayer2.ui.StyledPlayerControlView r0, android.view.View r1) {
            r0.onFullScreenButtonClicked(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$dsDS5OYIroORhxkiiMev-op7GuU, reason: not valid java name */
    public static /* synthetic */ void m263$r8$lambda$dsDS5OYIroORhxkiiMevop7GuU(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            r0.updateProgress()
            return
    }

    public static /* synthetic */ void $r8$lambda$yF0wxNFGTOK6vMLq5xLUexTMVVQ(com.google.android.exoplayer2.ui.StyledPlayerControlView r0, android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.onLayoutChange(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    static {
            java.lang.String r0 = "goog.exo.ui"
            com.google.android.exoplayer2.ExoPlayerLibraryInfo.registerModule(r0)
            r0 = 7
            float[] r0 = new float[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [1048576000, 1056964608, 1061158912, 1065353216, 1067450368, 1069547520, 1073741824} // fill-array
            com.google.android.exoplayer2.ui.StyledPlayerControlView.PLAYBACK_SPEEDS = r0
            return
    }

    public StyledPlayerControlView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public StyledPlayerControlView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public StyledPlayerControlView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3, r2)
            return
    }

    public StyledPlayerControlView(android.content.Context r24, @androidx.annotation.Nullable android.util.AttributeSet r25, int r26, @androidx.annotation.Nullable android.util.AttributeSet r27) {
            r23 = this;
            r1 = r23
            r0 = r24
            r6 = r27
            r23.<init>(r24, r25, r26)
            int r2 = com.google.android.exoplayer2.ui.R.layout.exo_styled_player_control_view
            r3 = 5000(0x1388, float:7.006E-42)
            r1.showTimeoutMs = r3
            r8 = 0
            r1.repeatToggleModes = r8
            r3 = 200(0xc8, float:2.8E-43)
            r1.timeBarMinUpdateIntervalMs = r3
            r9 = 1
            if (r6 == 0) goto L8c
            android.content.res.Resources$Theme r3 = r24.getTheme()
            int[] r4 = com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView
            r5 = r26
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r6, r4, r5, r8)
            int r4 = com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_controller_layout_id     // Catch: java.lang.Throwable -> L87
            int r2 = r3.getResourceId(r4, r2)     // Catch: java.lang.Throwable -> L87
            int r4 = com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_show_timeout     // Catch: java.lang.Throwable -> L87
            int r5 = r1.showTimeoutMs     // Catch: java.lang.Throwable -> L87
            int r4 = r3.getInt(r4, r5)     // Catch: java.lang.Throwable -> L87
            r1.showTimeoutMs = r4     // Catch: java.lang.Throwable -> L87
            int r4 = r1.repeatToggleModes     // Catch: java.lang.Throwable -> L87
            int r4 = getRepeatToggleModes(r3, r4)     // Catch: java.lang.Throwable -> L87
            r1.repeatToggleModes = r4     // Catch: java.lang.Throwable -> L87
            int r4 = com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_show_rewind_button     // Catch: java.lang.Throwable -> L87
            boolean r4 = r3.getBoolean(r4, r9)     // Catch: java.lang.Throwable -> L87
            int r5 = com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_show_fastforward_button     // Catch: java.lang.Throwable -> L87
            boolean r5 = r3.getBoolean(r5, r9)     // Catch: java.lang.Throwable -> L87
            int r7 = com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_show_previous_button     // Catch: java.lang.Throwable -> L87
            boolean r7 = r3.getBoolean(r7, r9)     // Catch: java.lang.Throwable -> L87
            int r10 = com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_show_next_button     // Catch: java.lang.Throwable -> L87
            boolean r10 = r3.getBoolean(r10, r9)     // Catch: java.lang.Throwable -> L87
            int r11 = com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_show_shuffle_button     // Catch: java.lang.Throwable -> L87
            boolean r11 = r3.getBoolean(r11, r8)     // Catch: java.lang.Throwable -> L87
            int r12 = com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_show_subtitle_button     // Catch: java.lang.Throwable -> L87
            boolean r12 = r3.getBoolean(r12, r8)     // Catch: java.lang.Throwable -> L87
            int r13 = com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_show_vr_button     // Catch: java.lang.Throwable -> L87
            boolean r13 = r3.getBoolean(r13, r8)     // Catch: java.lang.Throwable -> L87
            int r14 = com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_time_bar_min_update_interval     // Catch: java.lang.Throwable -> L87
            int r15 = r1.timeBarMinUpdateIntervalMs     // Catch: java.lang.Throwable -> L87
            int r14 = r3.getInt(r14, r15)     // Catch: java.lang.Throwable -> L87
            r1.setTimeBarMinUpdateInterval(r14)     // Catch: java.lang.Throwable -> L87
            int r14 = com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_animation_enabled     // Catch: java.lang.Throwable -> L87
            boolean r14 = r3.getBoolean(r14, r9)     // Catch: java.lang.Throwable -> L87
            r3.recycle()
            r15 = r12
            r12 = r7
            r7 = r13
            r13 = r10
            r10 = r4
            r22 = r11
            r11 = r5
            r5 = r14
            r14 = r22
            goto L94
        L87:
            r0 = move-exception
            r3.recycle()
            throw r0
        L8c:
            r5 = 1
            r7 = 0
            r10 = 1
            r11 = 1
            r12 = 1
            r13 = 1
            r14 = 0
            r15 = 0
        L94:
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r24)
            r3.inflate(r2, r1)
            r2 = 262144(0x40000, float:3.67342E-40)
            r1.setDescendantFocusability(r2)
            com.google.android.exoplayer2.ui.StyledPlayerControlView$ComponentListener r4 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$ComponentListener
            r3 = 0
            r4.<init>(r1, r3)
            r1.componentListener = r4
            java.util.concurrent.CopyOnWriteArrayList r2 = new java.util.concurrent.CopyOnWriteArrayList
            r2.<init>()
            r1.visibilityListeners = r2
            com.google.android.exoplayer2.Timeline$Period r2 = new com.google.android.exoplayer2.Timeline$Period
            r2.<init>()
            r1.period = r2
            com.google.android.exoplayer2.Timeline$Window r2 = new com.google.android.exoplayer2.Timeline$Window
            r2.<init>()
            r1.window = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r1.formatBuilder = r2
            java.util.Formatter r3 = new java.util.Formatter
            java.util.Locale r9 = java.util.Locale.getDefault()
            r3.<init>(r2, r9)
            r1.formatter = r3
            long[] r2 = new long[r8]
            r1.adGroupTimesMs = r2
            boolean[] r2 = new boolean[r8]
            r1.playedAdGroups = r2
            long[] r2 = new long[r8]
            r1.extraAdGroupTimesMs = r2
            boolean[] r2 = new boolean[r8]
            r1.extraPlayedAdGroups = r2
            com.google.android.exoplayer2.ui.DefaultTimeBar$$ExternalSyntheticLambda1 r2 = new com.google.android.exoplayer2.ui.DefaultTimeBar$$ExternalSyntheticLambda1
            r3 = 1
            r2.<init>(r1, r3)
            r1.updateProgressAction = r2
            int r2 = com.google.android.exoplayer2.ui.R.id.exo_duration
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.durationView = r2
            int r2 = com.google.android.exoplayer2.ui.R.id.exo_position
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.positionView = r2
            int r2 = com.google.android.exoplayer2.ui.R.id.exo_subtitle
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.subtitleButton = r2
            if (r2 == 0) goto L10a
            r2.setOnClickListener(r4)
        L10a:
            int r2 = com.google.android.exoplayer2.ui.R.id.exo_fullscreen
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.fullScreenButton = r2
            com.google.android.exoplayer2.ui.StyledPlayerControlView$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$$ExternalSyntheticLambda0
            r3.<init>(r1, r8)
            initializeFullScreenButton(r2, r3)
            int r2 = com.google.android.exoplayer2.ui.R.id.exo_minimal_fullscreen
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.minimalFullScreenButton = r2
            com.google.android.exoplayer2.ui.StyledPlayerControlView$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$$ExternalSyntheticLambda0
            r9 = 1
            r3.<init>(r1, r9)
            initializeFullScreenButton(r2, r3)
            int r2 = com.google.android.exoplayer2.ui.R.id.exo_settings
            android.view.View r2 = r1.findViewById(r2)
            r1.settingsButton = r2
            if (r2 == 0) goto L13c
            r2.setOnClickListener(r4)
        L13c:
            int r2 = com.google.android.exoplayer2.ui.R.id.exo_playback_speed
            android.view.View r2 = r1.findViewById(r2)
            r1.playbackSpeedButton = r2
            if (r2 == 0) goto L149
            r2.setOnClickListener(r4)
        L149:
            int r2 = com.google.android.exoplayer2.ui.R.id.exo_audio_track
            android.view.View r2 = r1.findViewById(r2)
            r1.audioTrackButton = r2
            if (r2 == 0) goto L156
            r2.setOnClickListener(r4)
        L156:
            int r9 = com.google.android.exoplayer2.ui.R.id.exo_progress
            android.view.View r2 = r1.findViewById(r9)
            com.google.android.exoplayer2.ui.TimeBar r2 = (com.google.android.exoplayer2.ui.TimeBar) r2
            int r3 = com.google.android.exoplayer2.ui.R.id.exo_progress_placeholder
            android.view.View r3 = r1.findViewById(r3)
            if (r2 == 0) goto L170
            r1.timeBar = r2
            r19 = r4
            r20 = r5
            r21 = r7
            r8 = 0
            goto L1ba
        L170:
            if (r3 == 0) goto L1b1
            com.google.android.exoplayer2.ui.DefaultTimeBar r2 = new com.google.android.exoplayer2.ui.DefaultTimeBar
            r16 = 0
            r17 = 0
            int r18 = com.google.android.exoplayer2.ui.R.style.ExoStyledControls_TimeBar
            r26 = r2
            r25 = r3
            r8 = 0
            r3 = r24
            r19 = r4
            r4 = r16
            r20 = r5
            r5 = r17
            r6 = r27
            r21 = r7
            r7 = r18
            r2.<init>(r3, r4, r5, r6, r7)
            r2.setId(r9)
            android.view.ViewGroup$LayoutParams r3 = r25.getLayoutParams()
            r2.setLayoutParams(r3)
            android.view.ViewParent r3 = r25.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r4 = r25
            int r5 = r3.indexOfChild(r4)
            r3.removeView(r4)
            r3.addView(r2, r5)
            r1.timeBar = r2
            goto L1ba
        L1b1:
            r19 = r4
            r20 = r5
            r21 = r7
            r8 = 0
            r1.timeBar = r8
        L1ba:
            com.google.android.exoplayer2.ui.TimeBar r2 = r1.timeBar
            r3 = r19
            if (r2 == 0) goto L1c3
            r2.addListener(r3)
        L1c3:
            int r2 = com.google.android.exoplayer2.ui.R.id.exo_play_pause
            android.view.View r2 = r1.findViewById(r2)
            r1.playPauseButton = r2
            if (r2 == 0) goto L1d0
            r2.setOnClickListener(r3)
        L1d0:
            int r2 = com.google.android.exoplayer2.ui.R.id.exo_prev
            android.view.View r2 = r1.findViewById(r2)
            r1.previousButton = r2
            if (r2 == 0) goto L1dd
            r2.setOnClickListener(r3)
        L1dd:
            int r2 = com.google.android.exoplayer2.ui.R.id.exo_next
            android.view.View r2 = r1.findViewById(r2)
            r1.nextButton = r2
            if (r2 == 0) goto L1ea
            r2.setOnClickListener(r3)
        L1ea:
            int r2 = com.google.android.exoplayer2.ui.R.font.roboto_medium_numbers
            android.graphics.Typeface r2 = androidx.core.content.res.ResourcesCompat.getFont(r0, r2)
            int r4 = com.google.android.exoplayer2.ui.R.id.exo_rew
            android.view.View r4 = r1.findViewById(r4)
            if (r4 != 0) goto L201
            int r5 = com.google.android.exoplayer2.ui.R.id.exo_rew_with_amount
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            goto L202
        L201:
            r5 = r8
        L202:
            r1.rewindButtonTextView = r5
            if (r5 == 0) goto L209
            r5.setTypeface(r2)
        L209:
            if (r4 != 0) goto L20c
            r4 = r5
        L20c:
            r1.rewindButton = r4
            if (r4 == 0) goto L213
            r4.setOnClickListener(r3)
        L213:
            int r4 = com.google.android.exoplayer2.ui.R.id.exo_ffwd
            android.view.View r4 = r1.findViewById(r4)
            if (r4 != 0) goto L224
            int r5 = com.google.android.exoplayer2.ui.R.id.exo_ffwd_with_amount
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            goto L225
        L224:
            r5 = r8
        L225:
            r1.fastForwardButtonTextView = r5
            if (r5 == 0) goto L22c
            r5.setTypeface(r2)
        L22c:
            if (r4 != 0) goto L22f
            r4 = r5
        L22f:
            r1.fastForwardButton = r4
            if (r4 == 0) goto L236
            r4.setOnClickListener(r3)
        L236:
            int r2 = com.google.android.exoplayer2.ui.R.id.exo_repeat_toggle
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.repeatToggleButton = r2
            if (r2 == 0) goto L245
            r2.setOnClickListener(r3)
        L245:
            int r2 = com.google.android.exoplayer2.ui.R.id.exo_shuffle
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.shuffleButton = r2
            if (r2 == 0) goto L254
            r2.setOnClickListener(r3)
        L254:
            android.content.res.Resources r2 = r24.getResources()
            r1.resources = r2
            int r4 = com.google.android.exoplayer2.ui.R.integer.exo_media_button_opacity_percentage_enabled
            int r4 = r2.getInteger(r4)
            float r4 = (float) r4
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r5
            r1.buttonAlphaEnabled = r4
            int r4 = com.google.android.exoplayer2.ui.R.integer.exo_media_button_opacity_percentage_disabled
            int r4 = r2.getInteger(r4)
            float r4 = (float) r4
            float r4 = r4 / r5
            r1.buttonAlphaDisabled = r4
            int r4 = com.google.android.exoplayer2.ui.R.id.exo_vr
            android.view.View r4 = r1.findViewById(r4)
            r1.vrButton = r4
            if (r4 == 0) goto L27e
            r5 = 0
            r1.updateButton(r5, r4)
        L27e:
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r4 = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager
            r4.<init>(r1)
            r1.controlViewLayoutManager = r4
            r9 = r20
            r4.setAnimationEnabled(r9)
            r4 = 2
            java.lang.String[] r5 = new java.lang.String[r4]
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r4]
            int r6 = com.google.android.exoplayer2.ui.R.string.exo_controls_playback_speed
            java.lang.String r6 = r2.getString(r6)
            r7 = 0
            r5[r7] = r6
            int r6 = com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_speed
            android.graphics.drawable.Drawable r6 = com.google.android.exoplayer2.util.Util.getDrawable(r0, r2, r6)
            r4[r7] = r6
            int r6 = com.google.android.exoplayer2.ui.R.string.exo_track_selection_title_audio
            java.lang.String r6 = r2.getString(r6)
            r7 = 1
            r5[r7] = r6
            int r6 = com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_audiotrack
            android.graphics.drawable.Drawable r6 = com.google.android.exoplayer2.util.Util.getDrawable(r0, r2, r6)
            r4[r7] = r6
            com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingsAdapter r6 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingsAdapter
            r6.<init>(r1, r5, r4)
            r1.settingsAdapter = r6
            int r4 = com.google.android.exoplayer2.ui.R.dimen.exo_settings_offset
            int r4 = r2.getDimensionPixelSize(r4)
            r1.settingsWindowMargin = r4
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r24)
            int r5 = com.google.android.exoplayer2.ui.R.layout.exo_styled_settings_list
            android.view.View r4 = r4.inflate(r5, r8)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r1.settingsView = r4
            r4.setAdapter(r6)
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r6 = r23.getContext()
            r5.<init>(r6)
            r4.setLayoutManager(r5)
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            r6 = -2
            r7 = 1
            r5.<init>(r4, r6, r6, r7)
            r1.settingsWindow = r5
            int r4 = com.google.android.exoplayer2.util.Util.SDK_INT
            r6 = 23
            if (r4 >= r6) goto L2f5
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            r6 = 0
            r4.<init>(r6)
            r5.setBackgroundDrawable(r4)
        L2f5:
            r5.setOnDismissListener(r3)
            r1.needToHideBars = r7
            com.google.android.exoplayer2.ui.DefaultTrackNameProvider r3 = new com.google.android.exoplayer2.ui.DefaultTrackNameProvider
            android.content.res.Resources r4 = r23.getResources()
            r3.<init>(r4)
            r1.trackNameProvider = r3
            int r3 = com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_subtitle_on
            android.graphics.drawable.Drawable r3 = com.google.android.exoplayer2.util.Util.getDrawable(r0, r2, r3)
            r1.subtitleOnButtonDrawable = r3
            int r3 = com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_subtitle_off
            android.graphics.drawable.Drawable r3 = com.google.android.exoplayer2.util.Util.getDrawable(r0, r2, r3)
            r1.subtitleOffButtonDrawable = r3
            int r3 = com.google.android.exoplayer2.ui.R.string.exo_controls_cc_enabled_description
            java.lang.String r3 = r2.getString(r3)
            r1.subtitleOnContentDescription = r3
            int r3 = com.google.android.exoplayer2.ui.R.string.exo_controls_cc_disabled_description
            java.lang.String r3 = r2.getString(r3)
            r1.subtitleOffContentDescription = r3
            com.google.android.exoplayer2.ui.StyledPlayerControlView$TextTrackSelectionAdapter r3 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$TextTrackSelectionAdapter
            r3.<init>(r1, r8)
            r1.textTrackSelectionAdapter = r3
            com.google.android.exoplayer2.ui.StyledPlayerControlView$AudioTrackSelectionAdapter r3 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$AudioTrackSelectionAdapter
            r3.<init>(r1, r8)
            r1.audioTrackSelectionAdapter = r3
            com.google.android.exoplayer2.ui.StyledPlayerControlView$PlaybackSpeedAdapter r3 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$PlaybackSpeedAdapter
            int r4 = com.google.android.exoplayer2.ui.R.array.exo_controls_playback_speeds
            java.lang.String[] r4 = r2.getStringArray(r4)
            float[] r5 = com.google.android.exoplayer2.ui.StyledPlayerControlView.PLAYBACK_SPEEDS
            r3.<init>(r1, r4, r5)
            r1.playbackSpeedAdapter = r3
            int r3 = com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_fullscreen_exit
            android.graphics.drawable.Drawable r3 = com.google.android.exoplayer2.util.Util.getDrawable(r0, r2, r3)
            r1.fullScreenExitDrawable = r3
            int r3 = com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_fullscreen_enter
            android.graphics.drawable.Drawable r3 = com.google.android.exoplayer2.util.Util.getDrawable(r0, r2, r3)
            r1.fullScreenEnterDrawable = r3
            int r3 = com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_repeat_off
            android.graphics.drawable.Drawable r3 = com.google.android.exoplayer2.util.Util.getDrawable(r0, r2, r3)
            r1.repeatOffButtonDrawable = r3
            int r3 = com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_repeat_one
            android.graphics.drawable.Drawable r3 = com.google.android.exoplayer2.util.Util.getDrawable(r0, r2, r3)
            r1.repeatOneButtonDrawable = r3
            int r3 = com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_repeat_all
            android.graphics.drawable.Drawable r3 = com.google.android.exoplayer2.util.Util.getDrawable(r0, r2, r3)
            r1.repeatAllButtonDrawable = r3
            int r3 = com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_shuffle_on
            android.graphics.drawable.Drawable r3 = com.google.android.exoplayer2.util.Util.getDrawable(r0, r2, r3)
            r1.shuffleOnButtonDrawable = r3
            int r3 = com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_shuffle_off
            android.graphics.drawable.Drawable r0 = com.google.android.exoplayer2.util.Util.getDrawable(r0, r2, r3)
            r1.shuffleOffButtonDrawable = r0
            int r0 = com.google.android.exoplayer2.ui.R.string.exo_controls_fullscreen_exit_description
            java.lang.String r0 = r2.getString(r0)
            r1.fullScreenExitContentDescription = r0
            int r0 = com.google.android.exoplayer2.ui.R.string.exo_controls_fullscreen_enter_description
            java.lang.String r0 = r2.getString(r0)
            r1.fullScreenEnterContentDescription = r0
            android.content.res.Resources r0 = r1.resources
            int r2 = com.google.android.exoplayer2.ui.R.string.exo_controls_repeat_off_description
            java.lang.String r0 = r0.getString(r2)
            r1.repeatOffButtonContentDescription = r0
            android.content.res.Resources r0 = r1.resources
            int r2 = com.google.android.exoplayer2.ui.R.string.exo_controls_repeat_one_description
            java.lang.String r0 = r0.getString(r2)
            r1.repeatOneButtonContentDescription = r0
            android.content.res.Resources r0 = r1.resources
            int r2 = com.google.android.exoplayer2.ui.R.string.exo_controls_repeat_all_description
            java.lang.String r0 = r0.getString(r2)
            r1.repeatAllButtonContentDescription = r0
            android.content.res.Resources r0 = r1.resources
            int r2 = com.google.android.exoplayer2.ui.R.string.exo_controls_shuffle_on_description
            java.lang.String r0 = r0.getString(r2)
            r1.shuffleOnContentDescription = r0
            android.content.res.Resources r0 = r1.resources
            int r2 = com.google.android.exoplayer2.ui.R.string.exo_controls_shuffle_off_description
            java.lang.String r0 = r0.getString(r2)
            r1.shuffleOffContentDescription = r0
            int r0 = com.google.android.exoplayer2.ui.R.id.exo_bottom_bar
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r2 = r1.controlViewLayoutManager
            r3 = 1
            r2.setShowButton(r0, r3)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            android.view.View r2 = r1.fastForwardButton
            r0.setShowButton(r2, r11)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            android.view.View r2 = r1.rewindButton
            r0.setShowButton(r2, r10)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            android.view.View r2 = r1.previousButton
            r0.setShowButton(r2, r12)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            android.view.View r2 = r1.nextButton
            r0.setShowButton(r2, r13)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            android.widget.ImageView r2 = r1.shuffleButton
            r0.setShowButton(r2, r14)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            android.widget.ImageView r2 = r1.subtitleButton
            r0.setShowButton(r2, r15)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            android.view.View r2 = r1.vrButton
            r13 = r21
            r0.setShowButton(r2, r13)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            android.widget.ImageView r2 = r1.repeatToggleButton
            int r4 = r1.repeatToggleModes
            if (r4 == 0) goto L407
            r9 = 1
            goto L408
        L407:
            r9 = 0
        L408:
            r0.setShowButton(r2, r9)
            com.google.android.exoplayer2.ui.StyledPlayerControlView$$ExternalSyntheticLambda1 r0 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$$ExternalSyntheticLambda1
            r2 = 0
            r0.<init>(r1, r2)
            r1.addOnLayoutChangeListener(r0)
            return
    }

    public static /* synthetic */ void access$1000(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            r0.updateTrackLists()
            return
    }

    public static /* synthetic */ boolean access$1102(com.google.android.exoplayer2.ui.StyledPlayerControlView r0, boolean r1) {
            r0.scrubbing = r1
            return r1
    }

    public static /* synthetic */ android.widget.TextView access$1200(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            android.widget.TextView r0 = r0.positionView
            return r0
    }

    public static /* synthetic */ java.lang.StringBuilder access$1300(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            java.lang.StringBuilder r0 = r0.formatBuilder
            return r0
    }

    public static /* synthetic */ java.util.Formatter access$1400(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            java.util.Formatter r0 = r0.formatter
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager access$1500(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r0.controlViewLayoutManager
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.Player access$1600(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            com.google.android.exoplayer2.Player r0 = r0.player
            return r0
    }

    public static /* synthetic */ void access$1700(com.google.android.exoplayer2.ui.StyledPlayerControlView r0, com.google.android.exoplayer2.Player r1, long r2) {
            r0.seekToTimeBarPosition(r1, r2)
            return
    }

    public static /* synthetic */ boolean access$1800(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            boolean r0 = r0.needToHideBars
            return r0
    }

    public static /* synthetic */ android.view.View access$1900(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            android.view.View r0 = r0.nextButton
            return r0
    }

    public static /* synthetic */ android.view.View access$2000(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            android.view.View r0 = r0.previousButton
            return r0
    }

    public static /* synthetic */ android.view.View access$2100(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            android.view.View r0 = r0.fastForwardButton
            return r0
    }

    public static /* synthetic */ android.view.View access$2200(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            android.view.View r0 = r0.rewindButton
            return r0
    }

    public static /* synthetic */ android.view.View access$2300(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            android.view.View r0 = r0.playPauseButton
            return r0
    }

    public static /* synthetic */ void access$2400(com.google.android.exoplayer2.ui.StyledPlayerControlView r0, com.google.android.exoplayer2.Player r1) {
            r0.dispatchPlayPause(r1)
            return
    }

    public static /* synthetic */ android.widget.ImageView access$2500(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            android.widget.ImageView r0 = r0.repeatToggleButton
            return r0
    }

    public static /* synthetic */ int access$2600(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            int r0 = r0.repeatToggleModes
            return r0
    }

    public static /* synthetic */ android.widget.ImageView access$2700(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            android.widget.ImageView r0 = r0.shuffleButton
            return r0
    }

    public static /* synthetic */ android.view.View access$2800(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            android.view.View r0 = r0.settingsButton
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingsAdapter access$2900(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingsAdapter r0 = r0.settingsAdapter
            return r0
    }

    public static /* synthetic */ void access$300(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            r0.updatePlayPauseButton()
            return
    }

    public static /* synthetic */ void access$3000(com.google.android.exoplayer2.ui.StyledPlayerControlView r0, androidx.recyclerview.widget.RecyclerView.Adapter r1, android.view.View r2) {
            r0.displaySettingsWindow(r1, r2)
            return
    }

    public static /* synthetic */ android.view.View access$3100(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            android.view.View r0 = r0.playbackSpeedButton
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.ui.StyledPlayerControlView.PlaybackSpeedAdapter access$3200(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            com.google.android.exoplayer2.ui.StyledPlayerControlView$PlaybackSpeedAdapter r0 = r0.playbackSpeedAdapter
            return r0
    }

    public static /* synthetic */ android.view.View access$3300(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            android.view.View r0 = r0.audioTrackButton
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.ui.StyledPlayerControlView.AudioTrackSelectionAdapter access$3400(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            com.google.android.exoplayer2.ui.StyledPlayerControlView$AudioTrackSelectionAdapter r0 = r0.audioTrackSelectionAdapter
            return r0
    }

    public static /* synthetic */ android.widget.ImageView access$3500(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            android.widget.ImageView r0 = r0.subtitleButton
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.ui.StyledPlayerControlView.TextTrackSelectionAdapter access$3600(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            com.google.android.exoplayer2.ui.StyledPlayerControlView$TextTrackSelectionAdapter r0 = r0.textTrackSelectionAdapter
            return r0
    }

    public static /* synthetic */ void access$400(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            r0.updateProgress()
            return
    }

    public static /* synthetic */ void access$4000(com.google.android.exoplayer2.ui.StyledPlayerControlView r0, int r1) {
            r0.onSettingViewClicked(r1)
            return
    }

    public static /* synthetic */ void access$4100(com.google.android.exoplayer2.ui.StyledPlayerControlView r0, float r1) {
            r0.setPlaybackSpeed(r1)
            return
    }

    public static /* synthetic */ android.widget.PopupWindow access$4200(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            android.widget.PopupWindow r0 = r0.settingsWindow
            return r0
    }

    public static /* synthetic */ android.graphics.drawable.Drawable access$4300(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            android.graphics.drawable.Drawable r0 = r0.subtitleOnButtonDrawable
            return r0
    }

    public static /* synthetic */ android.graphics.drawable.Drawable access$4400(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            android.graphics.drawable.Drawable r0 = r0.subtitleOffButtonDrawable
            return r0
    }

    public static /* synthetic */ java.lang.String access$4500(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            java.lang.String r0 = r0.subtitleOnContentDescription
            return r0
    }

    public static /* synthetic */ java.lang.String access$4600(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            java.lang.String r0 = r0.subtitleOffContentDescription
            return r0
    }

    public static /* synthetic */ void access$500(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            r0.updateRepeatModeButton()
            return
    }

    public static /* synthetic */ void access$600(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            r0.updateShuffleButton()
            return
    }

    public static /* synthetic */ void access$700(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            r0.updateNavigation()
            return
    }

    public static /* synthetic */ void access$800(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            r0.updateTimeline()
            return
    }

    public static /* synthetic */ void access$900(com.google.android.exoplayer2.ui.StyledPlayerControlView r0) {
            r0.updatePlaybackSpeedList()
            return
    }

    private static boolean canShowMultiWindowTimeBar(com.google.android.exoplayer2.Player r9, com.google.android.exoplayer2.Timeline.Window r10) {
            r0 = 17
            boolean r0 = r9.isCommandAvailable(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            com.google.android.exoplayer2.Timeline r9 = r9.getCurrentTimeline()
            int r0 = r9.getWindowCount()
            r2 = 1
            if (r0 <= r2) goto L31
            r3 = 100
            if (r0 <= r3) goto L1a
            goto L31
        L1a:
            r3 = 0
        L1b:
            if (r3 >= r0) goto L30
            com.google.android.exoplayer2.Timeline$Window r4 = r9.getWindow(r3, r10)
            long r4 = r4.durationUs
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2d
            return r1
        L2d:
            int r3 = r3 + 1
            goto L1b
        L30:
            return r2
        L31:
            return r1
    }

    private void dispatchPause(com.google.android.exoplayer2.Player r2) {
            r1 = this;
            r0 = 1
            boolean r0 = r2.isCommandAvailable(r0)
            if (r0 == 0) goto La
            r2.pause()
        La:
            return
    }

    private void dispatchPlay(com.google.android.exoplayer2.Player r4) {
            r3 = this;
            int r0 = r4.getPlaybackState()
            r1 = 1
            if (r0 != r1) goto L12
            r2 = 2
            boolean r2 = r4.isCommandAvailable(r2)
            if (r2 == 0) goto L12
            r4.prepare()
            goto L1e
        L12:
            r2 = 4
            if (r0 != r2) goto L1e
            boolean r0 = r4.isCommandAvailable(r2)
            if (r0 == 0) goto L1e
            r4.seekToDefaultPosition()
        L1e:
            boolean r0 = r4.isCommandAvailable(r1)
            if (r0 == 0) goto L27
            r4.play()
        L27:
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

    private void displaySettingsWindow(androidx.recyclerview.widget.RecyclerView.Adapter<?> r3, android.view.View r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.settingsView
            r0.setAdapter(r3)
            r2.updateSettingsWindowSize()
            r3 = 0
            r2.needToHideBars = r3
            android.widget.PopupWindow r3 = r2.settingsWindow
            r3.dismiss()
            r3 = 1
            r2.needToHideBars = r3
            int r3 = r2.getWidth()
            android.widget.PopupWindow r0 = r2.settingsWindow
            int r0 = r0.getWidth()
            int r3 = r3 - r0
            int r0 = r2.settingsWindowMargin
            int r3 = r3 - r0
            android.widget.PopupWindow r0 = r2.settingsWindow
            int r0 = r0.getHeight()
            int r0 = -r0
            int r1 = r2.settingsWindowMargin
            int r0 = r0 - r1
            android.widget.PopupWindow r1 = r2.settingsWindow
            r1.showAsDropDown(r4, r3, r0)
            return
    }

    private com.google.common.collect.ImmutableList<com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation> gatherSupportedTrackInfosOfType(com.google.android.exoplayer2.Tracks r9, int r10) {
            r8 = this;
            com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
            r0.<init>()
            com.google.common.collect.ImmutableList r1 = r9.getGroups()
            r2 = 0
            r3 = 0
        Lb:
            int r4 = r1.size()
            if (r3 >= r4) goto L49
            java.lang.Object r4 = r1.get(r3)
            com.google.android.exoplayer2.Tracks$Group r4 = (com.google.android.exoplayer2.Tracks.Group) r4
            int r5 = r4.getType()
            if (r5 == r10) goto L1e
            goto L46
        L1e:
            r5 = 0
        L1f:
            int r6 = r4.length
            if (r5 >= r6) goto L46
            boolean r6 = r4.isTrackSupported(r5)
            if (r6 != 0) goto L2a
            goto L43
        L2a:
            com.google.android.exoplayer2.Format r6 = r4.getTrackFormat(r5)
            int r7 = r6.selectionFlags
            r7 = r7 & 2
            if (r7 == 0) goto L35
            goto L43
        L35:
            com.google.android.exoplayer2.ui.TrackNameProvider r7 = r8.trackNameProvider
            java.lang.String r6 = r7.getTrackName(r6)
            com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInformation r7 = new com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInformation
            r7.<init>(r9, r3, r5, r6)
            r0.add(r7)
        L43:
            int r5 = r5 + 1
            goto L1f
        L46:
            int r3 = r3 + 1
            goto Lb
        L49:
            com.google.common.collect.ImmutableList r9 = r0.build()
            return r9
    }

    private static int getRepeatToggleModes(android.content.res.TypedArray r1, int r2) {
            int r0 = com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_repeat_toggle_modes
            int r1 = r1.getInt(r0, r2)
            return r1
    }

    private void initTrackSelectionAdapter() {
            r3 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlView$TextTrackSelectionAdapter r0 = r3.textTrackSelectionAdapter
            java.util.Objects.requireNonNull(r0)
            java.util.List r1 = java.util.Collections.emptyList()
            r0.tracks = r1
            com.google.android.exoplayer2.ui.StyledPlayerControlView$AudioTrackSelectionAdapter r0 = r3.audioTrackSelectionAdapter
            java.util.Objects.requireNonNull(r0)
            java.util.List r1 = java.util.Collections.emptyList()
            r0.tracks = r1
            com.google.android.exoplayer2.Player r0 = r3.player
            if (r0 == 0) goto L5b
            r1 = 30
            boolean r0 = r0.isCommandAvailable(r1)
            if (r0 == 0) goto L5b
            com.google.android.exoplayer2.Player r0 = r3.player
            r1 = 29
            boolean r0 = r0.isCommandAvailable(r1)
            if (r0 != 0) goto L2d
            goto L5b
        L2d:
            com.google.android.exoplayer2.Player r0 = r3.player
            com.google.android.exoplayer2.Tracks r0 = r0.getCurrentTracks()
            com.google.android.exoplayer2.ui.StyledPlayerControlView$AudioTrackSelectionAdapter r1 = r3.audioTrackSelectionAdapter
            r2 = 1
            com.google.common.collect.ImmutableList r2 = r3.gatherSupportedTrackInfosOfType(r0, r2)
            r1.init(r2)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r1 = r3.controlViewLayoutManager
            android.widget.ImageView r2 = r3.subtitleButton
            boolean r1 = r1.getShowButton(r2)
            if (r1 == 0) goto L52
            com.google.android.exoplayer2.ui.StyledPlayerControlView$TextTrackSelectionAdapter r1 = r3.textTrackSelectionAdapter
            r2 = 3
            com.google.common.collect.ImmutableList r0 = r3.gatherSupportedTrackInfosOfType(r0, r2)
            r1.init(r0)
            goto L5b
        L52:
            com.google.android.exoplayer2.ui.StyledPlayerControlView$TextTrackSelectionAdapter r0 = r3.textTrackSelectionAdapter
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            r0.init(r1)
        L5b:
            return
    }

    private static void initializeFullScreenButton(android.view.View r1, android.view.View.OnClickListener r2) {
            if (r1 != 0) goto L3
            return
        L3:
            r0 = 8
            r1.setVisibility(r0)
            r1.setOnClickListener(r2)
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

    private void onFullScreenButtonClicked(android.view.View r2) {
            r1 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlView$OnFullScreenModeChangedListener r2 = r1.onFullScreenModeChangedListener
            if (r2 != 0) goto L5
            return
        L5:
            boolean r2 = r1.isFullScreen
            r2 = r2 ^ 1
            r1.isFullScreen = r2
            android.widget.ImageView r0 = r1.fullScreenButton
            r1.updateFullScreenButtonForState(r0, r2)
            android.widget.ImageView r2 = r1.minimalFullScreenButton
            boolean r0 = r1.isFullScreen
            r1.updateFullScreenButtonForState(r2, r0)
            com.google.android.exoplayer2.ui.StyledPlayerControlView$OnFullScreenModeChangedListener r2 = r1.onFullScreenModeChangedListener
            if (r2 == 0) goto L20
            boolean r0 = r1.isFullScreen
            r2.onFullScreenModeChanged(r0)
        L20:
            return
    }

    private void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0 = this;
            int r4 = r4 - r2
            int r5 = r5 - r3
            int r8 = r8 - r6
            int r9 = r9 - r7
            if (r4 != r8) goto L8
            if (r5 == r9) goto L35
        L8:
            android.widget.PopupWindow r2 = r0.settingsWindow
            boolean r2 = r2.isShowing()
            if (r2 == 0) goto L35
            r0.updateSettingsWindowSize()
            int r2 = r0.getWidth()
            android.widget.PopupWindow r3 = r0.settingsWindow
            int r3 = r3.getWidth()
            int r2 = r2 - r3
            int r3 = r0.settingsWindowMargin
            int r6 = r2 - r3
            android.widget.PopupWindow r2 = r0.settingsWindow
            int r2 = r2.getHeight()
            int r2 = -r2
            int r3 = r0.settingsWindowMargin
            int r7 = r2 - r3
            android.widget.PopupWindow r4 = r0.settingsWindow
            r8 = -1
            r9 = -1
            r5 = r1
            r4.update(r5, r6, r7, r8, r9)
        L35:
            return
    }

    private void onSettingViewClicked(int r2) {
            r1 = this;
            if (r2 != 0) goto L10
            com.google.android.exoplayer2.ui.StyledPlayerControlView$PlaybackSpeedAdapter r2 = r1.playbackSpeedAdapter
            android.view.View r0 = r1.settingsButton
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.view.View r0 = (android.view.View) r0
            r1.displaySettingsWindow(r2, r0)
            goto L26
        L10:
            r0 = 1
            if (r2 != r0) goto L21
            com.google.android.exoplayer2.ui.StyledPlayerControlView$AudioTrackSelectionAdapter r2 = r1.audioTrackSelectionAdapter
            android.view.View r0 = r1.settingsButton
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.view.View r0 = (android.view.View) r0
            r1.displaySettingsWindow(r2, r0)
            goto L26
        L21:
            android.widget.PopupWindow r2 = r1.settingsWindow
            r2.dismiss()
        L26:
            return
    }

    private void seekToTimeBarPosition(com.google.android.exoplayer2.Player r7, long r8) {
            r6 = this;
            boolean r0 = r6.multiWindowTimeBar
            if (r0 == 0) goto L39
            r0 = 17
            boolean r0 = r7.isCommandAvailable(r0)
            if (r0 == 0) goto L43
            r0 = 10
            boolean r0 = r7.isCommandAvailable(r0)
            if (r0 == 0) goto L43
            com.google.android.exoplayer2.Timeline r0 = r7.getCurrentTimeline()
            int r1 = r0.getWindowCount()
            r2 = 0
        L1d:
            com.google.android.exoplayer2.Timeline$Window r3 = r6.window
            com.google.android.exoplayer2.Timeline$Window r3 = r0.getWindow(r2, r3)
            long r3 = r3.getDurationMs()
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto L2c
            goto L31
        L2c:
            int r5 = r1 + (-1)
            if (r2 != r5) goto L35
            r8 = r3
        L31:
            r7.seekTo(r2, r8)
            goto L43
        L35:
            long r8 = r8 - r3
            int r2 = r2 + 1
            goto L1d
        L39:
            r0 = 5
            boolean r0 = r7.isCommandAvailable(r0)
            if (r0 == 0) goto L43
            r7.seekTo(r8)
        L43:
            r6.updateProgress()
            return
    }

    private void setPlaybackSpeed(float r3) {
            r2 = this;
            com.google.android.exoplayer2.Player r0 = r2.player
            if (r0 == 0) goto L1a
            r1 = 13
            boolean r0 = r0.isCommandAvailable(r1)
            if (r0 != 0) goto Ld
            goto L1a
        Ld:
            com.google.android.exoplayer2.Player r0 = r2.player
            com.google.android.exoplayer2.PlaybackParameters r1 = r0.getPlaybackParameters()
            com.google.android.exoplayer2.PlaybackParameters r3 = r1.withSpeed(r3)
            r0.setPlaybackParameters(r3)
        L1a:
            return
    }

    private boolean shouldEnablePlayPauseButton() {
            r3 = this;
            com.google.android.exoplayer2.Player r0 = r3.player
            r1 = 1
            if (r0 == 0) goto L22
            boolean r0 = r0.isCommandAvailable(r1)
            if (r0 == 0) goto L22
            com.google.android.exoplayer2.Player r0 = r3.player
            r2 = 17
            boolean r0 = r0.isCommandAvailable(r2)
            if (r0 == 0) goto L23
            com.google.android.exoplayer2.Player r0 = r3.player
            com.google.android.exoplayer2.Timeline r0 = r0.getCurrentTimeline()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L22
            goto L23
        L22:
            r1 = 0
        L23:
            return r1
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

    private void updateButton(boolean r1, @androidx.annotation.Nullable android.view.View r2) {
            r0 = this;
            if (r2 != 0) goto L3
            return
        L3:
            r2.setEnabled(r1)
            if (r1 == 0) goto Lb
            float r1 = r0.buttonAlphaEnabled
            goto Ld
        Lb:
            float r1 = r0.buttonAlphaDisabled
        Ld:
            r2.setAlpha(r1)
            return
    }

    private void updateFastForwardButton() {
            r7 = this;
            com.google.android.exoplayer2.Player r0 = r7.player
            if (r0 == 0) goto L9
            long r0 = r0.getSeekForwardIncrement()
            goto Lb
        L9:
            r0 = 15000(0x3a98, double:7.411E-320)
        Lb:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            int r1 = (int) r0
            android.widget.TextView r0 = r7.fastForwardButtonTextView
            if (r0 == 0) goto L1a
            java.lang.String r2 = java.lang.String.valueOf(r1)
            r0.setText(r2)
        L1a:
            android.view.View r0 = r7.fastForwardButton
            if (r0 == 0) goto L33
            android.content.res.Resources r2 = r7.resources
            int r3 = com.google.android.exoplayer2.ui.R.plurals.exo_controls_fastforward_by_amount_description
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r4[r5] = r6
            java.lang.String r1 = r2.getQuantityString(r3, r1, r4)
            r0.setContentDescription(r1)
        L33:
            return
    }

    private void updateFullScreenButtonForState(@androidx.annotation.Nullable android.widget.ImageView r1, boolean r2) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            if (r2 == 0) goto L10
            android.graphics.drawable.Drawable r2 = r0.fullScreenExitDrawable
            r1.setImageDrawable(r2)
            java.lang.String r2 = r0.fullScreenExitContentDescription
            r1.setContentDescription(r2)
            goto L1a
        L10:
            android.graphics.drawable.Drawable r2 = r0.fullScreenEnterDrawable
            r1.setImageDrawable(r2)
            java.lang.String r2 = r0.fullScreenEnterContentDescription
            r1.setContentDescription(r2)
        L1a:
            return
    }

    private static void updateFullScreenButtonVisibility(@androidx.annotation.Nullable android.view.View r0, boolean r1) {
            if (r0 != 0) goto L3
            return
        L3:
            if (r1 == 0) goto La
            r1 = 0
            r0.setVisibility(r1)
            goto Lf
        La:
            r1 = 8
            r0.setVisibility(r1)
        Lf:
            return
    }

    private void updateNavigation() {
            r7 = this;
            boolean r0 = r7.isVisible()
            if (r0 == 0) goto L6c
            boolean r0 = r7.isAttachedToWindow
            if (r0 != 0) goto Lb
            goto L6c
        Lb:
            com.google.android.exoplayer2.Player r0 = r7.player
            r1 = 0
            if (r0 == 0) goto L43
            boolean r1 = r7.showMultiWindowTimeBar
            if (r1 == 0) goto L23
            com.google.android.exoplayer2.Timeline$Window r1 = r7.window
            boolean r1 = canShowMultiWindowTimeBar(r0, r1)
            if (r1 == 0) goto L23
            r1 = 10
            boolean r1 = r0.isCommandAvailable(r1)
            goto L28
        L23:
            r1 = 5
            boolean r1 = r0.isCommandAvailable(r1)
        L28:
            r2 = 7
            boolean r2 = r0.isCommandAvailable(r2)
            r3 = 11
            boolean r3 = r0.isCommandAvailable(r3)
            r4 = 12
            boolean r4 = r0.isCommandAvailable(r4)
            r5 = 9
            boolean r0 = r0.isCommandAvailable(r5)
            r6 = r3
            r3 = r1
            r1 = r6
            goto L47
        L43:
            r0 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L47:
            if (r1 == 0) goto L4c
            r7.updateRewindButton()
        L4c:
            if (r4 == 0) goto L51
            r7.updateFastForwardButton()
        L51:
            android.view.View r5 = r7.previousButton
            r7.updateButton(r2, r5)
            android.view.View r2 = r7.rewindButton
            r7.updateButton(r1, r2)
            android.view.View r1 = r7.fastForwardButton
            r7.updateButton(r4, r1)
            android.view.View r1 = r7.nextButton
            r7.updateButton(r0, r1)
            com.google.android.exoplayer2.ui.TimeBar r0 = r7.timeBar
            if (r0 == 0) goto L6c
            r0.setEnabled(r3)
        L6c:
            return
    }

    private void updatePlayPauseButton() {
            r5 = this;
            boolean r0 = r5.isVisible()
            if (r0 == 0) goto L46
            boolean r0 = r5.isAttachedToWindow
            if (r0 != 0) goto Lb
            goto L46
        Lb:
            android.view.View r0 = r5.playPauseButton
            if (r0 == 0) goto L46
            boolean r0 = r5.shouldShowPauseButton()
            if (r0 == 0) goto L18
            int r1 = com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_pause
            goto L1a
        L18:
            int r1 = com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_play
        L1a:
            if (r0 == 0) goto L1f
            int r0 = com.google.android.exoplayer2.ui.R.string.exo_controls_pause_description
            goto L21
        L1f:
            int r0 = com.google.android.exoplayer2.ui.R.string.exo_controls_play_description
        L21:
            android.view.View r2 = r5.playPauseButton
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r3 = r5.getContext()
            android.content.res.Resources r4 = r5.resources
            android.graphics.drawable.Drawable r1 = com.google.android.exoplayer2.util.Util.getDrawable(r3, r4, r1)
            r2.setImageDrawable(r1)
            android.view.View r1 = r5.playPauseButton
            android.content.res.Resources r2 = r5.resources
            java.lang.String r0 = r2.getString(r0)
            r1.setContentDescription(r0)
            boolean r0 = r5.shouldEnablePlayPauseButton()
            android.view.View r1 = r5.playPauseButton
            r5.updateButton(r0, r1)
        L46:
            return
    }

    private void updatePlaybackSpeedList() {
            r3 = this;
            com.google.android.exoplayer2.Player r0 = r3.player
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.exoplayer2.ui.StyledPlayerControlView$PlaybackSpeedAdapter r1 = r3.playbackSpeedAdapter
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.getPlaybackParameters()
            float r0 = r0.speed
            r1.updateSelectedIndex(r0)
            com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingsAdapter r0 = r3.settingsAdapter
            r1 = 0
            com.google.android.exoplayer2.ui.StyledPlayerControlView$PlaybackSpeedAdapter r2 = r3.playbackSpeedAdapter
            java.lang.String r2 = r2.getSelectedText()
            r0.setSubTextAtPosition(r1, r2)
            r3.updateSettingsButton()
            return
    }

    private void updateProgress() {
            r13 = this;
            boolean r0 = r13.isVisible()
            if (r0 == 0) goto La1
            boolean r0 = r13.isAttachedToWindow
            if (r0 != 0) goto Lc
            goto La1
        Lc:
            com.google.android.exoplayer2.Player r0 = r13.player
            r1 = 0
            if (r0 == 0) goto L29
            r3 = 16
            boolean r3 = r0.isCommandAvailable(r3)
            if (r3 == 0) goto L29
            long r1 = r13.currentWindowOffset
            long r3 = r0.getContentPosition()
            long r1 = r1 + r3
            long r3 = r13.currentWindowOffset
            long r5 = r0.getContentBufferedPosition()
            long r3 = r3 + r5
            goto L2a
        L29:
            r3 = r1
        L2a:
            android.widget.TextView r5 = r13.positionView
            if (r5 == 0) goto L3d
            boolean r6 = r13.scrubbing
            if (r6 != 0) goto L3d
            java.lang.StringBuilder r6 = r13.formatBuilder
            java.util.Formatter r7 = r13.formatter
            java.lang.String r6 = com.google.android.exoplayer2.util.Util.getStringForTime(r6, r7, r1)
            r5.setText(r6)
        L3d:
            com.google.android.exoplayer2.ui.TimeBar r5 = r13.timeBar
            if (r5 == 0) goto L49
            r5.setPosition(r1)
            com.google.android.exoplayer2.ui.TimeBar r5 = r13.timeBar
            r5.setBufferedPosition(r3)
        L49:
            com.google.android.exoplayer2.ui.StyledPlayerControlView$ProgressUpdateListener r5 = r13.progressUpdateListener
            if (r5 == 0) goto L50
            r5.onProgressUpdate(r1, r3)
        L50:
            java.lang.Runnable r3 = r13.updateProgressAction
            r13.removeCallbacks(r3)
            r3 = 1
            if (r0 != 0) goto L5a
            r4 = 1
            goto L5e
        L5a:
            int r4 = r0.getPlaybackState()
        L5e:
            r5 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L97
            boolean r7 = r0.isPlaying()
            if (r7 == 0) goto L97
            com.google.android.exoplayer2.ui.TimeBar r3 = r13.timeBar
            if (r3 == 0) goto L71
            long r3 = r3.getPreferredUpdateDelay()
            goto L72
        L71:
            r3 = r5
        L72:
            long r1 = r1 % r5
            long r1 = r5 - r1
            long r1 = java.lang.Math.min(r3, r1)
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.getPlaybackParameters()
            float r0 = r0.speed
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L87
            float r1 = (float) r1
            float r1 = r1 / r0
            long r5 = (long) r1
        L87:
            r7 = r5
            int r0 = r13.timeBarMinUpdateIntervalMs
            long r9 = (long) r0
            r11 = 1000(0x3e8, double:4.94E-321)
            long r0 = com.google.android.exoplayer2.util.Util.constrainValue(r7, r9, r11)
            java.lang.Runnable r2 = r13.updateProgressAction
            r13.postDelayed(r2, r0)
            goto La1
        L97:
            r0 = 4
            if (r4 == r0) goto La1
            if (r4 == r3) goto La1
            java.lang.Runnable r0 = r13.updateProgressAction
            r13.postDelayed(r0, r5)
        La1:
            return
    }

    private void updateRepeatModeButton() {
            r3 = this;
            boolean r0 = r3.isVisible()
            if (r0 == 0) goto L77
            boolean r0 = r3.isAttachedToWindow
            if (r0 == 0) goto L77
            android.widget.ImageView r0 = r3.repeatToggleButton
            if (r0 != 0) goto Lf
            goto L77
        Lf:
            int r1 = r3.repeatToggleModes
            r2 = 0
            if (r1 != 0) goto L18
            r3.updateButton(r2, r0)
            return
        L18:
            com.google.android.exoplayer2.Player r0 = r3.player
            if (r0 == 0) goto L64
            r1 = 15
            boolean r1 = r0.isCommandAvailable(r1)
            if (r1 != 0) goto L25
            goto L64
        L25:
            android.widget.ImageView r1 = r3.repeatToggleButton
            r2 = 1
            r3.updateButton(r2, r1)
            int r0 = r0.getRepeatMode()
            if (r0 == 0) goto L55
            if (r0 == r2) goto L46
            r1 = 2
            if (r0 == r1) goto L37
            goto L63
        L37:
            android.widget.ImageView r0 = r3.repeatToggleButton
            android.graphics.drawable.Drawable r1 = r3.repeatAllButtonDrawable
            r0.setImageDrawable(r1)
            android.widget.ImageView r0 = r3.repeatToggleButton
            java.lang.String r1 = r3.repeatAllButtonContentDescription
            r0.setContentDescription(r1)
            goto L63
        L46:
            android.widget.ImageView r0 = r3.repeatToggleButton
            android.graphics.drawable.Drawable r1 = r3.repeatOneButtonDrawable
            r0.setImageDrawable(r1)
            android.widget.ImageView r0 = r3.repeatToggleButton
            java.lang.String r1 = r3.repeatOneButtonContentDescription
            r0.setContentDescription(r1)
            goto L63
        L55:
            android.widget.ImageView r0 = r3.repeatToggleButton
            android.graphics.drawable.Drawable r1 = r3.repeatOffButtonDrawable
            r0.setImageDrawable(r1)
            android.widget.ImageView r0 = r3.repeatToggleButton
            java.lang.String r1 = r3.repeatOffButtonContentDescription
            r0.setContentDescription(r1)
        L63:
            return
        L64:
            android.widget.ImageView r0 = r3.repeatToggleButton
            r3.updateButton(r2, r0)
            android.widget.ImageView r0 = r3.repeatToggleButton
            android.graphics.drawable.Drawable r1 = r3.repeatOffButtonDrawable
            r0.setImageDrawable(r1)
            android.widget.ImageView r0 = r3.repeatToggleButton
            java.lang.String r1 = r3.repeatOffButtonContentDescription
            r0.setContentDescription(r1)
        L77:
            return
    }

    private void updateRewindButton() {
            r7 = this;
            com.google.android.exoplayer2.Player r0 = r7.player
            if (r0 == 0) goto L9
            long r0 = r0.getSeekBackIncrement()
            goto Lb
        L9:
            r0 = 5000(0x1388, double:2.4703E-320)
        Lb:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            int r1 = (int) r0
            android.widget.TextView r0 = r7.rewindButtonTextView
            if (r0 == 0) goto L1a
            java.lang.String r2 = java.lang.String.valueOf(r1)
            r0.setText(r2)
        L1a:
            android.view.View r0 = r7.rewindButton
            if (r0 == 0) goto L33
            android.content.res.Resources r2 = r7.resources
            int r3 = com.google.android.exoplayer2.ui.R.plurals.exo_controls_rewind_by_amount_description
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r4[r5] = r6
            java.lang.String r1 = r2.getQuantityString(r3, r1, r4)
            r0.setContentDescription(r1)
        L33:
            return
    }

    private void updateSettingsButton() {
            r2 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingsAdapter r0 = r2.settingsAdapter
            boolean r0 = r0.hasSettingsToShow()
            android.view.View r1 = r2.settingsButton
            r2.updateButton(r0, r1)
            return
    }

    private void updateSettingsWindowSize() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.settingsView
            r1 = 0
            r0.measure(r1, r1)
            int r0 = r2.getWidth()
            int r1 = r2.settingsWindowMargin
            int r1 = r1 * 2
            int r0 = r0 - r1
            androidx.recyclerview.widget.RecyclerView r1 = r2.settingsView
            int r1 = r1.getMeasuredWidth()
            int r0 = java.lang.Math.min(r1, r0)
            android.widget.PopupWindow r1 = r2.settingsWindow
            r1.setWidth(r0)
            int r0 = r2.getHeight()
            int r1 = r2.settingsWindowMargin
            int r1 = r1 * 2
            int r0 = r0 - r1
            androidx.recyclerview.widget.RecyclerView r1 = r2.settingsView
            int r1 = r1.getMeasuredHeight()
            int r0 = java.lang.Math.min(r0, r1)
            android.widget.PopupWindow r1 = r2.settingsWindow
            r1.setHeight(r0)
            return
    }

    private void updateShuffleButton() {
            r3 = this;
            boolean r0 = r3.isVisible()
            if (r0 == 0) goto L65
            boolean r0 = r3.isAttachedToWindow
            if (r0 == 0) goto L65
            android.widget.ImageView r0 = r3.shuffleButton
            if (r0 != 0) goto Lf
            goto L65
        Lf:
            com.google.android.exoplayer2.Player r1 = r3.player
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r2 = r3.controlViewLayoutManager
            boolean r0 = r2.getShowButton(r0)
            r2 = 0
            if (r0 != 0) goto L20
            android.widget.ImageView r0 = r3.shuffleButton
            r3.updateButton(r2, r0)
            goto L65
        L20:
            if (r1 == 0) goto L52
            r0 = 14
            boolean r0 = r1.isCommandAvailable(r0)
            if (r0 != 0) goto L2b
            goto L52
        L2b:
            r0 = 1
            android.widget.ImageView r2 = r3.shuffleButton
            r3.updateButton(r0, r2)
            android.widget.ImageView r0 = r3.shuffleButton
            boolean r2 = r1.getShuffleModeEnabled()
            if (r2 == 0) goto L3c
            android.graphics.drawable.Drawable r2 = r3.shuffleOnButtonDrawable
            goto L3e
        L3c:
            android.graphics.drawable.Drawable r2 = r3.shuffleOffButtonDrawable
        L3e:
            r0.setImageDrawable(r2)
            android.widget.ImageView r0 = r3.shuffleButton
            boolean r1 = r1.getShuffleModeEnabled()
            if (r1 == 0) goto L4c
            java.lang.String r1 = r3.shuffleOnContentDescription
            goto L4e
        L4c:
            java.lang.String r1 = r3.shuffleOffContentDescription
        L4e:
            r0.setContentDescription(r1)
            goto L65
        L52:
            android.widget.ImageView r0 = r3.shuffleButton
            r3.updateButton(r2, r0)
            android.widget.ImageView r0 = r3.shuffleButton
            android.graphics.drawable.Drawable r1 = r3.shuffleOffButtonDrawable
            r0.setImageDrawable(r1)
            android.widget.ImageView r0 = r3.shuffleButton
            java.lang.String r1 = r3.shuffleOffContentDescription
            r0.setContentDescription(r1)
        L65:
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
            if (r2 == 0) goto L16
            com.google.android.exoplayer2.Timeline$Window r2 = r0.window
            boolean r2 = canShowMultiWindowTimeBar(r1, r2)
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            r0.multiWindowTimeBar = r2
            r5 = 0
            r0.currentWindowOffset = r5
            r2 = 17
            boolean r2 = r1.isCommandAvailable(r2)
            if (r2 == 0) goto L2a
            com.google.android.exoplayer2.Timeline r2 = r1.getCurrentTimeline()
            goto L2c
        L2a:
            com.google.android.exoplayer2.Timeline r2 = com.google.android.exoplayer2.Timeline.EMPTY
        L2c:
            boolean r7 = r2.isEmpty()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 != 0) goto Lff
            int r1 = r1.getCurrentMediaItemIndex()
            boolean r7 = r0.multiWindowTimeBar
            if (r7 == 0) goto L41
            r10 = 0
            goto L42
        L41:
            r10 = r1
        L42:
            if (r7 == 0) goto L4a
            int r7 = r2.getWindowCount()
            int r7 = r7 - r4
            goto L4b
        L4a:
            r7 = r1
        L4b:
            r11 = r5
            r13 = 0
        L4d:
            if (r10 > r7) goto Lfd
            if (r10 != r1) goto L57
            long r14 = com.google.android.exoplayer2.util.Util.usToMs(r11)
            r0.currentWindowOffset = r14
        L57:
            com.google.android.exoplayer2.Timeline$Window r14 = r0.window
            r2.getWindow(r10, r14)
            com.google.android.exoplayer2.Timeline$Window r14 = r0.window
            long r5 = r14.durationUs
            int r17 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r17 != 0) goto L6c
            boolean r1 = r0.multiWindowTimeBar
            r1 = r1 ^ r4
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            goto Lfd
        L6c:
            int r5 = r14.firstPeriodIndex
        L6e:
            com.google.android.exoplayer2.Timeline$Window r6 = r0.window
            int r14 = r6.lastPeriodIndex
            if (r5 > r14) goto Lee
            com.google.android.exoplayer2.Timeline$Period r6 = r0.period
            r2.getPeriod(r5, r6)
            com.google.android.exoplayer2.Timeline$Period r6 = r0.period
            int r6 = r6.getRemovedAdGroupCount()
            com.google.android.exoplayer2.Timeline$Period r14 = r0.period
            int r14 = r14.getAdGroupCount()
        L85:
            if (r6 >= r14) goto Le5
            com.google.android.exoplayer2.Timeline$Period r4 = r0.period
            long r18 = r4.getAdGroupTimeUs(r6)
            r20 = -9223372036854775808
            int r4 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r4 != 0) goto L9e
            com.google.android.exoplayer2.Timeline$Period r4 = r0.period
            long r3 = r4.durationUs
            int r18 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r18 != 0) goto L9c
            goto Ldc
        L9c:
            r18 = r3
        L9e:
            com.google.android.exoplayer2.Timeline$Period r3 = r0.period
            long r3 = r3.getPositionInWindowUs()
            long r3 = r3 + r18
            r15 = 0
            int r18 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r18 < 0) goto Ldc
            long[] r15 = r0.adGroupTimesMs
            int r8 = r15.length
            if (r13 != r8) goto Lc7
            int r8 = r15.length
            if (r8 != 0) goto Lb6
            r8 = 1
            goto Lb9
        Lb6:
            int r8 = r15.length
            int r8 = r8 * 2
        Lb9:
            long[] r9 = java.util.Arrays.copyOf(r15, r8)
            r0.adGroupTimesMs = r9
            boolean[] r9 = r0.playedAdGroups
            boolean[] r8 = java.util.Arrays.copyOf(r9, r8)
            r0.playedAdGroups = r8
        Lc7:
            long[] r8 = r0.adGroupTimesMs
            long r3 = r3 + r11
            long r3 = com.google.android.exoplayer2.util.Util.usToMs(r3)
            r8[r13] = r3
            boolean[] r3 = r0.playedAdGroups
            com.google.android.exoplayer2.Timeline$Period r4 = r0.period
            boolean r4 = r4.hasPlayedAdGroup(r6)
            r3[r13] = r4
            int r13 = r13 + 1
        Ldc:
            int r6 = r6 + 1
            r4 = 1
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L85
        Le5:
            int r5 = r5 + 1
            r4 = 1
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L6e
        Lee:
            long r3 = r6.durationUs
            long r11 = r11 + r3
            int r10 = r10 + 1
            r4 = 1
            r5 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L4d
        Lfd:
            r5 = r11
            goto L11c
        Lff:
            r2 = 16
            boolean r2 = r1.isCommandAvailable(r2)
            if (r2 == 0) goto L119
            long r1 = r1.getContentDuration()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L119
            long r5 = com.google.android.exoplayer2.util.Util.msToUs(r1)
            goto L11b
        L119:
            r5 = 0
        L11b:
            r13 = 0
        L11c:
            long r1 = com.google.android.exoplayer2.util.Util.usToMs(r5)
            android.widget.TextView r3 = r0.durationView
            if (r3 == 0) goto L12f
            java.lang.StringBuilder r4 = r0.formatBuilder
            java.util.Formatter r5 = r0.formatter
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.getStringForTime(r4, r5, r1)
            r3.setText(r4)
        L12f:
            com.google.android.exoplayer2.ui.TimeBar r3 = r0.timeBar
            if (r3 == 0) goto L166
            r3.setDuration(r1)
            long[] r1 = r0.extraAdGroupTimesMs
            int r1 = r1.length
            int r2 = r13 + r1
            long[] r3 = r0.adGroupTimesMs
            int r4 = r3.length
            if (r2 <= r4) goto L14e
            long[] r3 = java.util.Arrays.copyOf(r3, r2)
            r0.adGroupTimesMs = r3
            boolean[] r3 = r0.playedAdGroups
            boolean[] r3 = java.util.Arrays.copyOf(r3, r2)
            r0.playedAdGroups = r3
        L14e:
            long[] r3 = r0.extraAdGroupTimesMs
            long[] r4 = r0.adGroupTimesMs
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r4, r13, r1)
            boolean[] r3 = r0.extraPlayedAdGroups
            boolean[] r4 = r0.playedAdGroups
            java.lang.System.arraycopy(r3, r5, r4, r13, r1)
            com.google.android.exoplayer2.ui.TimeBar r1 = r0.timeBar
            long[] r3 = r0.adGroupTimesMs
            boolean[] r4 = r0.playedAdGroups
            r1.setAdGroupTimesMs(r3, r4, r2)
        L166:
            r22.updateProgress()
            return
    }

    private void updateTrackLists() {
            r2 = this;
            r2.initTrackSelectionAdapter()
            com.google.android.exoplayer2.ui.StyledPlayerControlView$TextTrackSelectionAdapter r0 = r2.textTrackSelectionAdapter
            int r0 = r0.getItemCount()
            if (r0 <= 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            android.widget.ImageView r1 = r2.subtitleButton
            r2.updateButton(r0, r1)
            r2.updateSettingsButton()
            return
    }

    @java.lang.Deprecated
    public void addVisibilityListener(com.google.android.exoplayer2.ui.StyledPlayerControlView.VisibilityListener r2) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.ui.StyledPlayerControlView$VisibilityListener> r0 = r1.visibilityListeners
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
            if (r1 == 0) goto L80
            boolean r2 = isHandledMediaKey(r0)
            if (r2 != 0) goto L10
            goto L80
        L10:
            int r2 = r4.getAction()
            if (r2 != 0) goto L7e
            r2 = 90
            if (r0 != r2) goto L2d
            int r4 = r1.getPlaybackState()
            r0 = 4
            if (r4 == r0) goto L7e
            r4 = 12
            boolean r4 = r1.isCommandAvailable(r4)
            if (r4 == 0) goto L7e
            r1.seekForward()
            goto L7e
        L2d:
            r2 = 89
            if (r0 != r2) goto L3d
            r2 = 11
            boolean r2 = r1.isCommandAvailable(r2)
            if (r2 == 0) goto L3d
            r1.seekBack()
            goto L7e
        L3d:
            int r4 = r4.getRepeatCount()
            if (r4 != 0) goto L7e
            r4 = 79
            if (r0 == r4) goto L7b
            r4 = 85
            if (r0 == r4) goto L7b
            r4 = 87
            if (r0 == r4) goto L6f
            r4 = 88
            if (r0 == r4) goto L64
            r4 = 126(0x7e, float:1.77E-43)
            if (r0 == r4) goto L60
            r4 = 127(0x7f, float:1.78E-43)
            if (r0 == r4) goto L5c
            goto L7e
        L5c:
            r3.dispatchPause(r1)
            goto L7e
        L60:
            r3.dispatchPlay(r1)
            goto L7e
        L64:
            r4 = 7
            boolean r4 = r1.isCommandAvailable(r4)
            if (r4 == 0) goto L7e
            r1.seekToPrevious()
            goto L7e
        L6f:
            r4 = 9
            boolean r4 = r1.isCommandAvailable(r4)
            if (r4 == 0) goto L7e
            r1.seekToNext()
            goto L7e
        L7b:
            r3.dispatchPlayPause(r1)
        L7e:
            r4 = 1
            return r4
        L80:
            r4 = 0
            return r4
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
            r2 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r2.controlViewLayoutManager
            android.widget.ImageView r1 = r2.shuffleButton
            boolean r0 = r0.getShowButton(r1)
            return r0
    }

    public boolean getShowSubtitleButton() {
            r2 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r2.controlViewLayoutManager
            android.widget.ImageView r1 = r2.subtitleButton
            boolean r0 = r0.getShowButton(r1)
            return r0
    }

    public int getShowTimeoutMs() {
            r1 = this;
            int r0 = r1.showTimeoutMs
            return r0
    }

    public boolean getShowVrButton() {
            r2 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r2.controlViewLayoutManager
            android.view.View r1 = r2.vrButton
            boolean r0 = r0.getShowButton(r1)
            return r0
    }

    public void hide() {
            r1 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            r0.hide()
            return
    }

    public void hideImmediately() {
            r1 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            r0.hideImmediately()
            return
    }

    public boolean isAnimationEnabled() {
            r1 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            boolean r0 = r0.isAnimationEnabled()
            return r0
    }

    public boolean isFullyVisible() {
            r1 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            boolean r0 = r0.isFullyVisible()
            return r0
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

    public final void notifyOnVisibilityChange() {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.ui.StyledPlayerControlView$VisibilityListener> r0 = r3.visibilityListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.ui.StyledPlayerControlView$VisibilityListener r1 = (com.google.android.exoplayer2.ui.StyledPlayerControlView.VisibilityListener) r1
            int r2 = r3.getVisibility()
            r1.onVisibilityChange(r2)
            goto L6
        L1a:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            r0.onAttachedToWindow()
            r0 = 1
            r1.isAttachedToWindow = r0
            boolean r0 = r1.isFullyVisible()
            if (r0 == 0) goto L16
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            r0.resetHideCallbacks()
        L16:
            r1.updateAll()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            r0.onDetachedFromWindow()
            r0 = 0
            r1.isAttachedToWindow = r0
            java.lang.Runnable r0 = r1.updateProgressAction
            r1.removeCallbacks(r0)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            r0.removeHideCallbacks()
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r6.controlViewLayoutManager
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.onLayout(r1, r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public void removeVisibilityListener(com.google.android.exoplayer2.ui.StyledPlayerControlView.VisibilityListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.ui.StyledPlayerControlView$VisibilityListener> r0 = r1.visibilityListeners
            r0.remove(r2)
            return
    }

    public final void requestPlayPauseFocus() {
            r1 = this;
            android.view.View r0 = r1.playPauseButton
            if (r0 == 0) goto L7
            r0.requestFocus()
        L7:
            return
    }

    public void setAnimationEnabled(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            r0.setAnimationEnabled(r2)
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

    @java.lang.Deprecated
    public void setOnFullScreenModeChangedListener(@androidx.annotation.Nullable com.google.android.exoplayer2.ui.StyledPlayerControlView.OnFullScreenModeChangedListener r5) {
            r4 = this;
            r4.onFullScreenModeChangedListener = r5
            android.widget.ImageView r0 = r4.fullScreenButton
            r1 = 1
            r2 = 0
            if (r5 == 0) goto La
            r3 = 1
            goto Lb
        La:
            r3 = 0
        Lb:
            updateFullScreenButtonVisibility(r0, r3)
            android.widget.ImageView r0 = r4.minimalFullScreenButton
            if (r5 == 0) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            updateFullScreenButtonVisibility(r0, r1)
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
            com.google.android.exoplayer2.ui.StyledPlayerControlView$ComponentListener r1 = r4.componentListener
            r0.removeListener(r1)
        L2f:
            r4.player = r5
            if (r5 == 0) goto L38
            com.google.android.exoplayer2.ui.StyledPlayerControlView$ComponentListener r0 = r4.componentListener
            r5.addListener(r0)
        L38:
            r4.updateAll()
            return
    }

    public void setProgressUpdateListener(@androidx.annotation.Nullable com.google.android.exoplayer2.ui.StyledPlayerControlView.ProgressUpdateListener r1) {
            r0 = this;
            r0.progressUpdateListener = r1
            return
    }

    public void setRepeatToggleModes(int r5) {
            r4 = this;
            r4.repeatToggleModes = r5
            com.google.android.exoplayer2.Player r0 = r4.player
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L34
            r3 = 15
            boolean r0 = r0.isCommandAvailable(r3)
            if (r0 == 0) goto L34
            com.google.android.exoplayer2.Player r0 = r4.player
            int r0 = r0.getRepeatMode()
            if (r5 != 0) goto L20
            if (r0 == 0) goto L20
            com.google.android.exoplayer2.Player r0 = r4.player
            r0.setRepeatMode(r1)
            goto L34
        L20:
            r3 = 2
            if (r5 != r2) goto L2b
            if (r0 != r3) goto L2b
            com.google.android.exoplayer2.Player r0 = r4.player
            r0.setRepeatMode(r2)
            goto L34
        L2b:
            if (r5 != r3) goto L34
            if (r0 != r2) goto L34
            com.google.android.exoplayer2.Player r0 = r4.player
            r0.setRepeatMode(r3)
        L34:
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r4.controlViewLayoutManager
            android.widget.ImageView r3 = r4.repeatToggleButton
            if (r5 == 0) goto L3b
            r1 = 1
        L3b:
            r0.setShowButton(r3, r1)
            r4.updateRepeatModeButton()
            return
    }

    public void setShowFastForwardButton(boolean r3) {
            r2 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r2.controlViewLayoutManager
            android.view.View r1 = r2.fastForwardButton
            r0.setShowButton(r1, r3)
            r2.updateNavigation()
            return
    }

    public void setShowMultiWindowTimeBar(boolean r1) {
            r0 = this;
            r0.showMultiWindowTimeBar = r1
            r0.updateTimeline()
            return
    }

    public void setShowNextButton(boolean r3) {
            r2 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r2.controlViewLayoutManager
            android.view.View r1 = r2.nextButton
            r0.setShowButton(r1, r3)
            r2.updateNavigation()
            return
    }

    public void setShowPreviousButton(boolean r3) {
            r2 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r2.controlViewLayoutManager
            android.view.View r1 = r2.previousButton
            r0.setShowButton(r1, r3)
            r2.updateNavigation()
            return
    }

    public void setShowRewindButton(boolean r3) {
            r2 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r2.controlViewLayoutManager
            android.view.View r1 = r2.rewindButton
            r0.setShowButton(r1, r3)
            r2.updateNavigation()
            return
    }

    public void setShowShuffleButton(boolean r3) {
            r2 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r2.controlViewLayoutManager
            android.widget.ImageView r1 = r2.shuffleButton
            r0.setShowButton(r1, r3)
            r2.updateShuffleButton()
            return
    }

    public void setShowSubtitleButton(boolean r3) {
            r2 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r2.controlViewLayoutManager
            android.widget.ImageView r1 = r2.subtitleButton
            r0.setShowButton(r1, r3)
            return
    }

    public void setShowTimeoutMs(int r1) {
            r0 = this;
            r0.showTimeoutMs = r1
            boolean r1 = r0.isFullyVisible()
            if (r1 == 0) goto Ld
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r1 = r0.controlViewLayoutManager
            r1.resetHideCallbacks()
        Ld:
            return
    }

    public void setShowVrButton(boolean r3) {
            r2 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r2.controlViewLayoutManager
            android.view.View r1 = r2.vrButton
            r0.setShowButton(r1, r3)
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

    public void setVrButtonListener(@androidx.annotation.Nullable android.view.View.OnClickListener r2) {
            r1 = this;
            android.view.View r0 = r1.vrButton
            if (r0 == 0) goto L11
            r0.setOnClickListener(r2)
            if (r2 == 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            android.view.View r0 = r1.vrButton
            r1.updateButton(r2, r0)
        L11:
            return
    }

    public void show() {
            r1 = this;
            com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager r0 = r1.controlViewLayoutManager
            r0.show()
            return
    }

    public final void updateAll() {
            r0 = this;
            r0.updatePlayPauseButton()
            r0.updateNavigation()
            r0.updateRepeatModeButton()
            r0.updateShuffleButton()
            r0.updateTrackLists()
            r0.updatePlaybackSpeedList()
            r0.updateTimeline()
            return
    }
}
