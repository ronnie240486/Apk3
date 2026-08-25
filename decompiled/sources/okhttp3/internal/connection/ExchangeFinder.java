package okhttp3.internal.connection;

/* JADX INFO: compiled from: ExchangeFinder.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ0\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0002J8\u0010%\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0002J\u0006\u0010'\u001a\u00020$J\n\u0010(\u001a\u0004\u0018\u00010\u0010H\u0002J\u000e\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lokhttp3/internal/connection/ExchangeFinder;", "", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "address", "Lokhttp3/Address;", "call", "Lokhttp3/internal/connection/RealCall;", "eventListener", "Lokhttp3/EventListener;", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Address;Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;)V", "getAddress$okhttp", "()Lokhttp3/Address;", "connectionShutdownCount", "", "nextRouteToTry", "Lokhttp3/Route;", "otherFailureCount", "refusedStreamCount", "routeSelection", "Lokhttp3/internal/connection/RouteSelector$Selection;", "routeSelector", "Lokhttp3/internal/connection/RouteSelector;", "find", "Lokhttp3/internal/http/ExchangeCodec;", "client", "Lokhttp3/OkHttpClient;", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "findConnection", "Lokhttp3/internal/connection/RealConnection;", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "connectionRetryEnabled", "", "findHealthyConnection", "doExtensiveHealthChecks", "retryAfterFailure", "retryRoute", "sameHostAndPort", "url", "Lokhttp3/HttpUrl;", "trackFailure", "", "e", "Ljava/io/IOException;", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class ExchangeFinder {

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Address address;
    private final okhttp3.internal.connection.RealCall call;
    private final okhttp3.internal.connection.RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    private final okhttp3.EventListener eventListener;
    private okhttp3.Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private okhttp3.internal.connection.RouteSelector.Selection routeSelection;
    private okhttp3.internal.connection.RouteSelector routeSelector;

    public ExchangeFinder(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnectionPool r2, @org.jetbrains.annotations.NotNull okhttp3.Address r3, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r4, @org.jetbrains.annotations.NotNull okhttp3.EventListener r5) {
            r1 = this;
            java.lang.String r0 = "connectionPool"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r1.<init>()
            r1.connectionPool = r2
            r1.address = r3
            r1.call = r4
            r1.eventListener = r5
            return
    }

    private final okhttp3.internal.connection.RealConnection findConnection(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
            r14 = this;
            r1 = r14
            okhttp3.internal.connection.RealCall r0 = r1.call
            boolean r0 = r0.isCanceled()
            if (r0 != 0) goto L178
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.internal.connection.RealConnection r2 = r0.getConnection()
            r0 = 1
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L64
            monitor-enter(r2)
            boolean r5 = r2.getNoNewExchanges()     // Catch: java.lang.Throwable -> L61
            if (r5 != 0) goto L30
            okhttp3.Route r5 = r2.route()     // Catch: java.lang.Throwable -> L61
            okhttp3.Address r5 = r5.address()     // Catch: java.lang.Throwable -> L61
            okhttp3.HttpUrl r5 = r5.url()     // Catch: java.lang.Throwable -> L61
            boolean r5 = r14.sameHostAndPort(r5)     // Catch: java.lang.Throwable -> L61
            if (r5 != 0) goto L2e
            goto L30
        L2e:
            r5 = r4
            goto L36
        L30:
            okhttp3.internal.connection.RealCall r5 = r1.call     // Catch: java.lang.Throwable -> L61
            java.net.Socket r5 = r5.releaseConnectionNoEvents$okhttp()     // Catch: java.lang.Throwable -> L61
        L36:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L61
            monitor-exit(r2)
            okhttp3.internal.connection.RealCall r6 = r1.call
            okhttp3.internal.connection.RealConnection r6 = r6.getConnection()
            if (r6 == 0) goto L54
            if (r5 != 0) goto L44
            goto L45
        L44:
            r0 = 0
        L45:
            if (r0 == 0) goto L48
            return r2
        L48:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L54:
            if (r5 == 0) goto L59
            okhttp3.internal.Util.closeQuietly(r5)
        L59:
            okhttp3.EventListener r5 = r1.eventListener
            okhttp3.internal.connection.RealCall r6 = r1.call
            r5.connectionReleased(r6, r2)
            goto L64
        L61:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L64:
            r1.refusedStreamCount = r3
            r1.connectionShutdownCount = r3
            r1.otherFailureCount = r3
            okhttp3.internal.connection.RealConnectionPool r2 = r1.connectionPool
            okhttp3.Address r5 = r1.address
            okhttp3.internal.connection.RealCall r6 = r1.call
            boolean r2 = r2.callAcquirePooledConnection(r5, r6, r4, r3)
            if (r2 == 0) goto L87
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okhttp3.EventListener r2 = r1.eventListener
            okhttp3.internal.connection.RealCall r3 = r1.call
            r2.connectionAcquired(r3, r0)
            return r0
        L87:
            okhttp3.Route r2 = r1.nextRouteToTry
            if (r2 == 0) goto L92
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r1.nextRouteToTry = r4
        L90:
            r5 = r4
            goto Lf7
        L92:
            okhttp3.internal.connection.RouteSelector$Selection r2 = r1.routeSelection
            if (r2 == 0) goto La9
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto La9
            okhttp3.internal.connection.RouteSelector$Selection r2 = r1.routeSelection
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okhttp3.Route r2 = r2.next()
            goto L90
        La9:
            okhttp3.internal.connection.RouteSelector r2 = r1.routeSelector
            if (r2 != 0) goto Lc4
            okhttp3.internal.connection.RouteSelector r2 = new okhttp3.internal.connection.RouteSelector
            okhttp3.Address r5 = r1.address
            okhttp3.internal.connection.RealCall r6 = r1.call
            okhttp3.OkHttpClient r6 = r6.getClient()
            okhttp3.internal.connection.RouteDatabase r6 = r6.getRouteDatabase()
            okhttp3.internal.connection.RealCall r7 = r1.call
            okhttp3.EventListener r8 = r1.eventListener
            r2.<init>(r5, r6, r7, r8)
            r1.routeSelector = r2
        Lc4:
            okhttp3.internal.connection.RouteSelector$Selection r2 = r2.next()
            r1.routeSelection = r2
            java.util.List r5 = r2.getRoutes()
            okhttp3.internal.connection.RealCall r6 = r1.call
            boolean r6 = r6.isCanceled()
            if (r6 != 0) goto L170
            okhttp3.internal.connection.RealConnectionPool r6 = r1.connectionPool
            okhttp3.Address r7 = r1.address
            okhttp3.internal.connection.RealCall r8 = r1.call
            boolean r3 = r6.callAcquirePooledConnection(r7, r8, r5, r3)
            if (r3 == 0) goto Lf3
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okhttp3.EventListener r2 = r1.eventListener
            okhttp3.internal.connection.RealCall r3 = r1.call
            r2.connectionAcquired(r3, r0)
            return r0
        Lf3:
            okhttp3.Route r2 = r2.next()
        Lf7:
            okhttp3.internal.connection.RealConnection r3 = new okhttp3.internal.connection.RealConnection
            okhttp3.internal.connection.RealConnectionPool r6 = r1.connectionPool
            r3.<init>(r6, r2)
            okhttp3.internal.connection.RealCall r6 = r1.call
            r6.setConnectionToCancel(r3)
            okhttp3.internal.connection.RealCall r12 = r1.call     // Catch: java.lang.Throwable -> L169
            okhttp3.EventListener r13 = r1.eventListener     // Catch: java.lang.Throwable -> L169
            r6 = r3
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r6.connect(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L169
            okhttp3.internal.connection.RealCall r6 = r1.call
            r6.setConnectionToCancel(r4)
            okhttp3.internal.connection.RealCall r4 = r1.call
            okhttp3.OkHttpClient r4 = r4.getClient()
            okhttp3.internal.connection.RouteDatabase r4 = r4.getRouteDatabase()
            okhttp3.Route r6 = r3.route()
            r4.connected(r6)
            okhttp3.internal.connection.RealConnectionPool r4 = r1.connectionPool
            okhttp3.Address r6 = r1.address
            okhttp3.internal.connection.RealCall r7 = r1.call
            boolean r0 = r4.callAcquirePooledConnection(r6, r7, r5, r0)
            if (r0 == 0) goto L150
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1.nextRouteToTry = r2
            java.net.Socket r2 = r3.socket()
            okhttp3.internal.Util.closeQuietly(r2)
            okhttp3.EventListener r2 = r1.eventListener
            okhttp3.internal.connection.RealCall r3 = r1.call
            r2.connectionAcquired(r3, r0)
            return r0
        L150:
            monitor-enter(r3)
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool     // Catch: java.lang.Throwable -> L166
            r0.put(r3)     // Catch: java.lang.Throwable -> L166
            okhttp3.internal.connection.RealCall r0 = r1.call     // Catch: java.lang.Throwable -> L166
            r0.acquireConnectionNoEvents(r3)     // Catch: java.lang.Throwable -> L166
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L166
            monitor-exit(r3)
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.internal.connection.RealCall r2 = r1.call
            r0.connectionAcquired(r2, r3)
            return r3
        L166:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L169:
            r0 = move-exception
            okhttp3.internal.connection.RealCall r2 = r1.call
            r2.setConnectionToCancel(r4)
            throw r0
        L170:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L178:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
    }

    private final okhttp3.internal.connection.RealConnection findHealthyConnection(int r3, int r4, int r5, int r6, boolean r7, boolean r8) throws java.io.IOException {
            r2 = this;
        L0:
            okhttp3.internal.connection.RealConnection r0 = r2.findConnection(r3, r4, r5, r6, r7)
            boolean r1 = r0.isHealthy(r8)
            if (r1 == 0) goto Lb
            return r0
        Lb:
            r0.noNewExchanges$okhttp()
            okhttp3.Route r0 = r2.nextRouteToTry
            if (r0 == 0) goto L13
            goto L0
        L13:
            okhttp3.internal.connection.RouteSelector$Selection r0 = r2.routeSelection
            r1 = 1
            if (r0 == 0) goto L1d
            boolean r0 = r0.hasNext()
            goto L1e
        L1d:
            r0 = 1
        L1e:
            if (r0 == 0) goto L21
            goto L0
        L21:
            okhttp3.internal.connection.RouteSelector r0 = r2.routeSelector
            if (r0 == 0) goto L29
            boolean r1 = r0.hasNext()
        L29:
            if (r1 == 0) goto L2c
            goto L0
        L2c:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "exhausted all routes"
            r3.<init>(r4)
            throw r3
    }

    private final okhttp3.Route retryRoute() {
            r4 = this;
            int r0 = r4.refusedStreamCount
            r1 = 1
            r2 = 0
            if (r0 > r1) goto L43
            int r0 = r4.connectionShutdownCount
            if (r0 > r1) goto L43
            int r0 = r4.otherFailureCount
            if (r0 <= 0) goto Lf
            goto L43
        Lf:
            okhttp3.internal.connection.RealCall r0 = r4.call
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            if (r0 == 0) goto L43
            monitor-enter(r0)
            int r1 = r0.getRouteFailureCount$okhttp()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L20
            monitor-exit(r0)
            return r2
        L20:
            okhttp3.Route r1 = r0.route()     // Catch: java.lang.Throwable -> L40
            okhttp3.Address r1 = r1.address()     // Catch: java.lang.Throwable -> L40
            okhttp3.HttpUrl r1 = r1.url()     // Catch: java.lang.Throwable -> L40
            okhttp3.Address r3 = r4.address     // Catch: java.lang.Throwable -> L40
            okhttp3.HttpUrl r3 = r3.url()     // Catch: java.lang.Throwable -> L40
            boolean r1 = okhttp3.internal.Util.canReuseConnectionFor(r1, r3)     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L3a
            monitor-exit(r0)
            return r2
        L3a:
            okhttp3.Route r1 = r0.route()     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)
            return r1
        L40:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L43:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http.ExchangeCodec find(@org.jetbrains.annotations.NotNull okhttp3.OkHttpClient r9, @org.jetbrains.annotations.NotNull okhttp3.internal.http.RealInterceptorChain r10) {
            r8 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r2 = r10.getConnectTimeoutMillis$okhttp()     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            int r3 = r10.getReadTimeoutMillis$okhttp()     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            int r4 = r10.getWriteTimeoutMillis$okhttp()     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            int r5 = r9.pingIntervalMillis()     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            boolean r6 = r9.retryOnConnectionFailure()     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            okhttp3.Request r0 = r10.getRequest$okhttp()     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            java.lang.String r0 = r0.method()     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            java.lang.String r1 = "GET"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            r7 = r0 ^ 1
            r1 = r8
            okhttp3.internal.connection.RealConnection r0 = r1.findHealthyConnection(r2, r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            okhttp3.internal.http.ExchangeCodec r9 = r0.newCodec$okhttp(r9, r10)     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            return r9
        L38:
            r9 = move-exception
            r8.trackFailure(r9)
            okhttp3.internal.connection.RouteException r10 = new okhttp3.internal.connection.RouteException
            r10.<init>(r9)
            throw r10
        L42:
            r9 = move-exception
            java.io.IOException r10 = r9.getLastConnectException()
            r8.trackFailure(r10)
            throw r9
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Address getAddress$okhttp() {
            r1 = this;
            okhttp3.Address r0 = r1.address
            return r0
    }

    public final boolean retryAfterFailure() {
            r2 = this;
            int r0 = r2.refusedStreamCount
            if (r0 != 0) goto Le
            int r0 = r2.connectionShutdownCount
            if (r0 != 0) goto Le
            int r0 = r2.otherFailureCount
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            okhttp3.Route r0 = r2.nextRouteToTry
            r1 = 1
            if (r0 == 0) goto L14
            return r1
        L14:
            okhttp3.Route r0 = r2.retryRoute()
            if (r0 == 0) goto L1d
            r2.nextRouteToTry = r0
            return r1
        L1d:
            okhttp3.internal.connection.RouteSelector$Selection r0 = r2.routeSelection
            if (r0 == 0) goto L28
            boolean r0 = r0.hasNext()
            if (r0 != r1) goto L28
            return r1
        L28:
            okhttp3.internal.connection.RouteSelector r0 = r2.routeSelector
            if (r0 == 0) goto L31
            boolean r0 = r0.hasNext()
            return r0
        L31:
            return r1
    }

    public final boolean sameHostAndPort(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r4) {
            r3 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okhttp3.Address r0 = r3.address
            okhttp3.HttpUrl r0 = r0.url()
            int r1 = r4.port()
            int r2 = r0.port()
            if (r1 != r2) goto L25
            java.lang.String r4 = r4.host()
            java.lang.String r0 = r0.host()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
            if (r4 == 0) goto L25
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            return r4
    }

    public final void trackFailure(@org.jetbrains.annotations.NotNull java.io.IOException r3) {
            r2 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r2.nextRouteToTry = r0
            boolean r0 = r3 instanceof okhttp3.internal.http2.StreamResetException
            if (r0 == 0) goto L1c
            r0 = r3
            okhttp3.internal.http2.StreamResetException r0 = (okhttp3.internal.http2.StreamResetException) r0
            okhttp3.internal.http2.ErrorCode r0 = r0.errorCode
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM
            if (r0 != r1) goto L1c
            int r3 = r2.refusedStreamCount
            int r3 = r3 + 1
            r2.refusedStreamCount = r3
            goto L2d
        L1c:
            boolean r3 = r3 instanceof okhttp3.internal.http2.ConnectionShutdownException
            if (r3 == 0) goto L27
            int r3 = r2.connectionShutdownCount
            int r3 = r3 + 1
            r2.connectionShutdownCount = r3
            goto L2d
        L27:
            int r3 = r2.otherFailureCount
            int r3 = r3 + 1
            r2.otherFailureCount = r3
        L2d:
            return
    }
}
