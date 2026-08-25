package kotlin.text;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0096\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0096\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "size", "", "getSize", "()I", "get", "index", "name", "", "isEmpty", "", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MatcherMatchResult$groups$1 extends kotlin.collections.AbstractCollection<kotlin.text.MatchGroup> implements kotlin.text.MatchNamedGroupCollection {
    public final /* synthetic */ kotlin.text.MatcherMatchResult this$0;

    public MatcherMatchResult$groups$1(kotlin.text.MatcherMatchResult r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r0 = 1
            goto L6
        L4:
            boolean r0 = r2 instanceof kotlin.text.MatchGroup
        L6:
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            kotlin.text.MatchGroup r2 = (kotlin.text.MatchGroup) r2
            boolean r2 = r1.contains(r2)
            return r2
    }

    public /* bridge */ boolean contains(kotlin.text.MatchGroup r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    @Override // kotlin.text.MatchGroupCollection
    @org.jetbrains.annotations.Nullable
    public kotlin.text.MatchGroup get(int r4) {
            r3 = this;
            kotlin.text.MatcherMatchResult r0 = r3.this$0
            java.util.regex.MatchResult r0 = kotlin.text.MatcherMatchResult.access$getMatchResult(r0)
            kotlin.ranges.IntRange r0 = kotlin.text.RegexKt.access$range(r0, r4)
            java.lang.Integer r1 = r0.getStart()
            int r1 = r1.intValue()
            if (r1 < 0) goto L29
            kotlin.text.MatchGroup r1 = new kotlin.text.MatchGroup
            kotlin.text.MatcherMatchResult r2 = r3.this$0
            java.util.regex.MatchResult r2 = kotlin.text.MatcherMatchResult.access$getMatchResult(r2)
            java.lang.String r4 = r2.group(r4)
            java.lang.String r2 = "matchResult.group(index)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)
            r1.<init>(r4, r0)
            goto L2a
        L29:
            r1 = 0
        L2a:
            return r1
    }

    @Override // kotlin.text.MatchNamedGroupCollection
    @org.jetbrains.annotations.Nullable
    public kotlin.text.MatchGroup get(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.internal.PlatformImplementations r0 = kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS
            kotlin.text.MatcherMatchResult r1 = r2.this$0
            java.util.regex.MatchResult r1 = kotlin.text.MatcherMatchResult.access$getMatchResult(r1)
            kotlin.text.MatchGroup r3 = r0.getMatchResultNamedGroup(r1, r3)
            return r3
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
            r1 = this;
            kotlin.text.MatcherMatchResult r0 = r1.this$0
            java.util.regex.MatchResult r0 = kotlin.text.MatcherMatchResult.access$getMatchResult(r0)
            int r0 = r0.groupCount()
            int r0 = r0 + 1
            return r0
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<kotlin.text.MatchGroup> iterator() {
            r2 = this;
            kotlin.ranges.IntRange r0 = kotlin.collections.CollectionsKt.getIndices(r2)
            kotlin.sequences.Sequence r0 = kotlin.collections.CollectionsKt.asSequence(r0)
            kotlin.text.MatcherMatchResult$groups$1$iterator$1 r1 = new kotlin.text.MatcherMatchResult$groups$1$iterator$1
            r1.<init>(r2)
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.map(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
