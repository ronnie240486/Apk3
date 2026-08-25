package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes2.dex */
public final class DvbSubtitleReader implements com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader {
    private int bytesToCheck;
    private final com.google.android.exoplayer2.extractor.TrackOutput[] outputs;
    private int sampleBytesWritten;
    private long sampleTimeUs;
    private final java.util.List<com.google.android.exoplayer2.extractor.ts.TsPayloadReader.DvbSubtitleInfo> subtitleInfos;
    private boolean writingSample;

    public DvbSubtitleReader(java.util.List<com.google.android.exoplayer2.extractor.ts.TsPayloadReader.DvbSubtitleInfo> r3) {
            r2 = this;
            r2.<init>()
            r2.subtitleInfos = r3
            int r3 = r3.size()
            com.google.android.exoplayer2.extractor.TrackOutput[] r3 = new com.google.android.exoplayer2.extractor.TrackOutput[r3]
            r2.outputs = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.sampleTimeUs = r0
            return
    }

    private boolean checkNextByte(com.google.android.exoplayer2.util.ParsableByteArray r3, int r4) {
            r2 = this;
            int r0 = r3.bytesLeft()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r3 = r3.readUnsignedByte()
            if (r3 == r4) goto L10
            r2.writingSample = r1
        L10:
            int r3 = r2.bytesToCheck
            int r3 = r3 + (-1)
            r2.bytesToCheck = r3
            boolean r3 = r2.writingSample
            return r3
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(com.google.android.exoplayer2.util.ParsableByteArray r7) {
            r6 = this;
            boolean r0 = r6.writingSample
            if (r0 == 0) goto L3c
            int r0 = r6.bytesToCheck
            r1 = 2
            if (r0 != r1) goto L12
            r0 = 32
            boolean r0 = r6.checkNextByte(r7, r0)
            if (r0 != 0) goto L12
            return
        L12:
            int r0 = r6.bytesToCheck
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1f
            boolean r0 = r6.checkNextByte(r7, r1)
            if (r0 != 0) goto L1f
            return
        L1f:
            int r0 = r7.getPosition()
            int r2 = r7.bytesLeft()
            com.google.android.exoplayer2.extractor.TrackOutput[] r3 = r6.outputs
            int r4 = r3.length
        L2a:
            if (r1 >= r4) goto L37
            r5 = r3[r1]
            r7.setPosition(r0)
            r5.sampleData(r7, r2)
            int r1 = r1 + 1
            goto L2a
        L37:
            int r7 = r6.sampleBytesWritten
            int r7 = r7 + r2
            r6.sampleBytesWritten = r7
        L3c:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(com.google.android.exoplayer2.extractor.ExtractorOutput r6, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator r7) {
            r5 = this;
            r0 = 0
        L1:
            com.google.android.exoplayer2.extractor.TrackOutput[] r1 = r5.outputs
            int r1 = r1.length
            if (r0 >= r1) goto L4b
            java.util.List<com.google.android.exoplayer2.extractor.ts.TsPayloadReader$DvbSubtitleInfo> r1 = r5.subtitleInfos
            java.lang.Object r1 = r1.get(r0)
            com.google.android.exoplayer2.extractor.ts.TsPayloadReader$DvbSubtitleInfo r1 = (com.google.android.exoplayer2.extractor.ts.TsPayloadReader.DvbSubtitleInfo) r1
            r7.generateNewId()
            int r2 = r7.getTrackId()
            r3 = 3
            com.google.android.exoplayer2.extractor.TrackOutput r2 = r6.track(r2, r3)
            com.google.android.exoplayer2.Format$Builder r3 = new com.google.android.exoplayer2.Format$Builder
            r3.<init>()
            java.lang.String r4 = r7.getFormatId()
            com.google.android.exoplayer2.Format$Builder r3 = r3.setId(r4)
            java.lang.String r4 = "application/dvbsubs"
            com.google.android.exoplayer2.Format$Builder r3 = r3.setSampleMimeType(r4)
            byte[] r4 = r1.initializationData
            java.util.List r4 = java.util.Collections.singletonList(r4)
            com.google.android.exoplayer2.Format$Builder r3 = r3.setInitializationData(r4)
            java.lang.String r1 = r1.language
            com.google.android.exoplayer2.Format$Builder r1 = r3.setLanguage(r1)
            com.google.android.exoplayer2.Format r1 = r1.build()
            r2.format(r1)
            com.google.android.exoplayer2.extractor.TrackOutput[] r1 = r5.outputs
            r1[r0] = r2
            int r0 = r0 + 1
            goto L1
        L4b:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
            r12 = this;
            boolean r0 = r12.writingSample
            if (r0 == 0) goto L27
            long r0 = r12.sampleTimeUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L25
            com.google.android.exoplayer2.extractor.TrackOutput[] r0 = r12.outputs
            int r1 = r0.length
            r2 = 0
        L14:
            if (r2 >= r1) goto L25
            r5 = r0[r2]
            long r6 = r12.sampleTimeUs
            r8 = 1
            int r9 = r12.sampleBytesWritten
            r10 = 0
            r11 = 0
            r5.sampleMetadata(r6, r8, r9, r10, r11)
            int r2 = r2 + 1
            goto L14
        L25:
            r12.writingSample = r4
        L27:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long r3, int r5) {
            r2 = this;
            r5 = r5 & 4
            if (r5 != 0) goto L5
            return
        L5:
            r5 = 1
            r2.writingSample = r5
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L13
            r2.sampleTimeUs = r3
        L13:
            r3 = 0
            r2.sampleBytesWritten = r3
            r3 = 2
            r2.bytesToCheck = r3
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
            r2 = this;
            r0 = 0
            r2.writingSample = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.sampleTimeUs = r0
            return
    }
}
