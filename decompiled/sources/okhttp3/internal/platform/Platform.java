package okhttp3.internal.platform;

/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 /2\u00020\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J-\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u00130\u0011H\u0016J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0006\u0010\u001b\u001a\u00020\u000fJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020\u001a2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010,\u001a\u00020\nH\u0016J\b\u0010-\u001a\u00020\u000fH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010.\u001a\u00020+H\u0016¨\u00060"}, d2 = {"Lokhttp3/internal/platform/Platform;", "", "()V", "afterHandshake", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "buildTrustRootIndex", "Lokhttp3/internal/tls/TrustRootIndex;", "configureTlsExtensions", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "connectSocket", "socket", "Ljava/net/Socket;", "address", "Ljava/net/InetSocketAddress;", "connectTimeout", "", "getPrefix", "getSelectedProtocol", "getStackTraceForCloseable", "closer", "isCleartextTrafficPermitted", "", "log", "message", "level", "t", "", "logCloseableLeak", "stackTrace", "newSSLContext", "Ljavax/net/ssl/SSLContext;", "newSslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "platformTrustManager", "toString", "sslSocketFactory", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public class Platform {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.Platform.Companion Companion = null;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final java.util.logging.Logger logger = null;
    private static volatile okhttp3.internal.platform.Platform platform;

    /* JADX INFO: compiled from: Platform.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012J\u0014\u0010\u0016\u001a\u00020\u00172\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/platform/Platform$Companion;", "", "()V", "INFO", "", "WARN", "isAndroid", "", "()Z", "isBouncyCastlePreferred", "isConscryptPreferred", "isOpenJSSEPreferred", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "platform", "Lokhttp3/internal/platform/Platform;", "alpnProtocolNames", "", "", "protocols", "Lokhttp3/Protocol;", "concatLengthPrefixed", "", "findAndroidPlatform", "findJvmPlatform", "findPlatform", "get", "resetForTests", "", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        public static final /* synthetic */ okhttp3.internal.platform.Platform access$findPlatform(okhttp3.internal.platform.Platform.Companion r0) {
                okhttp3.internal.platform.Platform r0 = r0.findPlatform()
                return r0
        }

        private final okhttp3.internal.platform.Platform findAndroidPlatform() {
                r1 = this;
                okhttp3.internal.platform.android.AndroidLog r0 = okhttp3.internal.platform.android.AndroidLog.INSTANCE
                r0.enable()
                okhttp3.internal.platform.Android10Platform$Companion r0 = okhttp3.internal.platform.Android10Platform.Companion
                okhttp3.internal.platform.Platform r0 = r0.buildIfSupported()
                if (r0 == 0) goto Le
                goto L17
            Le:
                okhttp3.internal.platform.AndroidPlatform$Companion r0 = okhttp3.internal.platform.AndroidPlatform.Companion
                okhttp3.internal.platform.Platform r0 = r0.buildIfSupported()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            L17:
                return r0
        }

        private final okhttp3.internal.platform.Platform findJvmPlatform() {
                r1 = this;
                boolean r0 = r1.isConscryptPreferred()
                if (r0 == 0) goto Lf
                okhttp3.internal.platform.ConscryptPlatform$Companion r0 = okhttp3.internal.platform.ConscryptPlatform.Companion
                okhttp3.internal.platform.ConscryptPlatform r0 = r0.buildIfSupported()
                if (r0 == 0) goto Lf
                return r0
            Lf:
                boolean r0 = r1.isBouncyCastlePreferred()
                if (r0 == 0) goto L1e
                okhttp3.internal.platform.BouncyCastlePlatform$Companion r0 = okhttp3.internal.platform.BouncyCastlePlatform.Companion
                okhttp3.internal.platform.BouncyCastlePlatform r0 = r0.buildIfSupported()
                if (r0 == 0) goto L1e
                return r0
            L1e:
                boolean r0 = r1.isOpenJSSEPreferred()
                if (r0 == 0) goto L2d
                okhttp3.internal.platform.OpenJSSEPlatform$Companion r0 = okhttp3.internal.platform.OpenJSSEPlatform.Companion
                okhttp3.internal.platform.OpenJSSEPlatform r0 = r0.buildIfSupported()
                if (r0 == 0) goto L2d
                return r0
            L2d:
                okhttp3.internal.platform.Jdk9Platform$Companion r0 = okhttp3.internal.platform.Jdk9Platform.Companion
                okhttp3.internal.platform.Jdk9Platform r0 = r0.buildIfSupported()
                if (r0 == 0) goto L36
                return r0
            L36:
                okhttp3.internal.platform.Jdk8WithJettyBootPlatform$Companion r0 = okhttp3.internal.platform.Jdk8WithJettyBootPlatform.Companion
                okhttp3.internal.platform.Platform r0 = r0.buildIfSupported()
                if (r0 == 0) goto L3f
                return r0
            L3f:
                okhttp3.internal.platform.Platform r0 = new okhttp3.internal.platform.Platform
                r0.<init>()
                return r0
        }

        private final okhttp3.internal.platform.Platform findPlatform() {
                r1 = this;
                boolean r0 = r1.isAndroid()
                if (r0 == 0) goto Lb
                okhttp3.internal.platform.Platform r0 = r1.findAndroidPlatform()
                goto Lf
            Lb:
                okhttp3.internal.platform.Platform r0 = r1.findJvmPlatform()
            Lf:
                return r0
        }

        private final boolean isBouncyCastlePreferred() {
                r2 = this;
                java.security.Provider[] r0 = java.security.Security.getProviders()
                r1 = 0
                r0 = r0[r1]
                java.lang.String r1 = "Security.getProviders()[0]"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "BC"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                return r0
        }

        private final boolean isConscryptPreferred() {
                r2 = this;
                java.security.Provider[] r0 = java.security.Security.getProviders()
                r1 = 0
                r0 = r0[r1]
                java.lang.String r1 = "Security.getProviders()[0]"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "Conscrypt"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                return r0
        }

        private final boolean isOpenJSSEPreferred() {
                r2 = this;
                java.security.Provider[] r0 = java.security.Security.getProviders()
                r1 = 0
                r0 = r0[r1]
                java.lang.String r1 = "Security.getProviders()[0]"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "OpenJSSE"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                return r0
        }

        public static /* synthetic */ void resetForTests$default(okhttp3.internal.platform.Platform.Companion r0, okhttp3.internal.platform.Platform r1, int r2, java.lang.Object r3) {
                r2 = r2 & 1
                if (r2 == 0) goto L8
                okhttp3.internal.platform.Platform r1 = r0.findPlatform()
            L8:
                r0.resetForTests(r1)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> alpnProtocolNames(@org.jetbrains.annotations.NotNull java.util.List<? extends okhttp3.Protocol> r5) {
                r4 = this;
                java.lang.String r0 = "protocols"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r5 = r5.iterator()
            Le:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L28
                java.lang.Object r1 = r5.next()
                r2 = r1
                okhttp3.Protocol r2 = (okhttp3.Protocol) r2
                okhttp3.Protocol r3 = okhttp3.Protocol.HTTP_1_0
                if (r2 == r3) goto L21
                r2 = 1
                goto L22
            L21:
                r2 = 0
            L22:
                if (r2 == 0) goto Le
                r0.add(r1)
                goto Le
            L28:
                java.util.ArrayList r5 = new java.util.ArrayList
                int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0)
                r5.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L35:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L49
                java.lang.Object r1 = r0.next()
                okhttp3.Protocol r1 = (okhttp3.Protocol) r1
                java.lang.String r1 = r1.toString()
                r5.add(r1)
                goto L35
            L49:
                return r5
        }

        @org.jetbrains.annotations.NotNull
        public final byte[] concatLengthPrefixed(@org.jetbrains.annotations.NotNull java.util.List<? extends okhttp3.Protocol> r4) {
                r3 = this;
                java.lang.String r0 = "protocols"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                java.util.List r4 = r3.alpnProtocolNames(r4)
                java.util.Iterator r4 = r4.iterator()
            L12:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L29
                java.lang.Object r1 = r4.next()
                java.lang.String r1 = (java.lang.String) r1
                int r2 = r1.length()
                r0.writeByte(r2)
                r0.writeUtf8(r1)
                goto L12
            L29:
                byte[] r4 = r0.readByteArray()
                return r4
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.platform.Platform get() {
                r1 = this;
                okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.access$getPlatform$cp()
                return r0
        }

        public final boolean isAndroid() {
                r2 = this;
                java.lang.String r0 = "java.vm.name"
                java.lang.String r0 = java.lang.System.getProperty(r0)
                java.lang.String r1 = "Dalvik"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                return r0
        }

        public final void resetForTests(@org.jetbrains.annotations.NotNull okhttp3.internal.platform.Platform r2) {
                r1 = this;
                java.lang.String r0 = "platform"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.internal.platform.Platform.access$setPlatform$cp(r2)
                return
        }
    }

    static {
            okhttp3.internal.platform.Platform$Companion r0 = new okhttp3.internal.platform.Platform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.Platform.Companion = r0
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.Companion.access$findPlatform(r0)
            okhttp3.internal.platform.Platform.platform = r0
            java.lang.Class<okhttp3.OkHttpClient> r0 = okhttp3.OkHttpClient.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            okhttp3.internal.platform.Platform.logger = r0
            return
    }

    public Platform() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ okhttp3.internal.platform.Platform access$getPlatform$cp() {
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.platform
            return r0
    }

    public static final /* synthetic */ void access$setPlatform$cp(okhttp3.internal.platform.Platform r0) {
            okhttp3.internal.platform.Platform.platform = r0
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.Platform get() {
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            return r0
    }

    public static /* synthetic */ void log$default(okhttp3.internal.platform.Platform r1, java.lang.String r2, int r3, java.lang.Throwable r4, int r5, java.lang.Object r6) {
            if (r6 != 0) goto L10
            r6 = r5 & 2
            r0 = 4
            if (r6 == 0) goto L8
            r3 = 4
        L8:
            r5 = r5 & r0
            if (r5 == 0) goto Lc
            r4 = 0
        Lc:
            r1.log(r2, r3, r4)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: log"
            r1.<init>(r2)
            throw r1
    }

    public void afterHandshake(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.internal.tls.CertificateChainCleaner buildCertificateChainCleaner(@org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r2) {
            r1 = this;
            java.lang.String r0 = "trustManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.internal.tls.BasicCertificateChainCleaner r0 = new okhttp3.internal.tls.BasicCertificateChainCleaner
            okhttp3.internal.tls.TrustRootIndex r2 = r1.buildTrustRootIndex(r2)
            r0.<init>(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.internal.tls.TrustRootIndex buildTrustRootIndex(@org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r3) {
            r2 = this;
            java.lang.String r0 = "trustManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.internal.tls.BasicTrustRootIndex r0 = new okhttp3.internal.tls.BasicTrustRootIndex
            java.security.cert.X509Certificate[] r3 = r3.getAcceptedIssuers()
            java.lang.String r1 = "trustManager.acceptedIssuers"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.security.cert.X509Certificate[] r3 = (java.security.cert.X509Certificate[]) r3
            r0.<init>(r3)
            return r0
    }

    public void configureTlsExtensions(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.Protocol> r3) {
            r0 = this;
            java.lang.String r2 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r1 = "protocols"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            return
    }

    public void connectSocket(@org.jetbrains.annotations.NotNull java.net.Socket r2, @org.jetbrains.annotations.NotNull java.net.InetSocketAddress r3, int r4) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "socket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.connect(r3, r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPrefix() {
            r1 = this;
            java.lang.String r0 = "OkHttp"
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.String getSelectedProtocol(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object getStackTraceForCloseable(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "closer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.logging.Logger r0 = okhttp3.internal.platform.Platform.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L15
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r3)
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    public boolean isCleartextTrafficPermitted(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r2 = 1
            return r2
    }

    public void log(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, @org.jetbrains.annotations.Nullable java.lang.Throwable r4) {
            r1 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 5
            if (r3 != r0) goto Lb
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            goto Ld
        Lb:
            java.util.logging.Level r3 = java.util.logging.Level.INFO
        Ld:
            java.util.logging.Logger r0 = okhttp3.internal.platform.Platform.logger
            r0.log(r3, r2, r4)
            return
    }

    public void logCloseableLeak(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r1 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 != 0) goto Ld
            java.lang.String r0 = " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);"
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0)
        Ld:
            r0 = 5
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r1.log(r2, r0, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public javax.net.ssl.SSLContext newSSLContext() {
            r2 = this;
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)
            java.lang.String r1 = "SSLContext.getInstance(\"TLS\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public javax.net.ssl.SSLSocketFactory newSslSocketFactory(@org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r4) {
            r3 = this;
            java.lang.String r0 = "trustManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            javax.net.ssl.SSLContext r0 = r3.newSSLContext()     // Catch: java.security.GeneralSecurityException -> L1d
            r1 = 1
            javax.net.ssl.TrustManager[] r1 = new javax.net.ssl.TrustManager[r1]     // Catch: java.security.GeneralSecurityException -> L1d
            r2 = 0
            r1[r2] = r4     // Catch: java.security.GeneralSecurityException -> L1d
            r4 = 0
            r0.init(r4, r1, r4)     // Catch: java.security.GeneralSecurityException -> L1d
            javax.net.ssl.SSLSocketFactory r4 = r0.getSocketFactory()     // Catch: java.security.GeneralSecurityException -> L1d
            java.lang.String r0 = "newSSLContext().apply {\n…ll)\n      }.socketFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)     // Catch: java.security.GeneralSecurityException -> L1d
            return r4
        L1d:
            r4 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No System TLS: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public javax.net.ssl.X509TrustManager platformTrustManager() {
            r4 = this;
            java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0)
            r1 = 0
            r0.init(r1)
            java.lang.String r1 = "factory"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            javax.net.ssl.TrustManager[] r0 = r0.getTrustManagers()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L24
            r1 = r0[r3]
            boolean r1 = r1 instanceof javax.net.ssl.X509TrustManager
            if (r1 == 0) goto L24
            goto L25
        L24:
            r2 = 0
        L25:
            if (r2 == 0) goto L31
            r0 = r0[r3]
            java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"
            java.util.Objects.requireNonNull(r0, r1)
            javax.net.ssl.X509TrustManager r0 = (javax.net.ssl.X509TrustManager) r0
            return r0
        L31:
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

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "javaClass.simpleName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public javax.net.ssl.X509TrustManager trustManager(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r4) {
            r3 = this;
            java.lang.String r0 = "sslSocketFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            java.lang.String r1 = "sun.security.ssl.SSLContextImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L25
            java.lang.String r2 = "sslContextClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L25
            java.lang.String r2 = "context"
            java.lang.Object r4 = okhttp3.internal.Util.readFieldOrNull(r4, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L25
            if (r4 == 0) goto L25
            java.lang.Class<javax.net.ssl.X509TrustManager> r1 = javax.net.ssl.X509TrustManager.class
            java.lang.String r2 = "trustManager"
            java.lang.Object r4 = okhttp3.internal.Util.readFieldOrNull(r4, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L25
            javax.net.ssl.X509TrustManager r4 = (javax.net.ssl.X509TrustManager) r4     // Catch: java.lang.ClassNotFoundException -> L25
            r0 = r4
        L25:
            return r0
    }
}
