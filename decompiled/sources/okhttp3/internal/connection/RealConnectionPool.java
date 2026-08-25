package okhttp3.internal.connection;

/* JADX INFO: compiled from: RealConnectionPool.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u000e\u0018\u0000 (2\u00020\u0001:\u0001(B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ.\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0012J\u0006\u0010\"\u001a\u00020\u0005J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0005J\u0018\u0010&\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u000e\u0010'\u001a\u00020$2\u0006\u0010!\u001a\u00020\u0012R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "maxIdleConnections", "", "keepAliveDuration", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(Lokhttp3/internal/concurrent/TaskRunner;IJLjava/util/concurrent/TimeUnit;)V", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupTask", "okhttp3/internal/connection/RealConnectionPool$cleanupTask$1", "Lokhttp3/internal/connection/RealConnectionPool$cleanupTask$1;", "connections", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lokhttp3/internal/connection/RealConnection;", "keepAliveDurationNs", "callAcquirePooledConnection", "", "address", "Lokhttp3/Address;", "call", "Lokhttp3/internal/connection/RealCall;", "routes", "", "Lokhttp3/Route;", "requireMultiplexed", "cleanup", "now", "connectionBecameIdle", "connection", "connectionCount", "evictAll", "", "idleConnectionCount", "pruneAndGetAllocationCount", "put", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class RealConnectionPool {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.connection.RealConnectionPool.Companion Companion = null;
    private final okhttp3.internal.concurrent.TaskQueue cleanupQueue;
    private final okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 cleanupTask;
    private final java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    /* JADX INFO: compiled from: RealConnectionPool.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "()V", "get", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/ConnectionPool;", "okhttp"}, k = 1, mv = {1, 4, 1})
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
        public final okhttp3.internal.connection.RealConnectionPool get(@org.jetbrains.annotations.NotNull okhttp3.ConnectionPool r2) {
                r1 = this;
                java.lang.String r0 = "connectionPool"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.internal.connection.RealConnectionPool r2 = r2.getDelegate$okhttp()
                return r2
        }
    }

    static {
            okhttp3.internal.connection.RealConnectionPool$Companion r0 = new okhttp3.internal.connection.RealConnectionPool$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.connection.RealConnectionPool.Companion = r0
            return
    }

    public RealConnectionPool(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r3, int r4, long r5, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r7) {
            r2 = this;
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r2.<init>()
            r2.maxIdleConnections = r4
            long r0 = r7.toNanos(r5)
            r2.keepAliveDurationNs = r0
            okhttp3.internal.concurrent.TaskQueue r3 = r3.newQueue()
            r2.cleanupQueue = r3
            okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 r3 = new okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = okhttp3.internal.Util.okHttpName
            java.lang.String r0 = " ConnectionPool"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r7, r0)
            r3.<init>(r2, r4)
            r2.cleanupTask = r3
            java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue
            r3.<init>()
            r2.connections = r3
            r3 = 0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L40
            r3 = 1
            goto L41
        L40:
            r3 = 0
        L41:
            if (r3 == 0) goto L44
            return
        L44:
            java.lang.String r3 = "keepAliveDuration <= 0: "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r5)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    private final int pruneAndGetAllocationCount(okhttp3.internal.connection.RealConnection r7, long r8) {
            r6 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L33
            boolean r0 = java.lang.Thread.holdsLock(r7)
            if (r0 == 0) goto Lb
            goto L33
        Lb:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r9 = "Thread "
            java.lang.StringBuilder r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r0 = r0.getName()
            r9.append(r0)
            java.lang.String r0 = " MUST hold lock on "
            r9.append(r0)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.<init>(r7)
            throw r8
        L33:
            java.util.List r0 = r7.getCalls()
            r1 = 0
            r2 = 0
        L39:
            int r3 = r0.size()
            if (r2 >= r3) goto L94
            java.lang.Object r3 = r0.get(r2)
            java.lang.ref.Reference r3 = (java.lang.ref.Reference) r3
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L4e
            int r2 = r2 + 1
            goto L39
        L4e:
            okhttp3.internal.connection.RealCall$CallReference r3 = (okhttp3.internal.connection.RealCall.CallReference) r3
            java.lang.String r4 = "A connection to "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            okhttp3.Route r5 = r7.route()
            okhttp3.Address r5 = r5.address()
            okhttp3.HttpUrl r5 = r5.url()
            r4.append(r5)
            java.lang.String r5 = " was leaked. "
            r4.append(r5)
            java.lang.String r5 = "Did you forget to close a response body?"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            okhttp3.internal.platform.Platform$Companion r5 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r5 = r5.get()
            java.lang.Object r3 = r3.getCallStackTrace()
            r5.logCloseableLeak(r4, r3)
            r0.remove(r2)
            r3 = 1
            r7.setNoNewExchanges(r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L39
            long r2 = r6.keepAliveDurationNs
            long r8 = r8 - r2
            r7.setIdleAtNs(r8)
            return r1
        L94:
            int r7 = r0.size()
            return r7
    }

    public final boolean callAcquirePooledConnection(@org.jetbrains.annotations.NotNull okhttp3.Address r4, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r5, @org.jetbrains.annotations.Nullable java.util.List<okhttp3.Route> r6, boolean r7) {
            r3 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r3.connections
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealConnection r1 = (okhttp3.internal.connection.RealConnection) r1
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            monitor-enter(r1)
            if (r7 == 0) goto L2b
            boolean r2 = r1.isMultiplexed$okhttp()     // Catch: java.lang.Throwable -> L3b
            if (r2 != 0) goto L2b
            goto L31
        L2b:
            boolean r2 = r1.isEligible$okhttp(r4, r6)     // Catch: java.lang.Throwable -> L3b
            if (r2 != 0) goto L35
        L31:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r1)
            goto L10
        L35:
            r5.acquireConnectionNoEvents(r1)     // Catch: java.lang.Throwable -> L3b
            r4 = 1
            monitor-exit(r1)
            return r4
        L3b:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L3e:
            r4 = 0
            return r4
    }

    public final long cleanup(long r11) {
            r10 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r10.connections
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r3 = -9223372036854775808
            r4 = r3
            r3 = r2
            r2 = 0
        Ld:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L40
            java.lang.Object r6 = r0.next()
            okhttp3.internal.connection.RealConnection r6 = (okhttp3.internal.connection.RealConnection) r6
            java.lang.String r7 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            monitor-enter(r6)
            int r7 = r10.pruneAndGetAllocationCount(r6, r11)     // Catch: java.lang.Throwable -> L3d
            if (r7 <= 0) goto L28
            int r2 = r2 + 1
            goto L3b
        L28:
            int r1 = r1 + 1
            long r7 = r6.getIdleAtNs()     // Catch: java.lang.Throwable -> L3d
            long r7 = r11 - r7
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L39
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3d
            r3 = r6
            r4 = r7
            goto L3b
        L39:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3d
        L3b:
            monitor-exit(r6)
            goto Ld
        L3d:
            r11 = move-exception
            monitor-exit(r6)
            throw r11
        L40:
            long r6 = r10.keepAliveDurationNs
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L55
            int r0 = r10.maxIdleConnections
            if (r1 <= r0) goto L4b
            goto L55
        L4b:
            if (r1 <= 0) goto L4f
            long r6 = r6 - r4
            return r6
        L4f:
            if (r2 <= 0) goto L52
            return r6
        L52:
            r11 = -1
            return r11
        L55:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            monitor-enter(r3)
            java.util.List r0 = r3.getCalls()     // Catch: java.lang.Throwable -> L92
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L92
            r1 = 1
            r0 = r0 ^ r1
            r6 = 0
            if (r0 == 0) goto L69
            monitor-exit(r3)
            return r6
        L69:
            long r8 = r3.getIdleAtNs()     // Catch: java.lang.Throwable -> L92
            long r8 = r8 + r4
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 == 0) goto L74
            monitor-exit(r3)
            return r6
        L74:
            r3.setNoNewExchanges(r1)     // Catch: java.lang.Throwable -> L92
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r11 = r10.connections     // Catch: java.lang.Throwable -> L92
            r11.remove(r3)     // Catch: java.lang.Throwable -> L92
            monitor-exit(r3)
            java.net.Socket r11 = r3.socket()
            okhttp3.internal.Util.closeQuietly(r11)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r11 = r10.connections
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L91
            okhttp3.internal.concurrent.TaskQueue r11 = r10.cleanupQueue
            r11.cancelAll()
        L91:
            return r6
        L92:
            r11 = move-exception
            monitor-exit(r3)
            throw r11
    }

    public final boolean connectionBecameIdle(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnection r9) {
            r8 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L38
            boolean r0 = java.lang.Thread.holdsLock(r9)
            if (r0 == 0) goto L10
            goto L38
        L10:
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
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L38:
            boolean r0 = r9.getNoNewExchanges()
            r1 = 1
            if (r0 != 0) goto L51
            int r0 = r8.maxIdleConnections
            if (r0 != 0) goto L44
            goto L51
        L44:
            okhttp3.internal.concurrent.TaskQueue r2 = r8.cleanupQueue
            okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 r3 = r8.cleanupTask
            r4 = 0
            r6 = 2
            r7 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r2, r3, r4, r6, r7)
            r1 = 0
            goto L66
        L51:
            r9.setNoNewExchanges(r1)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r8.connections
            r0.remove(r9)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r9 = r8.connections
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L66
            okhttp3.internal.concurrent.TaskQueue r9 = r8.cleanupQueue
            r9.cancelAll()
        L66:
            return r1
    }

    public final int connectionCount() {
            r1 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r1.connections
            int r0 = r0.size()
            return r0
    }

    public final void evictAll() {
            r3 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r3.connections
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "connections.iterator()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealConnection r1 = (okhttp3.internal.connection.RealConnection) r1
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            monitor-enter(r1)
            java.util.List r2 = r1.getCalls()     // Catch: java.lang.Throwable -> L3b
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L33
            r0.remove()     // Catch: java.lang.Throwable -> L3b
            r2 = 1
            r1.setNoNewExchanges(r2)     // Catch: java.lang.Throwable -> L3b
            java.net.Socket r2 = r1.socket()     // Catch: java.lang.Throwable -> L3b
            goto L34
        L33:
            r2 = 0
        L34:
            monitor-exit(r1)
            if (r2 == 0) goto Lb
            okhttp3.internal.Util.closeQuietly(r2)
            goto Lb
        L3b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L3e:
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r3.connections
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4b
            okhttp3.internal.concurrent.TaskQueue r0 = r3.cleanupQueue
            r0.cancelAll()
        L4b:
            return
    }

    public final int idleConnectionCount() {
            r4 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r4.connections
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto Le
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Le
            goto L3a
        Le:
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealConnection r1 = (okhttp3.internal.connection.RealConnection) r1
            java.lang.String r3 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            monitor-enter(r1)
            java.util.List r3 = r1.getCalls()     // Catch: java.lang.Throwable -> L37
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r1)
            if (r3 == 0) goto L12
            int r2 = r2 + 1
            if (r2 >= 0) goto L12
            kotlin.collections.CollectionsKt.throwCountOverflow()
            goto L12
        L37:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L3a:
            return r2
    }

    public final void put(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnection r8) {
            r7 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L38
            boolean r0 = java.lang.Thread.holdsLock(r8)
            if (r0 == 0) goto L10
            goto L38
        L10:
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
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L38:
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r7.connections
            r0.add(r8)
            okhttp3.internal.concurrent.TaskQueue r1 = r7.cleanupQueue
            okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 r2 = r7.cleanupTask
            r3 = 0
            r5 = 2
            r6 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r1, r2, r3, r5, r6)
            return
    }
}
