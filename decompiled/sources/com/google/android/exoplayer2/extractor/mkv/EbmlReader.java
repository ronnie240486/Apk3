package com.google.android.exoplayer2.extractor.mkv;

/* JADX INFO: loaded from: classes2.dex */
interface EbmlReader {
    void init(com.google.android.exoplayer2.extractor.mkv.EbmlProcessor r1);

    boolean read(com.google.android.exoplayer2.extractor.ExtractorInput r1) throws java.io.IOException;

    void reset();
}
