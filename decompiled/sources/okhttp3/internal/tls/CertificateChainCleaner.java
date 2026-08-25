package okhttp3.internal.tls;

/* JADX INFO: compiled from: CertificateChainCleaner.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lokhttp3/internal/tls/CertificateChainCleaner;", "", "()V", "clean", "", "Ljava/security/cert/Certificate;", "chain", "hostname", "", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public abstract class CertificateChainCleaner {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.tls.CertificateChainCleaner.Companion Companion = null;

    /* JADX INFO: compiled from: CertificateChainCleaner.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001f\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/tls/CertificateChainCleaner$Companion;", "", "()V", "get", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "caCerts", "", "Ljava/security/cert/X509Certificate;", "([Ljava/security/cert/X509Certificate;)Lokhttp3/internal/tls/CertificateChainCleaner;", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.tls.CertificateChainCleaner get(@org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r2) {
                r1 = this;
                java.lang.String r0 = "trustManager"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
                okhttp3.internal.platform.Platform r0 = r0.get()
                okhttp3.internal.tls.CertificateChainCleaner r2 = r0.buildCertificateChainCleaner(r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.tls.CertificateChainCleaner get(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate... r4) {
                r3 = this;
                java.lang.String r0 = "caCerts"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okhttp3.internal.tls.BasicCertificateChainCleaner r0 = new okhttp3.internal.tls.BasicCertificateChainCleaner
                okhttp3.internal.tls.BasicTrustRootIndex r1 = new okhttp3.internal.tls.BasicTrustRootIndex
                int r2 = r4.length
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)
                java.security.cert.X509Certificate[] r4 = (java.security.cert.X509Certificate[]) r4
                r1.<init>(r4)
                r0.<init>(r1)
                return r0
        }
    }

    static {
            okhttp3.internal.tls.CertificateChainCleaner$Companion r0 = new okhttp3.internal.tls.CertificateChainCleaner$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.tls.CertificateChainCleaner.Companion = r0
            return
    }

    public CertificateChainCleaner() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<java.security.cert.Certificate> clean(@org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r1, @org.jetbrains.annotations.NotNull java.lang.String r2) throws javax.net.ssl.SSLPeerUnverifiedException;
}
