package kotlin.text;

/* JADX INFO: compiled from: StringNumberConversions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000b\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\f\u001a\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0013\u001a\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"numberFormatError", "", "input", "", "toByteOrNull", "", "(Ljava/lang/String;)Ljava/lang/Byte;", "radix", "", "(Ljava/lang/String;I)Ljava/lang/Byte;", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)Ljava/lang/Integer;", "toLongOrNull", "", "(Ljava/lang/String;)Ljava/lang/Long;", "(Ljava/lang/String;I)Ljava/lang/Long;", "toShortOrNull", "", "(Ljava/lang/String;)Ljava/lang/Short;", "(Ljava/lang/String;I)Ljava/lang/Short;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt__StringNumberConversionsKt extends kotlin.text.StringsKt__StringNumberConversionsJVMKt {
    public StringsKt__StringNumberConversionsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Void numberFormatError(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid number format: '"
            r1.append(r2)
            r1.append(r3)
            r3 = 39
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Byte toByteOrNull(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            java.lang.Byte r1 = toByteOrNull(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Byte toByteOrNull(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Integer r1 = toIntOrNull(r1, r2)
            r2 = 0
            if (r1 == 0) goto L1f
            int r1 = r1.intValue()
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r1 < r0) goto L1f
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 <= r0) goto L19
            goto L1f
        L19:
            byte r1 = (byte) r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
        L1f:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static java.lang.Integer toIntOrNull(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            java.lang.Integer r1 = toIntOrNull(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer toIntOrNull(@org.jetbrains.annotations.NotNull java.lang.String r10, int r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            kotlin.text.CharsKt__CharJVMKt.checkRadix(r11)
            int r0 = r10.length()
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            r2 = 0
            char r3 = r10.charAt(r2)
            r4 = 48
            int r4 = kotlin.jvm.internal.Intrinsics.compare(r3, r4)
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r6 = 1
            if (r4 >= 0) goto L33
            if (r0 != r6) goto L24
            return r1
        L24:
            r4 = 45
            if (r3 != r4) goto L2c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            goto L35
        L2c:
            r4 = 43
            if (r3 != r4) goto L32
            r3 = 0
            goto L35
        L32:
            return r1
        L33:
            r3 = 0
            r6 = 0
        L35:
            r4 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r7 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
        L3b:
            if (r6 >= r0) goto L5c
            char r8 = r10.charAt(r6)
            int r8 = kotlin.text.CharsKt__CharJVMKt.digitOf(r8, r11)
            if (r8 >= 0) goto L48
            return r1
        L48:
            if (r2 >= r7) goto L51
            if (r7 != r4) goto L50
            int r7 = r5 / r11
            if (r2 >= r7) goto L51
        L50:
            return r1
        L51:
            int r2 = r2 * r11
            int r9 = r5 + r8
            if (r2 >= r9) goto L58
            return r1
        L58:
            int r2 = r2 - r8
            int r6 = r6 + 1
            goto L3b
        L5c:
            if (r3 == 0) goto L63
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            goto L68
        L63:
            int r10 = -r2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
        L68:
            return r10
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static java.lang.Long toLongOrNull(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            java.lang.Long r1 = toLongOrNull(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Long toLongOrNull(@org.jetbrains.annotations.NotNull java.lang.String r18, int r19) {
            r0 = r18
            r1 = r19
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            kotlin.text.CharsKt__CharJVMKt.checkRadix(r19)
            int r2 = r18.length()
            r3 = 0
            if (r2 != 0) goto L14
            return r3
        L14:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            int r6 = kotlin.jvm.internal.Intrinsics.compare(r5, r6)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 1
            if (r6 >= 0) goto L39
            if (r2 != r9) goto L2a
            return r3
        L2a:
            r6 = 45
            if (r5 != r6) goto L32
            r7 = -9223372036854775808
            r4 = 1
            goto L3a
        L32:
            r6 = 43
            if (r5 != r6) goto L38
            r4 = 1
            goto L39
        L38:
            return r3
        L39:
            r9 = 0
        L3a:
            r5 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r10 = 0
            r12 = r5
        L42:
            if (r4 >= r2) goto L73
            char r14 = r0.charAt(r4)
            int r14 = kotlin.text.CharsKt__CharJVMKt.digitOf(r14, r1)
            if (r14 >= 0) goto L4f
            return r3
        L4f:
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L5f
            int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r15 != 0) goto L5e
            long r12 = (long) r1
            long r12 = r7 / r12
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L5f
        L5e:
            return r3
        L5f:
            long r5 = (long) r1
            long r10 = r10 * r5
            long r5 = (long) r14
            long r16 = r7 + r5
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6a
            return r3
        L6a:
            long r10 = r10 - r5
            int r4 = r4 + 1
            r5 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            goto L42
        L73:
            if (r9 == 0) goto L7a
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            goto L7f
        L7a:
            long r0 = -r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L7f:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Short toShortOrNull(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            java.lang.Short r1 = toShortOrNull(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Short toShortOrNull(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Integer r1 = toIntOrNull(r1, r2)
            r2 = 0
            if (r1 == 0) goto L1f
            int r1 = r1.intValue()
            r0 = -32768(0xffffffffffff8000, float:NaN)
            if (r1 < r0) goto L1f
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r1 <= r0) goto L19
            goto L1f
        L19:
            short r1 = (short) r1
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
        L1f:
            return r2
    }
}
