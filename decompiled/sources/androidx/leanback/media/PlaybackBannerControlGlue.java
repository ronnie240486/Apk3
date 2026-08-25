package androidx.leanback.media;

import androidx.leanback.media.PlayerAdapter;

/* JADX INFO: loaded from: classes.dex */
public class PlaybackBannerControlGlue<T extends androidx.leanback.media.PlayerAdapter> extends androidx.leanback.media.PlaybackBaseControlGlue<T> {
    public static final int ACTION_CUSTOM_LEFT_FIRST = 1;
    public static final int ACTION_CUSTOM_RIGHT_FIRST = 4096;
    public static final int ACTION_FAST_FORWARD = 128;
    public static final int ACTION_PLAY_PAUSE = 64;
    public static final int ACTION_REWIND = 32;
    public static final int ACTION_SKIP_TO_NEXT = 256;
    public static final int ACTION_SKIP_TO_PREVIOUS = 16;
    private static final int NUMBER_OF_SEEK_SPEEDS = 5;
    public static final int PLAYBACK_SPEED_FAST_L0 = 10;
    public static final int PLAYBACK_SPEED_FAST_L1 = 11;
    public static final int PLAYBACK_SPEED_FAST_L2 = 12;
    public static final int PLAYBACK_SPEED_FAST_L3 = 13;
    public static final int PLAYBACK_SPEED_FAST_L4 = 14;
    public static final int PLAYBACK_SPEED_INVALID = -1;
    public static final int PLAYBACK_SPEED_NORMAL = 1;
    public static final int PLAYBACK_SPEED_PAUSED = 0;
    private static final java.lang.String TAG = null;
    private androidx.leanback.widget.PlaybackControlsRow.FastForwardAction mFastForwardAction;
    private final int[] mFastForwardSpeeds;
    private boolean mIsCustomizedFastForwardSupported;
    private boolean mIsCustomizedRewindSupported;
    private int mPlaybackSpeed;
    private androidx.leanback.widget.PlaybackControlsRow.RewindAction mRewindAction;
    private final int[] mRewindSpeeds;
    private androidx.leanback.widget.PlaybackControlsRow.SkipNextAction mSkipNextAction;
    private androidx.leanback.widget.PlaybackControlsRow.SkipPreviousAction mSkipPreviousAction;
    private long mStartPosition;
    private long mStartTime;



    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ACTION_ {
    }

    static {
            java.lang.Class<androidx.leanback.media.PlaybackBannerControlGlue> r0 = androidx.leanback.media.PlaybackBannerControlGlue.class
            java.lang.String r0 = "PlaybackBannerControlGlue"
            androidx.leanback.media.PlaybackBannerControlGlue.TAG = r0
            return
    }

    public PlaybackBannerControlGlue(android.content.Context r1, int[] r2, T r3) {
            r0 = this;
            r0.<init>(r1, r2, r2, r3)
            return
    }

