package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes3.dex */
final class TrimmingAudioProcessor extends com.google.android.exoplayer2.audio.BaseAudioProcessor {
    private static final int OUTPUT_ENCODING = 2;
    private byte[] endBuffer;
    private int endBufferSize;
    private int pendingTrimStartBytes;
    private boolean reconfigurationPending;
    private int trimEndFrames;
    private int trimStartFrames;
    private long trimmedFrameCount;

    public TrimmingAudioProcessor() {
            r1 = this;
            r1.<init>()
            byte[] r0 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
            r1.endBuffer = r0
            return
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public java.nio.ByteBuffer getOutput() {
            r4 = this;
            boolean r0 = super.isEnded()
            if (r0 == 0) goto L1c
            int r0 = r4.endBufferSize
            if (r0 <= 0) goto L1c
            java.nio.ByteBuffer r0 = r4.replaceOutputBuffer(r0)
            byte[] r1 = r4.endBuffer
            int r2 = r4.endBufferSize
            r3 = 0
            java.nio.ByteBuffer r0 = r0.put(r1, r3, r2)
            r0.flip()
            r4.endBufferSize = r3
        L1c:
            java.nio.ByteBuffer r0 = super.getOutput()
            return r0
    }

    public long getTrimmedFrameCount() {
            r2 = this;
            long r0 = r2.trimmedFrameCount
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
            r1 = this;
            boolean r0 = super.isEnded()
            if (r0 == 0) goto Lc
            int r0 = r1.endBufferSize
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat onConfigure(com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat r3) throws com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException {
            r2 = this;
            int r0 = r3.encoding
            r1 = 2
            if (r0 != r1) goto L14
            r0 = 1
            r2.reconfigurationPending = r0
            int r0 = r2.trimStartFrames
            if (r0 != 0) goto L13
            int r0 = r2.trimEndFrames
            if (r0 == 0) goto L11
            goto L13
        L11:
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r3 = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET
        L13:
            return r3
        L14:
            com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException r0 = new com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException
            r0.<init>(r3)
            throw r0
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void onFlush() {
            r3 = this;
            boolean r0 = r3.reconfigurationPending
            r1 = 0
            if (r0 == 0) goto L19
            r3.reconfigurationPending = r1
            int r0 = r3.trimEndFrames
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r2 = r3.inputAudioFormat
            int r2 = r2.bytesPerFrame
            int r0 = r0 * r2
            byte[] r0 = new byte[r0]
            r3.endBuffer = r0
            int r0 = r3.trimStartFrames
            int r0 = r0 * r2
            r3.pendingTrimStartBytes = r0
        L19:
            r3.endBufferSize = r1
            return
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void onQueueEndOfStream() {
            r5 = this;
            boolean r0 = r5.reconfigurationPending
            if (r0 == 0) goto L16
            int r0 = r5.endBufferSize
            if (r0 <= 0) goto L13
            long r1 = r5.trimmedFrameCount
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r3 = r5.inputAudioFormat
            int r3 = r3.bytesPerFrame
            int r0 = r0 / r3
            long r3 = (long) r0
            long r1 = r1 + r3
            r5.trimmedFrameCount = r1
        L13:
            r0 = 0
            r5.endBufferSize = r0
        L16:
            return
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void onReset() {
            r1 = this;
            byte[] r0 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
            r1.endBuffer = r0
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(java.nio.ByteBuffer r9) {
            r8 = this;
            int r0 = r9.position()
            int r1 = r9.limit()
            int r2 = r1 - r0
            if (r2 != 0) goto Ld
            return
        Ld:
            int r3 = r8.pendingTrimStartBytes
            int r3 = java.lang.Math.min(r2, r3)
            long r4 = r8.trimmedFrameCount
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r6 = r8.inputAudioFormat
            int r6 = r6.bytesPerFrame
            int r6 = r3 / r6
            long r6 = (long) r6
            long r4 = r4 + r6
            r8.trimmedFrameCount = r4
            int r4 = r8.pendingTrimStartBytes
            int r4 = r4 - r3
            r8.pendingTrimStartBytes = r4
            int r0 = r0 + r3
            r9.position(r0)
            int r0 = r8.pendingTrimStartBytes
            if (r0 <= 0) goto L2d
            return
        L2d:
            int r2 = r2 - r3
            int r0 = r8.endBufferSize
            int r0 = r0 + r2
            byte[] r3 = r8.endBuffer
            int r3 = r3.length
            int r0 = r0 - r3
            java.nio.ByteBuffer r3 = r8.replaceOutputBuffer(r0)
            int r4 = r8.endBufferSize
            r5 = 0
            int r4 = com.google.android.exoplayer2.util.Util.constrainValue(r0, r5, r4)
            byte[] r6 = r8.endBuffer
            r3.put(r6, r5, r4)
            int r0 = r0 - r4
            int r0 = com.google.android.exoplayer2.util.Util.constrainValue(r0, r5, r2)
            int r6 = r9.position()
            int r6 = r6 + r0
            r9.limit(r6)
            r3.put(r9)
            r9.limit(r1)
            int r2 = r2 - r0
            int r0 = r8.endBufferSize
            int r0 = r0 - r4
            r8.endBufferSize = r0
            byte[] r1 = r8.endBuffer
            java.lang.System.arraycopy(r1, r4, r1, r5, r0)
            byte[] r0 = r8.endBuffer
            int r1 = r8.endBufferSize
            r9.get(r0, r1, r2)
            int r9 = r8.endBufferSize
            int r9 = r9 + r2
            r8.endBufferSize = r9
            r3.flip()
            return
    }

    public void resetTrimmedFrameCount() {
            r2 = this;
            r0 = 0
            r2.trimmedFrameCount = r0
            return
    }

    public void setTrimFrameCount(int r1, int r2) {
            r0 = this;
            r0.trimStartFrames = r1
            r0.trimEndFrames = r2
            return
    }
}
