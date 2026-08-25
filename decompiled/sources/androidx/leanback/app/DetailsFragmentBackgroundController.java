package androidx.leanback.app;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class DetailsFragmentBackgroundController {
    public boolean mCanUseHost;
    public android.graphics.Bitmap mCoverBitmap;
    public final androidx.leanback.app.DetailsFragment mFragment;
    public boolean mInitialControlVisible;
    private android.app.Fragment mLastVideoFragmentForGlueHost;
    public androidx.leanback.widget.DetailsParallaxDrawable mParallaxDrawable;
    public int mParallaxDrawableMaxOffset;
    public androidx.leanback.media.PlaybackGlue mPlaybackGlue;
    public int mSolidColor;
    public androidx.leanback.app.DetailsBackgroundVideoHelper mVideoHelper;

    public DetailsFragmentBackgroundController(androidx.leanback.app.DetailsFragment r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mCanUseHost = r0
            r1.mInitialControlVisible = r0
            androidx.leanback.app.DetailsFragmentBackgroundController r0 = r2.mDetailsBackgroundController
            if (r0 != 0) goto L11
            r2.mDetailsBackgroundController = r1
            r1.mFragment = r2
            return
        L11:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Each DetailsFragment is allowed to initialize DetailsFragmentBackgroundController once"
            r2.<init>(r0)
            throw r2
    }

    public boolean canNavigateToVideoFragment() {
            r1 = this;
            androidx.leanback.media.PlaybackGlue r0 = r1.mPlaybackGlue
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void enableParallax() {
            r7 = this;
            int r0 = r7.mParallaxDrawableMaxOffset
            if (r0 != 0) goto L14
            androidx.leanback.app.DetailsFragment r0 = r7.mFragment
            android.content.Context r0 = androidx.leanback.app.FragmentUtil.getContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            int r1 = androidx.leanback.R.dimen.lb_details_cover_drawable_parallax_movement
            int r0 = r0.getDimensionPixelSize(r1)
        L14:
            androidx.leanback.graphics.FitWidthBitmapDrawable r1 = new androidx.leanback.graphics.FitWidthBitmapDrawable
            r1.<init>()
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>()
            androidx.leanback.widget.ParallaxTarget$PropertyValuesHolderTarget r3 = new androidx.leanback.widget.ParallaxTarget$PropertyValuesHolderTarget
            android.util.Property<androidx.leanback.graphics.FitWidthBitmapDrawable, java.lang.Integer> r4 = androidx.leanback.graphics.FitWidthBitmapDrawable.PROPERTY_VERTICAL_OFFSET
            r5 = 2
            int[] r5 = new int[r5]
            r6 = 0
            r5[r6] = r6
            r6 = 1
            int r0 = -r0
            r5[r6] = r0
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofInt(r4, r5)
            r3.<init>(r1, r0)
            r7.enableParallax(r1, r2, r3)
            return
    }

    public void enableParallax(@androidx.annotation.NonNull android.graphics.drawable.Drawable r8, @androidx.annotation.NonNull android.graphics.drawable.Drawable r9, @androidx.annotation.Nullable androidx.leanback.widget.ParallaxTarget.PropertyValuesHolderTarget r10) {
            r7 = this;
            androidx.leanback.widget.DetailsParallaxDrawable r0 = r7.mParallaxDrawable
            if (r0 == 0) goto L5
            return
        L5:
            android.graphics.Bitmap r0 = r7.mCoverBitmap
            if (r0 == 0) goto L13
            boolean r1 = r8 instanceof androidx.leanback.graphics.FitWidthBitmapDrawable
            if (r1 == 0) goto L13
            r1 = r8
            androidx.leanback.graphics.FitWidthBitmapDrawable r1 = (androidx.leanback.graphics.FitWidthBitmapDrawable) r1
            r1.setBitmap(r0)
        L13:
            int r0 = r7.mSolidColor
            if (r0 == 0) goto L21
            boolean r1 = r9 instanceof android.graphics.drawable.ColorDrawable
            if (r1 == 0) goto L21
            r1 = r9
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
            r1.setColor(r0)
        L21:
            androidx.leanback.media.PlaybackGlue r0 = r7.mPlaybackGlue
            if (r0 != 0) goto L5b
            androidx.leanback.widget.DetailsParallaxDrawable r0 = new androidx.leanback.widget.DetailsParallaxDrawable
            androidx.leanback.app.DetailsFragment r1 = r7.mFragment
            android.content.Context r2 = androidx.leanback.app.FragmentUtil.getContext(r1)
            androidx.leanback.app.DetailsFragment r1 = r7.mFragment
            androidx.leanback.widget.DetailsParallax r3 = r1.getParallax()
            r1 = r0
            r4 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r7.mParallaxDrawable = r0
            androidx.leanback.app.DetailsFragment r8 = r7.mFragment
            android.view.View r9 = r8.mBackgroundView
            if (r9 == 0) goto L45
            r9.setBackground(r0)
        L45:
            r8.mBackgroundDrawable = r0
            androidx.leanback.app.DetailsBackgroundVideoHelper r8 = new androidx.leanback.app.DetailsBackgroundVideoHelper
            androidx.leanback.app.DetailsFragment r9 = r7.mFragment
            androidx.leanback.widget.DetailsParallax r9 = r9.getParallax()
            androidx.leanback.widget.DetailsParallaxDrawable r10 = r7.mParallaxDrawable
            android.graphics.drawable.Drawable r10 = r10.getCoverDrawable()
            r8.<init>(r9, r10)
            r7.mVideoHelper = r8
            return
        L5b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "enableParallaxDrawable must be called before enableVideoPlayback"
            r8.<init>(r9)
            throw r8
    }

    public final android.app.Fragment findOrCreateVideoFragment() {
            r4 = this;
            androidx.leanback.app.DetailsFragment r0 = r4.mFragment
            android.app.Fragment r1 = r0.mVideoFragment
            if (r1 == 0) goto L7
            goto L3e
        L7:
            android.app.FragmentManager r1 = r0.getChildFragmentManager()
            int r2 = androidx.leanback.R.id.video_surface_container
            android.app.Fragment r1 = r1.findFragmentById(r2)
            if (r1 != 0) goto L3c
            androidx.leanback.app.DetailsFragmentBackgroundController r3 = r0.mDetailsBackgroundController
            if (r3 == 0) goto L3c
            android.app.FragmentManager r1 = r0.getChildFragmentManager()
            android.app.FragmentTransaction r1 = r1.beginTransaction()
            androidx.leanback.app.DetailsFragmentBackgroundController r3 = r0.mDetailsBackgroundController
            android.app.Fragment r3 = r3.onCreateVideoFragment()
            r1.add(r2, r3)
            r1.commit()
            boolean r1 = r0.mPendingFocusOnVideo
            if (r1 == 0) goto L3b
            android.view.View r1 = r0.getView()
            androidx.leanback.app.DetailsFragment$12 r2 = new androidx.leanback.app.DetailsFragment$12
            r2.<init>(r0)
            r1.post(r2)
        L3b:
            r1 = r3
        L3c:
            r0.mVideoFragment = r1
        L3e:
            return r1
    }

    public final android.graphics.drawable.Drawable getBottomDrawable() {
            r1 = this;
            androidx.leanback.widget.DetailsParallaxDrawable r0 = r1.mParallaxDrawable
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.graphics.drawable.Drawable r0 = r0.getBottomDrawable()
            return r0
    }

    public final android.graphics.Bitmap getCoverBitmap() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.mCoverBitmap
            return r0
    }

    public final android.graphics.drawable.Drawable getCoverDrawable() {
            r1 = this;
            androidx.leanback.widget.DetailsParallaxDrawable r0 = r1.mParallaxDrawable
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.graphics.drawable.Drawable r0 = r0.getCoverDrawable()
            return r0
    }

    public final int getParallaxDrawableMaxOffset() {
            r1 = this;
            int r0 = r1.mParallaxDrawableMaxOffset
            return r0
    }

    public final androidx.leanback.media.PlaybackGlue getPlaybackGlue() {
            r1 = this;
            androidx.leanback.media.PlaybackGlue r0 = r1.mPlaybackGlue
            return r0
    }

    @androidx.annotation.ColorInt
    public final int getSolidColor() {
            r1 = this;
            int r0 = r1.mSolidColor
            return r0
    }

    public androidx.leanback.media.PlaybackGlueHost onCreateGlueHost() {
            r2 = this;
            androidx.leanback.app.VideoFragmentGlueHost r0 = new androidx.leanback.app.VideoFragmentGlueHost
            android.app.Fragment r1 = r2.findOrCreateVideoFragment()
            androidx.leanback.app.VideoFragment r1 = (androidx.leanback.app.VideoFragment) r1
            r0.<init>(r1)
            return r0
    }

    public android.app.Fragment onCreateVideoFragment() {
            r1 = this;
            androidx.leanback.app.VideoFragment r0 = new androidx.leanback.app.VideoFragment
            r0.<init>()
            return r0
    }

    public final void onStart() {
            r4 = this;
            boolean r0 = r4.mCanUseHost
            if (r0 != 0) goto L24
            r0 = 1
            r4.mCanUseHost = r0
            androidx.leanback.media.PlaybackGlue r0 = r4.mPlaybackGlue
            if (r0 == 0) goto L24
            androidx.leanback.media.PlaybackGlueHost r1 = r4.onCreateGlueHost()
            boolean r2 = r4.mInitialControlVisible
            r3 = 0
            if (r2 == 0) goto L18
            r1.showControlsOverlay(r3)
            goto L1b
        L18:
            r1.hideControlsOverlay(r3)
        L1b:
            r0.setHost(r1)
            android.app.Fragment r0 = r4.findOrCreateVideoFragment()
            r4.mLastVideoFragmentForGlueHost = r0
        L24:
            androidx.leanback.media.PlaybackGlue r0 = r4.mPlaybackGlue
            if (r0 == 0) goto L33
            boolean r0 = r0.isPrepared()
            if (r0 == 0) goto L33
            androidx.leanback.media.PlaybackGlue r0 = r4.mPlaybackGlue
            r0.play()
        L33:
            return
    }

    public final void setCoverBitmap(android.graphics.Bitmap r2) {
            r1 = this;
            r1.mCoverBitmap = r2
            android.graphics.drawable.Drawable r2 = r1.getCoverDrawable()
            boolean r0 = r2 instanceof androidx.leanback.graphics.FitWidthBitmapDrawable
            if (r0 == 0) goto L11
            androidx.leanback.graphics.FitWidthBitmapDrawable r2 = (androidx.leanback.graphics.FitWidthBitmapDrawable) r2
            android.graphics.Bitmap r0 = r1.mCoverBitmap
            r2.setBitmap(r0)
        L11:
            return
    }

    public final void setParallaxDrawableMaxOffset(int r2) {
            r1 = this;
            androidx.leanback.widget.DetailsParallaxDrawable r0 = r1.mParallaxDrawable
            if (r0 != 0) goto L7
            r1.mParallaxDrawableMaxOffset = r2
            return
        L7:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "enableParallax already called"
            r2.<init>(r0)
            throw r2
    }

    public final void setSolidColor(@androidx.annotation.ColorInt int r3) {
            r2 = this;
            r2.mSolidColor = r3
            android.graphics.drawable.Drawable r0 = r2.getBottomDrawable()
            boolean r1 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r1 == 0) goto Lf
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            r0.setColor(r3)
        Lf:
            return
    }

    public void setupVideoPlayback(@androidx.annotation.NonNull androidx.leanback.media.PlaybackGlue r4) {
            r3 = this;
            androidx.leanback.media.PlaybackGlue r0 = r3.mPlaybackGlue
            if (r0 != r4) goto L5
            return
        L5:
            r1 = 0
            if (r0 == 0) goto L12
            androidx.leanback.media.PlaybackGlueHost r0 = r0.getHost()
            androidx.leanback.media.PlaybackGlue r2 = r3.mPlaybackGlue
            r2.setHost(r1)
            r1 = r0
        L12:
            r3.mPlaybackGlue = r4
            androidx.leanback.app.DetailsBackgroundVideoHelper r0 = r3.mVideoHelper
            r0.setPlaybackGlue(r4)
            boolean r4 = r3.mCanUseHost
            if (r4 == 0) goto L4d
            androidx.leanback.media.PlaybackGlue r4 = r3.mPlaybackGlue
            if (r4 == 0) goto L4d
            if (r1 == 0) goto L32
            android.app.Fragment r4 = r3.mLastVideoFragmentForGlueHost
            android.app.Fragment r0 = r3.findOrCreateVideoFragment()
            if (r4 == r0) goto L2c
            goto L32
        L2c:
            androidx.leanback.media.PlaybackGlue r4 = r3.mPlaybackGlue
            r4.setHost(r1)
            goto L4d
        L32:
            androidx.leanback.media.PlaybackGlue r4 = r3.mPlaybackGlue
            androidx.leanback.media.PlaybackGlueHost r0 = r3.onCreateGlueHost()
            boolean r1 = r3.mInitialControlVisible
            r2 = 0
            if (r1 == 0) goto L41
            r0.showControlsOverlay(r2)
            goto L44
        L41:
            r0.hideControlsOverlay(r2)
        L44:
            r4.setHost(r0)
            android.app.Fragment r4 = r3.findOrCreateVideoFragment()
            r3.mLastVideoFragmentForGlueHost = r4
        L4d:
            return
    }

    public final void switchToRows() {
            r2 = this;
            androidx.leanback.app.DetailsFragment r0 = r2.mFragment
            r1 = 0
            r0.mPendingFocusOnVideo = r1
            androidx.leanback.widget.VerticalGridView r0 = r0.getVerticalGridView()
            if (r0 == 0) goto L14
            int r1 = r0.getChildCount()
            if (r1 <= 0) goto L14
            r0.requestFocus()
        L14:
            return
    }

    public final void switchToVideo() {
            r1 = this;
            androidx.leanback.app.DetailsFragment r0 = r1.mFragment
            r0.switchToVideo()
            return
    }
}
