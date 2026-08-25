package okhttp3.internal.platform;

/* JADX INFO: compiled from: OpenJSSEPlatform.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\fH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/platform/OpenJSSEPlatform;", "Lokhttp3/internal/platform/Platform;", "()V", "provider", "Ljava/security/Provider;", "configureTlsExtensions", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "getSelectedProtocol", "newSSLContext", "Ljavax/net/ssl/SSLContext;", "platformTrustManager", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class OpenJSSEPlatform extends okhttp3.internal.platform.Platform {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.OpenJSSEPlatform.Companion Companion = null;
    private static final boolean isSupported = false;
    private final java.security.Provider provider;

    /* JADX INFO: compiled from: OpenJSSEPlatform.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, d2 = {"Lokhttp3/internal/platform/OpenJSSEPlatform$Companion;", "", "()V", "isSupported", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/OpenJSSEPlatform;", "okhttp"}, k = 1, mv = {1, 4, 1})
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
        public final okhttp3.internal.platform.OpenJSSEPlatform buildIfSupported() {
                r2 = this;
                boolean r0 = r2.isSupported()
                r1 = 0
                if (r0 == 0) goto Ld
                okhttp3.internal.platform.OpenJSSEPlatform r0 = new okhttp3.internal.platform.OpenJSSEPlatform
                r0.<init>(r1)
                r1 = r0
            Ld:
                return r1
        }

        public final boolean isSupported() {
                r1 = this;
                boolean r0 = okhttp3.internal.platform.OpenJSSEPlatform.access$isSupported$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.platform.OpenJSSEPlatform$Companion r0 = new okhttp3.internal.platform.OpenJSSEPlatform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.OpenJSSEPlatform.Companion = r0
            r1 = 0
            java.lang.String r2 = "org.openjsse.net.ssl.OpenJSSE"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L17
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L17
            java.lang.Class.forName(r2, r1, r0)     // Catch: java.lang.ClassNotFoundException -> L17
            r1 = 1
        L17:
            okhttp3.internal.platform.OpenJSSEPlatform.isSupported = r1
            return
    }

    private OpenJSSEPlatform() {
            r1 = this;
            r1.<init>()
            org.openjsse.net.ssl.OpenJSSE r0 = new org.openjsse.net.ssl.OpenJSSE
            r0.<init>()
            java.security.Provider r0 = (java.security.Provider) r0
            r1.provider = r0
            return
    }

    public /* synthetic */ OpenJSSEPlatform(kotlin.jvm.internal.DefaultConstructorMarker r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ boolean access$isSupported$cp() {
            boolean r0 = okhttp3.internal.platform.OpenJSSEPlatform.isSupported
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.Protocol> r5) {
            r2 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "protocols"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r3 instanceof org.openjsse.javax.net.ssl.SSLSocket
            if (r0 == 0) goto L36
            org.openjsse.javax.net.ssl.SSLSocket r3 = (org.openjsse.javax.net.ssl.SSLSocket) r3
            javax.net.ssl.SSLParameters r4 = r3.getSSLParameters()
            boolean r0 = r4 instanceof org.openjsse.javax.net.ssl.SSLParameters
            if (r0 == 0) goto L39
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            java.util.List r5 = r0.alpnProtocolNames(r5)
            r0 = r4
            org.openjsse.javax.net.ssl.SSLParameters r0 = (org.openjsse.javax.net.ssl.SSLParameters) r0
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r5 = r5.toArray(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r5, r1)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r0.setApplicationProtocols(r5)
            r3.setSSLParameters(r4)
            goto L39
        L36:
            super.configureTlsExtensions(r3, r4, r5)
        L39:
            return
    }

    @Override // okhttp3.internal.platform.Platform
    @org.jetbrains.annotations.Nullable
    public java.lang.String getSelectedProtocol(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r2 instanceof org.openjsse.javax.net.ssl.SSLSocket
            if (r0 == 0) goto L23
            org.openjsse.javax.net.ssl.SSLSocket r2 = (org.openjsse.javax.net.ssl.SSLSocket) r2
            java.lang.String r2 = r2.getApplicationProtocol()
            if (r2 != 0) goto L12
            goto L21
        L12:
            int r0 = r2.hashCode()
            if (r0 == 0) goto L19
            goto L27
        L19:
            java.lang.String r0 = ""
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L27
        L21:
            r2 = 0
            goto L27
        L23:
            java.lang.String r2 = super.getSelectedProtocol(r2)
        L27:
            return r2
    }

    @Override // okhttp3.internal.platform.Platform
    @org.jetbrains.annotations.NotNull
    public javax.net.ssl.SSLContext newSSLContext() {
            r2 = this;
            java.security.Provider r0 = r2.provider
            java.lang.String r1 = "TLSv1.3"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r1, r0)
            java.lang.String r1 = "SSLContext.getInstance(\"TLSv1.3\", provider)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    @org.jetbrains.annotations.NotNull
    public javax.net.ssl.X509TrustManager platformTrustManager() {
            r4 = this;
            java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
            java.security.Provider r1 = r4.provider
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0, r1)
            r1 = 0
            r0.init(r1)
            java.lang.String r1 = "factory"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            javax.net.ssl.TrustManager[] r0 = r0.getTrustManagers()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L26
            r1 = r0[r3]
            boolean r1 = r1 instanceof javax.net.ssl.X509TrustManager
            if (r1 == 0) goto L26
            goto L27
        L26:
            r2 = 0
        L27:
            if (r2 == 0) goto L33
            r0 = r0[r3]
            java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"
            java.util.Objects.requireNonNull(r0, r1)
            javax.net.ssl.X509TrustManager r0 = (javax.net.ssl.X509TrustManager) r0
            return r0
        L33:
            java.lang.String r1 = "Unexpected default trust managers: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.String r2 = "java.util.Arrays.toString(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // okhttp3.internal.platform.Platform
    @org.jetbrains.annotations.Nullable
    public javax.net.ssl.X509TrustManager trustManager(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            java.lang.String r0 = "sslSocketFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE"
            r2.<init>(r0)
            throw r2
    }
}
