package kotlin.text;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lkotlin/text/MatchGroup;", "", "value", "", "range", "Lkotlin/ranges/IntRange;", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "getRange", "()Lkotlin/ranges/IntRange;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MatchGroup {

    @org.jetbrains.annotations.NotNull
    private final kotlin.ranges.IntRange range;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    public MatchGroup(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.ranges.IntRange r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.value = r2
            r1.range = r3
            return
    }

    public static /* synthetic */ kotlin.text.MatchGroup copy$default(kotlin.text.MatchGroup r0, java.lang.String r1, kotlin.ranges.IntRange r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.value
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            kotlin.ranges.IntRange r2 = r0.range
        Lc:
            kotlin.text.MatchGroup r0 = r0.copy(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.ranges.IntRange component2() {
            r1 = this;
            kotlin.ranges.IntRange r0 = r1.range
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.text.MatchGroup copy(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.ranges.IntRange r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.text.MatchGroup r0 = new kotlin.text.MatchGroup
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.text.MatchGroup
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.text.MatchGroup r5 = (kotlin.text.MatchGroup) r5
            java.lang.String r1 = r4.value
            java.lang.String r3 = r5.value
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            kotlin.ranges.IntRange r1 = r4.range
            kotlin.ranges.IntRange r5 = r5.range
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.ranges.IntRange getRange() {
            r1 = this;
            kotlin.ranges.IntRange r0 = r1.range
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.value
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            kotlin.ranges.IntRange r1 = r2.range
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "MatchGroup(value="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.value
            r0.append(r1)
            java.lang.String r1 = ", range="
            r0.append(r1)
            kotlin.ranges.IntRange r1 = r2.range
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
