package androidx.leanback.media;

import androidx.leanback.media.PlayerAdapter;

/* JADX INFO: loaded from: classes.dex */
public abstract class PlaybackBaseControlGlue<T extends androidx.leanback.media.PlayerAdapter> extends androidx.leanback.media.PlaybackGlue implements androidx.leanback.widget.OnActionClickedListener, android.view.View.OnKeyListener {
    public static final int ACTION_CUSTOM_LEFT_FIRST = 1;
    public static final int ACTION_CUSTOM_RIGHT_FIRST = 4096;
    public static final int ACTION_FAST_FORWARD = 128;
    public static final int ACTION_PLAY_PAUSE = 64;
    public static final int ACTION_REPEAT = 512;
    public static final int ACTION_REWIND = 32;
    public static final int ACTION_SHUFFLE = 1024;
    public static final int ACTION_SKIP_TO_NEXT = 256;
    public static final int ACTION_SKIP_TO_PREVIOUS = 16;
    public boolean mBuffering;
    public androidx.leanback.widget.PlaybackControlsRow mControlsRow;
    public androidx.leanback.widget.PlaybackRowPresenter mControlsRowPresenter;
    public android.graphics.drawable.Drawable mCover;
    public int mErrorCode;
    public java.lang.String mErrorMessage;
    public boolean mErrorSet;
    public boolean mFadeWhenPlaying;
    public boolean mIsPlaying;
    public androidx.leanback.widget.PlaybackControlsRow.PlayPauseAction mPlayPauseAction;
    public final T mPlayerAdapter;
    public androidx.leanback.media.PlaybackGlueHost.PlayerCallback mPlayerCallback;
    public java.lang.CharSequence mSubtitle;
    public java.lang.CharSequence mTitle;
    public int mVideoHeight;
    public int mVideoWidth;


    public PlaybackBaseControlGlue(android.content.Context r2, T r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.mIsPlaying = r2
            r0 = 1
            r1.mFadeWhenPlaying = r0
            r1.mBuffering = r2
            r1.mVideoWidth = r2
            r1.mVideoHeight = r2
            r1.mErrorSet = r2
            androidx.leanback.media.PlaybackBaseControlGlue$1 r2 = new androidx.leanback.media.PlaybackBaseControlGlue$1
            r2.<init>(r1)
            r1.mPlayerAdapter = r3
            r3.setCallback(r2)
            return
    }

    public static void notifyItemChanged(androidx.leanback.widget.ArrayObjectAdapter r1, java.lang.Object r2) {
            int r2 = r1.indexOf(r2)
            if (r2 < 0) goto La
            r0 = 1
            r1.notifyArrayItemRangeChanged(r2, r0)
        La:
            return
    }

    private void updateControlsRow() {
            r0 = this;
            r0.onMetadataChanged()
            return
    }

