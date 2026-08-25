package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes.dex */
public interface HlsMediaChunkExtractor {
    void init(com.google.android.exoplayer2.extractor.ExtractorOutput r1);

    boolean isPackedAudioExtractor();

    boolean isReusable();

    void onTruncatedSegmentParsed();

    boolean read(com.google.android.exoplayer2.extractor.ExtractorInput r1) throws java.io.IOException;

    com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor recreate();
}
