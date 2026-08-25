package okhttp3.internal.http;

/* JADX INFO: compiled from: RetryAndFollowUpInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J(\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "buildRedirectRequest", "Lokhttp3/Request;", "userResponse", "Lokhttp3/Response;", "method", "", "followUpRequest", "exchange", "Lokhttp3/internal/connection/Exchange;", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "isRecoverable", "", "e", "Ljava/io/IOException;", "requestSendStarted", "recover", "call", "Lokhttp3/internal/connection/RealCall;", "userRequest", "requestIsOneShot", "retryAfter", "", "defaultDelay", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class RetryAndFollowUpInterceptor implements okhttp3.Interceptor {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http.RetryAndFollowUpInterceptor.Companion Companion = null;
    private static final int MAX_FOLLOW_UPS = 20;
    private final okhttp3.OkHttpClient client;

    /* JADX INFO: compiled from: RetryAndFollowUpInterceptor.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor$Companion;", "", "()V", "MAX_FOLLOW_UPS", "", "okhttp"}, k = 1, mv = {1, 4, 1})
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
    }

    static {
            okhttp3.internal.http.RetryAndFollowUpInterceptor$Companion r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http.RetryAndFollowUpInterceptor.Companion = r0
            return
    }

    public RetryAndFollowUpInterceptor(@org.jetbrains.annotations.NotNull okhttp3.OkHttpClient r2) {
            r1 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.client = r2
            return
    }

    private final okhttp3.Request buildRedirectRequest(okhttp3.Response r9, java.lang.String r10) {
            r8 = this;
            okhttp3.OkHttpClient r0 = r8.client
            boolean r0 = r0.followRedirects()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            r0 = 2
            java.lang.String r2 = "Location"
            java.lang.String r0 = okhttp3.Response.header$default(r9, r2, r1, r0, r1)
            if (r0 == 0) goto Lb0
            okhttp3.Request r2 = r9.request()
            okhttp3.HttpUrl r2 = r2.url()
            okhttp3.HttpUrl r0 = r2.resolve(r0)
            if (r0 == 0) goto Lb0
            java.lang.String r2 = r0.scheme()
            okhttp3.Request r3 = r9.request()
            okhttp3.HttpUrl r3 = r3.url()
            java.lang.String r3 = r3.scheme()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L40
            okhttp3.OkHttpClient r2 = r8.client
            boolean r2 = r2.followSslRedirects()
            if (r2 != 0) goto L40
            return r1
        L40:
            okhttp3.Request r2 = r9.request()
            okhttp3.Request$Builder r2 = r2.newBuilder()
            boolean r3 = okhttp3.internal.http.HttpMethod.permitsRequestBody(r10)
            if (r3 == 0) goto L94
            int r3 = r9.code()
            okhttp3.internal.http.HttpMethod r4 = okhttp3.internal.http.HttpMethod.INSTANCE
            boolean r5 = r4.redirectsWithBody(r10)
            r6 = 307(0x133, float:4.3E-43)
            r7 = 308(0x134, float:4.32E-43)
            if (r5 != 0) goto L65
            if (r3 == r7) goto L65
            if (r3 != r6) goto L63
            goto L65
        L63:
            r5 = 0
            goto L66
        L65:
            r5 = 1
        L66:
            boolean r4 = r4.redirectsToGet(r10)
            if (r4 == 0) goto L76
            if (r3 == r7) goto L76
            if (r3 == r6) goto L76
            java.lang.String r10 = "GET"
            r2.method(r10, r1)
            goto L83
        L76:
            if (r5 == 0) goto L80
            okhttp3.Request r1 = r9.request()
            okhttp3.RequestBody r1 = r1.body()
        L80:
            r2.method(r10, r1)
        L83:
            if (r5 != 0) goto L94
            java.lang.String r10 = "Transfer-Encoding"
            r2.removeHeader(r10)
            java.lang.String r10 = "Content-Length"
            r2.removeHeader(r10)
            java.lang.String r10 = "Content-Type"
            r2.removeHeader(r10)
        L94:
            okhttp3.Request r9 = r9.request()
            okhttp3.HttpUrl r9 = r9.url()
            boolean r9 = okhttp3.internal.Util.canReuseConnectionFor(r9, r0)
            if (r9 != 0) goto La7
            java.lang.String r9 = "Authorization"
            r2.removeHeader(r9)
        La7:
            okhttp3.Request$Builder r9 = r2.url(r0)
            okhttp3.Request r9 = r9.build()
            return r9
        Lb0:
            return r1
    }

    private final okhttp3.Request followUpRequest(okhttp3.Response r6, okhttp3.internal.connection.Exchange r7) throws java.io.IOException {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto Le
            okhttp3.internal.connection.RealConnection r1 = r7.getConnection$okhttp()
            if (r1 == 0) goto Le
            okhttp3.Route r1 = r1.route()
            goto Lf
        Le:
            r1 = r0
        Lf:
            int r2 = r6.code()
            okhttp3.Request r3 = r6.request()
            java.lang.String r3 = r3.method()
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto Ldf
            r4 = 308(0x134, float:4.32E-43)
            if (r2 == r4) goto Ldf
            r4 = 401(0x191, float:5.62E-43)
            if (r2 == r4) goto Ld4
            r4 = 421(0x1a5, float:5.9E-43)
            if (r2 == r4) goto Lad
            r7 = 503(0x1f7, float:7.05E-43)
            if (r2 == r7) goto L91
            r7 = 407(0x197, float:5.7E-43)
            if (r2 == r7) goto L6f
            r7 = 408(0x198, float:5.72E-43)
            if (r2 == r7) goto L3b
            switch(r2) {
                case 300: goto Ldf;
                case 301: goto Ldf;
                case 302: goto Ldf;
                case 303: goto Ldf;
                default: goto L3a;
            }
        L3a:
            return r0
        L3b:
            okhttp3.OkHttpClient r1 = r5.client
            boolean r1 = r1.retryOnConnectionFailure()
            if (r1 != 0) goto L44
            return r0
        L44:
            okhttp3.Request r1 = r6.request()
            okhttp3.RequestBody r1 = r1.body()
            if (r1 == 0) goto L55
            boolean r1 = r1.isOneShot()
            if (r1 == 0) goto L55
            return r0
        L55:
            okhttp3.Response r1 = r6.priorResponse()
            if (r1 == 0) goto L62
            int r1 = r1.code()
            if (r1 != r7) goto L62
            return r0
        L62:
            r7 = 0
            int r7 = r5.retryAfter(r6, r7)
            if (r7 <= 0) goto L6a
            return r0
        L6a:
            okhttp3.Request r6 = r6.request()
            return r6
        L6f:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.net.Proxy r7 = r1.proxy()
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r7 != r0) goto L89
            okhttp3.OkHttpClient r7 = r5.client
            okhttp3.Authenticator r7 = r7.proxyAuthenticator()
            okhttp3.Request r6 = r7.authenticate(r1, r6)
            return r6
        L89:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.String r7 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r6.<init>(r7)
            throw r6
        L91:
            okhttp3.Response r1 = r6.priorResponse()
            if (r1 == 0) goto L9e
            int r1 = r1.code()
            if (r1 != r7) goto L9e
            return r0
        L9e:
            r7 = 2147483647(0x7fffffff, float:NaN)
            int r7 = r5.retryAfter(r6, r7)
            if (r7 != 0) goto Lac
            okhttp3.Request r6 = r6.request()
            return r6
        Lac:
            return r0
        Lad:
            okhttp3.Request r1 = r6.request()
            okhttp3.RequestBody r1 = r1.body()
            if (r1 == 0) goto Lbe
            boolean r1 = r1.isOneShot()
            if (r1 == 0) goto Lbe
            return r0
        Lbe:
            if (r7 == 0) goto Ld3
            boolean r1 = r7.isCoalescedConnection$okhttp()
            if (r1 != 0) goto Lc7
            goto Ld3
        Lc7:
            okhttp3.internal.connection.RealConnection r7 = r7.getConnection$okhttp()
            r7.noCoalescedConnections$okhttp()
            okhttp3.Request r6 = r6.request()
            return r6
        Ld3:
            return r0
        Ld4:
            okhttp3.OkHttpClient r7 = r5.client
            okhttp3.Authenticator r7 = r7.authenticator()
            okhttp3.Request r6 = r7.authenticate(r1, r6)
            return r6
        Ldf:
            okhttp3.Request r6 = r5.buildRedirectRequest(r6, r3)
            return r6
    }

    private final boolean isRecoverable(java.io.IOException r4, boolean r5) {
            r3 = this;
            boolean r0 = r4 instanceof java.net.ProtocolException
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r4 instanceof java.io.InterruptedIOException
            r2 = 1
            if (r0 == 0) goto L13
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto L12
            if (r5 != 0) goto L12
            r1 = 1
        L12:
            return r1
        L13:
            boolean r5 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L20
            java.lang.Throwable r5 = r4.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L20
            return r1
        L20:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L25
            return r1
        L25:
            return r2
    }

    private final boolean recover(java.io.IOException r3, okhttp3.internal.connection.RealCall r4, okhttp3.Request r5, boolean r6) {
            r2 = this;
            okhttp3.OkHttpClient r0 = r2.client
            boolean r0 = r0.retryOnConnectionFailure()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            if (r6 == 0) goto L13
            boolean r5 = r2.requestIsOneShot(r3, r5)
            if (r5 == 0) goto L13
            return r1
        L13:
            boolean r3 = r2.isRecoverable(r3, r6)
            if (r3 != 0) goto L1a
            return r1
        L1a:
            boolean r3 = r4.retryAfterFailure()
            if (r3 != 0) goto L21
            return r1
        L21:
            r3 = 1
            return r3
    }

    private final boolean requestIsOneShot(java.io.IOException r1, okhttp3.Request r2) {
            r0 = this;
            okhttp3.RequestBody r2 = r2.body()
            if (r2 == 0) goto Lc
            boolean r2 = r2.isOneShot()
            if (r2 != 0) goto L10
        Lc:
            boolean r1 = r1 instanceof java.io.FileNotFoundException
            if (r1 == 0) goto L12
        L10:
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    private final int retryAfter(okhttp3.Response r4, int r5) {
            r3 = this;
            java.lang.String r0 = "Retry-After"
            r1 = 0
            r2 = 2
            java.lang.String r4 = okhttp3.Response.header$default(r4, r0, r1, r2, r1)
            if (r4 == 0) goto L29
            kotlin.text.Regex r5 = new kotlin.text.Regex
            java.lang.String r0 = "\\d+"
            r5.<init>(r0)
            boolean r5 = r5.matches(r4)
            if (r5 == 0) goto L25
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Integer.valueOf(header)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            int r4 = r4.intValue()
            return r4
        L25:
            r4 = 2147483647(0x7fffffff, float:NaN)
            return r4
        L29:
            return r5
    }

    @Override // okhttp3.Interceptor
    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r11) throws java.io.IOException {
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            okhttp3.internal.http.RealInterceptorChain r11 = (okhttp3.internal.http.RealInterceptorChain) r11
            okhttp3.Request r0 = r11.getRequest$okhttp()
            okhttp3.internal.connection.RealCall r1 = r11.getCall$okhttp()
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            r3 = 0
            r4 = 1
            r5 = 0
            r7 = r3
            r6 = 1
            r8 = 0
        L19:
            r1.enterNetworkInterceptorExchange(r0, r6)
            boolean r6 = r1.isCanceled()     // Catch: java.lang.Throwable -> Ld8
            if (r6 != 0) goto Ld0
            okhttp3.Response r0 = r11.proceed(r0)     // Catch: java.io.IOException -> L96 okhttp3.internal.connection.RouteException -> Lae java.lang.Throwable -> Ld8
            if (r7 == 0) goto L40
            okhttp3.Response$Builder r0 = r0.newBuilder()     // Catch: java.lang.Throwable -> Ld8
            okhttp3.Response$Builder r6 = r7.newBuilder()     // Catch: java.lang.Throwable -> Ld8
            okhttp3.Response$Builder r6 = r6.body(r3)     // Catch: java.lang.Throwable -> Ld8
            okhttp3.Response r6 = r6.build()     // Catch: java.lang.Throwable -> Ld8
            okhttp3.Response$Builder r0 = r0.priorResponse(r6)     // Catch: java.lang.Throwable -> Ld8
            okhttp3.Response r0 = r0.build()     // Catch: java.lang.Throwable -> Ld8
        L40:
            r7 = r0
            okhttp3.internal.connection.Exchange r0 = r1.getInterceptorScopedExchange$okhttp()     // Catch: java.lang.Throwable -> Ld8
            okhttp3.Request r6 = r10.followUpRequest(r7, r0)     // Catch: java.lang.Throwable -> Ld8
            if (r6 != 0) goto L5a
            if (r0 == 0) goto L56
            boolean r11 = r0.isDuplex$okhttp()     // Catch: java.lang.Throwable -> Ld8
            if (r11 == 0) goto L56
            r1.timeoutEarlyExit()     // Catch: java.lang.Throwable -> Ld8
        L56:
            r1.exitNetworkInterceptorExchange$okhttp(r5)
            return r7
        L5a:
            okhttp3.RequestBody r0 = r6.body()     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L6a
            boolean r0 = r0.isOneShot()     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L6a
            r1.exitNetworkInterceptorExchange$okhttp(r5)
            return r7
        L6a:
            okhttp3.ResponseBody r0 = r7.body()     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L73
            okhttp3.internal.Util.closeQuietly(r0)     // Catch: java.lang.Throwable -> Ld8
        L73:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L7f
            r1.exitNetworkInterceptorExchange$okhttp(r4)
            r0 = r6
            r6 = 1
            goto L19
        L7f:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> Ld8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld8
            r0.<init>()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld8
            r0.append(r8)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld8
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ld8
            throw r11     // Catch: java.lang.Throwable -> Ld8
        L96:
            r6 = move-exception
            boolean r9 = r6 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> Ld8
            if (r9 != 0) goto L9d
            r9 = 1
            goto L9e
        L9d:
            r9 = 0
        L9e:
            boolean r9 = r10.recover(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> Ld8
            if (r9 == 0) goto La9
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r2, r6)     // Catch: java.lang.Throwable -> Ld8
            goto Lc1
        La9:
            java.lang.Throwable r11 = okhttp3.internal.Util.withSuppressed(r6, r2)     // Catch: java.lang.Throwable -> Ld8
            throw r11     // Catch: java.lang.Throwable -> Ld8
        Lae:
            r6 = move-exception
            java.io.IOException r9 = r6.getLastConnectException()     // Catch: java.lang.Throwable -> Ld8
            boolean r9 = r10.recover(r9, r1, r0, r5)     // Catch: java.lang.Throwable -> Ld8
            if (r9 == 0) goto Lc7
            java.io.IOException r6 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> Ld8
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r2, r6)     // Catch: java.lang.Throwable -> Ld8
        Lc1:
            r1.exitNetworkInterceptorExchange$okhttp(r4)
            r6 = 0
            goto L19
        Lc7:
            java.io.IOException r11 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> Ld8
            java.lang.Throwable r11 = okhttp3.internal.Util.withSuppressed(r11, r2)     // Catch: java.lang.Throwable -> Ld8
            throw r11     // Catch: java.lang.Throwable -> Ld8
        Ld0:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ld8
            throw r11     // Catch: java.lang.Throwable -> Ld8
        Ld8:
            r11 = move-exception
            r1.exitNetworkInterceptorExchange$okhttp(r4)
            throw r11
    }
}
