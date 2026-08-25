package okhttp3;

/* JADX INFO: compiled from: ResponseBody.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J@\u0010\u0010\u001a\u0002H\u0011\"\b\b\u0000\u0010\u0011*\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002H\u00110\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00020\u00170\u0014H\u0082\b¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH&J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J\b\u0010\u001d\u001a\u00020\u0015H&J\u0006\u0010\u001e\u001a\u00020\u001fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "()V", "reader", "Ljava/io/Reader;", "byteStream", "Ljava/io/InputStream;", "byteString", "Lokio/ByteString;", "bytes", "", "charStream", "charset", "Ljava/nio/charset/Charset;", "close", "", "consumeSource", "T", "", "consumer", "Lkotlin/Function1;", "Lokio/BufferedSource;", "sizeMapper", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "source", "string", "", "BomAwareReader", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public abstract class ResponseBody implements java.io.Closeable {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody.Companion Companion = null;
    private java.io.Reader reader;

    /* JADX INFO: compiled from: ResponseBody.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "source", "Lokio/BufferedSource;", "charset", "Ljava/nio/charset/Charset;", "(Lokio/BufferedSource;Ljava/nio/charset/Charset;)V", "closed", "", "delegate", "close", "", "read", "", "cbuf", "", "off", "len", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class BomAwareReader extends java.io.Reader {
        private final java.nio.charset.Charset charset;
        private boolean closed;
        private java.io.Reader delegate;
        private final okio.BufferedSource source;

        public BomAwareReader(@org.jetbrains.annotations.NotNull okio.BufferedSource r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
                r1 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "charset"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.<init>()
                r1.source = r2
                r1.charset = r3
                return
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                r0 = 1
                r1.closed = r0
                java.io.Reader r0 = r1.delegate
                if (r0 == 0) goto Lb
                r0.close()
                goto L10
            Lb:
                okio.BufferedSource r0 = r1.source
                r0.close()
            L10:
                return
        }

        @Override // java.io.Reader
        public int read(@org.jetbrains.annotations.NotNull char[] r5, int r6, int r7) throws java.io.IOException {
                r4 = this;
                java.lang.String r0 = "cbuf"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                boolean r0 = r4.closed
                if (r0 != 0) goto L28
                java.io.Reader r0 = r4.delegate
                if (r0 == 0) goto Le
                goto L23
            Le:
                java.io.InputStreamReader r0 = new java.io.InputStreamReader
                okio.BufferedSource r1 = r4.source
                java.io.InputStream r1 = r1.inputStream()
                okio.BufferedSource r2 = r4.source
                java.nio.charset.Charset r3 = r4.charset
                java.nio.charset.Charset r2 = okhttp3.internal.Util.readBomAsCharset(r2, r3)
                r0.<init>(r1, r2)
                r4.delegate = r0
            L23:
                int r5 = r0.read(r5, r6, r7)
                return r5
            L28:
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r6 = "Stream closed"
                r5.<init>(r6)
                throw r5
        }
    }

    /* JADX INFO: compiled from: ResponseBody.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\fH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0007J'\u0010\u000e\u001a\u00020\u0004*\u00020\u000b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0010"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "()V", "create", "Lokhttp3/ResponseBody;", "contentType", "Lokhttp3/MediaType;", "content", "", "contentLength", "", "Lokio/BufferedSource;", "", "Lokio/ByteString;", "asResponseBody", "toResponseBody", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion r0, java.lang.String r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okhttp3.ResponseBody r0 = r0.create(r1, r2)
                return r0
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion r0, okio.BufferedSource r1, okhttp3.MediaType r2, long r3, int r5, java.lang.Object r6) {
                r6 = r5 & 1
                if (r6 == 0) goto L5
                r2 = 0
            L5:
                r5 = r5 & 2
                if (r5 == 0) goto Lb
                r3 = -1
            Lb:
                okhttp3.ResponseBody r0 = r0.create(r1, r2, r3)
                return r0
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion r0, okio.ByteString r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okhttp3.ResponseBody r0 = r0.create(r1, r2)
                return r0
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion r0, byte[] r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okhttp3.ResponseBody r0 = r0.create(r1, r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "create")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ResponseBody create(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.Nullable okhttp3.MediaType r5) {
                r3 = this;
                java.lang.String r0 = "$this$toResponseBody"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
                if (r5 == 0) goto L2a
                r1 = 1
                r2 = 0
                java.nio.charset.Charset r1 = okhttp3.MediaType.charset$default(r5, r2, r1, r2)
                if (r1 != 0) goto L29
                okhttp3.MediaType$Companion r1 = okhttp3.MediaType.Companion
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r5)
                java.lang.String r5 = "; charset=utf-8"
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                okhttp3.MediaType r5 = r1.parse(r5)
                goto L2a
            L29:
                r0 = r1
            L2a:
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                okio.Buffer r4 = r1.writeString(r4, r0)
                long r0 = r4.size()
                okhttp3.ResponseBody r4 = r3.create(r4, r5, r0)
                return r4
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ResponseBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r2, long r3, @org.jetbrains.annotations.NotNull okio.BufferedSource r5) {
                r1 = this;
                java.lang.String r0 = "content"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                okhttp3.ResponseBody r2 = r1.create(r5, r2, r3)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ResponseBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "content"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.ResponseBody r2 = r1.create(r3, r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ResponseBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r2, @org.jetbrains.annotations.NotNull okio.ByteString r3) {
                r1 = this;
                java.lang.String r0 = "content"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.ResponseBody r2 = r1.create(r3, r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ResponseBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r2, @org.jetbrains.annotations.NotNull byte[] r3) {
                r1 = this;
                java.lang.String r0 = "content"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.ResponseBody r2 = r1.create(r3, r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "create")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ResponseBody create(@org.jetbrains.annotations.NotNull okio.BufferedSource r2, @org.jetbrains.annotations.Nullable okhttp3.MediaType r3, long r4) {
                r1 = this;
                java.lang.String r0 = "$this$asResponseBody"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.ResponseBody$Companion$asResponseBody$1 r0 = new okhttp3.ResponseBody$Companion$asResponseBody$1
                r0.<init>(r2, r3, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "create")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ResponseBody create(@org.jetbrains.annotations.NotNull okio.ByteString r4, @org.jetbrains.annotations.Nullable okhttp3.MediaType r5) {
                r3 = this;
                java.lang.String r0 = "$this$toResponseBody"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                okio.Buffer r0 = r0.write(r4)
                int r4 = r4.size()
                long r1 = (long) r4
                okhttp3.ResponseBody r4 = r3.create(r0, r5, r1)
                return r4
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "create")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ResponseBody create(@org.jetbrains.annotations.NotNull byte[] r4, @org.jetbrains.annotations.Nullable okhttp3.MediaType r5) {
                r3 = this;
                java.lang.String r0 = "$this$toResponseBody"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                okio.Buffer r0 = r0.write(r4)
                int r4 = r4.length
                long r1 = (long) r4
                okhttp3.ResponseBody r4 = r3.create(r0, r5, r1)
                return r4
        }
    }

    static {
            okhttp3.ResponseBody$Companion r0 = new okhttp3.ResponseBody$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.ResponseBody.Companion = r0
            return
    }

    public ResponseBody() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.nio.charset.Charset charset() {
            r2 = this;
            okhttp3.MediaType r0 = r2.contentType()
            if (r0 == 0) goto Lf
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            java.nio.charset.Charset r0 = r0.charset(r1)
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
        L11:
            return r0
    }

    private final <T> T consumeSource(kotlin.jvm.functions.Function1<? super okio.BufferedSource, ? extends T> r6, kotlin.jvm.functions.Function1<? super T, java.lang.Integer> r7) {
            r5 = this;
            long r0 = r5.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L67
            okio.BufferedSource r2 = r5.source()
            r3 = 0
            r4 = 1
            java.lang.Object r6 = r6.invoke(r2)     // Catch: java.lang.Throwable -> L5a
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            kotlin.io.CloseableKt.closeFinally(r2, r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L59
            long r2 = (long) r7
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L35
            goto L59
        L35:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Content-Length ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") and stream length ("
            r2.append(r0)
            r2.append(r7)
            java.lang.String r7 = ") disagree"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r6.<init>(r7)
            throw r6
        L59:
            return r6
        L5a:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L5c
        L5c:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            kotlin.io.CloseableKt.closeFinally(r2, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            throw r7
        L67:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Cannot buffer entire body for content length: "
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7, r0)
            r6.<init>(r7)
            throw r6
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "create")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody create(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable okhttp3.MediaType r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r1, long r2, @org.jetbrains.annotations.NotNull okio.BufferedSource r4) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2, r4)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r1, @org.jetbrains.annotations.NotNull okio.ByteString r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r1, @org.jetbrains.annotations.NotNull byte[] r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "create")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody create(@org.jetbrains.annotations.NotNull okio.BufferedSource r1, @org.jetbrains.annotations.Nullable okhttp3.MediaType r2, long r3) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2, r3)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "create")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody create(@org.jetbrains.annotations.NotNull okio.ByteString r1, @org.jetbrains.annotations.Nullable okhttp3.MediaType r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "create")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody create(@org.jetbrains.annotations.NotNull byte[] r1, @org.jetbrains.annotations.Nullable okhttp3.MediaType r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.io.InputStream byteStream() {
            r1 = this;
            okio.BufferedSource r0 = r1.source()
            java.io.InputStream r0 = r0.inputStream()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString byteString() throws java.io.IOException {
            r7 = this;
            long r0 = r7.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L54
            okio.BufferedSource r2 = r7.source()
            r3 = 0
            okio.ByteString r4 = r2.readByteString()     // Catch: java.lang.Throwable -> L4d
            kotlin.io.CloseableKt.closeFinally(r2, r3)
            int r2 = r4.size()
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L4c
            long r5 = (long) r2
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L28
            goto L4c
        L28:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L4c:
            return r4
        L4d:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L4f
        L4f:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r0)
            throw r1
        L54:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Cannot buffer entire body for content length: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0)
            r2.<init>(r0)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public final byte[] bytes() throws java.io.IOException {
            r7 = this;
            long r0 = r7.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L51
            okio.BufferedSource r2 = r7.source()
            r3 = 0
            byte[] r4 = r2.readByteArray()     // Catch: java.lang.Throwable -> L4a
            kotlin.io.CloseableKt.closeFinally(r2, r3)
            int r2 = r4.length
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L49
            long r5 = (long) r2
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L25
            goto L49
        L25:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L49:
            return r4
        L4a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L4c
        L4c:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r0)
            throw r1
        L51:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Cannot buffer entire body for content length: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0)
            r2.<init>(r0)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.io.Reader charStream() {
            r3 = this;
            java.io.Reader r0 = r3.reader
            if (r0 == 0) goto L5
            goto L14
        L5:
            okhttp3.ResponseBody$BomAwareReader r0 = new okhttp3.ResponseBody$BomAwareReader
            okio.BufferedSource r1 = r3.source()
            java.nio.charset.Charset r2 = r3.charset()
            r0.<init>(r1, r2)
            r3.reader = r0
        L14:
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            okio.BufferedSource r0 = r1.source()
            okhttp3.internal.Util.closeQuietly(r0)
            return
    }

    public abstract long contentLength();

    @org.jetbrains.annotations.Nullable
    public abstract okhttp3.MediaType contentType();

    @org.jetbrains.annotations.NotNull
    public abstract okio.BufferedSource source();

    @org.jetbrains.annotations.NotNull
    public final java.lang.String string() throws java.io.IOException {
            r3 = this;
            okio.BufferedSource r0 = r3.source()
            java.nio.charset.Charset r1 = r3.charset()     // Catch: java.lang.Throwable -> L15
            java.nio.charset.Charset r1 = okhttp3.internal.Util.readBomAsCharset(r0, r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = r0.readString(r1)     // Catch: java.lang.Throwable -> L15
            r2 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            return r1
        L15:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            throw r2
    }
}
