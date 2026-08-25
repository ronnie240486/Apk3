package com.google.android.exoplayer2.source.mediaparser;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(30)
@android.annotation.SuppressLint({"Override"})
public final class OutputConsumerAdapterV30 implements android.media.MediaParser.OutputConsumer {
    private static final java.lang.String MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS = "chunk-index-long-us-durations";
    private static final java.lang.String MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS = "chunk-index-long-offsets";
    private static final java.lang.String MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES = "chunk-index-int-sizes";
    private static final java.lang.String MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES = "chunk-index-long-us-times";
    private static final java.lang.String MEDIA_FORMAT_KEY_TRACK_TYPE = "track-type-string";
    private static final java.util.regex.Pattern REGEX_CRYPTO_INFO_PATTERN = null;
    private static final android.util.Pair<android.media.MediaParser.SeekPoint, android.media.MediaParser.SeekPoint> SEEK_POINT_PAIR_START = null;
    private static final java.lang.String TAG = "OConsumerAdapterV30";

    @androidx.annotation.Nullable
    private java.lang.String containerMimeType;

    @androidx.annotation.Nullable
    private android.media.MediaParser.SeekMap dummySeekMap;
    private final boolean expectDummySeekMap;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.ChunkIndex lastChunkIndex;
    private final java.util.ArrayList<com.google.android.exoplayer2.extractor.TrackOutput.CryptoData> lastOutputCryptoDatas;
    private final java.util.ArrayList<android.media.MediaCodec.CryptoInfo> lastReceivedCryptoInfos;

