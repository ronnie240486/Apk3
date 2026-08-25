package kotlin.text;

/* JADX INFO: compiled from: CharJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0001\u001a\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a\r\u0010\u000e\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0011\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0016\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0018\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u001a\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u001b\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\n\u0010\u001c\u001a\u00020\u000f*\u00020\u0002\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010!\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0014\u0010\"\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010#\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010$\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010%\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010&\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010'\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0014\u0010'\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010(\u001a\u00020\u0002*\u00020\u0002H\u0087\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006)"}, d2 = {"category", "Lkotlin/text/CharCategory;", "", "getCategory", "(C)Lkotlin/text/CharCategory;", "directionality", "Lkotlin/text/CharDirectionality;", "getDirectionality", "(C)Lkotlin/text/CharDirectionality;", "checkRadix", "", "radix", "digitOf", "char", "isDefined", "", "isDigit", "isHighSurrogate", "isISOControl", "isIdentifierIgnorable", "isJavaIdentifierPart", "isJavaIdentifierStart", "isLetter", "isLetterOrDigit", "isLowSurrogate", "isLowerCase", "isTitleCase", "isUpperCase", "isWhitespace", "lowercase", "", "locale", "Ljava/util/Locale;", "lowercaseChar", "titlecase", "titlecaseChar", "toLowerCase", "toTitleCase", "toUpperCase", "uppercase", "uppercaseChar", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/CharsKt")
class CharsKt__CharJVMKt {
    public CharsKt__CharJVMKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.PublishedApi
    public static int checkRadix(int r5) {
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r1 = 2
            r2 = 36
            r0.<init>(r1, r2)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto Lf
            return r5
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "radix "
            java.lang.String r4 = " was not in valid range "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r3, r5, r4)
            kotlin.ranges.IntRange r3 = new kotlin.ranges.IntRange
            r3.<init>(r1, r2)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    public static final int digitOf(char r0, int r1) {
            int r0 = java.lang.Character.digit(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.text.CharCategory getCategory(char r1) {
            kotlin.text.CharCategory$Companion r0 = kotlin.text.CharCategory.Companion
            int r1 = java.lang.Character.getType(r1)
            kotlin.text.CharCategory r1 = r0.valueOf(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.text.CharDirectionality getDirectionality(char r1) {
            kotlin.text.CharDirectionality$Companion r0 = kotlin.text.CharDirectionality.Companion
            byte r1 = java.lang.Character.getDirectionality(r1)
            kotlin.text.CharDirectionality r1 = r0.valueOf(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final boolean isDefined(char r0) {
            boolean r0 = java.lang.Character.isDefined(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean isDigit(char r0) {
            boolean r0 = java.lang.Character.isDigit(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean isHighSurrogate(char r0) {
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean isISOControl(char r0) {
            boolean r0 = java.lang.Character.isISOControl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean isIdentifierIgnorable(char r0) {
            boolean r0 = java.lang.Character.isIdentifierIgnorable(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean isJavaIdentifierPart(char r0) {
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean isJavaIdentifierStart(char r0) {
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean isLetter(char r0) {
            boolean r0 = java.lang.Character.isLetter(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean isLetterOrDigit(char r0) {
            boolean r0 = java.lang.Character.isLetterOrDigit(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean isLowSurrogate(char r0) {
            boolean r0 = java.lang.Character.isLowSurrogate(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean isLowerCase(char r0) {
            boolean r0 = java.lang.Character.isLowerCase(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean isTitleCase(char r0) {
            boolean r0 = java.lang.Character.isTitleCase(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean isUpperCase(char r0) {
            boolean r0 = java.lang.Character.isUpperCase(r0)
            return r0
    }

    public static final boolean isWhitespace(char r1) {
            boolean r0 = java.lang.Character.isWhitespace(r1)
            if (r0 != 0) goto Lf
            boolean r1 = java.lang.Character.isSpaceChar(r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final java.lang.String lowercase(char r1) {
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String lowercase(char r1, @org.jetbrains.annotations.NotNull java.util.Locale r2) {
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final char lowercaseChar(char r0) {
            char r0 = java.lang.Character.toLowerCase(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String titlecase(char r3, @org.jetbrains.annotations.NotNull java.util.Locale r4) {
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r4 = uppercase(r3, r4)
            int r0 = r4.length()
            r1 = 1
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            if (r0 <= r1) goto L48
            r0 = 329(0x149, float:4.61E-43)
            if (r3 != r0) goto L17
            goto L47
        L17:
            r3 = 0
            char r3 = r4.charAt(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r2)
            java.lang.String r4 = r4.substring(r1)
            java.lang.String r0 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r2)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L47:
            return r4
        L48:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
            if (r0 != 0) goto L62
            return r4
        L62:
            char r3 = java.lang.Character.toTitleCase(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final char titlecaseChar(char r0) {
            char r0 = java.lang.Character.toTitleCase(r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use lowercaseChar() instead.", replaceWith = @kotlin.ReplaceWith(expression = "lowercaseChar()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.internal.InlineOnly
    private static final char toLowerCase(char r0) {
            char r0 = java.lang.Character.toLowerCase(r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use titlecaseChar() instead.", replaceWith = @kotlin.ReplaceWith(expression = "titlecaseChar()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.internal.InlineOnly
    private static final char toTitleCase(char r0) {
            char r0 = java.lang.Character.toTitleCase(r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use uppercaseChar() instead.", replaceWith = @kotlin.ReplaceWith(expression = "uppercaseChar()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.internal.InlineOnly
    private static final char toUpperCase(char r0) {
            char r0 = java.lang.Character.toUpperCase(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final java.lang.String uppercase(char r1) {
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r0)
            java.lang.String r0 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String uppercase(char r1, @org.jetbrains.annotations.NotNull java.util.Locale r2) {
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            java.lang.String r1 = r1.toUpperCase(r2)
            java.lang.String r2 = "this as java.lang.String).toUpperCase(locale)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final char uppercaseChar(char r0) {
            char r0 = java.lang.Character.toUpperCase(r0)
            return r0
    }
}
