package com.google.android.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes.dex */
final class OpusReader extends com.google.android.exoplayer2.extractor.ogg.StreamReader {
    private static final byte[] OPUS_COMMENT_HEADER_SIGNATURE = null;
    private static final byte[] OPUS_ID_HEADER_SIGNATURE = null;
    private boolean firstCommentHeaderSeen;

    static {
            r0 = 8
            byte[] r1 = new byte[r0]
            r1 = {x0012: FILL_ARRAY_DATA , data: [79, 112, 117, 115, 72, 101, 97, 100} // fill-array
            com.google.android.exoplayer2.extractor.ogg.OpusReader.OPUS_ID_HEADER_SIGNATURE = r1
            byte[] r0 = new byte[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [79, 112, 117, 115, 84, 97, 103, 115} // fill-array
            com.google.android.exoplayer2.extractor.ogg.OpusReader.OPUS_COMMENT_HEADER_SIGNATURE = r0
            return
    }

    public OpusReader() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean peekPacketStartsWith(com.google.android.exoplayer2.util.ParsableByteArray r4, byte[] r5) {
            int r0 = r4.bytesLeft()
            int r1 = r5.length
            r2 = 0
            if (r0 >= r1) goto L9
            return r2
        L9:
            int r0 = r4.getPosition()
            int r1 = r5.length
            byte[] r1 = new byte[r1]
            int r3 = r5.length
            r4.readBytes(r1, r2, r3)
            r4.setPosition(r0)
            boolean r4 = java.util.Arrays.equals(r1, r5)
            return r4
    }

    public static boolean verifyBitstreamType(com.google.android.exoplayer2.util.ParsableByteArray r1) {
            byte[] r0 = com.google.android.exoplayer2.extractor.ogg.OpusReader.OPUS_ID_HEADER_SIGNATURE
            boolean r1 = peekPacketStartsWith(r1, r0)
            return r1
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public final long preparePayload(com.google.android.exoplayer2.util.ParsableByteArray r3) {
            r2 = this;
            byte[] r3 = r3.getData()
            long r0 = com.google.android.exoplayer2.audio.OpusUtil.getPacketDurationUs(r3)
            long r0 = r2.convertTimeToGranule(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean readHeaders(com.google.android.exoplayer2.util.ParsableByteArray r3, long r4, com.google.android.exoplayer2.extractor.ogg.StreamReader.SetupData r6) throws com.google.android.exoplayer2.ParserException {
            r2 = this;
            byte[] r4 = com.google.android.exoplayer2.extractor.ogg.OpusReader.OPUS_ID_HEADER_SIGNATURE
            boolean r4 = peekPacketStartsWith(r3, r4)
            r5 = 1
            if (r4 == 0) goto L43
            byte[] r4 = r3.getData()
            int r3 = r3.limit()
            byte[] r3 = java.util.Arrays.copyOf(r4, r3)
            int r4 = com.google.android.exoplayer2.audio.OpusUtil.getChannelCount(r3)
            java.util.List r3 = com.google.android.exoplayer2.audio.OpusUtil.buildInitializationData(r3)
            com.google.android.exoplayer2.Format r0 = r6.format
            if (r0 == 0) goto L22
            return r5
        L22:
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            java.lang.String r1 = "audio/opus"
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r1)
            com.google.android.exoplayer2.Format$Builder r4 = r0.setChannelCount(r4)
            r0 = 48000(0xbb80, float:6.7262E-41)
            com.google.android.exoplayer2.Format$Builder r4 = r4.setSampleRate(r0)
            com.google.android.exoplayer2.Format$Builder r3 = r4.setInitializationData(r3)
            com.google.android.exoplayer2.Format r3 = r3.build()
            r6.format = r3
            return r5
        L43:
            byte[] r4 = com.google.android.exoplayer2.extractor.ogg.OpusReader.OPUS_COMMENT_HEADER_SIGNATURE
            boolean r0 = peekPacketStartsWith(r3, r4)
            r1 = 0
            if (r0 == 0) goto L86
            com.google.android.exoplayer2.Format r0 = r6.format
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            boolean r0 = r2.firstCommentHeaderSeen
            if (r0 == 0) goto L56
            return r5
        L56:
            r2.firstCommentHeaderSeen = r5
            int r4 = r4.length
            r3.skipBytes(r4)
            com.google.android.exoplayer2.extractor.VorbisUtil$CommentHeader r3 = com.google.android.exoplayer2.extractor.VorbisUtil.readVorbisCommentHeader(r3, r1, r1)
            java.lang.String[] r3 = r3.comments
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf(r3)
            com.google.android.exoplayer2.metadata.Metadata r3 = com.google.android.exoplayer2.extractor.VorbisUtil.parseVorbisComments(r3)
            if (r3 != 0) goto L6d
            return r5
        L6d:
            com.google.android.exoplayer2.Format r4 = r6.format
            com.google.android.exoplayer2.Format$Builder r4 = r4.buildUpon()
            com.google.android.exoplayer2.Format r0 = r6.format
            com.google.android.exoplayer2.metadata.Metadata r0 = r0.metadata
            com.google.android.exoplayer2.metadata.Metadata r3 = r3.copyWithAppendedEntriesFrom(r0)
            com.google.android.exoplayer2.Format$Builder r3 = r4.setMetadata(r3)
            com.google.android.exoplayer2.Format r3 = r3.build()
            r6.format = r3
            return r5
        L86:
            com.google.android.exoplayer2.Format r3 = r6.format
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r3)
            return r1
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public final void reset(boolean r1) {
            r0 = this;
            super.reset(r1)
            if (r1 == 0) goto L8
            r1 = 0
            r0.firstCommentHeaderSeen = r1
        L8:
            return
    }
}
