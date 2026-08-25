package okhttp3;

/* JADX INFO: compiled from: Handshake.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0001&B9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n¢\u0006\u0002\u0010\u000bJ\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\b J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\b!J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\b\"J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\b#J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b$J\b\u0010%\u001a\u00020\u0017H\u0016R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00078GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000f8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0017*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lokhttp3/Handshake;", "", "tlsVersion", "Lokhttp3/TlsVersion;", "cipherSuite", "Lokhttp3/CipherSuite;", "localCertificates", "", "Ljava/security/cert/Certificate;", "peerCertificatesFn", "Lkotlin/Function0;", "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "()Lokhttp3/CipherSuite;", "()Ljava/util/List;", "localPrincipal", "Ljava/security/Principal;", "()Ljava/security/Principal;", "peerCertificates", "peerCertificates$delegate", "Lkotlin/Lazy;", "peerPrincipal", "()Lokhttp3/TlsVersion;", "name", "", "getName", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "-deprecated_cipherSuite", "equals", "", "other", "hashCode", "", "-deprecated_localCertificates", "-deprecated_localPrincipal", "-deprecated_peerCertificates", "-deprecated_peerPrincipal", "-deprecated_tlsVersion", "toString", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Handshake {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Handshake.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.CipherSuite cipherSuite;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.security.cert.Certificate> localCertificates;

    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy peerCertificates$delegate;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.TlsVersion tlsVersion;

    /* JADX INFO: compiled from: Handshake.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0007J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0006H\u0007¢\u0006\u0002\b\u0003J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lokhttp3/Handshake$Companion;", "", "()V", "get", "Lokhttp3/Handshake;", "sslSession", "Ljavax/net/ssl/SSLSession;", "-deprecated_get", "tlsVersion", "Lokhttp3/TlsVersion;", "cipherSuite", "Lokhttp3/CipherSuite;", "peerCertificates", "", "Ljava/security/cert/Certificate;", "localCertificates", "handshake", "toImmutableList", "", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        private final java.util.List<java.security.cert.Certificate> toImmutableList(java.security.cert.Certificate[] r2) {
                r1 = this;
                if (r2 == 0) goto Le
                int r0 = r2.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
                java.security.cert.Certificate[] r2 = (java.security.cert.Certificate[]) r2
                java.util.List r2 = okhttp3.internal.Util.immutableListOf(r2)
                goto L12
            Le:
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L12:
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "sslSession.handshake()", imports = {}))
        @kotlin.jvm.JvmName(name = "-deprecated_get")
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.Handshake m1926deprecated_get(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSession r2) throws java.io.IOException {
                r1 = this;
                java.lang.String r0 = "sslSession"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.Handshake r2 = r1.get(r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Handshake get(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSession r6) throws java.io.IOException {
                r5 = this;
                java.lang.String r0 = "$this$handshake"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = r6.getCipherSuite()
                if (r0 == 0) goto L87
                int r1 = r0.hashCode()
                r2 = 1019404634(0x3cc2e15a, float:0.023789097)
                if (r1 == r2) goto L23
                r2 = 1208658923(0x480aabeb, float:141999.67)
                if (r1 == r2) goto L1a
                goto L2b
            L1a:
                java.lang.String r1 = "SSL_NULL_WITH_NULL_NULL"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L7b
                goto L2b
            L23:
                java.lang.String r1 = "TLS_NULL_WITH_NULL_NULL"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L7b
            L2b:
                okhttp3.CipherSuite$Companion r1 = okhttp3.CipherSuite.Companion
                okhttp3.CipherSuite r0 = r1.forJavaName(r0)
                java.lang.String r1 = r6.getProtocol()
                if (r1 == 0) goto L6e
                java.lang.String r2 = "NONE"
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
                if (r2 != 0) goto L65
                okhttp3.TlsVersion$Companion r2 = okhttp3.TlsVersion.Companion
                okhttp3.TlsVersion r1 = r2.forJavaName(r1)
                java.security.cert.Certificate[] r2 = r6.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L4e
                java.util.List r2 = r5.toImmutableList(r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L4e
                goto L52
            L4e:
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L52:
                okhttp3.Handshake r3 = new okhttp3.Handshake
                java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
                java.util.List r6 = r5.toImmutableList(r6)
                okhttp3.Handshake$Companion$handshake$1 r4 = new okhttp3.Handshake$Companion$handshake$1
                r4.<init>(r2)
                r3.<init>(r1, r0, r6, r4)
                return r3
            L65:
                java.io.IOException r6 = new java.io.IOException
                java.lang.String r0 = "tlsVersion == NONE"
                r6.<init>(r0)
                throw r6
            L6e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "tlsVersion == null"
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L7b:
                java.io.IOException r6 = new java.io.IOException
                java.lang.String r1 = "cipherSuite == "
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0)
                r6.<init>(r0)
                throw r6
            L87:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "cipherSuite == null"
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Handshake get(@org.jetbrains.annotations.NotNull okhttp3.TlsVersion r3, @org.jetbrains.annotations.NotNull okhttp3.CipherSuite r4, @org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r5, @org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r6) {
                r2 = this;
                java.lang.String r0 = "tlsVersion"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "cipherSuite"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "peerCertificates"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "localCertificates"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.util.List r5 = okhttp3.internal.Util.toImmutableList(r5)
                okhttp3.Handshake r0 = new okhttp3.Handshake
                java.util.List r6 = okhttp3.internal.Util.toImmutableList(r6)
                okhttp3.Handshake$Companion$get$1 r1 = new okhttp3.Handshake$Companion$get$1
                r1.<init>(r5)
                r0.<init>(r3, r4, r6, r1)
                return r0
        }
    }


    static {
            okhttp3.Handshake$Companion r0 = new okhttp3.Handshake$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Handshake.Companion = r0
            return
    }

    public Handshake(@org.jetbrains.annotations.NotNull okhttp3.TlsVersion r2, @org.jetbrains.annotations.NotNull okhttp3.CipherSuite r3, @org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.security.cert.Certificate>> r5) {
            r1 = this;
            java.lang.String r0 = "tlsVersion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "cipherSuite"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "localCertificates"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "peerCertificatesFn"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r1.<init>()
            r1.tlsVersion = r2
            r1.cipherSuite = r3
            r1.localCertificates = r4
            okhttp3.Handshake$peerCertificates$2 r2 = new okhttp3.Handshake$peerCertificates$2
            r2.<init>(r5)
            kotlin.Lazy r2 = kotlin.LazyKt.lazy(r2)
            r1.peerCertificates$delegate = r2
            return
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Handshake get(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSession r1) throws java.io.IOException {
            okhttp3.Handshake$Companion r0 = okhttp3.Handshake.Companion
            okhttp3.Handshake r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Handshake get(@org.jetbrains.annotations.NotNull okhttp3.TlsVersion r1, @org.jetbrains.annotations.NotNull okhttp3.CipherSuite r2, @org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r3, @org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r4) {
            okhttp3.Handshake$Companion r0 = okhttp3.Handshake.Companion
            okhttp3.Handshake r1 = r0.get(r1, r2, r3, r4)
            return r1
    }

    private final java.lang.String getName(java.security.cert.Certificate r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.security.cert.X509Certificate
            if (r0 == 0) goto Lf
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.security.Principal r2 = r2.getSubjectDN()
            java.lang.String r2 = r2.toString()
            goto L19
        Lf:
            java.lang.String r2 = r2.getType()
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
        L19:
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cipherSuite", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_cipherSuite")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_cipherSuite, reason: not valid java name */
    public final okhttp3.CipherSuite m1920deprecated_cipherSuite() {
            r1 = this;
            okhttp3.CipherSuite r0 = r1.cipherSuite
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "localCertificates", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_localCertificates")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final java.util.List<java.security.cert.Certificate> m1921deprecated_localCertificates() {
            r1 = this;
            java.util.List<java.security.cert.Certificate> r0 = r1.localCertificates
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "localPrincipal", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_localPrincipal")
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final java.security.Principal m1922deprecated_localPrincipal() {
            r1 = this;
            java.security.Principal r0 = r1.localPrincipal()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "peerCertificates", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_peerCertificates")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final java.util.List<java.security.cert.Certificate> m1923deprecated_peerCertificates() {
            r1 = this;
            java.util.List r0 = r1.peerCertificates()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "peerPrincipal", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_peerPrincipal")
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final java.security.Principal m1924deprecated_peerPrincipal() {
            r1 = this;
            java.security.Principal r0 = r1.peerPrincipal()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "tlsVersion", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_tlsVersion")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_tlsVersion, reason: not valid java name */
    public final okhttp3.TlsVersion m1925deprecated_tlsVersion() {
            r1 = this;
            okhttp3.TlsVersion r0 = r1.tlsVersion
            return r0
    }

    @kotlin.jvm.JvmName(name = "cipherSuite")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.CipherSuite cipherSuite() {
            r1 = this;
            okhttp3.CipherSuite r0 = r1.cipherSuite
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.Handshake
            if (r0 == 0) goto L30
            okhttp3.Handshake r3 = (okhttp3.Handshake) r3
            okhttp3.TlsVersion r0 = r3.tlsVersion
            okhttp3.TlsVersion r1 = r2.tlsVersion
            if (r0 != r1) goto L30
            okhttp3.CipherSuite r0 = r3.cipherSuite
            okhttp3.CipherSuite r1 = r2.cipherSuite
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L30
            java.util.List r0 = r3.peerCertificates()
            java.util.List r1 = r2.peerCertificates()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L30
            java.util.List<java.security.cert.Certificate> r3 = r3.localCertificates
            java.util.List<java.security.cert.Certificate> r0 = r2.localCertificates
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r3 == 0) goto L30
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            return r3
    }

    public int hashCode() {
            r2 = this;
            okhttp3.TlsVersion r0 = r2.tlsVersion
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            okhttp3.CipherSuite r1 = r2.cipherSuite
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List r0 = r2.peerCertificates()
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<java.security.cert.Certificate> r1 = r2.localCertificates
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @kotlin.jvm.JvmName(name = "localCertificates")
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.security.cert.Certificate> localCertificates() {
            r1 = this;
            java.util.List<java.security.cert.Certificate> r0 = r1.localCertificates
            return r0
    }

    @kotlin.jvm.JvmName(name = "localPrincipal")
    @org.jetbrains.annotations.Nullable
    public final java.security.Principal localPrincipal() {
            r3 = this;
            java.util.List<java.security.cert.Certificate> r0 = r3.localCertificates
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            boolean r1 = r0 instanceof java.security.cert.X509Certificate
            r2 = 0
            if (r1 != 0) goto Lc
            r0 = r2
        Lc:
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            if (r0 == 0) goto L14
            javax.security.auth.x500.X500Principal r2 = r0.getSubjectX500Principal()
        L14:
            return r2
    }

    @kotlin.jvm.JvmName(name = "peerCertificates")
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.security.cert.Certificate> peerCertificates() {
            r1 = this;
            kotlin.Lazy r0 = r1.peerCertificates$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    @kotlin.jvm.JvmName(name = "peerPrincipal")
    @org.jetbrains.annotations.Nullable
    public final java.security.Principal peerPrincipal() {
            r3 = this;
            java.util.List r0 = r3.peerCertificates()
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            boolean r1 = r0 instanceof java.security.cert.X509Certificate
            r2 = 0
            if (r1 != 0) goto Le
            r0 = r2
        Le:
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            if (r0 == 0) goto L16
            javax.security.auth.x500.X500Principal r2 = r0.getSubjectX500Principal()
        L16:
            return r2
    }

    @kotlin.jvm.JvmName(name = "tlsVersion")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.TlsVersion tlsVersion() {
            r1 = this;
            okhttp3.TlsVersion r0 = r1.tlsVersion
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r4 = this;
            java.util.List r0 = r4.peerCertificates()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r0.next()
            java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
            java.lang.String r2 = r4.getName(r2)
            r1.add(r2)
            goto L11
        L25:
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Handshake{"
            java.lang.String r2 = "tlsVersion="
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r1, r2)
            okhttp3.TlsVersion r2 = r4.tlsVersion
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            java.lang.String r3 = "cipherSuite="
            r1.append(r3)
            okhttp3.CipherSuite r3 = r4.cipherSuite
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = "peerCertificates="
            r1.append(r3)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "localCertificates="
            r1.append(r0)
            java.util.List<java.security.cert.Certificate> r0 = r4.localCertificates
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L68:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r0.next()
            java.security.cert.Certificate r3 = (java.security.cert.Certificate) r3
            java.lang.String r3 = r4.getName(r3)
            r2.add(r3)
            goto L68
        L7c:
            r1.append(r2)
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
