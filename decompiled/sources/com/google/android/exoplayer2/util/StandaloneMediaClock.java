package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class StandaloneMediaClock implements com.google.android.exoplayer2.util.MediaClock {
    private long baseElapsedMs;
    private long baseUs;
    private final com.google.android.exoplayer2.util.Clock clock;
    private com.google.android.exoplayer2.PlaybackParameters playbackParameters;
    private boolean started;

    public StandaloneMediaClock(com.google.android.exoplayer2.util.Clock r1) {
            r0 = this;
            r0.<init>()
            r0.clock = r1
            com.google.android.exoplayer2.PlaybackParameters r1 = com.google.android.exoplayer2.PlaybackParameters.DEFAULT
            r0.playbackParameters = r1
            return
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters() {
            r1 = this;
            com.google.android.exoplayer2.PlaybackParameters r0 = r1.playbackParameters
            return r0
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public long getPositionUs() {
            r7 = this;
            long r0 = r7.baseUs
            boolean r2 = r7.started
            if (r2 == 0) goto L23
            com.google.android.exoplayer2.util.Clock r2 = r7.clock
            long r2 = r2.elapsedRealtime()
            long r4 = r7.baseElapsedMs
            long r2 = r2 - r4
            com.google.android.exoplayer2.PlaybackParameters r4 = r7.playbackParameters
            float r5 = r4.speed
            r6 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L1e
            long r2 = com.google.android.exoplayer2.util.Util.msToUs(r2)
            goto L22
        L1e:
            long r2 = r4.getMediaTimeUsForPlayoutTimeMs(r2)
        L22:
            long r0 = r0 + r2
        L23:
            return r0
    }

    public void resetPosition(long r1) {
            r0 = this;
            r0.baseUs = r1
            boolean r1 = r0.started
            if (r1 == 0) goto Le
            com.google.android.exoplayer2.util.Clock r1 = r0.clock
            long r1 = r1.elapsedRealtime()
            r0.baseElapsedMs = r1
        Le:
            return
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r3) {
            r2 = this;
            boolean r0 = r2.started
            if (r0 == 0) goto Lb
            long r0 = r2.getPositionUs()
            r2.resetPosition(r0)
        Lb:
            r2.playbackParameters = r3
            return
    }

    public void start() {
            r2 = this;
            boolean r0 = r2.started
            if (r0 != 0) goto Lf
            com.google.android.exoplayer2.util.Clock r0 = r2.clock
            long r0 = r0.elapsedRealtime()
            r2.baseElapsedMs = r0
            r0 = 1
            r2.started = r0
        Lf:
            return
    }

    public void stop() {
            r2 = this;
            boolean r0 = r2.started
            if (r0 == 0) goto Le
            long r0 = r2.getPositionUs()
            r2.resetPosition(r0)
            r0 = 0
            r2.started = r0
        Le:
            return
    }
}
