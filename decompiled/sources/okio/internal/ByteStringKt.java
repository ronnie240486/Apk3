package okio.internal;

/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0080\b\u001a\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\r\u0010\u000f\u001a\u00020\u0010*\u00020\nH\u0080\b\u001a\r\u0010\u0011\u001a\u00020\u0010*\u00020\nH\u0080\b\u001a\u0015\u0010\u0012\u001a\u00020\u0005*\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0080\b\u001a\u000f\u0010\u0014\u001a\u0004\u0018\u00010\n*\u00020\u0010H\u0080\b\u001a\r\u0010\u0015\u001a\u00020\n*\u00020\u0010H\u0080\b\u001a\r\u0010\u0016\u001a\u00020\n*\u00020\u0010H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\u0018*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\u0018*\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0080\b\u001a\u0017\u0010\u001a\u001a\u00020\u0018*\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001bH\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u001d*\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0005H\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u0005*\u00020\nH\u0080\b\u001a\r\u0010 \u001a\u00020\u0005*\u00020\nH\u0080\b\u001a\r\u0010!\u001a\u00020\u0010*\u00020\nH\u0080\b\u001a\u001d\u0010\"\u001a\u00020\u0005*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0005H\u0080\b\u001a\r\u0010$\u001a\u00020\u0007*\u00020\nH\u0080\b\u001a\u001d\u0010%\u001a\u00020\u0005*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0005H\u0080\b\u001a\u001d\u0010%\u001a\u00020\u0005*\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0005H\u0080\b\u001a-\u0010&\u001a\u00020\u0018*\u00020\n2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0080\b\u001a-\u0010&\u001a\u00020\u0018*\u00020\n2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010*\u001a\u00020\u0018*\u00020\n2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010*\u001a\u00020\u0018*\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0080\b\u001a\u001d\u0010,\u001a\u00020\n*\u00020\n2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0080\b\u001a\r\u0010/\u001a\u00020\n*\u00020\nH\u0080\b\u001a\r\u00100\u001a\u00020\n*\u00020\nH\u0080\b\u001a\r\u00101\u001a\u00020\u0007*\u00020\nH\u0080\b\u001a\u001d\u00102\u001a\u00020\n*\u00020\u00072\u0006\u0010'\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0080\b\u001a\r\u00103\u001a\u00020\u0010*\u00020\nH\u0080\b\u001a\r\u00104\u001a\u00020\u0010*\u00020\nH\u0080\b\u001a$\u00105\u001a\u000206*\u00020\n2\u0006\u00107\u001a\u0002082\u0006\u0010'\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u00069"}, d2 = {"HEX_DIGIT_CHARS", "", "getHEX_DIGIT_CHARS", "()[C", "codePointIndexToCharIndex", "", "s", "", "codePointCount", "commonOf", "Lokio/ByteString;", "data", "decodeHexDigit", "c", "", "commonBase64", "", "commonBase64Url", "commonCompareTo", "other", "commonDecodeBase64", "commonDecodeHex", "commonEncodeUtf8", "commonEndsWith", "", "suffix", "commonEquals", "", "commonGetByte", "", "pos", "commonGetSize", "commonHashCode", "commonHex", "commonIndexOf", "fromIndex", "commonInternalArray", "commonLastIndexOf", "commonRangeEquals", "offset", "otherOffset", "byteCount", "commonStartsWith", "prefix", "commonSubstring", "beginIndex", "endIndex", "commonToAsciiLowercase", "commonToAsciiUppercase", "commonToByteArray", "commonToByteString", "commonToString", "commonUtf8", "commonWrite", "", "buffer", "Lokio/Buffer;", "okio"}, k = 2, mv = {1, 4, 1})
public final class ByteStringKt {

