package androidx.leanback.app;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class VideoFragmentGlueHost extends androidx.leanback.app.PlaybackFragmentGlueHost implements androidx.leanback.media.SurfaceHolderGlueHost {
    private final androidx.leanback.app.VideoFragment mFragment;

    public VideoFragmentGlueHost(androidx.leanback.app.VideoFragment r1) {
            r0 = this;
            r0.<init>(r1)
            r0.mFragment = r1
            return
    }

    @Override // androidx.leanback.media.SurfaceHolderGlueHost
    public void setSurfaceHolderCallback(android.view.SurfaceHolder.Callback r2) {
            r1 = this;
            androidx.leanback.app.VideoFragment r0 = r1.mFragment
            r0.setSurfaceHolderCallback(r2)
            return
    }
}
