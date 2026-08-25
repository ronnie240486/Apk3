package com.google.android.exoplayer2.extractor.mp3;

/* JADX INFO: loaded from: classes3.dex */
public final class Mp3Extractor implements com.google.android.exoplayer2.extractor.Extractor {
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory FACTORY = null;
    public static final int FLAG_DISABLE_ID3_METADATA = 8;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    public static final int FLAG_ENABLE_INDEX_SEEKING = 4;
    private static final int MAX_SNIFF_BYTES = 32768;
    private static final int MAX_SYNC_BYTES = 131072;
    private static final int MPEG_AUDIO_HEADER_MASK = -128000;
    private static final com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate REQUIRED_ID3_FRAME_PREDICATE = null;
    private static final int SCRATCH_LENGTH = 10;
    private static final int SEEK_HEADER_INFO = 1231971951;
    private static final int SEEK_HEADER_UNSET = 0;
    private static final int SEEK_HEADER_VBRI = 1447187017;
    private static final int SEEK_HEADER_XING = 1483304551;
    private long basisTimeUs;
    private com.google.android.exoplayer2.extractor.TrackOutput currentTrackOutput;
    private boolean disableSeeking;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private long firstSamplePosition;
    private final int flags;
    private final long forcedFirstSampleTimestampUs;
    private final com.google.android.exoplayer2.extractor.GaplessInfoHolder gaplessInfoHolder;
    private final com.google.android.exoplayer2.extractor.Id3Peeker id3Peeker;
    private boolean isSeekInProgress;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.metadata.Metadata metadata;
    private com.google.android.exoplayer2.extractor.TrackOutput realTrackOutput;
    private int sampleBytesRemaining;
    private long samplesRead;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch;
    private long seekTimeUs;
    private com.google.android.exoplayer2.extractor.mp3.Seeker seeker;
    private final com.google.android.exoplayer2.extractor.TrackOutput skippingTrackOutput;
    private final com.google.android.exoplayer2.audio.MpegAudioUtil.Header synchronizedHeader;
    private int synchronizedHeaderData;

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] $r8$lambda$fie3nhznfCc0U0X0BP034izefnI() {
            com.google.android.exoplayer2.extractor.Extractor[] r0 = lambda$static$0()
            return r0
    }

    public static /* synthetic */ boolean $r8$lambda$oXmHmQzHuSLzkD1_qQ8f5Gs3QVU(int r0, int r1, int r2, int r3, int r4) {
            boolean r0 = lambda$static$1(r0, r1, r2, r3, r4)
            return r0
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$4
            com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.FACTORY = r0
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$5
            com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.REQUIRED_ID3_FRAME_PREDICATE = r0
            return
    }

    public Mp3Extractor() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public Mp3Extractor(int r3) {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.<init>(r3, r0)
            return
    }

    public Mp3Extractor(int r2, long r3) {
            r1 = this;
            r1.<init>()
            r0 = r2 & 2
            if (r0 == 0) goto L9
            r2 = r2 | 1
        L9:
            r1.flags = r2
            r1.forcedFirstSampleTimestampUs = r3
            com.google.android.exoplayer2.util.ParsableByteArray r2 = new com.google.android.exoplayer2.util.ParsableByteArray
            r3 = 10
            r2.<init>(r3)
            r1.scratch = r2
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r2 = new com.google.android.exoplayer2.audio.MpegAudioUtil$Header
            r2.<init>()
            r1.synchronizedHeader = r2
            com.google.android.exoplayer2.extractor.GaplessInfoHolder r2 = new com.google.android.exoplayer2.extractor.GaplessInfoHolder
            r2.<init>()
            r1.gaplessInfoHolder = r2
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.basisTimeUs = r2
            com.google.android.exoplayer2.extractor.Id3Peeker r2 = new com.google.android.exoplayer2.extractor.Id3Peeker
            r2.<init>()
            r1.id3Peeker = r2
            com.google.android.exoplayer2.extractor.DummyTrackOutput r2 = new com.google.android.exoplayer2.extractor.DummyTrackOutput
            r2.<init>()
            r1.skippingTrackOutput = r2
            r1.currentTrackOutput = r2
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void assertInitialized() {
            r1 = this;
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r1.realTrackOutput
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r1.extractorOutput
            com.google.android.exoplayer2.util.Util.castNonNull(r0)
            return
    }

    private com.google.android.exoplayer2.extractor.mp3.Seeker computeSeeker(com.google.android.exoplayer2.extractor.ExtractorInput r12) throws java.io.IOException {
            r11 = this;
            com.google.android.exoplayer2.extractor.mp3.Seeker r0 = r11.maybeReadSeekFrame(r12)
            com.google.android.exoplayer2.metadata.Metadata r1 = r11.metadata
            long r2 = r12.getPosition()
            com.google.android.exoplayer2.extractor.mp3.MlltSeeker r1 = maybeHandleSeekMetadata(r1, r2)
            boolean r2 = r11.disableSeeking
            if (r2 == 0) goto L18
            com.google.android.exoplayer2.extractor.mp3.Seeker$UnseekableSeeker r12 = new com.google.android.exoplayer2.extractor.mp3.Seeker$UnseekableSeeker
            r12.<init>()
            return r12
        L18:
            r2 = 0
            int r3 = r11.flags
            r3 = r3 & 4
            if (r3 == 0) goto L4c
            r2 = -1
            if (r1 == 0) goto L2e
            long r2 = r1.getDurationUs()
            long r0 = r1.getDataEndPosition()
        L2b:
            r9 = r0
            r5 = r2
            goto L41
        L2e:
            if (r0 == 0) goto L39
            long r2 = r0.getDurationUs()
            long r0 = r0.getDataEndPosition()
            goto L2b
        L39:
            com.google.android.exoplayer2.metadata.Metadata r0 = r11.metadata
            long r0 = getId3TlenUs(r0)
            r5 = r0
            r9 = r2
        L41:
            com.google.android.exoplayer2.extractor.mp3.IndexSeeker r0 = new com.google.android.exoplayer2.extractor.mp3.IndexSeeker
            long r7 = r12.getPosition()
            r4 = r0
            r4.<init>(r5, r7, r9)
            goto L54
        L4c:
            if (r1 == 0) goto L50
            r0 = r1
            goto L54
        L50:
            if (r0 == 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            r1 = 1
            if (r0 == 0) goto L62
            boolean r2 = r0.isSeekable()
            if (r2 != 0) goto L6e
            int r2 = r11.flags
            r2 = r2 & r1
            if (r2 == 0) goto L6e
        L62:
            int r0 = r11.flags
            r0 = r0 & 2
            if (r0 == 0) goto L69
            goto L6a
        L69:
            r1 = 0
        L6a:
            com.google.android.exoplayer2.extractor.mp3.Seeker r0 = r11.getConstantBitrateSeeker(r12, r1)
        L6e:
            return r0
    }

    private long computeTimeUs(long r5) {
            r4 = this;
            long r0 = r4.basisTimeUs
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 * r2
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r2 = r4.synchronizedHeader
            int r2 = r2.sampleRate
            long r2 = (long) r2
            long r5 = r5 / r2
            long r5 = r5 + r0
            return r5
    }

    private com.google.android.exoplayer2.extractor.mp3.Seeker getConstantBitrateSeeker(com.google.android.exoplayer2.extractor.ExtractorInput r10, boolean r11) throws java.io.IOException {
            r9 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r9.scratch
            byte[] r0 = r0.getData()
            r1 = 0
            r2 = 4
            r10.peekFully(r0, r1, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r9.scratch
            r0.setPosition(r1)
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r0 = r9.synchronizedHeader
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r9.scratch
            int r1 = r1.readInt()
            r0.setForHeaderData(r1)
            com.google.android.exoplayer2.extractor.mp3.ConstantBitrateSeeker r0 = new com.google.android.exoplayer2.extractor.mp3.ConstantBitrateSeeker
            long r3 = r10.getLength()
            long r5 = r10.getPosition()
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r7 = r9.synchronizedHeader
            r2 = r0
            r8 = r11
            r2.<init>(r3, r5, r7, r8)
            return r0
    }

    private static long getId3TlenUs(@androidx.annotation.Nullable com.google.android.exoplayer2.metadata.Metadata r6) {
            if (r6 == 0) goto L32
            int r0 = r6.length()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L32
            com.google.android.exoplayer2.metadata.Metadata$Entry r3 = r6.get(r2)
            boolean r4 = r3 instanceof com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            if (r4 == 0) goto L2f
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r3 = (com.google.android.exoplayer2.metadata.id3.TextInformationFrame) r3
            java.lang.String r4 = r3.id
            java.lang.String r5 = "TLEN"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L2f
            com.google.common.collect.ImmutableList<java.lang.String> r6 = r3.values
            java.lang.Object r6 = r6.get(r1)
            java.lang.String r6 = (java.lang.String) r6
            long r0 = java.lang.Long.parseLong(r6)
            long r0 = com.google.android.exoplayer2.util.Util.msToUs(r0)
            return r0
        L2f:
            int r2 = r2 + 1
            goto L8
        L32:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r0
    }

    private static int getSeekFrameHeader(com.google.android.exoplayer2.util.ParsableByteArray r2, int r3) {
            int r0 = r2.limit()
            int r1 = r3 + 4
            if (r0 < r1) goto L1a
            r2.setPosition(r3)
            int r3 = r2.readInt()
            r0 = 1483304551(0x58696e67, float:1.02664153E15)
            if (r3 == r0) goto L19
            r0 = 1231971951(0x496e666f, float:976486.94)
            if (r3 != r0) goto L1a
        L19:
            return r3
        L1a:
            int r3 = r2.limit()
            r0 = 40
            if (r3 < r0) goto L31
            r3 = 36
            r2.setPosition(r3)
            int r2 = r2.readInt()
            r3 = 1447187017(0x56425249, float:5.3414667E13)
            if (r2 != r3) goto L31
            return r3
        L31:
            r2 = 0
            return r2
    }

    private static boolean headersMatch(int r4, long r5) {
            r0 = -128000(0xfffffffffffe0c00, float:NaN)
            r4 = r4 & r0
            long r0 = (long) r4
            r2 = -128000(0xfffffffffffe0c00, double:NaN)
            long r4 = r5 & r2
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            r4 = 1
            goto L11
        L10:
            r4 = 0
        L11:
            return r4
    }

    private static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
            r0 = 1
            com.google.android.exoplayer2.extractor.Extractor[] r0 = new com.google.android.exoplayer2.extractor.Extractor[r0]
            com.google.android.exoplayer2.extractor.mp3.Mp3Extractor r1 = new com.google.android.exoplayer2.extractor.mp3.Mp3Extractor
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            return r0
    }

    private static /* synthetic */ boolean lambda$static$1(int r3, int r4, int r5, int r6, int r7) {
            r0 = 2
            r1 = 77
            r2 = 67
            if (r4 != r2) goto L11
            r2 = 79
            if (r5 != r2) goto L11
            if (r6 != r1) goto L11
            if (r7 == r1) goto L1f
            if (r3 == r0) goto L1f
        L11:
            if (r4 != r1) goto L21
            r4 = 76
            if (r5 != r4) goto L21
            if (r6 != r4) goto L21
            r4 = 84
            if (r7 == r4) goto L1f
            if (r3 != r0) goto L21
        L1f:
            r3 = 1
            goto L22
        L21:
            r3 = 0
        L22:
            return r3
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.extractor.mp3.MlltSeeker maybeHandleSeekMetadata(@androidx.annotation.Nullable com.google.android.exoplayer2.metadata.Metadata r4, long r5) {
            if (r4 == 0) goto L1f
            int r0 = r4.length()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1f
            com.google.android.exoplayer2.metadata.Metadata$Entry r2 = r4.get(r1)
            boolean r3 = r2 instanceof com.google.android.exoplayer2.metadata.id3.MlltFrame
            if (r3 == 0) goto L1c
            com.google.android.exoplayer2.metadata.id3.MlltFrame r2 = (com.google.android.exoplayer2.metadata.id3.MlltFrame) r2
            long r0 = getId3TlenUs(r4)
            com.google.android.exoplayer2.extractor.mp3.MlltSeeker r4 = com.google.android.exoplayer2.extractor.mp3.MlltSeeker.create(r5, r2, r0)
            return r4
        L1c:
            int r1 = r1 + 1
            goto L7
        L1f:
            r4 = 0
            return r4
    }

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.mp3.Seeker maybeReadSeekFrame(com.google.android.exoplayer2.extractor.ExtractorInput r11) throws java.io.IOException {
            r10 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r5 = new com.google.android.exoplayer2.util.ParsableByteArray
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r0 = r10.synchronizedHeader
            int r0 = r0.frameSize
            r5.<init>(r0)
            byte[] r0 = r5.getData()
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r1 = r10.synchronizedHeader
            int r1 = r1.frameSize
            r6 = 0
            r11.peekFully(r0, r6, r1)
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r0 = r10.synchronizedHeader
            int r1 = r0.version
            r2 = 1
            r1 = r1 & r2
            r3 = 21
            if (r1 == 0) goto L28
            int r0 = r0.channels
            if (r0 == r2) goto L2c
            r3 = 36
            r7 = 36
            goto L33
        L28:
            int r0 = r0.channels
            if (r0 == r2) goto L2f
        L2c:
            r7 = 21
            goto L33
        L2f:
            r3 = 13
            r7 = 13
        L33:
            int r8 = getSeekFrameHeader(r5, r7)
            r0 = 1483304551(0x58696e67, float:1.02664153E15)
            r9 = 1231971951(0x496e666f, float:976486.94)
            if (r8 == r0) goto L62
            if (r8 != r9) goto L42
            goto L62
        L42:
            r0 = 1447187017(0x56425249, float:5.3414667E13)
            if (r8 != r0) goto L5d
            long r0 = r11.getLength()
            long r2 = r11.getPosition()
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r4 = r10.synchronizedHeader
            com.google.android.exoplayer2.extractor.mp3.VbriSeeker r0 = com.google.android.exoplayer2.extractor.mp3.VbriSeeker.create(r0, r2, r4, r5)
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r1 = r10.synchronizedHeader
            int r1 = r1.frameSize
            r11.skipFully(r1)
            goto Lb2
        L5d:
            r0 = 0
            r11.resetPeekPosition()
            goto Lb2
        L62:
            long r0 = r11.getLength()
            long r2 = r11.getPosition()
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r4 = r10.synchronizedHeader
            com.google.android.exoplayer2.extractor.mp3.XingSeeker r0 = com.google.android.exoplayer2.extractor.mp3.XingSeeker.create(r0, r2, r4, r5)
            if (r0 == 0) goto L9c
            com.google.android.exoplayer2.extractor.GaplessInfoHolder r1 = r10.gaplessInfoHolder
            boolean r1 = r1.hasGaplessInfo()
            if (r1 != 0) goto L9c
            r11.resetPeekPosition()
            int r7 = r7 + 141
            r11.advancePeekPosition(r7)
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.scratch
            byte[] r1 = r1.getData()
            r2 = 3
            r11.peekFully(r1, r6, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r10.scratch
            r1.setPosition(r6)
            com.google.android.exoplayer2.extractor.GaplessInfoHolder r1 = r10.gaplessInfoHolder
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r10.scratch
            int r2 = r2.readUnsignedInt24()
            r1.setFromXingHeaderValue(r2)
        L9c:
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r1 = r10.synchronizedHeader
            int r1 = r1.frameSize
            r11.skipFully(r1)
            if (r0 == 0) goto Lb2
            boolean r1 = r0.isSeekable()
            if (r1 != 0) goto Lb2
            if (r8 != r9) goto Lb2
            com.google.android.exoplayer2.extractor.mp3.Seeker r11 = r10.getConstantBitrateSeeker(r11, r6)
            return r11
        Lb2:
            return r0
    }

    private boolean peekEndOfStreamOrHeader(com.google.android.exoplayer2.extractor.ExtractorInput r9) throws java.io.IOException {
            r8 = this;
            com.google.android.exoplayer2.extractor.mp3.Seeker r0 = r8.seeker
            r1 = 1
            if (r0 == 0) goto L1b
            long r2 = r0.getDataEndPosition()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r4 = r9.getPeekPosition()
            r6 = 4
            long r2 = r2 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            return r1
        L1b:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r8.scratch     // Catch: java.io.EOFException -> L29
            byte[] r0 = r0.getData()     // Catch: java.io.EOFException -> L29
            r2 = 0
            r3 = 4
            boolean r9 = r9.peekFully(r0, r2, r3, r1)     // Catch: java.io.EOFException -> L29
            r9 = r9 ^ r1
            return r9
        L29:
            return r1
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int readInternal(com.google.android.exoplayer2.extractor.ExtractorInput r6) throws java.io.IOException {
            r5 = this;
            int r0 = r5.synchronizedHeaderData
            if (r0 != 0) goto Lb
            r0 = 0
            r5.synchronize(r6, r0)     // Catch: java.io.EOFException -> L9
            goto Lb
        L9:
            r6 = -1
            return r6
        Lb:
            com.google.android.exoplayer2.extractor.mp3.Seeker r0 = r5.seeker
            if (r0 != 0) goto L6b
            com.google.android.exoplayer2.extractor.mp3.Seeker r0 = r5.computeSeeker(r6)
            r5.seeker = r0
            com.google.android.exoplayer2.extractor.ExtractorOutput r1 = r5.extractorOutput
            r1.seekMap(r0)
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r5.currentTrackOutput
            com.google.android.exoplayer2.Format$Builder r1 = new com.google.android.exoplayer2.Format$Builder
            r1.<init>()
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r2 = r5.synchronizedHeader
            java.lang.String r2 = r2.mimeType
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleMimeType(r2)
            r2 = 4096(0x1000, float:5.74E-42)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setMaxInputSize(r2)
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r2 = r5.synchronizedHeader
            int r2 = r2.channels
            com.google.android.exoplayer2.Format$Builder r1 = r1.setChannelCount(r2)
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r2 = r5.synchronizedHeader
            int r2 = r2.sampleRate
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleRate(r2)
            com.google.android.exoplayer2.extractor.GaplessInfoHolder r2 = r5.gaplessInfoHolder
            int r2 = r2.encoderDelay
            com.google.android.exoplayer2.Format$Builder r1 = r1.setEncoderDelay(r2)
            com.google.android.exoplayer2.extractor.GaplessInfoHolder r2 = r5.gaplessInfoHolder
            int r2 = r2.encoderPadding
            com.google.android.exoplayer2.Format$Builder r1 = r1.setEncoderPadding(r2)
            int r2 = r5.flags
            r2 = r2 & 8
            if (r2 == 0) goto L57
            r2 = 0
            goto L59
        L57:
            com.google.android.exoplayer2.metadata.Metadata r2 = r5.metadata
        L59:
            com.google.android.exoplayer2.Format$Builder r1 = r1.setMetadata(r2)
            com.google.android.exoplayer2.Format r1 = r1.build()
            r0.format(r1)
            long r0 = r6.getPosition()
            r5.firstSamplePosition = r0
            goto L82
        L6b:
            long r0 = r5.firstSamplePosition
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L82
            long r0 = r6.getPosition()
            long r2 = r5.firstSamplePosition
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L82
            long r2 = r2 - r0
            int r0 = (int) r2
            r6.skipFully(r0)
        L82:
            int r6 = r5.readSample(r6)
            return r6
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"realTrackOutput", "seeker"})
    private int readSample(com.google.android.exoplayer2.extractor.ExtractorInput r12) throws java.io.IOException {
            r11 = this;
            int r0 = r11.sampleBytesRemaining
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 != 0) goto L9c
            r12.resetPeekPosition()
            boolean r0 = r11.peekEndOfStreamOrHeader(r12)
            if (r0 == 0) goto L11
            return r2
        L11:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r11.scratch
            r0.setPosition(r3)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r11.scratch
            int r0 = r0.readInt()
            int r4 = r11.synchronizedHeaderData
            long r4 = (long) r4
            boolean r4 = headersMatch(r0, r4)
            if (r4 == 0) goto L96
            int r4 = com.google.android.exoplayer2.audio.MpegAudioUtil.getFrameSize(r0)
            if (r4 != r2) goto L2c
            goto L96
        L2c:
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r4 = r11.synchronizedHeader
            r4.setForHeaderData(r0)
            long r4 = r11.basisTimeUs
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L5e
            com.google.android.exoplayer2.extractor.mp3.Seeker r0 = r11.seeker
            long r4 = r12.getPosition()
            long r4 = r0.getTimeUs(r4)
            r11.basisTimeUs = r4
            long r4 = r11.forcedFirstSampleTimestampUs
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L5e
            com.google.android.exoplayer2.extractor.mp3.Seeker r0 = r11.seeker
            r4 = 0
            long r4 = r0.getTimeUs(r4)
            long r6 = r11.basisTimeUs
            long r8 = r11.forcedFirstSampleTimestampUs
            long r8 = r8 - r4
            long r8 = r8 + r6
            r11.basisTimeUs = r8
        L5e:
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r0 = r11.synchronizedHeader
            int r4 = r0.frameSize
            r11.sampleBytesRemaining = r4
            com.google.android.exoplayer2.extractor.mp3.Seeker r4 = r11.seeker
            boolean r5 = r4 instanceof com.google.android.exoplayer2.extractor.mp3.IndexSeeker
            if (r5 == 0) goto L9c
            com.google.android.exoplayer2.extractor.mp3.IndexSeeker r4 = (com.google.android.exoplayer2.extractor.mp3.IndexSeeker) r4
            long r5 = r11.samplesRead
            int r0 = r0.samplesPerFrame
            long r7 = (long) r0
            long r5 = r5 + r7
            long r5 = r11.computeTimeUs(r5)
            long r7 = r12.getPosition()
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r0 = r11.synchronizedHeader
            int r0 = r0.frameSize
            long r9 = (long) r0
            long r7 = r7 + r9
            r4.maybeAddSeekPoint(r5, r7)
            boolean r0 = r11.isSeekInProgress
            if (r0 == 0) goto L9c
            long r5 = r11.seekTimeUs
            boolean r0 = r4.isTimeUsInIndex(r5)
            if (r0 == 0) goto L9c
            r11.isSeekInProgress = r3
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r11.realTrackOutput
            r11.currentTrackOutput = r0
            goto L9c
        L96:
            r12.skipFully(r1)
            r11.synchronizedHeaderData = r3
            return r3
        L9c:
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r11.currentTrackOutput
            int r4 = r11.sampleBytesRemaining
            int r12 = r0.sampleData(r12, r4, r1)
            if (r12 != r2) goto La7
            return r2
        La7:
            int r0 = r11.sampleBytesRemaining
            int r0 = r0 - r12
            r11.sampleBytesRemaining = r0
            if (r0 <= 0) goto Laf
            return r3
        Laf:
            com.google.android.exoplayer2.extractor.TrackOutput r4 = r11.currentTrackOutput
            long r0 = r11.samplesRead
            long r5 = r11.computeTimeUs(r0)
            r7 = 1
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r12 = r11.synchronizedHeader
            int r8 = r12.frameSize
            r9 = 0
            r10 = 0
            r4.sampleMetadata(r5, r7, r8, r9, r10)
            long r0 = r11.samplesRead
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r12 = r11.synchronizedHeader
            int r12 = r12.samplesPerFrame
            long r4 = (long) r12
            long r0 = r0 + r4
            r11.samplesRead = r0
            r11.sampleBytesRemaining = r3
            return r3
    }

    private boolean synchronize(com.google.android.exoplayer2.extractor.ExtractorInput r12, boolean r13) throws java.io.IOException {
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.resetPeekPosition()
            long r1 = r12.getPosition()
            r3 = 0
            r5 = 0
            r6 = 1
            r7 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 != 0) goto L42
            int r1 = r11.flags
            r1 = r1 & 8
            if (r1 != 0) goto L20
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 == 0) goto L25
            r1 = r5
            goto L27
        L25:
            com.google.android.exoplayer2.metadata.id3.Id3Decoder$FramePredicate r1 = com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.REQUIRED_ID3_FRAME_PREDICATE
        L27:
            com.google.android.exoplayer2.extractor.Id3Peeker r2 = r11.id3Peeker
            com.google.android.exoplayer2.metadata.Metadata r1 = r2.peekId3Data(r12, r1)
            r11.metadata = r1
            if (r1 == 0) goto L36
            com.google.android.exoplayer2.extractor.GaplessInfoHolder r2 = r11.gaplessInfoHolder
            r2.setFromMetadata(r1)
        L36:
            long r1 = r12.getPeekPosition()
            int r2 = (int) r1
            if (r13 != 0) goto L40
            r12.skipFully(r2)
        L40:
            r1 = 0
            goto L44
        L42:
            r1 = 0
            r2 = 0
        L44:
            r3 = 0
            r4 = 0
        L46:
            boolean r8 = r11.peekEndOfStreamOrHeader(r12)
            if (r8 == 0) goto L55
            if (r3 <= 0) goto L4f
            goto L9e
        L4f:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L55:
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r11.scratch
            r8.setPosition(r7)
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r11.scratch
            int r8 = r8.readInt()
            if (r1 == 0) goto L69
            long r9 = (long) r1
            boolean r9 = headersMatch(r8, r9)
            if (r9 == 0) goto L70
        L69:
            int r9 = com.google.android.exoplayer2.audio.MpegAudioUtil.getFrameSize(r8)
            r10 = -1
            if (r9 != r10) goto L90
        L70:
            int r1 = r4 + 1
            if (r4 != r0) goto L7e
            if (r13 == 0) goto L77
            return r7
        L77:
            java.lang.String r12 = "Searched too many bytes."
            com.google.android.exoplayer2.ParserException r12 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r12, r5)
            throw r12
        L7e:
            if (r13 == 0) goto L89
            r12.resetPeekPosition()
            int r3 = r2 + r1
            r12.advancePeekPosition(r3)
            goto L8c
        L89:
            r12.skipFully(r6)
        L8c:
            r4 = r1
            r1 = 0
            r3 = 0
            goto L46
        L90:
            int r3 = r3 + 1
            if (r3 != r6) goto L9b
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r1 = r11.synchronizedHeader
            r1.setForHeaderData(r8)
            r1 = r8
            goto Lab
        L9b:
            r8 = 4
            if (r3 != r8) goto Lab
        L9e:
            if (r13 == 0) goto La5
            int r2 = r2 + r4
            r12.skipFully(r2)
            goto La8
        La5:
            r12.resetPeekPosition()
        La8:
            r11.synchronizedHeaderData = r1
            return r6
        Lab:
            int r9 = r9 + (-4)
            r12.advancePeekPosition(r9)
            goto L46
    }

    public void disableSeeking() {
            r1 = this;
            r0 = 1
            r1.disableSeeking = r0
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r3) {
            r2 = this;
            r2.extractorOutput = r3
            r0 = 0
            r1 = 1
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r3.track(r0, r1)
            r2.realTrackOutput = r3
            r2.currentTrackOutput = r3
            com.google.android.exoplayer2.extractor.ExtractorOutput r3 = r2.extractorOutput
            r3.endTracks()
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r5, com.google.android.exoplayer2.extractor.PositionHolder r6) throws java.io.IOException {
            r4 = this;
            r4.assertInitialized()
            int r5 = r4.readInternal(r5)
            r6 = -1
            if (r5 != r6) goto L2e
            com.google.android.exoplayer2.extractor.mp3.Seeker r6 = r4.seeker
            boolean r6 = r6 instanceof com.google.android.exoplayer2.extractor.mp3.IndexSeeker
            if (r6 == 0) goto L2e
            long r0 = r4.samplesRead
            long r0 = r4.computeTimeUs(r0)
            com.google.android.exoplayer2.extractor.mp3.Seeker r6 = r4.seeker
            long r2 = r6.getDurationUs()
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 == 0) goto L2e
            com.google.android.exoplayer2.extractor.mp3.Seeker r6 = r4.seeker
            com.google.android.exoplayer2.extractor.mp3.IndexSeeker r6 = (com.google.android.exoplayer2.extractor.mp3.IndexSeeker) r6
            r6.setDurationUs(r0)
            com.google.android.exoplayer2.extractor.ExtractorOutput r6 = r4.extractorOutput
            com.google.android.exoplayer2.extractor.mp3.Seeker r0 = r4.seeker
            r6.seekMap(r0)
        L2e:
            return r5
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long r3, long r5) {
            r2 = this;
            r3 = 0
            r2.synchronizedHeaderData = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.basisTimeUs = r0
            r0 = 0
            r2.samplesRead = r0
            r2.sampleBytesRemaining = r3
            r2.seekTimeUs = r5
            com.google.android.exoplayer2.extractor.mp3.Seeker r3 = r2.seeker
            boolean r4 = r3 instanceof com.google.android.exoplayer2.extractor.mp3.IndexSeeker
            if (r4 == 0) goto L27
            com.google.android.exoplayer2.extractor.mp3.IndexSeeker r3 = (com.google.android.exoplayer2.extractor.mp3.IndexSeeker) r3
            boolean r3 = r3.isTimeUsInIndex(r5)
            if (r3 != 0) goto L27
            r3 = 1
            r2.isSeekInProgress = r3
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r2.skippingTrackOutput
            r2.currentTrackOutput = r3
        L27:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r2) throws java.io.IOException {
            r1 = this;
            r0 = 1
            boolean r2 = r1.synchronize(r2, r0)
            return r2
    }
}
