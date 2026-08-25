package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes2.dex */
public interface ElementaryStreamReader {
    void consume(com.google.android.exoplayer2.util.ParsableByteArray r1) throws com.google.android.exoplayer2.ParserException;

    void createTracks(com.google.android.exoplayer2.extractor.ExtractorOutput r1, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator r2);

    void packetFinished();

    void packetStarted(long r1, int r3);

    void seek();
}
