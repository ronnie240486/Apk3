package androidx.leanback.app;

/* JADX INFO: loaded from: classes.dex */
final class DetailsBackgroundVideoHelper {
    private static final long BACKGROUND_CROSS_FADE_DURATION = 500;
    private static final long CROSSFADE_DELAY = 1000;
    public android.animation.ValueAnimator mBackgroundAnimator;
    public android.graphics.drawable.Drawable mBackgroundDrawable;
    private boolean mBackgroundDrawableVisible;
    public androidx.leanback.app.DetailsBackgroundVideoHelper.PlaybackControlStateCallback mControlStateCallback;
    private int mCurrentState;
    private final androidx.leanback.widget.DetailsParallax mDetailsParallax;
    private androidx.leanback.widget.ParallaxEffect mParallaxEffect;
    private androidx.leanback.media.PlaybackGlue mPlaybackGlue;





    /* JADX INFO: loaded from: classes2.dex */
    public class PlaybackControlStateCallback extends androidx.leanback.media.PlaybackGlue.PlayerCallback {
        public final /* synthetic */ androidx.leanback.app.DetailsBackgroundVideoHelper this$0;

        public PlaybackControlStateCallback(androidx.leanback.app.DetailsBackgroundVideoHelper r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.leanback.media.PlaybackGlue.PlayerCallback
        public void onPreparedStateChanged(androidx.leanback.media.PlaybackGlue r1) {
                r0 = this;
                boolean r1 = r1.isPrepared()
                if (r1 == 0) goto Lb
                androidx.leanback.app.DetailsBackgroundVideoHelper r1 = r0.this$0
                r1.internalStartPlayback()
            Lb:
                return
        }
    }

    public DetailsBackgroundVideoHelper(androidx.leanback.widget.DetailsParallax r5, android.graphics.drawable.Drawable r6) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.mCurrentState = r0
            androidx.leanback.app.DetailsBackgroundVideoHelper$PlaybackControlStateCallback r1 = new androidx.leanback.app.DetailsBackgroundVideoHelper$PlaybackControlStateCallback
            r1.<init>(r4)
            r4.mControlStateCallback = r1
            r1 = 0
            r4.mPlaybackGlue = r1
            r4.mDetailsParallax = r5
            r4.mBackgroundDrawable = r6
            r1 = 1
            r4.mBackgroundDrawableVisible = r1
            r2 = 255(0xff, float:3.57E-43)
            r6.setAlpha(r2)
            androidx.leanback.widget.ParallaxEffect r6 = r4.mParallaxEffect
            if (r6 == 0) goto L21
            goto L49
        L21:
            androidx.leanback.widget.Parallax$IntProperty r6 = r5.getOverviewRowTop()
            r2 = 2
            androidx.leanback.widget.Parallax$PropertyMarkerValue[] r2 = new androidx.leanback.widget.Parallax.PropertyMarkerValue[r2]
            r3 = 1065353216(0x3f800000, float:1.0)
            androidx.leanback.widget.Parallax$PropertyMarkerValue r3 = r6.atFraction(r3)
            r2[r0] = r3
            r0 = 0
            androidx.leanback.widget.Parallax$PropertyMarkerValue r6 = r6.atFraction(r0)
            r2[r1] = r6
            androidx.leanback.widget.ParallaxEffect r6 = r5.addEffect(r2)
            androidx.leanback.app.DetailsBackgroundVideoHelper$1 r0 = new androidx.leanback.app.DetailsBackgroundVideoHelper$1
            r0.<init>(r4)
            androidx.leanback.widget.ParallaxEffect r6 = r6.target(r0)
            r4.mParallaxEffect = r6
            r5.updateValues()
        L49:
            return
    }

    private void applyState() {
            r3 = this;
            int r0 = r3.mCurrentState
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L1c
            r1 = 2
            if (r0 == r1) goto La
            goto L35
        La:
            r3.crossFadeBackgroundToVideo(r2, r2)
            androidx.leanback.media.PlaybackGlue r0 = r3.mPlaybackGlue
            if (r0 == 0) goto L35
            androidx.leanback.app.DetailsBackgroundVideoHelper$PlaybackControlStateCallback r1 = r3.mControlStateCallback
            r0.removePlayerCallback(r1)
            androidx.leanback.media.PlaybackGlue r0 = r3.mPlaybackGlue
            r0.pause()
            goto L35
        L1c:
            androidx.leanback.media.PlaybackGlue r0 = r3.mPlaybackGlue
            if (r0 == 0) goto L32
            boolean r0 = r0.isPrepared()
            if (r0 == 0) goto L2a
            r3.internalStartPlayback()
            goto L35
        L2a:
            androidx.leanback.media.PlaybackGlue r0 = r3.mPlaybackGlue
            androidx.leanback.app.DetailsBackgroundVideoHelper$PlaybackControlStateCallback r1 = r3.mControlStateCallback
            r0.addPlayerCallback(r1)
            goto L35
        L32:
            r3.crossFadeBackgroundToVideo(r2, r2)
        L35:
            return
    }

