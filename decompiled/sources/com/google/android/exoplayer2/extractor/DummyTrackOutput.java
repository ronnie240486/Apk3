package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes2.dex */
public final class DummyTrackOutput implements com.google.android.exoplayer2.extractor.TrackOutput {
    private final byte[] readBuffer;

    public DummyTrackOutput() {
            r1 = this;
            r1.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r1.readBuffer = r0
            return
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public void format(com.google.android.exoplayer2.Format r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final /* synthetic */ int sampleData(com.google.android.exoplayer2.upstream.DataReader r1, int r2, boolean r3) {
            r0 = this;
            int r1 = com.google.android.exoplayer2.extractor.TrackOutput.CC.$default$sampleData(r0, r1, r2, r3)
            return r1
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public int sampleData(com.google.android.exoplayer2.upstream.DataReader r2, int r3, boolean r4, int r5) throws java.io.IOException {
            r1 = this;
            byte[] r5 = r1.readBuffer
            int r5 = r5.length
            int r3 = java.lang.Math.min(r5, r3)
            byte[] r5 = r1.readBuffer
            r0 = 0
            int r2 = r2.read(r5, r0, r3)
            r3 = -1
            if (r2 != r3) goto L1a
            if (r4 == 0) goto L14
            return r3
        L14:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
        L1a:
            return r2
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final /* synthetic */ void sampleData(com.google.android.exoplayer2.util.ParsableByteArray r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.extractor.TrackOutput.CC.$default$sampleData(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public void sampleData(com.google.android.exoplayer2.util.ParsableByteArray r1, int r2, int r3) {
            r0 = this;
            r1.skipBytes(r2)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public void sampleMetadata(long r1, int r3, int r4, int r5, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.TrackOutput.CryptoData r6) {
            r0 = this;
            return
    }
}
