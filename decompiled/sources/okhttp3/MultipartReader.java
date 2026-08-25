package okhttp3;

/* JADX INFO: compiled from: MultipartReader.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001c\u001d\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0018\u00010\u0010R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "response", "Lokhttp3/ResponseBody;", "(Lokhttp3/ResponseBody;)V", "source", "Lokio/BufferedSource;", "boundary", "", "(Lokio/BufferedSource;Ljava/lang/String;)V", "()Ljava/lang/String;", "closed", "", "crlfDashDashBoundary", "Lokio/ByteString;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "dashDashBoundary", "noMoreParts", "partCount", "", "close", "", "currentPartBytesRemaining", "", "maxResult", "nextPart", "Lokhttp3/MultipartReader$Part;", "Companion", "Part", "PartSource", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class MultipartReader implements java.io.Closeable {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MultipartReader.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final okio.Options afterBoundaryOptions = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String boundary;
    private boolean closed;
    private final okio.ByteString crlfDashDashBoundary;
    private okhttp3.MultipartReader.PartSource currentPart;
    private final okio.ByteString dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final okio.BufferedSource source;

    /* JADX INFO: compiled from: MultipartReader.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "()V", "afterBoundaryOptions", "Lokio/Options;", "getAfterBoundaryOptions", "()Lokio/Options;", "okhttp"}, k = 1, mv = {1, 4, 1})
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
        public final okio.Options getAfterBoundaryOptions() {
                r1 = this;
                okio.Options r0 = okhttp3.MultipartReader.access$getAfterBoundaryOptions$cp()
                return r0
        }
    }

    /* JADX INFO: compiled from: MultipartReader.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\nH\u0096\u0001R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "headers", "Lokhttp3/Headers;", "body", "Lokio/BufferedSource;", "(Lokhttp3/Headers;Lokio/BufferedSource;)V", "()Lokio/BufferedSource;", "()Lokhttp3/Headers;", "close", "", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Part implements java.io.Closeable {

        @org.jetbrains.annotations.NotNull
        private final okio.BufferedSource body;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.Headers headers;

        public Part(@org.jetbrains.annotations.NotNull okhttp3.Headers r2, @org.jetbrains.annotations.NotNull okio.BufferedSource r3) {
                r1 = this;
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "body"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.<init>()
                r1.headers = r2
                r1.body = r3
                return
        }

        @kotlin.jvm.JvmName(name = "body")
        @org.jetbrains.annotations.NotNull
        public final okio.BufferedSource body() {
                r1 = this;
                okio.BufferedSource r0 = r1.body
                return r0
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                okio.BufferedSource r0 = r1.body
                r0.close()
                return
        }

        @kotlin.jvm.JvmName(name = "headers")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers headers() {
                r1 = this;
                okhttp3.Headers r0 = r1.headers
                return r0
        }
    }

    /* JADX INFO: compiled from: MultipartReader.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\u0003\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lokio/Source;", "(Lokhttp3/MultipartReader;)V", "timeout", "Lokio/Timeout;", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "okhttp"}, k = 1, mv = {1, 4, 1})
    public final class PartSource implements okio.Source {
        public final /* synthetic */ okhttp3.MultipartReader this$0;
        private final okio.Timeout timeout;

        public PartSource(okhttp3.MultipartReader r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                okio.Timeout r1 = new okio.Timeout
                r1.<init>()
                r0.timeout = r1
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r2 = this;
                okhttp3.MultipartReader r0 = r2.this$0
                okhttp3.MultipartReader$PartSource r0 = okhttp3.MultipartReader.access$getCurrentPart$p(r0)
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r0 == 0) goto L12
                okhttp3.MultipartReader r0 = r2.this$0
                r1 = 0
                okhttp3.MultipartReader.access$setCurrentPart$p(r0, r1)
            L12:
                return
        }

        @Override // okio.Source
        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r12, long r13) {
                r11 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                r0 = 0
                int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r2 < 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r0 == 0) goto Le4
                okhttp3.MultipartReader r0 = r11.this$0
                okhttp3.MultipartReader$PartSource r0 = okhttp3.MultipartReader.access$getCurrentPart$p(r0)
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r11)
                if (r0 == 0) goto Ld8
                okhttp3.MultipartReader r0 = r11.this$0
                okio.BufferedSource r0 = okhttp3.MultipartReader.access$getSource$p(r0)
                okio.Timeout r0 = r0.timeout()
                okio.Timeout r1 = r11.timeout
                long r2 = r0.timeoutNanos()
                okio.Timeout$Companion r4 = okio.Timeout.Companion
                long r5 = r1.timeoutNanos()
                long r7 = r0.timeoutNanos()
                long r4 = r4.minTimeout(r5, r7)
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS
                r0.timeout(r4, r6)
                boolean r4 = r0.hasDeadline()
                if (r4 == 0) goto L95
                long r4 = r0.deadlineNanoTime()
                boolean r7 = r1.hasDeadline()
                if (r7 == 0) goto L5f
                long r7 = r0.deadlineNanoTime()
                long r9 = r1.deadlineNanoTime()
                long r7 = java.lang.Math.min(r7, r9)
                r0.deadlineNanoTime(r7)
            L5f:
                okhttp3.MultipartReader r7 = r11.this$0     // Catch: java.lang.Throwable -> L85
                long r13 = okhttp3.MultipartReader.access$currentPartBytesRemaining(r7, r13)     // Catch: java.lang.Throwable -> L85
                r7 = 0
                int r9 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r9 != 0) goto L6e
                r12 = -1
                goto L78
            L6e:
                okhttp3.MultipartReader r7 = r11.this$0     // Catch: java.lang.Throwable -> L85
                okio.BufferedSource r7 = okhttp3.MultipartReader.access$getSource$p(r7)     // Catch: java.lang.Throwable -> L85
                long r12 = r7.read(r12, r13)     // Catch: java.lang.Throwable -> L85
            L78:
                r0.timeout(r2, r6)
                boolean r14 = r1.hasDeadline()
                if (r14 == 0) goto L84
                r0.deadlineNanoTime(r4)
            L84:
                return r12
            L85:
                r12 = move-exception
                java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS
                r0.timeout(r2, r13)
                boolean r13 = r1.hasDeadline()
                if (r13 == 0) goto L94
                r0.deadlineNanoTime(r4)
            L94:
                throw r12
            L95:
                boolean r4 = r1.hasDeadline()
                if (r4 == 0) goto La2
                long r4 = r1.deadlineNanoTime()
                r0.deadlineNanoTime(r4)
            La2:
                okhttp3.MultipartReader r4 = r11.this$0     // Catch: java.lang.Throwable -> Lc8
                long r13 = okhttp3.MultipartReader.access$currentPartBytesRemaining(r4, r13)     // Catch: java.lang.Throwable -> Lc8
                r4 = 0
                int r7 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
                if (r7 != 0) goto Lb1
                r12 = -1
                goto Lbb
            Lb1:
                okhttp3.MultipartReader r4 = r11.this$0     // Catch: java.lang.Throwable -> Lc8
                okio.BufferedSource r4 = okhttp3.MultipartReader.access$getSource$p(r4)     // Catch: java.lang.Throwable -> Lc8
                long r12 = r4.read(r12, r13)     // Catch: java.lang.Throwable -> Lc8
            Lbb:
                r0.timeout(r2, r6)
                boolean r14 = r1.hasDeadline()
                if (r14 == 0) goto Lc7
                r0.clearDeadline()
            Lc7:
                return r12
            Lc8:
                r12 = move-exception
                java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS
                r0.timeout(r2, r13)
                boolean r13 = r1.hasDeadline()
                if (r13 == 0) goto Ld7
                r0.clearDeadline()
            Ld7:
                throw r12
            Ld8:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "closed"
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            Le4:
                java.lang.String r12 = "byteCount < 0: "
                java.lang.String r12 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r12, r13)
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r12.toString()
                r13.<init>(r12)
                throw r13
        }

        @Override // okio.Source
        @org.jetbrains.annotations.NotNull
        public okio.Timeout timeout() {
                r1 = this;
                okio.Timeout r0 = r1.timeout
                return r0
        }
    }

    static {
            okhttp3.MultipartReader$Companion r0 = new okhttp3.MultipartReader$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.MultipartReader.Companion = r0
            okio.Options$Companion r0 = okio.Options.Companion
            r1 = 4
            okio.ByteString[] r1 = new okio.ByteString[r1]
            okio.ByteString$Companion r2 = okio.ByteString.Companion
            java.lang.String r3 = "\r\n"
            okio.ByteString r3 = r2.encodeUtf8(r3)
            r4 = 0
            r1[r4] = r3
            java.lang.String r3 = "--"
            okio.ByteString r3 = r2.encodeUtf8(r3)
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = " "
            okio.ByteString r3 = r2.encodeUtf8(r3)
            r4 = 2
            r1[r4] = r3
            java.lang.String r3 = "\t"
            okio.ByteString r2 = r2.encodeUtf8(r3)
            r3 = 3
            r1[r3] = r2
            okio.Options r0 = r0.of(r1)
            okhttp3.MultipartReader.afterBoundaryOptions = r0
            return
    }

    public MultipartReader(@org.jetbrains.annotations.NotNull okhttp3.ResponseBody r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.BufferedSource r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L1c
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L1c
            r2.<init>(r0, r3)
            return
        L1c:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
    }

    public MultipartReader(@org.jetbrains.annotations.NotNull okio.BufferedSource r2, @org.jetbrains.annotations.NotNull java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "boundary"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.source = r2
            r1.boundary = r3
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            java.lang.String r0 = "--"
            okio.Buffer r2 = r2.writeUtf8(r0)
            okio.Buffer r2 = r2.writeUtf8(r3)
            okio.ByteString r2 = r2.readByteString()
            r1.dashDashBoundary = r2
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            java.lang.String r0 = "\r\n--"
            okio.Buffer r2 = r2.writeUtf8(r0)
            okio.Buffer r2 = r2.writeUtf8(r3)
            okio.ByteString r2 = r2.readByteString()
            r1.crlfDashDashBoundary = r2
            return
    }

    public static final /* synthetic */ long access$currentPartBytesRemaining(okhttp3.MultipartReader r0, long r1) {
            long r0 = r0.currentPartBytesRemaining(r1)
            return r0
    }

    public static final /* synthetic */ okio.Options access$getAfterBoundaryOptions$cp() {
            okio.Options r0 = okhttp3.MultipartReader.afterBoundaryOptions
            return r0
    }

    public static final /* synthetic */ okhttp3.MultipartReader.PartSource access$getCurrentPart$p(okhttp3.MultipartReader r0) {
            okhttp3.MultipartReader$PartSource r0 = r0.currentPart
            return r0
    }

    public static final /* synthetic */ okio.BufferedSource access$getSource$p(okhttp3.MultipartReader r0) {
            okio.BufferedSource r0 = r0.source
            return r0
    }

    public static final /* synthetic */ void access$setCurrentPart$p(okhttp3.MultipartReader r0, okhttp3.MultipartReader.PartSource r1) {
            r0.currentPart = r1
            return
    }

    private final long currentPartBytesRemaining(long r6) {
            r5 = this;
            okio.BufferedSource r0 = r5.source
            okio.ByteString r1 = r5.crlfDashDashBoundary
            int r1 = r1.size()
            long r1 = (long) r1
            r0.require(r1)
            okio.BufferedSource r0 = r5.source
            okio.Buffer r0 = r0.getBuffer()
            okio.ByteString r1 = r5.crlfDashDashBoundary
            long r0 = r0.indexOf(r1)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L38
            okio.BufferedSource r0 = r5.source
            okio.Buffer r0 = r0.getBuffer()
            long r0 = r0.size()
            okio.ByteString r2 = r5.crlfDashDashBoundary
            int r2 = r2.size()
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 1
            long r0 = r0 + r2
            long r6 = java.lang.Math.min(r6, r0)
            goto L3c
        L38:
            long r6 = java.lang.Math.min(r6, r0)
        L3c:
            return r6
    }

    @kotlin.jvm.JvmName(name = "boundary")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String boundary() {
            r1 = this;
            java.lang.String r0 = r1.boundary
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.closed = r0
            r0 = 0
            r1.currentPart = r0
            okio.BufferedSource r0 = r1.source
            r0.close()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.MultipartReader.Part nextPart() throws java.io.IOException {
            r7 = this;
            boolean r0 = r7.closed
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L9f
            boolean r0 = r7.noMoreParts
            r2 = 0
            if (r0 == 0) goto Lc
            return r2
        Lc:
            int r0 = r7.partCount
            r3 = 0
            if (r0 != 0) goto L29
            okio.BufferedSource r0 = r7.source
            okio.ByteString r5 = r7.dashDashBoundary
            boolean r0 = r0.rangeEquals(r3, r5)
            if (r0 == 0) goto L29
            okio.BufferedSource r0 = r7.source
            okio.ByteString r3 = r7.dashDashBoundary
            int r3 = r3.size()
            long r3 = (long) r3
            r0.skip(r3)
            goto L3f
        L29:
            r5 = 8192(0x2000, double:4.0474E-320)
            long r5 = r7.currentPartBytesRemaining(r5)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L99
            okio.BufferedSource r0 = r7.source
            okio.ByteString r3 = r7.crlfDashDashBoundary
            int r3 = r3.size()
            long r3 = (long) r3
            r0.skip(r3)
        L3f:
            r0 = 0
        L40:
            okio.BufferedSource r3 = r7.source
            okio.Options r4 = okhttp3.MultipartReader.afterBoundaryOptions
            int r3 = r3.select(r4)
            r4 = -1
            java.lang.String r5 = "unexpected characters after boundary"
            if (r3 == r4) goto L93
            if (r3 == 0) goto L72
            if (r3 == r1) goto L5b
            r4 = 2
            if (r3 == r4) goto L59
            r4 = 3
            if (r3 == r4) goto L59
            goto L40
        L59:
            r0 = 1
            goto L40
        L5b:
            if (r0 != 0) goto L6c
            int r0 = r7.partCount
            if (r0 == 0) goto L64
            r7.noMoreParts = r1
            return r2
        L64:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "expected at least 1 part"
            r0.<init>(r1)
            throw r0
        L6c:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r5)
            throw r0
        L72:
            int r0 = r7.partCount
            int r0 = r0 + r1
            r7.partCount = r0
            okhttp3.internal.http1.HeadersReader r0 = new okhttp3.internal.http1.HeadersReader
            okio.BufferedSource r1 = r7.source
            r0.<init>(r1)
            okhttp3.Headers r0 = r0.readHeaders()
            okhttp3.MultipartReader$PartSource r1 = new okhttp3.MultipartReader$PartSource
            r1.<init>(r7)
            r7.currentPart = r1
            okhttp3.MultipartReader$Part r2 = new okhttp3.MultipartReader$Part
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            r2.<init>(r0, r1)
            return r2
        L93:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r5)
            throw r0
        L99:
            okio.BufferedSource r0 = r7.source
            r0.skip(r5)
            goto L29
        L9f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
