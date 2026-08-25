package okhttp3.internal.cache;

/* JADX INFO: compiled from: CacheInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/Interceptor;", "cache", "Lokhttp3/Cache;", "(Lokhttp3/Cache;)V", "getCache$okhttp", "()Lokhttp3/Cache;", "cacheWritingResponse", "Lokhttp3/Response;", "cacheRequest", "Lokhttp3/internal/cache/CacheRequest;", "response", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class CacheInterceptor implements okhttp3.Interceptor {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.cache.CacheInterceptor.Companion Companion = null;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.Cache cache;

    /* JADX INFO: compiled from: CacheInterceptor.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", "", "()V", "combine", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "isContentSpecificHeader", "", "fieldName", "", "isEndToEnd", "stripBody", "Lokhttp3/Response;", "response", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        public static final /* synthetic */ okhttp3.Headers access$combine(okhttp3.internal.cache.CacheInterceptor.Companion r0, okhttp3.Headers r1, okhttp3.Headers r2) {
                okhttp3.Headers r0 = r0.combine(r1, r2)
                return r0
        }

        public static final /* synthetic */ okhttp3.Response access$stripBody(okhttp3.internal.cache.CacheInterceptor.Companion r0, okhttp3.Response r1) {
                okhttp3.Response r0 = r0.stripBody(r1)
                return r0
        }

        private final okhttp3.Headers combine(okhttp3.Headers r8, okhttp3.Headers r9) {
                r7 = this;
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                int r1 = r8.size()
                r2 = 0
                r3 = 0
            Lb:
                if (r3 >= r1) goto L3e
                java.lang.String r4 = r8.name(r3)
                java.lang.String r5 = r8.value(r3)
                java.lang.String r6 = "Warning"
                boolean r6 = kotlin.text.StringsKt.equals(r6, r4)
                if (r6 == 0) goto L26
                java.lang.String r6 = "1"
                boolean r6 = kotlin.text.StringsKt.startsWith$default(r5, r6)
                if (r6 == 0) goto L26
                goto L3b
            L26:
                boolean r6 = r7.isContentSpecificHeader(r4)
                if (r6 != 0) goto L38
                boolean r6 = r7.isEndToEnd(r4)
                if (r6 == 0) goto L38
                java.lang.String r6 = r9.get(r4)
                if (r6 != 0) goto L3b
            L38:
                r0.addLenient$okhttp(r4, r5)
            L3b:
                int r3 = r3 + 1
                goto Lb
            L3e:
                int r8 = r9.size()
            L42:
                if (r2 >= r8) goto L5e
                java.lang.String r1 = r9.name(r2)
                boolean r3 = r7.isContentSpecificHeader(r1)
                if (r3 != 0) goto L5b
                boolean r3 = r7.isEndToEnd(r1)
                if (r3 == 0) goto L5b
                java.lang.String r3 = r9.value(r2)
                r0.addLenient$okhttp(r1, r3)
            L5b:
                int r2 = r2 + 1
                goto L42
            L5e:
                okhttp3.Headers r8 = r0.build()
                return r8
        }

        private final boolean isContentSpecificHeader(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Content-Length"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r2)
                if (r0 != 0) goto L1b
                java.lang.String r0 = "Content-Encoding"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r2)
                if (r0 != 0) goto L1b
                java.lang.String r0 = "Content-Type"
                boolean r2 = kotlin.text.StringsKt.equals(r0, r2)
                if (r2 == 0) goto L19
                goto L1b
            L19:
                r2 = 0
                goto L1c
            L1b:
                r2 = 1
            L1c:
                return r2
        }

        private final boolean isEndToEnd(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Connection"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r2)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Keep-Alive"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r2)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Proxy-Authenticate"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r2)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Proxy-Authorization"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r2)
                if (r0 != 0) goto L42
                java.lang.String r0 = "TE"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r2)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Trailers"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r2)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Transfer-Encoding"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r2)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Upgrade"
                boolean r2 = kotlin.text.StringsKt.equals(r0, r2)
                if (r2 != 0) goto L42
                r2 = 1
                goto L43
            L42:
                r2 = 0
            L43:
                return r2
        }

        private final okhttp3.Response stripBody(okhttp3.Response r3) {
                r2 = this;
                r0 = 0
                if (r3 == 0) goto L8
                okhttp3.ResponseBody r1 = r3.body()
                goto L9
            L8:
                r1 = r0
            L9:
                if (r1 == 0) goto L17
                okhttp3.Response$Builder r3 = r3.newBuilder()
                okhttp3.Response$Builder r3 = r3.body(r0)
                okhttp3.Response r3 = r3.build()
            L17:
                return r3
        }
    }

    static {
            okhttp3.internal.cache.CacheInterceptor$Companion r0 = new okhttp3.internal.cache.CacheInterceptor$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.cache.CacheInterceptor.Companion = r0
            return
    }

    public CacheInterceptor(@org.jetbrains.annotations.Nullable okhttp3.Cache r1) {
            r0 = this;
            r0.<init>()
            r0.cache = r1
            return
    }

    private final okhttp3.Response cacheWritingResponse(okhttp3.internal.cache.CacheRequest r5, okhttp3.Response r6) throws java.io.IOException {
            r4 = this;
            if (r5 != 0) goto L3
            return r6
        L3:
            okio.Sink r0 = r5.body()
            okhttp3.ResponseBody r1 = r6.body()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okio.BufferedSource r1 = r1.source()
            okio.BufferedSink r0 = okio.Okio.buffer(r0)
            okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 r2 = new okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            r2.<init>(r1, r5, r0)
            r5 = 2
            java.lang.String r0 = "Content-Type"
            r1 = 0
            java.lang.String r5 = okhttp3.Response.header$default(r6, r0, r1, r5, r1)
            okhttp3.ResponseBody r0 = r6.body()
            long r0 = r0.contentLength()
            okhttp3.Response$Builder r6 = r6.newBuilder()
            okhttp3.internal.http.RealResponseBody r3 = new okhttp3.internal.http.RealResponseBody
            okio.BufferedSource r2 = okio.Okio.buffer(r2)
            r3.<init>(r5, r0, r2)
            okhttp3.Response$Builder r5 = r6.body(r3)
            okhttp3.Response r5 = r5.build()
            return r5
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.Cache getCache$okhttp() {
            r1 = this;
            okhttp3.Cache r0 = r1.cache
            return r0
    }

    @Override // okhttp3.Interceptor
    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r9) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            okhttp3.Call r0 = r9.call()
            okhttp3.Cache r1 = r8.cache
            r2 = 0
            if (r1 == 0) goto L17
            okhttp3.Request r3 = r9.request()
            okhttp3.Response r1 = r1.get$okhttp(r3)
            goto L18
        L17:
            r1 = r2
        L18:
            long r3 = java.lang.System.currentTimeMillis()
            okhttp3.internal.cache.CacheStrategy$Factory r5 = new okhttp3.internal.cache.CacheStrategy$Factory
            okhttp3.Request r6 = r9.request()
            r5.<init>(r3, r6, r1)
            okhttp3.internal.cache.CacheStrategy r3 = r5.compute()
            okhttp3.Request r4 = r3.getNetworkRequest()
            okhttp3.Response r5 = r3.getCacheResponse()
            okhttp3.Cache r6 = r8.cache
            if (r6 == 0) goto L38
            r6.trackResponse$okhttp(r3)
        L38:
            boolean r3 = r0 instanceof okhttp3.internal.connection.RealCall
            if (r3 != 0) goto L3d
            goto L3e
        L3d:
            r2 = r0
        L3e:
            okhttp3.internal.connection.RealCall r2 = (okhttp3.internal.connection.RealCall) r2
            if (r2 == 0) goto L49
            okhttp3.EventListener r2 = r2.getEventListener$okhttp()
            if (r2 == 0) goto L49
            goto L4b
        L49:
            okhttp3.EventListener r2 = okhttp3.EventListener.NONE
        L4b:
            if (r1 == 0) goto L58
            if (r5 != 0) goto L58
            okhttp3.ResponseBody r3 = r1.body()
            if (r3 == 0) goto L58
            okhttp3.internal.Util.closeQuietly(r3)
        L58:
            if (r4 != 0) goto L97
            if (r5 != 0) goto L97
            okhttp3.Response$Builder r1 = new okhttp3.Response$Builder
            r1.<init>()
            okhttp3.Request r9 = r9.request()
            okhttp3.Response$Builder r9 = r1.request(r9)
            okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_1_1
            okhttp3.Response$Builder r9 = r9.protocol(r1)
            r1 = 504(0x1f8, float:7.06E-43)
            okhttp3.Response$Builder r9 = r9.code(r1)
            java.lang.String r1 = "Unsatisfiable Request (only-if-cached)"
            okhttp3.Response$Builder r9 = r9.message(r1)
            okhttp3.ResponseBody r1 = okhttp3.internal.Util.EMPTY_RESPONSE
            okhttp3.Response$Builder r9 = r9.body(r1)
            r3 = -1
            okhttp3.Response$Builder r9 = r9.sentRequestAtMillis(r3)
            long r3 = java.lang.System.currentTimeMillis()
            okhttp3.Response$Builder r9 = r9.receivedResponseAtMillis(r3)
            okhttp3.Response r9 = r9.build()
            r2.satisfactionFailure(r0, r9)
            return r9
        L97:
            if (r4 != 0) goto Lb2
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            okhttp3.Response$Builder r9 = r5.newBuilder()
            okhttp3.internal.cache.CacheInterceptor$Companion r1 = okhttp3.internal.cache.CacheInterceptor.Companion
            okhttp3.Response r1 = okhttp3.internal.cache.CacheInterceptor.Companion.access$stripBody(r1, r5)
            okhttp3.Response$Builder r9 = r9.cacheResponse(r1)
            okhttp3.Response r9 = r9.build()
            r2.cacheHit(r0, r9)
            return r9
        Lb2:
            if (r5 == 0) goto Lb8
            r2.cacheConditionalHit(r0, r5)
            goto Lbf
        Lb8:
            okhttp3.Cache r3 = r8.cache
            if (r3 == 0) goto Lbf
            r2.cacheMiss(r0)
        Lbf:
            okhttp3.Response r9 = r9.proceed(r4)     // Catch: java.lang.Throwable -> L18b
            if (r9 != 0) goto Ld0
            if (r1 == 0) goto Ld0
            okhttp3.ResponseBody r1 = r1.body()
            if (r1 == 0) goto Ld0
            okhttp3.internal.Util.closeQuietly(r1)
        Ld0:
            if (r5 == 0) goto L13a
            if (r9 == 0) goto L131
            int r1 = r9.code()
            r3 = 304(0x130, float:4.26E-43)
            if (r1 != r3) goto L131
            okhttp3.Response$Builder r1 = r5.newBuilder()
            okhttp3.internal.cache.CacheInterceptor$Companion r3 = okhttp3.internal.cache.CacheInterceptor.Companion
            okhttp3.Headers r4 = r5.headers()
            okhttp3.Headers r6 = r9.headers()
            okhttp3.Headers r4 = okhttp3.internal.cache.CacheInterceptor.Companion.access$combine(r3, r4, r6)
            okhttp3.Response$Builder r1 = r1.headers(r4)
            long r6 = r9.sentRequestAtMillis()
            okhttp3.Response$Builder r1 = r1.sentRequestAtMillis(r6)
            long r6 = r9.receivedResponseAtMillis()
            okhttp3.Response$Builder r1 = r1.receivedResponseAtMillis(r6)
            okhttp3.Response r4 = okhttp3.internal.cache.CacheInterceptor.Companion.access$stripBody(r3, r5)
            okhttp3.Response$Builder r1 = r1.cacheResponse(r4)
            okhttp3.Response r3 = okhttp3.internal.cache.CacheInterceptor.Companion.access$stripBody(r3, r9)
            okhttp3.Response$Builder r1 = r1.networkResponse(r3)
            okhttp3.Response r1 = r1.build()
            okhttp3.ResponseBody r9 = r9.body()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            r9.close()
            okhttp3.Cache r9 = r8.cache
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            r9.trackConditionalCacheHit$okhttp()
            okhttp3.Cache r9 = r8.cache
            r9.update$okhttp(r5, r1)
            r2.cacheHit(r0, r1)
            return r1
        L131:
            okhttp3.ResponseBody r1 = r5.body()
            if (r1 == 0) goto L13a
            okhttp3.internal.Util.closeQuietly(r1)
        L13a:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            okhttp3.Response$Builder r1 = r9.newBuilder()
            okhttp3.internal.cache.CacheInterceptor$Companion r3 = okhttp3.internal.cache.CacheInterceptor.Companion
            okhttp3.Response r6 = okhttp3.internal.cache.CacheInterceptor.Companion.access$stripBody(r3, r5)
            okhttp3.Response$Builder r1 = r1.cacheResponse(r6)
            okhttp3.Response r9 = okhttp3.internal.cache.CacheInterceptor.Companion.access$stripBody(r3, r9)
            okhttp3.Response$Builder r9 = r1.networkResponse(r9)
            okhttp3.Response r9 = r9.build()
            okhttp3.Cache r1 = r8.cache
            if (r1 == 0) goto L18a
            boolean r1 = okhttp3.internal.http.HttpHeaders.promisesBody(r9)
            if (r1 == 0) goto L179
            okhttp3.internal.cache.CacheStrategy$Companion r1 = okhttp3.internal.cache.CacheStrategy.Companion
            boolean r1 = r1.isCacheable(r9, r4)
            if (r1 == 0) goto L179
            okhttp3.Cache r1 = r8.cache
            okhttp3.internal.cache.CacheRequest r1 = r1.put$okhttp(r9)
            okhttp3.Response r9 = r8.cacheWritingResponse(r1, r9)
            if (r5 == 0) goto L178
            r2.cacheMiss(r0)
        L178:
            return r9
        L179:
            okhttp3.internal.http.HttpMethod r0 = okhttp3.internal.http.HttpMethod.INSTANCE
            java.lang.String r1 = r4.method()
            boolean r0 = r0.invalidatesCache(r1)
            if (r0 == 0) goto L18a
            okhttp3.Cache r0 = r8.cache     // Catch: java.io.IOException -> L18a
            r0.remove$okhttp(r4)     // Catch: java.io.IOException -> L18a
        L18a:
            return r9
        L18b:
            r9 = move-exception
            if (r1 == 0) goto L197
            okhttp3.ResponseBody r0 = r1.body()
            if (r0 == 0) goto L197
            okhttp3.internal.Util.closeQuietly(r0)
        L197:
            throw r9
    }
}
