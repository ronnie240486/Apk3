package androidx.leanback.media;

/* JADX INFO: loaded from: classes.dex */
public class MediaControllerAdapter extends androidx.leanback.media.PlayerAdapter {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "MediaControllerAdapter";
    private android.support.v4.media.session.MediaControllerCompat mController;
    public android.os.Handler mHandler;
    public boolean mIsBuffering;
    public android.support.v4.media.session.MediaControllerCompat.Callback mMediaControllerCallback;
    private final java.lang.Runnable mPositionUpdaterRunnable;



    public MediaControllerAdapter(android.support.v4.media.session.MediaControllerCompat r2) {
            r1 = this;
            r1.<init>()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r1.mHandler = r0
            androidx.leanback.media.MediaControllerAdapter$1 r0 = new androidx.leanback.media.MediaControllerAdapter$1
            r0.<init>(r1)
            r1.mPositionUpdaterRunnable = r0
            r0 = 0
            r1.mIsBuffering = r0
            androidx.leanback.media.MediaControllerAdapter$2 r0 = new androidx.leanback.media.MediaControllerAdapter$2
            r0.<init>(r1)
            r1.mMediaControllerCallback = r0
            java.lang.String r0 = "Object of MediaControllerCompat is null"
            java.util.Objects.requireNonNull(r2, r0)
            r1.mController = r2
            return
    }

    private int mapRepeatActionToRepeatMode(int r3) {
            r2 = this;
            if (r3 == 0) goto Lc
            r0 = 2
            r1 = 1
            if (r3 == r1) goto Lb
            if (r3 == r0) goto La
            r3 = -1
            return r3
        La:
            return r1
        Lb:
            return r0
        Lc:
            r3 = 0
            return r3
    }

