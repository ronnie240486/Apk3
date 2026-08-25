package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2Reader.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 #2\u00020\u0001:\u0003#$%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J(\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010 \u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010!\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\"\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "source", "Lokio/BufferedSource;", "client", "", "(Lokio/BufferedSource;Z)V", "continuation", "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "hpackReader", "Lokhttp3/internal/http2/Hpack$Reader;", "close", "", "nextFrame", "requireSettings", "handler", "Lokhttp3/internal/http2/Http2Reader$Handler;", "readConnectionPreface", "readData", "length", "", "flags", "streamId", "readGoAway", "readHeaderBlock", "", "Lokhttp3/internal/http2/Header;", "padding", "readHeaders", "readPing", "readPriority", "readPushPromise", "readRstStream", "readSettings", "readWindowUpdate", "Companion", "ContinuationSource", "Handler", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Http2Reader implements java.io.Closeable {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Http2Reader.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.logging.Logger logger = null;
    private final boolean client;
    private final okhttp3.internal.http2.Http2Reader.ContinuationSource continuation;
    private final okhttp3.internal.http2.Hpack.Reader hpackReader;
    private final okio.BufferedSource source;

    /* JADX INFO: compiled from: Http2Reader.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "()V", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "lengthWithoutPadding", "", "length", "flags", "padding", "okhttp"}, k = 1, mv = {1, 4, 1})
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
        public final java.util.logging.Logger getLogger() {
                r1 = this;
                java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Reader.access$getLogger$cp()
                return r0
        }

        public final int lengthWithoutPadding(int r3, int r4, int r5) throws java.io.IOException {
                r2 = this;
                r4 = r4 & 8
                if (r4 == 0) goto L6
                int r3 = r3 + (-1)
            L6:
                if (r5 > r3) goto La
                int r3 = r3 - r5
                return r3
            La:
                java.io.IOException r4 = new java.io.IOException
                java.lang.String r0 = "PROTOCOL_ERROR padding "
                java.lang.String r1 = " > remaining length "
                java.lang.String r3 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r0, r5, r1, r3)
                r4.<init>(r3)
                throw r4
        }
    }

    /* JADX INFO: compiled from: Http2Reader.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020 H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\n¨\u0006!"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lokio/Source;", "source", "Lokio/BufferedSource;", "(Lokio/BufferedSource;)V", "flags", "", "getFlags", "()I", "setFlags", "(I)V", "left", "getLeft", "setLeft", "length", "getLength", "setLength", "padding", "getPadding", "setPadding", "streamId", "getStreamId", "setStreamId", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "readContinuationHeader", "timeout", "Lokio/Timeout;", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class ContinuationSource implements okio.Source {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final okio.BufferedSource source;
        private int streamId;

        public ContinuationSource(@org.jetbrains.annotations.NotNull okio.BufferedSource r2) {
                r1 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.source = r2
                return
        }

        private final void readContinuationHeader() throws java.io.IOException {
                r9 = this;
                int r0 = r9.streamId
                okio.BufferedSource r1 = r9.source
                int r1 = okhttp3.internal.Util.readMedium(r1)
                r9.left = r1
                r9.length = r1
                okio.BufferedSource r1 = r9.source
                byte r1 = r1.readByte()
                r2 = 255(0xff, float:3.57E-43)
                int r1 = okhttp3.internal.Util.and(r1, r2)
                okio.BufferedSource r3 = r9.source
                byte r3 = r3.readByte()
                int r2 = okhttp3.internal.Util.and(r3, r2)
                r9.flags = r2
                okhttp3.internal.http2.Http2Reader$Companion r2 = okhttp3.internal.http2.Http2Reader.Companion
                java.util.logging.Logger r3 = r2.getLogger()
                java.util.logging.Level r4 = java.util.logging.Level.FINE
                boolean r3 = r3.isLoggable(r4)
                if (r3 == 0) goto L47
                java.util.logging.Logger r2 = r2.getLogger()
                okhttp3.internal.http2.Http2 r3 = okhttp3.internal.http2.Http2.INSTANCE
                r4 = 1
                int r5 = r9.streamId
                int r6 = r9.length
                int r8 = r9.flags
                r7 = r1
                java.lang.String r3 = r3.frameLog(r4, r5, r6, r7, r8)
                r2.fine(r3)
            L47:
                okio.BufferedSource r2 = r9.source
                int r2 = r2.readInt()
                r3 = 2147483647(0x7fffffff, float:NaN)
                r2 = r2 & r3
                r9.streamId = r2
                r3 = 9
                if (r1 != r3) goto L62
                if (r2 != r0) goto L5a
                return
            L5a:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "TYPE_CONTINUATION streamId changed"
                r0.<init>(r1)
                throw r0
            L62:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                java.lang.String r1 = " != TYPE_CONTINUATION"
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r0 = this;
                return
        }

        public final int getFlags() {
                r1 = this;
                int r0 = r1.flags
                return r0
        }

        public final int getLeft() {
                r1 = this;
                int r0 = r1.left
                return r0
        }

        public final int getLength() {
                r1 = this;
                int r0 = r1.length
                return r0
        }

        public final int getPadding() {
                r1 = this;
                int r0 = r1.padding
                return r0
        }

        public final int getStreamId() {
                r1 = this;
                int r0 = r1.streamId
                return r0
        }

        @Override // okio.Source
        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r7, long r8) throws java.io.IOException {
                r6 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            L5:
                int r0 = r6.left
                r1 = -1
                if (r0 != 0) goto L21
                okio.BufferedSource r0 = r6.source
                int r3 = r6.padding
                long r3 = (long) r3
                r0.skip(r3)
                r0 = 0
                r6.padding = r0
                int r0 = r6.flags
                r0 = r0 & 4
                if (r0 == 0) goto L1d
                return r1
            L1d:
                r6.readContinuationHeader()
                goto L5
            L21:
                okio.BufferedSource r3 = r6.source
                long r4 = (long) r0
                long r8 = java.lang.Math.min(r8, r4)
                long r7 = r3.read(r7, r8)
                int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r9 != 0) goto L31
                return r1
            L31:
                int r9 = r6.left
                int r0 = (int) r7
                int r9 = r9 - r0
                r6.left = r9
                return r7
        }

        public final void setFlags(int r1) {
                r0 = this;
                r0.flags = r1
                return
        }

        public final void setLeft(int r1) {
                r0 = this;
                r0.left = r1
                return
        }

        public final void setLength(int r1) {
                r0 = this;
                r0.length = r1
                return
        }

        public final void setPadding(int r1) {
                r0 = this;
                r0.padding = r1
                return
        }

        public final void setStreamId(int r1) {
                r0 = this;
                r0.streamId = r1
                return
        }

        @Override // okio.Source
        @org.jetbrains.annotations.NotNull
        public okio.Timeout timeout() {
                r1 = this;
                okio.BufferedSource r0 = r1.source
                okio.Timeout r0 = r0.timeout()
                return r0
        }
    }

    /* JADX INFO: compiled from: Http2Reader.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J8\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&J(\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H&J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nH&J.\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&J \u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H&J(\u0010#\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0011H&J&\u0010'\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0018\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020-H&J\u0018\u0010.\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u000eH&¨\u00060"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "ackSettings", "", "alternateService", "streamId", "", "origin", "", "protocol", "Lokio/ByteString;", "host", "port", "maxAge", "", "data", "inFinished", "", "source", "Lokio/BufferedSource;", "length", "goAway", "lastGoodStreamId", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "debugData", "headers", "associatedStreamId", "headerBlock", "", "Lokhttp3/internal/http2/Header;", "ping", "ack", "payload1", "payload2", "priority", "streamDependency", "weight", "exclusive", "pushPromise", "promisedStreamId", "requestHeaders", "rstStream", "settings", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "windowUpdate", "windowSizeIncrement", "okhttp"}, k = 1, mv = {1, 4, 1})
    public interface Handler {
        void ackSettings();

        void alternateService(int r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull okio.ByteString r3, @org.jetbrains.annotations.NotNull java.lang.String r4, int r5, long r6);

        void data(boolean r1, int r2, @org.jetbrains.annotations.NotNull okio.BufferedSource r3, int r4) throws java.io.IOException;

        void goAway(int r1, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r2, @org.jetbrains.annotations.NotNull okio.ByteString r3);

        void headers(boolean r1, int r2, int r3, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r4);

        void ping(boolean r1, int r2, int r3);

        void priority(int r1, int r2, int r3, boolean r4);

        void pushPromise(int r1, int r2, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r3) throws java.io.IOException;

        void rstStream(int r1, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r2);

        void settings(boolean r1, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r2);

        void windowUpdate(int r1, long r2);
    }

    static {
            okhttp3.internal.http2.Http2Reader$Companion r0 = new okhttp3.internal.http2.Http2Reader$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Http2Reader.Companion = r0
            java.lang.Class<okhttp3.internal.http2.Http2> r0 = okhttp3.internal.http2.Http2.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            java.lang.String r1 = "Logger.getLogger(Http2::class.java.name)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            okhttp3.internal.http2.Http2Reader.logger = r0
            return
    }

    public Http2Reader(@org.jetbrains.annotations.NotNull okio.BufferedSource r8, boolean r9) {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r7.<init>()
            r7.source = r8
            r7.client = r9
            okhttp3.internal.http2.Http2Reader$ContinuationSource r2 = new okhttp3.internal.http2.Http2Reader$ContinuationSource
            r2.<init>(r8)
            r7.continuation = r2
            okhttp3.internal.http2.Hpack$Reader r8 = new okhttp3.internal.http2.Hpack$Reader
            r3 = 4096(0x1000, float:5.74E-42)
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r7.hpackReader = r8
            return
    }

    public static final /* synthetic */ java.util.logging.Logger access$getLogger$cp() {
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Reader.logger
            return r0
    }

    private final void readData(okhttp3.internal.http2.Http2Reader.Handler r5, int r6, int r7, int r8) throws java.io.IOException {
            r4 = this;
            if (r8 == 0) goto L3d
            r0 = r7 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            r3 = r7 & 32
            if (r3 == 0) goto L10
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 != 0) goto L35
            r2 = r7 & 8
            if (r2 == 0) goto L23
            okio.BufferedSource r1 = r4.source
            byte r1 = r1.readByte()
            r2 = 255(0xff, float:3.57E-43)
            int r1 = okhttp3.internal.Util.and(r1, r2)
        L23:
            okhttp3.internal.http2.Http2Reader$Companion r2 = okhttp3.internal.http2.Http2Reader.Companion
            int r6 = r2.lengthWithoutPadding(r6, r7, r1)
            okio.BufferedSource r7 = r4.source
            r5.data(r0, r8, r7, r6)
            okio.BufferedSource r5 = r4.source
            long r6 = (long) r1
            r5.skip(r6)
            return
        L35:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r5.<init>(r6)
            throw r5
        L3d:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            r5.<init>(r6)
            throw r5
    }

    private final void readGoAway(okhttp3.internal.http2.Http2Reader.Handler r4, int r5, int r6, int r7) throws java.io.IOException {
            r3 = this;
            r6 = 8
            if (r5 < r6) goto L3e
            if (r7 != 0) goto L36
            okio.BufferedSource r7 = r3.source
            int r7 = r7.readInt()
            okio.BufferedSource r0 = r3.source
            int r0 = r0.readInt()
            int r5 = r5 - r6
            okhttp3.internal.http2.ErrorCode$Companion r6 = okhttp3.internal.http2.ErrorCode.Companion
            okhttp3.internal.http2.ErrorCode r6 = r6.fromHttp2(r0)
            if (r6 == 0) goto L2a
            okio.ByteString r0 = okio.ByteString.EMPTY
            if (r5 <= 0) goto L26
            okio.BufferedSource r0 = r3.source
            long r1 = (long) r5
            okio.ByteString r0 = r0.readByteString(r1)
        L26:
            r4.goAway(r7, r6, r0)
            return
        L2a:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "TYPE_GOAWAY unexpected error code: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r0)
            r4.<init>(r5)
            throw r4
        L36:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "TYPE_GOAWAY streamId != 0"
            r4.<init>(r5)
            throw r4
        L3e:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r6 = "TYPE_GOAWAY length < 8: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r5)
            r4.<init>(r5)
            throw r4
    }

    private final java.util.List<okhttp3.internal.http2.Header> readHeaderBlock(int r2, int r3, int r4, int r5) throws java.io.IOException {
            r1 = this;
            okhttp3.internal.http2.Http2Reader$ContinuationSource r0 = r1.continuation
            r0.setLeft(r2)
            okhttp3.internal.http2.Http2Reader$ContinuationSource r2 = r1.continuation
            int r0 = r2.getLeft()
            r2.setLength(r0)
            okhttp3.internal.http2.Http2Reader$ContinuationSource r2 = r1.continuation
            r2.setPadding(r3)
            okhttp3.internal.http2.Http2Reader$ContinuationSource r2 = r1.continuation
            r2.setFlags(r4)
            okhttp3.internal.http2.Http2Reader$ContinuationSource r2 = r1.continuation
            r2.setStreamId(r5)
            okhttp3.internal.http2.Hpack$Reader r2 = r1.hpackReader
            r2.readHeaders()
            okhttp3.internal.http2.Hpack$Reader r2 = r1.hpackReader
            java.util.List r2 = r2.getAndResetHeaderList()
            return r2
    }

    private final void readHeaders(okhttp3.internal.http2.Http2Reader.Handler r4, int r5, int r6, int r7) throws java.io.IOException {
            r3 = this;
            if (r7 == 0) goto L32
            r0 = r6 & 1
            r1 = 0
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            r2 = r6 & 8
            if (r2 == 0) goto L1a
            okio.BufferedSource r1 = r3.source
            byte r1 = r1.readByte()
            r2 = 255(0xff, float:3.57E-43)
            int r1 = okhttp3.internal.Util.and(r1, r2)
        L1a:
            r2 = r6 & 32
            if (r2 == 0) goto L23
            r3.readPriority(r4, r7)
            int r5 = r5 + (-5)
        L23:
            okhttp3.internal.http2.Http2Reader$Companion r2 = okhttp3.internal.http2.Http2Reader.Companion
            int r5 = r2.lengthWithoutPadding(r5, r6, r1)
            java.util.List r5 = r3.readHeaderBlock(r5, r1, r6, r7)
            r6 = -1
            r4.headers(r0, r7, r6, r5)
            return
        L32:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            r4.<init>(r5)
            throw r4
    }

    private final void readPing(okhttp3.internal.http2.Http2Reader.Handler r2, int r3, int r4, int r5) throws java.io.IOException {
            r1 = this;
            r0 = 8
            if (r3 != r0) goto L24
            if (r5 != 0) goto L1c
            okio.BufferedSource r3 = r1.source
            int r3 = r3.readInt()
            okio.BufferedSource r5 = r1.source
            int r5 = r5.readInt()
            r0 = 1
            r4 = r4 & r0
            if (r4 == 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            r2.ping(r0, r3, r5)
            return
        L1c:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "TYPE_PING streamId != 0"
            r2.<init>(r3)
            throw r2
        L24:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r4 = "TYPE_PING length != 8: "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r3)
            r2.<init>(r3)
            throw r2
    }

    private final void readPriority(okhttp3.internal.http2.Http2Reader.Handler r6, int r7) throws java.io.IOException {
            r5 = this;
            okio.BufferedSource r0 = r5.source
            int r0 = r0.readInt()
            r1 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r2 = (int) r1
            r1 = r0 & r2
            r2 = 1
            if (r1 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r3
            okio.BufferedSource r3 = r5.source
            byte r3 = r3.readByte()
            r4 = 255(0xff, float:3.57E-43)
            int r3 = okhttp3.internal.Util.and(r3, r4)
            int r3 = r3 + r2
            r6.priority(r7, r0, r3, r1)
            return
    }

    private final void readPriority(okhttp3.internal.http2.Http2Reader.Handler r1, int r2, int r3, int r4) throws java.io.IOException {
            r0 = this;
            r3 = 5
            if (r2 != r3) goto L11
            if (r4 == 0) goto L9
            r0.readPriority(r1, r4)
            return
        L9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
            r1.<init>(r2)
            throw r1
        L11:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r3 = "TYPE_PRIORITY length: "
            java.lang.String r4 = " != 5"
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r2, r4)
            r1.<init>(r2)
            throw r1
    }

    private final void readPushPromise(okhttp3.internal.http2.Http2Reader.Handler r4, int r5, int r6, int r7) throws java.io.IOException {
            r3 = this;
            if (r7 == 0) goto L2e
            r0 = r6 & 8
            if (r0 == 0) goto L13
            okio.BufferedSource r0 = r3.source
            byte r0 = r0.readByte()
            r1 = 255(0xff, float:3.57E-43)
            int r0 = okhttp3.internal.Util.and(r0, r1)
            goto L14
        L13:
            r0 = 0
        L14:
            okio.BufferedSource r1 = r3.source
            int r1 = r1.readInt()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r2
            okhttp3.internal.http2.Http2Reader$Companion r2 = okhttp3.internal.http2.Http2Reader.Companion
            int r5 = r5 + (-4)
            int r5 = r2.lengthWithoutPadding(r5, r6, r0)
            java.util.List r5 = r3.readHeaderBlock(r5, r0, r6, r7)
            r4.pushPromise(r7, r1, r5)
            return
        L2e:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            r4.<init>(r5)
            throw r4
    }

    private final void readRstStream(okhttp3.internal.http2.Http2Reader.Handler r1, int r2, int r3, int r4) throws java.io.IOException {
            r0 = this;
            r3 = 4
            if (r2 != r3) goto L2b
            if (r4 == 0) goto L23
            okio.BufferedSource r2 = r0.source
            int r2 = r2.readInt()
            okhttp3.internal.http2.ErrorCode$Companion r3 = okhttp3.internal.http2.ErrorCode.Companion
            okhttp3.internal.http2.ErrorCode r3 = r3.fromHttp2(r2)
            if (r3 == 0) goto L17
            r1.rstStream(r4, r3)
            return
        L17:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r3 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r2)
            r1.<init>(r2)
            throw r1
        L23:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM streamId == 0"
            r1.<init>(r2)
            throw r1
        L2b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r3 = "TYPE_RST_STREAM length: "
            java.lang.String r4 = " != 4"
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r2, r4)
            r1.<init>(r2)
            throw r1
    }

    private final void readSettings(okhttp3.internal.http2.Http2Reader.Handler r8, int r9, int r10, int r11) throws java.io.IOException {
            r7 = this;
            if (r11 != 0) goto La2
            r11 = 1
            r10 = r10 & r11
            if (r10 == 0) goto L14
            if (r9 != 0) goto Lc
            r8.ackSettings()
            return
        Lc:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r8.<init>(r9)
            throw r8
        L14:
            int r10 = r9 % 6
            if (r10 != 0) goto L96
            okhttp3.internal.http2.Settings r10 = new okhttp3.internal.http2.Settings
            r10.<init>()
            r0 = 0
            kotlin.ranges.IntRange r9 = kotlin.ranges.RangesKt.until(r0, r9)
            r1 = 6
            kotlin.ranges.IntProgression r9 = kotlin.ranges.RangesKt.step(r9, r1)
            int r1 = r9.getFirst()
            int r2 = r9.getLast()
            int r9 = r9.getStep()
            if (r9 < 0) goto L38
            if (r1 > r2) goto L92
            goto L3a
        L38:
            if (r1 < r2) goto L92
        L3a:
            okio.BufferedSource r3 = r7.source
            short r3 = r3.readShort()
            r4 = 65535(0xffff, float:9.1834E-41)
            int r3 = okhttp3.internal.Util.and(r3, r4)
            okio.BufferedSource r4 = r7.source
            int r4 = r4.readInt()
            r5 = 2
            r6 = 4
            if (r3 == r5) goto L7e
            r5 = 3
            if (r3 == r5) goto L7c
            if (r3 == r6) goto L70
            r5 = 5
            if (r3 == r5) goto L5a
            goto L8b
        L5a:
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r5) goto L64
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r5) goto L64
            goto L8b
        L64:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9, r4)
            r8.<init>(r9)
            throw r8
        L70:
            r3 = 7
            if (r4 < 0) goto L74
            goto L8b
        L74:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r8.<init>(r9)
            throw r8
        L7c:
            r3 = 4
            goto L8b
        L7e:
            if (r4 == 0) goto L8b
            if (r4 != r11) goto L83
            goto L8b
        L83:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r8.<init>(r9)
            throw r8
        L8b:
            r10.set(r3, r4)
            if (r1 == r2) goto L92
            int r1 = r1 + r9
            goto L3a
        L92:
            r8.settings(r0, r10)
            return
        L96:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r10 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r10, r9)
            r8.<init>(r9)
            throw r8
        La2:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "TYPE_SETTINGS streamId != 0"
            r8.<init>(r9)
            throw r8
    }

    private final void readWindowUpdate(okhttp3.internal.http2.Http2Reader.Handler r4, int r5, int r6, int r7) throws java.io.IOException {
            r3 = this;
            r6 = 4
            if (r5 != r6) goto L23
            okio.BufferedSource r5 = r3.source
            int r5 = r5.readInt()
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r5 = okhttp3.internal.Util.and(r5, r0)
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto L1a
            r4.windowUpdate(r7, r5)
            return
        L1a:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "windowSizeIncrement was 0"
            r4.<init>(r5)
            throw r4
        L23:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r6 = "TYPE_WINDOW_UPDATE length !=4: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r5)
            r4.<init>(r5)
            throw r4
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            r0.close()
            return
    }

    public final boolean nextFrame(boolean r12, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Reader.Handler r13) throws java.io.IOException {
            r11 = this;
            java.lang.String r0 = "handler"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            okio.BufferedSource r0 = r11.source     // Catch: java.io.EOFException -> La9
            r1 = 9
            r0.require(r1)     // Catch: java.io.EOFException -> La9
            okio.BufferedSource r0 = r11.source
            int r0 = okhttp3.internal.Util.readMedium(r0)
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r0 > r1) goto L9d
            okio.BufferedSource r1 = r11.source
            byte r1 = r1.readByte()
            r2 = 255(0xff, float:3.57E-43)
            int r7 = okhttp3.internal.Util.and(r1, r2)
            okio.BufferedSource r1 = r11.source
            byte r1 = r1.readByte()
            int r8 = okhttp3.internal.Util.and(r1, r2)
            okio.BufferedSource r1 = r11.source
            int r1 = r1.readInt()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r9 = r1 & r2
            java.util.logging.Logger r10 = okhttp3.internal.http2.Http2Reader.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r10.isLoggable(r1)
            if (r1 == 0) goto L4f
            okhttp3.internal.http2.Http2 r1 = okhttp3.internal.http2.Http2.INSTANCE
            r2 = 1
            r3 = r9
            r4 = r0
            r5 = r7
            r6 = r8
            java.lang.String r1 = r1.frameLog(r2, r3, r4, r5, r6)
            r10.fine(r1)
        L4f:
            if (r12 == 0) goto L6e
            r12 = 4
            if (r7 != r12) goto L55
            goto L6e
        L55:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "Expected a SETTINGS frame but was "
            java.lang.StringBuilder r13 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r13)
            okhttp3.internal.http2.Http2 r0 = okhttp3.internal.http2.Http2.INSTANCE
            java.lang.String r0 = r0.formattedType$okhttp(r7)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L6e:
            switch(r7) {
                case 0: goto L98;
                case 1: goto L94;
                case 2: goto L90;
                case 3: goto L8c;
                case 4: goto L88;
                case 5: goto L84;
                case 6: goto L80;
                case 7: goto L7c;
                case 8: goto L78;
                default: goto L71;
            }
        L71:
            okio.BufferedSource r12 = r11.source
            long r0 = (long) r0
            r12.skip(r0)
            goto L9b
        L78:
            r11.readWindowUpdate(r13, r0, r8, r9)
            goto L9b
        L7c:
            r11.readGoAway(r13, r0, r8, r9)
            goto L9b
        L80:
            r11.readPing(r13, r0, r8, r9)
            goto L9b
        L84:
            r11.readPushPromise(r13, r0, r8, r9)
            goto L9b
        L88:
            r11.readSettings(r13, r0, r8, r9)
            goto L9b
        L8c:
            r11.readRstStream(r13, r0, r8, r9)
            goto L9b
        L90:
            r11.readPriority(r13, r0, r8, r9)
            goto L9b
        L94:
            r11.readHeaders(r13, r0, r8, r9)
            goto L9b
        L98:
            r11.readData(r13, r0, r8, r9)
        L9b:
            r12 = 1
            return r12
        L9d:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "FRAME_SIZE_ERROR: "
            java.lang.String r13 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r13, r0)
            r12.<init>(r13)
            throw r12
        La9:
            r12 = 0
            return r12
    }

    public final void readConnectionPreface(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Reader.Handler r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "handler"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r5.client
            r1 = 1
            if (r0 == 0) goto L19
            boolean r6 = r5.nextFrame(r1, r6)
            if (r6 == 0) goto L11
            goto L52
        L11:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "Required SETTINGS preface not received"
            r6.<init>(r0)
            throw r6
        L19:
            okio.BufferedSource r6 = r5.source
            okio.ByteString r0 = okhttp3.internal.http2.Http2.CONNECTION_PREFACE
            int r2 = r0.size()
            long r2 = (long) r2
            okio.ByteString r6 = r6.readByteString(r2)
            java.util.logging.Logger r2 = okhttp3.internal.http2.Http2Reader.logger
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            boolean r3 = r2.isLoggable(r3)
            if (r3 == 0) goto L4b
            java.lang.String r3 = "<< CONNECTION "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.String r4 = r6.hex()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r3 = okhttp3.internal.Util.format(r3, r4)
            r2.fine(r3)
        L4b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            r0 = r0 ^ r1
            if (r0 != 0) goto L53
        L52:
            return
        L53:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Expected a connection header but was "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r6 = r6.utf8()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }
}
