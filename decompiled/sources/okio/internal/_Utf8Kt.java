package okio.internal;

/* JADX INFO: compiled from: -Utf8.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "beginIndex", "", "endIndex", "okio"}, k = 2, mv = {1, 4, 1})
public final class _Utf8Kt {
    @org.jetbrains.annotations.NotNull
    public static final byte[] commonAsUtf8ToByteArray(@org.jetbrains.annotations.NotNull java.lang.String r12) {
            java.lang.String r0 = "$this$commonAsUtf8ToByteArray"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            int r0 = r12.length()
            int r0 = r0 * 4
            byte[] r0 = new byte[r0]
            int r1 = r12.length()
            r2 = 0
        L12:
            java.lang.String r3 = "java.util.Arrays.copyOf(this, newSize)"
            if (r2 >= r1) goto Lf9
            char r4 = r12.charAt(r2)
            r5 = 128(0x80, float:1.8E-43)
            int r6 = kotlin.jvm.internal.Intrinsics.compare(r4, r5)
            if (r6 < 0) goto Lf2
            int r1 = r12.length()
            r4 = r2
        L27:
            if (r2 >= r1) goto Lea
            char r6 = r12.charAt(r2)
            int r7 = kotlin.jvm.internal.Intrinsics.compare(r6, r5)
            if (r7 >= 0) goto L56
            byte r6 = (byte) r6
            int r7 = r4 + 1
            r0[r4] = r6
            int r2 = r2 + 1
        L3a:
            if (r2 >= r1) goto L54
            char r4 = r12.charAt(r2)
            int r4 = kotlin.jvm.internal.Intrinsics.compare(r4, r5)
            if (r4 >= 0) goto L54
            int r4 = r2 + 1
            char r2 = r12.charAt(r2)
            byte r2 = (byte) r2
            int r6 = r7 + 1
            r0[r7] = r2
            r2 = r4
            r7 = r6
            goto L3a
        L54:
            r4 = r7
            goto L27
        L56:
            r7 = 2048(0x800, float:2.87E-42)
            int r7 = kotlin.jvm.internal.Intrinsics.compare(r6, r7)
            if (r7 >= 0) goto L73
            int r7 = r6 >> 6
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            int r8 = r4 + 1
            r0[r4] = r7
            r4 = r6 & 63
            r4 = r4 | r5
            byte r4 = (byte) r4
            int r6 = r8 + 1
            r0[r8] = r4
        L6f:
            int r2 = r2 + 1
        L71:
            r4 = r6
            goto L27
        L73:
            r7 = 55296(0xd800, float:7.7486E-41)
            r8 = 63
            if (r7 > r6) goto Lcf
            r7 = 57343(0xdfff, float:8.0355E-41)
            if (r7 >= r6) goto L80
            goto Lcf
        L80:
            r9 = 56319(0xdbff, float:7.892E-41)
            int r9 = kotlin.jvm.internal.Intrinsics.compare(r6, r9)
            if (r9 > 0) goto Lca
            int r9 = r2 + 1
            if (r1 <= r9) goto Lca
            r10 = 56320(0xdc00, float:7.8921E-41)
            char r11 = r12.charAt(r9)
            if (r10 > r11) goto Lca
            if (r7 >= r11) goto L99
            goto Lca
        L99:
            int r6 = r6 << 10
            char r7 = r12.charAt(r9)
            int r7 = r7 + r6
            r6 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r7 = r7 + r6
            int r6 = r7 >> 18
            r6 = r6 | 240(0xf0, float:3.36E-43)
            byte r6 = (byte) r6
            int r9 = r4 + 1
            r0[r4] = r6
            int r4 = r7 >> 12
            r4 = r4 & r8
            r4 = r4 | r5
            byte r4 = (byte) r4
            int r6 = r9 + 1
            r0[r9] = r4
            int r4 = r7 >> 6
            r4 = r4 & r8
            r4 = r4 | r5
            byte r4 = (byte) r4
            int r9 = r6 + 1
            r0[r6] = r4
            r4 = r7 & 63
            r4 = r4 | r5
            byte r4 = (byte) r4
            int r6 = r9 + 1
            r0[r9] = r4
            int r2 = r2 + 2
            goto L71
        Lca:
            int r6 = r4 + 1
            r0[r4] = r8
            goto L6f
        Lcf:
            int r7 = r6 >> 12
            r7 = r7 | 224(0xe0, float:3.14E-43)
            byte r7 = (byte) r7
            int r9 = r4 + 1
            r0[r4] = r7
            int r4 = r6 >> 6
            r4 = r4 & r8
            r4 = r4 | r5
            byte r4 = (byte) r4
            int r7 = r9 + 1
            r0[r9] = r4
            r4 = r6 & 63
            r4 = r4 | r5
            byte r4 = (byte) r4
            int r6 = r7 + 1
            r0[r7] = r4
            goto L6f
        Lea:
            byte[] r12 = java.util.Arrays.copyOf(r0, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r3)
            return r12
        Lf2:
            byte r3 = (byte) r4
            r0[r2] = r3
            int r2 = r2 + 1
            goto L12
        Lf9:
            int r12 = r12.length()
            byte[] r12 = java.util.Arrays.copyOf(r0, r12)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r3)
            return r12
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonToUtf8String(@org.jetbrains.annotations.NotNull byte[] r12, int r13, int r14) {
            java.lang.String r0 = "$this$commonToUtf8String"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            if (r13 < 0) goto L1b3
            int r0 = r12.length
            if (r14 > r0) goto L1b3
            if (r13 > r14) goto L1b3
            int r0 = r14 - r13
            char[] r0 = new char[r0]
            r1 = 0
            r2 = 0
        L12:
            if (r13 >= r14) goto L1ad
            r3 = r12[r13]
            if (r3 < 0) goto L33
            char r3 = (char) r3
            int r4 = r2 + 1
            r0[r2] = r3
            int r13 = r13 + 1
        L1f:
            if (r13 >= r14) goto L31
            r2 = r12[r13]
            if (r2 < 0) goto L31
            int r2 = r13 + 1
            r13 = r12[r13]
            char r13 = (char) r13
            int r3 = r4 + 1
            r0[r4] = r13
            r13 = r2
            r4 = r3
            goto L1f
        L31:
            r2 = r4
            goto L12
        L33:
            int r4 = r3 >> 5
            r5 = -2
            r6 = 128(0x80, float:1.8E-43)
            r7 = 65533(0xfffd, float:9.1831E-41)
            if (r4 != r5) goto L71
            int r3 = r13 + 1
            if (r14 > r3) goto L47
            char r3 = (char) r7
            int r4 = r2 + 1
            r0[r2] = r3
            goto L59
        L47:
            r4 = r12[r13]
            r3 = r12[r3]
            r5 = r3 & 192(0xc0, float:2.69E-43)
            if (r5 != r6) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = 0
        L52:
            if (r5 != 0) goto L5c
            char r3 = (char) r7
            int r4 = r2 + 1
            r0[r2] = r3
        L59:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            goto Lab
        L5c:
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r4 = r4 << 6
            r3 = r3 ^ r4
            if (r3 >= r6) goto L69
            char r3 = (char) r7
            int r4 = r2 + 1
            r0[r2] = r3
            goto L6e
        L69:
            char r3 = (char) r3
            int r4 = r2 + 1
            r0[r2] = r3
        L6e:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            goto Lbe
        L71:
            int r4 = r3 >> 4
            r8 = 55296(0xd800, float:7.7486E-41)
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r4 != r5) goto Lea
            int r3 = r13 + 2
            if (r14 > r3) goto L96
            char r3 = (char) r7
            int r4 = r2 + 1
            r0[r2] = r3
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            int r2 = r13 + 1
            if (r14 <= r2) goto Lab
            r2 = r12[r2]
            r2 = r2 & 192(0xc0, float:2.69E-43)
            if (r2 != r6) goto L92
            r2 = 1
            goto L93
        L92:
            r2 = 0
        L93:
            if (r2 != 0) goto Lbe
            goto Lab
        L96:
            r4 = r12[r13]
            int r5 = r13 + 1
            r5 = r12[r5]
            r10 = r5 & 192(0xc0, float:2.69E-43)
            if (r10 != r6) goto La2
            r10 = 1
            goto La3
        La2:
            r10 = 0
        La3:
            if (r10 != 0) goto Lad
            char r3 = (char) r7
            int r4 = r2 + 1
            r0[r2] = r3
            goto L59
        Lab:
            r2 = 1
            goto Le7
        Lad:
            r3 = r12[r3]
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r6) goto Lb5
            r6 = 1
            goto Lb6
        Lb5:
            r6 = 0
        Lb6:
            if (r6 != 0) goto Lc0
            char r3 = (char) r7
            int r4 = r2 + 1
            r0[r2] = r3
            goto L6e
        Lbe:
            r2 = 2
            goto Le7
        Lc0:
            r6 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r6
            int r5 = r5 << 6
            r3 = r3 ^ r5
            int r4 = r4 << 12
            r3 = r3 ^ r4
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto Ld4
            char r3 = (char) r7
            int r4 = r2 + 1
            r0[r2] = r3
            goto Le4
        Ld4:
            if (r8 <= r3) goto Ld7
            goto Ldf
        Ld7:
            if (r9 < r3) goto Ldf
            char r3 = (char) r7
            int r4 = r2 + 1
            r0[r2] = r3
            goto Le4
        Ldf:
            char r3 = (char) r3
            int r4 = r2 + 1
            r0[r2] = r3
        Le4:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            r2 = 3
        Le7:
            int r13 = r13 + r2
            goto L31
        Lea:
            int r3 = r3 >> 3
            if (r3 != r5) goto L1a4
            int r3 = r13 + 3
            if (r14 > r3) goto L118
            int r3 = r2 + 1
            r0[r2] = r7
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            int r2 = r13 + 1
            if (r14 <= r2) goto L12d
            r2 = r12[r2]
            r2 = r2 & 192(0xc0, float:2.69E-43)
            if (r2 != r6) goto L104
            r2 = 1
            goto L105
        L104:
            r2 = 0
        L105:
            if (r2 != 0) goto L108
            goto L12d
        L108:
            int r2 = r13 + 2
            if (r14 <= r2) goto L143
            r2 = r12[r2]
            r2 = r2 & 192(0xc0, float:2.69E-43)
            if (r2 != r6) goto L114
            r2 = 1
            goto L115
        L114:
            r2 = 0
        L115:
            if (r2 != 0) goto L156
            goto L143
        L118:
            r4 = r12[r13]
            int r5 = r13 + 1
            r5 = r12[r5]
            r10 = r5 & 192(0xc0, float:2.69E-43)
            if (r10 != r6) goto L124
            r10 = 1
            goto L125
        L124:
            r10 = 0
        L125:
            if (r10 != 0) goto L130
            int r3 = r2 + 1
            r0[r2] = r7
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L12d:
            r2 = 1
            goto L1a2
        L130:
            int r10 = r13 + 2
            r10 = r12[r10]
            r11 = r10 & 192(0xc0, float:2.69E-43)
            if (r11 != r6) goto L13a
            r11 = 1
            goto L13b
        L13a:
            r11 = 0
        L13b:
            if (r11 != 0) goto L145
            int r3 = r2 + 1
            r0[r2] = r7
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L143:
            r2 = 2
            goto L1a2
        L145:
            r3 = r12[r3]
            r11 = r3 & 192(0xc0, float:2.69E-43)
            if (r11 != r6) goto L14d
            r6 = 1
            goto L14e
        L14d:
            r6 = 0
        L14e:
            if (r6 != 0) goto L158
            int r3 = r2 + 1
            r0[r2] = r7
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L156:
            r2 = 3
            goto L1a2
        L158:
            r6 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r6
            int r6 = r10 << 6
            r3 = r3 ^ r6
            int r5 = r5 << 12
            r3 = r3 ^ r5
            int r4 = r4 << 18
            r3 = r3 ^ r4
            r4 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r4) goto L16f
            int r3 = r2 + 1
            r0[r2] = r7
            goto L19f
        L16f:
            if (r8 <= r3) goto L172
            goto L179
        L172:
            if (r9 < r3) goto L179
            int r3 = r2 + 1
            r0[r2] = r7
            goto L19f
        L179:
            r4 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r4) goto L182
            int r3 = r2 + 1
            r0[r2] = r7
            goto L19f
        L182:
            if (r3 == r7) goto L19b
            int r4 = r3 >>> 10
            r5 = 55232(0xd7c0, float:7.7397E-41)
            int r4 = r4 + r5
            char r4 = (char) r4
            int r5 = r2 + 1
            r0[r2] = r4
            r2 = r3 & 1023(0x3ff, float:1.434E-42)
            r3 = 56320(0xdc00, float:7.8921E-41)
            int r2 = r2 + r3
            char r2 = (char) r2
            int r3 = r5 + 1
            r0[r5] = r2
            goto L19f
        L19b:
            int r3 = r2 + 1
            r0[r2] = r7
        L19f:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            r2 = 4
        L1a2:
            int r13 = r13 + r2
            goto L1aa
        L1a4:
            int r3 = r2 + 1
            r0[r2] = r7
            int r13 = r13 + 1
        L1aa:
            r2 = r3
            goto L12
        L1ad:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r0, r1, r2)
            return r12
        L1b3:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r1 = "size="
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r12 = r12.length
            r1.append(r12)
            java.lang.String r12 = " beginIndex="
            r1.append(r12)
            r1.append(r13)
            java.lang.String r12 = " endIndex="
            r1.append(r12)
            r1.append(r14)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
    }

    public static /* synthetic */ java.lang.String commonToUtf8String$default(byte[] r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.length
        La:
            java.lang.String r0 = commonToUtf8String(r0, r1, r2)
            return r0
    }
}
