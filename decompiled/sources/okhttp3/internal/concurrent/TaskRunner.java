package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: TaskRunner.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 #2\u00020\u0001:\u0003\"#$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0002J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u001c\u001a\u00020\u0016J\u0015\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001fJ\u0006\u0010 \u001a\u00020\tJ\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "", "backend", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "(Lokhttp3/internal/concurrent/TaskRunner$Backend;)V", "getBackend", "()Lokhttp3/internal/concurrent/TaskRunner$Backend;", "busyQueues", "", "Lokhttp3/internal/concurrent/TaskQueue;", "coordinatorWaiting", "", "coordinatorWakeUpAt", "", "nextQueueName", "", "readyQueues", "runnable", "Ljava/lang/Runnable;", "activeQueues", "", "afterRun", "", "task", "Lokhttp3/internal/concurrent/Task;", "delayNanos", "awaitTaskToRun", "beforeRun", "cancelAll", "kickCoordinator", "taskQueue", "kickCoordinator$okhttp", "newQueue", "runTask", "Backend", "Companion", "RealBackend", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class TaskRunner {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.concurrent.TaskRunner.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.concurrent.TaskRunner INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.logging.Logger logger = null;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.concurrent.TaskRunner.Backend backend;
    private final java.util.List<okhttp3.internal.concurrent.TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int nextQueueName;
    private final java.util.List<okhttp3.internal.concurrent.TaskQueue> readyQueues;
    private final java.lang.Runnable runnable;

    /* JADX INFO: compiled from: TaskRunner.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\tH&¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "beforeTask", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "coordinatorNotify", "coordinatorWait", "nanos", "", "execute", "runnable", "Ljava/lang/Runnable;", "nanoTime", "okhttp"}, k = 1, mv = {1, 4, 1})
    public interface Backend {
        void beforeTask(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r1);

        void coordinatorNotify(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r1);

        void coordinatorWait(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r1, long r2);

        void execute(@org.jetbrains.annotations.NotNull java.lang.Runnable r1);

        long nanoTime();
    }

    /* JADX INFO: compiled from: TaskRunner.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "()V", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.logging.Logger getLogger() {
                r1 = this;
                java.util.logging.Logger r0 = okhttp3.internal.concurrent.TaskRunner.access$getLogger$cp()
                return r0
        }
    }

    /* JADX INFO: compiled from: TaskRunner.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u0006\u0010\u0013\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "(Ljava/util/concurrent/ThreadFactory;)V", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;", "beforeTask", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "coordinatorNotify", "coordinatorWait", "nanos", "", "execute", "runnable", "Ljava/lang/Runnable;", "nanoTime", "shutdown", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class RealBackend implements okhttp3.internal.concurrent.TaskRunner.Backend {
        private final java.util.concurrent.ThreadPoolExecutor executor;

        public RealBackend(@org.jetbrains.annotations.NotNull java.util.concurrent.ThreadFactory r10) {
                r9 = this;
                java.lang.String r0 = "threadFactory"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                r9.<init>()
                java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
                java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue
                r7.<init>()
                r2 = 0
                r3 = 2147483647(0x7fffffff, float:NaN)
                r4 = 60
                r1 = r0
                r8 = r10
                r1.<init>(r2, r3, r4, r6, r7, r8)
                r9.executor = r0
                return
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void beforeTask(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r2) {
                r1 = this;
                java.lang.String r0 = "taskRunner"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                return
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorNotify(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r2) {
                r1 = this;
                java.lang.String r0 = "taskRunner"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r2.notify()
                return
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorWait(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r8, long r9) throws java.lang.InterruptedException {
                r7 = this;
                java.lang.String r0 = "taskRunner"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                r0 = 1000000(0xf4240, double:4.940656E-318)
                long r2 = r9 / r0
                long r0 = r0 * r2
                long r0 = r9 - r0
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L19
                int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r6 <= 0) goto L1d
            L19:
                int r9 = (int) r0
                r8.wait(r2, r9)
            L1d:
                return
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(@org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
                r1 = this;
                java.lang.String r0 = "runnable"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.util.concurrent.ThreadPoolExecutor r0 = r1.executor
                r0.execute(r2)
                return
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long nanoTime() {
                r2 = this;
                long r0 = java.lang.System.nanoTime()
                return r0
        }

        public final void shutdown() {
                r1 = this;
                java.util.concurrent.ThreadPoolExecutor r0 = r1.executor
                r0.shutdown()
                return
        }
    }

    static {
            okhttp3.internal.concurrent.TaskRunner$Companion r0 = new okhttp3.internal.concurrent.TaskRunner$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.concurrent.TaskRunner.Companion = r0
            okhttp3.internal.concurrent.TaskRunner r0 = new okhttp3.internal.concurrent.TaskRunner
            okhttp3.internal.concurrent.TaskRunner$RealBackend r1 = new okhttp3.internal.concurrent.TaskRunner$RealBackend
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = okhttp3.internal.Util.okHttpName
            r2.append(r3)
            java.lang.String r3 = " TaskRunner"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1
            java.util.concurrent.ThreadFactory r2 = okhttp3.internal.Util.threadFactory(r2, r3)
            r1.<init>(r2)
            r0.<init>(r1)
            okhttp3.internal.concurrent.TaskRunner.INSTANCE = r0
            java.lang.Class<okhttp3.internal.concurrent.TaskRunner> r0 = okhttp3.internal.concurrent.TaskRunner.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            java.lang.String r1 = "Logger.getLogger(TaskRunner::class.java.name)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            okhttp3.internal.concurrent.TaskRunner.logger = r0
            return
    }

    public TaskRunner(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner.Backend r2) {
            r1 = this;
            java.lang.String r0 = "backend"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.backend = r2
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.nextQueueName = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.busyQueues = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.readyQueues = r2
            okhttp3.internal.concurrent.TaskRunner$runnable$1 r2 = new okhttp3.internal.concurrent.TaskRunner$runnable$1
            r2.<init>(r1)
            r1.runnable = r2
            return
    }

    public static final /* synthetic */ java.util.logging.Logger access$getLogger$cp() {
            java.util.logging.Logger r0 = okhttp3.internal.concurrent.TaskRunner.logger
            return r0
    }

    public static final /* synthetic */ void access$runTask(okhttp3.internal.concurrent.TaskRunner r0, okhttp3.internal.concurrent.Task r1) {
            r0.runTask(r1)
            return
    }

    private final void afterRun(okhttp3.internal.concurrent.Task r7, long r8) {
            r6 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L33
            boolean r0 = java.lang.Thread.holdsLock(r6)
            if (r0 == 0) goto Lb
            goto L33
        Lb:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "Thread "
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8)
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r0 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            java.lang.String r9 = r9.getName()
            r8.append(r9)
            java.lang.String r9 = " MUST hold lock on "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L33:
            okhttp3.internal.concurrent.TaskQueue r0 = r7.getQueue$okhttp()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okhttp3.internal.concurrent.Task r1 = r0.getActiveTask$okhttp()
            r2 = 0
            r3 = 1
            if (r1 != r7) goto L44
            r1 = 1
            goto L45
        L44:
            r1 = 0
        L45:
            if (r1 == 0) goto L79
            boolean r1 = r0.getCancelActiveTask$okhttp()
            r0.setCancelActiveTask$okhttp(r2)
            r2 = 0
            r0.setActiveTask$okhttp(r2)
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r2 = r6.busyQueues
            r2.remove(r0)
            r4 = -1
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 == 0) goto L68
            if (r1 != 0) goto L68
            boolean r1 = r0.getShutdown$okhttp()
            if (r1 != 0) goto L68
            r0.scheduleAndDecide$okhttp(r7, r8, r3)
        L68:
            java.util.List r7 = r0.getFutureTasks$okhttp()
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r3
            if (r7 == 0) goto L78
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r7 = r6.readyQueues
            r7.add(r0)
        L78:
            return
        L79:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Check failed."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    private final void beforeRun(okhttp3.internal.concurrent.Task r4) {
            r3 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L33
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 == 0) goto Lb
            goto L33
        Lb:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r0 = "Thread "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r2 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " MUST hold lock on "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L33:
            r0 = -1
            r4.setNextExecuteNanoTime$okhttp(r0)
            okhttp3.internal.concurrent.TaskQueue r0 = r4.getQueue$okhttp()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.util.List r1 = r0.getFutureTasks$okhttp()
            r1.remove(r4)
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r3.readyQueues
            r1.remove(r0)
            r0.setActiveTask$okhttp(r4)
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r4 = r3.busyQueues
            r4.add(r0)
            return
    }

    private final void runTask(okhttp3.internal.concurrent.Task r6) {
            r5 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L33
            boolean r0 = java.lang.Thread.holdsLock(r5)
            if (r0 != 0) goto Lb
            goto L33
        Lb:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r0 = "Thread "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r2 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " MUST NOT hold lock on "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L33:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "currentThread"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = r6.getName()
            r0.setName(r2)
            r2 = -1
            long r2 = r6.runOnce()     // Catch: java.lang.Throwable -> L5b
            monitor-enter(r5)
            r5.afterRun(r6, r2)     // Catch: java.lang.Throwable -> L58
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L58
            monitor-exit(r5)
            r0.setName(r1)
            return
        L58:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L5b:
            r4 = move-exception
            monitor-enter(r5)
            r5.afterRun(r6, r2)     // Catch: java.lang.Throwable -> L67
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L67
            monitor-exit(r5)
            r0.setName(r1)
            throw r4
        L67:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<okhttp3.internal.concurrent.TaskQueue> activeQueues() {
            r2 = this;
            monitor-enter(r2)
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r2.busyQueues     // Catch: java.lang.Throwable -> Lb
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r2.readyQueues     // Catch: java.lang.Throwable -> Lb
            java.util.List r0 = kotlin.collections.CollectionsKt.plus(r0, r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.concurrent.Task awaitTaskToRun() {
            r15 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L33
            boolean r0 = java.lang.Thread.holdsLock(r15)
            if (r0 == 0) goto Lb
            goto L33
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Thread "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r3 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L33:
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r15.readyQueues
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L3d
            return r1
        L3d:
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r15.backend
            long r2 = r0.nanoTime()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r15.readyQueues
            java.util.Iterator r0 = r0.iterator()
            r6 = r1
        L4f:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L81
            java.lang.Object r7 = r0.next()
            okhttp3.internal.concurrent.TaskQueue r7 = (okhttp3.internal.concurrent.TaskQueue) r7
            java.util.List r7 = r7.getFutureTasks$okhttp()
            java.lang.Object r7 = r7.get(r9)
            okhttp3.internal.concurrent.Task r7 = (okhttp3.internal.concurrent.Task) r7
            long r10 = r7.getNextExecuteNanoTime$okhttp()
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L7b
            long r4 = java.lang.Math.min(r10, r4)
            goto L4f
        L7b:
            if (r6 == 0) goto L7f
            r0 = 1
            goto L82
        L7f:
            r6 = r7
            goto L4f
        L81:
            r0 = 0
        L82:
            if (r6 == 0) goto L9e
            r15.beforeRun(r6)
            if (r0 != 0) goto L96
            boolean r0 = r15.coordinatorWaiting
            if (r0 != 0) goto L9d
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r15.readyQueues
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L9d
        L96:
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r15.backend
            java.lang.Runnable r1 = r15.runnable
            r0.execute(r1)
        L9d:
            return r6
        L9e:
            boolean r0 = r15.coordinatorWaiting
            if (r0 == 0) goto Laf
            long r6 = r15.coordinatorWakeUpAt
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lae
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r15.backend
            r0.coordinatorNotify(r15)
        Lae:
            return r1
        Laf:
            r15.coordinatorWaiting = r8
            long r2 = r2 + r4
            r15.coordinatorWakeUpAt = r2
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r15.backend     // Catch: java.lang.Throwable -> Lba java.lang.InterruptedException -> Lbc
            r0.coordinatorWait(r15, r4)     // Catch: java.lang.Throwable -> Lba java.lang.InterruptedException -> Lbc
            goto Lbf
        Lba:
            r0 = move-exception
            goto Lc3
        Lbc:
            r15.cancelAll()     // Catch: java.lang.Throwable -> Lba
        Lbf:
            r15.coordinatorWaiting = r9
            goto L33
        Lc3:
            r15.coordinatorWaiting = r9
            throw r0
    }

    public final void cancelAll() {
            r2 = this;
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r2.busyQueues
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r2.busyQueues
            java.lang.Object r1 = r1.get(r0)
            okhttp3.internal.concurrent.TaskQueue r1 = (okhttp3.internal.concurrent.TaskQueue) r1
            r1.cancelAllAndDecide$okhttp()
            int r0 = r0 + (-1)
            goto L8
        L18:
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r2.readyQueues
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L20:
            if (r0 < 0) goto L3f
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r2.readyQueues
            java.lang.Object r1 = r1.get(r0)
            okhttp3.internal.concurrent.TaskQueue r1 = (okhttp3.internal.concurrent.TaskQueue) r1
            r1.cancelAllAndDecide$okhttp()
            java.util.List r1 = r1.getFutureTasks$okhttp()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3c
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r2.readyQueues
            r1.remove(r0)
        L3c:
            int r0 = r0 + (-1)
            goto L20
        L3f:
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.concurrent.TaskRunner.Backend getBackend() {
            r1 = this;
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r1.backend
            return r0
    }

    public final void kickCoordinator$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskQueue r4) {
            r3 = this;
            java.lang.String r0 = "taskQueue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L39
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 == 0) goto L11
            goto L39
        L11:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r0 = "Thread "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r2 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " MUST hold lock on "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L39:
            okhttp3.internal.concurrent.Task r0 = r4.getActiveTask$okhttp()
            if (r0 != 0) goto L56
            java.util.List r0 = r4.getFutureTasks$okhttp()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L51
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r3.readyQueues
            okhttp3.internal.Util.addIfAbsent(r0, r4)
            goto L56
        L51:
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r3.readyQueues
            r0.remove(r4)
        L56:
            boolean r4 = r3.coordinatorWaiting
            if (r4 == 0) goto L60
            okhttp3.internal.concurrent.TaskRunner$Backend r4 = r3.backend
            r4.coordinatorNotify(r3)
            goto L67
        L60:
            okhttp3.internal.concurrent.TaskRunner$Backend r4 = r3.backend
            java.lang.Runnable r0 = r3.runnable
            r4.execute(r0)
        L67:
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.concurrent.TaskQueue newQueue() {
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.nextQueueName     // Catch: java.lang.Throwable -> L1f
            int r1 = r0 + 1
            r4.nextQueueName = r1     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r4)
            okhttp3.internal.concurrent.TaskQueue r1 = new okhttp3.internal.concurrent.TaskQueue
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 81
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r4, r0)
            return r1
        L1f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }
}
