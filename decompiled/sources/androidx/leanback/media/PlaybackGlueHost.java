package androidx.leanback.media;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PlaybackGlueHost {
    public androidx.leanback.media.PlaybackGlue mGlue;

    public static abstract class HostCallback {
        public HostCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onHostDestroy() {
                r0 = this;
                return
        }

        public void onHostPause() {
                r0 = this;
                return
        }

        public void onHostResume() {
                r0 = this;
                return
        }

        public void onHostStart() {
                r0 = this;
                return
        }

        public void onHostStop() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class PlayerCallback {
        public PlayerCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onBufferingStateChanged(boolean r1) {
                r0 = this;
                return
        }

        public void onError(int r1, java.lang.CharSequence r2) {
                r0 = this;
                return
        }

        public void onVideoSizeChanged(int r1, int r2) {
                r0 = this;
                return
        }
    }

    public PlaybackGlueHost() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public void fadeOut() {
            r0 = this;
            return
    }

    public androidx.leanback.media.PlaybackGlueHost.PlayerCallback getPlayerCallback() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void hideControlsOverlay(boolean r1) {
            r0 = this;
            return
    }

    public boolean isControlsOverlayAutoHideEnabled() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isControlsOverlayVisible() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void notifyPlaybackRowChanged() {
            r0 = this;
            return
    }

    public void setControlsOverlayAutoHideEnabled(boolean r1) {
            r0 = this;
            r0.setFadingEnabled(r1)
            return
    }

    @java.lang.Deprecated
    public void setFadingEnabled(boolean r1) {
            r0 = this;
            return
    }

    public void setHostCallback(androidx.leanback.media.PlaybackGlueHost.HostCallback r1) {
            r0 = this;
            return
    }

    public void setOnActionClickedListener(androidx.leanback.widget.OnActionClickedListener r1) {
            r0 = this;
            return
    }

    public void setOnKeyInterceptListener(android.view.View.OnKeyListener r1) {
            r0 = this;
            return
    }

    public void setPlaybackRow(androidx.leanback.widget.Row r1) {
            r0 = this;
            return
    }

    public void setPlaybackRowPresenter(androidx.leanback.widget.PlaybackRowPresenter r1) {
            r0 = this;
            return
    }

    public void showControlsOverlay(boolean r1) {
            r0 = this;
            return
    }
}
