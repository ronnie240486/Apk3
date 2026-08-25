package okhttp3.internal.cache;

/* JADX INFO: compiled from: CacheStrategy.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u001b\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy;", "", "networkRequest", "Lokhttp3/Request;", "cacheResponse", "Lokhttp3/Response;", "(Lokhttp3/Request;Lokhttp3/Response;)V", "getCacheResponse", "()Lokhttp3/Response;", "getNetworkRequest", "()Lokhttp3/Request;", "Companion", "Factory", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class CacheStrategy {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.cache.CacheStrategy.Companion Companion = null;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.Response cacheResponse;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.Request networkRequest;

    /* JADX INFO: compiled from: CacheStrategy.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Companion;", "", "()V", "isCacheable", "", "response", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        public final boolean isCacheable(@org.jetbrains.annotations.NotNull okhttp3.Response r5, @org.jetbrains.annotations.NotNull okhttp3.Request r6) {
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                int r0 = r5.code()
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L67
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L67
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L67
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L67
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L67
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L67
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L3d
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L67
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L67
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L67
                switch(r0) {
                    case 300: goto L67;
                    case 301: goto L67;
                    case 302: goto L3d;
                    default: goto L3c;
                }
            L3c:
                return r2
            L3d:
                r0 = 2
                java.lang.String r1 = "Expires"
                r3 = 0
                java.lang.String r0 = okhttp3.Response.header$default(r5, r1, r3, r0, r3)
                if (r0 != 0) goto L67
                okhttp3.CacheControl r0 = r5.cacheControl()
                int r0 = r0.maxAgeSeconds()
                r1 = -1
                if (r0 != r1) goto L67
                okhttp3.CacheControl r0 = r5.cacheControl()
                boolean r0 = r0.isPublic()
                if (r0 != 0) goto L67
                okhttp3.CacheControl r0 = r5.cacheControl()
                boolean r0 = r0.isPrivate()
                if (r0 != 0) goto L67
                return r2
            L67:
                okhttp3.CacheControl r5 = r5.cacheControl()
                boolean r5 = r5.noStore()
                if (r5 != 0) goto L7c
                okhttp3.CacheControl r5 = r6.cacheControl()
                boolean r5 = r5.noStore()
                if (r5 != 0) goto L7c
                r2 = 1
            L7c:
                return r2
        }
    }

    /* JADX INFO: compiled from: CacheStrategy.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0003H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Factory;", "", "nowMillis", "", "request", "Lokhttp3/Request;", "cacheResponse", "Lokhttp3/Response;", "(JLokhttp3/Request;Lokhttp3/Response;)V", "ageSeconds", "", "etag", "", "expires", "Ljava/util/Date;", "lastModified", "lastModifiedString", "receivedResponseMillis", "getRequest$okhttp", "()Lokhttp3/Request;", "sentRequestMillis", "servedDate", "servedDateString", "cacheResponseAge", "compute", "Lokhttp3/internal/cache/CacheStrategy;", "computeCandidate", "computeFreshnessLifetime", "hasConditions", "", "isFreshnessLifetimeHeuristic", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Factory {
        private int ageSeconds;
        private final okhttp3.Response cacheResponse;
        private java.lang.String etag;
        private java.util.Date expires;
        private java.util.Date lastModified;
        private java.lang.String lastModifiedString;
        private final long nowMillis;
        private long receivedResponseMillis;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.Request request;
        private long sentRequestMillis;
        private java.util.Date servedDate;
        private java.lang.String servedDateString;

        public Factory(long r4, @org.jetbrains.annotations.NotNull okhttp3.Request r6, @org.jetbrains.annotations.Nullable okhttp3.Response r7) {
                r3 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                r3.<init>()
                r3.nowMillis = r4
                r3.request = r6
                r3.cacheResponse = r7
                r4 = -1
                r3.ageSeconds = r4
                if (r7 == 0) goto L7f
                long r5 = r7.sentRequestAtMillis()
                r3.sentRequestMillis = r5
                long r5 = r7.receivedResponseAtMillis()
                r3.receivedResponseMillis = r5
                okhttp3.Headers r5 = r7.headers()
                r6 = 0
                int r7 = r5.size()
            L28:
                if (r6 >= r7) goto L7f
                java.lang.String r0 = r5.name(r6)
                java.lang.String r1 = r5.value(r6)
                java.lang.String r2 = "Date"
                boolean r2 = kotlin.text.StringsKt.equals(r0, r2)
                if (r2 == 0) goto L43
                java.util.Date r0 = okhttp3.internal.http.DatesKt.toHttpDateOrNull(r1)
                r3.servedDate = r0
                r3.servedDateString = r1
                goto L7c
            L43:
                java.lang.String r2 = "Expires"
                boolean r2 = kotlin.text.StringsKt.equals(r0, r2)
                if (r2 == 0) goto L52
                java.util.Date r0 = okhttp3.internal.http.DatesKt.toHttpDateOrNull(r1)
                r3.expires = r0
                goto L7c
            L52:
                java.lang.String r2 = "Last-Modified"
                boolean r2 = kotlin.text.StringsKt.equals(r0, r2)
                if (r2 == 0) goto L63
                java.util.Date r0 = okhttp3.internal.http.DatesKt.toHttpDateOrNull(r1)
                r3.lastModified = r0
                r3.lastModifiedString = r1
                goto L7c
            L63:
                java.lang.String r2 = "ETag"
                boolean r2 = kotlin.text.StringsKt.equals(r0, r2)
                if (r2 == 0) goto L6e
                r3.etag = r1
                goto L7c
            L6e:
                java.lang.String r2 = "Age"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r2)
                if (r0 == 0) goto L7c
                int r0 = okhttp3.internal.Util.toNonNegativeInt(r1, r4)
                r3.ageSeconds = r0
            L7c:
                int r6 = r6 + 1
                goto L28
            L7f:
                return
        }

        private final long cacheResponseAge() {
                r9 = this;
                java.util.Date r0 = r9.servedDate
                r1 = 0
                if (r0 == 0) goto L11
                long r3 = r9.receivedResponseMillis
                long r5 = r0.getTime()
                long r3 = r3 - r5
                long r1 = java.lang.Math.max(r1, r3)
            L11:
                int r0 = r9.ageSeconds
                r3 = -1
                if (r0 == r3) goto L21
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
                long r4 = (long) r0
                long r3 = r3.toMillis(r4)
                long r1 = java.lang.Math.max(r1, r3)
            L21:
                long r3 = r9.receivedResponseMillis
                long r5 = r9.sentRequestMillis
                long r5 = r3 - r5
                long r7 = r9.nowMillis
                long r7 = r7 - r3
                long r1 = r1 + r5
                long r1 = r1 + r7
                return r1
        }

        private final okhttp3.internal.cache.CacheStrategy computeCandidate() {
                r13 = this;
                okhttp3.Response r0 = r13.cacheResponse
                r1 = 0
                if (r0 != 0) goto Ld
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r13.request
                r0.<init>(r2, r1)
                return r0
            Ld:
                okhttp3.Request r0 = r13.request
                boolean r0 = r0.isHttps()
                if (r0 == 0) goto L25
                okhttp3.Response r0 = r13.cacheResponse
                okhttp3.Handshake r0 = r0.handshake()
                if (r0 != 0) goto L25
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r13.request
                r0.<init>(r2, r1)
                return r0
            L25:
                okhttp3.internal.cache.CacheStrategy$Companion r0 = okhttp3.internal.cache.CacheStrategy.Companion
                okhttp3.Response r2 = r13.cacheResponse
                okhttp3.Request r3 = r13.request
                boolean r0 = r0.isCacheable(r2, r3)
                if (r0 != 0) goto L39
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r13.request
                r0.<init>(r2, r1)
                return r0
            L39:
                okhttp3.Request r0 = r13.request
                okhttp3.CacheControl r0 = r0.cacheControl()
                boolean r2 = r0.noCache()
                if (r2 != 0) goto L120
                okhttp3.Request r2 = r13.request
                boolean r2 = r13.hasConditions(r2)
                if (r2 == 0) goto L4f
                goto L120
            L4f:
                okhttp3.Response r2 = r13.cacheResponse
                okhttp3.CacheControl r2 = r2.cacheControl()
                long r3 = r13.cacheResponseAge()
                long r5 = r13.computeFreshnessLifetime()
                int r7 = r0.maxAgeSeconds()
                r8 = -1
                if (r7 == r8) goto L73
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
                int r9 = r0.maxAgeSeconds()
                long r9 = (long) r9
                long r9 = r7.toMillis(r9)
                long r5 = java.lang.Math.min(r5, r9)
            L73:
                int r7 = r0.minFreshSeconds()
                r9 = 0
                if (r7 == r8) goto L87
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
                int r11 = r0.minFreshSeconds()
                long r11 = (long) r11
                long r11 = r7.toMillis(r11)
                goto L88
            L87:
                r11 = r9
            L88:
                boolean r7 = r2.mustRevalidate()
                if (r7 != 0) goto L9f
                int r7 = r0.maxStaleSeconds()
                if (r7 == r8) goto L9f
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
                int r0 = r0.maxStaleSeconds()
                long r8 = (long) r0
                long r9 = r7.toMillis(r8)
            L9f:
                boolean r0 = r2.noCache()
                if (r0 != 0) goto Ld8
                long r11 = r11 + r3
                long r9 = r9 + r5
                int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r0 >= 0) goto Ld8
                okhttp3.Response r0 = r13.cacheResponse
                okhttp3.Response$Builder r0 = r0.newBuilder()
                java.lang.String r2 = "Warning"
                int r7 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r7 < 0) goto Lbc
                java.lang.String r5 = "110 HttpURLConnection \"Response is stale\""
                r0.addHeader(r2, r5)
            Lbc:
                r5 = 86400000(0x5265c00, double:4.2687272E-316)
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 <= 0) goto Lce
                boolean r3 = r13.isFreshnessLifetimeHeuristic()
                if (r3 == 0) goto Lce
                java.lang.String r3 = "113 HttpURLConnection \"Heuristic expiration\""
                r0.addHeader(r2, r3)
            Lce:
                okhttp3.internal.cache.CacheStrategy r2 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Response r0 = r0.build()
                r2.<init>(r1, r0)
                return r2
            Ld8:
                java.lang.String r0 = r13.etag
                java.lang.String r2 = "If-Modified-Since"
                if (r0 == 0) goto Le1
                java.lang.String r2 = "If-None-Match"
                goto Lee
            Le1:
                java.util.Date r0 = r13.lastModified
                if (r0 == 0) goto Le8
                java.lang.String r0 = r13.lastModifiedString
                goto Lee
            Le8:
                java.util.Date r0 = r13.servedDate
                if (r0 == 0) goto L118
                java.lang.String r0 = r13.servedDateString
            Lee:
                okhttp3.Request r1 = r13.request
                okhttp3.Headers r1 = r1.headers()
                okhttp3.Headers$Builder r1 = r1.newBuilder()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r1.addLenient$okhttp(r2, r0)
                okhttp3.Request r0 = r13.request
                okhttp3.Request$Builder r0 = r0.newBuilder()
                okhttp3.Headers r1 = r1.build()
                okhttp3.Request$Builder r0 = r0.headers(r1)
                okhttp3.Request r0 = r0.build()
                okhttp3.internal.cache.CacheStrategy r1 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Response r2 = r13.cacheResponse
                r1.<init>(r0, r2)
                return r1
            L118:
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r13.request
                r0.<init>(r2, r1)
                return r0
            L120:
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r13.request
                r0.<init>(r2, r1)
                return r0
        }

        private final long computeFreshnessLifetime() {
                r7 = this;
                okhttp3.Response r0 = r7.cacheResponse
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                okhttp3.CacheControl r0 = r0.cacheControl()
                int r1 = r0.maxAgeSeconds()
                r2 = -1
                if (r1 == r2) goto L1c
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
                int r0 = r0.maxAgeSeconds()
                long r2 = (long) r0
                long r0 = r1.toMillis(r2)
                return r0
            L1c:
                java.util.Date r0 = r7.expires
                r1 = 0
                if (r0 == 0) goto L38
                java.util.Date r3 = r7.servedDate
                if (r3 == 0) goto L2b
                long r3 = r3.getTime()
                goto L2d
            L2b:
                long r3 = r7.receivedResponseMillis
            L2d:
                long r5 = r0.getTime()
                long r5 = r5 - r3
                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r0 <= 0) goto L37
                r1 = r5
            L37:
                return r1
            L38:
                java.util.Date r0 = r7.lastModified
                if (r0 == 0) goto L6a
                okhttp3.Response r0 = r7.cacheResponse
                okhttp3.Request r0 = r0.request()
                okhttp3.HttpUrl r0 = r0.url()
                java.lang.String r0 = r0.query()
                if (r0 != 0) goto L6a
                java.util.Date r0 = r7.servedDate
                if (r0 == 0) goto L55
                long r3 = r0.getTime()
                goto L57
            L55:
                long r3 = r7.sentRequestMillis
            L57:
                java.util.Date r0 = r7.lastModified
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                long r5 = r0.getTime()
                long r3 = r3 - r5
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 <= 0) goto L6a
                r0 = 10
                long r0 = (long) r0
                long r1 = r3 / r0
            L6a:
                return r1
        }

        private final boolean hasConditions(okhttp3.Request r2) {
                r1 = this;
                java.lang.String r0 = "If-Modified-Since"
                java.lang.String r0 = r2.header(r0)
                if (r0 != 0) goto L13
                java.lang.String r0 = "If-None-Match"
                java.lang.String r2 = r2.header(r0)
                if (r2 == 0) goto L11
                goto L13
            L11:
                r2 = 0
                goto L14
            L13:
                r2 = 1
            L14:
                return r2
        }

        private final boolean isFreshnessLifetimeHeuristic() {
                r2 = this;
                okhttp3.Response r0 = r2.cacheResponse
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                okhttp3.CacheControl r0 = r0.cacheControl()
                int r0 = r0.maxAgeSeconds()
                r1 = -1
                if (r0 != r1) goto L16
                java.util.Date r0 = r2.expires
                if (r0 != 0) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.cache.CacheStrategy compute() {
                r2 = this;
                okhttp3.internal.cache.CacheStrategy r0 = r2.computeCandidate()
                okhttp3.Request r1 = r0.getNetworkRequest()
                if (r1 == 0) goto L1c
                okhttp3.Request r1 = r2.request
                okhttp3.CacheControl r1 = r1.cacheControl()
                boolean r1 = r1.onlyIfCached()
                if (r1 == 0) goto L1c
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                r1 = 0
                r0.<init>(r1, r1)
            L1c:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Request getRequest$okhttp() {
                r1 = this;
                okhttp3.Request r0 = r1.request
                return r0
        }
    }

    static {
            okhttp3.internal.cache.CacheStrategy$Companion r0 = new okhttp3.internal.cache.CacheStrategy$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.cache.CacheStrategy.Companion = r0
            return
    }

    public CacheStrategy(@org.jetbrains.annotations.Nullable okhttp3.Request r1, @org.jetbrains.annotations.Nullable okhttp3.Response r2) {
            r0 = this;
            r0.<init>()
            r0.networkRequest = r1
            r0.cacheResponse = r2
            return
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.Response getCacheResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.cacheResponse
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.Request getNetworkRequest() {
            r1 = this;
            okhttp3.Request r0 = r1.networkRequest
            return r0
    }
}
