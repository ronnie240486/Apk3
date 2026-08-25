package okhttp3.internal.http;

/* JADX INFO: compiled from: BridgeInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/Interceptor;", "cookieJar", "Lokhttp3/CookieJar;", "(Lokhttp3/CookieJar;)V", "cookieHeader", "", "cookies", "", "Lokhttp3/Cookie;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class BridgeInterceptor implements okhttp3.Interceptor {
    private final okhttp3.CookieJar cookieJar;

    public BridgeInterceptor(@org.jetbrains.annotations.NotNull okhttp3.CookieJar r2) {
            r1 = this;
            java.lang.String r0 = "cookieJar"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.cookieJar = r2
            return
    }

    private final java.lang.String cookieHeader(java.util.List<okhttp3.Cookie> r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        La:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r5.next()
            int r3 = r1 + 1
            if (r1 >= 0) goto L1b
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L1b:
            okhttp3.Cookie r2 = (okhttp3.Cookie) r2
            if (r1 <= 0) goto L24
            java.lang.String r1 = "; "
            r0.append(r1)
        L24:
            java.lang.String r1 = r2.name()
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.String r1 = r2.value()
            r0.append(r1)
            r1 = r3
            goto La
        L39:
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
    }

    @Override // okhttp3.Interceptor
    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r13) throws java.io.IOException {
            r12 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            okhttp3.Request r0 = r13.request()
            okhttp3.Request$Builder r1 = r0.newBuilder()
            okhttp3.RequestBody r2 = r0.body()
            java.lang.String r3 = "Content-Type"
            r4 = -1
            java.lang.String r6 = "Content-Length"
            if (r2 == 0) goto L43
            okhttp3.MediaType r7 = r2.contentType()
            if (r7 == 0) goto L26
            java.lang.String r7 = r7.toString()
            r1.header(r3, r7)
        L26:
            long r7 = r2.contentLength()
            java.lang.String r2 = "Transfer-Encoding"
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 == 0) goto L3b
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r1.header(r6, r7)
            r1.removeHeader(r2)
            goto L43
        L3b:
            java.lang.String r7 = "chunked"
            r1.header(r2, r7)
            r1.removeHeader(r6)
        L43:
            java.lang.String r2 = "Host"
            java.lang.String r7 = r0.header(r2)
            r8 = 0
            r9 = 0
            r10 = 1
            if (r7 != 0) goto L59
            okhttp3.HttpUrl r7 = r0.url()
            java.lang.String r7 = okhttp3.internal.Util.toHostHeader$default(r7, r8, r10, r9)
            r1.header(r2, r7)
        L59:
            java.lang.String r2 = "Connection"
            java.lang.String r7 = r0.header(r2)
            if (r7 != 0) goto L66
            java.lang.String r7 = "Keep-Alive"
            r1.header(r2, r7)
        L66:
            java.lang.String r2 = "Accept-Encoding"
            java.lang.String r7 = r0.header(r2)
            java.lang.String r11 = "gzip"
            if (r7 != 0) goto L7c
            java.lang.String r7 = "Range"
            java.lang.String r7 = r0.header(r7)
            if (r7 != 0) goto L7c
            r1.header(r2, r11)
            r8 = 1
        L7c:
            okhttp3.CookieJar r2 = r12.cookieJar
            okhttp3.HttpUrl r7 = r0.url()
            java.util.List r2 = r2.loadForRequest(r7)
            boolean r7 = r2.isEmpty()
            r7 = r7 ^ r10
            if (r7 == 0) goto L96
            java.lang.String r2 = r12.cookieHeader(r2)
            java.lang.String r7 = "Cookie"
            r1.header(r7, r2)
        L96:
            java.lang.String r2 = "User-Agent"
            java.lang.String r7 = r0.header(r2)
            if (r7 != 0) goto La3
            java.lang.String r7 = "okhttp/5.0.0-alpha.2"
            r1.header(r2, r7)
        La3:
            okhttp3.Request r1 = r1.build()
            okhttp3.Response r13 = r13.proceed(r1)
            okhttp3.CookieJar r1 = r12.cookieJar
            okhttp3.HttpUrl r2 = r0.url()
            okhttp3.Headers r7 = r13.headers()
            okhttp3.internal.http.HttpHeaders.receiveHeaders(r1, r2, r7)
            okhttp3.Response$Builder r1 = r13.newBuilder()
            okhttp3.Response$Builder r0 = r1.request(r0)
            if (r8 == 0) goto L10b
            java.lang.String r1 = "Content-Encoding"
            r2 = 2
            java.lang.String r7 = okhttp3.Response.header$default(r13, r1, r9, r2, r9)
            boolean r7 = kotlin.text.StringsKt.equals(r11, r7)
            if (r7 == 0) goto L10b
            boolean r7 = okhttp3.internal.http.HttpHeaders.promisesBody(r13)
            if (r7 == 0) goto L10b
            okhttp3.ResponseBody r7 = r13.body()
            if (r7 == 0) goto L10b
            okio.GzipSource r8 = new okio.GzipSource
            okio.BufferedSource r7 = r7.source()
            r8.<init>(r7)
            okhttp3.Headers r7 = r13.headers()
            okhttp3.Headers$Builder r7 = r7.newBuilder()
            okhttp3.Headers$Builder r1 = r7.removeAll(r1)
            okhttp3.Headers$Builder r1 = r1.removeAll(r6)
            okhttp3.Headers r1 = r1.build()
            r0.headers(r1)
            java.lang.String r13 = okhttp3.Response.header$default(r13, r3, r9, r2, r9)
            okhttp3.internal.http.RealResponseBody r1 = new okhttp3.internal.http.RealResponseBody
            okio.BufferedSource r2 = okio.Okio.buffer(r8)
            r1.<init>(r13, r4, r2)
            r0.body(r1)
        L10b:
            okhttp3.Response r13 = r0.build()
            return r13
    }
}
