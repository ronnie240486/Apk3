package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tJ\u0010\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006 "}, d2 = {"Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/CoroutineDispatcher;", "", "unconfined", "", "delta", "processNextEvent", "processUnconfinedEvent", "shouldBeProcessedFromContext", "Lkotlinx/coroutines/DispatchedTask;", "task", "", "dispatchUnconfined", "incrementUseCount", "decrementUseCount", "", "parallelism", "limitedParallelism", "shutdown", "useCount", "J", "shared", "Z", "Lkotlinx/coroutines/internal/ArrayQueue;", "unconfinedQueue", "Lkotlinx/coroutines/internal/ArrayQueue;", "isActive", "()Z", "isUnconfinedLoopActive", "isUnconfinedQueueEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class EventLoop extends kotlinx.coroutines.CoroutineDispatcher {
    private boolean shared;

    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.internal.ArrayQueue<kotlinx.coroutines.DispatchedTask<?>> unconfinedQueue;
    private long useCount;

    public EventLoop() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void decrementUseCount$default(kotlinx.coroutines.EventLoop r0, boolean r1, int r2, java.lang.Object r3) {
            if (r3 != 0) goto Lb
            r2 = r2 & 1
            if (r2 == 0) goto L7
            r1 = 0
        L7:
            r0.decrementUseCount(r1)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: decrementUseCount"
            r0.<init>(r1)
            throw r0
    }

    private final long delta(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L8
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            goto La
        L8:
            r0 = 1
        La:
            return r0
    }

    public static /* synthetic */ void incrementUseCount$default(kotlinx.coroutines.EventLoop r0, boolean r1, int r2, java.lang.Object r3) {
            if (r3 != 0) goto Lb
            r2 = r2 & 1
            if (r2 == 0) goto L7
            r1 = 0
        L7:
            r0.incrementUseCount(r1)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: incrementUseCount"
            r0.<init>(r1)
            throw r0
    }

    public final void decrementUseCount(boolean r5) {
            r4 = this;
            long r0 = r4.useCount
            long r2 = r4.delta(r5)
            long r0 = r0 - r2
            r4.useCount = r0
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L10
            return
        L10:
            boolean r5 = r4.shared
            if (r5 == 0) goto L17
            r4.shutdown()
        L17:
            return
    }

    public final void dispatchUnconfined(@org.jetbrains.annotations.NotNull kotlinx.coroutines.DispatchedTask<?> r2) {
            r1 = this;
            kotlinx.coroutines.internal.ArrayQueue<kotlinx.coroutines.DispatchedTask<?>> r0 = r1.unconfinedQueue
            if (r0 != 0) goto Lb
            kotlinx.coroutines.internal.ArrayQueue r0 = new kotlinx.coroutines.internal.ArrayQueue
            r0.<init>()
            r1.unconfinedQueue = r0
        Lb:
            r0.addLast(r2)
            return
    }

    public long getNextTime() {
            r3 = this;
            kotlinx.coroutines.internal.ArrayQueue<kotlinx.coroutines.DispatchedTask<?>> r0 = r3.unconfinedQueue
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto La
            return r1
        La:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r1 = 0
        L13:
            return r1
    }

    public final void incrementUseCount(boolean r5) {
            r4 = this;
            long r0 = r4.useCount
            long r2 = r4.delta(r5)
            long r0 = r0 + r2
            r4.useCount = r0
            if (r5 != 0) goto Le
            r5 = 1
            r4.shared = r5
        Le:
            return
    }

    public final boolean isActive() {
            r5 = this;
            long r0 = r5.useCount
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public final boolean isUnconfinedLoopActive() {
            r6 = this;
            long r0 = r6.useCount
            r2 = 1
            long r3 = r6.delta(r2)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto Lc
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public final boolean isUnconfinedQueueEmpty() {
            r1 = this;
            kotlinx.coroutines.internal.ArrayQueue<kotlinx.coroutines.DispatchedTask<?>> r0 = r1.unconfinedQueue
            if (r0 != 0) goto L6
            r0 = 1
            goto La
        L6:
            boolean r0 = r0.isEmpty()
        La:
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int r1) {
            r0 = this;
            kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(r1)
            return r0
    }

    public long processNextEvent() {
            r2 = this;
            boolean r0 = r2.processUnconfinedEvent()
            if (r0 != 0) goto Lc
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final boolean processUnconfinedEvent() {
            r2 = this;
            kotlinx.coroutines.internal.ArrayQueue<kotlinx.coroutines.DispatchedTask<?>> r0 = r2.unconfinedQueue
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = r0.removeFirstOrNull()
            kotlinx.coroutines.DispatchedTask r0 = (kotlinx.coroutines.DispatchedTask) r0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0.run()
            r0 = 1
            return r0
    }

    public boolean shouldBeProcessedFromContext() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void shutdown() {
            r0 = this;
            return
    }
}
