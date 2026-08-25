package okhttp3;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0019\u0010 \u001a\u00020\u001f2\n\u0010!\u001a\u00060\u001aR\u00020\u001bH\u0000¢\u0006\u0002\b\"J\u0015\u0010#\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001bH\u0000¢\u0006\u0002\b$J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b%J\u0016\u0010&\u001a\b\u0018\u00010\u001aR\u00020\u001b2\u0006\u0010'\u001a\u00020(H\u0002J)\u0010)\u001a\u00020\u001f\"\u0004\b\u0000\u0010*2\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H*0,2\u0006\u0010!\u001a\u0002H*H\u0002¢\u0006\u0002\u0010-J\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001bH\u0000¢\u0006\u0002\b.J\u0019\u0010)\u001a\u00020\u001f2\n\u0010!\u001a\u00060\u001aR\u00020\u001bH\u0000¢\u0006\u0002\b.J\b\u0010/\u001a\u000200H\u0002J\f\u00101\u001a\b\u0012\u0004\u0012\u00020302J\u0006\u00104\u001a\u00020\u0010J\f\u00105\u001a\b\u0012\u0004\u0012\u00020302J\u0006\u00106\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u0018\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u001aR\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001c\u001a\f\u0012\b\u0012\u00060\u001aR\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lokhttp3/Dispatcher;", "", "executorService", "Ljava/util/concurrent/ExecutorService;", "(Ljava/util/concurrent/ExecutorService;)V", "()V", "()Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "<set-?>", "Ljava/lang/Runnable;", "idleCallback", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "maxRequests", "", "getMaxRequests", "()I", "setMaxRequests", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "readyAsyncCalls", "Ljava/util/ArrayDeque;", "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", "runningAsyncCalls", "runningSyncCalls", "cancelAll", "", "enqueue", "call", "enqueue$okhttp", "executed", "executed$okhttp", "-deprecated_executorService", "findExistingCallWithHost", "host", "", "finished", "T", "calls", "Ljava/util/Deque;", "(Ljava/util/Deque;Ljava/lang/Object;)V", "finished$okhttp", "promoteAndExecute", "", "queuedCalls", "", "Lokhttp3/Call;", "queuedCallsCount", "runningCalls", "runningCallsCount", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Dispatcher {
    private java.util.concurrent.ExecutorService executorServiceOrNull;

    @org.jetbrains.annotations.Nullable
    private java.lang.Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final java.util.ArrayDeque<okhttp3.internal.connection.RealCall.AsyncCall> readyAsyncCalls;
    private final java.util.ArrayDeque<okhttp3.internal.connection.RealCall.AsyncCall> runningAsyncCalls;
    private final java.util.ArrayDeque<okhttp3.internal.connection.RealCall> runningSyncCalls;

    public Dispatcher() {
            r1 = this;
            r1.<init>()
            r0 = 64
            r1.maxRequests = r0
            r0 = 5
            r1.maxRequestsPerHost = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.readyAsyncCalls = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.runningAsyncCalls = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.runningSyncCalls = r0
            return
    }

    public Dispatcher(@org.jetbrains.annotations.NotNull java.util.concurrent.ExecutorService r2) {
            r1 = this;
            java.lang.String r0 = "executorService"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.executorServiceOrNull = r2
            return
    }

    private final okhttp3.internal.connection.RealCall.AsyncCall findExistingCallWithHost(java.lang.String r4) {
            r3 = this;
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r3.runningAsyncCalls
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealCall$AsyncCall r1 = (okhttp3.internal.connection.RealCall.AsyncCall) r1
            java.lang.String r2 = r1.getHost()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 == 0) goto L6
            return r1
        L1d:
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r3.readyAsyncCalls
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealCall$AsyncCall r1 = (okhttp3.internal.connection.RealCall.AsyncCall) r1
            java.lang.String r2 = r1.getHost()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 == 0) goto L23
            return r1
        L3a:
            r4 = 0
            return r4
    }

    private final <T> void finished(java.util.Deque<T> r1, T r2) {
            r0 = this;
            monitor-enter(r0)
            boolean r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L18
            java.lang.Runnable r1 = r0.idleCallback     // Catch: java.lang.Throwable -> L20
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)
            boolean r2 = r0.promoteAndExecute()
            if (r2 != 0) goto L17
            if (r1 == 0) goto L17
            r1.run()
        L17:
            return
        L18:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = "Call wasn't in-flight!"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L20
        L20:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    private final boolean promoteAndExecute() {
            r6 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L33
            boolean r0 = java.lang.Thread.holdsLock(r6)
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
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L33:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r6)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r1 = r6.readyAsyncCalls     // Catch: java.lang.Throwable -> La4
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.Throwable -> La4
        L44:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L80
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> La4
            okhttp3.internal.connection.RealCall$AsyncCall r2 = (okhttp3.internal.connection.RealCall.AsyncCall) r2     // Catch: java.lang.Throwable -> La4
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r3 = r6.runningAsyncCalls     // Catch: java.lang.Throwable -> La4
            int r3 = r3.size()     // Catch: java.lang.Throwable -> La4
            int r4 = r6.maxRequests     // Catch: java.lang.Throwable -> La4
            if (r3 < r4) goto L5b
            goto L80
        L5b:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.getCallsPerHost()     // Catch: java.lang.Throwable -> La4
            int r3 = r3.get()     // Catch: java.lang.Throwable -> La4
            int r4 = r6.maxRequestsPerHost     // Catch: java.lang.Throwable -> La4
            if (r3 < r4) goto L68
            goto L44
        L68:
            r1.remove()     // Catch: java.lang.Throwable -> La4
            java.util.concurrent.atomic.AtomicInteger r3 = r2.getCallsPerHost()     // Catch: java.lang.Throwable -> La4
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> La4
            java.lang.String r3 = "asyncCall"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> La4
            r0.add(r2)     // Catch: java.lang.Throwable -> La4
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r3 = r6.runningAsyncCalls     // Catch: java.lang.Throwable -> La4
            r3.add(r2)     // Catch: java.lang.Throwable -> La4
            goto L44
        L80:
            int r1 = r6.runningCallsCount()     // Catch: java.lang.Throwable -> La4
            r2 = 0
            if (r1 <= 0) goto L89
            r1 = 1
            goto L8a
        L89:
            r1 = 0
        L8a:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La4
            monitor-exit(r6)
            int r3 = r0.size()
        L91:
            if (r2 >= r3) goto La3
            java.lang.Object r4 = r0.get(r2)
            okhttp3.internal.connection.RealCall$AsyncCall r4 = (okhttp3.internal.connection.RealCall.AsyncCall) r4
            java.util.concurrent.ExecutorService r5 = r6.executorService()
            r4.executeOn(r5)
            int r2 = r2 + 1
            goto L91
        La3:
            return r1
        La4:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "executorService", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_executorService")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_executorService, reason: not valid java name */
    public final java.util.concurrent.ExecutorService m1918deprecated_executorService() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.executorService()
            return r0
    }

    public final synchronized void cancelAll() {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r2.readyAsyncCalls     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4d
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4d
            okhttp3.internal.connection.RealCall$AsyncCall r1 = (okhttp3.internal.connection.RealCall.AsyncCall) r1     // Catch: java.lang.Throwable -> L4d
            okhttp3.internal.connection.RealCall r1 = r1.getCall()     // Catch: java.lang.Throwable -> L4d
            r1.cancel()     // Catch: java.lang.Throwable -> L4d
            goto L7
        L1b:
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r2.runningAsyncCalls     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4d
        L21:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4d
            okhttp3.internal.connection.RealCall$AsyncCall r1 = (okhttp3.internal.connection.RealCall.AsyncCall) r1     // Catch: java.lang.Throwable -> L4d
            okhttp3.internal.connection.RealCall r1 = r1.getCall()     // Catch: java.lang.Throwable -> L4d
            r1.cancel()     // Catch: java.lang.Throwable -> L4d
            goto L21
        L35:
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r0 = r2.runningSyncCalls     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4d
        L3b:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4d
            okhttp3.internal.connection.RealCall r1 = (okhttp3.internal.connection.RealCall) r1     // Catch: java.lang.Throwable -> L4d
            r1.cancel()     // Catch: java.lang.Throwable -> L4d
            goto L3b
        L4b:
            monitor-exit(r2)
            return
        L4d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final void enqueue$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall.AsyncCall r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            monitor-enter(r1)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r1.readyAsyncCalls     // Catch: java.lang.Throwable -> L29
            r0.add(r2)     // Catch: java.lang.Throwable -> L29
            okhttp3.internal.connection.RealCall r0 = r2.getCall()     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.getForWebSocket()     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L22
            java.lang.String r0 = r2.getHost()     // Catch: java.lang.Throwable -> L29
            okhttp3.internal.connection.RealCall$AsyncCall r0 = r1.findExistingCallWithHost(r0)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L22
            r2.reuseCallsPerHostFrom(r0)     // Catch: java.lang.Throwable -> L29
        L22:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L29
            monitor-exit(r1)
            r1.promoteAndExecute()
            return
        L29:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void executed$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r0 = r1.runningSyncCalls     // Catch: java.lang.Throwable -> Ld
            r0.add(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @kotlin.jvm.JvmName(name = "executorService")
    @org.jetbrains.annotations.NotNull
    public final synchronized java.util.concurrent.ExecutorService executorService() {
            r9 = this;
            monitor-enter(r9)
            java.util.concurrent.ExecutorService r0 = r9.executorServiceOrNull     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L32
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L39
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 60
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L39
            java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> L39
            r7.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r8 = okhttp3.internal.Util.okHttpName     // Catch: java.lang.Throwable -> L39
            r1.append(r8)     // Catch: java.lang.Throwable -> L39
            java.lang.String r8 = " Dispatcher"
            r1.append(r8)     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L39
            r8 = 0
            java.util.concurrent.ThreadFactory r8 = okhttp3.internal.Util.threadFactory(r1, r8)     // Catch: java.lang.Throwable -> L39
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L39
            r9.executorServiceOrNull = r0     // Catch: java.lang.Throwable -> L39
        L32:
            java.util.concurrent.ExecutorService r0 = r9.executorServiceOrNull     // Catch: java.lang.Throwable -> L39
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r9)
            return r0
        L39:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
    }

    public final void finished$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall.AsyncCall r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r2.getCallsPerHost()
            r0.decrementAndGet()
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r1.runningAsyncCalls
            r1.finished(r0, r2)
            return
    }

    public final void finished$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r0 = r1.runningSyncCalls
            r1.finished(r0, r2)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final synchronized java.lang.Runnable getIdleCallback() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Runnable r0 = r1.idleCallback     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized int getMaxRequests() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.maxRequests     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized int getMaxRequestsPerHost() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.maxRequestsPerHost     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final synchronized java.util.List<okhttp3.Call> queuedCalls() {
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r3.readyAsyncCalls     // Catch: java.lang.Throwable -> L2f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2f
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0)     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2f
        L10:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L24
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L2f
            okhttp3.internal.connection.RealCall$AsyncCall r2 = (okhttp3.internal.connection.RealCall.AsyncCall) r2     // Catch: java.lang.Throwable -> L2f
            okhttp3.internal.connection.RealCall r2 = r2.getCall()     // Catch: java.lang.Throwable -> L2f
            r1.add(r2)     // Catch: java.lang.Throwable -> L2f
            goto L10
        L24:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "Collections.unmodifiable…yncCalls.map { it.call })"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r3)
            return r0
        L2f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final synchronized int queuedCallsCount() {
            r1 = this;
            monitor-enter(r1)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r1.readyAsyncCalls     // Catch: java.lang.Throwable -> L9
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final synchronized java.util.List<okhttp3.Call> runningCalls() {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r0 = r4.runningSyncCalls     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r1 = r4.runningAsyncCalls     // Catch: java.lang.Throwable -> L35
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L35
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1)     // Catch: java.lang.Throwable -> L35
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L35
        L12:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L26
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L35
            okhttp3.internal.connection.RealCall$AsyncCall r3 = (okhttp3.internal.connection.RealCall.AsyncCall) r3     // Catch: java.lang.Throwable -> L35
            okhttp3.internal.connection.RealCall r3 = r3.getCall()     // Catch: java.lang.Throwable -> L35
            r2.add(r3)     // Catch: java.lang.Throwable -> L35
            goto L12
        L26:
            java.util.List r0 = kotlin.collections.CollectionsKt.plus(r0, r2)     // Catch: java.lang.Throwable -> L35
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "Collections.unmodifiable…yncCalls.map { it.call })"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    public final synchronized int runningCallsCount() {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r2.runningAsyncCalls     // Catch: java.lang.Throwable -> L10
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L10
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r1 = r2.runningSyncCalls     // Catch: java.lang.Throwable -> L10
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L10
            int r0 = r0 + r1
            monitor-exit(r2)
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized void setIdleCallback(@org.jetbrains.annotations.Nullable java.lang.Runnable r1) {
            r0 = this;
            monitor-enter(r0)
            r0.idleCallback = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void setMaxRequests(int r2) {
            r1 = this;
            r0 = 1
            if (r2 < r0) goto L4
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L14
            monitor-enter(r1)
            r1.maxRequests = r2     // Catch: java.lang.Throwable -> L11
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            r1.promoteAndExecute()
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L14:
            java.lang.String r0 = "max < 1: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    public final void setMaxRequestsPerHost(int r2) {
            r1 = this;
            r0 = 1
            if (r2 < r0) goto L4
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L14
            monitor-enter(r1)
            r1.maxRequestsPerHost = r2     // Catch: java.lang.Throwable -> L11
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            r1.promoteAndExecute()
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L14:
            java.lang.String r0 = "max < 1: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }
}
