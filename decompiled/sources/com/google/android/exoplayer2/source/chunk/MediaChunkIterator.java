package com.google.android.exoplayer2.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public interface MediaChunkIterator {
    public static final com.google.android.exoplayer2.source.chunk.MediaChunkIterator EMPTY = null;


    static {
            com.google.android.exoplayer2.source.chunk.MediaChunkIterator$1 r0 = new com.google.android.exoplayer2.source.chunk.MediaChunkIterator$1
            r0.<init>()
            com.google.android.exoplayer2.source.chunk.MediaChunkIterator.EMPTY = r0
            return
    }

    long getChunkEndTimeUs();

    long getChunkStartTimeUs();

    com.google.android.exoplayer2.upstream.DataSpec getDataSpec();

    boolean isEnded();

    boolean next();

    void reset();
}
