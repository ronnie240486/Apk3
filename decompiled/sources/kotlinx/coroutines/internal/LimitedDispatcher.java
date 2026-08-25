package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u0003H\u0002J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u0003H\u0016J#\u0010\u001a\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u001bH\u0082\bJ\u001c\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u0003H\u0017J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00152\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\b\u0010!\u001a\u00020\u0013H\u0016J\u001f\u0010\"\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00152\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130$H\u0096\u0001J\b\u0010%\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rj\u0002`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/Delay;", "dispatcher", "parallelism", "", "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "queue", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "runningWorkers", "workerAllocationLock", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "addAndTryDispatching", "", "block", "delay", "", "time", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "dispatchInternal", "Lkotlin/Function0;", "dispatchYield", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "limitedParallelism", "run", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "tryAllocateWorker", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LimitedDispatcher extends kotlinx.coroutines.CoroutineDispatcher implements java.lang.Runnable, kotlinx.coroutines.Delay {
    private final /* synthetic */ kotlinx.coroutines.Delay $$delegate_0;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher;
    private final int parallelism;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> queue;
    private volatile int runningWorkers;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object workerAllocationLock;

    public LimitedDispatcher(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineDispatcher r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.dispatcher = r1
            r0.parallelism = r2
            boolean r2 = r1 instanceof kotlinx.coroutines.Delay
            if (r2 == 0) goto Le
            kotlinx.coroutines.Delay r1 = (kotlinx.coroutines.Delay) r1
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 != 0) goto L15
            kotlinx.coroutines.Delay r1 = kotlinx.coroutines.DefaultExecutorKt.getDefaultDelay()
        L15:
            r0.$$delegate_0 = r1
            kotlinx.coroutines.internal.LockFreeTaskQueue r1 = new kotlinx.coroutines.internal.LockFreeTaskQueue
            r2 = 0
            r1.<init>(r2)
            r0.queue = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.workerAllocationLock = r1
            return
    }

    private final boolean addAndTryDispatching(java.lang.Runnable r2) {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> r0 = r1.queue
            r0.addLast(r2)
            int r2 = r1.runningWorkers
            int r0 = r1.parallelism
            if (r2 < r0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            return r2
    }

    private final void dispatchInternal(java.lang.Runnable r1, kotlin.jvm.functions.Function0<kotlin.Unit> r2) {
            r0 = this;
            boolean r1 = r0.addAndTryDispatching(r1)
            if (r1 == 0) goto L7
            return
        L7:
            boolean r1 = r0.tryAllocateWorker()
            if (r1 != 0) goto Le
            return
        Le:
            r2.invoke()
            return
    }

    private final boolean tryAllocateWorker() {
            r3 = this;
            java.lang.Object r0 = r3.workerAllocationLock
            monitor-enter(r0)
            int r1 = r3.runningWorkers     // Catch: java.lang.Throwable -> L14
            int r2 = r3.parallelism     // Catch: java.lang.Throwable -> L14
            if (r1 < r2) goto Lc
            r1 = 0
            monitor-exit(r0)
            return r1
        Lc:
            int r1 = r3.runningWorkers     // Catch: java.lang.Throwable -> L14
            r2 = 1
            int r1 = r1 + r2
            r3.runningWorkers = r1     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return r2
        L14:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @org.jetbrains.annotations.Nullable
    public java.lang.Object delay(long r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r1 = this;
            kotlinx.coroutines.Delay r0 = r1.$$delegate_0
            java.lang.Object r2 = r0.delay(r2, r4)
            return r2
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo1866dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r0 = this;
            boolean r1 = r0.addAndTryDispatching(r2)
            if (r1 == 0) goto L7
            goto L13
        L7:
            boolean r1 = r0.tryAllocateWorker()
            if (r1 != 0) goto Le
            goto L13
        Le:
            kotlinx.coroutines.CoroutineDispatcher r1 = r0.dispatcher
            r1.mo1866dispatch(r0, r0)
        L13:
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @kotlinx.coroutines.InternalCoroutinesApi
    public void dispatchYield(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r0 = this;
            boolean r1 = r0.addAndTryDispatching(r2)
            if (r1 == 0) goto L7
            goto L13
        L7:
            boolean r1 = r0.tryAllocateWorker()
            if (r1 != 0) goto Le
            goto L13
        Le:
            kotlinx.coroutines.CoroutineDispatcher r1 = r0.dispatcher
            r1.dispatchYield(r0, r0)
        L13:
            return
    }

    @Override // kotlinx.coroutines.Delay
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r2, @org.jetbrains.annotations.NotNull java.lang.Runnable r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r5) {
            r1 = this;
            kotlinx.coroutines.Delay r0 = r1.$$delegate_0
            kotlinx.coroutines.DisposableHandle r2 = r0.invokeOnTimeout(r2, r4, r5)
            return r2
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int r2) {
            r1 = this;
            kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(r2)
            int r0 = r1.parallelism
            if (r2 < r0) goto L8
            return r1
        L8:
            kotlinx.coroutines.CoroutineDispatcher r2 = super.limitedParallelism(r2)
            return r2
    }

    @Override // java.lang.Runnable
    public void run() {
            r4 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> r2 = r4.queue
            java.lang.Object r2 = r2.removeFirstOrNull()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            kotlinx.coroutines.CoroutineDispatcher r2 = r4.dispatcher
            boolean r2 = r2.isDispatchNeeded(r4)
            if (r2 == 0) goto L2
            kotlinx.coroutines.CoroutineDispatcher r0 = r4.dispatcher
            r0.mo1866dispatch(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.workerAllocationLock
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> r2 = r4.queue     // Catch: java.lang.Throwable -> L47
            int r2 = r2.getSize()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo1867scheduleResumeAfterDelay(long r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r4) {
            r1 = this;
            kotlinx.coroutines.Delay r0 = r1.$$delegate_0
            r0.mo1867scheduleResumeAfterDelay(r2, r4)
            return
    }
}
