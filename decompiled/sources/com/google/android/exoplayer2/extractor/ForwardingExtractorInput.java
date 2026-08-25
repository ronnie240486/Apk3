package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes2.dex */
public class ForwardingExtractorInput implements com.google.android.exoplayer2.extractor.ExtractorInput {
    private final com.google.android.exoplayer2.extractor.ExtractorInput input;

    public ForwardingExtractorInput(com.google.android.exoplayer2.extractor.ExtractorInput r1) {
            r0 = this;
            r0.<init>()
            r0.input = r1
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void advancePeekPosition(int r2) throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r1.input
            r0.advancePeekPosition(r2)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean advancePeekPosition(int r2, boolean r3) throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r1.input
            boolean r2 = r0.advancePeekPosition(r2, r3)
            return r2
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
            r2 = this;
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r2.input
            long r0 = r0.getLength()
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPeekPosition() {
            r2 = this;
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r2.input
            long r0 = r0.getPeekPosition()
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
            r2 = this;
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r2.input
            long r0 = r0.getPosition()
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int peek(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r1.input
            int r2 = r0.peek(r2, r3, r4)
            return r2
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void peekFully(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r1.input
            r0.peekFully(r2, r3, r4)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean peekFully(byte[] r2, int r3, int r4, boolean r5) throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r1.input
            boolean r2 = r0.peekFully(r2, r3, r4, r5)
            return r2
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r1.input
            int r2 = r0.read(r2, r3, r4)
            return r2
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void readFully(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r1.input
            r0.readFully(r2, r3, r4)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean readFully(byte[] r2, int r3, int r4, boolean r5) throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r1.input
            boolean r2 = r0.readFully(r2, r3, r4, r5)
            return r2
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void resetPeekPosition() {
            r1 = this;
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r1.input
            r0.resetPeekPosition()
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public <E extends java.lang.Throwable> void setRetryPosition(long r2, E r4) throws java.lang.Throwable {
            r1 = this;
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r1.input
            r0.setRetryPosition(r2, r4)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int skip(int r2) throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r1.input
            int r2 = r0.skip(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void skipFully(int r2) throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r1.input
            r0.skipFully(r2)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean skipFully(int r2, boolean r3) throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r1.input
            boolean r2 = r0.skipFully(r2, r3)
            return r2
    }
}
