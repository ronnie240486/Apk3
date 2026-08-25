package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\r\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/scheduling/DefaultScheduler;", "Lkotlinx/coroutines/scheduling/SchedulerCoroutineDispatcher;", "()V", "close", "", "shutdown", "shutdown$kotlinx_coroutines_core", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DefaultScheduler extends kotlinx.coroutines.scheduling.SchedulerCoroutineDispatcher {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.scheduling.DefaultScheduler INSTANCE = null;

    static {
            kotlinx.coroutines.scheduling.DefaultScheduler r0 = new kotlinx.coroutines.scheduling.DefaultScheduler
            r0.<init>()
            kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE = r0
            return
    }

    private DefaultScheduler() {
            r6 = this;
            int r1 = kotlinx.coroutines.scheduling.TasksKt.CORE_POOL_SIZE
            int r2 = kotlinx.coroutines.scheduling.TasksKt.MAX_POOL_SIZE
            long r3 = kotlinx.coroutines.scheduling.TasksKt.IDLE_WORKER_KEEP_ALIVE_NS
            java.lang.String r5 = "DefaultDispatcher"
            r0 = r6
            r0.<init>(r1, r2, r3, r5)
            return
    }

    @Override // kotlinx.coroutines.scheduling.SchedulerCoroutineDispatcher, kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Dispatchers.Default cannot be closed"
            r0.<init>(r1)
            throw r0
    }

    public final void shutdown$kotlinx_coroutines_core() {
            r0 = this;
            super.close()
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.Default"
            return r0
    }
}
