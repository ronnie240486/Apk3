package okhttp3;

/* JADX INFO: compiled from: CertificatePinner.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0003!\"#B!\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0000¢\u0006\u0002\b\u0014J)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018J\u001c\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006$"}, d2 = {"Lokhttp3/CertificatePinner;", "", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "getPins", "()Ljava/util/Set;", "check", "", "hostname", "", "cleanedPeerCertificatesFn", "Lkotlin/Function0;", "", "Ljava/security/cert/X509Certificate;", "check$okhttp", "peerCertificates", "", "Ljava/security/cert/Certificate;", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "equals", "", "other", "findMatchingPins", "hashCode", "", "withCertificateChainCleaner", "withCertificateChainCleaner$okhttp", "Builder", "Companion", "Pin", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class CertificatePinner {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CertificatePinner.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CertificatePinner DEFAULT = null;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner;

    @org.jetbrains.annotations.NotNull
    private final java.util.Set<okhttp3.CertificatePinner.Pin> pins;

    /* JADX INFO: compiled from: CertificatePinner.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u000b\"\u00020\n¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "()V", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "getPins", "()Ljava/util/List;", "add", "pattern", "", "", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "build", "Lokhttp3/CertificatePinner;", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Builder {

        @org.jetbrains.annotations.NotNull
        private final java.util.List<okhttp3.CertificatePinner.Pin> pins;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.pins = r0
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CertificatePinner.Builder add(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String... r7) {
                r5 = this;
                java.lang.String r0 = "pattern"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "pins"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                int r0 = r7.length
                r1 = 0
            Lc:
                if (r1 >= r0) goto L1d
                r2 = r7[r1]
                java.util.List<okhttp3.CertificatePinner$Pin> r3 = r5.pins
                okhttp3.CertificatePinner$Pin r4 = new okhttp3.CertificatePinner$Pin
                r4.<init>(r6, r2)
                r3.add(r4)
                int r1 = r1 + 1
                goto Lc
            L1d:
                return r5
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CertificatePinner build() {
                r4 = this;
                okhttp3.CertificatePinner r0 = new okhttp3.CertificatePinner
                java.util.List<okhttp3.CertificatePinner$Pin> r1 = r4.pins
                java.util.Set r1 = kotlin.collections.CollectionsKt.toSet(r1)
                r2 = 0
                r3 = 2
                r0.<init>(r1, r2, r3, r2)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<okhttp3.CertificatePinner.Pin> getPins() {
                r1 = this;
                java.util.List<okhttp3.CertificatePinner$Pin> r0 = r1.pins
                return r0
        }
    }

    /* JADX INFO: compiled from: CertificatePinner.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0007J\f\u0010\f\u001a\u00020\n*\u00020\u000bH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "()V", "DEFAULT", "Lokhttp3/CertificatePinner;", "pin", "", "certificate", "Ljava/security/cert/Certificate;", "sha1Hash", "Lokio/ByteString;", "Ljava/security/cert/X509Certificate;", "sha256Hash", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final java.lang.String pin(@org.jetbrains.annotations.NotNull java.security.cert.Certificate r2) {
                r1 = this;
                java.lang.String r0 = "certificate"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                boolean r0 = r2 instanceof java.security.cert.X509Certificate
                if (r0 == 0) goto L22
                java.lang.String r0 = "sha256/"
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
                okio.ByteString r2 = r1.sha256Hash(r2)
                java.lang.String r2 = r2.base64()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
            L22:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Certificate pinning requires X509 certificates"
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString sha1Hash(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r8) {
                r7 = this;
                java.lang.String r0 = "$this$sha1Hash"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                okio.ByteString$Companion r1 = okio.ByteString.Companion
                java.security.PublicKey r8 = r8.getPublicKey()
                java.lang.String r0 = "publicKey"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
                byte[] r2 = r8.getEncoded()
                java.lang.String r8 = "publicKey.encoded"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r8)
                r3 = 0
                r4 = 0
                r5 = 3
                r6 = 0
                okio.ByteString r8 = okio.ByteString.Companion.of$default(r1, r2, r3, r4, r5, r6)
                okio.ByteString r8 = r8.sha1()
                return r8
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString sha256Hash(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r8) {
                r7 = this;
                java.lang.String r0 = "$this$sha256Hash"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                okio.ByteString$Companion r1 = okio.ByteString.Companion
                java.security.PublicKey r8 = r8.getPublicKey()
                java.lang.String r0 = "publicKey"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
                byte[] r2 = r8.getEncoded()
                java.lang.String r8 = "publicKey.encoded"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r8)
                r3 = 0
                r4 = 0
                r5 = 3
                r6 = 0
                okio.ByteString r8 = okio.ByteString.Companion.of$default(r1, r2, r3, r4, r5, r6)
                okio.ByteString r8 = r8.sha256()
                return r8
        }
    }

    /* JADX INFO: compiled from: CertificatePinner.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0003J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "pattern", "", "pin", "(Ljava/lang/String;Ljava/lang/String;)V", "hash", "Lokio/ByteString;", "getHash", "()Lokio/ByteString;", "hashAlgorithm", "getHashAlgorithm", "()Ljava/lang/String;", "getPattern", "equals", "", "other", "hashCode", "", "matchesCertificate", "certificate", "Ljava/security/cert/X509Certificate;", "matchesHostname", "hostname", "toString", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Pin {

        @org.jetbrains.annotations.NotNull
        private final okio.ByteString hash;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String hashAlgorithm;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String pattern;

        public Pin(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8) {
                r6 = this;
                java.lang.String r0 = "pattern"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.String r0 = "pin"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                r6.<init>()
                java.lang.String r0 = "*."
                boolean r0 = kotlin.text.StringsKt.startsWith$default(r7, r0)
                r1 = 0
                r2 = 4
                r3 = 1
                java.lang.String r4 = "*"
                r5 = -1
                if (r0 == 0) goto L21
                int r0 = kotlin.text.StringsKt.indexOf$default(r7, r4, r3, r2)
                if (r0 == r5) goto L37
            L21:
                java.lang.String r0 = "**."
                boolean r0 = kotlin.text.StringsKt.startsWith$default(r7, r0)
                if (r0 == 0) goto L30
                r0 = 2
                int r0 = kotlin.text.StringsKt.indexOf$default(r7, r4, r0, r2)
                if (r0 == r5) goto L37
            L30:
                r0 = 6
                int r0 = kotlin.text.StringsKt.indexOf$default(r7, r4, r1, r0)
                if (r0 != r5) goto L38
            L37:
                r1 = 1
            L38:
                if (r1 == 0) goto Lb4
                java.lang.String r0 = okhttp3.internal.HostnamesKt.toCanonicalHost(r7)
                if (r0 == 0) goto La8
                r6.pattern = r0
                java.lang.String r7 = "sha1/"
                boolean r7 = kotlin.text.StringsKt.startsWith$default(r8, r7)
                java.lang.String r0 = "Invalid pin hash: "
                java.lang.String r1 = "(this as java.lang.String).substring(startIndex)"
                if (r7 == 0) goto L71
                java.lang.String r7 = "sha1"
                r6.hashAlgorithm = r7
                okio.ByteString$Companion r7 = okio.ByteString.Companion
                r2 = 5
                java.lang.String r2 = r8.substring(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
                okio.ByteString r7 = r7.decodeBase64(r2)
                if (r7 == 0) goto L67
                r6.hash = r7
                goto L91
            L67:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r8)
                r7.<init>(r8)
                throw r7
            L71:
                java.lang.String r7 = "sha256/"
                boolean r7 = kotlin.text.StringsKt.startsWith$default(r8, r7)
                if (r7 == 0) goto L9c
                java.lang.String r7 = "sha256"
                r6.hashAlgorithm = r7
                okio.ByteString$Companion r7 = okio.ByteString.Companion
                r2 = 7
                java.lang.String r2 = r8.substring(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
                okio.ByteString r7 = r7.decodeBase64(r2)
                if (r7 == 0) goto L92
                r6.hash = r7
            L91:
                return
            L92:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r8)
                r7.<init>(r8)
                throw r7
            L9c:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "pins must start with 'sha256/' or 'sha1/': "
                java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r8)
                r7.<init>(r8)
                throw r7
            La8:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Invalid pattern: "
                java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r7)
                r8.<init>(r7)
                throw r8
            Lb4:
                java.lang.String r8 = "Unexpected pattern: "
                java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8, r7)
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r7 = r7.toString()
                r8.<init>(r7)
                throw r8
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof okhttp3.CertificatePinner.Pin
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                java.lang.String r1 = r4.pattern
                okhttp3.CertificatePinner$Pin r5 = (okhttp3.CertificatePinner.Pin) r5
                java.lang.String r3 = r5.pattern
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                r1 = r1 ^ r0
                if (r1 == 0) goto L18
                return r2
            L18:
                java.lang.String r1 = r4.hashAlgorithm
                java.lang.String r3 = r5.hashAlgorithm
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                r1 = r1 ^ r0
                if (r1 == 0) goto L24
                return r2
            L24:
                okio.ByteString r1 = r4.hash
                okio.ByteString r5 = r5.hash
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                r5 = r5 ^ r0
                if (r5 == 0) goto L30
                return r2
            L30:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.ByteString getHash() {
                r1 = this;
                okio.ByteString r0 = r1.hash
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getHashAlgorithm() {
                r1 = this;
                java.lang.String r0 = r1.hashAlgorithm
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPattern() {
                r1 = this;
                java.lang.String r0 = r1.pattern
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.pattern
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r3.hashAlgorithm
                r2 = 31
                int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r2)
                okio.ByteString r1 = r3.hash
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public final boolean matchesCertificate(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r4) {
                r3 = this;
                java.lang.String r0 = "certificate"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = r3.hashAlgorithm
                int r1 = r0.hashCode()
                r2 = -903629273(0xffffffffca23b627, float:-2682249.8)
                if (r1 == r2) goto L2c
                r2 = 3528965(0x35d905, float:4.945133E-39)
                if (r1 == r2) goto L16
                goto L42
            L16:
                java.lang.String r1 = "sha1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L42
                okio.ByteString r0 = r3.hash
                okhttp3.CertificatePinner$Companion r1 = okhttp3.CertificatePinner.Companion
                okio.ByteString r4 = r1.sha1Hash(r4)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r4)
                goto L43
            L2c:
                java.lang.String r1 = "sha256"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L42
                okio.ByteString r0 = r3.hash
                okhttp3.CertificatePinner$Companion r1 = okhttp3.CertificatePinner.Companion
                okio.ByteString r4 = r1.sha256Hash(r4)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r4)
                goto L43
            L42:
                r4 = 0
            L43:
                return r4
        }

        public final boolean matchesHostname(@org.jetbrains.annotations.NotNull java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = "hostname"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.lang.String r0 = r7.pattern
                java.lang.String r1 = "**."
                boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r1)
                r1 = 46
                r2 = 1
                if (r0 == 0) goto L37
                java.lang.String r0 = r7.pattern
                int r0 = r0.length()
                int r0 = r0 + (-3)
                int r3 = r8.length()
                int r3 = r3 - r0
                int r4 = r8.length()
                int r4 = r4 - r0
                java.lang.String r5 = r7.pattern
                r6 = 3
                boolean r0 = kotlin.text.StringsKt.regionMatches$default(r8, r4, r5, r6, r0)
                if (r0 == 0) goto L64
                if (r3 == 0) goto L6c
                int r3 = r3 - r2
                char r8 = r8.charAt(r3)
                if (r8 != r1) goto L64
                goto L6c
            L37:
                java.lang.String r0 = r7.pattern
                java.lang.String r3 = "*."
                boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r3)
                if (r0 == 0) goto L66
                java.lang.String r0 = r7.pattern
                int r0 = r0.length()
                r3 = -1
                int r0 = r0 + r3
                int r4 = r8.length()
                int r4 = r4 - r0
                int r5 = r8.length()
                int r5 = r5 - r0
                java.lang.String r6 = r7.pattern
                boolean r0 = kotlin.text.StringsKt.regionMatches$default(r8, r5, r6, r2, r0)
                if (r0 == 0) goto L64
                int r4 = r4 + r3
                r0 = 4
                int r8 = kotlin.text.StringsKt.lastIndexOf$default(r8, r1, r4, r0)
                if (r8 != r3) goto L64
                goto L6c
            L64:
                r2 = 0
                goto L6c
            L66:
                java.lang.String r0 = r7.pattern
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r0)
            L6c:
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.hashAlgorithm
                r0.append(r1)
                r1 = 47
                r0.append(r1)
                okio.ByteString r1 = r2.hash
                java.lang.String r1 = r1.base64()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }


    static {
            okhttp3.CertificatePinner$Companion r0 = new okhttp3.CertificatePinner$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.CertificatePinner.Companion = r0
            okhttp3.CertificatePinner$Builder r0 = new okhttp3.CertificatePinner$Builder
            r0.<init>()
            okhttp3.CertificatePinner r0 = r0.build()
            okhttp3.CertificatePinner.DEFAULT = r0
            return
    }

    public CertificatePinner(@org.jetbrains.annotations.NotNull java.util.Set<okhttp3.CertificatePinner.Pin> r2, @org.jetbrains.annotations.Nullable okhttp3.internal.tls.CertificateChainCleaner r3) {
            r1 = this;
            java.lang.String r0 = "pins"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.pins = r2
            r1.certificateChainCleaner = r3
            return
    }

    public /* synthetic */ CertificatePinner(java.util.Set r1, okhttp3.internal.tls.CertificateChainCleaner r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String pin(@org.jetbrains.annotations.NotNull java.security.cert.Certificate r1) {
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion
            java.lang.String r1 = r0.pin(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString sha1Hash(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r1) {
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion
            okio.ByteString r1 = r0.sha1Hash(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString sha256Hash(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r1) {
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion
            okio.ByteString r1 = r0.sha256Hash(r1)
            return r1
    }

    public final void check(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r3) throws javax.net.ssl.SSLPeerUnverifiedException {
            r1 = this;
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "peerCertificates"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.CertificatePinner$check$1 r0 = new okhttp3.CertificatePinner$check$1
            r0.<init>(r1, r3, r2)
            r1.check$okhttp(r2, r0)
            return
    }

    @kotlin.Deprecated(message = "replaced with {@link #check(String, List)}.", replaceWith = @kotlin.ReplaceWith(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void check(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.security.cert.Certificate... r3) throws javax.net.ssl.SSLPeerUnverifiedException {
            r1 = this;
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "peerCertificates"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.List r3 = kotlin.collections.ArraysKt.toList(r3)
            r1.check(r2, r3)
            return
    }

    public final void check$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.security.cert.X509Certificate>> r12) {
            r10 = this;
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "cleanedPeerCertificatesFn"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.util.List r0 = r10.findMatchingPins(r11)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L15
            return
        L15:
            java.lang.Object r12 = r12.invoke()
            java.util.List r12 = (java.util.List) r12
            java.util.Iterator r1 = r12.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9f
            java.lang.Object r2 = r1.next()
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.util.Iterator r3 = r0.iterator()
            r4 = 0
            r5 = r4
        L31:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L1f
            java.lang.Object r6 = r3.next()
            okhttp3.CertificatePinner$Pin r6 = (okhttp3.CertificatePinner.Pin) r6
            java.lang.String r7 = r6.getHashAlgorithm()
            int r8 = r7.hashCode()
            r9 = -903629273(0xffffffffca23b627, float:-2682249.8)
            if (r8 == r9) goto L6b
            r9 = 3528965(0x35d905, float:4.945133E-39)
            if (r8 != r9) goto L87
            java.lang.String r8 = "sha1"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L87
            if (r5 != 0) goto L60
            okhttp3.CertificatePinner$Companion r5 = okhttp3.CertificatePinner.Companion
            okio.ByteString r5 = r5.sha1Hash(r2)
        L60:
            okio.ByteString r6 = r6.getHash()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r5)
            if (r6 == 0) goto L31
            return
        L6b:
            java.lang.String r8 = "sha256"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L87
            if (r4 != 0) goto L7c
            okhttp3.CertificatePinner$Companion r4 = okhttp3.CertificatePinner.Companion
            okio.ByteString r4 = r4.sha256Hash(r2)
        L7c:
            okio.ByteString r6 = r6.getHash()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r4)
            if (r6 == 0) goto L31
            return
        L87:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r12 = "unsupported hashAlgorithm: "
            java.lang.StringBuilder r12 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r12)
            java.lang.String r0 = r6.getHashAlgorithm()
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L9f:
            java.lang.String r1 = "Certificate pinning failure!"
            java.lang.String r2 = "\n  Peer certificate chain:"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r1, r2)
            java.util.Iterator r12 = r12.iterator()
        Lab:
            boolean r2 = r12.hasNext()
            java.lang.String r3 = "\n    "
            if (r2 == 0) goto Ldb
            java.lang.Object r2 = r12.next()
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            r1.append(r3)
            okhttp3.CertificatePinner$Companion r3 = okhttp3.CertificatePinner.Companion
            java.lang.String r3 = r3.pin(r2)
            r1.append(r3)
            java.lang.String r3 = ": "
            r1.append(r3)
            java.security.Principal r2 = r2.getSubjectDN()
            java.lang.String r3 = "element.subjectDN"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            goto Lab
        Ldb:
            java.lang.String r12 = "\n  Pinned certificates for "
            r1.append(r12)
            r1.append(r11)
            java.lang.String r11 = ":"
            r1.append(r11)
            java.util.Iterator r11 = r0.iterator()
        Lec:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lff
            java.lang.Object r12 = r11.next()
            okhttp3.CertificatePinner$Pin r12 = (okhttp3.CertificatePinner.Pin) r12
            r1.append(r3)
            r1.append(r12)
            goto Lec
        Lff:
            java.lang.String r11 = r1.toString()
            java.lang.String r12 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)
            javax.net.ssl.SSLPeerUnverifiedException r12 = new javax.net.ssl.SSLPeerUnverifiedException
            r12.<init>(r11)
            throw r12
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.CertificatePinner
            if (r0 == 0) goto L1c
            okhttp3.CertificatePinner r3 = (okhttp3.CertificatePinner) r3
            java.util.Set<okhttp3.CertificatePinner$Pin> r0 = r3.pins
            java.util.Set<okhttp3.CertificatePinner$Pin> r1 = r2.pins
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L1c
            okhttp3.internal.tls.CertificateChainCleaner r3 = r3.certificateChainCleaner
            okhttp3.internal.tls.CertificateChainCleaner r0 = r2.certificateChainCleaner
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r3 == 0) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<okhttp3.CertificatePinner.Pin> findMatchingPins(@org.jetbrains.annotations.NotNull java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Set<okhttp3.CertificatePinner$Pin> r0 = r4.pins
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r0.next()
            r3 = r2
            okhttp3.CertificatePinner$Pin r3 = (okhttp3.CertificatePinner.Pin) r3
            boolean r3 = r3.matchesHostname(r5)
            if (r3 == 0) goto Lf
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L2d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L2d:
            java.util.List r3 = kotlin.jvm.internal.TypeIntrinsics.asMutableList(r1)
            r3.add(r2)
            goto Lf
        L35:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.tls.CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            r1 = this;
            okhttp3.internal.tls.CertificateChainCleaner r0 = r1.certificateChainCleaner
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<okhttp3.CertificatePinner.Pin> getPins() {
            r1 = this;
            java.util.Set<okhttp3.CertificatePinner$Pin> r0 = r1.pins
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.util.Set<okhttp3.CertificatePinner$Pin> r0 = r2.pins
            int r0 = r0.hashCode()
            int r0 = r0 + 1517
            int r0 = r0 * 41
            okhttp3.internal.tls.CertificateChainCleaner r1 = r2.certificateChainCleaner
            if (r1 == 0) goto L13
            int r1 = r1.hashCode()
            goto L14
        L13:
            r1 = 0
        L14:
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.CertificatePinner withCertificateChainCleaner$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.tls.CertificateChainCleaner r3) {
            r2 = this;
            java.lang.String r0 = "certificateChainCleaner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.internal.tls.CertificateChainCleaner r0 = r2.certificateChainCleaner
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 == 0) goto Lf
            r0 = r2
            goto L16
        Lf:
            okhttp3.CertificatePinner r0 = new okhttp3.CertificatePinner
            java.util.Set<okhttp3.CertificatePinner$Pin> r1 = r2.pins
            r0.<init>(r1, r3)
        L16:
            return r0
    }
}
