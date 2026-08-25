package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes2.dex */
final class ChannelMappingAudioProcessor extends com.google.android.exoplayer2.audio.BaseAudioProcessor {

    @androidx.annotation.Nullable
    private int[] outputChannels;

    @androidx.annotation.Nullable
    private int[] pendingOutputChannels;

    public ChannelMappingAudioProcessor() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat onConfigure(com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat r9) throws com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException {
            r8 = this;
            int[] r0 = r8.pendingOutputChannels
            if (r0 != 0) goto L7
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r9 = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET
            return r9
        L7:
            int r1 = r9.encoding
            r2 = 2
            if (r1 != r2) goto L3d
            int r1 = r9.channelCount
            int r3 = r0.length
            r4 = 1
            r5 = 0
            if (r1 == r3) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            r3 = 0
        L17:
            int r6 = r0.length
            if (r3 >= r6) goto L2f
            r6 = r0[r3]
            int r7 = r9.channelCount
            if (r6 >= r7) goto L29
            if (r6 == r3) goto L24
            r6 = 1
            goto L25
        L24:
            r6 = 0
        L25:
            r1 = r1 | r6
            int r3 = r3 + 1
            goto L17
        L29:
            com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException r0 = new com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException
            r0.<init>(r9)
            throw r0
        L2f:
            if (r1 == 0) goto L3a
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r1 = new com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat
            int r9 = r9.sampleRate
            int r0 = r0.length
            r1.<init>(r9, r0, r2)
            goto L3c
        L3a:
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r1 = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET
        L3c:
            return r1
        L3d:
            com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException r0 = new com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException
            r0.<init>(r9)
            throw r0
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void onFlush() {
            r1 = this;
            int[] r0 = r1.pendingOutputChannels
            r1.outputChannels = r0
            return
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void onReset() {
            r1 = this;
            r0 = 0
            r1.outputChannels = r0
            r1.pendingOutputChannels = r0
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(java.nio.ByteBuffer r8) {
            r7 = this;
            int[] r0 = r7.outputChannels
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            int[] r0 = (int[]) r0
            int r1 = r8.position()
            int r2 = r8.limit()
            int r3 = r2 - r1
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r4 = r7.inputAudioFormat
            int r4 = r4.bytesPerFrame
            int r3 = r3 / r4
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r4 = r7.outputAudioFormat
            int r4 = r4.bytesPerFrame
            int r3 = r3 * r4
            java.nio.ByteBuffer r3 = r7.replaceOutputBuffer(r3)
        L21:
            if (r1 >= r2) goto L3c
            int r4 = r0.length
            r5 = 0
        L25:
            if (r5 >= r4) goto L36
            r6 = r0[r5]
            int r6 = r6 * 2
            int r6 = r6 + r1
            short r6 = r8.getShort(r6)
            r3.putShort(r6)
            int r5 = r5 + 1
            goto L25
        L36:
            com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat r4 = r7.inputAudioFormat
            int r4 = r4.bytesPerFrame
            int r1 = r1 + r4
            goto L21
        L3c:
            r8.position(r2)
            r3.flip()
            return
    }

    public void setChannelMap(@androidx.annotation.Nullable int[] r1) {
            r0 = this;
            r0.pendingOutputChannels = r1
            return
    }
}
