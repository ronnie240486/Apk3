package kotlinx.coroutines.test;

/* JADX INFO: compiled from: TestCoroutineContext.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This API has been deprecated to integrate with Structured Concurrency.", replaceWith = @kotlin.ReplaceWith(expression = "TestCoroutineScope", imports = {"kotlin.coroutines.test"}))
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001<B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0019J$\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0 J$\u0010\"\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0 J*\u0010#\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020!0 J$\u0010$\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0 J\u0006\u0010%\u001a\u00020\u001bJ\u0014\u0010&\u001a\u00020\u001b2\n\u0010'\u001a\u00060(j\u0002`)H\u0002J5\u0010*\u001a\u0002H+\"\u0004\b\u0000\u0010+2\u0006\u0010,\u001a\u0002H+2\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002H+0.H\u0016¢\u0006\u0002\u00100J(\u00101\u001a\u0004\u0018\u0001H2\"\b\b\u0000\u00102*\u00020/2\f\u00103\u001a\b\u0012\u0004\u0012\u0002H204H\u0096\u0002¢\u0006\u0002\u00105J\u0014\u00106\u001a\u00020\u00012\n\u00103\u001a\u0006\u0012\u0002\b\u000304H\u0016J\u0010\u00107\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u001c\u00108\u001a\u00020\u00122\n\u0010'\u001a\u00060(j\u0002`)2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u00109\u001a\u00020\u0006H\u0002J\b\u0010:\u001a\u00020\u0003H\u0016J\u0006\u0010;\u001a\u00020\u001bJ\u0010\u0010;\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "name", "", "(Ljava/lang/String;)V", "counter", "", "ctxDispatcher", "Lkotlinx/coroutines/test/TestCoroutineContext$Dispatcher;", "ctxHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "exceptions", "", "", "getExceptions", "()Ljava/util/List;", "queue", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/test/TimedRunnableObsolete;", "time", "uncaughtExceptions", "", "advanceTimeBy", "delayTime", "unit", "Ljava/util/concurrent/TimeUnit;", "advanceTimeTo", "", "targetTime", "assertAllUnhandledExceptions", "message", "predicate", "Lkotlin/Function1;", "", "assertAnyUnhandledException", "assertExceptions", "assertUnhandledException", "cancelAllActions", "enqueue", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "now", "postDelayed", "processNextEvent", "toString", "triggerActions", "Dispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TestCoroutineContext implements kotlin.coroutines.CoroutineContext {
    private long counter;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.test.TestCoroutineContext.Dispatcher ctxDispatcher;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineExceptionHandler ctxHandler;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.test.TimedRunnableObsolete> queue;
    private long time;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Throwable> uncaughtExceptions;

    /* JADX INFO: compiled from: TestCoroutineContext.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u001e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineContext$Dispatcher;", "Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/Delay;", "(Lkotlinx/coroutines/test/TestCoroutineContext;)V", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "processNextEvent", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "shouldBeProcessedFromContext", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class Dispatcher extends kotlinx.coroutines.EventLoop implements kotlinx.coroutines.Delay {
        public final /* synthetic */ kotlinx.coroutines.test.TestCoroutineContext this$0;

        public Dispatcher(kotlinx.coroutines.test.TestCoroutineContext r3) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                r3 = 0
                r0 = 1
                r1 = 0
                kotlinx.coroutines.EventLoop.incrementUseCount$default(r2, r3, r0, r1)
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
        public void mo1866dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
                r0 = this;
                kotlinx.coroutines.test.TestCoroutineContext r1 = r0.this$0
                kotlinx.coroutines.test.TestCoroutineContext.access$enqueue(r1, r2)
                return
        }

        @Override // kotlinx.coroutines.Delay
        @org.jetbrains.annotations.NotNull
        public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r4) {
                r0 = this;
                kotlinx.coroutines.test.TestCoroutineContext r4 = r0.this$0
                kotlinx.coroutines.test.TimedRunnableObsolete r1 = kotlinx.coroutines.test.TestCoroutineContext.access$postDelayed(r4, r3, r1)
                kotlinx.coroutines.test.TestCoroutineContext$Dispatcher$invokeOnTimeout$1 r2 = new kotlinx.coroutines.test.TestCoroutineContext$Dispatcher$invokeOnTimeout$1
                kotlinx.coroutines.test.TestCoroutineContext r3 = r0.this$0
                r2.<init>(r3, r1)
                return r2
        }

        @Override // kotlinx.coroutines.EventLoop
        public long processNextEvent() {
                r2 = this;
                kotlinx.coroutines.test.TestCoroutineContext r0 = r2.this$0
                long r0 = kotlinx.coroutines.test.TestCoroutineContext.access$processNextEvent(r0)
                return r0
        }

        @Override // kotlinx.coroutines.Delay
        /* JADX INFO: renamed from: scheduleResumeAfterDelay */
        public void mo1867scheduleResumeAfterDelay(long r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r5) {
                r2 = this;
                kotlinx.coroutines.test.TestCoroutineContext r0 = r2.this$0
                kotlinx.coroutines.test.TestCoroutineContext$Dispatcher$scheduleResumeAfterDelay$$inlined$Runnable$1 r1 = new kotlinx.coroutines.test.TestCoroutineContext$Dispatcher$scheduleResumeAfterDelay$$inlined$Runnable$1
                r1.<init>(r5, r2)
                kotlinx.coroutines.test.TestCoroutineContext.access$postDelayed(r0, r1, r3)
                return
        }

        @Override // kotlinx.coroutines.EventLoop
        public boolean shouldBeProcessedFromContext() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "Dispatcher("
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                kotlinx.coroutines.test.TestCoroutineContext r1 = r2.this$0
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public TestCoroutineContext() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public TestCoroutineContext(@org.jetbrains.annotations.Nullable java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r1.name = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.uncaughtExceptions = r2
            kotlinx.coroutines.test.TestCoroutineContext$Dispatcher r2 = new kotlinx.coroutines.test.TestCoroutineContext$Dispatcher
            r2.<init>(r1)
            r1.ctxDispatcher = r2
            kotlinx.coroutines.CoroutineExceptionHandler$Key r2 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            kotlinx.coroutines.test.TestCoroutineContext$special$$inlined$CoroutineExceptionHandler$1 r0 = new kotlinx.coroutines.test.TestCoroutineContext$special$$inlined$CoroutineExceptionHandler$1
            r0.<init>(r2, r1)
            r1.ctxHandler = r0
            kotlinx.coroutines.internal.ThreadSafeHeap r2 = new kotlinx.coroutines.internal.ThreadSafeHeap
            r2.<init>()
            r1.queue = r2
            return
    }

    public /* synthetic */ TestCoroutineContext(java.lang.String r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ void access$enqueue(kotlinx.coroutines.test.TestCoroutineContext r0, java.lang.Runnable r1) {
            r0.enqueue(r1)
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.ThreadSafeHeap access$getQueue$p(kotlinx.coroutines.test.TestCoroutineContext r0) {
            kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.test.TimedRunnableObsolete> r0 = r0.queue
            return r0
    }

    public static final /* synthetic */ java.util.List access$getUncaughtExceptions$p(kotlinx.coroutines.test.TestCoroutineContext r0) {
            java.util.List<java.lang.Throwable> r0 = r0.uncaughtExceptions
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.test.TimedRunnableObsolete access$postDelayed(kotlinx.coroutines.test.TestCoroutineContext r0, java.lang.Runnable r1, long r2) {
            kotlinx.coroutines.test.TimedRunnableObsolete r0 = r0.postDelayed(r1, r2)
            return r0
    }

    public static final /* synthetic */ long access$processNextEvent(kotlinx.coroutines.test.TestCoroutineContext r2) {
            long r0 = r2.processNextEvent()
            return r0
    }

    public static /* synthetic */ long advanceTimeBy$default(kotlinx.coroutines.test.TestCoroutineContext r0, long r1, java.util.concurrent.TimeUnit r3, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
        L6:
            long r0 = r0.advanceTimeBy(r1, r3)
            return r0
    }

    public static /* synthetic */ void advanceTimeTo$default(kotlinx.coroutines.test.TestCoroutineContext r0, long r1, java.util.concurrent.TimeUnit r3, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
        L6:
            r0.advanceTimeTo(r1, r3)
            return
    }

    public static /* synthetic */ void assertAllUnhandledExceptions$default(kotlinx.coroutines.test.TestCoroutineContext r0, java.lang.String r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            r0.assertAllUnhandledExceptions(r1, r2)
            return
    }

    public static /* synthetic */ void assertAnyUnhandledException$default(kotlinx.coroutines.test.TestCoroutineContext r0, java.lang.String r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            r0.assertAnyUnhandledException(r1, r2)
            return
    }

    public static /* synthetic */ void assertExceptions$default(kotlinx.coroutines.test.TestCoroutineContext r0, java.lang.String r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            r0.assertExceptions(r1, r2)
            return
    }

    public static /* synthetic */ void assertUnhandledException$default(kotlinx.coroutines.test.TestCoroutineContext r0, java.lang.String r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            r0.assertUnhandledException(r1, r2)
            return
    }

    private final void enqueue(java.lang.Runnable r11) {
            r10 = this;
            kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.test.TimedRunnableObsolete> r0 = r10.queue
            kotlinx.coroutines.test.TimedRunnableObsolete r9 = new kotlinx.coroutines.test.TimedRunnableObsolete
            long r3 = r10.counter
            r1 = 1
            long r1 = r1 + r3
            r10.counter = r1
            r5 = 0
            r7 = 4
            r8 = 0
            r1 = r9
            r2 = r11
            r1.<init>(r2, r3, r5, r7, r8)
            r0.addLast(r9)
            return
    }

    public static /* synthetic */ long now$default(kotlinx.coroutines.test.TestCoroutineContext r0, java.util.concurrent.TimeUnit r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
        L6:
            long r0 = r0.now(r1)
            return r0
    }

    private final kotlinx.coroutines.test.TimedRunnableObsolete postDelayed(java.lang.Runnable r8, long r9) {
            r7 = this;
            kotlinx.coroutines.test.TimedRunnableObsolete r6 = new kotlinx.coroutines.test.TimedRunnableObsolete
            long r2 = r7.counter
            r0 = 1
            long r0 = r0 + r2
            r7.counter = r0
            long r0 = r7.time
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r9 = r4.toNanos(r9)
            long r4 = r9 + r0
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r4)
            kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.test.TimedRunnableObsolete> r8 = r7.queue
            r8.addLast(r6)
            return r6
    }

    private final long processNextEvent() {
            r2 = this;
            kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.test.TimedRunnableObsolete> r0 = r2.queue
            kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r0.peek()
            kotlinx.coroutines.test.TimedRunnableObsolete r0 = (kotlinx.coroutines.test.TimedRunnableObsolete) r0
            if (r0 == 0) goto Lf
            long r0 = r0.time
            r2.triggerActions(r0)
        Lf:
            kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.test.TimedRunnableObsolete> r0 = r2.queue
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L1f
        L1d:
            r0 = 0
        L1f:
            return r0
    }

    private final void triggerActions(long r7) {
            r6 = this;
        L0:
            kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.test.TimedRunnableObsolete> r0 = r6.queue
            monitor-enter(r0)
            kotlinx.coroutines.internal.ThreadSafeHeapNode r1 = r0.firstImpl()     // Catch: java.lang.Throwable -> L33
            r2 = 0
            if (r1 != 0) goto Lc
            monitor-exit(r0)
            goto L20
        Lc:
            kotlinx.coroutines.test.TimedRunnableObsolete r1 = (kotlinx.coroutines.test.TimedRunnableObsolete) r1     // Catch: java.lang.Throwable -> L33
            long r3 = r1.time     // Catch: java.lang.Throwable -> L33
            r1 = 0
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = 0
        L18:
            if (r3 == 0) goto L1f
            kotlinx.coroutines.internal.ThreadSafeHeapNode r1 = r0.removeAtImpl(r1)     // Catch: java.lang.Throwable -> L33
            r2 = r1
        L1f:
            monitor-exit(r0)
        L20:
            kotlinx.coroutines.test.TimedRunnableObsolete r2 = (kotlinx.coroutines.test.TimedRunnableObsolete) r2
            if (r2 != 0) goto L25
            return
        L25:
            long r0 = r2.time
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L2f
            r6.time = r0
        L2f:
            r2.run()
            goto L0
        L33:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }

    public final long advanceTimeBy(long r4, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r6) {
            r3 = this;
            long r0 = r3.time
            long r4 = r6.toNanos(r4)
            long r4 = r4 + r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            r3.advanceTimeTo(r4, r2)
            long r4 = r3.time
            long r4 = r4 - r0
            long r4 = r6.convert(r4, r2)
            return r4
    }

    public final void advanceTimeTo(long r3, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r5) {
            r2 = this;
            long r3 = r5.toNanos(r3)
            r2.triggerActions(r3)
            long r0 = r2.time
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto Lf
            r2.time = r3
        Lf:
            return
    }

    public final void assertAllUnhandledExceptions(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> r5) {
            r3 = this;
            java.util.List<java.lang.Throwable> r0 = r3.uncaughtExceptions
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            if (r1 == 0) goto Le
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Le
            goto L29
        Le:
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            java.lang.Object r1 = r5.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L12
            r2 = 0
        L29:
            if (r2 == 0) goto L31
            java.util.List<java.lang.Throwable> r4 = r3.uncaughtExceptions
            r4.clear()
            return
        L31:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>(r4)
            throw r5
    }

    public final void assertAnyUnhandledException(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> r5) {
            r3 = this;
            java.util.List<java.lang.Throwable> r0 = r3.uncaughtExceptions
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto Le
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Le
            goto L29
        Le:
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            java.lang.Object r1 = r5.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L12
            r2 = 1
        L29:
            if (r2 == 0) goto L31
            java.util.List<java.lang.Throwable> r4 = r3.uncaughtExceptions
            r4.clear()
            return
        L31:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>(r4)
            throw r5
    }

    public final void assertExceptions(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.List<? extends java.lang.Throwable>, java.lang.Boolean> r3) {
            r1 = this;
            java.util.List<java.lang.Throwable> r0 = r1.uncaughtExceptions
            java.lang.Object r3 = r3.invoke(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L14
            java.util.List<java.lang.Throwable> r2 = r1.uncaughtExceptions
            r2.clear()
            return
        L14:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>(r2)
            throw r3
    }

    public final void assertUnhandledException(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> r4) {
            r2 = this;
            java.util.List<java.lang.Throwable> r0 = r2.uncaughtExceptions
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L22
            java.util.List<java.lang.Throwable> r0 = r2.uncaughtExceptions
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object r4 = r4.invoke(r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L22
            java.util.List<java.lang.Throwable> r3 = r2.uncaughtExceptions
            r3.clear()
            return
        L22:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>(r3)
            throw r4
    }

    public final void cancelAllActions() {
            r1 = this;
            kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.test.TimedRunnableObsolete> r0 = r1.queue
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld
            kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.test.TimedRunnableObsolete> r0 = r1.queue
            r0.clear()
        Ld:
            return
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r3) {
            r1 = this;
            kotlinx.coroutines.test.TestCoroutineContext$Dispatcher r0 = r1.ctxDispatcher
            java.lang.Object r2 = r3.invoke(r2, r0)
            kotlinx.coroutines.CoroutineExceptionHandler r0 = r1.ctxHandler
            java.lang.Object r2 = r3.invoke(r2, r0)
            return r2
    }

    @Override // kotlin.coroutines.CoroutineContext
    @org.jetbrains.annotations.Nullable
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<E> r2) {
            r1 = this;
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
            if (r2 != r0) goto L7
            kotlinx.coroutines.test.TestCoroutineContext$Dispatcher r2 = r1.ctxDispatcher
            goto Lf
        L7:
            kotlinx.coroutines.CoroutineExceptionHandler$Key r0 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            if (r2 != r0) goto Le
            kotlinx.coroutines.CoroutineExceptionHandler r2 = r1.ctxHandler
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Throwable> getExceptions() {
            r1 = this;
            java.util.List<java.lang.Throwable> r0 = r1.uncaughtExceptions
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<?> r2) {
            r1 = this;
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
            if (r2 != r0) goto L7
            kotlinx.coroutines.CoroutineExceptionHandler r2 = r1.ctxHandler
            goto Lf
        L7:
            kotlinx.coroutines.CoroutineExceptionHandler$Key r0 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            if (r2 != r0) goto Le
            kotlinx.coroutines.test.TestCoroutineContext$Dispatcher r2 = r1.ctxDispatcher
            goto Lf
        Le:
            r2 = r1
        Lf:
            return r2
    }

    public final long now(@org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r4) {
            r3 = this;
            long r0 = r3.time
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r4.convert(r0, r2)
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext plus(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext r1 = kotlin.coroutines.CoroutineContext.DefaultImpls.plus(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.name
            if (r0 != 0) goto Le
            java.lang.String r0 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            java.lang.String r1 = "TestCoroutineContext@"
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r0)
        Le:
            return r0
    }

    public final void triggerActions() {
            r2 = this;
            long r0 = r2.time
            r2.triggerActions(r0)
            return
    }
}