    public PlaybackBannerControlGlue(android.content.Context r5, int[] r6, int[] r7, T r8) {
            r4 = this;
            r4.<init>(r5, r8)
            r5 = 0
            r4.mPlaybackSpeed = r5
            r0 = 0
            r4.mStartPosition = r0
            int r5 = r6.length
            if (r5 == 0) goto L43
            int r5 = r6.length
            r8 = 5
            if (r5 > r8) goto L43
            r4.mFastForwardSpeeds = r6
            int r5 = r7.length
            if (r5 == 0) goto L3b
            int r5 = r7.length
            if (r5 > r8) goto L3b
            r4.mRewindSpeeds = r7
            T extends androidx.leanback.media.PlayerAdapter r5 = r4.mPlayerAdapter
            long r5 = r5.getSupportedActions()
            r7 = 128(0x80, double:6.3E-322)
            long r5 = r5 & r7
            r7 = 1
            int r8 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r8 == 0) goto L2b
            r4.mIsCustomizedFastForwardSupported = r7
        L2b:
            T extends androidx.leanback.media.PlayerAdapter r5 = r4.mPlayerAdapter
            long r5 = r5.getSupportedActions()
            r2 = 32
            long r5 = r5 & r2
            int r8 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r8 == 0) goto L3a
            r4.mIsCustomizedRewindSupported = r7
        L3a:
            return
        L3b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "invalid rewindSpeeds array size"
            r5.<init>(r6)
            throw r5
        L43:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "invalid fastForwardSpeeds array size"
            r5.<init>(r6)
            throw r5
    }

    private void decrementRewindPlaybackSpeed() {
            r1 = this;
            int r0 = r1.mPlaybackSpeed
            switch(r0) {
                case -13: goto La;
                case -12: goto La;
                case -11: goto La;
                case -10: goto La;
                default: goto L5;
            }
        L5:
            r0 = -10
            r1.mPlaybackSpeed = r0
            goto Le
        La:
            int r0 = r0 + (-1)
            r1.mPlaybackSpeed = r0
        Le:
            return
    }

    private void fakePause() {
            r2 = this;
            r0 = 1
            r2.mIsPlaying = r0
            long r0 = r2.getCurrentPosition()
            r2.mStartPosition = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.mStartTime = r0
            super.pause()
            r2.onUpdatePlaybackState()
            return
    }

    private int getMaxForwardSpeedId() {
            r1 = this;
            int[] r0 = r1.mFastForwardSpeeds
            int r0 = r0.length
            int r0 = r0 + (-1)
            int r0 = r0 + 10
            return r0
    }

    private int getMaxRewindSpeedId() {
            r1 = this;
            int[] r0 = r1.mRewindSpeeds
            int r0 = r0.length
            int r0 = r0 + (-1)
            int r0 = r0 + 10
            return r0
    }

    private void incrementFastForwardPlaybackSpeed() {
            r1 = this;
            int r0 = r1.mPlaybackSpeed
            switch(r0) {
                case 10: goto La;
                case 11: goto La;
                case 12: goto La;
                case 13: goto La;
                default: goto L5;
            }
        L5:
            r0 = 10
            r1.mPlaybackSpeed = r0
            goto Le
        La:
            int r0 = r0 + 1
            r1.mPlaybackSpeed = r0
        Le:
            return
    }

    private void updatePlaybackState(boolean r7) {
            r6 = this;
            androidx.leanback.widget.PlaybackControlsRow r0 = r6.mControlsRow
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L12
            r6.onUpdateProgress()
            T extends androidx.leanback.media.PlayerAdapter r2 = r6.mPlayerAdapter
            r2.setProgressUpdatingEnabled(r0)
            goto L17
        L12:
            T extends androidx.leanback.media.PlayerAdapter r2 = r6.mPlayerAdapter
            r2.setProgressUpdatingEnabled(r1)
        L17:
            boolean r2 = r6.mFadeWhenPlaying
            if (r2 == 0) goto L28
            androidx.leanback.media.PlaybackGlueHost r2 = r6.getHost()
            if (r2 == 0) goto L28
            androidx.leanback.media.PlaybackGlueHost r2 = r6.getHost()
            r2.setControlsOverlayAutoHideEnabled(r7)
        L28:
            androidx.leanback.widget.PlaybackControlsRow r2 = r6.getControlsRow()
            androidx.leanback.widget.ObjectAdapter r2 = r2.getPrimaryActionsAdapter()
            androidx.leanback.widget.ArrayObjectAdapter r2 = (androidx.leanback.widget.ArrayObjectAdapter) r2
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r3 = r6.mPlayPauseAction
            if (r3 == 0) goto L46
            int r3 = r3.getIndex()
            if (r3 == r7) goto L46
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r3 = r6.mPlayPauseAction
            r3.setIndex(r7)
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r7 = r6.mPlayPauseAction
            androidx.leanback.media.PlaybackBaseControlGlue.notifyItemChanged(r2, r7)
        L46:
            androidx.leanback.widget.PlaybackControlsRow$FastForwardAction r7 = r6.mFastForwardAction
            r3 = 10
            if (r7 == 0) goto L64
            int r4 = r6.mPlaybackSpeed
            if (r4 < r3) goto L53
            int r4 = r4 - r3
            int r4 = r4 + r1
            goto L54
        L53:
            r4 = 0
        L54:
            int r7 = r7.getIndex()
            if (r7 == r4) goto L64
            androidx.leanback.widget.PlaybackControlsRow$FastForwardAction r7 = r6.mFastForwardAction
            r7.setIndex(r4)
            androidx.leanback.widget.PlaybackControlsRow$FastForwardAction r7 = r6.mFastForwardAction
            androidx.leanback.media.PlaybackBaseControlGlue.notifyItemChanged(r2, r7)
        L64:
            androidx.leanback.widget.PlaybackControlsRow$RewindAction r7 = r6.mRewindAction
            if (r7 == 0) goto L81
            int r4 = r6.mPlaybackSpeed
            r5 = -10
            if (r4 > r5) goto L71
            int r0 = -r4
            int r0 = r0 - r3
            int r0 = r0 + r1
        L71:
            int r7 = r7.getIndex()
            if (r7 == r0) goto L81
            androidx.leanback.widget.PlaybackControlsRow$RewindAction r7 = r6.mRewindAction
            r7.setIndex(r0)
            androidx.leanback.widget.PlaybackControlsRow$RewindAction r7 = r6.mRewindAction
            androidx.leanback.media.PlaybackBaseControlGlue.notifyItemChanged(r2, r7)
        L81:
            return
    }

    public final boolean dispatchAction(androidx.leanback.widget.Action r5, android.view.KeyEvent r6) {
            r4 = this;
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r0 = r4.mPlayPauseAction
            r1 = 0
            r2 = 1
            if (r5 != r0) goto L49
            r5 = 85
            if (r6 == 0) goto L1b
            int r0 = r6.getKeyCode()
            if (r0 == r5) goto L1b
            int r0 = r6.getKeyCode()
            r3 = 126(0x7e, float:1.77E-43)
            if (r0 != r3) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            if (r6 == 0) goto L2c
            int r3 = r6.getKeyCode()
            if (r3 == r5) goto L2c
            int r5 = r6.getKeyCode()
            r6 = 127(0x7f, float:1.78E-43)
            if (r5 != r6) goto L2d
        L2c:
            r1 = 1
        L2d:
            if (r1 == 0) goto L3c
            int r5 = r4.mPlaybackSpeed
            if (r0 == 0) goto L36
            if (r5 != r2) goto L3c
            goto L38
        L36:
            if (r5 == 0) goto L3c
        L38:
            r4.pause()
            goto L45
        L3c:
            if (r0 == 0) goto L45
            int r5 = r4.mPlaybackSpeed
            if (r5 == r2) goto L45
            r4.play()
        L45:
            r4.onUpdatePlaybackStatusAfterUserAction()
            goto L50
        L49:
            androidx.leanback.widget.PlaybackControlsRow$SkipNextAction r6 = r4.mSkipNextAction
            if (r5 != r6) goto L52
            r4.next()
        L50:
            r1 = 1
            goto Laf
        L52:
            androidx.leanback.widget.PlaybackControlsRow$SkipPreviousAction r6 = r4.mSkipPreviousAction
            if (r5 != r6) goto L5a
            r4.previous()
            goto L50
        L5a:
            androidx.leanback.widget.PlaybackControlsRow$FastForwardAction r6 = r4.mFastForwardAction
            if (r5 != r6) goto L84
            T extends androidx.leanback.media.PlayerAdapter r5 = r4.mPlayerAdapter
            boolean r5 = r5.isPrepared()
            if (r5 == 0) goto L50
            int r5 = r4.mPlaybackSpeed
            int r6 = r4.getMaxForwardSpeedId()
            if (r5 >= r6) goto L50
            boolean r5 = r4.mIsCustomizedFastForwardSupported
            if (r5 == 0) goto L7a
            r4.mIsPlaying = r2
            T extends androidx.leanback.media.PlayerAdapter r5 = r4.mPlayerAdapter
            r5.fastForward()
            goto L7d
        L7a:
            r4.fakePause()
        L7d:
            r4.incrementFastForwardPlaybackSpeed()
            r4.onUpdatePlaybackStatusAfterUserAction()
            goto L50
        L84:
            androidx.leanback.widget.PlaybackControlsRow$RewindAction r6 = r4.mRewindAction
            if (r5 != r6) goto Laf
            T extends androidx.leanback.media.PlayerAdapter r5 = r4.mPlayerAdapter
            boolean r5 = r5.isPrepared()
            if (r5 == 0) goto L50
            int r5 = r4.mPlaybackSpeed
            int r6 = r4.getMaxRewindSpeedId()
            int r6 = -r6
            if (r5 <= r6) goto L50
            boolean r5 = r4.mIsCustomizedFastForwardSupported
            if (r5 == 0) goto La5
            r4.mIsPlaying = r2
            T extends androidx.leanback.media.PlayerAdapter r5 = r4.mPlayerAdapter
            r5.rewind()
            goto La8
        La5:
            r4.fakePause()
        La8:
            r4.decrementRewindPlaybackSpeed()
            r4.onUpdatePlaybackStatusAfterUserAction()
            goto L50
        Laf:
            return r1
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public long getCurrentPosition() {
            r8 = this;
            int r0 = r8.mPlaybackSpeed
            if (r0 == 0) goto L75
            r1 = 1
            if (r0 != r1) goto L8
            goto L75
        L8:
            r1 = 10
            if (r0 < r1) goto L1f
            boolean r2 = r8.mIsCustomizedFastForwardSupported
            if (r2 == 0) goto L17
            T extends androidx.leanback.media.PlayerAdapter r0 = r8.mPlayerAdapter
            long r0 = r0.getCurrentPosition()
            return r0
        L17:
            int r0 = r0 - r1
            int[] r1 = r8.getFastForwardSpeeds()
            r0 = r1[r0]
            goto L37
        L1f:
            r2 = -10
            if (r0 > r2) goto L72
            boolean r2 = r8.mIsCustomizedRewindSupported
            if (r2 == 0) goto L2e
            T extends androidx.leanback.media.PlayerAdapter r0 = r8.mPlayerAdapter
            long r0 = r0.getCurrentPosition()
            return r0
        L2e:
            int r0 = -r0
            int r0 = r0 - r1
            int[] r1 = r8.getRewindSpeeds()
            r0 = r1[r0]
            int r0 = -r0
        L37:
            long r1 = r8.mStartPosition
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r8.mStartTime
            long r3 = r3 - r5
            long r5 = (long) r0
            long r3 = r3 * r5
            long r3 = r3 + r1
            long r0 = r8.getDuration()
            r2 = 0
            r5 = 0
            int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r7 <= 0) goto L60
            r8.mPlaybackSpeed = r2
            long r3 = r8.getDuration()
            T extends androidx.leanback.media.PlayerAdapter r0 = r8.mPlayerAdapter
            r0.seekTo(r3)
            r8.mStartPosition = r5
            r8.pause()
            goto L71
        L60:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L71
            r8.mPlaybackSpeed = r2
            T extends androidx.leanback.media.PlayerAdapter r0 = r8.mPlayerAdapter
            r0.seekTo(r5)
            r8.mStartPosition = r5
            r8.pause()
            r3 = r5
        L71:
            return r3
        L72:
            r0 = -1
            return r0
        L75:
            T extends androidx.leanback.media.PlayerAdapter r0 = r8.mPlayerAdapter
            long r0 = r0.getCurrentPosition()
            return r0
    }

    @androidx.annotation.NonNull
    public int[] getFastForwardSpeeds() {
            r1 = this;
            int[] r0 = r1.mFastForwardSpeeds
            return r0
    }

    @androidx.annotation.NonNull
    public int[] getRewindSpeeds() {
            r1 = this;
            int[] r0 = r1.mRewindSpeeds
            return r0
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue, androidx.leanback.widget.OnActionClickedListener
    public void onActionClicked(androidx.leanback.widget.Action r2) {
            r1 = this;
            r0 = 0
            r1.dispatchAction(r2, r0)
            return
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public final void onCreatePrimaryActions(androidx.leanback.widget.ArrayObjectAdapter r9) {
            r8 = this;
            long r0 = r8.getSupportedActions()
            r2 = 16
            long r2 = r2 & r0
            r4 = 0
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L21
            androidx.leanback.widget.PlaybackControlsRow$SkipPreviousAction r2 = r8.mSkipPreviousAction
            if (r2 != 0) goto L21
            androidx.leanback.widget.PlaybackControlsRow$SkipPreviousAction r2 = new androidx.leanback.widget.PlaybackControlsRow$SkipPreviousAction
            android.content.Context r3 = r8.getContext()
            r2.<init>(r3)
            r8.mSkipPreviousAction = r2
            r9.add(r2)
            goto L2c
        L21:
            if (r7 != 0) goto L2c
            androidx.leanback.widget.PlaybackControlsRow$SkipPreviousAction r2 = r8.mSkipPreviousAction
            if (r2 == 0) goto L2c
            r9.remove(r2)
            r8.mSkipPreviousAction = r4
        L2c:
            r2 = 32
            long r2 = r2 & r0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L49
            androidx.leanback.widget.PlaybackControlsRow$RewindAction r2 = r8.mRewindAction
            if (r2 != 0) goto L49
            androidx.leanback.widget.PlaybackControlsRow$RewindAction r2 = new androidx.leanback.widget.PlaybackControlsRow$RewindAction
            android.content.Context r3 = r8.getContext()
            int[] r7 = r8.mRewindSpeeds
            int r7 = r7.length
            r2.<init>(r3, r7)
            r8.mRewindAction = r2
            r9.add(r2)
            goto L54
        L49:
            if (r7 != 0) goto L54
            androidx.leanback.widget.PlaybackControlsRow$RewindAction r2 = r8.mRewindAction
            if (r2 == 0) goto L54
            r9.remove(r2)
            r8.mRewindAction = r4
        L54:
            r2 = 64
            long r2 = r2 & r0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L79
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r2 = r8.mPlayPauseAction
            if (r2 != 0) goto L79
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r2 = new androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction
            android.content.Context r3 = r8.getContext()
            r2.<init>(r3)
            r8.mPlayPauseAction = r2
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r2 = new androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction
            android.content.Context r3 = r8.getContext()
            r2.<init>(r3)
            r8.mPlayPauseAction = r2
            r9.add(r2)
            goto L84
        L79:
            if (r7 != 0) goto L84
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r2 = r8.mPlayPauseAction
            if (r2 == 0) goto L84
            r9.remove(r2)
            r8.mPlayPauseAction = r4
        L84:
            r2 = 128(0x80, double:6.3E-322)
            long r2 = r2 & r0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto Laf
            androidx.leanback.widget.PlaybackControlsRow$FastForwardAction r2 = r8.mFastForwardAction
            if (r2 != 0) goto Laf
            androidx.leanback.widget.PlaybackControlsRow$FastForwardAction r2 = new androidx.leanback.widget.PlaybackControlsRow$FastForwardAction
            android.content.Context r3 = r8.getContext()
            int[] r7 = r8.mFastForwardSpeeds
            int r7 = r7.length
            r2.<init>(r3, r7)
            r8.mFastForwardAction = r2
            androidx.leanback.widget.PlaybackControlsRow$FastForwardAction r2 = new androidx.leanback.widget.PlaybackControlsRow$FastForwardAction
            android.content.Context r3 = r8.getContext()
            int[] r7 = r8.mFastForwardSpeeds
            int r7 = r7.length
            r2.<init>(r3, r7)
            r8.mFastForwardAction = r2
            r9.add(r2)
            goto Lba
        Laf:
            if (r7 != 0) goto Lba
            androidx.leanback.widget.PlaybackControlsRow$FastForwardAction r2 = r8.mFastForwardAction
            if (r2 == 0) goto Lba
            r9.remove(r2)
            r8.mFastForwardAction = r4
        Lba:
            r2 = 256(0x100, double:1.265E-321)
            long r0 = r0 & r2
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto Ld4
            androidx.leanback.widget.PlaybackControlsRow$SkipNextAction r0 = r8.mSkipNextAction
            if (r0 != 0) goto Ld4
            androidx.leanback.widget.PlaybackControlsRow$SkipNextAction r0 = new androidx.leanback.widget.PlaybackControlsRow$SkipNextAction
            android.content.Context r1 = r8.getContext()
            r0.<init>(r1)
            r8.mSkipNextAction = r0
            r9.add(r0)
            goto Ldf
        Ld4:
            if (r2 != 0) goto Ldf
            androidx.leanback.widget.PlaybackControlsRow$SkipNextAction r0 = r8.mSkipNextAction
            if (r0 == 0) goto Ldf
            r9.remove(r0)
            r8.mSkipNextAction = r4
        Ldf:
            return
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public final androidx.leanback.widget.PlaybackRowPresenter onCreateRowPresenter() {
            r2 = this;
            androidx.leanback.media.PlaybackBannerControlGlue$1 r0 = new androidx.leanback.media.PlaybackBannerControlGlue$1
            r0.<init>()
            androidx.leanback.media.PlaybackBannerControlGlue$2 r1 = new androidx.leanback.media.PlaybackBannerControlGlue$2
            r1.<init>(r2, r0)
            return r1
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue, android.view.View.OnKeyListener
    public boolean onKey(android.view.View r5, int r6, android.view.KeyEvent r7) {
            r4 = this;
            r5 = 111(0x6f, float:1.56E-43)
            r0 = 4
            r1 = 1
            r2 = 0
            if (r6 == r0) goto L31
            if (r6 == r5) goto L31
            switch(r6) {
                case 19: goto L31;
                case 20: goto L31;
                case 21: goto L31;
                case 22: goto L31;
                default: goto Lc;
            }
        Lc:
            androidx.leanback.widget.PlaybackControlsRow r5 = r4.mControlsRow
            androidx.leanback.widget.ObjectAdapter r5 = r5.getPrimaryActionsAdapter()
            androidx.leanback.widget.PlaybackControlsRow r0 = r4.mControlsRow
            androidx.leanback.widget.Action r5 = r0.getActionForKeyCode(r5, r6)
            if (r5 != 0) goto L24
            androidx.leanback.widget.PlaybackControlsRow r5 = r4.mControlsRow
            androidx.leanback.widget.ObjectAdapter r0 = r5.getSecondaryActionsAdapter()
            androidx.leanback.widget.Action r5 = r5.getActionForKeyCode(r0, r6)
        L24:
            if (r5 == 0) goto L30
            int r6 = r7.getAction()
            if (r6 != 0) goto L2f
            r4.dispatchAction(r5, r7)
        L2f:
            return r1
        L30:
            return r2
        L31:
            int r7 = r4.mPlaybackSpeed
            r3 = 10
            if (r7 >= r3) goto L3e
            r3 = -10
            if (r7 > r3) goto L3c
            goto L3e
        L3c:
            r7 = 0
            goto L3f
        L3e:
            r7 = 1
        L3f:
            if (r7 == 0) goto L4e
            r4.play()
            r4.onUpdatePlaybackStatusAfterUserAction()
            if (r6 == r0) goto L4d
            if (r6 != r5) goto L4c
            goto L4d
        L4c:
            r1 = 0
        L4d:
            return r1
        L4e:
            return r2
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public final void onPlayCompleted() {
            r2 = this;
            super.onPlayCompleted()
            r0 = 0
            r2.mIsPlaying = r0
            r2.mPlaybackSpeed = r0
            long r0 = r2.getCurrentPosition()
            r2.mStartPosition = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.mStartTime = r0
            r2.onUpdatePlaybackState()
            return
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public final void onPlayStateChanged() {
            r0 = this;
            r0.onUpdatePlaybackState()
            super.onPlayStateChanged()
            return
    }

    public final void onUpdatePlaybackState() {
            r1 = this;
            boolean r0 = r1.mIsPlaying
            r1.updatePlaybackState(r0)
            return
    }

    public final void onUpdatePlaybackStatusAfterUserAction() {
            r1 = this;
            boolean r0 = r1.mIsPlaying
            r1.updatePlaybackState(r0)
            return
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue, androidx.leanback.media.PlaybackGlue
    public void pause() {
            r2 = this;
            r0 = 0
            r2.mIsPlaying = r0
            r2.mPlaybackSpeed = r0
            long r0 = r2.getCurrentPosition()
            r2.mStartPosition = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.mStartTime = r0
            super.pause()
            r2.onUpdatePlaybackState()
            return
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue, androidx.leanback.media.PlaybackGlue
    public void play() {
            r5 = this;
            T extends androidx.leanback.media.PlayerAdapter r0 = r5.mPlayerAdapter
            boolean r0 = r0.isPrepared()
            if (r0 != 0) goto L9
            return
        L9:
            int r0 = r5.mPlaybackSpeed
            if (r0 != 0) goto L22
            T extends androidx.leanback.media.PlayerAdapter r0 = r5.mPlayerAdapter
            long r0 = r0.getCurrentPosition()
            T extends androidx.leanback.media.PlayerAdapter r2 = r5.mPlayerAdapter
            long r2 = r2.getDuration()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L22
            r0 = 0
            r5.mStartPosition = r0
            goto L28
        L22:
            long r0 = r5.getCurrentPosition()
            r5.mStartPosition = r0
        L28:
            long r0 = java.lang.System.currentTimeMillis()
            r5.mStartTime = r0
            r0 = 1
            r5.mIsPlaying = r0
            r5.mPlaybackSpeed = r0
            T extends androidx.leanback.media.PlayerAdapter r0 = r5.mPlayerAdapter
            long r1 = r5.mStartPosition
            r0.seekTo(r1)
            super.play()
            r5.onUpdatePlaybackState()
            return
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public void setControlsRow(androidx.leanback.widget.PlaybackControlsRow r1) {
            r0 = this;
            super.setControlsRow(r1)
            r0.onUpdatePlaybackState()
            return
    }
}
