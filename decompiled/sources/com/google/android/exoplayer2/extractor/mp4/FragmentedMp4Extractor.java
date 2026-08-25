package com.google.android.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes3.dex */
public class FragmentedMp4Extractor implements com.google.android.exoplayer2.extractor.Extractor {
    private static final com.google.android.exoplayer2.Format EMSG_FORMAT = null;
    private static final int EXTRA_TRACKS_BASE_ID = 100;
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory FACTORY = null;
    public static final int FLAG_ENABLE_EMSG_TRACK = 4;
    public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 16;
    public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
    private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = null;
    private static final int SAMPLE_GROUP_TYPE_seig = 1936025959;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_ENCRYPTION_DATA = 2;
    private static final int STATE_READING_SAMPLE_CONTINUE = 4;
    private static final int STATE_READING_SAMPLE_START = 3;
    private static final java.lang.String TAG = "FragmentedMp4Extractor";

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.extractor.TrackOutput additionalEmsgTrackOutput;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.util.ParsableByteArray atomData;
    private final com.google.android.exoplayer2.util.ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private com.google.android.exoplayer2.extractor.TrackOutput[] ceaTrackOutputs;
    private final java.util.List<com.google.android.exoplayer2.Format> closedCaptionFormats;
    private final java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom> containerAtoms;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle currentTrackBundle;
    private long durationUs;
    private com.google.android.exoplayer2.extractor.TrackOutput[] emsgTrackOutputs;
    private long endOfMdatPosition;
    private final com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder eventMessageEncoder;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private final int flags;
    private boolean haveOutputSeekMap;
    private final com.google.android.exoplayer2.util.ParsableByteArray nalBuffer;
    private final com.google.android.exoplayer2.util.ParsableByteArray nalPrefix;
    private final com.google.android.exoplayer2.util.ParsableByteArray nalStartCode;
    private int parserState;
    private int pendingMetadataSampleBytes;
    private final java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.MetadataSampleInfo> pendingMetadataSampleInfos;
    private long pendingSeekTimeUs;
    private boolean processSeiNalUnitPayload;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleSize;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch;
    private final byte[] scratchBytes;
    private long segmentIndexEarliestPresentationTimeUs;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.extractor.mp4.Track sideloadedTrack;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster;
    private final android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle> trackBundles;

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class MetadataSampleInfo {
        public final boolean sampleTimeIsRelative;
        public final long sampleTimeUs;
        public final int size;

        public MetadataSampleInfo(long r1, boolean r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.sampleTimeUs = r1
                r0.sampleTimeIsRelative = r3
                r0.size = r4
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class TrackBundle {
        private static final int SINGLE_SUBSAMPLE_ENCRYPTION_DATA_LENGTH = 8;
        public int currentSampleInTrackRun;
        public int currentSampleIndex;
        public int currentTrackRunIndex;
        private boolean currentlyInFragment;
        private final com.google.android.exoplayer2.util.ParsableByteArray defaultInitializationVector;
        public com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues defaultSampleValues;
        private final com.google.android.exoplayer2.util.ParsableByteArray encryptionSignalByte;
        public int firstSampleToOutputIndex;
        public final com.google.android.exoplayer2.extractor.mp4.TrackFragment fragment;
        public com.google.android.exoplayer2.extractor.mp4.TrackSampleTable moovSampleTable;
        public final com.google.android.exoplayer2.extractor.TrackOutput output;
        public final com.google.android.exoplayer2.util.ParsableByteArray scratch;

        public TrackBundle(com.google.android.exoplayer2.extractor.TrackOutput r2, com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r3, com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r4) {
                r1 = this;
                r1.<init>()
                r1.output = r2
                r1.moovSampleTable = r3
                r1.defaultSampleValues = r4
                com.google.android.exoplayer2.extractor.mp4.TrackFragment r2 = new com.google.android.exoplayer2.extractor.mp4.TrackFragment
                r2.<init>()
                r1.fragment = r2
                com.google.android.exoplayer2.util.ParsableByteArray r2 = new com.google.android.exoplayer2.util.ParsableByteArray
                r2.<init>()
                r1.scratch = r2
                com.google.android.exoplayer2.util.ParsableByteArray r2 = new com.google.android.exoplayer2.util.ParsableByteArray
                r0 = 1
                r2.<init>(r0)
                r1.encryptionSignalByte = r2
                com.google.android.exoplayer2.util.ParsableByteArray r2 = new com.google.android.exoplayer2.util.ParsableByteArray
                r2.<init>()
                r1.defaultInitializationVector = r2
                r1.reset(r3, r4)
                return
        }

        public static /* synthetic */ boolean access$000(com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle r0) {
                boolean r0 = r0.currentlyInFragment
                return r0
        }

        public static /* synthetic */ void access$002(com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle r1) {
                r0 = 1
                r1.currentlyInFragment = r0
                return
        }

        public int getCurrentSampleFlags() {
                r2 = this;
                boolean r0 = r2.currentlyInFragment
                if (r0 != 0) goto Ld
                com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r0 = r2.moovSampleTable
                int[] r0 = r0.flags
                int r1 = r2.currentSampleIndex
                r0 = r0[r1]
                goto L1a
            Ld:
                com.google.android.exoplayer2.extractor.mp4.TrackFragment r0 = r2.fragment
                boolean[] r0 = r0.sampleIsSyncFrameTable
                int r1 = r2.currentSampleIndex
                boolean r0 = r0[r1]
                if (r0 == 0) goto L19
                r0 = 1
                goto L1a
            L19:
                r0 = 0
            L1a:
                com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r1 = r2.getEncryptionBoxIfEncrypted()
                if (r1 == 0) goto L23
                r1 = 1073741824(0x40000000, float:2.0)
                r0 = r0 | r1
            L23:
                return r0
        }

        public long getCurrentSampleOffset() {
                r3 = this;
                boolean r0 = r3.currentlyInFragment
                if (r0 != 0) goto Ld
                com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r0 = r3.moovSampleTable
                long[] r0 = r0.offsets
                int r1 = r3.currentSampleIndex
                r1 = r0[r1]
                goto L15
            Ld:
                com.google.android.exoplayer2.extractor.mp4.TrackFragment r0 = r3.fragment
                long[] r0 = r0.trunDataPosition
                int r1 = r3.currentTrackRunIndex
                r1 = r0[r1]
            L15:
                return r1
        }

        public long getCurrentSamplePresentationTimeUs() {
                r3 = this;
                boolean r0 = r3.currentlyInFragment
                if (r0 != 0) goto Ld
                com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r0 = r3.moovSampleTable
                long[] r0 = r0.timestampsUs
                int r1 = r3.currentSampleIndex
                r1 = r0[r1]
                goto L15
            Ld:
                com.google.android.exoplayer2.extractor.mp4.TrackFragment r0 = r3.fragment
                int r1 = r3.currentSampleIndex
                long r1 = r0.getSamplePresentationTimeUs(r1)
            L15:
                return r1
        }

        public int getCurrentSampleSize() {
                r2 = this;
                boolean r0 = r2.currentlyInFragment
                if (r0 != 0) goto Ld
                com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r0 = r2.moovSampleTable
                int[] r0 = r0.sizes
                int r1 = r2.currentSampleIndex
                r0 = r0[r1]
                goto L15
            Ld:
                com.google.android.exoplayer2.extractor.mp4.TrackFragment r0 = r2.fragment
                int[] r0 = r0.sampleSizeTable
                int r1 = r2.currentSampleIndex
                r0 = r0[r1]
            L15:
                return r0
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox getEncryptionBoxIfEncrypted() {
                r3 = this;
                boolean r0 = r3.currentlyInFragment
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.google.android.exoplayer2.extractor.mp4.TrackFragment r0 = r3.fragment
                com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r0 = r0.header
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r0 = (com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues) r0
                int r0 = r0.sampleDescriptionIndex
                com.google.android.exoplayer2.extractor.mp4.TrackFragment r2 = r3.fragment
                com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r2 = r2.trackEncryptionBox
                if (r2 == 0) goto L19
                goto L21
            L19:
                com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r2 = r3.moovSampleTable
                com.google.android.exoplayer2.extractor.mp4.Track r2 = r2.track
                com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r2 = r2.getSampleDescriptionEncryptionBox(r0)
            L21:
                if (r2 == 0) goto L28
                boolean r0 = r2.isEncrypted
                if (r0 == 0) goto L28
                r1 = r2
            L28:
                return r1
        }

        public boolean next() {
                r5 = this;
                int r0 = r5.currentSampleIndex
                r1 = 1
                int r0 = r0 + r1
                r5.currentSampleIndex = r0
                boolean r0 = r5.currentlyInFragment
                r2 = 0
                if (r0 != 0) goto Lc
                return r2
            Lc:
                int r0 = r5.currentSampleInTrackRun
                int r0 = r0 + r1
                r5.currentSampleInTrackRun = r0
                com.google.android.exoplayer2.extractor.mp4.TrackFragment r3 = r5.fragment
                int[] r3 = r3.trunLength
                int r4 = r5.currentTrackRunIndex
                r3 = r3[r4]
                if (r0 != r3) goto L21
                int r4 = r4 + r1
                r5.currentTrackRunIndex = r4
                r5.currentSampleInTrackRun = r2
                return r2
            L21:
                return r1
        }

        public int outputSampleEncryptionData(int r11, int r12) {
                r10 = this;
                com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r0 = r10.getEncryptionBoxIfEncrypted()
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                int r2 = r0.perSampleIvSize
                if (r2 == 0) goto L11
                com.google.android.exoplayer2.extractor.mp4.TrackFragment r0 = r10.fragment
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r0.sampleEncryptionData
                goto L25
            L11:
                byte[] r0 = r0.defaultInitializationVector
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                byte[] r0 = (byte[]) r0
                com.google.android.exoplayer2.util.ParsableByteArray r2 = r10.defaultInitializationVector
                int r3 = r0.length
                r2.reset(r0, r3)
                com.google.android.exoplayer2.util.ParsableByteArray r2 = r10.defaultInitializationVector
                int r0 = r0.length
                r9 = r2
                r2 = r0
                r0 = r9
            L25:
                com.google.android.exoplayer2.extractor.mp4.TrackFragment r3 = r10.fragment
                int r4 = r10.currentSampleIndex
                boolean r3 = r3.sampleHasSubsampleEncryptionTable(r4)
                r4 = 1
                if (r3 != 0) goto L35
                if (r12 == 0) goto L33
                goto L35
            L33:
                r5 = 0
                goto L36
            L35:
                r5 = 1
            L36:
                com.google.android.exoplayer2.util.ParsableByteArray r6 = r10.encryptionSignalByte
                byte[] r6 = r6.getData()
                if (r5 == 0) goto L41
                r7 = 128(0x80, float:1.8E-43)
                goto L42
            L41:
                r7 = 0
            L42:
                r7 = r7 | r2
                byte r7 = (byte) r7
                r6[r1] = r7
                com.google.android.exoplayer2.util.ParsableByteArray r6 = r10.encryptionSignalByte
                r6.setPosition(r1)
                com.google.android.exoplayer2.extractor.TrackOutput r6 = r10.output
                com.google.android.exoplayer2.util.ParsableByteArray r7 = r10.encryptionSignalByte
                r6.sampleData(r7, r4, r4)
                com.google.android.exoplayer2.extractor.TrackOutput r6 = r10.output
                r6.sampleData(r0, r2, r4)
                if (r5 != 0) goto L5b
                int r2 = r2 + r4
                return r2
            L5b:
                r0 = 6
                r5 = 3
                r6 = 2
                r7 = 8
                if (r3 != 0) goto La4
                com.google.android.exoplayer2.util.ParsableByteArray r3 = r10.scratch
                r3.reset(r7)
                com.google.android.exoplayer2.util.ParsableByteArray r3 = r10.scratch
                byte[] r3 = r3.getData()
                r3[r1] = r1
                r3[r4] = r4
                int r1 = r12 >> 8
                r1 = r1 & 255(0xff, float:3.57E-43)
                byte r1 = (byte) r1
                r3[r6] = r1
                r12 = r12 & 255(0xff, float:3.57E-43)
                byte r12 = (byte) r12
                r3[r5] = r12
                r12 = 4
                int r1 = r11 >> 24
                r1 = r1 & 255(0xff, float:3.57E-43)
                byte r1 = (byte) r1
                r3[r12] = r1
                r12 = 5
                int r1 = r11 >> 16
                r1 = r1 & 255(0xff, float:3.57E-43)
                byte r1 = (byte) r1
                r3[r12] = r1
                int r12 = r11 >> 8
                r12 = r12 & 255(0xff, float:3.57E-43)
                byte r12 = (byte) r12
                r3[r0] = r12
                r12 = 7
                r11 = r11 & 255(0xff, float:3.57E-43)
                byte r11 = (byte) r11
                r3[r12] = r11
                com.google.android.exoplayer2.extractor.TrackOutput r11 = r10.output
                com.google.android.exoplayer2.util.ParsableByteArray r12 = r10.scratch
                r11.sampleData(r12, r7, r4)
                int r2 = r2 + r4
                int r2 = r2 + r7
                return r2
            La4:
                com.google.android.exoplayer2.extractor.mp4.TrackFragment r11 = r10.fragment
                com.google.android.exoplayer2.util.ParsableByteArray r11 = r11.sampleEncryptionData
                int r3 = r11.readUnsignedShort()
                r8 = -2
                r11.skipBytes(r8)
                int r3 = r3 * 6
                int r3 = r3 + r6
                if (r12 == 0) goto Ldc
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r10.scratch
                r0.reset(r3)
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r10.scratch
                byte[] r0 = r0.getData()
                r11.readBytes(r0, r1, r3)
                r11 = r0[r6]
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 << r7
                r1 = r0[r5]
                r1 = r1 & 255(0xff, float:3.57E-43)
                r11 = r11 | r1
                int r11 = r11 + r12
                int r12 = r11 >> 8
                r12 = r12 & 255(0xff, float:3.57E-43)
                byte r12 = (byte) r12
                r0[r6] = r12
                r11 = r11 & 255(0xff, float:3.57E-43)
                byte r11 = (byte) r11
                r0[r5] = r11
                com.google.android.exoplayer2.util.ParsableByteArray r11 = r10.scratch
            Ldc:
                com.google.android.exoplayer2.extractor.TrackOutput r12 = r10.output
                r12.sampleData(r11, r3, r4)
                int r2 = r2 + r4
                int r2 = r2 + r3
                return r2
        }

        public void reset(com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r1, com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r2) {
                r0 = this;
                r0.moovSampleTable = r1
                r0.defaultSampleValues = r2
                com.google.android.exoplayer2.extractor.TrackOutput r2 = r0.output
                com.google.android.exoplayer2.extractor.mp4.Track r1 = r1.track
                com.google.android.exoplayer2.Format r1 = r1.format
                r2.format(r1)
                r0.resetFragmentInfo()
                return
        }

        public void resetFragmentInfo() {
                r1 = this;
                com.google.android.exoplayer2.extractor.mp4.TrackFragment r0 = r1.fragment
                r0.reset()
                r0 = 0
                r1.currentSampleIndex = r0
                r1.currentTrackRunIndex = r0
                r1.currentSampleInTrackRun = r0
                r1.firstSampleToOutputIndex = r0
                r1.currentlyInFragment = r0
                return
        }

        public void seek(long r5) {
                r4 = this;
                int r0 = r4.currentSampleIndex
            L2:
                com.google.android.exoplayer2.extractor.mp4.TrackFragment r1 = r4.fragment
                int r2 = r1.sampleCount
                if (r0 >= r2) goto L1d
                long r1 = r1.getSamplePresentationTimeUs(r0)
                int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r3 > 0) goto L1d
                com.google.android.exoplayer2.extractor.mp4.TrackFragment r1 = r4.fragment
                boolean[] r1 = r1.sampleIsSyncFrameTable
                boolean r1 = r1[r0]
                if (r1 == 0) goto L1a
                r4.firstSampleToOutputIndex = r0
            L1a:
                int r0 = r0 + 1
                goto L2
            L1d:
                return
        }

        public void skipSampleEncryptionData() {
                r3 = this;
                com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r0 = r3.getEncryptionBoxIfEncrypted()
                if (r0 != 0) goto L7
                return
            L7:
                com.google.android.exoplayer2.extractor.mp4.TrackFragment r1 = r3.fragment
                com.google.android.exoplayer2.util.ParsableByteArray r1 = r1.sampleEncryptionData
                int r0 = r0.perSampleIvSize
                if (r0 == 0) goto L12
                r1.skipBytes(r0)
            L12:
                com.google.android.exoplayer2.extractor.mp4.TrackFragment r0 = r3.fragment
                int r2 = r3.currentSampleIndex
                boolean r0 = r0.sampleHasSubsampleEncryptionTable(r2)
                if (r0 == 0) goto L25
                int r0 = r1.readUnsignedShort()
                int r0 = r0 * 6
                r1.skipBytes(r0)
            L25:
                return
        }

        public void updateDrmInitData(com.google.android.exoplayer2.drm.DrmInitData r3) {
                r2 = this;
                com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r0 = r2.moovSampleTable
                com.google.android.exoplayer2.extractor.mp4.Track r0 = r0.track
                com.google.android.exoplayer2.extractor.mp4.TrackFragment r1 = r2.fragment
                com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r1 = r1.header
                java.lang.Object r1 = com.google.android.exoplayer2.util.Util.castNonNull(r1)
                com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r1 = (com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues) r1
                int r1 = r1.sampleDescriptionIndex
                com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r0 = r0.getSampleDescriptionEncryptionBox(r1)
                if (r0 == 0) goto L19
                java.lang.String r0 = r0.schemeType
                goto L1a
            L19:
                r0 = 0
            L1a:
                com.google.android.exoplayer2.drm.DrmInitData r3 = r3.copyWithSchemeType(r0)
                com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r0 = r2.moovSampleTable
                com.google.android.exoplayer2.extractor.mp4.Track r0 = r0.track
                com.google.android.exoplayer2.Format r0 = r0.format
                com.google.android.exoplayer2.Format$Builder r0 = r0.buildUpon()
                com.google.android.exoplayer2.Format$Builder r3 = r0.setDrmInitData(r3)
                com.google.android.exoplayer2.Format r3 = r3.build()
                com.google.android.exoplayer2.extractor.TrackOutput r0 = r2.output
                r0.format(r3)
                return
        }
    }

    public static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] $r8$lambda$nTvOltF7Hh61n3UwwVozMumvhfw() {
            com.google.android.exoplayer2.extractor.Extractor[] r0 = lambda$static$0()
            return r0
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$6
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.FACTORY = r0
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12} // fill-array
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = r0
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            java.lang.String r1 = "application/x-emsg"
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r1)
            com.google.android.exoplayer2.Format r0 = r0.build()
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.EMSG_FORMAT = r0
            return
    }

    public FragmentedMp4Extractor() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public FragmentedMp4Extractor(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FragmentedMp4Extractor(int r3, @androidx.annotation.Nullable com.google.android.exoplayer2.util.TimestampAdjuster r4) {
            r2 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            r1 = 0
            r2.<init>(r3, r4, r1, r0)
            return
    }

    public FragmentedMp4Extractor(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.util.TimestampAdjuster r3, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.mp4.Track r4) {
            r1 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public FragmentedMp4Extractor(int r7, @androidx.annotation.Nullable com.google.android.exoplayer2.util.TimestampAdjuster r8, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.mp4.Track r9, java.util.List<com.google.android.exoplayer2.Format> r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public FragmentedMp4Extractor(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.util.TimestampAdjuster r2, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.mp4.Track r3, java.util.List<com.google.android.exoplayer2.Format> r4, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.TrackOutput r5) {
            r0 = this;
            r0.<init>()
            r0.flags = r1
            r0.timestampAdjuster = r2
            r0.sideloadedTrack = r3
            java.util.List r1 = java.util.Collections.unmodifiableList(r4)
            r0.closedCaptionFormats = r1
            r0.additionalEmsgTrackOutput = r5
            com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder r1 = new com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder
            r1.<init>()
            r0.eventMessageEncoder = r1
            com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
            r2 = 16
            r1.<init>(r2)
            r0.atomHeader = r1
            com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
            byte[] r3 = com.google.android.exoplayer2.util.NalUnitUtil.NAL_START_CODE
            r1.<init>(r3)
            r0.nalStartCode = r1
            com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
            r3 = 5
            r1.<init>(r3)
            r0.nalPrefix = r1
            com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1.<init>()
            r0.nalBuffer = r1
            byte[] r1 = new byte[r2]
            r0.scratchBytes = r1
            com.google.android.exoplayer2.util.ParsableByteArray r2 = new com.google.android.exoplayer2.util.ParsableByteArray
            r2.<init>(r1)
            r0.scratch = r2
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.containerAtoms = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.pendingMetadataSampleInfos = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.trackBundles = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.durationUs = r1
            r0.pendingSeekTimeUs = r1
            r0.segmentIndexEarliestPresentationTimeUs = r1
            com.google.android.exoplayer2.extractor.ExtractorOutput r1 = com.google.android.exoplayer2.extractor.ExtractorOutput.PLACEHOLDER
            r0.extractorOutput = r1
            r1 = 0
            com.google.android.exoplayer2.extractor.TrackOutput[] r2 = new com.google.android.exoplayer2.extractor.TrackOutput[r1]
            r0.emsgTrackOutputs = r2
            com.google.android.exoplayer2.extractor.TrackOutput[] r1 = new com.google.android.exoplayer2.extractor.TrackOutput[r1]
            r0.ceaTrackOutputs = r1
            return
    }

    private static int checkNonNegative(int r2) throws com.google.android.exoplayer2.ParserException {
            if (r2 < 0) goto L3
            return r2
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected negative value: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r0 = 0
            com.google.android.exoplayer2.ParserException r2 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r2, r0)
            throw r2
    }

    private void enterReadingAtomHeaderState() {
            r1 = this;
            r0 = 0
            r1.parserState = r0
            r1.atomHeaderBytesRead = r0
            return
    }

    private com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues getDefaultSampleValues(android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues> r3, int r4) {
            r2 = this;
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto Lf
            r4 = 0
            java.lang.Object r3 = r3.valueAt(r4)
            com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r3 = (com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues) r3
            return r3
        Lf:
            java.lang.Object r3 = r3.get(r4)
            com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r3 = (com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues) r3
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r3 = (com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues) r3
            return r3
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.drm.DrmInitData getDrmInitDataFromAtoms(java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom> r8) {
            int r0 = r8.size()
            r1 = 0
            r2 = 0
            r3 = r1
        L7:
            if (r2 >= r0) goto L3f
            java.lang.Object r4 = r8.get(r2)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r4 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r4
            int r5 = r4.type
            r6 = 1886614376(0x70737368, float:3.013775E29)
            if (r5 != r6) goto L3c
            if (r3 != 0) goto L1d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1d:
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r4.data
            byte[] r4 = r4.getData()
            java.util.UUID r5 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.parseUuid(r4)
            if (r5 != 0) goto L31
            java.lang.String r4 = "FragmentedMp4Extractor"
            java.lang.String r5 = "Skipped pssh atom (failed to extract uuid)"
            com.google.android.exoplayer2.util.Log.w(r4, r5)
            goto L3c
        L31:
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r6 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            java.lang.String r7 = "video/mp4"
            r6.<init>(r5, r7, r4)
            r3.add(r6)
        L3c:
            int r2 = r2 + 1
            goto L7
        L3f:
            if (r3 != 0) goto L42
            goto L47
        L42:
            com.google.android.exoplayer2.drm.DrmInitData r1 = new com.google.android.exoplayer2.drm.DrmInitData
            r1.<init>(r3)
        L47:
            return r1
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle getNextTrackBundle(android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle> r9) {
            int r0 = r9.size()
            r1 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
        Lb:
            if (r4 >= r0) goto L3d
            java.lang.Object r5 = r9.valueAt(r4)
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r5 = (com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle) r5
            boolean r6 = com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle.access$000(r5)
            if (r6 != 0) goto L21
            int r6 = r5.currentSampleIndex
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r7 = r5.moovSampleTable
            int r7 = r7.sampleCount
            if (r6 == r7) goto L3a
        L21:
            boolean r6 = com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle.access$000(r5)
            if (r6 == 0) goto L30
            int r6 = r5.currentTrackRunIndex
            com.google.android.exoplayer2.extractor.mp4.TrackFragment r7 = r5.fragment
            int r7 = r7.trunCount
            if (r6 != r7) goto L30
            goto L3a
        L30:
            long r6 = r5.getCurrentSampleOffset()
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 >= 0) goto L3a
            r1 = r5
            r2 = r6
        L3a:
            int r4 = r4 + 1
            goto Lb
        L3d:
            return r1
    }

    private void initExtraTracks() {
            r8 = this;
            r0 = 2
            com.google.android.exoplayer2.extractor.TrackOutput[] r0 = new com.google.android.exoplayer2.extractor.TrackOutput[r0]
            r8.emsgTrackOutputs = r0
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r8.additionalEmsgTrackOutput
            r2 = 0
            if (r1 == 0) goto Le
            r0[r2] = r1
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            int r3 = r8.flags
            r3 = r3 & 4
            r4 = 100
            if (r3 == 0) goto L27
            int r3 = r1 + 1
            com.google.android.exoplayer2.extractor.ExtractorOutput r5 = r8.extractorOutput
            r6 = 101(0x65, float:1.42E-43)
            r7 = 5
            com.google.android.exoplayer2.extractor.TrackOutput r4 = r5.track(r4, r7)
            r0[r1] = r4
            r1 = r3
            r4 = 101(0x65, float:1.42E-43)
        L27:
            com.google.android.exoplayer2.extractor.TrackOutput[] r0 = r8.emsgTrackOutputs
            java.lang.Object[] r0 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r0, r1)
            com.google.android.exoplayer2.extractor.TrackOutput[] r0 = (com.google.android.exoplayer2.extractor.TrackOutput[]) r0
            r8.emsgTrackOutputs = r0
            int r1 = r0.length
            r3 = 0
        L33:
            if (r3 >= r1) goto L3f
            r5 = r0[r3]
            com.google.android.exoplayer2.Format r6 = com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.EMSG_FORMAT
            r5.format(r6)
            int r3 = r3 + 1
            goto L33
        L3f:
            java.util.List<com.google.android.exoplayer2.Format> r0 = r8.closedCaptionFormats
            int r0 = r0.size()
            com.google.android.exoplayer2.extractor.TrackOutput[] r0 = new com.google.android.exoplayer2.extractor.TrackOutput[r0]
            r8.ceaTrackOutputs = r0
        L49:
            com.google.android.exoplayer2.extractor.TrackOutput[] r0 = r8.ceaTrackOutputs
            int r0 = r0.length
            if (r2 >= r0) goto L6a
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r8.extractorOutput
            int r1 = r4 + 1
            r3 = 3
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r0.track(r4, r3)
            java.util.List<com.google.android.exoplayer2.Format> r3 = r8.closedCaptionFormats
            java.lang.Object r3 = r3.get(r2)
            com.google.android.exoplayer2.Format r3 = (com.google.android.exoplayer2.Format) r3
            r0.format(r3)
            com.google.android.exoplayer2.extractor.TrackOutput[] r3 = r8.ceaTrackOutputs
            r3[r2] = r0
            int r2 = r2 + 1
            r4 = r1
            goto L49
        L6a:
            return
    }

    private static boolean isEdtsListDurationForEntireMediaTimeline(com.google.android.exoplayer2.extractor.mp4.Track r14) {
            long[] r0 = r14.editListDurations
            r1 = 0
            if (r0 == 0) goto L2d
            int r2 = r0.length
            r3 = 1
            if (r2 != r3) goto L2d
            long[] r2 = r14.editListMediaTimes
            if (r2 != 0) goto Le
            goto L2d
        Le:
            r4 = r0[r1]
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L17
            return r3
        L17:
            r4 = r0[r1]
            r6 = r2[r1]
            long r8 = r4 + r6
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r14.movieTimescale
            long r4 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r8, r10, r12)
            long r6 = r14.durationUs
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 < 0) goto L2d
            r1 = 1
        L2d:
            return r1
    }

    private static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
            r0 = 1
            com.google.android.exoplayer2.extractor.Extractor[] r0 = new com.google.android.exoplayer2.extractor.Extractor[r0]
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor r1 = new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            return r0
    }

    private void onContainerAtomRead(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r3) throws com.google.android.exoplayer2.ParserException {
            r2 = this;
            int r0 = r3.type
            r1 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r0 != r1) goto Lb
            r2.onMoovContainerAtomRead(r3)
            goto L27
        Lb:
            r1 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r0 != r1) goto L14
            r2.onMoofContainerAtomRead(r3)
            goto L27
        L14:
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r2.containerAtoms
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r2.containerAtoms
            java.lang.Object r0 = r0.peek()
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r0 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r0
            r0.add(r3)
        L27:
            return
    }

    private void onEmsgLeafAtomRead(com.google.android.exoplayer2.util.ParsableByteArray r28) {
            r27 = this;
            r0 = r27
            r1 = r28
            com.google.android.exoplayer2.extractor.TrackOutput[] r2 = r0.emsgTrackOutputs
            int r2 = r2.length
            if (r2 != 0) goto La
            return
        La:
            r2 = 8
            r1.setPosition(r2)
            int r2 = r28.readInt()
            int r2 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(r2)
            r3 = 1
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L65
            if (r2 == r3) goto L29
            java.lang.String r1 = "Skipping unsupported emsg version: "
            java.lang.String r3 = "FragmentedMp4Extractor"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r1, r2, r3)
            return
        L29:
            long r12 = r28.readUnsignedInt()
            long r6 = r28.readUnsignedLongToLong()
            r8 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r12
            long r14 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r6, r8, r10)
            long r6 = r28.readUnsignedInt()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r6, r8, r10)
            long r8 = r28.readUnsignedInt()
            java.lang.String r2 = r28.readNullTerminatedString()
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r10 = r28.readNullTerminatedString()
            java.lang.Object r10 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r10)
            java.lang.String r10 = (java.lang.String) r10
            r20 = r2
            r22 = r6
            r24 = r8
            r21 = r10
            r8 = r4
            goto Laf
        L65:
            java.lang.String r2 = r28.readNullTerminatedString()
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = r28.readNullTerminatedString()
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            long r6 = r28.readUnsignedInt()
            long r11 = r28.readUnsignedInt()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r6
            long r8 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r11, r13, r15)
            long r11 = r0.segmentIndexEarliestPresentationTimeUs
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 == 0) goto L94
            long r11 = r11 + r8
            r17 = r11
            goto L96
        L94:
            r17 = r4
        L96:
            long r11 = r28.readUnsignedInt()
            r13 = 1000(0x3e8, double:4.94E-321)
            r15 = r6
            long r6 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r11, r13, r15)
            long r11 = r28.readUnsignedInt()
            r20 = r2
            r22 = r6
            r21 = r10
            r24 = r11
            r14 = r17
        Laf:
            int r2 = r28.bytesLeft()
            byte[] r2 = new byte[r2]
            int r6 = r28.bytesLeft()
            r7 = 0
            r1.readBytes(r2, r7, r6)
            com.google.android.exoplayer2.metadata.emsg.EventMessage r1 = new com.google.android.exoplayer2.metadata.emsg.EventMessage
            r19 = r1
            r26 = r2
            r19.<init>(r20, r21, r22, r24, r26)
            com.google.android.exoplayer2.util.ParsableByteArray r2 = new com.google.android.exoplayer2.util.ParsableByteArray
            com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder r6 = r0.eventMessageEncoder
            byte[] r1 = r6.encode(r1)
            r2.<init>(r1)
            int r1 = r2.bytesLeft()
            com.google.android.exoplayer2.extractor.TrackOutput[] r6 = r0.emsgTrackOutputs
            int r10 = r6.length
            r11 = 0
        Ld9:
            if (r11 >= r10) goto Le6
            r12 = r6[r11]
            r2.setPosition(r7)
            r12.sampleData(r2, r1)
            int r11 = r11 + 1
            goto Ld9
        Le6:
            int r2 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r2 != 0) goto Lfa
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$MetadataSampleInfo> r2 = r0.pendingMetadataSampleInfos
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$MetadataSampleInfo r4 = new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$MetadataSampleInfo
            r4.<init>(r8, r3, r1)
            r2.addLast(r4)
            int r2 = r0.pendingMetadataSampleBytes
            int r2 = r2 + r1
            r0.pendingMetadataSampleBytes = r2
            goto L131
        Lfa:
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$MetadataSampleInfo> r2 = r0.pendingMetadataSampleInfos
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L112
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$MetadataSampleInfo> r2 = r0.pendingMetadataSampleInfos
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$MetadataSampleInfo r3 = new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$MetadataSampleInfo
            r3.<init>(r14, r7, r1)
            r2.addLast(r3)
            int r2 = r0.pendingMetadataSampleBytes
            int r2 = r2 + r1
            r0.pendingMetadataSampleBytes = r2
            goto L131
        L112:
            com.google.android.exoplayer2.util.TimestampAdjuster r2 = r0.timestampAdjuster
            if (r2 == 0) goto L11a
            long r14 = r2.adjustSampleTimestamp(r14)
        L11a:
            com.google.android.exoplayer2.extractor.TrackOutput[] r2 = r0.emsgTrackOutputs
            int r3 = r2.length
        L11d:
            if (r7 >= r3) goto L131
            r16 = r2[r7]
            r19 = 1
            r21 = 0
            r22 = 0
            r17 = r14
            r20 = r1
            r16.sampleMetadata(r17, r19, r20, r21, r22)
            int r7 = r7 + 1
            goto L11d
        L131:
            return
    }

    private void onLeafAtomRead(com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom r3, long r4) throws com.google.android.exoplayer2.ParserException {
            r2 = this;
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r2.containerAtoms
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L14
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r4 = r2.containerAtoms
            java.lang.Object r4 = r4.peek()
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r4 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r4
            r4.add(r3)
            goto L42
        L14:
            int r0 = r3.type
            r1 = 1936286840(0x73696478, float:1.8491255E31)
            if (r0 != r1) goto L38
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r3.data
            android.util.Pair r3 = parseSidx(r3, r4)
            java.lang.Object r4 = r3.first
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r2.segmentIndexEarliestPresentationTimeUs = r4
            com.google.android.exoplayer2.extractor.ExtractorOutput r4 = r2.extractorOutput
            java.lang.Object r3 = r3.second
            com.google.android.exoplayer2.extractor.SeekMap r3 = (com.google.android.exoplayer2.extractor.SeekMap) r3
            r4.seekMap(r3)
            r3 = 1
            r2.haveOutputSeekMap = r3
            goto L42
        L38:
            r4 = 1701671783(0x656d7367, float:7.0083103E22)
            if (r0 != r4) goto L42
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r3.data
            r2.onEmsgLeafAtomRead(r3)
        L42:
            return
    }

    private void onMoofContainerAtomRead(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r8) throws com.google.android.exoplayer2.ParserException {
            r7 = this;
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r0 = r7.trackBundles
            com.google.android.exoplayer2.extractor.mp4.Track r1 = r7.sideloadedTrack
            r2 = 0
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            int r3 = r7.flags
            byte[] r4 = r7.scratchBytes
            parseMoof(r8, r0, r1, r3, r4)
            java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom> r8 = r8.leafChildren
            com.google.android.exoplayer2.drm.DrmInitData r8 = getDrmInitDataFromAtoms(r8)
            if (r8 == 0) goto L30
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r0 = r7.trackBundles
            int r0 = r0.size()
            r1 = 0
        L20:
            if (r1 >= r0) goto L30
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r3 = r7.trackBundles
            java.lang.Object r3 = r3.valueAt(r1)
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r3 = (com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle) r3
            r3.updateDrmInitData(r8)
            int r1 = r1 + 1
            goto L20
        L30:
            long r0 = r7.pendingSeekTimeUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 == 0) goto L55
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r8 = r7.trackBundles
            int r8 = r8.size()
        L41:
            if (r2 >= r8) goto L53
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r0 = r7.trackBundles
            java.lang.Object r0 = r0.valueAt(r2)
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r0 = (com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle) r0
            long r5 = r7.pendingSeekTimeUs
            r0.seek(r5)
            int r2 = r2 + 1
            goto L41
        L53:
            r7.pendingSeekTimeUs = r3
        L55:
            return
    }

    private void onMoovContainerAtomRead(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r14) throws com.google.android.exoplayer2.ParserException {
            r13 = this;
            com.google.android.exoplayer2.extractor.mp4.Track r0 = r13.sideloadedTrack
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            java.lang.String r3 = "Unexpected moov box."
            com.google.android.exoplayer2.util.Assertions.checkState(r0, r3)
            java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom> r0 = r14.leafChildren
            com.google.android.exoplayer2.drm.DrmInitData r7 = getDrmInitDataFromAtoms(r0)
            r0 = 1836475768(0x6d766578, float:4.7659988E27)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r0 = r14.getContainerAtomOfType(r0)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r0 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r0
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom> r5 = r0.leafChildren
            int r5 = r5.size()
            r8 = r3
            r3 = 0
        L33:
            if (r3 >= r5) goto L68
            java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom> r4 = r0.leafChildren
            java.lang.Object r4 = r4.get(r3)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r4 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r4
            int r6 = r4.type
            r10 = 1953654136(0x74726578, float:7.6818474E31)
            if (r6 != r10) goto L5a
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r4.data
            android.util.Pair r4 = parseTrex(r4)
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.second
            com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r4 = (com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues) r4
            r11.put(r6, r4)
            goto L65
        L5a:
            r10 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r6 != r10) goto L65
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r4.data
            long r8 = parseMehd(r4)
        L65:
            int r3 = r3 + 1
            goto L33
        L68:
            com.google.android.exoplayer2.extractor.GaplessInfoHolder r4 = new com.google.android.exoplayer2.extractor.GaplessInfoHolder
            r4.<init>()
            int r0 = r13.flags
            r0 = r0 & 16
            if (r0 == 0) goto L75
            r0 = 1
            goto L76
        L75:
            r0 = 0
        L76:
            r10 = 0
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$$ExternalSyntheticLambda0 r12 = new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$$ExternalSyntheticLambda0
            r12.<init>(r13)
            r3 = r14
            r5 = r8
            r8 = r0
            r9 = r10
            r10 = r12
            java.util.List r14 = com.google.android.exoplayer2.extractor.mp4.AtomParsers.parseTraks(r3, r4, r5, r7, r8, r9, r10)
            int r0 = r14.size()
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r3 = r13.trackBundles
            int r3 = r3.size()
            if (r3 != 0) goto Lc8
        L91:
            if (r2 >= r0) goto Lc2
            java.lang.Object r1 = r14.get(r2)
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r1 = (com.google.android.exoplayer2.extractor.mp4.TrackSampleTable) r1
            com.google.android.exoplayer2.extractor.mp4.Track r3 = r1.track
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r4 = new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle
            com.google.android.exoplayer2.extractor.ExtractorOutput r5 = r13.extractorOutput
            int r6 = r3.type
            com.google.android.exoplayer2.extractor.TrackOutput r5 = r5.track(r2, r6)
            int r6 = r3.id
            com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r6 = r13.getDefaultSampleValues(r11, r6)
            r4.<init>(r5, r1, r6)
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r1 = r13.trackBundles
            int r5 = r3.id
            r1.put(r5, r4)
            long r4 = r13.durationUs
            long r6 = r3.durationUs
            long r3 = java.lang.Math.max(r4, r6)
            r13.durationUs = r3
            int r2 = r2 + 1
            goto L91
        Lc2:
            com.google.android.exoplayer2.extractor.ExtractorOutput r14 = r13.extractorOutput
            r14.endTracks()
            goto Lf5
        Lc8:
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r3 = r13.trackBundles
            int r3 = r3.size()
            if (r3 != r0) goto Ld1
            goto Ld2
        Ld1:
            r1 = 0
        Ld2:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
        Ld5:
            if (r2 >= r0) goto Lf5
            java.lang.Object r1 = r14.get(r2)
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r1 = (com.google.android.exoplayer2.extractor.mp4.TrackSampleTable) r1
            com.google.android.exoplayer2.extractor.mp4.Track r3 = r1.track
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r4 = r13.trackBundles
            int r5 = r3.id
            java.lang.Object r4 = r4.get(r5)
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r4 = (com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle) r4
            int r3 = r3.id
            com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r3 = r13.getDefaultSampleValues(r11, r3)
            r4.reset(r1, r3)
            int r2 = r2 + 1
            goto Ld5
        Lf5:
            return
    }

    private void outputPendingMetadataSamples(long r14) {
            r13 = this;
        L0:
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$MetadataSampleInfo> r0 = r13.pendingMetadataSampleInfos
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3c
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$MetadataSampleInfo> r0 = r13.pendingMetadataSampleInfos
            java.lang.Object r0 = r0.removeFirst()
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$MetadataSampleInfo r0 = (com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.MetadataSampleInfo) r0
            int r1 = r13.pendingMetadataSampleBytes
            int r2 = r0.size
            int r1 = r1 - r2
            r13.pendingMetadataSampleBytes = r1
            long r1 = r0.sampleTimeUs
            boolean r3 = r0.sampleTimeIsRelative
            if (r3 == 0) goto L1e
            long r1 = r1 + r14
        L1e:
            com.google.android.exoplayer2.util.TimestampAdjuster r3 = r13.timestampAdjuster
            if (r3 == 0) goto L26
            long r1 = r3.adjustSampleTimestamp(r1)
        L26:
            com.google.android.exoplayer2.extractor.TrackOutput[] r10 = r13.emsgTrackOutputs
            int r11 = r10.length
            r3 = 0
            r12 = 0
        L2b:
            if (r12 >= r11) goto L0
            r3 = r10[r12]
            r6 = 1
            int r7 = r0.size
            int r8 = r13.pendingMetadataSampleBytes
            r9 = 0
            r4 = r1
            r3.sampleMetadata(r4, r6, r7, r8, r9)
            int r12 = r12 + 1
            goto L2b
        L3c:
            return
    }

    private static long parseMehd(com.google.android.exoplayer2.util.ParsableByteArray r2) {
            r0 = 8
            r2.setPosition(r0)
            int r0 = r2.readInt()
            int r0 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(r0)
            if (r0 != 0) goto L14
            long r0 = r2.readUnsignedInt()
            goto L18
        L14:
            long r0 = r2.readUnsignedLongToLong()
        L18:
            return r0
    }

    private static void parseMoof(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r5, android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle> r6, boolean r7, int r8, byte[] r9) throws com.google.android.exoplayer2.ParserException {
            java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r5.containerChildren
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1e
            java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r2 = r5.containerChildren
            java.lang.Object r2 = r2.get(r1)
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r2 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r2
            int r3 = r2.type
            r4 = 1953653094(0x74726166, float:7.6813435E31)
            if (r3 != r4) goto L1b
            parseTraf(r2, r6, r7, r8, r9)
        L1b:
            int r1 = r1 + 1
            goto L7
        L1e:
            return
    }

    private static void parseSaio(com.google.android.exoplayer2.util.ParsableByteArray r5, com.google.android.exoplayer2.extractor.mp4.TrackFragment r6) throws com.google.android.exoplayer2.ParserException {
            r0 = 8
            r5.setPosition(r0)
            int r1 = r5.readInt()
            int r2 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomFlags(r1)
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L14
            r5.skipBytes(r0)
        L14:
            int r0 = r5.readUnsignedIntToInt()
            if (r0 != r3) goto L2f
            int r0 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(r1)
            long r1 = r6.auxiliaryDataPosition
            if (r0 != 0) goto L27
            long r3 = r5.readUnsignedInt()
            goto L2b
        L27:
            long r3 = r5.readUnsignedLongToLong()
        L2b:
            long r1 = r1 + r3
            r6.auxiliaryDataPosition = r1
            return
        L2f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Unexpected saio entry count: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r6 = 0
            com.google.android.exoplayer2.ParserException r5 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r5, r6)
            throw r5
    }

    private static void parseSaiz(com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r6, com.google.android.exoplayer2.util.ParsableByteArray r7, com.google.android.exoplayer2.extractor.mp4.TrackFragment r8) throws com.google.android.exoplayer2.ParserException {
            int r6 = r6.perSampleIvSize
            r0 = 8
            r7.setPosition(r0)
            int r1 = r7.readInt()
            int r1 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomFlags(r1)
            r2 = 1
            r1 = r1 & r2
            if (r1 != r2) goto L16
            r7.skipBytes(r0)
        L16:
            int r0 = r7.readUnsignedByte()
            int r1 = r7.readUnsignedIntToInt()
            int r3 = r8.sampleCount
            if (r1 > r3) goto L54
            r3 = 0
            if (r0 != 0) goto L3a
            boolean[] r0 = r8.sampleHasSubsampleEncryptionTable
            r2 = 0
            r4 = 0
        L29:
            if (r2 >= r1) goto L47
            int r5 = r7.readUnsignedByte()
            int r4 = r4 + r5
            if (r5 <= r6) goto L34
            r5 = 1
            goto L35
        L34:
            r5 = 0
        L35:
            r0[r2] = r5
            int r2 = r2 + 1
            goto L29
        L3a:
            if (r0 <= r6) goto L3d
            goto L3e
        L3d:
            r2 = 0
        L3e:
            int r0 = r0 * r1
            int r4 = r0 + 0
            boolean[] r6 = r8.sampleHasSubsampleEncryptionTable
            java.util.Arrays.fill(r6, r3, r1, r2)
        L47:
            boolean[] r6 = r8.sampleHasSubsampleEncryptionTable
            int r7 = r8.sampleCount
            java.util.Arrays.fill(r6, r1, r7, r3)
            if (r4 <= 0) goto L53
            r8.initEncryptionData(r4)
        L53:
            return
        L54:
            java.lang.String r6 = "Saiz sample count "
            java.lang.String r7 = " is greater than fragment sample count"
            java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r6, r1, r7)
            int r7 = r8.sampleCount
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 0
            com.google.android.exoplayer2.ParserException r6 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r6, r7)
            throw r6
    }

    private static void parseSampleGroups(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r17, @androidx.annotation.Nullable java.lang.String r18, com.google.android.exoplayer2.extractor.mp4.TrackFragment r19) throws com.google.android.exoplayer2.ParserException {
            r0 = r17
            r1 = r19
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = 0
        L9:
            java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom> r7 = r0.leafChildren
            int r7 = r7.size()
            if (r4 >= r7) goto L44
            java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom> r7 = r0.leafChildren
            java.lang.Object r7 = r7.get(r4)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r7 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r7
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r7.data
            int r7 = r7.type
            r9 = 1935828848(0x73626770, float:1.7937577E31)
            r10 = 1936025959(0x73656967, float:1.817587E31)
            r11 = 12
            if (r7 != r9) goto L32
            r8.setPosition(r11)
            int r7 = r8.readInt()
            if (r7 != r10) goto L41
            r5 = r8
            goto L41
        L32:
            r9 = 1936158820(0x73677064, float:1.8336489E31)
            if (r7 != r9) goto L41
            r8.setPosition(r11)
            int r7 = r8.readInt()
            if (r7 != r10) goto L41
            r6 = r8
        L41:
            int r4 = r4 + 1
            goto L9
        L44:
            if (r5 == 0) goto Le5
            if (r6 != 0) goto L4a
            goto Le5
        L4a:
            r0 = 8
            r5.setPosition(r0)
            int r4 = r5.readInt()
            int r4 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(r4)
            r7 = 4
            r5.skipBytes(r7)
            r8 = 1
            if (r4 != r8) goto L61
            r5.skipBytes(r7)
        L61:
            int r4 = r5.readInt()
            if (r4 != r8) goto Lde
            r6.setPosition(r0)
            int r0 = r6.readInt()
            int r0 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(r0)
            r6.skipBytes(r7)
            if (r0 != r8) goto L89
            long r4 = r6.readUnsignedInt()
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L82
            goto L8f
        L82:
            java.lang.String r0 = "Variable length description in sgpd found (unsupported)"
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature(r0)
            throw r0
        L89:
            r4 = 2
            if (r0 < r4) goto L8f
            r6.skipBytes(r7)
        L8f:
            long r4 = r6.readUnsignedInt()
            r9 = 1
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 != 0) goto Ld7
            r6.skipBytes(r8)
            int r0 = r6.readUnsignedByte()
            r4 = r0 & 240(0xf0, float:3.36E-43)
            int r14 = r4 >> 4
            r15 = r0 & 15
            int r0 = r6.readUnsignedByte()
            if (r0 != r8) goto Lae
            r10 = 1
            goto Laf
        Lae:
            r10 = 0
        Laf:
            if (r10 != 0) goto Lb2
            return
        Lb2:
            int r12 = r6.readUnsignedByte()
            r0 = 16
            byte[] r13 = new byte[r0]
            r6.readBytes(r13, r3, r0)
            if (r12 != 0) goto Lc8
            int r0 = r6.readUnsignedByte()
            byte[] r2 = new byte[r0]
            r6.readBytes(r2, r3, r0)
        Lc8:
            r16 = r2
            r1.definesEncryptionData = r8
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r0 = new com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox
            r9 = r0
            r11 = r18
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r1.trackEncryptionBox = r0
            return
        Ld7:
            java.lang.String r0 = "Entry count in sgpd != 1 (unsupported)."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature(r0)
            throw r0
        Lde:
            java.lang.String r0 = "Entry count in sbgp != 1 (unsupported)."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature(r0)
            throw r0
        Le5:
            return
    }

    private static void parseSenc(com.google.android.exoplayer2.util.ParsableByteArray r3, int r4, com.google.android.exoplayer2.extractor.mp4.TrackFragment r5) throws com.google.android.exoplayer2.ParserException {
            int r4 = r4 + 8
            r3.setPosition(r4)
            int r4 = r3.readInt()
            int r4 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomFlags(r4)
            r0 = r4 & 1
            if (r0 != 0) goto L52
            r4 = r4 & 2
            r0 = 0
            if (r4 == 0) goto L18
            r4 = 1
            goto L19
        L18:
            r4 = 0
        L19:
            int r1 = r3.readUnsignedIntToInt()
            if (r1 != 0) goto L27
            boolean[] r3 = r5.sampleHasSubsampleEncryptionTable
            int r4 = r5.sampleCount
            java.util.Arrays.fill(r3, r0, r4, r0)
            return
        L27:
            int r2 = r5.sampleCount
            if (r1 != r2) goto L3b
            boolean[] r2 = r5.sampleHasSubsampleEncryptionTable
            java.util.Arrays.fill(r2, r0, r1, r4)
            int r4 = r3.bytesLeft()
            r5.initEncryptionData(r4)
            r5.fillEncryptionData(r3)
            return
        L3b:
            java.lang.String r3 = "Senc sample count "
            java.lang.String r4 = " is different from fragment sample count"
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r3, r1, r4)
            int r4 = r5.sampleCount
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            com.google.android.exoplayer2.ParserException r3 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r3, r4)
            throw r3
        L52:
            java.lang.String r3 = "Overriding TrackEncryptionBox parameters is unsupported."
            com.google.android.exoplayer2.ParserException r3 = com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature(r3)
            throw r3
    }

    private static void parseSenc(com.google.android.exoplayer2.util.ParsableByteArray r1, com.google.android.exoplayer2.extractor.mp4.TrackFragment r2) throws com.google.android.exoplayer2.ParserException {
            r0 = 0
            parseSenc(r1, r0, r2)
            return
    }

    private static android.util.Pair<java.lang.Long, com.google.android.exoplayer2.extractor.ChunkIndex> parseSidx(com.google.android.exoplayer2.util.ParsableByteArray r25, long r26) throws com.google.android.exoplayer2.ParserException {
            r0 = r25
            r1 = 8
            r0.setPosition(r1)
            int r1 = r25.readInt()
            int r1 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(r1)
            r2 = 4
            r0.skipBytes(r2)
            long r9 = r25.readUnsignedInt()
            if (r1 != 0) goto L22
            long r3 = r25.readUnsignedInt()
            long r5 = r25.readUnsignedInt()
            goto L2a
        L22:
            long r3 = r25.readUnsignedLongToLong()
            long r5 = r25.readUnsignedLongToLong()
        L2a:
            long r5 = r5 + r26
            r11 = r3
            r13 = r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            r3 = r11
            r7 = r9
            long r15 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r3, r5, r7)
            r1 = 2
            r0.skipBytes(r1)
            int r1 = r25.readUnsignedShort()
            int[] r7 = new int[r1]
            long[] r8 = new long[r1]
            long[] r5 = new long[r1]
            long[] r6 = new long[r1]
            r3 = 0
            r3 = r11
            r17 = r15
            r11 = 0
        L4c:
            if (r11 >= r1) goto La3
            int r12 = r25.readInt()
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = r12 & r19
            if (r19 != 0) goto L9b
            long r19 = r25.readUnsignedInt()
            r21 = 2147483647(0x7fffffff, float:NaN)
            r12 = r12 & r21
            r7[r11] = r12
            r8[r11] = r13
            r6[r11] = r17
            long r17 = r3 + r19
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r3 = r17
            r12 = r5
            r2 = r6
            r5 = r19
            r26 = r1
            r1 = r7
            r22 = r8
            r7 = r9
            long r3 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r3, r5, r7)
            r5 = r2[r11]
            long r5 = r3 - r5
            r12[r11] = r5
            r5 = 4
            r0.skipBytes(r5)
            r6 = r1[r11]
            long r6 = (long) r6
            long r13 = r13 + r6
            int r11 = r11 + 1
            r7 = r1
            r6 = r2
            r5 = r12
            r8 = r22
            r2 = 4
            r1 = r26
            r23 = r3
            r3 = r17
            r17 = r23
            goto L4c
        L9b:
            r0 = 0
            java.lang.String r1 = "Unhandled indirect reference"
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r1, r0)
            throw r0
        La3:
            r12 = r5
            r2 = r6
            r1 = r7
            r22 = r8
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            com.google.android.exoplayer2.extractor.ChunkIndex r3 = new com.google.android.exoplayer2.extractor.ChunkIndex
            r4 = r22
            r3.<init>(r1, r4, r12, r2)
            android.util.Pair r0 = android.util.Pair.create(r0, r3)
            return r0
    }

    private static long parseTfdt(com.google.android.exoplayer2.util.ParsableByteArray r2) {
            r0 = 8
            r2.setPosition(r0)
            int r0 = r2.readInt()
            int r0 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(r0)
            r1 = 1
            if (r0 != r1) goto L15
            long r0 = r2.readUnsignedLongToLong()
            goto L19
        L15:
            long r0 = r2.readUnsignedInt()
        L19:
            return r0
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle parseTfhd(com.google.android.exoplayer2.util.ParsableByteArray r4, android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle> r5, boolean r6) {
            r0 = 8
            r4.setPosition(r0)
            int r0 = r4.readInt()
            int r0 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomFlags(r0)
            int r1 = r4.readInt()
            if (r6 == 0) goto L19
            r6 = 0
            java.lang.Object r5 = r5.valueAt(r6)
            goto L1d
        L19:
            java.lang.Object r5 = r5.get(r1)
        L1d:
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r5 = (com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle) r5
            if (r5 != 0) goto L23
            r4 = 0
            return r4
        L23:
            r6 = r0 & 1
            if (r6 == 0) goto L31
            long r1 = r4.readUnsignedLongToLong()
            com.google.android.exoplayer2.extractor.mp4.TrackFragment r6 = r5.fragment
            r6.dataPosition = r1
            r6.auxiliaryDataPosition = r1
        L31:
            com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r6 = r5.defaultSampleValues
            r1 = r0 & 2
            if (r1 == 0) goto L3e
            int r1 = r4.readInt()
            int r1 = r1 + (-1)
            goto L40
        L3e:
            int r1 = r6.sampleDescriptionIndex
        L40:
            r2 = r0 & 8
            if (r2 == 0) goto L49
            int r2 = r4.readInt()
            goto L4b
        L49:
            int r2 = r6.duration
        L4b:
            r3 = r0 & 16
            if (r3 == 0) goto L54
            int r3 = r4.readInt()
            goto L56
        L54:
            int r3 = r6.size
        L56:
            r0 = r0 & 32
            if (r0 == 0) goto L5f
            int r4 = r4.readInt()
            goto L61
        L5f:
            int r4 = r6.flags
        L61:
            com.google.android.exoplayer2.extractor.mp4.TrackFragment r6 = r5.fragment
            com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r0 = new com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues
            r0.<init>(r1, r2, r3, r4)
            r6.header = r0
            return r5
    }

    private static void parseTraf(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r5, android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle> r6, boolean r7, int r8, byte[] r9) throws com.google.android.exoplayer2.ParserException {
            r0 = 1952868452(0x74666864, float:7.301914E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r0 = r5.getLeafAtomOfType(r0)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r0 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r0.data
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r6 = parseTfhd(r0, r6, r7)
            if (r6 != 0) goto L16
            return
        L16:
            com.google.android.exoplayer2.extractor.mp4.TrackFragment r7 = r6.fragment
            long r0 = r7.nextFragmentDecodeTime
            boolean r2 = r7.nextFragmentDecodeTimeIncludesMoov
            r6.resetFragmentInfo()
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle.access$002(r6)
            r3 = 1952867444(0x74666474, float:7.3014264E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r3 = r5.getLeafAtomOfType(r3)
            if (r3 == 0) goto L3b
            r4 = r8 & 2
            if (r4 != 0) goto L3b
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.data
            long r0 = parseTfdt(r0)
            r7.nextFragmentDecodeTime = r0
            r0 = 1
            r7.nextFragmentDecodeTimeIncludesMoov = r0
            goto L3f
        L3b:
            r7.nextFragmentDecodeTime = r0
            r7.nextFragmentDecodeTimeIncludesMoov = r2
        L3f:
            parseTruns(r5, r6, r8)
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r6 = r6.moovSampleTable
            com.google.android.exoplayer2.extractor.mp4.Track r6 = r6.track
            com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r8 = r7.header
            java.lang.Object r8 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r8 = (com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues) r8
            int r8 = r8.sampleDescriptionIndex
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r6 = r6.getSampleDescriptionEncryptionBox(r8)
            r8 = 1935763834(0x7361697a, float:1.785898E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r8 = r5.getLeafAtomOfType(r8)
            if (r8 == 0) goto L68
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r0 = (com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) r0
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r8.data
            parseSaiz(r0, r8, r7)
        L68:
            r8 = 1935763823(0x7361696f, float:1.7858967E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r8 = r5.getLeafAtomOfType(r8)
            if (r8 == 0) goto L76
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r8.data
            parseSaio(r8, r7)
        L76:
            r8 = 1936027235(0x73656e63, float:1.8177412E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r8 = r5.getLeafAtomOfType(r8)
            if (r8 == 0) goto L84
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r8.data
            parseSenc(r8, r7)
        L84:
            if (r6 == 0) goto L89
            java.lang.String r6 = r6.schemeType
            goto L8a
        L89:
            r6 = 0
        L8a:
            parseSampleGroups(r5, r6, r7)
            java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom> r6 = r5.leafChildren
            int r6 = r6.size()
            r8 = 0
        L94:
            if (r8 >= r6) goto Lad
            java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom> r0 = r5.leafChildren
            java.lang.Object r0 = r0.get(r8)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r0 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r0
            int r1 = r0.type
            r2 = 1970628964(0x75756964, float:3.1109627E32)
            if (r1 != r2) goto Laa
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r0.data
            parseUuid(r0, r7, r9)
        Laa:
            int r8 = r8 + 1
            goto L94
        Lad:
            return
    }

    private static android.util.Pair<java.lang.Integer, com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues> parseTrex(com.google.android.exoplayer2.util.ParsableByteArray r5) {
            r0 = 12
            r5.setPosition(r0)
            int r0 = r5.readInt()
            int r1 = r5.readInt()
            int r1 = r1 + (-1)
            int r2 = r5.readInt()
            int r3 = r5.readInt()
            int r5 = r5.readInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r4 = new com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues
            r4.<init>(r1, r2, r3, r5)
            android.util.Pair r5 = android.util.Pair.create(r0, r4)
            return r5
    }

    private static int parseTrun(com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle r32, int r33, int r34, com.google.android.exoplayer2.util.ParsableByteArray r35, int r36) throws com.google.android.exoplayer2.ParserException {
            r0 = r32
            r1 = 8
            r2 = r35
            r2.setPosition(r1)
            int r1 = r35.readInt()
            int r1 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomFlags(r1)
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r3 = r0.moovSampleTable
            com.google.android.exoplayer2.extractor.mp4.Track r3 = r3.track
            com.google.android.exoplayer2.extractor.mp4.TrackFragment r4 = r0.fragment
            com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r5 = r4.header
            java.lang.Object r5 = com.google.android.exoplayer2.util.Util.castNonNull(r5)
            com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r5 = (com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues) r5
            int[] r6 = r4.trunLength
            int r7 = r35.readUnsignedIntToInt()
            r6[r33] = r7
            long[] r6 = r4.trunDataPosition
            long r7 = r4.dataPosition
            r6[r33] = r7
            r7 = r1 & 1
            if (r7 == 0) goto L3b
            r7 = r6[r33]
            int r9 = r35.readInt()
            long r9 = (long) r9
            long r7 = r7 + r9
            r6[r33] = r7
        L3b:
            r6 = r1 & 4
            r7 = 0
            if (r6 == 0) goto L42
            r6 = 1
            goto L43
        L42:
            r6 = 0
        L43:
            int r9 = r5.flags
            if (r6 == 0) goto L4b
            int r9 = r35.readInt()
        L4b:
            r10 = r1 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L51
            r10 = 1
            goto L52
        L51:
            r10 = 0
        L52:
            r11 = r1 & 512(0x200, float:7.17E-43)
            if (r11 == 0) goto L58
            r11 = 1
            goto L59
        L58:
            r11 = 0
        L59:
            r12 = r1 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L5f
            r12 = 1
            goto L60
        L5f:
            r12 = 0
        L60:
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L66
            r1 = 1
            goto L67
        L66:
            r1 = 0
        L67:
            r13 = 0
            boolean r15 = isEdtsListDurationForEntireMediaTimeline(r3)
            if (r15 == 0) goto L7a
            long[] r13 = r3.editListMediaTimes
            java.lang.Object r13 = com.google.android.exoplayer2.util.Util.castNonNull(r13)
            long[] r13 = (long[]) r13
            r14 = r13[r7]
            r13 = r14
        L7a:
            int[] r15 = r4.sampleSizeTable
            long[] r7 = r4.samplePresentationTimesUs
            boolean[] r8 = r4.sampleIsSyncFrameTable
            int r2 = r3.type
            r16 = r9
            r9 = 2
            if (r2 != r9) goto L8e
            r2 = 1
            r9 = r34 & 1
            if (r9 == 0) goto L8e
            r2 = 1
            goto L8f
        L8e:
            r2 = 0
        L8f:
            int[] r9 = r4.trunLength
            r9 = r9[r33]
            int r9 = r36 + r9
            r34 = r2
            long r2 = r3.timescale
            r23 = r7
            r24 = r8
            long r7 = r4.nextFragmentDecodeTime
            r25 = r2
            r2 = r7
            r7 = r36
        La4:
            if (r7 >= r9) goto L133
            if (r10 == 0) goto Lad
            int r8 = r35.readInt()
            goto Laf
        Lad:
            int r8 = r5.duration
        Laf:
            int r8 = checkNonNegative(r8)
            if (r11 == 0) goto Lbc
            int r17 = r35.readInt()
            r27 = r10
            goto Lc2
        Lbc:
            r27 = r10
            int r10 = r5.size
            r17 = r10
        Lc2:
            int r10 = checkNonNegative(r17)
            if (r12 == 0) goto Ld1
            int r17 = r35.readInt()
            r28 = r6
            r6 = r17
            goto Lde
        Ld1:
            if (r7 != 0) goto Lda
            if (r6 == 0) goto Lda
            r28 = r6
            r6 = r16
            goto Lde
        Lda:
            r28 = r6
            int r6 = r5.flags
        Lde:
            if (r1 == 0) goto Led
            int r17 = r35.readInt()
            r29 = r1
            r30 = r11
            r31 = r12
            r1 = r17
            goto Lf4
        Led:
            r29 = r1
            r30 = r11
            r31 = r12
            r1 = 0
        Lf4:
            long r11 = (long) r1
            long r11 = r11 + r2
            long r17 = r11 - r13
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r25
            long r11 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r17, r19, r21)
            r23[r7] = r11
            boolean r1 = r4.nextFragmentDecodeTimeIncludesMoov
            if (r1 != 0) goto L110
            r11 = r23[r7]
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r1 = r0.moovSampleTable
            long r0 = r1.durationUs
            long r11 = r11 + r0
            r23[r7] = r11
        L110:
            r15[r7] = r10
            int r0 = r6 >> 16
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L11e
            if (r34 == 0) goto L11c
            if (r7 != 0) goto L11e
        L11c:
            r0 = 1
            goto L11f
        L11e:
            r0 = 0
        L11f:
            r24[r7] = r0
            long r10 = (long) r8
            long r2 = r2 + r10
            int r7 = r7 + 1
            r0 = r32
            r10 = r27
            r6 = r28
            r1 = r29
            r11 = r30
            r12 = r31
            goto La4
        L133:
            r4.nextFragmentDecodeTime = r2
            return r9
    }

    private static void parseTruns(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r8, com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle r9, int r10) throws com.google.android.exoplayer2.ParserException {
            java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom> r8 = r8.leafChildren
            int r0 = r8.size()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        La:
            r5 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 >= r0) goto L2c
            java.lang.Object r6 = r8.get(r2)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r6 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r6
            int r7 = r6.type
            if (r7 != r5) goto L29
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r6.data
            r6 = 12
            r5.setPosition(r6)
            int r5 = r5.readUnsignedIntToInt()
            if (r5 <= 0) goto L29
            int r4 = r4 + r5
            int r3 = r3 + 1
        L29:
            int r2 = r2 + 1
            goto La
        L2c:
            r9.currentTrackRunIndex = r1
            r9.currentSampleInTrackRun = r1
            r9.currentSampleIndex = r1
            com.google.android.exoplayer2.extractor.mp4.TrackFragment r2 = r9.fragment
            r2.initTables(r3, r4)
            r2 = 0
            r3 = 0
        L39:
            if (r1 >= r0) goto L52
            java.lang.Object r4 = r8.get(r1)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r4 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r4
            int r6 = r4.type
            if (r6 != r5) goto L4f
            int r6 = r2 + 1
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r4.data
            int r2 = parseTrun(r9, r2, r10, r4, r3)
            r3 = r2
            r2 = r6
        L4f:
            int r1 = r1 + 1
            goto L39
        L52:
            return
    }

    private static void parseUuid(com.google.android.exoplayer2.util.ParsableByteArray r2, com.google.android.exoplayer2.extractor.mp4.TrackFragment r3, byte[] r4) throws com.google.android.exoplayer2.ParserException {
            r0 = 8
            r2.setPosition(r0)
            r0 = 0
            r1 = 16
            r2.readBytes(r4, r0, r1)
            byte[] r0 = com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE
            boolean r4 = java.util.Arrays.equals(r4, r0)
            if (r4 != 0) goto L14
            return
        L14:
            parseSenc(r2, r1, r3)
            return
    }

    private void processAtomEnded(long r4) throws com.google.android.exoplayer2.ParserException {
            r3 = this;
        L0:
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r3.containerAtoms
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L22
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r3.containerAtoms
            java.lang.Object r0 = r0.peek()
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r0 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r0
            long r0 = r0.endPosition
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L22
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r3.containerAtoms
            java.lang.Object r0 = r0.pop()
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r0 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r0
            r3.onContainerAtomRead(r0)
            goto L0
        L22:
            r3.enterReadingAtomHeaderState()
            return
    }

    private boolean readAtomHeader(com.google.android.exoplayer2.extractor.ExtractorInput r12) throws java.io.IOException {
            r11 = this;
            int r0 = r11.atomHeaderBytesRead
            r1 = 8
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L2c
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r11.atomHeader
            byte[] r0 = r0.getData()
            boolean r0 = r12.readFully(r0, r2, r1, r3)
            if (r0 != 0) goto L15
            return r2
        L15:
            r11.atomHeaderBytesRead = r1
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r11.atomHeader
            r0.setPosition(r2)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r11.atomHeader
            long r4 = r0.readUnsignedInt()
            r11.atomSize = r4
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r11.atomHeader
            int r0 = r0.readInt()
            r11.atomType = r0
        L2c:
            long r4 = r11.atomSize
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4b
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r11.atomHeader
            byte[] r0 = r0.getData()
            r12.readFully(r0, r1, r1)
            int r0 = r11.atomHeaderBytesRead
            int r0 = r0 + r1
            r11.atomHeaderBytesRead = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r11.atomHeader
            long r4 = r0.readUnsignedLongToLong()
            r11.atomSize = r4
            goto L7c
        L4b:
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L7c
            long r4 = r12.getLength()
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L6d
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r11.containerAtoms
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6d
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r11.containerAtoms
            java.lang.Object r0 = r0.peek()
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r0 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r0
            long r4 = r0.endPosition
        L6d:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L7c
            long r6 = r12.getPosition()
            long r4 = r4 - r6
            int r0 = r11.atomHeaderBytesRead
            long r6 = (long) r0
            long r4 = r4 + r6
            r11.atomSize = r4
        L7c:
            long r4 = r11.atomSize
            int r0 = r11.atomHeaderBytesRead
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L157
            long r4 = r12.getPosition()
            int r0 = r11.atomHeaderBytesRead
            long r6 = (long) r0
            long r4 = r4 - r6
            int r0 = r11.atomType
            r6 = 1835295092(0x6d646174, float:4.4175247E27)
            r7 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r0 == r7) goto L99
            if (r0 != r6) goto Lab
        L99:
            boolean r0 = r11.haveOutputSeekMap
            if (r0 != 0) goto Lab
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r11.extractorOutput
            com.google.android.exoplayer2.extractor.SeekMap$Unseekable r8 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
            long r9 = r11.durationUs
            r8.<init>(r9, r4)
            r0.seekMap(r8)
            r11.haveOutputSeekMap = r3
        Lab:
            int r0 = r11.atomType
            if (r0 != r7) goto Lcb
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r0 = r11.trackBundles
            int r0 = r0.size()
            r7 = 0
        Lb6:
            if (r7 >= r0) goto Lcb
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r8 = r11.trackBundles
            java.lang.Object r8 = r8.valueAt(r7)
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r8 = (com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle) r8
            com.google.android.exoplayer2.extractor.mp4.TrackFragment r8 = r8.fragment
            r8.atomPosition = r4
            r8.auxiliaryDataPosition = r4
            r8.dataPosition = r4
            int r7 = r7 + 1
            goto Lb6
        Lcb:
            int r0 = r11.atomType
            r7 = 0
            if (r0 != r6) goto Ldb
            r11.currentTrackBundle = r7
            long r0 = r11.atomSize
            long r4 = r4 + r0
            r11.endOfMdatPosition = r4
            r12 = 2
            r11.parserState = r12
            return r3
        Ldb:
            boolean r0 = shouldParseContainerAtom(r0)
            if (r0 == 0) goto L108
            long r0 = r12.getPosition()
            long r4 = r11.atomSize
            long r0 = r0 + r4
            r4 = 8
            long r0 = r0 - r4
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r12 = r11.containerAtoms
            com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r2 = new com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom
            int r4 = r11.atomType
            r2.<init>(r4, r0)
            r12.push(r2)
            long r4 = r11.atomSize
            int r12 = r11.atomHeaderBytesRead
            long r6 = (long) r12
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 != 0) goto L104
            r11.processAtomEnded(r0)
            goto L14f
        L104:
            r11.enterReadingAtomHeaderState()
            goto L14f
        L108:
            int r12 = r11.atomType
            boolean r12 = shouldParseLeafAtom(r12)
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r12 == 0) goto L145
            int r12 = r11.atomHeaderBytesRead
            if (r12 != r1) goto L13e
            long r6 = r11.atomSize
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 > 0) goto L137
            com.google.android.exoplayer2.util.ParsableByteArray r12 = new com.google.android.exoplayer2.util.ParsableByteArray
            long r4 = r11.atomSize
            int r0 = (int) r4
            r12.<init>(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r11.atomHeader
            byte[] r0 = r0.getData()
            byte[] r4 = r12.getData()
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            r11.atomData = r12
            r11.parserState = r3
            goto L14f
        L137:
            java.lang.String r12 = "Leaf atom with length > 2147483647 (unsupported)."
            com.google.android.exoplayer2.ParserException r12 = com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature(r12)
            throw r12
        L13e:
            java.lang.String r12 = "Leaf atom defines extended atom size (unsupported)."
            com.google.android.exoplayer2.ParserException r12 = com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature(r12)
            throw r12
        L145:
            long r0 = r11.atomSize
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 > 0) goto L150
            r11.atomData = r7
            r11.parserState = r3
        L14f:
            return r3
        L150:
            java.lang.String r12 = "Skipping atom with length > 2147483647 (unsupported)."
            com.google.android.exoplayer2.ParserException r12 = com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature(r12)
            throw r12
        L157:
            java.lang.String r12 = "Atom size less than header length (unsupported)."
            com.google.android.exoplayer2.ParserException r12 = com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature(r12)
            throw r12
    }

    private void readAtomPayload(com.google.android.exoplayer2.extractor.ExtractorInput r5) throws java.io.IOException {
            r4 = this;
            long r0 = r4.atomSize
            int r1 = (int) r0
            int r0 = r4.atomHeaderBytesRead
            int r1 = r1 - r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.atomData
            if (r0 == 0) goto L22
            byte[] r2 = r0.getData()
            r3 = 8
            r5.readFully(r2, r3, r1)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r1 = new com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom
            int r2 = r4.atomType
            r1.<init>(r2, r0)
            long r2 = r5.getPosition()
            r4.onLeafAtomRead(r1, r2)
            goto L25
        L22:
            r5.skipFully(r1)
        L25:
            long r0 = r5.getPosition()
            r4.processAtomEnded(r0)
            return
    }

    private void readEncryptionData(com.google.android.exoplayer2.extractor.ExtractorInput r10) throws java.io.IOException {
            r9 = this;
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r0 = r9.trackBundles
            int r0 = r0.size()
            r1 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            r5 = r1
        Le:
            if (r4 >= r0) goto L31
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r6 = r9.trackBundles
            java.lang.Object r6 = r6.valueAt(r4)
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r6 = (com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle) r6
            com.google.android.exoplayer2.extractor.mp4.TrackFragment r6 = r6.fragment
            boolean r7 = r6.sampleEncryptionDataNeedsFill
            if (r7 == 0) goto L2e
            long r6 = r6.auxiliaryDataPosition
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 >= 0) goto L2e
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r2 = r9.trackBundles
            java.lang.Object r2 = r2.valueAt(r4)
            r5 = r2
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r5 = (com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle) r5
            r2 = r6
        L2e:
            int r4 = r4 + 1
            goto Le
        L31:
            if (r5 != 0) goto L37
            r10 = 3
            r9.parserState = r10
            return
        L37:
            long r6 = r10.getPosition()
            long r2 = r2 - r6
            int r0 = (int) r2
            if (r0 < 0) goto L48
            r10.skipFully(r0)
            com.google.android.exoplayer2.extractor.mp4.TrackFragment r0 = r5.fragment
            r0.fillEncryptionData(r10)
            return
        L48:
            java.lang.String r10 = "Offset to encryption data was negative."
            com.google.android.exoplayer2.ParserException r10 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r10, r1)
            throw r10
    }

    private boolean readSample(com.google.android.exoplayer2.extractor.ExtractorInput r17) throws java.io.IOException {
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r2 = r0.currentTrackBundle
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L43
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r2 = r0.trackBundles
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r2 = getNextTrackBundle(r2)
            if (r2 != 0) goto L2a
            long r5 = r0.endOfMdatPosition
            long r7 = r17.getPosition()
            long r5 = r5 - r7
            int r2 = (int) r5
            if (r2 < 0) goto L23
            r1.skipFully(r2)
            r16.enterReadingAtomHeaderState()
            return r4
        L23:
            java.lang.String r1 = "Offset to end of mdat was negative."
            com.google.android.exoplayer2.ParserException r1 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r1, r3)
            throw r1
        L2a:
            long r5 = r2.getCurrentSampleOffset()
            long r7 = r17.getPosition()
            long r5 = r5 - r7
            int r6 = (int) r5
            if (r6 >= 0) goto L3e
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Ignoring negative offset to sample data."
            com.google.android.exoplayer2.util.Log.w(r5, r6)
            r6 = 0
        L3e:
            r1.skipFully(r6)
            r0.currentTrackBundle = r2
        L43:
            int r5 = r0.parserState
            r6 = 3
            r7 = 4
            r8 = 1
            if (r5 != r6) goto Lb7
            int r5 = r2.getCurrentSampleSize()
            r0.sampleSize = r5
            int r9 = r2.currentSampleIndex
            int r10 = r2.firstSampleToOutputIndex
            if (r9 >= r10) goto L67
            r1.skipFully(r5)
            r2.skipSampleEncryptionData()
            boolean r1 = r2.next()
            if (r1 != 0) goto L64
            r0.currentTrackBundle = r3
        L64:
            r0.parserState = r6
            return r8
        L67:
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r9 = r2.moovSampleTable
            com.google.android.exoplayer2.extractor.mp4.Track r9 = r9.track
            int r9 = r9.sampleTransformation
            if (r9 != r8) goto L77
            r9 = 8
            int r5 = r5 - r9
            r0.sampleSize = r5
            r1.skipFully(r9)
        L77:
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r5 = r2.moovSampleTable
            com.google.android.exoplayer2.extractor.mp4.Track r5 = r5.track
            com.google.android.exoplayer2.Format r5 = r5.format
            java.lang.String r5 = r5.sampleMimeType
            java.lang.String r9 = "audio/ac4"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto La4
            int r5 = r0.sampleSize
            r9 = 7
            int r5 = r2.outputSampleEncryptionData(r5, r9)
            r0.sampleBytesWritten = r5
            int r5 = r0.sampleSize
            com.google.android.exoplayer2.util.ParsableByteArray r10 = r0.scratch
            com.google.android.exoplayer2.audio.Ac4Util.getAc4SampleHeader(r5, r10)
            com.google.android.exoplayer2.extractor.TrackOutput r5 = r2.output
            com.google.android.exoplayer2.util.ParsableByteArray r10 = r0.scratch
            r5.sampleData(r10, r9)
            int r5 = r0.sampleBytesWritten
            int r5 = r5 + r9
            r0.sampleBytesWritten = r5
            goto Lac
        La4:
            int r5 = r0.sampleSize
            int r5 = r2.outputSampleEncryptionData(r5, r4)
            r0.sampleBytesWritten = r5
        Lac:
            int r5 = r0.sampleSize
            int r9 = r0.sampleBytesWritten
            int r5 = r5 + r9
            r0.sampleSize = r5
            r0.parserState = r7
            r0.sampleCurrentNalBytesRemaining = r4
        Lb7:
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r5 = r2.moovSampleTable
            com.google.android.exoplayer2.extractor.mp4.Track r5 = r5.track
            com.google.android.exoplayer2.extractor.TrackOutput r9 = r2.output
            long r10 = r2.getCurrentSamplePresentationTimeUs()
            com.google.android.exoplayer2.util.TimestampAdjuster r12 = r0.timestampAdjuster
            if (r12 == 0) goto Lc9
            long r10 = r12.adjustSampleTimestamp(r10)
        Lc9:
            r14 = r10
            int r10 = r5.nalUnitLengthFieldLength
            if (r10 == 0) goto L196
            com.google.android.exoplayer2.util.ParsableByteArray r10 = r0.nalPrefix
            byte[] r10 = r10.getData()
            r10[r4] = r4
            r10[r8] = r4
            r11 = 2
            r10[r11] = r4
            int r11 = r5.nalUnitLengthFieldLength
            int r12 = r11 + 1
            int r11 = 4 - r11
        Le1:
            int r13 = r0.sampleBytesWritten
            int r6 = r0.sampleSize
            if (r13 >= r6) goto L1a7
            int r6 = r0.sampleCurrentNalBytesRemaining
            if (r6 != 0) goto L138
            r1.readFully(r10, r11, r12)
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r0.nalPrefix
            r6.setPosition(r4)
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r0.nalPrefix
            int r6 = r6.readInt()
            if (r6 < r8) goto L131
            int r6 = r6 + (-1)
            r0.sampleCurrentNalBytesRemaining = r6
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r0.nalStartCode
            r6.setPosition(r4)
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r0.nalStartCode
            r9.sampleData(r6, r7)
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r0.nalPrefix
            r9.sampleData(r6, r8)
            com.google.android.exoplayer2.extractor.TrackOutput[] r6 = r0.ceaTrackOutputs
            int r6 = r6.length
            if (r6 <= 0) goto L121
            com.google.android.exoplayer2.Format r6 = r5.format
            java.lang.String r6 = r6.sampleMimeType
            r13 = r10[r7]
            boolean r6 = com.google.android.exoplayer2.util.NalUnitUtil.isNalUnitSei(r6, r13)
            if (r6 == 0) goto L121
            r6 = 1
            goto L122
        L121:
            r6 = 0
        L122:
            r0.processSeiNalUnitPayload = r6
            int r6 = r0.sampleBytesWritten
            int r6 = r6 + 5
            r0.sampleBytesWritten = r6
            int r6 = r0.sampleSize
            int r6 = r6 + r11
            r0.sampleSize = r6
            r6 = 3
            goto Le1
        L131:
            java.lang.String r1 = "Invalid NAL length"
            com.google.android.exoplayer2.ParserException r1 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r1, r3)
            throw r1
        L138:
            boolean r13 = r0.processSeiNalUnitPayload
            if (r13 == 0) goto L182
            com.google.android.exoplayer2.util.ParsableByteArray r13 = r0.nalBuffer
            r13.reset(r6)
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r0.nalBuffer
            byte[] r6 = r6.getData()
            int r13 = r0.sampleCurrentNalBytesRemaining
            r1.readFully(r6, r4, r13)
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r0.nalBuffer
            int r13 = r0.sampleCurrentNalBytesRemaining
            r9.sampleData(r6, r13)
            int r6 = r0.sampleCurrentNalBytesRemaining
            com.google.android.exoplayer2.util.ParsableByteArray r13 = r0.nalBuffer
            byte[] r13 = r13.getData()
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r0.nalBuffer
            int r7 = r7.limit()
            int r7 = com.google.android.exoplayer2.util.NalUnitUtil.unescapeStream(r13, r7)
            com.google.android.exoplayer2.util.ParsableByteArray r13 = r0.nalBuffer
            com.google.android.exoplayer2.Format r8 = r5.format
            java.lang.String r8 = r8.sampleMimeType
            java.lang.String r3 = "video/hevc"
            boolean r3 = r3.equals(r8)
            r13.setPosition(r3)
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r0.nalBuffer
            r3.setLimit(r7)
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r0.nalBuffer
            com.google.android.exoplayer2.extractor.TrackOutput[] r7 = r0.ceaTrackOutputs
            com.google.android.exoplayer2.extractor.CeaUtil.consume(r14, r3, r7)
            goto L186
        L182:
            int r6 = r9.sampleData(r1, r6, r4)
        L186:
            int r3 = r0.sampleBytesWritten
            int r3 = r3 + r6
            r0.sampleBytesWritten = r3
            int r3 = r0.sampleCurrentNalBytesRemaining
            int r3 = r3 - r6
            r0.sampleCurrentNalBytesRemaining = r3
            r3 = 0
            r6 = 3
            r7 = 4
            r8 = 1
            goto Le1
        L196:
            int r3 = r0.sampleBytesWritten
            int r5 = r0.sampleSize
            if (r3 >= r5) goto L1a7
            int r5 = r5 - r3
            int r3 = r9.sampleData(r1, r5, r4)
            int r5 = r0.sampleBytesWritten
            int r5 = r5 + r3
            r0.sampleBytesWritten = r5
            goto L196
        L1a7:
            int r12 = r2.getCurrentSampleFlags()
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r1 = r2.getEncryptionBoxIfEncrypted()
            if (r1 == 0) goto L1b4
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r1 = r1.cryptoData
            goto L1b5
        L1b4:
            r1 = 0
        L1b5:
            int r13 = r0.sampleSize
            r3 = 0
            r10 = r14
            r4 = r14
            r14 = r3
            r15 = r1
            r9.sampleMetadata(r10, r12, r13, r14, r15)
            r0.outputPendingMetadataSamples(r4)
            boolean r1 = r2.next()
            if (r1 != 0) goto L1cb
            r1 = 0
            r0.currentTrackBundle = r1
        L1cb:
            r1 = 3
            r0.parserState = r1
            r1 = 1
            return r1
    }

    private static boolean shouldParseContainerAtom(int r1) {
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r1 == r0) goto L30
            r0 = 1953653099(0x7472616b, float:7.681346E31)
            if (r1 == r0) goto L30
            r0 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r1 == r0) goto L30
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r1 == r0) goto L30
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r1 == r0) goto L30
            r0 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r1 == r0) goto L30
            r0 = 1953653094(0x74726166, float:7.6813435E31)
            if (r1 == r0) goto L30
            r0 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r1 == r0) goto L30
            r0 = 1701082227(0x65647473, float:6.742798E22)
            if (r1 != r0) goto L2e
            goto L30
        L2e:
            r1 = 0
            goto L31
        L30:
            r1 = 1
        L31:
            return r1
    }

    private static boolean shouldParseLeafAtom(int r1) {
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            if (r1 == r0) goto L8f
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            if (r1 == r0) goto L8f
            r0 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r1 == r0) goto L8f
            r0 = 1936286840(0x73696478, float:1.8491255E31)
            if (r1 == r0) goto L8f
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            if (r1 == r0) goto L8f
            r0 = 1937011827(0x73747473, float:1.9367711E31)
            if (r1 == r0) goto L8f
            r0 = 1668576371(0x63747473, float:4.5093966E21)
            if (r1 == r0) goto L8f
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            if (r1 == r0) goto L8f
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            if (r1 == r0) goto L8f
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r1 == r0) goto L8f
            r0 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r1 == r0) goto L8f
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r1 == r0) goto L8f
            r0 = 1937011571(0x73747373, float:1.9367401E31)
            if (r1 == r0) goto L8f
            r0 = 1952867444(0x74666474, float:7.3014264E31)
            if (r1 == r0) goto L8f
            r0 = 1952868452(0x74666864, float:7.301914E31)
            if (r1 == r0) goto L8f
            r0 = 1953196132(0x746b6864, float:7.46037E31)
            if (r1 == r0) goto L8f
            r0 = 1953654136(0x74726578, float:7.6818474E31)
            if (r1 == r0) goto L8f
            r0 = 1953658222(0x7472756e, float:7.683823E31)
            if (r1 == r0) goto L8f
            r0 = 1886614376(0x70737368, float:3.013775E29)
            if (r1 == r0) goto L8f
            r0 = 1935763834(0x7361697a, float:1.785898E31)
            if (r1 == r0) goto L8f
            r0 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r1 == r0) goto L8f
            r0 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r1 == r0) goto L8f
            r0 = 1970628964(0x75756964, float:3.1109627E32)
            if (r1 == r0) goto L8f
            r0 = 1935828848(0x73626770, float:1.7937577E31)
            if (r1 == r0) goto L8f
            r0 = 1936158820(0x73677064, float:1.8336489E31)
            if (r1 == r0) goto L8f
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r1 == r0) goto L8f
            r0 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r1 == r0) goto L8f
            r0 = 1701671783(0x656d7367, float:7.0083103E22)
            if (r1 != r0) goto L8d
            goto L8f
        L8d:
            r1 = 0
            goto L90
        L8f:
            r1 = 1
        L90:
            return r1
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r13) {
            r12 = this;
            r12.extractorOutput = r13
            r12.enterReadingAtomHeaderState()
            r12.initExtraTracks()
            com.google.android.exoplayer2.extractor.mp4.Track r0 = r12.sideloadedTrack
            if (r0 == 0) goto L3a
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r1 = new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle
            int r0 = r0.type
            r2 = 0
            com.google.android.exoplayer2.extractor.TrackOutput r13 = r13.track(r2, r0)
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r0 = new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable
            com.google.android.exoplayer2.extractor.mp4.Track r4 = r12.sideloadedTrack
            long[] r5 = new long[r2]
            int[] r6 = new int[r2]
            r7 = 0
            long[] r8 = new long[r2]
            int[] r9 = new int[r2]
            r10 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r3 = new com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues
            r3.<init>(r2, r2, r2, r2)
            r1.<init>(r13, r0, r3)
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r13 = r12.trackBundles
            r13.put(r2, r1)
            com.google.android.exoplayer2.extractor.ExtractorOutput r13 = r12.extractorOutput
            r13.endTracks()
        L3a:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r2, com.google.android.exoplayer2.extractor.PositionHolder r3) throws java.io.IOException {
            r1 = this;
        L0:
            int r3 = r1.parserState
            if (r3 == 0) goto L1a
            r0 = 1
            if (r3 == r0) goto L16
            r0 = 2
            if (r3 == r0) goto L12
            boolean r3 = r1.readSample(r2)
            if (r3 == 0) goto L0
            r2 = 0
            return r2
        L12:
            r1.readEncryptionData(r2)
            goto L0
        L16:
            r1.readAtomPayload(r2)
            goto L0
        L1a:
            boolean r3 = r1.readAtomHeader(r2)
            if (r3 != 0) goto L0
            r2 = -1
            return r2
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long r3, long r5) {
            r2 = this;
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r3 = r2.trackBundles
            int r3 = r3.size()
            r4 = 0
            r0 = 0
        L8:
            if (r0 >= r3) goto L18
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r1 = r2.trackBundles
            java.lang.Object r1 = r1.valueAt(r0)
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r1 = (com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle) r1
            r1.resetFragmentInfo()
            int r0 = r0 + 1
            goto L8
        L18:
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$MetadataSampleInfo> r3 = r2.pendingMetadataSampleInfos
            r3.clear()
            r2.pendingMetadataSampleBytes = r4
            r2.pendingSeekTimeUs = r5
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r3 = r2.containerAtoms
            r3.clear()
            r2.enterReadingAtomHeaderState()
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r1) throws java.io.IOException {
            r0 = this;
            boolean r1 = com.google.android.exoplayer2.extractor.mp4.Sniffer.sniffFragmented(r1)
            return r1
    }
}
