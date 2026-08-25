package okhttp3;

/* JADX INFO: compiled from: Cookie.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 &2\u00020\u0001:\u0002%&BO\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\r\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0012J\u0013\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0017J\r\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0018J\r\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001eJ\r\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0002\b\u001fJ\r\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b J\b\u0010!\u001a\u00020\u0003H\u0016J\u0015\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\nH\u0000¢\u0006\u0002\b#J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b$R\u0013\u0010\u0007\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0013\u0010\r\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0011R\u0013\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\b\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0013\u0010\f\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0011R\u0013\u0010\t\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000f¨\u0006'"}, d2 = {"Lokhttp3/Cookie;", "", "name", "", "value", "expiresAt", "", "domain", "path", "secure", "", "httpOnly", "persistent", "hostOnly", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "()Ljava/lang/String;", "()J", "()Z", "-deprecated_domain", "equals", "other", "-deprecated_expiresAt", "hashCode", "", "-deprecated_hostOnly", "-deprecated_httpOnly", "matches", "url", "Lokhttp3/HttpUrl;", "-deprecated_name", "-deprecated_path", "-deprecated_persistent", "-deprecated_secure", "toString", "forObsoleteRfc2965", "toString$okhttp", "-deprecated_value", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Cookie {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Cookie.Companion Companion = null;
    private static final java.util.regex.Pattern DAY_OF_MONTH_PATTERN = null;
    private static final java.util.regex.Pattern MONTH_PATTERN = null;
    private static final java.util.regex.Pattern TIME_PATTERN = null;
    private static final java.util.regex.Pattern YEAR_PATTERN = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String path;
    private final boolean persistent;
    private final boolean secure;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    /* JADX INFO: compiled from: Cookie.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0000J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0000J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/Cookie$Builder;", "", "()V", "domain", "", "expiresAt", "", "hostOnly", "", "httpOnly", "name", "path", "persistent", "secure", "value", "build", "Lokhttp3/Cookie;", "hostOnlyDomain", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Builder {
        private java.lang.String domain;
        private long expiresAt;
        private boolean hostOnly;
        private boolean httpOnly;
        private java.lang.String name;
        private java.lang.String path;
        private boolean persistent;
        private boolean secure;
        private java.lang.String value;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                r2.expiresAt = r0
                java.lang.String r0 = "/"
                r2.path = r0
                return
        }

        private final okhttp3.Cookie.Builder domain(java.lang.String r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = okhttp3.internal.HostnamesKt.toCanonicalHost(r2)
                if (r0 == 0) goto Lb
                r1.domain = r0
                r1.hostOnly = r3
                return r1
            Lb:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "unexpected domain: "
                java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2)
                r3.<init>(r2)
                throw r3
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie build() {
                r13 = this;
                okhttp3.Cookie r12 = new okhttp3.Cookie
                java.lang.String r1 = r13.name
                java.lang.String r0 = "builder.name == null"
                java.util.Objects.requireNonNull(r1, r0)
                java.lang.String r2 = r13.value
                java.lang.String r0 = "builder.value == null"
                java.util.Objects.requireNonNull(r2, r0)
                long r3 = r13.expiresAt
                java.lang.String r5 = r13.domain
                java.lang.String r0 = "builder.domain == null"
                java.util.Objects.requireNonNull(r5, r0)
                java.lang.String r6 = r13.path
                boolean r7 = r13.secure
                boolean r8 = r13.httpOnly
                boolean r9 = r13.persistent
                boolean r10 = r13.hostOnly
                r11 = 0
                r0 = r12
                r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11)
                return r12
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie.Builder domain(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "domain"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                okhttp3.Cookie$Builder r2 = r1.domain(r2, r0)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie.Builder expiresAt(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 > 0) goto L8
                r4 = -9223372036854775808
            L8:
                r0 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto L12
                r4 = r0
            L12:
                r3.expiresAt = r4
                r4 = 1
                r3.persistent = r4
                return r3
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie.Builder hostOnlyDomain(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "domain"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 1
                okhttp3.Cookie$Builder r2 = r1.domain(r2, r0)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie.Builder httpOnly() {
                r1 = this;
                r0 = 1
                r1.httpOnly = r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie.Builder name(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.CharSequence r0 = kotlin.text.StringsKt.trim(r2)
                java.lang.String r0 = r0.toString()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r0 == 0) goto L16
                r1.name = r2
                return r1
            L16:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "name is not trimmed"
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie.Builder path(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "path"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "/"
                boolean r0 = kotlin.text.StringsKt.startsWith$default(r2, r0)
                if (r0 == 0) goto L10
                r1.path = r2
                return r1
            L10:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "path must start with '/'"
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie.Builder secure() {
                r1 = this;
                r0 = 1
                r1.secure = r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie.Builder value(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.CharSequence r0 = kotlin.text.StringsKt.trim(r2)
                java.lang.String r0 = r0.toString()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r0 == 0) goto L17
                r1.value = r2
                return r1
            L17:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "value is not trimmed"
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }
    }

    /* JADX INFO: compiled from: Cookie.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0002J'\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0000¢\u0006\u0002\b\u001bJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0010\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0002J \u0010\"\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\fH\u0002J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\fH\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lokhttp3/Cookie$Companion;", "", "()V", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "dateCharacterOffset", "", "input", "", "pos", "limit", "invert", "", "domainMatch", "urlHost", "domain", "parse", "Lokhttp3/Cookie;", "currentTimeMillis", "", "url", "Lokhttp3/HttpUrl;", "setCookie", "parse$okhttp", "parseAll", "", "headers", "Lokhttp3/Headers;", "parseDomain", "s", "parseExpires", "parseMaxAge", "pathMatch", "path", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        public static final /* synthetic */ boolean access$domainMatch(okhttp3.Cookie.Companion r0, java.lang.String r1, java.lang.String r2) {
                boolean r0 = r0.domainMatch(r1, r2)
                return r0
        }

        public static final /* synthetic */ boolean access$pathMatch(okhttp3.Cookie.Companion r0, okhttp3.HttpUrl r1, java.lang.String r2) {
                boolean r0 = r0.pathMatch(r1, r2)
                return r0
        }

        private final int dateCharacterOffset(java.lang.String r5, int r6, int r7, boolean r8) {
                r4 = this;
            L0:
                if (r6 >= r7) goto L3b
                char r0 = r5.charAt(r6)
                r1 = 32
                r2 = 1
                if (r0 >= r1) goto Lf
                r1 = 9
                if (r0 != r1) goto L32
            Lf:
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 >= r1) goto L32
                r1 = 57
                r3 = 48
                if (r3 > r0) goto L1b
                if (r1 >= r0) goto L32
            L1b:
                r1 = 122(0x7a, float:1.71E-43)
                r3 = 97
                if (r3 > r0) goto L23
                if (r1 >= r0) goto L32
            L23:
                r1 = 90
                r3 = 65
                if (r3 > r0) goto L2b
                if (r1 >= r0) goto L32
            L2b:
                r1 = 58
                if (r0 != r1) goto L30
                goto L32
            L30:
                r0 = 0
                goto L33
            L32:
                r0 = 1
            L33:
                r1 = r8 ^ 1
                if (r0 != r1) goto L38
                return r6
            L38:
                int r6 = r6 + 1
                goto L0
            L3b:
                return r7
        }

        private final boolean domainMatch(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                boolean r0 = kotlin.text.StringsKt.endsWith$default(r3, r4)
                if (r0 == 0) goto L27
                int r0 = r3.length()
                int r4 = r4.length()
                int r0 = r0 - r4
                int r0 = r0 - r1
                char r4 = r3.charAt(r0)
                r0 = 46
                if (r4 != r0) goto L27
                boolean r3 = okhttp3.internal.Util.canParseAsIpAddress(r3)
                if (r3 != 0) goto L27
                goto L28
            L27:
                r1 = 0
            L28:
                return r1
        }

        private final java.lang.String parseDomain(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "."
                boolean r1 = kotlin.text.StringsKt.endsWith$default(r3, r0)
                r1 = r1 ^ 1
                if (r1 == 0) goto L1b
                java.lang.String r3 = kotlin.text.StringsKt.removePrefix(r3, r0)
                java.lang.String r3 = okhttp3.internal.HostnamesKt.toCanonicalHost(r3)
                if (r3 == 0) goto L15
                return r3
            L15:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                r3.<init>()
                throw r3
            L1b:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Failed requirement."
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        private final long parseExpires(java.lang.String r17, int r18, int r19) {
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r19
                r3 = 0
                r4 = r18
                int r4 = r0.dateCharacterOffset(r1, r4, r2, r3)
                java.util.regex.Pattern r5 = okhttp3.Cookie.access$getTIME_PATTERN$cp()
                java.util.regex.Matcher r5 = r5.matcher(r1)
                r6 = -1
                r7 = -1
                r8 = -1
                r9 = -1
                r10 = -1
                r11 = -1
                r12 = -1
            L1c:
                r13 = 2
                r14 = 1
                if (r4 >= r2) goto Le5
                int r15 = r4 + 1
                int r15 = r0.dateCharacterOffset(r1, r15, r2, r14)
                r5.region(r4, r15)
                java.lang.String r4 = "matcher.group(1)"
                if (r8 != r6) goto L63
                java.util.regex.Pattern r3 = okhttp3.Cookie.access$getTIME_PATTERN$cp()
                java.util.regex.Matcher r3 = r5.usePattern(r3)
                boolean r3 = r3.matches()
                if (r3 == 0) goto L63
                java.lang.String r3 = r5.group(r14)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                int r8 = java.lang.Integer.parseInt(r3)
                java.lang.String r3 = r5.group(r13)
                java.lang.String r4 = "matcher.group(2)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                int r11 = java.lang.Integer.parseInt(r3)
                r3 = 3
                java.lang.String r3 = r5.group(r3)
                java.lang.String r4 = "matcher.group(3)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                int r12 = java.lang.Integer.parseInt(r3)
                goto Ldc
            L63:
                if (r9 != r6) goto L7f
                java.util.regex.Pattern r3 = okhttp3.Cookie.access$getDAY_OF_MONTH_PATTERN$cp()
                java.util.regex.Matcher r3 = r5.usePattern(r3)
                boolean r3 = r3.matches()
                if (r3 == 0) goto L7f
                java.lang.String r3 = r5.group(r14)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                int r9 = java.lang.Integer.parseInt(r3)
                goto Ldc
            L7f:
                if (r10 != r6) goto Lc1
                java.util.regex.Pattern r3 = okhttp3.Cookie.access$getMONTH_PATTERN$cp()
                java.util.regex.Matcher r3 = r5.usePattern(r3)
                boolean r3 = r3.matches()
                if (r3 == 0) goto Lc1
                java.lang.String r3 = r5.group(r14)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                java.util.Locale r4 = java.util.Locale.US
                java.lang.String r10 = "Locale.US"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r10)
                java.lang.String r10 = "null cannot be cast to non-null type java.lang.String"
                java.util.Objects.requireNonNull(r3, r10)
                java.lang.String r3 = r3.toLowerCase(r4)
                java.lang.String r4 = "(this as java.lang.String).toLowerCase(locale)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                java.util.regex.Pattern r4 = okhttp3.Cookie.access$getMONTH_PATTERN$cp()
                java.lang.String r4 = r4.pattern()
                java.lang.String r10 = "MONTH_PATTERN.pattern()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r10)
                r10 = 6
                r13 = 0
                int r3 = kotlin.text.StringsKt.indexOf$default(r4, r3, r13, r10)
                int r10 = r3 / 4
                goto Ldc
            Lc1:
                if (r7 != r6) goto Ldc
                java.util.regex.Pattern r3 = okhttp3.Cookie.access$getYEAR_PATTERN$cp()
                java.util.regex.Matcher r3 = r5.usePattern(r3)
                boolean r3 = r3.matches()
                if (r3 == 0) goto Ldc
                java.lang.String r3 = r5.group(r14)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                int r7 = java.lang.Integer.parseInt(r3)
            Ldc:
                int r15 = r15 + 1
                r3 = 0
                int r4 = r0.dateCharacterOffset(r1, r15, r2, r3)
                goto L1c
            Le5:
                r1 = 99
                r2 = 70
                if (r2 <= r7) goto Lec
                goto Lf0
            Lec:
                if (r1 < r7) goto Lf0
                int r7 = r7 + 1900
            Lf0:
                r1 = 69
                if (r7 >= 0) goto Lf5
                goto Lf9
            Lf5:
                if (r1 < r7) goto Lf9
                int r7 = r7 + 2000
            Lf9:
                r1 = 1601(0x641, float:2.243E-42)
                if (r7 < r1) goto Lff
                r1 = 1
                goto L100
            Lff:
                r1 = 0
            L100:
                java.lang.String r2 = "Failed requirement."
                if (r1 == 0) goto L19b
                if (r10 == r6) goto L108
                r1 = 1
                goto L109
            L108:
                r1 = 0
            L109:
                if (r1 == 0) goto L191
                r1 = 31
                if (r14 <= r9) goto L110
                goto L114
            L110:
                if (r1 < r9) goto L114
                r1 = 1
                goto L115
            L114:
                r1 = 0
            L115:
                if (r1 == 0) goto L187
                r1 = 23
                if (r8 >= 0) goto L11c
                goto L120
            L11c:
                if (r1 < r8) goto L120
                r1 = 1
                goto L121
            L120:
                r1 = 0
            L121:
                if (r1 == 0) goto L17d
                r1 = 59
                if (r11 >= 0) goto L128
                goto L12c
            L128:
                if (r1 < r11) goto L12c
                r3 = 1
                goto L12d
            L12c:
                r3 = 0
            L12d:
                if (r3 == 0) goto L173
                if (r12 >= 0) goto L132
                goto L136
            L132:
                if (r1 < r12) goto L136
                r1 = 1
                goto L137
            L136:
                r1 = 0
            L137:
                if (r1 == 0) goto L169
                java.util.GregorianCalendar r1 = new java.util.GregorianCalendar
                java.util.TimeZone r2 = okhttp3.internal.Util.UTC
                r1.<init>(r2)
                r2 = 0
                r1.setLenient(r2)
                r1.set(r14, r7)
                int r10 = r10 - r14
                r1.set(r13, r10)
                r2 = 5
                r1.set(r2, r9)
                r2 = 11
                r1.set(r2, r8)
                r2 = 12
                r1.set(r2, r11)
                r2 = 13
                r1.set(r2, r12)
                r2 = 14
                r3 = 0
                r1.set(r2, r3)
                long r1 = r1.getTimeInMillis()
                return r1
            L169:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L173:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L17d:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L187:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L191:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L19b:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }

        private final long parseMaxAge(java.lang.String r7) {
                r6 = this;
                r0 = -9223372036854775808
                long r2 = java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> Lf
                r4 = 0
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 > 0) goto Ld
                goto Le
            Ld:
                r0 = r2
            Le:
                return r0
            Lf:
                r2 = move-exception
                kotlin.text.Regex r3 = new kotlin.text.Regex
                java.lang.String r4 = "-?\\d+"
                r3.<init>(r4)
                boolean r3 = r3.matches(r7)
                if (r3 == 0) goto L2c
                java.lang.String r2 = "-"
                boolean r7 = kotlin.text.StringsKt.startsWith$default(r7, r2)
                if (r7 == 0) goto L26
                goto L2b
            L26:
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L2b:
                return r0
            L2c:
                throw r2
        }

        private final boolean pathMatch(okhttp3.HttpUrl r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r4 = r4.encodedPath()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
                r1 = 1
                if (r0 == 0) goto Lc
                return r1
            Lc:
                r0 = 0
                boolean r2 = kotlin.text.StringsKt.startsWith$default(r4, r5)
                if (r2 == 0) goto L29
                java.lang.String r2 = "/"
                boolean r2 = kotlin.text.StringsKt.endsWith$default(r5, r2)
                if (r2 == 0) goto L1c
                return r1
            L1c:
                int r5 = r5.length()
                char r4 = r4.charAt(r5)
                r5 = 47
                if (r4 != r5) goto L29
                return r1
            L29:
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.Nullable
        public final okhttp3.Cookie parse(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "setCookie"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                long r0 = java.lang.System.currentTimeMillis()
                okhttp3.Cookie r3 = r2.parse$okhttp(r0, r3, r4)
                return r3
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.Cookie parse$okhttp(long r24, @org.jetbrains.annotations.NotNull okhttp3.HttpUrl r26, @org.jetbrains.annotations.NotNull java.lang.String r27) {
                r23 = this;
                r0 = r23
                r7 = r27
                java.lang.String r1 = "url"
                r8 = r26
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
                java.lang.String r1 = "setCookie"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
                r2 = 59
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                r1 = r27
                int r9 = okhttp3.internal.Util.delimiterOffset$default(r1, r2, r3, r4, r5, r6)
                r2 = 61
                r5 = 2
                r4 = r9
                int r1 = okhttp3.internal.Util.delimiterOffset$default(r1, r2, r3, r4, r5, r6)
                r2 = 0
                if (r1 != r9) goto L2a
                return r2
            L2a:
                r3 = 0
                r4 = 1
                java.lang.String r11 = okhttp3.internal.Util.trimSubstring$default(r7, r3, r1, r4, r2)
                int r5 = r11.length()
                if (r5 != 0) goto L38
                r5 = 1
                goto L39
            L38:
                r5 = 0
            L39:
                if (r5 != 0) goto L16f
                int r5 = okhttp3.internal.Util.indexOfControlOrNonAscii(r11)
                r6 = -1
                if (r5 == r6) goto L44
                goto L16f
            L44:
                int r1 = r1 + r4
                java.lang.String r12 = okhttp3.internal.Util.trimSubstring(r7, r1, r9)
                int r1 = okhttp3.internal.Util.indexOfControlOrNonAscii(r12)
                if (r1 == r6) goto L50
                return r2
            L50:
                int r9 = r9 + r4
                int r1 = r27.length()
                r5 = -1
                r4 = r2
                r10 = r4
                r15 = r5
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 1
                r21 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L67:
                if (r9 >= r1) goto Ld7
                r2 = 59
                int r2 = okhttp3.internal.Util.delimiterOffset(r7, r2, r9, r1)
                r13 = 61
                int r13 = okhttp3.internal.Util.delimiterOffset(r7, r13, r9, r2)
                java.lang.String r9 = okhttp3.internal.Util.trimSubstring(r7, r9, r13)
                if (r13 >= r2) goto L82
                int r13 = r13 + 1
                java.lang.String r13 = okhttp3.internal.Util.trimSubstring(r7, r13, r2)
                goto L84
            L82:
                java.lang.String r13 = ""
            L84:
                java.lang.String r14 = "expires"
                boolean r14 = kotlin.text.StringsKt.equals(r9, r14)
                if (r14 == 0) goto L95
                int r9 = r13.length()     // Catch: java.lang.Throwable -> Ld3
                long r21 = r0.parseExpires(r13, r3, r9)     // Catch: java.lang.Throwable -> Ld3
                goto La1
            L95:
                java.lang.String r14 = "max-age"
                boolean r14 = kotlin.text.StringsKt.equals(r9, r14)
                if (r14 == 0) goto La4
                long r15 = r0.parseMaxAge(r13)
            La1:
                r19 = 1
                goto Ld3
            La4:
                java.lang.String r14 = "domain"
                boolean r14 = kotlin.text.StringsKt.equals(r9, r14)
                if (r14 == 0) goto Lb3
                java.lang.String r4 = r0.parseDomain(r13)     // Catch: java.lang.Throwable -> Ld3
                r20 = 0
                goto Ld3
            Lb3:
                java.lang.String r14 = "path"
                boolean r14 = kotlin.text.StringsKt.equals(r9, r14)
                if (r14 == 0) goto Lbd
                r10 = r13
                goto Ld3
            Lbd:
                java.lang.String r13 = "secure"
                boolean r13 = kotlin.text.StringsKt.equals(r9, r13)
                if (r13 == 0) goto Lc9
                r17 = 1
                goto Ld3
            Lc9:
                java.lang.String r13 = "httponly"
                boolean r9 = kotlin.text.StringsKt.equals(r9, r13)
                if (r9 == 0) goto Ld3
                r18 = 1
            Ld3:
                int r9 = r2 + 1
                r2 = 0
                goto L67
            Ld7:
                r1 = -9223372036854775808
                int r7 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r7 != 0) goto Lde
                goto L106
            Lde:
                int r1 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
                if (r1 == 0) goto L10f
                r1 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r5 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r5 > 0) goto Lf1
                r1 = 1000(0x3e8, float:1.401E-42)
                long r1 = (long) r1
                long r15 = r15 * r1
                goto Lf6
            Lf1:
                r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            Lf6:
                long r1 = r24 + r15
                int r5 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
                if (r5 < 0) goto L108
                r5 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 <= 0) goto L106
                goto L10d
            L106:
                r13 = r1
                goto L111
            L108:
                r5 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L10d:
                r13 = r5
                goto L111
            L10f:
                r13 = r21
            L111:
                java.lang.String r1 = r26.host()
                if (r4 != 0) goto L11a
                r15 = r1
                r2 = 0
                goto L124
            L11a:
                boolean r2 = r0.domainMatch(r1, r4)
                if (r2 != 0) goto L122
                r2 = 0
                return r2
            L122:
                r2 = 0
                r15 = r4
            L124:
                int r1 = r1.length()
                int r4 = r15.length()
                if (r1 == r4) goto L13b
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = r1.get()
                java.lang.String r1 = r1.getEffectiveTldPlusOne(r15)
                if (r1 != 0) goto L13b
                return r2
            L13b:
                java.lang.String r1 = "/"
                if (r10 == 0) goto L149
                boolean r2 = kotlin.text.StringsKt.startsWith$default(r10, r1)
                if (r2 != 0) goto L146
                goto L149
            L146:
                r16 = r10
                goto L166
            L149:
                java.lang.String r2 = r26.encodedPath()
                r4 = 47
                r5 = 6
                int r4 = kotlin.text.StringsKt.lastIndexOf$default(r2, r4, r3, r5)
                if (r4 == 0) goto L164
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                java.util.Objects.requireNonNull(r2, r1)
                java.lang.String r1 = r2.substring(r3, r4)
                java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            L164:
                r16 = r1
            L166:
                okhttp3.Cookie r1 = new okhttp3.Cookie
                r21 = 0
                r10 = r1
                r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20, r21)
                return r1
            L16f:
                r1 = r2
                return r1
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final java.util.List<okhttp3.Cookie> parseAll(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r5, @org.jetbrains.annotations.NotNull okhttp3.Headers r6) {
                r4 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "Set-Cookie"
                java.util.List r6 = r6.values(r0)
                int r0 = r6.size()
                r1 = 0
                r2 = 0
            L17:
                if (r2 >= r0) goto L32
                java.lang.Object r3 = r6.get(r2)
                java.lang.String r3 = (java.lang.String) r3
                okhttp3.Cookie r3 = r4.parse(r5, r3)
                if (r3 == 0) goto L2f
                if (r1 != 0) goto L2c
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
            L2c:
                r1.add(r3)
            L2f:
                int r2 = r2 + 1
                goto L17
            L32:
                if (r1 == 0) goto L3e
                java.util.List r5 = java.util.Collections.unmodifiableList(r1)
                java.lang.String r6 = "Collections.unmodifiableList(cookies)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
                goto L42
            L3e:
                java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            L42:
                return r5
        }
    }

    static {
            okhttp3.Cookie$Companion r0 = new okhttp3.Cookie$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Cookie.Companion = r0
            java.lang.String r0 = "(\\d{2,4})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.Cookie.YEAR_PATTERN = r0
            java.lang.String r0 = "(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.Cookie.MONTH_PATTERN = r0
            java.lang.String r0 = "(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.Cookie.DAY_OF_MONTH_PATTERN = r0
            java.lang.String r0 = "(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.Cookie.TIME_PATTERN = r0
            return
    }

    private Cookie(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, boolean r9, boolean r10) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.value = r2
            r0.expiresAt = r3
            r0.domain = r5
            r0.path = r6
            r0.secure = r7
            r0.httpOnly = r8
            r0.persistent = r9
            r0.hostOnly = r10
            return
    }

    public /* synthetic */ Cookie(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, boolean r9, boolean r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getDAY_OF_MONTH_PATTERN$cp() {
            java.util.regex.Pattern r0 = okhttp3.Cookie.DAY_OF_MONTH_PATTERN
            return r0
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getMONTH_PATTERN$cp() {
            java.util.regex.Pattern r0 = okhttp3.Cookie.MONTH_PATTERN
            return r0
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getTIME_PATTERN$cp() {
            java.util.regex.Pattern r0 = okhttp3.Cookie.TIME_PATTERN
            return r0
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getYEAR_PATTERN$cp() {
            java.util.regex.Pattern r0 = okhttp3.Cookie.YEAR_PATTERN
            return r0
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.Nullable
    public static final okhttp3.Cookie parse(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            okhttp3.Cookie r1 = r0.parse(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<okhttp3.Cookie> parseAll(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r1, @org.jetbrains.annotations.NotNull okhttp3.Headers r2) {
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            java.util.List r1 = r0.parseAll(r1, r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "domain", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_domain")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_domain, reason: not valid java name */
    public final java.lang.String m1909deprecated_domain() {
            r1 = this;
            java.lang.String r0 = r1.domain
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "expiresAt", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_expiresAt")
    /* JADX INFO: renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m1910deprecated_expiresAt() {
            r2 = this;
            long r0 = r2.expiresAt
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hostOnly", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_hostOnly")
    /* JADX INFO: renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m1911deprecated_hostOnly() {
            r1 = this;
            boolean r0 = r1.hostOnly
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "httpOnly", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_httpOnly")
    /* JADX INFO: renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m1912deprecated_httpOnly() {
            r1 = this;
            boolean r0 = r1.httpOnly
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "name", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_name")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_name, reason: not valid java name */
    public final java.lang.String m1913deprecated_name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "path", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_path")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_path, reason: not valid java name */
    public final java.lang.String m1914deprecated_path() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "persistent", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_persistent")
    /* JADX INFO: renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m1915deprecated_persistent() {
            r1 = this;
            boolean r0 = r1.persistent
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "secure", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_secure")
    /* JADX INFO: renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m1916deprecated_secure() {
            r1 = this;
            boolean r0 = r1.secure
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "value", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_value")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_value, reason: not valid java name */
    public final java.lang.String m1917deprecated_value() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    @kotlin.jvm.JvmName(name = "domain")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String domain() {
            r1 = this;
            java.lang.String r0 = r1.domain
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof okhttp3.Cookie
            if (r0 == 0) goto L50
            okhttp3.Cookie r6 = (okhttp3.Cookie) r6
            java.lang.String r0 = r6.name
            java.lang.String r1 = r5.name
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L50
            java.lang.String r0 = r6.value
            java.lang.String r1 = r5.value
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L50
            long r0 = r6.expiresAt
            long r2 = r5.expiresAt
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L50
            java.lang.String r0 = r6.domain
            java.lang.String r1 = r5.domain
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L50
            java.lang.String r0 = r6.path
            java.lang.String r1 = r5.path
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L50
            boolean r0 = r6.secure
            boolean r1 = r5.secure
            if (r0 != r1) goto L50
            boolean r0 = r6.httpOnly
            boolean r1 = r5.httpOnly
            if (r0 != r1) goto L50
            boolean r0 = r6.persistent
            boolean r1 = r5.persistent
            if (r0 != r1) goto L50
            boolean r6 = r6.hostOnly
            boolean r0 = r5.hostOnly
            if (r6 != r0) goto L50
            r6 = 1
            goto L51
        L50:
            r6 = 0
        L51:
            return r6
    }

    @kotlin.jvm.JvmName(name = "expiresAt")
    public final long expiresAt() {
            r2 = this;
            long r0 = r2.expiresAt
            return r0
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.name
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            java.lang.String r1 = r5.value
            int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r2)
            long r1 = r5.expiresAt
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r1 = r5.domain
            r2 = 31
            int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r2)
            java.lang.String r1 = r5.path
            int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r2)
            boolean r1 = r5.secure
            r2 = 1231(0x4cf, float:1.725E-42)
            if (r1 == 0) goto L32
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L34
        L32:
            r1 = 1237(0x4d5, float:1.733E-42)
        L34:
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r5.httpOnly
            if (r1 == 0) goto L3e
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L40
        L3e:
            r1 = 1237(0x4d5, float:1.733E-42)
        L40:
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r5.persistent
            if (r1 == 0) goto L4a
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L4c
        L4a:
            r1 = 1237(0x4d5, float:1.733E-42)
        L4c:
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r5.hostOnly
            if (r1 == 0) goto L54
            goto L56
        L54:
            r2 = 1237(0x4d5, float:1.733E-42)
        L56:
            int r0 = r0 + r2
            return r0
    }

    @kotlin.jvm.JvmName(name = "hostOnly")
    public final boolean hostOnly() {
            r1 = this;
            boolean r0 = r1.hostOnly
            return r0
    }

    @kotlin.jvm.JvmName(name = "httpOnly")
    public final boolean httpOnly() {
            r1 = this;
            boolean r0 = r1.httpOnly
            return r0
    }

    public final boolean matches(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r4) {
            r3 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3.hostOnly
            if (r0 == 0) goto L15
            java.lang.String r0 = r4.host()
            java.lang.String r1 = r3.domain
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            goto L21
        L15:
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            java.lang.String r1 = r4.host()
            java.lang.String r2 = r3.domain
            boolean r0 = okhttp3.Cookie.Companion.access$domainMatch(r0, r1, r2)
        L21:
            r1 = 0
            if (r0 != 0) goto L25
            return r1
        L25:
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            java.lang.String r2 = r3.path
            boolean r0 = okhttp3.Cookie.Companion.access$pathMatch(r0, r4, r2)
            if (r0 != 0) goto L30
            return r1
        L30:
            boolean r0 = r3.secure
            if (r0 == 0) goto L3a
            boolean r4 = r4.isHttps()
            if (r4 == 0) goto L3b
        L3a:
            r1 = 1
        L3b:
            return r1
    }

    @kotlin.jvm.JvmName(name = "name")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @kotlin.jvm.JvmName(name = "path")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String path() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    @kotlin.jvm.JvmName(name = "persistent")
    public final boolean persistent() {
            r1 = this;
            boolean r0 = r1.persistent
            return r0
    }

    @kotlin.jvm.JvmName(name = "secure")
    public final boolean secure() {
            r1 = this;
            boolean r0 = r1.secure
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.toString$okhttp(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String toString$okhttp(boolean r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.name
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.String r1 = r6.value
            r0.append(r1)
            boolean r1 = r6.persistent
            if (r1 == 0) goto L39
            long r1 = r6.expiresAt
            r3 = -9223372036854775808
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L26
            java.lang.String r1 = "; max-age=0"
            r0.append(r1)
            goto L39
        L26:
            java.lang.String r1 = "; expires="
            r0.append(r1)
            java.util.Date r1 = new java.util.Date
            long r2 = r6.expiresAt
            r1.<init>(r2)
            java.lang.String r1 = okhttp3.internal.http.DatesKt.toHttpDateString(r1)
            r0.append(r1)
        L39:
            boolean r1 = r6.hostOnly
            if (r1 != 0) goto L4e
            java.lang.String r1 = "; domain="
            r0.append(r1)
            if (r7 == 0) goto L49
            java.lang.String r7 = "."
            r0.append(r7)
        L49:
            java.lang.String r7 = r6.domain
            r0.append(r7)
        L4e:
            java.lang.String r7 = "; path="
            r0.append(r7)
            java.lang.String r7 = r6.path
            r0.append(r7)
            boolean r7 = r6.secure
            if (r7 == 0) goto L61
            java.lang.String r7 = "; secure"
            r0.append(r7)
        L61:
            boolean r7 = r6.httpOnly
            if (r7 == 0) goto L6a
            java.lang.String r7 = "; httponly"
            r0.append(r7)
        L6a:
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
    }

    @kotlin.jvm.JvmName(name = "value")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String value() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}
