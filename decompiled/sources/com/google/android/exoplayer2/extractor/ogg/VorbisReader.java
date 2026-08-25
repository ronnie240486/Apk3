package com.google.android.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes2.dex */
final class VorbisReader extends com.google.android.exoplayer2.extractor.ogg.StreamReader {

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.VorbisUtil.CommentHeader commentHeader;
    private int previousPacketBlockSize;
    private boolean seenFirstAudioPacket;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.VorbisUtil.VorbisIdHeader vorbisIdHeader;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.ogg.VorbisReader.VorbisSetup vorbisSetup;

    /* JADX INFO: loaded from: classes.dex */
    public static final class VorbisSetup {
        public final com.google.android.exoplayer2.extractor.VorbisUtil.CommentHeader commentHeader;
        public final int iLogModes;
        public final com.google.android.exoplayer2.extractor.VorbisUtil.VorbisIdHeader idHeader;
        public final com.google.android.exoplayer2.extractor.VorbisUtil.Mode[] modes;
        public final byte[] setupHeaderData;

        public VorbisSetup(com.google.android.exoplayer2.extractor.VorbisUtil.VorbisIdHeader r1, com.google.android.exoplayer2.extractor.VorbisUtil.CommentHeader r2, byte[] r3, com.google.android.exoplayer2.extractor.VorbisUtil.Mode[] r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.idHeader = r1
                r0.commentHeader = r2
                r0.setupHeaderData = r3
                r0.modes = r4
                r0.iLogModes = r5
                return
        }
    }

    public VorbisReader() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int decodeBlockSize(byte r2, com.google.android.exoplayer2.extractor.ogg.VorbisReader.VorbisSetup r3) {
            int r0 = r3.iLogModes
            int r2 = r2 >> 1
            int r0 = 8 - r0
            r1 = 255(0xff, float:3.57E-43)
            int r0 = r1 >>> r0
            r2 = r2 & r0
            com.google.android.exoplayer2.extractor.VorbisUtil$Mode[] r0 = r3.modes
            r2 = r0[r2]
            boolean r2 = r2.blockFlag
            if (r2 != 0) goto L18
            com.google.android.exoplayer2.extractor.VorbisUtil$VorbisIdHeader r2 = r3.idHeader
            int r2 = r2.blockSize0
            goto L1c
        L18:
            com.google.android.exoplayer2.extractor.VorbisUtil$VorbisIdHeader r2 = r3.idHeader
            int r2 = r2.blockSize1
        L1c:
            return r2
    }

