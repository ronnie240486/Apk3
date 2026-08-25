package com.google.android.exoplayer2.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public final class BaseMediaChunkOutput implements com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider {
    private static final java.lang.String TAG = "BaseMediaChunkOutput";
    private final com.google.android.exoplayer2.source.SampleQueue[] sampleQueues;
    private final int[] trackTypes;

    public BaseMediaChunkOutput(int[] r1, com.google.android.exoplayer2.source.SampleQueue[] r2) {
            r0 = this;
            r0.<init>()
            r0.trackTypes = r1
            r0.sampleQueues = r2
            return
    }

    public int[] getWriteIndices() {
            r4 = this;
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r4.sampleQueues
            int r0 = r0.length
            int[] r0 = new int[r0]
            r1 = 0
        L6:
            com.google.android.exoplayer2.source.SampleQueue[] r2 = r4.sampleQueues
            int r3 = r2.length
            if (r1 >= r3) goto L16
            r2 = r2[r1]
            int r2 = r2.getWriteIndex()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L6
        L16:
            return r0
    }

    public void setSampleOffsetUs(long r5) {
            r4 = this;
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r4.sampleQueues
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            r3.setSampleOffsetUs(r5)
            int r2 = r2 + 1
            goto L4
        Le:
            return
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider
    public com.google.android.exoplayer2.extractor.TrackOutput track(int r3, int r4) {
            r2 = this;
            r3 = 0
        L1:
            int[] r0 = r2.trackTypes
            int r1 = r0.length
            if (r3 >= r1) goto L12
            r0 = r0[r3]
            if (r4 != r0) goto Lf
            com.google.android.exoplayer2.source.SampleQueue[] r4 = r2.sampleQueues
            r3 = r4[r3]
            return r3
        Lf:
            int r3 = r3 + 1
            goto L1
        L12:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Unmatched track of type: "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "BaseMediaChunkOutput"
            com.google.android.exoplayer2.util.Log.e(r4, r3)
            com.google.android.exoplayer2.extractor.DummyTrackOutput r3 = new com.google.android.exoplayer2.extractor.DummyTrackOutput
            r3.<init>()
            return r3
    }
}