    @org.jetbrains.annotations.NotNull
    private static final char[] HEX_DIGIT_CHARS = null;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            okio.internal.ByteStringKt.HEX_DIGIT_CHARS = r0
            return
    }

    public static final /* synthetic */ int access$codePointIndexToCharIndex(byte[] r0, int r1) {
            int r0 = codePointIndexToCharIndex(r0, r1)
            return r0
    }

    public static final /* synthetic */ int access$decodeHexDigit(char r0) {
            int r0 = decodeHexDigit(r0)
            return r0
    }

    private static final int codePointIndexToCharIndex(byte[] r19, int r20) {
            r0 = r19
            r1 = r20
            int r2 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
        L8:
            if (r4 >= r2) goto L1dd
            r7 = r0[r4]
            r8 = 127(0x7f, float:1.78E-43)
            r9 = 159(0x9f, float:2.23E-43)
            r10 = 31
            r11 = 13
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 10
            r14 = 65536(0x10000, float:9.1835E-41)
            r16 = -1
            r17 = 1
            if (r7 < 0) goto L71
            int r18 = r6 + 1
            if (r6 != r1) goto L26
            return r5
        L26:
            if (r7 == r13) goto L38
            if (r7 == r11) goto L38
            if (r7 < 0) goto L2e
            if (r10 >= r7) goto L33
        L2e:
            if (r8 <= r7) goto L31
            goto L35
        L31:
            if (r9 < r7) goto L35
        L33:
            r6 = 1
            goto L36
        L35:
            r6 = 0
        L36:
            if (r6 != 0) goto L3a
        L38:
            if (r7 != r12) goto L3b
        L3a:
            return r16
        L3b:
            if (r7 >= r14) goto L3f
            r6 = 1
            goto L40
        L3f:
            r6 = 2
        L40:
            int r5 = r5 + r6
            int r4 = r4 + 1
        L43:
            r6 = r18
            if (r4 >= r2) goto L8
            r7 = r0[r4]
            if (r7 < 0) goto L8
            int r7 = r4 + 1
            r4 = r0[r4]
            int r18 = r6 + 1
            if (r6 != r1) goto L54
            return r5
        L54:
            if (r4 == r13) goto L66
            if (r4 == r11) goto L66
            if (r4 < 0) goto L5c
            if (r10 >= r4) goto L61
        L5c:
            if (r8 <= r4) goto L5f
            goto L63
        L5f:
            if (r9 < r4) goto L63
        L61:
            r6 = 1
            goto L64
        L63:
            r6 = 0
        L64:
            if (r6 != 0) goto L68
        L66:
            if (r4 != r12) goto L69
        L68:
            return r16
        L69:
            if (r4 >= r14) goto L6d
            r4 = 1
            goto L6e
        L6d:
            r4 = 2
        L6e:
            int r5 = r5 + r4
            r4 = r7
            goto L43
        L71:
            int r3 = r7 >> 5
            r15 = -2
            r14 = 128(0x80, float:1.8E-43)
            if (r3 != r15) goto Lc5
            int r3 = r4 + 1
            if (r2 > r3) goto L80
            if (r6 != r1) goto L7f
            return r5
        L7f:
            return r16
        L80:
            r7 = r0[r4]
            r3 = r0[r3]
            r15 = r3 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L8a
            r15 = 1
            goto L8b
        L8a:
            r15 = 0
        L8b:
            if (r15 != 0) goto L91
            if (r6 != r1) goto L90
            return r5
        L90:
            return r16
        L91:
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r7 << 6
            r3 = r3 ^ r7
            if (r3 >= r14) goto L9c
            if (r6 != r1) goto L9b
            return r5
        L9b:
            return r16
        L9c:
            int r7 = r6 + 1
            if (r6 != r1) goto La1
            return r5
        La1:
            if (r3 == r13) goto Lb3
            if (r3 == r11) goto Lb3
            if (r3 < 0) goto La9
            if (r10 >= r3) goto Lae
        La9:
            if (r8 <= r3) goto Lac
            goto Lb0
        Lac:
            if (r9 < r3) goto Lb0
        Lae:
            r6 = 1
            goto Lb1
        Lb0:
            r6 = 0
        Lb1:
            if (r6 != 0) goto Lb5
        Lb3:
            if (r3 != r12) goto Lb6
        Lb5:
            return r16
        Lb6:
            r6 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r6) goto Lbc
            r15 = 1
            goto Lbd
        Lbc:
            r15 = 2
        Lbd:
            int r5 = r5 + r15
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            int r4 = r4 + 2
        Lc2:
            r6 = r7
            goto L8
        Lc5:
            int r3 = r7 >> 4
            r12 = 55296(0xd800, float:7.7486E-41)
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r3 != r15) goto L142
            int r3 = r4 + 2
            if (r2 > r3) goto Ld7
            if (r6 != r1) goto Ld6
            return r5
        Ld6:
            return r16
        Ld7:
            r7 = r0[r4]
            int r15 = r4 + 1
            r15 = r0[r15]
            r8 = r15 & 192(0xc0, float:2.69E-43)
            if (r8 != r14) goto Le3
            r8 = 1
            goto Le4
        Le3:
            r8 = 0
        Le4:
            if (r8 != 0) goto Lea
            if (r6 != r1) goto Le9
            return r5
        Le9:
            return r16
        Lea:
            r3 = r0[r3]
            r8 = r3 & 192(0xc0, float:2.69E-43)
            if (r8 != r14) goto Lf2
            r8 = 1
            goto Lf3
        Lf2:
            r8 = 0
        Lf3:
            if (r8 != 0) goto Lf9
            if (r6 != r1) goto Lf8
            return r5
        Lf8:
            return r16
        Lf9:
            r8 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r8
            int r8 = r15 << 6
            r3 = r3 ^ r8
            int r7 = r7 << 12
            r3 = r3 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 >= r7) goto L10b
            if (r6 != r1) goto L10a
            return r5
        L10a:
            return r16
        L10b:
            if (r12 <= r3) goto L10e
            goto L114
        L10e:
            if (r9 < r3) goto L114
            if (r6 != r1) goto L113
            return r5
        L113:
            return r16
        L114:
            int r7 = r6 + 1
            if (r6 != r1) goto L119
            return r5
        L119:
            if (r3 == r13) goto L12f
            if (r3 == r11) goto L12f
            if (r3 < 0) goto L121
            if (r10 >= r3) goto L12a
        L121:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 <= r3) goto L126
            goto L12c
        L126:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L12c
        L12a:
            r6 = 1
            goto L12d
        L12c:
            r6 = 0
        L12d:
            if (r6 != 0) goto L134
        L12f:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L135
        L134:
            return r16
        L135:
            r6 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r6) goto L13b
            r15 = 1
            goto L13c
        L13b:
            r15 = 2
        L13c:
            int r5 = r5 + r15
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            int r4 = r4 + 3
            goto Lc2
        L142:
            int r3 = r7 >> 3
            if (r3 != r15) goto L1d9
            int r3 = r4 + 3
            if (r2 > r3) goto L14e
            if (r6 != r1) goto L14d
            return r5
        L14d:
            return r16
        L14e:
            r7 = r0[r4]
            int r8 = r4 + 1
            r8 = r0[r8]
            r15 = r8 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L15a
            r15 = 1
            goto L15b
        L15a:
            r15 = 0
        L15b:
            if (r15 != 0) goto L161
            if (r6 != r1) goto L160
            return r5
        L160:
            return r16
        L161:
            int r15 = r4 + 2
            r15 = r0[r15]
            r10 = r15 & 192(0xc0, float:2.69E-43)
            if (r10 != r14) goto L16b
            r10 = 1
            goto L16c
        L16b:
            r10 = 0
        L16c:
            if (r10 != 0) goto L172
            if (r6 != r1) goto L171
            return r5
        L171:
            return r16
        L172:
            r3 = r0[r3]
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r14) goto L17a
            r10 = 1
            goto L17b
        L17a:
            r10 = 0
        L17b:
            if (r10 != 0) goto L181
            if (r6 != r1) goto L180
            return r5
        L180:
            return r16
        L181:
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r10
            int r10 = r15 << 6
            r3 = r3 ^ r10
            int r8 = r8 << 12
            r3 = r3 ^ r8
            int r7 = r7 << 18
            r3 = r3 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r7) goto L197
            if (r6 != r1) goto L196
            return r5
        L196:
            return r16
        L197:
            if (r12 <= r3) goto L19a
            goto L1a0
        L19a:
            if (r9 < r3) goto L1a0
            if (r6 != r1) goto L19f
            return r5
        L19f:
            return r16
        L1a0:
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r7) goto L1a8
            if (r6 != r1) goto L1a7
            return r5
        L1a7:
            return r16
        L1a8:
            int r7 = r6 + 1
            if (r6 != r1) goto L1ad
            return r5
        L1ad:
            if (r3 == r13) goto L1c5
            if (r3 == r11) goto L1c5
            if (r3 < 0) goto L1b7
            r6 = 31
            if (r6 >= r3) goto L1c0
        L1b7:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 <= r3) goto L1bc
            goto L1c2
        L1bc:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L1c2
        L1c0:
            r6 = 1
            goto L1c3
        L1c2:
            r6 = 0
        L1c3:
            if (r6 != 0) goto L1ca
        L1c5:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L1cb
        L1ca:
            return r16
        L1cb:
            r6 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r6) goto L1d1
            r15 = 1
            goto L1d2
        L1d1:
            r15 = 2
        L1d2:
            int r5 = r5 + r15
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            int r4 = r4 + 4
            goto Lc2
        L1d9:
            if (r6 != r1) goto L1dc
            return r5
        L1dc:
            return r16
        L1dd:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonBase64(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            java.lang.String r0 = "$this$commonBase64"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r2 = r2.getData$okio()
            r0 = 0
            r1 = 1
            java.lang.String r2 = okio.Base64.encodeBase64$default(r2, r0, r1, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonBase64Url(@org.jetbrains.annotations.NotNull okio.ByteString r1) {
            java.lang.String r0 = "$this$commonBase64Url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte[] r1 = r1.getData$okio()
            byte[] r0 = okio.Base64.getBASE64_URL_SAFE()
            java.lang.String r1 = okio.Base64.encodeBase64(r1, r0)
            return r1
    }

    public static final int commonCompareTo(@org.jetbrains.annotations.NotNull okio.ByteString r9, @org.jetbrains.annotations.NotNull okio.ByteString r10) {
            java.lang.String r0 = "$this$commonCompareTo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L18:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L32
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L2d
            int r4 = r4 + 1
            goto L18
        L2d:
            if (r7 >= r8) goto L30
            goto L31
        L30:
            r5 = 1
        L31:
            return r5
        L32:
            if (r0 != r1) goto L35
            return r3
        L35:
            if (r0 >= r1) goto L38
            goto L39
        L38:
            r5 = 1
        L39:
            return r5
    }

    @org.jetbrains.annotations.Nullable
    public static final okio.ByteString commonDecodeBase64(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "$this$commonDecodeBase64"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte[] r1 = okio.Base64.decodeBase64ToArray(r1)
            if (r1 == 0) goto L11
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r1)
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonDecodeHex(@org.jetbrains.annotations.NotNull java.lang.String r5) {
            java.lang.String r0 = "$this$commonDecodeHex"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.length()
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L40
            int r0 = r5.length()
            int r0 = r0 / 2
            byte[] r2 = new byte[r0]
        L1b:
            if (r1 >= r0) goto L3a
            int r3 = r1 * 2
            char r4 = r5.charAt(r3)
            int r4 = access$decodeHexDigit(r4)
            int r4 = r4 << 4
            int r3 = r3 + 1
            char r3 = r5.charAt(r3)
            int r3 = access$decodeHexDigit(r3)
            int r3 = r3 + r4
            byte r3 = (byte) r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L1b
        L3a:
            okio.ByteString r5 = new okio.ByteString
            r5.<init>(r2)
            return r5
        L40:
            java.lang.String r0 = "Unexpected hex string: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonEncodeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "$this$commonEncodeUtf8"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.ByteString r0 = new okio.ByteString
            byte[] r1 = okio.Platform.asUtf8ToByteArray(r2)
            r0.<init>(r1)
            r0.setUtf8$okio(r2)
            return r0
    }

    public static final boolean commonEndsWith(@org.jetbrains.annotations.NotNull okio.ByteString r3, @org.jetbrains.annotations.NotNull okio.ByteString r4) {
            java.lang.String r0 = "$this$commonEndsWith"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.size()
            int r1 = r4.size()
            int r0 = r0 - r1
            int r1 = r4.size()
            r2 = 0
            boolean r3 = r3.rangeEquals(r0, r4, r2, r1)
            return r3
    }

    public static final boolean commonEndsWith(@org.jetbrains.annotations.NotNull okio.ByteString r3, @org.jetbrains.annotations.NotNull byte[] r4) {
            java.lang.String r0 = "$this$commonEndsWith"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.size()
            int r1 = r4.length
            int r0 = r0 - r1
            int r1 = r4.length
            r2 = 0
            boolean r3 = r3.rangeEquals(r0, r4, r2, r1)
            return r3
    }

    public static final boolean commonEquals(@org.jetbrains.annotations.NotNull okio.ByteString r4, @org.jetbrains.annotations.Nullable java.lang.Object r5) {
            java.lang.String r0 = "$this$commonEquals"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 1
            r1 = 0
            if (r5 != r4) goto La
            goto L2c
        La:
            boolean r2 = r5 instanceof okio.ByteString
            if (r2 == 0) goto L2b
            okio.ByteString r5 = (okio.ByteString) r5
            int r2 = r5.size()
            byte[] r3 = r4.getData$okio()
            int r3 = r3.length
            if (r2 != r3) goto L2b
            byte[] r2 = r4.getData$okio()
            byte[] r4 = r4.getData$okio()
            int r4 = r4.length
            boolean r4 = r5.rangeEquals(r1, r2, r1, r4)
            if (r4 == 0) goto L2b
            goto L2c
        L2b:
            r0 = 0
        L2c:
            return r0
    }

    public static final byte commonGetByte(@org.jetbrains.annotations.NotNull okio.ByteString r1, int r2) {
            java.lang.String r0 = "$this$commonGetByte"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte[] r1 = r1.getData$okio()
            r1 = r1[r2]
            return r1
    }

    public static final int commonGetSize(@org.jetbrains.annotations.NotNull okio.ByteString r1) {
            java.lang.String r0 = "$this$commonGetSize"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte[] r1 = r1.getData$okio()
            int r1 = r1.length
            return r1
    }

    public static final int commonHashCode(@org.jetbrains.annotations.NotNull okio.ByteString r1) {
            java.lang.String r0 = "$this$commonHashCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.getHashCode$okio()
            if (r0 == 0) goto Lc
            return r0
        Lc:
            byte[] r0 = r1.getData$okio()
            int r0 = java.util.Arrays.hashCode(r0)
            r1.setHashCode$okio(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonHex(@org.jetbrains.annotations.NotNull okio.ByteString r8) {
            java.lang.String r0 = "$this$commonHex"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            byte[] r0 = r8.getData$okio()
            int r0 = r0.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            byte[] r8 = r8.getData$okio()
            int r1 = r8.length
            r2 = 0
            r3 = 0
        L15:
            if (r2 >= r1) goto L36
            r4 = r8[r2]
            int r5 = r3 + 1
            char[] r6 = getHEX_DIGIT_CHARS()
            int r7 = r4 >> 4
            r7 = r7 & 15
            char r6 = r6[r7]
            r0[r3] = r6
            int r3 = r5 + 1
            char[] r6 = getHEX_DIGIT_CHARS()
            r4 = r4 & 15
            char r4 = r6[r4]
            r0[r5] = r4
            int r2 = r2 + 1
            goto L15
        L36:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0)
            return r8
    }

    public static final int commonIndexOf(@org.jetbrains.annotations.NotNull okio.ByteString r4, @org.jetbrains.annotations.NotNull byte[] r5, int r6) {
            java.lang.String r0 = "$this$commonIndexOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            byte[] r0 = r4.getData$okio()
            int r0 = r0.length
            int r1 = r5.length
            int r0 = r0 - r1
            r1 = 0
            int r6 = java.lang.Math.max(r6, r1)
            if (r6 > r0) goto L29
        L18:
            byte[] r2 = r4.getData$okio()
            int r3 = r5.length
            boolean r2 = okio.Util.arrayRangeEquals(r2, r6, r5, r1, r3)
            if (r2 == 0) goto L24
            return r6
        L24:
            if (r6 == r0) goto L29
            int r6 = r6 + 1
            goto L18
        L29:
            r4 = -1
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] commonInternalArray(@org.jetbrains.annotations.NotNull okio.ByteString r1) {
            java.lang.String r0 = "$this$commonInternalArray"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte[] r1 = r1.getData$okio()
            return r1
    }

    public static final int commonLastIndexOf(@org.jetbrains.annotations.NotNull okio.ByteString r1, @org.jetbrains.annotations.NotNull okio.ByteString r2, int r3) {
            java.lang.String r0 = "$this$commonLastIndexOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r2 = r2.internalArray$okio()
            int r1 = r1.lastIndexOf(r2, r3)
            return r1
    }

    public static final int commonLastIndexOf(@org.jetbrains.annotations.NotNull okio.ByteString r3, @org.jetbrains.annotations.NotNull byte[] r4, int r5) {
            java.lang.String r0 = "$this$commonLastIndexOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            byte[] r0 = r3.getData$okio()
            int r0 = r0.length
            int r1 = r4.length
            int r0 = r0 - r1
            int r5 = java.lang.Math.min(r5, r0)
        L15:
            if (r5 < 0) goto L27
            byte[] r0 = r3.getData$okio()
            r1 = 0
            int r2 = r4.length
            boolean r0 = okio.Util.arrayRangeEquals(r0, r5, r4, r1, r2)
            if (r0 == 0) goto L24
            return r5
        L24:
            int r5 = r5 + (-1)
            goto L15
        L27:
            r3 = -1
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonOf(@org.jetbrains.annotations.NotNull byte[] r2) {
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.ByteString r0 = new okio.ByteString
            int r1 = r2.length
            byte[] r2 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r1 = "java.util.Arrays.copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            r0.<init>(r2)
            return r0
    }

    public static final boolean commonRangeEquals(@org.jetbrains.annotations.NotNull okio.ByteString r1, int r2, @org.jetbrains.annotations.NotNull okio.ByteString r3, int r4, int r5) {
            java.lang.String r0 = "$this$commonRangeEquals"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte[] r1 = r1.getData$okio()
            boolean r1 = r3.rangeEquals(r4, r1, r2, r5)
            return r1
    }

    public static final boolean commonRangeEquals(@org.jetbrains.annotations.NotNull okio.ByteString r1, int r2, @org.jetbrains.annotations.NotNull byte[] r3, int r4, int r5) {
            java.lang.String r0 = "$this$commonRangeEquals"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r2 < 0) goto L26
            byte[] r0 = r1.getData$okio()
            int r0 = r0.length
            int r0 = r0 - r5
            if (r2 > r0) goto L26
            if (r4 < 0) goto L26
            int r0 = r3.length
            int r0 = r0 - r5
            if (r4 > r0) goto L26
            byte[] r1 = r1.getData$okio()
            boolean r1 = okio.Util.arrayRangeEquals(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            return r1
    }

    public static final boolean commonStartsWith(@org.jetbrains.annotations.NotNull okio.ByteString r2, @org.jetbrains.annotations.NotNull okio.ByteString r3) {
            java.lang.String r0 = "$this$commonStartsWith"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.size()
            r1 = 0
            boolean r2 = r2.rangeEquals(r1, r3, r1, r0)
            return r2
    }

    public static final boolean commonStartsWith(@org.jetbrains.annotations.NotNull okio.ByteString r2, @org.jetbrains.annotations.NotNull byte[] r3) {
            java.lang.String r0 = "$this$commonStartsWith"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            r1 = 0
            boolean r2 = r2.rangeEquals(r1, r3, r1, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonSubstring(@org.jetbrains.annotations.NotNull okio.ByteString r2, int r3, int r4) {
            java.lang.String r0 = "$this$commonSubstring"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1
            if (r3 < 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == 0) goto L60
            byte[] r1 = r2.getData$okio()
            int r1 = r1.length
            if (r4 > r1) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L45
            int r1 = r4 - r3
            if (r1 < 0) goto L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L39
            if (r3 != 0) goto L2b
            byte[] r0 = r2.getData$okio()
            int r0 = r0.length
            if (r4 != r0) goto L2b
            return r2
        L2b:
            okio.ByteString r0 = new okio.ByteString
            byte[] r2 = r2.getData$okio()
            byte[] r2 = kotlin.collections.ArraysKt.copyOfRange(r2, r3, r4)
            r0.<init>(r2)
            return r0
        L39:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "endIndex < beginIndex"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L45:
            java.lang.String r3 = "endIndex > length("
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            byte[] r2 = r2.getData$okio()
            int r2 = r2.length
            r4 = 41
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r2, r4)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L60:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "beginIndex < 0"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonToAsciiLowercase(@org.jetbrains.annotations.NotNull okio.ByteString r5) {
            java.lang.String r0 = "$this$commonToAsciiLowercase"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
        L6:
            byte[] r1 = r5.getData$okio()
            int r1 = r1.length
            if (r0 >= r1) goto L4e
            byte[] r1 = r5.getData$okio()
            r1 = r1[r0]
            r2 = 65
            byte r2 = (byte) r2
            if (r1 < r2) goto L4b
            r3 = 90
            byte r3 = (byte) r3
            if (r1 <= r3) goto L1e
            goto L4b
        L1e:
            byte[] r5 = r5.getData$okio()
            int r4 = r5.length
            byte[] r5 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r4 = "java.util.Arrays.copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            int r4 = r0 + 1
            int r1 = r1 + 32
            byte r1 = (byte) r1
            r5[r0] = r1
        L33:
            int r0 = r5.length
            if (r4 >= r0) goto L45
            r0 = r5[r4]
            if (r0 < r2) goto L42
            if (r0 <= r3) goto L3d
            goto L42
        L3d:
            int r0 = r0 + 32
            byte r0 = (byte) r0
            r5[r4] = r0
        L42:
            int r4 = r4 + 1
            goto L33
        L45:
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r5)
            return r0
        L4b:
            int r0 = r0 + 1
            goto L6
        L4e:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonToAsciiUppercase(@org.jetbrains.annotations.NotNull okio.ByteString r5) {
            java.lang.String r0 = "$this$commonToAsciiUppercase"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
        L6:
            byte[] r1 = r5.getData$okio()
            int r1 = r1.length
            if (r0 >= r1) goto L4e
            byte[] r1 = r5.getData$okio()
            r1 = r1[r0]
            r2 = 97
            byte r2 = (byte) r2
            if (r1 < r2) goto L4b
            r3 = 122(0x7a, float:1.71E-43)
            byte r3 = (byte) r3
            if (r1 <= r3) goto L1e
            goto L4b
        L1e:
            byte[] r5 = r5.getData$okio()
            int r4 = r5.length
            byte[] r5 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r4 = "java.util.Arrays.copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            int r4 = r0 + 1
            int r1 = r1 + (-32)
            byte r1 = (byte) r1
            r5[r0] = r1
        L33:
            int r0 = r5.length
            if (r4 >= r0) goto L45
            r0 = r5[r4]
            if (r0 < r2) goto L42
            if (r0 <= r3) goto L3d
            goto L42
        L3d:
            int r0 = r0 + (-32)
            byte r0 = (byte) r0
            r5[r4] = r0
        L42:
            int r4 = r4 + 1
            goto L33
        L45:
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r5)
            return r0
        L4b:
            int r0 = r0 + 1
            goto L6
        L4e:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] commonToByteArray(@org.jetbrains.annotations.NotNull okio.ByteString r1) {
            java.lang.String r0 = "$this$commonToByteArray"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte[] r1 = r1.getData$okio()
            int r0 = r1.length
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "java.util.Arrays.copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonToByteString(@org.jetbrains.annotations.NotNull byte[] r7, int r8, int r9) {
            java.lang.String r0 = "$this$commonToByteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r7.length
            long r1 = (long) r0
            long r3 = (long) r8
            long r5 = (long) r9
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            okio.ByteString r0 = new okio.ByteString
            int r9 = r9 + r8
            byte[] r7 = kotlin.collections.ArraysKt.copyOfRange(r7, r8, r9)
            r0.<init>(r7)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonToString(@org.jetbrains.annotations.NotNull okio.ByteString r8) {
            java.lang.String r0 = "$this$commonToString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            byte[] r0 = r8.getData$okio()
            int r0 = r0.length
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L16
            java.lang.String r8 = "[size=0]"
            return r8
        L16:
            byte[] r0 = r8.getData$okio()
            r3 = 64
            int r0 = access$codePointIndexToCharIndex(r0, r3)
            r4 = -1
            java.lang.String r5 = "…]"
            r6 = 93
            java.lang.String r7 = "[size="
            if (r0 != r4) goto La2
            byte[] r0 = r8.getData$okio()
            int r0 = r0.length
            if (r0 > r3) goto L46
            java.lang.String r0 = "[hex="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r8 = r8.hex()
            r0.append(r8)
            r0.append(r6)
            java.lang.String r8 = r0.toString()
            goto L86
        L46:
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7)
            byte[] r4 = r8.getData$okio()
            int r4 = r4.length
            r0.append(r4)
            java.lang.String r4 = " hex="
            r0.append(r4)
            byte[] r4 = r8.getData$okio()
            int r4 = r4.length
            if (r3 > r4) goto L5f
            goto L60
        L5f:
            r1 = 0
        L60:
            if (r1 == 0) goto L87
            byte[] r1 = r8.getData$okio()
            int r1 = r1.length
            if (r3 != r1) goto L6a
            goto L78
        L6a:
            okio.ByteString r1 = new okio.ByteString
            byte[] r8 = r8.getData$okio()
            byte[] r8 = kotlin.collections.ArraysKt.copyOfRange(r8, r2, r3)
            r1.<init>(r8)
            r8 = r1
        L78:
            java.lang.String r8 = r8.hex()
            r0.append(r8)
            r0.append(r5)
            java.lang.String r8 = r0.toString()
        L86:
            return r8
        L87:
            java.lang.String r0 = "endIndex > length("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            byte[] r8 = r8.getData$okio()
            int r8 = r8.length
            r1 = 41
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r8, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        La2:
            java.lang.String r1 = r8.utf8()
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r1, r3)
            java.lang.String r2 = r1.substring(r2, r0)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = "\\"
            java.lang.String r4 = "\\\\"
            java.lang.String r2 = kotlin.text.StringsKt.replace$default(r2, r3, r4)
            java.lang.String r3 = "\n"
            java.lang.String r4 = "\\n"
            java.lang.String r2 = kotlin.text.StringsKt.replace$default(r2, r3, r4)
            java.lang.String r3 = "\r"
            java.lang.String r4 = "\\r"
            java.lang.String r2 = kotlin.text.StringsKt.replace$default(r2, r3, r4)
            int r1 = r1.length()
            if (r0 >= r1) goto Lee
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7)
            byte[] r8 = r8.getData$okio()
            int r8 = r8.length
            r0.append(r8)
            java.lang.String r8 = " text="
            r0.append(r8)
            r0.append(r2)
            r0.append(r5)
            java.lang.String r8 = r0.toString()
            goto L102
        Lee:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "[text="
            r8.append(r0)
            r8.append(r2)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
        L102:
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonUtf8(@org.jetbrains.annotations.NotNull okio.ByteString r1) {
            java.lang.String r0 = "$this$commonUtf8"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = r1.getUtf8$okio()
            if (r0 != 0) goto L16
            byte[] r0 = r1.internalArray$okio()
            java.lang.String r0 = okio.Platform.toUtf8String(r0)
            r1.setUtf8$okio(r0)
        L16:
            return r0
    }

    public static final void commonWrite(@org.jetbrains.annotations.NotNull okio.ByteString r1, @org.jetbrains.annotations.NotNull okio.Buffer r2, int r3, int r4) {
            java.lang.String r0 = "$this$commonWrite"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r1 = r1.getData$okio()
            r2.write(r1, r3, r4)
            return
    }

    private static final int decodeHexDigit(char r3) {
            r0 = 48
            if (r0 <= r3) goto L5
            goto Lb
        L5:
            r1 = 57
            if (r1 < r3) goto Lb
            int r3 = r3 - r0
            goto L21
        Lb:
            r0 = 102(0x66, float:1.43E-43)
            r1 = 97
            if (r1 <= r3) goto L12
            goto L18
        L12:
            if (r0 < r3) goto L18
        L14:
            int r3 = r3 - r1
            int r3 = r3 + 10
            goto L21
        L18:
            r0 = 70
            r1 = 65
            if (r1 > r3) goto L22
            if (r0 < r3) goto L22
            goto L14
        L21:
            return r3
        L22:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected hex digit: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final char[] getHEX_DIGIT_CHARS() {
            char[] r0 = okio.internal.ByteStringKt.HEX_DIGIT_CHARS
            return r0
    }
}
