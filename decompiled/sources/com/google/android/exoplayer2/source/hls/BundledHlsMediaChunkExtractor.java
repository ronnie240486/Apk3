package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes.dex */
public final class BundledHlsMediaChunkExtractor implements com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor {
    private static final com.google.android.exoplayer2.extractor.PositionHolder POSITION_HOLDER = null;

    @androidx.annotation.VisibleForTesting
    public final com.google.android.exoplayer2.extractor.Extractor extractor;
    private final com.google.android.exoplayer2.Format multivariantPlaylistFormat;
    private final com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster;

    static {
            com.google.android.exoplayer2.extractor.PositionHolder r0 = new com.google.android.exoplayer2.extractor.PositionHolder
            r0.<init>()
            com.google.android.exoplayer2.source.hls.BundledHlsMediaChunkExtractor.POSITION_HOLDER = r0
            return
    }

    public BundledHlsMediaChunkExtractor(com.google.android.exoplayer2.extractor.Extractor r1, com.google.android.exoplayer2.Format r2, com.google.android.exoplayer2.util.TimestampAdjuster r3) {
            r0 = this;
            r0.<init>()
            r0.extractor = r1
            r0.multivariantPlaylistFormat = r2
            r0.timestampAdjuster = r3
            return
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r2) {
            r1 = this;
            com.google.android.exoplayer2.extractor.Extractor r0 = r1.extractor
            r0.init(r2)
            return
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public boolean isPackedAudioExtractor() {
            r2 = this;
            com.google.android.exoplayer2.extractor.Extractor r0 = r2.extractor
            boolean r1 = r0 instanceof com.google.android.exoplayer2.extractor.ts.AdtsExtractor
            if (r1 != 0) goto L15
            boolean r1 = r0 instanceof com.google.android.exoplayer2.extractor.ts.Ac3Extractor
            if (r1 != 0) goto L15
            boolean r1 = r0 instanceof com.google.android.exoplayer2.extractor.ts.Ac4Extractor
            if (r1 != 0) goto L15
            boolean r0 = r0 instanceof com.google.android.exoplayer2.extractor.mp3.Mp3Extractor
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public boolean isReusable() {
            r2 = this;
            com.google.android.exoplayer2.extractor.Extractor r0 = r2.extractor
            boolean r1 = r0 instanceof com.google.android.exoplayer2.extractor.ts.TsExtractor
            if (r1 != 0) goto Ld
            boolean r0 = r0 instanceof com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public void onTruncatedSegmentParsed() {
            r3 = this;
            com.google.android.exoplayer2.extractor.Extractor r0 = r3.extractor
            r1 = 0
            r0.seek(r1, r1)
            return
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public boolean read(com.google.android.exoplayer2.extractor.ExtractorInput r3) throws java.io.IOException {
            r2 = this;
            com.google.android.exoplayer2.extractor.Extractor r0 = r2.extractor
            com.google.android.exoplayer2.extractor.PositionHolder r1 = com.google.android.exoplayer2.source.hls.BundledHlsMediaChunkExtractor.POSITION_HOLDER
            int r3 = r0.read(r3, r1)
            if (r3 != 0) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            return r3
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor recreate() {
            r4 = this;
            boolean r0 = r4.isReusable()
            r0 = r0 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            com.google.android.exoplayer2.extractor.Extractor r0 = r4.extractor
            boolean r1 = r0 instanceof com.google.android.exoplayer2.source.hls.WebvttExtractor
            if (r1 == 0) goto L1b
            com.google.android.exoplayer2.source.hls.WebvttExtractor r0 = new com.google.android.exoplayer2.source.hls.WebvttExtractor
            com.google.android.exoplayer2.Format r1 = r4.multivariantPlaylistFormat
            java.lang.String r1 = r1.language
            com.google.android.exoplayer2.util.TimestampAdjuster r2 = r4.timestampAdjuster
            r0.<init>(r1, r2)
            goto L42
        L1b:
            boolean r1 = r0 instanceof com.google.android.exoplayer2.extractor.ts.AdtsExtractor
            if (r1 == 0) goto L25
            com.google.android.exoplayer2.extractor.ts.AdtsExtractor r0 = new com.google.android.exoplayer2.extractor.ts.AdtsExtractor
            r0.<init>()
            goto L42
        L25:
            boolean r1 = r0 instanceof com.google.android.exoplayer2.extractor.ts.Ac3Extractor
            if (r1 == 0) goto L2f
            com.google.android.exoplayer2.extractor.ts.Ac3Extractor r0 = new com.google.android.exoplayer2.extractor.ts.Ac3Extractor
            r0.<init>()
            goto L42
        L2f:
            boolean r1 = r0 instanceof com.google.android.exoplayer2.extractor.ts.Ac4Extractor
            if (r1 == 0) goto L39
            com.google.android.exoplayer2.extractor.ts.Ac4Extractor r0 = new com.google.android.exoplayer2.extractor.ts.Ac4Extractor
            r0.<init>()
            goto L42
        L39:
            boolean r0 = r0 instanceof com.google.android.exoplayer2.extractor.mp3.Mp3Extractor
            if (r0 == 0) goto L4c
            com.google.android.exoplayer2.extractor.mp3.Mp3Extractor r0 = new com.google.android.exoplayer2.extractor.mp3.Mp3Extractor
            r0.<init>()
        L42:
            com.google.android.exoplayer2.source.hls.BundledHlsMediaChunkExtractor r1 = new com.google.android.exoplayer2.source.hls.BundledHlsMediaChunkExtractor
            com.google.android.exoplayer2.Format r2 = r4.multivariantPlaylistFormat
            com.google.android.exoplayer2.util.TimestampAdjuster r3 = r4.timestampAdjuster
            r1.<init>(r0, r2, r3)
            return r1
        L4c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unexpected extractor type for recreation: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            com.google.android.exoplayer2.extractor.Extractor r2 = r4.extractor
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
