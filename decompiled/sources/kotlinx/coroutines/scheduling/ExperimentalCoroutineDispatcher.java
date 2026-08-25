package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001b\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0002J\u001c\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dH\u0016J)\u0010\u001e\u001a\u00020\u00162\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001d2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b\"J\u001c\u0010#\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dH\u0016J\u000e\u0010$\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003J\b\u0010%\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "corePoolSize", "", "maxPoolSize", "schedulerName", "", "(IILjava/lang/String;)V", "(II)V", "idleWorkerKeepAliveNs", "", "(IIJLjava/lang/String;)V", "coroutineScheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "blocking", "Lkotlinx/coroutines/CoroutineDispatcher;", "parallelism", "close", "", "createScheduler", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchWithContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "tailDispatch", "", "dispatchWithContext$kotlinx_coroutines_core", "dispatchYield", "limited", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@kotlin.PublishedApi
public class ExperimentalCoroutineDispatcher extends kotlinx.coroutines.ExecutorCoroutineDispatcher {
    private final int corePoolSize;

    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler;
    private final long idleWorkerKeepAliveNs;
    private final int maxPoolSize;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String schedulerName;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ ExperimentalCoroutineDispatcher(int r9, int r10) {
            r8 = this;
            long r3 = kotlinx.coroutines.scheduling.TasksKt.IDLE_WORKER_KEEP_ALIVE_NS
            r5 = 0
            r6 = 8
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
    }

    public /* synthetic */ ExperimentalCoroutineDispatcher(int r1, int r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L6
            int r1 = kotlinx.coroutines.scheduling.TasksKt.CORE_POOL_SIZE
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            int r2 = kotlinx.coroutines.scheduling.TasksKt.MAX_POOL_SIZE
        Lc:
            r0.<init>(r1, r2)
            return
    }

    public ExperimentalCoroutineDispatcher(int r1, int r2, long r3, @org.jetbrains.annotations.NotNull java.lang.String r5) {
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

    public /* synthetic */ ExperimentalCoroutineDispatcher(int r7, int r8, long r9, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            r6 = this;
            r12 = r12 & 8
            if (r12 == 0) goto L6
            java.lang.String r11 = "CoroutineScheduler"
        L6:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public ExperimentalCoroutineDispatcher(int r7, int r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            r6 = this;
            long r3 = kotlinx.coroutines.scheduling.TasksKt.IDLE_WORKER_KEEP_ALIVE_NS
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public /* synthetic */ ExperimentalCoroutineDispatcher(int r1, int r2, java.lang.String r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L6
            int r1 = kotlinx.coroutines.scheduling.TasksKt.CORE_POOL_SIZE
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            int r2 = kotlinx.coroutines.scheduling.TasksKt.MAX_POOL_SIZE
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.lang.String r3 = "DefaultDispatcher"
        L12:
            r0.<init>(r1, r2, r3)
            return
    }

    public static /* synthetic */ kotlinx.coroutines.CoroutineDispatcher blocking$default(kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher r0, int r1, int r2, java.lang.Object r3) {
            if (r3 != 0) goto Ld
            r2 = r2 & 1
            if (r2 == 0) goto L8
            r1 = 16
        L8:
            kotlinx.coroutines.CoroutineDispatcher r0 = r0.blocking(r1)
            return r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: blocking"
            r0.<init>(r1)
            throw r0
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

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineDispatcher blocking(int r4) {
            r3 = this;
            r0 = 1
            if (r4 <= 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            if (r1 == 0) goto Lf
            kotlinx.coroutines.scheduling.LimitingDispatcher r1 = new kotlinx.coroutines.scheduling.LimitingDispatcher
            r2 = 0
            r1.<init>(r3, r4, r2, r0)
            return r1
        Lf:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "Expected positive parallelism level, but have "
            java.lang.String r4 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
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
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r6.coroutineScheduler     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r1 = r8
            kotlinx.coroutines.scheduling.CoroutineScheduler.dispatch$default(r0, r1, r2, r3, r4, r5)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            goto L10
        Lb:
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            r0.mo1866dispatch(r7, r8)
        L10:
            return
    }

    public final void dispatchWithContext$kotlinx_coroutines_core(@org.jetbrains.annotations.NotNull java.lang.Runnable r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.TaskContext r3, boolean r4) {
            r1 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.coroutineScheduler     // Catch: java.util.concurrent.RejectedExecutionException -> L6
            r0.dispatch(r2, r3, r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L6
            goto L11
        L6:
            kotlinx.coroutines.DefaultExecutor r4 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.coroutineScheduler
            kotlinx.coroutines.scheduling.Task r2 = r0.createTask(r2, r3)
            r4.enqueue(r2)
        L11:
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r7, @org.jetbrains.annotations.NotNull java.lang.Runnable r8) {
            r6 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r6.coroutineScheduler     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            r2 = 0
            r3 = 1
            r4 = 2
            r5 = 0
            r1 = r8
            kotlinx.coroutines.scheduling.CoroutineScheduler.dispatch$default(r0, r1, r2, r3, r4, r5)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            goto L10
        Lb:
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            r0.dispatchYield(r7, r8)
        L10:
            return
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @org.jetbrains.annotations.NotNull
    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.coroutineScheduler
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineDispatcher limited(int r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 <= 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            if (r2 == 0) goto L39
            int r2 = r3.corePoolSize
            if (r4 > r2) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L18
            kotlinx.coroutines.scheduling.LimitingDispatcher r0 = new kotlinx.coroutines.scheduling.LimitingDispatcher
            r2 = 0
            r0.<init>(r3, r4, r2, r1)
            return r0
        L18:
            java.lang.String r0 = "Expected parallelism level lesser than core pool size ("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r3.corePoolSize
            r0.append(r1)
            java.lang.String r1 = "), but have "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L39:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "Expected positive parallelism level, but have "
            java.lang.String r4 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "[scheduler = "
            r0.append(r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r2.coroutineScheduler
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
