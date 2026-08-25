package okio;

/* JADX INFO: compiled from: Utf8.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0080\b\u001a4\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0018\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001a\u001a\u00020\u0016*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001c\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a%\u0010\u001d\u001a\u00020\u001e*\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"HIGH_SURROGATE_HEADER", "", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "REPLACEMENT_BYTE", "", "REPLACEMENT_CHARACTER", "", "REPLACEMENT_CODE_POINT", "isIsoControl", "", "codePoint", "isUtf8Continuation", "byte", "process2Utf8Bytes", "", "beginIndex", "endIndex", "yield", "Lkotlin/Function1;", "", "process3Utf8Bytes", "process4Utf8Bytes", "processUtf16Chars", "processUtf8Bytes", "", "processUtf8CodePoints", "utf8Size", "", "size", "okio"}, k = 2, mv = {1, 4, 1})
@kotlin.jvm.JvmName(name = "Utf8")
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int r2) {
            if (r2 < 0) goto L6
            r0 = 31
            if (r0 >= r2) goto Lf
        L6:
            r0 = 159(0x9f, float:2.23E-43)
            r1 = 127(0x7f, float:1.78E-43)
            if (r1 <= r2) goto Ld
            goto L11
        Ld:
            if (r0 < r2) goto L11
        Lf:
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            return r2
    }

    public static final boolean isUtf8Continuation(byte r1) {
            r1 = r1 & 192(0xc0, float:2.69E-43)
            r0 = 128(0x80, float:1.8E-43)
            if (r1 != r0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public static final int process2Utf8Bytes(@org.jetbrains.annotations.NotNull byte[] r3, int r4, int r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r6) {
            java.lang.String r0 = "$this$process2Utf8Bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r4 + 1
            r1 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            if (r5 > r0) goto L1b
            r6.invoke(r1)
            return r2
        L1b:
            r4 = r3[r4]
            r3 = r3[r0]
            r5 = r3 & 192(0xc0, float:2.69E-43)
            r0 = 128(0x80, float:1.8E-43)
            if (r5 != r0) goto L27
            r5 = 1
            goto L28
        L27:
            r5 = 0
        L28:
            if (r5 != 0) goto L2e
            r6.invoke(r1)
            return r2
        L2e:
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r4 = r4 << 6
            r3 = r3 ^ r4
            if (r3 >= r0) goto L39
            r6.invoke(r1)
            goto L40
        L39:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.invoke(r3)
        L40:
            r3 = 2
            return r3
    }

    public static final int process3Utf8Bytes(@org.jetbrains.annotations.NotNull byte[] r7, int r8, int r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r10) {
            java.lang.String r0 = "$this$process3Utf8Bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r8 + 2
            r1 = 0
            r2 = 128(0x80, float:1.8E-43)
            r3 = 2
            r4 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            if (r9 > r0) goto L2d
            r10.invoke(r4)
            int r8 = r8 + r5
            if (r9 <= r8) goto L2c
            r7 = r7[r8]
            r7 = r7 & 192(0xc0, float:2.69E-43)
            if (r7 != r2) goto L28
            r1 = 1
        L28:
            if (r1 != 0) goto L2b
            goto L2c
        L2b:
            return r3
        L2c:
            return r5
        L2d:
            r9 = r7[r8]
            int r8 = r8 + r5
            r8 = r7[r8]
            r6 = r8 & 192(0xc0, float:2.69E-43)
            if (r6 != r2) goto L38
            r6 = 1
            goto L39
        L38:
            r6 = 0
        L39:
            if (r6 != 0) goto L3f
            r10.invoke(r4)
            return r5
        L3f:
            r7 = r7[r0]
            r0 = r7 & 192(0xc0, float:2.69E-43)
            if (r0 != r2) goto L46
            r1 = 1
        L46:
            if (r1 != 0) goto L4c
            r10.invoke(r4)
            return r3
        L4c:
            r0 = -123008(0xfffffffffffe1f80, float:NaN)
            r7 = r7 ^ r0
            int r8 = r8 << 6
            r7 = r7 ^ r8
            int r8 = r9 << 12
            r7 = r7 ^ r8
            r8 = 2048(0x800, float:2.87E-42)
            if (r7 >= r8) goto L5e
            r10.invoke(r4)
            goto L74
        L5e:
            r8 = 57343(0xdfff, float:8.0355E-41)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r9 <= r7) goto L67
            goto L6d
        L67:
            if (r8 < r7) goto L6d
            r10.invoke(r4)
            goto L74
        L6d:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.invoke(r7)
        L74:
            r7 = 3
            return r7
    }

    public static final int process4Utf8Bytes(@org.jetbrains.annotations.NotNull byte[] r9, int r10, int r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r12) {
            java.lang.String r0 = "$this$process4Utf8Bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            int r0 = r10 + 3
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 128(0x80, float:1.8E-43)
            r5 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 1
            if (r11 > r0) goto L3f
            r12.invoke(r5)
            int r12 = r10 + 1
            if (r11 <= r12) goto L3e
            r12 = r9[r12]
            r12 = r12 & 192(0xc0, float:2.69E-43)
            if (r12 != r4) goto L2b
            r12 = 1
            goto L2c
        L2b:
            r12 = 0
        L2c:
            if (r12 != 0) goto L2f
            goto L3e
        L2f:
            int r10 = r10 + r2
            if (r11 <= r10) goto L3d
            r9 = r9[r10]
            r9 = r9 & 192(0xc0, float:2.69E-43)
            if (r9 != r4) goto L39
            r3 = 1
        L39:
            if (r3 != 0) goto L3c
            goto L3d
        L3c:
            return r1
        L3d:
            return r2
        L3e:
            return r6
        L3f:
            r11 = r9[r10]
            int r7 = r10 + 1
            r7 = r9[r7]
            r8 = r7 & 192(0xc0, float:2.69E-43)
            if (r8 != r4) goto L4b
            r8 = 1
            goto L4c
        L4b:
            r8 = 0
        L4c:
            if (r8 != 0) goto L52
            r12.invoke(r5)
            return r6
        L52:
            int r10 = r10 + r2
            r10 = r9[r10]
            r8 = r10 & 192(0xc0, float:2.69E-43)
            if (r8 != r4) goto L5b
            r8 = 1
            goto L5c
        L5b:
            r8 = 0
        L5c:
            if (r8 != 0) goto L62
            r12.invoke(r5)
            return r2
        L62:
            r9 = r9[r0]
            r0 = r9 & 192(0xc0, float:2.69E-43)
            if (r0 != r4) goto L69
            r3 = 1
        L69:
            if (r3 != 0) goto L6f
            r12.invoke(r5)
            return r1
        L6f:
            r0 = 3678080(0x381f80, float:5.154088E-39)
            r9 = r9 ^ r0
            int r10 = r10 << 6
            r9 = r9 ^ r10
            int r10 = r7 << 12
            r9 = r9 ^ r10
            int r10 = r11 << 18
            r9 = r9 ^ r10
            r10 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 <= r10) goto L85
            r12.invoke(r5)
            goto La3
        L85:
            r10 = 57343(0xdfff, float:8.0355E-41)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r11 <= r9) goto L8e
            goto L94
        L8e:
            if (r10 < r9) goto L94
            r12.invoke(r5)
            goto La3
        L94:
            r10 = 65536(0x10000, float:9.1835E-41)
            if (r9 >= r10) goto L9c
            r12.invoke(r5)
            goto La3
        L9c:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.invoke(r9)
        La3:
            r9 = 4
            return r9
    }

    public static final void processUtf16Chars(@org.jetbrains.annotations.NotNull byte[] r16, int r17, int r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Character, kotlin.Unit> r19) {
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.String r3 = "$this$processUtf16Chars"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r3 = r17
        L13:
            if (r3 >= r1) goto L1b7
            r4 = r0[r3]
            if (r4 < 0) goto L37
            char r4 = (char) r4
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            int r3 = r3 + 1
        L23:
            if (r3 >= r1) goto L13
            r4 = r0[r3]
            if (r4 < 0) goto L13
            int r4 = r3 + 1
            r3 = r0[r3]
            char r3 = (char) r3
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r2.invoke(r3)
            r3 = r4
            goto L23
        L37:
            int r5 = r4 >> 5
            r6 = -2
            r8 = 0
            r9 = 128(0x80, float:1.8E-43)
            r10 = 65533(0xfffd, float:9.1831E-41)
            r11 = 1
            if (r5 != r6) goto L75
            int r4 = r3 + 1
            if (r1 > r4) goto L53
        L47:
            char r4 = (char) r10
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L51:
            r7 = 1
            goto L73
        L53:
            r5 = r0[r3]
            r4 = r0[r4]
            r6 = r4 & 192(0xc0, float:2.69E-43)
            if (r6 != r9) goto L5c
            r8 = 1
        L5c:
            if (r8 != 0) goto L5f
            goto L47
        L5f:
            r4 = r4 ^ 3968(0xf80, float:5.56E-42)
            int r5 = r5 << 6
            r4 = r4 ^ r5
            if (r4 >= r9) goto L68
            char r4 = (char) r10
            goto L69
        L68:
            char r4 = (char) r4
        L69:
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L72:
            r7 = 2
        L73:
            int r3 = r3 + r7
            goto L13
        L75:
            int r5 = r4 >> 4
            r12 = 55296(0xd800, float:7.7486E-41)
            r13 = 57343(0xdfff, float:8.0355E-41)
            r14 = 3
            if (r5 != r6) goto Led
            int r4 = r3 + 2
            if (r1 > r4) goto L9c
            char r4 = (char) r10
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            int r4 = r3 + 1
            if (r1 <= r4) goto L51
            r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L99
            r8 = 1
        L99:
            if (r8 != 0) goto L72
            goto L51
        L9c:
            r5 = r0[r3]
            int r6 = r3 + 1
            r6 = r0[r6]
            r15 = r6 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto La8
            r15 = 1
            goto La9
        La8:
            r15 = 0
        La9:
            if (r15 != 0) goto Lb6
            char r4 = (char) r10
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto L51
        Lb6:
            r4 = r0[r4]
            r15 = r4 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto Lbd
            r8 = 1
        Lbd:
            if (r8 != 0) goto Lca
            char r4 = (char) r10
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto L72
        Lca:
            r7 = -123008(0xfffffffffffe1f80, float:NaN)
            r4 = r4 ^ r7
            int r6 = r6 << 6
            r4 = r4 ^ r6
            int r5 = r5 << 12
            r4 = r4 ^ r5
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto Le3
        Ld8:
            char r4 = (char) r10
        Ld9:
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto Leb
        Le3:
            if (r12 <= r4) goto Le6
            goto Le9
        Le6:
            if (r13 < r4) goto Le9
            goto Ld8
        Le9:
            char r4 = (char) r4
            goto Ld9
        Leb:
            r7 = 3
            goto L73
        Led:
            int r4 = r4 >> 3
            if (r4 != r6) goto L1ac
            int r4 = r3 + 3
            if (r1 > r4) goto L11e
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            int r4 = r3 + 1
            if (r1 <= r4) goto L51
            r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L10a
            r4 = 1
            goto L10b
        L10a:
            r4 = 0
        L10b:
            if (r4 != 0) goto L10f
            goto L51
        L10f:
            int r4 = r3 + 2
            if (r1 <= r4) goto L72
            r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L11a
            r8 = 1
        L11a:
            if (r8 != 0) goto Leb
            goto L72
        L11e:
            r5 = r0[r3]
            int r6 = r3 + 1
            r6 = r0[r6]
            r15 = r6 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L12a
            r15 = 1
            goto L12b
        L12a:
            r15 = 0
        L12b:
            if (r15 != 0) goto L138
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto L51
        L138:
            int r15 = r3 + 2
            r15 = r0[r15]
            r7 = r15 & 192(0xc0, float:2.69E-43)
            if (r7 != r9) goto L142
            r7 = 1
            goto L143
        L142:
            r7 = 0
        L143:
            if (r7 != 0) goto L150
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto L72
        L150:
            r4 = r0[r4]
            r7 = r4 & 192(0xc0, float:2.69E-43)
            if (r7 != r9) goto L157
            r8 = 1
        L157:
            if (r8 != 0) goto L163
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto Leb
        L163:
            r7 = 3678080(0x381f80, float:5.154088E-39)
            r4 = r4 ^ r7
            int r7 = r15 << 6
            r4 = r4 ^ r7
            int r6 = r6 << 12
            r4 = r4 ^ r6
            int r5 = r5 << 18
            r4 = r4 ^ r5
            r5 = 1114111(0x10ffff, float:1.561202E-39)
            if (r4 <= r5) goto L17f
        L175:
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            r2.invoke(r4)
        L17c:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto L1a9
        L17f:
            if (r12 <= r4) goto L182
            goto L185
        L182:
            if (r13 < r4) goto L185
            goto L175
        L185:
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r4 >= r5) goto L18a
            goto L175
        L18a:
            if (r4 == r10) goto L175
            int r5 = r4 >>> 10
            r6 = 55232(0xd7c0, float:7.7397E-41)
            int r5 = r5 + r6
            char r5 = (char) r5
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            r2.invoke(r5)
            r4 = r4 & 1023(0x3ff, float:1.434E-42)
            r5 = 56320(0xdc00, float:7.8921E-41)
            int r4 = r4 + r5
            char r4 = (char) r4
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            goto L17c
        L1a9:
            r7 = 4
            goto L73
        L1ac:
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            r2.invoke(r4)
            int r3 = r3 + 1
            goto L13
        L1b7:
            return
    }

    public static final void processUtf8Bytes(@org.jetbrains.annotations.NotNull java.lang.String r7, int r8, int r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Byte, kotlin.Unit> r10) {
            java.lang.String r0 = "$this$processUtf8Bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
        Lb:
            if (r8 >= r9) goto Lf2
            char r0 = r7.charAt(r8)
            r1 = 128(0x80, float:1.8E-43)
            int r2 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r2 >= 0) goto L3f
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            int r8 = r8 + 1
        L23:
            if (r8 >= r9) goto Lb
            char r0 = r7.charAt(r8)
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r0 >= 0) goto Lb
            int r0 = r8 + 1
            char r8 = r7.charAt(r8)
            byte r8 = (byte) r8
            java.lang.Byte r8 = java.lang.Byte.valueOf(r8)
            r10.invoke(r8)
            r8 = r0
            goto L23
        L3f:
            r2 = 2048(0x800, float:2.87E-42)
            int r2 = kotlin.jvm.internal.Intrinsics.compare(r0, r2)
            if (r2 >= 0) goto L61
            int r2 = r0 >> 6
            r2 = r2 | 192(0xc0, float:2.69E-43)
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
        L5e:
            int r8 = r8 + 1
            goto Lb
        L61:
            r2 = 55296(0xd800, float:7.7486E-41)
            r3 = 63
            if (r2 > r0) goto Lcd
            r2 = 57343(0xdfff, float:8.0355E-41)
            if (r2 >= r0) goto L6e
            goto Lcd
        L6e:
            r4 = 56319(0xdbff, float:7.892E-41)
            int r4 = kotlin.jvm.internal.Intrinsics.compare(r0, r4)
            if (r4 > 0) goto Lc5
            int r4 = r8 + 1
            if (r9 <= r4) goto Lc5
            r5 = 56320(0xdc00, float:7.8921E-41)
            char r6 = r7.charAt(r4)
            if (r5 > r6) goto Lc5
            if (r2 >= r6) goto L87
            goto Lc5
        L87:
            int r0 = r0 << 10
            char r2 = r7.charAt(r4)
            int r2 = r2 + r0
            r0 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r2 = r2 + r0
            int r0 = r2 >> 18
            r0 = r0 | 240(0xf0, float:3.36E-43)
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            int r0 = r2 >> 12
            r0 = r0 & r3
            r0 = r0 | r1
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            int r0 = r2 >> 6
            r0 = r0 & r3
            r0 = r0 | r1
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            r0 = r2 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            int r8 = r8 + 2
            goto Lb
        Lc5:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r3)
            r10.invoke(r0)
            goto L5e
        Lcd:
            int r2 = r0 >> 12
            r2 = r2 | 224(0xe0, float:3.14E-43)
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            int r2 = r0 >> 6
            r2 = r2 & r3
            r2 = r2 | r1
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            goto L5e
        Lf2:
            return
    }

    public static final void processUtf8CodePoints(@org.jetbrains.annotations.NotNull byte[] r16, int r17, int r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r19) {
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.String r3 = "$this$processUtf8CodePoints"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r3 = r17
        L13:
            if (r3 >= r1) goto L19b
            r4 = r0[r3]
            if (r4 < 0) goto L35
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.invoke(r4)
            int r3 = r3 + 1
        L22:
            if (r3 >= r1) goto L13
            r4 = r0[r3]
            if (r4 < 0) goto L13
            int r4 = r3 + 1
            r3 = r0[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.invoke(r3)
            r3 = r4
            goto L22
        L35:
            int r5 = r4 >> 5
            r6 = -2
            r8 = 0
            r9 = 128(0x80, float:1.8E-43)
            r10 = 65533(0xfffd, float:9.1831E-41)
            r11 = 1
            if (r5 != r6) goto L74
            int r4 = r3 + 1
            if (r1 > r4) goto L50
        L45:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L4e:
            r7 = 1
            goto L72
        L50:
            r5 = r0[r3]
            r4 = r0[r4]
            r6 = r4 & 192(0xc0, float:2.69E-43)
            if (r6 != r9) goto L59
            r8 = 1
        L59:
            if (r8 != 0) goto L5c
            goto L45
        L5c:
            r4 = r4 ^ 3968(0xf80, float:5.56E-42)
            int r5 = r5 << 6
            r4 = r4 ^ r5
            if (r4 >= r9) goto L68
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            goto L6c
        L68:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L6c:
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L71:
            r7 = 2
        L72:
            int r3 = r3 + r7
            goto L13
        L74:
            int r5 = r4 >> 4
            r12 = 55296(0xd800, float:7.7486E-41)
            r13 = 57343(0xdfff, float:8.0355E-41)
            r14 = 3
            if (r5 != r6) goto Leb
            int r4 = r3 + 2
            if (r1 > r4) goto L9a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            int r4 = r3 + 1
            if (r1 <= r4) goto L4e
            r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L97
            r8 = 1
        L97:
            if (r8 != 0) goto L71
            goto L4e
        L9a:
            r5 = r0[r3]
            int r6 = r3 + 1
            r6 = r0[r6]
            r15 = r6 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto La6
            r15 = 1
            goto La7
        La6:
            r15 = 0
        La7:
            if (r15 != 0) goto Lb3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto L4e
        Lb3:
            r4 = r0[r4]
            r15 = r4 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto Lba
            r8 = 1
        Lba:
            if (r8 != 0) goto Lc6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto L71
        Lc6:
            r7 = -123008(0xfffffffffffe1f80, float:NaN)
            r4 = r4 ^ r7
            int r6 = r6 << 6
            r4 = r4 ^ r6
            int r5 = r5 << 12
            r4 = r4 ^ r5
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto Lde
        Ld4:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
        Ld8:
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto Le9
        Lde:
            if (r12 <= r4) goto Le1
            goto Le4
        Le1:
            if (r13 < r4) goto Le4
            goto Ld4
        Le4:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto Ld8
        Le9:
            r7 = 3
            goto L72
        Leb:
            int r4 = r4 >> 3
            if (r4 != r6) goto L190
            int r4 = r3 + 3
            if (r1 > r4) goto L11c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            int r4 = r3 + 1
            if (r1 <= r4) goto L4e
            r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L108
            r4 = 1
            goto L109
        L108:
            r4 = 0
        L109:
            if (r4 != 0) goto L10d
            goto L4e
        L10d:
            int r4 = r3 + 2
            if (r1 <= r4) goto L71
            r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L118
            r8 = 1
        L118:
            if (r8 != 0) goto Le9
            goto L71
        L11c:
            r5 = r0[r3]
            int r6 = r3 + 1
            r6 = r0[r6]
            r15 = r6 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L128
            r15 = 1
            goto L129
        L128:
            r15 = 0
        L129:
            if (r15 != 0) goto L136
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto L4e
        L136:
            int r15 = r3 + 2
            r15 = r0[r15]
            r7 = r15 & 192(0xc0, float:2.69E-43)
            if (r7 != r9) goto L140
            r7 = 1
            goto L141
        L140:
            r7 = 0
        L141:
            if (r7 != 0) goto L14e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto L71
        L14e:
            r4 = r0[r4]
            r7 = r4 & 192(0xc0, float:2.69E-43)
            if (r7 != r9) goto L155
            r8 = 1
        L155:
            if (r8 != 0) goto L161
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto Le9
        L161:
            r7 = 3678080(0x381f80, float:5.154088E-39)
            r4 = r4 ^ r7
            int r7 = r15 << 6
            r4 = r4 ^ r7
            int r6 = r6 << 12
            r4 = r4 ^ r6
            int r5 = r5 << 18
            r4 = r4 ^ r5
            r5 = 1114111(0x10ffff, float:1.561202E-39)
            if (r4 <= r5) goto L17d
        L173:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
        L177:
            r2.invoke(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto L18d
        L17d:
            if (r12 <= r4) goto L180
            goto L183
        L180:
            if (r13 < r4) goto L183
            goto L173
        L183:
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r4 >= r5) goto L188
            goto L173
        L188:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L177
        L18d:
            r7 = 4
            goto L72
        L190:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            int r3 = r3 + 1
            goto L13
        L19b:
            return
    }

    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmName(name = "size")
    public static final long size(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r0 = 0
            r1 = 3
            r2 = 0
            long r0 = size$default(r3, r0, r0, r1, r2)
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmName(name = "size")
    public static final long size(@org.jetbrains.annotations.NotNull java.lang.String r3, int r4) {
            r0 = 0
            r1 = 2
            r2 = 0
            long r3 = size$default(r3, r4, r0, r1, r2)
            return r3
    }

    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmName(name = "size")
    public static final long size(@org.jetbrains.annotations.NotNull java.lang.String r9, int r10, int r11) {
            java.lang.String r0 = "$this$utf8Size"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 1
            if (r10 < 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == 0) goto L95
            if (r11 < r10) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L83
            int r1 = r9.length()
            if (r11 > r1) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L66
            r0 = 0
        L20:
            if (r10 >= r11) goto L65
            char r2 = r9.charAt(r10)
            r3 = 128(0x80, float:1.8E-43)
            r4 = 1
            if (r2 >= r3) goto L2e
            long r0 = r0 + r4
            goto L62
        L2e:
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 >= r3) goto L34
            r2 = 2
            goto L60
        L34:
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r3) goto L5f
            r3 = 57343(0xdfff, float:8.0355E-41)
            if (r2 <= r3) goto L3f
            goto L5f
        L3f:
            int r6 = r10 + 1
            if (r6 >= r11) goto L48
            char r7 = r9.charAt(r6)
            goto L49
        L48:
            r7 = 0
        L49:
            r8 = 56319(0xdbff, float:7.892E-41)
            if (r2 > r8) goto L5c
            r2 = 56320(0xdc00, float:7.8921E-41)
            if (r7 < r2) goto L5c
            if (r7 <= r3) goto L56
            goto L5c
        L56:
            r2 = 4
            long r2 = (long) r2
            long r0 = r0 + r2
            int r10 = r10 + 2
            goto L20
        L5c:
            long r0 = r0 + r4
            r10 = r6
            goto L20
        L5f:
            r2 = 3
        L60:
            long r2 = (long) r2
            long r0 = r0 + r2
        L62:
            int r10 = r10 + 1
            goto L20
        L65:
            return r0
        L66:
            java.lang.String r10 = "endIndex > string.length: "
            java.lang.String r0 = " > "
            java.lang.StringBuilder r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r10, r11, r0)
            int r9 = r9.length()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L83:
            java.lang.String r9 = "endIndex < beginIndex: "
            java.lang.String r0 = " < "
            java.lang.String r9 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r9, r11, r0, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L95:
            java.lang.String r9 = "beginIndex < 0: "
            java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public static /* synthetic */ long size$default(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            long r0 = size(r0, r1, r2)
            return r0
    }
}
