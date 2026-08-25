package kotlin.text.jdk8;

/* JADX INFO: compiled from: RegexExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0002¨\u0006\u0005"}, d2 = {"get", "Lkotlin/text/MatchGroup;", "Lkotlin/text/MatchGroupCollection;", "name", "", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 6, 0}, pn = "kotlin.text", xi = 48)
@kotlin.jvm.JvmName(name = "RegexExtensionsJDK8Kt")
public final class RegexExtensionsJDK8Kt {
    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.Nullable
    public static final kotlin.text.MatchGroup get(@org.jetbrains.annotations.NotNull kotlin.text.MatchGroupCollection r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1 instanceof kotlin.text.MatchNamedGroupCollection
            if (r0 == 0) goto L11
            kotlin.text.MatchNamedGroupCollection r1 = (kotlin.text.MatchNamedGroupCollection) r1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L19
            kotlin.text.MatchGroup r1 = r1.get(r2)
            return r1
        L19:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Retrieving groups by name is not supported on this platform."
            r1.<init>(r2)
            throw r1
    }
}
