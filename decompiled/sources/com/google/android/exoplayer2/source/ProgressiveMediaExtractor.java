package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes.dex */
public interface ProgressiveMediaExtractor {

    /* JADX INFO: loaded from: classes3.dex */
    public interface Factory {
        com.google.android.exoplayer2.source.ProgressiveMediaExtractor createProgressiveMediaExtractor(com.google.android.exoplayer2.analytics.PlayerId r1);
    }

    void disableSeekingOnMp3Streams();

    long getCurrentInputPosition();

    void init(com.google.android.exoplayer2.upstream.DataReader r1, android.net.Uri r2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3, long r4, long r6, com.google.android.exoplayer2.extractor.ExtractorOutput r8) throws java.io.IOException;

    int read(com.google.android.exoplayer2.extractor.PositionHolder r1) throws java.io.IOException;

    void release();

    void seek(long r1, long r3);
}
