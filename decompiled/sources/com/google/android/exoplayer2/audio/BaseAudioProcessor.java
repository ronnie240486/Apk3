package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAudioProcessor implements com.google.android.exoplayer2.audio.AudioProcessor {
    private java.nio.ByteBuffer buffer;
    public com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat inputAudioFormat;
    private boolean inputEnded;
    public com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat outputAudioFormat;
    private java.nio.ByteBuffer outputBuffer;
    private com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat pendingInputAudioFormat;
    private com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat pendingOutputAudioFormat;

    public BaseAudioProcessor() {
            r1 = this;
            r1.<init>()
            java.nio.ByteBuffer r0 = com.google.android.exoplayer2.audio.AudioProcessor.EMPTY_BUFFER
            r1.buffer = r0
            r1.outputBuffer = r0
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r0 = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET
            r1.pendingInputAudioFormat = r0
            r1.pendingOutputAudioFormat = r0
            r1.inputAudioFormat = r0
            r1.outputAudioFormat = r0
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat configure(com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat r1) throws com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException {
            r0 = this;
            r0.pendingInputAudioFormat = r1
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r1 = r0.onConfigure(r1)
            r0.pendingOutputAudioFormat = r1
            boolean r1 = r0.isActive()
            if (r1 == 0) goto L11
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r1 = r0.pendingOutputAudioFormat
            goto L13
        L11:
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r1 = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET
        L13:
            return r1
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
            r1 = this;
            java.nio.ByteBuffer r0 = com.google.android.exoplayer2.audio.AudioProcessor.EMPTY_BUFFER
            r1.outputBuffer = r0
            r0 = 0
            r1.inputEnded = r0
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r0 = r1.pendingInputAudioFormat
            r1.inputAudioFormat = r0
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r0 = r1.pendingOutputAudioFormat
            r1.outputAudioFormat = r0
            r1.onFlush()
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @androidx.annotation.CallSuper
    public java.nio.ByteBuffer getOutput() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.outputBuffer
            java.nio.ByteBuffer r1 = com.google.android.exoplayer2.audio.AudioProcessor.EMPTY_BUFFER
            r2.outputBuffer = r1
            return r0
    }

    public final boolean hasPendingOutput() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.outputBuffer
            boolean r0 = r0.hasRemaining()
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
            r2 = this;
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r0 = r2.pendingOutputAudioFormat
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r1 = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @androidx.annotation.CallSuper
    public boolean isEnded() {
            r2 = this;
            boolean r0 = r2.inputEnded
            if (r0 == 0) goto Lc
            java.nio.ByteBuffer r0 = r2.outputBuffer
            java.nio.ByteBuffer r1 = com.google.android.exoplayer2.audio.AudioProcessor.EMPTY_BUFFER
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat onConfigure(com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat r1) throws com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException {
            r0 = this;
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r1 = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET
            return r1
    }

    public void onFlush() {
            r0 = this;
            return
    }

    public void onQueueEndOfStream() {
            r0 = this;
            return
    }

    public void onReset() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueEndOfStream() {
            r1 = this;
            r0 = 1
            r1.inputEnded = r0
            r1.onQueueEndOfStream()
            return
    }

    public final java.nio.ByteBuffer replaceOutputBuffer(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            int r0 = r0.capacity()
            if (r0 >= r2) goto L17
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r0)
            r1.buffer = r2
            goto L1c
        L17:
            java.nio.ByteBuffer r2 = r1.buffer
            r2.clear()
        L1c:
            java.nio.ByteBuffer r2 = r1.buffer
            r1.outputBuffer = r2
            return r2
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
            r1 = this;
            r1.flush()
            java.nio.ByteBuffer r0 = com.google.android.exoplayer2.audio.AudioProcessor.EMPTY_BUFFER
            r1.buffer = r0
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r0 = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET
            r1.pendingInputAudioFormat = r0
            r1.pendingOutputAudioFormat = r0
            r1.inputAudioFormat = r0
            r1.outputAudioFormat = r0
            r1.onReset()
            return
    }
}
