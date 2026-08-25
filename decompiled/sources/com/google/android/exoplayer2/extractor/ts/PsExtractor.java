package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes2.dex */
public final class PsExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    public static final int AUDIO_STREAM = 192;
    public static final int AUDIO_STREAM_MASK = 224;
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory FACTORY = null;
    private static final long MAX_SEARCH_LENGTH = 1048576;
    private static final long MAX_SEARCH_LENGTH_AFTER_AUDIO_AND_VIDEO_FOUND = 8192;
    private static final int MAX_STREAM_ID_PLUS_ONE = 256;
    public static final int PRIVATE_STREAM_1 = 189;
    public static final int VIDEO_STREAM = 224;
    public static final int VIDEO_STREAM_MASK = 240;
    private final com.google.android.exoplayer2.extractor.ts.PsDurationReader durationReader;
    private boolean foundAllTracks;
    private boolean foundAudioTrack;
    private boolean foundVideoTrack;
    private boolean hasOutputSeekMap;
    private long lastTrackPosition;
    private com.google.android.exoplayer2.extractor.ExtractorOutput output;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.ts.PsBinarySearchSeeker psBinarySearchSeeker;
    private final com.google.android.exoplayer2.util.ParsableByteArray psPacketBuffer;
    private final android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.PsExtractor.PesReader> psPayloadReaders;
    private final com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class PesReader {
        private static final int PES_SCRATCH_SIZE = 64;
        private boolean dtsFlag;
        private int extendedHeaderLength;
        private final com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader pesPayloadReader;
        private final com.google.android.exoplayer2.util.ParsableBitArray pesScratch;
        private boolean ptsFlag;
        private boolean seenFirstDts;
        private long timeUs;
        private final com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster;

        public PesReader(com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader r1, com.google.android.exoplayer2.util.TimestampAdjuster r2) {
                r0 = this;
                r0.<init>()
                r0.pesPayloadReader = r1
                r0.timestampAdjuster = r2
                com.google.android.exoplayer2.util.ParsableBitArray r1 = new com.google.android.exoplayer2.util.ParsableBitArray
                r2 = 64
                byte[] r2 = new byte[r2]
                r1.<init>(r2)
                r0.pesScratch = r1
                return
        }

        private void parseHeader() {
                r3 = this;
                com.google.android.exoplayer2.util.ParsableBitArray r0 = r3.pesScratch
                r1 = 8
                r0.skipBits(r1)
                com.google.android.exoplayer2.util.ParsableBitArray r0 = r3.pesScratch
                boolean r0 = r0.readBit()
                r3.ptsFlag = r0
                com.google.android.exoplayer2.util.ParsableBitArray r0 = r3.pesScratch
                boolean r0 = r0.readBit()
                r3.dtsFlag = r0
                com.google.android.exoplayer2.util.ParsableBitArray r0 = r3.pesScratch
                r2 = 6
                r0.skipBits(r2)
                com.google.android.exoplayer2.util.ParsableBitArray r0 = r3.pesScratch
                int r0 = r0.readBits(r1)
                r3.extendedHeaderLength = r0
                return
        }

        private void parseHeaderExtension() {
                r10 = this;
                r0 = 0
                r10.timeUs = r0
                boolean r0 = r10.ptsFlag
                if (r0 == 0) goto L81
                com.google.android.exoplayer2.util.ParsableBitArray r0 = r10.pesScratch
                r1 = 4
                r0.skipBits(r1)
                com.google.android.exoplayer2.util.ParsableBitArray r0 = r10.pesScratch
                r2 = 3
                int r0 = r0.readBits(r2)
                long r3 = (long) r0
                r0 = 30
                long r3 = r3 << r0
                com.google.android.exoplayer2.util.ParsableBitArray r5 = r10.pesScratch
                r6 = 1
                r5.skipBits(r6)
                com.google.android.exoplayer2.util.ParsableBitArray r5 = r10.pesScratch
                r7 = 15
                int r5 = r5.readBits(r7)
                int r5 = r5 << r7
                long r8 = (long) r5
                long r3 = r3 | r8
                com.google.android.exoplayer2.util.ParsableBitArray r5 = r10.pesScratch
                r5.skipBits(r6)
                com.google.android.exoplayer2.util.ParsableBitArray r5 = r10.pesScratch
                int r5 = r5.readBits(r7)
                long r8 = (long) r5
                long r3 = r3 | r8
                com.google.android.exoplayer2.util.ParsableBitArray r5 = r10.pesScratch
                r5.skipBits(r6)
                boolean r5 = r10.seenFirstDts
                if (r5 != 0) goto L79
                boolean r5 = r10.dtsFlag
                if (r5 == 0) goto L79
                com.google.android.exoplayer2.util.ParsableBitArray r5 = r10.pesScratch
                r5.skipBits(r1)
                com.google.android.exoplayer2.util.ParsableBitArray r1 = r10.pesScratch
                int r1 = r1.readBits(r2)
                long r1 = (long) r1
                long r0 = r1 << r0
                com.google.android.exoplayer2.util.ParsableBitArray r2 = r10.pesScratch
                r2.skipBits(r6)
                com.google.android.exoplayer2.util.ParsableBitArray r2 = r10.pesScratch
                int r2 = r2.readBits(r7)
                int r2 = r2 << r7
                long r8 = (long) r2
                long r0 = r0 | r8
                com.google.android.exoplayer2.util.ParsableBitArray r2 = r10.pesScratch
                r2.skipBits(r6)
                com.google.android.exoplayer2.util.ParsableBitArray r2 = r10.pesScratch
                int r2 = r2.readBits(r7)
                long r7 = (long) r2
                long r0 = r0 | r7
                com.google.android.exoplayer2.util.ParsableBitArray r2 = r10.pesScratch
                r2.skipBits(r6)
                com.google.android.exoplayer2.util.TimestampAdjuster r2 = r10.timestampAdjuster
                r2.adjustTsTimestamp(r0)
                r10.seenFirstDts = r6
            L79:
                com.google.android.exoplayer2.util.TimestampAdjuster r0 = r10.timestampAdjuster
                long r0 = r0.adjustTsTimestamp(r3)
                r10.timeUs = r0
            L81:
                return
        }

        public void consume(com.google.android.exoplayer2.util.ParsableByteArray r5) throws com.google.android.exoplayer2.ParserException {
                r4 = this;
                com.google.android.exoplayer2.util.ParsableBitArray r0 = r4.pesScratch
                byte[] r0 = r0.data
                r1 = 0
                r2 = 3
                r5.readBytes(r0, r1, r2)
                com.google.android.exoplayer2.util.ParsableBitArray r0 = r4.pesScratch
                r0.setPosition(r1)
                r4.parseHeader()
                com.google.android.exoplayer2.util.ParsableBitArray r0 = r4.pesScratch
                byte[] r0 = r0.data
                int r2 = r4.extendedHeaderLength
                r5.readBytes(r0, r1, r2)
                com.google.android.exoplayer2.util.ParsableBitArray r0 = r4.pesScratch
                r0.setPosition(r1)
                r4.parseHeaderExtension()
                com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader r0 = r4.pesPayloadReader
                long r1 = r4.timeUs
                r3 = 4
                r0.packetStarted(r1, r3)
                com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader r0 = r4.pesPayloadReader
                r0.consume(r5)
                com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader r5 = r4.pesPayloadReader
                r5.packetFinished()
                return
        }

        public void seek() {
                r1 = this;
                r0 = 0
                r1.seenFirstDts = r0
                com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader r0 = r1.pesPayloadReader
                r0.seek()
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$CK4V9Qlbd3gXb-1ZE44fwxEYD2k, reason: not valid java name */
    public static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] m225$r8$lambda$CK4V9Qlbd3gXb1ZE44fwxEYD2k() {
            com.google.android.exoplayer2.extractor.Extractor[] r0 = lambda$static$0()
            return r0
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$12
            com.google.android.exoplayer2.extractor.ts.PsExtractor.FACTORY = r0
            return
    }

    public PsExtractor() {
            r3 = this;
            com.google.android.exoplayer2.util.TimestampAdjuster r0 = new com.google.android.exoplayer2.util.TimestampAdjuster
            r1 = 0
            r0.<init>(r1)
            r3.<init>(r0)
            return
    }

    public PsExtractor(com.google.android.exoplayer2.util.TimestampAdjuster r2) {
            r1 = this;
            r1.<init>()
            r1.timestampAdjuster = r2
            com.google.android.exoplayer2.util.ParsableByteArray r2 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0 = 4096(0x1000, float:5.74E-42)
            r2.<init>(r0)
            r1.psPacketBuffer = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1.psPayloadReaders = r2
            com.google.android.exoplayer2.extractor.ts.PsDurationReader r2 = new com.google.android.exoplayer2.extractor.ts.PsDurationReader
            r2.<init>()
            r1.durationReader = r2
            return
    }

    private static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
            r0 = 1
            com.google.android.exoplayer2.extractor.Extractor[] r0 = new com.google.android.exoplayer2.extractor.Extractor[r0]
            com.google.android.exoplayer2.extractor.ts.PsExtractor r1 = new com.google.android.exoplayer2.extractor.ts.PsExtractor
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            return r0
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void maybeOutputSeekMap(long r12) {
            r11 = this;
            boolean r0 = r11.hasOutputSeekMap
            if (r0 != 0) goto L45
            r0 = 1
            r11.hasOutputSeekMap = r0
            com.google.android.exoplayer2.extractor.ts.PsDurationReader r0 = r11.durationReader
            long r0 = r0.getDurationUs()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L35
            com.google.android.exoplayer2.extractor.ts.PsBinarySearchSeeker r0 = new com.google.android.exoplayer2.extractor.ts.PsBinarySearchSeeker
            com.google.android.exoplayer2.extractor.ts.PsDurationReader r1 = r11.durationReader
            com.google.android.exoplayer2.util.TimestampAdjuster r6 = r1.getScrTimestampAdjuster()
            com.google.android.exoplayer2.extractor.ts.PsDurationReader r1 = r11.durationReader
            long r7 = r1.getDurationUs()
            r5 = r0
            r9 = r12
            r5.<init>(r6, r7, r9)
            r11.psBinarySearchSeeker = r0
            com.google.android.exoplayer2.extractor.ExtractorOutput r12 = r11.output
            com.google.android.exoplayer2.extractor.SeekMap r13 = r0.getSeekMap()
            r12.seekMap(r13)
            goto L45
        L35:
            com.google.android.exoplayer2.extractor.ExtractorOutput r12 = r11.output
            com.google.android.exoplayer2.extractor.SeekMap$Unseekable r13 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
            com.google.android.exoplayer2.extractor.ts.PsDurationReader r0 = r11.durationReader
            long r0 = r0.getDurationUs()
            r13.<init>(r0)
            r12.seekMap(r13)
        L45:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r1) {
            r0 = this;
            r0.output = r1
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r11, com.google.android.exoplayer2.extractor.PositionHolder r12) throws java.io.IOException {
            r10 = this;
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r10.output
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            long r0 = r11.getLength()
            r2 = -1
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L13
            r7 = 1
            goto L14
        L13:
            r7 = 0
        L14:
            if (r7 == 0) goto L25
            com.google.android.exoplayer2.extractor.ts.PsDurationReader r7 = r10.durationReader
            boolean r7 = r7.isDurationReadFinished()
            if (r7 != 0) goto L25
            com.google.android.exoplayer2.extractor.ts.PsDurationReader r0 = r10.durationReader
            int r11 = r0.readDuration(r11, r12)
            return r11
        L25:
            r10.maybeOutputSeekMap(r0)
            com.google.android.exoplayer2.extractor.ts.PsBinarySearchSeeker r7 = r10.psBinarySearchSeeker
            if (r7 == 0) goto L39
            boolean r7 = r7.isSeeking()
            if (r7 == 0) goto L39
            com.google.android.exoplayer2.extractor.ts.PsBinarySearchSeeker r0 = r10.psBinarySearchSeeker
            int r11 = r0.handlePendingSeek(r11, r12)
            return r11
        L39:
            r11.resetPeekPosition()
            if (r6 == 0) goto L44
            long r6 = r11.getPeekPosition()
            long r0 = r0 - r6
            goto L45
        L44:
            r0 = r2
        L45:
            r12 = -1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L51
            r2 = 4
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L51
            return r12
        L51:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r10.psPacketBuffer
            byte[] r0 = r0.getData()
            r1 = 4
            boolean r0 = r11.peekFully(r0, r5, r1, r4)
            if (r0 != 0) goto L5f
            return r12
        L5f:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r10.psPacketBuffer
            r0.setPosition(r5)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r10.psPacketBuffer
            int r0 = r0.readInt()
            r1 = 441(0x1b9, float:6.18E-43)
            if (r0 != r1) goto L6f
            return r12
        L6f:
            r12 = 442(0x1ba, float:6.2E-43)
            if (r0 != r12) goto L93
            com.google.android.exoplayer2.util.ParsableByteArray r12 = r10.psPacketBuffer
            byte[] r12 = r12.getData()
            r0 = 10
            r11.peekFully(r12, r5, r0)
            com.google.android.exoplayer2.util.ParsableByteArray r12 = r10.psPacketBuffer
            r0 = 9
            r12.setPosition(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r12 = r10.psPacketBuffer
            int r12 = r12.readUnsignedByte()
            r12 = r12 & 7
            int r12 = r12 + 14
            r11.skipFully(r12)
            return r5
        L93:
            r12 = 443(0x1bb, float:6.21E-43)
            r1 = 2
            r2 = 6
            if (r0 != r12) goto Lb2
            com.google.android.exoplayer2.util.ParsableByteArray r12 = r10.psPacketBuffer
            byte[] r12 = r12.getData()
            r11.peekFully(r12, r5, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r12 = r10.psPacketBuffer
            r12.setPosition(r5)
            com.google.android.exoplayer2.util.ParsableByteArray r12 = r10.psPacketBuffer
            int r12 = r12.readUnsignedShort()
            int r12 = r12 + r2
            r11.skipFully(r12)
            return r5
        Lb2:
            r12 = r0 & (-256(0xffffffffffffff00, float:NaN))
            int r12 = r12 >> 8
            if (r12 == r4) goto Lbc
            r11.skipFully(r4)
            return r5
        Lbc:
            r12 = r0 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.PsExtractor$PesReader> r0 = r10.psPayloadReaders
            java.lang.Object r0 = r0.get(r12)
            com.google.android.exoplayer2.extractor.ts.PsExtractor$PesReader r0 = (com.google.android.exoplayer2.extractor.ts.PsExtractor.PesReader) r0
            boolean r3 = r10.foundAllTracks
            if (r3 != 0) goto L140
            if (r0 != 0) goto L120
            r3 = 0
            r6 = 189(0xbd, float:2.65E-43)
            if (r12 != r6) goto Ldf
            com.google.android.exoplayer2.extractor.ts.Ac3Reader r3 = new com.google.android.exoplayer2.extractor.ts.Ac3Reader
            r3.<init>()
            r10.foundAudioTrack = r4
            long r6 = r11.getPosition()
            r10.lastTrackPosition = r6
            goto L106
        Ldf:
            r6 = r12 & 224(0xe0, float:3.14E-43)
            r7 = 192(0xc0, float:2.69E-43)
            if (r6 != r7) goto Lf3
            com.google.android.exoplayer2.extractor.ts.MpegAudioReader r3 = new com.google.android.exoplayer2.extractor.ts.MpegAudioReader
            r3.<init>()
            r10.foundAudioTrack = r4
            long r6 = r11.getPosition()
            r10.lastTrackPosition = r6
            goto L106
        Lf3:
            r6 = r12 & 240(0xf0, float:3.36E-43)
            r7 = 224(0xe0, float:3.14E-43)
            if (r6 != r7) goto L106
            com.google.android.exoplayer2.extractor.ts.H262Reader r3 = new com.google.android.exoplayer2.extractor.ts.H262Reader
            r3.<init>()
            r10.foundVideoTrack = r4
            long r6 = r11.getPosition()
            r10.lastTrackPosition = r6
        L106:
            if (r3 == 0) goto L120
            com.google.android.exoplayer2.extractor.ts.TsPayloadReader$TrackIdGenerator r0 = new com.google.android.exoplayer2.extractor.ts.TsPayloadReader$TrackIdGenerator
            r6 = 256(0x100, float:3.59E-43)
            r0.<init>(r12, r6)
            com.google.android.exoplayer2.extractor.ExtractorOutput r6 = r10.output
            r3.createTracks(r6, r0)
            com.google.android.exoplayer2.extractor.ts.PsExtractor$PesReader r0 = new com.google.android.exoplayer2.extractor.ts.PsExtractor$PesReader
            com.google.android.exoplayer2.util.TimestampAdjuster r6 = r10.timestampAdjuster
            r0.<init>(r3, r6)
            android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.PsExtractor$PesReader> r3 = r10.psPayloadReaders
            r3.put(r12, r0)
        L120:
            boolean r12 = r10.foundAudioTrack
            if (r12 == 0) goto L12e
            boolean r12 = r10.foundVideoTrack
            if (r12 == 0) goto L12e
            long r6 = r10.lastTrackPosition
            r8 = 8192(0x2000, double:4.0474E-320)
            long r6 = r6 + r8
            goto L131
        L12e:
            r6 = 1048576(0x100000, double:5.180654E-318)
        L131:
            long r8 = r11.getPosition()
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 <= 0) goto L140
            r10.foundAllTracks = r4
            com.google.android.exoplayer2.extractor.ExtractorOutput r12 = r10.output
            r12.endTracks()
        L140:
            com.google.android.exoplayer2.util.ParsableByteArray r12 = r10.psPacketBuffer
            byte[] r12 = r12.getData()
            r11.peekFully(r12, r5, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r12 = r10.psPacketBuffer
            r12.setPosition(r5)
            com.google.android.exoplayer2.util.ParsableByteArray r12 = r10.psPacketBuffer
            int r12 = r12.readUnsignedShort()
            int r12 = r12 + r2
            if (r0 != 0) goto L15b
            r11.skipFully(r12)
            goto L17c
        L15b:
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.psPacketBuffer
            r1.reset(r12)
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.psPacketBuffer
            byte[] r1 = r1.getData()
            r11.readFully(r1, r5, r12)
            com.google.android.exoplayer2.util.ParsableByteArray r11 = r10.psPacketBuffer
            r11.setPosition(r2)
            com.google.android.exoplayer2.util.ParsableByteArray r11 = r10.psPacketBuffer
            r0.consume(r11)
            com.google.android.exoplayer2.util.ParsableByteArray r11 = r10.psPacketBuffer
            int r12 = r11.capacity()
            r11.setLimit(r12)
        L17c:
            return r5
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long r6, long r8) {
            r5 = this;
            com.google.android.exoplayer2.util.TimestampAdjuster r6 = r5.timestampAdjuster
            long r6 = r6.getTimestampOffsetUs()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = 1
            r3 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L13
            r6 = 1
            goto L14
        L13:
            r6 = 0
        L14:
            if (r6 != 0) goto L2d
            com.google.android.exoplayer2.util.TimestampAdjuster r6 = r5.timestampAdjuster
            long r6 = r6.getFirstSampleTimestampUs()
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 == 0) goto L2b
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 == 0) goto L2b
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            r2 = 0
        L2c:
            r6 = r2
        L2d:
            if (r6 == 0) goto L34
            com.google.android.exoplayer2.util.TimestampAdjuster r6 = r5.timestampAdjuster
            r6.reset(r8)
        L34:
            com.google.android.exoplayer2.extractor.ts.PsBinarySearchSeeker r6 = r5.psBinarySearchSeeker
            if (r6 == 0) goto L3b
            r6.setSeekTargetUs(r8)
        L3b:
            android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.PsExtractor$PesReader> r6 = r5.psPayloadReaders
            int r6 = r6.size()
            if (r3 >= r6) goto L51
            android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.PsExtractor$PesReader> r6 = r5.psPayloadReaders
            java.lang.Object r6 = r6.valueAt(r3)
            com.google.android.exoplayer2.extractor.ts.PsExtractor$PesReader r6 = (com.google.android.exoplayer2.extractor.ts.PsExtractor.PesReader) r6
            r6.seek()
            int r3 = r3 + 1
            goto L3b
        L51:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r10) throws java.io.IOException {
            r9 = this;
            r0 = 14
            byte[] r1 = new byte[r0]
            r2 = 0
            r10.peekFully(r1, r2, r0)
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r3 = 1
            r4 = r1[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r0 = r0 | r4
            r4 = 2
            r5 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 8
            int r5 = r5 << r6
            r0 = r0 | r5
            r5 = 3
            r7 = r1[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r0 = r0 | r7
            r7 = 442(0x1ba, float:6.2E-43)
            if (r7 == r0) goto L2a
            return r2
        L2a:
            r0 = 4
            r7 = r1[r0]
            r7 = r7 & 196(0xc4, float:2.75E-43)
            r8 = 68
            if (r7 == r8) goto L34
            return r2
        L34:
            r7 = 6
            r7 = r1[r7]
            r7 = r7 & r0
            if (r7 == r0) goto L3b
            return r2
        L3b:
            r7 = r1[r6]
            r7 = r7 & r0
            if (r7 == r0) goto L41
            return r2
        L41:
            r0 = 9
            r0 = r1[r0]
            r0 = r0 & r3
            if (r0 == r3) goto L49
            return r2
        L49:
            r0 = 12
            r0 = r1[r0]
            r0 = r0 & r5
            if (r0 == r5) goto L51
            return r2
        L51:
            r0 = 13
            r0 = r1[r0]
            r0 = r0 & 7
            r10.advancePeekPosition(r0)
            r10.peekFully(r1, r2, r5)
            r10 = r1[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r0 = r1[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r6
            r10 = r10 | r0
            r0 = r1[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r10 = r10 | r0
            if (r3 != r10) goto L71
            r2 = 1
        L71:
            return r2
    }
}
