package androidx.leanback.app;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class VideoFragment extends androidx.leanback.app.PlaybackFragment {
    public android.view.SurfaceHolder.Callback mMediaPlaybackCallback;
    public int mState;
    public android.view.SurfaceView mVideoSurface;


    public VideoFragment() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mState = r0
            return
    }

    public android.view.SurfaceView getSurfaceView() {
            r1 = this;
            android.view.SurfaceView r0 = r1.mVideoSurface
            return r0
    }

    @Override // androidx.leanback.app.PlaybackFragment, android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            android.view.View r2 = super.onCreateView(r2, r3, r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.content.Context r3 = androidx.leanback.app.FragmentUtil.getContext(r1)
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            int r4 = androidx.leanback.R.layout.lb_video_surface
            r0 = 0
            android.view.View r3 = r3.inflate(r4, r2, r0)
            android.view.SurfaceView r3 = (android.view.SurfaceView) r3
            r1.mVideoSurface = r3
            r2.addView(r3, r0)
            android.view.SurfaceView r3 = r1.mVideoSurface
            android.view.SurfaceHolder r3 = r3.getHolder()
            androidx.leanback.app.VideoFragment$1 r4 = new androidx.leanback.app.VideoFragment$1
            r4.<init>(r1)
            r3.addCallback(r4)
            r3 = 2
            r1.setBackgroundType(r3)
            return r2
    }

    @Override // androidx.leanback.app.PlaybackFragment, android.app.Fragment
    public void onDestroyView() {
            r1 = this;
            r0 = 0
            r1.mVideoSurface = r0
            r0 = 0
            r1.mState = r0
            super.onDestroyView()
            return
    }

    @Override // androidx.leanback.app.PlaybackFragment
    public final void onVideoSizeChanged(int r6, int r7) {
            r5 = this;
            android.view.View r0 = r5.getView()
            int r0 = r0.getWidth()
            android.view.View r1 = r5.getView()
            int r1 = r1.getHeight()
            android.view.SurfaceView r2 = r5.mVideoSurface
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            int r3 = r0 * r7
            int r4 = r6 * r1
            if (r3 <= r4) goto L22
            r2.height = r1
            int r4 = r4 / r7
            r2.width = r4
            goto L27
        L22:
            r2.width = r0
            int r3 = r3 / r6
            r2.height = r3
        L27:
            android.view.SurfaceView r6 = r5.mVideoSurface
            r6.setLayoutParams(r2)
            return
    }

    public void setSurfaceHolderCallback(android.view.SurfaceHolder.Callback r3) {
            r2 = this;
            r2.mMediaPlaybackCallback = r3
            if (r3 == 0) goto L12
            int r0 = r2.mState
            r1 = 1
            if (r0 != r1) goto L12
            android.view.SurfaceView r0 = r2.mVideoSurface
            android.view.SurfaceHolder r0 = r0.getHolder()
            r3.surfaceCreated(r0)
        L12:
            return
    }
}
