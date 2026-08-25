package okhttp3.internal.connection;

/* JADX INFO: compiled from: ConnectionSpecSelector.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\rH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/connection/ConnectionSpecSelector;", "", "connectionSpecs", "", "Lokhttp3/ConnectionSpec;", "(Ljava/util/List;)V", "isFallback", "", "isFallbackPossible", "nextModeIndex", "", "configureSecureSocket", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "connectionFailed", "e", "Ljava/io/IOException;", "socket", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class ConnectionSpecSelector {
    private final java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.ConnectionSpec> r2) {
            r1 = this;
            java.lang.String r0 = "connectionSpecs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.connectionSpecs = r2
            return
    }

    private final boolean isFallbackPossible(javax.net.ssl.SSLSocket r4) {
            r3 = this;
            int r0 = r3.nextModeIndex
            java.util.List<okhttp3.ConnectionSpec> r1 = r3.connectionSpecs
            int r1 = r1.size()
        L8:
            if (r0 >= r1) goto L1d
            java.util.List<okhttp3.ConnectionSpec> r2 = r3.connectionSpecs
            java.lang.Object r2 = r2.get(r0)
            okhttp3.ConnectionSpec r2 = (okhttp3.ConnectionSpec) r2
            boolean r2 = r2.isCompatible(r4)
            if (r2 == 0) goto L1a
            r4 = 1
            return r4
        L1a:
            int r0 = r0 + 1
            goto L8
        L1d:
            r4 = 0
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.ConnectionSpec configureSecureSocket(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r4.nextModeIndex
            java.util.List<okhttp3.ConnectionSpec> r1 = r4.connectionSpecs
            int r1 = r1.size()
        Le:
            if (r0 >= r1) goto L26
            java.util.List<okhttp3.ConnectionSpec> r2 = r4.connectionSpecs
            java.lang.Object r2 = r2.get(r0)
            okhttp3.ConnectionSpec r2 = (okhttp3.ConnectionSpec) r2
            boolean r3 = r2.isCompatible(r5)
            if (r3 == 0) goto L23
            int r0 = r0 + 1
            r4.nextModeIndex = r0
            goto L27
        L23:
            int r0 = r0 + 1
            goto Le
        L26:
            r2 = 0
        L27:
            if (r2 == 0) goto L35
            boolean r0 = r4.isFallbackPossible(r5)
            r4.isFallbackPossible = r0
            boolean r0 = r4.isFallback
            r2.apply$okhttp(r5, r0)
            return r2
        L35:
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            java.lang.String r1 = "Unable to find acceptable protocols. isFallback="
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            boolean r2 = r4.isFallback
            r1.append(r2)
            r2 = 44
            r1.append(r2)
            java.lang.String r3 = " modes="
            r1.append(r3)
            java.util.List<okhttp3.ConnectionSpec> r3 = r4.connectionSpecs
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = " supported protocols="
            r1.append(r2)
            java.lang.String[] r5 = r5.getEnabledProtocols()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            java.lang.String r5 = java.util.Arrays.toString(r5)
            java.lang.String r2 = "java.util.Arrays.toString(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    public final boolean connectionFailed(@org.jetbrains.annotations.NotNull java.io.IOException r4) {
            r3 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 1
            r3.isFallback = r0
            boolean r1 = r3.isFallbackPossible
            r2 = 0
            if (r1 != 0) goto Lf
        Ld:
            r0 = 0
            goto L2f
        Lf:
            boolean r1 = r4 instanceof java.net.ProtocolException
            if (r1 == 0) goto L14
            goto Ld
        L14:
            boolean r1 = r4 instanceof java.io.InterruptedIOException
            if (r1 == 0) goto L19
            goto Ld
        L19:
            boolean r1 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r1 == 0) goto L26
            java.lang.Throwable r1 = r4.getCause()
            boolean r1 = r1 instanceof java.security.cert.CertificateException
            if (r1 == 0) goto L26
            goto Ld
        L26:
            boolean r1 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r1 == 0) goto L2b
            goto Ld
        L2b:
            boolean r4 = r4 instanceof javax.net.ssl.SSLException
            if (r4 == 0) goto Ld
        L2f:
            return r0
    }
}
