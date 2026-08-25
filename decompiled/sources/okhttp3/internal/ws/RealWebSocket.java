package okhttp3.internal.ws;

/* JADX INFO: compiled from: RealWebSocket.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0005_`abcB?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0002\u0010\u0010J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\f2\u0006\u00105\u001a\u000206J\b\u00107\u001a\u000203H\u0016J\u001f\u00108\u001a\u0002032\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0000¢\u0006\u0002\b=J\u001a\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020%2\b\u0010@\u001a\u0004\u0018\u00010\u0018H\u0016J \u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020%2\b\u0010@\u001a\u0004\u0018\u00010\u00182\u0006\u0010A\u001a\u00020\fJ\u000e\u0010B\u001a\u0002032\u0006\u0010C\u001a\u00020DJ\u001c\u0010E\u001a\u0002032\n\u0010F\u001a\u00060Gj\u0002`H2\b\u00109\u001a\u0004\u0018\u00010:J\u0016\u0010I\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+J\u0006\u0010J\u001a\u000203J\u0018\u0010K\u001a\u0002032\u0006\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020\u0018H\u0016J\u0010\u0010L\u001a\u0002032\u0006\u0010M\u001a\u00020\u0018H\u0016J\u0010\u0010L\u001a\u0002032\u0006\u0010N\u001a\u00020 H\u0016J\u0010\u0010O\u001a\u0002032\u0006\u0010P\u001a\u00020 H\u0016J\u0010\u0010Q\u001a\u0002032\u0006\u0010P\u001a\u00020 H\u0016J\u000e\u0010R\u001a\u00020\u00122\u0006\u0010P\u001a\u00020 J\u0006\u0010S\u001a\u00020\u0012J\b\u0010!\u001a\u00020\fH\u0016J\u0006\u0010'\u001a\u00020%J\u0006\u0010(\u001a\u00020%J\b\u0010T\u001a\u00020\u0006H\u0016J\b\u0010U\u001a\u000203H\u0002J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u0018H\u0016J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010N\u001a\u00020 H\u0016J\u0018\u0010V\u001a\u00020\u00122\u0006\u0010W\u001a\u00020 2\u0006\u0010X\u001a\u00020%H\u0002J\u0006\u0010)\u001a\u00020%J\u0006\u0010Y\u001a\u000203J\r\u0010Z\u001a\u00020\u0012H\u0000¢\u0006\u0002\b[J\r\u0010\\\u001a\u000203H\u0000¢\u0006\u0002\b]J\f\u0010^\u001a\u00020\u0012*\u00020\u000eH\u0002R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006d"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "originalRequest", "Lokhttp3/Request;", "listener", "Lokhttp3/WebSocketListener;", "random", "Ljava/util/Random;", "pingIntervalMillis", "", "extensions", "Lokhttp3/internal/ws/WebSocketExtensions;", "minimumDeflateSize", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;J)V", "awaitingPong", "", "call", "Lokhttp3/Call;", "enqueuedClose", "failed", "key", "", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "messageAndCloseQueue", "Ljava/util/ArrayDeque;", "", "name", "pongQueue", "Lokio/ByteString;", "queueSize", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "receivedCloseCode", "", "receivedCloseReason", "receivedPingCount", "receivedPongCount", "sentPingCount", "streams", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "awaitTermination", "", "timeout", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "cancel", "checkUpgradeSuccess", "response", "Lokhttp3/Response;", "exchange", "Lokhttp3/internal/connection/Exchange;", "checkUpgradeSuccess$okhttp", "close", "code", "reason", "cancelAfterCloseMillis", "connect", "client", "Lokhttp3/OkHttpClient;", "failWebSocket", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "initReaderAndWriter", "loopReader", "onReadClose", "onReadMessage", "text", "bytes", "onReadPing", "payload", "onReadPong", "pong", "processNextFrame", "request", "runWriter", "send", "data", "formatOpcode", "tearDown", "writeOneFrame", "writeOneFrame$okhttp", "writePingFrame", "writePingFrame$okhttp", "isValid", "Close", "Companion", "Message", "Streams", "WriterTask", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class RealWebSocket implements okhttp3.WebSocket, okhttp3.internal.ws.WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.ws.RealWebSocket.Companion Companion = null;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final java.util.List<okhttp3.Protocol> ONLY_HTTP1 = null;
    private boolean awaitingPong;
    private okhttp3.Call call;
    private boolean enqueuedClose;
    private okhttp3.internal.ws.WebSocketExtensions extensions;
    private boolean failed;
    private final java.lang.String key;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.WebSocketListener listener;
    private final java.util.ArrayDeque<java.lang.Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private java.lang.String name;
    private final okhttp3.Request originalRequest;
    private final long pingIntervalMillis;
    private final java.util.ArrayDeque<okio.ByteString> pongQueue;
    private long queueSize;
    private final java.util.Random random;
    private okhttp3.internal.ws.WebSocketReader reader;
    private int receivedCloseCode;
    private java.lang.String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private okhttp3.internal.ws.RealWebSocket.Streams streams;
    private okhttp3.internal.concurrent.TaskQueue taskQueue;
    private okhttp3.internal.ws.WebSocketWriter writer;
    private okhttp3.internal.concurrent.Task writerTask;

    /* JADX INFO: compiled from: RealWebSocket.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "code", "", "reason", "Lokio/ByteString;", "cancelAfterCloseMillis", "", "(ILokio/ByteString;J)V", "getCancelAfterCloseMillis", "()J", "getCode", "()I", "getReason", "()Lokio/ByteString;", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;

        @org.jetbrains.annotations.Nullable
        private final okio.ByteString reason;

        public Close(int r1, @org.jetbrains.annotations.Nullable okio.ByteString r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.code = r1
                r0.reason = r2
                r0.cancelAfterCloseMillis = r3
                return
        }

        public final long getCancelAfterCloseMillis() {
                r2 = this;
                long r0 = r2.cancelAfterCloseMillis
                return r0
        }

        public final int getCode() {
                r1 = this;
                int r0 = r1.code
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okio.ByteString getReason() {
                r1 = this;
                okio.ByteString r0 = r1.reason
                return r0
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Companion;", "", "()V", "CANCEL_AFTER_CLOSE_MILLIS", "", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "ONLY_HTTP1", "", "Lokhttp3/Protocol;", "okhttp"}, k = 1, mv = {1, 4, 1})
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

    /* JADX INFO: compiled from: RealWebSocket.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "formatOpcode", "", "data", "Lokio/ByteString;", "(ILokio/ByteString;)V", "getData", "()Lokio/ByteString;", "getFormatOpcode", "()I", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Message {

        @org.jetbrains.annotations.NotNull
        private final okio.ByteString data;
        private final int formatOpcode;

        public Message(int r2, @org.jetbrains.annotations.NotNull okio.ByteString r3) {
                r1 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.<init>()
                r1.formatOpcode = r2
                r1.data = r3
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okio.ByteString getData() {
                r1 = this;
                okio.ByteString r0 = r1.data
                return r0
        }

        public final int getFormatOpcode() {
                r1 = this;
                int r0 = r1.formatOpcode
                return r0
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "client", "", "source", "Lokio/BufferedSource;", "sink", "Lokio/BufferedSink;", "(ZLokio/BufferedSource;Lokio/BufferedSink;)V", "getClient", "()Z", "getSink", "()Lokio/BufferedSink;", "getSource", "()Lokio/BufferedSource;", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static abstract class Streams implements java.io.Closeable {
        private final boolean client;

        @org.jetbrains.annotations.NotNull
        private final okio.BufferedSink sink;

        @org.jetbrains.annotations.NotNull
        private final okio.BufferedSource source;

        public Streams(boolean r2, @org.jetbrains.annotations.NotNull okio.BufferedSource r3, @org.jetbrains.annotations.NotNull okio.BufferedSink r4) {
                r1 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r1.<init>()
                r1.client = r2
                r1.source = r3
                r1.sink = r4
                return
        }

        public final boolean getClient() {
                r1 = this;
                boolean r0 = r1.client
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.BufferedSink getSink() {
                r1 = this;
                okio.BufferedSink r0 = r1.sink
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.BufferedSource getSource() {
                r1 = this;
                okio.BufferedSource r0 = r1.source
                return r0
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "(Lokhttp3/internal/ws/RealWebSocket;)V", "runOnce", "", "okhttp"}, k = 1, mv = {1, 4, 1})
    public final class WriterTask extends okhttp3.internal.concurrent.Task {
        public final /* synthetic */ okhttp3.internal.ws.RealWebSocket this$0;

        public WriterTask(okhttp3.internal.ws.RealWebSocket r4) {
                r3 = this;
                r3.this$0 = r4
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = okhttp3.internal.ws.RealWebSocket.access$getName$p(r4)
                r0.append(r4)
                java.lang.String r4 = " writer"
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r0 = 0
                r1 = 2
                r2 = 0
                r3.<init>(r4, r0, r1, r2)
                return
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
                r3 = this;
                okhttp3.internal.ws.RealWebSocket r0 = r3.this$0     // Catch: java.io.IOException -> Lb
                boolean r0 = r0.writeOneFrame$okhttp()     // Catch: java.io.IOException -> Lb
                if (r0 == 0) goto L12
                r0 = 0
                return r0
            Lb:
                r0 = move-exception
                okhttp3.internal.ws.RealWebSocket r1 = r3.this$0
                r2 = 0
                r1.failWebSocket(r0, r2)
            L12:
                r0 = -1
                return r0
        }
    }


    static {
            okhttp3.internal.ws.RealWebSocket$Companion r0 = new okhttp3.internal.ws.RealWebSocket$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.ws.RealWebSocket.Companion = r0
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            okhttp3.internal.ws.RealWebSocket.ONLY_HTTP1 = r0
            return
    }

    public RealWebSocket(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r2, @org.jetbrains.annotations.NotNull okhttp3.Request r3, @org.jetbrains.annotations.NotNull okhttp3.WebSocketListener r4, @org.jetbrains.annotations.NotNull java.util.Random r5, long r6, @org.jetbrains.annotations.Nullable okhttp3.internal.ws.WebSocketExtensions r8, long r9) {
            r1 = this;
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "originalRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r1.<init>()
            r1.originalRequest = r3
            r1.listener = r4
            r1.random = r5
            r1.pingIntervalMillis = r6
            r1.extensions = r8
            r1.minimumDeflateSize = r9
            okhttp3.internal.concurrent.TaskQueue r2 = r2.newQueue()
            r1.taskQueue = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.pongQueue = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.messageAndCloseQueue = r2
            r2 = -1
            r1.receivedCloseCode = r2
            java.lang.String r2 = r3.method()
            java.lang.String r4 = "GET"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r2)
            if (r2 == 0) goto L61
            okio.ByteString$Companion r3 = okio.ByteString.Companion
            r2 = 16
            byte[] r4 = new byte[r2]
            r5.nextBytes(r4)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            r5 = 0
            r6 = 0
            r7 = 3
            r8 = 0
            okio.ByteString r2 = okio.ByteString.Companion.of$default(r3, r4, r5, r6, r7, r8)
            java.lang.String r2 = r2.base64()
            r1.key = r2
            return
        L61:
            java.lang.String r2 = "Request must be GET: "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r3 = r3.method()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static final /* synthetic */ okhttp3.internal.ws.WebSocketExtensions access$getExtensions$p(okhttp3.internal.ws.RealWebSocket r0) {
            okhttp3.internal.ws.WebSocketExtensions r0 = r0.extensions
            return r0
    }

    public static final /* synthetic */ java.util.ArrayDeque access$getMessageAndCloseQueue$p(okhttp3.internal.ws.RealWebSocket r0) {
            java.util.ArrayDeque<java.lang.Object> r0 = r0.messageAndCloseQueue
            return r0
    }

    public static final /* synthetic */ java.lang.String access$getName$p(okhttp3.internal.ws.RealWebSocket r0) {
            java.lang.String r0 = r0.name
            return r0
    }

    public static final /* synthetic */ boolean access$isValid(okhttp3.internal.ws.RealWebSocket r0, okhttp3.internal.ws.WebSocketExtensions r1) {
            boolean r0 = r0.isValid(r1)
            return r0
    }

    public static final /* synthetic */ void access$setExtensions$p(okhttp3.internal.ws.RealWebSocket r0, okhttp3.internal.ws.WebSocketExtensions r1) {
            r0.extensions = r1
            return
    }

    public static final /* synthetic */ void access$setName$p(okhttp3.internal.ws.RealWebSocket r0, java.lang.String r1) {
            r0.name = r1
            return
    }

    private final boolean isValid(okhttp3.internal.ws.WebSocketExtensions r4) {
            r3 = this;
            boolean r0 = r4.unknownValues
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Integer r0 = r4.clientMaxWindowBits
            if (r0 == 0) goto Lb
            return r1
        Lb:
            java.lang.Integer r4 = r4.serverMaxWindowBits
            if (r4 == 0) goto L1c
            r0 = 15
            r2 = 8
            int r4 = r4.intValue()
            if (r2 > r4) goto L1b
            if (r0 >= r4) goto L1c
        L1b:
            return r1
        L1c:
            r4 = 1
            return r4
    }

    private final void runWriter() {
            r8 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L33
            boolean r0 = java.lang.Thread.holdsLock(r8)
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
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L33:
            okhttp3.internal.concurrent.Task r3 = r8.writerTask
            if (r3 == 0) goto L40
            okhttp3.internal.concurrent.TaskQueue r2 = r8.taskQueue
            r4 = 0
            r6 = 2
            r7 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r2, r3, r4, r6, r7)
        L40:
            return
    }

    private final synchronized boolean send(okio.ByteString r7, int r8) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.failed     // Catch: java.lang.Throwable -> L3e
            r1 = 0
            if (r0 != 0) goto L3c
            boolean r0 = r6.enqueuedClose     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto Lb
            goto L3c
        Lb:
            long r2 = r6.queueSize     // Catch: java.lang.Throwable -> L3e
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L3e
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L3e
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L22
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r6)
            return r1
        L22:
            long r0 = r6.queueSize     // Catch: java.lang.Throwable -> L3e
            int r2 = r7.size()     // Catch: java.lang.Throwable -> L3e
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L3e
            long r0 = r0 + r2
            r6.queueSize = r0     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayDeque<java.lang.Object> r0 = r6.messageAndCloseQueue     // Catch: java.lang.Throwable -> L3e
            okhttp3.internal.ws.RealWebSocket$Message r1 = new okhttp3.internal.ws.RealWebSocket$Message     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r8, r7)     // Catch: java.lang.Throwable -> L3e
            r0.add(r1)     // Catch: java.lang.Throwable -> L3e
            r6.runWriter()     // Catch: java.lang.Throwable -> L3e
            r7 = 1
            monitor-exit(r6)
            return r7
        L3c:
            monitor-exit(r6)
            return r1
        L3e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public final void awaitTermination(long r2, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okhttp3.internal.concurrent.TaskQueue r0 = r1.taskQueue
            java.util.concurrent.CountDownLatch r0 = r0.idleLatch()
            r0.await(r2, r4)
            return
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
            r1 = this;
            okhttp3.Call r0 = r1.call
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0.cancel()
            return
    }

    public final void checkUpgradeSuccess$okhttp(@org.jetbrains.annotations.NotNull okhttp3.Response r7, @org.jetbrains.annotations.Nullable okhttp3.internal.connection.Exchange r8) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r7.code()
            r1 = 39
            r2 = 101(0x65, float:1.42E-43)
            if (r0 != r2) goto Lbd
            r0 = 0
            r2 = 2
            java.lang.String r3 = "Connection"
            java.lang.String r3 = okhttp3.Response.header$default(r7, r3, r0, r2, r0)
            java.lang.String r4 = "Upgrade"
            boolean r5 = kotlin.text.StringsKt.equals(r4, r3)
            if (r5 == 0) goto La3
            java.lang.String r3 = okhttp3.Response.header$default(r7, r4, r0, r2, r0)
            java.lang.String r4 = "websocket"
            boolean r4 = kotlin.text.StringsKt.equals(r4, r3)
            if (r4 == 0) goto L89
            java.lang.String r3 = "Sec-WebSocket-Accept"
            java.lang.String r7 = okhttp3.Response.header$default(r7, r3, r0, r2, r0)
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.key
            r2.append(r3)
            java.lang.String r3 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            okio.ByteString r0 = r0.encodeUtf8(r2)
            okio.ByteString r0 = r0.sha1()
            java.lang.String r0 = r0.base64()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)
            r2 = r2 ^ 1
            if (r2 != 0) goto L67
            if (r8 == 0) goto L5f
            return
        L5f:
            java.net.ProtocolException r7 = new java.net.ProtocolException
            java.lang.String r8 = "Web Socket exchange missing: bad interceptor?"
            r7.<init>(r8)
            throw r7
        L67:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected 'Sec-WebSocket-Accept' header value '"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "' but was '"
            r2.append(r0)
            r2.append(r7)
            r2.append(r1)
            java.lang.String r7 = r2.toString()
            r8.<init>(r7)
            throw r8
        L89:
            java.net.ProtocolException r7 = new java.net.ProtocolException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Expected 'Upgrade' header value 'websocket' but was '"
            r8.append(r0)
            r8.append(r3)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        La3:
            java.net.ProtocolException r7 = new java.net.ProtocolException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Expected 'Connection' header value 'Upgrade' but was '"
            r8.append(r0)
            r8.append(r3)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        Lbd:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.String r0 = "Expected HTTP 101 response but was '"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r2 = r7.code()
            r0.append(r2)
            r2 = 32
            r0.append(r2)
            java.lang.String r7 = r7.message()
            r0.append(r7)
            r0.append(r1)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
    }

    @Override // okhttp3.WebSocket
    public boolean close(int r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            r2 = this;
            r0 = 60000(0xea60, double:2.9644E-319)
            boolean r3 = r2.close(r3, r4, r0)
            return r3
    }

    public final synchronized boolean close(int r9, @org.jetbrains.annotations.Nullable java.lang.String r10, long r11) {
            r8 = this;
            monitor-enter(r8)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE     // Catch: java.lang.Throwable -> L59
            r0.validateCloseCode(r9)     // Catch: java.lang.Throwable -> L59
            r0 = 0
            r1 = 0
            r2 = 1
            if (r10 == 0) goto L3d
            okio.ByteString$Companion r0 = okio.ByteString.Companion     // Catch: java.lang.Throwable -> L59
            okio.ByteString r0 = r0.encodeUtf8(r10)     // Catch: java.lang.Throwable -> L59
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L59
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L59
            r5 = 123(0x7b, double:6.1E-322)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L1e
            r3 = 1
            goto L1f
        L1e:
            r3 = 0
        L1f:
            if (r3 == 0) goto L22
            goto L3d
        L22:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r9.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r11 = "reason.size() > 123: "
            r9.append(r11)     // Catch: java.lang.Throwable -> L59
            r9.append(r10)     // Catch: java.lang.Throwable -> L59
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L59
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L59
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L59
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L59
            throw r10     // Catch: java.lang.Throwable -> L59
        L3d:
            boolean r10 = r8.failed     // Catch: java.lang.Throwable -> L59
            if (r10 != 0) goto L57
            boolean r10 = r8.enqueuedClose     // Catch: java.lang.Throwable -> L59
            if (r10 == 0) goto L46
            goto L57
        L46:
            r8.enqueuedClose = r2     // Catch: java.lang.Throwable -> L59
            java.util.ArrayDeque<java.lang.Object> r10 = r8.messageAndCloseQueue     // Catch: java.lang.Throwable -> L59
            okhttp3.internal.ws.RealWebSocket$Close r1 = new okhttp3.internal.ws.RealWebSocket$Close     // Catch: java.lang.Throwable -> L59
            r1.<init>(r9, r0, r11)     // Catch: java.lang.Throwable -> L59
            r10.add(r1)     // Catch: java.lang.Throwable -> L59
            r8.runWriter()     // Catch: java.lang.Throwable -> L59
            monitor-exit(r8)
            return r2
        L57:
            monitor-exit(r8)
            return r1
        L59:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    public final void connect(@org.jetbrains.annotations.NotNull okhttp3.OkHttpClient r5) {
            r4 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            okhttp3.Request r0 = r4.originalRequest
            java.lang.String r1 = "Sec-WebSocket-Extensions"
            java.lang.String r0 = r0.header(r1)
            if (r0 == 0) goto L1b
            java.net.ProtocolException r5 = new java.net.ProtocolException
            java.lang.String r0 = "Request header not permitted: 'Sec-WebSocket-Extensions'"
            r5.<init>(r0)
            r0 = 0
            r4.failWebSocket(r5, r0)
            return
        L1b:
            okhttp3.OkHttpClient$Builder r5 = r5.newBuilder()
            okhttp3.EventListener r0 = okhttp3.EventListener.NONE
            okhttp3.OkHttpClient$Builder r5 = r5.eventListener(r0)
            java.util.List<okhttp3.Protocol> r0 = okhttp3.internal.ws.RealWebSocket.ONLY_HTTP1
            okhttp3.OkHttpClient$Builder r5 = r5.protocols(r0)
            okhttp3.OkHttpClient r5 = r5.build()
            okhttp3.Request r0 = r4.originalRequest
            okhttp3.Request$Builder r0 = r0.newBuilder()
            java.lang.String r2 = "Upgrade"
            java.lang.String r3 = "websocket"
            okhttp3.Request$Builder r0 = r0.header(r2, r3)
            java.lang.String r3 = "Connection"
            okhttp3.Request$Builder r0 = r0.header(r3, r2)
            java.lang.String r2 = r4.key
            java.lang.String r3 = "Sec-WebSocket-Key"
            okhttp3.Request$Builder r0 = r0.header(r3, r2)
            java.lang.String r2 = "Sec-WebSocket-Version"
            java.lang.String r3 = "13"
            okhttp3.Request$Builder r0 = r0.header(r2, r3)
            java.lang.String r2 = "permessage-deflate"
            okhttp3.Request$Builder r0 = r0.header(r1, r2)
            okhttp3.Request r0 = r0.build()
            okhttp3.internal.connection.RealCall r1 = new okhttp3.internal.connection.RealCall
            r2 = 1
            r1.<init>(r5, r0, r2)
            r4.call = r1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okhttp3.internal.ws.RealWebSocket$connect$1 r5 = new okhttp3.internal.ws.RealWebSocket$connect$1
            r5.<init>(r4, r0)
            r1.enqueue(r5)
            return
    }

    public final void failWebSocket(@org.jetbrains.annotations.NotNull java.lang.Exception r5, @org.jetbrains.annotations.Nullable okhttp3.Response r6) {
            r4 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            monitor-enter(r4)
            boolean r0 = r4.failed     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto Lc
            monitor-exit(r4)
            return
        Lc:
            r0 = 1
            r4.failed = r0     // Catch: java.lang.Throwable -> L4a
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r4.streams     // Catch: java.lang.Throwable -> L4a
            r1 = 0
            r4.streams = r1     // Catch: java.lang.Throwable -> L4a
            okhttp3.internal.ws.WebSocketReader r2 = r4.reader     // Catch: java.lang.Throwable -> L4a
            r4.reader = r1     // Catch: java.lang.Throwable -> L4a
            okhttp3.internal.ws.WebSocketWriter r3 = r4.writer     // Catch: java.lang.Throwable -> L4a
            r4.writer = r1     // Catch: java.lang.Throwable -> L4a
            okhttp3.internal.concurrent.TaskQueue r1 = r4.taskQueue     // Catch: java.lang.Throwable -> L4a
            r1.shutdown()     // Catch: java.lang.Throwable -> L4a
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r4)
            okhttp3.WebSocketListener r1 = r4.listener     // Catch: java.lang.Throwable -> L39
            r1.onFailure(r4, r5, r6)     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L2e
            okhttp3.internal.Util.closeQuietly(r0)
        L2e:
            if (r2 == 0) goto L33
            okhttp3.internal.Util.closeQuietly(r2)
        L33:
            if (r3 == 0) goto L38
            okhttp3.internal.Util.closeQuietly(r3)
        L38:
            return
        L39:
            r5 = move-exception
            if (r0 == 0) goto L3f
            okhttp3.internal.Util.closeQuietly(r0)
        L3f:
            if (r2 == 0) goto L44
            okhttp3.internal.Util.closeQuietly(r2)
        L44:
            if (r3 == 0) goto L49
            okhttp3.internal.Util.closeQuietly(r3)
        L49:
            throw r5
        L4a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.WebSocketListener getListener$okhttp() {
            r1 = this;
            okhttp3.WebSocketListener r0 = r1.listener
            return r0
    }

    public final void initReaderAndWriter(@org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull okhttp3.internal.ws.RealWebSocket.Streams r18) throws java.io.IOException {
            r16 = this;
            r10 = r16
            r0 = r17
            r11 = r18
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "streams"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            okhttp3.internal.ws.WebSocketExtensions r12 = r10.extensions
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12)
            monitor-enter(r16)
            r10.name = r0     // Catch: java.lang.Throwable -> La3
            r10.streams = r11     // Catch: java.lang.Throwable -> La3
            okhttp3.internal.ws.WebSocketWriter r9 = new okhttp3.internal.ws.WebSocketWriter     // Catch: java.lang.Throwable -> La3
            boolean r2 = r18.getClient()     // Catch: java.lang.Throwable -> La3
            okio.BufferedSink r3 = r18.getSink()     // Catch: java.lang.Throwable -> La3
            java.util.Random r4 = r10.random     // Catch: java.lang.Throwable -> La3
            boolean r5 = r12.perMessageDeflate     // Catch: java.lang.Throwable -> La3
            boolean r1 = r18.getClient()     // Catch: java.lang.Throwable -> La3
            boolean r6 = r12.noContextTakeover(r1)     // Catch: java.lang.Throwable -> La3
            long r7 = r10.minimumDeflateSize     // Catch: java.lang.Throwable -> La3
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> La3
            r10.writer = r9     // Catch: java.lang.Throwable -> La3
            okhttp3.internal.ws.RealWebSocket$WriterTask r1 = new okhttp3.internal.ws.RealWebSocket$WriterTask     // Catch: java.lang.Throwable -> La3
            r1.<init>(r10)     // Catch: java.lang.Throwable -> La3
            r10.writerTask = r1     // Catch: java.lang.Throwable -> La3
            long r1 = r10.pingIntervalMillis     // Catch: java.lang.Throwable -> La3
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L74
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> La3
            long r13 = r3.toNanos(r1)     // Catch: java.lang.Throwable -> La3
            okhttp3.internal.concurrent.TaskQueue r15 = r10.taskQueue     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r1.<init>()     // Catch: java.lang.Throwable -> La3
            r1.append(r0)     // Catch: java.lang.Throwable -> La3
            java.lang.String r2 = " ping"
            r1.append(r2)     // Catch: java.lang.Throwable -> La3
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> La3
            okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1 r9 = new okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1     // Catch: java.lang.Throwable -> La3
            r1 = r9
            r2 = r3
            r4 = r13
            r6 = r16
            r7 = r17
            r8 = r18
            r0 = r9
            r9 = r12
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La3
            r15.schedule(r0, r13)     // Catch: java.lang.Throwable -> La3
        L74:
            java.util.ArrayDeque<java.lang.Object> r0 = r10.messageAndCloseQueue     // Catch: java.lang.Throwable -> La3
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> La3
            r0 = r0 ^ 1
            if (r0 == 0) goto L81
            r16.runWriter()     // Catch: java.lang.Throwable -> La3
        L81:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La3
            monitor-exit(r16)
            okhttp3.internal.ws.WebSocketReader r0 = new okhttp3.internal.ws.WebSocketReader
            boolean r2 = r18.getClient()
            okio.BufferedSource r3 = r18.getSource()
            boolean r5 = r12.perMessageDeflate
            boolean r1 = r18.getClient()
            r1 = r1 ^ 1
            boolean r6 = r12.noContextTakeover(r1)
            r1 = r0
            r4 = r16
            r1.<init>(r2, r3, r4, r5, r6)
            r10.reader = r0
            return
        La3:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
    }

    public final void loopReader() throws java.io.IOException {
            r2 = this;
        L0:
            int r0 = r2.receivedCloseCode
            r1 = -1
            if (r0 != r1) goto Le
            okhttp3.internal.ws.WebSocketReader r0 = r2.reader
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0.processNextFrame()
            goto L0
        Le:
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "reason"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 1
            r1 = 0
            r2 = -1
            if (r5 == r2) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r3 == 0) goto L7d
            monitor-enter(r4)
            int r3 = r4.receivedCloseCode     // Catch: java.lang.Throwable -> L7a
            if (r3 != r2) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L6e
            r4.receivedCloseCode = r5     // Catch: java.lang.Throwable -> L7a
            r4.receivedCloseReason = r6     // Catch: java.lang.Throwable -> L7a
            boolean r0 = r4.enqueuedClose     // Catch: java.lang.Throwable -> L7a
            r1 = 0
            if (r0 == 0) goto L3c
            java.util.ArrayDeque<java.lang.Object> r0 = r4.messageAndCloseQueue     // Catch: java.lang.Throwable -> L7a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L3c
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r4.streams     // Catch: java.lang.Throwable -> L7a
            r4.streams = r1     // Catch: java.lang.Throwable -> L7a
            okhttp3.internal.ws.WebSocketReader r2 = r4.reader     // Catch: java.lang.Throwable -> L7a
            r4.reader = r1     // Catch: java.lang.Throwable -> L7a
            okhttp3.internal.ws.WebSocketWriter r3 = r4.writer     // Catch: java.lang.Throwable -> L7a
            r4.writer = r1     // Catch: java.lang.Throwable -> L7a
            okhttp3.internal.concurrent.TaskQueue r1 = r4.taskQueue     // Catch: java.lang.Throwable -> L7a
            r1.shutdown()     // Catch: java.lang.Throwable -> L7a
            r1 = r0
            goto L3e
        L3c:
            r2 = r1
            r3 = r2
        L3e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r4)
            okhttp3.WebSocketListener r0 = r4.listener     // Catch: java.lang.Throwable -> L5d
            r0.onClosing(r4, r5, r6)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L4d
            okhttp3.WebSocketListener r0 = r4.listener     // Catch: java.lang.Throwable -> L5d
            r0.onClosed(r4, r5, r6)     // Catch: java.lang.Throwable -> L5d
        L4d:
            if (r1 == 0) goto L52
            okhttp3.internal.Util.closeQuietly(r1)
        L52:
            if (r2 == 0) goto L57
            okhttp3.internal.Util.closeQuietly(r2)
        L57:
            if (r3 == 0) goto L5c
            okhttp3.internal.Util.closeQuietly(r3)
        L5c:
            return
        L5d:
            r5 = move-exception
            if (r1 == 0) goto L63
            okhttp3.internal.Util.closeQuietly(r1)
        L63:
            if (r2 == 0) goto L68
            okhttp3.internal.Util.closeQuietly(r2)
        L68:
            if (r3 == 0) goto L6d
            okhttp3.internal.Util.closeQuietly(r3)
        L6d:
            throw r5
        L6e:
            java.lang.String r5 = "already closed"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L7a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L7a
            throw r6     // Catch: java.lang.Throwable -> L7a
        L7a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L7d:
            java.lang.String r5 = "Failed requirement."
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@org.jetbrains.annotations.NotNull java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.WebSocketListener r0 = r1.listener
            r0.onMessage(r1, r2)
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@org.jetbrains.annotations.NotNull okio.ByteString r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.WebSocketListener r0 = r1.listener
            r0.onMessage(r1, r2)
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> L29
            boolean r0 = r1.failed     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L27
            boolean r0 = r1.enqueuedClose     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L17
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L17
            goto L27
        L17:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.pongQueue     // Catch: java.lang.Throwable -> L29
            r0.add(r2)     // Catch: java.lang.Throwable -> L29
            r1.runWriter()     // Catch: java.lang.Throwable -> L29
            int r2 = r1.receivedPingCount     // Catch: java.lang.Throwable -> L29
            int r2 = r2 + 1
            r1.receivedPingCount = r2     // Catch: java.lang.Throwable -> L29
            monitor-exit(r1)
            return
        L27:
            monitor-exit(r1)
            return
        L29:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> L11
            int r2 = r1.receivedPongCount     // Catch: java.lang.Throwable -> L11
            int r2 = r2 + 1
            r1.receivedPongCount = r2     // Catch: java.lang.Throwable -> L11
            r2 = 0
            r1.awaitingPong = r2     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized boolean pong(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> L25
            boolean r0 = r1.failed     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L22
            boolean r0 = r1.enqueuedClose     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L17
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch: java.lang.Throwable -> L25
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L17
            goto L22
        L17:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.pongQueue     // Catch: java.lang.Throwable -> L25
            r0.add(r2)     // Catch: java.lang.Throwable -> L25
            r1.runWriter()     // Catch: java.lang.Throwable -> L25
            r2 = 1
            monitor-exit(r1)
            return r2
        L22:
            r2 = 0
            monitor-exit(r1)
            return r2
        L25:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final boolean processNextFrame() throws java.io.IOException {
            r3 = this;
            r0 = 0
            okhttp3.internal.ws.WebSocketReader r1 = r3.reader     // Catch: java.lang.Exception -> L10
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Exception -> L10
            r1.processNextFrame()     // Catch: java.lang.Exception -> L10
            int r1 = r3.receivedCloseCode     // Catch: java.lang.Exception -> L10
            r2 = -1
            if (r1 != r2) goto L15
            r0 = 1
            goto L15
        L10:
            r1 = move-exception
            r2 = 0
            r3.failWebSocket(r1, r2)
        L15:
            return r0
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.queueSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized int receivedPingCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.receivedPingCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized int receivedPongCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.receivedPongCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // okhttp3.WebSocket
    @org.jetbrains.annotations.NotNull
    public okhttp3.Request request() {
            r1 = this;
            okhttp3.Request r0 = r1.originalRequest
            return r0
    }

    @Override // okhttp3.WebSocket
    public boolean send(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r2 = r0.encodeUtf8(r2)
            r0 = 1
            boolean r2 = r1.send(r2, r0)
            return r2
    }

    @Override // okhttp3.WebSocket
    public boolean send(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 2
            boolean r2 = r1.send(r2, r0)
            return r2
    }

    public final synchronized int sentPingCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.sentPingCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void tearDown() throws java.lang.InterruptedException {
            r4 = this;
            okhttp3.internal.concurrent.TaskQueue r0 = r4.taskQueue
            r0.shutdown()
            okhttp3.internal.concurrent.TaskQueue r0 = r4.taskQueue
            java.util.concurrent.CountDownLatch r0 = r0.idleLatch()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 10
            r0.await(r2, r1)
            return
    }

    public final boolean writeOneFrame$okhttp() throws java.io.IOException {
            r27 = this;
            r15 = r27
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            r1 = 0
            r0.element = r1
            kotlin.jvm.internal.Ref$IntRef r14 = new kotlin.jvm.internal.Ref$IntRef
            r14.<init>()
            r2 = -1
            r14.element = r2
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            r13.element = r1
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            r12.element = r1
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            r11.element = r1
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r10.element = r1
            monitor-enter(r27)
            boolean r3 = r15.failed     // Catch: java.lang.Throwable -> L1d2
            r4 = 0
            if (r3 == 0) goto L36
            monitor-exit(r27)
            return r4
        L36:
            okhttp3.internal.ws.WebSocketWriter r9 = r15.writer     // Catch: java.lang.Throwable -> L1d2
            java.util.ArrayDeque<okio.ByteString> r3 = r15.pongQueue     // Catch: java.lang.Throwable -> L1d2
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1d2
            r8 = r3
            okio.ByteString r8 = (okio.ByteString) r8     // Catch: java.lang.Throwable -> L1d2
            if (r8 != 0) goto Le6
            java.util.ArrayDeque<java.lang.Object> r3 = r15.messageAndCloseQueue     // Catch: java.lang.Throwable -> L1d2
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1d2
            r0.element = r3     // Catch: java.lang.Throwable -> L1d2
            boolean r5 = r3 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch: java.lang.Throwable -> L1d2
            if (r5 == 0) goto Ld4
            int r3 = r15.receivedCloseCode     // Catch: java.lang.Throwable -> L1d2
            r14.element = r3     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r4 = r15.receivedCloseReason     // Catch: java.lang.Throwable -> L1d2
            r13.element = r4     // Catch: java.lang.Throwable -> L1d2
            if (r3 == r2) goto L72
            okhttp3.internal.ws.RealWebSocket$Streams r2 = r15.streams     // Catch: java.lang.Throwable -> L1d2
            r12.element = r2     // Catch: java.lang.Throwable -> L1d2
            r15.streams = r1     // Catch: java.lang.Throwable -> L1d2
            okhttp3.internal.ws.WebSocketReader r2 = r15.reader     // Catch: java.lang.Throwable -> L1d2
            r11.element = r2     // Catch: java.lang.Throwable -> L1d2
            r15.reader = r1     // Catch: java.lang.Throwable -> L1d2
            okhttp3.internal.ws.WebSocketWriter r2 = r15.writer     // Catch: java.lang.Throwable -> L1d2
            r10.element = r2     // Catch: java.lang.Throwable -> L1d2
            r15.writer = r1     // Catch: java.lang.Throwable -> L1d2
            okhttp3.internal.concurrent.TaskQueue r1 = r15.taskQueue     // Catch: java.lang.Throwable -> L1d2
            r1.shutdown()     // Catch: java.lang.Throwable -> L1d2
            goto Le6
        L72:
            T r1 = r0.element     // Catch: java.lang.Throwable -> L1d2
            if (r1 == 0) goto Lcc
            okhttp3.internal.ws.RealWebSocket$Close r1 = (okhttp3.internal.ws.RealWebSocket.Close) r1     // Catch: java.lang.Throwable -> L1d2
            long r1 = r1.getCancelAfterCloseMillis()     // Catch: java.lang.Throwable -> L1d2
            okhttp3.internal.concurrent.TaskQueue r7 = r15.taskQueue     // Catch: java.lang.Throwable -> L1d2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d2
            r3.<init>()     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r4 = r15.name     // Catch: java.lang.Throwable -> L1d2
            r3.append(r4)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r4 = " cancel"
            r3.append(r4)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L1d2
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L1d2
            long r5 = r3.toNanos(r1)     // Catch: java.lang.Throwable -> L1d2
            r16 = 1
            okhttp3.internal.ws.RealWebSocket$writeOneFrame$$inlined$synchronized$lambda$1 r3 = new okhttp3.internal.ws.RealWebSocket$writeOneFrame$$inlined$synchronized$lambda$1     // Catch: java.lang.Throwable -> L1d2
            r1 = r3
            r2 = r4
            r17 = r3
            r3 = r16
            r18 = r5
            r5 = r16
            r6 = r27
            r20 = r7
            r7 = r9
            r16 = r8
            r21 = r9
            r9 = r0
            r22 = r10
            r10 = r14
            r23 = r11
            r11 = r13
            r24 = r12
            r25 = r13
            r13 = r23
            r26 = r14
            r14 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L1d2
            r4 = r17
            r2 = r18
            r1 = r20
            r1.schedule(r4, r2)     // Catch: java.lang.Throwable -> L1d2
            goto Lf4
        Lcc:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r1 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d2
            throw r0     // Catch: java.lang.Throwable -> L1d2
        Ld4:
            r16 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r12
            r25 = r13
            r26 = r14
            if (r3 != 0) goto Lf4
            monitor-exit(r27)
            return r4
        Le6:
            r16 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r12
            r25 = r13
            r26 = r14
        Lf4:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1d2
            monitor-exit(r27)
            r3 = r16
            if (r3 == 0) goto L106
            kotlin.jvm.internal.Intrinsics.checkNotNull(r21)     // Catch: java.lang.Throwable -> L1af
            r1 = r21
            r1.writePong(r3)     // Catch: java.lang.Throwable -> L1af
        L103:
            r1 = r24
            goto L16c
        L106:
            r1 = r21
            T r0 = r0.element     // Catch: java.lang.Throwable -> L1af
            boolean r2 = r0 instanceof okhttp3.internal.ws.RealWebSocket.Message     // Catch: java.lang.Throwable -> L1af
            if (r2 == 0) goto L13c
            if (r0 == 0) goto L134
            okhttp3.internal.ws.RealWebSocket$Message r0 = (okhttp3.internal.ws.RealWebSocket.Message) r0     // Catch: java.lang.Throwable -> L1af
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L1af
            int r2 = r0.getFormatOpcode()     // Catch: java.lang.Throwable -> L1af
            okio.ByteString r3 = r0.getData()     // Catch: java.lang.Throwable -> L1af
            r1.writeMessageFrame(r2, r3)     // Catch: java.lang.Throwable -> L1af
            monitor-enter(r27)     // Catch: java.lang.Throwable -> L1af
            long r1 = r15.queueSize     // Catch: java.lang.Throwable -> L131
            okio.ByteString r0 = r0.getData()     // Catch: java.lang.Throwable -> L131
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L131
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L131
            long r1 = r1 - r3
            r15.queueSize = r1     // Catch: java.lang.Throwable -> L131
            monitor-exit(r27)     // Catch: java.lang.Throwable -> L1af
            goto L103
        L131:
            r0 = move-exception
            monitor-exit(r27)     // Catch: java.lang.Throwable -> L1af
            throw r0     // Catch: java.lang.Throwable -> L1af
        L134:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1af
            java.lang.String r1 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1af
            throw r0     // Catch: java.lang.Throwable -> L1af
        L13c:
            boolean r2 = r0 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch: java.lang.Throwable -> L1af
            if (r2 == 0) goto L1a1
            if (r0 == 0) goto L193
            okhttp3.internal.ws.RealWebSocket$Close r0 = (okhttp3.internal.ws.RealWebSocket.Close) r0     // Catch: java.lang.Throwable -> L1af
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L1af
            int r2 = r0.getCode()     // Catch: java.lang.Throwable -> L1af
            okio.ByteString r0 = r0.getReason()     // Catch: java.lang.Throwable -> L1af
            r1.writeClose(r2, r0)     // Catch: java.lang.Throwable -> L1af
            r1 = r24
            T r0 = r1.element     // Catch: java.lang.Throwable -> L18d
            okhttp3.internal.ws.RealWebSocket$Streams r0 = (okhttp3.internal.ws.RealWebSocket.Streams) r0     // Catch: java.lang.Throwable -> L18d
            if (r0 == 0) goto L16c
            okhttp3.WebSocketListener r0 = r15.listener     // Catch: java.lang.Throwable -> L18d
            r2 = r26
            int r2 = r2.element     // Catch: java.lang.Throwable -> L18d
            r3 = r25
            T r3 = r3.element     // Catch: java.lang.Throwable -> L18d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L18d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L18d
            r0.onClosed(r15, r2, r3)     // Catch: java.lang.Throwable -> L18d
        L16c:
            r0 = 1
            T r1 = r1.element
            okhttp3.internal.ws.RealWebSocket$Streams r1 = (okhttp3.internal.ws.RealWebSocket.Streams) r1
            if (r1 == 0) goto L176
            okhttp3.internal.Util.closeQuietly(r1)
        L176:
            r2 = r23
            T r1 = r2.element
            okhttp3.internal.ws.WebSocketReader r1 = (okhttp3.internal.ws.WebSocketReader) r1
            if (r1 == 0) goto L181
            okhttp3.internal.Util.closeQuietly(r1)
        L181:
            r3 = r22
            T r1 = r3.element
            okhttp3.internal.ws.WebSocketWriter r1 = (okhttp3.internal.ws.WebSocketWriter) r1
            if (r1 == 0) goto L18c
            okhttp3.internal.Util.closeQuietly(r1)
        L18c:
            return r0
        L18d:
            r0 = move-exception
            r3 = r22
            r2 = r23
            goto L1b6
        L193:
            r3 = r22
            r2 = r23
            r1 = r24
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1ad
            java.lang.String r4 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L1ad
            throw r0     // Catch: java.lang.Throwable -> L1ad
        L1a1:
            r3 = r22
            r2 = r23
            r1 = r24
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L1ad
            r0.<init>()     // Catch: java.lang.Throwable -> L1ad
            throw r0     // Catch: java.lang.Throwable -> L1ad
        L1ad:
            r0 = move-exception
            goto L1b6
        L1af:
            r0 = move-exception
            r3 = r22
            r2 = r23
            r1 = r24
        L1b6:
            T r1 = r1.element
            okhttp3.internal.ws.RealWebSocket$Streams r1 = (okhttp3.internal.ws.RealWebSocket.Streams) r1
            if (r1 == 0) goto L1bf
            okhttp3.internal.Util.closeQuietly(r1)
        L1bf:
            T r1 = r2.element
            okhttp3.internal.ws.WebSocketReader r1 = (okhttp3.internal.ws.WebSocketReader) r1
            if (r1 == 0) goto L1c8
            okhttp3.internal.Util.closeQuietly(r1)
        L1c8:
            T r1 = r3.element
            okhttp3.internal.ws.WebSocketWriter r1 = (okhttp3.internal.ws.WebSocketWriter) r1
            if (r1 == 0) goto L1d1
            okhttp3.internal.Util.closeQuietly(r1)
        L1d1:
            throw r0
        L1d2:
            r0 = move-exception
            monitor-exit(r27)
            throw r0
    }

    public final void writePingFrame$okhttp() {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.failed     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L7
            monitor-exit(r7)
            return
        L7:
            okhttp3.internal.ws.WebSocketWriter r0 = r7.writer     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L54
            boolean r1 = r7.awaitingPong     // Catch: java.lang.Throwable -> L56
            r2 = -1
            if (r1 == 0) goto L13
            int r1 = r7.sentPingCount     // Catch: java.lang.Throwable -> L56
            goto L14
        L13:
            r1 = -1
        L14:
            int r3 = r7.sentPingCount     // Catch: java.lang.Throwable -> L56
            r4 = 1
            int r3 = r3 + r4
            r7.sentPingCount = r3     // Catch: java.lang.Throwable -> L56
            r7.awaitingPong = r4     // Catch: java.lang.Throwable -> L56
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L56
            monitor-exit(r7)
            r3 = 0
            if (r1 == r2) goto L49
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.String r2 = "sent ping but didn't receive pong within "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            long r5 = r7.pingIntervalMillis
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r7.failWebSocket(r0, r3)
            return
        L49:
            okio.ByteString r1 = okio.ByteString.EMPTY     // Catch: java.io.IOException -> L4f
            r0.writePing(r1)     // Catch: java.io.IOException -> L4f
            goto L53
        L4f:
            r0 = move-exception
            r7.failWebSocket(r0, r3)
        L53:
            return
        L54:
            monitor-exit(r7)
            return
        L56:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
    }
}
