package okhttp3.internal.http;

/* JADX INFO: compiled from: RealInterceptorChain.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0002\u0010\u0010J\b\u0010\u0002\u001a\u00020\u001cH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010(\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006)"}, d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "call", "Lokhttp3/internal/connection/RealCall;", "interceptors", "", "Lokhttp3/Interceptor;", "index", "", "exchange", "Lokhttp3/internal/connection/Exchange;", "request", "Lokhttp3/Request;", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)V", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "calls", "getConnectTimeoutMillis$okhttp", "()I", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "getReadTimeoutMillis$okhttp", "getRequest$okhttp", "()Lokhttp3/Request;", "getWriteTimeoutMillis$okhttp", "Lokhttp3/Call;", "connection", "Lokhttp3/Connection;", "copy", "copy$okhttp", "proceed", "Lokhttp3/Response;", "withConnectTimeout", "timeout", "unit", "Ljava/util/concurrent/TimeUnit;", "withReadTimeout", "withWriteTimeout", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class RealInterceptorChain implements okhttp3.Interceptor.Chain {

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealCall call;
    private int calls;
    private final int connectTimeoutMillis;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.internal.connection.Exchange exchange;
    private final int index;
    private final java.util.List<okhttp3.Interceptor> interceptors;
    private final int readTimeoutMillis;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Request request;
    private final int writeTimeoutMillis;

    public RealInterceptorChain(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r2, @org.jetbrains.annotations.NotNull java.util.List<? extends okhttp3.Interceptor> r3, int r4, @org.jetbrains.annotations.Nullable okhttp3.internal.connection.Exchange r5, @org.jetbrains.annotations.NotNull okhttp3.Request r6, int r7, int r8, int r9) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "interceptors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r1.<init>()
            r1.call = r2
            r1.interceptors = r3
            r1.index = r4
            r1.exchange = r5
            r1.request = r6
            r1.connectTimeoutMillis = r7
            r1.readTimeoutMillis = r8
            r1.writeTimeoutMillis = r9
            return
    }

    public static /* synthetic */ okhttp3.internal.http.RealInterceptorChain copy$okhttp$default(okhttp3.internal.http.RealInterceptorChain r4, int r5, okhttp3.internal.connection.Exchange r6, okhttp3.Request r7, int r8, int r9, int r10, int r11, java.lang.Object r12) {
            r12 = r11 & 1
            if (r12 == 0) goto L6
            int r5 = r4.index
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            okhttp3.internal.connection.Exchange r6 = r4.exchange
        Lc:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L13
            okhttp3.Request r7 = r4.request
        L13:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L1a
            int r8 = r4.connectTimeoutMillis
        L1a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L21
            int r9 = r4.readTimeoutMillis
        L21:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L28
            int r10 = r4.writeTimeoutMillis
        L28:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            okhttp3.internal.http.RealInterceptorChain r4 = r6.copy$okhttp(r7, r8, r9, r10, r11, r12)
            return r4
    }

    @Override // okhttp3.Interceptor.Chain
    @org.jetbrains.annotations.NotNull
    public okhttp3.Call call() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.call
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    public int connectTimeoutMillis() {
            r1 = this;
            int r0 = r1.connectTimeoutMillis
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    @org.jetbrains.annotations.Nullable
    public okhttp3.Connection connection() {
            r1 = this;
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            if (r0 == 0) goto L9
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection$okhttp()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http.RealInterceptorChain copy$okhttp(int r12, @org.jetbrains.annotations.Nullable okhttp3.internal.connection.Exchange r13, @org.jetbrains.annotations.NotNull okhttp3.Request r14, int r15, int r16, int r17) {
            r11 = this;
            r0 = r11
            java.lang.String r1 = "request"
            r7 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            okhttp3.internal.http.RealInterceptorChain r1 = new okhttp3.internal.http.RealInterceptorChain
            okhttp3.internal.connection.RealCall r3 = r0.call
            java.util.List<okhttp3.Interceptor> r4 = r0.interceptors
            r2 = r1
            r5 = r12
            r6 = r13
            r8 = r15
            r9 = r16
            r10 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.RealCall getCall$okhttp() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.call
            return r0
    }

    public final int getConnectTimeoutMillis$okhttp() {
            r1 = this;
            int r0 = r1.connectTimeoutMillis
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.connection.Exchange getExchange$okhttp() {
            r1 = this;
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            return r0
    }

    public final int getReadTimeoutMillis$okhttp() {
            r1 = this;
            int r0 = r1.readTimeoutMillis
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Request getRequest$okhttp() {
            r1 = this;
            okhttp3.Request r0 = r1.request
            return r0
    }

    public final int getWriteTimeoutMillis$okhttp() {
            r1 = this;
            int r0 = r1.writeTimeoutMillis
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    @org.jetbrains.annotations.NotNull
    public okhttp3.Response proceed(@org.jetbrains.annotations.NotNull okhttp3.Request r15) throws java.io.IOException {
            r14 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            int r0 = r14.index
            java.util.List<okhttp3.Interceptor> r1 = r14.interceptors
            int r1 = r1.size()
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L11e
            int r0 = r14.calls
            int r0 = r0 + r3
            r14.calls = r0
            okhttp3.internal.connection.Exchange r0 = r14.exchange
            java.lang.String r1 = " must call proceed() exactly once"
            java.lang.String r4 = "network interceptor "
            if (r0 == 0) goto L83
            okhttp3.internal.connection.ExchangeFinder r0 = r0.getFinder$okhttp()
            okhttp3.HttpUrl r5 = r15.url()
            boolean r0 = r0.sameHostAndPort(r5)
            if (r0 == 0) goto L5e
            int r0 = r14.calls
            if (r0 != r3) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            if (r0 == 0) goto L3b
            goto L83
        L3b:
            java.lang.StringBuilder r15 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            java.util.List<okhttp3.Interceptor> r0 = r14.interceptors
            int r2 = r14.index
            int r2 = r2 - r3
            java.lang.Object r0 = r0.get(r2)
            okhttp3.Interceptor r0 = (okhttp3.Interceptor) r0
            r15.append(r0)
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r15 = r15.toString()
            r0.<init>(r15)
            throw r0
        L5e:
            java.lang.StringBuilder r15 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            java.util.List<okhttp3.Interceptor> r0 = r14.interceptors
            int r1 = r14.index
            int r1 = r1 - r3
            java.lang.Object r0 = r0.get(r1)
            okhttp3.Interceptor r0 = (okhttp3.Interceptor) r0
            r15.append(r0)
            java.lang.String r0 = " must retain the same host and port"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r15 = r15.toString()
            r0.<init>(r15)
            throw r0
        L83:
            int r0 = r14.index
            int r6 = r0 + 1
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 58
            r13 = 0
            r5 = r14
            r8 = r15
            okhttp3.internal.http.RealInterceptorChain r15 = copy$okhttp$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.util.List<okhttp3.Interceptor> r0 = r14.interceptors
            int r5 = r14.index
            java.lang.Object r0 = r0.get(r5)
            okhttp3.Interceptor r0 = (okhttp3.Interceptor) r0
            okhttp3.Response r5 = r0.intercept(r15)
            java.lang.String r6 = "interceptor "
            if (r5 == 0) goto L104
            okhttp3.internal.connection.Exchange r7 = r14.exchange
            if (r7 == 0) goto Ldc
            int r7 = r14.index
            int r7 = r7 + r3
            java.util.List<okhttp3.Interceptor> r8 = r14.interceptors
            int r8 = r8.size()
            if (r7 >= r8) goto Lbc
            int r15 = r15.calls
            if (r15 != r3) goto Lba
            goto Lbc
        Lba:
            r15 = 0
            goto Lbd
        Lbc:
            r15 = 1
        Lbd:
            if (r15 == 0) goto Lc0
            goto Ldc
        Lc0:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r4)
            r15.append(r0)
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r15 = r15.toString()
            r0.<init>(r15)
            throw r0
        Ldc:
            okhttp3.ResponseBody r15 = r5.body()
            if (r15 == 0) goto Le3
            r2 = 1
        Le3:
            if (r2 == 0) goto Le6
            return r5
        Le6:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r6)
            r15.append(r0)
            java.lang.String r0 = " returned a response with no body"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r15 = r15.toString()
            r0.<init>(r15)
            throw r0
        L104:
            java.lang.NullPointerException r15 = new java.lang.NullPointerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r0)
            java.lang.String r0 = " returned null"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.<init>(r0)
            throw r15
        L11e:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
    }

    @Override // okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
            r1 = this;
            int r0 = r1.readTimeoutMillis
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    @org.jetbrains.annotations.NotNull
    public okhttp3.Request request() {
            r1 = this;
            okhttp3.Request r0 = r1.request
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    @org.jetbrains.annotations.NotNull
    public okhttp3.Interceptor.Chain withConnectTimeout(int r11, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r12) {
            r10 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            okhttp3.internal.connection.Exchange r0 = r10.exchange
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L24
            r2 = 0
            r3 = 0
            r4 = 0
            long r0 = (long) r11
            java.lang.String r11 = "connectTimeout"
            int r5 = okhttp3.internal.Util.checkDuration(r11, r0, r12)
            r6 = 0
            r7 = 0
            r8 = 55
            r9 = 0
            r1 = r10
            okhttp3.internal.http.RealInterceptorChain r11 = copy$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        L24:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Timeouts can't be adjusted in a network interceptor"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    @Override // okhttp3.Interceptor.Chain
    @org.jetbrains.annotations.NotNull
    public okhttp3.Interceptor.Chain withReadTimeout(int r11, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r12) {
            r10 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            okhttp3.internal.connection.Exchange r0 = r10.exchange
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L24
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            long r0 = (long) r11
            java.lang.String r11 = "readTimeout"
            int r6 = okhttp3.internal.Util.checkDuration(r11, r0, r12)
            r7 = 0
            r8 = 47
            r9 = 0
            r1 = r10
            okhttp3.internal.http.RealInterceptorChain r11 = copy$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        L24:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Timeouts can't be adjusted in a network interceptor"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    @Override // okhttp3.Interceptor.Chain
    @org.jetbrains.annotations.NotNull
    public okhttp3.Interceptor.Chain withWriteTimeout(int r11, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r12) {
            r10 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            okhttp3.internal.connection.Exchange r0 = r10.exchange
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L25
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            long r0 = (long) r11
            java.lang.String r11 = "writeTimeout"
            int r7 = okhttp3.internal.Util.checkDuration(r11, r0, r12)
            r8 = 31
            r9 = 0
            r1 = r10
            okhttp3.internal.http.RealInterceptorChain r11 = copy$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        L25:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Timeouts can't be adjusted in a network interceptor"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
            r1 = this;
            int r0 = r1.writeTimeoutMillis
            return r0
    }
}
