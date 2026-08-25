package androidx.leanback.media;

/* JADX INFO: loaded from: classes3.dex */
public class MediaPlayerAdapter extends androidx.leanback.media.PlayerAdapter {
    public long mBufferedProgress;
    public boolean mBufferingStart;
    public android.content.Context mContext;
    public final android.os.Handler mHandler;
    public boolean mHasDisplay;
    public boolean mInitialized;
    public android.net.Uri mMediaSourceUri;
    public final android.media.MediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    public final android.media.MediaPlayer.OnCompletionListener mOnCompletionListener;
    public final android.media.MediaPlayer.OnErrorListener mOnErrorListener;
    public final android.media.MediaPlayer.OnInfoListener mOnInfoListener;
    public android.media.MediaPlayer.OnPreparedListener mOnPreparedListener;
    public final android.media.MediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    public final android.media.MediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;
    public final android.media.MediaPlayer mPlayer;
    public final java.lang.Runnable mRunnable;
    public androidx.leanback.media.SurfaceHolderGlueHost mSurfaceHolderGlueHost;









    public class VideoPlayerSurfaceHolderCallback implements android.view.SurfaceHolder.Callback {
        public final /* synthetic */ androidx.leanback.media.MediaPlayerAdapter this$0;

        public VideoPlayerSurfaceHolderCallback(androidx.leanback.media.MediaPlayerAdapter r1) {
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
                androidx.leanback.media.MediaPlayerAdapter r0 = r1.this$0
                r0.setDisplay(r2)
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(android.view.SurfaceHolder r2) {
                r1 = this;
                androidx.leanback.media.MediaPlayerAdapter r2 = r1.this$0
                r0 = 0
                r2.setDisplay(r0)
                return
        }
    }

    public MediaPlayerAdapter(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.media.MediaPlayer r0 = new android.media.MediaPlayer
            r0.<init>()
            r1.mPlayer = r0
            androidx.leanback.media.MediaPlayerAdapter$1 r0 = new androidx.leanback.media.MediaPlayerAdapter$1
            r0.<init>(r1)
            r1.mRunnable = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r1.mHandler = r0
            r0 = 0
            r1.mInitialized = r0
            r0 = 0
            r1.mMediaSourceUri = r0
            androidx.leanback.media.MediaPlayerAdapter$2 r0 = new androidx.leanback.media.MediaPlayerAdapter$2
            r0.<init>(r1)
            r1.mOnPreparedListener = r0
            androidx.leanback.media.MediaPlayerAdapter$3 r0 = new androidx.leanback.media.MediaPlayerAdapter$3
            r0.<init>(r1)
            r1.mOnCompletionListener = r0
            androidx.leanback.media.MediaPlayerAdapter$4 r0 = new androidx.leanback.media.MediaPlayerAdapter$4
            r0.<init>(r1)
            r1.mOnBufferingUpdateListener = r0
            androidx.leanback.media.MediaPlayerAdapter$5 r0 = new androidx.leanback.media.MediaPlayerAdapter$5
            r0.<init>(r1)
            r1.mOnVideoSizeChangedListener = r0
            androidx.leanback.media.MediaPlayerAdapter$6 r0 = new androidx.leanback.media.MediaPlayerAdapter$6
            r0.<init>(r1)
            r1.mOnErrorListener = r0
            androidx.leanback.media.MediaPlayerAdapter$7 r0 = new androidx.leanback.media.MediaPlayerAdapter$7
            r0.<init>(r1)
            r1.mOnSeekCompleteListener = r0
            androidx.leanback.media.MediaPlayerAdapter$8 r0 = new androidx.leanback.media.MediaPlayerAdapter$8
            r0.<init>(r1)
            r1.mOnInfoListener = r0
            r1.mContext = r2
            return
    }

