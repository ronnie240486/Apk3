package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0010\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\u001c\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u0018H\u0016J)\u0010\u0019\u001a\u00020\u00112\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ\u001c\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u0018H\u0016J\r\u0010\u001f\u001a\u00020\u0011H\u0000¢\u0006\u0002\b J\u0015\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0006H\u0000¢\u0006\u0002\b#J\r\u0010$\u001a\u00020\u0011H\u0000¢\u0006\u0002\b%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/scheduling/SchedulerCoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "corePoolSize", "", "maxPoolSize", "idleWorkerKeepAliveNs", "", "schedulerName", "", "(IIJLjava/lang/String;)V", "coroutineScheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "close", "", "createScheduler", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchWithContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "tailDispatch", "", "dispatchWithContext$kotlinx_coroutines_core", "dispatchYield", "restore", "restore$kotlinx_coroutines_core", "shutdown", "timeout", "shutdown$kotlinx_coroutines_core", "usePrivateScheduler", "usePrivateScheduler$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class SchedulerCoroutineDispatcher extends kotlinx.coroutines.ExecutorCoroutineDispatcher {
    private final int corePoolSize;

    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler;
    private final long idleWorkerKeepAliveNs;
    private final int maxPoolSize;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String schedulerName;

    public SchedulerCoroutineDispatcher() {
            r8 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 15
            r7 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
    }

    public SchedulerCoroutineDispatcher(int r1, int r2, long r3, @org.jetbrains.annotations.NotNull java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.corePoolSize = r1
            r0.maxPoolSize = r2
            r0.idleWorkerKeepAliveNs = r3
            r0.schedulerName = r5
            kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r0.createScheduler()
            r0.coroutineScheduler = r1
            return
    }

    public /* synthetic */ SchedulerCoroutineDispatcher(int r4, int r5, long r6, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            int r4 = kotlinx.coroutines.scheduling.TasksKt.CORE_POOL_SIZE
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            int r5 = kotlinx.coroutines.scheduling.TasksKt.MAX_POOL_SIZE
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            long r6 = kotlinx.coroutines.scheduling.TasksKt.IDLE_WORKER_KEEP_ALIVE_NS
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.lang.String r8 = "CoroutineScheduler"
        L1a:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r10)
            return
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler createScheduler() {
            r7 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r6 = new kotlinx.coroutines.scheduling.CoroutineScheduler
            int r1 = r7.corePoolSize
            int r2 = r7.maxPoolSize
            long r3 = r7.idleWorkerKeepAliveNs
            java.lang.String r5 = r7.schedulerName
            r0 = r6
            r0.<init>(r1, r2, r3, r5)
            return r6
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.coroutineScheduler
            r0.close()
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo1866dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r7, @org.jetbrains.annotations.NotNull java.lang.Runnable r8) {
            r6 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r6.coroutineScheduler
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r1 = r8
            kotlinx.coroutines.scheduling.CoroutineScheduler.dispatch$default(r0, r1, r2, r3, r4, r5)
            return
    }

    public final void dispatchWithContext$kotlinx_coroutines_core(@org.jetbrains.annotations.NotNull java.lang.Runnable r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.TaskContext r3, boolean r4) {
            r1 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.coroutineScheduler
            r0.dispatch(r2, r3, r4)
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r7, @org.jetbrains.annotations.NotNull java.lang.Runnable r8) {
            r6 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r6.coroutineScheduler
            r2 = 0
            r3 = 1
            r4 = 2
            r5 = 0
            r1 = r8
            kotlinx.coroutines.scheduling.CoroutineScheduler.dispatch$default(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @org.jetbrains.annotations.NotNull
    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.coroutineScheduler
            return r0
    }

    public final void restore$kotlinx_coroutines_core() {
            r0 = this;
            r0.usePrivateScheduler$kotlinx_coroutines_core()
            return
    }

    public final synchronized void shutdown$kotlinx_coroutines_core(long r2) {
            r1 = this;
            monitor-enter(r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.coroutineScheduler     // Catch: java.lang.Throwable -> L8
            r0.shutdown(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void usePrivateScheduler$kotlinx_coroutines_core() {
            r3 = this;
            monitor-enter(r3)
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r3.coroutineScheduler     // Catch: java.lang.Throwable -> L10
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.shutdown(r1)     // Catch: java.lang.Throwable -> L10
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r3.createScheduler()     // Catch: java.lang.Throwable -> L10
            r3.coroutineScheduler = r0     // Catch: java.lang.Throwable -> L10
            monitor-exit(r3)
            return
        L10:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }
}
