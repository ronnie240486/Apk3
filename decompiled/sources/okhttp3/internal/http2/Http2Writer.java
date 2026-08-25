package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2Writer.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 :2\u00020\u0001:\u0001:B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0006\u0010\u0015\u001a\u00020\u0011J(\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u000fJ(\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u000fJ\u0006\u0010\u001e\u001a\u00020\u0011J&\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fJ\u001e\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J$\u0010(\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*J\u0006\u0010,\u001a\u00020\u000fJ\u001e\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000fJ$\u00101\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\f\u00103\u001a\b\u0012\u0004\u0012\u00020+0*J\u0016\u00104\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%J\u000e\u00105\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u0013J\u0016\u00106\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u00107\u001a\u000208J\u0018\u00109\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u000208H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "sink", "Lokio/BufferedSink;", "client", "", "(Lokio/BufferedSink;Z)V", "closed", "hpackBuffer", "Lokio/Buffer;", "hpackWriter", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "maxFrameSize", "", "applyAndAckSettings", "", "peerSettings", "Lokhttp3/internal/http2/Settings;", "close", "connectionPreface", "data", "outFinished", "streamId", "source", "byteCount", "dataFrame", "flags", "buffer", "flush", "frameHeader", "length", "type", "goAway", "lastGoodStreamId", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "debugData", "", "headers", "headerBlock", "", "Lokhttp3/internal/http2/Header;", "maxDataLength", "ping", "ack", "payload1", "payload2", "pushPromise", "promisedStreamId", "requestHeaders", "rstStream", "settings", "windowUpdate", "windowSizeIncrement", "", "writeContinuationFrames", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Http2Writer implements java.io.Closeable {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Http2Writer.Companion Companion = null;
    private static final java.util.logging.Logger logger = null;
    private final boolean client;
    private boolean closed;
    private final okio.Buffer hpackBuffer;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final okio.BufferedSink sink;

    /* JADX INFO: compiled from: Http2Writer.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Writer$Companion;", "", "()V", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "okhttp"}, k = 1, mv = {1, 4, 1})
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
            okhttp3.internal.http2.Http2Writer$Companion r0 = new okhttp3.internal.http2.Http2Writer$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Http2Writer.Companion = r0
            java.lang.Class<okhttp3.internal.http2.Http2> r0 = okhttp3.internal.http2.Http2.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            okhttp3.internal.http2.Http2Writer.logger = r0
            return
    }

    public Http2Writer(@org.jetbrains.annotations.NotNull okio.BufferedSink r8, boolean r9) {
            r7 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r7.<init>()
            r7.sink = r8
            r7.client = r9
            okio.Buffer r4 = new okio.Buffer
            r4.<init>()
            r7.hpackBuffer = r4
            r8 = 16384(0x4000, float:2.2959E-41)
            r7.maxFrameSize = r8
            okhttp3.internal.http2.Hpack$Writer r8 = new okhttp3.internal.http2.Hpack$Writer
            r2 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r7.hpackWriter = r8
            return
    }

    private final void writeContinuationFrames(int r8, long r9) throws java.io.IOException {
            r7 = this;
        L0:
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L23
            int r2 = r7.maxFrameSize
            long r2 = (long) r2
            long r2 = java.lang.Math.min(r2, r9)
            long r9 = r9 - r2
            int r4 = (int) r2
            r5 = 9
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 != 0) goto L17
            r0 = 4
            goto L18
        L17:
            r0 = 0
        L18:
            r7.frameHeader(r8, r4, r5, r0)
            okio.BufferedSink r0 = r7.sink
            okio.Buffer r1 = r7.hpackBuffer
            r0.write(r1, r2)
            goto L0
        L23:
            return
    }

    public final synchronized void applyAndAckSettings(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "peerSettings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)     // Catch: java.lang.Throwable -> L37
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L2f
            int r0 = r2.maxFrameSize     // Catch: java.lang.Throwable -> L37
            int r0 = r3.getMaxFrameSize(r0)     // Catch: java.lang.Throwable -> L37
            r2.maxFrameSize = r0     // Catch: java.lang.Throwable -> L37
            int r0 = r3.getHeaderTableSize()     // Catch: java.lang.Throwable -> L37
            r1 = -1
            if (r0 == r1) goto L22
            okhttp3.internal.http2.Hpack$Writer r0 = r2.hpackWriter     // Catch: java.lang.Throwable -> L37
            int r3 = r3.getHeaderTableSize()     // Catch: java.lang.Throwable -> L37
            r0.resizeHeaderTable(r3)     // Catch: java.lang.Throwable -> L37
        L22:
            r3 = 4
            r0 = 1
            r1 = 0
            r2.frameHeader(r1, r1, r3, r0)     // Catch: java.lang.Throwable -> L37
            okio.BufferedSink r3 = r2.sink     // Catch: java.lang.Throwable -> L37
            r3.flush()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            return
        L2f:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "closed"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L37
            throw r3     // Catch: java.lang.Throwable -> L37
        L37:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.closed = r0     // Catch: java.lang.Throwable -> Lb
            okio.BufferedSink r0 = r1.sink     // Catch: java.lang.Throwable -> Lb
            r0.close()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void connectionPreface() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto L44
            boolean r0 = r3.client     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto Lb
            monitor-exit(r3)
            return
        Lb:
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Writer.logger     // Catch: java.lang.Throwable -> L4c
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L4c
            boolean r1 = r0.isLoggable(r1)     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = ">> CONNECTION "
            r1.append(r2)     // Catch: java.lang.Throwable -> L4c
            okio.ByteString r2 = okhttp3.internal.http2.Http2.CONNECTION_PREFACE     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = r2.hex()     // Catch: java.lang.Throwable -> L4c
            r1.append(r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4c
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = okhttp3.internal.Util.format(r1, r2)     // Catch: java.lang.Throwable -> L4c
            r0.fine(r1)     // Catch: java.lang.Throwable -> L4c
        L36:
            okio.BufferedSink r0 = r3.sink     // Catch: java.lang.Throwable -> L4c
            okio.ByteString r1 = okhttp3.internal.http2.Http2.CONNECTION_PREFACE     // Catch: java.lang.Throwable -> L4c
            r0.write(r1)     // Catch: java.lang.Throwable -> L4c
            okio.BufferedSink r0 = r3.sink     // Catch: java.lang.Throwable -> L4c
            r0.flush()     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L44:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            throw r0     // Catch: java.lang.Throwable -> L4c
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final synchronized void data(boolean r2, int r3, @org.jetbrains.annotations.Nullable okio.Buffer r4, int r5) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.closed     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto La
            r1.dataFrame(r3, r2, r4, r5)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        La:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = "closed"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L12
            throw r2     // Catch: java.lang.Throwable -> L12
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final void dataFrame(int r3, int r4, @org.jetbrains.annotations.Nullable okio.Buffer r5, int r6) throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.frameHeader(r3, r6, r0, r4)
            if (r6 <= 0) goto Lf
            okio.BufferedSink r3 = r2.sink
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            long r0 = (long) r6
            r3.write(r5, r0)
        Lf:
            return
    }

    public final synchronized void flush() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto Lc
            okio.BufferedSink r0 = r2.sink     // Catch: java.lang.Throwable -> L14
            r0.flush()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        Lc:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            throw r0     // Catch: java.lang.Throwable -> L14
        L14:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final void frameHeader(int r9, int r10, int r11, int r12) throws java.io.IOException {
            r8 = this;
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Writer.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r0.isLoggable(r1)
            if (r1 == 0) goto L18
            okhttp3.internal.http2.Http2 r2 = okhttp3.internal.http2.Http2.INSTANCE
            r3 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            java.lang.String r1 = r2.frameLog(r3, r4, r5, r6, r7)
            r0.fine(r1)
        L18:
            int r0 = r8.maxFrameSize
            r1 = 1
            if (r10 > r0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L5c
            r2 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r0 = (int) r2
            r0 = r0 & r9
            if (r0 != 0) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            if (r1 == 0) goto L4c
            okio.BufferedSink r0 = r8.sink
            okhttp3.internal.Util.writeMedium(r0, r10)
            okio.BufferedSink r10 = r8.sink
            r11 = r11 & 255(0xff, float:3.57E-43)
            r10.writeByte(r11)
            okio.BufferedSink r10 = r8.sink
            r11 = r12 & 255(0xff, float:3.57E-43)
            r10.writeByte(r11)
            okio.BufferedSink r10 = r8.sink
            r11 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r11
            r10.writeInt(r9)
            return
        L4c:
            java.lang.String r10 = "reserved bit set: "
            java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L5c:
            java.lang.String r9 = "FRAME_SIZE_ERROR length > "
            java.lang.StringBuilder r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9)
            int r11 = r8.maxFrameSize
            r9.append(r11)
            java.lang.String r11 = ": "
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Hpack.Writer getHpackWriter() {
            r1 = this;
            okhttp3.internal.http2.Hpack$Writer r0 = r1.hpackWriter
            return r0
    }

    public final synchronized void goAway(int r5, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r6, @org.jetbrains.annotations.NotNull byte[] r7) throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = "debugData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)     // Catch: java.lang.Throwable -> L5a
            boolean r0 = r4.closed     // Catch: java.lang.Throwable -> L5a
            if (r0 != 0) goto L52
            int r0 = r6.getHttpCode()     // Catch: java.lang.Throwable -> L5a
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 == 0) goto L46
            int r0 = r7.length     // Catch: java.lang.Throwable -> L5a
            int r0 = r0 + 8
            r1 = 7
            r4.frameHeader(r3, r0, r1, r3)     // Catch: java.lang.Throwable -> L5a
            okio.BufferedSink r0 = r4.sink     // Catch: java.lang.Throwable -> L5a
            r0.writeInt(r5)     // Catch: java.lang.Throwable -> L5a
            okio.BufferedSink r5 = r4.sink     // Catch: java.lang.Throwable -> L5a
            int r6 = r6.getHttpCode()     // Catch: java.lang.Throwable -> L5a
            r5.writeInt(r6)     // Catch: java.lang.Throwable -> L5a
            int r5 = r7.length     // Catch: java.lang.Throwable -> L5a
            if (r5 != 0) goto L36
            r3 = 1
        L36:
            r5 = r3 ^ 1
            if (r5 == 0) goto L3f
            okio.BufferedSink r5 = r4.sink     // Catch: java.lang.Throwable -> L5a
            r5.write(r7)     // Catch: java.lang.Throwable -> L5a
        L3f:
            okio.BufferedSink r5 = r4.sink     // Catch: java.lang.Throwable -> L5a
            r5.flush()     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r4)
            return
        L46:
            java.lang.String r5 = "errorCode.httpCode == -1"
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L5a
            throw r6     // Catch: java.lang.Throwable -> L5a
        L52:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = "closed"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L5a
            throw r5     // Catch: java.lang.Throwable -> L5a
        L5a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public final synchronized void headers(boolean r7, int r8, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r9) throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "headerBlock"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)     // Catch: java.lang.Throwable -> L43
            boolean r0 = r6.closed     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L3b
            okhttp3.internal.http2.Hpack$Writer r0 = r6.hpackWriter     // Catch: java.lang.Throwable -> L43
            r0.writeHeaders(r9)     // Catch: java.lang.Throwable -> L43
            okio.Buffer r9 = r6.hpackBuffer     // Catch: java.lang.Throwable -> L43
            long r0 = r9.size()     // Catch: java.lang.Throwable -> L43
            int r9 = r6.maxFrameSize     // Catch: java.lang.Throwable -> L43
            long r2 = (long) r9     // Catch: java.lang.Throwable -> L43
            long r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L43
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 != 0) goto L22
            r4 = 4
            goto L23
        L22:
            r4 = 0
        L23:
            if (r7 == 0) goto L27
            r4 = r4 | 1
        L27:
            int r7 = (int) r2     // Catch: java.lang.Throwable -> L43
            r5 = 1
            r6.frameHeader(r8, r7, r5, r4)     // Catch: java.lang.Throwable -> L43
            okio.BufferedSink r7 = r6.sink     // Catch: java.lang.Throwable -> L43
            okio.Buffer r4 = r6.hpackBuffer     // Catch: java.lang.Throwable -> L43
            r7.write(r4, r2)     // Catch: java.lang.Throwable -> L43
            if (r9 <= 0) goto L39
            long r0 = r0 - r2
            r6.writeContinuationFrames(r8, r0)     // Catch: java.lang.Throwable -> L43
        L39:
            monitor-exit(r6)
            return
        L3b:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L43
            java.lang.String r8 = "closed"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L43
            throw r7     // Catch: java.lang.Throwable -> L43
        L43:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public final int maxDataLength() {
            r1 = this;
            int r0 = r1.maxFrameSize
            return r0
    }

    public final synchronized void ping(boolean r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L22
            r0 = 8
            r1 = 6
            r2 = 0
            if (r4 == 0) goto Ld
            r4 = 1
            goto Le
        Ld:
            r4 = 0
        Le:
            r3.frameHeader(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L2a
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L2a
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L2a
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L2a
            r4.writeInt(r6)     // Catch: java.lang.Throwable -> L2a
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L2a
            r4.flush()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)
            return
        L22:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2a
            throw r4     // Catch: java.lang.Throwable -> L2a
        L2a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized void pushPromise(int r8, int r9, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r10) throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r7.closed     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L46
            okhttp3.internal.http2.Hpack$Writer r0 = r7.hpackWriter     // Catch: java.lang.Throwable -> L4e
            r0.writeHeaders(r10)     // Catch: java.lang.Throwable -> L4e
            okio.Buffer r10 = r7.hpackBuffer     // Catch: java.lang.Throwable -> L4e
            long r0 = r10.size()     // Catch: java.lang.Throwable -> L4e
            int r10 = r7.maxFrameSize     // Catch: java.lang.Throwable -> L4e
            long r2 = (long) r10     // Catch: java.lang.Throwable -> L4e
            r4 = 4
            long r2 = r2 - r4
            long r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L4e
            int r10 = (int) r2     // Catch: java.lang.Throwable -> L4e
            int r2 = r10 + 4
            r3 = 5
            long r4 = (long) r10     // Catch: java.lang.Throwable -> L4e
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 != 0) goto L2a
            r6 = 4
            goto L2b
        L2a:
            r6 = 0
        L2b:
            r7.frameHeader(r8, r2, r3, r6)     // Catch: java.lang.Throwable -> L4e
            okio.BufferedSink r2 = r7.sink     // Catch: java.lang.Throwable -> L4e
            r3 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r3
            r2.writeInt(r9)     // Catch: java.lang.Throwable -> L4e
            okio.BufferedSink r9 = r7.sink     // Catch: java.lang.Throwable -> L4e
            okio.Buffer r2 = r7.hpackBuffer     // Catch: java.lang.Throwable -> L4e
            r9.write(r2, r4)     // Catch: java.lang.Throwable -> L4e
            if (r10 <= 0) goto L44
            long r0 = r0 - r4
            r7.writeContinuationFrames(r8, r0)     // Catch: java.lang.Throwable -> L4e
        L44:
            monitor-exit(r7)
            return
        L46:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r9 = "closed"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L4e
            throw r8     // Catch: java.lang.Throwable -> L4e
        L4e:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    public final synchronized void rstStream(int r4, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r5) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)     // Catch: java.lang.Throwable -> L40
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L38
            int r0 = r5.getHttpCode()     // Catch: java.lang.Throwable -> L40
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L2c
            r0 = 4
            r1 = 3
            r3.frameHeader(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L40
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L40
            int r5 = r5.getHttpCode()     // Catch: java.lang.Throwable -> L40
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L40
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L40
            r4.flush()     // Catch: java.lang.Throwable -> L40
            monitor-exit(r3)
            return
        L2c:
            java.lang.String r4 = "Failed requirement."
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L40
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L40
            throw r5     // Catch: java.lang.Throwable -> L40
        L38:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L40
            throw r4     // Catch: java.lang.Throwable -> L40
        L40:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized void settings(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r6) throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "settings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r5.closed     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L43
            int r0 = r6.size()     // Catch: java.lang.Throwable -> L4b
            int r0 = r0 * 6
            r1 = 4
            r2 = 0
            r5.frameHeader(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L4b
            r0 = 10
        L18:
            if (r2 >= r0) goto L3c
            boolean r3 = r6.isSet(r2)     // Catch: java.lang.Throwable -> L4b
            if (r3 != 0) goto L21
            goto L39
        L21:
            if (r2 == r1) goto L2a
            r3 = 7
            if (r2 == r3) goto L28
            r3 = r2
            goto L2b
        L28:
            r3 = 4
            goto L2b
        L2a:
            r3 = 3
        L2b:
            okio.BufferedSink r4 = r5.sink     // Catch: java.lang.Throwable -> L4b
            r4.writeShort(r3)     // Catch: java.lang.Throwable -> L4b
            okio.BufferedSink r3 = r5.sink     // Catch: java.lang.Throwable -> L4b
            int r4 = r6.get(r2)     // Catch: java.lang.Throwable -> L4b
            r3.writeInt(r4)     // Catch: java.lang.Throwable -> L4b
        L39:
            int r2 = r2 + 1
            goto L18
        L3c:
            okio.BufferedSink r6 = r5.sink     // Catch: java.lang.Throwable -> L4b
            r6.flush()     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r5)
            return
        L43:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = "closed"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L4b
            throw r6     // Catch: java.lang.Throwable -> L4b
        L4b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    public final synchronized void windowUpdate(int r5, long r6) throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.closed     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L47
            r0 = 0
            r2 = 0
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 == 0) goto L15
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 > 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L2b
            r0 = 4
            r1 = 8
            r4.frameHeader(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L4f
            okio.BufferedSink r5 = r4.sink     // Catch: java.lang.Throwable -> L4f
            int r7 = (int) r6     // Catch: java.lang.Throwable -> L4f
            r5.writeInt(r7)     // Catch: java.lang.Throwable -> L4f
            okio.BufferedSink r5 = r4.sink     // Catch: java.lang.Throwable -> L4f
            r5.flush()     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r4)
            return
        L2b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r5.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "
            r5.append(r0)     // Catch: java.lang.Throwable -> L4f
            r5.append(r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L4f
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L4f
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L4f
            throw r6     // Catch: java.lang.Throwable -> L4f
        L47:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = "closed"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4f
            throw r5     // Catch: java.lang.Throwable -> L4f
        L4f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }
}
