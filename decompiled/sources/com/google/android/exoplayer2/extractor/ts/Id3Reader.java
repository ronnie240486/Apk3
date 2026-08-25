package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes2.dex */
public final class Id3Reader implements com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader {
    private static final java.lang.String TAG = "Id3Reader";
    private final com.google.android.exoplayer2.util.ParsableByteArray id3Header;
    private com.google.android.exoplayer2.extractor.TrackOutput output;
    private int sampleBytesRead;
    private int sampleSize;
    private long sampleTimeUs;
    private boolean writingSample;

    public Id3Reader() {
            r2 = this;
            r2.<init>()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 10
            r0.<init>(r1)
            r2.id3Header = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.sampleTimeUs = r0
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(com.google.android.exoplayer2.util.ParsableByteArray r8) {
            r7 = this;
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r7.output
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            boolean r0 = r7.writingSample
            if (r0 != 0) goto La
            return
        La:
            int r0 = r8.bytesLeft()
            int r1 = r7.sampleBytesRead
            r2 = 10
            if (r1 >= r2) goto L71
            int r1 = 10 - r1
            int r1 = java.lang.Math.min(r0, r1)
            byte[] r3 = r8.getData()
            int r4 = r8.getPosition()
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r7.id3Header
            byte[] r5 = r5.getData()
            int r6 = r7.sampleBytesRead
            java.lang.System.arraycopy(r3, r4, r5, r6, r1)
            int r3 = r7.sampleBytesRead
            int r3 = r3 + r1
            if (r3 != r2) goto L71
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r7.id3Header
            r3 = 0
            r1.setPosition(r3)
            r1 = 73
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r7.id3Header
            int r4 = r4.readUnsignedByte()
            if (r1 != r4) goto L67
            r1 = 68
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r7.id3Header
            int r4 = r4.readUnsignedByte()
            if (r1 != r4) goto L67
            r1 = 51
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r7.id3Header
            int r4 = r4.readUnsignedByte()
            if (r1 == r4) goto L57
            goto L67
        L57:
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r7.id3Header
            r3 = 3
            r1.skipBytes(r3)
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r7.id3Header
            int r1 = r1.readSynchSafeInt()
            int r1 = r1 + r2
            r7.sampleSize = r1
            goto L71
        L67:
            java.lang.String r8 = "Id3Reader"
            java.lang.String r0 = "Discarding invalid ID3 tag"
            com.google.android.exoplayer2.util.Log.w(r8, r0)
            r7.writingSample = r3
            return
        L71:
            int r1 = r7.sampleSize
            int r2 = r7.sampleBytesRead
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r7.output
            r1.sampleData(r8, r0)
            int r8 = r7.sampleBytesRead
            int r8 = r8 + r0
            r7.sampleBytesRead = r8
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(com.google.android.exoplayer2.extractor.ExtractorOutput r3, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator r4) {
            r2 = this;
            r4.generateNewId()
            int r0 = r4.getTrackId()
            r1 = 5
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r3.track(r0, r1)
            r2.output = r3
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            java.lang.String r4 = r4.getFormatId()
            com.google.android.exoplayer2.Format$Builder r4 = r0.setId(r4)
            java.lang.String r0 = "application/id3"
            com.google.android.exoplayer2.Format$Builder r4 = r4.setSampleMimeType(r0)
            com.google.android.exoplayer2.Format r4 = r4.build()
            r3.format(r4)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
            r8 = this;
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r8.output
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            boolean r0 = r8.writingSample
            if (r0 == 0) goto L28
            int r5 = r8.sampleSize
            if (r5 == 0) goto L28
            int r0 = r8.sampleBytesRead
            if (r0 == r5) goto L12
            goto L28
        L12:
            long r2 = r8.sampleTimeUs
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L25
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r8.output
            r4 = 1
            r6 = 0
            r7 = 0
            r1.sampleMetadata(r2, r4, r5, r6, r7)
        L25:
            r0 = 0
            r8.writingSample = r0
        L28:
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
            r2.sampleSize = r3
            r2.sampleBytesRead = r3
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
