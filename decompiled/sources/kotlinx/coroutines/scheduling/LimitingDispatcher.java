package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00020+2\u00020,2\u00020\u001fB)\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ#\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0013\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0013\u0010\u0017J#\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u001b\u0010\u001a\u001a\u00020\n2\n\u0010\u0019\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u001e\u0010&\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lkotlinx/coroutines/scheduling/LimitingDispatcher;", "Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "dispatcher", "", "parallelism", "", "name", "taskMode", "<init>", "(Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;ILjava/lang/String;I)V", "", "afterTask", "()V", "close", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "tailDispatch", "(Ljava/lang/Runnable;Z)V", "dispatchYield", "command", "execute", "(Ljava/lang/Runnable;)V", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor", "Ljava/lang/String;", "I", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "queue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "getTaskMode", "()I", "kotlinx-coroutines-core", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/scheduling/TaskContext;"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class LimitingDispatcher extends kotlinx.coroutines.ExecutorCoroutineDispatcher implements kotlinx.coroutines.scheduling.TaskContext, java.util.concurrent.Executor {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater inFlightTasks$FU = null;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher dispatcher;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ int inFlightTasks;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String name;
    private final int parallelism;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> queue;
    private final int taskMode;

    static {
            java.lang.Class<kotlinx.coroutines.scheduling.LimitingDispatcher> r0 = kotlinx.coroutines.scheduling.LimitingDispatcher.class
            java.lang.String r1 = "inFlightTasks"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.scheduling.LimitingDispatcher.inFlightTasks$FU = r0
            return
    }

    public LimitingDispatcher(@org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher r1, int r2, @org.jetbrains.annotations.Nullable java.lang.String r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.dispatcher = r1
            r0.parallelism = r2
            r0.name = r3
            r0.taskMode = r4
            java.util.concurrent.ConcurrentLinkedQueue r1 = new java.util.concurrent.ConcurrentLinkedQueue
            r1.<init>()
            r0.queue = r1
            r1 = 0
            r0.inFlightTasks = r1
            return
    }

    private final void dispatch(java.lang.Runnable r4, boolean r5) {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.LimitingDispatcher.inFlightTasks$FU
            int r1 = r0.incrementAndGet(r3)
            int r2 = r3.parallelism
            if (r1 > r2) goto L10
            kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher r0 = r3.dispatcher
            r0.dispatchWithContext$kotlinx_coroutines_core(r4, r3, r5)
            return
        L10:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r1 = r3.queue
            r1.add(r4)
            int r4 = r0.decrementAndGet(r3)
            int r0 = r3.parallelism
            if (r4 < r0) goto L1e
            return
        L1e:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r4 = r3.queue
            java.lang.Object r4 = r4.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r4 != 0) goto L0
            return
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    public void afterTask() {
            r3 = this;
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r3.queue
            java.lang.Object r0 = r0.poll()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1 = 1
            if (r0 == 0) goto L11
            kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher r2 = r3.dispatcher
            r2.dispatchWithContext$kotlinx_coroutines_core(r0, r3, r1)
            return
        L11:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.LimitingDispatcher.inFlightTasks$FU
            r0.decrementAndGet(r3)
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r3.queue
            java.lang.Object r0 = r0.poll()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 != 0) goto L21
            return
        L21:
            r3.dispatch(r0, r1)
            return
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Close cannot be invoked on LimitingBlockingDispatcher"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo1866dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r0 = this;
            r1 = 0
            r0.dispatch(r2, r1)
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r0 = this;
            r1 = 1
            r0.dispatch(r2, r1)
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(@org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r1 = this;
            r0 = 0
            r1.dispatch(r2, r0)
            return
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @org.jetbrains.annotations.NotNull
    public java.util.concurrent.Executor getExecutor() {
            r0 = this;
            return r0
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    public int getTaskMode() {
            r1 = this;
            int r0 = r1.taskMode
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.name
            if (r0 != 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "[dispatcher = "
            r0.append(r1)
            kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher r1 = r2.dispatcher
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L23:
            return r0
    }
}
