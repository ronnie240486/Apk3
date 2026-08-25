package okhttp3;

/* JADX INFO: compiled from: ConnectionSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 &2\u00020\u0001:\u0002%&B7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u001d\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0019J\u0015\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0002\b\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u000e\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0017J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\"J\u0015\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000bH\u0007¢\u0006\u0002\b#J\b\u0010$\u001a\u00020\u0007H\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\b\n\u0010\rR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006'"}, d2 = {"Lokhttp3/ConnectionSpec;", "", "isTls", "", "supportsTlsExtensions", "cipherSuitesAsString", "", "", "tlsVersionsAsString", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "cipherSuites", "", "Lokhttp3/CipherSuite;", "()Ljava/util/List;", "getCipherSuitesAsString$okhttp", "()[Ljava/lang/String;", "[Ljava/lang/String;", "()Z", "tlsVersions", "Lokhttp3/TlsVersion;", "apply", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "isFallback", "apply$okhttp", "-deprecated_cipherSuites", "equals", "other", "hashCode", "", "isCompatible", "socket", "supportedSpec", "-deprecated_supportsTlsExtensions", "-deprecated_tlsVersions", "toString", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class ConnectionSpec {
    private static final okhttp3.CipherSuite[] APPROVED_CIPHER_SUITES = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ConnectionSpec CLEARTEXT = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ConnectionSpec COMPATIBLE_TLS = null;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ConnectionSpec.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ConnectionSpec MODERN_TLS = null;
    private static final okhttp3.CipherSuite[] RESTRICTED_CIPHER_SUITES = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ConnectionSpec RESTRICTED_TLS = null;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String[] cipherSuitesAsString;
    private final boolean isTls;
    private final boolean supportsTlsExtensions;
    private final java.lang.String[] tlsVersionsAsString;

    /* JADX INFO: compiled from: ConnectionSpec.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0019\u001a\u00020\u0000J\u0006\u0010\u001a\u001a\u00020\u0000J\u0006\u0010\u001b\u001a\u00020\u0006J\u001f\u0010\b\u001a\u00020\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0002\u0010\u001cJ\u001f\u0010\b\u001a\u00020\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\t\"\u00020\u001d¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0007J\u001f\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\t\"\u00020\u001f¢\u0006\u0002\u0010 R$\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0015\u0010\u0004R$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006!"}, d2 = {"Lokhttp3/ConnectionSpec$Builder;", "", "tls", "", "(Z)V", "connectionSpec", "Lokhttp3/ConnectionSpec;", "(Lokhttp3/ConnectionSpec;)V", "cipherSuites", "", "", "getCipherSuites$okhttp", "()[Ljava/lang/String;", "setCipherSuites$okhttp", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "supportsTlsExtensions", "getSupportsTlsExtensions$okhttp", "()Z", "setSupportsTlsExtensions$okhttp", "getTls$okhttp", "setTls$okhttp", "tlsVersions", "getTlsVersions$okhttp", "setTlsVersions$okhttp", "allEnabledCipherSuites", "allEnabledTlsVersions", "build", "([Ljava/lang/String;)Lokhttp3/ConnectionSpec$Builder;", "Lokhttp3/CipherSuite;", "([Lokhttp3/CipherSuite;)Lokhttp3/ConnectionSpec$Builder;", "Lokhttp3/TlsVersion;", "([Lokhttp3/TlsVersion;)Lokhttp3/ConnectionSpec$Builder;", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Builder {

        @org.jetbrains.annotations.Nullable
        private java.lang.String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;

        @org.jetbrains.annotations.Nullable
        private java.lang.String[] tlsVersions;

        public Builder(@org.jetbrains.annotations.NotNull okhttp3.ConnectionSpec r2) {
                r1 = this;
                java.lang.String r0 = "connectionSpec"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                boolean r0 = r2.isTls()
                r1.tls = r0
                java.lang.String[] r0 = r2.getCipherSuitesAsString$okhttp()
                r1.cipherSuites = r0
                java.lang.String[] r0 = okhttp3.ConnectionSpec.access$getTlsVersionsAsString$p(r2)
                r1.tlsVersions = r0
                boolean r2 = r2.supportsTlsExtensions()
                r1.supportsTlsExtensions = r2
                return
        }

        public Builder(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.tls = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.ConnectionSpec.Builder allEnabledCipherSuites() {
                r2 = this;
                boolean r0 = r2.tls
                if (r0 == 0) goto L8
                r0 = 0
                r2.cipherSuites = r0
                return r2
            L8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "no cipher suites for cleartext connections"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.ConnectionSpec.Builder allEnabledTlsVersions() {
                r2 = this;
                boolean r0 = r2.tls
                if (r0 == 0) goto L8
                r0 = 0
                r2.tlsVersions = r0
                return r2
            L8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "no TLS versions for cleartext connections"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.ConnectionSpec build() {
                r5 = this;
                okhttp3.ConnectionSpec r0 = new okhttp3.ConnectionSpec
                boolean r1 = r5.tls
                boolean r2 = r5.supportsTlsExtensions
                java.lang.String[] r3 = r5.cipherSuites
                java.lang.String[] r4 = r5.tlsVersions
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.ConnectionSpec.Builder cipherSuites(@org.jetbrains.annotations.NotNull java.lang.String... r3) {
                r2 = this;
                java.lang.String r0 = "cipherSuites"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                boolean r0 = r2.tls
                if (r0 == 0) goto L2d
                int r0 = r3.length
                r1 = 1
                if (r0 != 0) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                r0 = r0 ^ r1
                if (r0 == 0) goto L21
                java.lang.Object r3 = r3.clone()
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.String>"
                java.util.Objects.requireNonNull(r3, r0)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r2.cipherSuites = r3
                return r2
            L21:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "At least one cipher suite is required"
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
            L2d:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no cipher suites for cleartext connections"
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.ConnectionSpec.Builder cipherSuites(@org.jetbrains.annotations.NotNull okhttp3.CipherSuite... r6) {
                r5 = this;
                java.lang.String r0 = "cipherSuites"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                boolean r0 = r5.tls
                if (r0 == 0) goto L39
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.length
                r0.<init>(r1)
                int r1 = r6.length
                r2 = 0
                r3 = 0
            L12:
                if (r3 >= r1) goto L20
                r4 = r6[r3]
                java.lang.String r4 = r4.javaName()
                r0.add(r4)
                int r3 = r3 + 1
                goto L12
            L20:
                java.lang.String[] r6 = new java.lang.String[r2]
                java.lang.Object[] r6 = r0.toArray(r6)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r6, r0)
                java.lang.String[] r6 = (java.lang.String[]) r6
                int r0 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
                java.lang.String[] r6 = (java.lang.String[]) r6
                okhttp3.ConnectionSpec$Builder r6 = r5.cipherSuites(r6)
                return r6
            L39:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no cipher suites for cleartext connections"
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String[] getCipherSuites$okhttp() {
                r1 = this;
                java.lang.String[] r0 = r1.cipherSuites
                return r0
        }

        public final boolean getSupportsTlsExtensions$okhttp() {
                r1 = this;
                boolean r0 = r1.supportsTlsExtensions
                return r0
        }

        public final boolean getTls$okhttp() {
                r1 = this;
                boolean r0 = r1.tls
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String[] getTlsVersions$okhttp() {
                r1 = this;
                java.lang.String[] r0 = r1.tlsVersions
                return r0
        }

        public final void setCipherSuites$okhttp(@org.jetbrains.annotations.Nullable java.lang.String[] r1) {
                r0 = this;
                r0.cipherSuites = r1
                return
        }

        public final void setSupportsTlsExtensions$okhttp(boolean r1) {
                r0 = this;
                r0.supportsTlsExtensions = r1
                return
        }

        public final void setTls$okhttp(boolean r1) {
                r0 = this;
                r0.tls = r1
                return
        }

        public final void setTlsVersions$okhttp(@org.jetbrains.annotations.Nullable java.lang.String[] r1) {
                r0 = this;
                r0.tlsVersions = r1
                return
        }

        @kotlin.Deprecated(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ConnectionSpec.Builder supportsTlsExtensions(boolean r2) {
                r1 = this;
                boolean r0 = r1.tls
                if (r0 == 0) goto L7
                r1.supportsTlsExtensions = r2
                return r1
            L7:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no TLS extensions for cleartext connections"
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.ConnectionSpec.Builder tlsVersions(@org.jetbrains.annotations.NotNull java.lang.String... r3) {
                r2 = this;
                java.lang.String r0 = "tlsVersions"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                boolean r0 = r2.tls
                if (r0 == 0) goto L2e
                int r0 = r3.length
                r1 = 1
                if (r0 != 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                r0 = r0 ^ r1
                if (r0 == 0) goto L22
                java.lang.Object r3 = r3.clone()
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.String>"
                java.util.Objects.requireNonNull(r3, r0)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r2.tlsVersions = r3
                return r2
            L22:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "At least one TLS version is required"
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
            L2e:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no TLS versions for cleartext connections"
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.ConnectionSpec.Builder tlsVersions(@org.jetbrains.annotations.NotNull okhttp3.TlsVersion... r6) {
                r5 = this;
                java.lang.String r0 = "tlsVersions"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                boolean r0 = r5.tls
                if (r0 == 0) goto L3a
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.length
                r0.<init>(r1)
                int r1 = r6.length
                r2 = 0
                r3 = 0
            L13:
                if (r3 >= r1) goto L21
                r4 = r6[r3]
                java.lang.String r4 = r4.javaName()
                r0.add(r4)
                int r3 = r3 + 1
                goto L13
            L21:
                java.lang.String[] r6 = new java.lang.String[r2]
                java.lang.Object[] r6 = r0.toArray(r6)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r6, r0)
                java.lang.String[] r6 = (java.lang.String[]) r6
                int r0 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
                java.lang.String[] r6 = (java.lang.String[]) r6
                okhttp3.ConnectionSpec$Builder r6 = r5.tlsVersions(r6)
                return r6
            L3a:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no TLS versions for cleartext connections"
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
        }
    }

    /* JADX INFO: compiled from: ConnectionSpec.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/ConnectionSpec$Companion;", "", "()V", "APPROVED_CIPHER_SUITES", "", "Lokhttp3/CipherSuite;", "[Lokhttp3/CipherSuite;", "CLEARTEXT", "Lokhttp3/ConnectionSpec;", "COMPATIBLE_TLS", "MODERN_TLS", "RESTRICTED_CIPHER_SUITES", "RESTRICTED_TLS", "okhttp"}, k = 1, mv = {1, 4, 1})
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
            okhttp3.ConnectionSpec$Companion r0 = new okhttp3.ConnectionSpec$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.ConnectionSpec.Companion = r0
            r0 = 9
            okhttp3.CipherSuite[] r1 = new okhttp3.CipherSuite[r0]
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_AES_128_GCM_SHA256
            r3 = 0
            r1[r3] = r2
            okhttp3.CipherSuite r4 = okhttp3.CipherSuite.TLS_AES_256_GCM_SHA384
            r5 = 1
            r1[r5] = r4
            okhttp3.CipherSuite r6 = okhttp3.CipherSuite.TLS_CHACHA20_POLY1305_SHA256
            r7 = 2
            r1[r7] = r6
            okhttp3.CipherSuite r8 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256
            r9 = 3
            r1[r9] = r8
            okhttp3.CipherSuite r10 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256
            r11 = 4
            r1[r11] = r10
            okhttp3.CipherSuite r12 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384
            r13 = 5
            r1[r13] = r12
            okhttp3.CipherSuite r14 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384
            r15 = 6
            r1[r15] = r14
            okhttp3.CipherSuite r16 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256
            r17 = 7
            r1[r17] = r16
            okhttp3.CipherSuite r18 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256
            r19 = 8
            r1[r19] = r18
            okhttp3.ConnectionSpec.RESTRICTED_CIPHER_SUITES = r1
            r0 = 16
            okhttp3.CipherSuite[] r0 = new okhttp3.CipherSuite[r0]
            r0[r3] = r2
            r0[r5] = r4
            r0[r7] = r6
            r0[r9] = r8
            r0[r11] = r10
            r0[r13] = r12
            r0[r15] = r14
            r0[r17] = r16
            r0[r19] = r18
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA
            r4 = 9
            r0[r4] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA
            r4 = 10
            r0[r4] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256
            r4 = 11
            r0[r4] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384
            r4 = 12
            r0[r4] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA
            r4 = 13
            r0[r4] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA
            r4 = 14
            r0[r4] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA
            r4 = 15
            r0[r4] = r2
            okhttp3.ConnectionSpec.APPROVED_CIPHER_SUITES = r0
            okhttp3.ConnectionSpec$Builder r2 = new okhttp3.ConnectionSpec$Builder
            r2.<init>(r5)
            int r4 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
            okhttp3.CipherSuite[] r1 = (okhttp3.CipherSuite[]) r1
            okhttp3.ConnectionSpec$Builder r1 = r2.cipherSuites(r1)
            okhttp3.TlsVersion[] r2 = new okhttp3.TlsVersion[r7]
            okhttp3.TlsVersion r4 = okhttp3.TlsVersion.TLS_1_3
            r2[r3] = r4
            okhttp3.TlsVersion r6 = okhttp3.TlsVersion.TLS_1_2
            r2[r5] = r6
            okhttp3.ConnectionSpec$Builder r1 = r1.tlsVersions(r2)
            okhttp3.ConnectionSpec$Builder r1 = r1.supportsTlsExtensions(r5)
            okhttp3.ConnectionSpec r1 = r1.build()
            okhttp3.ConnectionSpec.RESTRICTED_TLS = r1
            okhttp3.ConnectionSpec$Builder r1 = new okhttp3.ConnectionSpec$Builder
            r1.<init>(r5)
            int r2 = r0.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r2)
            okhttp3.CipherSuite[] r2 = (okhttp3.CipherSuite[]) r2
            okhttp3.ConnectionSpec$Builder r1 = r1.cipherSuites(r2)
            okhttp3.TlsVersion[] r2 = new okhttp3.TlsVersion[r7]
            r2[r3] = r4
            r2[r5] = r6
            okhttp3.ConnectionSpec$Builder r1 = r1.tlsVersions(r2)
            okhttp3.ConnectionSpec$Builder r1 = r1.supportsTlsExtensions(r5)
            okhttp3.ConnectionSpec r1 = r1.build()
            okhttp3.ConnectionSpec.MODERN_TLS = r1
            okhttp3.ConnectionSpec$Builder r1 = new okhttp3.ConnectionSpec$Builder
            r1.<init>(r5)
            int r2 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            okhttp3.CipherSuite[] r0 = (okhttp3.CipherSuite[]) r0
            okhttp3.ConnectionSpec$Builder r0 = r1.cipherSuites(r0)
            okhttp3.TlsVersion[] r1 = new okhttp3.TlsVersion[r11]
            r1[r3] = r4
            r1[r5] = r6
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_1
            r1[r7] = r2
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_0
            r1[r9] = r2
            okhttp3.ConnectionSpec$Builder r0 = r0.tlsVersions(r1)
            okhttp3.ConnectionSpec$Builder r0 = r0.supportsTlsExtensions(r5)
            okhttp3.ConnectionSpec r0 = r0.build()
            okhttp3.ConnectionSpec.COMPATIBLE_TLS = r0
            okhttp3.ConnectionSpec$Builder r0 = new okhttp3.ConnectionSpec$Builder
            r0.<init>(r3)
            okhttp3.ConnectionSpec r0 = r0.build()
            okhttp3.ConnectionSpec.CLEARTEXT = r0
            return
    }

    public ConnectionSpec(boolean r1, boolean r2, @org.jetbrains.annotations.Nullable java.lang.String[] r3, @org.jetbrains.annotations.Nullable java.lang.String[] r4) {
            r0 = this;
            r0.<init>()
            r0.isTls = r1
            r0.supportsTlsExtensions = r2
            r0.cipherSuitesAsString = r3
            r0.tlsVersionsAsString = r4
            return
    }

    public static final /* synthetic */ java.lang.String[] access$getTlsVersionsAsString$p(okhttp3.ConnectionSpec r0) {
            java.lang.String[] r0 = r0.tlsVersionsAsString
            return r0
    }

    private final okhttp3.ConnectionSpec supportedSpec(javax.net.ssl.SSLSocket r5, boolean r6) {
            r4 = this;
            java.lang.String[] r0 = r5.getEnabledCipherSuites()
            java.lang.String r1 = "socketEnabledCipherSuites"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String[] r0 = okhttp3.internal.Internal.effectiveCipherSuites(r4, r0)
            java.lang.String[] r1 = r4.tlsVersionsAsString
            if (r1 == 0) goto L27
            java.lang.String[] r1 = r5.getEnabledProtocols()
            java.lang.String r2 = "sslSocket.enabledProtocols"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String[] r2 = r4.tlsVersionsAsString
            java.util.Comparator r3 = kotlin.comparisons.ComparisonsKt.naturalOrder()
            java.lang.String[] r1 = okhttp3.internal.Util.intersect(r1, r2, r3)
            goto L2b
        L27:
            java.lang.String[] r1 = r5.getEnabledProtocols()
        L2b:
            java.lang.String[] r5 = r5.getSupportedCipherSuites()
            java.lang.String r2 = "supportedCipherSuites"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            okhttp3.CipherSuite$Companion r2 = okhttp3.CipherSuite.Companion
            java.util.Comparator r2 = r2.getORDER_BY_NAME$okhttp()
            java.lang.String r3 = "TLS_FALLBACK_SCSV"
            int r2 = okhttp3.internal.Util.indexOf(r5, r3, r2)
            if (r6 == 0) goto L52
            r6 = -1
            if (r2 == r6) goto L52
            r5 = r5[r2]
            java.lang.String r6 = "supportedCipherSuites[indexOfFallbackScsv]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String[] r0 = okhttp3.internal.Util.concat(r0, r5)
        L52:
            okhttp3.ConnectionSpec$Builder r5 = new okhttp3.ConnectionSpec$Builder
            r5.<init>(r4)
            int r6 = r0.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            okhttp3.ConnectionSpec$Builder r5 = r5.cipherSuites(r6)
            java.lang.String r6 = "tlsVersionsIntersection"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            int r6 = r1.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r1, r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            okhttp3.ConnectionSpec$Builder r5 = r5.tlsVersions(r6)
            okhttp3.ConnectionSpec r5 = r5.build()
            return r5
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cipherSuites", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_cipherSuites")
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: -deprecated_cipherSuites, reason: not valid java name */
    public final java.util.List<okhttp3.CipherSuite> m1906deprecated_cipherSuites() {
            r1 = this;
            java.util.List r0 = r1.cipherSuites()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "supportsTlsExtensions", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_supportsTlsExtensions")
    /* JADX INFO: renamed from: -deprecated_supportsTlsExtensions, reason: not valid java name */
    public final boolean m1907deprecated_supportsTlsExtensions() {
            r1 = this;
            boolean r0 = r1.supportsTlsExtensions
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "tlsVersions", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_tlsVersions")
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: -deprecated_tlsVersions, reason: not valid java name */
    public final java.util.List<okhttp3.TlsVersion> m1908deprecated_tlsVersions() {
            r1 = this;
            java.util.List r0 = r1.tlsVersions()
            return r0
    }

    public final void apply$okhttp(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.ConnectionSpec r3 = r1.supportedSpec(r2, r3)
            java.util.List r0 = r3.tlsVersions()
            if (r0 == 0) goto L15
            java.lang.String[] r0 = r3.tlsVersionsAsString
            r2.setEnabledProtocols(r0)
        L15:
            java.util.List r0 = r3.cipherSuites()
            if (r0 == 0) goto L20
            java.lang.String[] r3 = r3.cipherSuitesAsString
            r2.setEnabledCipherSuites(r3)
        L20:
            return
    }

    @kotlin.jvm.JvmName(name = "cipherSuites")
    @org.jetbrains.annotations.Nullable
    public final java.util.List<okhttp3.CipherSuite> cipherSuites() {
            r6 = this;
            java.lang.String[] r0 = r6.cipherSuitesAsString
            if (r0 == 0) goto L21
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1c
            r4 = r0[r3]
            okhttp3.CipherSuite$Companion r5 = okhttp3.CipherSuite.Companion
            okhttp3.CipherSuite r4 = r5.forJavaName(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto Lc
        L1c:
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r1)
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof okhttp3.ConnectionSpec
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r4) goto La
            return r0
        La:
            boolean r2 = r4.isTls
            okhttp3.ConnectionSpec r5 = (okhttp3.ConnectionSpec) r5
            boolean r3 = r5.isTls
            if (r2 == r3) goto L13
            return r1
        L13:
            if (r2 == 0) goto L32
            java.lang.String[] r2 = r4.cipherSuitesAsString
            java.lang.String[] r3 = r5.cipherSuitesAsString
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            java.lang.String[] r2 = r4.tlsVersionsAsString
            java.lang.String[] r3 = r5.tlsVersionsAsString
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            boolean r2 = r4.supportsTlsExtensions
            boolean r5 = r5.supportsTlsExtensions
            if (r2 == r5) goto L32
            return r1
        L32:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String[] getCipherSuitesAsString$okhttp() {
            r1 = this;
            java.lang.String[] r0 = r1.cipherSuitesAsString
            return r0
    }

    public int hashCode() {
            r3 = this;
            boolean r0 = r3.isTls
            if (r0 == 0) goto L25
            r0 = 527(0x20f, float:7.38E-43)
            java.lang.String[] r1 = r3.cipherSuitesAsString
            r2 = 0
            if (r1 == 0) goto L10
            int r1 = java.util.Arrays.hashCode(r1)
            goto L11
        L10:
            r1 = 0
        L11:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String[] r1 = r3.tlsVersionsAsString
            if (r1 == 0) goto L1c
            int r2 = java.util.Arrays.hashCode(r1)
        L1c:
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r1 = r3.supportsTlsExtensions
            r1 = r1 ^ 1
            int r0 = r0 + r1
            goto L27
        L25:
            r0 = 17
        L27:
            return r0
    }

    public final boolean isCompatible(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r5) {
            r4 = this;
            java.lang.String r0 = "socket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r4.isTls
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.lang.String[] r0 = r4.tlsVersionsAsString
            if (r0 == 0) goto L1f
            java.lang.String[] r2 = r5.getEnabledProtocols()
            java.util.Comparator r3 = kotlin.comparisons.ComparisonsKt.naturalOrder()
            boolean r0 = okhttp3.internal.Util.hasIntersection(r0, r2, r3)
            if (r0 != 0) goto L1f
            return r1
        L1f:
            java.lang.String[] r0 = r4.cipherSuitesAsString
            if (r0 == 0) goto L34
            java.lang.String[] r5 = r5.getEnabledCipherSuites()
            okhttp3.CipherSuite$Companion r2 = okhttp3.CipherSuite.Companion
            java.util.Comparator r2 = r2.getORDER_BY_NAME$okhttp()
            boolean r5 = okhttp3.internal.Util.hasIntersection(r0, r5, r2)
            if (r5 != 0) goto L34
            return r1
        L34:
            r5 = 1
            return r5
    }

    @kotlin.jvm.JvmName(name = "isTls")
    public final boolean isTls() {
            r1 = this;
            boolean r0 = r1.isTls
            return r0
    }

    @kotlin.jvm.JvmName(name = "supportsTlsExtensions")
    public final boolean supportsTlsExtensions() {
            r1 = this;
            boolean r0 = r1.supportsTlsExtensions
            return r0
    }

    @kotlin.jvm.JvmName(name = "tlsVersions")
    @org.jetbrains.annotations.Nullable
    public final java.util.List<okhttp3.TlsVersion> tlsVersions() {
            r6 = this;
            java.lang.String[] r0 = r6.tlsVersionsAsString
            if (r0 == 0) goto L21
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1c
            r4 = r0[r3]
            okhttp3.TlsVersion$Companion r5 = okhttp3.TlsVersion.Companion
            okhttp3.TlsVersion r4 = r5.forJavaName(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto Lc
        L1c:
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r1)
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r4 = this;
            boolean r0 = r4.isTls
            if (r0 != 0) goto L7
            java.lang.String r0 = "ConnectionSpec()"
            return r0
        L7:
            java.lang.String r0 = "ConnectionSpec("
            java.lang.String r1 = "cipherSuites="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r0, r1)
            java.util.List r1 = r4.cipherSuites()
            java.lang.String r2 = "[all enabled]"
            java.lang.String r1 = java.util.Objects.toString(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r3 = "tlsVersions="
            r0.append(r3)
            java.util.List r3 = r4.tlsVersions()
            java.lang.String r2 = java.util.Objects.toString(r3, r2)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "supportsTlsExtensions="
            r0.append(r1)
            boolean r1 = r4.supportsTlsExtensions
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
