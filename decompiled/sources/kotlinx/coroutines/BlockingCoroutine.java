package kotlinx.coroutines;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/BlockingCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "joinBlocking", "()Ljava/lang/Object;", "Ljava/lang/Thread;", "blockedThread", "Ljava/lang/Thread;", "Lkotlinx/coroutines/EventLoop;", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/EventLoop;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
final class BlockingCoroutine<T> extends kotlinx.coroutines.AbstractCoroutine<T> {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Thread blockedThread;

    @org.jetbrains.annotations.Nullable
    private final kotlinx.coroutines.EventLoop eventLoop;

    public BlockingCoroutine(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2, @org.jetbrains.annotations.NotNull java.lang.Thread r3, @org.jetbrains.annotations.Nullable kotlinx.coroutines.EventLoop r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r0)
            r1.blockedThread = r3
            r1.eventLoop = r4
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void afterCompletion(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.Thread r0 = r1.blockedThread
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r2 != 0) goto L20
            java.lang.Thread r2 = r1.blockedThread
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto L16
            r0 = 0
            goto L1b
        L16:
            r0.unpark(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L1b:
            if (r0 != 0) goto L20
            java.util.concurrent.locks.LockSupport.unpark(r2)
        L20:
            return
    }

    public final T joinBlocking() {
            r6 = this;
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto L7
            goto La
        L7:
            r0.registerTimeLoopThread()
        La:
            kotlinx.coroutines.EventLoop r0 = r6.eventLoop     // Catch: java.lang.Throwable -> L7c
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L12
            goto L15
        L12:
            kotlinx.coroutines.EventLoop.incrementUseCount$default(r0, r2, r1, r3)     // Catch: java.lang.Throwable -> L7c
        L15:
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L69
            kotlinx.coroutines.EventLoop r0 = r6.eventLoop     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L25
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L29
        L25:
            long r4 = r0.processNextEvent()     // Catch: java.lang.Throwable -> L72
        L29:
            boolean r0 = r6.isCompleted()     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L56
            kotlinx.coroutines.EventLoop r0 = r6.eventLoop     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L34
            goto L37
        L34:
            kotlinx.coroutines.EventLoop.decrementUseCount$default(r0, r2, r1, r3)     // Catch: java.lang.Throwable -> L7c
        L37:
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto L3e
            goto L41
        L3e:
            r0.unregisterTimeLoopThread()
        L41:
            java.lang.Object r0 = r6.getState$kotlinx_coroutines_core()
            java.lang.Object r0 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L50
            r3 = r0
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
        L50:
            if (r3 != 0) goto L53
            return r0
        L53:
            java.lang.Throwable r0 = r3.cause
            throw r0
        L56:
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L5e
            r0 = r3
            goto L63
        L5e:
            r0.parkNanos(r6, r4)     // Catch: java.lang.Throwable -> L72
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L72
        L63:
            if (r0 != 0) goto L15
            java.util.concurrent.locks.LockSupport.parkNanos(r6, r4)     // Catch: java.lang.Throwable -> L72
            goto L15
        L69:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L72
            r0.<init>()     // Catch: java.lang.Throwable -> L72
            r6.cancelCoroutine(r0)     // Catch: java.lang.Throwable -> L72
            throw r0     // Catch: java.lang.Throwable -> L72
        L72:
            r0 = move-exception
            kotlinx.coroutines.EventLoop r4 = r6.eventLoop     // Catch: java.lang.Throwable -> L7c
            if (r4 != 0) goto L78
            goto L7b
        L78:
            kotlinx.coroutines.EventLoop.decrementUseCount$default(r4, r2, r1, r3)     // Catch: java.lang.Throwable -> L7c
        L7b:
            throw r0     // Catch: java.lang.Throwable -> L7c
        L7c:
            r0 = move-exception
            kotlinx.coroutines.AbstractTimeSource r1 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r1 != 0) goto L84
            goto L87
        L84:
            r1.unregisterTimeLoopThread()
        L87:
            throw r0
    }
}
