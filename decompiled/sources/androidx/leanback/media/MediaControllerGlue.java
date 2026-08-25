package androidx.leanback.media;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class MediaControllerGlue extends androidx.leanback.media.PlaybackControlGlue {
    private final android.support.v4.media.session.MediaControllerCompat.Callback mCallback;
    public android.support.v4.media.session.MediaControllerCompat mMediaController;


    public MediaControllerGlue(android.content.Context r1, int[] r2, int[] r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            androidx.leanback.media.MediaControllerGlue$1 r1 = new androidx.leanback.media.MediaControllerGlue$1
            r1.<init>(r0)
            r0.mCallback = r1
            return
    }

    public void attachToMediaController(android.support.v4.media.session.MediaControllerCompat r2) {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mMediaController
            if (r2 == r0) goto L16
            r1.detach()
            r1.mMediaController = r2
            if (r2 == 0) goto L10
            android.support.v4.media.session.MediaControllerCompat$Callback r0 = r1.mCallback
            r2.registerCallback(r0)
        L10:
            r1.onMetadataChanged()
            r1.onStateChanged()
        L16:
            return
    }

    public void detach() {
            r2 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r2.mMediaController
            if (r0 == 0) goto L9
            android.support.v4.media.session.MediaControllerCompat$Callback r1 = r2.mCallback
            r0.unregisterCallback(r1)
        L9:
            r0 = 0
            r2.mMediaController = r0
            return
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public int getCurrentPosition() {
            r2 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r2.mMediaController
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.getPlaybackState()
            long r0 = r0.getPosition()
            int r1 = (int) r0
            return r1
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public int getCurrentSpeedId() {
            r5 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r5.mMediaController
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.getPlaybackState()
            float r0 = r0.getPlaybackSpeed()
            int r0 = (int) r0
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r2 = 1
            if (r0 != r2) goto L13
            return r2
        L13:
            if (r0 <= 0) goto L26
            int[] r2 = r5.getFastForwardSpeeds()
        L19:
            int r3 = r2.length
            if (r1 >= r3) goto L38
            r3 = r2[r1]
            if (r0 != r3) goto L23
            int r1 = r1 + 10
            return r1
        L23:
            int r1 = r1 + 1
            goto L19
        L26:
            int[] r2 = r5.getRewindSpeeds()
        L2a:
            int r3 = r2.length
            if (r1 >= r3) goto L38
            int r3 = -r0
            r4 = r2[r1]
            if (r3 != r4) goto L35
            int r0 = (-10) - r1
            return r0
        L35:
            int r1 = r1 + 1
            goto L2a
        L38:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Couldn't find index for speed "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MediaControllerGlue"
            android.util.Log.w(r1, r0)
            r0 = -1
            return r0
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public android.graphics.drawable.Drawable getMediaArt() {
            r3 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r3.mMediaController
            android.support.v4.media.MediaMetadataCompat r0 = r0.getMetadata()
            android.support.v4.media.MediaDescriptionCompat r0 = r0.getDescription()
            android.graphics.Bitmap r0 = r0.getIconBitmap()
            if (r0 != 0) goto L12
            r0 = 0
            goto L20
        L12:
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.Context r2 = r3.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r1.<init>(r2, r0)
            r0 = r1
        L20:
            return r0
    }

    public final android.support.v4.media.session.MediaControllerCompat getMediaController() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mMediaController
            return r0
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public int getMediaDuration() {
            r2 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r2.mMediaController
            android.support.v4.media.MediaMetadataCompat r0 = r0.getMetadata()
            java.lang.String r1 = "android.media.metadata.DURATION"
            long r0 = r0.getLong(r1)
            int r1 = (int) r0
            return r1
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public java.lang.CharSequence getMediaSubtitle() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mMediaController
            android.support.v4.media.MediaMetadataCompat r0 = r0.getMetadata()
            android.support.v4.media.MediaDescriptionCompat r0 = r0.getDescription()
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public java.lang.CharSequence getMediaTitle() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mMediaController
            android.support.v4.media.MediaMetadataCompat r0 = r0.getMetadata()
            android.support.v4.media.MediaDescriptionCompat r0 = r0.getDescription()
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public long getSupportedActions() {
            r15 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r15.mMediaController
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.getPlaybackState()
            long r0 = r0.getActions()
            r2 = 512(0x200, double:2.53E-321)
            long r2 = r2 & r0
            r4 = 64
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L17
            r2 = r4
            goto L18
        L17:
            r2 = r6
        L18:
            r8 = 32
            long r10 = r0 & r8
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L23
            r10 = 256(0x100, double:1.265E-321)
            long r2 = r2 | r10
        L23:
            r10 = 16
            long r12 = r0 & r10
            int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r14 == 0) goto L2c
            long r2 = r2 | r10
        L2c:
            long r4 = r4 & r0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 == 0) goto L34
            r4 = 128(0x80, double:6.3E-322)
            long r2 = r2 | r4
        L34:
            r4 = 8
            long r0 = r0 & r4
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r2 = r2 | r8
        L3c:
            return r2
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public boolean hasValidMedia() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mMediaController
            if (r0 == 0) goto Lc
            android.support.v4.media.MediaMetadataCompat r0 = r0.getMetadata()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public boolean isMediaPlaying() {
            r2 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r2.mMediaController
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.getPlaybackState()
            int r0 = r0.getState()
            r1 = 3
            if (r0 != r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public void next() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mMediaController
            android.support.v4.media.session.MediaControllerCompat$TransportControls r0 = r0.getTransportControls()
            r0.skipToNext()
            return
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public void pause() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mMediaController
            android.support.v4.media.session.MediaControllerCompat$TransportControls r0 = r0.getTransportControls()
            r0.pause()
            return
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public void play(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto Ld
            android.support.v4.media.session.MediaControllerCompat r2 = r1.mMediaController
            android.support.v4.media.session.MediaControllerCompat$TransportControls r2 = r2.getTransportControls()
            r2.play()
            goto L22
        Ld:
            if (r2 <= 0) goto L19
            android.support.v4.media.session.MediaControllerCompat r2 = r1.mMediaController
            android.support.v4.media.session.MediaControllerCompat$TransportControls r2 = r2.getTransportControls()
            r2.fastForward()
            goto L22
        L19:
            android.support.v4.media.session.MediaControllerCompat r2 = r1.mMediaController
            android.support.v4.media.session.MediaControllerCompat$TransportControls r2 = r2.getTransportControls()
            r2.rewind()
        L22:
            return
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public void previous() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mMediaController
            android.support.v4.media.session.MediaControllerCompat$TransportControls r0 = r0.getTransportControls()
            r0.skipToPrevious()
            return
    }
}
