package com.google.android.exoplayer2.metadata.id3;

/* JADX INFO: loaded from: classes2.dex */
public final class Id3Decoder extends com.google.android.exoplayer2.metadata.SimpleMetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    public static final int ID3_TAG = 4801587;
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    public static final com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate NO_FRAMES_PREDICATE = null;
    private static final java.lang.String TAG = "Id3Decoder";

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate framePredicate;

    /* JADX INFO: loaded from: classes3.dex */
    public interface FramePredicate {
        boolean evaluate(int r1, int r2, int r3, int r4, int r5);
    }

    public static final class Id3Header {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public Id3Header(int r1, boolean r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.majorVersion = r1
                r0.isUnsynchronized = r2
                r0.framesSize = r3
                return
        }

        public static /* synthetic */ int access$000(com.google.android.exoplayer2.metadata.id3.Id3Decoder.Id3Header r0) {
                int r0 = r0.majorVersion
                return r0
        }

        public static /* synthetic */ int access$100(com.google.android.exoplayer2.metadata.id3.Id3Decoder.Id3Header r0) {
                int r0 = r0.framesSize
                return r0
        }

        public static /* synthetic */ boolean access$200(com.google.android.exoplayer2.metadata.id3.Id3Decoder.Id3Header r0) {
                boolean r0 = r0.isUnsynchronized
                return r0
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$W-mYB-9iemPK4h_cIYDuj0g_KGc, reason: not valid java name */
    public static /* synthetic */ boolean m229$r8$lambda$WmYB9iemPK4h_cIYDuj0g_KGc(int r0, int r1, int r2, int r3, int r4) {
            boolean r0 = lambda$static$0(r0, r1, r2, r3, r4)
            return r0
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$15
            com.google.android.exoplayer2.metadata.id3.Id3Decoder.NO_FRAMES_PREDICATE = r0
            return
    }

    public Id3Decoder() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public Id3Decoder(@androidx.annotation.Nullable com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate r1) {
            r0 = this;
            r0.<init>()
            r0.framePredicate = r1
            return
    }

    private static byte[] copyOfRangeIfValid(byte[] r0, int r1, int r2) {
            if (r2 > r1) goto L5
            byte[] r0 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
            return r0
        L5:
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r1, r2)
            return r0
    }

    private static com.google.android.exoplayer2.metadata.id3.ApicFrame decodeApicFrame(com.google.android.exoplayer2.util.ParsableByteArray r7, int r8, int r9) {
            int r0 = r7.readUnsignedByte()
            java.nio.charset.Charset r1 = getCharset(r0)
            int r8 = r8 + (-1)
            byte[] r2 = new byte[r8]
            r3 = 0
            r7.readBytes(r2, r3, r8)
            java.lang.String r7 = "image/"
            r4 = 2
            if (r9 != r4) goto L38
            java.lang.StringBuilder r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7)
            java.lang.String r9 = new java.lang.String
            r5 = 3
            java.nio.charset.Charset r6 = com.google.common.base.Charsets.ISO_8859_1
            r9.<init>(r2, r3, r5, r6)
            java.lang.String r9 = com.google.common.base.Ascii.toLowerCase(r9)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = "image/jpg"
            boolean r9 = r9.equals(r7)
            if (r9 == 0) goto L36
            java.lang.String r7 = "image/jpeg"
        L36:
            r9 = 2
            goto L56
        L38:
            int r9 = indexOfZeroByte(r2, r3)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.common.base.Charsets.ISO_8859_1
            r5.<init>(r2, r3, r9, r6)
            java.lang.String r3 = com.google.common.base.Ascii.toLowerCase(r5)
            r5 = 47
            int r5 = r3.indexOf(r5)
            r6 = -1
            if (r5 != r6) goto L55
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7, r3)
            goto L56
        L55:
            r7 = r3
        L56:
            int r3 = r9 + 1
            r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r9 = r9 + r4
            int r4 = indexOfTerminator(r2, r9, r0)
            java.lang.String r5 = new java.lang.String
            int r6 = r4 - r9
            r5.<init>(r2, r9, r6, r1)
            int r9 = delimiterLength(r0)
            int r4 = r4 + r9
            byte[] r8 = copyOfRangeIfValid(r2, r4, r8)
            com.google.android.exoplayer2.metadata.id3.ApicFrame r9 = new com.google.android.exoplayer2.metadata.id3.ApicFrame
            r9.<init>(r7, r5, r3, r8)
            return r9
    }

    private static com.google.android.exoplayer2.metadata.id3.BinaryFrame decodeBinaryFrame(com.google.android.exoplayer2.util.ParsableByteArray r2, int r3, java.lang.String r4) {
            byte[] r0 = new byte[r3]
            r1 = 0
            r2.readBytes(r0, r1, r3)
            com.google.android.exoplayer2.metadata.id3.BinaryFrame r2 = new com.google.android.exoplayer2.metadata.id3.BinaryFrame
            r2.<init>(r4, r0)
            return r2
    }

    private static com.google.android.exoplayer2.metadata.id3.ChapterFrame decodeChapterFrame(com.google.android.exoplayer2.util.ParsableByteArray r15, int r16, int r17, boolean r18, int r19, @androidx.annotation.Nullable com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate r20) {
            r0 = r15
            int r1 = r15.getPosition()
            byte[] r2 = r15.getData()
            int r2 = indexOfZeroByte(r2, r1)
            java.lang.String r4 = new java.lang.String
            byte[] r3 = r15.getData()
            int r5 = r2 - r1
            java.nio.charset.Charset r6 = com.google.common.base.Charsets.ISO_8859_1
            r4.<init>(r3, r1, r5, r6)
            int r2 = r2 + 1
            r15.setPosition(r2)
            int r5 = r15.readInt()
            int r6 = r15.readInt()
            long r2 = r15.readUnsignedInt()
            r7 = -1
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r11 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r11 != 0) goto L38
            r11 = r7
            goto L39
        L38:
            r11 = r2
        L39:
            long r2 = r15.readUnsignedInt()
            int r13 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r13 != 0) goto L43
            r9 = r7
            goto L44
        L43:
            r9 = r2
        L44:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r1 = r1 + r16
        L4b:
            int r3 = r15.getPosition()
            if (r3 >= r1) goto L63
            r3 = r17
            r7 = r18
            r8 = r19
            r13 = r20
            com.google.android.exoplayer2.metadata.id3.Id3Frame r14 = decodeFrame(r3, r15, r7, r8, r13)
            if (r14 == 0) goto L4b
            r2.add(r14)
            goto L4b
        L63:
            r0 = 0
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r0 = new com.google.android.exoplayer2.metadata.id3.Id3Frame[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r0 = (com.google.android.exoplayer2.metadata.id3.Id3Frame[]) r0
            com.google.android.exoplayer2.metadata.id3.ChapterFrame r1 = new com.google.android.exoplayer2.metadata.id3.ChapterFrame
            r3 = r1
            r7 = r11
            r11 = r0
            r3.<init>(r4, r5, r6, r7, r9, r11)
            return r1
    }

    private static com.google.android.exoplayer2.metadata.id3.ChapterTocFrame decodeChapterTOCFrame(com.google.android.exoplayer2.util.ParsableByteArray r16, int r17, int r18, boolean r19, int r20, @androidx.annotation.Nullable com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate r21) {
            r0 = r16
            int r1 = r16.getPosition()
            byte[] r2 = r16.getData()
            int r2 = indexOfZeroByte(r2, r1)
            java.lang.String r3 = new java.lang.String
            byte[] r4 = r16.getData()
            int r5 = r2 - r1
            java.nio.charset.Charset r6 = com.google.common.base.Charsets.ISO_8859_1
            r3.<init>(r4, r1, r5, r6)
            r4 = 1
            int r2 = r2 + r4
            r0.setPosition(r2)
            int r2 = r16.readUnsignedByte()
            r5 = r2 & 2
            r6 = 0
            if (r5 == 0) goto L2b
            r5 = 1
            goto L2c
        L2b:
            r5 = 0
        L2c:
            r2 = r2 & r4
            if (r2 == 0) goto L31
            r2 = 1
            goto L32
        L31:
            r2 = 0
        L32:
            int r7 = r16.readUnsignedByte()
            java.lang.String[] r8 = new java.lang.String[r7]
            r9 = 0
        L39:
            if (r9 >= r7) goto L5d
            int r10 = r16.getPosition()
            byte[] r11 = r16.getData()
            int r11 = indexOfZeroByte(r11, r10)
            java.lang.String r12 = new java.lang.String
            byte[] r13 = r16.getData()
            int r14 = r11 - r10
            java.nio.charset.Charset r15 = com.google.common.base.Charsets.ISO_8859_1
            r12.<init>(r13, r10, r14, r15)
            r8[r9] = r12
            int r11 = r11 + r4
            r0.setPosition(r11)
            int r9 = r9 + 1
            goto L39
        L5d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r1 = r1 + r17
        L64:
            int r7 = r16.getPosition()
            if (r7 >= r1) goto L7c
            r7 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            com.google.android.exoplayer2.metadata.id3.Id3Frame r12 = decodeFrame(r7, r0, r9, r10, r11)
            if (r12 == 0) goto L64
            r4.add(r12)
            goto L64
        L7c:
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r0 = new com.google.android.exoplayer2.metadata.id3.Id3Frame[r6]
            java.lang.Object[] r0 = r4.toArray(r0)
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r0 = (com.google.android.exoplayer2.metadata.id3.Id3Frame[]) r0
            com.google.android.exoplayer2.metadata.id3.ChapterTocFrame r1 = new com.google.android.exoplayer2.metadata.id3.ChapterTocFrame
            r16 = r1
            r17 = r3
            r18 = r5
            r19 = r2
            r20 = r8
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            return r1
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.id3.CommentFrame decodeCommentFrame(com.google.android.exoplayer2.util.ParsableByteArray r7, int r8) {
            r0 = 4
            if (r8 >= r0) goto L5
            r7 = 0
            return r7
        L5:
            int r1 = r7.readUnsignedByte()
            java.nio.charset.Charset r2 = getCharset(r1)
            r3 = 3
            byte[] r4 = new byte[r3]
            r5 = 0
            r7.readBytes(r4, r5, r3)
            java.lang.String r6 = new java.lang.String
            r6.<init>(r4, r5, r3)
            int r8 = r8 - r0
            byte[] r0 = new byte[r8]
            r7.readBytes(r0, r5, r8)
            int r7 = indexOfTerminator(r0, r5, r1)
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0, r5, r7, r2)
            int r3 = delimiterLength(r1)
            int r7 = r7 + r3
            int r1 = indexOfTerminator(r0, r7, r1)
            java.lang.String r7 = decodeStringIfValid(r0, r7, r1, r2)
            com.google.android.exoplayer2.metadata.id3.CommentFrame r0 = new com.google.android.exoplayer2.metadata.id3.CommentFrame
            r0.<init>(r6, r8, r7)
            return r0
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.id3.Id3Frame decodeFrame(int r19, com.google.android.exoplayer2.util.ParsableByteArray r20, boolean r21, int r22, @androidx.annotation.Nullable com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate r23) {
            r0 = r19
            r7 = r20
            int r8 = r20.readUnsignedByte()
            int r9 = r20.readUnsignedByte()
            int r10 = r20.readUnsignedByte()
            r11 = 3
            if (r0 < r11) goto L19
            int r1 = r20.readUnsignedByte()
            r13 = r1
            goto L1a
        L19:
            r13 = 0
        L1a:
            r14 = 4
            if (r0 != r14) goto L3c
            int r1 = r20.readUnsignedIntToInt()
            if (r21 != 0) goto L3a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L3a:
            r15 = r1
            goto L48
        L3c:
            if (r0 != r11) goto L43
            int r1 = r20.readUnsignedIntToInt()
            goto L3a
        L43:
            int r1 = r20.readUnsignedInt24()
            goto L3a
        L48:
            if (r0 < r11) goto L50
            int r1 = r20.readUnsignedShort()
            r6 = r1
            goto L51
        L50:
            r6 = 0
        L51:
            r16 = 0
            if (r8 != 0) goto L67
            if (r9 != 0) goto L67
            if (r10 != 0) goto L67
            if (r13 != 0) goto L67
            if (r15 != 0) goto L67
            if (r6 != 0) goto L67
            int r0 = r20.limit()
            r7.setPosition(r0)
            return r16
        L67:
            int r1 = r20.getPosition()
            int r5 = r1 + r15
            int r1 = r20.limit()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L82
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            com.google.android.exoplayer2.util.Log.w(r4, r0)
            int r0 = r20.limit()
            r7.setPosition(r0)
            return r16
        L82:
            if (r23 == 0) goto L9a
            r1 = r23
            r2 = r19
            r3 = r8
            r12 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.evaluate(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L9e
            r7.setPosition(r14)
            return r16
        L9a:
            r12 = r4
            r14 = r5
            r18 = r6
        L9e:
            r1 = 1
            if (r0 != r11) goto Lbc
            r2 = r18
            r3 = r2 & 128(0x80, float:1.8E-43)
            if (r3 == 0) goto La9
            r3 = 1
            goto Laa
        La9:
            r3 = 0
        Laa:
            r4 = r2 & 64
            if (r4 == 0) goto Lb0
            r4 = 1
            goto Lb1
        Lb0:
            r4 = 0
        Lb1:
            r2 = r2 & 32
            if (r2 == 0) goto Lb7
            r2 = 1
            goto Lb8
        Lb7:
            r2 = 0
        Lb8:
            r17 = r3
            r6 = 0
            goto Lf2
        Lbc:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto Lec
            r3 = r2 & 64
            if (r3 == 0) goto Lc7
            r3 = 1
            goto Lc8
        Lc7:
            r3 = 0
        Lc8:
            r4 = r2 & 8
            if (r4 == 0) goto Lce
            r4 = 1
            goto Lcf
        Lce:
            r4 = 0
        Lcf:
            r5 = r2 & 4
            if (r5 == 0) goto Ld5
            r5 = 1
            goto Ld6
        Ld5:
            r5 = 0
        Ld6:
            r6 = r2 & 2
            if (r6 == 0) goto Ldc
            r6 = 1
            goto Ldd
        Ldc:
            r6 = 0
        Ldd:
            r2 = r2 & r1
            if (r2 == 0) goto Le3
            r17 = 1
            goto Le5
        Le3:
            r17 = 0
        Le5:
            r2 = r3
            r3 = r17
            r17 = r4
            r4 = r5
            goto Lf2
        Lec:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r17 = 0
        Lf2:
            if (r17 != 0) goto L21c
            if (r4 == 0) goto Lf8
            goto L21c
        Lf8:
            if (r2 == 0) goto Lff
            int r15 = r15 + (-1)
            r7.skipBytes(r1)
        Lff:
            if (r3 == 0) goto L107
            int r15 = r15 + (-4)
            r1 = 4
            r7.skipBytes(r1)
        L107:
            if (r6 == 0) goto L10d
            int r15 = removeUnsynchronization(r7, r15)
        L10d:
            r1 = 84
            r2 = 2
            r3 = 88
            if (r8 != r1) goto L122
            if (r9 != r3) goto L122
            if (r10 != r3) goto L122
            if (r0 == r2) goto L11c
            if (r13 != r3) goto L122
        L11c:
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = decodeTxxxFrame(r7, r15)     // Catch: java.lang.Throwable -> L12e
            goto L1f2
        L122:
            if (r8 != r1) goto L131
            java.lang.String r1 = getFrameId(r0, r8, r9, r10, r13)     // Catch: java.lang.Throwable -> L12e
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = decodeTextInformationFrame(r7, r15, r1)     // Catch: java.lang.Throwable -> L12e
            goto L1f2
        L12e:
            r0 = move-exception
            goto L218
        L131:
            r4 = 87
            if (r8 != r4) goto L143
            if (r9 != r3) goto L143
            if (r10 != r3) goto L143
            if (r0 == r2) goto L13d
            if (r13 != r3) goto L143
        L13d:
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r1 = decodeWxxxFrame(r7, r15)     // Catch: java.lang.Throwable -> L12e
            goto L1f2
        L143:
            if (r8 != r4) goto L14f
            java.lang.String r1 = getFrameId(r0, r8, r9, r10, r13)     // Catch: java.lang.Throwable -> L12e
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r1 = decodeUrlLinkFrame(r7, r15, r1)     // Catch: java.lang.Throwable -> L12e
            goto L1f2
        L14f:
            r3 = 73
            r4 = 80
            if (r8 != r4) goto L165
            r5 = 82
            if (r9 != r5) goto L165
            if (r10 != r3) goto L165
            r5 = 86
            if (r13 != r5) goto L165
            com.google.android.exoplayer2.metadata.id3.PrivFrame r1 = decodePrivFrame(r7, r15)     // Catch: java.lang.Throwable -> L12e
            goto L1f2
        L165:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L17d
            r5 = 69
            if (r9 != r5) goto L17d
            if (r10 != r6) goto L17d
            r5 = 66
            if (r13 == r5) goto L177
            if (r0 != r2) goto L17d
        L177:
            com.google.android.exoplayer2.metadata.id3.GeobFrame r1 = decodeGeobFrame(r7, r15)     // Catch: java.lang.Throwable -> L12e
            goto L1f2
        L17d:
            r5 = 65
            r11 = 67
            if (r0 != r2) goto L18a
            if (r8 != r4) goto L198
            if (r9 != r3) goto L198
            if (r10 != r11) goto L198
            goto L192
        L18a:
            if (r8 != r5) goto L198
            if (r9 != r4) goto L198
            if (r10 != r3) goto L198
            if (r13 != r11) goto L198
        L192:
            com.google.android.exoplayer2.metadata.id3.ApicFrame r1 = decodeApicFrame(r7, r15, r0)     // Catch: java.lang.Throwable -> L12e
            goto L1f2
        L198:
            r3 = 77
            if (r8 != r11) goto L1a9
            if (r9 != r6) goto L1a9
            if (r10 != r3) goto L1a9
            if (r13 == r3) goto L1a4
            if (r0 != r2) goto L1a9
        L1a4:
            com.google.android.exoplayer2.metadata.id3.CommentFrame r1 = decodeCommentFrame(r7, r15)     // Catch: java.lang.Throwable -> L12e
            goto L1f2
        L1a9:
            if (r8 != r11) goto L1c3
            r2 = 72
            if (r9 != r2) goto L1c3
            if (r10 != r5) goto L1c3
            if (r13 != r4) goto L1c3
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.google.android.exoplayer2.metadata.id3.ChapterFrame r1 = decodeChapterFrame(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L12e
            goto L1f2
        L1c3:
            if (r8 != r11) goto L1db
            if (r9 != r1) goto L1db
            if (r10 != r6) goto L1db
            if (r13 != r11) goto L1db
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.google.android.exoplayer2.metadata.id3.ChapterTocFrame r1 = decodeChapterTOCFrame(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L12e
            goto L1f2
        L1db:
            if (r8 != r3) goto L1ea
            r2 = 76
            if (r9 != r2) goto L1ea
            if (r10 != r2) goto L1ea
            if (r13 != r1) goto L1ea
            com.google.android.exoplayer2.metadata.id3.MlltFrame r1 = decodeMlltFrame(r7, r15)     // Catch: java.lang.Throwable -> L12e
            goto L1f2
        L1ea:
            java.lang.String r1 = getFrameId(r0, r8, r9, r10, r13)     // Catch: java.lang.Throwable -> L12e
            com.google.android.exoplayer2.metadata.id3.BinaryFrame r1 = decodeBinaryFrame(r7, r15, r1)     // Catch: java.lang.Throwable -> L12e
        L1f2:
            if (r1 != 0) goto L214
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12e
            r2.<init>()     // Catch: java.lang.Throwable -> L12e
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r0 = getFrameId(r0, r8, r9, r10, r13)     // Catch: java.lang.Throwable -> L12e
            r2.append(r0)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch: java.lang.Throwable -> L12e
            r2.append(r15)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L12e
            com.google.android.exoplayer2.util.Log.w(r12, r0)     // Catch: java.lang.Throwable -> L12e
        L214:
            r7.setPosition(r14)
            return r1
        L218:
            r7.setPosition(r14)
            throw r0
        L21c:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            com.google.android.exoplayer2.util.Log.w(r12, r0)
            r7.setPosition(r14)
            return r16
    }

    private static com.google.android.exoplayer2.metadata.id3.GeobFrame decodeGeobFrame(com.google.android.exoplayer2.util.ParsableByteArray r6, int r7) {
            int r0 = r6.readUnsignedByte()
            java.nio.charset.Charset r1 = getCharset(r0)
            int r7 = r7 + (-1)
            byte[] r2 = new byte[r7]
            r3 = 0
            r6.readBytes(r2, r3, r7)
            int r6 = indexOfZeroByte(r2, r3)
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r5 = com.google.common.base.Charsets.ISO_8859_1
            r4.<init>(r2, r3, r6, r5)
            int r6 = r6 + 1
            int r3 = indexOfTerminator(r2, r6, r0)
            java.lang.String r6 = decodeStringIfValid(r2, r6, r3, r1)
            int r5 = delimiterLength(r0)
            int r3 = r3 + r5
            int r5 = indexOfTerminator(r2, r3, r0)
            java.lang.String r1 = decodeStringIfValid(r2, r3, r5, r1)
            int r0 = delimiterLength(r0)
            int r5 = r5 + r0
            byte[] r7 = copyOfRangeIfValid(r2, r5, r7)
            com.google.android.exoplayer2.metadata.id3.GeobFrame r0 = new com.google.android.exoplayer2.metadata.id3.GeobFrame
            r0.<init>(r4, r6, r1, r7)
            return r0
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.id3.Id3Decoder.Id3Header decodeHeader(com.google.android.exoplayer2.util.ParsableByteArray r8) {
            int r0 = r8.bytesLeft()
            r1 = 0
            java.lang.String r2 = "Id3Decoder"
            r3 = 10
            if (r0 >= r3) goto L11
            java.lang.String r8 = "Data too short to be an ID3 tag"
            com.google.android.exoplayer2.util.Log.w(r2, r8)
            return r1
        L11:
            int r0 = r8.readUnsignedInt24()
            r3 = 4801587(0x494433, float:6.728456E-39)
            r4 = 0
            r5 = 1
            if (r0 == r3) goto L3b
            java.lang.String r8 = "Unexpected first three bytes of ID3 tag header: 0x"
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r4] = r0
            java.lang.String r0 = "%06X"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.google.android.exoplayer2.util.Log.w(r2, r8)
            return r1
        L3b:
            int r0 = r8.readUnsignedByte()
            r8.skipBytes(r5)
            int r3 = r8.readUnsignedByte()
            int r5 = r8.readSynchSafeInt()
            r6 = 2
            r7 = 4
            if (r0 != r6) goto L5d
            r8 = r3 & 64
            if (r8 == 0) goto L54
            r8 = 1
            goto L55
        L54:
            r8 = 0
        L55:
            if (r8 == 0) goto L93
            java.lang.String r8 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            com.google.android.exoplayer2.util.Log.w(r2, r8)
            return r1
        L5d:
            r6 = 3
            if (r0 != r6) goto L73
            r1 = r3 & 64
            if (r1 == 0) goto L66
            r1 = 1
            goto L67
        L66:
            r1 = 0
        L67:
            if (r1 == 0) goto L93
            int r1 = r8.readInt()
            r8.skipBytes(r1)
            int r1 = r1 + r7
            int r5 = r5 - r1
            goto L93
        L73:
            if (r0 != r7) goto La0
            r1 = r3 & 64
            if (r1 == 0) goto L7b
            r1 = 1
            goto L7c
        L7b:
            r1 = 0
        L7c:
            if (r1 == 0) goto L88
            int r1 = r8.readSynchSafeInt()
            int r2 = r1 + (-4)
            r8.skipBytes(r2)
            int r5 = r5 - r1
        L88:
            r8 = r3 & 16
            if (r8 == 0) goto L8e
            r8 = 1
            goto L8f
        L8e:
            r8 = 0
        L8f:
            if (r8 == 0) goto L93
            int r5 = r5 + (-10)
        L93:
            if (r0 >= r7) goto L9a
            r8 = r3 & 128(0x80, float:1.8E-43)
            if (r8 == 0) goto L9a
            r4 = 1
        L9a:
            com.google.android.exoplayer2.metadata.id3.Id3Decoder$Id3Header r8 = new com.google.android.exoplayer2.metadata.id3.Id3Decoder$Id3Header
            r8.<init>(r0, r4, r5)
            return r8
        La0:
            java.lang.String r8 = "Skipped ID3 tag with unsupported majorVersion="
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r8, r0, r2)
            return r1
    }

    private static com.google.android.exoplayer2.metadata.id3.MlltFrame decodeMlltFrame(com.google.android.exoplayer2.util.ParsableByteArray r10, int r11) {
            int r1 = r10.readUnsignedShort()
            int r2 = r10.readUnsignedInt24()
            int r3 = r10.readUnsignedInt24()
            int r0 = r10.readUnsignedByte()
            int r4 = r10.readUnsignedByte()
            com.google.android.exoplayer2.util.ParsableBitArray r5 = new com.google.android.exoplayer2.util.ParsableBitArray
            r5.<init>()
            r5.reset(r10)
            int r11 = r11 + (-10)
            int r11 = r11 * 8
            int r10 = r0 + r4
            int r11 = r11 / r10
            int[] r10 = new int[r11]
            int[] r6 = new int[r11]
            r7 = 0
        L28:
            if (r7 >= r11) goto L39
            int r8 = r5.readBits(r0)
            int r9 = r5.readBits(r4)
            r10[r7] = r8
            r6[r7] = r9
            int r7 = r7 + 1
            goto L28
        L39:
            com.google.android.exoplayer2.metadata.id3.MlltFrame r11 = new com.google.android.exoplayer2.metadata.id3.MlltFrame
            r0 = r11
            r4 = r10
            r5 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r11
    }

    private static com.google.android.exoplayer2.metadata.id3.PrivFrame decodePrivFrame(com.google.android.exoplayer2.util.ParsableByteArray r4, int r5) {
            byte[] r0 = new byte[r5]
            r1 = 0
            r4.readBytes(r0, r1, r5)
            int r4 = indexOfZeroByte(r0, r1)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.common.base.Charsets.ISO_8859_1
            r2.<init>(r0, r1, r4, r3)
            int r4 = r4 + 1
            byte[] r4 = copyOfRangeIfValid(r0, r4, r5)
            com.google.android.exoplayer2.metadata.id3.PrivFrame r5 = new com.google.android.exoplayer2.metadata.id3.PrivFrame
            r5.<init>(r2, r4)
            return r5
    }

    private static java.lang.String decodeStringIfValid(byte[] r1, int r2, int r3, java.nio.charset.Charset r4) {
            if (r3 <= r2) goto Ld
            int r0 = r1.length
            if (r3 <= r0) goto L6
            goto Ld
        L6:
            java.lang.String r0 = new java.lang.String
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3, r4)
            return r0
        Ld:
            java.lang.String r1 = ""
            return r1
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.id3.TextInformationFrame decodeTextInformationFrame(com.google.android.exoplayer2.util.ParsableByteArray r4, int r5, java.lang.String r6) {
            r0 = 0
            r1 = 1
            if (r5 >= r1) goto L5
            return r0
        L5:
            int r2 = r4.readUnsignedByte()
            int r5 = r5 - r1
            byte[] r1 = new byte[r5]
            r3 = 0
            r4.readBytes(r1, r3, r5)
            com.google.common.collect.ImmutableList r4 = decodeTextInformationFrameValues(r1, r2, r3)
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r5 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            r5.<init>(r6, r0, r4)
            return r5
    }

    private static com.google.common.collect.ImmutableList<java.lang.String> decodeTextInformationFrameValues(byte[] r6, int r7, int r8) {
            int r0 = r6.length
            java.lang.String r1 = ""
            if (r8 < r0) goto La
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.of(r1)
            return r6
        La:
            com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
            int r2 = indexOfTerminator(r6, r8, r7)
        L12:
            if (r8 >= r2) goto L2c
            java.lang.String r3 = new java.lang.String
            int r4 = r2 - r8
            java.nio.charset.Charset r5 = getCharset(r7)
            r3.<init>(r6, r8, r4, r5)
            r0.add(r3)
            int r8 = delimiterLength(r7)
            int r8 = r8 + r2
            int r2 = indexOfTerminator(r6, r8, r7)
            goto L12
        L2c:
            com.google.common.collect.ImmutableList r6 = r0.build()
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L3a
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.of(r1)
        L3a:
            return r6
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.id3.TextInformationFrame decodeTxxxFrame(com.google.android.exoplayer2.util.ParsableByteArray r4, int r5) {
            r0 = 1
            if (r5 >= r0) goto L5
            r4 = 0
            return r4
        L5:
            int r1 = r4.readUnsignedByte()
            int r5 = r5 - r0
            byte[] r0 = new byte[r5]
            r2 = 0
            r4.readBytes(r0, r2, r5)
            int r4 = indexOfTerminator(r0, r2, r1)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r3 = getCharset(r1)
            r5.<init>(r0, r2, r4, r3)
            int r2 = delimiterLength(r1)
            int r4 = r4 + r2
            com.google.common.collect.ImmutableList r4 = decodeTextInformationFrameValues(r0, r1, r4)
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            java.lang.String r1 = "TXXX"
            r0.<init>(r1, r5, r4)
            return r0
    }

    private static com.google.android.exoplayer2.metadata.id3.UrlLinkFrame decodeUrlLinkFrame(com.google.android.exoplayer2.util.ParsableByteArray r3, int r4, java.lang.String r5) {
            byte[] r0 = new byte[r4]
            r1 = 0
            r3.readBytes(r0, r1, r4)
            int r3 = indexOfZeroByte(r0, r1)
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r2 = com.google.common.base.Charsets.ISO_8859_1
            r4.<init>(r0, r1, r3, r2)
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r3 = new com.google.android.exoplayer2.metadata.id3.UrlLinkFrame
            r0 = 0
            r3.<init>(r5, r0, r4)
            return r3
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.id3.UrlLinkFrame decodeWxxxFrame(com.google.android.exoplayer2.util.ParsableByteArray r4, int r5) {
            r0 = 1
            if (r5 >= r0) goto L5
            r4 = 0
            return r4
        L5:
            int r1 = r4.readUnsignedByte()
            int r5 = r5 - r0
            byte[] r0 = new byte[r5]
            r2 = 0
            r4.readBytes(r0, r2, r5)
            int r4 = indexOfTerminator(r0, r2, r1)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r3 = getCharset(r1)
            r5.<init>(r0, r2, r4, r3)
            int r1 = delimiterLength(r1)
            int r4 = r4 + r1
            int r1 = indexOfZeroByte(r0, r4)
            java.nio.charset.Charset r2 = com.google.common.base.Charsets.ISO_8859_1
            java.lang.String r4 = decodeStringIfValid(r0, r4, r1, r2)
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r0 = new com.google.android.exoplayer2.metadata.id3.UrlLinkFrame
            java.lang.String r1 = "WXXX"
            r0.<init>(r1, r5, r4)
            return r0
    }

    private static int delimiterLength(int r1) {
            if (r1 == 0) goto L8
            r0 = 3
            if (r1 != r0) goto L6
            goto L8
        L6:
            r1 = 2
            goto L9
        L8:
            r1 = 1
        L9:
            return r1
    }

    private static java.nio.charset.Charset getCharset(int r1) {
            r0 = 1
            if (r1 == r0) goto L12
            r0 = 2
            if (r1 == r0) goto Lf
            r0 = 3
            if (r1 == r0) goto Lc
            java.nio.charset.Charset r1 = com.google.common.base.Charsets.ISO_8859_1
            return r1
        Lc:
            java.nio.charset.Charset r1 = com.google.common.base.Charsets.UTF_8
            return r1
        Lf:
            java.nio.charset.Charset r1 = com.google.common.base.Charsets.UTF_16BE
            return r1
        L12:
            java.nio.charset.Charset r1 = com.google.common.base.Charsets.UTF_16
            return r1
    }

    private static java.lang.String getFrameId(int r5, int r6, int r7, int r8, int r9) {
            r0 = 3
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 != r3) goto L23
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r9[r1] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r9[r3] = r6
            java.lang.String r6 = "%c%c%c"
            java.lang.String r5 = java.lang.String.format(r5, r6, r9)
            goto L46
        L23:
            java.util.Locale r5 = java.util.Locale.US
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r4[r1] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r4[r3] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r4[r0] = r6
            java.lang.String r6 = "%c%c%c%c"
            java.lang.String r5 = java.lang.String.format(r5, r6, r4)
        L46:
            return r5
    }

    private static int indexOfTerminator(byte[] r2, int r3, int r4) {
            int r0 = indexOfZeroByte(r2, r3)
            if (r4 == 0) goto L25
            r1 = 3
            if (r4 != r1) goto La
            goto L25
        La:
            int r4 = r2.length
            int r4 = r4 + (-1)
            if (r0 >= r4) goto L23
            int r4 = r0 - r3
            int r4 = r4 % 2
            if (r4 != 0) goto L1c
            int r4 = r0 + 1
            r4 = r2[r4]
            if (r4 != 0) goto L1c
            return r0
        L1c:
            int r0 = r0 + 1
            int r0 = indexOfZeroByte(r2, r0)
            goto La
        L23:
            int r2 = r2.length
            return r2
        L25:
            return r0
    }

    private static int indexOfZeroByte(byte[] r1, int r2) {
        L0:
            int r0 = r1.length
            if (r2 >= r0) goto Lb
            r0 = r1[r2]
            if (r0 != 0) goto L8
            return r2
        L8:
            int r2 = r2 + 1
            goto L0
        Lb:
            int r1 = r1.length
            return r1
    }

    private static /* synthetic */ boolean lambda$static$0(int r0, int r1, int r2, int r3, int r4) {
            r0 = 0
            return r0
    }

    private static int removeUnsynchronization(com.google.android.exoplayer2.util.ParsableByteArray r5, int r6) {
            byte[] r0 = r5.getData()
            int r5 = r5.getPosition()
            r1 = r5
        L9:
            int r2 = r1 + 1
            int r3 = r5 + r6
            if (r2 >= r3) goto L29
            r3 = r0[r1]
            r4 = 255(0xff, float:3.57E-43)
            r3 = r3 & r4
            if (r3 != r4) goto L27
            r3 = r0[r2]
            if (r3 != 0) goto L27
            int r3 = r1 - r5
            int r1 = r1 + 2
            int r3 = r6 - r3
            int r3 = r3 + (-2)
            java.lang.System.arraycopy(r0, r1, r0, r2, r3)
            int r6 = r6 + (-1)
        L27:
            r1 = r2
            goto L9
        L29:
            return r6
    }

    private static boolean validateFrames(com.google.android.exoplayer2.util.ParsableByteArray r18, int r19, int r20, boolean r21) {
            r1 = r18
            r0 = r19
            int r2 = r18.getPosition()
        L8:
            int r3 = r18.bytesLeft()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.readInt()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.readUnsignedInt()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.readUnsignedShort()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.readUnsignedInt24()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.readUnsignedInt24()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = 0
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.setPosition(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4b
            r1.setPosition(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = 1
            goto L74
        L73:
            r3 = 0
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L79
            goto L8b
        L79:
            r4 = 0
            goto L8b
        L7b:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = 1
            goto L84
        L83:
            r3 = 0
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L79
            goto L8b
        L89:
            r3 = 0
            goto L79
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L98
            r1.setPosition(r2)
            return r6
        L98:
            int r3 = r18.bytesLeft()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La5
            r1.setPosition(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.skipBytes(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.setPosition(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.setPosition(r2)
            throw r0
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.metadata.Metadata decode(com.google.android.exoplayer2.metadata.MetadataInputBuffer r1, java.nio.ByteBuffer r2) {
            r0 = this;
            byte[] r1 = r2.array()
            int r2 = r2.limit()
            com.google.android.exoplayer2.metadata.Metadata r1 = r0.decode(r1, r2)
            return r1
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.metadata.Metadata decode(byte[] r7, int r8) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1.<init>(r7, r8)
            com.google.android.exoplayer2.metadata.id3.Id3Decoder$Id3Header r7 = decodeHeader(r1)
            r8 = 0
            if (r7 != 0) goto L12
            return r8
        L12:
            int r2 = r1.getPosition()
            int r3 = com.google.android.exoplayer2.metadata.id3.Id3Decoder.Id3Header.access$000(r7)
            r4 = 2
            if (r3 != r4) goto L1f
            r3 = 6
            goto L21
        L1f:
            r3 = 10
        L21:
            int r4 = com.google.android.exoplayer2.metadata.id3.Id3Decoder.Id3Header.access$100(r7)
            boolean r5 = com.google.android.exoplayer2.metadata.id3.Id3Decoder.Id3Header.access$200(r7)
            if (r5 == 0) goto L33
            int r4 = com.google.android.exoplayer2.metadata.id3.Id3Decoder.Id3Header.access$100(r7)
            int r4 = removeUnsynchronization(r1, r4)
        L33:
            int r2 = r2 + r4
            r1.setLimit(r2)
            int r2 = com.google.android.exoplayer2.metadata.id3.Id3Decoder.Id3Header.access$000(r7)
            r4 = 0
            boolean r2 = validateFrames(r1, r2, r3, r4)
            r5 = 1
            if (r2 != 0) goto L69
            int r2 = com.google.android.exoplayer2.metadata.id3.Id3Decoder.Id3Header.access$000(r7)
            r4 = 4
            if (r2 != r4) goto L52
            boolean r2 = validateFrames(r1, r4, r3, r5)
            if (r2 == 0) goto L52
            r4 = 1
            goto L69
        L52:
            java.lang.String r0 = "Failed to validate ID3 tag with majorVersion="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r7 = com.google.android.exoplayer2.metadata.id3.Id3Decoder.Id3Header.access$000(r7)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "Id3Decoder"
            com.google.android.exoplayer2.util.Log.w(r0, r7)
            return r8
        L69:
            int r8 = r1.bytesLeft()
            if (r8 < r3) goto L7f
            int r8 = com.google.android.exoplayer2.metadata.id3.Id3Decoder.Id3Header.access$000(r7)
            com.google.android.exoplayer2.metadata.id3.Id3Decoder$FramePredicate r2 = r6.framePredicate
            com.google.android.exoplayer2.metadata.id3.Id3Frame r8 = decodeFrame(r8, r1, r4, r3, r2)
            if (r8 == 0) goto L69
            r0.add(r8)
            goto L69
        L7f:
            com.google.android.exoplayer2.metadata.Metadata r7 = new com.google.android.exoplayer2.metadata.Metadata
            r7.<init>(r0)
            return r7
    }
}
