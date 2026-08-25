package kotlinx.coroutines;

/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b1\u0010\u0017J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0014\u0010\f\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u000f\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u000eR\u0014\u0010\u001c\u001a\u00020\u001b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001e\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010\u0017R\u0014\u0010%\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010&R\u0016\u0010+\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0014\u00100\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-¨\u00062"}, d2 = {"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopImplBase;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "shutdownError", "Ljava/lang/Thread;", "createThreadSync", "", "notifyStartup", "acknowledgeShutdownIfNeeded", "task", "enqueue", "shutdown", "", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnTimeout", "run", "ensureStarted$kotlinx_coroutines_core", "()V", "ensureStarted", "timeout", "shutdownForTests", "", "THREAD_NAME", "Ljava/lang/String;", "DEFAULT_KEEP_ALIVE_MS", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "FRESH", "I", "ACTIVE", "SHUTDOWN_REQ", "SHUTDOWN_ACK", "SHUTDOWN", "debugStatus", "isShutDown", "()Z", "isShutdownRequested", "isThreadPresent$kotlinx_coroutines_core", "isThreadPresent", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class DefaultExecutor extends kotlinx.coroutines.EventLoopImplBase implements java.lang.Runnable {
    private static final int ACTIVE = 1;
    private static final long DEFAULT_KEEP_ALIVE_MS = 1000;
    private static final int FRESH = 0;

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.DefaultExecutor INSTANCE = null;
    private static final long KEEP_ALIVE_NANOS = 0;
    private static final int SHUTDOWN = 4;
    private static final int SHUTDOWN_ACK = 3;
    private static final int SHUTDOWN_REQ = 2;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String THREAD_NAME = "kotlinx.coroutines.DefaultExecutor";

    @org.jetbrains.annotations.Nullable
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;

    static {
            kotlinx.coroutines.DefaultExecutor r0 = new kotlinx.coroutines.DefaultExecutor
            r0.<init>()
            kotlinx.coroutines.DefaultExecutor.INSTANCE = r0
            r1 = 0
            r2 = 1
            r3 = 0
            kotlinx.coroutines.EventLoop.incrementUseCount$default(r0, r1, r2, r3)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r3 = "kotlinx.coroutines.DefaultExecutor.keepAlive"
            java.lang.Long r1 = java.lang.Long.getLong(r3, r1)     // Catch: java.lang.SecurityException -> L18
            goto L1c
        L18:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L1c:
            long r1 = r1.longValue()
            long r0 = r0.toNanos(r1)
            kotlinx.coroutines.DefaultExecutor.KEEP_ALIVE_NANOS = r0
            return
    }

    private DefaultExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    private final synchronized void acknowledgeShutdownIfNeeded() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isShutdownRequested()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L9
            monitor-exit(r1)
            return
        L9:
            r0 = 3
            kotlinx.coroutines.DefaultExecutor.debugStatus = r0     // Catch: java.lang.Throwable -> L14
            r1.resetAll()     // Catch: java.lang.Throwable -> L14
            r1.notifyAll()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return
        L14:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    private final synchronized java.lang.Thread createThreadSync() {
            r2 = this;
            monitor-enter(r2)
            java.lang.Thread r0 = kotlinx.coroutines.DefaultExecutor._thread     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L15
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "kotlinx.coroutines.DefaultExecutor"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L17
            kotlinx.coroutines.DefaultExecutor._thread = r0     // Catch: java.lang.Throwable -> L17
            r1 = 1
            r0.setDaemon(r1)     // Catch: java.lang.Throwable -> L17
            r0.start()     // Catch: java.lang.Throwable -> L17
        L15:
            monitor-exit(r2)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    private static /* synthetic */ void get_thread$annotations() {
            return
    }

    private final boolean isShutDown() {
            r2 = this;
            int r0 = kotlinx.coroutines.DefaultExecutor.debugStatus
            r1 = 4
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    private final boolean isShutdownRequested() {
            r2 = this;
            int r0 = kotlinx.coroutines.DefaultExecutor.debugStatus
            r1 = 2
            if (r0 == r1) goto Lb
            r1 = 3
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    private final synchronized boolean notifyStartup() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isShutdownRequested()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto La
            r0 = 0
            monitor-exit(r1)
            return r0
        La:
            r0 = 1
            kotlinx.coroutines.DefaultExecutor.debugStatus = r0     // Catch: java.lang.Throwable -> L12
            r1.notifyAll()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    private final void shutdownError() {
            r2 = this;
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r1 = "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    public void enqueue(@org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.isShutDown()
            if (r0 == 0) goto L9
            r1.shutdownError()
        L9:
            super.enqueue(r2)
            return
    }

    public final synchronized void ensureStarted$kotlinx_coroutines_core() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            kotlinx.coroutines.DefaultExecutor.debugStatus = r0     // Catch: java.lang.Throwable -> L11
            r1.createThreadSync()     // Catch: java.lang.Throwable -> L11
        L7:
            int r0 = kotlinx.coroutines.DefaultExecutor.debugStatus     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto Lf
            r1.wait()     // Catch: java.lang.Throwable -> L11
            goto L7
        Lf:
            monitor-exit(r1)
            return
        L11:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    @org.jetbrains.annotations.NotNull
    public final java.lang.Thread getThread() {
            r1 = this;
            java.lang.Thread r0 = kotlinx.coroutines.DefaultExecutor._thread
            if (r0 != 0) goto L8
            java.lang.Thread r0 = r1.createThreadSync()
        L8:
            return r0
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.Delay
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r3, @org.jetbrains.annotations.NotNull java.lang.Runnable r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r6) {
            r2 = this;
            long r3 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r3)
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 >= 0) goto L32
            kotlinx.coroutines.AbstractTimeSource r6 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r6 != 0) goto L15
            r6 = 0
            goto L1d
        L15:
            long r0 = r6.nanoTime()
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
        L1d:
            if (r6 != 0) goto L24
            long r0 = java.lang.System.nanoTime()
            goto L28
        L24:
            long r0 = r6.longValue()
        L28:
            kotlinx.coroutines.EventLoopImplBase$DelayedRunnableTask r6 = new kotlinx.coroutines.EventLoopImplBase$DelayedRunnableTask
            long r3 = r3 + r0
            r6.<init>(r3, r5)
            r2.schedule(r0, r6)
            goto L34
        L32:
            kotlinx.coroutines.NonDisposableHandle r6 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
        L34:
            return r6
    }

    public final boolean isThreadPresent$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.Thread r0 = kotlinx.coroutines.DefaultExecutor._thread
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    public final void reschedule(long r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.EventLoopImplBase.DelayedTask r3) {
            r0 = this;
            r0.shutdownError()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r12 = this;
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            r0.setEventLoop$kotlinx_coroutines_core(r12)
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto Lc
            goto Lf
        Lc:
            r0.registerTimeLoopThread()
        Lf:
            r0 = 0
            boolean r1 = r12.notifyStartup()     // Catch: java.lang.Throwable -> Lc0
            if (r1 != 0) goto L2f
            kotlinx.coroutines.DefaultExecutor._thread = r0
            r12.acknowledgeShutdownIfNeeded()
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto L22
            goto L25
        L22:
            r0.unregisterTimeLoopThread()
        L25:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L2e
            r12.getThread()
        L2e:
            return
        L2f:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r1
        L35:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> Lc0
            long r5 = r12.processNextEvent()     // Catch: java.lang.Throwable -> Lc0
            r7 = 0
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 != 0) goto L88
            kotlinx.coroutines.AbstractTimeSource r9 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()     // Catch: java.lang.Throwable -> Lc0
            if (r9 != 0) goto L4a
            r9 = r0
            goto L52
        L4a:
            long r9 = r9.nanoTime()     // Catch: java.lang.Throwable -> Lc0
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> Lc0
        L52:
            if (r9 != 0) goto L59
            long r9 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Lc0
            goto L5d
        L59:
            long r9 = r9.longValue()     // Catch: java.lang.Throwable -> Lc0
        L5d:
            int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r11 != 0) goto L64
            long r3 = kotlinx.coroutines.DefaultExecutor.KEEP_ALIVE_NANOS     // Catch: java.lang.Throwable -> Lc0
            long r3 = r3 + r9
        L64:
            long r9 = r3 - r9
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 > 0) goto L83
            kotlinx.coroutines.DefaultExecutor._thread = r0
            r12.acknowledgeShutdownIfNeeded()
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto L76
            goto L79
        L76:
            r0.unregisterTimeLoopThread()
        L79:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L82
            r12.getThread()
        L82:
            return
        L83:
            long r5 = kotlin.ranges.RangesKt.coerceAtMost(r5, r9)     // Catch: java.lang.Throwable -> Lc0
            goto L89
        L88:
            r3 = r1
        L89:
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L35
            boolean r7 = r12.isShutdownRequested()     // Catch: java.lang.Throwable -> Lc0
            if (r7 == 0) goto Lac
            kotlinx.coroutines.DefaultExecutor._thread = r0
            r12.acknowledgeShutdownIfNeeded()
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto L9f
            goto La2
        L9f:
            r0.unregisterTimeLoopThread()
        La2:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto Lab
            r12.getThread()
        Lab:
            return
        Lac:
            kotlinx.coroutines.AbstractTimeSource r7 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()     // Catch: java.lang.Throwable -> Lc0
            if (r7 != 0) goto Lb4
            r7 = r0
            goto Lb9
        Lb4:
            r7.parkNanos(r12, r5)     // Catch: java.lang.Throwable -> Lc0
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lc0
        Lb9:
            if (r7 != 0) goto L35
            java.util.concurrent.locks.LockSupport.parkNanos(r12, r5)     // Catch: java.lang.Throwable -> Lc0
            goto L35
        Lc0:
            r1 = move-exception
            kotlinx.coroutines.DefaultExecutor._thread = r0
            r12.acknowledgeShutdownIfNeeded()
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto Lcd
            goto Ld0
        Lcd:
            r0.unregisterTimeLoopThread()
        Ld0:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto Ld9
            r12.getThread()
        Ld9:
            throw r1
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.EventLoop
    public void shutdown() {
            r1 = this;
            r0 = 4
            kotlinx.coroutines.DefaultExecutor.debugStatus = r0
            super.shutdown()
            return
    }

    public final synchronized void shutdownForTests(long r8) {
            r7 = this;
            monitor-enter(r7)
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L45
            long r0 = r0 + r8
            boolean r2 = r7.isShutdownRequested()     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto Lf
            r2 = 2
            kotlinx.coroutines.DefaultExecutor.debugStatus = r2     // Catch: java.lang.Throwable -> L45
        Lf:
            int r2 = kotlinx.coroutines.DefaultExecutor.debugStatus     // Catch: java.lang.Throwable -> L45
            r3 = 3
            if (r2 == r3) goto L40
            java.lang.Thread r2 = kotlinx.coroutines.DefaultExecutor._thread     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L40
            java.lang.Thread r2 = kotlinx.coroutines.DefaultExecutor._thread     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L1d
            goto L2f
        L1d:
            kotlinx.coroutines.AbstractTimeSource r3 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()     // Catch: java.lang.Throwable -> L45
            if (r3 != 0) goto L25
            r3 = 0
            goto L2a
        L25:
            r3.unpark(r2)     // Catch: java.lang.Throwable -> L45
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L45
        L2a:
            if (r3 != 0) goto L2f
            java.util.concurrent.locks.LockSupport.unpark(r2)     // Catch: java.lang.Throwable -> L45
        L2f:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L45
            long r2 = r0 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L3c
            goto L40
        L3c:
            r7.wait(r8)     // Catch: java.lang.Throwable -> L45
            goto Lf
        L40:
            r8 = 0
            kotlinx.coroutines.DefaultExecutor.debugStatus = r8     // Catch: java.lang.Throwable -> L45
            monitor-exit(r7)
            return
        L45:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }
}
