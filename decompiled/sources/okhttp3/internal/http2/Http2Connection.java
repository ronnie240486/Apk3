package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2Connection.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \u0099\u00012\u00020\u0001:\b\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010P\u001a\u00020QJ\b\u0010R\u001a\u00020QH\u0016J'\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020T2\b\u0010V\u001a\u0004\u0018\u00010WH\u0000¢\u0006\u0002\bXJ\u0012\u0010Y\u001a\u00020Q2\b\u0010Z\u001a\u0004\u0018\u00010WH\u0002J\u0006\u0010[\u001a\u00020QJ\u0010\u0010\\\u001a\u0004\u0018\u00010B2\u0006\u0010]\u001a\u00020\u0012J\u000e\u0010^\u001a\u00020\t2\u0006\u0010_\u001a\u00020\u0006J&\u0010`\u001a\u00020B2\u0006\u0010a\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010e\u001a\u00020\tH\u0002J\u001c\u0010`\u001a\u00020B2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010e\u001a\u00020\tJ\u0006\u0010f\u001a\u00020\u0012J-\u0010g\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020\u00122\u0006\u0010l\u001a\u00020\tH\u0000¢\u0006\u0002\bmJ+\u0010n\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010l\u001a\u00020\tH\u0000¢\u0006\u0002\boJ#\u0010p\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0cH\u0000¢\u0006\u0002\bqJ\u001d\u0010r\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010s\u001a\u00020TH\u0000¢\u0006\u0002\btJ$\u0010u\u001a\u00020B2\u0006\u0010a\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010e\u001a\u00020\tJ\u0015\u0010v\u001a\u00020\t2\u0006\u0010h\u001a\u00020\u0012H\u0000¢\u0006\u0002\bwJ\u0017\u0010x\u001a\u0004\u0018\u00010B2\u0006\u0010h\u001a\u00020\u0012H\u0000¢\u0006\u0002\byJ\r\u0010z\u001a\u00020QH\u0000¢\u0006\u0002\b{J\u000e\u0010|\u001a\u00020Q2\u0006\u0010}\u001a\u00020&J\u000e\u0010~\u001a\u00020Q2\u0006\u0010\u007f\u001a\u00020TJ\u001e\u0010\u0080\u0001\u001a\u00020Q2\t\b\u0002\u0010\u0081\u0001\u001a\u00020\t2\b\b\u0002\u0010E\u001a\u00020FH\u0007J\u0018\u0010\u0082\u0001\u001a\u00020Q2\u0007\u0010\u0083\u0001\u001a\u00020\u0006H\u0000¢\u0006\u0003\b\u0084\u0001J,\u0010\u0085\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0007\u0010\u0086\u0001\u001a\u00020\t2\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u00012\u0006\u0010k\u001a\u00020\u0006J/\u0010\u0089\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0007\u0010\u0086\u0001\u001a\u00020\t2\r\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020d0cH\u0000¢\u0006\u0003\b\u008b\u0001J\u0007\u0010\u008c\u0001\u001a\u00020QJ\"\u0010\u008c\u0001\u001a\u00020Q2\u0007\u0010\u008d\u0001\u001a\u00020\t2\u0007\u0010\u008e\u0001\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020\u0012J\u0007\u0010\u0090\u0001\u001a\u00020QJ\u001f\u0010\u0091\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010\u007f\u001a\u00020TH\u0000¢\u0006\u0003\b\u0092\u0001J\u001f\u0010\u0093\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010s\u001a\u00020TH\u0000¢\u0006\u0003\b\u0094\u0001J \u0010\u0095\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0007\u0010\u0096\u0001\u001a\u00020\u0006H\u0000¢\u0006\u0003\b\u0097\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010\u001dR\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010(\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001e\u00105\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0015\u00107\u001a\u000608R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u000e\u0010;\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u00020=X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020B0AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010G\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bH\u00104R\u001e\u0010I\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bJ\u00104R\u0011\u0010K\u001a\u00020L¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u000e\u0010O\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u009c\u0001"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "builder", "Lokhttp3/internal/http2/Http2Connection$Builder;", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "awaitPingsSent", "", "awaitPongsReceived", "client", "", "getClient$okhttp", "()Z", "connectionName", "", "getConnectionName$okhttp", "()Ljava/lang/String;", "currentPushRequests", "", "", "degradedPingsSent", "degradedPongDeadlineNs", "degradedPongsReceived", "intervalPingsSent", "intervalPongsReceived", "isShutdown", "lastGoodStreamId", "getLastGoodStreamId$okhttp", "()I", "setLastGoodStreamId$okhttp", "(I)V", "listener", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "nextStreamId", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "okHttpSettings", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "peerSettings", "getPeerSettings", "setPeerSettings", "(Lokhttp3/internal/http2/Settings;)V", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "pushQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "<set-?>", "readBytesAcknowledged", "getReadBytesAcknowledged", "()J", "readBytesTotal", "getReadBytesTotal", "readerRunnable", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "settingsListenerQueue", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "streams", "", "Lokhttp3/internal/http2/Http2Stream;", "getStreams$okhttp", "()Ljava/util/Map;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "writeBytesMaximum", "getWriteBytesMaximum", "writeBytesTotal", "getWriteBytesTotal", "writer", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "writerQueue", "awaitPong", "", "close", "connectionCode", "Lokhttp3/internal/http2/ErrorCode;", "streamCode", "cause", "Ljava/io/IOException;", "close$okhttp", "failConnection", "e", "flush", "getStream", "id", "isHealthy", "nowNs", "newStream", "associatedStreamId", "requestHeaders", "", "Lokhttp3/internal/http2/Header;", "out", "openStreamCount", "pushDataLater", "streamId", "source", "Lokio/BufferedSource;", "byteCount", "inFinished", "pushDataLater$okhttp", "pushHeadersLater", "pushHeadersLater$okhttp", "pushRequestLater", "pushRequestLater$okhttp", "pushResetLater", "errorCode", "pushResetLater$okhttp", "pushStream", "pushedStream", "pushedStream$okhttp", "removeStream", "removeStream$okhttp", "sendDegradedPingLater", "sendDegradedPingLater$okhttp", "setSettings", "settings", "shutdown", "statusCode", "start", "sendConnectionPreface", "updateConnectionFlowControl", "read", "updateConnectionFlowControl$okhttp", "writeData", "outFinished", "buffer", "Lokio/Buffer;", "writeHeaders", "alternating", "writeHeaders$okhttp", "writePing", "reply", "payload1", "payload2", "writePingAndAwaitPong", "writeSynReset", "writeSynReset$okhttp", "writeSynResetLater", "writeSynResetLater$okhttp", "writeWindowUpdateLater", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "Builder", "Companion", "Listener", "ReaderRunnable", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Http2Connection implements java.io.Closeable {
    public static final int AWAIT_PING = 3;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Http2Connection.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final okhttp3.internal.http2.Settings DEFAULT_SETTINGS = null;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String connectionName;
    private final java.util.Set<java.lang.Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Connection.Listener listener;
    private int nextStreamId;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Settings okHttpSettings;

    @org.jetbrains.annotations.NotNull
    private okhttp3.internal.http2.Settings peerSettings;
    private final okhttp3.internal.http2.PushObserver pushObserver;
    private final okhttp3.internal.concurrent.TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Connection.ReaderRunnable readerRunnable;
    private final okhttp3.internal.concurrent.TaskQueue settingsListenerQueue;

    @org.jetbrains.annotations.NotNull
    private final java.net.Socket socket;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> streams;
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Writer writer;
    private final okhttp3.internal.concurrent.TaskQueue writerQueue;

    /* JADX INFO: compiled from: Http2Connection.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u00107\u001a\u000208J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eJ.\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\b\b\u0002\u00109\u001a\u00020\f2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010#\u001a\u00020$H\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020*X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "client", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "getClient$okhttp", "()Z", "setClient$okhttp", "(Z)V", "connectionName", "", "getConnectionName$okhttp", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "listener", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "setListener$okhttp", "(Lokhttp3/internal/http2/Http2Connection$Listener;)V", "pingIntervalMillis", "", "getPingIntervalMillis$okhttp", "()I", "setPingIntervalMillis$okhttp", "(I)V", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "getPushObserver$okhttp", "()Lokhttp3/internal/http2/PushObserver;", "setPushObserver$okhttp", "(Lokhttp3/internal/http2/PushObserver;)V", "sink", "Lokio/BufferedSink;", "getSink$okhttp", "()Lokio/BufferedSink;", "setSink$okhttp", "(Lokio/BufferedSink;)V", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "source", "Lokio/BufferedSource;", "getSource$okhttp", "()Lokio/BufferedSource;", "setSource$okhttp", "(Lokio/BufferedSource;)V", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "build", "Lokhttp3/internal/http2/Http2Connection;", "peerName", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Builder {
        private boolean client;
        public java.lang.String connectionName;

        @org.jetbrains.annotations.NotNull
        private okhttp3.internal.http2.Http2Connection.Listener listener;
        private int pingIntervalMillis;

        @org.jetbrains.annotations.NotNull
        private okhttp3.internal.http2.PushObserver pushObserver;
        public okio.BufferedSink sink;
        public java.net.Socket socket;
        public okio.BufferedSource source;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.internal.concurrent.TaskRunner taskRunner;

        public Builder(boolean r2, @org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r3) {
                r1 = this;
                java.lang.String r0 = "taskRunner"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.<init>()
                r1.client = r2
                r1.taskRunner = r3
                okhttp3.internal.http2.Http2Connection$Listener r2 = okhttp3.internal.http2.Http2Connection.Listener.REFUSE_INCOMING_STREAMS
                r1.listener = r2
                okhttp3.internal.http2.PushObserver r2 = okhttp3.internal.http2.PushObserver.CANCEL
                r1.pushObserver = r2
                return
        }

        public static /* synthetic */ okhttp3.internal.http2.Http2Connection.Builder socket$default(okhttp3.internal.http2.Http2Connection.Builder r0, java.net.Socket r1, java.lang.String r2, okio.BufferedSource r3, okio.BufferedSink r4, int r5, java.lang.Object r6) throws java.io.IOException {
                r6 = r5 & 2
                if (r6 == 0) goto L8
                java.lang.String r2 = okhttp3.internal.Util.peerName(r1)
            L8:
                r6 = r5 & 4
                if (r6 == 0) goto L14
                okio.Source r3 = okio.Okio.source(r1)
                okio.BufferedSource r3 = okio.Okio.buffer(r3)
            L14:
                r5 = r5 & 8
                if (r5 == 0) goto L20
                okio.Sink r4 = okio.Okio.sink(r1)
                okio.BufferedSink r4 = okio.Okio.buffer(r4)
            L20:
                okhttp3.internal.http2.Http2Connection$Builder r0 = r0.socket(r1, r2, r3, r4)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Connection build() {
                r1 = this;
                okhttp3.internal.http2.Http2Connection r0 = new okhttp3.internal.http2.Http2Connection
                r0.<init>(r1)
                return r0
        }

        public final boolean getClient$okhttp() {
                r1 = this;
                boolean r0 = r1.client
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getConnectionName$okhttp() {
                r2 = this;
                java.lang.String r0 = r2.connectionName
                if (r0 != 0) goto L9
                java.lang.String r1 = "connectionName"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            L9:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Connection.Listener getListener$okhttp() {
                r1 = this;
                okhttp3.internal.http2.Http2Connection$Listener r0 = r1.listener
                return r0
        }

        public final int getPingIntervalMillis$okhttp() {
                r1 = this;
                int r0 = r1.pingIntervalMillis
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.PushObserver getPushObserver$okhttp() {
                r1 = this;
                okhttp3.internal.http2.PushObserver r0 = r1.pushObserver
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.BufferedSink getSink$okhttp() {
                r2 = this;
                okio.BufferedSink r0 = r2.sink
                if (r0 != 0) goto La
                java.lang.String r1 = "sink"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            La:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.net.Socket getSocket$okhttp() {
                r2 = this;
                java.net.Socket r0 = r2.socket
                if (r0 != 0) goto La
                java.lang.String r1 = "socket"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            La:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.BufferedSource getSource$okhttp() {
                r2 = this;
                okio.BufferedSource r0 = r2.source
                if (r0 != 0) goto La
                java.lang.String r1 = "source"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            La:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.concurrent.TaskRunner getTaskRunner$okhttp() {
                r1 = this;
                okhttp3.internal.concurrent.TaskRunner r0 = r1.taskRunner
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Connection.Builder listener(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Connection.Listener r2) {
                r1 = this;
                java.lang.String r0 = "listener"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.listener = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Connection.Builder pingIntervalMillis(int r1) {
                r0 = this;
                r0.pingIntervalMillis = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Connection.Builder pushObserver(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.PushObserver r2) {
                r1 = this;
                java.lang.String r0 = "pushObserver"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.pushObserver = r2
                return r1
        }

        public final void setClient$okhttp(boolean r1) {
                r0 = this;
                r0.client = r1
                return
        }

        public final void setConnectionName$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.connectionName = r2
                return
        }

        public final void setListener$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Connection.Listener r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.listener = r2
                return
        }

        public final void setPingIntervalMillis$okhttp(int r1) {
                r0 = this;
                r0.pingIntervalMillis = r1
                return
        }

        public final void setPushObserver$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.PushObserver r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.pushObserver = r2
                return
        }

        public final void setSink$okhttp(@org.jetbrains.annotations.NotNull okio.BufferedSink r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.sink = r2
                return
        }

        public final void setSocket$okhttp(@org.jetbrains.annotations.NotNull java.net.Socket r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.socket = r2
                return
        }

        public final void setSource$okhttp(@org.jetbrains.annotations.NotNull okio.BufferedSource r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.source = r2
                return
        }

        @kotlin.jvm.JvmOverloads
        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Connection.Builder socket(@org.jetbrains.annotations.NotNull java.net.Socket r8) throws java.io.IOException {
                r7 = this;
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 14
                r6 = 0
                r0 = r7
                r1 = r8
                okhttp3.internal.http2.Http2Connection$Builder r8 = socket$default(r0, r1, r2, r3, r4, r5, r6)
                return r8
        }

        @kotlin.jvm.JvmOverloads
        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Connection.Builder socket(@org.jetbrains.annotations.NotNull java.net.Socket r8, @org.jetbrains.annotations.NotNull java.lang.String r9) throws java.io.IOException {
                r7 = this;
                r3 = 0
                r4 = 0
                r5 = 12
                r6 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                okhttp3.internal.http2.Http2Connection$Builder r8 = socket$default(r0, r1, r2, r3, r4, r5, r6)
                return r8
        }

        @kotlin.jvm.JvmOverloads
        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Connection.Builder socket(@org.jetbrains.annotations.NotNull java.net.Socket r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull okio.BufferedSource r10) throws java.io.IOException {
                r7 = this;
                r4 = 0
                r5 = 8
                r6 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                okhttp3.internal.http2.Http2Connection$Builder r8 = socket$default(r0, r1, r2, r3, r4, r5, r6)
                return r8
        }

        @kotlin.jvm.JvmOverloads
        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Connection.Builder socket(@org.jetbrains.annotations.NotNull java.net.Socket r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull okio.BufferedSource r4, @org.jetbrains.annotations.NotNull okio.BufferedSink r5) throws java.io.IOException {
                r1 = this;
                java.lang.String r0 = "socket"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "peerName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r1.socket = r2
                boolean r2 = r1.client
                if (r2 == 0) goto L34
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = okhttp3.internal.Util.okHttpName
                r2.append(r0)
                r0 = 32
                r2.append(r0)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                goto L3a
            L34:
                java.lang.String r2 = "MockWebServer "
                java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r3)
            L3a:
                r1.connectionName = r2
                r1.source = r4
                r1.sink = r5
                return r1
        }
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "()V", "AWAIT_PING", "", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/Settings;", "getDEFAULT_SETTINGS", "()Lokhttp3/internal/http2/Settings;", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, k = 1, mv = {1, 4, 1})
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
        public final okhttp3.internal.http2.Settings getDEFAULT_SETTINGS() {
                r1 = this;
                okhttp3.internal.http2.Settings r0 = okhttp3.internal.http2.Http2Connection.access$getDEFAULT_SETTINGS$cp()
                return r0
        }
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "()V", "onSettings", "", "connection", "Lokhttp3/internal/http2/Http2Connection;", "settings", "Lokhttp3/internal/http2/Settings;", "onStream", "stream", "Lokhttp3/internal/http2/Http2Stream;", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static abstract class Listener {

        @org.jetbrains.annotations.NotNull
        public static final okhttp3.internal.http2.Http2Connection.Listener.Companion Companion = null;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public static final okhttp3.internal.http2.Http2Connection.Listener REFUSE_INCOMING_STREAMS = null;

        /* JADX INFO: compiled from: Http2Connection.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener$Companion;", "", "()V", "REFUSE_INCOMING_STREAMS", "Lokhttp3/internal/http2/Http2Connection$Listener;", "okhttp"}, k = 1, mv = {1, 4, 1})
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
                okhttp3.internal.http2.Http2Connection$Listener$Companion r0 = new okhttp3.internal.http2.Http2Connection$Listener$Companion
                r1 = 0
                r0.<init>(r1)
                okhttp3.internal.http2.Http2Connection.Listener.Companion = r0
                okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 r0 = new okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
                r0.<init>()
                okhttp3.internal.http2.Http2Connection.Listener.REFUSE_INCOMING_STREAMS = r0
                return
        }

        public Listener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onSettings(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Connection r2, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r3) {
                r1 = this;
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "settings"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                return
        }

        public abstract void onStream(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Stream r1) throws java.io.IOException;
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0003H\u0016J8\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J(\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fH\u0016J \u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0010H\u0016J.\u0010$\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0016J\t\u0010)\u001a\u00020\u0003H\u0096\u0002J \u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\fH\u0016J(\u0010.\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0017H\u0016J&\u00102\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\f\u00104\u001a\b\u0012\u0004\u0012\u00020(0'H\u0016J\u0018\u00105\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u00106\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00107\u001a\u00020\u0014H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u00068"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "", "reader", "Lokhttp3/internal/http2/Http2Reader;", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V", "getReader$okhttp", "()Lokhttp3/internal/http2/Http2Reader;", "ackSettings", "alternateService", "streamId", "", "origin", "", "protocol", "Lokio/ByteString;", "host", "port", "maxAge", "", "applyAndAckSettings", "clearPrevious", "", "settings", "Lokhttp3/internal/http2/Settings;", "data", "inFinished", "source", "Lokio/BufferedSource;", "length", "goAway", "lastGoodStreamId", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "debugData", "headers", "associatedStreamId", "headerBlock", "", "Lokhttp3/internal/http2/Header;", "invoke", "ping", "ack", "payload1", "payload2", "priority", "streamDependency", "weight", "exclusive", "pushPromise", "promisedStreamId", "requestHeaders", "rstStream", "windowUpdate", "windowSizeIncrement", "okhttp"}, k = 1, mv = {1, 4, 1})
    public final class ReaderRunnable implements okhttp3.internal.http2.Http2Reader.Handler, kotlin.jvm.functions.Function0<kotlin.Unit> {

        @org.jetbrains.annotations.NotNull
        private final okhttp3.internal.http2.Http2Reader reader;
        public final /* synthetic */ okhttp3.internal.http2.Http2Connection this$0;

        public ReaderRunnable(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Connection r2, okhttp3.internal.http2.Http2Reader r3) {
                r1 = this;
                java.lang.String r0 = "reader"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.reader = r3
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
                r0 = this;
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull okio.ByteString r3, @org.jetbrains.annotations.NotNull java.lang.String r4, int r5, long r6) {
                r0 = this;
                java.lang.String r1 = "origin"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
                java.lang.String r1 = "protocol"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
                java.lang.String r1 = "host"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
                return
        }

        public final void applyAndAckSettings(boolean r22, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r23) {
                r21 = this;
                r12 = r21
                r0 = r23
                java.lang.String r1 = "settings"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                kotlin.jvm.internal.Ref$LongRef r13 = new kotlin.jvm.internal.Ref$LongRef
                r13.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
                r14.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef
                r15.<init>()
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0
                okhttp3.internal.http2.Http2Writer r16 = r1.getWriter()
                monitor-enter(r16)
                okhttp3.internal.http2.Http2Connection r11 = r12.this$0     // Catch: java.lang.Throwable -> L109
                monitor-enter(r11)     // Catch: java.lang.Throwable -> L109
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch: java.lang.Throwable -> L104
                okhttp3.internal.http2.Settings r1 = r1.getPeerSettings()     // Catch: java.lang.Throwable -> L104
                if (r22 == 0) goto L2d
                r2 = r0
                goto L3a
            L2d:
                okhttp3.internal.http2.Settings r2 = new okhttp3.internal.http2.Settings     // Catch: java.lang.Throwable -> L104
                r2.<init>()     // Catch: java.lang.Throwable -> L104
                r2.merge(r1)     // Catch: java.lang.Throwable -> L104
                r2.merge(r0)     // Catch: java.lang.Throwable -> L104
                kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L104
            L3a:
                r15.element = r2     // Catch: java.lang.Throwable -> L104
                int r2 = r2.getInitialWindowSize()     // Catch: java.lang.Throwable -> L104
                long r2 = (long) r2     // Catch: java.lang.Throwable -> L104
                int r1 = r1.getInitialWindowSize()     // Catch: java.lang.Throwable -> L104
                long r4 = (long) r1     // Catch: java.lang.Throwable -> L104
                long r2 = r2 - r4
                r13.element = r2     // Catch: java.lang.Throwable -> L104
                r10 = 0
                r8 = 0
                int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r1 == 0) goto L7a
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch: java.lang.Throwable -> L104
                java.util.Map r1 = r1.getStreams$okhttp()     // Catch: java.lang.Throwable -> L104
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L104
                if (r1 == 0) goto L5d
                goto L7a
            L5d:
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch: java.lang.Throwable -> L104
                java.util.Map r1 = r1.getStreams$okhttp()     // Catch: java.lang.Throwable -> L104
                java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L104
                okhttp3.internal.http2.Http2Stream[] r2 = new okhttp3.internal.http2.Http2Stream[r10]     // Catch: java.lang.Throwable -> L104
                java.lang.Object[] r1 = r1.toArray(r2)     // Catch: java.lang.Throwable -> L104
                if (r1 == 0) goto L72
                okhttp3.internal.http2.Http2Stream[] r1 = (okhttp3.internal.http2.Http2Stream[]) r1     // Catch: java.lang.Throwable -> L104
                goto L7b
            L72:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L104
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L104
                throw r0     // Catch: java.lang.Throwable -> L104
            L7a:
                r1 = 0
            L7b:
                r14.element = r1     // Catch: java.lang.Throwable -> L104
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch: java.lang.Throwable -> L104
                T r2 = r15.element     // Catch: java.lang.Throwable -> L104
                okhttp3.internal.http2.Settings r2 = (okhttp3.internal.http2.Settings) r2     // Catch: java.lang.Throwable -> L104
                r1.setPeerSettings(r2)     // Catch: java.lang.Throwable -> L104
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch: java.lang.Throwable -> L104
                okhttp3.internal.concurrent.TaskQueue r7 = okhttp3.internal.http2.Http2Connection.access$getSettingsListenerQueue$p(r1)     // Catch: java.lang.Throwable -> L104
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L104
                r1.<init>()     // Catch: java.lang.Throwable -> L104
                okhttp3.internal.http2.Http2Connection r2 = r12.this$0     // Catch: java.lang.Throwable -> L104
                java.lang.String r2 = r2.getConnectionName$okhttp()     // Catch: java.lang.Throwable -> L104
                r1.append(r2)     // Catch: java.lang.Throwable -> L104
                java.lang.String r2 = " onSettings"
                r1.append(r2)     // Catch: java.lang.Throwable -> L104
                java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L104
                r5 = 1
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$synchronized$lambda$1 r6 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$synchronized$lambda$1     // Catch: java.lang.Throwable -> L104
                r1 = r6
                r2 = r4
                r3 = r5
                r17 = r6
                r6 = r21
                r18 = r7
                r7 = r15
                r8 = r22
                r9 = r23
                r19 = 0
                r10 = r13
                r20 = r11
                r11 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L102
                r1 = r17
                r0 = r18
                r2 = 0
                r0.schedule(r1, r2)     // Catch: java.lang.Throwable -> L102
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L102
                monitor-exit(r20)     // Catch: java.lang.Throwable -> L109
                okhttp3.internal.http2.Http2Connection r0 = r12.this$0     // Catch: java.io.IOException -> Ld7 java.lang.Throwable -> L109
                okhttp3.internal.http2.Http2Writer r0 = r0.getWriter()     // Catch: java.io.IOException -> Ld7 java.lang.Throwable -> L109
                T r1 = r15.element     // Catch: java.io.IOException -> Ld7 java.lang.Throwable -> L109
                okhttp3.internal.http2.Settings r1 = (okhttp3.internal.http2.Settings) r1     // Catch: java.io.IOException -> Ld7 java.lang.Throwable -> L109
                r0.applyAndAckSettings(r1)     // Catch: java.io.IOException -> Ld7 java.lang.Throwable -> L109
                goto Ldd
            Ld7:
                r0 = move-exception
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch: java.lang.Throwable -> L109
                okhttp3.internal.http2.Http2Connection.access$failConnection(r1, r0)     // Catch: java.lang.Throwable -> L109
            Ldd:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L109
                monitor-exit(r16)
                T r0 = r14.element
                r1 = r0
                okhttp3.internal.http2.Http2Stream[] r1 = (okhttp3.internal.http2.Http2Stream[]) r1
                if (r1 == 0) goto L101
                okhttp3.internal.http2.Http2Stream[] r0 = (okhttp3.internal.http2.Http2Stream[]) r0
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                int r1 = r0.length
                r10 = 0
            Lee:
                if (r10 >= r1) goto L101
                r2 = r0[r10]
                monitor-enter(r2)
                long r3 = r13.element     // Catch: java.lang.Throwable -> Lfe
                r2.addBytesToWriteWindow(r3)     // Catch: java.lang.Throwable -> Lfe
                kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lfe
                monitor-exit(r2)
                int r10 = r10 + 1
                goto Lee
            Lfe:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L101:
                return
            L102:
                r0 = move-exception
                goto L107
            L104:
                r0 = move-exception
                r20 = r11
            L107:
                monitor-exit(r20)     // Catch: java.lang.Throwable -> L109
                throw r0     // Catch: java.lang.Throwable -> L109
            L109:
                r0 = move-exception
                monitor-exit(r16)
                throw r0
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean r3, int r4, @org.jetbrains.annotations.NotNull okio.BufferedSource r5, int r6) throws java.io.IOException {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                okhttp3.internal.http2.Http2Connection r0 = r2.this$0
                boolean r0 = r0.pushedStream$okhttp(r4)
                if (r0 == 0) goto L14
                okhttp3.internal.http2.Http2Connection r0 = r2.this$0
                r0.pushDataLater$okhttp(r4, r5, r6, r3)
                return
            L14:
                okhttp3.internal.http2.Http2Connection r0 = r2.this$0
                okhttp3.internal.http2.Http2Stream r0 = r0.getStream(r4)
                if (r0 != 0) goto L2d
                okhttp3.internal.http2.Http2Connection r3 = r2.this$0
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR
                r3.writeSynResetLater$okhttp(r4, r0)
                okhttp3.internal.http2.Http2Connection r3 = r2.this$0
                long r0 = (long) r6
                r3.updateConnectionFlowControl$okhttp(r0)
                r5.skip(r0)
                return
            L2d:
                r0.receiveData(r5, r6)
                if (r3 == 0) goto L38
                okhttp3.Headers r3 = okhttp3.internal.Util.EMPTY_HEADERS
                r4 = 1
                r0.receiveHeaders(r3, r4)
            L38:
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http2.Http2Reader getReader$okhttp() {
                r1 = this;
                okhttp3.internal.http2.Http2Reader r0 = r1.reader
                return r0
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int r4, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r5, @org.jetbrains.annotations.NotNull okio.ByteString r6) {
                r3 = this;
                java.lang.String r0 = "errorCode"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r5 = "debugData"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
                r6.size()
                okhttp3.internal.http2.Http2Connection r5 = r3.this$0
                monitor-enter(r5)
                okhttp3.internal.http2.Http2Connection r6 = r3.this$0     // Catch: java.lang.Throwable -> L59
                java.util.Map r6 = r6.getStreams$okhttp()     // Catch: java.lang.Throwable -> L59
                java.util.Collection r6 = r6.values()     // Catch: java.lang.Throwable -> L59
                r0 = 0
                okhttp3.internal.http2.Http2Stream[] r1 = new okhttp3.internal.http2.Http2Stream[r0]     // Catch: java.lang.Throwable -> L59
                java.lang.Object[] r6 = r6.toArray(r1)     // Catch: java.lang.Throwable -> L59
                if (r6 == 0) goto L51
                okhttp3.internal.http2.Http2Stream[] r6 = (okhttp3.internal.http2.Http2Stream[]) r6     // Catch: java.lang.Throwable -> L59
                okhttp3.internal.http2.Http2Connection r1 = r3.this$0     // Catch: java.lang.Throwable -> L59
                r2 = 1
                okhttp3.internal.http2.Http2Connection.access$setShutdown$p(r1, r2)     // Catch: java.lang.Throwable -> L59
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L59
                monitor-exit(r5)
                int r5 = r6.length
            L2f:
                if (r0 >= r5) goto L50
                r1 = r6[r0]
                int r2 = r1.getId()
                if (r2 <= r4) goto L4d
                boolean r2 = r1.isLocallyInitiated()
                if (r2 == 0) goto L4d
                okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM
                r1.receiveRstStream(r2)
                okhttp3.internal.http2.Http2Connection r2 = r3.this$0
                int r1 = r1.getId()
                r2.removeStream$okhttp(r1)
            L4d:
                int r0 = r0 + 1
                goto L2f
            L50:
                return
            L51:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L59
                java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T>"
                r4.<init>(r6)     // Catch: java.lang.Throwable -> L59
                throw r4     // Catch: java.lang.Throwable -> L59
            L59:
                r4 = move-exception
                monitor-exit(r5)
                throw r4
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean r17, int r18, int r19, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r20) {
                r16 = this;
                r12 = r16
                r0 = r17
                r9 = r18
                r10 = r20
                java.lang.String r1 = "headerBlock"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0
                boolean r1 = r1.pushedStream$okhttp(r9)
                if (r1 == 0) goto L1b
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0
                r1.pushHeadersLater$okhttp(r9, r10, r0)
                return
            L1b:
                okhttp3.internal.http2.Http2Connection r13 = r12.this$0
                monitor-enter(r13)
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch: java.lang.Throwable -> Lbb
                okhttp3.internal.http2.Http2Stream r8 = r1.getStream(r9)     // Catch: java.lang.Throwable -> Lbb
                if (r8 != 0) goto Lb0
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch: java.lang.Throwable -> Lbb
                boolean r1 = okhttp3.internal.http2.Http2Connection.access$isShutdown$p(r1)     // Catch: java.lang.Throwable -> Lbb
                if (r1 == 0) goto L30
                monitor-exit(r13)
                return
            L30:
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch: java.lang.Throwable -> Lbb
                int r1 = r1.getLastGoodStreamId$okhttp()     // Catch: java.lang.Throwable -> Lbb
                if (r9 > r1) goto L3a
                monitor-exit(r13)
                return
            L3a:
                int r1 = r9 % 2
                okhttp3.internal.http2.Http2Connection r2 = r12.this$0     // Catch: java.lang.Throwable -> Lbb
                int r2 = r2.getNextStreamId$okhttp()     // Catch: java.lang.Throwable -> Lbb
                int r2 = r2 % 2
                if (r1 != r2) goto L48
                monitor-exit(r13)
                return
            L48:
                okhttp3.Headers r6 = okhttp3.internal.Util.toHeaders(r20)     // Catch: java.lang.Throwable -> Lbb
                okhttp3.internal.http2.Http2Stream r7 = new okhttp3.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> Lbb
                okhttp3.internal.http2.Http2Connection r3 = r12.this$0     // Catch: java.lang.Throwable -> Lbb
                r4 = 0
                r1 = r7
                r2 = r18
                r5 = r17
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lbb
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch: java.lang.Throwable -> Lbb
                r1.setLastGoodStreamId$okhttp(r9)     // Catch: java.lang.Throwable -> Lbb
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch: java.lang.Throwable -> Lbb
                java.util.Map r1 = r1.getStreams$okhttp()     // Catch: java.lang.Throwable -> Lbb
                java.lang.Integer r2 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Throwable -> Lbb
                r1.put(r2, r7)     // Catch: java.lang.Throwable -> Lbb
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch: java.lang.Throwable -> Lbb
                okhttp3.internal.concurrent.TaskRunner r1 = okhttp3.internal.http2.Http2Connection.access$getTaskRunner$p(r1)     // Catch: java.lang.Throwable -> Lbb
                okhttp3.internal.concurrent.TaskQueue r14 = r1.newQueue()     // Catch: java.lang.Throwable -> Lbb
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb
                r1.<init>()     // Catch: java.lang.Throwable -> Lbb
                okhttp3.internal.http2.Http2Connection r2 = r12.this$0     // Catch: java.lang.Throwable -> Lbb
                java.lang.String r2 = r2.getConnectionName$okhttp()     // Catch: java.lang.Throwable -> Lbb
                r1.append(r2)     // Catch: java.lang.Throwable -> Lbb
                r2 = 91
                r1.append(r2)     // Catch: java.lang.Throwable -> Lbb
                r1.append(r9)     // Catch: java.lang.Throwable -> Lbb
                java.lang.String r2 = "] onStream"
                r1.append(r2)     // Catch: java.lang.Throwable -> Lbb
                java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> Lbb
                r5 = 0
                r11 = 1
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$$inlined$synchronized$lambda$1 r15 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$$inlined$synchronized$lambda$1     // Catch: java.lang.Throwable -> Lbb
                r1 = r15
                r2 = r4
                r3 = r11
                r5 = r11
                r6 = r7
                r7 = r16
                r9 = r18
                r10 = r20
                r11 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lbb
                r0 = 0
                r14.schedule(r15, r0)     // Catch: java.lang.Throwable -> Lbb
                monitor-exit(r13)
                return
            Lb0:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lbb
                monitor-exit(r13)
                okhttp3.Headers r1 = okhttp3.internal.Util.toHeaders(r20)
                r8.receiveHeaders(r1, r0)
                return
            Lbb:
                r0 = move-exception
                monitor-exit(r13)
                throw r0
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                r1 = this;
                r1.invoke2()
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2() {
                r5 = this;
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
                r1 = 0
                okhttp3.internal.http2.Http2Reader r2 = r5.reader     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
                r2.readConnectionPreface(r5)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
            L8:
                okhttp3.internal.http2.Http2Reader r2 = r5.reader     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
                r3 = 0
                boolean r2 = r2.nextFrame(r3, r5)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
                if (r2 == 0) goto L12
                goto L8
            L12:
                okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.NO_ERROR     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch: java.io.IOException -> L1c java.lang.Throwable -> L30
                okhttp3.internal.http2.Http2Connection r3 = r5.this$0
                r3.close$okhttp(r2, r0, r1)
                goto L2a
            L1c:
                r1 = move-exception
                goto L23
            L1e:
                r3 = move-exception
                r2 = r0
                goto L31
            L21:
                r1 = move-exception
                r2 = r0
            L23:
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L30
                okhttp3.internal.http2.Http2Connection r2 = r5.this$0
                r2.close$okhttp(r0, r0, r1)
            L2a:
                okhttp3.internal.http2.Http2Reader r0 = r5.reader
                okhttp3.internal.Util.closeQuietly(r0)
                return
            L30:
                r3 = move-exception
            L31:
                okhttp3.internal.http2.Http2Connection r4 = r5.this$0
                r4.close$okhttp(r2, r0, r1)
                okhttp3.internal.http2.Http2Reader r0 = r5.reader
                okhttp3.internal.Util.closeQuietly(r0)
                throw r3
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean r12, int r13, int r14) {
                r11 = this;
                if (r12 == 0) goto L47
                okhttp3.internal.http2.Http2Connection r12 = r11.this$0
                monitor-enter(r12)
                r14 = 1
                r0 = 1
                if (r13 == r14) goto L38
                r14 = 2
                if (r13 == r14) goto L2d
                r14 = 3
                if (r13 == r14) goto L13
            L10:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L44
                goto L42
            L13:
                okhttp3.internal.http2.Http2Connection r13 = r11.this$0     // Catch: java.lang.Throwable -> L44
                long r2 = okhttp3.internal.http2.Http2Connection.access$getAwaitPongsReceived$p(r13)     // Catch: java.lang.Throwable -> L44
                long r2 = r2 + r0
                okhttp3.internal.http2.Http2Connection.access$setAwaitPongsReceived$p(r13, r2)     // Catch: java.lang.Throwable -> L44
                okhttp3.internal.http2.Http2Connection r13 = r11.this$0     // Catch: java.lang.Throwable -> L44
                if (r13 == 0) goto L25
                r13.notifyAll()     // Catch: java.lang.Throwable -> L44
                goto L10
            L25:
                java.lang.NullPointerException r13 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L44
                java.lang.String r14 = "null cannot be cast to non-null type java.lang.Object"
                r13.<init>(r14)     // Catch: java.lang.Throwable -> L44
                throw r13     // Catch: java.lang.Throwable -> L44
            L2d:
                okhttp3.internal.http2.Http2Connection r13 = r11.this$0     // Catch: java.lang.Throwable -> L44
                long r2 = okhttp3.internal.http2.Http2Connection.access$getDegradedPongsReceived$p(r13)     // Catch: java.lang.Throwable -> L44
                long r2 = r2 + r0
                okhttp3.internal.http2.Http2Connection.access$setDegradedPongsReceived$p(r13, r2)     // Catch: java.lang.Throwable -> L44
                goto L42
            L38:
                okhttp3.internal.http2.Http2Connection r13 = r11.this$0     // Catch: java.lang.Throwable -> L44
                long r2 = okhttp3.internal.http2.Http2Connection.access$getIntervalPongsReceived$p(r13)     // Catch: java.lang.Throwable -> L44
                long r2 = r2 + r0
                okhttp3.internal.http2.Http2Connection.access$setIntervalPongsReceived$p(r13, r2)     // Catch: java.lang.Throwable -> L44
            L42:
                monitor-exit(r12)
                goto L75
            L44:
                r13 = move-exception
                monitor-exit(r12)
                throw r13
            L47:
                okhttp3.internal.http2.Http2Connection r12 = r11.this$0
                okhttp3.internal.concurrent.TaskQueue r12 = okhttp3.internal.http2.Http2Connection.access$getWriterQueue$p(r12)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                okhttp3.internal.http2.Http2Connection r1 = r11.this$0
                java.lang.String r1 = r1.getConnectionName$okhttp()
                r0.append(r1)
                java.lang.String r1 = " ping"
                r0.append(r1)
                java.lang.String r5 = r0.toString()
                r0 = 0
                r6 = 1
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$1 r10 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$1
                r2 = r10
                r3 = r5
                r4 = r6
                r7 = r11
                r8 = r13
                r9 = r14
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                r12.schedule(r10, r0)
            L75:
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int r1, int r2, int r3, boolean r4) {
                r0 = this;
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int r1, int r2, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r3) {
                r0 = this;
                java.lang.String r1 = "requestHeaders"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
                okhttp3.internal.http2.Http2Connection r1 = r0.this$0
                r1.pushRequestLater$okhttp(r2, r3)
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int r2, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r3) {
                r1 = this;
                java.lang.String r0 = "errorCode"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                boolean r0 = r0.pushedStream$okhttp(r2)
                if (r0 == 0) goto L13
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                r0.pushResetLater$okhttp(r2, r3)
                return
            L13:
                okhttp3.internal.http2.Http2Connection r0 = r1.this$0
                okhttp3.internal.http2.Http2Stream r2 = r0.removeStream$okhttp(r2)
                if (r2 == 0) goto L1e
                r2.receiveRstStream(r3)
            L1e:
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(boolean r12, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r13) {
                r11 = this;
                java.lang.String r0 = "settings"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                okhttp3.internal.http2.Http2Connection r0 = r11.this$0
                okhttp3.internal.concurrent.TaskQueue r0 = okhttp3.internal.http2.Http2Connection.access$getWriterQueue$p(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                okhttp3.internal.http2.Http2Connection r2 = r11.this$0
                java.lang.String r2 = r2.getConnectionName$okhttp()
                r1.append(r2)
                java.lang.String r2 = " applyAndAckSettings"
                r1.append(r2)
                java.lang.String r6 = r1.toString()
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$1 r1 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$1
                r7 = 1
                r3 = r1
                r4 = r6
                r5 = r7
                r8 = r11
                r9 = r12
                r10 = r13
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                r12 = 0
                r0.schedule(r1, r12)
                return
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int r4, long r5) {
                r3 = this;
                if (r4 != 0) goto L25
                okhttp3.internal.http2.Http2Connection r4 = r3.this$0
                monitor-enter(r4)
                okhttp3.internal.http2.Http2Connection r0 = r3.this$0     // Catch: java.lang.Throwable -> L22
                long r1 = r0.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L22
                long r1 = r1 + r5
                okhttp3.internal.http2.Http2Connection.access$setWriteBytesMaximum$p(r0, r1)     // Catch: java.lang.Throwable -> L22
                okhttp3.internal.http2.Http2Connection r5 = r3.this$0     // Catch: java.lang.Throwable -> L22
                if (r5 == 0) goto L1a
                r5.notifyAll()     // Catch: java.lang.Throwable -> L22
                kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L22
                monitor-exit(r4)
                goto L38
            L1a:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L22
                java.lang.String r6 = "null cannot be cast to non-null type java.lang.Object"
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L22
                throw r5     // Catch: java.lang.Throwable -> L22
            L22:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            L25:
                okhttp3.internal.http2.Http2Connection r0 = r3.this$0
                okhttp3.internal.http2.Http2Stream r4 = r0.getStream(r4)
                if (r4 == 0) goto L38
                monitor-enter(r4)
                r4.addBytesToWriteWindow(r5)     // Catch: java.lang.Throwable -> L35
                kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L35
                monitor-exit(r4)
                goto L38
            L35:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            L38:
                return
        }
    }

    static {
            okhttp3.internal.http2.Http2Connection$Companion r0 = new okhttp3.internal.http2.Http2Connection$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Http2Connection.Companion = r0
            okhttp3.internal.http2.Settings r0 = new okhttp3.internal.http2.Settings
            r0.<init>()
            r1 = 7
            r2 = 65535(0xffff, float:9.1834E-41)
            r0.set(r1, r2)
            r1 = 5
            r2 = 16384(0x4000, float:2.2959E-41)
            r0.set(r1, r2)
            okhttp3.internal.http2.Http2Connection.DEFAULT_SETTINGS = r0
            return
    }

    public Http2Connection(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Connection.Builder r13) {
            r12 = this;
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r12.<init>()
            boolean r0 = r13.getClient$okhttp()
            r12.client = r0
            okhttp3.internal.http2.Http2Connection$Listener r1 = r13.getListener$okhttp()
            r12.listener = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r12.streams = r1
            java.lang.String r1 = r13.getConnectionName$okhttp()
            r12.connectionName = r1
            boolean r2 = r13.getClient$okhttp()
            if (r2 == 0) goto L29
            r2 = 3
            goto L2a
        L29:
            r2 = 2
        L2a:
            r12.nextStreamId = r2
            okhttp3.internal.concurrent.TaskRunner r2 = r13.getTaskRunner$okhttp()
            r12.taskRunner = r2
            okhttp3.internal.concurrent.TaskQueue r3 = r2.newQueue()
            r12.writerQueue = r3
            okhttp3.internal.concurrent.TaskQueue r4 = r2.newQueue()
            r12.pushQueue = r4
            okhttp3.internal.concurrent.TaskQueue r2 = r2.newQueue()
            r12.settingsListenerQueue = r2
            okhttp3.internal.http2.PushObserver r2 = r13.getPushObserver$okhttp()
            r12.pushObserver = r2
            okhttp3.internal.http2.Settings r2 = new okhttp3.internal.http2.Settings
            r2.<init>()
            boolean r4 = r13.getClient$okhttp()
            if (r4 == 0) goto L5b
            r4 = 7
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            r2.set(r4, r5)
        L5b:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            r12.okHttpSettings = r2
            okhttp3.internal.http2.Settings r2 = okhttp3.internal.http2.Http2Connection.DEFAULT_SETTINGS
            r12.peerSettings = r2
            int r2 = r2.getInitialWindowSize()
            long r4 = (long) r2
            r12.writeBytesMaximum = r4
            java.net.Socket r2 = r13.getSocket$okhttp()
            r12.socket = r2
            okhttp3.internal.http2.Http2Writer r2 = new okhttp3.internal.http2.Http2Writer
            okio.BufferedSink r4 = r13.getSink$okhttp()
            r2.<init>(r4, r0)
            r12.writer = r2
            okhttp3.internal.http2.Http2Connection$ReaderRunnable r2 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable
            okhttp3.internal.http2.Http2Reader r4 = new okhttp3.internal.http2.Http2Reader
            okio.BufferedSource r5 = r13.getSource$okhttp()
            r4.<init>(r5, r0)
            r2.<init>(r12, r4)
            r12.readerRunnable = r2
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r12.currentPushRequests = r0
            int r0 = r13.getPingIntervalMillis$okhttp()
            if (r0 == 0) goto Lb5
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            int r13 = r13.getPingIntervalMillis$okhttp()
            long r4 = (long) r13
            long r4 = r0.toNanos(r4)
            java.lang.String r13 = " ping"
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r13)
            okhttp3.internal.http2.Http2Connection$$special$$inlined$schedule$1 r13 = new okhttp3.internal.http2.Http2Connection$$special$$inlined$schedule$1
            r6 = r13
            r7 = r8
            r9 = r12
            r10 = r4
            r6.<init>(r7, r8, r9, r10)
            r3.schedule(r13, r4)
        Lb5:
            return
    }

    public static final /* synthetic */ void access$failConnection(okhttp3.internal.http2.Http2Connection r0, java.io.IOException r1) {
            r0.failConnection(r1)
            return
    }

    public static final /* synthetic */ long access$getAwaitPongsReceived$p(okhttp3.internal.http2.Http2Connection r2) {
            long r0 = r2.awaitPongsReceived
            return r0
    }

    public static final /* synthetic */ java.util.Set access$getCurrentPushRequests$p(okhttp3.internal.http2.Http2Connection r0) {
            java.util.Set<java.lang.Integer> r0 = r0.currentPushRequests
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.http2.Settings access$getDEFAULT_SETTINGS$cp() {
            okhttp3.internal.http2.Settings r0 = okhttp3.internal.http2.Http2Connection.DEFAULT_SETTINGS
            return r0
    }

    public static final /* synthetic */ long access$getDegradedPongsReceived$p(okhttp3.internal.http2.Http2Connection r2) {
            long r0 = r2.degradedPongsReceived
            return r0
    }

    public static final /* synthetic */ long access$getIntervalPingsSent$p(okhttp3.internal.http2.Http2Connection r2) {
            long r0 = r2.intervalPingsSent
            return r0
    }

    public static final /* synthetic */ long access$getIntervalPongsReceived$p(okhttp3.internal.http2.Http2Connection r2) {
            long r0 = r2.intervalPongsReceived
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.http2.PushObserver access$getPushObserver$p(okhttp3.internal.http2.Http2Connection r0) {
            okhttp3.internal.http2.PushObserver r0 = r0.pushObserver
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.concurrent.TaskQueue access$getSettingsListenerQueue$p(okhttp3.internal.http2.Http2Connection r0) {
            okhttp3.internal.concurrent.TaskQueue r0 = r0.settingsListenerQueue
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.concurrent.TaskRunner access$getTaskRunner$p(okhttp3.internal.http2.Http2Connection r0) {
            okhttp3.internal.concurrent.TaskRunner r0 = r0.taskRunner
            return r0
    }

    public static final /* synthetic */ long access$getWriteBytesMaximum$p(okhttp3.internal.http2.Http2Connection r2) {
            long r0 = r2.writeBytesMaximum
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.concurrent.TaskQueue access$getWriterQueue$p(okhttp3.internal.http2.Http2Connection r0) {
            okhttp3.internal.concurrent.TaskQueue r0 = r0.writerQueue
            return r0
    }

    public static final /* synthetic */ boolean access$isShutdown$p(okhttp3.internal.http2.Http2Connection r0) {
            boolean r0 = r0.isShutdown
            return r0
    }

    public static final /* synthetic */ void access$setAwaitPongsReceived$p(okhttp3.internal.http2.Http2Connection r0, long r1) {
            r0.awaitPongsReceived = r1
            return
    }

    public static final /* synthetic */ void access$setDegradedPongsReceived$p(okhttp3.internal.http2.Http2Connection r0, long r1) {
            r0.degradedPongsReceived = r1
            return
    }

    public static final /* synthetic */ void access$setIntervalPingsSent$p(okhttp3.internal.http2.Http2Connection r0, long r1) {
            r0.intervalPingsSent = r1
            return
    }

    public static final /* synthetic */ void access$setIntervalPongsReceived$p(okhttp3.internal.http2.Http2Connection r0, long r1) {
            r0.intervalPongsReceived = r1
            return
    }

    public static final /* synthetic */ void access$setShutdown$p(okhttp3.internal.http2.Http2Connection r0, boolean r1) {
            r0.isShutdown = r1
            return
    }

    public static final /* synthetic */ void access$setWriteBytesMaximum$p(okhttp3.internal.http2.Http2Connection r0, long r1) {
            r0.writeBytesMaximum = r1
            return
    }

    private final void failConnection(java.io.IOException r2) {
            r1 = this;
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR
            r1.close$okhttp(r0, r0, r2)
            return
    }

    private final okhttp3.internal.http2.Http2Stream newStream(int r11, java.util.List<okhttp3.internal.http2.Header> r12, boolean r13) throws java.io.IOException {
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            okhttp3.internal.http2.Http2Writer r7 = r10.writer
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L84
            int r0 = r10.nextStreamId     // Catch: java.lang.Throwable -> L81
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L13
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L81
            r10.shutdown(r0)     // Catch: java.lang.Throwable -> L81
        L13:
            boolean r0 = r10.isShutdown     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L7b
            int r8 = r10.nextStreamId     // Catch: java.lang.Throwable -> L81
            int r0 = r8 + 2
            r10.nextStreamId = r0     // Catch: java.lang.Throwable -> L81
            okhttp3.internal.http2.Http2Stream r9 = new okhttp3.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> L81
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L81
            r0 = 1
            if (r13 == 0) goto L41
            long r1 = r10.writeBytesTotal     // Catch: java.lang.Throwable -> L81
            long r3 = r10.writeBytesMaximum     // Catch: java.lang.Throwable -> L81
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L41
            long r1 = r9.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L81
            long r3 = r9.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L81
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L3f
            goto L41
        L3f:
            r13 = 0
            goto L42
        L41:
            r13 = 1
        L42:
            boolean r1 = r9.isOpen()     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L51
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r1 = r10.streams     // Catch: java.lang.Throwable -> L81
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L81
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L81
        L51:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L81
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 != 0) goto L5c
            okhttp3.internal.http2.Http2Writer r11 = r10.writer     // Catch: java.lang.Throwable -> L84
            r11.headers(r6, r8, r12)     // Catch: java.lang.Throwable -> L84
            goto L66
        L5c:
            boolean r1 = r10.client     // Catch: java.lang.Throwable -> L84
            r0 = r0 ^ r1
            if (r0 == 0) goto L6f
            okhttp3.internal.http2.Http2Writer r0 = r10.writer     // Catch: java.lang.Throwable -> L84
            r0.pushPromise(r11, r8, r12)     // Catch: java.lang.Throwable -> L84
        L66:
            monitor-exit(r7)
            if (r13 == 0) goto L6e
            okhttp3.internal.http2.Http2Writer r11 = r10.writer
            r11.flush()
        L6e:
            return r9
        L6f:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L84
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L84
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L84
            throw r12     // Catch: java.lang.Throwable -> L84
        L7b:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L81
            r11.<init>()     // Catch: java.lang.Throwable -> L81
            throw r11     // Catch: java.lang.Throwable -> L81
        L81:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L84
            throw r11     // Catch: java.lang.Throwable -> L84
        L84:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
    }

    public static /* synthetic */ void start$default(okhttp3.internal.http2.Http2Connection r0, boolean r1, okhttp3.internal.concurrent.TaskRunner r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 1
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            okhttp3.internal.concurrent.TaskRunner r2 = okhttp3.internal.concurrent.TaskRunner.INSTANCE
        Lb:
            r0.start(r1, r2)
            return
    }

    public final synchronized void awaitPong() throws java.lang.InterruptedException {
            r5 = this;
            monitor-enter(r5)
        L1:
            long r0 = r5.awaitPongsReceived     // Catch: java.lang.Throwable -> Lf
            long r2 = r5.awaitPingsSent     // Catch: java.lang.Throwable -> Lf
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Ld
            r5.wait()     // Catch: java.lang.Throwable -> Lf
            goto L1
        Ld:
            monitor-exit(r5)
            return
        Lf:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.NO_ERROR
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL
            r2 = 0
            r3.close$okhttp(r0, r1, r2)
            return
    }

    public final void close$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r4, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r5, @org.jetbrains.annotations.Nullable java.io.IOException r6) {
            r3 = this;
            java.lang.String r0 = "connectionCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "streamCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L3e
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L16
            goto L3e
        L16:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = "Thread "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r0 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = " MUST NOT hold lock on "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L3e:
            r3.shutdown(r4)     // Catch: java.io.IOException -> L41
        L41:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r3.streams     // Catch: java.lang.Throwable -> L96
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L96
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L6c
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r4 = r3.streams     // Catch: java.lang.Throwable -> L96
            java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L96
            okhttp3.internal.http2.Http2Stream[] r0 = new okhttp3.internal.http2.Http2Stream[r1]     // Catch: java.lang.Throwable -> L96
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch: java.lang.Throwable -> L96
            if (r4 == 0) goto L64
            okhttp3.internal.http2.Http2Stream[] r4 = (okhttp3.internal.http2.Http2Stream[]) r4     // Catch: java.lang.Throwable -> L96
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r3.streams     // Catch: java.lang.Throwable -> L96
            r0.clear()     // Catch: java.lang.Throwable -> L96
            goto L6c
        L64:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L96
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L96
            throw r4     // Catch: java.lang.Throwable -> L96
        L6c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L96
            monitor-exit(r3)
            if (r4 == 0) goto L7c
            int r0 = r4.length
        L72:
            if (r1 >= r0) goto L7c
            r2 = r4[r1]
            r2.close(r5, r6)     // Catch: java.io.IOException -> L79
        L79:
            int r1 = r1 + 1
            goto L72
        L7c:
            okhttp3.internal.http2.Http2Writer r4 = r3.writer     // Catch: java.io.IOException -> L81
            r4.close()     // Catch: java.io.IOException -> L81
        L81:
            java.net.Socket r4 = r3.socket     // Catch: java.io.IOException -> L86
            r4.close()     // Catch: java.io.IOException -> L86
        L86:
            okhttp3.internal.concurrent.TaskQueue r4 = r3.writerQueue
            r4.shutdown()
            okhttp3.internal.concurrent.TaskQueue r4 = r3.pushQueue
            r4.shutdown()
            okhttp3.internal.concurrent.TaskQueue r4 = r3.settingsListenerQueue
            r4.shutdown()
            return
        L96:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final void flush() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            r0.flush()
            return
    }

    public final boolean getClient$okhttp() {
            r1 = this;
            boolean r0 = r1.client
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getConnectionName$okhttp() {
            r1 = this;
            java.lang.String r0 = r1.connectionName
            return r0
    }

    public final int getLastGoodStreamId$okhttp() {
            r1 = this;
            int r0 = r1.lastGoodStreamId
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Http2Connection.Listener getListener$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection$Listener r0 = r1.listener
            return r0
    }

    public final int getNextStreamId$okhttp() {
            r1 = this;
            int r0 = r1.nextStreamId
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Settings getOkHttpSettings() {
            r1 = this;
            okhttp3.internal.http2.Settings r0 = r1.okHttpSettings
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Settings getPeerSettings() {
            r1 = this;
            okhttp3.internal.http2.Settings r0 = r1.peerSettings
            return r0
    }

    public final long getReadBytesAcknowledged() {
            r2 = this;
            long r0 = r2.readBytesAcknowledged
            return r0
    }

    public final long getReadBytesTotal() {
            r2 = this;
            long r0 = r2.readBytesTotal
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Http2Connection.ReaderRunnable getReaderRunnable() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection$ReaderRunnable r0 = r1.readerRunnable
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.net.Socket getSocket$okhttp() {
            r1 = this;
            java.net.Socket r0 = r1.socket
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final synchronized okhttp3.internal.http2.Http2Stream getStream(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r1.streams     // Catch: java.lang.Throwable -> Lf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lf
            okhttp3.internal.http2.Http2Stream r2 = (okhttp3.internal.http2.Http2Stream) r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> getStreams$okhttp() {
            r1 = this;
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r1.streams
            return r0
    }

    public final long getWriteBytesMaximum() {
            r2 = this;
            long r0 = r2.writeBytesMaximum
            return r0
    }

    public final long getWriteBytesTotal() {
            r2 = this;
            long r0 = r2.writeBytesTotal
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Http2Writer getWriter() {
            r1 = this;
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            return r0
    }

    public final synchronized boolean isHealthy(long r7) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.isShutdown     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r6)
            return r1
        L8:
            long r2 = r6.degradedPongsReceived     // Catch: java.lang.Throwable -> L1b
            long r4 = r6.degradedPingsSent     // Catch: java.lang.Throwable -> L1b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L18
            long r2 = r6.degradedPongDeadlineNs     // Catch: java.lang.Throwable -> L1b
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L18
            monitor-exit(r6)
            return r1
        L18:
            r7 = 1
            monitor-exit(r6)
            return r7
        L1b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Http2Stream newStream(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r2, boolean r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            okhttp3.internal.http2.Http2Stream r2 = r1.newStream(r0, r2, r3)
            return r2
    }

    public final synchronized int openStreamCount() {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r1.streams     // Catch: java.lang.Throwable -> L9
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void pushDataLater$okhttp(int r12, @org.jetbrains.annotations.NotNull okio.BufferedSource r13, int r14, boolean r15) throws java.io.IOException {
            r11 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            okio.Buffer r8 = new okio.Buffer
            r8.<init>()
            long r0 = (long) r14
            r13.require(r0)
            r13.read(r8, r0)
            okhttp3.internal.concurrent.TaskQueue r13 = r11.pushQueue
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r11.connectionName
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = "] onData"
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$1 r0 = new okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$1
            r5 = 1
            r1 = r0
            r2 = r4
            r3 = r5
            r6 = r11
            r7 = r12
            r9 = r14
            r10 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14 = 0
            r13.schedule(r0, r14)
            return
    }

    public final void pushHeadersLater$okhttp(int r13, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r14, boolean r15) {
            r12 = this;
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            okhttp3.internal.concurrent.TaskQueue r0 = r12.pushQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r12.connectionName
            r1.append(r2)
            r2 = 91
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = "] onHeaders"
            r1.append(r2)
            java.lang.String r6 = r1.toString()
            okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$1 r1 = new okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$1
            r7 = 1
            r3 = r1
            r4 = r6
            r5 = r7
            r8 = r12
            r9 = r13
            r10 = r14
            r11 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r13 = 0
            r0.schedule(r1, r13)
            return
    }

    public final void pushRequestLater$okhttp(int r13, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r14) {
            r12 = this;
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            monitor-enter(r12)
            java.util.Set<java.lang.Integer> r0 = r12.currentPushRequests     // Catch: java.lang.Throwable -> L52
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L52
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L19
            okhttp3.internal.http2.ErrorCode r14 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L52
            r12.writeSynResetLater$okhttp(r13, r14)     // Catch: java.lang.Throwable -> L52
            monitor-exit(r12)
            return
        L19:
            java.util.Set<java.lang.Integer> r0 = r12.currentPushRequests     // Catch: java.lang.Throwable -> L52
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L52
            r0.add(r1)     // Catch: java.lang.Throwable -> L52
            monitor-exit(r12)
            okhttp3.internal.concurrent.TaskQueue r0 = r12.pushQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r12.connectionName
            r1.append(r2)
            r2 = 91
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = "] onRequest"
            r1.append(r2)
            java.lang.String r6 = r1.toString()
            r1 = 0
            r7 = 1
            okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$1 r11 = new okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$1
            r3 = r11
            r4 = r6
            r5 = r7
            r8 = r12
            r9 = r13
            r10 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.schedule(r11, r1)
            return
        L52:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
    }

    public final void pushResetLater$okhttp(int r12, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r13) {
            r11 = this;
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            okhttp3.internal.concurrent.TaskQueue r0 = r11.pushQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r11.connectionName
            r1.append(r2)
            r2 = 91
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = "] onReset"
            r1.append(r2)
            java.lang.String r6 = r1.toString()
            okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$1 r1 = new okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$1
            r7 = 1
            r3 = r1
            r4 = r6
            r5 = r7
            r8 = r11
            r9 = r12
            r10 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r12 = 0
            r0.schedule(r1, r12)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Http2Stream pushStream(int r2, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r1.client
            r0 = r0 ^ 1
            if (r0 == 0) goto L10
            okhttp3.internal.http2.Http2Stream r2 = r1.newStream(r2, r3, r4)
            return r2
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Client cannot push requests."
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public final boolean pushedStream$okhttp(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == 0) goto L7
            r2 = r2 & r0
            if (r2 != 0) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final synchronized okhttp3.internal.http2.Http2Stream removeStream$okhttp(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r1.streams     // Catch: java.lang.Throwable -> L12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L12
            okhttp3.internal.http2.Http2Stream r2 = (okhttp3.internal.http2.Http2Stream) r2     // Catch: java.lang.Throwable -> L12
            r1.notifyAll()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final void sendDegradedPingLater$okhttp() {
            r10 = this;
            monitor-enter(r10)
            long r0 = r10.degradedPongsReceived     // Catch: java.lang.Throwable -> L3d
            long r2 = r10.degradedPingsSent     // Catch: java.lang.Throwable -> L3d
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lb
            monitor-exit(r10)
            return
        Lb:
            r0 = 1
            long r2 = r2 + r0
            r10.degradedPingsSent = r2     // Catch: java.lang.Throwable -> L3d
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L3d
            r2 = 1000000000(0x3b9aca00, float:0.0047237873)
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L3d
            long r0 = r0 + r2
            r10.degradedPongDeadlineNs = r0     // Catch: java.lang.Throwable -> L3d
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r10)
            okhttp3.internal.concurrent.TaskQueue r0 = r10.writerQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.connectionName
            java.lang.String r3 = " ping"
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3)
            r1 = 0
            r8 = 1
            okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$1 r3 = new okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$1
            r4 = r3
            r5 = r7
            r6 = r8
            r9 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.schedule(r3, r1)
            return
        L3d:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
    }

    public final void setLastGoodStreamId$okhttp(int r1) {
            r0 = this;
            r0.lastGoodStreamId = r1
            return
    }

    public final void setNextStreamId$okhttp(int r1) {
            r0 = this;
            r0.nextStreamId = r1
            return
    }

    public final void setPeerSettings(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.peerSettings = r2
            return
    }

    public final void setSettings(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "settings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.internal.http2.Http2Writer r0 = r2.writer
            monitor-enter(r0)
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L26
            boolean r1 = r2.isShutdown     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L1d
            okhttp3.internal.http2.Settings r1 = r2.okHttpSettings     // Catch: java.lang.Throwable -> L23
            r1.merge(r3)     // Catch: java.lang.Throwable -> L23
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            okhttp3.internal.http2.Http2Writer r1 = r2.writer     // Catch: java.lang.Throwable -> L26
            r1.settings(r3)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            return
        L1d:
            okhttp3.internal.http2.ConnectionShutdownException r3 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L23
            r3.<init>()     // Catch: java.lang.Throwable -> L23
            throw r3     // Catch: java.lang.Throwable -> L23
        L23:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            throw r3     // Catch: java.lang.Throwable -> L26
        L26:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final void shutdown(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "statusCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            okhttp3.internal.http2.Http2Writer r0 = r4.writer
            monitor-enter(r0)
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L25
            boolean r1 = r4.isShutdown     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L11
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)
            return
        L11:
            r1 = 1
            r4.isShutdown = r1     // Catch: java.lang.Throwable -> L22
            int r1 = r4.lastGoodStreamId     // Catch: java.lang.Throwable -> L22
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L22
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            okhttp3.internal.http2.Http2Writer r2 = r4.writer     // Catch: java.lang.Throwable -> L25
            byte[] r3 = okhttp3.internal.Util.EMPTY_BYTE_ARRAY     // Catch: java.lang.Throwable -> L25
            r2.goAway(r1, r5, r3)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)
            return
        L22:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            throw r5     // Catch: java.lang.Throwable -> L25
        L25:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    @kotlin.jvm.JvmOverloads
    public final void start() throws java.io.IOException {
            r3 = this;
            r0 = 0
            r1 = 0
            r2 = 3
            start$default(r3, r0, r1, r2, r1)
            return
    }

    @kotlin.jvm.JvmOverloads
    public final void start(boolean r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            r1 = 2
            start$default(r2, r3, r0, r1, r0)
            return
    }

    @kotlin.jvm.JvmOverloads
    public final void start(boolean r9, @org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r10) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            if (r9 == 0) goto L27
            okhttp3.internal.http2.Http2Writer r9 = r8.writer
            r9.connectionPreface()
            okhttp3.internal.http2.Http2Writer r9 = r8.writer
            okhttp3.internal.http2.Settings r0 = r8.okHttpSettings
            r9.settings(r0)
            okhttp3.internal.http2.Settings r9 = r8.okHttpSettings
            int r9 = r9.getInitialWindowSize()
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r9 == r0) goto L27
            okhttp3.internal.http2.Http2Writer r1 = r8.writer
            r2 = 0
            int r9 = r9 - r0
            long r3 = (long) r9
            r1.windowUpdate(r2, r3)
        L27:
            okhttp3.internal.concurrent.TaskQueue r9 = r10.newQueue()
            java.lang.String r4 = r8.connectionName
            okhttp3.internal.http2.Http2Connection$ReaderRunnable r1 = r8.readerRunnable
            r6 = 0
            r5 = 1
            okhttp3.internal.concurrent.TaskQueue$execute$1 r10 = new okhttp3.internal.concurrent.TaskQueue$execute$1
            r0 = r10
            r2 = r4
            r3 = r5
            r0.<init>(r1, r2, r3, r4, r5)
            r9.schedule(r10, r6)
            return
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long r4) {
            r3 = this;
            monitor-enter(r3)
            long r0 = r3.readBytesTotal     // Catch: java.lang.Throwable -> L21
            long r0 = r0 + r4
            r3.readBytesTotal = r0     // Catch: java.lang.Throwable -> L21
            long r4 = r3.readBytesAcknowledged     // Catch: java.lang.Throwable -> L21
            long r0 = r0 - r4
            okhttp3.internal.http2.Settings r4 = r3.okHttpSettings     // Catch: java.lang.Throwable -> L21
            int r4 = r4.getInitialWindowSize()     // Catch: java.lang.Throwable -> L21
            int r4 = r4 / 2
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L21
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L1f
            r4 = 0
            r3.writeWindowUpdateLater$okhttp(r4, r0)     // Catch: java.lang.Throwable -> L21
            long r4 = r3.readBytesAcknowledged     // Catch: java.lang.Throwable -> L21
            long r4 = r4 + r0
            r3.readBytesAcknowledged = r4     // Catch: java.lang.Throwable -> L21
        L1f:
            monitor-exit(r3)
            return
        L21:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final void writeData(int r9, boolean r10, @org.jetbrains.annotations.Nullable okio.Buffer r11, long r12) throws java.io.IOException {
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r12 = r8.writer
            r12.data(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L6d
            monitor-enter(r8)
        L12:
            long r3 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L5c java.lang.InterruptedException -> L5e
            long r5 = r8.writeBytesMaximum     // Catch: java.lang.Throwable -> L5c java.lang.InterruptedException -> L5e
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L33
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r3 = r8.streams     // Catch: java.lang.Throwable -> L5c java.lang.InterruptedException -> L5e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L5c java.lang.InterruptedException -> L5e
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L5c java.lang.InterruptedException -> L5e
            if (r3 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L5c java.lang.InterruptedException -> L5e
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L5c java.lang.InterruptedException -> L5e
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L5c java.lang.InterruptedException -> L5e
            throw r9     // Catch: java.lang.Throwable -> L5c java.lang.InterruptedException -> L5e
        L33:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch: java.lang.Throwable -> L5c
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L5c
            okhttp3.internal.http2.Http2Writer r3 = r8.writer     // Catch: java.lang.Throwable -> L5c
            int r3 = r3.maxDataLength()     // Catch: java.lang.Throwable -> L5c
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L5c
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L5c
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L5c
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L5c
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.writer
            if (r10 == 0) goto L57
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L57
            r5 = 1
            goto L58
        L57:
            r5 = 0
        L58:
            r4.data(r5, r9, r11, r3)
            goto Ld
        L5c:
            r9 = move-exception
            goto L6b
        L5e:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L5c
            r9.interrupt()     // Catch: java.lang.Throwable -> L5c
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L5c
            r9.<init>()     // Catch: java.lang.Throwable -> L5c
            throw r9     // Catch: java.lang.Throwable -> L5c
        L6b:
            monitor-exit(r8)
            throw r9
        L6d:
            return
    }

    public final void writeHeaders$okhttp(int r2, boolean r3, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r4) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "alternating"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            r0.headers(r3, r2, r4)
            return
    }

    public final void writePing() throws java.lang.InterruptedException {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.awaitPingsSent     // Catch: java.lang.Throwable -> L12
            r2 = 1
            long r0 = r0 + r2
            r4.awaitPingsSent = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)
            r0 = 0
            r1 = 3
            r2 = 1330343787(0x4f4b6f6b, float:3.4130767E9)
            r4.writePing(r0, r1, r2)
            return
        L12:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    public final void writePing(boolean r2, int r3, int r4) {
            r1 = this;
            okhttp3.internal.http2.Http2Writer r0 = r1.writer     // Catch: java.io.IOException -> L6
            r0.ping(r2, r3, r4)     // Catch: java.io.IOException -> L6
            goto La
        L6:
            r2 = move-exception
            r1.failConnection(r2)
        La:
            return
    }

    public final void writePingAndAwaitPong() throws java.lang.InterruptedException {
            r0 = this;
            r0.writePing()
            r0.awaitPong()
            return
    }

    public final void writeSynReset$okhttp(int r2, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "statusCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.internal.http2.Http2Writer r0 = r1.writer
            r0.rstStream(r2, r3)
            return
    }

    public final void writeSynResetLater$okhttp(int r12, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r13) {
            r11 = this;
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            okhttp3.internal.concurrent.TaskQueue r0 = r11.writerQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r11.connectionName
            r1.append(r2)
            r2 = 91
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = "] writeSynReset"
            r1.append(r2)
            java.lang.String r6 = r1.toString()
            okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$1 r1 = new okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$1
            r7 = 1
            r3 = r1
            r4 = r6
            r5 = r7
            r8 = r11
            r9 = r12
            r10 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r12 = 0
            r0.schedule(r1, r12)
            return
    }

    public final void writeWindowUpdateLater$okhttp(int r13, long r14) {
            r12 = this;
            okhttp3.internal.concurrent.TaskQueue r0 = r12.writerQueue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r12.connectionName
            r1.append(r2)
            r2 = 91
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = "] windowUpdate"
            r1.append(r2)
            java.lang.String r6 = r1.toString()
            okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$1 r1 = new okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$1
            r7 = 1
            r3 = r1
            r4 = r6
            r5 = r7
            r8 = r12
            r9 = r13
            r10 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r13 = 0
            r0.schedule(r1, r13)
            return
    }
}
