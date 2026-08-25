package com.google.android.exoplayer2.extractor.jpeg;

/* JADX INFO: loaded from: classes2.dex */
final class StartOffsetExtractorInput extends com.google.android.exoplayer2.extractor.ForwardingExtractorInput {
    private final long startOffset;

    public StartOffsetExtractorInput(com.google.android.exoplayer2.extractor.ExtractorInput r3, long r4) {
            r2 = this;
            r2.<init>(r3)
            long r0 = r3.getPosition()
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 < 0) goto Ld
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r3)
            r2.startOffset = r4
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
            r4 = this;
            long r0 = super.getLength()
            long r2 = r4.startOffset
            long r0 = r0 - r2
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPeekPosition() {
            r4 = this;
            long r0 = super.getPeekPosition()
            long r2 = r4.startOffset
            long r0 = r0 - r2
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
            r4 = this;
            long r0 = super.getPosition()
            long r2 = r4.startOffset
            long r0 = r0 - r2
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public <E extends java.lang.Throwable> void setRetryPosition(long r3, E r5) throws java.lang.Throwable {
            r2 = this;
            long r0 = r2.startOffset
            long r3 = r3 + r0
            super.setRetryPosition(r3, r5)
            return
    }
}
