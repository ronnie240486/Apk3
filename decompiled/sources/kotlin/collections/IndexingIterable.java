package kotlin.collections;

/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0006H\u0096\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlin/collections/IndexingIterable;", "T", "", "Lkotlin/collections/IndexedValue;", "iteratorFactory", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class IndexingIterable<T> implements java.lang.Iterable<kotlin.collections.IndexedValue<? extends T>>, kotlin.jvm.internal.markers.KMappedMarker {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<java.util.Iterator<T>> iteratorFactory;

    public IndexingIterable(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends java.util.Iterator<? extends T>> r2) {
            r1 = this;
            java.lang.String r0 = "iteratorFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.iteratorFactory = r2
            return
    }

    @Override // java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<kotlin.collections.IndexedValue<T>> iterator() {
            r2 = this;
            kotlin.collections.IndexingIterator r0 = new kotlin.collections.IndexingIterator
            kotlin.jvm.functions.Function0<java.util.Iterator<T>> r1 = r2.iteratorFactory
            java.lang.Object r1 = r1.invoke()
            java.util.Iterator r1 = (java.util.Iterator) r1
            r0.<init>(r1)
            return r0
    }
}
