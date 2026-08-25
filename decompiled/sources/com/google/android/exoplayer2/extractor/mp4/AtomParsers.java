package com.google.android.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes2.dex */
final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final java.lang.String TAG = "AtomParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = null;

    public static final class ChunkIterator {
        private final com.google.android.exoplayer2.util.ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final com.google.android.exoplayer2.util.ParsableByteArray stsc;

        public ChunkIterator(com.google.android.exoplayer2.util.ParsableByteArray r1, com.google.android.exoplayer2.util.ParsableByteArray r2, boolean r3) throws com.google.android.exoplayer2.ParserException {
                r0 = this;
                r0.<init>()
                r0.stsc = r1
                r0.chunkOffsets = r2
                r0.chunkOffsetsAreLongs = r3
                r3 = 12
                r2.setPosition(r3)
                int r2 = r2.readUnsignedIntToInt()
                r0.length = r2
                r1.setPosition(r3)
                int r2 = r1.readUnsignedIntToInt()
                r0.remainingSamplesPerChunkChanges = r2
                int r1 = r1.readInt()
                r2 = 1
                if (r1 != r2) goto L25
                goto L26
            L25:
                r2 = 0
            L26:
                java.lang.String r1 = "first_chunk must be 1"
                com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r2, r1)
                r1 = -1
                r0.index = r1
                return
        }

        public boolean moveNext() {
                r4 = this;
                int r0 = r4.index
                r1 = 1
                int r0 = r0 + r1
                r4.index = r0
                int r2 = r4.length
                if (r0 != r2) goto Lc
                r0 = 0
                return r0
            Lc:
                boolean r0 = r4.chunkOffsetsAreLongs
                if (r0 == 0) goto L17
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.chunkOffsets
                long r2 = r0.readUnsignedLongToLong()
                goto L1d
            L17:
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.chunkOffsets
                long r2 = r0.readUnsignedInt()
            L1d:
                r4.offset = r2
                int r0 = r4.index
                int r2 = r4.nextSamplesPerChunkChangeIndex
                if (r0 != r2) goto L45
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.stsc
                int r0 = r0.readUnsignedIntToInt()
                r4.numSamples = r0
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.stsc
                r2 = 4
                r0.skipBytes(r2)
                int r0 = r4.remainingSamplesPerChunkChanges
                int r0 = r0 - r1
                r4.remainingSamplesPerChunkChanges = r0
                if (r0 <= 0) goto L42
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.stsc
                int r0 = r0.readUnsignedIntToInt()
                int r0 = r0 - r1
                goto L43
            L42:
                r0 = -1
            L43:
                r4.nextSamplesPerChunkChangeIndex = r0
            L45:
                return r1
        }
    }

    public static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final java.lang.String mimeType;
        private final long peakBitrate;

        public EsdsData(java.lang.String r1, byte[] r2, long r3, long r5) {
                r0 = this;
                r0.<init>()
                r0.mimeType = r1
                r0.initializationData = r2
                r0.bitrate = r3
                r0.peakBitrate = r5
                return
        }

        public static /* synthetic */ java.lang.String access$300(com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData r0) {
                java.lang.String r0 = r0.mimeType
                return r0
        }

        public static /* synthetic */ byte[] access$400(com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData r0) {
                byte[] r0 = r0.initializationData
                return r0
        }

        public static /* synthetic */ long access$500(com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData r2) {
                long r0 = r2.peakBitrate
                return r0
        }

        public static /* synthetic */ long access$600(com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData r2) {
                long r0 = r2.bitrate
                return r0
        }
    }

    public interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    public static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation;
        public final com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int r1) {
                r0 = this;
                r0.<init>()
                com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox[] r1 = new com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox[r1]
                r0.trackEncryptionBoxes = r1
                r1 = 0
                r0.requiredSampleTransformation = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class StszSampleSizeBox implements com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox {
        private final com.google.android.exoplayer2.util.ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom r4, com.google.android.exoplayer2.Format r5) {
                r3 = this;
                r3.<init>()
                com.google.android.exoplayer2.util.ParsableByteArray r4 = r4.data
                r3.data = r4
                r0 = 12
                r4.setPosition(r0)
                int r0 = r4.readUnsignedIntToInt()
                java.lang.String r1 = r5.sampleMimeType
                java.lang.String r2 = "audio/raw"
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L47
                int r1 = r5.pcmEncoding
                int r5 = r5.channelCount
                int r5 = com.google.android.exoplayer2.util.Util.getPcmFrameSize(r1, r5)
                if (r0 == 0) goto L28
                int r1 = r0 % r5
                if (r1 == 0) goto L47
            L28:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Audio sample size mismatch. stsd sample size: "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ", stsz sample size: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "AtomParsers"
                com.google.android.exoplayer2.util.Log.w(r1, r0)
                r0 = r5
            L47:
                if (r0 != 0) goto L4a
                r0 = -1
            L4a:
                r3.fixedSampleSize = r0
                int r4 = r4.readUnsignedIntToInt()
                r3.sampleCount = r4
                return
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
                r1 = this;
                int r0 = r1.fixedSampleSize
                return r0
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
                r1 = this;
                int r0 = r1.sampleCount
                return r0
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
                r2 = this;
                int r0 = r2.fixedSampleSize
                r1 = -1
                if (r0 != r1) goto Lb
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r2.data
                int r0 = r0.readUnsignedIntToInt()
            Lb:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Stz2SampleSizeBox implements com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox {
        private int currentByte;
        private final com.google.android.exoplayer2.util.ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom r2) {
                r1 = this;
                r1.<init>()
                com.google.android.exoplayer2.util.ParsableByteArray r2 = r2.data
                r1.data = r2
                r0 = 12
                r2.setPosition(r0)
                int r0 = r2.readUnsignedIntToInt()
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1.fieldSize = r0
                int r2 = r2.readUnsignedIntToInt()
                r1.sampleCount = r2
                return
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
                r1 = this;
                r0 = -1
                return r0
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
                r1 = this;
                int r0 = r1.sampleCount
                return r0
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
                r2 = this;
                int r0 = r2.fieldSize
                r1 = 8
                if (r0 != r1) goto Ld
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r2.data
                int r0 = r0.readUnsignedByte()
                return r0
            Ld:
                r1 = 16
                if (r0 != r1) goto L18
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r2.data
                int r0 = r0.readUnsignedShort()
                return r0
            L18:
                int r0 = r2.sampleIndex
                int r1 = r0 + 1
                r2.sampleIndex = r1
                int r0 = r0 % 2
                if (r0 != 0) goto L2f
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r2.data
                int r0 = r0.readUnsignedByte()
                r2.currentByte = r0
                r0 = r0 & 240(0xf0, float:3.36E-43)
                int r0 = r0 >> 4
                return r0
            L2f:
                int r0 = r2.currentByte
                r0 = r0 & 15
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class TkhdData {
        private final long duration;
        private final int id;
        private final int rotationDegrees;

        public TkhdData(int r1, long r2, int r4) {
                r0 = this;
                r0.<init>()
                r0.id = r1
                r0.duration = r2
                r0.rotationDegrees = r4
                return
        }

        public static /* synthetic */ long access$000(com.google.android.exoplayer2.extractor.mp4.AtomParsers.TkhdData r2) {
                long r0 = r2.duration
                return r0
        }

        public static /* synthetic */ int access$100(com.google.android.exoplayer2.extractor.mp4.AtomParsers.TkhdData r0) {
                int r0 = r0.id
                return r0
        }

        public static /* synthetic */ int access$200(com.google.android.exoplayer2.extractor.mp4.AtomParsers.TkhdData r0) {
                int r0 = r0.rotationDegrees
                return r0
        }
    }

    static {
            java.lang.String r0 = "OpusHead"
            byte[] r0 = com.google.android.exoplayer2.util.Util.getUtf8Bytes(r0)
            com.google.android.exoplayer2.extractor.mp4.AtomParsers.opusMagic = r0
            return
    }

    private AtomParsers() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.nio.ByteBuffer allocateHdrStaticInfo() {
            r0 = 25
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    private static boolean canApplyEditWithGaplessInfo(long[] r7, long r8, long r10, long r12) {
            int r0 = r7.length
            r1 = 1
            int r0 = r0 - r1
            r2 = 4
            r3 = 0
            int r4 = com.google.android.exoplayer2.util.Util.constrainValue(r2, r3, r0)
            int r5 = r7.length
            int r5 = r5 - r2
            int r0 = com.google.android.exoplayer2.util.Util.constrainValue(r5, r3, r0)
            r5 = r7[r3]
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 > 0) goto L26
            r4 = r7[r4]
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 >= 0) goto L26
            r10 = r7[r0]
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 >= 0) goto L26
            int r7 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r7 > 0) goto L26
            goto L27
        L26:
            r1 = 0
        L27:
            return r1
    }

    private static int findBoxPosition(com.google.android.exoplayer2.util.ParsableByteArray r6, int r7, int r8, int r9) throws com.google.android.exoplayer2.ParserException {
            int r0 = r6.getPosition()
            r1 = 1
            r2 = 0
            if (r0 < r8) goto La
            r3 = 1
            goto Lb
        La:
            r3 = 0
        Lb:
            r4 = 0
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r3, r4)
        Lf:
            int r3 = r0 - r8
            if (r3 >= r9) goto L2d
            r6.setPosition(r0)
            int r3 = r6.readInt()
            if (r3 <= 0) goto L1e
            r4 = 1
            goto L1f
        L1e:
            r4 = 0
        L1f:
            java.lang.String r5 = "childAtomSize must be positive"
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r4, r5)
            int r4 = r6.readInt()
            if (r4 != r7) goto L2b
            return r0
        L2b:
            int r0 = r0 + r3
            goto Lf
        L2d:
            r6 = -1
            return r6
    }

    private static int getTrackTypeForHdlr(int r1) {
            r0 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r1 != r0) goto L7
            r1 = 1
            return r1
        L7:
            r0 = 1986618469(0x76696465, float:1.1834389E33)
            if (r1 != r0) goto Le
            r1 = 2
            return r1
        Le:
            r0 = 1952807028(0x74657874, float:7.272211E31)
            if (r1 == r0) goto L2c
            r0 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r1 == r0) goto L2c
            r0 = 1937072756(0x73756274, float:1.944137E31)
            if (r1 == r0) goto L2c
            r0 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r1 != r0) goto L23
            goto L2c
        L23:
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r1 != r0) goto L2a
            r1 = 5
            return r1
        L2a:
            r1 = -1
            return r1
        L2c:
            r1 = 3
            return r1
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(com.google.android.exoplayer2.util.ParsableByteArray r3) {
            int r0 = r3.getPosition()
            r1 = 4
            r3.skipBytes(r1)
            int r1 = r3.readInt()
            r2 = 1751411826(0x68646c72, float:4.3148E24)
            if (r1 == r2) goto L13
            int r0 = r0 + 4
        L13:
            r3.setPosition(r0)
            return
    }

    private static void parseAudioSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r29, com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData r30, int r31) throws com.google.android.exoplayer2.ParserException {
            r0 = r22
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r29
            r6 = r30
            int r7 = r1 + 8
            r8 = 8
            int r7 = r7 + r8
            r0.setPosition(r7)
            r7 = 6
            if (r28 == 0) goto L21
            int r8 = r22.readUnsignedShort()
            r0.skipBytes(r7)
            goto L25
        L21:
            r0.skipBytes(r8)
            r8 = 0
        L25:
            r10 = 16
            r11 = 4
            r12 = 2
            r13 = 1
            if (r8 == 0) goto L49
            if (r8 != r13) goto L2f
            goto L49
        L2f:
            if (r8 != r12) goto L48
            r0.skipBytes(r10)
            double r7 = r22.readDouble()
            long r7 = java.lang.Math.round(r7)
            int r8 = (int) r7
            int r7 = r22.readUnsignedIntToInt()
            r10 = 20
            r0.skipBytes(r10)
            r15 = 0
            goto L67
        L48:
            return
        L49:
            int r14 = r22.readUnsignedShort()
            r0.skipBytes(r7)
            int r7 = r22.readUnsignedFixedPoint1616()
            int r15 = r22.getPosition()
            int r15 = r15 - r11
            r0.setPosition(r15)
            int r15 = r22.readInt()
            if (r8 != r13) goto L65
            r0.skipBytes(r10)
        L65:
            r8 = r7
            r7 = r14
        L67:
            int r10 = r22.getPosition()
            r14 = 1701733217(0x656e6361, float:7.0359778E22)
            r12 = r23
            if (r12 != r14) goto L99
            android.util.Pair r14 = parseSampleEntryEncryptionData(r0, r1, r2)
            if (r14 == 0) goto L96
            java.lang.Object r12 = r14.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r5 != 0) goto L84
            r5 = 0
            goto L8e
        L84:
            java.lang.Object r13 = r14.second
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r13 = (com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) r13
            java.lang.String r13 = r13.schemeType
            com.google.android.exoplayer2.drm.DrmInitData r5 = r5.copyWithSchemeType(r13)
        L8e:
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox[] r13 = r6.trackEncryptionBoxes
            java.lang.Object r14 = r14.second
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r14 = (com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) r14
            r13[r31] = r14
        L96:
            r0.setPosition(r10)
        L99:
            r13 = 1633889587(0x61632d33, float:2.6191674E20)
            r14 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r19 = "audio/raw"
            if (r12 != r13) goto La8
            java.lang.String r19 = "audio/ac3"
        La5:
            r12 = -1
            goto L15a
        La8:
            r13 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r12 != r13) goto Lb0
            java.lang.String r19 = "audio/eac3"
            goto La5
        Lb0:
            r13 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r12 != r13) goto Lb8
            java.lang.String r19 = "audio/ac4"
            goto La5
        Lb8:
            r13 = 1685353315(0x64747363, float:1.803728E22)
            if (r12 != r13) goto Lc0
            java.lang.String r19 = "audio/vnd.dts"
            goto La5
        Lc0:
            r13 = 1685353320(0x64747368, float:1.8037286E22)
            if (r12 == r13) goto L156
            r13 = 1685353324(0x6474736c, float:1.803729E22)
            if (r12 != r13) goto Lcc
            goto L156
        Lcc:
            r13 = 1685353317(0x64747365, float:1.8037282E22)
            if (r12 != r13) goto Ld4
            java.lang.String r19 = "audio/vnd.dts.hd;profile=lbr"
            goto La5
        Ld4:
            r13 = 1685353336(0x64747378, float:1.8037304E22)
            if (r12 != r13) goto Ldc
            java.lang.String r19 = "audio/vnd.dts.uhd;profile=p2"
            goto La5
        Ldc:
            r13 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r12 != r13) goto Le4
            java.lang.String r19 = "audio/3gpp"
            goto La5
        Le4:
            r13 = 1935767394(0x73617762, float:1.7863284E31)
            if (r12 != r13) goto Lec
            java.lang.String r19 = "audio/amr-wb"
            goto La5
        Lec:
            r13 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r12 == r13) goto L154
            r13 = 1936684916(0x736f7774, float:1.89725E31)
            if (r12 != r13) goto Lf7
            goto L154
        Lf7:
            r13 = 1953984371(0x74776f73, float:7.841539E31)
            if (r12 != r13) goto Lff
            r12 = 268435456(0x10000000, float:2.524355E-29)
            goto L15a
        Lff:
            r13 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r12 == r13) goto L150
            r13 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r12 != r13) goto L10a
            goto L150
        L10a:
            r13 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r12 != r13) goto L112
            java.lang.String r19 = "audio/mha1"
            goto La5
        L112:
            r13 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r12 != r13) goto L11a
            java.lang.String r19 = "audio/mhm1"
            goto La5
        L11a:
            if (r12 != r14) goto L11f
            java.lang.String r19 = "audio/alac"
            goto La5
        L11f:
            r13 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r12 != r13) goto L128
            java.lang.String r19 = "audio/g711-alaw"
            goto La5
        L128:
            r13 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r12 != r13) goto L131
            java.lang.String r19 = "audio/g711-mlaw"
            goto La5
        L131:
            r13 = 1332770163(0x4f707573, float:4.034229E9)
            if (r12 != r13) goto L13a
            java.lang.String r19 = "audio/opus"
            goto La5
        L13a:
            r13 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r12 != r13) goto L143
            java.lang.String r19 = "audio/flac"
            goto La5
        L143:
            r13 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r12 != r13) goto L14c
            java.lang.String r19 = "audio/true-hd"
            goto La5
        L14c:
            r12 = -1
            r19 = 0
            goto L15a
        L150:
            java.lang.String r19 = "audio/mpeg"
            goto La5
        L154:
            r12 = 2
            goto L15a
        L156:
            java.lang.String r19 = "audio/vnd.dts.hd"
            goto La5
        L15a:
            r13 = r19
            r19 = 0
            r20 = 0
            r21 = 0
        L162:
            int r11 = r10 - r1
            if (r11 >= r2) goto L317
            r0.setPosition(r10)
            int r11 = r22.readInt()
            if (r11 <= 0) goto L171
            r14 = 1
            goto L172
        L171:
            r14 = 0
        L172:
            java.lang.String r9 = "childAtomSize must be positive"
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r14, r9)
            int r9 = r22.readInt()
            r14 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r9 != r14) goto L19b
            int r9 = r11 + (-13)
            byte[] r14 = new byte[r9]
            int r1 = r10 + 13
            r0.setPosition(r1)
            r1 = 0
            r0.readBytes(r14, r1, r9)
            com.google.common.collect.ImmutableList r21 = com.google.common.collect.ImmutableList.of(r14)
        L191:
            r9 = -1
            r14 = 1
            r16 = 4
            r17 = 2
        L197:
            r18 = 0
            goto L30d
        L19b:
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r9 == r1) goto L2d2
            if (r28 == 0) goto L1a9
            r14 = 2002876005(0x77617665, float:4.5729223E33)
            if (r9 != r14) goto L1a9
            goto L2d2
        L1a9:
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r9 != r1) goto L1c8
            int r1 = r10 + 8
            r0.setPosition(r1)
            java.lang.String r1 = java.lang.Integer.toString(r26)
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.audio.Ac3Util.parseAc3AnnexFFormat(r0, r1, r4, r5)
            r6.format = r1
        L1bd:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r9 = 0
            r14 = 1
            r16 = 4
            r17 = 2
            goto L2cf
        L1c8:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r9 != r1) goto L1dd
            int r1 = r10 + 8
            r0.setPosition(r1)
            java.lang.String r1 = java.lang.Integer.toString(r26)
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.audio.Ac3Util.parseEAc3AnnexFFormat(r0, r1, r4, r5)
            r6.format = r1
            goto L1bd
        L1dd:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r9 != r1) goto L1f2
            int r1 = r10 + 8
            r0.setPosition(r1)
            java.lang.String r1 = java.lang.Integer.toString(r26)
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.audio.Ac4Util.parseAc4AnnexEFormat(r0, r1, r4, r5)
            r6.format = r1
            goto L1bd
        L1f2:
            r1 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r9 != r1) goto L213
            if (r15 <= 0) goto L1fc
            r8 = r15
            r7 = 2
            goto L191
        L1fc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r14 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r14)
            throw r0
        L213:
            r14 = 0
            r1 = 1684305011(0x64647473, float:1.6856995E22)
            if (r9 == r1) goto L2a3
            r1 = 1969517683(0x75647473, float:2.8960097E32)
            if (r9 != r1) goto L220
            goto L2a3
        L220:
            r1 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r9 != r1) goto L23e
            int r1 = r11 + (-8)
            byte[] r9 = com.google.android.exoplayer2.extractor.mp4.AtomParsers.opusMagic
            int r14 = r9.length
            int r14 = r14 + r1
            byte[] r14 = java.util.Arrays.copyOf(r9, r14)
            int r2 = r10 + 8
            r0.setPosition(r2)
            int r2 = r9.length
            r0.readBytes(r14, r2, r1)
            java.util.List r21 = com.google.android.exoplayer2.audio.OpusUtil.buildInitializationData(r14)
            goto L191
        L23e:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r9 != r1) goto L270
            int r1 = r11 + (-12)
            int r2 = r1 + 4
            byte[] r2 = new byte[r2]
            r9 = 102(0x66, float:1.43E-43)
            r14 = 0
            r2[r14] = r9
            r9 = 76
            r14 = 1
            r2[r14] = r9
            r9 = 97
            r17 = 2
            r2[r17] = r9
            r9 = 3
            r18 = 67
            r2[r9] = r18
            int r9 = r10 + 12
            r0.setPosition(r9)
            r9 = 4
            r0.readBytes(r2, r9, r1)
            com.google.common.collect.ImmutableList r21 = com.google.common.collect.ImmutableList.of(r2)
            r9 = -1
            r16 = 4
            goto L197
        L270:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r14 = 1
            r16 = 4
            r17 = 2
            if (r9 != r2) goto L2a1
            int r1 = r11 + (-12)
            byte[] r7 = new byte[r1]
            int r8 = r10 + 12
            r0.setPosition(r8)
            r9 = 0
            r0.readBytes(r7, r9, r1)
            android.util.Pair r1 = com.google.android.exoplayer2.util.CodecSpecificDataUtil.parseAlacAudioSpecificConfig(r7)
            java.lang.Object r8 = r1.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.common.collect.ImmutableList r21 = com.google.common.collect.ImmutableList.of(r7)
            r7 = r1
            goto L2cf
        L2a1:
            r9 = 0
            goto L2cf
        L2a3:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r9 = 0
            r14 = 1
            r16 = 4
            r17 = 2
            com.google.android.exoplayer2.Format$Builder r1 = new com.google.android.exoplayer2.Format$Builder
            r1.<init>()
            com.google.android.exoplayer2.Format$Builder r1 = r1.setId(r3)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleMimeType(r13)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setChannelCount(r7)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleRate(r8)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setDrmInitData(r5)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setLanguage(r4)
            com.google.android.exoplayer2.Format r1 = r1.build()
            r6.format = r1
        L2cf:
            r9 = -1
            goto L197
        L2d2:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r14 = 1
            r16 = 4
            r17 = 2
            r18 = 0
            if (r9 != r1) goto L2e0
            r1 = r10
            goto L2e4
        L2e0:
            int r1 = findBoxPosition(r0, r1, r10, r11)
        L2e4:
            r9 = -1
            if (r1 == r9) goto L30d
            com.google.android.exoplayer2.extractor.mp4.AtomParsers$EsdsData r19 = parseEsdsFromParent(r0, r1)
            java.lang.String r13 = com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData.access$300(r19)
            byte[] r1 = com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData.access$400(r19)
            if (r1 == 0) goto L30d
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L309
            com.google.android.exoplayer2.audio.AacUtil$Config r2 = com.google.android.exoplayer2.audio.AacUtil.parseAudioSpecificConfig(r1)
            int r8 = r2.sampleRateHz
            int r7 = r2.channelCount
            java.lang.String r2 = r2.codecs
            r20 = r2
        L309:
            com.google.common.collect.ImmutableList r21 = com.google.common.collect.ImmutableList.of(r1)
        L30d:
            int r10 = r10 + r11
            r1 = r24
            r2 = r25
            r14 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L162
        L317:
            com.google.android.exoplayer2.Format r0 = r6.format
            if (r0 != 0) goto L369
            if (r13 == 0) goto L369
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            com.google.android.exoplayer2.Format$Builder r0 = r0.setId(r3)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r13)
            r1 = r20
            com.google.android.exoplayer2.Format$Builder r0 = r0.setCodecs(r1)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setChannelCount(r7)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleRate(r8)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setPcmEncoding(r12)
            r1 = r21
            com.google.android.exoplayer2.Format$Builder r0 = r0.setInitializationData(r1)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setDrmInitData(r5)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setLanguage(r4)
            if (r19 == 0) goto L363
            long r1 = com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData.access$600(r19)
            int r1 = com.google.common.primitives.Ints.saturatedCast(r1)
            com.google.android.exoplayer2.Format$Builder r1 = r0.setAverageBitrate(r1)
            long r2 = com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData.access$500(r19)
            int r2 = com.google.common.primitives.Ints.saturatedCast(r2)
            r1.setPeakBitrate(r2)
        L363:
            com.google.android.exoplayer2.Format r0 = r0.build()
            r6.format = r0
        L369:
            return
    }

    @androidx.annotation.Nullable
    private static android.util.Pair<long[], long[]> parseEdts(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r8) {
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r8 = r8.getLeafAtomOfType(r0)
            if (r8 != 0) goto Lb
            r8 = 0
            return r8
        Lb:
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r8.data
            r0 = 8
            r8.setPosition(r0)
            int r0 = r8.readInt()
            int r0 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(r0)
            int r1 = r8.readUnsignedIntToInt()
            long[] r2 = new long[r1]
            long[] r3 = new long[r1]
            r4 = 0
        L23:
            if (r4 >= r1) goto L56
            r5 = 1
            if (r0 != r5) goto L2d
            long r6 = r8.readUnsignedLongToLong()
            goto L31
        L2d:
            long r6 = r8.readUnsignedInt()
        L31:
            r2[r4] = r6
            if (r0 != r5) goto L3a
            long r6 = r8.readLong()
            goto L3f
        L3a:
            int r6 = r8.readInt()
            long r6 = (long) r6
        L3f:
            r3[r4] = r6
            short r6 = r8.readShort()
            if (r6 != r5) goto L4e
            r5 = 2
            r8.skipBytes(r5)
            int r4 = r4 + 1
            goto L23
        L4e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported media rate."
            r8.<init>(r0)
            throw r8
        L56:
            android.util.Pair r8 = android.util.Pair.create(r2, r3)
            return r8
    }

    private static com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData parseEsdsFromParent(com.google.android.exoplayer2.util.ParsableByteArray r13, int r14) {
            int r14 = r14 + 8
            r0 = 4
            int r14 = r14 + r0
            r13.setPosition(r14)
            r14 = 1
            r13.skipBytes(r14)
            parseExpandableClassSize(r13)
            r1 = 2
            r13.skipBytes(r1)
            int r2 = r13.readUnsignedByte()
            r3 = r2 & 128(0x80, float:1.8E-43)
            if (r3 == 0) goto L1d
            r13.skipBytes(r1)
        L1d:
            r3 = r2 & 64
            if (r3 == 0) goto L28
            int r3 = r13.readUnsignedByte()
            r13.skipBytes(r3)
        L28:
            r2 = r2 & 32
            if (r2 == 0) goto L2f
            r13.skipBytes(r1)
        L2f:
            r13.skipBytes(r14)
            parseExpandableClassSize(r13)
            int r1 = r13.readUnsignedByte()
            java.lang.String r3 = com.google.android.exoplayer2.util.MimeTypes.getMimeTypeFromMp4ObjectType(r1)
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L87
            java.lang.String r1 = "audio/vnd.dts"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L87
            java.lang.String r1 = "audio/vnd.dts.hd"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L56
            goto L87
        L56:
            r13.skipBytes(r0)
            long r0 = r13.readUnsignedInt()
            long r4 = r13.readUnsignedInt()
            r13.skipBytes(r14)
            int r14 = parseExpandableClassSize(r13)
            byte[] r6 = new byte[r14]
            r2 = 0
            r13.readBytes(r6, r2, r14)
            com.google.android.exoplayer2.extractor.mp4.AtomParsers$EsdsData r13 = new com.google.android.exoplayer2.extractor.mp4.AtomParsers$EsdsData
            r7 = -1
            r9 = 0
            int r14 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r14 <= 0) goto L7a
            r11 = r4
            goto L7b
        L7a:
            r11 = r7
        L7b:
            int r14 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r14 <= 0) goto L80
            r7 = r0
        L80:
            r2 = r13
            r4 = r6
            r5 = r11
            r2.<init>(r3, r4, r5, r7)
            return r13
        L87:
            com.google.android.exoplayer2.extractor.mp4.AtomParsers$EsdsData r13 = new com.google.android.exoplayer2.extractor.mp4.AtomParsers$EsdsData
            r4 = 0
            r5 = -1
            r7 = -1
            r2 = r13
            r2.<init>(r3, r4, r5, r7)
            return r13
    }

    private static int parseExpandableClassSize(com.google.android.exoplayer2.util.ParsableByteArray r3) {
            int r0 = r3.readUnsignedByte()
            r1 = r0 & 127(0x7f, float:1.78E-43)
        L6:
            r2 = 128(0x80, float:1.8E-43)
            r0 = r0 & r2
            if (r0 != r2) goto L15
            int r0 = r3.readUnsignedByte()
            int r1 = r1 << 7
            r2 = r0 & 127(0x7f, float:1.78E-43)
            r1 = r1 | r2
            goto L6
        L15:
            return r1
    }

    private static int parseHdlr(com.google.android.exoplayer2.util.ParsableByteArray r1) {
            r0 = 16
            r1.setPosition(r0)
            int r1 = r1.readInt()
            return r1
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.Metadata parseIlst(com.google.android.exoplayer2.util.ParsableByteArray r2, int r3) {
            r0 = 8
            r2.skipBytes(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        La:
            int r1 = r2.getPosition()
            if (r1 >= r3) goto L1a
            com.google.android.exoplayer2.metadata.Metadata$Entry r1 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.parseIlstElement(r2)
            if (r1 == 0) goto La
            r0.add(r1)
            goto La
        L1a:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L22
            r2 = 0
            goto L27
        L22:
            com.google.android.exoplayer2.metadata.Metadata r2 = new com.google.android.exoplayer2.metadata.Metadata
            r2.<init>(r0)
        L27:
            return r2
    }

    private static android.util.Pair<java.lang.Long, java.lang.String> parseMdhd(com.google.android.exoplayer2.util.ParsableByteArray r4) {
            r0 = 8
            r4.setPosition(r0)
            int r1 = r4.readInt()
            int r1 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(r1)
            if (r1 != 0) goto L12
            r2 = 8
            goto L14
        L12:
            r2 = 16
        L14:
            r4.skipBytes(r2)
            long r2 = r4.readUnsignedInt()
            if (r1 != 0) goto L1e
            r0 = 4
        L1e:
            r4.skipBytes(r0)
            int r4 = r4.readUnsignedShort()
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r4 >> 10
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            r0.append(r1)
            int r1 = r4 >> 5
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            r0.append(r1)
            r4 = r4 & 31
            int r4 = r4 + 96
            char r4 = (char) r4
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            android.util.Pair r4 = android.util.Pair.create(r0, r4)
            return r4
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.metadata.Metadata parseMdtaFromMeta(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r10) {
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r0 = r10.getLeafAtomOfType(r0)
            r1 = 1801812339(0x6b657973, float:2.7741754E26)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r1 = r10.getLeafAtomOfType(r1)
            r2 = 1768715124(0x696c7374, float:1.7865732E25)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r10 = r10.getLeafAtomOfType(r2)
            r2 = 0
            if (r0 == 0) goto L94
            if (r1 == 0) goto L94
            if (r10 == 0) goto L94
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r0.data
            int r0 = parseHdlr(r0)
            r3 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r0 == r3) goto L28
            goto L94
        L28:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r1.data
            r1 = 12
            r0.setPosition(r1)
            int r1 = r0.readInt()
            java.lang.String[] r3 = new java.lang.String[r1]
            r4 = 0
        L36:
            r5 = 8
            if (r4 >= r1) goto L4c
            int r6 = r0.readInt()
            r7 = 4
            r0.skipBytes(r7)
            int r6 = r6 - r5
            java.lang.String r5 = r0.readString(r6)
            r3[r4] = r5
            int r4 = r4 + 1
            goto L36
        L4c:
            com.google.android.exoplayer2.util.ParsableByteArray r10 = r10.data
            r10.setPosition(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L56:
            int r4 = r10.bytesLeft()
            if (r4 <= r5) goto L88
            int r4 = r10.getPosition()
            int r6 = r10.readInt()
            int r7 = r10.readInt()
            int r7 = r7 + (-1)
            if (r7 < 0) goto L7c
            if (r7 >= r1) goto L7c
            r7 = r3[r7]
            int r8 = r4 + r6
            com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry r7 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.parseMdtaMetadataEntryFromIlst(r10, r8, r7)
            if (r7 == 0) goto L83
            r0.add(r7)
            goto L83
        L7c:
            java.lang.String r8 = "Skipped metadata with unknown key index: "
            java.lang.String r9 = "AtomParsers"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r8, r7, r9)
        L83:
            int r4 = r4 + r6
            r10.setPosition(r4)
            goto L56
        L88:
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto L8f
            goto L94
        L8f:
            com.google.android.exoplayer2.metadata.Metadata r2 = new com.google.android.exoplayer2.metadata.Metadata
            r2.<init>(r0)
        L94:
            return r2
    }

    private static void parseMetaDataSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray r0, int r1, int r2, int r3, com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData r4) {
            int r2 = r2 + 8
            int r2 = r2 + 8
            r0.setPosition(r2)
            r2 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r1 != r2) goto L28
            r0.readNullTerminatedString()
            java.lang.String r0 = r0.readNullTerminatedString()
            if (r0 == 0) goto L28
            com.google.android.exoplayer2.Format$Builder r1 = new com.google.android.exoplayer2.Format$Builder
            r1.<init>()
            com.google.android.exoplayer2.Format$Builder r1 = r1.setId(r3)
            com.google.android.exoplayer2.Format$Builder r0 = r1.setSampleMimeType(r0)
            com.google.android.exoplayer2.Format r0 = r0.build()
            r4.format = r0
        L28:
            return
    }

    private static long parseMvhd(com.google.android.exoplayer2.util.ParsableByteArray r2) {
            r0 = 8
            r2.setPosition(r0)
            int r1 = r2.readInt()
            int r1 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(r1)
            if (r1 != 0) goto L10
            goto L12
        L10:
            r0 = 16
        L12:
            r2.skipBytes(r0)
            long r0 = r2.readUnsignedInt()
            return r0
    }

    private static float parsePaspFromParent(com.google.android.exoplayer2.util.ParsableByteArray r0, int r1) {
            int r1 = r1 + 8
            r0.setPosition(r1)
            int r1 = r0.readUnsignedIntToInt()
            int r0 = r0.readUnsignedIntToInt()
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            return r1
    }

    @androidx.annotation.Nullable
    private static byte[] parseProjFromParent(com.google.android.exoplayer2.util.ParsableByteArray r4, int r5, int r6) {
            int r0 = r5 + 8
        L2:
            int r1 = r0 - r5
            if (r1 >= r6) goto L22
            r4.setPosition(r0)
            int r1 = r4.readInt()
            int r2 = r4.readInt()
            r3 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r2 != r3) goto L20
            byte[] r4 = r4.getData()
            int r1 = r1 + r0
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r0, r1)
            return r4
        L20:
            int r0 = r0 + r1
            goto L2
        L22:
            r4 = 0
            return r4
    }

    @androidx.annotation.Nullable
    private static android.util.Pair<java.lang.Integer, com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox> parseSampleEntryEncryptionData(com.google.android.exoplayer2.util.ParsableByteArray r16, int r17, int r18) throws com.google.android.exoplayer2.ParserException {
            r0 = r16
            int r1 = r16.getPosition()
        L6:
            int r2 = r1 - r17
            r3 = 0
            r4 = r18
            if (r2 >= r4) goto Lb7
            r0.setPosition(r1)
            int r2 = r16.readInt()
            r5 = 1
            r6 = 0
            if (r2 <= 0) goto L1a
            r7 = 1
            goto L1b
        L1a:
            r7 = 0
        L1b:
            java.lang.String r8 = "childAtomSize must be positive"
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r7, r8)
            int r7 = r16.readInt()
            r8 = 1936289382(0x73696e66, float:1.8494329E31)
            if (r7 != r8) goto Lb4
            int r7 = r1 + 8
            r8 = -1
            r9 = r3
            r11 = r9
            r10 = -1
            r12 = 0
        L30:
            int r13 = r7 - r1
            if (r13 >= r2) goto L64
            r0.setPosition(r7)
            int r13 = r16.readInt()
            int r14 = r16.readInt()
            r15 = 1718775137(0x66726d61, float:2.862076E23)
            if (r14 != r15) goto L4d
            int r11 = r16.readInt()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L62
        L4d:
            r15 = 1935894637(0x7363686d, float:1.8017111E31)
            if (r14 != r15) goto L5b
            r9 = 4
            r0.skipBytes(r9)
            java.lang.String r9 = r0.readString(r9)
            goto L62
        L5b:
            r15 = 1935894633(0x73636869, float:1.8017106E31)
            if (r14 != r15) goto L62
            r10 = r7
            r12 = r13
        L62:
            int r7 = r7 + r13
            goto L30
        L64:
            java.lang.String r7 = "cenc"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L84
            java.lang.String r7 = "cbc1"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L84
            java.lang.String r7 = "cens"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L84
            java.lang.String r7 = "cbcs"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto Lb1
        L84:
            if (r11 == 0) goto L88
            r3 = 1
            goto L89
        L88:
            r3 = 0
        L89:
            java.lang.String r7 = "frma atom is mandatory"
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r3, r7)
            if (r10 == r8) goto L92
            r3 = 1
            goto L93
        L92:
            r3 = 0
        L93:
            java.lang.String r7 = "schi atom is mandatory"
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r3, r7)
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r3 = parseSchiFromParent(r0, r10, r12, r9)
            if (r3 == 0) goto La0
            goto La1
        La0:
            r5 = 0
        La1:
            java.lang.String r6 = "tenc atom is mandatory"
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r5, r6)
            java.lang.Object r3 = com.google.android.exoplayer2.util.Util.castNonNull(r3)
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r3 = (com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) r3
            android.util.Pair r3 = android.util.Pair.create(r11, r3)
        Lb1:
            if (r3 == 0) goto Lb4
            return r3
        Lb4:
            int r1 = r1 + r2
            goto L6
        Lb7:
            return r3
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox parseSchiFromParent(com.google.android.exoplayer2.util.ParsableByteArray r11, int r12, int r13, java.lang.String r14) {
            int r0 = r12 + 8
        L2:
            int r1 = r0 - r12
            r2 = 0
            if (r1 >= r13) goto L64
            r11.setPosition(r0)
            int r1 = r11.readInt()
            int r3 = r11.readInt()
            r4 = 1952804451(0x74656e63, float:7.270965E31)
            if (r3 != r4) goto L62
            int r12 = r11.readInt()
            int r12 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(r12)
            r13 = 1
            r11.skipBytes(r13)
            r0 = 0
            if (r12 != 0) goto L2c
            r11.skipBytes(r13)
            r8 = 0
            r9 = 0
            goto L38
        L2c:
            int r12 = r11.readUnsignedByte()
            r1 = r12 & 240(0xf0, float:3.36E-43)
            int r1 = r1 >> 4
            r12 = r12 & 15
            r9 = r12
            r8 = r1
        L38:
            int r12 = r11.readUnsignedByte()
            if (r12 != r13) goto L40
            r4 = 1
            goto L41
        L40:
            r4 = 0
        L41:
            int r6 = r11.readUnsignedByte()
            r12 = 16
            byte[] r7 = new byte[r12]
            r11.readBytes(r7, r0, r12)
            if (r4 == 0) goto L59
            if (r6 != 0) goto L59
            int r12 = r11.readUnsignedByte()
            byte[] r2 = new byte[r12]
            r11.readBytes(r2, r0, r12)
        L59:
            r10 = r2
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r11 = new com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox
            r3 = r11
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r11
        L62:
            int r0 = r0 + r1
            goto L2
        L64:
            return r2
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.Metadata parseSmta(com.google.android.exoplayer2.util.ParsableByteArray r6, int r7) {
            r0 = 12
            r6.skipBytes(r0)
        L5:
            int r1 = r6.getPosition()
            r2 = 0
            if (r1 >= r7) goto L55
            int r1 = r6.getPosition()
            int r3 = r6.readInt()
            int r4 = r6.readInt()
            r5 = 1935766900(0x73617574, float:1.7862687E31)
            if (r4 != r5) goto L50
            r7 = 14
            if (r3 >= r7) goto L22
            return r2
        L22:
            r7 = 5
            r6.skipBytes(r7)
            int r7 = r6.readUnsignedByte()
            if (r7 == r0) goto L31
            r1 = 13
            if (r7 == r1) goto L31
            return r2
        L31:
            if (r7 != r0) goto L36
            r7 = 1131413504(0x43700000, float:240.0)
            goto L38
        L36:
            r7 = 1123024896(0x42f00000, float:120.0)
        L38:
            r0 = 1
            r6.skipBytes(r0)
            int r6 = r6.readUnsignedByte()
            com.google.android.exoplayer2.metadata.Metadata r1 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r0 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r0]
            r2 = 0
            com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry r3 = new com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry
            r3.<init>(r7, r6)
            r0[r2] = r3
            r1.<init>(r0)
            return r1
        L50:
            int r1 = r1 + r3
            r6.setPosition(r1)
            goto L5
        L55:
            return r2
    }

    private static com.google.android.exoplayer2.extractor.mp4.TrackSampleTable parseStbl(com.google.android.exoplayer2.extractor.mp4.Track r35, com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r36, com.google.android.exoplayer2.extractor.GaplessInfoHolder r37) throws com.google.android.exoplayer2.ParserException {
            r1 = r35
            r0 = r36
            r2 = r37
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r3 = r0.getLeafAtomOfType(r3)
            if (r3 == 0) goto L17
            com.google.android.exoplayer2.extractor.mp4.AtomParsers$StszSampleSizeBox r4 = new com.google.android.exoplayer2.extractor.mp4.AtomParsers$StszSampleSizeBox
            com.google.android.exoplayer2.Format r5 = r1.format
            r4.<init>(r3, r5)
            goto L25
        L17:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r3 = r0.getLeafAtomOfType(r3)
            if (r3 == 0) goto L509
            com.google.android.exoplayer2.extractor.mp4.AtomParsers$Stz2SampleSizeBox r4 = new com.google.android.exoplayer2.extractor.mp4.AtomParsers$Stz2SampleSizeBox
            r4.<init>(r3)
        L25:
            int r3 = r4.getSampleCount()
            r5 = 0
            if (r3 != 0) goto L43
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r9 = new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable
            long[] r2 = new long[r5]
            int[] r3 = new int[r5]
            r4 = 0
            long[] r6 = new long[r5]
            int[] r7 = new int[r5]
            r10 = 0
            r0 = r9
            r1 = r35
            r5 = r6
            r6 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L43:
            r5 = 1937007471(0x7374636f, float:1.9362445E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r5 = r0.getLeafAtomOfType(r5)
            if (r5 != 0) goto L5b
            r5 = 1668232756(0x636f3634, float:4.4126776E21)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r5 = r0.getLeafAtomOfType(r5)
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r5 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r5
            r6 = 1
            goto L5c
        L5b:
            r6 = 0
        L5c:
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r5.data
            r7 = 1937011555(0x73747363, float:1.9367382E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r7 = r0.getLeafAtomOfType(r7)
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r7 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r7
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r7.data
            r8 = 1937011827(0x73747473, float:1.9367711E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r8 = r0.getLeafAtomOfType(r8)
            java.lang.Object r8 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r8 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r8
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r8.data
            r9 = 1937011571(0x73747373, float:1.9367401E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r9 = r0.getLeafAtomOfType(r9)
            if (r9 == 0) goto L88
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r9.data
            goto L89
        L88:
            r9 = 0
        L89:
            r10 = 1668576371(0x63747473, float:4.5093966E21)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r0 = r0.getLeafAtomOfType(r10)
            if (r0 == 0) goto L95
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r0.data
            goto L96
        L95:
            r0 = 0
        L96:
            com.google.android.exoplayer2.extractor.mp4.AtomParsers$ChunkIterator r10 = new com.google.android.exoplayer2.extractor.mp4.AtomParsers$ChunkIterator
            r10.<init>(r7, r5, r6)
            r5 = 12
            r8.setPosition(r5)
            int r6 = r8.readUnsignedIntToInt()
            int r6 = r6 + (-1)
            int r7 = r8.readUnsignedIntToInt()
            int r11 = r8.readUnsignedIntToInt()
            if (r0 == 0) goto Lb8
            r0.setPosition(r5)
            int r12 = r0.readUnsignedIntToInt()
            goto Lb9
        Lb8:
            r12 = 0
        Lb9:
            r13 = -1
            if (r9 == 0) goto Lce
            r9.setPosition(r5)
            int r5 = r9.readUnsignedIntToInt()
            if (r5 <= 0) goto Lcc
            int r14 = r9.readUnsignedIntToInt()
            int r14 = r14 + (-1)
            goto Ld0
        Lcc:
            r9 = 0
            goto Lcf
        Lce:
            r5 = 0
        Lcf:
            r14 = -1
        Ld0:
            int r15 = r4.getFixedSampleSize()
            r36 = r7
            com.google.android.exoplayer2.Format r7 = r1.format
            java.lang.String r7 = r7.sampleMimeType
            if (r15 == r13) goto Lfc
            java.lang.String r13 = "audio/raw"
            boolean r13 = r13.equals(r7)
            if (r13 != 0) goto Lf4
            java.lang.String r13 = "audio/g711-mlaw"
            boolean r13 = r13.equals(r7)
            if (r13 != 0) goto Lf4
            java.lang.String r13 = "audio/g711-alaw"
            boolean r7 = r13.equals(r7)
            if (r7 == 0) goto Lfc
        Lf4:
            if (r6 != 0) goto Lfc
            if (r12 != 0) goto Lfc
            if (r5 != 0) goto Lfc
            r7 = 1
            goto Lfd
        Lfc:
            r7 = 0
        Lfd:
            if (r7 == 0) goto L132
            int r0 = r10.length
            long[] r4 = new long[r0]
            int[] r0 = new int[r0]
        L105:
            boolean r5 = r10.moveNext()
            if (r5 == 0) goto L116
            int r5 = r10.index
            long r6 = r10.offset
            r4[r5] = r6
            int r6 = r10.numSamples
            r0[r5] = r6
            goto L105
        L116:
            long r5 = (long) r11
            com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker$Results r0 = com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker.rechunk(r15, r4, r0, r5)
            long[] r4 = r0.offsets
            int[] r5 = r0.sizes
            int r6 = r0.maximumSize
            long[] r7 = r0.timestamps
            int[] r8 = r0.flags
            long r9 = r0.duration
            r14 = r1
            r0 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r15 = r7
            r12 = r8
        L12e:
            r16 = r9
            goto L29b
        L132:
            long[] r7 = new long[r3]
            int[] r13 = new int[r3]
            long[] r15 = new long[r3]
            r16 = r5
            int[] r5 = new int[r3]
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r17 = r8
            r2 = r14
            r1 = 0
            r8 = 0
            r26 = 0
            r27 = 0
            r14 = r11
            r34 = r12
            r12 = r36
            r36 = r6
            r6 = r16
            r16 = r34
        L15e:
            java.lang.String r11 = "AtomParsers"
            if (r1 >= r3) goto L217
            r18 = 1
        L164:
            if (r20 != 0) goto L17d
            boolean r18 = r10.moveNext()
            if (r18 == 0) goto L17d
            r21 = r2
            r19 = r3
            long r2 = r10.offset
            r24 = r2
            int r2 = r10.numSamples
            r20 = r2
            r3 = r19
            r2 = r21
            goto L164
        L17d:
            r21 = r2
            r19 = r3
            if (r18 != 0) goto L19b
            java.lang.String r2 = "Unexpected end of chunk data"
            com.google.android.exoplayer2.util.Log.w(r11, r2)
            long[] r7 = java.util.Arrays.copyOf(r7, r1)
            int[] r13 = java.util.Arrays.copyOf(r13, r1)
            long[] r15 = java.util.Arrays.copyOf(r15, r1)
            int[] r5 = java.util.Arrays.copyOf(r5, r1)
            r3 = r1
            goto L219
        L19b:
            if (r0 == 0) goto L1ae
        L19d:
            if (r27 != 0) goto L1ac
            if (r16 <= 0) goto L1ac
            int r27 = r0.readUnsignedIntToInt()
            int r26 = r0.readInt()
            int r16 = r16 + (-1)
            goto L19d
        L1ac:
            int r27 = r27 + (-1)
        L1ae:
            r2 = r26
            r7[r1] = r24
            int r3 = r4.readNextSampleSize()
            r13[r1] = r3
            r3 = r13[r1]
            if (r3 <= r8) goto L1bf
            r3 = r13[r1]
            r8 = r3
        L1bf:
            r18 = r4
            long r3 = (long) r2
            long r3 = r22 + r3
            r15[r1] = r3
            if (r9 != 0) goto L1ca
            r3 = 1
            goto L1cb
        L1ca:
            r3 = 0
        L1cb:
            r5[r1] = r3
            r3 = r21
            if (r1 != r3) goto L1e3
            r4 = 1
            r5[r1] = r4
            int r6 = r6 + (-1)
            if (r6 <= 0) goto L1e3
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)
            com.google.android.exoplayer2.util.ParsableByteArray r3 = (com.google.android.exoplayer2.util.ParsableByteArray) r3
            int r3 = r3.readUnsignedIntToInt()
            int r3 = r3 - r4
        L1e3:
            r4 = r2
            r11 = r3
            long r2 = (long) r14
            long r22 = r22 + r2
            int r12 = r12 + (-1)
            if (r12 != 0) goto L1fa
            if (r36 <= 0) goto L1fa
            int r2 = r17.readUnsignedIntToInt()
            int r3 = r17.readInt()
            int r12 = r36 + (-1)
            r14 = r3
            goto L1fd
        L1fa:
            r2 = r12
            r12 = r36
        L1fd:
            r3 = r13[r1]
            r36 = r2
            long r2 = (long) r3
            long r24 = r24 + r2
            int r20 = r20 + (-1)
            int r1 = r1 + 1
            r26 = r4
            r2 = r11
            r4 = r18
            r3 = r19
            r34 = r12
            r12 = r36
            r36 = r34
            goto L15e
        L217:
            r19 = r3
        L219:
            r1 = r20
            r4 = r26
            long r9 = (long) r4
            long r9 = r22 + r9
            if (r0 == 0) goto L232
        L222:
            if (r16 <= 0) goto L232
            int r2 = r0.readUnsignedIntToInt()
            if (r2 == 0) goto L22c
            r0 = 0
            goto L233
        L22c:
            r0.readInt()
            int r16 = r16 + (-1)
            goto L222
        L232:
            r0 = 1
        L233:
            if (r6 != 0) goto L247
            if (r12 != 0) goto L247
            if (r1 != 0) goto L247
            if (r36 != 0) goto L247
            r2 = r27
            if (r2 != 0) goto L249
            if (r0 != 0) goto L242
            goto L249
        L242:
            r14 = r35
            r16 = r3
            goto L293
        L247:
            r2 = r27
        L249:
            java.lang.String r4 = "Inconsistent stbl box for track "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            r14 = r35
            r16 = r3
            int r3 = r14.id
            r4.append(r3)
            java.lang.String r3 = ": remainingSynchronizationSamples "
            r4.append(r3)
            r4.append(r6)
            java.lang.String r3 = ", remainingSamplesAtTimestampDelta "
            r4.append(r3)
            r4.append(r12)
            java.lang.String r3 = ", remainingSamplesInChunk "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r4.append(r1)
            r6 = r36
            r4.append(r6)
            java.lang.String r1 = ", remainingSamplesAtTimestampOffset "
            r4.append(r1)
            r4.append(r2)
            if (r0 != 0) goto L287
            java.lang.String r0 = ", ctts invalid"
            goto L289
        L287:
            java.lang.String r0 = ""
        L289:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.google.android.exoplayer2.util.Log.w(r11, r0)
        L293:
            r12 = r5
            r2 = r7
            r4 = r8
            r3 = r13
            r0 = r16
            goto L12e
        L29b:
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r14.timescale
            r5 = r16
            long r7 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r5, r7, r9)
            long[] r1 = r14.editListDurations
            r5 = 1000000(0xf4240, double:4.940656E-318)
            if (r1 != 0) goto L2bd
            long r0 = r14.timescale
            com.google.android.exoplayer2.util.Util.scaleLargeTimestampsInPlace(r15, r5, r0)
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r9 = new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable
            r0 = r9
            r1 = r35
            r5 = r15
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L2bd:
            int r1 = r1.length
            r5 = 1
            if (r1 != r5) goto L353
            int r1 = r14.type
            if (r1 != r5) goto L353
            int r1 = r15.length
            r5 = 2
            if (r1 < r5) goto L353
            long[] r1 = r14.editListMediaTimes
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            long[] r1 = (long[]) r1
            r5 = 0
            r18 = r1[r5]
            long[] r1 = r14.editListDurations
            r6 = r1[r5]
            long r8 = r14.timescale
            long r10 = r14.movieTimescale
            long r5 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r6, r8, r10)
            long r20 = r18 + r5
            r5 = r15
            r6 = r16
            r8 = r18
            r10 = r20
            boolean r1 = canApplyEditWithGaplessInfo(r5, r6, r8, r10)
            if (r1 == 0) goto L353
            long r5 = r16 - r20
            r1 = 0
            r7 = r15[r1]
            long r20 = r18 - r7
            com.google.android.exoplayer2.Format r1 = r14.format
            int r1 = r1.sampleRate
            long r7 = (long) r1
            long r9 = r14.timescale
            r22 = r7
            r24 = r9
            long r9 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r20, r22, r24)
            com.google.android.exoplayer2.Format r1 = r14.format
            int r1 = r1.sampleRate
            long r7 = (long) r1
            r18 = r9
            long r9 = r14.timescale
            r11 = r0
            r0 = r18
            long r5 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r5, r7, r9)
            r7 = 0
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 != 0) goto L31f
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L354
        L31f:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 > 0) goto L354
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L354
            int r1 = (int) r0
            r0 = r37
            r0.encoderDelay = r1
            int r1 = (int) r5
            r0.encoderPadding = r1
            long r0 = r14.timescale
            r5 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.exoplayer2.util.Util.scaleLargeTimestampsInPlace(r15, r5, r0)
            long[] r0 = r14.editListDurations
            r1 = 0
            r5 = r0[r1]
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r14.movieTimescale
            long r7 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r5, r7, r9)
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r9 = new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable
            r0 = r9
            r1 = r35
            r5 = r15
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L353:
            r11 = r0
        L354:
            long[] r0 = r14.editListDurations
            int r1 = r0.length
            r5 = 1
            if (r1 != r5) goto L39d
            r1 = 0
            r5 = r0[r1]
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L39d
            long[] r0 = r14.editListMediaTimes
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            long[] r0 = (long[]) r0
            r5 = r0[r1]
            r0 = 0
        L36e:
            int r1 = r15.length
            if (r0 >= r1) goto L385
            r7 = r15[r0]
            long r18 = r7 - r5
            r20 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r14.timescale
            r22 = r7
            long r7 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r18, r20, r22)
            r15[r0] = r7
            int r0 = r0 + 1
            goto L36e
        L385:
            long r18 = r16 - r5
            r20 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.timescale
            r22 = r0
            long r7 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r18, r20, r22)
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r9 = new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable
            r0 = r9
            r1 = r35
            r5 = r15
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L39d:
            int r1 = r14.type
            r5 = 1
            if (r1 != r5) goto L3a4
            r1 = 1
            goto L3a5
        L3a4:
            r1 = 0
        L3a5:
            int r5 = r0.length
            int[] r5 = new int[r5]
            int r0 = r0.length
            int[] r0 = new int[r0]
            long[] r6 = r14.editListMediaTimes
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            long[] r6 = (long[]) r6
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L3b7:
            long[] r13 = r14.editListDurations
            r36 = r4
            int r4 = r13.length
            if (r7 >= r4) goto L424
            r16 = r3
            r3 = r6[r7]
            r17 = -1
            int r19 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r19 == 0) goto L417
            r20 = r13[r7]
            r17 = r10
            r13 = r11
            long r10 = r14.timescale
            r37 = r8
            r18 = r9
            long r8 = r14.movieTimescale
            r22 = r10
            r24 = r8
            long r8 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r20, r22, r24)
            r10 = 1
            int r11 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r15, r3, r10, r10)
            r5[r7] = r11
            long r3 = r3 + r8
            r8 = 0
            int r3 = com.google.android.exoplayer2.util.Util.binarySearchCeil(r15, r3, r1, r8)
            r0[r7] = r3
        L3ec:
            r3 = r5[r7]
            r4 = r0[r7]
            if (r3 >= r4) goto L3ff
            r3 = r5[r7]
            r3 = r12[r3]
            r3 = r3 & r10
            if (r3 != 0) goto L3ff
            r3 = r5[r7]
            int r3 = r3 + r10
            r5[r7] = r3
            goto L3ec
        L3ff:
            r3 = r0[r7]
            r4 = r5[r7]
            int r3 = r3 - r4
            int r3 = r3 + r18
            r4 = r5[r7]
            r10 = r17
            if (r10 == r4) goto L40e
            r4 = 1
            goto L40f
        L40e:
            r4 = 0
        L40f:
            r4 = r37 | r4
            r8 = r0[r7]
            r9 = r3
            r10 = r8
            r8 = r4
            goto L41c
        L417:
            r37 = r8
            r18 = r9
            r13 = r11
        L41c:
            int r7 = r7 + 1
            r4 = r36
            r11 = r13
            r3 = r16
            goto L3b7
        L424:
            r16 = r3
            r37 = r8
            r18 = r9
            r13 = r11
            r1 = 0
            r3 = 1
            r4 = r13
            if (r9 == r4) goto L431
            goto L432
        L431:
            r3 = 0
        L432:
            r3 = r37 | r3
            if (r3 == 0) goto L439
            long[] r4 = new long[r9]
            goto L43a
        L439:
            r4 = r2
        L43a:
            if (r3 == 0) goto L43f
            int[] r6 = new int[r9]
            goto L441
        L43f:
            r6 = r16
        L441:
            if (r3 == 0) goto L445
            r7 = 0
            goto L447
        L445:
            r7 = r36
        L447:
            if (r3 == 0) goto L44c
            int[] r8 = new int[r9]
            goto L44d
        L44c:
            r8 = r12
        L44d:
            long[] r9 = new long[r9]
            r10 = 0
            r13 = 0
            r36 = r7
        L454:
            long[] r7 = r14.editListDurations
            int r7 = r7.length
            if (r1 >= r7) goto L4e5
            long[] r7 = r14.editListMediaTimes
            r23 = r7[r1]
            r7 = r5[r1]
            r25 = r5
            r5 = r0[r1]
            if (r3 == 0) goto L477
            r26 = r0
            int r0 = r5 - r7
            java.lang.System.arraycopy(r2, r7, r4, r13, r0)
            r27 = r2
            r2 = r16
            java.lang.System.arraycopy(r2, r7, r6, r13, r0)
            java.lang.System.arraycopy(r12, r7, r8, r13, r0)
            goto L47d
        L477:
            r26 = r0
            r27 = r2
            r2 = r16
        L47d:
            r0 = r36
        L47f:
            if (r7 >= r5) goto L4c7
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r16 = r4
            r37 = r5
            long r4 = r14.movieTimescale
            r17 = r10
            r21 = r4
            long r4 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r17, r19, r21)
            r17 = r15[r7]
            r19 = r10
            long r10 = r17 - r23
            r17 = r1
            r18 = r2
            r1 = 0
            long r28 = java.lang.Math.max(r1, r10)
            r30 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r14.timescale
            r32 = r1
            long r1 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r28, r30, r32)
            long r4 = r4 + r1
            r9[r13] = r4
            if (r3 == 0) goto L4b8
            r1 = r6[r13]
            if (r1 <= r0) goto L4b8
            r0 = r18[r7]
        L4b8:
            int r13 = r13 + 1
            int r7 = r7 + 1
            r5 = r37
            r4 = r16
            r1 = r17
            r2 = r18
            r10 = r19
            goto L47f
        L4c7:
            r17 = r1
            r18 = r2
            r16 = r4
            r19 = r10
            long[] r1 = r14.editListDurations
            r4 = r1[r17]
            long r10 = r19 + r4
            int r1 = r17 + 1
            r36 = r0
            r4 = r16
            r16 = r18
            r5 = r25
            r0 = r26
            r2 = r27
            goto L454
        L4e5:
            r16 = r4
            r19 = r10
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r14.movieTimescale
            r17 = r19
            r19 = r0
            r21 = r2
            long r10 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r17, r19, r21)
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r12 = new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable
            r0 = r12
            r1 = r35
            r2 = r16
            r3 = r6
            r4 = r36
            r5 = r9
            r6 = r8
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r12
        L509:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r1)
            throw r0
    }

    private static com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData parseStsd(com.google.android.exoplayer2.util.ParsableByteArray r18, int r19, int r20, java.lang.String r21, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r22, boolean r23) throws com.google.android.exoplayer2.ParserException {
            r10 = r18
            r11 = r19
            r0 = 12
            r10.setPosition(r0)
            int r12 = r18.readInt()
            com.google.android.exoplayer2.extractor.mp4.AtomParsers$StsdData r13 = new com.google.android.exoplayer2.extractor.mp4.AtomParsers$StsdData
            r13.<init>(r12)
            r14 = 0
            r15 = 0
        L14:
            if (r15 >= r12) goto L17b
            int r9 = r18.getPosition()
            int r16 = r18.readInt()
            if (r16 <= 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            java.lang.String r1 = "childAtomSize must be positive"
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r0, r1)
            int r1 = r18.readInt()
            r0 = 1635148593(0x61766331, float:2.840654E20)
            if (r1 == r0) goto L15f
            r0 = 1635148595(0x61766333, float:2.8406544E20)
            if (r1 == r0) goto L15f
            r0 = 1701733238(0x656e6376, float:7.035987E22)
            if (r1 == r0) goto L15f
            r0 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r1 == r0) goto L15f
            r0 = 1836070006(0x6d703476, float:4.646239E27)
            if (r1 == r0) goto L15f
            r0 = 1752589105(0x68766331, float:4.6541277E24)
            if (r1 == r0) goto L15f
            r0 = 1751479857(0x68657631, float:4.3344087E24)
            if (r1 == r0) goto L15f
            r0 = 1932670515(0x73323633, float:1.4119387E31)
            if (r1 == r0) goto L15f
            r0 = 1211250227(0x48323633, float:182488.8)
            if (r1 == r0) goto L15f
            r0 = 1987063864(0x76703038, float:1.21789965E33)
            if (r1 == r0) goto L15f
            r0 = 1987063865(0x76703039, float:1.2178997E33)
            if (r1 == r0) goto L15f
            r0 = 1635135537(0x61763031, float:2.8383572E20)
            if (r1 == r0) goto L15f
            r0 = 1685479798(0x64766176, float:1.8179687E22)
            if (r1 == r0) goto L15f
            r0 = 1685479729(0x64766131, float:1.817961E22)
            if (r1 == r0) goto L15f
            r0 = 1685481573(0x64766865, float:1.8181686E22)
            if (r1 == r0) goto L15f
            r0 = 1685481521(0x64766831, float:1.8181627E22)
            if (r1 != r0) goto L7e
            goto L15f
        L7e:
            r0 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r1 == r0) goto L14a
            r0 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r1 == r0) goto L14a
            r0 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r1 == r0) goto L14a
            r0 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r1 == r0) goto L14a
            r0 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r1 == r0) goto L14a
            r0 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r1 == r0) goto L14a
            r0 = 1685353315(0x64747363, float:1.803728E22)
            if (r1 == r0) goto L14a
            r0 = 1685353317(0x64747365, float:1.8037282E22)
            if (r1 == r0) goto L14a
            r0 = 1685353320(0x64747368, float:1.8037286E22)
            if (r1 == r0) goto L14a
            r0 = 1685353324(0x6474736c, float:1.803729E22)
            if (r1 == r0) goto L14a
            r0 = 1685353336(0x64747378, float:1.8037304E22)
            if (r1 == r0) goto L14a
            r0 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r1 == r0) goto L14a
            r0 = 1935767394(0x73617762, float:1.7863284E31)
            if (r1 == r0) goto L14a
            r0 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r1 == r0) goto L14a
            r0 = 1936684916(0x736f7774, float:1.89725E31)
            if (r1 == r0) goto L14a
            r0 = 1953984371(0x74776f73, float:7.841539E31)
            if (r1 == r0) goto L14a
            r0 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r1 == r0) goto L14a
            r0 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r1 == r0) goto L14a
            r0 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r1 == r0) goto L14a
            r0 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r1 == r0) goto L14a
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r1 == r0) goto L14a
            r0 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r1 == r0) goto L14a
            r0 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r1 == r0) goto L14a
            r0 = 1332770163(0x4f707573, float:4.034229E9)
            if (r1 == r0) goto L14a
            r0 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r1 != r0) goto Lfc
            goto L14a
        Lfc:
            r0 = 1414810956(0x54544d4c, float:3.6473196E12)
            if (r1 == r0) goto L13a
            r0 = 1954034535(0x74783367, float:7.865797E31)
            if (r1 == r0) goto L13a
            r0 = 2004251764(0x77767474, float:4.998699E33)
            if (r1 == r0) goto L13a
            r0 = 1937010800(0x73747070, float:1.9366469E31)
            if (r1 == r0) goto L13a
            r0 = 1664495672(0x63363038, float:3.360782E21)
            if (r1 != r0) goto L116
            goto L13a
        L116:
            r0 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r1 != r0) goto L11f
            parseMetaDataSampleEntry(r10, r1, r9, r11, r13)
            goto L147
        L11f:
            r0 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r1 != r0) goto L147
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            com.google.android.exoplayer2.Format$Builder r0 = r0.setId(r11)
            java.lang.String r1 = "application/x-camera-motion"
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r1)
            com.google.android.exoplayer2.Format r0 = r0.build()
            r13.format = r0
            goto L147
        L13a:
            r0 = r18
            r2 = r9
            r3 = r16
            r4 = r19
            r5 = r21
            r6 = r13
            parseTextSampleEntry(r0, r1, r2, r3, r4, r5, r6)
        L147:
            r17 = r9
            goto L172
        L14a:
            r0 = r18
            r2 = r9
            r3 = r16
            r4 = r19
            r5 = r21
            r6 = r23
            r7 = r22
            r8 = r13
            r17 = r9
            r9 = r15
            parseAudioSampleEntry(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L172
        L15f:
            r17 = r9
            r0 = r18
            r2 = r17
            r3 = r16
            r4 = r19
            r5 = r20
            r6 = r22
            r7 = r13
            r8 = r15
            parseVideoSampleEntry(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        L172:
            int r9 = r17 + r16
            r10.setPosition(r9)
            int r15 = r15 + 1
            goto L14
        L17b:
            return r13
    }

    private static void parseTextSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray r4, int r5, int r6, int r7, int r8, java.lang.String r9, com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData r10) {
            int r6 = r6 + 8
            int r6 = r6 + 8
            r4.setPosition(r6)
            java.lang.String r6 = "application/ttml+xml"
            r0 = 0
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 1414810956(0x54544d4c, float:3.6473196E12)
            if (r5 != r3) goto L15
            goto L45
        L15:
            r3 = 1954034535(0x74783367, float:7.865797E31)
            if (r5 != r3) goto L2b
            int r7 = r7 + (-8)
            int r7 = r7 + (-8)
            byte[] r5 = new byte[r7]
            r6 = 0
            r4.readBytes(r5, r6, r7)
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r5)
            java.lang.String r6 = "application/x-quicktime-tx3g"
            goto L45
        L2b:
            r4 = 2004251764(0x77767474, float:4.998699E33)
            if (r5 != r4) goto L33
            java.lang.String r6 = "application/x-mp4-vtt"
            goto L45
        L33:
            r4 = 1937010800(0x73747070, float:1.9366469E31)
            if (r5 != r4) goto L3b
            r1 = 0
            goto L45
        L3b:
            r4 = 1664495672(0x63363038, float:3.360782E21)
            if (r5 != r4) goto L65
            r4 = 1
            r10.requiredSampleTransformation = r4
            java.lang.String r6 = "application/x-mp4-cea-608"
        L45:
            com.google.android.exoplayer2.Format$Builder r4 = new com.google.android.exoplayer2.Format$Builder
            r4.<init>()
            com.google.android.exoplayer2.Format$Builder r4 = r4.setId(r8)
            com.google.android.exoplayer2.Format$Builder r4 = r4.setSampleMimeType(r6)
            com.google.android.exoplayer2.Format$Builder r4 = r4.setLanguage(r9)
            com.google.android.exoplayer2.Format$Builder r4 = r4.setSubsampleOffsetUs(r1)
            com.google.android.exoplayer2.Format$Builder r4 = r4.setInitializationData(r0)
            com.google.android.exoplayer2.Format r4 = r4.build()
            r10.format = r4
            return
        L65:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
    }

    private static com.google.android.exoplayer2.extractor.mp4.AtomParsers.TkhdData parseTkhd(com.google.android.exoplayer2.util.ParsableByteArray r11) {
            r0 = 8
            r11.setPosition(r0)
            int r1 = r11.readInt()
            int r1 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(r1)
            r2 = 16
            if (r1 != 0) goto L14
            r3 = 8
            goto L16
        L14:
            r3 = 16
        L16:
            r11.skipBytes(r3)
            int r3 = r11.readInt()
            r4 = 4
            r11.skipBytes(r4)
            int r5 = r11.getPosition()
            if (r1 != 0) goto L28
            r0 = 4
        L28:
            r6 = 0
            r7 = 0
        L2a:
            if (r7 >= r0) goto L3c
            byte[] r8 = r11.getData()
            int r9 = r5 + r7
            r8 = r8[r9]
            r9 = -1
            if (r8 == r9) goto L39
            r5 = 0
            goto L3d
        L39:
            int r7 = r7 + 1
            goto L2a
        L3c:
            r5 = 1
        L3d:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == 0) goto L48
            r11.skipBytes(r0)
            goto L5b
        L48:
            if (r1 != 0) goto L4f
            long r0 = r11.readUnsignedInt()
            goto L53
        L4f:
            long r0 = r11.readUnsignedLongToLong()
        L53:
            r9 = 0
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 != 0) goto L5a
            goto L5b
        L5a:
            r7 = r0
        L5b:
            r11.skipBytes(r2)
            int r0 = r11.readInt()
            int r1 = r11.readInt()
            r11.skipBytes(r4)
            int r2 = r11.readInt()
            int r11 = r11.readInt()
            r4 = 65536(0x10000, float:9.1835E-41)
            r5 = -65536(0xffffffffffff0000, float:NaN)
            if (r0 != 0) goto L80
            if (r1 != r4) goto L80
            if (r2 != r5) goto L80
            if (r11 != 0) goto L80
            r6 = 90
            goto L95
        L80:
            if (r0 != 0) goto L8b
            if (r1 != r5) goto L8b
            if (r2 != r4) goto L8b
            if (r11 != 0) goto L8b
            r6 = 270(0x10e, float:3.78E-43)
            goto L95
        L8b:
            if (r0 != r5) goto L95
            if (r1 != 0) goto L95
            if (r2 != 0) goto L95
            if (r11 != r5) goto L95
            r6 = 180(0xb4, float:2.52E-43)
        L95:
            com.google.android.exoplayer2.extractor.mp4.AtomParsers$TkhdData r11 = new com.google.android.exoplayer2.extractor.mp4.AtomParsers$TkhdData
            r11.<init>(r3, r7, r6)
            return r11
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.extractor.mp4.Track parseTrak(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r18, com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom r19, long r20, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r22, boolean r23, boolean r24) throws com.google.android.exoplayer2.ParserException {
            r0 = r18
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r1 = r0.getContainerAtomOfType(r1)
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r1 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r1
            r2 = 1751411826(0x68646c72, float:4.3148E24)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r2 = r1.getLeafAtomOfType(r2)
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r2 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r2
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r2.data
            int r2 = parseHdlr(r2)
            int r5 = getTrackTypeForHdlr(r2)
            r2 = 0
            r3 = -1
            if (r5 != r3) goto L2b
            return r2
        L2b:
            r3 = 1953196132(0x746b6864, float:7.46037E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r3 = r0.getLeafAtomOfType(r3)
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r3 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r3
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r3.data
            com.google.android.exoplayer2.extractor.mp4.AtomParsers$TkhdData r3 = parseTkhd(r3)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r4 != 0) goto L4f
            long r8 = com.google.android.exoplayer2.extractor.mp4.AtomParsers.TkhdData.access$000(r3)
            r4 = r19
            r10 = r8
            goto L53
        L4f:
            r4 = r19
            r10 = r20
        L53:
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r4.data
            long r8 = parseMvhd(r4)
            int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r4 != 0) goto L5e
            goto L66
        L5e:
            r12 = 1000000(0xf4240, double:4.940656E-318)
            r14 = r8
            long r6 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r10, r12, r14)
        L66:
            r10 = r6
            r4 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r4 = r1.getContainerAtomOfType(r4)
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r4 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r4
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r4 = r4.getContainerAtomOfType(r6)
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r4 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r4
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r1 = r1.getLeafAtomOfType(r6)
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r1 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r1
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r1.data
            android.util.Pair r1 = parseMdhd(r1)
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r4 = r4.getLeafAtomOfType(r6)
            if (r4 == 0) goto Lf7
            com.google.android.exoplayer2.util.ParsableByteArray r12 = r4.data
            int r13 = com.google.android.exoplayer2.extractor.mp4.AtomParsers.TkhdData.access$100(r3)
            int r14 = com.google.android.exoplayer2.extractor.mp4.AtomParsers.TkhdData.access$200(r3)
            java.lang.Object r4 = r1.second
            r15 = r4
            java.lang.String r15 = (java.lang.String) r15
            r16 = r22
            r17 = r24
            com.google.android.exoplayer2.extractor.mp4.AtomParsers$StsdData r4 = parseStsd(r12, r13, r14, r15, r16, r17)
            if (r23 != 0) goto Ld2
            r6 = 1701082227(0x65647473, float:6.742798E22)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r0 = r0.getContainerAtomOfType(r6)
            if (r0 == 0) goto Ld2
            android.util.Pair r0 = parseEdts(r0)
            if (r0 == 0) goto Ld2
            java.lang.Object r6 = r0.first
            long[] r6 = (long[]) r6
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
            r17 = r0
            r16 = r6
            goto Ld6
        Ld2:
            r16 = r2
            r17 = r16
        Ld6:
            com.google.android.exoplayer2.Format r0 = r4.format
            if (r0 != 0) goto Ldb
            goto Lf6
        Ldb:
            com.google.android.exoplayer2.extractor.mp4.Track r2 = new com.google.android.exoplayer2.extractor.mp4.Track
            int r0 = com.google.android.exoplayer2.extractor.mp4.AtomParsers.TkhdData.access$100(r3)
            java.lang.Object r1 = r1.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r6 = r1.longValue()
            com.google.android.exoplayer2.Format r12 = r4.format
            int r13 = r4.requiredSampleTransformation
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox[] r14 = r4.trackEncryptionBoxes
            int r15 = r4.nalUnitLengthFieldLength
            r3 = r2
            r4 = r0
            r3.<init>(r4, r5, r6, r8, r10, r12, r13, r14, r15, r16, r17)
        Lf6:
            return r2
        Lf7:
            java.lang.String r0 = "Malformed sample table (stbl) missing sample description (stsd)"
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r2)
            throw r0
    }

    public static java.util.List<com.google.android.exoplayer2.extractor.mp4.TrackSampleTable> parseTraks(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r11, com.google.android.exoplayer2.extractor.GaplessInfoHolder r12, long r13, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r15, boolean r16, boolean r17, com.google.common.base.Function<com.google.android.exoplayer2.extractor.mp4.Track, com.google.android.exoplayer2.extractor.mp4.Track> r18) throws com.google.android.exoplayer2.ParserException {
            r0 = r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L7:
            java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r3 = r0.containerChildren
            int r3 = r3.size()
            if (r2 >= r3) goto L79
            java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r3 = r0.containerChildren
            java.lang.Object r3 = r3.get(r2)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r3 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r3
            int r4 = r3.type
            r5 = 1953653099(0x7472616b, float:7.681346E31)
            if (r4 == r5) goto L22
            r6 = r12
            r5 = r18
            goto L76
        L22:
            r4 = 1836476516(0x6d766864, float:4.7662196E27)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r4 = r11.getLeafAtomOfType(r4)
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            r5 = r4
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r5 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r5
            r4 = r3
            r6 = r13
            r8 = r15
            r9 = r16
            r10 = r17
            com.google.android.exoplayer2.extractor.mp4.Track r4 = parseTrak(r4, r5, r6, r8, r9, r10)
            r5 = r18
            java.lang.Object r4 = r5.apply(r4)
            com.google.android.exoplayer2.extractor.mp4.Track r4 = (com.google.android.exoplayer2.extractor.mp4.Track) r4
            if (r4 != 0) goto L47
            r6 = r12
            goto L76
        L47:
            r6 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r3 = r3.getContainerAtomOfType(r6)
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r3 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r3
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r3 = r3.getContainerAtomOfType(r6)
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r3 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r3
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r3 = r3.getContainerAtomOfType(r6)
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r3 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r3
            r6 = r12
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r3 = parseStbl(r4, r3, r12)
            r1.add(r3)
        L76:
            int r2 = r2 + 1
            goto L7
        L79:
            return r1
    }

    public static android.util.Pair<com.google.android.exoplayer2.metadata.Metadata, com.google.android.exoplayer2.metadata.Metadata> parseUdta(com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom r7) {
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r7.data
            r0 = 8
            r7.setPosition(r0)
            r1 = 0
            r2 = r1
        L9:
            int r3 = r7.bytesLeft()
            if (r3 < r0) goto L3d
            int r3 = r7.getPosition()
            int r4 = r7.readInt()
            int r5 = r7.readInt()
            r6 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r5 != r6) goto L2a
            r7.setPosition(r3)
            int r1 = r3 + r4
            com.google.android.exoplayer2.metadata.Metadata r1 = parseUdtaMeta(r7, r1)
            goto L38
        L2a:
            r6 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r5 != r6) goto L38
            r7.setPosition(r3)
            int r2 = r3 + r4
            com.google.android.exoplayer2.metadata.Metadata r2 = parseSmta(r7, r2)
        L38:
            int r3 = r3 + r4
            r7.setPosition(r3)
            goto L9
        L3d:
            android.util.Pair r7 = android.util.Pair.create(r1, r2)
            return r7
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.Metadata parseUdtaMeta(com.google.android.exoplayer2.util.ParsableByteArray r4, int r5) {
            r0 = 8
            r4.skipBytes(r0)
            maybeSkipRemainingMetaAtomHeaderBytes(r4)
        L8:
            int r0 = r4.getPosition()
            if (r0 >= r5) goto L2d
            int r0 = r4.getPosition()
            int r1 = r4.readInt()
            int r2 = r4.readInt()
            r3 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r2 != r3) goto L28
            r4.setPosition(r0)
            int r0 = r0 + r1
            com.google.android.exoplayer2.metadata.Metadata r4 = parseIlst(r4, r0)
            return r4
        L28:
            int r0 = r0 + r1
            r4.setPosition(r0)
            goto L8
        L2d:
            r4 = 0
            return r4
    }

    private static void parseVideoSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray r32, int r33, int r34, int r35, int r36, int r37, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r38, com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData r39, int r40) throws com.google.android.exoplayer2.ParserException {
            r0 = r32
            r1 = r34
            r2 = r35
            r3 = r38
            r4 = r39
            int r5 = r1 + 8
            int r5 = r5 + 8
            r0.setPosition(r5)
            r5 = 16
            r0.skipBytes(r5)
            int r5 = r32.readUnsignedShort()
            int r6 = r32.readUnsignedShort()
            r7 = 50
            r0.skipBytes(r7)
            int r7 = r32.getPosition()
            r8 = 1701733238(0x656e6376, float:7.035987E22)
            r9 = r33
            if (r9 != r8) goto L55
            android.util.Pair r8 = parseSampleEntryEncryptionData(r0, r1, r2)
            if (r8 == 0) goto L52
            java.lang.Object r9 = r8.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r3 != 0) goto L40
            r3 = 0
            goto L4a
        L40:
            java.lang.Object r10 = r8.second
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r10 = (com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) r10
            java.lang.String r10 = r10.schemeType
            com.google.android.exoplayer2.drm.DrmInitData r3 = r3.copyWithSchemeType(r10)
        L4a:
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox[] r10 = r4.trackEncryptionBoxes
            java.lang.Object r8 = r8.second
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r8 = (com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) r8
            r10[r40] = r8
        L52:
            r0.setPosition(r7)
        L55:
            r8 = 1831958048(0x6d317620, float:3.4326032E27)
            java.lang.String r10 = "video/3gpp"
            if (r9 != r8) goto L61
            java.lang.String r8 = "video/mpeg"
            goto L69
        L61:
            r8 = 1211250227(0x48323633, float:182488.8)
            if (r9 != r8) goto L68
            r8 = r10
            goto L69
        L68:
            r8 = 0
        L69:
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = -1
            r16 = -1
            r17 = -1
            r18 = -1
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r3
            r33 = r10
            r17 = r13
            r3 = -1
            r10 = -1
            r13 = -1
            r18 = -1
        L86:
            int r15 = r7 - r1
            if (r15 >= r2) goto L37f
            r0.setPosition(r7)
            int r15 = r32.getPosition()
            r38 = r14
            int r14 = r32.readInt()
            if (r14 != 0) goto Lab
            int r22 = r32.getPosition()
            r40 = r11
            int r11 = r22 - r1
            if (r11 != r2) goto Lad
            r24 = r5
            r23 = r6
            r25 = r12
            goto L389
        Lab:
            r40 = r11
        Lad:
            if (r14 <= 0) goto Lb1
            r11 = 1
            goto Lb2
        Lb1:
            r11 = 0
        Lb2:
            java.lang.String r1 = "childAtomSize must be positive"
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r11, r1)
            int r1 = r32.readInt()
            r11 = 1635148611(0x61766343, float:2.8406573E20)
            if (r1 != r11) goto Lec
            r1 = 0
            if (r8 != 0) goto Lc5
            r8 = 1
            goto Lc6
        Lc5:
            r8 = 0
        Lc6:
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r8, r1)
            int r15 = r15 + 8
            r0.setPosition(r15)
            com.google.android.exoplayer2.video.AvcConfig r1 = com.google.android.exoplayer2.video.AvcConfig.parse(r32)
            java.util.List<byte[]> r8 = r1.initializationData
            int r11 = r1.nalUnitLengthFieldLength
            r4.nalUnitLengthFieldLength = r11
            if (r21 != 0) goto Ldd
            float r11 = r1.pixelWidthHeightRatio
            goto Ldf
        Ldd:
            r11 = r40
        Ldf:
            java.lang.String r1 = r1.codecs
            java.lang.String r12 = "video/avc"
            r31 = r12
            r12 = r1
            r1 = r13
            r13 = r8
            r8 = r31
            goto L11b
        Lec:
            r11 = 1752589123(0x68766343, float:4.6541328E24)
            if (r1 != r11) goto L125
            r1 = 0
            if (r8 != 0) goto Lf6
            r3 = 1
            goto Lf7
        Lf6:
            r3 = 0
        Lf7:
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r3, r1)
            int r15 = r15 + 8
            r0.setPosition(r15)
            com.google.android.exoplayer2.video.HevcConfig r1 = com.google.android.exoplayer2.video.HevcConfig.parse(r32)
            java.util.List<byte[]> r13 = r1.initializationData
            int r3 = r1.nalUnitLengthFieldLength
            r4.nalUnitLengthFieldLength = r3
            if (r21 != 0) goto L10e
            float r11 = r1.pixelWidthHeightRatio
            goto L110
        L10e:
            r11 = r40
        L110:
            java.lang.String r12 = r1.codecs
            int r10 = r1.colorSpace
            int r3 = r1.colorRange
            int r1 = r1.colorTransfer
            java.lang.String r8 = "video/hevc"
        L11b:
            r24 = r5
            r23 = r6
            r30 = r7
            r22 = r9
            goto L232
        L125:
            r11 = 1685480259(0x64766343, float:1.8180206E22)
            if (r1 == r11) goto L345
            r11 = 1685485123(0x64767643, float:1.8185683E22)
            if (r1 != r11) goto L131
            goto L345
        L131:
            r11 = 1987076931(0x76706343, float:1.21891066E33)
            r2 = 2
            if (r1 != r11) goto L180
            if (r8 != 0) goto L13b
            r1 = 1
            goto L13c
        L13b:
            r1 = 0
        L13c:
            r3 = 0
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r1, r3)
            r1 = 1987063864(0x76703038, float:1.21789965E33)
            if (r9 != r1) goto L149
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            goto L14c
        L149:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
        L14c:
            int r15 = r15 + 12
            r0.setPosition(r15)
            r0.skipBytes(r2)
            int r2 = r32.readUnsignedByte()
            r2 = r2 & 1
            if (r2 == 0) goto L15e
            r2 = 1
            goto L15f
        L15e:
            r2 = 0
        L15f:
            int r3 = r32.readUnsignedByte()
            int r8 = r32.readUnsignedByte()
            int r3 = com.google.android.exoplayer2.video.ColorInfo.isoColorPrimariesToColorSpace(r3)
            if (r2 == 0) goto L16f
            r2 = 1
            goto L170
        L16f:
            r2 = 2
        L170:
            int r8 = com.google.android.exoplayer2.video.ColorInfo.isoTransferCharacteristicsToColorTransfer(r8)
            r11 = r40
            r10 = r3
            r13 = r17
            r3 = r2
            r31 = r8
            r8 = r1
            r1 = r31
            goto L11b
        L180:
            r11 = 1635135811(0x61763143, float:2.8384055E20)
            if (r1 != r11) goto L195
            r1 = 0
            if (r8 != 0) goto L18a
            r2 = 1
            goto L18b
        L18a:
            r2 = 0
        L18b:
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r2, r1)
            java.lang.String r1 = "video/av01"
            r11 = r40
            r8 = r1
            goto L1b9
        L195:
            r11 = 1668050025(0x636c6c69, float:4.3612434E21)
            if (r1 != r11) goto L1be
            if (r19 != 0) goto L1a0
            java.nio.ByteBuffer r19 = allocateHdrStaticInfo()
        L1a0:
            r1 = r19
            r2 = 21
            r1.position(r2)
            short r2 = r32.readShort()
            r1.putShort(r2)
            short r2 = r32.readShort()
            r1.putShort(r2)
            r11 = r40
            r19 = r1
        L1b9:
            r1 = r13
            r13 = r17
            goto L11b
        L1be:
            r11 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r1 != r11) goto L239
            if (r19 != 0) goto L1c9
            java.nio.ByteBuffer r19 = allocateHdrStaticInfo()
        L1c9:
            r1 = r19
            short r2 = r32.readShort()
            short r11 = r32.readShort()
            short r15 = r32.readShort()
            r22 = r9
            short r9 = r32.readShort()
            short r4 = r32.readShort()
            r23 = r6
            short r6 = r32.readShort()
            r24 = r5
            short r5 = r32.readShort()
            r25 = r12
            short r12 = r32.readShort()
            long r26 = r32.readUnsignedInt()
            long r28 = r32.readUnsignedInt()
            r30 = r7
            r7 = 1
            r1.position(r7)
            r1.putShort(r4)
            r1.putShort(r6)
            r1.putShort(r2)
            r1.putShort(r11)
            r1.putShort(r15)
            r1.putShort(r9)
            r1.putShort(r5)
            r1.putShort(r12)
            r4 = 10000(0x2710, double:4.9407E-320)
            long r6 = r26 / r4
            int r2 = (int) r6
            short r2 = (short) r2
            r1.putShort(r2)
            long r4 = r28 / r4
            int r2 = (int) r4
            short r2 = (short) r2
            r1.putShort(r2)
            r11 = r40
            r19 = r1
            r1 = r13
            r13 = r17
            r12 = r25
        L232:
            r4 = r38
            r17 = r13
            r13 = r1
            goto L36e
        L239:
            r24 = r5
            r23 = r6
            r30 = r7
            r22 = r9
            r25 = r12
            r4 = 1681012275(0x64323633, float:1.3149704E22)
            if (r1 != r4) goto L25b
            r1 = 0
            if (r8 != 0) goto L24d
            r2 = 1
            goto L24e
        L24d:
            r2 = 0
        L24e:
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r2, r1)
            r8 = r33
        L253:
            r1 = r38
        L255:
            r15 = r18
            r12 = r25
            goto L361
        L25b:
            r4 = 0
            r5 = 1702061171(0x65736473, float:7.183675E22)
            if (r1 != r5) goto L288
            if (r8 != 0) goto L265
            r1 = 1
            goto L266
        L265:
            r1 = 0
        L266:
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r1, r4)
            com.google.android.exoplayer2.extractor.mp4.AtomParsers$EsdsData r20 = parseEsdsFromParent(r0, r15)
            java.lang.String r1 = com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData.access$300(r20)
            byte[] r2 = com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData.access$400(r20)
            if (r2 == 0) goto L27d
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r2)
            r17 = r2
        L27d:
            r4 = r38
            r2 = r13
            r13 = r17
            r15 = r18
            r12 = r25
            goto L366
        L288:
            r4 = 1885434736(0x70617370, float:2.7909473E29)
            if (r1 != r4) goto L29b
            float r1 = parsePaspFromParent(r0, r15)
            r2 = 1
            r4 = r38
            r11 = r1
            r12 = r25
            r21 = 1
            goto L36e
        L29b:
            r4 = 1937126244(0x73763364, float:1.9506033E31)
            if (r1 != r4) goto L2a5
            byte[] r1 = parseProjFromParent(r0, r15, r14)
            goto L255
        L2a5:
            r4 = 1936995172(0x73743364, float:1.9347576E31)
            if (r1 != r4) goto L2e2
            int r1 = r32.readUnsignedByte()
            r4 = 3
            r0.skipBytes(r4)
            if (r1 != 0) goto L253
            int r1 = r32.readUnsignedByte()
            if (r1 == 0) goto L2da
            r5 = 1
            if (r1 == r5) goto L2d2
            if (r1 == r2) goto L2ca
            if (r1 == r4) goto L2c2
            goto L253
        L2c2:
            r1 = 3
            r1 = r38
            r12 = r25
            r15 = 3
            goto L361
        L2ca:
            r1 = 2
            r1 = r38
            r12 = r25
            r15 = 2
            goto L361
        L2d2:
            r1 = 1
            r1 = r38
            r12 = r25
            r15 = 1
            goto L361
        L2da:
            r1 = 0
            r1 = r38
            r12 = r25
            r15 = 0
            goto L361
        L2e2:
            r4 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r1 != r4) goto L35b
            r1 = -1
            if (r10 != r1) goto L35b
            if (r3 != r1) goto L35b
            if (r13 != r1) goto L35b
            int r1 = r32.readInt()
            r4 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r1 == r4) goto L314
            r4 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r1 != r4) goto L2fd
            goto L314
        L2fd:
            java.lang.String r2 = "Unsupported color type: "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r1 = com.google.android.exoplayer2.extractor.mp4.Atom.getAtomTypeString(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "AtomParsers"
            com.google.android.exoplayer2.util.Log.w(r2, r1)
            goto L35b
        L314:
            int r1 = r32.readUnsignedShort()
            int r3 = r32.readUnsignedShort()
            r0.skipBytes(r2)
            r2 = 19
            if (r14 != r2) goto L32d
            int r2 = r32.readUnsignedByte()
            r2 = r2 & 128(0x80, float:1.8E-43)
            if (r2 == 0) goto L32d
            r2 = 1
            goto L32e
        L32d:
            r2 = 0
        L32e:
            int r1 = com.google.android.exoplayer2.video.ColorInfo.isoColorPrimariesToColorSpace(r1)
            if (r2 == 0) goto L336
            r2 = 1
            goto L337
        L336:
            r2 = 2
        L337:
            int r3 = com.google.android.exoplayer2.video.ColorInfo.isoTransferCharacteristicsToColorTransfer(r3)
            r10 = r1
            r13 = r3
            r15 = r18
            r12 = r25
            r1 = r38
            r3 = r2
            goto L361
        L345:
            r24 = r5
            r23 = r6
            r30 = r7
            r22 = r9
            r25 = r12
            com.google.android.exoplayer2.video.DolbyVisionConfig r1 = com.google.android.exoplayer2.video.DolbyVisionConfig.parse(r32)
            if (r1 == 0) goto L35b
            java.lang.String r12 = r1.codecs
            java.lang.String r8 = "video/dolby-vision"
            goto L35d
        L35b:
            r12 = r25
        L35d:
            r1 = r38
            r15 = r18
        L361:
            r4 = r1
            r1 = r8
            r2 = r13
            r13 = r17
        L366:
            r11 = r40
            r8 = r1
            r17 = r13
            r18 = r15
            r13 = r2
        L36e:
            int r7 = r30 + r14
            r1 = r34
            r2 = r35
            r14 = r4
            r9 = r22
            r6 = r23
            r5 = r24
            r4 = r39
            goto L86
        L37f:
            r24 = r5
            r23 = r6
            r40 = r11
            r25 = r12
            r38 = r14
        L389:
            r0 = 0
            if (r8 != 0) goto L38d
            return
        L38d:
            com.google.android.exoplayer2.Format$Builder r1 = new com.google.android.exoplayer2.Format$Builder
            r1.<init>()
            r2 = r36
            com.google.android.exoplayer2.Format$Builder r1 = r1.setId(r2)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleMimeType(r8)
            r12 = r25
            com.google.android.exoplayer2.Format$Builder r1 = r1.setCodecs(r12)
            r2 = r24
            com.google.android.exoplayer2.Format$Builder r1 = r1.setWidth(r2)
            r2 = r23
            com.google.android.exoplayer2.Format$Builder r1 = r1.setHeight(r2)
            r11 = r40
            com.google.android.exoplayer2.Format$Builder r1 = r1.setPixelWidthHeightRatio(r11)
            r2 = r37
            com.google.android.exoplayer2.Format$Builder r1 = r1.setRotationDegrees(r2)
            r14 = r38
            com.google.android.exoplayer2.Format$Builder r1 = r1.setProjectionData(r14)
            r15 = r18
            com.google.android.exoplayer2.Format$Builder r1 = r1.setStereoMode(r15)
            r2 = r17
            com.google.android.exoplayer2.Format$Builder r1 = r1.setInitializationData(r2)
            r2 = r16
            com.google.android.exoplayer2.Format$Builder r1 = r1.setDrmInitData(r2)
            r2 = -1
            if (r10 != r2) goto L3db
            if (r3 != r2) goto L3db
            if (r13 != r2) goto L3db
            if (r19 == 0) goto L3e9
        L3db:
            com.google.android.exoplayer2.video.ColorInfo r2 = new com.google.android.exoplayer2.video.ColorInfo
            if (r19 == 0) goto L3e3
            byte[] r0 = r19.array()
        L3e3:
            r2.<init>(r10, r3, r13, r0)
            r1.setColorInfo(r2)
        L3e9:
            if (r20 == 0) goto L402
            long r2 = com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData.access$600(r20)
            int r0 = com.google.common.primitives.Ints.saturatedCast(r2)
            com.google.android.exoplayer2.Format$Builder r0 = r1.setAverageBitrate(r0)
            long r2 = com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData.access$500(r20)
            int r2 = com.google.common.primitives.Ints.saturatedCast(r2)
            r0.setPeakBitrate(r2)
        L402:
            com.google.android.exoplayer2.Format r0 = r1.build()
            r1 = r39
            r1.format = r0
            return
    }
}
