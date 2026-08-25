package okhttp3.internal.http;

/* JADX INFO: compiled from: CallServerInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class CallServerInterceptor implements okhttp3.Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.forWebSocket = r1
            return
    }

    @Override // okhttp3.Interceptor
    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r13) throws java.io.IOException {
            r12 = this;
            java.lang.String r0 = "Connection"
            java.lang.String r1 = "close"
            java.lang.String r2 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            okhttp3.internal.http.RealInterceptorChain r13 = (okhttp3.internal.http.RealInterceptorChain) r13
            okhttp3.internal.connection.Exchange r2 = r13.getExchange$okhttp()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okhttp3.Request r13 = r13.getRequest$okhttp()
            okhttp3.RequestBody r3 = r13.body()
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 0
            r7 = 1
            r8 = 0
            r2.writeRequestHeaders(r13)     // Catch: java.io.IOException -> L9a
            java.lang.String r9 = r13.method()     // Catch: java.io.IOException -> L9a
            boolean r9 = okhttp3.internal.http.HttpMethod.permitsRequestBody(r9)     // Catch: java.io.IOException -> L9a
            if (r9 == 0) goto L89
            if (r3 == 0) goto L89
            java.lang.String r9 = "100-continue"
            java.lang.String r10 = "Expect"
            java.lang.String r10 = r13.header(r10)     // Catch: java.io.IOException -> L9a
            boolean r9 = kotlin.text.StringsKt.equals(r9, r10)     // Catch: java.io.IOException -> L9a
            if (r9 == 0) goto L4c
            r2.flushRequest()     // Catch: java.io.IOException -> L9a
            okhttp3.Response$Builder r9 = r2.readResponseHeaders(r7)     // Catch: java.io.IOException -> L9a
            r2.responseHeadersStart()     // Catch: java.io.IOException -> L4a
            r10 = 0
            goto L4e
        L4a:
            r3 = move-exception
            goto L9c
        L4c:
            r9 = r8
            r10 = 1
        L4e:
            if (r9 != 0) goto L74
            boolean r11 = r3.isDuplex()     // Catch: java.io.IOException -> L86
            if (r11 == 0) goto L65
            r2.flushRequest()     // Catch: java.io.IOException -> L86
            okio.Sink r7 = r2.createRequestBody(r13, r7)     // Catch: java.io.IOException -> L86
            okio.BufferedSink r7 = okio.Okio.buffer(r7)     // Catch: java.io.IOException -> L86
            r3.writeTo(r7)     // Catch: java.io.IOException -> L86
            goto L84
        L65:
            okio.Sink r7 = r2.createRequestBody(r13, r6)     // Catch: java.io.IOException -> L86
            okio.BufferedSink r7 = okio.Okio.buffer(r7)     // Catch: java.io.IOException -> L86
            r3.writeTo(r7)     // Catch: java.io.IOException -> L86
            r7.close()     // Catch: java.io.IOException -> L86
            goto L84
        L74:
            r2.noRequestBody()     // Catch: java.io.IOException -> L86
            okhttp3.internal.connection.RealConnection r7 = r2.getConnection$okhttp()     // Catch: java.io.IOException -> L86
            boolean r7 = r7.isMultiplexed$okhttp()     // Catch: java.io.IOException -> L86
            if (r7 != 0) goto L84
            r2.noNewExchangesOnConnection()     // Catch: java.io.IOException -> L86
        L84:
            r7 = r10
            goto L8d
        L86:
            r3 = move-exception
            r7 = r10
            goto L9c
        L89:
            r2.noRequestBody()     // Catch: java.io.IOException -> L9a
            r9 = r8
        L8d:
            if (r3 == 0) goto L95
            boolean r3 = r3.isDuplex()     // Catch: java.io.IOException -> L4a
            if (r3 != 0) goto L98
        L95:
            r2.finishRequest()     // Catch: java.io.IOException -> L4a
        L98:
            r3 = r8
            goto La6
        L9a:
            r3 = move-exception
            r9 = r8
        L9c:
            boolean r10 = r3 instanceof okhttp3.internal.http2.ConnectionShutdownException
            if (r10 != 0) goto L1a5
            boolean r10 = r2.getHasFailure$okhttp()
            if (r10 == 0) goto L1a4
        La6:
            if (r9 != 0) goto Lb5
            okhttp3.Response$Builder r9 = r2.readResponseHeaders(r6)     // Catch: java.io.IOException -> L19c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)     // Catch: java.io.IOException -> L19c
            if (r7 == 0) goto Lb5
            r2.responseHeadersStart()     // Catch: java.io.IOException -> L19c
            r7 = 0
        Lb5:
            okhttp3.Response$Builder r9 = r9.request(r13)     // Catch: java.io.IOException -> L19c
            okhttp3.internal.connection.RealConnection r10 = r2.getConnection$okhttp()     // Catch: java.io.IOException -> L19c
            okhttp3.Handshake r10 = r10.handshake()     // Catch: java.io.IOException -> L19c
            okhttp3.Response$Builder r9 = r9.handshake(r10)     // Catch: java.io.IOException -> L19c
            okhttp3.Response$Builder r9 = r9.sentRequestAtMillis(r4)     // Catch: java.io.IOException -> L19c
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L19c
            okhttp3.Response$Builder r9 = r9.receivedResponseAtMillis(r10)     // Catch: java.io.IOException -> L19c
            okhttp3.Response r9 = r9.build()     // Catch: java.io.IOException -> L19c
            int r10 = r9.code()     // Catch: java.io.IOException -> L19c
            r11 = 100
            if (r10 != r11) goto L10d
            okhttp3.Response$Builder r6 = r2.readResponseHeaders(r6)     // Catch: java.io.IOException -> L19c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.io.IOException -> L19c
            if (r7 == 0) goto Le9
            r2.responseHeadersStart()     // Catch: java.io.IOException -> L19c
        Le9:
            okhttp3.Response$Builder r13 = r6.request(r13)     // Catch: java.io.IOException -> L19c
            okhttp3.internal.connection.RealConnection r6 = r2.getConnection$okhttp()     // Catch: java.io.IOException -> L19c
            okhttp3.Handshake r6 = r6.handshake()     // Catch: java.io.IOException -> L19c
            okhttp3.Response$Builder r13 = r13.handshake(r6)     // Catch: java.io.IOException -> L19c
            okhttp3.Response$Builder r13 = r13.sentRequestAtMillis(r4)     // Catch: java.io.IOException -> L19c
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L19c
            okhttp3.Response$Builder r13 = r13.receivedResponseAtMillis(r4)     // Catch: java.io.IOException -> L19c
            okhttp3.Response r9 = r13.build()     // Catch: java.io.IOException -> L19c
            int r10 = r9.code()     // Catch: java.io.IOException -> L19c
        L10d:
            r2.responseHeadersEnd(r9)     // Catch: java.io.IOException -> L19c
            boolean r13 = r12.forWebSocket     // Catch: java.io.IOException -> L19c
            if (r13 == 0) goto L127
            r13 = 101(0x65, float:1.42E-43)
            if (r10 != r13) goto L127
            okhttp3.Response$Builder r13 = r9.newBuilder()     // Catch: java.io.IOException -> L19c
            okhttp3.ResponseBody r4 = okhttp3.internal.Util.EMPTY_RESPONSE     // Catch: java.io.IOException -> L19c
            okhttp3.Response$Builder r13 = r13.body(r4)     // Catch: java.io.IOException -> L19c
            okhttp3.Response r13 = r13.build()     // Catch: java.io.IOException -> L19c
            goto L137
        L127:
            okhttp3.Response$Builder r13 = r9.newBuilder()     // Catch: java.io.IOException -> L19c
            okhttp3.ResponseBody r4 = r2.openResponseBody(r9)     // Catch: java.io.IOException -> L19c
            okhttp3.Response$Builder r13 = r13.body(r4)     // Catch: java.io.IOException -> L19c
            okhttp3.Response r13 = r13.build()     // Catch: java.io.IOException -> L19c
        L137:
            okhttp3.Request r4 = r13.request()     // Catch: java.io.IOException -> L19c
            java.lang.String r4 = r4.header(r0)     // Catch: java.io.IOException -> L19c
            boolean r4 = kotlin.text.StringsKt.equals(r1, r4)     // Catch: java.io.IOException -> L19c
            if (r4 != 0) goto L150
            r4 = 2
            java.lang.String r0 = okhttp3.Response.header$default(r13, r0, r8, r4, r8)     // Catch: java.io.IOException -> L19c
            boolean r0 = kotlin.text.StringsKt.equals(r1, r0)     // Catch: java.io.IOException -> L19c
            if (r0 == 0) goto L153
        L150:
            r2.noNewExchangesOnConnection()     // Catch: java.io.IOException -> L19c
        L153:
            r0 = 204(0xcc, float:2.86E-43)
            if (r10 == r0) goto L15b
            r0 = 205(0xcd, float:2.87E-43)
            if (r10 != r0) goto L19b
        L15b:
            okhttp3.ResponseBody r0 = r13.body()     // Catch: java.io.IOException -> L19c
            if (r0 == 0) goto L166
            long r0 = r0.contentLength()     // Catch: java.io.IOException -> L19c
            goto L168
        L166:
            r0 = -1
        L168:
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L19b
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch: java.io.IOException -> L19c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L19c
            r1.<init>()     // Catch: java.io.IOException -> L19c
            java.lang.String r2 = "HTTP "
            r1.append(r2)     // Catch: java.io.IOException -> L19c
            r1.append(r10)     // Catch: java.io.IOException -> L19c
            java.lang.String r2 = " had non-zero Content-Length: "
            r1.append(r2)     // Catch: java.io.IOException -> L19c
            okhttp3.ResponseBody r13 = r13.body()     // Catch: java.io.IOException -> L19c
            if (r13 == 0) goto L190
            long r4 = r13.contentLength()     // Catch: java.io.IOException -> L19c
            java.lang.Long r8 = java.lang.Long.valueOf(r4)     // Catch: java.io.IOException -> L19c
        L190:
            r1.append(r8)     // Catch: java.io.IOException -> L19c
            java.lang.String r13 = r1.toString()     // Catch: java.io.IOException -> L19c
            r0.<init>(r13)     // Catch: java.io.IOException -> L19c
            throw r0     // Catch: java.io.IOException -> L19c
        L19b:
            return r13
        L19c:
            r13 = move-exception
            if (r3 == 0) goto L1a3
            kotlin.ExceptionsKt.addSuppressed(r3, r13)
            throw r3
        L1a3:
            throw r13
        L1a4:
            throw r3
        L1a5:
            throw r3
    }
}
