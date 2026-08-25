package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes2.dex */
public final class DummyExtractorOutput implements com.google.android.exoplayer2.extractor.ExtractorOutput {
    public DummyExtractorOutput() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(com.google.android.exoplayer2.extractor.SeekMap r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public com.google.android.exoplayer2.extractor.TrackOutput track(int r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.extractor.DummyTrackOutput r1 = new com.google.android.exoplayer2.extractor.DummyTrackOutput
            r1.<init>()
            return r1
    }
}
