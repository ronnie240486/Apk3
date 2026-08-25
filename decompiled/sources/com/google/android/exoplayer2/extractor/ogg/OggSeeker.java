package com.google.android.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes.dex */
interface OggSeeker {
    @androidx.annotation.Nullable
    com.google.android.exoplayer2.extractor.SeekMap createSeekMap();

    long read(com.google.android.exoplayer2.extractor.ExtractorInput r1) throws java.io.IOException;

    void startSeek(long r1);
}