    private int mapShuffleActionToShuffleMode(int r2) {
            r1 = this;
            if (r2 == 0) goto L8
            r0 = 1
            if (r2 == r0) goto L7
            r2 = -1
            return r2
        L7:
            return r0
        L8:
            r2 = 0
            return r2
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void fastForward() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mController
            android.support.v4.media.session.MediaControllerCompat$TransportControls r0 = r0.getTransportControls()
            r0.fastForward()
            return
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public long getBufferedPosition() {
            r2 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r2.mController
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.getPlaybackState()
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            android.support.v4.media.session.MediaControllerCompat r0 = r2.mController
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.getPlaybackState()
            long r0 = r0.getBufferedPosition()
            return r0
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public long getCurrentPosition() {
            r2 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r2.mController
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.getPlaybackState()
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            android.support.v4.media.session.MediaControllerCompat r0 = r2.mController
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.getPlaybackState()
            long r0 = r0.getPosition()
            return r0
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public long getDuration() {
            r2 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r2.mController
            android.support.v4.media.MediaMetadataCompat r0 = r0.getMetadata()
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            android.support.v4.media.session.MediaControllerCompat r0 = r2.mController
            android.support.v4.media.MediaMetadataCompat r0 = r0.getMetadata()
            java.lang.String r1 = "android.media.metadata.DURATION"
            long r0 = r0.getLong(r1)
            int r1 = (int) r0
            long r0 = (long) r1
            return r0
    }

    public android.graphics.drawable.Drawable getMediaArt(android.content.Context r3) {
            r2 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r2.mController
            android.support.v4.media.MediaMetadataCompat r0 = r0.getMetadata()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.support.v4.media.session.MediaControllerCompat r0 = r2.mController
            android.support.v4.media.MediaMetadataCompat r0 = r0.getMetadata()
            android.support.v4.media.MediaDescriptionCompat r0 = r0.getDescription()
            android.graphics.Bitmap r0 = r0.getIconBitmap()
            if (r0 != 0) goto L1b
            goto L24
        L1b:
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r3 = r3.getResources()
            r1.<init>(r3, r0)
        L24:
            return r1
    }

    public android.support.v4.media.session.MediaControllerCompat getMediaController() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mController
            return r0
    }

    public java.lang.CharSequence getMediaSubtitle() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mController
            android.support.v4.media.MediaMetadataCompat r0 = r0.getMetadata()
            if (r0 != 0) goto Lb
            java.lang.String r0 = ""
            return r0
        Lb:
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mController
            android.support.v4.media.MediaMetadataCompat r0 = r0.getMetadata()
            android.support.v4.media.MediaDescriptionCompat r0 = r0.getDescription()
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    public java.lang.CharSequence getMediaTitle() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mController
            android.support.v4.media.MediaMetadataCompat r0 = r0.getMetadata()
            if (r0 != 0) goto Lb
            java.lang.String r0 = ""
            return r0
        Lb:
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mController
            android.support.v4.media.MediaMetadataCompat r0 = r0.getMetadata()
            android.support.v4.media.MediaDescriptionCompat r0 = r0.getDescription()
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public long getSupportedActions() {
            r18 = this;
            r0 = r18
            android.support.v4.media.session.MediaControllerCompat r1 = r0.mController
            android.support.v4.media.session.PlaybackStateCompat r1 = r1.getPlaybackState()
            r2 = 0
            if (r1 != 0) goto Ld
            return r2
        Ld:
            android.support.v4.media.session.MediaControllerCompat r1 = r0.mController
            android.support.v4.media.session.PlaybackStateCompat r1 = r1.getPlaybackState()
            long r4 = r1.getActions()
            r6 = 512(0x200, double:2.53E-321)
            long r8 = r4 & r6
            r10 = 64
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 == 0) goto L23
            r8 = r10
            goto L24
        L23:
            r8 = r2
        L24:
            r12 = 32
            long r14 = r4 & r12
            int r1 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r1 == 0) goto L2f
            r14 = 256(0x100, double:1.265E-321)
            long r8 = r8 | r14
        L2f:
            r14 = 16
            long r16 = r4 & r14
            int r1 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r1 == 0) goto L38
            long r8 = r8 | r14
        L38:
            long r10 = r10 & r4
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 == 0) goto L40
            r10 = 128(0x80, double:6.3E-322)
            long r8 = r8 | r10
        L40:
            r10 = 8
            long r10 = r10 & r4
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 == 0) goto L48
            long r8 = r8 | r12
        L48:
            r10 = 262144(0x40000, double:1.295163E-318)
            long r10 = r10 & r4
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 == 0) goto L51
            long r8 = r8 | r6
        L51:
            r6 = 2097152(0x200000, double:1.036131E-317)
            long r4 = r4 & r6
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L5c
            r1 = 1024(0x400, double:5.06E-321)
            long r8 = r8 | r1
        L5c:
            return r8
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public boolean isPlaying() {
            r3 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r3.mController
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.getPlaybackState()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.support.v4.media.session.MediaControllerCompat r0 = r3.mController
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.getPlaybackState()
            int r0 = r0.getState()
            r2 = 3
            if (r0 == r2) goto L31
            android.support.v4.media.session.MediaControllerCompat r0 = r3.mController
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.getPlaybackState()
            int r0 = r0.getState()
            r2 = 4
            if (r0 == r2) goto L31
            android.support.v4.media.session.MediaControllerCompat r0 = r3.mController
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.getPlaybackState()
            int r0 = r0.getState()
            r2 = 5
            if (r0 != r2) goto L32
        L31:
            r1 = 1
        L32:
            return r1
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void next() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mController
            android.support.v4.media.session.MediaControllerCompat$TransportControls r0 = r0.getTransportControls()
            r0.skipToNext()
            return
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void onAttachedToHost(androidx.leanback.media.PlaybackGlueHost r2) {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r2 = r1.mController
            android.support.v4.media.session.MediaControllerCompat$Callback r0 = r1.mMediaControllerCallback
            r2.registerCallback(r0)
            return
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void onDetachedFromHost() {
            r2 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r2.mController
            android.support.v4.media.session.MediaControllerCompat$Callback r1 = r2.mMediaControllerCallback
            r0.unregisterCallback(r1)
            return
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void pause() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mController
            android.support.v4.media.session.MediaControllerCompat$TransportControls r0 = r0.getTransportControls()
            r0.pause()
            return
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void play() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mController
            android.support.v4.media.session.MediaControllerCompat$TransportControls r0 = r0.getTransportControls()
            r0.play()
            return
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void previous() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mController
            android.support.v4.media.session.MediaControllerCompat$TransportControls r0 = r0.getTransportControls()
            r0.skipToPrevious()
            return
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void rewind() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mController
            android.support.v4.media.session.MediaControllerCompat$TransportControls r0 = r0.getTransportControls()
            r0.rewind()
            return
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void seekTo(long r2) {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mController
            android.support.v4.media.session.MediaControllerCompat$TransportControls r0 = r0.getTransportControls()
            r0.seekTo(r2)
            return
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void setProgressUpdatingEnabled(boolean r4) {
            r3 = this;
            android.os.Handler r0 = r3.mHandler
            java.lang.Runnable r1 = r3.mPositionUpdaterRunnable
            r0.removeCallbacks(r1)
            if (r4 != 0) goto La
            return
        La:
            android.os.Handler r4 = r3.mHandler
            java.lang.Runnable r0 = r3.mPositionUpdaterRunnable
            r1 = 16
            long r1 = (long) r1
            r4.postDelayed(r0, r1)
            return
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void setRepeatAction(int r2) {
            r1 = this;
            int r2 = r1.mapRepeatActionToRepeatMode(r2)
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mController
            android.support.v4.media.session.MediaControllerCompat$TransportControls r0 = r0.getTransportControls()
            r0.setRepeatMode(r2)
            return
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void setShuffleAction(int r2) {
            r1 = this;
            int r2 = r1.mapShuffleActionToShuffleMode(r2)
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mController
            android.support.v4.media.session.MediaControllerCompat$TransportControls r0 = r0.getTransportControls()
            r0.setShuffleMode(r2)
            return
    }
}
