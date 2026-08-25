package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public interface PlaybackSeekUi {

    public static class Client {
        public Client() {
                r0 = this;
                r0.<init>()
                return
        }

        public androidx.leanback.widget.PlaybackSeekDataProvider getPlaybackSeekDataProvider() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean isSeekEnabled() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void onSeekFinished(boolean r1) {
                r0 = this;
                return
        }

        public void onSeekPositionChanged(long r1) {
                r0 = this;
                return
        }

        public void onSeekStarted() {
                r0 = this;
                return
        }
    }

    void setPlaybackSeekUiClient(androidx.leanback.widget.PlaybackSeekUi.Client r1);
}
