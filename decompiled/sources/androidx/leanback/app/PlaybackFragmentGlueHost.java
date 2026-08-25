package androidx.leanback.app;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class PlaybackFragmentGlueHost extends androidx.leanback.media.PlaybackGlueHost implements androidx.leanback.widget.PlaybackSeekUi {
    public final androidx.leanback.app.PlaybackFragment mFragment;
    public final androidx.leanback.media.PlaybackGlueHost.PlayerCallback mPlayerCallback;



    public PlaybackFragmentGlueHost(androidx.leanback.app.PlaybackFragment r2) {
            r1 = this;
            r1.<init>()
            androidx.leanback.app.PlaybackFragmentGlueHost$2 r0 = new androidx.leanback.app.PlaybackFragmentGlueHost$2
            r0.<init>(r1)
            r1.mPlayerCallback = r0
            r1.mFragment = r2
            return
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void fadeOut() {
            r1 = this;
            androidx.leanback.app.PlaybackFragment r0 = r1.mFragment
            r0.fadeOut()
            return
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public androidx.leanback.media.PlaybackGlueHost.PlayerCallback getPlayerCallback() {
            r1 = this;
            androidx.leanback.media.PlaybackGlueHost$PlayerCallback r0 = r1.mPlayerCallback
            return r0
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void hideControlsOverlay(boolean r2) {
            r1 = this;
            androidx.leanback.app.PlaybackFragment r0 = r1.mFragment
            r0.hideControlsOverlay(r2)
            return
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public boolean isControlsOverlayAutoHideEnabled() {
            r1 = this;
            androidx.leanback.app.PlaybackFragment r0 = r1.mFragment
            boolean r0 = r0.isControlsOverlayAutoHideEnabled()
            return r0
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public boolean isControlsOverlayVisible() {
            r1 = this;
            androidx.leanback.app.PlaybackFragment r0 = r1.mFragment
            boolean r0 = r0.isControlsOverlayVisible()
            return r0
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void notifyPlaybackRowChanged() {
            r1 = this;
            androidx.leanback.app.PlaybackFragment r0 = r1.mFragment
            r0.notifyPlaybackRowChanged()
            return
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void setControlsOverlayAutoHideEnabled(boolean r2) {
            r1 = this;
            androidx.leanback.app.PlaybackFragment r0 = r1.mFragment
            r0.setControlsOverlayAutoHideEnabled(r2)
            return
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void setHostCallback(androidx.leanback.media.PlaybackGlueHost.HostCallback r2) {
            r1 = this;
            androidx.leanback.app.PlaybackFragment r0 = r1.mFragment
            r0.setHostCallback(r2)
            return
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void setOnActionClickedListener(androidx.leanback.widget.OnActionClickedListener r3) {
            r2 = this;
            if (r3 != 0) goto L9
            androidx.leanback.app.PlaybackFragment r3 = r2.mFragment
            r0 = 0
            r3.setOnPlaybackItemViewClickedListener(r0)
            goto L13
        L9:
            androidx.leanback.app.PlaybackFragment r0 = r2.mFragment
            androidx.leanback.app.PlaybackFragmentGlueHost$1 r1 = new androidx.leanback.app.PlaybackFragmentGlueHost$1
            r1.<init>(r3)
            r0.setOnPlaybackItemViewClickedListener(r1)
        L13:
            return
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void setOnKeyInterceptListener(android.view.View.OnKeyListener r2) {
            r1 = this;
            androidx.leanback.app.PlaybackFragment r0 = r1.mFragment
            r0.setOnKeyInterceptListener(r2)
            return
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void setPlaybackRow(androidx.leanback.widget.Row r2) {
            r1 = this;
            androidx.leanback.app.PlaybackFragment r0 = r1.mFragment
            r0.setPlaybackRow(r2)
            return
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void setPlaybackRowPresenter(androidx.leanback.widget.PlaybackRowPresenter r2) {
            r1 = this;
            androidx.leanback.app.PlaybackFragment r0 = r1.mFragment
            r0.setPlaybackRowPresenter(r2)
            return
    }

    @Override // androidx.leanback.widget.PlaybackSeekUi
    public void setPlaybackSeekUiClient(androidx.leanback.widget.PlaybackSeekUi.Client r2) {
            r1 = this;
            androidx.leanback.app.PlaybackFragment r0 = r1.mFragment
            r0.setPlaybackSeekUiClient(r2)
            return
    }

    @Override // androidx.leanback.media.PlaybackGlueHost
    public void showControlsOverlay(boolean r2) {
            r1 = this;
            androidx.leanback.app.PlaybackFragment r0 = r1.mFragment
            r0.showControlsOverlay(r2)
            return
    }
}
