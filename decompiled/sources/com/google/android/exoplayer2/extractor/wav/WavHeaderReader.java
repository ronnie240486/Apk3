package com.google.android.exoplayer2.extractor.wav;

/* JADX INFO: loaded from: classes2.dex */
final class WavHeaderReader {
    private static final java.lang.String TAG = "WavHeaderReader";

    /* JADX INFO: loaded from: classes.dex */
    public static final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;
        public final int id;
        public final long size;

        private ChunkHeader(int r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.id = r1
                r0.size = r2
                return
        }

        public static com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader peek(com.google.android.exoplayer2.extractor.ExtractorInput r3, com.google.android.exoplayer2.util.ParsableByteArray r4) throws java.io.IOException {
                byte[] r0 = r4.getData()
                r1 = 0
                r2 = 8
                r3.peekFully(r0, r1, r2)
                r4.setPosition(r1)
                int r3 = r4.readInt()
                long r0 = r4.readLittleEndianUnsignedInt()
                com.google.android.exoplayer2.extractor.wav.WavHeaderReader$ChunkHeader r4 = new com.google.android.exoplayer2.extractor.wav.WavHeaderReader$ChunkHeader
                r4.<init>(r3, r0)
                return r4
        }
    }

    private WavHeaderReader() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean checkFileType(com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 8
            r0.<init>(r1)
            com.google.android.exoplayer2.extractor.wav.WavHeaderReader$ChunkHeader r1 = com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader.peek(r4, r0)
            int r1 = r1.id
            r2 = 0
            r3 = 1380533830(0x52494646, float:2.1611685E11)
            if (r1 == r3) goto L19
            r3 = 1380333108(0x52463634, float:2.1282823E11)
            if (r1 == r3) goto L19
            return r2
        L19:
            byte[] r1 = r0.getData()
            r3 = 4
            r4.peekFully(r1, r2, r3)
            r0.setPosition(r2)
            int r4 = r0.readInt()
            r0 = 1463899717(0x57415645, float:2.1257627E14)
            if (r4 == r0) goto L44
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported form type: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "WavHeaderReader"
            com.google.android.exoplayer2.util.Log.e(r0, r4)
            return r2
        L44:
            r4 = 1
            return r4
    }

    public static com.google.android.exoplayer2.extractor.wav.WavFormat readFormat(com.google.android.exoplayer2.extractor.ExtractorInput r14) throws java.io.IOException {
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 16
            r0.<init>(r1)
            r2 = 1718449184(0x666d7420, float:2.8033575E23)
            com.google.android.exoplayer2.extractor.wav.WavHeaderReader$ChunkHeader r2 = skipToChunk(r2, r14, r0)
            long r3 = r2.size
            r5 = 0
            r6 = 16
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 < 0) goto L19
            r3 = 1
            goto L1a
        L19:
            r3 = 0
        L1a:
            com.google.android.exoplayer2.util.Assertions.checkState(r3)
            byte[] r3 = r0.getData()
            r14.peekFully(r3, r5, r1)
            r0.setPosition(r5)
            int r7 = r0.readLittleEndianUnsignedShort()
            int r8 = r0.readLittleEndianUnsignedShort()
            int r9 = r0.readLittleEndianUnsignedIntToInt()
            int r10 = r0.readLittleEndianUnsignedIntToInt()
            int r11 = r0.readLittleEndianUnsignedShort()
            int r12 = r0.readLittleEndianUnsignedShort()
            long r2 = r2.size
            int r0 = (int) r2
            int r0 = r0 - r1
            if (r0 <= 0) goto L4c
            byte[] r1 = new byte[r0]
            r14.peekFully(r1, r5, r0)
            r13 = r1
            goto L4f
        L4c:
            byte[] r0 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
            r13 = r0
        L4f:
            long r0 = r14.getPeekPosition()
            long r2 = r14.getPosition()
            long r0 = r0 - r2
            int r1 = (int) r0
            r14.skipFully(r1)
            com.google.android.exoplayer2.extractor.wav.WavFormat r14 = new com.google.android.exoplayer2.extractor.wav.WavFormat
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r14
    }

    public static long readRf64SampleDataSize(com.google.android.exoplayer2.extractor.ExtractorInput r7) throws java.io.IOException {
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 8
            r0.<init>(r1)
            com.google.android.exoplayer2.extractor.wav.WavHeaderReader$ChunkHeader r2 = com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader.peek(r7, r0)
            int r3 = r2.id
            r4 = 1685272116(0x64733634, float:1.7945858E22)
            if (r3 == r4) goto L18
            r7.resetPeekPosition()
            r0 = -1
            return r0
        L18:
            r7.advancePeekPosition(r1)
            r3 = 0
            r0.setPosition(r3)
            byte[] r4 = r0.getData()
            r7.peekFully(r4, r3, r1)
            long r3 = r0.readLittleEndianLong()
            long r5 = r2.size
            int r0 = (int) r5
            int r0 = r0 + r1
            r7.skipFully(r0)
            return r3
    }

    private static com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader skipToChunk(int r6, com.google.android.exoplayer2.extractor.ExtractorInput r7, com.google.android.exoplayer2.util.ParsableByteArray r8) throws java.io.IOException {
            com.google.android.exoplayer2.extractor.wav.WavHeaderReader$ChunkHeader r0 = com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader.peek(r7, r8)
        L4:
            int r1 = r0.id
            if (r1 == r6) goto L45
            java.lang.String r1 = "Ignoring unknown WAV chunk: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r2 = r0.id
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "WavHeaderReader"
            com.google.android.exoplayer2.util.Log.w(r2, r1)
            r1 = 8
            long r3 = r0.size
            long r3 = r3 + r1
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L31
            int r0 = (int) r3
            r7.skipFully(r0)
            com.google.android.exoplayer2.extractor.wav.WavHeaderReader$ChunkHeader r0 = com.google.android.exoplayer2.extractor.wav.WavHeaderReader.ChunkHeader.peek(r7, r8)
            goto L4
        L31:
            java.lang.String r6 = "Chunk is too large (~2GB+) to skip; id: "
            java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            int r7 = r0.id
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.google.android.exoplayer2.ParserException r6 = com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature(r6)
            throw r6
        L45:
            return r0
    }

    public static android.util.Pair<java.lang.Long, java.lang.Long> skipToSampleData(com.google.android.exoplayer2.extractor.ExtractorInput r3) throws java.io.IOException {
            r3.resetPeekPosition()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 8
            r0.<init>(r1)
            r2 = 1684108385(0x64617461, float:1.6635614E22)
            com.google.android.exoplayer2.extractor.wav.WavHeaderReader$ChunkHeader r0 = skipToChunk(r2, r3, r0)
            r3.skipFully(r1)
            long r1 = r3.getPosition()
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            long r0 = r0.size
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            android.util.Pair r3 = android.util.Pair.create(r3, r0)
            return r3
    }
}
