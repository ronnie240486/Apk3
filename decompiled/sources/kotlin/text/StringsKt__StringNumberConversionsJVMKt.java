package kotlin.text;

/* JADX INFO: compiled from: StringNumberConversionsJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0005H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\b\u001a\u00020\t*\u00020\u0003H\u0087\b\u001a\u0015\u0010\b\u001a\u00020\t*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0087\b\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u0003H\u0007\u001a\u0016\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\r\u0010\r\u001a\u00020\u000e*\u00020\u0003H\u0087\b\u001a\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u0003H\u0007\u001a\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\r\u0010\u0012\u001a\u00020\u0013*\u00020\u0003H\u0087\b\u001a\u0014\u0010\u0012\u001a\u00020\u0013*\u0004\u0018\u00010\u0003H\u0087\b¢\u0006\u0002\b\u0014\u001a\r\u0010\u0015\u001a\u00020\u0016*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0015\u001a\u00020\u0016*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0018*\u00020\u0003H\u0087\b\u001a\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0003H\u0087\b\u001a\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0010*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u001f\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010 \u001a\u00020!*\u00020\u0003H\u0087\b\u001a\u0015\u0010 \u001a\u00020!*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010\"\u001a\u00020#*\u00020\u0003H\u0087\b\u001a\u0015\u0010\"\u001a\u00020#*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010$\u001a\u00020\u0003*\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010$\u001a\u00020\u0003*\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010$\u001a\u00020\u0003*\u00020!2\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010$\u001a\u00020\u0003*\u00020#2\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b¨\u0006%"}, d2 = {"screenFloatValue", "T", "str", "", "parse", "Lkotlin/Function1;", "screenFloatValue$StringsKt__StringNumberConversionsJVMKt", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "toBigDecimal", "Ljava/math/BigDecimal;", "mathContext", "Ljava/math/MathContext;", "toBigDecimalOrNull", "toBigInteger", "Ljava/math/BigInteger;", "radix", "", "toBigIntegerOrNull", "toBoolean", "", "toBooleanNullable", "toByte", "", "toDouble", "", "toDoubleOrNull", "(Ljava/lang/String;)Ljava/lang/Double;", "toFloat", "", "toFloatOrNull", "(Ljava/lang/String;)Ljava/lang/Float;", "toInt", "toLong", "", "toShort", "", "toString", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt__StringNumberConversionsJVMKt extends kotlin.text.StringsKt__StringBuilderKt {
    public StringsKt__StringNumberConversionsJVMKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final <T> T screenFloatValue$StringsKt__StringNumberConversionsJVMKt(java.lang.String r2, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends T> r3) {
            r0 = 0
            kotlin.text.Regex r1 = kotlin.text.ScreenFloatValueRegEx.value     // Catch: java.lang.NumberFormatException -> Le
            boolean r1 = r1.matches(r2)     // Catch: java.lang.NumberFormatException -> Le
            if (r1 == 0) goto Le
            java.lang.Object r2 = r3.invoke(r2)     // Catch: java.lang.NumberFormatException -> Le
            r0 = r2
        Le:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal toBigDecimal(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal toBigDecimal(java.lang.String r1, java.math.MathContext r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "mathContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.Nullable
    public static final java.math.BigDecimal toBigDecimalOrNull(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            kotlin.text.Regex r1 = kotlin.text.ScreenFloatValueRegEx.value     // Catch: java.lang.NumberFormatException -> L14
            boolean r1 = r1.matches(r2)     // Catch: java.lang.NumberFormatException -> L14
            if (r1 == 0) goto L14
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L14
            r1.<init>(r2)     // Catch: java.lang.NumberFormatException -> L14
            r0 = r1
        L14:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.Nullable
    public static final java.math.BigDecimal toBigDecimalOrNull(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.math.MathContext r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "mathContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            kotlin.text.Regex r1 = kotlin.text.ScreenFloatValueRegEx.value     // Catch: java.lang.NumberFormatException -> L19
            boolean r1 = r1.matches(r2)     // Catch: java.lang.NumberFormatException -> L19
            if (r1 == 0) goto L19
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L19
            r1.<init>(r2, r3)     // Catch: java.lang.NumberFormatException -> L19
            r0 = r1
        L19:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger toBigInteger(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger toBigInteger(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            int r2 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.Nullable
    public static final java.math.BigInteger toBigIntegerOrNull(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            java.math.BigInteger r1 = toBigIntegerOrNull(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.Nullable
    public static final java.math.BigInteger toBigIntegerOrNull(@org.jetbrains.annotations.NotNull java.lang.String r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.text.CharsKt__CharJVMKt.checkRadix(r7)
            int r0 = r6.length()
            r1 = 0
            if (r0 == 0) goto L41
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L2c
            char r4 = r6.charAt(r2)
            r5 = 45
            if (r4 != r5) goto L1c
            r2 = 1
        L1c:
            if (r2 >= r0) goto L37
            char r3 = r6.charAt(r2)
            int r3 = kotlin.text.CharsKt__CharJVMKt.digitOf(r3, r7)
            if (r3 >= 0) goto L29
            return r1
        L29:
            int r2 = r2 + 1
            goto L1c
        L2c:
            char r0 = r6.charAt(r2)
            int r0 = kotlin.text.CharsKt__CharJVMKt.digitOf(r0, r7)
            if (r0 >= 0) goto L37
            return r1
        L37:
            java.math.BigInteger r0 = new java.math.BigInteger
            int r7 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r7)
            r0.<init>(r6, r7)
            return r0
        L41:
            return r1
    }

    @kotlin.Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @kotlin.DeprecatedSinceKotlin(hiddenSince = "1.4")
    @kotlin.internal.InlineOnly
    private static final /* synthetic */ boolean toBoolean(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "toBooleanNullable")
    private static final boolean toBooleanNullable(java.lang.String r0) {
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final byte toByte(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte r1 = java.lang.Byte.parseByte(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final byte toByte(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r2 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r2)
            byte r1 = java.lang.Byte.parseByte(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final double toDouble(java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            double r0 = java.lang.Double.parseDouble(r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Double toDoubleOrNull(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            kotlin.text.Regex r1 = kotlin.text.ScreenFloatValueRegEx.value     // Catch: java.lang.NumberFormatException -> L17
            boolean r1 = r1.matches(r3)     // Catch: java.lang.NumberFormatException -> L17
            if (r1 == 0) goto L17
            double r1 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.NumberFormatException -> L17
            java.lang.Double r3 = java.lang.Double.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L17
            r0 = r3
        L17:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final float toFloat(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            float r1 = java.lang.Float.parseFloat(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Float toFloatOrNull(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            kotlin.text.Regex r1 = kotlin.text.ScreenFloatValueRegEx.value     // Catch: java.lang.NumberFormatException -> L17
            boolean r1 = r1.matches(r2)     // Catch: java.lang.NumberFormatException -> L17
            if (r1 == 0) goto L17
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L17
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L17
            r0 = r2
        L17:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final int toInt(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = java.lang.Integer.parseInt(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final int toInt(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r2 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r2)
            int r1 = java.lang.Integer.parseInt(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final long toLong(java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            long r0 = java.lang.Long.parseLong(r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final long toLong(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r2 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r2)
            long r1 = java.lang.Long.parseLong(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final short toShort(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            short r1 = java.lang.Short.parseShort(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final short toShort(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r2 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r2)
            short r1 = java.lang.Short.parseShort(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final java.lang.String toString(byte r0, int r1) {
            int r1 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r1)
            int r1 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r1)
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            java.lang.String r1 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final java.lang.String toString(int r0, int r1) {
            int r1 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r1)
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            java.lang.String r1 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final java.lang.String toString(long r0, int r2) {
            int r2 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r2)
            java.lang.String r0 = java.lang.Long.toString(r0, r2)
            java.lang.String r1 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final java.lang.String toString(short r0, int r1) {
            int r1 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r1)
            int r1 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r1)
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            java.lang.String r1 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