    public static boolean verifyBitstreamType(com.google.android.exoplayer2.util.ParsableByteArray r1) {
            r0 = 1
            boolean r1 = com.google.android.exoplayer2.extractor.VorbisUtil.verifyVorbisHeaderCapturePattern(r0, r1, r0)     // Catch: com.google.android.exoplayer2.ParserException -> L6
            return r1
        L6:
            r1 = 0
            return r1
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public final void onSeekEnd(long r5) {
            r4 = this;
            super.onSeekEnd(r5)
            r0 = 0
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            r4.seenFirstAudioPacket = r5
            com.google.android.exoplayer2.extractor.VorbisUtil$VorbisIdHeader r5 = r4.vorbisIdHeader
            if (r5 == 0) goto L15
            int r0 = r5.blockSize0
        L15:
            r4.previousPacketBlockSize = r0
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public final long preparePayload(com.google.android.exoplayer2.util.ParsableByteArray r11) {
            r10 = this;
            byte[] r0 = r11.getData()
            r1 = 0
            r0 = r0[r1]
            r2 = 1
            r0 = r0 & r2
            if (r0 != r2) goto Le
            r0 = -1
            return r0
        Le:
            byte[] r0 = r11.getData()
            r0 = r0[r1]
            com.google.android.exoplayer2.extractor.ogg.VorbisReader$VorbisSetup r3 = r10.vorbisSetup
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r3)
            com.google.android.exoplayer2.extractor.ogg.VorbisReader$VorbisSetup r3 = (com.google.android.exoplayer2.extractor.ogg.VorbisReader.VorbisSetup) r3
            int r0 = decodeBlockSize(r0, r3)
            boolean r3 = r10.seenFirstAudioPacket
            if (r3 == 0) goto L29
            int r1 = r10.previousPacketBlockSize
            int r1 = r1 + r0
            int r1 = r1 / 4
        L29:
            long r3 = (long) r1
            int r1 = r11.capacity()
            int r5 = r11.limit()
            int r5 = r5 + 4
            if (r1 >= r5) goto L48
            byte[] r1 = r11.getData()
            int r5 = r11.limit()
            int r5 = r5 + 4
            byte[] r1 = java.util.Arrays.copyOf(r1, r5)
            r11.reset(r1)
            goto L51
        L48:
            int r1 = r11.limit()
            int r1 = r1 + 4
            r11.setLimit(r1)
        L51:
            byte[] r1 = r11.getData()
            int r5 = r11.limit()
            int r5 = r5 + (-4)
            r6 = 255(0xff, double:1.26E-321)
            long r8 = r3 & r6
            int r9 = (int) r8
            byte r8 = (byte) r9
            r1[r5] = r8
            int r5 = r11.limit()
            int r5 = r5 + (-3)
            r8 = 8
            long r8 = r3 >>> r8
            long r8 = r8 & r6
            int r9 = (int) r8
            byte r8 = (byte) r9
            r1[r5] = r8
            int r5 = r11.limit()
            int r5 = r5 + (-2)
            r8 = 16
            long r8 = r3 >>> r8
            long r8 = r8 & r6
            int r9 = (int) r8
            byte r8 = (byte) r9
            r1[r5] = r8
            int r11 = r11.limit()
            int r11 = r11 + (-1)
            r5 = 24
            long r8 = r3 >>> r5
            long r5 = r8 & r6
            int r6 = (int) r5
            byte r5 = (byte) r6
            r1[r11] = r5
            r10.seenFirstAudioPacket = r2
            r10.previousPacketBlockSize = r0
            return r3
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean readHeaders(com.google.android.exoplayer2.util.ParsableByteArray r7, long r8, com.google.android.exoplayer2.extractor.ogg.StreamReader.SetupData r10) throws java.io.IOException {
            r6 = this;
            com.google.android.exoplayer2.extractor.ogg.VorbisReader$VorbisSetup r8 = r6.vorbisSetup
            r9 = 0
            if (r8 == 0) goto Lb
            com.google.android.exoplayer2.Format r7 = r10.format
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
            return r9
        Lb:
            com.google.android.exoplayer2.extractor.VorbisUtil$VorbisIdHeader r1 = r6.vorbisIdHeader
            r8 = 0
            if (r1 != 0) goto L17
            com.google.android.exoplayer2.extractor.VorbisUtil$VorbisIdHeader r7 = com.google.android.exoplayer2.extractor.VorbisUtil.readVorbisIdentificationHeader(r7)
            r6.vorbisIdHeader = r7
            goto L46
        L17:
            com.google.android.exoplayer2.extractor.VorbisUtil$CommentHeader r2 = r6.commentHeader
            if (r2 != 0) goto L22
            com.google.android.exoplayer2.extractor.VorbisUtil$CommentHeader r7 = com.google.android.exoplayer2.extractor.VorbisUtil.readVorbisCommentHeader(r7)
            r6.commentHeader = r7
            goto L46
        L22:
            int r8 = r7.limit()
            byte[] r3 = new byte[r8]
            byte[] r8 = r7.getData()
            int r0 = r7.limit()
            java.lang.System.arraycopy(r8, r9, r3, r9, r0)
            int r8 = r1.channels
            com.google.android.exoplayer2.extractor.VorbisUtil$Mode[] r4 = com.google.android.exoplayer2.extractor.VorbisUtil.readVorbisModes(r7, r8)
            int r7 = r4.length
            int r7 = r7 + (-1)
            int r5 = com.google.android.exoplayer2.extractor.VorbisUtil.iLog(r7)
            com.google.android.exoplayer2.extractor.ogg.VorbisReader$VorbisSetup r8 = new com.google.android.exoplayer2.extractor.ogg.VorbisReader$VorbisSetup
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
        L46:
            r6.vorbisSetup = r8
            r7 = 1
            if (r8 != 0) goto L4c
            return r7
        L4c:
            com.google.android.exoplayer2.extractor.VorbisUtil$VorbisIdHeader r9 = r8.idHeader
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            byte[] r1 = r9.data
            r0.add(r1)
            byte[] r1 = r8.setupHeaderData
            r0.add(r1)
            com.google.android.exoplayer2.extractor.VorbisUtil$CommentHeader r8 = r8.commentHeader
            java.lang.String[] r8 = r8.comments
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.copyOf(r8)
            com.google.android.exoplayer2.metadata.Metadata r8 = com.google.android.exoplayer2.extractor.VorbisUtil.parseVorbisComments(r8)
            com.google.android.exoplayer2.Format$Builder r1 = new com.google.android.exoplayer2.Format$Builder
            r1.<init>()
            java.lang.String r2 = "audio/vorbis"
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleMimeType(r2)
            int r2 = r9.bitrateNominal
            com.google.android.exoplayer2.Format$Builder r1 = r1.setAverageBitrate(r2)
            int r2 = r9.bitrateMaximum
            com.google.android.exoplayer2.Format$Builder r1 = r1.setPeakBitrate(r2)
            int r2 = r9.channels
            com.google.android.exoplayer2.Format$Builder r1 = r1.setChannelCount(r2)
            int r9 = r9.sampleRate
            com.google.android.exoplayer2.Format$Builder r9 = r1.setSampleRate(r9)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setInitializationData(r0)
            com.google.android.exoplayer2.Format$Builder r8 = r9.setMetadata(r8)
            com.google.android.exoplayer2.Format r8 = r8.build()
            r10.format = r8
            return r7
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public final void reset(boolean r1) {
            r0 = this;
            super.reset(r1)
            if (r1 == 0) goto Lc
            r1 = 0
            r0.vorbisSetup = r1
            r0.vorbisIdHeader = r1
            r0.commentHeader = r1
        Lc:
            r1 = 0
            r0.previousPacketBlockSize = r1
            r0.seenFirstAudioPacket = r1
            return
    }
}
