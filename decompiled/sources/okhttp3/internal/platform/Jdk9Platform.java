package okhttp3.internal.platform;

/* JADX INFO: compiled from: Jdk9Platform.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\nH\u0017J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/platform/Jdk9Platform;", "Lokhttp3/internal/platform/Platform;", "()V", "configureTlsExtensions", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "getSelectedProtocol", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public class Jdk9Platform extends okhttp3.internal.platform.Platform {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.Jdk9Platform.Companion Companion = null;
    private static final boolean isAvailable = false;

    /* JADX INFO: compiled from: Jdk9Platform.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, d2 = {"Lokhttp3/internal/platform/Jdk9Platform$Companion;", "", "()V", "isAvailable", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/Jdk9Platform;", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.platform.Jdk9Platform buildIfSupported() {
                r1 = this;
                boolean r0 = r1.isAvailable()
                if (r0 == 0) goto Lc
                okhttp3.internal.platform.Jdk9Platform r0 = new okhttp3.internal.platform.Jdk9Platform
                r0.<init>()
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public final boolean isAvailable() {
                r1 = this;
                boolean r0 = okhttp3.internal.platform.Jdk9Platform.access$isAvailable$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.platform.Jdk9Platform$Companion r0 = new okhttp3.internal.platform.Jdk9Platform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.Jdk9Platform.Companion = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L14
            java.lang.Integer r1 = kotlin.text.StringsKt.toIntOrNull(r0)
        L14:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L23
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L21
            goto L2c
        L21:
            r0 = 0
            goto L2c
        L23:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L21
            r1.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L21
        L2c:
            okhttp3.internal.platform.Jdk9Platform.isAvailable = r0
            return
    }

    public Jdk9Platform() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ boolean access$isAvailable$cp() {
            boolean r0 = okhttp3.internal.platform.Jdk9Platform.isAvailable
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    @okhttp3.internal.SuppressSignatureCheck
    public void configureTlsExtensions(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.Protocol> r4) {
            r1 = this;
            java.lang.String r3 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.String r3 = "protocols"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            javax.net.ssl.SSLParameters r3 = r2.getSSLParameters()
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            java.util.List r4 = r0.alpnProtocolNames(r4)
            java.lang.String r0 = "sslParameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r3.setApplicationProtocols(r4)
            r2.setSSLParameters(r3)
            return
    }

    @Override // okhttp3.internal.platform.Platform
    @okhttp3.internal.SuppressSignatureCheck
    @org.jetbrains.annotations.Nullable
    public java.lang.String getSelectedProtocol(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r3) {
            r2 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            java.lang.String r3 = r3.getApplicationProtocol()     // Catch: java.lang.UnsupportedOperationException -> L1f
            if (r3 != 0) goto Le
            goto L1f
        Le:
            int r1 = r3.hashCode()     // Catch: java.lang.UnsupportedOperationException -> L1f
            if (r1 == 0) goto L15
            goto L1e
        L15:
            java.lang.String r1 = ""
            boolean r1 = r3.equals(r1)     // Catch: java.lang.UnsupportedOperationException -> L1f
            if (r1 == 0) goto L1e
            goto L1f
        L1e:
            r0 = r3
        L1f:
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    @org.jetbrains.annotations.Nullable
    public javax.net.ssl.X509TrustManager trustManager(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            java.lang.String r0 = "sslSocketFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 8 (>= 252) or JDK 9+"
            r2.<init>(r0)
            throw r2
    }
}
