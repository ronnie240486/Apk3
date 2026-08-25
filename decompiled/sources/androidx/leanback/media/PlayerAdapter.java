package androidx.leanback.media;

/* JADX INFO: loaded from: classes.dex */
public abstract class PlayerAdapter {
    public androidx.leanback.media.PlayerAdapter.Callback mCallback;

    public static class Callback {
        public Callback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onBufferedPositionChanged(androidx.leanback.media.PlayerAdapter r1) {
                r0 = this;
                return
        }

        public void onBufferingStateChanged(androidx.leanback.media.PlayerAdapter r1, boolean r2) {
                r0 = this;
                return
        }

        public void onCurrentPositionChanged(androidx.leanback.media.PlayerAdapter r1) {
                r0 = this;
                return
        }

        public void onDurationChanged(androidx.leanback.media.PlayerAdapter r1) {
                r0 = this;
                return
        }

        public void onError(androidx.leanback.media.PlayerAdapter r1, int r2, java.lang.String r3) {
                r0 = this;
                return
        }

        public void onMetadataChanged(androidx.leanback.media.PlayerAdapter r1) {
                r0 = this;
                return
        }

        public void onPlayCompleted(androidx.leanback.media.PlayerAdapter r1) {
                r0 = this;
                return
        }

        public void onPlayStateChanged(androidx.leanback.media.PlayerAdapter r1) {
                r0 = this;
                return
        }

        public void onPreparedStateChanged(androidx.leanback.media.PlayerAdapter r1) {
                r0 = this;
                return
        }

        public void onVideoSizeChanged(androidx.leanback.media.PlayerAdapter r1, int r2, int r3) {
                r0 = this;
                return
        }
    }

    public PlayerAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public void fastForward() {
            r0 = this;
            return
    }

    public long getBufferedPosition() {
            r2 = this;
            r0 = 0
            return r0
    }

    public final androidx.leanback.media.PlayerAdapter.Callback getCallback() {
            r1 = this;
            androidx.leanback.media.PlayerAdapter$Callback r0 = r1.mCallback
            return r0
    }

    public long getCurrentPosition() {
            r2 = this;
            r0 = 0
            return r0
    }

    public long getDuration() {
            r2 = this;
            r0 = 0
            return r0
    }

    public long getSupportedActions() {
            r2 = this;
            r0 = 64
            return r0
    }

    public boolean isPlaying() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isPrepared() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void next() {
            r0 = this;
            return
    }

    public void onAttachedToHost(androidx.leanback.media.PlaybackGlueHost r1) {
            r0 = this;
            return
    }

    public void onDetachedFromHost() {
            r0 = this;
            return
    }

    public abstract void pause();

    public abstract void play();

    public void previous() {
            r0 = this;
            return
    }

    public void rewind() {
            r0 = this;
            return
    }

    public void seekTo(long r1) {
            r0 = this;
            return
    }

    public final void setCallback(androidx.leanback.media.PlayerAdapter.Callback r1) {
            r0 = this;
            r0.mCallback = r1
            return
    }

    public void setProgressUpdatingEnabled(boolean r1) {
            r0 = this;
            return
    }

    public void setRepeatAction(int r1) {
            r0 = this;
            return
    }

    public void setShuffleAction(int r1) {
            r0 = this;
            return
    }
}
