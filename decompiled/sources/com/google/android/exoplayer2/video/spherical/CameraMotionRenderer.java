package com.google.android.exoplayer2.video.spherical;

/* JADX INFO: loaded from: classes.dex */
public final class CameraMotionRenderer extends com.google.android.exoplayer2.BaseRenderer {
    private static final int SAMPLE_WINDOW_DURATION_US = 100000;
    private static final java.lang.String TAG = "CameraMotionRenderer";
    private final com.google.android.exoplayer2.decoder.DecoderInputBuffer buffer;
    private long lastTimestampUs;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.video.spherical.CameraMotionListener listener;
    private long offsetUs;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch;

    public CameraMotionRenderer() {
            r2 = this;
            r0 = 6
            r2.<init>(r0)
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r0 = new com.google.android.exoplayer2.decoder.DecoderInputBuffer
            r1 = 1
            r0.<init>(r1)
            r2.buffer = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>()
            r2.scratch = r0
            return
    }

    @androidx.annotation.Nullable
    private float[] parseMetadata(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.remaining()
            r1 = 16
            if (r0 == r1) goto La
            r4 = 0
            return r4
        La:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            byte[] r1 = r4.array()
            int r2 = r4.limit()
            r0.reset(r1, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            int r4 = r4.arrayOffset()
            int r4 = r4 + 4
            r0.setPosition(r4)
            r4 = 3
            float[] r0 = new float[r4]
            r1 = 0
        L26:
            if (r1 >= r4) goto L37
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r3.scratch
            int r2 = r2.readLittleEndianInt()
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L26
        L37:
            return r0
    }

    private void resetListener() {
            r1 = this;
            com.google.android.exoplayer2.video.spherical.CameraMotionListener r0 = r1.listener
            if (r0 == 0) goto L7
            r0.onCameraMotionReset()
        L7:
            return
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "CameraMotionRenderer"
            return r0
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int r2, @androidx.annotation.Nullable java.lang.Object r3) throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            r0 = 8
            if (r2 != r0) goto L9
            com.google.android.exoplayer2.video.spherical.CameraMotionListener r3 = (com.google.android.exoplayer2.video.spherical.CameraMotionListener) r3
            r1.listener = r3
            goto Lc
        L9:
            super.handleMessage(r2, r3)
        Lc:
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
            r1 = this;
            boolean r0 = r1.hasReadStreamToEnd()
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onDisabled() {
            r0 = this;
            r0.resetListener()
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onPositionReset(long r1, boolean r3) {
            r0 = this;
            r1 = -9223372036854775808
            r0.lastTimestampUs = r1
            r0.resetListener()
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onStreamChanged(com.google.android.exoplayer2.Format[] r1, long r2, long r4) {
            r0 = this;
            r0.offsetUs = r4
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long r5, long r7) {
            r4 = this;
        L0:
            boolean r7 = r4.hasReadStreamToEnd()
            if (r7 != 0) goto L64
            long r7 = r4.lastTimestampUs
            r0 = 100000(0x186a0, double:4.94066E-319)
            long r0 = r0 + r5
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L64
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r7 = r4.buffer
            r7.clear()
            com.google.android.exoplayer2.FormatHolder r7 = r4.getFormatHolder()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r8 = r4.buffer
            r0 = 0
            int r7 = r4.readSource(r7, r8, r0)
            r8 = -4
            if (r7 != r8) goto L64
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r7 = r4.buffer
            boolean r7 = r7.isEndOfStream()
            if (r7 == 0) goto L2c
            goto L64
        L2c:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r7 = r4.buffer
            long r0 = r7.timeUs
            r4.lastTimestampUs = r0
            com.google.android.exoplayer2.video.spherical.CameraMotionListener r8 = r4.listener
            if (r8 == 0) goto L0
            boolean r7 = r7.isDecodeOnly()
            if (r7 == 0) goto L3d
            goto L0
        L3d:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r7 = r4.buffer
            r7.flip()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r7 = r4.buffer
            java.nio.ByteBuffer r7 = r7.data
            java.lang.Object r7 = com.google.android.exoplayer2.util.Util.castNonNull(r7)
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            float[] r7 = r4.parseMetadata(r7)
            if (r7 != 0) goto L53
            goto L0
        L53:
            com.google.android.exoplayer2.video.spherical.CameraMotionListener r8 = r4.listener
            java.lang.Object r8 = com.google.android.exoplayer2.util.Util.castNonNull(r8)
            com.google.android.exoplayer2.video.spherical.CameraMotionListener r8 = (com.google.android.exoplayer2.video.spherical.CameraMotionListener) r8
            long r0 = r4.lastTimestampUs
            long r2 = r4.offsetUs
            long r0 = r0 - r2
            r8.onCameraMotion(r0, r7)
            goto L0
        L64:
            return
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsFormat(com.google.android.exoplayer2.Format r2) {
            r1 = this;
            java.lang.String r2 = r2.sampleMimeType
            java.lang.String r0 = "application/x-camera-motion"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L10
            r2 = 4
            int r2 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r2)
            goto L15
        L10:
            r2 = 0
            int r2 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r2)
        L15:
            return r2
    }
}
