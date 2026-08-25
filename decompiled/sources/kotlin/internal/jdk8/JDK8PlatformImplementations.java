package kotlin.internal.jdk8;

/* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "()V", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class JDK8PlatformImplementations extends kotlin.internal.jdk7.JDK7PlatformImplementations {
    public JDK8PlatformImplementations() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.internal.PlatformImplementations
    @org.jetbrains.annotations.NotNull
    public kotlin.random.Random defaultPlatformRandom() {
            r1 = this;
            kotlin.random.jdk8.PlatformThreadLocalRandom r0 = new kotlin.random.jdk8.PlatformThreadLocalRandom
            r0.<init>()
            return r0
    }

    @Override // kotlin.internal.PlatformImplementations
    @org.jetbrains.annotations.Nullable
    public kotlin.text.MatchGroup getMatchResultNamedGroup(@org.jetbrains.annotations.NotNull java.util.regex.MatchResult r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "matchResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r5 instanceof java.util.regex.Matcher
            r1 = 0
            if (r0 == 0) goto L12
            java.util.regex.Matcher r5 = (java.util.regex.Matcher) r5
            goto L13
        L12:
            r5 = r1
        L13:
            if (r5 == 0) goto L3d
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r2 = r5.start(r6)
            int r3 = r5.end(r6)
            int r3 = r3 + (-1)
            r0.<init>(r2, r3)
            java.lang.Integer r2 = r0.getStart()
            int r2 = r2.intValue()
            if (r2 < 0) goto L3c
            kotlin.text.MatchGroup r1 = new kotlin.text.MatchGroup
            java.lang.String r5 = r5.group(r6)
            java.lang.String r6 = "matcher.group(name)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r1.<init>(r5, r0)
        L3c:
            return r1
        L3d:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r6 = "Retrieving groups by name is not supported on this platform."
            r5.<init>(r6)
            throw r5
    }
}