    public final void crossFadeBackgroundToVideo(boolean r6, boolean r7) {
            r5 = this;
            r0 = r6 ^ 1
            boolean r1 = r5.mBackgroundDrawableVisible
            r2 = 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            if (r1 != r0) goto L20
            if (r7 == 0) goto L1f
            android.animation.ValueAnimator r7 = r5.mBackgroundAnimator
            if (r7 == 0) goto L15
            r7.cancel()
            r5.mBackgroundAnimator = r3
        L15:
            android.graphics.drawable.Drawable r7 = r5.mBackgroundDrawable
            if (r7 == 0) goto L1f
            if (r6 == 0) goto L1c
            r2 = 0
        L1c:
            r7.setAlpha(r2)
        L1f:
            return
        L20:
            r5.mBackgroundDrawableVisible = r0
            android.animation.ValueAnimator r0 = r5.mBackgroundAnimator
            if (r0 == 0) goto L2b
            r0.cancel()
            r5.mBackgroundAnimator = r3
        L2b:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            if (r6 == 0) goto L33
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L34
        L33:
            r3 = 0
        L34:
            if (r6 == 0) goto L37
            r0 = 0
        L37:
            android.graphics.drawable.Drawable r1 = r5.mBackgroundDrawable
            if (r1 != 0) goto L3c
            return
        L3c:
            if (r7 == 0) goto L45
            if (r6 == 0) goto L41
            r2 = 0
        L41:
            r1.setAlpha(r2)
            return
        L45:
            r6 = 2
            float[] r6 = new float[r6]
            r6[r4] = r3
            r7 = 1
            r6[r7] = r0
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofFloat(r6)
            r5.mBackgroundAnimator = r6
            r0 = 500(0x1f4, double:2.47E-321)
            r6.setDuration(r0)
            android.animation.ValueAnimator r6 = r5.mBackgroundAnimator
            androidx.leanback.app.DetailsBackgroundVideoHelper$3 r7 = new androidx.leanback.app.DetailsBackgroundVideoHelper$3
            r7.<init>(r5)
            r6.addUpdateListener(r7)
            android.animation.ValueAnimator r6 = r5.mBackgroundAnimator
            androidx.leanback.app.DetailsBackgroundVideoHelper$4 r7 = new androidx.leanback.app.DetailsBackgroundVideoHelper$4
            r7.<init>(r5)
            r6.addListener(r7)
            android.animation.ValueAnimator r6 = r5.mBackgroundAnimator
            r6.start()
            return
    }

    public final void internalStartPlayback() {
            r4 = this;
            androidx.leanback.media.PlaybackGlue r0 = r4.mPlaybackGlue
            if (r0 == 0) goto L7
            r0.play()
        L7:
            androidx.leanback.widget.DetailsParallax r0 = r4.mDetailsParallax
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            androidx.leanback.app.DetailsBackgroundVideoHelper$2 r1 = new androidx.leanback.app.DetailsBackgroundVideoHelper$2
            r1.<init>(r4)
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)
            return
    }

    public final boolean isVideoVisible() {
            r2 = this;
            int r0 = r2.mCurrentState
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public final void setPlaybackGlue(androidx.leanback.media.PlaybackGlue r3) {
            r2 = this;
            androidx.leanback.media.PlaybackGlue r0 = r2.mPlaybackGlue
            if (r0 == 0) goto L9
            androidx.leanback.app.DetailsBackgroundVideoHelper$PlaybackControlStateCallback r1 = r2.mControlStateCallback
            r0.removePlayerCallback(r1)
        L9:
            r2.mPlaybackGlue = r3
            r2.applyState()
            return
    }

    public final void stopParallax() {
            r2 = this;
            androidx.leanback.widget.DetailsParallax r0 = r2.mDetailsParallax
            androidx.leanback.widget.ParallaxEffect r1 = r2.mParallaxEffect
            r0.removeEffect(r1)
            return
    }

    public final void updateState(int r2) {
            r1 = this;
            int r0 = r1.mCurrentState
            if (r2 != r0) goto L5
            return
        L5:
            r1.mCurrentState = r2
            r1.applyState()
            return
    }
}
