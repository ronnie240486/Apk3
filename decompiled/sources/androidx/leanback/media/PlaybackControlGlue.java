package androidx.leanback.media;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PlaybackControlGlue extends androidx.leanback.media.PlaybackGlue implements androidx.leanback.widget.OnActionClickedListener, android.view.View.OnKeyListener {
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
    private static final int UPDATE_PLAYBACK_STATE_DELAY_MS = 2000;
    public static final android.os.Handler sHandler = null;
    private androidx.leanback.widget.PlaybackControlsRow mControlsRow;
    private androidx.leanback.widget.PlaybackRowPresenter mControlsRowPresenter;
    private boolean mFadeWhenPlaying;
    private androidx.leanback.widget.PlaybackControlsRow.FastForwardAction mFastForwardAction;
    private final int[] mFastForwardSpeeds;
    public final java.lang.ref.WeakReference<androidx.leanback.media.PlaybackControlGlue> mGlueWeakReference;
    private androidx.leanback.widget.PlaybackControlsRow.PlayPauseAction mPlayPauseAction;
    private int mPlaybackSpeed;
    private androidx.leanback.widget.PlaybackControlsRow.RewindAction mRewindAction;
    private final int[] mRewindSpeeds;
    private androidx.leanback.widget.PlaybackControlsRow.SkipNextAction mSkipNextAction;
    private androidx.leanback.widget.PlaybackControlsRow.SkipPreviousAction mSkipPreviousAction;



    /* JADX INFO: loaded from: classes.dex */
    public static class UpdatePlaybackStateHandler extends android.os.Handler {
        public UpdatePlaybackStateHandler() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 100
                if (r0 != r1) goto L15
                java.lang.Object r3 = r3.obj
                java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
                java.lang.Object r3 = r3.get()
                androidx.leanback.media.PlaybackControlGlue r3 = (androidx.leanback.media.PlaybackControlGlue) r3
                if (r3 == 0) goto L15
                r3.updatePlaybackState()
            L15:
                return
        }
    }

    static {
            androidx.leanback.media.PlaybackControlGlue$UpdatePlaybackStateHandler r0 = new androidx.leanback.media.PlaybackControlGlue$UpdatePlaybackStateHandler
            r0.<init>()
            androidx.leanback.media.PlaybackControlGlue.sHandler = r0
            return
    }

    public PlaybackControlGlue(android.content.Context r1, int[] r2) {
            r0 = this;
            r0.<init>(r1, r2, r2)
            return
    }

    public PlaybackControlGlue(android.content.Context r2, int[] r3, int[] r4) {
            r1 = this;
            r1.<init>(r2)
            r2 = 1
            r1.mPlaybackSpeed = r2
            r1.mFadeWhenPlaying = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r1.mGlueWeakReference = r2
            int r2 = r3.length
            if (r2 == 0) goto L29
            int r2 = r3.length
            r0 = 5
            if (r2 > r0) goto L29
            r1.mFastForwardSpeeds = r3
            int r2 = r4.length
            if (r2 == 0) goto L21
            int r2 = r4.length
            if (r2 > r0) goto L21
            r1.mRewindSpeeds = r4
            return
        L21:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "invalid rewindSpeeds array size"
            r2.<init>(r3)
            throw r2
        L29:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "invalid fastForwardSpeeds array size"
            r2.<init>(r3)
            throw r2
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

    private static java.lang.String getSpeedString(int r1) {
            r0 = -1
            if (r1 == r0) goto L34
            if (r1 == 0) goto L31
            r0 = 1
            if (r1 == r0) goto L2e
            switch(r1) {
                case -14: goto L2b;
                case -13: goto L28;
                case -12: goto L25;
                case -11: goto L22;
                case -10: goto L1f;
                default: goto Lb;
            }
        Lb:
            switch(r1) {
                case 10: goto L1c;
                case 11: goto L19;
                case 12: goto L16;
                case 13: goto L13;
                case 14: goto L10;
                default: goto Le;
            }
        Le:
            r1 = 0
            return r1
        L10:
            java.lang.String r1 = "PLAYBACK_SPEED_FAST_L4"
            return r1
        L13:
            java.lang.String r1 = "PLAYBACK_SPEED_FAST_L3"
            return r1
        L16:
            java.lang.String r1 = "PLAYBACK_SPEED_FAST_L2"
            return r1
        L19:
            java.lang.String r1 = "PLAYBACK_SPEED_FAST_L1"
            return r1
        L1c:
            java.lang.String r1 = "PLAYBACK_SPEED_FAST_L0"
            return r1
        L1f:
            java.lang.String r1 = "-PLAYBACK_SPEED_FAST_L0"
            return r1
        L22:
            java.lang.String r1 = "-PLAYBACK_SPEED_FAST_L1"
            return r1
        L25:
            java.lang.String r1 = "-PLAYBACK_SPEED_FAST_L2"
            return r1
        L28:
            java.lang.String r1 = "-PLAYBACK_SPEED_FAST_L3"
            return r1
        L2b:
            java.lang.String r1 = "-PLAYBACK_SPEED_FAST_L4"
            return r1
        L2e:
            java.lang.String r1 = "PLAYBACK_SPEED_NORMAL"
            return r1
        L31:
            java.lang.String r1 = "PLAYBACK_SPEED_PAUSED"
            return r1
        L34:
            java.lang.String r1 = "PLAYBACK_SPEED_INVALID"
            return r1
    }

    private static void notifyItemChanged(androidx.leanback.widget.SparseArrayObjectAdapter r1, java.lang.Object r2) {
            int r2 = r1.indexOf(r2)
            if (r2 < 0) goto La
            r0 = 1
            r1.notifyArrayItemRangeChanged(r2, r0)
        La:
            return
    }

    private void updateControlsRow() {
            r10 = this;
            r10.updateRowMetadata()
            androidx.leanback.widget.PlaybackControlsRow r0 = r10.getControlsRow()
            androidx.leanback.widget.ObjectAdapter r0 = r0.getPrimaryActionsAdapter()
            androidx.leanback.widget.SparseArrayObjectAdapter r0 = (androidx.leanback.widget.SparseArrayObjectAdapter) r0
            long r1 = r10.getSupportedActions()
            r3 = 16
            long r3 = r3 & r1
            r5 = 16
            r6 = 0
            r7 = 0
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L30
            androidx.leanback.widget.PlaybackControlsRow$SkipPreviousAction r3 = r10.mSkipPreviousAction
            if (r3 != 0) goto L30
            androidx.leanback.widget.PlaybackControlsRow$SkipPreviousAction r3 = new androidx.leanback.widget.PlaybackControlsRow$SkipPreviousAction
            android.content.Context r4 = r10.getContext()
            r3.<init>(r4)
            r10.mSkipPreviousAction = r3
            r0.set(r5, r3)
            goto L3b
        L30:
            if (r9 != 0) goto L3b
            androidx.leanback.widget.PlaybackControlsRow$SkipPreviousAction r3 = r10.mSkipPreviousAction
            if (r3 == 0) goto L3b
            r0.clear(r5)
            r10.mSkipPreviousAction = r6
        L3b:
            r3 = 32
            long r3 = r3 & r1
            r5 = 32
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L5a
            androidx.leanback.widget.PlaybackControlsRow$RewindAction r3 = r10.mRewindAction
            if (r3 != 0) goto L5a
            androidx.leanback.widget.PlaybackControlsRow$RewindAction r3 = new androidx.leanback.widget.PlaybackControlsRow$RewindAction
            android.content.Context r4 = r10.getContext()
            int[] r9 = r10.mRewindSpeeds
            int r9 = r9.length
            r3.<init>(r4, r9)
            r10.mRewindAction = r3
            r0.set(r5, r3)
            goto L65
        L5a:
            if (r9 != 0) goto L65
            androidx.leanback.widget.PlaybackControlsRow$RewindAction r3 = r10.mRewindAction
            if (r3 == 0) goto L65
            r0.clear(r5)
            r10.mRewindAction = r6
        L65:
            r3 = 64
            long r3 = r3 & r1
            r5 = 64
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L81
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r3 = r10.mPlayPauseAction
            if (r3 != 0) goto L81
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r3 = new androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction
            android.content.Context r4 = r10.getContext()
            r3.<init>(r4)
            r10.mPlayPauseAction = r3
            r0.set(r5, r3)
            goto L8c
        L81:
            if (r9 != 0) goto L8c
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r3 = r10.mPlayPauseAction
            if (r3 == 0) goto L8c
            r0.clear(r5)
            r10.mPlayPauseAction = r6
        L8c:
            r3 = 128(0x80, double:6.3E-322)
            long r3 = r3 & r1
            r5 = 128(0x80, float:1.8E-43)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto Lab
            androidx.leanback.widget.PlaybackControlsRow$FastForwardAction r3 = r10.mFastForwardAction
            if (r3 != 0) goto Lab
            androidx.leanback.widget.PlaybackControlsRow$FastForwardAction r3 = new androidx.leanback.widget.PlaybackControlsRow$FastForwardAction
            android.content.Context r4 = r10.getContext()
            int[] r9 = r10.mFastForwardSpeeds
            int r9 = r9.length
            r3.<init>(r4, r9)
            r10.mFastForwardAction = r3
            r0.set(r5, r3)
            goto Lb6
        Lab:
            if (r9 != 0) goto Lb6
            androidx.leanback.widget.PlaybackControlsRow$FastForwardAction r3 = r10.mFastForwardAction
            if (r3 == 0) goto Lb6
            r0.clear(r5)
            r10.mFastForwardAction = r6
        Lb6:
            r3 = 256(0x100, double:1.265E-321)
            long r1 = r1 & r3
            r3 = 256(0x100, float:3.59E-43)
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto Ld2
            androidx.leanback.widget.PlaybackControlsRow$SkipNextAction r1 = r10.mSkipNextAction
            if (r1 != 0) goto Ld2
            androidx.leanback.widget.PlaybackControlsRow$SkipNextAction r1 = new androidx.leanback.widget.PlaybackControlsRow$SkipNextAction
            android.content.Context r2 = r10.getContext()
            r1.<init>(r2)
            r10.mSkipNextAction = r1
            r0.set(r3, r1)
            goto Ldd
        Ld2:
            if (r4 != 0) goto Ldd
            androidx.leanback.widget.PlaybackControlsRow$SkipNextAction r1 = r10.mSkipNextAction
            if (r1 == 0) goto Ldd
            r0.clear(r3)
            r10.mSkipNextAction = r6
        Ldd:
            android.os.Handler r0 = androidx.leanback.media.PlaybackControlGlue.sHandler
            r1 = 100
            java.lang.ref.WeakReference<androidx.leanback.media.PlaybackControlGlue> r2 = r10.mGlueWeakReference
            r0.removeMessages(r1, r2)
            r10.updatePlaybackState()
            return
    }

    private void updatePlaybackState(int r7) {
            r6 = this;
            androidx.leanback.widget.PlaybackControlsRow r0 = r6.mControlsRow
            if (r0 != 0) goto L5
            return
        L5:
            androidx.leanback.widget.PlaybackControlsRow r0 = r6.getControlsRow()
            androidx.leanback.widget.ObjectAdapter r0 = r0.getPrimaryActionsAdapter()
            androidx.leanback.widget.SparseArrayObjectAdapter r0 = (androidx.leanback.widget.SparseArrayObjectAdapter) r0
            androidx.leanback.widget.PlaybackControlsRow$FastForwardAction r1 = r6.mFastForwardAction
            r2 = 10
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2e
            if (r7 < r2) goto L1d
            int r5 = r7 + (-10)
            int r5 = r5 + r4
            goto L1e
        L1d:
            r5 = 0
        L1e:
            int r1 = r1.getIndex()
            if (r1 == r5) goto L2e
            androidx.leanback.widget.PlaybackControlsRow$FastForwardAction r1 = r6.mFastForwardAction
            r1.setIndex(r5)
            androidx.leanback.widget.PlaybackControlsRow$FastForwardAction r1 = r6.mFastForwardAction
            notifyItemChanged(r0, r1)
        L2e:
            androidx.leanback.widget.PlaybackControlsRow$RewindAction r1 = r6.mRewindAction
            if (r1 == 0) goto L4b
            r5 = -10
            if (r7 > r5) goto L3a
            int r5 = -r7
            int r5 = r5 - r2
            int r5 = r5 + r4
            goto L3b
        L3a:
            r5 = 0
        L3b:
            int r1 = r1.getIndex()
            if (r1 == r5) goto L4b
            androidx.leanback.widget.PlaybackControlsRow$RewindAction r1 = r6.mRewindAction
            r1.setIndex(r5)
            androidx.leanback.widget.PlaybackControlsRow$RewindAction r1 = r6.mRewindAction
            notifyItemChanged(r0, r1)
        L4b:
            if (r7 != 0) goto L54
            r6.updateProgress()
            r6.enableProgressUpdating(r3)
            goto L57
        L54:
            r6.enableProgressUpdating(r4)
        L57:
            boolean r1 = r6.mFadeWhenPlaying
            if (r1 == 0) goto L6d
            androidx.leanback.media.PlaybackGlueHost r1 = r6.getHost()
            if (r1 == 0) goto L6d
            androidx.leanback.media.PlaybackGlueHost r1 = r6.getHost()
            if (r7 != r4) goto L69
            r2 = 1
            goto L6a
        L69:
            r2 = 0
        L6a:
            r1.setControlsOverlayAutoHideEnabled(r2)
        L6d:
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r1 = r6.mPlayPauseAction
            if (r1 == 0) goto L84
            if (r7 != 0) goto L74
            r4 = 0
        L74:
            int r7 = r1.getIndex()
            if (r7 == r4) goto L84
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r7 = r6.mPlayPauseAction
            r7.setIndex(r4)
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r7 = r6.mPlayPauseAction
            notifyItemChanged(r0, r7)
        L84:
            java.util.List r7 = r6.getPlayerCallbacks()
            if (r7 == 0) goto L9e
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r0 = r7.size()
        L90:
            if (r3 >= r0) goto L9e
            java.lang.Object r1 = r7.get(r3)
            androidx.leanback.media.PlaybackGlue$PlayerCallback r1 = (androidx.leanback.media.PlaybackGlue.PlayerCallback) r1
            r1.onPlayStateChanged(r6)
            int r3 = r3 + 1
            goto L90
        L9e:
            return
    }

    private void updatePlaybackStatusAfterUserAction() {
            r4 = this;
            int r0 = r4.mPlaybackSpeed
            r4.updatePlaybackState(r0)
            android.os.Handler r0 = androidx.leanback.media.PlaybackControlGlue.sHandler
            java.lang.ref.WeakReference<androidx.leanback.media.PlaybackControlGlue> r1 = r4.mGlueWeakReference
            r2 = 100
            r0.removeMessages(r2, r1)
            java.lang.ref.WeakReference<androidx.leanback.media.PlaybackControlGlue> r1 = r4.mGlueWeakReference
            android.os.Message r1 = r0.obtainMessage(r2, r1)
            r2 = 2000(0x7d0, double:9.88E-321)
            r0.sendMessageDelayed(r1, r2)
            return
    }

    private void updateRowMetadata() {
            r2 = this;
            androidx.leanback.widget.PlaybackControlsRow r0 = r2.mControlsRow
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r2.hasValidMedia()
            if (r0 != 0) goto L1d
            androidx.leanback.widget.PlaybackControlsRow r0 = r2.mControlsRow
            r1 = 0
            r0.setImageDrawable(r1)
            androidx.leanback.widget.PlaybackControlsRow r0 = r2.mControlsRow
            r1 = 0
            r0.setTotalTime(r1)
            androidx.leanback.widget.PlaybackControlsRow r0 = r2.mControlsRow
            r0.setCurrentTime(r1)
            goto L38
        L1d:
            androidx.leanback.widget.PlaybackControlsRow r0 = r2.mControlsRow
            android.graphics.drawable.Drawable r1 = r2.getMediaArt()
            r0.setImageDrawable(r1)
            androidx.leanback.widget.PlaybackControlsRow r0 = r2.mControlsRow
            int r1 = r2.getMediaDuration()
            r0.setTotalTime(r1)
            androidx.leanback.widget.PlaybackControlsRow r0 = r2.mControlsRow
            int r1 = r2.getCurrentPosition()
            r0.setCurrentTime(r1)
        L38:
            androidx.leanback.media.PlaybackGlueHost r0 = r2.getHost()
            if (r0 == 0) goto L45
            androidx.leanback.media.PlaybackGlueHost r0 = r2.getHost()
            r0.notifyPlaybackRowChanged()
        L45:
            return
    }

    public final boolean dispatchAction(androidx.leanback.widget.Action r5, android.view.KeyEvent r6) {
            r4 = this;
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r0 = r4.mPlayPauseAction
            r1 = 0
            r2 = 1
            if (r5 != r0) goto L50
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
            if (r6 == 0) goto L2f
            int r3 = r6.getKeyCode()
            if (r3 == r5) goto L2f
            int r5 = r6.getKeyCode()
            r6 = 127(0x7f, float:1.78E-43)
            if (r5 != r6) goto L2d
            goto L2f
        L2d:
            r5 = 0
            goto L30
        L2f:
            r5 = 1
        L30:
            if (r5 == 0) goto L41
            int r5 = r4.mPlaybackSpeed
            if (r0 == 0) goto L39
            if (r5 != r2) goto L41
            goto L3b
        L39:
            if (r5 == 0) goto L41
        L3b:
            r4.mPlaybackSpeed = r1
            r4.pause()
            goto L4c
        L41:
            if (r0 == 0) goto L4c
            int r5 = r4.mPlaybackSpeed
            if (r5 == r2) goto L4c
            r4.mPlaybackSpeed = r2
            r4.play(r2)
        L4c:
            r4.updatePlaybackStatusAfterUserAction()
            goto L57
        L50:
            androidx.leanback.widget.PlaybackControlsRow$SkipNextAction r6 = r4.mSkipNextAction
            if (r5 != r6) goto L59
            r4.next()
        L57:
            r1 = 1
            goto La6
        L59:
            androidx.leanback.widget.PlaybackControlsRow$SkipPreviousAction r6 = r4.mSkipPreviousAction
            if (r5 != r6) goto L61
            r4.previous()
            goto L57
        L61:
            androidx.leanback.widget.PlaybackControlsRow$FastForwardAction r6 = r4.mFastForwardAction
            if (r5 != r6) goto L83
            int r5 = r4.mPlaybackSpeed
            int r6 = r4.getMaxForwardSpeedId()
            if (r5 >= r6) goto L57
            int r5 = r4.mPlaybackSpeed
            switch(r5) {
                case 10: goto L77;
                case 11: goto L77;
                case 12: goto L77;
                case 13: goto L77;
                default: goto L72;
            }
        L72:
            r5 = 10
            r4.mPlaybackSpeed = r5
            goto L7a
        L77:
            int r5 = r5 + r2
            r4.mPlaybackSpeed = r5
        L7a:
            int r5 = r4.mPlaybackSpeed
            r4.play(r5)
            r4.updatePlaybackStatusAfterUserAction()
            goto L57
        L83:
            androidx.leanback.widget.PlaybackControlsRow$RewindAction r6 = r4.mRewindAction
            if (r5 != r6) goto La6
            int r5 = r4.mPlaybackSpeed
            int r6 = r4.getMaxRewindSpeedId()
            int r6 = -r6
            if (r5 <= r6) goto L57
            int r5 = r4.mPlaybackSpeed
            switch(r5) {
                case -13: goto L9a;
                case -12: goto L9a;
                case -11: goto L9a;
                case -10: goto L9a;
                default: goto L95;
            }
        L95:
            r5 = -10
            r4.mPlaybackSpeed = r5
            goto L9d
        L9a:
            int r5 = r5 - r2
            r4.mPlaybackSpeed = r5
        L9d:
            int r5 = r4.mPlaybackSpeed
            r4.play(r5)
            r4.updatePlaybackStatusAfterUserAction()
            goto L57
        La6:
            return r1
    }

    public void enableProgressUpdating(boolean r1) {
            r0 = this;
            return
    }

    public androidx.leanback.widget.PlaybackControlsRow getControlsRow() {
            r1 = this;
            androidx.leanback.widget.PlaybackControlsRow r0 = r1.mControlsRow
            return r0
    }

    @java.lang.Deprecated
    public androidx.leanback.widget.PlaybackControlsRowPresenter getControlsRowPresenter() {
            r2 = this;
            androidx.leanback.widget.PlaybackRowPresenter r0 = r2.mControlsRowPresenter
            boolean r1 = r0 instanceof androidx.leanback.widget.PlaybackControlsRowPresenter
            if (r1 == 0) goto L9
            androidx.leanback.widget.PlaybackControlsRowPresenter r0 = (androidx.leanback.widget.PlaybackControlsRowPresenter) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public abstract int getCurrentPosition();

    public abstract int getCurrentSpeedId();

    public int[] getFastForwardSpeeds() {
            r1 = this;
            int[] r0 = r1.mFastForwardSpeeds
            return r0
    }

    public abstract android.graphics.drawable.Drawable getMediaArt();

    public abstract int getMediaDuration();

    public abstract java.lang.CharSequence getMediaSubtitle();

    public abstract java.lang.CharSequence getMediaTitle();

    public androidx.leanback.widget.PlaybackRowPresenter getPlaybackRowPresenter() {
            r1 = this;
            androidx.leanback.widget.PlaybackRowPresenter r0 = r1.mControlsRowPresenter
            return r0
    }

    public int[] getRewindSpeeds() {
            r1 = this;
            int[] r0 = r1.mRewindSpeeds
            return r0
    }

    public abstract long getSupportedActions();

    public int getUpdatePeriod() {
            r1 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            return r0
    }

    public abstract boolean hasValidMedia();

    public boolean isFadingEnabled() {
            r1 = this;
            boolean r0 = r1.mFadeWhenPlaying
            return r0
    }

    public abstract boolean isMediaPlaying();

    @Override // androidx.leanback.media.PlaybackGlue
    public boolean isPlaying() {
            r1 = this;
            boolean r0 = r1.isMediaPlaying()
            return r0
    }

    public void onActionClicked(androidx.leanback.widget.Action r2) {
            r1 = this;
            r0 = 0
            r1.dispatchAction(r2, r0)
            return
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public void onAttachedToHost(androidx.leanback.media.PlaybackGlueHost r3) {
            r2 = this;
            super.onAttachedToHost(r3)
            r3.setOnKeyInterceptListener(r2)
            r3.setOnActionClickedListener(r2)
            androidx.leanback.widget.PlaybackControlsRow r0 = r2.getControlsRow()
            if (r0 == 0) goto L15
            androidx.leanback.widget.PlaybackRowPresenter r0 = r2.getPlaybackRowPresenter()
            if (r0 != 0) goto L36
        L15:
            androidx.leanback.widget.PlaybackControlsRow r0 = r2.getControlsRow()
            if (r0 != 0) goto L23
            androidx.leanback.widget.PlaybackControlsRow r0 = new androidx.leanback.widget.PlaybackControlsRow
            r0.<init>(r2)
            r2.setControlsRow(r0)
        L23:
            androidx.leanback.widget.PlaybackRowPresenter r0 = r2.getPlaybackRowPresenter()
            if (r0 != 0) goto L36
            androidx.leanback.media.PlaybackControlGlue$1 r0 = new androidx.leanback.media.PlaybackControlGlue$1
            r0.<init>()
            androidx.leanback.media.PlaybackControlGlue$2 r1 = new androidx.leanback.media.PlaybackControlGlue$2
            r1.<init>(r2, r0)
            r2.setPlaybackRowPresenter(r1)
        L36:
            androidx.leanback.widget.PlaybackRowPresenter r0 = r2.getPlaybackRowPresenter()
            r3.setPlaybackRowPresenter(r0)
            androidx.leanback.widget.PlaybackControlsRow r0 = r2.getControlsRow()
            r3.setPlaybackRow(r0)
            return
    }

    public void onCreateSecondaryActions(androidx.leanback.widget.ArrayObjectAdapter r1) {
            r0 = this;
            return
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public void onDetachedFromHost() {
            r1 = this;
            r0 = 0
            r1.enableProgressUpdating(r0)
            super.onDetachedFromHost()
            return
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public final void onHostStart() {
            r1 = this;
            r0 = 1
            r1.enableProgressUpdating(r0)
            return
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public final void onHostStop() {
            r1 = this;
            r0 = 0
            r1.enableProgressUpdating(r0)
            return
    }

    public boolean onKey(android.view.View r5, int r6, android.view.KeyEvent r7) {
            r4 = this;
            r5 = 111(0x6f, float:1.56E-43)
            r0 = 4
            r1 = 0
            r2 = 1
            if (r6 == r0) goto L4f
            if (r6 == r5) goto L4f
            switch(r6) {
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                default: goto Lc;
            }
        Lc:
            androidx.leanback.widget.PlaybackControlsRow r5 = r4.mControlsRow
            androidx.leanback.widget.ObjectAdapter r5 = r5.getPrimaryActionsAdapter()
            androidx.leanback.widget.SparseArrayObjectAdapter r5 = (androidx.leanback.widget.SparseArrayObjectAdapter) r5
            androidx.leanback.widget.PlaybackControlsRow r0 = r4.mControlsRow
            androidx.leanback.widget.Action r6 = r0.getActionForKeyCode(r5, r6)
            if (r6 == 0) goto L4e
            r0 = 64
            java.lang.Object r0 = r5.lookup(r0)
            if (r6 == r0) goto L44
            r0 = 32
            java.lang.Object r0 = r5.lookup(r0)
            if (r6 == r0) goto L44
            r0 = 128(0x80, float:1.8E-43)
            java.lang.Object r0 = r5.lookup(r0)
            if (r6 == r0) goto L44
            r0 = 16
            java.lang.Object r0 = r5.lookup(r0)
            if (r6 == r0) goto L44
            r0 = 256(0x100, float:3.59E-43)
            java.lang.Object r5 = r5.lookup(r0)
            if (r6 != r5) goto L4e
        L44:
            int r5 = r7.getAction()
            if (r5 != 0) goto L4d
            r4.dispatchAction(r6, r7)
        L4d:
            return r2
        L4e:
            return r1
        L4f:
            int r7 = r4.mPlaybackSpeed
            r3 = 10
            if (r7 >= r3) goto L5c
            r3 = -10
            if (r7 > r3) goto L5a
            goto L5c
        L5a:
            r7 = 0
            goto L5d
        L5c:
            r7 = 1
        L5d:
            if (r7 == 0) goto L6c
            r4.mPlaybackSpeed = r2
            r4.play(r2)
            r4.updatePlaybackStatusAfterUserAction()
            if (r6 == r0) goto L6b
            if (r6 != r5) goto L6c
        L6b:
            r1 = 1
        L6c:
            return r1
    }

    public final void onMetadataChanged() {
            r0 = this;
            r0.updateRowMetadata()
            return
    }

    public final void onStateChanged() {
            r4 = this;
            boolean r0 = r4.hasValidMedia()
            if (r0 != 0) goto L7
            return
        L7:
            android.os.Handler r0 = androidx.leanback.media.PlaybackControlGlue.sHandler
            java.lang.ref.WeakReference<androidx.leanback.media.PlaybackControlGlue> r1 = r4.mGlueWeakReference
            r2 = 100
            boolean r1 = r0.hasMessages(r2, r1)
            if (r1 == 0) goto L30
            java.lang.ref.WeakReference<androidx.leanback.media.PlaybackControlGlue> r1 = r4.mGlueWeakReference
            r0.removeMessages(r2, r1)
            int r1 = r4.getCurrentSpeedId()
            int r3 = r4.mPlaybackSpeed
            if (r1 == r3) goto L2c
            java.lang.ref.WeakReference<androidx.leanback.media.PlaybackControlGlue> r1 = r4.mGlueWeakReference
            android.os.Message r1 = r0.obtainMessage(r2, r1)
            r2 = 2000(0x7d0, double:9.88E-321)
            r0.sendMessageDelayed(r1, r2)
            goto L33
        L2c:
            r4.updatePlaybackState()
            goto L33
        L30:
            r4.updatePlaybackState()
        L33:
            return
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public final void play() {
            r1 = this;
            r0 = 1
            r1.play(r0)
            return
    }

    public void play(int r1) {
            r0 = this;
            return
    }

    public void setControlsRow(androidx.leanback.widget.PlaybackControlsRow r3) {
            r2 = this;
            r2.mControlsRow = r3
            androidx.leanback.widget.ControlButtonPresenterSelector r0 = new androidx.leanback.widget.ControlButtonPresenterSelector
            r0.<init>()
            androidx.leanback.widget.SparseArrayObjectAdapter r1 = new androidx.leanback.widget.SparseArrayObjectAdapter
            r1.<init>(r0)
            r3.setPrimaryActionsAdapter(r1)
            androidx.leanback.widget.ArrayObjectAdapter r3 = new androidx.leanback.widget.ArrayObjectAdapter
            androidx.leanback.widget.ControlButtonPresenterSelector r0 = new androidx.leanback.widget.ControlButtonPresenterSelector
            r0.<init>()
            r3.<init>(r0)
            r2.onCreateSecondaryActions(r3)
            androidx.leanback.widget.PlaybackControlsRow r0 = r2.getControlsRow()
            r0.setSecondaryActionsAdapter(r3)
            r2.updateControlsRow()
            return
    }

    @java.lang.Deprecated
    public void setControlsRowPresenter(androidx.leanback.widget.PlaybackControlsRowPresenter r1) {
            r0 = this;
            r0.mControlsRowPresenter = r1
            return
    }

    public void setFadingEnabled(boolean r2) {
            r1 = this;
            r1.mFadeWhenPlaying = r2
            if (r2 != 0) goto L12
            androidx.leanback.media.PlaybackGlueHost r2 = r1.getHost()
            if (r2 == 0) goto L12
            androidx.leanback.media.PlaybackGlueHost r2 = r1.getHost()
            r0 = 0
            r2.setControlsOverlayAutoHideEnabled(r0)
        L12:
            return
    }

    public void setPlaybackRowPresenter(androidx.leanback.widget.PlaybackRowPresenter r1) {
            r0 = this;
            r0.mControlsRowPresenter = r1
            return
    }

    public final void updatePlaybackState() {
            r1 = this;
            boolean r0 = r1.hasValidMedia()
            if (r0 == 0) goto Lf
            int r0 = r1.getCurrentSpeedId()
            r1.mPlaybackSpeed = r0
            r1.updatePlaybackState(r0)
        Lf:
            return
    }

    public void updateProgress() {
            r2 = this;
            int r0 = r2.getCurrentPosition()
            androidx.leanback.widget.PlaybackControlsRow r1 = r2.mControlsRow
            if (r1 == 0) goto Lb
            r1.setCurrentTime(r0)
        Lb:
            return
    }
}
