package kotlin.comparisons;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u0002H\u00010\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\u0003B\u001d\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003¢\u0006\u0002\u0010\u0005J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lkotlin/comparisons/ReversedComparator;", "T", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "(Ljava/util/Comparator;)V", "getComparator", "()Ljava/util/Comparator;", "compare", "", "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;)I", "reversed", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class ReversedComparator<T> implements java.util.Comparator<T> {

    @org.jetbrains.annotations.NotNull
    private final java.util.Comparator<T> comparator;

    public ReversedComparator(@org.jetbrains.annotations.NotNull java.util.Comparator<T> r2) {
            r1 = this;
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.comparator = r2
            return
    }

    @Override // java.util.Comparator
    public int compare(T r2, T r3) {
            r1 = this;
            java.util.Comparator<T> r0 = r1.comparator
            int r2 = r0.compare(r3, r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Comparator<T> getComparator() {
            r1 = this;
            java.util.Comparator<T> r0 = r1.comparator
            return r0
    }

    @Override // java.util.Comparator
    @org.jetbrains.annotations.NotNull
    public final java.util.Comparator<T> reversed() {
            r1 = this;
            java.util.Comparator<T> r0 = r1.comparator
            return r0
    }
}
