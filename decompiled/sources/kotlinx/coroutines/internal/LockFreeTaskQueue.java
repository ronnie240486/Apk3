package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0001\u0010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "", "E", "", "singleConsumer", "<init>", "(Z)V", "element", "addLast", "(Ljava/lang/Object;)Z", "", "close", "()V", "isClosed", "()Z", "R", "Lkotlin/Function1;", "transform", "", "map", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "removeFirstOrNull", "()Ljava/lang/Object;", "isEmpty", "", "getSize", "()I", "size", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class LockFreeTaskQueue<E> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _cur$FU = null;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ java.lang.Object _cur;

    static {
            java.lang.Class<kotlinx.coroutines.internal.LockFreeTaskQueue> r0 = kotlinx.coroutines.internal.LockFreeTaskQueue.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_cur"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlinx.coroutines.internal.LockFreeTaskQueue._cur$FU = r0
            return
    }

    public LockFreeTaskQueue(boolean r3) {
            r2 = this;
            r2.<init>()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            r1 = 8
            r0.<init>(r1, r3)
            r2._cur = r0
            return
    }

    public final boolean addLast(@org.jetbrains.annotations.NotNull E r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._cur
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            int r1 = r0.addLast(r5)
            r2 = 1
            if (r1 == 0) goto L27
            if (r1 == r2) goto L13
            r0 = 2
            if (r1 == r0) goto L11
            goto L0
        L11:
            r5 = 0
            return r5
        L13:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeTaskQueue._cur$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r3 = r0.next()
        L19:
            boolean r2 = r1.compareAndSet(r4, r0, r3)
            if (r2 == 0) goto L20
            goto L0
        L20:
            java.lang.Object r2 = r1.get(r4)
            if (r2 == r0) goto L19
            goto L0
        L27:
            return r2
    }

    public final void close() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._cur
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            boolean r1 = r0.close()
            if (r1 == 0) goto Lb
            return
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeTaskQueue._cur$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = r0.next()
        L11:
            boolean r3 = r1.compareAndSet(r4, r0, r2)
            if (r3 == 0) goto L18
            goto L0
        L18:
            java.lang.Object r3 = r1.get(r4)
            if (r3 == r0) goto L11
            goto L0
    }

    public final int getSize() {
            r1 = this;
            java.lang.Object r0 = r1._cur
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            int r0 = r0.getSize()
            return r0
    }

    public final boolean isClosed() {
            r1 = this;
            java.lang.Object r0 = r1._cur
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            boolean r0 = r0.isClosed()
            return r0
    }

    public final boolean isEmpty() {
            r1 = this;
            java.lang.Object r0 = r1._cur
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            boolean r0 = r0.isEmpty()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final <R> java.util.List<R> map(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, ? extends R> r2) {
            r1 = this;
            java.lang.Object r0 = r1._cur
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            java.util.List r2 = r0.map(r2)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final E removeFirstOrNull() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._cur
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            java.lang.Object r1 = r0.removeFirstOrNull()
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN
            if (r1 == r2) goto Ld
            return r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeTaskQueue._cur$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = r0.next()
        L13:
            boolean r3 = r1.compareAndSet(r4, r0, r2)
            if (r3 == 0) goto L1a
            goto L0
        L1a:
            java.lang.Object r3 = r1.get(r4)
            if (r3 == r0) goto L13
            goto L0
    }
}
