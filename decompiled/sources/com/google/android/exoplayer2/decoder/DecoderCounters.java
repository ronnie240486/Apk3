package com.google.android.exoplayer2.decoder;

/* JADX INFO: loaded from: classes2.dex */
public final class DecoderCounters {
    public int decoderInitCount;
    public int decoderReleaseCount;
    public int droppedBufferCount;
    public int droppedInputBufferCount;
    public int droppedToKeyframeCount;
    public int maxConsecutiveDroppedBufferCount;
    public int queuedInputBufferCount;
    public int renderedOutputBufferCount;
    public int skippedInputBufferCount;
    public int skippedOutputBufferCount;
    public long totalVideoFrameProcessingOffsetUs;
    public int videoFrameProcessingOffsetCount;

    public DecoderCounters() {
            r0 = this;
            r0.<init>()
            return
    }

    private void addVideoFrameProcessingOffsets(long r3, int r5) {
            r2 = this;
            long r0 = r2.totalVideoFrameProcessingOffsetUs
            long r0 = r0 + r3
            r2.totalVideoFrameProcessingOffsetUs = r0
            int r3 = r2.videoFrameProcessingOffsetCount
            int r3 = r3 + r5
            r2.videoFrameProcessingOffsetCount = r3
            return
    }

    public void addVideoFrameProcessingOffset(long r2) {
            r1 = this;
            r0 = 1
            r1.addVideoFrameProcessingOffsets(r2, r0)
            return
    }

    public synchronized void ensureUpdated() {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    public void merge(com.google.android.exoplayer2.decoder.DecoderCounters r3) {
            r2 = this;
            int r0 = r2.decoderInitCount
            int r1 = r3.decoderInitCount
            int r0 = r0 + r1
            r2.decoderInitCount = r0
            int r0 = r2.decoderReleaseCount
            int r1 = r3.decoderReleaseCount
            int r0 = r0 + r1
            r2.decoderReleaseCount = r0
            int r0 = r2.queuedInputBufferCount
            int r1 = r3.queuedInputBufferCount
            int r0 = r0 + r1
            r2.queuedInputBufferCount = r0
            int r0 = r2.skippedInputBufferCount
            int r1 = r3.skippedInputBufferCount
            int r0 = r0 + r1
            r2.skippedInputBufferCount = r0
            int r0 = r2.renderedOutputBufferCount
            int r1 = r3.renderedOutputBufferCount
            int r0 = r0 + r1
            r2.renderedOutputBufferCount = r0
            int r0 = r2.skippedOutputBufferCount
            int r1 = r3.skippedOutputBufferCount
            int r0 = r0 + r1
            r2.skippedOutputBufferCount = r0
            int r0 = r2.droppedBufferCount
            int r1 = r3.droppedBufferCount
            int r0 = r0 + r1
            r2.droppedBufferCount = r0
            int r0 = r2.droppedInputBufferCount
            int r1 = r3.droppedInputBufferCount
            int r0 = r0 + r1
            r2.droppedInputBufferCount = r0
            int r0 = r2.maxConsecutiveDroppedBufferCount
            int r1 = r3.maxConsecutiveDroppedBufferCount
            int r0 = java.lang.Math.max(r0, r1)
            r2.maxConsecutiveDroppedBufferCount = r0
            int r0 = r2.droppedToKeyframeCount
            int r1 = r3.droppedToKeyframeCount
            int r0 = r0 + r1
            r2.droppedToKeyframeCount = r0
            long r0 = r3.totalVideoFrameProcessingOffsetUs
            int r3 = r3.videoFrameProcessingOffsetCount
            r2.addVideoFrameProcessingOffsets(r0, r3)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 12
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.decoderInitCount
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.decoderReleaseCount
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.queuedInputBufferCount
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r1 = r3.skippedInputBufferCount
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            int r1 = r3.renderedOutputBufferCount
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            int r1 = r3.skippedOutputBufferCount
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 5
            r0[r2] = r1
            int r1 = r3.droppedBufferCount
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 6
            r0[r2] = r1
            int r1 = r3.droppedInputBufferCount
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 7
            r0[r2] = r1
            int r1 = r3.maxConsecutiveDroppedBufferCount
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 8
            r0[r2] = r1
            int r1 = r3.droppedToKeyframeCount
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 9
            r0[r2] = r1
            long r1 = r3.totalVideoFrameProcessingOffsetUs
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 10
            r0[r2] = r1
            int r1 = r3.videoFrameProcessingOffsetCount
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 11
            r0[r2] = r1
            java.lang.String r1 = "DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}"
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.formatInvariant(r1, r0)
            return r0
    }
}
