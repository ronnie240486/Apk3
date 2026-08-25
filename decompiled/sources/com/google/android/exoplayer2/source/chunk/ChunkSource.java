package com.google.android.exoplayer2.source.chunk;

/* JADX INFO: loaded from: classes3.dex */
public interface ChunkSource {
    long getAdjustedSeekPositionUs(long r1, com.google.android.exoplayer2.SeekParameters r3);

    void getNextChunk(long r1, long r3, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r5, com.google.android.exoplayer2.source.chunk.ChunkHolder r6);

    int getPreferredQueueSize(long r1, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r3);

    void maybeThrowError() throws java.io.IOException;

    void onChunkLoadCompleted(com.google.android.exoplayer2.source.chunk.Chunk r1);

    boolean onChunkLoadError(com.google.android.exoplayer2.source.chunk.Chunk r1, boolean r2, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo r3, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r4);

    void release();

    boolean shouldCancelLoad(long r1, com.google.android.exoplayer2.source.chunk.Chunk r3, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r4);
}
