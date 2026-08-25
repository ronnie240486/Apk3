package androidx.leanback.app;

/* JADX INFO: loaded from: classes2.dex */
public class VideoSupportFragmentGlueHost extends androidx.leanback.app.PlaybackSupportFragmentGlueHost implements androidx.leanback.media.SurfaceHolderGlueHost {
    private final androidx.leanback.app.VideoSupportFragment mFragment;

    public VideoSupportFragmentGlueHost(androidx.leanback.app.VideoSupportFragment r1) {
            r0 = this;
            r0.<init>(r1)
            r0.mFragment = r1
            return
    }

    @Override // androidx.leanback.media.SurfaceHolderGlueHost
    public void setSurfaceHolderCallback(android.view.SurfaceHolder.Callback r2) {
            r1 = this;
            androidx.leanback.app.VideoSupportFragment r0 = r1.mFragment
            r0.setSurfaceHolderCallback(r2)
            return
    }
}