    private void prepareMediaForPlaying() {
            r3 = this;
            r3.reset()
            android.net.Uri r0 = r3.mMediaSourceUri     // Catch: java.io.IOException -> L55
            if (r0 == 0) goto L54
            android.media.MediaPlayer r1 = r3.mPlayer     // Catch: java.io.IOException -> L55
            android.content.Context r2 = r3.mContext     // Catch: java.io.IOException -> L55
            r1.setDataSource(r2, r0)     // Catch: java.io.IOException -> L55
            android.media.MediaPlayer r0 = r3.mPlayer
            r1 = 3
            r0.setAudioStreamType(r1)
            android.media.MediaPlayer r0 = r3.mPlayer
            android.media.MediaPlayer$OnPreparedListener r1 = r3.mOnPreparedListener
            r0.setOnPreparedListener(r1)
            android.media.MediaPlayer r0 = r3.mPlayer
            android.media.MediaPlayer$OnVideoSizeChangedListener r1 = r3.mOnVideoSizeChangedListener
            r0.setOnVideoSizeChangedListener(r1)
            android.media.MediaPlayer r0 = r3.mPlayer
            android.media.MediaPlayer$OnErrorListener r1 = r3.mOnErrorListener
            r0.setOnErrorListener(r1)
            android.media.MediaPlayer r0 = r3.mPlayer
            android.media.MediaPlayer$OnSeekCompleteListener r1 = r3.mOnSeekCompleteListener
            r0.setOnSeekCompleteListener(r1)
            android.media.MediaPlayer r0 = r3.mPlayer
            android.media.MediaPlayer$OnCompletionListener r1 = r3.mOnCompletionListener
            r0.setOnCompletionListener(r1)
            android.media.MediaPlayer r0 = r3.mPlayer
            android.media.MediaPlayer$OnInfoListener r1 = r3.mOnInfoListener
            r0.setOnInfoListener(r1)
            android.media.MediaPlayer r0 = r3.mPlayer
            android.media.MediaPlayer$OnBufferingUpdateListener r1 = r3.mOnBufferingUpdateListener
            r0.setOnBufferingUpdateListener(r1)
            r3.notifyBufferingStartEnd()
            android.media.MediaPlayer r0 = r3.mPlayer
            r0.prepareAsync()
            androidx.leanback.media.PlayerAdapter$Callback r0 = r3.getCallback()
            r0.onPlayStateChanged(r3)
        L54:
            return
        L55:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public final void changeToUnitialized() {
            r1 = this;
            boolean r0 = r1.mInitialized
            if (r0 == 0) goto L15
            r0 = 0
            r1.mInitialized = r0
            r1.notifyBufferingStartEnd()
            boolean r0 = r1.mHasDisplay
            if (r0 == 0) goto L15
            androidx.leanback.media.PlayerAdapter$Callback r0 = r1.getCallback()
            r0.onPreparedStateChanged(r1)
        L15:
            return
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public long getBufferedPosition() {
            r2 = this;
            long r0 = r2.mBufferedProgress
            return r0
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public long getCurrentPosition() {
            r2 = this;
            boolean r0 = r2.mInitialized
            if (r0 == 0) goto Lc
            android.media.MediaPlayer r0 = r2.mPlayer
            int r0 = r0.getCurrentPosition()
            long r0 = (long) r0
            goto Le
        Lc:
            r0 = -1
        Le:
            return r0
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public long getDuration() {
            r2 = this;
            boolean r0 = r2.mInitialized
            if (r0 == 0) goto Lc
            android.media.MediaPlayer r0 = r2.mPlayer
            int r0 = r0.getDuration()
            long r0 = (long) r0
            goto Le
        Lc:
            r0 = -1
        Le:
            return r0
    }

    public final android.media.MediaPlayer getMediaPlayer() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            return r0
    }

    public int getProgressUpdatingInterval() {
            r1 = this;
            r0 = 16
            return r0
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public boolean isPlaying() {
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

    @Override // androidx.leanback.media.PlayerAdapter
    public boolean isPrepared() {
            r1 = this;
            boolean r0 = r1.mInitialized
            if (r0 == 0) goto Le
            androidx.leanback.media.SurfaceHolderGlueHost r0 = r1.mSurfaceHolderGlueHost
            if (r0 == 0) goto Lc
            boolean r0 = r1.mHasDisplay
            if (r0 == 0) goto Le
        Lc:
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public final void notifyBufferingStartEnd() {
            r2 = this;
            androidx.leanback.media.PlayerAdapter$Callback r0 = r2.getCallback()
            boolean r1 = r2.mBufferingStart
            if (r1 != 0) goto Lf
            boolean r1 = r2.mInitialized
            if (r1 != 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            r0.onBufferingStateChanged(r2, r1)
            return
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void onAttachedToHost(androidx.leanback.media.PlaybackGlueHost r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.leanback.media.SurfaceHolderGlueHost
            if (r0 == 0) goto L10
            androidx.leanback.media.SurfaceHolderGlueHost r2 = (androidx.leanback.media.SurfaceHolderGlueHost) r2
            r1.mSurfaceHolderGlueHost = r2
            androidx.leanback.media.MediaPlayerAdapter$VideoPlayerSurfaceHolderCallback r0 = new androidx.leanback.media.MediaPlayerAdapter$VideoPlayerSurfaceHolderCallback
            r0.<init>(r1)
            r2.setSurfaceHolderCallback(r0)
        L10:
            return
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void onDetachedFromHost() {
            r2 = this;
            androidx.leanback.media.SurfaceHolderGlueHost r0 = r2.mSurfaceHolderGlueHost
            if (r0 == 0) goto La
            r1 = 0
            r0.setSurfaceHolderCallback(r1)
            r2.mSurfaceHolderGlueHost = r1
        La:
            r2.reset()
            r2.release()
            return
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void pause() {
            r1 = this;
            boolean r0 = r1.isPlaying()
            if (r0 == 0) goto L12
            android.media.MediaPlayer r0 = r1.mPlayer
            r0.pause()
            androidx.leanback.media.PlayerAdapter$Callback r0 = r1.getCallback()
            r0.onPlayStateChanged(r1)
        L12:
            return
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void play() {
            r1 = this;
            boolean r0 = r1.mInitialized
            if (r0 == 0) goto L20
            android.media.MediaPlayer r0 = r1.mPlayer
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto Ld
            goto L20
        Ld:
            android.media.MediaPlayer r0 = r1.mPlayer
            r0.start()
            androidx.leanback.media.PlayerAdapter$Callback r0 = r1.getCallback()
            r0.onPlayStateChanged(r1)
            androidx.leanback.media.PlayerAdapter$Callback r0 = r1.getCallback()
            r0.onCurrentPositionChanged(r1)
        L20:
            return
    }

    public void release() {
            r1 = this;
            r1.changeToUnitialized()
            r0 = 0
            r1.mHasDisplay = r0
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

    @Override // androidx.leanback.media.PlayerAdapter
    public void seekTo(long r2) {
            r1 = this;
            boolean r0 = r1.mInitialized
            if (r0 != 0) goto L5
            return
        L5:
            android.media.MediaPlayer r0 = r1.mPlayer
            int r3 = (int) r2
            r0.seekTo(r3)
            return
    }

    public boolean setDataSource(android.net.Uri r2) {
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
            r1.prepareMediaForPlaying()
            r2 = 1
            return r2
    }

    public final void setDisplay(android.view.SurfaceHolder r3) {
            r2 = this;
            boolean r0 = r2.mHasDisplay
            if (r3 == 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            r2.mHasDisplay = r1
            if (r0 != r1) goto Lc
            return
        Lc:
            android.media.MediaPlayer r0 = r2.mPlayer
            r0.setDisplay(r3)
            boolean r3 = r2.mHasDisplay
            if (r3 == 0) goto L21
            boolean r3 = r2.mInitialized
            if (r3 == 0) goto L2c
            androidx.leanback.media.PlayerAdapter$Callback r3 = r2.getCallback()
            r3.onPreparedStateChanged(r2)
            goto L2c
        L21:
            boolean r3 = r2.mInitialized
            if (r3 == 0) goto L2c
            androidx.leanback.media.PlayerAdapter$Callback r3 = r2.getCallback()
            r3.onPreparedStateChanged(r2)
        L2c:
            return
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void setProgressUpdatingEnabled(boolean r4) {
            r3 = this;
            android.os.Handler r0 = r3.mHandler
            java.lang.Runnable r1 = r3.mRunnable
            r0.removeCallbacks(r1)
            if (r4 != 0) goto La
            return
        La:
            android.os.Handler r4 = r3.mHandler
            java.lang.Runnable r0 = r3.mRunnable
            int r1 = r3.getProgressUpdatingInterval()
            long r1 = (long) r1
            r4.postDelayed(r0, r1)
            return
    }
}
