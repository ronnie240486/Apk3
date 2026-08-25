package androidx.leanback.media;

/* JADX INFO: loaded from: classes.dex */
public abstract class PlaybackGlue {
    private final android.content.Context mContext;
    private androidx.leanback.media.PlaybackGlueHost mPlaybackGlueHost;
    public java.util.ArrayList<androidx.leanback.media.PlaybackGlue.PlayerCallback> mPlayerCallbacks;



    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class PlayerCallback {
        public PlayerCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onPlayCompleted(androidx.leanback.media.PlaybackGlue r1) {
                r0 = this;
                return
        }

        public void onPlayStateChanged(androidx.leanback.media.PlaybackGlue r1) {
                r0 = this;
                return
        }

        public void onPreparedStateChanged(androidx.leanback.media.PlaybackGlue r1) {
                r0 = this;
                return
        }
    }

    public PlaybackGlue(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            return
    }

    public void addPlayerCallback(androidx.leanback.media.PlaybackGlue.PlayerCallback r2) {
            r1 = this;
            java.util.ArrayList<androidx.leanback.media.PlaybackGlue$PlayerCallback> r0 = r1.mPlayerCallbacks
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mPlayerCallbacks = r0
        Lb:
            java.util.ArrayList<androidx.leanback.media.PlaybackGlue$PlayerCallback> r0 = r1.mPlayerCallbacks
            r0.add(r2)
            return
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    public androidx.leanback.media.PlaybackGlueHost getHost() {
            r1 = this;
            androidx.leanback.media.PlaybackGlueHost r0 = r1.mPlaybackGlueHost
            return r0
    }

    public final java.util.List<androidx.leanback.media.PlaybackGlue.PlayerCallback> getPlayerCallbacks() {
            r2 = this;
            java.util.ArrayList<androidx.leanback.media.PlaybackGlue$PlayerCallback> r0 = r2.mPlayerCallbacks
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<androidx.leanback.media.PlaybackGlue$PlayerCallback> r1 = r2.mPlayerCallbacks
            r0.<init>(r1)
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

    @androidx.annotation.CallSuper
    public void onAttachedToHost(androidx.leanback.media.PlaybackGlueHost r2) {
            r1 = this;
            r1.mPlaybackGlueHost = r2
            androidx.leanback.media.PlaybackGlue$2 r0 = new androidx.leanback.media.PlaybackGlue$2
            r0.<init>(r1)
            r2.setHostCallback(r0)
            return
    }

    @androidx.annotation.CallSuper
    public void onDetachedFromHost() {
            r2 = this;
            androidx.leanback.media.PlaybackGlueHost r0 = r2.mPlaybackGlueHost
            if (r0 == 0) goto La
            r1 = 0
            r0.setHostCallback(r1)
            r2.mPlaybackGlueHost = r1
        La:
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

    public void pause() {
            r0 = this;
            return
    }

    public void play() {
            r0 = this;
            return
    }

    public void playWhenPrepared() {
            r1 = this;
            boolean r0 = r1.isPrepared()
            if (r0 == 0) goto La
            r1.play()
            goto L12
        La:
            androidx.leanback.media.PlaybackGlue$1 r0 = new androidx.leanback.media.PlaybackGlue$1
            r0.<init>(r1)
            r1.addPlayerCallback(r0)
        L12:
            return
    }

    public void previous() {
            r0 = this;
            return
    }

    public void removePlayerCallback(androidx.leanback.media.PlaybackGlue.PlayerCallback r2) {
            r1 = this;
            java.util.ArrayList<androidx.leanback.media.PlaybackGlue$PlayerCallback> r0 = r1.mPlayerCallbacks
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    public final void setHost(androidx.leanback.media.PlaybackGlueHost r4) {
            r3 = this;
            androidx.leanback.media.PlaybackGlueHost r0 = r3.mPlaybackGlueHost
            if (r0 != r4) goto L5
            return
        L5:
            if (r0 == 0) goto L11
            r1 = 0
            androidx.leanback.media.PlaybackGlue r2 = r0.mGlue
            if (r2 == 0) goto Lf
            r2.onDetachedFromHost()
        Lf:
            r0.mGlue = r1
        L11:
            r3.mPlaybackGlueHost = r4
            if (r4 == 0) goto L21
            androidx.leanback.media.PlaybackGlue r0 = r4.mGlue
            if (r0 == 0) goto L1c
            r0.onDetachedFromHost()
        L1c:
            r4.mGlue = r3
            r3.onAttachedToHost(r4)
        L21:
            return
    }
}
