package kotlin.collections;

/* JADX INFO: compiled from: AbstractIterator.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lkotlin/collections/AbstractIterator;", "T", "", "", "tryToComputeNext", "hasNext", "next", "()Ljava/lang/Object;", "Lkotlin/collections/State;", "state", "Lkotlin/collections/State;", "nextValue", "Ljava/lang/Object;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class AbstractIterator<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {

    @org.jetbrains.annotations.Nullable
    private T nextValue;

    @org.jetbrains.annotations.NotNull
    private kotlin.collections.State state;

    /* JADX INFO: compiled from: AbstractIterator.kt */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlin.collections.State[] r0 = kotlin.collections.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.collections.State r1 = kotlin.collections.State.Done
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                kotlin.collections.State r1 = kotlin.collections.State.Ready
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                kotlin.collections.AbstractIterator.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public AbstractIterator() {
            r1 = this;
            r1.<init>()
            kotlin.collections.State r0 = kotlin.collections.State.NotReady
            r1.state = r0
            return
    }

    private final boolean tryToComputeNext() {
            r2 = this;
            kotlin.collections.State r0 = kotlin.collections.State.Failed
            r2.state = r0
            r2.computeNext()
            kotlin.collections.State r0 = r2.state
            kotlin.collections.State r1 = kotlin.collections.State.Ready
            if (r0 != r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public abstract void computeNext();

    public final void done() {
            r1 = this;
            kotlin.collections.State r0 = kotlin.collections.State.Done
            r1.state = r0
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r4 = this;
            kotlin.collections.State r0 = r4.state
            kotlin.collections.State r1 = kotlin.collections.State.Failed
            r2 = 0
            r3 = 1
            if (r0 == r1) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == 0) goto L21
            int[] r1 = kotlin.collections.AbstractIterator.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r3) goto L20
            r1 = 2
            if (r0 == r1) goto L1f
            boolean r2 = r4.tryToComputeNext()
            goto L20
        L1f:
            r2 = 1
        L20:
            return r2
        L21:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Iterator
    public T next() {
            r1 = this;
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ld
            kotlin.collections.State r0 = kotlin.collections.State.NotReady
            r1.state = r0
            T r0 = r1.nextValue
            return r0
        Ld:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    public final void setNext(T r1) {
            r0 = this;
            r0.nextValue = r1
            kotlin.collections.State r1 = kotlin.collections.State.Ready
            r0.state = r1
            return
    }
}
