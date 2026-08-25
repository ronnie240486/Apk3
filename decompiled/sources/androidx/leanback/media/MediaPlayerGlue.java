package androidx.leanback.media;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@java.lang.Deprecated
public class MediaPlayerGlue extends androidx.leanback.media.PlaybackControlGlue implements androidx.leanback.widget.OnItemViewSelectedListener {
    public static final int FAST_FORWARD_REWIND_REPEAT_DELAY = 200;
    public static final int FAST_FORWARD_REWIND_STEP = 10000;
    public static final int NO_REPEAT = 0;
    public static final int REPEAT_ALL = 2;
    public static final int REPEAT_ONE = 1;
    private static final java.lang.String TAG = "MediaPlayerGlue";
    private java.lang.String mArtist;
    private android.graphics.drawable.Drawable mCover;
    public android.os.Handler mHandler;
    public boolean mInitialized;
    private long mLastKeyDownEvent;
    private java.lang.String mMediaSourcePath;
    private android.net.Uri mMediaSourceUri;
    private android.media.MediaPlayer.OnCompletionListener mOnCompletionListener;
    public android.media.MediaPlayer mPlayer;
    private final androidx.leanback.widget.PlaybackControlsRow.RepeatAction mRepeatAction;
    private java.lang.Runnable mRunnable;
    private androidx.leanback.widget.Action mSelectedAction;
    public final androidx.leanback.widget.PlaybackControlsRow.ThumbsDownAction mThumbsDownAction;
    public final androidx.leanback.widget.PlaybackControlsRow.ThumbsUpAction mThumbsUpAction;
    private java.lang.String mTitle;






    public class VideoPlayerSurfaceHolderCallback implements android.view.SurfaceHolder.Callback {
        public final /* synthetic */ androidx.leanback.media.MediaPlayerGlue this$0;

        public VideoPlayerSurfaceHolderCallback(androidx.leanback.media.MediaPlayerGlue r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(android.view.SurfaceHolder r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(android.view.SurfaceHolder r2) {
                r1 = this;
                androidx.leanback.media.MediaPlayerGlue r0 = r1.this$0
                r0.setDisplay(r2)
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(android.view.SurfaceHolder r2) {
                r1 = this;
                androidx.leanback.media.MediaPlayerGlue r2 = r1.this$0
                r0 = 0
                r2.setDisplay(r0)
                return
        }
    }

    public MediaPlayerGlue(android.content.Context r5) {
            r4 = this;
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r1[r2] = r0
            int[] r3 = new int[r0]
            r3[r2] = r0
            r4.<init>(r5, r1, r3)
            return
    }

    public MediaPlayerGlue(android.content.Context r1, int[] r2, int[] r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.media.MediaPlayer r1 = new android.media.MediaPlayer
            r1.<init>()
            r0.mPlayer = r1
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            r0.mHandler = r1
            r1 = 0
            r0.mInitialized = r1
            r1 = 0
            r0.mLastKeyDownEvent = r1
            r1 = 0
            r0.mMediaSourceUri = r1
            r0.mMediaSourcePath = r1
            androidx.leanback.widget.PlaybackControlsRow$RepeatAction r1 = new androidx.leanback.widget.PlaybackControlsRow$RepeatAction
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2)
            r0.mRepeatAction = r1
            androidx.leanback.widget.PlaybackControlsRow$ThumbsDownAction r1 = new androidx.leanback.widget.PlaybackControlsRow$ThumbsDownAction
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2)
            r0.mThumbsDownAction = r1
            androidx.leanback.widget.PlaybackControlsRow$ThumbsUpAction r2 = new androidx.leanback.widget.PlaybackControlsRow$ThumbsUpAction
            android.content.Context r3 = r0.getContext()
            r2.<init>(r3)
            r0.mThumbsUpAction = r2
            r3 = 1
            r1.setIndex(r3)
            r2.setIndex(r3)
            return
    }

