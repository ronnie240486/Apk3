package okhttp3.internal.http;

/* JADX INFO: compiled from: RequestLine.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http/RequestLine;", "", "()V", "get", "", "request", "Lokhttp3/Request;", "proxyType", "Ljava/net/Proxy$Type;", "includeAuthorityInRequestLine", "", "requestPath", "url", "Lokhttp3/HttpUrl;", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class RequestLine {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http.RequestLine INSTANCE = null;

    static {
            okhttp3.internal.http.RequestLine r0 = new okhttp3.internal.http.RequestLine
            r0.<init>()
            okhttp3.internal.http.RequestLine.INSTANCE = r0
            return
    }

    private RequestLine() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean includeAuthorityInRequestLine(okhttp3.Request r1, java.net.Proxy.Type r2) {
            r0 = this;
            boolean r1 = r1.isHttps()
            if (r1 != 0) goto Lc
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            if (r2 != r1) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String get(@org.jetbrains.annotations.NotNull okhttp3.Request r3, @org.jetbrains.annotations.NotNull java.net.Proxy.Type r4) {
            r2 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "proxyType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.method()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            okhttp3.internal.http.RequestLine r1 = okhttp3.internal.http.RequestLine.INSTANCE
            boolean r4 = r1.includeAuthorityInRequestLine(r3, r4)
            if (r4 == 0) goto L2b
            okhttp3.HttpUrl r3 = r3.url()
            r0.append(r3)
            goto L36
        L2b:
            okhttp3.HttpUrl r3 = r3.url()
            java.lang.String r3 = r1.requestPath(r3)
            r0.append(r3)
        L36:
            java.lang.String r3 = " HTTP/1.1"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String requestPath(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r3) {
            r2 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r3.encodedPath()
            java.lang.String r3 = r3.encodedQuery()
            if (r3 == 0) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r0 = 63
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
        L24:
            return r0
    }
}
