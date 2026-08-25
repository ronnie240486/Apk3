package kotlin.text;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0082\b\u001a\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\b*\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0002\u001a\u0012\u0010\u0012\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0002¨\u0006\u0014"}, d2 = {"fromInt", "", "T", "Lkotlin/text/FlagEnum;", "", "value", "", "findNext", "Lkotlin/text/MatchResult;", "Ljava/util/regex/Matcher;", "from", "input", "", "matchEntire", "range", "Lkotlin/ranges/IntRange;", "Ljava/util/regex/MatchResult;", "groupIndex", "toInt", "", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class RegexKt {
    public static final /* synthetic */ kotlin.text.MatchResult access$findNext(java.util.regex.Matcher r0, int r1, java.lang.CharSequence r2) {
            kotlin.text.MatchResult r0 = findNext(r0, r1, r2)
            return r0
    }

    public static final /* synthetic */ kotlin.text.MatchResult access$matchEntire(java.util.regex.Matcher r0, java.lang.CharSequence r1) {
            kotlin.text.MatchResult r0 = matchEntire(r0, r1)
            return r0
    }

    public static final /* synthetic */ kotlin.ranges.IntRange access$range(java.util.regex.MatchResult r0) {
            kotlin.ranges.IntRange r0 = range(r0)
            return r0
    }

    public static final /* synthetic */ kotlin.ranges.IntRange access$range(java.util.regex.MatchResult r0, int r1) {
            kotlin.ranges.IntRange r0 = range(r0, r1)
            return r0
    }

    public static final /* synthetic */ int access$toInt(java.lang.Iterable r0) {
            int r0 = toInt(r0)
            return r0
    }

    private static final kotlin.text.MatchResult findNext(java.util.regex.Matcher r0, int r1, java.lang.CharSequence r2) {
            boolean r1 = r0.find(r1)
            if (r1 != 0) goto L8
            r0 = 0
            goto Le
        L8:
            kotlin.text.MatcherMatchResult r1 = new kotlin.text.MatcherMatchResult
            r1.<init>(r0, r2)
            r0 = r1
        Le:
            return r0
    }

    private static final /* synthetic */ <T extends java.lang.Enum<T> & kotlin.text.FlagEnum> java.util.Set<T> fromInt(int r2) {
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            java.util.EnumSet r0 = java.util.EnumSet.allOf(r0)
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlin.text.RegexKt$fromInt$1$1 r1 = new kotlin.text.RegexKt$fromInt$1$1
            r1.<init>(r2)
            kotlin.collections.CollectionsKt.retainAll(r0, r1)
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r0)
            java.lang.String r0 = "unmodifiableSet(EnumSet.…mask == it.value }\n    })"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            return r2
    }

    private static final kotlin.text.MatchResult matchEntire(java.util.regex.Matcher r1, java.lang.CharSequence r2) {
            boolean r0 = r1.matches()
            if (r0 != 0) goto L8
            r1 = 0
            goto Le
        L8:
            kotlin.text.MatcherMatchResult r0 = new kotlin.text.MatcherMatchResult
            r0.<init>(r1, r2)
            r1 = r0
        Le:
            return r1
    }

    private static final kotlin.ranges.IntRange range(java.util.regex.MatchResult r1) {
            int r0 = r1.start()
            int r1 = r1.end()
            kotlin.ranges.IntRange r1 = kotlin.ranges.RangesKt.until(r0, r1)
            return r1
    }

    private static final kotlin.ranges.IntRange range(java.util.regex.MatchResult r1, int r2) {
            int r0 = r1.start(r2)
            int r1 = r1.end(r2)
            kotlin.ranges.IntRange r1 = kotlin.ranges.RangesKt.until(r0, r1)
            return r1
    }

    private static final int toInt(java.lang.Iterable<? extends kotlin.text.FlagEnum> r2) {
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L5:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r2.next()
            kotlin.text.FlagEnum r1 = (kotlin.text.FlagEnum) r1
            int r1 = r1.getValue()
            r0 = r0 | r1
            goto L5
        L17:
            return r0
    }
}
