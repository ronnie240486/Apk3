package kotlin.ranges;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "first", "", "last", "step", "", "(CCI)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextChar", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CharProgressionIterator extends kotlin.collections.CharIterator {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    public CharProgressionIterator(char r3, char r4, int r5) {
            r2 = this;
            r2.<init>()
            r2.step = r5
            r2.finalElement = r4
            r0 = 1
            r1 = 0
            if (r5 <= 0) goto L12
            int r5 = kotlin.jvm.internal.Intrinsics.compare(r3, r4)
            if (r5 > 0) goto L19
            goto L1a
        L12:
            int r5 = kotlin.jvm.internal.Intrinsics.compare(r3, r4)
            if (r5 < 0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            r2.hasNext = r0
            if (r0 == 0) goto L1f
            goto L20
        L1f:
            r3 = r4
        L20:
            r2.next = r3
            return
    }

    public final int getStep() {
            r1 = this;
            int r0 = r1.step
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.hasNext
            return r0
    }

    @Override // kotlin.collections.CharIterator
    public char nextChar() {
            r2 = this;
            int r0 = r2.next
            int r1 = r2.finalElement
            if (r0 != r1) goto L14
            boolean r1 = r2.hasNext
            if (r1 == 0) goto Le
            r1 = 0
            r2.hasNext = r1
            goto L19
        Le:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L14:
            int r1 = r2.step
            int r1 = r1 + r0
            r2.next = r1
        L19:
            char r0 = (char) r0
            return r0
    }
}
