package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class Ac4Extractor implements com.google.android.exoplayer2.extractor.Extractor {
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory FACTORY = null;
    private static final int FRAME_HEADER_SIZE = 7;
    private static final int MAX_SNIFF_BYTES = 8192;
    private static final int READ_BUFFER_SIZE = 16384;
    private final com.google.android.exoplayer2.extractor.ts.Ac4Reader reader;
    private final com.google.android.exoplayer2.util.ParsableByteArray sampleData;
    private boolean startedPacket;

    public static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] $r8$lambda$uz_mSztEhxs65jST1AMfg85CXco() {
            com.google.android.exoplayer2.extractor.Extractor[] r0 = lambda$static$0()
            return r0
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$10
            com.google.android.exoplayer2.extractor.ts.Ac4Extractor.FACTORY = r0
            return
    }

    public Ac4Extractor() {
            r2 = this;
            r2.<init>()
            com.google.android.exoplayer2.extractor.ts.Ac4Reader r0 = new com.google.android.exoplayer2.extractor.ts.Ac4Reader
            r0.<init>()
            r2.reader = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r1)
            r2.sampleData = r0
            return
    }

    private static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
            r0 = 1
            com.google.android.exoplayer2.extractor.Extractor[] r0 = new com.google.android.exoplayer2.extractor.Extractor[r0]
            com.google.android.exoplayer2.extractor.ts.Ac4Extractor r1 = new com.google.android.exoplayer2.extractor.ts.Ac4Extractor
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r5) {
            r4 = this;
            com.google.android.exoplayer2.extractor.ts.Ac4Reader r0 = r4.reader
            com.google.android.exoplayer2.extractor.ts.TsPayloadReader$TrackIdGenerator r1 = new com.google.android.exoplayer2.extractor.ts.TsPayloadReader$TrackIdGenerator
            r2 = 0
            r3 = 1
            r1.<init>(r2, r3)
            r0.createTracks(r5, r1)
            r5.endTracks()
            com.google.android.exoplayer2.extractor.SeekMap$Unseekable r0 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.<init>(r1)
            r5.seekMap(r0)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r4, com.google.android.exoplayer2.extractor.PositionHolder r5) throws java.io.IOException {
            r3 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r3.sampleData
            byte[] r5 = r5.getData()
            r0 = 0
            r1 = 16384(0x4000, float:2.2959E-41)
            int r4 = r4.read(r5, r0, r1)
            r5 = -1
            if (r4 != r5) goto L11
            return r5
        L11:
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r3.sampleData
            r5.setPosition(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r3.sampleData
            r5.setLimit(r4)
            boolean r4 = r3.startedPacket
            if (r4 != 0) goto L2a
            com.google.android.exoplayer2.extractor.ts.Ac4Reader r4 = r3.reader
            r1 = 0
            r5 = 4
            r4.packetStarted(r1, r5)
            r4 = 1
            r3.startedPacket = r4
        L2a:
            com.google.android.exoplayer2.extractor.ts.Ac4Reader r4 = r3.reader
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r3.sampleData
            r4.consume(r5)
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long r1, long r3) {
            r0 = this;
            r1 = 0
            r0.startedPacket = r1
            com.google.android.exoplayer2.extractor.ts.Ac4Reader r1 = r0.reader
            r1.seek()
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r9) throws java.io.IOException {
            r8 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.getData()
            r9.peekFully(r4, r2, r1)
            r0.setPosition(r2)
            int r4 = r0.readUnsignedInt24()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L65
            r9.resetPeekPosition()
            r9.advancePeekPosition(r3)
            r4 = r3
        L23:
            r1 = 0
        L24:
            byte[] r5 = r0.getData()
            r6 = 7
            r9.peekFully(r5, r2, r6)
            r0.setPosition(r2)
            int r5 = r0.readUnsignedShort()
            r6 = 44096(0xac40, float:6.1792E-41)
            if (r5 == r6) goto L4d
            r6 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r6) goto L4d
            r9.resetPeekPosition()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L49
            return r2
        L49:
            r9.advancePeekPosition(r4)
            goto L23
        L4d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L53
            return r6
        L53:
            byte[] r6 = r0.getData()
            int r5 = com.google.android.exoplayer2.audio.Ac4Util.parseAc4SyncframeSize(r6, r5)
            r6 = -1
            if (r5 != r6) goto L5f
            return r2
        L5f:
            int r5 = r5 + (-7)
            r9.advancePeekPosition(r5)
            goto L24
        L65:
            r4 = 3
            r0.skipBytes(r4)
            int r4 = r0.readSynchSafeInt()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r9.advancePeekPosition(r4)
            goto L9
    }
}
