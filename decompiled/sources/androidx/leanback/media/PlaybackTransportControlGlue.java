package androidx.leanback.media;

import androidx.leanback.media.PlayerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public class PlaybackTransportControlGlue<T extends androidx.leanback.media.PlayerAdapter> extends androidx.leanback.media.PlaybackBaseControlGlue<T> {
    public static final android.os.Handler sHandler = null;
    public final java.lang.ref.WeakReference<androidx.leanback.media.PlaybackBaseControlGlue> mGlueWeakReference;
    public final androidx.leanback.media.PlaybackTransportControlGlue<T>.SeekUiClient mPlaybackSeekUiClient;
    public boolean mSeekEnabled;
    public androidx.leanback.widget.PlaybackSeekDataProvider mSeekProvider;



    public class SeekUiClient extends androidx.leanback.widget.PlaybackSeekUi.Client {
        public boolean mIsSeek;
        public long mLastUserPosition;
        public boolean mPausedBeforeSeek;
        public long mPositionBeforeSeek;
        public final /* synthetic */ androidx.leanback.media.PlaybackTransportControlGlue this$0;

        public SeekUiClient(androidx.leanback.media.PlaybackTransportControlGlue r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.leanback.widget.PlaybackSeekUi.Client
        public androidx.leanback.widget.PlaybackSeekDataProvider getPlaybackSeekDataProvider() {
                r1 = this;
                androidx.leanback.media.PlaybackTransportControlGlue r0 = r1.this$0
                androidx.leanback.widget.PlaybackSeekDataProvider r0 = r0.mSeekProvider
                return r0
        }

        @Override // androidx.leanback.widget.PlaybackSeekUi.Client
        public boolean isSeekEnabled() {
                r2 = this;
                androidx.leanback.media.PlaybackTransportControlGlue r0 = r2.this$0
                androidx.leanback.widget.PlaybackSeekDataProvider r1 = r0.mSeekProvider
                if (r1 != 0) goto Ld
                boolean r0 = r0.mSeekEnabled
                if (r0 == 0) goto Lb
                goto Ld
            Lb:
                r0 = 0
                goto Le
            Ld:
                r0 = 1
            Le:
                return r0
        }

        @Override // androidx.leanback.widget.PlaybackSeekUi.Client
        public void onSeekFinished(boolean r5) {
                r4 = this;
                r0 = 0
                if (r5 != 0) goto L10
                long r2 = r4.mLastUserPosition
                int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r5 < 0) goto L1b
                androidx.leanback.media.PlaybackTransportControlGlue r5 = r4.this$0
                r5.seekTo(r2)
                goto L1b
            L10:
                long r2 = r4.mPositionBeforeSeek
                int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r5 < 0) goto L1b
                androidx.leanback.media.PlaybackTransportControlGlue r5 = r4.this$0
                r5.seekTo(r2)
            L1b:
                r5 = 0
                r4.mIsSeek = r5
                boolean r0 = r4.mPausedBeforeSeek
                if (r0 != 0) goto L28
                androidx.leanback.media.PlaybackTransportControlGlue r5 = r4.this$0
                r5.play()
                goto L34
            L28:
                androidx.leanback.media.PlaybackTransportControlGlue r0 = r4.this$0
                T extends androidx.leanback.media.PlayerAdapter r0 = r0.mPlayerAdapter
                r0.setProgressUpdatingEnabled(r5)
                androidx.leanback.media.PlaybackTransportControlGlue r5 = r4.this$0
                r5.onUpdateProgress()
            L34:
                return
        }

        @Override // androidx.leanback.widget.PlaybackSeekUi.Client
        public void onSeekPositionChanged(long r3) {
                r2 = this;
                androidx.leanback.media.PlaybackTransportControlGlue r0 = r2.this$0
                androidx.leanback.widget.PlaybackSeekDataProvider r1 = r0.mSeekProvider
                if (r1 != 0) goto Lc
                T extends androidx.leanback.media.PlayerAdapter r0 = r0.mPlayerAdapter
                r0.seekTo(r3)
                goto Le
            Lc:
                r2.mLastUserPosition = r3
            Le:
                androidx.leanback.media.PlaybackTransportControlGlue r0 = r2.this$0
                androidx.leanback.widget.PlaybackControlsRow r0 = r0.mControlsRow
                if (r0 == 0) goto L17
                r0.setCurrentPosition(r3)
            L17:
                return
        }

        @Override // androidx.leanback.widget.PlaybackSeekUi.Client
        public void onSeekStarted() {
                r4 = this;
                r0 = 1
                r4.mIsSeek = r0
                androidx.leanback.media.PlaybackTransportControlGlue r1 = r4.this$0
                boolean r1 = r1.isPlaying()
                r1 = r1 ^ r0
                r4.mPausedBeforeSeek = r1
                androidx.leanback.media.PlaybackTransportControlGlue r1 = r4.this$0
                T extends androidx.leanback.media.PlayerAdapter r1 = r1.mPlayerAdapter
                r1.setProgressUpdatingEnabled(r0)
                androidx.leanback.media.PlaybackTransportControlGlue r0 = r4.this$0
                androidx.leanback.widget.PlaybackSeekDataProvider r1 = r0.mSeekProvider
                r2 = -1
                if (r1 != 0) goto L22
                T extends androidx.leanback.media.PlayerAdapter r0 = r0.mPlayerAdapter
                long r0 = r0.getCurrentPosition()
                goto L23
            L22:
                r0 = r2
            L23:
                r4.mPositionBeforeSeek = r0
                r4.mLastUserPosition = r2
                androidx.leanback.media.PlaybackTransportControlGlue r0 = r4.this$0
                r0.pause()
                return
        }
    }

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
                androidx.leanback.media.PlaybackTransportControlGlue r3 = (androidx.leanback.media.PlaybackTransportControlGlue) r3
                if (r3 == 0) goto L15
                r3.onUpdatePlaybackState()
            L15:
                return
        }
    }

    static {
            androidx.leanback.media.PlaybackTransportControlGlue$UpdatePlaybackStateHandler r0 = new androidx.leanback.media.PlaybackTransportControlGlue$UpdatePlaybackStateHandler
            r0.<init>()
            androidx.leanback.media.PlaybackTransportControlGlue.sHandler = r0
            return
    }

    public PlaybackTransportControlGlue(android.content.Context r1, T r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r0.mGlueWeakReference = r1
            androidx.leanback.media.PlaybackTransportControlGlue$SeekUiClient r1 = new androidx.leanback.media.PlaybackTransportControlGlue$SeekUiClient
            r1.<init>(r0)
            r0.mPlaybackSeekUiClient = r1
            return
    }

    private void updatePlaybackState(boolean r3) {
            r2 = this;
            androidx.leanback.widget.PlaybackControlsRow r0 = r2.mControlsRow
            if (r0 != 0) goto L5
            return
        L5:
            if (r3 != 0) goto L14
            r2.onUpdateProgress()
            T extends androidx.leanback.media.PlayerAdapter r0 = r2.mPlayerAdapter
            androidx.leanback.media.PlaybackTransportControlGlue<T>$SeekUiClient r1 = r2.mPlaybackSeekUiClient
            boolean r1 = r1.mIsSeek
            r0.setProgressUpdatingEnabled(r1)
            goto L1a
        L14:
            T extends androidx.leanback.media.PlayerAdapter r0 = r2.mPlayerAdapter
            r1 = 1
            r0.setProgressUpdatingEnabled(r1)
        L1a:
            boolean r0 = r2.mFadeWhenPlaying
            if (r0 == 0) goto L2b
            androidx.leanback.media.PlaybackGlueHost r0 = r2.getHost()
            if (r0 == 0) goto L2b
            androidx.leanback.media.PlaybackGlueHost r0 = r2.getHost()
            r0.setControlsOverlayAutoHideEnabled(r3)
        L2b:
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r0 = r2.mPlayPauseAction
            if (r0 == 0) goto L49
            int r0 = r0.getIndex()
            if (r0 == r3) goto L49
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r0 = r2.mPlayPauseAction
            r0.setIndex(r3)
            androidx.leanback.widget.PlaybackControlsRow r3 = r2.getControlsRow()
            androidx.leanback.widget.ObjectAdapter r3 = r3.getPrimaryActionsAdapter()
            androidx.leanback.widget.ArrayObjectAdapter r3 = (androidx.leanback.widget.ArrayObjectAdapter) r3
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r0 = r2.mPlayPauseAction
            androidx.leanback.media.PlaybackBaseControlGlue.notifyItemChanged(r3, r0)
        L49:
            return
    }

    public final boolean dispatchAction(androidx.leanback.widget.Action r5, android.view.KeyEvent r6) {
            r4 = this;
            boolean r0 = r5 instanceof androidx.leanback.widget.PlaybackControlsRow.PlayPauseAction
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L61
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
            if (r5 == 0) goto L3c
            boolean r5 = r4.mIsPlaying
            if (r5 == 0) goto L3c
            r4.mIsPlaying = r1
            r4.pause()
            goto L47
        L3c:
            if (r0 == 0) goto L47
            boolean r5 = r4.mIsPlaying
            if (r5 != 0) goto L47
            r4.mIsPlaying = r2
            r4.play()
        L47:
            boolean r5 = r4.mIsPlaying
            r4.updatePlaybackState(r5)
            android.os.Handler r5 = androidx.leanback.media.PlaybackTransportControlGlue.sHandler
            java.lang.ref.WeakReference<androidx.leanback.media.PlaybackBaseControlGlue> r6 = r4.mGlueWeakReference
            r0 = 100
            r5.removeMessages(r0, r6)
            java.lang.ref.WeakReference<androidx.leanback.media.PlaybackBaseControlGlue> r6 = r4.mGlueWeakReference
            android.os.Message r6 = r5.obtainMessage(r0, r6)
            r0 = 2000(0x7d0, double:9.88E-321)
            r5.sendMessageDelayed(r6, r0)
            goto L68
        L61:
            boolean r6 = r5 instanceof androidx.leanback.widget.PlaybackControlsRow.SkipNextAction
            if (r6 == 0) goto L6a
            r4.next()
        L68:
            r1 = 1
            goto L72
        L6a:
            boolean r5 = r5 instanceof androidx.leanback.widget.PlaybackControlsRow.SkipPreviousAction
            if (r5 == 0) goto L72
            r4.previous()
            goto L68
        L72:
            return r1
    }

    public final androidx.leanback.widget.PlaybackSeekDataProvider getSeekProvider() {
            r1 = this;
            androidx.leanback.widget.PlaybackSeekDataProvider r0 = r1.mSeekProvider
            return r0
    }

    public final boolean isSeekEnabled() {
            r1 = this;
            boolean r0 = r1.mSeekEnabled
            return r0
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue, androidx.leanback.widget.OnActionClickedListener
    public void onActionClicked(androidx.leanback.widget.Action r2) {
            r1 = this;
            r0 = 0
            r1.dispatchAction(r2, r0)
            return
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue, androidx.leanback.media.PlaybackGlue
    public final void onAttachedToHost(androidx.leanback.media.PlaybackGlueHost r2) {
            r1 = this;
            super.onAttachedToHost(r2)
            boolean r0 = r2 instanceof androidx.leanback.widget.PlaybackSeekUi
            if (r0 == 0) goto Le
            androidx.leanback.widget.PlaybackSeekUi r2 = (androidx.leanback.widget.PlaybackSeekUi) r2
            androidx.leanback.media.PlaybackTransportControlGlue<T>$SeekUiClient r0 = r1.mPlaybackSeekUiClient
            r2.setPlaybackSeekUiClient(r0)
        Le:
            return
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public final void onCreatePrimaryActions(androidx.leanback.widget.ArrayObjectAdapter r3) {
            r2 = this;
            androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction r0 = new androidx.leanback.widget.PlaybackControlsRow$PlayPauseAction
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.mPlayPauseAction = r0
            r3.add(r0)
            return
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public final androidx.leanback.widget.PlaybackRowPresenter onCreateRowPresenter() {
            r2 = this;
            androidx.leanback.media.PlaybackTransportControlGlue$1 r0 = new androidx.leanback.media.PlaybackTransportControlGlue$1
            r0.<init>()
            androidx.leanback.media.PlaybackTransportControlGlue$2 r1 = new androidx.leanback.media.PlaybackTransportControlGlue$2
            r1.<init>(r2)
            r1.setDescriptionPresenter(r0)
            return r1
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue, androidx.leanback.media.PlaybackGlue
    public final void onDetachedFromHost() {
            r2 = this;
            super.onDetachedFromHost()
            androidx.leanback.media.PlaybackGlueHost r0 = r2.getHost()
            boolean r0 = r0 instanceof androidx.leanback.widget.PlaybackSeekUi
            if (r0 == 0) goto L15
            androidx.leanback.media.PlaybackGlueHost r0 = r2.getHost()
            androidx.leanback.widget.PlaybackSeekUi r0 = (androidx.leanback.widget.PlaybackSeekUi) r0
            r1 = 0
            r0.setPlaybackSeekUiClient(r1)
        L15:
            return
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue, android.view.View.OnKeyListener
    public boolean onKey(android.view.View r3, int r4, android.view.KeyEvent r5) {
            r2 = this;
            r3 = 4
            r0 = 0
            if (r4 == r3) goto L30
            r3 = 111(0x6f, float:1.56E-43)
            if (r4 == r3) goto L30
            switch(r4) {
                case 19: goto L30;
                case 20: goto L30;
                case 21: goto L30;
                case 22: goto L30;
                default: goto Lb;
            }
        Lb:
            androidx.leanback.widget.PlaybackControlsRow r3 = r2.mControlsRow
            androidx.leanback.widget.ObjectAdapter r3 = r3.getPrimaryActionsAdapter()
            androidx.leanback.widget.PlaybackControlsRow r1 = r2.mControlsRow
            androidx.leanback.widget.Action r3 = r1.getActionForKeyCode(r3, r4)
            if (r3 != 0) goto L23
            androidx.leanback.widget.PlaybackControlsRow r3 = r2.mControlsRow
            androidx.leanback.widget.ObjectAdapter r1 = r3.getSecondaryActionsAdapter()
            androidx.leanback.widget.Action r3 = r3.getActionForKeyCode(r1, r4)
        L23:
            if (r3 == 0) goto L30
            int r4 = r5.getAction()
            if (r4 != 0) goto L2e
            r2.dispatchAction(r3, r5)
        L2e:
            r3 = 1
            return r3
        L30:
            return r0
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public final void onPlayStateChanged() {
            r4 = this;
            android.os.Handler r0 = androidx.leanback.media.PlaybackTransportControlGlue.sHandler
            java.lang.ref.WeakReference<androidx.leanback.media.PlaybackBaseControlGlue> r1 = r4.mGlueWeakReference
            r2 = 100
            boolean r1 = r0.hasMessages(r2, r1)
            if (r1 == 0) goto L2b
            java.lang.ref.WeakReference<androidx.leanback.media.PlaybackBaseControlGlue> r1 = r4.mGlueWeakReference
            r0.removeMessages(r2, r1)
            T extends androidx.leanback.media.PlayerAdapter r1 = r4.mPlayerAdapter
            boolean r1 = r1.isPlaying()
            boolean r3 = r4.mIsPlaying
            if (r1 == r3) goto L27
            java.lang.ref.WeakReference<androidx.leanback.media.PlaybackBaseControlGlue> r1 = r4.mGlueWeakReference
            android.os.Message r1 = r0.obtainMessage(r2, r1)
            r2 = 2000(0x7d0, double:9.88E-321)
            r0.sendMessageDelayed(r1, r2)
            goto L2e
        L27:
            r4.onUpdatePlaybackState()
            goto L2e
        L2b:
            r4.onUpdatePlaybackState()
        L2e:
            super.onPlayStateChanged()
            return
    }

    public final void onUpdatePlaybackState() {
            r1 = this;
            T extends androidx.leanback.media.PlayerAdapter r0 = r1.mPlayerAdapter
            boolean r0 = r0.isPlaying()
            r1.mIsPlaying = r0
            r1.updatePlaybackState(r0)
            return
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public final void onUpdateProgress() {
            r1 = this;
            androidx.leanback.media.PlaybackTransportControlGlue<T>$SeekUiClient r0 = r1.mPlaybackSeekUiClient
            boolean r0 = r0.mIsSeek
            if (r0 != 0) goto L9
            super.onUpdateProgress()
        L9:
            return
    }

    @Override // androidx.leanback.media.PlaybackBaseControlGlue
    public void setControlsRow(androidx.leanback.widget.PlaybackControlsRow r3) {
            r2 = this;
            super.setControlsRow(r3)
            android.os.Handler r3 = androidx.leanback.media.PlaybackTransportControlGlue.sHandler
            java.lang.ref.WeakReference<androidx.leanback.media.PlaybackBaseControlGlue> r0 = r2.mGlueWeakReference
            r1 = 100
            r3.removeMessages(r1, r0)
            r2.onUpdatePlaybackState()
            return
    }

    public final void setSeekEnabled(boolean r1) {
            r0 = this;
            r0.mSeekEnabled = r1
            return
    }

    public final void setSeekProvider(androidx.leanback.widget.PlaybackSeekDataProvider r1) {
            r0 = this;
            r0.mSeekProvider = r1
            return
    }
}
