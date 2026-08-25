package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
final class DefaultMediaClock implements com.google.android.exoplayer2.util.MediaClock {
    private boolean isUsingStandaloneClock;
    private final com.google.android.exoplayer2.DefaultMediaClock.PlaybackParametersListener listener;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.util.MediaClock rendererClock;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Renderer rendererClockSource;
    private final com.google.android.exoplayer2.util.StandaloneMediaClock standaloneClock;
    private boolean standaloneClockIsStarted;

    public interface PlaybackParametersListener {
        void onPlaybackParametersChanged(com.google.android.exoplayer2.PlaybackParameters r1);
    }

    public DefaultMediaClock(com.google.android.exoplayer2.DefaultMediaClock.PlaybackParametersListener r1, com.google.android.exoplayer2.util.Clock r2) {
            r0 = this;
            r0.<init>()
            r0.listener = r1
            com.google.android.exoplayer2.util.StandaloneMediaClock r1 = new com.google.android.exoplayer2.util.StandaloneMediaClock
            r1.<init>(r2)
            r0.standaloneClock = r1
            r1 = 1
            r0.isUsingStandaloneClock = r1
            return
    }

    private boolean shouldUseStandaloneClock(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.Renderer r0 = r1.rendererClockSource
            if (r0 == 0) goto L1f
            boolean r0 = r0.isEnded()
            if (r0 != 0) goto L1f
            com.google.android.exoplayer2.Renderer r0 = r1.rendererClockSource
            boolean r0 = r0.isReady()
            if (r0 != 0) goto L1d
            if (r2 != 0) goto L1f
            com.google.android.exoplayer2.Renderer r2 = r1.rendererClockSource
            boolean r2 = r2.hasReadStreamToEnd()
            if (r2 == 0) goto L1d
            goto L1f
        L1d:
            r2 = 0
            goto L20
        L1f:
            r2 = 1
        L20:
            return r2
    }

