package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes.dex */
public final class EmptySampleStream implements com.google.android.exoplayer2.source.SampleStream {
    public EmptySampleStream() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public boolean isReady() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public void maybeThrowError() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int readData(com.google.android.exoplayer2.FormatHolder r1, com.google.android.exoplayer2.decoder.DecoderInputBuffer r2, int r3) {
            r0 = this;
            r1 = 4
            r2.setFlags(r1)
            r1 = -4
            return r1
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int skipData(long r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
