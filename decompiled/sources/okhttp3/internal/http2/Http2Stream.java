package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2Stream.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 _2\u00020\u0001:\u0004_`abB1\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020#J\r\u0010C\u001a\u00020AH\u0000¢\u0006\u0002\bDJ\r\u0010E\u001a\u00020AH\u0000¢\u0006\u0002\bFJ\u0018\u0010G\u001a\u00020A2\u0006\u0010H\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u001a\u0010I\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u000e\u0010J\u001a\u00020A2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010K\u001a\u00020A2\u0006\u0010L\u001a\u00020\nJ\u0006\u0010M\u001a\u00020NJ\u0006\u0010O\u001a\u00020PJ\u0006\u0010,\u001a\u00020QJ\u0016\u0010R\u001a\u00020A2\u0006\u00104\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0003J\u0016\u0010U\u001a\u00020A2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010V\u001a\u00020A2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010W\u001a\u00020\nJ\u0006\u0010L\u001a\u00020\nJ\r\u0010X\u001a\u00020AH\u0000¢\u0006\u0002\bYJ$\u0010Z\u001a\u00020A2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u0007J\u0006\u0010>\u001a\u00020QR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010 R$\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u0018\u0010,\u001a\u00060-R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u00100\u001a\u000601R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u00104\u001a\u000605R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R$\u00108\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R$\u0010;\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010&\"\u0004\b=\u0010(R\u0018\u0010>\u001a\u00060-R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010/¨\u0006c"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "id", "", "connection", "Lokhttp3/internal/http2/Http2Connection;", "outFinished", "", "inFinished", "headers", "Lokhttp3/Headers;", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "(Lokhttp3/internal/http2/ErrorCode;)V", "errorException", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "hasResponseHeaders", "headersQueue", "Ljava/util/ArrayDeque;", "getId", "()I", "isLocallyInitiated", "()Z", "isOpen", "<set-?>", "", "readBytesAcknowledged", "getReadBytesAcknowledged", "()J", "setReadBytesAcknowledged$okhttp", "(J)V", "readBytesTotal", "getReadBytesTotal", "setReadBytesTotal$okhttp", "readTimeout", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "source", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "writeBytesTotal", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "writeTimeout", "getWriteTimeout$okhttp", "addBytesToWriteWindow", "", "delta", "cancelStreamIfNecessary", "cancelStreamIfNecessary$okhttp", "checkOutNotClosed", "checkOutNotClosed$okhttp", "close", "rstStatusCode", "closeInternal", "closeLater", "enqueueTrailers", "trailers", "getSink", "Lokio/Sink;", "getSource", "Lokio/Source;", "Lokio/Timeout;", "receiveData", "Lokio/BufferedSource;", "length", "receiveHeaders", "receiveRstStream", "takeHeaders", "waitForIo", "waitForIo$okhttp", "writeHeaders", "responseHeaders", "", "Lokhttp3/internal/http2/Header;", "flushHeaders", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Http2Stream {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Http2Stream.Companion Companion = null;
    public static final long EMIT_BUFFER_SIZE = 16384;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Connection connection;

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.http2.ErrorCode errorCode;

    @org.jetbrains.annotations.Nullable
    private java.io.IOException errorException;
    private boolean hasResponseHeaders;
    private final java.util.ArrayDeque<okhttp3.Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Stream.StreamTimeout readTimeout;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Stream.FramingSink sink;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Stream.FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Stream.StreamTimeout writeTimeout;

    /* JADX INFO: compiled from: Http2Stream.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$Companion;", "", "()V", "EMIT_BUFFER_SIZE", "", "okhttp"}, k = 1, mv = {1, 4, 1})
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

    /* JADX INFO: compiled from: Http2Stream.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokio/Sink;", "finished", "", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "closed", "getClosed", "()Z", "setClosed", "(Z)V", "getFinished", "setFinished", "sendBuffer", "Lokio/Buffer;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "close", "", "emitFrame", "outFinishedOnLastFrame", "flush", "timeout", "Lokio/Timeout;", "write", "source", "byteCount", "", "okhttp"}, k = 1, mv = {1, 4, 1})
    public final class FramingSink implements okio.Sink {
        private boolean closed;
        private boolean finished;
        private final okio.Buffer sendBuffer;
        public final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;

        @org.jetbrains.annotations.Nullable
        private okhttp3.Headers trailers;

        public FramingSink(okhttp3.internal.http2.Http2Stream r1, boolean r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.finished = r2
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r0.sendBuffer = r1
                return
        }

        public /* synthetic */ FramingSink(okhttp3.internal.http2.Http2Stream r1, boolean r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
                r0 = this;
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                r0.<init>(r1, r2)
                return
        }

        private final void emitFrame(boolean r12) throws java.io.IOException {
                r11 = this;
                okhttp3.internal.http2.Http2Stream r0 = r11.this$0
                monitor-enter(r0)
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> Laf
                okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r1.getWriteTimeout$okhttp()     // Catch: java.lang.Throwable -> Laf
                r1.enter()     // Catch: java.lang.Throwable -> Laf
            Lc:
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> La4
                long r1 = r1.getWriteBytesTotal()     // Catch: java.lang.Throwable -> La4
                okhttp3.internal.http2.Http2Stream r3 = r11.this$0     // Catch: java.lang.Throwable -> La4
                long r3 = r3.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> La4
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 < 0) goto L32
                boolean r1 = r11.finished     // Catch: java.lang.Throwable -> La4
                if (r1 != 0) goto L32
                boolean r1 = r11.closed     // Catch: java.lang.Throwable -> La4
                if (r1 != 0) goto L32
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> La4
                okhttp3.internal.http2.ErrorCode r1 = r1.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> La4
                if (r1 != 0) goto L32
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> La4
                r1.waitForIo$okhttp()     // Catch: java.lang.Throwable -> La4
                goto Lc
            L32:
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> Laf
                okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r1.getWriteTimeout$okhttp()     // Catch: java.lang.Throwable -> Laf
                r1.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Laf
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> Laf
                r1.checkOutNotClosed$okhttp()     // Catch: java.lang.Throwable -> Laf
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> Laf
                long r1 = r1.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> Laf
                okhttp3.internal.http2.Http2Stream r3 = r11.this$0     // Catch: java.lang.Throwable -> Laf
                long r3 = r3.getWriteBytesTotal()     // Catch: java.lang.Throwable -> Laf
                long r1 = r1 - r3
                okio.Buffer r3 = r11.sendBuffer     // Catch: java.lang.Throwable -> Laf
                long r3 = r3.size()     // Catch: java.lang.Throwable -> Laf
                long r9 = java.lang.Math.min(r1, r3)     // Catch: java.lang.Throwable -> Laf
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> Laf
                long r2 = r1.getWriteBytesTotal()     // Catch: java.lang.Throwable -> Laf
                long r2 = r2 + r9
                r1.setWriteBytesTotal$okhttp(r2)     // Catch: java.lang.Throwable -> Laf
                if (r12 == 0) goto L70
                okio.Buffer r12 = r11.sendBuffer     // Catch: java.lang.Throwable -> Laf
                long r1 = r12.size()     // Catch: java.lang.Throwable -> Laf
                int r12 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                if (r12 != 0) goto L70
                r12 = 1
                r7 = 1
                goto L72
            L70:
                r12 = 0
                r7 = 0
            L72:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Laf
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r12 = r11.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r12 = r12.getWriteTimeout$okhttp()
                r12.enter()
                okhttp3.internal.http2.Http2Stream r12 = r11.this$0     // Catch: java.lang.Throwable -> L99
                okhttp3.internal.http2.Http2Connection r5 = r12.getConnection()     // Catch: java.lang.Throwable -> L99
                okhttp3.internal.http2.Http2Stream r12 = r11.this$0     // Catch: java.lang.Throwable -> L99
                int r6 = r12.getId()     // Catch: java.lang.Throwable -> L99
                okio.Buffer r8 = r11.sendBuffer     // Catch: java.lang.Throwable -> L99
                r5.writeData(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L99
                okhttp3.internal.http2.Http2Stream r12 = r11.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r12 = r12.getWriteTimeout$okhttp()
                r12.exitAndThrowIfTimedOut()
                return
            L99:
                r12 = move-exception
                okhttp3.internal.http2.Http2Stream r0 = r11.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.getWriteTimeout$okhttp()
                r0.exitAndThrowIfTimedOut()
                throw r12
            La4:
                r12 = move-exception
                okhttp3.internal.http2.Http2Stream r1 = r11.this$0     // Catch: java.lang.Throwable -> Laf
                okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r1.getWriteTimeout$okhttp()     // Catch: java.lang.Throwable -> Laf
                r1.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Laf
                throw r12     // Catch: java.lang.Throwable -> Laf
            Laf:
                r12 = move-exception
                monitor-exit(r0)
                throw r12
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r10 = this;
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L35
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto Ld
                goto L35
            Ld:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.String r2 = "Thread "
                java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r4 = "Thread.currentThread()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L35:
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                monitor-enter(r0)
                boolean r1 = r10.closed     // Catch: java.lang.Throwable -> Ld6
                if (r1 == 0) goto L3e
                monitor-exit(r0)
                return
            L3e:
                okhttp3.internal.http2.Http2Stream r1 = r10.this$0     // Catch: java.lang.Throwable -> Ld6
                okhttp3.internal.http2.ErrorCode r1 = r1.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> Ld6
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L4a
                r1 = 1
                goto L4b
            L4a:
                r1 = 0
            L4b:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Ld6
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                okhttp3.internal.http2.Http2Stream$FramingSink r0 = r0.getSink$okhttp()
                boolean r0 = r0.finished
                if (r0 != 0) goto Lbc
                okio.Buffer r0 = r10.sendBuffer
                long r4 = r0.size()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L66
                r0 = 1
                goto L67
            L66:
                r0 = 0
            L67:
                okhttp3.Headers r4 = r10.trailers
                if (r4 == 0) goto L6d
                r4 = 1
                goto L6e
            L6d:
                r4 = 0
            L6e:
                if (r4 == 0) goto L97
            L70:
                okio.Buffer r0 = r10.sendBuffer
                long r4 = r0.size()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L7e
                r10.emitFrame(r2)
                goto L70
            L7e:
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                okhttp3.internal.http2.Http2Stream r2 = r10.this$0
                int r2 = r2.getId()
                okhttp3.Headers r4 = r10.trailers
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                java.util.List r4 = okhttp3.internal.Util.toHeaderList(r4)
                r0.writeHeaders$okhttp(r2, r1, r4)
                goto Lbc
            L97:
                if (r0 == 0) goto La7
            L99:
                okio.Buffer r0 = r10.sendBuffer
                long r0 = r0.size()
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 <= 0) goto Lbc
                r10.emitFrame(r3)
                goto L99
            La7:
                if (r1 == 0) goto Lbc
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                okhttp3.internal.http2.Http2Connection r4 = r0.getConnection()
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                int r5 = r0.getId()
                r6 = 1
                r7 = 0
                r8 = 0
                r4.writeData(r5, r6, r7, r8)
            Lbc:
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                monitor-enter(r0)
                r10.closed = r3     // Catch: java.lang.Throwable -> Ld3
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Ld3
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                r0.cancelStreamIfNecessary$okhttp()
                return
            Ld3:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            Ld6:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws java.io.IOException {
                r5 = this;
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L35
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto Ld
                goto L35
            Ld:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.String r2 = "Thread "
                java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r4 = "Thread.currentThread()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L35:
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                monitor-enter(r0)
                okhttp3.internal.http2.Http2Stream r1 = r5.this$0     // Catch: java.lang.Throwable -> L5b
                r1.checkOutNotClosed$okhttp()     // Catch: java.lang.Throwable -> L5b
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5b
                monitor-exit(r0)
            L40:
                okio.Buffer r0 = r5.sendBuffer
                long r0 = r0.size()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L5a
                r0 = 0
                r5.emitFrame(r0)
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.flush()
                goto L40
            L5a:
                return
            L5b:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        public final boolean getClosed() {
                r1 = this;
                boolean r0 = r1.closed
                return r0
        }

        public final boolean getFinished() {
                r1 = this;
                boolean r0 = r1.finished
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.Headers getTrailers() {
                r1 = this;
                okhttp3.Headers r0 = r1.trailers
                return r0
        }

        public final void setClosed(boolean r1) {
                r0 = this;
                r0.closed = r1
                return
        }

        public final void setFinished(boolean r1) {
                r0 = this;
                r0.finished = r1
                return
        }

        public final void setTrailers(@org.jetbrains.annotations.Nullable okhttp3.Headers r1) {
                r0 = this;
                r0.trailers = r1
                return
        }

        @Override // okio.Sink
        @org.jetbrains.annotations.NotNull
        public okio.Timeout timeout() {
                r1 = this;
                okhttp3.internal.http2.Http2Stream r0 = r1.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.getWriteTimeout$okhttp()
                return r0
        }

        @Override // okio.Sink
        public void write(@org.jetbrains.annotations.NotNull okio.Buffer r3, long r4) throws java.io.IOException {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L3b
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L13
                goto L3b
            L13:
                java.lang.AssertionError r3 = new java.lang.AssertionError
                java.lang.String r4 = "Thread "
                java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r1 = "Thread.currentThread()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
                java.lang.String r5 = r5.getName()
                r4.append(r5)
                java.lang.String r5 = " MUST NOT hold lock on "
                r4.append(r5)
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            L3b:
                okio.Buffer r0 = r2.sendBuffer
                r0.write(r3, r4)
            L40:
                okio.Buffer r3 = r2.sendBuffer
                long r3 = r3.size()
                r0 = 16384(0x4000, double:8.095E-320)
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 < 0) goto L51
                r3 = 0
                r2.emitFrame(r3)
                goto L40
            L51:
                return
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u001d\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\"J\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002R\u001a\u0010\u0007\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokio/Source;", "maxByteCount", "", "finished", "", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "getFinished$okhttp", "setFinished$okhttp", "readBuffer", "Lokio/Buffer;", "getReadBuffer", "()Lokio/Buffer;", "receiveBuffer", "getReceiveBuffer", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "close", "", "read", "sink", "byteCount", "receive", "source", "Lokio/BufferedSource;", "receive$okhttp", "timeout", "Lokio/Timeout;", "updateConnectionFlowControl", "okhttp"}, k = 1, mv = {1, 4, 1})
    public final class FramingSource implements okio.Source {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;

        @org.jetbrains.annotations.NotNull
        private final okio.Buffer readBuffer;

        @org.jetbrains.annotations.NotNull
        private final okio.Buffer receiveBuffer;
        public final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;

        @org.jetbrains.annotations.Nullable
        private okhttp3.Headers trailers;

        public FramingSource(okhttp3.internal.http2.Http2Stream r1, long r2, boolean r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.maxByteCount = r2
                r0.finished = r4
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r0.receiveBuffer = r1
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r0.readBuffer = r1
                return
        }

        private final void updateConnectionFlowControl(long r4) {
                r3 = this;
                okhttp3.internal.http2.Http2Stream r0 = r3.this$0
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L35
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto Ld
                goto L35
            Ld:
                java.lang.AssertionError r4 = new java.lang.AssertionError
                java.lang.String r5 = "Thread "
                java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "Thread.currentThread()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                java.lang.String r1 = r1.getName()
                r5.append(r1)
                java.lang.String r1 = " MUST NOT hold lock on "
                r5.append(r1)
                r5.append(r0)
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
            L35:
                okhttp3.internal.http2.Http2Stream r0 = r3.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.updateConnectionFlowControl$okhttp(r4)
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r5 = this;
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                monitor-enter(r0)
                r1 = 1
                r5.closed = r1     // Catch: java.lang.Throwable -> L32
                okio.Buffer r1 = r5.readBuffer     // Catch: java.lang.Throwable -> L32
                long r1 = r1.size()     // Catch: java.lang.Throwable -> L32
                okio.Buffer r3 = r5.readBuffer     // Catch: java.lang.Throwable -> L32
                r3.clear()     // Catch: java.lang.Throwable -> L32
                okhttp3.internal.http2.Http2Stream r3 = r5.this$0     // Catch: java.lang.Throwable -> L32
                if (r3 == 0) goto L2a
                r3.notifyAll()     // Catch: java.lang.Throwable -> L32
                kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L32
                monitor-exit(r0)
                r3 = 0
                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r0 <= 0) goto L24
                r5.updateConnectionFlowControl(r1)
            L24:
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                r0.cancelStreamIfNecessary$okhttp()
                return
            L2a:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L32
                java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L32
                throw r1     // Catch: java.lang.Throwable -> L32
            L32:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        public final boolean getClosed$okhttp() {
                r1 = this;
                boolean r0 = r1.closed
                return r0
        }

        public final boolean getFinished$okhttp() {
                r1 = this;
                boolean r0 = r1.finished
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.Buffer getReadBuffer() {
                r1 = this;
                okio.Buffer r0 = r1.readBuffer
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.Buffer getReceiveBuffer() {
                r1 = this;
                okio.Buffer r0 = r1.receiveBuffer
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.Headers getTrailers() {
                r1 = this;
                okhttp3.Headers r0 = r1.trailers
                return r0
        }

        @Override // okio.Source
        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r18, long r19) throws java.io.IOException {
                r17 = this;
                r1 = r17
                r0 = r18
                r2 = r19
                java.lang.String r4 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L14
                r6 = 1
                goto L15
            L14:
                r6 = 0
            L15:
                if (r6 == 0) goto Lf4
            L17:
                r6 = 0
                okhttp3.internal.http2.Http2Stream r7 = r1.this$0
                monitor-enter(r7)
                okhttp3.internal.http2.Http2Stream r8 = r1.this$0     // Catch: java.lang.Throwable -> Lf1
                okhttp3.internal.http2.Http2Stream$StreamTimeout r8 = r8.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Lf1
                r8.enter()     // Catch: java.lang.Throwable -> Lf1
                okhttp3.internal.http2.Http2Stream r8 = r1.this$0     // Catch: java.lang.Throwable -> Le6
                okhttp3.internal.http2.ErrorCode r8 = r8.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> Le6
                if (r8 == 0) goto L47
                boolean r8 = r1.finished     // Catch: java.lang.Throwable -> Le6
                if (r8 != 0) goto L47
                okhttp3.internal.http2.Http2Stream r6 = r1.this$0     // Catch: java.lang.Throwable -> Le6
                java.io.IOException r6 = r6.getErrorException$okhttp()     // Catch: java.lang.Throwable -> Le6
                if (r6 == 0) goto L39
                goto L47
            L39:
                okhttp3.internal.http2.StreamResetException r6 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> Le6
                okhttp3.internal.http2.Http2Stream r8 = r1.this$0     // Catch: java.lang.Throwable -> Le6
                okhttp3.internal.http2.ErrorCode r8 = r8.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> Le6
                kotlin.jvm.internal.Intrinsics.checkNotNull(r8)     // Catch: java.lang.Throwable -> Le6
                r6.<init>(r8)     // Catch: java.lang.Throwable -> Le6
            L47:
                boolean r8 = r1.closed     // Catch: java.lang.Throwable -> Le6
                if (r8 != 0) goto Ldd
                okio.Buffer r8 = r1.readBuffer     // Catch: java.lang.Throwable -> Le6
                long r8 = r8.size()     // Catch: java.lang.Throwable -> Le6
                r10 = -1
                int r12 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r12 <= 0) goto Lac
                okio.Buffer r8 = r1.readBuffer     // Catch: java.lang.Throwable -> Le6
                long r12 = r8.size()     // Catch: java.lang.Throwable -> Le6
                long r12 = java.lang.Math.min(r2, r12)     // Catch: java.lang.Throwable -> Le6
                long r8 = r8.read(r0, r12)     // Catch: java.lang.Throwable -> Le6
                okhttp3.internal.http2.Http2Stream r12 = r1.this$0     // Catch: java.lang.Throwable -> Le6
                long r13 = r12.getReadBytesTotal()     // Catch: java.lang.Throwable -> Le6
                long r13 = r13 + r8
                r12.setReadBytesTotal$okhttp(r13)     // Catch: java.lang.Throwable -> Le6
                okhttp3.internal.http2.Http2Stream r12 = r1.this$0     // Catch: java.lang.Throwable -> Le6
                long r12 = r12.getReadBytesTotal()     // Catch: java.lang.Throwable -> Le6
                okhttp3.internal.http2.Http2Stream r14 = r1.this$0     // Catch: java.lang.Throwable -> Le6
                long r14 = r14.getReadBytesAcknowledged()     // Catch: java.lang.Throwable -> Le6
                long r12 = r12 - r14
                if (r6 != 0) goto Lbb
                okhttp3.internal.http2.Http2Stream r14 = r1.this$0     // Catch: java.lang.Throwable -> Le6
                okhttp3.internal.http2.Http2Connection r14 = r14.getConnection()     // Catch: java.lang.Throwable -> Le6
                okhttp3.internal.http2.Settings r14 = r14.getOkHttpSettings()     // Catch: java.lang.Throwable -> Le6
                int r14 = r14.getInitialWindowSize()     // Catch: java.lang.Throwable -> Le6
                int r14 = r14 / 2
                long r14 = (long) r14     // Catch: java.lang.Throwable -> Le6
                int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r16 < 0) goto Lbb
                okhttp3.internal.http2.Http2Stream r14 = r1.this$0     // Catch: java.lang.Throwable -> Le6
                okhttp3.internal.http2.Http2Connection r14 = r14.getConnection()     // Catch: java.lang.Throwable -> Le6
                okhttp3.internal.http2.Http2Stream r15 = r1.this$0     // Catch: java.lang.Throwable -> Le6
                int r15 = r15.getId()     // Catch: java.lang.Throwable -> Le6
                r14.writeWindowUpdateLater$okhttp(r15, r12)     // Catch: java.lang.Throwable -> Le6
                okhttp3.internal.http2.Http2Stream r12 = r1.this$0     // Catch: java.lang.Throwable -> Le6
                long r13 = r12.getReadBytesTotal()     // Catch: java.lang.Throwable -> Le6
                r12.setReadBytesAcknowledged$okhttp(r13)     // Catch: java.lang.Throwable -> Le6
                goto Lbb
            Lac:
                boolean r8 = r1.finished     // Catch: java.lang.Throwable -> Le6
                if (r8 != 0) goto Lba
                if (r6 != 0) goto Lba
                okhttp3.internal.http2.Http2Stream r8 = r1.this$0     // Catch: java.lang.Throwable -> Le6
                r8.waitForIo$okhttp()     // Catch: java.lang.Throwable -> Le6
                r8 = 1
                r12 = r10
                goto Lbe
            Lba:
                r8 = r10
            Lbb:
                r12 = 0
                r12 = r8
                r8 = 0
            Lbe:
                okhttp3.internal.http2.Http2Stream r9 = r1.this$0     // Catch: java.lang.Throwable -> Lf1
                okhttp3.internal.http2.Http2Stream$StreamTimeout r9 = r9.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Lf1
                r9.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Lf1
                kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lf1
                monitor-exit(r7)
                if (r8 == 0) goto Lce
                goto L17
            Lce:
                int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r0 == 0) goto Ld6
                r1.updateConnectionFlowControl(r12)
                return r12
            Ld6:
                if (r6 != 0) goto Ld9
                return r10
            Ld9:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
                throw r6
            Ldd:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Le6
                java.lang.String r2 = "stream closed"
                r0.<init>(r2)     // Catch: java.lang.Throwable -> Le6
                throw r0     // Catch: java.lang.Throwable -> Le6
            Le6:
                r0 = move-exception
                okhttp3.internal.http2.Http2Stream r2 = r1.this$0     // Catch: java.lang.Throwable -> Lf1
                okhttp3.internal.http2.Http2Stream$StreamTimeout r2 = r2.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Lf1
                r2.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Lf1
                throw r0     // Catch: java.lang.Throwable -> Lf1
            Lf1:
                r0 = move-exception
                monitor-exit(r7)
                throw r0
            Lf4:
                java.lang.String r0 = "byteCount < 0: "
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2)
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }

        public final void receive$okhttp(@org.jetbrains.annotations.NotNull okio.BufferedSource r11, long r12) throws java.io.IOException {
                r10 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L3b
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L13
                goto L3b
            L13:
                java.lang.AssertionError r11 = new java.lang.AssertionError
                java.lang.String r12 = "Thread "
                java.lang.StringBuilder r12 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r12)
                java.lang.Thread r13 = java.lang.Thread.currentThread()
                java.lang.String r1 = "Thread.currentThread()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r1)
                java.lang.String r13 = r13.getName()
                r12.append(r13)
                java.lang.String r13 = " MUST NOT hold lock on "
                r12.append(r13)
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                throw r11
            L3b:
                r0 = 0
                int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r2 <= 0) goto Lc9
                okhttp3.internal.http2.Http2Stream r2 = r10.this$0
                monitor-enter(r2)
                boolean r3 = r10.finished     // Catch: java.lang.Throwable -> Lc6
                okio.Buffer r4 = r10.readBuffer     // Catch: java.lang.Throwable -> Lc6
                long r4 = r4.size()     // Catch: java.lang.Throwable -> Lc6
                long r4 = r4 + r12
                long r6 = r10.maxByteCount     // Catch: java.lang.Throwable -> Lc6
                r8 = 1
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 <= 0) goto L56
                r4 = 1
                goto L57
            L56:
                r4 = 0
            L57:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lc6
                monitor-exit(r2)
                if (r4 == 0) goto L67
                r11.skip(r12)
                okhttp3.internal.http2.Http2Stream r11 = r10.this$0
                okhttp3.internal.http2.ErrorCode r12 = okhttp3.internal.http2.ErrorCode.FLOW_CONTROL_ERROR
                r11.closeLater(r12)
                return
            L67:
                if (r3 == 0) goto L6d
                r11.skip(r12)
                return
            L6d:
                okio.Buffer r2 = r10.receiveBuffer
                long r2 = r11.read(r2, r12)
                r4 = -1
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto Lc0
                long r12 = r12 - r2
                okhttp3.internal.http2.Http2Stream r2 = r10.this$0
                monitor-enter(r2)
                boolean r3 = r10.closed     // Catch: java.lang.Throwable -> Lbd
                if (r3 == 0) goto L8d
                okio.Buffer r3 = r10.receiveBuffer     // Catch: java.lang.Throwable -> Lbd
                long r3 = r3.size()     // Catch: java.lang.Throwable -> Lbd
                okio.Buffer r5 = r10.receiveBuffer     // Catch: java.lang.Throwable -> Lbd
                r5.clear()     // Catch: java.lang.Throwable -> Lbd
                goto Lb3
            L8d:
                okio.Buffer r3 = r10.readBuffer     // Catch: java.lang.Throwable -> Lbd
                long r3 = r3.size()     // Catch: java.lang.Throwable -> Lbd
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 != 0) goto L98
                goto L99
            L98:
                r8 = 0
            L99:
                okio.Buffer r3 = r10.readBuffer     // Catch: java.lang.Throwable -> Lbd
                okio.Buffer r4 = r10.receiveBuffer     // Catch: java.lang.Throwable -> Lbd
                r3.writeAll(r4)     // Catch: java.lang.Throwable -> Lbd
                if (r8 == 0) goto Lb2
                okhttp3.internal.http2.Http2Stream r3 = r10.this$0     // Catch: java.lang.Throwable -> Lbd
                if (r3 == 0) goto Laa
                r3.notifyAll()     // Catch: java.lang.Throwable -> Lbd
                goto Lb2
            Laa:
                java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> Lbd
                java.lang.String r12 = "null cannot be cast to non-null type java.lang.Object"
                r11.<init>(r12)     // Catch: java.lang.Throwable -> Lbd
                throw r11     // Catch: java.lang.Throwable -> Lbd
            Lb2:
                r3 = r0
            Lb3:
                monitor-exit(r2)
                int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r2 <= 0) goto L3b
                r10.updateConnectionFlowControl(r3)
                goto L3b
            Lbd:
                r11 = move-exception
                monitor-exit(r2)
                throw r11
            Lc0:
                java.io.EOFException r11 = new java.io.EOFException
                r11.<init>()
                throw r11
            Lc6:
                r11 = move-exception
                monitor-exit(r2)
                throw r11
            Lc9:
                return
        }

        public final void setClosed$okhttp(boolean r1) {
                r0 = this;
                r0.closed = r1
                return
        }

        public final void setFinished$okhttp(boolean r1) {
                r0 = this;
                r0.finished = r1
                return
        }

        public final void setTrailers(@org.jetbrains.annotations.Nullable okhttp3.Headers r1) {
                r0 = this;
                r0.trailers = r1
                return
        }

        @Override // okio.Source
        @org.jetbrains.annotations.NotNull
        public okio.Timeout timeout() {
                r1 = this;
                okhttp3.internal.http2.Http2Stream r0 = r1.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.getReadTimeout$okhttp()
                return r0
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokio/AsyncTimeout;", "", "exitAndThrowIfTimedOut", "<init>", "(Lokhttp3/internal/http2/Http2Stream;)V", "okhttp"}, k = 1, mv = {1, 4, 1})
    public final class StreamTimeout extends okio.AsyncTimeout {
        public final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;

        public StreamTimeout(okhttp3.internal.http2.Http2Stream r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public final void exitAndThrowIfTimedOut() throws java.io.IOException {
                r2 = this;
                boolean r0 = r2.exit()
                if (r0 != 0) goto L7
                return
            L7:
                java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
                java.lang.String r1 = "timeout"
                r0.<init>(r1)
                throw r0
        }

        @Override // okio.AsyncTimeout
        @org.jetbrains.annotations.NotNull
        public final java.io.IOException newTimeoutException(@org.jetbrains.annotations.Nullable java.io.IOException r3) {
                r2 = this;
                java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
                java.lang.String r1 = "timeout"
                r0.<init>(r1)
                if (r3 == 0) goto Ld
                r0.initCause(r3)
            Ld:
                return r0
        }

        @Override // okio.AsyncTimeout
        public final void timedOut() {
                r2 = this;
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL
                r0.closeLater(r1)
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.sendDegradedPingLater$okhttp()
                return
        }
    }

    static {
            okhttp3.internal.http2.Http2Stream$Companion r0 = new okhttp3.internal.http2.Http2Stream$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Http2Stream.Companion = r0
            return
    }

    public Http2Stream(int r4, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Connection r5, boolean r6, boolean r7, @org.jetbrains.annotations.Nullable okhttp3.Headers r8) {
            r3 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r3.<init>()
            r3.id = r4
            r3.connection = r5
            okhttp3.internal.http2.Settings r4 = r5.getPeerSettings()
            int r4 = r4.getInitialWindowSize()
            long r0 = (long) r4
            r3.writeBytesMaximum = r0
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            r3.headersQueue = r4
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = new okhttp3.internal.http2.Http2Stream$FramingSource
            okhttp3.internal.http2.Settings r5 = r5.getOkHttpSettings()
            int r5 = r5.getInitialWindowSize()
            long r1 = (long) r5
            r0.<init>(r3, r1, r7)
            r3.source = r0
            okhttp3.internal.http2.Http2Stream$FramingSink r5 = new okhttp3.internal.http2.Http2Stream$FramingSink
            r5.<init>(r3, r6)
            r3.sink = r5
            okhttp3.internal.http2.Http2Stream$StreamTimeout r5 = new okhttp3.internal.http2.Http2Stream$StreamTimeout
            r5.<init>(r3)
            r3.readTimeout = r5
            okhttp3.internal.http2.Http2Stream$StreamTimeout r5 = new okhttp3.internal.http2.Http2Stream$StreamTimeout
            r5.<init>(r3)
            r3.writeTimeout = r5
            if (r8 == 0) goto L5d
            boolean r5 = r3.isLocallyInitiated()
            r5 = r5 ^ 1
            if (r5 == 0) goto L51
            r4.add(r8)
            goto L63
        L51:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "locally-initiated streams shouldn't have headers yet"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L5d:
            boolean r4 = r3.isLocallyInitiated()
            if (r4 == 0) goto L64
        L63:
            return
        L64:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "remotely-initiated streams should have headers"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    private final boolean closeInternal(okhttp3.internal.http2.ErrorCode r3, java.io.IOException r4) {
            r2 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L33
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Lb
            goto L33
        Lb:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r4 = "Thread "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L33:
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L60
            r1 = 0
            if (r0 == 0) goto L3b
            monitor-exit(r2)
            return r1
        L3b:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L60
            boolean r0 = r0.getFinished$okhttp()     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L4d
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L60
            boolean r0 = r0.getFinished()     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L4d
            monitor-exit(r2)
            return r1
        L4d:
            r2.errorCode = r3     // Catch: java.lang.Throwable -> L60
            r2.errorException = r4     // Catch: java.lang.Throwable -> L60
            r2.notifyAll()     // Catch: java.lang.Throwable -> L60
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L60
            monitor-exit(r2)
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.id
            r3.removeStream$okhttp(r4)
            r3 = 1
            return r3
        L60:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final void addBytesToWriteWindow(long r4) {
            r3 = this;
            long r0 = r3.writeBytesMaximum
            long r0 = r0 + r4
            r3.writeBytesMaximum = r0
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto Le
            r3.notifyAll()
        Le:
            return
    }

    public final void cancelStreamIfNecessary$okhttp() throws java.io.IOException {
            r4 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L33
            boolean r0 = java.lang.Thread.holdsLock(r4)
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
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L33:
            monitor-enter(r4)
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r4.source     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.getFinished$okhttp()     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L56
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r4.source     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.getClosed$okhttp()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L56
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r4.sink     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.getFinished()     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L54
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r4.sink     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.getClosed()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L56
        L54:
            r0 = 1
            goto L57
        L56:
            r0 = 0
        L57:
            boolean r1 = r4.isOpen()     // Catch: java.lang.Throwable -> L71
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)
            if (r0 == 0) goto L67
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL
            r1 = 0
            r4.close(r0, r1)
            goto L70
        L67:
            if (r1 != 0) goto L70
            okhttp3.internal.http2.Http2Connection r0 = r4.connection
            int r1 = r4.id
            r0.removeStream$okhttp(r1)
        L70:
            return
        L71:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    public final void checkOutNotClosed$okhttp() throws java.io.IOException {
            r2 = this;
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            boolean r0 = r0.getClosed()
            if (r0 != 0) goto L2e
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            boolean r0 = r0.getFinished()
            if (r0 != 0) goto L25
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode
            if (r0 == 0) goto L24
            java.io.IOException r0 = r2.errorException
            if (r0 == 0) goto L19
            goto L23
        L19:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.<init>(r1)
        L23:
            throw r0
        L24:
            return
        L25:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "stream finished"
            r0.<init>(r1)
            throw r0
        L2e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "stream closed"
            r0.<init>(r1)
            throw r0
    }

    public final void close(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r2, @org.jetbrains.annotations.Nullable java.io.IOException r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "rstStatusCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r3 = r1.closeInternal(r2, r3)
            if (r3 != 0) goto Ld
            return
        Ld:
            okhttp3.internal.http2.Http2Connection r3 = r1.connection
            int r0 = r1.id
            r3.writeSynReset$okhttp(r0, r2)
            return
    }

    public final void closeLater(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r3) {
            r2 = this;
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            boolean r0 = r2.closeInternal(r3, r0)
            if (r0 != 0) goto Ld
            return
        Ld:
            okhttp3.internal.http2.Http2Connection r0 = r2.connection
            int r1 = r2.id
            r0.writeSynResetLater$okhttp(r1, r3)
            return
    }

    public final void enqueueTrailers(@org.jetbrains.annotations.NotNull okhttp3.Headers r3) {
            r2 = this;
            java.lang.String r0 = "trailers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L3d
            boolean r0 = r0.getFinished()     // Catch: java.lang.Throwable -> L3d
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L31
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L18
            goto L19
        L18:
            r1 = 0
        L19:
            if (r1 == 0) goto L24
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L3d
            r0.setTrailers(r3)     // Catch: java.lang.Throwable -> L3d
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r2)
            return
        L24:
            java.lang.String r3 = "trailers.size() == 0"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L3d
            throw r0     // Catch: java.lang.Throwable -> L3d
        L31:
            java.lang.String r3 = "already finished"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L3d
            throw r0     // Catch: java.lang.Throwable -> L3d
        L3d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Http2Connection getConnection() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection r0 = r1.connection
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final synchronized okhttp3.internal.http2.ErrorCode getErrorCode$okhttp() {
            r1 = this;
            monitor-enter(r1)
            okhttp3.internal.http2.ErrorCode r0 = r1.errorCode     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.io.IOException getErrorException$okhttp() {
            r1 = this;
            java.io.IOException r0 = r1.errorException
            return r0
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.id
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
    public final okhttp3.internal.http2.Http2Stream.StreamTimeout getReadTimeout$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.readTimeout
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Sink getSink() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Le
            boolean r0 = r2.isLocallyInitiated()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L17
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            return r0
        L17:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Http2Stream.FramingSink getSink$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r1.sink
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Source getSource() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r1.source
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Http2Stream.FramingSource getSource$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r1.source
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
    public final okhttp3.internal.http2.Http2Stream.StreamTimeout getWriteTimeout$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.writeTimeout
            return r0
    }

    public final boolean isLocallyInitiated() {
            r4 = this;
            int r0 = r4.id
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            okhttp3.internal.http2.Http2Connection r3 = r4.connection
            boolean r3 = r3.getClient$okhttp()
            if (r3 != r0) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    public final synchronized boolean isOpen() {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L31
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r2)
            return r1
        L8:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.getFinished$okhttp()     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L18
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.getClosed$okhttp()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2e
        L18:
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.getFinished()     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L28
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.getClosed()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2e
        L28:
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2e
            monitor-exit(r2)
            return r1
        L2e:
            r0 = 1
            monitor-exit(r2)
            return r0
        L31:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Timeout readTimeout() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.readTimeout
            return r0
    }

    public final void receiveData(@org.jetbrains.annotations.NotNull okio.BufferedSource r4, int r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L39
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L11
            goto L39
        L11:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = "Thread "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r0 = r0.getName()
            r5.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L39:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r3.source
            long r1 = (long) r5
            r0.receive$okhttp(r4, r1)
            return
    }

    public final void receiveHeaders(@org.jetbrains.annotations.NotNull okhttp3.Headers r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L38
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L38
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r4 = "Thread "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L38:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L69
            r1 = 1
            if (r0 == 0) goto L47
            if (r4 != 0) goto L41
            goto L47
        L41:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L69
            r0.setTrailers(r3)     // Catch: java.lang.Throwable -> L69
            goto L4e
        L47:
            r2.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L69
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L69
            r0.add(r3)     // Catch: java.lang.Throwable -> L69
        L4e:
            if (r4 == 0) goto L55
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.source     // Catch: java.lang.Throwable -> L69
            r3.setFinished$okhttp(r1)     // Catch: java.lang.Throwable -> L69
        L55:
            boolean r3 = r2.isOpen()     // Catch: java.lang.Throwable -> L69
            r2.notifyAll()     // Catch: java.lang.Throwable -> L69
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L69
            monitor-exit(r2)
            if (r3 != 0) goto L68
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.id
            r3.removeStream$okhttp(r4)
        L68:
            return
        L69:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized void receiveRstStream(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> L11
            okhttp3.internal.http2.ErrorCode r0 = r1.errorCode     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto Lf
            r1.errorCode = r2     // Catch: java.lang.Throwable -> L11
            r1.notifyAll()     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final void setErrorCode$okhttp(@org.jetbrains.annotations.Nullable okhttp3.internal.http2.ErrorCode r1) {
            r0 = this;
            r0.errorCode = r1
            return
    }

    public final void setErrorException$okhttp(@org.jetbrains.annotations.Nullable java.io.IOException r1) {
            r0 = this;
            r0.errorException = r1
            return
    }

    public final void setReadBytesAcknowledged$okhttp(long r1) {
            r0 = this;
            r0.readBytesAcknowledged = r1
            return
    }

    public final void setReadBytesTotal$okhttp(long r1) {
            r0 = this;
            r0.readBytesTotal = r1
            return
    }

    public final void setWriteBytesMaximum$okhttp(long r1) {
            r0 = this;
            r0.writeBytesMaximum = r1
            return
    }

    public final void setWriteBytesTotal$okhttp(long r1) {
            r0 = this;
            r0.writeBytesTotal = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final synchronized okhttp3.Headers takeHeaders() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch: java.lang.Throwable -> L4b
            r0.enter()     // Catch: java.lang.Throwable -> L4b
        L6:
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L16
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L16
            r2.waitForIo$okhttp()     // Catch: java.lang.Throwable -> L44
            goto L6
        L16:
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch: java.lang.Throwable -> L4b
            r0.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L4b
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L4b
            r0 = r0 ^ 1
            if (r0 == 0) goto L34
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "headersQueue.removeFirst()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L4b
            okhttp3.Headers r0 = (okhttp3.Headers) r0     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)
            return r0
        L34:
            java.io.IOException r0 = r2.errorException     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L39
            goto L43
        L39:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L4b
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode     // Catch: java.lang.Throwable -> L4b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4b
        L43:
            throw r0     // Catch: java.lang.Throwable -> L4b
        L44:
            r0 = move-exception
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r2.readTimeout     // Catch: java.lang.Throwable -> L4b
            r1.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L4b
            throw r0     // Catch: java.lang.Throwable -> L4b
        L4b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final synchronized okhttp3.Headers trailers() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.getFinished$okhttp()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L2e
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L4b
            okio.Buffer r0 = r0.getReceiveBuffer()     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.exhausted()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L2e
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L4b
            okio.Buffer r0 = r0.getReadBuffer()     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.exhausted()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L2e
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L4b
            okhttp3.Headers r0 = r0.getTrailers()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L2a
            goto L2c
        L2a:
            okhttp3.Headers r0 = okhttp3.internal.Util.EMPTY_HEADERS     // Catch: java.lang.Throwable -> L4b
        L2c:
            monitor-exit(r2)
            return r0
        L2e:
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L42
            java.io.IOException r0 = r2.errorException     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L37
            goto L41
        L37:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L4b
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode     // Catch: java.lang.Throwable -> L4b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4b
        L41:
            throw r0     // Catch: java.lang.Throwable -> L4b
        L42:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "too early; can't read the trailers yet"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4b
            throw r0     // Catch: java.lang.Throwable -> L4b
        L4b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final void waitForIo$okhttp() throws java.io.InterruptedIOException {
            r1 = this;
            r1.wait()     // Catch: java.lang.InterruptedException -> L4
            return
        L4:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
    }

    public final void writeHeaders(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r7, boolean r8, boolean r9) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "responseHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L39
            boolean r0 = java.lang.Thread.holdsLock(r6)
            if (r0 != 0) goto L11
            goto L39
        L11:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "Thread "
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8)
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r0 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            java.lang.String r9 = r9.getName()
            r8.append(r9)
            java.lang.String r9 = " MUST NOT hold lock on "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L39:
            monitor-enter(r6)
            r0 = 1
            r6.hasResponseHeaders = r0     // Catch: java.lang.Throwable -> L73
            if (r8 == 0) goto L44
            okhttp3.internal.http2.Http2Stream$FramingSink r1 = r6.sink     // Catch: java.lang.Throwable -> L73
            r1.setFinished(r0)     // Catch: java.lang.Throwable -> L73
        L44:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L73
            monitor-exit(r6)
            if (r9 != 0) goto L64
            okhttp3.internal.http2.Http2Connection r9 = r6.connection
            monitor-enter(r9)
            okhttp3.internal.http2.Http2Connection r1 = r6.connection     // Catch: java.lang.Throwable -> L61
            long r1 = r1.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L61
            okhttp3.internal.http2.Http2Connection r3 = r6.connection     // Catch: java.lang.Throwable -> L61
            long r3 = r3.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L61
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L5d
            goto L5e
        L5d:
            r0 = 0
        L5e:
            monitor-exit(r9)
            r9 = r0
            goto L64
        L61:
            r7 = move-exception
            monitor-exit(r9)
            throw r7
        L64:
            okhttp3.internal.http2.Http2Connection r0 = r6.connection
            int r1 = r6.id
            r0.writeHeaders$okhttp(r1, r8, r7)
            if (r9 == 0) goto L72
            okhttp3.internal.http2.Http2Connection r7 = r6.connection
            r7.flush()
        L72:
            return
        L73:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Timeout writeTimeout() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.writeTimeout
            return r0
    }
}
