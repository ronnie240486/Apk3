package kotlin.text;

/* JADX INFO: compiled from: _StringsJvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\f\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0007\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\b0\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\f\u001a/\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0013\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\b0\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\f\u001a/\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a)\u0010\u0015\u001a\u00020\u0016*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0017\u001a)\u0010\u0015\u001a\u00020\u0018*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00180\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0019\u001a\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b*\u00020\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"elementAt", "", "", "index", "", "max", "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "maxBy", "R", "", "selector", "Lkotlin/Function1;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Character;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/CharSequence;Ljava/util/Comparator;)Ljava/lang/Character;", "min", "minBy", "minWith", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "Ljava/math/BigInteger;", "sumOfBigInteger", "toSortedSet", "Ljava/util/SortedSet;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt___StringsJvmKt extends kotlin.text.StringsKt__StringsKt {
    public StringsKt___StringsJvmKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.internal.InlineOnly
    private static final char elementAt(java.lang.CharSequence r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            char r1 = r1.charAt(r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character max(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Character r1 = kotlin.text.StringsKt___StringsKt.maxOrNull(r1)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Character maxBy(java.lang.CharSequence r6, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends R> r7) {
            java.lang.String r0 = "<this>"
            java.lang.String r1 = "selector"
            int r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r6, r0, r7, r1)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L14
            r6 = 0
            goto L56
        L14:
            char r0 = r6.charAt(r2)
            int r2 = kotlin.text.StringsKt__StringsKt.getLastIndex(r6)
            if (r2 != 0) goto L23
            java.lang.Character r6 = java.lang.Character.valueOf(r0)
            goto L56
        L23:
            java.lang.Character r3 = java.lang.Character.valueOf(r0)
            java.lang.Object r3 = r7.invoke(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            kotlin.collections.IntIterator r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2)
        L31:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L52
            int r2 = r1.nextInt()
            char r2 = r6.charAt(r2)
            java.lang.Character r4 = java.lang.Character.valueOf(r2)
            java.lang.Object r4 = r7.invoke(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r5 = r3.compareTo(r4)
            if (r5 >= 0) goto L31
            r0 = r2
            r3 = r4
            goto L31
        L52:
            java.lang.Character r6 = java.lang.Character.valueOf(r0)
        L56:
            return r6
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character maxWith(java.lang.CharSequence r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Character r1 = kotlin.text.StringsKt___StringsKt.maxWithOrNull(r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character min(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Character r1 = kotlin.text.StringsKt___StringsKt.minOrNull(r1)
            return r1
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Character minBy(java.lang.CharSequence r6, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends R> r7) {
            java.lang.String r0 = "<this>"
            java.lang.String r1 = "selector"
            int r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r6, r0, r7, r1)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L14
            r6 = 0
            goto L56
        L14:
            char r0 = r6.charAt(r2)
            int r2 = kotlin.text.StringsKt__StringsKt.getLastIndex(r6)
            if (r2 != 0) goto L23
            java.lang.Character r6 = java.lang.Character.valueOf(r0)
            goto L56
        L23:
            java.lang.Character r3 = java.lang.Character.valueOf(r0)
            java.lang.Object r3 = r7.invoke(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            kotlin.collections.IntIterator r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2)
        L31:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L52
            int r2 = r1.nextInt()
            char r2 = r6.charAt(r2)
            java.lang.Character r4 = java.lang.Character.valueOf(r2)
            java.lang.Object r4 = r7.invoke(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r5 = r3.compareTo(r4)
            if (r5 <= 0) goto L31
            r0 = r2
            r3 = r4
            goto L31
        L52:
            java.lang.Character r6 = java.lang.Character.valueOf(r0)
        L56:
            return r6
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character minWith(java.lang.CharSequence r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Character r1 = kotlin.text.StringsKt___StringsKt.minWithOrNull(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal sumOfBigDecimal(java.lang.CharSequence r3, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends java.math.BigDecimal> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(this.toLong())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 0
        L18:
            int r2 = r3.length()
            if (r1 >= r2) goto L31
            java.lang.Object r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r1, r4)
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            java.math.BigDecimal r0 = r0.add(r2)
            java.lang.String r2 = "this.add(other)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r1 = r1 + 1
            goto L18
        L31:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger sumOfBigInteger(java.lang.CharSequence r3, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends java.math.BigInteger> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(this.toLong())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 0
        L18:
            int r2 = r3.length()
            if (r1 >= r2) goto L31
            java.lang.Object r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r1, r4)
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            java.math.BigInteger r0 = r0.add(r2)
            java.lang.String r2 = "this.add(other)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r1 = r1 + 1
            goto L18
        L31:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.SortedSet<java.lang.Character> toSortedSet(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r1 = kotlin.text.StringsKt___StringsKt.toCollection(r1, r0)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }
}
