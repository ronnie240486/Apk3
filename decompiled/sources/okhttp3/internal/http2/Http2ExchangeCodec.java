package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2ExchangeCodec.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 (2\u00020\u0001:\u0001(B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\fH\u0016J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "client", "Lokhttp3/OkHttpClient;", "connection", "Lokhttp3/internal/connection/RealConnection;", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lokhttp3/internal/http/RealInterceptorChain;Lokhttp3/internal/http2/Http2Connection;)V", "canceled", "", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "protocol", "Lokhttp3/Protocol;", "stream", "Lokhttp3/internal/http2/Http2Stream;", "cancel", "", "createRequestBody", "Lokio/Sink;", "request", "Lokhttp3/Request;", "contentLength", "", "finishRequest", "flushRequest", "openResponseBodySource", "Lokio/Source;", "response", "Lokhttp3/Response;", "readResponseHeaders", "Lokhttp3/Response$Builder;", "expectContinue", "reportedContentLength", "trailers", "Lokhttp3/Headers;", "writeRequestHeaders", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Http2ExchangeCodec implements okhttp3.internal.http.ExchangeCodec {
    private static final java.lang.String CONNECTION = "connection";

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Http2ExchangeCodec.Companion Companion = null;
    private static final java.lang.String ENCODING = "encoding";
    private static final java.lang.String HOST = "host";
    private static final java.util.List<java.lang.String> HTTP_2_SKIPPED_REQUEST_HEADERS = null;
    private static final java.util.List<java.lang.String> HTTP_2_SKIPPED_RESPONSE_HEADERS = null;
    private static final java.lang.String KEEP_ALIVE = "keep-alive";
    private static final java.lang.String PROXY_CONNECTION = "proxy-connection";
    private static final java.lang.String TE = "te";
    private static final java.lang.String TRANSFER_ENCODING = "transfer-encoding";
    private static final java.lang.String UPGRADE = "upgrade";
    private volatile boolean canceled;
    private final okhttp3.internal.http.RealInterceptorChain chain;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealConnection connection;
    private final okhttp3.internal.http2.Http2Connection http2Connection;
    private final okhttp3.Protocol protocol;
    private volatile okhttp3.internal.http2.Http2Stream stream;

    /* JADX INFO: compiled from: Http2ExchangeCodec.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;", "", "()V", "CONNECTION", "", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "http2HeadersList", "Lokhttp3/internal/http2/Header;", "request", "Lokhttp3/Request;", "readHttp2HeadersList", "Lokhttp3/Response$Builder;", "headerBlock", "Lokhttp3/Headers;", "protocol", "Lokhttp3/Protocol;", "okhttp"}, k = 1, mv = {1, 4, 1})
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
        public final java.util.List<okhttp3.internal.http2.Header> http2HeadersList(@org.jetbrains.annotations.NotNull okhttp3.Request r7) {
                r6 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                okhttp3.Headers r0 = r7.headers()
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + 4
                r1.<init>(r2)
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                okio.ByteString r3 = okhttp3.internal.http2.Header.TARGET_METHOD
                java.lang.String r4 = r7.method()
                r2.<init>(r3, r4)
                r1.add(r2)
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                okio.ByteString r3 = okhttp3.internal.http2.Header.TARGET_PATH
                okhttp3.internal.http.RequestLine r4 = okhttp3.internal.http.RequestLine.INSTANCE
                okhttp3.HttpUrl r5 = r7.url()
                java.lang.String r4 = r4.requestPath(r5)
                r2.<init>(r3, r4)
                r1.add(r2)
                java.lang.String r2 = "Host"
                java.lang.String r2 = r7.header(r2)
                if (r2 == 0) goto L48
                okhttp3.internal.http2.Header r3 = new okhttp3.internal.http2.Header
                okio.ByteString r4 = okhttp3.internal.http2.Header.TARGET_AUTHORITY
                r3.<init>(r4, r2)
                r1.add(r3)
            L48:
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                okio.ByteString r3 = okhttp3.internal.http2.Header.TARGET_SCHEME
                okhttp3.HttpUrl r7 = r7.url()
                java.lang.String r7 = r7.scheme()
                r2.<init>(r3, r7)
                r1.add(r2)
                r7 = 0
                int r2 = r0.size()
            L5f:
                if (r7 >= r2) goto La9
                java.lang.String r3 = r0.name(r7)
                java.util.Locale r4 = java.util.Locale.US
                java.lang.String r5 = "Locale.US"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
                java.lang.String r5 = "null cannot be cast to non-null type java.lang.String"
                java.util.Objects.requireNonNull(r3, r5)
                java.lang.String r3 = r3.toLowerCase(r4)
                java.lang.String r4 = "(this as java.lang.String).toLowerCase(locale)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                java.util.List r4 = okhttp3.internal.http2.Http2ExchangeCodec.access$getHTTP_2_SKIPPED_REQUEST_HEADERS$cp()
                boolean r4 = r4.contains(r3)
                if (r4 == 0) goto L9a
                java.lang.String r4 = "te"
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
                if (r4 == 0) goto La6
                java.lang.String r4 = r0.value(r7)
                java.lang.String r5 = "trailers"
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
                if (r4 == 0) goto La6
            L9a:
                okhttp3.internal.http2.Header r4 = new okhttp3.internal.http2.Header
                java.lang.String r5 = r0.value(r7)
                r4.<init>(r3, r5)
                r1.add(r4)
            La6:
                int r7 = r7 + 1
                goto L5f
            La9:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Response.Builder readHttp2HeadersList(@org.jetbrains.annotations.NotNull okhttp3.Headers r8, @org.jetbrains.annotations.NotNull okhttp3.Protocol r9) {
                r7 = this;
                java.lang.String r0 = "headerBlock"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.lang.String r0 = "protocol"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                int r1 = r8.size()
                r2 = 0
                r3 = 0
            L15:
                if (r3 >= r1) goto L4f
                java.lang.String r4 = r8.name(r3)
                java.lang.String r5 = r8.value(r3)
                java.lang.String r6 = ":status"
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)
                if (r6 == 0) goto L3f
                okhttp3.internal.http.StatusLine$Companion r2 = okhttp3.internal.http.StatusLine.Companion
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r6 = "HTTP/1.1 "
                r4.append(r6)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                okhttp3.internal.http.StatusLine r2 = r2.parse(r4)
                goto L4c
            L3f:
                java.util.List r6 = okhttp3.internal.http2.Http2ExchangeCodec.access$getHTTP_2_SKIPPED_RESPONSE_HEADERS$cp()
                boolean r6 = r6.contains(r4)
                if (r6 != 0) goto L4c
                r0.addLenient$okhttp(r4, r5)
            L4c:
                int r3 = r3 + 1
                goto L15
            L4f:
                if (r2 == 0) goto L6f
                okhttp3.Response$Builder r8 = new okhttp3.Response$Builder
                r8.<init>()
                okhttp3.Response$Builder r8 = r8.protocol(r9)
                int r9 = r2.code
                okhttp3.Response$Builder r8 = r8.code(r9)
                java.lang.String r9 = r2.message
                okhttp3.Response$Builder r8 = r8.message(r9)
                okhttp3.Headers r9 = r0.build()
                okhttp3.Response$Builder r8 = r8.headers(r9)
                return r8
            L6f:
                java.net.ProtocolException r8 = new java.net.ProtocolException
                java.lang.String r9 = "Expected ':status' header not present"
                r8.<init>(r9)
                throw r8
        }
    }

    static {
            okhttp3.internal.http2.Http2ExchangeCodec$Companion r0 = new okhttp3.internal.http2.Http2ExchangeCodec$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Http2ExchangeCodec.Companion = r0
            java.lang.String r2 = "connection"
            java.lang.String r3 = "host"
            java.lang.String r4 = "keep-alive"
            java.lang.String r5 = "proxy-connection"
            java.lang.String r6 = "te"
            java.lang.String r7 = "transfer-encoding"
            java.lang.String r8 = "encoding"
            java.lang.String r9 = "upgrade"
            java.lang.String r10 = ":method"
            java.lang.String r11 = ":path"
            java.lang.String r12 = ":scheme"
            java.lang.String r13 = ":authority"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.util.List r0 = okhttp3.internal.Util.immutableListOf(r0)
            okhttp3.internal.http2.Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS = r0
            java.lang.String r1 = "connection"
            java.lang.String r2 = "host"
            java.lang.String r3 = "keep-alive"
            java.lang.String r4 = "proxy-connection"
            java.lang.String r5 = "te"
            java.lang.String r6 = "transfer-encoding"
            java.lang.String r7 = "encoding"
            java.lang.String r8 = "upgrade"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.List r0 = okhttp3.internal.Util.immutableListOf(r0)
            okhttp3.internal.http2.Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS = r0
            return
    }

    public Http2ExchangeCodec(@org.jetbrains.annotations.NotNull okhttp3.OkHttpClient r2, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnection r3, @org.jetbrains.annotations.NotNull okhttp3.internal.http.RealInterceptorChain r4, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Connection r5) {
            r1 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "http2Connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r1.<init>()
            r1.connection = r3
            r1.chain = r4
            r1.http2Connection = r5
            java.util.List r2 = r2.protocols()
            okhttp3.Protocol r3 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L2a
            goto L2c
        L2a:
            okhttp3.Protocol r3 = okhttp3.Protocol.HTTP_2
        L2c:
            r1.protocol = r3
            return
    }

    public static final /* synthetic */ java.util.List access$getHTTP_2_SKIPPED_REQUEST_HEADERS$cp() {
            java.util.List<java.lang.String> r0 = okhttp3.internal.http2.Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS
            return r0
    }

    public static final /* synthetic */ java.util.List access$getHTTP_2_SKIPPED_RESPONSE_HEADERS$cp() {
            java.util.List<java.lang.String> r0 = okhttp3.internal.http2.Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
            r2 = this;
            r0 = 1
            r2.canceled = r0
            okhttp3.internal.http2.Http2Stream r0 = r2.stream
            if (r0 == 0) goto Lc
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL
            r0.closeLater(r1)
        Lc:
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.NotNull
    public okio.Sink createRequestBody(@org.jetbrains.annotations.NotNull okhttp3.Request r1, long r2) {
            r0 = this;
            java.lang.String r2 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            okhttp3.internal.http2.Http2Stream r1 = r0.stream
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okio.Sink r1 = r1.getSink()
            return r1
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream r0 = r1.stream
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okio.Sink r0 = r0.getSink()
            r0.close()
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection r0 = r1.http2Connection
            r0.flush()
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.NotNull
    public okhttp3.internal.connection.RealConnection getConnection() {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.connection
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.NotNull
    public okio.Source openResponseBodySource(@org.jetbrains.annotations.NotNull okhttp3.Response r2) {
            r1 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.internal.http2.Http2Stream r2 = r1.stream
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okhttp3.internal.http2.Http2Stream$FramingSource r2 = r2.getSource$okhttp()
            return r2
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.Nullable
    public okhttp3.Response.Builder readResponseHeaders(boolean r4) {
            r3 = this;
            okhttp3.internal.http2.Http2Stream r0 = r3.stream
            if (r0 == 0) goto L1c
            okhttp3.Headers r0 = r0.takeHeaders()
            okhttp3.internal.http2.Http2ExchangeCodec$Companion r1 = okhttp3.internal.http2.Http2ExchangeCodec.Companion
            okhttp3.Protocol r2 = r3.protocol
            okhttp3.Response$Builder r0 = r1.readHttp2HeadersList(r0, r2)
            if (r4 == 0) goto L1b
            int r4 = r0.getCode$okhttp()
            r1 = 100
            if (r4 != r1) goto L1b
            r0 = 0
        L1b:
            return r0
        L1c:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "stream wasn't created"
            r4.<init>(r0)
            throw r4
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(@org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r2 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = okhttp3.internal.http.HttpHeaders.promisesBody(r3)
            if (r0 != 0) goto Le
            r0 = 0
            goto L12
        Le:
            long r0 = okhttp3.internal.Util.headersContentLength(r3)
        L12:
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.NotNull
    public okhttp3.Headers trailers() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream r0 = r1.stream
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okhttp3.Headers r0 = r0.trailers()
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(@org.jetbrains.annotations.NotNull okhttp3.Request r4) {
            r3 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okhttp3.internal.http2.Http2Stream r0 = r3.stream
            if (r0 == 0) goto La
            return
        La:
            okhttp3.RequestBody r0 = r4.body()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            okhttp3.internal.http2.Http2ExchangeCodec$Companion r1 = okhttp3.internal.http2.Http2ExchangeCodec.Companion
            java.util.List r4 = r1.http2HeadersList(r4)
            okhttp3.internal.http2.Http2Connection r1 = r3.http2Connection
            okhttp3.internal.http2.Http2Stream r4 = r1.newStream(r4, r0)
            r3.stream = r4
            boolean r4 = r3.canceled
            if (r4 != 0) goto L4e
            okhttp3.internal.http2.Http2Stream r4 = r3.stream
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            okio.Timeout r4 = r4.readTimeout()
            okhttp3.internal.http.RealInterceptorChain r0 = r3.chain
            int r0 = r0.getReadTimeoutMillis$okhttp()
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.timeout(r0, r2)
            okhttp3.internal.http2.Http2Stream r4 = r3.stream
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            okio.Timeout r4 = r4.writeTimeout()
            okhttp3.internal.http.RealInterceptorChain r0 = r3.chain
            int r0 = r0.getWriteTimeoutMillis$okhttp()
            long r0 = (long) r0
            r4.timeout(r0, r2)
            return
        L4e:
            okhttp3.internal.http2.Http2Stream r4 = r3.stream
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL
            r4.closeLater(r0)
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r4.<init>(r0)
            throw r4
    }
}
