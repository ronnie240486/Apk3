package okhttp3.internal;

/* JADX INFO: compiled from: internal.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014\u001a\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e\u001a \u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004\u001a#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040 *\u00020\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040 ¢\u0006\u0002\u0010\"¨\u0006#"}, d2 = {"addHeaderLenient", "Lokhttp3/Headers$Builder;", "builder", "line", "", "name", "value", "applyConnectionSpec", "", "connectionSpec", "Lokhttp3/ConnectionSpec;", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "isFallback", "", "cacheGet", "Lokhttp3/Response;", "cache", "Lokhttp3/Cache;", "request", "Lokhttp3/Request;", "cookieToString", "cookie", "Lokhttp3/Cookie;", "forObsoleteRfc2965", "parseCookie", "currentTimeMillis", "", "url", "Lokhttp3/HttpUrl;", "setCookie", "effectiveCipherSuites", "", "socketEnabledCipherSuites", "(Lokhttp3/ConnectionSpec;[Ljava/lang/String;)[Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 4, 1})
@kotlin.jvm.JvmName(name = "Internal")
public final class Internal {
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers.Builder addHeaderLenient(@org.jetbrains.annotations.NotNull okhttp3.Headers.Builder r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "line"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.Headers$Builder r1 = r1.addLenient$okhttp(r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers.Builder addHeaderLenient(@org.jetbrains.annotations.NotNull okhttp3.Headers.Builder r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.Headers$Builder r1 = r1.addLenient$okhttp(r2, r3)
            return r1
    }

    public static final void applyConnectionSpec(@org.jetbrains.annotations.NotNull okhttp3.ConnectionSpec r1, @org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2, boolean r3) {
            java.lang.String r0 = "connectionSpec"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.apply$okhttp(r2, r3)
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final okhttp3.Response cacheGet(@org.jetbrains.annotations.NotNull okhttp3.Cache r1, @org.jetbrains.annotations.NotNull okhttp3.Request r2) {
            java.lang.String r0 = "cache"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.Response r1 = r1.get$okhttp(r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String cookieToString(@org.jetbrains.annotations.NotNull okhttp3.Cookie r1, boolean r2) {
            java.lang.String r0 = "cookie"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r1 = r1.toString$okhttp(r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String[] effectiveCipherSuites(@org.jetbrains.annotations.NotNull okhttp3.ConnectionSpec r1, @org.jetbrains.annotations.NotNull java.lang.String[] r2) {
            java.lang.String r0 = "$this$effectiveCipherSuites"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "socketEnabledCipherSuites"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String[] r0 = r1.getCipherSuitesAsString$okhttp()
            if (r0 == 0) goto L1f
            java.lang.String[] r1 = r1.getCipherSuitesAsString$okhttp()
            okhttp3.CipherSuite$Companion r0 = okhttp3.CipherSuite.Companion
            java.util.Comparator r0 = r0.getORDER_BY_NAME$okhttp()
            java.lang.String[] r2 = okhttp3.internal.Util.intersect(r2, r1, r0)
        L1f:
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final okhttp3.Cookie parseCookie(long r1, @org.jetbrains.annotations.NotNull okhttp3.HttpUrl r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "setCookie"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            okhttp3.Cookie r1 = r0.parse$okhttp(r1, r3, r4)
            return r1
    }
}
