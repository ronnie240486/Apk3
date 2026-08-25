package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes2.dex */
public final class FlacMetadataReader {
    private static final int SEEK_POINT_SIZE = 18;
    private static final int STREAM_MARKER = 1716281667;
    private static final int SYNC_CODE = 16382;

    /* JADX INFO: loaded from: classes.dex */
    public static final class FlacStreamMetadataHolder {

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.extractor.FlacStreamMetadata flacStreamMetadata;

        public FlacStreamMetadataHolder(@androidx.annotation.Nullable com.google.android.exoplayer2.extractor.FlacStreamMetadata r1) {
                r0 = this;
                r0.<init>()
                r0.flacStreamMetadata = r1
                return
        }
    }

    private FlacMetadataReader() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean checkAndPeekStreamMarker(com.google.android.exoplayer2.extractor.ExtractorInput r6) throws java.io.IOException {
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 4
            r0.<init>(r1)
            byte[] r2 = r0.getData()
            r3 = 0
            r6.peekFully(r2, r3, r1)
            long r0 = r0.readUnsignedInt()
            r4 = 1716281667(0x664c6143, double:8.479558103E-315)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L1a
            r3 = 1
        L1a:
            return r3
    }

    public static int getFrameStartMarker(com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
            r4.resetPeekPosition()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 2
            r0.<init>(r1)
            byte[] r2 = r0.getData()
            r3 = 0
            r4.peekFully(r2, r3, r1)
            int r0 = r0.readUnsignedShort()
            int r1 = r0 >> 2
            r2 = 16382(0x3ffe, float:2.2956E-41)
            if (r1 != r2) goto L1f
            r4.resetPeekPosition()
            return r0
        L1f:
            r4.resetPeekPosition()
            r4 = 0
            java.lang.String r0 = "First frame does not start with sync code."
            com.google.android.exoplayer2.ParserException r4 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r4)
            throw r4
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.metadata.Metadata peekId3Metadata(com.google.android.exoplayer2.extractor.ExtractorInput r2, boolean r3) throws java.io.IOException {
            r0 = 0
            if (r3 == 0) goto L5
            r3 = r0
            goto L7
        L5:
            com.google.android.exoplayer2.metadata.id3.Id3Decoder$FramePredicate r3 = com.google.android.exoplayer2.metadata.id3.Id3Decoder.NO_FRAMES_PREDICATE
        L7:
            com.google.android.exoplayer2.extractor.Id3Peeker r1 = new com.google.android.exoplayer2.extractor.Id3Peeker
            r1.<init>()
            com.google.android.exoplayer2.metadata.Metadata r2 = r1.peekId3Data(r2, r3)
            if (r2 == 0) goto L1a
            int r3 = r2.length()
            if (r3 != 0) goto L19
            goto L1a
        L19:
            r0 = r2
        L1a:
            return r0
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.metadata.Metadata readId3Metadata(com.google.android.exoplayer2.extractor.ExtractorInput r4, boolean r5) throws java.io.IOException {
            r4.resetPeekPosition()
            long r0 = r4.getPeekPosition()
            com.google.android.exoplayer2.metadata.Metadata r5 = peekId3Metadata(r4, r5)
            long r2 = r4.getPeekPosition()
            long r2 = r2 - r0
            int r0 = (int) r2
            r4.skipFully(r0)
            return r5
    }

    public static boolean readMetadataBlock(com.google.android.exoplayer2.extractor.ExtractorInput r7, com.google.android.exoplayer2.extractor.FlacMetadataReader.FlacStreamMetadataHolder r8) throws java.io.IOException {
            r7.resetPeekPosition()
            com.google.android.exoplayer2.util.ParsableBitArray r0 = new com.google.android.exoplayer2.util.ParsableBitArray
            r1 = 4
            byte[] r2 = new byte[r1]
            r0.<init>(r2)
            byte[] r2 = r0.data
            r3 = 0
            r7.peekFully(r2, r3, r1)
            boolean r2 = r0.readBit()
            r4 = 7
            int r4 = r0.readBits(r4)
            r5 = 24
            int r0 = r0.readBits(r5)
            int r0 = r0 + r1
            if (r4 != 0) goto L2a
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r7 = readStreamInfoBlock(r7)
            r8.flacStreamMetadata = r7
            goto L6d
        L2a:
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r5 = r8.flacStreamMetadata
            if (r5 == 0) goto L6e
            r6 = 3
            if (r4 != r6) goto L3c
            com.google.android.exoplayer2.extractor.FlacStreamMetadata$SeekTable r7 = readSeekTableMetadataBlock(r7, r0)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r7 = r5.copyWithSeekTable(r7)
            r8.flacStreamMetadata = r7
            goto L6d
        L3c:
            if (r4 != r1) goto L49
            java.util.List r7 = readVorbisCommentMetadataBlock(r7, r0)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r7 = r5.copyWithVorbisComments(r7)
            r8.flacStreamMetadata = r7
            goto L6d
        L49:
            r6 = 6
            if (r4 != r6) goto L6a
            com.google.android.exoplayer2.util.ParsableByteArray r4 = new com.google.android.exoplayer2.util.ParsableByteArray
            r4.<init>(r0)
            byte[] r6 = r4.getData()
            r7.readFully(r6, r3, r0)
            r4.skipBytes(r1)
            com.google.android.exoplayer2.metadata.flac.PictureFrame r7 = com.google.android.exoplayer2.metadata.flac.PictureFrame.fromPictureBlock(r4)
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.of(r7)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r7 = r5.copyWithPictureFrames(r7)
            r8.flacStreamMetadata = r7
            goto L6d
        L6a:
            r7.skipFully(r0)
        L6d:
            return r2
        L6e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
    }

    private static com.google.android.exoplayer2.extractor.FlacStreamMetadata.SeekTable readSeekTableMetadataBlock(com.google.android.exoplayer2.extractor.ExtractorInput r3, int r4) throws java.io.IOException {
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>(r4)
            byte[] r1 = r0.getData()
            r2 = 0
            r3.readFully(r1, r2, r4)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata$SeekTable r3 = readSeekTableMetadataBlock(r0)
            return r3
    }

    public static com.google.android.exoplayer2.extractor.FlacStreamMetadata.SeekTable readSeekTableMetadataBlock(com.google.android.exoplayer2.util.ParsableByteArray r11) {
            r0 = 1
            r11.skipBytes(r0)
            int r0 = r11.readUnsignedInt24()
            int r1 = r11.getPosition()
            long r1 = (long) r1
            long r3 = (long) r0
            long r1 = r1 + r3
            int r0 = r0 / 18
            long[] r3 = new long[r0]
            long[] r4 = new long[r0]
            r5 = 0
        L16:
            if (r5 >= r0) goto L3a
            long r6 = r11.readLong()
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L2b
            long[] r3 = java.util.Arrays.copyOf(r3, r5)
            long[] r4 = java.util.Arrays.copyOf(r4, r5)
            goto L3a
        L2b:
            r3[r5] = r6
            long r6 = r11.readLong()
            r4[r5] = r6
            r6 = 2
            r11.skipBytes(r6)
            int r5 = r5 + 1
            goto L16
        L3a:
            int r0 = r11.getPosition()
            long r5 = (long) r0
            long r1 = r1 - r5
            int r0 = (int) r1
            r11.skipBytes(r0)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata$SeekTable r11 = new com.google.android.exoplayer2.extractor.FlacStreamMetadata$SeekTable
            r11.<init>(r3, r4)
            return r11
    }

    private static com.google.android.exoplayer2.extractor.FlacStreamMetadata readStreamInfoBlock(com.google.android.exoplayer2.extractor.ExtractorInput r3) throws java.io.IOException {
            r0 = 38
            byte[] r1 = new byte[r0]
            r2 = 0
            r3.readFully(r1, r2, r0)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r3 = new com.google.android.exoplayer2.extractor.FlacStreamMetadata
            r0 = 4
            r3.<init>(r1, r0)
            return r3
    }

    public static void readStreamMarker(com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 4
            r0.<init>(r1)
            byte[] r2 = r0.getData()
            r3 = 0
            r4.readFully(r2, r3, r1)
            long r0 = r0.readUnsignedInt()
            r2 = 1716281667(0x664c6143, double:8.479558103E-315)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1a
            return
        L1a:
            r4 = 0
            java.lang.String r0 = "Failed to read FLAC stream marker."
            com.google.android.exoplayer2.ParserException r4 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r4)
            throw r4
    }

    private static java.util.List<java.lang.String> readVorbisCommentMetadataBlock(com.google.android.exoplayer2.extractor.ExtractorInput r3, int r4) throws java.io.IOException {
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>(r4)
            byte[] r1 = r0.getData()
            r2 = 0
            r3.readFully(r1, r2, r4)
            r3 = 4
            r0.skipBytes(r3)
            com.google.android.exoplayer2.extractor.VorbisUtil$CommentHeader r3 = com.google.android.exoplayer2.extractor.VorbisUtil.readVorbisCommentHeader(r0, r2, r2)
            java.lang.String[] r3 = r3.comments
            java.util.List r3 = java.util.Arrays.asList(r3)
            return r3
    }
}