    public android.graphics.drawable.Drawable getArt() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mCover
            return r0
    }

    public final long getBufferedPosition() {
            r2 = this;
            T extends androidx.leanback.media.PlayerAdapter r0 = r2.mPlayerAdapter
            long r0 = r0.getBufferedPosition()
            return r0
    }

    public androidx.leanback.widget.PlaybackControlsRow getControlsRow() {
            r1 = this;
            androidx.leanback.widget.PlaybackControlsRow r0 = r1.mControlsRow
            return r0
    }

    public long getCurrentPosition() {
            r2 = this;
            T extends androidx.leanback.media.PlayerAdapter r0 = r2.mPlayerAdapter
            long r0 = r0.getCurrentPosition()
            return r0
    }

    public final long getDuration() {
            r2 = this;
            T extends androidx.leanback.media.PlayerAdapter r0 = r2.mPlayerAdapter
            long r0 = r0.getDuration()
            return r0
    }

    public androidx.leanback.widget.PlaybackRowPresenter getPlaybackRowPresenter() {
            r1 = this;
            androidx.leanback.widget.PlaybackRowPresenter r0 = r1.mControlsRowPresenter
            return r0
    }

    public final T getPlayerAdapter() {
            r1 = this;
            T extends androidx.leanback.media.PlayerAdapter r0 = r1.mPlayerAdapter
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mSubtitle
            return r0
    }

    public long getSupportedActions() {
            r2 = this;
            T extends androidx.leanback.media.PlayerAdapter r0 = r2.mPlayerAdapter
            long r0 = r0.getSupportedActions()
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTitle
            return r0
    }

    public boolean isControlsOverlayAutoHideEnabled() {
            r1 = this;
            boolean r0 = r1.mFadeWhenPlaying
            return r0
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public final boolean isPlaying() {
            r1 = this;
            T extends androidx.leanback.media.PlayerAdapter r0 = r1.mPlayerAdapter
            boolean r0 = r0.isPlaying()
            return r0
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public final boolean isPrepared() {
            r1 = this;
            T extends androidx.leanback.media.PlayerAdapter r0 = r1.mPlayerAdapter
            boolean r0 = r0.isPrepared()
            return r0
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public void next() {
            r1 = this;
            T extends androidx.leanback.media.PlayerAdapter r0 = r1.mPlayerAdapter
            r0.next()
            return
    }

    public abstract void onActionClicked(androidx.leanback.widget.Action r1);

    @Override // androidx.leanback.media.PlaybackGlue
    public void onAttachedToHost(androidx.leanback.media.PlaybackGlueHost r4) {
            r3 = this;
            super.onAttachedToHost(r4)
            r4.setOnKeyInterceptListener(r3)
            r4.setOnActionClickedListener(r3)
            androidx.leanback.widget.PlaybackControlsRow r0 = r3.mControlsRow
            if (r0 != 0) goto L15
            androidx.leanback.widget.PlaybackControlsRow r0 = new androidx.leanback.widget.PlaybackControlsRow
            r0.<init>(r3)
            r3.setControlsRow(r0)
        L15:
            androidx.leanback.widget.PlaybackRowPresenter r0 = r3.mControlsRowPresenter
            if (r0 != 0) goto L20
            androidx.leanback.widget.PlaybackRowPresenter r0 = r3.onCreateRowPresenter()
            r3.setPlaybackRowPresenter(r0)
        L20:
            androidx.leanback.widget.PlaybackRowPresenter r0 = r3.getPlaybackRowPresenter()
            r4.setPlaybackRowPresenter(r0)
            androidx.leanback.widget.PlaybackControlsRow r0 = r3.getControlsRow()
            r4.setPlaybackRow(r0)
            androidx.leanback.media.PlaybackGlueHost$PlayerCallback r0 = r4.getPlayerCallback()
            r3.mPlayerCallback = r0
            if (r0 == 0) goto L55
            int r1 = r3.mVideoWidth
            if (r1 == 0) goto L41
            int r2 = r3.mVideoHeight
            if (r2 == 0) goto L41
            r0.onVideoSizeChanged(r1, r2)
        L41:
            boolean r0 = r3.mErrorSet
            if (r0 == 0) goto L4e
            androidx.leanback.media.PlaybackGlueHost$PlayerCallback r0 = r3.mPlayerCallback
            int r1 = r3.mErrorCode
            java.lang.String r2 = r3.mErrorMessage
            r0.onError(r1, r2)
        L4e:
            androidx.leanback.media.PlaybackGlueHost$PlayerCallback r0 = r3.mPlayerCallback
            boolean r1 = r3.mBuffering
            r0.onBufferingStateChanged(r1)
        L55:
            T extends androidx.leanback.media.PlayerAdapter r0 = r3.mPlayerAdapter
            r0.onAttachedToHost(r4)
            return
    }

    public void onCreatePrimaryActions(androidx.leanback.widget.ArrayObjectAdapter r1) {
            r0 = this;
            return
    }

    public abstract androidx.leanback.widget.PlaybackRowPresenter onCreateRowPresenter();

    @Override // androidx.leanback.media.PlaybackGlue
    public void onDetachedFromHost() {
            r3 = this;
            r0 = 0
            r3.mErrorSet = r0
            r3.mErrorCode = r0
            r1 = 0
            r3.mErrorMessage = r1
            androidx.leanback.media.PlaybackGlueHost$PlayerCallback r2 = r3.mPlayerCallback
            if (r2 == 0) goto Lf
            r2.onBufferingStateChanged(r0)
        Lf:
            r3.mPlayerCallback = r1
            T extends androidx.leanback.media.PlayerAdapter r1 = r3.mPlayerAdapter
            r1.onDetachedFromHost()
            T extends androidx.leanback.media.PlayerAdapter r1 = r3.mPlayerAdapter
            r1.setProgressUpdatingEnabled(r0)
            super.onDetachedFromHost()
            return
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public final void onHostStart() {
            r2 = this;
            T extends androidx.leanback.media.PlayerAdapter r0 = r2.mPlayerAdapter
            r1 = 1
            r0.setProgressUpdatingEnabled(r1)
            return
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public final void onHostStop() {
            r2 = this;
            T extends androidx.leanback.media.PlayerAdapter r0 = r2.mPlayerAdapter
            r1 = 0
            r0.setProgressUpdatingEnabled(r1)
            return
    }

    public abstract boolean onKey(android.view.View r1, int r2, android.view.KeyEvent r3);

    public final void onMetadataChanged() {
            r3 = this;
            androidx.leanback.widget.PlaybackControlsRow r0 = r3.mControlsRow
            if (r0 != 0) goto L5
            return
        L5:
            android.graphics.drawable.Drawable r1 = r3.getArt()
            r0.setImageDrawable(r1)
            androidx.leanback.widget.PlaybackControlsRow r0 = r3.mControlsRow
            long r1 = r3.getDuration()
            r0.setDuration(r1)
            androidx.leanback.widget.PlaybackControlsRow r0 = r3.mControlsRow
            long r1 = r3.getCurrentPosition()
            r0.setCurrentPosition(r1)
            androidx.leanback.media.PlaybackGlueHost r0 = r3.getHost()
            if (r0 == 0) goto L2b
            androidx.leanback.media.PlaybackGlueHost r0 = r3.getHost()
            r0.notifyPlaybackRowChanged()
        L2b:
            return
    }

    @androidx.annotation.CallSuper
    public void onPlayCompleted() {
            r4 = this;
            java.util.List r0 = r4.getPlayerCallbacks()
            if (r0 == 0) goto L1b
            r1 = 0
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r0.size()
        Ld:
            if (r1 >= r2) goto L1b
            java.lang.Object r3 = r0.get(r1)
            androidx.leanback.media.PlaybackGlue$PlayerCallback r3 = (androidx.leanback.media.PlaybackGlue.PlayerCallback) r3
            r3.onPlayCompleted(r4)
            int r1 = r1 + 1
            goto Ld
        L1b:
            return
    }

    @androidx.annotation.CallSuper
    public void onPlayStateChanged() {
            r4 = this;
            java.util.List r0 = r4.getPlayerCallbacks()
            if (r0 == 0) goto L1b
            r1 = 0
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r0.size()
        Ld:
            if (r1 >= r2) goto L1b
            java.lang.Object r3 = r0.get(r1)
            androidx.leanback.media.PlaybackGlue$PlayerCallback r3 = (androidx.leanback.media.PlaybackGlue.PlayerCallback) r3
            r3.onPlayStateChanged(r4)
            int r1 = r1 + 1
            goto Ld
        L1b:
            return
    }

    @androidx.annotation.CallSuper
    public final void onUpdateDuration() {
            r3 = this;
            androidx.leanback.widget.PlaybackControlsRow r0 = r3.mControlsRow
            if (r0 == 0) goto L18
            T extends androidx.leanback.media.PlayerAdapter r1 = r3.mPlayerAdapter
            boolean r1 = r1.isPrepared()
            if (r1 == 0) goto L13
            T extends androidx.leanback.media.PlayerAdapter r1 = r3.mPlayerAdapter
            long r1 = r1.getDuration()
            goto L15
        L13:
            r1 = -1
        L15:
            r0.setDuration(r1)
        L18:
            return
    }

    @androidx.annotation.CallSuper
    public void onUpdateProgress() {
            r3 = this;
            androidx.leanback.widget.PlaybackControlsRow r0 = r3.mControlsRow
            if (r0 == 0) goto L16
            T extends androidx.leanback.media.PlayerAdapter r1 = r3.mPlayerAdapter
            boolean r1 = r1.isPrepared()
            if (r1 == 0) goto L11
            long r1 = r3.getCurrentPosition()
            goto L13
        L11:
            r1 = -1
        L13:
            r0.setCurrentPosition(r1)
        L16:
            return
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public void pause() {
            r1 = this;
            T extends androidx.leanback.media.PlayerAdapter r0 = r1.mPlayerAdapter
            r0.pause()
            return
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public void play() {
            r1 = this;
            T extends androidx.leanback.media.PlayerAdapter r0 = r1.mPlayerAdapter
            r0.play()
            return
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public void previous() {
            r1 = this;
            T extends androidx.leanback.media.PlayerAdapter r0 = r1.mPlayerAdapter
            r0.previous()
            return
    }

    public final void seekTo(long r2) {
            r1 = this;
            T extends androidx.leanback.media.PlayerAdapter r0 = r1.mPlayerAdapter
            r0.seekTo(r2)
            return
    }

    public void setArt(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mCover
            if (r0 != r2) goto L5
            return
        L5:
            r1.mCover = r2
            androidx.leanback.widget.PlaybackControlsRow r0 = r1.mControlsRow
            r0.setImageDrawable(r2)
            androidx.leanback.media.PlaybackGlueHost r2 = r1.getHost()
            if (r2 == 0) goto L19
            androidx.leanback.media.PlaybackGlueHost r2 = r1.getHost()
            r2.notifyPlaybackRowChanged()
        L19:
            return
    }

    public void setControlsOverlayAutoHideEnabled(boolean r2) {
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

    public void setControlsRow(androidx.leanback.widget.PlaybackControlsRow r3) {
            r2 = this;
            r2.mControlsRow = r3
            r0 = -1
            r3.setCurrentPosition(r0)
            androidx.leanback.widget.PlaybackControlsRow r3 = r2.mControlsRow
            r3.setDuration(r0)
            androidx.leanback.widget.PlaybackControlsRow r3 = r2.mControlsRow
            r3.setBufferedPosition(r0)
            androidx.leanback.widget.PlaybackControlsRow r3 = r2.mControlsRow
            androidx.leanback.widget.ObjectAdapter r3 = r3.getPrimaryActionsAdapter()
            if (r3 != 0) goto L2b
            androidx.leanback.widget.ArrayObjectAdapter r3 = new androidx.leanback.widget.ArrayObjectAdapter
            androidx.leanback.widget.ControlButtonPresenterSelector r0 = new androidx.leanback.widget.ControlButtonPresenterSelector
            r0.<init>()
            r3.<init>(r0)
            r2.onCreatePrimaryActions(r3)
            androidx.leanback.widget.PlaybackControlsRow r0 = r2.mControlsRow
            r0.setPrimaryActionsAdapter(r3)
        L2b:
            androidx.leanback.widget.PlaybackControlsRow r3 = r2.mControlsRow
            androidx.leanback.widget.ObjectAdapter r3 = r3.getSecondaryActionsAdapter()
            if (r3 != 0) goto L44
            androidx.leanback.widget.ArrayObjectAdapter r3 = new androidx.leanback.widget.ArrayObjectAdapter
            androidx.leanback.widget.ControlButtonPresenterSelector r0 = new androidx.leanback.widget.ControlButtonPresenterSelector
            r0.<init>()
            r3.<init>(r0)
            androidx.leanback.widget.PlaybackControlsRow r0 = r2.getControlsRow()
            r0.setSecondaryActionsAdapter(r3)
        L44:
            r2.updateControlsRow()
            return
    }

    public void setPlaybackRowPresenter(androidx.leanback.widget.PlaybackRowPresenter r1) {
            r0 = this;
            r0.mControlsRowPresenter = r1
            return
    }

    public void setSubtitle(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.CharSequence r0 = r1.mSubtitle
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L9
            return
        L9:
            r1.mSubtitle = r2
            androidx.leanback.media.PlaybackGlueHost r2 = r1.getHost()
            if (r2 == 0) goto L18
            androidx.leanback.media.PlaybackGlueHost r2 = r1.getHost()
            r2.notifyPlaybackRowChanged()
        L18:
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTitle
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L9
            return
        L9:
            r1.mTitle = r2
            androidx.leanback.media.PlaybackGlueHost r2 = r1.getHost()
            if (r2 == 0) goto L18
            androidx.leanback.media.PlaybackGlueHost r2 = r1.getHost()
            r2.notifyPlaybackRowChanged()
        L18:
            return
    }
}
