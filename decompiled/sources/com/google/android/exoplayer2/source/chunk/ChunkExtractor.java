package com.google.android.exoplayer2.source.chunk;

/* JADX INFO: loaded from: classes2.dex */
public interface ChunkExtractor {

    public interface Factory {
        @androidx.annotation.Nullable
        com.google.android.exoplayer2.source.chunk.ChunkExtractor createProgressiveMediaExtractor(int r1, com.google.android.exoplayer2.Format r2, boolean r3, java.util.List<com.google.android.exoplayer2.Format> r4, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.TrackOutput r5, com.google.android.exoplayer2.analytics.PlayerId r6);
    }

    public interface TrackOutputProvider {
        com.google.android.exoplayer2.extractor.TrackOutput track(int r1, int r2);
    }

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.extractor.ChunkIndex getChunkIndex();

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.Format[] getSampleFormats();

    void init(@androidx.annotation.Nullable com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider r1, long r2, long r4);

    boolean read(com.google.android.exoplayer2.extractor.ExtractorInput r1) throws java.io.IOException;

    void release();
}
