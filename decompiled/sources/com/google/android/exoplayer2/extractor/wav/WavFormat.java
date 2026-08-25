package com.google.android.exoplayer2.extractor.wav;

/* JADX INFO: loaded from: classes2.dex */
final class WavFormat {
    public final int averageBytesPerSecond;
    public final int bitsPerSample;
    public final int blockSize;
    public final byte[] extraData;
    public final int formatType;
    public final int frameRateHz;
    public final int numChannels;

    public WavFormat(int r1, int r2, int r3, int r4, int r5, int r6, byte[] r7) {
            r0 = this;
            r0.<init>()
            r0.formatType = r1
            r0.numChannels = r2
            r0.frameRateHz = r3
            r0.averageBytesPerSecond = r4
            r0.blockSize = r5
            r0.bitsPerSample = r6
            r0.extraData = r7
            return
    }
}
