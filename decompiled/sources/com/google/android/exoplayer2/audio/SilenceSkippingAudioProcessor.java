package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes2.dex */
public final class SilenceSkippingAudioProcessor extends com.google.android.exoplayer2.audio.BaseAudioProcessor {
    public static final long DEFAULT_MINIMUM_SILENCE_DURATION_US = 150000;
    public static final long DEFAULT_PADDING_SILENCE_US = 20000;
    public static final short DEFAULT_SILENCE_THRESHOLD_LEVEL = 1024;
    private static final int STATE_MAYBE_SILENT = 1;
    private static final int STATE_NOISY = 0;
    private static final int STATE_SILENT = 2;
    private int bytesPerFrame;
    private boolean enabled;
    private boolean hasOutputNoise;
    private byte[] maybeSilenceBuffer;
    private int maybeSilenceBufferSize;
    private final long minimumSilenceDurationUs;
    private byte[] paddingBuffer;
    private final long paddingSilenceUs;
    private int paddingSize;
    private final short silenceThresholdLevel;
    private long skippedFrames;
    private int state;

    public SilenceSkippingAudioProcessor() {
            r6 = this;
            r1 = 150000(0x249f0, double:7.411E-319)
            r3 = 20000(0x4e20, double:9.8813E-320)
            r5 = 1024(0x400, float:1.435E-42)
            r0 = r6
            r0.<init>(r1, r3, r5)
            return
    }

    public SilenceSkippingAudioProcessor(long r2, long r4, short r6) {
            r1 = this;
            r1.<init>()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r1.minimumSilenceDurationUs = r2
            r1.paddingSilenceUs = r4
            r1.silenceThresholdLevel = r6
            byte[] r2 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
            r1.maybeSilenceBuffer = r2
            r1.paddingBuffer = r2
            return
    }

    private int durationUsToFrames(long r3) {
            r2 = this;
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r0 = r2.inputAudioFormat
            int r0 = r0.sampleRate
            long r0 = (long) r0
            long r3 = r3 * r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r0
            int r4 = (int) r3
            return r4
    }

    private int findNoiseLimit(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.limit()
            int r0 = r0 + (-2)
        L6:
            int r1 = r4.position()
            if (r0 < r1) goto L22
            short r1 = r4.getShort(r0)
            int r1 = java.lang.Math.abs(r1)
            short r2 = r3.silenceThresholdLevel
            if (r1 <= r2) goto L1f
            int r4 = r3.bytesPerFrame
            int r0 = r0 / r4
            int r0 = r0 * r4
            int r0 = r0 + r4
            return r0
        L1f:
            int r0 = r0 + (-2)
            goto L6
        L22:
            int r4 = r4.position()
            return r4
    }

    private int findNoisePosition(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.position()
        L4:
            int r1 = r4.limit()
            if (r0 >= r1) goto L1f
            short r1 = r4.getShort(r0)
            int r1 = java.lang.Math.abs(r1)
            short r2 = r3.silenceThresholdLevel
            if (r1 <= r2) goto L1c
            int r4 = r3.bytesPerFrame
            int r0 = r0 / r4
            int r0 = r0 * r4
            return r0
        L1c:
            int r0 = r0 + 2
            goto L4
        L1f:
            int r4 = r4.limit()
            return r4
    }

    private void output(java.nio.ByteBuffer r3) {
            r2 = this;
            int r0 = r3.remaining()
            java.nio.ByteBuffer r1 = r2.replaceOutputBuffer(r0)
            java.nio.ByteBuffer r3 = r1.put(r3)
            r3.flip()
            if (r0 <= 0) goto L14
            r3 = 1
            r2.hasOutputNoise = r3
        L14:
            return
    }

