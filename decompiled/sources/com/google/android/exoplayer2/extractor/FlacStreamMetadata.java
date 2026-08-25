package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes2.dex */
public final class FlacStreamMetadata {
    public static final int NOT_IN_LOOKUP_TABLE = -1;
    private static final java.lang.String TAG = "FlacStreamMetadata";
    public final int bitsPerSample;
    public final int bitsPerSampleLookupKey;
    public final int channels;
    public final int maxBlockSizeSamples;
    public final int maxFrameSize;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.metadata.Metadata metadata;
    public final int minBlockSizeSamples;
    public final int minFrameSize;
    public final int sampleRate;
    public final int sampleRateLookupKey;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.extractor.FlacStreamMetadata.SeekTable seekTable;
    public final long totalSamples;

    /* JADX INFO: loaded from: classes.dex */
    public static class SeekTable {
        public final long[] pointOffsets;
        public final long[] pointSampleNumbers;

        public SeekTable(long[] r1, long[] r2) {
                r0 = this;
                r0.<init>()
                r0.pointSampleNumbers = r1
                r0.pointOffsets = r2
                return
        }
    }

    private FlacStreamMetadata(int r1, int r2, int r3, int r4, int r5, int r6, int r7, long r8, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.FlacStreamMetadata.SeekTable r10, @androidx.annotation.Nullable com.google.android.exoplayer2.metadata.Metadata r11) {
            r0 = this;
            r0.<init>()
            r0.minBlockSizeSamples = r1
            r0.maxBlockSizeSamples = r2
            r0.minFrameSize = r3
            r0.maxFrameSize = r4
            r0.sampleRate = r5
            int r1 = getSampleRateLookupKey(r5)
            r0.sampleRateLookupKey = r1
            r0.channels = r6
            r0.bitsPerSample = r7
            int r1 = getBitsPerSampleLookupKey(r7)
            r0.bitsPerSampleLookupKey = r1
            r0.totalSamples = r8
            r0.seekTable = r10
            r0.metadata = r11
            return
    }

