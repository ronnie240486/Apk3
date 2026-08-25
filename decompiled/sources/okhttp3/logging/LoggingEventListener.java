package okhttp3.logging;

/* JADX INFO: compiled from: LoggingEventListener.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001CB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J*\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J2\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010 \u001a\u00020!H\u0016J&\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0016J\u0018\u0010)\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020%H\u0002J&\u0010,\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0'H\u0016J\u0018\u00100\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010-\u001a\u00020.H\u0016J\u0018\u00101\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u00102\u001a\u00020\u0006H\u0016J\u0010\u00103\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u00104\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u00105\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u00109\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u00102\u001a\u00020\u0006H\u0016J\u0010\u0010:\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010;\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010<\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010=\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010>\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u001a\u0010?\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u0010\u0010B\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lokhttp3/logging/LoggingEventListener;", "Lokhttp3/EventListener;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "startNs", "", "cacheConditionalHit", "", "call", "Lokhttp3/Call;", "cachedResponse", "Lokhttp3/Response;", "cacheHit", "response", "cacheMiss", "callEnd", "callFailed", "ioe", "Ljava/io/IOException;", "callStart", "canceled", "connectEnd", "inetSocketAddress", "Ljava/net/InetSocketAddress;", "proxy", "Ljava/net/Proxy;", "protocol", "Lokhttp3/Protocol;", "connectFailed", "connectStart", "connectionAcquired", "connection", "Lokhttp3/Connection;", "connectionReleased", "dnsEnd", "domainName", "", "inetAddressList", "", "Ljava/net/InetAddress;", "dnsStart", "logWithTime", "message", "proxySelectEnd", "url", "Lokhttp3/HttpUrl;", "proxies", "proxySelectStart", "requestBodyEnd", "byteCount", "requestBodyStart", "requestFailed", "requestHeadersEnd", "request", "Lokhttp3/Request;", "requestHeadersStart", "responseBodyEnd", "responseBodyStart", "responseFailed", "responseHeadersEnd", "responseHeadersStart", "satisfactionFailure", "secureConnectEnd", "handshake", "Lokhttp3/Handshake;", "secureConnectStart", "Factory", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 1})
public final class LoggingEventListener extends okhttp3.EventListener {
    private final okhttp3.logging.HttpLoggingInterceptor.Logger logger;
    private long startNs;

    /* JADX INFO: compiled from: LoggingEventListener.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lokhttp3/logging/LoggingEventListener$Factory;", "Lokhttp3/EventListener$Factory;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "create", "Lokhttp3/EventListener;", "call", "Lokhttp3/Call;", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 1})
    public static class Factory implements okhttp3.EventListener.Factory {
        private final okhttp3.logging.HttpLoggingInterceptor.Logger logger;

        @kotlin.jvm.JvmOverloads
        public Factory() {
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r0)
                return
        }

        @kotlin.jvm.JvmOverloads
        public Factory(@org.jetbrains.annotations.NotNull okhttp3.logging.HttpLoggingInterceptor.Logger r2) {
                r1 = this;
                java.lang.String r0 = "logger"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.logger = r2
                return
        }

        public /* synthetic */ Factory(okhttp3.logging.HttpLoggingInterceptor.Logger r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L6
                okhttp3.logging.HttpLoggingInterceptor$Logger r1 = okhttp3.logging.HttpLoggingInterceptor.Logger.DEFAULT
            L6:
                r0.<init>(r1)
                return
        }

        @Override // okhttp3.EventListener.Factory
        @org.jetbrains.annotations.NotNull
        public okhttp3.EventListener create(@org.jetbrains.annotations.NotNull okhttp3.Call r3) {
                r2 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.logging.LoggingEventListener r3 = new okhttp3.logging.LoggingEventListener
                okhttp3.logging.HttpLoggingInterceptor$Logger r0 = r2.logger
                r1 = 0
                r3.<init>(r0, r1)
                return r3
        }
    }

    private LoggingEventListener(okhttp3.logging.HttpLoggingInterceptor.Logger r1) {
            r0 = this;
            r0.<init>()
            r0.logger = r1
            return
    }

    public /* synthetic */ LoggingEventListener(okhttp3.logging.HttpLoggingInterceptor.Logger r1, kotlin.jvm.internal.DefaultConstructorMarker r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private final void logWithTime(java.lang.String r6) {
            r5 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = java.lang.System.nanoTime()
            long r3 = r5.startNs
            long r1 = r1 - r3
            long r0 = r0.toMillis(r1)
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r5.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 91
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " ms] "
            r3.append(r0)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.log(r6)
            return
    }

    @Override // okhttp3.EventListener
    public void cacheConditionalHit(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "cachedResponse"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "cacheConditionalHit: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void cacheHit(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "cacheHit: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void cacheMiss(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "cacheMiss"
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void callEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "callEnd"
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void callFailed(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.io.IOException r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "ioe"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "callFailed: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void callStart(@org.jetbrains.annotations.NotNull okhttp3.Call r3) {
            r2 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            long r0 = java.lang.System.nanoTime()
            r2.startNs = r0
            java.lang.String r0 = "callStart: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            okhttp3.Request r3 = r3.request()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.logWithTime(r3)
            return
    }

    @Override // okhttp3.EventListener
    public void canceled(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "canceled"
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void connectEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.net.InetSocketAddress r3, @org.jetbrains.annotations.NotNull java.net.Proxy r4, @org.jetbrains.annotations.Nullable okhttp3.Protocol r5) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "inetSocketAddress"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "proxy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "connectEnd: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void connectFailed(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.net.InetSocketAddress r3, @org.jetbrains.annotations.NotNull java.net.Proxy r4, @org.jetbrains.annotations.Nullable okhttp3.Protocol r5, @org.jetbrains.annotations.NotNull java.io.IOException r6) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "inetSocketAddress"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "proxy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.String r2 = "ioe"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "connectFailed: "
            r2.append(r3)
            r2.append(r5)
            r3 = 32
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void connectStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.net.InetSocketAddress r3, @org.jetbrains.annotations.NotNull java.net.Proxy r4) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "inetSocketAddress"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "proxy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "connectStart: "
            r2.append(r0)
            r2.append(r3)
            r3 = 32
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Connection r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "connectionAcquired: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Connection r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "connectionReleased"
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.util.List<? extends java.net.InetAddress> r4) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "domainName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "inetAddressList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "dnsEnd: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void dnsStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "domainName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "dnsStart: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void proxySelectEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.HttpUrl r3, @org.jetbrains.annotations.NotNull java.util.List<? extends java.net.Proxy> r4) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "proxies"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "proxySelectEnd: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void proxySelectStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.HttpUrl r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "proxySelectStart: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, long r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "requestBodyEnd: byteCount="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "requestBodyStart"
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void requestFailed(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.io.IOException r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "ioe"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "requestFailed: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Request r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "requestHeadersEnd"
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "requestHeadersStart"
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, long r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "responseBodyEnd: byteCount="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "responseBodyStart"
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void responseFailed(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull java.io.IOException r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "ioe"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "responseFailed: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "responseHeadersEnd: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "responseHeadersStart"
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void satisfactionFailure(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "satisfactionFailure: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(@org.jetbrains.annotations.NotNull okhttp3.Call r2, @org.jetbrains.annotations.Nullable okhttp3.Handshake r3) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "secureConnectEnd: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logWithTime(r2)
            return
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(@org.jetbrains.annotations.NotNull okhttp3.Call r2) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "secureConnectStart"
            r1.logWithTime(r2)
            return
    }
}
