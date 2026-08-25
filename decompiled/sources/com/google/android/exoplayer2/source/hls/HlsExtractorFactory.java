package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes.dex */
public interface HlsExtractorFactory {
    public static final com.google.android.exoplayer2.source.hls.HlsExtractorFactory DEFAULT = null;

    static {
            com.google.android.exoplayer2.source.hls.DefaultHlsExtractorFactory r0 = new com.google.android.exoplayer2.source.hls.DefaultHlsExtractorFactory
            r0.<init>()
            com.google.android.exoplayer2.source.hls.HlsExtractorFactory.DEFAULT = r0
            return
    }

    com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor createExtractor(android.net.Uri r1, com.google.android.exoplayer2.Format r2, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.Format> r3, com.google.android.exoplayer2.util.TimestampAdjuster r4, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r5, com.google.android.exoplayer2.extractor.ExtractorInput r6, com.google.android.exoplayer2.analytics.PlayerId r7) throws java.io.IOException;
}
