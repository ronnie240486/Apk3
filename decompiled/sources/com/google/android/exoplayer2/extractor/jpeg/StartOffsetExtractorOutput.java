package com.google.android.exoplayer2.extractor.jpeg;

/* JADX INFO: loaded from: classes2.dex */
public final class StartOffsetExtractorOutput implements com.google.android.exoplayer2.extractor.ExtractorOutput {
    private final com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private final long startOffset;


    public StartOffsetExtractorOutput(long r1, com.google.android.exoplayer2.extractor.ExtractorOutput r3) {
            r0 = this;
            r0.<init>()
            r0.startOffset = r1
            r0.extractorOutput = r3
            return
    }

    public static /* synthetic */ long access$000(com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorOutput r2) {
            long r0 = r2.startOffset
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
            r1 = this;
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r1.extractorOutput
            r0.endTracks()
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(com.google.android.exoplayer2.extractor.SeekMap r3) {
            r2 = this;
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r2.extractorOutput
            com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorOutput$1 r1 = new com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorOutput$1
            r1.<init>(r2, r3)
            r0.seekMap(r1)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public com.google.android.exoplayer2.extractor.TrackOutput track(int r2, int r3) {
            r1 = this;
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r1.extractorOutput
            com.google.android.exoplayer2.extractor.TrackOutput r2 = r0.track(r2, r3)
            return r2
    }
}
