package com.google.android.exoplayer2.extractor.wav;

/* JADX INFO: loaded from: classes.dex */
public final class WavExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory FACTORY = null;
    private static final int STATE_READING_FILE_TYPE = 0;
    private static final int STATE_READING_FORMAT = 2;
    private static final int STATE_READING_RF64_SAMPLE_DATA_SIZE = 1;
    private static final int STATE_READING_SAMPLE_DATA = 4;
    private static final int STATE_SKIPPING_TO_SAMPLE_DATA = 3;
    private static final java.lang.String TAG = "WavExtractor";
    private static final int TARGET_SAMPLES_PER_SECOND = 10;
    private long dataEndPosition;
    private int dataStartPosition;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter outputWriter;
    private long rf64SampleDataSize;
    private int state;
    private com.google.android.exoplayer2.extractor.TrackOutput trackOutput;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class ImaAdPcmOutputWriter implements com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter {
        private static final int[] INDEX_TABLE = null;
        private static final int[] STEP_TABLE = null;
        private final com.google.android.exoplayer2.util.ParsableByteArray decodedData;
        private final com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
        private final com.google.android.exoplayer2.Format format;
        private final int framesPerBlock;
        private final byte[] inputData;
        private long outputFrameCount;
        private int pendingInputBytes;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeFrames;
        private final com.google.android.exoplayer2.extractor.TrackOutput trackOutput;
        private final com.google.android.exoplayer2.extractor.wav.WavFormat wavFormat;

        static {
                r0 = 16
                int[] r0 = new int[r0]
                r0 = {x0014: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8} // fill-array
                com.google.android.exoplayer2.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.INDEX_TABLE = r0
                r0 = 89
                int[] r0 = new int[r0]
                r0 = {x0038: FILL_ARRAY_DATA , data: [7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767} // fill-array
                com.google.android.exoplayer2.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.STEP_TABLE = r0
                return
        }

        public ImaAdPcmOutputWriter(com.google.android.exoplayer2.extractor.ExtractorOutput r5, com.google.android.exoplayer2.extractor.TrackOutput r6, com.google.android.exoplayer2.extractor.wav.WavFormat r7) throws com.google.android.exoplayer2.ParserException {
                r4 = this;
                r4.<init>()
                r4.extractorOutput = r5
                r4.trackOutput = r6
                r4.wavFormat = r7
                int r5 = r7.frameRateHz
                int r5 = r5 / 10
                r6 = 1
                int r5 = java.lang.Math.max(r6, r5)
                r4.targetSampleSizeFrames = r5
                com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
                byte[] r1 = r7.extraData
                r0.<init>(r1)
                r0.readLittleEndianUnsignedShort()
                int r0 = r0.readLittleEndianUnsignedShort()
                r4.framesPerBlock = r0
                int r1 = r7.numChannels
                int r2 = r7.blockSize
                int r3 = r1 * 4
                int r2 = r2 - r3
                int r2 = r2 * 8
                int r3 = r7.bitsPerSample
                int r3 = r3 * r1
                int r2 = r2 / r3
                int r2 = r2 + r6
                if (r0 != r2) goto L8a
                int r6 = com.google.android.exoplayer2.util.Util.ceilDivide(r5, r0)
                int r2 = r7.blockSize
                int r2 = r2 * r6
                byte[] r2 = new byte[r2]
                r4.inputData = r2
                com.google.android.exoplayer2.util.ParsableByteArray r2 = new com.google.android.exoplayer2.util.ParsableByteArray
                int r3 = numOutputFramesToBytes(r0, r1)
                int r6 = r6 * r3
                r2.<init>(r6)
                r4.decodedData = r2
                int r6 = r7.frameRateHz
                int r2 = r7.blockSize
                int r6 = r6 * r2
                int r6 = r6 * 8
                int r6 = r6 / r0
                com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
                r0.<init>()
                java.lang.String r2 = "audio/raw"
                com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r2)
                com.google.android.exoplayer2.Format$Builder r0 = r0.setAverageBitrate(r6)
                com.google.android.exoplayer2.Format$Builder r6 = r0.setPeakBitrate(r6)
                int r5 = numOutputFramesToBytes(r5, r1)
                com.google.android.exoplayer2.Format$Builder r5 = r6.setMaxInputSize(r5)
                int r6 = r7.numChannels
                com.google.android.exoplayer2.Format$Builder r5 = r5.setChannelCount(r6)
                int r6 = r7.frameRateHz
                com.google.android.exoplayer2.Format$Builder r5 = r5.setSampleRate(r6)
                r6 = 2
                com.google.android.exoplayer2.Format$Builder r5 = r5.setPcmEncoding(r6)
                com.google.android.exoplayer2.Format r5 = r5.build()
                r4.format = r5
                return
            L8a:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Expected frames per block: "
                r5.append(r6)
                r5.append(r2)
                java.lang.String r6 = "; got: "
                r5.append(r6)
                r5.append(r0)
                java.lang.String r5 = r5.toString()
                r6 = 0
                com.google.android.exoplayer2.ParserException r5 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r5, r6)
                throw r5
        }

        private void decode(byte[] r5, int r6, com.google.android.exoplayer2.util.ParsableByteArray r7) {
                r4 = this;
                r0 = 0
                r1 = 0
            L2:
                if (r1 >= r6) goto L18
                r2 = 0
            L5:
                com.google.android.exoplayer2.extractor.wav.WavFormat r3 = r4.wavFormat
                int r3 = r3.numChannels
                if (r2 >= r3) goto L15
                byte[] r3 = r7.getData()
                r4.decodeBlockForChannel(r5, r1, r2, r3)
                int r2 = r2 + 1
                goto L5
            L15:
                int r1 = r1 + 1
                goto L2
            L18:
                int r5 = r4.framesPerBlock
                int r5 = r5 * r6
                int r5 = r4.numOutputFramesToBytes(r5)
                r7.setPosition(r0)
                r7.setLimit(r5)
                return
        }

        private void decodeBlockForChannel(byte[] r10, int r11, int r12, byte[] r13) {
                r9 = this;
                com.google.android.exoplayer2.extractor.wav.WavFormat r0 = r9.wavFormat
                int r1 = r0.blockSize
                int r0 = r0.numChannels
                int r2 = r11 * r1
                int r3 = r12 * 4
                int r3 = r3 + r2
                int r2 = r0 * 4
                int r2 = r2 + r3
                int r1 = r1 / r0
                int r1 = r1 + (-4)
                int r4 = r3 + 1
                r4 = r10[r4]
                r4 = r4 & 255(0xff, float:3.57E-43)
                int r4 = r4 << 8
                r5 = r10[r3]
                r5 = r5 & 255(0xff, float:3.57E-43)
                r4 = r4 | r5
                short r4 = (short) r4
                int r3 = r3 + 2
                r3 = r10[r3]
                r3 = r3 & 255(0xff, float:3.57E-43)
                r5 = 88
                int r3 = java.lang.Math.min(r3, r5)
                int[] r5 = com.google.android.exoplayer2.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.STEP_TABLE
                r5 = r5[r3]
                int r6 = r9.framesPerBlock
                int r11 = r11 * r6
                int r11 = r11 * r0
                int r11 = r11 + r12
                int r11 = r11 * 2
                r12 = r4 & 255(0xff, float:3.57E-43)
                byte r12 = (byte) r12
                r13[r11] = r12
                int r12 = r11 + 1
                int r6 = r4 >> 8
                byte r6 = (byte) r6
                r13[r12] = r6
                r12 = 0
                r6 = 0
            L46:
                int r7 = r1 * 2
                if (r6 >= r7) goto L9d
                int r7 = r6 / 8
                int r8 = r6 / 2
                int r8 = r8 % 4
                int r7 = r7 * r0
                int r7 = r7 * 4
                int r7 = r7 + r2
                int r7 = r7 + r8
                r7 = r10[r7]
                r7 = r7 & 255(0xff, float:3.57E-43)
                int r8 = r6 % 2
                if (r8 != 0) goto L61
                r7 = r7 & 15
                goto L63
            L61:
                int r7 = r7 >> 4
            L63:
                r8 = r7 & 7
                int r8 = r8 * 2
                int r8 = r8 + 1
                int r8 = r8 * r5
                int r5 = r8 >> 3
                r8 = r7 & 8
                if (r8 == 0) goto L72
                int r5 = -r5
            L72:
                int r4 = r4 + r5
                r5 = -32768(0xffffffffffff8000, float:NaN)
                r8 = 32767(0x7fff, float:4.5916E-41)
                int r4 = com.google.android.exoplayer2.util.Util.constrainValue(r4, r5, r8)
                int r5 = r0 * 2
                int r11 = r11 + r5
                r5 = r4 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                r13[r11] = r5
                int r5 = r11 + 1
                int r8 = r4 >> 8
                byte r8 = (byte) r8
                r13[r5] = r8
                int[] r5 = com.google.android.exoplayer2.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.INDEX_TABLE
                r5 = r5[r7]
                int r3 = r3 + r5
                int[] r5 = com.google.android.exoplayer2.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.STEP_TABLE
                int r7 = r5.length
                int r7 = r7 + (-1)
                int r3 = com.google.android.exoplayer2.util.Util.constrainValue(r3, r12, r7)
                r5 = r5[r3]
                int r6 = r6 + 1
                goto L46
            L9d:
                return
        }

        private int numOutputBytesToFrames(int r2) {
                r1 = this;
                com.google.android.exoplayer2.extractor.wav.WavFormat r0 = r1.wavFormat
                int r0 = r0.numChannels
                int r0 = r0 * 2
                int r2 = r2 / r0
                return r2
        }

        private int numOutputFramesToBytes(int r2) {
                r1 = this;
                com.google.android.exoplayer2.extractor.wav.WavFormat r0 = r1.wavFormat
                int r0 = r0.numChannels
                int r2 = numOutputFramesToBytes(r2, r0)
                return r2
        }

        private static int numOutputFramesToBytes(int r0, int r1) {
                int r0 = r0 * 2
                int r0 = r0 * r1
                return r0
        }

        private void writeSampleMetadata(int r12) {
                r11 = this;
                long r0 = r11.startTimeUs
                long r2 = r11.outputFrameCount
                com.google.android.exoplayer2.extractor.wav.WavFormat r4 = r11.wavFormat
                int r4 = r4.frameRateHz
                long r6 = (long) r4
                r4 = 1000000(0xf4240, double:4.940656E-318)
                long r2 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r2, r4, r6)
                long r5 = r0 + r2
                int r0 = r11.numOutputFramesToBytes(r12)
                int r1 = r11.pendingOutputBytes
                int r9 = r1 - r0
                com.google.android.exoplayer2.extractor.TrackOutput r4 = r11.trackOutput
                r7 = 1
                r10 = 0
                r8 = r0
                r4.sampleMetadata(r5, r7, r8, r9, r10)
                long r1 = r11.outputFrameCount
                long r3 = (long) r12
                long r1 = r1 + r3
                r11.outputFrameCount = r1
                int r12 = r11.pendingOutputBytes
                int r12 = r12 - r0
                r11.pendingOutputBytes = r12
                return
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void init(int r10, long r11) {
                r9 = this;
                com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r9.extractorOutput
                com.google.android.exoplayer2.extractor.wav.WavSeekMap r8 = new com.google.android.exoplayer2.extractor.wav.WavSeekMap
                com.google.android.exoplayer2.extractor.wav.WavFormat r2 = r9.wavFormat
                int r3 = r9.framesPerBlock
                long r4 = (long) r10
                r1 = r8
                r6 = r11
                r1.<init>(r2, r3, r4, r6)
                r0.seekMap(r8)
                com.google.android.exoplayer2.extractor.TrackOutput r10 = r9.trackOutput
                com.google.android.exoplayer2.Format r11 = r9.format
                r10.format(r11)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void reset(long r2) {
                r1 = this;
                r0 = 0
                r1.pendingInputBytes = r0
                r1.startTimeUs = r2
                r1.pendingOutputBytes = r0
                r2 = 0
                r1.outputFrameCount = r2
                return
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public boolean sampleData(com.google.android.exoplayer2.extractor.ExtractorInput r7, long r8) throws java.io.IOException {
                r6 = this;
                int r0 = r6.targetSampleSizeFrames
                int r1 = r6.pendingOutputBytes
                int r1 = r6.numOutputBytesToFrames(r1)
                int r0 = r0 - r1
                int r1 = r6.framesPerBlock
                int r0 = com.google.android.exoplayer2.util.Util.ceilDivide(r0, r1)
                com.google.android.exoplayer2.extractor.wav.WavFormat r1 = r6.wavFormat
                int r1 = r1.blockSize
                int r0 = r0 * r1
                r1 = 1
                r2 = 0
                int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r4 != 0) goto L1e
            L1c:
                r2 = 1
                goto L1f
            L1e:
                r2 = 0
            L1f:
                if (r2 != 0) goto L3f
                int r3 = r6.pendingInputBytes
                if (r3 >= r0) goto L3f
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r4 = (int) r3
                byte[] r3 = r6.inputData
                int r5 = r6.pendingInputBytes
                int r3 = r7.read(r3, r5, r4)
                r4 = -1
                if (r3 != r4) goto L39
                goto L1c
            L39:
                int r4 = r6.pendingInputBytes
                int r4 = r4 + r3
                r6.pendingInputBytes = r4
                goto L1f
            L3f:
                int r7 = r6.pendingInputBytes
                com.google.android.exoplayer2.extractor.wav.WavFormat r8 = r6.wavFormat
                int r8 = r8.blockSize
                int r7 = r7 / r8
                if (r7 <= 0) goto L77
                byte[] r8 = r6.inputData
                com.google.android.exoplayer2.util.ParsableByteArray r9 = r6.decodedData
                r6.decode(r8, r7, r9)
                int r8 = r6.pendingInputBytes
                com.google.android.exoplayer2.extractor.wav.WavFormat r9 = r6.wavFormat
                int r9 = r9.blockSize
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.pendingInputBytes = r8
                com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.decodedData
                int r7 = r7.limit()
                com.google.android.exoplayer2.extractor.TrackOutput r8 = r6.trackOutput
                com.google.android.exoplayer2.util.ParsableByteArray r9 = r6.decodedData
                r8.sampleData(r9, r7)
                int r8 = r6.pendingOutputBytes
                int r8 = r8 + r7
                r6.pendingOutputBytes = r8
                int r7 = r6.numOutputBytesToFrames(r8)
                int r8 = r6.targetSampleSizeFrames
                if (r7 < r8) goto L77
                r6.writeSampleMetadata(r8)
            L77:
                if (r2 == 0) goto L84
                int r7 = r6.pendingOutputBytes
                int r7 = r6.numOutputBytesToFrames(r7)
                if (r7 <= 0) goto L84
                r6.writeSampleMetadata(r7)
            L84:
                return r2
        }
    }

    public interface OutputWriter {
        void init(int r1, long r2) throws com.google.android.exoplayer2.ParserException;

        void reset(long r1);

        boolean sampleData(com.google.android.exoplayer2.extractor.ExtractorInput r1, long r2) throws java.io.IOException;
    }

    public static final class PassthroughOutputWriter implements com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter {
        private final com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
        private final com.google.android.exoplayer2.Format format;
        private long outputFrameCount;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeBytes;
        private final com.google.android.exoplayer2.extractor.TrackOutput trackOutput;
        private final com.google.android.exoplayer2.extractor.wav.WavFormat wavFormat;

        public PassthroughOutputWriter(com.google.android.exoplayer2.extractor.ExtractorOutput r2, com.google.android.exoplayer2.extractor.TrackOutput r3, com.google.android.exoplayer2.extractor.wav.WavFormat r4, java.lang.String r5, int r6) throws com.google.android.exoplayer2.ParserException {
                r1 = this;
                r1.<init>()
                r1.extractorOutput = r2
                r1.trackOutput = r3
                r1.wavFormat = r4
                int r2 = r4.numChannels
                int r3 = r4.bitsPerSample
                int r2 = r2 * r3
                int r2 = r2 / 8
                int r3 = r4.blockSize
                if (r3 != r2) goto L51
                int r3 = r4.frameRateHz
                int r0 = r3 * r2
                int r0 = r0 * 8
                int r3 = r3 * r2
                int r3 = r3 / 10
                int r2 = java.lang.Math.max(r2, r3)
                r1.targetSampleSizeBytes = r2
                com.google.android.exoplayer2.Format$Builder r3 = new com.google.android.exoplayer2.Format$Builder
                r3.<init>()
                com.google.android.exoplayer2.Format$Builder r3 = r3.setSampleMimeType(r5)
                com.google.android.exoplayer2.Format$Builder r3 = r3.setAverageBitrate(r0)
                com.google.android.exoplayer2.Format$Builder r3 = r3.setPeakBitrate(r0)
                com.google.android.exoplayer2.Format$Builder r2 = r3.setMaxInputSize(r2)
                int r3 = r4.numChannels
                com.google.android.exoplayer2.Format$Builder r2 = r2.setChannelCount(r3)
                int r3 = r4.frameRateHz
                com.google.android.exoplayer2.Format$Builder r2 = r2.setSampleRate(r3)
                com.google.android.exoplayer2.Format$Builder r2 = r2.setPcmEncoding(r6)
                com.google.android.exoplayer2.Format r2 = r2.build()
                r1.format = r2
                return
            L51:
                java.lang.String r3 = "Expected block size: "
                java.lang.String r5 = "; got: "
                java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r3, r2, r5)
                int r3 = r4.blockSize
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = 0
                com.google.android.exoplayer2.ParserException r2 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r2, r3)
                throw r2
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void init(int r10, long r11) {
                r9 = this;
                com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r9.extractorOutput
                com.google.android.exoplayer2.extractor.wav.WavSeekMap r8 = new com.google.android.exoplayer2.extractor.wav.WavSeekMap
                com.google.android.exoplayer2.extractor.wav.WavFormat r2 = r9.wavFormat
                long r4 = (long) r10
                r3 = 1
                r1 = r8
                r6 = r11
                r1.<init>(r2, r3, r4, r6)
                r0.seekMap(r8)
                com.google.android.exoplayer2.extractor.TrackOutput r10 = r9.trackOutput
                com.google.android.exoplayer2.Format r11 = r9.format
                r10.format(r11)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void reset(long r1) {
                r0 = this;
                r0.startTimeUs = r1
                r1 = 0
                r0.pendingOutputBytes = r1
                r1 = 0
                r0.outputFrameCount = r1
                return
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public boolean sampleData(com.google.android.exoplayer2.extractor.ExtractorInput r19, long r20) throws java.io.IOException {
                r18 = this;
                r0 = r18
                r1 = r20
            L4:
                r3 = 1
                r4 = 0
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 <= 0) goto L2d
                int r7 = r0.pendingOutputBytes
                int r8 = r0.targetSampleSizeBytes
                if (r7 >= r8) goto L2d
                int r8 = r8 - r7
                long r6 = (long) r8
                long r6 = java.lang.Math.min(r6, r1)
                int r7 = (int) r6
                com.google.android.exoplayer2.extractor.TrackOutput r6 = r0.trackOutput
                r8 = r19
                int r3 = r6.sampleData(r8, r7, r3)
                r6 = -1
                if (r3 != r6) goto L25
                r1 = r4
                goto L4
            L25:
                int r4 = r0.pendingOutputBytes
                int r4 = r4 + r3
                r0.pendingOutputBytes = r4
                long r3 = (long) r3
                long r1 = r1 - r3
                goto L4
            L2d:
                com.google.android.exoplayer2.extractor.wav.WavFormat r1 = r0.wavFormat
                int r2 = r1.blockSize
                int r4 = r0.pendingOutputBytes
                int r4 = r4 / r2
                if (r4 <= 0) goto L5d
                long r7 = r0.startTimeUs
                long r9 = r0.outputFrameCount
                r11 = 1000000(0xf4240, double:4.940656E-318)
                int r1 = r1.frameRateHz
                long r13 = (long) r1
                long r9 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r9, r11, r13)
                long r12 = r7 + r9
                int r15 = r4 * r2
                int r1 = r0.pendingOutputBytes
                int r1 = r1 - r15
                com.google.android.exoplayer2.extractor.TrackOutput r11 = r0.trackOutput
                r14 = 1
                r17 = 0
                r16 = r1
                r11.sampleMetadata(r12, r14, r15, r16, r17)
                long r7 = r0.outputFrameCount
                long r4 = (long) r4
                long r7 = r7 + r4
                r0.outputFrameCount = r7
                r0.pendingOutputBytes = r1
            L5d:
                if (r6 > 0) goto L60
                goto L61
            L60:
                r3 = 0
            L61:
                return r3
        }
    }

    public static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] $r8$lambda$Qwcn1NjCsgxYvA5Vzd4jHyQOX2k() {
            com.google.android.exoplayer2.extractor.Extractor[] r0 = lambda$static$0()
            return r0
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$14
            com.google.android.exoplayer2.extractor.wav.WavExtractor.FACTORY = r0
            return
    }

    public WavExtractor() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.state = r0
            r0 = -1
            r3.rf64SampleDataSize = r0
            r2 = -1
            r3.dataStartPosition = r2
            r3.dataEndPosition = r0
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void assertInitialized() {
            r1 = this;
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r1.trackOutput
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r1.extractorOutput
            com.google.android.exoplayer2.util.Util.castNonNull(r0)
            return
    }

    private static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
            r0 = 1
            com.google.android.exoplayer2.extractor.Extractor[] r0 = new com.google.android.exoplayer2.extractor.Extractor[r0]
            com.google.android.exoplayer2.extractor.wav.WavExtractor r1 = new com.google.android.exoplayer2.extractor.wav.WavExtractor
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            return r0
    }

    private void readFileType(com.google.android.exoplayer2.extractor.ExtractorInput r7) throws java.io.IOException {
            r6 = this;
            long r0 = r7.getPosition()
            r2 = 1
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            int r0 = r6.dataStartPosition
            r1 = -1
            if (r0 == r1) goto L1d
            r7.skipFully(r0)
            r7 = 4
            r6.state = r7
            return
        L1d:
            boolean r0 = com.google.android.exoplayer2.extractor.wav.WavHeaderReader.checkFileType(r7)
            if (r0 == 0) goto L33
            long r0 = r7.getPeekPosition()
            long r3 = r7.getPosition()
            long r0 = r0 - r3
            int r1 = (int) r0
            r7.skipFully(r1)
            r6.state = r2
            return
        L33:
            r7 = 0
            java.lang.String r0 = "Unsupported or unrecognized wav file type."
            com.google.android.exoplayer2.ParserException r7 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r7)
            throw r7
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "trackOutput"})
    private void readFormat(com.google.android.exoplayer2.extractor.ExtractorInput r7) throws java.io.IOException {
            r6 = this;
            com.google.android.exoplayer2.extractor.wav.WavFormat r3 = com.google.android.exoplayer2.extractor.wav.WavHeaderReader.readFormat(r7)
            int r7 = r3.formatType
            r0 = 17
            if (r7 != r0) goto L16
            com.google.android.exoplayer2.extractor.wav.WavExtractor$ImaAdPcmOutputWriter r7 = new com.google.android.exoplayer2.extractor.wav.WavExtractor$ImaAdPcmOutputWriter
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r6.extractorOutput
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r6.trackOutput
            r7.<init>(r0, r1, r3)
            r6.outputWriter = r7
            goto L52
        L16:
            r0 = 6
            if (r7 != r0) goto L29
            com.google.android.exoplayer2.extractor.wav.WavExtractor$PassthroughOutputWriter r7 = new com.google.android.exoplayer2.extractor.wav.WavExtractor$PassthroughOutputWriter
            com.google.android.exoplayer2.extractor.ExtractorOutput r1 = r6.extractorOutput
            com.google.android.exoplayer2.extractor.TrackOutput r2 = r6.trackOutput
            r5 = -1
            java.lang.String r4 = "audio/g711-alaw"
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.outputWriter = r7
            goto L52
        L29:
            r0 = 7
            if (r7 != r0) goto L3c
            com.google.android.exoplayer2.extractor.wav.WavExtractor$PassthroughOutputWriter r7 = new com.google.android.exoplayer2.extractor.wav.WavExtractor$PassthroughOutputWriter
            com.google.android.exoplayer2.extractor.ExtractorOutput r1 = r6.extractorOutput
            com.google.android.exoplayer2.extractor.TrackOutput r2 = r6.trackOutput
            r5 = -1
            java.lang.String r4 = "audio/g711-mlaw"
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.outputWriter = r7
            goto L52
        L3c:
            int r0 = r3.bitsPerSample
            int r5 = com.google.android.exoplayer2.audio.WavUtil.getPcmEncodingForType(r7, r0)
            if (r5 == 0) goto L56
            com.google.android.exoplayer2.extractor.wav.WavExtractor$PassthroughOutputWriter r7 = new com.google.android.exoplayer2.extractor.wav.WavExtractor$PassthroughOutputWriter
            com.google.android.exoplayer2.extractor.ExtractorOutput r1 = r6.extractorOutput
            com.google.android.exoplayer2.extractor.TrackOutput r2 = r6.trackOutput
            java.lang.String r4 = "audio/raw"
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.outputWriter = r7
        L52:
            r7 = 3
            r6.state = r7
            return
        L56:
            java.lang.String r7 = "Unsupported WAV format type: "
            java.lang.StringBuilder r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7)
            int r0 = r3.formatType
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.google.android.exoplayer2.ParserException r7 = com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature(r7)
            throw r7
    }

    private void readRf64SampleDataSize(com.google.android.exoplayer2.extractor.ExtractorInput r3) throws java.io.IOException {
            r2 = this;
            long r0 = com.google.android.exoplayer2.extractor.wav.WavHeaderReader.readRf64SampleDataSize(r3)
            r2.rf64SampleDataSize = r0
            r3 = 2
            r2.state = r3
            return
    }

    private int readSampleData(com.google.android.exoplayer2.extractor.ExtractorInput r7) throws java.io.IOException {
            r6 = this;
            long r0 = r6.dataEndPosition
            r2 = 0
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            long r0 = r6.dataEndPosition
            long r3 = r7.getPosition()
            long r0 = r0 - r3
            com.google.android.exoplayer2.extractor.wav.WavExtractor$OutputWriter r3 = r6.outputWriter
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.extractor.wav.WavExtractor$OutputWriter r3 = (com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter) r3
            boolean r7 = r3.sampleData(r7, r0)
            if (r7 == 0) goto L25
            r2 = -1
        L25:
            return r2
    }

    private void skipToSampleData(com.google.android.exoplayer2.extractor.ExtractorInput r10) throws java.io.IOException {
            r9 = this;
            android.util.Pair r0 = com.google.android.exoplayer2.extractor.wav.WavHeaderReader.skipToSampleData(r10)
            java.lang.Object r1 = r0.first
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            r9.dataStartPosition = r1
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r2 = r9.rf64SampleDataSize
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L28
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 != 0) goto L28
            r0 = r2
        L28:
            int r2 = r9.dataStartPosition
            long r2 = (long) r2
            long r2 = r2 + r0
            r9.dataEndPosition = r2
            long r0 = r10.getLength()
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 == 0) goto L5a
            long r2 = r9.dataEndPosition
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L5a
            java.lang.String r10 = "Data exceeds input length: "
            java.lang.StringBuilder r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r10)
            long r2 = r9.dataEndPosition
            r10.append(r2)
            java.lang.String r2 = ", "
            r10.append(r2)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r2 = "WavExtractor"
            com.google.android.exoplayer2.util.Log.w(r2, r10)
            r9.dataEndPosition = r0
        L5a:
            com.google.android.exoplayer2.extractor.wav.WavExtractor$OutputWriter r10 = r9.outputWriter
            java.lang.Object r10 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r10)
            com.google.android.exoplayer2.extractor.wav.WavExtractor$OutputWriter r10 = (com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter) r10
            int r0 = r9.dataStartPosition
            long r1 = r9.dataEndPosition
            r10.init(r0, r1)
            r10 = 4
            r9.state = r10
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r3) {
            r2 = this;
            r2.extractorOutput = r3
            r0 = 0
            r1 = 1
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r3.track(r0, r1)
            r2.trackOutput = r0
            r3.endTracks()
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r3, com.google.android.exoplayer2.extractor.PositionHolder r4) throws java.io.IOException {
            r2 = this;
            r2.assertInitialized()
            int r4 = r2.state
            r0 = 0
            if (r4 == 0) goto L2b
            r1 = 1
            if (r4 == r1) goto L27
            r1 = 2
            if (r4 == r1) goto L23
            r1 = 3
            if (r4 == r1) goto L1f
            r0 = 4
            if (r4 != r0) goto L19
            int r3 = r2.readSampleData(r3)
            return r3
        L19:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L1f:
            r2.skipToSampleData(r3)
            return r0
        L23:
            r2.readFormat(r3)
            return r0
        L27:
            r2.readRf64SampleDataSize(r3)
            return r0
        L2b:
            r2.readFileType(r3)
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long r4, long r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L8
            r4 = 0
            goto L9
        L8:
            r4 = 4
        L9:
            r3.state = r4
            com.google.android.exoplayer2.extractor.wav.WavExtractor$OutputWriter r4 = r3.outputWriter
            if (r4 == 0) goto L12
            r4.reset(r6)
        L12:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r1) throws java.io.IOException {
            r0 = this;
            boolean r1 = com.google.android.exoplayer2.extractor.wav.WavHeaderReader.checkFileType(r1)
            return r1
    }
}
