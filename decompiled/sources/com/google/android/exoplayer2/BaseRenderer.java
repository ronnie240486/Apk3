package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseRenderer implements com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities {

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.RendererConfiguration configuration;
    private final com.google.android.exoplayer2.FormatHolder formatHolder;
    private int index;
    private long lastResetPositionUs;
    private com.google.android.exoplayer2.analytics.PlayerId playerId;
    private long readingPositionUs;
    private int state;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.SampleStream stream;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format[] streamFormats;
    private boolean streamIsFinal;
    private long streamOffsetUs;
    private boolean throwRendererExceptionIsExecuting;
    private final int trackType;

    public BaseRenderer(int r3) {
            r2 = this;
            r2.<init>()
            r2.trackType = r3
            com.google.android.exoplayer2.FormatHolder r3 = new com.google.android.exoplayer2.FormatHolder
            r3.<init>()
            r2.formatHolder = r3
            r0 = -9223372036854775808
            r2.readingPositionUs = r0
            return
    }

    private void resetPosition(long r2, boolean r4) throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            r0 = 0
            r1.streamIsFinal = r0
            r1.lastResetPositionUs = r2
            r1.readingPositionUs = r2
            r1.onPositionReset(r2, r4)
            return
    }

    public final com.google.android.exoplayer2.ExoPlaybackException createRendererException(java.lang.Throwable r10, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r11, boolean r12, int r13) {
            r9 = this;
            if (r11 == 0) goto L1c
            boolean r0 = r9.throwRendererExceptionIsExecuting
            if (r0 != 0) goto L1c
            r0 = 1
            r9.throwRendererExceptionIsExecuting = r0
            r0 = 0
            int r1 = r9.supportsFormat(r11)     // Catch: java.lang.Throwable -> L16 com.google.android.exoplayer2.ExoPlaybackException -> L1a
            int r1 = com.google.android.exoplayer2.RendererCapabilities.CC.getFormatSupport(r1)     // Catch: java.lang.Throwable -> L16 com.google.android.exoplayer2.ExoPlaybackException -> L1a
            r9.throwRendererExceptionIsExecuting = r0
            r6 = r1
            goto L1e
        L16:
            r10 = move-exception
            r9.throwRendererExceptionIsExecuting = r0
            throw r10
        L1a:
            r9.throwRendererExceptionIsExecuting = r0
        L1c:
            r1 = 4
            r6 = 4
        L1e:
            java.lang.String r3 = r9.getName()
            int r4 = r9.index
            r2 = r10
            r5 = r11
            r7 = r12
            r8 = r13
            com.google.android.exoplayer2.ExoPlaybackException r10 = com.google.android.exoplayer2.ExoPlaybackException.createForRenderer(r2, r3, r4, r5, r6, r7, r8)
            return r10
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
            com.google.android.exoplayer2.FormatHolder r0 = r3.formatHolder
            r0.clear()
            r3.state = r2
            r0 = 0
            r3.stream = r0
            r3.streamFormats = r0
            r3.streamIsFinal = r2
            r3.onDisabled()
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void enable(com.google.android.exoplayer2.RendererConfiguration r10, com.google.android.exoplayer2.Format[] r11, com.google.android.exoplayer2.source.SampleStream r12, long r13, boolean r15, boolean r16, long r17, long r19) throws com.google.android.exoplayer2.ExoPlaybackException {
            r9 = this;
            r7 = r9
            r8 = r15
            int r0 = r7.state
            r1 = 1
            if (r0 != 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r0 = r10
            r7.configuration = r0
            r7.state = r1
            r0 = r16
            r9.onEnabled(r15, r0)
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r17
            r5 = r19
            r0.replaceStream(r1, r2, r3, r5)
            r0 = r13
            r9.resetPosition(r13, r15)
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final com.google.android.exoplayer2.RendererCapabilities getCapabilities() {
            r0 = this;
            return r0
    }

    public final com.google.android.exoplayer2.RendererConfiguration getConfiguration() {
            r1 = this;
            com.google.android.exoplayer2.RendererConfiguration r0 = r1.configuration
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.RendererConfiguration r0 = (com.google.android.exoplayer2.RendererConfiguration) r0
            return r0
    }

    public final com.google.android.exoplayer2.FormatHolder getFormatHolder() {
            r1 = this;
            com.google.android.exoplayer2.FormatHolder r0 = r1.formatHolder
            r0.clear()
            com.google.android.exoplayer2.FormatHolder r0 = r1.formatHolder
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.util.MediaClock getMediaClock() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final com.google.android.exoplayer2.analytics.PlayerId getPlayerId() {
            r1 = this;
            com.google.android.exoplayer2.analytics.PlayerId r0 = r1.playerId
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.analytics.PlayerId r0 = (com.google.android.exoplayer2.analytics.PlayerId) r0
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final long getReadingPositionUs() {
            r2 = this;
            long r0 = r2.readingPositionUs
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

    public final com.google.android.exoplayer2.Format[] getStreamFormats() {
            r1 = this;
            com.google.android.exoplayer2.Format[] r0 = r1.streamFormats
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.Format[] r0 = (com.google.android.exoplayer2.Format[]) r0
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final int getTrackType() {
            r1 = this;
            int r0 = r1.trackType
            return r0
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int r1, @androidx.annotation.Nullable java.lang.Object r2) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean hasReadStreamToEnd() {
            r5 = this;
            long r0 = r5.readingPositionUs
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void init(int r1, com.google.android.exoplayer2.analytics.PlayerId r2) {
            r0 = this;
            r0.index = r1
            r0.playerId = r2
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isCurrentStreamFinal() {
            r1 = this;
            boolean r0 = r1.streamIsFinal
            return r0
    }

    public final boolean isSourceReady() {
            r1 = this;
            boolean r0 = r1.hasReadStreamToEnd()
            if (r0 == 0) goto L9
            boolean r0 = r1.streamIsFinal
            goto L15
        L9:
            com.google.android.exoplayer2.source.SampleStream r0 = r1.stream
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.SampleStream r0 = (com.google.android.exoplayer2.source.SampleStream) r0
            boolean r0 = r0.isReady()
        L15:
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void maybeThrowStreamError() throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.source.SampleStream r0 = r1.stream
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.SampleStream r0 = (com.google.android.exoplayer2.source.SampleStream) r0
            r0.maybeThrowError()
            return
    }

    public void onDisabled() {
            r0 = this;
            return
    }

    public void onEnabled(boolean r1, boolean r2) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            return
    }

    public void onPositionReset(long r1, boolean r3) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            return
    }

    public void onReset() {
            r0 = this;
            return
    }

    public void onStarted() throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            return
    }

    public void onStopped() {
            r0 = this;
            return
    }

    public void onStreamChanged(com.google.android.exoplayer2.Format[] r1, long r2, long r4) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0 = this;
            return
    }

    public final int readSource(com.google.android.exoplayer2.FormatHolder r6, com.google.android.exoplayer2.decoder.DecoderInputBuffer r7, int r8) {
            r5 = this;
            com.google.android.exoplayer2.source.SampleStream r0 = r5.stream
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.SampleStream r0 = (com.google.android.exoplayer2.source.SampleStream) r0
            int r8 = r0.readData(r6, r7, r8)
            r0 = -4
            if (r8 != r0) goto L30
            boolean r6 = r7.isEndOfStream()
            if (r6 == 0) goto L20
            r6 = -9223372036854775808
            r5.readingPositionUs = r6
            boolean r6 = r5.streamIsFinal
            if (r6 == 0) goto L1e
            goto L1f
        L1e:
            r0 = -3
        L1f:
            return r0
        L20:
            long r0 = r7.timeUs
            long r2 = r5.streamOffsetUs
            long r0 = r0 + r2
            r7.timeUs = r0
            long r6 = r5.readingPositionUs
            long r6 = java.lang.Math.max(r6, r0)
            r5.readingPositionUs = r6
            goto L59
        L30:
            r7 = -5
            if (r8 != r7) goto L59
            com.google.android.exoplayer2.Format r7 = r6.format
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
            com.google.android.exoplayer2.Format r7 = (com.google.android.exoplayer2.Format) r7
            long r0 = r7.subsampleOffsetUs
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L59
            com.google.android.exoplayer2.Format$Builder r0 = r7.buildUpon()
            long r1 = r7.subsampleOffsetUs
            long r3 = r5.streamOffsetUs
            long r1 = r1 + r3
            com.google.android.exoplayer2.Format$Builder r7 = r0.setSubsampleOffsetUs(r1)
            com.google.android.exoplayer2.Format r7 = r7.build()
            r6.format = r7
        L59:
            return r8
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void replaceStream(com.google.android.exoplayer2.Format[] r7, com.google.android.exoplayer2.source.SampleStream r8, long r9, long r11) throws com.google.android.exoplayer2.ExoPlaybackException {
            r6 = this;
            boolean r0 = r6.streamIsFinal
            r0 = r0 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r6.stream = r8
            long r0 = r6.readingPositionUs
            r2 = -9223372036854775808
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L13
            r6.readingPositionUs = r9
        L13:
            r6.streamFormats = r7
            r6.streamOffsetUs = r11
            r0 = r6
            r1 = r7
            r2 = r9
            r4 = r11
            r0.onStreamChanged(r1, r2, r4)
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
            com.google.android.exoplayer2.FormatHolder r0 = r1.formatHolder
            r0.clear()
            r1.onReset()
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void resetPosition(long r2) throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            r0 = 0
            r1.resetPosition(r2, r0)
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
    public /* synthetic */ void setPlaybackSpeed(float r1, float r2) {
            r0 = this;
            com.google.android.exoplayer2.Renderer.CC.$default$setPlaybackSpeed(r0, r1, r2)
            return
    }

    public final int skipSource(long r4) {
            r3 = this;
            com.google.android.exoplayer2.source.SampleStream r0 = r3.stream
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.SampleStream r0 = (com.google.android.exoplayer2.source.SampleStream) r0
            long r1 = r3.streamOffsetUs
            long r4 = r4 - r1
            int r4 = r0.skipData(r4)
            return r4
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
            r2.onStarted()
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
            r3.onStopped()
            return
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            r0 = 0
            return r0
    }
}
