package com.google.android.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes2.dex */
final class FlacReader extends com.google.android.exoplayer2.extractor.ogg.StreamReader {
    private static final byte AUDIO_PACKET_TYPE = -1;
    private static final int FRAME_HEADER_SAMPLE_NUMBER_OFFSET = 4;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.ogg.FlacReader.FlacOggSeeker flacOggSeeker;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.FlacStreamMetadata streamMetadata;

    /* JADX INFO: loaded from: classes.dex */
    public static final class FlacOggSeeker implements com.google.android.exoplayer2.extractor.ogg.OggSeeker {
        private long firstFrameOffset;
        private long pendingSeekGranule;
        private com.google.android.exoplayer2.extractor.FlacStreamMetadata.SeekTable seekTable;
        private com.google.android.exoplayer2.extractor.FlacStreamMetadata streamMetadata;

        public FlacOggSeeker(com.google.android.exoplayer2.extractor.FlacStreamMetadata r1, com.google.android.exoplayer2.extractor.FlacStreamMetadata.SeekTable r2) {
                r0 = this;
                r0.<init>()
                r0.streamMetadata = r1
                r0.seekTable = r2
                r1 = -1
                r0.firstFrameOffset = r1
                r0.pendingSeekGranule = r1
                return
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public com.google.android.exoplayer2.extractor.SeekMap createSeekMap() {
                r5 = this;
                long r0 = r5.firstFrameOffset
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                com.google.android.exoplayer2.extractor.FlacSeekTableSeekMap r0 = new com.google.android.exoplayer2.extractor.FlacSeekTableSeekMap
                com.google.android.exoplayer2.extractor.FlacStreamMetadata r1 = r5.streamMetadata
                long r2 = r5.firstFrameOffset
                r0.<init>(r1, r2)
                return r0
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public long read(com.google.android.exoplayer2.extractor.ExtractorInput r7) {
                r6 = this;
                long r0 = r6.pendingSeekGranule
                r2 = -1
                r4 = 0
                int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r7 < 0) goto L11
                r4 = 2
                long r0 = r0 + r4
                long r0 = -r0
                r6.pendingSeekGranule = r2
                return r0
            L11:
                return r2
        }

        public void setFirstFrameOffset(long r1) {
                r0 = this;
                r0.firstFrameOffset = r1
                return
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public void startSeek(long r3) {
                r2 = this;
                com.google.android.exoplayer2.extractor.FlacStreamMetadata$SeekTable r0 = r2.seekTable
                long[] r0 = r0.pointSampleNumbers
                r1 = 1
                int r3 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r0, r3, r1, r1)
                r3 = r0[r3]
                r2.pendingSeekGranule = r3
                return
        }
    }

    public FlacReader() {
            r0 = this;
            r0.<init>()
            return
    }

    private int getFlacFrameBlockSize(com.google.android.exoplayer2.util.ParsableByteArray r4) {
            r3 = this;
            byte[] r0 = r4.getData()
            r1 = 2
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 4
            int r0 = r0 >> r1
            r2 = 6
            if (r0 == r2) goto L11
            r2 = 7
            if (r0 != r2) goto L17
        L11:
            r4.skipBytes(r1)
            r4.readUtf8EncodedLong()
        L17:
            int r0 = com.google.android.exoplayer2.extractor.FlacFrameReader.readFrameBlockSizeSamplesFromKey(r4, r0)
            r1 = 0
            r4.setPosition(r1)
            return r0
    }

    private static boolean isAudioPacket(byte[] r2) {
            r0 = 0
            r2 = r2[r0]
            r1 = -1
            if (r2 != r1) goto L7
            r0 = 1
        L7:
            return r0
    }

    public static boolean verifyBitstreamType(com.google.android.exoplayer2.util.ParsableByteArray r4) {
            int r0 = r4.bytesLeft()
            r1 = 5
            if (r0 < r1) goto L1c
            int r0 = r4.readUnsignedByte()
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 != r1) goto L1c
            long r0 = r4.readUnsignedInt()
            r2 = 1179402563(0x464c4143, double:5.82702289E-315)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1c
            r4 = 1
            goto L1d
        L1c:
            r4 = 0
        L1d:
            return r4
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public final long preparePayload(com.google.android.exoplayer2.util.ParsableByteArray r3) {
            r2 = this;
            byte[] r0 = r3.getData()
            boolean r0 = isAudioPacket(r0)
            if (r0 != 0) goto Ld
            r0 = -1
            return r0
        Ld:
            int r3 = r2.getFlacFrameBlockSize(r3)
            long r0 = (long) r3
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean readHeaders(com.google.android.exoplayer2.util.ParsableByteArray r7, long r8, com.google.android.exoplayer2.extractor.ogg.StreamReader.SetupData r10) {
            r6 = this;
            byte[] r0 = r7.getData()
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r1 = r6.streamMetadata
            r2 = 1
            if (r1 != 0) goto L24
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r8 = new com.google.android.exoplayer2.extractor.FlacStreamMetadata
            r9 = 17
            r8.<init>(r0, r9)
            r6.streamMetadata = r8
            r9 = 9
            int r7 = r7.limit()
            byte[] r7 = java.util.Arrays.copyOfRange(r0, r9, r7)
            r9 = 0
            com.google.android.exoplayer2.Format r7 = r8.getFormat(r7, r9)
            r10.format = r7
            return r2
        L24:
            r3 = 0
            r4 = r0[r3]
            r4 = r4 & 127(0x7f, float:1.78E-43)
            r5 = 3
            if (r4 != r5) goto L3e
            com.google.android.exoplayer2.extractor.FlacStreamMetadata$SeekTable r7 = com.google.android.exoplayer2.extractor.FlacMetadataReader.readSeekTableMetadataBlock(r7)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r8 = r1.copyWithSeekTable(r7)
            r6.streamMetadata = r8
            com.google.android.exoplayer2.extractor.ogg.FlacReader$FlacOggSeeker r9 = new com.google.android.exoplayer2.extractor.ogg.FlacReader$FlacOggSeeker
            r9.<init>(r8, r7)
            r6.flacOggSeeker = r9
            return r2
        L3e:
            boolean r7 = isAudioPacket(r0)
            if (r7 == 0) goto L55
            com.google.android.exoplayer2.extractor.ogg.FlacReader$FlacOggSeeker r7 = r6.flacOggSeeker
            if (r7 == 0) goto L4f
            r7.setFirstFrameOffset(r8)
            com.google.android.exoplayer2.extractor.ogg.FlacReader$FlacOggSeeker r7 = r6.flacOggSeeker
            r10.oggSeeker = r7
        L4f:
            com.google.android.exoplayer2.Format r7 = r10.format
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
            return r3
        L55:
            return r2
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public final void reset(boolean r1) {
            r0 = this;
            super.reset(r1)
            if (r1 == 0) goto La
            r1 = 0
            r0.streamMetadata = r1
            r0.flacOggSeeker = r1
        La:
            return
    }
}