    @androidx.annotation.Nullable
    private android.media.MediaParser.SeekMap lastSeekMap;
    private java.util.List<com.google.android.exoplayer2.Format> muxedCaptionFormats;
    private int primaryTrackIndex;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private long sampleTimestampUpperLimitFilterUs;
    private final com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30.DataReaderAdapter scratchDataReaderAdapter;
    private boolean seekingDisabled;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster;
    private final java.util.ArrayList<com.google.android.exoplayer2.Format> trackFormats;
    private final java.util.ArrayList<com.google.android.exoplayer2.extractor.TrackOutput> trackOutputs;
    private boolean tracksEnded;
    private boolean tracksFoundCalled;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class DataReaderAdapter implements com.google.android.exoplayer2.upstream.DataReader {

        @androidx.annotation.Nullable
        public android.media.MediaParser.InputReader input;

        private DataReaderAdapter() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ DataReaderAdapter(com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
        public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                android.media.MediaParser$InputReader r0 = r1.input
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                android.media.MediaParser$InputReader r0 = (android.media.MediaParser.InputReader) r0
                int r2 = r0.read(r2, r3, r4)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class SeekMapAdapter implements com.google.android.exoplayer2.extractor.SeekMap {
        private final android.media.MediaParser.SeekMap adaptedSeekMap;

        public SeekMapAdapter(android.media.MediaParser.SeekMap r1) {
                r0 = this;
                r0.<init>()
                r0.adaptedSeekMap = r1
                return
        }

        private static com.google.android.exoplayer2.extractor.SeekPoint asExoPlayerSeekPoint(android.media.MediaParser.SeekPoint r5) {
                com.google.android.exoplayer2.extractor.SeekPoint r0 = new com.google.android.exoplayer2.extractor.SeekPoint
                long r1 = r5.timeMicros
                long r3 = r5.position
                r0.<init>(r1, r3)
                return r0
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
                r5 = this;
                android.media.MediaParser$SeekMap r0 = r5.adaptedSeekMap
                long r0 = r0.getDurationMicros()
                r2 = -2147483648(0xffffffff80000000, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto Le
                goto L13
            Le:
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            L13:
                return r0
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long r2) {
                r1 = this;
                android.media.MediaParser$SeekMap r0 = r1.adaptedSeekMap
                android.util.Pair r2 = r0.getSeekPoints(r2)
                java.lang.Object r3 = r2.first
                java.lang.Object r0 = r2.second
                if (r3 != r0) goto L18
                com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r2 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
                android.media.MediaParser$SeekPoint r3 = (android.media.MediaParser.SeekPoint) r3
                com.google.android.exoplayer2.extractor.SeekPoint r3 = asExoPlayerSeekPoint(r3)
                r2.<init>(r3)
                goto L2c
            L18:
                com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r0 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
                android.media.MediaParser$SeekPoint r3 = (android.media.MediaParser.SeekPoint) r3
                com.google.android.exoplayer2.extractor.SeekPoint r3 = asExoPlayerSeekPoint(r3)
                java.lang.Object r2 = r2.second
                android.media.MediaParser$SeekPoint r2 = (android.media.MediaParser.SeekPoint) r2
                com.google.android.exoplayer2.extractor.SeekPoint r2 = asExoPlayerSeekPoint(r2)
                r0.<init>(r3, r2)
                r2 = r0
            L2c:
                return r2
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
                r1 = this;
                android.media.MediaParser$SeekMap r0 = r1.adaptedSeekMap
                boolean r0 = r0.isSeekable()
                return r0
        }
    }

    static {
            android.media.MediaParser$SeekPoint r0 = android.media.MediaParser.SeekPoint.START
            android.util.Pair r0 = android.util.Pair.create(r0, r0)
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30.SEEK_POINT_PAIR_START = r0
            java.lang.String r0 = "pattern \\(encrypt: (\\d+), skip: (\\d+)\\)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30.REGEX_CRYPTO_INFO_PATTERN = r0
            return
    }

    public OutputConsumerAdapterV30() {
            r3 = this;
            r0 = 0
            r1 = -2
            r2 = 0
            r3.<init>(r0, r1, r2)
            return
    }

    public OutputConsumerAdapterV30(@androidx.annotation.Nullable com.google.android.exoplayer2.Format r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.expectDummySeekMap = r3
            r0.primaryTrackManifestFormat = r1
            r0.primaryTrackType = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.trackOutputs = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.trackFormats = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.lastReceivedCryptoInfos = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.lastOutputCryptoDatas = r1
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30$DataReaderAdapter r1 = new com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30$DataReaderAdapter
            r2 = 0
            r1.<init>(r2)
            r0.scratchDataReaderAdapter = r1
            com.google.android.exoplayer2.extractor.DummyExtractorOutput r1 = new com.google.android.exoplayer2.extractor.DummyExtractorOutput
            r1.<init>()
            r0.extractorOutput = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.sampleTimestampUpperLimitFilterUs = r1
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            r0.muxedCaptionFormats = r1
            return
    }

    private void ensureSpaceForTrackIndex(int r4) {
            r3 = this;
            java.util.ArrayList<com.google.android.exoplayer2.extractor.TrackOutput> r0 = r3.trackOutputs
            int r0 = r0.size()
        L6:
            if (r0 > r4) goto L20
            java.util.ArrayList<com.google.android.exoplayer2.extractor.TrackOutput> r1 = r3.trackOutputs
            r2 = 0
            r1.add(r2)
            java.util.ArrayList<com.google.android.exoplayer2.Format> r1 = r3.trackFormats
            r1.add(r2)
            java.util.ArrayList<android.media.MediaCodec$CryptoInfo> r1 = r3.lastReceivedCryptoInfos
            r1.add(r2)
            java.util.ArrayList<com.google.android.exoplayer2.extractor.TrackOutput$CryptoData> r1 = r3.lastOutputCryptoDatas
            r1.add(r2)
            int r0 = r0 + 1
            goto L6
        L20:
            return
    }

    private static int getFlag(android.media.MediaFormat r1, java.lang.String r2, int r3) {
            r0 = 0
            int r1 = r1.getInteger(r2, r0)
            if (r1 == 0) goto L8
            goto L9
        L8:
            r3 = 0
        L9:
            return r3
    }

    private static java.util.List<byte[]> getInitializationData(android.media.MediaFormat r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            java.lang.String r2 = "csd-"
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            int r3 = r1 + 1
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.nio.ByteBuffer r1 = r4.getByteBuffer(r1)
            if (r1 != 0) goto L1c
            return r0
        L1c:
            byte[] r1 = com.google.android.exoplayer2.util.MediaFormatUtil.getArray(r1)
            r0.add(r1)
            r1 = r3
            goto L6
    }

    private static java.lang.String getMimeType(java.lang.String r2) {
            java.util.Objects.requireNonNull(r2)
            r2.hashCode()
            r0 = -1
            int r1 = r2.hashCode()
            switch(r1) {
                case -2063506020: goto Lb1;
                case -1870824006: goto La6;
                case -1566427438: goto L9b;
                case -900207883: goto L90;
                case -589864617: goto L85;
                case 52265814: goto L7a;
                case 116768877: goto L6f;
                case 376876796: goto L64;
                case 703268017: goto L56;
                case 768643067: goto L48;
                case 965962719: goto L3a;
                case 1264380477: goto L2c;
                case 1343957595: goto L1e;
                case 2063134683: goto L10;
                default: goto Le;
            }
        Le:
            goto Lbb
        L10:
            java.lang.String r1 = "android.media.mediaparser.FlvParser"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1a
            goto Lbb
        L1a:
            r0 = 13
            goto Lbb
        L1e:
            java.lang.String r1 = "android.media.mediaparser.Mp3Parser"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L28
            goto Lbb
        L28:
            r0 = 12
            goto Lbb
        L2c:
            java.lang.String r1 = "android.media.mediaparser.Ac4Parser"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L36
            goto Lbb
        L36:
            r0 = 11
            goto Lbb
        L3a:
            java.lang.String r1 = "android.media.mediaparser.MatroskaParser"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L44
            goto Lbb
        L44:
            r0 = 10
            goto Lbb
        L48:
            java.lang.String r1 = "android.media.mediaparser.FlacParser"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L52
            goto Lbb
        L52:
            r0 = 9
            goto Lbb
        L56:
            java.lang.String r1 = "android.media.mediaparser.AmrParser"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L60
            goto Lbb
        L60:
            r0 = 8
            goto Lbb
        L64:
            java.lang.String r1 = "android.media.mediaparser.Ac3Parser"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L6d
            goto Lbb
        L6d:
            r0 = 7
            goto Lbb
        L6f:
            java.lang.String r1 = "android.media.mediaparser.FragmentedMp4Parser"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L78
            goto Lbb
        L78:
            r0 = 6
            goto Lbb
        L7a:
            java.lang.String r1 = "android.media.mediaparser.PsParser"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L83
            goto Lbb
        L83:
            r0 = 5
            goto Lbb
        L85:
            java.lang.String r1 = "android.media.mediaparser.WavParser"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L8e
            goto Lbb
        L8e:
            r0 = 4
            goto Lbb
        L90:
            java.lang.String r1 = "android.media.mediaparser.AdtsParser"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L99
            goto Lbb
        L99:
            r0 = 3
            goto Lbb
        L9b:
            java.lang.String r1 = "android.media.mediaparser.TsParser"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto La4
            goto Lbb
        La4:
            r0 = 2
            goto Lbb
        La6:
            java.lang.String r1 = "android.media.mediaparser.OggParser"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto Laf
            goto Lbb
        Laf:
            r0 = 1
            goto Lbb
        Lb1:
            java.lang.String r1 = "android.media.mediaparser.Mp4Parser"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto Lba
            goto Lbb
        Lba:
            r0 = 0
        Lbb:
            switch(r0) {
                case 0: goto Lf2;
                case 1: goto Lef;
                case 2: goto Leb;
                case 3: goto Le8;
                case 4: goto Le5;
                case 5: goto Le1;
                case 6: goto Lf2;
                case 7: goto Lde;
                case 8: goto Ldb;
                case 9: goto Ld8;
                case 10: goto Ld4;
                case 11: goto Ld1;
                case 12: goto Lce;
                case 13: goto Lca;
                default: goto Lbe;
            }
        Lbe:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Illegal parser name: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2)
            r0.<init>(r2)
            throw r0
        Lca:
            java.lang.String r2 = "video/x-flv"
            return r2
        Lce:
            java.lang.String r2 = "audio/mpeg"
            return r2
        Ld1:
            java.lang.String r2 = "audio/ac4"
            return r2
        Ld4:
            java.lang.String r2 = "video/webm"
            return r2
        Ld8:
            java.lang.String r2 = "audio/flac"
            return r2
        Ldb:
            java.lang.String r2 = "audio/amr"
            return r2
        Lde:
            java.lang.String r2 = "audio/ac3"
            return r2
        Le1:
            java.lang.String r2 = "video/mp2p"
            return r2
        Le5:
            java.lang.String r2 = "audio/raw"
            return r2
        Le8:
            java.lang.String r2 = "audio/mp4a-latm"
            return r2
        Leb:
            java.lang.String r2 = "video/mp2t"
            return r2
        Lef:
            java.lang.String r2 = "audio/ogg"
            return r2
        Lf2:
            java.lang.String r2 = "video/mp4"
            return r2
    }

    private static int getSelectionFlags(android.media.MediaFormat r3) {
            java.lang.String r0 = "is-autoselect"
            r1 = 4
            int r0 = getFlag(r3, r0, r1)
            r0 = r0 | 0
            java.lang.String r1 = "is-default"
            r2 = 1
            int r1 = getFlag(r3, r1, r2)
            r0 = r0 | r1
            java.lang.String r1 = "is-forced-subtitle"
            r2 = 2
            int r3 = getFlag(r3, r1, r2)
            r3 = r3 | r0
            return r3
    }

    private void maybeEndTracks() {
            r3 = this;
            boolean r0 = r3.tracksFoundCalled
            if (r0 == 0) goto L26
            boolean r0 = r3.tracksEnded
            if (r0 == 0) goto L9
            goto L26
        L9:
            java.util.ArrayList<com.google.android.exoplayer2.extractor.TrackOutput> r0 = r3.trackOutputs
            int r0 = r0.size()
            r1 = 0
        L10:
            if (r1 >= r0) goto L1e
            java.util.ArrayList<com.google.android.exoplayer2.extractor.TrackOutput> r2 = r3.trackOutputs
            java.lang.Object r2 = r2.get(r1)
            if (r2 != 0) goto L1b
            return
        L1b:
            int r1 = r1 + 1
            goto L10
        L1e:
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r3.extractorOutput
            r0.endTracks()
            r0 = 1
            r3.tracksEnded = r0
        L26:
            return
    }

    private boolean maybeObtainChunkIndex(android.media.MediaFormat r8) {
            r7 = this;
            java.lang.String r0 = "chunk-index-int-sizes"
            java.nio.ByteBuffer r0 = r8.getByteBuffer(r0)
            if (r0 != 0) goto La
            r8 = 0
            return r8
        La:
            java.nio.IntBuffer r0 = r0.asIntBuffer()
            java.lang.String r1 = "chunk-index-long-offsets"
            java.nio.ByteBuffer r1 = r8.getByteBuffer(r1)
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            java.nio.LongBuffer r1 = r1.asLongBuffer()
            java.lang.String r2 = "chunk-index-long-us-durations"
            java.nio.ByteBuffer r2 = r8.getByteBuffer(r2)
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            java.nio.LongBuffer r2 = r2.asLongBuffer()
            java.lang.String r3 = "chunk-index-long-us-times"
            java.nio.ByteBuffer r8 = r8.getByteBuffer(r3)
            java.lang.Object r8 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            java.nio.LongBuffer r8 = r8.asLongBuffer()
            int r3 = r0.remaining()
            int[] r3 = new int[r3]
            int r4 = r1.remaining()
            long[] r4 = new long[r4]
            int r5 = r2.remaining()
            long[] r5 = new long[r5]
            int r6 = r8.remaining()
            long[] r6 = new long[r6]
            r0.get(r3)
            r1.get(r4)
            r2.get(r5)
            r8.get(r6)
            com.google.android.exoplayer2.extractor.ChunkIndex r8 = new com.google.android.exoplayer2.extractor.ChunkIndex
            r8.<init>(r3, r4, r5, r6)
            r7.lastChunkIndex = r8
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r7.extractorOutput
            r0.seekMap(r8)
            r8 = 1
            return r8
    }

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.TrackOutput.CryptoData toExoPlayerCryptoData(int r6, @androidx.annotation.Nullable android.media.MediaCodec.CryptoInfo r7) {
            r5 = this;
            if (r7 != 0) goto L4
            r6 = 0
            return r6
        L4:
            java.util.ArrayList<android.media.MediaCodec$CryptoInfo> r0 = r5.lastReceivedCryptoInfos
            java.lang.Object r0 = r0.get(r6)
            android.media.MediaCodec$CryptoInfo r0 = (android.media.MediaCodec.CryptoInfo) r0
            if (r0 != r7) goto L1d
            java.util.ArrayList<com.google.android.exoplayer2.extractor.TrackOutput$CryptoData> r7 = r5.lastOutputCryptoDatas
            java.lang.Object r6 = r7.get(r6)
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r6 = (com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) r6
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r6 = (com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) r6
            goto L78
        L1d:
            r0 = 0
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30.REGEX_CRYPTO_INFO_PATTERN     // Catch: java.lang.RuntimeException -> L4c
            java.lang.String r2 = r7.toString()     // Catch: java.lang.RuntimeException -> L4c
            java.util.regex.Matcher r1 = r1.matcher(r2)     // Catch: java.lang.RuntimeException -> L4c
            r1.find()     // Catch: java.lang.RuntimeException -> L4c
            r2 = 1
            java.lang.String r2 = r1.group(r2)     // Catch: java.lang.RuntimeException -> L4c
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)     // Catch: java.lang.RuntimeException -> L4c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.RuntimeException -> L4c
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.RuntimeException -> L4c
            r3 = 2
            java.lang.String r1 = r1.group(r3)     // Catch: java.lang.RuntimeException -> L4c
            java.lang.Object r1 = com.google.android.exoplayer2.util.Util.castNonNull(r1)     // Catch: java.lang.RuntimeException -> L4c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.RuntimeException -> L4c
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.RuntimeException -> L4c
            r1 = r0
            r0 = r2
            goto L64
        L4c:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected error while parsing CryptoInfo: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "OConsumerAdapterV30"
            com.google.android.exoplayer2.util.Log.e(r3, r2, r1)
            r1 = 0
        L64:
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r2 = new com.google.android.exoplayer2.extractor.TrackOutput$CryptoData
            int r3 = r7.mode
            byte[] r4 = r7.key
            r2.<init>(r3, r4, r0, r1)
            java.util.ArrayList<android.media.MediaCodec$CryptoInfo> r0 = r5.lastReceivedCryptoInfos
            r0.set(r6, r7)
            java.util.ArrayList<com.google.android.exoplayer2.extractor.TrackOutput$CryptoData> r7 = r5.lastOutputCryptoDatas
            r7.set(r6, r2)
            r6 = r2
        L78:
            return r6
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.drm.DrmInitData toExoPlayerDrmInitData(@androidx.annotation.Nullable java.lang.String r7, @androidx.annotation.Nullable android.media.DrmInitData r8) {
            if (r8 != 0) goto L4
            r7 = 0
            return r7
        L4:
            int r0 = r8.getSchemeInitDataCount()
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r1 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L21
            android.media.DrmInitData$SchemeInitData r3 = r8.getSchemeInitDataAt(r2)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r4 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            java.util.UUID r5 = r3.uuid
            java.lang.String r6 = r3.mimeType
            byte[] r3 = r3.data
            r4.<init>(r5, r6, r3)
            r1[r2] = r4
            int r2 = r2 + 1
            goto Lb
        L21:
            com.google.android.exoplayer2.drm.DrmInitData r8 = new com.google.android.exoplayer2.drm.DrmInitData
            r8.<init>(r7, r1)
            return r8
    }

    private com.google.android.exoplayer2.Format toExoPlayerFormat(android.media.MediaParser.TrackData r9) {
            r8 = this;
            android.media.MediaFormat r0 = r9.mediaFormat
            java.lang.String r1 = "mime"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "caption-service-number"
            r3 = -1
            int r2 = r0.getInteger(r2, r3)
            com.google.android.exoplayer2.Format$Builder r4 = new com.google.android.exoplayer2.Format$Builder
            r4.<init>()
            java.lang.String r5 = "crypto-mode-fourcc"
            java.lang.String r5 = r0.getString(r5)
            android.media.DrmInitData r9 = r9.drmInitData
            com.google.android.exoplayer2.drm.DrmInitData r9 = toExoPlayerDrmInitData(r5, r9)
            com.google.android.exoplayer2.Format$Builder r9 = r4.setDrmInitData(r9)
            java.lang.String r4 = r8.containerMimeType
            com.google.android.exoplayer2.Format$Builder r9 = r9.setContainerMimeType(r4)
            java.lang.String r4 = "bitrate"
            int r4 = r0.getInteger(r4, r3)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setPeakBitrate(r4)
            java.lang.String r4 = "channel-count"
            int r4 = r0.getInteger(r4, r3)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setChannelCount(r4)
            com.google.android.exoplayer2.video.ColorInfo r4 = com.google.android.exoplayer2.util.MediaFormatUtil.getColorInfo(r0)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setColorInfo(r4)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setSampleMimeType(r1)
            java.lang.String r4 = "codecs-string"
            java.lang.String r4 = r0.getString(r4)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setCodecs(r4)
            java.lang.String r4 = "frame-rate"
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r0.getFloat(r4, r5)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setFrameRate(r4)
            java.lang.String r4 = "width"
            int r4 = r0.getInteger(r4, r3)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setWidth(r4)
            java.lang.String r4 = "height"
            int r4 = r0.getInteger(r4, r3)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setHeight(r4)
            java.util.List r4 = getInitializationData(r0)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setInitializationData(r4)
            java.lang.String r4 = "language"
            java.lang.String r4 = r0.getString(r4)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setLanguage(r4)
            java.lang.String r4 = "max-input-size"
            int r4 = r0.getInteger(r4, r3)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setMaxInputSize(r4)
            java.lang.String r4 = "exo-pcm-encoding"
            int r4 = r0.getInteger(r4, r3)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setPcmEncoding(r4)
            java.lang.String r4 = "rotation-degrees"
            r5 = 0
            int r4 = r0.getInteger(r4, r5)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setRotationDegrees(r4)
            java.lang.String r4 = "sample-rate"
            int r3 = r0.getInteger(r4, r3)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setSampleRate(r3)
            int r3 = getSelectionFlags(r0)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setSelectionFlags(r3)
            java.lang.String r3 = "encoder-delay"
            int r3 = r0.getInteger(r3, r5)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setEncoderDelay(r3)
            java.lang.String r3 = "encoder-padding"
            int r3 = r0.getInteger(r3, r5)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setEncoderPadding(r3)
            java.lang.String r3 = "pixel-width-height-ratio-float"
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r0.getFloat(r3, r4)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setPixelWidthHeightRatio(r3)
            java.lang.String r3 = "subsample-offset-us-long"
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r3 = r0.getLong(r3, r6)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setSubsampleOffsetUs(r3)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setAccessibilityChannel(r2)
        Lee:
            java.util.List<com.google.android.exoplayer2.Format> r0 = r8.muxedCaptionFormats
            int r0 = r0.size()
            if (r5 >= r0) goto L12b
            java.util.List<com.google.android.exoplayer2.Format> r0 = r8.muxedCaptionFormats
            java.lang.Object r0 = r0.get(r5)
            com.google.android.exoplayer2.Format r0 = (com.google.android.exoplayer2.Format) r0
            java.lang.String r3 = r0.sampleMimeType
            boolean r3 = com.google.android.exoplayer2.util.Util.areEqual(r3, r1)
            if (r3 == 0) goto L128
            int r3 = r0.accessibilityChannel
            if (r3 != r2) goto L128
            java.lang.String r1 = r0.language
            com.google.android.exoplayer2.Format$Builder r1 = r9.setLanguage(r1)
            int r2 = r0.roleFlags
            com.google.android.exoplayer2.Format$Builder r1 = r1.setRoleFlags(r2)
            int r2 = r0.selectionFlags
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSelectionFlags(r2)
            java.lang.String r2 = r0.label
            com.google.android.exoplayer2.Format$Builder r1 = r1.setLabel(r2)
            com.google.android.exoplayer2.metadata.Metadata r0 = r0.metadata
            r1.setMetadata(r0)
            goto L12b
        L128:
            int r5 = r5 + 1
            goto Lee
        L12b:
            com.google.android.exoplayer2.Format r9 = r9.build()
            return r9
    }

    private static int toTrackTypeConstant(@androidx.annotation.Nullable java.lang.String r5) {
            r0 = -1
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case -450004177: goto L3f;
                case -284840886: goto L33;
                case 3556653: goto L27;
                case 93166550: goto L1c;
                case 112202875: goto L10;
                default: goto Le;
            }
        Le:
            r1 = -1
            goto L49
        L10:
            java.lang.String r1 = "video"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L1a
            goto Le
        L1a:
            r1 = 4
            goto L49
        L1c:
            java.lang.String r1 = "audio"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L25
            goto Le
        L25:
            r1 = 3
            goto L49
        L27:
            java.lang.String r1 = "text"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L31
            goto Le
        L31:
            r1 = 2
            goto L49
        L33:
            java.lang.String r1 = "unknown"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L3d
            goto Le
        L3d:
            r1 = 1
            goto L49
        L3f:
            java.lang.String r1 = "metadata"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L48
            goto Le
        L48:
            r1 = 0
        L49:
            switch(r1) {
                case 0: goto L55;
                case 1: goto L54;
                case 2: goto L53;
                case 3: goto L52;
                case 4: goto L51;
                default: goto L4c;
            }
        L4c:
            int r5 = com.google.android.exoplayer2.util.MimeTypes.getTrackType(r5)
            return r5
        L51:
            return r3
        L52:
            return r4
        L53:
            return r2
        L54:
            return r0
        L55:
            r5 = 5
            return r5
    }

    public void disableSeeking() {
            r1 = this;
            r0 = 1
            r1.seekingDisabled = r0
            return
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.extractor.ChunkIndex getChunkIndex() {
            r1 = this;
            com.google.android.exoplayer2.extractor.ChunkIndex r0 = r1.lastChunkIndex
            return r0
    }

    @androidx.annotation.Nullable
    public android.media.MediaParser.SeekMap getDummySeekMap() {
            r1 = this;
            android.media.MediaParser$SeekMap r0 = r1.dummySeekMap
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.Format[] getSampleFormats() {
            r3 = this;
            boolean r0 = r3.tracksFoundCalled
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.ArrayList<com.google.android.exoplayer2.Format> r0 = r3.trackFormats
            int r0 = r0.size()
            com.google.android.exoplayer2.Format[] r0 = new com.google.android.exoplayer2.Format[r0]
            r1 = 0
        Lf:
            java.util.ArrayList<com.google.android.exoplayer2.Format> r2 = r3.trackFormats
            int r2 = r2.size()
            if (r1 >= r2) goto L2a
            java.util.ArrayList<com.google.android.exoplayer2.Format> r2 = r3.trackFormats
            java.lang.Object r2 = r2.get(r1)
            com.google.android.exoplayer2.Format r2 = (com.google.android.exoplayer2.Format) r2
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.Format r2 = (com.google.android.exoplayer2.Format) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lf
        L2a:
            return r0
    }

    public android.util.Pair<android.media.MediaParser.SeekPoint, android.media.MediaParser.SeekPoint> getSeekPoints(long r2) {
            r1 = this;
            android.media.MediaParser$SeekMap r0 = r1.lastSeekMap
            if (r0 == 0) goto L9
            android.util.Pair r2 = r0.getSeekPoints(r2)
            goto Lb
        L9:
            android.util.Pair<android.media.MediaParser$SeekPoint, android.media.MediaParser$SeekPoint> r2 = com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30.SEEK_POINT_PAIR_START
        Lb:
            return r2
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSampleCompleted(int r8, long r9, int r11, int r12, int r13, @androidx.annotation.Nullable android.media.MediaCodec.CryptoInfo r14) {
            r7 = this;
            long r0 = r7.sampleTimestampUpperLimitFilterUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L10
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L10
            return
        L10:
            com.google.android.exoplayer2.util.TimestampAdjuster r0 = r7.timestampAdjuster
            if (r0 == 0) goto L18
            long r9 = r0.adjustSampleTimestamp(r9)
        L18:
            r1 = r9
            java.util.ArrayList<com.google.android.exoplayer2.extractor.TrackOutput> r9 = r7.trackOutputs
            java.lang.Object r9 = r9.get(r8)
            com.google.android.exoplayer2.extractor.TrackOutput r9 = (com.google.android.exoplayer2.extractor.TrackOutput) r9
            java.lang.Object r9 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)
            r0 = r9
            com.google.android.exoplayer2.extractor.TrackOutput r0 = (com.google.android.exoplayer2.extractor.TrackOutput) r0
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r6 = r7.toExoPlayerCryptoData(r8, r14)
            r3 = r11
            r4 = r12
            r5 = r13
            r0.sampleMetadata(r1, r3, r4, r5, r6)
            return
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSampleDataFound(int r4, android.media.MediaParser.InputReader r5) throws java.io.IOException {
            r3 = this;
            r3.ensureSpaceForTrackIndex(r4)
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30$DataReaderAdapter r0 = r3.scratchDataReaderAdapter
            r0.input = r5
            java.util.ArrayList<com.google.android.exoplayer2.extractor.TrackOutput> r0 = r3.trackOutputs
            java.lang.Object r0 = r0.get(r4)
            com.google.android.exoplayer2.extractor.TrackOutput r0 = (com.google.android.exoplayer2.extractor.TrackOutput) r0
            if (r0 != 0) goto L1d
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r3.extractorOutput
            r1 = -1
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r0.track(r4, r1)
            java.util.ArrayList<com.google.android.exoplayer2.extractor.TrackOutput> r1 = r3.trackOutputs
            r1.set(r4, r0)
        L1d:
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30$DataReaderAdapter r4 = r3.scratchDataReaderAdapter
            long r1 = r5.getLength()
            int r5 = (int) r1
            r1 = 1
            r0.sampleData(r4, r5, r1)
            return
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSeekMapFound(android.media.MediaParser.SeekMap r7) {
            r6 = this;
            boolean r0 = r6.expectDummySeekMap
            if (r0 == 0) goto Lb
            android.media.MediaParser$SeekMap r0 = r6.dummySeekMap
            if (r0 != 0) goto Lb
            r6.dummySeekMap = r7
            goto L33
        Lb:
            r6.lastSeekMap = r7
            long r0 = r7.getDurationMicros()
            com.google.android.exoplayer2.extractor.ExtractorOutput r2 = r6.extractorOutput
            boolean r3 = r6.seekingDisabled
            if (r3 == 0) goto L2a
            com.google.android.exoplayer2.extractor.SeekMap$Unseekable r7 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
            r3 = -2147483648(0xffffffff80000000, double:NaN)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L21
            goto L26
        L21:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L26:
            r7.<init>(r0)
            goto L30
        L2a:
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30$SeekMapAdapter r0 = new com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30$SeekMapAdapter
            r0.<init>(r7)
            r7 = r0
        L30:
            r2.seekMap(r7)
        L33:
            return
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onTrackCountFound(int r1) {
            r0 = this;
            r1 = 1
            r0.tracksFoundCalled = r1
            r0.maybeEndTracks()
            return
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onTrackDataFound(int r4, android.media.MediaParser.TrackData r5) {
            r3 = this;
            android.media.MediaFormat r0 = r5.mediaFormat
            boolean r0 = r3.maybeObtainChunkIndex(r0)
            if (r0 == 0) goto L9
            return
        L9:
            r3.ensureSpaceForTrackIndex(r4)
            java.util.ArrayList<com.google.android.exoplayer2.extractor.TrackOutput> r0 = r3.trackOutputs
            java.lang.Object r0 = r0.get(r4)
            com.google.android.exoplayer2.extractor.TrackOutput r0 = (com.google.android.exoplayer2.extractor.TrackOutput) r0
            if (r0 != 0) goto L44
            android.media.MediaFormat r0 = r5.mediaFormat
            java.lang.String r1 = "track-type-string"
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L23
            r1 = r0
            goto L2b
        L23:
            android.media.MediaFormat r1 = r5.mediaFormat
            java.lang.String r2 = "mime"
            java.lang.String r1 = r1.getString(r2)
        L2b:
            int r1 = toTrackTypeConstant(r1)
            int r2 = r3.primaryTrackType
            if (r1 != r2) goto L35
            r3.primaryTrackIndex = r4
        L35:
            com.google.android.exoplayer2.extractor.ExtractorOutput r2 = r3.extractorOutput
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r2.track(r4, r1)
            java.util.ArrayList<com.google.android.exoplayer2.extractor.TrackOutput> r2 = r3.trackOutputs
            r2.set(r4, r1)
            if (r0 == 0) goto L43
            return
        L43:
            r0 = r1
        L44:
            com.google.android.exoplayer2.Format r5 = r3.toExoPlayerFormat(r5)
            com.google.android.exoplayer2.Format r1 = r3.primaryTrackManifestFormat
            if (r1 == 0) goto L55
            int r2 = r3.primaryTrackIndex
            if (r4 != r2) goto L55
            com.google.android.exoplayer2.Format r1 = r5.withManifestFormatInfo(r1)
            goto L56
        L55:
            r1 = r5
        L56:
            r0.format(r1)
            java.util.ArrayList<com.google.android.exoplayer2.Format> r0 = r3.trackFormats
            r0.set(r4, r5)
            r3.maybeEndTracks()
            return
    }

    public void setExtractorOutput(com.google.android.exoplayer2.extractor.ExtractorOutput r1) {
            r0 = this;
            r0.extractorOutput = r1
            return
    }

    public void setMuxedCaptionFormats(java.util.List<com.google.android.exoplayer2.Format> r1) {
            r0 = this;
            r0.muxedCaptionFormats = r1
            return
    }

    public void setSampleTimestampUpperLimitFilterUs(long r1) {
            r0 = this;
            r0.sampleTimestampUpperLimitFilterUs = r1
            return
    }

    public void setSelectedParserName(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = getMimeType(r1)
            r0.containerMimeType = r1
            return
    }

    public void setTimestampAdjuster(com.google.android.exoplayer2.util.TimestampAdjuster r1) {
            r0 = this;
            r0.timestampAdjuster = r1
            return
    }
}
