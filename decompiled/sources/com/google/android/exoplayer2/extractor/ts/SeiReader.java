package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes2.dex */
public final class SeiReader {
    private final java.util.List<com.google.android.exoplayer2.Format> closedCaptionFormats;
    private final com.google.android.exoplayer2.extractor.TrackOutput[] outputs;

    public SeiReader(java.util.List<com.google.android.exoplayer2.Format> r1) {
            r0 = this;
            r0.<init>()
            r0.closedCaptionFormats = r1
            int r1 = r1.size()
            com.google.android.exoplayer2.extractor.TrackOutput[] r1 = new com.google.android.exoplayer2.extractor.TrackOutput[r1]
            r0.outputs = r1
            return
    }

    public void consume(long r2, com.google.android.exoplayer2.util.ParsableByteArray r4) {
            r1 = this;
            com.google.android.exoplayer2.extractor.TrackOutput[] r0 = r1.outputs
            com.google.android.exoplayer2.extractor.CeaUtil.consume(r2, r4, r0)
            return
    }

    public void createTracks(com.google.android.exoplayer2.extractor.ExtractorOutput r9, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator r10) {
            r8 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.android.exoplayer2.extractor.TrackOutput[] r2 = r8.outputs
            int r2 = r2.length
            if (r1 >= r2) goto L81
            r10.generateNewId()
            int r2 = r10.getTrackId()
            r3 = 3
            com.google.android.exoplayer2.extractor.TrackOutput r2 = r9.track(r2, r3)
            java.util.List<com.google.android.exoplayer2.Format> r3 = r8.closedCaptionFormats
            java.lang.Object r3 = r3.get(r1)
            com.google.android.exoplayer2.Format r3 = (com.google.android.exoplayer2.Format) r3
            java.lang.String r4 = r3.sampleMimeType
            java.lang.String r5 = "application/cea-608"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L30
            java.lang.String r5 = "application/cea-708"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L2e
            goto L30
        L2e:
            r5 = 0
            goto L31
        L30:
            r5 = 1
        L31:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Invalid closed caption mime type provided: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.google.android.exoplayer2.util.Assertions.checkArgument(r5, r6)
            java.lang.String r5 = r3.id
            if (r5 == 0) goto L4a
            goto L4e
        L4a:
            java.lang.String r5 = r10.getFormatId()
        L4e:
            com.google.android.exoplayer2.Format$Builder r6 = new com.google.android.exoplayer2.Format$Builder
            r6.<init>()
            com.google.android.exoplayer2.Format$Builder r5 = r6.setId(r5)
            com.google.android.exoplayer2.Format$Builder r4 = r5.setSampleMimeType(r4)
            int r5 = r3.selectionFlags
            com.google.android.exoplayer2.Format$Builder r4 = r4.setSelectionFlags(r5)
            java.lang.String r5 = r3.language
            com.google.android.exoplayer2.Format$Builder r4 = r4.setLanguage(r5)
            int r5 = r3.accessibilityChannel
            com.google.android.exoplayer2.Format$Builder r4 = r4.setAccessibilityChannel(r5)
            java.util.List<byte[]> r3 = r3.initializationData
            com.google.android.exoplayer2.Format$Builder r3 = r4.setInitializationData(r3)
            com.google.android.exoplayer2.Format r3 = r3.build()
            r2.format(r3)
            com.google.android.exoplayer2.extractor.TrackOutput[] r3 = r8.outputs
            r3[r1] = r2
            int r1 = r1 + 1
            goto L2
        L81:
            return
    }
}
