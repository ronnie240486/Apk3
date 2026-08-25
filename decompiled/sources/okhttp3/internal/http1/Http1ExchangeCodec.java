package okhttp3.internal.http1;

/* JADX INFO: compiled from: Http1ExchangeCodec.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 ?2\u00020\u0001:\u0007<=>?@ABB'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u001cH\u0016J\b\u0010&\u001a\u00020\u001cH\u0016J\b\u0010'\u001a\u00020\u001eH\u0002J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020!H\u0002J\b\u0010.\u001a\u00020\u001eH\u0002J\b\u0010/\u001a\u00020)H\u0002J\u0010\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020\u0019H\u0016J\u0012\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u0010H\u0016J\u0010\u00105\u001a\u00020!2\u0006\u00101\u001a\u00020\u0019H\u0016J\u000e\u00106\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u0019J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\u00152\u0006\u00109\u001a\u00020:J\u0010\u0010;\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0017H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\u00020\u0010*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0018\u0010\u0016\u001a\u00020\u0010*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001a¨\u0006C"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "client", "Lokhttp3/OkHttpClient;", "connection", "Lokhttp3/internal/connection/RealConnection;", "source", "Lokio/BufferedSource;", "sink", "Lokio/BufferedSink;", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lokio/BufferedSource;Lokio/BufferedSink;)V", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "headersReader", "Lokhttp3/internal/http1/HeadersReader;", "isClosed", "", "()Z", "state", "", "trailers", "Lokhttp3/Headers;", "isChunked", "Lokhttp3/Request;", "(Lokhttp3/Request;)Z", "Lokhttp3/Response;", "(Lokhttp3/Response;)Z", "cancel", "", "createRequestBody", "Lokio/Sink;", "request", "contentLength", "", "detachTimeout", "timeout", "Lokio/ForwardingTimeout;", "finishRequest", "flushRequest", "newChunkedSink", "newChunkedSource", "Lokio/Source;", "url", "Lokhttp3/HttpUrl;", "newFixedLengthSource", "length", "newKnownLengthSink", "newUnknownLengthSource", "openResponseBodySource", "response", "readResponseHeaders", "Lokhttp3/Response$Builder;", "expectContinue", "reportedContentLength", "skipConnectBody", "writeRequest", "headers", "requestLine", "", "writeRequestHeaders", "AbstractSource", "ChunkedSink", "ChunkedSource", "Companion", "FixedLengthSource", "KnownLengthSink", "UnknownLengthSource", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Http1ExchangeCodec implements okhttp3.internal.http.ExchangeCodec {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http1.Http1ExchangeCodec.Companion Companion = null;
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final okhttp3.OkHttpClient client;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealConnection connection;
    private final okhttp3.internal.http1.HeadersReader headersReader;
    private final okio.BufferedSink sink;
    private final okio.BufferedSource source;
    private int state;
    private okhttp3.Headers trailers;

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\tR\u001a\u0010\u0003\u001a\u00020\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokio/Source;", "Lokio/Timeout;", "timeout", "Lokio/Buffer;", "sink", "", "byteCount", "read", "", "responseBodyComplete", "Lokio/ForwardingTimeout;", "Lokio/ForwardingTimeout;", "getTimeout", "()Lokio/ForwardingTimeout;", "", "closed", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "okhttp"}, k = 1, mv = {1, 4, 1})
    public abstract class AbstractSource implements okio.Source {
        private boolean closed;
        public final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;

        @org.jetbrains.annotations.NotNull
        private final okio.ForwardingTimeout timeout;

        public AbstractSource(okhttp3.internal.http1.Http1ExchangeCodec r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                okio.ForwardingTimeout r0 = new okio.ForwardingTimeout
                okio.BufferedSource r2 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r2)
                okio.Timeout r2 = r2.timeout()
                r0.<init>(r2)
                r1.timeout = r0
                return
        }

        public final boolean getClosed() {
                r1 = this;
                boolean r0 = r1.closed
                return r0
        }

        @Override // okio.Source
        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r2, long r3) {
                r1 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r1.this$0     // Catch: java.io.IOException -> L11
                okio.BufferedSource r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r0)     // Catch: java.io.IOException -> L11
                long r2 = r0.read(r2, r3)     // Catch: java.io.IOException -> L11
                return r2
            L11:
                r2 = move-exception
                okhttp3.internal.http1.Http1ExchangeCodec r3 = r1.this$0
                okhttp3.internal.connection.RealConnection r3 = r3.getConnection()
                r3.noNewExchanges$okhttp()
                r1.responseBodyComplete()
                throw r2
        }

        public final void responseBodyComplete() {
                r3 = this;
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                int r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getState$p(r0)
                r1 = 6
                if (r0 != r1) goto La
                return
            La:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                int r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getState$p(r0)
                r2 = 5
                if (r0 != r2) goto L20
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                okio.ForwardingTimeout r2 = r3.timeout
                okhttp3.internal.http1.Http1ExchangeCodec.access$detachTimeout(r0, r2)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                okhttp3.internal.http1.Http1ExchangeCodec.access$setState$p(r0, r1)
                return
            L20:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "state: "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                okhttp3.internal.http1.Http1ExchangeCodec r2 = r3.this$0
                int r2 = okhttp3.internal.http1.Http1ExchangeCodec.access$getState$p(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public final void setClosed(boolean r1) {
                r0 = this;
                r1 = 1
                r0.closed = r1
                return
        }

        @Override // okio.Source
        @org.jetbrains.annotations.NotNull
        public okio.Timeout timeout() {
                r1 = this;
                okio.ForwardingTimeout r0 = r1.timeout
                return r0
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0005\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "Lokio/Sink;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "closed", "", "timeout", "Lokio/ForwardingTimeout;", "close", "", "flush", "Lokio/Timeout;", "write", "source", "Lokio/Buffer;", "byteCount", "", "okhttp"}, k = 1, mv = {1, 4, 1})
    public final class ChunkedSink implements okio.Sink {
        private boolean closed;
        public final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;
        private final okio.ForwardingTimeout timeout;

        public ChunkedSink(okhttp3.internal.http1.Http1ExchangeCodec r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                okio.ForwardingTimeout r0 = new okio.ForwardingTimeout
                okio.BufferedSink r2 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r2)
                okio.Timeout r2 = r2.timeout()
                r0.<init>(r2)
                r1.timeout = r0
                return
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L24
                if (r0 == 0) goto L7
                monitor-exit(r2)
                return
            L7:
                r0 = 1
                r2.closed = r0     // Catch: java.lang.Throwable -> L24
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0     // Catch: java.lang.Throwable -> L24
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r0)     // Catch: java.lang.Throwable -> L24
                java.lang.String r1 = "0\r\n\r\n"
                r0.writeUtf8(r1)     // Catch: java.lang.Throwable -> L24
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0     // Catch: java.lang.Throwable -> L24
                okio.ForwardingTimeout r1 = r2.timeout     // Catch: java.lang.Throwable -> L24
                okhttp3.internal.http1.Http1ExchangeCodec.access$detachTimeout(r0, r1)     // Catch: java.lang.Throwable -> L24
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0     // Catch: java.lang.Throwable -> L24
                r1 = 3
                okhttp3.internal.http1.Http1ExchangeCodec.access$setState$p(r0, r1)     // Catch: java.lang.Throwable -> L24
                monitor-exit(r2)
                return
            L24:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.closed     // Catch: java.lang.Throwable -> L12
                if (r0 == 0) goto L7
                monitor-exit(r1)
                return
            L7:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r1.this$0     // Catch: java.lang.Throwable -> L12
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r0)     // Catch: java.lang.Throwable -> L12
                r0.flush()     // Catch: java.lang.Throwable -> L12
                monitor-exit(r1)
                return
            L12:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
        }

        @Override // okio.Sink
        @org.jetbrains.annotations.NotNull
        public okio.Timeout timeout() {
                r1 = this;
                okio.ForwardingTimeout r0 = r1.timeout
                return r0
        }

        @Override // okio.Sink
        public void write(@org.jetbrains.annotations.NotNull okio.Buffer r4, long r5) {
                r3 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                boolean r0 = r3.closed
                r0 = r0 ^ 1
                if (r0 == 0) goto L3a
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 != 0) goto L13
                return
            L13:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r0)
                r0.writeHexadecimalUnsignedLong(r5)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r0)
                java.lang.String r1 = "\r\n"
                r0.writeUtf8(r1)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r0)
                r0.write(r4, r5)
                okhttp3.internal.http1.Http1ExchangeCodec r4 = r3.this$0
                okio.BufferedSink r4 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r4)
                r4.writeUtf8(r1)
                return
            L3a:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "closed"
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "url", "Lokhttp3/HttpUrl;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "bytesRemainingInChunk", "", "hasMoreChunks", "", "close", "", "read", "sink", "Lokio/Buffer;", "byteCount", "readChunkSize", "okhttp"}, k = 1, mv = {1, 4, 1})
    public final class ChunkedSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        public final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;
        private final okhttp3.HttpUrl url;

        public ChunkedSource(@org.jetbrains.annotations.NotNull okhttp3.internal.http1.Http1ExchangeCodec r2, okhttp3.HttpUrl r3) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.this$0 = r2
                r1.<init>(r2)
                r1.url = r3
                r2 = -1
                r1.bytesRemainingInChunk = r2
                r2 = 1
                r1.hasMoreChunks = r2
                return
        }

        private final void readChunkSize() {
                r6 = this;
                long r0 = r6.bytesRemainingInChunk
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L11
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r6.this$0
                okio.BufferedSource r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r0)
                r0.readUtf8LineStrict()
            L11:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r6.this$0     // Catch: java.lang.NumberFormatException -> Laf
                okio.BufferedSource r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r0)     // Catch: java.lang.NumberFormatException -> Laf
                long r0 = r0.readHexadecimalUnsignedLong()     // Catch: java.lang.NumberFormatException -> Laf
                r6.bytesRemainingInChunk = r0     // Catch: java.lang.NumberFormatException -> Laf
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r6.this$0     // Catch: java.lang.NumberFormatException -> Laf
                okio.BufferedSource r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r0)     // Catch: java.lang.NumberFormatException -> Laf
                java.lang.String r0 = r0.readUtf8LineStrict()     // Catch: java.lang.NumberFormatException -> Laf
                if (r0 == 0) goto La7
                java.lang.CharSequence r0 = kotlin.text.StringsKt.trim(r0)     // Catch: java.lang.NumberFormatException -> Laf
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> Laf
                long r1 = r6.bytesRemainingInChunk     // Catch: java.lang.NumberFormatException -> Laf
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 < 0) goto L81
                int r1 = r0.length()     // Catch: java.lang.NumberFormatException -> Laf
                r2 = 0
                if (r1 <= 0) goto L42
                r1 = 1
                goto L43
            L42:
                r1 = 0
            L43:
                if (r1 == 0) goto L4d
                java.lang.String r1 = ";"
                boolean r1 = kotlin.text.StringsKt.startsWith$default(r0, r1)     // Catch: java.lang.NumberFormatException -> Laf
                if (r1 == 0) goto L81
            L4d:
                long r0 = r6.bytesRemainingInChunk
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 != 0) goto L80
                r6.hasMoreChunks = r2
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r6.this$0
                okhttp3.internal.http1.HeadersReader r1 = okhttp3.internal.http1.Http1ExchangeCodec.access$getHeadersReader$p(r0)
                okhttp3.Headers r1 = r1.readHeaders()
                okhttp3.internal.http1.Http1ExchangeCodec.access$setTrailers$p(r0, r1)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r6.this$0
                okhttp3.OkHttpClient r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getClient$p(r0)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                okhttp3.CookieJar r0 = r0.cookieJar()
                okhttp3.HttpUrl r1 = r6.url
                okhttp3.internal.http1.Http1ExchangeCodec r2 = r6.this$0
                okhttp3.Headers r2 = okhttp3.internal.http1.Http1ExchangeCodec.access$getTrailers$p(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                okhttp3.internal.http.HttpHeaders.receiveHeaders(r0, r1, r2)
                r6.responseBodyComplete()
            L80:
                return
            L81:
                java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> Laf
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Laf
                r2.<init>()     // Catch: java.lang.NumberFormatException -> Laf
                java.lang.String r3 = "expected chunk size and optional extensions"
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> Laf
                java.lang.String r3 = " but was \""
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> Laf
                long r3 = r6.bytesRemainingInChunk     // Catch: java.lang.NumberFormatException -> Laf
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> Laf
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> Laf
                r0 = 34
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> Laf
                java.lang.String r0 = r2.toString()     // Catch: java.lang.NumberFormatException -> Laf
                r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> Laf
                throw r1     // Catch: java.lang.NumberFormatException -> Laf
            La7:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.NumberFormatException -> Laf
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
                r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> Laf
                throw r0     // Catch: java.lang.NumberFormatException -> Laf
            Laf:
                r0 = move-exception
                java.net.ProtocolException r1 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r2 = this;
                boolean r0 = r2.getClosed()
                if (r0 == 0) goto L7
                return
            L7:
                boolean r0 = r2.hasMoreChunks
                if (r0 == 0) goto L21
                r0 = 100
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
                boolean r0 = okhttp3.internal.Util.discard(r2, r0, r1)
                if (r0 != 0) goto L21
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
                r0.noNewExchanges$okhttp()
                r2.responseBodyComplete()
            L21:
                r0 = 1
                r2.setClosed(r0)
                return
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) {
                r7 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 < 0) goto Ld
                r2 = 1
                goto Le
            Ld:
                r2 = 0
            Le:
                if (r2 == 0) goto L65
                boolean r2 = r7.getClosed()
                r2 = r2 ^ 1
                if (r2 == 0) goto L59
                boolean r2 = r7.hasMoreChunks
                r3 = -1
                if (r2 != 0) goto L1f
                return r3
            L1f:
                long r5 = r7.bytesRemainingInChunk
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 == 0) goto L29
                int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r0 != 0) goto L31
            L29:
                r7.readChunkSize()
                boolean r0 = r7.hasMoreChunks
                if (r0 != 0) goto L31
                return r3
            L31:
                long r0 = r7.bytesRemainingInChunk
                long r9 = java.lang.Math.min(r9, r0)
                long r8 = super.read(r8, r9)
                int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r10 == 0) goto L45
                long r0 = r7.bytesRemainingInChunk
                long r0 = r0 - r8
                r7.bytesRemainingInChunk = r0
                return r8
            L45:
                okhttp3.internal.http1.Http1ExchangeCodec r8 = r7.this$0
                okhttp3.internal.connection.RealConnection r8 = r8.getConnection()
                r8.noNewExchanges$okhttp()
                java.net.ProtocolException r8 = new java.net.ProtocolException
                java.lang.String r9 = "unexpected end of stream"
                r8.<init>(r9)
                r7.responseBodyComplete()
                throw r8
            L59:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
            L65:
                java.lang.String r8 = "byteCount < 0: "
                java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8, r9)
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$Companion;", "", "()V", "NO_CHUNK_YET", "", "STATE_CLOSED", "", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "okhttp"}, k = 1, mv = {1, 4, 1})
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

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "bytesRemaining", "", "(Lokhttp3/internal/http1/Http1ExchangeCodec;J)V", "close", "", "read", "sink", "Lokio/Buffer;", "byteCount", "okhttp"}, k = 1, mv = {1, 4, 1})
    public final class FixedLengthSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {
        private long bytesRemaining;
        public final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;

        public FixedLengthSource(okhttp3.internal.http1.Http1ExchangeCodec r3, long r4) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>(r3)
                r2.bytesRemaining = r4
                r0 = 0
                int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r3 != 0) goto L10
                r2.responseBodyComplete()
            L10:
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r5 = this;
                boolean r0 = r5.getClosed()
                if (r0 == 0) goto L7
                return
            L7:
                long r0 = r5.bytesRemaining
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L25
                r0 = 100
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
                boolean r0 = okhttp3.internal.Util.discard(r5, r0, r1)
                if (r0 != 0) goto L25
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r5.this$0
                okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
                r0.noNewExchanges$okhttp()
                r5.responseBodyComplete()
            L25:
                r0 = 1
                r5.setClosed(r0)
                return
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) {
                r7 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 < 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                if (r2 == 0) goto L5c
                boolean r2 = r7.getClosed()
                r2 = r2 ^ 1
                if (r2 == 0) goto L50
                long r2 = r7.bytesRemaining
                r4 = -1
                int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r6 != 0) goto L22
                return r4
            L22:
                long r9 = java.lang.Math.min(r2, r9)
                long r8 = super.read(r8, r9)
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 == 0) goto L3b
                long r2 = r7.bytesRemaining
                long r2 = r2 - r8
                r7.bytesRemaining = r2
                int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r10 != 0) goto L3a
                r7.responseBodyComplete()
            L3a:
                return r8
            L3b:
                okhttp3.internal.http1.Http1ExchangeCodec r8 = r7.this$0
                okhttp3.internal.connection.RealConnection r8 = r8.getConnection()
                r8.noNewExchanges$okhttp()
                java.net.ProtocolException r8 = new java.net.ProtocolException
                java.lang.String r9 = "unexpected end of stream"
                r8.<init>(r9)
                r7.responseBodyComplete()
                throw r8
            L50:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
            L5c:
                java.lang.String r8 = "byteCount < 0: "
                java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8, r9)
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0005\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "Lokio/Sink;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "closed", "", "timeout", "Lokio/ForwardingTimeout;", "close", "", "flush", "Lokio/Timeout;", "write", "source", "Lokio/Buffer;", "byteCount", "", "okhttp"}, k = 1, mv = {1, 4, 1})
    public final class KnownLengthSink implements okio.Sink {
        private boolean closed;
        public final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;
        private final okio.ForwardingTimeout timeout;

        public KnownLengthSink(okhttp3.internal.http1.Http1ExchangeCodec r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                okio.ForwardingTimeout r0 = new okio.ForwardingTimeout
                okio.BufferedSink r2 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r2)
                okio.Timeout r2 = r2.timeout()
                r0.<init>(r2)
                r1.timeout = r0
                return
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r2 = this;
                boolean r0 = r2.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.closed = r0
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                okio.ForwardingTimeout r1 = r2.timeout
                okhttp3.internal.http1.Http1ExchangeCodec.access$detachTimeout(r0, r1)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                r1 = 3
                okhttp3.internal.http1.Http1ExchangeCodec.access$setState$p(r0, r1)
                return
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
                r1 = this;
                boolean r0 = r1.closed
                if (r0 == 0) goto L5
                return
            L5:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r1.this$0
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r0)
                r0.flush()
                return
        }

        @Override // okio.Sink
        @org.jetbrains.annotations.NotNull
        public okio.Timeout timeout() {
                r1 = this;
                okio.ForwardingTimeout r0 = r1.timeout
                return r0
        }

        @Override // okio.Sink
        public void write(@org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) {
                r7 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                boolean r0 = r7.closed
                r0 = r0 ^ 1
                if (r0 == 0) goto L1f
                long r1 = r8.size()
                r3 = 0
                r5 = r9
                okhttp3.internal.Util.checkOffsetAndCount(r1, r3, r5)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r7.this$0
                okio.BufferedSink r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSink$p(r0)
                r0.write(r8, r9)
                return
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "inputExhausted", "", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "okhttp"}, k = 1, mv = {1, 4, 1})
    public final class UnknownLengthSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource(okhttp3.internal.http1.Http1ExchangeCodec r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                boolean r0 = r1.getClosed()
                if (r0 == 0) goto L7
                return
            L7:
                boolean r0 = r1.inputExhausted
                if (r0 != 0) goto Le
                r1.responseBodyComplete()
            Le:
                r0 = 1
                r1.setClosed(r0)
                return
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r5, long r6) {
                r4 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = 1
                r1 = 0
                int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r3 < 0) goto Lf
                r1 = 1
                goto L10
            Lf:
                r1 = 0
            L10:
                if (r1 == 0) goto L3b
                boolean r1 = r4.getClosed()
                r1 = r1 ^ r0
                if (r1 == 0) goto L2f
                boolean r1 = r4.inputExhausted
                r2 = -1
                if (r1 == 0) goto L20
                return r2
            L20:
                long r5 = super.read(r5, r6)
                int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r7 != 0) goto L2e
                r4.inputExhausted = r0
                r4.responseBodyComplete()
                return r2
            L2e:
                return r5
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "closed"
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                throw r5
            L3b:
                java.lang.String r5 = "byteCount < 0: "
                java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r6)
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r5 = r5.toString()
                r6.<init>(r5)
                throw r6
        }
    }

    static {
            okhttp3.internal.http1.Http1ExchangeCodec$Companion r0 = new okhttp3.internal.http1.Http1ExchangeCodec$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http1.Http1ExchangeCodec.Companion = r0
            return
    }

    public Http1ExchangeCodec(@org.jetbrains.annotations.Nullable okhttp3.OkHttpClient r2, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnection r3, @org.jetbrains.annotations.NotNull okio.BufferedSource r4, @org.jetbrains.annotations.NotNull okio.BufferedSink r5) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r1.<init>()
            r1.client = r2
            r1.connection = r3
            r1.source = r4
            r1.sink = r5
            okhttp3.internal.http1.HeadersReader r2 = new okhttp3.internal.http1.HeadersReader
            r2.<init>(r4)
            r1.headersReader = r2
            return
    }

    public static final /* synthetic */ void access$detachTimeout(okhttp3.internal.http1.Http1ExchangeCodec r0, okio.ForwardingTimeout r1) {
            r0.detachTimeout(r1)
            return
    }

    public static final /* synthetic */ okhttp3.OkHttpClient access$getClient$p(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            okhttp3.OkHttpClient r0 = r0.client
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.http1.HeadersReader access$getHeadersReader$p(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            okhttp3.internal.http1.HeadersReader r0 = r0.headersReader
            return r0
    }

    public static final /* synthetic */ okio.BufferedSink access$getSink$p(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            okio.BufferedSink r0 = r0.sink
            return r0
    }

    public static final /* synthetic */ okio.BufferedSource access$getSource$p(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            okio.BufferedSource r0 = r0.source
            return r0
    }

    public static final /* synthetic */ int access$getState$p(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            int r0 = r0.state
            return r0
    }

    public static final /* synthetic */ okhttp3.Headers access$getTrailers$p(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            okhttp3.Headers r0 = r0.trailers
            return r0
    }

    public static final /* synthetic */ void access$setState$p(okhttp3.internal.http1.Http1ExchangeCodec r0, int r1) {
            r0.state = r1
            return
    }

    public static final /* synthetic */ void access$setTrailers$p(okhttp3.internal.http1.Http1ExchangeCodec r0, okhttp3.Headers r1) {
            r0.trailers = r1
            return
    }

    private final void detachTimeout(okio.ForwardingTimeout r3) {
            r2 = this;
            okio.Timeout r0 = r3.delegate()
            okio.Timeout r1 = okio.Timeout.NONE
            r3.setDelegate(r1)
            r0.clearDeadline()
            r0.clearTimeout()
            return
    }

    private final boolean isChunked(okhttp3.Request r2) {
            r1 = this;
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r2 = r2.header(r0)
            java.lang.String r0 = "chunked"
            boolean r2 = kotlin.text.StringsKt.equals(r0, r2)
            return r2
    }

    private final boolean isChunked(okhttp3.Response r4) {
            r3 = this;
            java.lang.String r0 = "Transfer-Encoding"
            r1 = 0
            r2 = 2
            java.lang.String r4 = okhttp3.Response.header$default(r4, r0, r1, r2, r1)
            java.lang.String r0 = "chunked"
            boolean r4 = kotlin.text.StringsKt.equals(r0, r4)
            return r4
    }

    private final okio.Sink newChunkedSink() {
            r2 = this;
            int r0 = r2.state
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto L12
            r0 = 2
            r2.state = r0
            okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSink r0 = new okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSink
            r0.<init>(r2)
            return r0
        L12:
            java.lang.String r0 = "state: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r2.state
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    private final okio.Source newChunkedSource(okhttp3.HttpUrl r3) {
            r2 = this;
            int r0 = r2.state
            r1 = 4
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto L13
            r0 = 5
            r2.state = r0
            okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSource r0 = new okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSource
            r0.<init>(r2, r3)
            return r0
        L13:
            java.lang.String r3 = "state: "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            int r0 = r2.state
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private final okio.Source newFixedLengthSource(long r3) {
            r2 = this;
            int r0 = r2.state
            r1 = 4
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto L13
            r0 = 5
            r2.state = r0
            okhttp3.internal.http1.Http1ExchangeCodec$FixedLengthSource r0 = new okhttp3.internal.http1.Http1ExchangeCodec$FixedLengthSource
            r0.<init>(r2, r3)
            return r0
        L13:
            java.lang.String r3 = "state: "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            int r4 = r2.state
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    private final okio.Sink newKnownLengthSink() {
            r2 = this;
            int r0 = r2.state
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto L12
            r0 = 2
            r2.state = r0
            okhttp3.internal.http1.Http1ExchangeCodec$KnownLengthSink r0 = new okhttp3.internal.http1.Http1ExchangeCodec$KnownLengthSink
            r0.<init>(r2)
            return r0
        L12:
            java.lang.String r0 = "state: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r2.state
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    private final okio.Source newUnknownLengthSource() {
            r2 = this;
            int r0 = r2.state
            r1 = 4
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto L1a
            r0 = 5
            r2.state = r0
            okhttp3.internal.connection.RealConnection r0 = r2.getConnection()
            r0.noNewExchanges$okhttp()
            okhttp3.internal.http1.Http1ExchangeCodec$UnknownLengthSource r0 = new okhttp3.internal.http1.Http1ExchangeCodec$UnknownLengthSource
            r0.<init>(r2)
            return r0
        L1a:
            java.lang.String r0 = "state: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r2.state
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.getConnection()
            r0.cancel()
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.NotNull
    public okio.Sink createRequestBody(@org.jetbrains.annotations.NotNull okhttp3.Request r3, long r4) {
            r2 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.RequestBody r0 = r3.body()
            if (r0 == 0) goto L1e
            okhttp3.RequestBody r0 = r3.body()
            boolean r0 = r0.isDuplex()
            if (r0 != 0) goto L16
            goto L1e
        L16:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r4 = "Duplex connections are not supported for HTTP/1"
            r3.<init>(r4)
            throw r3
        L1e:
            boolean r3 = r2.isChunked(r3)
            if (r3 == 0) goto L29
            okio.Sink r3 = r2.newChunkedSink()
            goto L33
        L29:
            r0 = -1
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L34
            okio.Sink r3 = r2.newKnownLengthSink()
        L33:
            return r3
        L34:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Cannot stream a request body without chunked encoding or a known content length!"
            r3.<init>(r4)
            throw r3
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            r0.flush()
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
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

    public final boolean isClosed() {
            r2 = this;
            int r0 = r2.state
            r1 = 6
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.NotNull
    public okio.Source openResponseBodySource(@org.jetbrains.annotations.NotNull okhttp3.Response r5) {
            r4 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = okhttp3.internal.http.HttpHeaders.promisesBody(r5)
            if (r0 != 0) goto L13
            r0 = 0
            okio.Source r5 = r4.newFixedLengthSource(r0)
            goto L39
        L13:
            boolean r0 = r4.isChunked(r5)
            if (r0 == 0) goto L26
            okhttp3.Request r5 = r5.request()
            okhttp3.HttpUrl r5 = r5.url()
            okio.Source r5 = r4.newChunkedSource(r5)
            goto L39
        L26:
            long r0 = okhttp3.internal.Util.headersContentLength(r5)
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L35
            okio.Source r5 = r4.newFixedLengthSource(r0)
            goto L39
        L35:
            okio.Source r5 = r4.newUnknownLengthSource()
        L39:
            return r5
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.Nullable
    public okhttp3.Response.Builder readResponseHeaders(boolean r5) {
            r4 = this;
            int r0 = r4.state
            r1 = 3
            r2 = 1
            if (r0 == r2) goto Ld
            r3 = 2
            if (r0 == r3) goto Ld
            if (r0 != r1) goto Lc
            goto Ld
        Lc:
            r2 = 0
        Ld:
            if (r2 == 0) goto L73
            okhttp3.internal.http.StatusLine$Companion r0 = okhttp3.internal.http.StatusLine.Companion     // Catch: java.io.EOFException -> L51
            okhttp3.internal.http1.HeadersReader r2 = r4.headersReader     // Catch: java.io.EOFException -> L51
            java.lang.String r2 = r2.readLine()     // Catch: java.io.EOFException -> L51
            okhttp3.internal.http.StatusLine r0 = r0.parse(r2)     // Catch: java.io.EOFException -> L51
            okhttp3.Response$Builder r2 = new okhttp3.Response$Builder     // Catch: java.io.EOFException -> L51
            r2.<init>()     // Catch: java.io.EOFException -> L51
            okhttp3.Protocol r3 = r0.protocol     // Catch: java.io.EOFException -> L51
            okhttp3.Response$Builder r2 = r2.protocol(r3)     // Catch: java.io.EOFException -> L51
            int r3 = r0.code     // Catch: java.io.EOFException -> L51
            okhttp3.Response$Builder r2 = r2.code(r3)     // Catch: java.io.EOFException -> L51
            java.lang.String r3 = r0.message     // Catch: java.io.EOFException -> L51
            okhttp3.Response$Builder r2 = r2.message(r3)     // Catch: java.io.EOFException -> L51
            okhttp3.internal.http1.HeadersReader r3 = r4.headersReader     // Catch: java.io.EOFException -> L51
            okhttp3.Headers r3 = r3.readHeaders()     // Catch: java.io.EOFException -> L51
            okhttp3.Response$Builder r2 = r2.headers(r3)     // Catch: java.io.EOFException -> L51
            r3 = 100
            if (r5 == 0) goto L46
            int r5 = r0.code     // Catch: java.io.EOFException -> L51
            if (r5 != r3) goto L46
            r2 = 0
            goto L50
        L46:
            int r5 = r0.code     // Catch: java.io.EOFException -> L51
            if (r5 != r3) goto L4d
            r4.state = r1     // Catch: java.io.EOFException -> L51
            goto L50
        L4d:
            r5 = 4
            r4.state = r5     // Catch: java.io.EOFException -> L51
        L50:
            return r2
        L51:
            r5 = move-exception
            okhttp3.internal.connection.RealConnection r0 = r4.getConnection()
            okhttp3.Route r0 = r0.route()
            okhttp3.Address r0 = r0.address()
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.redact()
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "unexpected end of stream on "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0)
            r1.<init>(r0, r5)
            throw r1
        L73:
            java.lang.String r5 = "state: "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            int r0 = r4.state
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(@org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r2 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = okhttp3.internal.http.HttpHeaders.promisesBody(r3)
            if (r0 != 0) goto Lf
            r0 = 0
            goto L1c
        Lf:
            boolean r0 = r2.isChunked(r3)
            if (r0 == 0) goto L18
            r0 = -1
            goto L1c
        L18:
            long r0 = okhttp3.internal.Util.headersContentLength(r3)
        L1c:
            return r0
    }

    public final void skipConnectBody(@org.jetbrains.annotations.NotNull okhttp3.Response r5) {
            r4 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long r0 = okhttp3.internal.Util.headersContentLength(r5)
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L11
            return
        L11:
            okio.Source r5 = r4.newFixedLengthSource(r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            okhttp3.internal.Util.skipAll(r5, r0, r1)
            r5.close()
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.NotNull
    public okhttp3.Headers trailers() {
            r2 = this;
            int r0 = r2.state
            r1 = 6
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto L12
            okhttp3.Headers r0 = r2.trailers
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            okhttp3.Headers r0 = okhttp3.internal.Util.EMPTY_HEADERS
        L11:
            return r0
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "too early; can't read the trailers yet"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void writeRequest(@org.jetbrains.annotations.NotNull okhttp3.Headers r6, @org.jetbrains.annotations.NotNull java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "requestLine"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r5.state
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L4c
            okio.BufferedSink r0 = r5.sink
            okio.BufferedSink r7 = r0.writeUtf8(r7)
            java.lang.String r0 = "\r\n"
            r7.writeUtf8(r0)
            int r7 = r6.size()
        L24:
            if (r1 >= r7) goto L44
            okio.BufferedSink r3 = r5.sink
            java.lang.String r4 = r6.name(r1)
            okio.BufferedSink r3 = r3.writeUtf8(r4)
            java.lang.String r4 = ": "
            okio.BufferedSink r3 = r3.writeUtf8(r4)
            java.lang.String r4 = r6.value(r1)
            okio.BufferedSink r3 = r3.writeUtf8(r4)
            r3.writeUtf8(r0)
            int r1 = r1 + 1
            goto L24
        L44:
            okio.BufferedSink r6 = r5.sink
            r6.writeUtf8(r0)
            r5.state = r2
            return
        L4c:
            java.lang.String r6 = "state: "
            java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            int r7 = r5.state
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(@org.jetbrains.annotations.NotNull okhttp3.Request r4) {
            r3 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okhttp3.internal.http.RequestLine r0 = okhttp3.internal.http.RequestLine.INSTANCE
            okhttp3.internal.connection.RealConnection r1 = r3.getConnection()
            okhttp3.Route r1 = r1.route()
            java.net.Proxy r1 = r1.proxy()
            java.net.Proxy$Type r1 = r1.type()
            java.lang.String r2 = "connection.route().proxy.type()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r0 = r0.get(r4, r1)
            okhttp3.Headers r4 = r4.headers()
            r3.writeRequest(r4, r0)
            return
    }
}
