package com.google.android.exoplayer2.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMediaChunk extends com.google.android.exoplayer2.source.chunk.MediaChunk {
    public final long clippedEndTimeUs;
    public final long clippedStartTimeUs;
    private int[] firstSampleIndices;
    private com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput output;

    public BaseMediaChunk(com.google.android.exoplayer2.upstream.DataSource r14, com.google.android.exoplayer2.upstream.DataSpec r15, com.google.android.exoplayer2.Format r16, int r17, @androidx.annotation.Nullable java.lang.Object r18, long r19, long r21, long r23, long r25, long r27) {
            r13 = this;
            r12 = r13
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r8 = r21
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10)
            r0 = r23
            r12.clippedStartTimeUs = r0
            r0 = r25
            r12.clippedEndTimeUs = r0
            return
    }

    public final int getFirstSampleIndex(int r2) {
            r1 = this;
            int[] r0 = r1.firstSampleIndices
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            int[] r0 = (int[]) r0
            r2 = r0[r2]
            return r2
    }

    public final com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput getOutput() {
            r1 = this;
            com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput r0 = r1.output
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput r0 = (com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput) r0
            return r0
    }

    public void init(com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput r1) {
            r0 = this;
            r0.output = r1
            int[] r1 = r1.getWriteIndices()
            r0.firstSampleIndices = r1
            return
    }
}
