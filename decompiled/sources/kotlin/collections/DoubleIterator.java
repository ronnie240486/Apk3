package kotlin.collections;

/* JADX INFO: compiled from: Iterators.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u0006\n\u0002\b\u0005\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lkotlin/collections/DoubleIterator;", "", "", "()V", "next", "()Ljava/lang/Double;", "nextDouble", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class DoubleIterator implements java.util.Iterator<java.lang.Double>, kotlin.jvm.internal.markers.KMappedMarker {
    public DoubleIterator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @org.jetbrains.annotations.NotNull
    public final java.lang.Double next() {
            r2 = this;
            double r0 = r2.nextDouble()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Double next() {
            r2 = this;
            double r0 = r2.nextDouble()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    public abstract double nextDouble();

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
