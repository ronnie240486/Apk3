package com.google.android.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes2.dex */
public final class Mp4Extractor implements com.google.android.exoplayer2.extractor.Extractor, com.google.android.exoplayer2.extractor.SeekMap {
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory FACTORY = null;
    private static final int FILE_TYPE_HEIC = 2;
    private static final int FILE_TYPE_MP4 = 0;
    private static final int FILE_TYPE_QUICKTIME = 1;
    public static final int FLAG_READ_MOTION_PHOTO_METADATA = 2;
    public static final int FLAG_READ_SEF_DATA = 4;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 1;
    private static final long MAXIMUM_READ_AHEAD_BYTES_STREAM = 10485760;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private static final int STATE_READING_SEF = 3;
    private long[][] accumulatedSampleSizes;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.util.ParsableByteArray atomData;
    private final com.google.android.exoplayer2.util.ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private final java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom> containerAtoms;
    private long durationUs;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private int fileType;
    private int firstVideoTrackIndex;
    private final int flags;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata motionPhotoMetadata;
    private final com.google.android.exoplayer2.util.ParsableByteArray nalLength;
    private final com.google.android.exoplayer2.util.ParsableByteArray nalStartCode;
    private int parserState;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleTrackIndex;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch;
    private final com.google.android.exoplayer2.extractor.mp4.SefReader sefReader;
    private final java.util.List<com.google.android.exoplayer2.metadata.Metadata.Entry> slowMotionMetadataEntries;
    private com.google.android.exoplayer2.extractor.mp4.Mp4Extractor.Mp4Track[] tracks;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class Mp4Track {
        public int sampleIndex;
        public final com.google.android.exoplayer2.extractor.mp4.TrackSampleTable sampleTable;
        public final com.google.android.exoplayer2.extractor.mp4.Track track;
        public final com.google.android.exoplayer2.extractor.TrackOutput trackOutput;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.extractor.TrueHdSampleRechunker trueHdSampleRechunker;

        public Mp4Track(com.google.android.exoplayer2.extractor.mp4.Track r1, com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r2, com.google.android.exoplayer2.extractor.TrackOutput r3) {
                r0 = this;
                r0.<init>()
                r0.track = r1
                r0.sampleTable = r2
                r0.trackOutput = r3
                com.google.android.exoplayer2.Format r1 = r1.format
                java.lang.String r1 = r1.sampleMimeType
                java.lang.String r2 = "audio/true-hd"
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L1b
                com.google.android.exoplayer2.extractor.TrueHdSampleRechunker r1 = new com.google.android.exoplayer2.extractor.TrueHdSampleRechunker
                r1.<init>()
                goto L1c
            L1b:
                r1 = 0
            L1c:
                r0.trueHdSampleRechunker = r1
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$IP-_bKEryH3151zsYMHu9R1OlAQ, reason: not valid java name */
    public static /* synthetic */ com.google.android.exoplayer2.extractor.mp4.Track m224$r8$lambda$IP_bKEryH3151zsYMHu9R1OlAQ(com.google.android.exoplayer2.extractor.mp4.Track r0) {
            com.google.android.exoplayer2.extractor.mp4.Track r0 = lambda$processMoovAtom$1(r0)
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] $r8$lambda$zxba_Jp1gvw4wckCw1roj6rXQ6M() {
            com.google.android.exoplayer2.extractor.Extractor[] r0 = lambda$static$0()
            return r0
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$7
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor.FACTORY = r0
            return
    }

    public Mp4Extractor() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public Mp4Extractor(int r4) {
            r3 = this;
            r3.<init>()
            r3.flags = r4
            r0 = 4
            r4 = r4 & r0
            r1 = 0
            if (r4 == 0) goto Lc
            r4 = 3
            goto Ld
        Lc:
            r4 = 0
        Ld:
            r3.parserState = r4
            com.google.android.exoplayer2.extractor.mp4.SefReader r4 = new com.google.android.exoplayer2.extractor.mp4.SefReader
            r4.<init>()
            r3.sefReader = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.slowMotionMetadataEntries = r4
            com.google.android.exoplayer2.util.ParsableByteArray r4 = new com.google.android.exoplayer2.util.ParsableByteArray
            r2 = 16
            r4.<init>(r2)
            r3.atomHeader = r4
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            r3.containerAtoms = r4
            com.google.android.exoplayer2.util.ParsableByteArray r4 = new com.google.android.exoplayer2.util.ParsableByteArray
            byte[] r2 = com.google.android.exoplayer2.util.NalUnitUtil.NAL_START_CODE
            r4.<init>(r2)
            r3.nalStartCode = r4
            com.google.android.exoplayer2.util.ParsableByteArray r4 = new com.google.android.exoplayer2.util.ParsableByteArray
            r4.<init>(r0)
            r3.nalLength = r4
            com.google.android.exoplayer2.util.ParsableByteArray r4 = new com.google.android.exoplayer2.util.ParsableByteArray
            r4.<init>()
            r3.scratch = r4
            r4 = -1
            r3.sampleTrackIndex = r4
            com.google.android.exoplayer2.extractor.ExtractorOutput r4 = com.google.android.exoplayer2.extractor.ExtractorOutput.PLACEHOLDER
            r3.extractorOutput = r4
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor$Mp4Track[] r4 = new com.google.android.exoplayer2.extractor.mp4.Mp4Extractor.Mp4Track[r1]
            r3.tracks = r4
            return
    }

    private static int brandToFileType(int r1) {
            r0 = 1751476579(0x68656963, float:4.333464E24)
            if (r1 == r0) goto Le
            r0 = 1903435808(0x71742020, float:1.2088509E30)
            if (r1 == r0) goto Lc
            r1 = 0
            return r1
        Lc:
            r1 = 1
            return r1
        Le:
            r1 = 2
            return r1
    }

    private static long[][] calculateAccumulatedSampleSizes(com.google.android.exoplayer2.extractor.mp4.Mp4Extractor.Mp4Track[] r15) {
            int r0 = r15.length
            long[][] r0 = new long[r0][]
            int r1 = r15.length
            int[] r1 = new int[r1]
            int r2 = r15.length
            long[] r2 = new long[r2]
            int r3 = r15.length
            boolean[] r3 = new boolean[r3]
            r4 = 0
            r5 = 0
        Le:
            int r6 = r15.length
            if (r5 >= r6) goto L28
            r6 = r15[r5]
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r6 = r6.sampleTable
            int r6 = r6.sampleCount
            long[] r6 = new long[r6]
            r0[r5] = r6
            r6 = r15[r5]
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r6 = r6.sampleTable
            long[] r6 = r6.timestampsUs
            r7 = r6[r4]
            r2[r5] = r7
            int r5 = r5 + 1
            goto Le
        L28:
            r5 = 0
            r7 = 0
        L2b:
            int r8 = r15.length
            if (r7 >= r8) goto L71
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = -1
            r11 = 0
        L35:
            int r12 = r15.length
            if (r11 >= r12) goto L48
            boolean r12 = r3[r11]
            if (r12 != 0) goto L45
            r12 = r2[r11]
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 > 0) goto L45
            r8 = r2[r11]
            r10 = r11
        L45:
            int r11 = r11 + 1
            goto L35
        L48:
            r8 = r1[r10]
            r9 = r0[r10]
            r9[r8] = r5
            r9 = r15[r10]
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r9 = r9.sampleTable
            int[] r9 = r9.sizes
            r9 = r9[r8]
            long r11 = (long) r9
            long r5 = r5 + r11
            r9 = 1
            int r8 = r8 + r9
            r1[r10] = r8
            r11 = r0[r10]
            int r11 = r11.length
            if (r8 >= r11) goto L6c
            r9 = r15[r10]
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r9 = r9.sampleTable
            long[] r9 = r9.timestampsUs
            r8 = r9[r8]
            r2[r10] = r8
            goto L2b
        L6c:
            r3[r10] = r9
            int r7 = r7 + 1
            goto L2b
        L71:
            return r0
    }

    private void enterReadingAtomHeaderState() {
            r1 = this;
            r0 = 0
            r1.parserState = r0
            r1.atomHeaderBytesRead = r0
            return
    }

    private static int getSynchronizationSampleIndex(com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r2, long r3) {
            int r0 = r2.getIndexOfEarlierOrEqualSynchronizationSample(r3)
            r1 = -1
            if (r0 != r1) goto Lb
            int r0 = r2.getIndexOfLaterOrEqualSynchronizationSample(r3)
        Lb:
            return r0
    }

    private int getTrackIndexOfNextReadSample(long r21) {
            r20 = this;
            r0 = r20
            r2 = -1
            r6 = -1
            r7 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 1
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = 1
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor$Mp4Track[] r1 = r0.tracks
            int r3 = r1.length
            if (r7 >= r3) goto L63
            r1 = r1[r7]
            int r3 = r1.sampleIndex
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r1 = r1.sampleTable
            int r4 = r1.sampleCount
            if (r3 != r4) goto L26
            goto L60
        L26:
            long[] r1 = r1.offsets
            r4 = r1[r3]
            long[][] r1 = r0.accumulatedSampleSizes
            java.lang.Object r1 = com.google.android.exoplayer2.util.Util.castNonNull(r1)
            long[][] r1 = (long[][]) r1
            r1 = r1[r7]
            r16 = r1[r3]
            long r4 = r4 - r21
            r18 = 0
            int r1 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r1 < 0) goto L48
            r18 = 262144(0x40000, double:1.295163E-318)
            int r1 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r1 < 0) goto L46
            goto L48
        L46:
            r1 = 0
            goto L49
        L48:
            r1 = 1
        L49:
            if (r1 != 0) goto L4d
            if (r13 != 0) goto L53
        L4d:
            if (r1 != r13) goto L58
            int r3 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r3 >= 0) goto L58
        L53:
            r13 = r1
            r14 = r4
            r6 = r7
            r11 = r16
        L58:
            int r3 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r3 >= 0) goto L60
            r10 = r1
            r2 = r7
            r8 = r16
        L60:
            int r7 = r7 + 1
            goto L16
        L63:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 == 0) goto L76
            if (r10 == 0) goto L76
            r3 = 10485760(0xa00000, double:5.180654E-317)
            long r8 = r8 + r3
            int r1 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r1 >= 0) goto L77
        L76:
            r2 = r6
        L77:
            return r2
    }

    private static /* synthetic */ com.google.android.exoplayer2.extractor.mp4.Track lambda$processMoovAtom$1(com.google.android.exoplayer2.extractor.mp4.Track r0) {
            return r0
    }

    private static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
            r0 = 1
            com.google.android.exoplayer2.extractor.Extractor[] r0 = new com.google.android.exoplayer2.extractor.Extractor[r0]
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor r1 = new com.google.android.exoplayer2.extractor.mp4.Mp4Extractor
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            return r0
    }

    private static long maybeAdjustSeekOffset(com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r0, long r1, long r3) {
            int r1 = getSynchronizationSampleIndex(r0, r1)
            r2 = -1
            if (r1 != r2) goto L8
            return r3
        L8:
            long[] r0 = r0.offsets
            r1 = r0[r1]
            long r0 = java.lang.Math.min(r1, r3)
            return r0
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
            r3 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            r1 = 8
            r0.reset(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            byte[] r0 = r0.getData()
            r2 = 0
            r4.peekFully(r0, r2, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            com.google.android.exoplayer2.extractor.mp4.AtomParsers.maybeSkipRemainingMetaAtomHeaderBytes(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            int r0 = r0.getPosition()
            r4.skipFully(r0)
            r4.resetPeekPosition()
            return
    }

    private void processAtomEnded(long r5) throws com.google.android.exoplayer2.ParserException {
            r4 = this;
        L0:
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r4.containerAtoms
            boolean r0 = r0.isEmpty()
            r1 = 2
            if (r0 != 0) goto L45
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r4.containerAtoms
            java.lang.Object r0 = r0.peek()
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r0 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r0
            long r2 = r0.endPosition
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L45
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r4.containerAtoms
            java.lang.Object r0 = r0.pop()
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r0 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r0
            int r2 = r0.type
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 != r3) goto L31
            r4.processMoovAtom(r0)
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r4.containerAtoms
            r0.clear()
            r4.parserState = r1
            goto L0
        L31:
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r1 = r4.containerAtoms
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L0
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r1 = r4.containerAtoms
            java.lang.Object r1 = r1.peek()
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r1 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r1
            r1.add(r0)
            goto L0
        L45:
            int r5 = r4.parserState
            if (r5 == r1) goto L4c
            r4.enterReadingAtomHeaderState()
        L4c:
            return
    }

    private void processEndOfStreamReadingAtomHeader() {
            r5 = this;
            int r0 = r5.fileType
            r1 = 2
            if (r0 != r1) goto L47
            int r0 = r5.flags
            r0 = r0 & r1
            if (r0 == 0) goto L47
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r5.extractorOutput
            r1 = 4
            r2 = 0
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r0.track(r2, r1)
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r1 = r5.motionPhotoMetadata
            if (r1 != 0) goto L18
            r1 = 0
            goto L23
        L18:
            com.google.android.exoplayer2.metadata.Metadata r3 = new com.google.android.exoplayer2.metadata.Metadata
            r4 = 1
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r4 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r4]
            r4[r2] = r1
            r3.<init>(r4)
            r1 = r3
        L23:
            com.google.android.exoplayer2.Format$Builder r2 = new com.google.android.exoplayer2.Format$Builder
            r2.<init>()
            com.google.android.exoplayer2.Format$Builder r1 = r2.setMetadata(r1)
            com.google.android.exoplayer2.Format r1 = r1.build()
            r0.format(r1)
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r5.extractorOutput
            r0.endTracks()
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r5.extractorOutput
            com.google.android.exoplayer2.extractor.SeekMap$Unseekable r1 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r2)
            r0.seekMap(r1)
        L47:
            return
    }

    private static int processFtypAtom(com.google.android.exoplayer2.util.ParsableByteArray r1) {
            r0 = 8
            r1.setPosition(r0)
            int r0 = r1.readInt()
            int r0 = brandToFileType(r0)
            if (r0 == 0) goto L10
            return r0
        L10:
            r0 = 4
            r1.skipBytes(r0)
        L14:
            int r0 = r1.bytesLeft()
            if (r0 <= 0) goto L25
            int r0 = r1.readInt()
            int r0 = brandToFileType(r0)
            if (r0 == 0) goto L14
            return r0
        L25:
            r1 = 0
            return r1
    }

    private void processMoovAtom(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r26) throws com.google.android.exoplayer2.ParserException {
            r25 = this;
            r0 = r25
            r1 = r26
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r2 = r0.fileType
            r11 = 1
            if (r2 != r11) goto L10
            r7 = 1
            goto L11
        L10:
            r7 = 0
        L11:
            com.google.android.exoplayer2.extractor.GaplessInfoHolder r12 = new com.google.android.exoplayer2.extractor.GaplessInfoHolder
            r12.<init>()
            r2 = 1969517665(0x75647461, float:2.8960062E32)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r2 = r1.getLeafAtomOfType(r2)
            if (r2 == 0) goto L33
            android.util.Pair r2 = com.google.android.exoplayer2.extractor.mp4.AtomParsers.parseUdta(r2)
            java.lang.Object r3 = r2.first
            com.google.android.exoplayer2.metadata.Metadata r3 = (com.google.android.exoplayer2.metadata.Metadata) r3
            java.lang.Object r2 = r2.second
            com.google.android.exoplayer2.metadata.Metadata r2 = (com.google.android.exoplayer2.metadata.Metadata) r2
            if (r3 == 0) goto L30
            r12.setFromMetadata(r3)
        L30:
            r14 = r2
            r15 = r3
            goto L35
        L33:
            r14 = 0
            r15 = 0
        L35:
            r2 = 1835365473(0x6d657461, float:4.4382975E27)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r2 = r1.getContainerAtomOfType(r2)
            if (r2 == 0) goto L44
            com.google.android.exoplayer2.metadata.Metadata r2 = com.google.android.exoplayer2.extractor.mp4.AtomParsers.parseMdtaFromMeta(r2)
            r8 = r2
            goto L45
        L44:
            r8 = 0
        L45:
            int r2 = r0.flags
            r2 = r2 & r11
            if (r2 == 0) goto L4c
            r6 = 1
            goto L4d
        L4c:
            r6 = 0
        L4d:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda0 r16 = com.google.android.exoplayer2.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda0.INSTANCE
            r1 = r26
            r2 = r12
            r13 = r8
            r8 = r16
            java.util.List r1 = com.google.android.exoplayer2.extractor.mp4.AtomParsers.parseTraks(r1, r2, r3, r5, r6, r7, r8)
            int r2 = r1.size()
            r10 = r3
            r6 = 0
            r7 = -1
        L66:
            if (r6 >= r2) goto L122
            java.lang.Object r17 = r1.get(r6)
            r8 = r17
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r8 = (com.google.android.exoplayer2.extractor.mp4.TrackSampleTable) r8
            int r5 = r8.sampleCount
            if (r5 != 0) goto L7c
            r18 = r1
            r19 = r2
            r1 = -1
            r8 = 1
            goto L115
        L7c:
            com.google.android.exoplayer2.extractor.mp4.Track r5 = r8.track
            r18 = r1
            r19 = r2
            long r1 = r5.durationUs
            int r20 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r20 == 0) goto L89
            goto L8b
        L89:
            long r1 = r8.durationUs
        L8b:
            long r10 = java.lang.Math.max(r10, r1)
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor$Mp4Track r3 = new com.google.android.exoplayer2.extractor.mp4.Mp4Extractor$Mp4Track
            com.google.android.exoplayer2.extractor.ExtractorOutput r4 = r0.extractorOutput
            r21 = r10
            int r10 = r5.type
            com.google.android.exoplayer2.extractor.TrackOutput r4 = r4.track(r6, r10)
            r3.<init>(r5, r8, r4)
            com.google.android.exoplayer2.Format r4 = r5.format
            java.lang.String r4 = r4.sampleMimeType
            java.lang.String r10 = "audio/true-hd"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto Laf
            int r4 = r8.maximumSize
            int r4 = r4 * 16
            goto Lb3
        Laf:
            int r4 = r8.maximumSize
            int r4 = r4 + 30
        Lb3:
            com.google.android.exoplayer2.Format r10 = r5.format
            com.google.android.exoplayer2.Format$Builder r10 = r10.buildUpon()
            r10.setMaxInputSize(r4)
            int r4 = r5.type
            r11 = 2
            if (r4 != r11) goto Ld6
            r23 = 0
            int r4 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r4 <= 0) goto Ld6
            int r4 = r8.sampleCount
            r8 = 1
            if (r4 <= r8) goto Ld6
            float r4 = (float) r4
            float r1 = (float) r1
            r2 = 1232348160(0x49742400, float:1000000.0)
            float r1 = r1 / r2
            float r4 = r4 / r1
            r10.setFrameRate(r4)
        Ld6:
            int r1 = r5.type
            com.google.android.exoplayer2.extractor.mp4.MetadataUtil.setFormatGaplessInfo(r1, r12, r10)
            int r1 = r5.type
            com.google.android.exoplayer2.metadata.Metadata[] r2 = new com.google.android.exoplayer2.metadata.Metadata[r11]
            r4 = 0
            r2[r4] = r14
            java.util.List<com.google.android.exoplayer2.metadata.Metadata$Entry> r4 = r0.slowMotionMetadataEntries
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto Lec
            r4 = 0
            goto Lf3
        Lec:
            com.google.android.exoplayer2.metadata.Metadata r4 = new com.google.android.exoplayer2.metadata.Metadata
            java.util.List<com.google.android.exoplayer2.metadata.Metadata$Entry> r8 = r0.slowMotionMetadataEntries
            r4.<init>(r8)
        Lf3:
            r8 = 1
            r2[r8] = r4
            com.google.android.exoplayer2.extractor.mp4.MetadataUtil.setFormatMetadata(r1, r15, r13, r10, r2)
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r3.trackOutput
            com.google.android.exoplayer2.Format r2 = r10.build()
            r1.format(r2)
            int r1 = r5.type
            if (r1 != r11) goto L10f
            r1 = -1
            if (r7 != r1) goto L110
            int r2 = r9.size()
            r7 = r2
            goto L110
        L10f:
            r1 = -1
        L110:
            r9.add(r3)
            r10 = r21
        L115:
            int r6 = r6 + 1
            r1 = r18
            r2 = r19
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L66
        L122:
            r0.firstVideoTrackIndex = r7
            r0.durationUs = r10
            r1 = 0
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor$Mp4Track[] r1 = new com.google.android.exoplayer2.extractor.mp4.Mp4Extractor.Mp4Track[r1]
            java.lang.Object[] r1 = r9.toArray(r1)
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor$Mp4Track[] r1 = (com.google.android.exoplayer2.extractor.mp4.Mp4Extractor.Mp4Track[]) r1
            r0.tracks = r1
            long[][] r1 = calculateAccumulatedSampleSizes(r1)
            r0.accumulatedSampleSizes = r1
            com.google.android.exoplayer2.extractor.ExtractorOutput r1 = r0.extractorOutput
            r1.endTracks()
            com.google.android.exoplayer2.extractor.ExtractorOutput r1 = r0.extractorOutput
            r1.seekMap(r0)
            return
    }

    private void processUnparsedAtom(long r14) {
            r13 = this;
            int r0 = r13.atomType
            r1 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r0 != r1) goto L21
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r0 = new com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata
            r3 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = r13.atomHeaderBytesRead
            long r5 = (long) r1
            long r9 = r14 + r5
            long r5 = r13.atomSize
            long r1 = (long) r1
            long r11 = r5 - r1
            r2 = r0
            r5 = r14
            r2.<init>(r3, r5, r7, r9, r11)
            r13.motionPhotoMetadata = r0
        L21:
            return
    }

    private boolean readAtomHeader(com.google.android.exoplayer2.extractor.ExtractorInput r9) throws java.io.IOException {
            r8 = this;
            int r0 = r8.atomHeaderBytesRead
            r1 = 1
            r2 = 8
            r3 = 0
            if (r0 != 0) goto L2f
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r8.atomHeader
            byte[] r0 = r0.getData()
            boolean r0 = r9.readFully(r0, r3, r2, r1)
            if (r0 != 0) goto L18
            r8.processEndOfStreamReadingAtomHeader()
            return r3
        L18:
            r8.atomHeaderBytesRead = r2
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r8.atomHeader
            r0.setPosition(r3)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r8.atomHeader
            long r4 = r0.readUnsignedInt()
            r8.atomSize = r4
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r8.atomHeader
            int r0 = r0.readInt()
            r8.atomType = r0
        L2f:
            long r4 = r8.atomSize
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4e
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r8.atomHeader
            byte[] r0 = r0.getData()
            r9.readFully(r0, r2, r2)
            int r0 = r8.atomHeaderBytesRead
            int r0 = r0 + r2
            r8.atomHeaderBytesRead = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r8.atomHeader
            long r4 = r0.readUnsignedLongToLong()
            r8.atomSize = r4
            goto L79
        L4e:
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L79
            long r4 = r9.getLength()
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L6a
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r8.containerAtoms
            java.lang.Object r0 = r0.peek()
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r0 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r0
            if (r0 == 0) goto L6a
            long r4 = r0.endPosition
        L6a:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L79
            long r6 = r9.getPosition()
            long r4 = r4 - r6
            int r0 = r8.atomHeaderBytesRead
            long r6 = (long) r0
            long r4 = r4 + r6
            r8.atomSize = r4
        L79:
            long r4 = r8.atomSize
            int r0 = r8.atomHeaderBytesRead
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L10d
            int r0 = r8.atomType
            boolean r0 = shouldParseContainerAtom(r0)
            if (r0 == 0) goto Lc1
            long r2 = r9.getPosition()
            long r4 = r8.atomSize
            long r2 = r2 + r4
            int r0 = r8.atomHeaderBytesRead
            long r6 = (long) r0
            long r2 = r2 - r6
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto La4
            int r0 = r8.atomType
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r0 != r4) goto La4
            r8.maybeSkipRemainingMetaAtomHeaderBytes(r9)
        La4:
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r9 = r8.containerAtoms
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r0 = new com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom
            int r4 = r8.atomType
            r0.<init>(r4, r2)
            r9.push(r0)
            long r4 = r8.atomSize
            int r9 = r8.atomHeaderBytesRead
            long r6 = (long) r9
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto Lbd
            r8.processAtomEnded(r2)
            goto L10c
        Lbd:
            r8.enterReadingAtomHeaderState()
            goto L10c
        Lc1:
            int r0 = r8.atomType
            boolean r0 = shouldParseLeafAtom(r0)
            if (r0 == 0) goto Lfc
            int r9 = r8.atomHeaderBytesRead
            if (r9 != r2) goto Lcf
            r9 = 1
            goto Ld0
        Lcf:
            r9 = 0
        Ld0:
            com.google.android.exoplayer2.util.Assertions.checkState(r9)
            long r4 = r8.atomSize
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto Lde
            r9 = 1
            goto Ldf
        Lde:
            r9 = 0
        Ldf:
            com.google.android.exoplayer2.util.Assertions.checkState(r9)
            com.google.android.exoplayer2.util.ParsableByteArray r9 = new com.google.android.exoplayer2.util.ParsableByteArray
            long r4 = r8.atomSize
            int r0 = (int) r4
            r9.<init>(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r8.atomHeader
            byte[] r0 = r0.getData()
            byte[] r4 = r9.getData()
            java.lang.System.arraycopy(r0, r3, r4, r3, r2)
            r8.atomData = r9
            r8.parserState = r1
            goto L10c
        Lfc:
            long r2 = r9.getPosition()
            int r9 = r8.atomHeaderBytesRead
            long r4 = (long) r9
            long r2 = r2 - r4
            r8.processUnparsedAtom(r2)
            r9 = 0
            r8.atomData = r9
            r8.parserState = r1
        L10c:
            return r1
        L10d:
            java.lang.String r9 = "Atom size less than header length (unsupported)."
            com.google.android.exoplayer2.ParserException r9 = com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature(r9)
            throw r9
    }

    private boolean readAtomPayload(com.google.android.exoplayer2.extractor.ExtractorInput r10, com.google.android.exoplayer2.extractor.PositionHolder r11) throws java.io.IOException {
            r9 = this;
            long r0 = r9.atomSize
            int r2 = r9.atomHeaderBytesRead
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r9.atomData
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L44
            byte[] r11 = r4.getData()
            int r7 = r9.atomHeaderBytesRead
            int r1 = (int) r0
            r10.readFully(r11, r7, r1)
            int r10 = r9.atomType
            r11 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r11) goto L29
            int r10 = processFtypAtom(r4)
            r9.fileType = r10
            goto L4f
        L29:
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r10 = r9.containerAtoms
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L4f
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r10 = r9.containerAtoms
            java.lang.Object r10 = r10.peek()
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r10 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r10
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r11 = new com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom
            int r0 = r9.atomType
            r11.<init>(r0, r4)
            r10.add(r11)
            goto L4f
        L44:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L51
            int r11 = (int) r0
            r10.skipFully(r11)
        L4f:
            r10 = 0
            goto L59
        L51:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.position = r7
            r10 = 1
        L59:
            r9.processAtomEnded(r2)
            if (r10 == 0) goto L64
            int r10 = r9.parserState
            r11 = 2
            if (r10 == r11) goto L64
            goto L65
        L64:
            r5 = 0
        L65:
            return r5
    }

    private int readSample(com.google.android.exoplayer2.extractor.ExtractorInput r19, com.google.android.exoplayer2.extractor.PositionHolder r20) throws java.io.IOException {
            r18 = this;
            r0 = r18
            r1 = r19
            long r2 = r19.getPosition()
            int r4 = r0.sampleTrackIndex
            r5 = -1
            if (r4 != r5) goto L16
            int r4 = r0.getTrackIndexOfNextReadSample(r2)
            r0.sampleTrackIndex = r4
            if (r4 != r5) goto L16
            return r5
        L16:
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor$Mp4Track[] r4 = r0.tracks
            int r6 = r0.sampleTrackIndex
            r4 = r4[r6]
            com.google.android.exoplayer2.extractor.TrackOutput r14 = r4.trackOutput
            int r15 = r4.sampleIndex
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r6 = r4.sampleTable
            long[] r7 = r6.offsets
            r8 = r7[r15]
            int[] r6 = r6.sizes
            r6 = r6[r15]
            com.google.android.exoplayer2.extractor.TrueHdSampleRechunker r13 = r4.trueHdSampleRechunker
            long r2 = r8 - r2
            int r7 = r0.sampleBytesRead
            long r10 = (long) r7
            long r2 = r2 + r10
            r10 = 0
            r12 = 1
            int r7 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r7 < 0) goto L143
            r10 = 262144(0x40000, double:1.295163E-318)
            int r7 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r7 < 0) goto L46
            r1 = r20
            r17 = 1
            goto L147
        L46:
            com.google.android.exoplayer2.extractor.mp4.Track r7 = r4.track
            int r7 = r7.sampleTransformation
            if (r7 != r12) goto L51
            r7 = 8
            long r2 = r2 + r7
            int r6 = r6 + (-8)
        L51:
            int r3 = (int) r2
            r1.skipFully(r3)
            com.google.android.exoplayer2.extractor.mp4.Track r2 = r4.track
            int r3 = r2.nalUnitLengthFieldLength
            r11 = 0
            r10 = 0
            if (r3 == 0) goto Lbc
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r0.nalLength
            byte[] r2 = r2.getData()
            r2[r10] = r10
            r2[r12] = r10
            r3 = 2
            r2[r3] = r10
            com.google.android.exoplayer2.extractor.mp4.Track r3 = r4.track
            int r3 = r3.nalUnitLengthFieldLength
            int r7 = 4 - r3
        L70:
            int r8 = r0.sampleBytesWritten
            if (r8 >= r6) goto Lfe
            int r8 = r0.sampleCurrentNalBytesRemaining
            if (r8 != 0) goto La8
            r1.readFully(r2, r7, r3)
            int r8 = r0.sampleBytesRead
            int r8 = r8 + r3
            r0.sampleBytesRead = r8
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r0.nalLength
            r8.setPosition(r10)
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r0.nalLength
            int r8 = r8.readInt()
            if (r8 < 0) goto La1
            r0.sampleCurrentNalBytesRemaining = r8
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r0.nalStartCode
            r8.setPosition(r10)
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r0.nalStartCode
            r9 = 4
            r14.sampleData(r8, r9)
            int r8 = r0.sampleBytesWritten
            int r8 = r8 + r9
            r0.sampleBytesWritten = r8
            int r6 = r6 + r7
            goto L70
        La1:
            java.lang.String r1 = "Invalid NAL length"
            com.google.android.exoplayer2.ParserException r1 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r1, r11)
            throw r1
        La8:
            int r8 = r14.sampleData(r1, r8, r10)
            int r9 = r0.sampleBytesRead
            int r9 = r9 + r8
            r0.sampleBytesRead = r9
            int r9 = r0.sampleBytesWritten
            int r9 = r9 + r8
            r0.sampleBytesWritten = r9
            int r9 = r0.sampleCurrentNalBytesRemaining
            int r9 = r9 - r8
            r0.sampleCurrentNalBytesRemaining = r9
            goto L70
        Lbc:
            com.google.android.exoplayer2.Format r2 = r2.format
            java.lang.String r2 = r2.sampleMimeType
            java.lang.String r3 = "audio/ac4"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Ldf
            int r2 = r0.sampleBytesWritten
            if (r2 != 0) goto Ldc
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r0.scratch
            com.google.android.exoplayer2.audio.Ac4Util.getAc4SampleHeader(r6, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r0.scratch
            r3 = 7
            r14.sampleData(r2, r3)
            int r2 = r0.sampleBytesWritten
            int r2 = r2 + r3
            r0.sampleBytesWritten = r2
        Ldc:
            int r6 = r6 + 7
            goto Le4
        Ldf:
            if (r13 == 0) goto Le4
            r13.startSample(r1)
        Le4:
            int r2 = r0.sampleBytesWritten
            if (r2 >= r6) goto Lfe
            int r2 = r6 - r2
            int r2 = r14.sampleData(r1, r2, r10)
            int r3 = r0.sampleBytesRead
            int r3 = r3 + r2
            r0.sampleBytesRead = r3
            int r3 = r0.sampleBytesWritten
            int r3 = r3 + r2
            r0.sampleBytesWritten = r3
            int r3 = r0.sampleCurrentNalBytesRemaining
            int r3 = r3 - r2
            r0.sampleCurrentNalBytesRemaining = r3
            goto Le4
        Lfe:
            r1 = r6
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r2 = r4.sampleTable
            long[] r3 = r2.timestampsUs
            r8 = r3[r15]
            int[] r2 = r2.flags
            r2 = r2[r15]
            if (r13 == 0) goto L128
            r3 = 0
            r16 = 0
            r6 = r13
            r7 = r14
            r10 = r2
            r2 = r11
            r11 = r1
            r17 = 1
            r12 = r3
            r1 = r13
            r13 = r16
            r6.sampleMetadata(r7, r8, r10, r11, r12, r13)
            int r15 = r15 + 1
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r3 = r4.sampleTable
            int r3 = r3.sampleCount
            if (r15 != r3) goto L133
            r1.outputPendingSampleMetadata(r14, r2)
            goto L133
        L128:
            r17 = 1
            r11 = 0
            r12 = 0
            r6 = r14
            r7 = r8
            r9 = r2
            r10 = r1
            r6.sampleMetadata(r7, r9, r10, r11, r12)
        L133:
            int r1 = r4.sampleIndex
            int r1 = r1 + 1
            r4.sampleIndex = r1
            r0.sampleTrackIndex = r5
            r1 = 0
            r0.sampleBytesRead = r1
            r0.sampleBytesWritten = r1
            r0.sampleCurrentNalBytesRemaining = r1
            return r1
        L143:
            r17 = 1
            r1 = r20
        L147:
            r1.position = r8
            return r17
    }

    private int readSefData(com.google.android.exoplayer2.extractor.ExtractorInput r5, com.google.android.exoplayer2.extractor.PositionHolder r6) throws java.io.IOException {
            r4 = this;
            com.google.android.exoplayer2.extractor.mp4.SefReader r0 = r4.sefReader
            java.util.List<com.google.android.exoplayer2.metadata.Metadata$Entry> r1 = r4.slowMotionMetadataEntries
            int r5 = r0.read(r5, r6, r1)
            r0 = 1
            if (r5 != r0) goto L16
            long r0 = r6.position
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L16
            r4.enterReadingAtomHeaderState()
        L16:
            return r5
    }

    private static boolean shouldParseContainerAtom(int r1) {
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r1 == r0) goto L26
            r0 = 1953653099(0x7472616b, float:7.681346E31)
            if (r1 == r0) goto L26
            r0 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r1 == r0) goto L26
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r1 == r0) goto L26
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r1 == r0) goto L26
            r0 = 1701082227(0x65647473, float:6.742798E22)
            if (r1 == r0) goto L26
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r1 != r0) goto L24
            goto L26
        L24:
            r1 = 0
            goto L27
        L26:
            r1 = 1
        L27:
            return r1
    }

    private static boolean shouldParseLeafAtom(int r1) {
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            if (r1 == r0) goto L5d
            r0 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r1 == r0) goto L5d
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            if (r1 == r0) goto L5d
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            if (r1 == r0) goto L5d
            r0 = 1937011827(0x73747473, float:1.9367711E31)
            if (r1 == r0) goto L5d
            r0 = 1937011571(0x73747373, float:1.9367401E31)
            if (r1 == r0) goto L5d
            r0 = 1668576371(0x63747473, float:4.5093966E21)
            if (r1 == r0) goto L5d
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r1 == r0) goto L5d
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            if (r1 == r0) goto L5d
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            if (r1 == r0) goto L5d
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r1 == r0) goto L5d
            r0 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r1 == r0) goto L5d
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r1 == r0) goto L5d
            r0 = 1953196132(0x746b6864, float:7.46037E31)
            if (r1 == r0) goto L5d
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r1 == r0) goto L5d
            r0 = 1969517665(0x75647461, float:2.8960062E32)
            if (r1 == r0) goto L5d
            r0 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r1 == r0) goto L5d
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r1 != r0) goto L5b
            goto L5d
        L5b:
            r1 = 0
            goto L5e
        L5d:
            r1 = 1
        L5e:
            return r1
    }

    private void updateSampleIndex(com.google.android.exoplayer2.extractor.mp4.Mp4Extractor.Mp4Track r4, long r5) {
            r3 = this;
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r0 = r4.sampleTable
            int r1 = r0.getIndexOfEarlierOrEqualSynchronizationSample(r5)
            r2 = -1
            if (r1 != r2) goto Ld
            int r1 = r0.getIndexOfLaterOrEqualSynchronizationSample(r5)
        Ld:
            r4.sampleIndex = r1
            return
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
            r2 = this;
            long r0 = r2.durationUs
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long r2) {
            r1 = this;
            r0 = -1
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r2 = r1.getSeekPoints(r2, r0)
            return r2
    }

    public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long r17, int r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor$Mp4Track[] r4 = r0.tracks
            int r5 = r4.length
            if (r5 != 0) goto L13
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r1 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            com.google.android.exoplayer2.extractor.SeekPoint r2 = com.google.android.exoplayer2.extractor.SeekPoint.START
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            r7 = -1
            if (r3 == r7) goto L1a
            r8 = r3
            goto L1c
        L1a:
            int r8 = r0.firstVideoTrackIndex
        L1c:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 == r7) goto L58
            r4 = r4[r8]
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r4 = r4.sampleTable
            int r8 = getSynchronizationSampleIndex(r4, r1)
            if (r8 != r7) goto L35
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r1 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            com.google.android.exoplayer2.extractor.SeekPoint r2 = com.google.android.exoplayer2.extractor.SeekPoint.START
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.timestampsUs
            r12 = r11[r8]
            long[] r11 = r4.offsets
            r14 = r11[r8]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.sampleCount
            int r11 = r11 + (-1)
            if (r8 >= r11) goto L5e
            int r1 = r4.getIndexOfLaterOrEqualSynchronizationSample(r1)
            if (r1 == r7) goto L5e
            if (r1 == r8) goto L5e
            long[] r2 = r4.timestampsUs
            r5 = r2[r1]
            long[] r2 = r4.offsets
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r5
            r5 = r9
        L60:
            if (r3 != r7) goto L7f
            r3 = 0
        L63:
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor$Mp4Track[] r4 = r0.tracks
            int r7 = r4.length
            if (r3 >= r7) goto L7f
            int r7 = r0.firstVideoTrackIndex
            if (r3 == r7) goto L7c
            r4 = r4[r3]
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r4 = r4.sampleTable
            long r14 = maybeAdjustSeekOffset(r4, r12, r14)
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L7c
            long r1 = maybeAdjustSeekOffset(r4, r5, r1)
        L7c:
            int r3 = r3 + 1
            goto L63
        L7f:
            com.google.android.exoplayer2.extractor.SeekPoint r3 = new com.google.android.exoplayer2.extractor.SeekPoint
            r3.<init>(r12, r14)
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 != 0) goto L8e
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r1 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            r1.<init>(r3)
            return r1
        L8e:
            com.google.android.exoplayer2.extractor.SeekPoint r4 = new com.google.android.exoplayer2.extractor.SeekPoint
            r4.<init>(r5, r1)
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r1 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            r1.<init>(r3, r4)
            return r1
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r1) {
            r0 = this;
            r0.extractorOutput = r1
            return
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r3, com.google.android.exoplayer2.extractor.PositionHolder r4) throws java.io.IOException {
            r2 = this;
        L0:
            int r0 = r2.parserState
            if (r0 == 0) goto L24
            r1 = 1
            if (r0 == r1) goto L1d
            r1 = 2
            if (r0 == r1) goto L18
            r1 = 3
            if (r0 != r1) goto L12
            int r3 = r2.readSefData(r3, r4)
            return r3
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L18:
            int r3 = r2.readSample(r3, r4)
            return r3
        L1d:
            boolean r0 = r2.readAtomPayload(r3, r4)
            if (r0 == 0) goto L0
            return r1
        L24:
            boolean r0 = r2.readAtomHeader(r3)
            if (r0 != 0) goto L0
            r3 = -1
            return r3
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long r5, long r7) {
            r4 = this;
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r4.containerAtoms
            r0.clear()
            r0 = 0
            r4.atomHeaderBytesRead = r0
            r1 = -1
            r4.sampleTrackIndex = r1
            r4.sampleBytesRead = r0
            r4.sampleBytesWritten = r0
            r4.sampleCurrentNalBytesRemaining = r0
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto L2b
            int r5 = r4.parserState
            r6 = 3
            if (r5 == r6) goto L20
            r4.enterReadingAtomHeaderState()
            goto L3f
        L20:
            com.google.android.exoplayer2.extractor.mp4.SefReader r5 = r4.sefReader
            r5.reset()
            java.util.List<com.google.android.exoplayer2.metadata.Metadata$Entry> r5 = r4.slowMotionMetadataEntries
            r5.clear()
            goto L3f
        L2b:
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor$Mp4Track[] r5 = r4.tracks
            int r6 = r5.length
        L2e:
            if (r0 >= r6) goto L3f
            r1 = r5[r0]
            r4.updateSampleIndex(r1, r7)
            com.google.android.exoplayer2.extractor.TrueHdSampleRechunker r1 = r1.trueHdSampleRechunker
            if (r1 == 0) goto L3c
            r1.reset()
        L3c:
            int r0 = r0 + 1
            goto L2e
        L3f:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.flags
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            boolean r2 = com.google.android.exoplayer2.extractor.mp4.Sniffer.sniffUnfragmented(r2, r0)
            return r2
    }
}
