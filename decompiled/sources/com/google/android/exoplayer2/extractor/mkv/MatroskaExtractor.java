package com.google.android.exoplayer2.extractor.mkv;

/* JADX INFO: loaded from: classes.dex */
public class MatroskaExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    private static final int BLOCK_ADDITIONAL_ID_VP9_ITU_T_35 = 4;
    private static final int BLOCK_ADD_ID_TYPE_DVCC = 1685480259;
    private static final int BLOCK_ADD_ID_TYPE_DVVC = 1685485123;
    private static final int BLOCK_STATE_DATA = 2;
    private static final int BLOCK_STATE_HEADER = 1;
    private static final int BLOCK_STATE_START = 0;
    private static final java.lang.String CODEC_ID_AAC = "A_AAC";
    private static final java.lang.String CODEC_ID_AC3 = "A_AC3";
    private static final java.lang.String CODEC_ID_ACM = "A_MS/ACM";
    private static final java.lang.String CODEC_ID_ASS = "S_TEXT/ASS";
    private static final java.lang.String CODEC_ID_AV1 = "V_AV1";
    private static final java.lang.String CODEC_ID_DTS = "A_DTS";
    private static final java.lang.String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
    private static final java.lang.String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
    private static final java.lang.String CODEC_ID_DVBSUB = "S_DVBSUB";
    private static final java.lang.String CODEC_ID_E_AC3 = "A_EAC3";
    private static final java.lang.String CODEC_ID_FLAC = "A_FLAC";
    private static final java.lang.String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
    private static final java.lang.String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
    private static final java.lang.String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
    private static final java.lang.String CODEC_ID_MP2 = "A_MPEG/L2";
    private static final java.lang.String CODEC_ID_MP3 = "A_MPEG/L3";
    private static final java.lang.String CODEC_ID_MPEG2 = "V_MPEG2";
    private static final java.lang.String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
    private static final java.lang.String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
    private static final java.lang.String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
    private static final java.lang.String CODEC_ID_OPUS = "A_OPUS";
    private static final java.lang.String CODEC_ID_PCM_FLOAT = "A_PCM/FLOAT/IEEE";
    private static final java.lang.String CODEC_ID_PCM_INT_BIG = "A_PCM/INT/BIG";
    private static final java.lang.String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
    private static final java.lang.String CODEC_ID_PGS = "S_HDMV/PGS";
    private static final java.lang.String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
    private static final java.lang.String CODEC_ID_THEORA = "V_THEORA";
    private static final java.lang.String CODEC_ID_TRUEHD = "A_TRUEHD";
    private static final java.lang.String CODEC_ID_VOBSUB = "S_VOBSUB";
    private static final java.lang.String CODEC_ID_VORBIS = "A_VORBIS";
    private static final java.lang.String CODEC_ID_VP8 = "V_VP8";
    private static final java.lang.String CODEC_ID_VP9 = "V_VP9";
    private static final java.lang.String CODEC_ID_VTT = "S_TEXT/WEBVTT";
    private static final java.lang.String DOC_TYPE_MATROSKA = "matroska";
    private static final java.lang.String DOC_TYPE_WEBM = "webm";
    private static final int ENCRYPTION_IV_SIZE = 8;
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory FACTORY = null;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    private static final int FOURCC_COMPRESSION_DIVX = 1482049860;
    private static final int FOURCC_COMPRESSION_H263 = 859189832;
    private static final int FOURCC_COMPRESSION_VC1 = 826496599;
    private static final int ID_AUDIO = 225;
    private static final int ID_AUDIO_BIT_DEPTH = 25188;
    private static final int ID_BLOCK = 161;
    private static final int ID_BLOCK_ADDITIONAL = 165;
    private static final int ID_BLOCK_ADDITIONS = 30113;
    private static final int ID_BLOCK_ADDITION_MAPPING = 16868;
    private static final int ID_BLOCK_ADD_ID = 238;
    private static final int ID_BLOCK_ADD_ID_EXTRA_DATA = 16877;
    private static final int ID_BLOCK_ADD_ID_TYPE = 16871;
    private static final int ID_BLOCK_DURATION = 155;
    private static final int ID_BLOCK_GROUP = 160;
    private static final int ID_BLOCK_MORE = 166;
    private static final int ID_CHANNELS = 159;
    private static final int ID_CLUSTER = 524531317;
    private static final int ID_CODEC_DELAY = 22186;
    private static final int ID_CODEC_ID = 134;
    private static final int ID_CODEC_PRIVATE = 25506;
    private static final int ID_COLOUR = 21936;
    private static final int ID_COLOUR_PRIMARIES = 21947;
    private static final int ID_COLOUR_RANGE = 21945;
    private static final int ID_COLOUR_TRANSFER = 21946;
    private static final int ID_CONTENT_COMPRESSION = 20532;
    private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
    private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
    private static final int ID_CONTENT_ENCODING = 25152;
    private static final int ID_CONTENT_ENCODINGS = 28032;
    private static final int ID_CONTENT_ENCODING_ORDER = 20529;
    private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
    private static final int ID_CONTENT_ENCRYPTION = 20533;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
    private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
    private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
    private static final int ID_CUES = 475249515;
    private static final int ID_CUE_CLUSTER_POSITION = 241;
    private static final int ID_CUE_POINT = 187;
    private static final int ID_CUE_TIME = 179;
    private static final int ID_CUE_TRACK_POSITIONS = 183;
    private static final int ID_DEFAULT_DURATION = 2352003;
    private static final int ID_DISCARD_PADDING = 30114;
    private static final int ID_DISPLAY_HEIGHT = 21690;
    private static final int ID_DISPLAY_UNIT = 21682;
    private static final int ID_DISPLAY_WIDTH = 21680;
    private static final int ID_DOC_TYPE = 17026;
    private static final int ID_DOC_TYPE_READ_VERSION = 17029;
    private static final int ID_DURATION = 17545;
    private static final int ID_EBML = 440786851;
    private static final int ID_EBML_READ_VERSION = 17143;
    private static final int ID_FLAG_DEFAULT = 136;
    private static final int ID_FLAG_FORCED = 21930;
    private static final int ID_INFO = 357149030;
    private static final int ID_LANGUAGE = 2274716;
    private static final int ID_LUMNINANCE_MAX = 21977;
    private static final int ID_LUMNINANCE_MIN = 21978;
    private static final int ID_MASTERING_METADATA = 21968;
    private static final int ID_MAX_BLOCK_ADDITION_ID = 21998;
    private static final int ID_MAX_CLL = 21948;
    private static final int ID_MAX_FALL = 21949;
    private static final int ID_NAME = 21358;
    private static final int ID_PIXEL_HEIGHT = 186;
    private static final int ID_PIXEL_WIDTH = 176;
    private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
    private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
    private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
    private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
    private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
    private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
    private static final int ID_PROJECTION = 30320;
    private static final int ID_PROJECTION_POSE_PITCH = 30324;
    private static final int ID_PROJECTION_POSE_ROLL = 30325;
    private static final int ID_PROJECTION_POSE_YAW = 30323;
    private static final int ID_PROJECTION_PRIVATE = 30322;
    private static final int ID_PROJECTION_TYPE = 30321;
    private static final int ID_REFERENCE_BLOCK = 251;
    private static final int ID_SAMPLING_FREQUENCY = 181;
    private static final int ID_SEEK = 19899;
    private static final int ID_SEEK_HEAD = 290298740;
    private static final int ID_SEEK_ID = 21419;
    private static final int ID_SEEK_POSITION = 21420;
    private static final int ID_SEEK_PRE_ROLL = 22203;
    private static final int ID_SEGMENT = 408125543;
    private static final int ID_SEGMENT_INFO = 357149030;
    private static final int ID_SIMPLE_BLOCK = 163;
    private static final int ID_STEREO_MODE = 21432;
    private static final int ID_TIMECODE_SCALE = 2807729;
    private static final int ID_TIME_CODE = 231;
    private static final int ID_TRACKS = 374648427;
    private static final int ID_TRACK_ENTRY = 174;
    private static final int ID_TRACK_NUMBER = 215;
    private static final int ID_TRACK_TYPE = 131;
    private static final int ID_VIDEO = 224;
    private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
    private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
    private static final int LACING_EBML = 3;
    private static final int LACING_FIXED_SIZE = 2;
    private static final int LACING_NONE = 0;
    private static final int LACING_XIPH = 1;
    private static final int OPUS_MAX_INPUT_SIZE = 5760;
    private static final byte[] SSA_DIALOGUE_FORMAT = null;
    private static final byte[] SSA_PREFIX = null;
    private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
    private static final java.lang.String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
    private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000;
    private static final byte[] SUBRIP_PREFIX = null;
    private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
    private static final java.lang.String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
    private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final java.lang.String TAG = "MatroskaExtractor";
    private static final java.util.Map<java.lang.String, java.lang.Integer> TRACK_NAME_TO_ROTATION_DEGREES = null;
    private static final int TRACK_TYPE_AUDIO = 2;
    private static final int UNSET_ENTRY_ID = -1;
    private static final int VORBIS_MAX_INPUT_SIZE = 8192;
    private static final byte[] VTT_PREFIX = null;
    private static final int VTT_PREFIX_END_TIMECODE_OFFSET = 25;
    private static final java.lang.String VTT_TIMECODE_FORMAT = "%02d:%02d:%02d.%03d";
    private static final long VTT_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
    private static final int WAVE_FORMAT_PCM = 1;
    private static final int WAVE_FORMAT_SIZE = 18;
    private static final java.util.UUID WAVE_SUBFORMAT_PCM = null;
    private int blockAdditionalId;
    private long blockDurationUs;
    private int blockFlags;
    private long blockGroupDiscardPaddingNs;
    private boolean blockHasReferenceBlock;
    private int blockSampleCount;
    private int blockSampleIndex;
    private int[] blockSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private long clusterTimecodeUs;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.util.LongArray cueClusterPositions;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.util.LongArray cueTimesUs;
    private long cuesContentPosition;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final com.google.android.exoplayer2.util.ParsableByteArray encryptionInitializationVector;
    private final com.google.android.exoplayer2.util.ParsableByteArray encryptionSubsampleData;
    private java.nio.ByteBuffer encryptionSubsampleDataBuffer;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private boolean haveOutputSample;
    private final com.google.android.exoplayer2.util.ParsableByteArray nalLength;
    private final com.google.android.exoplayer2.util.ParsableByteArray nalStartCode;
    private final com.google.android.exoplayer2.extractor.mkv.EbmlReader reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final com.google.android.exoplayer2.util.ParsableByteArray sampleStrippedBytes;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch;
    private int seekEntryId;
    private final com.google.android.exoplayer2.util.ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private long seekPositionAfterBuildingCues;
    private boolean seenClusterPositionForCurrentCuePoint;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final com.google.android.exoplayer2.util.ParsableByteArray subtitleSample;
    private final com.google.android.exoplayer2.util.ParsableByteArray supplementalData;
    private long timecodeScale;
    private final android.util.SparseArray<com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track> tracks;
    private final com.google.android.exoplayer2.extractor.mkv.VarintReader varintReader;
    private final com.google.android.exoplayer2.util.ParsableByteArray vorbisNumPageSamples;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public final class InnerEbmlProcessor implements com.google.android.exoplayer2.extractor.mkv.EbmlProcessor {
        public final /* synthetic */ com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor this$0;

        private InnerEbmlProcessor(com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ InnerEbmlProcessor(com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r1, com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void binaryElement(int r2, int r3, com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
                r1 = this;
                com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r0 = r1.this$0
                r0.binaryElement(r2, r3, r4)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void endMasterElement(int r2) throws com.google.android.exoplayer2.ParserException {
                r1 = this;
                com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r0 = r1.this$0
                r0.endMasterElement(r2)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void floatElement(int r2, double r3) throws com.google.android.exoplayer2.ParserException {
                r1 = this;
                com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r0 = r1.this$0
                r0.floatElement(r2, r3)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public int getElementType(int r2) {
                r1 = this;
                com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r0 = r1.this$0
                java.util.Objects.requireNonNull(r0)
                switch(r2) {
                    case 131: goto L12;
                    case 134: goto L10;
                    case 136: goto L12;
                    case 155: goto L12;
                    case 159: goto L12;
                    case 160: goto Le;
                    case 161: goto Lc;
                    case 163: goto Lc;
                    case 165: goto Lc;
                    case 166: goto Le;
                    case 174: goto Le;
                    case 176: goto L12;
                    case 179: goto L12;
                    case 181: goto La;
                    case 183: goto Le;
                    case 186: goto L12;
                    case 187: goto Le;
                    case 215: goto L12;
                    case 224: goto Le;
                    case 225: goto Le;
                    case 231: goto L12;
                    case 238: goto L12;
                    case 241: goto L12;
                    case 251: goto L12;
                    case 16868: goto Le;
                    case 16871: goto L12;
                    case 16877: goto Lc;
                    case 16980: goto L12;
                    case 16981: goto Lc;
                    case 17026: goto L10;
                    case 17029: goto L12;
                    case 17143: goto L12;
                    case 17545: goto La;
                    case 18401: goto L12;
                    case 18402: goto Lc;
                    case 18407: goto Le;
                    case 18408: goto L12;
                    case 19899: goto Le;
                    case 20529: goto L12;
                    case 20530: goto L12;
                    case 20532: goto Le;
                    case 20533: goto Le;
                    case 21358: goto L10;
                    case 21419: goto Lc;
                    case 21420: goto L12;
                    case 21432: goto L12;
                    case 21680: goto L12;
                    case 21682: goto L12;
                    case 21690: goto L12;
                    case 21930: goto L12;
                    case 21936: goto Le;
                    case 21945: goto L12;
                    case 21946: goto L12;
                    case 21947: goto L12;
                    case 21948: goto L12;
                    case 21949: goto L12;
                    case 21968: goto Le;
                    case 21969: goto La;
                    case 21970: goto La;
                    case 21971: goto La;
                    case 21972: goto La;
                    case 21973: goto La;
                    case 21974: goto La;
                    case 21975: goto La;
                    case 21976: goto La;
                    case 21977: goto La;
                    case 21978: goto La;
                    case 21998: goto L12;
                    case 22186: goto L12;
                    case 22203: goto L12;
                    case 25152: goto Le;
                    case 25188: goto L12;
                    case 25506: goto Lc;
                    case 28032: goto Le;
                    case 30113: goto Le;
                    case 30114: goto L12;
                    case 30320: goto Le;
                    case 30321: goto L12;
                    case 30322: goto Lc;
                    case 30323: goto La;
                    case 30324: goto La;
                    case 30325: goto La;
                    case 2274716: goto L10;
                    case 2352003: goto L12;
                    case 2807729: goto L12;
                    case 290298740: goto Le;
                    case 357149030: goto Le;
                    case 374648427: goto Le;
                    case 408125543: goto Le;
                    case 440786851: goto Le;
                    case 475249515: goto Le;
                    case 524531317: goto Le;
                    default: goto L8;
                }
            L8:
                r2 = 0
                goto L13
            La:
                r2 = 5
                goto L13
            Lc:
                r2 = 4
                goto L13
            Le:
                r2 = 1
                goto L13
            L10:
                r2 = 3
                goto L13
            L12:
                r2 = 2
            L13:
                return r2
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void integerElement(int r2, long r3) throws com.google.android.exoplayer2.ParserException {
                r1 = this;
                com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r0 = r1.this$0
                r0.integerElement(r2, r3)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public boolean isLevel1Element(int r2) {
                r1 = this;
                com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r0 = r1.this$0
                java.util.Objects.requireNonNull(r0)
                r0 = 357149030(0x1549a966, float:4.072526E-26)
                if (r2 == r0) goto L1c
                r0 = 524531317(0x1f43b675, float:4.144378E-20)
                if (r2 == r0) goto L1c
                r0 = 475249515(0x1c53bb6b, float:7.0056276E-22)
                if (r2 == r0) goto L1c
                r0 = 374648427(0x1654ae6b, float:1.718026E-25)
                if (r2 != r0) goto L1a
                goto L1c
            L1a:
                r2 = 0
                goto L1d
            L1c:
                r2 = 1
            L1d:
                return r2
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void startMasterElement(int r7, long r8, long r10) throws com.google.android.exoplayer2.ParserException {
                r6 = this;
                com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r0 = r6.this$0
                r1 = r7
                r2 = r8
                r4 = r10
                r0.startMasterElement(r1, r2, r4)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void stringElement(int r2, java.lang.String r3) throws com.google.android.exoplayer2.ParserException {
                r1 = this;
                com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r0 = r1.this$0
                r0.stringElement(r2, r3)
                return
        }
    }

    public static final class Track {
        private static final int DEFAULT_MAX_CLL = 1000;
        private static final int DEFAULT_MAX_FALL = 200;
        private static final int DISPLAY_UNIT_PIXELS = 0;
        private static final int MAX_CHROMATICITY = 50000;
        public int audioBitDepth;
        private int blockAddIdType;
        public int channelCount;
        public long codecDelayNs;
        public java.lang.String codecId;
        public byte[] codecPrivate;
        public int colorRange;
        public int colorSpace;
        public int colorTransfer;
        public com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public int displayHeight;
        public int displayUnit;
        public int displayWidth;
        public byte[] dolbyVisionConfigBytes;
        public com.google.android.exoplayer2.drm.DrmInitData drmInitData;
        public boolean flagDefault;
        public boolean flagForced;
        public boolean hasColorInfo;
        public boolean hasContentEncryption;
        public int height;
        private java.lang.String language;
        public int maxBlockAdditionId;
        public int maxContentLuminance;
        public int maxFrameAverageLuminance;
        public float maxMasteringLuminance;
        public float minMasteringLuminance;
        public int nalUnitLengthFieldLength;
        public java.lang.String name;
        public int number;
        public com.google.android.exoplayer2.extractor.TrackOutput output;
        public float primaryBChromaticityX;
        public float primaryBChromaticityY;
        public float primaryGChromaticityX;
        public float primaryGChromaticityY;
        public float primaryRChromaticityX;
        public float primaryRChromaticityY;
        public byte[] projectionData;
        public float projectionPosePitch;
        public float projectionPoseRoll;
        public float projectionPoseYaw;
        public int projectionType;
        public int sampleRate;
        public byte[] sampleStrippedBytes;
        public long seekPreRollNs;
        public int stereoMode;
        public com.google.android.exoplayer2.extractor.TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public float whitePointChromaticityX;
        public float whitePointChromaticityY;
        public int width;

        public Track() {
                r4 = this;
                r4.<init>()
                r0 = -1
                r4.width = r0
                r4.height = r0
                r4.displayWidth = r0
                r4.displayHeight = r0
                r1 = 0
                r4.displayUnit = r1
                r4.projectionType = r0
                r2 = 0
                r4.projectionPoseYaw = r2
                r4.projectionPosePitch = r2
                r4.projectionPoseRoll = r2
                r2 = 0
                r4.projectionData = r2
                r4.stereoMode = r0
                r4.hasColorInfo = r1
                r4.colorSpace = r0
                r4.colorTransfer = r0
                r4.colorRange = r0
                r1 = 1000(0x3e8, float:1.401E-42)
                r4.maxContentLuminance = r1
                r1 = 200(0xc8, float:2.8E-43)
                r4.maxFrameAverageLuminance = r1
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r4.primaryRChromaticityX = r1
                r4.primaryRChromaticityY = r1
                r4.primaryGChromaticityX = r1
                r4.primaryGChromaticityY = r1
                r4.primaryBChromaticityX = r1
                r4.primaryBChromaticityY = r1
                r4.whitePointChromaticityX = r1
                r4.whitePointChromaticityY = r1
                r4.maxMasteringLuminance = r1
                r4.minMasteringLuminance = r1
                r1 = 1
                r4.channelCount = r1
                r4.audioBitDepth = r0
                r0 = 8000(0x1f40, float:1.121E-41)
                r4.sampleRate = r0
                r2 = 0
                r4.codecDelayNs = r2
                r4.seekPreRollNs = r2
                r4.flagDefault = r1
                java.lang.String r0 = "eng"
                r4.language = r0
                return
        }

        public static /* synthetic */ void access$100(com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track r0) {
                r0.assertOutputInitialized()
                return
        }

        public static /* synthetic */ int access$200(com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track r0) {
                int r0 = r0.blockAddIdType
                return r0
        }

        public static /* synthetic */ int access$202(com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track r0, int r1) {
                r0.blockAddIdType = r1
                return r1
        }

        public static /* synthetic */ java.lang.String access$302(com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track r0, java.lang.String r1) {
                r0.language = r1
                return r1
        }

        public static /* synthetic */ boolean access$400(com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track r0, boolean r1) {
                boolean r0 = r0.samplesHaveSupplementalData(r1)
                return r0
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"output"})
        private void assertOutputInitialized() {
                r1 = this;
                com.google.android.exoplayer2.extractor.TrackOutput r0 = r1.output
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                return
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"codecPrivate"})
        private byte[] getCodecPrivate(java.lang.String r3) throws com.google.android.exoplayer2.ParserException {
                r2 = this;
                byte[] r0 = r2.codecPrivate
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Missing CodecPrivate for codec "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r0 = 0
                com.google.android.exoplayer2.ParserException r3 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r3, r0)
                throw r3
        }

        @androidx.annotation.Nullable
        private byte[] getHdrStaticInfo() {
                r5 = this;
                float r0 = r5.primaryRChromaticityX
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto Lc4
                float r0 = r5.primaryRChromaticityY
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto Lc4
                float r0 = r5.primaryGChromaticityX
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto Lc4
                float r0 = r5.primaryGChromaticityY
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto Lc4
                float r0 = r5.primaryBChromaticityX
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto Lc4
                float r0 = r5.primaryBChromaticityY
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto Lc4
                float r0 = r5.whitePointChromaticityX
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto Lc4
                float r0 = r5.whitePointChromaticityY
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto Lc4
                float r0 = r5.maxMasteringLuminance
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto Lc4
                float r0 = r5.minMasteringLuminance
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L40
                goto Lc4
            L40:
                r0 = 25
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)
                java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r1 = r1.order(r2)
                r2 = 0
                r1.put(r2)
                float r2 = r5.primaryRChromaticityX
                r3 = 1195593728(0x47435000, float:50000.0)
                float r2 = r2 * r3
                r4 = 1056964608(0x3f000000, float:0.5)
                float r2 = r2 + r4
                int r2 = (int) r2
                short r2 = (short) r2
                r1.putShort(r2)
                float r2 = r5.primaryRChromaticityY
                float r2 = r2 * r3
                float r2 = r2 + r4
                int r2 = (int) r2
                short r2 = (short) r2
                r1.putShort(r2)
                float r2 = r5.primaryGChromaticityX
                float r2 = r2 * r3
                float r2 = r2 + r4
                int r2 = (int) r2
                short r2 = (short) r2
                r1.putShort(r2)
                float r2 = r5.primaryGChromaticityY
                float r2 = r2 * r3
                float r2 = r2 + r4
                int r2 = (int) r2
                short r2 = (short) r2
                r1.putShort(r2)
                float r2 = r5.primaryBChromaticityX
                float r2 = r2 * r3
                float r2 = r2 + r4
                int r2 = (int) r2
                short r2 = (short) r2
                r1.putShort(r2)
                float r2 = r5.primaryBChromaticityY
                float r2 = r2 * r3
                float r2 = r2 + r4
                int r2 = (int) r2
                short r2 = (short) r2
                r1.putShort(r2)
                float r2 = r5.whitePointChromaticityX
                float r2 = r2 * r3
                float r2 = r2 + r4
                int r2 = (int) r2
                short r2 = (short) r2
                r1.putShort(r2)
                float r2 = r5.whitePointChromaticityY
                float r2 = r2 * r3
                float r2 = r2 + r4
                int r2 = (int) r2
                short r2 = (short) r2
                r1.putShort(r2)
                float r2 = r5.maxMasteringLuminance
                float r2 = r2 + r4
                int r2 = (int) r2
                short r2 = (short) r2
                r1.putShort(r2)
                float r2 = r5.minMasteringLuminance
                float r2 = r2 + r4
                int r2 = (int) r2
                short r2 = (short) r2
                r1.putShort(r2)
                int r2 = r5.maxContentLuminance
                short r2 = (short) r2
                r1.putShort(r2)
                int r2 = r5.maxFrameAverageLuminance
                short r2 = (short) r2
                r1.putShort(r2)
                return r0
            Lc4:
                r0 = 0
                return r0
        }

        private static android.util.Pair<java.lang.String, java.util.List<byte[]>> parseFourCcPrivate(com.google.android.exoplayer2.util.ParsableByteArray r6) throws com.google.android.exoplayer2.ParserException {
                r0 = 16
                r1 = 0
                r6.skipBytes(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                long r2 = r6.readLittleEndianUnsignedInt()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                r4 = 1482049860(0x58564944, double:7.322299212E-315)
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1a
                android.util.Pair r6 = new android.util.Pair     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                java.lang.String r0 = "video/divx"
                r6.<init>(r0, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                return r6
            L1a:
                r4 = 859189832(0x33363248, double:4.244961792E-315)
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L2a
                android.util.Pair r6 = new android.util.Pair     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                java.lang.String r0 = "video/3gpp"
                r6.<init>(r0, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                return r6
            L2a:
                r4 = 826496599(0x31435657, double:4.08343576E-315)
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L75
                int r0 = r6.getPosition()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                int r0 = r0 + 20
                byte[] r6 = r6.getData()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
            L3b:
                int r2 = r6.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                int r2 = r2 + (-4)
                if (r0 >= r2) goto L6e
                r2 = r6[r0]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                if (r2 != 0) goto L6b
                int r2 = r0 + 1
                r2 = r6[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                if (r2 != 0) goto L6b
                int r2 = r0 + 2
                r2 = r6[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                r3 = 1
                if (r2 != r3) goto L6b
                int r2 = r0 + 3
                r2 = r6[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                r3 = 15
                if (r2 != r3) goto L6b
                int r2 = r6.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                byte[] r6 = java.util.Arrays.copyOfRange(r6, r0, r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                java.lang.String r2 = "video/wvc1"
                java.util.List r6 = java.util.Collections.singletonList(r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                r0.<init>(r2, r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                return r0
            L6b:
                int r0 = r0 + 1
                goto L3b
            L6e:
                java.lang.String r6 = "Failed to find FourCC VC1 initialization data"
                com.google.android.exoplayer2.ParserException r6 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r6, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
                throw r6     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L85
            L75:
                java.lang.String r6 = "MatroskaExtractor"
                java.lang.String r0 = "Unknown FourCC. Setting mimeType to video/x-unknown"
                com.google.android.exoplayer2.util.Log.w(r6, r0)
                android.util.Pair r6 = new android.util.Pair
                java.lang.String r0 = "video/x-unknown"
                r6.<init>(r0, r1)
                return r6
            L85:
                java.lang.String r6 = "Error parsing FourCC private data"
                com.google.android.exoplayer2.ParserException r6 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r6, r1)
                throw r6
        }

        private static boolean parseMsAcmCodecPrivate(com.google.android.exoplayer2.util.ParsableByteArray r8) throws com.google.android.exoplayer2.ParserException {
                int r0 = r8.readLittleEndianUnsignedShort()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L37
                r1 = 1
                if (r0 != r1) goto L8
                return r1
            L8:
                r2 = 65534(0xfffe, float:9.1833E-41)
                r3 = 0
                if (r0 != r2) goto L36
                r0 = 24
                r8.setPosition(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L37
                long r4 = r8.readLong()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L37
                java.util.UUID r0 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.access$700()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L37
                long r6 = r0.getMostSignificantBits()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L37
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 != 0) goto L34
                long r4 = r8.readLong()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L37
                java.util.UUID r8 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.access$700()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L37
                long r6 = r8.getLeastSignificantBits()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L37
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 != 0) goto L34
                goto L35
            L34:
                r1 = 0
            L35:
                return r1
            L36:
                return r3
            L37:
                r8 = 0
                java.lang.String r0 = "Error parsing MS/ACM codec private"
                com.google.android.exoplayer2.ParserException r8 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r8)
                throw r8
        }

        private static java.util.List<byte[]> parseVorbisCodecPrivate(byte[] r10) throws com.google.android.exoplayer2.ParserException {
                java.lang.String r0 = "Error parsing vorbis codec private"
                r1 = 0
                r2 = 0
                r3 = r10[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                r4 = 2
                if (r3 != r4) goto L68
                r3 = 1
                r5 = 1
                r6 = 0
            Lc:
                r7 = r10[r5]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                r8 = 255(0xff, float:3.57E-43)
                r7 = r7 & r8
                if (r7 != r8) goto L18
                int r6 = r6 + 255
                int r5 = r5 + 1
                goto Lc
            L18:
                int r7 = r5 + 1
                r5 = r10[r5]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                r5 = r5 & r8
                int r6 = r6 + r5
                r5 = 0
            L1f:
                r9 = r10[r7]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                r9 = r9 & r8
                if (r9 != r8) goto L29
                int r5 = r5 + 255
                int r7 = r7 + 1
                goto L1f
            L29:
                int r9 = r7 + 1
                r7 = r10[r7]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                r7 = r7 & r8
                int r5 = r5 + r7
                r7 = r10[r9]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                if (r7 != r3) goto L63
                byte[] r3 = new byte[r6]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                java.lang.System.arraycopy(r10, r9, r3, r2, r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                int r9 = r9 + r6
                r6 = r10[r9]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                r7 = 3
                if (r6 != r7) goto L5e
                int r9 = r9 + r5
                r5 = r10[r9]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                r6 = 5
                if (r5 != r6) goto L59
                int r5 = r10.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                int r5 = r5 - r9
                byte[] r5 = new byte[r5]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                int r6 = r10.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                int r6 = r6 - r9
                java.lang.System.arraycopy(r10, r9, r5, r2, r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                r10.<init>(r4)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                r10.add(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                r10.add(r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                return r10
            L59:
                com.google.android.exoplayer2.ParserException r10 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                throw r10     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
            L5e:
                com.google.android.exoplayer2.ParserException r10 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                throw r10     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
            L63:
                com.google.android.exoplayer2.ParserException r10 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                throw r10     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
            L68:
                com.google.android.exoplayer2.ParserException r10 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
                throw r10     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6d
            L6d:
                com.google.android.exoplayer2.ParserException r10 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r1)
                throw r10
        }

        private boolean samplesHaveSupplementalData(boolean r3) {
                r2 = this;
                java.lang.String r0 = r2.codecId
                java.lang.String r1 = "A_OPUS"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto Lb
                return r3
            Lb:
                int r3 = r2.maxBlockAdditionId
                if (r3 <= 0) goto L11
                r3 = 1
                goto L12
            L11:
                r3 = 0
            L12:
                return r3
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
        public void initializeOutput(com.google.android.exoplayer2.extractor.ExtractorOutput r18, int r19) throws com.google.android.exoplayer2.ParserException {
                r17 = this;
                r0 = r17
                java.lang.String r1 = r0.codecId
                java.util.Objects.requireNonNull(r1)
                int r2 = r1.hashCode()
                r4 = 16
                r5 = 8
                r6 = 3
                switch(r2) {
                    case -2095576542: goto L1c0;
                    case -2095575984: goto L1b5;
                    case -1985379776: goto L1aa;
                    case -1784763192: goto L19f;
                    case -1730367663: goto L194;
                    case -1482641358: goto L189;
                    case -1482641357: goto L17e;
                    case -1373388978: goto L173;
                    case -933872740: goto L165;
                    case -538363189: goto L157;
                    case -538363109: goto L149;
                    case -425012669: goto L13b;
                    case -356037306: goto L12d;
                    case 62923557: goto L11f;
                    case 62923603: goto L111;
                    case 62927045: goto L103;
                    case 82318131: goto Lf5;
                    case 82338133: goto Le7;
                    case 82338134: goto Ld9;
                    case 99146302: goto Lcb;
                    case 444813526: goto Lbd;
                    case 542569478: goto Laf;
                    case 635596514: goto La1;
                    case 725948237: goto L93;
                    case 725957860: goto L85;
                    case 738597099: goto L77;
                    case 855502857: goto L69;
                    case 1045209816: goto L5b;
                    case 1422270023: goto L4d;
                    case 1809237540: goto L3f;
                    case 1950749482: goto L31;
                    case 1950789798: goto L23;
                    case 1951062397: goto L15;
                    default: goto L13;
                }
            L13:
                goto L1cb
            L15:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L1f
                goto L1cb
            L1f:
                r1 = 32
                goto L1cc
            L23:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L2d
                goto L1cb
            L2d:
                r1 = 31
                goto L1cc
            L31:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L3b
                goto L1cb
            L3b:
                r1 = 30
                goto L1cc
            L3f:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L49
                goto L1cb
            L49:
                r1 = 29
                goto L1cc
            L4d:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L57
                goto L1cb
            L57:
                r1 = 28
                goto L1cc
            L5b:
                java.lang.String r2 = "S_TEXT/WEBVTT"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L65
                goto L1cb
            L65:
                r1 = 27
                goto L1cc
            L69:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L73
                goto L1cb
            L73:
                r1 = 26
                goto L1cc
            L77:
                java.lang.String r2 = "S_TEXT/ASS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L81
                goto L1cb
            L81:
                r1 = 25
                goto L1cc
            L85:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L8f
                goto L1cb
            L8f:
                r1 = 24
                goto L1cc
            L93:
                java.lang.String r2 = "A_PCM/INT/BIG"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L9d
                goto L1cb
            L9d:
                r1 = 23
                goto L1cc
            La1:
                java.lang.String r2 = "A_PCM/FLOAT/IEEE"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto Lab
                goto L1cb
            Lab:
                r1 = 22
                goto L1cc
            Laf:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto Lb9
                goto L1cb
            Lb9:
                r1 = 21
                goto L1cc
            Lbd:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto Lc7
                goto L1cb
            Lc7:
                r1 = 20
                goto L1cc
            Lcb:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto Ld5
                goto L1cb
            Ld5:
                r1 = 19
                goto L1cc
            Ld9:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto Le3
                goto L1cb
            Le3:
                r1 = 18
                goto L1cc
            Le7:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto Lf1
                goto L1cb
            Lf1:
                r1 = 17
                goto L1cc
            Lf5:
                java.lang.String r2 = "V_AV1"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto Lff
                goto L1cb
            Lff:
                r1 = 16
                goto L1cc
            L103:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L10d
                goto L1cb
            L10d:
                r1 = 15
                goto L1cc
            L111:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L11b
                goto L1cb
            L11b:
                r1 = 14
                goto L1cc
            L11f:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L129
                goto L1cb
            L129:
                r1 = 13
                goto L1cc
            L12d:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L137
                goto L1cb
            L137:
                r1 = 12
                goto L1cc
            L13b:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L145
                goto L1cb
            L145:
                r1 = 11
                goto L1cc
            L149:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L153
                goto L1cb
            L153:
                r1 = 10
                goto L1cc
            L157:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L161
                goto L1cb
            L161:
                r1 = 9
                goto L1cc
            L165:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L16f
                goto L1cb
            L16f:
                r1 = 8
                goto L1cc
            L173:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L17c
                goto L1cb
            L17c:
                r1 = 7
                goto L1cc
            L17e:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L187
                goto L1cb
            L187:
                r1 = 6
                goto L1cc
            L189:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L192
                goto L1cb
            L192:
                r1 = 5
                goto L1cc
            L194:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L19d
                goto L1cb
            L19d:
                r1 = 4
                goto L1cc
            L19f:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L1a8
                goto L1cb
            L1a8:
                r1 = 3
                goto L1cc
            L1aa:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L1b3
                goto L1cb
            L1b3:
                r1 = 2
                goto L1cc
            L1b5:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L1be
                goto L1cb
            L1be:
                r1 = 1
                goto L1cc
            L1c0:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L1c9
                goto L1cb
            L1c9:
                r1 = 0
                goto L1cc
            L1cb:
                r1 = -1
            L1cc:
                java.lang.String r2 = "application/dvbsubs"
                java.lang.String r7 = "application/pgs"
                java.lang.String r8 = "application/vobsub"
                java.lang.String r9 = "text/vtt"
                java.lang.String r10 = "text/x-ssa"
                java.lang.String r11 = "application/x-subrip"
                java.lang.String r12 = ". Setting mimeType to "
                java.lang.String r13 = "audio/raw"
                java.lang.String r14 = "MatroskaExtractor"
                java.lang.String r15 = "audio/x-unknown"
                r3 = 0
                switch(r1) {
                    case 0: goto L40d;
                    case 1: goto L40d;
                    case 2: goto L3ce;
                    case 3: goto L3c1;
                    case 4: goto L3ac;
                    case 5: goto L39f;
                    case 6: goto L39c;
                    case 7: goto L383;
                    case 8: goto L36f;
                    case 9: goto L40d;
                    case 10: goto L347;
                    case 11: goto L339;
                    case 12: goto L335;
                    case 13: goto L316;
                    case 14: goto L312;
                    case 15: goto L30e;
                    case 16: goto L309;
                    case 17: goto L304;
                    case 18: goto L2ff;
                    case 19: goto L2fa;
                    case 20: goto L2f5;
                    case 21: goto L30e;
                    case 22: goto L2cf;
                    case 23: goto L2a1;
                    case 24: goto L27f;
                    case 25: goto L26d;
                    case 26: goto L251;
                    case 27: goto L24c;
                    case 28: goto L249;
                    case 29: goto L244;
                    case 30: goto L240;
                    case 31: goto L232;
                    case 32: goto L1ed;
                    default: goto L1e6;
                }
            L1e6:
                java.lang.String r1 = "Unrecognized codec identifier."
                com.google.android.exoplayer2.ParserException r1 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r1, r3)
                throw r1
            L1ed:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r6)
                java.lang.String r4 = r0.codecId
                byte[] r4 = r0.getCodecPrivate(r4)
                r1.add(r4)
                java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r5)
                java.nio.ByteOrder r6 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r4 = r4.order(r6)
                long r12 = r0.codecDelayNs
                java.nio.ByteBuffer r4 = r4.putLong(r12)
                byte[] r4 = r4.array()
                r1.add(r4)
                java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r5)
                java.nio.ByteBuffer r4 = r4.order(r6)
                long r5 = r0.seekPreRollNs
                java.nio.ByteBuffer r4 = r4.putLong(r5)
                byte[] r4 = r4.array()
                r1.add(r4)
                java.lang.String r4 = "audio/opus"
                r5 = -1
                r6 = 5760(0x1680, float:8.071E-42)
                r5 = r3
                r6 = -1
                r12 = 5760(0x1680, float:8.071E-42)
                goto L422
            L232:
                java.lang.String r1 = r0.codecId
                byte[] r1 = r0.getCodecPrivate(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r4 = "audio/flac"
                goto L41a
            L240:
                java.lang.String r1 = "audio/eac3"
                goto L3ca
            L244:
                java.lang.String r1 = "video/mpeg2"
                goto L3ca
            L249:
                r1 = r11
                goto L3ca
            L24c:
                r1 = r3
                r4 = r1
                r13 = r9
                goto L41c
            L251:
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                java.lang.String r4 = r0.codecId
                byte[] r4 = r0.getCodecPrivate(r4)
                r1.<init>(r4)
                com.google.android.exoplayer2.video.HevcConfig r1 = com.google.android.exoplayer2.video.HevcConfig.parse(r1)
                java.util.List<byte[]> r4 = r1.initializationData
                int r5 = r1.nalUnitLengthFieldLength
                r0.nalUnitLengthFieldLength = r5
                java.lang.String r1 = r1.codecs
                java.lang.String r5 = "video/hevc"
                goto L361
            L26d:
                byte[] r1 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.access$500()
                java.lang.String r4 = r0.codecId
                byte[] r4 = r0.getCodecPrivate(r4)
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r1, r4)
                r4 = r3
                r13 = r10
                goto L41c
            L27f:
                int r1 = r0.audioBitDepth
                int r1 = com.google.android.exoplayer2.util.Util.getPcmEncoding(r1)
                if (r1 != 0) goto L400
                java.lang.String r1 = "Unsupported little endian PCM bit depth: "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r4 = r0.audioBitDepth
                r1.append(r4)
                r1.append(r12)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                com.google.android.exoplayer2.util.Log.w(r14, r1)
                goto L409
            L2a1:
                int r1 = r0.audioBitDepth
                if (r1 != r5) goto L2ab
                r1 = 3
                r1 = r3
                r4 = r1
                r5 = 3
                goto L41d
            L2ab:
                if (r1 != r4) goto L2b5
                r1 = 268435456(0x10000000, float:2.524355E-29)
                r1 = r3
                r4 = r1
                r5 = 268435456(0x10000000, float:2.524355E-29)
                goto L41d
            L2b5:
                java.lang.String r1 = "Unsupported big endian PCM bit depth: "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r4 = r0.audioBitDepth
                r1.append(r4)
                r1.append(r12)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                com.google.android.exoplayer2.util.Log.w(r14, r1)
                goto L409
            L2cf:
                int r1 = r0.audioBitDepth
                r4 = 32
                if (r1 != r4) goto L2db
                r1 = 4
                r1 = r3
                r4 = r1
                r5 = 4
                goto L41d
            L2db:
                java.lang.String r1 = "Unsupported floating point PCM bit depth: "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r4 = r0.audioBitDepth
                r1.append(r4)
                r1.append(r12)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                com.google.android.exoplayer2.util.Log.w(r14, r1)
                goto L409
            L2f5:
                java.lang.String r1 = "video/x-unknown"
                goto L3ca
            L2fa:
                r1 = r3
                r4 = r1
                r13 = r7
                goto L41c
            L2ff:
                java.lang.String r1 = "video/x-vnd.on2.vp9"
                goto L3ca
            L304:
                java.lang.String r1 = "video/x-vnd.on2.vp8"
                goto L3ca
            L309:
                java.lang.String r1 = "video/av01"
                goto L3ca
            L30e:
                java.lang.String r1 = "audio/vnd.dts"
                goto L3ca
            L312:
                java.lang.String r1 = "audio/ac3"
                goto L3ca
            L316:
                java.lang.String r1 = r0.codecId
                byte[] r1 = r0.getCodecPrivate(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                byte[] r4 = r0.codecPrivate
                com.google.android.exoplayer2.audio.AacUtil$Config r4 = com.google.android.exoplayer2.audio.AacUtil.parseAudioSpecificConfig(r4)
                int r5 = r4.sampleRateHz
                r0.sampleRate = r5
                int r5 = r4.channelCount
                r0.channelCount = r5
                java.lang.String r4 = r4.codecs
                java.lang.String r5 = "audio/mp4a-latm"
                r13 = r5
                goto L41c
            L335:
                java.lang.String r1 = "audio/vnd.dts.hd"
                goto L3ca
            L339:
                java.lang.String r1 = r0.codecId
                byte[] r1 = r0.getCodecPrivate(r1)
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r1)
                r4 = r3
                r13 = r8
                goto L41c
            L347:
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                java.lang.String r4 = r0.codecId
                byte[] r4 = r0.getCodecPrivate(r4)
                r1.<init>(r4)
                com.google.android.exoplayer2.video.AvcConfig r1 = com.google.android.exoplayer2.video.AvcConfig.parse(r1)
                java.util.List<byte[]> r4 = r1.initializationData
                int r5 = r1.nalUnitLengthFieldLength
                r0.nalUnitLengthFieldLength = r5
                java.lang.String r1 = r1.codecs
                java.lang.String r5 = "video/avc"
            L361:
                r16 = r4
                r4 = r1
                r1 = r16
                r6 = -1
                r12 = -1
                r16 = r5
                r5 = r4
                r4 = r16
                goto L422
            L36f:
                r1 = 4
                byte[] r4 = new byte[r1]
                java.lang.String r5 = r0.codecId
                byte[] r5 = r0.getCodecPrivate(r5)
                r6 = 0
                java.lang.System.arraycopy(r5, r6, r4, r6, r1)
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r4)
                r4 = r2
                goto L41a
            L383:
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                java.lang.String r4 = r0.codecId
                byte[] r4 = r0.getCodecPrivate(r4)
                r1.<init>(r4)
                android.util.Pair r1 = parseFourCcPrivate(r1)
                java.lang.Object r4 = r1.first
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
                goto L41a
            L39c:
                java.lang.String r1 = "audio/mpeg"
                goto L3a1
            L39f:
                java.lang.String r1 = "audio/mpeg-L2"
            L3a1:
                r4 = r1
                r5 = -1
                r6 = 4096(0x1000, float:5.74E-42)
                r1 = r3
                r5 = r1
                r6 = -1
                r12 = 4096(0x1000, float:5.74E-42)
                goto L422
            L3ac:
                java.lang.String r1 = r0.codecId
                byte[] r1 = r0.getCodecPrivate(r1)
                java.util.List r1 = parseVorbisCodecPrivate(r1)
                java.lang.String r4 = "audio/vorbis"
                r5 = -1
                r6 = 8192(0x2000, float:1.148E-41)
                r5 = r3
                r6 = -1
                r12 = 8192(0x2000, float:1.148E-41)
                goto L422
            L3c1:
                com.google.android.exoplayer2.extractor.TrueHdSampleRechunker r1 = new com.google.android.exoplayer2.extractor.TrueHdSampleRechunker
                r1.<init>()
                r0.trueHdSampleRechunker = r1
                java.lang.String r1 = "audio/true-hd"
            L3ca:
                r13 = r1
                r1 = r3
                r4 = r1
                goto L41c
            L3ce:
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                java.lang.String r4 = r0.codecId
                byte[] r4 = r0.getCodecPrivate(r4)
                r1.<init>(r4)
                boolean r1 = parseMsAcmCodecPrivate(r1)
                if (r1 == 0) goto L404
                int r1 = r0.audioBitDepth
                int r1 = com.google.android.exoplayer2.util.Util.getPcmEncoding(r1)
                if (r1 != 0) goto L400
                java.lang.String r1 = "Unsupported PCM bit depth: "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r4 = r0.audioBitDepth
                r1.append(r4)
                r1.append(r12)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                com.google.android.exoplayer2.util.Log.w(r14, r1)
                goto L409
            L400:
                r5 = r1
                r1 = r3
                r4 = r1
                goto L41d
            L404:
                java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"
                com.google.android.exoplayer2.util.Log.w(r14, r1)
            L409:
                r1 = r3
                r4 = r1
                r13 = r15
                goto L41c
            L40d:
                byte[] r1 = r0.codecPrivate
                if (r1 != 0) goto L413
                r1 = r3
                goto L417
            L413:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L417:
                java.lang.String r4 = "video/mp4v-es"
            L41a:
                r13 = r4
                r4 = r3
            L41c:
                r5 = -1
            L41d:
                r6 = -1
                r6 = r5
                r12 = -1
                r5 = r4
                r4 = r13
            L422:
                byte[] r13 = r0.dolbyVisionConfigBytes
                if (r13 == 0) goto L438
                com.google.android.exoplayer2.util.ParsableByteArray r13 = new com.google.android.exoplayer2.util.ParsableByteArray
                byte[] r14 = r0.dolbyVisionConfigBytes
                r13.<init>(r14)
                com.google.android.exoplayer2.video.DolbyVisionConfig r13 = com.google.android.exoplayer2.video.DolbyVisionConfig.parse(r13)
                if (r13 == 0) goto L438
                java.lang.String r5 = r13.codecs
                java.lang.String r4 = "video/dolby-vision"
            L438:
                boolean r13 = r0.flagDefault
                r13 = r13 | 0
                boolean r14 = r0.flagForced
                if (r14 == 0) goto L442
                r14 = 2
                goto L443
            L442:
                r14 = 0
            L443:
                r13 = r13 | r14
                com.google.android.exoplayer2.Format$Builder r14 = new com.google.android.exoplayer2.Format$Builder
                r14.<init>()
                boolean r15 = com.google.android.exoplayer2.util.MimeTypes.isAudio(r4)
                if (r15 == 0) goto L461
                int r2 = r0.channelCount
                com.google.android.exoplayer2.Format$Builder r2 = r14.setChannelCount(r2)
                int r3 = r0.sampleRate
                com.google.android.exoplayer2.Format$Builder r2 = r2.setSampleRate(r3)
                r2.setPcmEncoding(r6)
                r2 = 1
                goto L569
            L461:
                boolean r6 = com.google.android.exoplayer2.util.MimeTypes.isVideo(r4)
                if (r6 == 0) goto L53c
                int r2 = r0.displayUnit
                if (r2 != 0) goto L47d
                int r2 = r0.displayWidth
                r6 = -1
                if (r2 != r6) goto L472
                int r2 = r0.width
            L472:
                r0.displayWidth = r2
                int r2 = r0.displayHeight
                if (r2 != r6) goto L47a
                int r2 = r0.height
            L47a:
                r0.displayHeight = r2
                goto L47e
            L47d:
                r6 = -1
            L47e:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r7 = r0.displayWidth
                if (r7 == r6) goto L493
                int r8 = r0.displayHeight
                if (r8 == r6) goto L493
                int r2 = r0.height
                int r2 = r2 * r7
                float r2 = (float) r2
                int r7 = r0.width
                int r7 = r7 * r8
                float r7 = (float) r7
                float r2 = r2 / r7
            L493:
                boolean r7 = r0.hasColorInfo
                if (r7 == 0) goto L4a7
                byte[] r3 = r17.getHdrStaticInfo()
                com.google.android.exoplayer2.video.ColorInfo r7 = new com.google.android.exoplayer2.video.ColorInfo
                int r8 = r0.colorSpace
                int r9 = r0.colorRange
                int r10 = r0.colorTransfer
                r7.<init>(r8, r9, r10, r3)
                r3 = r7
            L4a7:
                java.lang.String r7 = r0.name
                if (r7 == 0) goto L4c7
                java.util.Map r7 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.access$600()
                java.lang.String r8 = r0.name
                boolean r7 = r7.containsKey(r8)
                if (r7 == 0) goto L4c7
                java.util.Map r6 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.access$600()
                java.lang.String r7 = r0.name
                java.lang.Object r6 = r6.get(r7)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
            L4c7:
                int r7 = r0.projectionType
                if (r7 != 0) goto L517
                float r7 = r0.projectionPoseYaw
                r8 = 0
                int r7 = java.lang.Float.compare(r7, r8)
                if (r7 != 0) goto L517
                float r7 = r0.projectionPosePitch
                int r7 = java.lang.Float.compare(r7, r8)
                if (r7 != 0) goto L517
                float r7 = r0.projectionPoseRoll
                int r7 = java.lang.Float.compare(r7, r8)
                if (r7 != 0) goto L4e6
                r6 = 0
                goto L517
            L4e6:
                float r7 = r0.projectionPosePitch
                r8 = 1119092736(0x42b40000, float:90.0)
                int r7 = java.lang.Float.compare(r7, r8)
                if (r7 != 0) goto L4f3
                r6 = 90
                goto L517
            L4f3:
                float r7 = r0.projectionPosePitch
                r8 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r7 = java.lang.Float.compare(r7, r8)
                if (r7 == 0) goto L515
                float r7 = r0.projectionPosePitch
                r8 = 1127481344(0x43340000, float:180.0)
                int r7 = java.lang.Float.compare(r7, r8)
                if (r7 != 0) goto L508
                goto L515
            L508:
                float r7 = r0.projectionPosePitch
                r8 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r7 = java.lang.Float.compare(r7, r8)
                if (r7 != 0) goto L517
                r6 = 270(0x10e, float:3.78E-43)
                goto L517
            L515:
                r6 = 180(0xb4, float:2.52E-43)
            L517:
                int r7 = r0.width
                com.google.android.exoplayer2.Format$Builder r7 = r14.setWidth(r7)
                int r8 = r0.height
                com.google.android.exoplayer2.Format$Builder r7 = r7.setHeight(r8)
                com.google.android.exoplayer2.Format$Builder r2 = r7.setPixelWidthHeightRatio(r2)
                com.google.android.exoplayer2.Format$Builder r2 = r2.setRotationDegrees(r6)
                byte[] r6 = r0.projectionData
                com.google.android.exoplayer2.Format$Builder r2 = r2.setProjectionData(r6)
                int r6 = r0.stereoMode
                com.google.android.exoplayer2.Format$Builder r2 = r2.setStereoMode(r6)
                r2.setColorInfo(r3)
                r2 = 2
                goto L569
            L53c:
                boolean r6 = r11.equals(r4)
                if (r6 != 0) goto L568
                boolean r6 = r10.equals(r4)
                if (r6 != 0) goto L568
                boolean r6 = r9.equals(r4)
                if (r6 != 0) goto L568
                boolean r6 = r8.equals(r4)
                if (r6 != 0) goto L568
                boolean r6 = r7.equals(r4)
                if (r6 != 0) goto L568
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L561
                goto L568
            L561:
                java.lang.String r1 = "Unexpected MIME type."
                com.google.android.exoplayer2.ParserException r1 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r1, r3)
                throw r1
            L568:
                r2 = 3
            L569:
                java.lang.String r3 = r0.name
                if (r3 == 0) goto L57e
                java.util.Map r3 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.access$600()
                java.lang.String r6 = r0.name
                boolean r3 = r3.containsKey(r6)
                if (r3 != 0) goto L57e
                java.lang.String r3 = r0.name
                r14.setLabel(r3)
            L57e:
                r3 = r19
                com.google.android.exoplayer2.Format$Builder r3 = r14.setId(r3)
                com.google.android.exoplayer2.Format$Builder r3 = r3.setSampleMimeType(r4)
                com.google.android.exoplayer2.Format$Builder r3 = r3.setMaxInputSize(r12)
                java.lang.String r4 = r0.language
                com.google.android.exoplayer2.Format$Builder r3 = r3.setLanguage(r4)
                com.google.android.exoplayer2.Format$Builder r3 = r3.setSelectionFlags(r13)
                com.google.android.exoplayer2.Format$Builder r1 = r3.setInitializationData(r1)
                com.google.android.exoplayer2.Format$Builder r1 = r1.setCodecs(r5)
                com.google.android.exoplayer2.drm.DrmInitData r3 = r0.drmInitData
                com.google.android.exoplayer2.Format$Builder r1 = r1.setDrmInitData(r3)
                com.google.android.exoplayer2.Format r1 = r1.build()
                int r3 = r0.number
                r4 = r18
                com.google.android.exoplayer2.extractor.TrackOutput r2 = r4.track(r3, r2)
                r0.output = r2
                r2.format(r1)
                return
        }

        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
        public void outputPendingSampleMetadata() {
                r3 = this;
                com.google.android.exoplayer2.extractor.TrueHdSampleRechunker r0 = r3.trueHdSampleRechunker
                if (r0 == 0) goto Lb
                com.google.android.exoplayer2.extractor.TrackOutput r1 = r3.output
                com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r2 = r3.cryptoData
                r0.outputPendingSampleMetadata(r1, r2)
            Lb:
                return
        }

        public void reset() {
                r1 = this;
                com.google.android.exoplayer2.extractor.TrueHdSampleRechunker r0 = r1.trueHdSampleRechunker
                if (r0 == 0) goto L7
                r0.reset()
            L7:
                return
        }
    }

    public static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] $r8$lambda$qsltAvNq8qIdGQ0GczXR26lySrU() {
            com.google.android.exoplayer2.extractor.Extractor[] r0 = lambda$static$0()
            return r0
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$3
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.FACTORY = r0
            r0 = 32
            byte[] r1 = new byte[r0]
            r1 = {x006e: FILL_ARRAY_DATA , data: [49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10} // fill-array
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.SUBRIP_PREFIX = r1
            java.lang.String r1 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text"
            byte[] r1 = com.google.android.exoplayer2.util.Util.getUtf8Bytes(r1)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.SSA_DIALOGUE_FORMAT = r1
            byte[] r0 = new byte[r0]
            r0 = {x0082: FILL_ARRAY_DATA , data: [68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44} // fill-array
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.SSA_PREFIX = r0
            r0 = 38
            byte[] r0 = new byte[r0]
            r0 = {x0096: FILL_ARRAY_DATA , data: [87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10} // fill-array
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.VTT_PREFIX = r0
            java.util.UUID r0 = new java.util.UUID
            r1 = 72057594037932032(0x100000000001000, double:7.291122019563029E-304)
            r3 = -9223371306706625679(0x800000aa00389b71, double:-3.607411173533E-312)
            r0.<init>(r1, r3)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.WAVE_SUBFORMAT_PCM = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "htc_video_rotA-000"
            r0.put(r2, r1)
            r1 = 90
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "htc_video_rotA-090"
            r0.put(r2, r1)
            r1 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "htc_video_rotA-180"
            r0.put(r2, r1)
            r1 = 270(0x10e, float:3.78E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "htc_video_rotA-270"
            r0.put(r2, r1)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES = r0
            return
    }

    public MatroskaExtractor() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public MatroskaExtractor(int r6) {
            r5 = this;
            com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader r0 = new com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader
            r0.<init>()
            r5.<init>()
            r1 = -1
            r5.segmentContentPosition = r1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.timecodeScale = r3
            r5.durationTimecode = r3
            r5.durationUs = r3
            r5.cuesContentPosition = r1
            r5.seekPositionAfterBuildingCues = r1
            r5.clusterTimecodeUs = r3
            r5.reader = r0
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$InnerEbmlProcessor r1 = new com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$InnerEbmlProcessor
            r2 = 0
            r1.<init>(r5, r2)
            r0.init(r1)
            r0 = 1
            r6 = r6 & r0
            if (r6 != 0) goto L2e
            r6 = 1
            goto L2f
        L2e:
            r6 = 0
        L2f:
            r5.seekForCuesEnabled = r6
            com.google.android.exoplayer2.extractor.mkv.VarintReader r6 = new com.google.android.exoplayer2.extractor.mkv.VarintReader
            r6.<init>()
            r5.varintReader = r6
            android.util.SparseArray r6 = new android.util.SparseArray
            r6.<init>()
            r5.tracks = r6
            com.google.android.exoplayer2.util.ParsableByteArray r6 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 4
            r6.<init>(r1)
            r5.scratch = r6
            com.google.android.exoplayer2.util.ParsableByteArray r6 = new com.google.android.exoplayer2.util.ParsableByteArray
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)
            r3 = -1
            java.nio.ByteBuffer r2 = r2.putInt(r3)
            byte[] r2 = r2.array()
            r6.<init>(r2)
            r5.vorbisNumPageSamples = r6
            com.google.android.exoplayer2.util.ParsableByteArray r6 = new com.google.android.exoplayer2.util.ParsableByteArray
            r6.<init>(r1)
            r5.seekEntryIdBytes = r6
            com.google.android.exoplayer2.util.ParsableByteArray r6 = new com.google.android.exoplayer2.util.ParsableByteArray
            byte[] r2 = com.google.android.exoplayer2.util.NalUnitUtil.NAL_START_CODE
            r6.<init>(r2)
            r5.nalStartCode = r6
            com.google.android.exoplayer2.util.ParsableByteArray r6 = new com.google.android.exoplayer2.util.ParsableByteArray
            r6.<init>(r1)
            r5.nalLength = r6
            com.google.android.exoplayer2.util.ParsableByteArray r6 = new com.google.android.exoplayer2.util.ParsableByteArray
            r6.<init>()
            r5.sampleStrippedBytes = r6
            com.google.android.exoplayer2.util.ParsableByteArray r6 = new com.google.android.exoplayer2.util.ParsableByteArray
            r6.<init>()
            r5.subtitleSample = r6
            com.google.android.exoplayer2.util.ParsableByteArray r6 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 8
            r6.<init>(r1)
            r5.encryptionInitializationVector = r6
            com.google.android.exoplayer2.util.ParsableByteArray r6 = new com.google.android.exoplayer2.util.ParsableByteArray
            r6.<init>()
            r5.encryptionSubsampleData = r6
            com.google.android.exoplayer2.util.ParsableByteArray r6 = new com.google.android.exoplayer2.util.ParsableByteArray
            r6.<init>()
            r5.supplementalData = r6
            int[] r6 = new int[r0]
            r5.blockSampleSizes = r6
            return
    }

    public static /* synthetic */ byte[] access$500() {
            byte[] r0 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.SSA_DIALOGUE_FORMAT
            return r0
    }

    public static /* synthetic */ java.util.Map access$600() {
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES
            return r0
    }

    public static /* synthetic */ java.util.UUID access$700() {
            java.util.UUID r0 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.WAVE_SUBFORMAT_PCM
            return r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void assertInCues(int r3) throws com.google.android.exoplayer2.ParserException {
            r2 = this;
            com.google.android.exoplayer2.util.LongArray r0 = r2.cueTimesUs
            if (r0 == 0) goto L9
            com.google.android.exoplayer2.util.LongArray r0 = r2.cueClusterPositions
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Element "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " must be in a Cues"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 0
            com.google.android.exoplayer2.ParserException r3 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r3, r0)
            throw r3
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"currentTrack"})
    private void assertInTrackEntry(int r3) throws com.google.android.exoplayer2.ParserException {
            r2 = this;
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r0 = r2.currentTrack
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Element "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " must be in a TrackEntry"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 0
            com.google.android.exoplayer2.ParserException r3 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r3, r0)
            throw r3
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractorOutput"})
    private void assertInitialized() {
            r1 = this;
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r1.extractorOutput
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            return
    }

    private com.google.android.exoplayer2.extractor.SeekMap buildSeekMap(@androidx.annotation.Nullable com.google.android.exoplayer2.util.LongArray r12, @androidx.annotation.Nullable com.google.android.exoplayer2.util.LongArray r13) {
            r11 = this;
            long r0 = r11.segmentContentPosition
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La8
            long r0 = r11.durationUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La8
            if (r12 == 0) goto La8
            int r0 = r12.size()
            if (r0 == 0) goto La8
            if (r13 == 0) goto La8
            int r0 = r13.size()
            int r1 = r12.size()
            if (r0 == r1) goto L29
            goto La8
        L29:
            int r0 = r12.size()
            int[] r1 = new int[r0]
            long[] r2 = new long[r0]
            long[] r3 = new long[r0]
            long[] r4 = new long[r0]
            r5 = 0
            r6 = 0
        L37:
            if (r6 >= r0) goto L4b
            long r7 = r12.get(r6)
            r4[r6] = r7
            long r7 = r11.segmentContentPosition
            long r9 = r13.get(r6)
            long r9 = r9 + r7
            r2[r6] = r9
            int r6 = r6 + 1
            goto L37
        L4b:
            int r12 = r0 + (-1)
            if (r5 >= r12) goto L62
            int r12 = r5 + 1
            r6 = r2[r12]
            r8 = r2[r5]
            long r6 = r6 - r8
            int r13 = (int) r6
            r1[r5] = r13
            r6 = r4[r12]
            r8 = r4[r5]
            long r6 = r6 - r8
            r3[r5] = r6
            r5 = r12
            goto L4b
        L62:
            long r5 = r11.segmentContentPosition
            long r7 = r11.segmentContentSize
            long r5 = r5 + r7
            r7 = r2[r12]
            long r5 = r5 - r7
            int r13 = (int) r5
            r1[r12] = r13
            long r5 = r11.durationUs
            r7 = r4[r12]
            long r5 = r5 - r7
            r3[r12] = r5
            r5 = r3[r12]
            r7 = 0
            int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r13 > 0) goto La2
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Discarding last cue point with unexpected duration: "
            r13.append(r0)
            r13.append(r5)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "MatroskaExtractor"
            com.google.android.exoplayer2.util.Log.w(r0, r13)
            int[] r1 = java.util.Arrays.copyOf(r1, r12)
            long[] r2 = java.util.Arrays.copyOf(r2, r12)
            long[] r3 = java.util.Arrays.copyOf(r3, r12)
            long[] r4 = java.util.Arrays.copyOf(r4, r12)
        La2:
            com.google.android.exoplayer2.extractor.ChunkIndex r12 = new com.google.android.exoplayer2.extractor.ChunkIndex
            r12.<init>(r1, r2, r3, r4)
            return r12
        La8:
            com.google.android.exoplayer2.extractor.SeekMap$Unseekable r12 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
            long r0 = r11.durationUs
            r12.<init>(r0)
            return r12
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    private void commitSampleToOutput(com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track r10, long r11, int r13, int r14, int r15) {
            r9 = this;
            com.google.android.exoplayer2.extractor.TrueHdSampleRechunker r0 = r10.trueHdSampleRechunker
            r8 = 1
            if (r0 == 0) goto L12
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r10.output
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r7 = r10.cryptoData
            r2 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r0.sampleMetadata(r1, r2, r4, r5, r6, r7)
            goto Lb5
        L12:
            java.lang.String r0 = r10.codecId
            java.lang.String r1 = "S_TEXT/UTF8"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = r10.codecId
            java.lang.String r1 = "S_TEXT/ASS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = r10.codecId
            java.lang.String r1 = "S_TEXT/WEBVTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L8b
        L30:
            int r0 = r9.blockSampleCount
            java.lang.String r1 = "MatroskaExtractor"
            if (r0 <= r8) goto L3c
            java.lang.String r0 = "Skipping subtitle sample in laced block."
            com.google.android.exoplayer2.util.Log.w(r1, r0)
            goto L8b
        L3c:
            long r2 = r9.blockDurationUs
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L4d
            java.lang.String r0 = "Skipping subtitle sample with no duration."
            com.google.android.exoplayer2.util.Log.w(r1, r0)
            goto L8b
        L4d:
            java.lang.String r0 = r10.codecId
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r9.subtitleSample
            byte[] r1 = r1.getData()
            setSubtitleEndTime(r0, r2, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r9.subtitleSample
            int r0 = r0.getPosition()
        L5e:
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r9.subtitleSample
            int r1 = r1.limit()
            if (r0 >= r1) goto L79
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r9.subtitleSample
            byte[] r1 = r1.getData()
            r1 = r1[r0]
            if (r1 != 0) goto L76
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r9.subtitleSample
            r1.setLimit(r0)
            goto L79
        L76:
            int r0 = r0 + 1
            goto L5e
        L79:
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r10.output
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r9.subtitleSample
            int r2 = r1.limit()
            r0.sampleData(r1, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r9.subtitleSample
            int r0 = r0.limit()
            int r14 = r14 + r0
        L8b:
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r0 = r0 & r13
            if (r0 == 0) goto Laa
            int r0 = r9.blockSampleCount
            if (r0 <= r8) goto L9b
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r9.supplementalData
            r1 = 0
            r0.reset(r1)
            goto Laa
        L9b:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r9.supplementalData
            int r0 = r0.limit()
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r10.output
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r9.supplementalData
            r3 = 2
            r1.sampleData(r2, r0, r3)
            int r14 = r14 + r0
        Laa:
            r4 = r14
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r10.output
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r6 = r10.cryptoData
            r1 = r11
            r3 = r13
            r5 = r15
            r0.sampleMetadata(r1, r3, r4, r5, r6)
        Lb5:
            r9.haveOutputSample = r8
            return
    }

    private static int[] ensureArrayCapacity(@androidx.annotation.Nullable int[] r1, int r2) {
            if (r1 != 0) goto L5
            int[] r1 = new int[r2]
            return r1
        L5:
            int r0 = r1.length
            if (r0 < r2) goto L9
            return r1
        L9:
            int r1 = r1.length
            int r1 = r1 * 2
            int r1 = java.lang.Math.max(r1, r2)
            int[] r1 = new int[r1]
            return r1
    }

    private int finishWriteSampleData() {
            r1 = this;
            int r0 = r1.sampleBytesWritten
            r1.resetWriteSampleData()
            return r0
    }

    private static byte[] formatSubtitleTimecode(long r10, java.lang.String r12, long r13) {
            r0 = 1
            r1 = 0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            r2 = 3600000000(0xd693a400, double:1.778636325E-314)
            long r2 = r10 / r2
            int r3 = (int) r2
            long r4 = (long) r3
            r6 = 3600(0xe10, double:1.7786E-320)
            long r4 = r4 * r6
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r6
            long r10 = r10 - r4
            r4 = 60000000(0x3938700, double:2.96439388E-316)
            long r4 = r10 / r4
            int r2 = (int) r4
            long r4 = (long) r2
            r8 = 60
            long r4 = r4 * r8
            long r4 = r4 * r6
            long r10 = r10 - r4
            long r4 = r10 / r6
            int r5 = (int) r4
            long r8 = (long) r5
            long r8 = r8 * r6
            long r10 = r10 - r8
            long r10 = r10 / r13
            int r11 = (int) r10
            java.util.Locale r10 = java.util.Locale.US
            r13 = 4
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            r13[r1] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            r13[r0] = r14
            r14 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r13[r14] = r0
            r14 = 3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13[r14] = r11
            java.lang.String r10 = java.lang.String.format(r10, r12, r13)
            byte[] r10 = com.google.android.exoplayer2.util.Util.getUtf8Bytes(r10)
            return r10
    }

    private static boolean isCodecSupported(java.lang.String r4) {
            java.util.Objects.requireNonNull(r4)
            int r0 = r4.hashCode()
            r1 = 1
            r2 = 0
            r3 = -1
            switch(r0) {
                case -2095576542: goto L1ba;
                case -2095575984: goto L1af;
                case -1985379776: goto L1a4;
                case -1784763192: goto L199;
                case -1730367663: goto L18e;
                case -1482641358: goto L183;
                case -1482641357: goto L178;
                case -1373388978: goto L16d;
                case -933872740: goto L15f;
                case -538363189: goto L151;
                case -538363109: goto L143;
                case -425012669: goto L135;
                case -356037306: goto L127;
                case 62923557: goto L119;
                case 62923603: goto L10b;
                case 62927045: goto Lfd;
                case 82318131: goto Lef;
                case 82338133: goto Le1;
                case 82338134: goto Ld3;
                case 99146302: goto Lc5;
                case 444813526: goto Lb7;
                case 542569478: goto La9;
                case 635596514: goto L9b;
                case 725948237: goto L8d;
                case 725957860: goto L7f;
                case 738597099: goto L71;
                case 855502857: goto L63;
                case 1045209816: goto L55;
                case 1422270023: goto L47;
                case 1809237540: goto L39;
                case 1950749482: goto L2b;
                case 1950789798: goto L1d;
                case 1951062397: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto L1c4
        Lf:
            java.lang.String r0 = "A_OPUS"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L19
            goto L1c4
        L19:
            r3 = 32
            goto L1c4
        L1d:
            java.lang.String r0 = "A_FLAC"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L27
            goto L1c4
        L27:
            r3 = 31
            goto L1c4
        L2b:
            java.lang.String r0 = "A_EAC3"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L35
            goto L1c4
        L35:
            r3 = 30
            goto L1c4
        L39:
            java.lang.String r0 = "V_MPEG2"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L43
            goto L1c4
        L43:
            r3 = 29
            goto L1c4
        L47:
            java.lang.String r0 = "S_TEXT/UTF8"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L51
            goto L1c4
        L51:
            r3 = 28
            goto L1c4
        L55:
            java.lang.String r0 = "S_TEXT/WEBVTT"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L5f
            goto L1c4
        L5f:
            r3 = 27
            goto L1c4
        L63:
            java.lang.String r0 = "V_MPEGH/ISO/HEVC"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L6d
            goto L1c4
        L6d:
            r3 = 26
            goto L1c4
        L71:
            java.lang.String r0 = "S_TEXT/ASS"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L7b
            goto L1c4
        L7b:
            r3 = 25
            goto L1c4
        L7f:
            java.lang.String r0 = "A_PCM/INT/LIT"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L89
            goto L1c4
        L89:
            r3 = 24
            goto L1c4
        L8d:
            java.lang.String r0 = "A_PCM/INT/BIG"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L97
            goto L1c4
        L97:
            r3 = 23
            goto L1c4
        L9b:
            java.lang.String r0 = "A_PCM/FLOAT/IEEE"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto La5
            goto L1c4
        La5:
            r3 = 22
            goto L1c4
        La9:
            java.lang.String r0 = "A_DTS/EXPRESS"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lb3
            goto L1c4
        Lb3:
            r3 = 21
            goto L1c4
        Lb7:
            java.lang.String r0 = "V_THEORA"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lc1
            goto L1c4
        Lc1:
            r3 = 20
            goto L1c4
        Lc5:
            java.lang.String r0 = "S_HDMV/PGS"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lcf
            goto L1c4
        Lcf:
            r3 = 19
            goto L1c4
        Ld3:
            java.lang.String r0 = "V_VP9"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Ldd
            goto L1c4
        Ldd:
            r3 = 18
            goto L1c4
        Le1:
            java.lang.String r0 = "V_VP8"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Leb
            goto L1c4
        Leb:
            r3 = 17
            goto L1c4
        Lef:
            java.lang.String r0 = "V_AV1"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lf9
            goto L1c4
        Lf9:
            r3 = 16
            goto L1c4
        Lfd:
            java.lang.String r0 = "A_DTS"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L107
            goto L1c4
        L107:
            r3 = 15
            goto L1c4
        L10b:
            java.lang.String r0 = "A_AC3"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L115
            goto L1c4
        L115:
            r3 = 14
            goto L1c4
        L119:
            java.lang.String r0 = "A_AAC"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L123
            goto L1c4
        L123:
            r3 = 13
            goto L1c4
        L127:
            java.lang.String r0 = "A_DTS/LOSSLESS"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L131
            goto L1c4
        L131:
            r3 = 12
            goto L1c4
        L135:
            java.lang.String r0 = "S_VOBSUB"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L13f
            goto L1c4
        L13f:
            r3 = 11
            goto L1c4
        L143:
            java.lang.String r0 = "V_MPEG4/ISO/AVC"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L14d
            goto L1c4
        L14d:
            r3 = 10
            goto L1c4
        L151:
            java.lang.String r0 = "V_MPEG4/ISO/ASP"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L15b
            goto L1c4
        L15b:
            r3 = 9
            goto L1c4
        L15f:
            java.lang.String r0 = "S_DVBSUB"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L169
            goto L1c4
        L169:
            r3 = 8
            goto L1c4
        L16d:
            java.lang.String r0 = "V_MS/VFW/FOURCC"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L176
            goto L1c4
        L176:
            r3 = 7
            goto L1c4
        L178:
            java.lang.String r0 = "A_MPEG/L3"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L181
            goto L1c4
        L181:
            r3 = 6
            goto L1c4
        L183:
            java.lang.String r0 = "A_MPEG/L2"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L18c
            goto L1c4
        L18c:
            r3 = 5
            goto L1c4
        L18e:
            java.lang.String r0 = "A_VORBIS"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L197
            goto L1c4
        L197:
            r3 = 4
            goto L1c4
        L199:
            java.lang.String r0 = "A_TRUEHD"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L1a2
            goto L1c4
        L1a2:
            r3 = 3
            goto L1c4
        L1a4:
            java.lang.String r0 = "A_MS/ACM"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L1ad
            goto L1c4
        L1ad:
            r3 = 2
            goto L1c4
        L1af:
            java.lang.String r0 = "V_MPEG4/ISO/SP"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L1b8
            goto L1c4
        L1b8:
            r3 = 1
            goto L1c4
        L1ba:
            java.lang.String r0 = "V_MPEG4/ISO/AP"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L1c3
            goto L1c4
        L1c3:
            r3 = 0
        L1c4:
            switch(r3) {
                case 0: goto L1c8;
                case 1: goto L1c8;
                case 2: goto L1c8;
                case 3: goto L1c8;
                case 4: goto L1c8;
                case 5: goto L1c8;
                case 6: goto L1c8;
                case 7: goto L1c8;
                case 8: goto L1c8;
                case 9: goto L1c8;
                case 10: goto L1c8;
                case 11: goto L1c8;
                case 12: goto L1c8;
                case 13: goto L1c8;
                case 14: goto L1c8;
                case 15: goto L1c8;
                case 16: goto L1c8;
                case 17: goto L1c8;
                case 18: goto L1c8;
                case 19: goto L1c8;
                case 20: goto L1c8;
                case 21: goto L1c8;
                case 22: goto L1c8;
                case 23: goto L1c8;
                case 24: goto L1c8;
                case 25: goto L1c8;
                case 26: goto L1c8;
                case 27: goto L1c8;
                case 28: goto L1c8;
                case 29: goto L1c8;
                case 30: goto L1c8;
                case 31: goto L1c8;
                case 32: goto L1c8;
                default: goto L1c7;
            }
        L1c7:
            return r2
        L1c8:
            return r1
    }

    private static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
            r0 = 1
            com.google.android.exoplayer2.extractor.Extractor[] r0 = new com.google.android.exoplayer2.extractor.Extractor[r0]
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r1 = new com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            return r0
    }

    private boolean maybeSeekForCues(com.google.android.exoplayer2.extractor.PositionHolder r6, long r7) {
            r5 = this;
            boolean r0 = r5.seekForCues
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lf
            r5.seekPositionAfterBuildingCues = r7
            long r7 = r5.cuesContentPosition
            r6.position = r7
            r5.seekForCues = r2
            return r1
        Lf:
            boolean r7 = r5.sentSeekMap
            if (r7 == 0) goto L20
            long r7 = r5.seekPositionAfterBuildingCues
            r3 = -1
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto L20
            r6.position = r7
            r5.seekPositionAfterBuildingCues = r3
            return r1
        L20:
            return r2
    }

    private void readScratch(com.google.android.exoplayer2.extractor.ExtractorInput r4, int r5) throws java.io.IOException {
            r3 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            int r0 = r0.limit()
            if (r0 < r5) goto L9
            return
        L9:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            int r0 = r0.capacity()
            if (r0 >= r5) goto L20
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            int r1 = r0.capacity()
            int r1 = r1 * 2
            int r1 = java.lang.Math.max(r1, r5)
            r0.ensureCapacity(r1)
        L20:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            byte[] r0 = r0.getData()
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r3.scratch
            int r1 = r1.limit()
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r3.scratch
            int r2 = r2.limit()
            int r2 = r5 - r2
            r4.readFully(r0, r1, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r3.scratch
            r4.setLimit(r5)
            return
    }

    private void resetWriteSampleData() {
            r2 = this;
            r0 = 0
            r2.sampleBytesRead = r0
            r2.sampleBytesWritten = r0
            r2.sampleCurrentNalBytesRemaining = r0
            r2.sampleEncodingHandled = r0
            r2.sampleSignalByteRead = r0
            r2.samplePartitionCountRead = r0
            r2.samplePartitionCount = r0
            r2.sampleSignalByte = r0
            r2.sampleInitializationVectorRead = r0
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r2.sampleStrippedBytes
            r1.reset(r0)
            return
    }

    private long scaleTimecodeToUs(long r7) throws com.google.android.exoplayer2.ParserException {
            r6 = this;
            long r2 = r6.timecodeScale
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L13
            r4 = 1000(0x3e8, double:4.94E-321)
            r0 = r7
            long r7 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r0, r2, r4)
            return r7
        L13:
            r7 = 0
            java.lang.String r8 = "Can't scale timecode prior to timecodeScale being set."
            com.google.android.exoplayer2.ParserException r7 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r8, r7)
            throw r7
    }

    private static void setSubtitleEndTime(java.lang.String r5, long r6, byte[] r8) {
            java.util.Objects.requireNonNull(r5)
            int r0 = r5.hashCode()
            r1 = 0
            r2 = -1
            switch(r0) {
                case 738597099: goto L23;
                case 1045209816: goto L18;
                case 1422270023: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L2d
        Ld:
            java.lang.String r0 = "S_TEXT/UTF8"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L16
            goto L2d
        L16:
            r2 = 2
            goto L2d
        L18:
            java.lang.String r0 = "S_TEXT/WEBVTT"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L21
            goto L2d
        L21:
            r2 = 1
            goto L2d
        L23:
            java.lang.String r0 = "S_TEXT/ASS"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L2c
            goto L2d
        L2c:
            r2 = 0
        L2d:
            r3 = 1000(0x3e8, double:4.94E-321)
            switch(r2) {
                case 0: goto L4a;
                case 1: goto L41;
                case 2: goto L38;
                default: goto L32;
            }
        L32:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L38:
            java.lang.String r5 = "%02d:%02d:%02d,%03d"
            byte[] r5 = formatSubtitleTimecode(r6, r5, r3)
            r6 = 19
            goto L54
        L41:
            java.lang.String r5 = "%02d:%02d:%02d.%03d"
            byte[] r5 = formatSubtitleTimecode(r6, r5, r3)
            r6 = 25
            goto L54
        L4a:
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r5 = "%01d:%02d:%02d:%02d"
            byte[] r5 = formatSubtitleTimecode(r6, r5, r2)
            r6 = 21
        L54:
            int r7 = r5.length
            java.lang.System.arraycopy(r5, r1, r8, r6, r7)
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#2.output"})
    private int writeSampleData(com.google.android.exoplayer2.extractor.ExtractorInput r11, com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track r12, int r13, boolean r14) throws java.io.IOException {
            r10 = this;
            java.lang.String r0 = r12.codecId
            java.lang.String r1 = "S_TEXT/UTF8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L14
            byte[] r12 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.SUBRIP_PREFIX
            r10.writeSubtitleSampleData(r11, r12, r13)
            int r11 = r10.finishWriteSampleData()
            return r11
        L14:
            java.lang.String r0 = r12.codecId
            java.lang.String r1 = "S_TEXT/ASS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L28
            byte[] r12 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.SSA_PREFIX
            r10.writeSubtitleSampleData(r11, r12, r13)
            int r11 = r10.finishWriteSampleData()
            return r11
        L28:
            java.lang.String r0 = r12.codecId
            java.lang.String r1 = "S_TEXT/WEBVTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3c
            byte[] r12 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.VTT_PREFIX
            r10.writeSubtitleSampleData(r11, r12, r13)
            int r11 = r10.finishWriteSampleData()
            return r11
        L3c:
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r12.output
            boolean r1 = r10.sampleEncodingHandled
            r2 = 4
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L1f9
            boolean r1 = r12.hasContentEncryption
            if (r1 == 0) goto L18f
            int r1 = r10.blockFlags
            r6 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            r1 = r1 & r6
            r10.blockFlags = r1
            boolean r1 = r10.sampleSignalByteRead
            r6 = 128(0x80, float:1.8E-43)
            if (r1 != 0) goto L86
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.scratch
            byte[] r1 = r1.getData()
            r11.readFully(r1, r5, r4)
            int r1 = r10.sampleBytesRead
            int r1 = r1 + r4
            r10.sampleBytesRead = r1
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.scratch
            byte[] r1 = r1.getData()
            r1 = r1[r5]
            r1 = r1 & r6
            if (r1 == r6) goto L7e
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.scratch
            byte[] r1 = r1.getData()
            r1 = r1[r5]
            r10.sampleSignalByte = r1
            r10.sampleSignalByteRead = r4
            goto L86
        L7e:
            r11 = 0
            java.lang.String r12 = "Extension bit is set in signal byte"
            com.google.android.exoplayer2.ParserException r11 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r12, r11)
            throw r11
        L86:
            byte r1 = r10.sampleSignalByte
            r7 = r1 & 1
            if (r7 != r4) goto L8e
            r7 = 1
            goto L8f
        L8e:
            r7 = 0
        L8f:
            if (r7 == 0) goto L199
            r1 = r1 & r3
            if (r1 != r3) goto L96
            r1 = 1
            goto L97
        L96:
            r1 = 0
        L97:
            int r7 = r10.blockFlags
            r8 = 1073741824(0x40000000, float:2.0)
            r7 = r7 | r8
            r10.blockFlags = r7
            boolean r7 = r10.sampleInitializationVectorRead
            if (r7 != 0) goto Le0
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r10.encryptionInitializationVector
            byte[] r7 = r7.getData()
            r8 = 8
            r11.readFully(r7, r5, r8)
            int r7 = r10.sampleBytesRead
            int r7 = r7 + r8
            r10.sampleBytesRead = r7
            r10.sampleInitializationVectorRead = r4
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r10.scratch
            byte[] r7 = r7.getData()
            if (r1 == 0) goto Lbd
            goto Lbe
        Lbd:
            r6 = 0
        Lbe:
            r6 = r6 | r8
            byte r6 = (byte) r6
            r7[r5] = r6
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r10.scratch
            r6.setPosition(r5)
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r10.scratch
            r0.sampleData(r6, r4, r4)
            int r6 = r10.sampleBytesWritten
            int r6 = r6 + r4
            r10.sampleBytesWritten = r6
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r10.encryptionInitializationVector
            r6.setPosition(r5)
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r10.encryptionInitializationVector
            r0.sampleData(r6, r8, r4)
            int r6 = r10.sampleBytesWritten
            int r6 = r6 + r8
            r10.sampleBytesWritten = r6
        Le0:
            if (r1 == 0) goto L199
            boolean r1 = r10.samplePartitionCountRead
            if (r1 != 0) goto L103
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.scratch
            byte[] r1 = r1.getData()
            r11.readFully(r1, r5, r4)
            int r1 = r10.sampleBytesRead
            int r1 = r1 + r4
            r10.sampleBytesRead = r1
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.scratch
            r1.setPosition(r5)
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.scratch
            int r1 = r1.readUnsignedByte()
            r10.samplePartitionCount = r1
            r10.samplePartitionCountRead = r4
        L103:
            int r1 = r10.samplePartitionCount
            int r1 = r1 * 4
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r10.scratch
            r6.reset(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r10.scratch
            byte[] r6 = r6.getData()
            r11.readFully(r6, r5, r1)
            int r6 = r10.sampleBytesRead
            int r6 = r6 + r1
            r10.sampleBytesRead = r6
            int r1 = r10.samplePartitionCount
            int r1 = r1 / r3
            int r1 = r1 + r4
            short r1 = (short) r1
            int r6 = r1 * 6
            int r6 = r6 + r3
            java.nio.ByteBuffer r7 = r10.encryptionSubsampleDataBuffer
            if (r7 == 0) goto L12c
            int r7 = r7.capacity()
            if (r7 >= r6) goto L132
        L12c:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r6)
            r10.encryptionSubsampleDataBuffer = r7
        L132:
            java.nio.ByteBuffer r7 = r10.encryptionSubsampleDataBuffer
            r7.position(r5)
            java.nio.ByteBuffer r7 = r10.encryptionSubsampleDataBuffer
            r7.putShort(r1)
            r1 = 0
            r7 = 0
        L13e:
            int r8 = r10.samplePartitionCount
            if (r1 >= r8) goto L160
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r10.scratch
            int r8 = r8.readUnsignedIntToInt()
            int r9 = r1 % 2
            if (r9 != 0) goto L155
            java.nio.ByteBuffer r9 = r10.encryptionSubsampleDataBuffer
            int r7 = r8 - r7
            short r7 = (short) r7
            r9.putShort(r7)
            goto L15c
        L155:
            java.nio.ByteBuffer r9 = r10.encryptionSubsampleDataBuffer
            int r7 = r8 - r7
            r9.putInt(r7)
        L15c:
            int r1 = r1 + 1
            r7 = r8
            goto L13e
        L160:
            int r1 = r10.sampleBytesRead
            int r1 = r13 - r1
            int r1 = r1 - r7
            int r8 = r8 % r3
            if (r8 != r4) goto L16e
            java.nio.ByteBuffer r7 = r10.encryptionSubsampleDataBuffer
            r7.putInt(r1)
            goto L179
        L16e:
            java.nio.ByteBuffer r7 = r10.encryptionSubsampleDataBuffer
            short r1 = (short) r1
            r7.putShort(r1)
            java.nio.ByteBuffer r1 = r10.encryptionSubsampleDataBuffer
            r1.putInt(r5)
        L179:
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.encryptionSubsampleData
            java.nio.ByteBuffer r7 = r10.encryptionSubsampleDataBuffer
            byte[] r7 = r7.array()
            r1.reset(r7, r6)
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.encryptionSubsampleData
            r0.sampleData(r1, r6, r4)
            int r1 = r10.sampleBytesWritten
            int r1 = r1 + r6
            r10.sampleBytesWritten = r1
            goto L199
        L18f:
            byte[] r1 = r12.sampleStrippedBytes
            if (r1 == 0) goto L199
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r10.sampleStrippedBytes
            int r7 = r1.length
            r6.reset(r1, r7)
        L199:
            boolean r14 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track.access$400(r12, r14)
            if (r14 == 0) goto L1f7
            int r14 = r10.blockFlags
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r14 = r14 | r1
            r10.blockFlags = r14
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r10.supplementalData
            r14.reset(r5)
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r10.sampleStrippedBytes
            int r14 = r14.limit()
            int r14 = r14 + r13
            int r1 = r10.sampleBytesRead
            int r14 = r14 - r1
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.scratch
            r1.reset(r2)
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.scratch
            byte[] r1 = r1.getData()
            int r6 = r14 >> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r1[r5] = r6
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.scratch
            byte[] r1 = r1.getData()
            int r6 = r14 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r1[r4] = r6
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.scratch
            byte[] r1 = r1.getData()
            int r6 = r14 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r1[r3] = r6
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.scratch
            byte[] r1 = r1.getData()
            r6 = 3
            r14 = r14 & 255(0xff, float:3.57E-43)
            byte r14 = (byte) r14
            r1[r6] = r14
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r10.scratch
            r0.sampleData(r14, r2, r3)
            int r14 = r10.sampleBytesWritten
            int r14 = r14 + r2
            r10.sampleBytesWritten = r14
        L1f7:
            r10.sampleEncodingHandled = r4
        L1f9:
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r10.sampleStrippedBytes
            int r14 = r14.limit()
            int r14 = r14 + r13
            java.lang.String r13 = r12.codecId
            java.lang.String r1 = "V_MPEG4/ISO/AVC"
            boolean r13 = r1.equals(r13)
            if (r13 != 0) goto L240
            java.lang.String r13 = r12.codecId
            java.lang.String r1 = "V_MPEGH/ISO/HEVC"
            boolean r13 = r1.equals(r13)
            if (r13 == 0) goto L215
            goto L240
        L215:
            com.google.android.exoplayer2.extractor.TrueHdSampleRechunker r13 = r12.trueHdSampleRechunker
            if (r13 == 0) goto L22b
            com.google.android.exoplayer2.util.ParsableByteArray r13 = r10.sampleStrippedBytes
            int r13 = r13.limit()
            if (r13 != 0) goto L222
            goto L223
        L222:
            r4 = 0
        L223:
            com.google.android.exoplayer2.util.Assertions.checkState(r4)
            com.google.android.exoplayer2.extractor.TrueHdSampleRechunker r13 = r12.trueHdSampleRechunker
            r13.startSample(r11)
        L22b:
            int r13 = r10.sampleBytesRead
            if (r13 >= r14) goto L291
            int r13 = r14 - r13
            int r13 = r10.writeToOutput(r11, r0, r13)
            int r1 = r10.sampleBytesRead
            int r1 = r1 + r13
            r10.sampleBytesRead = r1
            int r1 = r10.sampleBytesWritten
            int r1 = r1 + r13
            r10.sampleBytesWritten = r1
            goto L22b
        L240:
            com.google.android.exoplayer2.util.ParsableByteArray r13 = r10.nalLength
            byte[] r13 = r13.getData()
            r13[r5] = r5
            r13[r4] = r5
            r13[r3] = r5
            int r1 = r12.nalUnitLengthFieldLength
            int r3 = 4 - r1
        L250:
            int r4 = r10.sampleBytesRead
            if (r4 >= r14) goto L291
            int r4 = r10.sampleCurrentNalBytesRemaining
            if (r4 != 0) goto L27d
            r10.writeToTarget(r11, r13, r3, r1)
            int r4 = r10.sampleBytesRead
            int r4 = r4 + r1
            r10.sampleBytesRead = r4
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r10.nalLength
            r4.setPosition(r5)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r10.nalLength
            int r4 = r4.readUnsignedIntToInt()
            r10.sampleCurrentNalBytesRemaining = r4
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r10.nalStartCode
            r4.setPosition(r5)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r10.nalStartCode
            r0.sampleData(r4, r2)
            int r4 = r10.sampleBytesWritten
            int r4 = r4 + r2
            r10.sampleBytesWritten = r4
            goto L250
        L27d:
            int r4 = r10.writeToOutput(r11, r0, r4)
            int r6 = r10.sampleBytesRead
            int r6 = r6 + r4
            r10.sampleBytesRead = r6
            int r6 = r10.sampleBytesWritten
            int r6 = r6 + r4
            r10.sampleBytesWritten = r6
            int r6 = r10.sampleCurrentNalBytesRemaining
            int r6 = r6 - r4
            r10.sampleCurrentNalBytesRemaining = r6
            goto L250
        L291:
            java.lang.String r11 = r12.codecId
            java.lang.String r12 = "A_VORBIS"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L2aa
            com.google.android.exoplayer2.util.ParsableByteArray r11 = r10.vorbisNumPageSamples
            r11.setPosition(r5)
            com.google.android.exoplayer2.util.ParsableByteArray r11 = r10.vorbisNumPageSamples
            r0.sampleData(r11, r2)
            int r11 = r10.sampleBytesWritten
            int r11 = r11 + r2
            r10.sampleBytesWritten = r11
        L2aa:
            int r11 = r10.finishWriteSampleData()
            return r11
    }

    private void writeSubtitleSampleData(com.google.android.exoplayer2.extractor.ExtractorInput r5, byte[] r6, int r7) throws java.io.IOException {
            r4 = this;
            int r0 = r6.length
            int r0 = r0 + r7
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r4.subtitleSample
            int r1 = r1.capacity()
            r2 = 0
            if (r1 >= r0) goto L17
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r4.subtitleSample
            int r3 = r0 + r7
            byte[] r3 = java.util.Arrays.copyOf(r6, r3)
            r1.reset(r3)
            goto L21
        L17:
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r4.subtitleSample
            byte[] r1 = r1.getData()
            int r3 = r6.length
            java.lang.System.arraycopy(r6, r2, r1, r2, r3)
        L21:
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r4.subtitleSample
            byte[] r1 = r1.getData()
            int r6 = r6.length
            r5.readFully(r1, r6, r7)
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r4.subtitleSample
            r5.setPosition(r2)
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r4.subtitleSample
            r5.setLimit(r0)
            return
    }

    private int writeToOutput(com.google.android.exoplayer2.extractor.ExtractorInput r2, com.google.android.exoplayer2.extractor.TrackOutput r3, int r4) throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r1.sampleStrippedBytes
            int r0 = r0.bytesLeft()
            if (r0 <= 0) goto L12
            int r2 = java.lang.Math.min(r4, r0)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r1.sampleStrippedBytes
            r3.sampleData(r4, r2)
            goto L17
        L12:
            r0 = 0
            int r2 = r3.sampleData(r2, r4, r0)
        L17:
            return r2
    }

    private void writeToTarget(com.google.android.exoplayer2.extractor.ExtractorInput r3, byte[] r4, int r5, int r6) throws java.io.IOException {
            r2 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r2.sampleStrippedBytes
            int r0 = r0.bytesLeft()
            int r0 = java.lang.Math.min(r6, r0)
            int r1 = r5 + r0
            int r6 = r6 - r0
            r3.readFully(r4, r1, r6)
            if (r0 <= 0) goto L17
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r2.sampleStrippedBytes
            r3.readBytes(r4, r5, r0)
        L17:
            return
    }

    @androidx.annotation.CallSuper
    public final void binaryElement(int r21, int r22, com.google.android.exoplayer2.extractor.ExtractorInput r23) throws java.io.IOException {
            r20 = this;
            r7 = r20
            r0 = r21
            r1 = r22
            r8 = r23
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 163(0xa3, float:2.28E-43)
            r4 = 0
            r5 = 4
            r6 = 2
            r9 = 0
            r10 = 1
            if (r0 == r2) goto L100
            if (r0 == r3) goto L100
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto Lce
            r2 = 16877(0x41ed, float:2.365E-41)
            if (r0 == r2) goto La8
            r2 = 16981(0x4255, float:2.3795E-41)
            if (r0 == r2) goto L9a
            r2 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r2) goto L87
            r2 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r2) goto L63
            r2 = 25506(0x63a2, float:3.5742E-41)
            if (r0 == r2) goto L55
            r2 = 30322(0x7672, float:4.249E-41)
            if (r0 != r2) goto L3f
            r20.assertInTrackEntry(r21)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r0 = r7.currentTrack
            byte[] r2 = new byte[r1]
            r0.projectionData = r2
            r8.readFully(r2, r9, r1)
            goto L335
        L3f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected id: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r4)
            throw r0
        L55:
            r20.assertInTrackEntry(r21)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r0 = r7.currentTrack
            byte[] r2 = new byte[r1]
            r0.codecPrivate = r2
            r8.readFully(r2, r9, r1)
            goto L335
        L63:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.seekEntryIdBytes
            byte[] r0 = r0.getData()
            java.util.Arrays.fill(r0, r9)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.seekEntryIdBytes
            byte[] r0 = r0.getData()
            int r2 = 4 - r1
            r8.readFully(r0, r2, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.seekEntryIdBytes
            r0.setPosition(r9)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.seekEntryIdBytes
            long r0 = r0.readUnsignedInt()
            int r1 = (int) r0
            r7.seekEntryId = r1
            goto L335
        L87:
            byte[] r2 = new byte[r1]
            r8.readFully(r2, r9, r1)
            r20.assertInTrackEntry(r21)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r0 = r7.currentTrack
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r1 = new com.google.android.exoplayer2.extractor.TrackOutput$CryptoData
            r1.<init>(r10, r2, r9, r9)
            r0.cryptoData = r1
            goto L335
        L9a:
            r20.assertInTrackEntry(r21)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r0 = r7.currentTrack
            byte[] r2 = new byte[r1]
            r0.sampleStrippedBytes = r2
            r8.readFully(r2, r9, r1)
            goto L335
        La8:
            r20.assertInTrackEntry(r21)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r0 = r7.currentTrack
            int r2 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track.access$200(r0)
            r3 = 1685485123(0x64767643, float:1.8185683E22)
            if (r2 == r3) goto Lc5
            int r2 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track.access$200(r0)
            r3 = 1685480259(0x64766343, float:1.8180206E22)
            if (r2 != r3) goto Lc0
            goto Lc5
        Lc0:
            r8.skipFully(r1)
            goto L335
        Lc5:
            byte[] r2 = new byte[r1]
            r0.dolbyVisionConfigBytes = r2
            r8.readFully(r2, r9, r1)
            goto L335
        Lce:
            int r0 = r7.blockState
            if (r0 == r6) goto Ld3
            return
        Ld3:
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track> r0 = r7.tracks
            int r2 = r7.blockTrackNumber
            java.lang.Object r0 = r0.get(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r0 = (com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track) r0
            int r2 = r7.blockAdditionalId
            if (r2 != r5) goto Lfb
            java.lang.String r0 = r0.codecId
            java.lang.String r2 = "V_VP9"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lfb
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.supplementalData
            r0.reset(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.supplementalData
            byte[] r0 = r0.getData()
            r8.readFully(r0, r9, r1)
            goto L335
        Lfb:
            r8.skipFully(r1)
            goto L335
        L100:
            int r2 = r7.blockState
            r11 = 8
            if (r2 != 0) goto L125
            com.google.android.exoplayer2.extractor.mkv.VarintReader r2 = r7.varintReader
            long r12 = r2.readUnsignedVarint(r8, r9, r10, r11)
            int r2 = (int) r12
            r7.blockTrackNumber = r2
            com.google.android.exoplayer2.extractor.mkv.VarintReader r2 = r7.varintReader
            int r2 = r2.getLastLength()
            r7.blockTrackNumberLength = r2
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.blockDurationUs = r12
            r7.blockState = r10
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r7.scratch
            r2.reset(r9)
        L125:
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track> r2 = r7.tracks
            int r12 = r7.blockTrackNumber
            java.lang.Object r2 = r2.get(r12)
            r12 = r2
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r12 = (com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track) r12
            if (r12 != 0) goto L13c
            int r0 = r7.blockTrackNumberLength
            int r0 = r1 - r0
            r8.skipFully(r0)
            r7.blockState = r9
            return
        L13c:
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track.access$100(r12)
            int r2 = r7.blockState
            if (r2 != r10) goto L2ec
            r2 = 3
            r7.readScratch(r8, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r13 = r7.scratch
            byte[] r13 = r13.getData()
            r13 = r13[r6]
            r13 = r13 & 6
            int r13 = r13 >> r10
            r14 = 255(0xff, float:3.57E-43)
            if (r13 != 0) goto L16a
            r7.blockSampleCount = r10
            int[] r4 = r7.blockSampleSizes
            int[] r4 = ensureArrayCapacity(r4, r10)
            r7.blockSampleSizes = r4
            int r5 = r7.blockTrackNumberLength
            int r1 = r1 - r5
            int r1 = r1 - r2
            r4[r9] = r1
        L166:
            r19 = r12
            goto L28f
        L16a:
            r7.readScratch(r8, r5)
            com.google.android.exoplayer2.util.ParsableByteArray r15 = r7.scratch
            byte[] r15 = r15.getData()
            r15 = r15[r2]
            r15 = r15 & r14
            int r15 = r15 + r10
            r7.blockSampleCount = r15
            int[] r3 = r7.blockSampleSizes
            int[] r3 = ensureArrayCapacity(r3, r15)
            r7.blockSampleSizes = r3
            if (r13 != r6) goto L18e
            int r2 = r7.blockTrackNumberLength
            int r1 = r1 - r2
            int r1 = r1 - r5
            int r2 = r7.blockSampleCount
            int r1 = r1 / r2
            java.util.Arrays.fill(r3, r9, r2, r1)
            goto L166
        L18e:
            if (r13 != r10) goto L1c5
            r2 = 0
            r3 = 0
        L192:
            int r4 = r7.blockSampleCount
            int r13 = r4 + (-1)
            if (r2 >= r13) goto L1ba
            int[] r4 = r7.blockSampleSizes
            r4[r2] = r9
        L19c:
            int r5 = r5 + r10
            r7.readScratch(r8, r5)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r7.scratch
            byte[] r4 = r4.getData()
            int r13 = r5 + (-1)
            r4 = r4[r13]
            r4 = r4 & r14
            int[] r13 = r7.blockSampleSizes
            r15 = r13[r2]
            int r15 = r15 + r4
            r13[r2] = r15
            if (r4 == r14) goto L19c
            r4 = r13[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L192
        L1ba:
            int[] r2 = r7.blockSampleSizes
            int r4 = r4 - r10
            int r13 = r7.blockTrackNumberLength
            int r1 = r1 - r13
            int r1 = r1 - r5
            int r1 = r1 - r3
            r2[r4] = r1
            goto L166
        L1c5:
            if (r13 != r2) goto L2d6
            r2 = 0
            r3 = 0
        L1c9:
            int r13 = r7.blockSampleCount
            int r15 = r13 + (-1)
            if (r2 >= r15) goto L283
            int[] r13 = r7.blockSampleSizes
            r13[r2] = r9
            int r5 = r5 + 1
            r7.readScratch(r8, r5)
            com.google.android.exoplayer2.util.ParsableByteArray r13 = r7.scratch
            byte[] r13 = r13.getData()
            int r15 = r5 + (-1)
            r13 = r13[r15]
            if (r13 == 0) goto L27c
            r16 = 0
            r13 = 0
        L1e7:
            if (r13 >= r11) goto L247
            int r18 = 7 - r13
            int r6 = r10 << r18
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r7.scratch
            byte[] r9 = r9.getData()
            r9 = r9[r15]
            r9 = r9 & r6
            if (r9 == 0) goto L23c
            int r5 = r5 + r13
            r7.readScratch(r8, r5)
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r7.scratch
            byte[] r9 = r9.getData()
            int r16 = r15 + 1
            r9 = r9[r15]
            r9 = r9 & r14
            int r6 = ~r6
            r6 = r6 & r9
            long r14 = (long) r6
            r6 = r16
            r16 = r14
        L20e:
            if (r6 >= r5) goto L22c
            long r14 = r16 << r11
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r7.scratch
            byte[] r9 = r9.getData()
            int r16 = r6 + 1
            r6 = r9[r6]
            r9 = 255(0xff, float:3.57E-43)
            r6 = r6 & r9
            r19 = r12
            long r11 = (long) r6
            long r11 = r11 | r14
            r6 = r16
            r16 = r11
            r12 = r19
            r11 = 8
            goto L20e
        L22c:
            r19 = r12
            if (r2 <= 0) goto L249
            int r13 = r13 * 7
            int r13 = r13 + 6
            r11 = 1
            long r13 = r11 << r13
            long r13 = r13 - r11
            long r16 = r16 - r13
            goto L249
        L23c:
            r19 = r12
            int r13 = r13 + 1
            r6 = 2
            r9 = 0
            r11 = 8
            r14 = 255(0xff, float:3.57E-43)
            goto L1e7
        L247:
            r19 = r12
        L249:
            r11 = r16
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 < 0) goto L275
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 > 0) goto L275
            int r6 = (int) r11
            int[] r11 = r7.blockSampleSizes
            if (r2 != 0) goto L25f
            goto L264
        L25f:
            int r12 = r2 + (-1)
            r12 = r11[r12]
            int r6 = r6 + r12
        L264:
            r11[r2] = r6
            r6 = r11[r2]
            int r3 = r3 + r6
            int r2 = r2 + 1
            r12 = r19
            r6 = 2
            r9 = 0
            r11 = 8
            r14 = 255(0xff, float:3.57E-43)
            goto L1c9
        L275:
            java.lang.String r0 = "EBML lacing sample size out of range."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r4)
            throw r0
        L27c:
            java.lang.String r0 = "No valid varint length mask found"
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r4)
            throw r0
        L283:
            r19 = r12
            int[] r2 = r7.blockSampleSizes
            int r13 = r13 - r10
            int r4 = r7.blockTrackNumberLength
            int r1 = r1 - r4
            int r1 = r1 - r5
            int r1 = r1 - r3
            r2[r13] = r1
        L28f:
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r7.scratch
            byte[] r1 = r1.getData()
            r2 = 0
            r1 = r1[r2]
            r2 = 8
            int r1 = r1 << r2
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r7.scratch
            byte[] r2 = r2.getData()
            r2 = r2[r10]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            r1 = r1 | r2
            long r2 = r7.clusterTimecodeUs
            long r4 = (long) r1
            long r4 = r7.scaleTimecodeToUs(r4)
            long r2 = r2 + r4
            r7.blockTimeUs = r2
            r9 = r19
            int r1 = r9.type
            r2 = 2
            if (r1 == r2) goto L2cc
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L2ca
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r7.scratch
            byte[] r1 = r1.getData()
            r1 = r1[r2]
            r2 = 128(0x80, float:1.8E-43)
            r1 = r1 & r2
            if (r1 != r2) goto L2ca
            goto L2cc
        L2ca:
            r1 = 0
            goto L2cd
        L2cc:
            r1 = 1
        L2cd:
            r7.blockFlags = r1
            r1 = 2
            r7.blockState = r1
            r1 = 0
            r7.blockSampleIndex = r1
            goto L2ed
        L2d6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected lacing value: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r4)
            throw r0
        L2ec:
            r9 = r12
        L2ed:
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L31f
        L2f1:
            int r0 = r7.blockSampleIndex
            int r1 = r7.blockSampleCount
            if (r0 >= r1) goto L31b
            int[] r1 = r7.blockSampleSizes
            r0 = r1[r0]
            r1 = 0
            int r5 = r7.writeSampleData(r8, r9, r0, r1)
            long r0 = r7.blockTimeUs
            int r2 = r7.blockSampleIndex
            int r3 = r9.defaultSampleDurationNs
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r7.blockFlags
            r6 = 0
            r0 = r20
            r1 = r9
            r0.commitSampleToOutput(r1, r2, r4, r5, r6)
            int r0 = r7.blockSampleIndex
            int r0 = r0 + r10
            r7.blockSampleIndex = r0
            goto L2f1
        L31b:
            r0 = 0
            r7.blockState = r0
            goto L335
        L31f:
            int r0 = r7.blockSampleIndex
            int r1 = r7.blockSampleCount
            if (r0 >= r1) goto L335
            int[] r1 = r7.blockSampleSizes
            r2 = r1[r0]
            int r2 = r7.writeSampleData(r8, r9, r2, r10)
            r1[r0] = r2
            int r0 = r7.blockSampleIndex
            int r0 = r0 + r10
            r7.blockSampleIndex = r0
            goto L31f
        L335:
            return
    }

    @androidx.annotation.CallSuper
    public final void endMasterElement(int r11) throws com.google.android.exoplayer2.ParserException {
            r10 = this;
            r10.assertInitialized()
            r0 = 160(0xa0, float:2.24E-43)
            r1 = 0
            if (r11 == r0) goto L100
            r0 = 174(0xae, float:2.44E-43)
            r2 = 0
            if (r11 == r0) goto Ld5
            r0 = 19899(0x4dbb, float:2.7884E-41)
            r3 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r11 == r0) goto Lbb
            r0 = 25152(0x6240, float:3.5245E-41)
            r4 = 1
            if (r11 == r0) goto L8e
            r0 = 28032(0x6d80, float:3.9281E-41)
            if (r11 == r0) goto L78
            r0 = 357149030(0x1549a966, float:4.072526E-26)
            if (r11 == r0) goto L5a
            r0 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r11 == r0) goto L44
            if (r11 == r3) goto L2b
            goto L17b
        L2b:
            boolean r11 = r10.sentSeekMap
            if (r11 != 0) goto L3e
            com.google.android.exoplayer2.extractor.ExtractorOutput r11 = r10.extractorOutput
            com.google.android.exoplayer2.util.LongArray r0 = r10.cueTimesUs
            com.google.android.exoplayer2.util.LongArray r1 = r10.cueClusterPositions
            com.google.android.exoplayer2.extractor.SeekMap r0 = r10.buildSeekMap(r0, r1)
            r11.seekMap(r0)
            r10.sentSeekMap = r4
        L3e:
            r10.cueTimesUs = r2
            r10.cueClusterPositions = r2
            goto L17b
        L44:
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track> r11 = r10.tracks
            int r11 = r11.size()
            if (r11 == 0) goto L53
            com.google.android.exoplayer2.extractor.ExtractorOutput r11 = r10.extractorOutput
            r11.endTracks()
            goto L17b
        L53:
            java.lang.String r11 = "No valid tracks were found"
            com.google.android.exoplayer2.ParserException r11 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r11, r2)
            throw r11
        L5a:
            long r0 = r10.timecodeScale
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 != 0) goto L6a
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r10.timecodeScale = r0
        L6a:
            long r0 = r10.durationTimecode
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 == 0) goto L17b
            long r0 = r10.scaleTimecodeToUs(r0)
            r10.durationUs = r0
            goto L17b
        L78:
            r10.assertInTrackEntry(r11)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r11 = r10.currentTrack
            boolean r0 = r11.hasContentEncryption
            if (r0 == 0) goto L17b
            byte[] r11 = r11.sampleStrippedBytes
            if (r11 != 0) goto L87
            goto L17b
        L87:
            java.lang.String r11 = "Combining encryption and compression is not supported"
            com.google.android.exoplayer2.ParserException r11 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r11, r2)
            throw r11
        L8e:
            r10.assertInTrackEntry(r11)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r11 = r10.currentTrack
            boolean r0 = r11.hasContentEncryption
            if (r0 == 0) goto L17b
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r0 = r11.cryptoData
            if (r0 == 0) goto Lb4
            com.google.android.exoplayer2.drm.DrmInitData r2 = new com.google.android.exoplayer2.drm.DrmInitData
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r3 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r4]
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r4 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            java.util.UUID r5 = com.google.android.exoplayer2.C.UUID_NIL
            byte[] r0 = r0.encryptionKey
            java.lang.String r6 = "video/webm"
            r4.<init>(r5, r6, r0)
            r3[r1] = r4
            r2.<init>(r3)
            r11.drmInitData = r2
            goto L17b
        Lb4:
            java.lang.String r11 = "Encrypted Track found but ContentEncKeyID was not found"
            com.google.android.exoplayer2.ParserException r11 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r11, r2)
            throw r11
        Lbb:
            int r11 = r10.seekEntryId
            r0 = -1
            if (r11 == r0) goto Lce
            long r0 = r10.seekEntryPosition
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto Lce
            if (r11 != r3) goto L17b
            r10.cuesContentPosition = r0
            goto L17b
        Lce:
            java.lang.String r11 = "Mandatory element SeekID or SeekPosition not found"
            com.google.android.exoplayer2.ParserException r11 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r11, r2)
            throw r11
        Ld5:
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r11 = r10.currentTrack
            java.lang.Object r11 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r11)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r11 = (com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track) r11
            java.lang.String r0 = r11.codecId
            if (r0 == 0) goto Lf9
            boolean r0 = isCodecSupported(r0)
            if (r0 == 0) goto Lf5
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r10.extractorOutput
            int r1 = r11.number
            r11.initializeOutput(r0, r1)
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track> r0 = r10.tracks
            int r1 = r11.number
            r0.put(r1, r11)
        Lf5:
            r10.currentTrack = r2
            goto L17b
        Lf9:
            java.lang.String r11 = "CodecId is missing in TrackEntry element"
            com.google.android.exoplayer2.ParserException r11 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r11, r2)
            throw r11
        L100:
            int r11 = r10.blockState
            r0 = 2
            if (r11 == r0) goto L106
            return
        L106:
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track> r11 = r10.tracks
            int r0 = r10.blockTrackNumber
            java.lang.Object r11 = r11.get(r0)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r11 = (com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track) r11
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track.access$100(r11)
            long r2 = r10.blockGroupDiscardPaddingNs
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L140
            java.lang.String r0 = r11.codecId
            java.lang.String r2 = "A_OPUS"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L140
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r10.supplementalData
            r2 = 8
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r3 = r10.blockGroupDiscardPaddingNs
            java.nio.ByteBuffer r2 = r2.putLong(r3)
            byte[] r2 = r2.array()
            r0.reset(r2)
        L140:
            r0 = 0
            r2 = 0
        L142:
            int r3 = r10.blockSampleCount
            if (r0 >= r3) goto L14e
            int[] r3 = r10.blockSampleSizes
            r3 = r3[r0]
            int r2 = r2 + r3
            int r0 = r0 + 1
            goto L142
        L14e:
            r0 = 0
        L14f:
            int r3 = r10.blockSampleCount
            if (r0 >= r3) goto L179
            long r3 = r10.blockTimeUs
            int r5 = r11.defaultSampleDurationNs
            int r5 = r5 * r0
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r4 = r3 + r5
            int r3 = r10.blockFlags
            if (r0 != 0) goto L168
            boolean r6 = r10.blockHasReferenceBlock
            if (r6 != 0) goto L168
            r3 = r3 | 1
        L168:
            r6 = r3
            int[] r3 = r10.blockSampleSizes
            r7 = r3[r0]
            int r9 = r2 - r7
            r2 = r10
            r3 = r11
            r8 = r9
            r2.commitSampleToOutput(r3, r4, r6, r7, r8)
            int r0 = r0 + 1
            r2 = r9
            goto L14f
        L179:
            r10.blockState = r1
        L17b:
            return
    }

    @androidx.annotation.CallSuper
    public final void floatElement(int r2, double r3) throws com.google.android.exoplayer2.ParserException {
            r1 = this;
            r0 = 181(0xb5, float:2.54E-43)
            if (r2 == r0) goto L8b
            r0 = 17545(0x4489, float:2.4586E-41)
            if (r2 == r0) goto L87
            switch(r2) {
                case 21969: goto L7e;
                case 21970: goto L75;
                case 21971: goto L6c;
                case 21972: goto L63;
                case 21973: goto L5a;
                case 21974: goto L51;
                case 21975: goto L48;
                case 21976: goto L3f;
                case 21977: goto L36;
                case 21978: goto L2d;
                default: goto Lb;
            }
        Lb:
            switch(r2) {
                case 30323: goto L24;
                case 30324: goto L1a;
                case 30325: goto L10;
                default: goto Le;
            }
        Le:
            goto L93
        L10:
            r1.assertInTrackEntry(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r1.currentTrack
            float r3 = (float) r3
            r2.projectionPoseRoll = r3
            goto L93
        L1a:
            r1.assertInTrackEntry(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r1.currentTrack
            float r3 = (float) r3
            r2.projectionPosePitch = r3
            goto L93
        L24:
            r1.assertInTrackEntry(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r1.currentTrack
            float r3 = (float) r3
            r2.projectionPoseYaw = r3
            goto L93
        L2d:
            r1.assertInTrackEntry(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r1.currentTrack
            float r3 = (float) r3
            r2.minMasteringLuminance = r3
            goto L93
        L36:
            r1.assertInTrackEntry(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r1.currentTrack
            float r3 = (float) r3
            r2.maxMasteringLuminance = r3
            goto L93
        L3f:
            r1.assertInTrackEntry(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r1.currentTrack
            float r3 = (float) r3
            r2.whitePointChromaticityY = r3
            goto L93
        L48:
            r1.assertInTrackEntry(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r1.currentTrack
            float r3 = (float) r3
            r2.whitePointChromaticityX = r3
            goto L93
        L51:
            r1.assertInTrackEntry(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r1.currentTrack
            float r3 = (float) r3
            r2.primaryBChromaticityY = r3
            goto L93
        L5a:
            r1.assertInTrackEntry(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r1.currentTrack
            float r3 = (float) r3
            r2.primaryBChromaticityX = r3
            goto L93
        L63:
            r1.assertInTrackEntry(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r1.currentTrack
            float r3 = (float) r3
            r2.primaryGChromaticityY = r3
            goto L93
        L6c:
            r1.assertInTrackEntry(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r1.currentTrack
            float r3 = (float) r3
            r2.primaryGChromaticityX = r3
            goto L93
        L75:
            r1.assertInTrackEntry(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r1.currentTrack
            float r3 = (float) r3
            r2.primaryRChromaticityY = r3
            goto L93
        L7e:
            r1.assertInTrackEntry(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r1.currentTrack
            float r3 = (float) r3
            r2.primaryRChromaticityX = r3
            goto L93
        L87:
            long r2 = (long) r3
            r1.durationTimecode = r2
            goto L93
        L8b:
            r1.assertInTrackEntry(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r1.currentTrack
            int r3 = (int) r3
            r2.sampleRate = r3
        L93:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void init(com.google.android.exoplayer2.extractor.ExtractorOutput r1) {
            r0 = this;
            r0.extractorOutput = r1
            return
    }

    @androidx.annotation.CallSuper
    public final void integerElement(int r9, long r10) throws com.google.android.exoplayer2.ParserException {
            r8 = this;
            r0 = 20529(0x5031, float:2.8767E-41)
            r1 = 0
            java.lang.String r2 = " not supported"
            if (r9 == r0) goto L25e
            r0 = 20530(0x5032, float:2.8769E-41)
            r3 = 1
            if (r9 == r0) goto L240
            r0 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r9) {
                case 131: goto L237;
                case 136: goto L22a;
                case 155: goto L223;
                case 159: goto L21a;
                case 176: goto L211;
                case 179: goto L204;
                case 186: goto L1fb;
                case 215: goto L1f2;
                case 231: goto L1ea;
                case 238: goto L1e5;
                case 241: goto L1d5;
                case 251: goto L1d1;
                case 16871: goto L1c6;
                case 16980: goto L1a5;
                case 17029: goto L180;
                case 17143: goto L161;
                case 18401: goto L140;
                case 18408: goto L121;
                case 21420: goto L11a;
                case 21432: goto Lf2;
                case 21680: goto Le8;
                case 21682: goto Lde;
                case 21690: goto Ld4;
                case 21930: goto Lc6;
                case 21998: goto Lbc;
                case 22186: goto Lb3;
                case 22203: goto Laa;
                case 25188: goto La0;
                case 30114: goto L9c;
                case 30321: goto L76;
                case 2352003: goto L6c;
                case 2807729: goto L68;
                default: goto L14;
            }
        L14:
            r0 = -1
            switch(r9) {
                case 21945: goto L52;
                case 21946: goto L42;
                case 21947: goto L2e;
                case 21948: goto L24;
                case 21949: goto L1a;
                default: goto L18;
            }
        L18:
            goto L264
        L1a:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            int r11 = (int) r10
            r9.maxFrameAverageLuminance = r11
            goto L264
        L24:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            int r11 = (int) r10
            r9.maxContentLuminance = r11
            goto L264
        L2e:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            r9.hasColorInfo = r7
            int r9 = (int) r10
            int r9 = com.google.android.exoplayer2.video.ColorInfo.isoColorPrimariesToColorSpace(r9)
            if (r9 == r0) goto L264
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r10 = r8.currentTrack
            r10.colorSpace = r9
            goto L264
        L42:
            r8.assertInTrackEntry(r9)
            int r9 = (int) r10
            int r9 = com.google.android.exoplayer2.video.ColorInfo.isoTransferCharacteristicsToColorTransfer(r9)
            if (r9 == r0) goto L264
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r10 = r8.currentTrack
            r10.colorTransfer = r9
            goto L264
        L52:
            r8.assertInTrackEntry(r9)
            int r9 = (int) r10
            if (r9 == r7) goto L62
            if (r9 == r6) goto L5c
            goto L264
        L5c:
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            r9.colorRange = r7
            goto L264
        L62:
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            r9.colorRange = r6
            goto L264
        L68:
            r8.timecodeScale = r10
            goto L264
        L6c:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            int r11 = (int) r10
            r9.defaultSampleDurationNs = r11
            goto L264
        L76:
            r8.assertInTrackEntry(r9)
            int r9 = (int) r10
            if (r9 == 0) goto L96
            if (r9 == r7) goto L90
            if (r9 == r6) goto L8a
            if (r9 == r5) goto L84
            goto L264
        L84:
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            r9.projectionType = r5
            goto L264
        L8a:
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            r9.projectionType = r6
            goto L264
        L90:
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            r9.projectionType = r7
            goto L264
        L96:
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            r9.projectionType = r0
            goto L264
        L9c:
            r8.blockGroupDiscardPaddingNs = r10
            goto L264
        La0:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            int r11 = (int) r10
            r9.audioBitDepth = r11
            goto L264
        Laa:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            r9.seekPreRollNs = r10
            goto L264
        Lb3:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            r9.codecDelayNs = r10
            goto L264
        Lbc:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            int r11 = (int) r10
            r9.maxBlockAdditionId = r11
            goto L264
        Lc6:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto Ld0
            r0 = 1
        Ld0:
            r9.flagForced = r0
            goto L264
        Ld4:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            int r11 = (int) r10
            r9.displayHeight = r11
            goto L264
        Lde:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            int r11 = (int) r10
            r9.displayUnit = r11
            goto L264
        Le8:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            int r11 = (int) r10
            r9.displayWidth = r11
            goto L264
        Lf2:
            int r11 = (int) r10
            r8.assertInTrackEntry(r9)
            if (r11 == 0) goto L114
            if (r11 == r7) goto L10e
            if (r11 == r5) goto L108
            r9 = 15
            if (r11 == r9) goto L102
            goto L264
        L102:
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            r9.stereoMode = r5
            goto L264
        L108:
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            r9.stereoMode = r7
            goto L264
        L10e:
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            r9.stereoMode = r6
            goto L264
        L114:
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            r9.stereoMode = r0
            goto L264
        L11a:
            long r0 = r8.segmentContentPosition
            long r10 = r10 + r0
            r8.seekEntryPosition = r10
            goto L264
        L121:
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 != 0) goto L127
            goto L264
        L127:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "AESSettingsCipherMode "
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.google.android.exoplayer2.ParserException r9 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r9, r1)
            throw r9
        L140:
            r3 = 5
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 != 0) goto L148
            goto L264
        L148:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "ContentEncAlgo "
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.google.android.exoplayer2.ParserException r9 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r9, r1)
            throw r9
        L161:
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 != 0) goto L167
            goto L264
        L167:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "EBMLReadVersion "
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.google.android.exoplayer2.ParserException r9 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r9, r1)
            throw r9
        L180:
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 < 0) goto L18c
            r3 = 2
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 > 0) goto L18c
            goto L264
        L18c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "DocTypeReadVersion "
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.google.android.exoplayer2.ParserException r9 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r9, r1)
            throw r9
        L1a5:
            r3 = 3
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 != 0) goto L1ad
            goto L264
        L1ad:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "ContentCompAlgo "
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.google.android.exoplayer2.ParserException r9 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r9, r1)
            throw r9
        L1c6:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            int r11 = (int) r10
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track.access$202(r9, r11)
            goto L264
        L1d1:
            r8.blockHasReferenceBlock = r7
            goto L264
        L1d5:
            boolean r0 = r8.seenClusterPositionForCurrentCuePoint
            if (r0 != 0) goto L264
            r8.assertInCues(r9)
            com.google.android.exoplayer2.util.LongArray r9 = r8.cueClusterPositions
            r9.add(r10)
            r8.seenClusterPositionForCurrentCuePoint = r7
            goto L264
        L1e5:
            int r9 = (int) r10
            r8.blockAdditionalId = r9
            goto L264
        L1ea:
            long r9 = r8.scaleTimecodeToUs(r10)
            r8.clusterTimecodeUs = r9
            goto L264
        L1f2:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            int r11 = (int) r10
            r9.number = r11
            goto L264
        L1fb:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            int r11 = (int) r10
            r9.height = r11
            goto L264
        L204:
            r8.assertInCues(r9)
            com.google.android.exoplayer2.util.LongArray r9 = r8.cueTimesUs
            long r10 = r8.scaleTimecodeToUs(r10)
            r9.add(r10)
            goto L264
        L211:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            int r11 = (int) r10
            r9.width = r11
            goto L264
        L21a:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            int r11 = (int) r10
            r9.channelCount = r11
            goto L264
        L223:
            long r9 = r8.scaleTimecodeToUs(r10)
            r8.blockDurationUs = r9
            goto L264
        L22a:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto L234
            r0 = 1
        L234:
            r9.flagDefault = r0
            goto L264
        L237:
            r8.assertInTrackEntry(r9)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = r8.currentTrack
            int r11 = (int) r10
            r9.type = r11
            goto L264
        L240:
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 != 0) goto L245
            goto L264
        L245:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "ContentEncodingScope "
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.google.android.exoplayer2.ParserException r9 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r9, r1)
            throw r9
        L25e:
            r3 = 0
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r9 != 0) goto L265
        L264:
            return
        L265:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "ContentEncodingOrder "
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.google.android.exoplayer2.ParserException r9 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r9, r1)
            throw r9
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int read(com.google.android.exoplayer2.extractor.ExtractorInput r6, com.google.android.exoplayer2.extractor.PositionHolder r7) throws java.io.IOException {
            r5 = this;
            r0 = 0
            r5.haveOutputSample = r0
            r1 = 1
            r2 = 1
        L5:
            if (r2 == 0) goto L1e
            boolean r3 = r5.haveOutputSample
            if (r3 != 0) goto L1e
            com.google.android.exoplayer2.extractor.mkv.EbmlReader r2 = r5.reader
            boolean r2 = r2.read(r6)
            if (r2 == 0) goto L5
            long r3 = r6.getPosition()
            boolean r3 = r5.maybeSeekForCues(r7, r3)
            if (r3 == 0) goto L5
            return r1
        L1e:
            if (r2 != 0) goto L3b
        L20:
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track> r6 = r5.tracks
            int r6 = r6.size()
            if (r0 >= r6) goto L39
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track> r6 = r5.tracks
            java.lang.Object r6 = r6.valueAt(r0)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r6 = (com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track) r6
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track.access$100(r6)
            r6.outputPendingSampleMetadata()
            int r0 = r0 + 1
            goto L20
        L39:
            r6 = -1
            return r6
        L3b:
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    @androidx.annotation.CallSuper
    public void seek(long r1, long r3) {
            r0 = this;
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.clusterTimecodeUs = r1
            r1 = 0
            r0.blockState = r1
            com.google.android.exoplayer2.extractor.mkv.EbmlReader r2 = r0.reader
            r2.reset()
            com.google.android.exoplayer2.extractor.mkv.VarintReader r2 = r0.varintReader
            r2.reset()
            r0.resetWriteSampleData()
        L17:
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track> r2 = r0.tracks
            int r2 = r2.size()
            if (r1 >= r2) goto L2d
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track> r2 = r0.tracks
            java.lang.Object r2 = r2.valueAt(r1)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = (com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track) r2
            r2.reset()
            int r1 = r1 + 1
            goto L17
        L2d:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r2) throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.extractor.mkv.Sniffer r0 = new com.google.android.exoplayer2.extractor.mkv.Sniffer
            r0.<init>()
            boolean r2 = r0.sniff(r2)
            return r2
    }

    @androidx.annotation.CallSuper
    public final void startMasterElement(int r6, long r7, long r9) throws com.google.android.exoplayer2.ParserException {
            r5 = this;
            r5.assertInitialized()
            r0 = 160(0xa0, float:2.24E-43)
            r1 = 0
            if (r6 == r0) goto L98
            r0 = 174(0xae, float:2.44E-43)
            if (r6 == r0) goto L90
            r0 = 187(0xbb, float:2.62E-43)
            if (r6 == r0) goto L8d
            r0 = 19899(0x4dbb, float:2.7884E-41)
            r1 = -1
            if (r6 == r0) goto L87
            r0 = 20533(0x5035, float:2.8773E-41)
            r3 = 1
            if (r6 == r0) goto L7f
            r0 = 21968(0x55d0, float:3.0784E-41)
            if (r6 == r0) goto L77
            r0 = 408125543(0x18538067, float:2.7335937E-24)
            if (r6 == r0) goto L5f
            r7 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r6 == r7) goto L50
            r7 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r6 == r7) goto L30
            goto L9e
        L30:
            boolean r6 = r5.sentSeekMap
            if (r6 != 0) goto L9e
            boolean r6 = r5.seekForCuesEnabled
            if (r6 == 0) goto L41
            long r6 = r5.cuesContentPosition
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 == 0) goto L41
            r5.seekForCues = r3
            goto L9e
        L41:
            com.google.android.exoplayer2.extractor.ExtractorOutput r6 = r5.extractorOutput
            com.google.android.exoplayer2.extractor.SeekMap$Unseekable r7 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
            long r8 = r5.durationUs
            r7.<init>(r8)
            r6.seekMap(r7)
            r5.sentSeekMap = r3
            goto L9e
        L50:
            com.google.android.exoplayer2.util.LongArray r6 = new com.google.android.exoplayer2.util.LongArray
            r6.<init>()
            r5.cueTimesUs = r6
            com.google.android.exoplayer2.util.LongArray r6 = new com.google.android.exoplayer2.util.LongArray
            r6.<init>()
            r5.cueClusterPositions = r6
            goto L9e
        L5f:
            long r3 = r5.segmentContentPosition
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 == 0) goto L72
            int r6 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r6 != 0) goto L6a
            goto L72
        L6a:
            r6 = 0
            java.lang.String r7 = "Multiple Segment elements not supported"
            com.google.android.exoplayer2.ParserException r6 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r7, r6)
            throw r6
        L72:
            r5.segmentContentPosition = r7
            r5.segmentContentSize = r9
            goto L9e
        L77:
            r5.assertInTrackEntry(r6)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r6 = r5.currentTrack
            r6.hasColorInfo = r3
            goto L9e
        L7f:
            r5.assertInTrackEntry(r6)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r6 = r5.currentTrack
            r6.hasContentEncryption = r3
            goto L9e
        L87:
            r6 = -1
            r5.seekEntryId = r6
            r5.seekEntryPosition = r1
            goto L9e
        L8d:
            r5.seenClusterPositionForCurrentCuePoint = r1
            goto L9e
        L90:
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r6 = new com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track
            r6.<init>()
            r5.currentTrack = r6
            goto L9e
        L98:
            r5.blockHasReferenceBlock = r1
            r6 = 0
            r5.blockGroupDiscardPaddingNs = r6
        L9e:
            return
    }

    @androidx.annotation.CallSuper
    public final void stringElement(int r2, java.lang.String r3) throws com.google.android.exoplayer2.ParserException {
            r1 = this;
            r0 = 134(0x86, float:1.88E-43)
            if (r2 == r0) goto L51
            r0 = 17026(0x4282, float:2.3859E-41)
            if (r2 == r0) goto L23
            r0 = 21358(0x536e, float:2.9929E-41)
            if (r2 == r0) goto L1b
            r0 = 2274716(0x22b59c, float:3.187556E-39)
            if (r2 == r0) goto L12
            goto L58
        L12:
            r1.assertInTrackEntry(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r1.currentTrack
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track.access$302(r2, r3)
            goto L58
        L1b:
            r1.assertInTrackEntry(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r1.currentTrack
            r2.name = r3
            goto L58
        L23:
            java.lang.String r2 = "webm"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L58
            java.lang.String r2 = "matroska"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L35
            goto L58
        L35:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "DocType "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = " not supported"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            com.google.android.exoplayer2.ParserException r2 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r2, r3)
            throw r2
        L51:
            r1.assertInTrackEntry(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r1.currentTrack
            r2.codecId = r3
        L58:
            return
    }
}
