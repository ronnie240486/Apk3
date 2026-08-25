package okhttp3.internal;

/* JADX INFO: compiled from: hostnames.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, d2 = {"decodeIpv4Suffix", "", "input", "", "pos", "", "limit", "address", "", "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", "okhttp"}, k = 2, mv = {1, 4, 1})
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(java.lang.String r7) {
            int r0 = r7.length()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L2d
            char r3 = r7.charAt(r2)
            r4 = 31
            int r4 = kotlin.jvm.internal.Intrinsics.compare(r3, r4)
            r5 = 1
            if (r4 <= 0) goto L2c
            r4 = 127(0x7f, float:1.78E-43)
            int r4 = kotlin.jvm.internal.Intrinsics.compare(r3, r4)
            if (r4 < 0) goto L1e
            goto L2c
        L1e:
            r4 = 6
            java.lang.String r6 = " #%/:?@[\\]"
            int r3 = kotlin.text.StringsKt.indexOf$default(r6, r3, r1, r4)
            r4 = -1
            if (r3 == r4) goto L29
            return r5
        L29:
            int r2 = r2 + 1
            goto L6
        L2c:
            return r5
        L2d:
            return r1
    }

    private static final boolean decodeIpv4Suffix(java.lang.String r7, int r8, int r9, byte[] r10, int r11) {
            r0 = r11
        L1:
            r1 = 0
            if (r8 >= r9) goto L4c
            int r2 = r10.length
            if (r0 != r2) goto L8
            return r1
        L8:
            if (r0 == r11) goto L15
            char r2 = r7.charAt(r8)
            r3 = 46
            if (r2 == r3) goto L13
            return r1
        L13:
            int r8 = r8 + 1
        L15:
            r2 = r8
            r3 = 0
        L17:
            if (r2 >= r9) goto L3f
            char r4 = r7.charAt(r2)
            r5 = 48
            int r6 = kotlin.jvm.internal.Intrinsics.compare(r4, r5)
            if (r6 < 0) goto L3f
            r6 = 57
            int r6 = kotlin.jvm.internal.Intrinsics.compare(r4, r6)
            if (r6 <= 0) goto L2e
            goto L3f
        L2e:
            if (r3 != 0) goto L33
            if (r8 == r2) goto L33
            return r1
        L33:
            int r3 = r3 * 10
            int r3 = r3 + r4
            int r3 = r3 - r5
            r4 = 255(0xff, float:3.57E-43)
            if (r3 <= r4) goto L3c
            return r1
        L3c:
            int r2 = r2 + 1
            goto L17
        L3f:
            int r8 = r2 - r8
            if (r8 != 0) goto L44
            return r1
        L44:
            int r8 = r0 + 1
            byte r1 = (byte) r3
            r10[r0] = r1
            r0 = r8
            r8 = r2
            goto L1
        L4c:
            int r11 = r11 + 4
            if (r0 != r11) goto L51
            r1 = 1
        L51:
            return r1
    }

    private static final java.net.InetAddress decodeIpv6(java.lang.String r11, int r12, int r13) {
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = 0
            r5 = -1
            r6 = -1
        L9:
            r7 = 0
            if (r12 >= r13) goto L78
            if (r4 != r0) goto Lf
            return r7
        Lf:
            int r8 = r12 + 2
            if (r8 > r13) goto L26
            java.lang.String r9 = "::"
            boolean r9 = kotlin.text.StringsKt.startsWith$default(r11, r9, r12)
            if (r9 == 0) goto L26
            if (r5 == r3) goto L1e
            return r7
        L1e:
            int r4 = r4 + 2
            r5 = r4
            if (r8 != r13) goto L24
            goto L78
        L24:
            r6 = r8
            goto L49
        L26:
            if (r4 == 0) goto L48
            java.lang.String r8 = ":"
            boolean r8 = kotlin.text.StringsKt.startsWith$default(r11, r8, r12)
            if (r8 == 0) goto L33
            int r12 = r12 + 1
            goto L48
        L33:
            java.lang.String r8 = "."
            boolean r12 = kotlin.text.StringsKt.startsWith$default(r11, r8, r12)
            if (r12 == 0) goto L47
            int r12 = r4 + (-2)
            boolean r11 = decodeIpv4Suffix(r11, r6, r13, r1, r12)
            if (r11 != 0) goto L44
            return r7
        L44:
            int r4 = r4 + 2
            goto L78
        L47:
            return r7
        L48:
            r6 = r12
        L49:
            r12 = r6
            r8 = 0
        L4b:
            if (r12 >= r13) goto L5e
            char r9 = r11.charAt(r12)
            int r9 = okhttp3.internal.Util.parseHexDigit(r9)
            if (r9 != r3) goto L58
            goto L5e
        L58:
            int r8 = r8 << 4
            int r8 = r8 + r9
            int r12 = r12 + 1
            goto L4b
        L5e:
            int r9 = r12 - r6
            if (r9 == 0) goto L77
            r10 = 4
            if (r9 <= r10) goto L66
            goto L77
        L66:
            int r7 = r4 + 1
            int r9 = r8 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r1[r4] = r9
            int r4 = r7 + 1
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r1[r7] = r8
            goto L9
        L77:
            return r7
        L78:
            if (r4 == r0) goto L8a
            if (r5 != r3) goto L7d
            return r7
        L7d:
            int r11 = r4 - r5
            int r12 = 16 - r11
            java.lang.System.arraycopy(r1, r5, r1, r12, r11)
            int r0 = r0 - r4
            int r0 = r0 + r5
            byte r11 = (byte) r2
            java.util.Arrays.fill(r1, r5, r0, r11)
        L8a:
            java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)
            return r11
    }

    private static final java.lang.String inet6AddressToAscii(byte[] r8) {
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = 0
        L4:
            int r4 = r8.length
            r5 = 16
            if (r2 >= r4) goto L25
            r4 = r2
        La:
            if (r4 >= r5) goto L19
            r6 = r8[r4]
            if (r6 != 0) goto L19
            int r6 = r4 + 1
            r6 = r8[r6]
            if (r6 != 0) goto L19
            int r4 = r4 + 2
            goto La
        L19:
            int r5 = r4 - r2
            if (r5 <= r3) goto L22
            r6 = 4
            if (r5 < r6) goto L22
            r1 = r2
            r3 = r5
        L22:
            int r2 = r4 + 2
            goto L4
        L25:
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
        L2a:
            int r4 = r8.length
            if (r0 >= r4) goto L5a
            r4 = 58
            if (r0 != r1) goto L3b
            r2.writeByte(r4)
            int r0 = r0 + r3
            if (r0 != r5) goto L2a
            r2.writeByte(r4)
            goto L2a
        L3b:
            if (r0 <= 0) goto L40
            r2.writeByte(r4)
        L40:
            r4 = r8[r0]
            r6 = 255(0xff, float:3.57E-43)
            int r4 = okhttp3.internal.Util.and(r4, r6)
            int r4 = r4 << 8
            int r7 = r0 + 1
            r7 = r8[r7]
            int r6 = okhttp3.internal.Util.and(r7, r6)
            r4 = r4 | r6
            long r6 = (long) r4
            r2.writeHexadecimalUnsignedLong(r6)
            int r0 = r0 + 2
            goto L2a
        L5a:
            java.lang.String r8 = r2.readUtf8()
            return r8
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String toCanonicalHost(@org.jetbrains.annotations.NotNull java.lang.String r5) {
            java.lang.String r0 = "$this$toCanonicalHost"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = ":"
            boolean r0 = kotlin.text.StringsKt.contains$default(r5, r0)
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L6d
            java.lang.String r0 = "["
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r5, r0)
            if (r0 == 0) goto L2a
            java.lang.String r0 = "]"
            boolean r0 = kotlin.text.StringsKt.endsWith$default(r5, r0)
            if (r0 == 0) goto L2a
            int r0 = r5.length()
            int r0 = r0 - r1
            java.net.InetAddress r0 = decodeIpv6(r5, r1, r0)
            goto L32
        L2a:
            int r0 = r5.length()
            java.net.InetAddress r0 = decodeIpv6(r5, r2, r0)
        L32:
            if (r0 == 0) goto L6c
            byte[] r1 = r0.getAddress()
            int r2 = r1.length
            r3 = 16
            if (r2 != r3) goto L47
            java.lang.String r5 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            java.lang.String r5 = inet6AddressToAscii(r1)
            return r5
        L47:
            int r1 = r1.length
            r2 = 4
            if (r1 != r2) goto L50
            java.lang.String r5 = r0.getHostAddress()
            return r5
        L50:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid IPv6 address: '"
            r1.append(r2)
            r1.append(r5)
            r5 = 39
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L6c:
            return r3
        L6d:
            java.lang.String r5 = java.net.IDN.toASCII(r5)     // Catch: java.lang.IllegalArgumentException -> La4
            java.lang.String r0 = "IDN.toASCII(host)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch: java.lang.IllegalArgumentException -> La4
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.IllegalArgumentException -> La4
            java.lang.String r4 = "Locale.US"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)     // Catch: java.lang.IllegalArgumentException -> La4
            if (r5 == 0) goto L9c
            java.lang.String r5 = r5.toLowerCase(r0)     // Catch: java.lang.IllegalArgumentException -> La4
            java.lang.String r0 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch: java.lang.IllegalArgumentException -> La4
            int r0 = r5.length()     // Catch: java.lang.IllegalArgumentException -> La4
            if (r0 != 0) goto L8f
            goto L90
        L8f:
            r1 = 0
        L90:
            if (r1 == 0) goto L93
            return r3
        L93:
            boolean r0 = containsInvalidHostnameAsciiCodes(r5)     // Catch: java.lang.IllegalArgumentException -> La4
            if (r0 == 0) goto L9a
            goto L9b
        L9a:
            r3 = r5
        L9b:
            return r3
        L9c:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.IllegalArgumentException -> La4
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r5.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> La4
            throw r5     // Catch: java.lang.IllegalArgumentException -> La4
        La4:
            return r3
    }
}
