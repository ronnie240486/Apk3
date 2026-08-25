package com.google.android.exoplayer2.mediacodec;

/* JADX INFO: loaded from: classes2.dex */
final class BatchBuffer extends com.google.android.exoplayer2.decoder.DecoderInputBuffer {
    public static final int DEFAULT_MAX_SAMPLE_COUNT = 32;
    private long lastSampleTimeUs;
    private int maxSampleCount;
    private int sampleCount;

    public BatchBuffer() {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            r0 = 32
            r1.maxSampleCount = r0
            return
    }

    private boolean canAppendSampleBuffer(com.google.android.exoplayer2.decoder.DecoderInputBuffer r5) {
            r4 = this;
            boolean r0 = r4.hasSamples()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r4.sampleCount
            int r2 = r4.maxSampleCount
            r3 = 0
            if (r0 < r2) goto L10
            return r3
        L10:
            boolean r0 = r5.isDecodeOnly()
            boolean r2 = r4.isDecodeOnly()
            if (r0 == r2) goto L1b
            return r3
        L1b:
            java.nio.ByteBuffer r5 = r5.data
            if (r5 == 0) goto L32
            java.nio.ByteBuffer r0 = r4.data
            if (r0 == 0) goto L32
            int r0 = r0.position()
            int r5 = r5.remaining()
            int r5 = r5 + r0
            r0 = 3072000(0x2ee000, float:4.304789E-39)
            if (r5 <= r0) goto L32
            return r3
        L32:
            return r1
    }

    public boolean append(com.google.android.exoplayer2.decoder.DecoderInputBuffer r5) {
            r4 = this;
            boolean r0 = r5.isEncrypted()
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            boolean r0 = r5.hasSupplementalData()
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            boolean r0 = r5.isEndOfStream()
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            boolean r0 = r4.canAppendSampleBuffer(r5)
            if (r0 != 0) goto L21
            r5 = 0
            return r5
        L21:
            int r0 = r4.sampleCount
            int r2 = r0 + 1
            r4.sampleCount = r2
            if (r0 != 0) goto L36
            long r2 = r5.timeUs
            r4.timeUs = r2
            boolean r0 = r5.isKeyFrame()
            if (r0 == 0) goto L36
            r4.setFlags(r1)
        L36:
            boolean r0 = r5.isDecodeOnly()
            if (r0 == 0) goto L41
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.setFlags(r0)
        L41:
            java.nio.ByteBuffer r0 = r5.data
            if (r0 == 0) goto L51
            int r2 = r0.remaining()
            r4.ensureSpaceForWrite(r2)
            java.nio.ByteBuffer r2 = r4.data
            r2.put(r0)
        L51:
            long r2 = r5.timeUs
            r4.lastSampleTimeUs = r2
            return r1
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
            r1 = this;
            super.clear()
            r0 = 0
            r1.sampleCount = r0
            return
    }

    public long getFirstSampleTimeUs() {
            r2 = this;
            long r0 = r2.timeUs
            return r0
    }

    public long getLastSampleTimeUs() {
            r2 = this;
            long r0 = r2.lastSampleTimeUs
            return r0
    }

    public int getSampleCount() {
            r1 = this;
            int r0 = r1.sampleCount
            return r0
    }

    public boolean hasSamples() {
            r1 = this;
            int r0 = r1.sampleCount
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void setMaxSampleCount(@androidx.annotation.IntRange(from = 1) int r2) {
            r1 = this;
            if (r2 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r1.maxSampleCount = r2
            return
    }
}
