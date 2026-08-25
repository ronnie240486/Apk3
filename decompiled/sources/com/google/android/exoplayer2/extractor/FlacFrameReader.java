package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class FlacFrameReader {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class SampleNumberHolder {
        public long sampleNumber;

        public SampleNumberHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private FlacFrameReader() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean checkAndReadBlockSizeSamples(com.google.android.exoplayer2.util.ParsableByteArray r0, com.google.android.exoplayer2.extractor.FlacStreamMetadata r1, int r2) {
            int r0 = readFrameBlockSizeSamplesFromKey(r0, r2)
            r2 = -1
            if (r0 == r2) goto Ld
            int r1 = r1.maxBlockSizeSamples
            if (r0 > r1) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    private static boolean checkAndReadCrc(com.google.android.exoplayer2.util.ParsableByteArray r4, int r5) {
            int r0 = r4.readUnsignedByte()
            int r1 = r4.getPosition()
            byte[] r4 = r4.getData()
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            int r4 = com.google.android.exoplayer2.util.Util.crc8(r4, r5, r1, r3)
            if (r0 != r4) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    private static boolean checkAndReadFirstSampleNumber(com.google.android.exoplayer2.util.ParsableByteArray r2, com.google.android.exoplayer2.extractor.FlacStreamMetadata r3, boolean r4, com.google.android.exoplayer2.extractor.FlacFrameReader.SampleNumberHolder r5) {
            long r0 = r2.readUtf8EncodedLong()     // Catch: java.lang.NumberFormatException -> L10
            if (r4 == 0) goto L7
            goto Lc
        L7:
            int r2 = r3.maxBlockSizeSamples
            long r2 = (long) r2
            long r0 = r0 * r2
        Lc:
            r5.sampleNumber = r0
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    public static boolean checkAndReadFrameHeader(com.google.android.exoplayer2.util.ParsableByteArray r17, com.google.android.exoplayer2.extractor.FlacStreamMetadata r18, int r19, com.google.android.exoplayer2.extractor.FlacFrameReader.SampleNumberHolder r20) {
            r0 = r17
            r1 = r18
            int r2 = r17.getPosition()
            long r3 = r17.readUnsignedInt()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r19
            long r7 = (long) r7
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L19
            return r9
        L19:
            r7 = 1
            long r5 = r5 & r7
            r10 = 1
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L23
            r5 = 1
            goto L24
        L23:
            r5 = 0
        L24:
            r6 = 12
            long r11 = r3 >> r6
            r13 = 15
            long r11 = r11 & r13
            int r6 = (int) r11
            r11 = 8
            long r11 = r3 >> r11
            long r11 = r11 & r13
            int r12 = (int) r11
            r11 = 4
            long r15 = r3 >> r11
            long r13 = r13 & r15
            int r11 = (int) r13
            long r13 = r3 >> r10
            r15 = 7
            long r13 = r13 & r15
            int r14 = (int) r13
            long r3 = r3 & r7
            int r13 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r13 != 0) goto L44
            r3 = 1
            goto L45
        L44:
            r3 = 0
        L45:
            boolean r4 = checkChannelAssignment(r11, r1)
            if (r4 == 0) goto L6e
            boolean r4 = checkBitsPerSample(r14, r1)
            if (r4 == 0) goto L6e
            if (r3 != 0) goto L6e
            r3 = r20
            boolean r3 = checkAndReadFirstSampleNumber(r0, r1, r5, r3)
            if (r3 == 0) goto L6e
            boolean r3 = checkAndReadBlockSizeSamples(r0, r1, r6)
            if (r3 == 0) goto L6e
            boolean r1 = checkAndReadSampleRate(r0, r1, r12)
            if (r1 == 0) goto L6e
            boolean r0 = checkAndReadCrc(r0, r2)
            if (r0 == 0) goto L6e
            r9 = 1
        L6e:
            return r9
    }

    private static boolean checkAndReadSampleRate(com.google.android.exoplayer2.util.ParsableByteArray r4, com.google.android.exoplayer2.extractor.FlacStreamMetadata r5, int r6) {
            int r0 = r5.sampleRate
            r1 = 1
            if (r6 != 0) goto L6
            return r1
        L6:
            r2 = 11
            r3 = 0
            if (r6 > r2) goto L12
            int r4 = r5.sampleRateLookupKey
            if (r6 != r4) goto L10
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
        L12:
            r5 = 12
            if (r6 != r5) goto L21
            int r4 = r4.readUnsignedByte()
            int r4 = r4 * 1000
            if (r4 != r0) goto L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            return r1
        L21:
            r5 = 14
            if (r6 > r5) goto L32
            int r4 = r4.readUnsignedShort()
            if (r6 != r5) goto L2d
            int r4 = r4 * 10
        L2d:
            if (r4 != r0) goto L30
            goto L31
        L30:
            r1 = 0
        L31:
            return r1
        L32:
            return r3
    }

    private static boolean checkBitsPerSample(int r1, com.google.android.exoplayer2.extractor.FlacStreamMetadata r2) {
            r0 = 1
            if (r1 != 0) goto L4
            return r0
        L4:
            int r2 = r2.bitsPerSampleLookupKey
            if (r1 != r2) goto L9
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    private static boolean checkChannelAssignment(int r3, com.google.android.exoplayer2.extractor.FlacStreamMetadata r4) {
            r0 = 0
            r1 = 1
            r2 = 7
            if (r3 > r2) goto Lc
            int r4 = r4.channels
            int r4 = r4 - r1
            if (r3 != r4) goto Lb
            r0 = 1
        Lb:
            return r0
        Lc:
            r2 = 10
            if (r3 > r2) goto L16
            int r3 = r4.channels
            r4 = 2
            if (r3 != r4) goto L16
            r0 = 1
        L16:
            return r0
    }

    public static boolean checkFrameHeaderFromPeek(com.google.android.exoplayer2.extractor.ExtractorInput r7, com.google.android.exoplayer2.extractor.FlacStreamMetadata r8, int r9, com.google.android.exoplayer2.extractor.FlacFrameReader.SampleNumberHolder r10) throws java.io.IOException {
            long r0 = r7.getPeekPosition()
            r2 = 2
            byte[] r3 = new byte[r2]
            r4 = 0
            r7.peekFully(r3, r4, r2)
            r5 = r3[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r6 = 1
            r6 = r3[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            if (r5 == r9) goto L26
            r7.resetPeekPosition()
            long r8 = r7.getPosition()
            long r0 = r0 - r8
            int r8 = (int) r0
            r7.advancePeekPosition(r8)
            return r4
        L26:
            com.google.android.exoplayer2.util.ParsableByteArray r5 = new com.google.android.exoplayer2.util.ParsableByteArray
            r6 = 16
            r5.<init>(r6)
            byte[] r6 = r5.getData()
            java.lang.System.arraycopy(r3, r4, r6, r4, r2)
            byte[] r3 = r5.getData()
            r4 = 14
            int r2 = com.google.android.exoplayer2.extractor.ExtractorUtil.peekToLength(r7, r3, r2, r4)
            r5.setLimit(r2)
            r7.resetPeekPosition()
            long r2 = r7.getPosition()
            long r0 = r0 - r2
            int r1 = (int) r0
            r7.advancePeekPosition(r1)
            boolean r7 = checkAndReadFrameHeader(r5, r8, r9, r10)
            return r7
    }

    public static long getFirstSampleNumber(com.google.android.exoplayer2.extractor.ExtractorInput r5, com.google.android.exoplayer2.extractor.FlacStreamMetadata r6) throws java.io.IOException {
            r5.resetPeekPosition()
            r0 = 1
            r5.advancePeekPosition(r0)
            byte[] r1 = new byte[r0]
            r2 = 0
            r5.peekFully(r1, r2, r0)
            r1 = r1[r2]
            r1 = r1 & r0
            if (r1 != r0) goto L13
            goto L14
        L13:
            r0 = 0
        L14:
            r1 = 2
            r5.advancePeekPosition(r1)
            if (r0 == 0) goto L1c
            r1 = 7
            goto L1d
        L1c:
            r1 = 6
        L1d:
            com.google.android.exoplayer2.util.ParsableByteArray r3 = new com.google.android.exoplayer2.util.ParsableByteArray
            r3.<init>(r1)
            byte[] r4 = r3.getData()
            int r1 = com.google.android.exoplayer2.extractor.ExtractorUtil.peekToLength(r5, r4, r2, r1)
            r3.setLimit(r1)
            r5.resetPeekPosition()
            com.google.android.exoplayer2.extractor.FlacFrameReader$SampleNumberHolder r5 = new com.google.android.exoplayer2.extractor.FlacFrameReader$SampleNumberHolder
            r5.<init>()
            boolean r6 = checkAndReadFirstSampleNumber(r3, r6, r0, r5)
            if (r6 == 0) goto L3e
            long r5 = r5.sampleNumber
            return r5
        L3e:
            r5 = 0
            com.google.android.exoplayer2.ParserException r5 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r5, r5)
            throw r5
    }

    public static int readFrameBlockSizeSamplesFromKey(com.google.android.exoplayer2.util.ParsableByteArray r0, int r1) {
            switch(r1) {
                case 1: goto L1f;
                case 2: goto L19;
                case 3: goto L19;
                case 4: goto L19;
                case 5: goto L19;
                case 6: goto L12;
                case 7: goto Lb;
                case 8: goto L5;
                case 9: goto L5;
                case 10: goto L5;
                case 11: goto L5;
                case 12: goto L5;
                case 13: goto L5;
                case 14: goto L5;
                case 15: goto L5;
                default: goto L3;
            }
        L3:
            r0 = -1
            return r0
        L5:
            r0 = 256(0x100, float:3.59E-43)
            int r1 = r1 + (-8)
            int r0 = r0 << r1
            return r0
        Lb:
            int r0 = r0.readUnsignedShort()
            int r0 = r0 + 1
            return r0
        L12:
            int r0 = r0.readUnsignedByte()
            int r0 = r0 + 1
            return r0
        L19:
            r0 = 576(0x240, float:8.07E-43)
            int r1 = r1 + (-2)
            int r0 = r0 << r1
            return r0
        L1f:
            r0 = 192(0xc0, float:2.69E-43)
            return r0
    }
}
