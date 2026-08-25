package com.google.android.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes.dex */
abstract class StreamReader {
    private static final int STATE_END_OF_INPUT = 3;
    private static final int STATE_READ_HEADERS = 0;
    private static final int STATE_READ_PAYLOAD = 2;
    private static final int STATE_SKIP_HEADERS = 1;
    private long currentGranule;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private boolean formatSet;
    private long lengthOfReadPacket;
    private final com.google.android.exoplayer2.extractor.ogg.OggPacket oggPacket;
    private com.google.android.exoplayer2.extractor.ogg.OggSeeker oggSeeker;
    private long payloadStartPosition;
    private int sampleRate;
    private boolean seekMapSet;
    private com.google.android.exoplayer2.extractor.ogg.StreamReader.SetupData setupData;
    private int state;
    private long targetGranule;
    private com.google.android.exoplayer2.extractor.TrackOutput trackOutput;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ogg.StreamReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class SetupData {
        public com.google.android.exoplayer2.Format format;
        public com.google.android.exoplayer2.extractor.ogg.FlacReader.FlacOggSeeker oggSeeker;

        public SetupData() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class UnseekableOggSeeker implements com.google.android.exoplayer2.extractor.ogg.OggSeeker {
        private UnseekableOggSeeker() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ UnseekableOggSeeker(com.google.android.exoplayer2.extractor.ogg.StreamReader.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public com.google.android.exoplayer2.extractor.SeekMap createSeekMap() {
                r3 = this;
                com.google.android.exoplayer2.extractor.SeekMap$Unseekable r0 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
                r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public long read(com.google.android.exoplayer2.extractor.ExtractorInput r3) {
                r2 = this;
                r0 = -1
                return r0
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public void startSeek(long r1) {
                r0 = this;
                return
        }
    }

    public StreamReader() {
            r1 = this;
            r1.<init>()
            com.google.android.exoplayer2.extractor.ogg.OggPacket r0 = new com.google.android.exoplayer2.extractor.ogg.OggPacket
            r0.<init>()
            r1.oggPacket = r0
            com.google.android.exoplayer2.extractor.ogg.StreamReader$SetupData r0 = new com.google.android.exoplayer2.extractor.ogg.StreamReader$SetupData
            r0.<init>()
            r1.setupData = r0
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackOutput", "extractorOutput"})
    private void assertInitialized() {
            r1 = this;
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r1.trackOutput
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r1.extractorOutput
            com.google.android.exoplayer2.util.Util.castNonNull(r0)
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    private boolean readHeaders(com.google.android.exoplayer2.extractor.ExtractorInput r5) throws java.io.IOException {
            r4 = this;
        L0:
            com.google.android.exoplayer2.extractor.ogg.OggPacket r0 = r4.oggPacket
            boolean r0 = r0.populate(r5)
            if (r0 != 0) goto Ld
            r5 = 3
            r4.state = r5
            r5 = 0
            return r5
        Ld:
            long r0 = r5.getPosition()
            long r2 = r4.payloadStartPosition
            long r0 = r0 - r2
            r4.lengthOfReadPacket = r0
            com.google.android.exoplayer2.extractor.ogg.OggPacket r0 = r4.oggPacket
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r0.getPayload()
            long r1 = r4.payloadStartPosition
            com.google.android.exoplayer2.extractor.ogg.StreamReader$SetupData r3 = r4.setupData
            boolean r0 = r4.readHeaders(r0, r1, r3)
            if (r0 == 0) goto L2d
            long r0 = r5.getPosition()
            r4.payloadStartPosition = r0
            goto L0
        L2d:
            r5 = 1
            return r5
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput"})
    private int readHeadersAndUpdateState(com.google.android.exoplayer2.extractor.ExtractorInput r14) throws java.io.IOException {
            r13 = this;
            boolean r0 = r13.readHeaders(r14)
            if (r0 != 0) goto L8
            r0 = -1
            return r0
        L8:
            com.google.android.exoplayer2.extractor.ogg.StreamReader$SetupData r0 = r13.setupData
            com.google.android.exoplayer2.Format r0 = r0.format
            int r1 = r0.sampleRate
            r13.sampleRate = r1
            boolean r1 = r13.formatSet
            r2 = 1
            if (r1 != 0) goto L1c
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r13.trackOutput
            r1.format(r0)
            r13.formatSet = r2
        L1c:
            com.google.android.exoplayer2.extractor.ogg.StreamReader$SetupData r0 = r13.setupData
            com.google.android.exoplayer2.extractor.ogg.FlacReader$FlacOggSeeker r0 = r0.oggSeeker
            r11 = 0
            if (r0 == 0) goto L26
            r13.oggSeeker = r0
            goto L5f
        L26:
            long r0 = r14.getLength()
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L39
            com.google.android.exoplayer2.extractor.ogg.StreamReader$UnseekableOggSeeker r0 = new com.google.android.exoplayer2.extractor.ogg.StreamReader$UnseekableOggSeeker
            r1 = 0
            r0.<init>(r1)
            r13.oggSeeker = r0
            goto L5f
        L39:
            com.google.android.exoplayer2.extractor.ogg.OggPacket r0 = r13.oggPacket
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = r0.getPageHeader()
            int r1 = r0.type
            r1 = r1 & 4
            if (r1 == 0) goto L47
            r10 = 1
            goto L48
        L47:
            r10 = 0
        L48:
            com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker r12 = new com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker
            long r2 = r13.payloadStartPosition
            long r4 = r14.getLength()
            int r1 = r0.headerSize
            int r6 = r0.bodySize
            int r1 = r1 + r6
            long r6 = (long) r1
            long r8 = r0.granulePosition
            r0 = r12
            r1 = r13
            r0.<init>(r1, r2, r4, r6, r8, r10)
            r13.oggSeeker = r12
        L5f:
            r0 = 2
            r13.state = r0
            com.google.android.exoplayer2.extractor.ogg.OggPacket r0 = r13.oggPacket
            r0.trimPayload()
            return r11
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    private int readPayload(com.google.android.exoplayer2.extractor.ExtractorInput r19, com.google.android.exoplayer2.extractor.PositionHolder r20) throws java.io.IOException {
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.android.exoplayer2.extractor.ogg.OggSeeker r2 = r0.oggSeeker
            long r2 = r2.read(r1)
            r4 = 1
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L16
            r7 = r20
            r7.position = r2
            return r4
        L16:
            r7 = -1
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 >= 0) goto L23
            r9 = 2
            long r2 = r2 + r9
            long r2 = -r2
            r0.onSeekEnd(r2)
        L23:
            boolean r2 = r0.seekMapSet
            if (r2 != 0) goto L3a
            com.google.android.exoplayer2.extractor.ogg.OggSeeker r2 = r0.oggSeeker
            com.google.android.exoplayer2.extractor.SeekMap r2 = r2.createSeekMap()
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r2)
            com.google.android.exoplayer2.extractor.SeekMap r2 = (com.google.android.exoplayer2.extractor.SeekMap) r2
            com.google.android.exoplayer2.extractor.ExtractorOutput r3 = r0.extractorOutput
            r3.seekMap(r2)
            r0.seekMapSet = r4
        L3a:
            long r2 = r0.lengthOfReadPacket
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 > 0) goto L4e
            com.google.android.exoplayer2.extractor.ogg.OggPacket r2 = r0.oggPacket
            boolean r1 = r2.populate(r1)
            if (r1 == 0) goto L49
            goto L4e
        L49:
            r1 = 3
            r0.state = r1
            r1 = -1
            return r1
        L4e:
            r0.lengthOfReadPacket = r5
            com.google.android.exoplayer2.extractor.ogg.OggPacket r1 = r0.oggPacket
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r1.getPayload()
            long r2 = r0.preparePayload(r1)
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 < 0) goto L8b
            long r4 = r0.currentGranule
            long r9 = r4 + r2
            long r11 = r0.targetGranule
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 < 0) goto L8b
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r9
            int r6 = r0.sampleRate
            long r9 = (long) r6
            long r12 = r4 / r9
            com.google.android.exoplayer2.extractor.TrackOutput r4 = r0.trackOutput
            int r5 = r1.limit()
            r4.sampleData(r1, r5)
            com.google.android.exoplayer2.extractor.TrackOutput r11 = r0.trackOutput
            r14 = 1
            int r15 = r1.limit()
            r16 = 0
            r17 = 0
            r11.sampleMetadata(r12, r14, r15, r16, r17)
            r0.targetGranule = r7
        L8b:
            long r4 = r0.currentGranule
            long r4 = r4 + r2
            r0.currentGranule = r4
            r1 = 0
            return r1
    }

    public final long convertGranuleToTime(long r3) {
            r2 = this;
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r0
            int r0 = r2.sampleRate
            long r0 = (long) r0
            long r3 = r3 / r0
            return r3
    }

    public final long convertTimeToGranule(long r3) {
            r2 = this;
            int r0 = r2.sampleRate
            long r0 = (long) r0
            long r0 = r0 * r3
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r3
            return r0
    }

    public final void init(com.google.android.exoplayer2.extractor.ExtractorOutput r1, com.google.android.exoplayer2.extractor.TrackOutput r2) {
            r0 = this;
            r0.extractorOutput = r1
            r0.trackOutput = r2
            r1 = 1
            r0.reset(r1)
            return
    }

    public void onSeekEnd(long r1) {
            r0 = this;
            r0.currentGranule = r1
            return
    }

    public abstract long preparePayload(com.google.android.exoplayer2.util.ParsableByteArray r1);

    public final int read(com.google.android.exoplayer2.extractor.ExtractorInput r4, com.google.android.exoplayer2.extractor.PositionHolder r5) throws java.io.IOException {
            r3 = this;
            r3.assertInitialized()
            int r0 = r3.state
            if (r0 == 0) goto L2c
            r1 = 1
            r2 = 2
            if (r0 == r1) goto L22
            if (r0 == r2) goto L18
            r4 = 3
            if (r0 != r4) goto L12
            r4 = -1
            return r4
        L12:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
        L18:
            com.google.android.exoplayer2.extractor.ogg.OggSeeker r0 = r3.oggSeeker
            com.google.android.exoplayer2.util.Util.castNonNull(r0)
            int r4 = r3.readPayload(r4, r5)
            return r4
        L22:
            long r0 = r3.payloadStartPosition
            int r5 = (int) r0
            r4.skipFully(r5)
            r3.state = r2
            r4 = 0
            return r4
        L2c:
            int r4 = r3.readHeadersAndUpdateState(r4)
            return r4
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean readHeaders(com.google.android.exoplayer2.util.ParsableByteArray r1, long r2, com.google.android.exoplayer2.extractor.ogg.StreamReader.SetupData r4) throws java.io.IOException;

    public void reset(boolean r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L11
            com.google.android.exoplayer2.extractor.ogg.StreamReader$SetupData r5 = new com.google.android.exoplayer2.extractor.ogg.StreamReader$SetupData
            r5.<init>()
            r4.setupData = r5
            r4.payloadStartPosition = r0
            r5 = 0
            r4.state = r5
            goto L14
        L11:
            r5 = 1
            r4.state = r5
        L14:
            r2 = -1
            r4.targetGranule = r2
            r4.currentGranule = r0
            return
    }

    public final void seek(long r4, long r6) {
            r3 = this;
            com.google.android.exoplayer2.extractor.ogg.OggPacket r0 = r3.oggPacket
            r0.reset()
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            boolean r4 = r3.seekMapSet
            r4 = r4 ^ 1
            r3.reset(r4)
            goto L2d
        L13:
            int r4 = r3.state
            if (r4 == 0) goto L2d
            long r4 = r3.convertTimeToGranule(r6)
            r3.targetGranule = r4
            com.google.android.exoplayer2.extractor.ogg.OggSeeker r4 = r3.oggSeeker
            java.lang.Object r4 = com.google.android.exoplayer2.util.Util.castNonNull(r4)
            com.google.android.exoplayer2.extractor.ogg.OggSeeker r4 = (com.google.android.exoplayer2.extractor.ogg.OggSeeker) r4
            long r5 = r3.targetGranule
            r4.startSeek(r5)
            r4 = 2
            r3.state = r4
        L2d:
            return
    }
}
