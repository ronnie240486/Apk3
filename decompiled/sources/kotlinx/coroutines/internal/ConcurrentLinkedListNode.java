package kotlinx.coroutines.internal;

import kotlinx.coroutines.internal.ConcurrentLinkedListNode;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\t\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u001aB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\u0004\u0018\u00018\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0007J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0016\u0010\u0017\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u0014\u0010 \u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\nR\u0014\u0010\"\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0016¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "prev", "<init>", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)V", "", "cleanPrev", "()V", "", "markAsClosed", "()Z", "Lkotlin/Function0;", "", "onClosedAction", "nextOrIfClosed", "(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "remove", "value", "trySetNext", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Z", "isTail", "getLeftmostAliveNode", "()Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "leftmostAliveNode", "getNext", "next", "", "getNextOrClosed", "()Ljava/lang/Object;", "nextOrClosed", "getPrev", "getRemoved", "removed", "getRightmostAliveNode", "rightmostAliveNode", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class ConcurrentLinkedListNode<N extends kotlinx.coroutines.internal.ConcurrentLinkedListNode<N>> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _next$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _prev$FU = null;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ java.lang.Object _next;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ java.lang.Object _prev;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class<kotlinx.coroutines.internal.ConcurrentLinkedListNode> r1 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.class
            java.lang.String r2 = "_next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.internal.ConcurrentLinkedListNode._next$FU = r2
            java.lang.String r2 = "_prev"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.internal.ConcurrentLinkedListNode._prev$FU = r0
            return
    }

    public ConcurrentLinkedListNode(@org.jetbrains.annotations.Nullable N r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._next = r0
            r1._prev = r2
            return
    }

    public static final /* synthetic */ java.lang.Object access$getNextOrClosed(kotlinx.coroutines.internal.ConcurrentLinkedListNode r0) {
            java.lang.Object r0 = r0.getNextOrClosed()
            return r0
    }

    private final N getLeftmostAliveNode() {
            r2 = this;
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r2.getPrev()
        L4:
            if (r0 == 0) goto L11
            boolean r1 = r0.getRemoved()
            if (r1 == 0) goto L11
            java.lang.Object r0 = r0._prev
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            goto L4
        L11:
            return r0
    }

    private final java.lang.Object getNextOrClosed() {
            r1 = this;
            java.lang.Object r0 = r1._next
            return r0
    }

    private final N getRightmostAliveNode() {
            r2 = this;
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r2.getNext()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
        L7:
            boolean r1 = r0.getRemoved()
            if (r1 == 0) goto L15
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r0.getNext()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            goto L7
        L15:
            return r0
    }

    public final void cleanPrev() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.ConcurrentLinkedListNode._prev$FU
            r1 = 0
            r0.lazySet(r2, r1)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final N getNext() {
            r2 = this;
            java.lang.Object r0 = access$getNextOrClosed(r2)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            if (r0 != r1) goto Lc
            r0 = 0
            return r0
        Lc:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final N getPrev() {
            r1 = this;
            java.lang.Object r0 = r1._prev
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            return r0
    }

    public abstract boolean getRemoved();

    public final boolean isTail() {
            r1 = this;
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r1.getNext()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final boolean markAsClosed() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.ConcurrentLinkedListNode._next$FU
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
        L6:
            r2 = 0
            boolean r2 = r0.compareAndSet(r3, r2, r1)
            if (r2 == 0) goto Lf
            r0 = 1
            goto L16
        Lf:
            java.lang.Object r2 = r0.get(r3)
            if (r2 == 0) goto L6
            r0 = 0
        L16:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final N nextOrIfClosed(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0 r3) {
            r2 = this;
            java.lang.Object r0 = access$getNextOrClosed(r2)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            if (r0 == r1) goto Ld
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            return r0
        Ld:
            r3.invoke()
            kotlin.KotlinNothingValueException r3 = new kotlin.KotlinNothingValueException
            r3.<init>()
            throw r3
    }

    public final void remove() {
            r2 = this;
        L0:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r2.getLeftmostAliveNode()
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r1 = r2.getRightmostAliveNode()
            r1._prev = r0
            if (r0 == 0) goto Le
            r0._next = r1
        Le:
            boolean r1 = r1.getRemoved()
            if (r1 == 0) goto L15
            goto L0
        L15:
            if (r0 == 0) goto L1e
            boolean r0 = r0.getRemoved()
            if (r0 == 0) goto L1e
            goto L0
        L1e:
            return
    }

    public final boolean trySetNext(@org.jetbrains.annotations.NotNull N r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.ConcurrentLinkedListNode._next$FU
        L2:
            r1 = 0
            boolean r1 = r0.compareAndSet(r2, r1, r3)
            if (r1 == 0) goto Lb
            r3 = 1
            goto L12
        Lb:
            java.lang.Object r1 = r0.get(r2)
            if (r1 == 0) goto L2
            r3 = 0
        L12:
            return r3
    }
}
