package okio;

/* JADX INFO: renamed from: okio.-Base64, reason: invalid class name */
/* JADX INFO: compiled from: -Base64.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0000\u001a\u0016\u0010\b\u001a\u00020\u0007*\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\n"}, d2 = {"BASE64", "", "getBASE64", "()[B", "BASE64_URL_SAFE", "getBASE64_URL_SAFE", "decodeBase64ToArray", "", "encodeBase64", "map", "okio"}, k = 2, mv = {1, 4, 1})
@kotlin.jvm.JvmName(name = "-Base64")
public final class Base64 {

    @org.jetbrains.annotations.NotNull
    private static final byte[] BASE64 = null;

    @org.jetbrains.annotations.NotNull
    private static final byte[] BASE64_URL_SAFE = null;

    static {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            byte[] r1 = r1.getData$okio()
            okio.Base64.BASE64 = r1
            java.lang.String r1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            byte[] r0 = r0.getData$okio()
            okio.Base64.BASE64_URL_SAFE = r0
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final byte[] decodeBase64ToArray(@org.jetbrains.annotations.NotNull java.lang.String r15) {
            java.lang.String r0 = "$this$decodeBase64ToArray"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            int r0 = r15.length()
        L9:
            r1 = 9
            r2 = 32
            r3 = 13
            r4 = 10
            if (r0 <= 0) goto L29
            int r5 = r0 + (-1)
            char r5 = r15.charAt(r5)
            r6 = 61
            if (r5 == r6) goto L26
            if (r5 == r4) goto L26
            if (r5 == r3) goto L26
            if (r5 == r2) goto L26
            if (r5 == r1) goto L26
            goto L29
        L26:
            int r0 = r0 + (-1)
            goto L9
        L29:
            long r5 = (long) r0
            r7 = 6
            long r5 = r5 * r7
            r7 = 8
            long r5 = r5 / r7
            int r6 = (int) r5
            byte[] r5 = new byte[r6]
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L38:
            r11 = 0
            if (r7 >= r0) goto La4
            char r12 = r15.charAt(r7)
            r13 = 90
            r14 = 65
            if (r14 <= r12) goto L46
            goto L4b
        L46:
            if (r13 < r12) goto L4b
            int r12 = r12 + (-65)
            goto L84
        L4b:
            r13 = 122(0x7a, float:1.71E-43)
            r14 = 97
            if (r14 <= r12) goto L52
            goto L57
        L52:
            if (r13 < r12) goto L57
            int r12 = r12 + (-71)
            goto L84
        L57:
            r13 = 57
            r14 = 48
            if (r14 <= r12) goto L5e
            goto L63
        L5e:
            if (r13 < r12) goto L63
            int r12 = r12 + 4
            goto L84
        L63:
            r13 = 43
            if (r12 == r13) goto L82
            r13 = 45
            if (r12 != r13) goto L6c
            goto L82
        L6c:
            r13 = 47
            if (r12 == r13) goto L7f
            r13 = 95
            if (r12 != r13) goto L75
            goto L7f
        L75:
            if (r12 == r4) goto La1
            if (r12 == r3) goto La1
            if (r12 == r2) goto La1
            if (r12 != r1) goto L7e
            goto La1
        L7e:
            return r11
        L7f:
            r12 = 63
            goto L84
        L82:
            r12 = 62
        L84:
            int r9 = r9 << 6
            r9 = r9 | r12
            int r8 = r8 + 1
            int r11 = r8 % 4
            if (r11 != 0) goto La1
            int r11 = r10 + 1
            int r12 = r9 >> 16
            byte r12 = (byte) r12
            r5[r10] = r12
            int r10 = r11 + 1
            int r12 = r9 >> 8
            byte r12 = (byte) r12
            r5[r11] = r12
            int r11 = r10 + 1
            byte r12 = (byte) r9
            r5[r10] = r12
            r10 = r11
        La1:
            int r7 = r7 + 1
            goto L38
        La4:
            int r8 = r8 % 4
            r15 = 1
            if (r8 == r15) goto Ld8
            r15 = 2
            if (r8 == r15) goto Lc1
            r15 = 3
            if (r8 == r15) goto Lb0
            goto Lcb
        Lb0:
            int r15 = r9 << 6
            int r0 = r10 + 1
            int r1 = r15 >> 16
            byte r1 = (byte) r1
            r5[r10] = r1
            int r10 = r0 + 1
            int r15 = r15 >> 8
            byte r15 = (byte) r15
            r5[r0] = r15
            goto Lcb
        Lc1:
            int r15 = r9 << 12
            int r0 = r10 + 1
            int r15 = r15 >> 16
            byte r15 = (byte) r15
            r5[r10] = r15
            r10 = r0
        Lcb:
            if (r10 != r6) goto Lce
            return r5
        Lce:
            byte[] r15 = java.util.Arrays.copyOf(r5, r10)
            java.lang.String r0 = "java.util.Arrays.copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r0)
            return r15
        Ld8:
            return r11
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String encodeBase64(@org.jetbrains.annotations.NotNull byte[] r10, @org.jetbrains.annotations.NotNull byte[] r11) {
            java.lang.String r0 = "$this$encodeBase64"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "map"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            int r0 = r10.length
            r1 = 2
            int r0 = r0 + r1
            int r0 = r0 / 3
            int r0 = r0 * 4
            byte[] r0 = new byte[r0]
            int r2 = r10.length
            int r3 = r10.length
            int r3 = r3 % 3
            int r2 = r2 - r3
            r3 = 0
            r4 = 0
        L1a:
            if (r3 >= r2) goto L58
            int r5 = r3 + 1
            r3 = r10[r3]
            int r6 = r5 + 1
            r5 = r10[r5]
            int r7 = r6 + 1
            r6 = r10[r6]
            int r8 = r4 + 1
            r9 = r3 & 255(0xff, float:3.57E-43)
            int r9 = r9 >> r1
            r9 = r11[r9]
            r0[r4] = r9
            int r4 = r8 + 1
            r3 = r3 & 3
            int r3 = r3 << 4
            r9 = r5 & 255(0xff, float:3.57E-43)
            int r9 = r9 >> 4
            r3 = r3 | r9
            r3 = r11[r3]
            r0[r8] = r3
            int r3 = r4 + 1
            r5 = r5 & 15
            int r5 = r5 << r1
            r8 = r6 & 255(0xff, float:3.57E-43)
            int r8 = r8 >> 6
            r5 = r5 | r8
            r5 = r11[r5]
            r0[r4] = r5
            int r4 = r3 + 1
            r5 = r6 & 63
            r5 = r11[r5]
            r0[r3] = r5
            r3 = r7
            goto L1a
        L58:
            int r5 = r10.length
            int r5 = r5 - r2
            r2 = 61
            r6 = 1
            if (r5 == r6) goto L8d
            if (r5 == r1) goto L62
            goto Laa
        L62:
            int r5 = r3 + 1
            r3 = r10[r3]
            r10 = r10[r5]
            int r5 = r4 + 1
            r6 = r3 & 255(0xff, float:3.57E-43)
            int r6 = r6 >> r1
            r6 = r11[r6]
            r0[r4] = r6
            int r4 = r5 + 1
            r3 = r3 & 3
            int r3 = r3 << 4
            r6 = r10 & 255(0xff, float:3.57E-43)
            int r6 = r6 >> 4
            r3 = r3 | r6
            r3 = r11[r3]
            r0[r5] = r3
            int r3 = r4 + 1
            r10 = r10 & 15
            int r10 = r10 << r1
            r10 = r11[r10]
            r0[r4] = r10
            byte r10 = (byte) r2
            r0[r3] = r10
            goto Laa
        L8d:
            r10 = r10[r3]
            int r3 = r4 + 1
            r5 = r10 & 255(0xff, float:3.57E-43)
            int r1 = r5 >> 2
            r1 = r11[r1]
            r0[r4] = r1
            int r1 = r3 + 1
            r10 = r10 & 3
            int r10 = r10 << 4
            r10 = r11[r10]
            r0[r3] = r10
            int r10 = r1 + 1
            byte r11 = (byte) r2
            r0[r1] = r11
            r0[r10] = r11
        Laa:
            java.lang.String r10 = okio.Platform.toUtf8String(r0)
            return r10
    }

    public static /* synthetic */ java.lang.String encodeBase64$default(byte[] r0, byte[] r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            byte[] r1 = okio.Base64.BASE64
        L6:
            java.lang.String r0 = encodeBase64(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] getBASE64() {
            byte[] r0 = okio.Base64.BASE64
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] getBASE64_URL_SAFE() {
            byte[] r0 = okio.Base64.BASE64_URL_SAFE
            return r0
    }
}
