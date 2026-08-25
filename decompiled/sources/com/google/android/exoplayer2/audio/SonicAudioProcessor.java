package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes.dex */
public final class SonicAudioProcessor implements com.google.android.exoplayer2.audio.AudioProcessor {
    private static final float CLOSE_THRESHOLD = 1.0E-4f;
    private static final int MIN_BYTES_FOR_DURATION_SCALING_CALCULATION = 1024;
    public static final int SAMPLE_RATE_NO_CHANGE = -1;
    private java.nio.ByteBuffer buffer;
    private com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat inputAudioFormat;
    private long inputBytes;
    private boolean inputEnded;
    private com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat outputAudioFormat;
    private java.nio.ByteBuffer outputBuffer;
    private long outputBytes;
    private com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat pendingInputAudioFormat;
    private com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat pendingOutputAudioFormat;
    private int pendingOutputSampleRate;
    private boolean pendingSonicRecreation;
    private float pitch;
    private java.nio.ShortBuffer shortBuffer;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.audio.Sonic sonic;
    private float speed;

    public SonicAudioProcessor() {
            r2 = this;
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.speed = r0
            r2.pitch = r0
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r0 = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET
            r2.pendingInputAudioFormat = r0
            r2.pendingOutputAudioFormat = r0
            r2.inputAudioFormat = r0
            r2.outputAudioFormat = r0
            java.nio.ByteBuffer r0 = com.google.android.exoplayer2.audio.AudioProcessor.EMPTY_BUFFER
            r2.buffer = r0
            java.nio.ShortBuffer r1 = r0.asShortBuffer()
            r2.shortBuffer = r1
            r2.outputBuffer = r0
            r0 = -1
            r2.pendingOutputSampleRate = r0
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat configure(com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat r4) throws com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException {
            r3 = this;
            int r0 = r4.encoding
            r1 = 2
            if (r0 != r1) goto L1b
            int r0 = r3.pendingOutputSampleRate
            r2 = -1
            if (r0 != r2) goto Lc
            int r0 = r4.sampleRate
        Lc:
            r3.pendingInputAudioFormat = r4
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r2 = new com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat
            int r4 = r4.channelCount
            r2.<init>(r0, r4, r1)
            r3.pendingOutputAudioFormat = r2
            r4 = 1
            r3.pendingSonicRecreation = r4
            return r2
        L1b:
            com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException r0 = new com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
            r9 = this;
            boolean r0 = r9.isActive()
            if (r0 == 0) goto L2c
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r0 = r9.pendingInputAudioFormat
            r9.inputAudioFormat = r0
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r1 = r9.pendingOutputAudioFormat
            r9.outputAudioFormat = r1
            boolean r2 = r9.pendingSonicRecreation
            if (r2 == 0) goto L25
            com.google.android.exoplayer2.audio.Sonic r2 = new com.google.android.exoplayer2.audio.Sonic
            int r4 = r0.sampleRate
            int r5 = r0.channelCount
            float r6 = r9.speed
            float r7 = r9.pitch
            int r8 = r1.sampleRate
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            r9.sonic = r2
            goto L2c
        L25:
            com.google.android.exoplayer2.audio.Sonic r0 = r9.sonic
            if (r0 == 0) goto L2c
            r0.flush()
        L2c:
            java.nio.ByteBuffer r0 = com.google.android.exoplayer2.audio.AudioProcessor.EMPTY_BUFFER
            r9.outputBuffer = r0
            r0 = 0
            r9.inputBytes = r0
            r9.outputBytes = r0
            r0 = 0
            r9.inputEnded = r0
            return
    }

    public long getMediaDuration(long r16) {
            r15 = this;
            r0 = r15
            long r1 = r0.outputBytes
            r3 = 1024(0x400, double:5.06E-321)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L3c
            long r1 = r0.inputBytes
            com.google.android.exoplayer2.audio.Sonic r3 = r0.sonic
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.audio.Sonic r3 = (com.google.android.exoplayer2.audio.Sonic) r3
            int r3 = r3.getPendingInputBytes()
            long r3 = (long) r3
            long r7 = r1 - r3
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r1 = r0.outputAudioFormat
            int r1 = r1.sampleRate
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r2 = r0.inputAudioFormat
            int r2 = r2.sampleRate
            if (r1 != r2) goto L2d
            long r9 = r0.outputBytes
            r5 = r16
            long r1 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r5, r7, r9)
            goto L3b
        L2d:
            long r3 = (long) r1
            long r11 = r7 * r3
            long r3 = r0.outputBytes
            long r1 = (long) r2
            long r13 = r3 * r1
            r9 = r16
            long r1 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r9, r11, r13)
        L3b:
            return r1
        L3c:
            float r1 = r0.speed
            double r1 = (double) r1
            r3 = r16
            double r3 = (double) r3
            double r1 = r1 * r3
            long r1 = (long) r1
            return r1
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public java.nio.ByteBuffer getOutput() {
            r6 = this;
            com.google.android.exoplayer2.audio.Sonic r0 = r6.sonic
            if (r0 == 0) goto L45
            int r1 = r0.getOutputSize()
            if (r1 <= 0) goto L45
            java.nio.ByteBuffer r2 = r6.buffer
            int r2 = r2.capacity()
            if (r2 >= r1) goto L27
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r6.buffer = r2
            java.nio.ShortBuffer r2 = r2.asShortBuffer()
            r6.shortBuffer = r2
            goto L31
        L27:
            java.nio.ByteBuffer r2 = r6.buffer
            r2.clear()
            java.nio.ShortBuffer r2 = r6.shortBuffer
            r2.clear()
        L31:
            java.nio.ShortBuffer r2 = r6.shortBuffer
            r0.getOutput(r2)
            long r2 = r6.outputBytes
            long r4 = (long) r1
            long r2 = r2 + r4
            r6.outputBytes = r2
            java.nio.ByteBuffer r0 = r6.buffer
            r0.limit(r1)
            java.nio.ByteBuffer r0 = r6.buffer
            r6.outputBuffer = r0
        L45:
            java.nio.ByteBuffer r0 = r6.outputBuffer
            java.nio.ByteBuffer r1 = com.google.android.exoplayer2.audio.AudioProcessor.EMPTY_BUFFER
            r6.outputBuffer = r1
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
            r3 = this;
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r0 = r3.pendingOutputAudioFormat
            int r0 = r0.sampleRate
            r1 = -1
            if (r0 == r1) goto L2e
            float r0 = r3.speed
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            r2 = 953267991(0x38d1b717, float:1.0E-4)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2c
            float r0 = r3.pitch
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2c
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r0 = r3.pendingOutputAudioFormat
            int r0 = r0.sampleRate
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r1 = r3.pendingInputAudioFormat
            int r1 = r1.sampleRate
            if (r0 == r1) goto L2e
        L2c:
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
            r1 = this;
            boolean r0 = r1.inputEnded
            if (r0 == 0) goto L10
            com.google.android.exoplayer2.audio.Sonic r0 = r1.sonic
            if (r0 == 0) goto Le
            int r0 = r0.getOutputSize()
            if (r0 != 0) goto L10
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueEndOfStream() {
            r1 = this;
            com.google.android.exoplayer2.audio.Sonic r0 = r1.sonic
            if (r0 == 0) goto L7
            r0.queueEndOfStream()
        L7:
            r0 = 1
            r1.inputEnded = r0
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(java.nio.ByteBuffer r8) {
            r7 = this;
            boolean r0 = r8.hasRemaining()
            if (r0 != 0) goto L7
            return
        L7:
            com.google.android.exoplayer2.audio.Sonic r0 = r7.sonic
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.audio.Sonic r0 = (com.google.android.exoplayer2.audio.Sonic) r0
            java.nio.ShortBuffer r1 = r8.asShortBuffer()
            int r2 = r8.remaining()
            long r3 = r7.inputBytes
            long r5 = (long) r2
            long r3 = r3 + r5
            r7.inputBytes = r3
            r0.queueInput(r1)
            int r0 = r8.position()
            int r0 = r0 + r2
            r8.position(r0)
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void reset() {
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.speed = r0
            r3.pitch = r0
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r0 = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET
            r3.pendingInputAudioFormat = r0
            r3.pendingOutputAudioFormat = r0
            r3.inputAudioFormat = r0
            r3.outputAudioFormat = r0
            java.nio.ByteBuffer r0 = com.google.android.exoplayer2.audio.AudioProcessor.EMPTY_BUFFER
            r3.buffer = r0
            java.nio.ShortBuffer r1 = r0.asShortBuffer()
            r3.shortBuffer = r1
            r3.outputBuffer = r0
            r0 = -1
            r3.pendingOutputSampleRate = r0
            r0 = 0
            r3.pendingSonicRecreation = r0
            r1 = 0
            r3.sonic = r1
            r1 = 0
            r3.inputBytes = r1
            r3.outputBytes = r1
            r3.inputEnded = r0
            return
    }

    public void setOutputSampleRateHz(int r1) {
            r0 = this;
            r0.pendingOutputSampleRate = r1
            return
    }

    public void setPitch(float r2) {
            r1 = this;
            float r0 = r1.pitch
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.pitch = r2
            r2 = 1
            r1.pendingSonicRecreation = r2
        Lb:
            return
    }

    public void setSpeed(float r2) {
            r1 = this;
            float r0 = r1.speed
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.speed = r2
            r2 = 1
            r1.pendingSonicRecreation = r2
        Lb:
            return
    }
}
