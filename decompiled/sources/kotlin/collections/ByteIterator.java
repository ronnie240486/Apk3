package kotlin.collections;

/* JADX INFO: compiled from: Iterators.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u0005\n\u0002\b\u0005\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lkotlin/collections/ByteIterator;", "", "", "()V", "next", "()Ljava/lang/Byte;", "nextByte", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class ByteIterator implements java.util.Iterator<java.lang.Byte>, kotlin.jvm.internal.markers.KMappedMarker {
    public ByteIterator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @org.jetbrains.annotations.NotNull
    public final java.lang.Byte next() {
            r1 = this;
            byte r0 = r1.nextByte()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Byte next() {
            r1 = this;
            byte r0 = r1.nextByte()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
    }

    public abstract byte nextByte();

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
