package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class PassthroughSectionPayloadReader implements com.google.android.exoplayer2.extractor.ts.SectionPayloadReader {
    private com.google.android.exoplayer2.Format format;
    private com.google.android.exoplayer2.extractor.TrackOutput output;
    private com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster;

    public PassthroughSectionPayloadReader(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            com.google.android.exoplayer2.Format$Builder r2 = r0.setSampleMimeType(r2)
            com.google.android.exoplayer2.Format r2 = r2.build()
            r1.format = r2
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"timestampAdjuster", "output"})
    private void assertInitialized() {
            r1 = this;
            com.google.android.exoplayer2.util.TimestampAdjuster r0 = r1.timestampAdjuster
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r1.output
            com.google.android.exoplayer2.util.Util.castNonNull(r0)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
    public void consume(com.google.android.exoplayer2.util.ParsableByteArray r9) {
            r8 = this;
            r8.assertInitialized()
            com.google.android.exoplayer2.util.TimestampAdjuster r0 = r8.timestampAdjuster
            long r2 = r0.getLastAdjustedTimestampUs()
            com.google.android.exoplayer2.util.TimestampAdjuster r0 = r8.timestampAdjuster
            long r0 = r0.getTimestampOffsetUs()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L49
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L49
        L1d:
            com.google.android.exoplayer2.Format r4 = r8.format
            long r5 = r4.subsampleOffsetUs
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 == 0) goto L38
            com.google.android.exoplayer2.Format$Builder r4 = r4.buildUpon()
            com.google.android.exoplayer2.Format$Builder r0 = r4.setSubsampleOffsetUs(r0)
            com.google.android.exoplayer2.Format r0 = r0.build()
            r8.format = r0
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r8.output
            r1.format(r0)
        L38:
            int r5 = r9.bytesLeft()
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r8.output
            r0.sampleData(r9, r5)
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r8.output
            r4 = 1
            r6 = 0
            r7 = 0
            r1.sampleMetadata(r2, r4, r5, r6, r7)
        L49:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
    public void init(com.google.android.exoplayer2.util.TimestampAdjuster r1, com.google.android.exoplayer2.extractor.ExtractorOutput r2, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator r3) {
            r0 = this;
            r0.timestampAdjuster = r1
            r3.generateNewId()
            int r1 = r3.getTrackId()
            r3 = 5
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r2.track(r1, r3)
            r0.output = r1
            com.google.android.exoplayer2.Format r2 = r0.format
            r1.format(r2)
            return
    }
}
