package kotlin;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\u0086\u0004¢\u0006\u0002\u0010\u0005\u001a\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\u0001\u001a(\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u0014\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\t¨\u0006\n"}, d2 = {"to", "Lkotlin/Pair;", "A", "B", "that", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "toList", "", "T", "Lkotlin/Triple;", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
@kotlin.jvm.JvmName(name = "TuplesKt")
public final class TuplesKt {
    @org.jetbrains.annotations.NotNull
    public static final <A, B> kotlin.Pair<A, B> to(A r1, B r2) {
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> toList(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends T, ? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r1 = r3.getFirst()
            r2 = 0
            r0[r2] = r1
            java.lang.Object r3 = r3.getSecond()
            r1 = 1
            r0[r1] = r3
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> toList(@org.jetbrains.annotations.NotNull kotlin.Triple<? extends T, ? extends T, ? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r1 = r3.getFirst()
            r2 = 0
            r0[r2] = r1
            java.lang.Object r1 = r3.getSecond()
            r2 = 1
            r0[r2] = r1
            java.lang.Object r3 = r3.getThird()
            r1 = 2
            r0[r1] = r3
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r0)
            return r3
    }
}