    private void prepareMediaForPlaying() {
            r3 = this;
            r3.reset()
            android.net.Uri r0 = r3.mMediaSourceUri     // Catch: java.io.IOException -> L48
            if (r0 == 0) goto L13
            android.media.MediaPlayer r0 = r3.mPlayer     // Catch: java.io.IOException -> L48
            android.content.Context r1 = r3.getContext()     // Catch: java.io.IOException -> L48
            android.net.Uri r2 = r3.mMediaSourceUri     // Catch: java.io.IOException -> L48
            r0.setDataSource(r1, r2)     // Catch: java.io.IOException -> L48
            goto L1c
        L13:
            java.lang.String r0 = r3.mMediaSourcePath     // Catch: java.io.IOException -> L48
            if (r0 == 0) goto L47
            android.media.MediaPlayer r1 = r3.mPlayer     // Catch: java.io.IOException -> L48
            r1.setDataSource(r0)     // Catch: java.io.IOException -> L48
        L1c:
            android.media.MediaPlayer r0 = r3.mPlayer
            r1 = 3
            r0.setAudioStreamType(r1)
            android.media.MediaPlayer r0 = r3.mPlayer
            androidx.leanback.media.MediaPlayerGlue$4 r1 = new androidx.leanback.media.MediaPlayerGlue$4
            r1.<init>(r3)
            r0.setOnPreparedListener(r1)
            android.media.MediaPlayer$OnCompletionListener r0 = r3.mOnCompletionListener
            if (r0 == 0) goto L35
            android.media.MediaPlayer r1 = r3.mPlayer
            r1.setOnCompletionListener(r0)
        L35:
            android.media.MediaPlayer r0 = r3.mPlayer
            androidx.leanback.media.MediaPlayerGlue$5 r1 = new androidx.leanback.media.MediaPlayerGlue$5
            r1.<init>(r3)
            r0.setOnBufferingUpdateListener(r1)
            android.media.MediaPlayer r0 = r3.mPlayer
            r0.prepareAsync()
            r3.onStateChanged()
        L47:
            return
        L48:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public final void changeToUnitialized() {
            r2 = this;
            boolean r0 = r2.mInitialized
            if (r0 == 0) goto L23
            r0 = 0
            r2.mInitialized = r0
            java.util.List r0 = r2.getPlayerCallbacks()
            if (r0 == 0) goto L23
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.leanback.media.PlaybackGlue$PlayerCallback r1 = (androidx.leanback.media.PlaybackGlue.PlayerCallback) r1
            r1.onPreparedStateChanged(r2)
            goto L13
        L23:
            return
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public void enableProgressUpdating(boolean r4) {
            r3 = this;
            java.lang.Runnable r0 = r3.mRunnable
            if (r0 == 0) goto L9
            android.os.Handler r1 = r3.mHandler
            r1.removeCallbacks(r0)
        L9:
            if (r4 != 0) goto Lc
            return
        Lc:
            java.lang.Runnable r4 = r3.mRunnable
            if (r4 != 0) goto L17
            androidx.leanback.media.MediaPlayerGlue$1 r4 = new androidx.leanback.media.MediaPlayerGlue$1
            r4.<init>(r3)
            r3.mRunnable = r4
        L17:
            android.os.Handler r4 = r3.mHandler
            java.lang.Runnable r0 = r3.mRunnable
            int r1 = r3.getUpdatePeriod()
            long r1 = (long) r1
            r4.postDelayed(r0, r1)
            return
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public int getCurrentPosition() {
            r1 = this;
            boolean r0 = r1.mInitialized
            if (r0 == 0) goto Lb
            android.media.MediaPlayer r0 = r1.mPlayer
            int r0 = r0.getCurrentPosition()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public int getCurrentSpeedId() {
            r1 = this;
            boolean r0 = r1.isMediaPlaying()
            return r0
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public android.graphics.drawable.Drawable getMediaArt() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mCover
            return r0
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public int getMediaDuration() {
            r1 = this;
            boolean r0 = r1.mInitialized
            if (r0 == 0) goto Lb
            android.media.MediaPlayer r0 = r1.mPlayer
            int r0 = r0.getDuration()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public java.lang.CharSequence getMediaSubtitle() {
            r1 = this;
            java.lang.String r0 = r1.mArtist
            if (r0 == 0) goto L5
            goto L7
        L5:
            java.lang.String r0 = "N/a"
        L7:
            return r0
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public java.lang.CharSequence getMediaTitle() {
            r1 = this;
            java.lang.String r0 = r1.mTitle
            if (r0 == 0) goto L5
            goto L7
        L5:
            java.lang.String r0 = "N/a"
        L7:
            return r0
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public long getSupportedActions() {
            r2 = this;
            r0 = 224(0xe0, double:1.107E-321)
            return r0
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public boolean hasValidMedia() {
            r1 = this;
            java.lang.String r0 = r1.mTitle
            if (r0 == 0) goto Le
            java.lang.String r0 = r1.mMediaSourcePath
            if (r0 != 0) goto Lc
            android.net.Uri r0 = r1.mMediaSourceUri
            if (r0 == 0) goto Le
        Lc:
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public boolean isMediaPlaying() {
            r1 = this;
            boolean r0 = r1.mInitialized
            if (r0 == 0) goto Le
            android.media.MediaPlayer r0 = r1.mPlayer
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // androidx.leanback.media.PlaybackControlGlue, androidx.leanback.media.PlaybackGlue
    public boolean isPlaying() {
            r1 = this;
            boolean r0 = r1.isMediaPlaying()
            return r0
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public boolean isPrepared() {
            r1 = this;
            boolean r0 = r1.mInitialized
            return r0
    }

    @Override // androidx.leanback.media.PlaybackControlGlue, androidx.leanback.widget.OnActionClickedListener
    public void onActionClicked(androidx.leanback.widget.Action r4) {
            r3 = this;
            super.onActionClicked(r4)
            boolean r0 = r4 instanceof androidx.leanback.widget.PlaybackControlsRow.RepeatAction
            if (r0 == 0) goto Ld
            androidx.leanback.widget.PlaybackControlsRow$RepeatAction r4 = (androidx.leanback.widget.PlaybackControlsRow.RepeatAction) r4
            r4.nextIndex()
            goto L44
        Ld:
            androidx.leanback.widget.PlaybackControlsRow$ThumbsUpAction r0 = r3.mThumbsUpAction
            r1 = 0
            r2 = 1
            if (r4 != r0) goto L2a
            int r4 = r0.getIndex()
            if (r4 != 0) goto L1f
            androidx.leanback.widget.PlaybackControlsRow$ThumbsUpAction r4 = r3.mThumbsUpAction
            r4.setIndex(r2)
            goto L44
        L1f:
            androidx.leanback.widget.PlaybackControlsRow$ThumbsUpAction r4 = r3.mThumbsUpAction
            r4.setIndex(r1)
            androidx.leanback.widget.PlaybackControlsRow$ThumbsDownAction r4 = r3.mThumbsDownAction
            r4.setIndex(r2)
            goto L44
        L2a:
            androidx.leanback.widget.PlaybackControlsRow$ThumbsDownAction r0 = r3.mThumbsDownAction
            if (r4 != r0) goto L44
            int r4 = r0.getIndex()
            if (r4 != 0) goto L3a
            androidx.leanback.widget.PlaybackControlsRow$ThumbsDownAction r4 = r3.mThumbsDownAction
            r4.setIndex(r2)
            goto L44
        L3a:
            androidx.leanback.widget.PlaybackControlsRow$ThumbsDownAction r4 = r3.mThumbsDownAction
            r4.setIndex(r1)
            androidx.leanback.widget.PlaybackControlsRow$ThumbsUpAction r4 = r3.mThumbsUpAction
            r4.setIndex(r2)
        L44:
            r3.onMetadataChanged()
            return
    }

    @Override // androidx.leanback.media.PlaybackControlGlue, androidx.leanback.media.PlaybackGlue
    public final void onAttachedToHost(androidx.leanback.media.PlaybackGlueHost r2) {
            r1 = this;
            super.onAttachedToHost(r2)
            boolean r0 = r2 instanceof androidx.leanback.media.SurfaceHolderGlueHost
            if (r0 == 0) goto L11
            androidx.leanback.media.SurfaceHolderGlueHost r2 = (androidx.leanback.media.SurfaceHolderGlueHost) r2
            androidx.leanback.media.MediaPlayerGlue$VideoPlayerSurfaceHolderCallback r0 = new androidx.leanback.media.MediaPlayerGlue$VideoPlayerSurfaceHolderCallback
            r0.<init>(r1)
            r2.setSurfaceHolderCallback(r0)
        L11:
            return
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public final void onCreateSecondaryActions(androidx.leanback.widget.ArrayObjectAdapter r2) {
            r1 = this;
            androidx.leanback.widget.PlaybackControlsRow$RepeatAction r0 = r1.mRepeatAction
            r2.add(r0)
            androidx.leanback.widget.PlaybackControlsRow$ThumbsDownAction r0 = r1.mThumbsDownAction
            r2.add(r0)
            androidx.leanback.widget.PlaybackControlsRow$ThumbsUpAction r0 = r1.mThumbsUpAction
            r2.add(r0)
            return
    }

    @Override // androidx.leanback.media.PlaybackControlGlue, androidx.leanback.media.PlaybackGlue
    public final void onDetachedFromHost() {
            r2 = this;
            androidx.leanback.media.PlaybackGlueHost r0 = r2.getHost()
            boolean r0 = r0 instanceof androidx.leanback.media.SurfaceHolderGlueHost
            if (r0 == 0) goto L12
            androidx.leanback.media.PlaybackGlueHost r0 = r2.getHost()
            androidx.leanback.media.SurfaceHolderGlueHost r0 = (androidx.leanback.media.SurfaceHolderGlueHost) r0
            r1 = 0
            r0.setSurfaceHolderCallback(r1)
        L12:
            r2.reset()
            r2.release()
            super.onDetachedFromHost()
            return
    }

    /* JADX INFO: renamed from: onItemSelected, reason: avoid collision after fix types in other method */
    public void onItemSelected2(androidx.leanback.widget.Presenter.ViewHolder r1, java.lang.Object r2, androidx.leanback.widget.RowPresenter.ViewHolder r3, androidx.leanback.widget.Row r4) {
            r0 = this;
            boolean r1 = r2 instanceof androidx.leanback.widget.Action
            if (r1 == 0) goto L9
            androidx.leanback.widget.Action r2 = (androidx.leanback.widget.Action) r2
            r0.mSelectedAction = r2
            goto Lc
        L9:
            r1 = 0
            r0.mSelectedAction = r1
        Lc:
            return
    }

    @Override // androidx.leanback.widget.BaseOnItemViewSelectedListener
    public /* bridge */ /* synthetic */ void onItemSelected(androidx.leanback.widget.Presenter.ViewHolder r1, java.lang.Object r2, androidx.leanback.widget.RowPresenter.ViewHolder r3, androidx.leanback.widget.Row r4) {
            r0 = this;
            androidx.leanback.widget.Row r4 = (androidx.leanback.widget.Row) r4
            r0.onItemSelected2(r1, r2, r3, r4)
            return
    }

    @Override // androidx.leanback.media.PlaybackControlGlue, android.view.View.OnKeyListener
    public boolean onKey(android.view.View r8, int r9, android.view.KeyEvent r10) {
            r7 = this;
            androidx.leanback.widget.Action r0 = r7.mSelectedAction
            boolean r1 = r0 instanceof androidx.leanback.widget.PlaybackControlsRow.RewindAction
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Lf
            boolean r0 = r0 instanceof androidx.leanback.widget.PlaybackControlsRow.FastForwardAction
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            if (r0 == 0) goto L18
            boolean r0 = r7.mInitialized
            if (r0 == 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 == 0) goto L25
            int r0 = r10.getKeyCode()
            r1 = 23
            if (r0 != r1) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            if (r0 == 0) goto L30
            int r0 = r10.getAction()
            if (r0 != 0) goto L30
            r0 = 1
            goto L31
        L30:
            r0 = 0
        L31:
            if (r0 == 0) goto L42
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r7.mLastKeyDownEvent
            long r0 = r0 - r4
            r4 = 200(0xc8, double:9.9E-322)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L42
            r0 = 1
            goto L43
        L42:
            r0 = 0
        L43:
            if (r0 == 0) goto L76
            long r8 = java.lang.System.currentTimeMillis()
            r7.mLastKeyDownEvent = r8
            int r8 = r7.getCurrentPosition()
            int r8 = r8 + 10000
            androidx.leanback.widget.Action r9 = r7.mSelectedAction
            boolean r9 = r9 instanceof androidx.leanback.widget.PlaybackControlsRow.RewindAction
            if (r9 == 0) goto L5d
            int r8 = r7.getCurrentPosition()
            int r8 = r8 + (-10000)
        L5d:
            if (r8 >= 0) goto L60
            goto L61
        L60:
            r2 = r8
        L61:
            int r8 = r7.getMediaDuration()
            if (r2 <= r8) goto L6b
            int r2 = r7.getMediaDuration()
        L6b:
            boolean r8 = r7.mInitialized
            if (r8 != 0) goto L70
            goto L75
        L70:
            android.media.MediaPlayer r8 = r7.mPlayer
            r8.seekTo(r2)
        L75:
            return r3
        L76:
            boolean r8 = super.onKey(r8, r9, r10)
            return r8
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public void pause() {
            r1 = this;
            boolean r0 = r1.isMediaPlaying()
            if (r0 == 0) goto Le
            android.media.MediaPlayer r0 = r1.mPlayer
            r0.pause()
            r1.onStateChanged()
        Le:
            return
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public void play(int r1) {
            r0 = this;
            boolean r1 = r0.mInitialized
            if (r1 == 0) goto L1b
            android.media.MediaPlayer r1 = r0.mPlayer
            boolean r1 = r1.isPlaying()
            if (r1 == 0) goto Ld
            goto L1b
        Ld:
            android.media.MediaPlayer r1 = r0.mPlayer
            r1.start()
            r0.onMetadataChanged()
            r0.onStateChanged()
            r0.updateProgress()
        L1b:
            return
    }

    public void release() {
            r1 = this;
            r1.changeToUnitialized()
            android.media.MediaPlayer r0 = r1.mPlayer
            r0.release()
            return
    }

    public void reset() {
            r1 = this;
            r1.changeToUnitialized()
            android.media.MediaPlayer r0 = r1.mPlayer
            r0.reset()
            return
    }

    public void setArtist(java.lang.String r1) {
            r0 = this;
            r0.mArtist = r1
            return
    }

    public void setCover(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mCover = r1
            return
    }

    public void setDisplay(android.view.SurfaceHolder r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            r0.setDisplay(r2)
            return
    }

    public boolean setMediaSource(android.net.Uri r2) {
            r1 = this;
            android.net.Uri r0 = r1.mMediaSourceUri
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lf
            goto Ld
        Lb:
            if (r2 != 0) goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r1.mMediaSourceUri = r2
            r2 = 0
            r1.mMediaSourcePath = r2
            r1.prepareMediaForPlaying()
            r2 = 1
            return r2
    }

    public boolean setMediaSource(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.mMediaSourcePath
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lf
            goto Ld
        Lb:
            if (r2 != 0) goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r0 = 0
            r1.mMediaSourceUri = r0
            r1.mMediaSourcePath = r2
            r1.prepareMediaForPlaying()
            r2 = 1
            return r2
    }

    public void setMode(int r2) {
            r1 = this;
            if (r2 == 0) goto L19
            r0 = 1
            if (r2 == r0) goto L11
            r0 = 2
            if (r2 == r0) goto L9
            goto L1c
        L9:
            androidx.leanback.media.MediaPlayerGlue$3 r2 = new androidx.leanback.media.MediaPlayerGlue$3
            r2.<init>(r1)
            r1.mOnCompletionListener = r2
            goto L1c
        L11:
            androidx.leanback.media.MediaPlayerGlue$2 r2 = new androidx.leanback.media.MediaPlayerGlue$2
            r2.<init>(r1)
            r1.mOnCompletionListener = r2
            goto L1c
        L19:
            r2 = 0
            r1.mOnCompletionListener = r2
        L1c:
            return
    }

    public void setTitle(java.lang.String r1) {
            r0 = this;
            r0.mTitle = r1
            return
    }

    public void setVideoUrl(java.lang.String r1) {
            r0 = this;
            r0.setMediaSource(r1)
            r0.onMetadataChanged()
            return
    }
}
