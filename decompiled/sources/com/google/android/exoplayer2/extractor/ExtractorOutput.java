package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes.dex */
public interface ExtractorOutput {
    public static final com.google.android.exoplayer2.extractor.ExtractorOutput PLACEHOLDER = null;


    static {
            com.google.android.exoplayer2.extractor.ExtractorOutput$1 r0 = new com.google.android.exoplayer2.extractor.ExtractorOutput$1
            r0.<init>()
            com.google.android.exoplayer2.extractor.ExtractorOutput.PLACEHOLDER = r0
            return
    }

    void endTracks();

    void seekMap(com.google.android.exoplayer2.extractor.SeekMap r1);

    com.google.android.exoplayer2.extractor.TrackOutput track(int r1, int r2);
}
