package com.google.android.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes2.dex */
public class OggExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory FACTORY = null;
    private static final int MAX_VERIFICATION_BYTES = 8;
    private com.google.android.exoplayer2.extractor.ExtractorOutput output;
    private com.google.android.exoplayer2.extractor.ogg.StreamReader streamReader;
    private boolean streamReaderInitialized;

    public static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] $r8$lambda$x5S9ZuvYeTCYHzRIpLS7txVhG14() {
            com.google.android.exoplayer2.extractor.Extractor[] r0 = lambda$static$0()
            return r0
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$8
            com.google.android.exoplayer2.extractor.ogg.OggExtractor.FACTORY = r0
            return
    }

    public OggExtractor() {
            r0 = this;
            r0.<init>()
            return
    }

    private static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
            r0 = 1
            com.google.android.exoplayer2.extractor.Extractor[] r0 = new com.google.android.exoplayer2.extractor.Extractor[r0]
            com.google.android.exoplayer2.extractor.ogg.OggExtractor r1 = new com.google.android.exoplayer2.extractor.ogg.OggExtractor
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            return r0
    }

    private static com.google.android.exoplayer2.util.ParsableByteArray resetPosition(com.google.android.exoplayer2.util.ParsableByteArray r1) {
            r0 = 0
            r1.setPosition(r0)
            return r1
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private boolean sniffInternal(com.google.android.exoplayer2.extractor.ExtractorInput r6) throws java.io.IOException {
            r5 = this;
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = new com.google.android.exoplayer2.extractor.ogg.OggPageHeader
            r0.<init>()
            r1 = 1
            boolean r2 = r0.populate(r6, r1)
            r3 = 0
            if (r2 == 0) goto L5e
            int r2 = r0.type
            r4 = 2
            r2 = r2 & r4
            if (r2 == r4) goto L14
            goto L5e
        L14:
            int r0 = r0.bodySize
            r2 = 8
            int r0 = java.lang.Math.min(r0, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r2 = new com.google.android.exoplayer2.util.ParsableByteArray
            r2.<init>(r0)
            byte[] r4 = r2.getData()
            r6.peekFully(r4, r3, r0)
            com.google.android.exoplayer2.util.ParsableByteArray r6 = resetPosition(r2)
            boolean r6 = com.google.android.exoplayer2.extractor.ogg.FlacReader.verifyBitstreamType(r6)
            if (r6 == 0) goto L3a
            com.google.android.exoplayer2.extractor.ogg.FlacReader r6 = new com.google.android.exoplayer2.extractor.ogg.FlacReader
            r6.<init>()
            r5.streamReader = r6
            goto L5d
        L3a:
            com.google.android.exoplayer2.util.ParsableByteArray r6 = resetPosition(r2)
            boolean r6 = com.google.android.exoplayer2.extractor.ogg.VorbisReader.verifyBitstreamType(r6)
            if (r6 == 0) goto L4c
            com.google.android.exoplayer2.extractor.ogg.VorbisReader r6 = new com.google.android.exoplayer2.extractor.ogg.VorbisReader
            r6.<init>()
            r5.streamReader = r6
            goto L5d
        L4c:
            com.google.android.exoplayer2.util.ParsableByteArray r6 = resetPosition(r2)
            boolean r6 = com.google.android.exoplayer2.extractor.ogg.OpusReader.verifyBitstreamType(r6)
            if (r6 == 0) goto L5e
            com.google.android.exoplayer2.extractor.ogg.OpusReader r6 = new com.google.android.exoplayer2.extractor.ogg.OpusReader
            r6.<init>()
            r5.streamReader = r6
        L5d:
            return r1
        L5e:
            return r3
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r1) {
            r0 = this;
            r0.output = r1
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r5, com.google.android.exoplayer2.extractor.PositionHolder r6) throws java.io.IOException {
            r4 = this;
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r4.output
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.extractor.ogg.StreamReader r0 = r4.streamReader
            if (r0 != 0) goto L1b
            boolean r0 = r4.sniffInternal(r5)
            if (r0 == 0) goto L13
            r5.resetPeekPosition()
            goto L1b
        L13:
            r5 = 0
            java.lang.String r6 = "Failed to determine bitstream type"
            com.google.android.exoplayer2.ParserException r5 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r6, r5)
            throw r5
        L1b:
            boolean r0 = r4.streamReaderInitialized
            if (r0 != 0) goto L35
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r4.output
            r1 = 0
            r2 = 1
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r0.track(r1, r2)
            com.google.android.exoplayer2.extractor.ExtractorOutput r1 = r4.output
            r1.endTracks()
            com.google.android.exoplayer2.extractor.ogg.StreamReader r1 = r4.streamReader
            com.google.android.exoplayer2.extractor.ExtractorOutput r3 = r4.output
            r1.init(r3, r0)
            r4.streamReaderInitialized = r2
        L35:
            com.google.android.exoplayer2.extractor.ogg.StreamReader r0 = r4.streamReader
            int r5 = r0.read(r5, r6)
            return r5
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long r2, long r4) {
            r1 = this;
            com.google.android.exoplayer2.extractor.ogg.StreamReader r0 = r1.streamReader
            if (r0 == 0) goto L7
            r0.seek(r2, r4)
        L7:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r1) throws java.io.IOException {
            r0 = this;
            boolean r1 = r0.sniffInternal(r1)     // Catch: com.google.android.exoplayer2.ParserException -> L5
            return r1
        L5:
            r1 = 0
            return r1
    }
}
