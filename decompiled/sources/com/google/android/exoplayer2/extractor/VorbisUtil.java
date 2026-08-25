package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class VorbisUtil {
    private static final java.lang.String TAG = "VorbisUtil";

    /* JADX INFO: loaded from: classes2.dex */
    public static final class CodeBook {
        public final int dimensions;
        public final int entries;
        public final boolean isOrdered;
        public final long[] lengthMap;
        public final int lookupType;

        public CodeBook(int r1, int r2, long[] r3, int r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.dimensions = r1
                r0.entries = r2
                r0.lengthMap = r3
                r0.lookupType = r4
                r0.isOrdered = r5
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class CommentHeader {
        public final java.lang.String[] comments;
        public final int length;
        public final java.lang.String vendor;

        public CommentHeader(java.lang.String r1, java.lang.String[] r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.vendor = r1
                r0.comments = r2
                r0.length = r3
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Mode {
        public final boolean blockFlag;
        public final int mapping;
        public final int transformType;
        public final int windowType;

        public Mode(boolean r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.blockFlag = r1
                r0.windowType = r2
                r0.transformType = r3
                r0.mapping = r4
                return
        }
    }

    public static final class VorbisIdHeader {
        public final int bitrateMaximum;
        public final int bitrateMinimum;
        public final int bitrateNominal;
        public final int blockSize0;
        public final int blockSize1;
        public final int channels;
        public final byte[] data;
        public final boolean framingFlag;
        public final int sampleRate;
        public final int version;

        public VorbisIdHeader(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, boolean r9, byte[] r10) {
                r0 = this;
                r0.<init>()
                r0.version = r1
                r0.channels = r2
                r0.sampleRate = r3
                r0.bitrateMaximum = r4
                r0.bitrateNominal = r5
                r0.bitrateMinimum = r6
                r0.blockSize0 = r7
                r0.blockSize1 = r8
                r0.framingFlag = r9
                r0.data = r10
                return
        }
    }

    private VorbisUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int iLog(int r1) {
            r0 = 0
        L1:
            if (r1 <= 0) goto L8
            int r0 = r0 + 1
            int r1 = r1 >>> 1
            goto L1
        L8:
            return r0
    }

    private static long mapType1QuantValues(long r2, long r4) {
            double r2 = (double) r2
            double r4 = (double) r4
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 / r4
            double r2 = java.lang.Math.pow(r2, r0)
            double r2 = java.lang.Math.floor(r2)
            long r2 = (long) r2
            return r2
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.metadata.Metadata parseVorbisComments(java.util.List<java.lang.String> r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r8.size()
            if (r2 >= r3) goto L59
            java.lang.Object r3 = r8.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "="
            java.lang.String[] r4 = com.google.android.exoplayer2.util.Util.splitAtFirst(r3, r4)
            int r5 = r4.length
            r6 = 2
            java.lang.String r7 = "VorbisUtil"
            if (r5 == r6) goto L25
            java.lang.String r4 = "Failed to parse Vorbis comment: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r4, r3, r7)
            goto L56
        L25:
            r3 = r4[r1]
            java.lang.String r5 = "METADATA_BLOCK_PICTURE"
            boolean r3 = r3.equals(r5)
            r5 = 1
            if (r3 == 0) goto L4a
            r3 = r4[r5]     // Catch: java.lang.RuntimeException -> L43
            byte[] r3 = android.util.Base64.decode(r3, r1)     // Catch: java.lang.RuntimeException -> L43
            com.google.android.exoplayer2.util.ParsableByteArray r4 = new com.google.android.exoplayer2.util.ParsableByteArray     // Catch: java.lang.RuntimeException -> L43
            r4.<init>(r3)     // Catch: java.lang.RuntimeException -> L43
            com.google.android.exoplayer2.metadata.flac.PictureFrame r3 = com.google.android.exoplayer2.metadata.flac.PictureFrame.fromPictureBlock(r4)     // Catch: java.lang.RuntimeException -> L43
            r0.add(r3)     // Catch: java.lang.RuntimeException -> L43
            goto L56
        L43:
            r3 = move-exception
            java.lang.String r4 = "Failed to parse vorbis picture"
            com.google.android.exoplayer2.util.Log.w(r7, r4, r3)
            goto L56
        L4a:
            com.google.android.exoplayer2.metadata.vorbis.VorbisComment r3 = new com.google.android.exoplayer2.metadata.vorbis.VorbisComment
            r6 = r4[r1]
            r4 = r4[r5]
            r3.<init>(r6, r4)
            r0.add(r3)
        L56:
            int r2 = r2 + 1
            goto L7
        L59:
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L61
            r8 = 0
            goto L66
        L61:
            com.google.android.exoplayer2.metadata.Metadata r8 = new com.google.android.exoplayer2.metadata.Metadata
            r8.<init>(r0)
        L66:
            return r8
    }

    private static com.google.android.exoplayer2.extractor.VorbisUtil.CodeBook readBook(com.google.android.exoplayer2.extractor.VorbisBitArray r14) throws com.google.android.exoplayer2.ParserException {
            r0 = 24
            int r1 = r14.readBits(r0)
            r2 = 0
            r3 = 5653314(0x564342, float:7.92198E-39)
            if (r1 != r3) goto Lb9
            r1 = 16
            int r4 = r14.readBits(r1)
            int r5 = r14.readBits(r0)
            long[] r6 = new long[r5]
            boolean r8 = r14.readBit()
            r0 = 0
            r3 = 0
            r7 = 5
            r9 = 1
            if (r8 != 0) goto L48
            boolean r10 = r14.readBit()
        L27:
            if (r3 >= r5) goto L6a
            if (r10 == 0) goto L3d
            boolean r11 = r14.readBit()
            if (r11 == 0) goto L3a
            int r11 = r14.readBits(r7)
            int r11 = r11 + r9
            long r11 = (long) r11
            r6[r3] = r11
            goto L45
        L3a:
            r6[r3] = r0
            goto L45
        L3d:
            int r11 = r14.readBits(r7)
            int r11 = r11 + r9
            long r11 = (long) r11
            r6[r3] = r11
        L45:
            int r3 = r3 + 1
            goto L27
        L48:
            int r3 = r14.readBits(r7)
            int r3 = r3 + r9
            r7 = 0
        L4e:
            if (r7 >= r5) goto L6a
            int r10 = r5 - r7
            int r10 = iLog(r10)
            int r10 = r14.readBits(r10)
            r11 = 0
        L5b:
            if (r11 >= r10) goto L67
            if (r7 >= r5) goto L67
            long r12 = (long) r3
            r6[r7] = r12
            int r7 = r7 + 1
            int r11 = r11 + 1
            goto L5b
        L67:
            int r3 = r3 + 1
            goto L4e
        L6a:
            r3 = 4
            int r7 = r14.readBits(r3)
            r10 = 2
            if (r7 > r10) goto La3
            if (r7 == r9) goto L76
            if (r7 != r10) goto L9c
        L76:
            r2 = 32
            r14.skipBits(r2)
            r14.skipBits(r2)
            int r2 = r14.readBits(r3)
            int r2 = r2 + r9
            r14.skipBits(r9)
            if (r7 != r9) goto L91
            if (r4 == 0) goto L95
            long r0 = (long) r5
            long r9 = (long) r4
            long r0 = mapType1QuantValues(r0, r9)
            goto L95
        L91:
            long r0 = (long) r5
            long r9 = (long) r4
            long r0 = r0 * r9
        L95:
            long r2 = (long) r2
            long r0 = r0 * r2
            int r1 = (int) r0
            r14.skipBits(r1)
        L9c:
            com.google.android.exoplayer2.extractor.VorbisUtil$CodeBook r14 = new com.google.android.exoplayer2.extractor.VorbisUtil$CodeBook
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            return r14
        La3:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "lookup type greater than 2 not decodable: "
            r14.append(r0)
            r14.append(r7)
            java.lang.String r14 = r14.toString()
            com.google.android.exoplayer2.ParserException r14 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r14, r2)
            throw r14
        Lb9:
            java.lang.String r0 = "expected code book to start with [0x56, 0x43, 0x42] at "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r14 = r14.getPosition()
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            com.google.android.exoplayer2.ParserException r14 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r14, r2)
            throw r14
    }

    private static void readFloors(com.google.android.exoplayer2.extractor.VorbisBitArray r15) throws com.google.android.exoplayer2.ParserException {
            r0 = 6
            int r1 = r15.readBits(r0)
            r2 = 1
            int r1 = r1 + r2
            r3 = 0
            r4 = 0
        L9:
            if (r4 >= r1) goto Lad
            r5 = 16
            int r6 = r15.readBits(r5)
            r7 = 4
            r8 = 8
            if (r6 == 0) goto L8c
            if (r6 != r2) goto L75
            r5 = 5
            int r5 = r15.readBits(r5)
            r6 = -1
            int[] r9 = new int[r5]
            r10 = 0
        L21:
            if (r10 >= r5) goto L32
            int r11 = r15.readBits(r7)
            r9[r10] = r11
            r11 = r9[r10]
            if (r11 <= r6) goto L2f
            r6 = r9[r10]
        L2f:
            int r10 = r10 + 1
            goto L21
        L32:
            int r6 = r6 + 1
            int[] r10 = new int[r6]
            r11 = 0
        L37:
            r12 = 2
            if (r11 >= r6) goto L59
            r13 = 3
            int r13 = r15.readBits(r13)
            int r13 = r13 + r2
            r10[r11] = r13
            int r12 = r15.readBits(r12)
            if (r12 <= 0) goto L4b
            r15.skipBits(r8)
        L4b:
            r13 = 0
        L4c:
            int r14 = r2 << r12
            if (r13 >= r14) goto L56
            r15.skipBits(r8)
            int r13 = r13 + 1
            goto L4c
        L56:
            int r11 = r11 + 1
            goto L37
        L59:
            r15.skipBits(r12)
            int r6 = r15.readBits(r7)
            r7 = 0
            r8 = 0
            r11 = 0
        L63:
            if (r7 >= r5) goto La9
            r12 = r9[r7]
            r12 = r10[r12]
            int r8 = r8 + r12
        L6a:
            if (r11 >= r8) goto L72
            r15.skipBits(r6)
            int r11 = r11 + 1
            goto L6a
        L72:
            int r7 = r7 + 1
            goto L63
        L75:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "floor type greater than 1 not decodable: "
            r15.append(r0)
            r15.append(r6)
            java.lang.String r15 = r15.toString()
            r0 = 0
            com.google.android.exoplayer2.ParserException r15 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r15, r0)
            throw r15
        L8c:
            r15.skipBits(r8)
            r15.skipBits(r5)
            r15.skipBits(r5)
            r15.skipBits(r0)
            r15.skipBits(r8)
            int r5 = r15.readBits(r7)
            int r5 = r5 + r2
            r6 = 0
        La1:
            if (r6 >= r5) goto La9
            r15.skipBits(r8)
            int r6 = r6 + 1
            goto La1
        La9:
            int r4 = r4 + 1
            goto L9
        Lad:
            return
    }

    private static void readMappings(int r11, com.google.android.exoplayer2.extractor.VorbisBitArray r12) throws com.google.android.exoplayer2.ParserException {
            r0 = 6
            int r0 = r12.readBits(r0)
            r1 = 1
            int r0 = r0 + r1
            r2 = 0
            r3 = 0
        L9:
            if (r3 >= r0) goto L88
            r4 = 16
            int r4 = r12.readBits(r4)
            if (r4 == 0) goto L2a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "mapping type other than 0 not supported: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "VorbisUtil"
            com.google.android.exoplayer2.util.Log.e(r5, r4)
            goto L7c
        L2a:
            boolean r4 = r12.readBit()
            r5 = 4
            if (r4 == 0) goto L37
            int r4 = r12.readBits(r5)
            int r4 = r4 + r1
            goto L38
        L37:
            r4 = 1
        L38:
            boolean r6 = r12.readBit()
            r7 = 8
            if (r6 == 0) goto L5b
            int r6 = r12.readBits(r7)
            int r6 = r6 + r1
            r8 = 0
        L46:
            if (r8 >= r6) goto L5b
            int r9 = r11 + (-1)
            int r10 = iLog(r9)
            r12.skipBits(r10)
            int r9 = iLog(r9)
            r12.skipBits(r9)
            int r8 = r8 + 1
            goto L46
        L5b:
            r6 = 2
            int r6 = r12.readBits(r6)
            if (r6 != 0) goto L7f
            if (r4 <= r1) goto L6d
            r6 = 0
        L65:
            if (r6 >= r11) goto L6d
            r12.skipBits(r5)
            int r6 = r6 + 1
            goto L65
        L6d:
            r5 = 0
        L6e:
            if (r5 >= r4) goto L7c
            r12.skipBits(r7)
            r12.skipBits(r7)
            r12.skipBits(r7)
            int r5 = r5 + 1
            goto L6e
        L7c:
            int r3 = r3 + 1
            goto L9
        L7f:
            r11 = 0
            java.lang.String r12 = "to reserved bits must be zero after mapping coupling steps"
            com.google.android.exoplayer2.ParserException r11 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r12, r11)
            throw r11
        L88:
            return
    }

    private static com.google.android.exoplayer2.extractor.VorbisUtil.Mode[] readModes(com.google.android.exoplayer2.extractor.VorbisBitArray r8) {
            r0 = 6
            int r0 = r8.readBits(r0)
            int r0 = r0 + 1
            com.google.android.exoplayer2.extractor.VorbisUtil$Mode[] r1 = new com.google.android.exoplayer2.extractor.VorbisUtil.Mode[r0]
            r2 = 0
        La:
            if (r2 >= r0) goto L2a
            boolean r3 = r8.readBit()
            r4 = 16
            int r5 = r8.readBits(r4)
            int r4 = r8.readBits(r4)
            r6 = 8
            int r6 = r8.readBits(r6)
            com.google.android.exoplayer2.extractor.VorbisUtil$Mode r7 = new com.google.android.exoplayer2.extractor.VorbisUtil$Mode
            r7.<init>(r3, r5, r4, r6)
            r1[r2] = r7
            int r2 = r2 + 1
            goto La
        L2a:
            return r1
    }

    private static void readResidues(com.google.android.exoplayer2.extractor.VorbisBitArray r12) throws com.google.android.exoplayer2.ParserException {
            r0 = 6
            int r1 = r12.readBits(r0)
            r2 = 1
            int r1 = r1 + r2
            r3 = 0
            r4 = 0
        L9:
            if (r4 >= r1) goto L6a
            r5 = 16
            int r5 = r12.readBits(r5)
            r6 = 2
            if (r5 > r6) goto L61
            r5 = 24
            r12.skipBits(r5)
            r12.skipBits(r5)
            r12.skipBits(r5)
            int r5 = r12.readBits(r0)
            int r5 = r5 + r2
            r6 = 8
            r12.skipBits(r6)
            int[] r7 = new int[r5]
            r8 = 0
        L2c:
            if (r8 >= r5) goto L48
            r9 = 3
            int r9 = r12.readBits(r9)
            boolean r10 = r12.readBit()
            if (r10 == 0) goto L3f
            r10 = 5
            int r10 = r12.readBits(r10)
            goto L40
        L3f:
            r10 = 0
        L40:
            int r10 = r10 * 8
            int r10 = r10 + r9
            r7[r8] = r10
            int r8 = r8 + 1
            goto L2c
        L48:
            r8 = 0
        L49:
            if (r8 >= r5) goto L5e
            r9 = 0
        L4c:
            if (r9 >= r6) goto L5b
            r10 = r7[r8]
            int r11 = r2 << r9
            r10 = r10 & r11
            if (r10 == 0) goto L58
            r12.skipBits(r6)
        L58:
            int r9 = r9 + 1
            goto L4c
        L5b:
            int r8 = r8 + 1
            goto L49
        L5e:
            int r4 = r4 + 1
            goto L9
        L61:
            r12 = 0
            java.lang.String r0 = "residueType greater than 2 is not decodable"
            com.google.android.exoplayer2.ParserException r12 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r12)
            throw r12
        L6a:
            return
    }

    public static com.google.android.exoplayer2.extractor.VorbisUtil.CommentHeader readVorbisCommentHeader(com.google.android.exoplayer2.util.ParsableByteArray r1) throws com.google.android.exoplayer2.ParserException {
            r0 = 1
            com.google.android.exoplayer2.extractor.VorbisUtil$CommentHeader r1 = readVorbisCommentHeader(r1, r0, r0)
            return r1
    }

    public static com.google.android.exoplayer2.extractor.VorbisUtil.CommentHeader readVorbisCommentHeader(com.google.android.exoplayer2.util.ParsableByteArray r8, boolean r9, boolean r10) throws com.google.android.exoplayer2.ParserException {
            r0 = 0
            if (r9 == 0) goto L7
            r9 = 3
            verifyVorbisHeaderCapturePattern(r9, r8, r0)
        L7:
            long r1 = r8.readLittleEndianUnsignedInt()
            int r9 = (int) r1
            java.lang.String r9 = r8.readString(r9)
            int r1 = r9.length()
            int r1 = r1 + 11
            long r2 = r8.readLittleEndianUnsignedInt()
            int r4 = (int) r2
            java.lang.String[] r4 = new java.lang.String[r4]
            int r1 = r1 + 4
        L1f:
            long r5 = (long) r0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L3b
            long r5 = r8.readLittleEndianUnsignedInt()
            int r6 = (int) r5
            int r1 = r1 + 4
            java.lang.String r5 = r8.readString(r6)
            r4[r0] = r5
            r5 = r4[r0]
            int r5 = r5.length()
            int r1 = r1 + r5
            int r0 = r0 + 1
            goto L1f
        L3b:
            if (r10 == 0) goto L4e
            int r8 = r8.readUnsignedByte()
            r8 = r8 & 1
            if (r8 == 0) goto L46
            goto L4e
        L46:
            r8 = 0
            java.lang.String r9 = "framing bit expected to be set"
            com.google.android.exoplayer2.ParserException r8 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r9, r8)
            throw r8
        L4e:
            int r1 = r1 + 1
            com.google.android.exoplayer2.extractor.VorbisUtil$CommentHeader r8 = new com.google.android.exoplayer2.extractor.VorbisUtil$CommentHeader
            r8.<init>(r9, r4, r1)
            return r8
    }

    public static com.google.android.exoplayer2.extractor.VorbisUtil.VorbisIdHeader readVorbisIdentificationHeader(com.google.android.exoplayer2.util.ParsableByteArray r16) throws com.google.android.exoplayer2.ParserException {
            r0 = 1
            r1 = 0
            r2 = r16
            verifyVorbisHeaderCapturePattern(r0, r2, r1)
            int r3 = r16.readLittleEndianUnsignedIntToInt()
            int r4 = r16.readUnsignedByte()
            int r5 = r16.readLittleEndianUnsignedIntToInt()
            int r6 = r16.readLittleEndianInt()
            r7 = -1
            if (r6 > 0) goto L1b
            r6 = -1
        L1b:
            int r8 = r16.readLittleEndianInt()
            if (r8 > 0) goto L22
            r8 = -1
        L22:
            int r9 = r16.readLittleEndianInt()
            if (r9 > 0) goto L29
            r9 = -1
        L29:
            int r7 = r16.readUnsignedByte()
            r10 = r7 & 15
            double r10 = (double) r10
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = java.lang.Math.pow(r12, r10)
            int r10 = (int) r10
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> 4
            double r14 = (double) r7
            double r11 = java.lang.Math.pow(r12, r14)
            int r11 = (int) r11
            int r7 = r16.readUnsignedByte()
            r7 = r7 & r0
            if (r7 <= 0) goto L49
            goto L4a
        L49:
            r0 = 0
        L4a:
            byte[] r1 = r16.getData()
            int r2 = r16.limit()
            byte[] r12 = java.util.Arrays.copyOf(r1, r2)
            com.google.android.exoplayer2.extractor.VorbisUtil$VorbisIdHeader r1 = new com.google.android.exoplayer2.extractor.VorbisUtil$VorbisIdHeader
            r2 = r1
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
    }

    public static com.google.android.exoplayer2.extractor.VorbisUtil.Mode[] readVorbisModes(com.google.android.exoplayer2.util.ParsableByteArray r4, int r5) throws com.google.android.exoplayer2.ParserException {
            r0 = 5
            r1 = 0
            verifyVorbisHeaderCapturePattern(r0, r4, r1)
            int r0 = r4.readUnsignedByte()
            int r0 = r0 + 1
            com.google.android.exoplayer2.extractor.VorbisBitArray r2 = new com.google.android.exoplayer2.extractor.VorbisBitArray
            byte[] r3 = r4.getData()
            r2.<init>(r3)
            int r4 = r4.getPosition()
            int r4 = r4 * 8
            r2.skipBits(r4)
            r4 = 0
        L1e:
            if (r4 >= r0) goto L26
            readBook(r2)
            int r4 = r4 + 1
            goto L1e
        L26:
            r4 = 6
            int r4 = r2.readBits(r4)
            int r4 = r4 + 1
        L2d:
            r0 = 0
            if (r1 >= r4) goto L42
            r3 = 16
            int r3 = r2.readBits(r3)
            if (r3 != 0) goto L3b
            int r1 = r1 + 1
            goto L2d
        L3b:
            java.lang.String r4 = "placeholder of time domain transforms not zeroed out"
            com.google.android.exoplayer2.ParserException r4 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r4, r0)
            throw r4
        L42:
            readFloors(r2)
            readResidues(r2)
            readMappings(r5, r2)
            com.google.android.exoplayer2.extractor.VorbisUtil$Mode[] r4 = readModes(r2)
            boolean r5 = r2.readBit()
            if (r5 == 0) goto L56
            return r4
        L56:
            java.lang.String r4 = "framing bit after modes not set as expected"
            com.google.android.exoplayer2.ParserException r4 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r4, r0)
            throw r4
    }

    public static boolean verifyVorbisHeaderCapturePattern(int r4, com.google.android.exoplayer2.util.ParsableByteArray r5, boolean r6) throws com.google.android.exoplayer2.ParserException {
            int r0 = r5.bytesLeft()
            r1 = 0
            r2 = 0
            r3 = 7
            if (r0 >= r3) goto L23
            if (r6 == 0) goto Lc
            return r1
        Lc:
            java.lang.String r4 = "too short header: "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            int r5 = r5.bytesLeft()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.google.android.exoplayer2.ParserException r4 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r4, r2)
            throw r4
        L23:
            int r0 = r5.readUnsignedByte()
            if (r0 == r4) goto L42
            if (r6 == 0) goto L2c
            return r1
        L2c:
            java.lang.String r5 = "expected header type "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.google.android.exoplayer2.ParserException r4 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r4, r2)
            throw r4
        L42:
            int r4 = r5.readUnsignedByte()
            r0 = 118(0x76, float:1.65E-43)
            if (r4 != r0) goto L75
            int r4 = r5.readUnsignedByte()
            r0 = 111(0x6f, float:1.56E-43)
            if (r4 != r0) goto L75
            int r4 = r5.readUnsignedByte()
            r0 = 114(0x72, float:1.6E-43)
            if (r4 != r0) goto L75
            int r4 = r5.readUnsignedByte()
            r0 = 98
            if (r4 != r0) goto L75
            int r4 = r5.readUnsignedByte()
            r0 = 105(0x69, float:1.47E-43)
            if (r4 != r0) goto L75
            int r4 = r5.readUnsignedByte()
            r5 = 115(0x73, float:1.61E-43)
            if (r4 == r5) goto L73
            goto L75
        L73:
            r4 = 1
            return r4
        L75:
            if (r6 == 0) goto L78
            return r1
        L78:
            java.lang.String r4 = "expected characters 'vorbis'"
            com.google.android.exoplayer2.ParserException r4 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r4, r2)
            throw r4
    }
}
