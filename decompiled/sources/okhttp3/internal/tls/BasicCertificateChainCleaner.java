package okhttp3.internal.tls;

/* JADX INFO: compiled from: BasicCertificateChainCleaner.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/tls/BasicCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustRootIndex", "Lokhttp3/internal/tls/TrustRootIndex;", "(Lokhttp3/internal/tls/TrustRootIndex;)V", "clean", "", "Ljava/security/cert/Certificate;", "chain", "hostname", "", "equals", "", "other", "", "hashCode", "", "verifySignature", "toVerify", "Ljava/security/cert/X509Certificate;", "signingCert", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class BasicCertificateChainCleaner extends okhttp3.internal.tls.CertificateChainCleaner {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.tls.BasicCertificateChainCleaner.Companion Companion = null;
    private static final int MAX_SIGNERS = 9;
    private final okhttp3.internal.tls.TrustRootIndex trustRootIndex;

    /* JADX INFO: compiled from: BasicCertificateChainCleaner.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/tls/BasicCertificateChainCleaner$Companion;", "", "()V", "MAX_SIGNERS", "", "okhttp"}, k = 1, mv = {1, 4, 1})
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
    }

    static {
            okhttp3.internal.tls.BasicCertificateChainCleaner$Companion r0 = new okhttp3.internal.tls.BasicCertificateChainCleaner$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.tls.BasicCertificateChainCleaner.Companion = r0
            return
    }

    public BasicCertificateChainCleaner(@org.jetbrains.annotations.NotNull okhttp3.internal.tls.TrustRootIndex r2) {
            r1 = this;
            java.lang.String r0 = "trustRootIndex"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.trustRootIndex = r2
            return
    }

    private final boolean verifySignature(java.security.cert.X509Certificate r4, java.security.cert.X509Certificate r5) {
            r3 = this;
            java.security.Principal r0 = r4.getIssuerDN()
            java.security.Principal r1 = r5.getSubjectDN()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 == 0) goto L12
            return r2
        L12:
            java.security.PublicKey r5 = r5.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L1a
            r4.verify(r5)     // Catch: java.security.GeneralSecurityException -> L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            return r1
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.security.cert.Certificate> clean(@org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r8, @org.jetbrains.annotations.NotNull java.lang.String r9) throws javax.net.ssl.SSLPeerUnverifiedException {
            r7 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.ArrayDeque r9 = new java.util.ArrayDeque
            r9.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r0 = r9.removeFirst()
            java.lang.String r1 = "queue.removeFirst()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r8.add(r0)
            r0 = 0
            r1 = 0
        L22:
            r2 = 9
            if (r0 >= r2) goto L99
            int r2 = r8.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r2 = r8.get(r2)
            java.lang.String r4 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            java.util.Objects.requireNonNull(r2, r4)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            okhttp3.internal.tls.TrustRootIndex r5 = r7.trustRootIndex
            java.security.cert.X509Certificate r5 = r5.findByIssuerAndSignature(r2)
            if (r5 == 0) goto L58
            int r1 = r8.size()
            if (r1 > r3) goto L4c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r5)
            r1 = r1 ^ r3
            if (r1 == 0) goto L4f
        L4c:
            r8.add(r5)
        L4f:
            boolean r1 = r7.verifySignature(r5, r5)
            if (r1 == 0) goto L56
            return r8
        L56:
            r1 = 1
            goto L7c
        L58:
            java.util.Iterator r3 = r9.iterator()
            java.lang.String r5 = "queue.iterator()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
        L61:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r3.next()
            java.util.Objects.requireNonNull(r5, r4)
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5
            boolean r6 = r7.verifySignature(r2, r5)
            if (r6 == 0) goto L61
            r3.remove()
            r8.add(r5)
        L7c:
            int r0 = r0 + 1
            goto L22
        L7f:
            if (r1 == 0) goto L82
            return r8
        L82:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L99:
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Certificate chain too long: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r3 != r2) goto L4
            goto L16
        L4:
            boolean r1 = r3 instanceof okhttp3.internal.tls.BasicCertificateChainCleaner
            if (r1 == 0) goto L15
            okhttp3.internal.tls.BasicCertificateChainCleaner r3 = (okhttp3.internal.tls.BasicCertificateChainCleaner) r3
            okhttp3.internal.tls.TrustRootIndex r3 = r3.trustRootIndex
            okhttp3.internal.tls.TrustRootIndex r1 = r2.trustRootIndex
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r3 == 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    public int hashCode() {
            r1 = this;
            okhttp3.internal.tls.TrustRootIndex r0 = r1.trustRootIndex
            int r0 = r0.hashCode()
            return r0
    }
}
