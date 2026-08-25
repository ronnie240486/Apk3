package kotlin.collections;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0016\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0013\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lkotlin/collections/ReversedList;", "T", "Lkotlin/collections/AbstractMutableList;", "delegate", "", "(Ljava/util/List;)V", "size", "", "getSize", "()I", "add", "", "index", "element", "(ILjava/lang/Object;)V", "clear", "get", "(I)Ljava/lang/Object;", "removeAt", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class ReversedList<T> extends kotlin.collections.AbstractMutableList<T> {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<T> delegate;

    public ReversedList(@org.jetbrains.annotations.NotNull java.util.List<T> r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.delegate = r2
            return
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int r2, T r3) {
            r1 = this;
            java.util.List<T> r0 = r1.delegate
            int r2 = kotlin.collections.CollectionsKt__ReversedViewsKt.access$reversePositionIndex(r1, r2)
            r0.add(r2, r3)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r1 = this;
            java.util.List<T> r0 = r1.delegate
            r0.clear()
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int r2) {
            r1 = this;
            java.util.List<T> r0 = r1.delegate
            int r2 = kotlin.collections.CollectionsKt__ReversedViewsKt.access$reverseElementIndex(r1, r2)
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
            r1 = this;
            java.util.List<T> r0 = r1.delegate
            int r0 = r0.size()
            return r0
    }

    @Override // kotlin.collections.AbstractMutableList
    public T removeAt(int r2) {
            r1 = this;
            java.util.List<T> r0 = r1.delegate
            int r2 = kotlin.collections.CollectionsKt__ReversedViewsKt.access$reverseElementIndex(r1, r2)
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public T set(int r2, T r3) {
            r1 = this;
            java.util.List<T> r0 = r1.delegate
            int r2 = kotlin.collections.CollectionsKt__ReversedViewsKt.access$reverseElementIndex(r1, r2)
            java.lang.Object r2 = r0.set(r2, r3)
            return r2
    }
}
