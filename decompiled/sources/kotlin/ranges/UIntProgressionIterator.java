package kotlin.ranges;

/* JADX INFO: compiled from: UIntRange.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B \u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\t\u0010\n\u001a\u00020\u000bH\u0096\u0002J\u0016\u0010\f\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u0005\u001a\u00020\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/UIntProgressionIterator;", "", "Lkotlin/UInt;", "first", "last", "step", "", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "finalElement", "I", "hasNext", "", "next", "next-pVg5ArA", "()I", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class UIntProgressionIterator implements java.util.Iterator<kotlin.UInt>, kotlin.jvm.internal.markers.KMappedMarker {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    private UIntProgressionIterator(int r4, int r5, int r6) {
            r3 = this;
            r3.<init>()
            r3.finalElement = r5
            r0 = 1
            r1 = 0
            int r2 = kotlin.UnsignedKt.uintCompare(r4, r5)
            if (r6 <= 0) goto L10
            if (r2 > 0) goto L13
            goto L14
        L10:
            if (r2 < 0) goto L13
            goto L14
        L13:
            r0 = 0
        L14:
            r3.hasNext = r0
            int r6 = kotlin.UInt.m427constructorimpl(r6)
            r3.step = r6
            boolean r6 = r3.hasNext
            if (r6 == 0) goto L21
            goto L22
        L21:
            r4 = r5
        L22:
            r3.next = r4
            return
    }

    public /* synthetic */ UIntProgressionIterator(int r1, int r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.hasNext
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ kotlin.UInt next() {
            r1 = this;
            int r0 = r1.m1561nextpVg5ArA()
            kotlin.UInt r0 = kotlin.UInt.m421boximpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: next-pVg5ArA, reason: not valid java name */
    public int m1561nextpVg5ArA() {
            r2 = this;
            int r0 = r2.next
            int r1 = r2.finalElement
            if (r0 != r1) goto L14
            boolean r1 = r2.hasNext
            if (r1 == 0) goto Le
            r1 = 0
            r2.hasNext = r1
            goto L1d
        Le:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L14:
            int r1 = r2.step
            int r1 = r1 + r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r2.next = r1
        L1d:
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