    private void syncClocks(boolean r6) {
            r5 = this;
            boolean r6 = r5.shouldUseStandaloneClock(r6)
            if (r6 == 0) goto L13
            r6 = 1
            r5.isUsingStandaloneClock = r6
            boolean r6 = r5.standaloneClockIsStarted
            if (r6 == 0) goto L12
            com.google.android.exoplayer2.util.StandaloneMediaClock r6 = r5.standaloneClock
            r6.start()
        L12:
            return
        L13:
            com.google.android.exoplayer2.util.MediaClock r6 = r5.rendererClock
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            com.google.android.exoplayer2.util.MediaClock r6 = (com.google.android.exoplayer2.util.MediaClock) r6
            long r0 = r6.getPositionUs()
            boolean r2 = r5.isUsingStandaloneClock
            if (r2 == 0) goto L3f
            com.google.android.exoplayer2.util.StandaloneMediaClock r2 = r5.standaloneClock
            long r2 = r2.getPositionUs()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L33
            com.google.android.exoplayer2.util.StandaloneMediaClock r6 = r5.standaloneClock
            r6.stop()
            return
        L33:
            r2 = 0
            r5.isUsingStandaloneClock = r2
            boolean r2 = r5.standaloneClockIsStarted
            if (r2 == 0) goto L3f
            com.google.android.exoplayer2.util.StandaloneMediaClock r2 = r5.standaloneClock
            r2.start()
        L3f:
            com.google.android.exoplayer2.util.StandaloneMediaClock r2 = r5.standaloneClock
            r2.resetPosition(r0)
            com.google.android.exoplayer2.PlaybackParameters r6 = r6.getPlaybackParameters()
            com.google.android.exoplayer2.util.StandaloneMediaClock r0 = r5.standaloneClock
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.getPlaybackParameters()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L5e
            com.google.android.exoplayer2.util.StandaloneMediaClock r0 = r5.standaloneClock
            r0.setPlaybackParameters(r6)
            com.google.android.exoplayer2.DefaultMediaClock$PlaybackParametersListener r0 = r5.listener
            r0.onPlaybackParametersChanged(r6)
        L5e:
            return
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters() {
            r1 = this;
            com.google.android.exoplayer2.util.MediaClock r0 = r1.rendererClock
            if (r0 == 0) goto L9
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.getPlaybackParameters()
            goto Lf
        L9:
            com.google.android.exoplayer2.util.StandaloneMediaClock r0 = r1.standaloneClock
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.getPlaybackParameters()
        Lf:
            return r0
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public long getPositionUs() {
            r2 = this;
            boolean r0 = r2.isUsingStandaloneClock
            if (r0 == 0) goto Lb
            com.google.android.exoplayer2.util.StandaloneMediaClock r0 = r2.standaloneClock
            long r0 = r0.getPositionUs()
            goto L17
        Lb:
            com.google.android.exoplayer2.util.MediaClock r0 = r2.rendererClock
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.util.MediaClock r0 = (com.google.android.exoplayer2.util.MediaClock) r0
            long r0 = r0.getPositionUs()
        L17:
            return r0
    }

    public void onRendererDisabled(com.google.android.exoplayer2.Renderer r2) {
            r1 = this;
            com.google.android.exoplayer2.Renderer r0 = r1.rendererClockSource
            if (r2 != r0) goto Lc
            r2 = 0
            r1.rendererClock = r2
            r1.rendererClockSource = r2
            r2 = 1
            r1.isUsingStandaloneClock = r2
        Lc:
            return
    }

    public void onRendererEnabled(com.google.android.exoplayer2.Renderer r3) throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            com.google.android.exoplayer2.util.MediaClock r0 = r3.getMediaClock()
            if (r0 == 0) goto L26
            com.google.android.exoplayer2.util.MediaClock r1 = r2.rendererClock
            if (r0 == r1) goto L26
            if (r1 != 0) goto L1a
            r2.rendererClock = r0
            r2.rendererClockSource = r3
            com.google.android.exoplayer2.util.StandaloneMediaClock r3 = r2.standaloneClock
            com.google.android.exoplayer2.PlaybackParameters r3 = r3.getPlaybackParameters()
            r0.setPlaybackParameters(r3)
            goto L26
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Multiple renderer media clocks enabled."
            r3.<init>(r0)
            com.google.android.exoplayer2.ExoPlaybackException r3 = com.google.android.exoplayer2.ExoPlaybackException.createForUnexpected(r3)
            throw r3
        L26:
            return
    }

    public void resetPosition(long r2) {
            r1 = this;
            com.google.android.exoplayer2.util.StandaloneMediaClock r0 = r1.standaloneClock
            r0.resetPosition(r2)
            return
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r2) {
            r1 = this;
            com.google.android.exoplayer2.util.MediaClock r0 = r1.rendererClock
            if (r0 == 0) goto Ld
            r0.setPlaybackParameters(r2)
            com.google.android.exoplayer2.util.MediaClock r2 = r1.rendererClock
            com.google.android.exoplayer2.PlaybackParameters r2 = r2.getPlaybackParameters()
        Ld:
            com.google.android.exoplayer2.util.StandaloneMediaClock r0 = r1.standaloneClock
            r0.setPlaybackParameters(r2)
            return
    }

    public void start() {
            r1 = this;
            r0 = 1
            r1.standaloneClockIsStarted = r0
            com.google.android.exoplayer2.util.StandaloneMediaClock r0 = r1.standaloneClock
            r0.start()
            return
    }

    public void stop() {
            r1 = this;
            r0 = 0
            r1.standaloneClockIsStarted = r0
            com.google.android.exoplayer2.util.StandaloneMediaClock r0 = r1.standaloneClock
            r0.stop()
            return
    }

    public long syncAndGetPositionUs(boolean r3) {
            r2 = this;
            r2.syncClocks(r3)
            long r0 = r2.getPositionUs()
            return r0
    }
}
