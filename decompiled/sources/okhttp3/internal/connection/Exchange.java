package okhttp3.internal.connection;

/* JADX INFO: compiled from: Exchange.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002CDB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ7\u0010\u001e\u001a\u0002H\u001f\"\n\b\u0000\u0010\u001f*\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u0002H\u001f¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020(J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0016J\u0006\u0010.\u001a\u00020(J\u0006\u0010/\u001a\u00020(J\u0006\u00100\u001a\u00020(J\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u00020(J\u0006\u00104\u001a\u00020(J\u000e\u00105\u001a\u0002062\u0006\u00107\u001a\u000208J\u0010\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020\u0016J\u000e\u0010<\u001a\u00020(2\u0006\u00107\u001a\u000208J\u0006\u0010=\u001a\u00020(J\u0010\u0010>\u001a\u00020(2\u0006\u0010%\u001a\u00020 H\u0002J\u0006\u0010?\u001a\u00020@J\u0006\u0010A\u001a\u00020(J\u000e\u0010B\u001a\u00020(2\u0006\u0010+\u001a\u00020,R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019¨\u0006E"}, d2 = {"Lokhttp3/internal/connection/Exchange;", "", "call", "Lokhttp3/internal/connection/RealCall;", "eventListener", "Lokhttp3/EventListener;", "finder", "Lokhttp3/internal/connection/ExchangeFinder;", "codec", "Lokhttp3/internal/http/ExchangeCodec;", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "connection", "Lokhttp3/internal/connection/RealConnection;", "getConnection$okhttp", "()Lokhttp3/internal/connection/RealConnection;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "getFinder$okhttp", "()Lokhttp3/internal/connection/ExchangeFinder;", "<set-?>", "", "hasFailure", "getHasFailure$okhttp", "()Z", "isCoalescedConnection", "isCoalescedConnection$okhttp", "isDuplex", "isDuplex$okhttp", "bodyComplete", "E", "Ljava/io/IOException;", "bytesRead", "", "responseDone", "requestDone", "e", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "cancel", "", "createRequestBody", "Lokio/Sink;", "request", "Lokhttp3/Request;", "duplex", "detachWithViolence", "finishRequest", "flushRequest", "newWebSocketStreams", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "noNewExchangesOnConnection", "noRequestBody", "openResponseBody", "Lokhttp3/ResponseBody;", "response", "Lokhttp3/Response;", "readResponseHeaders", "Lokhttp3/Response$Builder;", "expectContinue", "responseHeadersEnd", "responseHeadersStart", "trackFailure", "trailers", "Lokhttp3/Headers;", "webSocketUpgradeFailed", "writeRequestHeaders", "RequestBodySink", "ResponseBodySource", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Exchange {

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealCall call;
    private final okhttp3.internal.http.ExchangeCodec codec;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealConnection connection;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.EventListener eventListener;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.ExchangeFinder finder;
    private boolean hasFailure;
    private boolean isDuplex;

    /* JADX INFO: compiled from: Exchange.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J!\u0010\r\u001a\u0002H\u000e\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u0002H\u000eH\u0002¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "Lokio/ForwardingSink;", "delegate", "Lokio/Sink;", "contentLength", "", "(Lokhttp3/internal/connection/Exchange;Lokio/Sink;J)V", "bytesReceived", "closed", "", "completed", "close", "", "complete", "E", "Ljava/io/IOException;", "e", "(Ljava/io/IOException;)Ljava/io/IOException;", "flush", "write", "source", "Lokio/Buffer;", "byteCount", "okhttp"}, k = 1, mv = {1, 4, 1})
    public final class RequestBodySink extends okio.ForwardingSink {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        public final /* synthetic */ okhttp3.internal.connection.Exchange this$0;

        public RequestBodySink(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.Exchange r2, okio.Sink r3, long r4) {
                r1 = this;
                java.lang.String r0 = "delegate"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.this$0 = r2
                r1.<init>(r3)
                r1.contentLength = r4
                return
        }

        private final <E extends java.io.IOException> E complete(E r8) {
                r7 = this;
                boolean r0 = r7.completed
                if (r0 == 0) goto L5
                return r8
            L5:
                r0 = 1
                r7.completed = r0
                okhttp3.internal.connection.Exchange r1 = r7.this$0
                long r2 = r7.bytesReceived
                r4 = 0
                r5 = 1
                r6 = r8
                java.io.IOException r8 = r1.bodyComplete(r2, r4, r5, r6)
                return r8
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r5 = this;
                boolean r0 = r5.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r5.closed = r0
                long r0 = r5.contentLength
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L20
                long r2 = r5.bytesReceived
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L17
                goto L20
            L17:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r1 = "unexpected end of stream"
                r0.<init>(r1)
                throw r0
            L20:
                super.close()     // Catch: java.io.IOException -> L28
                r0 = 0
                r5.complete(r0)     // Catch: java.io.IOException -> L28
                return
            L28:
                r0 = move-exception
                java.io.IOException r0 = r5.complete(r0)
                throw r0
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public void flush() throws java.io.IOException {
                r1 = this;
                super.flush()     // Catch: java.io.IOException -> L4
                return
            L4:
                r0 = move-exception
                java.io.IOException r0 = r1.complete(r0)
                throw r0
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(@org.jetbrains.annotations.NotNull okio.Buffer r6, long r7) throws java.io.IOException {
                r5 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                boolean r0 = r5.closed
                r0 = r0 ^ 1
                if (r0 == 0) goto L4b
                long r0 = r5.contentLength
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L3c
                long r2 = r5.bytesReceived
                long r2 = r2 + r7
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 > 0) goto L1c
                goto L3c
            L1c:
                java.net.ProtocolException r6 = new java.net.ProtocolException
                java.lang.String r0 = "expected "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                long r1 = r5.contentLength
                r0.append(r1)
                java.lang.String r1 = " bytes but received "
                r0.append(r1)
                long r1 = r5.bytesReceived
                long r1 = r1 + r7
                r0.append(r1)
                java.lang.String r7 = r0.toString()
                r6.<init>(r7)
                throw r6
            L3c:
                super.write(r6, r7)     // Catch: java.io.IOException -> L45
                long r0 = r5.bytesReceived     // Catch: java.io.IOException -> L45
                long r0 = r0 + r7
                r5.bytesReceived = r0     // Catch: java.io.IOException -> L45
                return
            L45:
                r6 = move-exception
                java.io.IOException r6 = r5.complete(r6)
                throw r6
            L4b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "closed"
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
        }
    }

    /* JADX INFO: compiled from: Exchange.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\u001f\u0010\u000e\u001a\u0002H\u000f\"\n\b\u0000\u0010\u000f*\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u0002H\u000f¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Lokio/ForwardingSource;", "delegate", "Lokio/Source;", "contentLength", "", "(Lokhttp3/internal/connection/Exchange;Lokio/Source;J)V", "bytesReceived", "closed", "", "completed", "invokeStartEvent", "close", "", "complete", "E", "Ljava/io/IOException;", "e", "(Ljava/io/IOException;)Ljava/io/IOException;", "read", "sink", "Lokio/Buffer;", "byteCount", "okhttp"}, k = 1, mv = {1, 4, 1})
    public final class ResponseBodySource extends okio.ForwardingSource {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        public final /* synthetic */ okhttp3.internal.connection.Exchange this$0;

        public ResponseBodySource(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.Exchange r2, okio.Source r3, long r4) {
                r1 = this;
                java.lang.String r0 = "delegate"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.this$0 = r2
                r1.<init>(r3)
                r1.contentLength = r4
                r2 = 1
                r1.invokeStartEvent = r2
                r2 = 0
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 != 0) goto L19
                r2 = 0
                r1.complete(r2)
            L19:
                return
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.closed = r0
                super.close()     // Catch: java.io.IOException -> L10
                r0 = 0
                r1.complete(r0)     // Catch: java.io.IOException -> L10
                return
            L10:
                r0 = move-exception
                java.io.IOException r0 = r1.complete(r0)
                throw r0
        }

        public final <E extends java.io.IOException> E complete(E r9) {
                r8 = this;
                boolean r0 = r8.completed
                if (r0 == 0) goto L5
                return r9
            L5:
                r0 = 1
                r8.completed = r0
                if (r9 != 0) goto L20
                boolean r0 = r8.invokeStartEvent
                if (r0 == 0) goto L20
                r0 = 0
                r8.invokeStartEvent = r0
                okhttp3.internal.connection.Exchange r0 = r8.this$0
                okhttp3.EventListener r0 = r0.getEventListener$okhttp()
                okhttp3.internal.connection.Exchange r1 = r8.this$0
                okhttp3.internal.connection.RealCall r1 = r1.getCall$okhttp()
                r0.responseBodyStart(r1)
            L20:
                okhttp3.internal.connection.Exchange r2 = r8.this$0
                long r3 = r8.bytesReceived
                r5 = 1
                r6 = 0
                r7 = r9
                java.io.IOException r9 = r2.bodyComplete(r3, r5, r6, r7)
                return r9
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) throws java.io.IOException {
                r7 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                boolean r0 = r7.closed
                r0 = r0 ^ 1
                if (r0 == 0) goto L74
                okio.Source r0 = r7.delegate()     // Catch: java.io.IOException -> L6e
                long r8 = r0.read(r8, r9)     // Catch: java.io.IOException -> L6e
                boolean r10 = r7.invokeStartEvent     // Catch: java.io.IOException -> L6e
                if (r10 == 0) goto L2a
                r10 = 0
                r7.invokeStartEvent = r10     // Catch: java.io.IOException -> L6e
                okhttp3.internal.connection.Exchange r10 = r7.this$0     // Catch: java.io.IOException -> L6e
                okhttp3.EventListener r10 = r10.getEventListener$okhttp()     // Catch: java.io.IOException -> L6e
                okhttp3.internal.connection.Exchange r0 = r7.this$0     // Catch: java.io.IOException -> L6e
                okhttp3.internal.connection.RealCall r0 = r0.getCall$okhttp()     // Catch: java.io.IOException -> L6e
                r10.responseBodyStart(r0)     // Catch: java.io.IOException -> L6e
            L2a:
                r10 = 0
                r0 = -1
                int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r2 != 0) goto L35
                r7.complete(r10)     // Catch: java.io.IOException -> L6e
                return r0
            L35:
                long r2 = r7.bytesReceived     // Catch: java.io.IOException -> L6e
                long r2 = r2 + r8
                long r4 = r7.contentLength     // Catch: java.io.IOException -> L6e
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 == 0) goto L64
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L43
                goto L64
            L43:
                java.net.ProtocolException r8 = new java.net.ProtocolException     // Catch: java.io.IOException -> L6e
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L6e
                r9.<init>()     // Catch: java.io.IOException -> L6e
                java.lang.String r10 = "expected "
                r9.append(r10)     // Catch: java.io.IOException -> L6e
                long r0 = r7.contentLength     // Catch: java.io.IOException -> L6e
                r9.append(r0)     // Catch: java.io.IOException -> L6e
                java.lang.String r10 = " bytes but received "
                r9.append(r10)     // Catch: java.io.IOException -> L6e
                r9.append(r2)     // Catch: java.io.IOException -> L6e
                java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> L6e
                r8.<init>(r9)     // Catch: java.io.IOException -> L6e
                throw r8     // Catch: java.io.IOException -> L6e
            L64:
                r7.bytesReceived = r2     // Catch: java.io.IOException -> L6e
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L6d
                r7.complete(r10)     // Catch: java.io.IOException -> L6e
            L6d:
                return r8
            L6e:
                r8 = move-exception
                java.io.IOException r8 = r7.complete(r8)
                throw r8
            L74:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
        }
    }

    public Exchange(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r2, @org.jetbrains.annotations.NotNull okhttp3.EventListener r3, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.ExchangeFinder r4, @org.jetbrains.annotations.NotNull okhttp3.internal.http.ExchangeCodec r5) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "finder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "codec"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r1.<init>()
            r1.call = r2
            r1.eventListener = r3
            r1.finder = r4
            r1.codec = r5
            okhttp3.internal.connection.RealConnection r2 = r5.getConnection()
            r1.connection = r2
            return
    }

    private final void trackFailure(java.io.IOException r3) {
            r2 = this;
            r0 = 1
            r2.hasFailure = r0
            okhttp3.internal.connection.ExchangeFinder r0 = r2.finder
            r0.trackFailure(r3)
            okhttp3.internal.http.ExchangeCodec r0 = r2.codec
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.trackFailure$okhttp(r1, r3)
            return
    }

    public final <E extends java.io.IOException> E bodyComplete(long r3, boolean r5, boolean r6, E r7) {
            r2 = this;
            if (r7 == 0) goto L5
            r2.trackFailure(r7)
        L5:
            if (r6 == 0) goto L18
            if (r7 == 0) goto L11
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.requestFailed(r1, r7)
            goto L18
        L11:
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.requestBodyEnd(r1, r3)
        L18:
            if (r5 == 0) goto L2b
            if (r7 == 0) goto L24
            okhttp3.EventListener r3 = r2.eventListener
            okhttp3.internal.connection.RealCall r4 = r2.call
            r3.responseFailed(r4, r7)
            goto L2b
        L24:
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.responseBodyEnd(r1, r3)
        L2b:
            okhttp3.internal.connection.RealCall r3 = r2.call
            java.io.IOException r3 = r3.messageDone$okhttp(r2, r6, r5, r7)
            return r3
    }

    public final void cancel() {
            r1 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r1.codec
            r0.cancel()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Sink createRequestBody(@org.jetbrains.annotations.NotNull okhttp3.Request r4, boolean r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.isDuplex = r5
            okhttp3.RequestBody r5 = r4.body()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            long r0 = r5.contentLength()
            okhttp3.EventListener r5 = r3.eventListener
            okhttp3.internal.connection.RealCall r2 = r3.call
            r5.requestBodyStart(r2)
            okhttp3.internal.http.ExchangeCodec r5 = r3.codec
            okio.Sink r4 = r5.createRequestBody(r4, r0)
            okhttp3.internal.connection.Exchange$RequestBodySink r5 = new okhttp3.internal.connection.Exchange$RequestBodySink
            r5.<init>(r3, r4, r0)
            return r5
    }

    public final void detachWithViolence() {
            r3 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r3.codec
            r0.cancel()
            okhttp3.internal.connection.RealCall r0 = r3.call
            r1 = 1
            r2 = 0
            r0.messageDone$okhttp(r3, r1, r1, r2)
            return
    }

    public final void finishRequest() throws java.io.IOException {
            r3 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r3.codec     // Catch: java.io.IOException -> L6
            r0.finishRequest()     // Catch: java.io.IOException -> L6
            return
        L6:
            r0 = move-exception
            okhttp3.EventListener r1 = r3.eventListener
            okhttp3.internal.connection.RealCall r2 = r3.call
            r1.requestFailed(r2, r0)
            r3.trackFailure(r0)
            throw r0
    }

    public final void flushRequest() throws java.io.IOException {
            r3 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r3.codec     // Catch: java.io.IOException -> L6
            r0.flushRequest()     // Catch: java.io.IOException -> L6
            return
        L6:
            r0 = move-exception
            okhttp3.EventListener r1 = r3.eventListener
            okhttp3.internal.connection.RealCall r2 = r3.call
            r1.requestFailed(r2, r0)
            r3.trackFailure(r0)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.RealCall getCall$okhttp() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.call
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.RealConnection getConnection$okhttp() {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.connection
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.EventListener getEventListener$okhttp() {
            r1 = this;
            okhttp3.EventListener r0 = r1.eventListener
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.ExchangeFinder getFinder$okhttp() {
            r1 = this;
            okhttp3.internal.connection.ExchangeFinder r0 = r1.finder
            return r0
    }

    public final boolean getHasFailure$okhttp() {
            r1 = this;
            boolean r0 = r1.hasFailure
            return r0
    }

    public final boolean isCoalescedConnection$okhttp() {
            r2 = this;
            okhttp3.internal.connection.ExchangeFinder r0 = r2.finder
            okhttp3.Address r0 = r0.getAddress$okhttp()
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.host()
            okhttp3.internal.connection.RealConnection r1 = r2.connection
            okhttp3.Route r1 = r1.route()
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.host()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r0 = r0 ^ 1
            return r0
    }

    public final boolean isDuplex$okhttp() {
            r1 = this;
            boolean r0 = r1.isDuplex
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.ws.RealWebSocket.Streams newWebSocketStreams() throws java.net.SocketException {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.call
            r0.timeoutEarlyExit()
            okhttp3.internal.http.ExchangeCodec r0 = r1.codec
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r0.newWebSocketStreams$okhttp(r1)
            return r0
    }

    public final void noNewExchangesOnConnection() {
            r1 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r1.codec
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            r0.noNewExchanges$okhttp()
            return
    }

    public final void noRequestBody() {
            r4 = this;
            okhttp3.internal.connection.RealCall r0 = r4.call
            r1 = 1
            r2 = 0
            r3 = 0
            r0.messageDone$okhttp(r4, r1, r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.ResponseBody openResponseBody(@org.jetbrains.annotations.NotNull okhttp3.Response r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "Content-Type"
            r1 = 2
            r2 = 0
            java.lang.String r0 = okhttp3.Response.header$default(r5, r0, r2, r1, r2)     // Catch: java.io.IOException -> L29
            okhttp3.internal.http.ExchangeCodec r1 = r4.codec     // Catch: java.io.IOException -> L29
            long r1 = r1.reportedContentLength(r5)     // Catch: java.io.IOException -> L29
            okhttp3.internal.http.ExchangeCodec r3 = r4.codec     // Catch: java.io.IOException -> L29
            okio.Source r5 = r3.openResponseBodySource(r5)     // Catch: java.io.IOException -> L29
            okhttp3.internal.connection.Exchange$ResponseBodySource r3 = new okhttp3.internal.connection.Exchange$ResponseBodySource     // Catch: java.io.IOException -> L29
            r3.<init>(r4, r5, r1)     // Catch: java.io.IOException -> L29
            okhttp3.internal.http.RealResponseBody r5 = new okhttp3.internal.http.RealResponseBody     // Catch: java.io.IOException -> L29
            okio.BufferedSource r3 = okio.Okio.buffer(r3)     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r1, r3)     // Catch: java.io.IOException -> L29
            return r5
        L29:
            r5 = move-exception
            okhttp3.EventListener r0 = r4.eventListener
            okhttp3.internal.connection.RealCall r1 = r4.call
            r0.responseFailed(r1, r5)
            r4.trackFailure(r5)
            throw r5
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.Response.Builder readResponseHeaders(boolean r3) throws java.io.IOException {
            r2 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r2.codec     // Catch: java.io.IOException -> Lc
            okhttp3.Response$Builder r3 = r0.readResponseHeaders(r3)     // Catch: java.io.IOException -> Lc
            if (r3 == 0) goto Lb
            r3.initExchange$okhttp(r2)     // Catch: java.io.IOException -> Lc
        Lb:
            return r3
        Lc:
            r3 = move-exception
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.responseFailed(r1, r3)
            r2.trackFailure(r3)
            throw r3
    }

    public final void responseHeadersEnd(@org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r2 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.responseHeadersEnd(r1, r3)
            return
    }

    public final void responseHeadersStart() {
            r2 = this;
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.responseHeadersStart(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Headers trailers() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r1.codec
            okhttp3.Headers r0 = r0.trailers()
            return r0
    }

    public final void webSocketUpgradeFailed() {
            r6 = this;
            r1 = -1
            r3 = 1
            r4 = 1
            r5 = 0
            r0 = r6
            r0.bodyComplete(r1, r3, r4, r5)
            return
    }

    public final void writeRequestHeaders(@org.jetbrains.annotations.NotNull okhttp3.Request r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.EventListener r0 = r2.eventListener     // Catch: java.io.IOException -> L1a
            okhttp3.internal.connection.RealCall r1 = r2.call     // Catch: java.io.IOException -> L1a
            r0.requestHeadersStart(r1)     // Catch: java.io.IOException -> L1a
            okhttp3.internal.http.ExchangeCodec r0 = r2.codec     // Catch: java.io.IOException -> L1a
            r0.writeRequestHeaders(r3)     // Catch: java.io.IOException -> L1a
            okhttp3.EventListener r0 = r2.eventListener     // Catch: java.io.IOException -> L1a
            okhttp3.internal.connection.RealCall r1 = r2.call     // Catch: java.io.IOException -> L1a
            r0.requestHeadersEnd(r1, r3)     // Catch: java.io.IOException -> L1a
            return
        L1a:
            r3 = move-exception
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.requestFailed(r1, r3)
            r2.trackFailure(r3)
            throw r3
    }
}
