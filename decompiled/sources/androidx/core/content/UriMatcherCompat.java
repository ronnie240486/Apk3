package androidx.core.content;

/* JADX INFO: loaded from: classes3.dex */
public class UriMatcherCompat {
    public static /* synthetic */ boolean $r8$lambda$ak8EzdVzS74T_K7b7pKPTuokBDk(android.content.UriMatcher r0, android.net.Uri r1) {
            boolean r0 = lambda$asPredicate$0(r0, r1)
            return r0
    }

    private UriMatcherCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.util.Predicate<android.net.Uri> asPredicate(@androidx.annotation.NonNull android.content.UriMatcher r2) {
            androidx.core.content.UriMatcherCompat$$ExternalSyntheticLambda0 r0 = new androidx.core.content.UriMatcherCompat$$ExternalSyntheticLambda0
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    private static /* synthetic */ boolean lambda$asPredicate$0(android.content.UriMatcher r0, android.net.Uri r1) {
            int r0 = r0.match(r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }
}
