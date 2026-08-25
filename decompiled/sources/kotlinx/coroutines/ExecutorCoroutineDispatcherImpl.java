package kotlinx.coroutines;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\tH\u0016J\u001c\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J.\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010#*\u00020$2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006%"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcherImpl;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "executor", "Ljava/util/concurrent/Executor;", "(Ljava/util/concurrent/Executor;)V", "getExecutor", "()Ljava/util/concurrent/Executor;", "cancelJobOnRejection", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "Ljava/util/concurrent/RejectedExecutionException;", "close", "dispatch", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "equals", "", "other", "", "hashCode", "", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "", "scheduleBlock", "Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ExecutorCoroutineDispatcherImpl extends kotlinx.coroutines.ExecutorCoroutineDispatcher implements kotlinx.coroutines.Delay {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.Executor executor;

    public ExecutorCoroutineDispatcherImpl(@org.jetbrains.annotations.NotNull java.util.concurrent.Executor r1) {
            r0 = this;
            r0.<init>()
            r0.executor = r1
            java.util.concurrent.Executor r1 = r0.getExecutor()
            kotlinx.coroutines.internal.ConcurrentKt.removeFutureOnCancel(r1)
            return
    }

    private final void cancelJobOnRejection(kotlin.coroutines.CoroutineContext r2, java.util.concurrent.RejectedExecutionException r3) {
            r1 = this;
            java.lang.String r0 = "The task was rejected"
            java.util.concurrent.CancellationException r3 = kotlinx.coroutines.ExceptionsKt.CancellationException(r0, r3)
            kotlinx.coroutines.JobKt.cancel(r2, r3)
            return
    }

    private final java.util.concurrent.ScheduledFuture<?> scheduleBlock(java.util.concurrent.ScheduledExecutorService r2, java.lang.Runnable r3, kotlin.coroutines.CoroutineContext r4, long r5) {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.RejectedExecutionException -> L7
            java.util.concurrent.ScheduledFuture r2 = r2.schedule(r3, r5, r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L7
            goto Lc
        L7:
            r2 = move-exception
            r1.cancelJobOnRejection(r4, r2)
            r2 = 0
        Lc:
            return r2
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.getExecutor()
            boolean r1 = r0 instanceof java.util.concurrent.ExecutorService
            if (r1 == 0) goto Lb
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto Lf
            goto L12
        Lf:
            r0.shutdown()
        L12:
            return
    }

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @org.jetbrains.annotations.Nullable
    public java.lang.Object delay(long r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r0 = this;
            java.lang.Object r1 = kotlinx.coroutines.Delay.DefaultImpls.delay(r0, r1, r3)
            return r1
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo1866dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3, @org.jetbrains.annotations.NotNull java.lang.Runnable r4) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.getExecutor()     // Catch: java.util.concurrent.RejectedExecutionException -> L16
            kotlinx.coroutines.AbstractTimeSource r1 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()     // Catch: java.util.concurrent.RejectedExecutionException -> L16
            if (r1 != 0) goto Lb
            goto L11
        Lb:
            java.lang.Runnable r1 = r1.wrapTask(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L16
            if (r1 != 0) goto L12
        L11:
            r1 = r4
        L12:
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L16
            goto L2b
        L16:
            r0 = move-exception
            kotlinx.coroutines.AbstractTimeSource r1 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r1 != 0) goto L1e
            goto L21
        L1e:
            r1.unTrackTask()
        L21:
            r2.cancelJobOnRejection(r3, r0)
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getIO()
            r0.mo1866dispatch(r3, r4)
        L2b:
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.ExecutorCoroutineDispatcherImpl
            if (r0 == 0) goto L12
            kotlinx.coroutines.ExecutorCoroutineDispatcherImpl r2 = (kotlinx.coroutines.ExecutorCoroutineDispatcherImpl) r2
            java.util.concurrent.Executor r2 = r2.getExecutor()
            java.util.concurrent.Executor r0 = r1.getExecutor()
            if (r2 != r0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @org.jetbrains.annotations.NotNull
    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.executor
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.getExecutor()
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // kotlinx.coroutines.Delay
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r10, @org.jetbrains.annotations.NotNull java.lang.Runnable r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r13) {
            r9 = this;
            java.util.concurrent.Executor r0 = r9.getExecutor()
            boolean r1 = r0 instanceof java.util.concurrent.ScheduledExecutorService
            r2 = 0
            if (r1 == 0) goto Ld
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            r4 = r0
            goto Le
        Ld:
            r4 = r2
        Le:
            if (r4 != 0) goto L11
            goto L19
        L11:
            r3 = r9
            r5 = r12
            r6 = r13
            r7 = r10
            java.util.concurrent.ScheduledFuture r2 = r3.scheduleBlock(r4, r5, r6, r7)
        L19:
            if (r2 == 0) goto L21
            kotlinx.coroutines.DisposableFutureHandle r10 = new kotlinx.coroutines.DisposableFutureHandle
            r10.<init>(r2)
            goto L27
        L21:
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            kotlinx.coroutines.DisposableHandle r10 = r0.invokeOnTimeout(r10, r12, r13)
        L27:
            return r10
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo1867scheduleResumeAfterDelay(long r10, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r12) {
            r9 = this;
            java.util.concurrent.Executor r0 = r9.getExecutor()
            boolean r1 = r0 instanceof java.util.concurrent.ScheduledExecutorService
            r2 = 0
            if (r1 == 0) goto Ld
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            r4 = r0
            goto Le
        Ld:
            r4 = r2
        Le:
            if (r4 != 0) goto L11
            goto L20
        L11:
            kotlinx.coroutines.ResumeUndispatchedRunnable r5 = new kotlinx.coroutines.ResumeUndispatchedRunnable
            r5.<init>(r9, r12)
            kotlin.coroutines.CoroutineContext r6 = r12.getContext()
            r3 = r9
            r7 = r10
            java.util.concurrent.ScheduledFuture r2 = r3.scheduleBlock(r4, r5, r6, r7)
        L20:
            if (r2 == 0) goto L26
            kotlinx.coroutines.JobKt.cancelFutureOnCancellation(r12, r2)
            return
        L26:
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            r0.mo1867scheduleResumeAfterDelay(r10, r12)
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.getExecutor()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
