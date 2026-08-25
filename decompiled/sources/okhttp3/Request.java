package okhttp3;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001*BA\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\u0010\rJ\u000f\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u001fJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050 2\u0006\u0010\u001e\u001a\u00020\u0005J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b!J\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u0004\u0018\u00010\u0001J#\u0010$\u001a\u0004\u0018\u0001H%\"\u0004\b\u0000\u0010%2\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u0002H%0\f¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0005H\u0016J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b)R\u0015\u0010\b\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0017R$\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001a¨\u0006+"}, d2 = {"Lokhttp3/Request;", "", "url", "Lokhttp3/HttpUrl;", "method", "", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "tags", "", "Ljava/lang/Class;", "(Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/RequestBody;Ljava/util/Map;)V", "()Lokhttp3/RequestBody;", "cacheControl", "Lokhttp3/CacheControl;", "()Lokhttp3/CacheControl;", "()Lokhttp3/Headers;", "isHttps", "", "()Z", "lazyCacheControl", "()Ljava/lang/String;", "getTags$okhttp", "()Ljava/util/Map;", "()Lokhttp3/HttpUrl;", "-deprecated_body", "-deprecated_cacheControl", "header", "name", "-deprecated_headers", "", "-deprecated_method", "newBuilder", "Lokhttp3/Request$Builder;", "tag", "T", "type", "(Ljava/lang/Class;)Ljava/lang/Object;", "toString", "-deprecated_url", "Builder", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Request {

    @org.jetbrains.annotations.Nullable
    private final okhttp3.RequestBody body;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Headers headers;
    private okhttp3.CacheControl lazyCacheControl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String method;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.Class<?>, java.lang.Object> tags;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.HttpUrl url;

    /* JADX INFO: compiled from: Request.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*H\u0016J\u0014\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0017J\b\u0010,\u001a\u00020\u0000H\u0016J\b\u0010-\u001a\u00020\u0000H\u0016J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020/H\u0016J\u001a\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00101\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00102\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00103\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0013H\u0016J-\u00104\u001a\u00020\u0000\"\u0004\b\u0000\u001052\u000e\u00106\u001a\n\u0012\u0006\b\u0000\u0012\u0002H50\u001a2\b\u00104\u001a\u0004\u0018\u0001H5H\u0016¢\u0006\u0002\u00107J\u0012\u00104\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u000208H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0018\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u0004\u0012\u00020\u00010\u0019X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00069"}, d2 = {"Lokhttp3/Request$Builder;", "", "()V", "request", "Lokhttp3/Request;", "(Lokhttp3/Request;)V", "body", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "headers", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "method", "", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "tags", "", "Ljava/lang/Class;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "url", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "addHeader", "name", "value", "build", "cacheControl", "Lokhttp3/CacheControl;", "delete", "get", "head", "header", "Lokhttp3/Headers;", "patch", "post", "put", "removeHeader", "tag", "T", "type", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Ljava/net/URL;", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static class Builder {

        @org.jetbrains.annotations.Nullable
        private okhttp3.RequestBody body;

        @org.jetbrains.annotations.NotNull
        private okhttp3.Headers.Builder headers;

        @org.jetbrains.annotations.NotNull
        private java.lang.String method;

        @org.jetbrains.annotations.NotNull
        private java.util.Map<java.lang.Class<?>, java.lang.Object> tags;

        @org.jetbrains.annotations.Nullable
        private okhttp3.HttpUrl url;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r1.tags = r0
                java.lang.String r0 = "GET"
                r1.method = r0
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                r1.headers = r0
                return
        }

        public Builder(@org.jetbrains.annotations.NotNull okhttp3.Request r2) {
                r1 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r1.tags = r0
                okhttp3.HttpUrl r0 = r2.url()
                r1.url = r0
                java.lang.String r0 = r2.method()
                r1.method = r0
                okhttp3.RequestBody r0 = r2.body()
                r1.body = r0
                java.util.Map r0 = r2.getTags$okhttp()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L31
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                goto L39
            L31:
                java.util.Map r0 = r2.getTags$okhttp()
                java.util.Map r0 = kotlin.collections.MapsKt.toMutableMap(r0)
            L39:
                r1.tags = r0
                okhttp3.Headers r2 = r2.headers()
                okhttp3.Headers$Builder r2 = r2.newBuilder()
                r1.headers = r2
                return
        }

        public static /* synthetic */ okhttp3.Request.Builder delete$default(okhttp3.Request.Builder r0, okhttp3.RequestBody r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Ld
                r2 = r2 & 1
                if (r2 == 0) goto L8
                okhttp3.RequestBody r1 = okhttp3.internal.Util.EMPTY_REQUEST
            L8:
                okhttp3.Request$Builder r0 = r0.delete(r1)
                return r0
            Ld:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: delete"
                r0.<init>(r1)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder addHeader(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.Headers$Builder r0 = r1.headers
                r0.add(r2, r3)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request build() {
                r7 = this;
                okhttp3.HttpUrl r1 = r7.url
                if (r1 == 0) goto L1b
                java.lang.String r2 = r7.method
                okhttp3.Headers$Builder r0 = r7.headers
                okhttp3.Headers r3 = r0.build()
                okhttp3.RequestBody r4 = r7.body
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r7.tags
                java.util.Map r5 = okhttp3.internal.Util.toImmutableMap(r0)
                okhttp3.Request r6 = new okhttp3.Request
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
            L1b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "url == null"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder cacheControl(@org.jetbrains.annotations.NotNull okhttp3.CacheControl r3) {
                r2 = this;
                java.lang.String r0 = "cacheControl"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r3 = r3.toString()
                int r0 = r3.length()
                if (r0 != 0) goto L11
                r0 = 1
                goto L12
            L11:
                r0 = 0
            L12:
                java.lang.String r1 = "Cache-Control"
                if (r0 == 0) goto L1b
                okhttp3.Request$Builder r3 = r2.removeHeader(r1)
                goto L1f
            L1b:
                okhttp3.Request$Builder r3 = r2.header(r1, r3)
            L1f:
                return r3
        }

        @kotlin.jvm.JvmOverloads
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Request.Builder delete() {
                r2 = this;
                r0 = 0
                r1 = 1
                okhttp3.Request$Builder r0 = delete$default(r2, r0, r1, r0)
                return r0
        }

        @kotlin.jvm.JvmOverloads
        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder delete(@org.jetbrains.annotations.Nullable okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "DELETE"
                okhttp3.Request$Builder r2 = r1.method(r0, r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder get() {
                r2 = this;
                java.lang.String r0 = "GET"
                r1 = 0
                okhttp3.Request$Builder r0 = r2.method(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.RequestBody getBody$okhttp() {
                r1 = this;
                okhttp3.RequestBody r0 = r1.body
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder getHeaders$okhttp() {
                r1 = this;
                okhttp3.Headers$Builder r0 = r1.headers
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMethod$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.method
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.Class<?>, java.lang.Object> getTags$okhttp() {
                r1 = this;
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.tags
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.HttpUrl getUrl$okhttp() {
                r1 = this;
                okhttp3.HttpUrl r0 = r1.url
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder head() {
                r2 = this;
                java.lang.String r0 = "HEAD"
                r1 = 0
                okhttp3.Request$Builder r0 = r2.method(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder header(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.Headers$Builder r0 = r1.headers
                r0.set(r2, r3)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder headers(@org.jetbrains.annotations.NotNull okhttp3.Headers r2) {
                r1 = this;
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.Headers$Builder r2 = r2.newBuilder()
                r1.headers = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder method(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable okhttp3.RequestBody r4) {
                r2 = this;
                java.lang.String r0 = "method"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                int r0 = r3.length()
                if (r0 <= 0) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                if (r0 == 0) goto L48
                java.lang.String r0 = "method "
                if (r4 != 0) goto L2d
                boolean r1 = okhttp3.internal.http.HttpMethod.requiresRequestBody(r3)
                r1 = r1 ^ 1
                if (r1 == 0) goto L1d
                goto L33
            L1d:
                java.lang.String r4 = " must have a request body."
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3, r4)
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
            L2d:
                boolean r1 = okhttp3.internal.http.HttpMethod.permitsRequestBody(r3)
                if (r1 == 0) goto L38
            L33:
                r2.method = r3
                r2.body = r4
                return r2
            L38:
                java.lang.String r4 = " must not have a request body."
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3, r4)
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
            L48:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "method.isEmpty() == true"
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder patch(@org.jetbrains.annotations.NotNull okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "body"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "PATCH"
                okhttp3.Request$Builder r2 = r1.method(r0, r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder post(@org.jetbrains.annotations.NotNull okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "body"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "POST"
                okhttp3.Request$Builder r2 = r1.method(r0, r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder put(@org.jetbrains.annotations.NotNull okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "body"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "PUT"
                okhttp3.Request$Builder r2 = r1.method(r0, r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder removeHeader(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.Headers$Builder r0 = r1.headers
                r0.removeAll(r2)
                return r1
        }

        public final void setBody$okhttp(@org.jetbrains.annotations.Nullable okhttp3.RequestBody r1) {
                r0 = this;
                r0.body = r1
                return
        }

        public final void setHeaders$okhttp(@org.jetbrains.annotations.NotNull okhttp3.Headers.Builder r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.headers = r2
                return
        }

        public final void setMethod$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.method = r2
                return
        }

        public final void setTags$okhttp(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Class<?>, java.lang.Object> r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.tags = r2
                return
        }

        public final void setUrl$okhttp(@org.jetbrains.annotations.Nullable okhttp3.HttpUrl r1) {
                r0 = this;
                r0.url = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public <T> okhttp3.Request.Builder tag(@org.jetbrains.annotations.NotNull java.lang.Class<? super T> r2, @org.jetbrains.annotations.Nullable T r3) {
                r1 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                if (r3 != 0) goto Le
                java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = r1.tags
                r3.remove(r2)
                goto L29
            Le:
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.tags
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L1d
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r1.tags = r0
            L1d:
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.tags
                java.lang.Object r3 = r2.cast(r3)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                r0.put(r2, r3)
            L29:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder tag(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
                r1 = this;
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                okhttp3.Request$Builder r2 = r1.tag(r0, r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder url(@org.jetbrains.annotations.NotNull java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "ws:"
                boolean r0 = kotlin.text.StringsKt.startsWith(r4, r0)
                java.lang.String r1 = "(this as java.lang.String).substring(startIndex)"
                if (r0 == 0) goto L27
                java.lang.String r0 = "http:"
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                r2 = 3
                java.lang.String r4 = r4.substring(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                goto L45
            L27:
                java.lang.String r0 = "wss:"
                boolean r0 = kotlin.text.StringsKt.startsWith(r4, r0)
                if (r0 == 0) goto L45
                java.lang.String r0 = "https:"
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                r2 = 4
                java.lang.String r4 = r4.substring(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
            L45:
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                okhttp3.HttpUrl r4 = r0.get(r4)
                okhttp3.Request$Builder r4 = r3.url(r4)
                return r4
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder url(@org.jetbrains.annotations.NotNull java.net.URL r3) {
                r2 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                java.lang.String r3 = r3.toString()
                java.lang.String r1 = "url.toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
                okhttp3.HttpUrl r3 = r0.get(r3)
                okhttp3.Request$Builder r3 = r2.url(r3)
                return r3
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder url(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r2) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.url = r2
                return r1
        }
    }

    public Request(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull okhttp3.Headers r4, @org.jetbrains.annotations.Nullable okhttp3.RequestBody r5, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.Class<?>, ? extends java.lang.Object> r6) {
            r1 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "tags"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r1.<init>()
            r1.url = r2
            r1.method = r3
            r1.headers = r4
            r1.body = r5
            r1.tags = r6
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "body", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_body")
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
    public final okhttp3.RequestBody m1991deprecated_body() {
            r1 = this;
            okhttp3.RequestBody r0 = r1.body
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cacheControl", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_cacheControl")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final okhttp3.CacheControl m1992deprecated_cacheControl() {
            r1 = this;
            okhttp3.CacheControl r0 = r1.cacheControl()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "headers", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_headers")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
    public final okhttp3.Headers m1993deprecated_headers() {
            r1 = this;
            okhttp3.Headers r0 = r1.headers
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "method", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_method")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_method, reason: not valid java name */
    public final java.lang.String m1994deprecated_method() {
            r1 = this;
            java.lang.String r0 = r1.method
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "url", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_url")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final okhttp3.HttpUrl m1995deprecated_url() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.url
            return r0
    }

    @kotlin.jvm.JvmName(name = "body")
    @org.jetbrains.annotations.Nullable
    public final okhttp3.RequestBody body() {
            r1 = this;
            okhttp3.RequestBody r0 = r1.body
            return r0
    }

    @kotlin.jvm.JvmName(name = "cacheControl")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.CacheControl cacheControl() {
            r2 = this;
            okhttp3.CacheControl r0 = r2.lazyCacheControl
            if (r0 != 0) goto Le
            okhttp3.CacheControl$Companion r0 = okhttp3.CacheControl.Companion
            okhttp3.Headers r1 = r2.headers
            okhttp3.CacheControl r0 = r0.parse(r1)
            r2.lazyCacheControl = r0
        Le:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.Class<?>, java.lang.Object> getTags$okhttp() {
            r1 = this;
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.tags
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String header(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.Headers r0 = r1.headers
            java.lang.String r2 = r0.get(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> headers(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.Headers r0 = r1.headers
            java.util.List r2 = r0.values(r2)
            return r2
    }

    @kotlin.jvm.JvmName(name = "headers")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.Headers headers() {
            r1 = this;
            okhttp3.Headers r0 = r1.headers
            return r0
    }

    public final boolean isHttps() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.url
            boolean r0 = r0.isHttps()
            return r0
    }

    @kotlin.jvm.JvmName(name = "method")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String method() {
            r1 = this;
            java.lang.String r0 = r1.method
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Request.Builder newBuilder() {
            r1 = this;
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object tag() {
            r1 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object r0 = r1.tag(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final <T> T tag(@org.jetbrains.annotations.NotNull java.lang.Class<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.tags
            java.lang.Object r0 = r0.get(r2)
            java.lang.Object r2 = r2.cast(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = "Request{method="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r6.method
            r0.append(r1)
            java.lang.String r1 = ", url="
            r0.append(r1)
            okhttp3.HttpUrl r1 = r6.url
            r0.append(r1)
            okhttp3.Headers r1 = r6.headers
            int r1 = r1.size()
            if (r1 == 0) goto L5b
            java.lang.String r1 = ", headers=["
            r0.append(r1)
            okhttp3.Headers r1 = r6.headers
            r2 = 0
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r1.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L3a
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L3a:
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r5 = r3.component1()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.component2()
            java.lang.String r3 = (java.lang.String) r3
            if (r2 <= 0) goto L4f
            java.lang.String r2 = ", "
            r0.append(r2)
        L4f:
            r2 = 58
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5, r2, r3)
            r2 = r4
            goto L29
        L56:
            r1 = 93
            r0.append(r1)
        L5b:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r6.tags
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L6f
            java.lang.String r1 = ", tags="
            r0.append(r1)
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r6.tags
            r0.append(r1)
        L6f:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "url")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.HttpUrl url() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.url
            return r0
    }
}
