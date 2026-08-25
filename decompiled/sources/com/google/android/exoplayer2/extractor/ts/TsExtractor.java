package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes2.dex */
public final class TsExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    private static final long AC3_FORMAT_IDENTIFIER = 1094921523;
    private static final long AC4_FORMAT_IDENTIFIER = 1094921524;
    private static final int BUFFER_SIZE = 9400;
    public static final int DEFAULT_TIMESTAMP_SEARCH_BYTES = 112800;
    private static final long E_AC3_FORMAT_IDENTIFIER = 1161904947;
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory FACTORY = null;
    private static final long HEVC_FORMAT_IDENTIFIER = 1212503619;
    private static final int MAX_PID_PLUS_ONE = 8192;
    public static final int MODE_HLS = 2;
    public static final int MODE_MULTI_PMT = 0;
    public static final int MODE_SINGLE_PMT = 1;
    private static final int SNIFF_TS_PACKET_COUNT = 5;
    public static final int TS_PACKET_SIZE = 188;
    private static final int TS_PAT_PID = 0;
    public static final int TS_STREAM_TYPE_AAC_ADTS = 15;
    public static final int TS_STREAM_TYPE_AAC_LATM = 17;
    public static final int TS_STREAM_TYPE_AC3 = 129;
    public static final int TS_STREAM_TYPE_AC4 = 172;
    public static final int TS_STREAM_TYPE_AIT = 257;
    public static final int TS_STREAM_TYPE_DC2_H262 = 128;
    public static final int TS_STREAM_TYPE_DTS = 138;
    public static final int TS_STREAM_TYPE_DVBSUBS = 89;
    public static final int TS_STREAM_TYPE_E_AC3 = 135;
    public static final int TS_STREAM_TYPE_H262 = 2;
    public static final int TS_STREAM_TYPE_H263 = 16;
    public static final int TS_STREAM_TYPE_H264 = 27;
    public static final int TS_STREAM_TYPE_H265 = 36;
    public static final int TS_STREAM_TYPE_HDMV_DTS = 130;
    public static final int TS_STREAM_TYPE_ID3 = 21;
    public static final int TS_STREAM_TYPE_MPA = 3;
    public static final int TS_STREAM_TYPE_MPA_LSF = 4;
    public static final int TS_STREAM_TYPE_SPLICE_INFO = 134;
    public static final int TS_SYNC_BYTE = 71;
    private int bytesSinceLastSync;
    private final android.util.SparseIntArray continuityCounters;
    private final com.google.android.exoplayer2.extractor.ts.TsDurationReader durationReader;
    private boolean hasOutputSeekMap;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.ts.TsPayloadReader id3Reader;
    private final int mode;
    private com.google.android.exoplayer2.extractor.ExtractorOutput output;
    private final com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory payloadReaderFactory;
    private int pcrPid;
    private boolean pendingSeekToStart;
    private int remainingPmts;
    private final java.util.List<com.google.android.exoplayer2.util.TimestampAdjuster> timestampAdjusters;
    private final int timestampSearchBytes;
    private final android.util.SparseBooleanArray trackIds;
    private final android.util.SparseBooleanArray trackPids;
    private boolean tracksEnded;
    private com.google.android.exoplayer2.extractor.ts.TsBinarySearchSeeker tsBinarySearchSeeker;
    private final com.google.android.exoplayer2.util.ParsableByteArray tsPacketBuffer;
    private final android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.TsPayloadReader> tsPayloadReaders;

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public class PatReader implements com.google.android.exoplayer2.extractor.ts.SectionPayloadReader {
        private final com.google.android.exoplayer2.util.ParsableBitArray patScratch;
        public final /* synthetic */ com.google.android.exoplayer2.extractor.ts.TsExtractor this$0;

        public PatReader(com.google.android.exoplayer2.extractor.ts.TsExtractor r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                com.google.android.exoplayer2.util.ParsableBitArray r2 = new com.google.android.exoplayer2.util.ParsableBitArray
                r0 = 4
                byte[] r0 = new byte[r0]
                r2.<init>(r0)
                r1.patScratch = r2
                return
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void consume(com.google.android.exoplayer2.util.ParsableByteArray r10) {
                r9 = this;
                int r0 = r10.readUnsignedByte()
                if (r0 == 0) goto L7
                return
            L7:
                int r0 = r10.readUnsignedByte()
                r0 = r0 & 128(0x80, float:1.8E-43)
                if (r0 != 0) goto L10
                return
            L10:
                r0 = 6
                r10.skipBytes(r0)
                int r0 = r10.bytesLeft()
                r1 = 4
                int r0 = r0 / r1
                r2 = 0
                r3 = 0
            L1c:
                if (r3 >= r0) goto L6a
                com.google.android.exoplayer2.util.ParsableBitArray r4 = r9.patScratch
                r10.readBytes(r4, r1)
                com.google.android.exoplayer2.util.ParsableBitArray r4 = r9.patScratch
                r5 = 16
                int r4 = r4.readBits(r5)
                com.google.android.exoplayer2.util.ParsableBitArray r5 = r9.patScratch
                r6 = 3
                r5.skipBits(r6)
                r5 = 13
                if (r4 != 0) goto L3b
                com.google.android.exoplayer2.util.ParsableBitArray r4 = r9.patScratch
                r4.skipBits(r5)
                goto L67
            L3b:
                com.google.android.exoplayer2.util.ParsableBitArray r4 = r9.patScratch
                int r4 = r4.readBits(r5)
                com.google.android.exoplayer2.extractor.ts.TsExtractor r5 = r9.this$0
                android.util.SparseArray r5 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$000(r5)
                java.lang.Object r5 = r5.get(r4)
                if (r5 != 0) goto L67
                com.google.android.exoplayer2.extractor.ts.TsExtractor r5 = r9.this$0
                android.util.SparseArray r5 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$000(r5)
                com.google.android.exoplayer2.extractor.ts.SectionReader r6 = new com.google.android.exoplayer2.extractor.ts.SectionReader
                com.google.android.exoplayer2.extractor.ts.TsExtractor$PmtReader r7 = new com.google.android.exoplayer2.extractor.ts.TsExtractor$PmtReader
                com.google.android.exoplayer2.extractor.ts.TsExtractor r8 = r9.this$0
                r7.<init>(r8, r4)
                r6.<init>(r7)
                r5.put(r4, r6)
                com.google.android.exoplayer2.extractor.ts.TsExtractor r4 = r9.this$0
                com.google.android.exoplayer2.extractor.ts.TsExtractor.access$108(r4)
            L67:
                int r3 = r3 + 1
                goto L1c
            L6a:
                com.google.android.exoplayer2.extractor.ts.TsExtractor r10 = r9.this$0
                int r10 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$200(r10)
                r0 = 2
                if (r10 == r0) goto L7c
                com.google.android.exoplayer2.extractor.ts.TsExtractor r10 = r9.this$0
                android.util.SparseArray r10 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$000(r10)
                r10.remove(r2)
            L7c:
                return
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void init(com.google.android.exoplayer2.util.TimestampAdjuster r1, com.google.android.exoplayer2.extractor.ExtractorOutput r2, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator r3) {
                r0 = this;
                return
        }
    }

    public class PmtReader implements com.google.android.exoplayer2.extractor.ts.SectionPayloadReader {
        private static final int TS_PMT_DESC_AC3 = 106;
        private static final int TS_PMT_DESC_AIT = 111;
        private static final int TS_PMT_DESC_DTS = 123;
        private static final int TS_PMT_DESC_DVBSUBS = 89;
        private static final int TS_PMT_DESC_DVB_EXT = 127;
        private static final int TS_PMT_DESC_DVB_EXT_AC4 = 21;
        private static final int TS_PMT_DESC_EAC3 = 122;
        private static final int TS_PMT_DESC_ISO639_LANG = 10;
        private static final int TS_PMT_DESC_REGISTRATION = 5;
        private final int pid;
        private final com.google.android.exoplayer2.util.ParsableBitArray pmtScratch;
        public final /* synthetic */ com.google.android.exoplayer2.extractor.ts.TsExtractor this$0;
        private final android.util.SparseIntArray trackIdToPidScratch;
        private final android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.TsPayloadReader> trackIdToReaderScratch;

        public PmtReader(com.google.android.exoplayer2.extractor.ts.TsExtractor r2, int r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                com.google.android.exoplayer2.util.ParsableBitArray r2 = new com.google.android.exoplayer2.util.ParsableBitArray
                r0 = 5
                byte[] r0 = new byte[r0]
                r2.<init>(r0)
                r1.pmtScratch = r2
                android.util.SparseArray r2 = new android.util.SparseArray
                r2.<init>()
                r1.trackIdToReaderScratch = r2
                android.util.SparseIntArray r2 = new android.util.SparseIntArray
                r2.<init>()
                r1.trackIdToPidScratch = r2
                r1.pid = r3
                return
        }

        private com.google.android.exoplayer2.extractor.ts.TsPayloadReader.EsInfo readEsInfo(com.google.android.exoplayer2.util.ParsableByteArray r14, int r15) {
                r13 = this;
                int r0 = r14.getPosition()
                int r15 = r15 + r0
                r1 = 0
                r2 = -1
                r2 = r1
                r3 = -1
            L9:
                int r4 = r14.getPosition()
                if (r4 >= r15) goto Lc0
                int r4 = r14.readUnsignedByte()
                int r5 = r14.readUnsignedByte()
                int r6 = r14.getPosition()
                int r6 = r6 + r5
                if (r6 <= r15) goto L20
                goto Lc0
            L20:
                r5 = 5
                r7 = 89
                r8 = 172(0xac, float:2.41E-43)
                r9 = 135(0x87, float:1.89E-43)
                r10 = 129(0x81, float:1.81E-43)
                if (r4 != r5) goto L54
                long r4 = r14.readUnsignedInt()
                r11 = 1094921523(0x41432d33, double:5.409631094E-315)
                int r7 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r7 != 0) goto L37
                goto L58
            L37:
                r10 = 1161904947(0x45414333, double:5.74057318E-315)
                int r7 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r7 != 0) goto L3f
                goto L5f
            L3f:
                r9 = 1094921524(0x41432d34, double:5.4096311E-315)
                int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r7 != 0) goto L4a
            L46:
                r3 = 172(0xac, float:2.41E-43)
                goto Lb6
            L4a:
                r7 = 1212503619(0x48455643, double:5.990563836E-315)
                int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r9 != 0) goto Lb6
                r3 = 36
                goto Lb6
            L54:
                r5 = 106(0x6a, float:1.49E-43)
                if (r4 != r5) goto L5b
            L58:
                r3 = 129(0x81, float:1.81E-43)
                goto Lb6
            L5b:
                r5 = 122(0x7a, float:1.71E-43)
                if (r4 != r5) goto L62
            L5f:
                r3 = 135(0x87, float:1.89E-43)
                goto Lb6
            L62:
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 != r5) goto L6f
                int r4 = r14.readUnsignedByte()
                r5 = 21
                if (r4 != r5) goto Lb6
                goto L46
            L6f:
                r5 = 123(0x7b, float:1.72E-43)
                if (r4 != r5) goto L76
                r3 = 138(0x8a, float:1.93E-43)
                goto Lb6
            L76:
                r5 = 10
                r8 = 3
                if (r4 != r5) goto L84
                java.lang.String r1 = r14.readString(r8)
                java.lang.String r1 = r1.trim()
                goto Lb6
            L84:
                if (r4 != r7) goto Lb0
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
            L8b:
                int r3 = r14.getPosition()
                if (r3 >= r6) goto Lad
                java.lang.String r3 = r14.readString(r8)
                java.lang.String r3 = r3.trim()
                int r4 = r14.readUnsignedByte()
                r5 = 4
                byte[] r9 = new byte[r5]
                r10 = 0
                r14.readBytes(r9, r10, r5)
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader$DvbSubtitleInfo r5 = new com.google.android.exoplayer2.extractor.ts.TsPayloadReader$DvbSubtitleInfo
                r5.<init>(r3, r4, r9)
                r2.add(r5)
                goto L8b
            Lad:
                r3 = 89
                goto Lb6
            Lb0:
                r5 = 111(0x6f, float:1.56E-43)
                if (r4 != r5) goto Lb6
                r3 = 257(0x101, float:3.6E-43)
            Lb6:
                int r4 = r14.getPosition()
                int r6 = r6 - r4
                r14.skipBytes(r6)
                goto L9
            Lc0:
                r14.setPosition(r15)
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader$EsInfo r4 = new com.google.android.exoplayer2.extractor.ts.TsPayloadReader$EsInfo
                byte[] r14 = r14.getData()
                byte[] r14 = java.util.Arrays.copyOfRange(r14, r0, r15)
                r4.<init>(r3, r1, r2, r14)
                return r4
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void consume(com.google.android.exoplayer2.util.ParsableByteArray r17) {
                r16 = this;
                r0 = r16
                r1 = r17
                int r2 = r17.readUnsignedByte()
                r3 = 2
                if (r2 == r3) goto Lc
                return
            Lc:
                com.google.android.exoplayer2.extractor.ts.TsExtractor r2 = r0.this$0
                int r2 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$200(r2)
                r4 = 1
                r5 = 0
                if (r2 == r4) goto L46
                com.google.android.exoplayer2.extractor.ts.TsExtractor r2 = r0.this$0
                int r2 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$200(r2)
                if (r2 == r3) goto L46
                com.google.android.exoplayer2.extractor.ts.TsExtractor r2 = r0.this$0
                int r2 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$100(r2)
                if (r2 != r4) goto L27
                goto L46
            L27:
                com.google.android.exoplayer2.util.TimestampAdjuster r2 = new com.google.android.exoplayer2.util.TimestampAdjuster
                com.google.android.exoplayer2.extractor.ts.TsExtractor r6 = r0.this$0
                java.util.List r6 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$300(r6)
                java.lang.Object r6 = r6.get(r5)
                com.google.android.exoplayer2.util.TimestampAdjuster r6 = (com.google.android.exoplayer2.util.TimestampAdjuster) r6
                long r6 = r6.getFirstSampleTimestampUs()
                r2.<init>(r6)
                com.google.android.exoplayer2.extractor.ts.TsExtractor r6 = r0.this$0
                java.util.List r6 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$300(r6)
                r6.add(r2)
                goto L52
            L46:
                com.google.android.exoplayer2.extractor.ts.TsExtractor r2 = r0.this$0
                java.util.List r2 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$300(r2)
                java.lang.Object r2 = r2.get(r5)
                com.google.android.exoplayer2.util.TimestampAdjuster r2 = (com.google.android.exoplayer2.util.TimestampAdjuster) r2
            L52:
                int r6 = r17.readUnsignedByte()
                r6 = r6 & 128(0x80, float:1.8E-43)
                if (r6 != 0) goto L5b
                return
            L5b:
                r1.skipBytes(r4)
                int r6 = r17.readUnsignedShort()
                r7 = 3
                r1.skipBytes(r7)
                com.google.android.exoplayer2.util.ParsableBitArray r8 = r0.pmtScratch
                r1.readBytes(r8, r3)
                com.google.android.exoplayer2.util.ParsableBitArray r8 = r0.pmtScratch
                r8.skipBits(r7)
                com.google.android.exoplayer2.extractor.ts.TsExtractor r8 = r0.this$0
                com.google.android.exoplayer2.util.ParsableBitArray r9 = r0.pmtScratch
                r10 = 13
                int r9 = r9.readBits(r10)
                com.google.android.exoplayer2.extractor.ts.TsExtractor.access$402(r8, r9)
                com.google.android.exoplayer2.util.ParsableBitArray r8 = r0.pmtScratch
                r1.readBytes(r8, r3)
                com.google.android.exoplayer2.util.ParsableBitArray r8 = r0.pmtScratch
                r9 = 4
                r8.skipBits(r9)
                com.google.android.exoplayer2.util.ParsableBitArray r8 = r0.pmtScratch
                r11 = 12
                int r8 = r8.readBits(r11)
                r1.skipBytes(r8)
                com.google.android.exoplayer2.extractor.ts.TsExtractor r8 = r0.this$0
                int r8 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$200(r8)
                r12 = 8192(0x2000, float:1.148E-41)
                r13 = 21
                if (r8 != r3) goto Ld8
                com.google.android.exoplayer2.extractor.ts.TsExtractor r8 = r0.this$0
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader r8 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$500(r8)
                if (r8 != 0) goto Ld8
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader$EsInfo r8 = new com.google.android.exoplayer2.extractor.ts.TsPayloadReader$EsInfo
                byte[] r14 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
                r15 = 0
                r8.<init>(r13, r15, r15, r14)
                com.google.android.exoplayer2.extractor.ts.TsExtractor r14 = r0.this$0
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader$Factory r15 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$600(r14)
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader r8 = r15.createPayloadReader(r13, r8)
                com.google.android.exoplayer2.extractor.ts.TsExtractor.access$502(r14, r8)
                com.google.android.exoplayer2.extractor.ts.TsExtractor r8 = r0.this$0
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader r8 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$500(r8)
                if (r8 == 0) goto Ld8
                com.google.android.exoplayer2.extractor.ts.TsExtractor r8 = r0.this$0
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader r8 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$500(r8)
                com.google.android.exoplayer2.extractor.ts.TsExtractor r14 = r0.this$0
                com.google.android.exoplayer2.extractor.ExtractorOutput r14 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$700(r14)
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader$TrackIdGenerator r15 = new com.google.android.exoplayer2.extractor.ts.TsPayloadReader$TrackIdGenerator
                r15.<init>(r6, r13, r12)
                r8.init(r2, r14, r15)
            Ld8:
                android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.TsPayloadReader> r8 = r0.trackIdToReaderScratch
                r8.clear()
                android.util.SparseIntArray r8 = r0.trackIdToPidScratch
                r8.clear()
                int r8 = r17.bytesLeft()
            Le6:
                if (r8 <= 0) goto L16e
                com.google.android.exoplayer2.util.ParsableBitArray r14 = r0.pmtScratch
                r15 = 5
                r1.readBytes(r14, r15)
                com.google.android.exoplayer2.util.ParsableBitArray r14 = r0.pmtScratch
                r5 = 8
                int r5 = r14.readBits(r5)
                com.google.android.exoplayer2.util.ParsableBitArray r14 = r0.pmtScratch
                r14.skipBits(r7)
                com.google.android.exoplayer2.util.ParsableBitArray r14 = r0.pmtScratch
                int r14 = r14.readBits(r10)
                com.google.android.exoplayer2.util.ParsableBitArray r7 = r0.pmtScratch
                r7.skipBits(r9)
                com.google.android.exoplayer2.util.ParsableBitArray r7 = r0.pmtScratch
                int r7 = r7.readBits(r11)
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader$EsInfo r9 = r0.readEsInfo(r1, r7)
                r10 = 6
                if (r5 == r10) goto L115
                if (r5 != r15) goto L117
            L115:
                int r5 = r9.streamType
            L117:
                int r7 = r7 + 5
                int r8 = r8 - r7
                com.google.android.exoplayer2.extractor.ts.TsExtractor r7 = r0.this$0
                int r7 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$200(r7)
                if (r7 != r3) goto L124
                r7 = r5
                goto L125
            L124:
                r7 = r14
            L125:
                com.google.android.exoplayer2.extractor.ts.TsExtractor r10 = r0.this$0
                android.util.SparseBooleanArray r10 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$800(r10)
                boolean r10 = r10.get(r7)
                if (r10 == 0) goto L132
                goto L167
            L132:
                com.google.android.exoplayer2.extractor.ts.TsExtractor r10 = r0.this$0
                int r10 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$200(r10)
                if (r10 != r3) goto L143
                if (r5 != r13) goto L143
                com.google.android.exoplayer2.extractor.ts.TsExtractor r5 = r0.this$0
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader r5 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$500(r5)
                goto L14d
            L143:
                com.google.android.exoplayer2.extractor.ts.TsExtractor r10 = r0.this$0
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader$Factory r10 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$600(r10)
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader r5 = r10.createPayloadReader(r5, r9)
            L14d:
                com.google.android.exoplayer2.extractor.ts.TsExtractor r9 = r0.this$0
                int r9 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$200(r9)
                if (r9 != r3) goto L15d
                android.util.SparseIntArray r9 = r0.trackIdToPidScratch
                int r9 = r9.get(r7, r12)
                if (r14 >= r9) goto L167
            L15d:
                android.util.SparseIntArray r9 = r0.trackIdToPidScratch
                r9.put(r7, r14)
                android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.TsPayloadReader> r9 = r0.trackIdToReaderScratch
                r9.put(r7, r5)
            L167:
                r5 = 0
                r7 = 3
                r9 = 4
                r10 = 13
                goto Le6
            L16e:
                android.util.SparseIntArray r1 = r0.trackIdToPidScratch
                int r1 = r1.size()
                r5 = 0
            L175:
                if (r5 >= r1) goto L1c1
                android.util.SparseIntArray r7 = r0.trackIdToPidScratch
                int r7 = r7.keyAt(r5)
                android.util.SparseIntArray r8 = r0.trackIdToPidScratch
                int r8 = r8.valueAt(r5)
                com.google.android.exoplayer2.extractor.ts.TsExtractor r9 = r0.this$0
                android.util.SparseBooleanArray r9 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$800(r9)
                r9.put(r7, r4)
                com.google.android.exoplayer2.extractor.ts.TsExtractor r9 = r0.this$0
                android.util.SparseBooleanArray r9 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$900(r9)
                r9.put(r8, r4)
                android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.TsPayloadReader> r9 = r0.trackIdToReaderScratch
                java.lang.Object r9 = r9.valueAt(r5)
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader r9 = (com.google.android.exoplayer2.extractor.ts.TsPayloadReader) r9
                if (r9 == 0) goto L1be
                com.google.android.exoplayer2.extractor.ts.TsExtractor r10 = r0.this$0
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader r10 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$500(r10)
                if (r9 == r10) goto L1b5
                com.google.android.exoplayer2.extractor.ts.TsExtractor r10 = r0.this$0
                com.google.android.exoplayer2.extractor.ExtractorOutput r10 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$700(r10)
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader$TrackIdGenerator r11 = new com.google.android.exoplayer2.extractor.ts.TsPayloadReader$TrackIdGenerator
                r11.<init>(r6, r7, r12)
                r9.init(r2, r10, r11)
            L1b5:
                com.google.android.exoplayer2.extractor.ts.TsExtractor r7 = r0.this$0
                android.util.SparseArray r7 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$000(r7)
                r7.put(r8, r9)
            L1be:
                int r5 = r5 + 1
                goto L175
            L1c1:
                com.google.android.exoplayer2.extractor.ts.TsExtractor r1 = r0.this$0
                int r1 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$200(r1)
                if (r1 != r3) goto L1e6
                com.google.android.exoplayer2.extractor.ts.TsExtractor r1 = r0.this$0
                boolean r1 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$1000(r1)
                if (r1 != 0) goto L21d
                com.google.android.exoplayer2.extractor.ts.TsExtractor r1 = r0.this$0
                com.google.android.exoplayer2.extractor.ExtractorOutput r1 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$700(r1)
                r1.endTracks()
                com.google.android.exoplayer2.extractor.ts.TsExtractor r1 = r0.this$0
                r2 = 0
                com.google.android.exoplayer2.extractor.ts.TsExtractor.access$102(r1, r2)
                com.google.android.exoplayer2.extractor.ts.TsExtractor r1 = r0.this$0
                com.google.android.exoplayer2.extractor.ts.TsExtractor.access$1002(r1)
                goto L21d
            L1e6:
                r2 = 0
                com.google.android.exoplayer2.extractor.ts.TsExtractor r1 = r0.this$0
                android.util.SparseArray r1 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$000(r1)
                int r3 = r0.pid
                r1.remove(r3)
                com.google.android.exoplayer2.extractor.ts.TsExtractor r1 = r0.this$0
                int r3 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$200(r1)
                if (r3 != r4) goto L1fc
                r5 = 0
                goto L204
            L1fc:
                com.google.android.exoplayer2.extractor.ts.TsExtractor r2 = r0.this$0
                int r2 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$100(r2)
                int r5 = r2 + (-1)
            L204:
                com.google.android.exoplayer2.extractor.ts.TsExtractor.access$102(r1, r5)
                com.google.android.exoplayer2.extractor.ts.TsExtractor r1 = r0.this$0
                int r1 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$100(r1)
                if (r1 != 0) goto L21d
                com.google.android.exoplayer2.extractor.ts.TsExtractor r1 = r0.this$0
                com.google.android.exoplayer2.extractor.ExtractorOutput r1 = com.google.android.exoplayer2.extractor.ts.TsExtractor.access$700(r1)
                r1.endTracks()
                com.google.android.exoplayer2.extractor.ts.TsExtractor r1 = r0.this$0
                com.google.android.exoplayer2.extractor.ts.TsExtractor.access$1002(r1)
            L21d:
                return
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void init(com.google.android.exoplayer2.util.TimestampAdjuster r1, com.google.android.exoplayer2.extractor.ExtractorOutput r2, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator r3) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$bYe9QyXe_uycRO2Fcb-UvfjPyNo, reason: not valid java name */
    public static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] m226$r8$lambda$bYe9QyXe_uycRO2FcbUvfjPyNo() {
            com.google.android.exoplayer2.extractor.Extractor[] r0 = lambda$static$0()
            return r0
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$13
            com.google.android.exoplayer2.extractor.ts.TsExtractor.FACTORY = r0
            return
    }

    public TsExtractor() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public TsExtractor(int r3) {
            r2 = this;
            r0 = 1
            r1 = 112800(0x1b8a0, float:1.58066E-40)
            r2.<init>(r0, r3, r1)
            return
    }

    public TsExtractor(int r4, int r5, int r6) {
            r3 = this;
            com.google.android.exoplayer2.util.TimestampAdjuster r0 = new com.google.android.exoplayer2.util.TimestampAdjuster
            r1 = 0
            r0.<init>(r1)
            com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory r1 = new com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory
            r1.<init>(r5)
            r3.<init>(r4, r0, r1, r6)
            return
    }

    public TsExtractor(int r2, com.google.android.exoplayer2.util.TimestampAdjuster r3, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory r4) {
            r1 = this;
            r0 = 112800(0x1b8a0, float:1.58066E-40)
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public TsExtractor(int r1, com.google.android.exoplayer2.util.TimestampAdjuster r2, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory r3, int r4) {
            r0 = this;
            r0.<init>()
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.extractor.ts.TsPayloadReader$Factory r3 = (com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory) r3
            r0.payloadReaderFactory = r3
            r0.timestampSearchBytes = r4
            r0.mode = r1
            r3 = 1
            if (r1 == r3) goto L21
            r3 = 2
            if (r1 != r3) goto L16
            goto L21
        L16:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.timestampAdjusters = r1
            r1.add(r2)
            goto L27
        L21:
            java.util.List r1 = java.util.Collections.singletonList(r2)
            r0.timestampAdjusters = r1
        L27:
            com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
            r2 = 9400(0x24b8, float:1.3172E-41)
            byte[] r2 = new byte[r2]
            r3 = 0
            r1.<init>(r2, r3)
            r0.tsPacketBuffer = r1
            android.util.SparseBooleanArray r1 = new android.util.SparseBooleanArray
            r1.<init>()
            r0.trackIds = r1
            android.util.SparseBooleanArray r1 = new android.util.SparseBooleanArray
            r1.<init>()
            r0.trackPids = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.tsPayloadReaders = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.continuityCounters = r1
            com.google.android.exoplayer2.extractor.ts.TsDurationReader r1 = new com.google.android.exoplayer2.extractor.ts.TsDurationReader
            r1.<init>(r4)
            r0.durationReader = r1
            com.google.android.exoplayer2.extractor.ExtractorOutput r1 = com.google.android.exoplayer2.extractor.ExtractorOutput.PLACEHOLDER
            r0.output = r1
            r1 = -1
            r0.pcrPid = r1
            r0.resetPayloadReaders()
            return
    }

    public static /* synthetic */ android.util.SparseArray access$000(com.google.android.exoplayer2.extractor.ts.TsExtractor r0) {
            android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.TsPayloadReader> r0 = r0.tsPayloadReaders
            return r0
    }

    public static /* synthetic */ int access$100(com.google.android.exoplayer2.extractor.ts.TsExtractor r0) {
            int r0 = r0.remainingPmts
            return r0
    }

    public static /* synthetic */ boolean access$1000(com.google.android.exoplayer2.extractor.ts.TsExtractor r0) {
            boolean r0 = r0.tracksEnded
            return r0
    }

    public static /* synthetic */ void access$1002(com.google.android.exoplayer2.extractor.ts.TsExtractor r1) {
            r0 = 1
            r1.tracksEnded = r0
            return
    }

    public static /* synthetic */ int access$102(com.google.android.exoplayer2.extractor.ts.TsExtractor r0, int r1) {
            r0.remainingPmts = r1
            return r1
    }

    public static /* synthetic */ int access$108(com.google.android.exoplayer2.extractor.ts.TsExtractor r2) {
            int r0 = r2.remainingPmts
            int r1 = r0 + 1
            r2.remainingPmts = r1
            return r0
    }

    public static /* synthetic */ int access$200(com.google.android.exoplayer2.extractor.ts.TsExtractor r0) {
            int r0 = r0.mode
            return r0
    }

    public static /* synthetic */ java.util.List access$300(com.google.android.exoplayer2.extractor.ts.TsExtractor r0) {
            java.util.List<com.google.android.exoplayer2.util.TimestampAdjuster> r0 = r0.timestampAdjusters
            return r0
    }

    public static /* synthetic */ int access$402(com.google.android.exoplayer2.extractor.ts.TsExtractor r0, int r1) {
            r0.pcrPid = r1
            return r1
    }

    public static /* synthetic */ com.google.android.exoplayer2.extractor.ts.TsPayloadReader access$500(com.google.android.exoplayer2.extractor.ts.TsExtractor r0) {
            com.google.android.exoplayer2.extractor.ts.TsPayloadReader r0 = r0.id3Reader
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.extractor.ts.TsPayloadReader access$502(com.google.android.exoplayer2.extractor.ts.TsExtractor r0, com.google.android.exoplayer2.extractor.ts.TsPayloadReader r1) {
            r0.id3Reader = r1
            return r1
    }

    public static /* synthetic */ com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory access$600(com.google.android.exoplayer2.extractor.ts.TsExtractor r0) {
            com.google.android.exoplayer2.extractor.ts.TsPayloadReader$Factory r0 = r0.payloadReaderFactory
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.extractor.ExtractorOutput access$700(com.google.android.exoplayer2.extractor.ts.TsExtractor r0) {
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r0.output
            return r0
    }

    public static /* synthetic */ android.util.SparseBooleanArray access$800(com.google.android.exoplayer2.extractor.ts.TsExtractor r0) {
            android.util.SparseBooleanArray r0 = r0.trackIds
            return r0
    }

    public static /* synthetic */ android.util.SparseBooleanArray access$900(com.google.android.exoplayer2.extractor.ts.TsExtractor r0) {
            android.util.SparseBooleanArray r0 = r0.trackPids
            return r0
    }

    private boolean fillBufferWithAtLeastOnePacket(com.google.android.exoplayer2.extractor.ExtractorInput r7) throws java.io.IOException {
            r6 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.tsPacketBuffer
            byte[] r0 = r0.getData()
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r6.tsPacketBuffer
            int r1 = r1.getPosition()
            int r1 = 9400 - r1
            r2 = 0
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r6.tsPacketBuffer
            int r1 = r1.bytesLeft()
            if (r1 <= 0) goto L24
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r6.tsPacketBuffer
            int r4 = r4.getPosition()
            java.lang.System.arraycopy(r0, r4, r0, r2, r1)
        L24:
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r6.tsPacketBuffer
            r4.reset(r0, r1)
        L29:
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r6.tsPacketBuffer
            int r1 = r1.bytesLeft()
            if (r1 >= r3) goto L48
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r6.tsPacketBuffer
            int r1 = r1.limit()
            int r4 = 9400 - r1
            int r4 = r7.read(r0, r1, r4)
            r5 = -1
            if (r4 != r5) goto L41
            return r2
        L41:
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r6.tsPacketBuffer
            int r1 = r1 + r4
            r5.setLimit(r1)
            goto L29
        L48:
            r7 = 1
            return r7
    }

    private int findEndOfFirstTsPacketInBuffer() throws com.google.android.exoplayer2.ParserException {
            r4 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.tsPacketBuffer
            int r0 = r0.getPosition()
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r4.tsPacketBuffer
            int r1 = r1.limit()
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r4.tsPacketBuffer
            byte[] r2 = r2.getData()
            int r2 = com.google.android.exoplayer2.extractor.ts.TsUtil.findSyncBytePosition(r2, r0, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r4.tsPacketBuffer
            r3.setPosition(r2)
            int r3 = r2 + 188
            if (r3 <= r1) goto L37
            int r1 = r4.bytesSinceLastSync
            int r2 = r2 - r0
            int r2 = r2 + r1
            r4.bytesSinceLastSync = r2
            int r0 = r4.mode
            r1 = 2
            if (r0 != r1) goto L3a
            r0 = 376(0x178, float:5.27E-43)
            if (r2 > r0) goto L2f
            goto L3a
        L2f:
            r0 = 0
            java.lang.String r1 = "Cannot find sync byte. Most likely not a Transport Stream."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r1, r0)
            throw r0
        L37:
            r0 = 0
            r4.bytesSinceLastSync = r0
        L3a:
            return r3
    }

    private static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
            r0 = 1
            com.google.android.exoplayer2.extractor.Extractor[] r0 = new com.google.android.exoplayer2.extractor.Extractor[r0]
            com.google.android.exoplayer2.extractor.ts.TsExtractor r1 = new com.google.android.exoplayer2.extractor.ts.TsExtractor
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            return r0
    }

    private void maybeOutputSeekMap(long r14) {
            r13 = this;
            boolean r0 = r13.hasOutputSeekMap
            if (r0 != 0) goto L49
            r0 = 1
            r13.hasOutputSeekMap = r0
            com.google.android.exoplayer2.extractor.ts.TsDurationReader r0 = r13.durationReader
            long r0 = r0.getDurationUs()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L39
            com.google.android.exoplayer2.extractor.ts.TsBinarySearchSeeker r0 = new com.google.android.exoplayer2.extractor.ts.TsBinarySearchSeeker
            com.google.android.exoplayer2.extractor.ts.TsDurationReader r1 = r13.durationReader
            com.google.android.exoplayer2.util.TimestampAdjuster r6 = r1.getPcrTimestampAdjuster()
            com.google.android.exoplayer2.extractor.ts.TsDurationReader r1 = r13.durationReader
            long r7 = r1.getDurationUs()
            int r11 = r13.pcrPid
            int r12 = r13.timestampSearchBytes
            r5 = r0
            r9 = r14
            r5.<init>(r6, r7, r9, r11, r12)
            r13.tsBinarySearchSeeker = r0
            com.google.android.exoplayer2.extractor.ExtractorOutput r14 = r13.output
            com.google.android.exoplayer2.extractor.SeekMap r15 = r0.getSeekMap()
            r14.seekMap(r15)
            goto L49
        L39:
            com.google.android.exoplayer2.extractor.ExtractorOutput r14 = r13.output
            com.google.android.exoplayer2.extractor.SeekMap$Unseekable r15 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
            com.google.android.exoplayer2.extractor.ts.TsDurationReader r0 = r13.durationReader
            long r0 = r0.getDurationUs()
            r15.<init>(r0)
            r14.seekMap(r15)
        L49:
            return
    }

    private void resetPayloadReaders() {
            r7 = this;
            android.util.SparseBooleanArray r0 = r7.trackIds
            r0.clear()
            android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.TsPayloadReader> r0 = r7.tsPayloadReaders
            r0.clear()
            com.google.android.exoplayer2.extractor.ts.TsPayloadReader$Factory r0 = r7.payloadReaderFactory
            android.util.SparseArray r0 = r0.createInitialPayloadReaders()
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L16:
            if (r3 >= r1) goto L2a
            android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.TsPayloadReader> r4 = r7.tsPayloadReaders
            int r5 = r0.keyAt(r3)
            java.lang.Object r6 = r0.valueAt(r3)
            com.google.android.exoplayer2.extractor.ts.TsPayloadReader r6 = (com.google.android.exoplayer2.extractor.ts.TsPayloadReader) r6
            r4.put(r5, r6)
            int r3 = r3 + 1
            goto L16
        L2a:
            android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.TsPayloadReader> r0 = r7.tsPayloadReaders
            com.google.android.exoplayer2.extractor.ts.SectionReader r1 = new com.google.android.exoplayer2.extractor.ts.SectionReader
            com.google.android.exoplayer2.extractor.ts.TsExtractor$PatReader r3 = new com.google.android.exoplayer2.extractor.ts.TsExtractor$PatReader
            r3.<init>(r7)
            r1.<init>(r3)
            r0.put(r2, r1)
            r0 = 0
            r7.id3Reader = r0
            return
    }

    private boolean shouldConsumePacketPayload(int r4) {
            r3 = this;
            int r0 = r3.mode
            r1 = 0
            r2 = 2
            if (r0 == r2) goto L12
            boolean r0 = r3.tracksEnded
            if (r0 != 0) goto L12
            android.util.SparseBooleanArray r0 = r3.trackPids
            boolean r4 = r0.get(r4, r1)
            if (r4 != 0) goto L13
        L12:
            r1 = 1
        L13:
            return r1
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r1) {
            r0 = this;
            r0.output = r1
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r17, com.google.android.exoplayer2.extractor.PositionHolder r18) throws java.io.IOException {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            long r3 = r17.getLength()
            boolean r5 = r0.tracksEnded
            r6 = -1
            r8 = 2
            r9 = 1
            r10 = 0
            if (r5 == 0) goto L5b
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 == 0) goto L1d
            int r5 = r0.mode
            if (r5 == r8) goto L1d
            r5 = 1
            goto L1e
        L1d:
            r5 = 0
        L1e:
            if (r5 == 0) goto L31
            com.google.android.exoplayer2.extractor.ts.TsDurationReader r5 = r0.durationReader
            boolean r5 = r5.isDurationReadFinished()
            if (r5 != 0) goto L31
            com.google.android.exoplayer2.extractor.ts.TsDurationReader r3 = r0.durationReader
            int r4 = r0.pcrPid
            int r1 = r3.readDuration(r1, r2, r4)
            return r1
        L31:
            r0.maybeOutputSeekMap(r3)
            boolean r5 = r0.pendingSeekToStart
            if (r5 == 0) goto L4a
            r0.pendingSeekToStart = r10
            r11 = 0
            r0.seek(r11, r11)
            long r13 = r17.getPosition()
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 == 0) goto L4a
            r2.position = r11
            return r9
        L4a:
            com.google.android.exoplayer2.extractor.ts.TsBinarySearchSeeker r5 = r0.tsBinarySearchSeeker
            if (r5 == 0) goto L5b
            boolean r5 = r5.isSeeking()
            if (r5 == 0) goto L5b
            com.google.android.exoplayer2.extractor.ts.TsBinarySearchSeeker r3 = r0.tsBinarySearchSeeker
            int r1 = r3.handlePendingSeek(r1, r2)
            return r1
        L5b:
            boolean r1 = r16.fillBufferWithAtLeastOnePacket(r17)
            if (r1 != 0) goto L63
            r1 = -1
            return r1
        L63:
            int r1 = r16.findEndOfFirstTsPacketInBuffer()
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r0.tsPacketBuffer
            int r2 = r2.limit()
            if (r1 <= r2) goto L70
            return r10
        L70:
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r0.tsPacketBuffer
            int r5 = r5.readInt()
            r11 = 8388608(0x800000, float:1.1754944E-38)
            r11 = r11 & r5
            if (r11 == 0) goto L81
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r0.tsPacketBuffer
            r2.setPosition(r1)
            return r10
        L81:
            r11 = 4194304(0x400000, float:5.877472E-39)
            r11 = r11 & r5
            if (r11 == 0) goto L88
            r11 = 1
            goto L89
        L88:
            r11 = 0
        L89:
            r11 = r11 | r10
            r12 = 2096896(0x1fff00, float:2.938377E-39)
            r12 = r12 & r5
            int r12 = r12 >> 8
            r13 = r5 & 32
            if (r13 == 0) goto L96
            r13 = 1
            goto L97
        L96:
            r13 = 0
        L97:
            r14 = r5 & 16
            if (r14 == 0) goto L9d
            r14 = 1
            goto L9e
        L9d:
            r14 = 0
        L9e:
            if (r14 == 0) goto La9
            android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.TsPayloadReader> r14 = r0.tsPayloadReaders
            java.lang.Object r14 = r14.get(r12)
            com.google.android.exoplayer2.extractor.ts.TsPayloadReader r14 = (com.google.android.exoplayer2.extractor.ts.TsPayloadReader) r14
            goto Laa
        La9:
            r14 = 0
        Laa:
            if (r14 != 0) goto Lb2
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r0.tsPacketBuffer
            r2.setPosition(r1)
            return r10
        Lb2:
            int r15 = r0.mode
            if (r15 == r8) goto Ld5
            r5 = r5 & 15
            android.util.SparseIntArray r15 = r0.continuityCounters
            int r6 = r5 + (-1)
            int r6 = r15.get(r12, r6)
            android.util.SparseIntArray r7 = r0.continuityCounters
            r7.put(r12, r5)
            if (r6 != r5) goto Lcd
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r0.tsPacketBuffer
            r2.setPosition(r1)
            return r10
        Lcd:
            int r6 = r6 + r9
            r6 = r6 & 15
            if (r5 == r6) goto Ld5
            r14.seek()
        Ld5:
            if (r13 == 0) goto Lf1
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r0.tsPacketBuffer
            int r5 = r5.readUnsignedByte()
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r0.tsPacketBuffer
            int r6 = r6.readUnsignedByte()
            r6 = r6 & 64
            if (r6 == 0) goto Le9
            r6 = 2
            goto Lea
        Le9:
            r6 = 0
        Lea:
            r11 = r11 | r6
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r0.tsPacketBuffer
            int r5 = r5 - r9
            r6.skipBytes(r5)
        Lf1:
            boolean r5 = r0.tracksEnded
            boolean r6 = r0.shouldConsumePacketPayload(r12)
            if (r6 == 0) goto L108
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r0.tsPacketBuffer
            r6.setLimit(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r0.tsPacketBuffer
            r14.consume(r6, r11)
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r0.tsPacketBuffer
            r6.setLimit(r2)
        L108:
            int r2 = r0.mode
            if (r2 == r8) goto L11a
            if (r5 != 0) goto L11a
            boolean r2 = r0.tracksEnded
            if (r2 == 0) goto L11a
            r5 = -1
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 == 0) goto L11a
            r0.pendingSeekToStart = r9
        L11a:
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r0.tsPacketBuffer
            r2.setPosition(r1)
            return r10
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long r11, long r13) {
            r10 = this;
            int r11 = r10.mode
            r12 = 1
            r0 = 0
            r1 = 2
            if (r11 == r1) goto L9
            r11 = 1
            goto La
        L9:
            r11 = 0
        La:
            com.google.android.exoplayer2.util.Assertions.checkState(r11)
            java.util.List<com.google.android.exoplayer2.util.TimestampAdjuster> r11 = r10.timestampAdjusters
            int r11 = r11.size()
            r1 = 0
        L14:
            r2 = 0
            if (r1 >= r11) goto L4d
            java.util.List<com.google.android.exoplayer2.util.TimestampAdjuster> r4 = r10.timestampAdjusters
            java.lang.Object r4 = r4.get(r1)
            com.google.android.exoplayer2.util.TimestampAdjuster r4 = (com.google.android.exoplayer2.util.TimestampAdjuster) r4
            long r5 = r4.getTimestampOffsetUs()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L2f
            r5 = 1
            goto L30
        L2f:
            r5 = 0
        L30:
            if (r5 != 0) goto L45
            long r5 = r4.getFirstSampleTimestampUs()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L44
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 == 0) goto L44
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 == 0) goto L44
            r5 = 1
            goto L45
        L44:
            r5 = 0
        L45:
            if (r5 == 0) goto L4a
            r4.reset(r13)
        L4a:
            int r1 = r1 + 1
            goto L14
        L4d:
            int r11 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r11 == 0) goto L58
            com.google.android.exoplayer2.extractor.ts.TsBinarySearchSeeker r11 = r10.tsBinarySearchSeeker
            if (r11 == 0) goto L58
            r11.setSeekTargetUs(r13)
        L58:
            com.google.android.exoplayer2.util.ParsableByteArray r11 = r10.tsPacketBuffer
            r11.reset(r0)
            android.util.SparseIntArray r11 = r10.continuityCounters
            r11.clear()
            r11 = 0
        L63:
            android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.TsPayloadReader> r12 = r10.tsPayloadReaders
            int r12 = r12.size()
            if (r11 >= r12) goto L79
            android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.TsPayloadReader> r12 = r10.tsPayloadReaders
            java.lang.Object r12 = r12.valueAt(r11)
            com.google.android.exoplayer2.extractor.ts.TsPayloadReader r12 = (com.google.android.exoplayer2.extractor.ts.TsPayloadReader) r12
            r12.seek()
            int r11 = r11 + 1
            goto L63
        L79:
            r10.bytesSinceLastSync = r0
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r8) throws java.io.IOException {
            r7 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.tsPacketBuffer
            byte[] r0 = r0.getData()
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r8.peekFully(r0, r1, r2)
            r2 = 0
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2e
            r3 = 0
        L12:
            r4 = 5
            r5 = 1
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r6 = 71
            if (r4 == r6) goto L21
            r3 = 0
            goto L25
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r3 = 1
        L25:
            if (r3 == 0) goto L2b
            r8.skipFully(r2)
            return r5
        L2b:
            int r2 = r2 + 1
            goto Ld
        L2e:
            return r1
    }
}
