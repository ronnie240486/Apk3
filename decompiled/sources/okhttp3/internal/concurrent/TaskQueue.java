package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00013B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010!\u001a\u00020\"J\r\u0010#\u001a\u00020\u000eH\u0000¢\u0006\u0002\b$J8\u0010%\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u000e2\u000e\b\u0004\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0*H\u0086\bø\u0001\u0000J\u0006\u0010+\u001a\u00020,J.\u0010-\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020'2\u000e\b\u0004\u0010)\u001a\b\u0012\u0004\u0012\u00020'0*H\u0086\bø\u0001\u0000J\u0018\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020'J%\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\b2\u0006\u0010&\u001a\u00020'2\u0006\u00100\u001a\u00020\u000eH\u0000¢\u0006\u0002\b1J\u0006\u0010\u001c\u001a\u00020\"J\b\u00102\u001a\u00020\u0005H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "name", "", "(Lokhttp3/internal/concurrent/TaskRunner;Ljava/lang/String;)V", "activeTask", "Lokhttp3/internal/concurrent/Task;", "getActiveTask$okhttp", "()Lokhttp3/internal/concurrent/Task;", "setActiveTask$okhttp", "(Lokhttp3/internal/concurrent/Task;)V", "cancelActiveTask", "", "getCancelActiveTask$okhttp", "()Z", "setCancelActiveTask$okhttp", "(Z)V", "futureTasks", "", "getFutureTasks$okhttp", "()Ljava/util/List;", "getName$okhttp", "()Ljava/lang/String;", "scheduledTasks", "", "getScheduledTasks", "shutdown", "getShutdown$okhttp", "setShutdown$okhttp", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "cancelAll", "", "cancelAllAndDecide", "cancelAllAndDecide$okhttp", "execute", "delayNanos", "", "cancelable", "block", "Lkotlin/Function0;", "idleLatch", "Ljava/util/concurrent/CountDownLatch;", "schedule", "task", "scheduleAndDecide", "recurrence", "scheduleAndDecide$okhttp", "toString", "AwaitIdleTask", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class TaskQueue {

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.concurrent.Task activeTask;
    private boolean cancelActiveTask;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<okhttp3.internal.concurrent.Task> futureTasks;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;
    private boolean shutdown;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;

    /* JADX INFO: compiled from: TaskQueue.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue$AwaitIdleTask;", "Lokhttp3/internal/concurrent/Task;", "()V", "latch", "Ljava/util/concurrent/CountDownLatch;", "getLatch", "()Ljava/util/concurrent/CountDownLatch;", "runOnce", "", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class AwaitIdleTask extends okhttp3.internal.concurrent.Task {

        @org.jetbrains.annotations.NotNull
        private final java.util.concurrent.CountDownLatch latch;

        public AwaitIdleTask() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = okhttp3.internal.Util.okHttpName
                java.lang.String r2 = " awaitIdle"
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
                r1 = 0
                r3.<init>(r0, r1)
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
                r1 = 1
                r0.<init>(r1)
                r3.latch = r0
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.concurrent.CountDownLatch getLatch() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.latch
                return r0
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
                r2 = this;
                java.util.concurrent.CountDownLatch r0 = r2.latch
                r0.countDown()
                r0 = -1
                return r0
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$execute$1, reason: invalid class name */
    /* JADX INFO: compiled from: TaskQueue.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "runOnce", "", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class AnonymousClass1 extends okhttp3.internal.concurrent.Task {
        public final /* synthetic */ kotlin.jvm.functions.Function0 $block;

        public AnonymousClass1(kotlin.jvm.functions.Function0 r1, java.lang.String r2, boolean r3, java.lang.String r4, boolean r5) {
                r0 = this;
                r0.$block = r1
                r0.<init>(r4, r5)
                return
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
                r2 = this;
                kotlin.jvm.functions.Function0 r0 = r2.$block
                r0.invoke()
                r0 = -1
                return r0
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$schedule$2, reason: invalid class name */
    /* JADX INFO: compiled from: TaskQueue.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$schedule$2", "Lokhttp3/internal/concurrent/Task;", "runOnce", "", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class AnonymousClass2 extends okhttp3.internal.concurrent.Task {
        public final /* synthetic */ kotlin.jvm.functions.Function0 $block;

        public AnonymousClass2(kotlin.jvm.functions.Function0 r2, java.lang.String r3, java.lang.String r4) {
                r1 = this;
                r1.$block = r2
                r2 = 0
                r3 = 2
                r0 = 0
                r1.<init>(r4, r2, r3, r0)
                return
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
                r2 = this;
                kotlin.jvm.functions.Function0 r0 = r2.$block
                java.lang.Object r0 = r0.invoke()
                java.lang.Number r0 = (java.lang.Number) r0
                long r0 = r0.longValue()
                return r0
        }
    }

    public TaskQueue(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.taskRunner = r2
            r1.name = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.futureTasks = r2
            return
    }

    public static /* synthetic */ void execute$default(okhttp3.internal.concurrent.TaskQueue r6, java.lang.String r7, long r8, boolean r10, kotlin.jvm.functions.Function0 r11, int r12, java.lang.Object r13) {
            r13 = r12 & 2
            if (r13 == 0) goto L6
            r8 = 0
        L6:
            r12 = r12 & 4
            if (r12 == 0) goto Ld
            r10 = 1
            r5 = 1
            goto Le
        Ld:
            r5 = r10
        Le:
            java.lang.String r10 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r10)
            java.lang.String r10 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r10)
            okhttp3.internal.concurrent.TaskQueue$execute$1 r10 = new okhttp3.internal.concurrent.TaskQueue$execute$1
            r0 = r10
            r1 = r11
            r2 = r7
            r3 = r5
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.schedule(r10, r8)
            return
    }

    public static /* synthetic */ void schedule$default(okhttp3.internal.concurrent.TaskQueue r0, java.lang.String r1, long r2, kotlin.jvm.functions.Function0 r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L6
            r2 = 0
        L6:
            java.lang.String r5 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            okhttp3.internal.concurrent.TaskQueue$schedule$2 r5 = new okhttp3.internal.concurrent.TaskQueue$schedule$2
            r5.<init>(r4, r1, r1)
            r0.schedule(r5, r2)
            return
    }

    public static /* synthetic */ void schedule$default(okhttp3.internal.concurrent.TaskQueue r0, okhttp3.internal.concurrent.Task r1, long r2, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            r2 = 0
        L6:
            r0.schedule(r1, r2)
            return
    }

    public final void cancelAll() {
            r4 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L33
            boolean r0 = java.lang.Thread.holdsLock(r4)
            if (r0 != 0) goto Lb
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
            java.lang.String r2 = " MUST NOT hold lock on "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L33:
            okhttp3.internal.concurrent.TaskRunner r0 = r4.taskRunner
            monitor-enter(r0)
            boolean r1 = r4.cancelAllAndDecide$okhttp()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L41
            okhttp3.internal.concurrent.TaskRunner r1 = r4.taskRunner     // Catch: java.lang.Throwable -> L45
            r1.kickCoordinator$okhttp(r4)     // Catch: java.lang.Throwable -> L45
        L41:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L45
            monitor-exit(r0)
            return
        L45:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final boolean cancelAllAndDecide$okhttp() {
            r5 = this;
            okhttp3.internal.concurrent.Task r0 = r5.activeTask
            r1 = 1
            if (r0 == 0) goto L10
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            boolean r0 = r0.getCancelable()
            if (r0 == 0) goto L10
            r5.cancelActiveTask = r1
        L10:
            r0 = 0
            java.util.List<okhttp3.internal.concurrent.Task> r2 = r5.futureTasks
            int r2 = r2.size()
            int r2 = r2 - r1
        L18:
            if (r2 < 0) goto L4c
            java.util.List<okhttp3.internal.concurrent.Task> r3 = r5.futureTasks
            java.lang.Object r3 = r3.get(r2)
            okhttp3.internal.concurrent.Task r3 = (okhttp3.internal.concurrent.Task) r3
            boolean r3 = r3.getCancelable()
            if (r3 == 0) goto L49
            java.util.List<okhttp3.internal.concurrent.Task> r0 = r5.futureTasks
            java.lang.Object r0 = r0.get(r2)
            okhttp3.internal.concurrent.Task r0 = (okhttp3.internal.concurrent.Task) r0
            okhttp3.internal.concurrent.TaskRunner$Companion r3 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r3 = r3.getLogger()
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            boolean r3 = r3.isLoggable(r4)
            if (r3 == 0) goto L43
            java.lang.String r3 = "canceled"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r0, r5, r3)
        L43:
            java.util.List<okhttp3.internal.concurrent.Task> r0 = r5.futureTasks
            r0.remove(r2)
            r0 = 1
        L49:
            int r2 = r2 + (-1)
            goto L18
        L4c:
            return r0
    }

    public final void execute(@org.jetbrains.annotations.NotNull java.lang.String r8, long r9, boolean r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r12) {
            r7 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            okhttp3.internal.concurrent.TaskQueue$execute$1 r0 = new okhttp3.internal.concurrent.TaskQueue$execute$1
            r1 = r0
            r2 = r12
            r3 = r8
            r4 = r11
            r5 = r8
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r7.schedule(r0, r9)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.concurrent.Task getActiveTask$okhttp() {
            r1 = this;
            okhttp3.internal.concurrent.Task r0 = r1.activeTask
            return r0
    }

    public final boolean getCancelActiveTask$okhttp() {
            r1 = this;
            boolean r0 = r1.cancelActiveTask
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<okhttp3.internal.concurrent.Task> getFutureTasks$okhttp() {
            r1 = this;
            java.util.List<okhttp3.internal.concurrent.Task> r0 = r1.futureTasks
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName$okhttp() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<okhttp3.internal.concurrent.Task> getScheduledTasks() {
            r2 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r2.taskRunner
            monitor-enter(r0)
            java.util.List<okhttp3.internal.concurrent.Task> r1 = r2.futureTasks     // Catch: java.lang.Throwable -> Lb
            java.util.List r1 = kotlin.collections.CollectionsKt.toList(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final boolean getShutdown$okhttp() {
            r1 = this;
            boolean r0 = r1.shutdown
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.concurrent.TaskRunner getTaskRunner$okhttp() {
            r1 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r1.taskRunner
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.CountDownLatch idleLatch() {
            r5 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r5.taskRunner
            monitor-enter(r0)
            okhttp3.internal.concurrent.Task r1 = r5.activeTask     // Catch: java.lang.Throwable -> L5b
            r2 = 0
            if (r1 != 0) goto L17
            java.util.List<okhttp3.internal.concurrent.Task> r1 = r5.futureTasks     // Catch: java.lang.Throwable -> L5b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L17
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> L5b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)
            return r1
        L17:
            okhttp3.internal.concurrent.Task r1 = r5.activeTask     // Catch: java.lang.Throwable -> L5b
            boolean r3 = r1 instanceof okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L25
            okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask r1 = (okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) r1     // Catch: java.lang.Throwable -> L5b
            java.util.concurrent.CountDownLatch r1 = r1.getLatch()     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)
            return r1
        L25:
            java.util.List<okhttp3.internal.concurrent.Task> r1 = r5.futureTasks     // Catch: java.lang.Throwable -> L5b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L5b
        L2b:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L43
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L5b
            okhttp3.internal.concurrent.Task r3 = (okhttp3.internal.concurrent.Task) r3     // Catch: java.lang.Throwable -> L5b
            boolean r4 = r3 instanceof okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L2b
            okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask r3 = (okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) r3     // Catch: java.lang.Throwable -> L5b
            java.util.concurrent.CountDownLatch r1 = r3.getLatch()     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)
            return r1
        L43:
            okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask r1 = new okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask     // Catch: java.lang.Throwable -> L5b
            r1.<init>()     // Catch: java.lang.Throwable -> L5b
            r3 = 0
            boolean r2 = r5.scheduleAndDecide$okhttp(r1, r3, r2)     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L55
            okhttp3.internal.concurrent.TaskRunner r2 = r5.taskRunner     // Catch: java.lang.Throwable -> L5b
            r2.kickCoordinator$okhttp(r5)     // Catch: java.lang.Throwable -> L5b
        L55:
            java.util.concurrent.CountDownLatch r1 = r1.getLatch()     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)
            return r1
        L5b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void schedule(@org.jetbrains.annotations.NotNull java.lang.String r2, long r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Long> r5) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            okhttp3.internal.concurrent.TaskQueue$schedule$2 r0 = new okhttp3.internal.concurrent.TaskQueue$schedule$2
            r0.<init>(r5, r2, r2)
            r1.schedule(r0, r3)
            return
    }

    public final void schedule(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.Task r3, long r4) {
            r2 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.internal.concurrent.TaskRunner r0 = r2.taskRunner
            monitor-enter(r0)
            boolean r1 = r2.shutdown     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L40
            boolean r4 = r3.getCancelable()     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L27
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.Companion     // Catch: java.lang.Throwable -> L50
            java.util.logging.Logger r4 = r4.getLogger()     // Catch: java.lang.Throwable -> L50
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L50
            boolean r4 = r4.isLoggable(r5)     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L25
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r3, r2, r4)     // Catch: java.lang.Throwable -> L50
        L25:
            monitor-exit(r0)
            return
        L27:
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.Companion     // Catch: java.lang.Throwable -> L50
            java.util.logging.Logger r4 = r4.getLogger()     // Catch: java.lang.Throwable -> L50
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L50
            boolean r4 = r4.isLoggable(r5)     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L3a
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r3, r2, r4)     // Catch: java.lang.Throwable -> L50
        L3a:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L50
            r3.<init>()     // Catch: java.lang.Throwable -> L50
            throw r3     // Catch: java.lang.Throwable -> L50
        L40:
            r1 = 0
            boolean r3 = r2.scheduleAndDecide$okhttp(r3, r4, r1)     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L4c
            okhttp3.internal.concurrent.TaskRunner r3 = r2.taskRunner     // Catch: java.lang.Throwable -> L50
            r3.kickCoordinator$okhttp(r2)     // Catch: java.lang.Throwable -> L50
        L4c:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)
            return
        L50:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final boolean scheduleAndDecide$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.Task r11, long r12, boolean r14) {
            r10 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r11.initQueue$okhttp(r10)
            okhttp3.internal.concurrent.TaskRunner r0 = r10.taskRunner
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r0.getBackend()
            long r0 = r0.nanoTime()
            long r2 = r0 + r12
            java.util.List<okhttp3.internal.concurrent.Task> r4 = r10.futureTasks
            int r4 = r4.indexOf(r11)
            r5 = -1
            r6 = 0
            if (r4 == r5) goto L3f
            long r7 = r11.getNextExecuteNanoTime$okhttp()
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 > 0) goto L3a
            okhttp3.internal.concurrent.TaskRunner$Companion r12 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r12 = r12.getLogger()
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r12 = r12.isLoggable(r13)
            if (r12 == 0) goto L39
            java.lang.String r12 = "already scheduled"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r11, r10, r12)
        L39:
            return r6
        L3a:
            java.util.List<okhttp3.internal.concurrent.Task> r7 = r10.futureTasks
            r7.remove(r4)
        L3f:
            r11.setNextExecuteNanoTime$okhttp(r2)
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r4 = r4.getLogger()
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            boolean r4 = r4.isLoggable(r7)
            if (r4 == 0) goto L7a
            if (r14 == 0) goto L65
            java.lang.String r14 = "run again after "
            java.lang.StringBuilder r14 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r14)
            long r2 = r2 - r0
            java.lang.String r2 = okhttp3.internal.concurrent.TaskLoggerKt.formatDuration(r2)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            goto L77
        L65:
            java.lang.String r14 = "scheduled after "
            java.lang.StringBuilder r14 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r14)
            long r2 = r2 - r0
            java.lang.String r2 = okhttp3.internal.concurrent.TaskLoggerKt.formatDuration(r2)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
        L77:
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r11, r10, r14)
        L7a:
            java.util.List<okhttp3.internal.concurrent.Task> r14 = r10.futureTasks
            java.util.Iterator r14 = r14.iterator()
            r2 = 0
        L81:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L9f
            java.lang.Object r3 = r14.next()
            okhttp3.internal.concurrent.Task r3 = (okhttp3.internal.concurrent.Task) r3
            long r3 = r3.getNextExecuteNanoTime$okhttp()
            long r3 = r3 - r0
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 <= 0) goto L98
            r3 = 1
            goto L99
        L98:
            r3 = 0
        L99:
            if (r3 == 0) goto L9c
            goto La0
        L9c:
            int r2 = r2 + 1
            goto L81
        L9f:
            r2 = -1
        La0:
            if (r2 != r5) goto La8
            java.util.List<okhttp3.internal.concurrent.Task> r12 = r10.futureTasks
            int r2 = r12.size()
        La8:
            java.util.List<okhttp3.internal.concurrent.Task> r12 = r10.futureTasks
            r12.add(r2, r11)
            if (r2 != 0) goto Lb0
            r6 = 1
        Lb0:
            return r6
    }

    public final void setActiveTask$okhttp(@org.jetbrains.annotations.Nullable okhttp3.internal.concurrent.Task r1) {
            r0 = this;
            r0.activeTask = r1
            return
    }

    public final void setCancelActiveTask$okhttp(boolean r1) {
            r0 = this;
            r0.cancelActiveTask = r1
            return
    }

    public final void setShutdown$okhttp(boolean r1) {
            r0 = this;
            r0.shutdown = r1
            return
    }

    public final void shutdown() {
            r4 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L33
            boolean r0 = java.lang.Thread.holdsLock(r4)
            if (r0 != 0) goto Lb
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
            java.lang.String r2 = " MUST NOT hold lock on "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L33:
            okhttp3.internal.concurrent.TaskRunner r0 = r4.taskRunner
            monitor-enter(r0)
            r1 = 1
            r4.shutdown = r1     // Catch: java.lang.Throwable -> L48
            boolean r1 = r4.cancelAllAndDecide$okhttp()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L44
            okhttp3.internal.concurrent.TaskRunner r1 = r4.taskRunner     // Catch: java.lang.Throwable -> L48
            r1.kickCoordinator$okhttp(r4)     // Catch: java.lang.Throwable -> L48
        L44:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L48
            monitor-exit(r0)
            return
        L48:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}
