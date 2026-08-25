package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NoSampleRenderer implements com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities {
    private com.google.android.exoplayer2.RendererConfiguration configuration;
    private int index;
    private int state;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.SampleStream stream;
    private boolean streamIsFinal;

    public NoSampleRenderer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void disable() {
            r3 = this;
            int r0 = r3.state
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            r3.state = r2
            r0 = 0
            r3.stream = r0
            r3.streamIsFinal = r2
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void enable(com.google.android.exoplayer2.RendererConfiguration r9, com.google.android.exoplayer2.Format[] r10, com.google.android.exoplayer2.source.SampleStream r11, long r12, boolean r14, boolean r15, long r16, long r18) throws com.google.android.exoplayer2.ExoPlaybackException {
            r8 = this;
            r7 = r8
            int r0 = r7.state
            r1 = 1
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r0 = r9
            r7.configuration = r0
            r7.state = r1
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r16
            r5 = r18
            r0.replaceStream(r1, r2, r3, r5)
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final com.google.android.exoplayer2.RendererCapabilities getCapabilities() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.util.MediaClock getMediaClock() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer
    public long getReadingPositionUs() {
            r2 = this;
            r0 = -9223372036854775808
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final int getState() {
            r1 = this;
            int r0 = r1.state
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.source.SampleStream getStream() {
            r1 = this;
            com.google.android.exoplayer2.source.SampleStream r0 = r1.stream
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final int getTrackType() {
            r1 = this;
            r0 = -2
            return r0
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int r1, @androidx.annotation.Nullable java.lang.Object r2) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean hasReadStreamToEnd() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void init(int r1, com.google.android.exoplayer2.analytics.PlayerId r2) {
            r0 = this;
            r0.index = r1
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isCurrentStreamFinal() {
            r1 = this;
            boolean r0 = r1.streamIsFinal
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void maybeThrowStreamError() throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void replaceStream(com.google.android.exoplayer2.Format[] r1, com.google.android.exoplayer2.source.SampleStream r2, long r3, long r5) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            boolean r1 = r0.streamIsFinal
            r1 = r1 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            r0.stream = r2
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void reset() {
            r1 = this;
            int r0 = r1.state
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void resetPosition(long r1) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            r1 = 0
            r0.streamIsFinal = r1
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void setCurrentStreamFinal() {
            r1 = this;
            r0 = 1
            r1.streamIsFinal = r0
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final /* synthetic */ void setPlaybackSpeed(float r1, float r2) {
            r0 = this;
            com.google.android.exoplayer2.Renderer.CC.$default$setPlaybackSpeed(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void start() throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            int r0 = r2.state
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            r0 = 2
            r2.state = r0
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void stop() {
            r3 = this;
            int r0 = r3.state
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r3.state = r1
            return
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsFormat(com.google.android.exoplayer2.Format r1) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            r1 = 0
            int r1 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r1)
            return r1
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            r0 = 0
            return r0
    }
}