    public FlacStreamMetadata(int r13, int r14, int r15, int r16, int r17, int r18, int r19, long r20, java.util.ArrayList<java.lang.String> r22, java.util.ArrayList<com.google.android.exoplayer2.metadata.flac.PictureFrame> r23) {
            r12 = this;
            com.google.android.exoplayer2.metadata.Metadata r11 = concatenateVorbisMetadata(r22, r23)
            r10 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11)
            return
    }

    public FlacStreamMetadata(byte[] r2, int r3) {
            r1 = this;
            r1.<init>()
            com.google.android.exoplayer2.util.ParsableBitArray r0 = new com.google.android.exoplayer2.util.ParsableBitArray
            r0.<init>(r2)
            int r3 = r3 * 8
            r0.setPosition(r3)
            r2 = 16
            int r3 = r0.readBits(r2)
            r1.minBlockSizeSamples = r3
            int r2 = r0.readBits(r2)
            r1.maxBlockSizeSamples = r2
            r2 = 24
            int r3 = r0.readBits(r2)
            r1.minFrameSize = r3
            int r2 = r0.readBits(r2)
            r1.maxFrameSize = r2
            r2 = 20
            int r2 = r0.readBits(r2)
            r1.sampleRate = r2
            int r2 = getSampleRateLookupKey(r2)
            r1.sampleRateLookupKey = r2
            r2 = 3
            int r2 = r0.readBits(r2)
            int r2 = r2 + 1
            r1.channels = r2
            r2 = 5
            int r2 = r0.readBits(r2)
            int r2 = r2 + 1
            r1.bitsPerSample = r2
            int r2 = getBitsPerSampleLookupKey(r2)
            r1.bitsPerSampleLookupKey = r2
            r2 = 36
            long r2 = r0.readBitsToLong(r2)
            r1.totalSamples = r2
            r2 = 0
            r1.seekTable = r2
            r1.metadata = r2
            return
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.Metadata concatenateVorbisMetadata(java.util.List<java.lang.String> r1, java.util.List<com.google.android.exoplayer2.metadata.flac.PictureFrame> r2) {
            com.google.android.exoplayer2.metadata.Metadata r1 = com.google.android.exoplayer2.extractor.VorbisUtil.parseVorbisComments(r1)
            if (r1 != 0) goto Le
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Le
            r1 = 0
            return r1
        Le:
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            r0.<init>(r2)
            com.google.android.exoplayer2.metadata.Metadata r1 = r0.copyWithAppendedEntriesFrom(r1)
            return r1
    }

    private static int getBitsPerSampleLookupKey(int r1) {
            r0 = 8
            if (r1 == r0) goto L1e
            r0 = 12
            if (r1 == r0) goto L1c
            r0 = 16
            if (r1 == r0) goto L1a
            r0 = 20
            if (r1 == r0) goto L18
            r0 = 24
            if (r1 == r0) goto L16
            r1 = -1
            return r1
        L16:
            r1 = 6
            return r1
        L18:
            r1 = 5
            return r1
        L1a:
            r1 = 4
            return r1
        L1c:
            r1 = 2
            return r1
        L1e:
            r1 = 1
            return r1
    }

    private static int getSampleRateLookupKey(int r0) {
            switch(r0) {
                case 8000: goto L1d;
                case 16000: goto L1b;
                case 22050: goto L19;
                case 24000: goto L17;
                case 32000: goto L14;
                case 44100: goto L11;
                case 48000: goto Le;
                case 88200: goto Lc;
                case 96000: goto L9;
                case 176400: goto L7;
                case 192000: goto L5;
                default: goto L3;
            }
        L3:
            r0 = -1
            return r0
        L5:
            r0 = 3
            return r0
        L7:
            r0 = 2
            return r0
        L9:
            r0 = 11
            return r0
        Lc:
            r0 = 1
            return r0
        Le:
            r0 = 10
            return r0
        L11:
            r0 = 9
            return r0
        L14:
            r0 = 8
            return r0
        L17:
            r0 = 7
            return r0
        L19:
            r0 = 6
            return r0
        L1b:
            r0 = 5
            return r0
        L1d:
            r0 = 4
            return r0
    }

    public com.google.android.exoplayer2.extractor.FlacStreamMetadata copyWithPictureFrames(java.util.List<com.google.android.exoplayer2.metadata.flac.PictureFrame> r14) {
            r13 = this;
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            r0.<init>(r14)
            com.google.android.exoplayer2.metadata.Metadata r12 = r13.getMetadataCopyWithAppendedEntriesFrom(r0)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r14 = new com.google.android.exoplayer2.extractor.FlacStreamMetadata
            int r2 = r13.minBlockSizeSamples
            int r3 = r13.maxBlockSizeSamples
            int r4 = r13.minFrameSize
            int r5 = r13.maxFrameSize
            int r6 = r13.sampleRate
            int r7 = r13.channels
            int r8 = r13.bitsPerSample
            long r9 = r13.totalSamples
            com.google.android.exoplayer2.extractor.FlacStreamMetadata$SeekTable r11 = r13.seekTable
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r11, r12)
            return r14
    }

    public com.google.android.exoplayer2.extractor.FlacStreamMetadata copyWithSeekTable(@androidx.annotation.Nullable com.google.android.exoplayer2.extractor.FlacStreamMetadata.SeekTable r14) {
            r13 = this;
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r12 = new com.google.android.exoplayer2.extractor.FlacStreamMetadata
            int r1 = r13.minBlockSizeSamples
            int r2 = r13.maxBlockSizeSamples
            int r3 = r13.minFrameSize
            int r4 = r13.maxFrameSize
            int r5 = r13.sampleRate
            int r6 = r13.channels
            int r7 = r13.bitsPerSample
            long r8 = r13.totalSamples
            com.google.android.exoplayer2.metadata.Metadata r11 = r13.metadata
            r0 = r12
            r10 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11)
            return r12
    }

    public com.google.android.exoplayer2.extractor.FlacStreamMetadata copyWithVorbisComments(java.util.List<java.lang.String> r13) {
            r12 = this;
            com.google.android.exoplayer2.metadata.Metadata r13 = com.google.android.exoplayer2.extractor.VorbisUtil.parseVorbisComments(r13)
            com.google.android.exoplayer2.metadata.Metadata r11 = r12.getMetadataCopyWithAppendedEntriesFrom(r13)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r13 = new com.google.android.exoplayer2.extractor.FlacStreamMetadata
            int r1 = r12.minBlockSizeSamples
            int r2 = r12.maxBlockSizeSamples
            int r3 = r12.minFrameSize
            int r4 = r12.maxFrameSize
            int r5 = r12.sampleRate
            int r6 = r12.channels
            int r7 = r12.bitsPerSample
            long r8 = r12.totalSamples
            com.google.android.exoplayer2.extractor.FlacStreamMetadata$SeekTable r10 = r12.seekTable
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11)
            return r13
    }

    public long getApproxBytesPerFrame() {
            r4 = this;
            int r0 = r4.maxFrameSize
            if (r0 <= 0) goto L10
            long r0 = (long) r0
            int r2 = r4.minFrameSize
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 2
            long r0 = r0 / r2
            r2 = 1
        Le:
            long r0 = r0 + r2
            goto L2c
        L10:
            int r0 = r4.minBlockSizeSamples
            int r1 = r4.maxBlockSizeSamples
            if (r0 != r1) goto L1a
            if (r0 <= 0) goto L1a
            long r0 = (long) r0
            goto L1c
        L1a:
            r0 = 4096(0x1000, double:2.0237E-320)
        L1c:
            int r2 = r4.channels
            long r2 = (long) r2
            long r0 = r0 * r2
            int r2 = r4.bitsPerSample
            long r2 = (long) r2
            long r0 = r0 * r2
            r2 = 8
            long r0 = r0 / r2
            r2 = 64
            goto Le
        L2c:
            return r0
    }

    public int getDecodedBitrate() {
            r2 = this;
            int r0 = r2.bitsPerSample
            int r1 = r2.sampleRate
            int r0 = r0 * r1
            int r1 = r2.channels
            int r0 = r0 * r1
            return r0
    }

    public long getDurationUs() {
            r5 = this;
            long r0 = r5.totalSamples
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L17
        Le:
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            int r2 = r5.sampleRate
            long r2 = (long) r2
            long r0 = r0 / r2
        L17:
            return r0
    }

    public com.google.android.exoplayer2.Format getFormat(byte[] r4, @androidx.annotation.Nullable com.google.android.exoplayer2.metadata.Metadata r5) {
            r3 = this;
            r0 = 4
            r1 = -128(0xffffffffffffff80, float:NaN)
            r4[r0] = r1
            int r0 = r3.maxFrameSize
            if (r0 <= 0) goto La
            goto Lb
        La:
            r0 = -1
        Lb:
            com.google.android.exoplayer2.metadata.Metadata r5 = r3.getMetadataCopyWithAppendedEntriesFrom(r5)
            com.google.android.exoplayer2.Format$Builder r1 = new com.google.android.exoplayer2.Format$Builder
            r1.<init>()
            java.lang.String r2 = "audio/flac"
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleMimeType(r2)
            com.google.android.exoplayer2.Format$Builder r0 = r1.setMaxInputSize(r0)
            int r1 = r3.channels
            com.google.android.exoplayer2.Format$Builder r0 = r0.setChannelCount(r1)
            int r1 = r3.sampleRate
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleRate(r1)
            java.util.List r4 = java.util.Collections.singletonList(r4)
            com.google.android.exoplayer2.Format$Builder r4 = r0.setInitializationData(r4)
            com.google.android.exoplayer2.Format$Builder r4 = r4.setMetadata(r5)
            com.google.android.exoplayer2.Format r4 = r4.build()
            return r4
    }

    public int getMaxDecodedFrameSize() {
            r2 = this;
            int r0 = r2.maxBlockSizeSamples
            int r1 = r2.channels
            int r0 = r0 * r1
            int r1 = r2.bitsPerSample
            int r1 = r1 / 8
            int r1 = r1 * r0
            return r1
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.metadata.Metadata getMetadataCopyWithAppendedEntriesFrom(@androidx.annotation.Nullable com.google.android.exoplayer2.metadata.Metadata r2) {
            r1 = this;
            com.google.android.exoplayer2.metadata.Metadata r0 = r1.metadata
            if (r0 != 0) goto L5
            goto L9
        L5:
            com.google.android.exoplayer2.metadata.Metadata r2 = r0.copyWithAppendedEntriesFrom(r2)
        L9:
            return r2
    }

    public long getSampleNumber(long r9) {
            r8 = this;
            int r0 = r8.sampleRate
            long r0 = (long) r0
            long r9 = r9 * r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r9 / r0
            long r9 = r8.totalSamples
            r0 = 1
            long r6 = r9 - r0
            r4 = 0
            long r9 = com.google.android.exoplayer2.util.Util.constrainValue(r2, r4, r6)
            return r9
    }
}