    private void output(byte[] r3, int r4) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.replaceOutputBuffer(r4)
            r1 = 0
            java.nio.ByteBuffer r3 = r0.put(r3, r1, r4)
            r3.flip()
            if (r4 <= 0) goto L11
            r3 = 1
            r2.hasOutputNoise = r3
        L11:
            return
    }

    private void processMaybeSilence(java.nio.ByteBuffer r10) {
            r9 = this;
            int r0 = r10.limit()
            int r1 = r9.findNoisePosition(r10)
            int r2 = r10.position()
            int r2 = r1 - r2
            byte[] r3 = r9.maybeSilenceBuffer
            int r4 = r3.length
            int r5 = r9.maybeSilenceBufferSize
            int r4 = r4 - r5
            r6 = 0
            if (r1 >= r0) goto L21
            if (r2 >= r4) goto L21
            r9.output(r3, r5)
            r9.maybeSilenceBufferSize = r6
            r9.state = r6
            goto L73
        L21:
            int r1 = java.lang.Math.min(r2, r4)
            int r2 = r10.position()
            int r2 = r2 + r1
            r10.limit(r2)
            byte[] r2 = r9.maybeSilenceBuffer
            int r3 = r9.maybeSilenceBufferSize
            r10.get(r2, r3, r1)
            int r2 = r9.maybeSilenceBufferSize
            int r2 = r2 + r1
            r9.maybeSilenceBufferSize = r2
            byte[] r1 = r9.maybeSilenceBuffer
            int r3 = r1.length
            if (r2 != r3) goto L70
            boolean r3 = r9.hasOutputNoise
            r4 = 2
            if (r3 == 0) goto L59
            int r2 = r9.paddingSize
            r9.output(r1, r2)
            long r1 = r9.skippedFrames
            int r3 = r9.maybeSilenceBufferSize
            int r5 = r9.paddingSize
            int r5 = r5 * 2
            int r3 = r3 - r5
            int r5 = r9.bytesPerFrame
            int r3 = r3 / r5
            long r7 = (long) r3
            long r1 = r1 + r7
            r9.skippedFrames = r1
            goto L65
        L59:
            long r7 = r9.skippedFrames
            int r1 = r9.paddingSize
            int r2 = r2 - r1
            int r1 = r9.bytesPerFrame
            int r2 = r2 / r1
            long r1 = (long) r2
            long r7 = r7 + r1
            r9.skippedFrames = r7
        L65:
            byte[] r1 = r9.maybeSilenceBuffer
            int r2 = r9.maybeSilenceBufferSize
            r9.updatePaddingBuffer(r10, r1, r2)
            r9.maybeSilenceBufferSize = r6
            r9.state = r4
        L70:
            r10.limit(r0)
        L73:
            return
    }

    private void processNoisy(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.limit()
            int r1 = r4.position()
            byte[] r2 = r3.maybeSilenceBuffer
            int r2 = r2.length
            int r1 = r1 + r2
            int r1 = java.lang.Math.min(r0, r1)
            r4.limit(r1)
            int r1 = r3.findNoiseLimit(r4)
            int r2 = r4.position()
            if (r1 != r2) goto L21
            r1 = 1
            r3.state = r1
            goto L27
        L21:
            r4.limit(r1)
            r3.output(r4)
        L27:
            r4.limit(r0)
            return
    }

    private void processSilence(java.nio.ByteBuffer r7) {
            r6 = this;
            int r0 = r7.limit()
            int r1 = r6.findNoisePosition(r7)
            r7.limit(r1)
            long r2 = r6.skippedFrames
            int r4 = r7.remaining()
            int r5 = r6.bytesPerFrame
            int r4 = r4 / r5
            long r4 = (long) r4
            long r2 = r2 + r4
            r6.skippedFrames = r2
            byte[] r2 = r6.paddingBuffer
            int r3 = r6.paddingSize
            r6.updatePaddingBuffer(r7, r2, r3)
            if (r1 >= r0) goto L2e
            byte[] r1 = r6.paddingBuffer
            int r2 = r6.paddingSize
            r6.output(r1, r2)
            r1 = 0
            r6.state = r1
            r7.limit(r0)
        L2e:
            return
    }

    private void updatePaddingBuffer(java.nio.ByteBuffer r5, byte[] r6, int r7) {
            r4 = this;
            int r0 = r5.remaining()
            int r1 = r4.paddingSize
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r4.paddingSize
            int r1 = r1 - r0
            int r7 = r7 - r1
            byte[] r2 = r4.paddingBuffer
            r3 = 0
            java.lang.System.arraycopy(r6, r7, r2, r3, r1)
            int r6 = r5.limit()
            int r6 = r6 - r0
            r5.position(r6)
            byte[] r6 = r4.paddingBuffer
            r5.get(r6, r1, r0)
            return
    }

    public long getSkippedFrames() {
            r2 = this;
            long r0 = r2.skippedFrames
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
            r1 = this;
            boolean r0 = r1.enabled
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat onConfigure(com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat r3) throws com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException {
            r2 = this;
            int r0 = r3.encoding
            r1 = 2
            if (r0 != r1) goto Ld
            boolean r0 = r2.enabled
            if (r0 == 0) goto La
            goto Lc
        La:
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r3 = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET
        Lc:
            return r3
        Ld:
            com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException r0 = new com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException
            r0.<init>(r3)
            throw r0
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void onFlush() {
            r3 = this;
            boolean r0 = r3.enabled
            if (r0 == 0) goto L32
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r0 = r3.inputAudioFormat
            int r0 = r0.bytesPerFrame
            r3.bytesPerFrame = r0
            long r0 = r3.minimumSilenceDurationUs
            int r0 = r3.durationUsToFrames(r0)
            int r1 = r3.bytesPerFrame
            int r0 = r0 * r1
            byte[] r1 = r3.maybeSilenceBuffer
            int r1 = r1.length
            if (r1 == r0) goto L1d
            byte[] r0 = new byte[r0]
            r3.maybeSilenceBuffer = r0
        L1d:
            long r0 = r3.paddingSilenceUs
            int r0 = r3.durationUsToFrames(r0)
            int r1 = r3.bytesPerFrame
            int r0 = r0 * r1
            r3.paddingSize = r0
            byte[] r1 = r3.paddingBuffer
            int r1 = r1.length
            if (r1 == r0) goto L32
            byte[] r0 = new byte[r0]
            r3.paddingBuffer = r0
        L32:
            r0 = 0
            r3.state = r0
            r1 = 0
            r3.skippedFrames = r1
            r3.maybeSilenceBufferSize = r0
            r3.hasOutputNoise = r0
            return
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void onQueueEndOfStream() {
            r4 = this;
            int r0 = r4.maybeSilenceBufferSize
            if (r0 <= 0) goto L9
            byte[] r1 = r4.maybeSilenceBuffer
            r4.output(r1, r0)
        L9:
            boolean r0 = r4.hasOutputNoise
            if (r0 != 0) goto L18
            long r0 = r4.skippedFrames
            int r2 = r4.paddingSize
            int r3 = r4.bytesPerFrame
            int r2 = r2 / r3
            long r2 = (long) r2
            long r0 = r0 + r2
            r4.skippedFrames = r0
        L18:
            return
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void onReset() {
            r1 = this;
            r0 = 0
            r1.enabled = r0
            r1.paddingSize = r0
            byte[] r0 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
            r1.maybeSilenceBuffer = r0
            r1.paddingBuffer = r0
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(java.nio.ByteBuffer r3) {
            r2 = this;
        L0:
            boolean r0 = r3.hasRemaining()
            if (r0 == 0) goto L28
            boolean r0 = r2.hasPendingOutput()
            if (r0 != 0) goto L28
            int r0 = r2.state
            if (r0 == 0) goto L24
            r1 = 1
            if (r0 == r1) goto L20
            r1 = 2
            if (r0 != r1) goto L1a
            r2.processSilence(r3)
            goto L0
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L20:
            r2.processMaybeSilence(r3)
            goto L0
        L24:
            r2.processNoisy(r3)
            goto L0
        L28:
            return
    }

    public void setEnabled(boolean r1) {
            r0 = this;
            r0.enabled = r1
            return
    }
}
