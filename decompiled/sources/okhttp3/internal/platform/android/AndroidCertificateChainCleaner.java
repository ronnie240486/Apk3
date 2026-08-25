package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: AndroidCertificateChainCleaner.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManagerExtensions", "Landroid/net/http/X509TrustManagerExtensions;", "(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V", "clean", "", "Ljava/security/cert/Certificate;", "chain", "hostname", "", "equals", "", "other", "", "hashCode", "", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class AndroidCertificateChainCleaner extends okhttp3.internal.tls.CertificateChainCleaner {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.android.AndroidCertificateChainCleaner.Companion Companion = null;
    private final javax.net.ssl.X509TrustManager trustManager;
    private final android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions;

    /* JADX INFO: compiled from: AndroidCertificateChainCleaner.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner$Companion;", "", "()V", "buildIfSupported", "Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        @okhttp3.internal.SuppressSignatureCheck
        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.platform.android.AndroidCertificateChainCleaner buildIfSupported(@org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r3) {
                r2 = this;
                java.lang.String r0 = "trustManager"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
                android.net.http.X509TrustManagerExtensions r1 = new android.net.http.X509TrustManagerExtensions     // Catch: java.lang.IllegalArgumentException -> Ld
                r1.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> Ld
                goto Le
            Ld:
                r1 = r0
            Le:
                if (r1 == 0) goto L15
                okhttp3.internal.platform.android.AndroidCertificateChainCleaner r0 = new okhttp3.internal.platform.android.AndroidCertificateChainCleaner
                r0.<init>(r3, r1)
            L15:
                return r0
        }
    }

    static {
            okhttp3.internal.platform.android.AndroidCertificateChainCleaner$Companion r0 = new okhttp3.internal.platform.android.AndroidCertificateChainCleaner$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.android.AndroidCertificateChainCleaner.Companion = r0
            return
    }

    public AndroidCertificateChainCleaner(@org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r2, @org.jetbrains.annotations.NotNull android.net.http.X509TrustManagerExtensions r3) {
            r1 = this;
            java.lang.String r0 = "trustManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "x509TrustManagerExtensions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.trustManager = r2
            r1.x509TrustManagerExtensions = r3
            return
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    @okhttp3.internal.SuppressSignatureCheck
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.security.cert.Certificate> clean(@org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r3, @org.jetbrains.annotations.NotNull java.lang.String r4) throws javax.net.ssl.SSLPeerUnverifiedException {
            r2 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r3, r0)
            java.security.cert.X509Certificate[] r3 = (java.security.cert.X509Certificate[]) r3
            android.net.http.X509TrustManagerExtensions r0 = r2.x509TrustManagerExtensions     // Catch: java.security.cert.CertificateException -> L27
            java.lang.String r1 = "RSA"
            java.util.List r3 = r0.checkServerTrusted(r3, r1, r4)     // Catch: java.security.cert.CertificateException -> L27
            java.lang.String r4 = "x509TrustManagerExtensio…ficates, \"RSA\", hostname)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.security.cert.CertificateException -> L27
            return r3
        L27:
            r3 = move-exception
            javax.net.ssl.SSLPeerUnverifiedException r4 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r0 = r3.getMessage()
            r4.<init>(r0)
            r4.initCause(r3)
            throw r4
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okhttp3.internal.platform.android.AndroidCertificateChainCleaner
            if (r0 == 0) goto Le
            okhttp3.internal.platform.android.AndroidCertificateChainCleaner r2 = (okhttp3.internal.platform.android.AndroidCertificateChainCleaner) r2
            javax.net.ssl.X509TrustManager r2 = r2.trustManager
            javax.net.ssl.X509TrustManager r0 = r1.trustManager
            if (r2 != r0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    public int hashCode() {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = r1.trustManager
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }
}
