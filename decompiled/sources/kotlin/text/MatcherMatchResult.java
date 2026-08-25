package kotlin.text;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues_", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "matchResult", "Ljava/util/regex/MatchResult;", "getMatchResult", "()Ljava/util/regex/MatchResult;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class MatcherMatchResult implements kotlin.text.MatchResult {

    @org.jetbrains.annotations.Nullable
    private java.util.List<java.lang.String> groupValues_;

    @org.jetbrains.annotations.NotNull
    private final kotlin.text.MatchGroupCollection groups;

    @org.jetbrains.annotations.NotNull
    private final java.lang.CharSequence input;

    @org.jetbrains.annotations.NotNull
    private final java.util.regex.Matcher matcher;

    public MatcherMatchResult(@org.jetbrains.annotations.NotNull java.util.regex.Matcher r2, @org.jetbrains.annotations.NotNull java.lang.CharSequence r3) {
            r1 = this;
            java.lang.String r0 = "matcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.matcher = r2
            r1.input = r3
            kotlin.text.MatcherMatchResult$groups$1 r2 = new kotlin.text.MatcherMatchResult$groups$1
            r2.<init>(r1)
            r1.groups = r2
            return
    }

    public static final /* synthetic */ java.util.regex.MatchResult access$getMatchResult(kotlin.text.MatcherMatchResult r0) {
            java.util.regex.MatchResult r0 = r0.getMatchResult()
            return r0
    }

    private final java.util.regex.MatchResult getMatchResult() {
            r1 = this;
            java.util.regex.Matcher r0 = r1.matcher
            return r0
    }

    @Override // kotlin.text.MatchResult
    @org.jetbrains.annotations.NotNull
    public kotlin.text.MatchResult.Destructured getDestructured() {
            r1 = this;
            kotlin.text.MatchResult$Destructured r0 = kotlin.text.MatchResult.DefaultImpls.getDestructured(r1)
            return r0
    }

    @Override // kotlin.text.MatchResult
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.String> getGroupValues() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.groupValues_
            if (r0 != 0) goto Lb
            kotlin.text.MatcherMatchResult$groupValues$1 r0 = new kotlin.text.MatcherMatchResult$groupValues$1
            r0.<init>(r1)
            r1.groupValues_ = r0
        Lb:
            java.util.List<java.lang.String> r0 = r1.groupValues_
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }

    @Override // kotlin.text.MatchResult
    @org.jetbrains.annotations.NotNull
    public kotlin.text.MatchGroupCollection getGroups() {
            r1 = this;
            kotlin.text.MatchGroupCollection r0 = r1.groups
            return r0
    }

    @Override // kotlin.text.MatchResult
    @org.jetbrains.annotations.NotNull
    public kotlin.ranges.IntRange getRange() {
            r1 = this;
            java.util.regex.MatchResult r0 = r1.getMatchResult()
            kotlin.ranges.IntRange r0 = kotlin.text.RegexKt.access$range(r0)
            return r0
    }

    @Override // kotlin.text.MatchResult
    @org.jetbrains.annotations.NotNull
    public java.lang.String getValue() {
            r2 = this;
            java.util.regex.MatchResult r0 = r2.getMatchResult()
            java.lang.String r0 = r0.group()
            java.lang.String r1 = "matchResult.group()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @Override // kotlin.text.MatchResult
    @org.jetbrains.annotations.Nullable
    public kotlin.text.MatchResult next() {
            r3 = this;
            java.util.regex.MatchResult r0 = r3.getMatchResult()
            int r0 = r0.end()
            java.util.regex.MatchResult r1 = r3.getMatchResult()
            int r1 = r1.end()
            java.util.regex.MatchResult r2 = r3.getMatchResult()
            int r2 = r2.start()
            if (r1 != r2) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            int r0 = r0 + r1
            java.lang.CharSequence r1 = r3.input
            int r1 = r1.length()
            if (r0 > r1) goto L3e
            java.util.regex.Matcher r1 = r3.matcher
            java.util.regex.Pattern r1 = r1.pattern()
            java.lang.CharSequence r2 = r3.input
            java.util.regex.Matcher r1 = r1.matcher(r2)
            java.lang.String r2 = "matcher.pattern().matcher(input)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.CharSequence r2 = r3.input
            kotlin.text.MatchResult r0 = kotlin.text.RegexKt.access$findNext(r1, r0, r2)
            goto L3f
        L3e:
            r0 = 0
        L3f:
            return r0
    }
}
